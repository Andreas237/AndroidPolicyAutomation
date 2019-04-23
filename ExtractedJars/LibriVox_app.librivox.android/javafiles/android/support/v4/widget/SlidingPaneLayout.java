// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.a.c;
import android.support.v4.view.ac;
import android.util.AttributeSet;
import android.util.Log;
import android.view.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//			ad, ac, al, ae

public class SlidingPaneLayout extends ViewGroup
{

	private void a(float f1)
	{
		int i1;
		int j1;
		boolean flag;
label0:
		{
			flag = f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method boolean f()>
	//    2    4:istore          8
			ad ad1 = (ad)a.getLayoutParams();
	//    3    6:aload_0         
	//    4    7:getfield        #44  <Field View a>
	//    5   10:invokevirtual   #50  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   13:checkcast       #52  <Class ad>
	//    7   16:astore          10
			boolean flag1 = ad1.c;
	//    8   18:aload           10
	//    9   20:getfield        #54  <Field boolean android.support.v4.widget.ad.c>
	//   10   23:istore          9
			j1 = 0;
	//   11   25:iconst_0        
	//   12   26:istore          4
			if(flag1)
	//*  13   28:iload           9
	//*  14   30:ifeq            62
			{
				if(flag)
	//*  15   33:iload           8
	//*  16   35:ifeq            47
					i1 = ad1.rightMargin;
	//   17   38:aload           10
	//   18   40:getfield        #57  <Field int ad.rightMargin>
	//   19   43:istore_3        
				else
	//*  20   44:goto            53
					i1 = ad1.leftMargin;
	//   21   47:aload           10
	//   22   49:getfield        #60  <Field int ad.leftMargin>
	//   23   52:istore_3        
				if(i1 <= 0)
	//*  24   53:iload_3         
	//*  25   54:ifgt            62
				{
					i1 = 1;
	//   26   57:iconst_1        
	//   27   58:istore_3        
					break label0;
	//   28   59:goto            64
				}
			}
			i1 = 0;
	//   29   62:iconst_0        
	//   30   63:istore_3        
		}
		for(int i2 = getChildCount(); j1 < i2; j1++)
	//*  31   64:aload_0         
	//*  32   65:invokevirtual   #64  <Method int getChildCount()>
	//*  33   68:istore          7
	//*  34   70:iload           4
	//*  35   72:iload           7
	//*  36   74:icmpge          203
		{
			View view = getChildAt(j1);
	//   37   77:aload_0         
	//   38   78:iload           4
	//   39   80:invokevirtual   #68  <Method View getChildAt(int)>
	//   40   83:astore          10
			if(view == a)
	//*  41   85:aload           10
	//*  42   87:aload_0         
	//*  43   88:getfield        #44  <Field View a>
	//*  44   91:if_acmpne       97
				continue;
	//   45   94:goto            194
			float f2 = n;
	//   46   97:aload_0         
	//   47   98:getfield        #70  <Field float n>
	//   48  101:fstore_2        
			int k1 = o;
	//   49  102:aload_0         
	//   50  103:getfield        #72  <Field int o>
	//   51  106:istore          5
			int l1 = (int)((1.0F - f2) * (float)k1);
	//   52  108:fconst_1        
	//   53  109:fload_2         
	//   54  110:fsub            
	//   55  111:iload           5
	//   56  113:i2f             
	//   57  114:fmul            
	//   58  115:f2i             
	//   59  116:istore          6
			n = f1;
	//   60  118:aload_0         
	//   61  119:fload_1         
	//   62  120:putfield        #70  <Field float n>
			l1 -= (int)((1.0F - f1) * (float)k1);
	//   63  123:iload           6
	//   64  125:fconst_1        
	//   65  126:fload_1         
	//   66  127:fsub            
	//   67  128:iload           5
	//   68  130:i2f             
	//   69  131:fmul            
	//   70  132:f2i             
	//   71  133:isub            
	//   72  134:istore          6
			k1 = l1;
	//   73  136:iload           6
	//   74  138:istore          5
			if(flag)
	//*  75  140:iload           8
	//*  76  142:ifeq            150
				k1 = -l1;
	//   77  145:iload           6
	//   78  147:ineg            
	//   79  148:istore          5
			view.offsetLeftAndRight(k1);
	//   80  150:aload           10
	//   81  152:iload           5
	//   82  154:invokevirtual   #76  <Method void View.offsetLeftAndRight(int)>
			if(!i1)
				continue;
	//   83  157:iload_3         
	//   84  158:ifeq            194
			if(flag)
	//*  85  161:iload           8
	//*  86  163:ifeq            176
				f2 = n - 1.0F;
	//   87  166:aload_0         
	//   88  167:getfield        #70  <Field float n>
	//   89  170:fconst_1        
	//   90  171:fsub            
	//   91  172:fstore_2        
			else
	//*  92  173:goto            183
				f2 = 1.0F - n;
	//   93  176:fconst_1        
	//   94  177:aload_0         
	//   95  178:getfield        #70  <Field float n>
	//   96  181:fsub            
	//   97  182:fstore_2        
			a(view, f2, i);
	//   98  183:aload_0         
	//   99  184:aload           10
	//  100  186:fload_2         
	//  101  187:aload_0         
	//  102  188:getfield        #78  <Field int i>
	//  103  191:invokespecial   #81  <Method void a(View, float, int)>
		}

	//  104  194:iload           4
	//  105  196:iconst_1        
	//  106  197:iadd            
	//  107  198:istore          4
	//* 108  200:goto            70
	//  109  203:return          
	}

	private void a(View view, float f1, int i1)
	{
		ad ad1 = (ad)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #50  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #52  <Class ad>
	//    3    7:astore          5
		if(f1 > 0.0F && i1 != 0)
	//*   4    9:fload_2         
	//*   5   10:fconst_0        
	//*   6   11:fcmpl           
	//*   7   12:ifle            105
	//*   8   15:iload_3         
	//*   9   16:ifeq            105
		{
			int j1 = (int)((float)((0xff000000 & i1) >>> 24) * f1);
	//   10   19:ldc1            #83  <Int 0xff000000>
	//   11   21:iload_3         
	//   12   22:iand            
	//   13   23:bipush          24
	//   14   25:iushr           
	//   15   26:i2f             
	//   16   27:fload_2         
	//   17   28:fmul            
	//   18   29:f2i             
	//   19   30:istore          4
			if(ad1.d == null)
	//*  20   32:aload           5
	//*  21   34:getfield        #86  <Field Paint ad.d>
	//*  22   37:ifnonnull       52
				ad1.d = new Paint();
	//   23   40:aload           5
	//   24   42:new             #88  <Class Paint>
	//   25   45:dup             
	//   26   46:invokespecial   #92  <Method void Paint()>
	//   27   49:putfield        #86  <Field Paint ad.d>
			ad1.d.setColorFilter(((android.graphics.ColorFilter) (new PorterDuffColorFilter(j1 << 24 | i1 & 0xffffff, android.graphics.PorterDuff.Mode.SRC_OVER))));
	//   28   52:aload           5
	//   29   54:getfield        #86  <Field Paint ad.d>
	//   30   57:new             #94  <Class PorterDuffColorFilter>
	//   31   60:dup             
	//   32   61:iload           4
	//   33   63:bipush          24
	//   34   65:ishl            
	//   35   66:iload_3         
	//   36   67:ldc1            #95  <Int 0xffffff>
	//   37   69:iand            
	//   38   70:ior             
	//   39   71:getstatic       #101 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_OVER>
	//   40   74:invokespecial   #104 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   41   77:invokevirtual   #108 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//   42   80:pop             
			if(view.getLayerType() != 2)
	//*  43   81:aload_1         
	//*  44   82:invokevirtual   #111 <Method int View.getLayerType()>
	//*  45   85:iconst_2        
	//*  46   86:icmpeq          99
				view.setLayerType(2, ad1.d);
	//   47   89:aload_1         
	//   48   90:iconst_2        
	//   49   91:aload           5
	//   50   93:getfield        #86  <Field Paint ad.d>
	//   51   96:invokevirtual   #115 <Method void View.setLayerType(int, Paint)>
			b(view);
	//   52   99:aload_0         
	//   53  100:aload_1         
	//   54  101:invokevirtual   #118 <Method void b(View)>
			return;
	//   55  104:return          
		}
		if(view.getLayerType() != 0)
	//*  56  105:aload_1         
	//*  57  106:invokevirtual   #111 <Method int View.getLayerType()>
	//*  58  109:ifeq            154
		{
			if(ad1.d != null)
	//*  59  112:aload           5
	//*  60  114:getfield        #86  <Field Paint ad.d>
	//*  61  117:ifnull          130
				ad1.d.setColorFilter(((android.graphics.ColorFilter) (null)));
	//   62  120:aload           5
	//   63  122:getfield        #86  <Field Paint ad.d>
	//   64  125:aconst_null     
	//   65  126:invokevirtual   #108 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//   66  129:pop             
			view = ((View) (new android.support.v4.widget.ac(this, view)));
	//   67  130:new             #120 <Class android.support.v4.widget.ac>
	//   68  133:dup             
	//   69  134:aload_0         
	//   70  135:aload_1         
	//   71  136:invokespecial   #123 <Method void android.support.v4.widget.ac(SlidingPaneLayout, View)>
	//   72  139:astore_1        
			g.add(((Object) (view)));
	//   73  140:aload_0         
	//   74  141:getfield        #125 <Field ArrayList g>
	//   75  144:aload_1         
	//   76  145:invokevirtual   #131 <Method boolean ArrayList.add(Object)>
	//   77  148:pop             
			ac.a(((View) (this)), ((Runnable) (view)));
	//   78  149:aload_0         
	//   79  150:aload_1         
	//   80  151:invokestatic    #136 <Method void ac.a(View, Runnable)>
		}
	//   81  154:return          
	}

	private boolean a(View view, int i1)
	{
		if(!s && !a(0.0F, i1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #139 <Field boolean s>
	//*   2    4:ifne            21
	//*   3    7:aload_0         
	//*   4    8:fconst_0        
	//*   5    9:iload_2         
	//*   6   10:invokevirtual   #142 <Method boolean a(float, int)>
	//*   7   13:ifeq            19
	//*   8   16:goto            21
		{
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		} else
		{
			f = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #144 <Field boolean f>
			return true;
	//   14   26:iconst_1        
	//   15   27:ireturn         
		}
	}

	private boolean b(View view, int i1)
	{
		if(!s && !a(1.0F, i1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #139 <Field boolean s>
	//*   2    4:ifne            21
	//*   3    7:aload_0         
	//*   4    8:fconst_1        
	//*   5    9:iload_2         
	//*   6   10:invokevirtual   #142 <Method boolean a(float, int)>
	//*   7   13:ifeq            19
	//*   8   16:goto            21
		{
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		} else
		{
			f = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #144 <Field boolean f>
			return true;
	//   14   26:iconst_1        
	//   15   27:ireturn         
		}
	}

	private static boolean d(View view)
	{
		if(view.isOpaque())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #148 <Method boolean View.isOpaque()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   5    9:getstatic       #153 <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          18
	//*   7   14:icmplt          19
			return false;
	//    8   17:iconst_0        
	//    9   18:ireturn         
		view = ((View) (view.getBackground()));
	//   10   19:aload_0         
	//   11   20:invokevirtual   #157 <Method Drawable View.getBackground()>
	//   12   23:astore_0        
		if(view != null)
	//*  13   24:aload_0         
	//*  14   25:ifnull          40
			return ((Drawable) (view)).getOpacity() == -1;
	//   15   28:aload_0         
	//   16   29:invokevirtual   #162 <Method int Drawable.getOpacity()>
	//   17   32:iconst_m1       
	//   18   33:icmpne          38
	//   19   36:iconst_1        
	//   20   37:ireturn         
	//   21   38:iconst_0        
	//   22   39:ireturn         
		else
			return false;
	//   23   40:iconst_0        
	//   24   41:ireturn         
	}

	void a()
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          38
		{
			View view = getChildAt(i1);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #68  <Method View getChildAt(int)>
	//   11   17:astore_3        
			if(view.getVisibility() == 4)
	//*  12   18:aload_3         
	//*  13   19:invokevirtual   #165 <Method int View.getVisibility()>
	//*  14   22:iconst_4        
	//*  15   23:icmpne          31
				view.setVisibility(0);
	//   16   26:aload_3         
	//   17   27:iconst_0        
	//   18   28:invokevirtual   #168 <Method void View.setVisibility(int)>
		}

	//   19   31:iload_1         
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore_1        
	//*  23   35:goto            7
	//   24   38:return          
	}

	void a(View view)
	{
		boolean flag = f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method boolean f()>
	//    2    4:istore          17
		int i1;
		if(flag)
	//*   3    6:iload           17
	//*   4    8:ifeq            24
			i1 = getWidth() - getPaddingRight();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #171 <Method int getWidth()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #174 <Method int getPaddingRight()>
	//    9   19:isub            
	//   10   20:istore_2        
		else
	//*  11   21:goto            29
			i1 = getPaddingLeft();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #177 <Method int getPaddingLeft()>
	//   14   28:istore_2        
		int j1;
		if(flag)
	//*  15   29:iload           17
	//*  16   31:ifeq            42
			j1 = getPaddingLeft();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #177 <Method int getPaddingLeft()>
	//   19   38:istore_3        
		else
	//*  20   39:goto            52
			j1 = getWidth() - getPaddingRight();
	//   21   42:aload_0         
	//   22   43:invokevirtual   #171 <Method int getWidth()>
	//   23   46:aload_0         
	//   24   47:invokevirtual   #174 <Method int getPaddingRight()>
	//   25   50:isub            
	//   26   51:istore_3        
		int i3 = getPaddingTop();
	//   27   52:aload_0         
	//   28   53:invokevirtual   #180 <Method int getPaddingTop()>
	//   29   56:istore          10
		int j3 = getHeight();
	//   30   58:aload_0         
	//   31   59:invokevirtual   #183 <Method int getHeight()>
	//   32   62:istore          11
		int k3 = getPaddingBottom();
	//   33   64:aload_0         
	//   34   65:invokevirtual   #186 <Method int getPaddingBottom()>
	//   35   68:istore          12
		int k1;
		int l1;
		int i2;
		int j2;
		if(view != null && d(view))
	//*  36   70:aload_1         
	//*  37   71:ifnull          108
	//*  38   74:aload_1         
	//*  39   75:invokestatic    #188 <Method boolean d(View)>
	//*  40   78:ifeq            108
		{
			k1 = view.getLeft();
	//   41   81:aload_1         
	//   42   82:invokevirtual   #191 <Method int View.getLeft()>
	//   43   85:istore          4
			l1 = view.getRight();
	//   44   87:aload_1         
	//   45   88:invokevirtual   #194 <Method int View.getRight()>
	//   46   91:istore          5
			i2 = view.getTop();
	//   47   93:aload_1         
	//   48   94:invokevirtual   #197 <Method int View.getTop()>
	//   49   97:istore          6
			j2 = view.getBottom();
	//   50   99:aload_1         
	//   51  100:invokevirtual   #200 <Method int View.getBottom()>
	//   52  103:istore          7
		} else
	//*  53  105:goto            120
		{
			k1 = 0;
	//   54  108:iconst_0        
	//   55  109:istore          4
			l1 = 0;
	//   56  111:iconst_0        
	//   57  112:istore          5
			i2 = 0;
	//   58  114:iconst_0        
	//   59  115:istore          6
			j2 = 0;
	//   60  117:iconst_0        
	//   61  118:istore          7
		}
		int l3 = getChildCount();
	//   62  120:aload_0         
	//   63  121:invokevirtual   #64  <Method int getChildCount()>
	//   64  124:istore          13
		for(int k2 = 0; k2 < l3; k2++)
	//*  65  126:iconst_0        
	//*  66  127:istore          8
	//*  67  129:iload           8
	//*  68  131:iload           13
	//*  69  133:icmpge          296
		{
			View view1 = getChildAt(k2);
	//   70  136:aload_0         
	//   71  137:iload           8
	//   72  139:invokevirtual   #68  <Method View getChildAt(int)>
	//   73  142:astore          18
			if(view1 == view)
	//*  74  144:aload           18
	//*  75  146:aload_1         
	//*  76  147:if_acmpne       151
				return;
	//   77  150:return          
			if(view1.getVisibility() == 8)
	//*  78  151:aload           18
	//*  79  153:invokevirtual   #165 <Method int View.getVisibility()>
	//*  80  156:bipush          8
	//*  81  158:icmpne          164
				continue;
	//   82  161:goto            287
			int l2;
			if(flag)
	//*  83  164:iload           17
	//*  84  166:ifeq            175
				l2 = j1;
	//   85  169:iload_3         
	//   86  170:istore          9
			else
	//*  87  172:goto            178
				l2 = i1;
	//   88  175:iload_2         
	//   89  176:istore          9
			int i4 = Math.max(l2, view1.getLeft());
	//   90  178:iload           9
	//   91  180:aload           18
	//   92  182:invokevirtual   #191 <Method int View.getLeft()>
	//   93  185:invokestatic    #206 <Method int Math.max(int, int)>
	//   94  188:istore          14
			int j4 = Math.max(i3, view1.getTop());
	//   95  190:iload           10
	//   96  192:aload           18
	//   97  194:invokevirtual   #197 <Method int View.getTop()>
	//   98  197:invokestatic    #206 <Method int Math.max(int, int)>
	//   99  200:istore          15
			if(flag)
	//* 100  202:iload           17
	//* 101  204:ifeq            213
				l2 = i1;
	//  102  207:iload_2         
	//  103  208:istore          9
			else
	//* 104  210:goto            216
				l2 = j1;
	//  105  213:iload_3         
	//  106  214:istore          9
			l2 = Math.min(l2, view1.getRight());
	//  107  216:iload           9
	//  108  218:aload           18
	//  109  220:invokevirtual   #194 <Method int View.getRight()>
	//  110  223:invokestatic    #209 <Method int Math.min(int, int)>
	//  111  226:istore          9
			int k4 = Math.min(j3 - k3, view1.getBottom());
	//  112  228:iload           11
	//  113  230:iload           12
	//  114  232:isub            
	//  115  233:aload           18
	//  116  235:invokevirtual   #200 <Method int View.getBottom()>
	//  117  238:invokestatic    #209 <Method int Math.min(int, int)>
	//  118  241:istore          16
			if(i4 >= k1 && j4 >= i2 && l2 <= l1 && k4 <= j2)
	//* 119  243:iload           14
	//* 120  245:iload           4
	//* 121  247:icmplt          277
	//* 122  250:iload           15
	//* 123  252:iload           6
	//* 124  254:icmplt          277
	//* 125  257:iload           9
	//* 126  259:iload           5
	//* 127  261:icmpgt          277
	//* 128  264:iload           16
	//* 129  266:iload           7
	//* 130  268:icmpgt          277
				l2 = 4;
	//  131  271:iconst_4        
	//  132  272:istore          9
			else
	//* 133  274:goto            280
				l2 = 0;
	//  134  277:iconst_0        
	//  135  278:istore          9
			view1.setVisibility(l2);
	//  136  280:aload           18
	//  137  282:iload           9
	//  138  284:invokevirtual   #168 <Method void View.setVisibility(int)>
		}

	//  139  287:iload           8
	//  140  289:iconst_1        
	//  141  290:iadd            
	//  142  291:istore          8
	//* 143  293:goto            129
	//  144  296:return          
	}

	boolean a(float f1, int i1)
	{
		if(!m)
	//*   0    0:aload_0         
	//*   1    1:getfield        #211 <Field boolean m>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag = f();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #42  <Method boolean f()>
	//    7   13:istore          5
		Object obj = ((Object) ((ad)a.getLayoutParams()));
	//    8   15:aload_0         
	//    9   16:getfield        #44  <Field View a>
	//   10   19:invokevirtual   #50  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   11   22:checkcast       #52  <Class ad>
	//   12   25:astore          6
		if(flag)
	//*  13   27:iload           5
	//*  14   29:ifeq            79
		{
			i1 = getPaddingRight();
	//   15   32:aload_0         
	//   16   33:invokevirtual   #174 <Method int getPaddingRight()>
	//   17   36:istore_2        
			int j1 = ((ad) (obj)).rightMargin;
	//   18   37:aload           6
	//   19   39:getfield        #57  <Field int ad.rightMargin>
	//   20   42:istore_3        
			int k1 = a.getWidth();
	//   21   43:aload_0         
	//   22   44:getfield        #44  <Field View a>
	//   23   47:invokevirtual   #212 <Method int View.getWidth()>
	//   24   50:istore          4
			i1 = (int)((float)getWidth() - ((float)(i1 + j1) + f1 * (float)c + (float)k1));
	//   25   52:aload_0         
	//   26   53:invokevirtual   #171 <Method int getWidth()>
	//   27   56:i2f             
	//   28   57:iload_2         
	//   29   58:iload_3         
	//   30   59:iadd            
	//   31   60:i2f             
	//   32   61:fload_1         
	//   33   62:aload_0         
	//   34   63:getfield        #214 <Field int c>
	//   35   66:i2f             
	//   36   67:fmul            
	//   37   68:fadd            
	//   38   69:iload           4
	//   39   71:i2f             
	//   40   72:fadd            
	//   41   73:fsub            
	//   42   74:f2i             
	//   43   75:istore_2        
		} else
	//*  44   76:goto            100
		{
			i1 = (int)((float)(getPaddingLeft() + ((ad) (obj)).leftMargin) + f1 * (float)c);
	//   45   79:aload_0         
	//   46   80:invokevirtual   #177 <Method int getPaddingLeft()>
	//   47   83:aload           6
	//   48   85:getfield        #60  <Field int ad.leftMargin>
	//   49   88:iadd            
	//   50   89:i2f             
	//   51   90:fload_1         
	//   52   91:aload_0         
	//   53   92:getfield        #214 <Field int c>
	//   54   95:i2f             
	//   55   96:fmul            
	//   56   97:fadd            
	//   57   98:f2i             
	//   58   99:istore_2        
		}
		obj = ((Object) (e));
	//   59  100:aload_0         
	//   60  101:getfield        #216 <Field al e>
	//   61  104:astore          6
		View view = a;
	//   62  106:aload_0         
	//   63  107:getfield        #44  <Field View a>
	//   64  110:astore          7
		if(((al) (obj)).a(view, i1, view.getTop()))
	//*  65  112:aload           6
	//*  66  114:aload           7
	//*  67  116:iload_2         
	//*  68  117:aload           7
	//*  69  119:invokevirtual   #197 <Method int View.getTop()>
	//*  70  122:invokevirtual   #221 <Method boolean al.a(View, int, int)>
	//*  71  125:ifeq            138
		{
			a();
	//   72  128:aload_0         
	//   73  129:invokevirtual   #223 <Method void a()>
			ac.d(((View) (this)));
	//   74  132:aload_0         
	//   75  133:invokestatic    #225 <Method void ac.d(View)>
			return true;
	//   76  136:iconst_1        
	//   77  137:ireturn         
		} else
		{
			return false;
	//   78  138:iconst_0        
	//   79  139:ireturn         
		}
	}

	void b(View view)
	{
label0:
		{
			if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #153 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          23
			{
				ac.a(view, ((ad)view.getLayoutParams()).d);
	//    3    8:aload_1         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #50  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   13:checkcast       #52  <Class ad>
	//    7   16:getfield        #86  <Field Paint ad.d>
	//    8   19:invokestatic    #234 <Method void ac.a(View, Paint)>
				return;
	//    9   22:return          
			}
			if(android.os.Build.VERSION.SDK_INT < 16)
				break label0;
	//   10   23:getstatic       #153 <Field int android.os.Build$VERSION.SDK_INT>
	//   11   26:bipush          16
	//   12   28:icmplt          165
			if(!w)
	//*  13   31:aload_0         
	//*  14   32:getfield        #236 <Field boolean w>
	//*  15   35:ifne            105
			{
				try
				{
					u = ((Class) (android/view/View)).getDeclaredMethod("getDisplayList", (Class[])null);
	//   16   38:aload_0         
	//   17   39:ldc1            #46  <Class View>
	//   18   41:ldc1            #238 <String "getDisplayList">
	//   19   43:aconst_null     
	//   20   44:checkcast       #240 <Class Class[]>
	//   21   47:invokevirtual   #246 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   22   50:putfield        #248 <Field Method u>
				}
	//*  23   53:goto            66
				catch(NoSuchMethodException nosuchmethodexception)
	//*  24   56:astore_2        
				{
					Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", ((Throwable) (nosuchmethodexception)));
	//   25   57:ldc1            #250 <String "SlidingPaneLayout">
	//   26   59:ldc1            #252 <String "Couldn't fetch getDisplayList method; dimming won't work right.">
	//   27   61:aload_2         
	//   28   62:invokestatic    #257 <Method int Log.e(String, String, Throwable)>
	//   29   65:pop             
				}
				try
				{
					v = ((Class) (android/view/View)).getDeclaredField("mRecreateDisplayList");
	//   30   66:aload_0         
	//   31   67:ldc1            #46  <Class View>
	//   32   69:ldc2            #259 <String "mRecreateDisplayList">
	//   33   72:invokevirtual   #263 <Method Field Class.getDeclaredField(String)>
	//   34   75:putfield        #265 <Field Field v>
					v.setAccessible(true);
	//   35   78:aload_0         
	//   36   79:getfield        #265 <Field Field v>
	//   37   82:iconst_1        
	//   38   83:invokevirtual   #271 <Method void Field.setAccessible(boolean)>
				}
	//*  39   86:goto            100
				catch(NoSuchFieldException nosuchfieldexception)
	//*  40   89:astore_2        
				{
					Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", ((Throwable) (nosuchfieldexception)));
	//   41   90:ldc1            #250 <String "SlidingPaneLayout">
	//   42   92:ldc2            #273 <String "Couldn't fetch mRecreateDisplayList field; dimming will be slow.">
	//   43   95:aload_2         
	//   44   96:invokestatic    #257 <Method int Log.e(String, String, Throwable)>
	//   45   99:pop             
				}
				w = true;
	//   46  100:aload_0         
	//   47  101:iconst_1        
	//   48  102:putfield        #236 <Field boolean w>
			}
			if(u != null)
	//*  49  105:aload_0         
	//*  50  106:getfield        #248 <Field Method u>
	//*  51  109:ifnull          160
			{
				Field field = v;
	//   52  112:aload_0         
	//   53  113:getfield        #265 <Field Field v>
	//   54  116:astore_2        
				if(field != null)
	//*  55  117:aload_2         
	//*  56  118:ifnonnull       124
	//*  57  121:goto            160
				{
					try
					{
						field.setBoolean(((Object) (view)), true);
	//   58  124:aload_2         
	//   59  125:aload_1         
	//   60  126:iconst_1        
	//   61  127:invokevirtual   #277 <Method void Field.setBoolean(Object, boolean)>
						u.invoke(((Object) (view)), (Object[])null);
	//   62  130:aload_0         
	//   63  131:getfield        #248 <Field Method u>
	//   64  134:aload_1         
	//   65  135:aconst_null     
	//   66  136:checkcast       #279 <Class Object[]>
	//   67  139:invokevirtual   #285 <Method Object Method.invoke(Object, Object[])>
	//   68  142:pop             
					}
	//*  69  143:goto            165
					catch(Exception exception)
	//*  70  146:astore_2        
					{
						Log.e("SlidingPaneLayout", "Error refreshing display list state", ((Throwable) (exception)));
	//   71  147:ldc1            #250 <String "SlidingPaneLayout">
	//   72  149:ldc2            #287 <String "Error refreshing display list state">
	//   73  152:aload_2         
	//   74  153:invokestatic    #257 <Method int Log.e(String, String, Throwable)>
	//   75  156:pop             
					}
					break label0;
	//   76  157:goto            165
				}
			}
			view.invalidate();
	//   77  160:aload_1         
	//   78  161:invokevirtual   #290 <Method void View.invalidate()>
			return;
	//   79  164:return          
		}
		ac.a(((View) (this)), view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//   80  165:aload_0         
	//   81  166:aload_1         
	//   82  167:invokevirtual   #191 <Method int View.getLeft()>
	//   83  170:aload_1         
	//   84  171:invokevirtual   #197 <Method int View.getTop()>
	//   85  174:aload_1         
	//   86  175:invokevirtual   #194 <Method int View.getRight()>
	//   87  178:aload_1         
	//   88  179:invokevirtual   #200 <Method int View.getBottom()>
	//   89  182:invokestatic    #293 <Method void ac.a(View, int, int, int, int)>
	//   90  185:return          
	}

	public boolean b()
	{
		return b(a, 0);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #44  <Field View a>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #295 <Method boolean b(View, int)>
	//    5    9:ireturn         
	}

	public boolean c()
	{
		return a(a, 0);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #44  <Field View a>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #297 <Method boolean a(View, int)>
	//    5    9:ireturn         
	}

	boolean c(View view)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(view == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		view = ((View) ((ad)view.getLayoutParams()));
	//    6    8:aload_1         
	//    7    9:invokevirtual   #50  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    8   12:checkcast       #52  <Class ad>
	//    9   15:astore_1        
		boolean flag = flag1;
	//   10   16:iload_3         
	//   11   17:istore_2        
		if(m)
	//*  12   18:aload_0         
	//*  13   19:getfield        #211 <Field boolean m>
	//*  14   22:ifeq            47
		{
			flag = flag1;
	//   15   25:iload_3         
	//   16   26:istore_2        
			if(((ad) (view)).c)
	//*  17   27:aload_1         
	//*  18   28:getfield        #54  <Field boolean android.support.v4.widget.ad.c>
	//*  19   31:ifeq            47
			{
				flag = flag1;
	//   20   34:iload_3         
	//   21   35:istore_2        
				if(b > 0.0F)
	//*  22   36:aload_0         
	//*  23   37:getfield        #299 <Field float b>
	//*  24   40:fconst_0        
	//*  25   41:fcmpl           
	//*  26   42:ifle            47
					flag = true;
	//   27   45:iconst_1        
	//   28   46:istore_2        
			}
		}
		return flag;
	//   29   47:iload_2         
	//   30   48:ireturn         
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof ad) && super.checkLayoutParams(layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #52  <Class ad>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #303 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void computeScroll()
	{
		if(e.a(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #216 <Field al e>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #307 <Method boolean al.a(boolean)>
	//*   4    8:ifeq            30
		{
			if(!m)
	//*   5   11:aload_0         
	//*   6   12:getfield        #211 <Field boolean m>
	//*   7   15:ifne            26
			{
				e.f();
	//    8   18:aload_0         
	//    9   19:getfield        #216 <Field al e>
	//   10   22:invokevirtual   #309 <Method void al.f()>
				return;
	//   11   25:return          
			}
			ac.d(((View) (this)));
	//   12   26:aload_0         
	//   13   27:invokestatic    #225 <Method void ac.d(View)>
		}
	//   14   30:return          
	}

	public boolean d()
	{
		return !m || b == 1.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field boolean m>
	//    2    4:ifeq            21
	//    3    7:aload_0         
	//    4    8:getfield        #299 <Field float b>
	//    5   11:fconst_1        
	//    6   12:fcmpl           
	//    7   13:ifne            19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #313 <Method void ViewGroup.draw(Canvas)>
		Drawable drawable;
		if(f())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #42  <Method boolean f()>
	//*   5    9:ifeq            21
			drawable = k;
	//    6   12:aload_0         
	//    7   13:getfield        #315 <Field Drawable k>
	//    8   16:astore          7
		else
	//*   9   18:goto            27
			drawable = j;
	//   10   21:aload_0         
	//   11   22:getfield        #317 <Field Drawable j>
	//   12   25:astore          7
		View view;
		if(getChildCount() > 1)
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #64  <Method int getChildCount()>
	//*  15   31:iconst_1        
	//*  16   32:icmple          45
			view = getChildAt(1);
	//   17   35:aload_0         
	//   18   36:iconst_1        
	//   19   37:invokevirtual   #68  <Method View getChildAt(int)>
	//   20   40:astore          8
		else
	//*  21   42:goto            48
			view = null;
	//   22   45:aconst_null     
	//   23   46:astore          8
		if(view != null)
	//*  24   48:aload           8
	//*  25   50:ifnull          138
		{
			if(drawable == null)
	//*  26   53:aload           7
	//*  27   55:ifnonnull       59
				return;
	//   28   58:return          
			int l1 = view.getTop();
	//   29   59:aload           8
	//   30   61:invokevirtual   #197 <Method int View.getTop()>
	//   31   64:istore          5
			int i2 = view.getBottom();
	//   32   66:aload           8
	//   33   68:invokevirtual   #200 <Method int View.getBottom()>
	//   34   71:istore          6
			int k1 = drawable.getIntrinsicWidth();
	//   35   73:aload           7
	//   36   75:invokevirtual   #320 <Method int Drawable.getIntrinsicWidth()>
	//   37   78:istore          4
			int i1;
			int j1;
			if(f())
	//*  38   80:aload_0         
	//*  39   81:invokevirtual   #42  <Method boolean f()>
	//*  40   84:ifeq            101
			{
				i1 = view.getRight();
	//   41   87:aload           8
	//   42   89:invokevirtual   #194 <Method int View.getRight()>
	//   43   92:istore_2        
				j1 = k1 + i1;
	//   44   93:iload           4
	//   45   95:iload_2         
	//   46   96:iadd            
	//   47   97:istore_3        
			} else
	//*  48   98:goto            120
			{
				j1 = view.getLeft();
	//   49  101:aload           8
	//   50  103:invokevirtual   #191 <Method int View.getLeft()>
	//   51  106:istore_3        
				i1 = j1;
	//   52  107:iload_3         
	//   53  108:istore_2        
				k1 = j1 - k1;
	//   54  109:iload_3         
	//   55  110:iload           4
	//   56  112:isub            
	//   57  113:istore          4
				j1 = i1;
	//   58  115:iload_2         
	//   59  116:istore_3        
				i1 = k1;
	//   60  117:iload           4
	//   61  119:istore_2        
			}
			drawable.setBounds(i1, l1, j1, i2);
	//   62  120:aload           7
	//   63  122:iload_2         
	//   64  123:iload           5
	//   65  125:iload_3         
	//   66  126:iload           6
	//   67  128:invokevirtual   #324 <Method void Drawable.setBounds(int, int, int, int)>
			drawable.draw(canvas);
	//   68  131:aload           7
	//   69  133:aload_1         
	//   70  134:invokevirtual   #325 <Method void Drawable.draw(Canvas)>
			return;
	//   71  137:return          
		} else
		{
			return;
	//   72  138:return          
		}
	}

	protected boolean drawChild(Canvas canvas, View view, long l1)
	{
		ad ad1 = (ad)view.getLayoutParams();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #50  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #52  <Class ad>
	//    3    7:astore          7
		int i1 = canvas.save();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #332 <Method int Canvas.save()>
	//    6   13:istore          5
		if(m && !ad1.b && a != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #211 <Field boolean m>
	//*   9   19:ifeq            117
	//*  10   22:aload           7
	//*  11   24:getfield        #334 <Field boolean ad.b>
	//*  12   27:ifne            117
	//*  13   30:aload_0         
	//*  14   31:getfield        #44  <Field View a>
	//*  15   34:ifnull          117
		{
			canvas.getClipBounds(t);
	//   16   37:aload_1         
	//   17   38:aload_0         
	//   18   39:getfield        #336 <Field Rect t>
	//   19   42:invokevirtual   #340 <Method boolean Canvas.getClipBounds(Rect)>
	//   20   45:pop             
			if(f())
	//*  21   46:aload_0         
	//*  22   47:invokevirtual   #42  <Method boolean f()>
	//*  23   50:ifeq            82
			{
				Rect rect = t;
	//   24   53:aload_0         
	//   25   54:getfield        #336 <Field Rect t>
	//   26   57:astore          7
				rect.left = Math.max(rect.left, a.getRight());
	//   27   59:aload           7
	//   28   61:aload           7
	//   29   63:getfield        #345 <Field int Rect.left>
	//   30   66:aload_0         
	//   31   67:getfield        #44  <Field View a>
	//   32   70:invokevirtual   #194 <Method int View.getRight()>
	//   33   73:invokestatic    #206 <Method int Math.max(int, int)>
	//   34   76:putfield        #345 <Field int Rect.left>
			} else
	//*  35   79:goto            108
			{
				Rect rect1 = t;
	//   36   82:aload_0         
	//   37   83:getfield        #336 <Field Rect t>
	//   38   86:astore          7
				rect1.right = Math.min(rect1.right, a.getLeft());
	//   39   88:aload           7
	//   40   90:aload           7
	//   41   92:getfield        #348 <Field int Rect.right>
	//   42   95:aload_0         
	//   43   96:getfield        #44  <Field View a>
	//   44   99:invokevirtual   #191 <Method int View.getLeft()>
	//   45  102:invokestatic    #209 <Method int Math.min(int, int)>
	//   46  105:putfield        #348 <Field int Rect.right>
			}
			canvas.clipRect(t);
	//   47  108:aload_1         
	//   48  109:aload_0         
	//   49  110:getfield        #336 <Field Rect t>
	//   50  113:invokevirtual   #351 <Method boolean Canvas.clipRect(Rect)>
	//   51  116:pop             
		}
		boolean flag = super.drawChild(canvas, view, l1);
	//   52  117:aload_0         
	//   53  118:aload_1         
	//   54  119:aload_2         
	//   55  120:lload_3         
	//   56  121:invokespecial   #353 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//   57  124:istore          6
		canvas.restoreToCount(i1);
	//   58  126:aload_1         
	//   59  127:iload           5
	//   60  129:invokevirtual   #356 <Method void Canvas.restoreToCount(int)>
		return flag;
	//   61  132:iload           6
	//   62  134:ireturn         
	}

	public boolean e()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field boolean m>
	//    2    4:ireturn         
	}

	boolean f()
	{
		return ac.f(((View) (this))) == 1;
	//    0    0:aload_0         
	//    1    1:invokestatic    #359 <Method int ac.f(View)>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new ad()));
	//    0    0:new             #52  <Class ad>
	//    1    3:dup             
	//    2    4:invokespecial   #361 <Method void ad()>
	//    3    7:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new ad(getContext(), attributeset)));
	//    0    0:new             #52  <Class ad>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #367 <Method android.content.Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #370 <Method void ad(android.content.Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #373 <Class android.view.ViewGroup$MarginLayoutParams>
	//*   2    4:ifeq            19
			return ((android.view.ViewGroup.LayoutParams) (new ad((android.view.ViewGroup.MarginLayoutParams)layoutparams)));
	//    3    7:new             #52  <Class ad>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #373 <Class android.view.ViewGroup$MarginLayoutParams>
	//    7   15:invokespecial   #376 <Method void ad(android.view.ViewGroup$MarginLayoutParams)>
	//    8   18:areturn         
		else
			return ((android.view.ViewGroup.LayoutParams) (new ad(layoutparams)));
	//    9   19:new             #52  <Class ad>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokespecial   #379 <Method void ad(android.view.ViewGroup$LayoutParams)>
	//   13   27:areturn         
	}

	public int getCoveredFadeColor()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field int i>
	//    2    4:ireturn         
	}

	public int getParallaxDistance()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int o>
	//    2    4:ireturn         
	}

	public int getSliderFadeColor()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #384 <Field int h>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #387 <Method void ViewGroup.onAttachedToWindow()>
		s = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #139 <Field boolean s>
	//    5    9:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #390 <Method void ViewGroup.onDetachedFromWindow()>
		s = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #139 <Field boolean s>
		int j1 = g.size();
	//    5    9:aload_0         
	//    6   10:getfield        #125 <Field ArrayList g>
	//    7   13:invokevirtual   #393 <Method int ArrayList.size()>
	//    8   16:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   9   17:iconst_0        
	//*  10   18:istore_1        
	//*  11   19:iload_1         
	//*  12   20:iload_2         
	//*  13   21:icmpge          45
			((android.support.v4.widget.ac)g.get(i1)).run();
	//   14   24:aload_0         
	//   15   25:getfield        #125 <Field ArrayList g>
	//   16   28:iload_1         
	//   17   29:invokevirtual   #397 <Method Object ArrayList.get(int)>
	//   18   32:checkcast       #120 <Class android.support.v4.widget.ac>
	//   19   35:invokevirtual   #400 <Method void ac.run()>

	//   20   38:iload_1         
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore_1        
	//*  24   42:goto            19
		g.clear();
	//   25   45:aload_0         
	//   26   46:getfield        #125 <Field ArrayList g>
	//   27   49:invokevirtual   #403 <Method void ArrayList.clear()>
	//   28   52:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
label0:
		{
label1:
			{
				boolean flag;
				boolean flag1;
label2:
				{
					int i1 = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #410 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          4
					boolean flag2 = m;
	//    3    6:aload_0         
	//    4    7:getfield        #211 <Field boolean m>
	//    5   10:istore          6
					flag1 = true;
	//    6   12:iconst_1        
	//    7   13:istore          5
					if(!flag2 && i1 == 0 && getChildCount() > 1)
	//*   8   15:iload           6
	//*   9   17:ifne            70
	//*  10   20:iload           4
	//*  11   22:ifne            70
	//*  12   25:aload_0         
	//*  13   26:invokevirtual   #64  <Method int getChildCount()>
	//*  14   29:iconst_1        
	//*  15   30:icmple          70
					{
						View view = getChildAt(1);
	//   16   33:aload_0         
	//   17   34:iconst_1        
	//   18   35:invokevirtual   #68  <Method View getChildAt(int)>
	//   19   38:astore          7
						if(view != null)
	//*  20   40:aload           7
	//*  21   42:ifnull          70
							f = e.b(view, (int)motionevent.getX(), (int)motionevent.getY()) ^ true;
	//   22   45:aload_0         
	//   23   46:aload_0         
	//   24   47:getfield        #216 <Field al e>
	//   25   50:aload           7
	//   26   52:aload_1         
	//   27   53:invokevirtual   #414 <Method float MotionEvent.getX()>
	//   28   56:f2i             
	//   29   57:aload_1         
	//   30   58:invokevirtual   #417 <Method float MotionEvent.getY()>
	//   31   61:f2i             
	//   32   62:invokevirtual   #419 <Method boolean al.b(View, int, int)>
	//   33   65:iconst_1        
	//   34   66:ixor            
	//   35   67:putfield        #144 <Field boolean f>
					}
					if(!m || d && i1 != 0)
	//*  36   70:aload_0         
	//*  37   71:getfield        #211 <Field boolean m>
	//*  38   74:ifeq            280
	//*  39   77:aload_0         
	//*  40   78:getfield        #421 <Field boolean d>
	//*  41   81:ifeq            92
	//*  42   84:iload           4
	//*  43   86:ifeq            92
						break label0;
	//   44   89:goto            280
					if(i1 == 3 || i1 == 1)
	//*  45   92:iload           4
	//*  46   94:iconst_3        
	//*  47   95:icmpeq          271
	//*  48   98:iload           4
	//*  49  100:iconst_1        
	//*  50  101:icmpne          107
						break label1;
	//   51  104:goto            271
					if(i1 != 0)
	//*  52  107:iload           4
	//*  53  109:ifeq            184
					{
						if(i1 == 2)
	//*  54  112:iload           4
	//*  55  114:iconst_2        
	//*  56  115:icmpeq          121
	//*  57  118:goto            244
						{
							float f3 = motionevent.getX();
	//   58  121:aload_1         
	//   59  122:invokevirtual   #414 <Method float MotionEvent.getX()>
	//   60  125:fstore_3        
							float f1 = motionevent.getY();
	//   61  126:aload_1         
	//   62  127:invokevirtual   #417 <Method float MotionEvent.getY()>
	//   63  130:fstore_2        
							f3 = Math.abs(f3 - p);
	//   64  131:fload_3         
	//   65  132:aload_0         
	//   66  133:getfield        #423 <Field float p>
	//   67  136:fsub            
	//   68  137:invokestatic    #427 <Method float Math.abs(float)>
	//   69  140:fstore_3        
							f1 = Math.abs(f1 - q);
	//   70  141:fload_2         
	//   71  142:aload_0         
	//   72  143:getfield        #429 <Field float q>
	//   73  146:fsub            
	//   74  147:invokestatic    #427 <Method float Math.abs(float)>
	//   75  150:fstore_2        
							if(f3 > (float)e.d() && f1 > f3)
	//*  76  151:fload_3         
	//*  77  152:aload_0         
	//*  78  153:getfield        #216 <Field al e>
	//*  79  156:invokevirtual   #431 <Method int al.d()>
	//*  80  159:i2f             
	//*  81  160:fcmpl           
	//*  82  161:ifle            244
	//*  83  164:fload_2         
	//*  84  165:fload_3         
	//*  85  166:fcmpl           
	//*  86  167:ifle            244
							{
								e.e();
	//   87  170:aload_0         
	//   88  171:getfield        #216 <Field al e>
	//   89  174:invokevirtual   #433 <Method void al.e()>
								d = true;
	//   90  177:aload_0         
	//   91  178:iconst_1        
	//   92  179:putfield        #421 <Field boolean d>
								return false;
	//   93  182:iconst_0        
	//   94  183:ireturn         
							}
						}
					} else
					{
						d = false;
	//   95  184:aload_0         
	//   96  185:iconst_0        
	//   97  186:putfield        #421 <Field boolean d>
						float f2 = motionevent.getX();
	//   98  189:aload_1         
	//   99  190:invokevirtual   #414 <Method float MotionEvent.getX()>
	//  100  193:fstore_2        
						float f4 = motionevent.getY();
	//  101  194:aload_1         
	//  102  195:invokevirtual   #417 <Method float MotionEvent.getY()>
	//  103  198:fstore_3        
						p = f2;
	//  104  199:aload_0         
	//  105  200:fload_2         
	//  106  201:putfield        #423 <Field float p>
						q = f4;
	//  107  204:aload_0         
	//  108  205:fload_3         
	//  109  206:putfield        #429 <Field float q>
						if(e.b(a, (int)f2, (int)f4) && c(a))
	//* 110  209:aload_0         
	//* 111  210:getfield        #216 <Field al e>
	//* 112  213:aload_0         
	//* 113  214:getfield        #44  <Field View a>
	//* 114  217:fload_2         
	//* 115  218:f2i             
	//* 116  219:fload_3         
	//* 117  220:f2i             
	//* 118  221:invokevirtual   #419 <Method boolean al.b(View, int, int)>
	//* 119  224:ifeq            244
	//* 120  227:aload_0         
	//* 121  228:aload_0         
	//* 122  229:getfield        #44  <Field View a>
	//* 123  232:invokevirtual   #435 <Method boolean c(View)>
	//* 124  235:ifeq            244
						{
							flag = true;
	//  125  238:iconst_1        
	//  126  239:istore          4
							break label2;
	//  127  241:goto            247
						}
					}
					flag = false;
	//  128  244:iconst_0        
	//  129  245:istore          4
				}
				if(!e.a(motionevent))
	//* 130  247:aload_0         
	//* 131  248:getfield        #216 <Field al e>
	//* 132  251:aload_1         
	//* 133  252:invokevirtual   #437 <Method boolean al.a(MotionEvent)>
	//* 134  255:ifne            268
				{
					if(flag)
	//* 135  258:iload           4
	//* 136  260:ifeq            265
						return true;
	//  137  263:iconst_1        
	//  138  264:ireturn         
					flag1 = false;
	//  139  265:iconst_0        
	//  140  266:istore          5
				}
				return flag1;
	//  141  268:iload           5
	//  142  270:ireturn         
			}
			e.e();
	//  143  271:aload_0         
	//  144  272:getfield        #216 <Field al e>
	//  145  275:invokevirtual   #433 <Method void al.e()>
			return false;
	//  146  278:iconst_0        
	//  147  279:ireturn         
		}
		e.e();
	//  148  280:aload_0         
	//  149  281:getfield        #216 <Field al e>
	//  150  284:invokevirtual   #433 <Method void al.e()>
		return super.onInterceptTouchEvent(motionevent);
	//  151  287:aload_0         
	//  152  288:aload_1         
	//  153  289:invokespecial   #439 <Method boolean ViewGroup.onInterceptTouchEvent(MotionEvent)>
	//  154  292:ireturn         
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		boolean flag1 = f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method boolean f()>
	//    2    4:istore          14
		if(flag1)
	//*   3    6:iload           14
	//*   4    8:ifeq            22
			e.a(2);
	//    5   11:aload_0         
	//    6   12:getfield        #216 <Field al e>
	//    7   15:iconst_2        
	//    8   16:invokevirtual   #443 <Method void al.a(int)>
		else
	//*   9   19:goto            30
			e.a(1);
	//   10   22:aload_0         
	//   11   23:getfield        #216 <Field al e>
	//   12   26:iconst_1        
	//   13   27:invokevirtual   #443 <Method void al.a(int)>
		int l2 = k1 - i1;
	//   14   30:iload           4
	//   15   32:iload_2         
	//   16   33:isub            
	//   17   34:istore          9
		if(flag1)
	//*  18   36:iload           14
	//*  19   38:ifeq            49
			i1 = getPaddingRight();
	//   20   41:aload_0         
	//   21   42:invokevirtual   #174 <Method int getPaddingRight()>
	//   22   45:istore_2        
		else
	//*  23   46:goto            54
			i1 = getPaddingLeft();
	//   24   49:aload_0         
	//   25   50:invokevirtual   #177 <Method int getPaddingLeft()>
	//   26   53:istore_2        
		if(flag1)
	//*  27   54:iload           14
	//*  28   56:ifeq            68
			l1 = getPaddingLeft();
	//   29   59:aload_0         
	//   30   60:invokevirtual   #177 <Method int getPaddingLeft()>
	//   31   63:istore          5
		else
	//*  32   65:goto            74
			l1 = getPaddingRight();
	//   33   68:aload_0         
	//   34   69:invokevirtual   #174 <Method int getPaddingRight()>
	//   35   72:istore          5
		int j3 = getPaddingTop();
	//   36   74:aload_0         
	//   37   75:invokevirtual   #180 <Method int getPaddingTop()>
	//   38   78:istore          11
		int i3 = getChildCount();
	//   39   80:aload_0         
	//   40   81:invokevirtual   #64  <Method int getChildCount()>
	//   41   84:istore          10
		if(s)
	//*  42   86:aload_0         
	//*  43   87:getfield        #139 <Field boolean s>
	//*  44   90:ifeq            122
		{
			float f1;
			if(m && f)
	//*  45   93:aload_0         
	//*  46   94:getfield        #211 <Field boolean m>
	//*  47   97:ifeq            113
	//*  48  100:aload_0         
	//*  49  101:getfield        #144 <Field boolean f>
	//*  50  104:ifeq            113
				f1 = 1.0F;
	//   51  107:fconst_1        
	//   52  108:fstore          6
			else
	//*  53  110:goto            116
				f1 = 0.0F;
	//   54  113:fconst_0        
	//   55  114:fstore          6
			b = f1;
	//   56  116:aload_0         
	//   57  117:fload           6
	//   58  119:putfield        #299 <Field float b>
		}
		j1 = i1;
	//   59  122:iload_2         
	//   60  123:istore_3        
		for(int i2 = 0; i2 < i3; i2++)
	//*  61  124:iconst_0        
	//*  62  125:istore          7
	//*  63  127:iload           7
	//*  64  129:iload           10
	//*  65  131:icmpge          429
		{
			int k3;
			View view;
label0:
			{
				view = getChildAt(i2);
	//   66  134:aload_0         
	//   67  135:iload           7
	//   68  137:invokevirtual   #68  <Method View getChildAt(int)>
	//   69  140:astore          15
				if(view.getVisibility() == 8)
	//*  70  142:aload           15
	//*  71  144:invokevirtual   #165 <Method int View.getVisibility()>
	//*  72  147:bipush          8
	//*  73  149:icmpne          155
					continue;
	//   74  152:goto            420
				ad ad1 = (ad)view.getLayoutParams();
	//   75  155:aload           15
	//   76  157:invokevirtual   #50  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   77  160:checkcast       #52  <Class ad>
	//   78  163:astore          16
				k3 = view.getMeasuredWidth();
	//   79  165:aload           15
	//   80  167:invokevirtual   #446 <Method int View.getMeasuredWidth()>
	//   81  170:istore          12
				if(ad1.b)
	//*  82  172:aload           16
	//*  83  174:getfield        #334 <Field boolean ad.b>
	//*  84  177:ifeq            318
				{
					k1 = ad1.leftMargin;
	//   85  180:aload           16
	//   86  182:getfield        #60  <Field int ad.leftMargin>
	//   87  185:istore          4
					int l3 = ad1.rightMargin;
	//   88  187:aload           16
	//   89  189:getfield        #57  <Field int ad.rightMargin>
	//   90  192:istore          13
					int j2 = l2 - l1;
	//   91  194:iload           9
	//   92  196:iload           5
	//   93  198:isub            
	//   94  199:istore          8
					l3 = Math.min(i1, j2 - l) - j1 - (k1 + l3);
	//   95  201:iload_2         
	//   96  202:iload           8
	//   97  204:aload_0         
	//   98  205:getfield        #448 <Field int l>
	//   99  208:isub            
	//  100  209:invokestatic    #209 <Method int Math.min(int, int)>
	//  101  212:iload_3         
	//  102  213:isub            
	//  103  214:iload           4
	//  104  216:iload           13
	//  105  218:iadd            
	//  106  219:isub            
	//  107  220:istore          13
					c = l3;
	//  108  222:aload_0         
	//  109  223:iload           13
	//  110  225:putfield        #214 <Field int c>
					if(flag1)
	//* 111  228:iload           14
	//* 112  230:ifeq            243
						k1 = ad1.rightMargin;
	//  113  233:aload           16
	//  114  235:getfield        #57  <Field int ad.rightMargin>
	//  115  238:istore          4
					else
	//* 116  240:goto            250
						k1 = ad1.leftMargin;
	//  117  243:aload           16
	//  118  245:getfield        #60  <Field int ad.leftMargin>
	//  119  248:istore          4
					if(j1 + k1 + l3 + k3 / 2 > j2)
	//* 120  250:iload_3         
	//* 121  251:iload           4
	//* 122  253:iadd            
	//* 123  254:iload           13
	//* 124  256:iadd            
	//* 125  257:iload           12
	//* 126  259:iconst_2        
	//* 127  260:idiv            
	//* 128  261:iadd            
	//* 129  262:iload           8
	//* 130  264:icmple          272
						flag = true;
	//  131  267:iconst_1        
	//  132  268:istore_1        
					else
	//* 133  269:goto            274
						flag = false;
	//  134  272:iconst_0        
	//  135  273:istore_1        
					ad1.c = flag;
	//  136  274:aload           16
	//  137  276:iload_1         
	//  138  277:putfield        #54  <Field boolean android.support.v4.widget.ad.c>
					j2 = (int)((float)l3 * b);
	//  139  280:iload           13
	//  140  282:i2f             
	//  141  283:aload_0         
	//  142  284:getfield        #299 <Field float b>
	//  143  287:fmul            
	//  144  288:f2i             
	//  145  289:istore          8
					j1 = k1 + j2 + j1;
	//  146  291:iload           4
	//  147  293:iload           8
	//  148  295:iadd            
	//  149  296:iload_3         
	//  150  297:iadd            
	//  151  298:istore_3        
					b = (float)j2 / (float)c;
	//  152  299:aload_0         
	//  153  300:iload           8
	//  154  302:i2f             
	//  155  303:aload_0         
	//  156  304:getfield        #214 <Field int c>
	//  157  307:i2f             
	//  158  308:fdiv            
	//  159  309:putfield        #299 <Field float b>
					k1 = 0;
	//  160  312:iconst_0        
	//  161  313:istore          4
					break label0;
	//  162  315:goto            356
				}
				if(m)
	//* 163  318:aload_0         
	//* 164  319:getfield        #211 <Field boolean m>
	//* 165  322:ifeq            351
				{
					j1 = o;
	//  166  325:aload_0         
	//  167  326:getfield        #72  <Field int o>
	//  168  329:istore_3        
					if(j1 != 0)
	//* 169  330:iload_3         
	//* 170  331:ifeq            351
					{
						k1 = (int)((1.0F - b) * (float)j1);
	//  171  334:fconst_1        
	//  172  335:aload_0         
	//  173  336:getfield        #299 <Field float b>
	//  174  339:fsub            
	//  175  340:iload_3         
	//  176  341:i2f             
	//  177  342:fmul            
	//  178  343:f2i             
	//  179  344:istore          4
						j1 = i1;
	//  180  346:iload_2         
	//  181  347:istore_3        
						break label0;
	//  182  348:goto            356
					}
				}
				j1 = i1;
	//  183  351:iload_2         
	//  184  352:istore_3        
				k1 = 0;
	//  185  353:iconst_0        
	//  186  354:istore          4
			}
			int k2;
			if(flag1)
	//* 187  356:iload           14
	//* 188  358:ifeq            380
			{
				k2 = (l2 - j1) + k1;
	//  189  361:iload           9
	//  190  363:iload_3         
	//  191  364:isub            
	//  192  365:iload           4
	//  193  367:iadd            
	//  194  368:istore          8
				k1 = k2 - k3;
	//  195  370:iload           8
	//  196  372:iload           12
	//  197  374:isub            
	//  198  375:istore          4
			} else
	//* 199  377:goto            393
			{
				k1 = j1 - k1;
	//  200  380:iload_3         
	//  201  381:iload           4
	//  202  383:isub            
	//  203  384:istore          4
				k2 = k1 + k3;
	//  204  386:iload           4
	//  205  388:iload           12
	//  206  390:iadd            
	//  207  391:istore          8
			}
			view.layout(k1, j3, k2, view.getMeasuredHeight() + j3);
	//  208  393:aload           15
	//  209  395:iload           4
	//  210  397:iload           11
	//  211  399:iload           8
	//  212  401:aload           15
	//  213  403:invokevirtual   #451 <Method int View.getMeasuredHeight()>
	//  214  406:iload           11
	//  215  408:iadd            
	//  216  409:invokevirtual   #454 <Method void View.layout(int, int, int, int)>
			i1 += view.getWidth();
	//  217  412:iload_2         
	//  218  413:aload           15
	//  219  415:invokevirtual   #212 <Method int View.getWidth()>
	//  220  418:iadd            
	//  221  419:istore_2        
		}

	//  222  420:iload           7
	//  223  422:iconst_1        
	//  224  423:iadd            
	//  225  424:istore          7
	//* 226  426:goto            127
		if(s)
	//* 227  429:aload_0         
	//* 228  430:getfield        #139 <Field boolean s>
	//* 229  433:ifeq            533
		{
			if(m)
	//* 230  436:aload_0         
	//* 231  437:getfield        #211 <Field boolean m>
	//* 232  440:ifeq            493
			{
				if(o != 0)
	//* 233  443:aload_0         
	//* 234  444:getfield        #72  <Field int o>
	//* 235  447:ifeq            458
					a(b);
	//  236  450:aload_0         
	//  237  451:aload_0         
	//  238  452:getfield        #299 <Field float b>
	//  239  455:invokespecial   #456 <Method void a(float)>
				if(((ad)a.getLayoutParams()).c)
	//* 240  458:aload_0         
	//* 241  459:getfield        #44  <Field View a>
	//* 242  462:invokevirtual   #50  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 243  465:checkcast       #52  <Class ad>
	//* 244  468:getfield        #54  <Field boolean android.support.v4.widget.ad.c>
	//* 245  471:ifeq            522
					a(a, b, h);
	//  246  474:aload_0         
	//  247  475:aload_0         
	//  248  476:getfield        #44  <Field View a>
	//  249  479:aload_0         
	//  250  480:getfield        #299 <Field float b>
	//  251  483:aload_0         
	//  252  484:getfield        #384 <Field int h>
	//  253  487:invokespecial   #81  <Method void a(View, float, int)>
			} else
	//* 254  490:goto            522
			{
				for(i1 = 0; i1 < i3; i1++)
	//* 255  493:iconst_0        
	//* 256  494:istore_2        
	//* 257  495:iload_2         
	//* 258  496:iload           10
	//* 259  498:icmpge          522
					a(getChildAt(i1), 0.0F, h);
	//  260  501:aload_0         
	//  261  502:aload_0         
	//  262  503:iload_2         
	//  263  504:invokevirtual   #68  <Method View getChildAt(int)>
	//  264  507:fconst_0        
	//  265  508:aload_0         
	//  266  509:getfield        #384 <Field int h>
	//  267  512:invokespecial   #81  <Method void a(View, float, int)>

	//  268  515:iload_2         
	//  269  516:iconst_1        
	//  270  517:iadd            
	//  271  518:istore_2        
			}
	//* 272  519:goto            495
			a(a);
	//  273  522:aload_0         
	//  274  523:aload_0         
	//  275  524:getfield        #44  <Field View a>
	//  276  527:invokevirtual   #458 <Method void a(View)>
		}
	//* 277  530:goto            533
		s = false;
	//  278  533:aload_0         
	//  279  534:iconst_0        
	//  280  535:putfield        #139 <Field boolean s>
	//  281  538:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		int l2 = android.view.View.MeasureSpec.getMode(i1);
	//    0    0:iload_1         
	//    1    1:invokestatic    #466 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          8
		int k1 = android.view.View.MeasureSpec.getSize(i1);
	//    3    6:iload_1         
	//    4    7:invokestatic    #469 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore          5
		int l1 = android.view.View.MeasureSpec.getMode(j1);
	//    6   12:iload_2         
	//    7   13:invokestatic    #466 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   16:istore          6
		j1 = android.view.View.MeasureSpec.getSize(j1);
	//    9   18:iload_2         
	//   10   19:invokestatic    #469 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   11   22:istore_2        
		int k2;
		int i3;
		if(l2 != 0x40000000)
	//*  12   23:iload           8
	//*  13   25:ldc2            #470 <Int 0x40000000>
	//*  14   28:icmpeq          99
		{
			if(isInEditMode())
	//*  15   31:aload_0         
	//*  16   32:invokevirtual   #473 <Method boolean isInEditMode()>
	//*  17   35:ifeq            88
			{
				if(l2 == 0x80000000)
	//*  18   38:iload           8
	//*  19   40:ldc2            #474 <Int 0x80000000>
	//*  20   43:icmpne          59
				{
					k2 = k1;
	//   21   46:iload           5
	//   22   48:istore          7
					i3 = l1;
	//   23   50:iload           6
	//   24   52:istore          9
					i1 = j1;
	//   25   54:iload_2         
	//   26   55:istore_1        
				} else
	//*  27   56:goto            163
				{
					k2 = k1;
	//   28   59:iload           5
	//   29   61:istore          7
					i3 = l1;
	//   30   63:iload           6
	//   31   65:istore          9
					i1 = j1;
	//   32   67:iload_2         
	//   33   68:istore_1        
					if(l2 == 0)
	//*  34   69:iload           8
	//*  35   71:ifne            163
					{
						k2 = 300;
	//   36   74:sipush          300
	//   37   77:istore          7
						i3 = l1;
	//   38   79:iload           6
	//   39   81:istore          9
						i1 = j1;
	//   40   83:iload_2         
	//   41   84:istore_1        
					}
				}
			} else
	//*  42   85:goto            163
			{
				throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
	//   43   88:new             #476 <Class IllegalStateException>
	//   44   91:dup             
	//   45   92:ldc2            #478 <String "Width must have an exact value or MATCH_PARENT">
	//   46   95:invokespecial   #481 <Method void IllegalStateException(String)>
	//   47   98:athrow          
			}
		} else
		{
			k2 = k1;
	//   48   99:iload           5
	//   49  101:istore          7
			i3 = l1;
	//   50  103:iload           6
	//   51  105:istore          9
			i1 = j1;
	//   52  107:iload_2         
	//   53  108:istore_1        
			if(l1 == 0)
	//*  54  109:iload           6
	//*  55  111:ifne            163
				if(isInEditMode())
	//*  56  114:aload_0         
	//*  57  115:invokevirtual   #473 <Method boolean isInEditMode()>
	//*  58  118:ifeq            152
				{
					k2 = k1;
	//   59  121:iload           5
	//   60  123:istore          7
					i3 = l1;
	//   61  125:iload           6
	//   62  127:istore          9
					i1 = j1;
	//   63  129:iload_2         
	//   64  130:istore_1        
					if(l1 == 0)
	//*  65  131:iload           6
	//*  66  133:ifne            163
					{
						i3 = 0x80000000;
	//   67  136:ldc2            #474 <Int 0x80000000>
	//   68  139:istore          9
						i1 = 300;
	//   69  141:sipush          300
	//   70  144:istore_1        
						k2 = k1;
	//   71  145:iload           5
	//   72  147:istore          7
					}
				} else
	//*  73  149:goto            163
				{
					throw new IllegalStateException("Height must not be UNSPECIFIED");
	//   74  152:new             #476 <Class IllegalStateException>
	//   75  155:dup             
	//   76  156:ldc2            #483 <String "Height must not be UNSPECIFIED">
	//   77  159:invokespecial   #481 <Method void IllegalStateException(String)>
	//   78  162:athrow          
				}
		}
		if(i3 != 0x80000000)
	//*  79  163:iload           9
	//*  80  165:ldc2            #474 <Int 0x80000000>
	//*  81  168:icmpeq          203
		{
			if(i3 != 0x40000000)
	//*  82  171:iload           9
	//*  83  173:ldc2            #470 <Int 0x40000000>
	//*  84  176:icmpeq          186
			{
				i1 = 0;
	//   85  179:iconst_0        
	//   86  180:istore_1        
				j1 = 0;
	//   87  181:iconst_0        
	//   88  182:istore_2        
			} else
	//*  89  183:goto            217
			{
				i1 = i1 - getPaddingTop() - getPaddingBottom();
	//   90  186:iload_1         
	//   91  187:aload_0         
	//   92  188:invokevirtual   #180 <Method int getPaddingTop()>
	//   93  191:isub            
	//   94  192:aload_0         
	//   95  193:invokevirtual   #186 <Method int getPaddingBottom()>
	//   96  196:isub            
	//   97  197:istore_1        
				j1 = i1;
	//   98  198:iload_1         
	//   99  199:istore_2        
			}
		} else
	//* 100  200:goto            217
		{
			j1 = i1 - getPaddingTop() - getPaddingBottom();
	//  101  203:iload_1         
	//  102  204:aload_0         
	//  103  205:invokevirtual   #180 <Method int getPaddingTop()>
	//  104  208:isub            
	//  105  209:aload_0         
	//  106  210:invokevirtual   #186 <Method int getPaddingBottom()>
	//  107  213:isub            
	//  108  214:istore_2        
			i1 = 0;
	//  109  215:iconst_0        
	//  110  216:istore_1        
		}
		int i4 = k2 - getPaddingLeft() - getPaddingRight();
	//  111  217:iload           7
	//  112  219:aload_0         
	//  113  220:invokevirtual   #177 <Method int getPaddingLeft()>
	//  114  223:isub            
	//  115  224:aload_0         
	//  116  225:invokevirtual   #174 <Method int getPaddingRight()>
	//  117  228:isub            
	//  118  229:istore          11
		int j4 = getChildCount();
	//  119  231:aload_0         
	//  120  232:invokevirtual   #64  <Method int getChildCount()>
	//  121  235:istore          12
		if(j4 > 2)
	//* 122  237:iload           12
	//* 123  239:iconst_2        
	//* 124  240:icmple          252
			Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
	//  125  243:ldc1            #250 <String "SlidingPaneLayout">
	//  126  245:ldc2            #485 <String "onMeasure: More than two child views are not supported.">
	//  127  248:invokestatic    #488 <Method int Log.e(String, String)>
	//  128  251:pop             
		a = null;
	//  129  252:aload_0         
	//  130  253:aconst_null     
	//  131  254:putfield        #44  <Field View a>
		l2 = i4;
	//  132  257:iload           11
	//  133  259:istore          8
		int k3 = 0;
	//  134  261:iconst_0        
	//  135  262:istore          10
		boolean flag = false;
	//  136  264:iconst_0        
	//  137  265:istore          15
		float f2 = 0.0F;
	//  138  267:fconst_0        
	//  139  268:fstore          4
		for(k1 = i1; k3 < j4; k1 = i1)
	//* 140  270:iload_1         
	//* 141  271:istore          5
	//* 142  273:iload           10
	//* 143  275:iload           12
	//* 144  277:icmpge          607
		{
			float f1;
label0:
			{
				View view = getChildAt(k3);
	//  145  280:aload_0         
	//  146  281:iload           10
	//  147  283:invokevirtual   #68  <Method View getChildAt(int)>
	//  148  286:astore          17
				ad ad1 = (ad)view.getLayoutParams();
	//  149  288:aload           17
	//  150  290:invokevirtual   #50  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  151  293:checkcast       #52  <Class ad>
	//  152  296:astore          18
				if(view.getVisibility() == 8)
	//* 153  298:aload           17
	//* 154  300:invokevirtual   #165 <Method int View.getVisibility()>
	//* 155  303:bipush          8
	//* 156  305:icmpne          323
				{
					ad1.c = false;
	//  157  308:aload           18
	//  158  310:iconst_0        
	//  159  311:putfield        #54  <Field boolean android.support.v4.widget.ad.c>
					f1 = f2;
	//  160  314:fload           4
	//  161  316:fstore_3        
					i1 = k1;
	//  162  317:iload           5
	//  163  319:istore_1        
					break label0;
	//  164  320:goto            592
				}
				f1 = f2;
	//  165  323:fload           4
	//  166  325:fstore_3        
				if(ad1.a > 0.0F)
	//* 167  326:aload           18
	//* 168  328:getfield        #490 <Field float ad.a>
	//* 169  331:fconst_0        
	//* 170  332:fcmpl           
	//* 171  333:ifle            366
				{
					f2 += ad1.a;
	//  172  336:fload           4
	//  173  338:aload           18
	//  174  340:getfield        #490 <Field float ad.a>
	//  175  343:fadd            
	//  176  344:fstore          4
					f1 = f2;
	//  177  346:fload           4
	//  178  348:fstore_3        
					if(ad1.width == 0)
	//* 179  349:aload           18
	//* 180  351:getfield        #493 <Field int ad.width>
	//* 181  354:ifne            366
					{
						f1 = f2;
	//  182  357:fload           4
	//  183  359:fstore_3        
						i1 = k1;
	//  184  360:iload           5
	//  185  362:istore_1        
						break label0;
	//  186  363:goto            592
					}
				}
				i1 = ad1.leftMargin + ad1.rightMargin;
	//  187  366:aload           18
	//  188  368:getfield        #60  <Field int ad.leftMargin>
	//  189  371:aload           18
	//  190  373:getfield        #57  <Field int ad.rightMargin>
	//  191  376:iadd            
	//  192  377:istore_1        
				if(ad1.width == -2)
	//* 193  378:aload           18
	//* 194  380:getfield        #493 <Field int ad.width>
	//* 195  383:bipush          -2
	//* 196  385:icmpne          402
					i1 = android.view.View.MeasureSpec.makeMeasureSpec(i4 - i1, 0x80000000);
	//  197  388:iload           11
	//  198  390:iload_1         
	//  199  391:isub            
	//  200  392:ldc2            #474 <Int 0x80000000>
	//  201  395:invokestatic    #496 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  202  398:istore_1        
				else
	//* 203  399:goto            437
				if(ad1.width == -1)
	//* 204  402:aload           18
	//* 205  404:getfield        #493 <Field int ad.width>
	//* 206  407:iconst_m1       
	//* 207  408:icmpne          425
					i1 = android.view.View.MeasureSpec.makeMeasureSpec(i4 - i1, 0x40000000);
	//  208  411:iload           11
	//  209  413:iload_1         
	//  210  414:isub            
	//  211  415:ldc2            #470 <Int 0x40000000>
	//  212  418:invokestatic    #496 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  213  421:istore_1        
				else
	//* 214  422:goto            437
					i1 = android.view.View.MeasureSpec.makeMeasureSpec(ad1.width, 0x40000000);
	//  215  425:aload           18
	//  216  427:getfield        #493 <Field int ad.width>
	//  217  430:ldc2            #470 <Int 0x40000000>
	//  218  433:invokestatic    #496 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  219  436:istore_1        
				int i2;
				if(ad1.height == -2)
	//* 220  437:aload           18
	//* 221  439:getfield        #499 <Field int ad.height>
	//* 222  442:bipush          -2
	//* 223  444:icmpne          459
					i2 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x80000000);
	//  224  447:iload_2         
	//  225  448:ldc2            #474 <Int 0x80000000>
	//  226  451:invokestatic    #496 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  227  454:istore          6
				else
	//* 228  456:goto            493
				if(ad1.height == -1)
	//* 229  459:aload           18
	//* 230  461:getfield        #499 <Field int ad.height>
	//* 231  464:iconst_m1       
	//* 232  465:icmpne          480
					i2 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
	//  233  468:iload_2         
	//  234  469:ldc2            #470 <Int 0x40000000>
	//  235  472:invokestatic    #496 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  236  475:istore          6
				else
	//* 237  477:goto            493
					i2 = android.view.View.MeasureSpec.makeMeasureSpec(ad1.height, 0x40000000);
	//  238  480:aload           18
	//  239  482:getfield        #499 <Field int ad.height>
	//  240  485:ldc2            #470 <Int 0x40000000>
	//  241  488:invokestatic    #496 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  242  491:istore          6
				view.measure(i1, i2);
	//  243  493:aload           17
	//  244  495:iload_1         
	//  245  496:iload           6
	//  246  498:invokevirtual   #502 <Method void View.measure(int, int)>
				i2 = view.getMeasuredWidth();
	//  247  501:aload           17
	//  248  503:invokevirtual   #446 <Method int View.getMeasuredWidth()>
	//  249  506:istore          6
				int k4 = view.getMeasuredHeight();
	//  250  508:aload           17
	//  251  510:invokevirtual   #451 <Method int View.getMeasuredHeight()>
	//  252  513:istore          13
				i1 = k1;
	//  253  515:iload           5
	//  254  517:istore_1        
				if(i3 == 0x80000000)
	//* 255  518:iload           9
	//* 256  520:ldc2            #474 <Int 0x80000000>
	//* 257  523:icmpne          543
				{
					i1 = k1;
	//  258  526:iload           5
	//  259  528:istore_1        
					if(k4 > k1)
	//* 260  529:iload           13
	//* 261  531:iload           5
	//* 262  533:icmple          543
						i1 = Math.min(k4, j1);
	//  263  536:iload           13
	//  264  538:iload_2         
	//  265  539:invokestatic    #209 <Method int Math.min(int, int)>
	//  266  542:istore_1        
				}
				l2 -= i2;
	//  267  543:iload           8
	//  268  545:iload           6
	//  269  547:isub            
	//  270  548:istore          8
				boolean flag1;
				if(l2 < 0)
	//* 271  550:iload           8
	//* 272  552:ifge            561
					flag1 = true;
	//  273  555:iconst_1        
	//  274  556:istore          16
				else
	//* 275  558:goto            564
					flag1 = false;
	//  276  561:iconst_0        
	//  277  562:istore          16
				ad1.b = flag1;
	//  278  564:aload           18
	//  279  566:iload           16
	//  280  568:putfield        #334 <Field boolean ad.b>
				if(ad1.b)
	//* 281  571:aload           18
	//* 282  573:getfield        #334 <Field boolean ad.b>
	//* 283  576:ifeq            585
					a = view;
	//  284  579:aload_0         
	//  285  580:aload           17
	//  286  582:putfield        #44  <Field View a>
				flag = flag1 | flag;
	//  287  585:iload           16
	//  288  587:iload           15
	//  289  589:ior             
	//  290  590:istore          15
			}
			k3++;
	//  291  592:iload           10
	//  292  594:iconst_1        
	//  293  595:iadd            
	//  294  596:istore          10
			f2 = f1;
	//  295  598:fload_3         
	//  296  599:fstore          4
		}

	//  297  601:iload_1         
	//  298  602:istore          5
	//* 299  604:goto            273
		if(flag || f2 > 0.0F)
	//* 300  607:iload           15
	//* 301  609:ifne            619
	//* 302  612:fload           4
	//* 303  614:fconst_0        
	//* 304  615:fcmpl           
	//* 305  616:ifle            1038
		{
			int j2 = i4 - l;
	//  306  619:iload           11
	//  307  621:aload_0         
	//  308  622:getfield        #448 <Field int l>
	//  309  625:isub            
	//  310  626:istore          6
			for(int j3 = 0; j3 < j4; j3++)
	//* 311  628:iconst_0        
	//* 312  629:istore          9
	//* 313  631:iload           9
	//* 314  633:iload           12
	//* 315  635:icmpge          1038
			{
				View view1 = getChildAt(j3);
	//  316  638:aload_0         
	//  317  639:iload           9
	//  318  641:invokevirtual   #68  <Method View getChildAt(int)>
	//  319  644:astore          17
				if(view1.getVisibility() == 8)
	//* 320  646:aload           17
	//* 321  648:invokevirtual   #165 <Method int View.getVisibility()>
	//* 322  651:bipush          8
	//* 323  653:icmpne          659
					continue;
	//  324  656:goto            1029
				ad ad2 = (ad)view1.getLayoutParams();
	//  325  659:aload           17
	//  326  661:invokevirtual   #50  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  327  664:checkcast       #52  <Class ad>
	//  328  667:astore          18
				if(view1.getVisibility() == 8)
	//* 329  669:aload           17
	//* 330  671:invokevirtual   #165 <Method int View.getVisibility()>
	//* 331  674:bipush          8
	//* 332  676:icmpne          682
					continue;
	//  333  679:goto            1029
				if(ad2.width == 0 && ad2.a > 0.0F)
	//* 334  682:aload           18
	//* 335  684:getfield        #493 <Field int ad.width>
	//* 336  687:ifne            705
	//* 337  690:aload           18
	//* 338  692:getfield        #490 <Field float ad.a>
	//* 339  695:fconst_0        
	//* 340  696:fcmpl           
	//* 341  697:ifle            705
					i1 = 1;
	//  342  700:iconst_1        
	//  343  701:istore_1        
				else
	//* 344  702:goto            707
					i1 = 0;
	//  345  705:iconst_0        
	//  346  706:istore_1        
				int l3;
				if(i1 != 0)
	//* 347  707:iload_1         
	//* 348  708:ifeq            717
					l3 = 0;
	//  349  711:iconst_0        
	//  350  712:istore          10
				else
	//* 351  714:goto            724
					l3 = view1.getMeasuredWidth();
	//  352  717:aload           17
	//  353  719:invokevirtual   #446 <Method int View.getMeasuredWidth()>
	//  354  722:istore          10
				if(flag && view1 != a)
	//* 355  724:iload           15
	//* 356  726:ifeq            855
	//* 357  729:aload           17
	//* 358  731:aload_0         
	//* 359  732:getfield        #44  <Field View a>
	//* 360  735:if_acmpeq       855
				{
					if(ad2.width >= 0 || l3 <= j2 && ad2.a <= 0.0F)
						continue;
	//  361  738:aload           18
	//  362  740:getfield        #493 <Field int ad.width>
	//  363  743:ifge            852
	//  364  746:iload           10
	//  365  748:iload           6
	//  366  750:icmpgt          763
	//  367  753:aload           18
	//  368  755:getfield        #490 <Field float ad.a>
	//  369  758:fconst_0        
	//  370  759:fcmpl           
	//  371  760:ifle            852
					if(i1 != 0)
	//* 372  763:iload_1         
	//* 373  764:ifeq            823
					{
						if(ad2.height == -2)
	//* 374  767:aload           18
	//* 375  769:getfield        #499 <Field int ad.height>
	//* 376  772:bipush          -2
	//* 377  774:icmpne          788
							i1 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x80000000);
	//  378  777:iload_2         
	//  379  778:ldc2            #474 <Int 0x80000000>
	//  380  781:invokestatic    #496 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  381  784:istore_1        
						else
	//* 382  785:goto            835
						if(ad2.height == -1)
	//* 383  788:aload           18
	//* 384  790:getfield        #499 <Field int ad.height>
	//* 385  793:iconst_m1       
	//* 386  794:icmpne          808
							i1 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
	//  387  797:iload_2         
	//  388  798:ldc2            #470 <Int 0x40000000>
	//  389  801:invokestatic    #496 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  390  804:istore_1        
						else
	//* 391  805:goto            835
							i1 = android.view.View.MeasureSpec.makeMeasureSpec(ad2.height, 0x40000000);
	//  392  808:aload           18
	//  393  810:getfield        #499 <Field int ad.height>
	//  394  813:ldc2            #470 <Int 0x40000000>
	//  395  816:invokestatic    #496 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  396  819:istore_1        
					} else
	//* 397  820:goto            835
					{
						i1 = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
	//  398  823:aload           17
	//  399  825:invokevirtual   #451 <Method int View.getMeasuredHeight()>
	//  400  828:ldc2            #470 <Int 0x40000000>
	//  401  831:invokestatic    #496 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  402  834:istore_1        
					}
					view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x40000000), i1);
	//  403  835:aload           17
	//  404  837:iload           6
	//  405  839:ldc2            #470 <Int 0x40000000>
	//  406  842:invokestatic    #496 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  407  845:iload_1         
	//  408  846:invokevirtual   #502 <Method void View.measure(int, int)>
					continue;
	//  409  849:goto            1029
				}
	//* 410  852:goto            1029
				if(ad2.a <= 0.0F)
					continue;
	//  411  855:aload           18
	//  412  857:getfield        #490 <Field float ad.a>
	//  413  860:fconst_0        
	//  414  861:fcmpl           
	//  415  862:ifle            1029
				if(ad2.width == 0)
	//* 416  865:aload           18
	//* 417  867:getfield        #493 <Field int ad.width>
	//* 418  870:ifne            929
				{
					if(ad2.height == -2)
	//* 419  873:aload           18
	//* 420  875:getfield        #499 <Field int ad.height>
	//* 421  878:bipush          -2
	//* 422  880:icmpne          894
						i1 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x80000000);
	//  423  883:iload_2         
	//  424  884:ldc2            #474 <Int 0x80000000>
	//  425  887:invokestatic    #496 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  426  890:istore_1        
					else
	//* 427  891:goto            941
					if(ad2.height == -1)
	//* 428  894:aload           18
	//* 429  896:getfield        #499 <Field int ad.height>
	//* 430  899:iconst_m1       
	//* 431  900:icmpne          914
						i1 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
	//  432  903:iload_2         
	//  433  904:ldc2            #470 <Int 0x40000000>
	//  434  907:invokestatic    #496 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  435  910:istore_1        
					else
	//* 436  911:goto            941
						i1 = android.view.View.MeasureSpec.makeMeasureSpec(ad2.height, 0x40000000);
	//  437  914:aload           18
	//  438  916:getfield        #499 <Field int ad.height>
	//  439  919:ldc2            #470 <Int 0x40000000>
	//  440  922:invokestatic    #496 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  441  925:istore_1        
				} else
	//* 442  926:goto            941
				{
					i1 = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
	//  443  929:aload           17
	//  444  931:invokevirtual   #451 <Method int View.getMeasuredHeight()>
	//  445  934:ldc2            #470 <Int 0x40000000>
	//  446  937:invokestatic    #496 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  447  940:istore_1        
				}
				if(flag)
	//* 448  941:iload           15
	//* 449  943:ifeq            990
				{
					int l4 = i4 - (ad2.leftMargin + ad2.rightMargin);
	//  450  946:iload           11
	//  451  948:aload           18
	//  452  950:getfield        #60  <Field int ad.leftMargin>
	//  453  953:aload           18
	//  454  955:getfield        #57  <Field int ad.rightMargin>
	//  455  958:iadd            
	//  456  959:isub            
	//  457  960:istore          13
					int j5 = android.view.View.MeasureSpec.makeMeasureSpec(l4, 0x40000000);
	//  458  962:iload           13
	//  459  964:ldc2            #470 <Int 0x40000000>
	//  460  967:invokestatic    #496 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  461  970:istore          14
					if(l3 != l4)
	//* 462  972:iload           10
	//* 463  974:iload           13
	//* 464  976:icmpeq          987
						view1.measure(j5, i1);
	//  465  979:aload           17
	//  466  981:iload           14
	//  467  983:iload_1         
	//  468  984:invokevirtual   #502 <Method void View.measure(int, int)>
				} else
	//* 469  987:goto            1029
				{
					int i5 = Math.max(0, l2);
	//  470  990:iconst_0        
	//  471  991:iload           8
	//  472  993:invokestatic    #206 <Method int Math.max(int, int)>
	//  473  996:istore          13
					view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(l3 + (int)((ad2.a * (float)i5) / f2), 0x40000000), i1);
	//  474  998:aload           17
	//  475 1000:iload           10
	//  476 1002:aload           18
	//  477 1004:getfield        #490 <Field float ad.a>
	//  478 1007:iload           13
	//  479 1009:i2f             
	//  480 1010:fmul            
	//  481 1011:fload           4
	//  482 1013:fdiv            
	//  483 1014:f2i             
	//  484 1015:iadd            
	//  485 1016:ldc2            #470 <Int 0x40000000>
	//  486 1019:invokestatic    #496 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  487 1022:iload_1         
	//  488 1023:invokevirtual   #502 <Method void View.measure(int, int)>
				}
			}

	//  489 1026:goto            1029
	//  490 1029:iload           9
	//  491 1031:iconst_1        
	//  492 1032:iadd            
	//  493 1033:istore          9
		}
	//* 494 1035:goto            631
		setMeasuredDimension(k2, k1 + getPaddingTop() + getPaddingBottom());
	//  495 1038:aload_0         
	//  496 1039:iload           7
	//  497 1041:iload           5
	//  498 1043:aload_0         
	//  499 1044:invokevirtual   #180 <Method int getPaddingTop()>
	//  500 1047:iadd            
	//  501 1048:aload_0         
	//  502 1049:invokevirtual   #186 <Method int getPaddingBottom()>
	//  503 1052:iadd            
	//  504 1053:invokevirtual   #505 <Method void setMeasuredDimension(int, int)>
		m = flag;
	//  505 1056:aload_0         
	//  506 1057:iload           15
	//  507 1059:putfield        #211 <Field boolean m>
		if(e.a() != 0 && !flag)
	//* 508 1062:aload_0         
	//* 509 1063:getfield        #216 <Field al e>
	//* 510 1066:invokevirtual   #507 <Method int al.a()>
	//* 511 1069:ifeq            1084
	//* 512 1072:iload           15
	//* 513 1074:ifne            1084
			e.f();
	//  514 1077:aload_0         
	//  515 1078:getfield        #216 <Field al e>
	//  516 1081:invokevirtual   #309 <Method void al.f()>
	//  517 1084:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #511 <Class SlidingPaneLayout$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #513 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #511 <Class SlidingPaneLayout$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #517 <Method Parcelable SlidingPaneLayout$SavedState.getSuperState()>
	//   13   23:invokespecial   #513 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		if(((SavedState) (parcelable)).a)
	//*  14   26:aload_1         
	//*  15   27:getfield        #519 <Field boolean SlidingPaneLayout$SavedState.a>
	//*  16   30:ifeq            41
			b();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #521 <Method boolean b()>
	//   19   37:pop             
		else
	//*  20   38:goto            46
			c();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #523 <Method boolean c()>
	//   23   45:pop             
		f = ((SavedState) (parcelable)).a;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getfield        #519 <Field boolean SlidingPaneLayout$SavedState.a>
	//   27   51:putfield        #144 <Field boolean f>
	//   28   54:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #511 <Class SlidingPaneLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #526 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #528 <Method void SlidingPaneLayout$SavedState(Parcelable)>
	//    5   11:astore_2        
		boolean flag;
		if(e())
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #530 <Method boolean e()>
	//*   8   16:ifeq            27
			flag = d();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #532 <Method boolean d()>
	//   11   23:istore_1        
		else
	//*  12   24:goto            32
			flag = f;
	//   13   27:aload_0         
	//   14   28:getfield        #144 <Field boolean f>
	//   15   31:istore_1        
		savedstate.a = flag;
	//   16   32:aload_2         
	//   17   33:iload_1         
	//   18   34:putfield        #519 <Field boolean SlidingPaneLayout$SavedState.a>
		return ((Parcelable) (savedstate));
	//   19   37:aload_2         
	//   20   38:areturn         
	}

	protected void onSizeChanged(int i1, int j1, int k1, int l1)
	{
		super.onSizeChanged(i1, j1, k1, l1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #535 <Method void ViewGroup.onSizeChanged(int, int, int, int)>
		if(i1 != k1)
	//*   6    9:iload_1         
	//*   7   10:iload_3         
	//*   8   11:icmpeq          19
			s = true;
	//    9   14:aload_0         
	//   10   15:iconst_1        
	//   11   16:putfield        #139 <Field boolean s>
	//   12   19:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(!m)
	//*   0    0:aload_0         
	//*   1    1:getfield        #211 <Field boolean m>
	//*   2    4:ifne            13
			return super.onTouchEvent(motionevent);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #538 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//    6   12:ireturn         
		e.b(motionevent);
	//    7   13:aload_0         
	//    8   14:getfield        #216 <Field al e>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #541 <Method void al.b(MotionEvent)>
		switch(motionevent.getActionMasked())
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #410 <Method int MotionEvent.getActionMasked()>
		{
	//*  13   25:tableswitch     0 1: default 48
	//	               0 147
	//	               1 50
		default:
			return true;
	//   14   48:iconst_1        
	//   15   49:ireturn         

		case 1: // '\001'
			if(c(a))
	//*  16   50:aload_0         
	//*  17   51:aload_0         
	//*  18   52:getfield        #44  <Field View a>
	//*  19   55:invokevirtual   #435 <Method boolean c(View)>
	//*  20   58:ifeq            167
			{
				float f1 = motionevent.getX();
	//   21   61:aload_1         
	//   22   62:invokevirtual   #414 <Method float MotionEvent.getX()>
	//   23   65:fstore_2        
				float f3 = motionevent.getY();
	//   24   66:aload_1         
	//   25   67:invokevirtual   #417 <Method float MotionEvent.getY()>
	//   26   70:fstore_3        
				float f5 = f1 - p;
	//   27   71:fload_2         
	//   28   72:aload_0         
	//   29   73:getfield        #423 <Field float p>
	//   30   76:fsub            
	//   31   77:fstore          4
				float f6 = f3 - q;
	//   32   79:fload_3         
	//   33   80:aload_0         
	//   34   81:getfield        #429 <Field float q>
	//   35   84:fsub            
	//   36   85:fstore          5
				int i1 = e.d();
	//   37   87:aload_0         
	//   38   88:getfield        #216 <Field al e>
	//   39   91:invokevirtual   #431 <Method int al.d()>
	//   40   94:istore          6
				if(f5 * f5 + f6 * f6 < (float)(i1 * i1) && e.b(a, (int)f1, (int)f3))
	//*  41   96:fload           4
	//*  42   98:fload           4
	//*  43  100:fmul            
	//*  44  101:fload           5
	//*  45  103:fload           5
	//*  46  105:fmul            
	//*  47  106:fadd            
	//*  48  107:iload           6
	//*  49  109:iload           6
	//*  50  111:imul            
	//*  51  112:i2f             
	//*  52  113:fcmpg           
	//*  53  114:ifge            167
	//*  54  117:aload_0         
	//*  55  118:getfield        #216 <Field al e>
	//*  56  121:aload_0         
	//*  57  122:getfield        #44  <Field View a>
	//*  58  125:fload_2         
	//*  59  126:f2i             
	//*  60  127:fload_3         
	//*  61  128:f2i             
	//*  62  129:invokevirtual   #419 <Method boolean al.b(View, int, int)>
	//*  63  132:ifeq            167
				{
					a(a, 0);
	//   64  135:aload_0         
	//   65  136:aload_0         
	//   66  137:getfield        #44  <Field View a>
	//   67  140:iconst_0        
	//   68  141:invokespecial   #297 <Method boolean a(View, int)>
	//   69  144:pop             
					return true;
	//   70  145:iconst_1        
	//   71  146:ireturn         
				}
			}
			break;

		case 0: // '\0'
			float f2 = motionevent.getX();
	//   72  147:aload_1         
	//   73  148:invokevirtual   #414 <Method float MotionEvent.getX()>
	//   74  151:fstore_2        
			float f4 = motionevent.getY();
	//   75  152:aload_1         
	//   76  153:invokevirtual   #417 <Method float MotionEvent.getY()>
	//   77  156:fstore_3        
			p = f2;
	//   78  157:aload_0         
	//   79  158:fload_2         
	//   80  159:putfield        #423 <Field float p>
			q = f4;
	//   81  162:aload_0         
	//   82  163:fload_3         
	//   83  164:putfield        #429 <Field float q>
			break;
		}
		return true;
	//   84  167:iconst_1        
	//   85  168:ireturn         
	}

	public void requestChildFocus(View view, View view1)
	{
		super.requestChildFocus(view, view1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #545 <Method void ViewGroup.requestChildFocus(View, View)>
		if(!isInTouchMode() && !m)
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #548 <Method boolean isInTouchMode()>
	//*   6   10:ifne            40
	//*   7   13:aload_0         
	//*   8   14:getfield        #211 <Field boolean m>
	//*   9   17:ifne            40
		{
			boolean flag;
			if(view == a)
	//*  10   20:aload_1         
	//*  11   21:aload_0         
	//*  12   22:getfield        #44  <Field View a>
	//*  13   25:if_acmpne       33
				flag = true;
	//   14   28:iconst_1        
	//   15   29:istore_3        
			else
	//*  16   30:goto            35
				flag = false;
	//   17   33:iconst_0        
	//   18   34:istore_3        
			f = flag;
	//   19   35:aload_0         
	//   20   36:iload_3         
	//   21   37:putfield        #144 <Field boolean f>
		}
	//   22   40:return          
	}

	public void setCoveredFadeColor(int i1)
	{
		i = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #78  <Field int i>
	//    3    5:return          
	}

	public void setPanelSlideListener(ae ae)
	{
		r = ae;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #553 <Field ae r>
	//    3    5:return          
	}

	public void setParallaxDistance(int i1)
	{
		o = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #72  <Field int o>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #557 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setShadowDrawable(Drawable drawable)
	{
		setShadowDrawableLeft(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #563 <Method void setShadowDrawableLeft(Drawable)>
	//    3    5:return          
	}

	public void setShadowDrawableLeft(Drawable drawable)
	{
		j = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #317 <Field Drawable j>
	//    3    5:return          
	}

	public void setShadowDrawableRight(Drawable drawable)
	{
		k = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #315 <Field Drawable k>
	//    3    5:return          
	}

	public void setShadowResource(int i1)
	{
		setShadowDrawable(getResources().getDrawable(i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #570 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #576 <Method Drawable Resources.getDrawable(int)>
	//    5    9:invokevirtual   #578 <Method void setShadowDrawable(Drawable)>
	//    6   12:return          
	}

	public void setShadowResourceLeft(int i1)
	{
		setShadowDrawableLeft(android.support.v4.a.c.a(getContext(), i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #367 <Method android.content.Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #584 <Method Drawable c.a(android.content.Context, int)>
	//    5    9:invokevirtual   #563 <Method void setShadowDrawableLeft(Drawable)>
	//    6   12:return          
	}

	public void setShadowResourceRight(int i1)
	{
		setShadowDrawableRight(android.support.v4.a.c.a(getContext(), i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #367 <Method android.content.Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #584 <Method Drawable c.a(android.content.Context, int)>
	//    5    9:invokevirtual   #587 <Method void setShadowDrawableRight(Drawable)>
	//    6   12:return          
	}

	public void setSliderFadeColor(int i1)
	{
		h = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #384 <Field int h>
	//    3    5:return          
	}

	View a;
	float b;
	int c;
	boolean d;
	final al e;
	boolean f;
	final ArrayList g;
	private int h;
	private int i;
	private Drawable j;
	private Drawable k;
	private final int l;
	private boolean m;
	private float n;
	private int o;
	private float p;
	private float q;
	private ae r;
	private boolean s;
	private final Rect t;
	private Method u;
	private Field v;
	private boolean w;

	private class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i1)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #36  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #38  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #43  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new af();
		boolean a;

		static 
		{
		//    0    0:new             #12  <Class af>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void af()>
		//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #21  <Method void AbsSavedState(Parcel, ClassLoader)>
			boolean flag;
			if(parcel.readInt() != 0)
		//*   4    6:aload_1         
		//*   5    7:invokevirtual   #27  <Method int Parcel.readInt()>
		//*   6   10:ifeq            18
				flag = true;
		//    7   13:iconst_1        
		//    8   14:istore_3        
			else
		//*   9   15:goto            20
				flag = false;
		//   10   18:iconst_0        
		//   11   19:istore_3        
			a = flag;
		//   12   20:aload_0         
		//   13   21:iload_3         
		//   14   22:putfield        #29  <Field boolean a>
		//   15   25:return          
		}

		SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #32  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

}
