// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.view.ActionBarPolicy;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
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


	private Spinner createSpinner()
	{
		AppCompatSpinner appcompatspinner = new AppCompatSpinner(getContext(), ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.attr.actionDropDownStyle);
	//    0    0:new             #52  <Class AppCompatSpinner>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #56  <Method Context getContext()>
	//    4    8:aconst_null     
	//    5    9:getstatic       #61  <Field int android.support.v7.appcompat.R$attr.actionDropDownStyle>
	//    6   12:invokespecial   #64  <Method void AppCompatSpinner(Context, android.util.AttributeSet, int)>
	//    7   15:astore_1        
		((Spinner) (appcompatspinner)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new LinearLayoutCompat.LayoutParams(-2, -1))));
	//    8   16:aload_1         
	//    9   17:new             #66  <Class LinearLayoutCompat$LayoutParams>
	//   10   20:dup             
	//   11   21:bipush          -2
	//   12   23:iconst_m1       
	//   13   24:invokespecial   #69  <Method void LinearLayoutCompat$LayoutParams(int, int)>
	//   14   27:invokevirtual   #75  <Method void Spinner.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		((Spinner) (appcompatspinner)).setOnItemSelectedListener(((android.widget.AdapterView.OnItemSelectedListener) (this)));
	//   15   30:aload_1         
	//   16   31:aload_0         
	//   17   32:invokevirtual   #79  <Method void Spinner.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
		return ((Spinner) (appcompatspinner));
	//   18   35:aload_1         
	//   19   36:areturn         
	}

	private boolean isCollapsed()
	{
		Spinner spinner = mTabSpinner;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Spinner mTabSpinner>
	//    2    4:astore_1        
		return spinner != null && spinner.getParent() == this;
	//    3    5:aload_1         
	//    4    6:ifnull          19
	//    5    9:aload_1         
	//    6   10:invokevirtual   #87  <Method android.view.ViewParent Spinner.getParent()>
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
	//*   1    1:invokespecial   #90  <Method boolean isCollapsed()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(mTabSpinner == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #83  <Field Spinner mTabSpinner>
	//*   6   12:ifnonnull       23
			mTabSpinner = createSpinner();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokespecial   #92  <Method Spinner createSpinner()>
	//   10   20:putfield        #83  <Field Spinner mTabSpinner>
		removeView(((View) (mTabLayout)));
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #94  <Field LinearLayoutCompat mTabLayout>
	//   14   28:invokevirtual   #98  <Method void removeView(View)>
		addView(((View) (mTabSpinner)), new android.view.ViewGroup.LayoutParams(-2, -1));
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #83  <Field Spinner mTabSpinner>
	//   18   36:new             #100 <Class android.view.ViewGroup$LayoutParams>
	//   19   39:dup             
	//   20   40:bipush          -2
	//   21   42:iconst_m1       
	//   22   43:invokespecial   #101 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   23   46:invokevirtual   #105 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
		if(mTabSpinner.getAdapter() == null)
	//*  24   49:aload_0         
	//*  25   50:getfield        #83  <Field Spinner mTabSpinner>
	//*  26   53:invokevirtual   #109 <Method android.widget.SpinnerAdapter Spinner.getAdapter()>
	//*  27   56:ifnonnull       74
			mTabSpinner.setAdapter(((android.widget.SpinnerAdapter) (new TabAdapter())));
	//   28   59:aload_0         
	//   29   60:getfield        #83  <Field Spinner mTabSpinner>
	//   30   63:new             #10  <Class ScrollingTabContainerView$TabAdapter>
	//   31   66:dup             
	//   32   67:aload_0         
	//   33   68:invokespecial   #112 <Method void ScrollingTabContainerView$TabAdapter(ScrollingTabContainerView)>
	//   34   71:invokevirtual   #116 <Method void Spinner.setAdapter(android.widget.SpinnerAdapter)>
		Runnable runnable = mTabSelector;
	//   35   74:aload_0         
	//   36   75:getfield        #118 <Field Runnable mTabSelector>
	//   37   78:astore_1        
		if(runnable != null)
	//*  38   79:aload_1         
	//*  39   80:ifnull          94
		{
			removeCallbacks(runnable);
	//   40   83:aload_0         
	//   41   84:aload_1         
	//   42   85:invokevirtual   #122 <Method boolean removeCallbacks(Runnable)>
	//   43   88:pop             
			mTabSelector = null;
	//   44   89:aload_0         
	//   45   90:aconst_null     
	//   46   91:putfield        #118 <Field Runnable mTabSelector>
		}
		mTabSpinner.setSelection(mSelectedTabIndex);
	//   47   94:aload_0         
	//   48   95:getfield        #83  <Field Spinner mTabSpinner>
	//   49   98:aload_0         
	//   50   99:getfield        #124 <Field int mSelectedTabIndex>
	//   51  102:invokevirtual   #128 <Method void Spinner.setSelection(int)>
	//   52  105:return          
	}

	private boolean performExpand()
	{
		if(!isCollapsed())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #90  <Method boolean isCollapsed()>
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
	//    7   11:getfield        #83  <Field Spinner mTabSpinner>
	//    8   14:invokevirtual   #98  <Method void removeView(View)>
			addView(((View) (mTabLayout)), new android.view.ViewGroup.LayoutParams(-2, -1));
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #94  <Field LinearLayoutCompat mTabLayout>
	//   12   22:new             #100 <Class android.view.ViewGroup$LayoutParams>
	//   13   25:dup             
	//   14   26:bipush          -2
	//   15   28:iconst_m1       
	//   16   29:invokespecial   #101 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   17   32:invokevirtual   #105 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
			setTabSelected(mTabSpinner.getSelectedItemPosition());
	//   18   35:aload_0         
	//   19   36:aload_0         
	//   20   37:getfield        #83  <Field Spinner mTabSpinner>
	//   21   40:invokevirtual   #133 <Method int Spinner.getSelectedItemPosition()>
	//   22   43:invokevirtual   #136 <Method void setTabSelected(int)>
			return false;
	//   23   46:iconst_0        
	//   24   47:ireturn         
		}
	}

	public void animateToTab(int i)
	{
		final View tabView = mTabLayout.getChildAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field LinearLayoutCompat mTabLayout>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #143 <Method View LinearLayoutCompat.getChildAt(int)>
	//    4    8:astore_2        
		Runnable runnable = mTabSelector;
	//    5    9:aload_0         
	//    6   10:getfield        #118 <Field Runnable mTabSelector>
	//    7   13:astore_3        
		if(runnable != null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          24
			removeCallbacks(runnable);
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:invokevirtual   #122 <Method boolean removeCallbacks(Runnable)>
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
	//   19   31:invokespecial   #146 <Method void ScrollingTabContainerView$1(ScrollingTabContainerView, View)>
	//   20   34:putfield        #118 <Field Runnable mTabSelector>
		post(mTabSelector);
	//   21   37:aload_0         
	//   22   38:aload_0         
	//   23   39:getfield        #118 <Field Runnable mTabSelector>
	//   24   42:invokevirtual   #149 <Method boolean post(Runnable)>
	//   25   45:pop             
	//   26   46:return          
	}

	TabView createTabView(android.support.v7.app.ActionBar.Tab tab, boolean flag)
	{
		tab = ((android.support.v7.app.ActionBar.Tab) (new TabView(getContext(), tab, flag)));
	//    0    0:new             #16  <Class ScrollingTabContainerView$TabView>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #56  <Method Context getContext()>
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokespecial   #154 <Method void ScrollingTabContainerView$TabView(ScrollingTabContainerView, Context, android.support.v7.app.ActionBar$Tab, boolean)>
	//    8   14:astore_1        
		if(flag)
	//*   9   15:iload_2         
	//*  10   16:ifeq            42
		{
			((TabView) (tab)).setBackgroundDrawable(((android.graphics.drawable.Drawable) (null)));
	//   11   19:aload_1         
	//   12   20:aconst_null     
	//   13   21:invokevirtual   #158 <Method void ScrollingTabContainerView$TabView.setBackgroundDrawable(android.graphics.drawable.Drawable)>
			((TabView) (tab)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.AbsListView.LayoutParams(-1, mContentHeight))));
	//   14   24:aload_1         
	//   15   25:new             #160 <Class android.widget.AbsListView$LayoutParams>
	//   16   28:dup             
	//   17   29:iconst_m1       
	//   18   30:aload_0         
	//   19   31:getfield        #162 <Field int mContentHeight>
	//   20   34:invokespecial   #163 <Method void android.widget.AbsListView$LayoutParams(int, int)>
	//   21   37:invokevirtual   #164 <Method void ScrollingTabContainerView$TabView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			return ((TabView) (tab));
	//   22   40:aload_1         
	//   23   41:areturn         
		}
		((TabView) (tab)).setFocusable(true);
	//   24   42:aload_1         
	//   25   43:iconst_1        
	//   26   44:invokevirtual   #168 <Method void ScrollingTabContainerView$TabView.setFocusable(boolean)>
		if(mTabClickListener == null)
	//*  27   47:aload_0         
	//*  28   48:getfield        #170 <Field ScrollingTabContainerView$TabClickListener mTabClickListener>
	//*  29   51:ifnonnull       66
			mTabClickListener = new TabClickListener();
	//   30   54:aload_0         
	//   31   55:new             #13  <Class ScrollingTabContainerView$TabClickListener>
	//   32   58:dup             
	//   33   59:aload_0         
	//   34   60:invokespecial   #171 <Method void ScrollingTabContainerView$TabClickListener(ScrollingTabContainerView)>
	//   35   63:putfield        #170 <Field ScrollingTabContainerView$TabClickListener mTabClickListener>
		((TabView) (tab)).setOnClickListener(((android.view.View.OnClickListener) (mTabClickListener)));
	//   36   66:aload_1         
	//   37   67:aload_0         
	//   38   68:getfield        #170 <Field ScrollingTabContainerView$TabClickListener mTabClickListener>
	//   39   71:invokevirtual   #175 <Method void ScrollingTabContainerView$TabView.setOnClickListener(android.view.View$OnClickListener)>
		return ((TabView) (tab));
	//   40   74:aload_1         
	//   41   75:areturn         
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #178 <Method void HorizontalScrollView.onAttachedToWindow()>
		Runnable runnable = mTabSelector;
	//    2    4:aload_0         
	//    3    5:getfield        #118 <Field Runnable mTabSelector>
	//    4    8:astore_1        
		if(runnable != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          19
			post(runnable);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #149 <Method boolean post(Runnable)>
	//   10   18:pop             
	//   11   19:return          
	}

	protected void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #182 <Method void HorizontalScrollView.onConfigurationChanged(Configuration)>
		configuration = ((Configuration) (ActionBarPolicy.get(getContext())));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #56  <Method Context getContext()>
	//    5    9:invokestatic    #188 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
	//    6   12:astore_1        
		setContentHeight(((ActionBarPolicy) (configuration)).getTabContainerHeight());
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #191 <Method int ActionBarPolicy.getTabContainerHeight()>
	//   10   18:invokevirtual   #194 <Method void setContentHeight(int)>
		mStackedTabMaxWidth = ((ActionBarPolicy) (configuration)).getStackedTabMaxWidth();
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #197 <Method int ActionBarPolicy.getStackedTabMaxWidth()>
	//   14   26:putfield        #199 <Field int mStackedTabMaxWidth>
	//   15   29:return          
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #202 <Method void HorizontalScrollView.onDetachedFromWindow()>
		Runnable runnable = mTabSelector;
	//    2    4:aload_0         
	//    3    5:getfield        #118 <Field Runnable mTabSelector>
	//    4    8:astore_1        
		if(runnable != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          19
			removeCallbacks(runnable);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #122 <Method boolean removeCallbacks(Runnable)>
	//   10   18:pop             
	//   11   19:return          
	}

	public void onItemSelected(AdapterView adapterview, View view, int i, long l)
	{
		((TabView)view).getTab().select();
	//    0    0:aload_2         
	//    1    1:checkcast       #16  <Class ScrollingTabContainerView$TabView>
	//    2    4:invokevirtual   #208 <Method android.support.v7.app.ActionBar$Tab ScrollingTabContainerView$TabView.getTab()>
	//    3    7:invokevirtual   #213 <Method void android.support.v7.app.ActionBar$Tab.select()>
	//    4   10:return          
	}

	public void onMeasure(int i, int j)
	{
		int k = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #222 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_3        
		j = 1;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		boolean flag;
		if(k == 0x40000000)
	//*   5    7:iload_3         
	//*   6    8:ldc1            #223 <Int 0x40000000>
	//*   7   10:icmpne          19
			flag = true;
	//    8   13:iconst_1        
	//    9   14:istore          5
		else
	//*  10   16:goto            22
			flag = false;
	//   11   19:iconst_0        
	//   12   20:istore          5
		setFillViewport(flag);
	//   13   22:aload_0         
	//   14   23:iload           5
	//   15   25:invokevirtual   #226 <Method void setFillViewport(boolean)>
		int l = mTabLayout.getChildCount();
	//   16   28:aload_0         
	//   17   29:getfield        #94  <Field LinearLayoutCompat mTabLayout>
	//   18   32:invokevirtual   #229 <Method int LinearLayoutCompat.getChildCount()>
	//   19   35:istore          4
		if(l > 1 && (k == 0x40000000 || k == 0x80000000))
	//*  20   37:iload           4
	//*  21   39:iconst_1        
	//*  22   40:icmple          105
	//*  23   43:iload_3         
	//*  24   44:ldc1            #223 <Int 0x40000000>
	//*  25   46:icmpeq          55
	//*  26   49:iload_3         
	//*  27   50:ldc1            #230 <Int 0x80000000>
	//*  28   52:icmpne          105
		{
			if(l > 2)
	//*  29   55:iload           4
	//*  30   57:iconst_2        
	//*  31   58:icmple          77
				mMaxTabWidth = (int)((float)android.view.View.MeasureSpec.getSize(i) * 0.4F);
	//   32   61:aload_0         
	//   33   62:iload_1         
	//   34   63:invokestatic    #233 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   35   66:i2f             
	//   36   67:ldc1            #234 <Float 0.4F>
	//   37   69:fmul            
	//   38   70:f2i             
	//   39   71:putfield        #236 <Field int mMaxTabWidth>
			else
	//*  40   74:goto            87
				mMaxTabWidth = android.view.View.MeasureSpec.getSize(i) / 2;
	//   41   77:aload_0         
	//   42   78:iload_1         
	//   43   79:invokestatic    #233 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   44   82:iconst_2        
	//   45   83:idiv            
	//   46   84:putfield        #236 <Field int mMaxTabWidth>
			mMaxTabWidth = Math.min(mMaxTabWidth, mStackedTabMaxWidth);
	//   47   87:aload_0         
	//   48   88:aload_0         
	//   49   89:getfield        #236 <Field int mMaxTabWidth>
	//   50   92:aload_0         
	//   51   93:getfield        #199 <Field int mStackedTabMaxWidth>
	//   52   96:invokestatic    #242 <Method int Math.min(int, int)>
	//   53   99:putfield        #236 <Field int mMaxTabWidth>
		} else
	//*  54  102:goto            110
		{
			mMaxTabWidth = -1;
	//   55  105:aload_0         
	//   56  106:iconst_m1       
	//   57  107:putfield        #236 <Field int mMaxTabWidth>
		}
		k = android.view.View.MeasureSpec.makeMeasureSpec(mContentHeight, 0x40000000);
	//   58  110:aload_0         
	//   59  111:getfield        #162 <Field int mContentHeight>
	//   60  114:ldc1            #223 <Int 0x40000000>
	//   61  116:invokestatic    #245 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   62  119:istore_3        
		if(flag || !mAllowCollapse)
	//*  63  120:iload           5
	//*  64  122:ifne            135
	//*  65  125:aload_0         
	//*  66  126:getfield        #247 <Field boolean mAllowCollapse>
	//*  67  129:ifeq            135
	//*  68  132:goto            137
			j = 0;
	//   69  135:iconst_0        
	//   70  136:istore_2        
		if(j != 0)
	//*  71  137:iload_2         
	//*  72  138:ifeq            179
		{
			mTabLayout.measure(0, k);
	//   73  141:aload_0         
	//   74  142:getfield        #94  <Field LinearLayoutCompat mTabLayout>
	//   75  145:iconst_0        
	//   76  146:iload_3         
	//   77  147:invokevirtual   #250 <Method void LinearLayoutCompat.measure(int, int)>
			if(mTabLayout.getMeasuredWidth() > android.view.View.MeasureSpec.getSize(i))
	//*  78  150:aload_0         
	//*  79  151:getfield        #94  <Field LinearLayoutCompat mTabLayout>
	//*  80  154:invokevirtual   #253 <Method int LinearLayoutCompat.getMeasuredWidth()>
	//*  81  157:iload_1         
	//*  82  158:invokestatic    #233 <Method int android.view.View$MeasureSpec.getSize(int)>
	//*  83  161:icmple          171
				performCollapse();
	//   84  164:aload_0         
	//   85  165:invokespecial   #255 <Method void performCollapse()>
			else
	//*  86  168:goto            184
				performExpand();
	//   87  171:aload_0         
	//   88  172:invokespecial   #257 <Method boolean performExpand()>
	//   89  175:pop             
		} else
	//*  90  176:goto            184
		{
			performExpand();
	//   91  179:aload_0         
	//   92  180:invokespecial   #257 <Method boolean performExpand()>
	//   93  183:pop             
		}
		j = getMeasuredWidth();
	//   94  184:aload_0         
	//   95  185:invokevirtual   #258 <Method int getMeasuredWidth()>
	//   96  188:istore_2        
		super.onMeasure(i, k);
	//   97  189:aload_0         
	//   98  190:iload_1         
	//   99  191:iload_3         
	//  100  192:invokespecial   #260 <Method void HorizontalScrollView.onMeasure(int, int)>
		i = getMeasuredWidth();
	//  101  195:aload_0         
	//  102  196:invokevirtual   #258 <Method int getMeasuredWidth()>
	//  103  199:istore_1        
		if(flag && j != i)
	//* 104  200:iload           5
	//* 105  202:ifeq            218
	//* 106  205:iload_2         
	//* 107  206:iload_1         
	//* 108  207:icmpeq          218
			setTabSelected(mSelectedTabIndex);
	//  109  210:aload_0         
	//  110  211:aload_0         
	//  111  212:getfield        #124 <Field int mSelectedTabIndex>
	//  112  215:invokevirtual   #136 <Method void setTabSelected(int)>
	//  113  218:return          
	}

	public void onNothingSelected(AdapterView adapterview)
	{
	//    0    0:return          
	}

	public void setAllowCollapse(boolean flag)
	{
		mAllowCollapse = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #247 <Field boolean mAllowCollapse>
	//    3    5:return          
	}

	public void setContentHeight(int i)
	{
		mContentHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #162 <Field int mContentHeight>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #267 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setTabSelected(int i)
	{
		mSelectedTabIndex = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #124 <Field int mSelectedTabIndex>
		int k = mTabLayout.getChildCount();
	//    3    5:aload_0         
	//    4    6:getfield        #94  <Field LinearLayoutCompat mTabLayout>
	//    5    9:invokevirtual   #229 <Method int LinearLayoutCompat.getChildCount()>
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
	//   13   21:getfield        #94  <Field LinearLayoutCompat mTabLayout>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #143 <Method View LinearLayoutCompat.getChildAt(int)>
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
	//   27   48:invokevirtual   #272 <Method void View.setSelected(boolean)>
			if(flag)
	//*  28   51:iload           4
	//*  29   53:ifeq            61
				animateToTab(i);
	//   30   56:aload_0         
	//   31   57:iload_1         
	//   32   58:invokevirtual   #274 <Method void animateToTab(int)>
		}

	//   33   61:iload_2         
	//   34   62:iconst_1        
	//   35   63:iadd            
	//   36   64:istore_2        
	//*  37   65:goto            15
		Spinner spinner = mTabSpinner;
	//   38   68:aload_0         
	//   39   69:getfield        #83  <Field Spinner mTabSpinner>
	//   40   72:astore          5
		if(spinner != null && i >= 0)
	//*  41   74:aload           5
	//*  42   76:ifnull          89
	//*  43   79:iload_1         
	//*  44   80:iflt            89
			spinner.setSelection(i);
	//   45   83:aload           5
	//   46   85:iload_1         
	//   47   86:invokevirtual   #128 <Method void Spinner.setSelection(int)>
	//   48   89:return          
	}

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

	static 
	{
	//    0    0:new             #42  <Class DecelerateInterpolator>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void DecelerateInterpolator()>
	//    3    7:putstatic       #47  <Field Interpolator sAlphaInterpolator>
	//*   4   10:return          
	}
}
