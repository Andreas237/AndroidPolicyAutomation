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
	//    1    1:astore          8
		boolean flag;
		CharSequence charsequence;
		android.graphics.drawable.Drawable drawable;
		CharSequence charsequence1;
		if(mTab != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #110 <Field TabLayout$Tab mTab>
	//*   4    7:ifnull          188
			drawable = mTab.getIcon();
	//    5   10:aload_0         
	//    6   11:getfield        #110 <Field TabLayout$Tab mTab>
	//    7   14:invokevirtual   #116 <Method android.graphics.drawable.Drawable TabLayout$Tab.getIcon()>
	//    8   17:astore          6
		else
	//*   9   19:aload_0         
	//*  10   20:getfield        #110 <Field TabLayout$Tab mTab>
	//*  11   23:ifnull          194
	//*  12   26:aload_0         
	//*  13   27:getfield        #110 <Field TabLayout$Tab mTab>
	//*  14   30:invokevirtual   #120 <Method CharSequence TabLayout$Tab.getText()>
	//*  15   33:astore          7
	//*  16   35:aload_0         
	//*  17   36:getfield        #110 <Field TabLayout$Tab mTab>
	//*  18   39:ifnull          200
	//*  19   42:aload_0         
	//*  20   43:getfield        #110 <Field TabLayout$Tab mTab>
	//*  21   46:invokevirtual   #123 <Method CharSequence TabLayout$Tab.getContentDescription()>
	//*  22   49:astore          5
	//*  23   51:aload_2         
	//*  24   52:ifnull          82
	//*  25   55:aload           6
	//*  26   57:ifnull          206
	//*  27   60:aload_2         
	//*  28   61:aload           6
	//*  29   63:invokevirtual   #129 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
	//*  30   66:aload_2         
	//*  31   67:iconst_0        
	//*  32   68:invokevirtual   #132 <Method void ImageView.setVisibility(int)>
	//*  33   71:aload_0         
	//*  34   72:iconst_0        
	//*  35   73:invokevirtual   #133 <Method void setVisibility(int)>
	//*  36   76:aload_2         
	//*  37   77:aload           5
	//*  38   79:invokevirtual   #137 <Method void ImageView.setContentDescription(CharSequence)>
	//*  39   82:aload           7
	//*  40   84:invokestatic    #143 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  41   87:ifne            220
	//*  42   90:iconst_1        
	//*  43   91:istore_3        
	//*  44   92:aload_1         
	//*  45   93:ifnull          122
	//*  46   96:iload_3         
	//*  47   97:ifeq            225
	//*  48  100:aload_1         
	//*  49  101:aload           7
	//*  50  103:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
	//*  51  106:aload_1         
	//*  52  107:iconst_0        
	//*  53  108:invokevirtual   #149 <Method void TextView.setVisibility(int)>
	//*  54  111:aload_0         
	//*  55  112:iconst_0        
	//*  56  113:invokevirtual   #133 <Method void setVisibility(int)>
	//*  57  116:aload_1         
	//*  58  117:aload           5
	//*  59  119:invokevirtual   #150 <Method void TextView.setContentDescription(CharSequence)>
	//*  60  122:aload_2         
	//*  61  123:ifnull          175
	//*  62  126:aload_2         
	//*  63  127:invokevirtual   #154 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//*  64  130:checkcast       #156 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  65  133:astore_1        
	//*  66  134:iload_3         
	//*  67  135:ifeq            245
	//*  68  138:aload_2         
	//*  69  139:invokevirtual   #160 <Method int ImageView.getVisibility()>
	//*  70  142:ifne            245
	//*  71  145:aload_0         
	//*  72  146:getfield        #25  <Field TabLayout this$0>
	//*  73  149:bipush          8
	//*  74  151:invokevirtual   #164 <Method int TabLayout.dpToPx(int)>
	//*  75  154:istore          4
	//*  76  156:iload           4
	//*  77  158:aload_1         
	//*  78  159:getfield        #167 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//*  79  162:icmpeq          175
	//*  80  165:aload_1         
	//*  81  166:iload           4
	//*  82  168:putfield        #167 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//*  83  171:aload_2         
	//*  84  172:invokevirtual   #171 <Method void ImageView.requestLayout()>
	//*  85  175:iload_3         
	//*  86  176:ifeq            239
	//*  87  179:aload           8
	//*  88  181:astore_1        
	//*  89  182:aload_0         
	//*  90  183:aload_1         
	//*  91  184:invokestatic    #177 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
	//*  92  187:return          
			drawable = null;
	//   93  188:aconst_null     
	//   94  189:astore          6
		if(mTab != null)
			charsequence1 = mTab.getText();
		else
	//*  95  191:goto            19
			charsequence1 = null;
	//   96  194:aconst_null     
	//   97  195:astore          7
		if(mTab != null)
			charsequence = mTab.getContentDescription();
		else
	//*  98  197:goto            35
			charsequence = null;
	//   99  200:aconst_null     
	//  100  201:astore          5
		if(imageview != null)
		{
			if(drawable != null)
			{
				imageview.setImageDrawable(drawable);
				imageview.setVisibility(0);
				setVisibility(0);
			} else
	//* 101  203:goto            51
			{
				imageview.setVisibility(8);
	//  102  206:aload_2         
	//  103  207:bipush          8
	//  104  209:invokevirtual   #132 <Method void ImageView.setVisibility(int)>
				imageview.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//  105  212:aload_2         
	//  106  213:aconst_null     
	//  107  214:invokevirtual   #129 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			}
			imageview.setContentDescription(charsequence);
		}
		if(!TextUtils.isEmpty(charsequence1))
			flag = true;
		else
	//* 108  217:goto            76
			flag = false;
	//  109  220:iconst_0        
	//  110  221:istore_3        
		if(textview != null)
		{
			if(flag)
			{
				textview.setText(charsequence1);
				textview.setVisibility(0);
				setVisibility(0);
			} else
	//* 111  222:goto            92
			{
				textview.setVisibility(8);
	//  112  225:aload_1         
	//  113  226:bipush          8
	//  114  228:invokevirtual   #149 <Method void TextView.setVisibility(int)>
				textview.setText(((CharSequence) (null)));
	//  115  231:aload_1         
	//  116  232:aconst_null     
	//  117  233:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
			}
			textview.setContentDescription(charsequence);
		}
		if(imageview != null)
		{
			textview = ((TextView) ((android.view.youtParams)imageview.getLayoutParams()));
			int i;
			if(flag && imageview.getVisibility() == 0)
				i = dpToPx(8);
			else
	//* 118  236:goto            116
	//* 119  239:aload           5
	//* 120  241:astore_1        
	//* 121  242:goto            182
				i = 0;
	//  122  245:iconst_0        
	//  123  246:istore          4
			if(i != ((android.view.youtParams) (textview)).bottomMargin)
			{
				textview.bottomMargin = i;
				imageview.requestLayout();
			}
		}
		if(flag)
			textview = ((TextView) (obj));
		else
			textview = ((TextView) (charsequence));
		TooltipCompat.setTooltipText(((View) (this)), ((CharSequence) (textview)));
	//* 124  248:goto            156
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
		int k;
		boolean flag;
label0:
		{
			flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          7
			int l = android.view.View.MeasureSpec.getSize(i);
	//    2    3:iload_1         
	//    3    4:invokestatic    #211 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    4    7:istore          6
			int j1 = android.view.View.MeasureSpec.getMode(i);
	//    5    9:iload_1         
	//    6   10:invokestatic    #214 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    7   13:istore          8
			int l1 = getTabMaxWidth();
	//    8   15:aload_0         
	//    9   16:getfield        #25  <Field TabLayout this$0>
	//   10   19:invokevirtual   #217 <Method int TabLayout.getTabMaxWidth()>
	//   11   22:istore          9
			k = i;
	//   12   24:iload_1         
	//   13   25:istore          5
			if(l1 <= 0)
				break label0;
	//   14   27:iload           9
	//   15   29:ifle            61
			if(j1 != 0)
	//*  16   32:iload           8
	//*  17   34:ifeq            47
			{
				k = i;
	//   18   37:iload_1         
	//   19   38:istore          5
				if(l <= l1)
					break label0;
	//   20   40:iload           6
	//   21   42:iload           9
	//   22   44:icmple          61
			}
			k = android.view.View.MeasureSpec.makeMeasureSpec(mTabMaxWidth, 0x80000000);
	//   23   47:aload_0         
	//   24   48:getfield        #25  <Field TabLayout this$0>
	//   25   51:getfield        #220 <Field int TabLayout.mTabMaxWidth>
	//   26   54:ldc1            #221 <Int 0x80000000>
	//   27   56:invokestatic    #225 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   28   59:istore          5
		}
		super.onMeasure(k, j);
	//   29   61:aload_0         
	//   30   62:iload           5
	//   31   64:iload_2         
	//   32   65:invokespecial   #227 <Method void LinearLayout.onMeasure(int, int)>
		if(mTextView == null) goto _L2; else goto _L1
	//   33   68:aload_0         
	//   34   69:getfield        #229 <Field TextView mTextView>
	//   35   72:ifnull          275
_L1:
		float f1;
		int i1;
		getResources();
	//   36   75:aload_0         
	//   37   76:invokevirtual   #233 <Method android.content.res.Resources getResources()>
	//   38   79:pop             
		f1 = mTabTextSize;
	//   39   80:aload_0         
	//   40   81:getfield        #25  <Field TabLayout this$0>
	//   41   84:getfield        #237 <Field float TabLayout.mTabTextSize>
	//   42   87:fstore          4
		i1 = mDefaultMaxLines;
	//   43   89:aload_0         
	//   44   90:getfield        #30  <Field int mDefaultMaxLines>
	//   45   93:istore          6
		if(mIconView == null || mIconView.getVisibility() != 0) goto _L4; else goto _L3
	//   46   95:aload_0         
	//   47   96:getfield        #239 <Field ImageView mIconView>
	//   48   99:ifnull          276
	//   49  102:aload_0         
	//   50  103:getfield        #239 <Field ImageView mIconView>
	//   51  106:invokevirtual   #160 <Method int ImageView.getVisibility()>
	//   52  109:ifne            276
_L3:
		float f;
		i = 1;
	//   53  112:iconst_1        
	//   54  113:istore_1        
		f = f1;
	//   55  114:fload           4
	//   56  116:fstore_3        
_L6:
		f1 = mTextView.getTextSize();
	//   57  117:aload_0         
	//   58  118:getfield        #229 <Field TextView mTextView>
	//   59  121:invokevirtual   #240 <Method float TextView.getTextSize()>
	//   60  124:fstore          4
		int k1 = mTextView.getLineCount();
	//   61  126:aload_0         
	//   62  127:getfield        #229 <Field TextView mTextView>
	//   63  130:invokevirtual   #243 <Method int TextView.getLineCount()>
	//   64  133:istore          8
		i1 = TextViewCompat.getMaxLines(mTextView);
	//   65  135:aload_0         
	//   66  136:getfield        #229 <Field TextView mTextView>
	//   67  139:invokestatic    #249 <Method int TextViewCompat.getMaxLines(TextView)>
	//   68  142:istore          6
		if(f != f1 || i1 >= 0 && i != i1)
	//*  69  144:fload_3         
	//*  70  145:fload           4
	//*  71  147:fcmpl           
	//*  72  148:ifne            162
	//*  73  151:iload           6
	//*  74  153:iflt            275
	//*  75  156:iload_1         
	//*  76  157:iload           6
	//*  77  159:icmpeq          275
		{
label1:
			{
				i1 = ((int) (flag));
	//   78  162:iload           7
	//   79  164:istore          6
				if(mMode != 1)
					break label1;
	//   80  166:aload_0         
	//   81  167:getfield        #25  <Field TabLayout this$0>
	//   82  170:getfield        #252 <Field int TabLayout.mMode>
	//   83  173:iconst_1        
	//   84  174:icmpne          246
				i1 = ((int) (flag));
	//   85  177:iload           7
	//   86  179:istore          6
				if(f <= f1)
					break label1;
	//   87  181:fload_3         
	//   88  182:fload           4
	//   89  184:fcmpl           
	//   90  185:ifle            246
				i1 = ((int) (flag));
	//   91  188:iload           7
	//   92  190:istore          6
				if(k1 != 1)
					break label1;
	//   93  192:iload           8
	//   94  194:iconst_1        
	//   95  195:icmpne          246
				Layout layout = mTextView.getLayout();
	//   96  198:aload_0         
	//   97  199:getfield        #229 <Field TextView mTextView>
	//   98  202:invokevirtual   #256 <Method Layout TextView.getLayout()>
	//   99  205:astore          10
				if(layout != null)
	//* 100  207:aload           10
	//* 101  209:ifnull          243
				{
					i1 = ((int) (flag));
	//  102  212:iload           7
	//  103  214:istore          6
					if(approximateLineWidth(layout, 0, f) <= (float)(getMeasuredWidth() - getPaddingLeft() - getPaddingRight()))
						break label1;
	//  104  216:aload_0         
	//  105  217:aload           10
	//  106  219:iconst_0        
	//  107  220:fload_3         
	//  108  221:invokespecial   #258 <Method float approximateLineWidth(Layout, int, float)>
	//  109  224:aload_0         
	//  110  225:invokevirtual   #261 <Method int getMeasuredWidth()>
	//  111  228:aload_0         
	//  112  229:invokevirtual   #264 <Method int getPaddingLeft()>
	//  113  232:isub            
	//  114  233:aload_0         
	//  115  234:invokevirtual   #267 <Method int getPaddingRight()>
	//  116  237:isub            
	//  117  238:i2f             
	//  118  239:fcmpl           
	//  119  240:ifle            246
				}
				i1 = 0;
	//  120  243:iconst_0        
	//  121  244:istore          6
			}
			if(i1 != 0)
	//* 122  246:iload           6
	//* 123  248:ifeq            275
			{
				mTextView.setTextSize(0, f);
	//  124  251:aload_0         
	//  125  252:getfield        #229 <Field TextView mTextView>
	//  126  255:iconst_0        
	//  127  256:fload_3         
	//  128  257:invokevirtual   #271 <Method void TextView.setTextSize(int, float)>
				mTextView.setMaxLines(i);
	//  129  260:aload_0         
	//  130  261:getfield        #229 <Field TextView mTextView>
	//  131  264:iload_1         
	//  132  265:invokevirtual   #274 <Method void TextView.setMaxLines(int)>
				super.onMeasure(k, j);
	//  133  268:aload_0         
	//  134  269:iload           5
	//  135  271:iload_2         
	//  136  272:invokespecial   #227 <Method void LinearLayout.onMeasure(int, int)>
			}
		}
_L2:
		return;
	//  137  275:return          
_L4:
		i = i1;
	//  138  276:iload           6
	//  139  278:istore_1        
		f = f1;
	//  140  279:fload           4
	//  141  281:fstore_3        
		if(mTextView != null)
	//* 142  282:aload_0         
	//* 143  283:getfield        #229 <Field TextView mTextView>
	//* 144  286:ifnull          117
		{
			i = i1;
	//  145  289:iload           6
	//  146  291:istore_1        
			f = f1;
	//  147  292:fload           4
	//  148  294:fstore_3        
			if(mTextView.getLineCount() > 1)
	//* 149  295:aload_0         
	//* 150  296:getfield        #229 <Field TextView mTextView>
	//* 151  299:invokevirtual   #243 <Method int TextView.getLineCount()>
	//* 152  302:iconst_1        
	//* 153  303:icmple          117
			{
				f = mTabTextMultiLineSize;
	//  154  306:aload_0         
	//  155  307:getfield        #25  <Field TabLayout this$0>
	//  156  310:getfield        #277 <Field float TabLayout.mTabTextMultiLineSize>
	//  157  313:fstore_3        
				i = i1;
	//  158  314:iload           6
	//  159  316:istore_1        
			}
		}
		if(true) goto _L6; else goto _L5
	//  160  317:goto            117
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
