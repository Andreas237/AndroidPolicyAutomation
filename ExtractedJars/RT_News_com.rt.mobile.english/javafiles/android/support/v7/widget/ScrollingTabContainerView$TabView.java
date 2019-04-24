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
	//*   9   15:ifnull          95
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
	//*  37   74:ifnull          398
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
				return;
	//   46   94:return          
			}
		} else
		{
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
			CharSequence charsequence = tab.getText();
	//   60  121:aload_3         
	//   61  122:invokevirtual   #171 <Method CharSequence android.support.v7.app.ActionBar$Tab.getText()>
	//   62  125:astore          4
			if(drawable != null)
	//*  63  127:aload           5
	//*  64  129:ifnull          212
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
					android.widget.LinearLayout.LayoutParams layoutparams1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
	//   74  152:new             #182 <Class android.widget.LinearLayout$LayoutParams>
	//   75  155:dup             
	//   76  156:bipush          -2
	//   77  158:bipush          -2
	//   78  160:invokespecial   #184 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   79  163:astore          7
					layoutparams1.gravity = 16;
	//   80  165:aload           7
	//   81  167:bipush          16
	//   82  169:putfield        #187 <Field int android.widget.LinearLayout$LayoutParams.gravity>
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
	//* 101  209:goto            236
			if(mIconView != null)
	//* 102  212:aload_0         
	//* 103  213:getfield        #156 <Field ImageView mIconView>
	//* 104  216:ifnull          236
			{
				mIconView.setVisibility(8);
	//  105  219:aload_0         
	//  106  220:getfield        #156 <Field ImageView mIconView>
	//  107  223:bipush          8
	//  108  225:invokevirtual   #159 <Method void ImageView.setVisibility(int)>
				mIconView.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//  109  228:aload_0         
	//  110  229:getfield        #156 <Field ImageView mIconView>
	//  111  232:aconst_null     
	//  112  233:invokevirtual   #162 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			}
			boolean flag = TextUtils.isEmpty(charsequence) ^ true;
	//  113  236:aload           4
	//  114  238:invokestatic    #200 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  115  241:iconst_1        
	//  116  242:ixor            
	//  117  243:istore_1        
			if(flag)
	//* 118  244:iload_1         
	//* 119  245:ifeq            339
			{
				if(mTextView == null)
	//* 120  248:aload_0         
	//* 121  249:getfield        #149 <Field TextView mTextView>
	//* 122  252:ifnonnull       319
				{
					AppCompatTextView appcompattextview = new AppCompatTextView(getContext(), ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.attr.actionBarTabTextStyle);
	//  123  255:new             #202 <Class AppCompatTextView>
	//  124  258:dup             
	//  125  259:aload_0         
	//  126  260:invokevirtual   #177 <Method Context getContext()>
	//  127  263:aconst_null     
	//  128  264:getstatic       #205 <Field int android.support.v7.appcompat.R$attr.actionBarTabTextStyle>
	//  129  267:invokespecial   #206 <Method void AppCompatTextView(Context, android.util.AttributeSet, int)>
	//  130  270:astore          5
					((TextView) (appcompattextview)).setEllipsize(android.text.TextUtils.TruncateAt.END);
	//  131  272:aload           5
	//  132  274:getstatic       #212 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//  133  277:invokevirtual   #216 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
					android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
	//  134  280:new             #182 <Class android.widget.LinearLayout$LayoutParams>
	//  135  283:dup             
	//  136  284:bipush          -2
	//  137  286:bipush          -2
	//  138  288:invokespecial   #184 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//  139  291:astore          6
					layoutparams.gravity = 16;
	//  140  293:aload           6
	//  141  295:bipush          16
	//  142  297:putfield        #187 <Field int android.widget.LinearLayout$LayoutParams.gravity>
					((TextView) (appcompattextview)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//  143  300:aload           5
	//  144  302:aload           6
	//  145  304:invokevirtual   #217 <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
					addView(((View) (appcompattextview)));
	//  146  307:aload_0         
	//  147  308:aload           5
	//  148  310:invokevirtual   #145 <Method void addView(View)>
					mTextView = ((TextView) (appcompattextview));
	//  149  313:aload_0         
	//  150  314:aload           5
	//  151  316:putfield        #149 <Field TextView mTextView>
				}
				mTextView.setText(charsequence);
	//  152  319:aload_0         
	//  153  320:getfield        #149 <Field TextView mTextView>
	//  154  323:aload           4
	//  155  325:invokevirtual   #220 <Method void TextView.setText(CharSequence)>
				mTextView.setVisibility(0);
	//  156  328:aload_0         
	//  157  329:getfield        #149 <Field TextView mTextView>
	//  158  332:iconst_0        
	//  159  333:invokevirtual   #154 <Method void TextView.setVisibility(int)>
			} else
	//* 160  336:goto            363
			if(mTextView != null)
	//* 161  339:aload_0         
	//* 162  340:getfield        #149 <Field TextView mTextView>
	//* 163  343:ifnull          363
			{
				mTextView.setVisibility(8);
	//  164  346:aload_0         
	//  165  347:getfield        #149 <Field TextView mTextView>
	//  166  350:bipush          8
	//  167  352:invokevirtual   #154 <Method void TextView.setVisibility(int)>
				mTextView.setText(((CharSequence) (null)));
	//  168  355:aload_0         
	//  169  356:getfield        #149 <Field TextView mTextView>
	//  170  359:aconst_null     
	//  171  360:invokevirtual   #220 <Method void TextView.setText(CharSequence)>
			}
			if(mIconView != null)
	//* 172  363:aload_0         
	//* 173  364:getfield        #156 <Field ImageView mIconView>
	//* 174  367:ifnull          381
				mIconView.setContentDescription(tab.getContentDescription());
	//  175  370:aload_0         
	//  176  371:getfield        #156 <Field ImageView mIconView>
	//  177  374:aload_3         
	//  178  375:invokevirtual   #223 <Method CharSequence android.support.v7.app.ActionBar$Tab.getContentDescription()>
	//  179  378:invokevirtual   #226 <Method void ImageView.setContentDescription(CharSequence)>
			if(!flag)
	//* 180  381:iload_1         
	//* 181  382:ifeq            388
	//* 182  385:goto            393
				obj = ((Object) (tab.getContentDescription()));
	//  183  388:aload_3         
	//  184  389:invokevirtual   #223 <Method CharSequence android.support.v7.app.ActionBar$Tab.getContentDescription()>
	//  185  392:astore_2        
			TooltipCompat.setTooltipText(((View) (this)), ((CharSequence) (obj)));
	//  186  393:aload_0         
	//  187  394:aload_2         
	//  188  395:invokestatic    #232 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
		}
	//  189  398:return          
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
