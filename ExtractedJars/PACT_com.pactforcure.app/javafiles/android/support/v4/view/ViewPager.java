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
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
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
			accessibilityevent.setScrollable(canScroll());
		//    8   15:aload_2         
		//    9   16:aload_0         
		//   10   17:invokespecial   #47  <Method boolean canScroll()>
		//   11   20:invokevirtual   #51  <Method void AccessibilityEvent.setScrollable(boolean)>
			if(accessibilityevent.getEventType() == 4096 && mAdapter != null)
		//*  12   23:aload_2         
		//*  13   24:invokevirtual   #54  <Method int AccessibilityEvent.getEventType()>
		//*  14   27:sipush          4096
		//*  15   30:icmpne          79
		//*  16   33:aload_0         
		//*  17   34:getfield        #13  <Field ViewPager this$0>
		//*  18   37:getfield        #23  <Field PagerAdapter ViewPager.mAdapter>
		//*  19   40:ifnull          79
			{
				accessibilityevent.setItemCount(mAdapter.getCount());
		//   20   43:aload_2         
		//   21   44:aload_0         
		//   22   45:getfield        #13  <Field ViewPager this$0>
		//   23   48:getfield        #23  <Field PagerAdapter ViewPager.mAdapter>
		//   24   51:invokevirtual   #29  <Method int PagerAdapter.getCount()>
		//   25   54:invokevirtual   #58  <Method void AccessibilityEvent.setItemCount(int)>
				accessibilityevent.setFromIndex(mCurItem);
		//   26   57:aload_2         
		//   27   58:aload_0         
		//   28   59:getfield        #13  <Field ViewPager this$0>
		//   29   62:getfield        #62  <Field int ViewPager.mCurItem>
		//   30   65:invokevirtual   #65  <Method void AccessibilityEvent.setFromIndex(int)>
				accessibilityevent.setToIndex(mCurItem);
		//   31   68:aload_2         
		//   32   69:aload_0         
		//   33   70:getfield        #13  <Field ViewPager this$0>
		//   34   73:getfield        #62  <Field int ViewPager.mCurItem>
		//   35   76:invokevirtual   #68  <Method void AccessibilityEvent.setToIndex(int)>
			}
		//   36   79:return          
		}

		public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
		{
			super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #72  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
			accessibilitynodeinfocompat.setClassName(((CharSequence) (((Class) (android/support/v4/view/ViewPager)).getName())));
		//    4    6:aload_2         
		//    5    7:ldc1            #6   <Class ViewPager>
		//    6    9:invokevirtual   #39  <Method String Class.getName()>
		//    7   12:invokevirtual   #75  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
			accessibilitynodeinfocompat.setScrollable(canScroll());
		//    8   15:aload_2         
		//    9   16:aload_0         
		//   10   17:invokespecial   #47  <Method boolean canScroll()>
		//   11   20:invokevirtual   #76  <Method void AccessibilityNodeInfoCompat.setScrollable(boolean)>
			if(canScrollHorizontally(1))
		//*  12   23:aload_0         
		//*  13   24:getfield        #13  <Field ViewPager this$0>
		//*  14   27:iconst_1        
		//*  15   28:invokevirtual   #80  <Method boolean ViewPager.canScrollHorizontally(int)>
		//*  16   31:ifeq            41
				accessibilitynodeinfocompat.addAction(4096);
		//   17   34:aload_2         
		//   18   35:sipush          4096
		//   19   38:invokevirtual   #83  <Method void AccessibilityNodeInfoCompat.addAction(int)>
			if(canScrollHorizontally(-1))
		//*  20   41:aload_0         
		//*  21   42:getfield        #13  <Field ViewPager this$0>
		//*  22   45:iconst_m1       
		//*  23   46:invokevirtual   #80  <Method boolean ViewPager.canScrollHorizontally(int)>
		//*  24   49:ifeq            59
				accessibilitynodeinfocompat.addAction(8192);
		//   25   52:aload_2         
		//   26   53:sipush          8192
		//   27   56:invokevirtual   #83  <Method void AccessibilityNodeInfoCompat.addAction(int)>
		//   28   59:return          
		}

		public boolean performAccessibilityAction(View view, int i, Bundle bundle)
		{
			if(super.performAccessibilityAction(view, i, bundle))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:iload_2         
		//*   3    3:aload_3         
		//*   4    4:invokespecial   #87  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
		//*   5    7:ifeq            12
				return true;
		//    6   10:iconst_1        
		//    7   11:ireturn         
			switch(i)
		//*   8   12:iload_2         
			{
		//*   9   13:lookupswitch    2: default 40
		//		               4096: 42
		//		               8192: 73
			default:
				return false;
		//   10   40:iconst_0        
		//   11   41:ireturn         

			case 4096: 
				if(canScrollHorizontally(1))
		//*  12   42:aload_0         
		//*  13   43:getfield        #13  <Field ViewPager this$0>
		//*  14   46:iconst_1        
		//*  15   47:invokevirtual   #80  <Method boolean ViewPager.canScrollHorizontally(int)>
		//*  16   50:ifeq            71
				{
					setCurrentItem(mCurItem + 1);
		//   17   53:aload_0         
		//   18   54:getfield        #13  <Field ViewPager this$0>
		//   19   57:aload_0         
		//   20   58:getfield        #13  <Field ViewPager this$0>
		//   21   61:getfield        #62  <Field int ViewPager.mCurItem>
		//   22   64:iconst_1        
		//   23   65:iadd            
		//   24   66:invokevirtual   #90  <Method void ViewPager.setCurrentItem(int)>
					return true;
		//   25   69:iconst_1        
		//   26   70:ireturn         
				} else
				{
					return false;
		//   27   71:iconst_0        
		//   28   72:ireturn         
				}

			case 8192: 
				break;
			}
			if(canScrollHorizontally(-1))
		//*  29   73:aload_0         
		//*  30   74:getfield        #13  <Field ViewPager this$0>
		//*  31   77:iconst_m1       
		//*  32   78:invokevirtual   #80  <Method boolean ViewPager.canScrollHorizontally(int)>
		//*  33   81:ifeq            102
			{
				setCurrentItem(mCurItem - 1);
		//   34   84:aload_0         
		//   35   85:getfield        #13  <Field ViewPager this$0>
		//   36   88:aload_0         
		//   37   89:getfield        #13  <Field ViewPager this$0>
		//   38   92:getfield        #62  <Field int ViewPager.mCurItem>
		//   39   95:iconst_1        
		//   40   96:isub            
		//   41   97:invokevirtual   #90  <Method void ViewPager.setCurrentItem(int)>
				return true;
		//   42  100:iconst_1        
		//   43  101:ireturn         
			} else
			{
				return false;
		//   44  102:iconst_0        
		//   45  103:ireturn         
			}
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

	private class PagerObserver extends DataSetObserver
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
		//    0    0:new             #64  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #65  <Method void StringBuilder()>
		//    3    7:ldc1            #67  <String "FragmentPager.SavedState{">
		//    4    9:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:invokestatic    #77  <Method int System.identityHashCode(Object)>
		//    7   16:invokestatic    #83  <Method String Integer.toHexString(int)>
		//    8   19:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:ldc1            #85  <String " position=">
		//   10   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   11   27:aload_0         
		//   12   28:getfield        #49  <Field int position>
		//   13   31:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
		//   14   34:ldc1            #90  <String "}">
		//   15   36:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   16   39:invokevirtual   #92  <Method String StringBuilder.toString()>
		//   17   42:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #96  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(position);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #49  <Field int position>
		//    7   11:invokevirtual   #100 <Method void Parcel.writeInt(int)>
			parcel.writeParcelable(adapterState, i);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #55  <Field Parcelable adapterState>
		//   11   19:iload_2         
		//   12   20:invokevirtual   #104 <Method void Parcel.writeParcelable(Parcelable, int)>
		//   13   23:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class ViewPager$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void ViewPager$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

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

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #26  <Method ViewPager$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method ViewPager$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #34  <Method ViewPager$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		Parcelable adapterState;
		ClassLoader loader;
		int position;

		static 
		{
		//    0    0:new             #9   <Class ViewPager$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #23  <Method void ViewPager$SavedState$1()>
		//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #29  <Method void AbsSavedState(Parcel, ClassLoader)>
			ClassLoader classloader1 = classloader;
		//    4    6:aload_2         
		//    5    7:astore_3        
			if(classloader == null)
		//*   6    8:aload_2         
		//*   7    9:ifnonnull       20
				classloader1 = ((Object)this).getClass().getClassLoader();
		//    8   12:aload_0         
		//    9   13:invokevirtual   #35  <Method Class Object.getClass()>
		//   10   16:invokevirtual   #41  <Method ClassLoader Class.getClassLoader()>
		//   11   19:astore_3        
			position = parcel.readInt();
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:invokevirtual   #47  <Method int Parcel.readInt()>
		//   15   25:putfield        #49  <Field int position>
			adapterState = parcel.readParcelable(classloader1);
		//   16   28:aload_0         
		//   17   29:aload_1         
		//   18   30:aload_3         
		//   19   31:invokevirtual   #53  <Method Parcelable Parcel.readParcelable(ClassLoader)>
		//   20   34:putfield        #55  <Field Parcelable adapterState>
			loader = classloader1;
		//   21   37:aload_0         
		//   22   38:aload_3         
		//   23   39:putfield        #57  <Field ClassLoader loader>
		//   24   42:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #60  <Method void AbsSavedState(Parcelable)>
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
	//*   8   17:ifle            168
			f3 = (float)mPageMargin / (float)j;
	//    9   20:aload_0         
	//   10   21:getfield        #244 <Field int mPageMargin>
	//   11   24:i2f             
	//   12   25:iload           7
	//   13   27:i2f             
	//   14   28:fdiv            
	//   15   29:fstore          5
		else
	//*  16   31:aload_3         
	//*  17   32:ifnull          409
	//*  18   35:aload_3         
	//*  19   36:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  20   39:istore          7
	//*  21   41:iload           7
	//*  22   43:aload_1         
	//*  23   44:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  24   47:icmpge          236
	//*  25   50:iconst_0        
	//*  26   51:istore          8
	//*  27   53:aload_3         
	//*  28   54:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//*  29   57:aload_3         
	//*  30   58:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//*  31   61:fadd            
	//*  32   62:fload           5
	//*  33   64:fadd            
	//*  34   65:fstore          4
	//*  35   67:iload           7
	//*  36   69:iconst_1        
	//*  37   70:iadd            
	//*  38   71:istore          7
	//*  39   73:iload           7
	//*  40   75:aload_1         
	//*  41   76:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  42   79:icmpgt          409
	//*  43   82:iload           8
	//*  44   84:aload_0         
	//*  45   85:getfield        #188 <Field ArrayList mItems>
	//*  46   88:invokevirtual   #256 <Method int ArrayList.size()>
	//*  47   91:icmpge          409
	//*  48   94:aload_0         
	//*  49   95:getfield        #188 <Field ArrayList mItems>
	//*  50   98:iload           8
	//*  51  100:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//*  52  103:checkcast       #17  <Class ViewPager$ItemInfo>
	//*  53  106:astore_3        
	//*  54  107:fload           4
	//*  55  109:fstore          6
	//*  56  111:iload           7
	//*  57  113:istore          9
	//*  58  115:iload           7
	//*  59  117:aload_3         
	//*  60  118:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  61  121:icmple          174
	//*  62  124:fload           4
	//*  63  126:fstore          6
	//*  64  128:iload           7
	//*  65  130:istore          9
	//*  66  132:iload           8
	//*  67  134:aload_0         
	//*  68  135:getfield        #188 <Field ArrayList mItems>
	//*  69  138:invokevirtual   #256 <Method int ArrayList.size()>
	//*  70  141:iconst_1        
	//*  71  142:isub            
	//*  72  143:icmpge          174
	//*  73  146:iload           8
	//*  74  148:iconst_1        
	//*  75  149:iadd            
	//*  76  150:istore          8
	//*  77  152:aload_0         
	//*  78  153:getfield        #188 <Field ArrayList mItems>
	//*  79  156:iload           8
	//*  80  158:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//*  81  161:checkcast       #17  <Class ViewPager$ItemInfo>
	//*  82  164:astore_3        
	//*  83  165:goto            107
			f3 = 0.0F;
	//   84  168:fconst_0        
	//   85  169:fstore          5
		if(iteminfo1 != null)
		{
			j = iteminfo1.position;
			if(j < iteminfo.position)
			{
				int l = 0;
				float f = iteminfo1.offset + iteminfo1.widthFactor + f3;
				int k1;
				for(j++; j <= iteminfo.position && l < mItems.size(); j = k1 + 1)
				{
					iteminfo1 = (ItemInfo)mItems.get(l);
					float f4;
					do
					{
						f4 = f;
						k1 = j;
						if(j <= iteminfo1.position)
							break;
						f4 = f;
						k1 = j;
						if(l >= mItems.size() - 1)
							break;
						l++;
						iteminfo1 = (ItemInfo)mItems.get(l);
					} while(true);
	//*  86  171:goto            31
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
	//* 119  233:goto            73
			if(j > iteminfo.position)
	//* 120  236:iload           7
	//* 121  238:aload_1         
	//* 122  239:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 123  242:icmple          409
			{
				int i1 = mItems.size() - 1;
	//  124  245:aload_0         
	//  125  246:getfield        #188 <Field ArrayList mItems>
	//  126  249:invokevirtual   #256 <Method int ArrayList.size()>
	//  127  252:iconst_1        
	//  128  253:isub            
	//  129  254:istore          8
				float f1 = iteminfo1.offset;
	//  130  256:aload_3         
	//  131  257:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  132  260:fstore          4
				int l1;
				for(j--; j >= iteminfo.position && i1 >= 0; j = l1 - 1)
	//* 133  262:iload           7
	//* 134  264:iconst_1        
	//* 135  265:isub            
	//* 136  266:istore          7
	//* 137  268:iload           7
	//* 138  270:aload_1         
	//* 139  271:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 140  274:icmplt          409
	//* 141  277:iload           8
	//* 142  279:iflt            409
				{
					iteminfo1 = (ItemInfo)mItems.get(i1);
	//  143  282:aload_0         
	//  144  283:getfield        #188 <Field ArrayList mItems>
	//  145  286:iload           8
	//  146  288:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  147  291:checkcast       #17  <Class ViewPager$ItemInfo>
	//  148  294:astore_3        
					float f5;
					do
					{
						f5 = f1;
	//  149  295:fload           4
	//  150  297:fstore          6
						l1 = j;
	//  151  299:iload           7
	//  152  301:istore          9
						if(j >= iteminfo1.position)
							break;
	//  153  303:iload           7
	//  154  305:aload_3         
	//  155  306:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  156  309:icmpge          347
						f5 = f1;
	//  157  312:fload           4
	//  158  314:fstore          6
						l1 = j;
	//  159  316:iload           7
	//  160  318:istore          9
						if(i1 <= 0)
							break;
	//  161  320:iload           8
	//  162  322:ifle            347
						i1--;
	//  163  325:iload           8
	//  164  327:iconst_1        
	//  165  328:isub            
	//  166  329:istore          8
						iteminfo1 = (ItemInfo)mItems.get(i1);
	//  167  331:aload_0         
	//  168  332:getfield        #188 <Field ArrayList mItems>
	//  169  335:iload           8
	//  170  337:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  171  340:checkcast       #17  <Class ViewPager$ItemInfo>
	//  172  343:astore_3        
					} while(true);
	//  173  344:goto            295
					for(; l1 > iteminfo1.position; l1--)
	//* 174  347:iload           9
	//* 175  349:aload_3         
	//* 176  350:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 177  353:icmple          382
						f5 -= mAdapter.getPageWidth(l1) + f3;
	//  178  356:fload           6
	//  179  358:aload_0         
	//  180  359:getfield        #233 <Field PagerAdapter mAdapter>
	//  181  362:iload           9
	//  182  364:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//  183  367:fload           5
	//  184  369:fadd            
	//  185  370:fsub            
	//  186  371:fstore          6

	//  187  373:iload           9
	//  188  375:iconst_1        
	//  189  376:isub            
	//  190  377:istore          9
	//* 191  379:goto            347
					f1 = f5 - (iteminfo1.widthFactor + f3);
	//  192  382:fload           6
	//  193  384:aload_3         
	//  194  385:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  195  388:fload           5
	//  196  390:fadd            
	//  197  391:fsub            
	//  198  392:fstore          4
					iteminfo1.offset = f1;
	//  199  394:aload_3         
	//  200  395:fload           4
	//  201  397:putfield        #250 <Field float ViewPager$ItemInfo.offset>
				}

	//  202  400:iload           9
	//  203  402:iconst_1        
	//  204  403:isub            
	//  205  404:istore          7
			}
		}
	//* 206  406:goto            268
		int i2 = mItems.size();
	//  207  409:aload_0         
	//  208  410:getfield        #188 <Field ArrayList mItems>
	//  209  413:invokevirtual   #256 <Method int ArrayList.size()>
	//  210  416:istore          9
		float f6 = iteminfo.offset;
	//  211  418:aload_1         
	//  212  419:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  213  422:fstore          6
		j = iteminfo.position - 1;
	//  214  424:aload_1         
	//  215  425:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  216  428:iconst_1        
	//  217  429:isub            
	//  218  430:istore          7
		float f2;
		int j1;
		if(iteminfo.position == 0)
	//* 219  432:aload_1         
	//* 220  433:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 221  436:ifne            543
			f2 = iteminfo.offset;
	//  222  439:aload_1         
	//  223  440:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  224  443:fstore          4
		else
	//* 225  445:aload_0         
	//* 226  446:fload           4
	//* 227  448:putfield        #205 <Field float mFirstOffset>
	//* 228  451:aload_1         
	//* 229  452:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 230  455:iload           10
	//* 231  457:iconst_1        
	//* 232  458:isub            
	//* 233  459:icmpne          550
	//* 234  462:aload_1         
	//* 235  463:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//* 236  466:aload_1         
	//* 237  467:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//* 238  470:fadd            
	//* 239  471:fconst_1        
	//* 240  472:fsub            
	//* 241  473:fstore          4
	//* 242  475:aload_0         
	//* 243  476:fload           4
	//* 244  478:putfield        #208 <Field float mLastOffset>
	//* 245  481:iload_2         
	//* 246  482:iconst_1        
	//* 247  483:isub            
	//* 248  484:istore          8
	//* 249  486:fload           6
	//* 250  488:fstore          4
	//* 251  490:iload           8
	//* 252  492:iflt            603
	//* 253  495:aload_0         
	//* 254  496:getfield        #188 <Field ArrayList mItems>
	//* 255  499:iload           8
	//* 256  501:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 257  504:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 258  507:astore_3        
	//* 259  508:iload           7
	//* 260  510:aload_3         
	//* 261  511:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 262  514:icmple          557
	//* 263  517:fload           4
	//* 264  519:aload_0         
	//* 265  520:getfield        #233 <Field PagerAdapter mAdapter>
	//* 266  523:iload           7
	//* 267  525:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//* 268  528:fload           5
	//* 269  530:fadd            
	//* 270  531:fsub            
	//* 271  532:fstore          4
	//* 272  534:iload           7
	//* 273  536:iconst_1        
	//* 274  537:isub            
	//* 275  538:istore          7
	//* 276  540:goto            508
			f2 = -3.402823E+38F;
	//  277  543:ldc1            #203 <Float -3.402823E+38F>
	//  278  545:fstore          4
		mFirstOffset = f2;
		if(iteminfo.position == j2 - 1)
			f2 = (iteminfo.offset + iteminfo.widthFactor) - 1.0F;
		else
	//* 279  547:goto            445
			f2 = 3.402823E+38F;
	//  280  550:ldc1            #206 <Float 3.402823E+38F>
	//  281  552:fstore          4
		mLastOffset = f2;
		j1 = i - 1;
		f2 = f6;
		while(j1 >= 0) 
		{
			for(iteminfo1 = (ItemInfo)mItems.get(j1); j > iteminfo1.position; j--)
				f2 -= mAdapter.getPageWidth(j) + f3;

	//* 282  554:goto            475
			f2 -= iteminfo1.widthFactor + f3;
	//  283  557:fload           4
	//  284  559:aload_3         
	//  285  560:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  286  563:fload           5
	//  287  565:fadd            
	//  288  566:fsub            
	//  289  567:fstore          4
			iteminfo1.offset = f2;
	//  290  569:aload_3         
	//  291  570:fload           4
	//  292  572:putfield        #250 <Field float ViewPager$ItemInfo.offset>
			if(iteminfo1.position == 0)
	//* 293  575:aload_3         
	//* 294  576:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 295  579:ifne            588
				mFirstOffset = f2;
	//  296  582:aload_0         
	//  297  583:fload           4
	//  298  585:putfield        #205 <Field float mFirstOffset>
			j1--;
	//  299  588:iload           8
	//  300  590:iconst_1        
	//  301  591:isub            
	//  302  592:istore          8
			j--;
	//  303  594:iload           7
	//  304  596:iconst_1        
	//  305  597:isub            
	//  306  598:istore          7
		}
	//* 307  600:goto            490
		f2 = iteminfo.offset + iteminfo.widthFactor + f3;
	//  308  603:aload_1         
	//  309  604:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  310  607:aload_1         
	//  311  608:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  312  611:fadd            
	//  313  612:fload           5
	//  314  614:fadd            
	//  315  615:fstore          4
		j = iteminfo.position + 1;
	//  316  617:aload_1         
	//  317  618:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  318  621:iconst_1        
	//  319  622:iadd            
	//  320  623:istore          7
		j1 = i + 1;
	//  321  625:iload_2         
	//  322  626:iconst_1        
	//  323  627:iadd            
	//  324  628:istore          8
		i = j;
	//  325  630:iload           7
	//  326  632:istore_2        
		for(int k = j1; k < i2;)
	//* 327  633:iload           8
	//* 328  635:istore          7
	//* 329  637:iload           7
	//* 330  639:iload           9
	//* 331  641:icmpge          743
		{
			for(iteminfo = (ItemInfo)mItems.get(k); i < iteminfo.position; i++)
	//* 332  644:aload_0         
	//* 333  645:getfield        #188 <Field ArrayList mItems>
	//* 334  648:iload           7
	//* 335  650:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 336  653:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 337  656:astore_1        
	//* 338  657:iload_2         
	//* 339  658:aload_1         
	//* 340  659:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 341  662:icmpge          688
				f2 += mAdapter.getPageWidth(i) + f3;
	//  342  665:fload           4
	//  343  667:aload_0         
	//  344  668:getfield        #233 <Field PagerAdapter mAdapter>
	//  345  671:iload_2         
	//  346  672:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//  347  675:fload           5
	//  348  677:fadd            
	//  349  678:fadd            
	//  350  679:fstore          4

	//  351  681:iload_2         
	//  352  682:iconst_1        
	//  353  683:iadd            
	//  354  684:istore_2        
	//* 355  685:goto            657
			if(iteminfo.position == j2 - 1)
	//* 356  688:aload_1         
	//* 357  689:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 358  692:iload           10
	//* 359  694:iconst_1        
	//* 360  695:isub            
	//* 361  696:icmpne          712
				mLastOffset = (iteminfo.widthFactor + f2) - 1.0F;
	//  362  699:aload_0         
	//  363  700:aload_1         
	//  364  701:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  365  704:fload           4
	//  366  706:fadd            
	//  367  707:fconst_1        
	//  368  708:fsub            
	//  369  709:putfield        #208 <Field float mLastOffset>
			iteminfo.offset = f2;
	//  370  712:aload_1         
	//  371  713:fload           4
	//  372  715:putfield        #250 <Field float ViewPager$ItemInfo.offset>
			f2 += iteminfo.widthFactor + f3;
	//  373  718:fload           4
	//  374  720:aload_1         
	//  375  721:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  376  724:fload           5
	//  377  726:fadd            
	//  378  727:fadd            
	//  379  728:fstore          4
			k++;
	//  380  730:iload           7
	//  381  732:iconst_1        
	//  382  733:iadd            
	//  383  734:istore          7
			i++;
	//  384  736:iload_2         
	//  385  737:iconst_1        
	//  386  738:iadd            
	//  387  739:istore_2        
		}

	//* 388  740:goto            637
		mNeedCalculatePageOffsets = false;
	//  389  743:aload_0         
	//  390  744:iconst_0        
	//  391  745:putfield        #216 <Field boolean mNeedCalculatePageOffsets>
	//  392  748:return          
	}

	private void completeScroll(boolean flag)
	{
label0:
		{
			int j = 1;
	//    0    0:iconst_1        
	//    1    1:istore_3        
			int i;
			if(mScrollState == 2)
	//*   2    2:aload_0         
	//*   3    3:getfield        #223 <Field int mScrollState>
	//*   4    6:iconst_2        
	//*   5    7:icmpne          165
				i = 1;
	//    6   10:iconst_1        
	//    7   11:istore_2        
			else
	//*   8   12:iload_2         
	//*   9   13:ifeq            105
	//*  10   16:aload_0         
	//*  11   17:iconst_0        
	//*  12   18:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
	//*  13   21:aload_0         
	//*  14   22:getfield        #271 <Field Scroller mScroller>
	//*  15   25:invokevirtual   #277 <Method boolean Scroller.isFinished()>
	//*  16   28:ifne            170
	//*  17   31:iload_3         
	//*  18   32:ifeq            105
	//*  19   35:aload_0         
	//*  20   36:getfield        #271 <Field Scroller mScroller>
	//*  21   39:invokevirtual   #280 <Method void Scroller.abortAnimation()>
	//*  22   42:aload_0         
	//*  23   43:invokevirtual   #283 <Method int getScrollX()>
	//*  24   46:istore_3        
	//*  25   47:aload_0         
	//*  26   48:invokevirtual   #286 <Method int getScrollY()>
	//*  27   51:istore          4
	//*  28   53:aload_0         
	//*  29   54:getfield        #271 <Field Scroller mScroller>
	//*  30   57:invokevirtual   #289 <Method int Scroller.getCurrX()>
	//*  31   60:istore          5
	//*  32   62:aload_0         
	//*  33   63:getfield        #271 <Field Scroller mScroller>
	//*  34   66:invokevirtual   #292 <Method int Scroller.getCurrY()>
	//*  35   69:istore          6
	//*  36   71:iload_3         
	//*  37   72:iload           5
	//*  38   74:icmpne          84
	//*  39   77:iload           4
	//*  40   79:iload           6
	//*  41   81:icmpeq          105
	//*  42   84:aload_0         
	//*  43   85:iload           5
	//*  44   87:iload           6
	//*  45   89:invokevirtual   #296 <Method void scrollTo(int, int)>
	//*  46   92:iload           5
	//*  47   94:iload_3         
	//*  48   95:icmpeq          105
	//*  49   98:aload_0         
	//*  50   99:iload           5
	//*  51  101:invokespecial   #300 <Method boolean pageScrolled(int)>
	//*  52  104:pop             
	//*  53  105:aload_0         
	//*  54  106:iconst_0        
	//*  55  107:putfield        #302 <Field boolean mPopulatePending>
	//*  56  110:iconst_0        
	//*  57  111:istore          4
	//*  58  113:iload_2         
	//*  59  114:istore_3        
	//*  60  115:iload           4
	//*  61  117:istore_2        
	//*  62  118:iload_2         
	//*  63  119:aload_0         
	//*  64  120:getfield        #188 <Field ArrayList mItems>
	//*  65  123:invokevirtual   #256 <Method int ArrayList.size()>
	//*  66  126:icmpge          175
	//*  67  129:aload_0         
	//*  68  130:getfield        #188 <Field ArrayList mItems>
	//*  69  133:iload_2         
	//*  70  134:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//*  71  137:checkcast       #17  <Class ViewPager$ItemInfo>
	//*  72  140:astore          7
	//*  73  142:aload           7
	//*  74  144:getfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>
	//*  75  147:ifeq            158
	//*  76  150:iconst_1        
	//*  77  151:istore_3        
	//*  78  152:aload           7
	//*  79  154:iconst_0        
	//*  80  155:putfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>
	//*  81  158:iload_2         
	//*  82  159:iconst_1        
	//*  83  160:iadd            
	//*  84  161:istore_2        
	//*  85  162:goto            118
				i = 0;
	//   86  165:iconst_0        
	//   87  166:istore_2        
			if(i != 0)
			{
				setScrollingCacheEnabled(false);
				boolean flag1;
				ItemInfo iteminfo;
				if(mScroller.isFinished())
	//*  88  167:goto            12
					j = 0;
	//   89  170:iconst_0        
	//   90  171:istore_3        
				if(j != 0)
				{
					mScroller.abortAnimation();
					j = getScrollX();
					int k = getScrollY();
					int l = mScroller.getCurrX();
					int i1 = mScroller.getCurrY();
					if(j != l || k != i1)
					{
						scrollTo(l, i1);
						if(l != j)
							pageScrolled(l);
					}
				}
			}
			mPopulatePending = false;
			flag1 = false;
			j = i;
			for(i = ((int) (flag1)); i < mItems.size(); i++)
			{
				iteminfo = (ItemInfo)mItems.get(i);
				if(iteminfo.scrolling)
				{
					j = 1;
					iteminfo.scrolling = false;
				}
			}

	//*  91  172:goto            31
			if(j != 0)
	//*  92  175:iload_3         
	//*  93  176:ifeq            191
			{
				if(!flag)
					break label0;
	//   94  179:iload_1         
	//   95  180:ifeq            192
				ViewCompat.postOnAnimation(((View) (this)), mEndScrollRunnable);
	//   96  183:aload_0         
	//   97  184:aload_0         
	//   98  185:getfield        #221 <Field Runnable mEndScrollRunnable>
	//   99  188:invokestatic    #311 <Method void ViewCompat.postOnAnimation(View, Runnable)>
			}
			return;
	//  100  191:return          
		}
		mEndScrollRunnable.run();
	//  101  192:aload_0         
	//  102  193:getfield        #221 <Field Runnable mEndScrollRunnable>
	//  103  196:invokeinterface #316 <Method void Runnable.run()>
	//  104  201:return          
	}

	private int determineTargetPage(int i, float f, int j, int k)
	{
		if(Math.abs(k) > mFlingDistance && Math.abs(j) > mMinimumVelocity)
	//*   0    0:iload           4
	//*   1    2:invokestatic    #324 <Method int Math.abs(int)>
	//*   2    5:aload_0         
	//*   3    6:getfield        #326 <Field int mFlingDistance>
	//*   4    9:icmple          100
	//*   5   12:iload_3         
	//*   6   13:invokestatic    #324 <Method int Math.abs(int)>
	//*   7   16:aload_0         
	//*   8   17:getfield        #328 <Field int mMinimumVelocity>
	//*   9   20:icmple          100
		{
			if(j <= 0)
	//*  10   23:iload_3         
	//*  11   24:ifle            93
	//*  12   27:iload_1         
	//*  13   28:istore_3        
	//*  14   29:aload_0         
	//*  15   30:getfield        #188 <Field ArrayList mItems>
	//*  16   33:invokevirtual   #256 <Method int ArrayList.size()>
	//*  17   36:ifle            91
	//*  18   39:aload_0         
	//*  19   40:getfield        #188 <Field ArrayList mItems>
	//*  20   43:iconst_0        
	//*  21   44:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//*  22   47:checkcast       #17  <Class ViewPager$ItemInfo>
	//*  23   50:astore          6
	//*  24   52:aload_0         
	//*  25   53:getfield        #188 <Field ArrayList mItems>
	//*  26   56:aload_0         
	//*  27   57:getfield        #188 <Field ArrayList mItems>
	//*  28   60:invokevirtual   #256 <Method int ArrayList.size()>
	//*  29   63:iconst_1        
	//*  30   64:isub            
	//*  31   65:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//*  32   68:checkcast       #17  <Class ViewPager$ItemInfo>
	//*  33   71:astore          7
	//*  34   73:aload           6
	//*  35   75:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  36   78:iload_1         
	//*  37   79:aload           7
	//*  38   81:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  39   84:invokestatic    #332 <Method int Math.min(int, int)>
	//*  40   87:invokestatic    #335 <Method int Math.max(int, int)>
	//*  41   90:istore_3        
	//*  42   91:iload_3         
	//*  43   92:ireturn         
				i++;
	//   44   93:iload_1         
	//   45   94:iconst_1        
	//   46   95:iadd            
	//   47   96:istore_1        
		} else
	//*  48   97:goto            27
		{
			float f1;
			if(i >= mCurItem)
	//*  49  100:iload_1         
	//*  50  101:aload_0         
	//*  51  102:getfield        #337 <Field int mCurItem>
	//*  52  105:icmplt          124
				f1 = 0.4F;
	//   53  108:ldc2            #338 <Float 0.4F>
	//   54  111:fstore          5
			else
	//*  55  113:iload_1         
	//*  56  114:fload_2         
	//*  57  115:fload           5
	//*  58  117:fadd            
	//*  59  118:f2i             
	//*  60  119:iadd            
	//*  61  120:istore_1        
	//*  62  121:goto            27
				f1 = 0.6F;
	//   63  124:ldc2            #339 <Float 0.6F>
	//   64  127:fstore          5
			i += (int)(f + f1);
		}
		j = i;
		if(mItems.size() > 0)
		{
			ItemInfo iteminfo = (ItemInfo)mItems.get(0);
			ItemInfo iteminfo1 = (ItemInfo)mItems.get(mItems.size() - 1);
			j = Math.max(iteminfo.position, Math.min(i, iteminfo1.position));
		}
		return j;
	//*  65  129:goto            113
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
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		while(i < k) 
	//*   5    8:iload_2         
	//*   6    9:iload           4
	//*   7   11:icmpge          45
		{
			int j;
			if(flag)
	//*   8   14:iload_1         
	//*   9   15:ifeq            40
				j = mPageTransformerLayerType;
	//   10   18:aload_0         
	//   11   19:getfield        #369 <Field int mPageTransformerLayerType>
	//   12   22:istore_3        
			else
	//*  13   23:aload_0         
	//*  14   24:iload_2         
	//*  15   25:invokevirtual   #373 <Method View getChildAt(int)>
	//*  16   28:iload_3         
	//*  17   29:aconst_null     
	//*  18   30:invokevirtual   #379 <Method void View.setLayerType(int, android.graphics.Paint)>
	//*  19   33:iload_2         
	//*  20   34:iconst_1        
	//*  21   35:iadd            
	//*  22   36:istore_2        
	//*  23   37:goto            8
				j = 0;
	//   24   40:iconst_0        
	//   25   41:istore_3        
			getChildAt(i).setLayerType(j, ((android.graphics.Paint) (null)));
			i++;
		}
	//*  26   42:goto            23
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
		} else
	//*  16   26:aload_3         
	//*  17   27:areturn         
		{
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
			rect = ((Rect) (view.getParent()));
	//   34   60:aload_2         
	//   35   61:invokevirtual   #425 <Method ViewParent View.getParent()>
	//   36   64:astore_1        
			while((rect instanceof ViewGroup) && rect != this) 
	//*  37   65:aload_1         
	//*  38   66:instanceof      #4   <Class ViewGroup>
	//*  39   69:ifeq            26
	//*  40   72:aload_1         
	//*  41   73:aload_0         
	//*  42   74:if_acmpeq       26
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
				rect = ((Rect) (((ViewGroup) (rect)).getParent()));
	//   74  134:aload_1         
	//   75  135:invokevirtual   #430 <Method ViewParent ViewGroup.getParent()>
	//   76  138:astore_1        
			}
		}
		return rect1;
	//*  77  139:goto            65
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
		float f1 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_2        
		int i = getClientWidth();
	//    2    2:aload_0         
	//    3    3:invokespecial   #242 <Method int getClientWidth()>
	//    4    6:istore          5
		float f;
		float f2;
		float f3;
		boolean flag;
		int j;
		ItemInfo iteminfo1;
		if(i > 0)
	//*   5    8:iload           5
	//*   6   10:ifle            227
			f = (float)getScrollX() / (float)i;
	//    7   13:aload_0         
	//    8   14:invokevirtual   #283 <Method int getScrollX()>
	//    9   17:i2f             
	//   10   18:iload           5
	//   11   20:i2f             
	//   12   21:fdiv            
	//   13   22:fstore_1        
		else
	//*  14   23:iload           5
	//*  15   25:ifle            38
	//*  16   28:aload_0         
	//*  17   29:getfield        #244 <Field int mPageMargin>
	//*  18   32:i2f             
	//*  19   33:iload           5
	//*  20   35:i2f             
	//*  21   36:fdiv            
	//*  22   37:fstore_2        
	//*  23   38:iconst_m1       
	//*  24   39:istore          7
	//*  25   41:fconst_0        
	//*  26   42:fstore_3        
	//*  27   43:fconst_0        
	//*  28   44:fstore          4
	//*  29   46:iconst_1        
	//*  30   47:istore          6
	//*  31   49:aconst_null     
	//*  32   50:astore          10
	//*  33   52:iconst_0        
	//*  34   53:istore          5
	//*  35   55:aload           10
	//*  36   57:astore          11
	//*  37   59:iload           5
	//*  38   61:aload_0         
	//*  39   62:getfield        #188 <Field ArrayList mItems>
	//*  40   65:invokevirtual   #256 <Method int ArrayList.size()>
	//*  41   68:icmpge          224
	//*  42   71:aload_0         
	//*  43   72:getfield        #188 <Field ArrayList mItems>
	//*  44   75:iload           5
	//*  45   77:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//*  46   80:checkcast       #17  <Class ViewPager$ItemInfo>
	//*  47   83:astore          11
	//*  48   85:iload           5
	//*  49   87:istore          8
	//*  50   89:aload           11
	//*  51   91:astore          9
	//*  52   93:iload           6
	//*  53   95:ifne            167
	//*  54   98:iload           5
	//*  55  100:istore          8
	//*  56  102:aload           11
	//*  57  104:astore          9
	//*  58  106:aload           11
	//*  59  108:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  60  111:iload           7
	//*  61  113:iconst_1        
	//*  62  114:iadd            
	//*  63  115:icmpeq          167
	//*  64  118:aload_0         
	//*  65  119:getfield        #191 <Field ViewPager$ItemInfo mTempItem>
	//*  66  122:astore          9
	//*  67  124:aload           9
	//*  68  126:fload_3         
	//*  69  127:fload           4
	//*  70  129:fadd            
	//*  71  130:fload_2         
	//*  72  131:fadd            
	//*  73  132:putfield        #250 <Field float ViewPager$ItemInfo.offset>
	//*  74  135:aload           9
	//*  75  137:iload           7
	//*  76  139:iconst_1        
	//*  77  140:iadd            
	//*  78  141:putfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  79  144:aload           9
	//*  80  146:aload_0         
	//*  81  147:getfield        #233 <Field PagerAdapter mAdapter>
	//*  82  150:aload           9
	//*  83  152:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  84  155:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//*  85  158:putfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//*  86  161:iload           5
	//*  87  163:iconst_1        
	//*  88  164:isub            
	//*  89  165:istore          8
	//*  90  167:aload           9
	//*  91  169:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//*  92  172:fstore_3        
	//*  93  173:aload           9
	//*  94  175:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//*  95  178:fstore          4
	//*  96  180:iload           6
	//*  97  182:ifne            195
	//*  98  185:aload           10
	//*  99  187:astore          11
	//* 100  189:fload_1         
	//* 101  190:fload_3         
	//* 102  191:fcmpl           
	//* 103  192:iflt            224
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
	//* 118  217:icmpne          232
	//* 119  220:aload           9
	//* 120  222:astore          11
	//* 121  224:aload           11
	//* 122  226:areturn         
			f = 0.0F;
	//  123  227:fconst_0        
	//  124  228:fstore_1        
		if(i > 0)
			f1 = (float)mPageMargin / (float)i;
		j = -1;
		f2 = 0.0F;
		f3 = 0.0F;
		flag = true;
		iteminfo1 = null;
		i = 0;
		do
		{
			int k;
			ItemInfo iteminfo;
label0:
			{
				ItemInfo iteminfo2;
label1:
				{
					iteminfo2 = iteminfo1;
					if(i >= mItems.size())
						break label1;
					iteminfo2 = (ItemInfo)mItems.get(i);
					k = i;
					iteminfo = iteminfo2;
					if(!flag)
					{
						k = i;
						iteminfo = iteminfo2;
						if(iteminfo2.position != j + 1)
						{
							iteminfo = mTempItem;
							iteminfo.offset = f2 + f3 + f1;
							iteminfo.position = j + 1;
							iteminfo.widthFactor = mAdapter.getPageWidth(iteminfo.position);
							k = i - 1;
						}
					}
					f2 = iteminfo.offset;
					f3 = iteminfo.widthFactor;
					if(!flag)
					{
						iteminfo2 = iteminfo1;
						if(f < f2)
							break label1;
					}
					if(f >= f3 + f2 + f1 && k != mItems.size() - 1)
						break label0;
					iteminfo2 = iteminfo;
				}
				return iteminfo2;
			}
	//* 125  229:goto            23
			flag = false;
	//  126  232:iconst_0        
	//  127  233:istore          6
			j = iteminfo.position;
	//  128  235:aload           9
	//  129  237:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  130  240:istore          7
			f3 = iteminfo.widthFactor;
	//  131  242:aload           9
	//  132  244:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  133  247:fstore          4
			i = k + 1;
	//  134  249:iload           8
	//  135  251:iconst_1        
	//  136  252:iadd            
	//  137  253:istore          5
			iteminfo1 = iteminfo;
	//  138  255:aload           9
	//  139  257:astore          10
		} while(true);
	//  140  259:goto            55
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
	//*   8   14:icmpne          55
		{
			if(i == 0)
	//*   9   17:iload_2         
	//*  10   18:ifne            56
				i = 1;
	//   11   21:iconst_1        
	//   12   22:istore_2        
			else
	//*  13   23:aload_0         
	//*  14   24:aload_1         
	//*  15   25:iload_2         
	//*  16   26:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//*  17   29:putfield        #479 <Field float mLastMotionX>
	//*  18   32:aload_0         
	//*  19   33:aload_1         
	//*  20   34:iload_2         
	//*  21   35:invokevirtual   #474 <Method int MotionEvent.getPointerId(int)>
	//*  22   38:putfield        #212 <Field int mActivePointerId>
	//*  23   41:aload_0         
	//*  24   42:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//*  25   45:ifnull          55
	//*  26   48:aload_0         
	//*  27   49:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//*  28   52:invokevirtual   #482 <Method void VelocityTracker.clear()>
	//*  29   55:return          
				i = 0;
	//   30   56:iconst_0        
	//   31   57:istore_2        
			mLastMotionX = motionevent.getX(i);
			mActivePointerId = motionevent.getPointerId(i);
			if(mVelocityTracker != null)
				mVelocityTracker.clear();
		}
	//*  32   58:goto            23
	}

	private boolean pageScrolled(int i)
	{
		if(mItems.size() != 0)
			break MISSING_BLOCK_LABEL_49;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field ArrayList mItems>
	//    2    4:invokevirtual   #256 <Method int ArrayList.size()>
	//    3    7:ifne            49
		if(!mFirstLayout) goto _L2; else goto _L1
	//    4   10:aload_0         
	//    5   11:getfield        #214 <Field boolean mFirstLayout>
	//    6   14:ifeq            19
_L1:
		return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
_L2:
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
		if(mCalledSuper) goto _L1; else goto _L3
	//   17   31:aload_0         
	//   18   32:getfield        #484 <Field boolean mCalledSuper>
	//   19   35:ifne            17
_L3:
		throw new IllegalStateException("onPageScrolled did not call superclass implementation");
	//   20   38:new             #487 <Class IllegalStateException>
	//   21   41:dup             
	//   22   42:ldc2            #489 <String "onPageScrolled did not call superclass implementation">
	//   23   45:invokespecial   #492 <Method void IllegalStateException(String)>
	//   24   48:athrow          
		ItemInfo iteminfo = infoForCurrentScrollPosition();
	//   25   49:aload_0         
	//   26   50:invokespecial   #494 <Method ViewPager$ItemInfo infoForCurrentScrollPosition()>
	//   27   53:astore          6
		int k = getClientWidth();
	//   28   55:aload_0         
	//   29   56:invokespecial   #242 <Method int getClientWidth()>
	//   30   59:istore          4
		int l = mPageMargin;
	//   31   61:aload_0         
	//   32   62:getfield        #244 <Field int mPageMargin>
	//   33   65:istore          5
		float f = (float)mPageMargin / (float)k;
	//   34   67:aload_0         
	//   35   68:getfield        #244 <Field int mPageMargin>
	//   36   71:i2f             
	//   37   72:iload           4
	//   38   74:i2f             
	//   39   75:fdiv            
	//   40   76:fstore_2        
		int j = iteminfo.position;
	//   41   77:aload           6
	//   42   79:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   43   82:istore_3        
		f = ((float)i / (float)k - iteminfo.offset) / (iteminfo.widthFactor + f);
	//   44   83:iload_1         
	//   45   84:i2f             
	//   46   85:iload           4
	//   47   87:i2f             
	//   48   88:fdiv            
	//   49   89:aload           6
	//   50   91:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   51   94:fsub            
	//   52   95:aload           6
	//   53   97:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//   54  100:fload_2         
	//   55  101:fadd            
	//   56  102:fdiv            
	//   57  103:fstore_2        
		i = (int)((float)(k + l) * f);
	//   58  104:iload           4
	//   59  106:iload           5
	//   60  108:iadd            
	//   61  109:i2f             
	//   62  110:fload_2         
	//   63  111:fmul            
	//   64  112:f2i             
	//   65  113:istore_1        
		mCalledSuper = false;
	//   66  114:aload_0         
	//   67  115:iconst_0        
	//   68  116:putfield        #484 <Field boolean mCalledSuper>
		onPageScrolled(j, f, i);
	//   69  119:aload_0         
	//   70  120:iload_3         
	//   71  121:fload_2         
	//   72  122:iload_1         
	//   73  123:invokevirtual   #485 <Method void onPageScrolled(int, float, int)>
		if(!mCalledSuper)
	//*  74  126:aload_0         
	//*  75  127:getfield        #484 <Field boolean mCalledSuper>
	//*  76  130:ifne            144
			throw new IllegalStateException("onPageScrolled did not call superclass implementation");
	//   77  133:new             #487 <Class IllegalStateException>
	//   78  136:dup             
	//   79  137:ldc2            #489 <String "onPageScrolled did not call superclass implementation">
	//   80  140:invokespecial   #492 <Method void IllegalStateException(String)>
	//   81  143:athrow          
		else
			return true;
	//   82  144:iconst_1        
	//   83  145:ireturn         
	}

	private boolean performDrag(float f)
	{
		float f1;
		float f2;
		boolean flag;
		boolean flag1;
		int i;
		boolean flag2;
		boolean flag3;
		boolean flag4;
		flag4 = false;
	//    0    0:iconst_0        
	//    1    1:istore          9
		flag3 = false;
	//    2    3:iconst_0        
	//    3    4:istore          8
		flag2 = false;
	//    4    6:iconst_0        
	//    5    7:istore          7
		f1 = mLastMotionX;
	//    6    9:aload_0         
	//    7   10:getfield        #479 <Field float mLastMotionX>
	//    8   13:fstore_2        
		mLastMotionX = f;
	//    9   14:aload_0         
	//   10   15:fload_1         
	//   11   16:putfield        #479 <Field float mLastMotionX>
		f2 = (float)getScrollX() + (f1 - f);
	//   12   19:aload_0         
	//   13   20:invokevirtual   #283 <Method int getScrollX()>
	//   14   23:i2f             
	//   15   24:fload_2         
	//   16   25:fload_1         
	//   17   26:fsub            
	//   18   27:fadd            
	//   19   28:fstore_3        
		i = getClientWidth();
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
		flag = true;
	//   35   53:iconst_1        
	//   36   54:istore          4
		flag1 = true;
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
		if(f2 >= f) goto _L2; else goto _L1
	//   82  144:fload_3         
	//   83  145:fload_1         
	//   84  146:fcmpg           
	//   85  147:ifge            209
_L1:
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
_L4:
		mLastMotionX = mLastMotionX + (f - (float)(int)f);
	//  100  175:aload_0         
	//  101  176:aload_0         
	//  102  177:getfield        #479 <Field float mLastMotionX>
	//  103  180:fload_1         
	//  104  181:fload_1         
	//  105  182:f2i             
	//  106  183:i2f             
	//  107  184:fsub            
	//  108  185:fadd            
	//  109  186:putfield        #479 <Field float mLastMotionX>
		scrollTo((int)f, getScrollY());
	//  110  189:aload_0         
	//  111  190:fload_1         
	//  112  191:f2i             
	//  113  192:aload_0         
	//  114  193:invokevirtual   #286 <Method int getScrollY()>
	//  115  196:invokevirtual   #296 <Method void scrollTo(int, int)>
		pageScrolled((int)f);
	//  116  199:aload_0         
	//  117  200:fload_1         
	//  118  201:f2i             
	//  119  202:invokespecial   #300 <Method boolean pageScrolled(int)>
	//  120  205:pop             
		return flag2;
	//  121  206:iload           7
	//  122  208:ireturn         
_L2:
		flag2 = flag4;
	//  123  209:iload           9
	//  124  211:istore          7
		f = f2;
	//  125  213:fload_3         
	//  126  214:fstore_1        
		if(f2 > f1)
	//* 127  215:fload_3         
	//* 128  216:fload_2         
	//* 129  217:fcmpl           
	//* 130  218:ifle            175
		{
			flag2 = flag3;
	//  131  221:iload           8
	//  132  223:istore          7
			if(flag1)
	//* 133  225:iload           5
	//* 134  227:ifeq            250
			{
				mRightEdge.onPull(Math.abs(f2 - f1) / (float)i);
	//  135  230:aload_0         
	//  136  231:getfield        #509 <Field EdgeEffect mRightEdge>
	//  137  234:fload_3         
	//  138  235:fload_2         
	//  139  236:fsub            
	//  140  237:invokestatic    #501 <Method float Math.abs(float)>
	//  141  240:iload           6
	//  142  242:i2f             
	//  143  243:fdiv            
	//  144  244:invokevirtual   #507 <Method void EdgeEffect.onPull(float)>
				flag2 = true;
	//  145  247:iconst_1        
	//  146  248:istore          7
			}
			f = f1;
	//  147  250:fload_2         
	//  148  251:fstore_1        
		}
		if(true) goto _L4; else goto _L3
	//  149  252:goto            175
_L3:
	}

	private void recomputeScrollPosition(int i, int j, int k, int l)
	{
		if(j <= 0 || mItems.isEmpty()) goto _L2; else goto _L1
	//    0    0:iload_2         
	//    1    1:ifle            107
	//    2    4:aload_0         
	//    3    5:getfield        #188 <Field ArrayList mItems>
	//    4    8:invokevirtual   #513 <Method boolean ArrayList.isEmpty()>
	//    5   11:ifne            107
_L1:
		if(mScroller.isFinished()) goto _L4; else goto _L3
	//    6   14:aload_0         
	//    7   15:getfield        #271 <Field Scroller mScroller>
	//    8   18:invokevirtual   #277 <Method boolean Scroller.isFinished()>
	//    9   21:ifne            41
_L3:
		mScroller.setFinalX(getCurrentItem() * getClientWidth());
	//   10   24:aload_0         
	//   11   25:getfield        #271 <Field Scroller mScroller>
	//   12   28:aload_0         
	//   13   29:invokevirtual   #516 <Method int getCurrentItem()>
	//   14   32:aload_0         
	//   15   33:invokespecial   #242 <Method int getClientWidth()>
	//   16   36:imul            
	//   17   37:invokevirtual   #519 <Method void Scroller.setFinalX(int)>
_L6:
		return;
	//   18   40:return          
_L4:
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
_L2:
		ItemInfo iteminfo = infoForPosition(mCurItem);
	//   60  107:aload_0         
	//   61  108:aload_0         
	//   62  109:getfield        #337 <Field int mCurItem>
	//   63  112:invokevirtual   #523 <Method ViewPager$ItemInfo infoForPosition(int)>
	//   64  115:astore          10
		float f1;
		if(iteminfo != null)
	//*  65  117:aload           10
	//*  66  119:ifnull          176
			f1 = Math.min(iteminfo.offset, mLastOffset);
	//   67  122:aload           10
	//   68  124:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   69  127:aload_0         
	//   70  128:getfield        #208 <Field float mLastOffset>
	//   71  131:invokestatic    #526 <Method float Math.min(float, float)>
	//   72  134:fstore          5
		else
	//*  73  136:iload_1         
	//*  74  137:aload_0         
	//*  75  138:invokevirtual   #436 <Method int getPaddingLeft()>
	//*  76  141:isub            
	//*  77  142:aload_0         
	//*  78  143:invokevirtual   #439 <Method int getPaddingRight()>
	//*  79  146:isub            
	//*  80  147:i2f             
	//*  81  148:fload           5
	//*  82  150:fmul            
	//*  83  151:f2i             
	//*  84  152:istore_1        
	//*  85  153:iload_1         
	//*  86  154:aload_0         
	//*  87  155:invokevirtual   #283 <Method int getScrollX()>
	//*  88  158:icmpeq          40
	//*  89  161:aload_0         
	//*  90  162:iconst_0        
	//*  91  163:invokespecial   #528 <Method void completeScroll(boolean)>
	//*  92  166:aload_0         
	//*  93  167:iload_1         
	//*  94  168:aload_0         
	//*  95  169:invokevirtual   #286 <Method int getScrollY()>
	//*  96  172:invokevirtual   #296 <Method void scrollTo(int, int)>
	//*  97  175:return          
			f1 = 0.0F;
	//   98  176:fconst_0        
	//   99  177:fstore          5
		i = (int)((float)(i - getPaddingLeft() - getPaddingRight()) * f1);
		if(i != getScrollX())
		{
			completeScroll(false);
			scrollTo(i, getScrollY());
			return;
		}
		if(true) goto _L6; else goto _L5
	//  100  179:goto            136
_L5:
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
		return mLeftEdge.isFinished() || mRightEdge.isFinished();
	//   11   23:aload_0         
	//   12   24:getfield        #498 <Field EdgeEffect mLeftEdge>
	//   13   27:invokevirtual   #553 <Method boolean EdgeEffect.isFinished()>
	//   14   30:ifne            43
	//   15   33:aload_0         
	//   16   34:getfield        #509 <Field EdgeEffect mRightEdge>
	//   17   37:invokevirtual   #553 <Method boolean EdgeEffect.isFinished()>
	//   18   40:ifeq            45
	//   19   43:iconst_1        
	//   20   44:ireturn         
	//   21   45:iconst_0        
	//   22   46:ireturn         
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
	//*  30   57:ifeq            65
				dispatchOnPageSelected(i);
	//   31   60:aload_0         
	//   32   61:iload_1         
	//   33   62:invokespecial   #563 <Method void dispatchOnPageSelected(int)>
			return;
	//   34   65:return          
		}
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
			int j;
			if(mDrawingOrderedChildren == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #570 <Field ArrayList mDrawingOrderedChildren>
	//*   5   11:ifnonnull       59
				mDrawingOrderedChildren = new ArrayList();
	//    6   14:aload_0         
	//    7   15:new             #185 <Class ArrayList>
	//    8   18:dup             
	//    9   19:invokespecial   #186 <Method void ArrayList()>
	//   10   22:putfield        #570 <Field ArrayList mDrawingOrderedChildren>
			else
	//*  11   25:aload_0         
	//*  12   26:invokevirtual   #367 <Method int getChildCount()>
	//*  13   29:istore_2        
	//*  14   30:iconst_0        
	//*  15   31:istore_1        
	//*  16   32:iload_1         
	//*  17   33:iload_2         
	//*  18   34:icmpge          69
	//*  19   37:aload_0         
	//*  20   38:iload_1         
	//*  21   39:invokevirtual   #373 <Method View getChildAt(int)>
	//*  22   42:astore_3        
	//*  23   43:aload_0         
	//*  24   44:getfield        #570 <Field ArrayList mDrawingOrderedChildren>
	//*  25   47:aload_3         
	//*  26   48:invokevirtual   #574 <Method boolean ArrayList.add(Object)>
	//*  27   51:pop             
	//*  28   52:iload_1         
	//*  29   53:iconst_1        
	//*  30   54:iadd            
	//*  31   55:istore_1        
	//*  32   56:goto            32
				mDrawingOrderedChildren.clear();
	//   33   59:aload_0         
	//   34   60:getfield        #570 <Field ArrayList mDrawingOrderedChildren>
	//   35   63:invokevirtual   #575 <Method void ArrayList.clear()>
			j = getChildCount();
			for(int i = 0; i < j; i++)
			{
				View view = getChildAt(i);
				mDrawingOrderedChildren.add(((Object) (view)));
			}

	//*  36   66:goto            25
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
				if(view.getVisibility() == 0)
	//*  19   40:aload           7
	//*  20   42:invokevirtual   #590 <Method int View.getVisibility()>
	//*  21   45:ifne            81
				{
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
	//*  31   67:getfield        #337 <Field int mCurItem>
	//*  32   70:icmpne          81
						view.addFocusables(arraylist, i, j);
	//   33   73:aload           7
	//   34   75:aload_1         
	//   35   76:iload_2         
	//   36   77:iload_3         
	//   37   78:invokevirtual   #596 <Method void View.addFocusables(ArrayList, int, int)>
				}
			}

	//   38   81:iload           4
	//   39   83:iconst_1        
	//   40   84:iadd            
	//   41   85:istore          4
		}
	//*  42   87:goto            23
		while(i1 == 0x40000 && l != arraylist.size() || !isFocusable() || (j & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode() || arraylist == null) 
	//*  43   90:iload           6
	//*  44   92:ldc2            #597 <Int 0x40000>
	//*  45   95:icmpne          107
	//*  46   98:iload           5
	//*  47  100:aload_1         
	//*  48  101:invokevirtual   #256 <Method int ArrayList.size()>
	//*  49  104:icmpne          114
	//*  50  107:aload_0         
	//*  51  108:invokevirtual   #600 <Method boolean isFocusable()>
	//*  52  111:ifne            115
			return;
	//   53  114:return          
	//   54  115:iload_3         
	//   55  116:iconst_1        
	//   56  117:iand            
	//   57  118:iconst_1        
	//   58  119:icmpne          136
	//   59  122:aload_0         
	//   60  123:invokevirtual   #603 <Method boolean isInTouchMode()>
	//   61  126:ifeq            136
	//   62  129:aload_0         
	//   63  130:invokevirtual   #606 <Method boolean isFocusableInTouchMode()>
	//   64  133:ifeq            114
	//   65  136:aload_1         
	//   66  137:ifnull          114
		arraylist.add(((Object) (this)));
	//   67  140:aload_1         
	//   68  141:aload_0         
	//   69  142:invokevirtual   #574 <Method boolean ArrayList.add(Object)>
	//   70  145:pop             
	//   71  146:return          
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
	//   30   58:invokevirtual   #574 <Method boolean ArrayList.add(Object)>
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
	//*  22   41:getfield        #337 <Field int mCurItem>
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
		if(view != this) goto _L2; else goto _L1
	//    3    6:aload           6
	//    4    8:aload_0         
	//    5    9:if_acmpne       108
_L1:
		Object obj = null;
	//    6   12:aconst_null     
	//    7   13:astore          5
_L4:
		boolean flag1 = false;
	//    8   15:iconst_0        
	//    9   16:istore          4
		view = FocusFinder.getInstance().findNextFocus(((ViewGroup) (this)), ((View) (obj)), i);
	//   10   18:invokestatic    #669 <Method FocusFinder FocusFinder.getInstance()>
	//   11   21:aload_0         
	//   12   22:aload           5
	//   13   24:iload_1         
	//   14   25:invokevirtual   #673 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   15   28:astore          6
		if(view != null && view != obj)
	//*  16   30:aload           6
	//*  17   32:ifnull          343
	//*  18   35:aload           6
	//*  19   37:aload           5
	//*  20   39:if_acmpeq       343
		{
			if(i == 17)
	//*  21   42:iload_1         
	//*  22   43:bipush          17
	//*  23   45:icmpne          280
			{
				int j = getChildRectInPagerCoordinates(mTempRect, view).left;
	//   24   48:aload_0         
	//   25   49:aload_0         
	//   26   50:getfield        #196 <Field Rect mTempRect>
	//   27   53:aload           6
	//   28   55:invokespecial   #675 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//   29   58:getfield        #403 <Field int Rect.left>
	//   30   61:istore_2        
				int l = getChildRectInPagerCoordinates(mTempRect, ((View) (obj))).left;
	//   31   62:aload_0         
	//   32   63:aload_0         
	//   33   64:getfield        #196 <Field Rect mTempRect>
	//   34   67:aload           5
	//   35   69:invokespecial   #675 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//   36   72:getfield        #403 <Field int Rect.left>
	//   37   75:istore_3        
				boolean flag;
				StringBuilder stringbuilder;
				if(obj != null && j >= l)
	//*  38   76:aload           5
	//*  39   78:ifnull          270
	//*  40   81:iload_2         
	//*  41   82:iload_3         
	//*  42   83:icmplt          270
					flag1 = pageLeft();
	//   43   86:aload_0         
	//   44   87:invokevirtual   #678 <Method boolean pageLeft()>
	//   45   90:istore          4
				else
	//*  46   92:iload           4
	//*  47   94:ifeq            105
	//*  48   97:aload_0         
	//*  49   98:iload_1         
	//*  50   99:invokestatic    #683 <Method int SoundEffectConstants.getContantForFocusDirection(int)>
	//*  51  102:invokevirtual   #686 <Method void playSoundEffect(int)>
	//*  52  105:iload           4
	//*  53  107:ireturn         
	//*  54  108:aload           6
	//*  55  110:astore          5
	//*  56  112:aload           6
	//*  57  114:ifnull          15
	//*  58  117:iconst_0        
	//*  59  118:istore_3        
	//*  60  119:aload           6
	//*  61  121:invokevirtual   #425 <Method ViewParent View.getParent()>
	//*  62  124:astore          5
	//*  63  126:iload_3         
	//*  64  127:istore_2        
	//*  65  128:aload           5
	//*  66  130:instanceof      #4   <Class ViewGroup>
	//*  67  133:ifeq            144
	//*  68  136:aload           5
	//*  69  138:aload_0         
	//*  70  139:if_acmpne       222
	//*  71  142:iconst_1        
	//*  72  143:istore_2        
	//*  73  144:aload           6
	//*  74  146:astore          5
	//*  75  148:iload_2         
	//*  76  149:ifne            15
	//*  77  152:new             #688 <Class StringBuilder>
	//*  78  155:dup             
	//*  79  156:invokespecial   #689 <Method void StringBuilder()>
	//*  80  159:astore          7
	//*  81  161:aload           7
	//*  82  163:aload           6
	//*  83  165:invokevirtual   #450 <Method Class Object.getClass()>
	//*  84  168:invokevirtual   #693 <Method String Class.getSimpleName()>
	//*  85  171:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//*  86  174:pop             
	//*  87  175:aload           6
	//*  88  177:invokevirtual   #425 <Method ViewParent View.getParent()>
	//*  89  180:astore          5
	//*  90  182:aload           5
	//*  91  184:instanceof      #4   <Class ViewGroup>
	//*  92  187:ifeq            234
	//*  93  190:aload           7
	//*  94  192:ldc2            #699 <String " => ">
	//*  95  195:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//*  96  198:aload           5
	//*  97  200:invokevirtual   #450 <Method Class Object.getClass()>
	//*  98  203:invokevirtual   #693 <Method String Class.getSimpleName()>
	//*  99  206:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//* 100  209:pop             
	//* 101  210:aload           5
	//* 102  212:invokeinterface #700 <Method ViewParent ViewParent.getParent()>
	//* 103  217:astore          5
	//* 104  219:goto            182
	//* 105  222:aload           5
	//* 106  224:invokeinterface #700 <Method ViewParent ViewParent.getParent()>
	//* 107  229:astore          5
	//* 108  231:goto            126
	//* 109  234:ldc1            #80  <String "ViewPager">
	//* 110  236:new             #688 <Class StringBuilder>
	//* 111  239:dup             
	//* 112  240:invokespecial   #689 <Method void StringBuilder()>
	//* 113  243:ldc2            #702 <String "arrowScroll tried to find focus based on non-child current focused view ">
	//* 114  246:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//* 115  249:aload           7
	//* 116  251:invokevirtual   #705 <Method String StringBuilder.toString()>
	//* 117  254:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//* 118  257:invokevirtual   #705 <Method String StringBuilder.toString()>
	//* 119  260:invokestatic    #711 <Method int Log.e(String, String)>
	//* 120  263:pop             
	//* 121  264:aconst_null     
	//* 122  265:astore          5
	//* 123  267:goto            15
					flag1 = view.requestFocus();
	//  124  270:aload           6
	//  125  272:invokevirtual   #714 <Method boolean View.requestFocus()>
	//  126  275:istore          4
			} else
	//* 127  277:goto            92
			if(i == 66)
	//* 128  280:iload_1         
	//* 129  281:bipush          66
	//* 130  283:icmpne          92
			{
				int k = getChildRectInPagerCoordinates(mTempRect, view).left;
	//  131  286:aload_0         
	//  132  287:aload_0         
	//  133  288:getfield        #196 <Field Rect mTempRect>
	//  134  291:aload           6
	//  135  293:invokespecial   #675 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//  136  296:getfield        #403 <Field int Rect.left>
	//  137  299:istore_2        
				int i1 = getChildRectInPagerCoordinates(mTempRect, ((View) (obj))).left;
	//  138  300:aload_0         
	//  139  301:aload_0         
	//  140  302:getfield        #196 <Field Rect mTempRect>
	//  141  305:aload           5
	//  142  307:invokespecial   #675 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//  143  310:getfield        #403 <Field int Rect.left>
	//  144  313:istore_3        
				if(obj != null && k <= i1)
	//* 145  314:aload           5
	//* 146  316:ifnull          333
	//* 147  319:iload_2         
	//* 148  320:iload_3         
	//* 149  321:icmpgt          333
					flag1 = pageRight();
	//  150  324:aload_0         
	//  151  325:invokevirtual   #717 <Method boolean pageRight()>
	//  152  328:istore          4
				else
	//* 153  330:goto            92
					flag1 = view.requestFocus();
	//  154  333:aload           6
	//  155  335:invokevirtual   #714 <Method boolean View.requestFocus()>
	//  156  338:istore          4
			}
		} else
	//* 157  340:goto            92
		if(i == 17 || i == 1)
	//* 158  343:iload_1         
	//* 159  344:bipush          17
	//* 160  346:icmpeq          354
	//* 161  349:iload_1         
	//* 162  350:iconst_1        
	//* 163  351:icmpne          363
			flag1 = pageLeft();
	//  164  354:aload_0         
	//  165  355:invokevirtual   #678 <Method boolean pageLeft()>
	//  166  358:istore          4
		else
	//* 167  360:goto            92
		if(i == 66 || i == 2)
	//* 168  363:iload_1         
	//* 169  364:bipush          66
	//* 170  366:icmpeq          374
	//* 171  369:iload_1         
	//* 172  370:iconst_2        
	//* 173  371:icmpne          92
			flag1 = pageRight();
	//  174  374:aload_0         
	//  175  375:invokevirtual   #717 <Method boolean pageRight()>
	//  176  378:istore          4
		if(flag1)
			playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
		return flag1;
_L2:
		obj = ((Object) (view));
		if(view == null) goto _L4; else goto _L3
_L3:
		l = 0;
		obj = ((Object) (view.getParent()));
_L5:
label0:
		{
			flag = ((boolean) (l));
			if(obj instanceof ViewGroup)
			{
				if(obj != this)
					break label0;
				flag = true;
			}
			obj = ((Object) (view));
			if(!flag)
			{
				stringbuilder = new StringBuilder();
				stringbuilder.append(((Object) (view)).getClass().getSimpleName());
				for(obj = ((Object) (view.getParent())); obj instanceof ViewGroup; obj = ((Object) (((ViewParent) (obj)).getParent())))
					stringbuilder.append(" => ").append(obj.getClass().getSimpleName());

				break MISSING_BLOCK_LABEL_234;
			}
		}
		  goto _L4
		obj = ((Object) (((ViewParent) (obj)).getParent()));
		  goto _L5
		Log.e("ViewPager", (new StringBuilder()).append("arrowScroll tried to find focus based on non-child current focused view ").append(stringbuilder.toString()).toString());
		obj = null;
		  goto _L4
	//* 177  380:goto            92
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
		long l;
		MotionEvent motionevent;
		if(mVelocityTracker == null)
	//*  17   29:aload_0         
	//*  18   30:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//*  19   33:ifnonnull       76
			mVelocityTracker = VelocityTracker.obtain();
	//   20   36:aload_0         
	//   21   37:invokestatic    #729 <Method VelocityTracker VelocityTracker.obtain()>
	//   22   40:putfield        #386 <Field VelocityTracker mVelocityTracker>
		else
	//*  23   43:invokestatic    #735 <Method long SystemClock.uptimeMillis()>
	//*  24   46:lstore_1        
	//*  25   47:lload_1         
	//*  26   48:lload_1         
	//*  27   49:iconst_0        
	//*  28   50:fconst_0        
	//*  29   51:fconst_0        
	//*  30   52:iconst_0        
	//*  31   53:invokestatic    #738 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//*  32   56:astore_3        
	//*  33   57:aload_0         
	//*  34   58:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//*  35   61:aload_3         
	//*  36   62:invokevirtual   #741 <Method void VelocityTracker.addMovement(MotionEvent)>
	//*  37   65:aload_3         
	//*  38   66:invokevirtual   #742 <Method void MotionEvent.recycle()>
	//*  39   69:aload_0         
	//*  40   70:lload_1         
	//*  41   71:putfield        #744 <Field long mFakeDragBeginTime>
	//*  42   74:iconst_1        
	//*  43   75:ireturn         
			mVelocityTracker.clear();
	//   44   76:aload_0         
	//   45   77:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//   46   80:invokevirtual   #482 <Method void VelocityTracker.clear()>
		l = SystemClock.uptimeMillis();
		motionevent = MotionEvent.obtain(l, l, 0, 0.0F, 0.0F, 0);
		mVelocityTracker.addMovement(motionevent);
		motionevent.recycle();
		mFakeDragBeginTime = l;
		return true;
	//*  47   83:goto            43
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
		boolean flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		boolean flag = true;
	//    2    3:iconst_1        
	//    3    4:istore          4
		if(mAdapter != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #233 <Field PagerAdapter mAdapter>
	//*   6   10:ifnonnull       15
	//*   7   13:iconst_0        
	//*   8   14:ireturn         
		{
			int j = getClientWidth();
	//    9   15:aload_0         
	//   10   16:invokespecial   #242 <Method int getClientWidth()>
	//   11   19:istore_2        
			int k = getScrollX();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #283 <Method int getScrollX()>
	//   14   24:istore_3        
			if(i < 0)
	//*  15   25:iload_1         
	//*  16   26:ifge            50
			{
				if(k <= (int)((float)j * mFirstOffset))
	//*  17   29:iload_3         
	//*  18   30:iload_2         
	//*  19   31:i2f             
	//*  20   32:aload_0         
	//*  21   33:getfield        #205 <Field float mFirstOffset>
	//*  22   36:fmul            
	//*  23   37:f2i             
	//*  24   38:icmple          44
	//*  25   41:iload           4
	//*  26   43:ireturn         
					flag = false;
	//   27   44:iconst_0        
	//   28   45:istore          4
				return flag;
			}
	//*  29   47:goto            41
			if(i > 0)
	//*  30   50:iload_1         
	//*  31   51:ifle            13
			{
				boolean flag1;
				if(k < (int)((float)j * mLastOffset))
	//*  32   54:iload_3         
	//*  33   55:iload_2         
	//*  34   56:i2f             
	//*  35   57:aload_0         
	//*  36   58:getfield        #208 <Field float mLastOffset>
	//*  37   61:fmul            
	//*  38   62:f2i             
	//*  39   63:icmpge          73
					flag1 = flag2;
	//   40   66:iload           5
	//   41   68:istore          4
				else
	//*  42   70:iload           4
	//*  43   72:ireturn         
					flag1 = false;
	//   44   73:iconst_0        
	//   45   74:istore          4
				return flag1;
			}
		}
		return false;
	//*  46   76:goto            70
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
		int i2 = mAdapter.getCount();
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field PagerAdapter mAdapter>
	//    2    4:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//    3    7:istore          9
		mExpectedAdapterCount = i2;
	//    4    9:aload_0         
	//    5   10:iload           9
	//    6   12:putfield        #771 <Field int mExpectedAdapterCount>
		boolean flag;
		int j;
		boolean flag1;
		int l;
		if(mItems.size() < mOffscreenPageLimit * 2 + 1 && mItems.size() < i2)
	//*   7   15:aload_0         
	//*   8   16:getfield        #188 <Field ArrayList mItems>
	//*   9   19:invokevirtual   #256 <Method int ArrayList.size()>
	//*  10   22:aload_0         
	//*  11   23:getfield        #210 <Field int mOffscreenPageLimit>
	//*  12   26:iconst_2        
	//*  13   27:imul            
	//*  14   28:iconst_1        
	//*  15   29:iadd            
	//*  16   30:icmpge          128
	//*  17   33:aload_0         
	//*  18   34:getfield        #188 <Field ArrayList mItems>
	//*  19   37:invokevirtual   #256 <Method int ArrayList.size()>
	//*  20   40:iload           9
	//*  21   42:icmpge          128
			flag = true;
	//   22   45:iconst_1        
	//   23   46:istore_1        
		else
	//*  24   47:aload_0         
	//*  25   48:getfield        #337 <Field int mCurItem>
	//*  26   51:istore_2        
	//*  27   52:iconst_0        
	//*  28   53:istore_3        
	//*  29   54:iconst_0        
	//*  30   55:istore          4
	//*  31   57:iload           4
	//*  32   59:aload_0         
	//*  33   60:getfield        #188 <Field ArrayList mItems>
	//*  34   63:invokevirtual   #256 <Method int ArrayList.size()>
	//*  35   66:icmpge          304
	//*  36   69:aload_0         
	//*  37   70:getfield        #188 <Field ArrayList mItems>
	//*  38   73:iload           4
	//*  39   75:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//*  40   78:checkcast       #17  <Class ViewPager$ItemInfo>
	//*  41   81:astore          10
	//*  42   83:aload_0         
	//*  43   84:getfield        #233 <Field PagerAdapter mAdapter>
	//*  44   87:aload           10
	//*  45   89:getfield        #618 <Field Object ViewPager$ItemInfo.object>
	//*  46   92:invokevirtual   #775 <Method int PagerAdapter.getItemPosition(Object)>
	//*  47   95:istore          8
	//*  48   97:iload           8
	//*  49   99:iconst_m1       
	//*  50  100:icmpne          133
	//*  51  103:iload_2         
	//*  52  104:istore          5
	//*  53  106:iload_3         
	//*  54  107:istore          6
	//*  55  109:iload           4
	//*  56  111:istore          7
	//*  57  113:iload           7
	//*  58  115:iconst_1        
	//*  59  116:iadd            
	//*  60  117:istore          4
	//*  61  119:iload           6
	//*  62  121:istore_3        
	//*  63  122:iload           5
	//*  64  124:istore_2        
	//*  65  125:goto            57
			flag = false;
	//   66  128:iconst_0        
	//   67  129:istore_1        
		j = mCurItem;
		flag1 = false;
		l = 0;
		while(l < mItems.size()) 
		{
			ItemInfo iteminfo = (ItemInfo)mItems.get(l);
			int l1 = mAdapter.getItemPosition(iteminfo.object);
			int i1;
			int j1;
			int k1;
			if(l1 == -1)
			{
				i1 = j;
				j1 = ((int) (flag1));
				k1 = l;
			} else
	//*  68  130:goto            47
			if(l1 == -2)
	//*  69  133:iload           8
	//*  70  135:bipush          -2
	//*  71  137:icmpne          247
			{
				mItems.remove(l);
	//   72  140:aload_0         
	//   73  141:getfield        #188 <Field ArrayList mItems>
	//   74  144:iload           4
	//   75  146:invokevirtual   #778 <Method Object ArrayList.remove(int)>
	//   76  149:pop             
				l1 = l - 1;
	//   77  150:iload           4
	//   78  152:iconst_1        
	//   79  153:isub            
	//   80  154:istore          8
				l = ((int) (flag1));
	//   81  156:iload_3         
	//   82  157:istore          4
				if(!flag1)
	//*  83  159:iload_3         
	//*  84  160:ifne            174
				{
					mAdapter.startUpdate(((ViewGroup) (this)));
	//   85  163:aload_0         
	//   86  164:getfield        #233 <Field PagerAdapter mAdapter>
	//   87  167:aload_0         
	//   88  168:invokevirtual   #782 <Method void PagerAdapter.startUpdate(ViewGroup)>
					l = 1;
	//   89  171:iconst_1        
	//   90  172:istore          4
				}
				mAdapter.destroyItem(((ViewGroup) (this)), iteminfo.position, iteminfo.object);
	//   91  174:aload_0         
	//   92  175:getfield        #233 <Field PagerAdapter mAdapter>
	//   93  178:aload_0         
	//   94  179:aload           10
	//   95  181:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   96  184:aload           10
	//   97  186:getfield        #618 <Field Object ViewPager$ItemInfo.object>
	//   98  189:invokevirtual   #786 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
				flag = true;
	//   99  192:iconst_1        
	//  100  193:istore_1        
				k1 = l1;
	//  101  194:iload           8
	//  102  196:istore          7
				j1 = l;
	//  103  198:iload           4
	//  104  200:istore          6
				i1 = j;
	//  105  202:iload_2         
	//  106  203:istore          5
				if(mCurItem == iteminfo.position)
	//* 107  205:aload_0         
	//* 108  206:getfield        #337 <Field int mCurItem>
	//* 109  209:aload           10
	//* 110  211:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 111  214:icmpne          113
				{
					i1 = Math.max(0, Math.min(mCurItem, i2 - 1));
	//  112  217:iconst_0        
	//  113  218:aload_0         
	//  114  219:getfield        #337 <Field int mCurItem>
	//  115  222:iload           9
	//  116  224:iconst_1        
	//  117  225:isub            
	//  118  226:invokestatic    #332 <Method int Math.min(int, int)>
	//  119  229:invokestatic    #335 <Method int Math.max(int, int)>
	//  120  232:istore          5
					flag = true;
	//  121  234:iconst_1        
	//  122  235:istore_1        
					k1 = l1;
	//  123  236:iload           8
	//  124  238:istore          7
					j1 = l;
	//  125  240:iload           4
	//  126  242:istore          6
				}
			} else
	//* 127  244:goto            113
			{
				k1 = l;
	//  128  247:iload           4
	//  129  249:istore          7
				j1 = ((int) (flag1));
	//  130  251:iload_3         
	//  131  252:istore          6
				i1 = j;
	//  132  254:iload_2         
	//  133  255:istore          5
				if(iteminfo.position != l1)
	//* 134  257:aload           10
	//* 135  259:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 136  262:iload           8
	//* 137  264:icmpeq          113
				{
					if(iteminfo.position == mCurItem)
	//* 138  267:aload           10
	//* 139  269:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 140  272:aload_0         
	//* 141  273:getfield        #337 <Field int mCurItem>
	//* 142  276:icmpne          282
						j = l1;
	//  143  279:iload           8
	//  144  281:istore_2        
					iteminfo.position = l1;
	//  145  282:aload           10
	//  146  284:iload           8
	//  147  286:putfield        #247 <Field int ViewPager$ItemInfo.position>
					flag = true;
	//  148  289:iconst_1        
	//  149  290:istore_1        
					k1 = l;
	//  150  291:iload           4
	//  151  293:istore          7
					j1 = ((int) (flag1));
	//  152  295:iload_3         
	//  153  296:istore          6
					i1 = j;
	//  154  298:iload_2         
	//  155  299:istore          5
				}
			}
			l = k1 + 1;
			flag1 = ((boolean) (j1));
			j = i1;
		}
	//* 156  301:goto            113
		if(flag1)
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
			int k = getChildCount();
	//  169  330:aload_0         
	//  170  331:invokevirtual   #367 <Method int getChildCount()>
	//  171  334:istore_3        
			for(int i = 0; i < k; i++)
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
	//*  32   62:getfield        #337 <Field int mCurItem>
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
		return (float)Math.sin((f - 0.5F) * 0.4712389F);
	//    0    0:fload_1         
	//    1    1:ldc2            #816 <Float 0.5F>
	//    2    4:fsub            
	//    3    5:ldc2            #817 <Float 0.4712389F>
	//    4    8:fmul            
	//    5    9:f2d             
	//    6   10:invokestatic    #821 <Method double Math.sin(double)>
	//    7   13:d2f             
	//    8   14:freturn         
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #825 <Method void ViewGroup.draw(Canvas)>
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		int i = 0;
	//    5    7:iconst_0        
	//    6    8:istore_2        
		int k = getOverScrollMode();
	//    7    9:aload_0         
	//    8   10:invokevirtual   #828 <Method int getOverScrollMode()>
	//    9   13:istore          4
		if(k == 0 || k == 1 && mAdapter != null && mAdapter.getCount() > 1)
	//*  10   15:iload           4
	//*  11   17:ifeq            44
	//*  12   20:iload           4
	//*  13   22:iconst_1        
	//*  14   23:icmpne          243
	//*  15   26:aload_0         
	//*  16   27:getfield        #233 <Field PagerAdapter mAdapter>
	//*  17   30:ifnull          243
	//*  18   33:aload_0         
	//*  19   34:getfield        #233 <Field PagerAdapter mAdapter>
	//*  20   37:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*  21   40:iconst_1        
	//*  22   41:icmple          243
		{
			if(!mLeftEdge.isFinished())
	//*  23   44:aload_0         
	//*  24   45:getfield        #498 <Field EdgeEffect mLeftEdge>
	//*  25   48:invokevirtual   #553 <Method boolean EdgeEffect.isFinished()>
	//*  26   51:ifne            133
			{
				j = canvas.save();
	//   27   54:aload_1         
	//   28   55:invokevirtual   #833 <Method int Canvas.save()>
	//   29   58:istore_3        
				i = getHeight() - getPaddingTop() - getPaddingBottom();
	//   30   59:aload_0         
	//   31   60:invokevirtual   #836 <Method int getHeight()>
	//   32   63:aload_0         
	//   33   64:invokevirtual   #839 <Method int getPaddingTop()>
	//   34   67:isub            
	//   35   68:aload_0         
	//   36   69:invokevirtual   #842 <Method int getPaddingBottom()>
	//   37   72:isub            
	//   38   73:istore_2        
				int l = getWidth();
	//   39   74:aload_0         
	//   40   75:invokevirtual   #464 <Method int getWidth()>
	//   41   78:istore          4
				canvas.rotate(270F);
	//   42   80:aload_1         
	//   43   81:ldc2            #843 <Float 270F>
	//   44   84:invokevirtual   #846 <Method void Canvas.rotate(float)>
				canvas.translate(-i + getPaddingTop(), mFirstOffset * (float)l);
	//   45   87:aload_1         
	//   46   88:iload_2         
	//   47   89:ineg            
	//   48   90:aload_0         
	//   49   91:invokevirtual   #839 <Method int getPaddingTop()>
	//   50   94:iadd            
	//   51   95:i2f             
	//   52   96:aload_0         
	//   53   97:getfield        #205 <Field float mFirstOffset>
	//   54  100:iload           4
	//   55  102:i2f             
	//   56  103:fmul            
	//   57  104:invokevirtual   #850 <Method void Canvas.translate(float, float)>
				mLeftEdge.setSize(i, l);
	//   58  107:aload_0         
	//   59  108:getfield        #498 <Field EdgeEffect mLeftEdge>
	//   60  111:iload_2         
	//   61  112:iload           4
	//   62  114:invokevirtual   #853 <Method void EdgeEffect.setSize(int, int)>
				i = ((int) (false | mLeftEdge.draw(canvas)));
	//   63  117:iconst_0        
	//   64  118:aload_0         
	//   65  119:getfield        #498 <Field EdgeEffect mLeftEdge>
	//   66  122:aload_1         
	//   67  123:invokevirtual   #856 <Method boolean EdgeEffect.draw(Canvas)>
	//   68  126:ior             
	//   69  127:istore_2        
				canvas.restoreToCount(j);
	//   70  128:aload_1         
	//   71  129:iload_3         
	//   72  130:invokevirtual   #859 <Method void Canvas.restoreToCount(int)>
			}
			j = i;
	//   73  133:iload_2         
	//   74  134:istore_3        
			if(!mRightEdge.isFinished())
	//*  75  135:aload_0         
	//*  76  136:getfield        #509 <Field EdgeEffect mRightEdge>
	//*  77  139:invokevirtual   #553 <Method boolean EdgeEffect.isFinished()>
	//*  78  142:ifne            234
			{
				int i1 = canvas.save();
	//   79  145:aload_1         
	//   80  146:invokevirtual   #833 <Method int Canvas.save()>
	//   81  149:istore          4
				j = getWidth();
	//   82  151:aload_0         
	//   83  152:invokevirtual   #464 <Method int getWidth()>
	//   84  155:istore_3        
				int j1 = getHeight();
	//   85  156:aload_0         
	//   86  157:invokevirtual   #836 <Method int getHeight()>
	//   87  160:istore          5
				int k1 = getPaddingTop();
	//   88  162:aload_0         
	//   89  163:invokevirtual   #839 <Method int getPaddingTop()>
	//   90  166:istore          6
				int l1 = getPaddingBottom();
	//   91  168:aload_0         
	//   92  169:invokevirtual   #842 <Method int getPaddingBottom()>
	//   93  172:istore          7
				canvas.rotate(90F);
	//   94  174:aload_1         
	//   95  175:ldc2            #860 <Float 90F>
	//   96  178:invokevirtual   #846 <Method void Canvas.rotate(float)>
				canvas.translate(-getPaddingTop(), -(mLastOffset + 1.0F) * (float)j);
	//   97  181:aload_1         
	//   98  182:aload_0         
	//   99  183:invokevirtual   #839 <Method int getPaddingTop()>
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
	//  110  198:invokevirtual   #850 <Method void Canvas.translate(float, float)>
				mRightEdge.setSize(j1 - k1 - l1, j);
	//  111  201:aload_0         
	//  112  202:getfield        #509 <Field EdgeEffect mRightEdge>
	//  113  205:iload           5
	//  114  207:iload           6
	//  115  209:isub            
	//  116  210:iload           7
	//  117  212:isub            
	//  118  213:iload_3         
	//  119  214:invokevirtual   #853 <Method void EdgeEffect.setSize(int, int)>
				j = i | mRightEdge.draw(canvas);
	//  120  217:iload_2         
	//  121  218:aload_0         
	//  122  219:getfield        #509 <Field EdgeEffect mRightEdge>
	//  123  222:aload_1         
	//  124  223:invokevirtual   #856 <Method boolean EdgeEffect.draw(Canvas)>
	//  125  226:ior             
	//  126  227:istore_3        
				canvas.restoreToCount(i1);
	//  127  228:aload_1         
	//  128  229:iload           4
	//  129  231:invokevirtual   #859 <Method void Canvas.restoreToCount(int)>
			}
		} else
	//* 130  234:iload_3         
	//* 131  235:ifeq            242
	//* 132  238:aload_0         
	//* 133  239:invokestatic    #768 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//* 134  242:return          
		{
			mLeftEdge.finish();
	//  135  243:aload_0         
	//  136  244:getfield        #498 <Field EdgeEffect mLeftEdge>
	//  137  247:invokevirtual   #863 <Method void EdgeEffect.finish()>
			mRightEdge.finish();
	//  138  250:aload_0         
	//  139  251:getfield        #509 <Field EdgeEffect mRightEdge>
	//  140  254:invokevirtual   #863 <Method void EdgeEffect.finish()>
		}
		if(j != 0)
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//* 141  257:goto            234
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #866 <Method void ViewGroup.drawableStateChanged()>
		Drawable drawable = mMarginDrawable;
	//    2    4:aload_0         
	//    3    5:getfield        #868 <Field Drawable mMarginDrawable>
	//    4    8:astore_1        
		if(drawable != null && drawable.isStateful())
	//*   5    9:aload_1         
	//*   6   10:ifnull          29
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #873 <Method boolean Drawable.isStateful()>
	//*   9   17:ifeq            29
			drawable.setState(getDrawableState());
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #877 <Method int[] getDrawableState()>
	//   13   25:invokevirtual   #881 <Method boolean Drawable.setState(int[])>
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
	//    5   11:ldc2            #884 <String "No fake drag in progress. Call beginFakeDrag first.">
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
	//   17   37:getfield        #886 <Field int mMaximumVelocity>
	//   18   40:i2f             
	//   19   41:invokevirtual   #890 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
			int i = (int)((VelocityTracker) (obj)).getXVelocity(mActivePointerId);
	//   20   44:aload           4
	//   21   46:aload_0         
	//   22   47:getfield        #212 <Field int mActivePointerId>
	//   23   50:invokevirtual   #893 <Method float VelocityTracker.getXVelocity(int)>
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
	//   60  111:invokespecial   #895 <Method int determineTargetPage(int, float, int, int)>
	//   61  114:iconst_1        
	//   62  115:iconst_1        
	//   63  116:iload_1         
	//   64  117:invokevirtual   #898 <Method void setCurrentItemInternal(int, boolean, boolean, int)>
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
		if(keyevent.getAction() != 0) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokevirtual   #903 <Method int KeyEvent.getAction()>
	//    2    4:ifne            44
_L1:
		keyevent.getKeyCode();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #906 <Method int KeyEvent.getKeyCode()>
		JVM INSTR lookupswitch 3: default 44
	//	               21: 46
	//	               22: 66
	//	               61: 86;
	//    5   11:lookupswitch    3: default 44
	//	               21: 46
	//	               22: 66
	//	               61: 86
		   goto _L2 _L3 _L4 _L5
_L2:
		return false;
	//    6   44:iconst_0        
	//    7   45:ireturn         
_L3:
		if(keyevent.hasModifiers(2))
	//*   8   46:aload_1         
	//*   9   47:iconst_2        
	//*  10   48:invokevirtual   #909 <Method boolean KeyEvent.hasModifiers(int)>
	//*  11   51:ifeq            59
			return pageLeft();
	//   12   54:aload_0         
	//   13   55:invokevirtual   #678 <Method boolean pageLeft()>
	//   14   58:ireturn         
		else
			return arrowScroll(17);
	//   15   59:aload_0         
	//   16   60:bipush          17
	//   17   62:invokevirtual   #911 <Method boolean arrowScroll(int)>
	//   18   65:ireturn         
_L4:
		if(keyevent.hasModifiers(2))
	//*  19   66:aload_1         
	//*  20   67:iconst_2        
	//*  21   68:invokevirtual   #909 <Method boolean KeyEvent.hasModifiers(int)>
	//*  22   71:ifeq            79
			return pageRight();
	//   23   74:aload_0         
	//   24   75:invokevirtual   #717 <Method boolean pageRight()>
	//   25   78:ireturn         
		else
			return arrowScroll(66);
	//   26   79:aload_0         
	//   27   80:bipush          66
	//   28   82:invokevirtual   #911 <Method boolean arrowScroll(int)>
	//   29   85:ireturn         
_L5:
		if(keyevent.hasNoModifiers())
	//*  30   86:aload_1         
	//*  31   87:invokevirtual   #914 <Method boolean KeyEvent.hasNoModifiers()>
	//*  32   90:ifeq            99
			return arrowScroll(2);
	//   33   93:aload_0         
	//   34   94:iconst_2        
	//   35   95:invokevirtual   #911 <Method boolean arrowScroll(int)>
	//   36   98:ireturn         
		if(keyevent.hasModifiers(1))
	//*  37   99:aload_1         
	//*  38  100:iconst_1        
	//*  39  101:invokevirtual   #909 <Method boolean KeyEvent.hasModifiers(int)>
	//*  40  104:ifeq            44
			return arrowScroll(1);
	//   41  107:aload_0         
	//   42  108:iconst_1        
	//   43  109:invokevirtual   #911 <Method boolean arrowScroll(int)>
	//   44  112:ireturn         
		if(true) goto _L2; else goto _L6
_L6:
	}

	public void fakeDragBy(float f)
	{
		float f1;
		float f2;
		if(!mFakeDragging)
	//*   0    0:aload_0         
	//*   1    1:getfield        #720 <Field boolean mFakeDragging>
	//*   2    4:ifne            18
			throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
	//    3    7:new             #487 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #884 <String "No fake drag in progress. Call beginFakeDrag first.">
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
		f2 = (float)getScrollX() - f;
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
		f1 = (float)i * mLastOffset;
	//   33   59:iload           4
	//   34   61:i2f             
	//   35   62:aload_0         
	//   36   63:getfield        #208 <Field float mLastOffset>
	//   37   66:fmul            
	//   38   67:fstore_2        
		ItemInfo iteminfo = (ItemInfo)mItems.get(0);
	//   39   68:aload_0         
	//   40   69:getfield        #188 <Field ArrayList mItems>
	//   41   72:iconst_0        
	//   42   73:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   43   76:checkcast       #17  <Class ViewPager$ItemInfo>
	//   44   79:astore          7
		ItemInfo iteminfo1 = (ItemInfo)mItems.get(mItems.size() - 1);
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
		if(iteminfo.position != 0)
	//*  55  102:aload           7
	//*  56  104:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  57  107:ifeq            120
			f = iteminfo.offset * (float)i;
	//   58  110:aload           7
	//   59  112:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   60  115:iload           4
	//   61  117:i2f             
	//   62  118:fmul            
	//   63  119:fstore_1        
		if(iteminfo1.position != mAdapter.getCount() - 1)
	//*  64  120:aload           8
	//*  65  122:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  66  125:aload_0         
	//*  67  126:getfield        #233 <Field PagerAdapter mAdapter>
	//*  68  129:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*  69  132:iconst_1        
	//*  70  133:isub            
	//*  71  134:icmpeq          147
			f1 = iteminfo1.offset * (float)i;
	//   72  137:aload           8
	//   73  139:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   74  142:iload           4
	//   75  144:i2f             
	//   76  145:fmul            
	//   77  146:fstore_2        
		if(f2 >= f) goto _L2; else goto _L1
	//   78  147:fload_3         
	//   79  148:fload_1         
	//   80  149:fcmpg           
	//   81  150:ifge            222
_L1:
		mLastMotionX = mLastMotionX + (f - (float)(int)f);
	//   82  153:aload_0         
	//   83  154:aload_0         
	//   84  155:getfield        #479 <Field float mLastMotionX>
	//   85  158:fload_1         
	//   86  159:fload_1         
	//   87  160:f2i             
	//   88  161:i2f             
	//   89  162:fsub            
	//   90  163:fadd            
	//   91  164:putfield        #479 <Field float mLastMotionX>
		scrollTo((int)f, getScrollY());
	//   92  167:aload_0         
	//   93  168:fload_1         
	//   94  169:f2i             
	//   95  170:aload_0         
	//   96  171:invokevirtual   #286 <Method int getScrollY()>
	//   97  174:invokevirtual   #296 <Method void scrollTo(int, int)>
		pageScrolled((int)f);
	//   98  177:aload_0         
	//   99  178:fload_1         
	//  100  179:f2i             
	//  101  180:invokespecial   #300 <Method boolean pageScrolled(int)>
	//  102  183:pop             
		long l = SystemClock.uptimeMillis();
	//  103  184:invokestatic    #735 <Method long SystemClock.uptimeMillis()>
	//  104  187:lstore          5
		MotionEvent motionevent = MotionEvent.obtain(mFakeDragBeginTime, l, 2, mLastMotionX, 0.0F, 0);
	//  105  189:aload_0         
	//  106  190:getfield        #744 <Field long mFakeDragBeginTime>
	//  107  193:lload           5
	//  108  195:iconst_2        
	//  109  196:aload_0         
	//  110  197:getfield        #479 <Field float mLastMotionX>
	//  111  200:fconst_0        
	//  112  201:iconst_0        
	//  113  202:invokestatic    #738 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//  114  205:astore          7
		mVelocityTracker.addMovement(motionevent);
	//  115  207:aload_0         
	//  116  208:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//  117  211:aload           7
	//  118  213:invokevirtual   #741 <Method void VelocityTracker.addMovement(MotionEvent)>
		motionevent.recycle();
	//  119  216:aload           7
	//  120  218:invokevirtual   #742 <Method void MotionEvent.recycle()>
		return;
	//  121  221:return          
_L2:
		f = f2;
	//  122  222:fload_3         
	//  123  223:fstore_1        
		if(f2 > f1)
	//* 124  224:fload_3         
	//* 125  225:fload_2         
	//* 126  226:fcmpl           
	//* 127  227:ifle            153
			f = f1;
	//  128  230:fload_2         
	//  129  231:fstore_1        
		if(true) goto _L1; else goto _L3
	//  130  232:goto            153
_L3:
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams()));
	//    0    0:new             #20  <Class ViewPager$LayoutParams>
	//    1    3:dup             
	//    2    4:invokespecial   #917 <Method void ViewPager$LayoutParams()>
	//    3    7:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #20  <Class ViewPager$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #922 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #923 <Method void ViewPager$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return generateDefaultLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #925 <Method android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()>
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
	//*   3    5:icmpne          35
			i = i - 1 - j;
	//    4    8:iload_1         
	//    5    9:iconst_1        
	//    6   10:isub            
	//    7   11:iload_2         
	//    8   12:isub            
	//    9   13:istore_1        
		else
	//*  10   14:aload_0         
	//*  11   15:getfield        #570 <Field ArrayList mDrawingOrderedChildren>
	//*  12   18:iload_1         
	//*  13   19:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//*  14   22:checkcast       #375 <Class View>
	//*  15   25:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  16   28:checkcast       #20  <Class ViewPager$LayoutParams>
	//*  17   31:getfield        #931 <Field int ViewPager$LayoutParams.childIndex>
	//*  18   34:ireturn         
			i = j;
	//   19   35:iload_2         
	//   20   36:istore_1        
		return ((LayoutParams)((View)mDrawingOrderedChildren.get(i)).getLayoutParams()).childIndex;
	//*  21   37:goto            14
	}

	public int getCurrentItem()
	{
		return mCurItem;
	//    0    0:aload_0         
	//    1    1:getfield        #337 <Field int mCurItem>
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
	//*  18   34:invokevirtual   #938 <Method boolean PagerAdapter.isViewFromObject(View, Object)>
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
	//    2    2:invokevirtual   #941 <Method void setWillNotDraw(boolean)>
		setDescendantFocusability(0x40000);
	//    3    5:aload_0         
	//    4    6:ldc2            #597 <Int 0x40000>
	//    5    9:invokevirtual   #944 <Method void setDescendantFocusability(int)>
		setFocusable(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #947 <Method void setFocusable(boolean)>
		Context context = getContext();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #922 <Method Context getContext()>
	//   11   21:astore_2        
		mScroller = new Scroller(context, sInterpolator);
	//   12   22:aload_0         
	//   13   23:new             #273 <Class Scroller>
	//   14   26:dup             
	//   15   27:aload_2         
	//   16   28:getstatic       #176 <Field Interpolator sInterpolator>
	//   17   31:invokespecial   #950 <Method void Scroller(Context, Interpolator)>
	//   18   34:putfield        #271 <Field Scroller mScroller>
		ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
	//   19   37:aload_2         
	//   20   38:invokestatic    #955 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   21   41:astore_3        
		float f = context.getResources().getDisplayMetrics().density;
	//   22   42:aload_2         
	//   23   43:invokevirtual   #961 <Method Resources Context.getResources()>
	//   24   46:invokevirtual   #967 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   25   49:getfield        #972 <Field float DisplayMetrics.density>
	//   26   52:fstore_1        
		mTouchSlop = viewconfiguration.getScaledPagingTouchSlop();
	//   27   53:aload_0         
	//   28   54:aload_3         
	//   29   55:invokevirtual   #975 <Method int ViewConfiguration.getScaledPagingTouchSlop()>
	//   30   58:putfield        #977 <Field int mTouchSlop>
		mMinimumVelocity = (int)(400F * f);
	//   31   61:aload_0         
	//   32   62:ldc2            #978 <Float 400F>
	//   33   65:fload_1         
	//   34   66:fmul            
	//   35   67:f2i             
	//   36   68:putfield        #328 <Field int mMinimumVelocity>
		mMaximumVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
	//   37   71:aload_0         
	//   38   72:aload_3         
	//   39   73:invokevirtual   #981 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   40   76:putfield        #886 <Field int mMaximumVelocity>
		mLeftEdge = new EdgeEffect(context);
	//   41   79:aload_0         
	//   42   80:new             #503 <Class EdgeEffect>
	//   43   83:dup             
	//   44   84:aload_2         
	//   45   85:invokespecial   #982 <Method void EdgeEffect(Context)>
	//   46   88:putfield        #498 <Field EdgeEffect mLeftEdge>
		mRightEdge = new EdgeEffect(context);
	//   47   91:aload_0         
	//   48   92:new             #503 <Class EdgeEffect>
	//   49   95:dup             
	//   50   96:aload_2         
	//   51   97:invokespecial   #982 <Method void EdgeEffect(Context)>
	//   52  100:putfield        #509 <Field EdgeEffect mRightEdge>
		mFlingDistance = (int)(25F * f);
	//   53  103:aload_0         
	//   54  104:ldc2            #983 <Float 25F>
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
	//   64  118:putfield        #985 <Field int mCloseEnough>
		mDefaultGutterSize = (int)(16F * f);
	//   65  121:aload_0         
	//   66  122:ldc2            #986 <Float 16F>
	//   67  125:fload_1         
	//   68  126:fmul            
	//   69  127:f2i             
	//   70  128:putfield        #988 <Field int mDefaultGutterSize>
		ViewCompat.setAccessibilityDelegate(((View) (this)), ((AccessibilityDelegateCompat) (new MyAccessibilityDelegate())));
	//   71  131:aload_0         
	//   72  132:new             #23  <Class ViewPager$MyAccessibilityDelegate>
	//   73  135:dup             
	//   74  136:aload_0         
	//   75  137:invokespecial   #989 <Method void ViewPager$MyAccessibilityDelegate(ViewPager)>
	//   76  140:invokestatic    #993 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
		if(ViewCompat.getImportantForAccessibility(((View) (this))) == 0)
	//*  77  143:aload_0         
	//*  78  144:invokestatic    #997 <Method int ViewCompat.getImportantForAccessibility(View)>
	//*  79  147:ifne            155
			ViewCompat.setImportantForAccessibility(((View) (this)), 1);
	//   80  150:aload_0         
	//   81  151:iconst_1        
	//   82  152:invokestatic    #1001 <Method void ViewCompat.setImportantForAccessibility(View, int)>
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
	//   87  161:invokespecial   #1002 <Method void ViewPager$4(ViewPager)>
	//   88  164:invokestatic    #1006 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
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
	//    1    1:invokespecial   #1010 <Method void ViewGroup.onAttachedToWindow()>
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
	//    3    5:invokevirtual   #1015 <Method boolean removeCallbacks(Runnable)>
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
	//   16   34:invokespecial   #1017 <Method void ViewGroup.onDetachedFromWindow()>
	//   17   37:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1020 <Method void ViewGroup.onDraw(Canvas)>
		if(mPageMargin <= 0 || mMarginDrawable == null || mItems.size() <= 0 || mAdapter == null) goto _L2; else goto _L1
	//    3    5:aload_0         
	//    4    6:getfield        #244 <Field int mPageMargin>
	//    5    9:ifle            270
	//    6   12:aload_0         
	//    7   13:getfield        #868 <Field Drawable mMarginDrawable>
	//    8   16:ifnull          270
	//    9   19:aload_0         
	//   10   20:getfield        #188 <Field ArrayList mItems>
	//   11   23:invokevirtual   #256 <Method int ArrayList.size()>
	//   12   26:ifle            270
	//   13   29:aload_0         
	//   14   30:getfield        #233 <Field PagerAdapter mAdapter>
	//   15   33:ifnull          270
_L1:
		float f;
		float f2;
		int i;
		int j;
		int k;
		int l;
		int i1;
		int j1;
		Object obj;
		k = getScrollX();
	//   16   36:aload_0         
	//   17   37:invokevirtual   #283 <Method int getScrollX()>
	//   18   40:istore          8
		l = getWidth();
	//   19   42:aload_0         
	//   20   43:invokevirtual   #464 <Method int getWidth()>
	//   21   46:istore          9
		f2 = (float)mPageMargin / (float)l;
	//   22   48:aload_0         
	//   23   49:getfield        #244 <Field int mPageMargin>
	//   24   52:i2f             
	//   25   53:iload           9
	//   26   55:i2f             
	//   27   56:fdiv            
	//   28   57:fstore          4
		j = 0;
	//   29   59:iconst_0        
	//   30   60:istore          7
		obj = ((Object) ((ItemInfo)mItems.get(0)));
	//   31   62:aload_0         
	//   32   63:getfield        #188 <Field ArrayList mItems>
	//   33   66:iconst_0        
	//   34   67:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   35   70:checkcast       #17  <Class ViewPager$ItemInfo>
	//   36   73:astore          12
		f = ((ItemInfo) (obj)).offset;
	//   37   75:aload           12
	//   38   77:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   39   80:fstore_2        
		i1 = mItems.size();
	//   40   81:aload_0         
	//   41   82:getfield        #188 <Field ArrayList mItems>
	//   42   85:invokevirtual   #256 <Method int ArrayList.size()>
	//   43   88:istore          10
		i = ((ItemInfo) (obj)).position;
	//   44   90:aload           12
	//   45   92:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   46   95:istore          6
		j1 = ((ItemInfo)mItems.get(i1 - 1)).position;
	//   47   97:aload_0         
	//   48   98:getfield        #188 <Field ArrayList mItems>
	//   49  101:iload           10
	//   50  103:iconst_1        
	//   51  104:isub            
	//   52  105:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   53  108:checkcast       #17  <Class ViewPager$ItemInfo>
	//   54  111:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   55  114:istore          11
_L6:
		if(i >= j1) goto _L2; else goto _L3
	//   56  116:iload           6
	//   57  118:iload           11
	//   58  120:icmpge          270
_L3:
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
	//*  82  174:icmpne          271
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
	//* 100  208:aload_0         
	//* 101  209:getfield        #244 <Field int mPageMargin>
	//* 102  212:i2f             
	//* 103  213:fload_3         
	//* 104  214:fadd            
	//* 105  215:iload           8
	//* 106  217:i2f             
	//* 107  218:fcmpl           
	//* 108  219:ifle            259
	//* 109  222:aload_0         
	//* 110  223:getfield        #868 <Field Drawable mMarginDrawable>
	//* 111  226:fload_3         
	//* 112  227:invokestatic    #1024 <Method int Math.round(float)>
	//* 113  230:aload_0         
	//* 114  231:getfield        #1026 <Field int mTopPageBounds>
	//* 115  234:aload_0         
	//* 116  235:getfield        #244 <Field int mPageMargin>
	//* 117  238:i2f             
	//* 118  239:fload_3         
	//* 119  240:fadd            
	//* 120  241:invokestatic    #1024 <Method int Math.round(float)>
	//* 121  244:aload_0         
	//* 122  245:getfield        #1028 <Field int mBottomPageBounds>
	//* 123  248:invokevirtual   #1031 <Method void Drawable.setBounds(int, int, int, int)>
	//* 124  251:aload_0         
	//* 125  252:getfield        #868 <Field Drawable mMarginDrawable>
	//* 126  255:aload_1         
	//* 127  256:invokevirtual   #1032 <Method void Drawable.draw(Canvas)>
	//* 128  259:fload_3         
	//* 129  260:iload           8
	//* 130  262:iload           9
	//* 131  264:iadd            
	//* 132  265:i2f             
	//* 133  266:fcmpl           
	//* 134  267:ifle            302
	//* 135  270:return          
		{
			float f3 = mAdapter.getPageWidth(i);
	//  136  271:aload_0         
	//  137  272:getfield        #233 <Field PagerAdapter mAdapter>
	//  138  275:iload           6
	//  139  277:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//  140  280:fstore          5
			f1 = (f + f3) * (float)l;
	//  141  282:fload_2         
	//  142  283:fload           5
	//  143  285:fadd            
	//  144  286:iload           9
	//  145  288:i2f             
	//  146  289:fmul            
	//  147  290:fstore_3        
			f += f3 + f2;
	//  148  291:fload_2         
	//  149  292:fload           5
	//  150  294:fload           4
	//  151  296:fadd            
	//  152  297:fadd            
	//  153  298:fstore_2        
		}
		if((float)mPageMargin + f1 > (float)k)
		{
			mMarginDrawable.setBounds(Math.round(f1), mTopPageBounds, Math.round((float)mPageMargin + f1), mBottomPageBounds);
			mMarginDrawable.draw(canvas);
		}
		if(f1 <= (float)(k + l)) goto _L4; else goto _L2
_L2:
		return;
	//* 154  299:goto            208
_L4:
		i++;
	//  155  302:iload           6
	//  156  304:iconst_1        
	//  157  305:iadd            
	//  158  306:istore          6
		if(true) goto _L6; else goto _L5
	//  159  308:goto            116
_L5:
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i;
		i = motionevent.getAction() & 0xff;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1035 <Method int MotionEvent.getAction()>
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
	//   12   23:invokespecial   #1037 <Method boolean resetTouch()>
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
		i;
	//   28   52:iload           7
		JVM INSTR lookupswitch 3: default 88
	//	               0: 353
	//	               2: 115
	//	               6: 490;
	//   29   54:lookupswitch    3: default 88
	//	               0: 353
	//	               2: 115
	//	               6: 490
		   goto _L1 _L2 _L3 _L4
_L1:
		if(mVelocityTracker == null)
	//*  30   88:aload_0         
	//*  31   89:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//*  32   92:ifnonnull       102
			mVelocityTracker = VelocityTracker.obtain();
	//   33   95:aload_0         
	//   34   96:invokestatic    #729 <Method VelocityTracker VelocityTracker.obtain()>
	//   35   99:putfield        #386 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//   36  102:aload_0         
	//   37  103:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//   38  106:aload_1         
	//   39  107:invokevirtual   #741 <Method void VelocityTracker.addMovement(MotionEvent)>
		return mIsBeingDragged;
	//   40  110:aload_0         
	//   41  111:getfield        #382 <Field boolean mIsBeingDragged>
	//   42  114:ireturn         
_L3:
		float f;
		float f2;
		float f3;
		float f4;
		float f5;
		int j = mActivePointerId;
	//   43  115:aload_0         
	//   44  116:getfield        #212 <Field int mActivePointerId>
	//   45  119:istore          7
		if(j == -1)
			continue; /* Loop/switch isn't completed */
	//   46  121:iload           7
	//   47  123:iconst_m1       
	//   48  124:icmpeq          88
		j = motionevent.findPointerIndex(j);
	//   49  127:aload_1         
	//   50  128:iload           7
	//   51  130:invokevirtual   #1040 <Method int MotionEvent.findPointerIndex(int)>
	//   52  133:istore          7
		f2 = motionevent.getX(j);
	//   53  135:aload_1         
	//   54  136:iload           7
	//   55  138:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//   56  141:fstore_3        
		f = f2 - mLastMotionX;
	//   57  142:fload_3         
	//   58  143:aload_0         
	//   59  144:getfield        #479 <Field float mLastMotionX>
	//   60  147:fsub            
	//   61  148:fstore_2        
		f4 = Math.abs(f);
	//   62  149:fload_2         
	//   63  150:invokestatic    #501 <Method float Math.abs(float)>
	//   64  153:fstore          5
		f3 = motionevent.getY(j);
	//   65  155:aload_1         
	//   66  156:iload           7
	//   67  158:invokevirtual   #1043 <Method float MotionEvent.getY(int)>
	//   68  161:fstore          4
		f5 = Math.abs(f3 - mInitialMotionY);
	//   69  163:fload           4
	//   70  165:aload_0         
	//   71  166:getfield        #1045 <Field float mInitialMotionY>
	//   72  169:fsub            
	//   73  170:invokestatic    #501 <Method float Math.abs(float)>
	//   74  173:fstore          6
		if(f != 0.0F && !isGutterDrag(mLastMotionX, f) && canScroll(((View) (this)), false, (int)f, (int)f2, (int)f3))
	//*  75  175:fload_2         
	//*  76  176:fconst_0        
	//*  77  177:fcmpl           
	//*  78  178:ifeq            227
	//*  79  181:aload_0         
	//*  80  182:aload_0         
	//*  81  183:getfield        #479 <Field float mLastMotionX>
	//*  82  186:fload_2         
	//*  83  187:invokespecial   #1047 <Method boolean isGutterDrag(float, float)>
	//*  84  190:ifne            227
	//*  85  193:aload_0         
	//*  86  194:aload_0         
	//*  87  195:iconst_0        
	//*  88  196:fload_2         
	//*  89  197:f2i             
	//*  90  198:fload_3         
	//*  91  199:f2i             
	//*  92  200:fload           4
	//*  93  202:f2i             
	//*  94  203:invokevirtual   #752 <Method boolean canScroll(View, boolean, int, int, int)>
	//*  95  206:ifeq            227
		{
			mLastMotionX = f2;
	//   96  209:aload_0         
	//   97  210:fload_3         
	//   98  211:putfield        #479 <Field float mLastMotionX>
			mLastMotionY = f3;
	//   99  214:aload_0         
	//  100  215:fload           4
	//  101  217:putfield        #1049 <Field float mLastMotionY>
			mIsUnableToDrag = true;
	//  102  220:aload_0         
	//  103  221:iconst_1        
	//  104  222:putfield        #384 <Field boolean mIsUnableToDrag>
			return false;
	//  105  225:iconst_0        
	//  106  226:ireturn         
		}
		if(f4 <= (float)mTouchSlop || 0.5F * f4 <= f5) goto _L6; else goto _L5
	//  107  227:fload           5
	//  108  229:aload_0         
	//  109  230:getfield        #977 <Field int mTouchSlop>
	//  110  233:i2f             
	//  111  234:fcmpl           
	//  112  235:ifle            334
	//  113  238:ldc2            #816 <Float 0.5F>
	//  114  241:fload           5
	//  115  243:fmul            
	//  116  244:fload           6
	//  117  246:fcmpl           
	//  118  247:ifle            334
_L5:
		mIsBeingDragged = true;
	//  119  250:aload_0         
	//  120  251:iconst_1        
	//  121  252:putfield        #382 <Field boolean mIsBeingDragged>
		requestParentDisallowInterceptTouchEvent(true);
	//  122  255:aload_0         
	//  123  256:iconst_1        
	//  124  257:invokespecial   #1051 <Method void requestParentDisallowInterceptTouchEvent(boolean)>
		setScrollState(1);
	//  125  260:aload_0         
	//  126  261:iconst_1        
	//  127  262:invokevirtual   #723 <Method void setScrollState(int)>
		if(f > 0.0F)
	//* 128  265:fload_2         
	//* 129  266:fconst_0        
	//* 130  267:fcmpl           
	//* 131  268:ifle            320
			f = mInitialMotionX + (float)mTouchSlop;
	//  132  271:aload_0         
	//  133  272:getfield        #725 <Field float mInitialMotionX>
	//  134  275:aload_0         
	//  135  276:getfield        #977 <Field int mTouchSlop>
	//  136  279:i2f             
	//  137  280:fadd            
	//  138  281:fstore_2        
		else
	//* 139  282:aload_0         
	//* 140  283:fload_2         
	//* 141  284:putfield        #479 <Field float mLastMotionX>
	//* 142  287:aload_0         
	//* 143  288:fload           4
	//* 144  290:putfield        #1049 <Field float mLastMotionY>
	//* 145  293:aload_0         
	//* 146  294:iconst_1        
	//* 147  295:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
	//* 148  298:aload_0         
	//* 149  299:getfield        #382 <Field boolean mIsBeingDragged>
	//* 150  302:ifeq            88
	//* 151  305:aload_0         
	//* 152  306:fload_3         
	//* 153  307:invokespecial   #1053 <Method boolean performDrag(float)>
	//* 154  310:ifeq            88
	//* 155  313:aload_0         
	//* 156  314:invokestatic    #768 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//* 157  317:goto            88
			f = mInitialMotionX - (float)mTouchSlop;
	//  158  320:aload_0         
	//  159  321:getfield        #725 <Field float mInitialMotionX>
	//  160  324:aload_0         
	//  161  325:getfield        #977 <Field int mTouchSlop>
	//  162  328:i2f             
	//  163  329:fsub            
	//  164  330:fstore_2        
		mLastMotionX = f;
		mLastMotionY = f3;
		setScrollingCacheEnabled(true);
_L7:
		if(mIsBeingDragged && performDrag(f2))
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
		continue; /* Loop/switch isn't completed */
	//* 165  331:goto            282
_L6:
		if(f5 > (float)mTouchSlop)
	//* 166  334:fload           6
	//* 167  336:aload_0         
	//* 168  337:getfield        #977 <Field int mTouchSlop>
	//* 169  340:i2f             
	//* 170  341:fcmpl           
	//* 171  342:ifle            298
			mIsUnableToDrag = true;
	//  172  345:aload_0         
	//  173  346:iconst_1        
	//  174  347:putfield        #384 <Field boolean mIsUnableToDrag>
		if(true) goto _L7; else goto _L2
	//  175  350:goto            298
_L2:
		float f1 = motionevent.getX();
	//  176  353:aload_1         
	//  177  354:invokevirtual   #1056 <Method float MotionEvent.getX()>
	//  178  357:fstore_2        
		mInitialMotionX = f1;
	//  179  358:aload_0         
	//  180  359:fload_2         
	//  181  360:putfield        #725 <Field float mInitialMotionX>
		mLastMotionX = f1;
	//  182  363:aload_0         
	//  183  364:fload_2         
	//  184  365:putfield        #479 <Field float mLastMotionX>
		f1 = motionevent.getY();
	//  185  368:aload_1         
	//  186  369:invokevirtual   #1058 <Method float MotionEvent.getY()>
	//  187  372:fstore_2        
		mInitialMotionY = f1;
	//  188  373:aload_0         
	//  189  374:fload_2         
	//  190  375:putfield        #1045 <Field float mInitialMotionY>
		mLastMotionY = f1;
	//  191  378:aload_0         
	//  192  379:fload_2         
	//  193  380:putfield        #1049 <Field float mLastMotionY>
		mActivePointerId = motionevent.getPointerId(0);
	//  194  383:aload_0         
	//  195  384:aload_1         
	//  196  385:iconst_0        
	//  197  386:invokevirtual   #474 <Method int MotionEvent.getPointerId(int)>
	//  198  389:putfield        #212 <Field int mActivePointerId>
		mIsUnableToDrag = false;
	//  199  392:aload_0         
	//  200  393:iconst_0        
	//  201  394:putfield        #384 <Field boolean mIsUnableToDrag>
		mIsScrollStarted = true;
	//  202  397:aload_0         
	//  203  398:iconst_1        
	//  204  399:putfield        #761 <Field boolean mIsScrollStarted>
		mScroller.computeScrollOffset();
	//  205  402:aload_0         
	//  206  403:getfield        #271 <Field Scroller mScroller>
	//  207  406:invokevirtual   #764 <Method boolean Scroller.computeScrollOffset()>
	//  208  409:pop             
		if(mScrollState == 2 && Math.abs(mScroller.getFinalX() - mScroller.getCurrX()) > mCloseEnough)
	//* 209  410:aload_0         
	//* 210  411:getfield        #223 <Field int mScrollState>
	//* 211  414:iconst_2        
	//* 212  415:icmpne          477
	//* 213  418:aload_0         
	//* 214  419:getfield        #271 <Field Scroller mScroller>
	//* 215  422:invokevirtual   #1061 <Method int Scroller.getFinalX()>
	//* 216  425:aload_0         
	//* 217  426:getfield        #271 <Field Scroller mScroller>
	//* 218  429:invokevirtual   #289 <Method int Scroller.getCurrX()>
	//* 219  432:isub            
	//* 220  433:invokestatic    #324 <Method int Math.abs(int)>
	//* 221  436:aload_0         
	//* 222  437:getfield        #985 <Field int mCloseEnough>
	//* 223  440:icmple          477
		{
			mScroller.abortAnimation();
	//  224  443:aload_0         
	//  225  444:getfield        #271 <Field Scroller mScroller>
	//  226  447:invokevirtual   #280 <Method void Scroller.abortAnimation()>
			mPopulatePending = false;
	//  227  450:aload_0         
	//  228  451:iconst_0        
	//  229  452:putfield        #302 <Field boolean mPopulatePending>
			populate();
	//  230  455:aload_0         
	//  231  456:invokevirtual   #1064 <Method void populate()>
			mIsBeingDragged = true;
	//  232  459:aload_0         
	//  233  460:iconst_1        
	//  234  461:putfield        #382 <Field boolean mIsBeingDragged>
			requestParentDisallowInterceptTouchEvent(true);
	//  235  464:aload_0         
	//  236  465:iconst_1        
	//  237  466:invokespecial   #1051 <Method void requestParentDisallowInterceptTouchEvent(boolean)>
			setScrollState(1);
	//  238  469:aload_0         
	//  239  470:iconst_1        
	//  240  471:invokevirtual   #723 <Method void setScrollState(int)>
		} else
	//* 241  474:goto            88
		{
			completeScroll(false);
	//  242  477:aload_0         
	//  243  478:iconst_0        
	//  244  479:invokespecial   #528 <Method void completeScroll(boolean)>
			mIsBeingDragged = false;
	//  245  482:aload_0         
	//  246  483:iconst_0        
	//  247  484:putfield        #382 <Field boolean mIsBeingDragged>
		}
		continue; /* Loop/switch isn't completed */
	//  248  487:goto            88
_L4:
		onSecondaryPointerUp(motionevent);
	//  249  490:aload_0         
	//  250  491:aload_1         
	//  251  492:invokespecial   #1066 <Method void onSecondaryPointerUp(MotionEvent)>
		if(true) goto _L1; else goto _L8
	//  252  495:goto            88
_L8:
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		int i1;
		int l1;
		int i2;
		int i3;
		int j3;
		int k3;
		int l3;
		i3 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #367 <Method int getChildCount()>
	//    2    4:istore          13
		k3 = k - i;
	//    3    6:iload           4
	//    4    8:iload_2         
	//    5    9:isub            
	//    6   10:istore          15
		j3 = l - j;
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
	//   15   24:invokevirtual   #839 <Method int getPaddingTop()>
	//   16   27:istore_2        
		i1 = getPaddingRight();
	//   17   28:aload_0         
	//   18   29:invokevirtual   #439 <Method int getPaddingRight()>
	//   19   32:istore          6
		l = getPaddingBottom();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #842 <Method int getPaddingBottom()>
	//   22   38:istore          5
		l3 = getScrollX();
	//   23   40:aload_0         
	//   24   41:invokevirtual   #283 <Method int getScrollX()>
	//   25   44:istore          16
		l1 = 0;
	//   26   46:iconst_0        
	//   27   47:istore          8
		i2 = 0;
	//   28   49:iconst_0        
	//   29   50:istore          9
_L17:
		if(i2 >= i3) goto _L2; else goto _L1
	//   30   52:iload           9
	//   31   54:iload           13
	//   32   56:icmpge          426
_L1:
		int j1;
		int j2;
		int k2;
		int l2;
		View view;
		view = getChildAt(i2);
	//   33   59:aload_0         
	//   34   60:iload           9
	//   35   62:invokevirtual   #373 <Method View getChildAt(int)>
	//   36   65:astore          17
		l2 = l1;
	//   37   67:iload           8
	//   38   69:istore          12
		k2 = l;
	//   39   71:iload           5
	//   40   73:istore          11
		j1 = j;
	//   41   75:iload_3         
	//   42   76:istore          7
		j2 = i1;
	//   43   78:iload           6
	//   44   80:istore          10
		k = i;
	//   45   82:iload_2         
	//   46   83:istore          4
		if(view.getVisibility() == 8) goto _L4; else goto _L3
	//   47   85:aload           17
	//   48   87:invokevirtual   #590 <Method int View.getVisibility()>
	//   49   90:bipush          8
	//   50   92:icmpeq          277
_L3:
		LayoutParams layoutparams;
		layoutparams = (LayoutParams)view.getLayoutParams();
	//   51   95:aload           17
	//   52   97:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   53  100:checkcast       #20  <Class ViewPager$LayoutParams>
	//   54  103:astore          18
		l2 = l1;
	//   55  105:iload           8
	//   56  107:istore          12
		k2 = l;
	//   57  109:iload           5
	//   58  111:istore          11
		j1 = j;
	//   59  113:iload_3         
	//   60  114:istore          7
		j2 = i1;
	//   61  116:iload           6
	//   62  118:istore          10
		k = i;
	//   63  120:iload_2         
	//   64  121:istore          4
		if(!layoutparams.isDecor) goto _L4; else goto _L5
	//   65  123:aload           18
	//   66  125:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//   67  128:ifeq            277
_L5:
		k = layoutparams.gravity;
	//   68  131:aload           18
	//   69  133:getfield        #1071 <Field int ViewPager$LayoutParams.gravity>
	//   70  136:istore          4
		j2 = layoutparams.gravity;
	//   71  138:aload           18
	//   72  140:getfield        #1071 <Field int ViewPager$LayoutParams.gravity>
	//   73  143:istore          10
		k & 7;
	//   74  145:iload           4
	//   75  147:bipush          7
	//   76  149:iand            
		JVM INSTR tableswitch 1 5: default 184
	//	               1 319
	//	               2 184
	//	               3 304
	//	               4 184
	//	               5 341;
	//   77  150:tableswitch     1 5: default 184
	//	               1 319
	//	               2 184
	//	               3 304
	//	               4 184
	//	               5 341
		   goto _L6 _L7 _L6 _L8 _L6 _L9
_L6:
		k = j;
	//   78  184:iload_3         
	//   79  185:istore          4
		j1 = j;
	//   80  187:iload_3         
	//   81  188:istore          7
_L14:
		j2 & 0x70;
	//   82  190:iload           10
	//   83  192:bipush          112
	//   84  194:iand            
		JVM INSTR lookupswitch 3: default 228
	//	               16: 383
	//	               48: 370
	//	               80: 401;
	//   85  195:lookupswitch    3: default 228
	//	               16: 383
	//	               48: 370
	//	               80: 401
		   goto _L10 _L11 _L12 _L13
_L10:
		j = i;
	//   86  228:iload_2         
	//   87  229:istore_3        
_L15:
		k += l3;
	//   88  230:iload           4
	//   89  232:iload           16
	//   90  234:iadd            
	//   91  235:istore          4
		view.layout(k, j, view.getMeasuredWidth() + k, view.getMeasuredHeight() + j);
	//   92  237:aload           17
	//   93  239:iload           4
	//   94  241:iload_3         
	//   95  242:aload           17
	//   96  244:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//   97  247:iload           4
	//   98  249:iadd            
	//   99  250:aload           17
	//  100  252:invokevirtual   #1075 <Method int View.getMeasuredHeight()>
	//  101  255:iload_3         
	//  102  256:iadd            
	//  103  257:invokevirtual   #1078 <Method void View.layout(int, int, int, int)>
		l2 = l1 + 1;
	//  104  260:iload           8
	//  105  262:iconst_1        
	//  106  263:iadd            
	//  107  264:istore          12
		k = i;
	//  108  266:iload_2         
	//  109  267:istore          4
		j2 = i1;
	//  110  269:iload           6
	//  111  271:istore          10
		k2 = l;
	//  112  273:iload           5
	//  113  275:istore          11
_L4:
		i2++;
	//  114  277:iload           9
	//  115  279:iconst_1        
	//  116  280:iadd            
	//  117  281:istore          9
		l1 = l2;
	//  118  283:iload           12
	//  119  285:istore          8
		l = k2;
	//  120  287:iload           11
	//  121  289:istore          5
		j = j1;
	//  122  291:iload           7
	//  123  293:istore_3        
		i1 = j2;
	//  124  294:iload           10
	//  125  296:istore          6
		i = k;
	//  126  298:iload           4
	//  127  300:istore_2        
		continue; /* Loop/switch isn't completed */
	//  128  301:goto            52
_L8:
		k = j;
	//  129  304:iload_3         
	//  130  305:istore          4
		j1 = j + view.getMeasuredWidth();
	//  131  307:iload_3         
	//  132  308:aload           17
	//  133  310:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//  134  313:iadd            
	//  135  314:istore          7
		  goto _L14
	//* 136  316:goto            190
_L7:
		k = Math.max((k3 - view.getMeasuredWidth()) / 2, j);
	//  137  319:iload           15
	//  138  321:aload           17
	//  139  323:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//  140  326:isub            
	//  141  327:iconst_2        
	//  142  328:idiv            
	//  143  329:iload_3         
	//  144  330:invokestatic    #335 <Method int Math.max(int, int)>
	//  145  333:istore          4
		j1 = j;
	//  146  335:iload_3         
	//  147  336:istore          7
		  goto _L14
	//* 148  338:goto            190
_L9:
		k = k3 - i1 - view.getMeasuredWidth();
	//  149  341:iload           15
	//  150  343:iload           6
	//  151  345:isub            
	//  152  346:aload           17
	//  153  348:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//  154  351:isub            
	//  155  352:istore          4
		i1 += view.getMeasuredWidth();
	//  156  354:iload           6
	//  157  356:aload           17
	//  158  358:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//  159  361:iadd            
	//  160  362:istore          6
		j1 = j;
	//  161  364:iload_3         
	//  162  365:istore          7
		  goto _L14
	//* 163  367:goto            190
_L12:
		j = i;
	//  164  370:iload_2         
	//  165  371:istore_3        
		i += view.getMeasuredHeight();
	//  166  372:iload_2         
	//  167  373:aload           17
	//  168  375:invokevirtual   #1075 <Method int View.getMeasuredHeight()>
	//  169  378:iadd            
	//  170  379:istore_2        
		  goto _L15
	//* 171  380:goto            230
_L11:
		j = Math.max((j3 - view.getMeasuredHeight()) / 2, i);
	//  172  383:iload           14
	//  173  385:aload           17
	//  174  387:invokevirtual   #1075 <Method int View.getMeasuredHeight()>
	//  175  390:isub            
	//  176  391:iconst_2        
	//  177  392:idiv            
	//  178  393:iload_2         
	//  179  394:invokestatic    #335 <Method int Math.max(int, int)>
	//  180  397:istore_3        
		  goto _L15
	//* 181  398:goto            230
_L13:
		j = j3 - l - view.getMeasuredHeight();
	//  182  401:iload           14
	//  183  403:iload           5
	//  184  405:isub            
	//  185  406:aload           17
	//  186  408:invokevirtual   #1075 <Method int View.getMeasuredHeight()>
	//  187  411:isub            
	//  188  412:istore_3        
		l += view.getMeasuredHeight();
	//  189  413:iload           5
	//  190  415:aload           17
	//  191  417:invokevirtual   #1075 <Method int View.getMeasuredHeight()>
	//  192  420:iadd            
	//  193  421:istore          5
		  goto _L15
	//* 194  423:goto            230
_L2:
		i1 = k3 - j - i1;
	//  195  426:iload           15
	//  196  428:iload_3         
	//  197  429:isub            
	//  198  430:iload           6
	//  199  432:isub            
	//  200  433:istore          6
		for(k = 0; k < i3; k++)
	//* 201  435:iconst_0        
	//* 202  436:istore          4
	//* 203  438:iload           4
	//* 204  440:iload           13
	//* 205  442:icmpge          588
		{
			View view1 = getChildAt(k);
	//  206  445:aload_0         
	//  207  446:iload           4
	//  208  448:invokevirtual   #373 <Method View getChildAt(int)>
	//  209  451:astore          17
			if(view1.getVisibility() == 8)
				continue;
	//  210  453:aload           17
	//  211  455:invokevirtual   #590 <Method int View.getVisibility()>
	//  212  458:bipush          8
	//  213  460:icmpeq          579
			LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  214  463:aload           17
	//  215  465:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  216  468:checkcast       #20  <Class ViewPager$LayoutParams>
	//  217  471:astore          18
			if(layoutparams1.isDecor)
				continue;
	//  218  473:aload           18
	//  219  475:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//  220  478:ifne            579
			ItemInfo iteminfo = infoForChild(view1);
	//  221  481:aload_0         
	//  222  482:aload           17
	//  223  484:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//  224  487:astore          19
			if(iteminfo == null)
				continue;
	//  225  489:aload           19
	//  226  491:ifnull          579
			int k1 = j + (int)((float)i1 * iteminfo.offset);
	//  227  494:iload_3         
	//  228  495:iload           6
	//  229  497:i2f             
	//  230  498:aload           19
	//  231  500:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  232  503:fmul            
	//  233  504:f2i             
	//  234  505:iadd            
	//  235  506:istore          7
			if(layoutparams1.needsMeasure)
	//* 236  508:aload           18
	//* 237  510:getfield        #652 <Field boolean ViewPager$LayoutParams.needsMeasure>
	//* 238  513:ifeq            556
			{
				layoutparams1.needsMeasure = false;
	//  239  516:aload           18
	//  240  518:iconst_0        
	//  241  519:putfield        #652 <Field boolean ViewPager$LayoutParams.needsMeasure>
				view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)((float)i1 * layoutparams1.widthFactor), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j3 - i - l, 0x40000000));
	//  242  522:aload           17
	//  243  524:iload           6
	//  244  526:i2f             
	//  245  527:aload           18
	//  246  529:getfield        #790 <Field float ViewPager$LayoutParams.widthFactor>
	//  247  532:fmul            
	//  248  533:f2i             
	//  249  534:ldc2            #1079 <Int 0x40000000>
	//  250  537:invokestatic    #1084 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  251  540:iload           14
	//  252  542:iload_2         
	//  253  543:isub            
	//  254  544:iload           5
	//  255  546:isub            
	//  256  547:ldc2            #1079 <Int 0x40000000>
	//  257  550:invokestatic    #1084 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  258  553:invokevirtual   #1087 <Method void View.measure(int, int)>
			}
			view1.layout(k1, i, view1.getMeasuredWidth() + k1, view1.getMeasuredHeight() + i);
	//  259  556:aload           17
	//  260  558:iload           7
	//  261  560:iload_2         
	//  262  561:aload           17
	//  263  563:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//  264  566:iload           7
	//  265  568:iadd            
	//  266  569:aload           17
	//  267  571:invokevirtual   #1075 <Method int View.getMeasuredHeight()>
	//  268  574:iload_2         
	//  269  575:iadd            
	//  270  576:invokevirtual   #1078 <Method void View.layout(int, int, int, int)>
		}

	//  271  579:iload           4
	//  272  581:iconst_1        
	//  273  582:iadd            
	//  274  583:istore          4
	//* 275  585:goto            438
		mTopPageBounds = i;
	//  276  588:aload_0         
	//  277  589:iload_2         
	//  278  590:putfield        #1026 <Field int mTopPageBounds>
		mBottomPageBounds = j3 - l;
	//  279  593:aload_0         
	//  280  594:iload           14
	//  281  596:iload           5
	//  282  598:isub            
	//  283  599:putfield        #1028 <Field int mBottomPageBounds>
		mDecorChildCount = l1;
	//  284  602:aload_0         
	//  285  603:iload           8
	//  286  605:putfield        #1089 <Field int mDecorChildCount>
		if(mFirstLayout)
	//* 287  608:aload_0         
	//* 288  609:getfield        #214 <Field boolean mFirstLayout>
	//* 289  612:ifeq            626
			scrollToItem(mCurItem, false, 0, false);
	//  290  615:aload_0         
	//  291  616:aload_0         
	//  292  617:getfield        #337 <Field int mCurItem>
	//  293  620:iconst_0        
	//  294  621:iconst_0        
	//  295  622:iconst_0        
	//  296  623:invokespecial   #1091 <Method void scrollToItem(int, boolean, int, boolean)>
		mFirstLayout = false;
	//  297  626:aload_0         
	//  298  627:iconst_0        
	//  299  628:putfield        #214 <Field boolean mFirstLayout>
		return;
	//  300  631:return          
		if(true) goto _L17; else goto _L16
_L16:
	}

	protected void onMeasure(int i, int j)
	{
		setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, j));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iload_1         
	//    3    3:invokestatic    #1095 <Method int getDefaultSize(int, int)>
	//    4    6:iconst_0        
	//    5    7:iload_2         
	//    6    8:invokestatic    #1095 <Method int getDefaultSize(int, int)>
	//    7   11:invokevirtual   #1098 <Method void setMeasuredDimension(int, int)>
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
	//   16   25:getfield        #988 <Field int mDefaultGutterSize>
	//   17   28:invokestatic    #332 <Method int Math.min(int, int)>
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
	//   28   47:invokevirtual   #1099 <Method int getMeasuredHeight()>
	//   29   50:aload_0         
	//   30   51:invokevirtual   #839 <Method int getPaddingTop()>
	//   31   54:isub            
	//   32   55:aload_0         
	//   33   56:invokevirtual   #842 <Method int getPaddingBottom()>
	//   34   59:isub            
	//   35   60:istore_2        
		int i3 = getChildCount();
	//   36   61:aload_0         
	//   37   62:invokevirtual   #367 <Method int getChildCount()>
	//   38   65:istore          12
		int j1 = 0;
	//   39   67:iconst_0        
	//   40   68:istore          5
		do
		{
			if(j1 < i3)
	//*  41   70:iload           5
	//*  42   72:iload           12
	//*  43   74:icmpge          406
			{
				View view = getChildAt(j1);
	//   44   77:aload_0         
	//   45   78:iload           5
	//   46   80:invokevirtual   #373 <Method View getChildAt(int)>
	//   47   83:astore          13
				int k = j;
	//   48   85:iload_2         
	//   49   86:istore_3        
				int i1 = i;
	//   50   87:iload_1         
	//   51   88:istore          4
				if(view.getVisibility() != 8)
	//*  52   90:aload           13
	//*  53   92:invokevirtual   #590 <Method int View.getVisibility()>
	//*  54   95:bipush          8
	//*  55   97:icmpeq          336
				{
					LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   56  100:aload           13
	//   57  102:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   58  105:checkcast       #20  <Class ViewPager$LayoutParams>
	//   59  108:astore          14
					k = j;
	//   60  110:iload_2         
	//   61  111:istore_3        
					i1 = i;
	//   62  112:iload_1         
	//   63  113:istore          4
					if(layoutparams != null)
	//*  64  115:aload           14
	//*  65  117:ifnull          336
					{
						k = j;
	//   66  120:iload_2         
	//   67  121:istore_3        
						i1 = i;
	//   68  122:iload_1         
	//   69  123:istore          4
						if(layoutparams.isDecor)
	//*  70  125:aload           14
	//*  71  127:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//*  72  130:ifeq            336
						{
							i1 = layoutparams.gravity & 7;
	//   73  133:aload           14
	//   74  135:getfield        #1071 <Field int ViewPager$LayoutParams.gravity>
	//   75  138:bipush          7
	//   76  140:iand            
	//   77  141:istore          4
							int k1 = layoutparams.gravity & 0x70;
	//   78  143:aload           14
	//   79  145:getfield        #1071 <Field int ViewPager$LayoutParams.gravity>
	//   80  148:bipush          112
	//   81  150:iand            
	//   82  151:istore          6
							int l1 = 0x80000000;
	//   83  153:ldc2            #1100 <Int 0x80000000>
	//   84  156:istore          8
							k = 0x80000000;
	//   85  158:ldc2            #1100 <Int 0x80000000>
	//   86  161:istore_3        
							boolean flag;
							boolean flag1;
							int i2;
							int j2;
							if(k1 == 48 || k1 == 80)
	//*  87  162:iload           6
	//*  88  164:bipush          48
	//*  89  166:icmpeq          176
	//*  90  169:iload           6
	//*  91  171:bipush          80
	//*  92  173:icmpne          350
								flag = true;
	//   93  176:iconst_1        
	//   94  177:istore          6
							else
	//*  95  179:iload           4
	//*  96  181:iconst_3        
	//*  97  182:icmpeq          191
	//*  98  185:iload           4
	//*  99  187:iconst_5        
	//* 100  188:icmpne          356
	//* 101  191:iconst_1        
	//* 102  192:istore          7
	//* 103  194:iload           6
	//* 104  196:ifeq            362
	//* 105  199:ldc2            #1079 <Int 0x40000000>
	//* 106  202:istore          4
	//* 107  204:iload_1         
	//* 108  205:istore          10
	//* 109  207:iload_2         
	//* 110  208:istore          8
	//* 111  210:iload           10
	//* 112  212:istore          9
	//* 113  214:aload           14
	//* 114  216:getfield        #1103 <Field int ViewPager$LayoutParams.width>
	//* 115  219:bipush          -2
	//* 116  221:icmpeq          257
	//* 117  224:ldc2            #1079 <Int 0x40000000>
	//* 118  227:istore          11
	//* 119  229:iload           11
	//* 120  231:istore          4
	//* 121  233:iload           10
	//* 122  235:istore          9
	//* 123  237:aload           14
	//* 124  239:getfield        #1103 <Field int ViewPager$LayoutParams.width>
	//* 125  242:iconst_m1       
	//* 126  243:icmpeq          257
	//* 127  246:aload           14
	//* 128  248:getfield        #1103 <Field int ViewPager$LayoutParams.width>
	//* 129  251:istore          9
	//* 130  253:iload           11
	//* 131  255:istore          4
	//* 132  257:iload           8
	//* 133  259:istore          10
	//* 134  261:aload           14
	//* 135  263:getfield        #1106 <Field int ViewPager$LayoutParams.height>
	//* 136  266:bipush          -2
	//* 137  268:icmpeq          302
	//* 138  271:ldc2            #1079 <Int 0x40000000>
	//* 139  274:istore          11
	//* 140  276:iload           11
	//* 141  278:istore_3        
	//* 142  279:iload           8
	//* 143  281:istore          10
	//* 144  283:aload           14
	//* 145  285:getfield        #1106 <Field int ViewPager$LayoutParams.height>
	//* 146  288:iconst_m1       
	//* 147  289:icmpeq          302
	//* 148  292:aload           14
	//* 149  294:getfield        #1106 <Field int ViewPager$LayoutParams.height>
	//* 150  297:istore          10
	//* 151  299:iload           11
	//* 152  301:istore_3        
	//* 153  302:aload           13
	//* 154  304:iload           9
	//* 155  306:iload           4
	//* 156  308:invokestatic    #1084 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 157  311:iload           10
	//* 158  313:iload_3         
	//* 159  314:invokestatic    #1084 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 160  317:invokevirtual   #1087 <Method void View.measure(int, int)>
	//* 161  320:iload           6
	//* 162  322:ifeq            382
	//* 163  325:iload_2         
	//* 164  326:aload           13
	//* 165  328:invokevirtual   #1075 <Method int View.getMeasuredHeight()>
	//* 166  331:isub            
	//* 167  332:istore_3        
	//* 168  333:iload_1         
	//* 169  334:istore          4
	//* 170  336:iload           5
	//* 171  338:iconst_1        
	//* 172  339:iadd            
	//* 173  340:istore          5
	//* 174  342:iload_3         
	//* 175  343:istore_2        
	//* 176  344:iload           4
	//* 177  346:istore_1        
	//* 178  347:goto            70
								flag = false;
	//  179  350:iconst_0        
	//  180  351:istore          6
							if(i1 == 3 || i1 == 5)
								flag1 = true;
							else
	//* 181  353:goto            179
								flag1 = false;
	//  182  356:iconst_0        
	//  183  357:istore          7
							if(flag)
							{
								i1 = 0x40000000;
							} else
	//* 184  359:goto            194
							{
								i1 = l1;
	//  185  362:iload           8
	//  186  364:istore          4
								if(flag1)
	//* 187  366:iload           7
	//* 188  368:ifeq            204
								{
									k = 0x40000000;
	//  189  371:ldc2            #1079 <Int 0x40000000>
	//  190  374:istore_3        
									i1 = l1;
	//  191  375:iload           8
	//  192  377:istore          4
								}
							}
							j2 = i;
							l1 = j;
							i2 = j2;
							if(layoutparams.width != -2)
							{
								int k2 = 0x40000000;
								i1 = k2;
								i2 = j2;
								if(layoutparams.width != -1)
								{
									i2 = layoutparams.width;
									i1 = k2;
								}
							}
							j2 = l1;
							if(layoutparams.height != -2)
							{
								int l2 = 0x40000000;
								k = l2;
								j2 = l1;
								if(layoutparams.height != -1)
								{
									j2 = layoutparams.height;
									k = l2;
								}
							}
							view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2, i1), android.view.View.MeasureSpec.makeMeasureSpec(j2, k));
							if(flag)
							{
								k = j - view.getMeasuredHeight();
								i1 = i;
							} else
	//* 193  379:goto            204
							{
								k = j;
	//  194  382:iload_2         
	//  195  383:istore_3        
								i1 = i;
	//  196  384:iload_1         
	//  197  385:istore          4
								if(flag1)
	//* 198  387:iload           7
	//* 199  389:ifeq            336
								{
									i1 = i - view.getMeasuredWidth();
	//  200  392:iload_1         
	//  201  393:aload           13
	//  202  395:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//  203  398:isub            
	//  204  399:istore          4
									k = j;
	//  205  401:iload_2         
	//  206  402:istore_3        
								}
							}
						}
					}
				}
				j1++;
				j = k;
				i = i1;
				continue;
			}
	//* 207  403:goto            336
			mChildWidthMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
	//  208  406:aload_0         
	//  209  407:iload_1         
	//  210  408:ldc2            #1079 <Int 0x40000000>
	//  211  411:invokestatic    #1084 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  212  414:putfield        #1108 <Field int mChildWidthMeasureSpec>
			mChildHeightMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
	//  213  417:aload_0         
	//  214  418:iload_2         
	//  215  419:ldc2            #1079 <Int 0x40000000>
	//  216  422:invokestatic    #1084 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  217  425:putfield        #1110 <Field int mChildHeightMeasureSpec>
			mInLayout = true;
	//  218  428:aload_0         
	//  219  429:iconst_1        
	//  220  430:putfield        #647 <Field boolean mInLayout>
			populate();
	//  221  433:aload_0         
	//  222  434:invokevirtual   #1064 <Method void populate()>
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
	//  258  505:ldc2            #1079 <Int 0x40000000>
	//  259  508:invokestatic    #1084 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  260  511:aload_0         
	//  261  512:getfield        #1110 <Field int mChildHeightMeasureSpec>
	//  262  515:invokevirtual   #1087 <Method void View.measure(int, int)>
			}

	//  263  518:iload_2         
	//  264  519:iconst_1        
	//  265  520:iadd            
	//  266  521:istore_2        
	//* 267  522:goto            449
			return;
	//  268  525:return          
		} while(true);
	}

	protected void onPageScrolled(int i, float f, int j)
	{
		int k;
		int j1;
		int k1;
		int i2;
		int j2;
		int k2;
		if(mDecorChildCount <= 0)
			break MISSING_BLOCK_LABEL_251;
	//    0    0:aload_0         
	//    1    1:getfield        #1089 <Field int mDecorChildCount>
	//    2    4:ifle            251
		i2 = getScrollX();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #283 <Method int getScrollX()>
	//    5   11:istore          9
		k = getPaddingLeft();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #436 <Method int getPaddingLeft()>
	//    8   17:istore          4
		j1 = getPaddingRight();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #439 <Method int getPaddingRight()>
	//   11   23:istore          6
		j2 = getWidth();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #464 <Method int getWidth()>
	//   14   29:istore          10
		k2 = getChildCount();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #367 <Method int getChildCount()>
	//   17   35:istore          11
		k1 = 0;
	//   18   37:iconst_0        
	//   19   38:istore          7
_L2:
		int i1;
		int l1;
		View view;
		LayoutParams layoutparams;
		if(k1 >= k2)
			break MISSING_BLOCK_LABEL_251;
	//   20   40:iload           7
	//   21   42:iload           11
	//   22   44:icmpge          251
		view = getChildAt(k1);
	//   23   47:aload_0         
	//   24   48:iload           7
	//   25   50:invokevirtual   #373 <Method View getChildAt(int)>
	//   26   53:astore          13
		layoutparams = (LayoutParams)view.getLayoutParams();
	//   27   55:aload           13
	//   28   57:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   29   60:checkcast       #20  <Class ViewPager$LayoutParams>
	//   30   63:astore          14
		if(layoutparams.isDecor)
			break; /* Loop/switch isn't completed */
	//   31   65:aload           14
	//   32   67:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//   33   70:ifne            98
		i1 = j1;
	//   34   73:iload           6
	//   35   75:istore          5
		l1 = k;
	//   36   77:iload           4
	//   37   79:istore          8
_L7:
		k1++;
	//   38   81:iload           7
	//   39   83:iconst_1        
	//   40   84:iadd            
	//   41   85:istore          7
		k = l1;
	//   42   87:iload           8
	//   43   89:istore          4
		j1 = i1;
	//   44   91:iload           5
	//   45   93:istore          6
		if(true) goto _L2; else goto _L1
	//   46   95:goto            40
_L1:
		layoutparams.gravity & 7;
	//   47   98:aload           14
	//   48  100:getfield        #1071 <Field int ViewPager$LayoutParams.gravity>
	//   49  103:bipush          7
	//   50  105:iand            
		JVM INSTR tableswitch 1 5: default 140
	//	               1 205
	//	               2 140
	//	               3 188
	//	               4 140
	//	               5 225;
	//   51  106:tableswitch     1 5: default 140
	//	               1 205
	//	               2 140
	//	               3 188
	//	               4 140
	//	               5 225
		   goto _L3 _L4 _L3 _L5 _L3 _L6
_L6:
		break MISSING_BLOCK_LABEL_225;
_L3:
		i1 = k;
	//   52  140:iload           4
	//   53  142:istore          5
_L8:
		int l2 = (i1 + i2) - view.getLeft();
	//   54  144:iload           5
	//   55  146:iload           9
	//   56  148:iadd            
	//   57  149:aload           13
	//   58  151:invokevirtual   #400 <Method int View.getLeft()>
	//   59  154:isub            
	//   60  155:istore          12
		l1 = k;
	//   61  157:iload           4
	//   62  159:istore          8
		i1 = j1;
	//   63  161:iload           6
	//   64  163:istore          5
		if(l2 != 0)
	//*  65  165:iload           12
	//*  66  167:ifeq            81
		{
			view.offsetLeftAndRight(l2);
	//   67  170:aload           13
	//   68  172:iload           12
	//   69  174:invokevirtual   #1114 <Method void View.offsetLeftAndRight(int)>
			l1 = k;
	//   70  177:iload           4
	//   71  179:istore          8
			i1 = j1;
	//   72  181:iload           6
	//   73  183:istore          5
		}
		  goto _L7
	//*  74  185:goto            81
_L5:
		i1 = k;
	//   75  188:iload           4
	//   76  190:istore          5
		k += view.getWidth();
	//   77  192:iload           4
	//   78  194:aload           13
	//   79  196:invokevirtual   #1115 <Method int View.getWidth()>
	//   80  199:iadd            
	//   81  200:istore          4
		  goto _L8
	//*  82  202:goto            144
_L4:
		i1 = Math.max((j2 - view.getMeasuredWidth()) / 2, k);
	//   83  205:iload           10
	//   84  207:aload           13
	//   85  209:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//   86  212:isub            
	//   87  213:iconst_2        
	//   88  214:idiv            
	//   89  215:iload           4
	//   90  217:invokestatic    #335 <Method int Math.max(int, int)>
	//   91  220:istore          5
		  goto _L8
	//*  92  222:goto            144
		i1 = j2 - j1 - view.getMeasuredWidth();
	//   93  225:iload           10
	//   94  227:iload           6
	//   95  229:isub            
	//   96  230:aload           13
	//   97  232:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//   98  235:isub            
	//   99  236:istore          5
		j1 += view.getMeasuredWidth();
	//  100  238:iload           6
	//  101  240:aload           13
	//  102  242:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//  103  245:iadd            
	//  104  246:istore          6
		  goto _L8
	//* 105  248:goto            144
		dispatchOnPageScrolled(i, f, j);
	//  106  251:aload_0         
	//  107  252:iload_1         
	//  108  253:fload_2         
	//  109  254:iload_3         
	//  110  255:invokespecial   #1117 <Method void dispatchOnPageScrolled(int, float, int)>
		if(mPageTransformer != null)
	//* 111  258:aload_0         
	//* 112  259:getfield        #1119 <Field ViewPager$PageTransformer mPageTransformer>
	//* 113  262:ifnull          342
		{
			j = getScrollX();
	//  114  265:aload_0         
	//  115  266:invokevirtual   #283 <Method int getScrollX()>
	//  116  269:istore_3        
			int l = getChildCount();
	//  117  270:aload_0         
	//  118  271:invokevirtual   #367 <Method int getChildCount()>
	//  119  274:istore          4
			i = 0;
	//  120  276:iconst_0        
	//  121  277:istore_1        
			while(i < l) 
	//* 122  278:iload_1         
	//* 123  279:iload           4
	//* 124  281:icmpge          342
			{
				View view1 = getChildAt(i);
	//  125  284:aload_0         
	//  126  285:iload_1         
	//  127  286:invokevirtual   #373 <Method View getChildAt(int)>
	//  128  289:astore          13
				if(!((LayoutParams)view1.getLayoutParams()).isDecor)
	//* 129  291:aload           13
	//* 130  293:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 131  296:checkcast       #20  <Class ViewPager$LayoutParams>
	//* 132  299:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//* 133  302:ifeq            312
	//* 134  305:iload_1         
	//* 135  306:iconst_1        
	//* 136  307:iadd            
	//* 137  308:istore_1        
	//* 138  309:goto            278
				{
					f = (float)(view1.getLeft() - j) / (float)getClientWidth();
	//  139  312:aload           13
	//  140  314:invokevirtual   #400 <Method int View.getLeft()>
	//  141  317:iload_3         
	//  142  318:isub            
	//  143  319:i2f             
	//  144  320:aload_0         
	//  145  321:invokespecial   #242 <Method int getClientWidth()>
	//  146  324:i2f             
	//  147  325:fdiv            
	//  148  326:fstore_2        
					mPageTransformer.transformPage(view1, f);
	//  149  327:aload_0         
	//  150  328:getfield        #1119 <Field ViewPager$PageTransformer mPageTransformer>
	//  151  331:aload           13
	//  152  333:fload_2         
	//  153  334:invokeinterface #1123 <Method void ViewPager$PageTransformer.transformPage(View, float)>
				}
				i++;
			}
		}
	//* 154  339:goto            305
		mCalledSuper = true;
	//  155  342:aload_0         
	//  156  343:iconst_1        
	//  157  344:putfield        #484 <Field boolean mCalledSuper>
		return;
	//  158  347:return          
		  goto _L7
	}

	protected boolean onRequestFocusInDescendants(int i, Rect rect)
	{
		int k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #367 <Method int getChildCount()>
	//    2    4:istore          4
		int j;
		byte byte0;
		if((i & 2) != 0)
	//*   3    6:iload_1         
	//*   4    7:iconst_2        
	//*   5    8:iand            
	//*   6    9:ifeq            75
		{
			j = 0;
	//    7   12:iconst_0        
	//    8   13:istore_3        
			byte0 = 1;
	//    9   14:iconst_1        
	//   10   15:istore          5
		} else
	//*  11   17:iload_3         
	//*  12   18:iload           4
	//*  13   20:icmpeq          97
	//*  14   23:aload_0         
	//*  15   24:iload_3         
	//*  16   25:invokevirtual   #373 <Method View getChildAt(int)>
	//*  17   28:astore          6
	//*  18   30:aload           6
	//*  19   32:invokevirtual   #590 <Method int View.getVisibility()>
	//*  20   35:ifne            89
	//*  21   38:aload_0         
	//*  22   39:aload           6
	//*  23   41:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//*  24   44:astore          7
	//*  25   46:aload           7
	//*  26   48:ifnull          89
	//*  27   51:aload           7
	//*  28   53:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  29   56:aload_0         
	//*  30   57:getfield        #337 <Field int mCurItem>
	//*  31   60:icmpne          89
	//*  32   63:aload           6
	//*  33   65:iload_1         
	//*  34   66:aload_2         
	//*  35   67:invokevirtual   #1128 <Method boolean View.requestFocus(int, Rect)>
	//*  36   70:ifeq            89
	//*  37   73:iconst_1        
	//*  38   74:ireturn         
		{
			j = k - 1;
	//   39   75:iload           4
	//   40   77:iconst_1        
	//   41   78:isub            
	//   42   79:istore_3        
			byte0 = -1;
	//   43   80:iconst_m1       
	//   44   81:istore          5
			k = -1;
	//   45   83:iconst_m1       
	//   46   84:istore          4
		}
		for(; j != k; j += ((int) (byte0)))
		{
			View view = getChildAt(j);
			if(view.getVisibility() != 0)
				continue;
			ItemInfo iteminfo = infoForChild(view);
			if(iteminfo != null && iteminfo.position == mCurItem && view.requestFocus(i, rect))
				return true;
		}

	//   47   86:goto            17
	//   48   89:iload_3         
	//   49   90:iload           5
	//   50   92:iadd            
	//   51   93:istore_3        
	//*  52   94:goto            17
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
	//    5    9:invokespecial   #1132 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
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
	//   12   20:invokevirtual   #1136 <Method Parcelable ViewPager$SavedState.getSuperState()>
	//   13   23:invokespecial   #1132 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		if(mAdapter != null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #233 <Field PagerAdapter mAdapter>
	//*  16   30:ifnull          59
		{
			mAdapter.restoreState(((SavedState) (parcelable)).adapterState, ((SavedState) (parcelable)).loader);
	//   17   33:aload_0         
	//   18   34:getfield        #233 <Field PagerAdapter mAdapter>
	//   19   37:aload_1         
	//   20   38:getfield        #1139 <Field Parcelable ViewPager$SavedState.adapterState>
	//   21   41:aload_1         
	//   22   42:getfield        #1142 <Field ClassLoader ViewPager$SavedState.loader>
	//   23   45:invokevirtual   #1146 <Method void PagerAdapter.restoreState(Parcelable, ClassLoader)>
			setCurrentItemInternal(((SavedState) (parcelable)).position, false, true);
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:getfield        #1147 <Field int ViewPager$SavedState.position>
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
	//   33   61:getfield        #1147 <Field int ViewPager$SavedState.position>
	//   34   64:putfield        #198 <Field int mRestoredCurItem>
			mRestoredAdapterState = ((SavedState) (parcelable)).adapterState;
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:getfield        #1139 <Field Parcelable ViewPager$SavedState.adapterState>
	//   38   72:putfield        #200 <Field Parcelable mRestoredAdapterState>
			mRestoredClassLoader = ((SavedState) (parcelable)).loader;
	//   39   75:aload_0         
	//   40   76:aload_1         
	//   41   77:getfield        #1142 <Field ClassLoader ViewPager$SavedState.loader>
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
	//    3    5:invokespecial   #1150 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #1152 <Method void ViewPager$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.position = mCurItem;
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #337 <Field int mCurItem>
	//    9   17:putfield        #1147 <Field int ViewPager$SavedState.position>
		if(mAdapter != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #233 <Field PagerAdapter mAdapter>
	//*  12   24:ifnull          38
			savedstate.adapterState = mAdapter.saveState();
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #233 <Field PagerAdapter mAdapter>
	//   16   32:invokevirtual   #1155 <Method Parcelable PagerAdapter.saveState()>
	//   17   35:putfield        #1139 <Field Parcelable ViewPager$SavedState.adapterState>
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
	//    5    6:invokespecial   #1158 <Method void ViewGroup.onSizeChanged(int, int, int, int)>
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
	//   16   25:invokespecial   #1160 <Method void recomputeScrollPosition(int, int, int, int)>
	//   17   28:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i;
		boolean flag;
		boolean flag1;
		if(mFakeDragging)
	//*   0    0:aload_0         
	//*   1    1:getfield        #720 <Field boolean mFakeDragging>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(motionevent.getAction() == 0 && motionevent.getEdgeFlags() != 0)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #1035 <Method int MotionEvent.getAction()>
	//*   7   13:ifne            25
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #1164 <Method int MotionEvent.getEdgeFlags()>
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
		i = motionevent.getAction();
	//   32   66:aload_1         
	//   33   67:invokevirtual   #1035 <Method int MotionEvent.getAction()>
	//   34   70:istore          6
		flag1 = false;
	//   35   72:iconst_0        
	//   36   73:istore          10
		flag = flag1;
	//   37   75:iload           10
	//   38   77:istore          9
		i & 0xff;
	//   39   79:iload           6
	//   40   81:sipush          255
	//   41   84:iand            
		JVM INSTR tableswitch 0 6: default 128
	//	               0 143
	//	               1 411
	//	               2 205
	//	               3 553
	//	               4 132
	//	               5 584
	//	               6 617;
	//   42   85:tableswitch     0 6: default 128
	//	               0 143
	//	               1 411
	//	               2 205
	//	               3 553
	//	               4 132
	//	               5 584
	//	               6 617
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L6:
		break; /* Loop/switch isn't completed */
_L1:
		flag = flag1;
	//   43  128:iload           10
	//   44  130:istore          9
_L10:
		if(flag)
	//*  45  132:iload           9
	//*  46  134:ifeq            141
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   47  137:aload_0         
	//   48  138:invokestatic    #768 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		return true;
	//   49  141:iconst_1        
	//   50  142:ireturn         
_L2:
		mScroller.abortAnimation();
	//   51  143:aload_0         
	//   52  144:getfield        #271 <Field Scroller mScroller>
	//   53  147:invokevirtual   #280 <Method void Scroller.abortAnimation()>
		mPopulatePending = false;
	//   54  150:aload_0         
	//   55  151:iconst_0        
	//   56  152:putfield        #302 <Field boolean mPopulatePending>
		populate();
	//   57  155:aload_0         
	//   58  156:invokevirtual   #1064 <Method void populate()>
		float f = motionevent.getX();
	//   59  159:aload_1         
	//   60  160:invokevirtual   #1056 <Method float MotionEvent.getX()>
	//   61  163:fstore_2        
		mInitialMotionX = f;
	//   62  164:aload_0         
	//   63  165:fload_2         
	//   64  166:putfield        #725 <Field float mInitialMotionX>
		mLastMotionX = f;
	//   65  169:aload_0         
	//   66  170:fload_2         
	//   67  171:putfield        #479 <Field float mLastMotionX>
		f = motionevent.getY();
	//   68  174:aload_1         
	//   69  175:invokevirtual   #1058 <Method float MotionEvent.getY()>
	//   70  178:fstore_2        
		mInitialMotionY = f;
	//   71  179:aload_0         
	//   72  180:fload_2         
	//   73  181:putfield        #1045 <Field float mInitialMotionY>
		mLastMotionY = f;
	//   74  184:aload_0         
	//   75  185:fload_2         
	//   76  186:putfield        #1049 <Field float mLastMotionY>
		mActivePointerId = motionevent.getPointerId(0);
	//   77  189:aload_0         
	//   78  190:aload_1         
	//   79  191:iconst_0        
	//   80  192:invokevirtual   #474 <Method int MotionEvent.getPointerId(int)>
	//   81  195:putfield        #212 <Field int mActivePointerId>
		flag = flag1;
	//   82  198:iload           10
	//   83  200:istore          9
		continue; /* Loop/switch isn't completed */
	//   84  202:goto            132
_L4:
		if(!mIsBeingDragged)
	//*  85  205:aload_0         
	//*  86  206:getfield        #382 <Field boolean mIsBeingDragged>
	//*  87  209:ifne            363
		{
			int j = motionevent.findPointerIndex(mActivePointerId);
	//   88  212:aload_1         
	//   89  213:aload_0         
	//   90  214:getfield        #212 <Field int mActivePointerId>
	//   91  217:invokevirtual   #1040 <Method int MotionEvent.findPointerIndex(int)>
	//   92  220:istore          6
			if(j == -1)
	//*  93  222:iload           6
	//*  94  224:iconst_m1       
	//*  95  225:icmpne          237
			{
				flag = resetTouch();
	//   96  228:aload_0         
	//   97  229:invokespecial   #1037 <Method boolean resetTouch()>
	//   98  232:istore          9
				continue; /* Loop/switch isn't completed */
	//   99  234:goto            132
			}
			float f1 = motionevent.getX(j);
	//  100  237:aload_1         
	//  101  238:iload           6
	//  102  240:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//  103  243:fstore_2        
			float f4 = Math.abs(f1 - mLastMotionX);
	//  104  244:fload_2         
	//  105  245:aload_0         
	//  106  246:getfield        #479 <Field float mLastMotionX>
	//  107  249:fsub            
	//  108  250:invokestatic    #501 <Method float Math.abs(float)>
	//  109  253:fstore          4
			float f3 = motionevent.getY(j);
	//  110  255:aload_1         
	//  111  256:iload           6
	//  112  258:invokevirtual   #1043 <Method float MotionEvent.getY(int)>
	//  113  261:fstore_3        
			float f5 = Math.abs(f3 - mLastMotionY);
	//  114  262:fload_3         
	//  115  263:aload_0         
	//  116  264:getfield        #1049 <Field float mLastMotionY>
	//  117  267:fsub            
	//  118  268:invokestatic    #501 <Method float Math.abs(float)>
	//  119  271:fstore          5
			if(f4 > (float)mTouchSlop && f4 > f5)
	//* 120  273:fload           4
	//* 121  275:aload_0         
	//* 122  276:getfield        #977 <Field int mTouchSlop>
	//* 123  279:i2f             
	//* 124  280:fcmpl           
	//* 125  281:ifle            363
	//* 126  284:fload           4
	//* 127  286:fload           5
	//* 128  288:fcmpl           
	//* 129  289:ifle            363
			{
				mIsBeingDragged = true;
	//  130  292:aload_0         
	//  131  293:iconst_1        
	//  132  294:putfield        #382 <Field boolean mIsBeingDragged>
				requestParentDisallowInterceptTouchEvent(true);
	//  133  297:aload_0         
	//  134  298:iconst_1        
	//  135  299:invokespecial   #1051 <Method void requestParentDisallowInterceptTouchEvent(boolean)>
				ViewParent viewparent;
				if(f1 - mInitialMotionX > 0.0F)
	//* 136  302:fload_2         
	//* 137  303:aload_0         
	//* 138  304:getfield        #725 <Field float mInitialMotionX>
	//* 139  307:fsub            
	//* 140  308:fconst_0        
	//* 141  309:fcmpl           
	//* 142  310:ifle            397
					f1 = mInitialMotionX + (float)mTouchSlop;
	//  143  313:aload_0         
	//  144  314:getfield        #725 <Field float mInitialMotionX>
	//  145  317:aload_0         
	//  146  318:getfield        #977 <Field int mTouchSlop>
	//  147  321:i2f             
	//  148  322:fadd            
	//  149  323:fstore_2        
				else
	//* 150  324:aload_0         
	//* 151  325:fload_2         
	//* 152  326:putfield        #479 <Field float mLastMotionX>
	//* 153  329:aload_0         
	//* 154  330:fload_3         
	//* 155  331:putfield        #1049 <Field float mLastMotionY>
	//* 156  334:aload_0         
	//* 157  335:iconst_1        
	//* 158  336:invokevirtual   #723 <Method void setScrollState(int)>
	//* 159  339:aload_0         
	//* 160  340:iconst_1        
	//* 161  341:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
	//* 162  344:aload_0         
	//* 163  345:invokevirtual   #541 <Method ViewParent getParent()>
	//* 164  348:astore          11
	//* 165  350:aload           11
	//* 166  352:ifnull          363
	//* 167  355:aload           11
	//* 168  357:iconst_1        
	//* 169  358:invokeinterface #546 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//* 170  363:iload           10
	//* 171  365:istore          9
	//* 172  367:aload_0         
	//* 173  368:getfield        #382 <Field boolean mIsBeingDragged>
	//* 174  371:ifeq            132
	//* 175  374:iconst_0        
	//* 176  375:aload_0         
	//* 177  376:aload_1         
	//* 178  377:aload_1         
	//* 179  378:aload_0         
	//* 180  379:getfield        #212 <Field int mActivePointerId>
	//* 181  382:invokevirtual   #1040 <Method int MotionEvent.findPointerIndex(int)>
	//* 182  385:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//* 183  388:invokespecial   #1053 <Method boolean performDrag(float)>
	//* 184  391:ior             
	//* 185  392:istore          9
	//* 186  394:goto            132
					f1 = mInitialMotionX - (float)mTouchSlop;
	//  187  397:aload_0         
	//  188  398:getfield        #725 <Field float mInitialMotionX>
	//  189  401:aload_0         
	//  190  402:getfield        #977 <Field int mTouchSlop>
	//  191  405:i2f             
	//  192  406:fsub            
	//  193  407:fstore_2        
				mLastMotionX = f1;
				mLastMotionY = f3;
				setScrollState(1);
				setScrollingCacheEnabled(true);
				viewparent = getParent();
				if(viewparent != null)
					viewparent.requestDisallowInterceptTouchEvent(true);
			}
		}
		flag = flag1;
		if(mIsBeingDragged)
			flag = false | performDrag(motionevent.getX(motionevent.findPointerIndex(mActivePointerId)));
		continue; /* Loop/switch isn't completed */
	//  194  408:goto            324
_L3:
		flag = flag1;
	//  195  411:iload           10
	//  196  413:istore          9
		if(mIsBeingDragged)
	//* 197  415:aload_0         
	//* 198  416:getfield        #382 <Field boolean mIsBeingDragged>
	//* 199  419:ifeq            132
		{
			Object obj = ((Object) (mVelocityTracker));
	//  200  422:aload_0         
	//  201  423:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//  202  426:astore          11
			((VelocityTracker) (obj)).computeCurrentVelocity(1000, mMaximumVelocity);
	//  203  428:aload           11
	//  204  430:sipush          1000
	//  205  433:aload_0         
	//  206  434:getfield        #886 <Field int mMaximumVelocity>
	//  207  437:i2f             
	//  208  438:invokevirtual   #890 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
			int k = (int)((VelocityTracker) (obj)).getXVelocity(mActivePointerId);
	//  209  441:aload           11
	//  210  443:aload_0         
	//  211  444:getfield        #212 <Field int mActivePointerId>
	//  212  447:invokevirtual   #893 <Method float VelocityTracker.getXVelocity(int)>
	//  213  450:f2i             
	//  214  451:istore          6
			mPopulatePending = true;
	//  215  453:aload_0         
	//  216  454:iconst_1        
	//  217  455:putfield        #302 <Field boolean mPopulatePending>
			int i1 = getClientWidth();
	//  218  458:aload_0         
	//  219  459:invokespecial   #242 <Method int getClientWidth()>
	//  220  462:istore          7
			int j1 = getScrollX();
	//  221  464:aload_0         
	//  222  465:invokevirtual   #283 <Method int getScrollX()>
	//  223  468:istore          8
			obj = ((Object) (infoForCurrentScrollPosition()));
	//  224  470:aload_0         
	//  225  471:invokespecial   #494 <Method ViewPager$ItemInfo infoForCurrentScrollPosition()>
	//  226  474:astore          11
			float f2 = (float)mPageMargin / (float)i1;
	//  227  476:aload_0         
	//  228  477:getfield        #244 <Field int mPageMargin>
	//  229  480:i2f             
	//  230  481:iload           7
	//  231  483:i2f             
	//  232  484:fdiv            
	//  233  485:fstore_2        
			setCurrentItemInternal(determineTargetPage(((ItemInfo) (obj)).position, ((float)j1 / (float)i1 - ((ItemInfo) (obj)).offset) / (((ItemInfo) (obj)).widthFactor + f2), k, (int)(motionevent.getX(motionevent.findPointerIndex(mActivePointerId)) - mInitialMotionX)), true, true, k);
	//  234  486:aload_0         
	//  235  487:aload_0         
	//  236  488:aload           11
	//  237  490:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  238  493:iload           8
	//  239  495:i2f             
	//  240  496:iload           7
	//  241  498:i2f             
	//  242  499:fdiv            
	//  243  500:aload           11
	//  244  502:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  245  505:fsub            
	//  246  506:aload           11
	//  247  508:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  248  511:fload_2         
	//  249  512:fadd            
	//  250  513:fdiv            
	//  251  514:iload           6
	//  252  516:aload_1         
	//  253  517:aload_1         
	//  254  518:aload_0         
	//  255  519:getfield        #212 <Field int mActivePointerId>
	//  256  522:invokevirtual   #1040 <Method int MotionEvent.findPointerIndex(int)>
	//  257  525:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//  258  528:aload_0         
	//  259  529:getfield        #725 <Field float mInitialMotionX>
	//  260  532:fsub            
	//  261  533:f2i             
	//  262  534:invokespecial   #895 <Method int determineTargetPage(int, float, int, int)>
	//  263  537:iconst_1        
	//  264  538:iconst_1        
	//  265  539:iload           6
	//  266  541:invokevirtual   #898 <Method void setCurrentItemInternal(int, boolean, boolean, int)>
			flag = resetTouch();
	//  267  544:aload_0         
	//  268  545:invokespecial   #1037 <Method boolean resetTouch()>
	//  269  548:istore          9
		}
		continue; /* Loop/switch isn't completed */
	//  270  550:goto            132
_L5:
		flag = flag1;
	//  271  553:iload           10
	//  272  555:istore          9
		if(mIsBeingDragged)
	//* 273  557:aload_0         
	//* 274  558:getfield        #382 <Field boolean mIsBeingDragged>
	//* 275  561:ifeq            132
		{
			scrollToItem(mCurItem, true, 0, false);
	//  276  564:aload_0         
	//  277  565:aload_0         
	//  278  566:getfield        #337 <Field int mCurItem>
	//  279  569:iconst_1        
	//  280  570:iconst_0        
	//  281  571:iconst_0        
	//  282  572:invokespecial   #1091 <Method void scrollToItem(int, boolean, int, boolean)>
			flag = resetTouch();
	//  283  575:aload_0         
	//  284  576:invokespecial   #1037 <Method boolean resetTouch()>
	//  285  579:istore          9
		}
		continue; /* Loop/switch isn't completed */
	//  286  581:goto            132
_L7:
		int l = motionevent.getActionIndex();
	//  287  584:aload_1         
	//  288  585:invokevirtual   #471 <Method int MotionEvent.getActionIndex()>
	//  289  588:istore          6
		mLastMotionX = motionevent.getX(l);
	//  290  590:aload_0         
	//  291  591:aload_1         
	//  292  592:iload           6
	//  293  594:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//  294  597:putfield        #479 <Field float mLastMotionX>
		mActivePointerId = motionevent.getPointerId(l);
	//  295  600:aload_0         
	//  296  601:aload_1         
	//  297  602:iload           6
	//  298  604:invokevirtual   #474 <Method int MotionEvent.getPointerId(int)>
	//  299  607:putfield        #212 <Field int mActivePointerId>
		flag = flag1;
	//  300  610:iload           10
	//  301  612:istore          9
		continue; /* Loop/switch isn't completed */
	//  302  614:goto            132
_L8:
		onSecondaryPointerUp(motionevent);
	//  303  617:aload_0         
	//  304  618:aload_1         
	//  305  619:invokespecial   #1066 <Method void onSecondaryPointerUp(MotionEvent)>
		mLastMotionX = motionevent.getX(motionevent.findPointerIndex(mActivePointerId));
	//  306  622:aload_0         
	//  307  623:aload_1         
	//  308  624:aload_1         
	//  309  625:aload_0         
	//  310  626:getfield        #212 <Field int mActivePointerId>
	//  311  629:invokevirtual   #1040 <Method int MotionEvent.findPointerIndex(int)>
	//  312  632:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//  313  635:putfield        #479 <Field float mLastMotionX>
		flag = flag1;
	//  314  638:iload           10
	//  315  640:istore          9
		if(true) goto _L10; else goto _L9
	//  316  642:goto            132
_L9:
	}

	boolean pageLeft()
	{
		if(mCurItem > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #337 <Field int mCurItem>
	//*   2    4:ifle            20
		{
			setCurrentItem(mCurItem - 1, true);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #337 <Field int mCurItem>
	//    6   12:iconst_1        
	//    7   13:isub            
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #1168 <Method void setCurrentItem(int, boolean)>
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
	//*   4    8:getfield        #337 <Field int mCurItem>
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
	//   13   25:getfield        #337 <Field int mCurItem>
	//   14   28:iconst_1        
	//   15   29:iadd            
	//   16   30:iconst_1        
	//   17   31:invokevirtual   #1168 <Method void setCurrentItem(int, boolean)>
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
	//    2    2:getfield        #337 <Field int mCurItem>
	//    3    5:invokevirtual   #1170 <Method void populate(int)>
	//    4    8:return          
	}

	void populate(int i)
	{
		Object obj2;
		obj2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          14
		if(mCurItem != i)
	//*   2    3:aload_0         
	//*   3    4:getfield        #337 <Field int mCurItem>
	//*   4    7:iload_1         
	//*   5    8:icmpeq          26
		{
			obj2 = ((Object) (infoForPosition(mCurItem)));
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getfield        #337 <Field int mCurItem>
	//    9   16:invokevirtual   #523 <Method ViewPager$ItemInfo infoForPosition(int)>
	//   10   19:astore          14
			mCurItem = i;
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:putfield        #337 <Field int mCurItem>
		}
		if(mAdapter != null) goto _L2; else goto _L1
	//   14   26:aload_0         
	//   15   27:getfield        #233 <Field PagerAdapter mAdapter>
	//   16   30:ifnonnull       38
_L1:
		sortChildDrawingOrder();
	//   17   33:aload_0         
	//   18   34:invokespecial   #1174 <Method void sortChildDrawingOrder()>
_L4:
		return;
	//   19   37:return          
_L2:
		if(mPopulatePending)
	//*  20   38:aload_0         
	//*  21   39:getfield        #302 <Field boolean mPopulatePending>
	//*  22   42:ifeq            50
		{
			sortChildDrawingOrder();
	//   23   45:aload_0         
	//   24   46:invokespecial   #1174 <Method void sortChildDrawingOrder()>
			return;
	//   25   49:return          
		}
		if(getWindowToken() == null) goto _L4; else goto _L3
	//   26   50:aload_0         
	//   27   51:invokevirtual   #1178 <Method android.os.IBinder getWindowToken()>
	//   28   54:ifnull          37
_L3:
		int j1;
		int k1;
		int l1;
		ItemInfo iteminfo1;
		mAdapter.startUpdate(((ViewGroup) (this)));
	//   29   57:aload_0         
	//   30   58:getfield        #233 <Field PagerAdapter mAdapter>
	//   31   61:aload_0         
	//   32   62:invokevirtual   #782 <Method void PagerAdapter.startUpdate(ViewGroup)>
		i = mOffscreenPageLimit;
	//   33   65:aload_0         
	//   34   66:getfield        #210 <Field int mOffscreenPageLimit>
	//   35   69:istore_1        
		l1 = Math.max(0, mCurItem - i);
	//   36   70:iconst_0        
	//   37   71:aload_0         
	//   38   72:getfield        #337 <Field int mCurItem>
	//   39   75:iload_1         
	//   40   76:isub            
	//   41   77:invokestatic    #335 <Method int Math.max(int, int)>
	//   42   80:istore          11
		j1 = mAdapter.getCount();
	//   43   82:aload_0         
	//   44   83:getfield        #233 <Field PagerAdapter mAdapter>
	//   45   86:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//   46   89:istore          9
		k1 = Math.min(j1 - 1, mCurItem + i);
	//   47   91:iload           9
	//   48   93:iconst_1        
	//   49   94:isub            
	//   50   95:aload_0         
	//   51   96:getfield        #337 <Field int mCurItem>
	//   52   99:iload_1         
	//   53  100:iadd            
	//   54  101:invokestatic    #332 <Method int Math.min(int, int)>
	//   55  104:istore          10
		if(j1 != mExpectedAdapterCount)
	//*  56  106:iload           9
	//*  57  108:aload_0         
	//*  58  109:getfield        #771 <Field int mExpectedAdapterCount>
	//*  59  112:icmpeq          224
		{
			String s;
			try
			{
				s = getResources().getResourceName(getId());
	//   60  115:aload_0         
	//   61  116:invokevirtual   #1179 <Method Resources getResources()>
	//   62  119:aload_0         
	//   63  120:invokevirtual   #1182 <Method int getId()>
	//   64  123:invokevirtual   #1186 <Method String Resources.getResourceName(int)>
	//   65  126:astore          13
			}
	//*  66  128:new             #487 <Class IllegalStateException>
	//*  67  131:dup             
	//*  68  132:new             #688 <Class StringBuilder>
	//*  69  135:dup             
	//*  70  136:invokespecial   #689 <Method void StringBuilder()>
	//*  71  139:ldc2            #1188 <String "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ">
	//*  72  142:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//*  73  145:aload_0         
	//*  74  146:getfield        #771 <Field int mExpectedAdapterCount>
	//*  75  149:invokevirtual   #1191 <Method StringBuilder StringBuilder.append(int)>
	//*  76  152:ldc2            #1193 <String ", found: ">
	//*  77  155:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//*  78  158:iload           9
	//*  79  160:invokevirtual   #1191 <Method StringBuilder StringBuilder.append(int)>
	//*  80  163:ldc2            #1195 <String " Pager id: ">
	//*  81  166:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//*  82  169:aload           13
	//*  83  171:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//*  84  174:ldc2            #1197 <String " Pager class: ">
	//*  85  177:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//*  86  180:aload_0         
	//*  87  181:invokevirtual   #450 <Method Class Object.getClass()>
	//*  88  184:invokevirtual   #1200 <Method StringBuilder StringBuilder.append(Object)>
	//*  89  187:ldc2            #1202 <String " Problematic adapter: ">
	//*  90  190:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//*  91  193:aload_0         
	//*  92  194:getfield        #233 <Field PagerAdapter mAdapter>
	//*  93  197:invokevirtual   #450 <Method Class Object.getClass()>
	//*  94  200:invokevirtual   #1200 <Method StringBuilder StringBuilder.append(Object)>
	//*  95  203:invokevirtual   #705 <Method String StringBuilder.toString()>
	//*  96  206:invokespecial   #492 <Method void IllegalStateException(String)>
	//*  97  209:athrow          
			catch(android.content.res.Resources.NotFoundException notfoundexception)
	//*  98  210:astore          13
			{
				notfoundexception = ((android.content.res.Resources.NotFoundException) (Integer.toHexString(getId())));
	//   99  212:aload_0         
	//  100  213:invokevirtual   #1182 <Method int getId()>
	//  101  216:invokestatic    #1207 <Method String Integer.toHexString(int)>
	//  102  219:astore          13
			}
			throw new IllegalStateException((new StringBuilder()).append("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ").append(mExpectedAdapterCount).append(", found: ").append(j1).append(" Pager id: ").append(s).append(" Pager class: ").append(((Object) (((Object)this).getClass()))).append(" Problematic adapter: ").append(((Object) (((Object) (mAdapter)).getClass()))).toString());
		}
	//* 103  221:goto            128
		iteminfo1 = null;
	//  104  224:aconst_null     
	//  105  225:astore          15
		i = 0;
	//  106  227:iconst_0        
	//  107  228:istore_1        
_L20:
		Object obj = ((Object) (iteminfo1));
	//  108  229:aload           15
	//  109  231:astore          13
		if(i >= mItems.size()) goto _L6; else goto _L5
	//  110  233:iload_1         
	//  111  234:aload_0         
	//  112  235:getfield        #188 <Field ArrayList mItems>
	//  113  238:invokevirtual   #256 <Method int ArrayList.size()>
	//  114  241:icmpge          289
_L5:
		ItemInfo iteminfo2 = (ItemInfo)mItems.get(i);
	//  115  244:aload_0         
	//  116  245:getfield        #188 <Field ArrayList mItems>
	//  117  248:iload_1         
	//  118  249:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  119  252:checkcast       #17  <Class ViewPager$ItemInfo>
	//  120  255:astore          16
		if(iteminfo2.position < mCurItem) goto _L8; else goto _L7
	//  121  257:aload           16
	//  122  259:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  123  262:aload_0         
	//  124  263:getfield        #337 <Field int mCurItem>
	//  125  266:icmplt          638
_L7:
		obj = ((Object) (iteminfo1));
	//  126  269:aload           15
	//  127  271:astore          13
		if(iteminfo2.position == mCurItem)
	//* 128  273:aload           16
	//* 129  275:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 130  278:aload_0         
	//* 131  279:getfield        #337 <Field int mCurItem>
	//* 132  282:icmpne          289
			obj = ((Object) (iteminfo2));
	//  133  285:aload           16
	//  134  287:astore          13
_L6:
		iteminfo1 = ((ItemInfo) (obj));
	//  135  289:aload           13
	//  136  291:astore          15
		if(obj == null)
	//* 137  293:aload           13
	//* 138  295:ifnonnull       318
		{
			iteminfo1 = ((ItemInfo) (obj));
	//  139  298:aload           13
	//  140  300:astore          15
			if(j1 > 0)
	//* 141  302:iload           9
	//* 142  304:ifle            318
				iteminfo1 = addNewItem(mCurItem, i);
	//  143  307:aload_0         
	//  144  308:aload_0         
	//  145  309:getfield        #337 <Field int mCurItem>
	//  146  312:iload_1         
	//  147  313:invokevirtual   #1209 <Method ViewPager$ItemInfo addNewItem(int, int)>
	//  148  316:astore          15
		}
		if(iteminfo1 == null) goto _L10; else goto _L9
	//  149  318:aload           15
	//  150  320:ifnull          503
_L9:
		float f2;
		float f3;
		int j;
		int k;
		int l;
		int i1;
		int i2;
		f3 = 0.0F;
	//  151  323:fconst_0        
	//  152  324:fstore          4
		i1 = i - 1;
	//  153  326:iload_1         
	//  154  327:iconst_1        
	//  155  328:isub            
	//  156  329:istore          8
		if(i1 >= 0)
	//* 157  331:iload           8
	//* 158  333:iflt            645
			obj = ((Object) ((ItemInfo)mItems.get(i1)));
	//  159  336:aload_0         
	//  160  337:getfield        #188 <Field ArrayList mItems>
	//  161  340:iload           8
	//  162  342:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  163  345:checkcast       #17  <Class ViewPager$ItemInfo>
	//  164  348:astore          13
		else
	//* 165  350:aload_0         
	//* 166  351:invokespecial   #242 <Method int getClientWidth()>
	//* 167  354:istore          12
	//* 168  356:iload           12
	//* 169  358:ifgt            651
	//* 170  361:fconst_0        
	//* 171  362:fstore_3        
	//* 172  363:aload_0         
	//* 173  364:getfield        #337 <Field int mCurItem>
	//* 174  367:iconst_1        
	//* 175  368:isub            
	//* 176  369:istore          7
	//* 177  371:aload           13
	//* 178  373:astore          16
	//* 179  375:iload_1         
	//* 180  376:istore          6
	//* 181  378:iload           7
	//* 182  380:iflt            402
	//* 183  383:fload           4
	//* 184  385:fload_3         
	//* 185  386:fcmpl           
	//* 186  387:iflt            808
	//* 187  390:iload           7
	//* 188  392:iload           11
	//* 189  394:icmpge          808
	//* 190  397:aload           16
	//* 191  399:ifnonnull       672
	//* 192  402:aload           15
	//* 193  404:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//* 194  407:fstore          4
	//* 195  409:iload           6
	//* 196  411:iconst_1        
	//* 197  412:iadd            
	//* 198  413:istore          7
	//* 199  415:fload           4
	//* 200  417:fconst_2        
	//* 201  418:fcmpg           
	//* 202  419:ifge            493
	//* 203  422:iload           7
	//* 204  424:aload_0         
	//* 205  425:getfield        #188 <Field ArrayList mItems>
	//* 206  428:invokevirtual   #256 <Method int ArrayList.size()>
	//* 207  431:icmpge          923
	//* 208  434:aload_0         
	//* 209  435:getfield        #188 <Field ArrayList mItems>
	//* 210  438:iload           7
	//* 211  440:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 212  443:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 213  446:astore          13
	//* 214  448:iload           12
	//* 215  450:ifgt            929
	//* 216  453:fconst_0        
	//* 217  454:fstore_3        
	//* 218  455:aload_0         
	//* 219  456:getfield        #337 <Field int mCurItem>
	//* 220  459:iconst_1        
	//* 221  460:iadd            
	//* 222  461:istore          5
	//* 223  463:aload           13
	//* 224  465:astore          16
	//* 225  467:iload           5
	//* 226  469:iload           9
	//* 227  471:icmpge          493
	//* 228  474:fload           4
	//* 229  476:fload_3         
	//* 230  477:fcmpl           
	//* 231  478:iflt            1070
	//* 232  481:iload           5
	//* 233  483:iload           10
	//* 234  485:icmple          1070
	//* 235  488:aload           16
	//* 236  490:ifnonnull       944
	//* 237  493:aload_0         
	//* 238  494:aload           15
	//* 239  496:iload           6
	//* 240  498:aload           14
	//* 241  500:invokespecial   #1211 <Method void calculatePageOffsets(ViewPager$ItemInfo, int, ViewPager$ItemInfo)>
	//* 242  503:aload_0         
	//* 243  504:getfield        #233 <Field PagerAdapter mAdapter>
	//* 244  507:astore          14
	//* 245  509:aload_0         
	//* 246  510:getfield        #337 <Field int mCurItem>
	//* 247  513:istore_1        
	//* 248  514:aload           15
	//* 249  516:ifnull          1189
	//* 250  519:aload           15
	//* 251  521:getfield        #618 <Field Object ViewPager$ItemInfo.object>
	//* 252  524:astore          13
	//* 253  526:aload           14
	//* 254  528:aload_0         
	//* 255  529:iload_1         
	//* 256  530:aload           13
	//* 257  532:invokevirtual   #1214 <Method void PagerAdapter.setPrimaryItem(ViewGroup, int, Object)>
	//* 258  535:aload_0         
	//* 259  536:getfield        #233 <Field PagerAdapter mAdapter>
	//* 260  539:aload_0         
	//* 261  540:invokevirtual   #789 <Method void PagerAdapter.finishUpdate(ViewGroup)>
	//* 262  543:aload_0         
	//* 263  544:invokevirtual   #367 <Method int getChildCount()>
	//* 264  547:istore          5
	//* 265  549:iconst_0        
	//* 266  550:istore_1        
	//* 267  551:iload_1         
	//* 268  552:iload           5
	//* 269  554:icmpge          1195
	//* 270  557:aload_0         
	//* 271  558:iload_1         
	//* 272  559:invokevirtual   #373 <Method View getChildAt(int)>
	//* 273  562:astore          14
	//* 274  564:aload           14
	//* 275  566:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 276  569:checkcast       #20  <Class ViewPager$LayoutParams>
	//* 277  572:astore          13
	//* 278  574:aload           13
	//* 279  576:iload_1         
	//* 280  577:putfield        #931 <Field int ViewPager$LayoutParams.childIndex>
	//* 281  580:aload           13
	//* 282  582:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//* 283  585:ifne            631
	//* 284  588:aload           13
	//* 285  590:getfield        #790 <Field float ViewPager$LayoutParams.widthFactor>
	//* 286  593:fconst_0        
	//* 287  594:fcmpl           
	//* 288  595:ifne            631
	//* 289  598:aload_0         
	//* 290  599:aload           14
	//* 291  601:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//* 292  604:astore          14
	//* 293  606:aload           14
	//* 294  608:ifnull          631
	//* 295  611:aload           13
	//* 296  613:aload           14
	//* 297  615:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//* 298  618:putfield        #790 <Field float ViewPager$LayoutParams.widthFactor>
	//* 299  621:aload           13
	//* 300  623:aload           14
	//* 301  625:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 302  628:putfield        #1215 <Field int ViewPager$LayoutParams.position>
	//* 303  631:iload_1         
	//* 304  632:iconst_1        
	//* 305  633:iadd            
	//* 306  634:istore_1        
	//* 307  635:goto            551
	//* 308  638:iload_1         
	//* 309  639:iconst_1        
	//* 310  640:iadd            
	//* 311  641:istore_1        
	//* 312  642:goto            229
			obj = null;
	//  313  645:aconst_null     
	//  314  646:astore          13
		i2 = getClientWidth();
		if(i2 <= 0)
			f2 = 0.0F;
		else
	//* 315  648:goto            350
			f2 = (2.0F - iteminfo1.widthFactor) + (float)getPaddingLeft() / (float)i2;
	//  316  651:fconst_2        
	//  317  652:aload           15
	//  318  654:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  319  657:fsub            
	//  320  658:aload_0         
	//  321  659:invokevirtual   #436 <Method int getPaddingLeft()>
	//  322  662:i2f             
	//  323  663:iload           12
	//  324  665:i2f             
	//  325  666:fdiv            
	//  326  667:fadd            
	//  327  668:fstore_3        
		l = mCurItem - 1;
		iteminfo2 = ((ItemInfo) (obj));
		k = i;
_L21:
		if(l < 0) goto _L12; else goto _L11
_L11:
		if(f3 < f2 || l >= l1) goto _L14; else goto _L13
_L13:
		if(iteminfo2 != null) goto _L15; else goto _L12
_L12:
		f3 = iteminfo1.widthFactor;
		l = k + 1;
		if(f3 >= 2.0F) goto _L17; else goto _L16
_L16:
		float f;
		if(l < mItems.size())
			obj = ((Object) ((ItemInfo)mItems.get(l)));
		else
	//* 328  669:goto            363
	//* 329  672:iload           6
	//* 330  674:istore_1        
	//* 331  675:fload           4
	//* 332  677:fstore_2        
	//* 333  678:aload           16
	//* 334  680:astore          13
	//* 335  682:iload           8
	//* 336  684:istore          5
	//* 337  686:iload           7
	//* 338  688:aload           16
	//* 339  690:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 340  693:icmpne          776
	//* 341  696:iload           6
	//* 342  698:istore_1        
	//* 343  699:fload           4
	//* 344  701:fstore_2        
	//* 345  702:aload           16
	//* 346  704:astore          13
	//* 347  706:iload           8
	//* 348  708:istore          5
	//* 349  710:aload           16
	//* 350  712:getfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>
	//* 351  715:ifne            776
	//* 352  718:aload_0         
	//* 353  719:getfield        #188 <Field ArrayList mItems>
	//* 354  722:iload           8
	//* 355  724:invokevirtual   #778 <Method Object ArrayList.remove(int)>
	//* 356  727:pop             
	//* 357  728:aload_0         
	//* 358  729:getfield        #233 <Field PagerAdapter mAdapter>
	//* 359  732:aload_0         
	//* 360  733:iload           7
	//* 361  735:aload           16
	//* 362  737:getfield        #618 <Field Object ViewPager$ItemInfo.object>
	//* 363  740:invokevirtual   #786 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
	//* 364  743:iload           8
	//* 365  745:iconst_1        
	//* 366  746:isub            
	//* 367  747:istore          5
	//* 368  749:iload           6
	//* 369  751:iconst_1        
	//* 370  752:isub            
	//* 371  753:istore_1        
	//* 372  754:iload           5
	//* 373  756:iflt            799
	//* 374  759:aload_0         
	//* 375  760:getfield        #188 <Field ArrayList mItems>
	//* 376  763:iload           5
	//* 377  765:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 378  768:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 379  771:astore          13
	//* 380  773:fload           4
	//* 381  775:fstore_2        
	//* 382  776:iload           7
	//* 383  778:iconst_1        
	//* 384  779:isub            
	//* 385  780:istore          7
	//* 386  782:iload_1         
	//* 387  783:istore          6
	//* 388  785:fload_2         
	//* 389  786:fstore          4
	//* 390  788:aload           13
	//* 391  790:astore          16
	//* 392  792:iload           5
	//* 393  794:istore          8
	//* 394  796:goto            378
	//* 395  799:aconst_null     
	//* 396  800:astore          13
	//* 397  802:fload           4
	//* 398  804:fstore_2        
	//* 399  805:goto            776
	//* 400  808:aload           16
	//* 401  810:ifnull          869
	//* 402  813:iload           7
	//* 403  815:aload           16
	//* 404  817:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 405  820:icmpne          869
	//* 406  823:fload           4
	//* 407  825:aload           16
	//* 408  827:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//* 409  830:fadd            
	//* 410  831:fstore_2        
	//* 411  832:iload           8
	//* 412  834:iconst_1        
	//* 413  835:isub            
	//* 414  836:istore          5
	//* 415  838:iload           5
	//* 416  840:iflt            863
	//* 417  843:aload_0         
	//* 418  844:getfield        #188 <Field ArrayList mItems>
	//* 419  847:iload           5
	//* 420  849:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 421  852:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 422  855:astore          13
	//* 423  857:iload           6
	//* 424  859:istore_1        
	//* 425  860:goto            776
	//* 426  863:aconst_null     
	//* 427  864:astore          13
	//* 428  866:goto            857
	//* 429  869:fload           4
	//* 430  871:aload_0         
	//* 431  872:iload           7
	//* 432  874:iload           8
	//* 433  876:iconst_1        
	//* 434  877:iadd            
	//* 435  878:invokevirtual   #1209 <Method ViewPager$ItemInfo addNewItem(int, int)>
	//* 436  881:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//* 437  884:fadd            
	//* 438  885:fstore_2        
	//* 439  886:iload           6
	//* 440  888:iconst_1        
	//* 441  889:iadd            
	//* 442  890:istore_1        
	//* 443  891:iload           8
	//* 444  893:iflt            917
	//* 445  896:aload_0         
	//* 446  897:getfield        #188 <Field ArrayList mItems>
	//* 447  900:iload           8
	//* 448  902:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 449  905:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 450  908:astore          13
	//* 451  910:iload           8
	//* 452  912:istore          5
	//* 453  914:goto            776
	//* 454  917:aconst_null     
	//* 455  918:astore          13
	//* 456  920:goto            910
			obj = null;
	//  457  923:aconst_null     
	//  458  924:astore          13
		if(i2 <= 0)
			f2 = 0.0F;
		else
	//* 459  926:goto            448
			f2 = (float)getPaddingRight() / (float)i2 + 2.0F;
	//  460  929:aload_0         
	//  461  930:invokevirtual   #439 <Method int getPaddingRight()>
	//  462  933:i2f             
	//  463  934:iload           12
	//  464  936:i2f             
	//  465  937:fdiv            
	//  466  938:fconst_2        
	//  467  939:fadd            
	//  468  940:fstore_3        
		j = mCurItem + 1;
		iteminfo2 = ((ItemInfo) (obj));
_L23:
		if(j >= j1) goto _L17; else goto _L18
_L18:
		if(f3 < f2 || j <= k1)
			break MISSING_BLOCK_LABEL_1070;
		if(iteminfo2 != null) goto _L19; else goto _L17
_L17:
		calculatePageOffsets(iteminfo1, k, ((ItemInfo) (obj2)));
_L10:
		obj2 = ((Object) (mAdapter));
		i = mCurItem;
		float f1;
		if(iteminfo1 != null)
			obj = iteminfo1.object;
		else
	//* 469  941:goto            455
	//* 470  944:fload           4
	//* 471  946:fstore_2        
	//* 472  947:aload           16
	//* 473  949:astore          13
	//* 474  951:iload           7
	//* 475  953:istore_1        
	//* 476  954:iload           5
	//* 477  956:aload           16
	//* 478  958:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 479  961:icmpne          1039
	//* 480  964:fload           4
	//* 481  966:fstore_2        
	//* 482  967:aload           16
	//* 483  969:astore          13
	//* 484  971:iload           7
	//* 485  973:istore_1        
	//* 486  974:aload           16
	//* 487  976:getfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>
	//* 488  979:ifne            1039
	//* 489  982:aload_0         
	//* 490  983:getfield        #188 <Field ArrayList mItems>
	//* 491  986:iload           7
	//* 492  988:invokevirtual   #778 <Method Object ArrayList.remove(int)>
	//* 493  991:pop             
	//* 494  992:aload_0         
	//* 495  993:getfield        #233 <Field PagerAdapter mAdapter>
	//* 496  996:aload_0         
	//* 497  997:iload           5
	//* 498  999:aload           16
	//* 499 1001:getfield        #618 <Field Object ViewPager$ItemInfo.object>
	//* 500 1004:invokevirtual   #786 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
	//* 501 1007:iload           7
	//* 502 1009:aload_0         
	//* 503 1010:getfield        #188 <Field ArrayList mItems>
	//* 504 1013:invokevirtual   #256 <Method int ArrayList.size()>
	//* 505 1016:icmpge          1058
	//* 506 1019:aload_0         
	//* 507 1020:getfield        #188 <Field ArrayList mItems>
	//* 508 1023:iload           7
	//* 509 1025:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 510 1028:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 511 1031:astore          13
	//* 512 1033:iload           7
	//* 513 1035:istore_1        
	//* 514 1036:fload           4
	//* 515 1038:fstore_2        
	//* 516 1039:iload           5
	//* 517 1041:iconst_1        
	//* 518 1042:iadd            
	//* 519 1043:istore          5
	//* 520 1045:fload_2         
	//* 521 1046:fstore          4
	//* 522 1048:aload           13
	//* 523 1050:astore          16
	//* 524 1052:iload_1         
	//* 525 1053:istore          7
	//* 526 1055:goto            467
	//* 527 1058:aconst_null     
	//* 528 1059:astore          13
	//* 529 1061:fload           4
	//* 530 1063:fstore_2        
	//* 531 1064:iload           7
	//* 532 1066:istore_1        
	//* 533 1067:goto            1039
	//* 534 1070:aload           16
	//* 535 1072:ifnull          1132
	//* 536 1075:iload           5
	//* 537 1077:aload           16
	//* 538 1079:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 539 1082:icmpne          1132
	//* 540 1085:fload           4
	//* 541 1087:aload           16
	//* 542 1089:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//* 543 1092:fadd            
	//* 544 1093:fstore_2        
	//* 545 1094:iload           7
	//* 546 1096:iconst_1        
	//* 547 1097:iadd            
	//* 548 1098:istore_1        
	//* 549 1099:iload_1         
	//* 550 1100:aload_0         
	//* 551 1101:getfield        #188 <Field ArrayList mItems>
	//* 552 1104:invokevirtual   #256 <Method int ArrayList.size()>
	//* 553 1107:icmpge          1126
	//* 554 1110:aload_0         
	//* 555 1111:getfield        #188 <Field ArrayList mItems>
	//* 556 1114:iload_1         
	//* 557 1115:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 558 1118:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 559 1121:astore          13
	//* 560 1123:goto            1039
	//* 561 1126:aconst_null     
	//* 562 1127:astore          13
	//* 563 1129:goto            1123
	//* 564 1132:aload_0         
	//* 565 1133:iload           5
	//* 566 1135:iload           7
	//* 567 1137:invokevirtual   #1209 <Method ViewPager$ItemInfo addNewItem(int, int)>
	//* 568 1140:astore          13
	//* 569 1142:iload           7
	//* 570 1144:iconst_1        
	//* 571 1145:iadd            
	//* 572 1146:istore_1        
	//* 573 1147:fload           4
	//* 574 1149:aload           13
	//* 575 1151:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//* 576 1154:fadd            
	//* 577 1155:fstore_2        
	//* 578 1156:iload_1         
	//* 579 1157:aload_0         
	//* 580 1158:getfield        #188 <Field ArrayList mItems>
	//* 581 1161:invokevirtual   #256 <Method int ArrayList.size()>
	//* 582 1164:icmpge          1183
	//* 583 1167:aload_0         
	//* 584 1168:getfield        #188 <Field ArrayList mItems>
	//* 585 1171:iload_1         
	//* 586 1172:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 587 1175:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 588 1178:astore          13
	//* 589 1180:goto            1039
	//* 590 1183:aconst_null     
	//* 591 1184:astore          13
	//* 592 1186:goto            1180
			obj = null;
	//  593 1189:aconst_null     
	//  594 1190:astore          13
		((PagerAdapter) (obj2)).setPrimaryItem(((ViewGroup) (this)), i, obj);
		mAdapter.finishUpdate(((ViewGroup) (this)));
		j = getChildCount();
		for(i = 0; i < j; i++)
		{
			obj2 = ((Object) (getChildAt(i)));
			obj = ((Object) ((LayoutParams)((View) (obj2)).getLayoutParams()));
			obj.childIndex = i;
			if(!((LayoutParams) (obj)).isDecor && ((LayoutParams) (obj)).widthFactor == 0.0F)
			{
				obj2 = ((Object) (infoForChild(((View) (obj2)))));
				if(obj2 != null)
				{
					obj.widthFactor = ((ItemInfo) (obj2)).widthFactor;
					obj.position = ((ItemInfo) (obj2)).position;
				}
			}
		}

		break MISSING_BLOCK_LABEL_1195;
	//  595 1192:goto            526
_L8:
		i++;
		  goto _L20
_L15:
		i = k;
		f = f3;
		obj = ((Object) (iteminfo2));
		j = i1;
		if(l == iteminfo2.position)
		{
			i = k;
			f = f3;
			obj = ((Object) (iteminfo2));
			j = i1;
			if(!iteminfo2.scrolling)
			{
				mItems.remove(i1);
				mAdapter.destroyItem(((ViewGroup) (this)), l, iteminfo2.object);
				j = i1 - 1;
				i = k - 1;
				if(j >= 0)
				{
					obj = ((Object) ((ItemInfo)mItems.get(j)));
					f = f3;
				} else
				{
					obj = null;
					f = f3;
				}
			}
		}
_L22:
		l--;
		k = i;
		f3 = f;
		iteminfo2 = ((ItemInfo) (obj));
		i1 = j;
		  goto _L21
_L14:
		if(iteminfo2 != null && l == iteminfo2.position)
		{
			f = f3 + iteminfo2.widthFactor;
			j = i1 - 1;
			if(j >= 0)
				obj = ((Object) ((ItemInfo)mItems.get(j)));
			else
				obj = null;
			i = k;
		} else
		{
			f = f3 + addNewItem(l, i1 + 1).widthFactor;
			i = k + 1;
			if(i1 >= 0)
				obj = ((Object) ((ItemInfo)mItems.get(i1)));
			else
				obj = null;
			j = i1;
		}
		  goto _L22
_L19:
		f1 = f3;
		obj = ((Object) (iteminfo2));
		i = l;
		if(j == iteminfo2.position)
		{
			f1 = f3;
			obj = ((Object) (iteminfo2));
			i = l;
			if(!iteminfo2.scrolling)
			{
				mItems.remove(l);
				mAdapter.destroyItem(((ViewGroup) (this)), j, iteminfo2.object);
				if(l < mItems.size())
				{
					obj = ((Object) ((ItemInfo)mItems.get(l)));
					i = l;
					f1 = f3;
				} else
				{
					obj = null;
					f1 = f3;
					i = l;
				}
			}
		}
_L24:
		j++;
		f3 = f1;
		iteminfo2 = ((ItemInfo) (obj));
		l = i;
		  goto _L23
		if(iteminfo2 != null && j == iteminfo2.position)
		{
			f1 = f3 + iteminfo2.widthFactor;
			i = l + 1;
			if(i < mItems.size())
				obj = ((Object) ((ItemInfo)mItems.get(i)));
			else
				obj = null;
		} else
		{
			obj = ((Object) (addNewItem(j, l)));
			i = l + 1;
			f1 = f3 + ((ItemInfo) (obj)).widthFactor;
			if(i < mItems.size())
				obj = ((Object) ((ItemInfo)mItems.get(i)));
			else
				obj = null;
		}
		  goto _L24
		sortChildDrawingOrder();
	//  596 1195:aload_0         
	//  597 1196:invokespecial   #1174 <Method void sortChildDrawingOrder()>
		if(!hasFocus()) goto _L4; else goto _L25
	//  598 1199:aload_0         
	//  599 1200:invokevirtual   #1218 <Method boolean hasFocus()>
	//  600 1203:ifeq            37
_L25:
		Object obj1 = ((Object) (findFocus()));
	//  601 1206:aload_0         
	//  602 1207:invokevirtual   #663 <Method View findFocus()>
	//  603 1210:astore          13
		ItemInfo iteminfo;
		if(obj1 != null)
	//* 604 1212:aload           13
	//* 605 1214:ifnull          1300
			obj1 = ((Object) (infoForAnyChild(((View) (obj1)))));
	//  606 1217:aload_0         
	//  607 1218:aload           13
	//  608 1220:invokevirtual   #1220 <Method ViewPager$ItemInfo infoForAnyChild(View)>
	//  609 1223:astore          13
		else
	//* 610 1225:aload           13
	//* 611 1227:ifnull          1242
	//* 612 1230:aload           13
	//* 613 1232:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 614 1235:aload_0         
	//* 615 1236:getfield        #337 <Field int mCurItem>
	//* 616 1239:icmpeq          37
	//* 617 1242:iconst_0        
	//* 618 1243:istore_1        
	//* 619 1244:iload_1         
	//* 620 1245:aload_0         
	//* 621 1246:invokevirtual   #367 <Method int getChildCount()>
	//* 622 1249:icmpge          37
	//* 623 1252:aload_0         
	//* 624 1253:iload_1         
	//* 625 1254:invokevirtual   #373 <Method View getChildAt(int)>
	//* 626 1257:astore          13
	//* 627 1259:aload_0         
	//* 628 1260:aload           13
	//* 629 1262:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//* 630 1265:astore          14
	//* 631 1267:aload           14
	//* 632 1269:ifnull          1293
	//* 633 1272:aload           14
	//* 634 1274:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 635 1277:aload_0         
	//* 636 1278:getfield        #337 <Field int mCurItem>
	//* 637 1281:icmpne          1293
	//* 638 1284:aload           13
	//* 639 1286:iconst_2        
	//* 640 1287:invokevirtual   #1222 <Method boolean View.requestFocus(int)>
	//* 641 1290:ifne            37
	//* 642 1293:iload_1         
	//* 643 1294:iconst_1        
	//* 644 1295:iadd            
	//* 645 1296:istore_1        
	//* 646 1297:goto            1244
			obj1 = null;
	//  647 1300:aconst_null     
	//  648 1301:astore          13
		if(obj1 != null && ((ItemInfo) (obj1)).position == mCurItem) goto _L4; else goto _L26
_L26:
		i = 0;
_L29:
		if(i >= getChildCount()) goto _L4; else goto _L27
_L27:
		obj1 = ((Object) (getChildAt(i)));
		iteminfo = infoForChild(((View) (obj1)));
		if(iteminfo != null && iteminfo.position == mCurItem && ((View) (obj1)).requestFocus(2)) goto _L4; else goto _L28
_L28:
		i++;
		  goto _L29
	//* 649 1303:goto            1225
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
	//    6   12:invokeinterface #1225 <Method boolean List.remove(Object)>
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
	//    6   12:invokeinterface #1225 <Method boolean List.remove(Object)>
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
	//    5    9:invokevirtual   #1230 <Method void removeViewInLayout(View)>
			return;
	//    6   12:return          
		} else
		{
			super.removeView(view);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #1232 <Method void ViewGroup.removeView(View)>
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
	//    6   12:invokevirtual   #1238 <Method void PagerAdapter.setViewPagerObserver(DataSetObserver)>
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
	//   43   86:invokevirtual   #575 <Method void ArrayList.clear()>
			removeNonDecorViews();
	//   44   89:aload_0         
	//   45   90:invokespecial   #1240 <Method void removeNonDecorViews()>
			mCurItem = 0;
	//   46   93:aload_0         
	//   47   94:iconst_0        
	//   48   95:putfield        #337 <Field int mCurItem>
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
	//*  64  124:ifnull          231
		{
			if(mObserver == null)
	//*  65  127:aload_0         
	//*  66  128:getfield        #1242 <Field ViewPager$PagerObserver mObserver>
	//*  67  131:ifnonnull       146
				mObserver = new PagerObserver();
	//   68  134:aload_0         
	//   69  135:new             #35  <Class ViewPager$PagerObserver>
	//   70  138:dup             
	//   71  139:aload_0         
	//   72  140:invokespecial   #1243 <Method void ViewPager$PagerObserver(ViewPager)>
	//   73  143:putfield        #1242 <Field ViewPager$PagerObserver mObserver>
			mAdapter.setViewPagerObserver(((DataSetObserver) (mObserver)));
	//   74  146:aload_0         
	//   75  147:getfield        #233 <Field PagerAdapter mAdapter>
	//   76  150:aload_0         
	//   77  151:getfield        #1242 <Field ViewPager$PagerObserver mObserver>
	//   78  154:invokevirtual   #1238 <Method void PagerAdapter.setViewPagerObserver(DataSetObserver)>
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
			int j;
			int k;
			if(mRestoredCurItem >= 0)
	//*  93  184:aload_0         
	//*  94  185:getfield        #198 <Field int mRestoredCurItem>
	//*  95  188:iflt            296
			{
				mAdapter.restoreState(mRestoredAdapterState, mRestoredClassLoader);
	//   96  191:aload_0         
	//   97  192:getfield        #233 <Field PagerAdapter mAdapter>
	//   98  195:aload_0         
	//   99  196:getfield        #200 <Field Parcelable mRestoredAdapterState>
	//  100  199:aload_0         
	//  101  200:getfield        #202 <Field ClassLoader mRestoredClassLoader>
	//  102  203:invokevirtual   #1146 <Method void PagerAdapter.restoreState(Parcelable, ClassLoader)>
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
	//* 118  231:aload_0         
	//* 119  232:getfield        #625 <Field List mAdapterChangeListeners>
	//* 120  235:ifnull          315
	//* 121  238:aload_0         
	//* 122  239:getfield        #625 <Field List mAdapterChangeListeners>
	//* 123  242:invokeinterface #1244 <Method boolean List.isEmpty()>
	//* 124  247:ifne            315
	//* 125  250:iconst_0        
	//* 126  251:istore_2        
	//* 127  252:aload_0         
	//* 128  253:getfield        #625 <Field List mAdapterChangeListeners>
	//* 129  256:invokeinterface #351 <Method int List.size()>
	//* 130  261:istore_3        
	//* 131  262:iload_2         
	//* 132  263:iload_3         
	//* 133  264:icmpge          315
	//* 134  267:aload_0         
	//* 135  268:getfield        #625 <Field List mAdapterChangeListeners>
	//* 136  271:iload_2         
	//* 137  272:invokeinterface #352 <Method Object List.get(int)>
	//* 138  277:checkcast       #26  <Class ViewPager$OnAdapterChangeListener>
	//* 139  280:aload_0         
	//* 140  281:aload           5
	//* 141  283:aload_1         
	//* 142  284:invokeinterface #1248 <Method void ViewPager$OnAdapterChangeListener.onAdapterChanged(ViewPager, PagerAdapter, PagerAdapter)>
	//* 143  289:iload_2         
	//* 144  290:iconst_1        
	//* 145  291:iadd            
	//* 146  292:istore_2        
	//* 147  293:goto            262
			if(!flag)
	//* 148  296:iload           4
	//* 149  298:ifne            308
				populate();
	//  150  301:aload_0         
	//  151  302:invokevirtual   #1064 <Method void populate()>
			else
	//* 152  305:goto            231
				requestLayout();
	//  153  308:aload_0         
	//  154  309:invokevirtual   #797 <Method void requestLayout()>
		}
		if(mAdapterChangeListeners != null && !mAdapterChangeListeners.isEmpty())
		{
			j = 0;
			for(k = mAdapterChangeListeners.size(); j < k; j++)
				((OnAdapterChangeListener)mAdapterChangeListeners.get(j)).onAdapterChanged(this, pageradapter1, pageradapter);

		}
	//* 155  312:goto            231
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
	//*   5    9:ifne            22
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
		else
	//*   8   14:aload_0         
	//*   9   15:iload_1         
	//*  10   16:iload_2         
	//*  11   17:iconst_0        
	//*  12   18:invokevirtual   #794 <Method void setCurrentItemInternal(int, boolean, boolean)>
	//*  13   21:return          
			flag = false;
	//   14   22:iconst_0        
	//   15   23:istore_2        
		setCurrentItemInternal(i, flag, false);
	//*  16   24:goto            14
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
	//    5    5:invokevirtual   #898 <Method void setCurrentItemInternal(int, boolean, boolean, int)>
	//    6    8:return          
	}

	void setCurrentItemInternal(int i, boolean flag, boolean flag1, int j)
	{
		boolean flag2;
		flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		if(mAdapter == null || mAdapter.getCount() <= 0)
	//*   2    3:aload_0         
	//*   3    4:getfield        #233 <Field PagerAdapter mAdapter>
	//*   4    7:ifnull          20
	//*   5   10:aload_0         
	//*   6   11:getfield        #233 <Field PagerAdapter mAdapter>
	//*   7   14:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*   8   17:ifgt            26
		{
			setScrollingCacheEnabled(false);
	//    9   20:aload_0         
	//   10   21:iconst_0        
	//   11   22:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
			return;
	//   12   25:return          
		}
		if(!flag1 && mCurItem == i && mItems.size() != 0)
	//*  13   26:iload_3         
	//*  14   27:ifne            54
	//*  15   30:aload_0         
	//*  16   31:getfield        #337 <Field int mCurItem>
	//*  17   34:iload_1         
	//*  18   35:icmpne          54
	//*  19   38:aload_0         
	//*  20   39:getfield        #188 <Field ArrayList mItems>
	//*  21   42:invokevirtual   #256 <Method int ArrayList.size()>
	//*  22   45:ifeq            54
		{
			setScrollingCacheEnabled(false);
	//   23   48:aload_0         
	//   24   49:iconst_0        
	//   25   50:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
			return;
	//   26   53:return          
		}
		if(i >= 0) goto _L2; else goto _L1
	//   27   54:iload_1         
	//   28   55:ifge            123
_L1:
		int k = 0;
	//   29   58:iconst_0        
	//   30   59:istore          5
_L4:
		i = mOffscreenPageLimit;
	//   31   61:aload_0         
	//   32   62:getfield        #210 <Field int mOffscreenPageLimit>
	//   33   65:istore_1        
		if(k > mCurItem + i || k < mCurItem - i)
	//*  34   66:iload           5
	//*  35   68:aload_0         
	//*  36   69:getfield        #337 <Field int mCurItem>
	//*  37   72:iload_1         
	//*  38   73:iadd            
	//*  39   74:icmpgt          88
	//*  40   77:iload           5
	//*  41   79:aload_0         
	//*  42   80:getfield        #337 <Field int mCurItem>
	//*  43   83:iload_1         
	//*  44   84:isub            
	//*  45   85:icmpge          151
			for(i = 0; i < mItems.size(); i++)
	//*  46   88:iconst_0        
	//*  47   89:istore_1        
	//*  48   90:iload_1         
	//*  49   91:aload_0         
	//*  50   92:getfield        #188 <Field ArrayList mItems>
	//*  51   95:invokevirtual   #256 <Method int ArrayList.size()>
	//*  52   98:icmpge          151
				((ItemInfo)mItems.get(i)).scrolling = true;
	//   53  101:aload_0         
	//   54  102:getfield        #188 <Field ArrayList mItems>
	//   55  105:iload_1         
	//   56  106:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   57  109:checkcast       #17  <Class ViewPager$ItemInfo>
	//   58  112:iconst_1        
	//   59  113:putfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>

	//   60  116:iload_1         
	//   61  117:iconst_1        
	//   62  118:iadd            
	//   63  119:istore_1        
		break; /* Loop/switch isn't completed */
	//   64  120:goto            90
_L2:
		k = i;
	//   65  123:iload_1         
	//   66  124:istore          5
		if(i >= mAdapter.getCount())
	//*  67  126:iload_1         
	//*  68  127:aload_0         
	//*  69  128:getfield        #233 <Field PagerAdapter mAdapter>
	//*  70  131:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*  71  134:icmplt          61
			k = mAdapter.getCount() - 1;
	//   72  137:aload_0         
	//   73  138:getfield        #233 <Field PagerAdapter mAdapter>
	//   74  141:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//   75  144:iconst_1        
	//   76  145:isub            
	//   77  146:istore          5
		if(true) goto _L4; else goto _L3
	//   78  148:goto            61
_L3:
		if(mCurItem != k)
	//*  79  151:aload_0         
	//*  80  152:getfield        #337 <Field int mCurItem>
	//*  81  155:iload           5
	//*  82  157:icmpeq          191
			flag1 = flag2;
	//   83  160:iload           6
	//   84  162:istore_3        
		else
	//*  85  163:aload_0         
	//*  86  164:getfield        #214 <Field boolean mFirstLayout>
	//*  87  167:ifeq            196
	//*  88  170:aload_0         
	//*  89  171:iload           5
	//*  90  173:putfield        #337 <Field int mCurItem>
	//*  91  176:iload_3         
	//*  92  177:ifeq            186
	//*  93  180:aload_0         
	//*  94  181:iload           5
	//*  95  183:invokespecial   #563 <Method void dispatchOnPageSelected(int)>
	//*  96  186:aload_0         
	//*  97  187:invokevirtual   #797 <Method void requestLayout()>
	//*  98  190:return          
			flag1 = false;
	//   99  191:iconst_0        
	//  100  192:istore_3        
		if(mFirstLayout)
		{
			mCurItem = k;
			if(flag1)
				dispatchOnPageSelected(k);
			requestLayout();
			return;
		} else
	//* 101  193:goto            163
		{
			populate(k);
	//  102  196:aload_0         
	//  103  197:iload           5
	//  104  199:invokevirtual   #1170 <Method void populate(int)>
			scrollToItem(k, flag, j, flag1);
	//  105  202:aload_0         
	//  106  203:iload           5
	//  107  205:iload_2         
	//  108  206:iload           4
	//  109  208:iload_3         
	//  110  209:invokespecial   #1091 <Method void scrollToItem(int, boolean, int, boolean)>
			return;
	//  111  212:return          
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
	//    6    9:new             #688 <Class StringBuilder>
	//    7   12:dup             
	//    8   13:invokespecial   #689 <Method void StringBuilder()>
	//    9   16:ldc2            #1253 <String "Requested offscreen page limit ">
	//   10   19:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//   11   22:iload_1         
	//   12   23:invokevirtual   #1191 <Method StringBuilder StringBuilder.append(int)>
	//   13   26:ldc2            #1255 <String " too small; defaulting to ">
	//   14   29:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//   15   32:iconst_1        
	//   16   33:invokevirtual   #1191 <Method StringBuilder StringBuilder.append(int)>
	//   17   36:invokevirtual   #705 <Method String StringBuilder.toString()>
	//   18   39:invokestatic    #1258 <Method int Log.w(String, String)>
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
	//   30   59:invokevirtual   #1064 <Method void populate()>
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
	//   14   20:invokespecial   #1160 <Method void recomputeScrollPosition(int, int, int, int)>
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
	//    2    2:invokevirtual   #922 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #1270 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #1273 <Method void setPageMarginDrawable(Drawable)>
	//    6   12:return          
	}

	public void setPageMarginDrawable(Drawable drawable)
	{
		mMarginDrawable = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #868 <Field Drawable mMarginDrawable>
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			refreshDrawableState();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #1276 <Method void refreshDrawableState()>
		boolean flag;
		if(drawable == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       29
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:aload_0         
	//*  12   20:iload_2         
	//*  13   21:invokevirtual   #941 <Method void setWillNotDraw(boolean)>
	//*  14   24:aload_0         
	//*  15   25:invokevirtual   #1279 <Method void invalidate()>
	//*  16   28:return          
			flag = false;
	//   17   29:iconst_0        
	//   18   30:istore_2        
		setWillNotDraw(flag);
		invalidate();
	//*  19   31:goto            19
	}

	public void setPageTransformer(boolean flag, PageTransformer pagetransformer)
	{
		setPageTransformer(flag, pagetransformer, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_2        
	//    4    4:invokevirtual   #1284 <Method void setPageTransformer(boolean, ViewPager$PageTransformer, int)>
	//    5    7:return          
	}

	public void setPageTransformer(boolean flag, PageTransformer pagetransformer, int i)
	{
		int j = 1;
	//    0    0:iconst_1        
	//    1    1:istore          5
		boolean flag1;
		boolean flag2;
		boolean flag3;
		if(pagetransformer != null)
	//*   2    3:aload_2         
	//*   3    4:ifnull          74
			flag2 = true;
	//    4    7:iconst_1        
	//    5    8:istore          6
		else
	//*   6   10:aload_0         
	//*   7   11:getfield        #1119 <Field ViewPager$PageTransformer mPageTransformer>
	//*   8   14:ifnull          80
	//*   9   17:iconst_1        
	//*  10   18:istore          7
	//*  11   20:iload           6
	//*  12   22:iload           7
	//*  13   24:icmpeq          86
	//*  14   27:iconst_1        
	//*  15   28:istore          4
	//*  16   30:aload_0         
	//*  17   31:aload_2         
	//*  18   32:putfield        #1119 <Field ViewPager$PageTransformer mPageTransformer>
	//*  19   35:aload_0         
	//*  20   36:iload           6
	//*  21   38:invokevirtual   #1287 <Method void setChildrenDrawingOrderEnabled(boolean)>
	//*  22   41:iload           6
	//*  23   43:ifeq            92
	//*  24   46:iload_1         
	//*  25   47:ifeq            53
	//*  26   50:iconst_2        
	//*  27   51:istore          5
	//*  28   53:aload_0         
	//*  29   54:iload           5
	//*  30   56:putfield        #568 <Field int mDrawingOrder>
	//*  31   59:aload_0         
	//*  32   60:iload_3         
	//*  33   61:putfield        #369 <Field int mPageTransformerLayerType>
	//*  34   64:iload           4
	//*  35   66:ifeq            73
	//*  36   69:aload_0         
	//*  37   70:invokevirtual   #1064 <Method void populate()>
	//*  38   73:return          
			flag2 = false;
	//   39   74:iconst_0        
	//   40   75:istore          6
		if(mPageTransformer != null)
			flag3 = true;
		else
	//*  41   77:goto            10
			flag3 = false;
	//   42   80:iconst_0        
	//   43   81:istore          7
		if(flag2 != flag3)
			flag1 = true;
		else
	//*  44   83:goto            20
			flag1 = false;
	//   45   86:iconst_0        
	//   46   87:istore          4
		mPageTransformer = pagetransformer;
		setChildrenDrawingOrderEnabled(flag2);
		if(flag2)
		{
			if(flag)
				j = 2;
			mDrawingOrder = j;
			mPageTransformerLayerType = i;
		} else
	//*  47   89:goto            30
		{
			mDrawingOrder = 0;
	//   48   92:aload_0         
	//   49   93:iconst_0        
	//   50   94:putfield        #568 <Field int mDrawingOrder>
		}
		if(flag1)
			populate();
	//*  51   97:goto            64
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
	//*   9   15:getfield        #1119 <Field ViewPager$PageTransformer mPageTransformer>
	//*  10   18:ifnull          32
		{
			boolean flag;
			if(i != 0)
	//*  11   21:iload_1         
	//*  12   22:ifeq            38
				flag = true;
	//   13   25:iconst_1        
	//   14   26:istore_2        
			else
	//*  15   27:aload_0         
	//*  16   28:iload_2         
	//*  17   29:invokespecial   #1289 <Method void enableLayers(boolean)>
	//*  18   32:aload_0         
	//*  19   33:iload_1         
	//*  20   34:invokespecial   #1291 <Method void dispatchOnScrollStateChanged(int)>
	//*  21   37:return          
				flag = false;
	//   22   38:iconst_0        
	//   23   39:istore_2        
			enableLayers(flag);
		}
		dispatchOnScrollStateChanged(i);
	//*  24   40:goto            27
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
		int l;
		int i1;
		int j1;
		if(mScroller != null && !mScroller.isFinished())
	//*   7   13:aload_0         
	//*   8   14:getfield        #271 <Field Scroller mScroller>
	//*   9   17:ifnull          107
	//*  10   20:aload_0         
	//*  11   21:getfield        #271 <Field Scroller mScroller>
	//*  12   24:invokevirtual   #277 <Method boolean Scroller.isFinished()>
	//*  13   27:ifne            107
			l = 1;
	//   14   30:iconst_1        
	//   15   31:istore          7
		else
	//*  16   33:iload           7
	//*  17   35:ifeq            125
	//*  18   38:aload_0         
	//*  19   39:getfield        #761 <Field boolean mIsScrollStarted>
	//*  20   42:ifeq            113
	//*  21   45:aload_0         
	//*  22   46:getfield        #271 <Field Scroller mScroller>
	//*  23   49:invokevirtual   #289 <Method int Scroller.getCurrX()>
	//*  24   52:istore          7
	//*  25   54:aload_0         
	//*  26   55:getfield        #271 <Field Scroller mScroller>
	//*  27   58:invokevirtual   #280 <Method void Scroller.abortAnimation()>
	//*  28   61:aload_0         
	//*  29   62:iconst_0        
	//*  30   63:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
	//*  31   66:aload_0         
	//*  32   67:invokevirtual   #286 <Method int getScrollY()>
	//*  33   70:istore          8
	//*  34   72:iload_1         
	//*  35   73:iload           7
	//*  36   75:isub            
	//*  37   76:istore          9
	//*  38   78:iload_2         
	//*  39   79:iload           8
	//*  40   81:isub            
	//*  41   82:istore_2        
	//*  42   83:iload           9
	//*  43   85:ifne            134
	//*  44   88:iload_2         
	//*  45   89:ifne            134
	//*  46   92:aload_0         
	//*  47   93:iconst_0        
	//*  48   94:invokespecial   #528 <Method void completeScroll(boolean)>
	//*  49   97:aload_0         
	//*  50   98:invokevirtual   #1064 <Method void populate()>
	//*  51  101:aload_0         
	//*  52  102:iconst_0        
	//*  53  103:invokevirtual   #723 <Method void setScrollState(int)>
	//*  54  106:return          
			l = 0;
	//   55  107:iconst_0        
	//   56  108:istore          7
		if(l != 0)
		{
			if(mIsScrollStarted)
				l = mScroller.getCurrX();
			else
	//*  57  110:goto            33
				l = mScroller.getStartX();
	//   58  113:aload_0         
	//   59  114:getfield        #271 <Field Scroller mScroller>
	//   60  117:invokevirtual   #1294 <Method int Scroller.getStartX()>
	//   61  120:istore          7
			mScroller.abortAnimation();
			setScrollingCacheEnabled(false);
		} else
	//*  62  122:goto            54
		{
			l = getScrollX();
	//   63  125:aload_0         
	//   64  126:invokevirtual   #283 <Method int getScrollX()>
	//   65  129:istore          7
		}
		i1 = getScrollY();
		j1 = i - l;
		j -= i1;
		if(j1 == 0 && j == 0)
		{
			completeScroll(false);
			populate();
			setScrollState(0);
			return;
		}
	//*  66  131:goto            66
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
		float f4 = Math.min(1.0F, (1.0F * (float)Math.abs(j1)) / (float)i);
	//   80  154:fconst_1        
	//   81  155:fconst_1        
	//   82  156:iload           9
	//   83  158:invokestatic    #324 <Method int Math.abs(int)>
	//   84  161:i2f             
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
	//   99  184:invokevirtual   #1296 <Method float distanceInfluenceForSnapDuration(float)>
	//  100  187:fstore          6
		k = Math.abs(k);
	//  101  189:iload_3         
	//  102  190:invokestatic    #324 <Method int Math.abs(int)>
	//  103  193:istore_3        
		if(k > 0)
	//* 104  194:iload_3         
	//* 105  195:ifle            255
		{
			i = Math.round(1000F * Math.abs((f + f2 * f4) / (float)k)) * 4;
	//  106  198:ldc2            #1297 <Float 1000F>
	//  107  201:fload           4
	//  108  203:fload           5
	//  109  205:fload           6
	//  110  207:fmul            
	//  111  208:fadd            
	//  112  209:iload_3         
	//  113  210:i2f             
	//  114  211:fdiv            
	//  115  212:invokestatic    #501 <Method float Math.abs(float)>
	//  116  215:fmul            
	//  117  216:invokestatic    #1024 <Method int Math.round(float)>
	//  118  219:iconst_4        
	//  119  220:imul            
	//  120  221:istore_1        
		} else
	//* 121  222:iload_1         
	//* 122  223:sipush          600
	//* 123  226:invokestatic    #332 <Method int Math.min(int, int)>
	//* 124  229:istore_1        
	//* 125  230:aload_0         
	//* 126  231:iconst_0        
	//* 127  232:putfield        #761 <Field boolean mIsScrollStarted>
	//* 128  235:aload_0         
	//* 129  236:getfield        #271 <Field Scroller mScroller>
	//* 130  239:iload           7
	//* 131  241:iload           8
	//* 132  243:iload           9
	//* 133  245:iload_2         
	//* 134  246:iload_1         
	//* 135  247:invokevirtual   #1301 <Method void Scroller.startScroll(int, int, int, int, int)>
	//* 136  250:aload_0         
	//* 137  251:invokestatic    #768 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//* 138  254:return          
		{
			float f1 = i;
	//  139  255:iload_1         
	//  140  256:i2f             
	//  141  257:fstore          4
			float f3 = mAdapter.getPageWidth(mCurItem);
	//  142  259:aload_0         
	//  143  260:getfield        #233 <Field PagerAdapter mAdapter>
	//  144  263:aload_0         
	//  145  264:getfield        #337 <Field int mCurItem>
	//  146  267:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//  147  270:fstore          5
			i = (int)((1.0F + (float)Math.abs(j1) / ((float)mPageMargin + f1 * f3)) * 100F);
	//  148  272:fconst_1        
	//  149  273:iload           9
	//  150  275:invokestatic    #324 <Method int Math.abs(int)>
	//  151  278:i2f             
	//  152  279:aload_0         
	//  153  280:getfield        #244 <Field int mPageMargin>
	//  154  283:i2f             
	//  155  284:fload           4
	//  156  286:fload           5
	//  157  288:fmul            
	//  158  289:fadd            
	//  159  290:fdiv            
	//  160  291:fadd            
	//  161  292:ldc2            #1302 <Float 100F>
	//  162  295:fmul            
	//  163  296:f2i             
	//  164  297:istore_1        
		}
		i = Math.min(i, 600);
		mIsScrollStarted = false;
		mScroller.startScroll(l, i1, j1, j, i);
		ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//* 165  298:goto            222
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == mMarginDrawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1306 <Method boolean ViewGroup.verifyDrawable(Drawable)>
	//    3    5:ifne            16
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #868 <Field Drawable mMarginDrawable>
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
	private Scroller mScroller;
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
