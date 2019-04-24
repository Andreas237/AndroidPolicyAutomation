// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.*;
import android.content.Context;
import android.content.res.*;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v4.view.*;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.content.res.AppCompatResources;
import android.text.*;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.*;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o.aa;
import o.p;

// Referenced classes of package android.support.design.widget:
//			TabItem

public class TabLayout extends HorizontalScrollView
{
	public static interface Mode
		extends Annotation
	{
	}

	public static interface OnTabSelectedListener
	{

		public abstract void onTabReselected(Tab tab);

		public abstract void onTabSelected(Tab tab);

		public abstract void onTabUnselected(Tab tab);
	}

	public static final class Tab
	{

		public CharSequence getContentDescription()
		{
			return mContentDesc;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field CharSequence mContentDesc>
		//    2    4:areturn         
		}

		public View getCustomView()
		{
			return mCustomView;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field View mCustomView>
		//    2    4:areturn         
		}

		public Drawable getIcon()
		{
			return mIcon;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field Drawable mIcon>
		//    2    4:areturn         
		}

		public int getPosition()
		{
			return mPosition;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field int mPosition>
		//    2    4:ireturn         
		}

		public Object getTag()
		{
			return mTag;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field Object mTag>
		//    2    4:areturn         
		}

		public CharSequence getText()
		{
			return mText;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field CharSequence mText>
		//    2    4:areturn         
		}

		public boolean isSelected()
		{
			if(mParent == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #58  <Field TabLayout mParent>
		//*   2    4:ifnonnull       17
				throw new IllegalArgumentException("Tab not attached to a TabLayout");
		//    3    7:new             #60  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #62  <String "Tab not attached to a TabLayout">
		//    6   13:invokespecial   #65  <Method void IllegalArgumentException(String)>
		//    7   16:athrow          
			return mParent.getSelectedTabPosition() == mPosition;
		//    8   17:aload_0         
		//    9   18:getfield        #58  <Field TabLayout mParent>
		//   10   21:invokevirtual   #68  <Method int TabLayout.getSelectedTabPosition()>
		//   11   24:aload_0         
		//   12   25:getfield        #30  <Field int mPosition>
		//   13   28:icmpne          33
		//   14   31:iconst_1        
		//   15   32:ireturn         
		//   16   33:iconst_0        
		//   17   34:ireturn         
		}

		void reset()
		{
			mParent = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #58  <Field TabLayout mParent>
			mView = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #71  <Field TabLayout$a mView>
			mTag = null;
		//    6   10:aload_0         
		//    7   11:aconst_null     
		//    8   12:putfield        #51  <Field Object mTag>
			mIcon = null;
		//    9   15:aload_0         
		//   10   16:aconst_null     
		//   11   17:putfield        #45  <Field Drawable mIcon>
			mText = null;
		//   12   20:aload_0         
		//   13   21:aconst_null     
		//   14   22:putfield        #54  <Field CharSequence mText>
			mContentDesc = null;
		//   15   25:aload_0         
		//   16   26:aconst_null     
		//   17   27:putfield        #36  <Field CharSequence mContentDesc>
			mPosition = -1;
		//   18   30:aload_0         
		//   19   31:iconst_m1       
		//   20   32:putfield        #30  <Field int mPosition>
			mCustomView = null;
		//   21   35:aload_0         
		//   22   36:aconst_null     
		//   23   37:putfield        #41  <Field View mCustomView>
		//   24   40:return          
		}

		public void select()
		{
			if(mParent == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #58  <Field TabLayout mParent>
		//*   2    4:ifnonnull       17
			{
				throw new IllegalArgumentException("Tab not attached to a TabLayout");
		//    3    7:new             #60  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #62  <String "Tab not attached to a TabLayout">
		//    6   13:invokespecial   #65  <Method void IllegalArgumentException(String)>
		//    7   16:athrow          
			} else
			{
				mParent.selectTab(this);
		//    8   17:aload_0         
		//    9   18:getfield        #58  <Field TabLayout mParent>
		//   10   21:aload_0         
		//   11   22:invokevirtual   #76  <Method void TabLayout.selectTab(TabLayout$Tab)>
				return;
		//   12   25:return          
			}
		}

		public Tab setContentDescription(int i)
		{
			if(mParent == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #58  <Field TabLayout mParent>
		//*   2    4:ifnonnull       17
				throw new IllegalArgumentException("Tab not attached to a TabLayout");
		//    3    7:new             #60  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #62  <String "Tab not attached to a TabLayout">
		//    6   13:invokespecial   #65  <Method void IllegalArgumentException(String)>
		//    7   16:athrow          
			else
				return setContentDescription(mParent.getResources().getText(i));
		//    8   17:aload_0         
		//    9   18:aload_0         
		//   10   19:getfield        #58  <Field TabLayout mParent>
		//   11   22:invokevirtual   #84  <Method Resources TabLayout.getResources()>
		//   12   25:iload_1         
		//   13   26:invokevirtual   #89  <Method CharSequence Resources.getText(int)>
		//   14   29:invokevirtual   #92  <Method TabLayout$Tab setContentDescription(CharSequence)>
		//   15   32:areturn         
		}

		public Tab setContentDescription(CharSequence charsequence)
		{
			mContentDesc = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #36  <Field CharSequence mContentDesc>
			updateView();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #96  <Method void updateView()>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Tab setCustomView(int i)
		{
			return setCustomView(LayoutInflater.from(mView.getContext()).inflate(i, ((ViewGroup) (mView)), false));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #71  <Field TabLayout$a mView>
		//    3    5:invokevirtual   #104 <Method Context TabLayout$a.getContext()>
		//    4    8:invokestatic    #110 <Method LayoutInflater LayoutInflater.from(Context)>
		//    5   11:iload_1         
		//    6   12:aload_0         
		//    7   13:getfield        #71  <Field TabLayout$a mView>
		//    8   16:iconst_0        
		//    9   17:invokevirtual   #114 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   10   20:invokevirtual   #117 <Method TabLayout$Tab setCustomView(View)>
		//   11   23:areturn         
		}

		public Tab setCustomView(View view)
		{
			mCustomView = view;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #41  <Field View mCustomView>
			updateView();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #96  <Method void updateView()>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Tab setIcon(int i)
		{
			if(mParent == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #58  <Field TabLayout mParent>
		//*   2    4:ifnonnull       17
				throw new IllegalArgumentException("Tab not attached to a TabLayout");
		//    3    7:new             #60  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #62  <String "Tab not attached to a TabLayout">
		//    6   13:invokespecial   #65  <Method void IllegalArgumentException(String)>
		//    7   16:athrow          
			else
				return setIcon(AppCompatResources.getDrawable(mParent.getContext(), i));
		//    8   17:aload_0         
		//    9   18:aload_0         
		//   10   19:getfield        #58  <Field TabLayout mParent>
		//   11   22:invokevirtual   #120 <Method Context TabLayout.getContext()>
		//   12   25:iload_1         
		//   13   26:invokestatic    #126 <Method Drawable AppCompatResources.getDrawable(Context, int)>
		//   14   29:invokevirtual   #129 <Method TabLayout$Tab setIcon(Drawable)>
		//   15   32:areturn         
		}

		public Tab setIcon(Drawable drawable)
		{
			mIcon = drawable;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #45  <Field Drawable mIcon>
			updateView();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #96  <Method void updateView()>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		void setPosition(int i)
		{
			mPosition = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #30  <Field int mPosition>
		//    3    5:return          
		}

		public Tab setTag(Object obj)
		{
			mTag = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #51  <Field Object mTag>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Tab setText(int i)
		{
			if(mParent == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #58  <Field TabLayout mParent>
		//*   2    4:ifnonnull       17
				throw new IllegalArgumentException("Tab not attached to a TabLayout");
		//    3    7:new             #60  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #62  <String "Tab not attached to a TabLayout">
		//    6   13:invokespecial   #65  <Method void IllegalArgumentException(String)>
		//    7   16:athrow          
			else
				return setText(mParent.getResources().getText(i));
		//    8   17:aload_0         
		//    9   18:aload_0         
		//   10   19:getfield        #58  <Field TabLayout mParent>
		//   11   22:invokevirtual   #84  <Method Resources TabLayout.getResources()>
		//   12   25:iload_1         
		//   13   26:invokevirtual   #89  <Method CharSequence Resources.getText(int)>
		//   14   29:invokevirtual   #136 <Method TabLayout$Tab setText(CharSequence)>
		//   15   32:areturn         
		}

		public Tab setText(CharSequence charsequence)
		{
			mText = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #54  <Field CharSequence mText>
			updateView();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #96  <Method void updateView()>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		void updateView()
		{
			if(mView != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #71  <Field TabLayout$a mView>
		//*   2    4:ifnull          14
				mView.d();
		//    3    7:aload_0         
		//    4    8:getfield        #71  <Field TabLayout$a mView>
		//    5   11:invokevirtual   #139 <Method void TabLayout$a.d()>
		//    6   14:return          
		}

		public static final int INVALID_POSITION = -1;
		private CharSequence mContentDesc;
		private View mCustomView;
		private Drawable mIcon;
		TabLayout mParent;
		private int mPosition;
		private Object mTag;
		private CharSequence mText;
		a mView;

		Tab()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			mPosition = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #30  <Field int mPosition>
		//    5    9:return          
		}
	}

	public static interface TabGravity
		extends Annotation
	{
	}

	public static class TabLayoutOnPageChangeListener
		implements android.support.v4.view.ViewPager.OnPageChangeListener
	{

		public void onPageScrollStateChanged(int i)
		{
			mPreviousScrollState = mScrollState;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #32  <Field int mScrollState>
		//    3    5:putfield        #34  <Field int mPreviousScrollState>
			mScrollState = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #32  <Field int mScrollState>
		//    7   13:return          
		}

		public void onPageScrolled(int i, float f, int j)
		{
			TabLayout tablayout = (TabLayout)mTabLayoutRef.get();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WeakReference mTabLayoutRef>
		//    2    4:invokevirtual   #40  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class TabLayout>
		//    4   10:astore          6
			if(tablayout != null)
		//*   5   12:aload           6
		//*   6   14:ifnull          77
			{
				boolean flag;
				if(mScrollState != 2 || mPreviousScrollState == 1)
		//*   7   17:aload_0         
		//*   8   18:getfield        #32  <Field int mScrollState>
		//*   9   21:iconst_2        
		//*  10   22:icmpne          33
		//*  11   25:aload_0         
		//*  12   26:getfield        #34  <Field int mPreviousScrollState>
		//*  13   29:iconst_1        
		//*  14   30:icmpne          39
					flag = true;
		//   15   33:iconst_1        
		//   16   34:istore          4
				else
		//*  17   36:goto            42
					flag = false;
		//   18   39:iconst_0        
		//   19   40:istore          4
				boolean flag1;
				if(mScrollState != 2 || mPreviousScrollState != 0)
		//*  20   42:aload_0         
		//*  21   43:getfield        #32  <Field int mScrollState>
		//*  22   46:iconst_2        
		//*  23   47:icmpne          57
		//*  24   50:aload_0         
		//*  25   51:getfield        #34  <Field int mPreviousScrollState>
		//*  26   54:ifeq            63
					flag1 = true;
		//   27   57:iconst_1        
		//   28   58:istore          5
				else
		//*  29   60:goto            66
					flag1 = false;
		//   30   63:iconst_0        
		//   31   64:istore          5
				tablayout.setScrollPosition(i, f, flag, flag1);
		//   32   66:aload           6
		//   33   68:iload_1         
		//   34   69:fload_2         
		//   35   70:iload           4
		//   36   72:iload           5
		//   37   74:invokevirtual   #44  <Method void TabLayout.setScrollPosition(int, float, boolean, boolean)>
			}
		//   38   77:return          
		}

		public void onPageSelected(int i)
		{
			TabLayout tablayout = (TabLayout)mTabLayoutRef.get();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WeakReference mTabLayoutRef>
		//    2    4:invokevirtual   #40  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class TabLayout>
		//    4   10:astore_3        
			if(tablayout != null && tablayout.getSelectedTabPosition() != i && i < tablayout.getTabCount())
		//*   5   11:aload_3         
		//*   6   12:ifnull          70
		//*   7   15:aload_3         
		//*   8   16:invokevirtual   #49  <Method int TabLayout.getSelectedTabPosition()>
		//*   9   19:iload_1         
		//*  10   20:icmpeq          70
		//*  11   23:iload_1         
		//*  12   24:aload_3         
		//*  13   25:invokevirtual   #52  <Method int TabLayout.getTabCount()>
		//*  14   28:icmpge          70
			{
				boolean flag;
				if(mScrollState == 0 || mScrollState == 2 && mPreviousScrollState == 0)
		//*  15   31:aload_0         
		//*  16   32:getfield        #32  <Field int mScrollState>
		//*  17   35:ifeq            53
		//*  18   38:aload_0         
		//*  19   39:getfield        #32  <Field int mScrollState>
		//*  20   42:iconst_2        
		//*  21   43:icmpne          58
		//*  22   46:aload_0         
		//*  23   47:getfield        #34  <Field int mPreviousScrollState>
		//*  24   50:ifne            58
					flag = true;
		//   25   53:iconst_1        
		//   26   54:istore_2        
				else
		//*  27   55:goto            60
					flag = false;
		//   28   58:iconst_0        
		//   29   59:istore_2        
				tablayout.selectTab(tablayout.getTabAt(i), flag);
		//   30   60:aload_3         
		//   31   61:aload_3         
		//   32   62:iload_1         
		//   33   63:invokevirtual   #56  <Method TabLayout$Tab TabLayout.getTabAt(int)>
		//   34   66:iload_2         
		//   35   67:invokevirtual   #60  <Method void TabLayout.selectTab(TabLayout$Tab, boolean)>
			}
		//   36   70:return          
		}

		void reset()
		{
			mScrollState = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #32  <Field int mScrollState>
			mPreviousScrollState = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #34  <Field int mPreviousScrollState>
		//    6   10:return          
		}

		private int mPreviousScrollState;
		private int mScrollState;
		private final WeakReference mTabLayoutRef;

		public TabLayoutOnPageChangeListener(TabLayout tablayout)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			mTabLayoutRef = new WeakReference(((Object) (tablayout)));
		//    2    4:aload_0         
		//    3    5:new             #22  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #25  <Method void WeakReference(Object)>
		//    7   13:putfield        #27  <Field WeakReference mTabLayoutRef>
		//    8   16:return          
		}
	}

	public static class ViewPagerOnTabSelectedListener
		implements OnTabSelectedListener
	{

		public void onTabReselected(Tab tab)
		{
		//    0    0:return          
		}

		public void onTabSelected(Tab tab)
		{
			mViewPager.setCurrentItem(tab.getPosition());
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ViewPager mViewPager>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #28  <Method int TabLayout$Tab.getPosition()>
		//    4    8:invokevirtual   #34  <Method void ViewPager.setCurrentItem(int)>
		//    5   11:return          
		}

		public void onTabUnselected(Tab tab)
		{
		//    0    0:return          
		}

		private final ViewPager mViewPager;

		public ViewPagerOnTabSelectedListener(ViewPager viewpager)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mViewPager = viewpager;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field ViewPager mViewPager>
		//    5    9:return          
		}
	}

	class a extends LinearLayout
	{

		private void b(TextView textview, ImageView imageview)
		{
			Drawable drawable;
			if(a != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #90  <Field TabLayout$Tab a>
		//*   2    4:ifnull          19
				drawable = a.getIcon();
		//    3    7:aload_0         
		//    4    8:getfield        #90  <Field TabLayout$Tab a>
		//    5   11:invokevirtual   #96  <Method Drawable TabLayout$Tab.getIcon()>
		//    6   14:astore          7
			else
		//*   7   16:goto            22
				drawable = null;
		//    8   19:aconst_null     
		//    9   20:astore          7
			CharSequence charsequence1;
			if(a != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #90  <Field TabLayout$Tab a>
		//*  12   26:ifnull          41
				charsequence1 = a.getText();
		//   13   29:aload_0         
		//   14   30:getfield        #90  <Field TabLayout$Tab a>
		//   15   33:invokevirtual   #100 <Method CharSequence TabLayout$Tab.getText()>
		//   16   36:astore          8
			else
		//*  17   38:goto            44
				charsequence1 = null;
		//   18   41:aconst_null     
		//   19   42:astore          8
			CharSequence charsequence;
			if(a != null)
		//*  20   44:aload_0         
		//*  21   45:getfield        #90  <Field TabLayout$Tab a>
		//*  22   48:ifnull          63
				charsequence = a.getContentDescription();
		//   23   51:aload_0         
		//   24   52:getfield        #90  <Field TabLayout$Tab a>
		//   25   55:invokevirtual   #103 <Method CharSequence TabLayout$Tab.getContentDescription()>
		//   26   58:astore          6
			else
		//*  27   60:goto            66
				charsequence = null;
		//   28   63:aconst_null     
		//   29   64:astore          6
			if(imageview != null)
		//*  30   66:aload_2         
		//*  31   67:ifnull          111
			{
				if(drawable != null)
		//*  32   70:aload           7
		//*  33   72:ifnull          94
				{
					imageview.setImageDrawable(drawable);
		//   34   75:aload_2         
		//   35   76:aload           7
		//   36   78:invokevirtual   #109 <Method void ImageView.setImageDrawable(Drawable)>
					imageview.setVisibility(0);
		//   37   81:aload_2         
		//   38   82:iconst_0        
		//   39   83:invokevirtual   #112 <Method void ImageView.setVisibility(int)>
					setVisibility(0);
		//   40   86:aload_0         
		//   41   87:iconst_0        
		//   42   88:invokevirtual   #113 <Method void setVisibility(int)>
				} else
		//*  43   91:goto            105
				{
					imageview.setVisibility(8);
		//   44   94:aload_2         
		//   45   95:bipush          8
		//   46   97:invokevirtual   #112 <Method void ImageView.setVisibility(int)>
					imageview.setImageDrawable(((Drawable) (null)));
		//   47  100:aload_2         
		//   48  101:aconst_null     
		//   49  102:invokevirtual   #109 <Method void ImageView.setImageDrawable(Drawable)>
				}
				imageview.setContentDescription(charsequence);
		//   50  105:aload_2         
		//   51  106:aload           6
		//   52  108:invokevirtual   #117 <Method void ImageView.setContentDescription(CharSequence)>
			}
			boolean flag;
			if(!TextUtils.isEmpty(charsequence1))
		//*  53  111:aload           8
		//*  54  113:invokestatic    #123 <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  55  116:ifne            124
				flag = true;
		//   56  119:iconst_1        
		//   57  120:istore_3        
			else
		//*  58  121:goto            126
				flag = false;
		//   59  124:iconst_0        
		//   60  125:istore_3        
			if(textview != null)
		//*  61  126:aload_1         
		//*  62  127:ifnull          170
			{
				if(flag)
		//*  63  130:iload_3         
		//*  64  131:ifeq            153
				{
					textview.setText(charsequence1);
		//   65  134:aload_1         
		//   66  135:aload           8
		//   67  137:invokevirtual   #128 <Method void TextView.setText(CharSequence)>
					textview.setVisibility(0);
		//   68  140:aload_1         
		//   69  141:iconst_0        
		//   70  142:invokevirtual   #129 <Method void TextView.setVisibility(int)>
					setVisibility(0);
		//   71  145:aload_0         
		//   72  146:iconst_0        
		//   73  147:invokevirtual   #113 <Method void setVisibility(int)>
				} else
		//*  74  150:goto            164
				{
					textview.setVisibility(8);
		//   75  153:aload_1         
		//   76  154:bipush          8
		//   77  156:invokevirtual   #129 <Method void TextView.setVisibility(int)>
					textview.setText(((CharSequence) (null)));
		//   78  159:aload_1         
		//   79  160:aconst_null     
		//   80  161:invokevirtual   #128 <Method void TextView.setText(CharSequence)>
				}
				textview.setContentDescription(charsequence);
		//   81  164:aload_1         
		//   82  165:aload           6
		//   83  167:invokevirtual   #130 <Method void TextView.setContentDescription(CharSequence)>
			}
			if(imageview != null)
		//*  84  170:aload_2         
		//*  85  171:ifnull          234
			{
				textview = ((TextView) ((android.view.ViewGroup.MarginLayoutParams)imageview.getLayoutParams()));
		//   86  174:aload_2         
		//   87  175:invokevirtual   #134 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
		//   88  178:checkcast       #136 <Class android.view.ViewGroup$MarginLayoutParams>
		//   89  181:astore_1        
				boolean flag1 = false;
		//   90  182:iconst_0        
		//   91  183:istore          5
				int j = ((int) (flag1));
		//   92  185:iload           5
		//   93  187:istore          4
				if(flag)
		//*  94  189:iload_3         
		//*  95  190:ifeq            215
				{
					j = ((int) (flag1));
		//   96  193:iload           5
		//   97  195:istore          4
					if(imageview.getVisibility() == 0)
		//*  98  197:aload_2         
		//*  99  198:invokevirtual   #140 <Method int ImageView.getVisibility()>
		//* 100  201:ifne            215
						j = d.dpToPx(8);
		//  101  204:aload_0         
		//  102  205:getfield        #24  <Field TabLayout d>
		//  103  208:bipush          8
		//  104  210:invokevirtual   #144 <Method int TabLayout.dpToPx(int)>
		//  105  213:istore          4
				}
				if(j != ((android.view.ViewGroup.MarginLayoutParams) (textview)).bottomMargin)
		//* 106  215:iload           4
		//* 107  217:aload_1         
		//* 108  218:getfield        #147 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
		//* 109  221:icmpeq          234
				{
					textview.bottomMargin = j;
		//  110  224:aload_1         
		//  111  225:iload           4
		//  112  227:putfield        #147 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
					imageview.requestLayout();
		//  113  230:aload_2         
		//  114  231:invokevirtual   #151 <Method void ImageView.requestLayout()>
				}
			}
			if(flag)
		//* 115  234:iload_3         
		//* 116  235:ifeq            244
				charsequence = null;
		//  117  238:aconst_null     
		//  118  239:astore          6
		//* 119  241:goto            244
			ViewCompat.setTooltipText(((View) (this)), charsequence);
		//  120  244:aload_0         
		//  121  245:aload           6
		//  122  247:invokestatic    #155 <Method void ViewCompat.setTooltipText(View, CharSequence)>
		//  123  250:return          
		}

		private float d(Layout layout, int j, float f1)
		{
			return layout.getLineWidth(j) * (f1 / layout.getPaint().getTextSize());
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #163 <Method float Layout.getLineWidth(int)>
		//    3    5:fload_3         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #167 <Method TextPaint Layout.getPaint()>
		//    6   10:invokevirtual   #173 <Method float TextPaint.getTextSize()>
		//    7   13:fdiv            
		//    8   14:fmul            
		//    9   15:freturn         
		}

		void b()
		{
			c(((Tab) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokevirtual   #176 <Method void c(TabLayout$Tab)>
			setSelected(false);
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:invokevirtual   #179 <Method void setSelected(boolean)>
		//    6   10:return          
		}

		void c(Tab tab)
		{
			if(tab != a)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #90  <Field TabLayout$Tab a>
		//*   3    5:if_acmpeq       17
			{
				a = tab;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:putfield        #90  <Field TabLayout$Tab a>
				d();
		//    7   13:aload_0         
		//    8   14:invokevirtual   #181 <Method void d()>
			}
		//    9   17:return          
		}

		final void d()
		{
			Tab tab = a;
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field TabLayout$Tab a>
		//    2    4:astore_3        
			View view;
			if(tab != null)
		//*   3    5:aload_3         
		//*   4    6:ifnull          17
				view = tab.getCustomView();
		//    5    9:aload_3         
		//    6   10:invokevirtual   #185 <Method View TabLayout$Tab.getCustomView()>
		//    7   13:astore_2        
			else
		//*   8   14:goto            19
				view = null;
		//    9   17:aconst_null     
		//   10   18:astore_2        
			if(view != null)
		//*  11   19:aload_2         
		//*  12   20:ifnull          146
			{
				android.view.ViewParent viewparent = view.getParent();
		//   13   23:aload_2         
		//   14   24:invokevirtual   #191 <Method android.view.ViewParent View.getParent()>
		//   15   27:astore          4
				if(viewparent != this)
		//*  16   29:aload           4
		//*  17   31:aload_0         
		//*  18   32:if_acmpeq       54
				{
					if(viewparent != null)
		//*  19   35:aload           4
		//*  20   37:ifnull          49
						((ViewGroup)viewparent).removeView(view);
		//   21   40:aload           4
		//   22   42:checkcast       #193 <Class ViewGroup>
		//   23   45:aload_2         
		//   24   46:invokevirtual   #197 <Method void ViewGroup.removeView(View)>
					addView(view);
		//   25   49:aload_0         
		//   26   50:aload_2         
		//   27   51:invokevirtual   #200 <Method void addView(View)>
				}
				e = view;
		//   28   54:aload_0         
		//   29   55:aload_2         
		//   30   56:putfield        #202 <Field View e>
				if(c != null)
		//*  31   59:aload_0         
		//*  32   60:getfield        #204 <Field TextView c>
		//*  33   63:ifnull          75
					c.setVisibility(8);
		//   34   66:aload_0         
		//   35   67:getfield        #204 <Field TextView c>
		//   36   70:bipush          8
		//   37   72:invokevirtual   #129 <Method void TextView.setVisibility(int)>
				if(b != null)
		//*  38   75:aload_0         
		//*  39   76:getfield        #206 <Field ImageView b>
		//*  40   79:ifnull          99
				{
					b.setVisibility(8);
		//   41   82:aload_0         
		//   42   83:getfield        #206 <Field ImageView b>
		//   43   86:bipush          8
		//   44   88:invokevirtual   #112 <Method void ImageView.setVisibility(int)>
					b.setImageDrawable(((Drawable) (null)));
		//   45   91:aload_0         
		//   46   92:getfield        #206 <Field ImageView b>
		//   47   95:aconst_null     
		//   48   96:invokevirtual   #109 <Method void ImageView.setImageDrawable(Drawable)>
				}
				f = (TextView)view.findViewById(0x1020014);
		//   49   99:aload_0         
		//   50  100:aload_2         
		//   51  101:ldc1            #207 <Int 0x1020014>
		//   52  103:invokevirtual   #211 <Method View View.findViewById(int)>
		//   53  106:checkcast       #125 <Class TextView>
		//   54  109:putfield        #213 <Field TextView f>
				if(f != null)
		//*  55  112:aload_0         
		//*  56  113:getfield        #213 <Field TextView f>
		//*  57  116:ifnull          130
					h = TextViewCompat.getMaxLines(f);
		//   58  119:aload_0         
		//   59  120:aload_0         
		//   60  121:getfield        #213 <Field TextView f>
		//   61  124:invokestatic    #219 <Method int TextViewCompat.getMaxLines(TextView)>
		//   62  127:putfield        #29  <Field int h>
				i = (ImageView)view.findViewById(0x1020006);
		//   63  130:aload_0         
		//   64  131:aload_2         
		//   65  132:ldc1            #220 <Int 0x1020006>
		//   66  134:invokevirtual   #211 <Method View View.findViewById(int)>
		//   67  137:checkcast       #105 <Class ImageView>
		//   68  140:putfield        #222 <Field ImageView i>
			} else
		//*  69  143:goto            176
			{
				if(e != null)
		//*  70  146:aload_0         
		//*  71  147:getfield        #202 <Field View e>
		//*  72  150:ifnull          166
				{
					removeView(e);
		//   73  153:aload_0         
		//   74  154:aload_0         
		//   75  155:getfield        #202 <Field View e>
		//   76  158:invokevirtual   #223 <Method void removeView(View)>
					e = null;
		//   77  161:aload_0         
		//   78  162:aconst_null     
		//   79  163:putfield        #202 <Field View e>
				}
				f = null;
		//   80  166:aload_0         
		//   81  167:aconst_null     
		//   82  168:putfield        #213 <Field TextView f>
				i = null;
		//   83  171:aload_0         
		//   84  172:aconst_null     
		//   85  173:putfield        #222 <Field ImageView i>
			}
			if(e == null)
		//*  86  176:aload_0         
		//*  87  177:getfield        #202 <Field View e>
		//*  88  180:ifnonnull       320
			{
				if(b == null)
		//*  89  183:aload_0         
		//*  90  184:getfield        #206 <Field ImageView b>
		//*  91  187:ifnonnull       220
				{
					ImageView imageview = (ImageView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_layout_tab_icon, ((ViewGroup) (this)), false);
		//   92  190:aload_0         
		//   93  191:invokevirtual   #75  <Method Context getContext()>
		//   94  194:invokestatic    #229 <Method LayoutInflater LayoutInflater.from(Context)>
		//   95  197:getstatic       #234 <Field int android.support.design.R$layout.design_layout_tab_icon>
		//   96  200:aload_0         
		//   97  201:iconst_0        
		//   98  202:invokevirtual   #238 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   99  205:checkcast       #105 <Class ImageView>
		//  100  208:astore_2        
					addView(((View) (imageview)), 0);
		//  101  209:aload_0         
		//  102  210:aload_2         
		//  103  211:iconst_0        
		//  104  212:invokevirtual   #241 <Method void addView(View, int)>
					b = imageview;
		//  105  215:aload_0         
		//  106  216:aload_2         
		//  107  217:putfield        #206 <Field ImageView b>
				}
				if(c == null)
		//* 108  220:aload_0         
		//* 109  221:getfield        #204 <Field TextView c>
		//* 110  224:ifnonnull       267
				{
					TextView textview = (TextView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_layout_tab_text, ((ViewGroup) (this)), false);
		//  111  227:aload_0         
		//  112  228:invokevirtual   #75  <Method Context getContext()>
		//  113  231:invokestatic    #229 <Method LayoutInflater LayoutInflater.from(Context)>
		//  114  234:getstatic       #244 <Field int android.support.design.R$layout.design_layout_tab_text>
		//  115  237:aload_0         
		//  116  238:iconst_0        
		//  117  239:invokevirtual   #238 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//  118  242:checkcast       #125 <Class TextView>
		//  119  245:astore_2        
					addView(((View) (textview)));
		//  120  246:aload_0         
		//  121  247:aload_2         
		//  122  248:invokevirtual   #200 <Method void addView(View)>
					c = textview;
		//  123  251:aload_0         
		//  124  252:aload_2         
		//  125  253:putfield        #204 <Field TextView c>
					h = TextViewCompat.getMaxLines(c);
		//  126  256:aload_0         
		//  127  257:aload_0         
		//  128  258:getfield        #204 <Field TextView c>
		//  129  261:invokestatic    #219 <Method int TextViewCompat.getMaxLines(TextView)>
		//  130  264:putfield        #29  <Field int h>
				}
				TextViewCompat.setTextAppearance(c, d.mTabTextAppearance);
		//  131  267:aload_0         
		//  132  268:getfield        #204 <Field TextView c>
		//  133  271:aload_0         
		//  134  272:getfield        #24  <Field TabLayout d>
		//  135  275:getfield        #247 <Field int TabLayout.mTabTextAppearance>
		//  136  278:invokestatic    #251 <Method void TextViewCompat.setTextAppearance(TextView, int)>
				if(d.mTabTextColors != null)
		//* 137  281:aload_0         
		//* 138  282:getfield        #24  <Field TabLayout d>
		//* 139  285:getfield        #255 <Field ColorStateList TabLayout.mTabTextColors>
		//* 140  288:ifnull          305
					c.setTextColor(d.mTabTextColors);
		//  141  291:aload_0         
		//  142  292:getfield        #204 <Field TextView c>
		//  143  295:aload_0         
		//  144  296:getfield        #24  <Field TabLayout d>
		//  145  299:getfield        #255 <Field ColorStateList TabLayout.mTabTextColors>
		//  146  302:invokevirtual   #259 <Method void TextView.setTextColor(ColorStateList)>
				b(c, b);
		//  147  305:aload_0         
		//  148  306:aload_0         
		//  149  307:getfield        #204 <Field TextView c>
		//  150  310:aload_0         
		//  151  311:getfield        #206 <Field ImageView b>
		//  152  314:invokespecial   #261 <Method void b(TextView, ImageView)>
			} else
		//* 153  317:goto            346
			if(f != null || i != null)
		//* 154  320:aload_0         
		//* 155  321:getfield        #213 <Field TextView f>
		//* 156  324:ifnonnull       334
		//* 157  327:aload_0         
		//* 158  328:getfield        #222 <Field ImageView i>
		//* 159  331:ifnull          346
				b(f, i);
		//  160  334:aload_0         
		//  161  335:aload_0         
		//  162  336:getfield        #213 <Field TextView f>
		//  163  339:aload_0         
		//  164  340:getfield        #222 <Field ImageView i>
		//  165  343:invokespecial   #261 <Method void b(TextView, ImageView)>
			boolean flag;
			if(tab != null && tab.isSelected())
		//* 166  346:aload_3         
		//* 167  347:ifnull          362
		//* 168  350:aload_3         
		//* 169  351:invokevirtual   #265 <Method boolean TabLayout$Tab.isSelected()>
		//* 170  354:ifeq            362
				flag = true;
		//  171  357:iconst_1        
		//  172  358:istore_1        
			else
		//* 173  359:goto            364
				flag = false;
		//  174  362:iconst_0        
		//  175  363:istore_1        
			setSelected(flag);
		//  176  364:aload_0         
		//  177  365:iload_1         
		//  178  366:invokevirtual   #179 <Method void setSelected(boolean)>
		//  179  369:return          
		}

		public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
		{
			super.onInitializeAccessibilityEvent(accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #269 <Method void LinearLayout.onInitializeAccessibilityEvent(AccessibilityEvent)>
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$Tab)).getName())));
		//    3    5:aload_1         
		//    4    6:ldc2            #271 <Class android.support.v7.app.ActionBar$Tab>
		//    5    9:invokevirtual   #277 <Method String Class.getName()>
		//    6   12:invokevirtual   #282 <Method void AccessibilityEvent.setClassName(CharSequence)>
		//    7   15:return          
		}

		public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
		{
			super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #286 <Method void LinearLayout.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
			accessibilitynodeinfo.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$Tab)).getName())));
		//    3    5:aload_1         
		//    4    6:ldc2            #271 <Class android.support.v7.app.ActionBar$Tab>
		//    5    9:invokevirtual   #277 <Method String Class.getName()>
		//    6   12:invokevirtual   #289 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
		//    7   15:return          
		}

		public void onMeasure(int j, int k)
		{
label0:
			{
				float f1;
				int l;
				boolean flag;
label1:
				{
					l = android.view.View.MeasureSpec.getSize(j);
		//    0    0:iload_1         
		//    1    1:invokestatic    #296 <Method int android.view.View$MeasureSpec.getSize(int)>
		//    2    4:istore          5
					int i1 = android.view.View.MeasureSpec.getMode(j);
		//    3    6:iload_1         
		//    4    7:invokestatic    #299 <Method int android.view.View$MeasureSpec.getMode(int)>
		//    5   10:istore          6
					int j1 = d.getTabMaxWidth();
		//    6   12:aload_0         
		//    7   13:getfield        #24  <Field TabLayout d>
		//    8   16:invokevirtual   #302 <Method int TabLayout.getTabMaxWidth()>
		//    9   19:istore          7
					if(j1 > 0 && (i1 == 0 || l > j1))
		//*  10   21:iload           7
		//*  11   23:ifle            55
		//*  12   26:iload           6
		//*  13   28:ifeq            38
		//*  14   31:iload           5
		//*  15   33:iload           7
		//*  16   35:icmple          55
						j = android.view.View.MeasureSpec.makeMeasureSpec(d.mTabMaxWidth, 0x80000000);
		//   17   38:aload_0         
		//   18   39:getfield        #24  <Field TabLayout d>
		//   19   42:getfield        #305 <Field int TabLayout.mTabMaxWidth>
		//   20   45:ldc2            #306 <Int 0x80000000>
		//   21   48:invokestatic    #310 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   22   51:istore_1        
		//*  23   52:goto            55
					super.onMeasure(j, k);
		//   24   55:aload_0         
		//   25   56:iload_1         
		//   26   57:iload_2         
		//   27   58:invokespecial   #312 <Method void LinearLayout.onMeasure(int, int)>
					if(c == null)
						break label0;
		//   28   61:aload_0         
		//   29   62:getfield        #204 <Field TextView c>
		//   30   65:ifnull          320
					getResources();
		//   31   68:aload_0         
		//   32   69:invokevirtual   #316 <Method Resources getResources()>
		//   33   72:pop             
					float f2 = d.mTabTextSize;
		//   34   73:aload_0         
		//   35   74:getfield        #24  <Field TabLayout d>
		//   36   77:getfield        #320 <Field float TabLayout.mTabTextSize>
		//   37   80:fstore          4
					i1 = h;
		//   38   82:aload_0         
		//   39   83:getfield        #29  <Field int h>
		//   40   86:istore          6
					if(b != null && b.getVisibility() == 0)
		//*  41   88:aload_0         
		//*  42   89:getfield        #206 <Field ImageView b>
		//*  43   92:ifnull          114
		//*  44   95:aload_0         
		//*  45   96:getfield        #206 <Field ImageView b>
		//*  46   99:invokevirtual   #140 <Method int ImageView.getVisibility()>
		//*  47  102:ifne            114
					{
						l = 1;
		//   48  105:iconst_1        
		//   49  106:istore          5
						f1 = f2;
		//   50  108:fload           4
		//   51  110:fstore_3        
					} else
		//*  52  111:goto            158
					{
						f1 = f2;
		//   53  114:fload           4
		//   54  116:fstore_3        
						l = i1;
		//   55  117:iload           6
		//   56  119:istore          5
						if(c != null)
		//*  57  121:aload_0         
		//*  58  122:getfield        #204 <Field TextView c>
		//*  59  125:ifnull          158
						{
							f1 = f2;
		//   60  128:fload           4
		//   61  130:fstore_3        
							l = i1;
		//   62  131:iload           6
		//   63  133:istore          5
							if(c.getLineCount() > 1)
		//*  64  135:aload_0         
		//*  65  136:getfield        #204 <Field TextView c>
		//*  66  139:invokevirtual   #323 <Method int TextView.getLineCount()>
		//*  67  142:iconst_1        
		//*  68  143:icmple          158
							{
								f1 = d.mTabTextMultiLineSize;
		//   69  146:aload_0         
		//   70  147:getfield        #24  <Field TabLayout d>
		//   71  150:getfield        #326 <Field float TabLayout.mTabTextMultiLineSize>
		//   72  153:fstore_3        
								l = i1;
		//   73  154:iload           6
		//   74  156:istore          5
							}
						}
					}
					f2 = c.getTextSize();
		//   75  158:aload_0         
		//   76  159:getfield        #204 <Field TextView c>
		//   77  162:invokevirtual   #327 <Method float TextView.getTextSize()>
		//   78  165:fstore          4
					int k1 = c.getLineCount();
		//   79  167:aload_0         
		//   80  168:getfield        #204 <Field TextView c>
		//   81  171:invokevirtual   #323 <Method int TextView.getLineCount()>
		//   82  174:istore          8
					i1 = TextViewCompat.getMaxLines(c);
		//   83  176:aload_0         
		//   84  177:getfield        #204 <Field TextView c>
		//   85  180:invokestatic    #219 <Method int TextViewCompat.getMaxLines(TextView)>
		//   86  183:istore          6
					if(f1 == f2 && (i1 < 0 || l == i1))
						break label0;
		//   87  185:fload_3         
		//   88  186:fload           4
		//   89  188:fcmpl           
		//   90  189:ifne            204
		//   91  192:iload           6
		//   92  194:iflt            320
		//   93  197:iload           5
		//   94  199:iload           6
		//   95  201:icmpeq          320
					j1 = 1;
		//   96  204:iconst_1        
		//   97  205:istore          7
					flag = ((boolean) (j1));
		//   98  207:iload           7
		//   99  209:istore          6
					if(d.mMode != 1)
						break label1;
		//  100  211:aload_0         
		//  101  212:getfield        #24  <Field TabLayout d>
		//  102  215:getfield        #330 <Field int TabLayout.mMode>
		//  103  218:iconst_1        
		//  104  219:icmpne          291
					flag = ((boolean) (j1));
		//  105  222:iload           7
		//  106  224:istore          6
					if(f1 <= f2)
						break label1;
		//  107  226:fload_3         
		//  108  227:fload           4
		//  109  229:fcmpl           
		//  110  230:ifle            291
					flag = ((boolean) (j1));
		//  111  233:iload           7
		//  112  235:istore          6
					if(k1 != 1)
						break label1;
		//  113  237:iload           8
		//  114  239:iconst_1        
		//  115  240:icmpne          291
					Layout layout = c.getLayout();
		//  116  243:aload_0         
		//  117  244:getfield        #204 <Field TextView c>
		//  118  247:invokevirtual   #334 <Method Layout TextView.getLayout()>
		//  119  250:astore          9
					if(layout != null)
		//* 120  252:aload           9
		//* 121  254:ifnull          288
					{
						flag = ((boolean) (j1));
		//  122  257:iload           7
		//  123  259:istore          6
						if(d(layout, 0, f1) <= (float)(getMeasuredWidth() - getPaddingLeft() - getPaddingRight()))
							break label1;
		//  124  261:aload_0         
		//  125  262:aload           9
		//  126  264:iconst_0        
		//  127  265:fload_3         
		//  128  266:invokespecial   #336 <Method float d(Layout, int, float)>
		//  129  269:aload_0         
		//  130  270:invokevirtual   #339 <Method int getMeasuredWidth()>
		//  131  273:aload_0         
		//  132  274:invokevirtual   #342 <Method int getPaddingLeft()>
		//  133  277:isub            
		//  134  278:aload_0         
		//  135  279:invokevirtual   #345 <Method int getPaddingRight()>
		//  136  282:isub            
		//  137  283:i2f             
		//  138  284:fcmpl           
		//  139  285:ifle            291
					}
					flag = false;
		//  140  288:iconst_0        
		//  141  289:istore          6
				}
				if(flag)
		//* 142  291:iload           6
		//* 143  293:ifeq            320
				{
					c.setTextSize(0, f1);
		//  144  296:aload_0         
		//  145  297:getfield        #204 <Field TextView c>
		//  146  300:iconst_0        
		//  147  301:fload_3         
		//  148  302:invokevirtual   #349 <Method void TextView.setTextSize(int, float)>
					c.setMaxLines(l);
		//  149  305:aload_0         
		//  150  306:getfield        #204 <Field TextView c>
		//  151  309:iload           5
		//  152  311:invokevirtual   #352 <Method void TextView.setMaxLines(int)>
					super.onMeasure(j, k);
		//  153  314:aload_0         
		//  154  315:iload_1         
		//  155  316:iload_2         
		//  156  317:invokespecial   #312 <Method void LinearLayout.onMeasure(int, int)>
				}
			}
		//  157  320:return          
		}

		public boolean performClick()
		{
			boolean flag = super.performClick();
		//    0    0:aload_0         
		//    1    1:invokespecial   #355 <Method boolean LinearLayout.performClick()>
		//    2    4:istore_1        
			if(a != null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #90  <Field TabLayout$Tab a>
		//*   5    9:ifnull          30
			{
				if(!flag)
		//*   6   12:iload_1         
		//*   7   13:ifne            21
					playSoundEffect(0);
		//    8   16:aload_0         
		//    9   17:iconst_0        
		//   10   18:invokevirtual   #358 <Method void playSoundEffect(int)>
				a.select();
		//   11   21:aload_0         
		//   12   22:getfield        #90  <Field TabLayout$Tab a>
		//   13   25:invokevirtual   #361 <Method void TabLayout$Tab.select()>
				return true;
		//   14   28:iconst_1        
		//   15   29:ireturn         
			} else
			{
				return flag;
		//   16   30:iload_1         
		//   17   31:ireturn         
			}
		}

		public void setSelected(boolean flag)
		{
			boolean flag1;
			if(isSelected() != flag)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #362 <Method boolean isSelected()>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          13
				flag1 = true;
		//    4    8:iconst_1        
		//    5    9:istore_2        
			else
		//*   6   10:goto            15
				flag1 = false;
		//    7   13:iconst_0        
		//    8   14:istore_2        
			super.setSelected(flag);
		//    9   15:aload_0         
		//   10   16:iload_1         
		//   11   17:invokespecial   #363 <Method void LinearLayout.setSelected(boolean)>
			if(flag1 && flag && android.os.Build.VERSION.SDK_INT < 16)
		//*  12   20:iload_2         
		//*  13   21:ifeq            41
		//*  14   24:iload_1         
		//*  15   25:ifeq            41
		//*  16   28:getstatic       #368 <Field int android.os.Build$VERSION.SDK_INT>
		//*  17   31:bipush          16
		//*  18   33:icmpge          41
				sendAccessibilityEvent(4);
		//   19   36:aload_0         
		//   20   37:iconst_4        
		//   21   38:invokevirtual   #371 <Method void sendAccessibilityEvent(int)>
			if(c != null)
		//*  22   41:aload_0         
		//*  23   42:getfield        #204 <Field TextView c>
		//*  24   45:ifnull          56
				c.setSelected(flag);
		//   25   48:aload_0         
		//   26   49:getfield        #204 <Field TextView c>
		//   27   52:iload_1         
		//   28   53:invokevirtual   #372 <Method void TextView.setSelected(boolean)>
			if(b != null)
		//*  29   56:aload_0         
		//*  30   57:getfield        #206 <Field ImageView b>
		//*  31   60:ifnull          71
				b.setSelected(flag);
		//   32   63:aload_0         
		//   33   64:getfield        #206 <Field ImageView b>
		//   34   67:iload_1         
		//   35   68:invokevirtual   #373 <Method void ImageView.setSelected(boolean)>
			if(e != null)
		//*  36   71:aload_0         
		//*  37   72:getfield        #202 <Field View e>
		//*  38   75:ifnull          86
				e.setSelected(flag);
		//   39   78:aload_0         
		//   40   79:getfield        #202 <Field View e>
		//   41   82:iload_1         
		//   42   83:invokevirtual   #374 <Method void View.setSelected(boolean)>
		//   43   86:return          
		}

		private Tab a;
		private ImageView b;
		private TextView c;
		final TabLayout d;
		private View e;
		private TextView f;
		private int h;
		private ImageView i;

		public a(Context context)
		{
			d = TabLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #24  <Field TabLayout d>
			super(context);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #27  <Method void LinearLayout(Context)>
			h = 2;
		//    6   10:aload_0         
		//    7   11:iconst_2        
		//    8   12:putfield        #29  <Field int h>
			if(mTabBackgroundResId != 0)
		//*   9   15:aload_1         
		//*  10   16:getfield        #32  <Field int TabLayout.mTabBackgroundResId>
		//*  11   19:ifeq            34
				ViewCompat.setBackground(((View) (this)), AppCompatResources.getDrawable(context, mTabBackgroundResId));
		//   12   22:aload_0         
		//   13   23:aload_2         
		//   14   24:aload_1         
		//   15   25:getfield        #32  <Field int TabLayout.mTabBackgroundResId>
		//   16   28:invokestatic    #38  <Method Drawable AppCompatResources.getDrawable(Context, int)>
		//   17   31:invokestatic    #44  <Method void ViewCompat.setBackground(View, Drawable)>
			ViewCompat.setPaddingRelative(((View) (this)), mTabPaddingStart, mTabPaddingTop, mTabPaddingEnd, mTabPaddingBottom);
		//   18   34:aload_0         
		//   19   35:aload_1         
		//   20   36:getfield        #47  <Field int TabLayout.mTabPaddingStart>
		//   21   39:aload_1         
		//   22   40:getfield        #50  <Field int TabLayout.mTabPaddingTop>
		//   23   43:aload_1         
		//   24   44:getfield        #53  <Field int TabLayout.mTabPaddingEnd>
		//   25   47:aload_1         
		//   26   48:getfield        #56  <Field int TabLayout.mTabPaddingBottom>
		//   27   51:invokestatic    #60  <Method void ViewCompat.setPaddingRelative(View, int, int, int, int)>
			setGravity(17);
		//   28   54:aload_0         
		//   29   55:bipush          17
		//   30   57:invokevirtual   #64  <Method void setGravity(int)>
			setOrientation(1);
		//   31   60:aload_0         
		//   32   61:iconst_1        
		//   33   62:invokevirtual   #67  <Method void setOrientation(int)>
			setClickable(true);
		//   34   65:aload_0         
		//   35   66:iconst_1        
		//   36   67:invokevirtual   #71  <Method void setClickable(boolean)>
			ViewCompat.setPointerIcon(((View) (this)), PointerIconCompat.getSystemIcon(getContext(), 1002));
		//   37   70:aload_0         
		//   38   71:aload_0         
		//   39   72:invokevirtual   #75  <Method Context getContext()>
		//   40   75:sipush          1002
		//   41   78:invokestatic    #81  <Method PointerIconCompat PointerIconCompat.getSystemIcon(Context, int)>
		//   42   81:invokestatic    #85  <Method void ViewCompat.setPointerIcon(View, PointerIconCompat)>
		//   43   84:return          
		}
	}

	class b extends LinearLayout
	{

		private void c()
		{
			View view = getChildAt(d);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #33  <Field int d>
		//    3    5:invokevirtual   #55  <Method View getChildAt(int)>
		//    4    8:astore          5
			int j;
			int k;
			if(view != null && view.getWidth() > 0)
		//*   5   10:aload           5
		//*   6   12:ifnull          130
		//*   7   15:aload           5
		//*   8   17:invokevirtual   #61  <Method int View.getWidth()>
		//*   9   20:ifle            130
			{
				int i1 = view.getLeft();
		//   10   23:aload           5
		//   11   25:invokevirtual   #64  <Method int View.getLeft()>
		//   12   28:istore          4
				int l = view.getRight();
		//   13   30:aload           5
		//   14   32:invokevirtual   #67  <Method int View.getRight()>
		//   15   35:istore_3        
				j = i1;
		//   16   36:iload           4
		//   17   38:istore_1        
				k = l;
		//   18   39:iload_3         
		//   19   40:istore_2        
				if(a > 0.0F)
		//*  20   41:aload_0         
		//*  21   42:getfield        #69  <Field float a>
		//*  22   45:fconst_0        
		//*  23   46:fcmpl           
		//*  24   47:ifle            134
				{
					j = i1;
		//   25   50:iload           4
		//   26   52:istore_1        
					k = l;
		//   27   53:iload_3         
		//   28   54:istore_2        
					if(d < getChildCount() - 1)
		//*  29   55:aload_0         
		//*  30   56:getfield        #33  <Field int d>
		//*  31   59:aload_0         
		//*  32   60:invokevirtual   #72  <Method int getChildCount()>
		//*  33   63:iconst_1        
		//*  34   64:isub            
		//*  35   65:icmpge          134
					{
						View view1 = getChildAt(d + 1);
		//   36   68:aload_0         
		//   37   69:aload_0         
		//   38   70:getfield        #33  <Field int d>
		//   39   73:iconst_1        
		//   40   74:iadd            
		//   41   75:invokevirtual   #55  <Method View getChildAt(int)>
		//   42   78:astore          5
						j = (int)(a * (float)view1.getLeft() + (1.0F - a) * (float)i1);
		//   43   80:aload_0         
		//   44   81:getfield        #69  <Field float a>
		//   45   84:aload           5
		//   46   86:invokevirtual   #64  <Method int View.getLeft()>
		//   47   89:i2f             
		//   48   90:fmul            
		//   49   91:fconst_1        
		//   50   92:aload_0         
		//   51   93:getfield        #69  <Field float a>
		//   52   96:fsub            
		//   53   97:iload           4
		//   54   99:i2f             
		//   55  100:fmul            
		//   56  101:fadd            
		//   57  102:f2i             
		//   58  103:istore_1        
						k = (int)(a * (float)view1.getRight() + (1.0F - a) * (float)l);
		//   59  104:aload_0         
		//   60  105:getfield        #69  <Field float a>
		//   61  108:aload           5
		//   62  110:invokevirtual   #67  <Method int View.getRight()>
		//   63  113:i2f             
		//   64  114:fmul            
		//   65  115:fconst_1        
		//   66  116:aload_0         
		//   67  117:getfield        #69  <Field float a>
		//   68  120:fsub            
		//   69  121:iload_3         
		//   70  122:i2f             
		//   71  123:fmul            
		//   72  124:fadd            
		//   73  125:f2i             
		//   74  126:istore_2        
					}
				}
			} else
		//*  75  127:goto            134
			{
				k = -1;
		//   76  130:iconst_m1       
		//   77  131:istore_2        
				j = -1;
		//   78  132:iconst_m1       
		//   79  133:istore_1        
			}
			c(j, k);
		//   80  134:aload_0         
		//   81  135:iload_1         
		//   82  136:iload_2         
		//   83  137:invokevirtual   #75  <Method void c(int, int)>
		//   84  140:return          
		}

		boolean a()
		{
			int j = 0;
		//    0    0:iconst_0        
		//    1    1:istore_1        
			for(int k = getChildCount(); j < k; j++)
		//*   2    2:aload_0         
		//*   3    3:invokevirtual   #72  <Method int getChildCount()>
		//*   4    6:istore_2        
		//*   5    7:iload_1         
		//*   6    8:iload_2         
		//*   7    9:icmpge          32
				if(getChildAt(j).getWidth() <= 0)
		//*   8   12:aload_0         
		//*   9   13:iload_1         
		//*  10   14:invokevirtual   #55  <Method View getChildAt(int)>
		//*  11   17:invokevirtual   #61  <Method int View.getWidth()>
		//*  12   20:ifgt            25
					return true;
		//   13   23:iconst_1        
		//   14   24:ireturn         

		//   15   25:iload_1         
		//   16   26:iconst_1        
		//   17   27:iadd            
		//   18   28:istore_1        
		//*  19   29:goto            7
			return false;
		//   20   32:iconst_0        
		//   21   33:ireturn         
		}

		void b(int j)
		{
			if(b.getColor() != j)
		//*   0    0:aload_0         
		//*   1    1:getfield        #50  <Field Paint b>
		//*   2    4:invokevirtual   #80  <Method int Paint.getColor()>
		//*   3    7:iload_1         
		//*   4    8:icmpeq          23
			{
				b.setColor(j);
		//    5   11:aload_0         
		//    6   12:getfield        #50  <Field Paint b>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #83  <Method void Paint.setColor(int)>
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
		//    9   19:aload_0         
		//   10   20:invokestatic    #89  <Method void ViewCompat.postInvalidateOnAnimation(View)>
			}
		//   11   23:return          
		}

		void c(int j, float f1)
		{
			if(g != null && g.isRunning())
		//*   0    0:aload_0         
		//*   1    1:getfield        #92  <Field ValueAnimator g>
		//*   2    4:ifnull          24
		//*   3    7:aload_0         
		//*   4    8:getfield        #92  <Field ValueAnimator g>
		//*   5   11:invokevirtual   #97  <Method boolean ValueAnimator.isRunning()>
		//*   6   14:ifeq            24
				g.cancel();
		//    7   17:aload_0         
		//    8   18:getfield        #92  <Field ValueAnimator g>
		//    9   21:invokevirtual   #100 <Method void ValueAnimator.cancel()>
			d = j;
		//   10   24:aload_0         
		//   11   25:iload_1         
		//   12   26:putfield        #33  <Field int d>
			a = f1;
		//   13   29:aload_0         
		//   14   30:fload_2         
		//   15   31:putfield        #69  <Field float a>
			c();
		//   16   34:aload_0         
		//   17   35:invokespecial   #102 <Method void c()>
		//   18   38:return          
		}

		void c(int j, int k)
		{
			if(j != h || k != i)
		//*   0    0:iload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #37  <Field int h>
		//*   3    5:icmpne          16
		//*   4    8:iload_2         
		//*   5    9:aload_0         
		//*   6   10:getfield        #39  <Field int i>
		//*   7   13:icmpeq          30
			{
				h = j;
		//    8   16:aload_0         
		//    9   17:iload_1         
		//   10   18:putfield        #37  <Field int h>
				i = k;
		//   11   21:aload_0         
		//   12   22:iload_2         
		//   13   23:putfield        #39  <Field int i>
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
		//   14   26:aload_0         
		//   15   27:invokestatic    #89  <Method void ViewCompat.postInvalidateOnAnimation(View)>
			}
		//   16   30:return          
		}

		public void draw(Canvas canvas)
		{
			super.draw(canvas);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #106 <Method void LinearLayout.draw(Canvas)>
			if(h >= 0 && i > h)
		//*   3    5:aload_0         
		//*   4    6:getfield        #37  <Field int h>
		//*   5    9:iflt            56
		//*   6   12:aload_0         
		//*   7   13:getfield        #39  <Field int i>
		//*   8   16:aload_0         
		//*   9   17:getfield        #37  <Field int h>
		//*  10   20:icmple          56
				canvas.drawRect(h, getHeight() - c, i, getHeight(), b);
		//   11   23:aload_1         
		//   12   24:aload_0         
		//   13   25:getfield        #37  <Field int h>
		//   14   28:i2f             
		//   15   29:aload_0         
		//   16   30:invokevirtual   #109 <Method int getHeight()>
		//   17   33:aload_0         
		//   18   34:getfield        #111 <Field int c>
		//   19   37:isub            
		//   20   38:i2f             
		//   21   39:aload_0         
		//   22   40:getfield        #39  <Field int i>
		//   23   43:i2f             
		//   24   44:aload_0         
		//   25   45:invokevirtual   #109 <Method int getHeight()>
		//   26   48:i2f             
		//   27   49:aload_0         
		//   28   50:getfield        #50  <Field Paint b>
		//   29   53:invokevirtual   #117 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		//   30   56:return          
		}

		float e()
		{
			return (float)d + a;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field int d>
		//    2    4:i2f             
		//    3    5:aload_0         
		//    4    6:getfield        #69  <Field float a>
		//    5    9:fadd            
		//    6   10:freturn         
		}

		void e(int j)
		{
			if(c != j)
		//*   0    0:aload_0         
		//*   1    1:getfield        #111 <Field int c>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          17
			{
				c = j;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #111 <Field int c>
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
		//    7   13:aload_0         
		//    8   14:invokestatic    #89  <Method void ViewCompat.postInvalidateOnAnimation(View)>
			}
		//    9   17:return          
		}

		void e(int j, int k)
		{
			if(g != null && g.isRunning())
		//*   0    0:aload_0         
		//*   1    1:getfield        #92  <Field ValueAnimator g>
		//*   2    4:ifnull          24
		//*   3    7:aload_0         
		//*   4    8:getfield        #92  <Field ValueAnimator g>
		//*   5   11:invokevirtual   #97  <Method boolean ValueAnimator.isRunning()>
		//*   6   14:ifeq            24
				g.cancel();
		//    7   17:aload_0         
		//    8   18:getfield        #92  <Field ValueAnimator g>
		//    9   21:invokevirtual   #100 <Method void ValueAnimator.cancel()>
			int l;
			if(ViewCompat.getLayoutDirection(((View) (this))) == 1)
		//*  10   24:aload_0         
		//*  11   25:invokestatic    #122 <Method int ViewCompat.getLayoutDirection(View)>
		//*  12   28:iconst_1        
		//*  13   29:icmpne          37
				l = 1;
		//   14   32:iconst_1        
		//   15   33:istore_3        
			else
		//*  16   34:goto            39
				l = 0;
		//   17   37:iconst_0        
		//   18   38:istore_3        
			View view = getChildAt(j);
		//   19   39:aload_0         
		//   20   40:iload_1         
		//   21   41:invokevirtual   #55  <Method View getChildAt(int)>
		//   22   44:astore          7
			if(view == null)
		//*  23   46:aload           7
		//*  24   48:ifnonnull       56
			{
				c();
		//   25   51:aload_0         
		//   26   52:invokespecial   #102 <Method void c()>
				return;
		//   27   55:return          
			}
			int j1 = view.getLeft();
		//   28   56:aload           7
		//   29   58:invokevirtual   #64  <Method int View.getLeft()>
		//   30   61:istore          5
			int k1 = view.getRight();
		//   31   63:aload           7
		//   32   65:invokevirtual   #67  <Method int View.getRight()>
		//   33   68:istore          6
			int i1;
			if(Math.abs(j - d) <= 1)
		//*  34   70:iload_1         
		//*  35   71:aload_0         
		//*  36   72:getfield        #33  <Field int d>
		//*  37   75:isub            
		//*  38   76:invokestatic    #128 <Method int Math.abs(int)>
		//*  39   79:iconst_1        
		//*  40   80:icmpgt          97
			{
				l = h;
		//   41   83:aload_0         
		//   42   84:getfield        #37  <Field int h>
		//   43   87:istore_3        
				i1 = i;
		//   44   88:aload_0         
		//   45   89:getfield        #39  <Field int i>
		//   46   92:istore          4
			} else
		//*  47   94:goto            169
			{
				i1 = e.dpToPx(24);
		//   48   97:aload_0         
		//   49   98:getfield        #28  <Field TabLayout e>
		//   50  101:bipush          24
		//   51  103:invokevirtual   #131 <Method int TabLayout.dpToPx(int)>
		//   52  106:istore          4
				if(j < d)
		//*  53  108:iload_1         
		//*  54  109:aload_0         
		//*  55  110:getfield        #33  <Field int d>
		//*  56  113:icmpge          144
				{
					if(l != 0)
		//*  57  116:iload_3         
		//*  58  117:ifeq            132
					{
						l = j1 - i1;
		//   59  120:iload           5
		//   60  122:iload           4
		//   61  124:isub            
		//   62  125:istore_3        
						i1 = l;
		//   63  126:iload_3         
		//   64  127:istore          4
					} else
		//*  65  129:goto            169
					{
						l = k1 + i1;
		//   66  132:iload           6
		//   67  134:iload           4
		//   68  136:iadd            
		//   69  137:istore_3        
						i1 = l;
		//   70  138:iload_3         
		//   71  139:istore          4
					}
				} else
		//*  72  141:goto            169
				if(l != 0)
		//*  73  144:iload_3         
		//*  74  145:ifeq            160
				{
					l = k1 + i1;
		//   75  148:iload           6
		//   76  150:iload           4
		//   77  152:iadd            
		//   78  153:istore_3        
					i1 = l;
		//   79  154:iload_3         
		//   80  155:istore          4
				} else
		//*  81  157:goto            169
				{
					l = j1 - i1;
		//   82  160:iload           5
		//   83  162:iload           4
		//   84  164:isub            
		//   85  165:istore_3        
					i1 = l;
		//   86  166:iload_3         
		//   87  167:istore          4
				}
			}
			if(l != j1 || i1 != k1)
		//*  88  169:iload_3         
		//*  89  170:iload           5
		//*  90  172:icmpne          182
		//*  91  175:iload           4
		//*  92  177:iload           6
		//*  93  179:icmpeq          268
			{
				ValueAnimator valueanimator = new ValueAnimator();
		//   94  182:new             #94  <Class ValueAnimator>
		//   95  185:dup             
		//   96  186:invokespecial   #132 <Method void ValueAnimator()>
		//   97  189:astore          7
				g = valueanimator;
		//   98  191:aload_0         
		//   99  192:aload           7
		//  100  194:putfield        #92  <Field ValueAnimator g>
				valueanimator.setInterpolator(((android.animation.TimeInterpolator) (p.a)));
		//  101  197:aload           7
		//  102  199:getstatic       #137 <Field android.view.animation.Interpolator p.a>
		//  103  202:invokevirtual   #141 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
				valueanimator.setDuration(k);
		//  104  205:aload           7
		//  105  207:iload_2         
		//  106  208:i2l             
		//  107  209:invokevirtual   #145 <Method ValueAnimator ValueAnimator.setDuration(long)>
		//  108  212:pop             
				valueanimator.setFloatValues(new float[] {
					0.0F, 1.0F
				});
		//  109  213:aload           7
		//  110  215:iconst_2        
		//  111  216:newarray        float[]
		//  112  218:dup             
		//  113  219:iconst_0        
		//  114  220:fconst_0        
		//  115  221:fastore         
		//  116  222:dup             
		//  117  223:iconst_1        
		//  118  224:fconst_1        
		//  119  225:fastore         
		//  120  226:invokevirtual   #149 <Method void ValueAnimator.setFloatValues(float[])>
				valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(this, l, j1, i1, k1) {

					public void onAnimationUpdate(ValueAnimator valueanimator)
					{
						float f = valueanimator.getAnimatedFraction();
					//    0    0:aload_1         
					//    1    1:invokevirtual   #43  <Method float ValueAnimator.getAnimatedFraction()>
					//    2    4:fstore_2        
						e.c(p.d(c, d, f), p.d(b, a, f));
					//    3    5:aload_0         
					//    4    6:getfield        #23  <Field TabLayout$b e>
					//    5    9:aload_0         
					//    6   10:getfield        #25  <Field int c>
					//    7   13:aload_0         
					//    8   14:getfield        #27  <Field int d>
					//    9   17:fload_2         
					//   10   18:invokestatic    #48  <Method int p.d(int, int, float)>
					//   11   21:aload_0         
					//   12   22:getfield        #29  <Field int b>
					//   13   25:aload_0         
					//   14   26:getfield        #31  <Field int a>
					//   15   29:fload_2         
					//   16   30:invokestatic    #48  <Method int p.d(int, int, float)>
					//   17   33:invokevirtual   #50  <Method void TabLayout$b.c(int, int)>
					//   18   36:return          
					}

					final int a;
					final int b;
					final int c;
					final int d;
					final b e;

			
			{
				e = b1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field TabLayout$b e>
				c = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #25  <Field int c>
				d = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #27  <Field int d>
				b = k;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #29  <Field int b>
				a = l;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #31  <Field int a>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #34  <Method void Object()>
			//   17   31:return          
			}
				}
);
		//  121  229:aload           7
		//  122  231:new             #9   <Class TabLayout$b$2>
		//  123  234:dup             
		//  124  235:aload_0         
		//  125  236:iload_3         
		//  126  237:iload           5
		//  127  239:iload           4
		//  128  241:iload           6
		//  129  243:invokespecial   #152 <Method void TabLayout$b$2(TabLayout$b, int, int, int, int)>
		//  130  246:invokevirtual   #156 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
				valueanimator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter(this, j) {

					public void onAnimationEnd(Animator animator)
					{
						b.d = e;
					//    0    0:aload_0         
					//    1    1:getfield        #18  <Field TabLayout$b b>
					//    2    4:aload_0         
					//    3    5:getfield        #20  <Field int e>
					//    4    8:putfield        #29  <Field int TabLayout$b.d>
						b.a = 0.0F;
					//    5   11:aload_0         
					//    6   12:getfield        #18  <Field TabLayout$b b>
					//    7   15:fconst_0        
					//    8   16:putfield        #33  <Field float TabLayout$b.a>
					//    9   19:return          
					}

					final b b;
					final int e;

			
			{
				b = b1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field TabLayout$b b>
				e = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #20  <Field int e>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void AnimatorListenerAdapter()>
			//    8   14:return          
			}
				}
)));
		//  131  249:aload           7
		//  132  251:new             #11  <Class TabLayout$b$3>
		//  133  254:dup             
		//  134  255:aload_0         
		//  135  256:iload_1         
		//  136  257:invokespecial   #159 <Method void TabLayout$b$3(TabLayout$b, int)>
		//  137  260:invokevirtual   #163 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
				valueanimator.start();
		//  138  263:aload           7
		//  139  265:invokevirtual   #166 <Method void ValueAnimator.start()>
			}
		//  140  268:return          
		}

		protected void onLayout(boolean flag, int j, int k, int l, int i1)
		{
			super.onLayout(flag, j, k, l, i1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:iload           4
		//    5    6:iload           5
		//    6    8:invokespecial   #170 <Method void LinearLayout.onLayout(boolean, int, int, int, int)>
			if(g != null && g.isRunning())
		//*   7   11:aload_0         
		//*   8   12:getfield        #92  <Field ValueAnimator g>
		//*   9   15:ifnull          69
		//*  10   18:aload_0         
		//*  11   19:getfield        #92  <Field ValueAnimator g>
		//*  12   22:invokevirtual   #97  <Method boolean ValueAnimator.isRunning()>
		//*  13   25:ifeq            69
			{
				g.cancel();
		//   14   28:aload_0         
		//   15   29:getfield        #92  <Field ValueAnimator g>
		//   16   32:invokevirtual   #100 <Method void ValueAnimator.cancel()>
				long l1 = g.getDuration();
		//   17   35:aload_0         
		//   18   36:getfield        #92  <Field ValueAnimator g>
		//   19   39:invokevirtual   #174 <Method long ValueAnimator.getDuration()>
		//   20   42:lstore          6
				e(d, Math.round((1.0F - g.getAnimatedFraction()) * (float)l1));
		//   21   44:aload_0         
		//   22   45:aload_0         
		//   23   46:getfield        #33  <Field int d>
		//   24   49:fconst_1        
		//   25   50:aload_0         
		//   26   51:getfield        #92  <Field ValueAnimator g>
		//   27   54:invokevirtual   #177 <Method float ValueAnimator.getAnimatedFraction()>
		//   28   57:fsub            
		//   29   58:lload           6
		//   30   60:l2f             
		//   31   61:fmul            
		//   32   62:invokestatic    #181 <Method int Math.round(float)>
		//   33   65:invokevirtual   #183 <Method void e(int, int)>
				return;
		//   34   68:return          
			} else
			{
				c();
		//   35   69:aload_0         
		//   36   70:invokespecial   #102 <Method void c()>
				return;
		//   37   73:return          
			}
		}

		protected void onMeasure(int j, int k)
		{
			super.onMeasure(j, k);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #186 <Method void LinearLayout.onMeasure(int, int)>
			if(android.view.View.MeasureSpec.getMode(j) != 0x40000000)
		//*   4    6:iload_1         
		//*   5    7:invokestatic    #191 <Method int android.view.View$MeasureSpec.getMode(int)>
		//*   6   10:ldc1            #192 <Int 0x40000000>
		//*   7   12:icmpeq          16
				return;
		//    8   15:return          
			if(e.mMode == 1 && e.mTabGravity == 1)
		//*   9   16:aload_0         
		//*  10   17:getfield        #28  <Field TabLayout e>
		//*  11   20:getfield        #195 <Field int TabLayout.mMode>
		//*  12   23:iconst_1        
		//*  13   24:icmpne          232
		//*  14   27:aload_0         
		//*  15   28:getfield        #28  <Field TabLayout e>
		//*  16   31:getfield        #198 <Field int TabLayout.mTabGravity>
		//*  17   34:iconst_1        
		//*  18   35:icmpne          232
			{
				int i2 = getChildCount();
		//   19   38:aload_0         
		//   20   39:invokevirtual   #72  <Method int getChildCount()>
		//   21   42:istore          6
				int i1 = 0;
		//   22   44:iconst_0        
		//   23   45:istore          4
				for(int l = 0; l < i2;)
		//*  24   47:iconst_0        
		//*  25   48:istore_3        
		//*  26   49:iload_3         
		//*  27   50:iload           6
		//*  28   52:icmpge          97
				{
					View view = getChildAt(l);
		//   29   55:aload_0         
		//   30   56:iload_3         
		//   31   57:invokevirtual   #55  <Method View getChildAt(int)>
		//   32   60:astore          7
					int j1 = i1;
		//   33   62:iload           4
		//   34   64:istore          5
					if(view.getVisibility() == 0)
		//*  35   66:aload           7
		//*  36   68:invokevirtual   #201 <Method int View.getVisibility()>
		//*  37   71:ifne            86
						j1 = Math.max(i1, view.getMeasuredWidth());
		//   38   74:iload           4
		//   39   76:aload           7
		//   40   78:invokevirtual   #204 <Method int View.getMeasuredWidth()>
		//   41   81:invokestatic    #208 <Method int Math.max(int, int)>
		//   42   84:istore          5
					l++;
		//   43   86:iload_3         
		//   44   87:iconst_1        
		//   45   88:iadd            
		//   46   89:istore_3        
					i1 = j1;
		//   47   90:iload           5
		//   48   92:istore          4
				}

		//*  49   94:goto            49
				if(i1 <= 0)
		//*  50   97:iload           4
		//*  51   99:ifgt            103
					return;
		//   52  102:return          
				int k1 = e.dpToPx(16);
		//   53  103:aload_0         
		//   54  104:getfield        #28  <Field TabLayout e>
		//   55  107:bipush          16
		//   56  109:invokevirtual   #131 <Method int TabLayout.dpToPx(int)>
		//   57  112:istore          5
				boolean flag = false;
		//   58  114:iconst_0        
		//   59  115:istore_3        
				if(i1 * i2 <= getMeasuredWidth() - k1 * 2)
		//*  60  116:iload           4
		//*  61  118:iload           6
		//*  62  120:imul            
		//*  63  121:aload_0         
		//*  64  122:invokevirtual   #209 <Method int getMeasuredWidth()>
		//*  65  125:iload           5
		//*  66  127:iconst_2        
		//*  67  128:imul            
		//*  68  129:isub            
		//*  69  130:icmpgt          204
				{
					for(int l1 = 0; l1 < i2; l1++)
		//*  70  133:iconst_0        
		//*  71  134:istore          5
		//*  72  136:iload           5
		//*  73  138:iload           6
		//*  74  140:icmpge          201
					{
						android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)getChildAt(l1).getLayoutParams();
		//   75  143:aload_0         
		//   76  144:iload           5
		//   77  146:invokevirtual   #55  <Method View getChildAt(int)>
		//   78  149:invokevirtual   #213 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   79  152:checkcast       #215 <Class android.widget.LinearLayout$LayoutParams>
		//   80  155:astore          7
						if(layoutparams.width != i1 || layoutparams.weight != 0.0F)
		//*  81  157:aload           7
		//*  82  159:getfield        #218 <Field int android.widget.LinearLayout$LayoutParams.width>
		//*  83  162:iload           4
		//*  84  164:icmpne          177
		//*  85  167:aload           7
		//*  86  169:getfield        #221 <Field float android.widget.LinearLayout$LayoutParams.weight>
		//*  87  172:fconst_0        
		//*  88  173:fcmpl           
		//*  89  174:ifeq            192
						{
							layoutparams.width = i1;
		//   90  177:aload           7
		//   91  179:iload           4
		//   92  181:putfield        #218 <Field int android.widget.LinearLayout$LayoutParams.width>
							layoutparams.weight = 0.0F;
		//   93  184:aload           7
		//   94  186:fconst_0        
		//   95  187:putfield        #221 <Field float android.widget.LinearLayout$LayoutParams.weight>
							flag = true;
		//   96  190:iconst_1        
		//   97  191:istore_3        
						}
					}

		//   98  192:iload           5
		//   99  194:iconst_1        
		//  100  195:iadd            
		//  101  196:istore          5
				} else
		//* 102  198:goto            136
		//* 103  201:goto            222
				{
					e.mTabGravity = 0;
		//  104  204:aload_0         
		//  105  205:getfield        #28  <Field TabLayout e>
		//  106  208:iconst_0        
		//  107  209:putfield        #198 <Field int TabLayout.mTabGravity>
					e.updateTabViews(false);
		//  108  212:aload_0         
		//  109  213:getfield        #28  <Field TabLayout e>
		//  110  216:iconst_0        
		//  111  217:invokevirtual   #224 <Method void TabLayout.updateTabViews(boolean)>
					flag = true;
		//  112  220:iconst_1        
		//  113  221:istore_3        
				}
				if(flag)
		//* 114  222:iload_3         
		//* 115  223:ifeq            232
					super.onMeasure(j, k);
		//  116  226:aload_0         
		//  117  227:iload_1         
		//  118  228:iload_2         
		//  119  229:invokespecial   #186 <Method void LinearLayout.onMeasure(int, int)>
			}
		//  120  232:return          
		}

		public void onRtlPropertiesChanged(int j)
		{
			super.onRtlPropertiesChanged(j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #227 <Method void LinearLayout.onRtlPropertiesChanged(int)>
			if(android.os.Build.VERSION.SDK_INT < 23 && f != j)
		//*   3    5:getstatic       #232 <Field int android.os.Build$VERSION.SDK_INT>
		//*   4    8:bipush          23
		//*   5   10:icmpge          30
		//*   6   13:aload_0         
		//*   7   14:getfield        #35  <Field int f>
		//*   8   17:iload_1         
		//*   9   18:icmpeq          30
			{
				requestLayout();
		//   10   21:aload_0         
		//   11   22:invokevirtual   #235 <Method void requestLayout()>
				f = j;
		//   12   25:aload_0         
		//   13   26:iload_1         
		//   14   27:putfield        #35  <Field int f>
			}
		//   15   30:return          
		}

		float a;
		private final Paint b = new Paint();
		private int c;
		int d;
		final TabLayout e;
		private int f;
		private ValueAnimator g;
		private int h;
		private int i;

		b(Context context)
		{
			e = TabLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #28  <Field TabLayout e>
			super(context);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #31  <Method void LinearLayout(Context)>
			d = -1;
		//    6   10:aload_0         
		//    7   11:iconst_m1       
		//    8   12:putfield        #33  <Field int d>
			f = -1;
		//    9   15:aload_0         
		//   10   16:iconst_m1       
		//   11   17:putfield        #35  <Field int f>
			h = -1;
		//   12   20:aload_0         
		//   13   21:iconst_m1       
		//   14   22:putfield        #37  <Field int h>
			i = -1;
		//   15   25:aload_0         
		//   16   26:iconst_m1       
		//   17   27:putfield        #39  <Field int i>
			setWillNotDraw(false);
		//   18   30:aload_0         
		//   19   31:iconst_0        
		//   20   32:invokevirtual   #43  <Method void setWillNotDraw(boolean)>
		//   21   35:aload_0         
		//   22   36:new             #45  <Class Paint>
		//   23   39:dup             
		//   24   40:invokespecial   #48  <Method void Paint()>
		//   25   43:putfield        #50  <Field Paint b>
		//   26   46:return          
		}
	}

	class d
		implements android.support.v4.view.ViewPager.OnAdapterChangeListener
	{

		void e(boolean flag)
		{
			e = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #24  <Field boolean e>
		//    3    5:return          
		}

		public void onAdapterChanged(ViewPager viewpager, PagerAdapter pageradapter, PagerAdapter pageradapter1)
		{
			if(a.mViewPager == viewpager)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field TabLayout a>
		//*   2    4:getfield        #32  <Field ViewPager TabLayout.mViewPager>
		//*   3    7:aload_1         
		//*   4    8:if_acmpne       23
				a.setPagerAdapter(pageradapter1, e);
		//    5   11:aload_0         
		//    6   12:getfield        #17  <Field TabLayout a>
		//    7   15:aload_3         
		//    8   16:aload_0         
		//    9   17:getfield        #24  <Field boolean e>
		//   10   20:invokevirtual   #36  <Method void TabLayout.setPagerAdapter(PagerAdapter, boolean)>
		//   11   23:return          
		}

		final TabLayout a;
		private boolean e;

		d()
		{
			a = TabLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field TabLayout a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}
	}

	class e extends DataSetObserver
	{

		public void onChanged()
		{
			e.populateFromPagerAdapter();
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field TabLayout e>
		//    2    4:invokevirtual   #20  <Method void TabLayout.populateFromPagerAdapter()>
		//    3    7:return          
		}

		public void onInvalidated()
		{
			e.populateFromPagerAdapter();
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field TabLayout e>
		//    2    4:invokevirtual   #20  <Method void TabLayout.populateFromPagerAdapter()>
		//    3    7:return          
		}

		final TabLayout e;

		e()
		{
			e = TabLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field TabLayout e>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void DataSetObserver()>
		//    5    9:return          
		}
	}


	public TabLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #128 <Method void TabLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public TabLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #131 <Method void TabLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public TabLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #132 <Method void HorizontalScrollView(Context, AttributeSet, int)>
		mTabs = new ArrayList();
	//    5    7:aload_0         
	//    6    8:new             #134 <Class ArrayList>
	//    7   11:dup             
	//    8   12:invokespecial   #136 <Method void ArrayList()>
	//    9   15:putfield        #138 <Field ArrayList mTabs>
		mTabMaxWidth = 0x7fffffff;
	//   10   18:aload_0         
	//   11   19:ldc1            #139 <Int 0x7fffffff>
	//   12   21:putfield        #141 <Field int mTabMaxWidth>
		mSelectedListeners = new ArrayList();
	//   13   24:aload_0         
	//   14   25:new             #134 <Class ArrayList>
	//   15   28:dup             
	//   16   29:invokespecial   #136 <Method void ArrayList()>
	//   17   32:putfield        #143 <Field ArrayList mSelectedListeners>
		mTabViewPool = ((android.support.v4.util.Pools.Pool) (new android.support.v4.util.Pools.SimplePool(12)));
	//   18   35:aload_0         
	//   19   36:new             #145 <Class android.support.v4.util.Pools$SimplePool>
	//   20   39:dup             
	//   21   40:bipush          12
	//   22   42:invokespecial   #146 <Method void android.support.v4.util.Pools$SimplePool(int)>
	//   23   45:putfield        #148 <Field android.support.v4.util.Pools$Pool mTabViewPool>
		aa.b(context);
	//   24   48:aload_1         
	//   25   49:invokestatic    #152 <Method void aa.b(Context)>
		setHorizontalScrollBarEnabled(false);
	//   26   52:aload_0         
	//   27   53:iconst_0        
	//   28   54:invokevirtual   #156 <Method void setHorizontalScrollBarEnabled(boolean)>
		mTabStrip = new b(context);
	//   29   57:aload_0         
	//   30   58:new             #29  <Class TabLayout$b>
	//   31   61:dup             
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:invokespecial   #159 <Method void TabLayout$b(TabLayout, Context)>
	//   35   67:putfield        #161 <Field TabLayout$b mTabStrip>
		super.addView(((View) (mTabStrip)), 0, ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-2, -1))));
	//   36   70:aload_0         
	//   37   71:aload_0         
	//   38   72:getfield        #161 <Field TabLayout$b mTabStrip>
	//   39   75:iconst_0        
	//   40   76:new             #163 <Class android.widget.FrameLayout$LayoutParams>
	//   41   79:dup             
	//   42   80:bipush          -2
	//   43   82:iconst_m1       
	//   44   83:invokespecial   #166 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   45   86:invokespecial   #170 <Method void HorizontalScrollView.addView(View, int, android.view.ViewGroup$LayoutParams)>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.TabLayout, i, android.support.design.R.style.Widget_Design_TabLayout)));
	//   46   89:aload_1         
	//   47   90:aload_2         
	//   48   91:getstatic       #176 <Field int[] android.support.design.R$styleable.TabLayout>
	//   49   94:iload_3         
	//   50   95:getstatic       #181 <Field int android.support.design.R$style.Widget_Design_TabLayout>
	//   51   98:invokevirtual   #187 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   52  101:astore_2        
		mTabStrip.e(((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabIndicatorHeight, 0));
	//   53  102:aload_0         
	//   54  103:getfield        #161 <Field TabLayout$b mTabStrip>
	//   55  106:aload_2         
	//   56  107:getstatic       #190 <Field int android.support.design.R$styleable.TabLayout_tabIndicatorHeight>
	//   57  110:iconst_0        
	//   58  111:invokevirtual   #196 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   59  114:invokevirtual   #198 <Method void TabLayout$b.e(int)>
		mTabStrip.b(((TypedArray) (attributeset)).getColor(android.support.design.R.styleable.TabLayout_tabIndicatorColor, 0));
	//   60  117:aload_0         
	//   61  118:getfield        #161 <Field TabLayout$b mTabStrip>
	//   62  121:aload_2         
	//   63  122:getstatic       #201 <Field int android.support.design.R$styleable.TabLayout_tabIndicatorColor>
	//   64  125:iconst_0        
	//   65  126:invokevirtual   #204 <Method int TypedArray.getColor(int, int)>
	//   66  129:invokevirtual   #206 <Method void TabLayout$b.b(int)>
		i = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPadding, 0);
	//   67  132:aload_2         
	//   68  133:getstatic       #209 <Field int android.support.design.R$styleable.TabLayout_tabPadding>
	//   69  136:iconst_0        
	//   70  137:invokevirtual   #196 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   71  140:istore_3        
		mTabPaddingBottom = i;
	//   72  141:aload_0         
	//   73  142:iload_3         
	//   74  143:putfield        #211 <Field int mTabPaddingBottom>
		mTabPaddingEnd = i;
	//   75  146:aload_0         
	//   76  147:iload_3         
	//   77  148:putfield        #213 <Field int mTabPaddingEnd>
		mTabPaddingTop = i;
	//   78  151:aload_0         
	//   79  152:iload_3         
	//   80  153:putfield        #215 <Field int mTabPaddingTop>
		mTabPaddingStart = i;
	//   81  156:aload_0         
	//   82  157:iload_3         
	//   83  158:putfield        #217 <Field int mTabPaddingStart>
		mTabPaddingStart = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingStart, mTabPaddingStart);
	//   84  161:aload_0         
	//   85  162:aload_2         
	//   86  163:getstatic       #220 <Field int android.support.design.R$styleable.TabLayout_tabPaddingStart>
	//   87  166:aload_0         
	//   88  167:getfield        #217 <Field int mTabPaddingStart>
	//   89  170:invokevirtual   #196 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   90  173:putfield        #217 <Field int mTabPaddingStart>
		mTabPaddingTop = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingTop, mTabPaddingTop);
	//   91  176:aload_0         
	//   92  177:aload_2         
	//   93  178:getstatic       #223 <Field int android.support.design.R$styleable.TabLayout_tabPaddingTop>
	//   94  181:aload_0         
	//   95  182:getfield        #215 <Field int mTabPaddingTop>
	//   96  185:invokevirtual   #196 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   97  188:putfield        #215 <Field int mTabPaddingTop>
		mTabPaddingEnd = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingEnd, mTabPaddingEnd);
	//   98  191:aload_0         
	//   99  192:aload_2         
	//  100  193:getstatic       #226 <Field int android.support.design.R$styleable.TabLayout_tabPaddingEnd>
	//  101  196:aload_0         
	//  102  197:getfield        #213 <Field int mTabPaddingEnd>
	//  103  200:invokevirtual   #196 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  104  203:putfield        #213 <Field int mTabPaddingEnd>
		mTabPaddingBottom = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingBottom, mTabPaddingBottom);
	//  105  206:aload_0         
	//  106  207:aload_2         
	//  107  208:getstatic       #229 <Field int android.support.design.R$styleable.TabLayout_tabPaddingBottom>
	//  108  211:aload_0         
	//  109  212:getfield        #211 <Field int mTabPaddingBottom>
	//  110  215:invokevirtual   #196 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  111  218:putfield        #211 <Field int mTabPaddingBottom>
		mTabTextAppearance = ((TypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.TabLayout_tabTextAppearance, android.support.design.R.style.TextAppearance_Design_Tab);
	//  112  221:aload_0         
	//  113  222:aload_2         
	//  114  223:getstatic       #232 <Field int android.support.design.R$styleable.TabLayout_tabTextAppearance>
	//  115  226:getstatic       #235 <Field int android.support.design.R$style.TextAppearance_Design_Tab>
	//  116  229:invokevirtual   #238 <Method int TypedArray.getResourceId(int, int)>
	//  117  232:putfield        #240 <Field int mTabTextAppearance>
		context = ((Context) (context.obtainStyledAttributes(mTabTextAppearance, android.support.v7.appcompat.R.styleable.TextAppearance)));
	//  118  235:aload_1         
	//  119  236:aload_0         
	//  120  237:getfield        #240 <Field int mTabTextAppearance>
	//  121  240:getstatic       #245 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//  122  243:invokevirtual   #248 <Method TypedArray Context.obtainStyledAttributes(int, int[])>
	//  123  246:astore_1        
		mTabTextSize = ((TypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, 0);
	//  124  247:aload_0         
	//  125  248:aload_1         
	//  126  249:getstatic       #251 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//  127  252:iconst_0        
	//  128  253:invokevirtual   #196 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  129  256:i2f             
	//  130  257:putfield        #253 <Field float mTabTextSize>
		mTabTextColors = ((TypedArray) (context)).getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//  131  260:aload_0         
	//  132  261:aload_1         
	//  133  262:getstatic       #256 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//  134  265:invokevirtual   #260 <Method ColorStateList TypedArray.getColorStateList(int)>
	//  135  268:putfield        #262 <Field ColorStateList mTabTextColors>
		((TypedArray) (context)).recycle();
	//  136  271:aload_1         
	//  137  272:invokevirtual   #265 <Method void TypedArray.recycle()>
		break MISSING_BLOCK_LABEL_285;
	//  138  275:goto            285
		attributeset;
	//  139  278:astore_2        
		((TypedArray) (context)).recycle();
	//  140  279:aload_1         
	//  141  280:invokevirtual   #265 <Method void TypedArray.recycle()>
		throw attributeset;
	//  142  283:aload_2         
	//  143  284:athrow          
		if(((TypedArray) (attributeset)).hasValue(android.support.design.R.styleable.TabLayout_tabTextColor))
	//* 144  285:aload_2         
	//* 145  286:getstatic       #268 <Field int android.support.design.R$styleable.TabLayout_tabTextColor>
	//* 146  289:invokevirtual   #272 <Method boolean TypedArray.hasValue(int)>
	//* 147  292:ifeq            306
			mTabTextColors = ((TypedArray) (attributeset)).getColorStateList(android.support.design.R.styleable.TabLayout_tabTextColor);
	//  148  295:aload_0         
	//  149  296:aload_2         
	//  150  297:getstatic       #268 <Field int android.support.design.R$styleable.TabLayout_tabTextColor>
	//  151  300:invokevirtual   #260 <Method ColorStateList TypedArray.getColorStateList(int)>
	//  152  303:putfield        #262 <Field ColorStateList mTabTextColors>
		if(((TypedArray) (attributeset)).hasValue(android.support.design.R.styleable.TabLayout_tabSelectedTextColor))
	//* 153  306:aload_2         
	//* 154  307:getstatic       #275 <Field int android.support.design.R$styleable.TabLayout_tabSelectedTextColor>
	//* 155  310:invokevirtual   #272 <Method boolean TypedArray.hasValue(int)>
	//* 156  313:ifeq            340
		{
			i = ((TypedArray) (attributeset)).getColor(android.support.design.R.styleable.TabLayout_tabSelectedTextColor, 0);
	//  157  316:aload_2         
	//  158  317:getstatic       #275 <Field int android.support.design.R$styleable.TabLayout_tabSelectedTextColor>
	//  159  320:iconst_0        
	//  160  321:invokevirtual   #204 <Method int TypedArray.getColor(int, int)>
	//  161  324:istore_3        
			mTabTextColors = createColorStateList(mTabTextColors.getDefaultColor(), i);
	//  162  325:aload_0         
	//  163  326:aload_0         
	//  164  327:getfield        #262 <Field ColorStateList mTabTextColors>
	//  165  330:invokevirtual   #281 <Method int ColorStateList.getDefaultColor()>
	//  166  333:iload_3         
	//  167  334:invokestatic    #285 <Method ColorStateList createColorStateList(int, int)>
	//  168  337:putfield        #262 <Field ColorStateList mTabTextColors>
		}
		mRequestedTabMinWidth = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabMinWidth, -1);
	//  169  340:aload_0         
	//  170  341:aload_2         
	//  171  342:getstatic       #288 <Field int android.support.design.R$styleable.TabLayout_tabMinWidth>
	//  172  345:iconst_m1       
	//  173  346:invokevirtual   #196 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  174  349:putfield        #290 <Field int mRequestedTabMinWidth>
		mRequestedTabMaxWidth = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabMaxWidth, -1);
	//  175  352:aload_0         
	//  176  353:aload_2         
	//  177  354:getstatic       #293 <Field int android.support.design.R$styleable.TabLayout_tabMaxWidth>
	//  178  357:iconst_m1       
	//  179  358:invokevirtual   #196 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  180  361:putfield        #295 <Field int mRequestedTabMaxWidth>
		mTabBackgroundResId = ((TypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.TabLayout_tabBackground, 0);
	//  181  364:aload_0         
	//  182  365:aload_2         
	//  183  366:getstatic       #298 <Field int android.support.design.R$styleable.TabLayout_tabBackground>
	//  184  369:iconst_0        
	//  185  370:invokevirtual   #238 <Method int TypedArray.getResourceId(int, int)>
	//  186  373:putfield        #300 <Field int mTabBackgroundResId>
		mContentInsetStart = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabContentStart, 0);
	//  187  376:aload_0         
	//  188  377:aload_2         
	//  189  378:getstatic       #303 <Field int android.support.design.R$styleable.TabLayout_tabContentStart>
	//  190  381:iconst_0        
	//  191  382:invokevirtual   #196 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  192  385:putfield        #305 <Field int mContentInsetStart>
		mMode = ((TypedArray) (attributeset)).getInt(android.support.design.R.styleable.TabLayout_tabMode, 1);
	//  193  388:aload_0         
	//  194  389:aload_2         
	//  195  390:getstatic       #308 <Field int android.support.design.R$styleable.TabLayout_tabMode>
	//  196  393:iconst_1        
	//  197  394:invokevirtual   #311 <Method int TypedArray.getInt(int, int)>
	//  198  397:putfield        #313 <Field int mMode>
		mTabGravity = ((TypedArray) (attributeset)).getInt(android.support.design.R.styleable.TabLayout_tabGravity, 0);
	//  199  400:aload_0         
	//  200  401:aload_2         
	//  201  402:getstatic       #316 <Field int android.support.design.R$styleable.TabLayout_tabGravity>
	//  202  405:iconst_0        
	//  203  406:invokevirtual   #311 <Method int TypedArray.getInt(int, int)>
	//  204  409:putfield        #318 <Field int mTabGravity>
		((TypedArray) (attributeset)).recycle();
	//  205  412:aload_2         
	//  206  413:invokevirtual   #265 <Method void TypedArray.recycle()>
		context = ((Context) (getResources()));
	//  207  416:aload_0         
	//  208  417:invokevirtual   #322 <Method Resources getResources()>
	//  209  420:astore_1        
		mTabTextMultiLineSize = ((Resources) (context)).getDimensionPixelSize(android.support.design.R.dimen.design_tab_text_size_2line);
	//  210  421:aload_0         
	//  211  422:aload_1         
	//  212  423:getstatic       #327 <Field int android.support.design.R$dimen.design_tab_text_size_2line>
	//  213  426:invokevirtual   #332 <Method int Resources.getDimensionPixelSize(int)>
	//  214  429:i2f             
	//  215  430:putfield        #334 <Field float mTabTextMultiLineSize>
		mScrollableTabMinWidth = ((Resources) (context)).getDimensionPixelSize(android.support.design.R.dimen.design_tab_scrollable_min_width);
	//  216  433:aload_0         
	//  217  434:aload_1         
	//  218  435:getstatic       #337 <Field int android.support.design.R$dimen.design_tab_scrollable_min_width>
	//  219  438:invokevirtual   #332 <Method int Resources.getDimensionPixelSize(int)>
	//  220  441:putfield        #339 <Field int mScrollableTabMinWidth>
		applyModeAndGravity();
	//  221  444:aload_0         
	//  222  445:invokespecial   #342 <Method void applyModeAndGravity()>
		return;
	//  223  448:return          
	}

	private void addTabFromItemView(TabItem tabitem)
	{
		Tab tab = newTab();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #349 <Method TabLayout$Tab newTab()>
	//    2    4:astore_2        
		if(tabitem.mText != null)
	//*   3    5:aload_1         
	//*   4    6:getfield        #355 <Field CharSequence TabItem.mText>
	//*   5    9:ifnull          21
			tab.setText(tabitem.mText);
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:getfield        #355 <Field CharSequence TabItem.mText>
	//    9   17:invokevirtual   #359 <Method TabLayout$Tab TabLayout$Tab.setText(CharSequence)>
	//   10   20:pop             
		if(tabitem.mIcon != null)
	//*  11   21:aload_1         
	//*  12   22:getfield        #363 <Field Drawable TabItem.mIcon>
	//*  13   25:ifnull          37
			tab.setIcon(tabitem.mIcon);
	//   14   28:aload_2         
	//   15   29:aload_1         
	//   16   30:getfield        #363 <Field Drawable TabItem.mIcon>
	//   17   33:invokevirtual   #367 <Method TabLayout$Tab TabLayout$Tab.setIcon(Drawable)>
	//   18   36:pop             
		if(tabitem.mCustomLayout != 0)
	//*  19   37:aload_1         
	//*  20   38:getfield        #370 <Field int TabItem.mCustomLayout>
	//*  21   41:ifeq            53
			tab.setCustomView(tabitem.mCustomLayout);
	//   22   44:aload_2         
	//   23   45:aload_1         
	//   24   46:getfield        #370 <Field int TabItem.mCustomLayout>
	//   25   49:invokevirtual   #374 <Method TabLayout$Tab TabLayout$Tab.setCustomView(int)>
	//   26   52:pop             
		if(!TextUtils.isEmpty(tabitem.getContentDescription()))
	//*  27   53:aload_1         
	//*  28   54:invokevirtual   #378 <Method CharSequence TabItem.getContentDescription()>
	//*  29   57:invokestatic    #384 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  30   60:ifne            72
			tab.setContentDescription(tabitem.getContentDescription());
	//   31   63:aload_2         
	//   32   64:aload_1         
	//   33   65:invokevirtual   #378 <Method CharSequence TabItem.getContentDescription()>
	//   34   68:invokevirtual   #387 <Method TabLayout$Tab TabLayout$Tab.setContentDescription(CharSequence)>
	//   35   71:pop             
		addTab(tab);
	//   36   72:aload_0         
	//   37   73:aload_2         
	//   38   74:invokevirtual   #391 <Method void addTab(TabLayout$Tab)>
	//   39   77:return          
	}

	private void addTabView(Tab tab)
	{
		a a1 = tab.mView;
	//    0    0:aload_1         
	//    1    1:getfield        #397 <Field TabLayout$a TabLayout$Tab.mView>
	//    2    4:astore_2        
		mTabStrip.addView(((View) (a1)), tab.getPosition(), ((android.view.ViewGroup.LayoutParams) (createLayoutParamsForTabs())));
	//    3    5:aload_0         
	//    4    6:getfield        #161 <Field TabLayout$b mTabStrip>
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #400 <Method int TabLayout$Tab.getPosition()>
	//    8   14:aload_0         
	//    9   15:invokespecial   #404 <Method android.widget.LinearLayout$LayoutParams createLayoutParamsForTabs()>
	//   10   18:invokevirtual   #405 <Method void TabLayout$b.addView(View, int, android.view.ViewGroup$LayoutParams)>
	//   11   21:return          
	}

	private void addViewInternal(View view)
	{
		if(view instanceof TabItem)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #351 <Class TabItem>
	//*   2    4:ifeq            16
		{
			addTabFromItemView((TabItem)view);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #351 <Class TabItem>
	//    6   12:invokespecial   #409 <Method void addTabFromItemView(TabItem)>
			return;
	//    7   15:return          
		} else
		{
			throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
	//    8   16:new             #411 <Class IllegalArgumentException>
	//    9   19:dup             
	//   10   20:ldc2            #413 <String "Only TabItem instances can be added to TabLayout">
	//   11   23:invokespecial   #416 <Method void IllegalArgumentException(String)>
	//   12   26:athrow          
		}
	}

	private void animateToTab(int i)
	{
		if(i == -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          6
			return;
	//    3    5:return          
		if(getWindowToken() == null || !ViewCompat.isLaidOut(((View) (this))) || mTabStrip.a())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #421 <Method android.os.IBinder getWindowToken()>
	//*   6   10:ifnull          30
	//*   7   13:aload_0         
	//*   8   14:invokestatic    #427 <Method boolean ViewCompat.isLaidOut(View)>
	//*   9   17:ifeq            30
	//*  10   20:aload_0         
	//*  11   21:getfield        #161 <Field TabLayout$b mTabStrip>
	//*  12   24:invokevirtual   #430 <Method boolean TabLayout$b.a()>
	//*  13   27:ifeq            38
		{
			setScrollPosition(i, 0.0F, true);
	//   14   30:aload_0         
	//   15   31:iload_1         
	//   16   32:fconst_0        
	//   17   33:iconst_1        
	//   18   34:invokevirtual   #434 <Method void setScrollPosition(int, float, boolean)>
			return;
	//   19   37:return          
		}
		int j = getScrollX();
	//   20   38:aload_0         
	//   21   39:invokevirtual   #437 <Method int getScrollX()>
	//   22   42:istore_2        
		int k = calculateScrollXForTab(i, 0.0F);
	//   23   43:aload_0         
	//   24   44:iload_1         
	//   25   45:fconst_0        
	//   26   46:invokespecial   #441 <Method int calculateScrollXForTab(int, float)>
	//   27   49:istore_3        
		if(j != k)
	//*  28   50:iload_2         
	//*  29   51:iload_3         
	//*  30   52:icmpeq          84
		{
			ensureScrollAnimator();
	//   31   55:aload_0         
	//   32   56:invokespecial   #444 <Method void ensureScrollAnimator()>
			mScrollAnimator.setIntValues(new int[] {
				j, k
			});
	//   33   59:aload_0         
	//   34   60:getfield        #446 <Field ValueAnimator mScrollAnimator>
	//   35   63:iconst_2        
	//   36   64:newarray        int[]
	//   37   66:dup             
	//   38   67:iconst_0        
	//   39   68:iload_2         
	//   40   69:iastore         
	//   41   70:dup             
	//   42   71:iconst_1        
	//   43   72:iload_3         
	//   44   73:iastore         
	//   45   74:invokevirtual   #452 <Method void ValueAnimator.setIntValues(int[])>
			mScrollAnimator.start();
	//   46   77:aload_0         
	//   47   78:getfield        #446 <Field ValueAnimator mScrollAnimator>
	//   48   81:invokevirtual   #455 <Method void ValueAnimator.start()>
		}
		mTabStrip.e(i, 300);
	//   49   84:aload_0         
	//   50   85:getfield        #161 <Field TabLayout$b mTabStrip>
	//   51   88:iload_1         
	//   52   89:sipush          300
	//   53   92:invokevirtual   #457 <Method void TabLayout$b.e(int, int)>
	//   54   95:return          
	}

	private void applyModeAndGravity()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(mMode == 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #313 <Field int mMode>
	//*   4    6:ifne            23
			i = Math.max(0, mContentInsetStart - mTabPaddingStart);
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:getfield        #305 <Field int mContentInsetStart>
	//    8   14:aload_0         
	//    9   15:getfield        #217 <Field int mTabPaddingStart>
	//   10   18:isub            
	//   11   19:invokestatic    #462 <Method int Math.max(int, int)>
	//   12   22:istore_1        
		ViewCompat.setPaddingRelative(((View) (mTabStrip)), i, 0, 0, 0);
	//   13   23:aload_0         
	//   14   24:getfield        #161 <Field TabLayout$b mTabStrip>
	//   15   27:iload_1         
	//   16   28:iconst_0        
	//   17   29:iconst_0        
	//   18   30:iconst_0        
	//   19   31:invokestatic    #466 <Method void ViewCompat.setPaddingRelative(View, int, int, int, int)>
		switch(mMode)
	//*  20   34:aload_0         
	//*  21   35:getfield        #313 <Field int mMode>
		{
	//*  22   38:lookupswitch    2: default 64
	//	               0: 78
	//	               1: 67
	//*  23   64:goto            88
		case 1: // '\001'
			mTabStrip.setGravity(1);
	//   24   67:aload_0         
	//   25   68:getfield        #161 <Field TabLayout$b mTabStrip>
	//   26   71:iconst_1        
	//   27   72:invokevirtual   #469 <Method void TabLayout$b.setGravity(int)>
			break;

	//*  28   75:goto            88
		case 0: // '\0'
			mTabStrip.setGravity(0x800003);
	//   29   78:aload_0         
	//   30   79:getfield        #161 <Field TabLayout$b mTabStrip>
	//   31   82:ldc2            #470 <Int 0x800003>
	//   32   85:invokevirtual   #469 <Method void TabLayout$b.setGravity(int)>
			break;
		}
		updateTabViews(true);
	//   33   88:aload_0         
	//   34   89:iconst_1        
	//   35   90:invokevirtual   #473 <Method void updateTabViews(boolean)>
	//   36   93:return          
	}

	private int calculateScrollXForTab(int i, float f)
	{
		if(mMode == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field int mMode>
	//*   2    4:ifne            127
		{
			View view1 = mTabStrip.getChildAt(i);
	//    3    7:aload_0         
	//    4    8:getfield        #161 <Field TabLayout$b mTabStrip>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #477 <Method View TabLayout$b.getChildAt(int)>
	//    7   15:astore          6
			View view;
			if(i + 1 < mTabStrip.getChildCount())
	//*   8   17:iload_1         
	//*   9   18:iconst_1        
	//*  10   19:iadd            
	//*  11   20:aload_0         
	//*  12   21:getfield        #161 <Field TabLayout$b mTabStrip>
	//*  13   24:invokevirtual   #480 <Method int TabLayout$b.getChildCount()>
	//*  14   27:icmpge          45
				view = mTabStrip.getChildAt(i + 1);
	//   15   30:aload_0         
	//   16   31:getfield        #161 <Field TabLayout$b mTabStrip>
	//   17   34:iload_1         
	//   18   35:iconst_1        
	//   19   36:iadd            
	//   20   37:invokevirtual   #477 <Method View TabLayout$b.getChildAt(int)>
	//   21   40:astore          5
			else
	//*  22   42:goto            48
				view = null;
	//   23   45:aconst_null     
	//   24   46:astore          5
			if(view1 != null)
	//*  25   48:aload           6
	//*  26   50:ifnull          62
				i = view1.getWidth();
	//   27   53:aload           6
	//   28   55:invokevirtual   #485 <Method int View.getWidth()>
	//   29   58:istore_1        
			else
	//*  30   59:goto            64
				i = 0;
	//   31   62:iconst_0        
	//   32   63:istore_1        
			int j;
			if(view != null)
	//*  33   64:aload           5
	//*  34   66:ifnull          78
				j = view.getWidth();
	//   35   69:aload           5
	//   36   71:invokevirtual   #485 <Method int View.getWidth()>
	//   37   74:istore_3        
			else
	//*  38   75:goto            80
				j = 0;
	//   39   78:iconst_0        
	//   40   79:istore_3        
			int k = (view1.getLeft() + i / 2) - getWidth() / 2;
	//   41   80:aload           6
	//   42   82:invokevirtual   #488 <Method int View.getLeft()>
	//   43   85:iload_1         
	//   44   86:iconst_2        
	//   45   87:idiv            
	//   46   88:iadd            
	//   47   89:aload_0         
	//   48   90:invokevirtual   #489 <Method int getWidth()>
	//   49   93:iconst_2        
	//   50   94:idiv            
	//   51   95:isub            
	//   52   96:istore          4
			i = (int)((float)(i + j) * 0.5F * f);
	//   53   98:iload_1         
	//   54   99:iload_3         
	//   55  100:iadd            
	//   56  101:i2f             
	//   57  102:ldc2            #490 <Float 0.5F>
	//   58  105:fmul            
	//   59  106:fload_2         
	//   60  107:fmul            
	//   61  108:f2i             
	//   62  109:istore_1        
			if(ViewCompat.getLayoutDirection(((View) (this))) == 0)
	//*  63  110:aload_0         
	//*  64  111:invokestatic    #494 <Method int ViewCompat.getLayoutDirection(View)>
	//*  65  114:ifne            122
				return k + i;
	//   66  117:iload           4
	//   67  119:iload_1         
	//   68  120:iadd            
	//   69  121:ireturn         
			else
				return k - i;
	//   70  122:iload           4
	//   71  124:iload_1         
	//   72  125:isub            
	//   73  126:ireturn         
		} else
		{
			return 0;
	//   74  127:iconst_0        
	//   75  128:ireturn         
		}
	}

	private void configureTab(Tab tab, int i)
	{
		tab.setPosition(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #499 <Method void TabLayout$Tab.setPosition(int)>
		mTabs.add(i, ((Object) (tab)));
	//    3    5:aload_0         
	//    4    6:getfield        #138 <Field ArrayList mTabs>
	//    5    9:iload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #503 <Method void ArrayList.add(int, Object)>
		int j = mTabs.size();
	//    8   14:aload_0         
	//    9   15:getfield        #138 <Field ArrayList mTabs>
	//   10   18:invokevirtual   #506 <Method int ArrayList.size()>
	//   11   21:istore_3        
		for(i++; i < j; i++)
	//*  12   22:iload_2         
	//*  13   23:iconst_1        
	//*  14   24:iadd            
	//*  15   25:istore_2        
	//*  16   26:iload_2         
	//*  17   27:iload_3         
	//*  18   28:icmpge          53
			((Tab)mTabs.get(i)).setPosition(i);
	//   19   31:aload_0         
	//   20   32:getfield        #138 <Field ArrayList mTabs>
	//   21   35:iload_2         
	//   22   36:invokevirtual   #510 <Method Object ArrayList.get(int)>
	//   23   39:checkcast       #14  <Class TabLayout$Tab>
	//   24   42:iload_2         
	//   25   43:invokevirtual   #499 <Method void TabLayout$Tab.setPosition(int)>

	//   26   46:iload_2         
	//   27   47:iconst_1        
	//   28   48:iadd            
	//   29   49:istore_2        
	//*  30   50:goto            26
	//   31   53:return          
	}

	private static ColorStateList createColorStateList(int i, int j)
	{
		int ai[][] = new int[2][];
	//    0    0:iconst_2        
	//    1    1:anewarray       int[][]
	//    2    4:astore_2        
		int ai1[] = new int[2];
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:astore_3        
		ai[0] = SELECTED_STATE_SET;
	//    6    9:aload_2         
	//    7   10:iconst_0        
	//    8   11:getstatic       #514 <Field int[] SELECTED_STATE_SET>
	//    9   14:aastore         
		ai1[0] = j;
	//   10   15:aload_3         
	//   11   16:iconst_0        
	//   12   17:iload_1         
	//   13   18:iastore         
		j = 0 + 1;
	//   14   19:iconst_0        
	//   15   20:iconst_1        
	//   16   21:iadd            
	//   17   22:istore_1        
		ai[j] = EMPTY_STATE_SET;
	//   18   23:aload_2         
	//   19   24:iload_1         
	//   20   25:getstatic       #517 <Field int[] EMPTY_STATE_SET>
	//   21   28:aastore         
		ai1[j] = i;
	//   22   29:aload_3         
	//   23   30:iload_1         
	//   24   31:iload_0         
	//   25   32:iastore         
		return new ColorStateList(ai, ai1);
	//   26   33:new             #277 <Class ColorStateList>
	//   27   36:dup             
	//   28   37:aload_2         
	//   29   38:aload_3         
	//   30   39:invokespecial   #520 <Method void ColorStateList(int[][], int[])>
	//   31   42:areturn         
	}

	private android.widget.LinearLayout.LayoutParams createLayoutParamsForTabs()
	{
		android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -1);
	//    0    0:new             #522 <Class android.widget.LinearLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:iconst_m1       
	//    4    7:invokespecial   #523 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//    5   10:astore_1        
		updateTabViewLayoutParams(layoutparams);
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:invokespecial   #527 <Method void updateTabViewLayoutParams(android.widget.LinearLayout$LayoutParams)>
		return layoutparams;
	//    9   16:aload_1         
	//   10   17:areturn         
	}

	private a createTabView(Tab tab)
	{
		a a1;
		if(mTabViewPool != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field android.support.v4.util.Pools$Pool mTabViewPool>
	//*   2    4:ifnull          23
			a1 = (a)mTabViewPool.acquire();
	//    3    7:aload_0         
	//    4    8:getfield        #148 <Field android.support.v4.util.Pools$Pool mTabViewPool>
	//    5   11:invokeinterface #535 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    6   16:checkcast       #26  <Class TabLayout$a>
	//    7   19:astore_2        
		else
	//*   8   20:goto            25
			a1 = null;
	//    9   23:aconst_null     
	//   10   24:astore_2        
		a a2 = a1;
	//   11   25:aload_2         
	//   12   26:astore_3        
		if(a1 == null)
	//*  13   27:aload_2         
	//*  14   28:ifnonnull       44
			a2 = new a(getContext());
	//   15   31:new             #26  <Class TabLayout$a>
	//   16   34:dup             
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:invokevirtual   #539 <Method Context getContext()>
	//   20   40:invokespecial   #540 <Method void TabLayout$a(TabLayout, Context)>
	//   21   43:astore_3        
		a2.c(tab);
	//   22   44:aload_3         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #543 <Method void TabLayout$a.c(TabLayout$Tab)>
		a2.setFocusable(true);
	//   25   49:aload_3         
	//   26   50:iconst_1        
	//   27   51:invokevirtual   #546 <Method void TabLayout$a.setFocusable(boolean)>
		a2.setMinimumWidth(getTabMinWidth());
	//   28   54:aload_3         
	//   29   55:aload_0         
	//   30   56:invokespecial   #549 <Method int getTabMinWidth()>
	//   31   59:invokevirtual   #552 <Method void TabLayout$a.setMinimumWidth(int)>
		return a2;
	//   32   62:aload_3         
	//   33   63:areturn         
	}

	private void dispatchTabReselected(Tab tab)
	{
		for(int i = mSelectedListeners.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field ArrayList mSelectedListeners>
	//*   2    4:invokevirtual   #506 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            38
			((OnTabSelectedListener)mSelectedListeners.get(i)).onTabReselected(tab);
	//    8   14:aload_0         
	//    9   15:getfield        #143 <Field ArrayList mSelectedListeners>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #510 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #11  <Class TabLayout$OnTabSelectedListener>
	//   13   25:aload_1         
	//   14   26:invokeinterface #556 <Method void TabLayout$OnTabSelectedListener.onTabReselected(TabLayout$Tab)>

	//   15   31:iload_2         
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:istore_2        
	//*  19   35:goto            10
	//   20   38:return          
	}

	private void dispatchTabSelected(Tab tab)
	{
		for(int i = mSelectedListeners.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field ArrayList mSelectedListeners>
	//*   2    4:invokevirtual   #506 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            38
			((OnTabSelectedListener)mSelectedListeners.get(i)).onTabSelected(tab);
	//    8   14:aload_0         
	//    9   15:getfield        #143 <Field ArrayList mSelectedListeners>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #510 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #11  <Class TabLayout$OnTabSelectedListener>
	//   13   25:aload_1         
	//   14   26:invokeinterface #560 <Method void TabLayout$OnTabSelectedListener.onTabSelected(TabLayout$Tab)>

	//   15   31:iload_2         
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:istore_2        
	//*  19   35:goto            10
	//   20   38:return          
	}

	private void dispatchTabUnselected(Tab tab)
	{
		for(int i = mSelectedListeners.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field ArrayList mSelectedListeners>
	//*   2    4:invokevirtual   #506 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            38
			((OnTabSelectedListener)mSelectedListeners.get(i)).onTabUnselected(tab);
	//    8   14:aload_0         
	//    9   15:getfield        #143 <Field ArrayList mSelectedListeners>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #510 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #11  <Class TabLayout$OnTabSelectedListener>
	//   13   25:aload_1         
	//   14   26:invokeinterface #564 <Method void TabLayout$OnTabSelectedListener.onTabUnselected(TabLayout$Tab)>

	//   15   31:iload_2         
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:istore_2        
	//*  19   35:goto            10
	//   20   38:return          
	}

	private void ensureScrollAnimator()
	{
		if(mScrollAnimator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #446 <Field ValueAnimator mScrollAnimator>
	//*   2    4:ifnonnull       54
		{
			mScrollAnimator = new ValueAnimator();
	//    3    7:aload_0         
	//    4    8:new             #448 <Class ValueAnimator>
	//    5   11:dup             
	//    6   12:invokespecial   #565 <Method void ValueAnimator()>
	//    7   15:putfield        #446 <Field ValueAnimator mScrollAnimator>
			mScrollAnimator.setInterpolator(((android.animation.TimeInterpolator) (p.a)));
	//    8   18:aload_0         
	//    9   19:getfield        #446 <Field ValueAnimator mScrollAnimator>
	//   10   22:getstatic       #570 <Field android.view.animation.Interpolator p.a>
	//   11   25:invokevirtual   #574 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			mScrollAnimator.setDuration(300L);
	//   12   28:aload_0         
	//   13   29:getfield        #446 <Field ValueAnimator mScrollAnimator>
	//   14   32:ldc2w           #575 <Long 300L>
	//   15   35:invokevirtual   #580 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   16   38:pop             
			mScrollAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueanimator)
				{
					b.scrollTo(((Integer)valueanimator.getAnimatedValue()).intValue(), 0);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field TabLayout b>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #28  <Method Object ValueAnimator.getAnimatedValue()>
				//    4    8:checkcast       #30  <Class Integer>
				//    5   11:invokevirtual   #34  <Method int Integer.intValue()>
				//    6   14:iconst_0        
				//    7   15:invokevirtual   #38  <Method void TabLayout.scrollTo(int, int)>
				//    8   18:return          
				}

				final TabLayout b;

			
			{
				b = TabLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TabLayout b>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   17   39:aload_0         
	//   18   40:getfield        #446 <Field ValueAnimator mScrollAnimator>
	//   19   43:new             #6   <Class TabLayout$2>
	//   20   46:dup             
	//   21   47:aload_0         
	//   22   48:invokespecial   #583 <Method void TabLayout$2(TabLayout)>
	//   23   51:invokevirtual   #587 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		}
	//   24   54:return          
	}

	private int getDefaultHeight()
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
		int j = mTabs.size();
	//    4    4:aload_0         
	//    5    5:getfield        #138 <Field ArrayList mTabs>
	//    6    8:invokevirtual   #506 <Method int ArrayList.size()>
	//    7   11:istore          4
		boolean flag;
		do
		{
			flag = flag1;
	//    8   13:iload_3         
	//    9   14:istore_2        
			if(i >= j)
				break;
	//   10   15:iload_1         
	//   11   16:iload           4
	//   12   18:icmpge          70
			Tab tab = (Tab)mTabs.get(i);
	//   13   21:aload_0         
	//   14   22:getfield        #138 <Field ArrayList mTabs>
	//   15   25:iload_1         
	//   16   26:invokevirtual   #510 <Method Object ArrayList.get(int)>
	//   17   29:checkcast       #14  <Class TabLayout$Tab>
	//   18   32:astore          5
			if(tab != null && tab.getIcon() != null && !TextUtils.isEmpty(tab.getText()))
	//*  19   34:aload           5
	//*  20   36:ifnull          63
	//*  21   39:aload           5
	//*  22   41:invokevirtual   #592 <Method Drawable TabLayout$Tab.getIcon()>
	//*  23   44:ifnull          63
	//*  24   47:aload           5
	//*  25   49:invokevirtual   #595 <Method CharSequence TabLayout$Tab.getText()>
	//*  26   52:invokestatic    #384 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  27   55:ifne            63
			{
				flag = true;
	//   28   58:iconst_1        
	//   29   59:istore_2        
				break;
	//   30   60:goto            70
			}
			i++;
	//   31   63:iload_1         
	//   32   64:iconst_1        
	//   33   65:iadd            
	//   34   66:istore_1        
		} while(true);
	//   35   67:goto            13
		return !flag ? 48 : 72;
	//   36   70:iload_2         
	//   37   71:ifeq            77
	//   38   74:bipush          72
	//   39   76:ireturn         
	//   40   77:bipush          48
	//   41   79:ireturn         
	}

	private float getScrollPosition()
	{
		return mTabStrip.e();
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field TabLayout$b mTabStrip>
	//    2    4:invokevirtual   #599 <Method float TabLayout$b.e()>
	//    3    7:freturn         
	}

	private int getTabMinWidth()
	{
		if(mRequestedTabMinWidth != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #290 <Field int mRequestedTabMinWidth>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          13
			return mRequestedTabMinWidth;
	//    4    8:aload_0         
	//    5    9:getfield        #290 <Field int mRequestedTabMinWidth>
	//    6   12:ireturn         
		if(mMode == 0)
	//*   7   13:aload_0         
	//*   8   14:getfield        #313 <Field int mMode>
	//*   9   17:ifne            25
			return mScrollableTabMinWidth;
	//   10   20:aload_0         
	//   11   21:getfield        #339 <Field int mScrollableTabMinWidth>
	//   12   24:ireturn         
		else
			return 0;
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	private int getTabScrollRange()
	{
		return Math.max(0, mTabStrip.getWidth() - getWidth() - getPaddingLeft() - getPaddingRight());
	//    0    0:iconst_0        
	//    1    1:aload_0         
	//    2    2:getfield        #161 <Field TabLayout$b mTabStrip>
	//    3    5:invokevirtual   #601 <Method int TabLayout$b.getWidth()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #489 <Method int getWidth()>
	//    6   12:isub            
	//    7   13:aload_0         
	//    8   14:invokevirtual   #604 <Method int getPaddingLeft()>
	//    9   17:isub            
	//   10   18:aload_0         
	//   11   19:invokevirtual   #607 <Method int getPaddingRight()>
	//   12   22:isub            
	//   13   23:invokestatic    #462 <Method int Math.max(int, int)>
	//   14   26:ireturn         
	}

	private void removeTabViewAt(int i)
	{
		a a1 = (a)mTabStrip.getChildAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field TabLayout$b mTabStrip>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #477 <Method View TabLayout$b.getChildAt(int)>
	//    4    8:checkcast       #26  <Class TabLayout$a>
	//    5   11:astore_2        
		mTabStrip.removeViewAt(i);
	//    6   12:aload_0         
	//    7   13:getfield        #161 <Field TabLayout$b mTabStrip>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #611 <Method void TabLayout$b.removeViewAt(int)>
		if(a1 != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          39
		{
			a1.b();
	//   12   24:aload_2         
	//   13   25:invokevirtual   #613 <Method void TabLayout$a.b()>
			mTabViewPool.release(((Object) (a1)));
	//   14   28:aload_0         
	//   15   29:getfield        #148 <Field android.support.v4.util.Pools$Pool mTabViewPool>
	//   16   32:aload_2         
	//   17   33:invokeinterface #617 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   18   38:pop             
		}
		requestLayout();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #620 <Method void requestLayout()>
	//   21   43:return          
	}

	private void setSelectedTabView(int i)
	{
		int k = mTabStrip.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field TabLayout$b mTabStrip>
	//    2    4:invokevirtual   #480 <Method int TabLayout$b.getChildCount()>
	//    3    7:istore_3        
		if(i < k)
	//*   4    8:iload_1         
	//*   5    9:iload_3         
	//*   6   10:icmpge          58
		{
			for(int j = 0; j < k; j++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          58
			{
				View view = mTabStrip.getChildAt(j);
	//   12   20:aload_0         
	//   13   21:getfield        #161 <Field TabLayout$b mTabStrip>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #477 <Method View TabLayout$b.getChildAt(int)>
	//   16   28:astore          5
				boolean flag;
				if(j == i)
	//*  17   30:iload_2         
	//*  18   31:iload_1         
	//*  19   32:icmpne          41
					flag = true;
	//   20   35:iconst_1        
	//   21   36:istore          4
				else
	//*  22   38:goto            44
					flag = false;
	//   23   41:iconst_0        
	//   24   42:istore          4
				view.setSelected(flag);
	//   25   44:aload           5
	//   26   46:iload           4
	//   27   48:invokevirtual   #624 <Method void View.setSelected(boolean)>
			}

	//   28   51:iload_2         
	//   29   52:iconst_1        
	//   30   53:iadd            
	//   31   54:istore_2        
		}
	//*  32   55:goto            15
	//   33   58:return          
	}

	private void setupWithViewPager(ViewPager viewpager, boolean flag, boolean flag1)
	{
		if(mViewPager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #629 <Field ViewPager mViewPager>
	//*   2    4:ifnull          43
		{
			if(mPageChangeListener != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #631 <Field TabLayout$TabLayoutOnPageChangeListener mPageChangeListener>
	//*   5   11:ifnull          25
				mViewPager.removeOnPageChangeListener(((android.support.v4.view.ViewPager.OnPageChangeListener) (mPageChangeListener)));
	//    6   14:aload_0         
	//    7   15:getfield        #629 <Field ViewPager mViewPager>
	//    8   18:aload_0         
	//    9   19:getfield        #631 <Field TabLayout$TabLayoutOnPageChangeListener mPageChangeListener>
	//   10   22:invokevirtual   #637 <Method void ViewPager.removeOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
			if(mAdapterChangeListener != null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #639 <Field TabLayout$d mAdapterChangeListener>
	//*  13   29:ifnull          43
				mViewPager.removeOnAdapterChangeListener(((android.support.v4.view.ViewPager.OnAdapterChangeListener) (mAdapterChangeListener)));
	//   14   32:aload_0         
	//   15   33:getfield        #629 <Field ViewPager mViewPager>
	//   16   36:aload_0         
	//   17   37:getfield        #639 <Field TabLayout$d mAdapterChangeListener>
	//   18   40:invokevirtual   #643 <Method void ViewPager.removeOnAdapterChangeListener(android.support.v4.view.ViewPager$OnAdapterChangeListener)>
		}
		if(mCurrentVpSelectedListener != null)
	//*  19   43:aload_0         
	//*  20   44:getfield        #645 <Field TabLayout$OnTabSelectedListener mCurrentVpSelectedListener>
	//*  21   47:ifnull          63
		{
			removeOnTabSelectedListener(mCurrentVpSelectedListener);
	//   22   50:aload_0         
	//   23   51:aload_0         
	//   24   52:getfield        #645 <Field TabLayout$OnTabSelectedListener mCurrentVpSelectedListener>
	//   25   55:invokevirtual   #649 <Method void removeOnTabSelectedListener(TabLayout$OnTabSelectedListener)>
			mCurrentVpSelectedListener = null;
	//   26   58:aload_0         
	//   27   59:aconst_null     
	//   28   60:putfield        #645 <Field TabLayout$OnTabSelectedListener mCurrentVpSelectedListener>
		}
		if(viewpager != null)
	//*  29   63:aload_1         
	//*  30   64:ifnull          192
		{
			mViewPager = viewpager;
	//   31   67:aload_0         
	//   32   68:aload_1         
	//   33   69:putfield        #629 <Field ViewPager mViewPager>
			if(mPageChangeListener == null)
	//*  34   72:aload_0         
	//*  35   73:getfield        #631 <Field TabLayout$TabLayoutOnPageChangeListener mPageChangeListener>
	//*  36   76:ifnonnull       91
				mPageChangeListener = new TabLayoutOnPageChangeListener(this);
	//   37   79:aload_0         
	//   38   80:new             #20  <Class TabLayout$TabLayoutOnPageChangeListener>
	//   39   83:dup             
	//   40   84:aload_0         
	//   41   85:invokespecial   #650 <Method void TabLayout$TabLayoutOnPageChangeListener(TabLayout)>
	//   42   88:putfield        #631 <Field TabLayout$TabLayoutOnPageChangeListener mPageChangeListener>
			mPageChangeListener.reset();
	//   43   91:aload_0         
	//   44   92:getfield        #631 <Field TabLayout$TabLayoutOnPageChangeListener mPageChangeListener>
	//   45   95:invokevirtual   #653 <Method void TabLayout$TabLayoutOnPageChangeListener.reset()>
			viewpager.addOnPageChangeListener(((android.support.v4.view.ViewPager.OnPageChangeListener) (mPageChangeListener)));
	//   46   98:aload_1         
	//   47   99:aload_0         
	//   48  100:getfield        #631 <Field TabLayout$TabLayoutOnPageChangeListener mPageChangeListener>
	//   49  103:invokevirtual   #656 <Method void ViewPager.addOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
			mCurrentVpSelectedListener = ((OnTabSelectedListener) (new ViewPagerOnTabSelectedListener(viewpager)));
	//   50  106:aload_0         
	//   51  107:new             #23  <Class TabLayout$ViewPagerOnTabSelectedListener>
	//   52  110:dup             
	//   53  111:aload_1         
	//   54  112:invokespecial   #659 <Method void TabLayout$ViewPagerOnTabSelectedListener(ViewPager)>
	//   55  115:putfield        #645 <Field TabLayout$OnTabSelectedListener mCurrentVpSelectedListener>
			addOnTabSelectedListener(mCurrentVpSelectedListener);
	//   56  118:aload_0         
	//   57  119:aload_0         
	//   58  120:getfield        #645 <Field TabLayout$OnTabSelectedListener mCurrentVpSelectedListener>
	//   59  123:invokevirtual   #662 <Method void addOnTabSelectedListener(TabLayout$OnTabSelectedListener)>
			PagerAdapter pageradapter = viewpager.getAdapter();
	//   60  126:aload_1         
	//   61  127:invokevirtual   #666 <Method PagerAdapter ViewPager.getAdapter()>
	//   62  130:astore          4
			if(pageradapter != null)
	//*  63  132:aload           4
	//*  64  134:ifnull          144
				setPagerAdapter(pageradapter, flag);
	//   65  137:aload_0         
	//   66  138:aload           4
	//   67  140:iload_2         
	//   68  141:invokevirtual   #670 <Method void setPagerAdapter(PagerAdapter, boolean)>
			if(mAdapterChangeListener == null)
	//*  69  144:aload_0         
	//*  70  145:getfield        #639 <Field TabLayout$d mAdapterChangeListener>
	//*  71  148:ifnonnull       163
				mAdapterChangeListener = new d();
	//   72  151:aload_0         
	//   73  152:new             #36  <Class TabLayout$d>
	//   74  155:dup             
	//   75  156:aload_0         
	//   76  157:invokespecial   #671 <Method void TabLayout$d(TabLayout)>
	//   77  160:putfield        #639 <Field TabLayout$d mAdapterChangeListener>
			mAdapterChangeListener.e(flag);
	//   78  163:aload_0         
	//   79  164:getfield        #639 <Field TabLayout$d mAdapterChangeListener>
	//   80  167:iload_2         
	//   81  168:invokevirtual   #673 <Method void TabLayout$d.e(boolean)>
			viewpager.addOnAdapterChangeListener(((android.support.v4.view.ViewPager.OnAdapterChangeListener) (mAdapterChangeListener)));
	//   82  171:aload_1         
	//   83  172:aload_0         
	//   84  173:getfield        #639 <Field TabLayout$d mAdapterChangeListener>
	//   85  176:invokevirtual   #676 <Method void ViewPager.addOnAdapterChangeListener(android.support.v4.view.ViewPager$OnAdapterChangeListener)>
			setScrollPosition(viewpager.getCurrentItem(), 0.0F, true);
	//   86  179:aload_0         
	//   87  180:aload_1         
	//   88  181:invokevirtual   #679 <Method int ViewPager.getCurrentItem()>
	//   89  184:fconst_0        
	//   90  185:iconst_1        
	//   91  186:invokevirtual   #434 <Method void setScrollPosition(int, float, boolean)>
		} else
	//*  92  189:goto            203
		{
			mViewPager = null;
	//   93  192:aload_0         
	//   94  193:aconst_null     
	//   95  194:putfield        #629 <Field ViewPager mViewPager>
			setPagerAdapter(((PagerAdapter) (null)), false);
	//   96  197:aload_0         
	//   97  198:aconst_null     
	//   98  199:iconst_0        
	//   99  200:invokevirtual   #670 <Method void setPagerAdapter(PagerAdapter, boolean)>
		}
		mSetupViewPagerImplicitly = flag1;
	//  100  203:aload_0         
	//  101  204:iload_3         
	//  102  205:putfield        #681 <Field boolean mSetupViewPagerImplicitly>
	//  103  208:return          
	}

	private void updateAllTabs()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		for(int j = mTabs.size(); i < j; i++)
	//*   2    2:aload_0         
	//*   3    3:getfield        #138 <Field ArrayList mTabs>
	//*   4    6:invokevirtual   #506 <Method int ArrayList.size()>
	//*   5    9:istore_2        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          36
			((Tab)mTabs.get(i)).updateView();
	//    9   15:aload_0         
	//   10   16:getfield        #138 <Field ArrayList mTabs>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #510 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #14  <Class TabLayout$Tab>
	//   14   26:invokevirtual   #685 <Method void TabLayout$Tab.updateView()>

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_1        
	//*  19   33:goto            10
	//   20   36:return          
	}

	private void updateTabViewLayoutParams(android.widget.LinearLayout.LayoutParams layoutparams)
	{
		if(mMode == 1 && mTabGravity == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field int mMode>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          26
	//*   4    8:aload_0         
	//*   5    9:getfield        #318 <Field int mTabGravity>
	//*   6   12:ifne            26
		{
			layoutparams.width = 0;
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:putfield        #688 <Field int android.widget.LinearLayout$LayoutParams.width>
			layoutparams.weight = 1.0F;
	//   10   20:aload_1         
	//   11   21:fconst_1        
	//   12   22:putfield        #691 <Field float android.widget.LinearLayout$LayoutParams.weight>
			return;
	//   13   25:return          
		} else
		{
			layoutparams.width = -2;
	//   14   26:aload_1         
	//   15   27:bipush          -2
	//   16   29:putfield        #688 <Field int android.widget.LinearLayout$LayoutParams.width>
			layoutparams.weight = 0.0F;
	//   17   32:aload_1         
	//   18   33:fconst_0        
	//   19   34:putfield        #691 <Field float android.widget.LinearLayout$LayoutParams.weight>
			return;
	//   20   37:return          
		}
	}

	public void addOnTabSelectedListener(OnTabSelectedListener ontabselectedlistener)
	{
		if(!mSelectedListeners.contains(((Object) (ontabselectedlistener))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field ArrayList mSelectedListeners>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #694 <Method boolean ArrayList.contains(Object)>
	//*   4    8:ifne            20
			mSelectedListeners.add(((Object) (ontabselectedlistener)));
	//    5   11:aload_0         
	//    6   12:getfield        #143 <Field ArrayList mSelectedListeners>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #696 <Method boolean ArrayList.add(Object)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void addTab(Tab tab)
	{
		addTab(tab, mTabs.isEmpty());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #138 <Field ArrayList mTabs>
	//    4    6:invokevirtual   #698 <Method boolean ArrayList.isEmpty()>
	//    5    9:invokevirtual   #701 <Method void addTab(TabLayout$Tab, boolean)>
	//    6   12:return          
	}

	public void addTab(Tab tab, int i)
	{
		addTab(tab, i, mTabs.isEmpty());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #138 <Field ArrayList mTabs>
	//    5    7:invokevirtual   #698 <Method boolean ArrayList.isEmpty()>
	//    6   10:invokevirtual   #704 <Method void addTab(TabLayout$Tab, int, boolean)>
	//    7   13:return          
	}

	public void addTab(Tab tab, int i, boolean flag)
	{
		if(tab.mParent != this)
	//*   0    0:aload_1         
	//*   1    1:getfield        #708 <Field TabLayout TabLayout$Tab.mParent>
	//*   2    4:aload_0         
	//*   3    5:if_acmpeq       19
			throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
	//    4    8:new             #411 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc2            #710 <String "Tab belongs to a different TabLayout.">
	//    7   15:invokespecial   #416 <Method void IllegalArgumentException(String)>
	//    8   18:athrow          
		configureTab(tab, i);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:iload_2         
	//   12   22:invokespecial   #712 <Method void configureTab(TabLayout$Tab, int)>
		addTabView(tab);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #714 <Method void addTabView(TabLayout$Tab)>
		if(flag)
	//*  16   30:iload_3         
	//*  17   31:ifeq            38
			tab.select();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #717 <Method void TabLayout$Tab.select()>
	//   20   38:return          
	}

	public void addTab(Tab tab, boolean flag)
	{
		addTab(tab, mTabs.size(), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #138 <Field ArrayList mTabs>
	//    4    6:invokevirtual   #506 <Method int ArrayList.size()>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #704 <Method void addTab(TabLayout$Tab, int, boolean)>
	//    7   13:return          
	}

	public void addView(View view)
	{
		addViewInternal(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #719 <Method void addViewInternal(View)>
	//    3    5:return          
	}

	public void addView(View view, int i)
	{
		addViewInternal(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #719 <Method void addViewInternal(View)>
	//    3    5:return          
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		addViewInternal(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #719 <Method void addViewInternal(View)>
	//    3    5:return          
	}

	public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		addViewInternal(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #719 <Method void addViewInternal(View)>
	//    3    5:return          
	}

	public void clearOnTabSelectedListeners()
	{
		mSelectedListeners.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field ArrayList mSelectedListeners>
	//    2    4:invokevirtual   #725 <Method void ArrayList.clear()>
	//    3    7:return          
	}

	int dpToPx(int i)
	{
		return Math.round(getResources().getDisplayMetrics().density * (float)i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #322 <Method Resources getResources()>
	//    2    4:invokevirtual   #730 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    3    7:getfield        #735 <Field float DisplayMetrics.density>
	//    4   10:iload_1         
	//    5   11:i2f             
	//    6   12:fmul            
	//    7   13:invokestatic    #739 <Method int Math.round(float)>
	//    8   16:ireturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #744 <Method android.widget.FrameLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	public android.widget.FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return generateDefaultLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #748 <Method android.widget.FrameLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public int getSelectedTabPosition()
	{
		if(mSelectedTab != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #751 <Field TabLayout$Tab mSelectedTab>
	//*   2    4:ifnull          15
			return mSelectedTab.getPosition();
	//    3    7:aload_0         
	//    4    8:getfield        #751 <Field TabLayout$Tab mSelectedTab>
	//    5   11:invokevirtual   #400 <Method int TabLayout$Tab.getPosition()>
	//    6   14:ireturn         
		else
			return -1;
	//    7   15:iconst_m1       
	//    8   16:ireturn         
	}

	public Tab getTabAt(int i)
	{
		if(i < 0 || i >= getTabCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            12
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #755 <Method int getTabCount()>
	//*   5    9:icmplt          14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		else
			return (Tab)mTabs.get(i);
	//    8   14:aload_0         
	//    9   15:getfield        #138 <Field ArrayList mTabs>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #510 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #14  <Class TabLayout$Tab>
	//   13   25:areturn         
	}

	public int getTabCount()
	{
		return mTabs.size();
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field ArrayList mTabs>
	//    2    4:invokevirtual   #506 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public int getTabGravity()
	{
		return mTabGravity;
	//    0    0:aload_0         
	//    1    1:getfield        #318 <Field int mTabGravity>
	//    2    4:ireturn         
	}

	int getTabMaxWidth()
	{
		return mTabMaxWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field int mTabMaxWidth>
	//    2    4:ireturn         
	}

	public int getTabMode()
	{
		return mMode;
	//    0    0:aload_0         
	//    1    1:getfield        #313 <Field int mMode>
	//    2    4:ireturn         
	}

	public ColorStateList getTabTextColors()
	{
		return mTabTextColors;
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field ColorStateList mTabTextColors>
	//    2    4:areturn         
	}

	public Tab newTab()
	{
		Tab tab1 = (Tab)sTabPool.acquire();
	//    0    0:getstatic       #123 <Field android.support.v4.util.Pools$Pool sTabPool>
	//    1    3:invokeinterface #535 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    2    8:checkcast       #14  <Class TabLayout$Tab>
	//    3   11:astore_2        
		Tab tab = tab1;
	//    4   12:aload_2         
	//    5   13:astore_1        
		if(tab1 == null)
	//*   6   14:aload_2         
	//*   7   15:ifnonnull       26
			tab = new Tab();
	//    8   18:new             #14  <Class TabLayout$Tab>
	//    9   21:dup             
	//   10   22:invokespecial   #762 <Method void TabLayout$Tab()>
	//   11   25:astore_1        
		tab.mParent = this;
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:putfield        #708 <Field TabLayout TabLayout$Tab.mParent>
		tab.mView = createTabView(tab);
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokespecial   #764 <Method TabLayout$a createTabView(TabLayout$Tab)>
	//   19   37:putfield        #397 <Field TabLayout$a TabLayout$Tab.mView>
		return tab;
	//   20   40:aload_1         
	//   21   41:areturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #767 <Method void HorizontalScrollView.onAttachedToWindow()>
		if(mViewPager == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #629 <Field ViewPager mViewPager>
	//*   4    8:ifnonnull       33
		{
			android.view.ViewParent viewparent = getParent();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #771 <Method android.view.ViewParent getParent()>
	//    7   15:astore_1        
			if(viewparent instanceof ViewPager)
	//*   8   16:aload_1         
	//*   9   17:instanceof      #633 <Class ViewPager>
	//*  10   20:ifeq            33
				setupWithViewPager((ViewPager)viewparent, true, true);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:checkcast       #633 <Class ViewPager>
	//   14   28:iconst_1        
	//   15   29:iconst_1        
	//   16   30:invokespecial   #773 <Method void setupWithViewPager(ViewPager, boolean, boolean)>
		}
	//   17   33:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #776 <Method void HorizontalScrollView.onDetachedFromWindow()>
		if(mSetupViewPagerImplicitly)
	//*   2    4:aload_0         
	//*   3    5:getfield        #681 <Field boolean mSetupViewPagerImplicitly>
	//*   4    8:ifeq            21
		{
			setupWithViewPager(((ViewPager) (null)));
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:invokevirtual   #778 <Method void setupWithViewPager(ViewPager)>
			mSetupViewPagerImplicitly = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #681 <Field boolean mSetupViewPagerImplicitly>
		}
	//   11   21:return          
	}

	protected void onMeasure(int i, int j)
	{
		int k = dpToPx(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #781 <Method int getDefaultHeight()>
	//    3    5:invokevirtual   #783 <Method int dpToPx(int)>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #786 <Method int getPaddingTop()>
	//    6   12:iadd            
	//    7   13:aload_0         
	//    8   14:invokevirtual   #789 <Method int getPaddingBottom()>
	//    9   17:iadd            
	//   10   18:istore_3        
		switch(android.view.View.MeasureSpec.getMode(j))
	//*  11   19:iload_2         
	//*  12   20:invokestatic    #794 <Method int android.view.View$MeasureSpec.getMode(int)>
		{
	//*  13   23:lookupswitch    2: default 48
	//	               -2147483648: 51
	//	               0: 69
	//*  14   48:goto            77
		case -2147483648: 
			j = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(k, android.view.View.MeasureSpec.getSize(j)), 0x40000000);
	//   15   51:iload_3         
	//   16   52:iload_2         
	//   17   53:invokestatic    #797 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   18   56:invokestatic    #800 <Method int Math.min(int, int)>
	//   19   59:ldc2            #801 <Int 0x40000000>
	//   20   62:invokestatic    #804 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   21   65:istore_2        
			break;

	//*  22   66:goto            77
		case 0: // '\0'
			j = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000);
	//   23   69:iload_3         
	//   24   70:ldc2            #801 <Int 0x40000000>
	//   25   73:invokestatic    #804 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   26   76:istore_2        
			break;
		}
		k = android.view.View.MeasureSpec.getSize(i);
	//   27   77:iload_1         
	//   28   78:invokestatic    #797 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   29   81:istore_3        
		if(android.view.View.MeasureSpec.getMode(i) != 0)
	//*  30   82:iload_1         
	//*  31   83:invokestatic    #794 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  32   86:ifeq            118
		{
			if(mRequestedTabMaxWidth > 0)
	//*  33   89:aload_0         
	//*  34   90:getfield        #295 <Field int mRequestedTabMaxWidth>
	//*  35   93:ifle            104
				k = mRequestedTabMaxWidth;
	//   36   96:aload_0         
	//   37   97:getfield        #295 <Field int mRequestedTabMaxWidth>
	//   38  100:istore_3        
			else
	//*  39  101:goto            113
				k -= dpToPx(56);
	//   40  104:iload_3         
	//   41  105:aload_0         
	//   42  106:bipush          56
	//   43  108:invokevirtual   #783 <Method int dpToPx(int)>
	//   44  111:isub            
	//   45  112:istore_3        
			mTabMaxWidth = k;
	//   46  113:aload_0         
	//   47  114:iload_3         
	//   48  115:putfield        #141 <Field int mTabMaxWidth>
		}
		super.onMeasure(i, j);
	//   49  118:aload_0         
	//   50  119:iload_1         
	//   51  120:iload_2         
	//   52  121:invokespecial   #806 <Method void HorizontalScrollView.onMeasure(int, int)>
		if(getChildCount() == 1)
	//*  53  124:aload_0         
	//*  54  125:invokevirtual   #807 <Method int getChildCount()>
	//*  55  128:iconst_1        
	//*  56  129:icmpne          258
		{
			View view = getChildAt(0);
	//   57  132:aload_0         
	//   58  133:iconst_0        
	//   59  134:invokevirtual   #808 <Method View getChildAt(int)>
	//   60  137:astore          4
			i = 0;
	//   61  139:iconst_0        
	//   62  140:istore_1        
			switch(mMode)
	//*  63  141:aload_0         
	//*  64  142:getfield        #313 <Field int mMode>
			{
	//*  65  145:lookupswitch    2: default 172
	//	               0: 175
	//	               1: 197
	//*  66  172:goto            216
			case 0: // '\0'
				if(view.getMeasuredWidth() < getMeasuredWidth())
	//*  67  175:aload           4
	//*  68  177:invokevirtual   #811 <Method int View.getMeasuredWidth()>
	//*  69  180:aload_0         
	//*  70  181:invokevirtual   #812 <Method int getMeasuredWidth()>
	//*  71  184:icmpge          192
					i = 1;
	//   72  187:iconst_1        
	//   73  188:istore_1        
				else
	//*  74  189:goto            194
					i = 0;
	//   75  192:iconst_0        
	//   76  193:istore_1        
				break;

	//*  77  194:goto            216
			case 1: // '\001'
				if(view.getMeasuredWidth() != getMeasuredWidth())
	//*  78  197:aload           4
	//*  79  199:invokevirtual   #811 <Method int View.getMeasuredWidth()>
	//*  80  202:aload_0         
	//*  81  203:invokevirtual   #812 <Method int getMeasuredWidth()>
	//*  82  206:icmpeq          214
					i = 1;
	//   83  209:iconst_1        
	//   84  210:istore_1        
				else
	//*  85  211:goto            216
					i = 0;
	//   86  214:iconst_0        
	//   87  215:istore_1        
				break;
			}
			if(i != 0)
	//*  88  216:iload_1         
	//*  89  217:ifeq            258
			{
				i = getChildMeasureSpec(j, getPaddingTop() + getPaddingBottom(), view.getLayoutParams().height);
	//   90  220:iload_2         
	//   91  221:aload_0         
	//   92  222:invokevirtual   #786 <Method int getPaddingTop()>
	//   93  225:aload_0         
	//   94  226:invokevirtual   #789 <Method int getPaddingBottom()>
	//   95  229:iadd            
	//   96  230:aload           4
	//   97  232:invokevirtual   #816 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   98  235:getfield        #821 <Field int android.view.ViewGroup$LayoutParams.height>
	//   99  238:invokestatic    #825 <Method int getChildMeasureSpec(int, int, int)>
	//  100  241:istore_1        
				view.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000), i);
	//  101  242:aload           4
	//  102  244:aload_0         
	//  103  245:invokevirtual   #812 <Method int getMeasuredWidth()>
	//  104  248:ldc2            #801 <Int 0x40000000>
	//  105  251:invokestatic    #804 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  106  254:iload_1         
	//  107  255:invokevirtual   #828 <Method void View.measure(int, int)>
			}
		}
	//  108  258:return          
	}

	void populateFromPagerAdapter()
	{
		removeAllTabs();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #832 <Method void removeAllTabs()>
		if(mPagerAdapter != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #834 <Field PagerAdapter mPagerAdapter>
	//*   4    8:ifnull          97
		{
			int k = mPagerAdapter.getCount();
	//    5   11:aload_0         
	//    6   12:getfield        #834 <Field PagerAdapter mPagerAdapter>
	//    7   15:invokevirtual   #839 <Method int PagerAdapter.getCount()>
	//    8   18:istore_2        
			for(int i = 0; i < k; i++)
	//*   9   19:iconst_0        
	//*  10   20:istore_1        
	//*  11   21:iload_1         
	//*  12   22:iload_2         
	//*  13   23:icmpge          53
				addTab(newTab().setText(mPagerAdapter.getPageTitle(i)), false);
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:invokevirtual   #349 <Method TabLayout$Tab newTab()>
	//   17   31:aload_0         
	//   18   32:getfield        #834 <Field PagerAdapter mPagerAdapter>
	//   19   35:iload_1         
	//   20   36:invokevirtual   #843 <Method CharSequence PagerAdapter.getPageTitle(int)>
	//   21   39:invokevirtual   #359 <Method TabLayout$Tab TabLayout$Tab.setText(CharSequence)>
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #701 <Method void addTab(TabLayout$Tab, boolean)>

	//   24   46:iload_1         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_1        
	//*  28   50:goto            21
			if(mViewPager != null && k > 0)
	//*  29   53:aload_0         
	//*  30   54:getfield        #629 <Field ViewPager mViewPager>
	//*  31   57:ifnull          97
	//*  32   60:iload_2         
	//*  33   61:ifle            97
			{
				int j = mViewPager.getCurrentItem();
	//   34   64:aload_0         
	//   35   65:getfield        #629 <Field ViewPager mViewPager>
	//   36   68:invokevirtual   #679 <Method int ViewPager.getCurrentItem()>
	//   37   71:istore_1        
				if(j != getSelectedTabPosition() && j < getTabCount())
	//*  38   72:iload_1         
	//*  39   73:aload_0         
	//*  40   74:invokevirtual   #845 <Method int getSelectedTabPosition()>
	//*  41   77:icmpeq          97
	//*  42   80:iload_1         
	//*  43   81:aload_0         
	//*  44   82:invokevirtual   #755 <Method int getTabCount()>
	//*  45   85:icmpge          97
					selectTab(getTabAt(j));
	//   46   88:aload_0         
	//   47   89:aload_0         
	//   48   90:iload_1         
	//   49   91:invokevirtual   #847 <Method TabLayout$Tab getTabAt(int)>
	//   50   94:invokevirtual   #850 <Method void selectTab(TabLayout$Tab)>
			}
		}
	//   51   97:return          
	}

	public void removeAllTabs()
	{
		for(int i = mTabStrip.getChildCount() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #161 <Field TabLayout$b mTabStrip>
	//*   2    4:invokevirtual   #480 <Method int TabLayout$b.getChildCount()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            26
			removeTabViewAt(i);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:invokespecial   #852 <Method void removeTabViewAt(int)>

	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:istore_1        
	//*  15   23:goto            10
		Tab tab;
		for(Iterator iterator = mTabs.iterator(); iterator.hasNext(); sTabPool.release(((Object) (tab))))
	//*  16   26:aload_0         
	//*  17   27:getfield        #138 <Field ArrayList mTabs>
	//*  18   30:invokevirtual   #856 <Method Iterator ArrayList.iterator()>
	//*  19   33:astore_2        
	//*  20   34:aload_2         
	//*  21   35:invokeinterface #861 <Method boolean Iterator.hasNext()>
	//*  22   40:ifeq            76
		{
			tab = (Tab)iterator.next();
	//   23   43:aload_2         
	//   24   44:invokeinterface #864 <Method Object Iterator.next()>
	//   25   49:checkcast       #14  <Class TabLayout$Tab>
	//   26   52:astore_3        
			iterator.remove();
	//   27   53:aload_2         
	//   28   54:invokeinterface #867 <Method void Iterator.remove()>
			tab.reset();
	//   29   59:aload_3         
	//   30   60:invokevirtual   #868 <Method void TabLayout$Tab.reset()>
		}

	//   31   63:getstatic       #123 <Field android.support.v4.util.Pools$Pool sTabPool>
	//   32   66:aload_3         
	//   33   67:invokeinterface #617 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   34   72:pop             
	//*  35   73:goto            34
		mSelectedTab = null;
	//   36   76:aload_0         
	//   37   77:aconst_null     
	//   38   78:putfield        #751 <Field TabLayout$Tab mSelectedTab>
	//   39   81:return          
	}

	public void removeOnTabSelectedListener(OnTabSelectedListener ontabselectedlistener)
	{
		mSelectedListeners.remove(((Object) (ontabselectedlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field ArrayList mSelectedListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #870 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void removeTab(Tab tab)
	{
		if(tab.mParent != this)
	//*   0    0:aload_1         
	//*   1    1:getfield        #708 <Field TabLayout TabLayout$Tab.mParent>
	//*   2    4:aload_0         
	//*   3    5:if_acmpeq       19
		{
			throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
	//    4    8:new             #411 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc2            #873 <String "Tab does not belong to this TabLayout.">
	//    7   15:invokespecial   #416 <Method void IllegalArgumentException(String)>
	//    8   18:athrow          
		} else
		{
			removeTabAt(tab.getPosition());
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #400 <Method int TabLayout$Tab.getPosition()>
	//   12   24:invokevirtual   #876 <Method void removeTabAt(int)>
			return;
	//   13   27:return          
		}
	}

	public void removeTabAt(int i)
	{
		int j;
		if(mSelectedTab != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #751 <Field TabLayout$Tab mSelectedTab>
	//*   2    4:ifnull          18
			j = mSelectedTab.getPosition();
	//    3    7:aload_0         
	//    4    8:getfield        #751 <Field TabLayout$Tab mSelectedTab>
	//    5   11:invokevirtual   #400 <Method int TabLayout$Tab.getPosition()>
	//    6   14:istore_2        
		else
	//*   7   15:goto            20
			j = 0;
	//    8   18:iconst_0        
	//    9   19:istore_2        
		removeTabViewAt(i);
	//   10   20:aload_0         
	//   11   21:iload_1         
	//   12   22:invokespecial   #852 <Method void removeTabViewAt(int)>
		Tab tab = (Tab)mTabs.remove(i);
	//   13   25:aload_0         
	//   14   26:getfield        #138 <Field ArrayList mTabs>
	//   15   29:iload_1         
	//   16   30:invokevirtual   #878 <Method Object ArrayList.remove(int)>
	//   17   33:checkcast       #14  <Class TabLayout$Tab>
	//   18   36:astore          5
		if(tab != null)
	//*  19   38:aload           5
	//*  20   40:ifnull          59
		{
			tab.reset();
	//   21   43:aload           5
	//   22   45:invokevirtual   #868 <Method void TabLayout$Tab.reset()>
			sTabPool.release(((Object) (tab)));
	//   23   48:getstatic       #123 <Field android.support.v4.util.Pools$Pool sTabPool>
	//   24   51:aload           5
	//   25   53:invokeinterface #617 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   26   58:pop             
		}
		int l = mTabs.size();
	//   27   59:aload_0         
	//   28   60:getfield        #138 <Field ArrayList mTabs>
	//   29   63:invokevirtual   #506 <Method int ArrayList.size()>
	//   30   66:istore          4
		for(int k = i; k < l; k++)
	//*  31   68:iload_1         
	//*  32   69:istore_3        
	//*  33   70:iload_3         
	//*  34   71:iload           4
	//*  35   73:icmpge          98
			((Tab)mTabs.get(k)).setPosition(k);
	//   36   76:aload_0         
	//   37   77:getfield        #138 <Field ArrayList mTabs>
	//   38   80:iload_3         
	//   39   81:invokevirtual   #510 <Method Object ArrayList.get(int)>
	//   40   84:checkcast       #14  <Class TabLayout$Tab>
	//   41   87:iload_3         
	//   42   88:invokevirtual   #499 <Method void TabLayout$Tab.setPosition(int)>

	//   43   91:iload_3         
	//   44   92:iconst_1        
	//   45   93:iadd            
	//   46   94:istore_3        
	//*  47   95:goto            70
		if(j == i)
	//*  48   98:iload_2         
	//*  49   99:iload_1         
	//*  50  100:icmpne          144
		{
			Tab tab1;
			if(mTabs.isEmpty())
	//*  51  103:aload_0         
	//*  52  104:getfield        #138 <Field ArrayList mTabs>
	//*  53  107:invokevirtual   #698 <Method boolean ArrayList.isEmpty()>
	//*  54  110:ifeq            119
				tab1 = null;
	//   55  113:aconst_null     
	//   56  114:astore          5
			else
	//*  57  116:goto            138
				tab1 = (Tab)mTabs.get(Math.max(0, i - 1));
	//   58  119:aload_0         
	//   59  120:getfield        #138 <Field ArrayList mTabs>
	//   60  123:iconst_0        
	//   61  124:iload_1         
	//   62  125:iconst_1        
	//   63  126:isub            
	//   64  127:invokestatic    #462 <Method int Math.max(int, int)>
	//   65  130:invokevirtual   #510 <Method Object ArrayList.get(int)>
	//   66  133:checkcast       #14  <Class TabLayout$Tab>
	//   67  136:astore          5
			selectTab(tab1);
	//   68  138:aload_0         
	//   69  139:aload           5
	//   70  141:invokevirtual   #850 <Method void selectTab(TabLayout$Tab)>
		}
	//   71  144:return          
	}

	void selectTab(Tab tab)
	{
		selectTab(tab, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #880 <Method void selectTab(TabLayout$Tab, boolean)>
	//    4    6:return          
	}

	void selectTab(Tab tab, boolean flag)
	{
		Tab tab1 = mSelectedTab;
	//    0    0:aload_0         
	//    1    1:getfield        #751 <Field TabLayout$Tab mSelectedTab>
	//    2    4:astore          4
		if(tab1 == tab)
	//*   3    6:aload           4
	//*   4    8:aload_1         
	//*   5    9:if_acmpne       31
		{
			if(tab1 != null)
	//*   6   12:aload           4
	//*   7   14:ifnull          118
			{
				dispatchTabReselected(tab);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:invokespecial   #882 <Method void dispatchTabReselected(TabLayout$Tab)>
				animateToTab(tab.getPosition());
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #400 <Method int TabLayout$Tab.getPosition()>
	//   14   27:invokespecial   #884 <Method void animateToTab(int)>
				return;
	//   15   30:return          
			}
		} else
		{
			int i;
			if(tab != null)
	//*  16   31:aload_1         
	//*  17   32:ifnull          43
				i = tab.getPosition();
	//   18   35:aload_1         
	//   19   36:invokevirtual   #400 <Method int TabLayout$Tab.getPosition()>
	//   20   39:istore_3        
			else
	//*  21   40:goto            45
				i = -1;
	//   22   43:iconst_m1       
	//   23   44:istore_3        
			if(flag)
	//*  24   45:iload_2         
	//*  25   46:ifeq            93
			{
				if((tab1 == null || tab1.getPosition() == -1) && i != -1)
	//*  26   49:aload           4
	//*  27   51:ifnull          63
	//*  28   54:aload           4
	//*  29   56:invokevirtual   #400 <Method int TabLayout$Tab.getPosition()>
	//*  30   59:iconst_m1       
	//*  31   60:icmpne          78
	//*  32   63:iload_3         
	//*  33   64:iconst_m1       
	//*  34   65:icmpeq          78
					setScrollPosition(i, 0.0F, true);
	//   35   68:aload_0         
	//   36   69:iload_3         
	//   37   70:fconst_0        
	//   38   71:iconst_1        
	//   39   72:invokevirtual   #434 <Method void setScrollPosition(int, float, boolean)>
				else
	//*  40   75:goto            83
					animateToTab(i);
	//   41   78:aload_0         
	//   42   79:iload_3         
	//   43   80:invokespecial   #884 <Method void animateToTab(int)>
				if(i != -1)
	//*  44   83:iload_3         
	//*  45   84:iconst_m1       
	//*  46   85:icmpeq          93
					setSelectedTabView(i);
	//   47   88:aload_0         
	//   48   89:iload_3         
	//   49   90:invokespecial   #886 <Method void setSelectedTabView(int)>
			}
			if(tab1 != null)
	//*  50   93:aload           4
	//*  51   95:ifnull          104
				dispatchTabUnselected(tab1);
	//   52   98:aload_0         
	//   53   99:aload           4
	//   54  101:invokespecial   #888 <Method void dispatchTabUnselected(TabLayout$Tab)>
			mSelectedTab = tab;
	//   55  104:aload_0         
	//   56  105:aload_1         
	//   57  106:putfield        #751 <Field TabLayout$Tab mSelectedTab>
			if(tab != null)
	//*  58  109:aload_1         
	//*  59  110:ifnull          118
				dispatchTabSelected(tab);
	//   60  113:aload_0         
	//   61  114:aload_1         
	//   62  115:invokespecial   #890 <Method void dispatchTabSelected(TabLayout$Tab)>
		}
	//   63  118:return          
	}

	public void setOnTabSelectedListener(OnTabSelectedListener ontabselectedlistener)
	{
		if(mSelectedListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #894 <Field TabLayout$OnTabSelectedListener mSelectedListener>
	//*   2    4:ifnull          15
			removeOnTabSelectedListener(mSelectedListener);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #894 <Field TabLayout$OnTabSelectedListener mSelectedListener>
	//    6   12:invokevirtual   #649 <Method void removeOnTabSelectedListener(TabLayout$OnTabSelectedListener)>
		mSelectedListener = ontabselectedlistener;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #894 <Field TabLayout$OnTabSelectedListener mSelectedListener>
		if(ontabselectedlistener != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          29
			addOnTabSelectedListener(ontabselectedlistener);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #662 <Method void addOnTabSelectedListener(TabLayout$OnTabSelectedListener)>
	//   15   29:return          
	}

	void setPagerAdapter(PagerAdapter pageradapter, boolean flag)
	{
		if(mPagerAdapter != null && mPagerAdapterObserver != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #834 <Field PagerAdapter mPagerAdapter>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #897 <Field DataSetObserver mPagerAdapterObserver>
	//*   5   11:ifnull          25
			mPagerAdapter.unregisterDataSetObserver(mPagerAdapterObserver);
	//    6   14:aload_0         
	//    7   15:getfield        #834 <Field PagerAdapter mPagerAdapter>
	//    8   18:aload_0         
	//    9   19:getfield        #897 <Field DataSetObserver mPagerAdapterObserver>
	//   10   22:invokevirtual   #901 <Method void PagerAdapter.unregisterDataSetObserver(DataSetObserver)>
		mPagerAdapter = pageradapter;
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:putfield        #834 <Field PagerAdapter mPagerAdapter>
		if(flag && pageradapter != null)
	//*  14   30:iload_2         
	//*  15   31:ifeq            65
	//*  16   34:aload_1         
	//*  17   35:ifnull          65
		{
			if(mPagerAdapterObserver == null)
	//*  18   38:aload_0         
	//*  19   39:getfield        #897 <Field DataSetObserver mPagerAdapterObserver>
	//*  20   42:ifnonnull       57
				mPagerAdapterObserver = ((DataSetObserver) (new e()));
	//   21   45:aload_0         
	//   22   46:new             #39  <Class TabLayout$e>
	//   23   49:dup             
	//   24   50:aload_0         
	//   25   51:invokespecial   #902 <Method void TabLayout$e(TabLayout)>
	//   26   54:putfield        #897 <Field DataSetObserver mPagerAdapterObserver>
			pageradapter.registerDataSetObserver(mPagerAdapterObserver);
	//   27   57:aload_1         
	//   28   58:aload_0         
	//   29   59:getfield        #897 <Field DataSetObserver mPagerAdapterObserver>
	//   30   62:invokevirtual   #905 <Method void PagerAdapter.registerDataSetObserver(DataSetObserver)>
		}
		populateFromPagerAdapter();
	//   31   65:aload_0         
	//   32   66:invokevirtual   #907 <Method void populateFromPagerAdapter()>
	//   33   69:return          
	}

	void setScrollAnimatorListener(android.animation.Animator.AnimatorListener animatorlistener)
	{
		ensureScrollAnimator();
	//    0    0:aload_0         
	//    1    1:invokespecial   #444 <Method void ensureScrollAnimator()>
		mScrollAnimator.addListener(animatorlistener);
	//    2    4:aload_0         
	//    3    5:getfield        #446 <Field ValueAnimator mScrollAnimator>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #912 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
	//    6   12:return          
	}

	public void setScrollPosition(int i, float f, boolean flag)
	{
		setScrollPosition(i, f, flag, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:fload_2         
	//    3    3:iload_3         
	//    4    4:iconst_1        
	//    5    5:invokevirtual   #915 <Method void setScrollPosition(int, float, boolean, boolean)>
	//    6    8:return          
	}

	void setScrollPosition(int i, float f, boolean flag, boolean flag1)
	{
		int j = Math.round((float)i + f);
	//    0    0:iload_1         
	//    1    1:i2f             
	//    2    2:fload_2         
	//    3    3:fadd            
	//    4    4:invokestatic    #739 <Method int Math.round(float)>
	//    5    7:istore          5
		if(j < 0 || j >= mTabStrip.getChildCount())
	//*   6    9:iload           5
	//*   7   11:iflt            26
	//*   8   14:iload           5
	//*   9   16:aload_0         
	//*  10   17:getfield        #161 <Field TabLayout$b mTabStrip>
	//*  11   20:invokevirtual   #480 <Method int TabLayout$b.getChildCount()>
	//*  12   23:icmplt          27
			return;
	//   13   26:return          
		if(flag1)
	//*  14   27:iload           4
	//*  15   29:ifeq            41
			mTabStrip.c(i, f);
	//   16   32:aload_0         
	//   17   33:getfield        #161 <Field TabLayout$b mTabStrip>
	//   18   36:iload_1         
	//   19   37:fload_2         
	//   20   38:invokevirtual   #918 <Method void TabLayout$b.c(int, float)>
		if(mScrollAnimator != null && mScrollAnimator.isRunning())
	//*  21   41:aload_0         
	//*  22   42:getfield        #446 <Field ValueAnimator mScrollAnimator>
	//*  23   45:ifnull          65
	//*  24   48:aload_0         
	//*  25   49:getfield        #446 <Field ValueAnimator mScrollAnimator>
	//*  26   52:invokevirtual   #921 <Method boolean ValueAnimator.isRunning()>
	//*  27   55:ifeq            65
			mScrollAnimator.cancel();
	//   28   58:aload_0         
	//   29   59:getfield        #446 <Field ValueAnimator mScrollAnimator>
	//   30   62:invokevirtual   #924 <Method void ValueAnimator.cancel()>
		scrollTo(calculateScrollXForTab(i, f), 0);
	//   31   65:aload_0         
	//   32   66:aload_0         
	//   33   67:iload_1         
	//   34   68:fload_2         
	//   35   69:invokespecial   #441 <Method int calculateScrollXForTab(int, float)>
	//   36   72:iconst_0        
	//   37   73:invokevirtual   #927 <Method void scrollTo(int, int)>
		if(flag)
	//*  38   76:iload_3         
	//*  39   77:ifeq            86
			setSelectedTabView(j);
	//   40   80:aload_0         
	//   41   81:iload           5
	//   42   83:invokespecial   #886 <Method void setSelectedTabView(int)>
	//   43   86:return          
	}

	public void setSelectedTabIndicatorColor(int i)
	{
		mTabStrip.b(i);
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field TabLayout$b mTabStrip>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #206 <Method void TabLayout$b.b(int)>
	//    4    8:return          
	}

	public void setSelectedTabIndicatorHeight(int i)
	{
		mTabStrip.e(i);
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field TabLayout$b mTabStrip>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #198 <Method void TabLayout$b.e(int)>
	//    4    8:return          
	}

	public void setTabGravity(int i)
	{
		if(mTabGravity != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #318 <Field int mTabGravity>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mTabGravity = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #318 <Field int mTabGravity>
			applyModeAndGravity();
	//    7   13:aload_0         
	//    8   14:invokespecial   #342 <Method void applyModeAndGravity()>
		}
	//    9   17:return          
	}

	public void setTabMode(int i)
	{
		if(i != mMode)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #313 <Field int mMode>
	//*   3    5:icmpeq          17
		{
			mMode = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #313 <Field int mMode>
			applyModeAndGravity();
	//    7   13:aload_0         
	//    8   14:invokespecial   #342 <Method void applyModeAndGravity()>
		}
	//    9   17:return          
	}

	public void setTabTextColors(int i, int j)
	{
		setTabTextColors(createColorStateList(i, j));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #285 <Method ColorStateList createColorStateList(int, int)>
	//    4    6:invokevirtual   #936 <Method void setTabTextColors(ColorStateList)>
	//    5    9:return          
	}

	public void setTabTextColors(ColorStateList colorstatelist)
	{
		if(mTabTextColors != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #262 <Field ColorStateList mTabTextColors>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			mTabTextColors = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #262 <Field ColorStateList mTabTextColors>
			updateAllTabs();
	//    7   13:aload_0         
	//    8   14:invokespecial   #938 <Method void updateAllTabs()>
		}
	//    9   17:return          
	}

	public void setTabsFromPagerAdapter(PagerAdapter pageradapter)
	{
		setPagerAdapter(pageradapter, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #670 <Method void setPagerAdapter(PagerAdapter, boolean)>
	//    4    6:return          
	}

	public void setupWithViewPager(ViewPager viewpager)
	{
		setupWithViewPager(viewpager, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #943 <Method void setupWithViewPager(ViewPager, boolean)>
	//    4    6:return          
	}

	public void setupWithViewPager(ViewPager viewpager, boolean flag)
	{
		setupWithViewPager(viewpager, flag, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #773 <Method void setupWithViewPager(ViewPager, boolean, boolean)>
	//    5    7:return          
	}

	public boolean shouldDelayChildPressedState()
	{
		return getTabScrollRange() > 0;
	//    0    0:aload_0         
	//    1    1:invokespecial   #946 <Method int getTabScrollRange()>
	//    2    4:ifle            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	void updateTabViews(boolean flag)
	{
		for(int i = 0; i < mTabStrip.getChildCount(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #161 <Field TabLayout$b mTabStrip>
	//*   5    7:invokevirtual   #480 <Method int TabLayout$b.getChildCount()>
	//*   6   10:icmpge          56
		{
			View view = mTabStrip.getChildAt(i);
	//    7   13:aload_0         
	//    8   14:getfield        #161 <Field TabLayout$b mTabStrip>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #477 <Method View TabLayout$b.getChildAt(int)>
	//   11   21:astore_3        
			view.setMinimumWidth(getTabMinWidth());
	//   12   22:aload_3         
	//   13   23:aload_0         
	//   14   24:invokespecial   #549 <Method int getTabMinWidth()>
	//   15   27:invokevirtual   #947 <Method void View.setMinimumWidth(int)>
			updateTabViewLayoutParams((android.widget.LinearLayout.LayoutParams)view.getLayoutParams());
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:invokevirtual   #816 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   19   35:checkcast       #522 <Class android.widget.LinearLayout$LayoutParams>
	//   20   38:invokespecial   #527 <Method void updateTabViewLayoutParams(android.widget.LinearLayout$LayoutParams)>
			if(flag)
	//*  21   41:iload_1         
	//*  22   42:ifeq            49
				view.requestLayout();
	//   23   45:aload_3         
	//   24   46:invokevirtual   #948 <Method void View.requestLayout()>
		}

	//   25   49:iload_2         
	//   26   50:iconst_1        
	//   27   51:iadd            
	//   28   52:istore_2        
	//*  29   53:goto            2
	//   30   56:return          
	}

	private static final int ANIMATION_DURATION = 300;
	static final int DEFAULT_GAP_TEXT_ICON = 8;
	private static final int DEFAULT_HEIGHT = 48;
	private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
	static final int FIXED_WRAP_GUTTER_MIN = 16;
	public static final int GRAVITY_CENTER = 1;
	public static final int GRAVITY_FILL = 0;
	private static final int INVALID_WIDTH = -1;
	public static final int MODE_FIXED = 1;
	public static final int MODE_SCROLLABLE = 0;
	static final int MOTION_NON_ADJACENT_OFFSET = 24;
	private static final int TAB_MIN_WIDTH_MARGIN = 56;
	private static final android.support.v4.util.Pools.Pool sTabPool = new android.support.v4.util.Pools.SynchronizedPool(16);
	private d mAdapterChangeListener;
	private int mContentInsetStart;
	private OnTabSelectedListener mCurrentVpSelectedListener;
	int mMode;
	private TabLayoutOnPageChangeListener mPageChangeListener;
	private PagerAdapter mPagerAdapter;
	private DataSetObserver mPagerAdapterObserver;
	private final int mRequestedTabMaxWidth;
	private final int mRequestedTabMinWidth;
	private ValueAnimator mScrollAnimator;
	private final int mScrollableTabMinWidth;
	private OnTabSelectedListener mSelectedListener;
	private final ArrayList mSelectedListeners;
	private Tab mSelectedTab;
	private boolean mSetupViewPagerImplicitly;
	final int mTabBackgroundResId;
	int mTabGravity;
	int mTabMaxWidth;
	int mTabPaddingBottom;
	int mTabPaddingEnd;
	int mTabPaddingStart;
	int mTabPaddingTop;
	private final b mTabStrip;
	int mTabTextAppearance;
	ColorStateList mTabTextColors;
	float mTabTextMultiLineSize;
	float mTabTextSize;
	private final android.support.v4.util.Pools.Pool mTabViewPool;
	private final ArrayList mTabs;
	ViewPager mViewPager;

	static 
	{
	//    0    0:new             #117 <Class android.support.v4.util.Pools$SynchronizedPool>
	//    1    3:dup             
	//    2    4:bipush          16
	//    3    6:invokespecial   #121 <Method void android.support.v4.util.Pools$SynchronizedPool(int)>
	//    4    9:putstatic       #123 <Field android.support.v4.util.Pools$Pool sTabPool>
	//*   5   12:return          
	}
}
