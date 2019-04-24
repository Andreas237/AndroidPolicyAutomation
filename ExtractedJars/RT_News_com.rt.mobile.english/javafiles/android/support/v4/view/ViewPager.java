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
			if(i != 4096)
		//*   8   12:iload_2         
		//*   9   13:sipush          4096
		//*  10   16:icmpeq          59
			{
				if(i != 8192)
		//*  11   19:iload_2         
		//*  12   20:sipush          8192
		//*  13   23:icmpeq          28
					return false;
		//   14   26:iconst_0        
		//   15   27:ireturn         
				if(canScrollHorizontally(-1))
		//*  16   28:aload_0         
		//*  17   29:getfield        #13  <Field ViewPager this$0>
		//*  18   32:iconst_m1       
		//*  19   33:invokevirtual   #80  <Method boolean ViewPager.canScrollHorizontally(int)>
		//*  20   36:ifeq            57
				{
					setCurrentItem(mCurItem - 1);
		//   21   39:aload_0         
		//   22   40:getfield        #13  <Field ViewPager this$0>
		//   23   43:aload_0         
		//   24   44:getfield        #13  <Field ViewPager this$0>
		//   25   47:getfield        #62  <Field int ViewPager.mCurItem>
		//   26   50:iconst_1        
		//   27   51:isub            
		//   28   52:invokevirtual   #90  <Method void ViewPager.setCurrentItem(int)>
					return true;
		//   29   55:iconst_1        
		//   30   56:ireturn         
				} else
				{
					return false;
		//   31   57:iconst_0        
		//   32   58:ireturn         
				}
			}
			if(canScrollHorizontally(1))
		//*  33   59:aload_0         
		//*  34   60:getfield        #13  <Field ViewPager this$0>
		//*  35   63:iconst_1        
		//*  36   64:invokevirtual   #80  <Method boolean ViewPager.canScrollHorizontally(int)>
		//*  37   67:ifeq            88
			{
				setCurrentItem(mCurItem + 1);
		//   38   70:aload_0         
		//   39   71:getfield        #13  <Field ViewPager this$0>
		//   40   74:aload_0         
		//   41   75:getfield        #13  <Field ViewPager this$0>
		//   42   78:getfield        #62  <Field int ViewPager.mCurItem>
		//   43   81:iconst_1        
		//   44   82:iadd            
		//   45   83:invokevirtual   #90  <Method void ViewPager.setCurrentItem(int)>
				return true;
		//   46   86:iconst_1        
		//   47   87:ireturn         
			} else
			{
				return false;
		//   48   88:iconst_0        
		//   49   89:ireturn         
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
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #66  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #67  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("FragmentPager.SavedState{");
		//    4    8:aload_1         
		//    5    9:ldc1            #69  <String "FragmentPager.SavedState{">
		//    6   11:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:invokestatic    #79  <Method int System.identityHashCode(Object)>
		//   11   20:invokestatic    #85  <Method String Integer.toHexString(int)>
		//   12   23:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(" position=");
		//   14   27:aload_1         
		//   15   28:ldc1            #87  <String " position=">
		//   16   30:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
			stringbuilder.append(position);
		//   18   34:aload_1         
		//   19   35:aload_0         
		//   20   36:getfield        #49  <Field int position>
		//   21   39:invokevirtual   #90  <Method StringBuilder StringBuilder.append(int)>
		//   22   42:pop             
			stringbuilder.append("}");
		//   23   43:aload_1         
		//   24   44:ldc1            #92  <String "}">
		//   25   46:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
		//   26   49:pop             
			return stringbuilder.toString();
		//   27   50:aload_1         
		//   28   51:invokevirtual   #94  <Method String StringBuilder.toString()>
		//   29   54:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #98  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(position);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #49  <Field int position>
		//    7   11:invokevirtual   #102 <Method void Parcel.writeInt(int)>
			parcel.writeParcelable(adapterState, i);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #55  <Field Parcelable adapterState>
		//   11   19:iload_2         
		//   12   20:invokevirtual   #106 <Method void Parcel.writeParcelable(Parcelable, int)>
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
		//    2    2:invokespecial   #61  <Method void AbsSavedState(Parcelable)>
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
	//    2    2:invokespecial   #184 <Method void ViewGroup(Context)>
		mItems = new ArrayList();
	//    3    5:aload_0         
	//    4    6:new             #186 <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #187 <Method void ArrayList()>
	//    7   13:putfield        #189 <Field ArrayList mItems>
		mTempItem = new ItemInfo();
	//    8   16:aload_0         
	//    9   17:new             #17  <Class ViewPager$ItemInfo>
	//   10   20:dup             
	//   11   21:invokespecial   #190 <Method void ViewPager$ItemInfo()>
	//   12   24:putfield        #192 <Field ViewPager$ItemInfo mTempItem>
		mTempRect = new Rect();
	//   13   27:aload_0         
	//   14   28:new             #194 <Class Rect>
	//   15   31:dup             
	//   16   32:invokespecial   #195 <Method void Rect()>
	//   17   35:putfield        #197 <Field Rect mTempRect>
		mRestoredCurItem = -1;
	//   18   38:aload_0         
	//   19   39:iconst_m1       
	//   20   40:putfield        #199 <Field int mRestoredCurItem>
		mRestoredAdapterState = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #201 <Field Parcelable mRestoredAdapterState>
		mRestoredClassLoader = null;
	//   24   48:aload_0         
	//   25   49:aconst_null     
	//   26   50:putfield        #203 <Field ClassLoader mRestoredClassLoader>
		mFirstOffset = -3.402823E+38F;
	//   27   53:aload_0         
	//   28   54:ldc1            #204 <Float -3.402823E+38F>
	//   29   56:putfield        #206 <Field float mFirstOffset>
		mLastOffset = 3.402823E+38F;
	//   30   59:aload_0         
	//   31   60:ldc1            #207 <Float 3.402823E+38F>
	//   32   62:putfield        #209 <Field float mLastOffset>
		mOffscreenPageLimit = 1;
	//   33   65:aload_0         
	//   34   66:iconst_1        
	//   35   67:putfield        #211 <Field int mOffscreenPageLimit>
		mActivePointerId = -1;
	//   36   70:aload_0         
	//   37   71:iconst_m1       
	//   38   72:putfield        #213 <Field int mActivePointerId>
		mFirstLayout = true;
	//   39   75:aload_0         
	//   40   76:iconst_1        
	//   41   77:putfield        #215 <Field boolean mFirstLayout>
		mNeedCalculatePageOffsets = false;
	//   42   80:aload_0         
	//   43   81:iconst_0        
	//   44   82:putfield        #217 <Field boolean mNeedCalculatePageOffsets>
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
	//   49   91:invokespecial   #220 <Method void ViewPager$3(ViewPager)>
	//   50   94:putfield        #222 <Field Runnable mEndScrollRunnable>
		mScrollState = 0;
	//   51   97:aload_0         
	//   52   98:iconst_0        
	//   53   99:putfield        #224 <Field int mScrollState>
		initViewPager();
	//   54  102:aload_0         
	//   55  103:invokevirtual   #227 <Method void initViewPager()>
	//   56  106:return          
	}

	public ViewPager(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #232 <Method void ViewGroup(Context, AttributeSet)>
		mItems = new ArrayList();
	//    4    6:aload_0         
	//    5    7:new             #186 <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #187 <Method void ArrayList()>
	//    8   14:putfield        #189 <Field ArrayList mItems>
		mTempItem = new ItemInfo();
	//    9   17:aload_0         
	//   10   18:new             #17  <Class ViewPager$ItemInfo>
	//   11   21:dup             
	//   12   22:invokespecial   #190 <Method void ViewPager$ItemInfo()>
	//   13   25:putfield        #192 <Field ViewPager$ItemInfo mTempItem>
		mTempRect = new Rect();
	//   14   28:aload_0         
	//   15   29:new             #194 <Class Rect>
	//   16   32:dup             
	//   17   33:invokespecial   #195 <Method void Rect()>
	//   18   36:putfield        #197 <Field Rect mTempRect>
		mRestoredCurItem = -1;
	//   19   39:aload_0         
	//   20   40:iconst_m1       
	//   21   41:putfield        #199 <Field int mRestoredCurItem>
		mRestoredAdapterState = null;
	//   22   44:aload_0         
	//   23   45:aconst_null     
	//   24   46:putfield        #201 <Field Parcelable mRestoredAdapterState>
		mRestoredClassLoader = null;
	//   25   49:aload_0         
	//   26   50:aconst_null     
	//   27   51:putfield        #203 <Field ClassLoader mRestoredClassLoader>
		mFirstOffset = -3.402823E+38F;
	//   28   54:aload_0         
	//   29   55:ldc1            #204 <Float -3.402823E+38F>
	//   30   57:putfield        #206 <Field float mFirstOffset>
		mLastOffset = 3.402823E+38F;
	//   31   60:aload_0         
	//   32   61:ldc1            #207 <Float 3.402823E+38F>
	//   33   63:putfield        #209 <Field float mLastOffset>
		mOffscreenPageLimit = 1;
	//   34   66:aload_0         
	//   35   67:iconst_1        
	//   36   68:putfield        #211 <Field int mOffscreenPageLimit>
		mActivePointerId = -1;
	//   37   71:aload_0         
	//   38   72:iconst_m1       
	//   39   73:putfield        #213 <Field int mActivePointerId>
		mFirstLayout = true;
	//   40   76:aload_0         
	//   41   77:iconst_1        
	//   42   78:putfield        #215 <Field boolean mFirstLayout>
		mNeedCalculatePageOffsets = false;
	//   43   81:aload_0         
	//   44   82:iconst_0        
	//   45   83:putfield        #217 <Field boolean mNeedCalculatePageOffsets>
		mEndScrollRunnable = new _cls3();
	//   46   86:aload_0         
	//   47   87:new             #10  <Class ViewPager$3>
	//   48   90:dup             
	//   49   91:aload_0         
	//   50   92:invokespecial   #220 <Method void ViewPager$3(ViewPager)>
	//   51   95:putfield        #222 <Field Runnable mEndScrollRunnable>
		mScrollState = 0;
	//   52   98:aload_0         
	//   53   99:iconst_0        
	//   54  100:putfield        #224 <Field int mScrollState>
		initViewPager();
	//   55  103:aload_0         
	//   56  104:invokevirtual   #227 <Method void initViewPager()>
	//   57  107:return          
	}

	private void calculatePageOffsets(ItemInfo iteminfo, int i, ItemInfo iteminfo1)
	{
		int i2 = mAdapter.getCount();
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field PagerAdapter mAdapter>
	//    2    4:invokevirtual   #242 <Method int PagerAdapter.getCount()>
	//    3    7:istore          10
		int j = getClientWidth();
	//    4    9:aload_0         
	//    5   10:invokespecial   #245 <Method int getClientWidth()>
	//    6   13:istore          7
		float f3;
		if(j > 0)
	//*   7   15:iload           7
	//*   8   17:ifle            34
			f3 = (float)mPageMargin / (float)j;
	//    9   20:aload_0         
	//   10   21:getfield        #247 <Field int mPageMargin>
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
	//*  20   38:ifnull          409
		{
			j = iteminfo1.position;
	//   21   41:aload_3         
	//   22   42:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//   23   45:istore          7
			if(j < iteminfo.position)
	//*  24   47:iload           7
	//*  25   49:aload_1         
	//*  26   50:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//*  27   53:icmpge          236
			{
				float f = iteminfo1.offset + iteminfo1.widthFactor + f3;
	//   28   56:aload_3         
	//   29   57:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//   30   60:aload_3         
	//   31   61:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//   32   64:fadd            
	//   33   65:fload           5
	//   34   67:fadd            
	//   35   68:fstore          4
				j++;
	//   36   70:iload           7
	//   37   72:iconst_1        
	//   38   73:iadd            
	//   39   74:istore          7
				int j1;
				for(int k = 0; j <= iteminfo.position && k < mItems.size(); j = j1 + 1)
	//*  40   76:iconst_0        
	//*  41   77:istore          8
	//*  42   79:iload           7
	//*  43   81:aload_1         
	//*  44   82:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//*  45   85:icmpgt          409
	//*  46   88:iload           8
	//*  47   90:aload_0         
	//*  48   91:getfield        #189 <Field ArrayList mItems>
	//*  49   94:invokevirtual   #259 <Method int ArrayList.size()>
	//*  50   97:icmpge          409
				{
					iteminfo1 = (ItemInfo)mItems.get(k);
	//   51  100:aload_0         
	//   52  101:getfield        #189 <Field ArrayList mItems>
	//   53  104:iload           8
	//   54  106:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//   55  109:checkcast       #17  <Class ViewPager$ItemInfo>
	//   56  112:astore_3        
					float f4;
					do
					{
						j1 = j;
	//   57  113:iload           7
	//   58  115:istore          9
						f4 = f;
	//   59  117:fload           4
	//   60  119:fstore          6
						if(j <= iteminfo1.position)
							break;
	//   61  121:iload           7
	//   62  123:aload_3         
	//   63  124:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//   64  127:icmple          174
						j1 = j;
	//   65  130:iload           7
	//   66  132:istore          9
						f4 = f;
	//   67  134:fload           4
	//   68  136:fstore          6
						if(k >= mItems.size() - 1)
							break;
	//   69  138:iload           8
	//   70  140:aload_0         
	//   71  141:getfield        #189 <Field ArrayList mItems>
	//   72  144:invokevirtual   #259 <Method int ArrayList.size()>
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
	//   81  159:getfield        #189 <Field ArrayList mItems>
	//   82  162:iload           8
	//   83  164:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//   84  167:checkcast       #17  <Class ViewPager$ItemInfo>
	//   85  170:astore_3        
					} while(true);
	//   86  171:goto            113
					for(; j1 < iteminfo1.position; j1++)
	//*  87  174:iload           9
	//*  88  176:aload_3         
	//*  89  177:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//*  90  180:icmpge          209
						f4 += mAdapter.getPageWidth(j1) + f3;
	//   91  183:fload           6
	//   92  185:aload_0         
	//   93  186:getfield        #236 <Field PagerAdapter mAdapter>
	//   94  189:iload           9
	//   95  191:invokevirtual   #267 <Method float PagerAdapter.getPageWidth(int)>
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
	//  107  212:putfield        #253 <Field float ViewPager$ItemInfo.offset>
					f = f4 + (iteminfo1.widthFactor + f3);
	//  108  215:fload           6
	//  109  217:aload_3         
	//  110  218:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
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
			if(j > iteminfo.position)
	//* 120  236:iload           7
	//* 121  238:aload_1         
	//* 122  239:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//* 123  242:icmple          409
			{
				int l = mItems.size() - 1;
	//  124  245:aload_0         
	//  125  246:getfield        #189 <Field ArrayList mItems>
	//  126  249:invokevirtual   #259 <Method int ArrayList.size()>
	//  127  252:iconst_1        
	//  128  253:isub            
	//  129  254:istore          8
				float f1 = iteminfo1.offset;
	//  130  256:aload_3         
	//  131  257:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//  132  260:fstore          4
				int k1;
				for(j--; j >= iteminfo.position && l >= 0; j = k1 - 1)
	//* 133  262:iload           7
	//* 134  264:iconst_1        
	//* 135  265:isub            
	//* 136  266:istore          7
	//* 137  268:iload           7
	//* 138  270:aload_1         
	//* 139  271:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//* 140  274:icmplt          409
	//* 141  277:iload           8
	//* 142  279:iflt            409
				{
					iteminfo1 = (ItemInfo)mItems.get(l);
	//  143  282:aload_0         
	//  144  283:getfield        #189 <Field ArrayList mItems>
	//  145  286:iload           8
	//  146  288:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//  147  291:checkcast       #17  <Class ViewPager$ItemInfo>
	//  148  294:astore_3        
					float f5;
					do
					{
						k1 = j;
	//  149  295:iload           7
	//  150  297:istore          9
						f5 = f1;
	//  151  299:fload           4
	//  152  301:fstore          6
						if(j >= iteminfo1.position)
							break;
	//  153  303:iload           7
	//  154  305:aload_3         
	//  155  306:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//  156  309:icmpge          347
						k1 = j;
	//  157  312:iload           7
	//  158  314:istore          9
						f5 = f1;
	//  159  316:fload           4
	//  160  318:fstore          6
						if(l <= 0)
							break;
	//  161  320:iload           8
	//  162  322:ifle            347
						l--;
	//  163  325:iload           8
	//  164  327:iconst_1        
	//  165  328:isub            
	//  166  329:istore          8
						iteminfo1 = (ItemInfo)mItems.get(l);
	//  167  331:aload_0         
	//  168  332:getfield        #189 <Field ArrayList mItems>
	//  169  335:iload           8
	//  170  337:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//  171  340:checkcast       #17  <Class ViewPager$ItemInfo>
	//  172  343:astore_3        
					} while(true);
	//  173  344:goto            295
					for(; k1 > iteminfo1.position; k1--)
	//* 174  347:iload           9
	//* 175  349:aload_3         
	//* 176  350:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//* 177  353:icmple          382
						f5 -= mAdapter.getPageWidth(k1) + f3;
	//  178  356:fload           6
	//  179  358:aload_0         
	//  180  359:getfield        #236 <Field PagerAdapter mAdapter>
	//  181  362:iload           9
	//  182  364:invokevirtual   #267 <Method float PagerAdapter.getPageWidth(int)>
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
	//  194  385:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//  195  388:fload           5
	//  196  390:fadd            
	//  197  391:fsub            
	//  198  392:fstore          4
					iteminfo1.offset = f1;
	//  199  394:aload_3         
	//  200  395:fload           4
	//  201  397:putfield        #253 <Field float ViewPager$ItemInfo.offset>
				}

	//  202  400:iload           9
	//  203  402:iconst_1        
	//  204  403:isub            
	//  205  404:istore          7
			}
		}
	//* 206  406:goto            268
		int l1 = mItems.size();
	//  207  409:aload_0         
	//  208  410:getfield        #189 <Field ArrayList mItems>
	//  209  413:invokevirtual   #259 <Method int ArrayList.size()>
	//  210  416:istore          9
		float f6 = iteminfo.offset;
	//  211  418:aload_1         
	//  212  419:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//  213  422:fstore          6
		j = iteminfo.position - 1;
	//  214  424:aload_1         
	//  215  425:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//  216  428:iconst_1        
	//  217  429:isub            
	//  218  430:istore          7
		float f2;
		if(iteminfo.position == 0)
	//* 219  432:aload_1         
	//* 220  433:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//* 221  436:ifne            448
			f2 = iteminfo.offset;
	//  222  439:aload_1         
	//  223  440:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//  224  443:fstore          4
		else
	//* 225  445:goto            452
			f2 = -3.402823E+38F;
	//  226  448:ldc1            #204 <Float -3.402823E+38F>
	//  227  450:fstore          4
		mFirstOffset = f2;
	//  228  452:aload_0         
	//  229  453:fload           4
	//  230  455:putfield        #206 <Field float mFirstOffset>
		int i1 = iteminfo.position;
	//  231  458:aload_1         
	//  232  459:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//  233  462:istore          8
		i2--;
	//  234  464:iload           10
	//  235  466:iconst_1        
	//  236  467:isub            
	//  237  468:istore          10
		if(i1 == i2)
	//* 238  470:iload           8
	//* 239  472:iload           10
	//* 240  474:icmpne          493
			f2 = (iteminfo.offset + iteminfo.widthFactor) - 1.0F;
	//  241  477:aload_1         
	//  242  478:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//  243  481:aload_1         
	//  244  482:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//  245  485:fadd            
	//  246  486:fconst_1        
	//  247  487:fsub            
	//  248  488:fstore          4
		else
	//* 249  490:goto            497
			f2 = 3.402823E+38F;
	//  250  493:ldc1            #207 <Float 3.402823E+38F>
	//  251  495:fstore          4
		mLastOffset = f2;
	//  252  497:aload_0         
	//  253  498:fload           4
	//  254  500:putfield        #209 <Field float mLastOffset>
		i1 = i - 1;
	//  255  503:iload_2         
	//  256  504:iconst_1        
	//  257  505:isub            
	//  258  506:istore          8
		f2 = f6;
	//  259  508:fload           6
	//  260  510:fstore          4
		while(i1 >= 0) 
	//* 261  512:iload           8
	//* 262  514:iflt            611
		{
			for(iteminfo1 = (ItemInfo)mItems.get(i1); j > iteminfo1.position; j--)
	//* 263  517:aload_0         
	//* 264  518:getfield        #189 <Field ArrayList mItems>
	//* 265  521:iload           8
	//* 266  523:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//* 267  526:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 268  529:astore_3        
	//* 269  530:iload           7
	//* 270  532:aload_3         
	//* 271  533:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//* 272  536:icmple          565
				f2 -= mAdapter.getPageWidth(j) + f3;
	//  273  539:fload           4
	//  274  541:aload_0         
	//  275  542:getfield        #236 <Field PagerAdapter mAdapter>
	//  276  545:iload           7
	//  277  547:invokevirtual   #267 <Method float PagerAdapter.getPageWidth(int)>
	//  278  550:fload           5
	//  279  552:fadd            
	//  280  553:fsub            
	//  281  554:fstore          4

	//  282  556:iload           7
	//  283  558:iconst_1        
	//  284  559:isub            
	//  285  560:istore          7
	//* 286  562:goto            530
			f2 -= iteminfo1.widthFactor + f3;
	//  287  565:fload           4
	//  288  567:aload_3         
	//  289  568:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//  290  571:fload           5
	//  291  573:fadd            
	//  292  574:fsub            
	//  293  575:fstore          4
			iteminfo1.offset = f2;
	//  294  577:aload_3         
	//  295  578:fload           4
	//  296  580:putfield        #253 <Field float ViewPager$ItemInfo.offset>
			if(iteminfo1.position == 0)
	//* 297  583:aload_3         
	//* 298  584:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//* 299  587:ifne            596
				mFirstOffset = f2;
	//  300  590:aload_0         
	//  301  591:fload           4
	//  302  593:putfield        #206 <Field float mFirstOffset>
			i1--;
	//  303  596:iload           8
	//  304  598:iconst_1        
	//  305  599:isub            
	//  306  600:istore          8
			j--;
	//  307  602:iload           7
	//  308  604:iconst_1        
	//  309  605:isub            
	//  310  606:istore          7
		}
	//* 311  608:goto            512
		f2 = iteminfo.offset + iteminfo.widthFactor + f3;
	//  312  611:aload_1         
	//  313  612:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//  314  615:aload_1         
	//  315  616:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//  316  619:fadd            
	//  317  620:fload           5
	//  318  622:fadd            
	//  319  623:fstore          4
		i1 = iteminfo.position + 1;
	//  320  625:aload_1         
	//  321  626:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//  322  629:iconst_1        
	//  323  630:iadd            
	//  324  631:istore          8
		j = i + 1;
	//  325  633:iload_2         
	//  326  634:iconst_1        
	//  327  635:iadd            
	//  328  636:istore          7
		for(i = i1; j < l1; i++)
	//* 329  638:iload           8
	//* 330  640:istore_2        
	//* 331  641:iload           7
	//* 332  643:iload           9
	//* 333  645:icmpge          745
		{
			for(iteminfo = (ItemInfo)mItems.get(j); i < iteminfo.position; i++)
	//* 334  648:aload_0         
	//* 335  649:getfield        #189 <Field ArrayList mItems>
	//* 336  652:iload           7
	//* 337  654:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//* 338  657:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 339  660:astore_1        
	//* 340  661:iload_2         
	//* 341  662:aload_1         
	//* 342  663:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//* 343  666:icmpge          692
				f2 += mAdapter.getPageWidth(i) + f3;
	//  344  669:fload           4
	//  345  671:aload_0         
	//  346  672:getfield        #236 <Field PagerAdapter mAdapter>
	//  347  675:iload_2         
	//  348  676:invokevirtual   #267 <Method float PagerAdapter.getPageWidth(int)>
	//  349  679:fload           5
	//  350  681:fadd            
	//  351  682:fadd            
	//  352  683:fstore          4

	//  353  685:iload_2         
	//  354  686:iconst_1        
	//  355  687:iadd            
	//  356  688:istore_2        
	//* 357  689:goto            661
			if(iteminfo.position == i2)
	//* 358  692:aload_1         
	//* 359  693:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//* 360  696:iload           10
	//* 361  698:icmpne          714
				mLastOffset = (iteminfo.widthFactor + f2) - 1.0F;
	//  362  701:aload_0         
	//  363  702:aload_1         
	//  364  703:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//  365  706:fload           4
	//  366  708:fadd            
	//  367  709:fconst_1        
	//  368  710:fsub            
	//  369  711:putfield        #209 <Field float mLastOffset>
			iteminfo.offset = f2;
	//  370  714:aload_1         
	//  371  715:fload           4
	//  372  717:putfield        #253 <Field float ViewPager$ItemInfo.offset>
			f2 += iteminfo.widthFactor + f3;
	//  373  720:fload           4
	//  374  722:aload_1         
	//  375  723:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//  376  726:fload           5
	//  377  728:fadd            
	//  378  729:fadd            
	//  379  730:fstore          4
			j++;
	//  380  732:iload           7
	//  381  734:iconst_1        
	//  382  735:iadd            
	//  383  736:istore          7
		}

	//  384  738:iload_2         
	//  385  739:iconst_1        
	//  386  740:iadd            
	//  387  741:istore_2        
	//* 388  742:goto            641
		mNeedCalculatePageOffsets = false;
	//  389  745:aload_0         
	//  390  746:iconst_0        
	//  391  747:putfield        #217 <Field boolean mNeedCalculatePageOffsets>
	//  392  750:return          
	}

	private void completeScroll(boolean flag)
	{
		boolean flag1;
		if(mScrollState == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #224 <Field int mScrollState>
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
	//*  10   16:ifeq            106
		{
			setScrollingCacheEnabled(false);
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:invokespecial   #272 <Method void setScrollingCacheEnabled(boolean)>
			if(mScroller.isFinished() ^ true)
	//*  14   24:aload_0         
	//*  15   25:getfield        #274 <Field Scroller mScroller>
	//*  16   28:invokevirtual   #280 <Method boolean Scroller.isFinished()>
	//*  17   31:iconst_1        
	//*  18   32:ixor            
	//*  19   33:ifeq            106
			{
				mScroller.abortAnimation();
	//   20   36:aload_0         
	//   21   37:getfield        #274 <Field Scroller mScroller>
	//   22   40:invokevirtual   #283 <Method void Scroller.abortAnimation()>
				int j = getScrollX();
	//   23   43:aload_0         
	//   24   44:invokevirtual   #286 <Method int getScrollX()>
	//   25   47:istore_3        
				int k = getScrollY();
	//   26   48:aload_0         
	//   27   49:invokevirtual   #289 <Method int getScrollY()>
	//   28   52:istore          4
				int l = mScroller.getCurrX();
	//   29   54:aload_0         
	//   30   55:getfield        #274 <Field Scroller mScroller>
	//   31   58:invokevirtual   #292 <Method int Scroller.getCurrX()>
	//   32   61:istore          5
				int i1 = mScroller.getCurrY();
	//   33   63:aload_0         
	//   34   64:getfield        #274 <Field Scroller mScroller>
	//   35   67:invokevirtual   #295 <Method int Scroller.getCurrY()>
	//   36   70:istore          6
				if(j != l || k != i1)
	//*  37   72:iload_3         
	//*  38   73:iload           5
	//*  39   75:icmpne          85
	//*  40   78:iload           4
	//*  41   80:iload           6
	//*  42   82:icmpeq          106
				{
					scrollTo(l, i1);
	//   43   85:aload_0         
	//   44   86:iload           5
	//   45   88:iload           6
	//   46   90:invokevirtual   #299 <Method void scrollTo(int, int)>
					if(l != j)
	//*  47   93:iload           5
	//*  48   95:iload_3         
	//*  49   96:icmpeq          106
						pageScrolled(l);
	//   50   99:aload_0         
	//   51  100:iload           5
	//   52  102:invokespecial   #303 <Method boolean pageScrolled(int)>
	//   53  105:pop             
				}
			}
		}
		mPopulatePending = false;
	//   54  106:aload_0         
	//   55  107:iconst_0        
	//   56  108:putfield        #305 <Field boolean mPopulatePending>
		boolean flag3 = false;
	//   57  111:iconst_0        
	//   58  112:istore          4
		boolean flag2 = flag1;
	//   59  114:iload_2         
	//   60  115:istore_3        
		for(int i = ((int) (flag3)); i < mItems.size(); i++)
	//*  61  116:iload           4
	//*  62  118:istore_2        
	//*  63  119:iload_2         
	//*  64  120:aload_0         
	//*  65  121:getfield        #189 <Field ArrayList mItems>
	//*  66  124:invokevirtual   #259 <Method int ArrayList.size()>
	//*  67  127:icmpge          166
		{
			ItemInfo iteminfo = (ItemInfo)mItems.get(i);
	//   68  130:aload_0         
	//   69  131:getfield        #189 <Field ArrayList mItems>
	//   70  134:iload_2         
	//   71  135:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//   72  138:checkcast       #17  <Class ViewPager$ItemInfo>
	//   73  141:astore          7
			if(iteminfo.scrolling)
	//*  74  143:aload           7
	//*  75  145:getfield        #308 <Field boolean ViewPager$ItemInfo.scrolling>
	//*  76  148:ifeq            159
			{
				iteminfo.scrolling = false;
	//   77  151:aload           7
	//   78  153:iconst_0        
	//   79  154:putfield        #308 <Field boolean ViewPager$ItemInfo.scrolling>
				flag2 = true;
	//   80  157:iconst_1        
	//   81  158:istore_3        
			}
		}

	//   82  159:iload_2         
	//   83  160:iconst_1        
	//   84  161:iadd            
	//   85  162:istore_2        
	//*  86  163:goto            119
		if(flag2)
	//*  87  166:iload_3         
	//*  88  167:ifeq            192
		{
			if(flag)
	//*  89  170:iload_1         
	//*  90  171:ifeq            183
			{
				ViewCompat.postOnAnimation(((View) (this)), mEndScrollRunnable);
	//   91  174:aload_0         
	//   92  175:aload_0         
	//   93  176:getfield        #222 <Field Runnable mEndScrollRunnable>
	//   94  179:invokestatic    #314 <Method void ViewCompat.postOnAnimation(View, Runnable)>
				return;
	//   95  182:return          
			}
			mEndScrollRunnable.run();
	//   96  183:aload_0         
	//   97  184:getfield        #222 <Field Runnable mEndScrollRunnable>
	//   98  187:invokeinterface #319 <Method void Runnable.run()>
		}
	//   99  192:return          
	}

	private int determineTargetPage(int i, float f, int j, int k)
	{
		if(Math.abs(k) > mFlingDistance && Math.abs(j) > mMinimumVelocity)
	//*   0    0:iload           4
	//*   1    2:invokestatic    #327 <Method int Math.abs(int)>
	//*   2    5:aload_0         
	//*   3    6:getfield        #329 <Field int mFlingDistance>
	//*   4    9:icmple          37
	//*   5   12:iload_3         
	//*   6   13:invokestatic    #327 <Method int Math.abs(int)>
	//*   7   16:aload_0         
	//*   8   17:getfield        #331 <Field int mMinimumVelocity>
	//*   9   20:icmple          37
		{
			if(j <= 0)
	//*  10   23:iload_3         
	//*  11   24:ifle            30
	//*  12   27:goto            66
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
	//*  20   39:getfield        #333 <Field int mCurItem>
	//*  21   42:icmplt          53
				f1 = 0.4F;
	//   22   45:ldc2            #334 <Float 0.4F>
	//   23   48:fstore          5
			else
	//*  24   50:goto            58
				f1 = 0.6F;
	//   25   53:ldc2            #335 <Float 0.6F>
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
	//*  37   69:getfield        #189 <Field ArrayList mItems>
	//*  38   72:invokevirtual   #259 <Method int ArrayList.size()>
	//*  39   75:ifle            130
		{
			ItemInfo iteminfo = (ItemInfo)mItems.get(0);
	//   40   78:aload_0         
	//   41   79:getfield        #189 <Field ArrayList mItems>
	//   42   82:iconst_0        
	//   43   83:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//   44   86:checkcast       #17  <Class ViewPager$ItemInfo>
	//   45   89:astore          6
			ItemInfo iteminfo1 = (ItemInfo)mItems.get(mItems.size() - 1);
	//   46   91:aload_0         
	//   47   92:getfield        #189 <Field ArrayList mItems>
	//   48   95:aload_0         
	//   49   96:getfield        #189 <Field ArrayList mItems>
	//   50   99:invokevirtual   #259 <Method int ArrayList.size()>
	//   51  102:iconst_1        
	//   52  103:isub            
	//   53  104:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//   54  107:checkcast       #17  <Class ViewPager$ItemInfo>
	//   55  110:astore          7
			j = Math.max(iteminfo.position, Math.min(i, iteminfo1.position));
	//   56  112:aload           6
	//   57  114:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//   58  117:iload_1         
	//   59  118:aload           7
	//   60  120:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//   61  123:invokestatic    #339 <Method int Math.min(int, int)>
	//   62  126:invokestatic    #342 <Method int Math.max(int, int)>
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
	//*   1    1:getfield        #346 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//*   2    4:ifnull          19
			mOnPageChangeListener.onPageScrolled(i, f, j);
	//    3    7:aload_0         
	//    4    8:getfield        #346 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//    5   11:iload_1         
	//    6   12:fload_2         
	//    7   13:iload_3         
	//    8   14:invokeinterface #349 <Method void ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
		if(mOnPageChangeListeners != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #351 <Field List mOnPageChangeListeners>
	//*  11   23:ifnull          87
		{
			int k = 0;
	//   12   26:iconst_0        
	//   13   27:istore          4
			for(int l = mOnPageChangeListeners.size(); k < l; k++)
	//*  14   29:aload_0         
	//*  15   30:getfield        #351 <Field List mOnPageChangeListeners>
	//*  16   33:invokeinterface #354 <Method int List.size()>
	//*  17   38:istore          5
	//*  18   40:iload           4
	//*  19   42:iload           5
	//*  20   44:icmpge          87
			{
				OnPageChangeListener onpagechangelistener = (OnPageChangeListener)mOnPageChangeListeners.get(k);
	//   21   47:aload_0         
	//   22   48:getfield        #351 <Field List mOnPageChangeListeners>
	//   23   51:iload           4
	//   24   53:invokeinterface #355 <Method Object List.get(int)>
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
	//   33   73:invokeinterface #349 <Method void ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
			}

	//   34   78:iload           4
	//   35   80:iconst_1        
	//   36   81:iadd            
	//   37   82:istore          4
		}
	//*  38   84:goto            40
		if(mInternalPageChangeListener != null)
	//*  39   87:aload_0         
	//*  40   88:getfield        #357 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//*  41   91:ifnull          106
			mInternalPageChangeListener.onPageScrolled(i, f, j);
	//   42   94:aload_0         
	//   43   95:getfield        #357 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//   44   98:iload_1         
	//   45   99:fload_2         
	//   46  100:iload_3         
	//   47  101:invokeinterface #349 <Method void ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
	//   48  106:return          
	}

	private void dispatchOnPageSelected(int i)
	{
		if(mOnPageChangeListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #346 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//*   2    4:ifnull          17
			mOnPageChangeListener.onPageSelected(i);
	//    3    7:aload_0         
	//    4    8:getfield        #346 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//    5   11:iload_1         
	//    6   12:invokeinterface #362 <Method void ViewPager$OnPageChangeListener.onPageSelected(int)>
		if(mOnPageChangeListeners != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #351 <Field List mOnPageChangeListeners>
	//*   9   21:ifnull          76
		{
			int j = 0;
	//   10   24:iconst_0        
	//   11   25:istore_2        
			for(int k = mOnPageChangeListeners.size(); j < k; j++)
	//*  12   26:aload_0         
	//*  13   27:getfield        #351 <Field List mOnPageChangeListeners>
	//*  14   30:invokeinterface #354 <Method int List.size()>
	//*  15   35:istore_3        
	//*  16   36:iload_2         
	//*  17   37:iload_3         
	//*  18   38:icmpge          76
			{
				OnPageChangeListener onpagechangelistener = (OnPageChangeListener)mOnPageChangeListeners.get(j);
	//   19   41:aload_0         
	//   20   42:getfield        #351 <Field List mOnPageChangeListeners>
	//   21   45:iload_2         
	//   22   46:invokeinterface #355 <Method Object List.get(int)>
	//   23   51:checkcast       #29  <Class ViewPager$OnPageChangeListener>
	//   24   54:astore          4
				if(onpagechangelistener != null)
	//*  25   56:aload           4
	//*  26   58:ifnull          69
					onpagechangelistener.onPageSelected(i);
	//   27   61:aload           4
	//   28   63:iload_1         
	//   29   64:invokeinterface #362 <Method void ViewPager$OnPageChangeListener.onPageSelected(int)>
			}

	//   30   69:iload_2         
	//   31   70:iconst_1        
	//   32   71:iadd            
	//   33   72:istore_2        
		}
	//*  34   73:goto            36
		if(mInternalPageChangeListener != null)
	//*  35   76:aload_0         
	//*  36   77:getfield        #357 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//*  37   80:ifnull          93
			mInternalPageChangeListener.onPageSelected(i);
	//   38   83:aload_0         
	//   39   84:getfield        #357 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//   40   87:iload_1         
	//   41   88:invokeinterface #362 <Method void ViewPager$OnPageChangeListener.onPageSelected(int)>
	//   42   93:return          
	}

	private void dispatchOnScrollStateChanged(int i)
	{
		if(mOnPageChangeListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #346 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//*   2    4:ifnull          17
			mOnPageChangeListener.onPageScrollStateChanged(i);
	//    3    7:aload_0         
	//    4    8:getfield        #346 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//    5   11:iload_1         
	//    6   12:invokeinterface #366 <Method void ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
		if(mOnPageChangeListeners != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #351 <Field List mOnPageChangeListeners>
	//*   9   21:ifnull          76
		{
			int j = 0;
	//   10   24:iconst_0        
	//   11   25:istore_2        
			for(int k = mOnPageChangeListeners.size(); j < k; j++)
	//*  12   26:aload_0         
	//*  13   27:getfield        #351 <Field List mOnPageChangeListeners>
	//*  14   30:invokeinterface #354 <Method int List.size()>
	//*  15   35:istore_3        
	//*  16   36:iload_2         
	//*  17   37:iload_3         
	//*  18   38:icmpge          76
			{
				OnPageChangeListener onpagechangelistener = (OnPageChangeListener)mOnPageChangeListeners.get(j);
	//   19   41:aload_0         
	//   20   42:getfield        #351 <Field List mOnPageChangeListeners>
	//   21   45:iload_2         
	//   22   46:invokeinterface #355 <Method Object List.get(int)>
	//   23   51:checkcast       #29  <Class ViewPager$OnPageChangeListener>
	//   24   54:astore          4
				if(onpagechangelistener != null)
	//*  25   56:aload           4
	//*  26   58:ifnull          69
					onpagechangelistener.onPageScrollStateChanged(i);
	//   27   61:aload           4
	//   28   63:iload_1         
	//   29   64:invokeinterface #366 <Method void ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
			}

	//   30   69:iload_2         
	//   31   70:iconst_1        
	//   32   71:iadd            
	//   33   72:istore_2        
		}
	//*  34   73:goto            36
		if(mInternalPageChangeListener != null)
	//*  35   76:aload_0         
	//*  36   77:getfield        #357 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//*  37   80:ifnull          93
			mInternalPageChangeListener.onPageScrollStateChanged(i);
	//   38   83:aload_0         
	//   39   84:getfield        #357 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//   40   87:iload_1         
	//   41   88:invokeinterface #366 <Method void ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
	//   42   93:return          
	}

	private void enableLayers(boolean flag)
	{
		int k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #370 <Method int getChildCount()>
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
	//   11   19:getfield        #372 <Field int mPageTransformerLayerType>
	//   12   22:istore_3        
			else
	//*  13   23:goto            28
				j = 0;
	//   14   26:iconst_0        
	//   15   27:istore_3        
			getChildAt(i).setLayerType(j, ((android.graphics.Paint) (null)));
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #376 <Method View getChildAt(int)>
	//   19   33:iload_3         
	//   20   34:aconst_null     
	//   21   35:invokevirtual   #382 <Method void View.setLayerType(int, android.graphics.Paint)>
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
	//    2    2:putfield        #385 <Field boolean mIsBeingDragged>
		mIsUnableToDrag = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #387 <Field boolean mIsUnableToDrag>
		if(mVelocityTracker != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #389 <Field VelocityTracker mVelocityTracker>
	//*   8   14:ifnull          29
		{
			mVelocityTracker.recycle();
	//    9   17:aload_0         
	//   10   18:getfield        #389 <Field VelocityTracker mVelocityTracker>
	//   11   21:invokevirtual   #394 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:putfield        #389 <Field VelocityTracker mVelocityTracker>
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
	//    4    6:new             #194 <Class Rect>
	//    5    9:dup             
	//    6   10:invokespecial   #195 <Method void Rect()>
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
	//   15   23:invokevirtual   #400 <Method void Rect.set(int, int, int, int)>
			return rect1;
	//   16   26:aload_3         
	//   17   27:areturn         
		}
		rect1.left = view.getLeft();
	//   18   28:aload_3         
	//   19   29:aload_2         
	//   20   30:invokevirtual   #403 <Method int View.getLeft()>
	//   21   33:putfield        #406 <Field int Rect.left>
		rect1.right = view.getRight();
	//   22   36:aload_3         
	//   23   37:aload_2         
	//   24   38:invokevirtual   #409 <Method int View.getRight()>
	//   25   41:putfield        #412 <Field int Rect.right>
		rect1.top = view.getTop();
	//   26   44:aload_3         
	//   27   45:aload_2         
	//   28   46:invokevirtual   #415 <Method int View.getTop()>
	//   29   49:putfield        #418 <Field int Rect.top>
		rect1.bottom = view.getBottom();
	//   30   52:aload_3         
	//   31   53:aload_2         
	//   32   54:invokevirtual   #421 <Method int View.getBottom()>
	//   33   57:putfield        #424 <Field int Rect.bottom>
		for(rect = ((Rect) (view.getParent())); (rect instanceof ViewGroup) && rect != this; rect = ((Rect) (((ViewGroup) (rect)).getParent())))
	//*  34   60:aload_2         
	//*  35   61:invokevirtual   #428 <Method ViewParent View.getParent()>
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
	//   48   84:getfield        #406 <Field int Rect.left>
	//   49   87:aload_1         
	//   50   88:invokevirtual   #429 <Method int ViewGroup.getLeft()>
	//   51   91:iadd            
	//   52   92:putfield        #406 <Field int Rect.left>
			rect1.right = rect1.right + ((ViewGroup) (rect)).getRight();
	//   53   95:aload_3         
	//   54   96:aload_3         
	//   55   97:getfield        #412 <Field int Rect.right>
	//   56  100:aload_1         
	//   57  101:invokevirtual   #430 <Method int ViewGroup.getRight()>
	//   58  104:iadd            
	//   59  105:putfield        #412 <Field int Rect.right>
			rect1.top = rect1.top + ((ViewGroup) (rect)).getTop();
	//   60  108:aload_3         
	//   61  109:aload_3         
	//   62  110:getfield        #418 <Field int Rect.top>
	//   63  113:aload_1         
	//   64  114:invokevirtual   #431 <Method int ViewGroup.getTop()>
	//   65  117:iadd            
	//   66  118:putfield        #418 <Field int Rect.top>
			rect1.bottom = rect1.bottom + ((ViewGroup) (rect)).getBottom();
	//   67  121:aload_3         
	//   68  122:aload_3         
	//   69  123:getfield        #424 <Field int Rect.bottom>
	//   70  126:aload_1         
	//   71  127:invokevirtual   #432 <Method int ViewGroup.getBottom()>
	//   72  130:iadd            
	//   73  131:putfield        #424 <Field int Rect.bottom>
		}

	//   74  134:aload_1         
	//   75  135:invokevirtual   #433 <Method ViewParent ViewGroup.getParent()>
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
	//    1    1:invokevirtual   #436 <Method int getMeasuredWidth()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #439 <Method int getPaddingLeft()>
	//    4    8:isub            
	//    5    9:aload_0         
	//    6   10:invokevirtual   #442 <Method int getPaddingRight()>
	//    7   13:isub            
	//    8   14:ireturn         
	}

	private ItemInfo infoForCurrentScrollPosition()
	{
		int i = getClientWidth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #245 <Method int getClientWidth()>
	//    2    4:istore          5
		float f;
		if(i > 0)
	//*   3    6:iload           5
	//*   4    8:ifle            24
			f = (float)getScrollX() / (float)i;
	//    5   11:aload_0         
	//    6   12:invokevirtual   #286 <Method int getScrollX()>
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
	//   18   32:getfield        #247 <Field int mPageMargin>
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
		float f2 = 0.0F;
	//   27   46:fconst_0        
	//   28   47:fstore_3        
		float f3 = f2;
	//   29   48:fload_3         
	//   30   49:fstore          4
		i = 0;
	//   31   51:iconst_0        
	//   32   52:istore          5
		int j = -1;
	//   33   54:iconst_m1       
	//   34   55:istore          7
		ItemInfo iteminfo1 = null;
	//   35   57:aconst_null     
	//   36   58:astore          11
		boolean flag = true;
	//   37   60:iconst_1        
	//   38   61:istore          6
		while(i < mItems.size()) 
	//*  39   63:iload           5
	//*  40   65:aload_0         
	//*  41   66:getfield        #189 <Field ArrayList mItems>
	//*  42   69:invokevirtual   #259 <Method int ArrayList.size()>
	//*  43   72:icmpge          268
		{
			ItemInfo iteminfo2 = (ItemInfo)mItems.get(i);
	//   44   75:aload_0         
	//   45   76:getfield        #189 <Field ArrayList mItems>
	//   46   79:iload           5
	//   47   81:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//   48   84:checkcast       #17  <Class ViewPager$ItemInfo>
	//   49   87:astore          12
			int k = i;
	//   50   89:iload           5
	//   51   91:istore          8
			ItemInfo iteminfo = iteminfo2;
	//   52   93:aload           12
	//   53   95:astore          10
			if(!flag)
	//*  54   97:iload           6
	//*  55   99:ifne            177
			{
				int l = iteminfo2.position;
	//   56  102:aload           12
	//   57  104:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//   58  107:istore          9
				j++;
	//   59  109:iload           7
	//   60  111:iconst_1        
	//   61  112:iadd            
	//   62  113:istore          7
				k = i;
	//   63  115:iload           5
	//   64  117:istore          8
				iteminfo = iteminfo2;
	//   65  119:aload           12
	//   66  121:astore          10
				if(l != j)
	//*  67  123:iload           9
	//*  68  125:iload           7
	//*  69  127:icmpeq          177
				{
					iteminfo = mTempItem;
	//   70  130:aload_0         
	//   71  131:getfield        #192 <Field ViewPager$ItemInfo mTempItem>
	//   72  134:astore          10
					iteminfo.offset = f2 + f3 + f1;
	//   73  136:aload           10
	//   74  138:fload_3         
	//   75  139:fload           4
	//   76  141:fadd            
	//   77  142:fload_2         
	//   78  143:fadd            
	//   79  144:putfield        #253 <Field float ViewPager$ItemInfo.offset>
					iteminfo.position = j;
	//   80  147:aload           10
	//   81  149:iload           7
	//   82  151:putfield        #250 <Field int ViewPager$ItemInfo.position>
					iteminfo.widthFactor = mAdapter.getPageWidth(iteminfo.position);
	//   83  154:aload           10
	//   84  156:aload_0         
	//   85  157:getfield        #236 <Field PagerAdapter mAdapter>
	//   86  160:aload           10
	//   87  162:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//   88  165:invokevirtual   #267 <Method float PagerAdapter.getPageWidth(int)>
	//   89  168:putfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
					k = i - 1;
	//   90  171:iload           5
	//   91  173:iconst_1        
	//   92  174:isub            
	//   93  175:istore          8
				}
			}
			f2 = iteminfo.offset;
	//   94  177:aload           10
	//   95  179:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//   96  182:fstore_3        
			f3 = iteminfo.widthFactor;
	//   97  183:aload           10
	//   98  185:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//   99  188:fstore          4
			if(!flag && f < f2)
	//* 100  190:iload           6
	//* 101  192:ifne            207
	//* 102  195:fload_1         
	//* 103  196:fload_3         
	//* 104  197:fcmpl           
	//* 105  198:iflt            204
	//* 106  201:goto            207
				return iteminfo1;
	//  107  204:aload           11
	//  108  206:areturn         
			if(f >= f3 + f2 + f1)
	//* 109  207:fload_1         
	//* 110  208:fload           4
	//* 111  210:fload_3         
	//* 112  211:fadd            
	//* 113  212:fload_2         
	//* 114  213:fadd            
	//* 115  214:fcmpg           
	//* 116  215:iflt            265
			{
				if(k == mItems.size() - 1)
	//* 117  218:iload           8
	//* 118  220:aload_0         
	//* 119  221:getfield        #189 <Field ArrayList mItems>
	//* 120  224:invokevirtual   #259 <Method int ArrayList.size()>
	//* 121  227:iconst_1        
	//* 122  228:isub            
	//* 123  229:icmpne          235
					return iteminfo;
	//  124  232:aload           10
	//  125  234:areturn         
				j = iteminfo.position;
	//  126  235:aload           10
	//  127  237:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//  128  240:istore          7
				f3 = iteminfo.widthFactor;
	//  129  242:aload           10
	//  130  244:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//  131  247:fstore          4
				i = k + 1;
	//  132  249:iload           8
	//  133  251:iconst_1        
	//  134  252:iadd            
	//  135  253:istore          5
				flag = false;
	//  136  255:iconst_0        
	//  137  256:istore          6
				iteminfo1 = iteminfo;
	//  138  258:aload           10
	//  139  260:astore          11
			} else
	//* 140  262:goto            63
			{
				return iteminfo;
	//  141  265:aload           10
	//  142  267:areturn         
			}
		}
		return iteminfo1;
	//  143  268:aload           11
	//  144  270:areturn         
	}

	private static boolean isDecorView(View view)
	{
		return ((Object) (view)).getClass().getAnnotation(android/support/v4/view/ViewPager$DecorView) != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #452 <Method Class Object.getClass()>
	//    2    4:ldc1            #14  <Class ViewPager$DecorView>
	//    3    6:invokevirtual   #458 <Method Annotation Class.getAnnotation(Class)>
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
	//    2    2:getfield        #462 <Field int mGutterSize>
	//    3    5:i2f             
	//    4    6:fcmpg           
	//    5    7:ifge            16
	//    6   10:fload_2         
	//    7   11:fconst_0        
	//    8   12:fcmpl           
	//    9   13:ifgt            37
	//   10   16:fload_1         
	//   11   17:aload_0         
	//   12   18:invokevirtual   #465 <Method int getWidth()>
	//   13   21:aload_0         
	//   14   22:getfield        #462 <Field int mGutterSize>
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
	//    1    1:invokevirtual   #472 <Method int MotionEvent.getActionIndex()>
	//    2    4:istore_2        
		if(motionevent.getPointerId(i) == mActivePointerId)
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #475 <Method int MotionEvent.getPointerId(int)>
	//*   6   10:aload_0         
	//*   7   11:getfield        #213 <Field int mActivePointerId>
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
	//   19   31:invokevirtual   #478 <Method float MotionEvent.getX(int)>
	//   20   34:putfield        #480 <Field float mLastMotionX>
			mActivePointerId = motionevent.getPointerId(i);
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:iload_2         
	//   24   40:invokevirtual   #475 <Method int MotionEvent.getPointerId(int)>
	//   25   43:putfield        #213 <Field int mActivePointerId>
			if(mVelocityTracker != null)
	//*  26   46:aload_0         
	//*  27   47:getfield        #389 <Field VelocityTracker mVelocityTracker>
	//*  28   50:ifnull          60
				mVelocityTracker.clear();
	//   29   53:aload_0         
	//   30   54:getfield        #389 <Field VelocityTracker mVelocityTracker>
	//   31   57:invokevirtual   #483 <Method void VelocityTracker.clear()>
		}
	//   32   60:return          
	}

	private boolean pageScrolled(int i)
	{
		if(mItems.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field ArrayList mItems>
	//*   2    4:invokevirtual   #259 <Method int ArrayList.size()>
	//*   3    7:ifne            51
		{
			if(mFirstLayout)
	//*   4   10:aload_0         
	//*   5   11:getfield        #215 <Field boolean mFirstLayout>
	//*   6   14:ifeq            19
				return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
			mCalledSuper = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #485 <Field boolean mCalledSuper>
			onPageScrolled(0, 0.0F, 0);
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:fconst_0        
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #486 <Method void onPageScrolled(int, float, int)>
			if(!mCalledSuper)
	//*  17   31:aload_0         
	//*  18   32:getfield        #485 <Field boolean mCalledSuper>
	//*  19   35:ifne            49
				throw new IllegalStateException("onPageScrolled did not call superclass implementation");
	//   20   38:new             #488 <Class IllegalStateException>
	//   21   41:dup             
	//   22   42:ldc2            #490 <String "onPageScrolled did not call superclass implementation">
	//   23   45:invokespecial   #493 <Method void IllegalStateException(String)>
	//   24   48:athrow          
			else
				return false;
	//   25   49:iconst_0        
	//   26   50:ireturn         
		}
		ItemInfo iteminfo = infoForCurrentScrollPosition();
	//   27   51:aload_0         
	//   28   52:invokespecial   #495 <Method ViewPager$ItemInfo infoForCurrentScrollPosition()>
	//   29   55:astore          7
		int k = getClientWidth();
	//   30   57:aload_0         
	//   31   58:invokespecial   #245 <Method int getClientWidth()>
	//   32   61:istore          5
		int l = mPageMargin;
	//   33   63:aload_0         
	//   34   64:getfield        #247 <Field int mPageMargin>
	//   35   67:istore          6
		float f1 = mPageMargin;
	//   36   69:aload_0         
	//   37   70:getfield        #247 <Field int mPageMargin>
	//   38   73:i2f             
	//   39   74:fstore_3        
		float f = k;
	//   40   75:iload           5
	//   41   77:i2f             
	//   42   78:fstore_2        
		f1 /= f;
	//   43   79:fload_3         
	//   44   80:fload_2         
	//   45   81:fdiv            
	//   46   82:fstore_3        
		int j = iteminfo.position;
	//   47   83:aload           7
	//   48   85:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//   49   88:istore          4
		f = ((float)i / f - iteminfo.offset) / (iteminfo.widthFactor + f1);
	//   50   90:iload_1         
	//   51   91:i2f             
	//   52   92:fload_2         
	//   53   93:fdiv            
	//   54   94:aload           7
	//   55   96:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//   56   99:fsub            
	//   57  100:aload           7
	//   58  102:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//   59  105:fload_3         
	//   60  106:fadd            
	//   61  107:fdiv            
	//   62  108:fstore_2        
		i = (int)((float)(l + k) * f);
	//   63  109:iload           6
	//   64  111:iload           5
	//   65  113:iadd            
	//   66  114:i2f             
	//   67  115:fload_2         
	//   68  116:fmul            
	//   69  117:f2i             
	//   70  118:istore_1        
		mCalledSuper = false;
	//   71  119:aload_0         
	//   72  120:iconst_0        
	//   73  121:putfield        #485 <Field boolean mCalledSuper>
		onPageScrolled(j, f, i);
	//   74  124:aload_0         
	//   75  125:iload           4
	//   76  127:fload_2         
	//   77  128:iload_1         
	//   78  129:invokevirtual   #486 <Method void onPageScrolled(int, float, int)>
		if(!mCalledSuper)
	//*  79  132:aload_0         
	//*  80  133:getfield        #485 <Field boolean mCalledSuper>
	//*  81  136:ifne            150
			throw new IllegalStateException("onPageScrolled did not call superclass implementation");
	//   82  139:new             #488 <Class IllegalStateException>
	//   83  142:dup             
	//   84  143:ldc2            #490 <String "onPageScrolled did not call superclass implementation">
	//   85  146:invokespecial   #493 <Method void IllegalStateException(String)>
	//   86  149:athrow          
		else
			return true;
	//   87  150:iconst_1        
	//   88  151:ireturn         
	}

	private boolean performDrag(float f)
	{
		float f1 = mLastMotionX;
	//    0    0:aload_0         
	//    1    1:getfield        #480 <Field float mLastMotionX>
	//    2    4:fstore_2        
		mLastMotionX = f;
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:putfield        #480 <Field float mLastMotionX>
		float f2 = (float)getScrollX() + (f1 - f);
	//    6   10:aload_0         
	//    7   11:invokevirtual   #286 <Method int getScrollX()>
	//    8   14:i2f             
	//    9   15:fload_2         
	//   10   16:fload_1         
	//   11   17:fsub            
	//   12   18:fadd            
	//   13   19:fstore_3        
		float f3 = getClientWidth();
	//   14   20:aload_0         
	//   15   21:invokespecial   #245 <Method int getClientWidth()>
	//   16   24:i2f             
	//   17   25:fstore          4
		f = mFirstOffset * f3;
	//   18   27:aload_0         
	//   19   28:getfield        #206 <Field float mFirstOffset>
	//   20   31:fload           4
	//   21   33:fmul            
	//   22   34:fstore_1        
		f1 = mLastOffset * f3;
	//   23   35:aload_0         
	//   24   36:getfield        #209 <Field float mLastOffset>
	//   25   39:fload           4
	//   26   41:fmul            
	//   27   42:fstore_2        
		Object obj = ((Object) (mItems));
	//   28   43:aload_0         
	//   29   44:getfield        #189 <Field ArrayList mItems>
	//   30   47:astore          10
		boolean flag3 = false;
	//   31   49:iconst_0        
	//   32   50:istore          8
		boolean flag4 = false;
	//   33   52:iconst_0        
	//   34   53:istore          9
		boolean flag2 = false;
	//   35   55:iconst_0        
	//   36   56:istore          7
		obj = ((Object) ((ItemInfo)((ArrayList) (obj)).get(0)));
	//   37   58:aload           10
	//   38   60:iconst_0        
	//   39   61:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//   40   64:checkcast       #17  <Class ViewPager$ItemInfo>
	//   41   67:astore          10
		ItemInfo iteminfo = (ItemInfo)mItems.get(mItems.size() - 1);
	//   42   69:aload_0         
	//   43   70:getfield        #189 <Field ArrayList mItems>
	//   44   73:aload_0         
	//   45   74:getfield        #189 <Field ArrayList mItems>
	//   46   77:invokevirtual   #259 <Method int ArrayList.size()>
	//   47   80:iconst_1        
	//   48   81:isub            
	//   49   82:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//   50   85:checkcast       #17  <Class ViewPager$ItemInfo>
	//   51   88:astore          11
		boolean flag;
		if(((ItemInfo) (obj)).position != 0)
	//*  52   90:aload           10
	//*  53   92:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//*  54   95:ifeq            113
		{
			f = ((ItemInfo) (obj)).offset * f3;
	//   55   98:aload           10
	//   56  100:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//   57  103:fload           4
	//   58  105:fmul            
	//   59  106:fstore_1        
			flag = false;
	//   60  107:iconst_0        
	//   61  108:istore          5
		} else
	//*  62  110:goto            116
		{
			flag = true;
	//   63  113:iconst_1        
	//   64  114:istore          5
		}
		boolean flag1;
		if(iteminfo.position != mAdapter.getCount() - 1)
	//*  65  116:aload           11
	//*  66  118:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//*  67  121:aload_0         
	//*  68  122:getfield        #236 <Field PagerAdapter mAdapter>
	//*  69  125:invokevirtual   #242 <Method int PagerAdapter.getCount()>
	//*  70  128:iconst_1        
	//*  71  129:isub            
	//*  72  130:icmpeq          148
		{
			f1 = iteminfo.offset * f3;
	//   73  133:aload           11
	//   74  135:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//   75  138:fload           4
	//   76  140:fmul            
	//   77  141:fstore_2        
			flag1 = false;
	//   78  142:iconst_0        
	//   79  143:istore          6
		} else
	//*  80  145:goto            151
		{
			flag1 = true;
	//   81  148:iconst_1        
	//   82  149:istore          6
		}
		if(f2 < f)
	//*  83  151:fload_3         
	//*  84  152:fload_1         
	//*  85  153:fcmpg           
	//*  86  154:ifge            184
		{
			if(flag)
	//*  87  157:iload           5
	//*  88  159:ifeq            181
			{
				mLeftEdge.onPull(Math.abs(f - f2) / f3);
	//   89  162:aload_0         
	//   90  163:getfield        #499 <Field EdgeEffect mLeftEdge>
	//   91  166:fload_1         
	//   92  167:fload_3         
	//   93  168:fsub            
	//   94  169:invokestatic    #502 <Method float Math.abs(float)>
	//   95  172:fload           4
	//   96  174:fdiv            
	//   97  175:invokevirtual   #508 <Method void EdgeEffect.onPull(float)>
				flag2 = true;
	//   98  178:iconst_1        
	//   99  179:istore          7
			}
		} else
	//* 100  181:goto            226
		{
			flag2 = flag4;
	//  101  184:iload           9
	//  102  186:istore          7
			f = f2;
	//  103  188:fload_3         
	//  104  189:fstore_1        
			if(f2 > f1)
	//* 105  190:fload_3         
	//* 106  191:fload_2         
	//* 107  192:fcmpl           
	//* 108  193:ifle            226
			{
				flag2 = flag3;
	//  109  196:iload           8
	//  110  198:istore          7
				if(flag1)
	//* 111  200:iload           6
	//* 112  202:ifeq            224
				{
					mRightEdge.onPull(Math.abs(f2 - f1) / f3);
	//  113  205:aload_0         
	//  114  206:getfield        #510 <Field EdgeEffect mRightEdge>
	//  115  209:fload_3         
	//  116  210:fload_2         
	//  117  211:fsub            
	//  118  212:invokestatic    #502 <Method float Math.abs(float)>
	//  119  215:fload           4
	//  120  217:fdiv            
	//  121  218:invokevirtual   #508 <Method void EdgeEffect.onPull(float)>
					flag2 = true;
	//  122  221:iconst_1        
	//  123  222:istore          7
				}
				f = f1;
	//  124  224:fload_2         
	//  125  225:fstore_1        
			}
		}
		f1 = mLastMotionX;
	//  126  226:aload_0         
	//  127  227:getfield        #480 <Field float mLastMotionX>
	//  128  230:fstore_2        
		int i = (int)f;
	//  129  231:fload_1         
	//  130  232:f2i             
	//  131  233:istore          5
		mLastMotionX = f1 + (f - (float)i);
	//  132  235:aload_0         
	//  133  236:fload_2         
	//  134  237:fload_1         
	//  135  238:iload           5
	//  136  240:i2f             
	//  137  241:fsub            
	//  138  242:fadd            
	//  139  243:putfield        #480 <Field float mLastMotionX>
		scrollTo(i, getScrollY());
	//  140  246:aload_0         
	//  141  247:iload           5
	//  142  249:aload_0         
	//  143  250:invokevirtual   #289 <Method int getScrollY()>
	//  144  253:invokevirtual   #299 <Method void scrollTo(int, int)>
		pageScrolled(i);
	//  145  256:aload_0         
	//  146  257:iload           5
	//  147  259:invokespecial   #303 <Method boolean pageScrolled(int)>
	//  148  262:pop             
		return flag2;
	//  149  263:iload           7
	//  150  265:ireturn         
	}

	private void recomputeScrollPosition(int i, int j, int k, int l)
	{
		if(j > 0 && !mItems.isEmpty())
	//*   0    0:iload_2         
	//*   1    1:ifle            103
	//*   2    4:aload_0         
	//*   3    5:getfield        #189 <Field ArrayList mItems>
	//*   4    8:invokevirtual   #514 <Method boolean ArrayList.isEmpty()>
	//*   5   11:ifne            103
			if(!mScroller.isFinished())
	//*   6   14:aload_0         
	//*   7   15:getfield        #274 <Field Scroller mScroller>
	//*   8   18:invokevirtual   #280 <Method boolean Scroller.isFinished()>
	//*   9   21:ifne            41
			{
				mScroller.setFinalX(getCurrentItem() * getClientWidth());
	//   10   24:aload_0         
	//   11   25:getfield        #274 <Field Scroller mScroller>
	//   12   28:aload_0         
	//   13   29:invokevirtual   #517 <Method int getCurrentItem()>
	//   14   32:aload_0         
	//   15   33:invokespecial   #245 <Method int getClientWidth()>
	//   16   36:imul            
	//   17   37:invokevirtual   #520 <Method void Scroller.setFinalX(int)>
				return;
	//   18   40:return          
			} else
			{
				int i1 = getPaddingLeft();
	//   19   41:aload_0         
	//   20   42:invokevirtual   #439 <Method int getPaddingLeft()>
	//   21   45:istore          6
				int j1 = getPaddingRight();
	//   22   47:aload_0         
	//   23   48:invokevirtual   #442 <Method int getPaddingRight()>
	//   24   51:istore          7
				int k1 = getPaddingLeft();
	//   25   53:aload_0         
	//   26   54:invokevirtual   #439 <Method int getPaddingLeft()>
	//   27   57:istore          8
				int l1 = getPaddingRight();
	//   28   59:aload_0         
	//   29   60:invokevirtual   #442 <Method int getPaddingRight()>
	//   30   63:istore          9
				scrollTo((int)(((float)getScrollX() / (float)((j - k1 - l1) + l)) * (float)((i - i1 - j1) + k)), getScrollY());
	//   31   65:aload_0         
	//   32   66:aload_0         
	//   33   67:invokevirtual   #286 <Method int getScrollX()>
	//   34   70:i2f             
	//   35   71:iload_2         
	//   36   72:iload           8
	//   37   74:isub            
	//   38   75:iload           9
	//   39   77:isub            
	//   40   78:iload           4
	//   41   80:iadd            
	//   42   81:i2f             
	//   43   82:fdiv            
	//   44   83:iload_1         
	//   45   84:iload           6
	//   46   86:isub            
	//   47   87:iload           7
	//   48   89:isub            
	//   49   90:iload_3         
	//   50   91:iadd            
	//   51   92:i2f             
	//   52   93:fmul            
	//   53   94:f2i             
	//   54   95:aload_0         
	//   55   96:invokevirtual   #289 <Method int getScrollY()>
	//   56   99:invokevirtual   #299 <Method void scrollTo(int, int)>
				return;
	//   57  102:return          
			}
		ItemInfo iteminfo = infoForPosition(mCurItem);
	//   58  103:aload_0         
	//   59  104:aload_0         
	//   60  105:getfield        #333 <Field int mCurItem>
	//   61  108:invokevirtual   #524 <Method ViewPager$ItemInfo infoForPosition(int)>
	//   62  111:astore          10
		float f;
		if(iteminfo != null)
	//*  63  113:aload           10
	//*  64  115:ifnull          135
			f = Math.min(iteminfo.offset, mLastOffset);
	//   65  118:aload           10
	//   66  120:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//   67  123:aload_0         
	//   68  124:getfield        #209 <Field float mLastOffset>
	//   69  127:invokestatic    #527 <Method float Math.min(float, float)>
	//   70  130:fstore          5
		else
	//*  71  132:goto            138
			f = 0.0F;
	//   72  135:fconst_0        
	//   73  136:fstore          5
		i = (int)(f * (float)(i - getPaddingLeft() - getPaddingRight()));
	//   74  138:fload           5
	//   75  140:iload_1         
	//   76  141:aload_0         
	//   77  142:invokevirtual   #439 <Method int getPaddingLeft()>
	//   78  145:isub            
	//   79  146:aload_0         
	//   80  147:invokevirtual   #442 <Method int getPaddingRight()>
	//   81  150:isub            
	//   82  151:i2f             
	//   83  152:fmul            
	//   84  153:f2i             
	//   85  154:istore_1        
		if(i != getScrollX())
	//*  86  155:iload_1         
	//*  87  156:aload_0         
	//*  88  157:invokevirtual   #286 <Method int getScrollX()>
	//*  89  160:icmpeq          177
		{
			completeScroll(false);
	//   90  163:aload_0         
	//   91  164:iconst_0        
	//   92  165:invokespecial   #529 <Method void completeScroll(boolean)>
			scrollTo(i, getScrollY());
	//   93  168:aload_0         
	//   94  169:iload_1         
	//   95  170:aload_0         
	//   96  171:invokevirtual   #289 <Method int getScrollY()>
	//   97  174:invokevirtual   #299 <Method void scrollTo(int, int)>
		}
	//   98  177:return          
	}

	private void removeNonDecorViews()
	{
		int j;
		for(int i = 0; i < getChildCount(); i = j + 1)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #370 <Method int getChildCount()>
	//*   5    7:icmpge          45
		{
			j = i;
	//    6   10:iload_1         
	//    7   11:istore_2        
			if(!((LayoutParams)getChildAt(i).getLayoutParams()).isDecor)
	//*   8   12:aload_0         
	//*   9   13:iload_1         
	//*  10   14:invokevirtual   #376 <Method View getChildAt(int)>
	//*  11   17:invokevirtual   #534 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  12   20:checkcast       #20  <Class ViewPager$LayoutParams>
	//*  13   23:getfield        #537 <Field boolean ViewPager$LayoutParams.isDecor>
	//*  14   26:ifne            38
			{
				removeViewAt(i);
	//   15   29:aload_0         
	//   16   30:iload_1         
	//   17   31:invokevirtual   #540 <Method void removeViewAt(int)>
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
	//    1    1:invokevirtual   #542 <Method ViewParent getParent()>
	//    2    4:astore_2        
		if(viewparent != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			viewparent.requestDisallowInterceptTouchEvent(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokeinterface #547 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//    8   16:return          
	}

	private boolean resetTouch()
	{
		mActivePointerId = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #213 <Field int mActivePointerId>
		endDrag();
	//    3    5:aload_0         
	//    4    6:invokespecial   #550 <Method void endDrag()>
		mLeftEdge.onRelease();
	//    5    9:aload_0         
	//    6   10:getfield        #499 <Field EdgeEffect mLeftEdge>
	//    7   13:invokevirtual   #553 <Method void EdgeEffect.onRelease()>
		mRightEdge.onRelease();
	//    8   16:aload_0         
	//    9   17:getfield        #510 <Field EdgeEffect mRightEdge>
	//   10   20:invokevirtual   #553 <Method void EdgeEffect.onRelease()>
		return mLeftEdge.isFinished() || mRightEdge.isFinished();
	//   11   23:aload_0         
	//   12   24:getfield        #499 <Field EdgeEffect mLeftEdge>
	//   13   27:invokevirtual   #554 <Method boolean EdgeEffect.isFinished()>
	//   14   30:ifne            48
	//   15   33:aload_0         
	//   16   34:getfield        #510 <Field EdgeEffect mRightEdge>
	//   17   37:invokevirtual   #554 <Method boolean EdgeEffect.isFinished()>
	//   18   40:ifeq            46
	//   19   43:goto            48
	//   20   46:iconst_0        
	//   21   47:ireturn         
	//   22   48:iconst_1        
	//   23   49:ireturn         
	}

	private void scrollToItem(int i, boolean flag, int j, boolean flag1)
	{
		ItemInfo iteminfo = infoForPosition(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #524 <Method ViewPager$ItemInfo infoForPosition(int)>
	//    3    5:astore          6
		int k;
		if(iteminfo != null)
	//*   4    7:aload           6
	//*   5    9:ifnull          43
			k = (int)((float)getClientWidth() * Math.max(mFirstOffset, Math.min(iteminfo.offset, mLastOffset)));
	//    6   12:aload_0         
	//    7   13:invokespecial   #245 <Method int getClientWidth()>
	//    8   16:i2f             
	//    9   17:aload_0         
	//   10   18:getfield        #206 <Field float mFirstOffset>
	//   11   21:aload           6
	//   12   23:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//   13   26:aload_0         
	//   14   27:getfield        #209 <Field float mLastOffset>
	//   15   30:invokestatic    #527 <Method float Math.min(float, float)>
	//   16   33:invokestatic    #558 <Method float Math.max(float, float)>
	//   17   36:fmul            
	//   18   37:f2i             
	//   19   38:istore          5
		else
	//*  20   40:goto            46
			k = 0;
	//   21   43:iconst_0        
	//   22   44:istore          5
		if(flag)
	//*  23   46:iload_2         
	//*  24   47:ifeq            69
		{
			smoothScrollTo(k, 0, j);
	//   25   50:aload_0         
	//   26   51:iload           5
	//   27   53:iconst_0        
	//   28   54:iload_3         
	//   29   55:invokevirtual   #562 <Method void smoothScrollTo(int, int, int)>
			if(flag1)
	//*  30   58:iload           4
	//*  31   60:ifeq            98
			{
				dispatchOnPageSelected(i);
	//   32   63:aload_0         
	//   33   64:iload_1         
	//   34   65:invokespecial   #564 <Method void dispatchOnPageSelected(int)>
				return;
	//   35   68:return          
			}
		} else
		{
			if(flag1)
	//*  36   69:iload           4
	//*  37   71:ifeq            79
				dispatchOnPageSelected(i);
	//   38   74:aload_0         
	//   39   75:iload_1         
	//   40   76:invokespecial   #564 <Method void dispatchOnPageSelected(int)>
			completeScroll(false);
	//   41   79:aload_0         
	//   42   80:iconst_0        
	//   43   81:invokespecial   #529 <Method void completeScroll(boolean)>
			scrollTo(k, 0);
	//   44   84:aload_0         
	//   45   85:iload           5
	//   46   87:iconst_0        
	//   47   88:invokevirtual   #299 <Method void scrollTo(int, int)>
			pageScrolled(k);
	//   48   91:aload_0         
	//   49   92:iload           5
	//   50   94:invokespecial   #303 <Method boolean pageScrolled(int)>
	//   51   97:pop             
		}
	//   52   98:return          
	}

	private void setScrollingCacheEnabled(boolean flag)
	{
		if(mScrollingCacheEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #566 <Field boolean mScrollingCacheEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          13
			mScrollingCacheEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #566 <Field boolean mScrollingCacheEnabled>
	//    7   13:return          
	}

	private void sortChildDrawingOrder()
	{
		if(mDrawingOrder != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #569 <Field int mDrawingOrder>
	//*   2    4:ifeq            79
		{
			if(mDrawingOrderedChildren == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #571 <Field ArrayList mDrawingOrderedChildren>
	//*   5   11:ifnonnull       28
				mDrawingOrderedChildren = new ArrayList();
	//    6   14:aload_0         
	//    7   15:new             #186 <Class ArrayList>
	//    8   18:dup             
	//    9   19:invokespecial   #187 <Method void ArrayList()>
	//   10   22:putfield        #571 <Field ArrayList mDrawingOrderedChildren>
			else
	//*  11   25:goto            35
				mDrawingOrderedChildren.clear();
	//   12   28:aload_0         
	//   13   29:getfield        #571 <Field ArrayList mDrawingOrderedChildren>
	//   14   32:invokevirtual   #572 <Method void ArrayList.clear()>
			int j = getChildCount();
	//   15   35:aload_0         
	//   16   36:invokevirtual   #370 <Method int getChildCount()>
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
	//   25   49:invokevirtual   #376 <Method View getChildAt(int)>
	//   26   52:astore_3        
				mDrawingOrderedChildren.add(((Object) (view)));
	//   27   53:aload_0         
	//   28   54:getfield        #571 <Field ArrayList mDrawingOrderedChildren>
	//   29   57:aload_3         
	//   30   58:invokevirtual   #576 <Method boolean ArrayList.add(Object)>
	//   31   61:pop             
			}

	//   32   62:iload_1         
	//   33   63:iconst_1        
	//   34   64:iadd            
	//   35   65:istore_1        
	//*  36   66:goto            42
			Collections.sort(((List) (mDrawingOrderedChildren)), ((Comparator) (sPositionComparator)));
	//   37   69:aload_0         
	//   38   70:getfield        #571 <Field ArrayList mDrawingOrderedChildren>
	//   39   73:getstatic       #179 <Field ViewPager$ViewPositionComparator sPositionComparator>
	//   40   76:invokestatic    #582 <Method void Collections.sort(List, Comparator)>
		}
	//   41   79:return          
	}

	public void addFocusables(ArrayList arraylist, int i, int j)
	{
		int l = arraylist.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #259 <Method int ArrayList.size()>
	//    2    4:istore          5
		int i1 = getDescendantFocusability();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #587 <Method int getDescendantFocusability()>
	//    5   10:istore          6
		if(i1 != 0x60000)
	//*   6   12:iload           6
	//*   7   14:ldc2            #588 <Int 0x60000>
	//*   8   17:icmpeq          90
		{
			for(int k = 0; k < getChildCount(); k++)
	//*   9   20:iconst_0        
	//*  10   21:istore          4
	//*  11   23:iload           4
	//*  12   25:aload_0         
	//*  13   26:invokevirtual   #370 <Method int getChildCount()>
	//*  14   29:icmpge          90
			{
				View view = getChildAt(k);
	//   15   32:aload_0         
	//   16   33:iload           4
	//   17   35:invokevirtual   #376 <Method View getChildAt(int)>
	//   18   38:astore          7
				if(view.getVisibility() != 0)
					continue;
	//   19   40:aload           7
	//   20   42:invokevirtual   #591 <Method int View.getVisibility()>
	//   21   45:ifne            81
				ItemInfo iteminfo = infoForChild(view);
	//   22   48:aload_0         
	//   23   49:aload           7
	//   24   51:invokevirtual   #595 <Method ViewPager$ItemInfo infoForChild(View)>
	//   25   54:astore          8
				if(iteminfo != null && iteminfo.position == mCurItem)
	//*  26   56:aload           8
	//*  27   58:ifnull          81
	//*  28   61:aload           8
	//*  29   63:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//*  30   66:aload_0         
	//*  31   67:getfield        #333 <Field int mCurItem>
	//*  32   70:icmpne          81
					view.addFocusables(arraylist, i, j);
	//   33   73:aload           7
	//   34   75:aload_1         
	//   35   76:iload_2         
	//   36   77:iload_3         
	//   37   78:invokevirtual   #597 <Method void View.addFocusables(ArrayList, int, int)>
			}

	//   38   81:iload           4
	//   39   83:iconst_1        
	//   40   84:iadd            
	//   41   85:istore          4
		}
	//*  42   87:goto            23
		if(i1 != 0x40000 || l == arraylist.size())
	//*  43   90:iload           6
	//*  44   92:ldc2            #598 <Int 0x40000>
	//*  45   95:icmpne          107
	//*  46   98:iload           5
	//*  47  100:aload_1         
	//*  48  101:invokevirtual   #259 <Method int ArrayList.size()>
	//*  49  104:icmpne          147
		{
			if(!isFocusable())
	//*  50  107:aload_0         
	//*  51  108:invokevirtual   #601 <Method boolean isFocusable()>
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
	//*  60  123:invokevirtual   #604 <Method boolean isInTouchMode()>
	//*  61  126:ifeq            137
	//*  62  129:aload_0         
	//*  63  130:invokevirtual   #607 <Method boolean isFocusableInTouchMode()>
	//*  64  133:ifne            137
				return;
	//   65  136:return          
			if(arraylist != null)
	//*  66  137:aload_1         
	//*  67  138:ifnull          147
				arraylist.add(((Object) (this)));
	//   68  141:aload_1         
	//   69  142:aload_0         
	//   70  143:invokevirtual   #576 <Method boolean ArrayList.add(Object)>
	//   71  146:pop             
		}
	//   72  147:return          
	}

	ItemInfo addNewItem(int i, int j)
	{
		ItemInfo iteminfo = new ItemInfo();
	//    0    0:new             #17  <Class ViewPager$ItemInfo>
	//    1    3:dup             
	//    2    4:invokespecial   #190 <Method void ViewPager$ItemInfo()>
	//    3    7:astore_3        
		iteminfo.position = i;
	//    4    8:aload_3         
	//    5    9:iload_1         
	//    6   10:putfield        #250 <Field int ViewPager$ItemInfo.position>
		iteminfo.object = mAdapter.instantiateItem(((ViewGroup) (this)), i);
	//    7   13:aload_3         
	//    8   14:aload_0         
	//    9   15:getfield        #236 <Field PagerAdapter mAdapter>
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokevirtual   #615 <Method Object PagerAdapter.instantiateItem(ViewGroup, int)>
	//   13   23:putfield        #619 <Field Object ViewPager$ItemInfo.object>
		iteminfo.widthFactor = mAdapter.getPageWidth(i);
	//   14   26:aload_3         
	//   15   27:aload_0         
	//   16   28:getfield        #236 <Field PagerAdapter mAdapter>
	//   17   31:iload_1         
	//   18   32:invokevirtual   #267 <Method float PagerAdapter.getPageWidth(int)>
	//   19   35:putfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
		if(j >= 0 && j < mItems.size())
	//*  20   38:iload_2         
	//*  21   39:iflt            67
	//*  22   42:iload_2         
	//*  23   43:aload_0         
	//*  24   44:getfield        #189 <Field ArrayList mItems>
	//*  25   47:invokevirtual   #259 <Method int ArrayList.size()>
	//*  26   50:icmplt          56
	//*  27   53:goto            67
		{
			mItems.add(j, ((Object) (iteminfo)));
	//   28   56:aload_0         
	//   29   57:getfield        #189 <Field ArrayList mItems>
	//   30   60:iload_2         
	//   31   61:aload_3         
	//   32   62:invokevirtual   #622 <Method void ArrayList.add(int, Object)>
			return iteminfo;
	//   33   65:aload_3         
	//   34   66:areturn         
		} else
		{
			mItems.add(((Object) (iteminfo)));
	//   35   67:aload_0         
	//   36   68:getfield        #189 <Field ArrayList mItems>
	//   37   71:aload_3         
	//   38   72:invokevirtual   #576 <Method boolean ArrayList.add(Object)>
	//   39   75:pop             
			return iteminfo;
	//   40   76:aload_3         
	//   41   77:areturn         
		}
	}

	public void addOnAdapterChangeListener(OnAdapterChangeListener onadapterchangelistener)
	{
		if(mAdapterChangeListeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #626 <Field List mAdapterChangeListeners>
	//*   2    4:ifnonnull       18
			mAdapterChangeListeners = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #186 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #187 <Method void ArrayList()>
	//    7   15:putfield        #626 <Field List mAdapterChangeListeners>
		mAdapterChangeListeners.add(((Object) (onadapterchangelistener)));
	//    8   18:aload_0         
	//    9   19:getfield        #626 <Field List mAdapterChangeListeners>
	//   10   22:aload_1         
	//   11   23:invokeinterface #627 <Method boolean List.add(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	public void addOnPageChangeListener(OnPageChangeListener onpagechangelistener)
	{
		if(mOnPageChangeListeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #351 <Field List mOnPageChangeListeners>
	//*   2    4:ifnonnull       18
			mOnPageChangeListeners = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #186 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #187 <Method void ArrayList()>
	//    7   15:putfield        #351 <Field List mOnPageChangeListeners>
		mOnPageChangeListeners.add(((Object) (onpagechangelistener)));
	//    8   18:aload_0         
	//    9   19:getfield        #351 <Field List mOnPageChangeListeners>
	//   10   22:aload_1         
	//   11   23:invokeinterface #627 <Method boolean List.add(Object)>
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
	//*   4    4:invokevirtual   #370 <Method int getChildCount()>
	//*   5    7:icmpge          59
		{
			View view = getChildAt(i);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #376 <Method View getChildAt(int)>
	//    9   15:astore_3        
			if(view.getVisibility() != 0)
				continue;
	//   10   16:aload_3         
	//   11   17:invokevirtual   #591 <Method int View.getVisibility()>
	//   12   20:ifne            52
			ItemInfo iteminfo = infoForChild(view);
	//   13   23:aload_0         
	//   14   24:aload_3         
	//   15   25:invokevirtual   #595 <Method ViewPager$ItemInfo infoForChild(View)>
	//   16   28:astore          4
			if(iteminfo != null && iteminfo.position == mCurItem)
	//*  17   30:aload           4
	//*  18   32:ifnull          52
	//*  19   35:aload           4
	//*  20   37:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//*  21   40:aload_0         
	//*  22   41:getfield        #333 <Field int mCurItem>
	//*  23   44:icmpne          52
				view.addTouchables(arraylist);
	//   24   47:aload_3         
	//   25   48:aload_1         
	//   26   49:invokevirtual   #633 <Method void View.addTouchables(ArrayList)>
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
	//*   4    5:invokevirtual   #640 <Method boolean checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*   5    8:ifne            18
			layoutparams1 = generateLayoutParams(layoutparams);
	//    6   11:aload_0         
	//    7   12:aload_3         
	//    8   13:invokevirtual   #644 <Method android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    9   16:astore          4
		layoutparams = ((android.view.ViewGroup.LayoutParams) ((LayoutParams)layoutparams1));
	//   10   18:aload           4
	//   11   20:checkcast       #20  <Class ViewPager$LayoutParams>
	//   12   23:astore_3        
		layoutparams.isDecor = ((LayoutParams) (layoutparams)).isDecor | isDecorView(view);
	//   13   24:aload_3         
	//   14   25:aload_3         
	//   15   26:getfield        #537 <Field boolean ViewPager$LayoutParams.isDecor>
	//   16   29:aload_1         
	//   17   30:invokestatic    #646 <Method boolean isDecorView(View)>
	//   18   33:ior             
	//   19   34:putfield        #537 <Field boolean ViewPager$LayoutParams.isDecor>
		if(mInLayout)
	//*  20   37:aload_0         
	//*  21   38:getfield        #648 <Field boolean mInLayout>
	//*  22   41:ifeq            81
		{
			if(layoutparams != null && ((LayoutParams) (layoutparams)).isDecor)
	//*  23   44:aload_3         
	//*  24   45:ifnull          66
	//*  25   48:aload_3         
	//*  26   49:getfield        #537 <Field boolean ViewPager$LayoutParams.isDecor>
	//*  27   52:ifeq            66
			{
				throw new IllegalStateException("Cannot add pager decor view during layout");
	//   28   55:new             #488 <Class IllegalStateException>
	//   29   58:dup             
	//   30   59:ldc2            #650 <String "Cannot add pager decor view during layout">
	//   31   62:invokespecial   #493 <Method void IllegalStateException(String)>
	//   32   65:athrow          
			} else
			{
				layoutparams.needsMeasure = true;
	//   33   66:aload_3         
	//   34   67:iconst_1        
	//   35   68:putfield        #653 <Field boolean ViewPager$LayoutParams.needsMeasure>
				addViewInLayout(view, i, layoutparams1);
	//   36   71:aload_0         
	//   37   72:aload_1         
	//   38   73:iload_2         
	//   39   74:aload           4
	//   40   76:invokevirtual   #657 <Method boolean addViewInLayout(View, int, android.view.ViewGroup$LayoutParams)>
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
	//   47   86:invokespecial   #659 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   48   89:return          
		}
	}

	public boolean arrowScroll(int i)
	{
		boolean flag1;
		Object obj;
label0:
		{
			View view1;
label1:
			{
				boolean flag;
				Object obj1;
label2:
				{
					view1 = findFocus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #664 <Method View findFocus()>
	//    2    4:astore          7
					flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          4
					obj1 = null;
	//    5    9:aconst_null     
	//    6   10:astore          6
					if(view1 == this)
	//*   7   12:aload           7
	//*   8   14:aload_0         
	//*   9   15:if_acmpne       25
					{
						obj = ((Object) (obj1));
	//   10   18:aload           6
	//   11   20:astore          5
						break label0;
	//   12   22:goto            198
					}
					if(view1 == null)
						break label1;
	//   13   25:aload           7
	//   14   27:ifnull          194
					obj = ((Object) (view1.getParent()));
	//   15   30:aload           7
	//   16   32:invokevirtual   #428 <Method ViewParent View.getParent()>
	//   17   35:astore          5
					do
					{
						if(!(obj instanceof ViewGroup))
							break;
	//   18   37:aload           5
	//   19   39:instanceof      #4   <Class ViewGroup>
	//   20   42:ifeq            68
						if(obj == this)
	//*  21   45:aload           5
	//*  22   47:aload_0         
	//*  23   48:if_acmpne       56
						{
							flag = true;
	//   24   51:iconst_1        
	//   25   52:istore_2        
							break label2;
	//   26   53:goto            70
						}
						obj = ((Object) (((ViewParent) (obj)).getParent()));
	//   27   56:aload           5
	//   28   58:invokeinterface #665 <Method ViewParent ViewParent.getParent()>
	//   29   63:astore          5
					} while(true);
	//   30   65:goto            37
					flag = false;
	//   31   68:iconst_0        
	//   32   69:istore_2        
				}
				if(!flag)
	//*  33   70:iload_2         
	//*  34   71:ifne            194
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   35   74:new             #667 <Class StringBuilder>
	//   36   77:dup             
	//   37   78:invokespecial   #668 <Method void StringBuilder()>
	//   38   81:astore          8
					stringbuilder.append(((Object) (view1)).getClass().getSimpleName());
	//   39   83:aload           8
	//   40   85:aload           7
	//   41   87:invokevirtual   #452 <Method Class Object.getClass()>
	//   42   90:invokevirtual   #672 <Method String Class.getSimpleName()>
	//   43   93:invokevirtual   #676 <Method StringBuilder StringBuilder.append(String)>
	//   44   96:pop             
					for(obj = ((Object) (view1.getParent())); obj instanceof ViewGroup; obj = ((Object) (((ViewParent) (obj)).getParent())))
	//*  45   97:aload           7
	//*  46   99:invokevirtual   #428 <Method ViewParent View.getParent()>
	//*  47  102:astore          5
	//*  48  104:aload           5
	//*  49  106:instanceof      #4   <Class ViewGroup>
	//*  50  109:ifeq            147
					{
						stringbuilder.append(" => ");
	//   51  112:aload           8
	//   52  114:ldc2            #678 <String " => ">
	//   53  117:invokevirtual   #676 <Method StringBuilder StringBuilder.append(String)>
	//   54  120:pop             
						stringbuilder.append(obj.getClass().getSimpleName());
	//   55  121:aload           8
	//   56  123:aload           5
	//   57  125:invokevirtual   #452 <Method Class Object.getClass()>
	//   58  128:invokevirtual   #672 <Method String Class.getSimpleName()>
	//   59  131:invokevirtual   #676 <Method StringBuilder StringBuilder.append(String)>
	//   60  134:pop             
					}

	//   61  135:aload           5
	//   62  137:invokeinterface #665 <Method ViewParent ViewParent.getParent()>
	//   63  142:astore          5
	//*  64  144:goto            104
					obj = ((Object) (new StringBuilder()));
	//   65  147:new             #667 <Class StringBuilder>
	//   66  150:dup             
	//   67  151:invokespecial   #668 <Method void StringBuilder()>
	//   68  154:astore          5
					((StringBuilder) (obj)).append("arrowScroll tried to find focus based on non-child current focused view ");
	//   69  156:aload           5
	//   70  158:ldc2            #680 <String "arrowScroll tried to find focus based on non-child current focused view ">
	//   71  161:invokevirtual   #676 <Method StringBuilder StringBuilder.append(String)>
	//   72  164:pop             
					((StringBuilder) (obj)).append(stringbuilder.toString());
	//   73  165:aload           5
	//   74  167:aload           8
	//   75  169:invokevirtual   #683 <Method String StringBuilder.toString()>
	//   76  172:invokevirtual   #676 <Method StringBuilder StringBuilder.append(String)>
	//   77  175:pop             
					Log.e("ViewPager", ((StringBuilder) (obj)).toString());
	//   78  176:ldc1            #80  <String "ViewPager">
	//   79  178:aload           5
	//   80  180:invokevirtual   #683 <Method String StringBuilder.toString()>
	//   81  183:invokestatic    #689 <Method int Log.e(String, String)>
	//   82  186:pop             
					obj = ((Object) (obj1));
	//   83  187:aload           6
	//   84  189:astore          5
					break label0;
	//   85  191:goto            198
				}
			}
			obj = ((Object) (view1));
	//   86  194:aload           7
	//   87  196:astore          5
		}
		View view = FocusFinder.getInstance().findNextFocus(((ViewGroup) (this)), ((View) (obj)), i);
	//   88  198:invokestatic    #695 <Method FocusFinder FocusFinder.getInstance()>
	//   89  201:aload_0         
	//   90  202:aload           5
	//   91  204:iload_1         
	//   92  205:invokevirtual   #699 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   93  208:astore          6
		if(view != null && view != obj)
	//*  94  210:aload           6
	//*  95  212:ifnull          348
	//*  96  215:aload           6
	//*  97  217:aload           5
	//*  98  219:if_acmpeq       348
		{
			if(i == 17)
	//*  99  222:iload_1         
	//* 100  223:bipush          17
	//* 101  225:icmpne          285
			{
				int j = getChildRectInPagerCoordinates(mTempRect, view).left;
	//  102  228:aload_0         
	//  103  229:aload_0         
	//  104  230:getfield        #197 <Field Rect mTempRect>
	//  105  233:aload           6
	//  106  235:invokespecial   #701 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//  107  238:getfield        #406 <Field int Rect.left>
	//  108  241:istore_2        
				int l = getChildRectInPagerCoordinates(mTempRect, ((View) (obj))).left;
	//  109  242:aload_0         
	//  110  243:aload_0         
	//  111  244:getfield        #197 <Field Rect mTempRect>
	//  112  247:aload           5
	//  113  249:invokespecial   #701 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//  114  252:getfield        #406 <Field int Rect.left>
	//  115  255:istore_3        
				if(obj != null && j >= l)
	//* 116  256:aload           5
	//* 117  258:ifnull          275
	//* 118  261:iload_2         
	//* 119  262:iload_3         
	//* 120  263:icmplt          275
					flag1 = pageLeft();
	//  121  266:aload_0         
	//  122  267:invokevirtual   #704 <Method boolean pageLeft()>
	//  123  270:istore          4
				else
	//* 124  272:goto            282
					flag1 = view.requestFocus();
	//  125  275:aload           6
	//  126  277:invokevirtual   #707 <Method boolean View.requestFocus()>
	//  127  280:istore          4
			} else
	//* 128  282:goto            388
			if(i == 66)
	//* 129  285:iload_1         
	//* 130  286:bipush          66
	//* 131  288:icmpne          388
			{
				int k = getChildRectInPagerCoordinates(mTempRect, view).left;
	//  132  291:aload_0         
	//  133  292:aload_0         
	//  134  293:getfield        #197 <Field Rect mTempRect>
	//  135  296:aload           6
	//  136  298:invokespecial   #701 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//  137  301:getfield        #406 <Field int Rect.left>
	//  138  304:istore_2        
				int i1 = getChildRectInPagerCoordinates(mTempRect, ((View) (obj))).left;
	//  139  305:aload_0         
	//  140  306:aload_0         
	//  141  307:getfield        #197 <Field Rect mTempRect>
	//  142  310:aload           5
	//  143  312:invokespecial   #701 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//  144  315:getfield        #406 <Field int Rect.left>
	//  145  318:istore_3        
				if(obj != null && k <= i1)
	//* 146  319:aload           5
	//* 147  321:ifnull          338
	//* 148  324:iload_2         
	//* 149  325:iload_3         
	//* 150  326:icmpgt          338
					flag1 = pageRight();
	//  151  329:aload_0         
	//  152  330:invokevirtual   #710 <Method boolean pageRight()>
	//  153  333:istore          4
				else
	//* 154  335:goto            282
					flag1 = view.requestFocus();
	//  155  338:aload           6
	//  156  340:invokevirtual   #707 <Method boolean View.requestFocus()>
	//  157  343:istore          4
			}
		} else
	//* 158  345:goto            282
		if(i != 17 && i != 1)
	//* 159  348:iload_1         
	//* 160  349:bipush          17
	//* 161  351:icmpeq          382
	//* 162  354:iload_1         
	//* 163  355:iconst_1        
	//* 164  356:icmpne          362
	//* 165  359:goto            382
		{
			if(i == 66 || i == 2)
	//* 166  362:iload_1         
	//* 167  363:bipush          66
	//* 168  365:icmpeq          373
	//* 169  368:iload_1         
	//* 170  369:iconst_2        
	//* 171  370:icmpne          388
				flag1 = pageRight();
	//  172  373:aload_0         
	//  173  374:invokevirtual   #710 <Method boolean pageRight()>
	//  174  377:istore          4
		} else
	//* 175  379:goto            388
		{
			flag1 = pageLeft();
	//  176  382:aload_0         
	//  177  383:invokevirtual   #704 <Method boolean pageLeft()>
	//  178  386:istore          4
		}
		if(flag1)
	//* 179  388:iload           4
	//* 180  390:ifeq            401
			playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
	//  181  393:aload_0         
	//  182  394:iload_1         
	//  183  395:invokestatic    #715 <Method int SoundEffectConstants.getContantForFocusDirection(int)>
	//  184  398:invokevirtual   #718 <Method void playSoundEffect(int)>
		return flag1;
	//  185  401:iload           4
	//  186  403:ireturn         
	}

	public boolean beginFakeDrag()
	{
		if(mIsBeingDragged)
	//*   0    0:aload_0         
	//*   1    1:getfield        #385 <Field boolean mIsBeingDragged>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		mFakeDragging = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #721 <Field boolean mFakeDragging>
		setScrollState(1);
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:invokevirtual   #724 <Method void setScrollState(int)>
		mLastMotionX = 0.0F;
	//   11   19:aload_0         
	//   12   20:fconst_0        
	//   13   21:putfield        #480 <Field float mLastMotionX>
		mInitialMotionX = 0.0F;
	//   14   24:aload_0         
	//   15   25:fconst_0        
	//   16   26:putfield        #726 <Field float mInitialMotionX>
		if(mVelocityTracker == null)
	//*  17   29:aload_0         
	//*  18   30:getfield        #389 <Field VelocityTracker mVelocityTracker>
	//*  19   33:ifnonnull       46
			mVelocityTracker = VelocityTracker.obtain();
	//   20   36:aload_0         
	//   21   37:invokestatic    #730 <Method VelocityTracker VelocityTracker.obtain()>
	//   22   40:putfield        #389 <Field VelocityTracker mVelocityTracker>
		else
	//*  23   43:goto            53
			mVelocityTracker.clear();
	//   24   46:aload_0         
	//   25   47:getfield        #389 <Field VelocityTracker mVelocityTracker>
	//   26   50:invokevirtual   #483 <Method void VelocityTracker.clear()>
		long l = SystemClock.uptimeMillis();
	//   27   53:invokestatic    #736 <Method long SystemClock.uptimeMillis()>
	//   28   56:lstore_1        
		MotionEvent motionevent = MotionEvent.obtain(l, l, 0, 0.0F, 0.0F, 0);
	//   29   57:lload_1         
	//   30   58:lload_1         
	//   31   59:iconst_0        
	//   32   60:fconst_0        
	//   33   61:fconst_0        
	//   34   62:iconst_0        
	//   35   63:invokestatic    #739 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   36   66:astore_3        
		mVelocityTracker.addMovement(motionevent);
	//   37   67:aload_0         
	//   38   68:getfield        #389 <Field VelocityTracker mVelocityTracker>
	//   39   71:aload_3         
	//   40   72:invokevirtual   #742 <Method void VelocityTracker.addMovement(MotionEvent)>
		motionevent.recycle();
	//   41   75:aload_3         
	//   42   76:invokevirtual   #743 <Method void MotionEvent.recycle()>
		mFakeDragBeginTime = l;
	//   43   79:aload_0         
	//   44   80:lload_1         
	//   45   81:putfield        #745 <Field long mFakeDragBeginTime>
		return true;
	//   46   84:iconst_1        
	//   47   85:ireturn         
	}

	protected boolean canScroll(View view, boolean flag, int i, int j, int k)
	{
		if(view instanceof ViewGroup)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #4   <Class ViewGroup>
	//*   2    4:ifeq            140
		{
			ViewGroup viewgroup = (ViewGroup)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #4   <Class ViewGroup>
	//    5   11:astore          11
			int i1 = view.getScrollX();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #748 <Method int View.getScrollX()>
	//    8   17:istore          7
			int j1 = view.getScrollY();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #749 <Method int View.getScrollY()>
	//   11   23:istore          8
			for(int l = viewgroup.getChildCount() - 1; l >= 0; l--)
	//*  12   25:aload           11
	//*  13   27:invokevirtual   #750 <Method int ViewGroup.getChildCount()>
	//*  14   30:iconst_1        
	//*  15   31:isub            
	//*  16   32:istore          6
	//*  17   34:iload           6
	//*  18   36:iflt            140
			{
				View view1 = viewgroup.getChildAt(l);
	//   19   39:aload           11
	//   20   41:iload           6
	//   21   43:invokevirtual   #751 <Method View ViewGroup.getChildAt(int)>
	//   22   46:astore          12
				int k1 = j + i1;
	//   23   48:iload           4
	//   24   50:iload           7
	//   25   52:iadd            
	//   26   53:istore          9
				if(k1 < view1.getLeft() || k1 >= view1.getRight())
					continue;
	//   27   55:iload           9
	//   28   57:aload           12
	//   29   59:invokevirtual   #403 <Method int View.getLeft()>
	//   30   62:icmplt          131
	//   31   65:iload           9
	//   32   67:aload           12
	//   33   69:invokevirtual   #409 <Method int View.getRight()>
	//   34   72:icmpge          131
				int l1 = k + j1;
	//   35   75:iload           5
	//   36   77:iload           8
	//   37   79:iadd            
	//   38   80:istore          10
				if(l1 >= view1.getTop() && l1 < view1.getBottom() && canScroll(view1, true, i, k1 - view1.getLeft(), l1 - view1.getTop()))
	//*  39   82:iload           10
	//*  40   84:aload           12
	//*  41   86:invokevirtual   #415 <Method int View.getTop()>
	//*  42   89:icmplt          131
	//*  43   92:iload           10
	//*  44   94:aload           12
	//*  45   96:invokevirtual   #421 <Method int View.getBottom()>
	//*  46   99:icmpge          131
	//*  47  102:aload_0         
	//*  48  103:aload           12
	//*  49  105:iconst_1        
	//*  50  106:iload_3         
	//*  51  107:iload           9
	//*  52  109:aload           12
	//*  53  111:invokevirtual   #403 <Method int View.getLeft()>
	//*  54  114:isub            
	//*  55  115:iload           10
	//*  56  117:aload           12
	//*  57  119:invokevirtual   #415 <Method int View.getTop()>
	//*  58  122:isub            
	//*  59  123:invokevirtual   #753 <Method boolean canScroll(View, boolean, int, int, int)>
	//*  60  126:ifeq            131
					return true;
	//   61  129:iconst_1        
	//   62  130:ireturn         
			}

	//   63  131:iload           6
	//   64  133:iconst_1        
	//   65  134:isub            
	//   66  135:istore          6
		}
	//*  67  137:goto            34
		return flag && view.canScrollHorizontally(-i);
	//   68  140:iload_2         
	//   69  141:ifeq            155
	//   70  144:aload_1         
	//   71  145:iload_3         
	//   72  146:ineg            
	//   73  147:invokevirtual   #756 <Method boolean View.canScrollHorizontally(int)>
	//   74  150:ifeq            155
	//   75  153:iconst_1        
	//   76  154:ireturn         
	//   77  155:iconst_0        
	//   78  156:ireturn         
	}

	public boolean canScrollHorizontally(int i)
	{
		PagerAdapter pageradapter = mAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field PagerAdapter mAdapter>
	//    2    4:astore          6
		boolean flag2 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		boolean flag = false;
	//    5    9:iconst_0        
	//    6   10:istore          4
		if(pageradapter == null)
	//*   7   12:aload           6
	//*   8   14:ifnonnull       19
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		int j = getClientWidth();
	//   11   19:aload_0         
	//   12   20:invokespecial   #245 <Method int getClientWidth()>
	//   13   23:istore_2        
		int k = getScrollX();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #286 <Method int getScrollX()>
	//   16   28:istore_3        
		if(i < 0)
	//*  17   29:iload_1         
	//*  18   30:ifge            51
		{
			if(k > (int)((float)j * mFirstOffset))
	//*  19   33:iload_3         
	//*  20   34:iload_2         
	//*  21   35:i2f             
	//*  22   36:aload_0         
	//*  23   37:getfield        #206 <Field float mFirstOffset>
	//*  24   40:fmul            
	//*  25   41:f2i             
	//*  26   42:icmple          48
				flag = true;
	//   27   45:iconst_1        
	//   28   46:istore          4
			return flag;
	//   29   48:iload           4
	//   30   50:ireturn         
		}
		if(i > 0)
	//*  31   51:iload_1         
	//*  32   52:ifle            77
		{
			boolean flag1 = flag2;
	//   33   55:iload           5
	//   34   57:istore          4
			if(k < (int)((float)j * mLastOffset))
	//*  35   59:iload_3         
	//*  36   60:iload_2         
	//*  37   61:i2f             
	//*  38   62:aload_0         
	//*  39   63:getfield        #209 <Field float mLastOffset>
	//*  40   66:fmul            
	//*  41   67:f2i             
	//*  42   68:icmpge          74
				flag1 = true;
	//   43   71:iconst_1        
	//   44   72:istore          4
			return flag1;
	//   45   74:iload           4
	//   46   76:ireturn         
		} else
		{
			return false;
	//   47   77:iconst_0        
	//   48   78:ireturn         
		}
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #20  <Class ViewPager$LayoutParams>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #757 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
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
	//*   1    1:getfield        #351 <Field List mOnPageChangeListeners>
	//*   2    4:ifnull          16
			mOnPageChangeListeners.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #351 <Field List mOnPageChangeListeners>
	//    5   11:invokeinterface #759 <Method void List.clear()>
	//    6   16:return          
	}

	public void computeScroll()
	{
		mIsScrollStarted = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #762 <Field boolean mIsScrollStarted>
		if(!mScroller.isFinished() && mScroller.computeScrollOffset())
	//*   3    5:aload_0         
	//*   4    6:getfield        #274 <Field Scroller mScroller>
	//*   5    9:invokevirtual   #280 <Method boolean Scroller.isFinished()>
	//*   6   12:ifne            97
	//*   7   15:aload_0         
	//*   8   16:getfield        #274 <Field Scroller mScroller>
	//*   9   19:invokevirtual   #765 <Method boolean Scroller.computeScrollOffset()>
	//*  10   22:ifeq            97
		{
			int i = getScrollX();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #286 <Method int getScrollX()>
	//   13   29:istore_1        
			int j = getScrollY();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #289 <Method int getScrollY()>
	//   16   34:istore_2        
			int k = mScroller.getCurrX();
	//   17   35:aload_0         
	//   18   36:getfield        #274 <Field Scroller mScroller>
	//   19   39:invokevirtual   #292 <Method int Scroller.getCurrX()>
	//   20   42:istore_3        
			int l = mScroller.getCurrY();
	//   21   43:aload_0         
	//   22   44:getfield        #274 <Field Scroller mScroller>
	//   23   47:invokevirtual   #295 <Method int Scroller.getCurrY()>
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
	//   34   67:invokevirtual   #299 <Method void scrollTo(int, int)>
				if(!pageScrolled(k))
	//*  35   70:aload_0         
	//*  36   71:iload_3         
	//*  37   72:invokespecial   #303 <Method boolean pageScrolled(int)>
	//*  38   75:ifne            92
				{
					mScroller.abortAnimation();
	//   39   78:aload_0         
	//   40   79:getfield        #274 <Field Scroller mScroller>
	//   41   82:invokevirtual   #283 <Method void Scroller.abortAnimation()>
					scrollTo(0, l);
	//   42   85:aload_0         
	//   43   86:iconst_0        
	//   44   87:iload           4
	//   45   89:invokevirtual   #299 <Method void scrollTo(int, int)>
				}
			}
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   46   92:aload_0         
	//   47   93:invokestatic    #769 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			return;
	//   48   96:return          
		} else
		{
			completeScroll(true);
	//   49   97:aload_0         
	//   50   98:iconst_1        
	//   51   99:invokespecial   #529 <Method void completeScroll(boolean)>
			return;
	//   52  102:return          
		}
	}

	void dataSetChanged()
	{
		int i;
		int j;
		int l;
		boolean flag;
		int j2;
		j2 = mAdapter.getCount();
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field PagerAdapter mAdapter>
	//    2    4:invokevirtual   #242 <Method int PagerAdapter.getCount()>
	//    3    7:istore          9
		mExpectedAdapterCount = j2;
	//    4    9:aload_0         
	//    5   10:iload           9
	//    6   12:putfield        #772 <Field int mExpectedAdapterCount>
		if(mItems.size() < mOffscreenPageLimit * 2 + 1 && mItems.size() < j2)
	//*   7   15:aload_0         
	//*   8   16:getfield        #189 <Field ArrayList mItems>
	//*   9   19:invokevirtual   #259 <Method int ArrayList.size()>
	//*  10   22:aload_0         
	//*  11   23:getfield        #211 <Field int mOffscreenPageLimit>
	//*  12   26:iconst_2        
	//*  13   27:imul            
	//*  14   28:iconst_1        
	//*  15   29:iadd            
	//*  16   30:icmpge          50
	//*  17   33:aload_0         
	//*  18   34:getfield        #189 <Field ArrayList mItems>
	//*  19   37:invokevirtual   #259 <Method int ArrayList.size()>
	//*  20   40:iload           9
	//*  21   42:icmpge          50
			i = 1;
	//   22   45:iconst_1        
	//   23   46:istore_1        
		else
	//*  24   47:goto            52
			i = 0;
	//   25   50:iconst_0        
	//   26   51:istore_1        
		j = mCurItem;
	//   27   52:aload_0         
	//   28   53:getfield        #333 <Field int mCurItem>
	//   29   56:istore_2        
		flag = ((boolean) (i));
	//   30   57:iload_1         
	//   31   58:istore          6
		i = j;
	//   32   60:iload_2         
	//   33   61:istore_1        
		l = 0;
	//   34   62:iconst_0        
	//   35   63:istore_3        
		j = l;
	//   36   64:iload_3         
	//   37   65:istore_2        
_L9:
		if(l >= mItems.size()) goto _L2; else goto _L1
	//   38   66:iload_3         
	//   39   67:aload_0         
	//   40   68:getfield        #189 <Field ArrayList mItems>
	//   41   71:invokevirtual   #259 <Method int ArrayList.size()>
	//   42   74:icmpge          292
_L1:
		int i2;
		ItemInfo iteminfo;
		iteminfo = (ItemInfo)mItems.get(l);
	//   43   77:aload_0         
	//   44   78:getfield        #189 <Field ArrayList mItems>
	//   45   81:iload_3         
	//   46   82:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//   47   85:checkcast       #17  <Class ViewPager$ItemInfo>
	//   48   88:astore          10
		i2 = mAdapter.getItemPosition(iteminfo.object);
	//   49   90:aload_0         
	//   50   91:getfield        #236 <Field PagerAdapter mAdapter>
	//   51   94:aload           10
	//   52   96:getfield        #619 <Field Object ViewPager$ItemInfo.object>
	//   53   99:invokevirtual   #776 <Method int PagerAdapter.getItemPosition(Object)>
	//   54  102:istore          8
		if(i2 != -1) goto _L4; else goto _L3
	//   55  104:iload           8
	//   56  106:iconst_m1       
	//   57  107:icmpne          122
_L3:
		int j1;
		int k1;
		int l1;
		j1 = l;
	//   58  110:iload_3         
	//   59  111:istore          4
		k1 = j;
	//   60  113:iload_2         
	//   61  114:istore          5
		l1 = i;
	//   62  116:iload_1         
	//   63  117:istore          7
		  goto _L5
	//*  64  119:goto            278
_L4:
		if(i2 != -2) goto _L7; else goto _L6
	//   65  122:iload           8
	//   66  124:bipush          -2
	//   67  126:icmpne          234
_L6:
		mItems.remove(l);
	//   68  129:aload_0         
	//   69  130:getfield        #189 <Field ArrayList mItems>
	//   70  133:iload_3         
	//   71  134:invokevirtual   #779 <Method Object ArrayList.remove(int)>
	//   72  137:pop             
		k1 = l - 1;
	//   73  138:iload_3         
	//   74  139:iconst_1        
	//   75  140:isub            
	//   76  141:istore          5
		j1 = j;
	//   77  143:iload_2         
	//   78  144:istore          4
		if(j == 0)
	//*  79  146:iload_2         
	//*  80  147:ifne            161
		{
			mAdapter.startUpdate(((ViewGroup) (this)));
	//   81  150:aload_0         
	//   82  151:getfield        #236 <Field PagerAdapter mAdapter>
	//   83  154:aload_0         
	//   84  155:invokevirtual   #783 <Method void PagerAdapter.startUpdate(ViewGroup)>
			j1 = 1;
	//   85  158:iconst_1        
	//   86  159:istore          4
		}
		mAdapter.destroyItem(((ViewGroup) (this)), iteminfo.position, iteminfo.object);
	//   87  161:aload_0         
	//   88  162:getfield        #236 <Field PagerAdapter mAdapter>
	//   89  165:aload_0         
	//   90  166:aload           10
	//   91  168:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//   92  171:aload           10
	//   93  173:getfield        #619 <Field Object ViewPager$ItemInfo.object>
	//   94  176:invokevirtual   #787 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
		l = k1;
	//   95  179:iload           5
	//   96  181:istore_3        
		j = j1;
	//   97  182:iload           4
	//   98  184:istore_2        
		if(mCurItem == iteminfo.position)
	//*  99  185:aload_0         
	//* 100  186:getfield        #333 <Field int mCurItem>
	//* 101  189:aload           10
	//* 102  191:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//* 103  194:icmpne          219
		{
			i = Math.max(0, Math.min(mCurItem, j2 - 1));
	//  104  197:iconst_0        
	//  105  198:aload_0         
	//  106  199:getfield        #333 <Field int mCurItem>
	//  107  202:iload           9
	//  108  204:iconst_1        
	//  109  205:isub            
	//  110  206:invokestatic    #339 <Method int Math.min(int, int)>
	//  111  209:invokestatic    #342 <Method int Math.max(int, int)>
	//  112  212:istore_1        
			j = j1;
	//  113  213:iload           4
	//  114  215:istore_2        
			l = k1;
	//  115  216:iload           5
	//  116  218:istore_3        
		}
_L8:
		flag = true;
	//  117  219:iconst_1        
	//  118  220:istore          6
		j1 = l;
	//  119  222:iload_3         
	//  120  223:istore          4
		k1 = j;
	//  121  225:iload_2         
	//  122  226:istore          5
		l1 = i;
	//  123  228:iload_1         
	//  124  229:istore          7
		break; /* Loop/switch isn't completed */
	//  125  231:goto            278
_L7:
		j1 = l;
	//  126  234:iload_3         
	//  127  235:istore          4
		k1 = j;
	//  128  237:iload_2         
	//  129  238:istore          5
		l1 = i;
	//  130  240:iload_1         
	//  131  241:istore          7
		if(iteminfo.position == i2)
			break; /* Loop/switch isn't completed */
	//  132  243:aload           10
	//  133  245:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//  134  248:iload           8
	//  135  250:icmpeq          278
		if(iteminfo.position == mCurItem)
	//* 136  253:aload           10
	//* 137  255:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//* 138  258:aload_0         
	//* 139  259:getfield        #333 <Field int mCurItem>
	//* 140  262:icmpne          268
			i = i2;
	//  141  265:iload           8
	//  142  267:istore_1        
		iteminfo.position = i2;
	//  143  268:aload           10
	//  144  270:iload           8
	//  145  272:putfield        #250 <Field int ViewPager$ItemInfo.position>
		if(true) goto _L8; else goto _L5
	//  146  275:goto            219
_L5:
		l = j1 + 1;
	//  147  278:iload           4
	//  148  280:iconst_1        
	//  149  281:iadd            
	//  150  282:istore_3        
		j = k1;
	//  151  283:iload           5
	//  152  285:istore_2        
		i = l1;
	//  153  286:iload           7
	//  154  288:istore_1        
		  goto _L9
	//* 155  289:goto            66
_L2:
		if(j != 0)
	//* 156  292:iload_2         
	//* 157  293:ifeq            304
			mAdapter.finishUpdate(((ViewGroup) (this)));
	//  158  296:aload_0         
	//  159  297:getfield        #236 <Field PagerAdapter mAdapter>
	//  160  300:aload_0         
	//  161  301:invokevirtual   #790 <Method void PagerAdapter.finishUpdate(ViewGroup)>
		Collections.sort(((List) (mItems)), COMPARATOR);
	//  162  304:aload_0         
	//  163  305:getfield        #189 <Field ArrayList mItems>
	//  164  308:getstatic       #173 <Field Comparator COMPARATOR>
	//  165  311:invokestatic    #582 <Method void Collections.sort(List, Comparator)>
		if(flag)
	//* 166  314:iload           6
	//* 167  316:ifeq            376
		{
			int i1 = getChildCount();
	//  168  319:aload_0         
	//  169  320:invokevirtual   #370 <Method int getChildCount()>
	//  170  323:istore_3        
			for(int k = 0; k < i1; k++)
	//* 171  324:iconst_0        
	//* 172  325:istore_2        
	//* 173  326:iload_2         
	//* 174  327:iload_3         
	//* 175  328:icmpge          365
			{
				LayoutParams layoutparams = (LayoutParams)getChildAt(k).getLayoutParams();
	//  176  331:aload_0         
	//  177  332:iload_2         
	//  178  333:invokevirtual   #376 <Method View getChildAt(int)>
	//  179  336:invokevirtual   #534 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  180  339:checkcast       #20  <Class ViewPager$LayoutParams>
	//  181  342:astore          10
				if(!layoutparams.isDecor)
	//* 182  344:aload           10
	//* 183  346:getfield        #537 <Field boolean ViewPager$LayoutParams.isDecor>
	//* 184  349:ifne            358
					layoutparams.widthFactor = 0.0F;
	//  185  352:aload           10
	//  186  354:fconst_0        
	//  187  355:putfield        #791 <Field float ViewPager$LayoutParams.widthFactor>
			}

	//  188  358:iload_2         
	//  189  359:iconst_1        
	//  190  360:iadd            
	//  191  361:istore_2        
	//* 192  362:goto            326
			setCurrentItemInternal(i, false, true);
	//  193  365:aload_0         
	//  194  366:iload_1         
	//  195  367:iconst_0        
	//  196  368:iconst_1        
	//  197  369:invokevirtual   #795 <Method void setCurrentItemInternal(int, boolean, boolean)>
			requestLayout();
	//  198  372:aload_0         
	//  199  373:invokevirtual   #798 <Method void requestLayout()>
		}
		return;
	//  200  376:return          
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		return super.dispatchKeyEvent(keyevent) || executeKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #802 <Method boolean ViewGroup.dispatchKeyEvent(KeyEvent)>
	//    3    5:ifne            21
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #805 <Method boolean executeKeyEvent(KeyEvent)>
	//    7   13:ifeq            19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		if(accessibilityevent.getEventType() == 4096)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #812 <Method int AccessibilityEvent.getEventType()>
	//*   2    4:sipush          4096
	//*   3    7:icmpne          16
			return super.dispatchPopulateAccessibilityEvent(accessibilityevent);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokespecial   #814 <Method boolean ViewGroup.dispatchPopulateAccessibilityEvent(AccessibilityEvent)>
	//    7   15:ireturn         
		int j = getChildCount();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #370 <Method int getChildCount()>
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
	//   18   30:invokevirtual   #376 <Method View getChildAt(int)>
	//   19   33:astore          4
			if(view.getVisibility() != 0)
				continue;
	//   20   35:aload           4
	//   21   37:invokevirtual   #591 <Method int View.getVisibility()>
	//   22   40:ifne            79
			ItemInfo iteminfo = infoForChild(view);
	//   23   43:aload_0         
	//   24   44:aload           4
	//   25   46:invokevirtual   #595 <Method ViewPager$ItemInfo infoForChild(View)>
	//   26   49:astore          5
			if(iteminfo != null && iteminfo.position == mCurItem && view.dispatchPopulateAccessibilityEvent(accessibilityevent))
	//*  27   51:aload           5
	//*  28   53:ifnull          79
	//*  29   56:aload           5
	//*  30   58:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//*  31   61:aload_0         
	//*  32   62:getfield        #333 <Field int mCurItem>
	//*  33   65:icmpne          79
	//*  34   68:aload           4
	//*  35   70:aload_1         
	//*  36   71:invokevirtual   #815 <Method boolean View.dispatchPopulateAccessibilityEvent(AccessibilityEvent)>
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
	//    1    1:ldc2            #817 <Float 0.5F>
	//    2    4:fsub            
	//    3    5:ldc2            #818 <Float 0.4712389F>
	//    4    8:fmul            
	//    5    9:f2d             
	//    6   10:invokestatic    #822 <Method double Math.sin(double)>
	//    7   13:d2f             
	//    8   14:freturn         
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #826 <Method void ViewGroup.draw(Canvas)>
		int k = getOverScrollMode();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #829 <Method int getOverScrollMode()>
	//    5    9:istore          4
		int j = 0;
	//    6   11:iconst_0        
	//    7   12:istore_3        
		int i = 0;
	//    8   13:iconst_0        
	//    9   14:istore_2        
		if(k != 0 && (k != 1 || mAdapter == null || mAdapter.getCount() <= 1))
	//*  10   15:iload           4
	//*  11   17:ifeq            64
	//*  12   20:iload           4
	//*  13   22:iconst_1        
	//*  14   23:icmpne          47
	//*  15   26:aload_0         
	//*  16   27:getfield        #236 <Field PagerAdapter mAdapter>
	//*  17   30:ifnull          47
	//*  18   33:aload_0         
	//*  19   34:getfield        #236 <Field PagerAdapter mAdapter>
	//*  20   37:invokevirtual   #242 <Method int PagerAdapter.getCount()>
	//*  21   40:iconst_1        
	//*  22   41:icmple          47
	//*  23   44:goto            64
		{
			mLeftEdge.finish();
	//   24   47:aload_0         
	//   25   48:getfield        #499 <Field EdgeEffect mLeftEdge>
	//   26   51:invokevirtual   #832 <Method void EdgeEffect.finish()>
			mRightEdge.finish();
	//   27   54:aload_0         
	//   28   55:getfield        #510 <Field EdgeEffect mRightEdge>
	//   29   58:invokevirtual   #832 <Method void EdgeEffect.finish()>
		} else
	//*  30   61:goto            254
		{
			if(!mLeftEdge.isFinished())
	//*  31   64:aload_0         
	//*  32   65:getfield        #499 <Field EdgeEffect mLeftEdge>
	//*  33   68:invokevirtual   #554 <Method boolean EdgeEffect.isFinished()>
	//*  34   71:ifne            153
			{
				j = canvas.save();
	//   35   74:aload_1         
	//   36   75:invokevirtual   #837 <Method int Canvas.save()>
	//   37   78:istore_3        
				i = getHeight() - getPaddingTop() - getPaddingBottom();
	//   38   79:aload_0         
	//   39   80:invokevirtual   #840 <Method int getHeight()>
	//   40   83:aload_0         
	//   41   84:invokevirtual   #843 <Method int getPaddingTop()>
	//   42   87:isub            
	//   43   88:aload_0         
	//   44   89:invokevirtual   #846 <Method int getPaddingBottom()>
	//   45   92:isub            
	//   46   93:istore_2        
				int l = getWidth();
	//   47   94:aload_0         
	//   48   95:invokevirtual   #465 <Method int getWidth()>
	//   49   98:istore          4
				canvas.rotate(270F);
	//   50  100:aload_1         
	//   51  101:ldc2            #847 <Float 270F>
	//   52  104:invokevirtual   #850 <Method void Canvas.rotate(float)>
				canvas.translate(-i + getPaddingTop(), mFirstOffset * (float)l);
	//   53  107:aload_1         
	//   54  108:iload_2         
	//   55  109:ineg            
	//   56  110:aload_0         
	//   57  111:invokevirtual   #843 <Method int getPaddingTop()>
	//   58  114:iadd            
	//   59  115:i2f             
	//   60  116:aload_0         
	//   61  117:getfield        #206 <Field float mFirstOffset>
	//   62  120:iload           4
	//   63  122:i2f             
	//   64  123:fmul            
	//   65  124:invokevirtual   #854 <Method void Canvas.translate(float, float)>
				mLeftEdge.setSize(i, l);
	//   66  127:aload_0         
	//   67  128:getfield        #499 <Field EdgeEffect mLeftEdge>
	//   68  131:iload_2         
	//   69  132:iload           4
	//   70  134:invokevirtual   #857 <Method void EdgeEffect.setSize(int, int)>
				i = ((int) (false | mLeftEdge.draw(canvas)));
	//   71  137:iconst_0        
	//   72  138:aload_0         
	//   73  139:getfield        #499 <Field EdgeEffect mLeftEdge>
	//   74  142:aload_1         
	//   75  143:invokevirtual   #860 <Method boolean EdgeEffect.draw(Canvas)>
	//   76  146:ior             
	//   77  147:istore_2        
				canvas.restoreToCount(j);
	//   78  148:aload_1         
	//   79  149:iload_3         
	//   80  150:invokevirtual   #863 <Method void Canvas.restoreToCount(int)>
			}
			j = i;
	//   81  153:iload_2         
	//   82  154:istore_3        
			if(!mRightEdge.isFinished())
	//*  83  155:aload_0         
	//*  84  156:getfield        #510 <Field EdgeEffect mRightEdge>
	//*  85  159:invokevirtual   #554 <Method boolean EdgeEffect.isFinished()>
	//*  86  162:ifne            254
			{
				int i1 = canvas.save();
	//   87  165:aload_1         
	//   88  166:invokevirtual   #837 <Method int Canvas.save()>
	//   89  169:istore          4
				j = getWidth();
	//   90  171:aload_0         
	//   91  172:invokevirtual   #465 <Method int getWidth()>
	//   92  175:istore_3        
				int j1 = getHeight();
	//   93  176:aload_0         
	//   94  177:invokevirtual   #840 <Method int getHeight()>
	//   95  180:istore          5
				int k1 = getPaddingTop();
	//   96  182:aload_0         
	//   97  183:invokevirtual   #843 <Method int getPaddingTop()>
	//   98  186:istore          6
				int l1 = getPaddingBottom();
	//   99  188:aload_0         
	//  100  189:invokevirtual   #846 <Method int getPaddingBottom()>
	//  101  192:istore          7
				canvas.rotate(90F);
	//  102  194:aload_1         
	//  103  195:ldc2            #864 <Float 90F>
	//  104  198:invokevirtual   #850 <Method void Canvas.rotate(float)>
				canvas.translate(-getPaddingTop(), -(mLastOffset + 1.0F) * (float)j);
	//  105  201:aload_1         
	//  106  202:aload_0         
	//  107  203:invokevirtual   #843 <Method int getPaddingTop()>
	//  108  206:ineg            
	//  109  207:i2f             
	//  110  208:aload_0         
	//  111  209:getfield        #209 <Field float mLastOffset>
	//  112  212:fconst_1        
	//  113  213:fadd            
	//  114  214:fneg            
	//  115  215:iload_3         
	//  116  216:i2f             
	//  117  217:fmul            
	//  118  218:invokevirtual   #854 <Method void Canvas.translate(float, float)>
				mRightEdge.setSize(j1 - k1 - l1, j);
	//  119  221:aload_0         
	//  120  222:getfield        #510 <Field EdgeEffect mRightEdge>
	//  121  225:iload           5
	//  122  227:iload           6
	//  123  229:isub            
	//  124  230:iload           7
	//  125  232:isub            
	//  126  233:iload_3         
	//  127  234:invokevirtual   #857 <Method void EdgeEffect.setSize(int, int)>
				j = i | mRightEdge.draw(canvas);
	//  128  237:iload_2         
	//  129  238:aload_0         
	//  130  239:getfield        #510 <Field EdgeEffect mRightEdge>
	//  131  242:aload_1         
	//  132  243:invokevirtual   #860 <Method boolean EdgeEffect.draw(Canvas)>
	//  133  246:ior             
	//  134  247:istore_3        
				canvas.restoreToCount(i1);
	//  135  248:aload_1         
	//  136  249:iload           4
	//  137  251:invokevirtual   #863 <Method void Canvas.restoreToCount(int)>
			}
		}
		if(j != 0)
	//* 138  254:iload_3         
	//* 139  255:ifeq            262
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  140  258:aload_0         
	//  141  259:invokestatic    #769 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//  142  262:return          
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
	//*   1    1:getfield        #721 <Field boolean mFakeDragging>
	//*   2    4:ifne            18
			throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
	//    3    7:new             #488 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #885 <String "No fake drag in progress. Call beginFakeDrag first.">
	//    6   14:invokespecial   #493 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(mAdapter != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #236 <Field PagerAdapter mAdapter>
	//*  10   22:ifnull          120
		{
			Object obj = ((Object) (mVelocityTracker));
	//   11   25:aload_0         
	//   12   26:getfield        #389 <Field VelocityTracker mVelocityTracker>
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
	//   22   47:getfield        #213 <Field int mActivePointerId>
	//   23   50:invokevirtual   #894 <Method float VelocityTracker.getXVelocity(int)>
	//   24   53:f2i             
	//   25   54:istore_1        
			mPopulatePending = true;
	//   26   55:aload_0         
	//   27   56:iconst_1        
	//   28   57:putfield        #305 <Field boolean mPopulatePending>
			int j = getClientWidth();
	//   29   60:aload_0         
	//   30   61:invokespecial   #245 <Method int getClientWidth()>
	//   31   64:istore_2        
			int k = getScrollX();
	//   32   65:aload_0         
	//   33   66:invokevirtual   #286 <Method int getScrollX()>
	//   34   69:istore_3        
			obj = ((Object) (infoForCurrentScrollPosition()));
	//   35   70:aload_0         
	//   36   71:invokespecial   #495 <Method ViewPager$ItemInfo infoForCurrentScrollPosition()>
	//   37   74:astore          4
			setCurrentItemInternal(determineTargetPage(((ItemInfo) (obj)).position, ((float)k / (float)j - ((ItemInfo) (obj)).offset) / ((ItemInfo) (obj)).widthFactor, i, (int)(mLastMotionX - mInitialMotionX)), true, true, i);
	//   38   76:aload_0         
	//   39   77:aload_0         
	//   40   78:aload           4
	//   41   80:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//   42   83:iload_3         
	//   43   84:i2f             
	//   44   85:iload_2         
	//   45   86:i2f             
	//   46   87:fdiv            
	//   47   88:aload           4
	//   48   90:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//   49   93:fsub            
	//   50   94:aload           4
	//   51   96:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//   52   99:fdiv            
	//   53  100:iload_1         
	//   54  101:aload_0         
	//   55  102:getfield        #480 <Field float mLastMotionX>
	//   56  105:aload_0         
	//   57  106:getfield        #726 <Field float mInitialMotionX>
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
	//   66  121:invokespecial   #550 <Method void endDrag()>
		mFakeDragging = false;
	//   67  124:aload_0         
	//   68  125:iconst_0        
	//   69  126:putfield        #721 <Field boolean mFakeDragging>
	//   70  129:return          
	}

	public boolean executeKeyEvent(KeyEvent keyevent)
	{
		if(keyevent.getAction() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #904 <Method int KeyEvent.getAction()>
	//*   2    4:ifne            110
		{
			int i = keyevent.getKeyCode();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #907 <Method int KeyEvent.getKeyCode()>
	//    5   11:istore_2        
			if(i != 61)
	//*   6   12:iload_2         
	//*   7   13:bipush          61
	//*   8   15:icmpeq          83
			{
				switch(i)
	//*   9   18:iload_2         
				{
	//*  10   19:tableswitch     21 22: default 40
	//	               21 63
	//	               22 43
	//*  11   40:goto            110
				case 22: // '\026'
					if(keyevent.hasModifiers(2))
	//*  12   43:aload_1         
	//*  13   44:iconst_2        
	//*  14   45:invokevirtual   #910 <Method boolean KeyEvent.hasModifiers(int)>
	//*  15   48:ifeq            56
						return pageRight();
	//   16   51:aload_0         
	//   17   52:invokevirtual   #710 <Method boolean pageRight()>
	//   18   55:ireturn         
					else
						return arrowScroll(66);
	//   19   56:aload_0         
	//   20   57:bipush          66
	//   21   59:invokevirtual   #912 <Method boolean arrowScroll(int)>
	//   22   62:ireturn         

				case 21: // '\025'
					if(keyevent.hasModifiers(2))
	//*  23   63:aload_1         
	//*  24   64:iconst_2        
	//*  25   65:invokevirtual   #910 <Method boolean KeyEvent.hasModifiers(int)>
	//*  26   68:ifeq            76
						return pageLeft();
	//   27   71:aload_0         
	//   28   72:invokevirtual   #704 <Method boolean pageLeft()>
	//   29   75:ireturn         
					else
						return arrowScroll(17);
	//   30   76:aload_0         
	//   31   77:bipush          17
	//   32   79:invokevirtual   #912 <Method boolean arrowScroll(int)>
	//   33   82:ireturn         
				}
			} else
			{
				if(keyevent.hasNoModifiers())
	//*  34   83:aload_1         
	//*  35   84:invokevirtual   #915 <Method boolean KeyEvent.hasNoModifiers()>
	//*  36   87:ifeq            96
					return arrowScroll(2);
	//   37   90:aload_0         
	//   38   91:iconst_2        
	//   39   92:invokevirtual   #912 <Method boolean arrowScroll(int)>
	//   40   95:ireturn         
				if(keyevent.hasModifiers(1))
	//*  41   96:aload_1         
	//*  42   97:iconst_1        
	//*  43   98:invokevirtual   #910 <Method boolean KeyEvent.hasModifiers(int)>
	//*  44  101:ifeq            110
					return arrowScroll(1);
	//   45  104:aload_0         
	//   46  105:iconst_1        
	//   47  106:invokevirtual   #912 <Method boolean arrowScroll(int)>
	//   48  109:ireturn         
			}
		}
		return false;
	//   49  110:iconst_0        
	//   50  111:ireturn         
	}

	public void fakeDragBy(float f)
	{
		if(!mFakeDragging)
	//*   0    0:aload_0         
	//*   1    1:getfield        #721 <Field boolean mFakeDragging>
	//*   2    4:ifne            18
			throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
	//    3    7:new             #488 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #885 <String "No fake drag in progress. Call beginFakeDrag first.">
	//    6   14:invokespecial   #493 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(mAdapter == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #236 <Field PagerAdapter mAdapter>
	//*  10   22:ifnonnull       26
			return;
	//   11   25:return          
		mLastMotionX = mLastMotionX + f;
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #480 <Field float mLastMotionX>
	//   15   31:fload_1         
	//   16   32:fadd            
	//   17   33:putfield        #480 <Field float mLastMotionX>
		float f2 = (float)getScrollX() - f;
	//   18   36:aload_0         
	//   19   37:invokevirtual   #286 <Method int getScrollX()>
	//   20   40:i2f             
	//   21   41:fload_1         
	//   22   42:fsub            
	//   23   43:fstore_3        
		float f3 = getClientWidth();
	//   24   44:aload_0         
	//   25   45:invokespecial   #245 <Method int getClientWidth()>
	//   26   48:i2f             
	//   27   49:fstore          4
		f = mFirstOffset * f3;
	//   28   51:aload_0         
	//   29   52:getfield        #206 <Field float mFirstOffset>
	//   30   55:fload           4
	//   31   57:fmul            
	//   32   58:fstore_1        
		float f1 = mLastOffset * f3;
	//   33   59:aload_0         
	//   34   60:getfield        #209 <Field float mLastOffset>
	//   35   63:fload           4
	//   36   65:fmul            
	//   37   66:fstore_2        
		Object obj = ((Object) ((ItemInfo)mItems.get(0)));
	//   38   67:aload_0         
	//   39   68:getfield        #189 <Field ArrayList mItems>
	//   40   71:iconst_0        
	//   41   72:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//   42   75:checkcast       #17  <Class ViewPager$ItemInfo>
	//   43   78:astore          8
		ItemInfo iteminfo = (ItemInfo)mItems.get(mItems.size() - 1);
	//   44   80:aload_0         
	//   45   81:getfield        #189 <Field ArrayList mItems>
	//   46   84:aload_0         
	//   47   85:getfield        #189 <Field ArrayList mItems>
	//   48   88:invokevirtual   #259 <Method int ArrayList.size()>
	//   49   91:iconst_1        
	//   50   92:isub            
	//   51   93:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//   52   96:checkcast       #17  <Class ViewPager$ItemInfo>
	//   53   99:astore          9
		if(((ItemInfo) (obj)).position != 0)
	//*  54  101:aload           8
	//*  55  103:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//*  56  106:ifeq            118
			f = ((ItemInfo) (obj)).offset * f3;
	//   57  109:aload           8
	//   58  111:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//   59  114:fload           4
	//   60  116:fmul            
	//   61  117:fstore_1        
		if(iteminfo.position != mAdapter.getCount() - 1)
	//*  62  118:aload           9
	//*  63  120:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//*  64  123:aload_0         
	//*  65  124:getfield        #236 <Field PagerAdapter mAdapter>
	//*  66  127:invokevirtual   #242 <Method int PagerAdapter.getCount()>
	//*  67  130:iconst_1        
	//*  68  131:isub            
	//*  69  132:icmpeq          144
			f1 = iteminfo.offset * f3;
	//   70  135:aload           9
	//   71  137:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//   72  140:fload           4
	//   73  142:fmul            
	//   74  143:fstore_2        
		if(f2 >= f)
	//*  75  144:fload_3         
	//*  76  145:fload_1         
	//*  77  146:fcmpg           
	//*  78  147:ifge            153
	//*  79  150:goto            163
		{
			f = f2;
	//   80  153:fload_3         
	//   81  154:fstore_1        
			if(f2 > f1)
	//*  82  155:fload_3         
	//*  83  156:fload_2         
	//*  84  157:fcmpl           
	//*  85  158:ifle            163
				f = f1;
	//   86  161:fload_2         
	//   87  162:fstore_1        
		}
		f1 = mLastMotionX;
	//   88  163:aload_0         
	//   89  164:getfield        #480 <Field float mLastMotionX>
	//   90  167:fstore_2        
		int i = (int)f;
	//   91  168:fload_1         
	//   92  169:f2i             
	//   93  170:istore          5
		mLastMotionX = f1 + (f - (float)i);
	//   94  172:aload_0         
	//   95  173:fload_2         
	//   96  174:fload_1         
	//   97  175:iload           5
	//   98  177:i2f             
	//   99  178:fsub            
	//  100  179:fadd            
	//  101  180:putfield        #480 <Field float mLastMotionX>
		scrollTo(i, getScrollY());
	//  102  183:aload_0         
	//  103  184:iload           5
	//  104  186:aload_0         
	//  105  187:invokevirtual   #289 <Method int getScrollY()>
	//  106  190:invokevirtual   #299 <Method void scrollTo(int, int)>
		pageScrolled(i);
	//  107  193:aload_0         
	//  108  194:iload           5
	//  109  196:invokespecial   #303 <Method boolean pageScrolled(int)>
	//  110  199:pop             
		long l = SystemClock.uptimeMillis();
	//  111  200:invokestatic    #736 <Method long SystemClock.uptimeMillis()>
	//  112  203:lstore          6
		obj = ((Object) (MotionEvent.obtain(mFakeDragBeginTime, l, 2, mLastMotionX, 0.0F, 0)));
	//  113  205:aload_0         
	//  114  206:getfield        #745 <Field long mFakeDragBeginTime>
	//  115  209:lload           6
	//  116  211:iconst_2        
	//  117  212:aload_0         
	//  118  213:getfield        #480 <Field float mLastMotionX>
	//  119  216:fconst_0        
	//  120  217:iconst_0        
	//  121  218:invokestatic    #739 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//  122  221:astore          8
		mVelocityTracker.addMovement(((MotionEvent) (obj)));
	//  123  223:aload_0         
	//  124  224:getfield        #389 <Field VelocityTracker mVelocityTracker>
	//  125  227:aload           8
	//  126  229:invokevirtual   #742 <Method void VelocityTracker.addMovement(MotionEvent)>
		((MotionEvent) (obj)).recycle();
	//  127  232:aload           8
	//  128  234:invokevirtual   #743 <Method void MotionEvent.recycle()>
	//  129  237:return          
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
	//    1    1:getfield        #236 <Field PagerAdapter mAdapter>
	//    2    4:areturn         
	}

	protected int getChildDrawingOrder(int i, int j)
	{
		int k = j;
	//    0    0:iload_2         
	//    1    1:istore_3        
		if(mDrawingOrder == 2)
	//*   2    2:aload_0         
	//*   3    3:getfield        #569 <Field int mDrawingOrder>
	//*   4    6:iconst_2        
	//*   5    7:icmpne          16
			k = i - 1 - j;
	//    6   10:iload_1         
	//    7   11:iconst_1        
	//    8   12:isub            
	//    9   13:iload_2         
	//   10   14:isub            
	//   11   15:istore_3        
		return ((LayoutParams)((View)mDrawingOrderedChildren.get(k)).getLayoutParams()).childIndex;
	//   12   16:aload_0         
	//   13   17:getfield        #571 <Field ArrayList mDrawingOrderedChildren>
	//   14   20:iload_3         
	//   15   21:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//   16   24:checkcast       #378 <Class View>
	//   17   27:invokevirtual   #534 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   30:checkcast       #20  <Class ViewPager$LayoutParams>
	//   19   33:getfield        #933 <Field int ViewPager$LayoutParams.childIndex>
	//   20   36:ireturn         
	}

	public int getCurrentItem()
	{
		return mCurItem;
	//    0    0:aload_0         
	//    1    1:getfield        #333 <Field int mCurItem>
	//    2    4:ireturn         
	}

	public int getOffscreenPageLimit()
	{
		return mOffscreenPageLimit;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field int mOffscreenPageLimit>
	//    2    4:ireturn         
	}

	public int getPageMargin()
	{
		return mPageMargin;
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field int mPageMargin>
	//    2    4:ireturn         
	}

	ItemInfo infoForAnyChild(View view)
	{
		do
		{
			ViewParent viewparent = view.getParent();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #428 <Method ViewParent View.getParent()>
	//    2    4:astore_2        
			if(viewparent != this)
	//*   3    5:aload_2         
	//*   4    6:aload_0         
	//*   5    7:if_acmpeq       34
			{
				if(viewparent != null && (viewparent instanceof View))
	//*   6   10:aload_2         
	//*   7   11:ifnull          32
	//*   8   14:aload_2         
	//*   9   15:instanceof      #378 <Class View>
	//*  10   18:ifne            24
	//*  11   21:goto            32
					view = (View)viewparent;
	//   12   24:aload_2         
	//   13   25:checkcast       #378 <Class View>
	//   14   28:astore_1        
				else
	//*  15   29:goto            0
					return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
			} else
			{
				return infoForChild(view);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #595 <Method ViewPager$ItemInfo infoForChild(View)>
	//   21   39:areturn         
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
	//*   4    4:getfield        #189 <Field ArrayList mItems>
	//*   5    7:invokevirtual   #259 <Method int ArrayList.size()>
	//*   6   10:icmpge          49
		{
			ItemInfo iteminfo = (ItemInfo)mItems.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #189 <Field ArrayList mItems>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #17  <Class ViewPager$ItemInfo>
	//   12   24:astore_3        
			if(mAdapter.isViewFromObject(view, iteminfo.object))
	//*  13   25:aload_0         
	//*  14   26:getfield        #236 <Field PagerAdapter mAdapter>
	//*  15   29:aload_1         
	//*  16   30:aload_3         
	//*  17   31:getfield        #619 <Field Object ViewPager$ItemInfo.object>
	//*  18   34:invokevirtual   #940 <Method boolean PagerAdapter.isViewFromObject(View, Object)>
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
	//*   4    4:getfield        #189 <Field ArrayList mItems>
	//*   5    7:invokevirtual   #259 <Method int ArrayList.size()>
	//*   6   10:icmpge          42
		{
			ItemInfo iteminfo = (ItemInfo)mItems.get(j);
	//    7   13:aload_0         
	//    8   14:getfield        #189 <Field ArrayList mItems>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #17  <Class ViewPager$ItemInfo>
	//   12   24:astore_3        
			if(iteminfo.position == i)
	//*  13   25:aload_3         
	//*  14   26:getfield        #250 <Field int ViewPager$ItemInfo.position>
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
	//    2    2:invokevirtual   #943 <Method void setWillNotDraw(boolean)>
		setDescendantFocusability(0x40000);
	//    3    5:aload_0         
	//    4    6:ldc2            #598 <Int 0x40000>
	//    5    9:invokevirtual   #946 <Method void setDescendantFocusability(int)>
		setFocusable(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #949 <Method void setFocusable(boolean)>
		Context context = getContext();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #923 <Method Context getContext()>
	//   11   21:astore_2        
		mScroller = new Scroller(context, sInterpolator);
	//   12   22:aload_0         
	//   13   23:new             #276 <Class Scroller>
	//   14   26:dup             
	//   15   27:aload_2         
	//   16   28:getstatic       #176 <Field Interpolator sInterpolator>
	//   17   31:invokespecial   #952 <Method void Scroller(Context, Interpolator)>
	//   18   34:putfield        #274 <Field Scroller mScroller>
		ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
	//   19   37:aload_2         
	//   20   38:invokestatic    #957 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   21   41:astore_3        
		float f = context.getResources().getDisplayMetrics().density;
	//   22   42:aload_2         
	//   23   43:invokevirtual   #963 <Method Resources Context.getResources()>
	//   24   46:invokevirtual   #969 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   25   49:getfield        #974 <Field float DisplayMetrics.density>
	//   26   52:fstore_1        
		mTouchSlop = viewconfiguration.getScaledPagingTouchSlop();
	//   27   53:aload_0         
	//   28   54:aload_3         
	//   29   55:invokevirtual   #977 <Method int ViewConfiguration.getScaledPagingTouchSlop()>
	//   30   58:putfield        #979 <Field int mTouchSlop>
		mMinimumVelocity = (int)(400F * f);
	//   31   61:aload_0         
	//   32   62:ldc2            #980 <Float 400F>
	//   33   65:fload_1         
	//   34   66:fmul            
	//   35   67:f2i             
	//   36   68:putfield        #331 <Field int mMinimumVelocity>
		mMaximumVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
	//   37   71:aload_0         
	//   38   72:aload_3         
	//   39   73:invokevirtual   #983 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   40   76:putfield        #887 <Field int mMaximumVelocity>
		mLeftEdge = new EdgeEffect(context);
	//   41   79:aload_0         
	//   42   80:new             #504 <Class EdgeEffect>
	//   43   83:dup             
	//   44   84:aload_2         
	//   45   85:invokespecial   #984 <Method void EdgeEffect(Context)>
	//   46   88:putfield        #499 <Field EdgeEffect mLeftEdge>
		mRightEdge = new EdgeEffect(context);
	//   47   91:aload_0         
	//   48   92:new             #504 <Class EdgeEffect>
	//   49   95:dup             
	//   50   96:aload_2         
	//   51   97:invokespecial   #984 <Method void EdgeEffect(Context)>
	//   52  100:putfield        #510 <Field EdgeEffect mRightEdge>
		mFlingDistance = (int)(25F * f);
	//   53  103:aload_0         
	//   54  104:ldc2            #985 <Float 25F>
	//   55  107:fload_1         
	//   56  108:fmul            
	//   57  109:f2i             
	//   58  110:putfield        #329 <Field int mFlingDistance>
		mCloseEnough = (int)(2.0F * f);
	//   59  113:aload_0         
	//   60  114:fconst_2        
	//   61  115:fload_1         
	//   62  116:fmul            
	//   63  117:f2i             
	//   64  118:putfield        #987 <Field int mCloseEnough>
		mDefaultGutterSize = (int)(16F * f);
	//   65  121:aload_0         
	//   66  122:ldc2            #988 <Float 16F>
	//   67  125:fload_1         
	//   68  126:fmul            
	//   69  127:f2i             
	//   70  128:putfield        #990 <Field int mDefaultGutterSize>
		ViewCompat.setAccessibilityDelegate(((View) (this)), ((AccessibilityDelegateCompat) (new MyAccessibilityDelegate())));
	//   71  131:aload_0         
	//   72  132:new             #23  <Class ViewPager$MyAccessibilityDelegate>
	//   73  135:dup             
	//   74  136:aload_0         
	//   75  137:invokespecial   #991 <Method void ViewPager$MyAccessibilityDelegate(ViewPager)>
	//   76  140:invokestatic    #995 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
		if(ViewCompat.getImportantForAccessibility(((View) (this))) == 0)
	//*  77  143:aload_0         
	//*  78  144:invokestatic    #999 <Method int ViewCompat.getImportantForAccessibility(View)>
	//*  79  147:ifne            155
			ViewCompat.setImportantForAccessibility(((View) (this)), 1);
	//   80  150:aload_0         
	//   81  151:iconst_1        
	//   82  152:invokestatic    #1003 <Method void ViewCompat.setImportantForAccessibility(View, int)>
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
	//   87  161:invokespecial   #1004 <Method void ViewPager$4(ViewPager)>
	//   88  164:invokestatic    #1008 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
	//   89  167:return          
	}

	public boolean isFakeDragging()
	{
		return mFakeDragging;
	//    0    0:aload_0         
	//    1    1:getfield        #721 <Field boolean mFakeDragging>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1012 <Method void ViewGroup.onAttachedToWindow()>
		mFirstLayout = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #215 <Field boolean mFirstLayout>
	//    5    9:return          
	}

	protected void onDetachedFromWindow()
	{
		removeCallbacks(mEndScrollRunnable);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #222 <Field Runnable mEndScrollRunnable>
	//    3    5:invokevirtual   #1017 <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		if(mScroller != null && !mScroller.isFinished())
	//*   5    9:aload_0         
	//*   6   10:getfield        #274 <Field Scroller mScroller>
	//*   7   13:ifnull          33
	//*   8   16:aload_0         
	//*   9   17:getfield        #274 <Field Scroller mScroller>
	//*  10   20:invokevirtual   #280 <Method boolean Scroller.isFinished()>
	//*  11   23:ifne            33
			mScroller.abortAnimation();
	//   12   26:aload_0         
	//   13   27:getfield        #274 <Field Scroller mScroller>
	//   14   30:invokevirtual   #283 <Method void Scroller.abortAnimation()>
		super.onDetachedFromWindow();
	//   15   33:aload_0         
	//   16   34:invokespecial   #1019 <Method void ViewGroup.onDetachedFromWindow()>
	//   17   37:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1022 <Method void ViewGroup.onDraw(Canvas)>
		if(mPageMargin > 0 && mMarginDrawable != null && mItems.size() > 0 && mAdapter != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #247 <Field int mPageMargin>
	//*   5    9:ifle            339
	//*   6   12:aload_0         
	//*   7   13:getfield        #869 <Field Drawable mMarginDrawable>
	//*   8   16:ifnull          339
	//*   9   19:aload_0         
	//*  10   20:getfield        #189 <Field ArrayList mItems>
	//*  11   23:invokevirtual   #259 <Method int ArrayList.size()>
	//*  12   26:ifle            339
	//*  13   29:aload_0         
	//*  14   30:getfield        #236 <Field PagerAdapter mAdapter>
	//*  15   33:ifnull          339
		{
			int k = getScrollX();
	//   16   36:aload_0         
	//   17   37:invokevirtual   #286 <Method int getScrollX()>
	//   18   40:istore          10
			int l = getWidth();
	//   19   42:aload_0         
	//   20   43:invokevirtual   #465 <Method int getWidth()>
	//   21   46:istore          11
			float f = mPageMargin;
	//   22   48:aload_0         
	//   23   49:getfield        #247 <Field int mPageMargin>
	//   24   52:i2f             
	//   25   53:fstore_2        
			float f3 = l;
	//   26   54:iload           11
	//   27   56:i2f             
	//   28   57:fstore          5
			float f1 = f / f3;
	//   29   59:fload_2         
	//   30   60:fload           5
	//   31   62:fdiv            
	//   32   63:fstore_3        
			Object obj = ((Object) (mItems));
	//   33   64:aload_0         
	//   34   65:getfield        #189 <Field ArrayList mItems>
	//   35   68:astore          14
			int j = 0;
	//   36   70:iconst_0        
	//   37   71:istore          9
			obj = ((Object) ((ItemInfo)((ArrayList) (obj)).get(0)));
	//   38   73:aload           14
	//   39   75:iconst_0        
	//   40   76:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//   41   79:checkcast       #17  <Class ViewPager$ItemInfo>
	//   42   82:astore          14
			f = ((ItemInfo) (obj)).offset;
	//   43   84:aload           14
	//   44   86:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//   45   89:fstore_2        
			int i1 = mItems.size();
	//   46   90:aload_0         
	//   47   91:getfield        #189 <Field ArrayList mItems>
	//   48   94:invokevirtual   #259 <Method int ArrayList.size()>
	//   49   97:istore          12
			int i = ((ItemInfo) (obj)).position;
	//   50   99:aload           14
	//   51  101:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//   52  104:istore          8
			for(int j1 = ((ItemInfo)mItems.get(i1 - 1)).position; i < j1; i++)
	//*  53  106:aload_0         
	//*  54  107:getfield        #189 <Field ArrayList mItems>
	//*  55  110:iload           12
	//*  56  112:iconst_1        
	//*  57  113:isub            
	//*  58  114:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//*  59  117:checkcast       #17  <Class ViewPager$ItemInfo>
	//*  60  120:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//*  61  123:istore          13
	//*  62  125:iload           8
	//*  63  127:iload           13
	//*  64  129:icmpge          339
			{
				for(; i > ((ItemInfo) (obj)).position && j < i1; obj = ((Object) ((ItemInfo)((ArrayList) (obj)).get(j))))
	//*  65  132:iload           8
	//*  66  134:aload           14
	//*  67  136:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//*  68  139:icmple          176
	//*  69  142:iload           9
	//*  70  144:iload           12
	//*  71  146:icmpge          176
				{
					obj = ((Object) (mItems));
	//   72  149:aload_0         
	//   73  150:getfield        #189 <Field ArrayList mItems>
	//   74  153:astore          14
					j++;
	//   75  155:iload           9
	//   76  157:iconst_1        
	//   77  158:iadd            
	//   78  159:istore          9
				}

	//   79  161:aload           14
	//   80  163:iload           9
	//   81  165:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//   82  168:checkcast       #17  <Class ViewPager$ItemInfo>
	//   83  171:astore          14
	//*  84  173:goto            132
				float f2;
				if(i == ((ItemInfo) (obj)).position)
	//*  85  176:iload           8
	//*  86  178:aload           14
	//*  87  180:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//*  88  183:icmpne          233
				{
					f2 = ((ItemInfo) (obj)).offset;
	//   89  186:aload           14
	//   90  188:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//   91  191:fstore          4
					float f6 = ((ItemInfo) (obj)).widthFactor;
	//   92  193:aload           14
	//   93  195:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//   94  198:fstore          7
					f = ((ItemInfo) (obj)).offset;
	//   95  200:aload           14
	//   96  202:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//   97  205:fstore_2        
					float f4 = ((ItemInfo) (obj)).widthFactor;
	//   98  206:aload           14
	//   99  208:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//  100  211:fstore          6
					f2 = (f2 + f6) * f3;
	//  101  213:fload           4
	//  102  215:fload           7
	//  103  217:fadd            
	//  104  218:fload           5
	//  105  220:fmul            
	//  106  221:fstore          4
					f = f + f4 + f1;
	//  107  223:fload_2         
	//  108  224:fload           6
	//  109  226:fadd            
	//  110  227:fload_3         
	//  111  228:fadd            
	//  112  229:fstore_2        
				} else
	//* 113  230:goto            260
				{
					float f5 = mAdapter.getPageWidth(i);
	//  114  233:aload_0         
	//  115  234:getfield        #236 <Field PagerAdapter mAdapter>
	//  116  237:iload           8
	//  117  239:invokevirtual   #267 <Method float PagerAdapter.getPageWidth(int)>
	//  118  242:fstore          6
					f2 = (f + f5) * f3;
	//  119  244:fload_2         
	//  120  245:fload           6
	//  121  247:fadd            
	//  122  248:fload           5
	//  123  250:fmul            
	//  124  251:fstore          4
					f += f5 + f1;
	//  125  253:fload_2         
	//  126  254:fload           6
	//  127  256:fload_3         
	//  128  257:fadd            
	//  129  258:fadd            
	//  130  259:fstore_2        
				}
				if((float)mPageMargin + f2 > (float)k)
	//* 131  260:aload_0         
	//* 132  261:getfield        #247 <Field int mPageMargin>
	//* 133  264:i2f             
	//* 134  265:fload           4
	//* 135  267:fadd            
	//* 136  268:iload           10
	//* 137  270:i2f             
	//* 138  271:fcmpl           
	//* 139  272:ifle            317
				{
					mMarginDrawable.setBounds(Math.round(f2), mTopPageBounds, Math.round((float)mPageMargin + f2), mBottomPageBounds);
	//  140  275:aload_0         
	//  141  276:getfield        #869 <Field Drawable mMarginDrawable>
	//  142  279:fload           4
	//  143  281:invokestatic    #1026 <Method int Math.round(float)>
	//  144  284:aload_0         
	//  145  285:getfield        #1028 <Field int mTopPageBounds>
	//  146  288:aload_0         
	//  147  289:getfield        #247 <Field int mPageMargin>
	//  148  292:i2f             
	//  149  293:fload           4
	//  150  295:fadd            
	//  151  296:invokestatic    #1026 <Method int Math.round(float)>
	//  152  299:aload_0         
	//  153  300:getfield        #1030 <Field int mBottomPageBounds>
	//  154  303:invokevirtual   #1033 <Method void Drawable.setBounds(int, int, int, int)>
					mMarginDrawable.draw(canvas);
	//  155  306:aload_0         
	//  156  307:getfield        #869 <Field Drawable mMarginDrawable>
	//  157  310:aload_1         
	//  158  311:invokevirtual   #1034 <Method void Drawable.draw(Canvas)>
				}
	//* 159  314:goto            317
				if(f2 > (float)(k + l))
	//* 160  317:fload           4
	//* 161  319:iload           10
	//* 162  321:iload           11
	//* 163  323:iadd            
	//* 164  324:i2f             
	//* 165  325:fcmpl           
	//* 166  326:ifle            330
					return;
	//  167  329:return          
			}

	//  168  330:iload           8
	//  169  332:iconst_1        
	//  170  333:iadd            
	//  171  334:istore          8
		}
	//* 172  336:goto            125
	//  173  339:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getAction() & 0xff;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1037 <Method int MotionEvent.getAction()>
	//    2    4:sipush          255
	//    3    7:iand            
	//    4    8:istore          7
		if(i != 3 && i != 1)
	//*   5   10:iload           7
	//*   6   12:iconst_3        
	//*   7   13:icmpeq          479
	//*   8   16:iload           7
	//*   9   18:iconst_1        
	//*  10   19:icmpne          25
	//*  11   22:goto            479
		{
			if(i != 0)
	//*  12   25:iload           7
	//*  13   27:ifeq            48
			{
				if(mIsBeingDragged)
	//*  14   30:aload_0         
	//*  15   31:getfield        #385 <Field boolean mIsBeingDragged>
	//*  16   34:ifeq            39
					return true;
	//   17   37:iconst_1        
	//   18   38:ireturn         
				if(mIsUnableToDrag)
	//*  19   39:aload_0         
	//*  20   40:getfield        #387 <Field boolean mIsUnableToDrag>
	//*  21   43:ifeq            48
					return false;
	//   22   46:iconst_0        
	//   23   47:ireturn         
			}
			if(i != 0)
	//*  24   48:iload           7
	//*  25   50:ifeq            318
			{
				if(i != 2)
	//*  26   53:iload           7
	//*  27   55:iconst_2        
	//*  28   56:icmpeq          77
				{
					if(i == 6)
	//*  29   59:iload           7
	//*  30   61:bipush          6
	//*  31   63:icmpeq          69
	//*  32   66:goto            452
						onSecondaryPointerUp(motionevent);
	//   33   69:aload_0         
	//   34   70:aload_1         
	//   35   71:invokespecial   #1039 <Method void onSecondaryPointerUp(MotionEvent)>
				} else
	//*  36   74:goto            452
				{
					int j = mActivePointerId;
	//   37   77:aload_0         
	//   38   78:getfield        #213 <Field int mActivePointerId>
	//   39   81:istore          7
					if(j != -1)
	//*  40   83:iload           7
	//*  41   85:iconst_m1       
	//*  42   86:icmpne          92
	//*  43   89:goto            452
					{
						j = motionevent.findPointerIndex(j);
	//   44   92:aload_1         
	//   45   93:iload           7
	//   46   95:invokevirtual   #1042 <Method int MotionEvent.findPointerIndex(int)>
	//   47   98:istore          7
						float f2 = motionevent.getX(j);
	//   48  100:aload_1         
	//   49  101:iload           7
	//   50  103:invokevirtual   #478 <Method float MotionEvent.getX(int)>
	//   51  106:fstore_3        
						float f = f2 - mLastMotionX;
	//   52  107:fload_3         
	//   53  108:aload_0         
	//   54  109:getfield        #480 <Field float mLastMotionX>
	//   55  112:fsub            
	//   56  113:fstore_2        
						float f4 = Math.abs(f);
	//   57  114:fload_2         
	//   58  115:invokestatic    #502 <Method float Math.abs(float)>
	//   59  118:fstore          5
						float f3 = motionevent.getY(j);
	//   60  120:aload_1         
	//   61  121:iload           7
	//   62  123:invokevirtual   #1045 <Method float MotionEvent.getY(int)>
	//   63  126:fstore          4
						float f5 = Math.abs(f3 - mInitialMotionY);
	//   64  128:fload           4
	//   65  130:aload_0         
	//   66  131:getfield        #1047 <Field float mInitialMotionY>
	//   67  134:fsub            
	//   68  135:invokestatic    #502 <Method float Math.abs(float)>
	//   69  138:fstore          6
						if(f != 0.0F && !isGutterDrag(mLastMotionX, f) && canScroll(((View) (this)), false, (int)f, (int)f2, (int)f3))
	//*  70  140:fload_2         
	//*  71  141:fconst_0        
	//*  72  142:fcmpl           
	//*  73  143:ifeq            192
	//*  74  146:aload_0         
	//*  75  147:aload_0         
	//*  76  148:getfield        #480 <Field float mLastMotionX>
	//*  77  151:fload_2         
	//*  78  152:invokespecial   #1049 <Method boolean isGutterDrag(float, float)>
	//*  79  155:ifne            192
	//*  80  158:aload_0         
	//*  81  159:aload_0         
	//*  82  160:iconst_0        
	//*  83  161:fload_2         
	//*  84  162:f2i             
	//*  85  163:fload_3         
	//*  86  164:f2i             
	//*  87  165:fload           4
	//*  88  167:f2i             
	//*  89  168:invokevirtual   #753 <Method boolean canScroll(View, boolean, int, int, int)>
	//*  90  171:ifeq            192
						{
							mLastMotionX = f2;
	//   91  174:aload_0         
	//   92  175:fload_3         
	//   93  176:putfield        #480 <Field float mLastMotionX>
							mLastMotionY = f3;
	//   94  179:aload_0         
	//   95  180:fload           4
	//   96  182:putfield        #1051 <Field float mLastMotionY>
							mIsUnableToDrag = true;
	//   97  185:aload_0         
	//   98  186:iconst_1        
	//   99  187:putfield        #387 <Field boolean mIsUnableToDrag>
							return false;
	//  100  190:iconst_0        
	//  101  191:ireturn         
						}
						if(f4 > (float)mTouchSlop && f4 * 0.5F > f5)
	//* 102  192:fload           5
	//* 103  194:aload_0         
	//* 104  195:getfield        #979 <Field int mTouchSlop>
	//* 105  198:i2f             
	//* 106  199:fcmpl           
	//* 107  200:ifle            280
	//* 108  203:fload           5
	//* 109  205:ldc2            #817 <Float 0.5F>
	//* 110  208:fmul            
	//* 111  209:fload           6
	//* 112  211:fcmpl           
	//* 113  212:ifle            280
						{
							mIsBeingDragged = true;
	//  114  215:aload_0         
	//  115  216:iconst_1        
	//  116  217:putfield        #385 <Field boolean mIsBeingDragged>
							requestParentDisallowInterceptTouchEvent(true);
	//  117  220:aload_0         
	//  118  221:iconst_1        
	//  119  222:invokespecial   #1053 <Method void requestParentDisallowInterceptTouchEvent(boolean)>
							setScrollState(1);
	//  120  225:aload_0         
	//  121  226:iconst_1        
	//  122  227:invokevirtual   #724 <Method void setScrollState(int)>
							if(f > 0.0F)
	//* 123  230:fload_2         
	//* 124  231:fconst_0        
	//* 125  232:fcmpl           
	//* 126  233:ifle            250
								f = mInitialMotionX + (float)mTouchSlop;
	//  127  236:aload_0         
	//  128  237:getfield        #726 <Field float mInitialMotionX>
	//  129  240:aload_0         
	//  130  241:getfield        #979 <Field int mTouchSlop>
	//  131  244:i2f             
	//  132  245:fadd            
	//  133  246:fstore_2        
							else
	//* 134  247:goto            261
								f = mInitialMotionX - (float)mTouchSlop;
	//  135  250:aload_0         
	//  136  251:getfield        #726 <Field float mInitialMotionX>
	//  137  254:aload_0         
	//  138  255:getfield        #979 <Field int mTouchSlop>
	//  139  258:i2f             
	//  140  259:fsub            
	//  141  260:fstore_2        
							mLastMotionX = f;
	//  142  261:aload_0         
	//  143  262:fload_2         
	//  144  263:putfield        #480 <Field float mLastMotionX>
							mLastMotionY = f3;
	//  145  266:aload_0         
	//  146  267:fload           4
	//  147  269:putfield        #1051 <Field float mLastMotionY>
							setScrollingCacheEnabled(true);
	//  148  272:aload_0         
	//  149  273:iconst_1        
	//  150  274:invokespecial   #272 <Method void setScrollingCacheEnabled(boolean)>
						} else
	//* 151  277:goto            296
						if(f5 > (float)mTouchSlop)
	//* 152  280:fload           6
	//* 153  282:aload_0         
	//* 154  283:getfield        #979 <Field int mTouchSlop>
	//* 155  286:i2f             
	//* 156  287:fcmpl           
	//* 157  288:ifle            296
							mIsUnableToDrag = true;
	//  158  291:aload_0         
	//  159  292:iconst_1        
	//  160  293:putfield        #387 <Field boolean mIsUnableToDrag>
						if(mIsBeingDragged && performDrag(f2))
	//* 161  296:aload_0         
	//* 162  297:getfield        #385 <Field boolean mIsBeingDragged>
	//* 163  300:ifeq            452
	//* 164  303:aload_0         
	//* 165  304:fload_3         
	//* 166  305:invokespecial   #1055 <Method boolean performDrag(float)>
	//* 167  308:ifeq            452
							ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  168  311:aload_0         
	//  169  312:invokestatic    #769 <Method void ViewCompat.postInvalidateOnAnimation(View)>
					}
				}
			} else
	//* 170  315:goto            452
			{
				float f1 = motionevent.getX();
	//  171  318:aload_1         
	//  172  319:invokevirtual   #1058 <Method float MotionEvent.getX()>
	//  173  322:fstore_2        
				mInitialMotionX = f1;
	//  174  323:aload_0         
	//  175  324:fload_2         
	//  176  325:putfield        #726 <Field float mInitialMotionX>
				mLastMotionX = f1;
	//  177  328:aload_0         
	//  178  329:fload_2         
	//  179  330:putfield        #480 <Field float mLastMotionX>
				f1 = motionevent.getY();
	//  180  333:aload_1         
	//  181  334:invokevirtual   #1060 <Method float MotionEvent.getY()>
	//  182  337:fstore_2        
				mInitialMotionY = f1;
	//  183  338:aload_0         
	//  184  339:fload_2         
	//  185  340:putfield        #1047 <Field float mInitialMotionY>
				mLastMotionY = f1;
	//  186  343:aload_0         
	//  187  344:fload_2         
	//  188  345:putfield        #1051 <Field float mLastMotionY>
				mActivePointerId = motionevent.getPointerId(0);
	//  189  348:aload_0         
	//  190  349:aload_1         
	//  191  350:iconst_0        
	//  192  351:invokevirtual   #475 <Method int MotionEvent.getPointerId(int)>
	//  193  354:putfield        #213 <Field int mActivePointerId>
				mIsUnableToDrag = false;
	//  194  357:aload_0         
	//  195  358:iconst_0        
	//  196  359:putfield        #387 <Field boolean mIsUnableToDrag>
				mIsScrollStarted = true;
	//  197  362:aload_0         
	//  198  363:iconst_1        
	//  199  364:putfield        #762 <Field boolean mIsScrollStarted>
				mScroller.computeScrollOffset();
	//  200  367:aload_0         
	//  201  368:getfield        #274 <Field Scroller mScroller>
	//  202  371:invokevirtual   #765 <Method boolean Scroller.computeScrollOffset()>
	//  203  374:pop             
				if(mScrollState == 2 && Math.abs(mScroller.getFinalX() - mScroller.getCurrX()) > mCloseEnough)
	//* 204  375:aload_0         
	//* 205  376:getfield        #224 <Field int mScrollState>
	//* 206  379:iconst_2        
	//* 207  380:icmpne          442
	//* 208  383:aload_0         
	//* 209  384:getfield        #274 <Field Scroller mScroller>
	//* 210  387:invokevirtual   #1063 <Method int Scroller.getFinalX()>
	//* 211  390:aload_0         
	//* 212  391:getfield        #274 <Field Scroller mScroller>
	//* 213  394:invokevirtual   #292 <Method int Scroller.getCurrX()>
	//* 214  397:isub            
	//* 215  398:invokestatic    #327 <Method int Math.abs(int)>
	//* 216  401:aload_0         
	//* 217  402:getfield        #987 <Field int mCloseEnough>
	//* 218  405:icmple          442
				{
					mScroller.abortAnimation();
	//  219  408:aload_0         
	//  220  409:getfield        #274 <Field Scroller mScroller>
	//  221  412:invokevirtual   #283 <Method void Scroller.abortAnimation()>
					mPopulatePending = false;
	//  222  415:aload_0         
	//  223  416:iconst_0        
	//  224  417:putfield        #305 <Field boolean mPopulatePending>
					populate();
	//  225  420:aload_0         
	//  226  421:invokevirtual   #1066 <Method void populate()>
					mIsBeingDragged = true;
	//  227  424:aload_0         
	//  228  425:iconst_1        
	//  229  426:putfield        #385 <Field boolean mIsBeingDragged>
					requestParentDisallowInterceptTouchEvent(true);
	//  230  429:aload_0         
	//  231  430:iconst_1        
	//  232  431:invokespecial   #1053 <Method void requestParentDisallowInterceptTouchEvent(boolean)>
					setScrollState(1);
	//  233  434:aload_0         
	//  234  435:iconst_1        
	//  235  436:invokevirtual   #724 <Method void setScrollState(int)>
				} else
	//* 236  439:goto            452
				{
					completeScroll(false);
	//  237  442:aload_0         
	//  238  443:iconst_0        
	//  239  444:invokespecial   #529 <Method void completeScroll(boolean)>
					mIsBeingDragged = false;
	//  240  447:aload_0         
	//  241  448:iconst_0        
	//  242  449:putfield        #385 <Field boolean mIsBeingDragged>
				}
			}
			if(mVelocityTracker == null)
	//* 243  452:aload_0         
	//* 244  453:getfield        #389 <Field VelocityTracker mVelocityTracker>
	//* 245  456:ifnonnull       466
				mVelocityTracker = VelocityTracker.obtain();
	//  246  459:aload_0         
	//  247  460:invokestatic    #730 <Method VelocityTracker VelocityTracker.obtain()>
	//  248  463:putfield        #389 <Field VelocityTracker mVelocityTracker>
			mVelocityTracker.addMovement(motionevent);
	//  249  466:aload_0         
	//  250  467:getfield        #389 <Field VelocityTracker mVelocityTracker>
	//  251  470:aload_1         
	//  252  471:invokevirtual   #742 <Method void VelocityTracker.addMovement(MotionEvent)>
			return mIsBeingDragged;
	//  253  474:aload_0         
	//  254  475:getfield        #385 <Field boolean mIsBeingDragged>
	//  255  478:ireturn         
		} else
		{
			resetTouch();
	//  256  479:aload_0         
	//  257  480:invokespecial   #1068 <Method boolean resetTouch()>
	//  258  483:pop             
			return false;
	//  259  484:iconst_0        
	//  260  485:ireturn         
		}
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		int i3 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #370 <Method int getChildCount()>
	//    2    4:istore          14
		int j3 = k - i;
	//    3    6:iload           4
	//    4    8:iload_2         
	//    5    9:isub            
	//    6   10:istore          15
		int k3 = l - j;
	//    7   12:iload           5
	//    8   14:iload_3         
	//    9   15:isub            
	//   10   16:istore          16
		j = getPaddingLeft();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #439 <Method int getPaddingLeft()>
	//   13   22:istore_3        
		i = getPaddingTop();
	//   14   23:aload_0         
	//   15   24:invokevirtual   #843 <Method int getPaddingTop()>
	//   16   27:istore_2        
		int k1 = getPaddingRight();
	//   17   28:aload_0         
	//   18   29:invokevirtual   #442 <Method int getPaddingRight()>
	//   19   32:istore          8
		l = getPaddingBottom();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #846 <Method int getPaddingBottom()>
	//   22   38:istore          5
		int l3 = getScrollX();
	//   23   40:aload_0         
	//   24   41:invokevirtual   #286 <Method int getScrollX()>
	//   25   44:istore          17
		int l1 = 0;
	//   26   46:iconst_0        
	//   27   47:istore          9
		for(int i2 = 0; i2 < i3;)
	//*  28   49:iconst_0        
	//*  29   50:istore          10
	//*  30   52:iload           10
	//*  31   54:iload           14
	//*  32   56:icmpge          402
		{
			View view = getChildAt(i2);
	//   33   59:aload_0         
	//   34   60:iload           10
	//   35   62:invokevirtual   #376 <Method View getChildAt(int)>
	//   36   65:astore          18
			int i1 = j;
	//   37   67:iload_3         
	//   38   68:istore          7
			int l2 = k1;
	//   39   70:iload           8
	//   40   72:istore          13
			int k2 = i;
	//   41   74:iload_2         
	//   42   75:istore          12
			int j2 = l;
	//   43   77:iload           5
	//   44   79:istore          11
			k = l1;
	//   45   81:iload           9
	//   46   83:istore          4
			if(view.getVisibility() != 8)
	//*  47   85:aload           18
	//*  48   87:invokevirtual   #591 <Method int View.getVisibility()>
	//*  49   90:bipush          8
	//*  50   92:icmpeq          375
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   51   95:aload           18
	//   52   97:invokevirtual   #534 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   53  100:checkcast       #20  <Class ViewPager$LayoutParams>
	//   54  103:astore          19
				i1 = j;
	//   55  105:iload_3         
	//   56  106:istore          7
				l2 = k1;
	//   57  108:iload           8
	//   58  110:istore          13
				k2 = i;
	//   59  112:iload_2         
	//   60  113:istore          12
				j2 = l;
	//   61  115:iload           5
	//   62  117:istore          11
				k = l1;
	//   63  119:iload           9
	//   64  121:istore          4
				if(layoutparams.isDecor)
	//*  65  123:aload           19
	//*  66  125:getfield        #537 <Field boolean ViewPager$LayoutParams.isDecor>
	//*  67  128:ifeq            375
				{
					k = layoutparams.gravity & 7;
	//   68  131:aload           19
	//   69  133:getfield        #1073 <Field int ViewPager$LayoutParams.gravity>
	//   70  136:bipush          7
	//   71  138:iand            
	//   72  139:istore          4
					j2 = layoutparams.gravity & 0x70;
	//   73  141:aload           19
	//   74  143:getfield        #1073 <Field int ViewPager$LayoutParams.gravity>
	//   75  146:bipush          112
	//   76  148:iand            
	//   77  149:istore          11
					if(k != 1)
	//*  78  151:iload           4
	//*  79  153:iconst_1        
	//*  80  154:icmpeq          226
					{
						if(k != 3)
	//*  81  157:iload           4
	//*  82  159:iconst_3        
	//*  83  160:icmpeq          207
						{
							if(k != 5)
	//*  84  163:iload           4
	//*  85  165:iconst_5        
	//*  86  166:icmpeq          178
							{
								k = j;
	//   87  169:iload_3         
	//   88  170:istore          4
								i1 = j;
	//   89  172:iload_3         
	//   90  173:istore          7
							} else
	//*  91  175:goto            245
							{
								k = j3 - k1 - view.getMeasuredWidth();
	//   92  178:iload           15
	//   93  180:iload           8
	//   94  182:isub            
	//   95  183:aload           18
	//   96  185:invokevirtual   #1074 <Method int View.getMeasuredWidth()>
	//   97  188:isub            
	//   98  189:istore          4
								k1 += view.getMeasuredWidth();
	//   99  191:iload           8
	//  100  193:aload           18
	//  101  195:invokevirtual   #1074 <Method int View.getMeasuredWidth()>
	//  102  198:iadd            
	//  103  199:istore          8
								i1 = j;
	//  104  201:iload_3         
	//  105  202:istore          7
							}
						} else
	//* 106  204:goto            245
						{
							i1 = view.getMeasuredWidth();
	//  107  207:aload           18
	//  108  209:invokevirtual   #1074 <Method int View.getMeasuredWidth()>
	//  109  212:istore          7
							k = j;
	//  110  214:iload_3         
	//  111  215:istore          4
							i1 += j;
	//  112  217:iload           7
	//  113  219:iload_3         
	//  114  220:iadd            
	//  115  221:istore          7
						}
					} else
	//* 116  223:goto            245
					{
						k = Math.max((j3 - view.getMeasuredWidth()) / 2, j);
	//  117  226:iload           15
	//  118  228:aload           18
	//  119  230:invokevirtual   #1074 <Method int View.getMeasuredWidth()>
	//  120  233:isub            
	//  121  234:iconst_2        
	//  122  235:idiv            
	//  123  236:iload_3         
	//  124  237:invokestatic    #342 <Method int Math.max(int, int)>
	//  125  240:istore          4
						i1 = j;
	//  126  242:iload_3         
	//  127  243:istore          7
					}
					if(j2 != 16)
	//* 128  245:iload           11
	//* 129  247:bipush          16
	//* 130  249:icmpeq          313
					{
						if(j2 != 48)
	//* 131  252:iload           11
	//* 132  254:bipush          48
	//* 133  256:icmpeq          296
						{
							if(j2 != 80)
	//* 134  259:iload           11
	//* 135  261:bipush          80
	//* 136  263:icmpeq          271
							{
								j = i;
	//  137  266:iload_2         
	//  138  267:istore_3        
							} else
	//* 139  268:goto            328
							{
								j = k3 - l - view.getMeasuredHeight();
	//  140  271:iload           16
	//  141  273:iload           5
	//  142  275:isub            
	//  143  276:aload           18
	//  144  278:invokevirtual   #1077 <Method int View.getMeasuredHeight()>
	//  145  281:isub            
	//  146  282:istore_3        
								l += view.getMeasuredHeight();
	//  147  283:iload           5
	//  148  285:aload           18
	//  149  287:invokevirtual   #1077 <Method int View.getMeasuredHeight()>
	//  150  290:iadd            
	//  151  291:istore          5
							}
						} else
	//* 152  293:goto            328
						{
							j2 = view.getMeasuredHeight();
	//  153  296:aload           18
	//  154  298:invokevirtual   #1077 <Method int View.getMeasuredHeight()>
	//  155  301:istore          11
							j = i;
	//  156  303:iload_2         
	//  157  304:istore_3        
							i = j2 + i;
	//  158  305:iload           11
	//  159  307:iload_2         
	//  160  308:iadd            
	//  161  309:istore_2        
						}
					} else
	//* 162  310:goto            328
					{
						j = Math.max((k3 - view.getMeasuredHeight()) / 2, i);
	//  163  313:iload           16
	//  164  315:aload           18
	//  165  317:invokevirtual   #1077 <Method int View.getMeasuredHeight()>
	//  166  320:isub            
	//  167  321:iconst_2        
	//  168  322:idiv            
	//  169  323:iload_2         
	//  170  324:invokestatic    #342 <Method int Math.max(int, int)>
	//  171  327:istore_3        
					}
					k += l3;
	//  172  328:iload           4
	//  173  330:iload           17
	//  174  332:iadd            
	//  175  333:istore          4
					view.layout(k, j, view.getMeasuredWidth() + k, j + view.getMeasuredHeight());
	//  176  335:aload           18
	//  177  337:iload           4
	//  178  339:iload_3         
	//  179  340:aload           18
	//  180  342:invokevirtual   #1074 <Method int View.getMeasuredWidth()>
	//  181  345:iload           4
	//  182  347:iadd            
	//  183  348:iload_3         
	//  184  349:aload           18
	//  185  351:invokevirtual   #1077 <Method int View.getMeasuredHeight()>
	//  186  354:iadd            
	//  187  355:invokevirtual   #1080 <Method void View.layout(int, int, int, int)>
					k = l1 + 1;
	//  188  358:iload           9
	//  189  360:iconst_1        
	//  190  361:iadd            
	//  191  362:istore          4
					j2 = l;
	//  192  364:iload           5
	//  193  366:istore          11
					k2 = i;
	//  194  368:iload_2         
	//  195  369:istore          12
					l2 = k1;
	//  196  371:iload           8
	//  197  373:istore          13
				}
			}
			i2++;
	//  198  375:iload           10
	//  199  377:iconst_1        
	//  200  378:iadd            
	//  201  379:istore          10
			j = i1;
	//  202  381:iload           7
	//  203  383:istore_3        
			k1 = l2;
	//  204  384:iload           13
	//  205  386:istore          8
			i = k2;
	//  206  388:iload           12
	//  207  390:istore_2        
			l = j2;
	//  208  391:iload           11
	//  209  393:istore          5
			l1 = k;
	//  210  395:iload           4
	//  211  397:istore          9
		}

	//* 212  399:goto            52
		for(k = 0; k < i3; k++)
	//* 213  402:iconst_0        
	//* 214  403:istore          4
	//* 215  405:iload           4
	//* 216  407:iload           14
	//* 217  409:icmpge          563
		{
			View view1 = getChildAt(k);
	//  218  412:aload_0         
	//  219  413:iload           4
	//  220  415:invokevirtual   #376 <Method View getChildAt(int)>
	//  221  418:astore          18
			if(view1.getVisibility() == 8)
				continue;
	//  222  420:aload           18
	//  223  422:invokevirtual   #591 <Method int View.getVisibility()>
	//  224  425:bipush          8
	//  225  427:icmpeq          554
			LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  226  430:aload           18
	//  227  432:invokevirtual   #534 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  228  435:checkcast       #20  <Class ViewPager$LayoutParams>
	//  229  438:astore          19
			if(layoutparams1.isDecor)
				continue;
	//  230  440:aload           19
	//  231  442:getfield        #537 <Field boolean ViewPager$LayoutParams.isDecor>
	//  232  445:ifne            554
			ItemInfo iteminfo = infoForChild(view1);
	//  233  448:aload_0         
	//  234  449:aload           18
	//  235  451:invokevirtual   #595 <Method ViewPager$ItemInfo infoForChild(View)>
	//  236  454:astore          20
			if(iteminfo == null)
				continue;
	//  237  456:aload           20
	//  238  458:ifnull          554
			float f = j3 - j - k1;
	//  239  461:iload           15
	//  240  463:iload_3         
	//  241  464:isub            
	//  242  465:iload           8
	//  243  467:isub            
	//  244  468:i2f             
	//  245  469:fstore          6
			int j1 = (int)(iteminfo.offset * f) + j;
	//  246  471:aload           20
	//  247  473:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//  248  476:fload           6
	//  249  478:fmul            
	//  250  479:f2i             
	//  251  480:iload_3         
	//  252  481:iadd            
	//  253  482:istore          7
			if(layoutparams1.needsMeasure)
	//* 254  484:aload           19
	//* 255  486:getfield        #653 <Field boolean ViewPager$LayoutParams.needsMeasure>
	//* 256  489:ifeq            531
			{
				layoutparams1.needsMeasure = false;
	//  257  492:aload           19
	//  258  494:iconst_0        
	//  259  495:putfield        #653 <Field boolean ViewPager$LayoutParams.needsMeasure>
				view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(f * layoutparams1.widthFactor), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k3 - i - l, 0x40000000));
	//  260  498:aload           18
	//  261  500:fload           6
	//  262  502:aload           19
	//  263  504:getfield        #791 <Field float ViewPager$LayoutParams.widthFactor>
	//  264  507:fmul            
	//  265  508:f2i             
	//  266  509:ldc2            #1081 <Int 0x40000000>
	//  267  512:invokestatic    #1086 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  268  515:iload           16
	//  269  517:iload_2         
	//  270  518:isub            
	//  271  519:iload           5
	//  272  521:isub            
	//  273  522:ldc2            #1081 <Int 0x40000000>
	//  274  525:invokestatic    #1086 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  275  528:invokevirtual   #1089 <Method void View.measure(int, int)>
			}
			view1.layout(j1, i, view1.getMeasuredWidth() + j1, view1.getMeasuredHeight() + i);
	//  276  531:aload           18
	//  277  533:iload           7
	//  278  535:iload_2         
	//  279  536:aload           18
	//  280  538:invokevirtual   #1074 <Method int View.getMeasuredWidth()>
	//  281  541:iload           7
	//  282  543:iadd            
	//  283  544:aload           18
	//  284  546:invokevirtual   #1077 <Method int View.getMeasuredHeight()>
	//  285  549:iload_2         
	//  286  550:iadd            
	//  287  551:invokevirtual   #1080 <Method void View.layout(int, int, int, int)>
		}

	//  288  554:iload           4
	//  289  556:iconst_1        
	//  290  557:iadd            
	//  291  558:istore          4
	//* 292  560:goto            405
		mTopPageBounds = i;
	//  293  563:aload_0         
	//  294  564:iload_2         
	//  295  565:putfield        #1028 <Field int mTopPageBounds>
		mBottomPageBounds = k3 - l;
	//  296  568:aload_0         
	//  297  569:iload           16
	//  298  571:iload           5
	//  299  573:isub            
	//  300  574:putfield        #1030 <Field int mBottomPageBounds>
		mDecorChildCount = l1;
	//  301  577:aload_0         
	//  302  578:iload           9
	//  303  580:putfield        #1091 <Field int mDecorChildCount>
		if(mFirstLayout)
	//* 304  583:aload_0         
	//* 305  584:getfield        #215 <Field boolean mFirstLayout>
	//* 306  587:ifeq            604
			scrollToItem(mCurItem, false, 0, false);
	//  307  590:aload_0         
	//  308  591:aload_0         
	//  309  592:getfield        #333 <Field int mCurItem>
	//  310  595:iconst_0        
	//  311  596:iconst_0        
	//  312  597:iconst_0        
	//  313  598:invokespecial   #1093 <Method void scrollToItem(int, boolean, int, boolean)>
	//* 314  601:goto            604
		mFirstLayout = false;
	//  315  604:aload_0         
	//  316  605:iconst_0        
	//  317  606:putfield        #215 <Field boolean mFirstLayout>
	//  318  609:return          
	}

	protected void onMeasure(int i, int j)
	{
		setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, j));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iload_1         
	//    3    3:invokestatic    #1097 <Method int getDefaultSize(int, int)>
	//    4    6:iconst_0        
	//    5    7:iload_2         
	//    6    8:invokestatic    #1097 <Method int getDefaultSize(int, int)>
	//    7   11:invokevirtual   #1100 <Method void setMeasuredDimension(int, int)>
		i = getMeasuredWidth();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #436 <Method int getMeasuredWidth()>
	//   10   18:istore_1        
		mGutterSize = Math.min(i / 10, mDefaultGutterSize);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:bipush          10
	//   14   23:idiv            
	//   15   24:aload_0         
	//   16   25:getfield        #990 <Field int mDefaultGutterSize>
	//   17   28:invokestatic    #339 <Method int Math.min(int, int)>
	//   18   31:putfield        #462 <Field int mGutterSize>
		int k = getPaddingLeft();
	//   19   34:aload_0         
	//   20   35:invokevirtual   #439 <Method int getPaddingLeft()>
	//   21   38:istore_3        
		int j1 = getPaddingRight();
	//   22   39:aload_0         
	//   23   40:invokevirtual   #442 <Method int getPaddingRight()>
	//   24   43:istore          4
		j = getMeasuredHeight();
	//   25   45:aload_0         
	//   26   46:invokevirtual   #1101 <Method int getMeasuredHeight()>
	//   27   49:istore_2        
		int l1 = getPaddingTop();
	//   28   50:aload_0         
	//   29   51:invokevirtual   #843 <Method int getPaddingTop()>
	//   30   54:istore          5
		int i2 = getPaddingBottom();
	//   31   56:aload_0         
	//   32   57:invokevirtual   #846 <Method int getPaddingBottom()>
	//   33   60:istore          6
		int i3 = getChildCount();
	//   34   62:aload_0         
	//   35   63:invokevirtual   #370 <Method int getChildCount()>
	//   36   66:istore          11
		j = j - l1 - i2;
	//   37   68:iload_2         
	//   38   69:iload           5
	//   39   71:isub            
	//   40   72:iload           6
	//   41   74:isub            
	//   42   75:istore_2        
		i = i - k - j1;
	//   43   76:iload_1         
	//   44   77:iload_3         
	//   45   78:isub            
	//   46   79:iload           4
	//   47   81:isub            
	//   48   82:istore_1        
		l1 = 0;
	//   49   83:iconst_0        
	//   50   84:istore          5
		do
		{
			int j2 = 1;
	//   51   86:iconst_1        
	//   52   87:istore          8
			int l2 = 0x40000000;
	//   53   89:ldc2            #1081 <Int 0x40000000>
	//   54   92:istore          10
			if(l1 >= i3)
				break;
	//   55   94:iload           5
	//   56   96:iload           11
	//   57   98:icmpge          429
			View view = getChildAt(l1);
	//   58  101:aload_0         
	//   59  102:iload           5
	//   60  104:invokevirtual   #376 <Method View getChildAt(int)>
	//   61  107:astore          12
			int l = i;
	//   62  109:iload_1         
	//   63  110:istore_3        
			int k1 = j;
	//   64  111:iload_2         
	//   65  112:istore          4
			if(view.getVisibility() != 8)
	//*  66  114:aload           12
	//*  67  116:invokevirtual   #591 <Method int View.getVisibility()>
	//*  68  119:bipush          8
	//*  69  121:icmpeq          415
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   70  124:aload           12
	//   71  126:invokevirtual   #534 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   72  129:checkcast       #20  <Class ViewPager$LayoutParams>
	//   73  132:astore          13
				l = i;
	//   74  134:iload_1         
	//   75  135:istore_3        
				k1 = j;
	//   76  136:iload_2         
	//   77  137:istore          4
				if(layoutparams != null)
	//*  78  139:aload           13
	//*  79  141:ifnull          415
				{
					l = i;
	//   80  144:iload_1         
	//   81  145:istore_3        
					k1 = j;
	//   82  146:iload_2         
	//   83  147:istore          4
					if(layoutparams.isDecor)
	//*  84  149:aload           13
	//*  85  151:getfield        #537 <Field boolean ViewPager$LayoutParams.isDecor>
	//*  86  154:ifeq            415
					{
						l = layoutparams.gravity & 7;
	//   87  157:aload           13
	//   88  159:getfield        #1073 <Field int ViewPager$LayoutParams.gravity>
	//   89  162:bipush          7
	//   90  164:iand            
	//   91  165:istore_3        
						k1 = layoutparams.gravity & 0x70;
	//   92  166:aload           13
	//   93  168:getfield        #1073 <Field int ViewPager$LayoutParams.gravity>
	//   94  171:bipush          112
	//   95  173:iand            
	//   96  174:istore          4
						boolean flag1;
						if(k1 != 48 && k1 != 80)
	//*  97  176:iload           4
	//*  98  178:bipush          48
	//*  99  180:icmpeq          199
	//* 100  183:iload           4
	//* 101  185:bipush          80
	//* 102  187:icmpne          193
	//* 103  190:goto            199
							flag1 = false;
	//  104  193:iconst_0        
	//  105  194:istore          7
						else
	//* 106  196:goto            202
							flag1 = true;
	//  107  199:iconst_1        
	//  108  200:istore          7
						boolean flag = ((boolean) (j2));
	//  109  202:iload           8
	//  110  204:istore          6
						if(l != 3)
	//* 111  206:iload_3         
	//* 112  207:iconst_3        
	//* 113  208:icmpeq          226
							if(l == 5)
	//* 114  211:iload_3         
	//* 115  212:iconst_5        
	//* 116  213:icmpne          223
								flag = ((boolean) (j2));
	//  117  216:iload           8
	//  118  218:istore          6
							else
	//* 119  220:goto            226
								flag = false;
	//  120  223:iconst_0        
	//  121  224:istore          6
						k1 = 0x80000000;
	//  122  226:ldc2            #1102 <Int 0x80000000>
	//  123  229:istore          4
						if(flag1)
	//* 124  231:iload           7
	//* 125  233:ifeq            248
						{
							l = 0x80000000;
	//  126  236:ldc2            #1102 <Int 0x80000000>
	//  127  239:istore_3        
							k1 = 0x40000000;
	//  128  240:ldc2            #1081 <Int 0x40000000>
	//  129  243:istore          4
						} else
	//* 130  245:goto            264
						if(flag)
	//* 131  248:iload           6
	//* 132  250:ifeq            260
							l = 0x40000000;
	//  133  253:ldc2            #1081 <Int 0x40000000>
	//  134  256:istore_3        
						else
	//* 135  257:goto            264
							l = 0x80000000;
	//  136  260:ldc2            #1102 <Int 0x80000000>
	//  137  263:istore_3        
						int k2;
						if(layoutparams.width != -2)
	//* 138  264:aload           13
	//* 139  266:getfield        #1105 <Field int ViewPager$LayoutParams.width>
	//* 140  269:bipush          -2
	//* 141  271:icmpeq          308
						{
							if(layoutparams.width != -1)
	//* 142  274:aload           13
	//* 143  276:getfield        #1105 <Field int ViewPager$LayoutParams.width>
	//* 144  279:iconst_m1       
	//* 145  280:icmpeq          293
								k1 = layoutparams.width;
	//  146  283:aload           13
	//  147  285:getfield        #1105 <Field int ViewPager$LayoutParams.width>
	//  148  288:istore          4
							else
	//* 149  290:goto            296
								k1 = i;
	//  150  293:iload_1         
	//  151  294:istore          4
							j2 = 0x40000000;
	//  152  296:ldc2            #1081 <Int 0x40000000>
	//  153  299:istore          8
							k2 = k1;
	//  154  301:iload           4
	//  155  303:istore          9
						} else
	//* 156  305:goto            315
						{
							k2 = i;
	//  157  308:iload_1         
	//  158  309:istore          9
							j2 = k1;
	//  159  311:iload           4
	//  160  313:istore          8
						}
						if(layoutparams.height != -2)
	//* 161  315:aload           13
	//* 162  317:getfield        #1108 <Field int ViewPager$LayoutParams.height>
	//* 163  320:bipush          -2
	//* 164  322:icmpeq          348
						{
							if(layoutparams.height != -1)
	//* 165  325:aload           13
	//* 166  327:getfield        #1108 <Field int ViewPager$LayoutParams.height>
	//* 167  330:iconst_m1       
	//* 168  331:icmpeq          343
								l = layoutparams.height;
	//  169  334:aload           13
	//  170  336:getfield        #1108 <Field int ViewPager$LayoutParams.height>
	//  171  339:istore_3        
							else
	//* 172  340:goto            357
								l = j;
	//  173  343:iload_2         
	//  174  344:istore_3        
						} else
	//* 175  345:goto            357
						{
							k1 = j;
	//  176  348:iload_2         
	//  177  349:istore          4
							l2 = l;
	//  178  351:iload_3         
	//  179  352:istore          10
							l = k1;
	//  180  354:iload           4
	//  181  356:istore_3        
						}
						view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k2, j2), android.view.View.MeasureSpec.makeMeasureSpec(l, l2));
	//  182  357:aload           12
	//  183  359:iload           9
	//  184  361:iload           8
	//  185  363:invokestatic    #1086 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  186  366:iload_3         
	//  187  367:iload           10
	//  188  369:invokestatic    #1086 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  189  372:invokevirtual   #1089 <Method void View.measure(int, int)>
						if(flag1)
	//* 190  375:iload           7
	//* 191  377:ifeq            394
						{
							k1 = j - view.getMeasuredHeight();
	//  192  380:iload_2         
	//  193  381:aload           12
	//  194  383:invokevirtual   #1077 <Method int View.getMeasuredHeight()>
	//  195  386:isub            
	//  196  387:istore          4
							l = i;
	//  197  389:iload_1         
	//  198  390:istore_3        
						} else
	//* 199  391:goto            415
						{
							l = i;
	//  200  394:iload_1         
	//  201  395:istore_3        
							k1 = j;
	//  202  396:iload_2         
	//  203  397:istore          4
							if(flag)
	//* 204  399:iload           6
	//* 205  401:ifeq            415
							{
								l = i - view.getMeasuredWidth();
	//  206  404:iload_1         
	//  207  405:aload           12
	//  208  407:invokevirtual   #1074 <Method int View.getMeasuredWidth()>
	//  209  410:isub            
	//  210  411:istore_3        
								k1 = j;
	//  211  412:iload_2         
	//  212  413:istore          4
							}
						}
					}
				}
			}
			l1++;
	//  213  415:iload           5
	//  214  417:iconst_1        
	//  215  418:iadd            
	//  216  419:istore          5
			i = l;
	//  217  421:iload_3         
	//  218  422:istore_1        
			j = k1;
	//  219  423:iload           4
	//  220  425:istore_2        
		} while(true);
	//  221  426:goto            86
		mChildWidthMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
	//  222  429:aload_0         
	//  223  430:iload_1         
	//  224  431:ldc2            #1081 <Int 0x40000000>
	//  225  434:invokestatic    #1086 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  226  437:putfield        #1110 <Field int mChildWidthMeasureSpec>
		mChildHeightMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
	//  227  440:aload_0         
	//  228  441:iload_2         
	//  229  442:ldc2            #1081 <Int 0x40000000>
	//  230  445:invokestatic    #1086 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  231  448:putfield        #1112 <Field int mChildHeightMeasureSpec>
		mInLayout = true;
	//  232  451:aload_0         
	//  233  452:iconst_1        
	//  234  453:putfield        #648 <Field boolean mInLayout>
		populate();
	//  235  456:aload_0         
	//  236  457:invokevirtual   #1066 <Method void populate()>
		j = 0;
	//  237  460:iconst_0        
	//  238  461:istore_2        
		mInLayout = false;
	//  239  462:aload_0         
	//  240  463:iconst_0        
	//  241  464:putfield        #648 <Field boolean mInLayout>
		for(int i1 = getChildCount(); j < i1; j++)
	//* 242  467:aload_0         
	//* 243  468:invokevirtual   #370 <Method int getChildCount()>
	//* 244  471:istore_3        
	//* 245  472:iload_2         
	//* 246  473:iload_3         
	//* 247  474:icmpge          548
		{
			View view1 = getChildAt(j);
	//  248  477:aload_0         
	//  249  478:iload_2         
	//  250  479:invokevirtual   #376 <Method View getChildAt(int)>
	//  251  482:astore          12
			if(view1.getVisibility() == 8)
				continue;
	//  252  484:aload           12
	//  253  486:invokevirtual   #591 <Method int View.getVisibility()>
	//  254  489:bipush          8
	//  255  491:icmpeq          541
			LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  256  494:aload           12
	//  257  496:invokevirtual   #534 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  258  499:checkcast       #20  <Class ViewPager$LayoutParams>
	//  259  502:astore          13
			if(layoutparams1 == null || !layoutparams1.isDecor)
	//* 260  504:aload           13
	//* 261  506:ifnull          517
	//* 262  509:aload           13
	//* 263  511:getfield        #537 <Field boolean ViewPager$LayoutParams.isDecor>
	//* 264  514:ifne            541
				view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)((float)i * layoutparams1.widthFactor), 0x40000000), mChildHeightMeasureSpec);
	//  265  517:aload           12
	//  266  519:iload_1         
	//  267  520:i2f             
	//  268  521:aload           13
	//  269  523:getfield        #791 <Field float ViewPager$LayoutParams.widthFactor>
	//  270  526:fmul            
	//  271  527:f2i             
	//  272  528:ldc2            #1081 <Int 0x40000000>
	//  273  531:invokestatic    #1086 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  274  534:aload_0         
	//  275  535:getfield        #1112 <Field int mChildHeightMeasureSpec>
	//  276  538:invokevirtual   #1089 <Method void View.measure(int, int)>
		}

	//  277  541:iload_2         
	//  278  542:iconst_1        
	//  279  543:iadd            
	//  280  544:istore_2        
	//* 281  545:goto            472
	//  282  548:return          
	}

	protected void onPageScrolled(int i, float f, int j)
	{
		int k = mDecorChildCount;
	//    0    0:aload_0         
	//    1    1:getfield        #1091 <Field int mDecorChildCount>
	//    2    4:istore          4
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          9
		if(k > 0)
	//*   5    9:iload           4
	//*   6   11:ifle            224
		{
			int k2 = getScrollX();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #286 <Method int getScrollX()>
	//    9   18:istore          10
			int l = getPaddingLeft();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #439 <Method int getPaddingLeft()>
	//   12   24:istore          4
			int j1 = getPaddingRight();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #442 <Method int getPaddingRight()>
	//   15   30:istore          5
			int l2 = getWidth();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #465 <Method int getWidth()>
	//   18   36:istore          11
			int i3 = getChildCount();
	//   19   38:aload_0         
	//   20   39:invokevirtual   #370 <Method int getChildCount()>
	//   21   42:istore          12
			for(int l1 = 0; l1 < i3; l1++)
	//*  22   44:iconst_0        
	//*  23   45:istore          7
	//*  24   47:iload           7
	//*  25   49:iload           12
	//*  26   51:icmpge          224
			{
				View view = getChildAt(l1);
	//   27   54:aload_0         
	//   28   55:iload           7
	//   29   57:invokevirtual   #376 <Method View getChildAt(int)>
	//   30   60:astore          13
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   31   62:aload           13
	//   32   64:invokevirtual   #534 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   33   67:checkcast       #20  <Class ViewPager$LayoutParams>
	//   34   70:astore          14
				if(!layoutparams.isDecor)
	//*  35   72:aload           14
	//*  36   74:getfield        #537 <Field boolean ViewPager$LayoutParams.isDecor>
	//*  37   77:ifne            83
					continue;
	//   38   80:goto            215
				int k1 = layoutparams.gravity & 7;
	//   39   83:aload           14
	//   40   85:getfield        #1073 <Field int ViewPager$LayoutParams.gravity>
	//   41   88:bipush          7
	//   42   90:iand            
	//   43   91:istore          6
				if(k1 != 1)
	//*  44   93:iload           6
	//*  45   95:iconst_1        
	//*  46   96:icmpeq          173
				{
					if(k1 != 3)
	//*  47   99:iload           6
	//*  48  101:iconst_3        
	//*  49  102:icmpeq          152
					{
						if(k1 != 5)
	//*  50  105:iload           6
	//*  51  107:iconst_5        
	//*  52  108:icmpeq          126
						{
							int i2 = l;
	//   53  111:iload           4
	//   54  113:istore          8
							k1 = l;
	//   55  115:iload           4
	//   56  117:istore          6
							l = i2;
	//   57  119:iload           8
	//   58  121:istore          4
						} else
	//*  59  123:goto            190
						{
							k1 = l2 - j1 - view.getMeasuredWidth();
	//   60  126:iload           11
	//   61  128:iload           5
	//   62  130:isub            
	//   63  131:aload           13
	//   64  133:invokevirtual   #1074 <Method int View.getMeasuredWidth()>
	//   65  136:isub            
	//   66  137:istore          6
							j1 += view.getMeasuredWidth();
	//   67  139:iload           5
	//   68  141:aload           13
	//   69  143:invokevirtual   #1074 <Method int View.getMeasuredWidth()>
	//   70  146:iadd            
	//   71  147:istore          5
						}
					} else
	//*  72  149:goto            190
					{
						int j2 = view.getWidth() + l;
	//   73  152:aload           13
	//   74  154:invokevirtual   #1114 <Method int View.getWidth()>
	//   75  157:iload           4
	//   76  159:iadd            
	//   77  160:istore          8
						k1 = l;
	//   78  162:iload           4
	//   79  164:istore          6
						l = j2;
	//   80  166:iload           8
	//   81  168:istore          4
					}
				} else
	//*  82  170:goto            190
				{
					k1 = Math.max((l2 - view.getMeasuredWidth()) / 2, l);
	//   83  173:iload           11
	//   84  175:aload           13
	//   85  177:invokevirtual   #1074 <Method int View.getMeasuredWidth()>
	//   86  180:isub            
	//   87  181:iconst_2        
	//   88  182:idiv            
	//   89  183:iload           4
	//   90  185:invokestatic    #342 <Method int Math.max(int, int)>
	//   91  188:istore          6
				}
				k1 = (k1 + k2) - view.getLeft();
	//   92  190:iload           6
	//   93  192:iload           10
	//   94  194:iadd            
	//   95  195:aload           13
	//   96  197:invokevirtual   #403 <Method int View.getLeft()>
	//   97  200:isub            
	//   98  201:istore          6
				if(k1 != 0)
	//*  99  203:iload           6
	//* 100  205:ifeq            215
					view.offsetLeftAndRight(k1);
	//  101  208:aload           13
	//  102  210:iload           6
	//  103  212:invokevirtual   #1117 <Method void View.offsetLeftAndRight(int)>
			}

	//  104  215:iload           7
	//  105  217:iconst_1        
	//  106  218:iadd            
	//  107  219:istore          7
		}
	//* 108  221:goto            47
		dispatchOnPageScrolled(i, f, j);
	//  109  224:aload_0         
	//  110  225:iload_1         
	//  111  226:fload_2         
	//  112  227:iload_3         
	//  113  228:invokespecial   #1119 <Method void dispatchOnPageScrolled(int, float, int)>
		if(mPageTransformer != null)
	//* 114  231:aload_0         
	//* 115  232:getfield        #1121 <Field ViewPager$PageTransformer mPageTransformer>
	//* 116  235:ifnull          316
		{
			j = getScrollX();
	//  117  238:aload_0         
	//  118  239:invokevirtual   #286 <Method int getScrollX()>
	//  119  242:istore_3        
			int i1 = getChildCount();
	//  120  243:aload_0         
	//  121  244:invokevirtual   #370 <Method int getChildCount()>
	//  122  247:istore          4
			for(i = ((int) (flag)); i < i1; i++)
	//* 123  249:iload           9
	//* 124  251:istore_1        
	//* 125  252:iload_1         
	//* 126  253:iload           4
	//* 127  255:icmpge          316
			{
				View view1 = getChildAt(i);
	//  128  258:aload_0         
	//  129  259:iload_1         
	//  130  260:invokevirtual   #376 <Method View getChildAt(int)>
	//  131  263:astore          13
				if(!((LayoutParams)view1.getLayoutParams()).isDecor)
	//* 132  265:aload           13
	//* 133  267:invokevirtual   #534 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 134  270:checkcast       #20  <Class ViewPager$LayoutParams>
	//* 135  273:getfield        #537 <Field boolean ViewPager$LayoutParams.isDecor>
	//* 136  276:ifeq            282
	//* 137  279:goto            309
				{
					f = (float)(view1.getLeft() - j) / (float)getClientWidth();
	//  138  282:aload           13
	//  139  284:invokevirtual   #403 <Method int View.getLeft()>
	//  140  287:iload_3         
	//  141  288:isub            
	//  142  289:i2f             
	//  143  290:aload_0         
	//  144  291:invokespecial   #245 <Method int getClientWidth()>
	//  145  294:i2f             
	//  146  295:fdiv            
	//  147  296:fstore_2        
					mPageTransformer.transformPage(view1, f);
	//  148  297:aload_0         
	//  149  298:getfield        #1121 <Field ViewPager$PageTransformer mPageTransformer>
	//  150  301:aload           13
	//  151  303:fload_2         
	//  152  304:invokeinterface #1125 <Method void ViewPager$PageTransformer.transformPage(View, float)>
				}
			}

	//  153  309:iload_1         
	//  154  310:iconst_1        
	//  155  311:iadd            
	//  156  312:istore_1        
		}
	//* 157  313:goto            252
		mCalledSuper = true;
	//  158  316:aload_0         
	//  159  317:iconst_1        
	//  160  318:putfield        #485 <Field boolean mCalledSuper>
	//  161  321:return          
	}

	protected boolean onRequestFocusInDescendants(int i, Rect rect)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #370 <Method int getChildCount()>
	//    2    4:istore_3        
		int k = -1;
	//    3    5:iconst_m1       
	//    4    6:istore          5
		byte byte0;
		if((i & 2) != 0)
	//*   5    8:iload_1         
	//*   6    9:iconst_2        
	//*   7   10:iand            
	//*   8   11:ifeq            25
		{
			k = j;
	//    9   14:iload_3         
	//   10   15:istore          5
			j = 0;
	//   11   17:iconst_0        
	//   12   18:istore_3        
			byte0 = 1;
	//   13   19:iconst_1        
	//   14   20:istore          4
		} else
	//*  15   22:goto            32
		{
			j--;
	//   16   25:iload_3         
	//   17   26:iconst_1        
	//   18   27:isub            
	//   19   28:istore_3        
			byte0 = -1;
	//   20   29:iconst_m1       
	//   21   30:istore          4
		}
		for(; j != k; j += ((int) (byte0)))
	//*  22   32:iload_3         
	//*  23   33:iload           5
	//*  24   35:icmpeq          98
		{
			View view = getChildAt(j);
	//   25   38:aload_0         
	//   26   39:iload_3         
	//   27   40:invokevirtual   #376 <Method View getChildAt(int)>
	//   28   43:astore          6
			if(view.getVisibility() != 0)
				continue;
	//   29   45:aload           6
	//   30   47:invokevirtual   #591 <Method int View.getVisibility()>
	//   31   50:ifne            90
			ItemInfo iteminfo = infoForChild(view);
	//   32   53:aload_0         
	//   33   54:aload           6
	//   34   56:invokevirtual   #595 <Method ViewPager$ItemInfo infoForChild(View)>
	//   35   59:astore          7
			if(iteminfo != null && iteminfo.position == mCurItem && view.requestFocus(i, rect))
	//*  36   61:aload           7
	//*  37   63:ifnull          90
	//*  38   66:aload           7
	//*  39   68:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//*  40   71:aload_0         
	//*  41   72:getfield        #333 <Field int mCurItem>
	//*  42   75:icmpne          90
	//*  43   78:aload           6
	//*  44   80:iload_1         
	//*  45   81:aload_2         
	//*  46   82:invokevirtual   #1129 <Method boolean View.requestFocus(int, Rect)>
	//*  47   85:ifeq            90
				return true;
	//   48   88:iconst_1        
	//   49   89:ireturn         
		}

	//   50   90:iload_3         
	//   51   91:iload           4
	//   52   93:iadd            
	//   53   94:istore_3        
	//*  54   95:goto            32
		return false;
	//   55   98:iconst_0        
	//   56   99:ireturn         
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
	//*  15   27:getfield        #236 <Field PagerAdapter mAdapter>
	//*  16   30:ifnull          59
		{
			mAdapter.restoreState(((SavedState) (parcelable)).adapterState, ((SavedState) (parcelable)).loader);
	//   17   33:aload_0         
	//   18   34:getfield        #236 <Field PagerAdapter mAdapter>
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
	//   29   55:invokevirtual   #795 <Method void setCurrentItemInternal(int, boolean, boolean)>
			return;
	//   30   58:return          
		} else
		{
			mRestoredCurItem = ((SavedState) (parcelable)).position;
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:getfield        #1148 <Field int ViewPager$SavedState.position>
	//   34   64:putfield        #199 <Field int mRestoredCurItem>
			mRestoredAdapterState = ((SavedState) (parcelable)).adapterState;
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:getfield        #1140 <Field Parcelable ViewPager$SavedState.adapterState>
	//   38   72:putfield        #201 <Field Parcelable mRestoredAdapterState>
			mRestoredClassLoader = ((SavedState) (parcelable)).loader;
	//   39   75:aload_0         
	//   40   76:aload_1         
	//   41   77:getfield        #1143 <Field ClassLoader ViewPager$SavedState.loader>
	//   42   80:putfield        #203 <Field ClassLoader mRestoredClassLoader>
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
	//    8   14:getfield        #333 <Field int mCurItem>
	//    9   17:putfield        #1148 <Field int ViewPager$SavedState.position>
		if(mAdapter != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #236 <Field PagerAdapter mAdapter>
	//*  12   24:ifnull          38
			savedstate.adapterState = mAdapter.saveState();
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #236 <Field PagerAdapter mAdapter>
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
	//   13   18:getfield        #247 <Field int mPageMargin>
	//   14   21:aload_0         
	//   15   22:getfield        #247 <Field int mPageMargin>
	//   16   25:invokespecial   #1161 <Method void recomputeScrollPosition(int, int, int, int)>
	//   17   28:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(mFakeDragging)
	//*   0    0:aload_0         
	//*   1    1:getfield        #721 <Field boolean mFakeDragging>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		int i = motionevent.getAction();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #1037 <Method int MotionEvent.getAction()>
	//    7   13:istore          6
		boolean flag = false;
	//    8   15:iconst_0        
	//    9   16:istore          9
		if(i == 0 && motionevent.getEdgeFlags() != 0)
	//*  10   18:iload           6
	//*  11   20:ifne            32
	//*  12   23:aload_1         
	//*  13   24:invokevirtual   #1165 <Method int MotionEvent.getEdgeFlags()>
	//*  14   27:ifeq            32
			return false;
	//   15   30:iconst_0        
	//   16   31:ireturn         
		if(mAdapter != null)
	//*  17   32:aload_0         
	//*  18   33:getfield        #236 <Field PagerAdapter mAdapter>
	//*  19   36:ifnull          615
		{
			if(mAdapter.getCount() == 0)
	//*  20   39:aload_0         
	//*  21   40:getfield        #236 <Field PagerAdapter mAdapter>
	//*  22   43:invokevirtual   #242 <Method int PagerAdapter.getCount()>
	//*  23   46:ifne            51
				return false;
	//   24   49:iconst_0        
	//   25   50:ireturn         
			if(mVelocityTracker == null)
	//*  26   51:aload_0         
	//*  27   52:getfield        #389 <Field VelocityTracker mVelocityTracker>
	//*  28   55:ifnonnull       65
				mVelocityTracker = VelocityTracker.obtain();
	//   29   58:aload_0         
	//   30   59:invokestatic    #730 <Method VelocityTracker VelocityTracker.obtain()>
	//   31   62:putfield        #389 <Field VelocityTracker mVelocityTracker>
			mVelocityTracker.addMovement(motionevent);
	//   32   65:aload_0         
	//   33   66:getfield        #389 <Field VelocityTracker mVelocityTracker>
	//   34   69:aload_1         
	//   35   70:invokevirtual   #742 <Method void VelocityTracker.addMovement(MotionEvent)>
			switch(motionevent.getAction() & 0xff)
	//*  36   73:aload_1         
	//*  37   74:invokevirtual   #1037 <Method int MotionEvent.getAction()>
	//*  38   77:sipush          255
	//*  39   80:iand            
			{
			case 4: // '\004'
			default:
				break;

	//*  40   81:tableswitch     0 6: default 124
	//	               0 549
	//	               1 409
	//	               2 207
	//	               3 180
	//	               4 124
	//	               5 151
	//	               6 127
	//*  41  124:goto            604
			case 6: // '\006'
				onSecondaryPointerUp(motionevent);
	//   42  127:aload_0         
	//   43  128:aload_1         
	//   44  129:invokespecial   #1039 <Method void onSecondaryPointerUp(MotionEvent)>
				mLastMotionX = motionevent.getX(motionevent.findPointerIndex(mActivePointerId));
	//   45  132:aload_0         
	//   46  133:aload_1         
	//   47  134:aload_1         
	//   48  135:aload_0         
	//   49  136:getfield        #213 <Field int mActivePointerId>
	//   50  139:invokevirtual   #1042 <Method int MotionEvent.findPointerIndex(int)>
	//   51  142:invokevirtual   #478 <Method float MotionEvent.getX(int)>
	//   52  145:putfield        #480 <Field float mLastMotionX>
				break;
	//   53  148:goto            604

			case 5: // '\005'
				int j = motionevent.getActionIndex();
	//   54  151:aload_1         
	//   55  152:invokevirtual   #472 <Method int MotionEvent.getActionIndex()>
	//   56  155:istore          6
				mLastMotionX = motionevent.getX(j);
	//   57  157:aload_0         
	//   58  158:aload_1         
	//   59  159:iload           6
	//   60  161:invokevirtual   #478 <Method float MotionEvent.getX(int)>
	//   61  164:putfield        #480 <Field float mLastMotionX>
				mActivePointerId = motionevent.getPointerId(j);
	//   62  167:aload_0         
	//   63  168:aload_1         
	//   64  169:iload           6
	//   65  171:invokevirtual   #475 <Method int MotionEvent.getPointerId(int)>
	//   66  174:putfield        #213 <Field int mActivePointerId>
				break;
	//   67  177:goto            604

			case 3: // '\003'
				if(mIsBeingDragged)
	//*  68  180:aload_0         
	//*  69  181:getfield        #385 <Field boolean mIsBeingDragged>
	//*  70  184:ifeq            604
				{
					scrollToItem(mCurItem, true, 0, false);
	//   71  187:aload_0         
	//   72  188:aload_0         
	//   73  189:getfield        #333 <Field int mCurItem>
	//   74  192:iconst_1        
	//   75  193:iconst_0        
	//   76  194:iconst_0        
	//   77  195:invokespecial   #1093 <Method void scrollToItem(int, boolean, int, boolean)>
					flag = resetTouch();
	//   78  198:aload_0         
	//   79  199:invokespecial   #1068 <Method boolean resetTouch()>
	//   80  202:istore          9
				}
				break;
	//   81  204:goto            604

			case 2: // '\002'
				if(!mIsBeingDragged)
	//*  82  207:aload_0         
	//*  83  208:getfield        #385 <Field boolean mIsBeingDragged>
	//*  84  211:ifne            379
				{
					int k = motionevent.findPointerIndex(mActivePointerId);
	//   85  214:aload_1         
	//   86  215:aload_0         
	//   87  216:getfield        #213 <Field int mActivePointerId>
	//   88  219:invokevirtual   #1042 <Method int MotionEvent.findPointerIndex(int)>
	//   89  222:istore          6
					if(k == -1)
	//*  90  224:iload           6
	//*  91  226:iconst_m1       
	//*  92  227:icmpne          239
					{
						flag = resetTouch();
	//   93  230:aload_0         
	//   94  231:invokespecial   #1068 <Method boolean resetTouch()>
	//   95  234:istore          9
						break;
	//   96  236:goto            604
					}
					float f = motionevent.getX(k);
	//   97  239:aload_1         
	//   98  240:iload           6
	//   99  242:invokevirtual   #478 <Method float MotionEvent.getX(int)>
	//  100  245:fstore_2        
					float f5 = Math.abs(f - mLastMotionX);
	//  101  246:fload_2         
	//  102  247:aload_0         
	//  103  248:getfield        #480 <Field float mLastMotionX>
	//  104  251:fsub            
	//  105  252:invokestatic    #502 <Method float Math.abs(float)>
	//  106  255:fstore          4
					float f3 = motionevent.getY(k);
	//  107  257:aload_1         
	//  108  258:iload           6
	//  109  260:invokevirtual   #1045 <Method float MotionEvent.getY(int)>
	//  110  263:fstore_3        
					float f6 = Math.abs(f3 - mLastMotionY);
	//  111  264:fload_3         
	//  112  265:aload_0         
	//  113  266:getfield        #1051 <Field float mLastMotionY>
	//  114  269:fsub            
	//  115  270:invokestatic    #502 <Method float Math.abs(float)>
	//  116  273:fstore          5
					if(f5 > (float)mTouchSlop && f5 > f6)
	//* 117  275:fload           4
	//* 118  277:aload_0         
	//* 119  278:getfield        #979 <Field int mTouchSlop>
	//* 120  281:i2f             
	//* 121  282:fcmpl           
	//* 122  283:ifle            379
	//* 123  286:fload           4
	//* 124  288:fload           5
	//* 125  290:fcmpl           
	//* 126  291:ifle            379
					{
						mIsBeingDragged = true;
	//  127  294:aload_0         
	//  128  295:iconst_1        
	//  129  296:putfield        #385 <Field boolean mIsBeingDragged>
						requestParentDisallowInterceptTouchEvent(true);
	//  130  299:aload_0         
	//  131  300:iconst_1        
	//  132  301:invokespecial   #1053 <Method void requestParentDisallowInterceptTouchEvent(boolean)>
						if(f - mInitialMotionX > 0.0F)
	//* 133  304:fload_2         
	//* 134  305:aload_0         
	//* 135  306:getfield        #726 <Field float mInitialMotionX>
	//* 136  309:fsub            
	//* 137  310:fconst_0        
	//* 138  311:fcmpl           
	//* 139  312:ifle            329
							f = mInitialMotionX + (float)mTouchSlop;
	//  140  315:aload_0         
	//  141  316:getfield        #726 <Field float mInitialMotionX>
	//  142  319:aload_0         
	//  143  320:getfield        #979 <Field int mTouchSlop>
	//  144  323:i2f             
	//  145  324:fadd            
	//  146  325:fstore_2        
						else
	//* 147  326:goto            340
							f = mInitialMotionX - (float)mTouchSlop;
	//  148  329:aload_0         
	//  149  330:getfield        #726 <Field float mInitialMotionX>
	//  150  333:aload_0         
	//  151  334:getfield        #979 <Field int mTouchSlop>
	//  152  337:i2f             
	//  153  338:fsub            
	//  154  339:fstore_2        
						mLastMotionX = f;
	//  155  340:aload_0         
	//  156  341:fload_2         
	//  157  342:putfield        #480 <Field float mLastMotionX>
						mLastMotionY = f3;
	//  158  345:aload_0         
	//  159  346:fload_3         
	//  160  347:putfield        #1051 <Field float mLastMotionY>
						setScrollState(1);
	//  161  350:aload_0         
	//  162  351:iconst_1        
	//  163  352:invokevirtual   #724 <Method void setScrollState(int)>
						setScrollingCacheEnabled(true);
	//  164  355:aload_0         
	//  165  356:iconst_1        
	//  166  357:invokespecial   #272 <Method void setScrollingCacheEnabled(boolean)>
						ViewParent viewparent = getParent();
	//  167  360:aload_0         
	//  168  361:invokevirtual   #542 <Method ViewParent getParent()>
	//  169  364:astore          10
						if(viewparent != null)
	//* 170  366:aload           10
	//* 171  368:ifnull          379
							viewparent.requestDisallowInterceptTouchEvent(true);
	//  172  371:aload           10
	//  173  373:iconst_1        
	//  174  374:invokeinterface #547 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
					}
				}
				if(mIsBeingDragged)
	//* 175  379:aload_0         
	//* 176  380:getfield        #385 <Field boolean mIsBeingDragged>
	//* 177  383:ifeq            604
					flag = false | performDrag(motionevent.getX(motionevent.findPointerIndex(mActivePointerId)));
	//  178  386:iconst_0        
	//  179  387:aload_0         
	//  180  388:aload_1         
	//  181  389:aload_1         
	//  182  390:aload_0         
	//  183  391:getfield        #213 <Field int mActivePointerId>
	//  184  394:invokevirtual   #1042 <Method int MotionEvent.findPointerIndex(int)>
	//  185  397:invokevirtual   #478 <Method float MotionEvent.getX(int)>
	//  186  400:invokespecial   #1055 <Method boolean performDrag(float)>
	//  187  403:ior             
	//  188  404:istore          9
				break;

	//* 189  406:goto            604
			case 1: // '\001'
				if(mIsBeingDragged)
	//* 190  409:aload_0         
	//* 191  410:getfield        #385 <Field boolean mIsBeingDragged>
	//* 192  413:ifeq            604
				{
					Object obj = ((Object) (mVelocityTracker));
	//  193  416:aload_0         
	//  194  417:getfield        #389 <Field VelocityTracker mVelocityTracker>
	//  195  420:astore          10
					((VelocityTracker) (obj)).computeCurrentVelocity(1000, mMaximumVelocity);
	//  196  422:aload           10
	//  197  424:sipush          1000
	//  198  427:aload_0         
	//  199  428:getfield        #887 <Field int mMaximumVelocity>
	//  200  431:i2f             
	//  201  432:invokevirtual   #891 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
					int l = (int)((VelocityTracker) (obj)).getXVelocity(mActivePointerId);
	//  202  435:aload           10
	//  203  437:aload_0         
	//  204  438:getfield        #213 <Field int mActivePointerId>
	//  205  441:invokevirtual   #894 <Method float VelocityTracker.getXVelocity(int)>
	//  206  444:f2i             
	//  207  445:istore          6
					mPopulatePending = true;
	//  208  447:aload_0         
	//  209  448:iconst_1        
	//  210  449:putfield        #305 <Field boolean mPopulatePending>
					int i1 = getClientWidth();
	//  211  452:aload_0         
	//  212  453:invokespecial   #245 <Method int getClientWidth()>
	//  213  456:istore          7
					int j1 = getScrollX();
	//  214  458:aload_0         
	//  215  459:invokevirtual   #286 <Method int getScrollX()>
	//  216  462:istore          8
					obj = ((Object) (infoForCurrentScrollPosition()));
	//  217  464:aload_0         
	//  218  465:invokespecial   #495 <Method ViewPager$ItemInfo infoForCurrentScrollPosition()>
	//  219  468:astore          10
					float f4 = mPageMargin;
	//  220  470:aload_0         
	//  221  471:getfield        #247 <Field int mPageMargin>
	//  222  474:i2f             
	//  223  475:fstore_3        
					float f1 = i1;
	//  224  476:iload           7
	//  225  478:i2f             
	//  226  479:fstore_2        
					f4 /= f1;
	//  227  480:fload_3         
	//  228  481:fload_2         
	//  229  482:fdiv            
	//  230  483:fstore_3        
					setCurrentItemInternal(determineTargetPage(((ItemInfo) (obj)).position, ((float)j1 / f1 - ((ItemInfo) (obj)).offset) / (((ItemInfo) (obj)).widthFactor + f4), l, (int)(motionevent.getX(motionevent.findPointerIndex(mActivePointerId)) - mInitialMotionX)), true, true, l);
	//  231  484:aload_0         
	//  232  485:aload_0         
	//  233  486:aload           10
	//  234  488:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//  235  491:iload           8
	//  236  493:i2f             
	//  237  494:fload_2         
	//  238  495:fdiv            
	//  239  496:aload           10
	//  240  498:getfield        #253 <Field float ViewPager$ItemInfo.offset>
	//  241  501:fsub            
	//  242  502:aload           10
	//  243  504:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//  244  507:fload_3         
	//  245  508:fadd            
	//  246  509:fdiv            
	//  247  510:iload           6
	//  248  512:aload_1         
	//  249  513:aload_1         
	//  250  514:aload_0         
	//  251  515:getfield        #213 <Field int mActivePointerId>
	//  252  518:invokevirtual   #1042 <Method int MotionEvent.findPointerIndex(int)>
	//  253  521:invokevirtual   #478 <Method float MotionEvent.getX(int)>
	//  254  524:aload_0         
	//  255  525:getfield        #726 <Field float mInitialMotionX>
	//  256  528:fsub            
	//  257  529:f2i             
	//  258  530:invokespecial   #896 <Method int determineTargetPage(int, float, int, int)>
	//  259  533:iconst_1        
	//  260  534:iconst_1        
	//  261  535:iload           6
	//  262  537:invokevirtual   #899 <Method void setCurrentItemInternal(int, boolean, boolean, int)>
					flag = resetTouch();
	//  263  540:aload_0         
	//  264  541:invokespecial   #1068 <Method boolean resetTouch()>
	//  265  544:istore          9
				}
				break;

	//* 266  546:goto            604
			case 0: // '\0'
				mScroller.abortAnimation();
	//  267  549:aload_0         
	//  268  550:getfield        #274 <Field Scroller mScroller>
	//  269  553:invokevirtual   #283 <Method void Scroller.abortAnimation()>
				mPopulatePending = false;
	//  270  556:aload_0         
	//  271  557:iconst_0        
	//  272  558:putfield        #305 <Field boolean mPopulatePending>
				populate();
	//  273  561:aload_0         
	//  274  562:invokevirtual   #1066 <Method void populate()>
				float f2 = motionevent.getX();
	//  275  565:aload_1         
	//  276  566:invokevirtual   #1058 <Method float MotionEvent.getX()>
	//  277  569:fstore_2        
				mInitialMotionX = f2;
	//  278  570:aload_0         
	//  279  571:fload_2         
	//  280  572:putfield        #726 <Field float mInitialMotionX>
				mLastMotionX = f2;
	//  281  575:aload_0         
	//  282  576:fload_2         
	//  283  577:putfield        #480 <Field float mLastMotionX>
				f2 = motionevent.getY();
	//  284  580:aload_1         
	//  285  581:invokevirtual   #1060 <Method float MotionEvent.getY()>
	//  286  584:fstore_2        
				mInitialMotionY = f2;
	//  287  585:aload_0         
	//  288  586:fload_2         
	//  289  587:putfield        #1047 <Field float mInitialMotionY>
				mLastMotionY = f2;
	//  290  590:aload_0         
	//  291  591:fload_2         
	//  292  592:putfield        #1051 <Field float mLastMotionY>
				mActivePointerId = motionevent.getPointerId(0);
	//  293  595:aload_0         
	//  294  596:aload_1         
	//  295  597:iconst_0        
	//  296  598:invokevirtual   #475 <Method int MotionEvent.getPointerId(int)>
	//  297  601:putfield        #213 <Field int mActivePointerId>
				break;
			}
			if(flag)
	//* 298  604:iload           9
	//* 299  606:ifeq            613
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  300  609:aload_0         
	//  301  610:invokestatic    #769 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			return true;
	//  302  613:iconst_1        
	//  303  614:ireturn         
		} else
		{
			return false;
	//  304  615:iconst_0        
	//  305  616:ireturn         
		}
	}

	boolean pageLeft()
	{
		if(mCurItem > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #333 <Field int mCurItem>
	//*   2    4:ifle            20
		{
			setCurrentItem(mCurItem - 1, true);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #333 <Field int mCurItem>
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
	//*   1    1:getfield        #236 <Field PagerAdapter mAdapter>
	//*   2    4:ifnull          36
	//*   3    7:aload_0         
	//*   4    8:getfield        #333 <Field int mCurItem>
	//*   5   11:aload_0         
	//*   6   12:getfield        #236 <Field PagerAdapter mAdapter>
	//*   7   15:invokevirtual   #242 <Method int PagerAdapter.getCount()>
	//*   8   18:iconst_1        
	//*   9   19:isub            
	//*  10   20:icmpge          36
		{
			setCurrentItem(mCurItem + 1, true);
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #333 <Field int mCurItem>
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
	//    2    2:getfield        #333 <Field int mCurItem>
	//    3    5:invokevirtual   #1171 <Method void populate(int)>
	//    4    8:return          
	}

	void populate(int i)
	{
		float f2;
		int j;
		int l;
		int l1;
		int i2;
		int k2;
		Object obj1;
		ItemInfo iteminfo4;
		int j2;
		ItemInfo iteminfo;
label0:
		{
			if(mCurItem != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #333 <Field int mCurItem>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          26
			{
				obj1 = ((Object) (infoForPosition(mCurItem)));
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #333 <Field int mCurItem>
	//    7   13:invokevirtual   #524 <Method ViewPager$ItemInfo infoForPosition(int)>
	//    8   16:astore          14
				mCurItem = i;
	//    9   18:aload_0         
	//   10   19:iload_1         
	//   11   20:putfield        #333 <Field int mCurItem>
			} else
	//*  12   23:goto            29
			{
				obj1 = null;
	//   13   26:aconst_null     
	//   14   27:astore          14
			}
			if(mAdapter == null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #236 <Field PagerAdapter mAdapter>
	//*  17   33:ifnonnull       41
			{
				sortChildDrawingOrder();
	//   18   36:aload_0         
	//   19   37:invokespecial   #1175 <Method void sortChildDrawingOrder()>
				return;
	//   20   40:return          
			}
			if(mPopulatePending)
	//*  21   41:aload_0         
	//*  22   42:getfield        #305 <Field boolean mPopulatePending>
	//*  23   45:ifeq            53
			{
				sortChildDrawingOrder();
	//   24   48:aload_0         
	//   25   49:invokespecial   #1175 <Method void sortChildDrawingOrder()>
				return;
	//   26   52:return          
			}
			if(getWindowToken() == null)
	//*  27   53:aload_0         
	//*  28   54:invokevirtual   #1179 <Method android.os.IBinder getWindowToken()>
	//*  29   57:ifnonnull       61
				return;
	//   30   60:return          
			mAdapter.startUpdate(((ViewGroup) (this)));
	//   31   61:aload_0         
	//   32   62:getfield        #236 <Field PagerAdapter mAdapter>
	//   33   65:aload_0         
	//   34   66:invokevirtual   #783 <Method void PagerAdapter.startUpdate(ViewGroup)>
			i = mOffscreenPageLimit;
	//   35   69:aload_0         
	//   36   70:getfield        #211 <Field int mOffscreenPageLimit>
	//   37   73:istore_1        
			j2 = Math.max(0, mCurItem - i);
	//   38   74:iconst_0        
	//   39   75:aload_0         
	//   40   76:getfield        #333 <Field int mCurItem>
	//   41   79:iload_1         
	//   42   80:isub            
	//   43   81:invokestatic    #342 <Method int Math.max(int, int)>
	//   44   84:istore          11
			l1 = mAdapter.getCount();
	//   45   86:aload_0         
	//   46   87:getfield        #236 <Field PagerAdapter mAdapter>
	//   47   90:invokevirtual   #242 <Method int PagerAdapter.getCount()>
	//   48   93:istore          9
			i2 = Math.min(l1 - 1, mCurItem + i);
	//   49   95:iload           9
	//   50   97:iconst_1        
	//   51   98:isub            
	//   52   99:aload_0         
	//   53  100:getfield        #333 <Field int mCurItem>
	//   54  103:iload_1         
	//   55  104:iadd            
	//   56  105:invokestatic    #339 <Method int Math.min(int, int)>
	//   57  108:istore          10
			if(l1 != mExpectedAdapterCount)
	//*  58  110:iload           9
	//*  59  112:aload_0         
	//*  60  113:getfield        #772 <Field int mExpectedAdapterCount>
	//*  61  116:icmpeq          260
			{
				String s;
				try
				{
					s = getResources().getResourceName(getId());
	//   62  119:aload_0         
	//   63  120:invokevirtual   #1180 <Method Resources getResources()>
	//   64  123:aload_0         
	//   65  124:invokevirtual   #1183 <Method int getId()>
	//   66  127:invokevirtual   #1187 <Method String Resources.getResourceName(int)>
	//   67  130:astore          13
				}
	//*  68  132:goto            144
	//*  69  135:aload_0         
	//*  70  136:invokevirtual   #1183 <Method int getId()>
	//*  71  139:invokestatic    #1192 <Method String Integer.toHexString(int)>
	//*  72  142:astore          13
	//*  73  144:new             #667 <Class StringBuilder>
	//*  74  147:dup             
	//*  75  148:invokespecial   #668 <Method void StringBuilder()>
	//*  76  151:astore          14
	//*  77  153:aload           14
	//*  78  155:ldc2            #1194 <String "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ">
	//*  79  158:invokevirtual   #676 <Method StringBuilder StringBuilder.append(String)>
	//*  80  161:pop             
	//*  81  162:aload           14
	//*  82  164:aload_0         
	//*  83  165:getfield        #772 <Field int mExpectedAdapterCount>
	//*  84  168:invokevirtual   #1197 <Method StringBuilder StringBuilder.append(int)>
	//*  85  171:pop             
	//*  86  172:aload           14
	//*  87  174:ldc2            #1199 <String ", found: ">
	//*  88  177:invokevirtual   #676 <Method StringBuilder StringBuilder.append(String)>
	//*  89  180:pop             
	//*  90  181:aload           14
	//*  91  183:iload           9
	//*  92  185:invokevirtual   #1197 <Method StringBuilder StringBuilder.append(int)>
	//*  93  188:pop             
	//*  94  189:aload           14
	//*  95  191:ldc2            #1201 <String " Pager id: ">
	//*  96  194:invokevirtual   #676 <Method StringBuilder StringBuilder.append(String)>
	//*  97  197:pop             
	//*  98  198:aload           14
	//*  99  200:aload           13
	//* 100  202:invokevirtual   #676 <Method StringBuilder StringBuilder.append(String)>
	//* 101  205:pop             
	//* 102  206:aload           14
	//* 103  208:ldc2            #1203 <String " Pager class: ">
	//* 104  211:invokevirtual   #676 <Method StringBuilder StringBuilder.append(String)>
	//* 105  214:pop             
	//* 106  215:aload           14
	//* 107  217:aload_0         
	//* 108  218:invokevirtual   #452 <Method Class Object.getClass()>
	//* 109  221:invokevirtual   #1206 <Method StringBuilder StringBuilder.append(Object)>
	//* 110  224:pop             
	//* 111  225:aload           14
	//* 112  227:ldc2            #1208 <String " Problematic adapter: ">
	//* 113  230:invokevirtual   #676 <Method StringBuilder StringBuilder.append(String)>
	//* 114  233:pop             
	//* 115  234:aload           14
	//* 116  236:aload_0         
	//* 117  237:getfield        #236 <Field PagerAdapter mAdapter>
	//* 118  240:invokevirtual   #452 <Method Class Object.getClass()>
	//* 119  243:invokevirtual   #1206 <Method StringBuilder StringBuilder.append(Object)>
	//* 120  246:pop             
	//* 121  247:new             #488 <Class IllegalStateException>
	//* 122  250:dup             
	//* 123  251:aload           14
	//* 124  253:invokevirtual   #683 <Method String StringBuilder.toString()>
	//* 125  256:invokespecial   #493 <Method void IllegalStateException(String)>
	//* 126  259:athrow          
	//* 127  260:iconst_0        
	//* 128  261:istore_1        
	//* 129  262:iload_1         
	//* 130  263:aload_0         
	//* 131  264:getfield        #189 <Field ArrayList mItems>
	//* 132  267:invokevirtual   #259 <Method int ArrayList.size()>
	//* 133  270:icmpge          320
	//* 134  273:aload_0         
	//* 135  274:getfield        #189 <Field ArrayList mItems>
	//* 136  277:iload_1         
	//* 137  278:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//* 138  281:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 139  284:astore          13
	//* 140  286:aload           13
	//* 141  288:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//* 142  291:aload_0         
	//* 143  292:getfield        #333 <Field int mCurItem>
	//* 144  295:icmplt          313
	//* 145  298:aload           13
	//* 146  300:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//* 147  303:aload_0         
	//* 148  304:getfield        #333 <Field int mCurItem>
	//* 149  307:icmpne          320
	//* 150  310:goto            323
	//* 151  313:iload_1         
	//* 152  314:iconst_1        
	//* 153  315:iadd            
	//* 154  316:istore_1        
	//* 155  317:goto            262
	//* 156  320:aconst_null     
	//* 157  321:astore          13
	//* 158  323:aload           13
	//* 159  325:astore          15
	//* 160  327:aload           13
	//* 161  329:ifnonnull       352
	//* 162  332:aload           13
	//* 163  334:astore          15
	//* 164  336:iload           9
	//* 165  338:ifle            352
	//* 166  341:aload_0         
	//* 167  342:aload_0         
	//* 168  343:getfield        #333 <Field int mCurItem>
	//* 169  346:iload_1         
	//* 170  347:invokevirtual   #1210 <Method ViewPager$ItemInfo addNewItem(int, int)>
	//* 171  350:astore          15
	//* 172  352:aload           15
	//* 173  354:ifnull          1133
	//* 174  357:iload_1         
	//* 175  358:iconst_1        
	//* 176  359:isub            
	//* 177  360:istore          6
	//* 178  362:iload           6
	//* 179  364:iflt            384
	//* 180  367:aload_0         
	//* 181  368:getfield        #189 <Field ArrayList mItems>
	//* 182  371:iload           6
	//* 183  373:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//* 184  376:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 185  379:astore          13
	//* 186  381:goto            387
	//* 187  384:aconst_null     
	//* 188  385:astore          13
	//* 189  387:aload_0         
	//* 190  388:invokespecial   #245 <Method int getClientWidth()>
	//* 191  391:istore          12
	//* 192  393:iload           12
	//* 193  395:ifgt            404
	//* 194  398:fconst_0        
	//* 195  399:fstore          4
	//* 196  401:goto            423
	//* 197  404:fconst_2        
	//* 198  405:aload           15
	//* 199  407:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//* 200  410:fsub            
	//* 201  411:aload_0         
	//* 202  412:invokevirtual   #439 <Method int getPaddingLeft()>
	//* 203  415:i2f             
	//* 204  416:iload           12
	//* 205  418:i2f             
	//* 206  419:fdiv            
	//* 207  420:fadd            
	//* 208  421:fstore          4
	//* 209  423:aload_0         
	//* 210  424:getfield        #333 <Field int mCurItem>
	//* 211  427:iconst_1        
	//* 212  428:isub            
	//* 213  429:istore          8
	//* 214  431:fconst_0        
	//* 215  432:fstore_3        
	//* 216  433:iload_1         
	//* 217  434:istore          5
	//* 218  436:iload           8
	//* 219  438:iflt            740
	//* 220  441:fload_3         
	//* 221  442:fload           4
	//* 222  444:fcmpl           
	//* 223  445:iflt            580
	//* 224  448:iload           8
	//* 225  450:iload           11
	//* 226  452:icmpge          580
	//* 227  455:aload           13
	//* 228  457:ifnonnull       463
	//* 229  460:goto            740
	//* 230  463:fload_3         
	//* 231  464:fstore_2        
	//* 232  465:iload           6
	//* 233  467:istore_1        
	//* 234  468:aload           13
	//* 235  470:astore          16
	//* 236  472:iload           5
	//* 237  474:istore          7
	//* 238  476:iload           8
	//* 239  478:aload           13
	//* 240  480:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//* 241  483:icmpne          718
	//* 242  486:fload_3         
	//* 243  487:fstore_2        
	//* 244  488:iload           6
	//* 245  490:istore_1        
	//* 246  491:aload           13
	//* 247  493:astore          16
	//* 248  495:iload           5
	//* 249  497:istore          7
	//* 250  499:aload           13
	//* 251  501:getfield        #308 <Field boolean ViewPager$ItemInfo.scrolling>
	//* 252  504:ifne            718
	//* 253  507:aload_0         
	//* 254  508:getfield        #189 <Field ArrayList mItems>
	//* 255  511:iload           6
	//* 256  513:invokevirtual   #779 <Method Object ArrayList.remove(int)>
	//* 257  516:pop             
	//* 258  517:aload_0         
	//* 259  518:getfield        #236 <Field PagerAdapter mAdapter>
	//* 260  521:aload_0         
	//* 261  522:iload           8
	//* 262  524:aload           13
	//* 263  526:getfield        #619 <Field Object ViewPager$ItemInfo.object>
	//* 264  529:invokevirtual   #787 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
	//* 265  532:iload           6
	//* 266  534:iconst_1        
	//* 267  535:isub            
	//* 268  536:istore          6
	//* 269  538:iload           5
	//* 270  540:iconst_1        
	//* 271  541:isub            
	//* 272  542:istore          5
	//* 273  544:fload_3         
	//* 274  545:fstore_2        
	//* 275  546:iload           6
	//* 276  548:istore_1        
	//* 277  549:iload           5
	//* 278  551:istore          7
	//* 279  553:iload           6
	//* 280  555:iflt            703
	//* 281  558:aload_0         
	//* 282  559:getfield        #189 <Field ArrayList mItems>
	//* 283  562:iload           6
	//* 284  564:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//* 285  567:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 286  570:astore          13
	//* 287  572:fload_3         
	//* 288  573:fstore_2        
	//* 289  574:iload           6
	//* 290  576:istore_1        
	//* 291  577:goto            710
	//* 292  580:aload           13
	//* 293  582:ifnull          645
	//* 294  585:iload           8
	//* 295  587:aload           13
	//* 296  589:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//* 297  592:icmpne          645
	//* 298  595:fload_3         
	//* 299  596:aload           13
	//* 300  598:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//* 301  601:fadd            
	//* 302  602:fstore_3        
	//* 303  603:iload           6
	//* 304  605:iconst_1        
	//* 305  606:isub            
	//* 306  607:istore          6
	//* 307  609:fload_3         
	//* 308  610:fstore_2        
	//* 309  611:iload           6
	//* 310  613:istore_1        
	//* 311  614:iload           5
	//* 312  616:istore          7
	//* 313  618:iload           6
	//* 314  620:iflt            703
	//* 315  623:aload_0         
	//* 316  624:getfield        #189 <Field ArrayList mItems>
	//* 317  627:iload           6
	//* 318  629:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//* 319  632:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 320  635:astore          13
	//* 321  637:fload_3         
	//* 322  638:fstore_2        
	//* 323  639:iload           6
	//* 324  641:istore_1        
	//* 325  642:goto            710
	//* 326  645:fload_3         
	//* 327  646:aload_0         
	//* 328  647:iload           8
	//* 329  649:iload           6
	//* 330  651:iconst_1        
	//* 331  652:iadd            
	//* 332  653:invokevirtual   #1210 <Method ViewPager$ItemInfo addNewItem(int, int)>
	//* 333  656:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//* 334  659:fadd            
	//* 335  660:fstore_3        
	//* 336  661:iload           5
	//* 337  663:iconst_1        
	//* 338  664:iadd            
	//* 339  665:istore          5
	//* 340  667:fload_3         
	//* 341  668:fstore_2        
	//* 342  669:iload           6
	//* 343  671:istore_1        
	//* 344  672:iload           5
	//* 345  674:istore          7
	//* 346  676:iload           6
	//* 347  678:iflt            703
	//* 348  681:aload_0         
	//* 349  682:getfield        #189 <Field ArrayList mItems>
	//* 350  685:iload           6
	//* 351  687:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//* 352  690:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 353  693:astore          13
	//* 354  695:fload_3         
	//* 355  696:fstore_2        
	//* 356  697:iload           6
	//* 357  699:istore_1        
	//* 358  700:goto            710
	//* 359  703:aconst_null     
	//* 360  704:astore          13
	//* 361  706:iload           7
	//* 362  708:istore          5
	//* 363  710:iload           5
	//* 364  712:istore          7
	//* 365  714:aload           13
	//* 366  716:astore          16
	//* 367  718:iload           8
	//* 368  720:iconst_1        
	//* 369  721:isub            
	//* 370  722:istore          8
	//* 371  724:fload_2         
	//* 372  725:fstore_3        
	//* 373  726:iload_1         
	//* 374  727:istore          6
	//* 375  729:aload           16
	//* 376  731:astore          13
	//* 377  733:iload           7
	//* 378  735:istore          5
	//* 379  737:goto            436
	//* 380  740:aload           15
	//* 381  742:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//* 382  745:fstore_3        
	//* 383  746:iload           5
	//* 384  748:iconst_1        
	//* 385  749:iadd            
	//* 386  750:istore          6
	//* 387  752:fload_3         
	//* 388  753:fconst_2        
	//* 389  754:fcmpg           
	//* 390  755:ifge            1106
	//* 391  758:iload           6
	//* 392  760:aload_0         
	//* 393  761:getfield        #189 <Field ArrayList mItems>
	//* 394  764:invokevirtual   #259 <Method int ArrayList.size()>
	//* 395  767:icmpge          787
	//* 396  770:aload_0         
	//* 397  771:getfield        #189 <Field ArrayList mItems>
	//* 398  774:iload           6
	//* 399  776:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//* 400  779:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 401  782:astore          13
	//* 402  784:goto            790
	//* 403  787:aconst_null     
	//* 404  788:astore          13
	//* 405  790:iload           12
	//* 406  792:ifgt            801
	//* 407  795:fconst_0        
	//* 408  796:fstore          4
	//* 409  798:goto            814
	//* 410  801:aload_0         
	//* 411  802:invokevirtual   #442 <Method int getPaddingRight()>
	//* 412  805:i2f             
	//* 413  806:iload           12
	//* 414  808:i2f             
	//* 415  809:fdiv            
	//* 416  810:fconst_2        
	//* 417  811:fadd            
	//* 418  812:fstore          4
	//* 419  814:aload_0         
	//* 420  815:getfield        #333 <Field int mCurItem>
	//* 421  818:istore_1        
	//* 422  819:aload           13
	//* 423  821:astore          16
	//* 424  823:iload_1         
	//* 425  824:iconst_1        
	//* 426  825:iadd            
	//* 427  826:istore          7
	//* 428  828:iload           7
	//* 429  830:iload           9
	//* 430  832:icmpge          1106
	//* 431  835:fload_3         
	//* 432  836:fload           4
	//* 433  838:fcmpl           
	//* 434  839:iflt            963
	//* 435  842:iload           7
	//* 436  844:iload           10
	//* 437  846:icmple          963
	//* 438  849:aload           16
	//* 439  851:ifnonnull       857
	//* 440  854:goto            1106
	//* 441  857:fload_3         
	//* 442  858:fstore_2        
	//* 443  859:iload           6
	//* 444  861:istore_1        
	//* 445  862:aload           16
	//* 446  864:astore          13
	//* 447  866:iload           7
	//* 448  868:aload           16
	//* 449  870:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//* 450  873:icmpne          1091
	//* 451  876:fload_3         
	//* 452  877:fstore_2        
	//* 453  878:iload           6
	//* 454  880:istore_1        
	//* 455  881:aload           16
	//* 456  883:astore          13
	//* 457  885:aload           16
	//* 458  887:getfield        #308 <Field boolean ViewPager$ItemInfo.scrolling>
	//* 459  890:ifne            1091
	//* 460  893:aload_0         
	//* 461  894:getfield        #189 <Field ArrayList mItems>
	//* 462  897:iload           6
	//* 463  899:invokevirtual   #779 <Method Object ArrayList.remove(int)>
	//* 464  902:pop             
	//* 465  903:aload_0         
	//* 466  904:getfield        #236 <Field PagerAdapter mAdapter>
	//* 467  907:aload_0         
	//* 468  908:iload           7
	//* 469  910:aload           16
	//* 470  912:getfield        #619 <Field Object ViewPager$ItemInfo.object>
	//* 471  915:invokevirtual   #787 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
	//* 472  918:fload_3         
	//* 473  919:fstore_2        
	//* 474  920:iload           6
	//* 475  922:istore_1        
	//* 476  923:iload           6
	//* 477  925:aload_0         
	//* 478  926:getfield        #189 <Field ArrayList mItems>
	//* 479  929:invokevirtual   #259 <Method int ArrayList.size()>
	//* 480  932:icmpge          957
	//* 481  935:aload_0         
	//* 482  936:getfield        #189 <Field ArrayList mItems>
	//* 483  939:iload           6
	//* 484  941:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//* 485  944:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 486  947:astore          13
	//* 487  949:fload_3         
	//* 488  950:fstore_2        
	//* 489  951:iload           6
	//* 490  953:istore_1        
	//* 491  954:goto            1091
	//* 492  957:aconst_null     
	//* 493  958:astore          13
	//* 494  960:goto            1091
	//* 495  963:aload           16
	//* 496  965:ifnull          1031
	//* 497  968:iload           7
	//* 498  970:aload           16
	//* 499  972:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//* 500  975:icmpne          1031
	//* 501  978:fload_3         
	//* 502  979:aload           16
	//* 503  981:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//* 504  984:fadd            
	//* 505  985:fstore_3        
	//* 506  986:iload           6
	//* 507  988:iconst_1        
	//* 508  989:iadd            
	//* 509  990:istore          6
	//* 510  992:fload_3         
	//* 511  993:fstore_2        
	//* 512  994:iload           6
	//* 513  996:istore_1        
	//* 514  997:iload           6
	//* 515  999:aload_0         
	//* 516 1000:getfield        #189 <Field ArrayList mItems>
	//* 517 1003:invokevirtual   #259 <Method int ArrayList.size()>
	//* 518 1006:icmpge          957
	//* 519 1009:aload_0         
	//* 520 1010:getfield        #189 <Field ArrayList mItems>
	//* 521 1013:iload           6
	//* 522 1015:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//* 523 1018:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 524 1021:astore          13
	//* 525 1023:fload_3         
	//* 526 1024:fstore_2        
	//* 527 1025:iload           6
	//* 528 1027:istore_1        
	//* 529 1028:goto            1091
	//* 530 1031:aload_0         
	//* 531 1032:iload           7
	//* 532 1034:iload           6
	//* 533 1036:invokevirtual   #1210 <Method ViewPager$ItemInfo addNewItem(int, int)>
	//* 534 1039:astore          13
	//* 535 1041:iload           6
	//* 536 1043:iconst_1        
	//* 537 1044:iadd            
	//* 538 1045:istore          6
	//* 539 1047:fload_3         
	//* 540 1048:aload           13
	//* 541 1050:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//* 542 1053:fadd            
	//* 543 1054:fstore_3        
	//* 544 1055:fload_3         
	//* 545 1056:fstore_2        
	//* 546 1057:iload           6
	//* 547 1059:istore_1        
	//* 548 1060:iload           6
	//* 549 1062:aload_0         
	//* 550 1063:getfield        #189 <Field ArrayList mItems>
	//* 551 1066:invokevirtual   #259 <Method int ArrayList.size()>
	//* 552 1069:icmpge          957
	//* 553 1072:aload_0         
	//* 554 1073:getfield        #189 <Field ArrayList mItems>
	//* 555 1076:iload           6
	//* 556 1078:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//* 557 1081:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 558 1084:astore          13
	//* 559 1086:iload           6
	//* 560 1088:istore_1        
	//* 561 1089:fload_3         
	//* 562 1090:fstore_2        
	//* 563 1091:fload_2         
	//* 564 1092:fstore_3        
	//* 565 1093:iload_1         
	//* 566 1094:istore          6
	//* 567 1096:aload           13
	//* 568 1098:astore          16
	//* 569 1100:iload           7
	//* 570 1102:istore_1        
	//* 571 1103:goto            823
	//* 572 1106:aload_0         
	//* 573 1107:aload           15
	//* 574 1109:iload           5
	//* 575 1111:aload           14
	//* 576 1113:invokespecial   #1212 <Method void calculatePageOffsets(ViewPager$ItemInfo, int, ViewPager$ItemInfo)>
	//* 577 1116:aload_0         
	//* 578 1117:getfield        #236 <Field PagerAdapter mAdapter>
	//* 579 1120:aload_0         
	//* 580 1121:aload_0         
	//* 581 1122:getfield        #333 <Field int mCurItem>
	//* 582 1125:aload           15
	//* 583 1127:getfield        #619 <Field Object ViewPager$ItemInfo.object>
	//* 584 1130:invokevirtual   #1215 <Method void PagerAdapter.setPrimaryItem(ViewGroup, int, Object)>
	//* 585 1133:aload_0         
	//* 586 1134:getfield        #236 <Field PagerAdapter mAdapter>
	//* 587 1137:aload_0         
	//* 588 1138:invokevirtual   #790 <Method void PagerAdapter.finishUpdate(ViewGroup)>
	//* 589 1141:aload_0         
	//* 590 1142:invokevirtual   #370 <Method int getChildCount()>
	//* 591 1145:istore          5
	//* 592 1147:iconst_0        
	//* 593 1148:istore_1        
	//* 594 1149:iload_1         
	//* 595 1150:iload           5
	//* 596 1152:icmpge          1236
	//* 597 1155:aload_0         
	//* 598 1156:iload_1         
	//* 599 1157:invokevirtual   #376 <Method View getChildAt(int)>
	//* 600 1160:astore          14
	//* 601 1162:aload           14
	//* 602 1164:invokevirtual   #534 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 603 1167:checkcast       #20  <Class ViewPager$LayoutParams>
	//* 604 1170:astore          13
	//* 605 1172:aload           13
	//* 606 1174:iload_1         
	//* 607 1175:putfield        #933 <Field int ViewPager$LayoutParams.childIndex>
	//* 608 1178:aload           13
	//* 609 1180:getfield        #537 <Field boolean ViewPager$LayoutParams.isDecor>
	//* 610 1183:ifne            1229
	//* 611 1186:aload           13
	//* 612 1188:getfield        #791 <Field float ViewPager$LayoutParams.widthFactor>
	//* 613 1191:fconst_0        
	//* 614 1192:fcmpl           
	//* 615 1193:ifne            1229
	//* 616 1196:aload_0         
	//* 617 1197:aload           14
	//* 618 1199:invokevirtual   #595 <Method ViewPager$ItemInfo infoForChild(View)>
	//* 619 1202:astore          14
	//* 620 1204:aload           14
	//* 621 1206:ifnull          1229
	//* 622 1209:aload           13
	//* 623 1211:aload           14
	//* 624 1213:getfield        #256 <Field float ViewPager$ItemInfo.widthFactor>
	//* 625 1216:putfield        #791 <Field float ViewPager$LayoutParams.widthFactor>
	//* 626 1219:aload           13
	//* 627 1221:aload           14
	//* 628 1223:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//* 629 1226:putfield        #1216 <Field int ViewPager$LayoutParams.position>
	//* 630 1229:iload_1         
	//* 631 1230:iconst_1        
	//* 632 1231:iadd            
	//* 633 1232:istore_1        
	//* 634 1233:goto            1149
	//* 635 1236:aload_0         
	//* 636 1237:invokespecial   #1175 <Method void sortChildDrawingOrder()>
	//* 637 1240:aload_0         
	//* 638 1241:invokevirtual   #1219 <Method boolean hasFocus()>
	//* 639 1244:ifeq            1348
	//* 640 1247:aload_0         
	//* 641 1248:invokevirtual   #664 <Method View findFocus()>
	//* 642 1251:astore          13
	//* 643 1253:aload           13
	//* 644 1255:ifnull          1269
	//* 645 1258:aload_0         
	//* 646 1259:aload           13
	//* 647 1261:invokevirtual   #1221 <Method ViewPager$ItemInfo infoForAnyChild(View)>
	//* 648 1264:astore          13
	//* 649 1266:goto            1272
	//* 650 1269:aconst_null     
	//* 651 1270:astore          13
	//* 652 1272:aload           13
	//* 653 1274:ifnull          1289
	//* 654 1277:aload           13
	//* 655 1279:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//* 656 1282:aload_0         
	//* 657 1283:getfield        #333 <Field int mCurItem>
	//* 658 1286:icmpeq          1348
	//* 659 1289:iconst_0        
	//* 660 1290:istore_1        
	//* 661 1291:iload_1         
	//* 662 1292:aload_0         
	//* 663 1293:invokevirtual   #370 <Method int getChildCount()>
	//* 664 1296:icmpge          1348
	//* 665 1299:aload_0         
	//* 666 1300:iload_1         
	//* 667 1301:invokevirtual   #376 <Method View getChildAt(int)>
	//* 668 1304:astore          13
	//* 669 1306:aload_0         
	//* 670 1307:aload           13
	//* 671 1309:invokevirtual   #595 <Method ViewPager$ItemInfo infoForChild(View)>
	//* 672 1312:astore          14
	//* 673 1314:aload           14
	//* 674 1316:ifnull          1341
	//* 675 1319:aload           14
	//* 676 1321:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//* 677 1324:aload_0         
	//* 678 1325:getfield        #333 <Field int mCurItem>
	//* 679 1328:icmpne          1341
	//* 680 1331:aload           13
	//* 681 1333:iconst_2        
	//* 682 1334:invokevirtual   #1223 <Method boolean View.requestFocus(int)>
	//* 683 1337:ifeq            1341
	//* 684 1340:return          
	//* 685 1341:iload_1         
	//* 686 1342:iconst_1        
	//* 687 1343:iadd            
	//* 688 1344:istore_1        
	//* 689 1345:goto            1291
	//* 690 1348:return          
				// Misplaced declaration of an exception variable
				catch(android.content.res.Resources.NotFoundException notfoundexception)
				{
					s = Integer.toHexString(getId());
				}
				obj1 = ((Object) (new StringBuilder()));
				((StringBuilder) (obj1)).append("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
				((StringBuilder) (obj1)).append(mExpectedAdapterCount);
				((StringBuilder) (obj1)).append(", found: ");
				((StringBuilder) (obj1)).append(l1);
				((StringBuilder) (obj1)).append(" Pager id: ");
				((StringBuilder) (obj1)).append(s);
				((StringBuilder) (obj1)).append(" Pager class: ");
				((StringBuilder) (obj1)).append(((Object) (((Object)this).getClass())));
				((StringBuilder) (obj1)).append(" Problematic adapter: ");
				((StringBuilder) (obj1)).append(((Object) (((Object) (mAdapter)).getClass())));
				throw new IllegalStateException(((StringBuilder) (obj1)).toString());
			}
			i = 0;
			do
			{
				if(i >= mItems.size())
					break;
				iteminfo = (ItemInfo)mItems.get(i);
				if(iteminfo.position >= mCurItem)
				{
					if(iteminfo.position == mCurItem)
						break label0;
					break;
				}
				i++;
			} while(true);
			iteminfo = null;
		}
		iteminfo4 = iteminfo;
		if(iteminfo == null)
		{
			iteminfo4 = iteminfo;
			if(l1 > 0)
				iteminfo4 = addNewItem(mCurItem, i);
		}
		if(iteminfo4 == null)
			break MISSING_BLOCK_LABEL_1133;
		l = i - 1;
		if(l >= 0)
			iteminfo = (ItemInfo)mItems.get(l);
		else
			iteminfo = null;
		k2 = getClientWidth();
		float f3;
		if(k2 <= 0)
			f3 = 0.0F;
		else
			f3 = (2.0F - iteminfo4.widthFactor) + (float)getPaddingLeft() / (float)k2;
		int k1 = mCurItem - 1;
		f2 = 0.0F;
		int i1;
label1:
		for(j = i; k1 >= 0; j = i1)
		{
			float f;
			ItemInfo iteminfo5;
label2:
			{
label3:
				{
					if(f2 >= f3 && k1 < j2)
					{
						if(iteminfo == null)
							break label1;
						f = f2;
						i = l;
						iteminfo5 = iteminfo;
						i1 = j;
						if(k1 != iteminfo.position)
							break label2;
						f = f2;
						i = l;
						iteminfo5 = iteminfo;
						i1 = j;
						if(iteminfo.scrolling)
							break label2;
						mItems.remove(l);
						mAdapter.destroyItem(((ViewGroup) (this)), k1, iteminfo.object);
						l--;
						j--;
						f = f2;
						i = l;
						i1 = j;
						if(l >= 0)
						{
							iteminfo = (ItemInfo)mItems.get(l);
							f = f2;
							i = l;
							break label3;
						}
					} else
					if(iteminfo != null && k1 == iteminfo.position)
					{
						f2 += iteminfo.widthFactor;
						l--;
						f = f2;
						i = l;
						i1 = j;
						if(l >= 0)
						{
							iteminfo = (ItemInfo)mItems.get(l);
							f = f2;
							i = l;
							break label3;
						}
					} else
					{
						f2 += addNewItem(k1, l + 1).widthFactor;
						j++;
						f = f2;
						i = l;
						i1 = j;
						if(l >= 0)
						{
							iteminfo = (ItemInfo)mItems.get(l);
							f = f2;
							i = l;
							break label3;
						}
					}
					iteminfo = null;
					j = i1;
				}
				i1 = j;
				iteminfo5 = iteminfo;
			}
			k1--;
			f2 = f;
			l = i;
			iteminfo = iteminfo5;
		}

		f2 = iteminfo4.widthFactor;
		l = j + 1;
		if(f2 >= 2.0F) goto _L2; else goto _L1
_L1:
		float f4;
		ItemInfo iteminfo6;
		ItemInfo iteminfo1;
		if(l < mItems.size())
			iteminfo1 = (ItemInfo)mItems.get(l);
		else
			iteminfo1 = null;
		if(k2 <= 0)
			f4 = 0.0F;
		else
			f4 = (float)getPaddingRight() / (float)k2 + 2.0F;
		i = mCurItem;
		iteminfo6 = iteminfo1;
_L8:
		int j1;
		j1 = i + 1;
		if(j1 >= l1)
			break; /* Loop/switch isn't completed */
		if(f2 < f4 || j1 <= i2) goto _L4; else goto _L3
_L3:
		float f1;
		ItemInfo iteminfo2;
		if(iteminfo6 == null)
			break; /* Loop/switch isn't completed */
		f1 = f2;
		i = l;
		iteminfo2 = iteminfo6;
		if(j1 != iteminfo6.position)
			break MISSING_BLOCK_LABEL_1091;
		f1 = f2;
		i = l;
		iteminfo2 = iteminfo6;
		if(iteminfo6.scrolling)
			break MISSING_BLOCK_LABEL_1091;
		mItems.remove(l);
		mAdapter.destroyItem(((ViewGroup) (this)), j1, iteminfo6.object);
		f1 = f2;
		i = l;
		if(l < mItems.size())
		{
			iteminfo2 = (ItemInfo)mItems.get(l);
			f1 = f2;
			i = l;
			break MISSING_BLOCK_LABEL_1091;
		}
_L6:
		iteminfo2 = null;
		break MISSING_BLOCK_LABEL_1091;
_L4:
		if(iteminfo6 == null || j1 != iteminfo6.position)
			break; /* Loop/switch isn't completed */
		f2 += iteminfo6.widthFactor;
		l++;
		f1 = f2;
		i = l;
		if(l < mItems.size())
		{
			iteminfo2 = (ItemInfo)mItems.get(l);
			f1 = f2;
			i = l;
			break MISSING_BLOCK_LABEL_1091;
		}
		if(true) goto _L6; else goto _L5
_L5:
		iteminfo2 = addNewItem(j1, l);
		l++;
		f2 += iteminfo2.widthFactor;
		f1 = f2;
		i = l;
		if(l >= mItems.size()) goto _L6; else goto _L7
_L7:
		iteminfo2 = (ItemInfo)mItems.get(l);
		i = l;
		f1 = f2;
		f2 = f1;
		l = i;
		iteminfo6 = iteminfo2;
		i = j1;
		if(true) goto _L8; else goto _L2
_L2:
		calculatePageOffsets(iteminfo4, j, ((ItemInfo) (obj1)));
		mAdapter.setPrimaryItem(((ViewGroup) (this)), mCurItem, iteminfo4.object);
		android.content.res.Resources.NotFoundException notfoundexception;
		mAdapter.finishUpdate(((ViewGroup) (this)));
		int k = getChildCount();
		for(i = 0; i < k; i++)
		{
			Object obj2 = ((Object) (getChildAt(i)));
			LayoutParams layoutparams = (LayoutParams)((View) (obj2)).getLayoutParams();
			layoutparams.childIndex = i;
			if(layoutparams.isDecor || layoutparams.widthFactor != 0.0F)
				continue;
			obj2 = ((Object) (infoForChild(((View) (obj2)))));
			if(obj2 != null)
			{
				layoutparams.widthFactor = ((ItemInfo) (obj2)).widthFactor;
				layoutparams.position = ((ItemInfo) (obj2)).position;
			}
		}

		sortChildDrawingOrder();
		if(hasFocus())
		{
			Object obj = ((Object) (findFocus()));
			if(obj != null)
				obj = ((Object) (infoForAnyChild(((View) (obj)))));
			else
				obj = null;
			if(obj == null || ((ItemInfo) (obj)).position != mCurItem)
				for(i = 0; i < getChildCount(); i++)
				{
					View view = getChildAt(i);
					ItemInfo iteminfo3 = infoForChild(view);
					if(iteminfo3 != null && iteminfo3.position == mCurItem && view.requestFocus(2))
						return;
				}

		}
		return;
	//* 691 1349:astore          13
	//* 692 1351:goto            135
	}

	public void removeOnAdapterChangeListener(OnAdapterChangeListener onadapterchangelistener)
	{
		if(mAdapterChangeListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #626 <Field List mAdapterChangeListeners>
	//*   2    4:ifnull          18
			mAdapterChangeListeners.remove(((Object) (onadapterchangelistener)));
	//    3    7:aload_0         
	//    4    8:getfield        #626 <Field List mAdapterChangeListeners>
	//    5   11:aload_1         
	//    6   12:invokeinterface #1226 <Method boolean List.remove(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	public void removeOnPageChangeListener(OnPageChangeListener onpagechangelistener)
	{
		if(mOnPageChangeListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #351 <Field List mOnPageChangeListeners>
	//*   2    4:ifnull          18
			mOnPageChangeListeners.remove(((Object) (onpagechangelistener)));
	//    3    7:aload_0         
	//    4    8:getfield        #351 <Field List mOnPageChangeListeners>
	//    5   11:aload_1         
	//    6   12:invokeinterface #1226 <Method boolean List.remove(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	public void removeView(View view)
	{
		if(mInLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #648 <Field boolean mInLayout>
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
		Object obj = ((Object) (mAdapter));
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field PagerAdapter mAdapter>
	//    2    4:astore          6
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(obj != null)
	//*   5    8:aload           6
	//*   6   10:ifnull          110
		{
			mAdapter.setViewPagerObserver(((DataSetObserver) (null)));
	//    7   13:aload_0         
	//    8   14:getfield        #236 <Field PagerAdapter mAdapter>
	//    9   17:aconst_null     
	//   10   18:invokevirtual   #1239 <Method void PagerAdapter.setViewPagerObserver(DataSetObserver)>
			mAdapter.startUpdate(((ViewGroup) (this)));
	//   11   21:aload_0         
	//   12   22:getfield        #236 <Field PagerAdapter mAdapter>
	//   13   25:aload_0         
	//   14   26:invokevirtual   #783 <Method void PagerAdapter.startUpdate(ViewGroup)>
			for(int i = 0; i < mItems.size(); i++)
	//*  15   29:iconst_0        
	//*  16   30:istore_2        
	//*  17   31:iload_2         
	//*  18   32:aload_0         
	//*  19   33:getfield        #189 <Field ArrayList mItems>
	//*  20   36:invokevirtual   #259 <Method int ArrayList.size()>
	//*  21   39:icmpge          80
			{
				obj = ((Object) ((ItemInfo)mItems.get(i)));
	//   22   42:aload_0         
	//   23   43:getfield        #189 <Field ArrayList mItems>
	//   24   46:iload_2         
	//   25   47:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//   26   50:checkcast       #17  <Class ViewPager$ItemInfo>
	//   27   53:astore          6
				mAdapter.destroyItem(((ViewGroup) (this)), ((ItemInfo) (obj)).position, ((ItemInfo) (obj)).object);
	//   28   55:aload_0         
	//   29   56:getfield        #236 <Field PagerAdapter mAdapter>
	//   30   59:aload_0         
	//   31   60:aload           6
	//   32   62:getfield        #250 <Field int ViewPager$ItemInfo.position>
	//   33   65:aload           6
	//   34   67:getfield        #619 <Field Object ViewPager$ItemInfo.object>
	//   35   70:invokevirtual   #787 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
			}

	//   36   73:iload_2         
	//   37   74:iconst_1        
	//   38   75:iadd            
	//   39   76:istore_2        
	//*  40   77:goto            31
			mAdapter.finishUpdate(((ViewGroup) (this)));
	//   41   80:aload_0         
	//   42   81:getfield        #236 <Field PagerAdapter mAdapter>
	//   43   84:aload_0         
	//   44   85:invokevirtual   #790 <Method void PagerAdapter.finishUpdate(ViewGroup)>
			mItems.clear();
	//   45   88:aload_0         
	//   46   89:getfield        #189 <Field ArrayList mItems>
	//   47   92:invokevirtual   #572 <Method void ArrayList.clear()>
			removeNonDecorViews();
	//   48   95:aload_0         
	//   49   96:invokespecial   #1241 <Method void removeNonDecorViews()>
			mCurItem = 0;
	//   50   99:aload_0         
	//   51  100:iconst_0        
	//   52  101:putfield        #333 <Field int mCurItem>
			scrollTo(0, 0);
	//   53  104:aload_0         
	//   54  105:iconst_0        
	//   55  106:iconst_0        
	//   56  107:invokevirtual   #299 <Method void scrollTo(int, int)>
		}
		obj = ((Object) (mAdapter));
	//   57  110:aload_0         
	//   58  111:getfield        #236 <Field PagerAdapter mAdapter>
	//   59  114:astore          6
		mAdapter = pageradapter;
	//   60  116:aload_0         
	//   61  117:aload_1         
	//   62  118:putfield        #236 <Field PagerAdapter mAdapter>
		mExpectedAdapterCount = 0;
	//   63  121:aload_0         
	//   64  122:iconst_0        
	//   65  123:putfield        #772 <Field int mExpectedAdapterCount>
		if(mAdapter != null)
	//*  66  126:aload_0         
	//*  67  127:getfield        #236 <Field PagerAdapter mAdapter>
	//*  68  130:ifnull          256
		{
			if(mObserver == null)
	//*  69  133:aload_0         
	//*  70  134:getfield        #1243 <Field ViewPager$PagerObserver mObserver>
	//*  71  137:ifnonnull       152
				mObserver = new PagerObserver();
	//   72  140:aload_0         
	//   73  141:new             #35  <Class ViewPager$PagerObserver>
	//   74  144:dup             
	//   75  145:aload_0         
	//   76  146:invokespecial   #1244 <Method void ViewPager$PagerObserver(ViewPager)>
	//   77  149:putfield        #1243 <Field ViewPager$PagerObserver mObserver>
			mAdapter.setViewPagerObserver(((DataSetObserver) (mObserver)));
	//   78  152:aload_0         
	//   79  153:getfield        #236 <Field PagerAdapter mAdapter>
	//   80  156:aload_0         
	//   81  157:getfield        #1243 <Field ViewPager$PagerObserver mObserver>
	//   82  160:invokevirtual   #1239 <Method void PagerAdapter.setViewPagerObserver(DataSetObserver)>
			mPopulatePending = false;
	//   83  163:aload_0         
	//   84  164:iconst_0        
	//   85  165:putfield        #305 <Field boolean mPopulatePending>
			boolean flag1 = mFirstLayout;
	//   86  168:aload_0         
	//   87  169:getfield        #215 <Field boolean mFirstLayout>
	//   88  172:istore          5
			mFirstLayout = true;
	//   89  174:aload_0         
	//   90  175:iconst_1        
	//   91  176:putfield        #215 <Field boolean mFirstLayout>
			mExpectedAdapterCount = mAdapter.getCount();
	//   92  179:aload_0         
	//   93  180:aload_0         
	//   94  181:getfield        #236 <Field PagerAdapter mAdapter>
	//   95  184:invokevirtual   #242 <Method int PagerAdapter.getCount()>
	//   96  187:putfield        #772 <Field int mExpectedAdapterCount>
			if(mRestoredCurItem >= 0)
	//*  97  190:aload_0         
	//*  98  191:getfield        #199 <Field int mRestoredCurItem>
	//*  99  194:iflt            240
			{
				mAdapter.restoreState(mRestoredAdapterState, mRestoredClassLoader);
	//  100  197:aload_0         
	//  101  198:getfield        #236 <Field PagerAdapter mAdapter>
	//  102  201:aload_0         
	//  103  202:getfield        #201 <Field Parcelable mRestoredAdapterState>
	//  104  205:aload_0         
	//  105  206:getfield        #203 <Field ClassLoader mRestoredClassLoader>
	//  106  209:invokevirtual   #1147 <Method void PagerAdapter.restoreState(Parcelable, ClassLoader)>
				setCurrentItemInternal(mRestoredCurItem, false, true);
	//  107  212:aload_0         
	//  108  213:aload_0         
	//  109  214:getfield        #199 <Field int mRestoredCurItem>
	//  110  217:iconst_0        
	//  111  218:iconst_1        
	//  112  219:invokevirtual   #795 <Method void setCurrentItemInternal(int, boolean, boolean)>
				mRestoredCurItem = -1;
	//  113  222:aload_0         
	//  114  223:iconst_m1       
	//  115  224:putfield        #199 <Field int mRestoredCurItem>
				mRestoredAdapterState = null;
	//  116  227:aload_0         
	//  117  228:aconst_null     
	//  118  229:putfield        #201 <Field Parcelable mRestoredAdapterState>
				mRestoredClassLoader = null;
	//  119  232:aload_0         
	//  120  233:aconst_null     
	//  121  234:putfield        #203 <Field ClassLoader mRestoredClassLoader>
			} else
	//* 122  237:goto            256
			if(!flag1)
	//* 123  240:iload           5
	//* 124  242:ifne            252
				populate();
	//  125  245:aload_0         
	//  126  246:invokevirtual   #1066 <Method void populate()>
			else
	//* 127  249:goto            256
				requestLayout();
	//  128  252:aload_0         
	//  129  253:invokevirtual   #798 <Method void requestLayout()>
		}
		if(mAdapterChangeListeners != null && !mAdapterChangeListeners.isEmpty())
	//* 130  256:aload_0         
	//* 131  257:getfield        #626 <Field List mAdapterChangeListeners>
	//* 132  260:ifnull          323
	//* 133  263:aload_0         
	//* 134  264:getfield        #626 <Field List mAdapterChangeListeners>
	//* 135  267:invokeinterface #1245 <Method boolean List.isEmpty()>
	//* 136  272:ifne            323
		{
			int k = mAdapterChangeListeners.size();
	//  137  275:aload_0         
	//  138  276:getfield        #626 <Field List mAdapterChangeListeners>
	//  139  279:invokeinterface #354 <Method int List.size()>
	//  140  284:istore          4
			for(int j = ((int) (flag)); j < k; j++)
	//* 141  286:iload_3         
	//* 142  287:istore_2        
	//* 143  288:iload_2         
	//* 144  289:iload           4
	//* 145  291:icmpge          323
				((OnAdapterChangeListener)mAdapterChangeListeners.get(j)).onAdapterChanged(this, ((PagerAdapter) (obj)), pageradapter);
	//  146  294:aload_0         
	//  147  295:getfield        #626 <Field List mAdapterChangeListeners>
	//  148  298:iload_2         
	//  149  299:invokeinterface #355 <Method Object List.get(int)>
	//  150  304:checkcast       #26  <Class ViewPager$OnAdapterChangeListener>
	//  151  307:aload_0         
	//  152  308:aload           6
	//  153  310:aload_1         
	//  154  311:invokeinterface #1249 <Method void ViewPager$OnAdapterChangeListener.onAdapterChanged(ViewPager, PagerAdapter, PagerAdapter)>

	//  155  316:iload_2         
	//  156  317:iconst_1        
	//  157  318:iadd            
	//  158  319:istore_2        
		}
	//* 159  320:goto            288
	//  160  323:return          
	}

	public void setCurrentItem(int i)
	{
		mPopulatePending = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #305 <Field boolean mPopulatePending>
		setCurrentItemInternal(i, mFirstLayout ^ true, false);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #215 <Field boolean mFirstLayout>
	//    7   11:iconst_1        
	//    8   12:ixor            
	//    9   13:iconst_0        
	//   10   14:invokevirtual   #795 <Method void setCurrentItemInternal(int, boolean, boolean)>
	//   11   17:return          
	}

	public void setCurrentItem(int i, boolean flag)
	{
		mPopulatePending = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #305 <Field boolean mPopulatePending>
		setCurrentItemInternal(i, flag, false);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #795 <Method void setCurrentItemInternal(int, boolean, boolean)>
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
		if(mAdapter != null && mAdapter.getCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #236 <Field PagerAdapter mAdapter>
	//*   2    4:ifnull          206
	//*   3    7:aload_0         
	//*   4    8:getfield        #236 <Field PagerAdapter mAdapter>
	//*   5   11:invokevirtual   #242 <Method int PagerAdapter.getCount()>
	//*   6   14:ifgt            20
	//*   7   17:goto            206
		{
			if(!flag1 && mCurItem == i && mItems.size() != 0)
	//*   8   20:iload_3         
	//*   9   21:ifne            48
	//*  10   24:aload_0         
	//*  11   25:getfield        #333 <Field int mCurItem>
	//*  12   28:iload_1         
	//*  13   29:icmpne          48
	//*  14   32:aload_0         
	//*  15   33:getfield        #189 <Field ArrayList mItems>
	//*  16   36:invokevirtual   #259 <Method int ArrayList.size()>
	//*  17   39:ifeq            48
			{
				setScrollingCacheEnabled(false);
	//   18   42:aload_0         
	//   19   43:iconst_0        
	//   20   44:invokespecial   #272 <Method void setScrollingCacheEnabled(boolean)>
				return;
	//   21   47:return          
			}
			flag1 = true;
	//   22   48:iconst_1        
	//   23   49:istore_3        
			int k;
			if(i < 0)
	//*  24   50:iload_1         
	//*  25   51:ifge            60
			{
				k = 0;
	//   26   54:iconst_0        
	//   27   55:istore          5
			} else
	//*  28   57:goto            85
			{
				k = i;
	//   29   60:iload_1         
	//   30   61:istore          5
				if(i >= mAdapter.getCount())
	//*  31   63:iload_1         
	//*  32   64:aload_0         
	//*  33   65:getfield        #236 <Field PagerAdapter mAdapter>
	//*  34   68:invokevirtual   #242 <Method int PagerAdapter.getCount()>
	//*  35   71:icmplt          85
					k = mAdapter.getCount() - 1;
	//   36   74:aload_0         
	//   37   75:getfield        #236 <Field PagerAdapter mAdapter>
	//   38   78:invokevirtual   #242 <Method int PagerAdapter.getCount()>
	//   39   81:iconst_1        
	//   40   82:isub            
	//   41   83:istore          5
			}
			i = mOffscreenPageLimit;
	//   42   85:aload_0         
	//   43   86:getfield        #211 <Field int mOffscreenPageLimit>
	//   44   89:istore_1        
			if(k > mCurItem + i || k < mCurItem - i)
	//*  45   90:iload           5
	//*  46   92:aload_0         
	//*  47   93:getfield        #333 <Field int mCurItem>
	//*  48   96:iload_1         
	//*  49   97:iadd            
	//*  50   98:icmpgt          112
	//*  51  101:iload           5
	//*  52  103:aload_0         
	//*  53  104:getfield        #333 <Field int mCurItem>
	//*  54  107:iload_1         
	//*  55  108:isub            
	//*  56  109:icmpge          147
				for(i = 0; i < mItems.size(); i++)
	//*  57  112:iconst_0        
	//*  58  113:istore_1        
	//*  59  114:iload_1         
	//*  60  115:aload_0         
	//*  61  116:getfield        #189 <Field ArrayList mItems>
	//*  62  119:invokevirtual   #259 <Method int ArrayList.size()>
	//*  63  122:icmpge          147
					((ItemInfo)mItems.get(i)).scrolling = true;
	//   64  125:aload_0         
	//   65  126:getfield        #189 <Field ArrayList mItems>
	//   66  129:iload_1         
	//   67  130:invokevirtual   #263 <Method Object ArrayList.get(int)>
	//   68  133:checkcast       #17  <Class ViewPager$ItemInfo>
	//   69  136:iconst_1        
	//   70  137:putfield        #308 <Field boolean ViewPager$ItemInfo.scrolling>

	//   71  140:iload_1         
	//   72  141:iconst_1        
	//   73  142:iadd            
	//   74  143:istore_1        
	//*  75  144:goto            114
			if(mCurItem == k)
	//*  76  147:aload_0         
	//*  77  148:getfield        #333 <Field int mCurItem>
	//*  78  151:iload           5
	//*  79  153:icmpeq          159
	//*  80  156:goto            161
				flag1 = false;
	//   81  159:iconst_0        
	//   82  160:istore_3        
			if(mFirstLayout)
	//*  83  161:aload_0         
	//*  84  162:getfield        #215 <Field boolean mFirstLayout>
	//*  85  165:ifeq            189
			{
				mCurItem = k;
	//   86  168:aload_0         
	//   87  169:iload           5
	//   88  171:putfield        #333 <Field int mCurItem>
				if(flag1)
	//*  89  174:iload_3         
	//*  90  175:ifeq            184
					dispatchOnPageSelected(k);
	//   91  178:aload_0         
	//   92  179:iload           5
	//   93  181:invokespecial   #564 <Method void dispatchOnPageSelected(int)>
				requestLayout();
	//   94  184:aload_0         
	//   95  185:invokevirtual   #798 <Method void requestLayout()>
				return;
	//   96  188:return          
			} else
			{
				populate(k);
	//   97  189:aload_0         
	//   98  190:iload           5
	//   99  192:invokevirtual   #1171 <Method void populate(int)>
				scrollToItem(k, flag, j, flag1);
	//  100  195:aload_0         
	//  101  196:iload           5
	//  102  198:iload_2         
	//  103  199:iload           4
	//  104  201:iload_3         
	//  105  202:invokespecial   #1093 <Method void scrollToItem(int, boolean, int, boolean)>
				return;
	//  106  205:return          
			}
		} else
		{
			setScrollingCacheEnabled(false);
	//  107  206:aload_0         
	//  108  207:iconst_0        
	//  109  208:invokespecial   #272 <Method void setScrollingCacheEnabled(boolean)>
			return;
	//  110  211:return          
		}
	}

	OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onpagechangelistener)
	{
		OnPageChangeListener onpagechangelistener1 = mInternalPageChangeListener;
	//    0    0:aload_0         
	//    1    1:getfield        #357 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//    2    4:astore_2        
		mInternalPageChangeListener = onpagechangelistener;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #357 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
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
	//*   4    4:icmpge          55
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    7:new             #667 <Class StringBuilder>
	//    6   10:dup             
	//    7   11:invokespecial   #668 <Method void StringBuilder()>
	//    8   14:astore_3        
			stringbuilder.append("Requested offscreen page limit ");
	//    9   15:aload_3         
	//   10   16:ldc2            #1254 <String "Requested offscreen page limit ">
	//   11   19:invokevirtual   #676 <Method StringBuilder StringBuilder.append(String)>
	//   12   22:pop             
			stringbuilder.append(i);
	//   13   23:aload_3         
	//   14   24:iload_1         
	//   15   25:invokevirtual   #1197 <Method StringBuilder StringBuilder.append(int)>
	//   16   28:pop             
			stringbuilder.append(" too small; defaulting to ");
	//   17   29:aload_3         
	//   18   30:ldc2            #1256 <String " too small; defaulting to ">
	//   19   33:invokevirtual   #676 <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
			stringbuilder.append(1);
	//   21   37:aload_3         
	//   22   38:iconst_1        
	//   23   39:invokevirtual   #1197 <Method StringBuilder StringBuilder.append(int)>
	//   24   42:pop             
			Log.w("ViewPager", stringbuilder.toString());
	//   25   43:ldc1            #80  <String "ViewPager">
	//   26   45:aload_3         
	//   27   46:invokevirtual   #683 <Method String StringBuilder.toString()>
	//   28   49:invokestatic    #1259 <Method int Log.w(String, String)>
	//   29   52:pop             
			j = 1;
	//   30   53:iconst_1        
	//   31   54:istore_2        
		}
		if(j != mOffscreenPageLimit)
	//*  32   55:iload_2         
	//*  33   56:aload_0         
	//*  34   57:getfield        #211 <Field int mOffscreenPageLimit>
	//*  35   60:icmpeq          72
		{
			mOffscreenPageLimit = j;
	//   36   63:aload_0         
	//   37   64:iload_2         
	//   38   65:putfield        #211 <Field int mOffscreenPageLimit>
			populate();
	//   39   68:aload_0         
	//   40   69:invokevirtual   #1066 <Method void populate()>
		}
	//   41   72:return          
	}

	public void setOnPageChangeListener(OnPageChangeListener onpagechangelistener)
	{
		mOnPageChangeListener = onpagechangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #346 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//    3    5:return          
	}

	public void setPageMargin(int i)
	{
		int j = mPageMargin;
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field int mPageMargin>
	//    2    4:istore_2        
		mPageMargin = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #247 <Field int mPageMargin>
		int k = getWidth();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #465 <Method int getWidth()>
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
	//   16   24:invokevirtual   #798 <Method void requestLayout()>
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
	//   16   26:invokevirtual   #943 <Method void setWillNotDraw(boolean)>
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
		int j = 1;
	//    0    0:iconst_1        
	//    1    1:istore          5
		boolean flag2;
		if(pagetransformer != null)
	//*   2    3:aload_2         
	//*   3    4:ifnull          13
			flag2 = true;
	//    4    7:iconst_1        
	//    5    8:istore          6
		else
	//*   6   10:goto            16
			flag2 = false;
	//    7   13:iconst_0        
	//    8   14:istore          6
		boolean flag3;
		if(mPageTransformer != null)
	//*   9   16:aload_0         
	//*  10   17:getfield        #1121 <Field ViewPager$PageTransformer mPageTransformer>
	//*  11   20:ifnull          29
			flag3 = true;
	//   12   23:iconst_1        
	//   13   24:istore          7
		else
	//*  14   26:goto            32
			flag3 = false;
	//   15   29:iconst_0        
	//   16   30:istore          7
		boolean flag1;
		if(flag2 != flag3)
	//*  17   32:iload           6
	//*  18   34:iload           7
	//*  19   36:icmpeq          45
			flag1 = true;
	//   20   39:iconst_1        
	//   21   40:istore          4
		else
	//*  22   42:goto            48
			flag1 = false;
	//   23   45:iconst_0        
	//   24   46:istore          4
		mPageTransformer = pagetransformer;
	//   25   48:aload_0         
	//   26   49:aload_2         
	//   27   50:putfield        #1121 <Field ViewPager$PageTransformer mPageTransformer>
		setChildrenDrawingOrderEnabled(flag2);
	//   28   53:aload_0         
	//   29   54:iload           6
	//   30   56:invokevirtual   #1288 <Method void setChildrenDrawingOrderEnabled(boolean)>
		if(flag2)
	//*  31   59:iload           6
	//*  32   61:ifeq            85
		{
			if(flag)
	//*  33   64:iload_1         
	//*  34   65:ifeq            71
				j = 2;
	//   35   68:iconst_2        
	//   36   69:istore          5
			mDrawingOrder = j;
	//   37   71:aload_0         
	//   38   72:iload           5
	//   39   74:putfield        #569 <Field int mDrawingOrder>
			mPageTransformerLayerType = i;
	//   40   77:aload_0         
	//   41   78:iload_3         
	//   42   79:putfield        #372 <Field int mPageTransformerLayerType>
		} else
	//*  43   82:goto            90
		{
			mDrawingOrder = 0;
	//   44   85:aload_0         
	//   45   86:iconst_0        
	//   46   87:putfield        #569 <Field int mDrawingOrder>
		}
		if(flag1)
	//*  47   90:iload           4
	//*  48   92:ifeq            99
			populate();
	//   49   95:aload_0         
	//   50   96:invokevirtual   #1066 <Method void populate()>
	//   51   99:return          
	}

	void setScrollState(int i)
	{
		if(mScrollState == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #224 <Field int mScrollState>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mScrollState = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #224 <Field int mScrollState>
		if(mPageTransformer != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #1121 <Field ViewPager$PageTransformer mPageTransformer>
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
	//    4    4:invokevirtual   #562 <Method void smoothScrollTo(int, int, int)>
	//    5    7:return          
	}

	void smoothScrollTo(int i, int j, int k)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #370 <Method int getChildCount()>
	//*   2    4:ifne            13
		{
			setScrollingCacheEnabled(false);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokespecial   #272 <Method void setScrollingCacheEnabled(boolean)>
			return;
	//    6   12:return          
		}
		boolean flag;
		if(mScroller != null && !mScroller.isFinished())
	//*   7   13:aload_0         
	//*   8   14:getfield        #274 <Field Scroller mScroller>
	//*   9   17:ifnull          36
	//*  10   20:aload_0         
	//*  11   21:getfield        #274 <Field Scroller mScroller>
	//*  12   24:invokevirtual   #280 <Method boolean Scroller.isFinished()>
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
	//*  22   45:getfield        #762 <Field boolean mIsScrollStarted>
	//*  23   48:ifeq            63
				l = mScroller.getCurrX();
	//   24   51:aload_0         
	//   25   52:getfield        #274 <Field Scroller mScroller>
	//   26   55:invokevirtual   #292 <Method int Scroller.getCurrX()>
	//   27   58:istore          7
			else
	//*  28   60:goto            72
				l = mScroller.getStartX();
	//   29   63:aload_0         
	//   30   64:getfield        #274 <Field Scroller mScroller>
	//   31   67:invokevirtual   #1295 <Method int Scroller.getStartX()>
	//   32   70:istore          7
			mScroller.abortAnimation();
	//   33   72:aload_0         
	//   34   73:getfield        #274 <Field Scroller mScroller>
	//   35   76:invokevirtual   #283 <Method void Scroller.abortAnimation()>
			setScrollingCacheEnabled(false);
	//   36   79:aload_0         
	//   37   80:iconst_0        
	//   38   81:invokespecial   #272 <Method void setScrollingCacheEnabled(boolean)>
		} else
	//*  39   84:goto            93
		{
			l = getScrollX();
	//   40   87:aload_0         
	//   41   88:invokevirtual   #286 <Method int getScrollX()>
	//   42   91:istore          7
		}
		int i1 = getScrollY();
	//   43   93:aload_0         
	//   44   94:invokevirtual   #289 <Method int getScrollY()>
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
	//   60  121:invokespecial   #529 <Method void completeScroll(boolean)>
			populate();
	//   61  124:aload_0         
	//   62  125:invokevirtual   #1066 <Method void populate()>
			setScrollState(0);
	//   63  128:aload_0         
	//   64  129:iconst_0        
	//   65  130:invokevirtual   #724 <Method void setScrollState(int)>
			return;
	//   66  133:return          
		}
		setScrollingCacheEnabled(true);
	//   67  134:aload_0         
	//   68  135:iconst_1        
	//   69  136:invokespecial   #272 <Method void setScrollingCacheEnabled(boolean)>
		setScrollState(2);
	//   70  139:aload_0         
	//   71  140:iconst_2        
	//   72  141:invokevirtual   #724 <Method void setScrollState(int)>
		i = getClientWidth();
	//   73  144:aload_0         
	//   74  145:invokespecial   #245 <Method int getClientWidth()>
	//   75  148:istore_1        
		int k1 = i / 2;
	//   76  149:iload_1         
	//   77  150:iconst_2        
	//   78  151:idiv            
	//   79  152:istore          10
		float f1 = Math.abs(j1);
	//   80  154:iload           9
	//   81  156:invokestatic    #327 <Method int Math.abs(int)>
	//   82  159:i2f             
	//   83  160:fstore          5
		float f = i;
	//   84  162:iload_1         
	//   85  163:i2f             
	//   86  164:fstore          4
		float f3 = Math.min(1.0F, (f1 * 1.0F) / f);
	//   87  166:fconst_1        
	//   88  167:fload           5
	//   89  169:fconst_1        
	//   90  170:fmul            
	//   91  171:fload           4
	//   92  173:fdiv            
	//   93  174:invokestatic    #527 <Method float Math.min(float, float)>
	//   94  177:fstore          6
		f1 = k1;
	//   95  179:iload           10
	//   96  181:i2f             
	//   97  182:fstore          5
		f3 = distanceInfluenceForSnapDuration(f3);
	//   98  184:aload_0         
	//   99  185:fload           6
	//  100  187:invokevirtual   #1297 <Method float distanceInfluenceForSnapDuration(float)>
	//  101  190:fstore          6
		i = Math.abs(k);
	//  102  192:iload_3         
	//  103  193:invokestatic    #327 <Method int Math.abs(int)>
	//  104  196:istore_1        
		if(i > 0)
	//* 105  197:iload_1         
	//* 106  198:ifle            228
		{
			i = 4 * Math.round(1000F * Math.abs((f1 + f3 * f1) / (float)i));
	//  107  201:iconst_4        
	//  108  202:ldc2            #1298 <Float 1000F>
	//  109  205:fload           5
	//  110  207:fload           6
	//  111  209:fload           5
	//  112  211:fmul            
	//  113  212:fadd            
	//  114  213:iload_1         
	//  115  214:i2f             
	//  116  215:fdiv            
	//  117  216:invokestatic    #502 <Method float Math.abs(float)>
	//  118  219:fmul            
	//  119  220:invokestatic    #1026 <Method int Math.round(float)>
	//  120  223:imul            
	//  121  224:istore_1        
		} else
	//* 122  225:goto            267
		{
			float f2 = mAdapter.getPageWidth(mCurItem);
	//  123  228:aload_0         
	//  124  229:getfield        #236 <Field PagerAdapter mAdapter>
	//  125  232:aload_0         
	//  126  233:getfield        #333 <Field int mCurItem>
	//  127  236:invokevirtual   #267 <Method float PagerAdapter.getPageWidth(int)>
	//  128  239:fstore          5
			i = (int)(((float)Math.abs(j1) / (f * f2 + (float)mPageMargin) + 1.0F) * 100F);
	//  129  241:iload           9
	//  130  243:invokestatic    #327 <Method int Math.abs(int)>
	//  131  246:i2f             
	//  132  247:fload           4
	//  133  249:fload           5
	//  134  251:fmul            
	//  135  252:aload_0         
	//  136  253:getfield        #247 <Field int mPageMargin>
	//  137  256:i2f             
	//  138  257:fadd            
	//  139  258:fdiv            
	//  140  259:fconst_1        
	//  141  260:fadd            
	//  142  261:ldc2            #1299 <Float 100F>
	//  143  264:fmul            
	//  144  265:f2i             
	//  145  266:istore_1        
		}
		i = Math.min(i, 600);
	//  146  267:iload_1         
	//  147  268:sipush          600
	//  148  271:invokestatic    #339 <Method int Math.min(int, int)>
	//  149  274:istore_1        
		mIsScrollStarted = false;
	//  150  275:aload_0         
	//  151  276:iconst_0        
	//  152  277:putfield        #762 <Field boolean mIsScrollStarted>
		mScroller.startScroll(l, i1, j1, j, i);
	//  153  280:aload_0         
	//  154  281:getfield        #274 <Field Scroller mScroller>
	//  155  284:iload           7
	//  156  286:iload           8
	//  157  288:iload           9
	//  158  290:iload_2         
	//  159  291:iload_1         
	//  160  292:invokevirtual   #1303 <Method void Scroller.startScroll(int, int, int, int, int)>
		ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  161  295:aload_0         
	//  162  296:invokestatic    #769 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//  163  299:return          
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == mMarginDrawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1307 <Method boolean ViewGroup.verifyDrawable(Drawable)>
	//    3    5:ifne            21
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #869 <Field Drawable mMarginDrawable>
	//    7   13:if_acmpne       19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
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
