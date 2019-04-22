// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.*;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.*;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.AttributeSet;
import android.view.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//			ViewDragHelper

public class DrawerLayout extends ViewGroup
{
	static final class ChildAccessibilityDelegate extends AccessibilityDelegateCompat
	{

		public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
		{
			super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #11  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
			if(!DrawerLayout.includeChildForAccessibility(view))
		//*   4    6:aload_1         
		//*   5    7:invokestatic    #15  <Method boolean DrawerLayout.includeChildForAccessibility(View)>
		//*   6   10:ifne            18
				accessibilitynodeinfocompat.setParent(((View) (null)));
		//    7   13:aload_2         
		//    8   14:aconst_null     
		//    9   15:invokevirtual   #21  <Method void AccessibilityNodeInfoCompat.setParent(View)>
		//   10   18:return          
		}
	}

	public static interface DrawerListener
	{

		public abstract void onDrawerClosed(View view);

		public abstract void onDrawerOpened(View view);

		public abstract void onDrawerSlide(View view, float f);

		public abstract void onDrawerStateChanged(int i);
	}

	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

		public int gravity;
		boolean isPeeking;
		float onScreen;
		int openState;

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #18  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
			gravity = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #20  <Field int gravity>
		//    7   11:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #26  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
			gravity = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #20  <Field int gravity>
			context = ((Context) (context.obtainStyledAttributes(attributeset, DrawerLayout.LAYOUT_ATTRS)));
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:getstatic       #30  <Field int[] DrawerLayout.LAYOUT_ATTRS>
		//   10   16:invokevirtual   #36  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   11   19:astore_1        
			gravity = ((TypedArray) (context)).getInt(0, 0);
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:iconst_0        
		//   15   23:iconst_0        
		//   16   24:invokevirtual   #42  <Method int TypedArray.getInt(int, int)>
		//   17   27:putfield        #20  <Field int gravity>
			((TypedArray) (context)).recycle();
		//   18   30:aload_1         
		//   19   31:invokevirtual   #46  <Method void TypedArray.recycle()>
		//   20   34:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.view.ViewGroup.MarginLayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #51  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			gravity = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #20  <Field int gravity>
			gravity = layoutparams.gravity;
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:getfield        #20  <Field int gravity>
		//    9   15:putfield        #20  <Field int gravity>
		//   10   18:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #54  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
			gravity = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #20  <Field int gravity>
		//    6   10:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #51  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			gravity = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #20  <Field int gravity>
		//    6   10:return          
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
		//    3    3:invokespecial   #55  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(openDrawerGravity);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #33  <Field int openDrawerGravity>
		//    7   11:invokevirtual   #59  <Method void Parcel.writeInt(int)>
			parcel.writeInt(lockModeLeft);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #41  <Field int lockModeLeft>
		//   11   19:invokevirtual   #59  <Method void Parcel.writeInt(int)>
			parcel.writeInt(lockModeRight);
		//   12   22:aload_1         
		//   13   23:aload_0         
		//   14   24:getfield        #43  <Field int lockModeRight>
		//   15   27:invokevirtual   #59  <Method void Parcel.writeInt(int)>
			parcel.writeInt(lockModeStart);
		//   16   30:aload_1         
		//   17   31:aload_0         
		//   18   32:getfield        #45  <Field int lockModeStart>
		//   19   35:invokevirtual   #59  <Method void Parcel.writeInt(int)>
			parcel.writeInt(lockModeEnd);
		//   20   38:aload_1         
		//   21   39:aload_0         
		//   22   40:getfield        #47  <Field int lockModeEnd>
		//   23   43:invokevirtual   #59  <Method void Parcel.writeInt(int)>
		//   24   46:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class DrawerLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void DrawerLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class DrawerLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void DrawerLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #26  <Method DrawerLayout$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method DrawerLayout$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #34  <Method DrawerLayout$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		int lockModeEnd;
		int lockModeLeft;
		int lockModeRight;
		int lockModeStart;
		int openDrawerGravity;

		static 
		{
		//    0    0:new             #9   <Class DrawerLayout$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #23  <Method void DrawerLayout$SavedState$1()>
		//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #31  <Method void AbsSavedState(Parcel, ClassLoader)>
			openDrawerGravity = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #33  <Field int openDrawerGravity>
			openDrawerGravity = parcel.readInt();
		//    7   11:aload_0         
		//    8   12:aload_1         
		//    9   13:invokevirtual   #39  <Method int Parcel.readInt()>
		//   10   16:putfield        #33  <Field int openDrawerGravity>
			lockModeLeft = parcel.readInt();
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:invokevirtual   #39  <Method int Parcel.readInt()>
		//   14   24:putfield        #41  <Field int lockModeLeft>
			lockModeRight = parcel.readInt();
		//   15   27:aload_0         
		//   16   28:aload_1         
		//   17   29:invokevirtual   #39  <Method int Parcel.readInt()>
		//   18   32:putfield        #43  <Field int lockModeRight>
			lockModeStart = parcel.readInt();
		//   19   35:aload_0         
		//   20   36:aload_1         
		//   21   37:invokevirtual   #39  <Method int Parcel.readInt()>
		//   22   40:putfield        #45  <Field int lockModeStart>
			lockModeEnd = parcel.readInt();
		//   23   43:aload_0         
		//   24   44:aload_1         
		//   25   45:invokevirtual   #39  <Method int Parcel.readInt()>
		//   26   48:putfield        #47  <Field int lockModeEnd>
		//   27   51:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #51  <Method void AbsSavedState(Parcelable)>
			openDrawerGravity = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #33  <Field int openDrawerGravity>
		//    6   10:return          
		}
	}

	private class ViewDragCallback extends ViewDragHelper.Callback
	{

		private void closeOtherDrawer()
		{
			int i = mAbsGravity;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field int mAbsGravity>
		//    2    4:istore_2        
			byte byte0 = 3;
		//    3    5:iconst_3        
		//    4    6:istore_1        
			if(i == 3)
		//*   5    7:iload_2         
		//*   6    8:iconst_3        
		//*   7    9:icmpne          14
				byte0 = 5;
		//    8   12:iconst_5        
		//    9   13:istore_1        
			View view = findDrawerWithGravity(((int) (byte0)));
		//   10   14:aload_0         
		//   11   15:getfield        #21  <Field DrawerLayout this$0>
		//   12   18:iload_1         
		//   13   19:invokevirtual   #25  <Method View DrawerLayout.findDrawerWithGravity(int)>
		//   14   22:astore_3        
			if(view != null)
		//*  15   23:aload_3         
		//*  16   24:ifnull          35
				closeDrawer(view);
		//   17   27:aload_0         
		//   18   28:getfield        #21  <Field DrawerLayout this$0>
		//   19   31:aload_3         
		//   20   32:invokevirtual   #29  <Method void DrawerLayout.closeDrawer(View)>
		//   21   35:return          
		}

		public int clampViewPositionHorizontal(View view, int i, int j)
		{
			if(checkDrawerViewAbsoluteGravity(view, 3))
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field DrawerLayout this$0>
		//*   2    4:aload_1         
		//*   3    5:iconst_3        
		//*   4    6:invokevirtual   #36  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
		//*   5    9:ifeq            26
			{
				return Math.max(-view.getWidth(), Math.min(i, 0));
		//    6   12:aload_1         
		//    7   13:invokevirtual   #42  <Method int View.getWidth()>
		//    8   16:ineg            
		//    9   17:iload_2         
		//   10   18:iconst_0        
		//   11   19:invokestatic    #48  <Method int Math.min(int, int)>
		//   12   22:invokestatic    #51  <Method int Math.max(int, int)>
		//   13   25:ireturn         
			} else
			{
				j = getWidth();
		//   14   26:aload_0         
		//   15   27:getfield        #21  <Field DrawerLayout this$0>
		//   16   30:invokevirtual   #52  <Method int DrawerLayout.getWidth()>
		//   17   33:istore_3        
				return Math.max(j - view.getWidth(), Math.min(i, j));
		//   18   34:iload_3         
		//   19   35:aload_1         
		//   20   36:invokevirtual   #42  <Method int View.getWidth()>
		//   21   39:isub            
		//   22   40:iload_2         
		//   23   41:iload_3         
		//   24   42:invokestatic    #48  <Method int Math.min(int, int)>
		//   25   45:invokestatic    #51  <Method int Math.max(int, int)>
		//   26   48:ireturn         
			}
		}

		public int clampViewPositionVertical(View view, int i, int j)
		{
			return view.getTop();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #56  <Method int View.getTop()>
		//    2    4:ireturn         
		}

		public int getViewHorizontalDragRange(View view)
		{
			if(isDrawerView(view))
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field DrawerLayout this$0>
		//*   2    4:aload_1         
		//*   3    5:invokevirtual   #62  <Method boolean DrawerLayout.isDrawerView(View)>
		//*   4    8:ifeq            16
				return view.getWidth();
		//    5   11:aload_1         
		//    6   12:invokevirtual   #42  <Method int View.getWidth()>
		//    7   15:ireturn         
			else
				return 0;
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public void onEdgeDragStarted(int i, int j)
		{
			View view;
			if((i & 1) == 1)
		//*   0    0:iload_1         
		//*   1    1:iconst_1        
		//*   2    2:iand            
		//*   3    3:iconst_1        
		//*   4    4:icmpne          19
				view = findDrawerWithGravity(3);
		//    5    7:aload_0         
		//    6    8:getfield        #21  <Field DrawerLayout this$0>
		//    7   11:iconst_3        
		//    8   12:invokevirtual   #25  <Method View DrawerLayout.findDrawerWithGravity(int)>
		//    9   15:astore_3        
			else
		//*  10   16:goto            28
				view = findDrawerWithGravity(5);
		//   11   19:aload_0         
		//   12   20:getfield        #21  <Field DrawerLayout this$0>
		//   13   23:iconst_5        
		//   14   24:invokevirtual   #25  <Method View DrawerLayout.findDrawerWithGravity(int)>
		//   15   27:astore_3        
			if(view != null && getDrawerLockMode(view) == 0)
		//*  16   28:aload_3         
		//*  17   29:ifnull          52
		//*  18   32:aload_0         
		//*  19   33:getfield        #21  <Field DrawerLayout this$0>
		//*  20   36:aload_3         
		//*  21   37:invokevirtual   #67  <Method int DrawerLayout.getDrawerLockMode(View)>
		//*  22   40:ifne            52
				mDragger.captureChildView(view, j);
		//   23   43:aload_0         
		//   24   44:getfield        #69  <Field ViewDragHelper mDragger>
		//   25   47:aload_3         
		//   26   48:iload_2         
		//   27   49:invokevirtual   #75  <Method void ViewDragHelper.captureChildView(View, int)>
		//   28   52:return          
		}

		public boolean onEdgeLock(int i)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void onEdgeTouched(int i, int j)
		{
			postDelayed(mPeekRunnable, 160L);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field DrawerLayout this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #80  <Field Runnable mPeekRunnable>
		//    4    8:ldc2w           #81  <Long 160L>
		//    5   11:invokevirtual   #86  <Method boolean DrawerLayout.postDelayed(Runnable, long)>
		//    6   14:pop             
		//    7   15:return          
		}

		public void onViewCaptured(View view, int i)
		{
			((LayoutParams)view.getLayoutParams()).isPeeking = false;
		//    0    0:aload_1         
		//    1    1:invokevirtual   #91  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #93  <Class DrawerLayout$LayoutParams>
		//    3    7:iconst_0        
		//    4    8:putfield        #97  <Field boolean DrawerLayout$LayoutParams.isPeeking>
			closeOtherDrawer();
		//    5   11:aload_0         
		//    6   12:invokespecial   #99  <Method void closeOtherDrawer()>
		//    7   15:return          
		}

		public void onViewDragStateChanged(int i)
		{
			updateDrawerState(mAbsGravity, i, mDragger.getCapturedView());
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field DrawerLayout this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field int mAbsGravity>
		//    4    8:iload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #69  <Field ViewDragHelper mDragger>
		//    7   13:invokevirtual   #105 <Method View ViewDragHelper.getCapturedView()>
		//    8   16:invokevirtual   #109 <Method void DrawerLayout.updateDrawerState(int, int, View)>
		//    9   19:return          
		}

		public void onViewPositionChanged(View view, int i, int j, int k, int l)
		{
			j = view.getWidth();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #42  <Method int View.getWidth()>
		//    2    4:istore_3        
			float f;
			if(checkDrawerViewAbsoluteGravity(view, 3))
		//*   3    5:aload_0         
		//*   4    6:getfield        #21  <Field DrawerLayout this$0>
		//*   5    9:aload_1         
		//*   6   10:iconst_3        
		//*   7   11:invokevirtual   #36  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
		//*   8   14:ifeq            29
				f = (float)(i + j) / (float)j;
		//    9   17:iload_2         
		//   10   18:iload_3         
		//   11   19:iadd            
		//   12   20:i2f             
		//   13   21:iload_3         
		//   14   22:i2f             
		//   15   23:fdiv            
		//   16   24:fstore          6
			else
		//*  17   26:goto            44
				f = (float)(getWidth() - i) / (float)j;
		//   18   29:aload_0         
		//   19   30:getfield        #21  <Field DrawerLayout this$0>
		//   20   33:invokevirtual   #52  <Method int DrawerLayout.getWidth()>
		//   21   36:iload_2         
		//   22   37:isub            
		//   23   38:i2f             
		//   24   39:iload_3         
		//   25   40:i2f             
		//   26   41:fdiv            
		//   27   42:fstore          6
			setDrawerViewOffset(view, f);
		//   28   44:aload_0         
		//   29   45:getfield        #21  <Field DrawerLayout this$0>
		//   30   48:aload_1         
		//   31   49:fload           6
		//   32   51:invokevirtual   #115 <Method void DrawerLayout.setDrawerViewOffset(View, float)>
			if(f == 0.0F)
		//*  33   54:fload           6
		//*  34   56:fconst_0        
		//*  35   57:fcmpl           
		//*  36   58:ifne            66
				i = 4;
		//   37   61:iconst_4        
		//   38   62:istore_2        
			else
		//*  39   63:goto            68
				i = 0;
		//   40   66:iconst_0        
		//   41   67:istore_2        
			view.setVisibility(i);
		//   42   68:aload_1         
		//   43   69:iload_2         
		//   44   70:invokevirtual   #118 <Method void View.setVisibility(int)>
			invalidate();
		//   45   73:aload_0         
		//   46   74:getfield        #21  <Field DrawerLayout this$0>
		//   47   77:invokevirtual   #121 <Method void DrawerLayout.invalidate()>
		//   48   80:return          
		}

		public void onViewReleased(View view, float f, float f1)
		{
			int i;
label0:
			{
				f1 = getDrawerViewOffset(view);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field DrawerLayout this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #127 <Method float DrawerLayout.getDrawerViewOffset(View)>
		//    4    8:fstore_3        
				int k = view.getWidth();
		//    5    9:aload_1         
		//    6   10:invokevirtual   #42  <Method int View.getWidth()>
		//    7   13:istore          6
				if(checkDrawerViewAbsoluteGravity(view, 3))
		//*   8   15:aload_0         
		//*   9   16:getfield        #21  <Field DrawerLayout this$0>
		//*  10   19:aload_1         
		//*  11   20:iconst_3        
		//*  12   21:invokevirtual   #36  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
		//*  13   24:ifeq            66
				{
					i = f != 0.0F;
		//   14   27:fload_2         
		//   15   28:fconst_0        
		//   16   29:fcmpl           
		//   17   30:istore          4
					if(i <= 0 && (i != 0 || f1 <= 0.5F))
		//*  18   32:iload           4
		//*  19   34:ifgt            60
		//*  20   37:iload           4
		//*  21   39:ifne            52
		//*  22   42:fload_3         
		//*  23   43:ldc1            #128 <Float 0.5F>
		//*  24   45:fcmpl           
		//*  25   46:ifle            52
		//*  26   49:goto            60
						i = -k;
		//   27   52:iload           6
		//   28   54:ineg            
		//   29   55:istore          4
					else
		//*  30   57:goto            109
						i = 0;
		//   31   60:iconst_0        
		//   32   61:istore          4
					break label0;
		//   33   63:goto            109
				}
				int j = getWidth();
		//   34   66:aload_0         
		//   35   67:getfield        #21  <Field DrawerLayout this$0>
		//   36   70:invokevirtual   #52  <Method int DrawerLayout.getWidth()>
		//   37   73:istore          5
				if(f >= 0.0F)
		//*  38   75:fload_2         
		//*  39   76:fconst_0        
		//*  40   77:fcmpg           
		//*  41   78:iflt            102
				{
					i = j;
		//   42   81:iload           5
		//   43   83:istore          4
					if(f != 0.0F)
						break label0;
		//   44   85:fload_2         
		//   45   86:fconst_0        
		//   46   87:fcmpl           
		//   47   88:ifne            109
					i = j;
		//   48   91:iload           5
		//   49   93:istore          4
					if(f1 <= 0.5F)
						break label0;
		//   50   95:fload_3         
		//   51   96:ldc1            #128 <Float 0.5F>
		//   52   98:fcmpl           
		//   53   99:ifle            109
				}
				i = j - k;
		//   54  102:iload           5
		//   55  104:iload           6
		//   56  106:isub            
		//   57  107:istore          4
			}
			mDragger.settleCapturedViewAt(i, view.getTop());
		//   58  109:aload_0         
		//   59  110:getfield        #69  <Field ViewDragHelper mDragger>
		//   60  113:iload           4
		//   61  115:aload_1         
		//   62  116:invokevirtual   #56  <Method int View.getTop()>
		//   63  119:invokevirtual   #132 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
		//   64  122:pop             
			invalidate();
		//   65  123:aload_0         
		//   66  124:getfield        #21  <Field DrawerLayout this$0>
		//   67  127:invokevirtual   #121 <Method void DrawerLayout.invalidate()>
		//   68  130:return          
		}

		public void removeCallbacks()
		{
			DrawerLayout.this.removeCallbacks(mPeekRunnable);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field DrawerLayout this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #80  <Field Runnable mPeekRunnable>
		//    4    8:invokevirtual   #136 <Method boolean DrawerLayout.removeCallbacks(Runnable)>
		//    5   11:pop             
		//    6   12:return          
		}

		public boolean tryCaptureView(View view, int i)
		{
			return isDrawerView(view) && checkDrawerViewAbsoluteGravity(view, mAbsGravity) && getDrawerLockMode(view) == 0;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field DrawerLayout this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #62  <Method boolean DrawerLayout.isDrawerView(View)>
		//    4    8:ifeq            39
		//    5   11:aload_0         
		//    6   12:getfield        #21  <Field DrawerLayout this$0>
		//    7   15:aload_1         
		//    8   16:aload_0         
		//    9   17:getfield        #19  <Field int mAbsGravity>
		//   10   20:invokevirtual   #36  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
		//   11   23:ifeq            39
		//   12   26:aload_0         
		//   13   27:getfield        #21  <Field DrawerLayout this$0>
		//   14   30:aload_1         
		//   15   31:invokevirtual   #67  <Method int DrawerLayout.getDrawerLockMode(View)>
		//   16   34:ifne            39
		//   17   37:iconst_1        
		//   18   38:ireturn         
		//   19   39:iconst_0        
		//   20   40:ireturn         
		}

		private final int mAbsGravity;
		private ViewDragHelper mDragger;
		private final Runnable mPeekRunnable;
		final DrawerLayout this$0;
	}


	private boolean dispatchTransformedGenericPointerEvent(MotionEvent motionevent, View view)
	{
		if(!view.getMatrix().isIdentity())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #104 <Method Matrix View.getMatrix()>
	//*   2    4:invokevirtual   #110 <Method boolean Matrix.isIdentity()>
	//*   3    7:ifne            31
		{
			motionevent = getTransformedMotionEvent(motionevent, view);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokespecial   #114 <Method MotionEvent getTransformedMotionEvent(MotionEvent, View)>
	//    8   16:astore_1        
			boolean flag = view.dispatchGenericMotionEvent(motionevent);
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #118 <Method boolean View.dispatchGenericMotionEvent(MotionEvent)>
	//   12   22:istore          5
			motionevent.recycle();
	//   13   24:aload_1         
	//   14   25:invokevirtual   #123 <Method void MotionEvent.recycle()>
			return flag;
	//   15   28:iload           5
	//   16   30:ireturn         
		} else
		{
			float f = getScrollX() - view.getLeft();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #127 <Method int getScrollX()>
	//   19   35:aload_2         
	//   20   36:invokevirtual   #130 <Method int View.getLeft()>
	//   21   39:isub            
	//   22   40:i2f             
	//   23   41:fstore_3        
			float f1 = getScrollY() - view.getTop();
	//   24   42:aload_0         
	//   25   43:invokevirtual   #133 <Method int getScrollY()>
	//   26   46:aload_2         
	//   27   47:invokevirtual   #136 <Method int View.getTop()>
	//   28   50:isub            
	//   29   51:i2f             
	//   30   52:fstore          4
			motionevent.offsetLocation(f, f1);
	//   31   54:aload_1         
	//   32   55:fload_3         
	//   33   56:fload           4
	//   34   58:invokevirtual   #140 <Method void MotionEvent.offsetLocation(float, float)>
			boolean flag1 = view.dispatchGenericMotionEvent(motionevent);
	//   35   61:aload_2         
	//   36   62:aload_1         
	//   37   63:invokevirtual   #118 <Method boolean View.dispatchGenericMotionEvent(MotionEvent)>
	//   38   66:istore          5
			motionevent.offsetLocation(-f, -f1);
	//   39   68:aload_1         
	//   40   69:fload_3         
	//   41   70:fneg            
	//   42   71:fload           4
	//   43   73:fneg            
	//   44   74:invokevirtual   #140 <Method void MotionEvent.offsetLocation(float, float)>
			return flag1;
	//   45   77:iload           5
	//   46   79:ireturn         
		}
	}

	private MotionEvent getTransformedMotionEvent(MotionEvent motionevent, View view)
	{
		float f = getScrollX() - view.getLeft();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #127 <Method int getScrollX()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #130 <Method int View.getLeft()>
	//    4    8:isub            
	//    5    9:i2f             
	//    6   10:fstore_3        
		float f1 = getScrollY() - view.getTop();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #133 <Method int getScrollY()>
	//    9   15:aload_2         
	//   10   16:invokevirtual   #136 <Method int View.getTop()>
	//   11   19:isub            
	//   12   20:i2f             
	//   13   21:fstore          4
		motionevent = MotionEvent.obtain(motionevent);
	//   14   23:aload_1         
	//   15   24:invokestatic    #144 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//   16   27:astore_1        
		motionevent.offsetLocation(f, f1);
	//   17   28:aload_1         
	//   18   29:fload_3         
	//   19   30:fload           4
	//   20   32:invokevirtual   #140 <Method void MotionEvent.offsetLocation(float, float)>
		view = ((View) (view.getMatrix()));
	//   21   35:aload_2         
	//   22   36:invokevirtual   #104 <Method Matrix View.getMatrix()>
	//   23   39:astore_2        
		if(!((Matrix) (view)).isIdentity())
	//*  24   40:aload_2         
	//*  25   41:invokevirtual   #110 <Method boolean Matrix.isIdentity()>
	//*  26   44:ifne            82
		{
			if(mChildInvertedMatrix == null)
	//*  27   47:aload_0         
	//*  28   48:getfield        #146 <Field Matrix mChildInvertedMatrix>
	//*  29   51:ifnonnull       65
				mChildInvertedMatrix = new Matrix();
	//   30   54:aload_0         
	//   31   55:new             #106 <Class Matrix>
	//   32   58:dup             
	//   33   59:invokespecial   #149 <Method void Matrix()>
	//   34   62:putfield        #146 <Field Matrix mChildInvertedMatrix>
			((Matrix) (view)).invert(mChildInvertedMatrix);
	//   35   65:aload_2         
	//   36   66:aload_0         
	//   37   67:getfield        #146 <Field Matrix mChildInvertedMatrix>
	//   38   70:invokevirtual   #153 <Method boolean Matrix.invert(Matrix)>
	//   39   73:pop             
			motionevent.transform(mChildInvertedMatrix);
	//   40   74:aload_1         
	//   41   75:aload_0         
	//   42   76:getfield        #146 <Field Matrix mChildInvertedMatrix>
	//   43   79:invokevirtual   #157 <Method void MotionEvent.transform(Matrix)>
		}
		return motionevent;
	//   44   82:aload_1         
	//   45   83:areturn         
	}

	static String gravityToString(int i)
	{
		if((i & 3) == 3)
	//*   0    0:iload_0         
	//*   1    1:iconst_3        
	//*   2    2:iand            
	//*   3    3:iconst_3        
	//*   4    4:icmpne          10
			return "LEFT";
	//    5    7:ldc1            #161 <String "LEFT">
	//    6    9:areturn         
		if((i & 5) == 5)
	//*   7   10:iload_0         
	//*   8   11:iconst_5        
	//*   9   12:iand            
	//*  10   13:iconst_5        
	//*  11   14:icmpne          20
			return "RIGHT";
	//   12   17:ldc1            #163 <String "RIGHT">
	//   13   19:areturn         
		else
			return Integer.toHexString(i);
	//   14   20:iload_0         
	//   15   21:invokestatic    #168 <Method String Integer.toHexString(int)>
	//   16   24:areturn         
	}

	private static boolean hasOpaqueBackground(View view)
	{
		view = ((View) (view.getBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #174 <Method Drawable View.getBackground()>
	//    2    4:astore_0        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(view != null)
	//*   5    7:aload_0         
	//*   6    8:ifnull          23
		{
			if(((Drawable) (view)).getOpacity() == -1)
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #179 <Method int Drawable.getOpacity()>
	//*   9   15:iconst_m1       
	//*  10   16:icmpne          21
				flag = true;
	//   11   19:iconst_1        
	//   12   20:istore_1        
			return flag;
	//   13   21:iload_1         
	//   14   22:ireturn         
		} else
		{
			return false;
	//   15   23:iconst_0        
	//   16   24:ireturn         
		}
	}

	private boolean hasPeekingDrawer()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          38
			if(((LayoutParams)getChildAt(i).getLayoutParams()).isPeeking)
	//*   8   12:aload_0         
	//*   9   13:iload_1         
	//*  10   14:invokevirtual   #187 <Method View getChildAt(int)>
	//*  11   17:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  12   20:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//*  13   23:getfield        #194 <Field boolean DrawerLayout$LayoutParams.isPeeking>
	//*  14   26:ifeq            31
				return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         

	//   17   31:iload_1         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_1        
	//*  21   35:goto            7
		return false;
	//   22   38:iconst_0        
	//   23   39:ireturn         
	}

	private boolean hasVisibleDrawer()
	{
		return findVisibleDrawer() != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #199 <Method View findVisibleDrawer()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	static boolean includeChildForAccessibility(View view)
	{
		return ViewCompat.getImportantForAccessibility(view) != 4 && ViewCompat.getImportantForAccessibility(view) != 2;
	//    0    0:aload_0         
	//    1    1:invokestatic    #206 <Method int ViewCompat.getImportantForAccessibility(View)>
	//    2    4:iconst_4        
	//    3    5:icmpeq          18
	//    4    8:aload_0         
	//    5    9:invokestatic    #206 <Method int ViewCompat.getImportantForAccessibility(View)>
	//    6   12:iconst_2        
	//    7   13:icmpeq          18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private boolean isInBoundsOfChild(float f, float f1, View view)
	{
		if(mChildHitRect == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #210 <Field Rect mChildHitRect>
	//*   2    4:ifnonnull       18
			mChildHitRect = new Rect();
	//    3    7:aload_0         
	//    4    8:new             #212 <Class Rect>
	//    5   11:dup             
	//    6   12:invokespecial   #213 <Method void Rect()>
	//    7   15:putfield        #210 <Field Rect mChildHitRect>
		view.getHitRect(mChildHitRect);
	//    8   18:aload_3         
	//    9   19:aload_0         
	//   10   20:getfield        #210 <Field Rect mChildHitRect>
	//   11   23:invokevirtual   #217 <Method void View.getHitRect(Rect)>
		return mChildHitRect.contains((int)f, (int)f1);
	//   12   26:aload_0         
	//   13   27:getfield        #210 <Field Rect mChildHitRect>
	//   14   30:fload_1         
	//   15   31:f2i             
	//   16   32:fload_2         
	//   17   33:f2i             
	//   18   34:invokevirtual   #221 <Method boolean Rect.contains(int, int)>
	//   19   37:ireturn         
	}

	private boolean mirror(Drawable drawable, int i)
	{
		if(drawable != null && DrawableCompat.isAutoMirrored(drawable))
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #229 <Method boolean DrawableCompat.isAutoMirrored(Drawable)>
	//*   4    8:ifne            14
	//*   5   11:goto            22
		{
			DrawableCompat.setLayoutDirection(drawable, i);
	//    6   14:aload_1         
	//    7   15:iload_2         
	//    8   16:invokestatic    #232 <Method boolean DrawableCompat.setLayoutDirection(Drawable, int)>
	//    9   19:pop             
			return true;
	//   10   20:iconst_1        
	//   11   21:ireturn         
		} else
		{
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		}
	}

	private Drawable resolveLeftShadow()
	{
		int i = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #236 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_1        
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            30
		{
			Drawable drawable = mShadowStart;
	//    5    9:aload_0         
	//    6   10:getfield        #238 <Field Drawable mShadowStart>
	//    7   13:astore_2        
			if(drawable != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          51
			{
				mirror(drawable, i);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:iload_1         
	//   13   21:invokespecial   #240 <Method boolean mirror(Drawable, int)>
	//   14   24:pop             
				return mShadowStart;
	//   15   25:aload_0         
	//   16   26:getfield        #238 <Field Drawable mShadowStart>
	//   17   29:areturn         
			}
		} else
		{
			Drawable drawable1 = mShadowEnd;
	//   18   30:aload_0         
	//   19   31:getfield        #242 <Field Drawable mShadowEnd>
	//   20   34:astore_2        
			if(drawable1 != null)
	//*  21   35:aload_2         
	//*  22   36:ifnull          51
			{
				mirror(drawable1, i);
	//   23   39:aload_0         
	//   24   40:aload_2         
	//   25   41:iload_1         
	//   26   42:invokespecial   #240 <Method boolean mirror(Drawable, int)>
	//   27   45:pop             
				return mShadowEnd;
	//   28   46:aload_0         
	//   29   47:getfield        #242 <Field Drawable mShadowEnd>
	//   30   50:areturn         
			}
		}
		return mShadowLeft;
	//   31   51:aload_0         
	//   32   52:getfield        #244 <Field Drawable mShadowLeft>
	//   33   55:areturn         
	}

	private Drawable resolveRightShadow()
	{
		int i = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #236 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_1        
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            30
		{
			Drawable drawable = mShadowEnd;
	//    5    9:aload_0         
	//    6   10:getfield        #242 <Field Drawable mShadowEnd>
	//    7   13:astore_2        
			if(drawable != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          51
			{
				mirror(drawable, i);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:iload_1         
	//   13   21:invokespecial   #240 <Method boolean mirror(Drawable, int)>
	//   14   24:pop             
				return mShadowEnd;
	//   15   25:aload_0         
	//   16   26:getfield        #242 <Field Drawable mShadowEnd>
	//   17   29:areturn         
			}
		} else
		{
			Drawable drawable1 = mShadowStart;
	//   18   30:aload_0         
	//   19   31:getfield        #238 <Field Drawable mShadowStart>
	//   20   34:astore_2        
			if(drawable1 != null)
	//*  21   35:aload_2         
	//*  22   36:ifnull          51
			{
				mirror(drawable1, i);
	//   23   39:aload_0         
	//   24   40:aload_2         
	//   25   41:iload_1         
	//   26   42:invokespecial   #240 <Method boolean mirror(Drawable, int)>
	//   27   45:pop             
				return mShadowStart;
	//   28   46:aload_0         
	//   29   47:getfield        #238 <Field Drawable mShadowStart>
	//   30   50:areturn         
			}
		}
		return mShadowRight;
	//   31   51:aload_0         
	//   32   52:getfield        #247 <Field Drawable mShadowRight>
	//   33   55:areturn         
	}

	private void resolveShadowDrawables()
	{
		if(SET_DRAWER_SHADOW_FROM_ELEVATION)
	//*   0    0:getstatic       #95  <Field boolean SET_DRAWER_SHADOW_FROM_ELEVATION>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			mShadowLeftResolved = resolveLeftShadow();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #250 <Method Drawable resolveLeftShadow()>
	//    6   12:putfield        #252 <Field Drawable mShadowLeftResolved>
			mShadowRightResolved = resolveRightShadow();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokespecial   #254 <Method Drawable resolveRightShadow()>
	//   10   20:putfield        #256 <Field Drawable mShadowRightResolved>
			return;
	//   11   23:return          
		}
	}

	private void updateChildrenImportantForAccessibility(View view, boolean flag)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method int getChildCount()>
	//    2    4:istore          4
		for(int i = 0; i < j; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore_3        
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          66
		{
			View view1 = getChildAt(i);
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #187 <Method View getChildAt(int)>
	//   11   19:astore          5
			if(!flag && !isDrawerView(view1) || flag && view1 == view)
	//*  12   21:iload_2         
	//*  13   22:ifne            34
	//*  14   25:aload_0         
	//*  15   26:aload           5
	//*  16   28:invokevirtual   #261 <Method boolean isDrawerView(View)>
	//*  17   31:ifeq            44
	//*  18   34:iload_2         
	//*  19   35:ifeq            53
	//*  20   38:aload           5
	//*  21   40:aload_1         
	//*  22   41:if_acmpne       53
				ViewCompat.setImportantForAccessibility(view1, 1);
	//   23   44:aload           5
	//   24   46:iconst_1        
	//   25   47:invokestatic    #265 <Method void ViewCompat.setImportantForAccessibility(View, int)>
			else
	//*  26   50:goto            59
				ViewCompat.setImportantForAccessibility(view1, 4);
	//   27   53:aload           5
	//   28   55:iconst_4        
	//   29   56:invokestatic    #265 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		}

	//   30   59:iload_3         
	//   31   60:iconst_1        
	//   32   61:iadd            
	//   33   62:istore_3        
	//*  34   63:goto            8
	//   35   66:return          
	}

	public void addDrawerListener(DrawerListener drawerlistener)
	{
		if(drawerlistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(mListeners == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #270 <Field List mListeners>
	//*   5    9:ifnonnull       23
			mListeners = ((List) (new ArrayList()));
	//    6   12:aload_0         
	//    7   13:new             #272 <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #273 <Method void ArrayList()>
	//   10   20:putfield        #270 <Field List mListeners>
		mListeners.add(((Object) (drawerlistener)));
	//   11   23:aload_0         
	//   12   24:getfield        #270 <Field List mListeners>
	//   13   27:aload_1         
	//   14   28:invokeinterface #279 <Method boolean List.add(Object)>
	//   15   33:pop             
	//   16   34:return          
	}

	public void addFocusables(ArrayList arraylist, int i, int j)
	{
		if(getDescendantFocusability() == 0x60000)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #285 <Method int getDescendantFocusability()>
	//*   2    4:ldc2            #286 <Int 0x60000>
	//*   3    7:icmpne          11
			return;
	//    4   10:return          
		int j1 = getChildCount();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #183 <Method int getChildCount()>
	//    7   15:istore          7
		boolean flag1 = false;
	//    8   17:iconst_0        
	//    9   18:istore          6
		int k = 0;
	//   10   20:iconst_0        
	//   11   21:istore          4
		boolean flag = false;
	//   12   23:iconst_0        
	//   13   24:istore          5
		for(; k < j1; k++)
	//*  14   26:iload           4
	//*  15   28:iload           7
	//*  16   30:icmpge          92
		{
			View view = getChildAt(k);
	//   17   33:aload_0         
	//   18   34:iload           4
	//   19   36:invokevirtual   #187 <Method View getChildAt(int)>
	//   20   39:astore          8
			if(isDrawerView(view))
	//*  21   41:aload_0         
	//*  22   42:aload           8
	//*  23   44:invokevirtual   #261 <Method boolean isDrawerView(View)>
	//*  24   47:ifeq            73
			{
				if(isDrawerOpen(view))
	//*  25   50:aload_0         
	//*  26   51:aload           8
	//*  27   53:invokevirtual   #289 <Method boolean isDrawerOpen(View)>
	//*  28   56:ifeq            83
				{
					view.addFocusables(arraylist, i, j);
	//   29   59:aload           8
	//   30   61:aload_1         
	//   31   62:iload_2         
	//   32   63:iload_3         
	//   33   64:invokevirtual   #291 <Method void View.addFocusables(ArrayList, int, int)>
					flag = true;
	//   34   67:iconst_1        
	//   35   68:istore          5
				}
			} else
	//*  36   70:goto            83
			{
				mNonDrawerViews.add(((Object) (view)));
	//   37   73:aload_0         
	//   38   74:getfield        #293 <Field ArrayList mNonDrawerViews>
	//   39   77:aload           8
	//   40   79:invokevirtual   #294 <Method boolean ArrayList.add(Object)>
	//   41   82:pop             
			}
		}

	//   42   83:iload           4
	//   43   85:iconst_1        
	//   44   86:iadd            
	//   45   87:istore          4
	//*  46   89:goto            26
		if(!flag)
	//*  47   92:iload           5
	//*  48   94:ifne            156
		{
			int i1 = mNonDrawerViews.size();
	//   49   97:aload_0         
	//   50   98:getfield        #293 <Field ArrayList mNonDrawerViews>
	//   51  101:invokevirtual   #297 <Method int ArrayList.size()>
	//   52  104:istore          5
			for(int l = ((int) (flag1)); l < i1; l++)
	//*  53  106:iload           6
	//*  54  108:istore          4
	//*  55  110:iload           4
	//*  56  112:iload           5
	//*  57  114:icmpge          156
			{
				View view1 = (View)mNonDrawerViews.get(l);
	//   58  117:aload_0         
	//   59  118:getfield        #293 <Field ArrayList mNonDrawerViews>
	//   60  121:iload           4
	//   61  123:invokevirtual   #301 <Method Object ArrayList.get(int)>
	//   62  126:checkcast       #100 <Class View>
	//   63  129:astore          8
				if(view1.getVisibility() == 0)
	//*  64  131:aload           8
	//*  65  133:invokevirtual   #304 <Method int View.getVisibility()>
	//*  66  136:ifne            147
					view1.addFocusables(arraylist, i, j);
	//   67  139:aload           8
	//   68  141:aload_1         
	//   69  142:iload_2         
	//   70  143:iload_3         
	//   71  144:invokevirtual   #291 <Method void View.addFocusables(ArrayList, int, int)>
			}

	//   72  147:iload           4
	//   73  149:iconst_1        
	//   74  150:iadd            
	//   75  151:istore          4
		}
	//*  76  153:goto            110
		mNonDrawerViews.clear();
	//   77  156:aload_0         
	//   78  157:getfield        #293 <Field ArrayList mNonDrawerViews>
	//   79  160:invokevirtual   #307 <Method void ArrayList.clear()>
	//   80  163:return          
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.addView(view, i, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #313 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
		if(findOpenDrawer() == null && !isDrawerView(view))
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #316 <Method View findOpenDrawer()>
	//*   7   11:ifnonnull       33
	//*   8   14:aload_0         
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #261 <Method boolean isDrawerView(View)>
	//*  11   19:ifeq            25
	//*  12   22:goto            33
			ViewCompat.setImportantForAccessibility(view, 1);
	//   13   25:aload_1         
	//   14   26:iconst_1        
	//   15   27:invokestatic    #265 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		else
	//*  16   30:goto            38
			ViewCompat.setImportantForAccessibility(view, 4);
	//   17   33:aload_1         
	//   18   34:iconst_4        
	//   19   35:invokestatic    #265 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		if(!CAN_HIDE_DESCENDANTS)
	//*  20   38:getstatic       #93  <Field boolean CAN_HIDE_DESCENDANTS>
	//*  21   41:ifne            52
			ViewCompat.setAccessibilityDelegate(view, ((AccessibilityDelegateCompat) (mChildAccessibilityDelegate)));
	//   22   44:aload_1         
	//   23   45:aload_0         
	//   24   46:getfield        #318 <Field DrawerLayout$ChildAccessibilityDelegate mChildAccessibilityDelegate>
	//   25   49:invokestatic    #322 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
	//   26   52:return          
	}

	boolean checkDrawerViewAbsoluteGravity(View view, int i)
	{
		return (getDrawerViewAbsoluteGravity(view) & i) == i;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #327 <Method int getDrawerViewAbsoluteGravity(View)>
	//    3    5:iload_2         
	//    4    6:iand            
	//    5    7:iload_2         
	//    6    8:icmpne          13
	//    7   11:iconst_1        
	//    8   12:ireturn         
	//    9   13:iconst_0        
	//   10   14:ireturn         
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #12  <Class DrawerLayout$LayoutParams>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #331 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void closeDrawer(View view)
	{
		closeDrawer(view, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #335 <Method void closeDrawer(View, boolean)>
	//    4    6:return          
	}

	public void closeDrawer(View view, boolean flag)
	{
		if(isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #261 <Method boolean isDrawerView(View)>
	//*   3    5:ifeq            126
		{
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   12:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//    7   15:astore_3        
			if(mFirstLayout)
	//*   8   16:aload_0         
	//*   9   17:getfield        #337 <Field boolean mFirstLayout>
	//*  10   20:ifeq            36
			{
				layoutparams.onScreen = 0.0F;
	//   11   23:aload_3         
	//   12   24:fconst_0        
	//   13   25:putfield        #340 <Field float DrawerLayout$LayoutParams.onScreen>
				layoutparams.openState = 0;
	//   14   28:aload_3         
	//   15   29:iconst_0        
	//   16   30:putfield        #343 <Field int DrawerLayout$LayoutParams.openState>
			} else
	//*  17   33:goto            121
			if(flag)
	//*  18   36:iload_2         
	//*  19   37:ifeq            100
			{
				layoutparams.openState = layoutparams.openState | 4;
	//   20   40:aload_3         
	//   21   41:aload_3         
	//   22   42:getfield        #343 <Field int DrawerLayout$LayoutParams.openState>
	//   23   45:iconst_4        
	//   24   46:ior             
	//   25   47:putfield        #343 <Field int DrawerLayout$LayoutParams.openState>
				if(checkDrawerViewAbsoluteGravity(view, 3))
	//*  26   50:aload_0         
	//*  27   51:aload_1         
	//*  28   52:iconst_3        
	//*  29   53:invokevirtual   #345 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  30   56:ifeq            80
					mLeftDragger.smoothSlideViewTo(view, -view.getWidth(), view.getTop());
	//   31   59:aload_0         
	//   32   60:getfield        #347 <Field ViewDragHelper mLeftDragger>
	//   33   63:aload_1         
	//   34   64:aload_1         
	//   35   65:invokevirtual   #350 <Method int View.getWidth()>
	//   36   68:ineg            
	//   37   69:aload_1         
	//   38   70:invokevirtual   #136 <Method int View.getTop()>
	//   39   73:invokevirtual   #356 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   40   76:pop             
				else
	//*  41   77:goto            121
					mRightDragger.smoothSlideViewTo(view, getWidth(), view.getTop());
	//   42   80:aload_0         
	//   43   81:getfield        #358 <Field ViewDragHelper mRightDragger>
	//   44   84:aload_1         
	//   45   85:aload_0         
	//   46   86:invokevirtual   #359 <Method int getWidth()>
	//   47   89:aload_1         
	//   48   90:invokevirtual   #136 <Method int View.getTop()>
	//   49   93:invokevirtual   #356 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   50   96:pop             
			} else
	//*  51   97:goto            121
			{
				moveDrawerToOffset(view, 0.0F);
	//   52  100:aload_0         
	//   53  101:aload_1         
	//   54  102:fconst_0        
	//   55  103:invokevirtual   #363 <Method void moveDrawerToOffset(View, float)>
				updateDrawerState(layoutparams.gravity, 0, view);
	//   56  106:aload_0         
	//   57  107:aload_3         
	//   58  108:getfield        #366 <Field int DrawerLayout$LayoutParams.gravity>
	//   59  111:iconst_0        
	//   60  112:aload_1         
	//   61  113:invokevirtual   #370 <Method void updateDrawerState(int, int, View)>
				view.setVisibility(4);
	//   62  116:aload_1         
	//   63  117:iconst_4        
	//   64  118:invokevirtual   #374 <Method void View.setVisibility(int)>
			}
			invalidate();
	//   65  121:aload_0         
	//   66  122:invokevirtual   #377 <Method void invalidate()>
			return;
	//   67  125:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   68  126:new             #379 <Class StringBuilder>
	//   69  129:dup             
	//   70  130:invokespecial   #380 <Method void StringBuilder()>
	//   71  133:astore_3        
			stringbuilder.append("View ");
	//   72  134:aload_3         
	//   73  135:ldc2            #382 <String "View ">
	//   74  138:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//   75  141:pop             
			stringbuilder.append(((Object) (view)));
	//   76  142:aload_3         
	//   77  143:aload_1         
	//   78  144:invokevirtual   #389 <Method StringBuilder StringBuilder.append(Object)>
	//   79  147:pop             
			stringbuilder.append(" is not a sliding drawer");
	//   80  148:aload_3         
	//   81  149:ldc2            #391 <String " is not a sliding drawer">
	//   82  152:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//   83  155:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   84  156:new             #393 <Class IllegalArgumentException>
	//   85  159:dup             
	//   86  160:aload_3         
	//   87  161:invokevirtual   #397 <Method String StringBuilder.toString()>
	//   88  164:invokespecial   #400 <Method void IllegalArgumentException(String)>
	//   89  167:athrow          
		}
	}

	public void closeDrawers()
	{
		closeDrawers(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #404 <Method void closeDrawers(boolean)>
	//    3    5:return          
	}

	void closeDrawers(boolean flag)
	{
		int l = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method int getChildCount()>
	//    2    4:istore          5
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int i;
		int k;
		for(i = 0; j < l; i = k)
	//*   5    8:iconst_0        
	//*   6    9:istore_2        
	//*   7   10:iload_3         
	//*   8   11:iload           5
	//*   9   13:icmpge          143
		{
			View view = getChildAt(j);
	//   10   16:aload_0         
	//   11   17:iload_3         
	//   12   18:invokevirtual   #187 <Method View getChildAt(int)>
	//   13   21:astore          6
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   14   23:aload           6
	//   15   25:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   16   28:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//   17   31:astore          7
			k = i;
	//   18   33:iload_2         
	//   19   34:istore          4
			if(isDrawerView(view))
	//*  20   36:aload_0         
	//*  21   37:aload           6
	//*  22   39:invokevirtual   #261 <Method boolean isDrawerView(View)>
	//*  23   42:ifeq            133
				if(flag && !layoutparams.isPeeking)
	//*  24   45:iload_1         
	//*  25   46:ifeq            63
	//*  26   49:aload           7
	//*  27   51:getfield        #194 <Field boolean DrawerLayout$LayoutParams.isPeeking>
	//*  28   54:ifne            63
				{
					k = i;
	//   29   57:iload_2         
	//   30   58:istore          4
				} else
	//*  31   60:goto            133
				{
					k = view.getWidth();
	//   32   63:aload           6
	//   33   65:invokevirtual   #350 <Method int View.getWidth()>
	//   34   68:istore          4
					if(checkDrawerViewAbsoluteGravity(view, 3))
	//*  35   70:aload_0         
	//*  36   71:aload           6
	//*  37   73:iconst_3        
	//*  38   74:invokevirtual   #345 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  39   77:ifeq            103
						i |= ((int) (mLeftDragger.smoothSlideViewTo(view, -k, view.getTop())));
	//   40   80:iload_2         
	//   41   81:aload_0         
	//   42   82:getfield        #347 <Field ViewDragHelper mLeftDragger>
	//   43   85:aload           6
	//   44   87:iload           4
	//   45   89:ineg            
	//   46   90:aload           6
	//   47   92:invokevirtual   #136 <Method int View.getTop()>
	//   48   95:invokevirtual   #356 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   49   98:ior             
	//   50   99:istore_2        
					else
	//*  51  100:goto            124
						i |= ((int) (mRightDragger.smoothSlideViewTo(view, getWidth(), view.getTop())));
	//   52  103:iload_2         
	//   53  104:aload_0         
	//   54  105:getfield        #358 <Field ViewDragHelper mRightDragger>
	//   55  108:aload           6
	//   56  110:aload_0         
	//   57  111:invokevirtual   #359 <Method int getWidth()>
	//   58  114:aload           6
	//   59  116:invokevirtual   #136 <Method int View.getTop()>
	//   60  119:invokevirtual   #356 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   61  122:ior             
	//   62  123:istore_2        
					layoutparams.isPeeking = false;
	//   63  124:aload           7
	//   64  126:iconst_0        
	//   65  127:putfield        #194 <Field boolean DrawerLayout$LayoutParams.isPeeking>
					k = i;
	//   66  130:iload_2         
	//   67  131:istore          4
				}
			j++;
	//   68  133:iload_3         
	//   69  134:iconst_1        
	//   70  135:iadd            
	//   71  136:istore_3        
		}

	//   72  137:iload           4
	//   73  139:istore_2        
	//*  74  140:goto            10
		mLeftCallback.removeCallbacks();
	//   75  143:aload_0         
	//   76  144:getfield        #406 <Field DrawerLayout$ViewDragCallback mLeftCallback>
	//   77  147:invokevirtual   #409 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
		mRightCallback.removeCallbacks();
	//   78  150:aload_0         
	//   79  151:getfield        #411 <Field DrawerLayout$ViewDragCallback mRightCallback>
	//   80  154:invokevirtual   #409 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
		if(i != 0)
	//*  81  157:iload_2         
	//*  82  158:ifeq            165
			invalidate();
	//   83  161:aload_0         
	//   84  162:invokevirtual   #377 <Method void invalidate()>
	//   85  165:return          
	}

	public void computeScroll()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method int getChildCount()>
	//    2    4:istore_3        
		float f = 0.0F;
	//    3    5:fconst_0        
	//    4    6:fstore_1        
		for(int i = 0; i < j; i++)
	//*   5    7:iconst_0        
	//*   6    8:istore_2        
	//*   7    9:iload_2         
	//*   8   10:iload_3         
	//*   9   11:icmpge          40
			f = Math.max(f, ((LayoutParams)getChildAt(i).getLayoutParams()).onScreen);
	//   10   14:fload_1         
	//   11   15:aload_0         
	//   12   16:iload_2         
	//   13   17:invokevirtual   #187 <Method View getChildAt(int)>
	//   14   20:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   15   23:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//   16   26:getfield        #340 <Field float DrawerLayout$LayoutParams.onScreen>
	//   17   29:invokestatic    #418 <Method float Math.max(float, float)>
	//   18   32:fstore_1        

	//   19   33:iload_2         
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:istore_2        
	//*  23   37:goto            9
		mScrimOpacity = f;
	//   24   40:aload_0         
	//   25   41:fload_1         
	//   26   42:putfield        #420 <Field float mScrimOpacity>
		boolean flag = mLeftDragger.continueSettling(true);
	//   27   45:aload_0         
	//   28   46:getfield        #347 <Field ViewDragHelper mLeftDragger>
	//   29   49:iconst_1        
	//   30   50:invokevirtual   #424 <Method boolean ViewDragHelper.continueSettling(boolean)>
	//   31   53:istore          4
		boolean flag1 = mRightDragger.continueSettling(true);
	//   32   55:aload_0         
	//   33   56:getfield        #358 <Field ViewDragHelper mRightDragger>
	//   34   59:iconst_1        
	//   35   60:invokevirtual   #424 <Method boolean ViewDragHelper.continueSettling(boolean)>
	//   36   63:istore          5
		if(flag || flag1)
	//*  37   65:iload           4
	//*  38   67:ifne            75
	//*  39   70:iload           5
	//*  40   72:ifeq            79
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   41   75:aload_0         
	//   42   76:invokestatic    #427 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//   43   79:return          
	}

	public boolean dispatchGenericMotionEvent(MotionEvent motionevent)
	{
		if((motionevent.getSource() & 2) != 0 && motionevent.getAction() != 10 && mScrimOpacity > 0.0F)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #430 <Method int MotionEvent.getSource()>
	//*   2    4:iconst_2        
	//*   3    5:iand            
	//*   4    6:ifeq            116
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #433 <Method int MotionEvent.getAction()>
	//*   7   13:bipush          10
	//*   8   15:icmpeq          116
	//*   9   18:aload_0         
	//*  10   19:getfield        #420 <Field float mScrimOpacity>
	//*  11   22:fconst_0        
	//*  12   23:fcmpg           
	//*  13   24:ifgt            30
	//*  14   27:goto            116
		{
			int i = getChildCount();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #183 <Method int getChildCount()>
	//   17   34:istore          4
			if(i != 0)
	//*  18   36:iload           4
	//*  19   38:ifeq            114
			{
				float f = motionevent.getX();
	//   20   41:aload_1         
	//   21   42:invokevirtual   #437 <Method float MotionEvent.getX()>
	//   22   45:fstore_2        
				float f1 = motionevent.getY();
	//   23   46:aload_1         
	//   24   47:invokevirtual   #440 <Method float MotionEvent.getY()>
	//   25   50:fstore_3        
				for(i--; i >= 0; i--)
	//*  26   51:iload           4
	//*  27   53:iconst_1        
	//*  28   54:isub            
	//*  29   55:istore          4
	//*  30   57:iload           4
	//*  31   59:iflt            114
				{
					View view = getChildAt(i);
	//   32   62:aload_0         
	//   33   63:iload           4
	//   34   65:invokevirtual   #187 <Method View getChildAt(int)>
	//   35   68:astore          5
					if(isInBoundsOfChild(f, f1, view) && !isContentView(view) && dispatchTransformedGenericPointerEvent(motionevent, view))
	//*  36   70:aload_0         
	//*  37   71:fload_2         
	//*  38   72:fload_3         
	//*  39   73:aload           5
	//*  40   75:invokespecial   #442 <Method boolean isInBoundsOfChild(float, float, View)>
	//*  41   78:ifeq            105
	//*  42   81:aload_0         
	//*  43   82:aload           5
	//*  44   84:invokevirtual   #445 <Method boolean isContentView(View)>
	//*  45   87:ifeq            93
	//*  46   90:goto            105
	//*  47   93:aload_0         
	//*  48   94:aload_1         
	//*  49   95:aload           5
	//*  50   97:invokespecial   #447 <Method boolean dispatchTransformedGenericPointerEvent(MotionEvent, View)>
	//*  51  100:ifeq            105
						return true;
	//   52  103:iconst_1        
	//   53  104:ireturn         
				}

	//   54  105:iload           4
	//   55  107:iconst_1        
	//   56  108:isub            
	//   57  109:istore          4
			}
	//*  58  111:goto            57
			return false;
	//   59  114:iconst_0        
	//   60  115:ireturn         
		} else
		{
			return super.dispatchGenericMotionEvent(motionevent);
	//   61  116:aload_0         
	//   62  117:aload_1         
	//   63  118:invokespecial   #448 <Method boolean ViewGroup.dispatchGenericMotionEvent(MotionEvent)>
	//   64  121:ireturn         
		}
	}

	void dispatchOnDrawerClosed(View view)
	{
		Object obj = ((Object) ((LayoutParams)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//    3    7:astore_3        
		if((((LayoutParams) (obj)).openState & 1) == 1)
	//*   4    8:aload_3         
	//*   5    9:getfield        #343 <Field int DrawerLayout$LayoutParams.openState>
	//*   6   12:iconst_1        
	//*   7   13:iand            
	//*   8   14:iconst_1        
	//*   9   15:icmpne          99
		{
			obj.openState = 0;
	//   10   18:aload_3         
	//   11   19:iconst_0        
	//   12   20:putfield        #343 <Field int DrawerLayout$LayoutParams.openState>
			obj = ((Object) (mListeners));
	//   13   23:aload_0         
	//   14   24:getfield        #270 <Field List mListeners>
	//   15   27:astore_3        
			if(obj != null)
	//*  16   28:aload_3         
	//*  17   29:ifnull          71
			{
				for(int i = ((List) (obj)).size() - 1; i >= 0; i--)
	//*  18   32:aload_3         
	//*  19   33:invokeinterface #450 <Method int List.size()>
	//*  20   38:iconst_1        
	//*  21   39:isub            
	//*  22   40:istore_2        
	//*  23   41:iload_2         
	//*  24   42:iflt            71
					((DrawerListener)mListeners.get(i)).onDrawerClosed(view);
	//   25   45:aload_0         
	//   26   46:getfield        #270 <Field List mListeners>
	//   27   49:iload_2         
	//   28   50:invokeinterface #451 <Method Object List.get(int)>
	//   29   55:checkcast       #9   <Class DrawerLayout$DrawerListener>
	//   30   58:aload_1         
	//   31   59:invokeinterface #454 <Method void DrawerLayout$DrawerListener.onDrawerClosed(View)>

	//   32   64:iload_2         
	//   33   65:iconst_1        
	//   34   66:isub            
	//   35   67:istore_2        
			}
	//*  36   68:goto            41
			updateChildrenImportantForAccessibility(view, false);
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:iconst_0        
	//   40   74:invokespecial   #456 <Method void updateChildrenImportantForAccessibility(View, boolean)>
			if(hasWindowFocus())
	//*  41   77:aload_0         
	//*  42   78:invokevirtual   #459 <Method boolean hasWindowFocus()>
	//*  43   81:ifeq            99
			{
				view = getRootView();
	//   44   84:aload_0         
	//   45   85:invokevirtual   #462 <Method View getRootView()>
	//   46   88:astore_1        
				if(view != null)
	//*  47   89:aload_1         
	//*  48   90:ifnull          99
					view.sendAccessibilityEvent(32);
	//   49   93:aload_1         
	//   50   94:bipush          32
	//   51   96:invokevirtual   #465 <Method void View.sendAccessibilityEvent(int)>
			}
		}
	//   52   99:return          
	}

	void dispatchOnDrawerOpened(View view)
	{
		Object obj = ((Object) ((LayoutParams)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//    3    7:astore_3        
		if((((LayoutParams) (obj)).openState & 1) == 0)
	//*   4    8:aload_3         
	//*   5    9:getfield        #343 <Field int DrawerLayout$LayoutParams.openState>
	//*   6   12:iconst_1        
	//*   7   13:iand            
	//*   8   14:ifne            89
		{
			obj.openState = 1;
	//    9   17:aload_3         
	//   10   18:iconst_1        
	//   11   19:putfield        #343 <Field int DrawerLayout$LayoutParams.openState>
			obj = ((Object) (mListeners));
	//   12   22:aload_0         
	//   13   23:getfield        #270 <Field List mListeners>
	//   14   26:astore_3        
			if(obj != null)
	//*  15   27:aload_3         
	//*  16   28:ifnull          70
			{
				for(int i = ((List) (obj)).size() - 1; i >= 0; i--)
	//*  17   31:aload_3         
	//*  18   32:invokeinterface #450 <Method int List.size()>
	//*  19   37:iconst_1        
	//*  20   38:isub            
	//*  21   39:istore_2        
	//*  22   40:iload_2         
	//*  23   41:iflt            70
					((DrawerListener)mListeners.get(i)).onDrawerOpened(view);
	//   24   44:aload_0         
	//   25   45:getfield        #270 <Field List mListeners>
	//   26   48:iload_2         
	//   27   49:invokeinterface #451 <Method Object List.get(int)>
	//   28   54:checkcast       #9   <Class DrawerLayout$DrawerListener>
	//   29   57:aload_1         
	//   30   58:invokeinterface #469 <Method void DrawerLayout$DrawerListener.onDrawerOpened(View)>

	//   31   63:iload_2         
	//   32   64:iconst_1        
	//   33   65:isub            
	//   34   66:istore_2        
			}
	//*  35   67:goto            40
			updateChildrenImportantForAccessibility(view, true);
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:iconst_1        
	//   39   73:invokespecial   #456 <Method void updateChildrenImportantForAccessibility(View, boolean)>
			if(hasWindowFocus())
	//*  40   76:aload_0         
	//*  41   77:invokevirtual   #459 <Method boolean hasWindowFocus()>
	//*  42   80:ifeq            89
				sendAccessibilityEvent(32);
	//   43   83:aload_0         
	//   44   84:bipush          32
	//   45   86:invokevirtual   #470 <Method void sendAccessibilityEvent(int)>
		}
	//   46   89:return          
	}

	void dispatchOnDrawerSlide(View view, float f)
	{
		List list = mListeners;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field List mListeners>
	//    2    4:astore          4
		if(list != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          52
		{
			for(int i = list.size() - 1; i >= 0; i--)
	//*   5   11:aload           4
	//*   6   13:invokeinterface #450 <Method int List.size()>
	//*   7   18:iconst_1        
	//*   8   19:isub            
	//*   9   20:istore_3        
	//*  10   21:iload_3         
	//*  11   22:iflt            52
				((DrawerListener)mListeners.get(i)).onDrawerSlide(view, f);
	//   12   25:aload_0         
	//   13   26:getfield        #270 <Field List mListeners>
	//   14   29:iload_3         
	//   15   30:invokeinterface #451 <Method Object List.get(int)>
	//   16   35:checkcast       #9   <Class DrawerLayout$DrawerListener>
	//   17   38:aload_1         
	//   18   39:fload_2         
	//   19   40:invokeinterface #474 <Method void DrawerLayout$DrawerListener.onDrawerSlide(View, float)>

	//   20   45:iload_3         
	//   21   46:iconst_1        
	//   22   47:isub            
	//   23   48:istore_3        
		}
	//*  24   49:goto            21
	//   25   52:return          
	}

	protected boolean drawChild(Canvas canvas, View view, long l)
	{
		int k4 = getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #479 <Method int getHeight()>
	//    2    4:istore          13
		boolean flag = isContentView(view);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:invokevirtual   #445 <Method boolean isContentView(View)>
	//    6   11:istore          15
		int i = getWidth();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #359 <Method int getWidth()>
	//    9   17:istore          6
		int j4 = canvas.save();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #484 <Method int Canvas.save()>
	//   12   23:istore          12
		int i1 = 0;
	//   13   25:iconst_0        
	//   14   26:istore          7
		if(flag)
	//*  15   28:iload           15
	//*  16   30:ifeq            251
		{
			int l4 = getChildCount();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #183 <Method int getChildCount()>
	//   19   37:istore          14
			int l1 = 0;
	//   20   39:iconst_0        
	//   21   40:istore          8
			i1 = 0;
	//   22   42:iconst_0        
	//   23   43:istore          7
			while(l1 < l4) 
	//*  24   45:iload           8
	//*  25   47:iload           14
	//*  26   49:icmpge          234
			{
				View view1 = getChildAt(l1);
	//   27   52:aload_0         
	//   28   53:iload           8
	//   29   55:invokevirtual   #187 <Method View getChildAt(int)>
	//   30   58:astore          17
				int l2 = i1;
	//   31   60:iload           7
	//   32   62:istore          9
				int k3 = i;
	//   33   64:iload           6
	//   34   66:istore          10
				if(view1 != view)
	//*  35   68:aload           17
	//*  36   70:aload_2         
	//*  37   71:if_acmpeq       217
				{
					l2 = i1;
	//   38   74:iload           7
	//   39   76:istore          9
					k3 = i;
	//   40   78:iload           6
	//   41   80:istore          10
					if(view1.getVisibility() == 0)
	//*  42   82:aload           17
	//*  43   84:invokevirtual   #304 <Method int View.getVisibility()>
	//*  44   87:ifne            217
					{
						l2 = i1;
	//   45   90:iload           7
	//   46   92:istore          9
						k3 = i;
	//   47   94:iload           6
	//   48   96:istore          10
						if(hasOpaqueBackground(view1))
	//*  49   98:aload           17
	//*  50  100:invokestatic    #486 <Method boolean hasOpaqueBackground(View)>
	//*  51  103:ifeq            217
						{
							l2 = i1;
	//   52  106:iload           7
	//   53  108:istore          9
							k3 = i;
	//   54  110:iload           6
	//   55  112:istore          10
							if(isDrawerView(view1))
	//*  56  114:aload_0         
	//*  57  115:aload           17
	//*  58  117:invokevirtual   #261 <Method boolean isDrawerView(View)>
	//*  59  120:ifeq            217
								if(view1.getHeight() < k4)
	//*  60  123:aload           17
	//*  61  125:invokevirtual   #487 <Method int View.getHeight()>
	//*  62  128:iload           13
	//*  63  130:icmpge          144
								{
									l2 = i1;
	//   64  133:iload           7
	//   65  135:istore          9
									k3 = i;
	//   66  137:iload           6
	//   67  139:istore          10
								} else
	//*  68  141:goto            217
								if(checkDrawerViewAbsoluteGravity(view1, 3))
	//*  69  144:aload_0         
	//*  70  145:aload           17
	//*  71  147:iconst_3        
	//*  72  148:invokevirtual   #345 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  73  151:ifeq            187
								{
									int l3 = view1.getRight();
	//   74  154:aload           17
	//   75  156:invokevirtual   #490 <Method int View.getRight()>
	//   76  159:istore          11
									l2 = i1;
	//   77  161:iload           7
	//   78  163:istore          9
									k3 = i;
	//   79  165:iload           6
	//   80  167:istore          10
									if(l3 > i1)
	//*  81  169:iload           11
	//*  82  171:iload           7
	//*  83  173:icmple          217
									{
										l2 = l3;
	//   84  176:iload           11
	//   85  178:istore          9
										k3 = i;
	//   86  180:iload           6
	//   87  182:istore          10
									}
								} else
	//*  88  184:goto            217
								{
									int i4 = view1.getLeft();
	//   89  187:aload           17
	//   90  189:invokevirtual   #130 <Method int View.getLeft()>
	//   91  192:istore          11
									l2 = i1;
	//   92  194:iload           7
	//   93  196:istore          9
									k3 = i;
	//   94  198:iload           6
	//   95  200:istore          10
									if(i4 < i)
	//*  96  202:iload           11
	//*  97  204:iload           6
	//*  98  206:icmpge          217
									{
										k3 = i4;
	//   99  209:iload           11
	//  100  211:istore          10
										l2 = i1;
	//  101  213:iload           7
	//  102  215:istore          9
									}
								}
						}
					}
				}
				l1++;
	//  103  217:iload           8
	//  104  219:iconst_1        
	//  105  220:iadd            
	//  106  221:istore          8
				i1 = l2;
	//  107  223:iload           9
	//  108  225:istore          7
				i = k3;
	//  109  227:iload           10
	//  110  229:istore          6
			}
	//* 111  231:goto            45
			canvas.clipRect(i1, 0, i, getHeight());
	//  112  234:aload_1         
	//  113  235:iload           7
	//  114  237:iconst_0        
	//  115  238:iload           6
	//  116  240:aload_0         
	//  117  241:invokevirtual   #479 <Method int getHeight()>
	//  118  244:invokevirtual   #494 <Method boolean Canvas.clipRect(int, int, int, int)>
	//  119  247:pop             
		}
	//* 120  248:goto            251
		boolean flag1 = super.drawChild(canvas, view, l);
	//  121  251:aload_0         
	//  122  252:aload_1         
	//  123  253:aload_2         
	//  124  254:lload_3         
	//  125  255:invokespecial   #496 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//  126  258:istore          16
		canvas.restoreToCount(j4);
	//  127  260:aload_1         
	//  128  261:iload           12
	//  129  263:invokevirtual   #499 <Method void Canvas.restoreToCount(int)>
		float f = mScrimOpacity;
	//  130  266:aload_0         
	//  131  267:getfield        #420 <Field float mScrimOpacity>
	//  132  270:fstore          5
		if(f > 0.0F && flag)
	//* 133  272:fload           5
	//* 134  274:fconst_0        
	//* 135  275:fcmpl           
	//* 136  276:ifle            348
	//* 137  279:iload           15
	//* 138  281:ifeq            348
		{
			int i2 = mScrimColor;
	//  139  284:aload_0         
	//  140  285:getfield        #501 <Field int mScrimColor>
	//  141  288:istore          8
			int i3 = (int)((float)((0xff000000 & i2) >>> 24) * f);
	//  142  290:ldc2            #502 <Int 0xff000000>
	//  143  293:iload           8
	//  144  295:iand            
	//  145  296:bipush          24
	//  146  298:iushr           
	//  147  299:i2f             
	//  148  300:fload           5
	//  149  302:fmul            
	//  150  303:f2i             
	//  151  304:istore          9
			mScrimPaint.setColor(i2 & 0xffffff | i3 << 24);
	//  152  306:aload_0         
	//  153  307:getfield        #504 <Field Paint mScrimPaint>
	//  154  310:iload           8
	//  155  312:ldc2            #505 <Int 0xffffff>
	//  156  315:iand            
	//  157  316:iload           9
	//  158  318:bipush          24
	//  159  320:ishl            
	//  160  321:ior             
	//  161  322:invokevirtual   #510 <Method void Paint.setColor(int)>
			canvas.drawRect(i1, 0.0F, i, getHeight(), mScrimPaint);
	//  162  325:aload_1         
	//  163  326:iload           7
	//  164  328:i2f             
	//  165  329:fconst_0        
	//  166  330:iload           6
	//  167  332:i2f             
	//  168  333:aload_0         
	//  169  334:invokevirtual   #479 <Method int getHeight()>
	//  170  337:i2f             
	//  171  338:aload_0         
	//  172  339:getfield        #504 <Field Paint mScrimPaint>
	//  173  342:invokevirtual   #514 <Method void Canvas.drawRect(float, float, float, float, Paint)>
			return flag1;
	//  174  345:iload           16
	//  175  347:ireturn         
		}
		if(mShadowLeftResolved != null && checkDrawerViewAbsoluteGravity(view, 3))
	//* 176  348:aload_0         
	//* 177  349:getfield        #252 <Field Drawable mShadowLeftResolved>
	//* 178  352:ifnull          452
	//* 179  355:aload_0         
	//* 180  356:aload_2         
	//* 181  357:iconst_3        
	//* 182  358:invokevirtual   #345 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//* 183  361:ifeq            452
		{
			int j = mShadowLeftResolved.getIntrinsicWidth();
	//  184  364:aload_0         
	//  185  365:getfield        #252 <Field Drawable mShadowLeftResolved>
	//  186  368:invokevirtual   #517 <Method int Drawable.getIntrinsicWidth()>
	//  187  371:istore          6
			int j1 = view.getRight();
	//  188  373:aload_2         
	//  189  374:invokevirtual   #490 <Method int View.getRight()>
	//  190  377:istore          7
			int j2 = mLeftDragger.getEdgeSize();
	//  191  379:aload_0         
	//  192  380:getfield        #347 <Field ViewDragHelper mLeftDragger>
	//  193  383:invokevirtual   #520 <Method int ViewDragHelper.getEdgeSize()>
	//  194  386:istore          8
			float f1 = Math.max(0.0F, Math.min((float)j1 / (float)j2, 1.0F));
	//  195  388:fconst_0        
	//  196  389:iload           7
	//  197  391:i2f             
	//  198  392:iload           8
	//  199  394:i2f             
	//  200  395:fdiv            
	//  201  396:fconst_1        
	//  202  397:invokestatic    #523 <Method float Math.min(float, float)>
	//  203  400:invokestatic    #418 <Method float Math.max(float, float)>
	//  204  403:fstore          5
			mShadowLeftResolved.setBounds(j1, view.getTop(), j + j1, view.getBottom());
	//  205  405:aload_0         
	//  206  406:getfield        #252 <Field Drawable mShadowLeftResolved>
	//  207  409:iload           7
	//  208  411:aload_2         
	//  209  412:invokevirtual   #136 <Method int View.getTop()>
	//  210  415:iload           6
	//  211  417:iload           7
	//  212  419:iadd            
	//  213  420:aload_2         
	//  214  421:invokevirtual   #526 <Method int View.getBottom()>
	//  215  424:invokevirtual   #530 <Method void Drawable.setBounds(int, int, int, int)>
			mShadowLeftResolved.setAlpha((int)(f1 * 255F));
	//  216  427:aload_0         
	//  217  428:getfield        #252 <Field Drawable mShadowLeftResolved>
	//  218  431:fload           5
	//  219  433:ldc2            #531 <Float 255F>
	//  220  436:fmul            
	//  221  437:f2i             
	//  222  438:invokevirtual   #534 <Method void Drawable.setAlpha(int)>
			mShadowLeftResolved.draw(canvas);
	//  223  441:aload_0         
	//  224  442:getfield        #252 <Field Drawable mShadowLeftResolved>
	//  225  445:aload_1         
	//  226  446:invokevirtual   #538 <Method void Drawable.draw(Canvas)>
			return flag1;
	//  227  449:iload           16
	//  228  451:ireturn         
		}
		if(mShadowRightResolved != null && checkDrawerViewAbsoluteGravity(view, 5))
	//* 229  452:aload_0         
	//* 230  453:getfield        #256 <Field Drawable mShadowRightResolved>
	//* 231  456:ifnull          562
	//* 232  459:aload_0         
	//* 233  460:aload_2         
	//* 234  461:iconst_5        
	//* 235  462:invokevirtual   #345 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//* 236  465:ifeq            562
		{
			int k = mShadowRightResolved.getIntrinsicWidth();
	//  237  468:aload_0         
	//  238  469:getfield        #256 <Field Drawable mShadowRightResolved>
	//  239  472:invokevirtual   #517 <Method int Drawable.getIntrinsicWidth()>
	//  240  475:istore          6
			int k1 = view.getLeft();
	//  241  477:aload_2         
	//  242  478:invokevirtual   #130 <Method int View.getLeft()>
	//  243  481:istore          7
			int k2 = getWidth();
	//  244  483:aload_0         
	//  245  484:invokevirtual   #359 <Method int getWidth()>
	//  246  487:istore          8
			int j3 = mRightDragger.getEdgeSize();
	//  247  489:aload_0         
	//  248  490:getfield        #358 <Field ViewDragHelper mRightDragger>
	//  249  493:invokevirtual   #520 <Method int ViewDragHelper.getEdgeSize()>
	//  250  496:istore          9
			float f2 = Math.max(0.0F, Math.min((float)(k2 - k1) / (float)j3, 1.0F));
	//  251  498:fconst_0        
	//  252  499:iload           8
	//  253  501:iload           7
	//  254  503:isub            
	//  255  504:i2f             
	//  256  505:iload           9
	//  257  507:i2f             
	//  258  508:fdiv            
	//  259  509:fconst_1        
	//  260  510:invokestatic    #523 <Method float Math.min(float, float)>
	//  261  513:invokestatic    #418 <Method float Math.max(float, float)>
	//  262  516:fstore          5
			mShadowRightResolved.setBounds(k1 - k, view.getTop(), k1, view.getBottom());
	//  263  518:aload_0         
	//  264  519:getfield        #256 <Field Drawable mShadowRightResolved>
	//  265  522:iload           7
	//  266  524:iload           6
	//  267  526:isub            
	//  268  527:aload_2         
	//  269  528:invokevirtual   #136 <Method int View.getTop()>
	//  270  531:iload           7
	//  271  533:aload_2         
	//  272  534:invokevirtual   #526 <Method int View.getBottom()>
	//  273  537:invokevirtual   #530 <Method void Drawable.setBounds(int, int, int, int)>
			mShadowRightResolved.setAlpha((int)(f2 * 255F));
	//  274  540:aload_0         
	//  275  541:getfield        #256 <Field Drawable mShadowRightResolved>
	//  276  544:fload           5
	//  277  546:ldc2            #531 <Float 255F>
	//  278  549:fmul            
	//  279  550:f2i             
	//  280  551:invokevirtual   #534 <Method void Drawable.setAlpha(int)>
			mShadowRightResolved.draw(canvas);
	//  281  554:aload_0         
	//  282  555:getfield        #256 <Field Drawable mShadowRightResolved>
	//  283  558:aload_1         
	//  284  559:invokevirtual   #538 <Method void Drawable.draw(Canvas)>
		}
		return flag1;
	//  285  562:iload           16
	//  286  564:ireturn         
	}

	View findDrawerWithGravity(int i)
	{
		int j = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(((View) (this))));
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #236 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    5:invokestatic    #545 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    4    8:istore_2        
		int k = getChildCount();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #183 <Method int getChildCount()>
	//    7   13:istore_3        
		for(i = 0; i < k; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_3         
	//*  12   18:icmpge          54
		{
			View view = getChildAt(i);
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:invokevirtual   #187 <Method View getChildAt(int)>
	//   16   26:astore          4
			if((getDrawerViewAbsoluteGravity(view) & 7) == (j & 7))
	//*  17   28:aload_0         
	//*  18   29:aload           4
	//*  19   31:invokevirtual   #327 <Method int getDrawerViewAbsoluteGravity(View)>
	//*  20   34:bipush          7
	//*  21   36:iand            
	//*  22   37:iload_2         
	//*  23   38:bipush          7
	//*  24   40:iand            
	//*  25   41:icmpne          47
				return view;
	//   26   44:aload           4
	//   27   46:areturn         
		}

	//   28   47:iload_1         
	//   29   48:iconst_1        
	//   30   49:iadd            
	//   31   50:istore_1        
	//*  32   51:goto            16
		return null;
	//   33   54:aconst_null     
	//   34   55:areturn         
	}

	View findOpenDrawer()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          43
		{
			View view = getChildAt(i);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #187 <Method View getChildAt(int)>
	//   11   17:astore_3        
			if((((LayoutParams)view.getLayoutParams()).openState & 1) == 1)
	//*  12   18:aload_3         
	//*  13   19:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  14   22:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//*  15   25:getfield        #343 <Field int DrawerLayout$LayoutParams.openState>
	//*  16   28:iconst_1        
	//*  17   29:iand            
	//*  18   30:iconst_1        
	//*  19   31:icmpne          36
				return view;
	//   20   34:aload_3         
	//   21   35:areturn         
		}

	//   22   36:iload_1         
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:istore_1        
	//*  26   40:goto            7
		return null;
	//   27   43:aconst_null     
	//   28   44:areturn         
	}

	View findVisibleDrawer()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          43
		{
			View view = getChildAt(i);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #187 <Method View getChildAt(int)>
	//   11   17:astore_3        
			if(isDrawerView(view) && isDrawerVisible(view))
	//*  12   18:aload_0         
	//*  13   19:aload_3         
	//*  14   20:invokevirtual   #261 <Method boolean isDrawerView(View)>
	//*  15   23:ifeq            36
	//*  16   26:aload_0         
	//*  17   27:aload_3         
	//*  18   28:invokevirtual   #548 <Method boolean isDrawerVisible(View)>
	//*  19   31:ifeq            36
				return view;
	//   20   34:aload_3         
	//   21   35:areturn         
		}

	//   22   36:iload_1         
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:istore_1        
	//*  26   40:goto            7
		return null;
	//   27   43:aconst_null     
	//   28   44:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(-1, -1)));
	//    0    0:new             #12  <Class DrawerLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:iconst_m1       
	//    4    6:invokespecial   #552 <Method void DrawerLayout$LayoutParams(int, int)>
	//    5    9:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #12  <Class DrawerLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #558 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #561 <Method void DrawerLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof LayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #12  <Class DrawerLayout$LayoutParams>
	//*   2    4:ifeq            19
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams((LayoutParams)layoutparams)));
	//    3    7:new             #12  <Class DrawerLayout$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//    7   15:invokespecial   #565 <Method void DrawerLayout$LayoutParams(DrawerLayout$LayoutParams)>
	//    8   18:areturn         
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #567 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  11   23:ifeq            38
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams)));
	//   12   26:new             #12  <Class DrawerLayout$LayoutParams>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:checkcast       #567 <Class android.view.ViewGroup$MarginLayoutParams>
	//   16   34:invokespecial   #570 <Method void DrawerLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   17   37:areturn         
		else
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(layoutparams)));
	//   18   38:new             #12  <Class DrawerLayout$LayoutParams>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:invokespecial   #573 <Method void DrawerLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   22   46:areturn         
	}

	public float getDrawerElevation()
	{
		if(SET_DRAWER_SHADOW_FROM_ELEVATION)
	//*   0    0:getstatic       #95  <Field boolean SET_DRAWER_SHADOW_FROM_ELEVATION>
	//*   1    3:ifeq            11
			return mDrawerElevation;
	//    2    6:aload_0         
	//    3    7:getfield        #576 <Field float mDrawerElevation>
	//    4   10:freturn         
		else
			return 0.0F;
	//    5   11:fconst_0        
	//    6   12:freturn         
	}

	public int getDrawerLockMode(int i)
	{
		int j = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #236 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_2        
		if(i != 3)
	//*   3    5:iload_1         
	//*   4    6:iconst_3        
	//*   5    7:icmpeq          140
		{
			if(i != 5)
	//*   6   10:iload_1         
	//*   7   11:iconst_5        
	//*   8   12:icmpeq          104
			{
				if(i != 0x800003)
	//*   9   15:iload_1         
	//*  10   16:ldc2            #579 <Int 0x800003>
	//*  11   19:icmpeq          68
				{
					if(i == 0x800005)
	//*  12   22:iload_1         
	//*  13   23:ldc2            #580 <Int 0x800005>
	//*  14   26:icmpeq          32
	//*  15   29:goto            176
					{
						i = mLockModeEnd;
	//   16   32:aload_0         
	//   17   33:getfield        #582 <Field int mLockModeEnd>
	//   18   36:istore_1        
						if(i != 3)
	//*  19   37:iload_1         
	//*  20   38:iconst_3        
	//*  21   39:icmpeq          44
							return i;
	//   22   42:iload_1         
	//   23   43:ireturn         
						if(j == 0)
	//*  24   44:iload_2         
	//*  25   45:ifne            56
							i = mLockModeRight;
	//   26   48:aload_0         
	//   27   49:getfield        #584 <Field int mLockModeRight>
	//   28   52:istore_1        
						else
	//*  29   53:goto            61
							i = mLockModeLeft;
	//   30   56:aload_0         
	//   31   57:getfield        #586 <Field int mLockModeLeft>
	//   32   60:istore_1        
						if(i != 3)
	//*  33   61:iload_1         
	//*  34   62:iconst_3        
	//*  35   63:icmpeq          176
							return i;
	//   36   66:iload_1         
	//   37   67:ireturn         
					}
				} else
				{
					i = mLockModeStart;
	//   38   68:aload_0         
	//   39   69:getfield        #588 <Field int mLockModeStart>
	//   40   72:istore_1        
					if(i != 3)
	//*  41   73:iload_1         
	//*  42   74:iconst_3        
	//*  43   75:icmpeq          80
						return i;
	//   44   78:iload_1         
	//   45   79:ireturn         
					if(j == 0)
	//*  46   80:iload_2         
	//*  47   81:ifne            92
						i = mLockModeLeft;
	//   48   84:aload_0         
	//   49   85:getfield        #586 <Field int mLockModeLeft>
	//   50   88:istore_1        
					else
	//*  51   89:goto            97
						i = mLockModeRight;
	//   52   92:aload_0         
	//   53   93:getfield        #584 <Field int mLockModeRight>
	//   54   96:istore_1        
					if(i != 3)
	//*  55   97:iload_1         
	//*  56   98:iconst_3        
	//*  57   99:icmpeq          176
						return i;
	//   58  102:iload_1         
	//   59  103:ireturn         
				}
			} else
			{
				i = mLockModeRight;
	//   60  104:aload_0         
	//   61  105:getfield        #584 <Field int mLockModeRight>
	//   62  108:istore_1        
				if(i != 3)
	//*  63  109:iload_1         
	//*  64  110:iconst_3        
	//*  65  111:icmpeq          116
					return i;
	//   66  114:iload_1         
	//   67  115:ireturn         
				if(j == 0)
	//*  68  116:iload_2         
	//*  69  117:ifne            128
					i = mLockModeEnd;
	//   70  120:aload_0         
	//   71  121:getfield        #582 <Field int mLockModeEnd>
	//   72  124:istore_1        
				else
	//*  73  125:goto            133
					i = mLockModeStart;
	//   74  128:aload_0         
	//   75  129:getfield        #588 <Field int mLockModeStart>
	//   76  132:istore_1        
				if(i != 3)
	//*  77  133:iload_1         
	//*  78  134:iconst_3        
	//*  79  135:icmpeq          176
					return i;
	//   80  138:iload_1         
	//   81  139:ireturn         
			}
		} else
		{
			i = mLockModeLeft;
	//   82  140:aload_0         
	//   83  141:getfield        #586 <Field int mLockModeLeft>
	//   84  144:istore_1        
			if(i != 3)
	//*  85  145:iload_1         
	//*  86  146:iconst_3        
	//*  87  147:icmpeq          152
				return i;
	//   88  150:iload_1         
	//   89  151:ireturn         
			if(j == 0)
	//*  90  152:iload_2         
	//*  91  153:ifne            164
				i = mLockModeStart;
	//   92  156:aload_0         
	//   93  157:getfield        #588 <Field int mLockModeStart>
	//   94  160:istore_1        
			else
	//*  95  161:goto            169
				i = mLockModeEnd;
	//   96  164:aload_0         
	//   97  165:getfield        #582 <Field int mLockModeEnd>
	//   98  168:istore_1        
			if(i != 3)
	//*  99  169:iload_1         
	//* 100  170:iconst_3        
	//* 101  171:icmpeq          176
				return i;
	//  102  174:iload_1         
	//  103  175:ireturn         
		}
		return 0;
	//  104  176:iconst_0        
	//  105  177:ireturn         
	}

	public int getDrawerLockMode(View view)
	{
		if(isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #261 <Method boolean isDrawerView(View)>
	//*   3    5:ifeq            23
		{
			return getDrawerLockMode(((LayoutParams)view.getLayoutParams()).gravity);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    7   13:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//    8   16:getfield        #366 <Field int DrawerLayout$LayoutParams.gravity>
	//    9   19:invokevirtual   #590 <Method int getDrawerLockMode(int)>
	//   10   22:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   23:new             #379 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #380 <Method void StringBuilder()>
	//   14   30:astore_2        
			stringbuilder.append("View ");
	//   15   31:aload_2         
	//   16   32:ldc2            #382 <String "View ">
	//   17   35:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
			stringbuilder.append(((Object) (view)));
	//   19   39:aload_2         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #389 <Method StringBuilder StringBuilder.append(Object)>
	//   22   44:pop             
			stringbuilder.append(" is not a drawer");
	//   23   45:aload_2         
	//   24   46:ldc2            #592 <String " is not a drawer">
	//   25   49:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   27   53:new             #393 <Class IllegalArgumentException>
	//   28   56:dup             
	//   29   57:aload_2         
	//   30   58:invokevirtual   #397 <Method String StringBuilder.toString()>
	//   31   61:invokespecial   #400 <Method void IllegalArgumentException(String)>
	//   32   64:athrow          
		}
	}

	int getDrawerViewAbsoluteGravity(View view)
	{
		return GravityCompat.getAbsoluteGravity(((LayoutParams)view.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(((View) (this))));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #366 <Field int DrawerLayout$LayoutParams.gravity>
	//    4   10:aload_0         
	//    5   11:invokestatic    #236 <Method int ViewCompat.getLayoutDirection(View)>
	//    6   14:invokestatic    #545 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    7   17:ireturn         
	}

	float getDrawerViewOffset(View view)
	{
		return ((LayoutParams)view.getLayoutParams()).onScreen;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #340 <Field float DrawerLayout$LayoutParams.onScreen>
	//    4   10:freturn         
	}

	public Drawable getStatusBarBackgroundDrawable()
	{
		return mStatusBarBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #597 <Field Drawable mStatusBarBackground>
	//    2    4:areturn         
	}

	boolean isContentView(View view)
	{
		return ((LayoutParams)view.getLayoutParams()).gravity == 0;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #366 <Field int DrawerLayout$LayoutParams.gravity>
	//    4   10:ifne            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean isDrawerOpen(View view)
	{
		if(isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #261 <Method boolean isDrawerView(View)>
	//*   3    5:ifeq            28
		{
			return (((LayoutParams)view.getLayoutParams()).openState & 1) == 1;
	//    4    8:aload_1         
	//    5    9:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   12:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//    7   15:getfield        #343 <Field int DrawerLayout$LayoutParams.openState>
	//    8   18:iconst_1        
	//    9   19:iand            
	//   10   20:iconst_1        
	//   11   21:icmpne          26
	//   12   24:iconst_1        
	//   13   25:ireturn         
	//   14   26:iconst_0        
	//   15   27:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   16   28:new             #379 <Class StringBuilder>
	//   17   31:dup             
	//   18   32:invokespecial   #380 <Method void StringBuilder()>
	//   19   35:astore_2        
			stringbuilder.append("View ");
	//   20   36:aload_2         
	//   21   37:ldc2            #382 <String "View ">
	//   22   40:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
			stringbuilder.append(((Object) (view)));
	//   24   44:aload_2         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #389 <Method StringBuilder StringBuilder.append(Object)>
	//   27   49:pop             
			stringbuilder.append(" is not a drawer");
	//   28   50:aload_2         
	//   29   51:ldc2            #592 <String " is not a drawer">
	//   30   54:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//   31   57:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   32   58:new             #393 <Class IllegalArgumentException>
	//   33   61:dup             
	//   34   62:aload_2         
	//   35   63:invokevirtual   #397 <Method String StringBuilder.toString()>
	//   36   66:invokespecial   #400 <Method void IllegalArgumentException(String)>
	//   37   69:athrow          
		}
	}

	boolean isDrawerView(View view)
	{
		int i = GravityCompat.getAbsoluteGravity(((LayoutParams)view.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(view));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #366 <Field int DrawerLayout$LayoutParams.gravity>
	//    4   10:aload_1         
	//    5   11:invokestatic    #236 <Method int ViewCompat.getLayoutDirection(View)>
	//    6   14:invokestatic    #545 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    7   17:istore_2        
		if((i & 3) != 0)
	//*   8   18:iload_2         
	//*   9   19:iconst_3        
	//*  10   20:iand            
	//*  11   21:ifeq            26
			return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		return (i & 5) != 0;
	//   14   26:iload_2         
	//   15   27:iconst_5        
	//   16   28:iand            
	//   17   29:ifeq            34
	//   18   32:iconst_1        
	//   19   33:ireturn         
	//   20   34:iconst_0        
	//   21   35:ireturn         
	}

	public boolean isDrawerVisible(View view)
	{
		if(isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #261 <Method boolean isDrawerView(View)>
	//*   3    5:ifeq            27
		{
			return ((LayoutParams)view.getLayoutParams()).onScreen > 0.0F;
	//    4    8:aload_1         
	//    5    9:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   12:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//    7   15:getfield        #340 <Field float DrawerLayout$LayoutParams.onScreen>
	//    8   18:fconst_0        
	//    9   19:fcmpl           
	//   10   20:ifle            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   15   27:new             #379 <Class StringBuilder>
	//   16   30:dup             
	//   17   31:invokespecial   #380 <Method void StringBuilder()>
	//   18   34:astore_2        
			stringbuilder.append("View ");
	//   19   35:aload_2         
	//   20   36:ldc2            #382 <String "View ">
	//   21   39:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
			stringbuilder.append(((Object) (view)));
	//   23   43:aload_2         
	//   24   44:aload_1         
	//   25   45:invokevirtual   #389 <Method StringBuilder StringBuilder.append(Object)>
	//   26   48:pop             
			stringbuilder.append(" is not a drawer");
	//   27   49:aload_2         
	//   28   50:ldc2            #592 <String " is not a drawer">
	//   29   53:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//   30   56:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   31   57:new             #393 <Class IllegalArgumentException>
	//   32   60:dup             
	//   33   61:aload_2         
	//   34   62:invokevirtual   #397 <Method String StringBuilder.toString()>
	//   35   65:invokespecial   #400 <Method void IllegalArgumentException(String)>
	//   36   68:athrow          
		}
	}

	void moveDrawerToOffset(View view, float f)
	{
		float f1 = getDrawerViewOffset(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #600 <Method float getDrawerViewOffset(View)>
	//    3    5:fstore_3        
		float f2 = view.getWidth();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #350 <Method int View.getWidth()>
	//    6   10:i2f             
	//    7   11:fstore          4
		int i = (int)(f1 * f2);
	//    8   13:fload_3         
	//    9   14:fload           4
	//   10   16:fmul            
	//   11   17:f2i             
	//   12   18:istore          5
		i = (int)(f2 * f) - i;
	//   13   20:fload           4
	//   14   22:fload_2         
	//   15   23:fmul            
	//   16   24:f2i             
	//   17   25:iload           5
	//   18   27:isub            
	//   19   28:istore          5
		if(!checkDrawerViewAbsoluteGravity(view, 3))
	//*  20   30:aload_0         
	//*  21   31:aload_1         
	//*  22   32:iconst_3        
	//*  23   33:invokevirtual   #345 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  24   36:ifeq            42
	//*  25   39:goto            47
			i = -i;
	//   26   42:iload           5
	//   27   44:ineg            
	//   28   45:istore          5
		view.offsetLeftAndRight(i);
	//   29   47:aload_1         
	//   30   48:iload           5
	//   31   50:invokevirtual   #603 <Method void View.offsetLeftAndRight(int)>
		setDrawerViewOffset(view, f);
	//   32   53:aload_0         
	//   33   54:aload_1         
	//   34   55:fload_2         
	//   35   56:invokevirtual   #606 <Method void setDrawerViewOffset(View, float)>
	//   36   59:return          
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #609 <Method void ViewGroup.onAttachedToWindow()>
		mFirstLayout = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #337 <Field boolean mFirstLayout>
	//    5    9:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #612 <Method void ViewGroup.onDetachedFromWindow()>
		mFirstLayout = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #337 <Field boolean mFirstLayout>
	//    5    9:return          
	}

	public void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #615 <Method void ViewGroup.onDraw(Canvas)>
		if(mDrawStatusBarBackground && mStatusBarBackground != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #617 <Field boolean mDrawStatusBarBackground>
	//*   5    9:ifeq            80
	//*   6   12:aload_0         
	//*   7   13:getfield        #597 <Field Drawable mStatusBarBackground>
	//*   8   16:ifnull          80
		{
			int i;
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   9   19:getstatic       #91  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   22:bipush          21
	//*  11   24:icmplt          52
			{
				Object obj = mLastInsets;
	//   12   27:aload_0         
	//   13   28:getfield        #619 <Field Object mLastInsets>
	//   14   31:astore_3        
				if(obj != null)
	//*  15   32:aload_3         
	//*  16   33:ifnull          47
					i = ((WindowInsets)obj).getSystemWindowInsetTop();
	//   17   36:aload_3         
	//   18   37:checkcast       #621 <Class WindowInsets>
	//   19   40:invokevirtual   #624 <Method int WindowInsets.getSystemWindowInsetTop()>
	//   20   43:istore_2        
				else
	//*  21   44:goto            54
					i = 0;
	//   22   47:iconst_0        
	//   23   48:istore_2        
			} else
	//*  24   49:goto            54
			{
				i = 0;
	//   25   52:iconst_0        
	//   26   53:istore_2        
			}
			if(i > 0)
	//*  27   54:iload_2         
	//*  28   55:ifle            80
			{
				mStatusBarBackground.setBounds(0, 0, getWidth(), i);
	//   29   58:aload_0         
	//   30   59:getfield        #597 <Field Drawable mStatusBarBackground>
	//   31   62:iconst_0        
	//   32   63:iconst_0        
	//   33   64:aload_0         
	//   34   65:invokevirtual   #359 <Method int getWidth()>
	//   35   68:iload_2         
	//   36   69:invokevirtual   #530 <Method void Drawable.setBounds(int, int, int, int)>
				mStatusBarBackground.draw(canvas);
	//   37   72:aload_0         
	//   38   73:getfield        #597 <Field Drawable mStatusBarBackground>
	//   39   76:aload_1         
	//   40   77:invokevirtual   #538 <Method void Drawable.draw(Canvas)>
			}
		}
	//   41   80:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i;
		boolean flag2;
		boolean flag3;
		boolean flag4;
		i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #628 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          4
		flag3 = mLeftDragger.shouldInterceptTouchEvent(motionevent);
	//    3    6:aload_0         
	//    4    7:getfield        #347 <Field ViewDragHelper mLeftDragger>
	//    5   10:aload_1         
	//    6   11:invokevirtual   #631 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
	//    7   14:istore          7
		flag4 = mRightDragger.shouldInterceptTouchEvent(motionevent);
	//    8   16:aload_0         
	//    9   17:getfield        #358 <Field ViewDragHelper mRightDragger>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #631 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
	//   12   24:istore          8
		flag2 = true;
	//   13   26:iconst_1        
	//   14   27:istore          6
		i;
	//   15   29:iload           4
		JVM INSTR tableswitch 0 3: default 60
	//	               0 109
	//	               1 91
	//	               2 63
	//	               3 91;
	//   16   31:tableswitch     0 3: default 60
	//	               0 109
	//	               1 91
	//	               2 63
	//	               3 91
		   goto _L1 _L2 _L3 _L4 _L3
_L1:
		break; /* Loop/switch isn't completed */
	//   17   60:goto            184
_L4:
		if(mLeftDragger.checkTouchSlop(3))
	//*  18   63:aload_0         
	//*  19   64:getfield        #347 <Field ViewDragHelper mLeftDragger>
	//*  20   67:iconst_3        
	//*  21   68:invokevirtual   #635 <Method boolean ViewDragHelper.checkTouchSlop(int)>
	//*  22   71:ifeq            184
		{
			mLeftCallback.removeCallbacks();
	//   23   74:aload_0         
	//   24   75:getfield        #406 <Field DrawerLayout$ViewDragCallback mLeftCallback>
	//   25   78:invokevirtual   #409 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
			mRightCallback.removeCallbacks();
	//   26   81:aload_0         
	//   27   82:getfield        #411 <Field DrawerLayout$ViewDragCallback mRightCallback>
	//   28   85:invokevirtual   #409 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
		}
		break; /* Loop/switch isn't completed */
	//   29   88:goto            184
_L3:
		closeDrawers(true);
	//   30   91:aload_0         
	//   31   92:iconst_1        
	//   32   93:invokevirtual   #404 <Method void closeDrawers(boolean)>
		mDisallowInterceptRequested = false;
	//   33   96:aload_0         
	//   34   97:iconst_0        
	//   35   98:putfield        #637 <Field boolean mDisallowInterceptRequested>
		mChildrenCanceledTouch = false;
	//   36  101:aload_0         
	//   37  102:iconst_0        
	//   38  103:putfield        #639 <Field boolean mChildrenCanceledTouch>
		break; /* Loop/switch isn't completed */
	//   39  106:goto            184
_L2:
		float f;
		float f1;
		f = motionevent.getX();
	//   40  109:aload_1         
	//   41  110:invokevirtual   #437 <Method float MotionEvent.getX()>
	//   42  113:fstore_2        
		f1 = motionevent.getY();
	//   43  114:aload_1         
	//   44  115:invokevirtual   #440 <Method float MotionEvent.getY()>
	//   45  118:fstore_3        
		mInitialMotionX = f;
	//   46  119:aload_0         
	//   47  120:fload_2         
	//   48  121:putfield        #641 <Field float mInitialMotionX>
		mInitialMotionY = f1;
	//   49  124:aload_0         
	//   50  125:fload_3         
	//   51  126:putfield        #643 <Field float mInitialMotionY>
		if(mScrimOpacity <= 0.0F) goto _L6; else goto _L5
	//   52  129:aload_0         
	//   53  130:getfield        #420 <Field float mScrimOpacity>
	//   54  133:fconst_0        
	//   55  134:fcmpl           
	//   56  135:ifle            168
_L5:
		motionevent = ((MotionEvent) (mLeftDragger.findTopChildUnder((int)f, (int)f1)));
	//   57  138:aload_0         
	//   58  139:getfield        #347 <Field ViewDragHelper mLeftDragger>
	//   59  142:fload_2         
	//   60  143:f2i             
	//   61  144:fload_3         
	//   62  145:f2i             
	//   63  146:invokevirtual   #647 <Method View ViewDragHelper.findTopChildUnder(int, int)>
	//   64  149:astore_1        
		if(motionevent == null || !isContentView(((View) (motionevent)))) goto _L6; else goto _L7
	//   65  150:aload_1         
	//   66  151:ifnull          168
	//   67  154:aload_0         
	//   68  155:aload_1         
	//   69  156:invokevirtual   #445 <Method boolean isContentView(View)>
	//   70  159:ifeq            168
_L7:
		boolean flag = true;
	//   71  162:iconst_1        
	//   72  163:istore          4
		  goto _L8
	//*  73  165:goto            171
_L6:
		flag = false;
	//   74  168:iconst_0        
	//   75  169:istore          4
_L8:
		mDisallowInterceptRequested = false;
	//   76  171:aload_0         
	//   77  172:iconst_0        
	//   78  173:putfield        #637 <Field boolean mDisallowInterceptRequested>
		mChildrenCanceledTouch = false;
	//   79  176:aload_0         
	//   80  177:iconst_0        
	//   81  178:putfield        #639 <Field boolean mChildrenCanceledTouch>
		break MISSING_BLOCK_LABEL_187;
	//   82  181:goto            187
		flag = false;
	//   83  184:iconst_0        
	//   84  185:istore          4
		boolean flag1 = flag2;
	//   85  187:iload           6
	//   86  189:istore          5
		if(!(flag3 | flag4))
	//*  87  191:iload           7
	//*  88  193:iload           8
	//*  89  195:ior             
	//*  90  196:ifne            231
		{
			flag1 = flag2;
	//   91  199:iload           6
	//   92  201:istore          5
			if(!flag)
	//*  93  203:iload           4
	//*  94  205:ifne            231
			{
				flag1 = flag2;
	//   95  208:iload           6
	//   96  210:istore          5
				if(!hasPeekingDrawer())
	//*  97  212:aload_0         
	//*  98  213:invokespecial   #649 <Method boolean hasPeekingDrawer()>
	//*  99  216:ifne            231
				{
					if(mChildrenCanceledTouch)
	//* 100  219:aload_0         
	//* 101  220:getfield        #639 <Field boolean mChildrenCanceledTouch>
	//* 102  223:ifeq            228
						return true;
	//  103  226:iconst_1        
	//  104  227:ireturn         
					flag1 = false;
	//  105  228:iconst_0        
	//  106  229:istore          5
				}
			}
		}
		return flag1;
	//  107  231:iload           5
	//  108  233:ireturn         
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if(i == 4 && hasVisibleDrawer())
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          18
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #653 <Method boolean hasVisibleDrawer()>
	//*   5    9:ifeq            18
		{
			keyevent.startTracking();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #658 <Method void KeyEvent.startTracking()>
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		} else
		{
			return super.onKeyDown(i, keyevent);
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:aload_2         
	//   13   21:invokespecial   #660 <Method boolean ViewGroup.onKeyDown(int, KeyEvent)>
	//   14   24:ireturn         
		}
	}

	public boolean onKeyUp(int i, KeyEvent keyevent)
	{
		if(i == 4)
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          34
		{
			keyevent = ((KeyEvent) (findVisibleDrawer()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #199 <Method View findVisibleDrawer()>
	//    5    9:astore_2        
			if(keyevent != null && getDrawerLockMode(((View) (keyevent))) == 0)
	//*   6   10:aload_2         
	//*   7   11:ifnull          26
	//*   8   14:aload_0         
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #663 <Method int getDrawerLockMode(View)>
	//*  11   19:ifne            26
				closeDrawers();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #665 <Method void closeDrawers()>
			return keyevent != null;
	//   14   26:aload_2         
	//   15   27:ifnull          32
	//   16   30:iconst_1        
	//   17   31:ireturn         
	//   18   32:iconst_0        
	//   19   33:ireturn         
		} else
		{
			return super.onKeyUp(i, keyevent);
	//   20   34:aload_0         
	//   21   35:iload_1         
	//   22   36:aload_2         
	//   23   37:invokespecial   #667 <Method boolean ViewGroup.onKeyUp(int, KeyEvent)>
	//   24   40:ireturn         
		}
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		mInLayout = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #671 <Field boolean mInLayout>
		int k1 = k - i;
	//    3    5:iload           4
	//    4    7:iload_2         
	//    5    8:isub            
	//    6    9:istore          10
		int l1 = getChildCount();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #183 <Method int getChildCount()>
	//    9   15:istore          11
		for(k = 0; k < l1; k++)
	//*  10   17:iconst_0        
	//*  11   18:istore          4
	//*  12   20:iload           4
	//*  13   22:iload           11
	//*  14   24:icmpge          442
		{
			View view = getChildAt(k);
	//   15   27:aload_0         
	//   16   28:iload           4
	//   17   30:invokevirtual   #187 <Method View getChildAt(int)>
	//   18   33:astore          15
			if(view.getVisibility() == 8)
	//*  19   35:aload           15
	//*  20   37:invokevirtual   #304 <Method int View.getVisibility()>
	//*  21   40:bipush          8
	//*  22   42:icmpne          48
				continue;
	//   23   45:goto            433
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   24   48:aload           15
	//   25   50:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   53:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//   27   56:astore          16
			if(isContentView(view))
	//*  28   58:aload_0         
	//*  29   59:aload           15
	//*  30   61:invokevirtual   #445 <Method boolean isContentView(View)>
	//*  31   64:ifeq            107
			{
				view.layout(layoutparams.leftMargin, layoutparams.topMargin, layoutparams.leftMargin + view.getMeasuredWidth(), layoutparams.topMargin + view.getMeasuredHeight());
	//   32   67:aload           15
	//   33   69:aload           16
	//   34   71:getfield        #674 <Field int DrawerLayout$LayoutParams.leftMargin>
	//   35   74:aload           16
	//   36   76:getfield        #677 <Field int DrawerLayout$LayoutParams.topMargin>
	//   37   79:aload           16
	//   38   81:getfield        #674 <Field int DrawerLayout$LayoutParams.leftMargin>
	//   39   84:aload           15
	//   40   86:invokevirtual   #680 <Method int View.getMeasuredWidth()>
	//   41   89:iadd            
	//   42   90:aload           16
	//   43   92:getfield        #677 <Field int DrawerLayout$LayoutParams.topMargin>
	//   44   95:aload           15
	//   45   97:invokevirtual   #683 <Method int View.getMeasuredHeight()>
	//   46  100:iadd            
	//   47  101:invokevirtual   #686 <Method void View.layout(int, int, int, int)>
				continue;
	//   48  104:goto            433
			}
			int i2 = view.getMeasuredWidth();
	//   49  107:aload           15
	//   50  109:invokevirtual   #680 <Method int View.getMeasuredWidth()>
	//   51  112:istore          12
			int j2 = view.getMeasuredHeight();
	//   52  114:aload           15
	//   53  116:invokevirtual   #683 <Method int View.getMeasuredHeight()>
	//   54  119:istore          13
			float f;
			int i1;
			if(checkDrawerViewAbsoluteGravity(view, 3))
	//*  55  121:aload_0         
	//*  56  122:aload           15
	//*  57  124:iconst_3        
	//*  58  125:invokevirtual   #345 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  59  128:ifeq            167
			{
				i = -i2;
	//   60  131:iload           12
	//   61  133:ineg            
	//   62  134:istore_2        
				f = i2;
	//   63  135:iload           12
	//   64  137:i2f             
	//   65  138:fstore          6
				i1 = i + (int)(layoutparams.onScreen * f);
	//   66  140:iload_2         
	//   67  141:aload           16
	//   68  143:getfield        #340 <Field float DrawerLayout$LayoutParams.onScreen>
	//   69  146:fload           6
	//   70  148:fmul            
	//   71  149:f2i             
	//   72  150:iadd            
	//   73  151:istore          7
				f = (float)(i2 + i1) / f;
	//   74  153:iload           12
	//   75  155:iload           7
	//   76  157:iadd            
	//   77  158:i2f             
	//   78  159:fload           6
	//   79  161:fdiv            
	//   80  162:fstore          6
			} else
	//*  81  164:goto            197
			{
				f = i2;
	//   82  167:iload           12
	//   83  169:i2f             
	//   84  170:fstore          6
				i1 = k1 - (int)(layoutparams.onScreen * f);
	//   85  172:iload           10
	//   86  174:aload           16
	//   87  176:getfield        #340 <Field float DrawerLayout$LayoutParams.onScreen>
	//   88  179:fload           6
	//   89  181:fmul            
	//   90  182:f2i             
	//   91  183:isub            
	//   92  184:istore          7
				f = (float)(k1 - i1) / f;
	//   93  186:iload           10
	//   94  188:iload           7
	//   95  190:isub            
	//   96  191:i2f             
	//   97  192:fload           6
	//   98  194:fdiv            
	//   99  195:fstore          6
			}
			boolean flag1;
			if(f != layoutparams.onScreen)
	//* 100  197:fload           6
	//* 101  199:aload           16
	//* 102  201:getfield        #340 <Field float DrawerLayout$LayoutParams.onScreen>
	//* 103  204:fcmpl           
	//* 104  205:ifeq            214
				flag1 = true;
	//  105  208:iconst_1        
	//  106  209:istore          8
			else
	//* 107  211:goto            217
				flag1 = false;
	//  108  214:iconst_0        
	//  109  215:istore          8
			i = layoutparams.gravity & 0x70;
	//  110  217:aload           16
	//  111  219:getfield        #366 <Field int DrawerLayout$LayoutParams.gravity>
	//  112  222:bipush          112
	//  113  224:iand            
	//  114  225:istore_2        
			if(i != 16)
	//* 115  226:iload_2         
	//* 116  227:bipush          16
	//* 117  229:icmpeq          306
			{
				if(i != 80)
	//* 118  232:iload_2         
	//* 119  233:bipush          80
	//* 120  235:icmpeq          266
				{
					view.layout(i1, layoutparams.topMargin, i2 + i1, layoutparams.topMargin + j2);
	//  121  238:aload           15
	//  122  240:iload           7
	//  123  242:aload           16
	//  124  244:getfield        #677 <Field int DrawerLayout$LayoutParams.topMargin>
	//  125  247:iload           12
	//  126  249:iload           7
	//  127  251:iadd            
	//  128  252:aload           16
	//  129  254:getfield        #677 <Field int DrawerLayout$LayoutParams.topMargin>
	//  130  257:iload           13
	//  131  259:iadd            
	//  132  260:invokevirtual   #686 <Method void View.layout(int, int, int, int)>
				} else
	//* 133  263:goto            388
				{
					i = l - j;
	//  134  266:iload           5
	//  135  268:iload_3         
	//  136  269:isub            
	//  137  270:istore_2        
					view.layout(i1, i - layoutparams.bottomMargin - view.getMeasuredHeight(), i2 + i1, i - layoutparams.bottomMargin);
	//  138  271:aload           15
	//  139  273:iload           7
	//  140  275:iload_2         
	//  141  276:aload           16
	//  142  278:getfield        #689 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  143  281:isub            
	//  144  282:aload           15
	//  145  284:invokevirtual   #683 <Method int View.getMeasuredHeight()>
	//  146  287:isub            
	//  147  288:iload           12
	//  148  290:iload           7
	//  149  292:iadd            
	//  150  293:iload_2         
	//  151  294:aload           16
	//  152  296:getfield        #689 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  153  299:isub            
	//  154  300:invokevirtual   #686 <Method void View.layout(int, int, int, int)>
				}
			} else
	//* 155  303:goto            388
			{
				int k2 = l - j;
	//  156  306:iload           5
	//  157  308:iload_3         
	//  158  309:isub            
	//  159  310:istore          14
				int j1 = (k2 - j2) / 2;
	//  160  312:iload           14
	//  161  314:iload           13
	//  162  316:isub            
	//  163  317:iconst_2        
	//  164  318:idiv            
	//  165  319:istore          9
				if(j1 < layoutparams.topMargin)
	//* 166  321:iload           9
	//* 167  323:aload           16
	//* 168  325:getfield        #677 <Field int DrawerLayout$LayoutParams.topMargin>
	//* 169  328:icmpge          340
				{
					i = layoutparams.topMargin;
	//  170  331:aload           16
	//  171  333:getfield        #677 <Field int DrawerLayout$LayoutParams.topMargin>
	//  172  336:istore_2        
				} else
	//* 173  337:goto            371
				{
					i = j1;
	//  174  340:iload           9
	//  175  342:istore_2        
					if(j1 + j2 > k2 - layoutparams.bottomMargin)
	//* 176  343:iload           9
	//* 177  345:iload           13
	//* 178  347:iadd            
	//* 179  348:iload           14
	//* 180  350:aload           16
	//* 181  352:getfield        #689 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//* 182  355:isub            
	//* 183  356:icmple          371
						i = k2 - layoutparams.bottomMargin - j2;
	//  184  359:iload           14
	//  185  361:aload           16
	//  186  363:getfield        #689 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  187  366:isub            
	//  188  367:iload           13
	//  189  369:isub            
	//  190  370:istore_2        
				}
				view.layout(i1, i, i2 + i1, j2 + i);
	//  191  371:aload           15
	//  192  373:iload           7
	//  193  375:iload_2         
	//  194  376:iload           12
	//  195  378:iload           7
	//  196  380:iadd            
	//  197  381:iload           13
	//  198  383:iload_2         
	//  199  384:iadd            
	//  200  385:invokevirtual   #686 <Method void View.layout(int, int, int, int)>
			}
			if(flag1)
	//* 201  388:iload           8
	//* 202  390:ifeq            401
				setDrawerViewOffset(view, f);
	//  203  393:aload_0         
	//  204  394:aload           15
	//  205  396:fload           6
	//  206  398:invokevirtual   #606 <Method void setDrawerViewOffset(View, float)>
			if(layoutparams.onScreen > 0.0F)
	//* 207  401:aload           16
	//* 208  403:getfield        #340 <Field float DrawerLayout$LayoutParams.onScreen>
	//* 209  406:fconst_0        
	//* 210  407:fcmpl           
	//* 211  408:ifle            416
				i = 0;
	//  212  411:iconst_0        
	//  213  412:istore_2        
			else
	//* 214  413:goto            418
				i = 4;
	//  215  416:iconst_4        
	//  216  417:istore_2        
			if(view.getVisibility() != i)
	//* 217  418:aload           15
	//* 218  420:invokevirtual   #304 <Method int View.getVisibility()>
	//* 219  423:iload_2         
	//* 220  424:icmpeq          433
				view.setVisibility(i);
	//  221  427:aload           15
	//  222  429:iload_2         
	//  223  430:invokevirtual   #374 <Method void View.setVisibility(int)>
		}

	//  224  433:iload           4
	//  225  435:iconst_1        
	//  226  436:iadd            
	//  227  437:istore          4
	//* 228  439:goto            20
		mInLayout = false;
	//  229  442:aload_0         
	//  230  443:iconst_0        
	//  231  444:putfield        #671 <Field boolean mInLayout>
		mFirstLayout = false;
	//  232  447:aload_0         
	//  233  448:iconst_0        
	//  234  449:putfield        #337 <Field boolean mFirstLayout>
	//  235  452:return          
	}

	protected void onMeasure(int i, int j)
	{
label0:
		{
			int i1;
			int j1;
label1:
			{
				int l1 = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #698 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          10
				int k1 = android.view.View.MeasureSpec.getMode(j);
	//    3    6:iload_2         
	//    4    7:invokestatic    #698 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    5   10:istore          9
				int k = android.view.View.MeasureSpec.getSize(i);
	//    6   12:iload_1         
	//    7   13:invokestatic    #701 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    8   16:istore          5
				int l = android.view.View.MeasureSpec.getSize(j);
	//    9   18:iload_2         
	//   10   19:invokestatic    #701 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   11   22:istore          6
				if(l1 == 0x40000000)
	//*  12   24:iload           10
	//*  13   26:ldc2            #702 <Int 0x40000000>
	//*  14   29:icmpne          48
				{
					i1 = k;
	//   15   32:iload           5
	//   16   34:istore          7
					j1 = l;
	//   17   36:iload           6
	//   18   38:istore          8
					if(k1 == 0x40000000)
						break label1;
	//   19   40:iload           9
	//   20   42:ldc2            #702 <Int 0x40000000>
	//   21   45:icmpeq          117
				}
				if(!isInEditMode())
					break label0;
	//   22   48:aload_0         
	//   23   49:invokevirtual   #705 <Method boolean isInEditMode()>
	//   24   52:ifeq            820
				if(l1 != 0x80000000 && l1 == 0)
	//*  25   55:iload           10
	//*  26   57:ldc2            #706 <Int 0x80000000>
	//*  27   60:icmpne          66
	//*  28   63:goto            76
	//*  29   66:iload           10
	//*  30   68:ifne            76
					k = 300;
	//   31   71:sipush          300
	//   32   74:istore          5
				if(k1 == 0x80000000)
	//*  33   76:iload           9
	//*  34   78:ldc2            #706 <Int 0x80000000>
	//*  35   81:icmpne          95
				{
					i1 = k;
	//   36   84:iload           5
	//   37   86:istore          7
					j1 = l;
	//   38   88:iload           6
	//   39   90:istore          8
				} else
	//*  40   92:goto            117
				{
					i1 = k;
	//   41   95:iload           5
	//   42   97:istore          7
					j1 = l;
	//   43   99:iload           6
	//   44  101:istore          8
					if(k1 == 0)
	//*  45  103:iload           9
	//*  46  105:ifne            117
					{
						j1 = 300;
	//   47  108:sipush          300
	//   48  111:istore          8
						i1 = k;
	//   49  113:iload           5
	//   50  115:istore          7
					}
				}
			}
label2:
			{
				setMeasuredDimension(i1, j1);
	//   51  117:aload_0         
	//   52  118:iload           7
	//   53  120:iload           8
	//   54  122:invokevirtual   #709 <Method void setMeasuredDimension(int, int)>
				boolean flag2;
				if(mLastInsets != null && ViewCompat.getFitsSystemWindows(((View) (this))))
	//*  55  125:aload_0         
	//*  56  126:getfield        #619 <Field Object mLastInsets>
	//*  57  129:ifnull          145
	//*  58  132:aload_0         
	//*  59  133:invokestatic    #712 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  60  136:ifeq            145
					flag2 = true;
	//   61  139:iconst_1        
	//   62  140:istore          9
				else
	//*  63  142:goto            148
					flag2 = false;
	//   64  145:iconst_0        
	//   65  146:istore          9
				int k2 = ViewCompat.getLayoutDirection(((View) (this)));
	//   66  148:aload_0         
	//   67  149:invokestatic    #236 <Method int ViewCompat.getLayoutDirection(View)>
	//   68  152:istore          12
				int l2 = getChildCount();
	//   69  154:aload_0         
	//   70  155:invokevirtual   #183 <Method int getChildCount()>
	//   71  158:istore          13
				int i2 = 0;
	//   72  160:iconst_0        
	//   73  161:istore          10
				boolean flag1 = false;
	//   74  163:iconst_0        
	//   75  164:istore          6
				boolean flag = false;
	//   76  166:iconst_0        
	//   77  167:istore          5
				View view;
				do
				{
					if(i2 >= l2)
						break label2;
	//   78  169:iload           10
	//   79  171:iload           13
	//   80  173:icmpge          819
					view = getChildAt(i2);
	//   81  176:aload_0         
	//   82  177:iload           10
	//   83  179:invokevirtual   #187 <Method View getChildAt(int)>
	//   84  182:astore          17
					if(view.getVisibility() != 8)
	//*  85  184:aload           17
	//*  86  186:invokevirtual   #304 <Method int View.getVisibility()>
	//*  87  189:bipush          8
	//*  88  191:icmpne          197
	//*  89  194:goto            501
					{
						LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   90  197:aload           17
	//   91  199:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   92  202:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//   93  205:astore          18
						if(flag2)
	//*  94  207:iload           9
	//*  95  209:ifeq            447
						{
							int j2 = GravityCompat.getAbsoluteGravity(layoutparams.gravity, k2);
	//   96  212:aload           18
	//   97  214:getfield        #366 <Field int DrawerLayout$LayoutParams.gravity>
	//   98  217:iload           12
	//   99  219:invokestatic    #545 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//  100  222:istore          11
							if(ViewCompat.getFitsSystemWindows(view))
	//* 101  224:aload           17
	//* 102  226:invokestatic    #712 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//* 103  229:ifeq            325
							{
								if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 104  232:getstatic       #91  <Field int android.os.Build$VERSION.SDK_INT>
	//* 105  235:bipush          21
	//* 106  237:icmplt          447
								{
									WindowInsets windowinsets2 = (WindowInsets)mLastInsets;
	//  107  240:aload_0         
	//  108  241:getfield        #619 <Field Object mLastInsets>
	//  109  244:checkcast       #621 <Class WindowInsets>
	//  110  247:astore          16
									WindowInsets windowinsets;
									if(j2 == 3)
	//* 111  249:iload           11
	//* 112  251:iconst_3        
	//* 113  252:icmpne          281
									{
										windowinsets = windowinsets2.replaceSystemWindowInsets(windowinsets2.getSystemWindowInsetLeft(), windowinsets2.getSystemWindowInsetTop(), 0, windowinsets2.getSystemWindowInsetBottom());
	//  114  255:aload           16
	//  115  257:aload           16
	//  116  259:invokevirtual   #715 <Method int WindowInsets.getSystemWindowInsetLeft()>
	//  117  262:aload           16
	//  118  264:invokevirtual   #624 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  119  267:iconst_0        
	//  120  268:aload           16
	//  121  270:invokevirtual   #718 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  122  273:invokevirtual   #722 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  123  276:astore          15
									} else
	//* 124  278:goto            314
									{
										windowinsets = windowinsets2;
	//  125  281:aload           16
	//  126  283:astore          15
										if(j2 == 5)
	//* 127  285:iload           11
	//* 128  287:iconst_5        
	//* 129  288:icmpne          314
											windowinsets = windowinsets2.replaceSystemWindowInsets(0, windowinsets2.getSystemWindowInsetTop(), windowinsets2.getSystemWindowInsetRight(), windowinsets2.getSystemWindowInsetBottom());
	//  130  291:aload           16
	//  131  293:iconst_0        
	//  132  294:aload           16
	//  133  296:invokevirtual   #624 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  134  299:aload           16
	//  135  301:invokevirtual   #725 <Method int WindowInsets.getSystemWindowInsetRight()>
	//  136  304:aload           16
	//  137  306:invokevirtual   #718 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  138  309:invokevirtual   #722 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  139  312:astore          15
									}
									view.dispatchApplyWindowInsets(windowinsets);
	//  140  314:aload           17
	//  141  316:aload           15
	//  142  318:invokevirtual   #729 <Method WindowInsets View.dispatchApplyWindowInsets(WindowInsets)>
	//  143  321:pop             
								}
							} else
	//* 144  322:goto            447
							if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 145  325:getstatic       #91  <Field int android.os.Build$VERSION.SDK_INT>
	//* 146  328:bipush          21
	//* 147  330:icmplt          447
							{
								WindowInsets windowinsets3 = (WindowInsets)mLastInsets;
	//  148  333:aload_0         
	//  149  334:getfield        #619 <Field Object mLastInsets>
	//  150  337:checkcast       #621 <Class WindowInsets>
	//  151  340:astore          16
								WindowInsets windowinsets1;
								if(j2 == 3)
	//* 152  342:iload           11
	//* 153  344:iconst_3        
	//* 154  345:icmpne          374
								{
									windowinsets1 = windowinsets3.replaceSystemWindowInsets(windowinsets3.getSystemWindowInsetLeft(), windowinsets3.getSystemWindowInsetTop(), 0, windowinsets3.getSystemWindowInsetBottom());
	//  155  348:aload           16
	//  156  350:aload           16
	//  157  352:invokevirtual   #715 <Method int WindowInsets.getSystemWindowInsetLeft()>
	//  158  355:aload           16
	//  159  357:invokevirtual   #624 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  160  360:iconst_0        
	//  161  361:aload           16
	//  162  363:invokevirtual   #718 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  163  366:invokevirtual   #722 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  164  369:astore          15
								} else
	//* 165  371:goto            407
								{
									windowinsets1 = windowinsets3;
	//  166  374:aload           16
	//  167  376:astore          15
									if(j2 == 5)
	//* 168  378:iload           11
	//* 169  380:iconst_5        
	//* 170  381:icmpne          407
										windowinsets1 = windowinsets3.replaceSystemWindowInsets(0, windowinsets3.getSystemWindowInsetTop(), windowinsets3.getSystemWindowInsetRight(), windowinsets3.getSystemWindowInsetBottom());
	//  171  384:aload           16
	//  172  386:iconst_0        
	//  173  387:aload           16
	//  174  389:invokevirtual   #624 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  175  392:aload           16
	//  176  394:invokevirtual   #725 <Method int WindowInsets.getSystemWindowInsetRight()>
	//  177  397:aload           16
	//  178  399:invokevirtual   #718 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  179  402:invokevirtual   #722 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  180  405:astore          15
								}
								layoutparams.leftMargin = windowinsets1.getSystemWindowInsetLeft();
	//  181  407:aload           18
	//  182  409:aload           15
	//  183  411:invokevirtual   #715 <Method int WindowInsets.getSystemWindowInsetLeft()>
	//  184  414:putfield        #674 <Field int DrawerLayout$LayoutParams.leftMargin>
								layoutparams.topMargin = windowinsets1.getSystemWindowInsetTop();
	//  185  417:aload           18
	//  186  419:aload           15
	//  187  421:invokevirtual   #624 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  188  424:putfield        #677 <Field int DrawerLayout$LayoutParams.topMargin>
								layoutparams.rightMargin = windowinsets1.getSystemWindowInsetRight();
	//  189  427:aload           18
	//  190  429:aload           15
	//  191  431:invokevirtual   #725 <Method int WindowInsets.getSystemWindowInsetRight()>
	//  192  434:putfield        #732 <Field int DrawerLayout$LayoutParams.rightMargin>
								layoutparams.bottomMargin = windowinsets1.getSystemWindowInsetBottom();
	//  193  437:aload           18
	//  194  439:aload           15
	//  195  441:invokevirtual   #718 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  196  444:putfield        #689 <Field int DrawerLayout$LayoutParams.bottomMargin>
							}
						}
						if(isContentView(view))
	//* 197  447:aload_0         
	//* 198  448:aload           17
	//* 199  450:invokevirtual   #445 <Method boolean isContentView(View)>
	//* 200  453:ifeq            504
						{
							view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1 - layoutparams.leftMargin - layoutparams.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j1 - layoutparams.topMargin - layoutparams.bottomMargin, 0x40000000));
	//  201  456:aload           17
	//  202  458:iload           7
	//  203  460:aload           18
	//  204  462:getfield        #674 <Field int DrawerLayout$LayoutParams.leftMargin>
	//  205  465:isub            
	//  206  466:aload           18
	//  207  468:getfield        #732 <Field int DrawerLayout$LayoutParams.rightMargin>
	//  208  471:isub            
	//  209  472:ldc2            #702 <Int 0x40000000>
	//  210  475:invokestatic    #735 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  211  478:iload           8
	//  212  480:aload           18
	//  213  482:getfield        #677 <Field int DrawerLayout$LayoutParams.topMargin>
	//  214  485:isub            
	//  215  486:aload           18
	//  216  488:getfield        #689 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  217  491:isub            
	//  218  492:ldc2            #702 <Int 0x40000000>
	//  219  495:invokestatic    #735 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  220  498:invokevirtual   #738 <Method void View.measure(int, int)>
						} else
	//* 221  501:goto            736
						{
							if(!isDrawerView(view))
								break;
	//  222  504:aload_0         
	//  223  505:aload           17
	//  224  507:invokevirtual   #261 <Method boolean isDrawerView(View)>
	//  225  510:ifeq            745
							if(SET_DRAWER_SHADOW_FROM_ELEVATION)
	//* 226  513:getstatic       #95  <Field boolean SET_DRAWER_SHADOW_FROM_ELEVATION>
	//* 227  516:ifeq            545
							{
								float f = ViewCompat.getElevation(view);
	//  228  519:aload           17
	//  229  521:invokestatic    #741 <Method float ViewCompat.getElevation(View)>
	//  230  524:fstore_3        
								float f1 = mDrawerElevation;
	//  231  525:aload_0         
	//  232  526:getfield        #576 <Field float mDrawerElevation>
	//  233  529:fstore          4
								if(f != f1)
	//* 234  531:fload_3         
	//* 235  532:fload           4
	//* 236  534:fcmpl           
	//* 237  535:ifeq            545
									ViewCompat.setElevation(view, f1);
	//  238  538:aload           17
	//  239  540:fload           4
	//  240  542:invokestatic    #744 <Method void ViewCompat.setElevation(View, float)>
							}
							int i3 = getDrawerViewAbsoluteGravity(view) & 7;
	//  241  545:aload_0         
	//  242  546:aload           17
	//  243  548:invokevirtual   #327 <Method int getDrawerViewAbsoluteGravity(View)>
	//  244  551:bipush          7
	//  245  553:iand            
	//  246  554:istore          14
							boolean flag3;
							if(i3 == 3)
	//* 247  556:iload           14
	//* 248  558:iconst_3        
	//* 249  559:icmpne          568
								flag3 = true;
	//  250  562:iconst_1        
	//  251  563:istore          11
							else
	//* 252  565:goto            571
								flag3 = false;
	//  253  568:iconst_0        
	//  254  569:istore          11
							if(flag3 && flag1 || !flag3 && flag)
	//* 255  571:iload           11
	//* 256  573:ifeq            581
	//* 257  576:iload           6
	//* 258  578:ifne            594
	//* 259  581:iload           11
	//* 260  583:ifne            672
	//* 261  586:iload           5
	//* 262  588:ifne            594
	//* 263  591:goto            672
							{
								StringBuilder stringbuilder = new StringBuilder();
	//  264  594:new             #379 <Class StringBuilder>
	//  265  597:dup             
	//  266  598:invokespecial   #380 <Method void StringBuilder()>
	//  267  601:astore          15
								stringbuilder.append("Child drawer has absolute gravity ");
	//  268  603:aload           15
	//  269  605:ldc2            #746 <String "Child drawer has absolute gravity ">
	//  270  608:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//  271  611:pop             
								stringbuilder.append(gravityToString(i3));
	//  272  612:aload           15
	//  273  614:iload           14
	//  274  616:invokestatic    #748 <Method String gravityToString(int)>
	//  275  619:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//  276  622:pop             
								stringbuilder.append(" but this ");
	//  277  623:aload           15
	//  278  625:ldc2            #750 <String " but this ">
	//  279  628:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//  280  631:pop             
								stringbuilder.append("DrawerLayout");
	//  281  632:aload           15
	//  282  634:ldc2            #752 <String "DrawerLayout">
	//  283  637:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//  284  640:pop             
								stringbuilder.append(" already has a ");
	//  285  641:aload           15
	//  286  643:ldc2            #754 <String " already has a ">
	//  287  646:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//  288  649:pop             
								stringbuilder.append("drawer view along that edge");
	//  289  650:aload           15
	//  290  652:ldc2            #756 <String "drawer view along that edge">
	//  291  655:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//  292  658:pop             
								throw new IllegalStateException(stringbuilder.toString());
	//  293  659:new             #758 <Class IllegalStateException>
	//  294  662:dup             
	//  295  663:aload           15
	//  296  665:invokevirtual   #397 <Method String StringBuilder.toString()>
	//  297  668:invokespecial   #759 <Method void IllegalStateException(String)>
	//  298  671:athrow          
							}
							if(flag3)
	//* 299  672:iload           11
	//* 300  674:ifeq            683
								flag1 = true;
	//  301  677:iconst_1        
	//  302  678:istore          6
							else
	//* 303  680:goto            686
								flag = true;
	//  304  683:iconst_1        
	//  305  684:istore          5
							view.measure(getChildMeasureSpec(i, mMinDrawerMargin + layoutparams.leftMargin + layoutparams.rightMargin, layoutparams.width), getChildMeasureSpec(j, layoutparams.topMargin + layoutparams.bottomMargin, layoutparams.height));
	//  306  686:aload           17
	//  307  688:iload_1         
	//  308  689:aload_0         
	//  309  690:getfield        #761 <Field int mMinDrawerMargin>
	//  310  693:aload           18
	//  311  695:getfield        #674 <Field int DrawerLayout$LayoutParams.leftMargin>
	//  312  698:iadd            
	//  313  699:aload           18
	//  314  701:getfield        #732 <Field int DrawerLayout$LayoutParams.rightMargin>
	//  315  704:iadd            
	//  316  705:aload           18
	//  317  707:getfield        #764 <Field int DrawerLayout$LayoutParams.width>
	//  318  710:invokestatic    #768 <Method int getChildMeasureSpec(int, int, int)>
	//  319  713:iload_2         
	//  320  714:aload           18
	//  321  716:getfield        #677 <Field int DrawerLayout$LayoutParams.topMargin>
	//  322  719:aload           18
	//  323  721:getfield        #689 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  324  724:iadd            
	//  325  725:aload           18
	//  326  727:getfield        #771 <Field int DrawerLayout$LayoutParams.height>
	//  327  730:invokestatic    #768 <Method int getChildMeasureSpec(int, int, int)>
	//  328  733:invokevirtual   #738 <Method void View.measure(int, int)>
						}
					}
					i2++;
	//  329  736:iload           10
	//  330  738:iconst_1        
	//  331  739:iadd            
	//  332  740:istore          10
				} while(true);
	//  333  742:goto            169
				StringBuilder stringbuilder1 = new StringBuilder();
	//  334  745:new             #379 <Class StringBuilder>
	//  335  748:dup             
	//  336  749:invokespecial   #380 <Method void StringBuilder()>
	//  337  752:astore          15
				stringbuilder1.append("Child ");
	//  338  754:aload           15
	//  339  756:ldc2            #773 <String "Child ">
	//  340  759:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//  341  762:pop             
				stringbuilder1.append(((Object) (view)));
	//  342  763:aload           15
	//  343  765:aload           17
	//  344  767:invokevirtual   #389 <Method StringBuilder StringBuilder.append(Object)>
	//  345  770:pop             
				stringbuilder1.append(" at index ");
	//  346  771:aload           15
	//  347  773:ldc2            #775 <String " at index ">
	//  348  776:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//  349  779:pop             
				stringbuilder1.append(i2);
	//  350  780:aload           15
	//  351  782:iload           10
	//  352  784:invokevirtual   #778 <Method StringBuilder StringBuilder.append(int)>
	//  353  787:pop             
				stringbuilder1.append(" does not have a valid layout_gravity - must be Gravity.LEFT, ");
	//  354  788:aload           15
	//  355  790:ldc2            #780 <String " does not have a valid layout_gravity - must be Gravity.LEFT, ">
	//  356  793:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//  357  796:pop             
				stringbuilder1.append("Gravity.RIGHT or Gravity.NO_GRAVITY");
	//  358  797:aload           15
	//  359  799:ldc2            #782 <String "Gravity.RIGHT or Gravity.NO_GRAVITY">
	//  360  802:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//  361  805:pop             
				throw new IllegalStateException(stringbuilder1.toString());
	//  362  806:new             #758 <Class IllegalStateException>
	//  363  809:dup             
	//  364  810:aload           15
	//  365  812:invokevirtual   #397 <Method String StringBuilder.toString()>
	//  366  815:invokespecial   #759 <Method void IllegalStateException(String)>
	//  367  818:athrow          
			}
			return;
	//  368  819:return          
		}
		throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
	//  369  820:new             #393 <Class IllegalArgumentException>
	//  370  823:dup             
	//  371  824:ldc2            #784 <String "DrawerLayout must be measured with MeasureSpec.EXACTLY.">
	//  372  827:invokespecial   #400 <Method void IllegalArgumentException(String)>
	//  373  830:athrow          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #15  <Class DrawerLayout$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #788 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #15  <Class DrawerLayout$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #792 <Method Parcelable DrawerLayout$SavedState.getSuperState()>
	//   13   23:invokespecial   #788 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		if(((SavedState) (parcelable)).openDrawerGravity != 0)
	//*  14   26:aload_1         
	//*  15   27:getfield        #795 <Field int DrawerLayout$SavedState.openDrawerGravity>
	//*  16   30:ifeq            51
		{
			View view = findDrawerWithGravity(((SavedState) (parcelable)).openDrawerGravity);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:getfield        #795 <Field int DrawerLayout$SavedState.openDrawerGravity>
	//   20   38:invokevirtual   #797 <Method View findDrawerWithGravity(int)>
	//   21   41:astore_2        
			if(view != null)
	//*  22   42:aload_2         
	//*  23   43:ifnull          51
				openDrawer(view);
	//   24   46:aload_0         
	//   25   47:aload_2         
	//   26   48:invokevirtual   #800 <Method void openDrawer(View)>
		}
		if(((SavedState) (parcelable)).lockModeLeft != 3)
	//*  27   51:aload_1         
	//*  28   52:getfield        #803 <Field int DrawerLayout$SavedState.lockModeLeft>
	//*  29   55:iconst_3        
	//*  30   56:icmpeq          68
			setDrawerLockMode(((SavedState) (parcelable)).lockModeLeft, 3);
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:getfield        #803 <Field int DrawerLayout$SavedState.lockModeLeft>
	//   34   64:iconst_3        
	//   35   65:invokevirtual   #806 <Method void setDrawerLockMode(int, int)>
		if(((SavedState) (parcelable)).lockModeRight != 3)
	//*  36   68:aload_1         
	//*  37   69:getfield        #809 <Field int DrawerLayout$SavedState.lockModeRight>
	//*  38   72:iconst_3        
	//*  39   73:icmpeq          85
			setDrawerLockMode(((SavedState) (parcelable)).lockModeRight, 5);
	//   40   76:aload_0         
	//   41   77:aload_1         
	//   42   78:getfield        #809 <Field int DrawerLayout$SavedState.lockModeRight>
	//   43   81:iconst_5        
	//   44   82:invokevirtual   #806 <Method void setDrawerLockMode(int, int)>
		if(((SavedState) (parcelable)).lockModeStart != 3)
	//*  45   85:aload_1         
	//*  46   86:getfield        #812 <Field int DrawerLayout$SavedState.lockModeStart>
	//*  47   89:iconst_3        
	//*  48   90:icmpeq          104
			setDrawerLockMode(((SavedState) (parcelable)).lockModeStart, 0x800003);
	//   49   93:aload_0         
	//   50   94:aload_1         
	//   51   95:getfield        #812 <Field int DrawerLayout$SavedState.lockModeStart>
	//   52   98:ldc2            #579 <Int 0x800003>
	//   53  101:invokevirtual   #806 <Method void setDrawerLockMode(int, int)>
		if(((SavedState) (parcelable)).lockModeEnd != 3)
	//*  54  104:aload_1         
	//*  55  105:getfield        #815 <Field int DrawerLayout$SavedState.lockModeEnd>
	//*  56  108:iconst_3        
	//*  57  109:icmpeq          123
			setDrawerLockMode(((SavedState) (parcelable)).lockModeEnd, 0x800005);
	//   58  112:aload_0         
	//   59  113:aload_1         
	//   60  114:getfield        #815 <Field int DrawerLayout$SavedState.lockModeEnd>
	//   61  117:ldc2            #580 <Int 0x800005>
	//   62  120:invokevirtual   #806 <Method void setDrawerLockMode(int, int)>
	//   63  123:return          
	}

	public void onRtlPropertiesChanged(int i)
	{
		resolveShadowDrawables();
	//    0    0:aload_0         
	//    1    1:invokespecial   #818 <Method void resolveShadowDrawables()>
	//    2    4:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate;
label0:
		{
			savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #15  <Class DrawerLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #821 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #823 <Method void DrawerLayout$SavedState(Parcelable)>
	//    5   11:astore          5
			int k = getChildCount();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #183 <Method int getChildCount()>
	//    8   17:istore          4
			int i = 0;
	//    9   19:iconst_0        
	//   10   20:istore_1        
			LayoutParams layoutparams;
			do
			{
				if(i >= k)
					break label0;
	//   11   21:iload_1         
	//   12   22:iload           4
	//   13   24:icmpge          102
				layoutparams = (LayoutParams)getChildAt(i).getLayoutParams();
	//   14   27:aload_0         
	//   15   28:iload_1         
	//   16   29:invokevirtual   #187 <Method View getChildAt(int)>
	//   17   32:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   35:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//   19   38:astore          6
				int j = layoutparams.openState;
	//   20   40:aload           6
	//   21   42:getfield        #343 <Field int DrawerLayout$LayoutParams.openState>
	//   22   45:istore_2        
				boolean flag1 = true;
	//   23   46:iconst_1        
	//   24   47:istore_3        
				boolean flag;
				if(j == 1)
	//*  25   48:iload_2         
	//*  26   49:iconst_1        
	//*  27   50:icmpne          58
					flag = true;
	//   28   53:iconst_1        
	//   29   54:istore_2        
				else
	//*  30   55:goto            60
					flag = false;
	//   31   58:iconst_0        
	//   32   59:istore_2        
				if(layoutparams.openState != 2)
	//*  33   60:aload           6
	//*  34   62:getfield        #343 <Field int DrawerLayout$LayoutParams.openState>
	//*  35   65:iconst_2        
	//*  36   66:icmpne          72
	//*  37   69:goto            74
					flag1 = false;
	//   38   72:iconst_0        
	//   39   73:istore_3        
				if(flag || flag1)
	//*  40   74:iload_2         
	//*  41   75:ifne            92
	//*  42   78:iload_3         
	//*  43   79:ifeq            85
					break;
	//   44   82:goto            92
				i++;
	//   45   85:iload_1         
	//   46   86:iconst_1        
	//   47   87:iadd            
	//   48   88:istore_1        
			} while(true);
	//   49   89:goto            21
			savedstate.openDrawerGravity = layoutparams.gravity;
	//   50   92:aload           5
	//   51   94:aload           6
	//   52   96:getfield        #366 <Field int DrawerLayout$LayoutParams.gravity>
	//   53   99:putfield        #795 <Field int DrawerLayout$SavedState.openDrawerGravity>
		}
		savedstate.lockModeLeft = mLockModeLeft;
	//   54  102:aload           5
	//   55  104:aload_0         
	//   56  105:getfield        #586 <Field int mLockModeLeft>
	//   57  108:putfield        #803 <Field int DrawerLayout$SavedState.lockModeLeft>
		savedstate.lockModeRight = mLockModeRight;
	//   58  111:aload           5
	//   59  113:aload_0         
	//   60  114:getfield        #584 <Field int mLockModeRight>
	//   61  117:putfield        #809 <Field int DrawerLayout$SavedState.lockModeRight>
		savedstate.lockModeStart = mLockModeStart;
	//   62  120:aload           5
	//   63  122:aload_0         
	//   64  123:getfield        #588 <Field int mLockModeStart>
	//   65  126:putfield        #812 <Field int DrawerLayout$SavedState.lockModeStart>
		savedstate.lockModeEnd = mLockModeEnd;
	//   66  129:aload           5
	//   67  131:aload_0         
	//   68  132:getfield        #582 <Field int mLockModeEnd>
	//   69  135:putfield        #815 <Field int DrawerLayout$SavedState.lockModeEnd>
		return ((Parcelable) (savedstate));
	//   70  138:aload           5
	//   71  140:areturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i;
		mLeftDragger.processTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #347 <Field ViewDragHelper mLeftDragger>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #828 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
		mRightDragger.processTouchEvent(motionevent);
	//    4    8:aload_0         
	//    5    9:getfield        #358 <Field ViewDragHelper mRightDragger>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #828 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
		i = motionevent.getAction() & 0xff;
	//    8   16:aload_1         
	//    9   17:invokevirtual   #433 <Method int MotionEvent.getAction()>
	//   10   20:sipush          255
	//   11   23:iand            
	//   12   24:istore          4
		if(i == 3) goto _L2; else goto _L1
	//   13   26:iload           4
	//   14   28:iconst_3        
	//   15   29:icmpeq          210
_L1:
		i;
	//   16   32:iload           4
		JVM INSTR tableswitch 0 1: default 56
	//	               0 178
	//	               1 58;
	//   17   34:tableswitch     0 1: default 56
	//	               0 178
	//	               1 58
		   goto _L3 _L4 _L5
_L3:
		return true;
	//   18   56:iconst_1        
	//   19   57:ireturn         
_L5:
		float f;
		float f2;
		f2 = motionevent.getX();
	//   20   58:aload_1         
	//   21   59:invokevirtual   #437 <Method float MotionEvent.getX()>
	//   22   62:fstore_3        
		f = motionevent.getY();
	//   23   63:aload_1         
	//   24   64:invokevirtual   #440 <Method float MotionEvent.getY()>
	//   25   67:fstore_2        
		motionevent = ((MotionEvent) (mLeftDragger.findTopChildUnder((int)f2, (int)f)));
	//   26   68:aload_0         
	//   27   69:getfield        #347 <Field ViewDragHelper mLeftDragger>
	//   28   72:fload_3         
	//   29   73:f2i             
	//   30   74:fload_2         
	//   31   75:f2i             
	//   32   76:invokevirtual   #647 <Method View ViewDragHelper.findTopChildUnder(int, int)>
	//   33   79:astore_1        
		if(motionevent == null || !isContentView(((View) (motionevent)))) goto _L7; else goto _L6
	//   34   80:aload_1         
	//   35   81:ifnull          162
	//   36   84:aload_0         
	//   37   85:aload_1         
	//   38   86:invokevirtual   #445 <Method boolean isContentView(View)>
	//   39   89:ifeq            162
_L6:
		f2 -= mInitialMotionX;
	//   40   92:fload_3         
	//   41   93:aload_0         
	//   42   94:getfield        #641 <Field float mInitialMotionX>
	//   43   97:fsub            
	//   44   98:fstore_3        
		f -= mInitialMotionY;
	//   45   99:fload_2         
	//   46  100:aload_0         
	//   47  101:getfield        #643 <Field float mInitialMotionY>
	//   48  104:fsub            
	//   49  105:fstore_2        
		i = mLeftDragger.getTouchSlop();
	//   50  106:aload_0         
	//   51  107:getfield        #347 <Field ViewDragHelper mLeftDragger>
	//   52  110:invokevirtual   #831 <Method int ViewDragHelper.getTouchSlop()>
	//   53  113:istore          4
		if(f2 * f2 + f * f >= (float)(i * i)) goto _L7; else goto _L8
	//   54  115:fload_3         
	//   55  116:fload_3         
	//   56  117:fmul            
	//   57  118:fload_2         
	//   58  119:fload_2         
	//   59  120:fmul            
	//   60  121:fadd            
	//   61  122:iload           4
	//   62  124:iload           4
	//   63  126:imul            
	//   64  127:i2f             
	//   65  128:fcmpg           
	//   66  129:ifge            162
_L8:
		motionevent = ((MotionEvent) (findOpenDrawer()));
	//   67  132:aload_0         
	//   68  133:invokevirtual   #316 <Method View findOpenDrawer()>
	//   69  136:astore_1        
		if(motionevent == null) goto _L7; else goto _L9
	//   70  137:aload_1         
	//   71  138:ifnull          162
_L9:
		boolean flag;
		if(getDrawerLockMode(((View) (motionevent))) == 2)
	//*  72  141:aload_0         
	//*  73  142:aload_1         
	//*  74  143:invokevirtual   #663 <Method int getDrawerLockMode(View)>
	//*  75  146:iconst_2        
	//*  76  147:icmpne          156
			flag = true;
	//   77  150:iconst_1        
	//   78  151:istore          5
		else
	//*  79  153:goto            165
			flag = false;
	//   80  156:iconst_0        
	//   81  157:istore          5
		  goto _L10
	//*  82  159:goto            165
_L7:
		flag = true;
	//   83  162:iconst_1        
	//   84  163:istore          5
_L10:
		closeDrawers(flag);
	//   85  165:aload_0         
	//   86  166:iload           5
	//   87  168:invokevirtual   #404 <Method void closeDrawers(boolean)>
		mDisallowInterceptRequested = false;
	//   88  171:aload_0         
	//   89  172:iconst_0        
	//   90  173:putfield        #637 <Field boolean mDisallowInterceptRequested>
		return true;
	//   91  176:iconst_1        
	//   92  177:ireturn         
_L4:
		float f1 = motionevent.getX();
	//   93  178:aload_1         
	//   94  179:invokevirtual   #437 <Method float MotionEvent.getX()>
	//   95  182:fstore_2        
		float f3 = motionevent.getY();
	//   96  183:aload_1         
	//   97  184:invokevirtual   #440 <Method float MotionEvent.getY()>
	//   98  187:fstore_3        
		mInitialMotionX = f1;
	//   99  188:aload_0         
	//  100  189:fload_2         
	//  101  190:putfield        #641 <Field float mInitialMotionX>
		mInitialMotionY = f3;
	//  102  193:aload_0         
	//  103  194:fload_3         
	//  104  195:putfield        #643 <Field float mInitialMotionY>
		mDisallowInterceptRequested = false;
	//  105  198:aload_0         
	//  106  199:iconst_0        
	//  107  200:putfield        #637 <Field boolean mDisallowInterceptRequested>
		mChildrenCanceledTouch = false;
	//  108  203:aload_0         
	//  109  204:iconst_0        
	//  110  205:putfield        #639 <Field boolean mChildrenCanceledTouch>
		return true;
	//  111  208:iconst_1        
	//  112  209:ireturn         
_L2:
		closeDrawers(true);
	//  113  210:aload_0         
	//  114  211:iconst_1        
	//  115  212:invokevirtual   #404 <Method void closeDrawers(boolean)>
		mDisallowInterceptRequested = false;
	//  116  215:aload_0         
	//  117  216:iconst_0        
	//  118  217:putfield        #637 <Field boolean mDisallowInterceptRequested>
		mChildrenCanceledTouch = false;
	//  119  220:aload_0         
	//  120  221:iconst_0        
	//  121  222:putfield        #639 <Field boolean mChildrenCanceledTouch>
		return true;
	//  122  225:iconst_1        
	//  123  226:ireturn         
	}

	public void openDrawer(View view)
	{
		openDrawer(view, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #833 <Method void openDrawer(View, boolean)>
	//    4    6:return          
	}

	public void openDrawer(View view, boolean flag)
	{
		if(isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #261 <Method boolean isDrawerView(View)>
	//*   3    5:ifeq            133
		{
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   12:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//    7   15:astore_3        
			if(mFirstLayout)
	//*   8   16:aload_0         
	//*   9   17:getfield        #337 <Field boolean mFirstLayout>
	//*  10   20:ifeq            42
			{
				layoutparams.onScreen = 1.0F;
	//   11   23:aload_3         
	//   12   24:fconst_1        
	//   13   25:putfield        #340 <Field float DrawerLayout$LayoutParams.onScreen>
				layoutparams.openState = 1;
	//   14   28:aload_3         
	//   15   29:iconst_1        
	//   16   30:putfield        #343 <Field int DrawerLayout$LayoutParams.openState>
				updateChildrenImportantForAccessibility(view, true);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:iconst_1        
	//   20   36:invokespecial   #456 <Method void updateChildrenImportantForAccessibility(View, boolean)>
			} else
	//*  21   39:goto            128
			if(flag)
	//*  22   42:iload_2         
	//*  23   43:ifeq            107
			{
				layoutparams.openState = layoutparams.openState | 2;
	//   24   46:aload_3         
	//   25   47:aload_3         
	//   26   48:getfield        #343 <Field int DrawerLayout$LayoutParams.openState>
	//   27   51:iconst_2        
	//   28   52:ior             
	//   29   53:putfield        #343 <Field int DrawerLayout$LayoutParams.openState>
				if(checkDrawerViewAbsoluteGravity(view, 3))
	//*  30   56:aload_0         
	//*  31   57:aload_1         
	//*  32   58:iconst_3        
	//*  33   59:invokevirtual   #345 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  34   62:ifeq            82
					mLeftDragger.smoothSlideViewTo(view, 0, view.getTop());
	//   35   65:aload_0         
	//   36   66:getfield        #347 <Field ViewDragHelper mLeftDragger>
	//   37   69:aload_1         
	//   38   70:iconst_0        
	//   39   71:aload_1         
	//   40   72:invokevirtual   #136 <Method int View.getTop()>
	//   41   75:invokevirtual   #356 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   42   78:pop             
				else
	//*  43   79:goto            128
					mRightDragger.smoothSlideViewTo(view, getWidth() - view.getWidth(), view.getTop());
	//   44   82:aload_0         
	//   45   83:getfield        #358 <Field ViewDragHelper mRightDragger>
	//   46   86:aload_1         
	//   47   87:aload_0         
	//   48   88:invokevirtual   #359 <Method int getWidth()>
	//   49   91:aload_1         
	//   50   92:invokevirtual   #350 <Method int View.getWidth()>
	//   51   95:isub            
	//   52   96:aload_1         
	//   53   97:invokevirtual   #136 <Method int View.getTop()>
	//   54  100:invokevirtual   #356 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   55  103:pop             
			} else
	//*  56  104:goto            128
			{
				moveDrawerToOffset(view, 1.0F);
	//   57  107:aload_0         
	//   58  108:aload_1         
	//   59  109:fconst_1        
	//   60  110:invokevirtual   #363 <Method void moveDrawerToOffset(View, float)>
				updateDrawerState(layoutparams.gravity, 0, view);
	//   61  113:aload_0         
	//   62  114:aload_3         
	//   63  115:getfield        #366 <Field int DrawerLayout$LayoutParams.gravity>
	//   64  118:iconst_0        
	//   65  119:aload_1         
	//   66  120:invokevirtual   #370 <Method void updateDrawerState(int, int, View)>
				view.setVisibility(0);
	//   67  123:aload_1         
	//   68  124:iconst_0        
	//   69  125:invokevirtual   #374 <Method void View.setVisibility(int)>
			}
			invalidate();
	//   70  128:aload_0         
	//   71  129:invokevirtual   #377 <Method void invalidate()>
			return;
	//   72  132:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   73  133:new             #379 <Class StringBuilder>
	//   74  136:dup             
	//   75  137:invokespecial   #380 <Method void StringBuilder()>
	//   76  140:astore_3        
			stringbuilder.append("View ");
	//   77  141:aload_3         
	//   78  142:ldc2            #382 <String "View ">
	//   79  145:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//   80  148:pop             
			stringbuilder.append(((Object) (view)));
	//   81  149:aload_3         
	//   82  150:aload_1         
	//   83  151:invokevirtual   #389 <Method StringBuilder StringBuilder.append(Object)>
	//   84  154:pop             
			stringbuilder.append(" is not a sliding drawer");
	//   85  155:aload_3         
	//   86  156:ldc2            #391 <String " is not a sliding drawer">
	//   87  159:invokevirtual   #386 <Method StringBuilder StringBuilder.append(String)>
	//   88  162:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   89  163:new             #393 <Class IllegalArgumentException>
	//   90  166:dup             
	//   91  167:aload_3         
	//   92  168:invokevirtual   #397 <Method String StringBuilder.toString()>
	//   93  171:invokespecial   #400 <Method void IllegalArgumentException(String)>
	//   94  174:athrow          
		}
	}

	public void removeDrawerListener(DrawerListener drawerlistener)
	{
		if(drawerlistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		List list = mListeners;
	//    3    5:aload_0         
	//    4    6:getfield        #270 <Field List mListeners>
	//    5    9:astore_2        
		if(list == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       15
		{
			return;
	//    8   14:return          
		} else
		{
			list.remove(((Object) (drawerlistener)));
	//    9   15:aload_2         
	//   10   16:aload_1         
	//   11   17:invokeinterface #837 <Method boolean List.remove(Object)>
	//   12   22:pop             
			return;
	//   13   23:return          
		}
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		super.requestDisallowInterceptTouchEvent(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #840 <Method void ViewGroup.requestDisallowInterceptTouchEvent(boolean)>
		mDisallowInterceptRequested = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #637 <Field boolean mDisallowInterceptRequested>
		if(flag)
	//*   6   10:iload_1         
	//*   7   11:ifeq            19
			closeDrawers(true);
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:invokevirtual   #404 <Method void closeDrawers(boolean)>
	//   11   19:return          
	}

	public void requestLayout()
	{
		if(!mInLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #671 <Field boolean mInLayout>
	//*   2    4:ifne            11
			super.requestLayout();
	//    3    7:aload_0         
	//    4    8:invokespecial   #843 <Method void ViewGroup.requestLayout()>
	//    5   11:return          
	}

	public void setDrawerElevation(float f)
	{
		mDrawerElevation = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #576 <Field float mDrawerElevation>
		for(int i = 0; i < getChildCount(); i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #183 <Method int getChildCount()>
	//*   8   12:icmpge          44
		{
			View view = getChildAt(i);
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:invokevirtual   #187 <Method View getChildAt(int)>
	//   12   20:astore_3        
			if(isDrawerView(view))
	//*  13   21:aload_0         
	//*  14   22:aload_3         
	//*  15   23:invokevirtual   #261 <Method boolean isDrawerView(View)>
	//*  16   26:ifeq            37
				ViewCompat.setElevation(view, mDrawerElevation);
	//   17   29:aload_3         
	//   18   30:aload_0         
	//   19   31:getfield        #576 <Field float mDrawerElevation>
	//   20   34:invokestatic    #744 <Method void ViewCompat.setElevation(View, float)>
		}

	//   21   37:iload_2         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:istore_2        
	//*  25   41:goto            7
	//   26   44:return          
	}

	public void setDrawerListener(DrawerListener drawerlistener)
	{
		DrawerListener drawerlistener1 = mListener;
	//    0    0:aload_0         
	//    1    1:getfield        #849 <Field DrawerLayout$DrawerListener mListener>
	//    2    4:astore_2        
		if(drawerlistener1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			removeDrawerListener(drawerlistener1);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #851 <Method void removeDrawerListener(DrawerLayout$DrawerListener)>
		if(drawerlistener != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          23
			addDrawerListener(drawerlistener);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #853 <Method void addDrawerListener(DrawerLayout$DrawerListener)>
		mListener = drawerlistener;
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:putfield        #849 <Field DrawerLayout$DrawerListener mListener>
	//   16   28:return          
	}

	public void setDrawerLockMode(int i)
	{
		setDrawerLockMode(i, 3);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #806 <Method void setDrawerLockMode(int, int)>
		setDrawerLockMode(i, 5);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:iconst_5        
	//    7    9:invokevirtual   #806 <Method void setDrawerLockMode(int, int)>
	//    8   12:return          
	}

	public void setDrawerLockMode(int i, int j)
	{
		int k = GravityCompat.getAbsoluteGravity(j, ViewCompat.getLayoutDirection(((View) (this))));
	//    0    0:iload_2         
	//    1    1:aload_0         
	//    2    2:invokestatic    #236 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    5:invokestatic    #545 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    4    8:istore_3        
		if(j != 3)
	//*   5    9:iload_2         
	//*   6   10:iconst_3        
	//*   7   11:icmpeq          60
		{
			if(j != 5)
	//*   8   14:iload_2         
	//*   9   15:iconst_5        
	//*  10   16:icmpeq          52
			{
				if(j != 0x800003)
	//*  11   19:iload_2         
	//*  12   20:ldc2            #579 <Int 0x800003>
	//*  13   23:icmpeq          44
				{
					if(j == 0x800005)
	//*  14   26:iload_2         
	//*  15   27:ldc2            #580 <Int 0x800005>
	//*  16   30:icmpeq          36
	//*  17   33:goto            65
						mLockModeEnd = i;
	//   18   36:aload_0         
	//   19   37:iload_1         
	//   20   38:putfield        #582 <Field int mLockModeEnd>
				} else
	//*  21   41:goto            65
				{
					mLockModeStart = i;
	//   22   44:aload_0         
	//   23   45:iload_1         
	//   24   46:putfield        #588 <Field int mLockModeStart>
				}
			} else
	//*  25   49:goto            65
			{
				mLockModeRight = i;
	//   26   52:aload_0         
	//   27   53:iload_1         
	//   28   54:putfield        #584 <Field int mLockModeRight>
			}
		} else
	//*  29   57:goto            65
		{
			mLockModeLeft = i;
	//   30   60:aload_0         
	//   31   61:iload_1         
	//   32   62:putfield        #586 <Field int mLockModeLeft>
		}
		if(i != 0)
	//*  33   65:iload_1         
	//*  34   66:ifeq            94
		{
			ViewDragHelper viewdraghelper;
			if(k == 3)
	//*  35   69:iload_3         
	//*  36   70:iconst_3        
	//*  37   71:icmpne          83
				viewdraghelper = mLeftDragger;
	//   38   74:aload_0         
	//   39   75:getfield        #347 <Field ViewDragHelper mLeftDragger>
	//   40   78:astore          4
			else
	//*  41   80:goto            89
				viewdraghelper = mRightDragger;
	//   42   83:aload_0         
	//   43   84:getfield        #358 <Field ViewDragHelper mRightDragger>
	//   44   87:astore          4
			viewdraghelper.cancel();
	//   45   89:aload           4
	//   46   91:invokevirtual   #857 <Method void ViewDragHelper.cancel()>
		}
		switch(i)
	//*  47   94:iload_1         
		{
	//*  48   95:tableswitch     1 2: default 116
	//	               1 136
	//	               2 117
		default:
			return;
	//   49  116:return          

		case 2: // '\002'
			View view = findDrawerWithGravity(k);
	//   50  117:aload_0         
	//   51  118:iload_3         
	//   52  119:invokevirtual   #797 <Method View findDrawerWithGravity(int)>
	//   53  122:astore          4
			if(view != null)
	//*  54  124:aload           4
	//*  55  126:ifnull          154
			{
				openDrawer(view);
	//   56  129:aload_0         
	//   57  130:aload           4
	//   58  132:invokevirtual   #800 <Method void openDrawer(View)>
				return;
	//   59  135:return          
			}
			break;

		case 1: // '\001'
			View view1 = findDrawerWithGravity(k);
	//   60  136:aload_0         
	//   61  137:iload_3         
	//   62  138:invokevirtual   #797 <Method View findDrawerWithGravity(int)>
	//   63  141:astore          4
			if(view1 != null)
	//*  64  143:aload           4
	//*  65  145:ifnull          154
				closeDrawer(view1);
	//   66  148:aload_0         
	//   67  149:aload           4
	//   68  151:invokevirtual   #859 <Method void closeDrawer(View)>
			break;
		}
	//   69  154:return          
	}

	void setDrawerViewOffset(View view, float f)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//    3    7:astore_3        
		if(f == layoutparams.onScreen)
	//*   4    8:fload_2         
	//*   5    9:aload_3         
	//*   6   10:getfield        #340 <Field float DrawerLayout$LayoutParams.onScreen>
	//*   7   13:fcmpl           
	//*   8   14:ifne            18
		{
			return;
	//    9   17:return          
		} else
		{
			layoutparams.onScreen = f;
	//   10   18:aload_3         
	//   11   19:fload_2         
	//   12   20:putfield        #340 <Field float DrawerLayout$LayoutParams.onScreen>
			dispatchOnDrawerSlide(view, f);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:fload_2         
	//   16   26:invokevirtual   #861 <Method void dispatchOnDrawerSlide(View, float)>
			return;
	//   17   29:return          
		}
	}

	public void setScrimColor(int i)
	{
		mScrimColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #501 <Field int mScrimColor>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #377 <Method void invalidate()>
	//    5    9:return          
	}

	public void setStatusBarBackground(int i)
	{
		Drawable drawable;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			drawable = ContextCompat.getDrawable(getContext(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #558 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #870 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		mStatusBarBackground = drawable;
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #597 <Field Drawable mStatusBarBackground>
		invalidate();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #377 <Method void invalidate()>
	//   15   27:return          
	}

	public void setStatusBarBackground(Drawable drawable)
	{
		mStatusBarBackground = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #597 <Field Drawable mStatusBarBackground>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #377 <Method void invalidate()>
	//    5    9:return          
	}

	public void setStatusBarBackgroundColor(int i)
	{
		mStatusBarBackground = ((Drawable) (new ColorDrawable(i)));
	//    0    0:aload_0         
	//    1    1:new             #874 <Class ColorDrawable>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #876 <Method void ColorDrawable(int)>
	//    5    9:putfield        #597 <Field Drawable mStatusBarBackground>
		invalidate();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #377 <Method void invalidate()>
	//    8   16:return          
	}

	void updateDrawerState(int i, int j, View view)
	{
		int k = mLeftDragger.getViewDragState();
	//    0    0:aload_0         
	//    1    1:getfield        #347 <Field ViewDragHelper mLeftDragger>
	//    2    4:invokevirtual   #879 <Method int ViewDragHelper.getViewDragState()>
	//    3    7:istore          5
		int l = mRightDragger.getViewDragState();
	//    4    9:aload_0         
	//    5   10:getfield        #358 <Field ViewDragHelper mRightDragger>
	//    6   13:invokevirtual   #879 <Method int ViewDragHelper.getViewDragState()>
	//    7   16:istore          6
		byte byte0 = 2;
	//    8   18:iconst_2        
	//    9   19:istore          4
		if(k != 1 && l != 1)
	//*  10   21:iload           5
	//*  11   23:iconst_1        
	//*  12   24:icmpeq          62
	//*  13   27:iload           6
	//*  14   29:iconst_1        
	//*  15   30:icmpne          36
	//*  16   33:goto            62
		{
			i = ((int) (byte0));
	//   17   36:iload           4
	//   18   38:istore_1        
			if(k != 2)
	//*  19   39:iload           5
	//*  20   41:iconst_2        
	//*  21   42:icmpeq          64
				if(l == 2)
	//*  22   45:iload           6
	//*  23   47:iconst_2        
	//*  24   48:icmpne          57
					i = ((int) (byte0));
	//   25   51:iload           4
	//   26   53:istore_1        
				else
	//*  27   54:goto            64
					i = 0;
	//   28   57:iconst_0        
	//   29   58:istore_1        
		} else
	//*  30   59:goto            64
		{
			i = 1;
	//   31   62:iconst_1        
	//   32   63:istore_1        
		}
		if(view != null && j == 0)
	//*  33   64:aload_3         
	//*  34   65:ifnull          114
	//*  35   68:iload_2         
	//*  36   69:ifne            114
		{
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   37   72:aload_3         
	//   38   73:invokevirtual   #191 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   39   76:checkcast       #12  <Class DrawerLayout$LayoutParams>
	//   40   79:astore          7
			if(layoutparams.onScreen == 0.0F)
	//*  41   81:aload           7
	//*  42   83:getfield        #340 <Field float DrawerLayout$LayoutParams.onScreen>
	//*  43   86:fconst_0        
	//*  44   87:fcmpl           
	//*  45   88:ifne            99
				dispatchOnDrawerClosed(view);
	//   46   91:aload_0         
	//   47   92:aload_3         
	//   48   93:invokevirtual   #881 <Method void dispatchOnDrawerClosed(View)>
			else
	//*  49   96:goto            114
			if(layoutparams.onScreen == 1.0F)
	//*  50   99:aload           7
	//*  51  101:getfield        #340 <Field float DrawerLayout$LayoutParams.onScreen>
	//*  52  104:fconst_1        
	//*  53  105:fcmpl           
	//*  54  106:ifne            114
				dispatchOnDrawerOpened(view);
	//   55  109:aload_0         
	//   56  110:aload_3         
	//   57  111:invokevirtual   #883 <Method void dispatchOnDrawerOpened(View)>
		}
		if(i != mDrawerState)
	//*  58  114:iload_1         
	//*  59  115:aload_0         
	//*  60  116:getfield        #885 <Field int mDrawerState>
	//*  61  119:icmpeq          175
		{
			mDrawerState = i;
	//   62  122:aload_0         
	//   63  123:iload_1         
	//   64  124:putfield        #885 <Field int mDrawerState>
			view = ((View) (mListeners));
	//   65  127:aload_0         
	//   66  128:getfield        #270 <Field List mListeners>
	//   67  131:astore_3        
			if(view != null)
	//*  68  132:aload_3         
	//*  69  133:ifnull          175
				for(j = ((List) (view)).size() - 1; j >= 0; j--)
	//*  70  136:aload_3         
	//*  71  137:invokeinterface #450 <Method int List.size()>
	//*  72  142:iconst_1        
	//*  73  143:isub            
	//*  74  144:istore_2        
	//*  75  145:iload_2         
	//*  76  146:iflt            175
					((DrawerListener)mListeners.get(j)).onDrawerStateChanged(i);
	//   77  149:aload_0         
	//   78  150:getfield        #270 <Field List mListeners>
	//   79  153:iload_2         
	//   80  154:invokeinterface #451 <Method Object List.get(int)>
	//   81  159:checkcast       #9   <Class DrawerLayout$DrawerListener>
	//   82  162:iload_1         
	//   83  163:invokeinterface #888 <Method void DrawerLayout$DrawerListener.onDrawerStateChanged(int)>

	//   84  168:iload_2         
	//   85  169:iconst_1        
	//   86  170:isub            
	//   87  171:istore_2        
		}
	//*  88  172:goto            145
	//   89  175:return          
	}

	static final boolean CAN_HIDE_DESCENDANTS;
	static final int LAYOUT_ATTRS[] = {
		0x10100b3
	};
	private static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION;
	private static final int THEME_ATTRS[] = {
		0x1010434
	};
	private final ChildAccessibilityDelegate mChildAccessibilityDelegate;
	private Rect mChildHitRect;
	private Matrix mChildInvertedMatrix;
	private boolean mChildrenCanceledTouch;
	private boolean mDisallowInterceptRequested;
	private boolean mDrawStatusBarBackground;
	private float mDrawerElevation;
	private int mDrawerState;
	private boolean mFirstLayout;
	private boolean mInLayout;
	private float mInitialMotionX;
	private float mInitialMotionY;
	private Object mLastInsets;
	private final ViewDragCallback mLeftCallback;
	private final ViewDragHelper mLeftDragger;
	private DrawerListener mListener;
	private List mListeners;
	private int mLockModeEnd;
	private int mLockModeLeft;
	private int mLockModeRight;
	private int mLockModeStart;
	private int mMinDrawerMargin;
	private final ArrayList mNonDrawerViews;
	private final ViewDragCallback mRightCallback;
	private final ViewDragHelper mRightDragger;
	private int mScrimColor;
	private float mScrimOpacity;
	private Paint mScrimPaint;
	private Drawable mShadowEnd;
	private Drawable mShadowLeft;
	private Drawable mShadowLeftResolved;
	private Drawable mShadowRight;
	private Drawable mShadowRightResolved;
	private Drawable mShadowStart;
	private Drawable mStatusBarBackground;

	static 
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
	//    2    2:iconst_1        
	//    3    3:newarray        int[]
	//    4    5:dup             
	//    5    6:iconst_0        
	//    6    7:ldc1            #81  <Int 0x1010434>
	//    7    9:iastore         
	//    8   10:putstatic       #83  <Field int[] THEME_ATTRS>
	//    9   13:iconst_1        
	//   10   14:newarray        int[]
	//   11   16:dup             
	//   12   17:iconst_0        
	//   13   18:ldc1            #84  <Int 0x10100b3>
	//   14   20:iastore         
	//   15   21:putstatic       #86  <Field int[] LAYOUT_ATTRS>
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  16   24:getstatic       #91  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   27:bipush          19
	//*  18   29:icmplt          37
			flag = true;
	//   19   32:iconst_1        
	//   20   33:istore_0        
		else
	//*  21   34:goto            39
			flag = false;
	//   22   37:iconst_0        
	//   23   38:istore_0        
		CAN_HIDE_DESCENDANTS = flag;
	//   24   39:iload_0         
	//   25   40:putstatic       #93  <Field boolean CAN_HIDE_DESCENDANTS>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  26   43:getstatic       #91  <Field int android.os.Build$VERSION.SDK_INT>
	//*  27   46:bipush          21
	//*  28   48:icmplt          56
			flag = flag1;
	//   29   51:iload_1         
	//   30   52:istore_0        
		else
	//*  31   53:goto            58
			flag = false;
	//   32   56:iconst_0        
	//   33   57:istore_0        
		SET_DRAWER_SHADOW_FROM_ELEVATION = flag;
	//   34   58:iload_0         
	//   35   59:putstatic       #95  <Field boolean SET_DRAWER_SHADOW_FROM_ELEVATION>
	//*  36   62:return          
	}
}
