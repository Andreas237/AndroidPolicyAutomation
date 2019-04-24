// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.*;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import o.w;

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
		//    3    3:invokespecial   #49  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(state);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #41  <Field int state>
		//    7   11:invokevirtual   #53  <Method void Parcel.writeInt(int)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (e(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #23  <Method BottomSheetBehavior$SavedState e(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public SavedState e(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class BottomSheetBehavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #26  <Method void BottomSheetBehavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState[] e(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public Object[] newArray(int i)
			{
				return ((Object []) (e(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #31  <Method BottomSheetBehavior$SavedState[] e(int)>
			//    3    5:areturn         
			}

		}
);
		final int state;

		static 
		{
		//    0    0:new             #9   <Class BottomSheetBehavior$SavedState$3>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void BottomSheetBehavior$SavedState$3()>
		//    3    7:invokestatic    #25  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
		//    4   10:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
		//*   5   13:return          
		}

		public SavedState(Parcel parcel)
		{
			this(parcel, ((ClassLoader) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #32  <Method void BottomSheetBehavior$SavedState(Parcel, ClassLoader)>
		//    4    6:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #33  <Method void AbsSavedState(Parcel, ClassLoader)>
			state = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #39  <Method int Parcel.readInt()>
		//    7   11:putfield        #41  <Field int state>
		//    8   14:return          
		}

		public SavedState(Parcelable parcelable, int i)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #45  <Method void AbsSavedState(Parcelable)>
			state = i;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #41  <Field int state>
		//    6   10:return          
		}
	}

	public static interface State
		extends Annotation
	{
	}

	class c
		implements Runnable
	{

		public void run()
		{
			if(c.mViewDragHelper != null && c.mViewDragHelper.continueSettling(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field BottomSheetBehavior c>
		//*   2    4:getfield        #31  <Field ViewDragHelper BottomSheetBehavior.mViewDragHelper>
		//*   3    7:ifnull          33
		//*   4   10:aload_0         
		//*   5   11:getfield        #18  <Field BottomSheetBehavior c>
		//*   6   14:getfield        #31  <Field ViewDragHelper BottomSheetBehavior.mViewDragHelper>
		//*   7   17:iconst_1        
		//*   8   18:invokevirtual   #37  <Method boolean ViewDragHelper.continueSettling(boolean)>
		//*   9   21:ifeq            33
			{
				ViewCompat.postOnAnimation(e, ((Runnable) (this)));
		//   10   24:aload_0         
		//   11   25:getfield        #23  <Field View e>
		//   12   28:aload_0         
		//   13   29:invokestatic    #43  <Method void ViewCompat.postOnAnimation(View, Runnable)>
				return;
		//   14   32:return          
			} else
			{
				c.setStateInternal(d);
		//   15   33:aload_0         
		//   16   34:getfield        #18  <Field BottomSheetBehavior c>
		//   17   37:aload_0         
		//   18   38:getfield        #25  <Field int d>
		//   19   41:invokevirtual   #47  <Method void BottomSheetBehavior.setStateInternal(int)>
				return;
		//   20   44:return          
			}
		}

		final BottomSheetBehavior c;
		private final int d;
		private final View e;

		c(View view, int i)
		{
			c = BottomSheetBehavior.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field BottomSheetBehavior c>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			e = view;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field View e>
			d = i;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #25  <Field int d>
		//   11   19:return          
		}
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
				int k = e.mMinOffset;
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field BottomSheetBehavior e>
			//    2    4:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
			//    3    7:istore          4
				if(e.mHideable)
			//*   4    9:aload_0         
			//*   5   10:getfield        #12  <Field BottomSheetBehavior e>
			//*   6   13:getfield        #33  <Field boolean BottomSheetBehavior.mHideable>
			//*   7   16:ifeq            30
					j = e.mParentHeight;
			//    8   19:aload_0         
			//    9   20:getfield        #12  <Field BottomSheetBehavior e>
			//   10   23:getfield        #36  <Field int BottomSheetBehavior.mParentHeight>
			//   11   26:istore_3        
				else
			//*  12   27:goto            38
					j = e.mMaxOffset;
			//   13   30:aload_0         
			//   14   31:getfield        #12  <Field BottomSheetBehavior e>
			//   15   34:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
			//   16   37:istore_3        
				return w.b(i, k, j);
			//   17   38:iload_2         
			//   18   39:iload           4
			//   19   41:iload_3         
			//   20   42:invokestatic    #45  <Method int w.b(int, int, int)>
			//   21   45:ireturn         
			}

			public int getViewVerticalDragRange(View view)
			{
				if(e.mHideable)
			//*   0    0:aload_0         
			//*   1    1:getfield        #12  <Field BottomSheetBehavior e>
			//*   2    4:getfield        #33  <Field boolean BottomSheetBehavior.mHideable>
			//*   3    7:ifeq            26
					return e.mParentHeight - e.mMinOffset;
			//    4   10:aload_0         
			//    5   11:getfield        #12  <Field BottomSheetBehavior e>
			//    6   14:getfield        #36  <Field int BottomSheetBehavior.mParentHeight>
			//    7   17:aload_0         
			//    8   18:getfield        #12  <Field BottomSheetBehavior e>
			//    9   21:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
			//   10   24:isub            
			//   11   25:ireturn         
				else
					return e.mMaxOffset - e.mMinOffset;
			//   12   26:aload_0         
			//   13   27:getfield        #12  <Field BottomSheetBehavior e>
			//   14   30:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
			//   15   33:aload_0         
			//   16   34:getfield        #12  <Field BottomSheetBehavior e>
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
					e.setStateInternal(1);
			//    3    5:aload_0         
			//    4    6:getfield        #12  <Field BottomSheetBehavior e>
			//    5    9:iconst_1        
			//    6   10:invokevirtual   #52  <Method void BottomSheetBehavior.setStateInternal(int)>
			//    7   13:return          
			}

			public void onViewPositionChanged(View view, int i, int j, int k, int l)
			{
				e.dispatchOnSlide(j);
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field BottomSheetBehavior e>
			//    2    4:iload_3         
			//    3    5:invokevirtual   #57  <Method void BottomSheetBehavior.dispatchOnSlide(int)>
			//    4    8:return          
			}

			public void onViewReleased(View view, float f, float f1)
			{
				int i;
				byte byte0;
				if(f1 < 0.0F)
			//*   0    0:fload_3         
			//*   1    1:fconst_0        
			//*   2    2:fcmpg           
			//*   3    3:ifge            21
				{
					i = e.mMinOffset;
			//    4    6:aload_0         
			//    5    7:getfield        #12  <Field BottomSheetBehavior e>
			//    6   10:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
			//    7   13:istore          4
					byte0 = 3;
			//    8   15:iconst_3        
			//    9   16:istore          5
				} else
			//*  10   18:goto            141
				if(e.mHideable && e.shouldHide(view, f1))
			//*  11   21:aload_0         
			//*  12   22:getfield        #12  <Field BottomSheetBehavior e>
			//*  13   25:getfield        #33  <Field boolean BottomSheetBehavior.mHideable>
			//*  14   28:ifeq            58
			//*  15   31:aload_0         
			//*  16   32:getfield        #12  <Field BottomSheetBehavior e>
			//*  17   35:aload_1         
			//*  18   36:fload_3         
			//*  19   37:invokevirtual   #63  <Method boolean BottomSheetBehavior.shouldHide(View, float)>
			//*  20   40:ifeq            58
				{
					i = e.mParentHeight;
			//   21   43:aload_0         
			//   22   44:getfield        #12  <Field BottomSheetBehavior e>
			//   23   47:getfield        #36  <Field int BottomSheetBehavior.mParentHeight>
			//   24   50:istore          4
					byte0 = 5;
			//   25   52:iconst_5        
			//   26   53:istore          5
				} else
			//*  27   55:goto            141
				if(f1 == 0.0F)
			//*  28   58:fload_3         
			//*  29   59:fconst_0        
			//*  30   60:fcmpl           
			//*  31   61:ifne            129
				{
					i = view.getTop();
			//   32   64:aload_1         
			//   33   65:invokevirtual   #66  <Method int View.getTop()>
			//   34   68:istore          4
					if(Math.abs(i - e.mMinOffset) < Math.abs(i - e.mMaxOffset))
			//*  35   70:iload           4
			//*  36   72:aload_0         
			//*  37   73:getfield        #12  <Field BottomSheetBehavior e>
			//*  38   76:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
			//*  39   79:isub            
			//*  40   80:invokestatic    #72  <Method int Math.abs(int)>
			//*  41   83:iload           4
			//*  42   85:aload_0         
			//*  43   86:getfield        #12  <Field BottomSheetBehavior e>
			//*  44   89:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
			//*  45   92:isub            
			//*  46   93:invokestatic    #72  <Method int Math.abs(int)>
			//*  47   96:icmpge          114
					{
						i = e.mMinOffset;
			//   48   99:aload_0         
			//   49  100:getfield        #12  <Field BottomSheetBehavior e>
			//   50  103:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
			//   51  106:istore          4
						byte0 = 3;
			//   52  108:iconst_3        
			//   53  109:istore          5
					} else
			//*  54  111:goto            126
					{
						i = e.mMaxOffset;
			//   55  114:aload_0         
			//   56  115:getfield        #12  <Field BottomSheetBehavior e>
			//   57  118:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
			//   58  121:istore          4
						byte0 = 4;
			//   59  123:iconst_4        
			//   60  124:istore          5
					}
				} else
			//*  61  126:goto            141
				{
					i = e.mMaxOffset;
			//   62  129:aload_0         
			//   63  130:getfield        #12  <Field BottomSheetBehavior e>
			//   64  133:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
			//   65  136:istore          4
					byte0 = 4;
			//   66  138:iconst_4        
			//   67  139:istore          5
				}
				if(e.mViewDragHelper.settleCapturedViewAt(view.getLeft(), i))
			//*  68  141:aload_0         
			//*  69  142:getfield        #12  <Field BottomSheetBehavior e>
			//*  70  145:getfield        #76  <Field ViewDragHelper BottomSheetBehavior.mViewDragHelper>
			//*  71  148:aload_1         
			//*  72  149:invokevirtual   #24  <Method int View.getLeft()>
			//*  73  152:iload           4
			//*  74  154:invokevirtual   #82  <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
			//*  75  157:ifeq            187
				{
					e.setStateInternal(2);
			//   76  160:aload_0         
			//   77  161:getfield        #12  <Field BottomSheetBehavior e>
			//   78  164:iconst_2        
			//   79  165:invokevirtual   #52  <Method void BottomSheetBehavior.setStateInternal(int)>
					ViewCompat.postOnAnimation(view, ((Runnable) (((c) (e)). new c(view, ((int) (byte0))))));
			//   80  168:aload_1         
			//   81  169:new             #84  <Class BottomSheetBehavior$c>
			//   82  172:dup             
			//   83  173:aload_0         
			//   84  174:getfield        #12  <Field BottomSheetBehavior e>
			//   85  177:aload_1         
			//   86  178:iload           5
			//   87  180:invokespecial   #87  <Method void BottomSheetBehavior$c(BottomSheetBehavior, View, int)>
			//   88  183:invokestatic    #93  <Method void ViewCompat.postOnAnimation(View, Runnable)>
					return;
			//   89  186:return          
				} else
				{
					e.setStateInternal(((int) (byte0)));
			//   90  187:aload_0         
			//   91  188:getfield        #12  <Field BottomSheetBehavior e>
			//   92  191:iload           5
			//   93  193:invokevirtual   #52  <Method void BottomSheetBehavior.setStateInternal(int)>
					return;
			//   94  196:return          
				}
			}

			public boolean tryCaptureView(View view, int i)
			{
				if(e.mState == 1)
			//*   0    0:aload_0         
			//*   1    1:getfield        #12  <Field BottomSheetBehavior e>
			//*   2    4:getfield        #98  <Field int BottomSheetBehavior.mState>
			//*   3    7:iconst_1        
			//*   4    8:icmpne          13
					return false;
			//    5   11:iconst_0        
			//    6   12:ireturn         
				if(e.mTouchingScrollingChild)
			//*   7   13:aload_0         
			//*   8   14:getfield        #12  <Field BottomSheetBehavior e>
			//*   9   17:getfield        #101 <Field boolean BottomSheetBehavior.mTouchingScrollingChild>
			//*  10   20:ifeq            25
					return false;
			//   11   23:iconst_0        
			//   12   24:ireturn         
				if(e.mState == 3 && e.mActivePointerId == i)
			//*  13   25:aload_0         
			//*  14   26:getfield        #12  <Field BottomSheetBehavior e>
			//*  15   29:getfield        #98  <Field int BottomSheetBehavior.mState>
			//*  16   32:iconst_3        
			//*  17   33:icmpne          75
			//*  18   36:aload_0         
			//*  19   37:getfield        #12  <Field BottomSheetBehavior e>
			//*  20   40:getfield        #104 <Field int BottomSheetBehavior.mActivePointerId>
			//*  21   43:iload_2         
			//*  22   44:icmpne          75
				{
					View view1 = (View)e.mNestedScrollingChildRef.get();
			//   23   47:aload_0         
			//   24   48:getfield        #12  <Field BottomSheetBehavior e>
			//   25   51:getfield        #108 <Field WeakReference BottomSheetBehavior.mNestedScrollingChildRef>
			//   26   54:invokevirtual   #114 <Method Object WeakReference.get()>
			//   27   57:checkcast       #20  <Class View>
			//   28   60:astore_3        
					if(view1 != null && ViewCompat.canScrollVertically(view1, -1))
			//*  29   61:aload_3         
			//*  30   62:ifnull          75
			//*  31   65:aload_3         
			//*  32   66:iconst_m1       
			//*  33   67:invokestatic    #117 <Method boolean ViewCompat.canScrollVertically(View, int)>
			//*  34   70:ifeq            75
						return false;
			//   35   73:iconst_0        
			//   36   74:ireturn         
				}
				return e.mViewRef != null && e.mViewRef.get() == view;
			//   37   75:aload_0         
			//   38   76:getfield        #12  <Field BottomSheetBehavior e>
			//   39   79:getfield        #120 <Field WeakReference BottomSheetBehavior.mViewRef>
			//   40   82:ifnull          101
			//   41   85:aload_0         
			//   42   86:getfield        #12  <Field BottomSheetBehavior e>
			//   43   89:getfield        #120 <Field WeakReference BottomSheetBehavior.mViewRef>
			//   44   92:invokevirtual   #114 <Method Object WeakReference.get()>
			//   45   95:aload_1         
			//   46   96:if_acmpne       101
			//   47   99:iconst_1        
			//   48  100:ireturn         
			//   49  101:iconst_0        
			//   50  102:ireturn         
			}

			final BottomSheetBehavior e;

			
			{
				e = BottomSheetBehavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field BottomSheetBehavior e>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void android.support.v4.widget.ViewDragHelper$Callback()>
			//    5    9:return          
			}
		}
));
	//    5    9:aload_0         
	//    6   10:new             #7   <Class BottomSheetBehavior$2>
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
	//    8   12:new             #7   <Class BottomSheetBehavior$2>
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
		if(!view.isShown())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #256 <Method boolean View.isShown()>
	//*   2    4:ifne            14
		{
			mIgnoreEvents = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #258 <Field boolean mIgnoreEvents>
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		}
		int i = motionevent.getActionMasked();
	//    8   14:aload_3         
	//    9   15:invokevirtual   #263 <Method int MotionEvent.getActionMasked()>
	//   10   18:istore          4
		if(i == 0)
	//*  11   20:iload           4
	//*  12   22:ifne            29
			reset();
	//   13   25:aload_0         
	//   14   26:invokespecial   #265 <Method void reset()>
		if(mVelocityTracker == null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//*  17   33:ifnonnull       43
			mVelocityTracker = VelocityTracker.obtain();
	//   18   36:aload_0         
	//   19   37:invokestatic    #269 <Method VelocityTracker VelocityTracker.obtain()>
	//   20   40:putfield        #181 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//   21   43:aload_0         
	//   22   44:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//   23   47:aload_3         
	//   24   48:invokevirtual   #273 <Method void VelocityTracker.addMovement(MotionEvent)>
		switch(i)
	//*  25   51:iload           4
		{
	//*  26   53:tableswitch     0 3: default 84
	//	               0 111
	//	               1 87
	//	               2 226
	//	               3 87
	//*  27   84:goto            226
		case 1: // '\001'
		case 3: // '\003'
			mTouchingScrollingChild = false;
	//   28   87:aload_0         
	//   29   88:iconst_0        
	//   30   89:putfield        #275 <Field boolean mTouchingScrollingChild>
			mActivePointerId = -1;
	//   31   92:aload_0         
	//   32   93:iconst_m1       
	//   33   94:putfield        #189 <Field int mActivePointerId>
			if(mIgnoreEvents)
	//*  34   97:aload_0         
	//*  35   98:getfield        #258 <Field boolean mIgnoreEvents>
	//*  36  101:ifeq            226
			{
				mIgnoreEvents = false;
	//   37  104:aload_0         
	//   38  105:iconst_0        
	//   39  106:putfield        #258 <Field boolean mIgnoreEvents>
				return false;
	//   40  109:iconst_0        
	//   41  110:ireturn         
			}
			break;

		case 0: // '\0'
			int j = (int)motionevent.getX();
	//   42  111:aload_3         
	//   43  112:invokevirtual   #278 <Method float MotionEvent.getX()>
	//   44  115:f2i             
	//   45  116:istore          5
			mInitialY = (int)motionevent.getY();
	//   46  118:aload_0         
	//   47  119:aload_3         
	//   48  120:invokevirtual   #281 <Method float MotionEvent.getY()>
	//   49  123:f2i             
	//   50  124:putfield        #283 <Field int mInitialY>
			View view1;
			if(mNestedScrollingChildRef != null)
	//*  51  127:aload_0         
	//*  52  128:getfield        #285 <Field WeakReference mNestedScrollingChildRef>
	//*  53  131:ifnull          149
				view1 = (View)mNestedScrollingChildRef.get();
	//   54  134:aload_0         
	//   55  135:getfield        #285 <Field WeakReference mNestedScrollingChildRef>
	//   56  138:invokevirtual   #202 <Method Object WeakReference.get()>
	//   57  141:checkcast       #156 <Class View>
	//   58  144:astore          7
			else
	//*  59  146:goto            152
				view1 = null;
	//   60  149:aconst_null     
	//   61  150:astore          7
			if(view1 != null && coordinatorlayout.isPointInChildBounds(view1, j, mInitialY))
	//*  62  152:aload           7
	//*  63  154:ifnull          189
	//*  64  157:aload_1         
	//*  65  158:aload           7
	//*  66  160:iload           5
	//*  67  162:aload_0         
	//*  68  163:getfield        #283 <Field int mInitialY>
	//*  69  166:invokevirtual   #291 <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//*  70  169:ifeq            189
			{
				mActivePointerId = motionevent.getPointerId(motionevent.getActionIndex());
	//   71  172:aload_0         
	//   72  173:aload_3         
	//   73  174:aload_3         
	//   74  175:invokevirtual   #294 <Method int MotionEvent.getActionIndex()>
	//   75  178:invokevirtual   #298 <Method int MotionEvent.getPointerId(int)>
	//   76  181:putfield        #189 <Field int mActivePointerId>
				mTouchingScrollingChild = true;
	//   77  184:aload_0         
	//   78  185:iconst_1        
	//   79  186:putfield        #275 <Field boolean mTouchingScrollingChild>
			}
			boolean flag;
			if(mActivePointerId == -1 && !coordinatorlayout.isPointInChildBounds(view, j, mInitialY))
	//*  80  189:aload_0         
	//*  81  190:getfield        #189 <Field int mActivePointerId>
	//*  82  193:iconst_m1       
	//*  83  194:icmpne          217
	//*  84  197:aload_1         
	//*  85  198:aload_2         
	//*  86  199:iload           5
	//*  87  201:aload_0         
	//*  88  202:getfield        #283 <Field int mInitialY>
	//*  89  205:invokevirtual   #291 <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//*  90  208:ifne            217
				flag = true;
	//   91  211:iconst_1        
	//   92  212:istore          6
			else
	//*  93  214:goto            220
				flag = false;
	//   94  217:iconst_0        
	//   95  218:istore          6
			mIgnoreEvents = flag;
	//   96  220:aload_0         
	//   97  221:iload           6
	//   98  223:putfield        #258 <Field boolean mIgnoreEvents>
			break;
		}
		if(!mIgnoreEvents && mViewDragHelper.shouldInterceptTouchEvent(motionevent))
	//*  99  226:aload_0         
	//* 100  227:getfield        #258 <Field boolean mIgnoreEvents>
	//* 101  230:ifne            246
	//* 102  233:aload_0         
	//* 103  234:getfield        #300 <Field ViewDragHelper mViewDragHelper>
	//* 104  237:aload_3         
	//* 105  238:invokevirtual   #306 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
	//* 106  241:ifeq            246
			return true;
	//  107  244:iconst_1        
	//  108  245:ireturn         
		view = (View)mNestedScrollingChildRef.get();
	//  109  246:aload_0         
	//  110  247:getfield        #285 <Field WeakReference mNestedScrollingChildRef>
	//  111  250:invokevirtual   #202 <Method Object WeakReference.get()>
	//  112  253:checkcast       #156 <Class View>
	//  113  256:astore_2        
		return i == 2 && view != null && !mIgnoreEvents && mState != 1 && !coordinatorlayout.isPointInChildBounds(view, (int)motionevent.getX(), (int)motionevent.getY()) && Math.abs((float)mInitialY - motionevent.getY()) > (float)mViewDragHelper.getTouchSlop();
	//  114  257:iload           4
	//  115  259:iconst_2        
	//  116  260:icmpne          327
	//  117  263:aload_2         
	//  118  264:ifnull          327
	//  119  267:aload_0         
	//  120  268:getfield        #258 <Field boolean mIgnoreEvents>
	//  121  271:ifne            327
	//  122  274:aload_0         
	//  123  275:getfield        #77  <Field int mState>
	//  124  278:iconst_1        
	//  125  279:icmpeq          327
	//  126  282:aload_1         
	//  127  283:aload_2         
	//  128  284:aload_3         
	//  129  285:invokevirtual   #278 <Method float MotionEvent.getX()>
	//  130  288:f2i             
	//  131  289:aload_3         
	//  132  290:invokevirtual   #281 <Method float MotionEvent.getY()>
	//  133  293:f2i             
	//  134  294:invokevirtual   #291 <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//  135  297:ifne            327
	//  136  300:aload_0         
	//  137  301:getfield        #283 <Field int mInitialY>
	//  138  304:i2f             
	//  139  305:aload_3         
	//  140  306:invokevirtual   #281 <Method float MotionEvent.getY()>
	//  141  309:fsub            
	//  142  310:invokestatic    #312 <Method float Math.abs(float)>
	//  143  313:aload_0         
	//  144  314:getfield        #300 <Field ViewDragHelper mViewDragHelper>
	//  145  317:invokevirtual   #315 <Method int ViewDragHelper.getTouchSlop()>
	//  146  320:i2f             
	//  147  321:fcmpl           
	//  148  322:ifle            327
	//  149  325:iconst_1        
	//  150  326:ireturn         
	//  151  327:iconst_0        
	//  152  328:ireturn         
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
	//  133  267:putfield        #285 <Field WeakReference mNestedScrollingChildRef>
		return true;
	//  134  270:iconst_1        
	//  135  271:ireturn         
	}

	public boolean onNestedPreFling(CoordinatorLayout coordinatorlayout, View view, View view1, float f, float f1)
	{
		return view1 == mNestedScrollingChildRef.get() && (mState != 3 || super.onNestedPreFling(coordinatorlayout, view, view1, f, f1));
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:getfield        #285 <Field WeakReference mNestedScrollingChildRef>
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
	//*   2    2:getfield        #285 <Field WeakReference mNestedScrollingChildRef>
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
	//*  36   67:goto            166
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
	//*  48   88:goto            166
		if(j < 0 && !ViewCompat.canScrollVertically(view1, -1))
	//*  49   91:iload           5
	//*  50   93:ifge            166
	//*  51   96:aload_3         
	//*  52   97:iconst_m1       
	//*  53   98:invokestatic    #379 <Method boolean ViewCompat.canScrollVertically(View, int)>
	//*  54  101:ifne            166
			if(k <= mMaxOffset || mHideable)
	//*  55  104:iload           7
	//*  56  106:aload_0         
	//*  57  107:getfield        #206 <Field int mMaxOffset>
	//*  58  110:icmple          120
	//*  59  113:aload_0         
	//*  60  114:getfield        #251 <Field boolean mHideable>
	//*  61  117:ifeq            141
			{
				ai[1] = j;
	//   62  120:aload           6
	//   63  122:iconst_1        
	//   64  123:iload           5
	//   65  125:iastore         
				ViewCompat.offsetTopAndBottom(view, -j);
	//   66  126:aload_2         
	//   67  127:iload           5
	//   68  129:ineg            
	//   69  130:invokestatic    #357 <Method void ViewCompat.offsetTopAndBottom(View, int)>
				setStateInternal(1);
	//   70  133:aload_0         
	//   71  134:iconst_1        
	//   72  135:invokevirtual   #375 <Method void setStateInternal(int)>
			} else
	//*  73  138:goto            166
			{
				ai[1] = i - mMaxOffset;
	//   74  141:aload           6
	//   75  143:iconst_1        
	//   76  144:iload           4
	//   77  146:aload_0         
	//   78  147:getfield        #206 <Field int mMaxOffset>
	//   79  150:isub            
	//   80  151:iastore         
				ViewCompat.offsetTopAndBottom(view, -ai[1]);
	//   81  152:aload_2         
	//   82  153:aload           6
	//   83  155:iconst_1        
	//   84  156:iaload          
	//   85  157:ineg            
	//   86  158:invokestatic    #357 <Method void ViewCompat.offsetTopAndBottom(View, int)>
				setStateInternal(4);
	//   87  161:aload_0         
	//   88  162:iconst_4        
	//   89  163:invokevirtual   #375 <Method void setStateInternal(int)>
			}
		dispatchOnSlide(view.getTop());
	//   90  166:aload_0         
	//   91  167:aload_2         
	//   92  168:invokevirtual   #328 <Method int View.getTop()>
	//   93  171:invokevirtual   #381 <Method void dispatchOnSlide(int)>
		mLastNestedScrollDy = j;
	//   94  174:aload_0         
	//   95  175:iload           5
	//   96  177:putfield        #383 <Field int mLastNestedScrollDy>
		mNestedScrolled = true;
	//   97  180:aload_0         
	//   98  181:iconst_1        
	//   99  182:putfield        #385 <Field boolean mNestedScrolled>
	//  100  185:return          
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
		mLastNestedScrollDy = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #383 <Field int mLastNestedScrollDy>
		mNestedScrolled = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #385 <Field boolean mNestedScrolled>
		return (i & 2) != 0;
	//    6   10:iload           5
	//    7   12:iconst_2        
	//    8   13:iand            
	//    9   14:ifeq            19
	//   10   17:iconst_1        
	//   11   18:ireturn         
	//   12   19:iconst_0        
	//   13   20:ireturn         
	}

	public void onStopNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		if(view.getTop() == mMinOffset)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #328 <Method int View.getTop()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #214 <Field int mMinOffset>
	//*   4    8:icmpne          17
		{
			setStateInternal(3);
	//    5   11:aload_0         
	//    6   12:iconst_3        
	//    7   13:invokevirtual   #375 <Method void setStateInternal(int)>
			return;
	//    8   16:return          
		}
		if(view1 != mNestedScrollingChildRef.get() || !mNestedScrolled)
	//*   9   17:aload_3         
	//*  10   18:aload_0         
	//*  11   19:getfield        #285 <Field WeakReference mNestedScrollingChildRef>
	//*  12   22:invokevirtual   #202 <Method Object WeakReference.get()>
	//*  13   25:if_acmpne       35
	//*  14   28:aload_0         
	//*  15   29:getfield        #385 <Field boolean mNestedScrolled>
	//*  16   32:ifne            36
			return;
	//   17   35:return          
		int i;
		byte byte0;
		if(mLastNestedScrollDy > 0)
	//*  18   36:aload_0         
	//*  19   37:getfield        #383 <Field int mLastNestedScrollDy>
	//*  20   40:ifle            55
		{
			i = mMinOffset;
	//   21   43:aload_0         
	//   22   44:getfield        #214 <Field int mMinOffset>
	//   23   47:istore          4
			byte0 = 3;
	//   24   49:iconst_3        
	//   25   50:istore          5
		} else
	//*  26   52:goto            155
		if(mHideable && shouldHide(view, getYVelocity()))
	//*  27   55:aload_0         
	//*  28   56:getfield        #251 <Field boolean mHideable>
	//*  29   59:ifeq            86
	//*  30   62:aload_0         
	//*  31   63:aload_2         
	//*  32   64:aload_0         
	//*  33   65:invokespecial   #413 <Method float getYVelocity()>
	//*  34   68:invokevirtual   #417 <Method boolean shouldHide(View, float)>
	//*  35   71:ifeq            86
		{
			i = mParentHeight;
	//   36   74:aload_0         
	//   37   75:getfield        #208 <Field int mParentHeight>
	//   38   78:istore          4
			byte0 = 5;
	//   39   80:iconst_5        
	//   40   81:istore          5
		} else
	//*  41   83:goto            155
		if(mLastNestedScrollDy == 0)
	//*  42   86:aload_0         
	//*  43   87:getfield        #383 <Field int mLastNestedScrollDy>
	//*  44   90:ifne            146
		{
			i = view.getTop();
	//   45   93:aload_2         
	//   46   94:invokevirtual   #328 <Method int View.getTop()>
	//   47   97:istore          4
			if(Math.abs(i - mMinOffset) < Math.abs(i - mMaxOffset))
	//*  48   99:iload           4
	//*  49  101:aload_0         
	//*  50  102:getfield        #214 <Field int mMinOffset>
	//*  51  105:isub            
	//*  52  106:invokestatic    #419 <Method int Math.abs(int)>
	//*  53  109:iload           4
	//*  54  111:aload_0         
	//*  55  112:getfield        #206 <Field int mMaxOffset>
	//*  56  115:isub            
	//*  57  116:invokestatic    #419 <Method int Math.abs(int)>
	//*  58  119:icmpge          134
			{
				i = mMinOffset;
	//   59  122:aload_0         
	//   60  123:getfield        #214 <Field int mMinOffset>
	//   61  126:istore          4
				byte0 = 3;
	//   62  128:iconst_3        
	//   63  129:istore          5
			} else
	//*  64  131:goto            143
			{
				i = mMaxOffset;
	//   65  134:aload_0         
	//   66  135:getfield        #206 <Field int mMaxOffset>
	//   67  138:istore          4
				byte0 = 4;
	//   68  140:iconst_4        
	//   69  141:istore          5
			}
		} else
	//*  70  143:goto            155
		{
			i = mMaxOffset;
	//   71  146:aload_0         
	//   72  147:getfield        #206 <Field int mMaxOffset>
	//   73  150:istore          4
			byte0 = 4;
	//   74  152:iconst_4        
	//   75  153:istore          5
		}
		if(mViewDragHelper.smoothSlideViewTo(view, view.getLeft(), i))
	//*  76  155:aload_0         
	//*  77  156:getfield        #300 <Field ViewDragHelper mViewDragHelper>
	//*  78  159:aload_2         
	//*  79  160:aload_2         
	//*  80  161:invokevirtual   #422 <Method int View.getLeft()>
	//*  81  164:iload           4
	//*  82  166:invokevirtual   #425 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//*  83  169:ifeq            195
		{
			setStateInternal(2);
	//   84  172:aload_0         
	//   85  173:iconst_2        
	//   86  174:invokevirtual   #375 <Method void setStateInternal(int)>
			ViewCompat.postOnAnimation(view, ((Runnable) (new c(view, ((int) (byte0))))));
	//   87  177:aload_2         
	//   88  178:new             #22  <Class BottomSheetBehavior$c>
	//   89  181:dup             
	//   90  182:aload_0         
	//   91  183:aload_2         
	//   92  184:iload           5
	//   93  186:invokespecial   #428 <Method void BottomSheetBehavior$c(BottomSheetBehavior, View, int)>
	//   94  189:invokestatic    #432 <Method void ViewCompat.postOnAnimation(View, Runnable)>
		} else
	//*  95  192:goto            201
		{
			setStateInternal(((int) (byte0)));
	//   96  195:aload_0         
	//   97  196:iload           5
	//   98  198:invokevirtual   #375 <Method void setStateInternal(int)>
		}
		mNestedScrolled = false;
	//   99  201:aload_0         
	//  100  202:iconst_0        
	//  101  203:putfield        #385 <Field boolean mNestedScrolled>
	//  102  206:return          
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
		mViewDragHelper.processTouchEvent(motionevent);
	//   16   30:aload_0         
	//   17   31:getfield        #300 <Field ViewDragHelper mViewDragHelper>
	//   18   34:aload_3         
	//   19   35:invokevirtual   #437 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
		if(i == 0)
	//*  20   38:iload           4
	//*  21   40:ifne            47
			reset();
	//   22   43:aload_0         
	//   23   44:invokespecial   #265 <Method void reset()>
		if(mVelocityTracker == null)
	//*  24   47:aload_0         
	//*  25   48:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//*  26   51:ifnonnull       61
			mVelocityTracker = VelocityTracker.obtain();
	//   27   54:aload_0         
	//   28   55:invokestatic    #269 <Method VelocityTracker VelocityTracker.obtain()>
	//   29   58:putfield        #181 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//   30   61:aload_0         
	//   31   62:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//   32   65:aload_3         
	//   33   66:invokevirtual   #273 <Method void VelocityTracker.addMovement(MotionEvent)>
		if(i == 2 && !mIgnoreEvents && Math.abs((float)mInitialY - motionevent.getY()) > (float)mViewDragHelper.getTouchSlop())
	//*  34   69:iload           4
	//*  35   71:iconst_2        
	//*  36   72:icmpne          123
	//*  37   75:aload_0         
	//*  38   76:getfield        #258 <Field boolean mIgnoreEvents>
	//*  39   79:ifne            123
	//*  40   82:aload_0         
	//*  41   83:getfield        #283 <Field int mInitialY>
	//*  42   86:i2f             
	//*  43   87:aload_3         
	//*  44   88:invokevirtual   #281 <Method float MotionEvent.getY()>
	//*  45   91:fsub            
	//*  46   92:invokestatic    #312 <Method float Math.abs(float)>
	//*  47   95:aload_0         
	//*  48   96:getfield        #300 <Field ViewDragHelper mViewDragHelper>
	//*  49   99:invokevirtual   #315 <Method int ViewDragHelper.getTouchSlop()>
	//*  50  102:i2f             
	//*  51  103:fcmpl           
	//*  52  104:ifle            123
			mViewDragHelper.captureChildView(view, motionevent.getPointerId(motionevent.getActionIndex()));
	//   53  107:aload_0         
	//   54  108:getfield        #300 <Field ViewDragHelper mViewDragHelper>
	//   55  111:aload_2         
	//   56  112:aload_3         
	//   57  113:aload_3         
	//   58  114:invokevirtual   #294 <Method int MotionEvent.getActionIndex()>
	//   59  117:invokevirtual   #298 <Method int MotionEvent.getPointerId(int)>
	//   60  120:invokevirtual   #440 <Method void ViewDragHelper.captureChildView(View, int)>
		return !mIgnoreEvents;
	//   61  123:aload_0         
	//   62  124:getfield        #258 <Field boolean mIgnoreEvents>
	//   63  127:ifne            132
	//   64  130:iconst_1        
	//   65  131:ireturn         
	//   66  132:iconst_0        
	//   67  133:ireturn         
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
		if(i == -1)
	//*   2    2:iload_1         
	//*   3    3:iconst_m1       
	//*   4    4:icmpne          24
		{
			if(!mPeekHeightAuto)
	//*   5    7:aload_0         
	//*   6    8:getfield        #238 <Field boolean mPeekHeightAuto>
	//*   7   11:ifne            65
			{
				mPeekHeightAuto = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #238 <Field boolean mPeekHeightAuto>
				flag = true;
	//   11   19:iconst_1        
	//   12   20:istore_2        
			}
		} else
	//*  13   21:goto            65
		if(mPeekHeightAuto || mPeekHeight != i)
	//*  14   24:aload_0         
	//*  15   25:getfield        #238 <Field boolean mPeekHeightAuto>
	//*  16   28:ifne            39
	//*  17   31:aload_0         
	//*  18   32:getfield        #240 <Field int mPeekHeight>
	//*  19   35:iload_1         
	//*  20   36:icmpeq          65
		{
			mPeekHeightAuto = false;
	//   21   39:aload_0         
	//   22   40:iconst_0        
	//   23   41:putfield        #238 <Field boolean mPeekHeightAuto>
			mPeekHeight = Math.max(0, i);
	//   24   44:aload_0         
	//   25   45:iconst_0        
	//   26   46:iload_1         
	//   27   47:invokestatic    #353 <Method int Math.max(int, int)>
	//   28   50:putfield        #240 <Field int mPeekHeight>
			mMaxOffset = mParentHeight - i;
	//   29   53:aload_0         
	//   30   54:aload_0         
	//   31   55:getfield        #208 <Field int mParentHeight>
	//   32   58:iload_1         
	//   33   59:isub            
	//   34   60:putfield        #206 <Field int mMaxOffset>
			flag = true;
	//   35   63:iconst_1        
	//   36   64:istore_2        
		}
		if(flag && mState == 4 && mViewRef != null)
	//*  37   65:iload_2         
	//*  38   66:ifeq            103
	//*  39   69:aload_0         
	//*  40   70:getfield        #77  <Field int mState>
	//*  41   73:iconst_4        
	//*  42   74:icmpne          103
	//*  43   77:aload_0         
	//*  44   78:getfield        #197 <Field WeakReference mViewRef>
	//*  45   81:ifnull          103
		{
			View view = (View)mViewRef.get();
	//   46   84:aload_0         
	//   47   85:getfield        #197 <Field WeakReference mViewRef>
	//   48   88:invokevirtual   #202 <Method Object WeakReference.get()>
	//   49   91:checkcast       #156 <Class View>
	//   50   94:astore_3        
			if(view != null)
	//*  51   95:aload_3         
	//*  52   96:ifnull          103
				view.requestLayout();
	//   53   99:aload_3         
	//   54  100:invokevirtual   #445 <Method void View.requestLayout()>
		}
	//   55  103:return          
	}

	public void setSkipCollapsed(boolean flag)
	{
		mSkipCollapsed = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #247 <Field boolean mSkipCollapsed>
	//    3    5:return          
	}

	public final void setState(int i)
	{
		if(i == mState)
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
			if(i == 4 || i == 3 || mHideable && i == 5)
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
				mState = i;
	//   20   38:aload_0         
	//   21   39:iload_1         
	//   22   40:putfield        #77  <Field int mState>
			return;
	//   23   43:return          
		}
		View view = (View)mViewRef.get();
	//   24   44:aload_0         
	//   25   45:getfield        #197 <Field WeakReference mViewRef>
	//   26   48:invokevirtual   #202 <Method Object WeakReference.get()>
	//   27   51:checkcast       #156 <Class View>
	//   28   54:astore_2        
		if(view == null)
	//*  29   55:aload_2         
	//*  30   56:ifnonnull       60
			return;
	//   31   59:return          
		ViewParent viewparent = view.getParent();
	//   32   60:aload_2         
	//   33   61:invokevirtual   #450 <Method ViewParent View.getParent()>
	//   34   64:astore_3        
		if(viewparent != null && viewparent.isLayoutRequested() && ViewCompat.isAttachedToWindow(view))
	//*  35   65:aload_3         
	//*  36   66:ifnull          101
	//*  37   69:aload_3         
	//*  38   70:invokeinterface #455 <Method boolean ViewParent.isLayoutRequested()>
	//*  39   75:ifeq            101
	//*  40   78:aload_2         
	//*  41   79:invokestatic    #458 <Method boolean ViewCompat.isAttachedToWindow(View)>
	//*  42   82:ifeq            101
		{
			view.post(new Runnable(view, i) {

				public void run()
				{
					c.startSettlingAnimation(e, d);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field BottomSheetBehavior c>
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field View e>
				//    4    8:aload_0         
				//    5    9:getfield        #25  <Field int d>
				//    6   12:invokevirtual   #34  <Method void BottomSheetBehavior.startSettlingAnimation(View, int)>
				//    7   15:return          
				}

				final BottomSheetBehavior c;
				final int d;
				final View e;

			
			{
				c = BottomSheetBehavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field BottomSheetBehavior c>
				e = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field View e>
				d = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field int d>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   43   85:aload_2         
	//   44   86:new             #9   <Class BottomSheetBehavior$5>
	//   45   89:dup             
	//   46   90:aload_0         
	//   47   91:aload_2         
	//   48   92:iload_1         
	//   49   93:invokespecial   #459 <Method void BottomSheetBehavior$5(BottomSheetBehavior, View, int)>
	//   50   96:invokevirtual   #463 <Method boolean View.post(Runnable)>
	//   51   99:pop             
			return;
	//   52  100:return          
		} else
		{
			startSettlingAnimation(view, i);
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
		return Math.abs(((float)view.getTop() + 0.1F * f) - (float)mMaxOffset) / (float)mPeekHeight > 0.5F;
	//   12   22:aload_1         
	//   13   23:invokevirtual   #328 <Method int View.getTop()>
	//   14   26:i2f             
	//   15   27:ldc1            #26  <Float 0.1F>
	//   16   29:fload_2         
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
	//*   6   10:goto            74
		if(i == 3)
	//*   7   13:iload_2         
	//*   8   14:iconst_3        
	//*   9   15:icmpne          26
			j = mMinOffset;
	//   10   18:aload_0         
	//   11   19:getfield        #214 <Field int mMinOffset>
	//   12   22:istore_3        
		else
	//*  13   23:goto            74
		if(mHideable && i == 5)
	//*  14   26:aload_0         
	//*  15   27:getfield        #251 <Field boolean mHideable>
	//*  16   30:ifeq            46
	//*  17   33:iload_2         
	//*  18   34:iconst_5        
	//*  19   35:icmpne          46
			j = mParentHeight;
	//   20   38:aload_0         
	//   21   39:getfield        #208 <Field int mParentHeight>
	//   22   42:istore_3        
		else
	//*  23   43:goto            74
			throw new IllegalArgumentException((new StringBuilder()).append("Illegal state argument: ").append(i).toString());
	//   24   46:new             #164 <Class IllegalArgumentException>
	//   25   49:dup             
	//   26   50:new             #471 <Class StringBuilder>
	//   27   53:dup             
	//   28   54:invokespecial   #472 <Method void StringBuilder()>
	//   29   57:ldc2            #474 <String "Illegal state argument: ">
	//   30   60:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   31   63:iload_2         
	//   32   64:invokevirtual   #481 <Method StringBuilder StringBuilder.append(int)>
	//   33   67:invokevirtual   #485 <Method String StringBuilder.toString()>
	//   34   70:invokespecial   #169 <Method void IllegalArgumentException(String)>
	//   35   73:athrow          
		if(mViewDragHelper.smoothSlideViewTo(view, view.getLeft(), j))
	//*  36   74:aload_0         
	//*  37   75:getfield        #300 <Field ViewDragHelper mViewDragHelper>
	//*  38   78:aload_1         
	//*  39   79:aload_1         
	//*  40   80:invokevirtual   #422 <Method int View.getLeft()>
	//*  41   83:iload_3         
	//*  42   84:invokevirtual   #425 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//*  43   87:ifeq            110
		{
			setStateInternal(2);
	//   44   90:aload_0         
	//   45   91:iconst_2        
	//   46   92:invokevirtual   #375 <Method void setStateInternal(int)>
			ViewCompat.postOnAnimation(view, ((Runnable) (new c(view, i))));
	//   47   95:aload_1         
	//   48   96:new             #22  <Class BottomSheetBehavior$c>
	//   49   99:dup             
	//   50  100:aload_0         
	//   51  101:aload_1         
	//   52  102:iload_2         
	//   53  103:invokespecial   #428 <Method void BottomSheetBehavior$c(BottomSheetBehavior, View, int)>
	//   54  106:invokestatic    #432 <Method void ViewCompat.postOnAnimation(View, Runnable)>
			return;
	//   55  109:return          
		} else
		{
			setStateInternal(i);
	//   56  110:aload_0         
	//   57  111:iload_2         
	//   58  112:invokevirtual   #375 <Method void setStateInternal(int)>
			return;
	//   59  115:return          
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
