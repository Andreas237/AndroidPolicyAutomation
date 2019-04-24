// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.PointerIconCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.TooltipCompat;
import android.text.*;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.*;

// Referenced classes of package android.support.design.widget:
//			TabLayout

class TabLayout$TabView extends LinearLayout
{

	private float approximateLineWidth(Layout layout, int i, float f)
	{
		return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #95  <Method float Layout.getLineWidth(int)>
	//    3    5:fload_3         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #99  <Method TextPaint Layout.getPaint()>
	//    6   10:invokevirtual   #105 <Method float TextPaint.getTextSize()>
	//    7   13:fdiv            
	//    8   14:fmul            
	//    9   15:freturn         
	}

	private void updateTextAndIcon(TextView textview, ImageView imageview)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          9
		boolean flag;
		CharSequence charsequence;
		android.graphics.drawable.Drawable drawable;
		CharSequence charsequence1;
		if(mTab != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #110 <Field TabLayout$Tab mTab>
	//*   4    7:ifnull          199
			drawable = mTab.getIcon();
	//    5   10:aload_0         
	//    6   11:getfield        #110 <Field TabLayout$Tab mTab>
	//    7   14:invokevirtual   #116 <Method android.graphics.drawable.Drawable TabLayout$Tab.getIcon()>
	//    8   17:astore          7
		else
	//*   9   19:aload_0         
	//*  10   20:getfield        #110 <Field TabLayout$Tab mTab>
	//*  11   23:ifnull          205
	//*  12   26:aload_0         
	//*  13   27:getfield        #110 <Field TabLayout$Tab mTab>
	//*  14   30:invokevirtual   #120 <Method CharSequence TabLayout$Tab.getText()>
	//*  15   33:astore          8
	//*  16   35:aload_0         
	//*  17   36:getfield        #110 <Field TabLayout$Tab mTab>
	//*  18   39:ifnull          211
	//*  19   42:aload_0         
	//*  20   43:getfield        #110 <Field TabLayout$Tab mTab>
	//*  21   46:invokevirtual   #123 <Method CharSequence TabLayout$Tab.getContentDescription()>
	//*  22   49:astore          6
	//*  23   51:aload_2         
	//*  24   52:ifnull          82
	//*  25   55:aload           7
	//*  26   57:ifnull          217
	//*  27   60:aload_2         
	//*  28   61:aload           7
	//*  29   63:invokevirtual   #129 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
	//*  30   66:aload_2         
	//*  31   67:iconst_0        
	//*  32   68:invokevirtual   #132 <Method void ImageView.setVisibility(int)>
	//*  33   71:aload_0         
	//*  34   72:iconst_0        
	//*  35   73:invokevirtual   #133 <Method void setVisibility(int)>
	//*  36   76:aload_2         
	//*  37   77:aload           6
	//*  38   79:invokevirtual   #137 <Method void ImageView.setContentDescription(CharSequence)>
	//*  39   82:aload           8
	//*  40   84:invokestatic    #143 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  41   87:ifne            231
	//*  42   90:iconst_1        
	//*  43   91:istore_3        
	//*  44   92:aload_1         
	//*  45   93:ifnull          122
	//*  46   96:iload_3         
	//*  47   97:ifeq            236
	//*  48  100:aload_1         
	//*  49  101:aload           8
	//*  50  103:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
	//*  51  106:aload_1         
	//*  52  107:iconst_0        
	//*  53  108:invokevirtual   #149 <Method void TextView.setVisibility(int)>
	//*  54  111:aload_0         
	//*  55  112:iconst_0        
	//*  56  113:invokevirtual   #133 <Method void setVisibility(int)>
	//*  57  116:aload_1         
	//*  58  117:aload           6
	//*  59  119:invokevirtual   #150 <Method void TextView.setContentDescription(CharSequence)>
	//*  60  122:aload_2         
	//*  61  123:ifnull          186
	//*  62  126:aload_2         
	//*  63  127:invokevirtual   #154 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//*  64  130:checkcast       #156 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  65  133:astore_1        
	//*  66  134:iconst_0        
	//*  67  135:istore          5
	//*  68  137:iload           5
	//*  69  139:istore          4
	//*  70  141:iload_3         
	//*  71  142:ifeq            167
	//*  72  145:iload           5
	//*  73  147:istore          4
	//*  74  149:aload_2         
	//*  75  150:invokevirtual   #160 <Method int ImageView.getVisibility()>
	//*  76  153:ifne            167
	//*  77  156:aload_0         
	//*  78  157:getfield        #25  <Field TabLayout this$0>
	//*  79  160:bipush          8
	//*  80  162:invokevirtual   #164 <Method int TabLayout.dpToPx(int)>
	//*  81  165:istore          4
	//*  82  167:iload           4
	//*  83  169:aload_1         
	//*  84  170:getfield        #167 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//*  85  173:icmpeq          186
	//*  86  176:aload_1         
	//*  87  177:iload           4
	//*  88  179:putfield        #167 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//*  89  182:aload_2         
	//*  90  183:invokevirtual   #171 <Method void ImageView.requestLayout()>
	//*  91  186:iload_3         
	//*  92  187:ifeq            250
	//*  93  190:aload           9
	//*  94  192:astore_1        
	//*  95  193:aload_0         
	//*  96  194:aload_1         
	//*  97  195:invokestatic    #177 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
	//*  98  198:return          
			drawable = null;
	//   99  199:aconst_null     
	//  100  200:astore          7
		if(mTab != null)
			charsequence1 = mTab.getText();
		else
	//* 101  202:goto            19
			charsequence1 = null;
	//  102  205:aconst_null     
	//  103  206:astore          8
		if(mTab != null)
			charsequence = mTab.getContentDescription();
		else
	//* 104  208:goto            35
			charsequence = null;
	//  105  211:aconst_null     
	//  106  212:astore          6
		if(imageview != null)
		{
			int i;
			boolean flag1;
			if(drawable != null)
			{
				imageview.setImageDrawable(drawable);
				imageview.setVisibility(0);
				setVisibility(0);
			} else
	//* 107  214:goto            51
			{
				imageview.setVisibility(8);
	//  108  217:aload_2         
	//  109  218:bipush          8
	//  110  220:invokevirtual   #132 <Method void ImageView.setVisibility(int)>
				imageview.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//  111  223:aload_2         
	//  112  224:aconst_null     
	//  113  225:invokevirtual   #129 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			}
			imageview.setContentDescription(charsequence);
		}
		if(!TextUtils.isEmpty(charsequence1))
			flag = true;
		else
	//* 114  228:goto            76
			flag = false;
	//  115  231:iconst_0        
	//  116  232:istore_3        
		if(textview != null)
		{
			if(flag)
			{
				textview.setText(charsequence1);
				textview.setVisibility(0);
				setVisibility(0);
			} else
	//* 117  233:goto            92
			{
				textview.setVisibility(8);
	//  118  236:aload_1         
	//  119  237:bipush          8
	//  120  239:invokevirtual   #149 <Method void TextView.setVisibility(int)>
				textview.setText(((CharSequence) (null)));
	//  121  242:aload_1         
	//  122  243:aconst_null     
	//  123  244:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
			}
			textview.setContentDescription(charsequence);
		}
		if(imageview != null)
		{
			textview = ((TextView) ((android.view.youtParams)imageview.getLayoutParams()));
			flag1 = false;
			i = ((int) (flag1));
			if(flag)
			{
				i = ((int) (flag1));
				if(imageview.getVisibility() == 0)
					i = dpToPx(8);
			}
			if(i != ((android.view.youtParams) (textview)).bottomMargin)
			{
				textview.bottomMargin = i;
				imageview.requestLayout();
			}
		}
		if(flag)
			textview = ((TextView) (obj));
		else
	//* 124  247:goto            116
			textview = ((TextView) (charsequence));
	//  125  250:aload           6
	//  126  252:astore_1        
		TooltipCompat.setTooltipText(((View) (this)), ((CharSequence) (textview)));
	//* 127  253:goto            193
	}

	public TabLayout.Tab getTab()
	{
		return mTab;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field TabLayout$Tab mTab>
	//    2    4:areturn         
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #184 <Method void LinearLayout.onInitializeAccessibilityEvent(AccessibilityEvent)>
		accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$Tab)).getName())));
	//    3    5:aload_1         
	//    4    6:ldc1            #186 <Class android.support.v7.app.ActionBar$Tab>
	//    5    8:invokevirtual   #192 <Method String Class.getName()>
	//    6   11:invokevirtual   #197 <Method void AccessibilityEvent.setClassName(CharSequence)>
	//    7   14:return          
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #201 <Method void LinearLayout.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
		accessibilitynodeinfo.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$Tab)).getName())));
	//    3    5:aload_1         
	//    4    6:ldc1            #186 <Class android.support.v7.app.ActionBar$Tab>
	//    5    8:invokevirtual   #192 <Method String Class.getName()>
	//    6   11:invokevirtual   #204 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
	//    7   14:return          
	}

	public void onMeasure(int i, int j)
	{
		int k = android.view.View.MeasureSpec.getSize(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #211 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    2    4:istore          5
		int i1 = android.view.View.MeasureSpec.getMode(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #214 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    5   10:istore          6
		int k1 = getTabMaxWidth();
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field TabLayout this$0>
	//    8   16:invokevirtual   #217 <Method int TabLayout.getTabMaxWidth()>
	//    9   19:istore          7
		if(k1 > 0 && (i1 == 0 || k > k1))
	//*  10   21:iload           7
	//*  11   23:ifle            270
	//*  12   26:iload           6
	//*  13   28:ifeq            38
	//*  14   31:iload           5
	//*  15   33:iload           7
	//*  16   35:icmple          270
			i = android.view.View.MeasureSpec.makeMeasureSpec(mTabMaxWidth, 0x80000000);
	//   17   38:aload_0         
	//   18   39:getfield        #25  <Field TabLayout this$0>
	//   19   42:getfield        #220 <Field int TabLayout.mTabMaxWidth>
	//   20   45:ldc1            #221 <Int 0x80000000>
	//   21   47:invokestatic    #225 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   22   50:istore_1        
		super.onMeasure(i, j);
	//   23   51:aload_0         
	//   24   52:iload_1         
	//   25   53:iload_2         
	//   26   54:invokespecial   #227 <Method void LinearLayout.onMeasure(int, int)>
		if(mTextView == null) goto _L2; else goto _L1
	//   27   57:aload_0         
	//   28   58:getfield        #229 <Field TextView mTextView>
	//   29   61:ifnull          269
_L1:
		float f1;
		int j1;
		getResources();
	//   30   64:aload_0         
	//   31   65:invokevirtual   #233 <Method android.content.res.Resources getResources()>
	//   32   68:pop             
		f1 = mTabTextSize;
	//   33   69:aload_0         
	//   34   70:getfield        #25  <Field TabLayout this$0>
	//   35   73:getfield        #237 <Field float TabLayout.mTabTextSize>
	//   36   76:fstore          4
		j1 = mDefaultMaxLines;
	//   37   78:aload_0         
	//   38   79:getfield        #30  <Field int mDefaultMaxLines>
	//   39   82:istore          6
		if(mIconView == null || mIconView.getVisibility() != 0) goto _L4; else goto _L3
	//   40   84:aload_0         
	//   41   85:getfield        #239 <Field ImageView mIconView>
	//   42   88:ifnull          273
	//   43   91:aload_0         
	//   44   92:getfield        #239 <Field ImageView mIconView>
	//   45   95:invokevirtual   #160 <Method int ImageView.getVisibility()>
	//   46   98:ifne            273
_L3:
		float f;
		int l;
		l = 1;
	//   47  101:iconst_1        
	//   48  102:istore          5
		f = f1;
	//   49  104:fload           4
	//   50  106:fstore_3        
_L6:
		f1 = mTextView.getTextSize();
	//   51  107:aload_0         
	//   52  108:getfield        #229 <Field TextView mTextView>
	//   53  111:invokevirtual   #240 <Method float TextView.getTextSize()>
	//   54  114:fstore          4
		int l1 = mTextView.getLineCount();
	//   55  116:aload_0         
	//   56  117:getfield        #229 <Field TextView mTextView>
	//   57  120:invokevirtual   #243 <Method int TextView.getLineCount()>
	//   58  123:istore          8
		j1 = TextViewCompat.getMaxLines(mTextView);
	//   59  125:aload_0         
	//   60  126:getfield        #229 <Field TextView mTextView>
	//   61  129:invokestatic    #249 <Method int TextViewCompat.getMaxLines(TextView)>
	//   62  132:istore          6
		if(f != f1 || j1 >= 0 && l != j1)
	//*  63  134:fload_3         
	//*  64  135:fload           4
	//*  65  137:fcmpl           
	//*  66  138:ifne            153
	//*  67  141:iload           6
	//*  68  143:iflt            269
	//*  69  146:iload           5
	//*  70  148:iload           6
	//*  71  150:icmpeq          269
		{
label0:
			{
				boolean flag = true;
	//   72  153:iconst_1        
	//   73  154:istore          7
				j1 = ((int) (flag));
	//   74  156:iload           7
	//   75  158:istore          6
				if(mMode != 1)
					break label0;
	//   76  160:aload_0         
	//   77  161:getfield        #25  <Field TabLayout this$0>
	//   78  164:getfield        #252 <Field int TabLayout.mMode>
	//   79  167:iconst_1        
	//   80  168:icmpne          240
				j1 = ((int) (flag));
	//   81  171:iload           7
	//   82  173:istore          6
				if(f <= f1)
					break label0;
	//   83  175:fload_3         
	//   84  176:fload           4
	//   85  178:fcmpl           
	//   86  179:ifle            240
				j1 = ((int) (flag));
	//   87  182:iload           7
	//   88  184:istore          6
				if(l1 != 1)
					break label0;
	//   89  186:iload           8
	//   90  188:iconst_1        
	//   91  189:icmpne          240
				Layout layout = mTextView.getLayout();
	//   92  192:aload_0         
	//   93  193:getfield        #229 <Field TextView mTextView>
	//   94  196:invokevirtual   #256 <Method Layout TextView.getLayout()>
	//   95  199:astore          9
				if(layout != null)
	//*  96  201:aload           9
	//*  97  203:ifnull          237
				{
					j1 = ((int) (flag));
	//   98  206:iload           7
	//   99  208:istore          6
					if(approximateLineWidth(layout, 0, f) <= (float)(getMeasuredWidth() - getPaddingLeft() - getPaddingRight()))
						break label0;
	//  100  210:aload_0         
	//  101  211:aload           9
	//  102  213:iconst_0        
	//  103  214:fload_3         
	//  104  215:invokespecial   #258 <Method float approximateLineWidth(Layout, int, float)>
	//  105  218:aload_0         
	//  106  219:invokevirtual   #261 <Method int getMeasuredWidth()>
	//  107  222:aload_0         
	//  108  223:invokevirtual   #264 <Method int getPaddingLeft()>
	//  109  226:isub            
	//  110  227:aload_0         
	//  111  228:invokevirtual   #267 <Method int getPaddingRight()>
	//  112  231:isub            
	//  113  232:i2f             
	//  114  233:fcmpl           
	//  115  234:ifle            240
				}
				j1 = 0;
	//  116  237:iconst_0        
	//  117  238:istore          6
			}
			if(j1 != 0)
	//* 118  240:iload           6
	//* 119  242:ifeq            269
			{
				mTextView.setTextSize(0, f);
	//  120  245:aload_0         
	//  121  246:getfield        #229 <Field TextView mTextView>
	//  122  249:iconst_0        
	//  123  250:fload_3         
	//  124  251:invokevirtual   #271 <Method void TextView.setTextSize(int, float)>
				mTextView.setMaxLines(l);
	//  125  254:aload_0         
	//  126  255:getfield        #229 <Field TextView mTextView>
	//  127  258:iload           5
	//  128  260:invokevirtual   #274 <Method void TextView.setMaxLines(int)>
				super.onMeasure(i, j);
	//  129  263:aload_0         
	//  130  264:iload_1         
	//  131  265:iload_2         
	//  132  266:invokespecial   #227 <Method void LinearLayout.onMeasure(int, int)>
			}
		}
_L2:
		return;
	//  133  269:return          
	//* 134  270:goto            51
_L4:
		l = j1;
	//  135  273:iload           6
	//  136  275:istore          5
		f = f1;
	//  137  277:fload           4
	//  138  279:fstore_3        
		if(mTextView != null)
	//* 139  280:aload_0         
	//* 140  281:getfield        #229 <Field TextView mTextView>
	//* 141  284:ifnull          107
		{
			l = j1;
	//  142  287:iload           6
	//  143  289:istore          5
			f = f1;
	//  144  291:fload           4
	//  145  293:fstore_3        
			if(mTextView.getLineCount() > 1)
	//* 146  294:aload_0         
	//* 147  295:getfield        #229 <Field TextView mTextView>
	//* 148  298:invokevirtual   #243 <Method int TextView.getLineCount()>
	//* 149  301:iconst_1        
	//* 150  302:icmple          107
			{
				f = mTabTextMultiLineSize;
	//  151  305:aload_0         
	//  152  306:getfield        #25  <Field TabLayout this$0>
	//  153  309:getfield        #277 <Field float TabLayout.mTabTextMultiLineSize>
	//  154  312:fstore_3        
				l = j1;
	//  155  313:iload           6
	//  156  315:istore          5
			}
		}
		if(true) goto _L6; else goto _L5
	//  157  317:goto            107
_L5:
	}

	public boolean performClick()
	{
		boolean flag1 = super.performClick();
	//    0    0:aload_0         
	//    1    1:invokespecial   #281 <Method boolean LinearLayout.performClick()>
	//    2    4:istore_2        
		boolean flag = flag1;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(mTab != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #110 <Field TabLayout$Tab mTab>
	//*   7   11:ifnull          32
		{
			if(!flag1)
	//*   8   14:iload_2         
	//*   9   15:ifne            23
				playSoundEffect(0);
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #284 <Method void playSoundEffect(int)>
			mTab.select();
	//   13   23:aload_0         
	//   14   24:getfield        #110 <Field TabLayout$Tab mTab>
	//   15   27:invokevirtual   #287 <Method void TabLayout$Tab.select()>
			flag = true;
	//   16   30:iconst_1        
	//   17   31:istore_1        
		}
		return flag;
	//   18   32:iload_1         
	//   19   33:ireturn         
	}

	void reset()
	{
		setTab(((TabLayout.Tab) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #292 <Method void setTab(TabLayout$Tab)>
		setSelected(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #295 <Method void setSelected(boolean)>
	//    6   10:return          
	}

	public void setSelected(boolean flag)
	{
		boolean flag1;
		if(isSelected() != flag)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #298 <Method boolean isSelected()>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          82
			flag1 = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		else
	//*   6   10:aload_0         
	//*   7   11:iload_1         
	//*   8   12:invokespecial   #299 <Method void LinearLayout.setSelected(boolean)>
	//*   9   15:iload_2         
	//*  10   16:ifeq            36
	//*  11   19:iload_1         
	//*  12   20:ifeq            36
	//*  13   23:getstatic       #304 <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   26:bipush          16
	//*  15   28:icmpge          36
	//*  16   31:aload_0         
	//*  17   32:iconst_4        
	//*  18   33:invokevirtual   #307 <Method void sendAccessibilityEvent(int)>
	//*  19   36:aload_0         
	//*  20   37:getfield        #229 <Field TextView mTextView>
	//*  21   40:ifnull          51
	//*  22   43:aload_0         
	//*  23   44:getfield        #229 <Field TextView mTextView>
	//*  24   47:iload_1         
	//*  25   48:invokevirtual   #308 <Method void TextView.setSelected(boolean)>
	//*  26   51:aload_0         
	//*  27   52:getfield        #239 <Field ImageView mIconView>
	//*  28   55:ifnull          66
	//*  29   58:aload_0         
	//*  30   59:getfield        #239 <Field ImageView mIconView>
	//*  31   62:iload_1         
	//*  32   63:invokevirtual   #309 <Method void ImageView.setSelected(boolean)>
	//*  33   66:aload_0         
	//*  34   67:getfield        #311 <Field View mCustomView>
	//*  35   70:ifnull          81
	//*  36   73:aload_0         
	//*  37   74:getfield        #311 <Field View mCustomView>
	//*  38   77:iload_1         
	//*  39   78:invokevirtual   #314 <Method void View.setSelected(boolean)>
	//*  40   81:return          
			flag1 = false;
	//   41   82:iconst_0        
	//   42   83:istore_2        
		super.setSelected(flag);
		if(flag1 && flag && android.os.Build.VERSION.SDK_INT < 16)
			sendAccessibilityEvent(4);
		if(mTextView != null)
			mTextView.setSelected(flag);
		if(mIconView != null)
			mIconView.setSelected(flag);
		if(mCustomView != null)
			mCustomView.setSelected(flag);
	//*  43   84:goto            10
	}

	void setTab(TabLayout.Tab tab)
	{
		if(tab != mTab)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #110 <Field TabLayout$Tab mTab>
	//*   3    5:if_acmpeq       17
		{
			mTab = tab;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #110 <Field TabLayout$Tab mTab>
			update();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #317 <Method void update()>
		}
	//    9   17:return          
	}

	final void update()
	{
		TabLayout.Tab tab = mTab;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field TabLayout$Tab mTab>
	//    2    4:astore_3        
		boolean flag;
		Object obj;
		if(tab != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          300
			obj = ((Object) (tab.getCustomView()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #321 <Method View TabLayout$Tab.getCustomView()>
	//    7   13:astore_2        
		else
	//*   8   14:aload_2         
	//*   9   15:ifnull          305
	//*  10   18:aload_2         
	//*  11   19:invokevirtual   #325 <Method android.view.ViewParent View.getParent()>
	//*  12   22:astore          4
	//*  13   24:aload           4
	//*  14   26:aload_0         
	//*  15   27:if_acmpeq       49
	//*  16   30:aload           4
	//*  17   32:ifnull          44
	//*  18   35:aload           4
	//*  19   37:checkcast       #327 <Class ViewGroup>
	//*  20   40:aload_2         
	//*  21   41:invokevirtual   #331 <Method void ViewGroup.removeView(View)>
	//*  22   44:aload_0         
	//*  23   45:aload_2         
	//*  24   46:invokevirtual   #334 <Method void addView(View)>
	//*  25   49:aload_0         
	//*  26   50:aload_2         
	//*  27   51:putfield        #311 <Field View mCustomView>
	//*  28   54:aload_0         
	//*  29   55:getfield        #229 <Field TextView mTextView>
	//*  30   58:ifnull          70
	//*  31   61:aload_0         
	//*  32   62:getfield        #229 <Field TextView mTextView>
	//*  33   65:bipush          8
	//*  34   67:invokevirtual   #149 <Method void TextView.setVisibility(int)>
	//*  35   70:aload_0         
	//*  36   71:getfield        #239 <Field ImageView mIconView>
	//*  37   74:ifnull          94
	//*  38   77:aload_0         
	//*  39   78:getfield        #239 <Field ImageView mIconView>
	//*  40   81:bipush          8
	//*  41   83:invokevirtual   #132 <Method void ImageView.setVisibility(int)>
	//*  42   86:aload_0         
	//*  43   87:getfield        #239 <Field ImageView mIconView>
	//*  44   90:aconst_null     
	//*  45   91:invokevirtual   #129 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
	//*  46   94:aload_0         
	//*  47   95:aload_2         
	//*  48   96:ldc2            #335 <Int 0x1020014>
	//*  49   99:invokevirtual   #339 <Method View View.findViewById(int)>
	//*  50  102:checkcast       #145 <Class TextView>
	//*  51  105:putfield        #341 <Field TextView mCustomTextView>
	//*  52  108:aload_0         
	//*  53  109:getfield        #341 <Field TextView mCustomTextView>
	//*  54  112:ifnull          126
	//*  55  115:aload_0         
	//*  56  116:aload_0         
	//*  57  117:getfield        #341 <Field TextView mCustomTextView>
	//*  58  120:invokestatic    #249 <Method int TextViewCompat.getMaxLines(TextView)>
	//*  59  123:putfield        #30  <Field int mDefaultMaxLines>
	//*  60  126:aload_0         
	//*  61  127:aload_2         
	//*  62  128:ldc2            #342 <Int 0x1020006>
	//*  63  131:invokevirtual   #339 <Method View View.findViewById(int)>
	//*  64  134:checkcast       #125 <Class ImageView>
	//*  65  137:putfield        #344 <Field ImageView mCustomIconView>
	//*  66  140:aload_0         
	//*  67  141:getfield        #311 <Field View mCustomView>
	//*  68  144:ifnonnull       338
	//*  69  147:aload_0         
	//*  70  148:getfield        #239 <Field ImageView mIconView>
	//*  71  151:ifnonnull       184
	//*  72  154:aload_0         
	//*  73  155:invokevirtual   #76  <Method Context getContext()>
	//*  74  158:invokestatic    #350 <Method LayoutInflater LayoutInflater.from(Context)>
	//*  75  161:getstatic       #355 <Field int android.support.design.R$layout.design_layout_tab_icon>
	//*  76  164:aload_0         
	//*  77  165:iconst_0        
	//*  78  166:invokevirtual   #359 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//*  79  169:checkcast       #125 <Class ImageView>
	//*  80  172:astore_2        
	//*  81  173:aload_0         
	//*  82  174:aload_2         
	//*  83  175:iconst_0        
	//*  84  176:invokevirtual   #362 <Method void addView(View, int)>
	//*  85  179:aload_0         
	//*  86  180:aload_2         
	//*  87  181:putfield        #239 <Field ImageView mIconView>
	//*  88  184:aload_0         
	//*  89  185:getfield        #229 <Field TextView mTextView>
	//*  90  188:ifnonnull       231
	//*  91  191:aload_0         
	//*  92  192:invokevirtual   #76  <Method Context getContext()>
	//*  93  195:invokestatic    #350 <Method LayoutInflater LayoutInflater.from(Context)>
	//*  94  198:getstatic       #365 <Field int android.support.design.R$layout.design_layout_tab_text>
	//*  95  201:aload_0         
	//*  96  202:iconst_0        
	//*  97  203:invokevirtual   #359 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//*  98  206:checkcast       #145 <Class TextView>
	//*  99  209:astore_2        
	//* 100  210:aload_0         
	//* 101  211:aload_2         
	//* 102  212:invokevirtual   #334 <Method void addView(View)>
	//* 103  215:aload_0         
	//* 104  216:aload_2         
	//* 105  217:putfield        #229 <Field TextView mTextView>
	//* 106  220:aload_0         
	//* 107  221:aload_0         
	//* 108  222:getfield        #229 <Field TextView mTextView>
	//* 109  225:invokestatic    #249 <Method int TextViewCompat.getMaxLines(TextView)>
	//* 110  228:putfield        #30  <Field int mDefaultMaxLines>
	//* 111  231:aload_0         
	//* 112  232:getfield        #229 <Field TextView mTextView>
	//* 113  235:aload_0         
	//* 114  236:getfield        #25  <Field TabLayout this$0>
	//* 115  239:getfield        #368 <Field int TabLayout.mTabTextAppearance>
	//* 116  242:invokestatic    #372 <Method void TextViewCompat.setTextAppearance(TextView, int)>
	//* 117  245:aload_0         
	//* 118  246:getfield        #25  <Field TabLayout this$0>
	//* 119  249:getfield        #376 <Field android.content.res.ColorStateList TabLayout.mTabTextColors>
	//* 120  252:ifnull          269
	//* 121  255:aload_0         
	//* 122  256:getfield        #229 <Field TextView mTextView>
	//* 123  259:aload_0         
	//* 124  260:getfield        #25  <Field TabLayout this$0>
	//* 125  263:getfield        #376 <Field android.content.res.ColorStateList TabLayout.mTabTextColors>
	//* 126  266:invokevirtual   #380 <Method void TextView.setTextColor(android.content.res.ColorStateList)>
	//* 127  269:aload_0         
	//* 128  270:aload_0         
	//* 129  271:getfield        #229 <Field TextView mTextView>
	//* 130  274:aload_0         
	//* 131  275:getfield        #239 <Field ImageView mIconView>
	//* 132  278:invokespecial   #382 <Method void updateTextAndIcon(TextView, ImageView)>
	//* 133  281:aload_3         
	//* 134  282:ifnull          367
	//* 135  285:aload_3         
	//* 136  286:invokevirtual   #383 <Method boolean TabLayout$Tab.isSelected()>
	//* 137  289:ifeq            367
	//* 138  292:iconst_1        
	//* 139  293:istore_1        
	//* 140  294:aload_0         
	//* 141  295:iload_1         
	//* 142  296:invokevirtual   #295 <Method void setSelected(boolean)>
	//* 143  299:return          
			obj = null;
	//  144  300:aconst_null     
	//  145  301:astore_2        
		if(obj != null)
		{
			android.view.ViewParent viewparent = ((View) (obj)).getParent();
			if(viewparent != this)
			{
				if(viewparent != null)
					((ViewGroup)viewparent).removeView(((View) (obj)));
				addView(((View) (obj)));
			}
			mCustomView = ((View) (obj));
			if(mTextView != null)
				mTextView.setVisibility(8);
			if(mIconView != null)
			{
				mIconView.setVisibility(8);
				mIconView.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
			}
			mCustomTextView = (TextView)((View) (obj)).findViewById(0x1020014);
			if(mCustomTextView != null)
				mDefaultMaxLines = TextViewCompat.getMaxLines(mCustomTextView);
			mCustomIconView = (ImageView)((View) (obj)).findViewById(0x1020006);
		} else
	//* 146  302:goto            14
		{
			if(mCustomView != null)
	//* 147  305:aload_0         
	//* 148  306:getfield        #311 <Field View mCustomView>
	//* 149  309:ifnull          325
			{
				removeView(mCustomView);
	//  150  312:aload_0         
	//  151  313:aload_0         
	//  152  314:getfield        #311 <Field View mCustomView>
	//  153  317:invokevirtual   #384 <Method void removeView(View)>
				mCustomView = null;
	//  154  320:aload_0         
	//  155  321:aconst_null     
	//  156  322:putfield        #311 <Field View mCustomView>
			}
			mCustomTextView = null;
	//  157  325:aload_0         
	//  158  326:aconst_null     
	//  159  327:putfield        #341 <Field TextView mCustomTextView>
			mCustomIconView = null;
	//  160  330:aload_0         
	//  161  331:aconst_null     
	//  162  332:putfield        #344 <Field ImageView mCustomIconView>
		}
		if(mCustomView == null)
		{
			if(mIconView == null)
			{
				obj = ((Object) ((ImageView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_layout_tab_icon, ((ViewGroup) (this)), false)));
				addView(((View) (obj)), 0);
				mIconView = ((ImageView) (obj));
			}
			if(mTextView == null)
			{
				obj = ((Object) ((TextView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_layout_tab_text, ((ViewGroup) (this)), false)));
				addView(((View) (obj)));
				mTextView = ((TextView) (obj));
				mDefaultMaxLines = TextViewCompat.getMaxLines(mTextView);
			}
			TextViewCompat.setTextAppearance(mTextView, mTabTextAppearance);
			if(mTabTextColors != null)
				mTextView.setTextColor(mTabTextColors);
			updateTextAndIcon(mTextView, mIconView);
		} else
	//* 163  335:goto            140
		if(mCustomTextView != null || mCustomIconView != null)
	//* 164  338:aload_0         
	//* 165  339:getfield        #341 <Field TextView mCustomTextView>
	//* 166  342:ifnonnull       352
	//* 167  345:aload_0         
	//* 168  346:getfield        #344 <Field ImageView mCustomIconView>
	//* 169  349:ifnull          281
			updateTextAndIcon(mCustomTextView, mCustomIconView);
	//  170  352:aload_0         
	//  171  353:aload_0         
	//  172  354:getfield        #341 <Field TextView mCustomTextView>
	//  173  357:aload_0         
	//  174  358:getfield        #344 <Field ImageView mCustomIconView>
	//  175  361:invokespecial   #382 <Method void updateTextAndIcon(TextView, ImageView)>
		if(tab != null && tab.isSelected())
			flag = true;
		else
	//* 176  364:goto            281
			flag = false;
	//  177  367:iconst_0        
	//  178  368:istore_1        
		setSelected(flag);
	//* 179  369:goto            294
	}

	private ImageView mCustomIconView;
	private TextView mCustomTextView;
	private View mCustomView;
	private int mDefaultMaxLines;
	private ImageView mIconView;
	private TabLayout.Tab mTab;
	private TextView mTextView;
	final TabLayout this$0;

	public TabLayout$TabView(Context context)
	{
		this$0 = TabLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field TabLayout this$0>
		super(context);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #28  <Method void LinearLayout(Context)>
		mDefaultMaxLines = 2;
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:putfield        #30  <Field int mDefaultMaxLines>
		if(mTabBackgroundResId != 0)
	//*   9   15:aload_1         
	//*  10   16:getfield        #33  <Field int TabLayout.mTabBackgroundResId>
	//*  11   19:ifeq            34
			ViewCompat.setBackground(((View) (this)), AppCompatResources.getDrawable(context, mTabBackgroundResId));
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:aload_1         
	//   15   25:getfield        #33  <Field int TabLayout.mTabBackgroundResId>
	//   16   28:invokestatic    #39  <Method android.graphics.drawable.Drawable AppCompatResources.getDrawable(Context, int)>
	//   17   31:invokestatic    #45  <Method void ViewCompat.setBackground(View, android.graphics.drawable.Drawable)>
		ViewCompat.setPaddingRelative(((View) (this)), mTabPaddingStart, mTabPaddingTop, mTabPaddingEnd, mTabPaddingBottom);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #48  <Field int TabLayout.mTabPaddingStart>
	//   21   39:aload_1         
	//   22   40:getfield        #51  <Field int TabLayout.mTabPaddingTop>
	//   23   43:aload_1         
	//   24   44:getfield        #54  <Field int TabLayout.mTabPaddingEnd>
	//   25   47:aload_1         
	//   26   48:getfield        #57  <Field int TabLayout.mTabPaddingBottom>
	//   27   51:invokestatic    #61  <Method void ViewCompat.setPaddingRelative(View, int, int, int, int)>
		setGravity(17);
	//   28   54:aload_0         
	//   29   55:bipush          17
	//   30   57:invokevirtual   #65  <Method void setGravity(int)>
		setOrientation(1);
	//   31   60:aload_0         
	//   32   61:iconst_1        
	//   33   62:invokevirtual   #68  <Method void setOrientation(int)>
		setClickable(true);
	//   34   65:aload_0         
	//   35   66:iconst_1        
	//   36   67:invokevirtual   #72  <Method void setClickable(boolean)>
		ViewCompat.setPointerIcon(((View) (this)), PointerIconCompat.getSystemIcon(getContext(), 1002));
	//   37   70:aload_0         
	//   38   71:aload_0         
	//   39   72:invokevirtual   #76  <Method Context getContext()>
	//   40   75:sipush          1002
	//   41   78:invokestatic    #82  <Method PointerIconCompat PointerIconCompat.getSystemIcon(Context, int)>
	//   42   81:invokestatic    #86  <Method void ViewCompat.setPointerIcon(View, PointerIconCompat)>
	//   43   84:return          
	}
}
