// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.view.ActionBarPolicy;
import android.text.TextUtils;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.*;

// Referenced classes of package android.support.v7.widget:
//			AppCompatSpinner, LinearLayoutCompat, TintTypedArray, AppCompatImageView, 
//			AppCompatTextView, TooltipCompat

public class ScrollingTabContainerView extends HorizontalScrollView
	implements android.widget.AdapterView.OnItemSelectedListener
{
	private class TabAdapter extends BaseAdapter
	{

		public int getCount()
		{
			return mTabLayout.getChildCount();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ScrollingTabContainerView this$0>
		//    2    4:getfield        #23  <Field LinearLayoutCompat ScrollingTabContainerView.mTabLayout>
		//    3    7:invokevirtual   #28  <Method int LinearLayoutCompat.getChildCount()>
		//    4   10:ireturn         
		}

		public Object getItem(int i)
		{
			return ((Object) (((TabView)mTabLayout.getChildAt(i)).getTab()));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ScrollingTabContainerView this$0>
		//    2    4:getfield        #23  <Field LinearLayoutCompat ScrollingTabContainerView.mTabLayout>
		//    3    7:iload_1         
		//    4    8:invokevirtual   #34  <Method View LinearLayoutCompat.getChildAt(int)>
		//    5   11:checkcast       #36  <Class ScrollingTabContainerView$TabView>
		//    6   14:invokevirtual   #40  <Method android.support.v7.app.ActionBar$Tab ScrollingTabContainerView$TabView.getTab()>
		//    7   17:areturn         
		}

		public long getItemId(int i)
		{
			return (long)i;
		//    0    0:iload_1         
		//    1    1:i2l             
		//    2    2:lreturn         
		}

		public View getView(int i, View view, ViewGroup viewgroup)
		{
			if(view == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       21
			{
				return ((View) (createTabView((android.support.v7.app.ActionBar.Tab)getItem(i), true)));
		//    2    4:aload_0         
		//    3    5:getfield        #13  <Field ScrollingTabContainerView this$0>
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:invokevirtual   #46  <Method Object getItem(int)>
		//    7   13:checkcast       #48  <Class android.support.v7.app.ActionBar$Tab>
		//    8   16:iconst_1        
		//    9   17:invokevirtual   #52  <Method ScrollingTabContainerView$TabView ScrollingTabContainerView.createTabView(android.support.v7.app.ActionBar$Tab, boolean)>
		//   10   20:areturn         
			} else
			{
				((TabView)view).bindTab((android.support.v7.app.ActionBar.Tab)getItem(i));
		//   11   21:aload_2         
		//   12   22:checkcast       #36  <Class ScrollingTabContainerView$TabView>
		//   13   25:aload_0         
		//   14   26:iload_1         
		//   15   27:invokevirtual   #46  <Method Object getItem(int)>
		//   16   30:checkcast       #48  <Class android.support.v7.app.ActionBar$Tab>
		//   17   33:invokevirtual   #56  <Method void ScrollingTabContainerView$TabView.bindTab(android.support.v7.app.ActionBar$Tab)>
				return view;
		//   18   36:aload_2         
		//   19   37:areturn         
			}
		}

		final ScrollingTabContainerView this$0;

		TabAdapter()
		{
			this$0 = ScrollingTabContainerView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ScrollingTabContainerView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void BaseAdapter()>
		//    5    9:return          
		}
	}

	private class TabClickListener
		implements android.view.View.OnClickListener
	{

		public void onClick(View view)
		{
			((TabView)view).getTab().select();
		//    0    0:aload_1         
		//    1    1:checkcast       #23  <Class ScrollingTabContainerView$TabView>
		//    2    4:invokevirtual   #27  <Method android.support.v7.app.ActionBar$Tab ScrollingTabContainerView$TabView.getTab()>
		//    3    7:invokevirtual   #32  <Method void android.support.v7.app.ActionBar$Tab.select()>
			int j = mTabLayout.getChildCount();
		//    4   10:aload_0         
		//    5   11:getfield        #15  <Field ScrollingTabContainerView this$0>
		//    6   14:getfield        #36  <Field LinearLayoutCompat ScrollingTabContainerView.mTabLayout>
		//    7   17:invokevirtual   #42  <Method int LinearLayoutCompat.getChildCount()>
		//    8   20:istore_3        
			int i = 0;
		//    9   21:iconst_0        
		//   10   22:istore_2        
			while(i < j) 
		//*  11   23:iload_2         
		//*  12   24:iload_3         
		//*  13   25:icmpge          70
			{
				View view1 = mTabLayout.getChildAt(i);
		//   14   28:aload_0         
		//   15   29:getfield        #15  <Field ScrollingTabContainerView this$0>
		//   16   32:getfield        #36  <Field LinearLayoutCompat ScrollingTabContainerView.mTabLayout>
		//   17   35:iload_2         
		//   18   36:invokevirtual   #46  <Method View LinearLayoutCompat.getChildAt(int)>
		//   19   39:astore          5
				boolean flag;
				if(view1 == view)
		//*  20   41:aload           5
		//*  21   43:aload_1         
		//*  22   44:if_acmpne       64
					flag = true;
		//   23   47:iconst_1        
		//   24   48:istore          4
				else
		//*  25   50:aload           5
		//*  26   52:iload           4
		//*  27   54:invokevirtual   #52  <Method void View.setSelected(boolean)>
		//*  28   57:iload_2         
		//*  29   58:iconst_1        
		//*  30   59:iadd            
		//*  31   60:istore_2        
		//*  32   61:goto            23
					flag = false;
		//   33   64:iconst_0        
		//   34   65:istore          4
				view1.setSelected(flag);
				i++;
			}
		//*  35   67:goto            50
		//   36   70:return          
		}

		final ScrollingTabContainerView this$0;

		TabClickListener()
		{
			this$0 = ScrollingTabContainerView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ScrollingTabContainerView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	private class TabView extends LinearLayoutCompat
	{

		public void bindTab(android.support.v7.app.ActionBar.Tab tab)
		{
			mTab = tab;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #37  <Field android.support.v7.app.ActionBar$Tab mTab>
			update();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #67  <Method void update()>
		//    5    9:return          
		}

		public android.support.v7.app.ActionBar.Tab getTab()
		{
			return mTab;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field android.support.v7.app.ActionBar$Tab mTab>
		//    2    4:areturn         
		}

		public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
		{
			super.onInitializeAccessibilityEvent(accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #76  <Method void LinearLayoutCompat.onInitializeAccessibilityEvent(AccessibilityEvent)>
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$Tab)).getName())));
		//    3    5:aload_1         
		//    4    6:ldc1            #78  <Class android.support.v7.app.ActionBar$Tab>
		//    5    8:invokevirtual   #84  <Method String Class.getName()>
		//    6   11:invokevirtual   #90  <Method void AccessibilityEvent.setClassName(CharSequence)>
		//    7   14:return          
		}

		public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
		{
			super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #94  <Method void LinearLayoutCompat.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
			accessibilitynodeinfo.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$Tab)).getName())));
		//    3    5:aload_1         
		//    4    6:ldc1            #78  <Class android.support.v7.app.ActionBar$Tab>
		//    5    8:invokevirtual   #84  <Method String Class.getName()>
		//    6   11:invokevirtual   #97  <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
		//    7   14:return          
		}

		public void onMeasure(int i, int j)
		{
			super.onMeasure(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #101 <Method void LinearLayoutCompat.onMeasure(int, int)>
			if(mMaxTabWidth > 0 && getMeasuredWidth() > mMaxTabWidth)
		//*   4    6:aload_0         
		//*   5    7:getfield        #23  <Field ScrollingTabContainerView this$0>
		//*   6   10:getfield        #104 <Field int ScrollingTabContainerView.mMaxTabWidth>
		//*   7   13:ifle            47
		//*   8   16:aload_0         
		//*   9   17:invokevirtual   #108 <Method int getMeasuredWidth()>
		//*  10   20:aload_0         
		//*  11   21:getfield        #23  <Field ScrollingTabContainerView this$0>
		//*  12   24:getfield        #104 <Field int ScrollingTabContainerView.mMaxTabWidth>
		//*  13   27:icmple          47
				super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(mMaxTabWidth, 0x40000000), j);
		//   14   30:aload_0         
		//   15   31:aload_0         
		//   16   32:getfield        #23  <Field ScrollingTabContainerView this$0>
		//   17   35:getfield        #104 <Field int ScrollingTabContainerView.mMaxTabWidth>
		//   18   38:ldc1            #109 <Int 0x40000000>
		//   19   40:invokestatic    #115 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   20   43:iload_2         
		//   21   44:invokespecial   #101 <Method void LinearLayoutCompat.onMeasure(int, int)>
		//   22   47:return          
		}

		public void setSelected(boolean flag)
		{
			boolean flag1;
			if(isSelected() != flag)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #121 <Method boolean isSelected()>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          29
				flag1 = true;
		//    4    8:iconst_1        
		//    5    9:istore_2        
			else
		//*   6   10:aload_0         
		//*   7   11:iload_1         
		//*   8   12:invokespecial   #123 <Method void LinearLayoutCompat.setSelected(boolean)>
		//*   9   15:iload_2         
		//*  10   16:ifeq            28
		//*  11   19:iload_1         
		//*  12   20:ifeq            28
		//*  13   23:aload_0         
		//*  14   24:iconst_4        
		//*  15   25:invokevirtual   #126 <Method void sendAccessibilityEvent(int)>
		//*  16   28:return          
				flag1 = false;
		//   17   29:iconst_0        
		//   18   30:istore_2        
			super.setSelected(flag);
			if(flag1 && flag)
				sendAccessibilityEvent(4);
		//*  19   31:goto            10
		}

		public void update()
		{
			Object obj = null;
		//    0    0:aconst_null     
		//    1    1:astore_2        
			android.support.v7.app.ActionBar.Tab tab = mTab;
		//    2    2:aload_0         
		//    3    3:getfield        #37  <Field android.support.v7.app.ActionBar$Tab mTab>
		//    4    6:astore_3        
			Object obj1 = ((Object) (tab.getCustomView()));
		//    5    7:aload_3         
		//    6    8:invokevirtual   #130 <Method View android.support.v7.app.ActionBar$Tab.getCustomView()>
		//    7   11:astore          4
			if(obj1 != null)
		//*   8   13:aload           4
		//*   9   15:ifnull          95
			{
				obj = ((Object) (((View) (obj1)).getParent()));
		//   10   18:aload           4
		//   11   20:invokevirtual   #136 <Method android.view.ViewParent View.getParent()>
		//   12   23:astore_2        
				if(obj != this)
		//*  13   24:aload_2         
		//*  14   25:aload_0         
		//*  15   26:if_acmpeq       48
				{
					if(obj != null)
		//*  16   29:aload_2         
		//*  17   30:ifnull          42
						((ViewGroup)obj).removeView(((View) (obj1)));
		//   18   33:aload_2         
		//   19   34:checkcast       #138 <Class ViewGroup>
		//   20   37:aload           4
		//   21   39:invokevirtual   #142 <Method void ViewGroup.removeView(View)>
					addView(((View) (obj1)));
		//   22   42:aload_0         
		//   23   43:aload           4
		//   24   45:invokevirtual   #145 <Method void addView(View)>
				}
				mCustomView = ((View) (obj1));
		//   25   48:aload_0         
		//   26   49:aload           4
		//   27   51:putfield        #147 <Field View mCustomView>
				if(mTextView != null)
		//*  28   54:aload_0         
		//*  29   55:getfield        #149 <Field TextView mTextView>
		//*  30   58:ifnull          70
					mTextView.setVisibility(8);
		//   31   61:aload_0         
		//   32   62:getfield        #149 <Field TextView mTextView>
		//   33   65:bipush          8
		//   34   67:invokevirtual   #154 <Method void TextView.setVisibility(int)>
				if(mIconView != null)
		//*  35   70:aload_0         
		//*  36   71:getfield        #156 <Field ImageView mIconView>
		//*  37   74:ifnull          94
				{
					mIconView.setVisibility(8);
		//   38   77:aload_0         
		//   39   78:getfield        #156 <Field ImageView mIconView>
		//   40   81:bipush          8
		//   41   83:invokevirtual   #159 <Method void ImageView.setVisibility(int)>
					mIconView.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
		//   42   86:aload_0         
		//   43   87:getfield        #156 <Field ImageView mIconView>
		//   44   90:aconst_null     
		//   45   91:invokevirtual   #162 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
				}
				return;
		//   46   94:return          
			}
			if(mCustomView != null)
		//*  47   95:aload_0         
		//*  48   96:getfield        #147 <Field View mCustomView>
		//*  49   99:ifnull          115
			{
				removeView(mCustomView);
		//   50  102:aload_0         
		//   51  103:aload_0         
		//   52  104:getfield        #147 <Field View mCustomView>
		//   53  107:invokevirtual   #163 <Method void removeView(View)>
				mCustomView = null;
		//   54  110:aload_0         
		//   55  111:aconst_null     
		//   56  112:putfield        #147 <Field View mCustomView>
			}
			android.graphics.drawable.Drawable drawable = tab.getIcon();
		//   57  115:aload_3         
		//   58  116:invokevirtual   #167 <Method android.graphics.drawable.Drawable android.support.v7.app.ActionBar$Tab.getIcon()>
		//   59  119:astore          5
			obj1 = ((Object) (tab.getText()));
		//   60  121:aload_3         
		//   61  122:invokevirtual   #171 <Method CharSequence android.support.v7.app.ActionBar$Tab.getText()>
		//   62  125:astore          4
			boolean flag;
			if(drawable != null)
		//*  63  127:aload           5
		//*  64  129:ifnull          339
			{
				if(mIconView == null)
		//*  65  132:aload_0         
		//*  66  133:getfield        #156 <Field ImageView mIconView>
		//*  67  136:ifnonnull       192
				{
					AppCompatImageView appcompatimageview = new AppCompatImageView(getContext());
		//   68  139:new             #173 <Class AppCompatImageView>
		//   69  142:dup             
		//   70  143:aload_0         
		//   71  144:invokevirtual   #177 <Method Context getContext()>
		//   72  147:invokespecial   #180 <Method void AppCompatImageView(Context)>
		//   73  150:astore          6
					LinearLayoutCompat.LayoutParams layoutparams1 = new LinearLayoutCompat.LayoutParams(-2, -2);
		//   74  152:new             #182 <Class LinearLayoutCompat$LayoutParams>
		//   75  155:dup             
		//   76  156:bipush          -2
		//   77  158:bipush          -2
		//   78  160:invokespecial   #184 <Method void LinearLayoutCompat$LayoutParams(int, int)>
		//   79  163:astore          7
					layoutparams1.gravity = 16;
		//   80  165:aload           7
		//   81  167:bipush          16
		//   82  169:putfield        #187 <Field int LinearLayoutCompat$LayoutParams.gravity>
					((ImageView) (appcompatimageview)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams1)));
		//   83  172:aload           6
		//   84  174:aload           7
		//   85  176:invokevirtual   #191 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
					addView(((View) (appcompatimageview)), 0);
		//   86  179:aload_0         
		//   87  180:aload           6
		//   88  182:iconst_0        
		//   89  183:invokevirtual   #194 <Method void addView(View, int)>
					mIconView = ((ImageView) (appcompatimageview));
		//   90  186:aload_0         
		//   91  187:aload           6
		//   92  189:putfield        #156 <Field ImageView mIconView>
				}
				mIconView.setImageDrawable(drawable);
		//   93  192:aload_0         
		//   94  193:getfield        #156 <Field ImageView mIconView>
		//   95  196:aload           5
		//   96  198:invokevirtual   #162 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
				mIconView.setVisibility(0);
		//   97  201:aload_0         
		//   98  202:getfield        #156 <Field ImageView mIconView>
		//   99  205:iconst_0        
		//  100  206:invokevirtual   #159 <Method void ImageView.setVisibility(int)>
			} else
		//* 101  209:aload           4
		//* 102  211:invokestatic    #200 <Method boolean TextUtils.isEmpty(CharSequence)>
		//* 103  214:ifne            366
		//* 104  217:iconst_1        
		//* 105  218:istore_1        
		//* 106  219:iload_1         
		//* 107  220:ifeq            371
		//* 108  223:aload_0         
		//* 109  224:getfield        #149 <Field TextView mTextView>
		//* 110  227:ifnonnull       294
		//* 111  230:new             #202 <Class AppCompatTextView>
		//* 112  233:dup             
		//* 113  234:aload_0         
		//* 114  235:invokevirtual   #177 <Method Context getContext()>
		//* 115  238:aconst_null     
		//* 116  239:getstatic       #205 <Field int android.support.v7.appcompat.R$attr.actionBarTabTextStyle>
		//* 117  242:invokespecial   #206 <Method void AppCompatTextView(Context, android.util.AttributeSet, int)>
		//* 118  245:astore          5
		//* 119  247:aload           5
		//* 120  249:getstatic       #212 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
		//* 121  252:invokevirtual   #216 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
		//* 122  255:new             #182 <Class LinearLayoutCompat$LayoutParams>
		//* 123  258:dup             
		//* 124  259:bipush          -2
		//* 125  261:bipush          -2
		//* 126  263:invokespecial   #184 <Method void LinearLayoutCompat$LayoutParams(int, int)>
		//* 127  266:astore          6
		//* 128  268:aload           6
		//* 129  270:bipush          16
		//* 130  272:putfield        #187 <Field int LinearLayoutCompat$LayoutParams.gravity>
		//* 131  275:aload           5
		//* 132  277:aload           6
		//* 133  279:invokevirtual   #217 <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		//* 134  282:aload_0         
		//* 135  283:aload           5
		//* 136  285:invokevirtual   #145 <Method void addView(View)>
		//* 137  288:aload_0         
		//* 138  289:aload           5
		//* 139  291:putfield        #149 <Field TextView mTextView>
		//* 140  294:aload_0         
		//* 141  295:getfield        #149 <Field TextView mTextView>
		//* 142  298:aload           4
		//* 143  300:invokevirtual   #220 <Method void TextView.setText(CharSequence)>
		//* 144  303:aload_0         
		//* 145  304:getfield        #149 <Field TextView mTextView>
		//* 146  307:iconst_0        
		//* 147  308:invokevirtual   #154 <Method void TextView.setVisibility(int)>
		//* 148  311:aload_0         
		//* 149  312:getfield        #156 <Field ImageView mIconView>
		//* 150  315:ifnull          329
		//* 151  318:aload_0         
		//* 152  319:getfield        #156 <Field ImageView mIconView>
		//* 153  322:aload_3         
		//* 154  323:invokevirtual   #223 <Method CharSequence android.support.v7.app.ActionBar$Tab.getContentDescription()>
		//* 155  326:invokevirtual   #226 <Method void ImageView.setContentDescription(CharSequence)>
		//* 156  329:iload_1         
		//* 157  330:ifeq            398
		//* 158  333:aload_0         
		//* 159  334:aload_2         
		//* 160  335:invokestatic    #232 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
		//* 161  338:return          
			if(mIconView != null)
		//* 162  339:aload_0         
		//* 163  340:getfield        #156 <Field ImageView mIconView>
		//* 164  343:ifnull          209
			{
				mIconView.setVisibility(8);
		//  165  346:aload_0         
		//  166  347:getfield        #156 <Field ImageView mIconView>
		//  167  350:bipush          8
		//  168  352:invokevirtual   #159 <Method void ImageView.setVisibility(int)>
				mIconView.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
		//  169  355:aload_0         
		//  170  356:getfield        #156 <Field ImageView mIconView>
		//  171  359:aconst_null     
		//  172  360:invokevirtual   #162 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			}
			if(!TextUtils.isEmpty(((CharSequence) (obj1))))
				flag = true;
			else
		//* 173  363:goto            209
				flag = false;
		//  174  366:iconst_0        
		//  175  367:istore_1        
			if(flag)
			{
				if(mTextView == null)
				{
					AppCompatTextView appcompattextview = new AppCompatTextView(getContext(), ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.attr.actionBarTabTextStyle);
					((TextView) (appcompattextview)).setEllipsize(android.text.TextUtils.TruncateAt.END);
					LinearLayoutCompat.LayoutParams layoutparams = new LinearLayoutCompat.LayoutParams(-2, -2);
					layoutparams.gravity = 16;
					((TextView) (appcompattextview)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
					addView(((View) (appcompattextview)));
					mTextView = ((TextView) (appcompattextview));
				}
				mTextView.setText(((CharSequence) (obj1)));
				mTextView.setVisibility(0);
			} else
		//* 176  368:goto            219
			if(mTextView != null)
		//* 177  371:aload_0         
		//* 178  372:getfield        #149 <Field TextView mTextView>
		//* 179  375:ifnull          311
			{
				mTextView.setVisibility(8);
		//  180  378:aload_0         
		//  181  379:getfield        #149 <Field TextView mTextView>
		//  182  382:bipush          8
		//  183  384:invokevirtual   #154 <Method void TextView.setVisibility(int)>
				mTextView.setText(((CharSequence) (null)));
		//  184  387:aload_0         
		//  185  388:getfield        #149 <Field TextView mTextView>
		//  186  391:aconst_null     
		//  187  392:invokevirtual   #220 <Method void TextView.setText(CharSequence)>
			}
			if(mIconView != null)
				mIconView.setContentDescription(tab.getContentDescription());
			if(!flag)
		//* 188  395:goto            311
				obj = ((Object) (tab.getContentDescription()));
		//  189  398:aload_3         
		//  190  399:invokevirtual   #223 <Method CharSequence android.support.v7.app.ActionBar$Tab.getContentDescription()>
		//  191  402:astore_2        
			TooltipCompat.setTooltipText(((View) (this)), ((CharSequence) (obj)));
		//* 192  403:goto            333
		}

		private final int BG_ATTRS[] = {
			0x10100d4
		};
		private View mCustomView;
		private ImageView mIconView;
		private android.support.v7.app.ActionBar.Tab mTab;
		private TextView mTextView;
		final ScrollingTabContainerView this$0;

		public TabView(Context context, android.support.v7.app.ActionBar.Tab tab, boolean flag)
		{
			this$0 = ScrollingTabContainerView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field ScrollingTabContainerView this$0>
			super(context, ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.attr.actionBarTabStyle);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:aconst_null     
		//    6    8:getstatic       #29  <Field int android.support.v7.appcompat.R$attr.actionBarTabStyle>
		//    7   11:invokespecial   #32  <Method void LinearLayoutCompat(Context, android.util.AttributeSet, int)>
		//    8   14:aload_0         
		//    9   15:iconst_1        
		//   10   16:newarray        int[]
		//   11   18:dup             
		//   12   19:iconst_0        
		//   13   20:ldc1            #33  <Int 0x10100d4>
		//   14   22:iastore         
		//   15   23:putfield        #35  <Field int[] BG_ATTRS>
			mTab = tab;
		//   16   26:aload_0         
		//   17   27:aload_3         
		//   18   28:putfield        #37  <Field android.support.v7.app.ActionBar$Tab mTab>
			scrollingtabcontainerview = ((ScrollingTabContainerView) (TintTypedArray.obtainStyledAttributes(context, ((android.util.AttributeSet) (null)), BG_ATTRS, android.support.v7.appcompat.R.attr.actionBarTabStyle, 0)));
		//   19   31:aload_2         
		//   20   32:aconst_null     
		//   21   33:aload_0         
		//   22   34:getfield        #35  <Field int[] BG_ATTRS>
		//   23   37:getstatic       #29  <Field int android.support.v7.appcompat.R$attr.actionBarTabStyle>
		//   24   40:iconst_0        
		//   25   41:invokestatic    #43  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, android.util.AttributeSet, int[], int, int)>
		//   26   44:astore_1        
			if(hasValue(0))
		//*  27   45:aload_1         
		//*  28   46:iconst_0        
		//*  29   47:invokevirtual   #47  <Method boolean TintTypedArray.hasValue(int)>
		//*  30   50:ifeq            62
				setBackgroundDrawable(getDrawable(0));
		//   31   53:aload_0         
		//   32   54:aload_1         
		//   33   55:iconst_0        
		//   34   56:invokevirtual   #51  <Method android.graphics.drawable.Drawable TintTypedArray.getDrawable(int)>
		//   35   59:invokevirtual   #55  <Method void setBackgroundDrawable(android.graphics.drawable.Drawable)>
			recycle();
		//   36   62:aload_1         
		//   37   63:invokevirtual   #59  <Method void TintTypedArray.recycle()>
			if(flag)
		//*  38   66:iload           4
		//*  39   68:ifeq            77
				setGravity(0x800013);
		//   40   71:aload_0         
		//   41   72:ldc1            #60  <Int 0x800013>
		//   42   74:invokevirtual   #64  <Method void setGravity(int)>
			update();
		//   43   77:aload_0         
		//   44   78:invokevirtual   #67  <Method void update()>
		//   45   81:return          
		}
	}

	protected class VisibilityAnimListener extends AnimatorListenerAdapter
	{

		public void onAnimationCancel(Animator animator)
		{
			mCanceled = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #22  <Field boolean mCanceled>
		//    3    5:return          
		}

		public void onAnimationEnd(Animator animator)
		{
			if(mCanceled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field boolean mCanceled>
		//*   2    4:ifeq            8
			{
				return;
		//    3    7:return          
			} else
			{
				mVisibilityAnim = null;
		//    4    8:aload_0         
		//    5    9:getfield        #17  <Field ScrollingTabContainerView this$0>
		//    6   12:aconst_null     
		//    7   13:putfield        #30  <Field ViewPropertyAnimator ScrollingTabContainerView.mVisibilityAnim>
				setVisibility(mFinalVisibility);
		//    8   16:aload_0         
		//    9   17:getfield        #17  <Field ScrollingTabContainerView this$0>
		//   10   20:aload_0         
		//   11   21:getfield        #32  <Field int mFinalVisibility>
		//   12   24:invokevirtual   #36  <Method void ScrollingTabContainerView.setVisibility(int)>
				return;
		//   13   27:return          
			}
		}

		public void onAnimationStart(Animator animator)
		{
			setVisibility(0);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ScrollingTabContainerView this$0>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #36  <Method void ScrollingTabContainerView.setVisibility(int)>
			mCanceled = false;
		//    4    8:aload_0         
		//    5    9:iconst_0        
		//    6   10:putfield        #22  <Field boolean mCanceled>
		//    7   13:return          
		}

		public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimator viewpropertyanimator, int i)
		{
			mFinalVisibility = i;
		//    0    0:aload_0         
		//    1    1:iload_2         
		//    2    2:putfield        #32  <Field int mFinalVisibility>
			mVisibilityAnim = viewpropertyanimator;
		//    3    5:aload_0         
		//    4    6:getfield        #17  <Field ScrollingTabContainerView this$0>
		//    5    9:aload_1         
		//    6   10:putfield        #30  <Field ViewPropertyAnimator ScrollingTabContainerView.mVisibilityAnim>
			return this;
		//    7   13:aload_0         
		//    8   14:areturn         
		}

		private boolean mCanceled;
		private int mFinalVisibility;
		final ScrollingTabContainerView this$0;

		protected VisibilityAnimListener()
		{
			this$0 = ScrollingTabContainerView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field ScrollingTabContainerView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void AnimatorListenerAdapter()>
			mCanceled = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #22  <Field boolean mCanceled>
		//    8   14:return          
		}
	}


	public ScrollingTabContainerView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #64  <Method void HorizontalScrollView(Context)>
	//    3    5:aload_0         
	//    4    6:new             #19  <Class ScrollingTabContainerView$VisibilityAnimListener>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #67  <Method void ScrollingTabContainerView$VisibilityAnimListener(ScrollingTabContainerView)>
	//    8   14:putfield        #69  <Field ScrollingTabContainerView$VisibilityAnimListener mVisAnimListener>
		setHorizontalScrollBarEnabled(false);
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #73  <Method void setHorizontalScrollBarEnabled(boolean)>
		context = ((Context) (ActionBarPolicy.get(context)));
	//   12   22:aload_1         
	//   13   23:invokestatic    #79  <Method ActionBarPolicy ActionBarPolicy.get(Context)>
	//   14   26:astore_1        
		setContentHeight(((ActionBarPolicy) (context)).getTabContainerHeight());
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #83  <Method int ActionBarPolicy.getTabContainerHeight()>
	//   18   32:invokevirtual   #87  <Method void setContentHeight(int)>
		mStackedTabMaxWidth = ((ActionBarPolicy) (context)).getStackedTabMaxWidth();
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #90  <Method int ActionBarPolicy.getStackedTabMaxWidth()>
	//   22   40:putfield        #92  <Field int mStackedTabMaxWidth>
		mTabLayout = createTabLayout();
	//   23   43:aload_0         
	//   24   44:aload_0         
	//   25   45:invokespecial   #96  <Method LinearLayoutCompat createTabLayout()>
	//   26   48:putfield        #98  <Field LinearLayoutCompat mTabLayout>
		addView(((View) (mTabLayout)), new android.view.ViewGroup.LayoutParams(-2, -1));
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #98  <Field LinearLayoutCompat mTabLayout>
	//   30   56:new             #100 <Class android.view.ViewGroup$LayoutParams>
	//   31   59:dup             
	//   32   60:bipush          -2
	//   33   62:iconst_m1       
	//   34   63:invokespecial   #103 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   35   66:invokevirtual   #107 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
	//   36   69:return          
	}

	private Spinner createSpinner()
	{
		AppCompatSpinner appcompatspinner = new AppCompatSpinner(getContext(), ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.attr.actionDropDownStyle);
	//    0    0:new             #111 <Class AppCompatSpinner>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #115 <Method Context getContext()>
	//    4    8:aconst_null     
	//    5    9:getstatic       #120 <Field int android.support.v7.appcompat.R$attr.actionDropDownStyle>
	//    6   12:invokespecial   #123 <Method void AppCompatSpinner(Context, android.util.AttributeSet, int)>
	//    7   15:astore_1        
		((Spinner) (appcompatspinner)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new LinearLayoutCompat.LayoutParams(-2, -1))));
	//    8   16:aload_1         
	//    9   17:new             #125 <Class LinearLayoutCompat$LayoutParams>
	//   10   20:dup             
	//   11   21:bipush          -2
	//   12   23:iconst_m1       
	//   13   24:invokespecial   #126 <Method void LinearLayoutCompat$LayoutParams(int, int)>
	//   14   27:invokevirtual   #132 <Method void Spinner.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		((Spinner) (appcompatspinner)).setOnItemSelectedListener(((android.widget.AdapterView.OnItemSelectedListener) (this)));
	//   15   30:aload_1         
	//   16   31:aload_0         
	//   17   32:invokevirtual   #136 <Method void Spinner.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
		return ((Spinner) (appcompatspinner));
	//   18   35:aload_1         
	//   19   36:areturn         
	}

	private LinearLayoutCompat createTabLayout()
	{
		LinearLayoutCompat linearlayoutcompat = new LinearLayoutCompat(getContext(), ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.attr.actionBarTabBarStyle);
	//    0    0:new             #138 <Class LinearLayoutCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #115 <Method Context getContext()>
	//    4    8:aconst_null     
	//    5    9:getstatic       #141 <Field int android.support.v7.appcompat.R$attr.actionBarTabBarStyle>
	//    6   12:invokespecial   #142 <Method void LinearLayoutCompat(Context, android.util.AttributeSet, int)>
	//    7   15:astore_1        
		linearlayoutcompat.setMeasureWithLargestChildEnabled(true);
	//    8   16:aload_1         
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #145 <Method void LinearLayoutCompat.setMeasureWithLargestChildEnabled(boolean)>
		linearlayoutcompat.setGravity(17);
	//   11   21:aload_1         
	//   12   22:bipush          17
	//   13   24:invokevirtual   #148 <Method void LinearLayoutCompat.setGravity(int)>
		linearlayoutcompat.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new LinearLayoutCompat.LayoutParams(-2, -1))));
	//   14   27:aload_1         
	//   15   28:new             #125 <Class LinearLayoutCompat$LayoutParams>
	//   16   31:dup             
	//   17   32:bipush          -2
	//   18   34:iconst_m1       
	//   19   35:invokespecial   #126 <Method void LinearLayoutCompat$LayoutParams(int, int)>
	//   20   38:invokevirtual   #149 <Method void LinearLayoutCompat.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		return linearlayoutcompat;
	//   21   41:aload_1         
	//   22   42:areturn         
	}

	private boolean isCollapsed()
	{
		return mTabSpinner != null && mTabSpinner.getParent() == this;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field Spinner mTabSpinner>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Spinner mTabSpinner>
	//    5   11:invokevirtual   #157 <Method android.view.ViewParent Spinner.getParent()>
	//    6   14:aload_0         
	//    7   15:if_acmpne       20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	private void performCollapse()
	{
		if(isCollapsed())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #160 <Method boolean isCollapsed()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(mTabSpinner == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #153 <Field Spinner mTabSpinner>
	//*   6   12:ifnonnull       23
			mTabSpinner = createSpinner();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokespecial   #162 <Method Spinner createSpinner()>
	//   10   20:putfield        #153 <Field Spinner mTabSpinner>
		removeView(((View) (mTabLayout)));
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #98  <Field LinearLayoutCompat mTabLayout>
	//   14   28:invokevirtual   #166 <Method void removeView(View)>
		addView(((View) (mTabSpinner)), new android.view.ViewGroup.LayoutParams(-2, -1));
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #153 <Field Spinner mTabSpinner>
	//   18   36:new             #100 <Class android.view.ViewGroup$LayoutParams>
	//   19   39:dup             
	//   20   40:bipush          -2
	//   21   42:iconst_m1       
	//   22   43:invokespecial   #103 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   23   46:invokevirtual   #107 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
		if(mTabSpinner.getAdapter() == null)
	//*  24   49:aload_0         
	//*  25   50:getfield        #153 <Field Spinner mTabSpinner>
	//*  26   53:invokevirtual   #170 <Method android.widget.SpinnerAdapter Spinner.getAdapter()>
	//*  27   56:ifnonnull       74
			mTabSpinner.setAdapter(((android.widget.SpinnerAdapter) (new TabAdapter())));
	//   28   59:aload_0         
	//   29   60:getfield        #153 <Field Spinner mTabSpinner>
	//   30   63:new             #10  <Class ScrollingTabContainerView$TabAdapter>
	//   31   66:dup             
	//   32   67:aload_0         
	//   33   68:invokespecial   #171 <Method void ScrollingTabContainerView$TabAdapter(ScrollingTabContainerView)>
	//   34   71:invokevirtual   #175 <Method void Spinner.setAdapter(android.widget.SpinnerAdapter)>
		if(mTabSelector != null)
	//*  35   74:aload_0         
	//*  36   75:getfield        #177 <Field Runnable mTabSelector>
	//*  37   78:ifnull          95
		{
			removeCallbacks(mTabSelector);
	//   38   81:aload_0         
	//   39   82:aload_0         
	//   40   83:getfield        #177 <Field Runnable mTabSelector>
	//   41   86:invokevirtual   #181 <Method boolean removeCallbacks(Runnable)>
	//   42   89:pop             
			mTabSelector = null;
	//   43   90:aload_0         
	//   44   91:aconst_null     
	//   45   92:putfield        #177 <Field Runnable mTabSelector>
		}
		mTabSpinner.setSelection(mSelectedTabIndex);
	//   46   95:aload_0         
	//   47   96:getfield        #153 <Field Spinner mTabSpinner>
	//   48   99:aload_0         
	//   49  100:getfield        #183 <Field int mSelectedTabIndex>
	//   50  103:invokevirtual   #186 <Method void Spinner.setSelection(int)>
	//   51  106:return          
	}

	private boolean performExpand()
	{
		if(!isCollapsed())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #160 <Method boolean isCollapsed()>
	//*   2    4:ifne            9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			removeView(((View) (mTabSpinner)));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #153 <Field Spinner mTabSpinner>
	//    8   14:invokevirtual   #166 <Method void removeView(View)>
			addView(((View) (mTabLayout)), new android.view.ViewGroup.LayoutParams(-2, -1));
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #98  <Field LinearLayoutCompat mTabLayout>
	//   12   22:new             #100 <Class android.view.ViewGroup$LayoutParams>
	//   13   25:dup             
	//   14   26:bipush          -2
	//   15   28:iconst_m1       
	//   16   29:invokespecial   #103 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   17   32:invokevirtual   #107 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
			setTabSelected(mTabSpinner.getSelectedItemPosition());
	//   18   35:aload_0         
	//   19   36:aload_0         
	//   20   37:getfield        #153 <Field Spinner mTabSpinner>
	//   21   40:invokevirtual   #190 <Method int Spinner.getSelectedItemPosition()>
	//   22   43:invokevirtual   #193 <Method void setTabSelected(int)>
			return false;
	//   23   46:iconst_0        
	//   24   47:ireturn         
		}
	}

	public void addTab(android.support.v7.app.ActionBar.Tab tab, int i, boolean flag)
	{
		tab = ((android.support.v7.app.ActionBar.Tab) (createTabView(tab, false)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #199 <Method ScrollingTabContainerView$TabView createTabView(android.support.v7.app.ActionBar$Tab, boolean)>
	//    4    6:astore_1        
		mTabLayout.addView(((View) (tab)), i, ((android.view.ViewGroup.LayoutParams) (new LinearLayoutCompat.LayoutParams(0, -1, 1.0F))));
	//    5    7:aload_0         
	//    6    8:getfield        #98  <Field LinearLayoutCompat mTabLayout>
	//    7   11:aload_1         
	//    8   12:iload_2         
	//    9   13:new             #125 <Class LinearLayoutCompat$LayoutParams>
	//   10   16:dup             
	//   11   17:iconst_0        
	//   12   18:iconst_m1       
	//   13   19:fconst_1        
	//   14   20:invokespecial   #202 <Method void LinearLayoutCompat$LayoutParams(int, int, float)>
	//   15   23:invokevirtual   #205 <Method void LinearLayoutCompat.addView(View, int, android.view.ViewGroup$LayoutParams)>
		if(mTabSpinner != null)
	//*  16   26:aload_0         
	//*  17   27:getfield        #153 <Field Spinner mTabSpinner>
	//*  18   30:ifnull          46
			((TabAdapter)mTabSpinner.getAdapter()).notifyDataSetChanged();
	//   19   33:aload_0         
	//   20   34:getfield        #153 <Field Spinner mTabSpinner>
	//   21   37:invokevirtual   #170 <Method android.widget.SpinnerAdapter Spinner.getAdapter()>
	//   22   40:checkcast       #10  <Class ScrollingTabContainerView$TabAdapter>
	//   23   43:invokevirtual   #208 <Method void ScrollingTabContainerView$TabAdapter.notifyDataSetChanged()>
		if(flag)
	//*  24   46:iload_3         
	//*  25   47:ifeq            55
			((TabView) (tab)).setSelected(true);
	//   26   50:aload_1         
	//   27   51:iconst_1        
	//   28   52:invokevirtual   #211 <Method void ScrollingTabContainerView$TabView.setSelected(boolean)>
		if(mAllowCollapse)
	//*  29   55:aload_0         
	//*  30   56:getfield        #213 <Field boolean mAllowCollapse>
	//*  31   59:ifeq            66
			requestLayout();
	//   32   62:aload_0         
	//   33   63:invokevirtual   #216 <Method void requestLayout()>
	//   34   66:return          
	}

	public void addTab(android.support.v7.app.ActionBar.Tab tab, boolean flag)
	{
		tab = ((android.support.v7.app.ActionBar.Tab) (createTabView(tab, false)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #199 <Method ScrollingTabContainerView$TabView createTabView(android.support.v7.app.ActionBar$Tab, boolean)>
	//    4    6:astore_1        
		mTabLayout.addView(((View) (tab)), ((android.view.ViewGroup.LayoutParams) (new LinearLayoutCompat.LayoutParams(0, -1, 1.0F))));
	//    5    7:aload_0         
	//    6    8:getfield        #98  <Field LinearLayoutCompat mTabLayout>
	//    7   11:aload_1         
	//    8   12:new             #125 <Class LinearLayoutCompat$LayoutParams>
	//    9   15:dup             
	//   10   16:iconst_0        
	//   11   17:iconst_m1       
	//   12   18:fconst_1        
	//   13   19:invokespecial   #202 <Method void LinearLayoutCompat$LayoutParams(int, int, float)>
	//   14   22:invokevirtual   #218 <Method void LinearLayoutCompat.addView(View, android.view.ViewGroup$LayoutParams)>
		if(mTabSpinner != null)
	//*  15   25:aload_0         
	//*  16   26:getfield        #153 <Field Spinner mTabSpinner>
	//*  17   29:ifnull          45
			((TabAdapter)mTabSpinner.getAdapter()).notifyDataSetChanged();
	//   18   32:aload_0         
	//   19   33:getfield        #153 <Field Spinner mTabSpinner>
	//   20   36:invokevirtual   #170 <Method android.widget.SpinnerAdapter Spinner.getAdapter()>
	//   21   39:checkcast       #10  <Class ScrollingTabContainerView$TabAdapter>
	//   22   42:invokevirtual   #208 <Method void ScrollingTabContainerView$TabAdapter.notifyDataSetChanged()>
		if(flag)
	//*  23   45:iload_2         
	//*  24   46:ifeq            54
			((TabView) (tab)).setSelected(true);
	//   25   49:aload_1         
	//   26   50:iconst_1        
	//   27   51:invokevirtual   #211 <Method void ScrollingTabContainerView$TabView.setSelected(boolean)>
		if(mAllowCollapse)
	//*  28   54:aload_0         
	//*  29   55:getfield        #213 <Field boolean mAllowCollapse>
	//*  30   58:ifeq            65
			requestLayout();
	//   31   61:aload_0         
	//   32   62:invokevirtual   #216 <Method void requestLayout()>
	//   33   65:return          
	}

	public void animateToTab(int i)
	{
		final View tabView = mTabLayout.getChildAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field LinearLayoutCompat mTabLayout>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #223 <Method View LinearLayoutCompat.getChildAt(int)>
	//    4    8:astore_2        
		if(mTabSelector != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #177 <Field Runnable mTabSelector>
	//*   7   13:ifnull          25
			removeCallbacks(mTabSelector);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #177 <Field Runnable mTabSelector>
	//   11   21:invokevirtual   #181 <Method boolean removeCallbacks(Runnable)>
	//   12   24:pop             
		mTabSelector = new Runnable() {

			public void run()
			{
				int j = tabView.getLeft();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field View val$tabView>
			//    2    4:invokevirtual   #32  <Method int View.getLeft()>
			//    3    7:istore_1        
				int k = (getWidth() - tabView.getWidth()) / 2;
			//    4    8:aload_0         
			//    5    9:getfield        #19  <Field ScrollingTabContainerView this$0>
			//    6   12:invokevirtual   #35  <Method int ScrollingTabContainerView.getWidth()>
			//    7   15:aload_0         
			//    8   16:getfield        #21  <Field View val$tabView>
			//    9   19:invokevirtual   #36  <Method int View.getWidth()>
			//   10   22:isub            
			//   11   23:iconst_2        
			//   12   24:idiv            
			//   13   25:istore_2        
				smoothScrollTo(j - k, 0);
			//   14   26:aload_0         
			//   15   27:getfield        #19  <Field ScrollingTabContainerView this$0>
			//   16   30:iload_1         
			//   17   31:iload_2         
			//   18   32:isub            
			//   19   33:iconst_0        
			//   20   34:invokevirtual   #40  <Method void ScrollingTabContainerView.smoothScrollTo(int, int)>
				mTabSelector = null;
			//   21   37:aload_0         
			//   22   38:getfield        #19  <Field ScrollingTabContainerView this$0>
			//   23   41:aconst_null     
			//   24   42:putfield        #44  <Field Runnable ScrollingTabContainerView.mTabSelector>
			//   25   45:return          
			}

			final ScrollingTabContainerView this$0;
			final View val$tabView;

			
			{
				this$0 = ScrollingTabContainerView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ScrollingTabContainerView this$0>
				tabView = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field View val$tabView>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//   13   25:aload_0         
	//   14   26:new             #8   <Class ScrollingTabContainerView$1>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:invokespecial   #226 <Method void ScrollingTabContainerView$1(ScrollingTabContainerView, View)>
	//   19   35:putfield        #177 <Field Runnable mTabSelector>
		post(mTabSelector);
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #177 <Field Runnable mTabSelector>
	//   23   43:invokevirtual   #229 <Method boolean post(Runnable)>
	//   24   46:pop             
	//   25   47:return          
	}

	public void animateToVisibility(int i)
	{
		if(mVisibilityAnim != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #232 <Field ViewPropertyAnimator mVisibilityAnim>
	//*   2    4:ifnull          14
			mVisibilityAnim.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #232 <Field ViewPropertyAnimator mVisibilityAnim>
	//    5   11:invokevirtual   #237 <Method void ViewPropertyAnimator.cancel()>
		if(i == 0)
	//*   6   14:iload_1         
	//*   7   15:ifne            74
		{
			if(getVisibility() != 0)
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #240 <Method int getVisibility()>
	//*  10   22:ifeq            30
				setAlpha(0.0F);
	//   11   25:aload_0         
	//   12   26:fconst_0        
	//   13   27:invokevirtual   #244 <Method void setAlpha(float)>
			ViewPropertyAnimator viewpropertyanimator = animate().alpha(1.0F);
	//   14   30:aload_0         
	//   15   31:invokevirtual   #248 <Method ViewPropertyAnimator animate()>
	//   16   34:fconst_1        
	//   17   35:invokevirtual   #252 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   18   38:astore_2        
			viewpropertyanimator.setDuration(200L);
	//   19   39:aload_2         
	//   20   40:ldc2w           #253 <Long 200L>
	//   21   43:invokevirtual   #258 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   22   46:pop             
			viewpropertyanimator.setInterpolator(((android.animation.TimeInterpolator) (sAlphaInterpolator)));
	//   23   47:aload_2         
	//   24   48:getstatic       #60  <Field Interpolator sAlphaInterpolator>
	//   25   51:invokevirtual   #262 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   26   54:pop             
			viewpropertyanimator.setListener(((android.animation.Animator.AnimatorListener) (mVisAnimListener.withFinalVisibility(viewpropertyanimator, i))));
	//   27   55:aload_2         
	//   28   56:aload_0         
	//   29   57:getfield        #69  <Field ScrollingTabContainerView$VisibilityAnimListener mVisAnimListener>
	//   30   60:aload_2         
	//   31   61:iload_1         
	//   32   62:invokevirtual   #266 <Method ScrollingTabContainerView$VisibilityAnimListener ScrollingTabContainerView$VisibilityAnimListener.withFinalVisibility(ViewPropertyAnimator, int)>
	//   33   65:invokevirtual   #270 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   34   68:pop             
			viewpropertyanimator.start();
	//   35   69:aload_2         
	//   36   70:invokevirtual   #273 <Method void ViewPropertyAnimator.start()>
			return;
	//   37   73:return          
		} else
		{
			ViewPropertyAnimator viewpropertyanimator1 = animate().alpha(0.0F);
	//   38   74:aload_0         
	//   39   75:invokevirtual   #248 <Method ViewPropertyAnimator animate()>
	//   40   78:fconst_0        
	//   41   79:invokevirtual   #252 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   42   82:astore_2        
			viewpropertyanimator1.setDuration(200L);
	//   43   83:aload_2         
	//   44   84:ldc2w           #253 <Long 200L>
	//   45   87:invokevirtual   #258 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   46   90:pop             
			viewpropertyanimator1.setInterpolator(((android.animation.TimeInterpolator) (sAlphaInterpolator)));
	//   47   91:aload_2         
	//   48   92:getstatic       #60  <Field Interpolator sAlphaInterpolator>
	//   49   95:invokevirtual   #262 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   50   98:pop             
			viewpropertyanimator1.setListener(((android.animation.Animator.AnimatorListener) (mVisAnimListener.withFinalVisibility(viewpropertyanimator1, i))));
	//   51   99:aload_2         
	//   52  100:aload_0         
	//   53  101:getfield        #69  <Field ScrollingTabContainerView$VisibilityAnimListener mVisAnimListener>
	//   54  104:aload_2         
	//   55  105:iload_1         
	//   56  106:invokevirtual   #266 <Method ScrollingTabContainerView$VisibilityAnimListener ScrollingTabContainerView$VisibilityAnimListener.withFinalVisibility(ViewPropertyAnimator, int)>
	//   57  109:invokevirtual   #270 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   58  112:pop             
			viewpropertyanimator1.start();
	//   59  113:aload_2         
	//   60  114:invokevirtual   #273 <Method void ViewPropertyAnimator.start()>
			return;
	//   61  117:return          
		}
	}

	TabView createTabView(android.support.v7.app.ActionBar.Tab tab, boolean flag)
	{
		tab = ((android.support.v7.app.ActionBar.Tab) (new TabView(getContext(), tab, flag)));
	//    0    0:new             #16  <Class ScrollingTabContainerView$TabView>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #115 <Method Context getContext()>
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokespecial   #276 <Method void ScrollingTabContainerView$TabView(ScrollingTabContainerView, Context, android.support.v7.app.ActionBar$Tab, boolean)>
	//    8   14:astore_1        
		if(flag)
	//*   9   15:iload_2         
	//*  10   16:ifeq            42
		{
			((TabView) (tab)).setBackgroundDrawable(((android.graphics.drawable.Drawable) (null)));
	//   11   19:aload_1         
	//   12   20:aconst_null     
	//   13   21:invokevirtual   #280 <Method void ScrollingTabContainerView$TabView.setBackgroundDrawable(android.graphics.drawable.Drawable)>
			((TabView) (tab)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.AbsListView.LayoutParams(-1, mContentHeight))));
	//   14   24:aload_1         
	//   15   25:new             #282 <Class android.widget.AbsListView$LayoutParams>
	//   16   28:dup             
	//   17   29:iconst_m1       
	//   18   30:aload_0         
	//   19   31:getfield        #284 <Field int mContentHeight>
	//   20   34:invokespecial   #285 <Method void android.widget.AbsListView$LayoutParams(int, int)>
	//   21   37:invokevirtual   #286 <Method void ScrollingTabContainerView$TabView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			return ((TabView) (tab));
	//   22   40:aload_1         
	//   23   41:areturn         
		}
		((TabView) (tab)).setFocusable(true);
	//   24   42:aload_1         
	//   25   43:iconst_1        
	//   26   44:invokevirtual   #289 <Method void ScrollingTabContainerView$TabView.setFocusable(boolean)>
		if(mTabClickListener == null)
	//*  27   47:aload_0         
	//*  28   48:getfield        #291 <Field ScrollingTabContainerView$TabClickListener mTabClickListener>
	//*  29   51:ifnonnull       66
			mTabClickListener = new TabClickListener();
	//   30   54:aload_0         
	//   31   55:new             #13  <Class ScrollingTabContainerView$TabClickListener>
	//   32   58:dup             
	//   33   59:aload_0         
	//   34   60:invokespecial   #292 <Method void ScrollingTabContainerView$TabClickListener(ScrollingTabContainerView)>
	//   35   63:putfield        #291 <Field ScrollingTabContainerView$TabClickListener mTabClickListener>
		((TabView) (tab)).setOnClickListener(((android.view.View.OnClickListener) (mTabClickListener)));
	//   36   66:aload_1         
	//   37   67:aload_0         
	//   38   68:getfield        #291 <Field ScrollingTabContainerView$TabClickListener mTabClickListener>
	//   39   71:invokevirtual   #296 <Method void ScrollingTabContainerView$TabView.setOnClickListener(android.view.View$OnClickListener)>
		return ((TabView) (tab));
	//   40   74:aload_1         
	//   41   75:areturn         
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #299 <Method void HorizontalScrollView.onAttachedToWindow()>
		if(mTabSelector != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #177 <Field Runnable mTabSelector>
	//*   4    8:ifnull          20
			post(mTabSelector);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #177 <Field Runnable mTabSelector>
	//    8   16:invokevirtual   #229 <Method boolean post(Runnable)>
	//    9   19:pop             
	//   10   20:return          
	}

	protected void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #303 <Method void HorizontalScrollView.onConfigurationChanged(Configuration)>
		configuration = ((Configuration) (ActionBarPolicy.get(getContext())));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #115 <Method Context getContext()>
	//    5    9:invokestatic    #79  <Method ActionBarPolicy ActionBarPolicy.get(Context)>
	//    6   12:astore_1        
		setContentHeight(((ActionBarPolicy) (configuration)).getTabContainerHeight());
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #83  <Method int ActionBarPolicy.getTabContainerHeight()>
	//   10   18:invokevirtual   #87  <Method void setContentHeight(int)>
		mStackedTabMaxWidth = ((ActionBarPolicy) (configuration)).getStackedTabMaxWidth();
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #90  <Method int ActionBarPolicy.getStackedTabMaxWidth()>
	//   14   26:putfield        #92  <Field int mStackedTabMaxWidth>
	//   15   29:return          
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #306 <Method void HorizontalScrollView.onDetachedFromWindow()>
		if(mTabSelector != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #177 <Field Runnable mTabSelector>
	//*   4    8:ifnull          20
			removeCallbacks(mTabSelector);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #177 <Field Runnable mTabSelector>
	//    8   16:invokevirtual   #181 <Method boolean removeCallbacks(Runnable)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void onItemSelected(AdapterView adapterview, View view, int i, long l)
	{
		((TabView)view).getTab().select();
	//    0    0:aload_2         
	//    1    1:checkcast       #16  <Class ScrollingTabContainerView$TabView>
	//    2    4:invokevirtual   #312 <Method android.support.v7.app.ActionBar$Tab ScrollingTabContainerView$TabView.getTab()>
	//    3    7:invokevirtual   #317 <Method void android.support.v7.app.ActionBar$Tab.select()>
	//    4   10:return          
	}

	public void onMeasure(int i, int j)
	{
		j = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #326 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_2        
		int k;
		boolean flag;
		if(j == 0x40000000)
	//*   3    5:iload_2         
	//*   4    6:ldc2            #327 <Int 0x40000000>
	//*   5    9:icmpne          173
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore          4
		else
	//*   8   15:aload_0         
	//*   9   16:iload           4
	//*  10   18:invokevirtual   #330 <Method void setFillViewport(boolean)>
	//*  11   21:aload_0         
	//*  12   22:getfield        #98  <Field LinearLayoutCompat mTabLayout>
	//*  13   25:invokevirtual   #333 <Method int LinearLayoutCompat.getChildCount()>
	//*  14   28:istore_3        
	//*  15   29:iload_3         
	//*  16   30:iconst_1        
	//*  17   31:icmple          192
	//*  18   34:iload_2         
	//*  19   35:ldc2            #327 <Int 0x40000000>
	//*  20   38:icmpeq          48
	//*  21   41:iload_2         
	//*  22   42:ldc2            #334 <Int 0x80000000>
	//*  23   45:icmpne          192
	//*  24   48:iload_3         
	//*  25   49:iconst_2        
	//*  26   50:icmple          179
	//*  27   53:aload_0         
	//*  28   54:iload_1         
	//*  29   55:invokestatic    #337 <Method int android.view.View$MeasureSpec.getSize(int)>
	//*  30   58:i2f             
	//*  31   59:ldc2            #338 <Float 0.4F>
	//*  32   62:fmul            
	//*  33   63:f2i             
	//*  34   64:putfield        #340 <Field int mMaxTabWidth>
	//*  35   67:aload_0         
	//*  36   68:aload_0         
	//*  37   69:getfield        #340 <Field int mMaxTabWidth>
	//*  38   72:aload_0         
	//*  39   73:getfield        #92  <Field int mStackedTabMaxWidth>
	//*  40   76:invokestatic    #346 <Method int Math.min(int, int)>
	//*  41   79:putfield        #340 <Field int mMaxTabWidth>
	//*  42   82:aload_0         
	//*  43   83:getfield        #284 <Field int mContentHeight>
	//*  44   86:ldc2            #327 <Int 0x40000000>
	//*  45   89:invokestatic    #349 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  46   92:istore_3        
	//*  47   93:iload           4
	//*  48   95:ifne            200
	//*  49   98:aload_0         
	//*  50   99:getfield        #213 <Field boolean mAllowCollapse>
	//*  51  102:ifeq            200
	//*  52  105:iconst_1        
	//*  53  106:istore_2        
	//*  54  107:iload_2         
	//*  55  108:ifeq            213
	//*  56  111:aload_0         
	//*  57  112:getfield        #98  <Field LinearLayoutCompat mTabLayout>
	//*  58  115:iconst_0        
	//*  59  116:iload_3         
	//*  60  117:invokevirtual   #352 <Method void LinearLayoutCompat.measure(int, int)>
	//*  61  120:aload_0         
	//*  62  121:getfield        #98  <Field LinearLayoutCompat mTabLayout>
	//*  63  124:invokevirtual   #355 <Method int LinearLayoutCompat.getMeasuredWidth()>
	//*  64  127:iload_1         
	//*  65  128:invokestatic    #337 <Method int android.view.View$MeasureSpec.getSize(int)>
	//*  66  131:icmple          205
	//*  67  134:aload_0         
	//*  68  135:invokespecial   #357 <Method void performCollapse()>
	//*  69  138:aload_0         
	//*  70  139:invokevirtual   #358 <Method int getMeasuredWidth()>
	//*  71  142:istore_2        
	//*  72  143:aload_0         
	//*  73  144:iload_1         
	//*  74  145:iload_3         
	//*  75  146:invokespecial   #360 <Method void HorizontalScrollView.onMeasure(int, int)>
	//*  76  149:aload_0         
	//*  77  150:invokevirtual   #358 <Method int getMeasuredWidth()>
	//*  78  153:istore_1        
	//*  79  154:iload           4
	//*  80  156:ifeq            172
	//*  81  159:iload_2         
	//*  82  160:iload_1         
	//*  83  161:icmpeq          172
	//*  84  164:aload_0         
	//*  85  165:aload_0         
	//*  86  166:getfield        #183 <Field int mSelectedTabIndex>
	//*  87  169:invokevirtual   #193 <Method void setTabSelected(int)>
	//*  88  172:return          
			flag = false;
	//   89  173:iconst_0        
	//   90  174:istore          4
		setFillViewport(flag);
		k = mTabLayout.getChildCount();
		if(k > 1 && (j == 0x40000000 || j == 0x80000000))
		{
			if(k > 2)
				mMaxTabWidth = (int)((float)android.view.View.MeasureSpec.getSize(i) * 0.4F);
			else
	//*  91  176:goto            15
				mMaxTabWidth = android.view.View.MeasureSpec.getSize(i) / 2;
	//   92  179:aload_0         
	//   93  180:iload_1         
	//   94  181:invokestatic    #337 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   95  184:iconst_2        
	//   96  185:idiv            
	//   97  186:putfield        #340 <Field int mMaxTabWidth>
			mMaxTabWidth = Math.min(mMaxTabWidth, mStackedTabMaxWidth);
		} else
	//*  98  189:goto            67
		{
			mMaxTabWidth = -1;
	//   99  192:aload_0         
	//  100  193:iconst_m1       
	//  101  194:putfield        #340 <Field int mMaxTabWidth>
		}
		k = android.view.View.MeasureSpec.makeMeasureSpec(mContentHeight, 0x40000000);
		if(!flag && mAllowCollapse)
			j = 1;
		else
	//* 102  197:goto            82
			j = 0;
	//  103  200:iconst_0        
	//  104  201:istore_2        
		if(j != 0)
		{
			mTabLayout.measure(0, k);
			if(mTabLayout.getMeasuredWidth() > android.view.View.MeasureSpec.getSize(i))
				performCollapse();
			else
	//* 105  202:goto            107
				performExpand();
	//  106  205:aload_0         
	//  107  206:invokespecial   #362 <Method boolean performExpand()>
	//  108  209:pop             
		} else
	//* 109  210:goto            138
		{
			performExpand();
	//  110  213:aload_0         
	//  111  214:invokespecial   #362 <Method boolean performExpand()>
	//  112  217:pop             
		}
		j = getMeasuredWidth();
		super.onMeasure(i, k);
		i = getMeasuredWidth();
		if(flag && j != i)
			setTabSelected(mSelectedTabIndex);
	//* 113  218:goto            138
	}

	public void onNothingSelected(AdapterView adapterview)
	{
	//    0    0:return          
	}

	public void removeAllTabs()
	{
		mTabLayout.removeAllViews();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field LinearLayoutCompat mTabLayout>
	//    2    4:invokevirtual   #369 <Method void LinearLayoutCompat.removeAllViews()>
		if(mTabSpinner != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #153 <Field Spinner mTabSpinner>
	//*   5   11:ifnull          27
			((TabAdapter)mTabSpinner.getAdapter()).notifyDataSetChanged();
	//    6   14:aload_0         
	//    7   15:getfield        #153 <Field Spinner mTabSpinner>
	//    8   18:invokevirtual   #170 <Method android.widget.SpinnerAdapter Spinner.getAdapter()>
	//    9   21:checkcast       #10  <Class ScrollingTabContainerView$TabAdapter>
	//   10   24:invokevirtual   #208 <Method void ScrollingTabContainerView$TabAdapter.notifyDataSetChanged()>
		if(mAllowCollapse)
	//*  11   27:aload_0         
	//*  12   28:getfield        #213 <Field boolean mAllowCollapse>
	//*  13   31:ifeq            38
			requestLayout();
	//   14   34:aload_0         
	//   15   35:invokevirtual   #216 <Method void requestLayout()>
	//   16   38:return          
	}

	public void removeTabAt(int i)
	{
		mTabLayout.removeViewAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field LinearLayoutCompat mTabLayout>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #373 <Method void LinearLayoutCompat.removeViewAt(int)>
		if(mTabSpinner != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #153 <Field Spinner mTabSpinner>
	//*   6   12:ifnull          28
			((TabAdapter)mTabSpinner.getAdapter()).notifyDataSetChanged();
	//    7   15:aload_0         
	//    8   16:getfield        #153 <Field Spinner mTabSpinner>
	//    9   19:invokevirtual   #170 <Method android.widget.SpinnerAdapter Spinner.getAdapter()>
	//   10   22:checkcast       #10  <Class ScrollingTabContainerView$TabAdapter>
	//   11   25:invokevirtual   #208 <Method void ScrollingTabContainerView$TabAdapter.notifyDataSetChanged()>
		if(mAllowCollapse)
	//*  12   28:aload_0         
	//*  13   29:getfield        #213 <Field boolean mAllowCollapse>
	//*  14   32:ifeq            39
			requestLayout();
	//   15   35:aload_0         
	//   16   36:invokevirtual   #216 <Method void requestLayout()>
	//   17   39:return          
	}

	public void setAllowCollapse(boolean flag)
	{
		mAllowCollapse = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #213 <Field boolean mAllowCollapse>
	//    3    5:return          
	}

	public void setContentHeight(int i)
	{
		mContentHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #284 <Field int mContentHeight>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #216 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setTabSelected(int i)
	{
		mSelectedTabIndex = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #183 <Field int mSelectedTabIndex>
		int k = mTabLayout.getChildCount();
	//    3    5:aload_0         
	//    4    6:getfield        #98  <Field LinearLayoutCompat mTabLayout>
	//    5    9:invokevirtual   #333 <Method int LinearLayoutCompat.getChildCount()>
	//    6   12:istore_3        
		int j = 0;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		while(j < k) 
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          68
		{
			View view = mTabLayout.getChildAt(j);
	//   12   20:aload_0         
	//   13   21:getfield        #98  <Field LinearLayoutCompat mTabLayout>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #223 <Method View LinearLayoutCompat.getChildAt(int)>
	//   16   28:astore          5
			boolean flag;
			if(j == i)
	//*  17   30:iload_2         
	//*  18   31:iload_1         
	//*  19   32:icmpne          62
				flag = true;
	//   20   35:iconst_1        
	//   21   36:istore          4
			else
	//*  22   38:aload           5
	//*  23   40:iload           4
	//*  24   42:invokevirtual   #377 <Method void View.setSelected(boolean)>
	//*  25   45:iload           4
	//*  26   47:ifeq            55
	//*  27   50:aload_0         
	//*  28   51:iload_1         
	//*  29   52:invokevirtual   #379 <Method void animateToTab(int)>
	//*  30   55:iload_2         
	//*  31   56:iconst_1        
	//*  32   57:iadd            
	//*  33   58:istore_2        
	//*  34   59:goto            15
				flag = false;
	//   35   62:iconst_0        
	//   36   63:istore          4
			view.setSelected(flag);
			if(flag)
				animateToTab(i);
			j++;
		}
	//*  37   65:goto            38
		if(mTabSpinner != null && i >= 0)
	//*  38   68:aload_0         
	//*  39   69:getfield        #153 <Field Spinner mTabSpinner>
	//*  40   72:ifnull          87
	//*  41   75:iload_1         
	//*  42   76:iflt            87
			mTabSpinner.setSelection(i);
	//   43   79:aload_0         
	//   44   80:getfield        #153 <Field Spinner mTabSpinner>
	//   45   83:iload_1         
	//   46   84:invokevirtual   #186 <Method void Spinner.setSelection(int)>
	//   47   87:return          
	}

	public void updateTab(int i)
	{
		((TabView)mTabLayout.getChildAt(i)).update();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field LinearLayoutCompat mTabLayout>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #223 <Method View LinearLayoutCompat.getChildAt(int)>
	//    4    8:checkcast       #16  <Class ScrollingTabContainerView$TabView>
	//    5   11:invokevirtual   #383 <Method void ScrollingTabContainerView$TabView.update()>
		if(mTabSpinner != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #153 <Field Spinner mTabSpinner>
	//*   8   18:ifnull          34
			((TabAdapter)mTabSpinner.getAdapter()).notifyDataSetChanged();
	//    9   21:aload_0         
	//   10   22:getfield        #153 <Field Spinner mTabSpinner>
	//   11   25:invokevirtual   #170 <Method android.widget.SpinnerAdapter Spinner.getAdapter()>
	//   12   28:checkcast       #10  <Class ScrollingTabContainerView$TabAdapter>
	//   13   31:invokevirtual   #208 <Method void ScrollingTabContainerView$TabAdapter.notifyDataSetChanged()>
		if(mAllowCollapse)
	//*  14   34:aload_0         
	//*  15   35:getfield        #213 <Field boolean mAllowCollapse>
	//*  16   38:ifeq            45
			requestLayout();
	//   17   41:aload_0         
	//   18   42:invokevirtual   #216 <Method void requestLayout()>
	//   19   45:return          
	}

	private static final int FADE_DURATION = 200;
	private static final String TAG = "ScrollingTabContainerView";
	private static final Interpolator sAlphaInterpolator = new DecelerateInterpolator();
	private boolean mAllowCollapse;
	private int mContentHeight;
	int mMaxTabWidth;
	private int mSelectedTabIndex;
	int mStackedTabMaxWidth;
	private TabClickListener mTabClickListener;
	LinearLayoutCompat mTabLayout;
	Runnable mTabSelector;
	private Spinner mTabSpinner;
	protected final VisibilityAnimListener mVisAnimListener = new VisibilityAnimListener();
	protected ViewPropertyAnimator mVisibilityAnim;

	static 
	{
	//    0    0:new             #55  <Class DecelerateInterpolator>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void DecelerateInterpolator()>
	//    3    7:putstatic       #60  <Field Interpolator sAlphaInterpolator>
	//*   4   10:return          
	}
}
