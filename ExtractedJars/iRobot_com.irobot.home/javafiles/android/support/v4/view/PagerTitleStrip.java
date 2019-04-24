// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.content.res.*;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.m;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;

// Referenced classes of package android.support.v4.view:
//			ViewPager, p

public class PagerTitleStrip extends ViewGroup
{
	private class a extends DataSetObserver
		implements ViewPager.d, ViewPager.e
	{

		public void a(int i1)
		{
			b = i1;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #25  <Field int b>
		//    3    5:return          
		}

		public void a(int i1, float f1, int j1)
		{
			j1 = i1;
		//    0    0:iload_1         
		//    1    1:istore_3        
			if(f1 > 0.5F)
		//*   2    2:fload_2         
		//*   3    3:ldc1            #27  <Float 0.5F>
		//*   4    5:fcmpl           
		//*   5    6:ifle            13
				j1 = i1 + 1;
		//    6    9:iload_1         
		//    7   10:iconst_1        
		//    8   11:iadd            
		//    9   12:istore_3        
			a.a(j1, f1, false);
		//   10   13:aload_0         
		//   11   14:getfield        #18  <Field PagerTitleStrip a>
		//   12   17:iload_3         
		//   13   18:fload_2         
		//   14   19:iconst_0        
		//   15   20:invokevirtual   #30  <Method void PagerTitleStrip.a(int, float, boolean)>
		//   16   23:return          
		}

		public void a(ViewPager viewpager, p p1, p p2)
		{
			a.a(p1, p2);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field PagerTitleStrip a>
		//    2    4:aload_2         
		//    3    5:aload_3         
		//    4    6:invokevirtual   #34  <Method void PagerTitleStrip.a(p, p)>
		//    5    9:return          
		}

		public void b(int i1)
		{
			if(b == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field int b>
		//*   2    4:ifne            77
			{
				a.a(a.a.getCurrentItem(), a.a.getAdapter());
		//    3    7:aload_0         
		//    4    8:getfield        #18  <Field PagerTitleStrip a>
		//    5   11:aload_0         
		//    6   12:getfield        #18  <Field PagerTitleStrip a>
		//    7   15:getfield        #37  <Field ViewPager PagerTitleStrip.a>
		//    8   18:invokevirtual   #43  <Method int ViewPager.getCurrentItem()>
		//    9   21:aload_0         
		//   10   22:getfield        #18  <Field PagerTitleStrip a>
		//   11   25:getfield        #37  <Field ViewPager PagerTitleStrip.a>
		//   12   28:invokevirtual   #47  <Method p ViewPager.getAdapter()>
		//   13   31:invokevirtual   #50  <Method void PagerTitleStrip.a(int, p)>
				float f2 = a.e;
		//   14   34:aload_0         
		//   15   35:getfield        #18  <Field PagerTitleStrip a>
		//   16   38:getfield        #54  <Field float PagerTitleStrip.e>
		//   17   41:fstore_3        
				float f1 = 0.0F;
		//   18   42:fconst_0        
		//   19   43:fstore_2        
				if(f2 >= 0.0F)
		//*  20   44:fload_3         
		//*  21   45:fconst_0        
		//*  22   46:fcmpl           
		//*  23   47:iflt            58
					f1 = a.e;
		//   24   50:aload_0         
		//   25   51:getfield        #18  <Field PagerTitleStrip a>
		//   26   54:getfield        #54  <Field float PagerTitleStrip.e>
		//   27   57:fstore_2        
				a.a(a.a.getCurrentItem(), f1, true);
		//   28   58:aload_0         
		//   29   59:getfield        #18  <Field PagerTitleStrip a>
		//   30   62:aload_0         
		//   31   63:getfield        #18  <Field PagerTitleStrip a>
		//   32   66:getfield        #37  <Field ViewPager PagerTitleStrip.a>
		//   33   69:invokevirtual   #43  <Method int ViewPager.getCurrentItem()>
		//   34   72:fload_2         
		//   35   73:iconst_1        
		//   36   74:invokevirtual   #30  <Method void PagerTitleStrip.a(int, float, boolean)>
			}
		//   37   77:return          
		}

		public void onChanged()
		{
			a.a(a.a.getCurrentItem(), a.a.getAdapter());
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field PagerTitleStrip a>
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field PagerTitleStrip a>
		//    4    8:getfield        #37  <Field ViewPager PagerTitleStrip.a>
		//    5   11:invokevirtual   #43  <Method int ViewPager.getCurrentItem()>
		//    6   14:aload_0         
		//    7   15:getfield        #18  <Field PagerTitleStrip a>
		//    8   18:getfield        #37  <Field ViewPager PagerTitleStrip.a>
		//    9   21:invokevirtual   #47  <Method p ViewPager.getAdapter()>
		//   10   24:invokevirtual   #50  <Method void PagerTitleStrip.a(int, p)>
			float f2 = a.e;
		//   11   27:aload_0         
		//   12   28:getfield        #18  <Field PagerTitleStrip a>
		//   13   31:getfield        #54  <Field float PagerTitleStrip.e>
		//   14   34:fstore_2        
			float f1 = 0.0F;
		//   15   35:fconst_0        
		//   16   36:fstore_1        
			if(f2 >= 0.0F)
		//*  17   37:fload_2         
		//*  18   38:fconst_0        
		//*  19   39:fcmpl           
		//*  20   40:iflt            51
				f1 = a.e;
		//   21   43:aload_0         
		//   22   44:getfield        #18  <Field PagerTitleStrip a>
		//   23   47:getfield        #54  <Field float PagerTitleStrip.e>
		//   24   50:fstore_1        
			a.a(a.a.getCurrentItem(), f1, true);
		//   25   51:aload_0         
		//   26   52:getfield        #18  <Field PagerTitleStrip a>
		//   27   55:aload_0         
		//   28   56:getfield        #18  <Field PagerTitleStrip a>
		//   29   59:getfield        #37  <Field ViewPager PagerTitleStrip.a>
		//   30   62:invokevirtual   #43  <Method int ViewPager.getCurrentItem()>
		//   31   65:fload_1         
		//   32   66:iconst_1        
		//   33   67:invokevirtual   #30  <Method void PagerTitleStrip.a(int, float, boolean)>
		//   34   70:return          
		}

		final PagerTitleStrip a;
		private int b;

		a()
		{
			a = PagerTitleStrip.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field PagerTitleStrip a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void DataSetObserver()>
		//    5    9:return          
		}
	}

	private static class b extends SingleLineTransformationMethod
	{

		public CharSequence getTransformation(CharSequence charsequence, View view)
		{
			charsequence = super.getTransformation(charsequence, view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #38  <Method CharSequence SingleLineTransformationMethod.getTransformation(CharSequence, View)>
		//    4    6:astore_1        
			if(charsequence != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          25
				return ((CharSequence) (charsequence.toString().toUpperCase(a)));
		//    7   11:aload_1         
		//    8   12:invokeinterface #44  <Method String CharSequence.toString()>
		//    9   17:aload_0         
		//   10   18:getfield        #33  <Field Locale a>
		//   11   21:invokevirtual   #50  <Method String String.toUpperCase(Locale)>
		//   12   24:areturn         
			else
				return null;
		//   13   25:aconst_null     
		//   14   26:areturn         
		}

		private Locale a;

		b(Context context)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void SingleLineTransformationMethod()>
			a = context.getResources().getConfiguration().locale;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #20  <Method Resources Context.getResources()>
		//    5    9:invokevirtual   #26  <Method Configuration Resources.getConfiguration()>
		//    6   12:getfield        #31  <Field Locale Configuration.locale>
		//    7   15:putfield        #33  <Field Locale a>
		//    8   18:return          
		}
	}


	public PagerTitleStrip(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #51  <Method void PagerTitleStrip(Context, AttributeSet)>
	//    4    6:return          
	}

	public PagerTitleStrip(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #52  <Method void ViewGroup(Context, AttributeSet)>
		g = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #54  <Field int g>
		e = -1F;
	//    7   11:aload_0         
	//    8   12:ldc1            #55  <Float -1F>
	//    9   14:putfield        #57  <Field float e>
		l = new a();
	//   10   17:aload_0         
	//   11   18:new             #6   <Class PagerTitleStrip$a>
	//   12   21:dup             
	//   13   22:aload_0         
	//   14   23:invokespecial   #60  <Method void PagerTitleStrip$a(PagerTitleStrip)>
	//   15   26:putfield        #62  <Field PagerTitleStrip$a l>
		TextView textview = new TextView(context);
	//   16   29:new             #64  <Class TextView>
	//   17   32:dup             
	//   18   33:aload_1         
	//   19   34:invokespecial   #66  <Method void TextView(Context)>
	//   20   37:astore          6
		b = textview;
	//   21   39:aload_0         
	//   22   40:aload           6
	//   23   42:putfield        #68  <Field TextView b>
		addView(((View) (textview)));
	//   24   45:aload_0         
	//   25   46:aload           6
	//   26   48:invokevirtual   #72  <Method void addView(View)>
		textview = new TextView(context);
	//   27   51:new             #64  <Class TextView>
	//   28   54:dup             
	//   29   55:aload_1         
	//   30   56:invokespecial   #66  <Method void TextView(Context)>
	//   31   59:astore          6
		c = textview;
	//   32   61:aload_0         
	//   33   62:aload           6
	//   34   64:putfield        #74  <Field TextView c>
		addView(((View) (textview)));
	//   35   67:aload_0         
	//   36   68:aload           6
	//   37   70:invokevirtual   #72  <Method void addView(View)>
		textview = new TextView(context);
	//   38   73:new             #64  <Class TextView>
	//   39   76:dup             
	//   40   77:aload_1         
	//   41   78:invokespecial   #66  <Method void TextView(Context)>
	//   42   81:astore          6
		d = textview;
	//   43   83:aload_0         
	//   44   84:aload           6
	//   45   86:putfield        #76  <Field TextView d>
		addView(((View) (textview)));
	//   46   89:aload_0         
	//   47   90:aload           6
	//   48   92:invokevirtual   #72  <Method void addView(View)>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, n)));
	//   49   95:aload_1         
	//   50   96:aload_2         
	//   51   97:getstatic       #42  <Field int[] n>
	//   52  100:invokevirtual   #82  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   53  103:astore_2        
		boolean flag = false;
	//   54  104:iconst_0        
	//   55  105:istore          5
		int i1 = ((TypedArray) (attributeset)).getResourceId(0, 0);
	//   56  107:aload_2         
	//   57  108:iconst_0        
	//   58  109:iconst_0        
	//   59  110:invokevirtual   #88  <Method int TypedArray.getResourceId(int, int)>
	//   60  113:istore_3        
		if(i1 != 0)
	//*  61  114:iload_3         
	//*  62  115:ifeq            142
		{
			android.support.v4.widget.m.a(b, i1);
	//   63  118:aload_0         
	//   64  119:getfield        #68  <Field TextView b>
	//   65  122:iload_3         
	//   66  123:invokestatic    #93  <Method void m.a(TextView, int)>
			android.support.v4.widget.m.a(c, i1);
	//   67  126:aload_0         
	//   68  127:getfield        #74  <Field TextView c>
	//   69  130:iload_3         
	//   70  131:invokestatic    #93  <Method void m.a(TextView, int)>
			android.support.v4.widget.m.a(d, i1);
	//   71  134:aload_0         
	//   72  135:getfield        #76  <Field TextView d>
	//   73  138:iload_3         
	//   74  139:invokestatic    #93  <Method void m.a(TextView, int)>
		}
		int j1 = ((TypedArray) (attributeset)).getDimensionPixelSize(1, 0);
	//   75  142:aload_2         
	//   76  143:iconst_1        
	//   77  144:iconst_0        
	//   78  145:invokevirtual   #96  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   79  148:istore          4
		if(j1 != 0)
	//*  80  150:iload           4
	//*  81  152:ifeq            163
			a(0, j1);
	//   82  155:aload_0         
	//   83  156:iconst_0        
	//   84  157:iload           4
	//   85  159:i2f             
	//   86  160:invokevirtual   #99  <Method void a(int, float)>
		if(((TypedArray) (attributeset)).hasValue(2))
	//*  87  163:aload_2         
	//*  88  164:iconst_2        
	//*  89  165:invokevirtual   #103 <Method boolean TypedArray.hasValue(int)>
	//*  90  168:ifeq            206
		{
			int k1 = ((TypedArray) (attributeset)).getColor(2, 0);
	//   91  171:aload_2         
	//   92  172:iconst_2        
	//   93  173:iconst_0        
	//   94  174:invokevirtual   #106 <Method int TypedArray.getColor(int, int)>
	//   95  177:istore          4
			b.setTextColor(k1);
	//   96  179:aload_0         
	//   97  180:getfield        #68  <Field TextView b>
	//   98  183:iload           4
	//   99  185:invokevirtual   #110 <Method void TextView.setTextColor(int)>
			c.setTextColor(k1);
	//  100  188:aload_0         
	//  101  189:getfield        #74  <Field TextView c>
	//  102  192:iload           4
	//  103  194:invokevirtual   #110 <Method void TextView.setTextColor(int)>
			d.setTextColor(k1);
	//  104  197:aload_0         
	//  105  198:getfield        #76  <Field TextView d>
	//  106  201:iload           4
	//  107  203:invokevirtual   #110 <Method void TextView.setTextColor(int)>
		}
		i = ((TypedArray) (attributeset)).getInteger(3, 80);
	//  108  206:aload_0         
	//  109  207:aload_2         
	//  110  208:iconst_3        
	//  111  209:bipush          80
	//  112  211:invokevirtual   #113 <Method int TypedArray.getInteger(int, int)>
	//  113  214:putfield        #115 <Field int i>
		((TypedArray) (attributeset)).recycle();
	//  114  217:aload_2         
	//  115  218:invokevirtual   #118 <Method void TypedArray.recycle()>
		f = c.getTextColors().getDefaultColor();
	//  116  221:aload_0         
	//  117  222:aload_0         
	//  118  223:getfield        #74  <Field TextView c>
	//  119  226:invokevirtual   #122 <Method ColorStateList TextView.getTextColors()>
	//  120  229:invokevirtual   #128 <Method int ColorStateList.getDefaultColor()>
	//  121  232:putfield        #130 <Field int f>
		setNonPrimaryAlpha(0.6F);
	//  122  235:aload_0         
	//  123  236:ldc1            #131 <Float 0.6F>
	//  124  238:invokevirtual   #135 <Method void setNonPrimaryAlpha(float)>
		b.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//  125  241:aload_0         
	//  126  242:getfield        #68  <Field TextView b>
	//  127  245:getstatic       #141 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//  128  248:invokevirtual   #145 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
		c.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//  129  251:aload_0         
	//  130  252:getfield        #74  <Field TextView c>
	//  131  255:getstatic       #141 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//  132  258:invokevirtual   #145 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
		d.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//  133  261:aload_0         
	//  134  262:getfield        #76  <Field TextView d>
	//  135  265:getstatic       #141 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//  136  268:invokevirtual   #145 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
		if(i1 != 0)
	//* 137  271:iload_3         
	//* 138  272:ifeq            296
		{
			attributeset = ((AttributeSet) (context.obtainStyledAttributes(i1, o)));
	//  139  275:aload_1         
	//  140  276:iload_3         
	//  141  277:getstatic       #45  <Field int[] o>
	//  142  280:invokevirtual   #148 <Method TypedArray Context.obtainStyledAttributes(int, int[])>
	//  143  283:astore_2        
			flag = ((TypedArray) (attributeset)).getBoolean(0, false);
	//  144  284:aload_2         
	//  145  285:iconst_0        
	//  146  286:iconst_0        
	//  147  287:invokevirtual   #152 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  148  290:istore          5
			((TypedArray) (attributeset)).recycle();
	//  149  292:aload_2         
	//  150  293:invokevirtual   #118 <Method void TypedArray.recycle()>
		}
		if(flag)
	//* 151  296:iload           5
	//* 152  298:ifeq            325
		{
			setSingleLineAllCaps(b);
	//  153  301:aload_0         
	//  154  302:getfield        #68  <Field TextView b>
	//  155  305:invokestatic    #156 <Method void setSingleLineAllCaps(TextView)>
			setSingleLineAllCaps(c);
	//  156  308:aload_0         
	//  157  309:getfield        #74  <Field TextView c>
	//  158  312:invokestatic    #156 <Method void setSingleLineAllCaps(TextView)>
			setSingleLineAllCaps(d);
	//  159  315:aload_0         
	//  160  316:getfield        #76  <Field TextView d>
	//  161  319:invokestatic    #156 <Method void setSingleLineAllCaps(TextView)>
		} else
	//* 162  322:goto            346
		{
			b.setSingleLine();
	//  163  325:aload_0         
	//  164  326:getfield        #68  <Field TextView b>
	//  165  329:invokevirtual   #159 <Method void TextView.setSingleLine()>
			c.setSingleLine();
	//  166  332:aload_0         
	//  167  333:getfield        #74  <Field TextView c>
	//  168  336:invokevirtual   #159 <Method void TextView.setSingleLine()>
			d.setSingleLine();
	//  169  339:aload_0         
	//  170  340:getfield        #76  <Field TextView d>
	//  171  343:invokevirtual   #159 <Method void TextView.setSingleLine()>
		}
		h = (int)(context.getResources().getDisplayMetrics().density * 16F);
	//  172  346:aload_0         
	//  173  347:aload_1         
	//  174  348:invokevirtual   #163 <Method Resources Context.getResources()>
	//  175  351:invokevirtual   #169 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  176  354:getfield        #174 <Field float DisplayMetrics.density>
	//  177  357:ldc1            #175 <Float 16F>
	//  178  359:fmul            
	//  179  360:f2i             
	//  180  361:putfield        #177 <Field int h>
	//  181  364:return          
	}

	private static void setSingleLineAllCaps(TextView textview)
	{
		textview.setTransformationMethod(((android.text.method.TransformationMethod) (new b(textview.getContext()))));
	//    0    0:aload_0         
	//    1    1:new             #9   <Class PagerTitleStrip$b>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #181 <Method Context TextView.getContext()>
	//    5    9:invokespecial   #182 <Method void PagerTitleStrip$b(Context)>
	//    6   12:invokevirtual   #186 <Method void TextView.setTransformationMethod(android.text.method.TransformationMethod)>
	//    7   15:return          
	}

	public void a(int i1, float f1)
	{
		b.setTextSize(i1, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field TextView b>
	//    2    4:iload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #189 <Method void TextView.setTextSize(int, float)>
		c.setTextSize(i1, f1);
	//    5    9:aload_0         
	//    6   10:getfield        #74  <Field TextView c>
	//    7   13:iload_1         
	//    8   14:fload_2         
	//    9   15:invokevirtual   #189 <Method void TextView.setTextSize(int, float)>
		d.setTextSize(i1, f1);
	//   10   18:aload_0         
	//   11   19:getfield        #76  <Field TextView d>
	//   12   22:iload_1         
	//   13   23:fload_2         
	//   14   24:invokevirtual   #189 <Method void TextView.setTextSize(int, float)>
	//   15   27:return          
	}

	void a(int i1, float f1, boolean flag)
	{
		int j1;
		int k1;
		int l1;
		int i2;
		int j2;
		int k2;
		int l2;
		int i3;
		int j3;
label0:
		{
			if(i1 != g)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #54  <Field int g>
	//*   3    5:icmpeq          23
				a(i1, a.getAdapter());
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #192 <Field ViewPager a>
	//    8   14:invokevirtual   #198 <Method p ViewPager.getAdapter()>
	//    9   17:invokevirtual   #201 <Method void a(int, p)>
			else
	//*  10   20:goto            37
			if(!flag && f1 == e)
	//*  11   23:iload_3         
	//*  12   24:ifne            37
	//*  13   27:fload_2         
	//*  14   28:aload_0         
	//*  15   29:getfield        #57  <Field float e>
	//*  16   32:fcmpl           
	//*  17   33:ifne            37
				return;
	//   18   36:return          
			k = true;
	//   19   37:aload_0         
	//   20   38:iconst_1        
	//   21   39:putfield        #203 <Field boolean k>
			i2 = b.getMeasuredWidth();
	//   22   42:aload_0         
	//   23   43:getfield        #68  <Field TextView b>
	//   24   46:invokevirtual   #206 <Method int TextView.getMeasuredWidth()>
	//   25   49:istore          9
			j3 = c.getMeasuredWidth();
	//   26   51:aload_0         
	//   27   52:getfield        #74  <Field TextView c>
	//   28   55:invokevirtual   #206 <Method int TextView.getMeasuredWidth()>
	//   29   58:istore          14
			l1 = d.getMeasuredWidth();
	//   30   60:aload_0         
	//   31   61:getfield        #76  <Field TextView d>
	//   32   64:invokevirtual   #206 <Method int TextView.getMeasuredWidth()>
	//   33   67:istore          8
			i3 = j3 / 2;
	//   34   69:iload           14
	//   35   71:iconst_2        
	//   36   72:idiv            
	//   37   73:istore          13
			j2 = getWidth();
	//   38   75:aload_0         
	//   39   76:invokevirtual   #209 <Method int getWidth()>
	//   40   79:istore          10
			j1 = getHeight();
	//   41   81:aload_0         
	//   42   82:invokevirtual   #212 <Method int getHeight()>
	//   43   85:istore          6
			l2 = getPaddingLeft();
	//   44   87:aload_0         
	//   45   88:invokevirtual   #215 <Method int getPaddingLeft()>
	//   46   91:istore          12
			k2 = getPaddingRight();
	//   47   93:aload_0         
	//   48   94:invokevirtual   #218 <Method int getPaddingRight()>
	//   49   97:istore          11
			i1 = getPaddingTop();
	//   50   99:aload_0         
	//   51  100:invokevirtual   #221 <Method int getPaddingTop()>
	//   52  103:istore_1        
			k1 = getPaddingBottom();
	//   53  104:aload_0         
	//   54  105:invokevirtual   #224 <Method int getPaddingBottom()>
	//   55  108:istore          7
			int k3 = k2 + i3;
	//   56  110:iload           11
	//   57  112:iload           13
	//   58  114:iadd            
	//   59  115:istore          15
			float f3 = 0.5F + f1;
	//   60  117:ldc1            #225 <Float 0.5F>
	//   61  119:fload_2         
	//   62  120:fadd            
	//   63  121:fstore          5
			float f2 = f3;
	//   64  123:fload           5
	//   65  125:fstore          4
			if(f3 > 1.0F)
	//*  66  127:fload           5
	//*  67  129:fconst_1        
	//*  68  130:fcmpl           
	//*  69  131:ifle            140
				f2 = f3 - 1.0F;
	//   70  134:fload           5
	//   71  136:fconst_1        
	//   72  137:fsub            
	//   73  138:fstore          4
			i3 = j2 - k3 - (int)((float)(j2 - (l2 + i3) - k3) * f2) - i3;
	//   74  140:iload           10
	//   75  142:iload           15
	//   76  144:isub            
	//   77  145:iload           10
	//   78  147:iload           12
	//   79  149:iload           13
	//   80  151:iadd            
	//   81  152:isub            
	//   82  153:iload           15
	//   83  155:isub            
	//   84  156:i2f             
	//   85  157:fload           4
	//   86  159:fmul            
	//   87  160:f2i             
	//   88  161:isub            
	//   89  162:iload           13
	//   90  164:isub            
	//   91  165:istore          13
			j3 += i3;
	//   92  167:iload           14
	//   93  169:iload           13
	//   94  171:iadd            
	//   95  172:istore          14
			int i4 = b.getBaseline();
	//   96  174:aload_0         
	//   97  175:getfield        #68  <Field TextView b>
	//   98  178:invokevirtual   #228 <Method int TextView.getBaseline()>
	//   99  181:istore          17
			k3 = c.getBaseline();
	//  100  183:aload_0         
	//  101  184:getfield        #74  <Field TextView c>
	//  102  187:invokevirtual   #228 <Method int TextView.getBaseline()>
	//  103  190:istore          15
			int l3 = d.getBaseline();
	//  104  192:aload_0         
	//  105  193:getfield        #76  <Field TextView d>
	//  106  196:invokevirtual   #228 <Method int TextView.getBaseline()>
	//  107  199:istore          16
			int j4 = Math.max(Math.max(i4, k3), l3);
	//  108  201:iload           17
	//  109  203:iload           15
	//  110  205:invokestatic    #233 <Method int Math.max(int, int)>
	//  111  208:iload           16
	//  112  210:invokestatic    #233 <Method int Math.max(int, int)>
	//  113  213:istore          18
			i4 = j4 - i4;
	//  114  215:iload           18
	//  115  217:iload           17
	//  116  219:isub            
	//  117  220:istore          17
			k3 = j4 - k3;
	//  118  222:iload           18
	//  119  224:iload           15
	//  120  226:isub            
	//  121  227:istore          15
			l3 = j4 - l3;
	//  122  229:iload           18
	//  123  231:iload           16
	//  124  233:isub            
	//  125  234:istore          16
			j4 = b.getMeasuredHeight();
	//  126  236:aload_0         
	//  127  237:getfield        #68  <Field TextView b>
	//  128  240:invokevirtual   #236 <Method int TextView.getMeasuredHeight()>
	//  129  243:istore          18
			int k4 = c.getMeasuredHeight();
	//  130  245:aload_0         
	//  131  246:getfield        #74  <Field TextView c>
	//  132  249:invokevirtual   #236 <Method int TextView.getMeasuredHeight()>
	//  133  252:istore          19
			int l4 = d.getMeasuredHeight();
	//  134  254:aload_0         
	//  135  255:getfield        #76  <Field TextView d>
	//  136  258:invokevirtual   #236 <Method int TextView.getMeasuredHeight()>
	//  137  261:istore          20
			j4 = Math.max(Math.max(j4 + i4, k4 + k3), l4 + l3);
	//  138  263:iload           18
	//  139  265:iload           17
	//  140  267:iadd            
	//  141  268:iload           19
	//  142  270:iload           15
	//  143  272:iadd            
	//  144  273:invokestatic    #233 <Method int Math.max(int, int)>
	//  145  276:iload           20
	//  146  278:iload           16
	//  147  280:iadd            
	//  148  281:invokestatic    #233 <Method int Math.max(int, int)>
	//  149  284:istore          18
			k4 = i & 0x70;
	//  150  286:aload_0         
	//  151  287:getfield        #115 <Field int i>
	//  152  290:bipush          112
	//  153  292:iand            
	//  154  293:istore          19
			if(k4 != 16)
	//* 155  295:iload           19
	//* 156  297:bipush          16
	//* 157  299:icmpeq          341
			{
				if(k4 != 80)
	//* 158  302:iload           19
	//* 159  304:bipush          80
	//* 160  306:icmpeq          329
				{
					j1 = i4 + i1;
	//  161  309:iload           17
	//  162  311:iload_1         
	//  163  312:iadd            
	//  164  313:istore          6
					k1 = k3 + i1;
	//  165  315:iload           15
	//  166  317:iload_1         
	//  167  318:iadd            
	//  168  319:istore          7
					i1 += l3;
	//  169  321:iload_1         
	//  170  322:iload           16
	//  171  324:iadd            
	//  172  325:istore_1        
					break label0;
	//  173  326:goto            371
				}
				i1 = j1 - k1 - j4;
	//  174  329:iload           6
	//  175  331:iload           7
	//  176  333:isub            
	//  177  334:iload           18
	//  178  336:isub            
	//  179  337:istore_1        
			} else
	//* 180  338:goto            354
			{
				i1 = (j1 - i1 - k1 - j4) / 2;
	//  181  341:iload           6
	//  182  343:iload_1         
	//  183  344:isub            
	//  184  345:iload           7
	//  185  347:isub            
	//  186  348:iload           18
	//  187  350:isub            
	//  188  351:iconst_2        
	//  189  352:idiv            
	//  190  353:istore_1        
			}
			j1 = i4 + i1;
	//  191  354:iload           17
	//  192  356:iload_1         
	//  193  357:iadd            
	//  194  358:istore          6
			k1 = k3 + i1;
	//  195  360:iload           15
	//  196  362:iload_1         
	//  197  363:iadd            
	//  198  364:istore          7
			i1 += l3;
	//  199  366:iload_1         
	//  200  367:iload           16
	//  201  369:iadd            
	//  202  370:istore_1        
		}
		c.layout(i3, k1, j3, c.getMeasuredHeight() + k1);
	//  203  371:aload_0         
	//  204  372:getfield        #74  <Field TextView c>
	//  205  375:iload           13
	//  206  377:iload           7
	//  207  379:iload           14
	//  208  381:aload_0         
	//  209  382:getfield        #74  <Field TextView c>
	//  210  385:invokevirtual   #236 <Method int TextView.getMeasuredHeight()>
	//  211  388:iload           7
	//  212  390:iadd            
	//  213  391:invokevirtual   #240 <Method void TextView.layout(int, int, int, int)>
		k1 = Math.min(l2, i3 - h - i2);
	//  214  394:iload           12
	//  215  396:iload           13
	//  216  398:aload_0         
	//  217  399:getfield        #177 <Field int h>
	//  218  402:isub            
	//  219  403:iload           9
	//  220  405:isub            
	//  221  406:invokestatic    #243 <Method int Math.min(int, int)>
	//  222  409:istore          7
		b.layout(k1, j1, i2 + k1, b.getMeasuredHeight() + j1);
	//  223  411:aload_0         
	//  224  412:getfield        #68  <Field TextView b>
	//  225  415:iload           7
	//  226  417:iload           6
	//  227  419:iload           9
	//  228  421:iload           7
	//  229  423:iadd            
	//  230  424:aload_0         
	//  231  425:getfield        #68  <Field TextView b>
	//  232  428:invokevirtual   #236 <Method int TextView.getMeasuredHeight()>
	//  233  431:iload           6
	//  234  433:iadd            
	//  235  434:invokevirtual   #240 <Method void TextView.layout(int, int, int, int)>
		j1 = Math.max(j2 - k2 - l1, j3 + h);
	//  236  437:iload           10
	//  237  439:iload           11
	//  238  441:isub            
	//  239  442:iload           8
	//  240  444:isub            
	//  241  445:iload           14
	//  242  447:aload_0         
	//  243  448:getfield        #177 <Field int h>
	//  244  451:iadd            
	//  245  452:invokestatic    #233 <Method int Math.max(int, int)>
	//  246  455:istore          6
		d.layout(j1, i1, j1 + l1, d.getMeasuredHeight() + i1);
	//  247  457:aload_0         
	//  248  458:getfield        #76  <Field TextView d>
	//  249  461:iload           6
	//  250  463:iload_1         
	//  251  464:iload           6
	//  252  466:iload           8
	//  253  468:iadd            
	//  254  469:aload_0         
	//  255  470:getfield        #76  <Field TextView d>
	//  256  473:invokevirtual   #236 <Method int TextView.getMeasuredHeight()>
	//  257  476:iload_1         
	//  258  477:iadd            
	//  259  478:invokevirtual   #240 <Method void TextView.layout(int, int, int, int)>
		e = f1;
	//  260  481:aload_0         
	//  261  482:fload_2         
	//  262  483:putfield        #57  <Field float e>
		k = false;
	//  263  486:aload_0         
	//  264  487:iconst_0        
	//  265  488:putfield        #203 <Field boolean k>
	//  266  491:return          
	}

	void a(int i1, p p1)
	{
		int j1;
		if(p1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          12
			j1 = p1.getCount();
	//    2    4:aload_2         
	//    3    5:invokevirtual   #248 <Method int p.getCount()>
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			j1 = 0;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		j = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #250 <Field boolean j>
		Object obj = null;
	//   11   19:aconst_null     
	//   12   20:astore          6
		CharSequence charsequence;
		if(i1 >= 1 && p1 != null)
	//*  13   22:iload_1         
	//*  14   23:iconst_1        
	//*  15   24:icmplt          43
	//*  16   27:aload_2         
	//*  17   28:ifnull          43
			charsequence = p1.getPageTitle(i1 - 1);
	//   18   31:aload_2         
	//   19   32:iload_1         
	//   20   33:iconst_1        
	//   21   34:isub            
	//   22   35:invokevirtual   #254 <Method CharSequence p.getPageTitle(int)>
	//   23   38:astore          5
		else
	//*  24   40:goto            46
			charsequence = null;
	//   25   43:aconst_null     
	//   26   44:astore          5
		b.setText(charsequence);
	//   27   46:aload_0         
	//   28   47:getfield        #68  <Field TextView b>
	//   29   50:aload           5
	//   30   52:invokevirtual   #258 <Method void TextView.setText(CharSequence)>
		TextView textview = c;
	//   31   55:aload_0         
	//   32   56:getfield        #74  <Field TextView c>
	//   33   59:astore          7
		if(p1 != null && i1 < j1)
	//*  34   61:aload_2         
	//*  35   62:ifnull          80
	//*  36   65:iload_1         
	//*  37   66:iload_3         
	//*  38   67:icmpge          80
			charsequence = p1.getPageTitle(i1);
	//   39   70:aload_2         
	//   40   71:iload_1         
	//   41   72:invokevirtual   #254 <Method CharSequence p.getPageTitle(int)>
	//   42   75:astore          5
		else
	//*  43   77:goto            83
			charsequence = null;
	//   44   80:aconst_null     
	//   45   81:astore          5
		textview.setText(charsequence);
	//   46   83:aload           7
	//   47   85:aload           5
	//   48   87:invokevirtual   #258 <Method void TextView.setText(CharSequence)>
		int k1 = i1 + 1;
	//   49   90:iload_1         
	//   50   91:iconst_1        
	//   51   92:iadd            
	//   52   93:istore          4
		charsequence = ((CharSequence) (obj));
	//   53   95:aload           6
	//   54   97:astore          5
		if(k1 < j1)
	//*  55   99:iload           4
	//*  56  101:iload_3         
	//*  57  102:icmpge          121
		{
			charsequence = ((CharSequence) (obj));
	//   58  105:aload           6
	//   59  107:astore          5
			if(p1 != null)
	//*  60  109:aload_2         
	//*  61  110:ifnull          121
				charsequence = p1.getPageTitle(k1);
	//   62  113:aload_2         
	//   63  114:iload           4
	//   64  116:invokevirtual   #254 <Method CharSequence p.getPageTitle(int)>
	//   65  119:astore          5
		}
		d.setText(charsequence);
	//   66  121:aload_0         
	//   67  122:getfield        #76  <Field TextView d>
	//   68  125:aload           5
	//   69  127:invokevirtual   #258 <Method void TextView.setText(CharSequence)>
		j1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, (int)((float)(getWidth() - getPaddingLeft() - getPaddingRight()) * 0.8F)), 0x80000000);
	//   70  130:iconst_0        
	//   71  131:aload_0         
	//   72  132:invokevirtual   #209 <Method int getWidth()>
	//   73  135:aload_0         
	//   74  136:invokevirtual   #215 <Method int getPaddingLeft()>
	//   75  139:isub            
	//   76  140:aload_0         
	//   77  141:invokevirtual   #218 <Method int getPaddingRight()>
	//   78  144:isub            
	//   79  145:i2f             
	//   80  146:ldc2            #259 <Float 0.8F>
	//   81  149:fmul            
	//   82  150:f2i             
	//   83  151:invokestatic    #233 <Method int Math.max(int, int)>
	//   84  154:ldc2            #260 <Int 0x80000000>
	//   85  157:invokestatic    #265 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   86  160:istore_3        
		k1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, getHeight() - getPaddingTop() - getPaddingBottom()), 0x80000000);
	//   87  161:iconst_0        
	//   88  162:aload_0         
	//   89  163:invokevirtual   #212 <Method int getHeight()>
	//   90  166:aload_0         
	//   91  167:invokevirtual   #221 <Method int getPaddingTop()>
	//   92  170:isub            
	//   93  171:aload_0         
	//   94  172:invokevirtual   #224 <Method int getPaddingBottom()>
	//   95  175:isub            
	//   96  176:invokestatic    #233 <Method int Math.max(int, int)>
	//   97  179:ldc2            #260 <Int 0x80000000>
	//   98  182:invokestatic    #265 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   99  185:istore          4
		b.measure(j1, k1);
	//  100  187:aload_0         
	//  101  188:getfield        #68  <Field TextView b>
	//  102  191:iload_3         
	//  103  192:iload           4
	//  104  194:invokevirtual   #269 <Method void TextView.measure(int, int)>
		c.measure(j1, k1);
	//  105  197:aload_0         
	//  106  198:getfield        #74  <Field TextView c>
	//  107  201:iload_3         
	//  108  202:iload           4
	//  109  204:invokevirtual   #269 <Method void TextView.measure(int, int)>
		d.measure(j1, k1);
	//  110  207:aload_0         
	//  111  208:getfield        #76  <Field TextView d>
	//  112  211:iload_3         
	//  113  212:iload           4
	//  114  214:invokevirtual   #269 <Method void TextView.measure(int, int)>
		g = i1;
	//  115  217:aload_0         
	//  116  218:iload_1         
	//  117  219:putfield        #54  <Field int g>
		if(!k)
	//* 118  222:aload_0         
	//* 119  223:getfield        #203 <Field boolean k>
	//* 120  226:ifne            239
			a(i1, e, false);
	//  121  229:aload_0         
	//  122  230:iload_1         
	//  123  231:aload_0         
	//  124  232:getfield        #57  <Field float e>
	//  125  235:iconst_0        
	//  126  236:invokevirtual   #271 <Method void a(int, float, boolean)>
		j = false;
	//  127  239:aload_0         
	//  128  240:iconst_0        
	//  129  241:putfield        #250 <Field boolean j>
	//  130  244:return          
	}

	void a(p p1, p p2)
	{
		if(p1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
		{
			p1.unregisterDataSetObserver(((DataSetObserver) (l)));
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field PagerTitleStrip$a l>
	//    5    9:invokevirtual   #276 <Method void p.unregisterDataSetObserver(DataSetObserver)>
			m = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #278 <Field WeakReference m>
		}
		if(p2 != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          41
		{
			p2.registerDataSetObserver(((DataSetObserver) (l)));
	//   11   21:aload_2         
	//   12   22:aload_0         
	//   13   23:getfield        #62  <Field PagerTitleStrip$a l>
	//   14   26:invokevirtual   #281 <Method void p.registerDataSetObserver(DataSetObserver)>
			m = new WeakReference(((Object) (p2)));
	//   15   29:aload_0         
	//   16   30:new             #283 <Class WeakReference>
	//   17   33:dup             
	//   18   34:aload_2         
	//   19   35:invokespecial   #286 <Method void WeakReference(Object)>
	//   20   38:putfield        #278 <Field WeakReference m>
		}
		if(a != null)
	//*  21   41:aload_0         
	//*  22   42:getfield        #192 <Field ViewPager a>
	//*  23   45:ifnull          75
		{
			g = -1;
	//   24   48:aload_0         
	//   25   49:iconst_m1       
	//   26   50:putfield        #54  <Field int g>
			e = -1F;
	//   27   53:aload_0         
	//   28   54:ldc1            #55  <Float -1F>
	//   29   56:putfield        #57  <Field float e>
			a(a.getCurrentItem(), p2);
	//   30   59:aload_0         
	//   31   60:aload_0         
	//   32   61:getfield        #192 <Field ViewPager a>
	//   33   64:invokevirtual   #289 <Method int ViewPager.getCurrentItem()>
	//   34   67:aload_2         
	//   35   68:invokevirtual   #201 <Method void a(int, p)>
			requestLayout();
	//   36   71:aload_0         
	//   37   72:invokevirtual   #292 <Method void requestLayout()>
		}
	//   38   75:return          
	}

	int getMinHeight()
	{
		Drawable drawable = getBackground();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #297 <Method Drawable getBackground()>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return drawable.getIntrinsicHeight();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #302 <Method int Drawable.getIntrinsicHeight()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public int getTextSpacing()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field int h>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #306 <Method void ViewGroup.onAttachedToWindow()>
		Object obj = ((Object) (getParent()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #310 <Method android.view.ViewParent getParent()>
	//    4    8:astore_1        
		if(!(obj instanceof ViewPager))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #194 <Class ViewPager>
	//*   7   13:ifne            27
			throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
	//    8   16:new             #312 <Class IllegalStateException>
	//    9   19:dup             
	//   10   20:ldc2            #314 <String "PagerTitleStrip must be a direct child of a ViewPager.">
	//   11   23:invokespecial   #317 <Method void IllegalStateException(String)>
	//   12   26:athrow          
		obj = ((Object) ((ViewPager)obj));
	//   13   27:aload_1         
	//   14   28:checkcast       #194 <Class ViewPager>
	//   15   31:astore_1        
		p p1 = ((ViewPager) (obj)).getAdapter();
	//   16   32:aload_1         
	//   17   33:invokevirtual   #198 <Method p ViewPager.getAdapter()>
	//   18   36:astore_2        
		((ViewPager) (obj)).c(((ViewPager.e) (l)));
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:getfield        #62  <Field PagerTitleStrip$a l>
	//   22   42:invokevirtual   #320 <Method ViewPager$e ViewPager.c(ViewPager$e)>
	//   23   45:pop             
		((ViewPager) (obj)).a(((ViewPager.d) (l)));
	//   24   46:aload_1         
	//   25   47:aload_0         
	//   26   48:getfield        #62  <Field PagerTitleStrip$a l>
	//   27   51:invokevirtual   #323 <Method void ViewPager.a(ViewPager$d)>
		a = ((ViewPager) (obj));
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:putfield        #192 <Field ViewPager a>
		if(m != null)
	//*  31   59:aload_0         
	//*  32   60:getfield        #278 <Field WeakReference m>
	//*  33   63:ifnull          80
			obj = ((Object) ((p)m.get()));
	//   34   66:aload_0         
	//   35   67:getfield        #278 <Field WeakReference m>
	//   36   70:invokevirtual   #327 <Method Object WeakReference.get()>
	//   37   73:checkcast       #245 <Class p>
	//   38   76:astore_1        
		else
	//*  39   77:goto            82
			obj = null;
	//   40   80:aconst_null     
	//   41   81:astore_1        
		a(((p) (obj)), p1);
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:aload_2         
	//   45   85:invokevirtual   #329 <Method void a(p, p)>
	//   46   88:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #332 <Method void ViewGroup.onDetachedFromWindow()>
		if(a != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #192 <Field ViewPager a>
	//*   4    8:ifnull          48
		{
			a(a.getAdapter(), ((p) (null)));
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #192 <Field ViewPager a>
	//    8   16:invokevirtual   #198 <Method p ViewPager.getAdapter()>
	//    9   19:aconst_null     
	//   10   20:invokevirtual   #329 <Method void a(p, p)>
			a.c(((ViewPager.e) (null)));
	//   11   23:aload_0         
	//   12   24:getfield        #192 <Field ViewPager a>
	//   13   27:aconst_null     
	//   14   28:invokevirtual   #320 <Method ViewPager$e ViewPager.c(ViewPager$e)>
	//   15   31:pop             
			a.b(((ViewPager.d) (l)));
	//   16   32:aload_0         
	//   17   33:getfield        #192 <Field ViewPager a>
	//   18   36:aload_0         
	//   19   37:getfield        #62  <Field PagerTitleStrip$a l>
	//   20   40:invokevirtual   #334 <Method void ViewPager.b(ViewPager$d)>
			a = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #192 <Field ViewPager a>
		}
	//   24   48:return          
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #192 <Field ViewPager a>
	//*   2    4:ifnull          40
		{
			float f2 = e;
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field float e>
	//    5   11:fstore          7
			float f1 = 0.0F;
	//    6   13:fconst_0        
	//    7   14:fstore          6
			if(f2 >= 0.0F)
	//*   8   16:fload           7
	//*   9   18:fconst_0        
	//*  10   19:fcmpl           
	//*  11   20:iflt            29
				f1 = e;
	//   12   23:aload_0         
	//   13   24:getfield        #57  <Field float e>
	//   14   27:fstore          6
			a(g, f1, true);
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #54  <Field int g>
	//   18   34:fload           6
	//   19   36:iconst_1        
	//   20   37:invokevirtual   #271 <Method void a(int, float, boolean)>
		}
	//   21   40:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		if(android.view.View.MeasureSpec.getMode(i1) != 0x40000000)
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #341 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   2    4:ldc2            #342 <Int 0x40000000>
	//*   3    7:icmpeq          21
			throw new IllegalStateException("Must measure with an exact width");
	//    4   10:new             #312 <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:ldc2            #344 <String "Must measure with an exact width">
	//    7   17:invokespecial   #317 <Method void IllegalStateException(String)>
	//    8   20:athrow          
		int l1 = getPaddingTop() + getPaddingBottom();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #221 <Method int getPaddingTop()>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #224 <Method int getPaddingBottom()>
	//   13   29:iadd            
	//   14   30:istore          4
		int i2 = getChildMeasureSpec(j1, l1, -2);
	//   15   32:iload_2         
	//   16   33:iload           4
	//   17   35:bipush          -2
	//   18   37:invokestatic    #348 <Method int getChildMeasureSpec(int, int, int)>
	//   19   40:istore          5
		int k1 = android.view.View.MeasureSpec.getSize(i1);
	//   20   42:iload_1         
	//   21   43:invokestatic    #351 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   22   46:istore_3        
		i1 = getChildMeasureSpec(i1, (int)((float)k1 * 0.2F), -2);
	//   23   47:iload_1         
	//   24   48:iload_3         
	//   25   49:i2f             
	//   26   50:ldc2            #352 <Float 0.2F>
	//   27   53:fmul            
	//   28   54:f2i             
	//   29   55:bipush          -2
	//   30   57:invokestatic    #348 <Method int getChildMeasureSpec(int, int, int)>
	//   31   60:istore_1        
		b.measure(i1, i2);
	//   32   61:aload_0         
	//   33   62:getfield        #68  <Field TextView b>
	//   34   65:iload_1         
	//   35   66:iload           5
	//   36   68:invokevirtual   #269 <Method void TextView.measure(int, int)>
		c.measure(i1, i2);
	//   37   71:aload_0         
	//   38   72:getfield        #74  <Field TextView c>
	//   39   75:iload_1         
	//   40   76:iload           5
	//   41   78:invokevirtual   #269 <Method void TextView.measure(int, int)>
		d.measure(i1, i2);
	//   42   81:aload_0         
	//   43   82:getfield        #76  <Field TextView d>
	//   44   85:iload_1         
	//   45   86:iload           5
	//   46   88:invokevirtual   #269 <Method void TextView.measure(int, int)>
		if(android.view.View.MeasureSpec.getMode(j1) == 0x40000000)
	//*  47   91:iload_2         
	//*  48   92:invokestatic    #341 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  49   95:ldc2            #342 <Int 0x40000000>
	//*  50   98:icmpne          109
		{
			i1 = android.view.View.MeasureSpec.getSize(j1);
	//   51  101:iload_2         
	//   52  102:invokestatic    #351 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   53  105:istore_1        
		} else
	//*  54  106:goto            129
		{
			i1 = c.getMeasuredHeight();
	//   55  109:aload_0         
	//   56  110:getfield        #74  <Field TextView c>
	//   57  113:invokevirtual   #236 <Method int TextView.getMeasuredHeight()>
	//   58  116:istore_1        
			i1 = Math.max(getMinHeight(), i1 + l1);
	//   59  117:aload_0         
	//   60  118:invokevirtual   #354 <Method int getMinHeight()>
	//   61  121:iload_1         
	//   62  122:iload           4
	//   63  124:iadd            
	//   64  125:invokestatic    #233 <Method int Math.max(int, int)>
	//   65  128:istore_1        
		}
		setMeasuredDimension(k1, View.resolveSizeAndState(i1, j1, c.getMeasuredState() << 16));
	//   66  129:aload_0         
	//   67  130:iload_3         
	//   68  131:iload_1         
	//   69  132:iload_2         
	//   70  133:aload_0         
	//   71  134:getfield        #74  <Field TextView c>
	//   72  137:invokevirtual   #357 <Method int TextView.getMeasuredState()>
	//   73  140:bipush          16
	//   74  142:ishl            
	//   75  143:invokestatic    #362 <Method int View.resolveSizeAndState(int, int, int)>
	//   76  146:invokevirtual   #365 <Method void setMeasuredDimension(int, int)>
	//   77  149:return          
	}

	public void requestLayout()
	{
		if(!j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #250 <Field boolean j>
	//*   2    4:ifne            11
			super.requestLayout();
	//    3    7:aload_0         
	//    4    8:invokespecial   #366 <Method void ViewGroup.requestLayout()>
	//    5   11:return          
	}

	public void setGravity(int i1)
	{
		i = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #115 <Field int i>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #292 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setNonPrimaryAlpha(float f1)
	{
		p = (int)(f1 * 255F) & 0xff;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:ldc2            #368 <Float 255F>
	//    3    5:fmul            
	//    4    6:f2i             
	//    5    7:sipush          255
	//    6   10:iand            
	//    7   11:putfield        #370 <Field int p>
		int i1 = p << 24 | f & 0xffffff;
	//    8   14:aload_0         
	//    9   15:getfield        #370 <Field int p>
	//   10   18:bipush          24
	//   11   20:ishl            
	//   12   21:aload_0         
	//   13   22:getfield        #130 <Field int f>
	//   14   25:ldc2            #371 <Int 0xffffff>
	//   15   28:iand            
	//   16   29:ior             
	//   17   30:istore_2        
		b.setTextColor(i1);
	//   18   31:aload_0         
	//   19   32:getfield        #68  <Field TextView b>
	//   20   35:iload_2         
	//   21   36:invokevirtual   #110 <Method void TextView.setTextColor(int)>
		d.setTextColor(i1);
	//   22   39:aload_0         
	//   23   40:getfield        #76  <Field TextView d>
	//   24   43:iload_2         
	//   25   44:invokevirtual   #110 <Method void TextView.setTextColor(int)>
	//   26   47:return          
	}

	public void setTextColor(int i1)
	{
		f = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #130 <Field int f>
		c.setTextColor(i1);
	//    3    5:aload_0         
	//    4    6:getfield        #74  <Field TextView c>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #110 <Method void TextView.setTextColor(int)>
		i1 = p << 24 | f & 0xffffff;
	//    7   13:aload_0         
	//    8   14:getfield        #370 <Field int p>
	//    9   17:bipush          24
	//   10   19:ishl            
	//   11   20:aload_0         
	//   12   21:getfield        #130 <Field int f>
	//   13   24:ldc2            #371 <Int 0xffffff>
	//   14   27:iand            
	//   15   28:ior             
	//   16   29:istore_1        
		b.setTextColor(i1);
	//   17   30:aload_0         
	//   18   31:getfield        #68  <Field TextView b>
	//   19   34:iload_1         
	//   20   35:invokevirtual   #110 <Method void TextView.setTextColor(int)>
		d.setTextColor(i1);
	//   21   38:aload_0         
	//   22   39:getfield        #76  <Field TextView d>
	//   23   42:iload_1         
	//   24   43:invokevirtual   #110 <Method void TextView.setTextColor(int)>
	//   25   46:return          
	}

	public void setTextSpacing(int i1)
	{
		h = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #177 <Field int h>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #292 <Method void requestLayout()>
	//    5    9:return          
	}

	private static final int n[] = {
		0x1010034, 0x1010095, 0x1010098, 0x10100af
	};
	private static final int o[] = {
		0x101038c
	};
	ViewPager a;
	TextView b;
	TextView c;
	TextView d;
	float e;
	int f;
	private int g;
	private int h;
	private int i;
	private boolean j;
	private boolean k;
	private final a l;
	private WeakReference m;
	private int p;

	static 
	{
	//    0    0:iconst_4        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #37  <Int 0x1010034>
	//    5    7:iastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #38  <Int 0x1010095>
	//    9   12:iastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:ldc1            #39  <Int 0x1010098>
	//   13   17:iastore         
	//   14   18:dup             
	//   15   19:iconst_3        
	//   16   20:ldc1            #40  <Int 0x10100af>
	//   17   22:iastore         
	//   18   23:putstatic       #42  <Field int[] n>
	//   19   26:iconst_1        
	//   20   27:newarray        int[]
	//   21   29:dup             
	//   22   30:iconst_0        
	//   23   31:ldc1            #43  <Int 0x101038c>
	//   24   33:iastore         
	//   25   34:putstatic       #45  <Field int[] o>
	//*  26   37:return          
	}
}
