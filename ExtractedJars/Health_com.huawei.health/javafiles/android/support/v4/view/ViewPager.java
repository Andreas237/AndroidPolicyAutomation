// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.*;
import android.support.v4.content.ContextCompat;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.util.*;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package android.support.v4.view:
//			PagerAdapter, ViewCompat, AccessibilityDelegateCompat, AbsSavedState, 
//			OnApplyWindowInsetsListener, WindowInsetsCompat

public class ViewPager extends ViewGroup
{
	public static interface DecorView
		extends Annotation
	{
	}

	static class ItemInfo
	{

		Object object;
		float offset;
		int position;
		boolean scrolling;
		float widthFactor;

		ItemInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class LayoutParams extends android.view.ViewGroup.LayoutParams
	{

		int childIndex;
		public int gravity;
		public boolean isDecor;
		boolean needsMeasure;
		int position;
		float widthFactor;

		public LayoutParams()
		{
			super(-1, -1);
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:iconst_m1       
		//    3    3:invokespecial   #21  <Method void android.view.ViewGroup$LayoutParams(int, int)>
			widthFactor = 0.0F;
		//    4    6:aload_0         
		//    5    7:fconst_0        
		//    6    8:putfield        #23  <Field float widthFactor>
		//    7   11:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #27  <Method void android.view.ViewGroup$LayoutParams(Context, AttributeSet)>
			widthFactor = 0.0F;
		//    4    6:aload_0         
		//    5    7:fconst_0        
		//    6    8:putfield        #23  <Field float widthFactor>
			context = ((Context) (context.obtainStyledAttributes(attributeset, ViewPager.LAYOUT_ATTRS)));
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:getstatic       #31  <Field int[] ViewPager.LAYOUT_ATTRS>
		//   10   16:invokevirtual   #37  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   11   19:astore_1        
			gravity = ((TypedArray) (context)).getInteger(0, 48);
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:iconst_0        
		//   15   23:bipush          48
		//   16   25:invokevirtual   #43  <Method int TypedArray.getInteger(int, int)>
		//   17   28:putfield        #45  <Field int gravity>
			((TypedArray) (context)).recycle();
		//   18   31:aload_1         
		//   19   32:invokevirtual   #48  <Method void TypedArray.recycle()>
		//   20   35:return          
		}
	}

	class MyAccessibilityDelegate extends AccessibilityDelegateCompat
	{

		private boolean canScroll()
		{
			return mAdapter != null && mAdapter.getCount() > 1;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ViewPager this$0>
		//    2    4:getfield        #23  <Field PagerAdapter ViewPager.mAdapter>
		//    3    7:ifnull          26
		//    4   10:aload_0         
		//    5   11:getfield        #13  <Field ViewPager this$0>
		//    6   14:getfield        #23  <Field PagerAdapter ViewPager.mAdapter>
		//    7   17:invokevirtual   #29  <Method int PagerAdapter.getCount()>
		//    8   20:iconst_1        
		//    9   21:icmple          26
		//   10   24:iconst_1        
		//   11   25:ireturn         
		//   12   26:iconst_0        
		//   13   27:ireturn         
		}

		public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
		{
			super.onInitializeAccessibilityEvent(view, accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #33  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v4/view/ViewPager)).getName())));
		//    4    6:aload_2         
		//    5    7:ldc1            #6   <Class ViewPager>
		//    6    9:invokevirtual   #39  <Method String Class.getName()>
		//    7   12:invokevirtual   #45  <Method void AccessibilityEvent.setClassName(CharSequence)>
			view = ((View) (AccessibilityEventCompat.asRecord(accessibilityevent)));
		//    8   15:aload_2         
		//    9   16:invokestatic    #51  <Method AccessibilityRecordCompat AccessibilityEventCompat.asRecord(AccessibilityEvent)>
		//   10   19:astore_1        
			((AccessibilityRecordCompat) (view)).setScrollable(canScroll());
		//   11   20:aload_1         
		//   12   21:aload_0         
		//   13   22:invokespecial   #53  <Method boolean canScroll()>
		//   14   25:invokevirtual   #59  <Method void AccessibilityRecordCompat.setScrollable(boolean)>
			if(accessibilityevent.getEventType() == 4096 && mAdapter != null)
		//*  15   28:aload_2         
		//*  16   29:invokevirtual   #62  <Method int AccessibilityEvent.getEventType()>
		//*  17   32:sipush          4096
		//*  18   35:icmpne          84
		//*  19   38:aload_0         
		//*  20   39:getfield        #13  <Field ViewPager this$0>
		//*  21   42:getfield        #23  <Field PagerAdapter ViewPager.mAdapter>
		//*  22   45:ifnull          84
			{
				((AccessibilityRecordCompat) (view)).setItemCount(mAdapter.getCount());
		//   23   48:aload_1         
		//   24   49:aload_0         
		//   25   50:getfield        #13  <Field ViewPager this$0>
		//   26   53:getfield        #23  <Field PagerAdapter ViewPager.mAdapter>
		//   27   56:invokevirtual   #29  <Method int PagerAdapter.getCount()>
		//   28   59:invokevirtual   #66  <Method void AccessibilityRecordCompat.setItemCount(int)>
				((AccessibilityRecordCompat) (view)).setFromIndex(mCurItem);
		//   29   62:aload_1         
		//   30   63:aload_0         
		//   31   64:getfield        #13  <Field ViewPager this$0>
		//   32   67:getfield        #70  <Field int ViewPager.mCurItem>
		//   33   70:invokevirtual   #73  <Method void AccessibilityRecordCompat.setFromIndex(int)>
				((AccessibilityRecordCompat) (view)).setToIndex(mCurItem);
		//   34   73:aload_1         
		//   35   74:aload_0         
		//   36   75:getfield        #13  <Field ViewPager this$0>
		//   37   78:getfield        #70  <Field int ViewPager.mCurItem>
		//   38   81:invokevirtual   #76  <Method void AccessibilityRecordCompat.setToIndex(int)>
			}
		//   39   84:return          
		}

		public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
		{
			super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #80  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
			accessibilitynodeinfocompat.setClassName(((CharSequence) (((Class) (android/support/v4/view/ViewPager)).getName())));
		//    4    6:aload_2         
		//    5    7:ldc1            #6   <Class ViewPager>
		//    6    9:invokevirtual   #39  <Method String Class.getName()>
		//    7   12:invokevirtual   #83  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
			accessibilitynodeinfocompat.setScrollable(canScroll());
		//    8   15:aload_2         
		//    9   16:aload_0         
		//   10   17:invokespecial   #53  <Method boolean canScroll()>
		//   11   20:invokevirtual   #84  <Method void AccessibilityNodeInfoCompat.setScrollable(boolean)>
			if(canScrollHorizontally(1))
		//*  12   23:aload_0         
		//*  13   24:getfield        #13  <Field ViewPager this$0>
		//*  14   27:iconst_1        
		//*  15   28:invokevirtual   #88  <Method boolean ViewPager.canScrollHorizontally(int)>
		//*  16   31:ifeq            41
				accessibilitynodeinfocompat.addAction(4096);
		//   17   34:aload_2         
		//   18   35:sipush          4096
		//   19   38:invokevirtual   #91  <Method void AccessibilityNodeInfoCompat.addAction(int)>
			if(canScrollHorizontally(-1))
		//*  20   41:aload_0         
		//*  21   42:getfield        #13  <Field ViewPager this$0>
		//*  22   45:iconst_m1       
		//*  23   46:invokevirtual   #88  <Method boolean ViewPager.canScrollHorizontally(int)>
		//*  24   49:ifeq            59
				accessibilitynodeinfocompat.addAction(8192);
		//   25   52:aload_2         
		//   26   53:sipush          8192
		//   27   56:invokevirtual   #91  <Method void AccessibilityNodeInfoCompat.addAction(int)>
		//   28   59:return          
		}

		public boolean performAccessibilityAction(View view, int i, Bundle bundle)
		{
			if(super.performAccessibilityAction(view, i, bundle))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:iload_2         
		//*   3    3:aload_3         
		//*   4    4:invokespecial   #95  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
		//*   5    7:ifeq            12
				return true;
		//    6   10:iconst_1        
		//    7   11:ireturn         
			switch(i)
		//*   8   12:iload_2         
			{
		//*   9   13:lookupswitch    2: default 40
		//		               4096: 43
		//		               8192: 74
		//*  10   40:goto            105
			case 4096: 
				if(canScrollHorizontally(1))
		//*  11   43:aload_0         
		//*  12   44:getfield        #13  <Field ViewPager this$0>
		//*  13   47:iconst_1        
		//*  14   48:invokevirtual   #88  <Method boolean ViewPager.canScrollHorizontally(int)>
		//*  15   51:ifeq            72
				{
					setCurrentItem(mCurItem + 1);
		//   16   54:aload_0         
		//   17   55:getfield        #13  <Field ViewPager this$0>
		//   18   58:aload_0         
		//   19   59:getfield        #13  <Field ViewPager this$0>
		//   20   62:getfield        #70  <Field int ViewPager.mCurItem>
		//   21   65:iconst_1        
		//   22   66:iadd            
		//   23   67:invokevirtual   #98  <Method void ViewPager.setCurrentItem(int)>
					return true;
		//   24   70:iconst_1        
		//   25   71:ireturn         
				} else
				{
					return false;
		//   26   72:iconst_0        
		//   27   73:ireturn         
				}

			case 8192: 
				if(canScrollHorizontally(-1))
		//*  28   74:aload_0         
		//*  29   75:getfield        #13  <Field ViewPager this$0>
		//*  30   78:iconst_m1       
		//*  31   79:invokevirtual   #88  <Method boolean ViewPager.canScrollHorizontally(int)>
		//*  32   82:ifeq            103
				{
					setCurrentItem(mCurItem - 1);
		//   33   85:aload_0         
		//   34   86:getfield        #13  <Field ViewPager this$0>
		//   35   89:aload_0         
		//   36   90:getfield        #13  <Field ViewPager this$0>
		//   37   93:getfield        #70  <Field int ViewPager.mCurItem>
		//   38   96:iconst_1        
		//   39   97:isub            
		//   40   98:invokevirtual   #98  <Method void ViewPager.setCurrentItem(int)>
					return true;
		//   41  101:iconst_1        
		//   42  102:ireturn         
				} else
				{
					return false;
		//   43  103:iconst_0        
		//   44  104:ireturn         
				}
			}
			return false;
		//   45  105:iconst_0        
		//   46  106:ireturn         
		}

		final ViewPager this$0;

		MyAccessibilityDelegate()
		{
			this$0 = ViewPager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ViewPager this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void AccessibilityDelegateCompat()>
		//    5    9:return          
		}
	}

	public static interface OnAdapterChangeListener
	{

		public abstract void onAdapterChanged(ViewPager viewpager, PagerAdapter pageradapter, PagerAdapter pageradapter1);
	}

	public static interface OnPageChangeListener
	{

		public abstract void onPageScrollStateChanged(int i);

		public abstract void onPageScrolled(int i, float f, int j);

		public abstract void onPageSelected(int i);
	}

	public static interface PageTransformer
	{

		public abstract void transformPage(View view, float f);
	}

	class PagerObserver extends DataSetObserver
	{

		public void onChanged()
		{
			dataSetChanged();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ViewPager this$0>
		//    2    4:invokevirtual   #21  <Method void ViewPager.dataSetChanged()>
		//    3    7:return          
		}

		public void onInvalidated()
		{
			dataSetChanged();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ViewPager this$0>
		//    2    4:invokevirtual   #21  <Method void ViewPager.dataSetChanged()>
		//    3    7:return          
		}

		final ViewPager this$0;

		PagerObserver()
		{
			this$0 = ViewPager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ViewPager this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void DataSetObserver()>
		//    5    9:return          
		}
	}

	public static class SavedState extends AbsSavedState
	{

		public String toString()
		{
			return (new StringBuilder()).append("FragmentPager.SavedState{").append(Integer.toHexString(System.identityHashCode(((Object) (this))))).append(" position=").append(position).append("}").toString();
		//    0    0:new             #70  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #71  <Method void StringBuilder()>
		//    3    7:ldc1            #73  <String "FragmentPager.SavedState{">
		//    4    9:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:invokestatic    #83  <Method int System.identityHashCode(Object)>
		//    7   16:invokestatic    #89  <Method String Integer.toHexString(int)>
		//    8   19:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:ldc1            #91  <String " position=">
		//   10   24:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   11   27:aload_0         
		//   12   28:getfield        #55  <Field int position>
		//   13   31:invokevirtual   #94  <Method StringBuilder StringBuilder.append(int)>
		//   14   34:ldc1            #96  <String "}">
		//   15   36:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   16   39:invokevirtual   #98  <Method String StringBuilder.toString()>
		//   17   42:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #102 <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(position);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #55  <Field int position>
		//    7   11:invokevirtual   #106 <Method void Parcel.writeInt(int)>
			parcel.writeParcelable(adapterState, i);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #61  <Field Parcelable adapterState>
		//   11   19:iload_2         
		//   12   20:invokevirtual   #110 <Method void Parcel.writeParcelable(Parcelable, int)>
		//   13   23:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class ViewPager$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void ViewPager$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #25  <Method ViewPager$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #30  <Method ViewPager$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
);
		Parcelable adapterState;
		ClassLoader loader;
		int position;

		static 
		{
		//    0    0:new             #9   <Class ViewPager$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #23  <Method void ViewPager$SavedState$1()>
		//    3    7:invokestatic    #29  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
		//    4   10:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
		//*   5   13:return          
		}

		SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #35  <Method void AbsSavedState(Parcel, ClassLoader)>
			ClassLoader classloader1 = classloader;
		//    4    6:aload_2         
		//    5    7:astore_3        
			if(classloader == null)
		//*   6    8:aload_2         
		//*   7    9:ifnonnull       20
				classloader1 = ((Object)this).getClass().getClassLoader();
		//    8   12:aload_0         
		//    9   13:invokevirtual   #41  <Method Class Object.getClass()>
		//   10   16:invokevirtual   #47  <Method ClassLoader Class.getClassLoader()>
		//   11   19:astore_3        
			position = parcel.readInt();
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:invokevirtual   #53  <Method int Parcel.readInt()>
		//   15   25:putfield        #55  <Field int position>
			adapterState = parcel.readParcelable(classloader1);
		//   16   28:aload_0         
		//   17   29:aload_1         
		//   18   30:aload_3         
		//   19   31:invokevirtual   #59  <Method Parcelable Parcel.readParcelable(ClassLoader)>
		//   20   34:putfield        #61  <Field Parcelable adapterState>
			loader = classloader1;
		//   21   37:aload_0         
		//   22   38:aload_3         
		//   23   39:putfield        #63  <Field ClassLoader loader>
		//   24   42:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #66  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	public static class SimpleOnPageChangeListener
		implements OnPageChangeListener
	{

		public void onPageScrollStateChanged(int i)
		{
		//    0    0:return          
		}

		public void onPageScrolled(int i, float f, int j)
		{
		//    0    0:return          
		}

		public void onPageSelected(int i)
		{
		//    0    0:return          
		}

		public SimpleOnPageChangeListener()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class ViewPositionComparator
		implements Comparator
	{

		public int compare(View view, View view1)
		{
			view = ((View) ((LayoutParams)view.getLayoutParams()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #23  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #25  <Class ViewPager$LayoutParams>
		//    3    7:astore_1        
			view1 = ((View) ((LayoutParams)view1.getLayoutParams()));
		//    4    8:aload_2         
		//    5    9:invokevirtual   #23  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    6   12:checkcast       #25  <Class ViewPager$LayoutParams>
		//    7   15:astore_2        
			if(((LayoutParams) (view)).isDecor != ((LayoutParams) (view1)).isDecor)
		//*   8   16:aload_1         
		//*   9   17:getfield        #29  <Field boolean ViewPager$LayoutParams.isDecor>
		//*  10   20:aload_2         
		//*  11   21:getfield        #29  <Field boolean ViewPager$LayoutParams.isDecor>
		//*  12   24:icmpeq          38
				return !((LayoutParams) (view)).isDecor ? -1 : 1;
		//   13   27:aload_1         
		//   14   28:getfield        #29  <Field boolean ViewPager$LayoutParams.isDecor>
		//   15   31:ifeq            36
		//   16   34:iconst_1        
		//   17   35:ireturn         
		//   18   36:iconst_m1       
		//   19   37:ireturn         
			else
				return ((LayoutParams) (view)).position - ((LayoutParams) (view1)).position;
		//   20   38:aload_1         
		//   21   39:getfield        #33  <Field int ViewPager$LayoutParams.position>
		//   22   42:aload_2         
		//   23   43:getfield        #33  <Field int ViewPager$LayoutParams.position>
		//   24   46:isub            
		//   25   47:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((View)obj, (View)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #19  <Class View>
		//    3    5:aload_2         
		//    4    6:checkcast       #19  <Class View>
		//    5    9:invokevirtual   #36  <Method int compare(View, View)>
		//    6   12:ireturn         
		}

		ViewPositionComparator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	public ViewPager(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #183 <Method void ViewGroup(Context)>
		mItems = new ArrayList();
	//    3    5:aload_0         
	//    4    6:new             #185 <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #186 <Method void ArrayList()>
	//    7   13:putfield        #188 <Field ArrayList mItems>
		mTempItem = new ItemInfo();
	//    8   16:aload_0         
	//    9   17:new             #17  <Class ViewPager$ItemInfo>
	//   10   20:dup             
	//   11   21:invokespecial   #189 <Method void ViewPager$ItemInfo()>
	//   12   24:putfield        #191 <Field ViewPager$ItemInfo mTempItem>
		mTempRect = new Rect();
	//   13   27:aload_0         
	//   14   28:new             #193 <Class Rect>
	//   15   31:dup             
	//   16   32:invokespecial   #194 <Method void Rect()>
	//   17   35:putfield        #196 <Field Rect mTempRect>
		mRestoredCurItem = -1;
	//   18   38:aload_0         
	//   19   39:iconst_m1       
	//   20   40:putfield        #198 <Field int mRestoredCurItem>
		mRestoredAdapterState = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #200 <Field Parcelable mRestoredAdapterState>
		mRestoredClassLoader = null;
	//   24   48:aload_0         
	//   25   49:aconst_null     
	//   26   50:putfield        #202 <Field ClassLoader mRestoredClassLoader>
		mFirstOffset = -3.402823E+38F;
	//   27   53:aload_0         
	//   28   54:ldc1            #203 <Float -3.402823E+38F>
	//   29   56:putfield        #205 <Field float mFirstOffset>
		mLastOffset = 3.402823E+38F;
	//   30   59:aload_0         
	//   31   60:ldc1            #206 <Float 3.402823E+38F>
	//   32   62:putfield        #208 <Field float mLastOffset>
		mOffscreenPageLimit = 1;
	//   33   65:aload_0         
	//   34   66:iconst_1        
	//   35   67:putfield        #210 <Field int mOffscreenPageLimit>
		mActivePointerId = -1;
	//   36   70:aload_0         
	//   37   71:iconst_m1       
	//   38   72:putfield        #212 <Field int mActivePointerId>
		mFirstLayout = true;
	//   39   75:aload_0         
	//   40   76:iconst_1        
	//   41   77:putfield        #214 <Field boolean mFirstLayout>
		mNeedCalculatePageOffsets = false;
	//   42   80:aload_0         
	//   43   81:iconst_0        
	//   44   82:putfield        #216 <Field boolean mNeedCalculatePageOffsets>
		mEndScrollRunnable = new Runnable() {

			public void run()
			{
				setScrollState(0);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ViewPager this$0>
			//    2    4:iconst_0        
			//    3    5:invokevirtual   #23  <Method void ViewPager.setScrollState(int)>
				populate();
			//    4    8:aload_0         
			//    5    9:getfield        #14  <Field ViewPager this$0>
			//    6   12:invokevirtual   #26  <Method void ViewPager.populate()>
			//    7   15:return          
			}

			final ViewPager this$0;

			
			{
				this$0 = ViewPager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ViewPager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   45   85:aload_0         
	//   46   86:new             #10  <Class ViewPager$3>
	//   47   89:dup             
	//   48   90:aload_0         
	//   49   91:invokespecial   #219 <Method void ViewPager$3(ViewPager)>
	//   50   94:putfield        #221 <Field Runnable mEndScrollRunnable>
		mScrollState = 0;
	//   51   97:aload_0         
	//   52   98:iconst_0        
	//   53   99:putfield        #223 <Field int mScrollState>
		initViewPager();
	//   54  102:aload_0         
	//   55  103:invokevirtual   #226 <Method void initViewPager()>
	//   56  106:return          
	}

	public ViewPager(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #229 <Method void ViewGroup(Context, AttributeSet)>
		mItems = new ArrayList();
	//    4    6:aload_0         
	//    5    7:new             #185 <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #186 <Method void ArrayList()>
	//    8   14:putfield        #188 <Field ArrayList mItems>
		mTempItem = new ItemInfo();
	//    9   17:aload_0         
	//   10   18:new             #17  <Class ViewPager$ItemInfo>
	//   11   21:dup             
	//   12   22:invokespecial   #189 <Method void ViewPager$ItemInfo()>
	//   13   25:putfield        #191 <Field ViewPager$ItemInfo mTempItem>
		mTempRect = new Rect();
	//   14   28:aload_0         
	//   15   29:new             #193 <Class Rect>
	//   16   32:dup             
	//   17   33:invokespecial   #194 <Method void Rect()>
	//   18   36:putfield        #196 <Field Rect mTempRect>
		mRestoredCurItem = -1;
	//   19   39:aload_0         
	//   20   40:iconst_m1       
	//   21   41:putfield        #198 <Field int mRestoredCurItem>
		mRestoredAdapterState = null;
	//   22   44:aload_0         
	//   23   45:aconst_null     
	//   24   46:putfield        #200 <Field Parcelable mRestoredAdapterState>
		mRestoredClassLoader = null;
	//   25   49:aload_0         
	//   26   50:aconst_null     
	//   27   51:putfield        #202 <Field ClassLoader mRestoredClassLoader>
		mFirstOffset = -3.402823E+38F;
	//   28   54:aload_0         
	//   29   55:ldc1            #203 <Float -3.402823E+38F>
	//   30   57:putfield        #205 <Field float mFirstOffset>
		mLastOffset = 3.402823E+38F;
	//   31   60:aload_0         
	//   32   61:ldc1            #206 <Float 3.402823E+38F>
	//   33   63:putfield        #208 <Field float mLastOffset>
		mOffscreenPageLimit = 1;
	//   34   66:aload_0         
	//   35   67:iconst_1        
	//   36   68:putfield        #210 <Field int mOffscreenPageLimit>
		mActivePointerId = -1;
	//   37   71:aload_0         
	//   38   72:iconst_m1       
	//   39   73:putfield        #212 <Field int mActivePointerId>
		mFirstLayout = true;
	//   40   76:aload_0         
	//   41   77:iconst_1        
	//   42   78:putfield        #214 <Field boolean mFirstLayout>
		mNeedCalculatePageOffsets = false;
	//   43   81:aload_0         
	//   44   82:iconst_0        
	//   45   83:putfield        #216 <Field boolean mNeedCalculatePageOffsets>
		mEndScrollRunnable = new _cls3();
	//   46   86:aload_0         
	//   47   87:new             #10  <Class ViewPager$3>
	//   48   90:dup             
	//   49   91:aload_0         
	//   50   92:invokespecial   #219 <Method void ViewPager$3(ViewPager)>
	//   51   95:putfield        #221 <Field Runnable mEndScrollRunnable>
		mScrollState = 0;
	//   52   98:aload_0         
	//   53   99:iconst_0        
	//   54  100:putfield        #223 <Field int mScrollState>
		initViewPager();
	//   55  103:aload_0         
	//   56  104:invokevirtual   #226 <Method void initViewPager()>
	//   57  107:return          
	}

	private void calculatePageOffsets(ItemInfo iteminfo, int i, ItemInfo iteminfo1)
	{
		int j2 = mAdapter.getCount();
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field PagerAdapter mAdapter>
	//    2    4:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//    3    7:istore          10
		int j = getClientWidth();
	//    4    9:aload_0         
	//    5   10:invokespecial   #242 <Method int getClientWidth()>
	//    6   13:istore          7
		float f3;
		if(j > 0)
	//*   7   15:iload           7
	//*   8   17:ifle            34
			f3 = (float)mPageMargin / (float)j;
	//    9   20:aload_0         
	//   10   21:getfield        #244 <Field int mPageMargin>
	//   11   24:i2f             
	//   12   25:iload           7
	//   13   27:i2f             
	//   14   28:fdiv            
	//   15   29:fstore          5
		else
	//*  16   31:goto            37
			f3 = 0.0F;
	//   17   34:fconst_0        
	//   18   35:fstore          5
		if(iteminfo1 != null)
	//*  19   37:aload_3         
	//*  20   38:ifnull          412
		{
			j = iteminfo1.position;
	//   21   41:aload_3         
	//   22   42:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   23   45:istore          7
			if(j < iteminfo.position)
	//*  24   47:iload           7
	//*  25   49:aload_1         
	//*  26   50:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  27   53:icmpge          239
			{
				int k = 0;
	//   28   56:iconst_0        
	//   29   57:istore          8
				float f = iteminfo1.offset + iteminfo1.widthFactor + f3;
	//   30   59:aload_3         
	//   31   60:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   32   63:aload_3         
	//   33   64:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//   34   67:fadd            
	//   35   68:fload           5
	//   36   70:fadd            
	//   37   71:fstore          4
				int k1;
				for(j++; j <= iteminfo.position && k < mItems.size(); j = k1 + 1)
	//*  38   73:iload           7
	//*  39   75:iconst_1        
	//*  40   76:iadd            
	//*  41   77:istore          7
	//*  42   79:iload           7
	//*  43   81:aload_1         
	//*  44   82:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  45   85:icmpgt          236
	//*  46   88:iload           8
	//*  47   90:aload_0         
	//*  48   91:getfield        #188 <Field ArrayList mItems>
	//*  49   94:invokevirtual   #256 <Method int ArrayList.size()>
	//*  50   97:icmpge          236
				{
					iteminfo1 = (ItemInfo)mItems.get(k);
	//   51  100:aload_0         
	//   52  101:getfield        #188 <Field ArrayList mItems>
	//   53  104:iload           8
	//   54  106:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   55  109:checkcast       #17  <Class ViewPager$ItemInfo>
	//   56  112:astore_3        
					float f4;
					do
					{
						f4 = f;
	//   57  113:fload           4
	//   58  115:fstore          6
						k1 = j;
	//   59  117:iload           7
	//   60  119:istore          9
						if(j <= iteminfo1.position)
							break;
	//   61  121:iload           7
	//   62  123:aload_3         
	//   63  124:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   64  127:icmple          174
						f4 = f;
	//   65  130:fload           4
	//   66  132:fstore          6
						k1 = j;
	//   67  134:iload           7
	//   68  136:istore          9
						if(k >= mItems.size() - 1)
							break;
	//   69  138:iload           8
	//   70  140:aload_0         
	//   71  141:getfield        #188 <Field ArrayList mItems>
	//   72  144:invokevirtual   #256 <Method int ArrayList.size()>
	//   73  147:iconst_1        
	//   74  148:isub            
	//   75  149:icmpge          174
						k++;
	//   76  152:iload           8
	//   77  154:iconst_1        
	//   78  155:iadd            
	//   79  156:istore          8
						iteminfo1 = (ItemInfo)mItems.get(k);
	//   80  158:aload_0         
	//   81  159:getfield        #188 <Field ArrayList mItems>
	//   82  162:iload           8
	//   83  164:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   84  167:checkcast       #17  <Class ViewPager$ItemInfo>
	//   85  170:astore_3        
					} while(true);
	//   86  171:goto            113
					for(; k1 < iteminfo1.position; k1++)
	//*  87  174:iload           9
	//*  88  176:aload_3         
	//*  89  177:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  90  180:icmpge          209
						f4 += mAdapter.getPageWidth(k1) + f3;
	//   91  183:fload           6
	//   92  185:aload_0         
	//   93  186:getfield        #233 <Field PagerAdapter mAdapter>
	//   94  189:iload           9
	//   95  191:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//   96  194:fload           5
	//   97  196:fadd            
	//   98  197:fadd            
	//   99  198:fstore          6

	//  100  200:iload           9
	//  101  202:iconst_1        
	//  102  203:iadd            
	//  103  204:istore          9
	//* 104  206:goto            174
					iteminfo1.offset = f4;
	//  105  209:aload_3         
	//  106  210:fload           6
	//  107  212:putfield        #250 <Field float ViewPager$ItemInfo.offset>
					f = f4 + (iteminfo1.widthFactor + f3);
	//  108  215:fload           6
	//  109  217:aload_3         
	//  110  218:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  111  221:fload           5
	//  112  223:fadd            
	//  113  224:fadd            
	//  114  225:fstore          4
				}

	//  115  227:iload           9
	//  116  229:iconst_1        
	//  117  230:iadd            
	//  118  231:istore          7
			} else
	//* 119  233:goto            79
	//* 120  236:goto            412
			if(j > iteminfo.position)
	//* 121  239:iload           7
	//* 122  241:aload_1         
	//* 123  242:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 124  245:icmple          412
			{
				int l = mItems.size() - 1;
	//  125  248:aload_0         
	//  126  249:getfield        #188 <Field ArrayList mItems>
	//  127  252:invokevirtual   #256 <Method int ArrayList.size()>
	//  128  255:iconst_1        
	//  129  256:isub            
	//  130  257:istore          8
				float f1 = iteminfo1.offset;
	//  131  259:aload_3         
	//  132  260:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  133  263:fstore          4
				int l1;
				for(j--; j >= iteminfo.position && l >= 0; j = l1 - 1)
	//* 134  265:iload           7
	//* 135  267:iconst_1        
	//* 136  268:isub            
	//* 137  269:istore          7
	//* 138  271:iload           7
	//* 139  273:aload_1         
	//* 140  274:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 141  277:icmplt          412
	//* 142  280:iload           8
	//* 143  282:iflt            412
				{
					iteminfo1 = (ItemInfo)mItems.get(l);
	//  144  285:aload_0         
	//  145  286:getfield        #188 <Field ArrayList mItems>
	//  146  289:iload           8
	//  147  291:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  148  294:checkcast       #17  <Class ViewPager$ItemInfo>
	//  149  297:astore_3        
					float f5;
					do
					{
						f5 = f1;
	//  150  298:fload           4
	//  151  300:fstore          6
						l1 = j;
	//  152  302:iload           7
	//  153  304:istore          9
						if(j >= iteminfo1.position)
							break;
	//  154  306:iload           7
	//  155  308:aload_3         
	//  156  309:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  157  312:icmpge          350
						f5 = f1;
	//  158  315:fload           4
	//  159  317:fstore          6
						l1 = j;
	//  160  319:iload           7
	//  161  321:istore          9
						if(l <= 0)
							break;
	//  162  323:iload           8
	//  163  325:ifle            350
						l--;
	//  164  328:iload           8
	//  165  330:iconst_1        
	//  166  331:isub            
	//  167  332:istore          8
						iteminfo1 = (ItemInfo)mItems.get(l);
	//  168  334:aload_0         
	//  169  335:getfield        #188 <Field ArrayList mItems>
	//  170  338:iload           8
	//  171  340:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  172  343:checkcast       #17  <Class ViewPager$ItemInfo>
	//  173  346:astore_3        
					} while(true);
	//  174  347:goto            298
					for(; l1 > iteminfo1.position; l1--)
	//* 175  350:iload           9
	//* 176  352:aload_3         
	//* 177  353:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 178  356:icmple          385
						f5 -= mAdapter.getPageWidth(l1) + f3;
	//  179  359:fload           6
	//  180  361:aload_0         
	//  181  362:getfield        #233 <Field PagerAdapter mAdapter>
	//  182  365:iload           9
	//  183  367:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//  184  370:fload           5
	//  185  372:fadd            
	//  186  373:fsub            
	//  187  374:fstore          6

	//  188  376:iload           9
	//  189  378:iconst_1        
	//  190  379:isub            
	//  191  380:istore          9
	//* 192  382:goto            350
					f1 = f5 - (iteminfo1.widthFactor + f3);
	//  193  385:fload           6
	//  194  387:aload_3         
	//  195  388:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  196  391:fload           5
	//  197  393:fadd            
	//  198  394:fsub            
	//  199  395:fstore          4
					iteminfo1.offset = f1;
	//  200  397:aload_3         
	//  201  398:fload           4
	//  202  400:putfield        #250 <Field float ViewPager$ItemInfo.offset>
				}

	//  203  403:iload           9
	//  204  405:iconst_1        
	//  205  406:isub            
	//  206  407:istore          7
			}
		}
	//* 207  409:goto            271
		int k2 = mItems.size();
	//  208  412:aload_0         
	//  209  413:getfield        #188 <Field ArrayList mItems>
	//  210  416:invokevirtual   #256 <Method int ArrayList.size()>
	//  211  419:istore          11
		float f6 = iteminfo.offset;
	//  212  421:aload_1         
	//  213  422:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  214  425:fstore          6
		j = iteminfo.position - 1;
	//  215  427:aload_1         
	//  216  428:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  217  431:iconst_1        
	//  218  432:isub            
	//  219  433:istore          7
		float f2;
		if(iteminfo.position == 0)
	//* 220  435:aload_1         
	//* 221  436:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 222  439:ifne            451
			f2 = iteminfo.offset;
	//  223  442:aload_1         
	//  224  443:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  225  446:fstore          4
		else
	//* 226  448:goto            455
			f2 = -3.402823E+38F;
	//  227  451:ldc1            #203 <Float -3.402823E+38F>
	//  228  453:fstore          4
		mFirstOffset = f2;
	//  229  455:aload_0         
	//  230  456:fload           4
	//  231  458:putfield        #205 <Field float mFirstOffset>
		if(iteminfo.position == j2 - 1)
	//* 232  461:aload_1         
	//* 233  462:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 234  465:iload           10
	//* 235  467:iconst_1        
	//* 236  468:isub            
	//* 237  469:icmpne          488
			f2 = (iteminfo.offset + iteminfo.widthFactor) - 1.0F;
	//  238  472:aload_1         
	//  239  473:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  240  476:aload_1         
	//  241  477:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  242  480:fadd            
	//  243  481:fconst_1        
	//  244  482:fsub            
	//  245  483:fstore          4
		else
	//* 246  485:goto            492
			f2 = 3.402823E+38F;
	//  247  488:ldc1            #206 <Float 3.402823E+38F>
	//  248  490:fstore          4
		mLastOffset = f2;
	//  249  492:aload_0         
	//  250  493:fload           4
	//  251  495:putfield        #208 <Field float mLastOffset>
		int i1 = i - 1;
	//  252  498:iload_2         
	//  253  499:iconst_1        
	//  254  500:isub            
	//  255  501:istore          8
		f2 = f6;
	//  256  503:fload           6
	//  257  505:fstore          4
		while(i1 >= 0) 
	//* 258  507:iload           8
	//* 259  509:iflt            614
		{
			int i2;
			for(iteminfo1 = (ItemInfo)mItems.get(i1); j > iteminfo1.position; j = i2)
	//* 260  512:aload_0         
	//* 261  513:getfield        #188 <Field ArrayList mItems>
	//* 262  516:iload           8
	//* 263  518:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 264  521:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 265  524:astore_3        
	//* 266  525:iload           7
	//* 267  527:aload_3         
	//* 268  528:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 269  531:icmple          568
			{
				PagerAdapter pageradapter = mAdapter;
	//  270  534:aload_0         
	//  271  535:getfield        #233 <Field PagerAdapter mAdapter>
	//  272  538:astore          12
				i2 = j - 1;
	//  273  540:iload           7
	//  274  542:iconst_1        
	//  275  543:isub            
	//  276  544:istore          9
				f2 -= pageradapter.getPageWidth(j) + f3;
	//  277  546:fload           4
	//  278  548:aload           12
	//  279  550:iload           7
	//  280  552:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//  281  555:fload           5
	//  282  557:fadd            
	//  283  558:fsub            
	//  284  559:fstore          4
			}

	//  285  561:iload           9
	//  286  563:istore          7
	//* 287  565:goto            525
			f2 -= iteminfo1.widthFactor + f3;
	//  288  568:fload           4
	//  289  570:aload_3         
	//  290  571:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  291  574:fload           5
	//  292  576:fadd            
	//  293  577:fsub            
	//  294  578:fstore          4
			iteminfo1.offset = f2;
	//  295  580:aload_3         
	//  296  581:fload           4
	//  297  583:putfield        #250 <Field float ViewPager$ItemInfo.offset>
			if(iteminfo1.position == 0)
	//* 298  586:aload_3         
	//* 299  587:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 300  590:ifne            599
				mFirstOffset = f2;
	//  301  593:aload_0         
	//  302  594:fload           4
	//  303  596:putfield        #205 <Field float mFirstOffset>
			i1--;
	//  304  599:iload           8
	//  305  601:iconst_1        
	//  306  602:isub            
	//  307  603:istore          8
			j--;
	//  308  605:iload           7
	//  309  607:iconst_1        
	//  310  608:isub            
	//  311  609:istore          7
		}
	//* 312  611:goto            507
		f2 = iteminfo.offset + iteminfo.widthFactor + f3;
	//  313  614:aload_1         
	//  314  615:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  315  618:aload_1         
	//  316  619:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  317  622:fadd            
	//  318  623:fload           5
	//  319  625:fadd            
	//  320  626:fstore          4
		i1 = iteminfo.position + 1;
	//  321  628:aload_1         
	//  322  629:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  323  632:iconst_1        
	//  324  633:iadd            
	//  325  634:istore          8
		j = i + 1;
	//  326  636:iload_2         
	//  327  637:iconst_1        
	//  328  638:iadd            
	//  329  639:istore          7
		for(i = i1; j < k2; i++)
	//* 330  641:iload           8
	//* 331  643:istore_2        
	//* 332  644:iload           7
	//* 333  646:iload           11
	//* 334  648:icmpge          756
		{
			int j1;
			for(iteminfo = (ItemInfo)mItems.get(j); i < iteminfo.position; i = j1)
	//* 335  651:aload_0         
	//* 336  652:getfield        #188 <Field ArrayList mItems>
	//* 337  655:iload           7
	//* 338  657:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 339  660:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 340  663:astore_1        
	//* 341  664:iload_2         
	//* 342  665:aload_1         
	//* 343  666:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 344  669:icmpge          701
			{
				iteminfo1 = ((ItemInfo) (mAdapter));
	//  345  672:aload_0         
	//  346  673:getfield        #233 <Field PagerAdapter mAdapter>
	//  347  676:astore_3        
				j1 = i + 1;
	//  348  677:iload_2         
	//  349  678:iconst_1        
	//  350  679:iadd            
	//  351  680:istore          8
				f2 += ((PagerAdapter) (iteminfo1)).getPageWidth(i) + f3;
	//  352  682:fload           4
	//  353  684:aload_3         
	//  354  685:iload_2         
	//  355  686:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//  356  689:fload           5
	//  357  691:fadd            
	//  358  692:fadd            
	//  359  693:fstore          4
			}

	//  360  695:iload           8
	//  361  697:istore_2        
	//* 362  698:goto            664
			if(iteminfo.position == j2 - 1)
	//* 363  701:aload_1         
	//* 364  702:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 365  705:iload           10
	//* 366  707:iconst_1        
	//* 367  708:isub            
	//* 368  709:icmpne          725
				mLastOffset = (iteminfo.widthFactor + f2) - 1.0F;
	//  369  712:aload_0         
	//  370  713:aload_1         
	//  371  714:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  372  717:fload           4
	//  373  719:fadd            
	//  374  720:fconst_1        
	//  375  721:fsub            
	//  376  722:putfield        #208 <Field float mLastOffset>
			iteminfo.offset = f2;
	//  377  725:aload_1         
	//  378  726:fload           4
	//  379  728:putfield        #250 <Field float ViewPager$ItemInfo.offset>
			f2 += iteminfo.widthFactor + f3;
	//  380  731:fload           4
	//  381  733:aload_1         
	//  382  734:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  383  737:fload           5
	//  384  739:fadd            
	//  385  740:fadd            
	//  386  741:fstore          4
			j++;
	//  387  743:iload           7
	//  388  745:iconst_1        
	//  389  746:iadd            
	//  390  747:istore          7
		}

	//  391  749:iload_2         
	//  392  750:iconst_1        
	//  393  751:iadd            
	//  394  752:istore_2        
	//* 395  753:goto            644
		mNeedCalculatePageOffsets = false;
	//  396  756:aload_0         
	//  397  757:iconst_0        
	//  398  758:putfield        #216 <Field boolean mNeedCalculatePageOffsets>
	//  399  761:return          
	}

	private void completeScroll(boolean flag)
	{
		boolean flag1;
		if(mScrollState == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #223 <Field int mScrollState>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          13
			flag1 = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		else
	//*   6   10:goto            15
			flag1 = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		if(flag1)
	//*   9   15:iload_2         
	//*  10   16:ifeq            115
		{
			setScrollingCacheEnabled(false);
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
			boolean flag2;
			if(!mScroller.isFinished())
	//*  14   24:aload_0         
	//*  15   25:getfield        #271 <Field Scroller mScroller>
	//*  16   28:invokevirtual   #277 <Method boolean Scroller.isFinished()>
	//*  17   31:ifne            39
				flag2 = true;
	//   18   34:iconst_1        
	//   19   35:istore_3        
			else
	//*  20   36:goto            41
				flag2 = false;
	//   21   39:iconst_0        
	//   22   40:istore_3        
			if(flag2)
	//*  23   41:iload_3         
	//*  24   42:ifeq            115
			{
				mScroller.abortAnimation();
	//   25   45:aload_0         
	//   26   46:getfield        #271 <Field Scroller mScroller>
	//   27   49:invokevirtual   #280 <Method void Scroller.abortAnimation()>
				int i = getScrollX();
	//   28   52:aload_0         
	//   29   53:invokevirtual   #283 <Method int getScrollX()>
	//   30   56:istore_3        
				int k = getScrollY();
	//   31   57:aload_0         
	//   32   58:invokevirtual   #286 <Method int getScrollY()>
	//   33   61:istore          4
				int l = mScroller.getCurrX();
	//   34   63:aload_0         
	//   35   64:getfield        #271 <Field Scroller mScroller>
	//   36   67:invokevirtual   #289 <Method int Scroller.getCurrX()>
	//   37   70:istore          5
				int i1 = mScroller.getCurrY();
	//   38   72:aload_0         
	//   39   73:getfield        #271 <Field Scroller mScroller>
	//   40   76:invokevirtual   #292 <Method int Scroller.getCurrY()>
	//   41   79:istore          6
				if(i != l || k != i1)
	//*  42   81:iload_3         
	//*  43   82:iload           5
	//*  44   84:icmpne          94
	//*  45   87:iload           4
	//*  46   89:iload           6
	//*  47   91:icmpeq          115
				{
					scrollTo(l, i1);
	//   48   94:aload_0         
	//   49   95:iload           5
	//   50   97:iload           6
	//   51   99:invokevirtual   #296 <Method void scrollTo(int, int)>
					if(l != i)
	//*  52  102:iload           5
	//*  53  104:iload_3         
	//*  54  105:icmpeq          115
						pageScrolled(l);
	//   55  108:aload_0         
	//   56  109:iload           5
	//   57  111:invokespecial   #300 <Method boolean pageScrolled(int)>
	//   58  114:pop             
				}
			}
		}
		mPopulatePending = false;
	//   59  115:aload_0         
	//   60  116:iconst_0        
	//   61  117:putfield        #302 <Field boolean mPopulatePending>
		for(int j = 0; j < mItems.size(); j++)
	//*  62  120:iconst_0        
	//*  63  121:istore_3        
	//*  64  122:iload_3         
	//*  65  123:aload_0         
	//*  66  124:getfield        #188 <Field ArrayList mItems>
	//*  67  127:invokevirtual   #256 <Method int ArrayList.size()>
	//*  68  130:icmpge          169
		{
			ItemInfo iteminfo = (ItemInfo)mItems.get(j);
	//   69  133:aload_0         
	//   70  134:getfield        #188 <Field ArrayList mItems>
	//   71  137:iload_3         
	//   72  138:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   73  141:checkcast       #17  <Class ViewPager$ItemInfo>
	//   74  144:astore          7
			if(iteminfo.scrolling)
	//*  75  146:aload           7
	//*  76  148:getfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>
	//*  77  151:ifeq            162
			{
				flag1 = true;
	//   78  154:iconst_1        
	//   79  155:istore_2        
				iteminfo.scrolling = false;
	//   80  156:aload           7
	//   81  158:iconst_0        
	//   82  159:putfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>
			}
		}

	//   83  162:iload_3         
	//   84  163:iconst_1        
	//   85  164:iadd            
	//   86  165:istore_3        
	//*  87  166:goto            122
		if(flag1)
	//*  88  169:iload_2         
	//*  89  170:ifeq            195
		{
			if(flag)
	//*  90  173:iload_1         
	//*  91  174:ifeq            186
			{
				ViewCompat.postOnAnimation(((View) (this)), mEndScrollRunnable);
	//   92  177:aload_0         
	//   93  178:aload_0         
	//   94  179:getfield        #221 <Field Runnable mEndScrollRunnable>
	//   95  182:invokestatic    #311 <Method void ViewCompat.postOnAnimation(View, Runnable)>
				return;
	//   96  185:return          
			}
			mEndScrollRunnable.run();
	//   97  186:aload_0         
	//   98  187:getfield        #221 <Field Runnable mEndScrollRunnable>
	//   99  190:invokeinterface #316 <Method void Runnable.run()>
		}
	//  100  195:return          
	}

	private int determineTargetPage(int i, float f, int j, int k)
	{
		if(Math.abs(k) > mFlingDistance && Math.abs(j) > mMinimumVelocity)
	//*   0    0:iload           4
	//*   1    2:invokestatic    #324 <Method int Math.abs(int)>
	//*   2    5:aload_0         
	//*   3    6:getfield        #326 <Field int mFlingDistance>
	//*   4    9:icmple          37
	//*   5   12:iload_3         
	//*   6   13:invokestatic    #324 <Method int Math.abs(int)>
	//*   7   16:aload_0         
	//*   8   17:getfield        #328 <Field int mMinimumVelocity>
	//*   9   20:icmple          37
		{
			if(j <= 0)
	//*  10   23:iload_3         
	//*  11   24:ifle            30
	//*  12   27:goto            34
				i++;
	//   13   30:iload_1         
	//   14   31:iconst_1        
	//   15   32:iadd            
	//   16   33:istore_1        
		} else
	//*  17   34:goto            66
		{
			float f1;
			if(i >= mCurItem)
	//*  18   37:iload_1         
	//*  19   38:aload_0         
	//*  20   39:getfield        #330 <Field int mCurItem>
	//*  21   42:icmplt          53
				f1 = 0.4F;
	//   22   45:ldc2            #331 <Float 0.4F>
	//   23   48:fstore          5
			else
	//*  24   50:goto            58
				f1 = 0.6F;
	//   25   53:ldc2            #332 <Float 0.6F>
	//   26   56:fstore          5
			i += (int)(f + f1);
	//   27   58:iload_1         
	//   28   59:fload_2         
	//   29   60:fload           5
	//   30   62:fadd            
	//   31   63:f2i             
	//   32   64:iadd            
	//   33   65:istore_1        
		}
		j = i;
	//   34   66:iload_1         
	//   35   67:istore_3        
		if(mItems.size() > 0)
	//*  36   68:aload_0         
	//*  37   69:getfield        #188 <Field ArrayList mItems>
	//*  38   72:invokevirtual   #256 <Method int ArrayList.size()>
	//*  39   75:ifle            130
		{
			ItemInfo iteminfo = (ItemInfo)mItems.get(0);
	//   40   78:aload_0         
	//   41   79:getfield        #188 <Field ArrayList mItems>
	//   42   82:iconst_0        
	//   43   83:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   44   86:checkcast       #17  <Class ViewPager$ItemInfo>
	//   45   89:astore          6
			ItemInfo iteminfo1 = (ItemInfo)mItems.get(mItems.size() - 1);
	//   46   91:aload_0         
	//   47   92:getfield        #188 <Field ArrayList mItems>
	//   48   95:aload_0         
	//   49   96:getfield        #188 <Field ArrayList mItems>
	//   50   99:invokevirtual   #256 <Method int ArrayList.size()>
	//   51  102:iconst_1        
	//   52  103:isub            
	//   53  104:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   54  107:checkcast       #17  <Class ViewPager$ItemInfo>
	//   55  110:astore          7
			j = Math.max(iteminfo.position, Math.min(i, iteminfo1.position));
	//   56  112:aload           6
	//   57  114:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   58  117:iload_1         
	//   59  118:aload           7
	//   60  120:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   61  123:invokestatic    #336 <Method int Math.min(int, int)>
	//   62  126:invokestatic    #339 <Method int Math.max(int, int)>
	//   63  129:istore_3        
		}
		return j;
	//   64  130:iload_3         
	//   65  131:ireturn         
	}

	private void dispatchOnPageScrolled(int i, float f, int j)
	{
		if(mOnPageChangeListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #343 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//*   2    4:ifnull          19
			mOnPageChangeListener.onPageScrolled(i, f, j);
	//    3    7:aload_0         
	//    4    8:getfield        #343 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//    5   11:iload_1         
	//    6   12:fload_2         
	//    7   13:iload_3         
	//    8   14:invokeinterface #346 <Method void ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
		if(mOnPageChangeListeners != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #348 <Field List mOnPageChangeListeners>
	//*  11   23:ifnull          87
		{
			int k = 0;
	//   12   26:iconst_0        
	//   13   27:istore          4
			for(int l = mOnPageChangeListeners.size(); k < l; k++)
	//*  14   29:aload_0         
	//*  15   30:getfield        #348 <Field List mOnPageChangeListeners>
	//*  16   33:invokeinterface #351 <Method int List.size()>
	//*  17   38:istore          5
	//*  18   40:iload           4
	//*  19   42:iload           5
	//*  20   44:icmpge          87
			{
				OnPageChangeListener onpagechangelistener = (OnPageChangeListener)mOnPageChangeListeners.get(k);
	//   21   47:aload_0         
	//   22   48:getfield        #348 <Field List mOnPageChangeListeners>
	//   23   51:iload           4
	//   24   53:invokeinterface #352 <Method Object List.get(int)>
	//   25   58:checkcast       #29  <Class ViewPager$OnPageChangeListener>
	//   26   61:astore          6
				if(onpagechangelistener != null)
	//*  27   63:aload           6
	//*  28   65:ifnull          78
					onpagechangelistener.onPageScrolled(i, f, j);
	//   29   68:aload           6
	//   30   70:iload_1         
	//   31   71:fload_2         
	//   32   72:iload_3         
	//   33   73:invokeinterface #346 <Method void ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
			}

	//   34   78:iload           4
	//   35   80:iconst_1        
	//   36   81:iadd            
	//   37   82:istore          4
		}
	//*  38   84:goto            40
		if(mInternalPageChangeListener != null)
	//*  39   87:aload_0         
	//*  40   88:getfield        #354 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//*  41   91:ifnull          106
			mInternalPageChangeListener.onPageScrolled(i, f, j);
	//   42   94:aload_0         
	//   43   95:getfield        #354 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//   44   98:iload_1         
	//   45   99:fload_2         
	//   46  100:iload_3         
	//   47  101:invokeinterface #346 <Method void ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
	//   48  106:return          
	}

	private void dispatchOnPageSelected(int i)
	{
		if(mOnPageChangeListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #343 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//*   2    4:ifnull          17
			mOnPageChangeListener.onPageSelected(i);
	//    3    7:aload_0         
	//    4    8:getfield        #343 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//    5   11:iload_1         
	//    6   12:invokeinterface #359 <Method void ViewPager$OnPageChangeListener.onPageSelected(int)>
		if(mOnPageChangeListeners != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #348 <Field List mOnPageChangeListeners>
	//*   9   21:ifnull          76
		{
			int j = 0;
	//   10   24:iconst_0        
	//   11   25:istore_2        
			for(int k = mOnPageChangeListeners.size(); j < k; j++)
	//*  12   26:aload_0         
	//*  13   27:getfield        #348 <Field List mOnPageChangeListeners>
	//*  14   30:invokeinterface #351 <Method int List.size()>
	//*  15   35:istore_3        
	//*  16   36:iload_2         
	//*  17   37:iload_3         
	//*  18   38:icmpge          76
			{
				OnPageChangeListener onpagechangelistener = (OnPageChangeListener)mOnPageChangeListeners.get(j);
	//   19   41:aload_0         
	//   20   42:getfield        #348 <Field List mOnPageChangeListeners>
	//   21   45:iload_2         
	//   22   46:invokeinterface #352 <Method Object List.get(int)>
	//   23   51:checkcast       #29  <Class ViewPager$OnPageChangeListener>
	//   24   54:astore          4
				if(onpagechangelistener != null)
	//*  25   56:aload           4
	//*  26   58:ifnull          69
					onpagechangelistener.onPageSelected(i);
	//   27   61:aload           4
	//   28   63:iload_1         
	//   29   64:invokeinterface #359 <Method void ViewPager$OnPageChangeListener.onPageSelected(int)>
			}

	//   30   69:iload_2         
	//   31   70:iconst_1        
	//   32   71:iadd            
	//   33   72:istore_2        
		}
	//*  34   73:goto            36
		if(mInternalPageChangeListener != null)
	//*  35   76:aload_0         
	//*  36   77:getfield        #354 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//*  37   80:ifnull          93
			mInternalPageChangeListener.onPageSelected(i);
	//   38   83:aload_0         
	//   39   84:getfield        #354 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//   40   87:iload_1         
	//   41   88:invokeinterface #359 <Method void ViewPager$OnPageChangeListener.onPageSelected(int)>
	//   42   93:return          
	}

	private void dispatchOnScrollStateChanged(int i)
	{
		if(mOnPageChangeListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #343 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//*   2    4:ifnull          17
			mOnPageChangeListener.onPageScrollStateChanged(i);
	//    3    7:aload_0         
	//    4    8:getfield        #343 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//    5   11:iload_1         
	//    6   12:invokeinterface #363 <Method void ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
		if(mOnPageChangeListeners != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #348 <Field List mOnPageChangeListeners>
	//*   9   21:ifnull          76
		{
			int j = 0;
	//   10   24:iconst_0        
	//   11   25:istore_2        
			for(int k = mOnPageChangeListeners.size(); j < k; j++)
	//*  12   26:aload_0         
	//*  13   27:getfield        #348 <Field List mOnPageChangeListeners>
	//*  14   30:invokeinterface #351 <Method int List.size()>
	//*  15   35:istore_3        
	//*  16   36:iload_2         
	//*  17   37:iload_3         
	//*  18   38:icmpge          76
			{
				OnPageChangeListener onpagechangelistener = (OnPageChangeListener)mOnPageChangeListeners.get(j);
	//   19   41:aload_0         
	//   20   42:getfield        #348 <Field List mOnPageChangeListeners>
	//   21   45:iload_2         
	//   22   46:invokeinterface #352 <Method Object List.get(int)>
	//   23   51:checkcast       #29  <Class ViewPager$OnPageChangeListener>
	//   24   54:astore          4
				if(onpagechangelistener != null)
	//*  25   56:aload           4
	//*  26   58:ifnull          69
					onpagechangelistener.onPageScrollStateChanged(i);
	//   27   61:aload           4
	//   28   63:iload_1         
	//   29   64:invokeinterface #363 <Method void ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
			}

	//   30   69:iload_2         
	//   31   70:iconst_1        
	//   32   71:iadd            
	//   33   72:istore_2        
		}
	//*  34   73:goto            36
		if(mInternalPageChangeListener != null)
	//*  35   76:aload_0         
	//*  36   77:getfield        #354 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//*  37   80:ifnull          93
			mInternalPageChangeListener.onPageScrollStateChanged(i);
	//   38   83:aload_0         
	//   39   84:getfield        #354 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//   40   87:iload_1         
	//   41   88:invokeinterface #363 <Method void ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
	//   42   93:return          
	}

	private void enableLayers(boolean flag)
	{
		int k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #367 <Method int getChildCount()>
	//    2    4:istore          4
		for(int i = 0; i < k; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore_2        
	//*   5    8:iload_2         
	//*   6    9:iload           4
	//*   7   11:icmpge          45
		{
			int j;
			if(flag)
	//*   8   14:iload_1         
	//*   9   15:ifeq            26
				j = mPageTransformerLayerType;
	//   10   18:aload_0         
	//   11   19:getfield        #369 <Field int mPageTransformerLayerType>
	//   12   22:istore_3        
			else
	//*  13   23:goto            28
				j = 0;
	//   14   26:iconst_0        
	//   15   27:istore_3        
			getChildAt(i).setLayerType(j, ((android.graphics.Paint) (null)));
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #373 <Method View getChildAt(int)>
	//   19   33:iload_3         
	//   20   34:aconst_null     
	//   21   35:invokevirtual   #379 <Method void View.setLayerType(int, android.graphics.Paint)>
		}

	//   22   38:iload_2         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_2        
	//*  26   42:goto            8
	//   27   45:return          
	}

	private void endDrag()
	{
		mIsBeingDragged = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #382 <Field boolean mIsBeingDragged>
		mIsUnableToDrag = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #384 <Field boolean mIsUnableToDrag>
		if(mVelocityTracker != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//*   8   14:ifnull          29
		{
			mVelocityTracker.recycle();
	//    9   17:aload_0         
	//   10   18:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//   11   21:invokevirtual   #391 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:putfield        #386 <Field VelocityTracker mVelocityTracker>
		}
	//   15   29:return          
	}

	private Rect getChildRectInPagerCoordinates(Rect rect, View view)
	{
		Rect rect1 = rect;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(rect == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       14
			rect1 = new Rect();
	//    4    6:new             #193 <Class Rect>
	//    5    9:dup             
	//    6   10:invokespecial   #194 <Method void Rect()>
	//    7   13:astore_3        
		if(view == null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       28
		{
			rect1.set(0, 0, 0, 0);
	//   10   18:aload_3         
	//   11   19:iconst_0        
	//   12   20:iconst_0        
	//   13   21:iconst_0        
	//   14   22:iconst_0        
	//   15   23:invokevirtual   #397 <Method void Rect.set(int, int, int, int)>
			return rect1;
	//   16   26:aload_3         
	//   17   27:areturn         
		}
		rect1.left = view.getLeft();
	//   18   28:aload_3         
	//   19   29:aload_2         
	//   20   30:invokevirtual   #400 <Method int View.getLeft()>
	//   21   33:putfield        #403 <Field int Rect.left>
		rect1.right = view.getRight();
	//   22   36:aload_3         
	//   23   37:aload_2         
	//   24   38:invokevirtual   #406 <Method int View.getRight()>
	//   25   41:putfield        #409 <Field int Rect.right>
		rect1.top = view.getTop();
	//   26   44:aload_3         
	//   27   45:aload_2         
	//   28   46:invokevirtual   #412 <Method int View.getTop()>
	//   29   49:putfield        #415 <Field int Rect.top>
		rect1.bottom = view.getBottom();
	//   30   52:aload_3         
	//   31   53:aload_2         
	//   32   54:invokevirtual   #418 <Method int View.getBottom()>
	//   33   57:putfield        #421 <Field int Rect.bottom>
		for(rect = ((Rect) (view.getParent())); (rect instanceof ViewGroup) && rect != this; rect = ((Rect) (((ViewGroup) (rect)).getParent())))
	//*  34   60:aload_2         
	//*  35   61:invokevirtual   #425 <Method ViewParent View.getParent()>
	//*  36   64:astore_1        
	//*  37   65:aload_1         
	//*  38   66:instanceof      #4   <Class ViewGroup>
	//*  39   69:ifeq            142
	//*  40   72:aload_1         
	//*  41   73:aload_0         
	//*  42   74:if_acmpeq       142
		{
			rect = ((Rect) ((ViewGroup)rect));
	//   43   77:aload_1         
	//   44   78:checkcast       #4   <Class ViewGroup>
	//   45   81:astore_1        
			rect1.left = rect1.left + ((ViewGroup) (rect)).getLeft();
	//   46   82:aload_3         
	//   47   83:aload_3         
	//   48   84:getfield        #403 <Field int Rect.left>
	//   49   87:aload_1         
	//   50   88:invokevirtual   #426 <Method int ViewGroup.getLeft()>
	//   51   91:iadd            
	//   52   92:putfield        #403 <Field int Rect.left>
			rect1.right = rect1.right + ((ViewGroup) (rect)).getRight();
	//   53   95:aload_3         
	//   54   96:aload_3         
	//   55   97:getfield        #409 <Field int Rect.right>
	//   56  100:aload_1         
	//   57  101:invokevirtual   #427 <Method int ViewGroup.getRight()>
	//   58  104:iadd            
	//   59  105:putfield        #409 <Field int Rect.right>
			rect1.top = rect1.top + ((ViewGroup) (rect)).getTop();
	//   60  108:aload_3         
	//   61  109:aload_3         
	//   62  110:getfield        #415 <Field int Rect.top>
	//   63  113:aload_1         
	//   64  114:invokevirtual   #428 <Method int ViewGroup.getTop()>
	//   65  117:iadd            
	//   66  118:putfield        #415 <Field int Rect.top>
			rect1.bottom = rect1.bottom + ((ViewGroup) (rect)).getBottom();
	//   67  121:aload_3         
	//   68  122:aload_3         
	//   69  123:getfield        #421 <Field int Rect.bottom>
	//   70  126:aload_1         
	//   71  127:invokevirtual   #429 <Method int ViewGroup.getBottom()>
	//   72  130:iadd            
	//   73  131:putfield        #421 <Field int Rect.bottom>
		}

	//   74  134:aload_1         
	//   75  135:invokevirtual   #430 <Method ViewParent ViewGroup.getParent()>
	//   76  138:astore_1        
	//*  77  139:goto            65
		return rect1;
	//   78  142:aload_3         
	//   79  143:areturn         
	}

	private int getClientWidth()
	{
		return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #433 <Method int getMeasuredWidth()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #436 <Method int getPaddingLeft()>
	//    4    8:isub            
	//    5    9:aload_0         
	//    6   10:invokevirtual   #439 <Method int getPaddingRight()>
	//    7   13:isub            
	//    8   14:ireturn         
	}

	private ItemInfo infoForCurrentScrollPosition()
	{
		int i = getClientWidth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #242 <Method int getClientWidth()>
	//    2    4:istore          5
		float f;
		if(i > 0)
	//*   3    6:iload           5
	//*   4    8:ifle            24
			f = (float)getScrollX() / (float)i;
	//    5   11:aload_0         
	//    6   12:invokevirtual   #283 <Method int getScrollX()>
	//    7   15:i2f             
	//    8   16:iload           5
	//    9   18:i2f             
	//   10   19:fdiv            
	//   11   20:fstore_1        
		else
	//*  12   21:goto            26
			f = 0.0F;
	//   13   24:fconst_0        
	//   14   25:fstore_1        
		float f1;
		if(i > 0)
	//*  15   26:iload           5
	//*  16   28:ifle            44
			f1 = (float)mPageMargin / (float)i;
	//   17   31:aload_0         
	//   18   32:getfield        #244 <Field int mPageMargin>
	//   19   35:i2f             
	//   20   36:iload           5
	//   21   38:i2f             
	//   22   39:fdiv            
	//   23   40:fstore_2        
		else
	//*  24   41:goto            46
			f1 = 0.0F;
	//   25   44:fconst_0        
	//   26   45:fstore_2        
		int k = -1;
	//   27   46:iconst_m1       
	//   28   47:istore          7
		float f2 = 0.0F;
	//   29   49:fconst_0        
	//   30   50:fstore_3        
		float f3 = 0.0F;
	//   31   51:fconst_0        
	//   32   52:fstore          4
		boolean flag = true;
	//   33   54:iconst_1        
	//   34   55:istore          6
		ItemInfo iteminfo1 = null;
	//   35   57:aconst_null     
	//   36   58:astore          10
		for(int j = 0; j < mItems.size();)
	//*  37   60:iconst_0        
	//*  38   61:istore          5
	//*  39   63:iload           5
	//*  40   65:aload_0         
	//*  41   66:getfield        #188 <Field ArrayList mItems>
	//*  42   69:invokevirtual   #256 <Method int ArrayList.size()>
	//*  43   72:icmpge          256
		{
			ItemInfo iteminfo2 = (ItemInfo)mItems.get(j);
	//   44   75:aload_0         
	//   45   76:getfield        #188 <Field ArrayList mItems>
	//   46   79:iload           5
	//   47   81:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   48   84:checkcast       #17  <Class ViewPager$ItemInfo>
	//   49   87:astore          11
			int l = j;
	//   50   89:iload           5
	//   51   91:istore          8
			ItemInfo iteminfo = iteminfo2;
	//   52   93:aload           11
	//   53   95:astore          9
			if(!flag)
	//*  54   97:iload           6
	//*  55   99:ifne            171
			{
				l = j;
	//   56  102:iload           5
	//   57  104:istore          8
				iteminfo = iteminfo2;
	//   58  106:aload           11
	//   59  108:astore          9
				if(iteminfo2.position != k + 1)
	//*  60  110:aload           11
	//*  61  112:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  62  115:iload           7
	//*  63  117:iconst_1        
	//*  64  118:iadd            
	//*  65  119:icmpeq          171
				{
					iteminfo = mTempItem;
	//   66  122:aload_0         
	//   67  123:getfield        #191 <Field ViewPager$ItemInfo mTempItem>
	//   68  126:astore          9
					iteminfo.offset = f2 + f3 + f1;
	//   69  128:aload           9
	//   70  130:fload_3         
	//   71  131:fload           4
	//   72  133:fadd            
	//   73  134:fload_2         
	//   74  135:fadd            
	//   75  136:putfield        #250 <Field float ViewPager$ItemInfo.offset>
					iteminfo.position = k + 1;
	//   76  139:aload           9
	//   77  141:iload           7
	//   78  143:iconst_1        
	//   79  144:iadd            
	//   80  145:putfield        #247 <Field int ViewPager$ItemInfo.position>
					iteminfo.widthFactor = mAdapter.getPageWidth(iteminfo.position);
	//   81  148:aload           9
	//   82  150:aload_0         
	//   83  151:getfield        #233 <Field PagerAdapter mAdapter>
	//   84  154:aload           9
	//   85  156:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   86  159:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//   87  162:putfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
					l = j - 1;
	//   88  165:iload           5
	//   89  167:iconst_1        
	//   90  168:isub            
	//   91  169:istore          8
				}
			}
			f2 = iteminfo.offset;
	//   92  171:aload           9
	//   93  173:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   94  176:fstore_3        
			f3 = iteminfo.widthFactor;
	//   95  177:aload           9
	//   96  179:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//   97  182:fstore          4
			if(flag || f >= f2)
	//*  98  184:iload           6
	//*  99  186:ifne            195
	//* 100  189:fload_1         
	//* 101  190:fload_3         
	//* 102  191:fcmpl           
	//* 103  192:iflt            223
			{
				if(f < f3 + f2 + f1 || l == mItems.size() - 1)
	//* 104  195:fload_1         
	//* 105  196:fload           4
	//* 106  198:fload_3         
	//* 107  199:fadd            
	//* 108  200:fload_2         
	//* 109  201:fadd            
	//* 110  202:fcmpg           
	//* 111  203:iflt            220
	//* 112  206:iload           8
	//* 113  208:aload_0         
	//* 114  209:getfield        #188 <Field ArrayList mItems>
	//* 115  212:invokevirtual   #256 <Method int ArrayList.size()>
	//* 116  215:iconst_1        
	//* 117  216:isub            
	//* 118  217:icmpne          226
					return iteminfo;
	//  119  220:aload           9
	//  120  222:areturn         
			} else
			{
				return iteminfo1;
	//  121  223:aload           10
	//  122  225:areturn         
			}
			flag = false;
	//  123  226:iconst_0        
	//  124  227:istore          6
			k = iteminfo.position;
	//  125  229:aload           9
	//  126  231:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  127  234:istore          7
			f3 = iteminfo.widthFactor;
	//  128  236:aload           9
	//  129  238:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  130  241:fstore          4
			j = l + 1;
	//  131  243:iload           8
	//  132  245:iconst_1        
	//  133  246:iadd            
	//  134  247:istore          5
			iteminfo1 = iteminfo;
	//  135  249:aload           9
	//  136  251:astore          10
		}

	//* 137  253:goto            63
		return iteminfo1;
	//  138  256:aload           10
	//  139  258:areturn         
	}

	private static boolean isDecorView(View view)
	{
		return ((Object) (view)).getClass().getAnnotation(android/support/v4/view/ViewPager$DecorView) != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #450 <Method Class Object.getClass()>
	//    2    4:ldc1            #14  <Class ViewPager$DecorView>
	//    3    6:invokevirtual   #456 <Method Annotation Class.getAnnotation(Class)>
	//    4    9:ifnull          14
	//    5   12:iconst_1        
	//    6   13:ireturn         
	//    7   14:iconst_0        
	//    8   15:ireturn         
	}

	private boolean isGutterDrag(float f, float f1)
	{
		return f < (float)mGutterSize && f1 > 0.0F || f > (float)(getWidth() - mGutterSize) && f1 < 0.0F;
	//    0    0:fload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #461 <Field int mGutterSize>
	//    3    5:i2f             
	//    4    6:fcmpg           
	//    5    7:ifge            16
	//    6   10:fload_2         
	//    7   11:fconst_0        
	//    8   12:fcmpl           
	//    9   13:ifgt            37
	//   10   16:fload_1         
	//   11   17:aload_0         
	//   12   18:invokevirtual   #464 <Method int getWidth()>
	//   13   21:aload_0         
	//   14   22:getfield        #461 <Field int mGutterSize>
	//   15   25:isub            
	//   16   26:i2f             
	//   17   27:fcmpl           
	//   18   28:ifle            39
	//   19   31:fload_2         
	//   20   32:fconst_0        
	//   21   33:fcmpg           
	//   22   34:ifge            39
	//   23   37:iconst_1        
	//   24   38:ireturn         
	//   25   39:iconst_0        
	//   26   40:ireturn         
	}

	private void onSecondaryPointerUp(MotionEvent motionevent)
	{
		int i = motionevent.getActionIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #471 <Method int MotionEvent.getActionIndex()>
	//    2    4:istore_2        
		if(motionevent.getPointerId(i) == mActivePointerId)
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #474 <Method int MotionEvent.getPointerId(int)>
	//*   6   10:aload_0         
	//*   7   11:getfield        #212 <Field int mActivePointerId>
	//*   8   14:icmpne          60
		{
			if(i == 0)
	//*   9   17:iload_2         
	//*  10   18:ifne            26
				i = 1;
	//   11   21:iconst_1        
	//   12   22:istore_2        
			else
	//*  13   23:goto            28
				i = 0;
	//   14   26:iconst_0        
	//   15   27:istore_2        
			mLastMotionX = motionevent.getX(i);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:iload_2         
	//   19   31:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//   20   34:putfield        #479 <Field float mLastMotionX>
			mActivePointerId = motionevent.getPointerId(i);
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:iload_2         
	//   24   40:invokevirtual   #474 <Method int MotionEvent.getPointerId(int)>
	//   25   43:putfield        #212 <Field int mActivePointerId>
			if(mVelocityTracker != null)
	//*  26   46:aload_0         
	//*  27   47:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//*  28   50:ifnull          60
				mVelocityTracker.clear();
	//   29   53:aload_0         
	//   30   54:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//   31   57:invokevirtual   #482 <Method void VelocityTracker.clear()>
		}
	//   32   60:return          
	}

	private boolean pageScrolled(int i)
	{
		if(mItems.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #188 <Field ArrayList mItems>
	//*   2    4:invokevirtual   #256 <Method int ArrayList.size()>
	//*   3    7:ifne            51
		{
			if(mFirstLayout)
	//*   4   10:aload_0         
	//*   5   11:getfield        #214 <Field boolean mFirstLayout>
	//*   6   14:ifeq            19
				return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
			mCalledSuper = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #484 <Field boolean mCalledSuper>
			onPageScrolled(0, 0.0F, 0);
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:fconst_0        
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #485 <Method void onPageScrolled(int, float, int)>
			if(!mCalledSuper)
	//*  17   31:aload_0         
	//*  18   32:getfield        #484 <Field boolean mCalledSuper>
	//*  19   35:ifne            49
				throw new IllegalStateException("onPageScrolled did not call superclass implementation");
	//   20   38:new             #487 <Class IllegalStateException>
	//   21   41:dup             
	//   22   42:ldc2            #489 <String "onPageScrolled did not call superclass implementation">
	//   23   45:invokespecial   #492 <Method void IllegalStateException(String)>
	//   24   48:athrow          
			else
				return false;
	//   25   49:iconst_0        
	//   26   50:ireturn         
		}
		ItemInfo iteminfo = infoForCurrentScrollPosition();
	//   27   51:aload_0         
	//   28   52:invokespecial   #494 <Method ViewPager$ItemInfo infoForCurrentScrollPosition()>
	//   29   55:astore          6
		int k = getClientWidth();
	//   30   57:aload_0         
	//   31   58:invokespecial   #242 <Method int getClientWidth()>
	//   32   61:istore          4
		int l = mPageMargin;
	//   33   63:aload_0         
	//   34   64:getfield        #244 <Field int mPageMargin>
	//   35   67:istore          5
		float f = (float)mPageMargin / (float)k;
	//   36   69:aload_0         
	//   37   70:getfield        #244 <Field int mPageMargin>
	//   38   73:i2f             
	//   39   74:iload           4
	//   40   76:i2f             
	//   41   77:fdiv            
	//   42   78:fstore_2        
		int j = iteminfo.position;
	//   43   79:aload           6
	//   44   81:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   45   84:istore_3        
		f = ((float)i / (float)k - iteminfo.offset) / (iteminfo.widthFactor + f);
	//   46   85:iload_1         
	//   47   86:i2f             
	//   48   87:iload           4
	//   49   89:i2f             
	//   50   90:fdiv            
	//   51   91:aload           6
	//   52   93:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   53   96:fsub            
	//   54   97:aload           6
	//   55   99:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//   56  102:fload_2         
	//   57  103:fadd            
	//   58  104:fdiv            
	//   59  105:fstore_2        
		i = (int)((float)(k + l) * f);
	//   60  106:iload           4
	//   61  108:iload           5
	//   62  110:iadd            
	//   63  111:i2f             
	//   64  112:fload_2         
	//   65  113:fmul            
	//   66  114:f2i             
	//   67  115:istore_1        
		mCalledSuper = false;
	//   68  116:aload_0         
	//   69  117:iconst_0        
	//   70  118:putfield        #484 <Field boolean mCalledSuper>
		onPageScrolled(j, f, i);
	//   71  121:aload_0         
	//   72  122:iload_3         
	//   73  123:fload_2         
	//   74  124:iload_1         
	//   75  125:invokevirtual   #485 <Method void onPageScrolled(int, float, int)>
		if(!mCalledSuper)
	//*  76  128:aload_0         
	//*  77  129:getfield        #484 <Field boolean mCalledSuper>
	//*  78  132:ifne            146
			throw new IllegalStateException("onPageScrolled did not call superclass implementation");
	//   79  135:new             #487 <Class IllegalStateException>
	//   80  138:dup             
	//   81  139:ldc2            #489 <String "onPageScrolled did not call superclass implementation">
	//   82  142:invokespecial   #492 <Method void IllegalStateException(String)>
	//   83  145:athrow          
		else
			return true;
	//   84  146:iconst_1        
	//   85  147:ireturn         
	}

	private boolean performDrag(float f)
	{
		boolean flag3 = false;
	//    0    0:iconst_0        
	//    1    1:istore          8
		boolean flag4 = false;
	//    2    3:iconst_0        
	//    3    4:istore          9
		boolean flag2 = false;
	//    4    6:iconst_0        
	//    5    7:istore          7
		float f1 = mLastMotionX;
	//    6    9:aload_0         
	//    7   10:getfield        #479 <Field float mLastMotionX>
	//    8   13:fstore_2        
		mLastMotionX = f;
	//    9   14:aload_0         
	//   10   15:fload_1         
	//   11   16:putfield        #479 <Field float mLastMotionX>
		float f2 = (float)getScrollX() + (f1 - f);
	//   12   19:aload_0         
	//   13   20:invokevirtual   #283 <Method int getScrollX()>
	//   14   23:i2f             
	//   15   24:fload_2         
	//   16   25:fload_1         
	//   17   26:fsub            
	//   18   27:fadd            
	//   19   28:fstore_3        
		int i = getClientWidth();
	//   20   29:aload_0         
	//   21   30:invokespecial   #242 <Method int getClientWidth()>
	//   22   33:istore          6
		f = (float)i * mFirstOffset;
	//   23   35:iload           6
	//   24   37:i2f             
	//   25   38:aload_0         
	//   26   39:getfield        #205 <Field float mFirstOffset>
	//   27   42:fmul            
	//   28   43:fstore_1        
		f1 = (float)i * mLastOffset;
	//   29   44:iload           6
	//   30   46:i2f             
	//   31   47:aload_0         
	//   32   48:getfield        #208 <Field float mLastOffset>
	//   33   51:fmul            
	//   34   52:fstore_2        
		boolean flag = true;
	//   35   53:iconst_1        
	//   36   54:istore          4
		boolean flag1 = true;
	//   37   56:iconst_1        
	//   38   57:istore          5
		ItemInfo iteminfo = (ItemInfo)mItems.get(0);
	//   39   59:aload_0         
	//   40   60:getfield        #188 <Field ArrayList mItems>
	//   41   63:iconst_0        
	//   42   64:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   43   67:checkcast       #17  <Class ViewPager$ItemInfo>
	//   44   70:astore          10
		ItemInfo iteminfo1 = (ItemInfo)mItems.get(mItems.size() - 1);
	//   45   72:aload_0         
	//   46   73:getfield        #188 <Field ArrayList mItems>
	//   47   76:aload_0         
	//   48   77:getfield        #188 <Field ArrayList mItems>
	//   49   80:invokevirtual   #256 <Method int ArrayList.size()>
	//   50   83:iconst_1        
	//   51   84:isub            
	//   52   85:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   53   88:checkcast       #17  <Class ViewPager$ItemInfo>
	//   54   91:astore          11
		if(iteminfo.position != 0)
	//*  55   93:aload           10
	//*  56   95:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  57   98:ifeq            114
		{
			flag = false;
	//   58  101:iconst_0        
	//   59  102:istore          4
			f = iteminfo.offset * (float)i;
	//   60  104:aload           10
	//   61  106:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   62  109:iload           6
	//   63  111:i2f             
	//   64  112:fmul            
	//   65  113:fstore_1        
		}
		if(iteminfo1.position != mAdapter.getCount() - 1)
	//*  66  114:aload           11
	//*  67  116:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  68  119:aload_0         
	//*  69  120:getfield        #233 <Field PagerAdapter mAdapter>
	//*  70  123:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*  71  126:iconst_1        
	//*  72  127:isub            
	//*  73  128:icmpeq          144
		{
			flag1 = false;
	//   74  131:iconst_0        
	//   75  132:istore          5
			f1 = iteminfo1.offset * (float)i;
	//   76  134:aload           11
	//   77  136:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   78  139:iload           6
	//   79  141:i2f             
	//   80  142:fmul            
	//   81  143:fstore_2        
		}
		if(f2 < f)
	//*  82  144:fload_3         
	//*  83  145:fload_1         
	//*  84  146:fcmpg           
	//*  85  147:ifge            178
		{
			if(flag)
	//*  86  150:iload           4
	//*  87  152:ifeq            175
			{
				mLeftEdge.onPull(Math.abs(f - f2) / (float)i);
	//   88  155:aload_0         
	//   89  156:getfield        #498 <Field EdgeEffect mLeftEdge>
	//   90  159:fload_1         
	//   91  160:fload_3         
	//   92  161:fsub            
	//   93  162:invokestatic    #501 <Method float Math.abs(float)>
	//   94  165:iload           6
	//   95  167:i2f             
	//   96  168:fdiv            
	//   97  169:invokevirtual   #507 <Method void EdgeEffect.onPull(float)>
				flag2 = true;
	//   98  172:iconst_1        
	//   99  173:istore          7
			}
		} else
	//* 100  175:goto            221
		{
			flag2 = flag4;
	//  101  178:iload           9
	//  102  180:istore          7
			f = f2;
	//  103  182:fload_3         
	//  104  183:fstore_1        
			if(f2 > f1)
	//* 105  184:fload_3         
	//* 106  185:fload_2         
	//* 107  186:fcmpl           
	//* 108  187:ifle            221
			{
				flag2 = flag3;
	//  109  190:iload           8
	//  110  192:istore          7
				if(flag1)
	//* 111  194:iload           5
	//* 112  196:ifeq            219
				{
					mRightEdge.onPull(Math.abs(f2 - f1) / (float)i);
	//  113  199:aload_0         
	//  114  200:getfield        #509 <Field EdgeEffect mRightEdge>
	//  115  203:fload_3         
	//  116  204:fload_2         
	//  117  205:fsub            
	//  118  206:invokestatic    #501 <Method float Math.abs(float)>
	//  119  209:iload           6
	//  120  211:i2f             
	//  121  212:fdiv            
	//  122  213:invokevirtual   #507 <Method void EdgeEffect.onPull(float)>
					flag2 = true;
	//  123  216:iconst_1        
	//  124  217:istore          7
				}
				f = f1;
	//  125  219:fload_2         
	//  126  220:fstore_1        
			}
		}
		mLastMotionX = mLastMotionX + (f - (float)(int)f);
	//  127  221:aload_0         
	//  128  222:aload_0         
	//  129  223:getfield        #479 <Field float mLastMotionX>
	//  130  226:fload_1         
	//  131  227:fload_1         
	//  132  228:f2i             
	//  133  229:i2f             
	//  134  230:fsub            
	//  135  231:fadd            
	//  136  232:putfield        #479 <Field float mLastMotionX>
		scrollTo((int)f, getScrollY());
	//  137  235:aload_0         
	//  138  236:fload_1         
	//  139  237:f2i             
	//  140  238:aload_0         
	//  141  239:invokevirtual   #286 <Method int getScrollY()>
	//  142  242:invokevirtual   #296 <Method void scrollTo(int, int)>
		pageScrolled((int)f);
	//  143  245:aload_0         
	//  144  246:fload_1         
	//  145  247:f2i             
	//  146  248:invokespecial   #300 <Method boolean pageScrolled(int)>
	//  147  251:pop             
		return flag2;
	//  148  252:iload           7
	//  149  254:ireturn         
	}

	private void recomputeScrollPosition(int i, int j, int k, int l)
	{
		if(j > 0 && !mItems.isEmpty())
	//*   0    0:iload_2         
	//*   1    1:ifle            107
	//*   2    4:aload_0         
	//*   3    5:getfield        #188 <Field ArrayList mItems>
	//*   4    8:invokevirtual   #513 <Method boolean ArrayList.isEmpty()>
	//*   5   11:ifne            107
			if(!mScroller.isFinished())
	//*   6   14:aload_0         
	//*   7   15:getfield        #271 <Field Scroller mScroller>
	//*   8   18:invokevirtual   #277 <Method boolean Scroller.isFinished()>
	//*   9   21:ifne            41
			{
				mScroller.setFinalX(getCurrentItem() * getClientWidth());
	//   10   24:aload_0         
	//   11   25:getfield        #271 <Field Scroller mScroller>
	//   12   28:aload_0         
	//   13   29:invokevirtual   #516 <Method int getCurrentItem()>
	//   14   32:aload_0         
	//   15   33:invokespecial   #242 <Method int getClientWidth()>
	//   16   36:imul            
	//   17   37:invokevirtual   #519 <Method void Scroller.setFinalX(int)>
				return;
	//   18   40:return          
			} else
			{
				int i1 = getPaddingLeft();
	//   19   41:aload_0         
	//   20   42:invokevirtual   #436 <Method int getPaddingLeft()>
	//   21   45:istore          6
				int j1 = getPaddingRight();
	//   22   47:aload_0         
	//   23   48:invokevirtual   #439 <Method int getPaddingRight()>
	//   24   51:istore          7
				int k1 = getPaddingLeft();
	//   25   53:aload_0         
	//   26   54:invokevirtual   #436 <Method int getPaddingLeft()>
	//   27   57:istore          8
				int l1 = getPaddingRight();
	//   28   59:aload_0         
	//   29   60:invokevirtual   #439 <Method int getPaddingRight()>
	//   30   63:istore          9
				float f = (float)getScrollX() / (float)((j - k1 - l1) + l);
	//   31   65:aload_0         
	//   32   66:invokevirtual   #283 <Method int getScrollX()>
	//   33   69:i2f             
	//   34   70:iload_2         
	//   35   71:iload           8
	//   36   73:isub            
	//   37   74:iload           9
	//   38   76:isub            
	//   39   77:iload           4
	//   40   79:iadd            
	//   41   80:i2f             
	//   42   81:fdiv            
	//   43   82:fstore          5
				scrollTo((int)((float)((i - i1 - j1) + k) * f), getScrollY());
	//   44   84:aload_0         
	//   45   85:iload_1         
	//   46   86:iload           6
	//   47   88:isub            
	//   48   89:iload           7
	//   49   91:isub            
	//   50   92:iload_3         
	//   51   93:iadd            
	//   52   94:i2f             
	//   53   95:fload           5
	//   54   97:fmul            
	//   55   98:f2i             
	//   56   99:aload_0         
	//   57  100:invokevirtual   #286 <Method int getScrollY()>
	//   58  103:invokevirtual   #296 <Method void scrollTo(int, int)>
				return;
	//   59  106:return          
			}
		ItemInfo iteminfo = infoForPosition(mCurItem);
	//   60  107:aload_0         
	//   61  108:aload_0         
	//   62  109:getfield        #330 <Field int mCurItem>
	//   63  112:invokevirtual   #523 <Method ViewPager$ItemInfo infoForPosition(int)>
	//   64  115:astore          10
		float f1;
		if(iteminfo != null)
	//*  65  117:aload           10
	//*  66  119:ifnull          139
			f1 = Math.min(iteminfo.offset, mLastOffset);
	//   67  122:aload           10
	//   68  124:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   69  127:aload_0         
	//   70  128:getfield        #208 <Field float mLastOffset>
	//   71  131:invokestatic    #526 <Method float Math.min(float, float)>
	//   72  134:fstore          5
		else
	//*  73  136:goto            142
			f1 = 0.0F;
	//   74  139:fconst_0        
	//   75  140:fstore          5
		i = (int)((float)(i - getPaddingLeft() - getPaddingRight()) * f1);
	//   76  142:iload_1         
	//   77  143:aload_0         
	//   78  144:invokevirtual   #436 <Method int getPaddingLeft()>
	//   79  147:isub            
	//   80  148:aload_0         
	//   81  149:invokevirtual   #439 <Method int getPaddingRight()>
	//   82  152:isub            
	//   83  153:i2f             
	//   84  154:fload           5
	//   85  156:fmul            
	//   86  157:f2i             
	//   87  158:istore_1        
		if(i != getScrollX())
	//*  88  159:iload_1         
	//*  89  160:aload_0         
	//*  90  161:invokevirtual   #283 <Method int getScrollX()>
	//*  91  164:icmpeq          181
		{
			completeScroll(false);
	//   92  167:aload_0         
	//   93  168:iconst_0        
	//   94  169:invokespecial   #528 <Method void completeScroll(boolean)>
			scrollTo(i, getScrollY());
	//   95  172:aload_0         
	//   96  173:iload_1         
	//   97  174:aload_0         
	//   98  175:invokevirtual   #286 <Method int getScrollY()>
	//   99  178:invokevirtual   #296 <Method void scrollTo(int, int)>
		}
	//  100  181:return          
	}

	private void removeNonDecorViews()
	{
		int j;
		for(int i = 0; i < getChildCount(); i = j + 1)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #367 <Method int getChildCount()>
	//*   5    7:icmpge          45
		{
			j = i;
	//    6   10:iload_1         
	//    7   11:istore_2        
			if(!((LayoutParams)getChildAt(i).getLayoutParams()).isDecor)
	//*   8   12:aload_0         
	//*   9   13:iload_1         
	//*  10   14:invokevirtual   #373 <Method View getChildAt(int)>
	//*  11   17:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  12   20:checkcast       #20  <Class ViewPager$LayoutParams>
	//*  13   23:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//*  14   26:ifne            38
			{
				removeViewAt(i);
	//   15   29:aload_0         
	//   16   30:iload_1         
	//   17   31:invokevirtual   #539 <Method void removeViewAt(int)>
				j = i - 1;
	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:isub            
	//   21   37:istore_2        
			}
		}

	//   22   38:iload_2         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_1        
	//*  26   42:goto            2
	//   27   45:return          
	}

	private void requestParentDisallowInterceptTouchEvent(boolean flag)
	{
		ViewParent viewparent = getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #541 <Method ViewParent getParent()>
	//    2    4:astore_2        
		if(viewparent != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			viewparent.requestDisallowInterceptTouchEvent(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokeinterface #546 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//    8   16:return          
	}

	private boolean resetTouch()
	{
		mActivePointerId = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #212 <Field int mActivePointerId>
		endDrag();
	//    3    5:aload_0         
	//    4    6:invokespecial   #549 <Method void endDrag()>
		mLeftEdge.onRelease();
	//    5    9:aload_0         
	//    6   10:getfield        #498 <Field EdgeEffect mLeftEdge>
	//    7   13:invokevirtual   #552 <Method void EdgeEffect.onRelease()>
		mRightEdge.onRelease();
	//    8   16:aload_0         
	//    9   17:getfield        #509 <Field EdgeEffect mRightEdge>
	//   10   20:invokevirtual   #552 <Method void EdgeEffect.onRelease()>
		return mLeftEdge.isFinished() | mRightEdge.isFinished();
	//   11   23:aload_0         
	//   12   24:getfield        #498 <Field EdgeEffect mLeftEdge>
	//   13   27:invokevirtual   #553 <Method boolean EdgeEffect.isFinished()>
	//   14   30:aload_0         
	//   15   31:getfield        #509 <Field EdgeEffect mRightEdge>
	//   16   34:invokevirtual   #553 <Method boolean EdgeEffect.isFinished()>
	//   17   37:ior             
	//   18   38:ireturn         
	}

	private void scrollToItem(int i, boolean flag, int j, boolean flag1)
	{
		ItemInfo iteminfo = infoForPosition(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #523 <Method ViewPager$ItemInfo infoForPosition(int)>
	//    3    5:astore          6
		int k = 0;
	//    4    7:iconst_0        
	//    5    8:istore          5
		if(iteminfo != null)
	//*   6   10:aload           6
	//*   7   12:ifnull          43
			k = (int)((float)getClientWidth() * Math.max(mFirstOffset, Math.min(iteminfo.offset, mLastOffset)));
	//    8   15:aload_0         
	//    9   16:invokespecial   #242 <Method int getClientWidth()>
	//   10   19:i2f             
	//   11   20:aload_0         
	//   12   21:getfield        #205 <Field float mFirstOffset>
	//   13   24:aload           6
	//   14   26:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   15   29:aload_0         
	//   16   30:getfield        #208 <Field float mLastOffset>
	//   17   33:invokestatic    #526 <Method float Math.min(float, float)>
	//   18   36:invokestatic    #557 <Method float Math.max(float, float)>
	//   19   39:fmul            
	//   20   40:f2i             
	//   21   41:istore          5
		if(flag)
	//*  22   43:iload_2         
	//*  23   44:ifeq            66
		{
			smoothScrollTo(k, 0, j);
	//   24   47:aload_0         
	//   25   48:iload           5
	//   26   50:iconst_0        
	//   27   51:iload_3         
	//   28   52:invokevirtual   #561 <Method void smoothScrollTo(int, int, int)>
			if(flag1)
	//*  29   55:iload           4
	//*  30   57:ifeq            95
			{
				dispatchOnPageSelected(i);
	//   31   60:aload_0         
	//   32   61:iload_1         
	//   33   62:invokespecial   #563 <Method void dispatchOnPageSelected(int)>
				return;
	//   34   65:return          
			}
		} else
		{
			if(flag1)
	//*  35   66:iload           4
	//*  36   68:ifeq            76
				dispatchOnPageSelected(i);
	//   37   71:aload_0         
	//   38   72:iload_1         
	//   39   73:invokespecial   #563 <Method void dispatchOnPageSelected(int)>
			completeScroll(false);
	//   40   76:aload_0         
	//   41   77:iconst_0        
	//   42   78:invokespecial   #528 <Method void completeScroll(boolean)>
			scrollTo(k, 0);
	//   43   81:aload_0         
	//   44   82:iload           5
	//   45   84:iconst_0        
	//   46   85:invokevirtual   #296 <Method void scrollTo(int, int)>
			pageScrolled(k);
	//   47   88:aload_0         
	//   48   89:iload           5
	//   49   91:invokespecial   #300 <Method boolean pageScrolled(int)>
	//   50   94:pop             
		}
	//   51   95:return          
	}

	private void setScrollingCacheEnabled(boolean flag)
	{
		if(mScrollingCacheEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #565 <Field boolean mScrollingCacheEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          13
			mScrollingCacheEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #565 <Field boolean mScrollingCacheEnabled>
	//    7   13:return          
	}

	private void sortChildDrawingOrder()
	{
		if(mDrawingOrder != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #568 <Field int mDrawingOrder>
	//*   2    4:ifeq            79
		{
			if(mDrawingOrderedChildren == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #570 <Field ArrayList mDrawingOrderedChildren>
	//*   5   11:ifnonnull       28
				mDrawingOrderedChildren = new ArrayList();
	//    6   14:aload_0         
	//    7   15:new             #185 <Class ArrayList>
	//    8   18:dup             
	//    9   19:invokespecial   #186 <Method void ArrayList()>
	//   10   22:putfield        #570 <Field ArrayList mDrawingOrderedChildren>
			else
	//*  11   25:goto            35
				mDrawingOrderedChildren.clear();
	//   12   28:aload_0         
	//   13   29:getfield        #570 <Field ArrayList mDrawingOrderedChildren>
	//   14   32:invokevirtual   #571 <Method void ArrayList.clear()>
			int j = getChildCount();
	//   15   35:aload_0         
	//   16   36:invokevirtual   #367 <Method int getChildCount()>
	//   17   39:istore_2        
			for(int i = 0; i < j; i++)
	//*  18   40:iconst_0        
	//*  19   41:istore_1        
	//*  20   42:iload_1         
	//*  21   43:iload_2         
	//*  22   44:icmpge          69
			{
				View view = getChildAt(i);
	//   23   47:aload_0         
	//   24   48:iload_1         
	//   25   49:invokevirtual   #373 <Method View getChildAt(int)>
	//   26   52:astore_3        
				mDrawingOrderedChildren.add(((Object) (view)));
	//   27   53:aload_0         
	//   28   54:getfield        #570 <Field ArrayList mDrawingOrderedChildren>
	//   29   57:aload_3         
	//   30   58:invokevirtual   #575 <Method boolean ArrayList.add(Object)>
	//   31   61:pop             
			}

	//   32   62:iload_1         
	//   33   63:iconst_1        
	//   34   64:iadd            
	//   35   65:istore_1        
	//*  36   66:goto            42
			Collections.sort(((List) (mDrawingOrderedChildren)), ((Comparator) (sPositionComparator)));
	//   37   69:aload_0         
	//   38   70:getfield        #570 <Field ArrayList mDrawingOrderedChildren>
	//   39   73:getstatic       #179 <Field ViewPager$ViewPositionComparator sPositionComparator>
	//   40   76:invokestatic    #581 <Method void Collections.sort(List, Comparator)>
		}
	//   41   79:return          
	}

	public void addFocusables(ArrayList arraylist, int i, int j)
	{
		int l = arraylist.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #256 <Method int ArrayList.size()>
	//    2    4:istore          5
		int i1 = getDescendantFocusability();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #586 <Method int getDescendantFocusability()>
	//    5   10:istore          6
		if(i1 != 0x60000)
	//*   6   12:iload           6
	//*   7   14:ldc2            #587 <Int 0x60000>
	//*   8   17:icmpeq          90
		{
			for(int k = 0; k < getChildCount(); k++)
	//*   9   20:iconst_0        
	//*  10   21:istore          4
	//*  11   23:iload           4
	//*  12   25:aload_0         
	//*  13   26:invokevirtual   #367 <Method int getChildCount()>
	//*  14   29:icmpge          90
			{
				View view = getChildAt(k);
	//   15   32:aload_0         
	//   16   33:iload           4
	//   17   35:invokevirtual   #373 <Method View getChildAt(int)>
	//   18   38:astore          7
				if(view.getVisibility() != 0)
					continue;
	//   19   40:aload           7
	//   20   42:invokevirtual   #590 <Method int View.getVisibility()>
	//   21   45:ifne            81
				ItemInfo iteminfo = infoForChild(view);
	//   22   48:aload_0         
	//   23   49:aload           7
	//   24   51:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//   25   54:astore          8
				if(iteminfo != null && iteminfo.position == mCurItem)
	//*  26   56:aload           8
	//*  27   58:ifnull          81
	//*  28   61:aload           8
	//*  29   63:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  30   66:aload_0         
	//*  31   67:getfield        #330 <Field int mCurItem>
	//*  32   70:icmpne          81
					view.addFocusables(arraylist, i, j);
	//   33   73:aload           7
	//   34   75:aload_1         
	//   35   76:iload_2         
	//   36   77:iload_3         
	//   37   78:invokevirtual   #596 <Method void View.addFocusables(ArrayList, int, int)>
			}

	//   38   81:iload           4
	//   39   83:iconst_1        
	//   40   84:iadd            
	//   41   85:istore          4
		}
	//*  42   87:goto            23
		if(i1 != 0x40000 || l == arraylist.size())
	//*  43   90:iload           6
	//*  44   92:ldc2            #597 <Int 0x40000>
	//*  45   95:icmpne          107
	//*  46   98:iload           5
	//*  47  100:aload_1         
	//*  48  101:invokevirtual   #256 <Method int ArrayList.size()>
	//*  49  104:icmpne          147
		{
			if(!isFocusable())
	//*  50  107:aload_0         
	//*  51  108:invokevirtual   #600 <Method boolean isFocusable()>
	//*  52  111:ifne            115
				return;
	//   53  114:return          
			if((j & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode())
	//*  54  115:iload_3         
	//*  55  116:iconst_1        
	//*  56  117:iand            
	//*  57  118:iconst_1        
	//*  58  119:icmpne          137
	//*  59  122:aload_0         
	//*  60  123:invokevirtual   #603 <Method boolean isInTouchMode()>
	//*  61  126:ifeq            137
	//*  62  129:aload_0         
	//*  63  130:invokevirtual   #606 <Method boolean isFocusableInTouchMode()>
	//*  64  133:ifne            137
				return;
	//   65  136:return          
			if(arraylist != null)
	//*  66  137:aload_1         
	//*  67  138:ifnull          147
				arraylist.add(((Object) (this)));
	//   68  141:aload_1         
	//   69  142:aload_0         
	//   70  143:invokevirtual   #575 <Method boolean ArrayList.add(Object)>
	//   71  146:pop             
		}
	//   72  147:return          
	}

	ItemInfo addNewItem(int i, int j)
	{
		ItemInfo iteminfo = new ItemInfo();
	//    0    0:new             #17  <Class ViewPager$ItemInfo>
	//    1    3:dup             
	//    2    4:invokespecial   #189 <Method void ViewPager$ItemInfo()>
	//    3    7:astore_3        
		iteminfo.position = i;
	//    4    8:aload_3         
	//    5    9:iload_1         
	//    6   10:putfield        #247 <Field int ViewPager$ItemInfo.position>
		iteminfo.object = mAdapter.instantiateItem(((ViewGroup) (this)), i);
	//    7   13:aload_3         
	//    8   14:aload_0         
	//    9   15:getfield        #233 <Field PagerAdapter mAdapter>
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokevirtual   #614 <Method Object PagerAdapter.instantiateItem(ViewGroup, int)>
	//   13   23:putfield        #618 <Field Object ViewPager$ItemInfo.object>
		iteminfo.widthFactor = mAdapter.getPageWidth(i);
	//   14   26:aload_3         
	//   15   27:aload_0         
	//   16   28:getfield        #233 <Field PagerAdapter mAdapter>
	//   17   31:iload_1         
	//   18   32:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//   19   35:putfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
		if(j < 0 || j >= mItems.size())
	//*  20   38:iload_2         
	//*  21   39:iflt            53
	//*  22   42:iload_2         
	//*  23   43:aload_0         
	//*  24   44:getfield        #188 <Field ArrayList mItems>
	//*  25   47:invokevirtual   #256 <Method int ArrayList.size()>
	//*  26   50:icmplt          64
		{
			mItems.add(((Object) (iteminfo)));
	//   27   53:aload_0         
	//   28   54:getfield        #188 <Field ArrayList mItems>
	//   29   57:aload_3         
	//   30   58:invokevirtual   #575 <Method boolean ArrayList.add(Object)>
	//   31   61:pop             
			return iteminfo;
	//   32   62:aload_3         
	//   33   63:areturn         
		} else
		{
			mItems.add(j, ((Object) (iteminfo)));
	//   34   64:aload_0         
	//   35   65:getfield        #188 <Field ArrayList mItems>
	//   36   68:iload_2         
	//   37   69:aload_3         
	//   38   70:invokevirtual   #621 <Method void ArrayList.add(int, Object)>
			return iteminfo;
	//   39   73:aload_3         
	//   40   74:areturn         
		}
	}

	public void addOnAdapterChangeListener(OnAdapterChangeListener onadapterchangelistener)
	{
		if(mAdapterChangeListeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #625 <Field List mAdapterChangeListeners>
	//*   2    4:ifnonnull       18
			mAdapterChangeListeners = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #185 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #186 <Method void ArrayList()>
	//    7   15:putfield        #625 <Field List mAdapterChangeListeners>
		mAdapterChangeListeners.add(((Object) (onadapterchangelistener)));
	//    8   18:aload_0         
	//    9   19:getfield        #625 <Field List mAdapterChangeListeners>
	//   10   22:aload_1         
	//   11   23:invokeinterface #626 <Method boolean List.add(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	public void addOnPageChangeListener(OnPageChangeListener onpagechangelistener)
	{
		if(mOnPageChangeListeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #348 <Field List mOnPageChangeListeners>
	//*   2    4:ifnonnull       18
			mOnPageChangeListeners = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #185 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #186 <Method void ArrayList()>
	//    7   15:putfield        #348 <Field List mOnPageChangeListeners>
		mOnPageChangeListeners.add(((Object) (onpagechangelistener)));
	//    8   18:aload_0         
	//    9   19:getfield        #348 <Field List mOnPageChangeListeners>
	//   10   22:aload_1         
	//   11   23:invokeinterface #626 <Method boolean List.add(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	public void addTouchables(ArrayList arraylist)
	{
		for(int i = 0; i < getChildCount(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #367 <Method int getChildCount()>
	//*   5    7:icmpge          59
		{
			View view = getChildAt(i);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #373 <Method View getChildAt(int)>
	//    9   15:astore_3        
			if(view.getVisibility() != 0)
				continue;
	//   10   16:aload_3         
	//   11   17:invokevirtual   #590 <Method int View.getVisibility()>
	//   12   20:ifne            52
			ItemInfo iteminfo = infoForChild(view);
	//   13   23:aload_0         
	//   14   24:aload_3         
	//   15   25:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//   16   28:astore          4
			if(iteminfo != null && iteminfo.position == mCurItem)
	//*  17   30:aload           4
	//*  18   32:ifnull          52
	//*  19   35:aload           4
	//*  20   37:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  21   40:aload_0         
	//*  22   41:getfield        #330 <Field int mCurItem>
	//*  23   44:icmpne          52
				view.addTouchables(arraylist);
	//   24   47:aload_3         
	//   25   48:aload_1         
	//   26   49:invokevirtual   #632 <Method void View.addTouchables(ArrayList)>
		}

	//   27   52:iload_2         
	//   28   53:iconst_1        
	//   29   54:iadd            
	//   30   55:istore_2        
	//*  31   56:goto            2
	//   32   59:return          
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		android.view.ViewGroup.LayoutParams layoutparams1 = layoutparams;
	//    0    0:aload_3         
	//    1    1:astore          4
		if(!checkLayoutParams(layoutparams))
	//*   2    3:aload_0         
	//*   3    4:aload_3         
	//*   4    5:invokevirtual   #639 <Method boolean checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*   5    8:ifne            18
			layoutparams1 = generateLayoutParams(layoutparams);
	//    6   11:aload_0         
	//    7   12:aload_3         
	//    8   13:invokevirtual   #643 <Method android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    9   16:astore          4
		layoutparams = ((android.view.ViewGroup.LayoutParams) ((LayoutParams)layoutparams1));
	//   10   18:aload           4
	//   11   20:checkcast       #20  <Class ViewPager$LayoutParams>
	//   12   23:astore_3        
		layoutparams.isDecor = ((LayoutParams) (layoutparams)).isDecor | isDecorView(view);
	//   13   24:aload_3         
	//   14   25:aload_3         
	//   15   26:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//   16   29:aload_1         
	//   17   30:invokestatic    #645 <Method boolean isDecorView(View)>
	//   18   33:ior             
	//   19   34:putfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
		if(mInLayout)
	//*  20   37:aload_0         
	//*  21   38:getfield        #647 <Field boolean mInLayout>
	//*  22   41:ifeq            81
		{
			if(layoutparams != null && ((LayoutParams) (layoutparams)).isDecor)
	//*  23   44:aload_3         
	//*  24   45:ifnull          66
	//*  25   48:aload_3         
	//*  26   49:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//*  27   52:ifeq            66
			{
				throw new IllegalStateException("Cannot add pager decor view during layout");
	//   28   55:new             #487 <Class IllegalStateException>
	//   29   58:dup             
	//   30   59:ldc2            #649 <String "Cannot add pager decor view during layout">
	//   31   62:invokespecial   #492 <Method void IllegalStateException(String)>
	//   32   65:athrow          
			} else
			{
				layoutparams.needsMeasure = true;
	//   33   66:aload_3         
	//   34   67:iconst_1        
	//   35   68:putfield        #652 <Field boolean ViewPager$LayoutParams.needsMeasure>
				addViewInLayout(view, i, layoutparams1);
	//   36   71:aload_0         
	//   37   72:aload_1         
	//   38   73:iload_2         
	//   39   74:aload           4
	//   40   76:invokevirtual   #656 <Method boolean addViewInLayout(View, int, android.view.ViewGroup$LayoutParams)>
	//   41   79:pop             
				return;
	//   42   80:return          
			}
		} else
		{
			super.addView(view, i, layoutparams1);
	//   43   81:aload_0         
	//   44   82:aload_1         
	//   45   83:iload_2         
	//   46   84:aload           4
	//   47   86:invokespecial   #658 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   48   89:return          
		}
	}

	public boolean arrowScroll(int i)
	{
		View view = findFocus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #663 <Method View findFocus()>
	//    2    4:astore          6
		Object obj;
		if(view == this)
	//*   3    6:aload           6
	//*   4    8:aload_0         
	//*   5    9:if_acmpne       18
		{
			obj = null;
	//    6   12:aconst_null     
	//    7   13:astore          5
		} else
	//*   8   15:goto            180
		{
			obj = ((Object) (view));
	//    9   18:aload           6
	//   10   20:astore          5
			if(view != null)
	//*  11   22:aload           6
	//*  12   24:ifnull          180
			{
				boolean flag1 = false;
	//   13   27:iconst_0        
	//   14   28:istore_3        
				obj = ((Object) (view.getParent()));
	//   15   29:aload           6
	//   16   31:invokevirtual   #425 <Method ViewParent View.getParent()>
	//   17   34:astore          5
				boolean flag;
				do
				{
					flag = flag1;
	//   18   36:iload_3         
	//   19   37:istore_2        
					if(!(obj instanceof ViewGroup))
						break;
	//   20   38:aload           5
	//   21   40:instanceof      #4   <Class ViewGroup>
	//   22   43:ifeq            69
					if(obj == this)
	//*  23   46:aload           5
	//*  24   48:aload_0         
	//*  25   49:if_acmpne       57
					{
						flag = true;
	//   26   52:iconst_1        
	//   27   53:istore_2        
						break;
	//   28   54:goto            69
					}
					obj = ((Object) (((ViewParent) (obj)).getParent()));
	//   29   57:aload           5
	//   30   59:invokeinterface #664 <Method ViewParent ViewParent.getParent()>
	//   31   64:astore          5
				} while(true);
	//   32   66:goto            36
				obj = ((Object) (view));
	//   33   69:aload           6
	//   34   71:astore          5
				if(!flag)
	//*  35   73:iload_2         
	//*  36   74:ifne            180
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   37   77:new             #666 <Class StringBuilder>
	//   38   80:dup             
	//   39   81:invokespecial   #667 <Method void StringBuilder()>
	//   40   84:astore          7
					stringbuilder.append(((Object) (view)).getClass().getSimpleName());
	//   41   86:aload           7
	//   42   88:aload           6
	//   43   90:invokevirtual   #450 <Method Class Object.getClass()>
	//   44   93:invokevirtual   #671 <Method String Class.getSimpleName()>
	//   45   96:invokevirtual   #675 <Method StringBuilder StringBuilder.append(String)>
	//   46   99:pop             
					for(obj = ((Object) (view.getParent())); obj instanceof ViewGroup; obj = ((Object) (((ViewParent) (obj)).getParent())))
	//*  47  100:aload           6
	//*  48  102:invokevirtual   #425 <Method ViewParent View.getParent()>
	//*  49  105:astore          5
	//*  50  107:aload           5
	//*  51  109:instanceof      #4   <Class ViewGroup>
	//*  52  112:ifeq            147
						stringbuilder.append(" => ").append(obj.getClass().getSimpleName());
	//   53  115:aload           7
	//   54  117:ldc2            #677 <String " => ">
	//   55  120:invokevirtual   #675 <Method StringBuilder StringBuilder.append(String)>
	//   56  123:aload           5
	//   57  125:invokevirtual   #450 <Method Class Object.getClass()>
	//   58  128:invokevirtual   #671 <Method String Class.getSimpleName()>
	//   59  131:invokevirtual   #675 <Method StringBuilder StringBuilder.append(String)>
	//   60  134:pop             

	//   61  135:aload           5
	//   62  137:invokeinterface #664 <Method ViewParent ViewParent.getParent()>
	//   63  142:astore          5
	//*  64  144:goto            107
					Log.e("ViewPager", (new StringBuilder()).append("arrowScroll tried to find focus based on non-child current focused view ").append(stringbuilder.toString()).toString());
	//   65  147:ldc1            #80  <String "ViewPager">
	//   66  149:new             #666 <Class StringBuilder>
	//   67  152:dup             
	//   68  153:invokespecial   #667 <Method void StringBuilder()>
	//   69  156:ldc2            #679 <String "arrowScroll tried to find focus based on non-child current focused view ">
	//   70  159:invokevirtual   #675 <Method StringBuilder StringBuilder.append(String)>
	//   71  162:aload           7
	//   72  164:invokevirtual   #682 <Method String StringBuilder.toString()>
	//   73  167:invokevirtual   #675 <Method StringBuilder StringBuilder.append(String)>
	//   74  170:invokevirtual   #682 <Method String StringBuilder.toString()>
	//   75  173:invokestatic    #688 <Method int Log.e(String, String)>
	//   76  176:pop             
					obj = null;
	//   77  177:aconst_null     
	//   78  178:astore          5
				}
			}
		}
		boolean flag2 = false;
	//   79  180:iconst_0        
	//   80  181:istore          4
		view = FocusFinder.getInstance().findNextFocus(((ViewGroup) (this)), ((View) (obj)), i);
	//   81  183:invokestatic    #694 <Method FocusFinder FocusFinder.getInstance()>
	//   82  186:aload_0         
	//   83  187:aload           5
	//   84  189:iload_1         
	//   85  190:invokevirtual   #698 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   86  193:astore          6
		if(view != null && view != obj)
	//*  87  195:aload           6
	//*  88  197:ifnull          333
	//*  89  200:aload           6
	//*  90  202:aload           5
	//*  91  204:if_acmpeq       333
		{
			if(i == 17)
	//*  92  207:iload_1         
	//*  93  208:bipush          17
	//*  94  210:icmpne          270
			{
				int j = getChildRectInPagerCoordinates(mTempRect, view).left;
	//   95  213:aload_0         
	//   96  214:aload_0         
	//   97  215:getfield        #196 <Field Rect mTempRect>
	//   98  218:aload           6
	//   99  220:invokespecial   #700 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//  100  223:getfield        #403 <Field int Rect.left>
	//  101  226:istore_2        
				int l = getChildRectInPagerCoordinates(mTempRect, ((View) (obj))).left;
	//  102  227:aload_0         
	//  103  228:aload_0         
	//  104  229:getfield        #196 <Field Rect mTempRect>
	//  105  232:aload           5
	//  106  234:invokespecial   #700 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//  107  237:getfield        #403 <Field int Rect.left>
	//  108  240:istore_3        
				if(obj != null && j >= l)
	//* 109  241:aload           5
	//* 110  243:ifnull          260
	//* 111  246:iload_2         
	//* 112  247:iload_3         
	//* 113  248:icmplt          260
					flag2 = pageLeft();
	//  114  251:aload_0         
	//  115  252:invokevirtual   #703 <Method boolean pageLeft()>
	//  116  255:istore          4
				else
	//* 117  257:goto            267
					flag2 = view.requestFocus();
	//  118  260:aload           6
	//  119  262:invokevirtual   #706 <Method boolean View.requestFocus()>
	//  120  265:istore          4
			} else
	//* 121  267:goto            370
			if(i == 66)
	//* 122  270:iload_1         
	//* 123  271:bipush          66
	//* 124  273:icmpne          370
			{
				int k = getChildRectInPagerCoordinates(mTempRect, view).left;
	//  125  276:aload_0         
	//  126  277:aload_0         
	//  127  278:getfield        #196 <Field Rect mTempRect>
	//  128  281:aload           6
	//  129  283:invokespecial   #700 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//  130  286:getfield        #403 <Field int Rect.left>
	//  131  289:istore_2        
				int i1 = getChildRectInPagerCoordinates(mTempRect, ((View) (obj))).left;
	//  132  290:aload_0         
	//  133  291:aload_0         
	//  134  292:getfield        #196 <Field Rect mTempRect>
	//  135  295:aload           5
	//  136  297:invokespecial   #700 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//  137  300:getfield        #403 <Field int Rect.left>
	//  138  303:istore_3        
				if(obj != null && k <= i1)
	//* 139  304:aload           5
	//* 140  306:ifnull          323
	//* 141  309:iload_2         
	//* 142  310:iload_3         
	//* 143  311:icmpgt          323
					flag2 = pageRight();
	//  144  314:aload_0         
	//  145  315:invokevirtual   #709 <Method boolean pageRight()>
	//  146  318:istore          4
				else
	//* 147  320:goto            330
					flag2 = view.requestFocus();
	//  148  323:aload           6
	//  149  325:invokevirtual   #706 <Method boolean View.requestFocus()>
	//  150  328:istore          4
			}
		} else
	//* 151  330:goto            370
		if(i == 17 || i == 1)
	//* 152  333:iload_1         
	//* 153  334:bipush          17
	//* 154  336:icmpeq          344
	//* 155  339:iload_1         
	//* 156  340:iconst_1        
	//* 157  341:icmpne          353
			flag2 = pageLeft();
	//  158  344:aload_0         
	//  159  345:invokevirtual   #703 <Method boolean pageLeft()>
	//  160  348:istore          4
		else
	//* 161  350:goto            370
		if(i == 66 || i == 2)
	//* 162  353:iload_1         
	//* 163  354:bipush          66
	//* 164  356:icmpeq          364
	//* 165  359:iload_1         
	//* 166  360:iconst_2        
	//* 167  361:icmpne          370
			flag2 = pageRight();
	//  168  364:aload_0         
	//  169  365:invokevirtual   #709 <Method boolean pageRight()>
	//  170  368:istore          4
		if(flag2)
	//* 171  370:iload           4
	//* 172  372:ifeq            383
			playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
	//  173  375:aload_0         
	//  174  376:iload_1         
	//  175  377:invokestatic    #714 <Method int SoundEffectConstants.getContantForFocusDirection(int)>
	//  176  380:invokevirtual   #717 <Method void playSoundEffect(int)>
		return flag2;
	//  177  383:iload           4
	//  178  385:ireturn         
	}

	public boolean beginFakeDrag()
	{
		if(mIsBeingDragged)
	//*   0    0:aload_0         
	//*   1    1:getfield        #382 <Field boolean mIsBeingDragged>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		mFakeDragging = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #720 <Field boolean mFakeDragging>
		setScrollState(1);
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:invokevirtual   #723 <Method void setScrollState(int)>
		mLastMotionX = 0.0F;
	//   11   19:aload_0         
	//   12   20:fconst_0        
	//   13   21:putfield        #479 <Field float mLastMotionX>
		mInitialMotionX = 0.0F;
	//   14   24:aload_0         
	//   15   25:fconst_0        
	//   16   26:putfield        #725 <Field float mInitialMotionX>
		if(mVelocityTracker == null)
	//*  17   29:aload_0         
	//*  18   30:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//*  19   33:ifnonnull       46
			mVelocityTracker = VelocityTracker.obtain();
	//   20   36:aload_0         
	//   21   37:invokestatic    #729 <Method VelocityTracker VelocityTracker.obtain()>
	//   22   40:putfield        #386 <Field VelocityTracker mVelocityTracker>
		else
	//*  23   43:goto            53
			mVelocityTracker.clear();
	//   24   46:aload_0         
	//   25   47:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//   26   50:invokevirtual   #482 <Method void VelocityTracker.clear()>
		long l = SystemClock.uptimeMillis();
	//   27   53:invokestatic    #735 <Method long SystemClock.uptimeMillis()>
	//   28   56:lstore_1        
		MotionEvent motionevent = MotionEvent.obtain(l, l, 0, 0.0F, 0.0F, 0);
	//   29   57:lload_1         
	//   30   58:lload_1         
	//   31   59:iconst_0        
	//   32   60:fconst_0        
	//   33   61:fconst_0        
	//   34   62:iconst_0        
	//   35   63:invokestatic    #738 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   36   66:astore_3        
		mVelocityTracker.addMovement(motionevent);
	//   37   67:aload_0         
	//   38   68:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//   39   71:aload_3         
	//   40   72:invokevirtual   #741 <Method void VelocityTracker.addMovement(MotionEvent)>
		motionevent.recycle();
	//   41   75:aload_3         
	//   42   76:invokevirtual   #742 <Method void MotionEvent.recycle()>
		mFakeDragBeginTime = l;
	//   43   79:aload_0         
	//   44   80:lload_1         
	//   45   81:putfield        #744 <Field long mFakeDragBeginTime>
		return true;
	//   46   84:iconst_1        
	//   47   85:ireturn         
	}

	protected boolean canScroll(View view, boolean flag, int i, int j, int k)
	{
		if(view instanceof ViewGroup)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #4   <Class ViewGroup>
	//*   2    4:ifeq            144
		{
			ViewGroup viewgroup = (ViewGroup)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #4   <Class ViewGroup>
	//    5   11:astore          9
			int i1 = view.getScrollX();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #747 <Method int View.getScrollX()>
	//    8   17:istore          7
			int j1 = view.getScrollY();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #748 <Method int View.getScrollY()>
	//   11   23:istore          8
			for(int l = viewgroup.getChildCount() - 1; l >= 0; l--)
	//*  12   25:aload           9
	//*  13   27:invokevirtual   #749 <Method int ViewGroup.getChildCount()>
	//*  14   30:iconst_1        
	//*  15   31:isub            
	//*  16   32:istore          6
	//*  17   34:iload           6
	//*  18   36:iflt            144
			{
				View view1 = viewgroup.getChildAt(l);
	//   19   39:aload           9
	//   20   41:iload           6
	//   21   43:invokevirtual   #750 <Method View ViewGroup.getChildAt(int)>
	//   22   46:astore          10
				if(j + i1 >= view1.getLeft() && j + i1 < view1.getRight() && k + j1 >= view1.getTop() && k + j1 < view1.getBottom() && canScroll(view1, true, i, (j + i1) - view1.getLeft(), (k + j1) - view1.getTop()))
	//*  23   48:iload           4
	//*  24   50:iload           7
	//*  25   52:iadd            
	//*  26   53:aload           10
	//*  27   55:invokevirtual   #400 <Method int View.getLeft()>
	//*  28   58:icmplt          135
	//*  29   61:iload           4
	//*  30   63:iload           7
	//*  31   65:iadd            
	//*  32   66:aload           10
	//*  33   68:invokevirtual   #406 <Method int View.getRight()>
	//*  34   71:icmpge          135
	//*  35   74:iload           5
	//*  36   76:iload           8
	//*  37   78:iadd            
	//*  38   79:aload           10
	//*  39   81:invokevirtual   #412 <Method int View.getTop()>
	//*  40   84:icmplt          135
	//*  41   87:iload           5
	//*  42   89:iload           8
	//*  43   91:iadd            
	//*  44   92:aload           10
	//*  45   94:invokevirtual   #418 <Method int View.getBottom()>
	//*  46   97:icmpge          135
	//*  47  100:aload_0         
	//*  48  101:aload           10
	//*  49  103:iconst_1        
	//*  50  104:iload_3         
	//*  51  105:iload           4
	//*  52  107:iload           7
	//*  53  109:iadd            
	//*  54  110:aload           10
	//*  55  112:invokevirtual   #400 <Method int View.getLeft()>
	//*  56  115:isub            
	//*  57  116:iload           5
	//*  58  118:iload           8
	//*  59  120:iadd            
	//*  60  121:aload           10
	//*  61  123:invokevirtual   #412 <Method int View.getTop()>
	//*  62  126:isub            
	//*  63  127:invokevirtual   #752 <Method boolean canScroll(View, boolean, int, int, int)>
	//*  64  130:ifeq            135
					return true;
	//   65  133:iconst_1        
	//   66  134:ireturn         
			}

	//   67  135:iload           6
	//   68  137:iconst_1        
	//   69  138:isub            
	//   70  139:istore          6
		}
	//*  71  141:goto            34
		return flag && view.canScrollHorizontally(-i);
	//   72  144:iload_2         
	//   73  145:ifeq            159
	//   74  148:aload_1         
	//   75  149:iload_3         
	//   76  150:ineg            
	//   77  151:invokevirtual   #755 <Method boolean View.canScrollHorizontally(int)>
	//   78  154:ifeq            159
	//   79  157:iconst_1        
	//   80  158:ireturn         
	//   81  159:iconst_0        
	//   82  160:ireturn         
	}

	public boolean canScrollHorizontally(int i)
	{
		if(mAdapter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #233 <Field PagerAdapter mAdapter>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		int j = getClientWidth();
	//    5    9:aload_0         
	//    6   10:invokespecial   #242 <Method int getClientWidth()>
	//    7   13:istore_2        
		int k = getScrollX();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #283 <Method int getScrollX()>
	//   10   18:istore_3        
		if(i < 0)
	//*  11   19:iload_1         
	//*  12   20:ifge            39
			return k > (int)((float)j * mFirstOffset);
	//   13   23:iload_3         
	//   14   24:iload_2         
	//   15   25:i2f             
	//   16   26:aload_0         
	//   17   27:getfield        #205 <Field float mFirstOffset>
	//   18   30:fmul            
	//   19   31:f2i             
	//   20   32:icmple          37
	//   21   35:iconst_1        
	//   22   36:ireturn         
	//   23   37:iconst_0        
	//   24   38:ireturn         
		if(i > 0)
	//*  25   39:iload_1         
	//*  26   40:ifle            59
			return k < (int)((float)j * mLastOffset);
	//   27   43:iload_3         
	//   28   44:iload_2         
	//   29   45:i2f             
	//   30   46:aload_0         
	//   31   47:getfield        #208 <Field float mLastOffset>
	//   32   50:fmul            
	//   33   51:f2i             
	//   34   52:icmpge          57
	//   35   55:iconst_1        
	//   36   56:ireturn         
	//   37   57:iconst_0        
	//   38   58:ireturn         
		else
			return false;
	//   39   59:iconst_0        
	//   40   60:ireturn         
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #20  <Class ViewPager$LayoutParams>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #756 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void clearOnPageChangeListeners()
	{
		if(mOnPageChangeListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #348 <Field List mOnPageChangeListeners>
	//*   2    4:ifnull          16
			mOnPageChangeListeners.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #348 <Field List mOnPageChangeListeners>
	//    5   11:invokeinterface #758 <Method void List.clear()>
	//    6   16:return          
	}

	public void computeScroll()
	{
		mIsScrollStarted = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #761 <Field boolean mIsScrollStarted>
		if(!mScroller.isFinished() && mScroller.computeScrollOffset())
	//*   3    5:aload_0         
	//*   4    6:getfield        #271 <Field Scroller mScroller>
	//*   5    9:invokevirtual   #277 <Method boolean Scroller.isFinished()>
	//*   6   12:ifne            97
	//*   7   15:aload_0         
	//*   8   16:getfield        #271 <Field Scroller mScroller>
	//*   9   19:invokevirtual   #764 <Method boolean Scroller.computeScrollOffset()>
	//*  10   22:ifeq            97
		{
			int i = getScrollX();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #283 <Method int getScrollX()>
	//   13   29:istore_1        
			int j = getScrollY();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #286 <Method int getScrollY()>
	//   16   34:istore_2        
			int k = mScroller.getCurrX();
	//   17   35:aload_0         
	//   18   36:getfield        #271 <Field Scroller mScroller>
	//   19   39:invokevirtual   #289 <Method int Scroller.getCurrX()>
	//   20   42:istore_3        
			int l = mScroller.getCurrY();
	//   21   43:aload_0         
	//   22   44:getfield        #271 <Field Scroller mScroller>
	//   23   47:invokevirtual   #292 <Method int Scroller.getCurrY()>
	//   24   50:istore          4
			if(i != k || j != l)
	//*  25   52:iload_1         
	//*  26   53:iload_3         
	//*  27   54:icmpne          63
	//*  28   57:iload_2         
	//*  29   58:iload           4
	//*  30   60:icmpeq          92
			{
				scrollTo(k, l);
	//   31   63:aload_0         
	//   32   64:iload_3         
	//   33   65:iload           4
	//   34   67:invokevirtual   #296 <Method void scrollTo(int, int)>
				if(!pageScrolled(k))
	//*  35   70:aload_0         
	//*  36   71:iload_3         
	//*  37   72:invokespecial   #300 <Method boolean pageScrolled(int)>
	//*  38   75:ifne            92
				{
					mScroller.abortAnimation();
	//   39   78:aload_0         
	//   40   79:getfield        #271 <Field Scroller mScroller>
	//   41   82:invokevirtual   #280 <Method void Scroller.abortAnimation()>
					scrollTo(0, l);
	//   42   85:aload_0         
	//   43   86:iconst_0        
	//   44   87:iload           4
	//   45   89:invokevirtual   #296 <Method void scrollTo(int, int)>
				}
			}
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   46   92:aload_0         
	//   47   93:invokestatic    #768 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			return;
	//   48   96:return          
		} else
		{
			completeScroll(true);
	//   49   97:aload_0         
	//   50   98:iconst_1        
	//   51   99:invokespecial   #528 <Method void completeScroll(boolean)>
			return;
	//   52  102:return          
		}
	}

	void dataSetChanged()
	{
		int j2 = mAdapter.getCount();
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field PagerAdapter mAdapter>
	//    2    4:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//    3    7:istore          9
		mExpectedAdapterCount = j2;
	//    4    9:aload_0         
	//    5   10:iload           9
	//    6   12:putfield        #771 <Field int mExpectedAdapterCount>
		boolean flag;
		if(mItems.size() < mOffscreenPageLimit * 2 + 1 && mItems.size() < j2)
	//*   7   15:aload_0         
	//*   8   16:getfield        #188 <Field ArrayList mItems>
	//*   9   19:invokevirtual   #256 <Method int ArrayList.size()>
	//*  10   22:aload_0         
	//*  11   23:getfield        #210 <Field int mOffscreenPageLimit>
	//*  12   26:iconst_2        
	//*  13   27:imul            
	//*  14   28:iconst_1        
	//*  15   29:iadd            
	//*  16   30:icmpge          50
	//*  17   33:aload_0         
	//*  18   34:getfield        #188 <Field ArrayList mItems>
	//*  19   37:invokevirtual   #256 <Method int ArrayList.size()>
	//*  20   40:iload           9
	//*  21   42:icmpge          50
			flag = true;
	//   22   45:iconst_1        
	//   23   46:istore_1        
		else
	//*  24   47:goto            52
			flag = false;
	//   25   50:iconst_0        
	//   26   51:istore_1        
		int j = mCurItem;
	//   27   52:aload_0         
	//   28   53:getfield        #330 <Field int mCurItem>
	//   29   56:istore_2        
		int k = 0;
	//   30   57:iconst_0        
	//   31   58:istore_3        
		for(int i1 = 0; i1 < mItems.size();)
	//*  32   59:iconst_0        
	//*  33   60:istore          4
	//*  34   62:iload           4
	//*  35   64:aload_0         
	//*  36   65:getfield        #188 <Field ArrayList mItems>
	//*  37   68:invokevirtual   #256 <Method int ArrayList.size()>
	//*  38   71:icmpge          304
		{
			ItemInfo iteminfo = (ItemInfo)mItems.get(i1);
	//   39   74:aload_0         
	//   40   75:getfield        #188 <Field ArrayList mItems>
	//   41   78:iload           4
	//   42   80:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   43   83:checkcast       #17  <Class ViewPager$ItemInfo>
	//   44   86:astore          10
			int i2 = mAdapter.getItemPosition(iteminfo.object);
	//   45   88:aload_0         
	//   46   89:getfield        #233 <Field PagerAdapter mAdapter>
	//   47   92:aload           10
	//   48   94:getfield        #618 <Field Object ViewPager$ItemInfo.object>
	//   49   97:invokevirtual   #775 <Method int PagerAdapter.getItemPosition(Object)>
	//   50  100:istore          8
			int j1;
			int k1;
			int l1;
			if(i2 == -1)
	//*  51  102:iload           8
	//*  52  104:iconst_m1       
	//*  53  105:icmpne          121
			{
				j1 = j;
	//   54  108:iload_2         
	//   55  109:istore          5
				k1 = k;
	//   56  111:iload_3         
	//   57  112:istore          6
				l1 = i1;
	//   58  114:iload           4
	//   59  116:istore          7
			} else
	//*  60  118:goto            289
			if(i2 == -2)
	//*  61  121:iload           8
	//*  62  123:bipush          -2
	//*  63  125:icmpne          235
			{
				mItems.remove(i1);
	//   64  128:aload_0         
	//   65  129:getfield        #188 <Field ArrayList mItems>
	//   66  132:iload           4
	//   67  134:invokevirtual   #778 <Method Object ArrayList.remove(int)>
	//   68  137:pop             
				i2 = i1 - 1;
	//   69  138:iload           4
	//   70  140:iconst_1        
	//   71  141:isub            
	//   72  142:istore          8
				i1 = k;
	//   73  144:iload_3         
	//   74  145:istore          4
				if(k == 0)
	//*  75  147:iload_3         
	//*  76  148:ifne            162
				{
					mAdapter.startUpdate(((ViewGroup) (this)));
	//   77  151:aload_0         
	//   78  152:getfield        #233 <Field PagerAdapter mAdapter>
	//   79  155:aload_0         
	//   80  156:invokevirtual   #782 <Method void PagerAdapter.startUpdate(ViewGroup)>
					i1 = 1;
	//   81  159:iconst_1        
	//   82  160:istore          4
				}
				mAdapter.destroyItem(((ViewGroup) (this)), iteminfo.position, iteminfo.object);
	//   83  162:aload_0         
	//   84  163:getfield        #233 <Field PagerAdapter mAdapter>
	//   85  166:aload_0         
	//   86  167:aload           10
	//   87  169:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   88  172:aload           10
	//   89  174:getfield        #618 <Field Object ViewPager$ItemInfo.object>
	//   90  177:invokevirtual   #786 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
				flag = true;
	//   91  180:iconst_1        
	//   92  181:istore_1        
				j1 = j;
	//   93  182:iload_2         
	//   94  183:istore          5
				k1 = i1;
	//   95  185:iload           4
	//   96  187:istore          6
				l1 = i2;
	//   97  189:iload           8
	//   98  191:istore          7
				if(mCurItem == iteminfo.position)
	//*  99  193:aload_0         
	//* 100  194:getfield        #330 <Field int mCurItem>
	//* 101  197:aload           10
	//* 102  199:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 103  202:icmpne          289
				{
					j1 = Math.max(0, Math.min(mCurItem, j2 - 1));
	//  104  205:iconst_0        
	//  105  206:aload_0         
	//  106  207:getfield        #330 <Field int mCurItem>
	//  107  210:iload           9
	//  108  212:iconst_1        
	//  109  213:isub            
	//  110  214:invokestatic    #336 <Method int Math.min(int, int)>
	//  111  217:invokestatic    #339 <Method int Math.max(int, int)>
	//  112  220:istore          5
					flag = true;
	//  113  222:iconst_1        
	//  114  223:istore_1        
					k1 = i1;
	//  115  224:iload           4
	//  116  226:istore          6
					l1 = i2;
	//  117  228:iload           8
	//  118  230:istore          7
				}
			} else
	//* 119  232:goto            289
			{
				j1 = j;
	//  120  235:iload_2         
	//  121  236:istore          5
				k1 = k;
	//  122  238:iload_3         
	//  123  239:istore          6
				l1 = i1;
	//  124  241:iload           4
	//  125  243:istore          7
				if(iteminfo.position != i2)
	//* 126  245:aload           10
	//* 127  247:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 128  250:iload           8
	//* 129  252:icmpeq          289
				{
					if(iteminfo.position == mCurItem)
	//* 130  255:aload           10
	//* 131  257:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 132  260:aload_0         
	//* 133  261:getfield        #330 <Field int mCurItem>
	//* 134  264:icmpne          270
						j = i2;
	//  135  267:iload           8
	//  136  269:istore_2        
					iteminfo.position = i2;
	//  137  270:aload           10
	//  138  272:iload           8
	//  139  274:putfield        #247 <Field int ViewPager$ItemInfo.position>
					flag = true;
	//  140  277:iconst_1        
	//  141  278:istore_1        
					l1 = i1;
	//  142  279:iload           4
	//  143  281:istore          7
					k1 = k;
	//  144  283:iload_3         
	//  145  284:istore          6
					j1 = j;
	//  146  286:iload_2         
	//  147  287:istore          5
				}
			}
			i1 = l1 + 1;
	//  148  289:iload           7
	//  149  291:iconst_1        
	//  150  292:iadd            
	//  151  293:istore          4
			j = j1;
	//  152  295:iload           5
	//  153  297:istore_2        
			k = k1;
	//  154  298:iload           6
	//  155  300:istore_3        
		}

	//* 156  301:goto            62
		if(k != 0)
	//* 157  304:iload_3         
	//* 158  305:ifeq            316
			mAdapter.finishUpdate(((ViewGroup) (this)));
	//  159  308:aload_0         
	//  160  309:getfield        #233 <Field PagerAdapter mAdapter>
	//  161  312:aload_0         
	//  162  313:invokevirtual   #789 <Method void PagerAdapter.finishUpdate(ViewGroup)>
		Collections.sort(((List) (mItems)), COMPARATOR);
	//  163  316:aload_0         
	//  164  317:getfield        #188 <Field ArrayList mItems>
	//  165  320:getstatic       #173 <Field Comparator COMPARATOR>
	//  166  323:invokestatic    #581 <Method void Collections.sort(List, Comparator)>
		if(flag)
	//* 167  326:iload_1         
	//* 168  327:ifeq            387
		{
			int l = getChildCount();
	//  169  330:aload_0         
	//  170  331:invokevirtual   #367 <Method int getChildCount()>
	//  171  334:istore_3        
			for(int i = 0; i < l; i++)
	//* 172  335:iconst_0        
	//* 173  336:istore_1        
	//* 174  337:iload_1         
	//* 175  338:iload_3         
	//* 176  339:icmpge          376
			{
				LayoutParams layoutparams = (LayoutParams)getChildAt(i).getLayoutParams();
	//  177  342:aload_0         
	//  178  343:iload_1         
	//  179  344:invokevirtual   #373 <Method View getChildAt(int)>
	//  180  347:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  181  350:checkcast       #20  <Class ViewPager$LayoutParams>
	//  182  353:astore          10
				if(!layoutparams.isDecor)
	//* 183  355:aload           10
	//* 184  357:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//* 185  360:ifne            369
					layoutparams.widthFactor = 0.0F;
	//  186  363:aload           10
	//  187  365:fconst_0        
	//  188  366:putfield        #790 <Field float ViewPager$LayoutParams.widthFactor>
			}

	//  189  369:iload_1         
	//  190  370:iconst_1        
	//  191  371:iadd            
	//  192  372:istore_1        
	//* 193  373:goto            337
			setCurrentItemInternal(j, false, true);
	//  194  376:aload_0         
	//  195  377:iload_2         
	//  196  378:iconst_0        
	//  197  379:iconst_1        
	//  198  380:invokevirtual   #794 <Method void setCurrentItemInternal(int, boolean, boolean)>
			requestLayout();
	//  199  383:aload_0         
	//  200  384:invokevirtual   #797 <Method void requestLayout()>
		}
	//  201  387:return          
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		return super.dispatchKeyEvent(keyevent) || executeKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #801 <Method boolean ViewGroup.dispatchKeyEvent(KeyEvent)>
	//    3    5:ifne            16
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #804 <Method boolean executeKeyEvent(KeyEvent)>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		if(accessibilityevent.getEventType() == 4096)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #811 <Method int AccessibilityEvent.getEventType()>
	//*   2    4:sipush          4096
	//*   3    7:icmpne          16
			return super.dispatchPopulateAccessibilityEvent(accessibilityevent);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokespecial   #813 <Method boolean ViewGroup.dispatchPopulateAccessibilityEvent(AccessibilityEvent)>
	//    7   15:ireturn         
		int j = getChildCount();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #367 <Method int getChildCount()>
	//   10   20:istore_3        
		for(int i = 0; i < j; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_2        
	//*  13   23:iload_2         
	//*  14   24:iload_3         
	//*  15   25:icmpge          86
		{
			View view = getChildAt(i);
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #373 <Method View getChildAt(int)>
	//   19   33:astore          4
			if(view.getVisibility() != 0)
				continue;
	//   20   35:aload           4
	//   21   37:invokevirtual   #590 <Method int View.getVisibility()>
	//   22   40:ifne            79
			ItemInfo iteminfo = infoForChild(view);
	//   23   43:aload_0         
	//   24   44:aload           4
	//   25   46:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//   26   49:astore          5
			if(iteminfo != null && iteminfo.position == mCurItem && view.dispatchPopulateAccessibilityEvent(accessibilityevent))
	//*  27   51:aload           5
	//*  28   53:ifnull          79
	//*  29   56:aload           5
	//*  30   58:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  31   61:aload_0         
	//*  32   62:getfield        #330 <Field int mCurItem>
	//*  33   65:icmpne          79
	//*  34   68:aload           4
	//*  35   70:aload_1         
	//*  36   71:invokevirtual   #814 <Method boolean View.dispatchPopulateAccessibilityEvent(AccessibilityEvent)>
	//*  37   74:ifeq            79
				return true;
	//   38   77:iconst_1        
	//   39   78:ireturn         
		}

	//   40   79:iload_2         
	//   41   80:iconst_1        
	//   42   81:iadd            
	//   43   82:istore_2        
	//*  44   83:goto            23
		return false;
	//   45   86:iconst_0        
	//   46   87:ireturn         
	}

	float distanceInfluenceForSnapDuration(float f)
	{
		return (float)Math.sin((float)((double)(f - 0.5F) * 0.4712389167638204D));
	//    0    0:fload_1         
	//    1    1:ldc2            #816 <Float 0.5F>
	//    2    4:fsub            
	//    3    5:f2d             
	//    4    6:ldc2w           #817 <Double 0.4712389167638204D>
	//    5    9:dmul            
	//    6   10:d2f             
	//    7   11:f2d             
	//    8   12:invokestatic    #822 <Method double Math.sin(double)>
	//    9   15:d2f             
	//   10   16:freturn         
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #826 <Method void ViewGroup.draw(Canvas)>
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		int i = 0;
	//    5    7:iconst_0        
	//    6    8:istore_2        
		int k = getOverScrollMode();
	//    7    9:aload_0         
	//    8   10:invokevirtual   #829 <Method int getOverScrollMode()>
	//    9   13:istore          4
		if(k == 0 || k == 1 && mAdapter != null && mAdapter.getCount() > 1)
	//*  10   15:iload           4
	//*  11   17:ifeq            44
	//*  12   20:iload           4
	//*  13   22:iconst_1        
	//*  14   23:icmpne          237
	//*  15   26:aload_0         
	//*  16   27:getfield        #233 <Field PagerAdapter mAdapter>
	//*  17   30:ifnull          237
	//*  18   33:aload_0         
	//*  19   34:getfield        #233 <Field PagerAdapter mAdapter>
	//*  20   37:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*  21   40:iconst_1        
	//*  22   41:icmple          237
		{
			if(!mLeftEdge.isFinished())
	//*  23   44:aload_0         
	//*  24   45:getfield        #498 <Field EdgeEffect mLeftEdge>
	//*  25   48:invokevirtual   #553 <Method boolean EdgeEffect.isFinished()>
	//*  26   51:ifne            133
			{
				j = canvas.save();
	//   27   54:aload_1         
	//   28   55:invokevirtual   #834 <Method int Canvas.save()>
	//   29   58:istore_3        
				i = getHeight() - getPaddingTop() - getPaddingBottom();
	//   30   59:aload_0         
	//   31   60:invokevirtual   #837 <Method int getHeight()>
	//   32   63:aload_0         
	//   33   64:invokevirtual   #840 <Method int getPaddingTop()>
	//   34   67:isub            
	//   35   68:aload_0         
	//   36   69:invokevirtual   #843 <Method int getPaddingBottom()>
	//   37   72:isub            
	//   38   73:istore_2        
				int l = getWidth();
	//   39   74:aload_0         
	//   40   75:invokevirtual   #464 <Method int getWidth()>
	//   41   78:istore          4
				canvas.rotate(270F);
	//   42   80:aload_1         
	//   43   81:ldc2            #844 <Float 270F>
	//   44   84:invokevirtual   #847 <Method void Canvas.rotate(float)>
				canvas.translate(-i + getPaddingTop(), mFirstOffset * (float)l);
	//   45   87:aload_1         
	//   46   88:iload_2         
	//   47   89:ineg            
	//   48   90:aload_0         
	//   49   91:invokevirtual   #840 <Method int getPaddingTop()>
	//   50   94:iadd            
	//   51   95:i2f             
	//   52   96:aload_0         
	//   53   97:getfield        #205 <Field float mFirstOffset>
	//   54  100:iload           4
	//   55  102:i2f             
	//   56  103:fmul            
	//   57  104:invokevirtual   #851 <Method void Canvas.translate(float, float)>
				mLeftEdge.setSize(i, l);
	//   58  107:aload_0         
	//   59  108:getfield        #498 <Field EdgeEffect mLeftEdge>
	//   60  111:iload_2         
	//   61  112:iload           4
	//   62  114:invokevirtual   #854 <Method void EdgeEffect.setSize(int, int)>
				i = ((int) (mLeftEdge.draw(canvas) | false));
	//   63  117:aload_0         
	//   64  118:getfield        #498 <Field EdgeEffect mLeftEdge>
	//   65  121:aload_1         
	//   66  122:invokevirtual   #857 <Method boolean EdgeEffect.draw(Canvas)>
	//   67  125:iconst_0        
	//   68  126:ior             
	//   69  127:istore_2        
				canvas.restoreToCount(j);
	//   70  128:aload_1         
	//   71  129:iload_3         
	//   72  130:invokevirtual   #860 <Method void Canvas.restoreToCount(int)>
			}
			j = i;
	//   73  133:iload_2         
	//   74  134:istore_3        
			if(!mRightEdge.isFinished())
	//*  75  135:aload_0         
	//*  76  136:getfield        #509 <Field EdgeEffect mRightEdge>
	//*  77  139:invokevirtual   #553 <Method boolean EdgeEffect.isFinished()>
	//*  78  142:ifne            251
			{
				int i1 = canvas.save();
	//   79  145:aload_1         
	//   80  146:invokevirtual   #834 <Method int Canvas.save()>
	//   81  149:istore          4
				j = getWidth();
	//   82  151:aload_0         
	//   83  152:invokevirtual   #464 <Method int getWidth()>
	//   84  155:istore_3        
				int j1 = getHeight();
	//   85  156:aload_0         
	//   86  157:invokevirtual   #837 <Method int getHeight()>
	//   87  160:istore          5
				int k1 = getPaddingTop();
	//   88  162:aload_0         
	//   89  163:invokevirtual   #840 <Method int getPaddingTop()>
	//   90  166:istore          6
				int l1 = getPaddingBottom();
	//   91  168:aload_0         
	//   92  169:invokevirtual   #843 <Method int getPaddingBottom()>
	//   93  172:istore          7
				canvas.rotate(90F);
	//   94  174:aload_1         
	//   95  175:ldc2            #861 <Float 90F>
	//   96  178:invokevirtual   #847 <Method void Canvas.rotate(float)>
				canvas.translate(-getPaddingTop(), -(mLastOffset + 1.0F) * (float)j);
	//   97  181:aload_1         
	//   98  182:aload_0         
	//   99  183:invokevirtual   #840 <Method int getPaddingTop()>
	//  100  186:ineg            
	//  101  187:i2f             
	//  102  188:aload_0         
	//  103  189:getfield        #208 <Field float mLastOffset>
	//  104  192:fconst_1        
	//  105  193:fadd            
	//  106  194:fneg            
	//  107  195:iload_3         
	//  108  196:i2f             
	//  109  197:fmul            
	//  110  198:invokevirtual   #851 <Method void Canvas.translate(float, float)>
				mRightEdge.setSize(j1 - k1 - l1, j);
	//  111  201:aload_0         
	//  112  202:getfield        #509 <Field EdgeEffect mRightEdge>
	//  113  205:iload           5
	//  114  207:iload           6
	//  115  209:isub            
	//  116  210:iload           7
	//  117  212:isub            
	//  118  213:iload_3         
	//  119  214:invokevirtual   #854 <Method void EdgeEffect.setSize(int, int)>
				j = i | mRightEdge.draw(canvas);
	//  120  217:iload_2         
	//  121  218:aload_0         
	//  122  219:getfield        #509 <Field EdgeEffect mRightEdge>
	//  123  222:aload_1         
	//  124  223:invokevirtual   #857 <Method boolean EdgeEffect.draw(Canvas)>
	//  125  226:ior             
	//  126  227:istore_3        
				canvas.restoreToCount(i1);
	//  127  228:aload_1         
	//  128  229:iload           4
	//  129  231:invokevirtual   #860 <Method void Canvas.restoreToCount(int)>
			}
		} else
	//* 130  234:goto            251
		{
			mLeftEdge.finish();
	//  131  237:aload_0         
	//  132  238:getfield        #498 <Field EdgeEffect mLeftEdge>
	//  133  241:invokevirtual   #864 <Method void EdgeEffect.finish()>
			mRightEdge.finish();
	//  134  244:aload_0         
	//  135  245:getfield        #509 <Field EdgeEffect mRightEdge>
	//  136  248:invokevirtual   #864 <Method void EdgeEffect.finish()>
		}
		if(j != 0)
	//* 137  251:iload_3         
	//* 138  252:ifeq            259
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  139  255:aload_0         
	//  140  256:invokestatic    #768 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//  141  259:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #867 <Method void ViewGroup.drawableStateChanged()>
		Drawable drawable = mMarginDrawable;
	//    2    4:aload_0         
	//    3    5:getfield        #869 <Field Drawable mMarginDrawable>
	//    4    8:astore_1        
		if(drawable != null && drawable.isStateful())
	//*   5    9:aload_1         
	//*   6   10:ifnull          29
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #874 <Method boolean Drawable.isStateful()>
	//*   9   17:ifeq            29
			drawable.setState(getDrawableState());
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #878 <Method int[] getDrawableState()>
	//   13   25:invokevirtual   #882 <Method boolean Drawable.setState(int[])>
	//   14   28:pop             
	//   15   29:return          
	}

	public void endFakeDrag()
	{
		if(!mFakeDragging)
	//*   0    0:aload_0         
	//*   1    1:getfield        #720 <Field boolean mFakeDragging>
	//*   2    4:ifne            18
			throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
	//    3    7:new             #487 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #885 <String "No fake drag in progress. Call beginFakeDrag first.">
	//    6   14:invokespecial   #492 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(mAdapter != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #233 <Field PagerAdapter mAdapter>
	//*  10   22:ifnull          120
		{
			Object obj = ((Object) (mVelocityTracker));
	//   11   25:aload_0         
	//   12   26:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//   13   29:astore          4
			((VelocityTracker) (obj)).computeCurrentVelocity(1000, mMaximumVelocity);
	//   14   31:aload           4
	//   15   33:sipush          1000
	//   16   36:aload_0         
	//   17   37:getfield        #887 <Field int mMaximumVelocity>
	//   18   40:i2f             
	//   19   41:invokevirtual   #891 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
			int i = (int)((VelocityTracker) (obj)).getXVelocity(mActivePointerId);
	//   20   44:aload           4
	//   21   46:aload_0         
	//   22   47:getfield        #212 <Field int mActivePointerId>
	//   23   50:invokevirtual   #894 <Method float VelocityTracker.getXVelocity(int)>
	//   24   53:f2i             
	//   25   54:istore_1        
			mPopulatePending = true;
	//   26   55:aload_0         
	//   27   56:iconst_1        
	//   28   57:putfield        #302 <Field boolean mPopulatePending>
			int j = getClientWidth();
	//   29   60:aload_0         
	//   30   61:invokespecial   #242 <Method int getClientWidth()>
	//   31   64:istore_2        
			int k = getScrollX();
	//   32   65:aload_0         
	//   33   66:invokevirtual   #283 <Method int getScrollX()>
	//   34   69:istore_3        
			obj = ((Object) (infoForCurrentScrollPosition()));
	//   35   70:aload_0         
	//   36   71:invokespecial   #494 <Method ViewPager$ItemInfo infoForCurrentScrollPosition()>
	//   37   74:astore          4
			setCurrentItemInternal(determineTargetPage(((ItemInfo) (obj)).position, ((float)k / (float)j - ((ItemInfo) (obj)).offset) / ((ItemInfo) (obj)).widthFactor, i, (int)(mLastMotionX - mInitialMotionX)), true, true, i);
	//   38   76:aload_0         
	//   39   77:aload_0         
	//   40   78:aload           4
	//   41   80:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   42   83:iload_3         
	//   43   84:i2f             
	//   44   85:iload_2         
	//   45   86:i2f             
	//   46   87:fdiv            
	//   47   88:aload           4
	//   48   90:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   49   93:fsub            
	//   50   94:aload           4
	//   51   96:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//   52   99:fdiv            
	//   53  100:iload_1         
	//   54  101:aload_0         
	//   55  102:getfield        #479 <Field float mLastMotionX>
	//   56  105:aload_0         
	//   57  106:getfield        #725 <Field float mInitialMotionX>
	//   58  109:fsub            
	//   59  110:f2i             
	//   60  111:invokespecial   #896 <Method int determineTargetPage(int, float, int, int)>
	//   61  114:iconst_1        
	//   62  115:iconst_1        
	//   63  116:iload_1         
	//   64  117:invokevirtual   #899 <Method void setCurrentItemInternal(int, boolean, boolean, int)>
		}
		endDrag();
	//   65  120:aload_0         
	//   66  121:invokespecial   #549 <Method void endDrag()>
		mFakeDragging = false;
	//   67  124:aload_0         
	//   68  125:iconst_0        
	//   69  126:putfield        #720 <Field boolean mFakeDragging>
	//   70  129:return          
	}

	public boolean executeKeyEvent(KeyEvent keyevent)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = flag1;
	//    2    2:iload_3         
	//    3    3:istore_2        
		if(keyevent.getAction() == 0)
	//*   4    4:aload_1         
	//*   5    5:invokevirtual   #904 <Method int KeyEvent.getAction()>
	//*   6    8:ifne            93
		{
			switch(keyevent.getKeyCode())
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #907 <Method int KeyEvent.getKeyCode()>
			{
	//*   9   15:lookupswitch    3: default 48
	//	               21: 50
	//	               22: 57
	//	               61: 64
			default:
				return false;
	//   10   48:iconst_0        
	//   11   49:ireturn         

			case 21: // '\025'
				return arrowScroll(17);
	//   12   50:aload_0         
	//   13   51:bipush          17
	//   14   53:invokevirtual   #909 <Method boolean arrowScroll(int)>
	//   15   56:ireturn         

			case 22: // '\026'
				return arrowScroll(66);
	//   16   57:aload_0         
	//   17   58:bipush          66
	//   18   60:invokevirtual   #909 <Method boolean arrowScroll(int)>
	//   19   63:ireturn         

			case 61: // '='
				break;
			}
			if(keyevent.hasNoModifiers())
	//*  20   64:aload_1         
	//*  21   65:invokevirtual   #912 <Method boolean KeyEvent.hasNoModifiers()>
	//*  22   68:ifeq            77
				return arrowScroll(2);
	//   23   71:aload_0         
	//   24   72:iconst_2        
	//   25   73:invokevirtual   #909 <Method boolean arrowScroll(int)>
	//   26   76:ireturn         
			flag = flag1;
	//   27   77:iload_3         
	//   28   78:istore_2        
			if(keyevent.hasModifiers(1))
	//*  29   79:aload_1         
	//*  30   80:iconst_1        
	//*  31   81:invokevirtual   #915 <Method boolean KeyEvent.hasModifiers(int)>
	//*  32   84:ifeq            93
				flag = arrowScroll(1);
	//   33   87:aload_0         
	//   34   88:iconst_1        
	//   35   89:invokevirtual   #909 <Method boolean arrowScroll(int)>
	//   36   92:istore_2        
		}
		return flag;
	//   37   93:iload_2         
	//   38   94:ireturn         
	}

	public void fakeDragBy(float f)
	{
		if(!mFakeDragging)
	//*   0    0:aload_0         
	//*   1    1:getfield        #720 <Field boolean mFakeDragging>
	//*   2    4:ifne            18
			throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
	//    3    7:new             #487 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #885 <String "No fake drag in progress. Call beginFakeDrag first.">
	//    6   14:invokespecial   #492 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(mAdapter == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #233 <Field PagerAdapter mAdapter>
	//*  10   22:ifnonnull       26
			return;
	//   11   25:return          
		mLastMotionX = mLastMotionX + f;
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #479 <Field float mLastMotionX>
	//   15   31:fload_1         
	//   16   32:fadd            
	//   17   33:putfield        #479 <Field float mLastMotionX>
		float f2 = (float)getScrollX() - f;
	//   18   36:aload_0         
	//   19   37:invokevirtual   #283 <Method int getScrollX()>
	//   20   40:i2f             
	//   21   41:fload_1         
	//   22   42:fsub            
	//   23   43:fstore_3        
		int i = getClientWidth();
	//   24   44:aload_0         
	//   25   45:invokespecial   #242 <Method int getClientWidth()>
	//   26   48:istore          4
		f = (float)i * mFirstOffset;
	//   27   50:iload           4
	//   28   52:i2f             
	//   29   53:aload_0         
	//   30   54:getfield        #205 <Field float mFirstOffset>
	//   31   57:fmul            
	//   32   58:fstore_1        
		float f1 = (float)i * mLastOffset;
	//   33   59:iload           4
	//   34   61:i2f             
	//   35   62:aload_0         
	//   36   63:getfield        #208 <Field float mLastOffset>
	//   37   66:fmul            
	//   38   67:fstore_2        
		Object obj = ((Object) ((ItemInfo)mItems.get(0)));
	//   39   68:aload_0         
	//   40   69:getfield        #188 <Field ArrayList mItems>
	//   41   72:iconst_0        
	//   42   73:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   43   76:checkcast       #17  <Class ViewPager$ItemInfo>
	//   44   79:astore          7
		ItemInfo iteminfo = (ItemInfo)mItems.get(mItems.size() - 1);
	//   45   81:aload_0         
	//   46   82:getfield        #188 <Field ArrayList mItems>
	//   47   85:aload_0         
	//   48   86:getfield        #188 <Field ArrayList mItems>
	//   49   89:invokevirtual   #256 <Method int ArrayList.size()>
	//   50   92:iconst_1        
	//   51   93:isub            
	//   52   94:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   53   97:checkcast       #17  <Class ViewPager$ItemInfo>
	//   54  100:astore          8
		if(((ItemInfo) (obj)).position != 0)
	//*  55  102:aload           7
	//*  56  104:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  57  107:ifeq            120
			f = ((ItemInfo) (obj)).offset * (float)i;
	//   58  110:aload           7
	//   59  112:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   60  115:iload           4
	//   61  117:i2f             
	//   62  118:fmul            
	//   63  119:fstore_1        
		if(iteminfo.position != mAdapter.getCount() - 1)
	//*  64  120:aload           8
	//*  65  122:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  66  125:aload_0         
	//*  67  126:getfield        #233 <Field PagerAdapter mAdapter>
	//*  68  129:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*  69  132:iconst_1        
	//*  70  133:isub            
	//*  71  134:icmpeq          147
			f1 = iteminfo.offset * (float)i;
	//   72  137:aload           8
	//   73  139:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   74  142:iload           4
	//   75  144:i2f             
	//   76  145:fmul            
	//   77  146:fstore_2        
		if(f2 >= f)
	//*  78  147:fload_3         
	//*  79  148:fload_1         
	//*  80  149:fcmpg           
	//*  81  150:ifge            156
	//*  82  153:goto            166
		{
			f = f2;
	//   83  156:fload_3         
	//   84  157:fstore_1        
			if(f2 > f1)
	//*  85  158:fload_3         
	//*  86  159:fload_2         
	//*  87  160:fcmpl           
	//*  88  161:ifle            166
				f = f1;
	//   89  164:fload_2         
	//   90  165:fstore_1        
		}
		mLastMotionX = mLastMotionX + (f - (float)(int)f);
	//   91  166:aload_0         
	//   92  167:aload_0         
	//   93  168:getfield        #479 <Field float mLastMotionX>
	//   94  171:fload_1         
	//   95  172:fload_1         
	//   96  173:f2i             
	//   97  174:i2f             
	//   98  175:fsub            
	//   99  176:fadd            
	//  100  177:putfield        #479 <Field float mLastMotionX>
		scrollTo((int)f, getScrollY());
	//  101  180:aload_0         
	//  102  181:fload_1         
	//  103  182:f2i             
	//  104  183:aload_0         
	//  105  184:invokevirtual   #286 <Method int getScrollY()>
	//  106  187:invokevirtual   #296 <Method void scrollTo(int, int)>
		pageScrolled((int)f);
	//  107  190:aload_0         
	//  108  191:fload_1         
	//  109  192:f2i             
	//  110  193:invokespecial   #300 <Method boolean pageScrolled(int)>
	//  111  196:pop             
		long l = SystemClock.uptimeMillis();
	//  112  197:invokestatic    #735 <Method long SystemClock.uptimeMillis()>
	//  113  200:lstore          5
		obj = ((Object) (MotionEvent.obtain(mFakeDragBeginTime, l, 2, mLastMotionX, 0.0F, 0)));
	//  114  202:aload_0         
	//  115  203:getfield        #744 <Field long mFakeDragBeginTime>
	//  116  206:lload           5
	//  117  208:iconst_2        
	//  118  209:aload_0         
	//  119  210:getfield        #479 <Field float mLastMotionX>
	//  120  213:fconst_0        
	//  121  214:iconst_0        
	//  122  215:invokestatic    #738 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//  123  218:astore          7
		mVelocityTracker.addMovement(((MotionEvent) (obj)));
	//  124  220:aload_0         
	//  125  221:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//  126  224:aload           7
	//  127  226:invokevirtual   #741 <Method void VelocityTracker.addMovement(MotionEvent)>
		((MotionEvent) (obj)).recycle();
	//  128  229:aload           7
	//  129  231:invokevirtual   #742 <Method void MotionEvent.recycle()>
	//  130  234:return          
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams()));
	//    0    0:new             #20  <Class ViewPager$LayoutParams>
	//    1    3:dup             
	//    2    4:invokespecial   #918 <Method void ViewPager$LayoutParams()>
	//    3    7:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #20  <Class ViewPager$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #923 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #924 <Method void ViewPager$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return generateDefaultLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #926 <Method android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public PagerAdapter getAdapter()
	{
		return mAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field PagerAdapter mAdapter>
	//    2    4:areturn         
	}

	protected int getChildDrawingOrder(int i, int j)
	{
		if(mDrawingOrder == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #568 <Field int mDrawingOrder>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          17
			j = i - 1 - j;
	//    4    8:iload_1         
	//    5    9:iconst_1        
	//    6   10:isub            
	//    7   11:iload_2         
	//    8   12:isub            
	//    9   13:istore_2        
	//*  10   14:goto            17
		return ((LayoutParams)((View)mDrawingOrderedChildren.get(j)).getLayoutParams()).childIndex;
	//   11   17:aload_0         
	//   12   18:getfield        #570 <Field ArrayList mDrawingOrderedChildren>
	//   13   21:iload_2         
	//   14   22:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   15   25:checkcast       #375 <Class View>
	//   16   28:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   17   31:checkcast       #20  <Class ViewPager$LayoutParams>
	//   18   34:getfield        #932 <Field int ViewPager$LayoutParams.childIndex>
	//   19   37:ireturn         
	}

	public int getCurrentItem()
	{
		return mCurItem;
	//    0    0:aload_0         
	//    1    1:getfield        #330 <Field int mCurItem>
	//    2    4:ireturn         
	}

	public int getOffscreenPageLimit()
	{
		return mOffscreenPageLimit;
	//    0    0:aload_0         
	//    1    1:getfield        #210 <Field int mOffscreenPageLimit>
	//    2    4:ireturn         
	}

	public int getPageMargin()
	{
		return mPageMargin;
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field int mPageMargin>
	//    2    4:ireturn         
	}

	ItemInfo infoForAnyChild(View view)
	{
		do
		{
			ViewParent viewparent = view.getParent();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #425 <Method ViewParent View.getParent()>
	//    2    4:astore_2        
			if(viewparent != this)
	//*   3    5:aload_2         
	//*   4    6:aload_0         
	//*   5    7:if_acmpeq       31
			{
				if(viewparent == null || !(viewparent instanceof View))
	//*   6   10:aload_2         
	//*   7   11:ifnull          21
	//*   8   14:aload_2         
	//*   9   15:instanceof      #375 <Class View>
	//*  10   18:ifne            23
					return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
				view = (View)viewparent;
	//   13   23:aload_2         
	//   14   24:checkcast       #375 <Class View>
	//   15   27:astore_1        
			} else
	//*  16   28:goto            0
			{
				return infoForChild(view);
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//   20   36:areturn         
			}
		} while(true);
	}

	ItemInfo infoForChild(View view)
	{
		for(int i = 0; i < mItems.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #188 <Field ArrayList mItems>
	//*   5    7:invokevirtual   #256 <Method int ArrayList.size()>
	//*   6   10:icmpge          49
		{
			ItemInfo iteminfo = (ItemInfo)mItems.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #188 <Field ArrayList mItems>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #17  <Class ViewPager$ItemInfo>
	//   12   24:astore_3        
			if(mAdapter.isViewFromObject(view, iteminfo.object))
	//*  13   25:aload_0         
	//*  14   26:getfield        #233 <Field PagerAdapter mAdapter>
	//*  15   29:aload_1         
	//*  16   30:aload_3         
	//*  17   31:getfield        #618 <Field Object ViewPager$ItemInfo.object>
	//*  18   34:invokevirtual   #939 <Method boolean PagerAdapter.isViewFromObject(View, Object)>
	//*  19   37:ifeq            42
				return iteminfo;
	//   20   40:aload_3         
	//   21   41:areturn         
		}

	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_2        
	//*  26   46:goto            2
		return null;
	//   27   49:aconst_null     
	//   28   50:areturn         
	}

	ItemInfo infoForPosition(int i)
	{
		for(int j = 0; j < mItems.size(); j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #188 <Field ArrayList mItems>
	//*   5    7:invokevirtual   #256 <Method int ArrayList.size()>
	//*   6   10:icmpge          42
		{
			ItemInfo iteminfo = (ItemInfo)mItems.get(j);
	//    7   13:aload_0         
	//    8   14:getfield        #188 <Field ArrayList mItems>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #17  <Class ViewPager$ItemInfo>
	//   12   24:astore_3        
			if(iteminfo.position == i)
	//*  13   25:aload_3         
	//*  14   26:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  15   29:iload_1         
	//*  16   30:icmpne          35
				return iteminfo;
	//   17   33:aload_3         
	//   18   34:areturn         
		}

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            2
		return null;
	//   24   42:aconst_null     
	//   25   43:areturn         
	}

	void initViewPager()
	{
		setWillNotDraw(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #942 <Method void setWillNotDraw(boolean)>
		setDescendantFocusability(0x40000);
	//    3    5:aload_0         
	//    4    6:ldc2            #597 <Int 0x40000>
	//    5    9:invokevirtual   #945 <Method void setDescendantFocusability(int)>
		setFocusable(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #948 <Method void setFocusable(boolean)>
		Context context = getContext();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #923 <Method Context getContext()>
	//   11   21:astore_2        
		mScroller = new Scroller(context, sInterpolator);
	//   12   22:aload_0         
	//   13   23:new             #273 <Class Scroller>
	//   14   26:dup             
	//   15   27:aload_2         
	//   16   28:getstatic       #176 <Field Interpolator sInterpolator>
	//   17   31:invokespecial   #951 <Method void Scroller(Context, Interpolator)>
	//   18   34:putfield        #271 <Field Scroller mScroller>
		ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
	//   19   37:aload_2         
	//   20   38:invokestatic    #956 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   21   41:astore_3        
		float f = context.getResources().getDisplayMetrics().density;
	//   22   42:aload_2         
	//   23   43:invokevirtual   #962 <Method Resources Context.getResources()>
	//   24   46:invokevirtual   #968 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   25   49:getfield        #973 <Field float DisplayMetrics.density>
	//   26   52:fstore_1        
		mTouchSlop = viewconfiguration.getScaledPagingTouchSlop();
	//   27   53:aload_0         
	//   28   54:aload_3         
	//   29   55:invokevirtual   #976 <Method int ViewConfiguration.getScaledPagingTouchSlop()>
	//   30   58:putfield        #978 <Field int mTouchSlop>
		mMinimumVelocity = (int)(400F * f);
	//   31   61:aload_0         
	//   32   62:ldc2            #979 <Float 400F>
	//   33   65:fload_1         
	//   34   66:fmul            
	//   35   67:f2i             
	//   36   68:putfield        #328 <Field int mMinimumVelocity>
		mMaximumVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
	//   37   71:aload_0         
	//   38   72:aload_3         
	//   39   73:invokevirtual   #982 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   40   76:putfield        #887 <Field int mMaximumVelocity>
		mLeftEdge = new EdgeEffect(context);
	//   41   79:aload_0         
	//   42   80:new             #503 <Class EdgeEffect>
	//   43   83:dup             
	//   44   84:aload_2         
	//   45   85:invokespecial   #983 <Method void EdgeEffect(Context)>
	//   46   88:putfield        #498 <Field EdgeEffect mLeftEdge>
		mRightEdge = new EdgeEffect(context);
	//   47   91:aload_0         
	//   48   92:new             #503 <Class EdgeEffect>
	//   49   95:dup             
	//   50   96:aload_2         
	//   51   97:invokespecial   #983 <Method void EdgeEffect(Context)>
	//   52  100:putfield        #509 <Field EdgeEffect mRightEdge>
		mFlingDistance = (int)(25F * f);
	//   53  103:aload_0         
	//   54  104:ldc2            #984 <Float 25F>
	//   55  107:fload_1         
	//   56  108:fmul            
	//   57  109:f2i             
	//   58  110:putfield        #326 <Field int mFlingDistance>
		mCloseEnough = (int)(2.0F * f);
	//   59  113:aload_0         
	//   60  114:fconst_2        
	//   61  115:fload_1         
	//   62  116:fmul            
	//   63  117:f2i             
	//   64  118:putfield        #986 <Field int mCloseEnough>
		mDefaultGutterSize = (int)(16F * f);
	//   65  121:aload_0         
	//   66  122:ldc2            #987 <Float 16F>
	//   67  125:fload_1         
	//   68  126:fmul            
	//   69  127:f2i             
	//   70  128:putfield        #989 <Field int mDefaultGutterSize>
		ViewCompat.setAccessibilityDelegate(((View) (this)), ((AccessibilityDelegateCompat) (new MyAccessibilityDelegate())));
	//   71  131:aload_0         
	//   72  132:new             #23  <Class ViewPager$MyAccessibilityDelegate>
	//   73  135:dup             
	//   74  136:aload_0         
	//   75  137:invokespecial   #990 <Method void ViewPager$MyAccessibilityDelegate(ViewPager)>
	//   76  140:invokestatic    #994 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
		if(ViewCompat.getImportantForAccessibility(((View) (this))) == 0)
	//*  77  143:aload_0         
	//*  78  144:invokestatic    #998 <Method int ViewCompat.getImportantForAccessibility(View)>
	//*  79  147:ifne            155
			ViewCompat.setImportantForAccessibility(((View) (this)), 1);
	//   80  150:aload_0         
	//   81  151:iconst_1        
	//   82  152:invokestatic    #1002 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		ViewCompat.setOnApplyWindowInsetsListener(((View) (this)), new OnApplyWindowInsetsListener() {

			public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
			{
				view = ((View) (ViewCompat.onApplyWindowInsets(view, windowinsetscompat)));
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokestatic    #33  <Method WindowInsetsCompat ViewCompat.onApplyWindowInsets(View, WindowInsetsCompat)>
			//    3    5:astore_1        
				if(((WindowInsetsCompat) (view)).isConsumed())
			//*   4    6:aload_1         
			//*   5    7:invokevirtual   #39  <Method boolean WindowInsetsCompat.isConsumed()>
			//*   6   10:ifeq            15
					return ((WindowInsetsCompat) (view));
			//    7   13:aload_1         
			//    8   14:areturn         
				windowinsetscompat = ((WindowInsetsCompat) (mTempRect));
			//    9   15:aload_0         
			//   10   16:getfield        #26  <Field Rect mTempRect>
			//   11   19:astore_2        
				windowinsetscompat.left = ((WindowInsetsCompat) (view)).getSystemWindowInsetLeft();
			//   12   20:aload_2         
			//   13   21:aload_1         
			//   14   22:invokevirtual   #43  <Method int WindowInsetsCompat.getSystemWindowInsetLeft()>
			//   15   25:putfield        #47  <Field int Rect.left>
				windowinsetscompat.top = ((WindowInsetsCompat) (view)).getSystemWindowInsetTop();
			//   16   28:aload_2         
			//   17   29:aload_1         
			//   18   30:invokevirtual   #50  <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
			//   19   33:putfield        #53  <Field int Rect.top>
				windowinsetscompat.right = ((WindowInsetsCompat) (view)).getSystemWindowInsetRight();
			//   20   36:aload_2         
			//   21   37:aload_1         
			//   22   38:invokevirtual   #56  <Method int WindowInsetsCompat.getSystemWindowInsetRight()>
			//   23   41:putfield        #59  <Field int Rect.right>
				windowinsetscompat.bottom = ((WindowInsetsCompat) (view)).getSystemWindowInsetBottom();
			//   24   44:aload_2         
			//   25   45:aload_1         
			//   26   46:invokevirtual   #62  <Method int WindowInsetsCompat.getSystemWindowInsetBottom()>
			//   27   49:putfield        #65  <Field int Rect.bottom>
				int i = 0;
			//   28   52:iconst_0        
			//   29   53:istore_3        
				for(int j = getChildCount(); i < j; i++)
			//*  30   54:aload_0         
			//*  31   55:getfield        #19  <Field ViewPager this$0>
			//*  32   58:invokevirtual   #68  <Method int ViewPager.getChildCount()>
			//*  33   61:istore          4
			//*  34   63:iload_3         
			//*  35   64:iload           4
			//*  36   66:icmpge          154
				{
					WindowInsetsCompat windowinsetscompat1 = ViewCompat.dispatchApplyWindowInsets(getChildAt(i), ((WindowInsetsCompat) (view)));
			//   37   69:aload_0         
			//   38   70:getfield        #19  <Field ViewPager this$0>
			//   39   73:iload_3         
			//   40   74:invokevirtual   #72  <Method View ViewPager.getChildAt(int)>
			//   41   77:aload_1         
			//   42   78:invokestatic    #75  <Method WindowInsetsCompat ViewCompat.dispatchApplyWindowInsets(View, WindowInsetsCompat)>
			//   43   81:astore          5
					windowinsetscompat.left = Math.min(windowinsetscompat1.getSystemWindowInsetLeft(), ((Rect) (windowinsetscompat)).left);
			//   44   83:aload_2         
			//   45   84:aload           5
			//   46   86:invokevirtual   #43  <Method int WindowInsetsCompat.getSystemWindowInsetLeft()>
			//   47   89:aload_2         
			//   48   90:getfield        #47  <Field int Rect.left>
			//   49   93:invokestatic    #81  <Method int Math.min(int, int)>
			//   50   96:putfield        #47  <Field int Rect.left>
					windowinsetscompat.top = Math.min(windowinsetscompat1.getSystemWindowInsetTop(), ((Rect) (windowinsetscompat)).top);
			//   51   99:aload_2         
			//   52  100:aload           5
			//   53  102:invokevirtual   #50  <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
			//   54  105:aload_2         
			//   55  106:getfield        #53  <Field int Rect.top>
			//   56  109:invokestatic    #81  <Method int Math.min(int, int)>
			//   57  112:putfield        #53  <Field int Rect.top>
					windowinsetscompat.right = Math.min(windowinsetscompat1.getSystemWindowInsetRight(), ((Rect) (windowinsetscompat)).right);
			//   58  115:aload_2         
			//   59  116:aload           5
			//   60  118:invokevirtual   #56  <Method int WindowInsetsCompat.getSystemWindowInsetRight()>
			//   61  121:aload_2         
			//   62  122:getfield        #59  <Field int Rect.right>
			//   63  125:invokestatic    #81  <Method int Math.min(int, int)>
			//   64  128:putfield        #59  <Field int Rect.right>
					windowinsetscompat.bottom = Math.min(windowinsetscompat1.getSystemWindowInsetBottom(), ((Rect) (windowinsetscompat)).bottom);
			//   65  131:aload_2         
			//   66  132:aload           5
			//   67  134:invokevirtual   #62  <Method int WindowInsetsCompat.getSystemWindowInsetBottom()>
			//   68  137:aload_2         
			//   69  138:getfield        #65  <Field int Rect.bottom>
			//   70  141:invokestatic    #81  <Method int Math.min(int, int)>
			//   71  144:putfield        #65  <Field int Rect.bottom>
				}

			//   72  147:iload_3         
			//   73  148:iconst_1        
			//   74  149:iadd            
			//   75  150:istore_3        
			//*  76  151:goto            63
				return ((WindowInsetsCompat) (view)).replaceSystemWindowInsets(((Rect) (windowinsetscompat)).left, ((Rect) (windowinsetscompat)).top, ((Rect) (windowinsetscompat)).right, ((Rect) (windowinsetscompat)).bottom);
			//   77  154:aload_1         
			//   78  155:aload_2         
			//   79  156:getfield        #47  <Field int Rect.left>
			//   80  159:aload_2         
			//   81  160:getfield        #53  <Field int Rect.top>
			//   82  163:aload_2         
			//   83  164:getfield        #59  <Field int Rect.right>
			//   84  167:aload_2         
			//   85  168:getfield        #65  <Field int Rect.bottom>
			//   86  171:invokevirtual   #85  <Method WindowInsetsCompat WindowInsetsCompat.replaceSystemWindowInsets(int, int, int, int)>
			//   87  174:areturn         
			}

			private final Rect mTempRect = new Rect();
			final ViewPager this$0;

			
			{
				this$0 = ViewPager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ViewPager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:aload_0         
			//    6   10:new             #23  <Class Rect>
			//    7   13:dup             
			//    8   14:invokespecial   #24  <Method void Rect()>
			//    9   17:putfield        #26  <Field Rect mTempRect>
			//   10   20:return          
			}
		}
);
	//   83  155:aload_0         
	//   84  156:new             #12  <Class ViewPager$4>
	//   85  159:dup             
	//   86  160:aload_0         
	//   87  161:invokespecial   #1003 <Method void ViewPager$4(ViewPager)>
	//   88  164:invokestatic    #1007 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
	//   89  167:return          
	}

	public boolean isFakeDragging()
	{
		return mFakeDragging;
	//    0    0:aload_0         
	//    1    1:getfield        #720 <Field boolean mFakeDragging>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1011 <Method void ViewGroup.onAttachedToWindow()>
		mFirstLayout = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #214 <Field boolean mFirstLayout>
	//    5    9:return          
	}

	protected void onDetachedFromWindow()
	{
		removeCallbacks(mEndScrollRunnable);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #221 <Field Runnable mEndScrollRunnable>
	//    3    5:invokevirtual   #1016 <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		if(mScroller != null && !mScroller.isFinished())
	//*   5    9:aload_0         
	//*   6   10:getfield        #271 <Field Scroller mScroller>
	//*   7   13:ifnull          33
	//*   8   16:aload_0         
	//*   9   17:getfield        #271 <Field Scroller mScroller>
	//*  10   20:invokevirtual   #277 <Method boolean Scroller.isFinished()>
	//*  11   23:ifne            33
			mScroller.abortAnimation();
	//   12   26:aload_0         
	//   13   27:getfield        #271 <Field Scroller mScroller>
	//   14   30:invokevirtual   #280 <Method void Scroller.abortAnimation()>
		super.onDetachedFromWindow();
	//   15   33:aload_0         
	//   16   34:invokespecial   #1018 <Method void ViewGroup.onDetachedFromWindow()>
	//   17   37:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1021 <Method void ViewGroup.onDraw(Canvas)>
		if(mPageMargin > 0 && mMarginDrawable != null && mItems.size() > 0 && mAdapter != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #244 <Field int mPageMargin>
	//*   5    9:ifle            311
	//*   6   12:aload_0         
	//*   7   13:getfield        #869 <Field Drawable mMarginDrawable>
	//*   8   16:ifnull          311
	//*   9   19:aload_0         
	//*  10   20:getfield        #188 <Field ArrayList mItems>
	//*  11   23:invokevirtual   #256 <Method int ArrayList.size()>
	//*  12   26:ifle            311
	//*  13   29:aload_0         
	//*  14   30:getfield        #233 <Field PagerAdapter mAdapter>
	//*  15   33:ifnull          311
		{
			int k = getScrollX();
	//   16   36:aload_0         
	//   17   37:invokevirtual   #283 <Method int getScrollX()>
	//   18   40:istore          8
			int l = getWidth();
	//   19   42:aload_0         
	//   20   43:invokevirtual   #464 <Method int getWidth()>
	//   21   46:istore          9
			float f2 = (float)mPageMargin / (float)l;
	//   22   48:aload_0         
	//   23   49:getfield        #244 <Field int mPageMargin>
	//   24   52:i2f             
	//   25   53:iload           9
	//   26   55:i2f             
	//   27   56:fdiv            
	//   28   57:fstore          4
			int j = 0;
	//   29   59:iconst_0        
	//   30   60:istore          7
			Object obj = ((Object) ((ItemInfo)mItems.get(0)));
	//   31   62:aload_0         
	//   32   63:getfield        #188 <Field ArrayList mItems>
	//   33   66:iconst_0        
	//   34   67:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   35   70:checkcast       #17  <Class ViewPager$ItemInfo>
	//   36   73:astore          12
			float f = ((ItemInfo) (obj)).offset;
	//   37   75:aload           12
	//   38   77:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   39   80:fstore_2        
			int i1 = mItems.size();
	//   40   81:aload_0         
	//   41   82:getfield        #188 <Field ArrayList mItems>
	//   42   85:invokevirtual   #256 <Method int ArrayList.size()>
	//   43   88:istore          10
			int i = ((ItemInfo) (obj)).position;
	//   44   90:aload           12
	//   45   92:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   46   95:istore          6
			for(int j1 = ((ItemInfo)mItems.get(i1 - 1)).position; i < j1; i++)
	//*  47   97:aload_0         
	//*  48   98:getfield        #188 <Field ArrayList mItems>
	//*  49  101:iload           10
	//*  50  103:iconst_1        
	//*  51  104:isub            
	//*  52  105:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//*  53  108:checkcast       #17  <Class ViewPager$ItemInfo>
	//*  54  111:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  55  114:istore          11
	//*  56  116:iload           6
	//*  57  118:iload           11
	//*  58  120:icmpge          311
			{
				for(; i > ((ItemInfo) (obj)).position && j < i1; obj = ((Object) ((ItemInfo)((ArrayList) (obj)).get(j))))
	//*  59  123:iload           6
	//*  60  125:aload           12
	//*  61  127:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  62  130:icmple          167
	//*  63  133:iload           7
	//*  64  135:iload           10
	//*  65  137:icmpge          167
				{
					obj = ((Object) (mItems));
	//   66  140:aload_0         
	//   67  141:getfield        #188 <Field ArrayList mItems>
	//   68  144:astore          12
					j++;
	//   69  146:iload           7
	//   70  148:iconst_1        
	//   71  149:iadd            
	//   72  150:istore          7
				}

	//   73  152:aload           12
	//   74  154:iload           7
	//   75  156:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   76  159:checkcast       #17  <Class ViewPager$ItemInfo>
	//   77  162:astore          12
	//*  78  164:goto            123
				float f1;
				if(i == ((ItemInfo) (obj)).position)
	//*  79  167:iload           6
	//*  80  169:aload           12
	//*  81  171:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  82  174:icmpne          211
				{
					f1 = (((ItemInfo) (obj)).offset + ((ItemInfo) (obj)).widthFactor) * (float)l;
	//   83  177:aload           12
	//   84  179:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   85  182:aload           12
	//   86  184:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//   87  187:fadd            
	//   88  188:iload           9
	//   89  190:i2f             
	//   90  191:fmul            
	//   91  192:fstore_3        
					f = ((ItemInfo) (obj)).offset + ((ItemInfo) (obj)).widthFactor + f2;
	//   92  193:aload           12
	//   93  195:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   94  198:aload           12
	//   95  200:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//   96  203:fadd            
	//   97  204:fload           4
	//   98  206:fadd            
	//   99  207:fstore_2        
				} else
	//* 100  208:goto            239
				{
					float f3 = mAdapter.getPageWidth(i);
	//  101  211:aload_0         
	//  102  212:getfield        #233 <Field PagerAdapter mAdapter>
	//  103  215:iload           6
	//  104  217:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//  105  220:fstore          5
					f1 = (f + f3) * (float)l;
	//  106  222:fload_2         
	//  107  223:fload           5
	//  108  225:fadd            
	//  109  226:iload           9
	//  110  228:i2f             
	//  111  229:fmul            
	//  112  230:fstore_3        
					f += f3 + f2;
	//  113  231:fload_2         
	//  114  232:fload           5
	//  115  234:fload           4
	//  116  236:fadd            
	//  117  237:fadd            
	//  118  238:fstore_2        
				}
				if((float)mPageMargin + f1 > (float)k)
	//* 119  239:aload_0         
	//* 120  240:getfield        #244 <Field int mPageMargin>
	//* 121  243:i2f             
	//* 122  244:fload_3         
	//* 123  245:fadd            
	//* 124  246:iload           8
	//* 125  248:i2f             
	//* 126  249:fcmpl           
	//* 127  250:ifle            290
				{
					mMarginDrawable.setBounds(Math.round(f1), mTopPageBounds, Math.round((float)mPageMargin + f1), mBottomPageBounds);
	//  128  253:aload_0         
	//  129  254:getfield        #869 <Field Drawable mMarginDrawable>
	//  130  257:fload_3         
	//  131  258:invokestatic    #1025 <Method int Math.round(float)>
	//  132  261:aload_0         
	//  133  262:getfield        #1027 <Field int mTopPageBounds>
	//  134  265:aload_0         
	//  135  266:getfield        #244 <Field int mPageMargin>
	//  136  269:i2f             
	//  137  270:fload_3         
	//  138  271:fadd            
	//  139  272:invokestatic    #1025 <Method int Math.round(float)>
	//  140  275:aload_0         
	//  141  276:getfield        #1029 <Field int mBottomPageBounds>
	//  142  279:invokevirtual   #1032 <Method void Drawable.setBounds(int, int, int, int)>
					mMarginDrawable.draw(canvas);
	//  143  282:aload_0         
	//  144  283:getfield        #869 <Field Drawable mMarginDrawable>
	//  145  286:aload_1         
	//  146  287:invokevirtual   #1033 <Method void Drawable.draw(Canvas)>
				}
				if(f1 > (float)(k + l))
	//* 147  290:fload_3         
	//* 148  291:iload           8
	//* 149  293:iload           9
	//* 150  295:iadd            
	//* 151  296:i2f             
	//* 152  297:fcmpl           
	//* 153  298:ifle            302
					return;
	//  154  301:return          
			}

	//  155  302:iload           6
	//  156  304:iconst_1        
	//  157  305:iadd            
	//  158  306:istore          6
		}
	//* 159  308:goto            116
	//  160  311:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getAction() & 0xff;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1036 <Method int MotionEvent.getAction()>
	//    2    4:sipush          255
	//    3    7:iand            
	//    4    8:istore          7
		if(i == 3 || i == 1)
	//*   5   10:iload           7
	//*   6   12:iconst_3        
	//*   7   13:icmpeq          22
	//*   8   16:iload           7
	//*   9   18:iconst_1        
	//*  10   19:icmpne          29
		{
			resetTouch();
	//   11   22:aload_0         
	//   12   23:invokespecial   #1038 <Method boolean resetTouch()>
	//   13   26:pop             
			return false;
	//   14   27:iconst_0        
	//   15   28:ireturn         
		}
		if(i != 0)
	//*  16   29:iload           7
	//*  17   31:ifeq            52
		{
			if(mIsBeingDragged)
	//*  18   34:aload_0         
	//*  19   35:getfield        #382 <Field boolean mIsBeingDragged>
	//*  20   38:ifeq            43
				return true;
	//   21   41:iconst_1        
	//   22   42:ireturn         
			if(mIsUnableToDrag)
	//*  23   43:aload_0         
	//*  24   44:getfield        #384 <Field boolean mIsUnableToDrag>
	//*  25   47:ifeq            52
				return false;
	//   26   50:iconst_0        
	//   27   51:ireturn         
		}
		switch(i)
	//*  28   52:iload           7
		{
	//*  29   54:lookupswitch    3: default 88
	//	               0: 332
	//	               2: 91
	//	               6: 469
	//*  30   88:goto            474
		case 2: // '\002'
			int j = mActivePointerId;
	//   31   91:aload_0         
	//   32   92:getfield        #212 <Field int mActivePointerId>
	//   33   95:istore          7
			if(j != -1)
	//*  34   97:iload           7
	//*  35   99:iconst_m1       
	//*  36  100:icmpne          106
	//*  37  103:goto            474
			{
				j = motionevent.findPointerIndex(j);
	//   38  106:aload_1         
	//   39  107:iload           7
	//   40  109:invokevirtual   #1041 <Method int MotionEvent.findPointerIndex(int)>
	//   41  112:istore          7
				float f2 = motionevent.getX(j);
	//   42  114:aload_1         
	//   43  115:iload           7
	//   44  117:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//   45  120:fstore_3        
				float f = f2 - mLastMotionX;
	//   46  121:fload_3         
	//   47  122:aload_0         
	//   48  123:getfield        #479 <Field float mLastMotionX>
	//   49  126:fsub            
	//   50  127:fstore_2        
				float f4 = Math.abs(f);
	//   51  128:fload_2         
	//   52  129:invokestatic    #501 <Method float Math.abs(float)>
	//   53  132:fstore          5
				float f3 = motionevent.getY(j);
	//   54  134:aload_1         
	//   55  135:iload           7
	//   56  137:invokevirtual   #1044 <Method float MotionEvent.getY(int)>
	//   57  140:fstore          4
				float f5 = Math.abs(f3 - mInitialMotionY);
	//   58  142:fload           4
	//   59  144:aload_0         
	//   60  145:getfield        #1046 <Field float mInitialMotionY>
	//   61  148:fsub            
	//   62  149:invokestatic    #501 <Method float Math.abs(float)>
	//   63  152:fstore          6
				if(f != 0.0F && !isGutterDrag(mLastMotionX, f) && canScroll(((View) (this)), false, (int)f, (int)f2, (int)f3))
	//*  64  154:fload_2         
	//*  65  155:fconst_0        
	//*  66  156:fcmpl           
	//*  67  157:ifeq            206
	//*  68  160:aload_0         
	//*  69  161:aload_0         
	//*  70  162:getfield        #479 <Field float mLastMotionX>
	//*  71  165:fload_2         
	//*  72  166:invokespecial   #1048 <Method boolean isGutterDrag(float, float)>
	//*  73  169:ifne            206
	//*  74  172:aload_0         
	//*  75  173:aload_0         
	//*  76  174:iconst_0        
	//*  77  175:fload_2         
	//*  78  176:f2i             
	//*  79  177:fload_3         
	//*  80  178:f2i             
	//*  81  179:fload           4
	//*  82  181:f2i             
	//*  83  182:invokevirtual   #752 <Method boolean canScroll(View, boolean, int, int, int)>
	//*  84  185:ifeq            206
				{
					mLastMotionX = f2;
	//   85  188:aload_0         
	//   86  189:fload_3         
	//   87  190:putfield        #479 <Field float mLastMotionX>
					mLastMotionY = f3;
	//   88  193:aload_0         
	//   89  194:fload           4
	//   90  196:putfield        #1050 <Field float mLastMotionY>
					mIsUnableToDrag = true;
	//   91  199:aload_0         
	//   92  200:iconst_1        
	//   93  201:putfield        #384 <Field boolean mIsUnableToDrag>
					return false;
	//   94  204:iconst_0        
	//   95  205:ireturn         
				}
				if(f4 > (float)mTouchSlop && 0.5F * f4 > f5)
	//*  96  206:fload           5
	//*  97  208:aload_0         
	//*  98  209:getfield        #978 <Field int mTouchSlop>
	//*  99  212:i2f             
	//* 100  213:fcmpl           
	//* 101  214:ifle            294
	//* 102  217:ldc2            #816 <Float 0.5F>
	//* 103  220:fload           5
	//* 104  222:fmul            
	//* 105  223:fload           6
	//* 106  225:fcmpl           
	//* 107  226:ifle            294
				{
					mIsBeingDragged = true;
	//  108  229:aload_0         
	//  109  230:iconst_1        
	//  110  231:putfield        #382 <Field boolean mIsBeingDragged>
					requestParentDisallowInterceptTouchEvent(true);
	//  111  234:aload_0         
	//  112  235:iconst_1        
	//  113  236:invokespecial   #1052 <Method void requestParentDisallowInterceptTouchEvent(boolean)>
					setScrollState(1);
	//  114  239:aload_0         
	//  115  240:iconst_1        
	//  116  241:invokevirtual   #723 <Method void setScrollState(int)>
					if(f > 0.0F)
	//* 117  244:fload_2         
	//* 118  245:fconst_0        
	//* 119  246:fcmpl           
	//* 120  247:ifle            264
						f = mInitialMotionX + (float)mTouchSlop;
	//  121  250:aload_0         
	//  122  251:getfield        #725 <Field float mInitialMotionX>
	//  123  254:aload_0         
	//  124  255:getfield        #978 <Field int mTouchSlop>
	//  125  258:i2f             
	//  126  259:fadd            
	//  127  260:fstore_2        
					else
	//* 128  261:goto            275
						f = mInitialMotionX - (float)mTouchSlop;
	//  129  264:aload_0         
	//  130  265:getfield        #725 <Field float mInitialMotionX>
	//  131  268:aload_0         
	//  132  269:getfield        #978 <Field int mTouchSlop>
	//  133  272:i2f             
	//  134  273:fsub            
	//  135  274:fstore_2        
					mLastMotionX = f;
	//  136  275:aload_0         
	//  137  276:fload_2         
	//  138  277:putfield        #479 <Field float mLastMotionX>
					mLastMotionY = f3;
	//  139  280:aload_0         
	//  140  281:fload           4
	//  141  283:putfield        #1050 <Field float mLastMotionY>
					setScrollingCacheEnabled(true);
	//  142  286:aload_0         
	//  143  287:iconst_1        
	//  144  288:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
				} else
	//* 145  291:goto            310
				if(f5 > (float)mTouchSlop)
	//* 146  294:fload           6
	//* 147  296:aload_0         
	//* 148  297:getfield        #978 <Field int mTouchSlop>
	//* 149  300:i2f             
	//* 150  301:fcmpl           
	//* 151  302:ifle            310
					mIsUnableToDrag = true;
	//  152  305:aload_0         
	//  153  306:iconst_1        
	//  154  307:putfield        #384 <Field boolean mIsUnableToDrag>
				if(mIsBeingDragged && performDrag(f2))
	//* 155  310:aload_0         
	//* 156  311:getfield        #382 <Field boolean mIsBeingDragged>
	//* 157  314:ifeq            474
	//* 158  317:aload_0         
	//* 159  318:fload_3         
	//* 160  319:invokespecial   #1054 <Method boolean performDrag(float)>
	//* 161  322:ifeq            474
					ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  162  325:aload_0         
	//  163  326:invokestatic    #768 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			}
			break;

	//* 164  329:goto            474
		case 0: // '\0'
			float f1 = motionevent.getX();
	//  165  332:aload_1         
	//  166  333:invokevirtual   #1057 <Method float MotionEvent.getX()>
	//  167  336:fstore_2        
			mInitialMotionX = f1;
	//  168  337:aload_0         
	//  169  338:fload_2         
	//  170  339:putfield        #725 <Field float mInitialMotionX>
			mLastMotionX = f1;
	//  171  342:aload_0         
	//  172  343:fload_2         
	//  173  344:putfield        #479 <Field float mLastMotionX>
			f1 = motionevent.getY();
	//  174  347:aload_1         
	//  175  348:invokevirtual   #1059 <Method float MotionEvent.getY()>
	//  176  351:fstore_2        
			mInitialMotionY = f1;
	//  177  352:aload_0         
	//  178  353:fload_2         
	//  179  354:putfield        #1046 <Field float mInitialMotionY>
			mLastMotionY = f1;
	//  180  357:aload_0         
	//  181  358:fload_2         
	//  182  359:putfield        #1050 <Field float mLastMotionY>
			mActivePointerId = motionevent.getPointerId(0);
	//  183  362:aload_0         
	//  184  363:aload_1         
	//  185  364:iconst_0        
	//  186  365:invokevirtual   #474 <Method int MotionEvent.getPointerId(int)>
	//  187  368:putfield        #212 <Field int mActivePointerId>
			mIsUnableToDrag = false;
	//  188  371:aload_0         
	//  189  372:iconst_0        
	//  190  373:putfield        #384 <Field boolean mIsUnableToDrag>
			mIsScrollStarted = true;
	//  191  376:aload_0         
	//  192  377:iconst_1        
	//  193  378:putfield        #761 <Field boolean mIsScrollStarted>
			mScroller.computeScrollOffset();
	//  194  381:aload_0         
	//  195  382:getfield        #271 <Field Scroller mScroller>
	//  196  385:invokevirtual   #764 <Method boolean Scroller.computeScrollOffset()>
	//  197  388:pop             
			if(mScrollState == 2 && Math.abs(mScroller.getFinalX() - mScroller.getCurrX()) > mCloseEnough)
	//* 198  389:aload_0         
	//* 199  390:getfield        #223 <Field int mScrollState>
	//* 200  393:iconst_2        
	//* 201  394:icmpne          456
	//* 202  397:aload_0         
	//* 203  398:getfield        #271 <Field Scroller mScroller>
	//* 204  401:invokevirtual   #1062 <Method int Scroller.getFinalX()>
	//* 205  404:aload_0         
	//* 206  405:getfield        #271 <Field Scroller mScroller>
	//* 207  408:invokevirtual   #289 <Method int Scroller.getCurrX()>
	//* 208  411:isub            
	//* 209  412:invokestatic    #324 <Method int Math.abs(int)>
	//* 210  415:aload_0         
	//* 211  416:getfield        #986 <Field int mCloseEnough>
	//* 212  419:icmple          456
			{
				mScroller.abortAnimation();
	//  213  422:aload_0         
	//  214  423:getfield        #271 <Field Scroller mScroller>
	//  215  426:invokevirtual   #280 <Method void Scroller.abortAnimation()>
				mPopulatePending = false;
	//  216  429:aload_0         
	//  217  430:iconst_0        
	//  218  431:putfield        #302 <Field boolean mPopulatePending>
				populate();
	//  219  434:aload_0         
	//  220  435:invokevirtual   #1065 <Method void populate()>
				mIsBeingDragged = true;
	//  221  438:aload_0         
	//  222  439:iconst_1        
	//  223  440:putfield        #382 <Field boolean mIsBeingDragged>
				requestParentDisallowInterceptTouchEvent(true);
	//  224  443:aload_0         
	//  225  444:iconst_1        
	//  226  445:invokespecial   #1052 <Method void requestParentDisallowInterceptTouchEvent(boolean)>
				setScrollState(1);
	//  227  448:aload_0         
	//  228  449:iconst_1        
	//  229  450:invokevirtual   #723 <Method void setScrollState(int)>
			} else
	//* 230  453:goto            474
			{
				completeScroll(false);
	//  231  456:aload_0         
	//  232  457:iconst_0        
	//  233  458:invokespecial   #528 <Method void completeScroll(boolean)>
				mIsBeingDragged = false;
	//  234  461:aload_0         
	//  235  462:iconst_0        
	//  236  463:putfield        #382 <Field boolean mIsBeingDragged>
			}
			break;

	//* 237  466:goto            474
		case 6: // '\006'
			onSecondaryPointerUp(motionevent);
	//  238  469:aload_0         
	//  239  470:aload_1         
	//  240  471:invokespecial   #1067 <Method void onSecondaryPointerUp(MotionEvent)>
			break;
		}
		if(mVelocityTracker == null)
	//* 241  474:aload_0         
	//* 242  475:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//* 243  478:ifnonnull       488
			mVelocityTracker = VelocityTracker.obtain();
	//  244  481:aload_0         
	//  245  482:invokestatic    #729 <Method VelocityTracker VelocityTracker.obtain()>
	//  246  485:putfield        #386 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//  247  488:aload_0         
	//  248  489:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//  249  492:aload_1         
	//  250  493:invokevirtual   #741 <Method void VelocityTracker.addMovement(MotionEvent)>
		return mIsBeingDragged;
	//  251  496:aload_0         
	//  252  497:getfield        #382 <Field boolean mIsBeingDragged>
	//  253  500:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		int j3 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #367 <Method int getChildCount()>
	//    2    4:istore          13
		int l3 = k - i;
	//    3    6:iload           4
	//    4    8:iload_2         
	//    5    9:isub            
	//    6   10:istore          15
		int k3 = l - j;
	//    7   12:iload           5
	//    8   14:iload_3         
	//    9   15:isub            
	//   10   16:istore          14
		j = getPaddingLeft();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #436 <Method int getPaddingLeft()>
	//   13   22:istore_3        
		i = getPaddingTop();
	//   14   23:aload_0         
	//   15   24:invokevirtual   #840 <Method int getPaddingTop()>
	//   16   27:istore_2        
		int k1 = getPaddingRight();
	//   17   28:aload_0         
	//   18   29:invokevirtual   #439 <Method int getPaddingRight()>
	//   19   32:istore          7
		l = getPaddingBottom();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #843 <Method int getPaddingBottom()>
	//   22   38:istore          5
		int i4 = getScrollX();
	//   23   40:aload_0         
	//   24   41:invokevirtual   #283 <Method int getScrollX()>
	//   25   44:istore          16
		int i2 = 0;
	//   26   46:iconst_0        
	//   27   47:istore          8
		for(int j2 = 0; j2 < j3;)
	//*  28   49:iconst_0        
	//*  29   50:istore          9
	//*  30   52:iload           9
	//*  31   54:iload           13
	//*  32   56:icmpge          428
		{
			View view = getChildAt(j2);
	//   33   59:aload_0         
	//   34   60:iload           9
	//   35   62:invokevirtual   #373 <Method View getChildAt(int)>
	//   36   65:astore          17
			int i1 = j;
	//   37   67:iload_3         
	//   38   68:istore          6
			int i3 = i;
	//   39   70:iload_2         
	//   40   71:istore          12
			int l2 = k1;
	//   41   73:iload           7
	//   42   75:istore          11
			int k2 = l;
	//   43   77:iload           5
	//   44   79:istore          10
			k = i2;
	//   45   81:iload           8
	//   46   83:istore          4
			if(view.getVisibility() != 8)
	//*  47   85:aload           17
	//*  48   87:invokevirtual   #590 <Method int View.getVisibility()>
	//*  49   90:bipush          8
	//*  50   92:icmpeq          401
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   51   95:aload           17
	//   52   97:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   53  100:checkcast       #20  <Class ViewPager$LayoutParams>
	//   54  103:astore          18
				i1 = j;
	//   55  105:iload_3         
	//   56  106:istore          6
				i3 = i;
	//   57  108:iload_2         
	//   58  109:istore          12
				l2 = k1;
	//   59  111:iload           7
	//   60  113:istore          11
				k2 = l;
	//   61  115:iload           5
	//   62  117:istore          10
				k = i2;
	//   63  119:iload           8
	//   64  121:istore          4
				if(layoutparams.isDecor)
	//*  65  123:aload           18
	//*  66  125:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//*  67  128:ifeq            401
				{
					k = layoutparams.gravity;
	//   68  131:aload           18
	//   69  133:getfield        #1072 <Field int ViewPager$LayoutParams.gravity>
	//   70  136:istore          4
					k2 = layoutparams.gravity;
	//   71  138:aload           18
	//   72  140:getfield        #1072 <Field int ViewPager$LayoutParams.gravity>
	//   73  143:istore          10
					switch(k & 7)
	//*  74  145:iload           4
	//*  75  147:bipush          7
	//*  76  149:iand            
					{
	//*  77  150:tableswitch     1 5: default 184
	//	               1 208
	//	               2 184
	//	               3 193
	//	               4 184
	//	               5 230
					case 2: // '\002'
					case 4: // '\004'
					default:
						k = j;
	//   78  184:iload_3         
	//   79  185:istore          4
						i1 = j;
	//   80  187:iload_3         
	//   81  188:istore          6
						break;

	//*  82  190:goto            256
					case 3: // '\003'
						k = j;
	//   83  193:iload_3         
	//   84  194:istore          4
						i1 = j + view.getMeasuredWidth();
	//   85  196:iload_3         
	//   86  197:aload           17
	//   87  199:invokevirtual   #1073 <Method int View.getMeasuredWidth()>
	//   88  202:iadd            
	//   89  203:istore          6
						break;

	//*  90  205:goto            256
					case 1: // '\001'
						k = Math.max((l3 - view.getMeasuredWidth()) / 2, j);
	//   91  208:iload           15
	//   92  210:aload           17
	//   93  212:invokevirtual   #1073 <Method int View.getMeasuredWidth()>
	//   94  215:isub            
	//   95  216:iconst_2        
	//   96  217:idiv            
	//   97  218:iload_3         
	//   98  219:invokestatic    #339 <Method int Math.max(int, int)>
	//   99  222:istore          4
						i1 = j;
	//  100  224:iload_3         
	//  101  225:istore          6
						break;

	//* 102  227:goto            256
					case 5: // '\005'
						k = l3 - k1 - view.getMeasuredWidth();
	//  103  230:iload           15
	//  104  232:iload           7
	//  105  234:isub            
	//  106  235:aload           17
	//  107  237:invokevirtual   #1073 <Method int View.getMeasuredWidth()>
	//  108  240:isub            
	//  109  241:istore          4
						k1 += view.getMeasuredWidth();
	//  110  243:iload           7
	//  111  245:aload           17
	//  112  247:invokevirtual   #1073 <Method int View.getMeasuredWidth()>
	//  113  250:iadd            
	//  114  251:istore          7
						i1 = j;
	//  115  253:iload_3         
	//  116  254:istore          6
						break;
					}
					switch(k2 & 0x70)
	//* 117  256:iload           10
	//* 118  258:bipush          112
	//* 119  260:iand            
					{
	//* 120  261:lookupswitch    3: default 296
	//	               16: 314
	//	               48: 301
	//	               80: 332
					default:
						j = i;
	//  121  296:iload_2         
	//  122  297:istore_3        
						break;

	//* 123  298:goto            354
					case 48: // '0'
						j = i;
	//  124  301:iload_2         
	//  125  302:istore_3        
						i += view.getMeasuredHeight();
	//  126  303:iload_2         
	//  127  304:aload           17
	//  128  306:invokevirtual   #1076 <Method int View.getMeasuredHeight()>
	//  129  309:iadd            
	//  130  310:istore_2        
						break;

	//* 131  311:goto            354
					case 16: // '\020'
						j = Math.max((k3 - view.getMeasuredHeight()) / 2, i);
	//  132  314:iload           14
	//  133  316:aload           17
	//  134  318:invokevirtual   #1076 <Method int View.getMeasuredHeight()>
	//  135  321:isub            
	//  136  322:iconst_2        
	//  137  323:idiv            
	//  138  324:iload_2         
	//  139  325:invokestatic    #339 <Method int Math.max(int, int)>
	//  140  328:istore_3        
						break;

	//* 141  329:goto            354
					case 80: // 'P'
						j = k3 - l - view.getMeasuredHeight();
	//  142  332:iload           14
	//  143  334:iload           5
	//  144  336:isub            
	//  145  337:aload           17
	//  146  339:invokevirtual   #1076 <Method int View.getMeasuredHeight()>
	//  147  342:isub            
	//  148  343:istore_3        
						l += view.getMeasuredHeight();
	//  149  344:iload           5
	//  150  346:aload           17
	//  151  348:invokevirtual   #1076 <Method int View.getMeasuredHeight()>
	//  152  351:iadd            
	//  153  352:istore          5
						break;
					}
					k += i4;
	//  154  354:iload           4
	//  155  356:iload           16
	//  156  358:iadd            
	//  157  359:istore          4
					view.layout(k, j, view.getMeasuredWidth() + k, view.getMeasuredHeight() + j);
	//  158  361:aload           17
	//  159  363:iload           4
	//  160  365:iload_3         
	//  161  366:aload           17
	//  162  368:invokevirtual   #1073 <Method int View.getMeasuredWidth()>
	//  163  371:iload           4
	//  164  373:iadd            
	//  165  374:aload           17
	//  166  376:invokevirtual   #1076 <Method int View.getMeasuredHeight()>
	//  167  379:iload_3         
	//  168  380:iadd            
	//  169  381:invokevirtual   #1079 <Method void View.layout(int, int, int, int)>
					k = i2 + 1;
	//  170  384:iload           8
	//  171  386:iconst_1        
	//  172  387:iadd            
	//  173  388:istore          4
					k2 = l;
	//  174  390:iload           5
	//  175  392:istore          10
					l2 = k1;
	//  176  394:iload           7
	//  177  396:istore          11
					i3 = i;
	//  178  398:iload_2         
	//  179  399:istore          12
				}
			}
			j2++;
	//  180  401:iload           9
	//  181  403:iconst_1        
	//  182  404:iadd            
	//  183  405:istore          9
			j = i1;
	//  184  407:iload           6
	//  185  409:istore_3        
			i = i3;
	//  186  410:iload           12
	//  187  412:istore_2        
			k1 = l2;
	//  188  413:iload           11
	//  189  415:istore          7
			l = k2;
	//  190  417:iload           10
	//  191  419:istore          5
			i2 = k;
	//  192  421:iload           4
	//  193  423:istore          8
		}

	//* 194  425:goto            52
		int j1 = l3 - j - k1;
	//  195  428:iload           15
	//  196  430:iload_3         
	//  197  431:isub            
	//  198  432:iload           7
	//  199  434:isub            
	//  200  435:istore          6
		for(k = 0; k < j3; k++)
	//* 201  437:iconst_0        
	//* 202  438:istore          4
	//* 203  440:iload           4
	//* 204  442:iload           13
	//* 205  444:icmpge          590
		{
			View view1 = getChildAt(k);
	//  206  447:aload_0         
	//  207  448:iload           4
	//  208  450:invokevirtual   #373 <Method View getChildAt(int)>
	//  209  453:astore          17
			if(view1.getVisibility() == 8)
				continue;
	//  210  455:aload           17
	//  211  457:invokevirtual   #590 <Method int View.getVisibility()>
	//  212  460:bipush          8
	//  213  462:icmpeq          581
			LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  214  465:aload           17
	//  215  467:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  216  470:checkcast       #20  <Class ViewPager$LayoutParams>
	//  217  473:astore          18
			if(layoutparams1.isDecor)
				continue;
	//  218  475:aload           18
	//  219  477:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//  220  480:ifne            581
			ItemInfo iteminfo = infoForChild(view1);
	//  221  483:aload_0         
	//  222  484:aload           17
	//  223  486:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//  224  489:astore          19
			if(iteminfo == null)
				continue;
	//  225  491:aload           19
	//  226  493:ifnull          581
			int l1 = j + (int)((float)j1 * iteminfo.offset);
	//  227  496:iload_3         
	//  228  497:iload           6
	//  229  499:i2f             
	//  230  500:aload           19
	//  231  502:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  232  505:fmul            
	//  233  506:f2i             
	//  234  507:iadd            
	//  235  508:istore          7
			if(layoutparams1.needsMeasure)
	//* 236  510:aload           18
	//* 237  512:getfield        #652 <Field boolean ViewPager$LayoutParams.needsMeasure>
	//* 238  515:ifeq            558
			{
				layoutparams1.needsMeasure = false;
	//  239  518:aload           18
	//  240  520:iconst_0        
	//  241  521:putfield        #652 <Field boolean ViewPager$LayoutParams.needsMeasure>
				view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)((float)j1 * layoutparams1.widthFactor), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k3 - i - l, 0x40000000));
	//  242  524:aload           17
	//  243  526:iload           6
	//  244  528:i2f             
	//  245  529:aload           18
	//  246  531:getfield        #790 <Field float ViewPager$LayoutParams.widthFactor>
	//  247  534:fmul            
	//  248  535:f2i             
	//  249  536:ldc2            #1080 <Int 0x40000000>
	//  250  539:invokestatic    #1085 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  251  542:iload           14
	//  252  544:iload_2         
	//  253  545:isub            
	//  254  546:iload           5
	//  255  548:isub            
	//  256  549:ldc2            #1080 <Int 0x40000000>
	//  257  552:invokestatic    #1085 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  258  555:invokevirtual   #1088 <Method void View.measure(int, int)>
			}
			view1.layout(l1, i, view1.getMeasuredWidth() + l1, view1.getMeasuredHeight() + i);
	//  259  558:aload           17
	//  260  560:iload           7
	//  261  562:iload_2         
	//  262  563:aload           17
	//  263  565:invokevirtual   #1073 <Method int View.getMeasuredWidth()>
	//  264  568:iload           7
	//  265  570:iadd            
	//  266  571:aload           17
	//  267  573:invokevirtual   #1076 <Method int View.getMeasuredHeight()>
	//  268  576:iload_2         
	//  269  577:iadd            
	//  270  578:invokevirtual   #1079 <Method void View.layout(int, int, int, int)>
		}

	//  271  581:iload           4
	//  272  583:iconst_1        
	//  273  584:iadd            
	//  274  585:istore          4
	//* 275  587:goto            440
		mTopPageBounds = i;
	//  276  590:aload_0         
	//  277  591:iload_2         
	//  278  592:putfield        #1027 <Field int mTopPageBounds>
		mBottomPageBounds = k3 - l;
	//  279  595:aload_0         
	//  280  596:iload           14
	//  281  598:iload           5
	//  282  600:isub            
	//  283  601:putfield        #1029 <Field int mBottomPageBounds>
		mDecorChildCount = i2;
	//  284  604:aload_0         
	//  285  605:iload           8
	//  286  607:putfield        #1090 <Field int mDecorChildCount>
		if(mFirstLayout)
	//* 287  610:aload_0         
	//* 288  611:getfield        #214 <Field boolean mFirstLayout>
	//* 289  614:ifeq            628
			scrollToItem(mCurItem, false, 0, false);
	//  290  617:aload_0         
	//  291  618:aload_0         
	//  292  619:getfield        #330 <Field int mCurItem>
	//  293  622:iconst_0        
	//  294  623:iconst_0        
	//  295  624:iconst_0        
	//  296  625:invokespecial   #1092 <Method void scrollToItem(int, boolean, int, boolean)>
		mFirstLayout = false;
	//  297  628:aload_0         
	//  298  629:iconst_0        
	//  299  630:putfield        #214 <Field boolean mFirstLayout>
	//  300  633:return          
	}

	protected void onMeasure(int i, int j)
	{
		setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, j));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iload_1         
	//    3    3:invokestatic    #1096 <Method int getDefaultSize(int, int)>
	//    4    6:iconst_0        
	//    5    7:iload_2         
	//    6    8:invokestatic    #1096 <Method int getDefaultSize(int, int)>
	//    7   11:invokevirtual   #1099 <Method void setMeasuredDimension(int, int)>
		i = getMeasuredWidth();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #433 <Method int getMeasuredWidth()>
	//   10   18:istore_1        
		mGutterSize = Math.min(i / 10, mDefaultGutterSize);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:bipush          10
	//   14   23:idiv            
	//   15   24:aload_0         
	//   16   25:getfield        #989 <Field int mDefaultGutterSize>
	//   17   28:invokestatic    #336 <Method int Math.min(int, int)>
	//   18   31:putfield        #461 <Field int mGutterSize>
		i = i - getPaddingLeft() - getPaddingRight();
	//   19   34:iload_1         
	//   20   35:aload_0         
	//   21   36:invokevirtual   #436 <Method int getPaddingLeft()>
	//   22   39:isub            
	//   23   40:aload_0         
	//   24   41:invokevirtual   #439 <Method int getPaddingRight()>
	//   25   44:isub            
	//   26   45:istore_1        
		j = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
	//   27   46:aload_0         
	//   28   47:invokevirtual   #1100 <Method int getMeasuredHeight()>
	//   29   50:aload_0         
	//   30   51:invokevirtual   #840 <Method int getPaddingTop()>
	//   31   54:isub            
	//   32   55:aload_0         
	//   33   56:invokevirtual   #843 <Method int getPaddingBottom()>
	//   34   59:isub            
	//   35   60:istore_2        
		int i3 = getChildCount();
	//   36   61:aload_0         
	//   37   62:invokevirtual   #367 <Method int getChildCount()>
	//   38   65:istore          12
		for(int j1 = 0; j1 < i3;)
	//*  39   67:iconst_0        
	//*  40   68:istore          5
	//*  41   70:iload           5
	//*  42   72:iload           12
	//*  43   74:icmpge          406
		{
			View view = getChildAt(j1);
	//   44   77:aload_0         
	//   45   78:iload           5
	//   46   80:invokevirtual   #373 <Method View getChildAt(int)>
	//   47   83:astore          13
			int k = i;
	//   48   85:iload_1         
	//   49   86:istore_3        
			int i1 = j;
	//   50   87:iload_2         
	//   51   88:istore          4
			if(view.getVisibility() != 8)
	//*  52   90:aload           13
	//*  53   92:invokevirtual   #590 <Method int View.getVisibility()>
	//*  54   95:bipush          8
	//*  55   97:icmpeq          392
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   56  100:aload           13
	//   57  102:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   58  105:checkcast       #20  <Class ViewPager$LayoutParams>
	//   59  108:astore          14
				k = i;
	//   60  110:iload_1         
	//   61  111:istore_3        
				i1 = j;
	//   62  112:iload_2         
	//   63  113:istore          4
				if(layoutparams != null)
	//*  64  115:aload           14
	//*  65  117:ifnull          392
				{
					k = i;
	//   66  120:iload_1         
	//   67  121:istore_3        
					i1 = j;
	//   68  122:iload_2         
	//   69  123:istore          4
					if(layoutparams.isDecor)
	//*  70  125:aload           14
	//*  71  127:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//*  72  130:ifeq            392
					{
						i1 = layoutparams.gravity & 7;
	//   73  133:aload           14
	//   74  135:getfield        #1072 <Field int ViewPager$LayoutParams.gravity>
	//   75  138:bipush          7
	//   76  140:iand            
	//   77  141:istore          4
						int k1 = layoutparams.gravity & 0x70;
	//   78  143:aload           14
	//   79  145:getfield        #1072 <Field int ViewPager$LayoutParams.gravity>
	//   80  148:bipush          112
	//   81  150:iand            
	//   82  151:istore          6
						int l1 = 0x80000000;
	//   83  153:ldc2            #1101 <Int 0x80000000>
	//   84  156:istore          8
						k = 0x80000000;
	//   85  158:ldc2            #1101 <Int 0x80000000>
	//   86  161:istore_3        
						boolean flag;
						if(k1 == 48 || k1 == 80)
	//*  87  162:iload           6
	//*  88  164:bipush          48
	//*  89  166:icmpeq          176
	//*  90  169:iload           6
	//*  91  171:bipush          80
	//*  92  173:icmpne          182
							flag = true;
	//   93  176:iconst_1        
	//   94  177:istore          6
						else
	//*  95  179:goto            185
							flag = false;
	//   96  182:iconst_0        
	//   97  183:istore          6
						boolean flag1;
						if(i1 == 3 || i1 == 5)
	//*  98  185:iload           4
	//*  99  187:iconst_3        
	//* 100  188:icmpeq          197
	//* 101  191:iload           4
	//* 102  193:iconst_5        
	//* 103  194:icmpne          203
							flag1 = true;
	//  104  197:iconst_1        
	//  105  198:istore          7
						else
	//* 106  200:goto            206
							flag1 = false;
	//  107  203:iconst_0        
	//  108  204:istore          7
						if(flag)
	//* 109  206:iload           6
	//* 110  208:ifeq            219
						{
							i1 = 0x40000000;
	//  111  211:ldc2            #1080 <Int 0x40000000>
	//  112  214:istore          4
						} else
	//* 113  216:goto            236
						{
							i1 = l1;
	//  114  219:iload           8
	//  115  221:istore          4
							if(flag1)
	//* 116  223:iload           7
	//* 117  225:ifeq            236
							{
								k = 0x40000000;
	//  118  228:ldc2            #1080 <Int 0x40000000>
	//  119  231:istore_3        
								i1 = l1;
	//  120  232:iload           8
	//  121  234:istore          4
							}
						}
						int j2 = i;
	//  122  236:iload_1         
	//  123  237:istore          10
						l1 = j;
	//  124  239:iload_2         
	//  125  240:istore          8
						int i2 = j2;
	//  126  242:iload           10
	//  127  244:istore          9
						if(layoutparams.width != -2)
	//* 128  246:aload           14
	//* 129  248:getfield        #1104 <Field int ViewPager$LayoutParams.width>
	//* 130  251:bipush          -2
	//* 131  253:icmpeq          289
						{
							int k2 = 0x40000000;
	//  132  256:ldc2            #1080 <Int 0x40000000>
	//  133  259:istore          11
							i1 = k2;
	//  134  261:iload           11
	//  135  263:istore          4
							i2 = j2;
	//  136  265:iload           10
	//  137  267:istore          9
							if(layoutparams.width != -1)
	//* 138  269:aload           14
	//* 139  271:getfield        #1104 <Field int ViewPager$LayoutParams.width>
	//* 140  274:iconst_m1       
	//* 141  275:icmpeq          289
							{
								i2 = layoutparams.width;
	//  142  278:aload           14
	//  143  280:getfield        #1104 <Field int ViewPager$LayoutParams.width>
	//  144  283:istore          9
								i1 = k2;
	//  145  285:iload           11
	//  146  287:istore          4
							}
						}
						j2 = l1;
	//  147  289:iload           8
	//  148  291:istore          10
						if(layoutparams.height != -2)
	//* 149  293:aload           14
	//* 150  295:getfield        #1107 <Field int ViewPager$LayoutParams.height>
	//* 151  298:bipush          -2
	//* 152  300:icmpeq          334
						{
							int l2 = 0x40000000;
	//  153  303:ldc2            #1080 <Int 0x40000000>
	//  154  306:istore          11
							k = l2;
	//  155  308:iload           11
	//  156  310:istore_3        
							j2 = l1;
	//  157  311:iload           8
	//  158  313:istore          10
							if(layoutparams.height != -1)
	//* 159  315:aload           14
	//* 160  317:getfield        #1107 <Field int ViewPager$LayoutParams.height>
	//* 161  320:iconst_m1       
	//* 162  321:icmpeq          334
							{
								j2 = layoutparams.height;
	//  163  324:aload           14
	//  164  326:getfield        #1107 <Field int ViewPager$LayoutParams.height>
	//  165  329:istore          10
								k = l2;
	//  166  331:iload           11
	//  167  333:istore_3        
							}
						}
						view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2, i1), android.view.View.MeasureSpec.makeMeasureSpec(j2, k));
	//  168  334:aload           13
	//  169  336:iload           9
	//  170  338:iload           4
	//  171  340:invokestatic    #1085 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  172  343:iload           10
	//  173  345:iload_3         
	//  174  346:invokestatic    #1085 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  175  349:invokevirtual   #1088 <Method void View.measure(int, int)>
						if(flag)
	//* 176  352:iload           6
	//* 177  354:ifeq            371
						{
							i1 = j - view.getMeasuredHeight();
	//  178  357:iload_2         
	//  179  358:aload           13
	//  180  360:invokevirtual   #1076 <Method int View.getMeasuredHeight()>
	//  181  363:isub            
	//  182  364:istore          4
							k = i;
	//  183  366:iload_1         
	//  184  367:istore_3        
						} else
	//* 185  368:goto            392
						{
							k = i;
	//  186  371:iload_1         
	//  187  372:istore_3        
							i1 = j;
	//  188  373:iload_2         
	//  189  374:istore          4
							if(flag1)
	//* 190  376:iload           7
	//* 191  378:ifeq            392
							{
								k = i - view.getMeasuredWidth();
	//  192  381:iload_1         
	//  193  382:aload           13
	//  194  384:invokevirtual   #1073 <Method int View.getMeasuredWidth()>
	//  195  387:isub            
	//  196  388:istore_3        
								i1 = j;
	//  197  389:iload_2         
	//  198  390:istore          4
							}
						}
					}
				}
			}
			j1++;
	//  199  392:iload           5
	//  200  394:iconst_1        
	//  201  395:iadd            
	//  202  396:istore          5
			i = k;
	//  203  398:iload_3         
	//  204  399:istore_1        
			j = i1;
	//  205  400:iload           4
	//  206  402:istore_2        
		}

	//* 207  403:goto            70
		mChildWidthMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
	//  208  406:aload_0         
	//  209  407:iload_1         
	//  210  408:ldc2            #1080 <Int 0x40000000>
	//  211  411:invokestatic    #1085 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  212  414:putfield        #1109 <Field int mChildWidthMeasureSpec>
		mChildHeightMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
	//  213  417:aload_0         
	//  214  418:iload_2         
	//  215  419:ldc2            #1080 <Int 0x40000000>
	//  216  422:invokestatic    #1085 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  217  425:putfield        #1111 <Field int mChildHeightMeasureSpec>
		mInLayout = true;
	//  218  428:aload_0         
	//  219  429:iconst_1        
	//  220  430:putfield        #647 <Field boolean mInLayout>
		populate();
	//  221  433:aload_0         
	//  222  434:invokevirtual   #1065 <Method void populate()>
		mInLayout = false;
	//  223  437:aload_0         
	//  224  438:iconst_0        
	//  225  439:putfield        #647 <Field boolean mInLayout>
		int l = getChildCount();
	//  226  442:aload_0         
	//  227  443:invokevirtual   #367 <Method int getChildCount()>
	//  228  446:istore_3        
		for(j = 0; j < l; j++)
	//* 229  447:iconst_0        
	//* 230  448:istore_2        
	//* 231  449:iload_2         
	//* 232  450:iload_3         
	//* 233  451:icmpge          525
		{
			View view1 = getChildAt(j);
	//  234  454:aload_0         
	//  235  455:iload_2         
	//  236  456:invokevirtual   #373 <Method View getChildAt(int)>
	//  237  459:astore          13
			if(view1.getVisibility() == 8)
				continue;
	//  238  461:aload           13
	//  239  463:invokevirtual   #590 <Method int View.getVisibility()>
	//  240  466:bipush          8
	//  241  468:icmpeq          518
			LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  242  471:aload           13
	//  243  473:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  244  476:checkcast       #20  <Class ViewPager$LayoutParams>
	//  245  479:astore          14
			if(layoutparams1 == null || !layoutparams1.isDecor)
	//* 246  481:aload           14
	//* 247  483:ifnull          494
	//* 248  486:aload           14
	//* 249  488:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//* 250  491:ifne            518
				view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)((float)i * layoutparams1.widthFactor), 0x40000000), mChildHeightMeasureSpec);
	//  251  494:aload           13
	//  252  496:iload_1         
	//  253  497:i2f             
	//  254  498:aload           14
	//  255  500:getfield        #790 <Field float ViewPager$LayoutParams.widthFactor>
	//  256  503:fmul            
	//  257  504:f2i             
	//  258  505:ldc2            #1080 <Int 0x40000000>
	//  259  508:invokestatic    #1085 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  260  511:aload_0         
	//  261  512:getfield        #1111 <Field int mChildHeightMeasureSpec>
	//  262  515:invokevirtual   #1088 <Method void View.measure(int, int)>
		}

	//  263  518:iload_2         
	//  264  519:iconst_1        
	//  265  520:iadd            
	//  266  521:istore_2        
	//* 267  522:goto            449
	//  268  525:return          
	}

	protected void onPageScrolled(int i, float f, int j)
	{
		if(mDecorChildCount > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1090 <Field int mDecorChildCount>
	//*   2    4:ifle            277
		{
			int i2 = getScrollX();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #283 <Method int getScrollX()>
	//    5   11:istore          9
			int k = getPaddingLeft();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #436 <Method int getPaddingLeft()>
	//    8   17:istore          4
			int i1 = getPaddingRight();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #439 <Method int getPaddingRight()>
	//   11   23:istore          5
			int j2 = getWidth();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #464 <Method int getWidth()>
	//   14   29:istore          10
			int k2 = getChildCount();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #367 <Method int getChildCount()>
	//   17   35:istore          11
			for(int k1 = 0; k1 < k2;)
	//*  18   37:iconst_0        
	//*  19   38:istore          7
	//*  20   40:iload           7
	//*  21   42:iload           11
	//*  22   44:icmpge          277
			{
				View view = getChildAt(k1);
	//   23   47:aload_0         
	//   24   48:iload           7
	//   25   50:invokevirtual   #373 <Method View getChildAt(int)>
	//   26   53:astore          13
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   27   55:aload           13
	//   28   57:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   29   60:checkcast       #20  <Class ViewPager$LayoutParams>
	//   30   63:astore          14
				int l1;
				if(!layoutparams.isDecor)
	//*  31   65:aload           14
	//*  32   67:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//*  33   70:ifne            80
				{
					l1 = k;
	//   34   73:iload           4
	//   35   75:istore          8
				} else
	//*  36   77:goto            264
				{
					int j1;
					switch(layoutparams.gravity & 7)
	//*  37   80:aload           14
	//*  38   82:getfield        #1072 <Field int ViewPager$LayoutParams.gravity>
	//*  39   85:bipush          7
	//*  40   87:iand            
					{
	//*  41   88:tableswitch     1 5: default 124
	//	               1 164
	//	               2 124
	//	               3 139
	//	               4 124
	//	               5 192
					case 2: // '\002'
					case 4: // '\004'
					default:
						l1 = k;
	//   42  124:iload           4
	//   43  126:istore          8
						j1 = i1;
	//   44  128:iload           5
	//   45  130:istore          6
						i1 = l1;
	//   46  132:iload           8
	//   47  134:istore          5
						break;

	//*  48  136:goto            223
					case 3: // '\003'
						l1 = k;
	//   49  139:iload           4
	//   50  141:istore          8
						k += view.getWidth();
	//   51  143:iload           4
	//   52  145:aload           13
	//   53  147:invokevirtual   #1113 <Method int View.getWidth()>
	//   54  150:iadd            
	//   55  151:istore          4
						j1 = i1;
	//   56  153:iload           5
	//   57  155:istore          6
						i1 = l1;
	//   58  157:iload           8
	//   59  159:istore          5
						break;

	//*  60  161:goto            223
					case 1: // '\001'
						l1 = Math.max((j2 - view.getMeasuredWidth()) / 2, k);
	//   61  164:iload           10
	//   62  166:aload           13
	//   63  168:invokevirtual   #1073 <Method int View.getMeasuredWidth()>
	//   64  171:isub            
	//   65  172:iconst_2        
	//   66  173:idiv            
	//   67  174:iload           4
	//   68  176:invokestatic    #339 <Method int Math.max(int, int)>
	//   69  179:istore          8
						j1 = i1;
	//   70  181:iload           5
	//   71  183:istore          6
						i1 = l1;
	//   72  185:iload           8
	//   73  187:istore          5
						break;

	//*  74  189:goto            223
					case 5: // '\005'
						j1 = j2 - i1 - view.getMeasuredWidth();
	//   75  192:iload           10
	//   76  194:iload           5
	//   77  196:isub            
	//   78  197:aload           13
	//   79  199:invokevirtual   #1073 <Method int View.getMeasuredWidth()>
	//   80  202:isub            
	//   81  203:istore          6
						l1 = i1 + view.getMeasuredWidth();
	//   82  205:iload           5
	//   83  207:aload           13
	//   84  209:invokevirtual   #1073 <Method int View.getMeasuredWidth()>
	//   85  212:iadd            
	//   86  213:istore          8
						i1 = j1;
	//   87  215:iload           6
	//   88  217:istore          5
						j1 = l1;
	//   89  219:iload           8
	//   90  221:istore          6
						break;
					}
					int l2 = (i1 + i2) - view.getLeft();
	//   91  223:iload           5
	//   92  225:iload           9
	//   93  227:iadd            
	//   94  228:aload           13
	//   95  230:invokevirtual   #400 <Method int View.getLeft()>
	//   96  233:isub            
	//   97  234:istore          12
					l1 = k;
	//   98  236:iload           4
	//   99  238:istore          8
					i1 = j1;
	//  100  240:iload           6
	//  101  242:istore          5
					if(l2 != 0)
	//* 102  244:iload           12
	//* 103  246:ifeq            264
					{
						view.offsetLeftAndRight(l2);
	//  104  249:aload           13
	//  105  251:iload           12
	//  106  253:invokevirtual   #1116 <Method void View.offsetLeftAndRight(int)>
						i1 = j1;
	//  107  256:iload           6
	//  108  258:istore          5
						l1 = k;
	//  109  260:iload           4
	//  110  262:istore          8
					}
				}
				k1++;
	//  111  264:iload           7
	//  112  266:iconst_1        
	//  113  267:iadd            
	//  114  268:istore          7
				k = l1;
	//  115  270:iload           8
	//  116  272:istore          4
			}

		}
	//* 117  274:goto            40
		dispatchOnPageScrolled(i, f, j);
	//  118  277:aload_0         
	//  119  278:iload_1         
	//  120  279:fload_2         
	//  121  280:iload_3         
	//  122  281:invokespecial   #1118 <Method void dispatchOnPageScrolled(int, float, int)>
		if(mPageTransformer != null)
	//* 123  284:aload_0         
	//* 124  285:getfield        #1120 <Field ViewPager$PageTransformer mPageTransformer>
	//* 125  288:ifnull          368
		{
			j = getScrollX();
	//  126  291:aload_0         
	//  127  292:invokevirtual   #283 <Method int getScrollX()>
	//  128  295:istore_3        
			int l = getChildCount();
	//  129  296:aload_0         
	//  130  297:invokevirtual   #367 <Method int getChildCount()>
	//  131  300:istore          4
			for(i = 0; i < l; i++)
	//* 132  302:iconst_0        
	//* 133  303:istore_1        
	//* 134  304:iload_1         
	//* 135  305:iload           4
	//* 136  307:icmpge          368
			{
				View view1 = getChildAt(i);
	//  137  310:aload_0         
	//  138  311:iload_1         
	//  139  312:invokevirtual   #373 <Method View getChildAt(int)>
	//  140  315:astore          13
				if(!((LayoutParams)view1.getLayoutParams()).isDecor)
	//* 141  317:aload           13
	//* 142  319:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 143  322:checkcast       #20  <Class ViewPager$LayoutParams>
	//* 144  325:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//* 145  328:ifeq            334
	//* 146  331:goto            361
				{
					f = (float)(view1.getLeft() - j) / (float)getClientWidth();
	//  147  334:aload           13
	//  148  336:invokevirtual   #400 <Method int View.getLeft()>
	//  149  339:iload_3         
	//  150  340:isub            
	//  151  341:i2f             
	//  152  342:aload_0         
	//  153  343:invokespecial   #242 <Method int getClientWidth()>
	//  154  346:i2f             
	//  155  347:fdiv            
	//  156  348:fstore_2        
					mPageTransformer.transformPage(view1, f);
	//  157  349:aload_0         
	//  158  350:getfield        #1120 <Field ViewPager$PageTransformer mPageTransformer>
	//  159  353:aload           13
	//  160  355:fload_2         
	//  161  356:invokeinterface #1124 <Method void ViewPager$PageTransformer.transformPage(View, float)>
				}
			}

	//  162  361:iload_1         
	//  163  362:iconst_1        
	//  164  363:iadd            
	//  165  364:istore_1        
		}
	//* 166  365:goto            304
		mCalledSuper = true;
	//  167  368:aload_0         
	//  168  369:iconst_1        
	//  169  370:putfield        #484 <Field boolean mCalledSuper>
	//  170  373:return          
	}

	protected boolean onRequestFocusInDescendants(int i, Rect rect)
	{
		int k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #367 <Method int getChildCount()>
	//    2    4:istore          5
		int j;
		byte byte0;
		if((i & 2) != 0)
	//*   3    6:iload_1         
	//*   4    7:iconst_2        
	//*   5    8:iand            
	//*   6    9:ifeq            20
		{
			j = 0;
	//    7   12:iconst_0        
	//    8   13:istore_3        
			byte0 = 1;
	//    9   14:iconst_1        
	//   10   15:istore          4
		} else
	//*  11   17:goto            31
		{
			j = k - 1;
	//   12   20:iload           5
	//   13   22:iconst_1        
	//   14   23:isub            
	//   15   24:istore_3        
			byte0 = -1;
	//   16   25:iconst_m1       
	//   17   26:istore          4
			k = -1;
	//   18   28:iconst_m1       
	//   19   29:istore          5
		}
		for(; j != k; j += ((int) (byte0)))
	//*  20   31:iload_3         
	//*  21   32:iload           5
	//*  22   34:icmpeq          97
		{
			View view = getChildAt(j);
	//   23   37:aload_0         
	//   24   38:iload_3         
	//   25   39:invokevirtual   #373 <Method View getChildAt(int)>
	//   26   42:astore          6
			if(view.getVisibility() != 0)
				continue;
	//   27   44:aload           6
	//   28   46:invokevirtual   #590 <Method int View.getVisibility()>
	//   29   49:ifne            89
			ItemInfo iteminfo = infoForChild(view);
	//   30   52:aload_0         
	//   31   53:aload           6
	//   32   55:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//   33   58:astore          7
			if(iteminfo != null && iteminfo.position == mCurItem && view.requestFocus(i, rect))
	//*  34   60:aload           7
	//*  35   62:ifnull          89
	//*  36   65:aload           7
	//*  37   67:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  38   70:aload_0         
	//*  39   71:getfield        #330 <Field int mCurItem>
	//*  40   74:icmpne          89
	//*  41   77:aload           6
	//*  42   79:iload_1         
	//*  43   80:aload_2         
	//*  44   81:invokevirtual   #1129 <Method boolean View.requestFocus(int, Rect)>
	//*  45   84:ifeq            89
				return true;
	//   46   87:iconst_1        
	//   47   88:ireturn         
		}

	//   48   89:iload_3         
	//   49   90:iload           4
	//   50   92:iadd            
	//   51   93:istore_3        
	//*  52   94:goto            31
		return false;
	//   53   97:iconst_0        
	//   54   98:ireturn         
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #38  <Class ViewPager$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #1133 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #38  <Class ViewPager$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #1137 <Method Parcelable ViewPager$SavedState.getSuperState()>
	//   13   23:invokespecial   #1133 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		if(mAdapter != null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #233 <Field PagerAdapter mAdapter>
	//*  16   30:ifnull          59
		{
			mAdapter.restoreState(((SavedState) (parcelable)).adapterState, ((SavedState) (parcelable)).loader);
	//   17   33:aload_0         
	//   18   34:getfield        #233 <Field PagerAdapter mAdapter>
	//   19   37:aload_1         
	//   20   38:getfield        #1140 <Field Parcelable ViewPager$SavedState.adapterState>
	//   21   41:aload_1         
	//   22   42:getfield        #1143 <Field ClassLoader ViewPager$SavedState.loader>
	//   23   45:invokevirtual   #1147 <Method void PagerAdapter.restoreState(Parcelable, ClassLoader)>
			setCurrentItemInternal(((SavedState) (parcelable)).position, false, true);
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:getfield        #1148 <Field int ViewPager$SavedState.position>
	//   27   53:iconst_0        
	//   28   54:iconst_1        
	//   29   55:invokevirtual   #794 <Method void setCurrentItemInternal(int, boolean, boolean)>
			return;
	//   30   58:return          
		} else
		{
			mRestoredCurItem = ((SavedState) (parcelable)).position;
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:getfield        #1148 <Field int ViewPager$SavedState.position>
	//   34   64:putfield        #198 <Field int mRestoredCurItem>
			mRestoredAdapterState = ((SavedState) (parcelable)).adapterState;
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:getfield        #1140 <Field Parcelable ViewPager$SavedState.adapterState>
	//   38   72:putfield        #200 <Field Parcelable mRestoredAdapterState>
			mRestoredClassLoader = ((SavedState) (parcelable)).loader;
	//   39   75:aload_0         
	//   40   76:aload_1         
	//   41   77:getfield        #1143 <Field ClassLoader ViewPager$SavedState.loader>
	//   42   80:putfield        #202 <Field ClassLoader mRestoredClassLoader>
			return;
	//   43   83:return          
		}
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #38  <Class ViewPager$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1151 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #1153 <Method void ViewPager$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.position = mCurItem;
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #330 <Field int mCurItem>
	//    9   17:putfield        #1148 <Field int ViewPager$SavedState.position>
		if(mAdapter != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #233 <Field PagerAdapter mAdapter>
	//*  12   24:ifnull          38
			savedstate.adapterState = mAdapter.saveState();
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #233 <Field PagerAdapter mAdapter>
	//   16   32:invokevirtual   #1156 <Method Parcelable PagerAdapter.saveState()>
	//   17   35:putfield        #1140 <Field Parcelable ViewPager$SavedState.adapterState>
		return ((Parcelable) (savedstate));
	//   18   38:aload_1         
	//   19   39:areturn         
	}

	protected void onSizeChanged(int i, int j, int k, int l)
	{
		super.onSizeChanged(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #1159 <Method void ViewGroup.onSizeChanged(int, int, int, int)>
		if(i != k)
	//*   6    9:iload_1         
	//*   7   10:iload_3         
	//*   8   11:icmpeq          28
			recomputeScrollPosition(i, k, mPageMargin, mPageMargin);
	//    9   14:aload_0         
	//   10   15:iload_1         
	//   11   16:iload_3         
	//   12   17:aload_0         
	//   13   18:getfield        #244 <Field int mPageMargin>
	//   14   21:aload_0         
	//   15   22:getfield        #244 <Field int mPageMargin>
	//   16   25:invokespecial   #1161 <Method void recomputeScrollPosition(int, int, int, int)>
	//   17   28:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(mFakeDragging)
	//*   0    0:aload_0         
	//*   1    1:getfield        #720 <Field boolean mFakeDragging>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(motionevent.getAction() == 0 && motionevent.getEdgeFlags() != 0)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #1036 <Method int MotionEvent.getAction()>
	//*   7   13:ifne            25
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #1165 <Method int MotionEvent.getEdgeFlags()>
	//*  10   20:ifeq            25
			return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
		if(mAdapter == null || mAdapter.getCount() == 0)
	//*  13   25:aload_0         
	//*  14   26:getfield        #233 <Field PagerAdapter mAdapter>
	//*  15   29:ifnull          42
	//*  16   32:aload_0         
	//*  17   33:getfield        #233 <Field PagerAdapter mAdapter>
	//*  18   36:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*  19   39:ifne            44
			return false;
	//   20   42:iconst_0        
	//   21   43:ireturn         
		if(mVelocityTracker == null)
	//*  22   44:aload_0         
	//*  23   45:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//*  24   48:ifnonnull       58
			mVelocityTracker = VelocityTracker.obtain();
	//   25   51:aload_0         
	//   26   52:invokestatic    #729 <Method VelocityTracker VelocityTracker.obtain()>
	//   27   55:putfield        #386 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//   28   58:aload_0         
	//   29   59:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//   30   62:aload_1         
	//   31   63:invokevirtual   #741 <Method void VelocityTracker.addMovement(MotionEvent)>
		int i = motionevent.getAction();
	//   32   66:aload_1         
	//   33   67:invokevirtual   #1036 <Method int MotionEvent.getAction()>
	//   34   70:istore          6
		boolean flag1 = false;
	//   35   72:iconst_0        
	//   36   73:istore          10
		boolean flag = flag1;
	//   37   75:iload           10
	//   38   77:istore          9
		switch(i & 0xff)
	//*  39   79:iload           6
	//*  40   81:sipush          255
	//*  41   84:iand            
		{
	//*  42   85:tableswitch     0 6: default 128
	//	               0 135
	//	               1 403
	//	               2 197
	//	               3 545
	//	               4 634
	//	               5 576
	//	               6 609
		default:
			flag = flag1;
	//   43  128:iload           10
	//   44  130:istore          9
			break;
	//   45  132:goto            634

		case 4: // '\004'
			break;

		case 0: // '\0'
			mScroller.abortAnimation();
	//   46  135:aload_0         
	//   47  136:getfield        #271 <Field Scroller mScroller>
	//   48  139:invokevirtual   #280 <Method void Scroller.abortAnimation()>
			mPopulatePending = false;
	//   49  142:aload_0         
	//   50  143:iconst_0        
	//   51  144:putfield        #302 <Field boolean mPopulatePending>
			populate();
	//   52  147:aload_0         
	//   53  148:invokevirtual   #1065 <Method void populate()>
			float f = motionevent.getX();
	//   54  151:aload_1         
	//   55  152:invokevirtual   #1057 <Method float MotionEvent.getX()>
	//   56  155:fstore_2        
			mInitialMotionX = f;
	//   57  156:aload_0         
	//   58  157:fload_2         
	//   59  158:putfield        #725 <Field float mInitialMotionX>
			mLastMotionX = f;
	//   60  161:aload_0         
	//   61  162:fload_2         
	//   62  163:putfield        #479 <Field float mLastMotionX>
			f = motionevent.getY();
	//   63  166:aload_1         
	//   64  167:invokevirtual   #1059 <Method float MotionEvent.getY()>
	//   65  170:fstore_2        
			mInitialMotionY = f;
	//   66  171:aload_0         
	//   67  172:fload_2         
	//   68  173:putfield        #1046 <Field float mInitialMotionY>
			mLastMotionY = f;
	//   69  176:aload_0         
	//   70  177:fload_2         
	//   71  178:putfield        #1050 <Field float mLastMotionY>
			mActivePointerId = motionevent.getPointerId(0);
	//   72  181:aload_0         
	//   73  182:aload_1         
	//   74  183:iconst_0        
	//   75  184:invokevirtual   #474 <Method int MotionEvent.getPointerId(int)>
	//   76  187:putfield        #212 <Field int mActivePointerId>
			flag = flag1;
	//   77  190:iload           10
	//   78  192:istore          9
			break;
	//   79  194:goto            634

		case 2: // '\002'
			if(!mIsBeingDragged)
	//*  80  197:aload_0         
	//*  81  198:getfield        #382 <Field boolean mIsBeingDragged>
	//*  82  201:ifne            369
			{
				int j = motionevent.findPointerIndex(mActivePointerId);
	//   83  204:aload_1         
	//   84  205:aload_0         
	//   85  206:getfield        #212 <Field int mActivePointerId>
	//   86  209:invokevirtual   #1041 <Method int MotionEvent.findPointerIndex(int)>
	//   87  212:istore          6
				if(j == -1)
	//*  88  214:iload           6
	//*  89  216:iconst_m1       
	//*  90  217:icmpne          229
				{
					flag = resetTouch();
	//   91  220:aload_0         
	//   92  221:invokespecial   #1038 <Method boolean resetTouch()>
	//   93  224:istore          9
					break;
	//   94  226:goto            634
				}
				float f1 = motionevent.getX(j);
	//   95  229:aload_1         
	//   96  230:iload           6
	//   97  232:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//   98  235:fstore_2        
				float f4 = Math.abs(f1 - mLastMotionX);
	//   99  236:fload_2         
	//  100  237:aload_0         
	//  101  238:getfield        #479 <Field float mLastMotionX>
	//  102  241:fsub            
	//  103  242:invokestatic    #501 <Method float Math.abs(float)>
	//  104  245:fstore          4
				float f3 = motionevent.getY(j);
	//  105  247:aload_1         
	//  106  248:iload           6
	//  107  250:invokevirtual   #1044 <Method float MotionEvent.getY(int)>
	//  108  253:fstore_3        
				float f5 = Math.abs(f3 - mLastMotionY);
	//  109  254:fload_3         
	//  110  255:aload_0         
	//  111  256:getfield        #1050 <Field float mLastMotionY>
	//  112  259:fsub            
	//  113  260:invokestatic    #501 <Method float Math.abs(float)>
	//  114  263:fstore          5
				if(f4 > (float)mTouchSlop && f4 > f5)
	//* 115  265:fload           4
	//* 116  267:aload_0         
	//* 117  268:getfield        #978 <Field int mTouchSlop>
	//* 118  271:i2f             
	//* 119  272:fcmpl           
	//* 120  273:ifle            369
	//* 121  276:fload           4
	//* 122  278:fload           5
	//* 123  280:fcmpl           
	//* 124  281:ifle            369
				{
					mIsBeingDragged = true;
	//  125  284:aload_0         
	//  126  285:iconst_1        
	//  127  286:putfield        #382 <Field boolean mIsBeingDragged>
					requestParentDisallowInterceptTouchEvent(true);
	//  128  289:aload_0         
	//  129  290:iconst_1        
	//  130  291:invokespecial   #1052 <Method void requestParentDisallowInterceptTouchEvent(boolean)>
					if(f1 - mInitialMotionX > 0.0F)
	//* 131  294:fload_2         
	//* 132  295:aload_0         
	//* 133  296:getfield        #725 <Field float mInitialMotionX>
	//* 134  299:fsub            
	//* 135  300:fconst_0        
	//* 136  301:fcmpl           
	//* 137  302:ifle            319
						f1 = mInitialMotionX + (float)mTouchSlop;
	//  138  305:aload_0         
	//  139  306:getfield        #725 <Field float mInitialMotionX>
	//  140  309:aload_0         
	//  141  310:getfield        #978 <Field int mTouchSlop>
	//  142  313:i2f             
	//  143  314:fadd            
	//  144  315:fstore_2        
					else
	//* 145  316:goto            330
						f1 = mInitialMotionX - (float)mTouchSlop;
	//  146  319:aload_0         
	//  147  320:getfield        #725 <Field float mInitialMotionX>
	//  148  323:aload_0         
	//  149  324:getfield        #978 <Field int mTouchSlop>
	//  150  327:i2f             
	//  151  328:fsub            
	//  152  329:fstore_2        
					mLastMotionX = f1;
	//  153  330:aload_0         
	//  154  331:fload_2         
	//  155  332:putfield        #479 <Field float mLastMotionX>
					mLastMotionY = f3;
	//  156  335:aload_0         
	//  157  336:fload_3         
	//  158  337:putfield        #1050 <Field float mLastMotionY>
					setScrollState(1);
	//  159  340:aload_0         
	//  160  341:iconst_1        
	//  161  342:invokevirtual   #723 <Method void setScrollState(int)>
					setScrollingCacheEnabled(true);
	//  162  345:aload_0         
	//  163  346:iconst_1        
	//  164  347:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
					ViewParent viewparent = getParent();
	//  165  350:aload_0         
	//  166  351:invokevirtual   #541 <Method ViewParent getParent()>
	//  167  354:astore          11
					if(viewparent != null)
	//* 168  356:aload           11
	//* 169  358:ifnull          369
						viewparent.requestDisallowInterceptTouchEvent(true);
	//  170  361:aload           11
	//  171  363:iconst_1        
	//  172  364:invokeinterface #546 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
				}
			}
			flag = flag1;
	//  173  369:iload           10
	//  174  371:istore          9
			if(mIsBeingDragged)
	//* 175  373:aload_0         
	//* 176  374:getfield        #382 <Field boolean mIsBeingDragged>
	//* 177  377:ifeq            634
				flag = performDrag(motionevent.getX(motionevent.findPointerIndex(mActivePointerId))) | false;
	//  178  380:aload_0         
	//  179  381:aload_1         
	//  180  382:aload_1         
	//  181  383:aload_0         
	//  182  384:getfield        #212 <Field int mActivePointerId>
	//  183  387:invokevirtual   #1041 <Method int MotionEvent.findPointerIndex(int)>
	//  184  390:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//  185  393:invokespecial   #1054 <Method boolean performDrag(float)>
	//  186  396:iconst_0        
	//  187  397:ior             
	//  188  398:istore          9
			break;

	//* 189  400:goto            634
		case 1: // '\001'
			flag = flag1;
	//  190  403:iload           10
	//  191  405:istore          9
			if(mIsBeingDragged)
	//* 192  407:aload_0         
	//* 193  408:getfield        #382 <Field boolean mIsBeingDragged>
	//* 194  411:ifeq            634
			{
				Object obj = ((Object) (mVelocityTracker));
	//  195  414:aload_0         
	//  196  415:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//  197  418:astore          11
				((VelocityTracker) (obj)).computeCurrentVelocity(1000, mMaximumVelocity);
	//  198  420:aload           11
	//  199  422:sipush          1000
	//  200  425:aload_0         
	//  201  426:getfield        #887 <Field int mMaximumVelocity>
	//  202  429:i2f             
	//  203  430:invokevirtual   #891 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
				int k = (int)((VelocityTracker) (obj)).getXVelocity(mActivePointerId);
	//  204  433:aload           11
	//  205  435:aload_0         
	//  206  436:getfield        #212 <Field int mActivePointerId>
	//  207  439:invokevirtual   #894 <Method float VelocityTracker.getXVelocity(int)>
	//  208  442:f2i             
	//  209  443:istore          6
				mPopulatePending = true;
	//  210  445:aload_0         
	//  211  446:iconst_1        
	//  212  447:putfield        #302 <Field boolean mPopulatePending>
				int i1 = getClientWidth();
	//  213  450:aload_0         
	//  214  451:invokespecial   #242 <Method int getClientWidth()>
	//  215  454:istore          7
				int j1 = getScrollX();
	//  216  456:aload_0         
	//  217  457:invokevirtual   #283 <Method int getScrollX()>
	//  218  460:istore          8
				obj = ((Object) (infoForCurrentScrollPosition()));
	//  219  462:aload_0         
	//  220  463:invokespecial   #494 <Method ViewPager$ItemInfo infoForCurrentScrollPosition()>
	//  221  466:astore          11
				float f2 = (float)mPageMargin / (float)i1;
	//  222  468:aload_0         
	//  223  469:getfield        #244 <Field int mPageMargin>
	//  224  472:i2f             
	//  225  473:iload           7
	//  226  475:i2f             
	//  227  476:fdiv            
	//  228  477:fstore_2        
				setCurrentItemInternal(determineTargetPage(((ItemInfo) (obj)).position, ((float)j1 / (float)i1 - ((ItemInfo) (obj)).offset) / (((ItemInfo) (obj)).widthFactor + f2), k, (int)(motionevent.getX(motionevent.findPointerIndex(mActivePointerId)) - mInitialMotionX)), true, true, k);
	//  229  478:aload_0         
	//  230  479:aload_0         
	//  231  480:aload           11
	//  232  482:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  233  485:iload           8
	//  234  487:i2f             
	//  235  488:iload           7
	//  236  490:i2f             
	//  237  491:fdiv            
	//  238  492:aload           11
	//  239  494:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  240  497:fsub            
	//  241  498:aload           11
	//  242  500:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  243  503:fload_2         
	//  244  504:fadd            
	//  245  505:fdiv            
	//  246  506:iload           6
	//  247  508:aload_1         
	//  248  509:aload_1         
	//  249  510:aload_0         
	//  250  511:getfield        #212 <Field int mActivePointerId>
	//  251  514:invokevirtual   #1041 <Method int MotionEvent.findPointerIndex(int)>
	//  252  517:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//  253  520:aload_0         
	//  254  521:getfield        #725 <Field float mInitialMotionX>
	//  255  524:fsub            
	//  256  525:f2i             
	//  257  526:invokespecial   #896 <Method int determineTargetPage(int, float, int, int)>
	//  258  529:iconst_1        
	//  259  530:iconst_1        
	//  260  531:iload           6
	//  261  533:invokevirtual   #899 <Method void setCurrentItemInternal(int, boolean, boolean, int)>
				flag = resetTouch();
	//  262  536:aload_0         
	//  263  537:invokespecial   #1038 <Method boolean resetTouch()>
	//  264  540:istore          9
			}
			break;

	//* 265  542:goto            634
		case 3: // '\003'
			flag = flag1;
	//  266  545:iload           10
	//  267  547:istore          9
			if(mIsBeingDragged)
	//* 268  549:aload_0         
	//* 269  550:getfield        #382 <Field boolean mIsBeingDragged>
	//* 270  553:ifeq            634
			{
				scrollToItem(mCurItem, true, 0, false);
	//  271  556:aload_0         
	//  272  557:aload_0         
	//  273  558:getfield        #330 <Field int mCurItem>
	//  274  561:iconst_1        
	//  275  562:iconst_0        
	//  276  563:iconst_0        
	//  277  564:invokespecial   #1092 <Method void scrollToItem(int, boolean, int, boolean)>
				flag = resetTouch();
	//  278  567:aload_0         
	//  279  568:invokespecial   #1038 <Method boolean resetTouch()>
	//  280  571:istore          9
			}
			break;

	//* 281  573:goto            634
		case 5: // '\005'
			int l = motionevent.getActionIndex();
	//  282  576:aload_1         
	//  283  577:invokevirtual   #471 <Method int MotionEvent.getActionIndex()>
	//  284  580:istore          6
			mLastMotionX = motionevent.getX(l);
	//  285  582:aload_0         
	//  286  583:aload_1         
	//  287  584:iload           6
	//  288  586:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//  289  589:putfield        #479 <Field float mLastMotionX>
			mActivePointerId = motionevent.getPointerId(l);
	//  290  592:aload_0         
	//  291  593:aload_1         
	//  292  594:iload           6
	//  293  596:invokevirtual   #474 <Method int MotionEvent.getPointerId(int)>
	//  294  599:putfield        #212 <Field int mActivePointerId>
			flag = flag1;
	//  295  602:iload           10
	//  296  604:istore          9
			break;

	//* 297  606:goto            634
		case 6: // '\006'
			onSecondaryPointerUp(motionevent);
	//  298  609:aload_0         
	//  299  610:aload_1         
	//  300  611:invokespecial   #1067 <Method void onSecondaryPointerUp(MotionEvent)>
			mLastMotionX = motionevent.getX(motionevent.findPointerIndex(mActivePointerId));
	//  301  614:aload_0         
	//  302  615:aload_1         
	//  303  616:aload_1         
	//  304  617:aload_0         
	//  305  618:getfield        #212 <Field int mActivePointerId>
	//  306  621:invokevirtual   #1041 <Method int MotionEvent.findPointerIndex(int)>
	//  307  624:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//  308  627:putfield        #479 <Field float mLastMotionX>
			flag = flag1;
	//  309  630:iload           10
	//  310  632:istore          9
			break;
		}
		if(flag)
	//* 311  634:iload           9
	//* 312  636:ifeq            643
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  313  639:aload_0         
	//  314  640:invokestatic    #768 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		return true;
	//  315  643:iconst_1        
	//  316  644:ireturn         
	}

	boolean pageLeft()
	{
		if(mCurItem > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #330 <Field int mCurItem>
	//*   2    4:ifle            20
		{
			setCurrentItem(mCurItem - 1, true);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #330 <Field int mCurItem>
	//    6   12:iconst_1        
	//    7   13:isub            
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #1169 <Method void setCurrentItem(int, boolean)>
			return true;
	//   10   18:iconst_1        
	//   11   19:ireturn         
		} else
		{
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		}
	}

	boolean pageRight()
	{
		if(mAdapter != null && mCurItem < mAdapter.getCount() - 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #233 <Field PagerAdapter mAdapter>
	//*   2    4:ifnull          36
	//*   3    7:aload_0         
	//*   4    8:getfield        #330 <Field int mCurItem>
	//*   5   11:aload_0         
	//*   6   12:getfield        #233 <Field PagerAdapter mAdapter>
	//*   7   15:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*   8   18:iconst_1        
	//*   9   19:isub            
	//*  10   20:icmpge          36
		{
			setCurrentItem(mCurItem + 1, true);
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #330 <Field int mCurItem>
	//   14   28:iconst_1        
	//   15   29:iadd            
	//   16   30:iconst_1        
	//   17   31:invokevirtual   #1169 <Method void setCurrentItem(int, boolean)>
			return true;
	//   18   34:iconst_1        
	//   19   35:ireturn         
		} else
		{
			return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
		}
	}

	void populate()
	{
		populate(mCurItem);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #330 <Field int mCurItem>
	//    3    5:invokevirtual   #1171 <Method void populate(int)>
	//    4    8:return          
	}

	void populate(int i)
	{
		Object obj3 = null;
	//    0    0:aconst_null     
	//    1    1:astore          14
		if(mCurItem != i)
	//*   2    3:aload_0         
	//*   3    4:getfield        #330 <Field int mCurItem>
	//*   4    7:iload_1         
	//*   5    8:icmpeq          26
		{
			obj3 = ((Object) (infoForPosition(mCurItem)));
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getfield        #330 <Field int mCurItem>
	//    9   16:invokevirtual   #523 <Method ViewPager$ItemInfo infoForPosition(int)>
	//   10   19:astore          14
			mCurItem = i;
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:putfield        #330 <Field int mCurItem>
		}
		if(mAdapter == null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #233 <Field PagerAdapter mAdapter>
	//*  16   30:ifnonnull       38
		{
			sortChildDrawingOrder();
	//   17   33:aload_0         
	//   18   34:invokespecial   #1175 <Method void sortChildDrawingOrder()>
			return;
	//   19   37:return          
		}
		if(mPopulatePending)
	//*  20   38:aload_0         
	//*  21   39:getfield        #302 <Field boolean mPopulatePending>
	//*  22   42:ifeq            50
		{
			sortChildDrawingOrder();
	//   23   45:aload_0         
	//   24   46:invokespecial   #1175 <Method void sortChildDrawingOrder()>
			return;
	//   25   49:return          
		}
		if(getWindowToken() == null)
	//*  26   50:aload_0         
	//*  27   51:invokevirtual   #1179 <Method android.os.IBinder getWindowToken()>
	//*  28   54:ifnonnull       58
			return;
	//   29   57:return          
		mAdapter.startUpdate(((ViewGroup) (this)));
	//   30   58:aload_0         
	//   31   59:getfield        #233 <Field PagerAdapter mAdapter>
	//   32   62:aload_0         
	//   33   63:invokevirtual   #782 <Method void PagerAdapter.startUpdate(ViewGroup)>
		i = mOffscreenPageLimit;
	//   34   66:aload_0         
	//   35   67:getfield        #210 <Field int mOffscreenPageLimit>
	//   36   70:istore_1        
		int j2 = Math.max(0, mCurItem - i);
	//   37   71:iconst_0        
	//   38   72:aload_0         
	//   39   73:getfield        #330 <Field int mCurItem>
	//   40   76:iload_1         
	//   41   77:isub            
	//   42   78:invokestatic    #339 <Method int Math.max(int, int)>
	//   43   81:istore          11
		int l1 = mAdapter.getCount();
	//   44   83:aload_0         
	//   45   84:getfield        #233 <Field PagerAdapter mAdapter>
	//   46   87:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//   47   90:istore          9
		int i2 = Math.min(l1 - 1, mCurItem + i);
	//   48   92:iload           9
	//   49   94:iconst_1        
	//   50   95:isub            
	//   51   96:aload_0         
	//   52   97:getfield        #330 <Field int mCurItem>
	//   53  100:iload_1         
	//   54  101:iadd            
	//   55  102:invokestatic    #336 <Method int Math.min(int, int)>
	//   56  105:istore          10
		if(l1 != mExpectedAdapterCount)
	//*  57  107:iload           9
	//*  58  109:aload_0         
	//*  59  110:getfield        #771 <Field int mExpectedAdapterCount>
	//*  60  113:icmpeq          225
		{
			Object obj;
			try
			{
				obj = ((Object) (getResources().getResourceName(getId())));
	//   61  116:aload_0         
	//   62  117:invokevirtual   #1180 <Method Resources getResources()>
	//   63  120:aload_0         
	//   64  121:invokevirtual   #1183 <Method int getId()>
	//   65  124:invokevirtual   #1187 <Method String Resources.getResourceName(int)>
	//   66  127:astore          13
			}
	//*  67  129:goto            143
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  68  132:astore          13
			{
				obj = ((Object) (Integer.toHexString(getId())));
	//   69  134:aload_0         
	//   70  135:invokevirtual   #1183 <Method int getId()>
	//   71  138:invokestatic    #1192 <Method String Integer.toHexString(int)>
	//   72  141:astore          13
			}
			throw new IllegalStateException((new StringBuilder()).append("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ").append(mExpectedAdapterCount).append(", found: ").append(l1).append(" Pager id: ").append(((String) (obj))).append(" Pager class: ").append(((Object) (((Object)this).getClass()))).append(" Problematic adapter: ").append(((Object) (((Object) (mAdapter)).getClass()))).toString());
	//   73  143:new             #487 <Class IllegalStateException>
	//   74  146:dup             
	//   75  147:new             #666 <Class StringBuilder>
	//   76  150:dup             
	//   77  151:invokespecial   #667 <Method void StringBuilder()>
	//   78  154:ldc2            #1194 <String "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ">
	//   79  157:invokevirtual   #675 <Method StringBuilder StringBuilder.append(String)>
	//   80  160:aload_0         
	//   81  161:getfield        #771 <Field int mExpectedAdapterCount>
	//   82  164:invokevirtual   #1197 <Method StringBuilder StringBuilder.append(int)>
	//   83  167:ldc2            #1199 <String ", found: ">
	//   84  170:invokevirtual   #675 <Method StringBuilder StringBuilder.append(String)>
	//   85  173:iload           9
	//   86  175:invokevirtual   #1197 <Method StringBuilder StringBuilder.append(int)>
	//   87  178:ldc2            #1201 <String " Pager id: ">
	//   88  181:invokevirtual   #675 <Method StringBuilder StringBuilder.append(String)>
	//   89  184:aload           13
	//   90  186:invokevirtual   #675 <Method StringBuilder StringBuilder.append(String)>
	//   91  189:ldc2            #1203 <String " Pager class: ">
	//   92  192:invokevirtual   #675 <Method StringBuilder StringBuilder.append(String)>
	//   93  195:aload_0         
	//   94  196:invokevirtual   #450 <Method Class Object.getClass()>
	//   95  199:invokevirtual   #1206 <Method StringBuilder StringBuilder.append(Object)>
	//   96  202:ldc2            #1208 <String " Problematic adapter: ">
	//   97  205:invokevirtual   #675 <Method StringBuilder StringBuilder.append(String)>
	//   98  208:aload_0         
	//   99  209:getfield        #233 <Field PagerAdapter mAdapter>
	//  100  212:invokevirtual   #450 <Method Class Object.getClass()>
	//  101  215:invokevirtual   #1206 <Method StringBuilder StringBuilder.append(Object)>
	//  102  218:invokevirtual   #682 <Method String StringBuilder.toString()>
	//  103  221:invokespecial   #492 <Method void IllegalStateException(String)>
	//  104  224:athrow          
		}
		ItemInfo iteminfo1 = null;
	//  105  225:aconst_null     
	//  106  226:astore          15
		i = 0;
	//  107  228:iconst_0        
	//  108  229:istore_1        
		Object obj1;
		do
		{
			obj1 = ((Object) (iteminfo1));
	//  109  230:aload           15
	//  110  232:astore          13
			if(i >= mItems.size())
				break;
	//  111  234:iload_1         
	//  112  235:aload_0         
	//  113  236:getfield        #188 <Field ArrayList mItems>
	//  114  239:invokevirtual   #256 <Method int ArrayList.size()>
	//  115  242:icmpge          300
			ItemInfo iteminfo2 = (ItemInfo)mItems.get(i);
	//  116  245:aload_0         
	//  117  246:getfield        #188 <Field ArrayList mItems>
	//  118  249:iload_1         
	//  119  250:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  120  253:checkcast       #17  <Class ViewPager$ItemInfo>
	//  121  256:astore          16
			if(iteminfo2.position >= mCurItem)
	//* 122  258:aload           16
	//* 123  260:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 124  263:aload_0         
	//* 125  264:getfield        #330 <Field int mCurItem>
	//* 126  267:icmplt          293
			{
				obj1 = ((Object) (iteminfo1));
	//  127  270:aload           15
	//  128  272:astore          13
				if(iteminfo2.position == mCurItem)
	//* 129  274:aload           16
	//* 130  276:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 131  279:aload_0         
	//* 132  280:getfield        #330 <Field int mCurItem>
	//* 133  283:icmpne          300
					obj1 = ((Object) (iteminfo2));
	//  134  286:aload           16
	//  135  288:astore          13
				break;
	//  136  290:goto            300
			}
			i++;
	//  137  293:iload_1         
	//  138  294:iconst_1        
	//  139  295:iadd            
	//  140  296:istore_1        
		} while(true);
	//  141  297:goto            230
		iteminfo1 = ((ItemInfo) (obj1));
	//  142  300:aload           13
	//  143  302:astore          15
		if(obj1 == null)
	//* 144  304:aload           13
	//* 145  306:ifnonnull       329
		{
			iteminfo1 = ((ItemInfo) (obj1));
	//  146  309:aload           13
	//  147  311:astore          15
			if(l1 > 0)
	//* 148  313:iload           9
	//* 149  315:ifle            329
				iteminfo1 = addNewItem(mCurItem, i);
	//  150  318:aload_0         
	//  151  319:aload_0         
	//  152  320:getfield        #330 <Field int mCurItem>
	//  153  323:iload_1         
	//  154  324:invokevirtual   #1210 <Method ViewPager$ItemInfo addNewItem(int, int)>
	//  155  327:astore          15
		}
		if(iteminfo1 != null)
	//* 156  329:aload           15
	//* 157  331:ifnull          1059
		{
			float f4 = 0.0F;
	//  158  334:fconst_0        
	//  159  335:fstore          4
			int k1 = i - 1;
	//  160  337:iload_1         
	//  161  338:iconst_1        
	//  162  339:isub            
	//  163  340:istore          8
			if(k1 >= 0)
	//* 164  342:iload           8
	//* 165  344:iflt            364
				obj1 = ((Object) ((ItemInfo)mItems.get(k1)));
	//  166  347:aload_0         
	//  167  348:getfield        #188 <Field ArrayList mItems>
	//  168  351:iload           8
	//  169  353:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  170  356:checkcast       #17  <Class ViewPager$ItemInfo>
	//  171  359:astore          13
			else
	//* 172  361:goto            367
				obj1 = null;
	//  173  364:aconst_null     
	//  174  365:astore          13
			int k2 = getClientWidth();
	//  175  367:aload_0         
	//  176  368:invokespecial   #242 <Method int getClientWidth()>
	//  177  371:istore          12
			float f2;
			if(k2 <= 0)
	//* 178  373:iload           12
	//* 179  375:ifgt            383
				f2 = 0.0F;
	//  180  378:fconst_0        
	//  181  379:fstore_3        
			else
	//* 182  380:goto            401
				f2 = (2.0F - iteminfo1.widthFactor) + (float)getPaddingLeft() / (float)k2;
	//  183  383:fconst_2        
	//  184  384:aload           15
	//  185  386:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  186  389:fsub            
	//  187  390:aload_0         
	//  188  391:invokevirtual   #436 <Method int getPaddingLeft()>
	//  189  394:i2f             
	//  190  395:iload           12
	//  191  397:i2f             
	//  192  398:fdiv            
	//  193  399:fadd            
	//  194  400:fstore_3        
			int j1 = mCurItem - 1;
	//  195  401:aload_0         
	//  196  402:getfield        #330 <Field int mCurItem>
	//  197  405:iconst_1        
	//  198  406:isub            
	//  199  407:istore          7
			ItemInfo iteminfo3 = ((ItemInfo) (obj1));
	//  200  409:aload           13
	//  201  411:astore          16
			int i1 = i;
	//  202  413:iload_1         
	//  203  414:istore          6
			while(j1 >= 0) 
	//* 204  416:iload           7
	//* 205  418:iflt            695
			{
				float f;
				int j;
				if(f4 >= f2 && j1 < j2)
	//* 206  421:fload           4
	//* 207  423:fload_3         
	//* 208  424:fcmpl           
	//* 209  425:iflt            556
	//* 210  428:iload           7
	//* 211  430:iload           11
	//* 212  432:icmpge          556
				{
					if(iteminfo3 == null)
	//* 213  435:aload           16
	//* 214  437:ifnonnull       443
						break;
	//  215  440:goto            695
					i = i1;
	//  216  443:iload           6
	//  217  445:istore_1        
					f = f4;
	//  218  446:fload           4
	//  219  448:fstore_2        
					j = k1;
	//  220  449:iload           8
	//  221  451:istore          5
					obj1 = ((Object) (iteminfo3));
	//  222  453:aload           16
	//  223  455:astore          13
					if(j1 == iteminfo3.position)
	//* 224  457:iload           7
	//* 225  459:aload           16
	//* 226  461:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 227  464:icmpne          672
					{
						i = i1;
	//  228  467:iload           6
	//  229  469:istore_1        
						f = f4;
	//  230  470:fload           4
	//  231  472:fstore_2        
						j = k1;
	//  232  473:iload           8
	//  233  475:istore          5
						obj1 = ((Object) (iteminfo3));
	//  234  477:aload           16
	//  235  479:astore          13
						if(!iteminfo3.scrolling)
	//* 236  481:aload           16
	//* 237  483:getfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>
	//* 238  486:ifne            672
						{
							mItems.remove(k1);
	//  239  489:aload_0         
	//  240  490:getfield        #188 <Field ArrayList mItems>
	//  241  493:iload           8
	//  242  495:invokevirtual   #778 <Method Object ArrayList.remove(int)>
	//  243  498:pop             
							mAdapter.destroyItem(((ViewGroup) (this)), j1, iteminfo3.object);
	//  244  499:aload_0         
	//  245  500:getfield        #233 <Field PagerAdapter mAdapter>
	//  246  503:aload_0         
	//  247  504:iload           7
	//  248  506:aload           16
	//  249  508:getfield        #618 <Field Object ViewPager$ItemInfo.object>
	//  250  511:invokevirtual   #786 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
							j = k1 - 1;
	//  251  514:iload           8
	//  252  516:iconst_1        
	//  253  517:isub            
	//  254  518:istore          5
							i = i1 - 1;
	//  255  520:iload           6
	//  256  522:iconst_1        
	//  257  523:isub            
	//  258  524:istore_1        
							if(j >= 0)
	//* 259  525:iload           5
	//* 260  527:iflt            547
								obj1 = ((Object) ((ItemInfo)mItems.get(j)));
	//  261  530:aload_0         
	//  262  531:getfield        #188 <Field ArrayList mItems>
	//  263  534:iload           5
	//  264  536:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  265  539:checkcast       #17  <Class ViewPager$ItemInfo>
	//  266  542:astore          13
							else
	//* 267  544:goto            550
								obj1 = null;
	//  268  547:aconst_null     
	//  269  548:astore          13
							f = f4;
	//  270  550:fload           4
	//  271  552:fstore_2        
						}
					}
				} else
	//* 272  553:goto            672
				if(iteminfo3 != null && j1 == iteminfo3.position)
	//* 273  556:aload           16
	//* 274  558:ifnull          617
	//* 275  561:iload           7
	//* 276  563:aload           16
	//* 277  565:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 278  568:icmpne          617
				{
					f = f4 + iteminfo3.widthFactor;
	//  279  571:fload           4
	//  280  573:aload           16
	//  281  575:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  282  578:fadd            
	//  283  579:fstore_2        
					j = k1 - 1;
	//  284  580:iload           8
	//  285  582:iconst_1        
	//  286  583:isub            
	//  287  584:istore          5
					if(j >= 0)
	//* 288  586:iload           5
	//* 289  588:iflt            608
						obj1 = ((Object) ((ItemInfo)mItems.get(j)));
	//  290  591:aload_0         
	//  291  592:getfield        #188 <Field ArrayList mItems>
	//  292  595:iload           5
	//  293  597:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  294  600:checkcast       #17  <Class ViewPager$ItemInfo>
	//  295  603:astore          13
					else
	//* 296  605:goto            611
						obj1 = null;
	//  297  608:aconst_null     
	//  298  609:astore          13
					i = i1;
	//  299  611:iload           6
	//  300  613:istore_1        
				} else
	//* 301  614:goto            672
				{
					f = f4 + addNewItem(j1, k1 + 1).widthFactor;
	//  302  617:fload           4
	//  303  619:aload_0         
	//  304  620:iload           7
	//  305  622:iload           8
	//  306  624:iconst_1        
	//  307  625:iadd            
	//  308  626:invokevirtual   #1210 <Method ViewPager$ItemInfo addNewItem(int, int)>
	//  309  629:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  310  632:fadd            
	//  311  633:fstore_2        
					i = i1 + 1;
	//  312  634:iload           6
	//  313  636:iconst_1        
	//  314  637:iadd            
	//  315  638:istore_1        
					if(k1 >= 0)
	//* 316  639:iload           8
	//* 317  641:iflt            665
					{
						obj1 = ((Object) ((ItemInfo)mItems.get(k1)));
	//  318  644:aload_0         
	//  319  645:getfield        #188 <Field ArrayList mItems>
	//  320  648:iload           8
	//  321  650:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  322  653:checkcast       #17  <Class ViewPager$ItemInfo>
	//  323  656:astore          13
						j = k1;
	//  324  658:iload           8
	//  325  660:istore          5
					} else
	//* 326  662:goto            672
					{
						obj1 = null;
	//  327  665:aconst_null     
	//  328  666:astore          13
						j = k1;
	//  329  668:iload           8
	//  330  670:istore          5
					}
				}
				j1--;
	//  331  672:iload           7
	//  332  674:iconst_1        
	//  333  675:isub            
	//  334  676:istore          7
				i1 = i;
	//  335  678:iload_1         
	//  336  679:istore          6
				f4 = f;
	//  337  681:fload_2         
	//  338  682:fstore          4
				k1 = j;
	//  339  684:iload           5
	//  340  686:istore          8
				iteminfo3 = ((ItemInfo) (obj1));
	//  341  688:aload           13
	//  342  690:astore          16
			}
	//* 343  692:goto            416
			f4 = iteminfo1.widthFactor;
	//  344  695:aload           15
	//  345  697:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  346  700:fstore          4
			j1 = i1 + 1;
	//  347  702:iload           6
	//  348  704:iconst_1        
	//  349  705:iadd            
	//  350  706:istore          7
			if(f4 < 2.0F)
	//* 351  708:fload           4
	//* 352  710:fconst_2        
	//* 353  711:fcmpg           
	//* 354  712:ifge            1049
			{
				if(j1 < mItems.size())
	//* 355  715:iload           7
	//* 356  717:aload_0         
	//* 357  718:getfield        #188 <Field ArrayList mItems>
	//* 358  721:invokevirtual   #256 <Method int ArrayList.size()>
	//* 359  724:icmpge          744
					obj1 = ((Object) ((ItemInfo)mItems.get(j1)));
	//  360  727:aload_0         
	//  361  728:getfield        #188 <Field ArrayList mItems>
	//  362  731:iload           7
	//  363  733:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  364  736:checkcast       #17  <Class ViewPager$ItemInfo>
	//  365  739:astore          13
				else
	//* 366  741:goto            747
					obj1 = null;
	//  367  744:aconst_null     
	//  368  745:astore          13
				float f3;
				if(k2 <= 0)
	//* 369  747:iload           12
	//* 370  749:ifgt            757
					f3 = 0.0F;
	//  371  752:fconst_0        
	//  372  753:fstore_3        
				else
	//* 373  754:goto            769
					f3 = (float)getPaddingRight() / (float)k2 + 2.0F;
	//  374  757:aload_0         
	//  375  758:invokevirtual   #439 <Method int getPaddingRight()>
	//  376  761:i2f             
	//  377  762:iload           12
	//  378  764:i2f             
	//  379  765:fdiv            
	//  380  766:fconst_2        
	//  381  767:fadd            
	//  382  768:fstore_3        
				int k = mCurItem + 1;
	//  383  769:aload_0         
	//  384  770:getfield        #330 <Field int mCurItem>
	//  385  773:iconst_1        
	//  386  774:iadd            
	//  387  775:istore          5
				ItemInfo iteminfo4 = ((ItemInfo) (obj1));
	//  388  777:aload           13
	//  389  779:astore          16
				while(k < l1) 
	//* 390  781:iload           5
	//* 391  783:iload           9
	//* 392  785:icmpge          1049
				{
					float f1;
					if(f4 >= f3 && k > i2)
	//* 393  788:fload           4
	//* 394  790:fload_3         
	//* 395  791:fcmpl           
	//* 396  792:iflt            914
	//* 397  795:iload           5
	//* 398  797:iload           10
	//* 399  799:icmple          914
					{
						if(iteminfo4 == null)
	//* 400  802:aload           16
	//* 401  804:ifnonnull       810
							break;
	//  402  807:goto            1049
						i = j1;
	//  403  810:iload           7
	//  404  812:istore_1        
						obj1 = ((Object) (iteminfo4));
	//  405  813:aload           16
	//  406  815:astore          13
						f1 = f4;
	//  407  817:fload           4
	//  408  819:fstore_2        
						if(k == iteminfo4.position)
	//* 409  820:iload           5
	//* 410  822:aload           16
	//* 411  824:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 412  827:icmpne          1030
						{
							i = j1;
	//  413  830:iload           7
	//  414  832:istore_1        
							obj1 = ((Object) (iteminfo4));
	//  415  833:aload           16
	//  416  835:astore          13
							f1 = f4;
	//  417  837:fload           4
	//  418  839:fstore_2        
							if(!iteminfo4.scrolling)
	//* 419  840:aload           16
	//* 420  842:getfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>
	//* 421  845:ifne            1030
							{
								mItems.remove(j1);
	//  422  848:aload_0         
	//  423  849:getfield        #188 <Field ArrayList mItems>
	//  424  852:iload           7
	//  425  854:invokevirtual   #778 <Method Object ArrayList.remove(int)>
	//  426  857:pop             
								mAdapter.destroyItem(((ViewGroup) (this)), k, iteminfo4.object);
	//  427  858:aload_0         
	//  428  859:getfield        #233 <Field PagerAdapter mAdapter>
	//  429  862:aload_0         
	//  430  863:iload           5
	//  431  865:aload           16
	//  432  867:getfield        #618 <Field Object ViewPager$ItemInfo.object>
	//  433  870:invokevirtual   #786 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
								if(j1 < mItems.size())
	//* 434  873:iload           7
	//* 435  875:aload_0         
	//* 436  876:getfield        #188 <Field ArrayList mItems>
	//* 437  879:invokevirtual   #256 <Method int ArrayList.size()>
	//* 438  882:icmpge          902
									obj1 = ((Object) ((ItemInfo)mItems.get(j1)));
	//  439  885:aload_0         
	//  440  886:getfield        #188 <Field ArrayList mItems>
	//  441  889:iload           7
	//  442  891:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  443  894:checkcast       #17  <Class ViewPager$ItemInfo>
	//  444  897:astore          13
								else
	//* 445  899:goto            905
									obj1 = null;
	//  446  902:aconst_null     
	//  447  903:astore          13
								i = j1;
	//  448  905:iload           7
	//  449  907:istore_1        
								f1 = f4;
	//  450  908:fload           4
	//  451  910:fstore_2        
							}
						}
					} else
	//* 452  911:goto            1030
					if(iteminfo4 != null && k == iteminfo4.position)
	//* 453  914:aload           16
	//* 454  916:ifnull          976
	//* 455  919:iload           5
	//* 456  921:aload           16
	//* 457  923:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 458  926:icmpne          976
					{
						f1 = f4 + iteminfo4.widthFactor;
	//  459  929:fload           4
	//  460  931:aload           16
	//  461  933:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  462  936:fadd            
	//  463  937:fstore_2        
						i = j1 + 1;
	//  464  938:iload           7
	//  465  940:iconst_1        
	//  466  941:iadd            
	//  467  942:istore_1        
						if(i < mItems.size())
	//* 468  943:iload_1         
	//* 469  944:aload_0         
	//* 470  945:getfield        #188 <Field ArrayList mItems>
	//* 471  948:invokevirtual   #256 <Method int ArrayList.size()>
	//* 472  951:icmpge          970
							obj1 = ((Object) ((ItemInfo)mItems.get(i)));
	//  473  954:aload_0         
	//  474  955:getfield        #188 <Field ArrayList mItems>
	//  475  958:iload_1         
	//  476  959:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  477  962:checkcast       #17  <Class ViewPager$ItemInfo>
	//  478  965:astore          13
						else
	//* 479  967:goto            973
							obj1 = null;
	//  480  970:aconst_null     
	//  481  971:astore          13
					} else
	//* 482  973:goto            1030
					{
						obj1 = ((Object) (addNewItem(k, j1)));
	//  483  976:aload_0         
	//  484  977:iload           5
	//  485  979:iload           7
	//  486  981:invokevirtual   #1210 <Method ViewPager$ItemInfo addNewItem(int, int)>
	//  487  984:astore          13
						i = j1 + 1;
	//  488  986:iload           7
	//  489  988:iconst_1        
	//  490  989:iadd            
	//  491  990:istore_1        
						f1 = f4 + ((ItemInfo) (obj1)).widthFactor;
	//  492  991:fload           4
	//  493  993:aload           13
	//  494  995:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  495  998:fadd            
	//  496  999:fstore_2        
						if(i < mItems.size())
	//* 497 1000:iload_1         
	//* 498 1001:aload_0         
	//* 499 1002:getfield        #188 <Field ArrayList mItems>
	//* 500 1005:invokevirtual   #256 <Method int ArrayList.size()>
	//* 501 1008:icmpge          1027
							obj1 = ((Object) ((ItemInfo)mItems.get(i)));
	//  502 1011:aload_0         
	//  503 1012:getfield        #188 <Field ArrayList mItems>
	//  504 1015:iload_1         
	//  505 1016:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  506 1019:checkcast       #17  <Class ViewPager$ItemInfo>
	//  507 1022:astore          13
						else
	//* 508 1024:goto            1030
							obj1 = null;
	//  509 1027:aconst_null     
	//  510 1028:astore          13
					}
					k++;
	//  511 1030:iload           5
	//  512 1032:iconst_1        
	//  513 1033:iadd            
	//  514 1034:istore          5
					j1 = i;
	//  515 1036:iload_1         
	//  516 1037:istore          7
					iteminfo4 = ((ItemInfo) (obj1));
	//  517 1039:aload           13
	//  518 1041:astore          16
					f4 = f1;
	//  519 1043:fload_2         
	//  520 1044:fstore          4
				}
			}
	//* 521 1046:goto            781
			calculatePageOffsets(iteminfo1, i1, ((ItemInfo) (obj3)));
	//  522 1049:aload_0         
	//  523 1050:aload           15
	//  524 1052:iload           6
	//  525 1054:aload           14
	//  526 1056:invokespecial   #1212 <Method void calculatePageOffsets(ViewPager$ItemInfo, int, ViewPager$ItemInfo)>
		}
		obj3 = ((Object) (mAdapter));
	//  527 1059:aload_0         
	//  528 1060:getfield        #233 <Field PagerAdapter mAdapter>
	//  529 1063:astore          14
		i = mCurItem;
	//  530 1065:aload_0         
	//  531 1066:getfield        #330 <Field int mCurItem>
	//  532 1069:istore_1        
		if(iteminfo1 != null)
	//* 533 1070:aload           15
	//* 534 1072:ifnull          1085
			obj1 = iteminfo1.object;
	//  535 1075:aload           15
	//  536 1077:getfield        #618 <Field Object ViewPager$ItemInfo.object>
	//  537 1080:astore          13
		else
	//* 538 1082:goto            1088
			obj1 = null;
	//  539 1085:aconst_null     
	//  540 1086:astore          13
		((PagerAdapter) (obj3)).setPrimaryItem(((ViewGroup) (this)), i, obj1);
	//  541 1088:aload           14
	//  542 1090:aload_0         
	//  543 1091:iload_1         
	//  544 1092:aload           13
	//  545 1094:invokevirtual   #1215 <Method void PagerAdapter.setPrimaryItem(ViewGroup, int, Object)>
		mAdapter.finishUpdate(((ViewGroup) (this)));
	//  546 1097:aload_0         
	//  547 1098:getfield        #233 <Field PagerAdapter mAdapter>
	//  548 1101:aload_0         
	//  549 1102:invokevirtual   #789 <Method void PagerAdapter.finishUpdate(ViewGroup)>
		int l = getChildCount();
	//  550 1105:aload_0         
	//  551 1106:invokevirtual   #367 <Method int getChildCount()>
	//  552 1109:istore          5
		for(i = 0; i < l; i++)
	//* 553 1111:iconst_0        
	//* 554 1112:istore_1        
	//* 555 1113:iload_1         
	//* 556 1114:iload           5
	//* 557 1116:icmpge          1200
		{
			Object obj4 = ((Object) (getChildAt(i)));
	//  558 1119:aload_0         
	//  559 1120:iload_1         
	//  560 1121:invokevirtual   #373 <Method View getChildAt(int)>
	//  561 1124:astore          14
			LayoutParams layoutparams = (LayoutParams)((View) (obj4)).getLayoutParams();
	//  562 1126:aload           14
	//  563 1128:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  564 1131:checkcast       #20  <Class ViewPager$LayoutParams>
	//  565 1134:astore          13
			layoutparams.childIndex = i;
	//  566 1136:aload           13
	//  567 1138:iload_1         
	//  568 1139:putfield        #932 <Field int ViewPager$LayoutParams.childIndex>
			if(layoutparams.isDecor || layoutparams.widthFactor != 0.0F)
				continue;
	//  569 1142:aload           13
	//  570 1144:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//  571 1147:ifne            1193
	//  572 1150:aload           13
	//  573 1152:getfield        #790 <Field float ViewPager$LayoutParams.widthFactor>
	//  574 1155:fconst_0        
	//  575 1156:fcmpl           
	//  576 1157:ifne            1193
			obj4 = ((Object) (infoForChild(((View) (obj4)))));
	//  577 1160:aload_0         
	//  578 1161:aload           14
	//  579 1163:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//  580 1166:astore          14
			if(obj4 != null)
	//* 581 1168:aload           14
	//* 582 1170:ifnull          1193
			{
				layoutparams.widthFactor = ((ItemInfo) (obj4)).widthFactor;
	//  583 1173:aload           13
	//  584 1175:aload           14
	//  585 1177:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  586 1180:putfield        #790 <Field float ViewPager$LayoutParams.widthFactor>
				layoutparams.position = ((ItemInfo) (obj4)).position;
	//  587 1183:aload           13
	//  588 1185:aload           14
	//  589 1187:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  590 1190:putfield        #1216 <Field int ViewPager$LayoutParams.position>
			}
		}

	//  591 1193:iload_1         
	//  592 1194:iconst_1        
	//  593 1195:iadd            
	//  594 1196:istore_1        
	//* 595 1197:goto            1113
		sortChildDrawingOrder();
	//  596 1200:aload_0         
	//  597 1201:invokespecial   #1175 <Method void sortChildDrawingOrder()>
		if(hasFocus())
	//* 598 1204:aload_0         
	//* 599 1205:invokevirtual   #1219 <Method boolean hasFocus()>
	//* 600 1208:ifeq            1312
		{
			Object obj2 = ((Object) (findFocus()));
	//  601 1211:aload_0         
	//  602 1212:invokevirtual   #663 <Method View findFocus()>
	//  603 1215:astore          13
			if(obj2 != null)
	//* 604 1217:aload           13
	//* 605 1219:ifnull          1233
				obj2 = ((Object) (infoForAnyChild(((View) (obj2)))));
	//  606 1222:aload_0         
	//  607 1223:aload           13
	//  608 1225:invokevirtual   #1221 <Method ViewPager$ItemInfo infoForAnyChild(View)>
	//  609 1228:astore          13
			else
	//* 610 1230:goto            1236
				obj2 = null;
	//  611 1233:aconst_null     
	//  612 1234:astore          13
			if(obj2 == null || ((ItemInfo) (obj2)).position != mCurItem)
	//* 613 1236:aload           13
	//* 614 1238:ifnull          1253
	//* 615 1241:aload           13
	//* 616 1243:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 617 1246:aload_0         
	//* 618 1247:getfield        #330 <Field int mCurItem>
	//* 619 1250:icmpeq          1312
				for(i = 0; i < getChildCount(); i++)
	//* 620 1253:iconst_0        
	//* 621 1254:istore_1        
	//* 622 1255:iload_1         
	//* 623 1256:aload_0         
	//* 624 1257:invokevirtual   #367 <Method int getChildCount()>
	//* 625 1260:icmpge          1312
				{
					View view = getChildAt(i);
	//  626 1263:aload_0         
	//  627 1264:iload_1         
	//  628 1265:invokevirtual   #373 <Method View getChildAt(int)>
	//  629 1268:astore          13
					ItemInfo iteminfo = infoForChild(view);
	//  630 1270:aload_0         
	//  631 1271:aload           13
	//  632 1273:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//  633 1276:astore          14
					if(iteminfo != null && iteminfo.position == mCurItem && view.requestFocus(2))
	//* 634 1278:aload           14
	//* 635 1280:ifnull          1305
	//* 636 1283:aload           14
	//* 637 1285:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 638 1288:aload_0         
	//* 639 1289:getfield        #330 <Field int mCurItem>
	//* 640 1292:icmpne          1305
	//* 641 1295:aload           13
	//* 642 1297:iconst_2        
	//* 643 1298:invokevirtual   #1223 <Method boolean View.requestFocus(int)>
	//* 644 1301:ifeq            1305
						return;
	//  645 1304:return          
				}

	//  646 1305:iload_1         
	//  647 1306:iconst_1        
	//  648 1307:iadd            
	//  649 1308:istore_1        
		}
	//* 650 1309:goto            1255
	//  651 1312:return          
	}

	public void removeOnAdapterChangeListener(OnAdapterChangeListener onadapterchangelistener)
	{
		if(mAdapterChangeListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #625 <Field List mAdapterChangeListeners>
	//*   2    4:ifnull          18
			mAdapterChangeListeners.remove(((Object) (onadapterchangelistener)));
	//    3    7:aload_0         
	//    4    8:getfield        #625 <Field List mAdapterChangeListeners>
	//    5   11:aload_1         
	//    6   12:invokeinterface #1226 <Method boolean List.remove(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	public void removeOnPageChangeListener(OnPageChangeListener onpagechangelistener)
	{
		if(mOnPageChangeListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #348 <Field List mOnPageChangeListeners>
	//*   2    4:ifnull          18
			mOnPageChangeListeners.remove(((Object) (onpagechangelistener)));
	//    3    7:aload_0         
	//    4    8:getfield        #348 <Field List mOnPageChangeListeners>
	//    5   11:aload_1         
	//    6   12:invokeinterface #1226 <Method boolean List.remove(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	public void removeView(View view)
	{
		if(mInLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #647 <Field boolean mInLayout>
	//*   2    4:ifeq            13
		{
			removeViewInLayout(view);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #1231 <Method void removeViewInLayout(View)>
			return;
	//    6   12:return          
		} else
		{
			super.removeView(view);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #1233 <Method void ViewGroup.removeView(View)>
			return;
	//   10   18:return          
		}
	}

	public void setAdapter(PagerAdapter pageradapter)
	{
		if(mAdapter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #233 <Field PagerAdapter mAdapter>
	//*   2    4:ifnull          104
		{
			mAdapter.setViewPagerObserver(((DataSetObserver) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #233 <Field PagerAdapter mAdapter>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #1239 <Method void PagerAdapter.setViewPagerObserver(DataSetObserver)>
			mAdapter.startUpdate(((ViewGroup) (this)));
	//    7   15:aload_0         
	//    8   16:getfield        #233 <Field PagerAdapter mAdapter>
	//    9   19:aload_0         
	//   10   20:invokevirtual   #782 <Method void PagerAdapter.startUpdate(ViewGroup)>
			for(int i = 0; i < mItems.size(); i++)
	//*  11   23:iconst_0        
	//*  12   24:istore_2        
	//*  13   25:iload_2         
	//*  14   26:aload_0         
	//*  15   27:getfield        #188 <Field ArrayList mItems>
	//*  16   30:invokevirtual   #256 <Method int ArrayList.size()>
	//*  17   33:icmpge          74
			{
				ItemInfo iteminfo = (ItemInfo)mItems.get(i);
	//   18   36:aload_0         
	//   19   37:getfield        #188 <Field ArrayList mItems>
	//   20   40:iload_2         
	//   21   41:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   22   44:checkcast       #17  <Class ViewPager$ItemInfo>
	//   23   47:astore          5
				mAdapter.destroyItem(((ViewGroup) (this)), iteminfo.position, iteminfo.object);
	//   24   49:aload_0         
	//   25   50:getfield        #233 <Field PagerAdapter mAdapter>
	//   26   53:aload_0         
	//   27   54:aload           5
	//   28   56:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   29   59:aload           5
	//   30   61:getfield        #618 <Field Object ViewPager$ItemInfo.object>
	//   31   64:invokevirtual   #786 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
			}

	//   32   67:iload_2         
	//   33   68:iconst_1        
	//   34   69:iadd            
	//   35   70:istore_2        
	//*  36   71:goto            25
			mAdapter.finishUpdate(((ViewGroup) (this)));
	//   37   74:aload_0         
	//   38   75:getfield        #233 <Field PagerAdapter mAdapter>
	//   39   78:aload_0         
	//   40   79:invokevirtual   #789 <Method void PagerAdapter.finishUpdate(ViewGroup)>
			mItems.clear();
	//   41   82:aload_0         
	//   42   83:getfield        #188 <Field ArrayList mItems>
	//   43   86:invokevirtual   #571 <Method void ArrayList.clear()>
			removeNonDecorViews();
	//   44   89:aload_0         
	//   45   90:invokespecial   #1241 <Method void removeNonDecorViews()>
			mCurItem = 0;
	//   46   93:aload_0         
	//   47   94:iconst_0        
	//   48   95:putfield        #330 <Field int mCurItem>
			scrollTo(0, 0);
	//   49   98:aload_0         
	//   50   99:iconst_0        
	//   51  100:iconst_0        
	//   52  101:invokevirtual   #296 <Method void scrollTo(int, int)>
		}
		PagerAdapter pageradapter1 = mAdapter;
	//   53  104:aload_0         
	//   54  105:getfield        #233 <Field PagerAdapter mAdapter>
	//   55  108:astore          5
		mAdapter = pageradapter;
	//   56  110:aload_0         
	//   57  111:aload_1         
	//   58  112:putfield        #233 <Field PagerAdapter mAdapter>
		mExpectedAdapterCount = 0;
	//   59  115:aload_0         
	//   60  116:iconst_0        
	//   61  117:putfield        #771 <Field int mExpectedAdapterCount>
		if(mAdapter != null)
	//*  62  120:aload_0         
	//*  63  121:getfield        #233 <Field PagerAdapter mAdapter>
	//*  64  124:ifnull          250
		{
			if(mObserver == null)
	//*  65  127:aload_0         
	//*  66  128:getfield        #1243 <Field ViewPager$PagerObserver mObserver>
	//*  67  131:ifnonnull       146
				mObserver = new PagerObserver();
	//   68  134:aload_0         
	//   69  135:new             #35  <Class ViewPager$PagerObserver>
	//   70  138:dup             
	//   71  139:aload_0         
	//   72  140:invokespecial   #1244 <Method void ViewPager$PagerObserver(ViewPager)>
	//   73  143:putfield        #1243 <Field ViewPager$PagerObserver mObserver>
			mAdapter.setViewPagerObserver(((DataSetObserver) (mObserver)));
	//   74  146:aload_0         
	//   75  147:getfield        #233 <Field PagerAdapter mAdapter>
	//   76  150:aload_0         
	//   77  151:getfield        #1243 <Field ViewPager$PagerObserver mObserver>
	//   78  154:invokevirtual   #1239 <Method void PagerAdapter.setViewPagerObserver(DataSetObserver)>
			mPopulatePending = false;
	//   79  157:aload_0         
	//   80  158:iconst_0        
	//   81  159:putfield        #302 <Field boolean mPopulatePending>
			boolean flag = mFirstLayout;
	//   82  162:aload_0         
	//   83  163:getfield        #214 <Field boolean mFirstLayout>
	//   84  166:istore          4
			mFirstLayout = true;
	//   85  168:aload_0         
	//   86  169:iconst_1        
	//   87  170:putfield        #214 <Field boolean mFirstLayout>
			mExpectedAdapterCount = mAdapter.getCount();
	//   88  173:aload_0         
	//   89  174:aload_0         
	//   90  175:getfield        #233 <Field PagerAdapter mAdapter>
	//   91  178:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//   92  181:putfield        #771 <Field int mExpectedAdapterCount>
			if(mRestoredCurItem >= 0)
	//*  93  184:aload_0         
	//*  94  185:getfield        #198 <Field int mRestoredCurItem>
	//*  95  188:iflt            234
			{
				mAdapter.restoreState(mRestoredAdapterState, mRestoredClassLoader);
	//   96  191:aload_0         
	//   97  192:getfield        #233 <Field PagerAdapter mAdapter>
	//   98  195:aload_0         
	//   99  196:getfield        #200 <Field Parcelable mRestoredAdapterState>
	//  100  199:aload_0         
	//  101  200:getfield        #202 <Field ClassLoader mRestoredClassLoader>
	//  102  203:invokevirtual   #1147 <Method void PagerAdapter.restoreState(Parcelable, ClassLoader)>
				setCurrentItemInternal(mRestoredCurItem, false, true);
	//  103  206:aload_0         
	//  104  207:aload_0         
	//  105  208:getfield        #198 <Field int mRestoredCurItem>
	//  106  211:iconst_0        
	//  107  212:iconst_1        
	//  108  213:invokevirtual   #794 <Method void setCurrentItemInternal(int, boolean, boolean)>
				mRestoredCurItem = -1;
	//  109  216:aload_0         
	//  110  217:iconst_m1       
	//  111  218:putfield        #198 <Field int mRestoredCurItem>
				mRestoredAdapterState = null;
	//  112  221:aload_0         
	//  113  222:aconst_null     
	//  114  223:putfield        #200 <Field Parcelable mRestoredAdapterState>
				mRestoredClassLoader = null;
	//  115  226:aload_0         
	//  116  227:aconst_null     
	//  117  228:putfield        #202 <Field ClassLoader mRestoredClassLoader>
			} else
	//* 118  231:goto            250
			if(!flag)
	//* 119  234:iload           4
	//* 120  236:ifne            246
				populate();
	//  121  239:aload_0         
	//  122  240:invokevirtual   #1065 <Method void populate()>
			else
	//* 123  243:goto            250
				requestLayout();
	//  124  246:aload_0         
	//  125  247:invokevirtual   #797 <Method void requestLayout()>
		}
		if(mAdapterChangeListeners != null && !mAdapterChangeListeners.isEmpty())
	//* 126  250:aload_0         
	//* 127  251:getfield        #625 <Field List mAdapterChangeListeners>
	//* 128  254:ifnull          315
	//* 129  257:aload_0         
	//* 130  258:getfield        #625 <Field List mAdapterChangeListeners>
	//* 131  261:invokeinterface #1245 <Method boolean List.isEmpty()>
	//* 132  266:ifne            315
		{
			int j = 0;
	//  133  269:iconst_0        
	//  134  270:istore_2        
			for(int k = mAdapterChangeListeners.size(); j < k; j++)
	//* 135  271:aload_0         
	//* 136  272:getfield        #625 <Field List mAdapterChangeListeners>
	//* 137  275:invokeinterface #351 <Method int List.size()>
	//* 138  280:istore_3        
	//* 139  281:iload_2         
	//* 140  282:iload_3         
	//* 141  283:icmpge          315
				((OnAdapterChangeListener)mAdapterChangeListeners.get(j)).onAdapterChanged(this, pageradapter1, pageradapter);
	//  142  286:aload_0         
	//  143  287:getfield        #625 <Field List mAdapterChangeListeners>
	//  144  290:iload_2         
	//  145  291:invokeinterface #352 <Method Object List.get(int)>
	//  146  296:checkcast       #26  <Class ViewPager$OnAdapterChangeListener>
	//  147  299:aload_0         
	//  148  300:aload           5
	//  149  302:aload_1         
	//  150  303:invokeinterface #1249 <Method void ViewPager$OnAdapterChangeListener.onAdapterChanged(ViewPager, PagerAdapter, PagerAdapter)>

	//  151  308:iload_2         
	//  152  309:iconst_1        
	//  153  310:iadd            
	//  154  311:istore_2        
		}
	//* 155  312:goto            281
	//  156  315:return          
	}

	public void setCurrentItem(int i)
	{
		mPopulatePending = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #302 <Field boolean mPopulatePending>
		boolean flag;
		if(!mFirstLayout)
	//*   3    5:aload_0         
	//*   4    6:getfield        #214 <Field boolean mFirstLayout>
	//*   5    9:ifne            17
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
		else
	//*   8   14:goto            19
			flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		setCurrentItemInternal(i, flag, false);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:iload_2         
	//   14   22:iconst_0        
	//   15   23:invokevirtual   #794 <Method void setCurrentItemInternal(int, boolean, boolean)>
	//   16   26:return          
	}

	public void setCurrentItem(int i, boolean flag)
	{
		mPopulatePending = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #302 <Field boolean mPopulatePending>
		setCurrentItemInternal(i, flag, false);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #794 <Method void setCurrentItemInternal(int, boolean, boolean)>
	//    8   12:return          
	}

	void setCurrentItemInternal(int i, boolean flag, boolean flag1)
	{
		setCurrentItemInternal(i, flag, flag1, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #899 <Method void setCurrentItemInternal(int, boolean, boolean, int)>
	//    6    8:return          
	}

	void setCurrentItemInternal(int i, boolean flag, boolean flag1, int j)
	{
		if(mAdapter == null || mAdapter.getCount() <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #233 <Field PagerAdapter mAdapter>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #233 <Field PagerAdapter mAdapter>
	//*   5   11:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*   6   14:ifgt            23
		{
			setScrollingCacheEnabled(false);
	//    7   17:aload_0         
	//    8   18:iconst_0        
	//    9   19:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
			return;
	//   10   22:return          
		}
		if(!flag1 && mCurItem == i && mItems.size() != 0)
	//*  11   23:iload_3         
	//*  12   24:ifne            51
	//*  13   27:aload_0         
	//*  14   28:getfield        #330 <Field int mCurItem>
	//*  15   31:iload_1         
	//*  16   32:icmpne          51
	//*  17   35:aload_0         
	//*  18   36:getfield        #188 <Field ArrayList mItems>
	//*  19   39:invokevirtual   #256 <Method int ArrayList.size()>
	//*  20   42:ifeq            51
		{
			setScrollingCacheEnabled(false);
	//   21   45:aload_0         
	//   22   46:iconst_0        
	//   23   47:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
			return;
	//   24   50:return          
		}
		int k;
		if(i < 0)
	//*  25   51:iload_1         
	//*  26   52:ifge            61
		{
			k = 0;
	//   27   55:iconst_0        
	//   28   56:istore          5
		} else
	//*  29   58:goto            86
		{
			k = i;
	//   30   61:iload_1         
	//   31   62:istore          5
			if(i >= mAdapter.getCount())
	//*  32   64:iload_1         
	//*  33   65:aload_0         
	//*  34   66:getfield        #233 <Field PagerAdapter mAdapter>
	//*  35   69:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*  36   72:icmplt          86
				k = mAdapter.getCount() - 1;
	//   37   75:aload_0         
	//   38   76:getfield        #233 <Field PagerAdapter mAdapter>
	//   39   79:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//   40   82:iconst_1        
	//   41   83:isub            
	//   42   84:istore          5
		}
		i = mOffscreenPageLimit;
	//   43   86:aload_0         
	//   44   87:getfield        #210 <Field int mOffscreenPageLimit>
	//   45   90:istore_1        
		if(k > mCurItem + i || k < mCurItem - i)
	//*  46   91:iload           5
	//*  47   93:aload_0         
	//*  48   94:getfield        #330 <Field int mCurItem>
	//*  49   97:iload_1         
	//*  50   98:iadd            
	//*  51   99:icmpgt          113
	//*  52  102:iload           5
	//*  53  104:aload_0         
	//*  54  105:getfield        #330 <Field int mCurItem>
	//*  55  108:iload_1         
	//*  56  109:isub            
	//*  57  110:icmpge          148
			for(i = 0; i < mItems.size(); i++)
	//*  58  113:iconst_0        
	//*  59  114:istore_1        
	//*  60  115:iload_1         
	//*  61  116:aload_0         
	//*  62  117:getfield        #188 <Field ArrayList mItems>
	//*  63  120:invokevirtual   #256 <Method int ArrayList.size()>
	//*  64  123:icmpge          148
				((ItemInfo)mItems.get(i)).scrolling = true;
	//   65  126:aload_0         
	//   66  127:getfield        #188 <Field ArrayList mItems>
	//   67  130:iload_1         
	//   68  131:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   69  134:checkcast       #17  <Class ViewPager$ItemInfo>
	//   70  137:iconst_1        
	//   71  138:putfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>

	//   72  141:iload_1         
	//   73  142:iconst_1        
	//   74  143:iadd            
	//   75  144:istore_1        
	//*  76  145:goto            115
		if(mCurItem != k)
	//*  77  148:aload_0         
	//*  78  149:getfield        #330 <Field int mCurItem>
	//*  79  152:iload           5
	//*  80  154:icmpeq          162
			flag1 = true;
	//   81  157:iconst_1        
	//   82  158:istore_3        
		else
	//*  83  159:goto            164
			flag1 = false;
	//   84  162:iconst_0        
	//   85  163:istore_3        
		if(mFirstLayout)
	//*  86  164:aload_0         
	//*  87  165:getfield        #214 <Field boolean mFirstLayout>
	//*  88  168:ifeq            192
		{
			mCurItem = k;
	//   89  171:aload_0         
	//   90  172:iload           5
	//   91  174:putfield        #330 <Field int mCurItem>
			if(flag1)
	//*  92  177:iload_3         
	//*  93  178:ifeq            187
				dispatchOnPageSelected(k);
	//   94  181:aload_0         
	//   95  182:iload           5
	//   96  184:invokespecial   #563 <Method void dispatchOnPageSelected(int)>
			requestLayout();
	//   97  187:aload_0         
	//   98  188:invokevirtual   #797 <Method void requestLayout()>
			return;
	//   99  191:return          
		} else
		{
			populate(k);
	//  100  192:aload_0         
	//  101  193:iload           5
	//  102  195:invokevirtual   #1171 <Method void populate(int)>
			scrollToItem(k, flag, j, flag1);
	//  103  198:aload_0         
	//  104  199:iload           5
	//  105  201:iload_2         
	//  106  202:iload           4
	//  107  204:iload_3         
	//  108  205:invokespecial   #1092 <Method void scrollToItem(int, boolean, int, boolean)>
			return;
	//  109  208:return          
		}
	}

	OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onpagechangelistener)
	{
		OnPageChangeListener onpagechangelistener1 = mInternalPageChangeListener;
	//    0    0:aload_0         
	//    1    1:getfield        #354 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//    2    4:astore_2        
		mInternalPageChangeListener = onpagechangelistener;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #354 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
		return onpagechangelistener1;
	//    6   10:aload_2         
	//    7   11:areturn         
	}

	public void setOffscreenPageLimit(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i < 1)
	//*   2    2:iload_1         
	//*   3    3:iconst_1        
	//*   4    4:icmpge          45
		{
			Log.w("ViewPager", (new StringBuilder()).append("Requested offscreen page limit ").append(i).append(" too small; defaulting to ").append(1).toString());
	//    5    7:ldc1            #80  <String "ViewPager">
	//    6    9:new             #666 <Class StringBuilder>
	//    7   12:dup             
	//    8   13:invokespecial   #667 <Method void StringBuilder()>
	//    9   16:ldc2            #1254 <String "Requested offscreen page limit ">
	//   10   19:invokevirtual   #675 <Method StringBuilder StringBuilder.append(String)>
	//   11   22:iload_1         
	//   12   23:invokevirtual   #1197 <Method StringBuilder StringBuilder.append(int)>
	//   13   26:ldc2            #1256 <String " too small; defaulting to ">
	//   14   29:invokevirtual   #675 <Method StringBuilder StringBuilder.append(String)>
	//   15   32:iconst_1        
	//   16   33:invokevirtual   #1197 <Method StringBuilder StringBuilder.append(int)>
	//   17   36:invokevirtual   #682 <Method String StringBuilder.toString()>
	//   18   39:invokestatic    #1259 <Method int Log.w(String, String)>
	//   19   42:pop             
			j = 1;
	//   20   43:iconst_1        
	//   21   44:istore_2        
		}
		if(j != mOffscreenPageLimit)
	//*  22   45:iload_2         
	//*  23   46:aload_0         
	//*  24   47:getfield        #210 <Field int mOffscreenPageLimit>
	//*  25   50:icmpeq          62
		{
			mOffscreenPageLimit = j;
	//   26   53:aload_0         
	//   27   54:iload_2         
	//   28   55:putfield        #210 <Field int mOffscreenPageLimit>
			populate();
	//   29   58:aload_0         
	//   30   59:invokevirtual   #1065 <Method void populate()>
		}
	//   31   62:return          
	}

	public void setOnPageChangeListener(OnPageChangeListener onpagechangelistener)
	{
		mOnPageChangeListener = onpagechangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #343 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//    3    5:return          
	}

	public void setPageMargin(int i)
	{
		int j = mPageMargin;
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field int mPageMargin>
	//    2    4:istore_2        
		mPageMargin = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #244 <Field int mPageMargin>
		int k = getWidth();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #464 <Method int getWidth()>
	//    8   14:istore_3        
		recomputeScrollPosition(k, k, i, j);
	//    9   15:aload_0         
	//   10   16:iload_3         
	//   11   17:iload_3         
	//   12   18:iload_1         
	//   13   19:iload_2         
	//   14   20:invokespecial   #1161 <Method void recomputeScrollPosition(int, int, int, int)>
		requestLayout();
	//   15   23:aload_0         
	//   16   24:invokevirtual   #797 <Method void requestLayout()>
	//   17   27:return          
	}

	public void setPageMarginDrawable(int i)
	{
		setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #923 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #1271 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #1274 <Method void setPageMarginDrawable(Drawable)>
	//    6   12:return          
	}

	public void setPageMarginDrawable(Drawable drawable)
	{
		mMarginDrawable = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #869 <Field Drawable mMarginDrawable>
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			refreshDrawableState();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #1277 <Method void refreshDrawableState()>
		boolean flag;
		if(drawable == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       22
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:goto            24
			flag = false;
	//   12   22:iconst_0        
	//   13   23:istore_2        
		setWillNotDraw(flag);
	//   14   24:aload_0         
	//   15   25:iload_2         
	//   16   26:invokevirtual   #942 <Method void setWillNotDraw(boolean)>
		invalidate();
	//   17   29:aload_0         
	//   18   30:invokevirtual   #1280 <Method void invalidate()>
	//   19   33:return          
	}

	public void setPageTransformer(boolean flag, PageTransformer pagetransformer)
	{
		setPageTransformer(flag, pagetransformer, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_2        
	//    4    4:invokevirtual   #1285 <Method void setPageTransformer(boolean, ViewPager$PageTransformer, int)>
	//    5    7:return          
	}

	public void setPageTransformer(boolean flag, PageTransformer pagetransformer, int i)
	{
		boolean flag2;
		if(pagetransformer != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          10
			flag2 = true;
	//    2    4:iconst_1        
	//    3    5:istore          6
		else
	//*   4    7:goto            13
			flag2 = false;
	//    5   10:iconst_0        
	//    6   11:istore          6
		boolean flag3;
		if(mPageTransformer != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #1120 <Field ViewPager$PageTransformer mPageTransformer>
	//*   9   17:ifnull          26
			flag3 = true;
	//   10   20:iconst_1        
	//   11   21:istore          7
		else
	//*  12   23:goto            29
			flag3 = false;
	//   13   26:iconst_0        
	//   14   27:istore          7
		boolean flag1;
		if(flag2 != flag3)
	//*  15   29:iload           6
	//*  16   31:iload           7
	//*  17   33:icmpeq          42
			flag1 = true;
	//   18   36:iconst_1        
	//   19   37:istore          4
		else
	//*  20   39:goto            45
			flag1 = false;
	//   21   42:iconst_0        
	//   22   43:istore          4
		mPageTransformer = pagetransformer;
	//   23   45:aload_0         
	//   24   46:aload_2         
	//   25   47:putfield        #1120 <Field ViewPager$PageTransformer mPageTransformer>
		setChildrenDrawingOrderEnabled(flag2);
	//   26   50:aload_0         
	//   27   51:iload           6
	//   28   53:invokevirtual   #1288 <Method void setChildrenDrawingOrderEnabled(boolean)>
		if(flag2)
	//*  29   56:iload           6
	//*  30   58:ifeq            88
		{
			int j;
			if(flag)
	//*  31   61:iload_1         
	//*  32   62:ifeq            71
				j = 2;
	//   33   65:iconst_2        
	//   34   66:istore          5
			else
	//*  35   68:goto            74
				j = 1;
	//   36   71:iconst_1        
	//   37   72:istore          5
			mDrawingOrder = j;
	//   38   74:aload_0         
	//   39   75:iload           5
	//   40   77:putfield        #568 <Field int mDrawingOrder>
			mPageTransformerLayerType = i;
	//   41   80:aload_0         
	//   42   81:iload_3         
	//   43   82:putfield        #369 <Field int mPageTransformerLayerType>
		} else
	//*  44   85:goto            93
		{
			mDrawingOrder = 0;
	//   45   88:aload_0         
	//   46   89:iconst_0        
	//   47   90:putfield        #568 <Field int mDrawingOrder>
		}
		if(flag1)
	//*  48   93:iload           4
	//*  49   95:ifeq            102
			populate();
	//   50   98:aload_0         
	//   51   99:invokevirtual   #1065 <Method void populate()>
	//   52  102:return          
	}

	void setScrollState(int i)
	{
		if(mScrollState == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #223 <Field int mScrollState>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mScrollState = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #223 <Field int mScrollState>
		if(mPageTransformer != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #1120 <Field ViewPager$PageTransformer mPageTransformer>
	//*  10   18:ifnull          37
		{
			boolean flag;
			if(i != 0)
	//*  11   21:iload_1         
	//*  12   22:ifeq            30
				flag = true;
	//   13   25:iconst_1        
	//   14   26:istore_2        
			else
	//*  15   27:goto            32
				flag = false;
	//   16   30:iconst_0        
	//   17   31:istore_2        
			enableLayers(flag);
	//   18   32:aload_0         
	//   19   33:iload_2         
	//   20   34:invokespecial   #1290 <Method void enableLayers(boolean)>
		}
		dispatchOnScrollStateChanged(i);
	//   21   37:aload_0         
	//   22   38:iload_1         
	//   23   39:invokespecial   #1292 <Method void dispatchOnScrollStateChanged(int)>
	//   24   42:return          
	}

	void smoothScrollTo(int i, int j)
	{
		smoothScrollTo(i, j, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #561 <Method void smoothScrollTo(int, int, int)>
	//    5    7:return          
	}

	void smoothScrollTo(int i, int j, int k)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #367 <Method int getChildCount()>
	//*   2    4:ifne            13
		{
			setScrollingCacheEnabled(false);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
			return;
	//    6   12:return          
		}
		boolean flag;
		if(mScroller != null && !mScroller.isFinished())
	//*   7   13:aload_0         
	//*   8   14:getfield        #271 <Field Scroller mScroller>
	//*   9   17:ifnull          36
	//*  10   20:aload_0         
	//*  11   21:getfield        #271 <Field Scroller mScroller>
	//*  12   24:invokevirtual   #277 <Method boolean Scroller.isFinished()>
	//*  13   27:ifne            36
			flag = true;
	//   14   30:iconst_1        
	//   15   31:istore          7
		else
	//*  16   33:goto            39
			flag = false;
	//   17   36:iconst_0        
	//   18   37:istore          7
		int l;
		if(flag)
	//*  19   39:iload           7
	//*  20   41:ifeq            87
		{
			if(mIsScrollStarted)
	//*  21   44:aload_0         
	//*  22   45:getfield        #761 <Field boolean mIsScrollStarted>
	//*  23   48:ifeq            63
				l = mScroller.getCurrX();
	//   24   51:aload_0         
	//   25   52:getfield        #271 <Field Scroller mScroller>
	//   26   55:invokevirtual   #289 <Method int Scroller.getCurrX()>
	//   27   58:istore          7
			else
	//*  28   60:goto            72
				l = mScroller.getStartX();
	//   29   63:aload_0         
	//   30   64:getfield        #271 <Field Scroller mScroller>
	//   31   67:invokevirtual   #1295 <Method int Scroller.getStartX()>
	//   32   70:istore          7
			mScroller.abortAnimation();
	//   33   72:aload_0         
	//   34   73:getfield        #271 <Field Scroller mScroller>
	//   35   76:invokevirtual   #280 <Method void Scroller.abortAnimation()>
			setScrollingCacheEnabled(false);
	//   36   79:aload_0         
	//   37   80:iconst_0        
	//   38   81:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
		} else
	//*  39   84:goto            93
		{
			l = getScrollX();
	//   40   87:aload_0         
	//   41   88:invokevirtual   #283 <Method int getScrollX()>
	//   42   91:istore          7
		}
		int i1 = getScrollY();
	//   43   93:aload_0         
	//   44   94:invokevirtual   #286 <Method int getScrollY()>
	//   45   97:istore          8
		int j1 = i - l;
	//   46   99:iload_1         
	//   47  100:iload           7
	//   48  102:isub            
	//   49  103:istore          9
		j -= i1;
	//   50  105:iload_2         
	//   51  106:iload           8
	//   52  108:isub            
	//   53  109:istore_2        
		if(j1 == 0 && j == 0)
	//*  54  110:iload           9
	//*  55  112:ifne            134
	//*  56  115:iload_2         
	//*  57  116:ifne            134
		{
			completeScroll(false);
	//   58  119:aload_0         
	//   59  120:iconst_0        
	//   60  121:invokespecial   #528 <Method void completeScroll(boolean)>
			populate();
	//   61  124:aload_0         
	//   62  125:invokevirtual   #1065 <Method void populate()>
			setScrollState(0);
	//   63  128:aload_0         
	//   64  129:iconst_0        
	//   65  130:invokevirtual   #723 <Method void setScrollState(int)>
			return;
	//   66  133:return          
		}
		setScrollingCacheEnabled(true);
	//   67  134:aload_0         
	//   68  135:iconst_1        
	//   69  136:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
		setScrollState(2);
	//   70  139:aload_0         
	//   71  140:iconst_2        
	//   72  141:invokevirtual   #723 <Method void setScrollState(int)>
		i = getClientWidth();
	//   73  144:aload_0         
	//   74  145:invokespecial   #242 <Method int getClientWidth()>
	//   75  148:istore_1        
		int k1 = i / 2;
	//   76  149:iload_1         
	//   77  150:iconst_2        
	//   78  151:idiv            
	//   79  152:istore          10
		float f4 = Math.min(1.0F, ((float)Math.abs(j1) * 1.0F) / (float)i);
	//   80  154:fconst_1        
	//   81  155:iload           9
	//   82  157:invokestatic    #324 <Method int Math.abs(int)>
	//   83  160:i2f             
	//   84  161:fconst_1        
	//   85  162:fmul            
	//   86  163:iload_1         
	//   87  164:i2f             
	//   88  165:fdiv            
	//   89  166:invokestatic    #526 <Method float Math.min(float, float)>
	//   90  169:fstore          6
		float f = k1;
	//   91  171:iload           10
	//   92  173:i2f             
	//   93  174:fstore          4
		float f2 = k1;
	//   94  176:iload           10
	//   95  178:i2f             
	//   96  179:fstore          5
		f4 = distanceInfluenceForSnapDuration(f4);
	//   97  181:aload_0         
	//   98  182:fload           6
	//   99  184:invokevirtual   #1297 <Method float distanceInfluenceForSnapDuration(float)>
	//  100  187:fstore          6
		k = Math.abs(k);
	//  101  189:iload_3         
	//  102  190:invokestatic    #324 <Method int Math.abs(int)>
	//  103  193:istore_3        
		if(k > 0)
	//* 104  194:iload_3         
	//* 105  195:ifle            225
		{
			i = Math.round(Math.abs((f + f2 * f4) / (float)k) * 1000F) * 4;
	//  106  198:fload           4
	//  107  200:fload           5
	//  108  202:fload           6
	//  109  204:fmul            
	//  110  205:fadd            
	//  111  206:iload_3         
	//  112  207:i2f             
	//  113  208:fdiv            
	//  114  209:invokestatic    #501 <Method float Math.abs(float)>
	//  115  212:ldc2            #1298 <Float 1000F>
	//  116  215:fmul            
	//  117  216:invokestatic    #1025 <Method int Math.round(float)>
	//  118  219:iconst_4        
	//  119  220:imul            
	//  120  221:istore_1        
		} else
	//* 121  222:goto            268
		{
			float f1 = i;
	//  122  225:iload_1         
	//  123  226:i2f             
	//  124  227:fstore          4
			float f3 = mAdapter.getPageWidth(mCurItem);
	//  125  229:aload_0         
	//  126  230:getfield        #233 <Field PagerAdapter mAdapter>
	//  127  233:aload_0         
	//  128  234:getfield        #330 <Field int mCurItem>
	//  129  237:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//  130  240:fstore          5
			i = (int)((1.0F + (float)Math.abs(j1) / ((float)mPageMargin + f1 * f3)) * 100F);
	//  131  242:fconst_1        
	//  132  243:iload           9
	//  133  245:invokestatic    #324 <Method int Math.abs(int)>
	//  134  248:i2f             
	//  135  249:aload_0         
	//  136  250:getfield        #244 <Field int mPageMargin>
	//  137  253:i2f             
	//  138  254:fload           4
	//  139  256:fload           5
	//  140  258:fmul            
	//  141  259:fadd            
	//  142  260:fdiv            
	//  143  261:fadd            
	//  144  262:ldc2            #1299 <Float 100F>
	//  145  265:fmul            
	//  146  266:f2i             
	//  147  267:istore_1        
		}
		i = Math.min(i, 600);
	//  148  268:iload_1         
	//  149  269:sipush          600
	//  150  272:invokestatic    #336 <Method int Math.min(int, int)>
	//  151  275:istore_1        
		mIsScrollStarted = false;
	//  152  276:aload_0         
	//  153  277:iconst_0        
	//  154  278:putfield        #761 <Field boolean mIsScrollStarted>
		mScroller.startScroll(l, i1, j1, j, i);
	//  155  281:aload_0         
	//  156  282:getfield        #271 <Field Scroller mScroller>
	//  157  285:iload           7
	//  158  287:iload           8
	//  159  289:iload           9
	//  160  291:iload_2         
	//  161  292:iload_1         
	//  162  293:invokevirtual   #1303 <Method void Scroller.startScroll(int, int, int, int, int)>
		ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  163  296:aload_0         
	//  164  297:invokestatic    #768 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//  165  300:return          
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == mMarginDrawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1307 <Method boolean ViewGroup.verifyDrawable(Drawable)>
	//    3    5:ifne            16
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #869 <Field Drawable mMarginDrawable>
	//    7   13:if_acmpne       18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private static final int CLOSE_ENOUGH = 2;
	private static final Comparator COMPARATOR = new Comparator() {

		public int compare(ItemInfo iteminfo, ItemInfo iteminfo1)
		{
			return iteminfo.position - iteminfo1.position;
		//    0    0:aload_1         
		//    1    1:getfield        #22  <Field int ViewPager$ItemInfo.position>
		//    2    4:aload_2         
		//    3    5:getfield        #22  <Field int ViewPager$ItemInfo.position>
		//    4    8:isub            
		//    5    9:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((ItemInfo)obj, (ItemInfo)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class ViewPager$ItemInfo>
		//    3    5:aload_2         
		//    4    6:checkcast       #18  <Class ViewPager$ItemInfo>
		//    5    9:invokevirtual   #25  <Method int compare(ViewPager$ItemInfo, ViewPager$ItemInfo)>
		//    6   12:ireturn         
		}

	}
;
	private static final boolean DEBUG = false;
	private static final int DEFAULT_GUTTER_SIZE = 16;
	private static final int DEFAULT_OFFSCREEN_PAGES = 1;
	private static final int DRAW_ORDER_DEFAULT = 0;
	private static final int DRAW_ORDER_FORWARD = 1;
	private static final int DRAW_ORDER_REVERSE = 2;
	private static final int INVALID_POINTER = -1;
	static final int LAYOUT_ATTRS[] = {
		0x10100b3
	};
	private static final int MAX_SETTLE_DURATION = 600;
	private static final int MIN_DISTANCE_FOR_FLING = 25;
	private static final int MIN_FLING_VELOCITY = 400;
	public static final int SCROLL_STATE_DRAGGING = 1;
	public static final int SCROLL_STATE_IDLE = 0;
	public static final int SCROLL_STATE_SETTLING = 2;
	private static final String TAG = "ViewPager";
	private static final boolean USE_CACHE = false;
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
	private static final ViewPositionComparator sPositionComparator = new ViewPositionComparator();
	private int mActivePointerId;
	PagerAdapter mAdapter;
	private List mAdapterChangeListeners;
	private int mBottomPageBounds;
	private boolean mCalledSuper;
	private int mChildHeightMeasureSpec;
	private int mChildWidthMeasureSpec;
	private int mCloseEnough;
	int mCurItem;
	private int mDecorChildCount;
	private int mDefaultGutterSize;
	private int mDrawingOrder;
	private ArrayList mDrawingOrderedChildren;
	private final Runnable mEndScrollRunnable;
	private int mExpectedAdapterCount;
	private long mFakeDragBeginTime;
	private boolean mFakeDragging;
	private boolean mFirstLayout;
	private float mFirstOffset;
	private int mFlingDistance;
	private int mGutterSize;
	private boolean mInLayout;
	private float mInitialMotionX;
	private float mInitialMotionY;
	private OnPageChangeListener mInternalPageChangeListener;
	private boolean mIsBeingDragged;
	private boolean mIsScrollStarted;
	private boolean mIsUnableToDrag;
	private final ArrayList mItems;
	private float mLastMotionX;
	private float mLastMotionY;
	private float mLastOffset;
	private EdgeEffect mLeftEdge;
	private Drawable mMarginDrawable;
	private int mMaximumVelocity;
	private int mMinimumVelocity;
	private boolean mNeedCalculatePageOffsets;
	private PagerObserver mObserver;
	private int mOffscreenPageLimit;
	private OnPageChangeListener mOnPageChangeListener;
	private List mOnPageChangeListeners;
	private int mPageMargin;
	private PageTransformer mPageTransformer;
	private int mPageTransformerLayerType;
	private boolean mPopulatePending;
	private Parcelable mRestoredAdapterState;
	private ClassLoader mRestoredClassLoader;
	private int mRestoredCurItem;
	private EdgeEffect mRightEdge;
	private int mScrollState;
	public Scroller mScroller;
	private boolean mScrollingCacheEnabled;
	private final ItemInfo mTempItem;
	private final Rect mTempRect;
	private int mTopPageBounds;
	private int mTouchSlop;
	private VelocityTracker mVelocityTracker;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #166 <Int 0x10100b3>
	//    5    7:iastore         
	//    6    8:putstatic       #168 <Field int[] LAYOUT_ATTRS>
	//    7   11:new             #6   <Class ViewPager$1>
	//    8   14:dup             
	//    9   15:invokespecial   #171 <Method void ViewPager$1()>
	//   10   18:putstatic       #173 <Field Comparator COMPARATOR>
	//   11   21:new             #8   <Class ViewPager$2>
	//   12   24:dup             
	//   13   25:invokespecial   #174 <Method void ViewPager$2()>
	//   14   28:putstatic       #176 <Field Interpolator sInterpolator>
	//   15   31:new             #46  <Class ViewPager$ViewPositionComparator>
	//   16   34:dup             
	//   17   35:invokespecial   #177 <Method void ViewPager$ViewPositionComparator()>
	//   18   38:putstatic       #179 <Field ViewPager$ViewPositionComparator sPositionComparator>
	//*  19   41:return          
	}
}
