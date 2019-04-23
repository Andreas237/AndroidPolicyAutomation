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
			for(int i = 0; i < j; i++)
		//*   9   21:iconst_0        
		//*  10   22:istore_2        
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
		//*  22   44:if_acmpne       53
					flag = true;
		//   23   47:iconst_1        
		//   24   48:istore          4
				else
		//*  25   50:goto            56
					flag = false;
		//   26   53:iconst_0        
		//   27   54:istore          4
				view1.setSelected(flag);
		//   28   56:aload           5
		//   29   58:iload           4
		//   30   60:invokevirtual   #52  <Method void View.setSelected(boolean)>
			}

		//   31   63:iload_2         
		//   32   64:iconst_1        
		//   33   65:iadd            
		//   34   66:istore_2        
		//*  35   67:goto            23
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

	private class TabView extends LinearLayout
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
		//    2    2:invokespecial   #76  <Method void LinearLayout.onInitializeAccessibilityEvent(AccessibilityEvent)>
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
		//    2    2:invokespecial   #94  <Method void LinearLayout.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
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
		//    3    3:invokespecial   #101 <Method void LinearLayout.onMeasure(int, int)>
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
		//   21   44:invokespecial   #101 <Method void LinearLayout.onMeasure(int, int)>
		//   22   47:return          
		}

		public void setSelected(boolean flag)
		{
			boolean flag1;
			if(isSelected() != flag)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #121 <Method boolean isSelected()>
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
		//   11   17:invokespecial   #123 <Method void LinearLayout.setSelected(boolean)>
			if(flag1 && flag)
		//*  12   20:iload_2         
		//*  13   21:ifeq            33
		//*  14   24:iload_1         
		//*  15   25:ifeq            33
				sendAccessibilityEvent(4);
		//   16   28:aload_0         
		//   17   29:iconst_4        
		//   18   30:invokevirtual   #126 <Method void sendAccessibilityEvent(int)>
		//   19   33:return          
		}

		public void update()
		{
			android.support.v7.app.ActionBar.Tab tab = mTab;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field android.support.v7.app.ActionBar$Tab mTab>
		//    2    4:astore_3        
			View view = tab.getCustomView();
		//    3    5:aload_3         
		//    4    6:invokevirtual   #130 <Method View android.support.v7.app.ActionBar$Tab.getCustomView()>
		//    5    9:astore          4
			Object obj = null;
		//    6   11:aconst_null     
		//    7   12:astore_2        
			if(view != null)
		//*   8   13:aload           4
		//*   9   15:ifnull          93
			{
				obj = ((Object) (view.getParent()));
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
						((ViewGroup)obj).removeView(view);
		//   18   33:aload_2         
		//   19   34:checkcast       #138 <Class ViewGroup>
		//   20   37:aload           4
		//   21   39:invokevirtual   #142 <Method void ViewGroup.removeView(View)>
					addView(view);
		//   22   42:aload_0         
		//   23   43:aload           4
		//   24   45:invokevirtual   #145 <Method void addView(View)>
				}
				mCustomView = view;
		//   25   48:aload_0         
		//   26   49:aload           4
		//   27   51:putfield        #147 <Field View mCustomView>
				obj = ((Object) (mTextView));
		//   28   54:aload_0         
		//   29   55:getfield        #149 <Field TextView mTextView>
		//   30   58:astore_2        
				if(obj != null)
		//*  31   59:aload_2         
		//*  32   60:ifnull          69
					((TextView) (obj)).setVisibility(8);
		//   33   63:aload_2         
		//   34   64:bipush          8
		//   35   66:invokevirtual   #154 <Method void TextView.setVisibility(int)>
				obj = ((Object) (mIconView));
		//   36   69:aload_0         
		//   37   70:getfield        #156 <Field ImageView mIconView>
		//   38   73:astore_2        
				if(obj != null)
		//*  39   74:aload_2         
		//*  40   75:ifnull          404
				{
					((ImageView) (obj)).setVisibility(8);
		//   41   78:aload_2         
		//   42   79:bipush          8
		//   43   81:invokevirtual   #159 <Method void ImageView.setVisibility(int)>
					mIconView.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
		//   44   84:aload_0         
		//   45   85:getfield        #156 <Field ImageView mIconView>
		//   46   88:aconst_null     
		//   47   89:invokevirtual   #162 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
					return;
		//   48   92:return          
				}
			} else
			{
				Object obj1 = ((Object) (mCustomView));
		//   49   93:aload_0         
		//   50   94:getfield        #147 <Field View mCustomView>
		//   51   97:astore          4
				if(obj1 != null)
		//*  52   99:aload           4
		//*  53  101:ifnull          115
				{
					removeView(((View) (obj1)));
		//   54  104:aload_0         
		//   55  105:aload           4
		//   56  107:invokevirtual   #163 <Method void removeView(View)>
					mCustomView = null;
		//   57  110:aload_0         
		//   58  111:aconst_null     
		//   59  112:putfield        #147 <Field View mCustomView>
				}
				android.graphics.drawable.Drawable drawable = tab.getIcon();
		//   60  115:aload_3         
		//   61  116:invokevirtual   #167 <Method android.graphics.drawable.Drawable android.support.v7.app.ActionBar$Tab.getIcon()>
		//   62  119:astore          5
				obj1 = ((Object) (tab.getText()));
		//   63  121:aload_3         
		//   64  122:invokevirtual   #171 <Method CharSequence android.support.v7.app.ActionBar$Tab.getText()>
		//   65  125:astore          4
				if(drawable != null)
		//*  66  127:aload           5
		//*  67  129:ifnull          212
				{
					if(mIconView == null)
		//*  68  132:aload_0         
		//*  69  133:getfield        #156 <Field ImageView mIconView>
		//*  70  136:ifnonnull       192
					{
						AppCompatImageView appcompatimageview = new AppCompatImageView(getContext());
		//   71  139:new             #173 <Class AppCompatImageView>
		//   72  142:dup             
		//   73  143:aload_0         
		//   74  144:invokevirtual   #177 <Method Context getContext()>
		//   75  147:invokespecial   #180 <Method void AppCompatImageView(Context)>
		//   76  150:astore          6
						android.widget.LinearLayout.LayoutParams layoutparams1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
		//   77  152:new             #182 <Class android.widget.LinearLayout$LayoutParams>
		//   78  155:dup             
		//   79  156:bipush          -2
		//   80  158:bipush          -2
		//   81  160:invokespecial   #184 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
		//   82  163:astore          7
						layoutparams1.gravity = 16;
		//   83  165:aload           7
		//   84  167:bipush          16
		//   85  169:putfield        #187 <Field int android.widget.LinearLayout$LayoutParams.gravity>
						((ImageView) (appcompatimageview)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams1)));
		//   86  172:aload           6
		//   87  174:aload           7
		//   88  176:invokevirtual   #191 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
						addView(((View) (appcompatimageview)), 0);
		//   89  179:aload_0         
		//   90  180:aload           6
		//   91  182:iconst_0        
		//   92  183:invokevirtual   #194 <Method void addView(View, int)>
						mIconView = ((ImageView) (appcompatimageview));
		//   93  186:aload_0         
		//   94  187:aload           6
		//   95  189:putfield        #156 <Field ImageView mIconView>
					}
					mIconView.setImageDrawable(drawable);
		//   96  192:aload_0         
		//   97  193:getfield        #156 <Field ImageView mIconView>
		//   98  196:aload           5
		//   99  198:invokevirtual   #162 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
					mIconView.setVisibility(0);
		//  100  201:aload_0         
		//  101  202:getfield        #156 <Field ImageView mIconView>
		//  102  205:iconst_0        
		//  103  206:invokevirtual   #159 <Method void ImageView.setVisibility(int)>
				} else
		//* 104  209:goto            238
				{
					ImageView imageview = mIconView;
		//  105  212:aload_0         
		//  106  213:getfield        #156 <Field ImageView mIconView>
		//  107  216:astore          5
					if(imageview != null)
		//* 108  218:aload           5
		//* 109  220:ifnull          238
					{
						imageview.setVisibility(8);
		//  110  223:aload           5
		//  111  225:bipush          8
		//  112  227:invokevirtual   #159 <Method void ImageView.setVisibility(int)>
						mIconView.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
		//  113  230:aload_0         
		//  114  231:getfield        #156 <Field ImageView mIconView>
		//  115  234:aconst_null     
		//  116  235:invokevirtual   #162 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
					}
				}
				boolean flag = TextUtils.isEmpty(((CharSequence) (obj1))) ^ true;
		//  117  238:aload           4
		//  118  240:invokestatic    #200 <Method boolean TextUtils.isEmpty(CharSequence)>
		//  119  243:iconst_1        
		//  120  244:ixor            
		//  121  245:istore_1        
				if(flag)
		//* 122  246:iload_1         
		//* 123  247:ifeq            341
				{
					if(mTextView == null)
		//* 124  250:aload_0         
		//* 125  251:getfield        #149 <Field TextView mTextView>
		//* 126  254:ifnonnull       321
					{
						AppCompatTextView appcompattextview = new AppCompatTextView(getContext(), ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.attr.actionBarTabTextStyle);
		//  127  257:new             #202 <Class AppCompatTextView>
		//  128  260:dup             
		//  129  261:aload_0         
		//  130  262:invokevirtual   #177 <Method Context getContext()>
		//  131  265:aconst_null     
		//  132  266:getstatic       #205 <Field int android.support.v7.appcompat.R$attr.actionBarTabTextStyle>
		//  133  269:invokespecial   #206 <Method void AppCompatTextView(Context, android.util.AttributeSet, int)>
		//  134  272:astore          5
						((TextView) (appcompattextview)).setEllipsize(android.text.TextUtils.TruncateAt.END);
		//  135  274:aload           5
		//  136  276:getstatic       #212 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
		//  137  279:invokevirtual   #216 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
						android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
		//  138  282:new             #182 <Class android.widget.LinearLayout$LayoutParams>
		//  139  285:dup             
		//  140  286:bipush          -2
		//  141  288:bipush          -2
		//  142  290:invokespecial   #184 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
		//  143  293:astore          6
						layoutparams.gravity = 16;
		//  144  295:aload           6
		//  145  297:bipush          16
		//  146  299:putfield        #187 <Field int android.widget.LinearLayout$LayoutParams.gravity>
						((TextView) (appcompattextview)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
		//  147  302:aload           5
		//  148  304:aload           6
		//  149  306:invokevirtual   #217 <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
						addView(((View) (appcompattextview)));
		//  150  309:aload_0         
		//  151  310:aload           5
		//  152  312:invokevirtual   #145 <Method void addView(View)>
						mTextView = ((TextView) (appcompattextview));
		//  153  315:aload_0         
		//  154  316:aload           5
		//  155  318:putfield        #149 <Field TextView mTextView>
					}
					mTextView.setText(((CharSequence) (obj1)));
		//  156  321:aload_0         
		//  157  322:getfield        #149 <Field TextView mTextView>
		//  158  325:aload           4
		//  159  327:invokevirtual   #220 <Method void TextView.setText(CharSequence)>
					mTextView.setVisibility(0);
		//  160  330:aload_0         
		//  161  331:getfield        #149 <Field TextView mTextView>
		//  162  334:iconst_0        
		//  163  335:invokevirtual   #154 <Method void TextView.setVisibility(int)>
				} else
		//* 164  338:goto            367
				{
					obj1 = ((Object) (mTextView));
		//  165  341:aload_0         
		//  166  342:getfield        #149 <Field TextView mTextView>
		//  167  345:astore          4
					if(obj1 != null)
		//* 168  347:aload           4
		//* 169  349:ifnull          367
					{
						((TextView) (obj1)).setVisibility(8);
		//  170  352:aload           4
		//  171  354:bipush          8
		//  172  356:invokevirtual   #154 <Method void TextView.setVisibility(int)>
						mTextView.setText(((CharSequence) (null)));
		//  173  359:aload_0         
		//  174  360:getfield        #149 <Field TextView mTextView>
		//  175  363:aconst_null     
		//  176  364:invokevirtual   #220 <Method void TextView.setText(CharSequence)>
					}
				}
				obj1 = ((Object) (mIconView));
		//  177  367:aload_0         
		//  178  368:getfield        #156 <Field ImageView mIconView>
		//  179  371:astore          4
				if(obj1 != null)
		//* 180  373:aload           4
		//* 181  375:ifnull          387
					((ImageView) (obj1)).setContentDescription(tab.getContentDescription());
		//  182  378:aload           4
		//  183  380:aload_3         
		//  184  381:invokevirtual   #223 <Method CharSequence android.support.v7.app.ActionBar$Tab.getContentDescription()>
		//  185  384:invokevirtual   #226 <Method void ImageView.setContentDescription(CharSequence)>
				if(!flag)
		//* 186  387:iload_1         
		//* 187  388:ifeq            394
		//* 188  391:goto            399
					obj = ((Object) (tab.getContentDescription()));
		//  189  394:aload_3         
		//  190  395:invokevirtual   #223 <Method CharSequence android.support.v7.app.ActionBar$Tab.getContentDescription()>
		//  191  398:astore_2        
				TooltipCompat.setTooltipText(((View) (this)), ((CharSequence) (obj)));
		//  192  399:aload_0         
		//  193  400:aload_2         
		//  194  401:invokestatic    #232 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
			}
		//  195  404:return          
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
		//    7   11:invokespecial   #32  <Method void LinearLayout(Context, android.util.AttributeSet, int)>
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
				animator = ((Animator) (ScrollingTabContainerView.this));
		//    4    8:aload_0         
		//    5    9:getfield        #17  <Field ScrollingTabContainerView this$0>
		//    6   12:astore_1        
				animator.mVisibilityAnim = null;
		//    7   13:aload_1         
		//    8   14:aconst_null     
		//    9   15:putfield        #30  <Field ViewPropertyAnimator ScrollingTabContainerView.mVisibilityAnim>
				((ScrollingTabContainerView) (animator)).setVisibility(mFinalVisibility);
		//   10   18:aload_1         
		//   11   19:aload_0         
		//   12   20:getfield        #32  <Field int mFinalVisibility>
		//   13   23:invokevirtual   #36  <Method void ScrollingTabContainerView.setVisibility(int)>
				return;
		//   14   26:return          
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
		Spinner spinner = mTabSpinner;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field Spinner mTabSpinner>
	//    2    4:astore_1        
		return spinner != null && spinner.getParent() == this;
	//    3    5:aload_1         
	//    4    6:ifnull          19
	//    5    9:aload_1         
	//    6   10:invokevirtual   #157 <Method android.view.ViewParent Spinner.getParent()>
	//    7   13:aload_0         
	//    8   14:if_acmpne       19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
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
		Runnable runnable = mTabSelector;
	//   35   74:aload_0         
	//   36   75:getfield        #177 <Field Runnable mTabSelector>
	//   37   78:astore_1        
		if(runnable != null)
	//*  38   79:aload_1         
	//*  39   80:ifnull          94
		{
			removeCallbacks(runnable);
	//   40   83:aload_0         
	//   41   84:aload_1         
	//   42   85:invokevirtual   #181 <Method boolean removeCallbacks(Runnable)>
	//   43   88:pop             
			mTabSelector = null;
	//   44   89:aload_0         
	//   45   90:aconst_null     
	//   46   91:putfield        #177 <Field Runnable mTabSelector>
		}
		mTabSpinner.setSelection(mSelectedTabIndex);
	//   47   94:aload_0         
	//   48   95:getfield        #153 <Field Spinner mTabSpinner>
	//   49   98:aload_0         
	//   50   99:getfield        #183 <Field int mSelectedTabIndex>
	//   51  102:invokevirtual   #186 <Method void Spinner.setSelection(int)>
	//   52  105:return          
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
		Spinner spinner = mTabSpinner;
	//   16   26:aload_0         
	//   17   27:getfield        #153 <Field Spinner mTabSpinner>
	//   18   30:astore          4
		if(spinner != null)
	//*  19   32:aload           4
	//*  20   34:ifnull          48
			((TabAdapter)spinner.getAdapter()).notifyDataSetChanged();
	//   21   37:aload           4
	//   22   39:invokevirtual   #170 <Method android.widget.SpinnerAdapter Spinner.getAdapter()>
	//   23   42:checkcast       #10  <Class ScrollingTabContainerView$TabAdapter>
	//   24   45:invokevirtual   #208 <Method void ScrollingTabContainerView$TabAdapter.notifyDataSetChanged()>
		if(flag)
	//*  25   48:iload_3         
	//*  26   49:ifeq            57
			((TabView) (tab)).setSelected(true);
	//   27   52:aload_1         
	//   28   53:iconst_1        
	//   29   54:invokevirtual   #211 <Method void ScrollingTabContainerView$TabView.setSelected(boolean)>
		if(mAllowCollapse)
	//*  30   57:aload_0         
	//*  31   58:getfield        #213 <Field boolean mAllowCollapse>
	//*  32   61:ifeq            68
			requestLayout();
	//   33   64:aload_0         
	//   34   65:invokevirtual   #216 <Method void requestLayout()>
	//   35   68:return          
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
		Spinner spinner = mTabSpinner;
	//   15   25:aload_0         
	//   16   26:getfield        #153 <Field Spinner mTabSpinner>
	//   17   29:astore_3        
		if(spinner != null)
	//*  18   30:aload_3         
	//*  19   31:ifnull          44
			((TabAdapter)spinner.getAdapter()).notifyDataSetChanged();
	//   20   34:aload_3         
	//   21   35:invokevirtual   #170 <Method android.widget.SpinnerAdapter Spinner.getAdapter()>
	//   22   38:checkcast       #10  <Class ScrollingTabContainerView$TabAdapter>
	//   23   41:invokevirtual   #208 <Method void ScrollingTabContainerView$TabAdapter.notifyDataSetChanged()>
		if(flag)
	//*  24   44:iload_2         
	//*  25   45:ifeq            53
			((TabView) (tab)).setSelected(true);
	//   26   48:aload_1         
	//   27   49:iconst_1        
	//   28   50:invokevirtual   #211 <Method void ScrollingTabContainerView$TabView.setSelected(boolean)>
		if(mAllowCollapse)
	//*  29   53:aload_0         
	//*  30   54:getfield        #213 <Field boolean mAllowCollapse>
	//*  31   57:ifeq            64
			requestLayout();
	//   32   60:aload_0         
	//   33   61:invokevirtual   #216 <Method void requestLayout()>
	//   34   64:return          
	}

	public void animateToTab(int i)
	{
		final View tabView = mTabLayout.getChildAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field LinearLayoutCompat mTabLayout>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #223 <Method View LinearLayoutCompat.getChildAt(int)>
	//    4    8:astore_2        
		Runnable runnable = mTabSelector;
	//    5    9:aload_0         
	//    6   10:getfield        #177 <Field Runnable mTabSelector>
	//    7   13:astore_3        
		if(runnable != null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          24
			removeCallbacks(runnable);
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:invokevirtual   #181 <Method boolean removeCallbacks(Runnable)>
	//   13   23:pop             
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
	//   14   24:aload_0         
	//   15   25:new             #8   <Class ScrollingTabContainerView$1>
	//   16   28:dup             
	//   17   29:aload_0         
	//   18   30:aload_2         
	//   19   31:invokespecial   #226 <Method void ScrollingTabContainerView$1(ScrollingTabContainerView, View)>
	//   20   34:putfield        #177 <Field Runnable mTabSelector>
		post(mTabSelector);
	//   21   37:aload_0         
	//   22   38:aload_0         
	//   23   39:getfield        #177 <Field Runnable mTabSelector>
	//   24   42:invokevirtual   #229 <Method boolean post(Runnable)>
	//   25   45:pop             
	//   26   46:return          
	}

	public void animateToVisibility(int i)
	{
		ViewPropertyAnimator viewpropertyanimator = mVisibilityAnim;
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field ViewPropertyAnimator mVisibilityAnim>
	//    2    4:astore_2        
		if(viewpropertyanimator != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          13
			viewpropertyanimator.cancel();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #237 <Method void ViewPropertyAnimator.cancel()>
		if(i == 0)
	//*   7   13:iload_1         
	//*   8   14:ifne            73
		{
			if(getVisibility() != 0)
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #240 <Method int getVisibility()>
	//*  11   21:ifeq            29
				setAlpha(0.0F);
	//   12   24:aload_0         
	//   13   25:fconst_0        
	//   14   26:invokevirtual   #244 <Method void setAlpha(float)>
			ViewPropertyAnimator viewpropertyanimator1 = animate().alpha(1.0F);
	//   15   29:aload_0         
	//   16   30:invokevirtual   #248 <Method ViewPropertyAnimator animate()>
	//   17   33:fconst_1        
	//   18   34:invokevirtual   #252 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   19   37:astore_2        
			viewpropertyanimator1.setDuration(200L);
	//   20   38:aload_2         
	//   21   39:ldc2w           #253 <Long 200L>
	//   22   42:invokevirtual   #258 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   23   45:pop             
			viewpropertyanimator1.setInterpolator(((android.animation.TimeInterpolator) (sAlphaInterpolator)));
	//   24   46:aload_2         
	//   25   47:getstatic       #60  <Field Interpolator sAlphaInterpolator>
	//   26   50:invokevirtual   #262 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   27   53:pop             
			viewpropertyanimator1.setListener(((android.animation.Animator.AnimatorListener) (mVisAnimListener.withFinalVisibility(viewpropertyanimator1, i))));
	//   28   54:aload_2         
	//   29   55:aload_0         
	//   30   56:getfield        #69  <Field ScrollingTabContainerView$VisibilityAnimListener mVisAnimListener>
	//   31   59:aload_2         
	//   32   60:iload_1         
	//   33   61:invokevirtual   #266 <Method ScrollingTabContainerView$VisibilityAnimListener ScrollingTabContainerView$VisibilityAnimListener.withFinalVisibility(ViewPropertyAnimator, int)>
	//   34   64:invokevirtual   #270 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   35   67:pop             
			viewpropertyanimator1.start();
	//   36   68:aload_2         
	//   37   69:invokevirtual   #273 <Method void ViewPropertyAnimator.start()>
			return;
	//   38   72:return          
		} else
		{
			ViewPropertyAnimator viewpropertyanimator2 = animate().alpha(0.0F);
	//   39   73:aload_0         
	//   40   74:invokevirtual   #248 <Method ViewPropertyAnimator animate()>
	//   41   77:fconst_0        
	//   42   78:invokevirtual   #252 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   43   81:astore_2        
			viewpropertyanimator2.setDuration(200L);
	//   44   82:aload_2         
	//   45   83:ldc2w           #253 <Long 200L>
	//   46   86:invokevirtual   #258 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   47   89:pop             
			viewpropertyanimator2.setInterpolator(((android.animation.TimeInterpolator) (sAlphaInterpolator)));
	//   48   90:aload_2         
	//   49   91:getstatic       #60  <Field Interpolator sAlphaInterpolator>
	//   50   94:invokevirtual   #262 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   51   97:pop             
			viewpropertyanimator2.setListener(((android.animation.Animator.AnimatorListener) (mVisAnimListener.withFinalVisibility(viewpropertyanimator2, i))));
	//   52   98:aload_2         
	//   53   99:aload_0         
	//   54  100:getfield        #69  <Field ScrollingTabContainerView$VisibilityAnimListener mVisAnimListener>
	//   55  103:aload_2         
	//   56  104:iload_1         
	//   57  105:invokevirtual   #266 <Method ScrollingTabContainerView$VisibilityAnimListener ScrollingTabContainerView$VisibilityAnimListener.withFinalVisibility(ViewPropertyAnimator, int)>
	//   58  108:invokevirtual   #270 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   59  111:pop             
			viewpropertyanimator2.start();
	//   60  112:aload_2         
	//   61  113:invokevirtual   #273 <Method void ViewPropertyAnimator.start()>
			return;
	//   62  116:return          
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
		Runnable runnable = mTabSelector;
	//    2    4:aload_0         
	//    3    5:getfield        #177 <Field Runnable mTabSelector>
	//    4    8:astore_1        
		if(runnable != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          19
			post(runnable);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #229 <Method boolean post(Runnable)>
	//   10   18:pop             
	//   11   19:return          
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
		Runnable runnable = mTabSelector;
	//    2    4:aload_0         
	//    3    5:getfield        #177 <Field Runnable mTabSelector>
	//    4    8:astore_1        
		if(runnable != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          19
			removeCallbacks(runnable);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #181 <Method boolean removeCallbacks(Runnable)>
	//   10   18:pop             
	//   11   19:return          
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
		int k = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #326 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_3        
		j = 1;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		boolean flag;
		if(k == 0x40000000)
	//*   5    7:iload_3         
	//*   6    8:ldc2            #327 <Int 0x40000000>
	//*   7   11:icmpne          20
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore          5
		else
	//*  10   17:goto            23
			flag = false;
	//   11   20:iconst_0        
	//   12   21:istore          5
		setFillViewport(flag);
	//   13   23:aload_0         
	//   14   24:iload           5
	//   15   26:invokevirtual   #330 <Method void setFillViewport(boolean)>
		int l = mTabLayout.getChildCount();
	//   16   29:aload_0         
	//   17   30:getfield        #98  <Field LinearLayoutCompat mTabLayout>
	//   18   33:invokevirtual   #333 <Method int LinearLayoutCompat.getChildCount()>
	//   19   36:istore          4
		if(l > 1 && (k == 0x40000000 || k == 0x80000000))
	//*  20   38:iload           4
	//*  21   40:iconst_1        
	//*  22   41:icmple          109
	//*  23   44:iload_3         
	//*  24   45:ldc2            #327 <Int 0x40000000>
	//*  25   48:icmpeq          58
	//*  26   51:iload_3         
	//*  27   52:ldc2            #334 <Int 0x80000000>
	//*  28   55:icmpne          109
		{
			if(l > 2)
	//*  29   58:iload           4
	//*  30   60:iconst_2        
	//*  31   61:icmple          81
				mMaxTabWidth = (int)((float)android.view.View.MeasureSpec.getSize(i) * 0.4F);
	//   32   64:aload_0         
	//   33   65:iload_1         
	//   34   66:invokestatic    #337 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   35   69:i2f             
	//   36   70:ldc2            #338 <Float 0.4F>
	//   37   73:fmul            
	//   38   74:f2i             
	//   39   75:putfield        #340 <Field int mMaxTabWidth>
			else
	//*  40   78:goto            91
				mMaxTabWidth = android.view.View.MeasureSpec.getSize(i) / 2;
	//   41   81:aload_0         
	//   42   82:iload_1         
	//   43   83:invokestatic    #337 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   44   86:iconst_2        
	//   45   87:idiv            
	//   46   88:putfield        #340 <Field int mMaxTabWidth>
			mMaxTabWidth = Math.min(mMaxTabWidth, mStackedTabMaxWidth);
	//   47   91:aload_0         
	//   48   92:aload_0         
	//   49   93:getfield        #340 <Field int mMaxTabWidth>
	//   50   96:aload_0         
	//   51   97:getfield        #92  <Field int mStackedTabMaxWidth>
	//   52  100:invokestatic    #346 <Method int Math.min(int, int)>
	//   53  103:putfield        #340 <Field int mMaxTabWidth>
		} else
	//*  54  106:goto            114
		{
			mMaxTabWidth = -1;
	//   55  109:aload_0         
	//   56  110:iconst_m1       
	//   57  111:putfield        #340 <Field int mMaxTabWidth>
		}
		k = android.view.View.MeasureSpec.makeMeasureSpec(mContentHeight, 0x40000000);
	//   58  114:aload_0         
	//   59  115:getfield        #284 <Field int mContentHeight>
	//   60  118:ldc2            #327 <Int 0x40000000>
	//   61  121:invokestatic    #349 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   62  124:istore_3        
		if(flag || !mAllowCollapse)
	//*  63  125:iload           5
	//*  64  127:ifne            140
	//*  65  130:aload_0         
	//*  66  131:getfield        #213 <Field boolean mAllowCollapse>
	//*  67  134:ifeq            140
	//*  68  137:goto            142
			j = 0;
	//   69  140:iconst_0        
	//   70  141:istore_2        
		if(j != 0)
	//*  71  142:iload_2         
	//*  72  143:ifeq            184
		{
			mTabLayout.measure(0, k);
	//   73  146:aload_0         
	//   74  147:getfield        #98  <Field LinearLayoutCompat mTabLayout>
	//   75  150:iconst_0        
	//   76  151:iload_3         
	//   77  152:invokevirtual   #352 <Method void LinearLayoutCompat.measure(int, int)>
			if(mTabLayout.getMeasuredWidth() > android.view.View.MeasureSpec.getSize(i))
	//*  78  155:aload_0         
	//*  79  156:getfield        #98  <Field LinearLayoutCompat mTabLayout>
	//*  80  159:invokevirtual   #355 <Method int LinearLayoutCompat.getMeasuredWidth()>
	//*  81  162:iload_1         
	//*  82  163:invokestatic    #337 <Method int android.view.View$MeasureSpec.getSize(int)>
	//*  83  166:icmple          176
				performCollapse();
	//   84  169:aload_0         
	//   85  170:invokespecial   #357 <Method void performCollapse()>
			else
	//*  86  173:goto            189
				performExpand();
	//   87  176:aload_0         
	//   88  177:invokespecial   #359 <Method boolean performExpand()>
	//   89  180:pop             
		} else
	//*  90  181:goto            189
		{
			performExpand();
	//   91  184:aload_0         
	//   92  185:invokespecial   #359 <Method boolean performExpand()>
	//   93  188:pop             
		}
		j = getMeasuredWidth();
	//   94  189:aload_0         
	//   95  190:invokevirtual   #360 <Method int getMeasuredWidth()>
	//   96  193:istore_2        
		super.onMeasure(i, k);
	//   97  194:aload_0         
	//   98  195:iload_1         
	//   99  196:iload_3         
	//  100  197:invokespecial   #362 <Method void HorizontalScrollView.onMeasure(int, int)>
		i = getMeasuredWidth();
	//  101  200:aload_0         
	//  102  201:invokevirtual   #360 <Method int getMeasuredWidth()>
	//  103  204:istore_1        
		if(flag && j != i)
	//* 104  205:iload           5
	//* 105  207:ifeq            223
	//* 106  210:iload_2         
	//* 107  211:iload_1         
	//* 108  212:icmpeq          223
			setTabSelected(mSelectedTabIndex);
	//  109  215:aload_0         
	//  110  216:aload_0         
	//  111  217:getfield        #183 <Field int mSelectedTabIndex>
	//  112  220:invokevirtual   #193 <Method void setTabSelected(int)>
	//  113  223:return          
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
		Spinner spinner = mTabSpinner;
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Spinner mTabSpinner>
	//    5   11:astore_1        
		if(spinner != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          26
			((TabAdapter)spinner.getAdapter()).notifyDataSetChanged();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #170 <Method android.widget.SpinnerAdapter Spinner.getAdapter()>
	//   10   20:checkcast       #10  <Class ScrollingTabContainerView$TabAdapter>
	//   11   23:invokevirtual   #208 <Method void ScrollingTabContainerView$TabAdapter.notifyDataSetChanged()>
		if(mAllowCollapse)
	//*  12   26:aload_0         
	//*  13   27:getfield        #213 <Field boolean mAllowCollapse>
	//*  14   30:ifeq            37
			requestLayout();
	//   15   33:aload_0         
	//   16   34:invokevirtual   #216 <Method void requestLayout()>
	//   17   37:return          
	}

	public void removeTabAt(int i)
	{
		mTabLayout.removeViewAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field LinearLayoutCompat mTabLayout>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #373 <Method void LinearLayoutCompat.removeViewAt(int)>
		Spinner spinner = mTabSpinner;
	//    4    8:aload_0         
	//    5    9:getfield        #153 <Field Spinner mTabSpinner>
	//    6   12:astore_2        
		if(spinner != null)
	//*   7   13:aload_2         
	//*   8   14:ifnull          27
			((TabAdapter)spinner.getAdapter()).notifyDataSetChanged();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #170 <Method android.widget.SpinnerAdapter Spinner.getAdapter()>
	//   11   21:checkcast       #10  <Class ScrollingTabContainerView$TabAdapter>
	//   12   24:invokevirtual   #208 <Method void ScrollingTabContainerView$TabAdapter.notifyDataSetChanged()>
		if(mAllowCollapse)
	//*  13   27:aload_0         
	//*  14   28:getfield        #213 <Field boolean mAllowCollapse>
	//*  15   31:ifeq            38
			requestLayout();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #216 <Method void requestLayout()>
	//   18   38:return          
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
		for(int j = 0; j < k; j++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
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
	//   27   48:invokevirtual   #377 <Method void View.setSelected(boolean)>
			if(flag)
	//*  28   51:iload           4
	//*  29   53:ifeq            61
				animateToTab(i);
	//   30   56:aload_0         
	//   31   57:iload_1         
	//   32   58:invokevirtual   #379 <Method void animateToTab(int)>
		}

	//   33   61:iload_2         
	//   34   62:iconst_1        
	//   35   63:iadd            
	//   36   64:istore_2        
	//*  37   65:goto            15
		Spinner spinner = mTabSpinner;
	//   38   68:aload_0         
	//   39   69:getfield        #153 <Field Spinner mTabSpinner>
	//   40   72:astore          5
		if(spinner != null && i >= 0)
	//*  41   74:aload           5
	//*  42   76:ifnull          89
	//*  43   79:iload_1         
	//*  44   80:iflt            89
			spinner.setSelection(i);
	//   45   83:aload           5
	//   46   85:iload_1         
	//   47   86:invokevirtual   #186 <Method void Spinner.setSelection(int)>
	//   48   89:return          
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
		Spinner spinner = mTabSpinner;
	//    6   14:aload_0         
	//    7   15:getfield        #153 <Field Spinner mTabSpinner>
	//    8   18:astore_2        
		if(spinner != null)
	//*   9   19:aload_2         
	//*  10   20:ifnull          33
			((TabAdapter)spinner.getAdapter()).notifyDataSetChanged();
	//   11   23:aload_2         
	//   12   24:invokevirtual   #170 <Method android.widget.SpinnerAdapter Spinner.getAdapter()>
	//   13   27:checkcast       #10  <Class ScrollingTabContainerView$TabAdapter>
	//   14   30:invokevirtual   #208 <Method void ScrollingTabContainerView$TabAdapter.notifyDataSetChanged()>
		if(mAllowCollapse)
	//*  15   33:aload_0         
	//*  16   34:getfield        #213 <Field boolean mAllowCollapse>
	//*  17   37:ifeq            44
			requestLayout();
	//   18   40:aload_0         
	//   19   41:invokevirtual   #216 <Method void requestLayout()>
	//   20   44:return          
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
