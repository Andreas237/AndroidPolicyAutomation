// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.*;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.widget:
//			p, o, q, s, 
//			r

public class CardView extends FrameLayout
{

	public CardView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method void FrameLayout(Context)>
		c = new Rect();
	//    3    5:aload_0         
	//    4    6:new             #54  <Class Rect>
	//    5    9:dup             
	//    6   10:invokespecial   #55  <Method void Rect()>
	//    7   13:putfield        #57  <Field Rect c>
		d = new Rect();
	//    8   16:aload_0         
	//    9   17:new             #54  <Class Rect>
	//   10   20:dup             
	//   11   21:invokespecial   #55  <Method void Rect()>
	//   12   24:putfield        #59  <Field Rect d>
		i = new r() {

			public void a(int j, int k)
			{
				if(j > a.a)
			//*   0    0:iload_1         
			//*   1    1:aload_0         
			//*   2    2:getfield        #16  <Field CardView a>
			//*   3    5:getfield        #24  <Field int CardView.a>
			//*   4    8:icmple          19
					CardView.a(a, j);
			//    5   11:aload_0         
			//    6   12:getfield        #16  <Field CardView a>
			//    7   15:iload_1         
			//    8   16:invokestatic    #27  <Method void CardView.a(CardView, int)>
				if(k > a.b)
			//*   9   19:iload_2         
			//*  10   20:aload_0         
			//*  11   21:getfield        #16  <Field CardView a>
			//*  12   24:getfield        #29  <Field int CardView.b>
			//*  13   27:icmple          38
					CardView.b(a, k);
			//   14   30:aload_0         
			//   15   31:getfield        #16  <Field CardView a>
			//   16   34:iload_2         
			//   17   35:invokestatic    #31  <Method void CardView.b(CardView, int)>
			//   18   38:return          
			}

			public void a(int j, int k, int l, int i1)
			{
				a.d.set(j, k, l, i1);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field CardView a>
			//    2    4:getfield        #36  <Field Rect CardView.d>
			//    3    7:iload_1         
			//    4    8:iload_2         
			//    5    9:iload_3         
			//    6   10:iload           4
			//    7   12:invokevirtual   #41  <Method void Rect.set(int, int, int, int)>
				CardView.a(a, j + a.c.left, k + a.c.top, l + a.c.right, i1 + a.c.bottom);
			//    8   15:aload_0         
			//    9   16:getfield        #16  <Field CardView a>
			//   10   19:iload_1         
			//   11   20:aload_0         
			//   12   21:getfield        #16  <Field CardView a>
			//   13   24:getfield        #44  <Field Rect CardView.c>
			//   14   27:getfield        #47  <Field int Rect.left>
			//   15   30:iadd            
			//   16   31:iload_2         
			//   17   32:aload_0         
			//   18   33:getfield        #16  <Field CardView a>
			//   19   36:getfield        #44  <Field Rect CardView.c>
			//   20   39:getfield        #50  <Field int Rect.top>
			//   21   42:iadd            
			//   22   43:iload_3         
			//   23   44:aload_0         
			//   24   45:getfield        #16  <Field CardView a>
			//   25   48:getfield        #44  <Field Rect CardView.c>
			//   26   51:getfield        #53  <Field int Rect.right>
			//   27   54:iadd            
			//   28   55:iload           4
			//   29   57:aload_0         
			//   30   58:getfield        #16  <Field CardView a>
			//   31   61:getfield        #44  <Field Rect CardView.c>
			//   32   64:getfield        #56  <Field int Rect.bottom>
			//   33   67:iadd            
			//   34   68:invokestatic    #59  <Method void CardView.a(CardView, int, int, int, int)>
			//   35   71:return          
			}

			public void a(Drawable drawable)
			{
				b = drawable;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #62  <Field Drawable b>
				a.setBackgroundDrawable(drawable);
			//    3    5:aload_0         
			//    4    6:getfield        #16  <Field CardView a>
			//    5    9:aload_1         
			//    6   10:invokevirtual   #65  <Method void CardView.setBackgroundDrawable(Drawable)>
			//    7   13:return          
			}

			public boolean a()
			{
				return a.getUseCompatPadding();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field CardView a>
			//    2    4:invokevirtual   #69  <Method boolean CardView.getUseCompatPadding()>
			//    3    7:ireturn         
			}

			public boolean b()
			{
				return a.getPreventCornerOverlap();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field CardView a>
			//    2    4:invokevirtual   #72  <Method boolean CardView.getPreventCornerOverlap()>
			//    3    7:ireturn         
			}

			public Drawable c()
			{
				return b;
			//    0    0:aload_0         
			//    1    1:getfield        #62  <Field Drawable b>
			//    2    4:areturn         
			}

			public View d()
			{
				return ((View) (a));
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field CardView a>
			//    2    4:areturn         
			}

			final CardView a;
			private Drawable b;

			
			{
				a = CardView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CardView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   13   27:aload_0         
	//   14   28:new             #6   <Class CardView$1>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #62  <Method void CardView$1(CardView)>
	//   18   36:putfield        #64  <Field r i>
		a(context, ((AttributeSet) (null)), 0);
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:aconst_null     
	//   22   42:iconst_0        
	//   23   43:invokespecial   #67  <Method void a(Context, AttributeSet, int)>
	//   24   46:return          
	}

	public CardView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #70  <Method void FrameLayout(Context, AttributeSet)>
		c = new Rect();
	//    4    6:aload_0         
	//    5    7:new             #54  <Class Rect>
	//    6   10:dup             
	//    7   11:invokespecial   #55  <Method void Rect()>
	//    8   14:putfield        #57  <Field Rect c>
		d = new Rect();
	//    9   17:aload_0         
	//   10   18:new             #54  <Class Rect>
	//   11   21:dup             
	//   12   22:invokespecial   #55  <Method void Rect()>
	//   13   25:putfield        #59  <Field Rect d>
		i = new _cls1();
	//   14   28:aload_0         
	//   15   29:new             #6   <Class CardView$1>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:invokespecial   #62  <Method void CardView$1(CardView)>
	//   19   37:putfield        #64  <Field r i>
		a(context, attributeset, 0);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:iconst_0        
	//   24   44:invokespecial   #67  <Method void a(Context, AttributeSet, int)>
	//   25   47:return          
	}

	public CardView(Context context, AttributeSet attributeset, int j)
	{
		super(context, attributeset, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #72  <Method void FrameLayout(Context, AttributeSet, int)>
		c = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #54  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #55  <Method void Rect()>
	//    9   15:putfield        #57  <Field Rect c>
		d = new Rect();
	//   10   18:aload_0         
	//   11   19:new             #54  <Class Rect>
	//   12   22:dup             
	//   13   23:invokespecial   #55  <Method void Rect()>
	//   14   26:putfield        #59  <Field Rect d>
		i = new _cls1();
	//   15   29:aload_0         
	//   16   30:new             #6   <Class CardView$1>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:invokespecial   #62  <Method void CardView$1(CardView)>
	//   20   38:putfield        #64  <Field r i>
		a(context, attributeset, j);
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:iload_3         
	//   25   45:invokespecial   #67  <Method void a(Context, AttributeSet, int)>
	//   26   48:return          
	}

	private void a(Context context, AttributeSet attributeset, int j)
	{
		TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.v7.b.a.d.CardView, j, android.support.v7.b.a.c.CardView);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:getstatic       #77  <Field int[] android.support.v7.b.a$d.CardView>
	//    3    5:iload_3         
	//    4    6:getstatic       #81  <Field int android.support.v7.b.a$c.CardView>
	//    5    9:invokevirtual   #87  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//    6   12:astore          7
		if(typedarray.hasValue(android.support.v7.b.a.d.CardView_cardBackgroundColor))
	//*   7   14:aload           7
	//*   8   16:getstatic       #90  <Field int android.support.v7.b.a$d.CardView_cardBackgroundColor>
	//*   9   19:invokevirtual   #96  <Method boolean TypedArray.hasValue(int)>
	//*  10   22:ifeq            37
		{
			attributeset = ((AttributeSet) (typedarray.getColorStateList(android.support.v7.b.a.d.CardView_cardBackgroundColor)));
	//   11   25:aload           7
	//   12   27:getstatic       #90  <Field int android.support.v7.b.a$d.CardView_cardBackgroundColor>
	//   13   30:invokevirtual   #100 <Method ColorStateList TypedArray.getColorStateList(int)>
	//   14   33:astore_2        
		} else
	//*  15   34:goto            115
		{
			attributeset = ((AttributeSet) (getContext().obtainStyledAttributes(e)));
	//   16   37:aload_0         
	//   17   38:invokevirtual   #104 <Method Context getContext()>
	//   18   41:getstatic       #26  <Field int[] e>
	//   19   44:invokevirtual   #107 <Method TypedArray Context.obtainStyledAttributes(int[])>
	//   20   47:astore_2        
			j = ((TypedArray) (attributeset)).getColor(0, 0);
	//   21   48:aload_2         
	//   22   49:iconst_0        
	//   23   50:iconst_0        
	//   24   51:invokevirtual   #111 <Method int TypedArray.getColor(int, int)>
	//   25   54:istore_3        
			((TypedArray) (attributeset)).recycle();
	//   26   55:aload_2         
	//   27   56:invokevirtual   #114 <Method void TypedArray.recycle()>
			attributeset = ((AttributeSet) (new float[3]));
	//   28   59:iconst_3        
	//   29   60:newarray        float[]
	//   30   62:astore_2        
			Color.colorToHSV(j, ((float []) (attributeset)));
	//   31   63:iload_3         
	//   32   64:aload_2         
	//   33   65:invokestatic    #120 <Method void Color.colorToHSV(int, float[])>
			if(attributeset[2] > 0.5F)
	//*  34   68:aload_2         
	//*  35   69:iconst_2        
	//*  36   70:faload          
	//*  37   71:ldc1            #121 <Float 0.5F>
	//*  38   73:fcmpl           
	//*  39   74:ifle            95
			{
				attributeset = ((AttributeSet) (getResources()));
	//   40   77:aload_0         
	//   41   78:invokevirtual   #125 <Method Resources getResources()>
	//   42   81:astore_2        
				j = android.support.v7.b.a.a.cardview_light_background;
	//   43   82:getstatic       #130 <Field int android.support.v7.b.a$a.cardview_light_background>
	//   44   85:istore_3        
			} else
	//*  45   86:aload_2         
	//*  46   87:iload_3         
	//*  47   88:invokevirtual   #135 <Method int Resources.getColor(int)>
	//*  48   91:istore_3        
	//*  49   92:goto            107
			{
				attributeset = ((AttributeSet) (getResources()));
	//   50   95:aload_0         
	//   51   96:invokevirtual   #125 <Method Resources getResources()>
	//   52   99:astore_2        
				j = android.support.v7.b.a.a.cardview_dark_background;
	//   53  100:getstatic       #138 <Field int android.support.v7.b.a$a.cardview_dark_background>
	//   54  103:istore_3        
			}
			j = ((Resources) (attributeset)).getColor(j);
	//*  55  104:goto            86
			attributeset = ((AttributeSet) (ColorStateList.valueOf(j)));
	//   56  107:iload_3         
	//   57  108:invokestatic    #143 <Method ColorStateList ColorStateList.valueOf(int)>
	//   58  111:astore_2        
		}
	//*  59  112:goto            34
		float f3 = typedarray.getDimension(android.support.v7.b.a.d.CardView_cardCornerRadius, 0.0F);
	//   60  115:aload           7
	//   61  117:getstatic       #146 <Field int android.support.v7.b.a$d.CardView_cardCornerRadius>
	//   62  120:fconst_0        
	//   63  121:invokevirtual   #150 <Method float TypedArray.getDimension(int, float)>
	//   64  124:fstore          6
		float f2 = typedarray.getDimension(android.support.v7.b.a.d.CardView_cardElevation, 0.0F);
	//   65  126:aload           7
	//   66  128:getstatic       #153 <Field int android.support.v7.b.a$d.CardView_cardElevation>
	//   67  131:fconst_0        
	//   68  132:invokevirtual   #150 <Method float TypedArray.getDimension(int, float)>
	//   69  135:fstore          5
		float f1 = typedarray.getDimension(android.support.v7.b.a.d.CardView_cardMaxElevation, 0.0F);
	//   70  137:aload           7
	//   71  139:getstatic       #156 <Field int android.support.v7.b.a$d.CardView_cardMaxElevation>
	//   72  142:fconst_0        
	//   73  143:invokevirtual   #150 <Method float TypedArray.getDimension(int, float)>
	//   74  146:fstore          4
		g = typedarray.getBoolean(android.support.v7.b.a.d.CardView_cardUseCompatPadding, false);
	//   75  148:aload_0         
	//   76  149:aload           7
	//   77  151:getstatic       #159 <Field int android.support.v7.b.a$d.CardView_cardUseCompatPadding>
	//   78  154:iconst_0        
	//   79  155:invokevirtual   #163 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   80  158:putfield        #165 <Field boolean g>
		h = typedarray.getBoolean(android.support.v7.b.a.d.CardView_cardPreventCornerOverlap, true);
	//   81  161:aload_0         
	//   82  162:aload           7
	//   83  164:getstatic       #168 <Field int android.support.v7.b.a$d.CardView_cardPreventCornerOverlap>
	//   84  167:iconst_1        
	//   85  168:invokevirtual   #163 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   86  171:putfield        #170 <Field boolean h>
		j = typedarray.getDimensionPixelSize(android.support.v7.b.a.d.CardView_contentPadding, 0);
	//   87  174:aload           7
	//   88  176:getstatic       #173 <Field int android.support.v7.b.a$d.CardView_contentPadding>
	//   89  179:iconst_0        
	//   90  180:invokevirtual   #176 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   91  183:istore_3        
		c.left = typedarray.getDimensionPixelSize(android.support.v7.b.a.d.CardView_contentPaddingLeft, j);
	//   92  184:aload_0         
	//   93  185:getfield        #57  <Field Rect c>
	//   94  188:aload           7
	//   95  190:getstatic       #179 <Field int android.support.v7.b.a$d.CardView_contentPaddingLeft>
	//   96  193:iload_3         
	//   97  194:invokevirtual   #176 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   98  197:putfield        #182 <Field int Rect.left>
		c.top = typedarray.getDimensionPixelSize(android.support.v7.b.a.d.CardView_contentPaddingTop, j);
	//   99  200:aload_0         
	//  100  201:getfield        #57  <Field Rect c>
	//  101  204:aload           7
	//  102  206:getstatic       #185 <Field int android.support.v7.b.a$d.CardView_contentPaddingTop>
	//  103  209:iload_3         
	//  104  210:invokevirtual   #176 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  105  213:putfield        #188 <Field int Rect.top>
		c.right = typedarray.getDimensionPixelSize(android.support.v7.b.a.d.CardView_contentPaddingRight, j);
	//  106  216:aload_0         
	//  107  217:getfield        #57  <Field Rect c>
	//  108  220:aload           7
	//  109  222:getstatic       #191 <Field int android.support.v7.b.a$d.CardView_contentPaddingRight>
	//  110  225:iload_3         
	//  111  226:invokevirtual   #176 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  112  229:putfield        #194 <Field int Rect.right>
		c.bottom = typedarray.getDimensionPixelSize(android.support.v7.b.a.d.CardView_contentPaddingBottom, j);
	//  113  232:aload_0         
	//  114  233:getfield        #57  <Field Rect c>
	//  115  236:aload           7
	//  116  238:getstatic       #197 <Field int android.support.v7.b.a$d.CardView_contentPaddingBottom>
	//  117  241:iload_3         
	//  118  242:invokevirtual   #176 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  119  245:putfield        #200 <Field int Rect.bottom>
		if(f2 > f1)
	//* 120  248:fload           5
	//* 121  250:fload           4
	//* 122  252:fcmpl           
	//* 123  253:ifle            263
			f1 = f2;
	//  124  256:fload           5
	//  125  258:fstore          4
	//* 126  260:goto            263
		a = typedarray.getDimensionPixelSize(android.support.v7.b.a.d.CardView_android_minWidth, 0);
	//  127  263:aload_0         
	//  128  264:aload           7
	//  129  266:getstatic       #203 <Field int android.support.v7.b.a$d.CardView_android_minWidth>
	//  130  269:iconst_0        
	//  131  270:invokevirtual   #176 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  132  273:putfield        #205 <Field int a>
		b = typedarray.getDimensionPixelSize(android.support.v7.b.a.d.CardView_android_minHeight, 0);
	//  133  276:aload_0         
	//  134  277:aload           7
	//  135  279:getstatic       #208 <Field int android.support.v7.b.a$d.CardView_android_minHeight>
	//  136  282:iconst_0        
	//  137  283:invokevirtual   #176 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  138  286:putfield        #210 <Field int b>
		typedarray.recycle();
	//  139  289:aload           7
	//  140  291:invokevirtual   #114 <Method void TypedArray.recycle()>
		f.a(i, context, ((ColorStateList) (attributeset)), f3, f2, f1);
	//  141  294:getstatic       #38  <Field s f>
	//  142  297:aload_0         
	//  143  298:getfield        #64  <Field r i>
	//  144  301:aload_1         
	//  145  302:aload_2         
	//  146  303:fload           6
	//  147  305:fload           5
	//  148  307:fload           4
	//  149  309:invokeinterface #213 <Method void s.a(r, Context, ColorStateList, float, float, float)>
	//  150  314:return          
	}

	static void a(CardView cardview, int j)
	{
		((FrameLayout) (cardview)).FrameLayout.setMinimumWidth(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #218 <Method void FrameLayout.setMinimumWidth(int)>
	//    3    5:return          
	}

	static void a(CardView cardview, int j, int k, int l, int i1)
	{
		((FrameLayout) (cardview)).FrameLayout.setPadding(j, k, l, i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #223 <Method void FrameLayout.setPadding(int, int, int, int)>
	//    6    9:return          
	}

	static void b(CardView cardview, int j)
	{
		((FrameLayout) (cardview)).FrameLayout.setMinimumHeight(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #226 <Method void FrameLayout.setMinimumHeight(int)>
	//    3    5:return          
	}

	public ColorStateList getCardBackgroundColor()
	{
		return f.i(i);
	//    0    0:getstatic       #38  <Field s f>
	//    1    3:aload_0         
	//    2    4:getfield        #64  <Field r i>
	//    3    7:invokeinterface #231 <Method ColorStateList s.i(r)>
	//    4   12:areturn         
	}

	public float getCardElevation()
	{
		return f.e(i);
	//    0    0:getstatic       #38  <Field s f>
	//    1    3:aload_0         
	//    2    4:getfield        #64  <Field r i>
	//    3    7:invokeinterface #236 <Method float s.e(r)>
	//    4   12:freturn         
	}

	public int getContentPaddingBottom()
	{
		return c.bottom;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Rect c>
	//    2    4:getfield        #200 <Field int Rect.bottom>
	//    3    7:ireturn         
	}

	public int getContentPaddingLeft()
	{
		return c.left;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Rect c>
	//    2    4:getfield        #182 <Field int Rect.left>
	//    3    7:ireturn         
	}

	public int getContentPaddingRight()
	{
		return c.right;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Rect c>
	//    2    4:getfield        #194 <Field int Rect.right>
	//    3    7:ireturn         
	}

	public int getContentPaddingTop()
	{
		return c.top;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Rect c>
	//    2    4:getfield        #188 <Field int Rect.top>
	//    3    7:ireturn         
	}

	public float getMaxCardElevation()
	{
		return f.a(i);
	//    0    0:getstatic       #38  <Field s f>
	//    1    3:aload_0         
	//    2    4:getfield        #64  <Field r i>
	//    3    7:invokeinterface #244 <Method float s.a(r)>
	//    4   12:freturn         
	}

	public boolean getPreventCornerOverlap()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field boolean h>
	//    2    4:ireturn         
	}

	public float getRadius()
	{
		return f.d(i);
	//    0    0:getstatic       #38  <Field s f>
	//    1    3:aload_0         
	//    2    4:getfield        #64  <Field r i>
	//    3    7:invokeinterface #249 <Method float s.d(r)>
	//    4   12:freturn         
	}

	public boolean getUseCompatPadding()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field boolean g>
	//    2    4:ireturn         
	}

	protected void onMeasure(int j, int k)
	{
		int i1 = j;
	//    0    0:iload_1         
	//    1    1:istore          4
		int l = k;
	//    2    3:iload_2         
	//    3    4:istore_3        
		if(!(f instanceof p))
	//*   4    5:getstatic       #38  <Field s f>
	//*   5    8:instanceof      #33  <Class p>
	//*   6   11:ifne            124
		{
			l = android.view.View.MeasureSpec.getMode(j);
	//    7   14:iload_1         
	//    8   15:invokestatic    #257 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    9   18:istore_3        
			if(l == 0x80000000 || l == 0x40000000)
	//*  10   19:iload_3         
	//*  11   20:ldc2            #258 <Int 0x80000000>
	//*  12   23:icmpeq          36
	//*  13   26:iload_3         
	//*  14   27:ldc2            #259 <Int 0x40000000>
	//*  15   30:icmpeq          36
	//*  16   33:goto            65
				j = android.view.View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(f.b(i)), android.view.View.MeasureSpec.getSize(j)), l);
	//   17   36:getstatic       #38  <Field s f>
	//   18   39:aload_0         
	//   19   40:getfield        #64  <Field r i>
	//   20   43:invokeinterface #261 <Method float s.b(r)>
	//   21   48:f2d             
	//   22   49:invokestatic    #267 <Method double Math.ceil(double)>
	//   23   52:d2i             
	//   24   53:iload_1         
	//   25   54:invokestatic    #270 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   26   57:invokestatic    #273 <Method int Math.max(int, int)>
	//   27   60:iload_3         
	//   28   61:invokestatic    #276 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   29   64:istore_1        
			l = android.view.View.MeasureSpec.getMode(k);
	//   30   65:iload_2         
	//   31   66:invokestatic    #257 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   32   69:istore_3        
			if(l != 0x80000000 && l != 0x40000000)
	//*  33   70:iload_3         
	//*  34   71:ldc2            #258 <Int 0x80000000>
	//*  35   74:icmpeq          92
	//*  36   77:iload_3         
	//*  37   78:ldc2            #259 <Int 0x40000000>
	//*  38   81:icmpeq          92
			{
				i1 = j;
	//   39   84:iload_1         
	//   40   85:istore          4
				l = k;
	//   41   87:iload_2         
	//   42   88:istore_3        
			} else
	//*  43   89:goto            124
			{
				l = android.view.View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(f.c(i)), android.view.View.MeasureSpec.getSize(k)), l);
	//   44   92:getstatic       #38  <Field s f>
	//   45   95:aload_0         
	//   46   96:getfield        #64  <Field r i>
	//   47   99:invokeinterface #278 <Method float s.c(r)>
	//   48  104:f2d             
	//   49  105:invokestatic    #267 <Method double Math.ceil(double)>
	//   50  108:d2i             
	//   51  109:iload_2         
	//   52  110:invokestatic    #270 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   53  113:invokestatic    #273 <Method int Math.max(int, int)>
	//   54  116:iload_3         
	//   55  117:invokestatic    #276 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   56  120:istore_3        
				i1 = j;
	//   57  121:iload_1         
	//   58  122:istore          4
			}
		}
		super.onMeasure(i1, l);
	//   59  124:aload_0         
	//   60  125:iload           4
	//   61  127:iload_3         
	//   62  128:invokespecial   #280 <Method void FrameLayout.onMeasure(int, int)>
	//   63  131:return          
	}

	public void setCardBackgroundColor(int j)
	{
		f.a(i, ColorStateList.valueOf(j));
	//    0    0:getstatic       #38  <Field s f>
	//    1    3:aload_0         
	//    2    4:getfield        #64  <Field r i>
	//    3    7:iload_1         
	//    4    8:invokestatic    #143 <Method ColorStateList ColorStateList.valueOf(int)>
	//    5   11:invokeinterface #284 <Method void s.a(r, ColorStateList)>
	//    6   16:return          
	}

	public void setCardBackgroundColor(ColorStateList colorstatelist)
	{
		f.a(i, colorstatelist);
	//    0    0:getstatic       #38  <Field s f>
	//    1    3:aload_0         
	//    2    4:getfield        #64  <Field r i>
	//    3    7:aload_1         
	//    4    8:invokeinterface #284 <Method void s.a(r, ColorStateList)>
	//    5   13:return          
	}

	public void setCardElevation(float f1)
	{
		f.c(i, f1);
	//    0    0:getstatic       #38  <Field s f>
	//    1    3:aload_0         
	//    2    4:getfield        #64  <Field r i>
	//    3    7:fload_1         
	//    4    8:invokeinterface #290 <Method void s.c(r, float)>
	//    5   13:return          
	}

	public void setMaxCardElevation(float f1)
	{
		f.b(i, f1);
	//    0    0:getstatic       #38  <Field s f>
	//    1    3:aload_0         
	//    2    4:getfield        #64  <Field r i>
	//    3    7:fload_1         
	//    4    8:invokeinterface #293 <Method void s.b(r, float)>
	//    5   13:return          
	}

	public void setMinimumHeight(int j)
	{
		b = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #210 <Field int b>
		super.setMinimumHeight(j);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #226 <Method void FrameLayout.setMinimumHeight(int)>
	//    6   10:return          
	}

	public void setMinimumWidth(int j)
	{
		a = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #205 <Field int a>
		super.setMinimumWidth(j);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #218 <Method void FrameLayout.setMinimumWidth(int)>
	//    6   10:return          
	}

	public void setPadding(int j, int k, int l, int i1)
	{
	//    0    0:return          
	}

	public void setPaddingRelative(int j, int k, int l, int i1)
	{
	//    0    0:return          
	}

	public void setPreventCornerOverlap(boolean flag)
	{
		if(flag != h)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #170 <Field boolean h>
	//*   3    5:icmpeq          25
		{
			h = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #170 <Field boolean h>
			f.h(i);
	//    7   13:getstatic       #38  <Field s f>
	//    8   16:aload_0         
	//    9   17:getfield        #64  <Field r i>
	//   10   20:invokeinterface #299 <Method void s.h(r)>
		}
	//   11   25:return          
	}

	public void setRadius(float f1)
	{
		f.a(i, f1);
	//    0    0:getstatic       #38  <Field s f>
	//    1    3:aload_0         
	//    2    4:getfield        #64  <Field r i>
	//    3    7:fload_1         
	//    4    8:invokeinterface #302 <Method void s.a(r, float)>
	//    5   13:return          
	}

	public void setUseCompatPadding(boolean flag)
	{
		if(g != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field boolean g>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          25
		{
			g = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #165 <Field boolean g>
			f.g(i);
	//    7   13:getstatic       #38  <Field s f>
	//    8   16:aload_0         
	//    9   17:getfield        #64  <Field r i>
	//   10   20:invokeinterface #305 <Method void s.g(r)>
		}
	//   11   25:return          
	}

	private static final int e[] = {
		0x1010031
	};
	private static final s f;
	int a;
	int b;
	final Rect c;
	final Rect d;
	private boolean g;
	private boolean h;
	private final r i;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #24  <Int 0x1010031>
	//    5    7:iastore         
	//    6    8:putstatic       #26  <Field int[] e>
		Object obj;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   7   11:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   14:bipush          21
	//*   9   16:icmplt          34
			obj = ((Object) (new p()));
	//   10   19:new             #33  <Class p>
	//   11   22:dup             
	//   12   23:invokespecial   #36  <Method void p()>
	//   13   26:astore_0        
		else
	//*  14   27:aload_0         
	//*  15   28:putstatic       #38  <Field s f>
	//*  16   31:goto            64
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  17   34:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*  18   37:bipush          17
	//*  19   39:icmplt          53
			obj = ((Object) (new o()));
	//   20   42:new             #40  <Class o>
	//   21   45:dup             
	//   22   46:invokespecial   #41  <Method void o()>
	//   23   49:astore_0        
		else
	//*  24   50:goto            27
			obj = ((Object) (new q()));
	//   25   53:new             #43  <Class q>
	//   26   56:dup             
	//   27   57:invokespecial   #44  <Method void q()>
	//   28   60:astore_0        
		f = ((s) (obj));
	//*  29   61:goto            27
		f.a();
	//   30   64:getstatic       #38  <Field s f>
	//   31   67:invokeinterface #48  <Method void s.a()>
	//*  32   72:return          
	}
}
