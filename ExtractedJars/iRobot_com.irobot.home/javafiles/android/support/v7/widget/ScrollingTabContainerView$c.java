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
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutCompat, ScrollingTabContainerView, av, AppCompatImageView, 
//			AppCompatTextView, ax

private class ScrollingTabContainerView$c extends LinearLayoutCompat
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
					ams ams1 = new ams(-2, -2);
	//   74  152:new             #117 <Class LinearLayoutCompat$LayoutParams>
	//   75  155:dup             
	//   76  156:bipush          -2
	//   77  158:bipush          -2
	//   78  160:invokespecial   #120 <Method void LinearLayoutCompat$LayoutParams(int, int)>
	//   79  163:astore          7
					ams1.h = 16;
	//   80  165:aload           7
	//   81  167:bipush          16
	//   82  169:putfield        #123 <Field int LinearLayoutCompat$LayoutParams.h>
					((ImageView) (appcompatimageview)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (ams1)));
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
					ams ams = new ams(-2, -2);
	//  134  280:new             #117 <Class LinearLayoutCompat$LayoutParams>
	//  135  283:dup             
	//  136  284:bipush          -2
	//  137  286:bipush          -2
	//  138  288:invokespecial   #120 <Method void LinearLayoutCompat$LayoutParams(int, int)>
	//  139  291:astore          6
					ams.h = 16;
	//  140  293:aload           6
	//  141  295:bipush          16
	//  142  297:putfield        #123 <Field int LinearLayoutCompat$LayoutParams.h>
					((TextView) (appcompattextview)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (ams)));
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
			ax.a(((View) (this)), ((CharSequence) (obj)));
	//  186  393:aload_0         
	//  187  394:aload_2         
	//  188  395:invokestatic    #167 <Method void ax.a(View, CharSequence)>
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

	public void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
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
			super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(a.c, 0x40000000), j);
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

	public ScrollingTabContainerView$c(ScrollingTabContainerView scrollingtabcontainerview, Context context, android.support.v7.app.ActionBar.b b1, boolean flag)
	{
		a = scrollingtabcontainerview;
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
		scrollingtabcontainerview = ((ScrollingTabContainerView) (av.a(context, ((android.util.AttributeSet) (null)), b, android.support.v7.a.a.a.actionBarTabStyle, 0)));
	//   19   31:aload_2         
	//   20   32:aconst_null     
	//   21   33:aload_0         
	//   22   34:getfield        #34  <Field int[] b>
	//   23   37:getstatic       #28  <Field int android.support.v7.a.a$a.actionBarTabStyle>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #41  <Method av av.a(Context, android.util.AttributeSet, int[], int, int)>
	//   26   44:astore_1        
		if(((av) (scrollingtabcontainerview)).g(0))
	//*  27   45:aload_1         
	//*  28   46:iconst_0        
	//*  29   47:invokevirtual   #45  <Method boolean av.g(int)>
	//*  30   50:ifeq            62
			setBackgroundDrawable(((av) (scrollingtabcontainerview)).a(0));
	//   31   53:aload_0         
	//   32   54:aload_1         
	//   33   55:iconst_0        
	//   34   56:invokevirtual   #48  <Method android.graphics.drawable.Drawable av.a(int)>
	//   35   59:invokevirtual   #52  <Method void setBackgroundDrawable(android.graphics.drawable.Drawable)>
		((av) (scrollingtabcontainerview)).a();
	//   36   62:aload_1         
	//   37   63:invokevirtual   #55  <Method void av.a()>
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
