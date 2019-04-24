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
		Object obj = ((Object) (mTab));
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field TabLayout$Tab mTab>
	//    2    4:astore          6
		Object obj1 = null;
	//    3    6:aconst_null     
	//    4    7:astore          9
		android.graphics.drawable.Drawable drawable;
		if(obj != null)
	//*   5    9:aload           6
	//*   6   11:ifnull          26
			drawable = mTab.getIcon();
	//    7   14:aload_0         
	//    8   15:getfield        #110 <Field TabLayout$Tab mTab>
	//    9   18:invokevirtual   #116 <Method android.graphics.drawable.Drawable TabLayout$Tab.getIcon()>
	//   10   21:astore          7
		else
	//*  11   23:goto            29
			drawable = null;
	//   12   26:aconst_null     
	//   13   27:astore          7
		CharSequence charsequence;
		if(mTab != null)
	//*  14   29:aload_0         
	//*  15   30:getfield        #110 <Field TabLayout$Tab mTab>
	//*  16   33:ifnull          48
			charsequence = mTab.getText();
	//   17   36:aload_0         
	//   18   37:getfield        #110 <Field TabLayout$Tab mTab>
	//   19   40:invokevirtual   #120 <Method CharSequence TabLayout$Tab.getText()>
	//   20   43:astore          8
		else
	//*  21   45:goto            51
			charsequence = null;
	//   22   48:aconst_null     
	//   23   49:astore          8
		if(mTab != null)
	//*  24   51:aload_0         
	//*  25   52:getfield        #110 <Field TabLayout$Tab mTab>
	//*  26   55:ifnull          70
			obj = ((Object) (mTab.getContentDescription()));
	//   27   58:aload_0         
	//   28   59:getfield        #110 <Field TabLayout$Tab mTab>
	//   29   62:invokevirtual   #123 <Method CharSequence TabLayout$Tab.getContentDescription()>
	//   30   65:astore          6
		else
	//*  31   67:goto            73
			obj = null;
	//   32   70:aconst_null     
	//   33   71:astore          6
		boolean flag = false;
	//   34   73:iconst_0        
	//   35   74:istore          4
		if(imageview != null)
	//*  36   76:aload_2         
	//*  37   77:ifnull          121
		{
			if(drawable != null)
	//*  38   80:aload           7
	//*  39   82:ifnull          104
			{
				imageview.setImageDrawable(drawable);
	//   40   85:aload_2         
	//   41   86:aload           7
	//   42   88:invokevirtual   #129 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
				imageview.setVisibility(0);
	//   43   91:aload_2         
	//   44   92:iconst_0        
	//   45   93:invokevirtual   #132 <Method void ImageView.setVisibility(int)>
				setVisibility(0);
	//   46   96:aload_0         
	//   47   97:iconst_0        
	//   48   98:invokevirtual   #133 <Method void setVisibility(int)>
			} else
	//*  49  101:goto            115
			{
				imageview.setVisibility(8);
	//   50  104:aload_2         
	//   51  105:bipush          8
	//   52  107:invokevirtual   #132 <Method void ImageView.setVisibility(int)>
				imageview.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//   53  110:aload_2         
	//   54  111:aconst_null     
	//   55  112:invokevirtual   #129 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			}
			imageview.setContentDescription(((CharSequence) (obj)));
	//   56  115:aload_2         
	//   57  116:aload           6
	//   58  118:invokevirtual   #137 <Method void ImageView.setContentDescription(CharSequence)>
		}
		boolean flag1 = TextUtils.isEmpty(charsequence) ^ true;
	//   59  121:aload           8
	//   60  123:invokestatic    #143 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   61  126:iconst_1        
	//   62  127:ixor            
	//   63  128:istore          5
		if(textview != null)
	//*  64  130:aload_1         
	//*  65  131:ifnull          175
		{
			if(flag1)
	//*  66  134:iload           5
	//*  67  136:ifeq            158
			{
				textview.setText(charsequence);
	//   68  139:aload_1         
	//   69  140:aload           8
	//   70  142:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
				textview.setVisibility(0);
	//   71  145:aload_1         
	//   72  146:iconst_0        
	//   73  147:invokevirtual   #149 <Method void TextView.setVisibility(int)>
				setVisibility(0);
	//   74  150:aload_0         
	//   75  151:iconst_0        
	//   76  152:invokevirtual   #133 <Method void setVisibility(int)>
			} else
	//*  77  155:goto            169
			{
				textview.setVisibility(8);
	//   78  158:aload_1         
	//   79  159:bipush          8
	//   80  161:invokevirtual   #149 <Method void TextView.setVisibility(int)>
				textview.setText(((CharSequence) (null)));
	//   81  164:aload_1         
	//   82  165:aconst_null     
	//   83  166:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
			}
			textview.setContentDescription(((CharSequence) (obj)));
	//   84  169:aload_1         
	//   85  170:aload           6
	//   86  172:invokevirtual   #150 <Method void TextView.setContentDescription(CharSequence)>
		}
		if(imageview != null)
	//*  87  175:aload_2         
	//*  88  176:ifnull          232
		{
			textview = ((TextView) ((android.view.youtParams)imageview.getLayoutParams()));
	//   89  179:aload_2         
	//   90  180:invokevirtual   #154 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//   91  183:checkcast       #156 <Class android.view.ViewGroup$MarginLayoutParams>
	//   92  186:astore_1        
			int i = ((int) (flag));
	//   93  187:iload           4
	//   94  189:istore_3        
			if(flag1)
	//*  95  190:iload           5
	//*  96  192:ifeq            215
			{
				i = ((int) (flag));
	//   97  195:iload           4
	//   98  197:istore_3        
				if(imageview.getVisibility() == 0)
	//*  99  198:aload_2         
	//* 100  199:invokevirtual   #160 <Method int ImageView.getVisibility()>
	//* 101  202:ifne            215
					i = dpToPx(8);
	//  102  205:aload_0         
	//  103  206:getfield        #25  <Field TabLayout this$0>
	//  104  209:bipush          8
	//  105  211:invokevirtual   #164 <Method int TabLayout.dpToPx(int)>
	//  106  214:istore_3        
			}
			if(i != ((android.view.youtParams) (textview)).bottomMargin)
	//* 107  215:iload_3         
	//* 108  216:aload_1         
	//* 109  217:getfield        #167 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//* 110  220:icmpeq          232
			{
				textview.bottomMargin = i;
	//  111  223:aload_1         
	//  112  224:iload_3         
	//  113  225:putfield        #167 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
				imageview.requestLayout();
	//  114  228:aload_2         
	//  115  229:invokevirtual   #171 <Method void ImageView.requestLayout()>
			}
		}
		if(flag1)
	//* 116  232:iload           5
	//* 117  234:ifeq            244
			obj = ((Object) (obj1));
	//  118  237:aload           9
	//  119  239:astore          6
	//* 120  241:goto            244
		TooltipCompat.setTooltipText(((View) (this)), ((CharSequence) (obj)));
	//  121  244:aload_0         
	//  122  245:aload           6
	//  123  247:invokestatic    #177 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
	//  124  250:return          
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
label0:
		{
			int l = android.view.View.MeasureSpec.getSize(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #211 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    2    4:istore          6
			int j1 = android.view.View.MeasureSpec.getMode(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #214 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    5   10:istore          7
			int k1 = getTabMaxWidth();
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field TabLayout this$0>
	//    8   16:invokevirtual   #217 <Method int TabLayout.getTabMaxWidth()>
	//    9   19:istore          8
			k = i;
	//   10   21:iload_1         
	//   11   22:istore          5
			if(k1 <= 0)
				break label0;
	//   12   24:iload           8
	//   13   26:ifle            58
			if(j1 != 0)
	//*  14   29:iload           7
	//*  15   31:ifeq            44
			{
				k = i;
	//   16   34:iload_1         
	//   17   35:istore          5
				if(l <= k1)
					break label0;
	//   18   37:iload           6
	//   19   39:iload           8
	//   20   41:icmple          58
			}
			k = android.view.View.MeasureSpec.makeMeasureSpec(mTabMaxWidth, 0x80000000);
	//   21   44:aload_0         
	//   22   45:getfield        #25  <Field TabLayout this$0>
	//   23   48:getfield        #220 <Field int TabLayout.mTabMaxWidth>
	//   24   51:ldc1            #221 <Int 0x80000000>
	//   25   53:invokestatic    #225 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   26   56:istore          5
		}
label1:
		{
			float f;
			boolean flag;
label2:
			{
				super.onMeasure(k, j);
	//   27   58:aload_0         
	//   28   59:iload           5
	//   29   61:iload_2         
	//   30   62:invokespecial   #227 <Method void LinearLayout.onMeasure(int, int)>
				if(mTextView == null)
					break label1;
	//   31   65:aload_0         
	//   32   66:getfield        #229 <Field TextView mTextView>
	//   33   69:ifnull          323
				getResources();
	//   34   72:aload_0         
	//   35   73:invokevirtual   #233 <Method android.content.res.Resources getResources()>
	//   36   76:pop             
				float f1 = mTabTextSize;
	//   37   77:aload_0         
	//   38   78:getfield        #25  <Field TabLayout this$0>
	//   39   81:getfield        #237 <Field float TabLayout.mTabTextSize>
	//   40   84:fstore          4
				int i1 = mDefaultMaxLines;
	//   41   86:aload_0         
	//   42   87:getfield        #30  <Field int mDefaultMaxLines>
	//   43   90:istore          6
				Object obj = ((Object) (mIconView));
	//   44   92:aload_0         
	//   45   93:getfield        #239 <Field ImageView mIconView>
	//   46   96:astore          9
				boolean flag1 = true;
	//   47   98:iconst_1        
	//   48   99:istore          7
				if(obj != null && mIconView.getVisibility() == 0)
	//*  49  101:aload           9
	//*  50  103:ifnull          124
	//*  51  106:aload_0         
	//*  52  107:getfield        #239 <Field ImageView mIconView>
	//*  53  110:invokevirtual   #160 <Method int ImageView.getVisibility()>
	//*  54  113:ifne            124
				{
					i = 1;
	//   55  116:iconst_1        
	//   56  117:istore_1        
					f = f1;
	//   57  118:fload           4
	//   58  120:fstore_3        
				} else
	//*  59  121:goto            165
				{
					f = f1;
	//   60  124:fload           4
	//   61  126:fstore_3        
					i = i1;
	//   62  127:iload           6
	//   63  129:istore_1        
					if(mTextView != null)
	//*  64  130:aload_0         
	//*  65  131:getfield        #229 <Field TextView mTextView>
	//*  66  134:ifnull          165
					{
						f = f1;
	//   67  137:fload           4
	//   68  139:fstore_3        
						i = i1;
	//   69  140:iload           6
	//   70  142:istore_1        
						if(mTextView.getLineCount() > 1)
	//*  71  143:aload_0         
	//*  72  144:getfield        #229 <Field TextView mTextView>
	//*  73  147:invokevirtual   #242 <Method int TextView.getLineCount()>
	//*  74  150:iconst_1        
	//*  75  151:icmple          165
						{
							f = mTabTextMultiLineSize;
	//   76  154:aload_0         
	//   77  155:getfield        #25  <Field TabLayout this$0>
	//   78  158:getfield        #245 <Field float TabLayout.mTabTextMultiLineSize>
	//   79  161:fstore_3        
							i = i1;
	//   80  162:iload           6
	//   81  164:istore_1        
						}
					}
				}
				f1 = mTextView.getTextSize();
	//   82  165:aload_0         
	//   83  166:getfield        #229 <Field TextView mTextView>
	//   84  169:invokevirtual   #246 <Method float TextView.getTextSize()>
	//   85  172:fstore          4
				int l1 = mTextView.getLineCount();
	//   86  174:aload_0         
	//   87  175:getfield        #229 <Field TextView mTextView>
	//   88  178:invokevirtual   #242 <Method int TextView.getLineCount()>
	//   89  181:istore          8
				i1 = TextViewCompat.getMaxLines(mTextView);
	//   90  183:aload_0         
	//   91  184:getfield        #229 <Field TextView mTextView>
	//   92  187:invokestatic    #252 <Method int TextViewCompat.getMaxLines(TextView)>
	//   93  190:istore          6
				if(f == f1 && (i1 < 0 || i == i1))
					break label1;
	//   94  192:fload_3         
	//   95  193:fload           4
	//   96  195:fcmpl           
	//   97  196:ifne            210
	//   98  199:iload           6
	//   99  201:iflt            323
	//  100  204:iload_1         
	//  101  205:iload           6
	//  102  207:icmpeq          323
				flag = flag1;
	//  103  210:iload           7
	//  104  212:istore          6
				if(mMode != 1)
					break label2;
	//  105  214:aload_0         
	//  106  215:getfield        #25  <Field TabLayout this$0>
	//  107  218:getfield        #255 <Field int TabLayout.mMode>
	//  108  221:iconst_1        
	//  109  222:icmpne          294
				flag = flag1;
	//  110  225:iload           7
	//  111  227:istore          6
				if(f <= f1)
					break label2;
	//  112  229:fload_3         
	//  113  230:fload           4
	//  114  232:fcmpl           
	//  115  233:ifle            294
				flag = flag1;
	//  116  236:iload           7
	//  117  238:istore          6
				if(l1 != 1)
					break label2;
	//  118  240:iload           8
	//  119  242:iconst_1        
	//  120  243:icmpne          294
				obj = ((Object) (mTextView.getLayout()));
	//  121  246:aload_0         
	//  122  247:getfield        #229 <Field TextView mTextView>
	//  123  250:invokevirtual   #259 <Method Layout TextView.getLayout()>
	//  124  253:astore          9
				if(obj != null)
	//* 125  255:aload           9
	//* 126  257:ifnull          291
				{
					flag = flag1;
	//  127  260:iload           7
	//  128  262:istore          6
					if(approximateLineWidth(((Layout) (obj)), 0, f) <= (float)(getMeasuredWidth() - getPaddingLeft() - getPaddingRight()))
						break label2;
	//  129  264:aload_0         
	//  130  265:aload           9
	//  131  267:iconst_0        
	//  132  268:fload_3         
	//  133  269:invokespecial   #261 <Method float approximateLineWidth(Layout, int, float)>
	//  134  272:aload_0         
	//  135  273:invokevirtual   #264 <Method int getMeasuredWidth()>
	//  136  276:aload_0         
	//  137  277:invokevirtual   #267 <Method int getPaddingLeft()>
	//  138  280:isub            
	//  139  281:aload_0         
	//  140  282:invokevirtual   #270 <Method int getPaddingRight()>
	//  141  285:isub            
	//  142  286:i2f             
	//  143  287:fcmpl           
	//  144  288:ifle            294
				}
				flag = false;
	//  145  291:iconst_0        
	//  146  292:istore          6
			}
			if(flag)
	//* 147  294:iload           6
	//* 148  296:ifeq            323
			{
				mTextView.setTextSize(0, f);
	//  149  299:aload_0         
	//  150  300:getfield        #229 <Field TextView mTextView>
	//  151  303:iconst_0        
	//  152  304:fload_3         
	//  153  305:invokevirtual   #274 <Method void TextView.setTextSize(int, float)>
				mTextView.setMaxLines(i);
	//  154  308:aload_0         
	//  155  309:getfield        #229 <Field TextView mTextView>
	//  156  312:iload_1         
	//  157  313:invokevirtual   #277 <Method void TextView.setMaxLines(int)>
				super.onMeasure(k, j);
	//  158  316:aload_0         
	//  159  317:iload           5
	//  160  319:iload_2         
	//  161  320:invokespecial   #227 <Method void LinearLayout.onMeasure(int, int)>
			}
		}
	//  162  323:return          
	}

	public boolean performClick()
	{
		boolean flag = super.performClick();
	//    0    0:aload_0         
	//    1    1:invokespecial   #281 <Method boolean LinearLayout.performClick()>
	//    2    4:istore_1        
		if(mTab != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #110 <Field TabLayout$Tab mTab>
	//*   5    9:ifnull          30
		{
			if(!flag)
	//*   6   12:iload_1         
	//*   7   13:ifne            21
				playSoundEffect(0);
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #284 <Method void playSoundEffect(int)>
			mTab.select();
	//   11   21:aload_0         
	//   12   22:getfield        #110 <Field TabLayout$Tab mTab>
	//   13   25:invokevirtual   #287 <Method void TabLayout$Tab.select()>
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
	//   11   17:invokespecial   #299 <Method void LinearLayout.setSelected(boolean)>
		if(flag1 && flag && android.os.Build.VERSION.SDK_INT < 16)
	//*  12   20:iload_2         
	//*  13   21:ifeq            41
	//*  14   24:iload_1         
	//*  15   25:ifeq            41
	//*  16   28:getstatic       #304 <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   31:bipush          16
	//*  18   33:icmpge          41
			sendAccessibilityEvent(4);
	//   19   36:aload_0         
	//   20   37:iconst_4        
	//   21   38:invokevirtual   #307 <Method void sendAccessibilityEvent(int)>
		if(mTextView != null)
	//*  22   41:aload_0         
	//*  23   42:getfield        #229 <Field TextView mTextView>
	//*  24   45:ifnull          56
			mTextView.setSelected(flag);
	//   25   48:aload_0         
	//   26   49:getfield        #229 <Field TextView mTextView>
	//   27   52:iload_1         
	//   28   53:invokevirtual   #308 <Method void TextView.setSelected(boolean)>
		if(mIconView != null)
	//*  29   56:aload_0         
	//*  30   57:getfield        #239 <Field ImageView mIconView>
	//*  31   60:ifnull          71
			mIconView.setSelected(flag);
	//   32   63:aload_0         
	//   33   64:getfield        #239 <Field ImageView mIconView>
	//   34   67:iload_1         
	//   35   68:invokevirtual   #309 <Method void ImageView.setSelected(boolean)>
		if(mCustomView != null)
	//*  36   71:aload_0         
	//*  37   72:getfield        #311 <Field View mCustomView>
	//*  38   75:ifnull          86
			mCustomView.setSelected(flag);
	//   39   78:aload_0         
	//   40   79:getfield        #311 <Field View mCustomView>
	//   41   82:iload_1         
	//   42   83:invokevirtual   #314 <Method void View.setSelected(boolean)>
	//   43   86:return          
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
	//    2    4:astore          4
		View view;
		if(tab != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          20
			view = tab.getCustomView();
	//    5   11:aload           4
	//    6   13:invokevirtual   #321 <Method View TabLayout$Tab.getCustomView()>
	//    7   16:astore_3        
		else
	//*   8   17:goto            22
			view = null;
	//    9   20:aconst_null     
	//   10   21:astore_3        
		if(view != null)
	//*  11   22:aload_3         
	//*  12   23:ifnull          151
		{
			android.view.ViewParent viewparent = view.getParent();
	//   13   26:aload_3         
	//   14   27:invokevirtual   #325 <Method android.view.ViewParent View.getParent()>
	//   15   30:astore          5
			if(viewparent != this)
	//*  16   32:aload           5
	//*  17   34:aload_0         
	//*  18   35:if_acmpeq       57
			{
				if(viewparent != null)
	//*  19   38:aload           5
	//*  20   40:ifnull          52
					((ViewGroup)viewparent).removeView(view);
	//   21   43:aload           5
	//   22   45:checkcast       #327 <Class ViewGroup>
	//   23   48:aload_3         
	//   24   49:invokevirtual   #331 <Method void ViewGroup.removeView(View)>
				addView(view);
	//   25   52:aload_0         
	//   26   53:aload_3         
	//   27   54:invokevirtual   #334 <Method void addView(View)>
			}
			mCustomView = view;
	//   28   57:aload_0         
	//   29   58:aload_3         
	//   30   59:putfield        #311 <Field View mCustomView>
			if(mTextView != null)
	//*  31   62:aload_0         
	//*  32   63:getfield        #229 <Field TextView mTextView>
	//*  33   66:ifnull          78
				mTextView.setVisibility(8);
	//   34   69:aload_0         
	//   35   70:getfield        #229 <Field TextView mTextView>
	//   36   73:bipush          8
	//   37   75:invokevirtual   #149 <Method void TextView.setVisibility(int)>
			if(mIconView != null)
	//*  38   78:aload_0         
	//*  39   79:getfield        #239 <Field ImageView mIconView>
	//*  40   82:ifnull          102
			{
				mIconView.setVisibility(8);
	//   41   85:aload_0         
	//   42   86:getfield        #239 <Field ImageView mIconView>
	//   43   89:bipush          8
	//   44   91:invokevirtual   #132 <Method void ImageView.setVisibility(int)>
				mIconView.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//   45   94:aload_0         
	//   46   95:getfield        #239 <Field ImageView mIconView>
	//   47   98:aconst_null     
	//   48   99:invokevirtual   #129 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			}
			mCustomTextView = (TextView)view.findViewById(0x1020014);
	//   49  102:aload_0         
	//   50  103:aload_3         
	//   51  104:ldc2            #335 <Int 0x1020014>
	//   52  107:invokevirtual   #339 <Method View View.findViewById(int)>
	//   53  110:checkcast       #145 <Class TextView>
	//   54  113:putfield        #341 <Field TextView mCustomTextView>
			if(mCustomTextView != null)
	//*  55  116:aload_0         
	//*  56  117:getfield        #341 <Field TextView mCustomTextView>
	//*  57  120:ifnull          134
				mDefaultMaxLines = TextViewCompat.getMaxLines(mCustomTextView);
	//   58  123:aload_0         
	//   59  124:aload_0         
	//   60  125:getfield        #341 <Field TextView mCustomTextView>
	//   61  128:invokestatic    #252 <Method int TextViewCompat.getMaxLines(TextView)>
	//   62  131:putfield        #30  <Field int mDefaultMaxLines>
			mCustomIconView = (ImageView)view.findViewById(0x1020006);
	//   63  134:aload_0         
	//   64  135:aload_3         
	//   65  136:ldc2            #342 <Int 0x1020006>
	//   66  139:invokevirtual   #339 <Method View View.findViewById(int)>
	//   67  142:checkcast       #125 <Class ImageView>
	//   68  145:putfield        #344 <Field ImageView mCustomIconView>
		} else
	//*  69  148:goto            181
		{
			if(mCustomView != null)
	//*  70  151:aload_0         
	//*  71  152:getfield        #311 <Field View mCustomView>
	//*  72  155:ifnull          171
			{
				removeView(mCustomView);
	//   73  158:aload_0         
	//   74  159:aload_0         
	//   75  160:getfield        #311 <Field View mCustomView>
	//   76  163:invokevirtual   #345 <Method void removeView(View)>
				mCustomView = null;
	//   77  166:aload_0         
	//   78  167:aconst_null     
	//   79  168:putfield        #311 <Field View mCustomView>
			}
			mCustomTextView = null;
	//   80  171:aload_0         
	//   81  172:aconst_null     
	//   82  173:putfield        #341 <Field TextView mCustomTextView>
			mCustomIconView = null;
	//   83  176:aload_0         
	//   84  177:aconst_null     
	//   85  178:putfield        #344 <Field ImageView mCustomIconView>
		}
		view = mCustomView;
	//   86  181:aload_0         
	//   87  182:getfield        #311 <Field View mCustomView>
	//   88  185:astore_3        
		boolean flag1 = false;
	//   89  186:iconst_0        
	//   90  187:istore_2        
		if(view == null)
	//*  91  188:aload_3         
	//*  92  189:ifnonnull       329
		{
			if(mIconView == null)
	//*  93  192:aload_0         
	//*  94  193:getfield        #239 <Field ImageView mIconView>
	//*  95  196:ifnonnull       229
			{
				ImageView imageview = (ImageView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_layout_tab_icon, ((ViewGroup) (this)), false);
	//   96  199:aload_0         
	//   97  200:invokevirtual   #76  <Method Context getContext()>
	//   98  203:invokestatic    #351 <Method LayoutInflater LayoutInflater.from(Context)>
	//   99  206:getstatic       #356 <Field int android.support.design.R$layout.design_layout_tab_icon>
	//  100  209:aload_0         
	//  101  210:iconst_0        
	//  102  211:invokevirtual   #360 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//  103  214:checkcast       #125 <Class ImageView>
	//  104  217:astore_3        
				addView(((View) (imageview)), 0);
	//  105  218:aload_0         
	//  106  219:aload_3         
	//  107  220:iconst_0        
	//  108  221:invokevirtual   #363 <Method void addView(View, int)>
				mIconView = imageview;
	//  109  224:aload_0         
	//  110  225:aload_3         
	//  111  226:putfield        #239 <Field ImageView mIconView>
			}
			if(mTextView == null)
	//* 112  229:aload_0         
	//* 113  230:getfield        #229 <Field TextView mTextView>
	//* 114  233:ifnonnull       276
			{
				TextView textview = (TextView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_layout_tab_text, ((ViewGroup) (this)), false);
	//  115  236:aload_0         
	//  116  237:invokevirtual   #76  <Method Context getContext()>
	//  117  240:invokestatic    #351 <Method LayoutInflater LayoutInflater.from(Context)>
	//  118  243:getstatic       #366 <Field int android.support.design.R$layout.design_layout_tab_text>
	//  119  246:aload_0         
	//  120  247:iconst_0        
	//  121  248:invokevirtual   #360 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//  122  251:checkcast       #145 <Class TextView>
	//  123  254:astore_3        
				addView(((View) (textview)));
	//  124  255:aload_0         
	//  125  256:aload_3         
	//  126  257:invokevirtual   #334 <Method void addView(View)>
				mTextView = textview;
	//  127  260:aload_0         
	//  128  261:aload_3         
	//  129  262:putfield        #229 <Field TextView mTextView>
				mDefaultMaxLines = TextViewCompat.getMaxLines(mTextView);
	//  130  265:aload_0         
	//  131  266:aload_0         
	//  132  267:getfield        #229 <Field TextView mTextView>
	//  133  270:invokestatic    #252 <Method int TextViewCompat.getMaxLines(TextView)>
	//  134  273:putfield        #30  <Field int mDefaultMaxLines>
			}
			TextViewCompat.setTextAppearance(mTextView, mTabTextAppearance);
	//  135  276:aload_0         
	//  136  277:getfield        #229 <Field TextView mTextView>
	//  137  280:aload_0         
	//  138  281:getfield        #25  <Field TabLayout this$0>
	//  139  284:getfield        #369 <Field int TabLayout.mTabTextAppearance>
	//  140  287:invokestatic    #373 <Method void TextViewCompat.setTextAppearance(TextView, int)>
			if(mTabTextColors != null)
	//* 141  290:aload_0         
	//* 142  291:getfield        #25  <Field TabLayout this$0>
	//* 143  294:getfield        #377 <Field android.content.res.ColorStateList TabLayout.mTabTextColors>
	//* 144  297:ifnull          314
				mTextView.setTextColor(mTabTextColors);
	//  145  300:aload_0         
	//  146  301:getfield        #229 <Field TextView mTextView>
	//  147  304:aload_0         
	//  148  305:getfield        #25  <Field TabLayout this$0>
	//  149  308:getfield        #377 <Field android.content.res.ColorStateList TabLayout.mTabTextColors>
	//  150  311:invokevirtual   #381 <Method void TextView.setTextColor(android.content.res.ColorStateList)>
			updateTextAndIcon(mTextView, mIconView);
	//  151  314:aload_0         
	//  152  315:aload_0         
	//  153  316:getfield        #229 <Field TextView mTextView>
	//  154  319:aload_0         
	//  155  320:getfield        #239 <Field ImageView mIconView>
	//  156  323:invokespecial   #383 <Method void updateTextAndIcon(TextView, ImageView)>
		} else
	//* 157  326:goto            355
		if(mCustomTextView != null || mCustomIconView != null)
	//* 158  329:aload_0         
	//* 159  330:getfield        #341 <Field TextView mCustomTextView>
	//* 160  333:ifnonnull       343
	//* 161  336:aload_0         
	//* 162  337:getfield        #344 <Field ImageView mCustomIconView>
	//* 163  340:ifnull          355
			updateTextAndIcon(mCustomTextView, mCustomIconView);
	//  164  343:aload_0         
	//  165  344:aload_0         
	//  166  345:getfield        #341 <Field TextView mCustomTextView>
	//  167  348:aload_0         
	//  168  349:getfield        #344 <Field ImageView mCustomIconView>
	//  169  352:invokespecial   #383 <Method void updateTextAndIcon(TextView, ImageView)>
		boolean flag = flag1;
	//  170  355:iload_2         
	//  171  356:istore_1        
		if(tab != null)
	//* 172  357:aload           4
	//* 173  359:ifnull          374
		{
			flag = flag1;
	//  174  362:iload_2         
	//  175  363:istore_1        
			if(tab.isSelected())
	//* 176  364:aload           4
	//* 177  366:invokevirtual   #384 <Method boolean TabLayout$Tab.isSelected()>
	//* 178  369:ifeq            374
				flag = true;
	//  179  372:iconst_1        
	//  180  373:istore_1        
		}
		setSelected(flag);
	//  181  374:aload_0         
	//  182  375:iload_1         
	//  183  376:invokevirtual   #295 <Method void setSelected(boolean)>
	//  184  379:return          
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
