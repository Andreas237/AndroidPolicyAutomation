// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.*;
import android.widget.TextView;

// Referenced classes of package android.support.v4.view:
//			PagerTitleStrip, ViewPager

public class PagerTabStrip extends PagerTitleStrip
{

	public PagerTabStrip(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #34  <Method void PagerTabStrip(Context, AttributeSet)>
	//    4    6:return          
	}

	public PagerTabStrip(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #36  <Method void PagerTitleStrip(Context, AttributeSet)>
		m = new Paint();
	//    4    6:aload_0         
	//    5    7:new             #38  <Class Paint>
	//    6   10:dup             
	//    7   11:invokespecial   #41  <Method void Paint()>
	//    8   14:putfield        #43  <Field Paint m>
		n = new Rect();
	//    9   17:aload_0         
	//   10   18:new             #45  <Class Rect>
	//   11   21:dup             
	//   12   22:invokespecial   #46  <Method void Rect()>
	//   13   25:putfield        #48  <Field Rect n>
		o = 255;
	//   14   28:aload_0         
	//   15   29:sipush          255
	//   16   32:putfield        #50  <Field int o>
		p = false;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #52  <Field boolean p>
		q = false;
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:putfield        #54  <Field boolean q>
		g = this.f;
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #57  <Field int f>
	//   26   50:putfield        #59  <Field int g>
		m.setColor(g);
	//   27   53:aload_0         
	//   28   54:getfield        #43  <Field Paint m>
	//   29   57:aload_0         
	//   30   58:getfield        #59  <Field int g>
	//   31   61:invokevirtual   #63  <Method void Paint.setColor(int)>
		float f = context.getResources().getDisplayMetrics().density;
	//   32   64:aload_1         
	//   33   65:invokevirtual   #69  <Method Resources Context.getResources()>
	//   34   68:invokevirtual   #75  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   35   71:getfield        #80  <Field float DisplayMetrics.density>
	//   36   74:fstore_3        
		h = (int)(3F * f + 0.5F);
	//   37   75:aload_0         
	//   38   76:ldc1            #81  <Float 3F>
	//   39   78:fload_3         
	//   40   79:fmul            
	//   41   80:ldc1            #82  <Float 0.5F>
	//   42   82:fadd            
	//   43   83:f2i             
	//   44   84:putfield        #84  <Field int h>
		i = (int)(6F * f + 0.5F);
	//   45   87:aload_0         
	//   46   88:ldc1            #85  <Float 6F>
	//   47   90:fload_3         
	//   48   91:fmul            
	//   49   92:ldc1            #82  <Float 0.5F>
	//   50   94:fadd            
	//   51   95:f2i             
	//   52   96:putfield        #87  <Field int i>
		j = (int)(64F * f);
	//   53   99:aload_0         
	//   54  100:ldc1            #88  <Float 64F>
	//   55  102:fload_3         
	//   56  103:fmul            
	//   57  104:f2i             
	//   58  105:putfield        #90  <Field int j>
		l = (int)(16F * f + 0.5F);
	//   59  108:aload_0         
	//   60  109:ldc1            #91  <Float 16F>
	//   61  111:fload_3         
	//   62  112:fmul            
	//   63  113:ldc1            #82  <Float 0.5F>
	//   64  115:fadd            
	//   65  116:f2i             
	//   66  117:putfield        #93  <Field int l>
		r = (int)(1.0F * f + 0.5F);
	//   67  120:aload_0         
	//   68  121:fconst_1        
	//   69  122:fload_3         
	//   70  123:fmul            
	//   71  124:ldc1            #82  <Float 0.5F>
	//   72  126:fadd            
	//   73  127:f2i             
	//   74  128:putfield        #95  <Field int r>
		k = (int)(f * 32F + 0.5F);
	//   75  131:aload_0         
	//   76  132:fload_3         
	//   77  133:ldc1            #96  <Float 32F>
	//   78  135:fmul            
	//   79  136:ldc1            #82  <Float 0.5F>
	//   80  138:fadd            
	//   81  139:f2i             
	//   82  140:putfield        #98  <Field int k>
		v = ViewConfiguration.get(context).getScaledTouchSlop();
	//   83  143:aload_0         
	//   84  144:aload_1         
	//   85  145:invokestatic    #104 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   86  148:invokevirtual   #108 <Method int ViewConfiguration.getScaledTouchSlop()>
	//   87  151:putfield        #110 <Field int v>
		setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
	//   88  154:aload_0         
	//   89  155:aload_0         
	//   90  156:invokevirtual   #113 <Method int getPaddingLeft()>
	//   91  159:aload_0         
	//   92  160:invokevirtual   #116 <Method int getPaddingTop()>
	//   93  163:aload_0         
	//   94  164:invokevirtual   #119 <Method int getPaddingRight()>
	//   95  167:aload_0         
	//   96  168:invokevirtual   #122 <Method int getPaddingBottom()>
	//   97  171:invokevirtual   #126 <Method void setPadding(int, int, int, int)>
		setTextSpacing(getTextSpacing());
	//   98  174:aload_0         
	//   99  175:aload_0         
	//  100  176:invokevirtual   #129 <Method int getTextSpacing()>
	//  101  179:invokevirtual   #132 <Method void setTextSpacing(int)>
		setWillNotDraw(false);
	//  102  182:aload_0         
	//  103  183:iconst_0        
	//  104  184:invokevirtual   #136 <Method void setWillNotDraw(boolean)>
		b.setFocusable(true);
	//  105  187:aload_0         
	//  106  188:getfield        #140 <Field TextView b>
	//  107  191:iconst_1        
	//  108  192:invokevirtual   #145 <Method void TextView.setFocusable(boolean)>
		b.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				a.a.setCurrentItem(a.a.getCurrentItem() - 1);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field PagerTabStrip a>
			//    2    4:getfield        #25  <Field ViewPager android.support.v4.view.PagerTabStrip.a>
			//    3    7:aload_0         
			//    4    8:getfield        #16  <Field PagerTabStrip a>
			//    5   11:getfield        #25  <Field ViewPager android.support.v4.view.PagerTabStrip.a>
			//    6   14:invokevirtual   #31  <Method int ViewPager.getCurrentItem()>
			//    7   17:iconst_1        
			//    8   18:isub            
			//    9   19:invokevirtual   #35  <Method void ViewPager.setCurrentItem(int)>
			//   10   22:return          
			}

			final PagerTabStrip a;

			
			{
				a = PagerTabStrip.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PagerTabStrip a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  109  195:aload_0         
	//  110  196:getfield        #140 <Field TextView b>
	//  111  199:new             #6   <Class PagerTabStrip$1>
	//  112  202:dup             
	//  113  203:aload_0         
	//  114  204:invokespecial   #148 <Method void PagerTabStrip$1(PagerTabStrip)>
	//  115  207:invokevirtual   #152 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		d.setFocusable(true);
	//  116  210:aload_0         
	//  117  211:getfield        #155 <Field TextView d>
	//  118  214:iconst_1        
	//  119  215:invokevirtual   #145 <Method void TextView.setFocusable(boolean)>
		d.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				a.a.setCurrentItem(a.a.getCurrentItem() + 1);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field PagerTabStrip a>
			//    2    4:getfield        #25  <Field ViewPager android.support.v4.view.PagerTabStrip.a>
			//    3    7:aload_0         
			//    4    8:getfield        #16  <Field PagerTabStrip a>
			//    5   11:getfield        #25  <Field ViewPager android.support.v4.view.PagerTabStrip.a>
			//    6   14:invokevirtual   #31  <Method int ViewPager.getCurrentItem()>
			//    7   17:iconst_1        
			//    8   18:iadd            
			//    9   19:invokevirtual   #35  <Method void ViewPager.setCurrentItem(int)>
			//   10   22:return          
			}

			final PagerTabStrip a;

			
			{
				a = PagerTabStrip.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PagerTabStrip a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  120  218:aload_0         
	//  121  219:getfield        #155 <Field TextView d>
	//  122  222:new             #8   <Class PagerTabStrip$2>
	//  123  225:dup             
	//  124  226:aload_0         
	//  125  227:invokespecial   #156 <Method void PagerTabStrip$2(PagerTabStrip)>
	//  126  230:invokevirtual   #152 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		if(getBackground() == null)
	//* 127  233:aload_0         
	//* 128  234:invokevirtual   #160 <Method Drawable getBackground()>
	//* 129  237:ifnonnull       245
			p = true;
	//  130  240:aload_0         
	//  131  241:iconst_1        
	//  132  242:putfield        #52  <Field boolean p>
	//  133  245:return          
	}

	void a(int i1, float f, boolean flag)
	{
		Rect rect = n;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Rect n>
	//    2    4:astore          10
		int j1 = getHeight();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #165 <Method int getHeight()>
	//    5   10:istore          4
		int k1 = c.getLeft();
	//    6   12:aload_0         
	//    7   13:getfield        #168 <Field TextView c>
	//    8   16:invokevirtual   #171 <Method int TextView.getLeft()>
	//    9   19:istore          5
		int l1 = l;
	//   10   21:aload_0         
	//   11   22:getfield        #93  <Field int l>
	//   12   25:istore          6
		int i2 = c.getRight();
	//   13   27:aload_0         
	//   14   28:getfield        #168 <Field TextView c>
	//   15   31:invokevirtual   #174 <Method int TextView.getRight()>
	//   16   34:istore          7
		int j2 = l;
	//   17   36:aload_0         
	//   18   37:getfield        #93  <Field int l>
	//   19   40:istore          8
		int k2 = j1 - h;
	//   20   42:iload           4
	//   21   44:aload_0         
	//   22   45:getfield        #84  <Field int h>
	//   23   48:isub            
	//   24   49:istore          9
		rect.set(k1 - l1, k2, i2 + j2, j1);
	//   25   51:aload           10
	//   26   53:iload           5
	//   27   55:iload           6
	//   28   57:isub            
	//   29   58:iload           9
	//   30   60:iload           7
	//   31   62:iload           8
	//   32   64:iadd            
	//   33   65:iload           4
	//   34   67:invokevirtual   #177 <Method void Rect.set(int, int, int, int)>
		super.a(i1, f, flag);
	//   35   70:aload_0         
	//   36   71:iload_1         
	//   37   72:fload_2         
	//   38   73:iload_3         
	//   39   74:invokespecial   #179 <Method void android.support.v4.view.PagerTitleStrip.a(int, float, boolean)>
		o = (int)(Math.abs(f - 0.5F) * 2.0F * 255F);
	//   40   77:aload_0         
	//   41   78:fload_2         
	//   42   79:ldc1            #82  <Float 0.5F>
	//   43   81:fsub            
	//   44   82:invokestatic    #185 <Method float Math.abs(float)>
	//   45   85:fconst_2        
	//   46   86:fmul            
	//   47   87:ldc1            #186 <Float 255F>
	//   48   89:fmul            
	//   49   90:f2i             
	//   50   91:putfield        #50  <Field int o>
		rect.union(c.getLeft() - l, k2, c.getRight() + l, j1);
	//   51   94:aload           10
	//   52   96:aload_0         
	//   53   97:getfield        #168 <Field TextView c>
	//   54  100:invokevirtual   #171 <Method int TextView.getLeft()>
	//   55  103:aload_0         
	//   56  104:getfield        #93  <Field int l>
	//   57  107:isub            
	//   58  108:iload           9
	//   59  110:aload_0         
	//   60  111:getfield        #168 <Field TextView c>
	//   61  114:invokevirtual   #174 <Method int TextView.getRight()>
	//   62  117:aload_0         
	//   63  118:getfield        #93  <Field int l>
	//   64  121:iadd            
	//   65  122:iload           4
	//   66  124:invokevirtual   #189 <Method void Rect.union(int, int, int, int)>
		invalidate(rect);
	//   67  127:aload_0         
	//   68  128:aload           10
	//   69  130:invokevirtual   #193 <Method void invalidate(Rect)>
	//   70  133:return          
	}

	public boolean getDrawFullUnderline()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean p>
	//    2    4:ireturn         
	}

	int getMinHeight()
	{
		return Math.max(super.getMinHeight(), k);
	//    0    0:aload_0         
	//    1    1:invokespecial   #198 <Method int PagerTitleStrip.getMinHeight()>
	//    2    4:aload_0         
	//    3    5:getfield        #98  <Field int k>
	//    4    8:invokestatic    #202 <Method int Math.max(int, int)>
	//    5   11:ireturn         
	}

	public int getTabIndicatorColor()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int g>
	//    2    4:ireturn         
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #207 <Method void PagerTitleStrip.onDraw(Canvas)>
		int i1 = getHeight();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #165 <Method int getHeight()>
	//    5    9:istore          6
		int j1 = c.getLeft();
	//    6   11:aload_0         
	//    7   12:getfield        #168 <Field TextView c>
	//    8   15:invokevirtual   #171 <Method int TextView.getLeft()>
	//    9   18:istore          7
		int k1 = l;
	//   10   20:aload_0         
	//   11   21:getfield        #93  <Field int l>
	//   12   24:istore          8
		int l1 = c.getRight();
	//   13   26:aload_0         
	//   14   27:getfield        #168 <Field TextView c>
	//   15   30:invokevirtual   #174 <Method int TextView.getRight()>
	//   16   33:istore          9
		int i2 = l;
	//   17   35:aload_0         
	//   18   36:getfield        #93  <Field int l>
	//   19   39:istore          10
		int j2 = h;
	//   20   41:aload_0         
	//   21   42:getfield        #84  <Field int h>
	//   22   45:istore          11
		m.setColor(o << 24 | g & 0xffffff);
	//   23   47:aload_0         
	//   24   48:getfield        #43  <Field Paint m>
	//   25   51:aload_0         
	//   26   52:getfield        #50  <Field int o>
	//   27   55:bipush          24
	//   28   57:ishl            
	//   29   58:aload_0         
	//   30   59:getfield        #59  <Field int g>
	//   31   62:ldc1            #208 <Int 0xffffff>
	//   32   64:iand            
	//   33   65:ior             
	//   34   66:invokevirtual   #63  <Method void Paint.setColor(int)>
		float f = j1 - k1;
	//   35   69:iload           7
	//   36   71:iload           8
	//   37   73:isub            
	//   38   74:i2f             
	//   39   75:fstore_2        
		float f1 = i1 - j2;
	//   40   76:iload           6
	//   41   78:iload           11
	//   42   80:isub            
	//   43   81:i2f             
	//   44   82:fstore_3        
		float f2 = l1 + i2;
	//   45   83:iload           9
	//   46   85:iload           10
	//   47   87:iadd            
	//   48   88:i2f             
	//   49   89:fstore          4
		float f3 = i1;
	//   50   91:iload           6
	//   51   93:i2f             
	//   52   94:fstore          5
		canvas.drawRect(f, f1, f2, f3, m);
	//   53   96:aload_1         
	//   54   97:fload_2         
	//   55   98:fload_3         
	//   56   99:fload           4
	//   57  101:fload           5
	//   58  103:aload_0         
	//   59  104:getfield        #43  <Field Paint m>
	//   60  107:invokevirtual   #214 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		if(p)
	//*  61  110:aload_0         
	//*  62  111:getfield        #52  <Field boolean p>
	//*  63  114:ifeq            167
		{
			m.setColor(0xff000000 | g & 0xffffff);
	//   64  117:aload_0         
	//   65  118:getfield        #43  <Field Paint m>
	//   66  121:ldc1            #215 <Int 0xff000000>
	//   67  123:aload_0         
	//   68  124:getfield        #59  <Field int g>
	//   69  127:ldc1            #208 <Int 0xffffff>
	//   70  129:iand            
	//   71  130:ior             
	//   72  131:invokevirtual   #63  <Method void Paint.setColor(int)>
			canvas.drawRect(getPaddingLeft(), i1 - r, getWidth() - getPaddingRight(), f3, m);
	//   73  134:aload_1         
	//   74  135:aload_0         
	//   75  136:invokevirtual   #113 <Method int getPaddingLeft()>
	//   76  139:i2f             
	//   77  140:iload           6
	//   78  142:aload_0         
	//   79  143:getfield        #95  <Field int r>
	//   80  146:isub            
	//   81  147:i2f             
	//   82  148:aload_0         
	//   83  149:invokevirtual   #218 <Method int getWidth()>
	//   84  152:aload_0         
	//   85  153:invokevirtual   #119 <Method int getPaddingRight()>
	//   86  156:isub            
	//   87  157:i2f             
	//   88  158:fload           5
	//   89  160:aload_0         
	//   90  161:getfield        #43  <Field Paint m>
	//   91  164:invokevirtual   #214 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
	//   92  167:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i1 = motionevent.getAction();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #225 <Method int MotionEvent.getAction()>
	//    2    4:istore          4
		if(i1 != 0 && s)
	//*   3    6:iload           4
	//*   4    8:ifeq            20
	//*   5   11:aload_0         
	//*   6   12:getfield        #227 <Field boolean s>
	//*   7   15:ifeq            20
			return false;
	//    8   18:iconst_0        
	//    9   19:ireturn         
		float f = motionevent.getX();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #231 <Method float MotionEvent.getX()>
	//   12   24:fstore_2        
		float f1 = motionevent.getY();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #234 <Method float MotionEvent.getY()>
	//   15   29:fstore_3        
		switch(i1)
	//*  16   30:iload           4
		{
	//*  17   32:tableswitch     0 2: default 60
	//	               0 184
	//	               1 105
	//	               2 62
		default:
			return true;
	//   18   60:iconst_1        
	//   19   61:ireturn         

		case 2: // '\002'
			if(Math.abs(f - t) > (float)v || Math.abs(f1 - u) > (float)v)
	//*  20   62:fload_2         
	//*  21   63:aload_0         
	//*  22   64:getfield        #236 <Field float t>
	//*  23   67:fsub            
	//*  24   68:invokestatic    #185 <Method float Math.abs(float)>
	//*  25   71:aload_0         
	//*  26   72:getfield        #110 <Field int v>
	//*  27   75:i2f             
	//*  28   76:fcmpl           
	//*  29   77:ifgt            98
	//*  30   80:fload_3         
	//*  31   81:aload_0         
	//*  32   82:getfield        #238 <Field float u>
	//*  33   85:fsub            
	//*  34   86:invokestatic    #185 <Method float Math.abs(float)>
	//*  35   89:aload_0         
	//*  36   90:getfield        #110 <Field int v>
	//*  37   93:i2f             
	//*  38   94:fcmpl           
	//*  39   95:ifle            199
			{
				s = true;
	//   40   98:aload_0         
	//   41   99:iconst_1        
	//   42  100:putfield        #227 <Field boolean s>
				return true;
	//   43  103:iconst_1        
	//   44  104:ireturn         
			}
			break;

		case 1: // '\001'
			int j1;
			if(f < (float)(c.getLeft() - l))
	//*  45  105:fload_2         
	//*  46  106:aload_0         
	//*  47  107:getfield        #168 <Field TextView c>
	//*  48  110:invokevirtual   #171 <Method int TextView.getLeft()>
	//*  49  113:aload_0         
	//*  50  114:getfield        #93  <Field int l>
	//*  51  117:isub            
	//*  52  118:i2f             
	//*  53  119:fcmpg           
	//*  54  120:ifge            147
			{
				motionevent = ((MotionEvent) (a));
	//   55  123:aload_0         
	//   56  124:getfield        #241 <Field ViewPager a>
	//   57  127:astore_1        
				j1 = a.getCurrentItem() - 1;
	//   58  128:aload_0         
	//   59  129:getfield        #241 <Field ViewPager a>
	//   60  132:invokevirtual   #246 <Method int ViewPager.getCurrentItem()>
	//   61  135:iconst_1        
	//   62  136:isub            
	//   63  137:istore          4
			} else
	//*  64  139:aload_1         
	//*  65  140:iload           4
	//*  66  142:invokevirtual   #249 <Method void ViewPager.setCurrentItem(int)>
	//*  67  145:iconst_1        
	//*  68  146:ireturn         
			{
				if(f <= (float)(c.getRight() + l))
					break;
	//   69  147:fload_2         
	//   70  148:aload_0         
	//   71  149:getfield        #168 <Field TextView c>
	//   72  152:invokevirtual   #174 <Method int TextView.getRight()>
	//   73  155:aload_0         
	//   74  156:getfield        #93  <Field int l>
	//   75  159:iadd            
	//   76  160:i2f             
	//   77  161:fcmpl           
	//   78  162:ifle            199
				motionevent = ((MotionEvent) (a));
	//   79  165:aload_0         
	//   80  166:getfield        #241 <Field ViewPager a>
	//   81  169:astore_1        
				j1 = a.getCurrentItem() + 1;
	//   82  170:aload_0         
	//   83  171:getfield        #241 <Field ViewPager a>
	//   84  174:invokevirtual   #246 <Method int ViewPager.getCurrentItem()>
	//   85  177:iconst_1        
	//   86  178:iadd            
	//   87  179:istore          4
			}
			((ViewPager) (motionevent)).setCurrentItem(j1);
			return true;

	//*  88  181:goto            139
		case 0: // '\0'
			t = f;
	//   89  184:aload_0         
	//   90  185:fload_2         
	//   91  186:putfield        #236 <Field float t>
			u = f1;
	//   92  189:aload_0         
	//   93  190:fload_3         
	//   94  191:putfield        #238 <Field float u>
			s = false;
	//   95  194:aload_0         
	//   96  195:iconst_0        
	//   97  196:putfield        #227 <Field boolean s>
			break;
		}
		return true;
	//   98  199:iconst_1        
	//   99  200:ireturn         
	}

	public void setBackgroundColor(int i1)
	{
		super.setBackgroundColor(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #252 <Method void PagerTitleStrip.setBackgroundColor(int)>
		if(!q)
	//*   3    5:aload_0         
	//*   4    6:getfield        #54  <Field boolean q>
	//*   5    9:ifne            31
		{
			boolean flag;
			if((i1 & 0xff000000) == 0)
	//*   6   12:iload_1         
	//*   7   13:ldc1            #215 <Int 0xff000000>
	//*   8   15:iand            
	//*   9   16:ifne            24
				flag = true;
	//   10   19:iconst_1        
	//   11   20:istore_2        
			else
	//*  12   21:goto            26
				flag = false;
	//   13   24:iconst_0        
	//   14   25:istore_2        
			p = flag;
	//   15   26:aload_0         
	//   16   27:iload_2         
	//   17   28:putfield        #52  <Field boolean p>
		}
	//   18   31:return          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		super.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #256 <Method void PagerTitleStrip.setBackgroundDrawable(Drawable)>
		if(!q)
	//*   3    5:aload_0         
	//*   4    6:getfield        #54  <Field boolean q>
	//*   5    9:ifne            28
		{
			boolean flag;
			if(drawable == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       21
				flag = true;
	//    8   16:iconst_1        
	//    9   17:istore_2        
			else
	//*  10   18:goto            23
				flag = false;
	//   11   21:iconst_0        
	//   12   22:istore_2        
			p = flag;
	//   13   23:aload_0         
	//   14   24:iload_2         
	//   15   25:putfield        #52  <Field boolean p>
		}
	//   16   28:return          
	}

	public void setBackgroundResource(int i1)
	{
		super.setBackgroundResource(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #259 <Method void PagerTitleStrip.setBackgroundResource(int)>
		if(!q)
	//*   3    5:aload_0         
	//*   4    6:getfield        #54  <Field boolean q>
	//*   5    9:ifne            28
		{
			boolean flag;
			if(i1 == 0)
	//*   6   12:iload_1         
	//*   7   13:ifne            21
				flag = true;
	//    8   16:iconst_1        
	//    9   17:istore_2        
			else
	//*  10   18:goto            23
				flag = false;
	//   11   21:iconst_0        
	//   12   22:istore_2        
			p = flag;
	//   13   23:aload_0         
	//   14   24:iload_2         
	//   15   25:putfield        #52  <Field boolean p>
		}
	//   16   28:return          
	}

	public void setDrawFullUnderline(boolean flag)
	{
		p = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field boolean p>
		q = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #54  <Field boolean q>
		invalidate();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #262 <Method void invalidate()>
	//    8   14:return          
	}

	public void setPadding(int i1, int j1, int k1, int l1)
	{
		int i2 = l1;
	//    0    0:iload           4
	//    1    2:istore          5
		if(l1 < i)
	//*   2    4:iload           4
	//*   3    6:aload_0         
	//*   4    7:getfield        #87  <Field int i>
	//*   5   10:icmpge          19
			i2 = i;
	//    6   13:aload_0         
	//    7   14:getfield        #87  <Field int i>
	//    8   17:istore          5
		super.setPadding(i1, j1, k1, i2);
	//    9   19:aload_0         
	//   10   20:iload_1         
	//   11   21:iload_2         
	//   12   22:iload_3         
	//   13   23:iload           5
	//   14   25:invokespecial   #263 <Method void PagerTitleStrip.setPadding(int, int, int, int)>
	//   15   28:return          
	}

	public void setTabIndicatorColor(int i1)
	{
		g = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field int g>
		m.setColor(g);
	//    3    5:aload_0         
	//    4    6:getfield        #43  <Field Paint m>
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field int g>
	//    7   13:invokevirtual   #63  <Method void Paint.setColor(int)>
		invalidate();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #262 <Method void invalidate()>
	//   10   20:return          
	}

	public void setTabIndicatorColorResource(int i1)
	{
		setTabIndicatorColor(android.support.v4.content.a.getColor(getContext(), i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #269 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #275 <Method int a.getColor(Context, int)>
	//    5    9:invokevirtual   #277 <Method void setTabIndicatorColor(int)>
	//    6   12:return          
	}

	public void setTextSpacing(int i1)
	{
		int j1 = i1;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i1 < j)
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #90  <Field int j>
	//*   5    7:icmpge          15
			j1 = j;
	//    6   10:aload_0         
	//    7   11:getfield        #90  <Field int j>
	//    8   14:istore_2        
		super.setTextSpacing(j1);
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:invokespecial   #278 <Method void PagerTitleStrip.setTextSpacing(int)>
	//   12   20:return          
	}

	private int g;
	private int h;
	private int i;
	private int j;
	private int k;
	private int l;
	private final Paint m;
	private final Rect n;
	private int o;
	private boolean p;
	private boolean q;
	private int r;
	private boolean s;
	private float t;
	private float u;
	private int v;
}
