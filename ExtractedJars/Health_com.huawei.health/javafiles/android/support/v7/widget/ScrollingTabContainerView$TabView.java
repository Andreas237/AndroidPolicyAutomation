// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutCompat, ScrollingTabContainerView, TintTypedArray, AppCompatImageView, 
//			AppCompatTextView

class ScrollingTabContainerView$TabView extends LinearLayoutCompat
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
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   3    5:getstatic       #99  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          14
	//*   5   10:icmplt          22
			accessibilitynodeinfo.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$Tab)).getName())));
	//    6   13:aload_1         
	//    7   14:ldc1            #78  <Class android.support.v7.app.ActionBar$Tab>
	//    8   16:invokevirtual   #84  <Method String Class.getName()>
	//    9   19:invokevirtual   #102 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
	//   10   22:return          
	}

	public void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #106 <Method void LinearLayoutCompat.onMeasure(int, int)>
		if(mMaxTabWidth > 0 && getMeasuredWidth() > mMaxTabWidth)
	//*   4    6:aload_0         
	//*   5    7:getfield        #23  <Field ScrollingTabContainerView this$0>
	//*   6   10:getfield        #109 <Field int ScrollingTabContainerView.mMaxTabWidth>
	//*   7   13:ifle            47
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #113 <Method int getMeasuredWidth()>
	//*  10   20:aload_0         
	//*  11   21:getfield        #23  <Field ScrollingTabContainerView this$0>
	//*  12   24:getfield        #109 <Field int ScrollingTabContainerView.mMaxTabWidth>
	//*  13   27:icmple          47
			super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(mMaxTabWidth, 0x40000000), j);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #23  <Field ScrollingTabContainerView this$0>
	//   17   35:getfield        #109 <Field int ScrollingTabContainerView.mMaxTabWidth>
	//   18   38:ldc1            #114 <Int 0x40000000>
	//   19   40:invokestatic    #120 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   20   43:iload_2         
	//   21   44:invokespecial   #106 <Method void LinearLayoutCompat.onMeasure(int, int)>
	//   22   47:return          
	}

	public void setSelected(boolean flag)
	{
		boolean flag1;
		if(isSelected() != flag)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #126 <Method boolean isSelected()>
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
	//   11   17:invokespecial   #128 <Method void LinearLayoutCompat.setSelected(boolean)>
		if(flag1 && flag)
	//*  12   20:iload_2         
	//*  13   21:ifeq            33
	//*  14   24:iload_1         
	//*  15   25:ifeq            33
			sendAccessibilityEvent(4);
	//   16   28:aload_0         
	//   17   29:iconst_4        
	//   18   30:invokevirtual   #131 <Method void sendAccessibilityEvent(int)>
	//   19   33:return          
	}

	public void update()
	{
		Object obj = ((Object) (mTab));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field android.support.v7.app.ActionBar$Tab mTab>
	//    2    4:astore_2        
		Object obj1 = ((Object) (((android.support.v7.app.ActionBar.Tab) (obj)).getCustomView()));
	//    3    5:aload_2         
	//    4    6:invokevirtual   #135 <Method View android.support.v7.app.ActionBar$Tab.getCustomView()>
	//    5    9:astore_3        
		if(obj1 != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          87
		{
			obj = ((Object) (((View) (obj1)).getParent()));
	//    8   14:aload_3         
	//    9   15:invokevirtual   #141 <Method android.view.ViewParent View.getParent()>
	//   10   18:astore_2        
			if(obj != this)
	//*  11   19:aload_2         
	//*  12   20:aload_0         
	//*  13   21:if_acmpeq       41
			{
				if(obj != null)
	//*  14   24:aload_2         
	//*  15   25:ifnull          36
					((ViewGroup)obj).removeView(((View) (obj1)));
	//   16   28:aload_2         
	//   17   29:checkcast       #143 <Class ViewGroup>
	//   18   32:aload_3         
	//   19   33:invokevirtual   #147 <Method void ViewGroup.removeView(View)>
				addView(((View) (obj1)));
	//   20   36:aload_0         
	//   21   37:aload_3         
	//   22   38:invokevirtual   #150 <Method void addView(View)>
			}
			mCustomView = ((View) (obj1));
	//   23   41:aload_0         
	//   24   42:aload_3         
	//   25   43:putfield        #152 <Field View mCustomView>
			if(mTextView != null)
	//*  26   46:aload_0         
	//*  27   47:getfield        #154 <Field TextView mTextView>
	//*  28   50:ifnull          62
				mTextView.setVisibility(8);
	//   29   53:aload_0         
	//   30   54:getfield        #154 <Field TextView mTextView>
	//   31   57:bipush          8
	//   32   59:invokevirtual   #159 <Method void TextView.setVisibility(int)>
			if(mIconView != null)
	//*  33   62:aload_0         
	//*  34   63:getfield        #161 <Field ImageView mIconView>
	//*  35   66:ifnull          86
			{
				mIconView.setVisibility(8);
	//   36   69:aload_0         
	//   37   70:getfield        #161 <Field ImageView mIconView>
	//   38   73:bipush          8
	//   39   75:invokevirtual   #164 <Method void ImageView.setVisibility(int)>
				mIconView.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//   40   78:aload_0         
	//   41   79:getfield        #161 <Field ImageView mIconView>
	//   42   82:aconst_null     
	//   43   83:invokevirtual   #167 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			}
			return;
	//   44   86:return          
		}
		if(mCustomView != null)
	//*  45   87:aload_0         
	//*  46   88:getfield        #152 <Field View mCustomView>
	//*  47   91:ifnull          107
		{
			removeView(mCustomView);
	//   48   94:aload_0         
	//   49   95:aload_0         
	//   50   96:getfield        #152 <Field View mCustomView>
	//   51   99:invokevirtual   #168 <Method void removeView(View)>
			mCustomView = null;
	//   52  102:aload_0         
	//   53  103:aconst_null     
	//   54  104:putfield        #152 <Field View mCustomView>
		}
		android.graphics.drawable.Drawable drawable = ((android.support.v7.app.ActionBar.Tab) (obj)).getIcon();
	//   55  107:aload_2         
	//   56  108:invokevirtual   #172 <Method android.graphics.drawable.Drawable android.support.v7.app.ActionBar$Tab.getIcon()>
	//   57  111:astore          4
		obj1 = ((Object) (((android.support.v7.app.ActionBar.Tab) (obj)).getText()));
	//   58  113:aload_2         
	//   59  114:invokevirtual   #176 <Method CharSequence android.support.v7.app.ActionBar$Tab.getText()>
	//   60  117:astore_3        
		if(drawable != null)
	//*  61  118:aload           4
	//*  62  120:ifnull          203
		{
			if(mIconView == null)
	//*  63  123:aload_0         
	//*  64  124:getfield        #161 <Field ImageView mIconView>
	//*  65  127:ifnonnull       183
			{
				AppCompatImageView appcompatimageview = new AppCompatImageView(getContext());
	//   66  130:new             #178 <Class AppCompatImageView>
	//   67  133:dup             
	//   68  134:aload_0         
	//   69  135:invokevirtual   #182 <Method Context getContext()>
	//   70  138:invokespecial   #185 <Method void AppCompatImageView(Context)>
	//   71  141:astore          5
				LinearLayoutCompat.LayoutParams layoutparams1 = new LinearLayoutCompat.LayoutParams(-2, -2);
	//   72  143:new             #187 <Class LinearLayoutCompat$LayoutParams>
	//   73  146:dup             
	//   74  147:bipush          -2
	//   75  149:bipush          -2
	//   76  151:invokespecial   #189 <Method void LinearLayoutCompat$LayoutParams(int, int)>
	//   77  154:astore          6
				layoutparams1.gravity = 16;
	//   78  156:aload           6
	//   79  158:bipush          16
	//   80  160:putfield        #192 <Field int LinearLayoutCompat$LayoutParams.gravity>
				((ImageView) (appcompatimageview)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//   81  163:aload           5
	//   82  165:aload           6
	//   83  167:invokevirtual   #196 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				addView(((View) (appcompatimageview)), 0);
	//   84  170:aload_0         
	//   85  171:aload           5
	//   86  173:iconst_0        
	//   87  174:invokevirtual   #199 <Method void addView(View, int)>
				mIconView = ((ImageView) (appcompatimageview));
	//   88  177:aload_0         
	//   89  178:aload           5
	//   90  180:putfield        #161 <Field ImageView mIconView>
			}
			mIconView.setImageDrawable(drawable);
	//   91  183:aload_0         
	//   92  184:getfield        #161 <Field ImageView mIconView>
	//   93  187:aload           4
	//   94  189:invokevirtual   #167 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			mIconView.setVisibility(0);
	//   95  192:aload_0         
	//   96  193:getfield        #161 <Field ImageView mIconView>
	//   97  196:iconst_0        
	//   98  197:invokevirtual   #164 <Method void ImageView.setVisibility(int)>
		} else
	//*  99  200:goto            227
		if(mIconView != null)
	//* 100  203:aload_0         
	//* 101  204:getfield        #161 <Field ImageView mIconView>
	//* 102  207:ifnull          227
		{
			mIconView.setVisibility(8);
	//  103  210:aload_0         
	//  104  211:getfield        #161 <Field ImageView mIconView>
	//  105  214:bipush          8
	//  106  216:invokevirtual   #164 <Method void ImageView.setVisibility(int)>
			mIconView.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//  107  219:aload_0         
	//  108  220:getfield        #161 <Field ImageView mIconView>
	//  109  223:aconst_null     
	//  110  224:invokevirtual   #167 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		}
		boolean flag;
		if(!TextUtils.isEmpty(((CharSequence) (obj1))))
	//* 111  227:aload_3         
	//* 112  228:invokestatic    #205 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 113  231:ifne            239
			flag = true;
	//  114  234:iconst_1        
	//  115  235:istore_1        
		else
	//* 116  236:goto            241
			flag = false;
	//  117  239:iconst_0        
	//  118  240:istore_1        
		if(flag)
	//* 119  241:iload_1         
	//* 120  242:ifeq            335
		{
			if(mTextView == null)
	//* 121  245:aload_0         
	//* 122  246:getfield        #154 <Field TextView mTextView>
	//* 123  249:ifnonnull       316
			{
				AppCompatTextView appcompattextview = new AppCompatTextView(getContext(), ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.attr.actionBarTabTextStyle);
	//  124  252:new             #207 <Class AppCompatTextView>
	//  125  255:dup             
	//  126  256:aload_0         
	//  127  257:invokevirtual   #182 <Method Context getContext()>
	//  128  260:aconst_null     
	//  129  261:getstatic       #210 <Field int android.support.v7.appcompat.R$attr.actionBarTabTextStyle>
	//  130  264:invokespecial   #211 <Method void AppCompatTextView(Context, android.util.AttributeSet, int)>
	//  131  267:astore          4
				((TextView) (appcompattextview)).setEllipsize(android.text.TextUtils.TruncateAt.END);
	//  132  269:aload           4
	//  133  271:getstatic       #217 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//  134  274:invokevirtual   #221 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
				LinearLayoutCompat.LayoutParams layoutparams = new LinearLayoutCompat.LayoutParams(-2, -2);
	//  135  277:new             #187 <Class LinearLayoutCompat$LayoutParams>
	//  136  280:dup             
	//  137  281:bipush          -2
	//  138  283:bipush          -2
	//  139  285:invokespecial   #189 <Method void LinearLayoutCompat$LayoutParams(int, int)>
	//  140  288:astore          5
				layoutparams.gravity = 16;
	//  141  290:aload           5
	//  142  292:bipush          16
	//  143  294:putfield        #192 <Field int LinearLayoutCompat$LayoutParams.gravity>
				((TextView) (appcompattextview)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//  144  297:aload           4
	//  145  299:aload           5
	//  146  301:invokevirtual   #222 <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				addView(((View) (appcompattextview)));
	//  147  304:aload_0         
	//  148  305:aload           4
	//  149  307:invokevirtual   #150 <Method void addView(View)>
				mTextView = ((TextView) (appcompattextview));
	//  150  310:aload_0         
	//  151  311:aload           4
	//  152  313:putfield        #154 <Field TextView mTextView>
			}
			mTextView.setText(((CharSequence) (obj1)));
	//  153  316:aload_0         
	//  154  317:getfield        #154 <Field TextView mTextView>
	//  155  320:aload_3         
	//  156  321:invokevirtual   #225 <Method void TextView.setText(CharSequence)>
			mTextView.setVisibility(0);
	//  157  324:aload_0         
	//  158  325:getfield        #154 <Field TextView mTextView>
	//  159  328:iconst_0        
	//  160  329:invokevirtual   #159 <Method void TextView.setVisibility(int)>
		} else
	//* 161  332:goto            359
		if(mTextView != null)
	//* 162  335:aload_0         
	//* 163  336:getfield        #154 <Field TextView mTextView>
	//* 164  339:ifnull          359
		{
			mTextView.setVisibility(8);
	//  165  342:aload_0         
	//  166  343:getfield        #154 <Field TextView mTextView>
	//  167  346:bipush          8
	//  168  348:invokevirtual   #159 <Method void TextView.setVisibility(int)>
			mTextView.setText(((CharSequence) (null)));
	//  169  351:aload_0         
	//  170  352:getfield        #154 <Field TextView mTextView>
	//  171  355:aconst_null     
	//  172  356:invokevirtual   #225 <Method void TextView.setText(CharSequence)>
		}
		if(mIconView != null)
	//* 173  359:aload_0         
	//* 174  360:getfield        #161 <Field ImageView mIconView>
	//* 175  363:ifnull          377
			mIconView.setContentDescription(((android.support.v7.app.ActionBar.Tab) (obj)).getContentDescription());
	//  176  366:aload_0         
	//  177  367:getfield        #161 <Field ImageView mIconView>
	//  178  370:aload_2         
	//  179  371:invokevirtual   #228 <Method CharSequence android.support.v7.app.ActionBar$Tab.getContentDescription()>
	//  180  374:invokevirtual   #231 <Method void ImageView.setContentDescription(CharSequence)>
		if(flag)
	//* 181  377:iload_1         
	//* 182  378:ifeq            386
			obj = null;
	//  183  381:aconst_null     
	//  184  382:astore_2        
		else
	//* 185  383:goto            391
			obj = ((Object) (((android.support.v7.app.ActionBar.Tab) (obj)).getContentDescription()));
	//  186  386:aload_2         
	//  187  387:invokevirtual   #228 <Method CharSequence android.support.v7.app.ActionBar$Tab.getContentDescription()>
	//  188  390:astore_2        
		ViewCompat.setTooltipText(((View) (this)), ((CharSequence) (obj)));
	//  189  391:aload_0         
	//  190  392:aload_2         
	//  191  393:invokestatic    #237 <Method void ViewCompat.setTooltipText(View, CharSequence)>
	//  192  396:return          
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
