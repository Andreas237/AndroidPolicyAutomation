// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.*;

// Referenced classes of package android.support.v7.widget:
//			ScrollingTabContainerView, TintTypedArray, AppCompatImageView, AppCompatTextView, 
//			TooltipCompat

private class ScrollingTabContainerView$TabView extends LinearLayout
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

	public ScrollingTabContainerView$TabView(Context context, android.support.v7.app.ActionBar.Tab tab, boolean flag)
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
