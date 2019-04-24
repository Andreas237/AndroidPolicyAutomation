// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.view.a;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutCompat, AppCompatSpinner, av, AppCompatImageView, 
//			AppCompatTextView, ax

public class ScrollingTabContainerView extends HorizontalScrollView
	implements android.widget.AdapterView.OnItemSelectedListener
{
	private class a extends BaseAdapter
	{

		public int getCount()
		{
			return a.b.getChildCount();
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field ScrollingTabContainerView a>
		//    2    4:getfield        #22  <Field LinearLayoutCompat ScrollingTabContainerView.b>
		//    3    7:invokevirtual   #27  <Method int LinearLayoutCompat.getChildCount()>
		//    4   10:ireturn         
		}

		public Object getItem(int i1)
		{
			return ((Object) (((c)a.b.getChildAt(i1)).b()));
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field ScrollingTabContainerView a>
		//    2    4:getfield        #22  <Field LinearLayoutCompat ScrollingTabContainerView.b>
		//    3    7:iload_1         
		//    4    8:invokevirtual   #33  <Method View LinearLayoutCompat.getChildAt(int)>
		//    5   11:checkcast       #35  <Class ScrollingTabContainerView$c>
		//    6   14:invokevirtual   #38  <Method android.support.v7.app.ActionBar$b ScrollingTabContainerView$c.b()>
		//    7   17:areturn         
		}

		public long getItemId(int i1)
		{
			return (long)i1;
		//    0    0:iload_1         
		//    1    1:i2l             
		//    2    2:lreturn         
		}

		public View getView(int i1, View view, ViewGroup viewgroup)
		{
			if(view == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       21
			{
				return ((View) (a.a((android.support.v7.app.ActionBar.b)getItem(i1), true)));
		//    2    4:aload_0         
		//    3    5:getfield        #12  <Field ScrollingTabContainerView a>
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:invokevirtual   #44  <Method Object getItem(int)>
		//    7   13:checkcast       #46  <Class android.support.v7.app.ActionBar$b>
		//    8   16:iconst_1        
		//    9   17:invokevirtual   #49  <Method ScrollingTabContainerView$c android.support.v7.widget.ScrollingTabContainerView.a(android.support.v7.app.ActionBar$b, boolean)>
		//   10   20:areturn         
			} else
			{
				((c)view).a((android.support.v7.app.ActionBar.b)getItem(i1));
		//   11   21:aload_2         
		//   12   22:checkcast       #35  <Class ScrollingTabContainerView$c>
		//   13   25:aload_0         
		//   14   26:iload_1         
		//   15   27:invokevirtual   #44  <Method Object getItem(int)>
		//   16   30:checkcast       #46  <Class android.support.v7.app.ActionBar$b>
		//   17   33:invokevirtual   #52  <Method void android.support.v7.widget.ScrollingTabContainerView$c.a(android.support.v7.app.ActionBar$b)>
				return view;
		//   18   36:aload_2         
		//   19   37:areturn         
			}
		}

		final ScrollingTabContainerView a;

		a()
		{
			a = ScrollingTabContainerView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field ScrollingTabContainerView a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void BaseAdapter()>
		//    5    9:return          
		}
	}

	private class b
		implements android.view.View.OnClickListener
	{

		public void onClick(View view)
		{
			((c)view).b().d();
		//    0    0:aload_1         
		//    1    1:checkcast       #23  <Class ScrollingTabContainerView$c>
		//    2    4:invokevirtual   #26  <Method android.support.v7.app.ActionBar$b ScrollingTabContainerView$c.b()>
		//    3    7:invokevirtual   #31  <Method void android.support.v7.app.ActionBar$b.d()>
			int j1 = a.b.getChildCount();
		//    4   10:aload_0         
		//    5   11:getfield        #15  <Field ScrollingTabContainerView a>
		//    6   14:getfield        #34  <Field LinearLayoutCompat ScrollingTabContainerView.b>
		//    7   17:invokevirtual   #40  <Method int LinearLayoutCompat.getChildCount()>
		//    8   20:istore_3        
			for(int i1 = 0; i1 < j1; i1++)
		//*   9   21:iconst_0        
		//*  10   22:istore_2        
		//*  11   23:iload_2         
		//*  12   24:iload_3         
		//*  13   25:icmpge          70
			{
				View view1 = a.b.getChildAt(i1);
		//   14   28:aload_0         
		//   15   29:getfield        #15  <Field ScrollingTabContainerView a>
		//   16   32:getfield        #34  <Field LinearLayoutCompat ScrollingTabContainerView.b>
		//   17   35:iload_2         
		//   18   36:invokevirtual   #44  <Method View LinearLayoutCompat.getChildAt(int)>
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
		//   30   60:invokevirtual   #50  <Method void View.setSelected(boolean)>
			}

		//   31   63:iload_2         
		//   32   64:iconst_1        
		//   33   65:iadd            
		//   34   66:istore_2        
		//*  35   67:goto            23
		//   36   70:return          
		}

		final ScrollingTabContainerView a;

		b()
		{
			a = ScrollingTabContainerView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ScrollingTabContainerView a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	private class c extends LinearLayoutCompat
	{

		public void a()
		{
			android.support.v7.app.ActionBar.b b1 = c;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field android.support.v7.app.ActionBar$b c>
		//    2    4:astore_3        
			View view = b1.c();
		//    3    5:aload_3         
		//    4    6:invokevirtual   #67  <Method View android.support.v7.app.ActionBar$b.c()>
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
		//   11   20:invokevirtual   #73  <Method android.view.ViewParent View.getParent()>
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
		//   19   34:checkcast       #75  <Class ViewGroup>
		//   20   37:aload           4
		//   21   39:invokevirtual   #79  <Method void ViewGroup.removeView(View)>
					addView(view);
		//   22   42:aload_0         
		//   23   43:aload           4
		//   24   45:invokevirtual   #82  <Method void addView(View)>
				}
				f = view;
		//   25   48:aload_0         
		//   26   49:aload           4
		//   27   51:putfield        #84  <Field View f>
				if(d != null)
		//*  28   54:aload_0         
		//*  29   55:getfield        #86  <Field TextView d>
		//*  30   58:ifnull          70
					d.setVisibility(8);
		//   31   61:aload_0         
		//   32   62:getfield        #86  <Field TextView d>
		//   33   65:bipush          8
		//   34   67:invokevirtual   #91  <Method void TextView.setVisibility(int)>
				if(e != null)
		//*  35   70:aload_0         
		//*  36   71:getfield        #93  <Field ImageView e>
		//*  37   74:ifnull          398
				{
					e.setVisibility(8);
		//   38   77:aload_0         
		//   39   78:getfield        #93  <Field ImageView e>
		//   40   81:bipush          8
		//   41   83:invokevirtual   #96  <Method void ImageView.setVisibility(int)>
					e.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
		//   42   86:aload_0         
		//   43   87:getfield        #93  <Field ImageView e>
		//   44   90:aconst_null     
		//   45   91:invokevirtual   #99  <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
					return;
		//   46   94:return          
				}
			} else
			{
				if(f != null)
		//*  47   95:aload_0         
		//*  48   96:getfield        #84  <Field View f>
		//*  49   99:ifnull          115
				{
					removeView(f);
		//   50  102:aload_0         
		//   51  103:aload_0         
		//   52  104:getfield        #84  <Field View f>
		//   53  107:invokevirtual   #100 <Method void removeView(View)>
					f = null;
		//   54  110:aload_0         
		//   55  111:aconst_null     
		//   56  112:putfield        #84  <Field View f>
				}
				android.graphics.drawable.Drawable drawable = b1.a();
		//   57  115:aload_3         
		//   58  116:invokevirtual   #103 <Method android.graphics.drawable.Drawable android.support.v7.app.ActionBar$b.a()>
		//   59  119:astore          5
				CharSequence charsequence = b1.b();
		//   60  121:aload_3         
		//   61  122:invokevirtual   #106 <Method CharSequence android.support.v7.app.ActionBar$b.b()>
		//   62  125:astore          4
				if(drawable != null)
		//*  63  127:aload           5
		//*  64  129:ifnull          212
				{
					if(e == null)
		//*  65  132:aload_0         
		//*  66  133:getfield        #93  <Field ImageView e>
		//*  67  136:ifnonnull       192
					{
						AppCompatImageView appcompatimageview = new AppCompatImageView(getContext());
		//   68  139:new             #108 <Class AppCompatImageView>
		//   69  142:dup             
		//   70  143:aload_0         
		//   71  144:invokevirtual   #112 <Method Context getContext()>
		//   72  147:invokespecial   #115 <Method void AppCompatImageView(Context)>
		//   73  150:astore          6
						LinearLayoutCompat.LayoutParams layoutparams1 = new LinearLayoutCompat.LayoutParams(-2, -2);
		//   74  152:new             #117 <Class LinearLayoutCompat$LayoutParams>
		//   75  155:dup             
		//   76  156:bipush          -2
		//   77  158:bipush          -2
		//   78  160:invokespecial   #120 <Method void LinearLayoutCompat$LayoutParams(int, int)>
		//   79  163:astore          7
						layoutparams1.h = 16;
		//   80  165:aload           7
		//   81  167:bipush          16
		//   82  169:putfield        #123 <Field int LinearLayoutCompat$LayoutParams.h>
						((ImageView) (appcompatimageview)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams1)));
		//   83  172:aload           6
		//   84  174:aload           7
		//   85  176:invokevirtual   #127 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
						addView(((View) (appcompatimageview)), 0);
		//   86  179:aload_0         
		//   87  180:aload           6
		//   88  182:iconst_0        
		//   89  183:invokevirtual   #130 <Method void addView(View, int)>
						e = ((ImageView) (appcompatimageview));
		//   90  186:aload_0         
		//   91  187:aload           6
		//   92  189:putfield        #93  <Field ImageView e>
					}
					e.setImageDrawable(drawable);
		//   93  192:aload_0         
		//   94  193:getfield        #93  <Field ImageView e>
		//   95  196:aload           5
		//   96  198:invokevirtual   #99  <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
					e.setVisibility(0);
		//   97  201:aload_0         
		//   98  202:getfield        #93  <Field ImageView e>
		//   99  205:iconst_0        
		//  100  206:invokevirtual   #96  <Method void ImageView.setVisibility(int)>
				} else
		//* 101  209:goto            236
				if(e != null)
		//* 102  212:aload_0         
		//* 103  213:getfield        #93  <Field ImageView e>
		//* 104  216:ifnull          236
				{
					e.setVisibility(8);
		//  105  219:aload_0         
		//  106  220:getfield        #93  <Field ImageView e>
		//  107  223:bipush          8
		//  108  225:invokevirtual   #96  <Method void ImageView.setVisibility(int)>
					e.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
		//  109  228:aload_0         
		//  110  229:getfield        #93  <Field ImageView e>
		//  111  232:aconst_null     
		//  112  233:invokevirtual   #99  <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
				}
				boolean flag = TextUtils.isEmpty(charsequence) ^ true;
		//  113  236:aload           4
		//  114  238:invokestatic    #136 <Method boolean TextUtils.isEmpty(CharSequence)>
		//  115  241:iconst_1        
		//  116  242:ixor            
		//  117  243:istore_1        
				if(flag)
		//* 118  244:iload_1         
		//* 119  245:ifeq            339
				{
					if(d == null)
		//* 120  248:aload_0         
		//* 121  249:getfield        #86  <Field TextView d>
		//* 122  252:ifnonnull       319
					{
						AppCompatTextView appcompattextview = new AppCompatTextView(getContext(), ((android.util.AttributeSet) (null)), android.support.v7.a.a.a.actionBarTabTextStyle);
		//  123  255:new             #138 <Class AppCompatTextView>
		//  124  258:dup             
		//  125  259:aload_0         
		//  126  260:invokevirtual   #112 <Method Context getContext()>
		//  127  263:aconst_null     
		//  128  264:getstatic       #141 <Field int android.support.v7.a.a$a.actionBarTabTextStyle>
		//  129  267:invokespecial   #142 <Method void AppCompatTextView(Context, android.util.AttributeSet, int)>
		//  130  270:astore          5
						((TextView) (appcompattextview)).setEllipsize(android.text.TextUtils.TruncateAt.END);
		//  131  272:aload           5
		//  132  274:getstatic       #148 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
		//  133  277:invokevirtual   #152 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
						LinearLayoutCompat.LayoutParams layoutparams = new LinearLayoutCompat.LayoutParams(-2, -2);
		//  134  280:new             #117 <Class LinearLayoutCompat$LayoutParams>
		//  135  283:dup             
		//  136  284:bipush          -2
		//  137  286:bipush          -2
		//  138  288:invokespecial   #120 <Method void LinearLayoutCompat$LayoutParams(int, int)>
		//  139  291:astore          6
						layoutparams.h = 16;
		//  140  293:aload           6
		//  141  295:bipush          16
		//  142  297:putfield        #123 <Field int LinearLayoutCompat$LayoutParams.h>
						((TextView) (appcompattextview)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
		//  143  300:aload           5
		//  144  302:aload           6
		//  145  304:invokevirtual   #153 <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
						addView(((View) (appcompattextview)));
		//  146  307:aload_0         
		//  147  308:aload           5
		//  148  310:invokevirtual   #82  <Method void addView(View)>
						d = ((TextView) (appcompattextview));
		//  149  313:aload_0         
		//  150  314:aload           5
		//  151  316:putfield        #86  <Field TextView d>
					}
					d.setText(charsequence);
		//  152  319:aload_0         
		//  153  320:getfield        #86  <Field TextView d>
		//  154  323:aload           4
		//  155  325:invokevirtual   #157 <Method void TextView.setText(CharSequence)>
					d.setVisibility(0);
		//  156  328:aload_0         
		//  157  329:getfield        #86  <Field TextView d>
		//  158  332:iconst_0        
		//  159  333:invokevirtual   #91  <Method void TextView.setVisibility(int)>
				} else
		//* 160  336:goto            363
				if(d != null)
		//* 161  339:aload_0         
		//* 162  340:getfield        #86  <Field TextView d>
		//* 163  343:ifnull          363
				{
					d.setVisibility(8);
		//  164  346:aload_0         
		//  165  347:getfield        #86  <Field TextView d>
		//  166  350:bipush          8
		//  167  352:invokevirtual   #91  <Method void TextView.setVisibility(int)>
					d.setText(((CharSequence) (null)));
		//  168  355:aload_0         
		//  169  356:getfield        #86  <Field TextView d>
		//  170  359:aconst_null     
		//  171  360:invokevirtual   #157 <Method void TextView.setText(CharSequence)>
				}
				if(e != null)
		//* 172  363:aload_0         
		//* 173  364:getfield        #93  <Field ImageView e>
		//* 174  367:ifnull          381
					e.setContentDescription(b1.e());
		//  175  370:aload_0         
		//  176  371:getfield        #93  <Field ImageView e>
		//  177  374:aload_3         
		//  178  375:invokevirtual   #159 <Method CharSequence android.support.v7.app.ActionBar$b.e()>
		//  179  378:invokevirtual   #162 <Method void ImageView.setContentDescription(CharSequence)>
				if(!flag)
		//* 180  381:iload_1         
		//* 181  382:ifeq            388
		//* 182  385:goto            393
					obj = ((Object) (b1.e()));
		//  183  388:aload_3         
		//  184  389:invokevirtual   #159 <Method CharSequence android.support.v7.app.ActionBar$b.e()>
		//  185  392:astore_2        
				android.support.v7.widget.ax.a(((View) (this)), ((CharSequence) (obj)));
		//  186  393:aload_0         
		//  187  394:aload_2         
		//  188  395:invokestatic    #167 <Method void android.support.v7.widget.ax.a(View, CharSequence)>
			}
		//  189  398:return          
		}

		public void a(android.support.v7.app.ActionBar.b b1)
		{
			c = b1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #36  <Field android.support.v7.app.ActionBar$b c>
			a();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #61  <Method void a()>
		//    5    9:return          
		}

		public android.support.v7.app.ActionBar.b b()
		{
			return c;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field android.support.v7.app.ActionBar$b c>
		//    2    4:areturn         
		}

		public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
		{
			super.onInitializeAccessibilityEvent(accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #173 <Method void LinearLayoutCompat.onInitializeAccessibilityEvent(AccessibilityEvent)>
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$b)).getName())));
		//    3    5:aload_1         
		//    4    6:ldc1            #64  <Class android.support.v7.app.ActionBar$b>
		//    5    8:invokevirtual   #179 <Method String Class.getName()>
		//    6   11:invokevirtual   #184 <Method void AccessibilityEvent.setClassName(CharSequence)>
		//    7   14:return          
		}

		public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
		{
			super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #188 <Method void LinearLayoutCompat.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
			accessibilitynodeinfo.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$b)).getName())));
		//    3    5:aload_1         
		//    4    6:ldc1            #64  <Class android.support.v7.app.ActionBar$b>
		//    5    8:invokevirtual   #179 <Method String Class.getName()>
		//    6   11:invokevirtual   #191 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
		//    7   14:return          
		}

		public void onMeasure(int i1, int j1)
		{
			super.onMeasure(i1, j1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #194 <Method void LinearLayoutCompat.onMeasure(int, int)>
			if(a.c > 0 && getMeasuredWidth() > a.c)
		//*   4    6:aload_0         
		//*   5    7:getfield        #22  <Field ScrollingTabContainerView a>
		//*   6   10:getfield        #196 <Field int ScrollingTabContainerView.c>
		//*   7   13:ifle            47
		//*   8   16:aload_0         
		//*   9   17:invokevirtual   #200 <Method int getMeasuredWidth()>
		//*  10   20:aload_0         
		//*  11   21:getfield        #22  <Field ScrollingTabContainerView a>
		//*  12   24:getfield        #196 <Field int ScrollingTabContainerView.c>
		//*  13   27:icmple          47
				super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(a.c, 0x40000000), j1);
		//   14   30:aload_0         
		//   15   31:aload_0         
		//   16   32:getfield        #22  <Field ScrollingTabContainerView a>
		//   17   35:getfield        #196 <Field int ScrollingTabContainerView.c>
		//   18   38:ldc1            #201 <Int 0x40000000>
		//   19   40:invokestatic    #207 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   20   43:iload_2         
		//   21   44:invokespecial   #194 <Method void LinearLayoutCompat.onMeasure(int, int)>
		//   22   47:return          
		}

		public void setSelected(boolean flag)
		{
			boolean flag1;
			if(isSelected() != flag)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #213 <Method boolean isSelected()>
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
		//   11   17:invokespecial   #215 <Method void LinearLayoutCompat.setSelected(boolean)>
			if(flag1 && flag)
		//*  12   20:iload_2         
		//*  13   21:ifeq            33
		//*  14   24:iload_1         
		//*  15   25:ifeq            33
				sendAccessibilityEvent(4);
		//   16   28:aload_0         
		//   17   29:iconst_4        
		//   18   30:invokevirtual   #218 <Method void sendAccessibilityEvent(int)>
		//   19   33:return          
		}

		final ScrollingTabContainerView a;
		private final int b[] = {
			0x10100d4
		};
		private android.support.v7.app.ActionBar.b c;
		private TextView d;
		private ImageView e;
		private View f;

		public c(Context context, android.support.v7.app.ActionBar.b b1, boolean flag)
		{
			a = ScrollingTabContainerView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field ScrollingTabContainerView a>
			super(context, ((android.util.AttributeSet) (null)), android.support.v7.a.a.a.actionBarTabStyle);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:aconst_null     
		//    6    8:getstatic       #28  <Field int android.support.v7.a.a$a.actionBarTabStyle>
		//    7   11:invokespecial   #31  <Method void LinearLayoutCompat(Context, android.util.AttributeSet, int)>
		//    8   14:aload_0         
		//    9   15:iconst_1        
		//   10   16:newarray        int[]
		//   11   18:dup             
		//   12   19:iconst_0        
		//   13   20:ldc1            #32  <Int 0x10100d4>
		//   14   22:iastore         
		//   15   23:putfield        #34  <Field int[] b>
			c = b1;
		//   16   26:aload_0         
		//   17   27:aload_3         
		//   18   28:putfield        #36  <Field android.support.v7.app.ActionBar$b c>
			scrollingtabcontainerview = ((ScrollingTabContainerView) (android.support.v7.widget.av.a(context, ((android.util.AttributeSet) (null)), b, android.support.v7.a.a.a.actionBarTabStyle, 0)));
		//   19   31:aload_2         
		//   20   32:aconst_null     
		//   21   33:aload_0         
		//   22   34:getfield        #34  <Field int[] b>
		//   23   37:getstatic       #28  <Field int android.support.v7.a.a$a.actionBarTabStyle>
		//   24   40:iconst_0        
		//   25   41:invokestatic    #41  <Method av android.support.v7.widget.av.a(Context, android.util.AttributeSet, int[], int, int)>
		//   26   44:astore_1        
			if(g(0))
		//*  27   45:aload_1         
		//*  28   46:iconst_0        
		//*  29   47:invokevirtual   #45  <Method boolean av.g(int)>
		//*  30   50:ifeq            62
				setBackgroundDrawable(av.this.a(0));
		//   31   53:aload_0         
		//   32   54:aload_1         
		//   33   55:iconst_0        
		//   34   56:invokevirtual   #48  <Method android.graphics.drawable.Drawable android.support.v7.widget.av.a(int)>
		//   35   59:invokevirtual   #52  <Method void setBackgroundDrawable(android.graphics.drawable.Drawable)>
			av.this.a();
		//   36   62:aload_1         
		//   37   63:invokevirtual   #55  <Method void android.support.v7.widget.av.a()>
			if(flag)
		//*  38   66:iload           4
		//*  39   68:ifeq            77
				setGravity(0x800013);
		//   40   71:aload_0         
		//   41   72:ldc1            #56  <Int 0x800013>
		//   42   74:invokevirtual   #60  <Method void setGravity(int)>
			a();
		//   43   77:aload_0         
		//   44   78:invokevirtual   #61  <Method void a()>
		//   45   81:return          
		}
	}

	protected class d extends AnimatorListenerAdapter
	{

		public void onAnimationCancel(Animator animator)
		{
			b = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #22  <Field boolean b>
		//    3    5:return          
		}

		public void onAnimationEnd(Animator animator)
		{
			if(b)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field boolean b>
		//*   2    4:ifeq            8
			{
				return;
		//    3    7:return          
			} else
			{
				a.e = null;
		//    4    8:aload_0         
		//    5    9:getfield        #17  <Field ScrollingTabContainerView a>
		//    6   12:aconst_null     
		//    7   13:putfield        #30  <Field ViewPropertyAnimator ScrollingTabContainerView.e>
				a.setVisibility(c);
		//    8   16:aload_0         
		//    9   17:getfield        #17  <Field ScrollingTabContainerView a>
		//   10   20:aload_0         
		//   11   21:getfield        #32  <Field int c>
		//   12   24:invokevirtual   #36  <Method void ScrollingTabContainerView.setVisibility(int)>
				return;
		//   13   27:return          
			}
		}

		public void onAnimationStart(Animator animator)
		{
			a.setVisibility(0);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ScrollingTabContainerView a>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #36  <Method void ScrollingTabContainerView.setVisibility(int)>
			b = false;
		//    4    8:aload_0         
		//    5    9:iconst_0        
		//    6   10:putfield        #22  <Field boolean b>
		//    7   13:return          
		}

		final ScrollingTabContainerView a;
		private boolean b;
		private int c;

		protected d()
		{
			a = ScrollingTabContainerView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field ScrollingTabContainerView a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void AnimatorListenerAdapter()>
			b = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #22  <Field boolean b>
		//    8   14:return          
		}
	}


	public ScrollingTabContainerView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #50  <Method void HorizontalScrollView(Context)>
	//    3    5:aload_0         
	//    4    6:new             #19  <Class ScrollingTabContainerView$d>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #53  <Method void ScrollingTabContainerView$d(ScrollingTabContainerView)>
	//    8   14:putfield        #55  <Field ScrollingTabContainerView$d f>
		setHorizontalScrollBarEnabled(false);
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #59  <Method void setHorizontalScrollBarEnabled(boolean)>
		context = ((Context) (android.support.v7.view.a.a(context)));
	//   12   22:aload_1         
	//   13   23:invokestatic    #64  <Method a a.a(Context)>
	//   14   26:astore_1        
		setContentHeight(((android.support.v7.view.a) (context)).e());
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #67  <Method int a.e()>
	//   18   32:invokevirtual   #71  <Method void setContentHeight(int)>
		d = ((android.support.v7.view.a) (context)).g();
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #73  <Method int a.g()>
	//   22   40:putfield        #75  <Field int d>
		b = d();
	//   23   43:aload_0         
	//   24   44:aload_0         
	//   25   45:invokespecial   #78  <Method LinearLayoutCompat d()>
	//   26   48:putfield        #80  <Field LinearLayoutCompat b>
		addView(((View) (b)), new android.view.ViewGroup.LayoutParams(-2, -1));
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #80  <Field LinearLayoutCompat b>
	//   30   56:new             #82  <Class android.view.ViewGroup$LayoutParams>
	//   31   59:dup             
	//   32   60:bipush          -2
	//   33   62:iconst_m1       
	//   34   63:invokespecial   #85  <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   35   66:invokevirtual   #89  <Method void addView(View, android.view.ViewGroup$LayoutParams)>
	//   36   69:return          
	}

	private boolean a()
	{
		return h != null && h.getParent() == this;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Spinner h>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #92  <Field Spinner h>
	//    5   11:invokevirtual   #98  <Method android.view.ViewParent Spinner.getParent()>
	//    6   14:aload_0         
	//    7   15:if_acmpne       20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	private void b()
	{
		if(a())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #100 <Method boolean a()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(h == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #92  <Field Spinner h>
	//*   6   12:ifnonnull       23
			h = e();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokespecial   #103 <Method Spinner e()>
	//   10   20:putfield        #92  <Field Spinner h>
		removeView(((View) (b)));
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #80  <Field LinearLayoutCompat b>
	//   14   28:invokevirtual   #107 <Method void removeView(View)>
		addView(((View) (h)), new android.view.ViewGroup.LayoutParams(-2, -1));
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #92  <Field Spinner h>
	//   18   36:new             #82  <Class android.view.ViewGroup$LayoutParams>
	//   19   39:dup             
	//   20   40:bipush          -2
	//   21   42:iconst_m1       
	//   22   43:invokespecial   #85  <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   23   46:invokevirtual   #89  <Method void addView(View, android.view.ViewGroup$LayoutParams)>
		if(h.getAdapter() == null)
	//*  24   49:aload_0         
	//*  25   50:getfield        #92  <Field Spinner h>
	//*  26   53:invokevirtual   #111 <Method android.widget.SpinnerAdapter Spinner.getAdapter()>
	//*  27   56:ifnonnull       74
			h.setAdapter(((android.widget.SpinnerAdapter) (new a())));
	//   28   59:aload_0         
	//   29   60:getfield        #92  <Field Spinner h>
	//   30   63:new             #10  <Class ScrollingTabContainerView$a>
	//   31   66:dup             
	//   32   67:aload_0         
	//   33   68:invokespecial   #112 <Method void ScrollingTabContainerView$a(ScrollingTabContainerView)>
	//   34   71:invokevirtual   #116 <Method void Spinner.setAdapter(android.widget.SpinnerAdapter)>
		if(a != null)
	//*  35   74:aload_0         
	//*  36   75:getfield        #118 <Field Runnable a>
	//*  37   78:ifnull          95
		{
			removeCallbacks(a);
	//   38   81:aload_0         
	//   39   82:aload_0         
	//   40   83:getfield        #118 <Field Runnable a>
	//   41   86:invokevirtual   #122 <Method boolean removeCallbacks(Runnable)>
	//   42   89:pop             
			a = null;
	//   43   90:aload_0         
	//   44   91:aconst_null     
	//   45   92:putfield        #118 <Field Runnable a>
		}
		h.setSelection(k);
	//   46   95:aload_0         
	//   47   96:getfield        #92  <Field Spinner h>
	//   48   99:aload_0         
	//   49  100:getfield        #124 <Field int k>
	//   50  103:invokevirtual   #127 <Method void Spinner.setSelection(int)>
	//   51  106:return          
	}

	private boolean c()
	{
		if(!a())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #100 <Method boolean a()>
	//*   2    4:ifne            9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			removeView(((View) (h)));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #92  <Field Spinner h>
	//    8   14:invokevirtual   #107 <Method void removeView(View)>
			addView(((View) (b)), new android.view.ViewGroup.LayoutParams(-2, -1));
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #80  <Field LinearLayoutCompat b>
	//   12   22:new             #82  <Class android.view.ViewGroup$LayoutParams>
	//   13   25:dup             
	//   14   26:bipush          -2
	//   15   28:iconst_m1       
	//   16   29:invokespecial   #85  <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   17   32:invokevirtual   #89  <Method void addView(View, android.view.ViewGroup$LayoutParams)>
			setTabSelected(h.getSelectedItemPosition());
	//   18   35:aload_0         
	//   19   36:aload_0         
	//   20   37:getfield        #92  <Field Spinner h>
	//   21   40:invokevirtual   #130 <Method int Spinner.getSelectedItemPosition()>
	//   22   43:invokevirtual   #133 <Method void setTabSelected(int)>
			return false;
	//   23   46:iconst_0        
	//   24   47:ireturn         
		}
	}

	private LinearLayoutCompat d()
	{
		LinearLayoutCompat linearlayoutcompat = new LinearLayoutCompat(getContext(), ((android.util.AttributeSet) (null)), android.support.v7.a.a.a.actionBarTabBarStyle);
	//    0    0:new             #135 <Class LinearLayoutCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #139 <Method Context getContext()>
	//    4    8:aconst_null     
	//    5    9:getstatic       #144 <Field int android.support.v7.a.a$a.actionBarTabBarStyle>
	//    6   12:invokespecial   #147 <Method void LinearLayoutCompat(Context, android.util.AttributeSet, int)>
	//    7   15:astore_1        
		linearlayoutcompat.setMeasureWithLargestChildEnabled(true);
	//    8   16:aload_1         
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #150 <Method void LinearLayoutCompat.setMeasureWithLargestChildEnabled(boolean)>
		linearlayoutcompat.setGravity(17);
	//   11   21:aload_1         
	//   12   22:bipush          17
	//   13   24:invokevirtual   #153 <Method void LinearLayoutCompat.setGravity(int)>
		linearlayoutcompat.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new LinearLayoutCompat.LayoutParams(-2, -1))));
	//   14   27:aload_1         
	//   15   28:new             #155 <Class LinearLayoutCompat$LayoutParams>
	//   16   31:dup             
	//   17   32:bipush          -2
	//   18   34:iconst_m1       
	//   19   35:invokespecial   #156 <Method void LinearLayoutCompat$LayoutParams(int, int)>
	//   20   38:invokevirtual   #160 <Method void LinearLayoutCompat.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		return linearlayoutcompat;
	//   21   41:aload_1         
	//   22   42:areturn         
	}

	private Spinner e()
	{
		AppCompatSpinner appcompatspinner = new AppCompatSpinner(getContext(), ((android.util.AttributeSet) (null)), android.support.v7.a.a.a.actionDropDownStyle);
	//    0    0:new             #162 <Class AppCompatSpinner>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #139 <Method Context getContext()>
	//    4    8:aconst_null     
	//    5    9:getstatic       #165 <Field int android.support.v7.a.a$a.actionDropDownStyle>
	//    6   12:invokespecial   #166 <Method void AppCompatSpinner(Context, android.util.AttributeSet, int)>
	//    7   15:astore_1        
		((Spinner) (appcompatspinner)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new LinearLayoutCompat.LayoutParams(-2, -1))));
	//    8   16:aload_1         
	//    9   17:new             #155 <Class LinearLayoutCompat$LayoutParams>
	//   10   20:dup             
	//   11   21:bipush          -2
	//   12   23:iconst_m1       
	//   13   24:invokespecial   #156 <Method void LinearLayoutCompat$LayoutParams(int, int)>
	//   14   27:invokevirtual   #167 <Method void Spinner.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		((Spinner) (appcompatspinner)).setOnItemSelectedListener(((android.widget.AdapterView.OnItemSelectedListener) (this)));
	//   15   30:aload_1         
	//   16   31:aload_0         
	//   17   32:invokevirtual   #171 <Method void Spinner.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
		return ((Spinner) (appcompatspinner));
	//   18   35:aload_1         
	//   19   36:areturn         
	}

	c a(android.support.v7.app.ActionBar.b b1, boolean flag)
	{
		b1 = ((android.support.v7.app.ActionBar.b) (new c(getContext(), b1, flag)));
	//    0    0:new             #16  <Class ScrollingTabContainerView$c>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #139 <Method Context getContext()>
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokespecial   #175 <Method void ScrollingTabContainerView$c(ScrollingTabContainerView, Context, android.support.v7.app.ActionBar$b, boolean)>
	//    8   14:astore_1        
		if(flag)
	//*   9   15:iload_2         
	//*  10   16:ifeq            42
		{
			((c) (b1)).setBackgroundDrawable(((android.graphics.drawable.Drawable) (null)));
	//   11   19:aload_1         
	//   12   20:aconst_null     
	//   13   21:invokevirtual   #179 <Method void ScrollingTabContainerView$c.setBackgroundDrawable(android.graphics.drawable.Drawable)>
			((c) (b1)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.AbsListView.LayoutParams(-1, j))));
	//   14   24:aload_1         
	//   15   25:new             #181 <Class android.widget.AbsListView$LayoutParams>
	//   16   28:dup             
	//   17   29:iconst_m1       
	//   18   30:aload_0         
	//   19   31:getfield        #183 <Field int j>
	//   20   34:invokespecial   #184 <Method void android.widget.AbsListView$LayoutParams(int, int)>
	//   21   37:invokevirtual   #185 <Method void ScrollingTabContainerView$c.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			return ((c) (b1));
	//   22   40:aload_1         
	//   23   41:areturn         
		}
		((c) (b1)).setFocusable(true);
	//   24   42:aload_1         
	//   25   43:iconst_1        
	//   26   44:invokevirtual   #188 <Method void ScrollingTabContainerView$c.setFocusable(boolean)>
		if(g == null)
	//*  27   47:aload_0         
	//*  28   48:getfield        #190 <Field ScrollingTabContainerView$b g>
	//*  29   51:ifnonnull       66
			g = new b();
	//   30   54:aload_0         
	//   31   55:new             #13  <Class ScrollingTabContainerView$b>
	//   32   58:dup             
	//   33   59:aload_0         
	//   34   60:invokespecial   #191 <Method void ScrollingTabContainerView$b(ScrollingTabContainerView)>
	//   35   63:putfield        #190 <Field ScrollingTabContainerView$b g>
		((c) (b1)).setOnClickListener(((android.view.View.OnClickListener) (g)));
	//   36   66:aload_1         
	//   37   67:aload_0         
	//   38   68:getfield        #190 <Field ScrollingTabContainerView$b g>
	//   39   71:invokevirtual   #195 <Method void ScrollingTabContainerView$c.setOnClickListener(android.view.View$OnClickListener)>
		return ((c) (b1));
	//   40   74:aload_1         
	//   41   75:areturn         
	}

	public void a(int i1)
	{
		View view = b.getChildAt(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field LinearLayoutCompat b>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #199 <Method View LinearLayoutCompat.getChildAt(int)>
	//    4    8:astore_2        
		if(a != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #118 <Field Runnable a>
	//*   7   13:ifnull          25
			removeCallbacks(a);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #118 <Field Runnable a>
	//   11   21:invokevirtual   #122 <Method boolean removeCallbacks(Runnable)>
	//   12   24:pop             
		a = new Runnable(view) {

			public void run()
			{
				int j1 = a.getLeft();
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field View a>
			//    2    4:invokevirtual   #31  <Method int View.getLeft()>
			//    3    7:istore_1        
				int k1 = (b.getWidth() - a.getWidth()) / 2;
			//    4    8:aload_0         
			//    5    9:getfield        #18  <Field ScrollingTabContainerView b>
			//    6   12:invokevirtual   #34  <Method int ScrollingTabContainerView.getWidth()>
			//    7   15:aload_0         
			//    8   16:getfield        #20  <Field View a>
			//    9   19:invokevirtual   #35  <Method int View.getWidth()>
			//   10   22:isub            
			//   11   23:iconst_2        
			//   12   24:idiv            
			//   13   25:istore_2        
				b.smoothScrollTo(j1 - k1, 0);
			//   14   26:aload_0         
			//   15   27:getfield        #18  <Field ScrollingTabContainerView b>
			//   16   30:iload_1         
			//   17   31:iload_2         
			//   18   32:isub            
			//   19   33:iconst_0        
			//   20   34:invokevirtual   #39  <Method void ScrollingTabContainerView.smoothScrollTo(int, int)>
				b.a = null;
			//   21   37:aload_0         
			//   22   38:getfield        #18  <Field ScrollingTabContainerView b>
			//   23   41:aconst_null     
			//   24   42:putfield        #42  <Field Runnable android.support.v7.widget.ScrollingTabContainerView.a>
			//   25   45:return          
			}

			final View a;
			final ScrollingTabContainerView b;

			
			{
				b = ScrollingTabContainerView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ScrollingTabContainerView b>
				a = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field View a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//   13   25:aload_0         
	//   14   26:new             #8   <Class ScrollingTabContainerView$1>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:invokespecial   #202 <Method void ScrollingTabContainerView$1(ScrollingTabContainerView, View)>
	//   19   35:putfield        #118 <Field Runnable a>
		post(a);
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #118 <Field Runnable a>
	//   23   43:invokevirtual   #205 <Method boolean post(Runnable)>
	//   24   46:pop             
	//   25   47:return          
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #208 <Method void HorizontalScrollView.onAttachedToWindow()>
		if(a != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #118 <Field Runnable a>
	//*   4    8:ifnull          20
			post(a);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #118 <Field Runnable a>
	//    8   16:invokevirtual   #205 <Method boolean post(Runnable)>
	//    9   19:pop             
	//   10   20:return          
	}

	protected void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #212 <Method void HorizontalScrollView.onConfigurationChanged(Configuration)>
		configuration = ((Configuration) (android.support.v7.view.a.a(getContext())));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #139 <Method Context getContext()>
	//    5    9:invokestatic    #64  <Method a a.a(Context)>
	//    6   12:astore_1        
		setContentHeight(((android.support.v7.view.a) (configuration)).e());
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #67  <Method int a.e()>
	//   10   18:invokevirtual   #71  <Method void setContentHeight(int)>
		d = ((android.support.v7.view.a) (configuration)).g();
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #73  <Method int a.g()>
	//   14   26:putfield        #75  <Field int d>
	//   15   29:return          
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #215 <Method void HorizontalScrollView.onDetachedFromWindow()>
		if(a != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #118 <Field Runnable a>
	//*   4    8:ifnull          20
			removeCallbacks(a);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #118 <Field Runnable a>
	//    8   16:invokevirtual   #122 <Method boolean removeCallbacks(Runnable)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void onItemSelected(AdapterView adapterview, View view, int i1, long l1)
	{
		((c)view).b().d();
	//    0    0:aload_2         
	//    1    1:checkcast       #16  <Class ScrollingTabContainerView$c>
	//    2    4:invokevirtual   #220 <Method android.support.v7.app.ActionBar$b ScrollingTabContainerView$c.b()>
	//    3    7:invokevirtual   #224 <Method void android.support.v7.app.ActionBar$b.d()>
	//    4   10:return          
	}

	public void onMeasure(int i1, int j1)
	{
		int k1;
		boolean flag1;
label0:
		{
			j1 = android.view.View.MeasureSpec.getMode(i1);
	//    0    0:iload_1         
	//    1    1:invokestatic    #233 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_2        
			boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_3        
			if(j1 == 0x40000000)
	//*   5    7:iload_2         
	//*   6    8:ldc1            #234 <Int 0x40000000>
	//*   7   10:icmpne          19
				flag1 = true;
	//    8   13:iconst_1        
	//    9   14:istore          5
			else
	//*  10   16:goto            22
				flag1 = false;
	//   11   19:iconst_0        
	//   12   20:istore          5
			setFillViewport(flag1);
	//   13   22:aload_0         
	//   14   23:iload           5
	//   15   25:invokevirtual   #237 <Method void setFillViewport(boolean)>
			k1 = b.getChildCount();
	//   16   28:aload_0         
	//   17   29:getfield        #80  <Field LinearLayoutCompat b>
	//   18   32:invokevirtual   #240 <Method int LinearLayoutCompat.getChildCount()>
	//   19   35:istore          4
			if(k1 > 1 && (j1 == 0x40000000 || j1 == 0x80000000))
	//*  20   37:iload           4
	//*  21   39:iconst_1        
	//*  22   40:icmple          102
	//*  23   43:iload_2         
	//*  24   44:ldc1            #234 <Int 0x40000000>
	//*  25   46:icmpeq          55
	//*  26   49:iload_2         
	//*  27   50:ldc1            #241 <Int 0x80000000>
	//*  28   52:icmpne          102
			{
				if(k1 > 2)
	//*  29   55:iload           4
	//*  30   57:iconst_2        
	//*  31   58:icmple          77
					c = (int)((float)android.view.View.MeasureSpec.getSize(i1) * 0.4F);
	//   32   61:aload_0         
	//   33   62:iload_1         
	//   34   63:invokestatic    #244 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   35   66:i2f             
	//   36   67:ldc1            #245 <Float 0.4F>
	//   37   69:fmul            
	//   38   70:f2i             
	//   39   71:putfield        #247 <Field int c>
				else
	//*  40   74:goto            87
					c = android.view.View.MeasureSpec.getSize(i1) / 2;
	//   41   77:aload_0         
	//   42   78:iload_1         
	//   43   79:invokestatic    #244 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   44   82:iconst_2        
	//   45   83:idiv            
	//   46   84:putfield        #247 <Field int c>
				j1 = Math.min(c, d);
	//   47   87:aload_0         
	//   48   88:getfield        #247 <Field int c>
	//   49   91:aload_0         
	//   50   92:getfield        #75  <Field int d>
	//   51   95:invokestatic    #253 <Method int Math.min(int, int)>
	//   52   98:istore_2        
			} else
	//*  53   99:goto            104
			{
				j1 = -1;
	//   54  102:iconst_m1       
	//   55  103:istore_2        
			}
			c = j1;
	//   56  104:aload_0         
	//   57  105:iload_2         
	//   58  106:putfield        #247 <Field int c>
			k1 = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
	//   59  109:aload_0         
	//   60  110:getfield        #183 <Field int j>
	//   61  113:ldc1            #234 <Int 0x40000000>
	//   62  115:invokestatic    #256 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   63  118:istore          4
			if(!flag1 && i)
	//*  64  120:iload           5
	//*  65  122:ifne            137
	//*  66  125:aload_0         
	//*  67  126:getfield        #258 <Field boolean i>
	//*  68  129:ifeq            137
				j1 = ((int) (flag));
	//   69  132:iload_3         
	//   70  133:istore_2        
			else
	//*  71  134:goto            139
				j1 = 0;
	//   72  137:iconst_0        
	//   73  138:istore_2        
			if(j1 != 0)
	//*  74  139:iload_2         
	//*  75  140:ifeq            174
			{
				b.measure(0, k1);
	//   76  143:aload_0         
	//   77  144:getfield        #80  <Field LinearLayoutCompat b>
	//   78  147:iconst_0        
	//   79  148:iload           4
	//   80  150:invokevirtual   #261 <Method void LinearLayoutCompat.measure(int, int)>
				if(b.getMeasuredWidth() > android.view.View.MeasureSpec.getSize(i1))
	//*  81  153:aload_0         
	//*  82  154:getfield        #80  <Field LinearLayoutCompat b>
	//*  83  157:invokevirtual   #264 <Method int LinearLayoutCompat.getMeasuredWidth()>
	//*  84  160:iload_1         
	//*  85  161:invokestatic    #244 <Method int android.view.View$MeasureSpec.getSize(int)>
	//*  86  164:icmple          174
				{
					b();
	//   87  167:aload_0         
	//   88  168:invokespecial   #266 <Method void b()>
					break label0;
	//   89  171:goto            179
				}
			}
			c();
	//   90  174:aload_0         
	//   91  175:invokespecial   #268 <Method boolean c()>
	//   92  178:pop             
		}
		j1 = getMeasuredWidth();
	//   93  179:aload_0         
	//   94  180:invokevirtual   #269 <Method int getMeasuredWidth()>
	//   95  183:istore_2        
		super.onMeasure(i1, k1);
	//   96  184:aload_0         
	//   97  185:iload_1         
	//   98  186:iload           4
	//   99  188:invokespecial   #271 <Method void HorizontalScrollView.onMeasure(int, int)>
		i1 = getMeasuredWidth();
	//  100  191:aload_0         
	//  101  192:invokevirtual   #269 <Method int getMeasuredWidth()>
	//  102  195:istore_1        
		if(flag1 && j1 != i1)
	//* 103  196:iload           5
	//* 104  198:ifeq            214
	//* 105  201:iload_2         
	//* 106  202:iload_1         
	//* 107  203:icmpeq          214
			setTabSelected(k);
	//  108  206:aload_0         
	//  109  207:aload_0         
	//  110  208:getfield        #124 <Field int k>
	//  111  211:invokevirtual   #133 <Method void setTabSelected(int)>
	//  112  214:return          
	}

	public void onNothingSelected(AdapterView adapterview)
	{
	//    0    0:return          
	}

	public void setAllowCollapse(boolean flag)
	{
		i = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #258 <Field boolean i>
	//    3    5:return          
	}

	public void setContentHeight(int i1)
	{
		j = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #183 <Field int j>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #278 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setTabSelected(int i1)
	{
		k = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #124 <Field int k>
		int k1 = b.getChildCount();
	//    3    5:aload_0         
	//    4    6:getfield        #80  <Field LinearLayoutCompat b>
	//    5    9:invokevirtual   #240 <Method int LinearLayoutCompat.getChildCount()>
	//    6   12:istore_3        
		for(int j1 = 0; j1 < k1; j1++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          68
		{
			View view = b.getChildAt(j1);
	//   12   20:aload_0         
	//   13   21:getfield        #80  <Field LinearLayoutCompat b>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #199 <Method View LinearLayoutCompat.getChildAt(int)>
	//   16   28:astore          5
			boolean flag;
			if(j1 == i1)
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
	//   27   48:invokevirtual   #283 <Method void View.setSelected(boolean)>
			if(flag)
	//*  28   51:iload           4
	//*  29   53:ifeq            61
				a(i1);
	//   30   56:aload_0         
	//   31   57:iload_1         
	//   32   58:invokevirtual   #285 <Method void a(int)>
		}

	//   33   61:iload_2         
	//   34   62:iconst_1        
	//   35   63:iadd            
	//   36   64:istore_2        
	//*  37   65:goto            15
		if(h != null && i1 >= 0)
	//*  38   68:aload_0         
	//*  39   69:getfield        #92  <Field Spinner h>
	//*  40   72:ifnull          87
	//*  41   75:iload_1         
	//*  42   76:iflt            87
			h.setSelection(i1);
	//   43   79:aload_0         
	//   44   80:getfield        #92  <Field Spinner h>
	//   45   83:iload_1         
	//   46   84:invokevirtual   #127 <Method void Spinner.setSelection(int)>
	//   47   87:return          
	}

	private static final Interpolator l = new DecelerateInterpolator();
	Runnable a;
	LinearLayoutCompat b;
	int c;
	int d;
	protected ViewPropertyAnimator e;
	protected final d f = new d();
	private b g;
	private Spinner h;
	private boolean i;
	private int j;
	private int k;

	static 
	{
	//    0    0:new             #41  <Class DecelerateInterpolator>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void DecelerateInterpolator()>
	//    3    7:putstatic       #46  <Field Interpolator l>
	//*   4   10:return          
	}
}
