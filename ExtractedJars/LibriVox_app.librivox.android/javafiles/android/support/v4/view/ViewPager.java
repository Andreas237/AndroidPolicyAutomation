// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.a.c;
import android.util.AttributeSet;
import android.util.Log;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.util.*;

// Referenced classes of package android.support.v4.view:
//			ai, aj, as, al, 
//			z, ac, ao, ak, 
//			am, ap, aq, an

public class ViewPager extends ViewGroup
{

	private int a(int i1, float f1, int j1, int k1)
	{
		if(Math.abs(k1) > O && Math.abs(j1) > M)
	//*   0    0:iload           4
	//*   1    2:invokestatic    #114 <Method int Math.abs(int)>
	//*   2    5:aload_0         
	//*   3    6:getfield        #116 <Field int O>
	//*   4    9:icmple          37
	//*   5   12:iload_3         
	//*   6   13:invokestatic    #114 <Method int Math.abs(int)>
	//*   7   16:aload_0         
	//*   8   17:getfield        #118 <Field int M>
	//*   9   20:icmple          37
		{
			if(j1 <= 0)
	//*  10   23:iload_3         
	//*  11   24:ifle            30
	//*  12   27:goto            64
				i1++;
	//   13   30:iload_1         
	//   14   31:iconst_1        
	//   15   32:iadd            
	//   16   33:istore_1        
		} else
	//*  17   34:goto            64
		{
			float f2;
			if(i1 >= c)
	//*  18   37:iload_1         
	//*  19   38:aload_0         
	//*  20   39:getfield        #120 <Field int c>
	//*  21   42:icmplt          52
				f2 = 0.4F;
	//   22   45:ldc1            #121 <Float 0.4F>
	//   23   47:fstore          5
			else
	//*  24   49:goto            56
				f2 = 0.6F;
	//   25   52:ldc1            #122 <Float 0.6F>
	//   26   54:fstore          5
			i1 += (int)(f1 + f2);
	//   27   56:iload_1         
	//   28   57:fload_2         
	//   29   58:fload           5
	//   30   60:fadd            
	//   31   61:f2i             
	//   32   62:iadd            
	//   33   63:istore_1        
		}
		j1 = i1;
	//   34   64:iload_1         
	//   35   65:istore_3        
		if(g.size() > 0)
	//*  36   66:aload_0         
	//*  37   67:getfield        #124 <Field ArrayList g>
	//*  38   70:invokevirtual   #130 <Method int ArrayList.size()>
	//*  39   73:ifle            130
		{
			al al1 = (al)g.get(0);
	//   40   76:aload_0         
	//   41   77:getfield        #124 <Field ArrayList g>
	//   42   80:iconst_0        
	//   43   81:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   44   84:checkcast       #136 <Class al>
	//   45   87:astore          6
			Object obj = ((Object) (g));
	//   46   89:aload_0         
	//   47   90:getfield        #124 <Field ArrayList g>
	//   48   93:astore          7
			obj = ((Object) ((al)((ArrayList) (obj)).get(((ArrayList) (obj)).size() - 1)));
	//   49   95:aload           7
	//   50   97:aload           7
	//   51   99:invokevirtual   #130 <Method int ArrayList.size()>
	//   52  102:iconst_1        
	//   53  103:isub            
	//   54  104:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   55  107:checkcast       #136 <Class al>
	//   56  110:astore          7
			j1 = Math.max(al1.b, Math.min(i1, ((al) (obj)).b));
	//   57  112:aload           6
	//   58  114:getfield        #138 <Field int al.b>
	//   59  117:iload_1         
	//   60  118:aload           7
	//   61  120:getfield        #138 <Field int al.b>
	//   62  123:invokestatic    #142 <Method int Math.min(int, int)>
	//   63  126:invokestatic    #145 <Method int Math.max(int, int)>
	//   64  129:istore_3        
		}
		return j1;
	//   65  130:iload_3         
	//   66  131:ireturn         
	}

	private Rect a(Rect rect, View view)
	{
		Rect rect1 = rect;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(rect == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       14
			rect1 = new Rect();
	//    4    6:new             #148 <Class Rect>
	//    5    9:dup             
	//    6   10:invokespecial   #149 <Method void Rect()>
	//    7   13:astore_3        
		if(view == null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       28
		{
			rect1.set(0, 0, 0, 0);
	//   10   18:aload_3         
	//   11   19:iconst_0        
	//   12   20:iconst_0        
	//   13   21:iconst_0        
	//   14   22:iconst_0        
	//   15   23:invokevirtual   #153 <Method void Rect.set(int, int, int, int)>
			return rect1;
	//   16   26:aload_3         
	//   17   27:areturn         
		}
		rect1.left = view.getLeft();
	//   18   28:aload_3         
	//   19   29:aload_2         
	//   20   30:invokevirtual   #158 <Method int View.getLeft()>
	//   21   33:putfield        #161 <Field int Rect.left>
		rect1.right = view.getRight();
	//   22   36:aload_3         
	//   23   37:aload_2         
	//   24   38:invokevirtual   #164 <Method int View.getRight()>
	//   25   41:putfield        #167 <Field int Rect.right>
		rect1.top = view.getTop();
	//   26   44:aload_3         
	//   27   45:aload_2         
	//   28   46:invokevirtual   #170 <Method int View.getTop()>
	//   29   49:putfield        #173 <Field int Rect.top>
		rect1.bottom = view.getBottom();
	//   30   52:aload_3         
	//   31   53:aload_2         
	//   32   54:invokevirtual   #176 <Method int View.getBottom()>
	//   33   57:putfield        #179 <Field int Rect.bottom>
		for(rect = ((Rect) (view.getParent())); (rect instanceof ViewGroup) && rect != this; rect = ((Rect) (((ViewGroup) (rect)).getParent())))
	//*  34   60:aload_2         
	//*  35   61:invokevirtual   #183 <Method ViewParent View.getParent()>
	//*  36   64:astore_1        
	//*  37   65:aload_1         
	//*  38   66:instanceof      #4   <Class ViewGroup>
	//*  39   69:ifeq            142
	//*  40   72:aload_1         
	//*  41   73:aload_0         
	//*  42   74:if_acmpeq       142
		{
			rect = ((Rect) ((ViewGroup)rect));
	//   43   77:aload_1         
	//   44   78:checkcast       #4   <Class ViewGroup>
	//   45   81:astore_1        
			rect1.left = rect1.left + ((ViewGroup) (rect)).getLeft();
	//   46   82:aload_3         
	//   47   83:aload_3         
	//   48   84:getfield        #161 <Field int Rect.left>
	//   49   87:aload_1         
	//   50   88:invokevirtual   #184 <Method int ViewGroup.getLeft()>
	//   51   91:iadd            
	//   52   92:putfield        #161 <Field int Rect.left>
			rect1.right = rect1.right + ((ViewGroup) (rect)).getRight();
	//   53   95:aload_3         
	//   54   96:aload_3         
	//   55   97:getfield        #167 <Field int Rect.right>
	//   56  100:aload_1         
	//   57  101:invokevirtual   #185 <Method int ViewGroup.getRight()>
	//   58  104:iadd            
	//   59  105:putfield        #167 <Field int Rect.right>
			rect1.top = rect1.top + ((ViewGroup) (rect)).getTop();
	//   60  108:aload_3         
	//   61  109:aload_3         
	//   62  110:getfield        #173 <Field int Rect.top>
	//   63  113:aload_1         
	//   64  114:invokevirtual   #186 <Method int ViewGroup.getTop()>
	//   65  117:iadd            
	//   66  118:putfield        #173 <Field int Rect.top>
			rect1.bottom = rect1.bottom + ((ViewGroup) (rect)).getBottom();
	//   67  121:aload_3         
	//   68  122:aload_3         
	//   69  123:getfield        #179 <Field int Rect.bottom>
	//   70  126:aload_1         
	//   71  127:invokevirtual   #187 <Method int ViewGroup.getBottom()>
	//   72  130:iadd            
	//   73  131:putfield        #179 <Field int Rect.bottom>
		}

	//   74  134:aload_1         
	//   75  135:invokevirtual   #188 <Method ViewParent ViewGroup.getParent()>
	//   76  138:astore_1        
	//*  77  139:goto            65
		return rect1;
	//   78  142:aload_3         
	//   79  143:areturn         
	}

	private void a(int i1, int j1, int k1, int l1)
	{
		if(j1 > 0 && !g.isEmpty())
	//*   0    0:iload_2         
	//*   1    1:ifle            103
	//*   2    4:aload_0         
	//*   3    5:getfield        #124 <Field ArrayList g>
	//*   4    8:invokevirtual   #192 <Method boolean ArrayList.isEmpty()>
	//*   5   11:ifne            103
			if(!m.isFinished())
	//*   6   14:aload_0         
	//*   7   15:getfield        #194 <Field Scroller m>
	//*   8   18:invokevirtual   #199 <Method boolean Scroller.isFinished()>
	//*   9   21:ifne            41
			{
				m.setFinalX(getCurrentItem() * getClientWidth());
	//   10   24:aload_0         
	//   11   25:getfield        #194 <Field Scroller m>
	//   12   28:aload_0         
	//   13   29:invokevirtual   #202 <Method int getCurrentItem()>
	//   14   32:aload_0         
	//   15   33:invokespecial   #205 <Method int getClientWidth()>
	//   16   36:imul            
	//   17   37:invokevirtual   #209 <Method void Scroller.setFinalX(int)>
				return;
	//   18   40:return          
			} else
			{
				int i2 = getPaddingLeft();
	//   19   41:aload_0         
	//   20   42:invokevirtual   #212 <Method int getPaddingLeft()>
	//   21   45:istore          6
				int j2 = getPaddingRight();
	//   22   47:aload_0         
	//   23   48:invokevirtual   #215 <Method int getPaddingRight()>
	//   24   51:istore          7
				int k2 = getPaddingLeft();
	//   25   53:aload_0         
	//   26   54:invokevirtual   #212 <Method int getPaddingLeft()>
	//   27   57:istore          8
				int l2 = getPaddingRight();
	//   28   59:aload_0         
	//   29   60:invokevirtual   #215 <Method int getPaddingRight()>
	//   30   63:istore          9
				scrollTo((int)(((float)getScrollX() / (float)((j1 - k2 - l2) + l1)) * (float)((i1 - i2 - j2) + k1)), getScrollY());
	//   31   65:aload_0         
	//   32   66:aload_0         
	//   33   67:invokevirtual   #218 <Method int getScrollX()>
	//   34   70:i2f             
	//   35   71:iload_2         
	//   36   72:iload           8
	//   37   74:isub            
	//   38   75:iload           9
	//   39   77:isub            
	//   40   78:iload           4
	//   41   80:iadd            
	//   42   81:i2f             
	//   43   82:fdiv            
	//   44   83:iload_1         
	//   45   84:iload           6
	//   46   86:isub            
	//   47   87:iload           7
	//   48   89:isub            
	//   49   90:iload_3         
	//   50   91:iadd            
	//   51   92:i2f             
	//   52   93:fmul            
	//   53   94:f2i             
	//   54   95:aload_0         
	//   55   96:invokevirtual   #221 <Method int getScrollY()>
	//   56   99:invokevirtual   #225 <Method void scrollTo(int, int)>
				return;
	//   57  102:return          
			}
		al al1 = b(c);
	//   58  103:aload_0         
	//   59  104:aload_0         
	//   60  105:getfield        #120 <Field int c>
	//   61  108:invokevirtual   #228 <Method al b(int)>
	//   62  111:astore          10
		float f1;
		if(al1 != null)
	//*  63  113:aload           10
	//*  64  115:ifnull          135
			f1 = Math.min(al1.e, u);
	//   65  118:aload           10
	//   66  120:getfield        #230 <Field float al.e>
	//   67  123:aload_0         
	//   68  124:getfield        #232 <Field float u>
	//   69  127:invokestatic    #235 <Method float Math.min(float, float)>
	//   70  130:fstore          5
		else
	//*  71  132:goto            138
			f1 = 0.0F;
	//   72  135:fconst_0        
	//   73  136:fstore          5
		i1 = (int)(f1 * (float)(i1 - getPaddingLeft() - getPaddingRight()));
	//   74  138:fload           5
	//   75  140:iload_1         
	//   76  141:aload_0         
	//   77  142:invokevirtual   #212 <Method int getPaddingLeft()>
	//   78  145:isub            
	//   79  146:aload_0         
	//   80  147:invokevirtual   #215 <Method int getPaddingRight()>
	//   81  150:isub            
	//   82  151:i2f             
	//   83  152:fmul            
	//   84  153:f2i             
	//   85  154:istore_1        
		if(i1 != getScrollX())
	//*  86  155:iload_1         
	//*  87  156:aload_0         
	//*  88  157:invokevirtual   #218 <Method int getScrollX()>
	//*  89  160:icmpeq          177
		{
			a(false);
	//   90  163:aload_0         
	//   91  164:iconst_0        
	//   92  165:invokespecial   #238 <Method void a(boolean)>
			scrollTo(i1, getScrollY());
	//   93  168:aload_0         
	//   94  169:iload_1         
	//   95  170:aload_0         
	//   96  171:invokevirtual   #221 <Method int getScrollY()>
	//   97  174:invokevirtual   #225 <Method void scrollTo(int, int)>
		}
	//   98  177:return          
	}

	private void a(int i1, boolean flag, int j1, boolean flag1)
	{
		al al1 = b(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #228 <Method al b(int)>
	//    3    5:astore          6
		int k1;
		if(al1 != null)
	//*   4    7:aload           6
	//*   5    9:ifnull          43
			k1 = (int)((float)getClientWidth() * Math.max(t, Math.min(al1.e, u)));
	//    6   12:aload_0         
	//    7   13:invokespecial   #205 <Method int getClientWidth()>
	//    8   16:i2f             
	//    9   17:aload_0         
	//   10   18:getfield        #241 <Field float t>
	//   11   21:aload           6
	//   12   23:getfield        #230 <Field float al.e>
	//   13   26:aload_0         
	//   14   27:getfield        #232 <Field float u>
	//   15   30:invokestatic    #235 <Method float Math.min(float, float)>
	//   16   33:invokestatic    #243 <Method float Math.max(float, float)>
	//   17   36:fmul            
	//   18   37:f2i             
	//   19   38:istore          5
		else
	//*  20   40:goto            46
			k1 = 0;
	//   21   43:iconst_0        
	//   22   44:istore          5
		if(flag)
	//*  23   46:iload_2         
	//*  24   47:ifeq            69
		{
			a(k1, 0, j1);
	//   25   50:aload_0         
	//   26   51:iload           5
	//   27   53:iconst_0        
	//   28   54:iload_3         
	//   29   55:invokevirtual   #246 <Method void a(int, int, int)>
			if(flag1)
	//*  30   58:iload           4
	//*  31   60:ifeq            98
			{
				e(i1);
	//   32   63:aload_0         
	//   33   64:iload_1         
	//   34   65:invokespecial   #248 <Method void e(int)>
				return;
	//   35   68:return          
			}
		} else
		{
			if(flag1)
	//*  36   69:iload           4
	//*  37   71:ifeq            79
				e(i1);
	//   38   74:aload_0         
	//   39   75:iload_1         
	//   40   76:invokespecial   #248 <Method void e(int)>
			a(false);
	//   41   79:aload_0         
	//   42   80:iconst_0        
	//   43   81:invokespecial   #238 <Method void a(boolean)>
			scrollTo(k1, 0);
	//   44   84:aload_0         
	//   45   85:iload           5
	//   46   87:iconst_0        
	//   47   88:invokevirtual   #225 <Method void scrollTo(int, int)>
			d(k1);
	//   48   91:aload_0         
	//   49   92:iload           5
	//   50   94:invokespecial   #251 <Method boolean d(int)>
	//   51   97:pop             
		}
	//   52   98:return          
	}

	private void a(al al1, int i1, al al2)
	{
		int i3 = b.a();
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field z b>
	//    2    4:invokevirtual   #258 <Method int z.a()>
	//    3    7:istore          10
		int j1 = getClientWidth();
	//    4    9:aload_0         
	//    5   10:invokespecial   #205 <Method int getClientWidth()>
	//    6   13:istore          7
		float f4;
		if(j1 > 0)
	//*   7   15:iload           7
	//*   8   17:ifle            34
			f4 = (float)p / (float)j1;
	//    9   20:aload_0         
	//   10   21:getfield        #260 <Field int p>
	//   11   24:i2f             
	//   12   25:iload           7
	//   13   27:i2f             
	//   14   28:fdiv            
	//   15   29:fstore          5
		else
	//*  16   31:goto            37
			f4 = 0.0F;
	//   17   34:fconst_0        
	//   18   35:fstore          5
		if(al2 != null)
	//*  19   37:aload_3         
	//*  20   38:ifnull          409
		{
			j1 = al2.b;
	//   21   41:aload_3         
	//   22   42:getfield        #138 <Field int al.b>
	//   23   45:istore          7
			if(j1 < al1.b)
	//*  24   47:iload           7
	//*  25   49:aload_1         
	//*  26   50:getfield        #138 <Field int al.b>
	//*  27   53:icmpge          236
			{
				float f1 = al2.e + al2.d + f4;
	//   28   56:aload_3         
	//   29   57:getfield        #230 <Field float al.e>
	//   30   60:aload_3         
	//   31   61:getfield        #262 <Field float al.d>
	//   32   64:fadd            
	//   33   65:fload           5
	//   34   67:fadd            
	//   35   68:fstore          4
				j1++;
	//   36   70:iload           7
	//   37   72:iconst_1        
	//   38   73:iadd            
	//   39   74:istore          7
				int j2;
				for(int k1 = 0; j1 <= al1.b && k1 < g.size(); j1 = j2 + 1)
	//*  40   76:iconst_0        
	//*  41   77:istore          8
	//*  42   79:iload           7
	//*  43   81:aload_1         
	//*  44   82:getfield        #138 <Field int al.b>
	//*  45   85:icmpgt          409
	//*  46   88:iload           8
	//*  47   90:aload_0         
	//*  48   91:getfield        #124 <Field ArrayList g>
	//*  49   94:invokevirtual   #130 <Method int ArrayList.size()>
	//*  50   97:icmpge          409
				{
					al2 = (al)g.get(k1);
	//   51  100:aload_0         
	//   52  101:getfield        #124 <Field ArrayList g>
	//   53  104:iload           8
	//   54  106:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   55  109:checkcast       #136 <Class al>
	//   56  112:astore_3        
					float f5;
					do
					{
						j2 = j1;
	//   57  113:iload           7
	//   58  115:istore          9
						f5 = f1;
	//   59  117:fload           4
	//   60  119:fstore          6
						if(j1 <= al2.b)
							break;
	//   61  121:iload           7
	//   62  123:aload_3         
	//   63  124:getfield        #138 <Field int al.b>
	//   64  127:icmple          174
						j2 = j1;
	//   65  130:iload           7
	//   66  132:istore          9
						f5 = f1;
	//   67  134:fload           4
	//   68  136:fstore          6
						if(k1 >= g.size() - 1)
							break;
	//   69  138:iload           8
	//   70  140:aload_0         
	//   71  141:getfield        #124 <Field ArrayList g>
	//   72  144:invokevirtual   #130 <Method int ArrayList.size()>
	//   73  147:iconst_1        
	//   74  148:isub            
	//   75  149:icmpge          174
						k1++;
	//   76  152:iload           8
	//   77  154:iconst_1        
	//   78  155:iadd            
	//   79  156:istore          8
						al2 = (al)g.get(k1);
	//   80  158:aload_0         
	//   81  159:getfield        #124 <Field ArrayList g>
	//   82  162:iload           8
	//   83  164:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   84  167:checkcast       #136 <Class al>
	//   85  170:astore_3        
					} while(true);
	//   86  171:goto            113
					for(; j2 < al2.b; j2++)
	//*  87  174:iload           9
	//*  88  176:aload_3         
	//*  89  177:getfield        #138 <Field int al.b>
	//*  90  180:icmpge          209
						f5 += b.a(j2) + f4;
	//   91  183:fload           6
	//   92  185:aload_0         
	//   93  186:getfield        #254 <Field z b>
	//   94  189:iload           9
	//   95  191:invokevirtual   #265 <Method float z.a(int)>
	//   96  194:fload           5
	//   97  196:fadd            
	//   98  197:fadd            
	//   99  198:fstore          6

	//  100  200:iload           9
	//  101  202:iconst_1        
	//  102  203:iadd            
	//  103  204:istore          9
	//* 104  206:goto            174
					al2.e = f5;
	//  105  209:aload_3         
	//  106  210:fload           6
	//  107  212:putfield        #230 <Field float al.e>
					f1 = f5 + (al2.d + f4);
	//  108  215:fload           6
	//  109  217:aload_3         
	//  110  218:getfield        #262 <Field float al.d>
	//  111  221:fload           5
	//  112  223:fadd            
	//  113  224:fadd            
	//  114  225:fstore          4
				}

	//  115  227:iload           9
	//  116  229:iconst_1        
	//  117  230:iadd            
	//  118  231:istore          7
			} else
	//* 119  233:goto            79
			if(j1 > al1.b)
	//* 120  236:iload           7
	//* 121  238:aload_1         
	//* 122  239:getfield        #138 <Field int al.b>
	//* 123  242:icmple          409
			{
				int l1 = g.size() - 1;
	//  124  245:aload_0         
	//  125  246:getfield        #124 <Field ArrayList g>
	//  126  249:invokevirtual   #130 <Method int ArrayList.size()>
	//  127  252:iconst_1        
	//  128  253:isub            
	//  129  254:istore          8
				float f2 = al2.e;
	//  130  256:aload_3         
	//  131  257:getfield        #230 <Field float al.e>
	//  132  260:fstore          4
				int k2;
				for(j1--; j1 >= al1.b && l1 >= 0; j1 = k2 - 1)
	//* 133  262:iload           7
	//* 134  264:iconst_1        
	//* 135  265:isub            
	//* 136  266:istore          7
	//* 137  268:iload           7
	//* 138  270:aload_1         
	//* 139  271:getfield        #138 <Field int al.b>
	//* 140  274:icmplt          409
	//* 141  277:iload           8
	//* 142  279:iflt            409
				{
					al2 = (al)g.get(l1);
	//  143  282:aload_0         
	//  144  283:getfield        #124 <Field ArrayList g>
	//  145  286:iload           8
	//  146  288:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//  147  291:checkcast       #136 <Class al>
	//  148  294:astore_3        
					float f6;
					do
					{
						k2 = j1;
	//  149  295:iload           7
	//  150  297:istore          9
						f6 = f2;
	//  151  299:fload           4
	//  152  301:fstore          6
						if(j1 >= al2.b)
							break;
	//  153  303:iload           7
	//  154  305:aload_3         
	//  155  306:getfield        #138 <Field int al.b>
	//  156  309:icmpge          347
						k2 = j1;
	//  157  312:iload           7
	//  158  314:istore          9
						f6 = f2;
	//  159  316:fload           4
	//  160  318:fstore          6
						if(l1 <= 0)
							break;
	//  161  320:iload           8
	//  162  322:ifle            347
						l1--;
	//  163  325:iload           8
	//  164  327:iconst_1        
	//  165  328:isub            
	//  166  329:istore          8
						al2 = (al)g.get(l1);
	//  167  331:aload_0         
	//  168  332:getfield        #124 <Field ArrayList g>
	//  169  335:iload           8
	//  170  337:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//  171  340:checkcast       #136 <Class al>
	//  172  343:astore_3        
					} while(true);
	//  173  344:goto            295
					for(; k2 > al2.b; k2--)
	//* 174  347:iload           9
	//* 175  349:aload_3         
	//* 176  350:getfield        #138 <Field int al.b>
	//* 177  353:icmple          382
						f6 -= b.a(k2) + f4;
	//  178  356:fload           6
	//  179  358:aload_0         
	//  180  359:getfield        #254 <Field z b>
	//  181  362:iload           9
	//  182  364:invokevirtual   #265 <Method float z.a(int)>
	//  183  367:fload           5
	//  184  369:fadd            
	//  185  370:fsub            
	//  186  371:fstore          6

	//  187  373:iload           9
	//  188  375:iconst_1        
	//  189  376:isub            
	//  190  377:istore          9
	//* 191  379:goto            347
					f2 = f6 - (al2.d + f4);
	//  192  382:fload           6
	//  193  384:aload_3         
	//  194  385:getfield        #262 <Field float al.d>
	//  195  388:fload           5
	//  196  390:fadd            
	//  197  391:fsub            
	//  198  392:fstore          4
					al2.e = f2;
	//  199  394:aload_3         
	//  200  395:fload           4
	//  201  397:putfield        #230 <Field float al.e>
				}

	//  202  400:iload           9
	//  203  402:iconst_1        
	//  204  403:isub            
	//  205  404:istore          7
			}
		}
	//* 206  406:goto            268
		int l2 = g.size();
	//  207  409:aload_0         
	//  208  410:getfield        #124 <Field ArrayList g>
	//  209  413:invokevirtual   #130 <Method int ArrayList.size()>
	//  210  416:istore          9
		float f7 = al1.e;
	//  211  418:aload_1         
	//  212  419:getfield        #230 <Field float al.e>
	//  213  422:fstore          6
		j1 = al1.b - 1;
	//  214  424:aload_1         
	//  215  425:getfield        #138 <Field int al.b>
	//  216  428:iconst_1        
	//  217  429:isub            
	//  218  430:istore          7
		float f3;
		if(al1.b == 0)
	//* 219  432:aload_1         
	//* 220  433:getfield        #138 <Field int al.b>
	//* 221  436:ifne            448
			f3 = al1.e;
	//  222  439:aload_1         
	//  223  440:getfield        #230 <Field float al.e>
	//  224  443:fstore          4
		else
	//* 225  445:goto            453
			f3 = -3.402823E+38F;
	//  226  448:ldc2            #266 <Float -3.402823E+38F>
	//  227  451:fstore          4
		t = f3;
	//  228  453:aload_0         
	//  229  454:fload           4
	//  230  456:putfield        #241 <Field float t>
		int i2 = al1.b;
	//  231  459:aload_1         
	//  232  460:getfield        #138 <Field int al.b>
	//  233  463:istore          8
		i3--;
	//  234  465:iload           10
	//  235  467:iconst_1        
	//  236  468:isub            
	//  237  469:istore          10
		if(i2 == i3)
	//* 238  471:iload           8
	//* 239  473:iload           10
	//* 240  475:icmpne          494
			f3 = (al1.e + al1.d) - 1.0F;
	//  241  478:aload_1         
	//  242  479:getfield        #230 <Field float al.e>
	//  243  482:aload_1         
	//  244  483:getfield        #262 <Field float al.d>
	//  245  486:fadd            
	//  246  487:fconst_1        
	//  247  488:fsub            
	//  248  489:fstore          4
		else
	//* 249  491:goto            499
			f3 = 3.402823E+38F;
	//  250  494:ldc2            #267 <Float 3.402823E+38F>
	//  251  497:fstore          4
		u = f3;
	//  252  499:aload_0         
	//  253  500:fload           4
	//  254  502:putfield        #232 <Field float u>
		i2 = i1 - 1;
	//  255  505:iload_2         
	//  256  506:iconst_1        
	//  257  507:isub            
	//  258  508:istore          8
		f3 = f7;
	//  259  510:fload           6
	//  260  512:fstore          4
		while(i2 >= 0) 
	//* 261  514:iload           8
	//* 262  516:iflt            613
		{
			for(al2 = (al)g.get(i2); j1 > al2.b; j1--)
	//* 263  519:aload_0         
	//* 264  520:getfield        #124 <Field ArrayList g>
	//* 265  523:iload           8
	//* 266  525:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//* 267  528:checkcast       #136 <Class al>
	//* 268  531:astore_3        
	//* 269  532:iload           7
	//* 270  534:aload_3         
	//* 271  535:getfield        #138 <Field int al.b>
	//* 272  538:icmple          567
				f3 -= b.a(j1) + f4;
	//  273  541:fload           4
	//  274  543:aload_0         
	//  275  544:getfield        #254 <Field z b>
	//  276  547:iload           7
	//  277  549:invokevirtual   #265 <Method float z.a(int)>
	//  278  552:fload           5
	//  279  554:fadd            
	//  280  555:fsub            
	//  281  556:fstore          4

	//  282  558:iload           7
	//  283  560:iconst_1        
	//  284  561:isub            
	//  285  562:istore          7
	//* 286  564:goto            532
			f3 -= al2.d + f4;
	//  287  567:fload           4
	//  288  569:aload_3         
	//  289  570:getfield        #262 <Field float al.d>
	//  290  573:fload           5
	//  291  575:fadd            
	//  292  576:fsub            
	//  293  577:fstore          4
			al2.e = f3;
	//  294  579:aload_3         
	//  295  580:fload           4
	//  296  582:putfield        #230 <Field float al.e>
			if(al2.b == 0)
	//* 297  585:aload_3         
	//* 298  586:getfield        #138 <Field int al.b>
	//* 299  589:ifne            598
				t = f3;
	//  300  592:aload_0         
	//  301  593:fload           4
	//  302  595:putfield        #241 <Field float t>
			i2--;
	//  303  598:iload           8
	//  304  600:iconst_1        
	//  305  601:isub            
	//  306  602:istore          8
			j1--;
	//  307  604:iload           7
	//  308  606:iconst_1        
	//  309  607:isub            
	//  310  608:istore          7
		}
	//* 311  610:goto            514
		f3 = al1.e + al1.d + f4;
	//  312  613:aload_1         
	//  313  614:getfield        #230 <Field float al.e>
	//  314  617:aload_1         
	//  315  618:getfield        #262 <Field float al.d>
	//  316  621:fadd            
	//  317  622:fload           5
	//  318  624:fadd            
	//  319  625:fstore          4
		i2 = al1.b + 1;
	//  320  627:aload_1         
	//  321  628:getfield        #138 <Field int al.b>
	//  322  631:iconst_1        
	//  323  632:iadd            
	//  324  633:istore          8
		j1 = i1 + 1;
	//  325  635:iload_2         
	//  326  636:iconst_1        
	//  327  637:iadd            
	//  328  638:istore          7
		for(i1 = i2; j1 < l2; i1++)
	//* 329  640:iload           8
	//* 330  642:istore_2        
	//* 331  643:iload           7
	//* 332  645:iload           9
	//* 333  647:icmpge          747
		{
			for(al1 = (al)g.get(j1); i1 < al1.b; i1++)
	//* 334  650:aload_0         
	//* 335  651:getfield        #124 <Field ArrayList g>
	//* 336  654:iload           7
	//* 337  656:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//* 338  659:checkcast       #136 <Class al>
	//* 339  662:astore_1        
	//* 340  663:iload_2         
	//* 341  664:aload_1         
	//* 342  665:getfield        #138 <Field int al.b>
	//* 343  668:icmpge          694
				f3 += b.a(i1) + f4;
	//  344  671:fload           4
	//  345  673:aload_0         
	//  346  674:getfield        #254 <Field z b>
	//  347  677:iload_2         
	//  348  678:invokevirtual   #265 <Method float z.a(int)>
	//  349  681:fload           5
	//  350  683:fadd            
	//  351  684:fadd            
	//  352  685:fstore          4

	//  353  687:iload_2         
	//  354  688:iconst_1        
	//  355  689:iadd            
	//  356  690:istore_2        
	//* 357  691:goto            663
			if(al1.b == i3)
	//* 358  694:aload_1         
	//* 359  695:getfield        #138 <Field int al.b>
	//* 360  698:iload           10
	//* 361  700:icmpne          716
				u = (al1.d + f3) - 1.0F;
	//  362  703:aload_0         
	//  363  704:aload_1         
	//  364  705:getfield        #262 <Field float al.d>
	//  365  708:fload           4
	//  366  710:fadd            
	//  367  711:fconst_1        
	//  368  712:fsub            
	//  369  713:putfield        #232 <Field float u>
			al1.e = f3;
	//  370  716:aload_1         
	//  371  717:fload           4
	//  372  719:putfield        #230 <Field float al.e>
			f3 += al1.d + f4;
	//  373  722:fload           4
	//  374  724:aload_1         
	//  375  725:getfield        #262 <Field float al.d>
	//  376  728:fload           5
	//  377  730:fadd            
	//  378  731:fadd            
	//  379  732:fstore          4
			j1++;
	//  380  734:iload           7
	//  381  736:iconst_1        
	//  382  737:iadd            
	//  383  738:istore          7
		}

	//  384  740:iload_2         
	//  385  741:iconst_1        
	//  386  742:iadd            
	//  387  743:istore_2        
	//* 388  744:goto            643
		U = false;
	//  389  747:aload_0         
	//  390  748:iconst_0        
	//  391  749:putfield        #269 <Field boolean U>
	//  392  752:return          
	}

	private void a(MotionEvent motionevent)
	{
		int i1 = motionevent.getActionIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #275 <Method int MotionEvent.getActionIndex()>
	//    2    4:istore_2        
		if(motionevent.getPointerId(i1) == K)
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #278 <Method int MotionEvent.getPointerId(int)>
	//*   6   10:aload_0         
	//*   7   11:getfield        #280 <Field int K>
	//*   8   14:icmpne          59
		{
			if(i1 == 0)
	//*   9   17:iload_2         
	//*  10   18:ifne            26
				i1 = 1;
	//   11   21:iconst_1        
	//   12   22:istore_2        
			else
	//*  13   23:goto            28
				i1 = 0;
	//   14   26:iconst_0        
	//   15   27:istore_2        
			G = motionevent.getX(i1);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:iload_2         
	//   19   31:invokevirtual   #283 <Method float MotionEvent.getX(int)>
	//   20   34:putfield        #285 <Field float G>
			K = motionevent.getPointerId(i1);
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:iload_2         
	//   24   40:invokevirtual   #278 <Method int MotionEvent.getPointerId(int)>
	//   25   43:putfield        #280 <Field int K>
			motionevent = ((MotionEvent) (L));
	//   26   46:aload_0         
	//   27   47:getfield        #287 <Field VelocityTracker L>
	//   28   50:astore_1        
			if(motionevent != null)
	//*  29   51:aload_1         
	//*  30   52:ifnull          59
				((VelocityTracker) (motionevent)).clear();
	//   31   55:aload_1         
	//   32   56:invokevirtual   #292 <Method void VelocityTracker.clear()>
		}
	//   33   59:return          
	}

	private void a(boolean flag)
	{
		boolean flag1;
		if(ak == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #294 <Field int ak>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          13
			flag1 = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		else
	//*   6   10:goto            15
			flag1 = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		if(flag1)
	//*   9   15:iload_2         
	//*  10   16:ifeq            106
		{
			setScrollingCacheEnabled(false);
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:invokespecial   #297 <Method void setScrollingCacheEnabled(boolean)>
			if(m.isFinished() ^ true)
	//*  14   24:aload_0         
	//*  15   25:getfield        #194 <Field Scroller m>
	//*  16   28:invokevirtual   #199 <Method boolean Scroller.isFinished()>
	//*  17   31:iconst_1        
	//*  18   32:ixor            
	//*  19   33:ifeq            106
			{
				m.abortAnimation();
	//   20   36:aload_0         
	//   21   37:getfield        #194 <Field Scroller m>
	//   22   40:invokevirtual   #300 <Method void Scroller.abortAnimation()>
				int j1 = getScrollX();
	//   23   43:aload_0         
	//   24   44:invokevirtual   #218 <Method int getScrollX()>
	//   25   47:istore_3        
				int k1 = getScrollY();
	//   26   48:aload_0         
	//   27   49:invokevirtual   #221 <Method int getScrollY()>
	//   28   52:istore          4
				int l1 = m.getCurrX();
	//   29   54:aload_0         
	//   30   55:getfield        #194 <Field Scroller m>
	//   31   58:invokevirtual   #303 <Method int Scroller.getCurrX()>
	//   32   61:istore          5
				int i2 = m.getCurrY();
	//   33   63:aload_0         
	//   34   64:getfield        #194 <Field Scroller m>
	//   35   67:invokevirtual   #306 <Method int Scroller.getCurrY()>
	//   36   70:istore          6
				if(j1 != l1 || k1 != i2)
	//*  37   72:iload_3         
	//*  38   73:iload           5
	//*  39   75:icmpne          85
	//*  40   78:iload           4
	//*  41   80:iload           6
	//*  42   82:icmpeq          106
				{
					scrollTo(l1, i2);
	//   43   85:aload_0         
	//   44   86:iload           5
	//   45   88:iload           6
	//   46   90:invokevirtual   #225 <Method void scrollTo(int, int)>
					if(l1 != j1)
	//*  47   93:iload           5
	//*  48   95:iload_3         
	//*  49   96:icmpeq          106
						d(l1);
	//   50   99:aload_0         
	//   51  100:iload           5
	//   52  102:invokespecial   #251 <Method boolean d(int)>
	//   53  105:pop             
				}
			}
		}
		z = false;
	//   54  106:aload_0         
	//   55  107:iconst_0        
	//   56  108:putfield        #308 <Field boolean z>
		boolean flag3 = false;
	//   57  111:iconst_0        
	//   58  112:istore          4
		boolean flag2 = flag1;
	//   59  114:iload_2         
	//   60  115:istore_3        
		for(int i1 = ((int) (flag3)); i1 < g.size(); i1++)
	//*  61  116:iload           4
	//*  62  118:istore_2        
	//*  63  119:iload_2         
	//*  64  120:aload_0         
	//*  65  121:getfield        #124 <Field ArrayList g>
	//*  66  124:invokevirtual   #130 <Method int ArrayList.size()>
	//*  67  127:icmpge          166
		{
			al al1 = (al)g.get(i1);
	//   68  130:aload_0         
	//   69  131:getfield        #124 <Field ArrayList g>
	//   70  134:iload_2         
	//   71  135:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   72  138:checkcast       #136 <Class al>
	//   73  141:astore          7
			if(al1.c)
	//*  74  143:aload           7
	//*  75  145:getfield        #310 <Field boolean android.support.v4.view.al.c>
	//*  76  148:ifeq            159
			{
				al1.c = false;
	//   77  151:aload           7
	//   78  153:iconst_0        
	//   79  154:putfield        #310 <Field boolean android.support.v4.view.al.c>
				flag2 = true;
	//   80  157:iconst_1        
	//   81  158:istore_3        
			}
		}

	//   82  159:iload_2         
	//   83  160:iconst_1        
	//   84  161:iadd            
	//   85  162:istore_2        
	//*  86  163:goto            119
		if(flag2)
	//*  87  166:iload_3         
	//*  88  167:ifeq            192
		{
			if(flag)
	//*  89  170:iload_1         
	//*  90  171:ifeq            183
			{
				android.support.v4.view.ac.a(((View) (this)), aj);
	//   91  174:aload_0         
	//   92  175:aload_0         
	//   93  176:getfield        #312 <Field Runnable aj>
	//   94  179:invokestatic    #317 <Method void ac.a(View, Runnable)>
				return;
	//   95  182:return          
			}
			aj.run();
	//   96  183:aload_0         
	//   97  184:getfield        #312 <Field Runnable aj>
	//   98  187:invokeinterface #322 <Method void Runnable.run()>
		}
	//   99  192:return          
	}

	private boolean a(float f1, float f2)
	{
		return f1 < (float)E && f2 > 0.0F || f1 > (float)(getWidth() - E) && f2 < 0.0F;
	//    0    0:fload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #325 <Field int E>
	//    3    5:i2f             
	//    4    6:fcmpg           
	//    5    7:ifge            16
	//    6   10:fload_2         
	//    7   11:fconst_0        
	//    8   12:fcmpl           
	//    9   13:ifgt            37
	//   10   16:fload_1         
	//   11   17:aload_0         
	//   12   18:invokevirtual   #328 <Method int getWidth()>
	//   13   21:aload_0         
	//   14   22:getfield        #325 <Field int E>
	//   15   25:isub            
	//   16   26:i2f             
	//   17   27:fcmpl           
	//   18   28:ifle            39
	//   19   31:fload_2         
	//   20   32:fconst_0        
	//   21   33:fcmpg           
	//   22   34:ifge            39
	//   23   37:iconst_1        
	//   24   38:ireturn         
	//   25   39:iconst_0        
	//   26   40:ireturn         
	}

	private void b(int i1, float f1, int j1)
	{
		Object obj = ((Object) (ab));
	//    0    0:aload_0         
	//    1    1:getfield        #331 <Field ao ab>
	//    2    4:astore          6
		if(obj != null)
	//*   3    6:aload           6
	//*   4    8:ifnull          21
			((ao) (obj)).a(i1, f1, j1);
	//    5   11:aload           6
	//    6   13:iload_1         
	//    7   14:fload_2         
	//    8   15:iload_3         
	//    9   16:invokeinterface #335 <Method void ao.a(int, float, int)>
		obj = ((Object) (aa));
	//   10   21:aload_0         
	//   11   22:getfield        #337 <Field List aa>
	//   12   25:astore          6
		if(obj != null)
	//*  13   27:aload           6
	//*  14   29:ifnull          91
		{
			int k1 = 0;
	//   15   32:iconst_0        
	//   16   33:istore          4
			for(int l1 = ((List) (obj)).size(); k1 < l1; k1++)
	//*  17   35:aload           6
	//*  18   37:invokeinterface #340 <Method int List.size()>
	//*  19   42:istore          5
	//*  20   44:iload           4
	//*  21   46:iload           5
	//*  22   48:icmpge          91
			{
				obj = ((Object) ((ao)aa.get(k1)));
	//   23   51:aload_0         
	//   24   52:getfield        #337 <Field List aa>
	//   25   55:iload           4
	//   26   57:invokeinterface #341 <Method Object List.get(int)>
	//   27   62:checkcast       #333 <Class ao>
	//   28   65:astore          6
				if(obj != null)
	//*  29   67:aload           6
	//*  30   69:ifnull          82
					((ao) (obj)).a(i1, f1, j1);
	//   31   72:aload           6
	//   32   74:iload_1         
	//   33   75:fload_2         
	//   34   76:iload_3         
	//   35   77:invokeinterface #335 <Method void ao.a(int, float, int)>
			}

	//   36   82:iload           4
	//   37   84:iconst_1        
	//   38   85:iadd            
	//   39   86:istore          4
		}
	//*  40   88:goto            44
		obj = ((Object) (ac));
	//   41   91:aload_0         
	//   42   92:getfield        #343 <Field ao ac>
	//   43   95:astore          6
		if(obj != null)
	//*  44   97:aload           6
	//*  45   99:ifnull          112
			((ao) (obj)).a(i1, f1, j1);
	//   46  102:aload           6
	//   47  104:iload_1         
	//   48  105:fload_2         
	//   49  106:iload_3         
	//   50  107:invokeinterface #335 <Method void ao.a(int, float, int)>
	//   51  112:return          
	}

	private void b(boolean flag)
	{
		int k1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #346 <Method int getChildCount()>
	//    2    4:istore          4
		for(int i1 = 0; i1 < k1; i1++)
	//*   3    6:iconst_0        
	//*   4    7:istore_2        
	//*   5    8:iload_2         
	//*   6    9:iload           4
	//*   7   11:icmpge          45
		{
			int j1;
			if(flag)
	//*   8   14:iload_1         
	//*   9   15:ifeq            26
				j1 = af;
	//   10   18:aload_0         
	//   11   19:getfield        #348 <Field int af>
	//   12   22:istore_3        
			else
	//*  13   23:goto            28
				j1 = 0;
	//   14   26:iconst_0        
	//   15   27:istore_3        
			getChildAt(i1).setLayerType(j1, ((android.graphics.Paint) (null)));
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #352 <Method View getChildAt(int)>
	//   19   33:iload_3         
	//   20   34:aconst_null     
	//   21   35:invokevirtual   #356 <Method void View.setLayerType(int, android.graphics.Paint)>
		}

	//   22   38:iload_2         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_2        
	//*  26   42:goto            8
	//   27   45:return          
	}

	private boolean b(float f1)
	{
		float f2 = G;
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field float G>
	//    2    4:fstore_2        
		G = f1;
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:putfield        #285 <Field float G>
		float f3 = (float)getScrollX() + (f2 - f1);
	//    6   10:aload_0         
	//    7   11:invokevirtual   #218 <Method int getScrollX()>
	//    8   14:i2f             
	//    9   15:fload_2         
	//   10   16:fload_1         
	//   11   17:fsub            
	//   12   18:fadd            
	//   13   19:fstore_3        
		float f4 = getClientWidth();
	//   14   20:aload_0         
	//   15   21:invokespecial   #205 <Method int getClientWidth()>
	//   16   24:i2f             
	//   17   25:fstore          4
		f1 = t * f4;
	//   18   27:aload_0         
	//   19   28:getfield        #241 <Field float t>
	//   20   31:fload           4
	//   21   33:fmul            
	//   22   34:fstore_1        
		f2 = u * f4;
	//   23   35:aload_0         
	//   24   36:getfield        #232 <Field float u>
	//   25   39:fload           4
	//   26   41:fmul            
	//   27   42:fstore_2        
		Object obj = ((Object) (g));
	//   28   43:aload_0         
	//   29   44:getfield        #124 <Field ArrayList g>
	//   30   47:astore          10
		boolean flag3 = false;
	//   31   49:iconst_0        
	//   32   50:istore          8
		boolean flag4 = false;
	//   33   52:iconst_0        
	//   34   53:istore          9
		boolean flag2 = false;
	//   35   55:iconst_0        
	//   36   56:istore          7
		obj = ((Object) ((al)((ArrayList) (obj)).get(0)));
	//   37   58:aload           10
	//   38   60:iconst_0        
	//   39   61:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   40   64:checkcast       #136 <Class al>
	//   41   67:astore          10
		Object obj1 = ((Object) (g));
	//   42   69:aload_0         
	//   43   70:getfield        #124 <Field ArrayList g>
	//   44   73:astore          11
		obj1 = ((Object) ((al)((ArrayList) (obj1)).get(((ArrayList) (obj1)).size() - 1)));
	//   45   75:aload           11
	//   46   77:aload           11
	//   47   79:invokevirtual   #130 <Method int ArrayList.size()>
	//   48   82:iconst_1        
	//   49   83:isub            
	//   50   84:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   51   87:checkcast       #136 <Class al>
	//   52   90:astore          11
		boolean flag;
		if(((al) (obj)).b != 0)
	//*  53   92:aload           10
	//*  54   94:getfield        #138 <Field int al.b>
	//*  55   97:ifeq            115
		{
			f1 = ((al) (obj)).e * f4;
	//   56  100:aload           10
	//   57  102:getfield        #230 <Field float al.e>
	//   58  105:fload           4
	//   59  107:fmul            
	//   60  108:fstore_1        
			flag = false;
	//   61  109:iconst_0        
	//   62  110:istore          5
		} else
	//*  63  112:goto            118
		{
			flag = true;
	//   64  115:iconst_1        
	//   65  116:istore          5
		}
		boolean flag1;
		if(((al) (obj1)).b != b.a() - 1)
	//*  66  118:aload           11
	//*  67  120:getfield        #138 <Field int al.b>
	//*  68  123:aload_0         
	//*  69  124:getfield        #254 <Field z b>
	//*  70  127:invokevirtual   #258 <Method int z.a()>
	//*  71  130:iconst_1        
	//*  72  131:isub            
	//*  73  132:icmpeq          150
		{
			f2 = ((al) (obj1)).e * f4;
	//   74  135:aload           11
	//   75  137:getfield        #230 <Field float al.e>
	//   76  140:fload           4
	//   77  142:fmul            
	//   78  143:fstore_2        
			flag1 = false;
	//   79  144:iconst_0        
	//   80  145:istore          6
		} else
	//*  81  147:goto            153
		{
			flag1 = true;
	//   82  150:iconst_1        
	//   83  151:istore          6
		}
		if(f3 < f1)
	//*  84  153:fload_3         
	//*  85  154:fload_1         
	//*  86  155:fcmpg           
	//*  87  156:ifge            186
		{
			if(flag)
	//*  88  159:iload           5
	//*  89  161:ifeq            183
			{
				R.onPull(Math.abs(f1 - f3) / f4);
	//   90  164:aload_0         
	//   91  165:getfield        #359 <Field EdgeEffect R>
	//   92  168:fload_1         
	//   93  169:fload_3         
	//   94  170:fsub            
	//   95  171:invokestatic    #362 <Method float Math.abs(float)>
	//   96  174:fload           4
	//   97  176:fdiv            
	//   98  177:invokevirtual   #368 <Method void EdgeEffect.onPull(float)>
				flag2 = true;
	//   99  180:iconst_1        
	//  100  181:istore          7
			}
		} else
	//* 101  183:goto            228
		{
			flag2 = flag4;
	//  102  186:iload           9
	//  103  188:istore          7
			f1 = f3;
	//  104  190:fload_3         
	//  105  191:fstore_1        
			if(f3 > f2)
	//* 106  192:fload_3         
	//* 107  193:fload_2         
	//* 108  194:fcmpl           
	//* 109  195:ifle            228
			{
				flag2 = flag3;
	//  110  198:iload           8
	//  111  200:istore          7
				if(flag1)
	//* 112  202:iload           6
	//* 113  204:ifeq            226
				{
					S.onPull(Math.abs(f3 - f2) / f4);
	//  114  207:aload_0         
	//  115  208:getfield        #370 <Field EdgeEffect S>
	//  116  211:fload_3         
	//  117  212:fload_2         
	//  118  213:fsub            
	//  119  214:invokestatic    #362 <Method float Math.abs(float)>
	//  120  217:fload           4
	//  121  219:fdiv            
	//  122  220:invokevirtual   #368 <Method void EdgeEffect.onPull(float)>
					flag2 = true;
	//  123  223:iconst_1        
	//  124  224:istore          7
				}
				f1 = f2;
	//  125  226:fload_2         
	//  126  227:fstore_1        
			}
		}
		f2 = G;
	//  127  228:aload_0         
	//  128  229:getfield        #285 <Field float G>
	//  129  232:fstore_2        
		int i1 = (int)f1;
	//  130  233:fload_1         
	//  131  234:f2i             
	//  132  235:istore          5
		G = f2 + (f1 - (float)i1);
	//  133  237:aload_0         
	//  134  238:fload_2         
	//  135  239:fload_1         
	//  136  240:iload           5
	//  137  242:i2f             
	//  138  243:fsub            
	//  139  244:fadd            
	//  140  245:putfield        #285 <Field float G>
		scrollTo(i1, getScrollY());
	//  141  248:aload_0         
	//  142  249:iload           5
	//  143  251:aload_0         
	//  144  252:invokevirtual   #221 <Method int getScrollY()>
	//  145  255:invokevirtual   #225 <Method void scrollTo(int, int)>
		d(i1);
	//  146  258:aload_0         
	//  147  259:iload           5
	//  148  261:invokespecial   #251 <Method boolean d(int)>
	//  149  264:pop             
		return flag2;
	//  150  265:iload           7
	//  151  267:ireturn         
	}

	private void c(boolean flag)
	{
		ViewParent viewparent = getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #371 <Method ViewParent getParent()>
	//    2    4:astore_2        
		if(viewparent != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			viewparent.requestDisallowInterceptTouchEvent(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokeinterface #376 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//    8   16:return          
	}

	private static boolean c(View view)
	{
		return ((Object) (view)).getClass().getAnnotation(android/support/v4/view/ak) != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #383 <Method Class Object.getClass()>
	//    2    4:ldc2            #385 <Class ak>
	//    3    7:invokevirtual   #391 <Method java.lang.annotation.Annotation Class.getAnnotation(Class)>
	//    4   10:ifnull          15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	private boolean d(int i1)
	{
		if(g.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #124 <Field ArrayList g>
	//*   2    4:invokevirtual   #130 <Method int ArrayList.size()>
	//*   3    7:ifne            51
		{
			if(T)
	//*   4   10:aload_0         
	//*   5   11:getfield        #393 <Field boolean T>
	//*   6   14:ifeq            19
				return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
			V = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #395 <Field boolean V>
			a(0, 0.0F, 0);
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:fconst_0        
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #396 <Method void a(int, float, int)>
			if(V)
	//*  17   31:aload_0         
	//*  18   32:getfield        #395 <Field boolean V>
	//*  19   35:ifeq            40
				return false;
	//   20   38:iconst_0        
	//   21   39:ireturn         
			else
				throw new IllegalStateException("onPageScrolled did not call superclass implementation");
	//   22   40:new             #398 <Class IllegalStateException>
	//   23   43:dup             
	//   24   44:ldc2            #400 <String "onPageScrolled did not call superclass implementation">
	//   25   47:invokespecial   #403 <Method void IllegalStateException(String)>
	//   26   50:athrow          
		}
		al al1 = h();
	//   27   51:aload_0         
	//   28   52:invokespecial   #406 <Method al h()>
	//   29   55:astore          7
		int k1 = getClientWidth();
	//   30   57:aload_0         
	//   31   58:invokespecial   #205 <Method int getClientWidth()>
	//   32   61:istore          5
		int l1 = p;
	//   33   63:aload_0         
	//   34   64:getfield        #260 <Field int p>
	//   35   67:istore          6
		float f2 = l1;
	//   36   69:iload           6
	//   37   71:i2f             
	//   38   72:fstore_3        
		float f1 = k1;
	//   39   73:iload           5
	//   40   75:i2f             
	//   41   76:fstore_2        
		f2 /= f1;
	//   42   77:fload_3         
	//   43   78:fload_2         
	//   44   79:fdiv            
	//   45   80:fstore_3        
		int j1 = al1.b;
	//   46   81:aload           7
	//   47   83:getfield        #138 <Field int al.b>
	//   48   86:istore          4
		f1 = ((float)i1 / f1 - al1.e) / (al1.d + f2);
	//   49   88:iload_1         
	//   50   89:i2f             
	//   51   90:fload_2         
	//   52   91:fdiv            
	//   53   92:aload           7
	//   54   94:getfield        #230 <Field float al.e>
	//   55   97:fsub            
	//   56   98:aload           7
	//   57  100:getfield        #262 <Field float al.d>
	//   58  103:fload_3         
	//   59  104:fadd            
	//   60  105:fdiv            
	//   61  106:fstore_2        
		i1 = (int)((float)(k1 + l1) * f1);
	//   62  107:iload           5
	//   63  109:iload           6
	//   64  111:iadd            
	//   65  112:i2f             
	//   66  113:fload_2         
	//   67  114:fmul            
	//   68  115:f2i             
	//   69  116:istore_1        
		V = false;
	//   70  117:aload_0         
	//   71  118:iconst_0        
	//   72  119:putfield        #395 <Field boolean V>
		a(j1, f1, i1);
	//   73  122:aload_0         
	//   74  123:iload           4
	//   75  125:fload_2         
	//   76  126:iload_1         
	//   77  127:invokevirtual   #396 <Method void a(int, float, int)>
		if(V)
	//*  78  130:aload_0         
	//*  79  131:getfield        #395 <Field boolean V>
	//*  80  134:ifeq            139
			return true;
	//   81  137:iconst_1        
	//   82  138:ireturn         
		else
			throw new IllegalStateException("onPageScrolled did not call superclass implementation");
	//   83  139:new             #398 <Class IllegalStateException>
	//   84  142:dup             
	//   85  143:ldc2            #400 <String "onPageScrolled did not call superclass implementation">
	//   86  146:invokespecial   #403 <Method void IllegalStateException(String)>
	//   87  149:athrow          
	}

	private void e()
	{
		int j1;
		for(int i1 = 0; i1 < getChildCount(); i1 = j1 + 1)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #346 <Method int getChildCount()>
	//*   5    7:icmpge          45
		{
			j1 = i1;
	//    6   10:iload_1         
	//    7   11:istore_2        
			if(!((am)getChildAt(i1).getLayoutParams()).a)
	//*   8   12:aload_0         
	//*   9   13:iload_1         
	//*  10   14:invokevirtual   #352 <Method View getChildAt(int)>
	//*  11   17:invokevirtual   #410 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  12   20:checkcast       #412 <Class am>
	//*  13   23:getfield        #414 <Field boolean am.a>
	//*  14   26:ifne            38
			{
				removeViewAt(i1);
	//   15   29:aload_0         
	//   16   30:iload_1         
	//   17   31:invokevirtual   #417 <Method void removeViewAt(int)>
				j1 = i1 - 1;
	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:isub            
	//   21   37:istore_2        
			}
		}

	//   22   38:iload_2         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_1        
	//*  26   42:goto            2
	//   27   45:return          
	}

	private void e(int i1)
	{
		Object obj = ((Object) (ab));
	//    0    0:aload_0         
	//    1    1:getfield        #331 <Field ao ab>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          19
			((ao) (obj)).a(i1);
	//    5   11:aload           4
	//    6   13:iload_1         
	//    7   14:invokeinterface #419 <Method void ao.a(int)>
		obj = ((Object) (aa));
	//    8   19:aload_0         
	//    9   20:getfield        #337 <Field List aa>
	//   10   23:astore          4
		if(obj != null)
	//*  11   25:aload           4
	//*  12   27:ifnull          80
		{
			int j1 = 0;
	//   13   30:iconst_0        
	//   14   31:istore_2        
			for(int k1 = ((List) (obj)).size(); j1 < k1; j1++)
	//*  15   32:aload           4
	//*  16   34:invokeinterface #340 <Method int List.size()>
	//*  17   39:istore_3        
	//*  18   40:iload_2         
	//*  19   41:iload_3         
	//*  20   42:icmpge          80
			{
				obj = ((Object) ((ao)aa.get(j1)));
	//   21   45:aload_0         
	//   22   46:getfield        #337 <Field List aa>
	//   23   49:iload_2         
	//   24   50:invokeinterface #341 <Method Object List.get(int)>
	//   25   55:checkcast       #333 <Class ao>
	//   26   58:astore          4
				if(obj != null)
	//*  27   60:aload           4
	//*  28   62:ifnull          73
					((ao) (obj)).a(i1);
	//   29   65:aload           4
	//   30   67:iload_1         
	//   31   68:invokeinterface #419 <Method void ao.a(int)>
			}

	//   32   73:iload_2         
	//   33   74:iconst_1        
	//   34   75:iadd            
	//   35   76:istore_2        
		}
	//*  36   77:goto            40
		obj = ((Object) (ac));
	//   37   80:aload_0         
	//   38   81:getfield        #343 <Field ao ac>
	//   39   84:astore          4
		if(obj != null)
	//*  40   86:aload           4
	//*  41   88:ifnull          99
			((ao) (obj)).a(i1);
	//   42   91:aload           4
	//   43   93:iload_1         
	//   44   94:invokeinterface #419 <Method void ao.a(int)>
	//   45   99:return          
	}

	private void f()
	{
		if(ag != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #421 <Field int ag>
	//*   2    4:ifeq            78
		{
			ArrayList arraylist = ah;
	//    3    7:aload_0         
	//    4    8:getfield        #423 <Field ArrayList ah>
	//    5   11:astore_3        
			if(arraylist == null)
	//*   6   12:aload_3         
	//*   7   13:ifnonnull       30
				ah = new ArrayList();
	//    8   16:aload_0         
	//    9   17:new             #126 <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #424 <Method void ArrayList()>
	//   12   24:putfield        #423 <Field ArrayList ah>
			else
	//*  13   27:goto            34
				arraylist.clear();
	//   14   30:aload_3         
	//   15   31:invokevirtual   #425 <Method void ArrayList.clear()>
			int j1 = getChildCount();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #346 <Method int getChildCount()>
	//   18   38:istore_2        
			for(int i1 = 0; i1 < j1; i1++)
	//*  19   39:iconst_0        
	//*  20   40:istore_1        
	//*  21   41:iload_1         
	//*  22   42:iload_2         
	//*  23   43:icmpge          68
			{
				View view = getChildAt(i1);
	//   24   46:aload_0         
	//   25   47:iload_1         
	//   26   48:invokevirtual   #352 <Method View getChildAt(int)>
	//   27   51:astore_3        
				ah.add(((Object) (view)));
	//   28   52:aload_0         
	//   29   53:getfield        #423 <Field ArrayList ah>
	//   30   56:aload_3         
	//   31   57:invokevirtual   #429 <Method boolean ArrayList.add(Object)>
	//   32   60:pop             
			}

	//   33   61:iload_1         
	//   34   62:iconst_1        
	//   35   63:iadd            
	//   36   64:istore_1        
	//*  37   65:goto            41
			Collections.sort(((List) (ah)), ((Comparator) (ai)));
	//   38   68:aload_0         
	//   39   69:getfield        #423 <Field ArrayList ah>
	//   40   72:getstatic       #106 <Field as ai>
	//   41   75:invokestatic    #435 <Method void Collections.sort(List, Comparator)>
		}
	//   42   78:return          
	}

	private void f(int i1)
	{
		Object obj = ((Object) (ab));
	//    0    0:aload_0         
	//    1    1:getfield        #331 <Field ao ab>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          19
			((ao) (obj)).b(i1);
	//    5   11:aload           4
	//    6   13:iload_1         
	//    7   14:invokeinterface #437 <Method void ao.b(int)>
		obj = ((Object) (aa));
	//    8   19:aload_0         
	//    9   20:getfield        #337 <Field List aa>
	//   10   23:astore          4
		if(obj != null)
	//*  11   25:aload           4
	//*  12   27:ifnull          80
		{
			int j1 = 0;
	//   13   30:iconst_0        
	//   14   31:istore_2        
			for(int k1 = ((List) (obj)).size(); j1 < k1; j1++)
	//*  15   32:aload           4
	//*  16   34:invokeinterface #340 <Method int List.size()>
	//*  17   39:istore_3        
	//*  18   40:iload_2         
	//*  19   41:iload_3         
	//*  20   42:icmpge          80
			{
				obj = ((Object) ((ao)aa.get(j1)));
	//   21   45:aload_0         
	//   22   46:getfield        #337 <Field List aa>
	//   23   49:iload_2         
	//   24   50:invokeinterface #341 <Method Object List.get(int)>
	//   25   55:checkcast       #333 <Class ao>
	//   26   58:astore          4
				if(obj != null)
	//*  27   60:aload           4
	//*  28   62:ifnull          73
					((ao) (obj)).b(i1);
	//   29   65:aload           4
	//   30   67:iload_1         
	//   31   68:invokeinterface #437 <Method void ao.b(int)>
			}

	//   32   73:iload_2         
	//   33   74:iconst_1        
	//   34   75:iadd            
	//   35   76:istore_2        
		}
	//*  36   77:goto            40
		obj = ((Object) (ac));
	//   37   80:aload_0         
	//   38   81:getfield        #343 <Field ao ac>
	//   39   84:astore          4
		if(obj != null)
	//*  40   86:aload           4
	//*  41   88:ifnull          99
			((ao) (obj)).b(i1);
	//   42   91:aload           4
	//   43   93:iload_1         
	//   44   94:invokeinterface #437 <Method void ao.b(int)>
	//   45   99:return          
	}

	private boolean g()
	{
		K = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #280 <Field int K>
		i();
	//    3    5:aload_0         
	//    4    6:invokespecial   #439 <Method void i()>
		R.onRelease();
	//    5    9:aload_0         
	//    6   10:getfield        #359 <Field EdgeEffect R>
	//    7   13:invokevirtual   #442 <Method void EdgeEffect.onRelease()>
		S.onRelease();
	//    8   16:aload_0         
	//    9   17:getfield        #370 <Field EdgeEffect S>
	//   10   20:invokevirtual   #442 <Method void EdgeEffect.onRelease()>
		return R.isFinished() || S.isFinished();
	//   11   23:aload_0         
	//   12   24:getfield        #359 <Field EdgeEffect R>
	//   13   27:invokevirtual   #443 <Method boolean EdgeEffect.isFinished()>
	//   14   30:ifne            48
	//   15   33:aload_0         
	//   16   34:getfield        #370 <Field EdgeEffect S>
	//   17   37:invokevirtual   #443 <Method boolean EdgeEffect.isFinished()>
	//   18   40:ifeq            46
	//   19   43:goto            48
	//   20   46:iconst_0        
	//   21   47:ireturn         
	//   22   48:iconst_1        
	//   23   49:ireturn         
	}

	private int getClientWidth()
	{
		return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #446 <Method int getMeasuredWidth()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #212 <Method int getPaddingLeft()>
	//    4    8:isub            
	//    5    9:aload_0         
	//    6   10:invokevirtual   #215 <Method int getPaddingRight()>
	//    7   13:isub            
	//    8   14:ireturn         
	}

	private al h()
	{
		int i1 = getClientWidth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #205 <Method int getClientWidth()>
	//    2    4:istore          5
		float f1;
		if(i1 > 0)
	//*   3    6:iload           5
	//*   4    8:ifle            24
			f1 = (float)getScrollX() / (float)i1;
	//    5   11:aload_0         
	//    6   12:invokevirtual   #218 <Method int getScrollX()>
	//    7   15:i2f             
	//    8   16:iload           5
	//    9   18:i2f             
	//   10   19:fdiv            
	//   11   20:fstore_1        
		else
	//*  12   21:goto            26
			f1 = 0.0F;
	//   13   24:fconst_0        
	//   14   25:fstore_1        
		float f2;
		if(i1 > 0)
	//*  15   26:iload           5
	//*  16   28:ifle            44
			f2 = (float)p / (float)i1;
	//   17   31:aload_0         
	//   18   32:getfield        #260 <Field int p>
	//   19   35:i2f             
	//   20   36:iload           5
	//   21   38:i2f             
	//   22   39:fdiv            
	//   23   40:fstore_2        
		else
	//*  24   41:goto            46
			f2 = 0.0F;
	//   25   44:fconst_0        
	//   26   45:fstore_2        
		al al2 = null;
	//   27   46:aconst_null     
	//   28   47:astore          11
		i1 = 0;
	//   29   49:iconst_0        
	//   30   50:istore          5
		boolean flag = true;
	//   31   52:iconst_1        
	//   32   53:istore          6
		int j1 = -1;
	//   33   55:iconst_m1       
	//   34   56:istore          7
		float f3 = 0.0F;
	//   35   58:fconst_0        
	//   36   59:fstore_3        
		float f4 = 0.0F;
	//   37   60:fconst_0        
	//   38   61:fstore          4
		while(i1 < g.size()) 
	//*  39   63:iload           5
	//*  40   65:aload_0         
	//*  41   66:getfield        #124 <Field ArrayList g>
	//*  42   69:invokevirtual   #130 <Method int ArrayList.size()>
	//*  43   72:icmpge          268
		{
			al al3 = (al)g.get(i1);
	//   44   75:aload_0         
	//   45   76:getfield        #124 <Field ArrayList g>
	//   46   79:iload           5
	//   47   81:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   48   84:checkcast       #136 <Class al>
	//   49   87:astore          12
			int k1 = i1;
	//   50   89:iload           5
	//   51   91:istore          8
			al al1 = al3;
	//   52   93:aload           12
	//   53   95:astore          10
			if(!flag)
	//*  54   97:iload           6
	//*  55   99:ifne            177
			{
				int l1 = al3.b;
	//   56  102:aload           12
	//   57  104:getfield        #138 <Field int al.b>
	//   58  107:istore          9
				j1++;
	//   59  109:iload           7
	//   60  111:iconst_1        
	//   61  112:iadd            
	//   62  113:istore          7
				k1 = i1;
	//   63  115:iload           5
	//   64  117:istore          8
				al1 = al3;
	//   65  119:aload           12
	//   66  121:astore          10
				if(l1 != j1)
	//*  67  123:iload           9
	//*  68  125:iload           7
	//*  69  127:icmpeq          177
				{
					al1 = h;
	//   70  130:aload_0         
	//   71  131:getfield        #448 <Field al h>
	//   72  134:astore          10
					al1.e = f3 + f4 + f2;
	//   73  136:aload           10
	//   74  138:fload_3         
	//   75  139:fload           4
	//   76  141:fadd            
	//   77  142:fload_2         
	//   78  143:fadd            
	//   79  144:putfield        #230 <Field float al.e>
					al1.b = j1;
	//   80  147:aload           10
	//   81  149:iload           7
	//   82  151:putfield        #138 <Field int al.b>
					al1.d = b.a(al1.b);
	//   83  154:aload           10
	//   84  156:aload_0         
	//   85  157:getfield        #254 <Field z b>
	//   86  160:aload           10
	//   87  162:getfield        #138 <Field int al.b>
	//   88  165:invokevirtual   #265 <Method float z.a(int)>
	//   89  168:putfield        #262 <Field float al.d>
					k1 = i1 - 1;
	//   90  171:iload           5
	//   91  173:iconst_1        
	//   92  174:isub            
	//   93  175:istore          8
				}
			}
			f3 = al1.e;
	//   94  177:aload           10
	//   95  179:getfield        #230 <Field float al.e>
	//   96  182:fstore_3        
			f4 = al1.d;
	//   97  183:aload           10
	//   98  185:getfield        #262 <Field float al.d>
	//   99  188:fstore          4
			if(!flag && f1 < f3)
	//* 100  190:iload           6
	//* 101  192:ifne            207
	//* 102  195:fload_1         
	//* 103  196:fload_3         
	//* 104  197:fcmpl           
	//* 105  198:iflt            204
	//* 106  201:goto            207
				return al2;
	//  107  204:aload           11
	//  108  206:areturn         
			if(f1 >= f4 + f3 + f2)
	//* 109  207:fload_1         
	//* 110  208:fload           4
	//* 111  210:fload_3         
	//* 112  211:fadd            
	//* 113  212:fload_2         
	//* 114  213:fadd            
	//* 115  214:fcmpg           
	//* 116  215:iflt            265
			{
				if(k1 == g.size() - 1)
	//* 117  218:iload           8
	//* 118  220:aload_0         
	//* 119  221:getfield        #124 <Field ArrayList g>
	//* 120  224:invokevirtual   #130 <Method int ArrayList.size()>
	//* 121  227:iconst_1        
	//* 122  228:isub            
	//* 123  229:icmpne          235
					return al1;
	//  124  232:aload           10
	//  125  234:areturn         
				j1 = al1.b;
	//  126  235:aload           10
	//  127  237:getfield        #138 <Field int al.b>
	//  128  240:istore          7
				f4 = al1.d;
	//  129  242:aload           10
	//  130  244:getfield        #262 <Field float al.d>
	//  131  247:fstore          4
				i1 = k1 + 1;
	//  132  249:iload           8
	//  133  251:iconst_1        
	//  134  252:iadd            
	//  135  253:istore          5
				flag = false;
	//  136  255:iconst_0        
	//  137  256:istore          6
				al2 = al1;
	//  138  258:aload           10
	//  139  260:astore          11
			} else
	//* 140  262:goto            63
			{
				return al1;
	//  141  265:aload           10
	//  142  267:areturn         
			}
		}
		return al2;
	//  143  268:aload           11
	//  144  270:areturn         
	}

	private void i()
	{
		B = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #450 <Field boolean B>
		C = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #452 <Field boolean C>
		VelocityTracker velocitytracker = L;
	//    6   10:aload_0         
	//    7   11:getfield        #287 <Field VelocityTracker L>
	//    8   14:astore_1        
		if(velocitytracker != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          28
		{
			velocitytracker.recycle();
	//   11   19:aload_1         
	//   12   20:invokevirtual   #455 <Method void VelocityTracker.recycle()>
			L = null;
	//   13   23:aload_0         
	//   14   24:aconst_null     
	//   15   25:putfield        #287 <Field VelocityTracker L>
		}
	//   16   28:return          
	}

	private void setScrollingCacheEnabled(boolean flag)
	{
		if(y != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #457 <Field boolean y>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          13
			y = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #457 <Field boolean y>
	//    7   13:return          
	}

	float a(float f1)
	{
		return (float)Math.sin((f1 - 0.5F) * 0.4712389F);
	//    0    0:fload_1         
	//    1    1:ldc2            #458 <Float 0.5F>
	//    2    4:fsub            
	//    3    5:ldc2            #459 <Float 0.4712389F>
	//    4    8:fmul            
	//    5    9:f2d             
	//    6   10:invokestatic    #463 <Method double Math.sin(double)>
	//    7   13:d2f             
	//    8   14:freturn         
	}

	al a(int i1, int j1)
	{
		al al1 = new al();
	//    0    0:new             #136 <Class al>
	//    1    3:dup             
	//    2    4:invokespecial   #465 <Method void al()>
	//    3    7:astore_3        
		al1.b = i1;
	//    4    8:aload_3         
	//    5    9:iload_1         
	//    6   10:putfield        #138 <Field int al.b>
		al1.a = b.a(((ViewGroup) (this)), i1);
	//    7   13:aload_3         
	//    8   14:aload_0         
	//    9   15:getfield        #254 <Field z b>
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokevirtual   #468 <Method Object z.a(ViewGroup, int)>
	//   13   23:putfield        #471 <Field Object al.a>
		al1.d = b.a(i1);
	//   14   26:aload_3         
	//   15   27:aload_0         
	//   16   28:getfield        #254 <Field z b>
	//   17   31:iload_1         
	//   18   32:invokevirtual   #265 <Method float z.a(int)>
	//   19   35:putfield        #262 <Field float al.d>
		if(j1 >= 0 && j1 < g.size())
	//*  20   38:iload_2         
	//*  21   39:iflt            67
	//*  22   42:iload_2         
	//*  23   43:aload_0         
	//*  24   44:getfield        #124 <Field ArrayList g>
	//*  25   47:invokevirtual   #130 <Method int ArrayList.size()>
	//*  26   50:icmplt          56
	//*  27   53:goto            67
		{
			g.add(j1, ((Object) (al1)));
	//   28   56:aload_0         
	//   29   57:getfield        #124 <Field ArrayList g>
	//   30   60:iload_2         
	//   31   61:aload_3         
	//   32   62:invokevirtual   #474 <Method void ArrayList.add(int, Object)>
			return al1;
	//   33   65:aload_3         
	//   34   66:areturn         
		} else
		{
			g.add(((Object) (al1)));
	//   35   67:aload_0         
	//   36   68:getfield        #124 <Field ArrayList g>
	//   37   71:aload_3         
	//   38   72:invokevirtual   #429 <Method boolean ArrayList.add(Object)>
	//   39   75:pop             
			return al1;
	//   40   76:aload_3         
	//   41   77:areturn         
		}
	}

	al a(View view)
	{
		for(int i1 = 0; i1 < g.size(); i1++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #124 <Field ArrayList g>
	//*   5    7:invokevirtual   #130 <Method int ArrayList.size()>
	//*   6   10:icmpge          49
		{
			al al1 = (al)g.get(i1);
	//    7   13:aload_0         
	//    8   14:getfield        #124 <Field ArrayList g>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #136 <Class al>
	//   12   24:astore_3        
			if(b.a(view, al1.a))
	//*  13   25:aload_0         
	//*  14   26:getfield        #254 <Field z b>
	//*  15   29:aload_1         
	//*  16   30:aload_3         
	//*  17   31:getfield        #471 <Field Object al.a>
	//*  18   34:invokevirtual   #478 <Method boolean z.a(View, Object)>
	//*  19   37:ifeq            42
				return al1;
	//   20   40:aload_3         
	//   21   41:areturn         
		}

	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_2        
	//*  26   46:goto            2
		return null;
	//   27   49:aconst_null     
	//   28   50:areturn         
	}

	void a()
	{
		int k3 = b.a();
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field z b>
	//    2    4:invokevirtual   #258 <Method int z.a()>
	//    3    7:istore          9
		d = k3;
	//    4    9:aload_0         
	//    5   10:iload           9
	//    6   12:putfield        #480 <Field int d>
		int i1;
		if(g.size() < A * 2 + 1 && g.size() < k3)
	//*   7   15:aload_0         
	//*   8   16:getfield        #124 <Field ArrayList g>
	//*   9   19:invokevirtual   #130 <Method int ArrayList.size()>
	//*  10   22:aload_0         
	//*  11   23:getfield        #482 <Field int A>
	//*  12   26:iconst_2        
	//*  13   27:imul            
	//*  14   28:iconst_1        
	//*  15   29:iadd            
	//*  16   30:icmpge          50
	//*  17   33:aload_0         
	//*  18   34:getfield        #124 <Field ArrayList g>
	//*  19   37:invokevirtual   #130 <Method int ArrayList.size()>
	//*  20   40:iload           9
	//*  21   42:icmpge          50
			i1 = 1;
	//   22   45:iconst_1        
	//   23   46:istore_1        
		else
	//*  24   47:goto            52
			i1 = 0;
	//   25   50:iconst_0        
	//   26   51:istore_1        
		int k1 = c;
	//   27   52:aload_0         
	//   28   53:getfield        #120 <Field int c>
	//   29   56:istore_2        
		int j2 = 0;
	//   30   57:iconst_0        
	//   31   58:istore          4
		int l1 = 0;
	//   32   60:iconst_0        
	//   33   61:istore_3        
		while(j2 < g.size()) 
	//*  34   62:iload           4
	//*  35   64:aload_0         
	//*  36   65:getfield        #124 <Field ArrayList g>
	//*  37   68:invokevirtual   #130 <Method int ArrayList.size()>
	//*  38   71:icmpge          299
		{
			al al1 = (al)g.get(j2);
	//   39   74:aload_0         
	//   40   75:getfield        #124 <Field ArrayList g>
	//   41   78:iload           4
	//   42   80:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   43   83:checkcast       #136 <Class al>
	//   44   86:astore          10
			int j3 = b.a(al1.a);
	//   45   88:aload_0         
	//   46   89:getfield        #254 <Field z b>
	//   47   92:aload           10
	//   48   94:getfield        #471 <Field Object al.a>
	//   49   97:invokevirtual   #485 <Method int z.a(Object)>
	//   50  100:istore          8
			int k2;
			int l2;
			int i3;
			if(j3 == -1)
	//*  51  102:iload           8
	//*  52  104:iconst_m1       
	//*  53  105:icmpne          121
			{
				l2 = j2;
	//   54  108:iload           4
	//   55  110:istore          6
				i3 = l1;
	//   56  112:iload_3         
	//   57  113:istore          7
				k2 = k1;
	//   58  115:iload_2         
	//   59  116:istore          5
			} else
	//*  60  118:goto            284
			if(j3 == -2)
	//*  61  121:iload           8
	//*  62  123:bipush          -2
	//*  63  125:icmpne          230
			{
				g.remove(j2);
	//   64  128:aload_0         
	//   65  129:getfield        #124 <Field ArrayList g>
	//   66  132:iload           4
	//   67  134:invokevirtual   #488 <Method Object ArrayList.remove(int)>
	//   68  137:pop             
				l2 = j2 - 1;
	//   69  138:iload           4
	//   70  140:iconst_1        
	//   71  141:isub            
	//   72  142:istore          6
				i1 = l1;
	//   73  144:iload_3         
	//   74  145:istore_1        
				if(l1 == 0)
	//*  75  146:iload_3         
	//*  76  147:ifne            160
				{
					b.a(((ViewGroup) (this)));
	//   77  150:aload_0         
	//   78  151:getfield        #254 <Field z b>
	//   79  154:aload_0         
	//   80  155:invokevirtual   #491 <Method void z.a(ViewGroup)>
					i1 = 1;
	//   81  158:iconst_1        
	//   82  159:istore_1        
				}
				b.a(((ViewGroup) (this)), al1.b, al1.a);
	//   83  160:aload_0         
	//   84  161:getfield        #254 <Field z b>
	//   85  164:aload_0         
	//   86  165:aload           10
	//   87  167:getfield        #138 <Field int al.b>
	//   88  170:aload           10
	//   89  172:getfield        #471 <Field Object al.a>
	//   90  175:invokevirtual   #494 <Method void z.a(ViewGroup, int, Object)>
				if(c == al1.b)
	//*  91  178:aload_0         
	//*  92  179:getfield        #120 <Field int c>
	//*  93  182:aload           10
	//*  94  184:getfield        #138 <Field int al.b>
	//*  95  187:icmpne          217
				{
					k2 = Math.max(0, Math.min(c, k3 - 1));
	//   96  190:iconst_0        
	//   97  191:aload_0         
	//   98  192:getfield        #120 <Field int c>
	//   99  195:iload           9
	//  100  197:iconst_1        
	//  101  198:isub            
	//  102  199:invokestatic    #142 <Method int Math.min(int, int)>
	//  103  202:invokestatic    #145 <Method int Math.max(int, int)>
	//  104  205:istore          5
					k1 = 1;
	//  105  207:iconst_1        
	//  106  208:istore_2        
					i3 = i1;
	//  107  209:iload_1         
	//  108  210:istore          7
					i1 = k1;
	//  109  212:iload_2         
	//  110  213:istore_1        
				} else
	//* 111  214:goto            284
				{
					l1 = 1;
	//  112  217:iconst_1        
	//  113  218:istore_3        
					i3 = i1;
	//  114  219:iload_1         
	//  115  220:istore          7
					i1 = l1;
	//  116  222:iload_3         
	//  117  223:istore_1        
					k2 = k1;
	//  118  224:iload_2         
	//  119  225:istore          5
				}
			} else
	//* 120  227:goto            284
			{
				l2 = j2;
	//  121  230:iload           4
	//  122  232:istore          6
				i3 = l1;
	//  123  234:iload_3         
	//  124  235:istore          7
				k2 = k1;
	//  125  237:iload_2         
	//  126  238:istore          5
				if(al1.b != j3)
	//* 127  240:aload           10
	//* 128  242:getfield        #138 <Field int al.b>
	//* 129  245:iload           8
	//* 130  247:icmpeq          284
				{
					if(al1.b == c)
	//* 131  250:aload           10
	//* 132  252:getfield        #138 <Field int al.b>
	//* 133  255:aload_0         
	//* 134  256:getfield        #120 <Field int c>
	//* 135  259:icmpne          265
						k1 = j3;
	//  136  262:iload           8
	//  137  264:istore_2        
					al1.b = j3;
	//  138  265:aload           10
	//  139  267:iload           8
	//  140  269:putfield        #138 <Field int al.b>
					i1 = 1;
	//  141  272:iconst_1        
	//  142  273:istore_1        
					k2 = k1;
	//  143  274:iload_2         
	//  144  275:istore          5
					i3 = l1;
	//  145  277:iload_3         
	//  146  278:istore          7
					l2 = j2;
	//  147  280:iload           4
	//  148  282:istore          6
				}
			}
			j2 = l2 + 1;
	//  149  284:iload           6
	//  150  286:iconst_1        
	//  151  287:iadd            
	//  152  288:istore          4
			l1 = i3;
	//  153  290:iload           7
	//  154  292:istore_3        
			k1 = k2;
	//  155  293:iload           5
	//  156  295:istore_2        
		}
	//* 157  296:goto            62
		if(l1 != 0)
	//* 158  299:iload_3         
	//* 159  300:ifeq            311
			b.b(((ViewGroup) (this)));
	//  160  303:aload_0         
	//  161  304:getfield        #254 <Field z b>
	//  162  307:aload_0         
	//  163  308:invokevirtual   #496 <Method void z.b(ViewGroup)>
		Collections.sort(((List) (g)), e);
	//  164  311:aload_0         
	//  165  312:getfield        #124 <Field ArrayList g>
	//  166  315:getstatic       #96  <Field Comparator e>
	//  167  318:invokestatic    #435 <Method void Collections.sort(List, Comparator)>
		if(i1 != 0)
	//* 168  321:iload_1         
	//* 169  322:ifeq            382
		{
			int i2 = getChildCount();
	//  170  325:aload_0         
	//  171  326:invokevirtual   #346 <Method int getChildCount()>
	//  172  329:istore_3        
			for(int j1 = 0; j1 < i2; j1++)
	//* 173  330:iconst_0        
	//* 174  331:istore_1        
	//* 175  332:iload_1         
	//* 176  333:iload_3         
	//* 177  334:icmpge          371
			{
				am am1 = (am)getChildAt(j1).getLayoutParams();
	//  178  337:aload_0         
	//  179  338:iload_1         
	//  180  339:invokevirtual   #352 <Method View getChildAt(int)>
	//  181  342:invokevirtual   #410 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  182  345:checkcast       #412 <Class am>
	//  183  348:astore          10
				if(!am1.a)
	//* 184  350:aload           10
	//* 185  352:getfield        #414 <Field boolean am.a>
	//* 186  355:ifne            364
					am1.c = 0.0F;
	//  187  358:aload           10
	//  188  360:fconst_0        
	//  189  361:putfield        #498 <Field float android.support.v4.view.am.c>
			}

	//  190  364:iload_1         
	//  191  365:iconst_1        
	//  192  366:iadd            
	//  193  367:istore_1        
	//* 194  368:goto            332
			a(k1, false, true);
	//  195  371:aload_0         
	//  196  372:iload_2         
	//  197  373:iconst_0        
	//  198  374:iconst_1        
	//  199  375:invokevirtual   #501 <Method void a(int, boolean, boolean)>
			requestLayout();
	//  200  378:aload_0         
	//  201  379:invokevirtual   #504 <Method void requestLayout()>
		}
	//  202  382:return          
	}

	void a(int i1)
	{
		android.content.res.Resources.NotFoundException notfoundexception;
		int j3;
label0:
		{
			int k3;
			int l3;
			al al1;
			al al6;
label1:
			{
				int j1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field int c>
	//    2    4:istore          5
				if(j1 != i1)
	//*   3    6:iload           5
	//*   4    8:iload_1         
	//*   5    9:icmpeq          28
				{
					al6 = b(j1);
	//    6   12:aload_0         
	//    7   13:iload           5
	//    8   15:invokevirtual   #228 <Method al b(int)>
	//    9   18:astore          14
					c = i1;
	//   10   20:aload_0         
	//   11   21:iload_1         
	//   12   22:putfield        #120 <Field int c>
				} else
	//*  13   25:goto            31
				{
					al6 = null;
	//   14   28:aconst_null     
	//   15   29:astore          14
				}
				if(b == null)
	//*  16   31:aload_0         
	//*  17   32:getfield        #254 <Field z b>
	//*  18   35:ifnonnull       43
				{
					f();
	//   19   38:aload_0         
	//   20   39:invokespecial   #508 <Method void f()>
					return;
	//   21   42:return          
				}
				if(z)
	//*  22   43:aload_0         
	//*  23   44:getfield        #308 <Field boolean z>
	//*  24   47:ifeq            55
				{
					f();
	//   25   50:aload_0         
	//   26   51:invokespecial   #508 <Method void f()>
					return;
	//   27   54:return          
				}
				if(getWindowToken() == null)
	//*  28   55:aload_0         
	//*  29   56:invokevirtual   #512 <Method android.os.IBinder getWindowToken()>
	//*  30   59:ifnonnull       63
					return;
	//   31   62:return          
				b.a(((ViewGroup) (this)));
	//   32   63:aload_0         
	//   33   64:getfield        #254 <Field z b>
	//   34   67:aload_0         
	//   35   68:invokevirtual   #491 <Method void z.a(ViewGroup)>
				i1 = A;
	//   36   71:aload_0         
	//   37   72:getfield        #482 <Field int A>
	//   38   75:istore_1        
				l3 = Math.max(0, c - i1);
	//   39   76:iconst_0        
	//   40   77:aload_0         
	//   41   78:getfield        #120 <Field int c>
	//   42   81:iload_1         
	//   43   82:isub            
	//   44   83:invokestatic    #145 <Method int Math.max(int, int)>
	//   45   86:istore          11
				j3 = b.a();
	//   46   88:aload_0         
	//   47   89:getfield        #254 <Field z b>
	//   48   92:invokevirtual   #258 <Method int z.a()>
	//   49   95:istore          9
				k3 = Math.min(j3 - 1, c + i1);
	//   50   97:iload           9
	//   51   99:iconst_1        
	//   52  100:isub            
	//   53  101:aload_0         
	//   54  102:getfield        #120 <Field int c>
	//   55  105:iload_1         
	//   56  106:iadd            
	//   57  107:invokestatic    #142 <Method int Math.min(int, int)>
	//   58  110:istore          10
				if(j3 != d)
					break label0;
	//   59  112:iload           9
	//   60  114:aload_0         
	//   61  115:getfield        #480 <Field int d>
	//   62  118:icmpne          1177
				i1 = 0;
	//   63  121:iconst_0        
	//   64  122:istore_1        
				do
				{
					if(i1 >= g.size())
						break;
	//   65  123:iload_1         
	//   66  124:aload_0         
	//   67  125:getfield        #124 <Field ArrayList g>
	//   68  128:invokevirtual   #130 <Method int ArrayList.size()>
	//   69  131:icmpge          181
					al1 = (al)g.get(i1);
	//   70  134:aload_0         
	//   71  135:getfield        #124 <Field ArrayList g>
	//   72  138:iload_1         
	//   73  139:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   74  142:checkcast       #136 <Class al>
	//   75  145:astore          13
					if(al1.b >= c)
	//*  76  147:aload           13
	//*  77  149:getfield        #138 <Field int al.b>
	//*  78  152:aload_0         
	//*  79  153:getfield        #120 <Field int c>
	//*  80  156:icmplt          174
					{
						if(al1.b == c)
	//*  81  159:aload           13
	//*  82  161:getfield        #138 <Field int al.b>
	//*  83  164:aload_0         
	//*  84  165:getfield        #120 <Field int c>
	//*  85  168:icmpne          181
							break label1;
	//   86  171:goto            184
						break;
					}
					i1++;
	//   87  174:iload_1         
	//   88  175:iconst_1        
	//   89  176:iadd            
	//   90  177:istore_1        
				} while(true);
	//   91  178:goto            123
				al1 = null;
	//   92  181:aconst_null     
	//   93  182:astore          13
			}
			al al8 = al1;
	//   94  184:aload           13
	//   95  186:astore          15
			if(al1 == null)
	//*  96  188:aload           13
	//*  97  190:ifnonnull       213
			{
				al8 = al1;
	//   98  193:aload           13
	//   99  195:astore          15
				if(j3 > 0)
	//* 100  197:iload           9
	//* 101  199:ifle            213
					al8 = a(c, i1);
	//  102  202:aload_0         
	//  103  203:aload_0         
	//  104  204:getfield        #120 <Field int c>
	//  105  207:iload_1         
	//  106  208:invokevirtual   #514 <Method al a(int, int)>
	//  107  211:astore          15
			}
			if(al8 != null)
	//* 108  213:aload           15
	//* 109  215:ifnull          961
			{
				int i3 = i1 - 1;
	//  110  218:iload_1         
	//  111  219:iconst_1        
	//  112  220:isub            
	//  113  221:istore          8
				al al2;
				if(i3 >= 0)
	//* 114  223:iload           8
	//* 115  225:iflt            245
					al2 = (al)g.get(i3);
	//  116  228:aload_0         
	//  117  229:getfield        #124 <Field ArrayList g>
	//  118  232:iload           8
	//  119  234:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//  120  237:checkcast       #136 <Class al>
	//  121  240:astore          13
				else
	//* 122  242:goto            248
					al2 = null;
	//  123  245:aconst_null     
	//  124  246:astore          13
				int i4 = getClientWidth();
	//  125  248:aload_0         
	//  126  249:invokespecial   #205 <Method int getClientWidth()>
	//  127  252:istore          12
				float f3;
				if(i4 <= 0)
	//* 128  254:iload           12
	//* 129  256:ifgt            264
					f3 = 0.0F;
	//  130  259:fconst_0        
	//  131  260:fstore_3        
				else
	//* 132  261:goto            282
					f3 = (2.0F - al8.d) + (float)getPaddingLeft() / (float)i4;
	//  133  264:fconst_2        
	//  134  265:aload           15
	//  135  267:getfield        #262 <Field float al.d>
	//  136  270:fsub            
	//  137  271:aload_0         
	//  138  272:invokevirtual   #212 <Method int getPaddingLeft()>
	//  139  275:i2f             
	//  140  276:iload           12
	//  141  278:i2f             
	//  142  279:fdiv            
	//  143  280:fadd            
	//  144  281:fstore_3        
				int k2 = c - 1;
	//  145  282:aload_0         
	//  146  283:getfield        #120 <Field int c>
	//  147  286:iconst_1        
	//  148  287:isub            
	//  149  288:istore          7
				float f5 = 0.0F;
	//  150  290:fconst_0        
	//  151  291:fstore          4
				al al9 = al2;
	//  152  293:aload           13
	//  153  295:astore          16
				int j2 = i1;
	//  154  297:iload_1         
	//  155  298:istore          6
				while(k2 >= 0) 
	//* 156  300:iload           7
	//* 157  302:iflt            575
				{
					float f1;
					int k1;
					al al3;
					if(f5 >= f3 && k2 < l3)
	//* 158  305:fload           4
	//* 159  307:fload_3         
	//* 160  308:fcmpl           
	//* 161  309:iflt            440
	//* 162  312:iload           7
	//* 163  314:iload           11
	//* 164  316:icmpge          440
					{
						if(al9 == null)
	//* 165  319:aload           16
	//* 166  321:ifnonnull       327
							break;
	//  167  324:goto            575
						f1 = f5;
	//  168  327:fload           4
	//  169  329:fstore_2        
						i1 = j2;
	//  170  330:iload           6
	//  171  332:istore_1        
						al3 = al9;
	//  172  333:aload           16
	//  173  335:astore          13
						k1 = i3;
	//  174  337:iload           8
	//  175  339:istore          5
						if(k2 == al9.b)
	//* 176  341:iload           7
	//* 177  343:aload           16
	//* 178  345:getfield        #138 <Field int al.b>
	//* 179  348:icmpne          552
						{
							f1 = f5;
	//  180  351:fload           4
	//  181  353:fstore_2        
							i1 = j2;
	//  182  354:iload           6
	//  183  356:istore_1        
							al3 = al9;
	//  184  357:aload           16
	//  185  359:astore          13
							k1 = i3;
	//  186  361:iload           8
	//  187  363:istore          5
							if(!al9.c)
	//* 188  365:aload           16
	//* 189  367:getfield        #310 <Field boolean android.support.v4.view.al.c>
	//* 190  370:ifne            552
							{
								g.remove(i3);
	//  191  373:aload_0         
	//  192  374:getfield        #124 <Field ArrayList g>
	//  193  377:iload           8
	//  194  379:invokevirtual   #488 <Method Object ArrayList.remove(int)>
	//  195  382:pop             
								b.a(((ViewGroup) (this)), k2, al9.a);
	//  196  383:aload_0         
	//  197  384:getfield        #254 <Field z b>
	//  198  387:aload_0         
	//  199  388:iload           7
	//  200  390:aload           16
	//  201  392:getfield        #471 <Field Object al.a>
	//  202  395:invokevirtual   #494 <Method void z.a(ViewGroup, int, Object)>
								k1 = i3 - 1;
	//  203  398:iload           8
	//  204  400:iconst_1        
	//  205  401:isub            
	//  206  402:istore          5
								i1 = j2 - 1;
	//  207  404:iload           6
	//  208  406:iconst_1        
	//  209  407:isub            
	//  210  408:istore_1        
								if(k1 >= 0)
	//* 211  409:iload           5
	//* 212  411:iflt            431
									al3 = (al)g.get(k1);
	//  213  414:aload_0         
	//  214  415:getfield        #124 <Field ArrayList g>
	//  215  418:iload           5
	//  216  420:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//  217  423:checkcast       #136 <Class al>
	//  218  426:astore          13
								else
	//* 219  428:goto            434
									al3 = null;
	//  220  431:aconst_null     
	//  221  432:astore          13
								f1 = f5;
	//  222  434:fload           4
	//  223  436:fstore_2        
							}
						}
					} else
	//* 224  437:goto            552
					if(al9 != null && k2 == al9.b)
	//* 225  440:aload           16
	//* 226  442:ifnull          501
	//* 227  445:iload           7
	//* 228  447:aload           16
	//* 229  449:getfield        #138 <Field int al.b>
	//* 230  452:icmpne          501
					{
						f1 = f5 + al9.d;
	//  231  455:fload           4
	//  232  457:aload           16
	//  233  459:getfield        #262 <Field float al.d>
	//  234  462:fadd            
	//  235  463:fstore_2        
						k1 = i3 - 1;
	//  236  464:iload           8
	//  237  466:iconst_1        
	//  238  467:isub            
	//  239  468:istore          5
						if(k1 >= 0)
	//* 240  470:iload           5
	//* 241  472:iflt            492
							al3 = (al)g.get(k1);
	//  242  475:aload_0         
	//  243  476:getfield        #124 <Field ArrayList g>
	//  244  479:iload           5
	//  245  481:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//  246  484:checkcast       #136 <Class al>
	//  247  487:astore          13
						else
	//* 248  489:goto            495
							al3 = null;
	//  249  492:aconst_null     
	//  250  493:astore          13
						i1 = j2;
	//  251  495:iload           6
	//  252  497:istore_1        
					} else
	//* 253  498:goto            552
					{
						f1 = f5 + a(k2, i3 + 1).d;
	//  254  501:fload           4
	//  255  503:aload_0         
	//  256  504:iload           7
	//  257  506:iload           8
	//  258  508:iconst_1        
	//  259  509:iadd            
	//  260  510:invokevirtual   #514 <Method al a(int, int)>
	//  261  513:getfield        #262 <Field float al.d>
	//  262  516:fadd            
	//  263  517:fstore_2        
						i1 = j2 + 1;
	//  264  518:iload           6
	//  265  520:iconst_1        
	//  266  521:iadd            
	//  267  522:istore_1        
						if(i3 >= 0)
	//* 268  523:iload           8
	//* 269  525:iflt            545
							al3 = (al)g.get(i3);
	//  270  528:aload_0         
	//  271  529:getfield        #124 <Field ArrayList g>
	//  272  532:iload           8
	//  273  534:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//  274  537:checkcast       #136 <Class al>
	//  275  540:astore          13
						else
	//* 276  542:goto            548
							al3 = null;
	//  277  545:aconst_null     
	//  278  546:astore          13
						k1 = i3;
	//  279  548:iload           8
	//  280  550:istore          5
					}
					k2--;
	//  281  552:iload           7
	//  282  554:iconst_1        
	//  283  555:isub            
	//  284  556:istore          7
					f5 = f1;
	//  285  558:fload_2         
	//  286  559:fstore          4
					j2 = i1;
	//  287  561:iload_1         
	//  288  562:istore          6
					al9 = al3;
	//  289  564:aload           13
	//  290  566:astore          16
					i3 = k1;
	//  291  568:iload           5
	//  292  570:istore          8
				}
	//* 293  572:goto            300
				f5 = al8.d;
	//  294  575:aload           15
	//  295  577:getfield        #262 <Field float al.d>
	//  296  580:fstore          4
				int l1 = j2 + 1;
	//  297  582:iload           6
	//  298  584:iconst_1        
	//  299  585:iadd            
	//  300  586:istore          5
				if(f5 < 2.0F)
	//* 301  588:fload           4
	//* 302  590:fconst_2        
	//* 303  591:fcmpg           
	//* 304  592:ifge            934
				{
					al al4;
					if(l1 < g.size())
	//* 305  595:iload           5
	//* 306  597:aload_0         
	//* 307  598:getfield        #124 <Field ArrayList g>
	//* 308  601:invokevirtual   #130 <Method int ArrayList.size()>
	//* 309  604:icmpge          624
						al4 = (al)g.get(l1);
	//  310  607:aload_0         
	//  311  608:getfield        #124 <Field ArrayList g>
	//  312  611:iload           5
	//  313  613:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//  314  616:checkcast       #136 <Class al>
	//  315  619:astore          13
					else
	//* 316  621:goto            627
						al4 = null;
	//  317  624:aconst_null     
	//  318  625:astore          13
					float f4;
					if(i4 <= 0)
	//* 319  627:iload           12
	//* 320  629:ifgt            637
						f4 = 0.0F;
	//  321  632:fconst_0        
	//  322  633:fstore_3        
					else
	//* 323  634:goto            649
						f4 = (float)getPaddingRight() / (float)i4 + 2.0F;
	//  324  637:aload_0         
	//  325  638:invokevirtual   #215 <Method int getPaddingRight()>
	//  326  641:i2f             
	//  327  642:iload           12
	//  328  644:i2f             
	//  329  645:fdiv            
	//  330  646:fconst_2        
	//  331  647:fadd            
	//  332  648:fstore_3        
					i1 = c;
	//  333  649:aload_0         
	//  334  650:getfield        #120 <Field int c>
	//  335  653:istore_1        
					al al10 = al4;
	//  336  654:aload           13
	//  337  656:astore          16
					do
					{
						int l2 = i1 + 1;
	//  338  658:iload_1         
	//  339  659:iconst_1        
	//  340  660:iadd            
	//  341  661:istore          7
						if(l2 >= j3)
							break;
	//  342  663:iload           7
	//  343  665:iload           9
	//  344  667:icmpge          934
						float f2;
						al al5;
						if(f5 >= f4 && l2 > k3)
	//* 345  670:fload           4
	//* 346  672:fload_3         
	//* 347  673:fcmpl           
	//* 348  674:iflt            802
	//* 349  677:iload           7
	//* 350  679:iload           10
	//* 351  681:icmple          802
						{
							if(al10 == null)
	//* 352  684:aload           16
	//* 353  686:ifnonnull       692
								break;
	//  354  689:goto            934
							f2 = f5;
	//  355  692:fload           4
	//  356  694:fstore_2        
							i1 = l1;
	//  357  695:iload           5
	//  358  697:istore_1        
							al5 = al10;
	//  359  698:aload           16
	//  360  700:astore          13
							if(l2 == al10.b)
	//* 361  702:iload           7
	//* 362  704:aload           16
	//* 363  706:getfield        #138 <Field int al.b>
	//* 364  709:icmpne          918
							{
								f2 = f5;
	//  365  712:fload           4
	//  366  714:fstore_2        
								i1 = l1;
	//  367  715:iload           5
	//  368  717:istore_1        
								al5 = al10;
	//  369  718:aload           16
	//  370  720:astore          13
								if(!al10.c)
	//* 371  722:aload           16
	//* 372  724:getfield        #310 <Field boolean android.support.v4.view.al.c>
	//* 373  727:ifne            918
								{
									g.remove(l1);
	//  374  730:aload_0         
	//  375  731:getfield        #124 <Field ArrayList g>
	//  376  734:iload           5
	//  377  736:invokevirtual   #488 <Method Object ArrayList.remove(int)>
	//  378  739:pop             
									b.a(((ViewGroup) (this)), l2, al10.a);
	//  379  740:aload_0         
	//  380  741:getfield        #254 <Field z b>
	//  381  744:aload_0         
	//  382  745:iload           7
	//  383  747:aload           16
	//  384  749:getfield        #471 <Field Object al.a>
	//  385  752:invokevirtual   #494 <Method void z.a(ViewGroup, int, Object)>
									if(l1 < g.size())
	//* 386  755:iload           5
	//* 387  757:aload_0         
	//* 388  758:getfield        #124 <Field ArrayList g>
	//* 389  761:invokevirtual   #130 <Method int ArrayList.size()>
	//* 390  764:icmpge          790
									{
										al5 = (al)g.get(l1);
	//  391  767:aload_0         
	//  392  768:getfield        #124 <Field ArrayList g>
	//  393  771:iload           5
	//  394  773:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//  395  776:checkcast       #136 <Class al>
	//  396  779:astore          13
										f2 = f5;
	//  397  781:fload           4
	//  398  783:fstore_2        
										i1 = l1;
	//  399  784:iload           5
	//  400  786:istore_1        
									} else
	//* 401  787:goto            918
									{
										al5 = null;
	//  402  790:aconst_null     
	//  403  791:astore          13
										f2 = f5;
	//  404  793:fload           4
	//  405  795:fstore_2        
										i1 = l1;
	//  406  796:iload           5
	//  407  798:istore_1        
									}
								}
							}
						} else
	//* 408  799:goto            918
						if(al10 != null && l2 == al10.b)
	//* 409  802:aload           16
	//* 410  804:ifnull          864
	//* 411  807:iload           7
	//* 412  809:aload           16
	//* 413  811:getfield        #138 <Field int al.b>
	//* 414  814:icmpne          864
						{
							f2 = f5 + al10.d;
	//  415  817:fload           4
	//  416  819:aload           16
	//  417  821:getfield        #262 <Field float al.d>
	//  418  824:fadd            
	//  419  825:fstore_2        
							i1 = l1 + 1;
	//  420  826:iload           5
	//  421  828:iconst_1        
	//  422  829:iadd            
	//  423  830:istore_1        
							if(i1 < g.size())
	//* 424  831:iload_1         
	//* 425  832:aload_0         
	//* 426  833:getfield        #124 <Field ArrayList g>
	//* 427  836:invokevirtual   #130 <Method int ArrayList.size()>
	//* 428  839:icmpge          858
								al5 = (al)g.get(i1);
	//  429  842:aload_0         
	//  430  843:getfield        #124 <Field ArrayList g>
	//  431  846:iload_1         
	//  432  847:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//  433  850:checkcast       #136 <Class al>
	//  434  853:astore          13
							else
	//* 435  855:goto            918
								al5 = null;
	//  436  858:aconst_null     
	//  437  859:astore          13
						} else
	//* 438  861:goto            918
						{
							al5 = a(l2, l1);
	//  439  864:aload_0         
	//  440  865:iload           7
	//  441  867:iload           5
	//  442  869:invokevirtual   #514 <Method al a(int, int)>
	//  443  872:astore          13
							i1 = l1 + 1;
	//  444  874:iload           5
	//  445  876:iconst_1        
	//  446  877:iadd            
	//  447  878:istore_1        
							f2 = f5 + al5.d;
	//  448  879:fload           4
	//  449  881:aload           13
	//  450  883:getfield        #262 <Field float al.d>
	//  451  886:fadd            
	//  452  887:fstore_2        
							if(i1 < g.size())
	//* 453  888:iload_1         
	//* 454  889:aload_0         
	//* 455  890:getfield        #124 <Field ArrayList g>
	//* 456  893:invokevirtual   #130 <Method int ArrayList.size()>
	//* 457  896:icmpge          915
								al5 = (al)g.get(i1);
	//  458  899:aload_0         
	//  459  900:getfield        #124 <Field ArrayList g>
	//  460  903:iload_1         
	//  461  904:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//  462  907:checkcast       #136 <Class al>
	//  463  910:astore          13
							else
	//* 464  912:goto            918
								al5 = null;
	//  465  915:aconst_null     
	//  466  916:astore          13
						}
						f5 = f2;
	//  467  918:fload_2         
	//  468  919:fstore          4
						l1 = i1;
	//  469  921:iload_1         
	//  470  922:istore          5
						al10 = al5;
	//  471  924:aload           13
	//  472  926:astore          16
						i1 = l2;
	//  473  928:iload           7
	//  474  930:istore_1        
					} while(true);
	//  475  931:goto            658
				}
				a(al8, j2, al6);
	//  476  934:aload_0         
	//  477  935:aload           15
	//  478  937:iload           6
	//  479  939:aload           14
	//  480  941:invokespecial   #516 <Method void a(al, int, al)>
				b.b(((ViewGroup) (this)), c, al8.a);
	//  481  944:aload_0         
	//  482  945:getfield        #254 <Field z b>
	//  483  948:aload_0         
	//  484  949:aload_0         
	//  485  950:getfield        #120 <Field int c>
	//  486  953:aload           15
	//  487  955:getfield        #471 <Field Object al.a>
	//  488  958:invokevirtual   #518 <Method void z.b(ViewGroup, int, Object)>
			}
			b.b(((ViewGroup) (this)));
	//  489  961:aload_0         
	//  490  962:getfield        #254 <Field z b>
	//  491  965:aload_0         
	//  492  966:invokevirtual   #496 <Method void z.b(ViewGroup)>
			int i2 = getChildCount();
	//  493  969:aload_0         
	//  494  970:invokevirtual   #346 <Method int getChildCount()>
	//  495  973:istore          5
			for(i1 = 0; i1 < i2; i1++)
	//* 496  975:iconst_0        
	//* 497  976:istore_1        
	//* 498  977:iload_1         
	//* 499  978:iload           5
	//* 500  980:icmpge          1064
			{
				Object obj1 = ((Object) (getChildAt(i1)));
	//  501  983:aload_0         
	//  502  984:iload_1         
	//  503  985:invokevirtual   #352 <Method View getChildAt(int)>
	//  504  988:astore          14
				am am1 = (am)((View) (obj1)).getLayoutParams();
	//  505  990:aload           14
	//  506  992:invokevirtual   #410 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  507  995:checkcast       #412 <Class am>
	//  508  998:astore          13
				am1.f = i1;
	//  509 1000:aload           13
	//  510 1002:iload_1         
	//  511 1003:putfield        #520 <Field int am.f>
				if(am1.a || am1.c != 0.0F)
					continue;
	//  512 1006:aload           13
	//  513 1008:getfield        #414 <Field boolean am.a>
	//  514 1011:ifne            1057
	//  515 1014:aload           13
	//  516 1016:getfield        #498 <Field float android.support.v4.view.am.c>
	//  517 1019:fconst_0        
	//  518 1020:fcmpl           
	//  519 1021:ifne            1057
				obj1 = ((Object) (a(((View) (obj1)))));
	//  520 1024:aload_0         
	//  521 1025:aload           14
	//  522 1027:invokevirtual   #522 <Method al a(View)>
	//  523 1030:astore          14
				if(obj1 != null)
	//* 524 1032:aload           14
	//* 525 1034:ifnull          1057
				{
					am1.c = ((al) (obj1)).d;
	//  526 1037:aload           13
	//  527 1039:aload           14
	//  528 1041:getfield        #262 <Field float al.d>
	//  529 1044:putfield        #498 <Field float android.support.v4.view.am.c>
					am1.e = ((al) (obj1)).b;
	//  530 1047:aload           13
	//  531 1049:aload           14
	//  532 1051:getfield        #138 <Field int al.b>
	//  533 1054:putfield        #524 <Field int am.e>
				}
			}

	//  534 1057:iload_1         
	//  535 1058:iconst_1        
	//  536 1059:iadd            
	//  537 1060:istore_1        
	//* 538 1061:goto            977
			f();
	//  539 1064:aload_0         
	//  540 1065:invokespecial   #508 <Method void f()>
			if(hasFocus())
	//* 541 1068:aload_0         
	//* 542 1069:invokevirtual   #527 <Method boolean hasFocus()>
	//* 543 1072:ifeq            1176
			{
				Object obj = ((Object) (findFocus()));
	//  544 1075:aload_0         
	//  545 1076:invokevirtual   #531 <Method View findFocus()>
	//  546 1079:astore          13
				if(obj != null)
	//* 547 1081:aload           13
	//* 548 1083:ifnull          1097
					obj = ((Object) (b(((View) (obj)))));
	//  549 1086:aload_0         
	//  550 1087:aload           13
	//  551 1089:invokevirtual   #533 <Method al b(View)>
	//  552 1092:astore          13
				else
	//* 553 1094:goto            1100
					obj = null;
	//  554 1097:aconst_null     
	//  555 1098:astore          13
				if(obj == null || ((al) (obj)).b != c)
	//* 556 1100:aload           13
	//* 557 1102:ifnull          1117
	//* 558 1105:aload           13
	//* 559 1107:getfield        #138 <Field int al.b>
	//* 560 1110:aload_0         
	//* 561 1111:getfield        #120 <Field int c>
	//* 562 1114:icmpeq          1176
					for(i1 = 0; i1 < getChildCount(); i1++)
	//* 563 1117:iconst_0        
	//* 564 1118:istore_1        
	//* 565 1119:iload_1         
	//* 566 1120:aload_0         
	//* 567 1121:invokevirtual   #346 <Method int getChildCount()>
	//* 568 1124:icmpge          1176
					{
						View view = getChildAt(i1);
	//  569 1127:aload_0         
	//  570 1128:iload_1         
	//  571 1129:invokevirtual   #352 <Method View getChildAt(int)>
	//  572 1132:astore          13
						al al7 = a(view);
	//  573 1134:aload_0         
	//  574 1135:aload           13
	//  575 1137:invokevirtual   #522 <Method al a(View)>
	//  576 1140:astore          14
						if(al7 != null && al7.b == c && view.requestFocus(2))
	//* 577 1142:aload           14
	//* 578 1144:ifnull          1169
	//* 579 1147:aload           14
	//* 580 1149:getfield        #138 <Field int al.b>
	//* 581 1152:aload_0         
	//* 582 1153:getfield        #120 <Field int c>
	//* 583 1156:icmpne          1169
	//* 584 1159:aload           13
	//* 585 1161:iconst_2        
	//* 586 1162:invokevirtual   #536 <Method boolean View.requestFocus(int)>
	//* 587 1165:ifeq            1169
							return;
	//  588 1168:return          
					}

	//  589 1169:iload_1         
	//  590 1170:iconst_1        
	//  591 1171:iadd            
	//  592 1172:istore_1        
			}
	//* 593 1173:goto            1119
			return;
	//  594 1176:return          
		}
		String s1;
		try
		{
			s1 = getResources().getResourceName(getId());
	//  595 1177:aload_0         
	//  596 1178:invokevirtual   #540 <Method Resources getResources()>
	//  597 1181:aload_0         
	//  598 1182:invokevirtual   #543 <Method int getId()>
	//  599 1185:invokevirtual   #549 <Method String Resources.getResourceName(int)>
	//  600 1188:astore          13
		}
	//* 601 1190:goto            1202
	//* 602 1193:aload_0         
	//* 603 1194:invokevirtual   #543 <Method int getId()>
	//* 604 1197:invokestatic    #554 <Method String Integer.toHexString(int)>
	//* 605 1200:astore          13
	//* 606 1202:new             #556 <Class StringBuilder>
	//* 607 1205:dup             
	//* 608 1206:invokespecial   #557 <Method void StringBuilder()>
	//* 609 1209:astore          14
	//* 610 1211:aload           14
	//* 611 1213:ldc2            #559 <String "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ">
	//* 612 1216:invokevirtual   #563 <Method StringBuilder StringBuilder.append(String)>
	//* 613 1219:pop             
	//* 614 1220:aload           14
	//* 615 1222:aload_0         
	//* 616 1223:getfield        #480 <Field int d>
	//* 617 1226:invokevirtual   #566 <Method StringBuilder StringBuilder.append(int)>
	//* 618 1229:pop             
	//* 619 1230:aload           14
	//* 620 1232:ldc2            #568 <String ", found: ">
	//* 621 1235:invokevirtual   #563 <Method StringBuilder StringBuilder.append(String)>
	//* 622 1238:pop             
	//* 623 1239:aload           14
	//* 624 1241:iload           9
	//* 625 1243:invokevirtual   #566 <Method StringBuilder StringBuilder.append(int)>
	//* 626 1246:pop             
	//* 627 1247:aload           14
	//* 628 1249:ldc2            #570 <String " Pager id: ">
	//* 629 1252:invokevirtual   #563 <Method StringBuilder StringBuilder.append(String)>
	//* 630 1255:pop             
	//* 631 1256:aload           14
	//* 632 1258:aload           13
	//* 633 1260:invokevirtual   #563 <Method StringBuilder StringBuilder.append(String)>
	//* 634 1263:pop             
	//* 635 1264:aload           14
	//* 636 1266:ldc2            #572 <String " Pager class: ">
	//* 637 1269:invokevirtual   #563 <Method StringBuilder StringBuilder.append(String)>
	//* 638 1272:pop             
	//* 639 1273:aload           14
	//* 640 1275:aload_0         
	//* 641 1276:invokevirtual   #383 <Method Class Object.getClass()>
	//* 642 1279:invokevirtual   #575 <Method StringBuilder StringBuilder.append(Object)>
	//* 643 1282:pop             
	//* 644 1283:aload           14
	//* 645 1285:ldc2            #577 <String " Problematic adapter: ">
	//* 646 1288:invokevirtual   #563 <Method StringBuilder StringBuilder.append(String)>
	//* 647 1291:pop             
	//* 648 1292:aload           14
	//* 649 1294:aload_0         
	//* 650 1295:getfield        #254 <Field z b>
	//* 651 1298:invokevirtual   #383 <Method Class Object.getClass()>
	//* 652 1301:invokevirtual   #575 <Method StringBuilder StringBuilder.append(Object)>
	//* 653 1304:pop             
	//* 654 1305:new             #398 <Class IllegalStateException>
	//* 655 1308:dup             
	//* 656 1309:aload           14
	//* 657 1311:invokevirtual   #581 <Method String StringBuilder.toString()>
	//* 658 1314:invokespecial   #403 <Method void IllegalStateException(String)>
	//* 659 1317:athrow          
		// Misplaced declaration of an exception variable
		catch(android.content.res.Resources.NotFoundException notfoundexception)
		{
			s1 = Integer.toHexString(getId());
		}
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
		stringbuilder.append(d);
		stringbuilder.append(", found: ");
		stringbuilder.append(j3);
		stringbuilder.append(" Pager id: ");
		stringbuilder.append(s1);
		stringbuilder.append(" Pager class: ");
		stringbuilder.append(((Object) (((Object)this).getClass())));
		stringbuilder.append(" Problematic adapter: ");
		stringbuilder.append(((Object) (((Object) (b)).getClass())));
		throw new IllegalStateException(stringbuilder.toString());
	//* 660 1318:astore          13
	//* 661 1320:goto            1193
	}

	protected void a(int i1, float f1, int j1)
	{
		int k1 = W;
	//    0    0:aload_0         
	//    1    1:getfield        #583 <Field int W>
	//    2    4:istore          4
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          9
		if(k1 > 0)
	//*   5    9:iload           4
	//*   6   11:ifle            232
		{
			int l3 = getScrollX();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #218 <Method int getScrollX()>
	//    9   18:istore          10
			int l1 = getPaddingLeft();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #212 <Method int getPaddingLeft()>
	//   12   24:istore          4
			int j2 = getPaddingRight();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #215 <Method int getPaddingRight()>
	//   15   30:istore          5
			int i4 = getWidth();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #328 <Method int getWidth()>
	//   18   36:istore          11
			int j4 = getChildCount();
	//   19   38:aload_0         
	//   20   39:invokevirtual   #346 <Method int getChildCount()>
	//   21   42:istore          12
			for(int l2 = 0; l2 < j4; l2++)
	//*  22   44:iconst_0        
	//*  23   45:istore          7
	//*  24   47:iload           7
	//*  25   49:iload           12
	//*  26   51:icmpge          232
			{
				View view = getChildAt(l2);
	//   27   54:aload_0         
	//   28   55:iload           7
	//   29   57:invokevirtual   #352 <Method View getChildAt(int)>
	//   30   60:astore          13
				am am1 = (am)view.getLayoutParams();
	//   31   62:aload           13
	//   32   64:invokevirtual   #410 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   33   67:checkcast       #412 <Class am>
	//   34   70:astore          14
				if(!am1.a)
	//*  35   72:aload           14
	//*  36   74:getfield        #414 <Field boolean am.a>
	//*  37   77:ifne            83
					continue;
	//   38   80:goto            223
				int k2 = am1.b & 7;
	//   39   83:aload           14
	//   40   85:getfield        #584 <Field int am.b>
	//   41   88:bipush          7
	//   42   90:iand            
	//   43   91:istore          6
				if(k2 != 1)
	//*  44   93:iload           6
	//*  45   95:iconst_1        
	//*  46   96:icmpeq          181
				{
					if(k2 != 3)
	//*  47   99:iload           6
	//*  48  101:iconst_3        
	//*  49  102:icmpeq          160
					{
						if(k2 != 5)
	//*  50  105:iload           6
	//*  51  107:iconst_5        
	//*  52  108:icmpeq          126
						{
							int i3 = l1;
	//   53  111:iload           4
	//   54  113:istore          8
							k2 = l1;
	//   55  115:iload           4
	//   56  117:istore          6
							l1 = i3;
	//   57  119:iload           8
	//   58  121:istore          4
						} else
	//*  59  123:goto            198
						{
							k2 = view.getMeasuredWidth();
	//   60  126:aload           13
	//   61  128:invokevirtual   #585 <Method int View.getMeasuredWidth()>
	//   62  131:istore          6
							int j3 = j2 + view.getMeasuredWidth();
	//   63  133:iload           5
	//   64  135:aload           13
	//   65  137:invokevirtual   #585 <Method int View.getMeasuredWidth()>
	//   66  140:iadd            
	//   67  141:istore          8
							k2 = i4 - j2 - k2;
	//   68  143:iload           11
	//   69  145:iload           5
	//   70  147:isub            
	//   71  148:iload           6
	//   72  150:isub            
	//   73  151:istore          6
							j2 = j3;
	//   74  153:iload           8
	//   75  155:istore          5
						}
					} else
	//*  76  157:goto            198
					{
						int k3 = view.getWidth() + l1;
	//   77  160:aload           13
	//   78  162:invokevirtual   #586 <Method int View.getWidth()>
	//   79  165:iload           4
	//   80  167:iadd            
	//   81  168:istore          8
						k2 = l1;
	//   82  170:iload           4
	//   83  172:istore          6
						l1 = k3;
	//   84  174:iload           8
	//   85  176:istore          4
					}
				} else
	//*  86  178:goto            198
				{
					k2 = Math.max((i4 - view.getMeasuredWidth()) / 2, l1);
	//   87  181:iload           11
	//   88  183:aload           13
	//   89  185:invokevirtual   #585 <Method int View.getMeasuredWidth()>
	//   90  188:isub            
	//   91  189:iconst_2        
	//   92  190:idiv            
	//   93  191:iload           4
	//   94  193:invokestatic    #145 <Method int Math.max(int, int)>
	//   95  196:istore          6
				}
				k2 = (k2 + l3) - view.getLeft();
	//   96  198:iload           6
	//   97  200:iload           10
	//   98  202:iadd            
	//   99  203:aload           13
	//  100  205:invokevirtual   #158 <Method int View.getLeft()>
	//  101  208:isub            
	//  102  209:istore          6
				if(k2 != 0)
	//* 103  211:iload           6
	//* 104  213:ifeq            223
					view.offsetLeftAndRight(k2);
	//  105  216:aload           13
	//  106  218:iload           6
	//  107  220:invokevirtual   #589 <Method void View.offsetLeftAndRight(int)>
			}

	//  108  223:iload           7
	//  109  225:iconst_1        
	//  110  226:iadd            
	//  111  227:istore          7
		}
	//* 112  229:goto            47
		b(i1, f1, j1);
	//  113  232:aload_0         
	//  114  233:iload_1         
	//  115  234:fload_2         
	//  116  235:iload_3         
	//  117  236:invokespecial   #591 <Method void b(int, float, int)>
		if(ae != null)
	//* 118  239:aload_0         
	//* 119  240:getfield        #593 <Field ap ae>
	//* 120  243:ifnull          324
		{
			j1 = getScrollX();
	//  121  246:aload_0         
	//  122  247:invokevirtual   #218 <Method int getScrollX()>
	//  123  250:istore_3        
			int i2 = getChildCount();
	//  124  251:aload_0         
	//  125  252:invokevirtual   #346 <Method int getChildCount()>
	//  126  255:istore          4
			for(i1 = ((int) (flag)); i1 < i2; i1++)
	//* 127  257:iload           9
	//* 128  259:istore_1        
	//* 129  260:iload_1         
	//* 130  261:iload           4
	//* 131  263:icmpge          324
			{
				View view1 = getChildAt(i1);
	//  132  266:aload_0         
	//  133  267:iload_1         
	//  134  268:invokevirtual   #352 <Method View getChildAt(int)>
	//  135  271:astore          13
				if(!((am)view1.getLayoutParams()).a)
	//* 136  273:aload           13
	//* 137  275:invokevirtual   #410 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 138  278:checkcast       #412 <Class am>
	//* 139  281:getfield        #414 <Field boolean am.a>
	//* 140  284:ifeq            290
	//* 141  287:goto            317
				{
					f1 = (float)(view1.getLeft() - j1) / (float)getClientWidth();
	//  142  290:aload           13
	//  143  292:invokevirtual   #158 <Method int View.getLeft()>
	//  144  295:iload_3         
	//  145  296:isub            
	//  146  297:i2f             
	//  147  298:aload_0         
	//  148  299:invokespecial   #205 <Method int getClientWidth()>
	//  149  302:i2f             
	//  150  303:fdiv            
	//  151  304:fstore_2        
					ae.a(view1, f1);
	//  152  305:aload_0         
	//  153  306:getfield        #593 <Field ap ae>
	//  154  309:aload           13
	//  155  311:fload_2         
	//  156  312:invokeinterface #598 <Method void ap.a(View, float)>
				}
			}

	//  157  317:iload_1         
	//  158  318:iconst_1        
	//  159  319:iadd            
	//  160  320:istore_1        
		}
	//* 161  321:goto            260
		V = true;
	//  162  324:aload_0         
	//  163  325:iconst_1        
	//  164  326:putfield        #395 <Field boolean V>
	//  165  329:return          
	}

	void a(int i1, int j1, int k1)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #346 <Method int getChildCount()>
	//*   2    4:ifne            13
		{
			setScrollingCacheEnabled(false);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokespecial   #297 <Method void setScrollingCacheEnabled(boolean)>
			return;
	//    6   12:return          
		}
		Scroller scroller = m;
	//    7   13:aload_0         
	//    8   14:getfield        #194 <Field Scroller m>
	//    9   17:astore          11
		boolean flag;
		if(scroller != null && !scroller.isFinished())
	//*  10   19:aload           11
	//*  11   21:ifnull          38
	//*  12   24:aload           11
	//*  13   26:invokevirtual   #199 <Method boolean Scroller.isFinished()>
	//*  14   29:ifne            38
			flag = true;
	//   15   32:iconst_1        
	//   16   33:istore          7
		else
	//*  17   35:goto            41
			flag = false;
	//   18   38:iconst_0        
	//   19   39:istore          7
		int l1;
		if(flag)
	//*  20   41:iload           7
	//*  21   43:ifeq            89
		{
			if(n)
	//*  22   46:aload_0         
	//*  23   47:getfield        #600 <Field boolean n>
	//*  24   50:ifeq            65
				l1 = m.getCurrX();
	//   25   53:aload_0         
	//   26   54:getfield        #194 <Field Scroller m>
	//   27   57:invokevirtual   #303 <Method int Scroller.getCurrX()>
	//   28   60:istore          7
			else
	//*  29   62:goto            74
				l1 = m.getStartX();
	//   30   65:aload_0         
	//   31   66:getfield        #194 <Field Scroller m>
	//   32   69:invokevirtual   #603 <Method int Scroller.getStartX()>
	//   33   72:istore          7
			m.abortAnimation();
	//   34   74:aload_0         
	//   35   75:getfield        #194 <Field Scroller m>
	//   36   78:invokevirtual   #300 <Method void Scroller.abortAnimation()>
			setScrollingCacheEnabled(false);
	//   37   81:aload_0         
	//   38   82:iconst_0        
	//   39   83:invokespecial   #297 <Method void setScrollingCacheEnabled(boolean)>
		} else
	//*  40   86:goto            95
		{
			l1 = getScrollX();
	//   41   89:aload_0         
	//   42   90:invokevirtual   #218 <Method int getScrollX()>
	//   43   93:istore          7
		}
		int i2 = getScrollY();
	//   44   95:aload_0         
	//   45   96:invokevirtual   #221 <Method int getScrollY()>
	//   46   99:istore          8
		int j2 = i1 - l1;
	//   47  101:iload_1         
	//   48  102:iload           7
	//   49  104:isub            
	//   50  105:istore          9
		j1 -= i2;
	//   51  107:iload_2         
	//   52  108:iload           8
	//   53  110:isub            
	//   54  111:istore_2        
		if(j2 == 0 && j1 == 0)
	//*  55  112:iload           9
	//*  56  114:ifne            136
	//*  57  117:iload_2         
	//*  58  118:ifne            136
		{
			a(false);
	//   59  121:aload_0         
	//   60  122:iconst_0        
	//   61  123:invokespecial   #238 <Method void a(boolean)>
			b();
	//   62  126:aload_0         
	//   63  127:invokevirtual   #605 <Method void b()>
			setScrollState(0);
	//   64  130:aload_0         
	//   65  131:iconst_0        
	//   66  132:invokevirtual   #608 <Method void setScrollState(int)>
			return;
	//   67  135:return          
		}
		setScrollingCacheEnabled(true);
	//   68  136:aload_0         
	//   69  137:iconst_1        
	//   70  138:invokespecial   #297 <Method void setScrollingCacheEnabled(boolean)>
		setScrollState(2);
	//   71  141:aload_0         
	//   72  142:iconst_2        
	//   73  143:invokevirtual   #608 <Method void setScrollState(int)>
		i1 = getClientWidth();
	//   74  146:aload_0         
	//   75  147:invokespecial   #205 <Method int getClientWidth()>
	//   76  150:istore_1        
		int k2 = i1 / 2;
	//   77  151:iload_1         
	//   78  152:iconst_2        
	//   79  153:idiv            
	//   80  154:istore          10
		float f2 = Math.abs(j2);
	//   81  156:iload           9
	//   82  158:invokestatic    #114 <Method int Math.abs(int)>
	//   83  161:i2f             
	//   84  162:fstore          5
		float f1 = i1;
	//   85  164:iload_1         
	//   86  165:i2f             
	//   87  166:fstore          4
		float f4 = Math.min(1.0F, (f2 * 1.0F) / f1);
	//   88  168:fconst_1        
	//   89  169:fload           5
	//   90  171:fconst_1        
	//   91  172:fmul            
	//   92  173:fload           4
	//   93  175:fdiv            
	//   94  176:invokestatic    #235 <Method float Math.min(float, float)>
	//   95  179:fstore          6
		f2 = k2;
	//   96  181:iload           10
	//   97  183:i2f             
	//   98  184:fstore          5
		f4 = a(f4);
	//   99  186:aload_0         
	//  100  187:fload           6
	//  101  189:invokevirtual   #610 <Method float a(float)>
	//  102  192:fstore          6
		i1 = Math.abs(k1);
	//  103  194:iload_3         
	//  104  195:invokestatic    #114 <Method int Math.abs(int)>
	//  105  198:istore_1        
		if(i1 > 0)
	//* 106  199:iload_1         
	//* 107  200:ifle            230
		{
			i1 = Math.round(Math.abs((f2 + f4 * f2) / (float)i1) * 1000F) * 4;
	//  108  203:fload           5
	//  109  205:fload           6
	//  110  207:fload           5
	//  111  209:fmul            
	//  112  210:fadd            
	//  113  211:iload_1         
	//  114  212:i2f             
	//  115  213:fdiv            
	//  116  214:invokestatic    #362 <Method float Math.abs(float)>
	//  117  217:ldc2            #611 <Float 1000F>
	//  118  220:fmul            
	//  119  221:invokestatic    #615 <Method int Math.round(float)>
	//  120  224:iconst_4        
	//  121  225:imul            
	//  122  226:istore_1        
		} else
	//* 123  227:goto            269
		{
			float f3 = b.a(c);
	//  124  230:aload_0         
	//  125  231:getfield        #254 <Field z b>
	//  126  234:aload_0         
	//  127  235:getfield        #120 <Field int c>
	//  128  238:invokevirtual   #265 <Method float z.a(int)>
	//  129  241:fstore          5
			i1 = (int)(((float)Math.abs(j2) / (f1 * f3 + (float)p) + 1.0F) * 100F);
	//  130  243:iload           9
	//  131  245:invokestatic    #114 <Method int Math.abs(int)>
	//  132  248:i2f             
	//  133  249:fload           4
	//  134  251:fload           5
	//  135  253:fmul            
	//  136  254:aload_0         
	//  137  255:getfield        #260 <Field int p>
	//  138  258:i2f             
	//  139  259:fadd            
	//  140  260:fdiv            
	//  141  261:fconst_1        
	//  142  262:fadd            
	//  143  263:ldc2            #616 <Float 100F>
	//  144  266:fmul            
	//  145  267:f2i             
	//  146  268:istore_1        
		}
		i1 = Math.min(i1, 600);
	//  147  269:iload_1         
	//  148  270:sipush          600
	//  149  273:invokestatic    #142 <Method int Math.min(int, int)>
	//  150  276:istore_1        
		n = false;
	//  151  277:aload_0         
	//  152  278:iconst_0        
	//  153  279:putfield        #600 <Field boolean n>
		m.startScroll(l1, i2, j2, j1, i1);
	//  154  282:aload_0         
	//  155  283:getfield        #194 <Field Scroller m>
	//  156  286:iload           7
	//  157  288:iload           8
	//  158  290:iload           9
	//  159  292:iload_2         
	//  160  293:iload_1         
	//  161  294:invokevirtual   #620 <Method void Scroller.startScroll(int, int, int, int, int)>
		android.support.v4.view.ac.d(((View) (this)));
	//  162  297:aload_0         
	//  163  298:invokestatic    #623 <Method void ac.d(View)>
	//  164  301:return          
	}

	public void a(int i1, boolean flag)
	{
		z = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #308 <Field boolean z>
		a(i1, flag, false);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #501 <Method void a(int, boolean, boolean)>
	//    8   12:return          
	}

	void a(int i1, boolean flag, boolean flag1)
	{
		a(i1, flag, flag1, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #627 <Method void a(int, boolean, boolean, int)>
	//    6    8:return          
	}

	void a(int i1, boolean flag, boolean flag1, int j1)
	{
		z z1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field z b>
	//    2    4:astore          7
		if(z1 != null && z1.a() > 0)
	//*   3    6:aload           7
	//*   4    8:ifnull          210
	//*   5   11:aload           7
	//*   6   13:invokevirtual   #258 <Method int z.a()>
	//*   7   16:ifgt            22
	//*   8   19:goto            210
		{
			if(!flag1 && c == i1 && g.size() != 0)
	//*   9   22:iload_3         
	//*  10   23:ifne            50
	//*  11   26:aload_0         
	//*  12   27:getfield        #120 <Field int c>
	//*  13   30:iload_1         
	//*  14   31:icmpne          50
	//*  15   34:aload_0         
	//*  16   35:getfield        #124 <Field ArrayList g>
	//*  17   38:invokevirtual   #130 <Method int ArrayList.size()>
	//*  18   41:ifeq            50
			{
				setScrollingCacheEnabled(false);
	//   19   44:aload_0         
	//   20   45:iconst_0        
	//   21   46:invokespecial   #297 <Method void setScrollingCacheEnabled(boolean)>
				return;
	//   22   49:return          
			}
			flag1 = true;
	//   23   50:iconst_1        
	//   24   51:istore_3        
			int k1;
			if(i1 < 0)
	//*  25   52:iload_1         
	//*  26   53:ifge            62
			{
				k1 = 0;
	//   27   56:iconst_0        
	//   28   57:istore          5
			} else
	//*  29   59:goto            87
			{
				k1 = i1;
	//   30   62:iload_1         
	//   31   63:istore          5
				if(i1 >= b.a())
	//*  32   65:iload_1         
	//*  33   66:aload_0         
	//*  34   67:getfield        #254 <Field z b>
	//*  35   70:invokevirtual   #258 <Method int z.a()>
	//*  36   73:icmplt          87
					k1 = b.a() - 1;
	//   37   76:aload_0         
	//   38   77:getfield        #254 <Field z b>
	//   39   80:invokevirtual   #258 <Method int z.a()>
	//   40   83:iconst_1        
	//   41   84:isub            
	//   42   85:istore          5
			}
			i1 = A;
	//   43   87:aload_0         
	//   44   88:getfield        #482 <Field int A>
	//   45   91:istore_1        
			int l1 = c;
	//   46   92:aload_0         
	//   47   93:getfield        #120 <Field int c>
	//   48   96:istore          6
			if(k1 > l1 + i1 || k1 < l1 - i1)
	//*  49   98:iload           5
	//*  50  100:iload           6
	//*  51  102:iload_1         
	//*  52  103:iadd            
	//*  53  104:icmpgt          116
	//*  54  107:iload           5
	//*  55  109:iload           6
	//*  56  111:iload_1         
	//*  57  112:isub            
	//*  58  113:icmpge          151
				for(i1 = 0; i1 < g.size(); i1++)
	//*  59  116:iconst_0        
	//*  60  117:istore_1        
	//*  61  118:iload_1         
	//*  62  119:aload_0         
	//*  63  120:getfield        #124 <Field ArrayList g>
	//*  64  123:invokevirtual   #130 <Method int ArrayList.size()>
	//*  65  126:icmpge          151
					((al)g.get(i1)).c = true;
	//   66  129:aload_0         
	//   67  130:getfield        #124 <Field ArrayList g>
	//   68  133:iload_1         
	//   69  134:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   70  137:checkcast       #136 <Class al>
	//   71  140:iconst_1        
	//   72  141:putfield        #310 <Field boolean android.support.v4.view.al.c>

	//   73  144:iload_1         
	//   74  145:iconst_1        
	//   75  146:iadd            
	//   76  147:istore_1        
	//*  77  148:goto            118
			if(c == k1)
	//*  78  151:aload_0         
	//*  79  152:getfield        #120 <Field int c>
	//*  80  155:iload           5
	//*  81  157:icmpeq          163
	//*  82  160:goto            165
				flag1 = false;
	//   83  163:iconst_0        
	//   84  164:istore_3        
			if(T)
	//*  85  165:aload_0         
	//*  86  166:getfield        #393 <Field boolean T>
	//*  87  169:ifeq            193
			{
				c = k1;
	//   88  172:aload_0         
	//   89  173:iload           5
	//   90  175:putfield        #120 <Field int c>
				if(flag1)
	//*  91  178:iload_3         
	//*  92  179:ifeq            188
					e(k1);
	//   93  182:aload_0         
	//   94  183:iload           5
	//   95  185:invokespecial   #248 <Method void e(int)>
				requestLayout();
	//   96  188:aload_0         
	//   97  189:invokevirtual   #504 <Method void requestLayout()>
				return;
	//   98  192:return          
			} else
			{
				a(k1);
	//   99  193:aload_0         
	//  100  194:iload           5
	//  101  196:invokevirtual   #628 <Method void a(int)>
				a(k1, flag, j1, flag1);
	//  102  199:aload_0         
	//  103  200:iload           5
	//  104  202:iload_2         
	//  105  203:iload           4
	//  106  205:iload_3         
	//  107  206:invokespecial   #630 <Method void a(int, boolean, int, boolean)>
				return;
	//  108  209:return          
			}
		} else
		{
			setScrollingCacheEnabled(false);
	//  109  210:aload_0         
	//  110  211:iconst_0        
	//  111  212:invokespecial   #297 <Method void setScrollingCacheEnabled(boolean)>
			return;
	//  112  215:return          
		}
	}

	public boolean a(KeyEvent keyevent)
	{
		if(keyevent.getAction() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #636 <Method int KeyEvent.getAction()>
	//*   2    4:ifne            110
		{
			int i1 = keyevent.getKeyCode();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #639 <Method int KeyEvent.getKeyCode()>
	//    5   11:istore_2        
			if(i1 != 61)
	//*   6   12:iload_2         
	//*   7   13:bipush          61
	//*   8   15:icmpeq          83
			{
				switch(i1)
	//*   9   18:iload_2         
				{
	//*  10   19:tableswitch     21 22: default 40
	//	               21 63
	//	               22 43
	//*  11   40:goto            110
				case 22: // '\026'
					if(keyevent.hasModifiers(2))
	//*  12   43:aload_1         
	//*  13   44:iconst_2        
	//*  14   45:invokevirtual   #642 <Method boolean KeyEvent.hasModifiers(int)>
	//*  15   48:ifeq            56
						return d();
	//   16   51:aload_0         
	//   17   52:invokevirtual   #644 <Method boolean d()>
	//   18   55:ireturn         
					else
						return c(66);
	//   19   56:aload_0         
	//   20   57:bipush          66
	//   21   59:invokevirtual   #646 <Method boolean c(int)>
	//   22   62:ireturn         

				case 21: // '\025'
					if(keyevent.hasModifiers(2))
	//*  23   63:aload_1         
	//*  24   64:iconst_2        
	//*  25   65:invokevirtual   #642 <Method boolean KeyEvent.hasModifiers(int)>
	//*  26   68:ifeq            76
						return c();
	//   27   71:aload_0         
	//   28   72:invokevirtual   #648 <Method boolean c()>
	//   29   75:ireturn         
					else
						return c(17);
	//   30   76:aload_0         
	//   31   77:bipush          17
	//   32   79:invokevirtual   #646 <Method boolean c(int)>
	//   33   82:ireturn         
				}
			} else
			{
				if(keyevent.hasNoModifiers())
	//*  34   83:aload_1         
	//*  35   84:invokevirtual   #651 <Method boolean KeyEvent.hasNoModifiers()>
	//*  36   87:ifeq            96
					return c(2);
	//   37   90:aload_0         
	//   38   91:iconst_2        
	//   39   92:invokevirtual   #646 <Method boolean c(int)>
	//   40   95:ireturn         
				if(keyevent.hasModifiers(1))
	//*  41   96:aload_1         
	//*  42   97:iconst_1        
	//*  43   98:invokevirtual   #642 <Method boolean KeyEvent.hasModifiers(int)>
	//*  44  101:ifeq            110
					return c(1);
	//   45  104:aload_0         
	//   46  105:iconst_1        
	//   47  106:invokevirtual   #646 <Method boolean c(int)>
	//   48  109:ireturn         
			}
		}
		return false;
	//   49  110:iconst_0        
	//   50  111:ireturn         
	}

	protected boolean a(View view, boolean flag, int i1, int j1, int k1)
	{
		if(view instanceof ViewGroup)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #4   <Class ViewGroup>
	//*   2    4:ifeq            140
		{
			ViewGroup viewgroup = (ViewGroup)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #4   <Class ViewGroup>
	//    5   11:astore          11
			int i2 = view.getScrollX();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #653 <Method int View.getScrollX()>
	//    8   17:istore          7
			int j2 = view.getScrollY();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #654 <Method int View.getScrollY()>
	//   11   23:istore          8
			for(int l1 = viewgroup.getChildCount() - 1; l1 >= 0; l1--)
	//*  12   25:aload           11
	//*  13   27:invokevirtual   #655 <Method int ViewGroup.getChildCount()>
	//*  14   30:iconst_1        
	//*  15   31:isub            
	//*  16   32:istore          6
	//*  17   34:iload           6
	//*  18   36:iflt            140
			{
				View view1 = viewgroup.getChildAt(l1);
	//   19   39:aload           11
	//   20   41:iload           6
	//   21   43:invokevirtual   #656 <Method View ViewGroup.getChildAt(int)>
	//   22   46:astore          12
				int k2 = j1 + i2;
	//   23   48:iload           4
	//   24   50:iload           7
	//   25   52:iadd            
	//   26   53:istore          9
				if(k2 < view1.getLeft() || k2 >= view1.getRight())
					continue;
	//   27   55:iload           9
	//   28   57:aload           12
	//   29   59:invokevirtual   #158 <Method int View.getLeft()>
	//   30   62:icmplt          131
	//   31   65:iload           9
	//   32   67:aload           12
	//   33   69:invokevirtual   #164 <Method int View.getRight()>
	//   34   72:icmpge          131
				int l2 = k1 + j2;
	//   35   75:iload           5
	//   36   77:iload           8
	//   37   79:iadd            
	//   38   80:istore          10
				if(l2 >= view1.getTop() && l2 < view1.getBottom() && a(view1, true, i1, k2 - view1.getLeft(), l2 - view1.getTop()))
	//*  39   82:iload           10
	//*  40   84:aload           12
	//*  41   86:invokevirtual   #170 <Method int View.getTop()>
	//*  42   89:icmplt          131
	//*  43   92:iload           10
	//*  44   94:aload           12
	//*  45   96:invokevirtual   #176 <Method int View.getBottom()>
	//*  46   99:icmpge          131
	//*  47  102:aload_0         
	//*  48  103:aload           12
	//*  49  105:iconst_1        
	//*  50  106:iload_3         
	//*  51  107:iload           9
	//*  52  109:aload           12
	//*  53  111:invokevirtual   #158 <Method int View.getLeft()>
	//*  54  114:isub            
	//*  55  115:iload           10
	//*  56  117:aload           12
	//*  57  119:invokevirtual   #170 <Method int View.getTop()>
	//*  58  122:isub            
	//*  59  123:invokevirtual   #658 <Method boolean a(View, boolean, int, int, int)>
	//*  60  126:ifeq            131
					return true;
	//   61  129:iconst_1        
	//   62  130:ireturn         
			}

	//   63  131:iload           6
	//   64  133:iconst_1        
	//   65  134:isub            
	//   66  135:istore          6
		}
	//*  67  137:goto            34
		return flag && view.canScrollHorizontally(-i1);
	//   68  140:iload_2         
	//   69  141:ifeq            155
	//   70  144:aload_1         
	//   71  145:iload_3         
	//   72  146:ineg            
	//   73  147:invokevirtual   #661 <Method boolean View.canScrollHorizontally(int)>
	//   74  150:ifeq            155
	//   75  153:iconst_1        
	//   76  154:ireturn         
	//   77  155:iconst_0        
	//   78  156:ireturn         
	}

	public void addFocusables(ArrayList arraylist, int i1, int j1)
	{
		int l1 = arraylist.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #130 <Method int ArrayList.size()>
	//    2    4:istore          5
		int i2 = getDescendantFocusability();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #666 <Method int getDescendantFocusability()>
	//    5   10:istore          6
		if(i2 != 0x60000)
	//*   6   12:iload           6
	//*   7   14:ldc2            #667 <Int 0x60000>
	//*   8   17:icmpeq          90
		{
			for(int k1 = 0; k1 < getChildCount(); k1++)
	//*   9   20:iconst_0        
	//*  10   21:istore          4
	//*  11   23:iload           4
	//*  12   25:aload_0         
	//*  13   26:invokevirtual   #346 <Method int getChildCount()>
	//*  14   29:icmpge          90
			{
				View view = getChildAt(k1);
	//   15   32:aload_0         
	//   16   33:iload           4
	//   17   35:invokevirtual   #352 <Method View getChildAt(int)>
	//   18   38:astore          7
				if(view.getVisibility() != 0)
					continue;
	//   19   40:aload           7
	//   20   42:invokevirtual   #670 <Method int View.getVisibility()>
	//   21   45:ifne            81
				al al1 = a(view);
	//   22   48:aload_0         
	//   23   49:aload           7
	//   24   51:invokevirtual   #522 <Method al a(View)>
	//   25   54:astore          8
				if(al1 != null && al1.b == c)
	//*  26   56:aload           8
	//*  27   58:ifnull          81
	//*  28   61:aload           8
	//*  29   63:getfield        #138 <Field int al.b>
	//*  30   66:aload_0         
	//*  31   67:getfield        #120 <Field int c>
	//*  32   70:icmpne          81
					view.addFocusables(arraylist, i1, j1);
	//   33   73:aload           7
	//   34   75:aload_1         
	//   35   76:iload_2         
	//   36   77:iload_3         
	//   37   78:invokevirtual   #672 <Method void View.addFocusables(ArrayList, int, int)>
			}

	//   38   81:iload           4
	//   39   83:iconst_1        
	//   40   84:iadd            
	//   41   85:istore          4
		}
	//*  42   87:goto            23
		if(i2 != 0x40000 || l1 == arraylist.size())
	//*  43   90:iload           6
	//*  44   92:ldc2            #673 <Int 0x40000>
	//*  45   95:icmpne          107
	//*  46   98:iload           5
	//*  47  100:aload_1         
	//*  48  101:invokevirtual   #130 <Method int ArrayList.size()>
	//*  49  104:icmpne          147
		{
			if(!isFocusable())
	//*  50  107:aload_0         
	//*  51  108:invokevirtual   #676 <Method boolean isFocusable()>
	//*  52  111:ifne            115
				return;
	//   53  114:return          
			if((j1 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode())
	//*  54  115:iload_3         
	//*  55  116:iconst_1        
	//*  56  117:iand            
	//*  57  118:iconst_1        
	//*  58  119:icmpne          137
	//*  59  122:aload_0         
	//*  60  123:invokevirtual   #679 <Method boolean isInTouchMode()>
	//*  61  126:ifeq            137
	//*  62  129:aload_0         
	//*  63  130:invokevirtual   #682 <Method boolean isFocusableInTouchMode()>
	//*  64  133:ifne            137
				return;
	//   65  136:return          
			if(arraylist != null)
	//*  66  137:aload_1         
	//*  67  138:ifnull          147
				arraylist.add(((Object) (this)));
	//   68  141:aload_1         
	//   69  142:aload_0         
	//   70  143:invokevirtual   #429 <Method boolean ArrayList.add(Object)>
	//   71  146:pop             
		}
	//   72  147:return          
	}

	public void addTouchables(ArrayList arraylist)
	{
		for(int i1 = 0; i1 < getChildCount(); i1++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #346 <Method int getChildCount()>
	//*   5    7:icmpge          59
		{
			View view = getChildAt(i1);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #352 <Method View getChildAt(int)>
	//    9   15:astore_3        
			if(view.getVisibility() != 0)
				continue;
	//   10   16:aload_3         
	//   11   17:invokevirtual   #670 <Method int View.getVisibility()>
	//   12   20:ifne            52
			al al1 = a(view);
	//   13   23:aload_0         
	//   14   24:aload_3         
	//   15   25:invokevirtual   #522 <Method al a(View)>
	//   16   28:astore          4
			if(al1 != null && al1.b == c)
	//*  17   30:aload           4
	//*  18   32:ifnull          52
	//*  19   35:aload           4
	//*  20   37:getfield        #138 <Field int al.b>
	//*  21   40:aload_0         
	//*  22   41:getfield        #120 <Field int c>
	//*  23   44:icmpne          52
				view.addTouchables(arraylist);
	//   24   47:aload_3         
	//   25   48:aload_1         
	//   26   49:invokevirtual   #686 <Method void View.addTouchables(ArrayList)>
		}

	//   27   52:iload_2         
	//   28   53:iconst_1        
	//   29   54:iadd            
	//   30   55:istore_2        
	//*  31   56:goto            2
	//   32   59:return          
	}

	public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
	{
		android.view.ViewGroup.LayoutParams layoutparams1 = layoutparams;
	//    0    0:aload_3         
	//    1    1:astore          4
		if(!checkLayoutParams(layoutparams))
	//*   2    3:aload_0         
	//*   3    4:aload_3         
	//*   4    5:invokevirtual   #692 <Method boolean checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*   5    8:ifne            18
			layoutparams1 = generateLayoutParams(layoutparams);
	//    6   11:aload_0         
	//    7   12:aload_3         
	//    8   13:invokevirtual   #696 <Method android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    9   16:astore          4
		layoutparams = ((android.view.ViewGroup.LayoutParams) ((am)layoutparams1));
	//   10   18:aload           4
	//   11   20:checkcast       #412 <Class am>
	//   12   23:astore_3        
		layoutparams.a = ((am) (layoutparams)).a | c(view);
	//   13   24:aload_3         
	//   14   25:aload_3         
	//   15   26:getfield        #414 <Field boolean am.a>
	//   16   29:aload_1         
	//   17   30:invokestatic    #698 <Method boolean c(View)>
	//   18   33:ior             
	//   19   34:putfield        #414 <Field boolean am.a>
		if(x)
	//*  20   37:aload_0         
	//*  21   38:getfield        #700 <Field boolean x>
	//*  22   41:ifeq            84
		{
			if(layoutparams != null && ((am) (layoutparams)).a)
	//*  23   44:aload_3         
	//*  24   45:ifnull          69
	//*  25   48:aload_3         
	//*  26   49:getfield        #414 <Field boolean am.a>
	//*  27   52:ifne            58
	//*  28   55:goto            69
			{
				throw new IllegalStateException("Cannot add pager decor view during layout");
	//   29   58:new             #398 <Class IllegalStateException>
	//   30   61:dup             
	//   31   62:ldc2            #702 <String "Cannot add pager decor view during layout">
	//   32   65:invokespecial   #403 <Method void IllegalStateException(String)>
	//   33   68:athrow          
			} else
			{
				layoutparams.d = true;
	//   34   69:aload_3         
	//   35   70:iconst_1        
	//   36   71:putfield        #704 <Field boolean am.d>
				addViewInLayout(view, i1, layoutparams1);
	//   37   74:aload_0         
	//   38   75:aload_1         
	//   39   76:iload_2         
	//   40   77:aload           4
	//   41   79:invokevirtual   #708 <Method boolean addViewInLayout(View, int, android.view.ViewGroup$LayoutParams)>
	//   42   82:pop             
				return;
	//   43   83:return          
			}
		} else
		{
			super.addView(view, i1, layoutparams1);
	//   44   84:aload_0         
	//   45   85:aload_1         
	//   46   86:iload_2         
	//   47   87:aload           4
	//   48   89:invokespecial   #710 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   49   92:return          
		}
	}

	al b(int i1)
	{
		for(int j1 = 0; j1 < g.size(); j1++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #124 <Field ArrayList g>
	//*   5    7:invokevirtual   #130 <Method int ArrayList.size()>
	//*   6   10:icmpge          42
		{
			al al1 = (al)g.get(j1);
	//    7   13:aload_0         
	//    8   14:getfield        #124 <Field ArrayList g>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #136 <Class al>
	//   12   24:astore_3        
			if(al1.b == i1)
	//*  13   25:aload_3         
	//*  14   26:getfield        #138 <Field int al.b>
	//*  15   29:iload_1         
	//*  16   30:icmpne          35
				return al1;
	//   17   33:aload_3         
	//   18   34:areturn         
		}

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            2
		return null;
	//   24   42:aconst_null     
	//   25   43:areturn         
	}

	al b(View view)
	{
		do
		{
			ViewParent viewparent = view.getParent();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #183 <Method ViewParent View.getParent()>
	//    2    4:astore_2        
			if(viewparent != this)
	//*   3    5:aload_2         
	//*   4    6:aload_0         
	//*   5    7:if_acmpeq       34
			{
				if(viewparent != null && (viewparent instanceof View))
	//*   6   10:aload_2         
	//*   7   11:ifnull          32
	//*   8   14:aload_2         
	//*   9   15:instanceof      #155 <Class View>
	//*  10   18:ifne            24
	//*  11   21:goto            32
					view = (View)viewparent;
	//   12   24:aload_2         
	//   13   25:checkcast       #155 <Class View>
	//   14   28:astore_1        
				else
	//*  15   29:goto            0
					return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
			} else
			{
				return a(view);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #522 <Method al a(View)>
	//   21   39:areturn         
			}
		} while(true);
	}

	void b()
	{
		a(c);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #120 <Field int c>
	//    3    5:invokevirtual   #628 <Method void a(int)>
	//    4    8:return          
	}

	boolean c()
	{
		int i1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field int c>
	//    2    4:istore_1        
		if(i1 > 0)
	//*   3    5:iload_1         
	//*   4    6:ifle            19
		{
			a(i1 - 1, true);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:iconst_1        
	//    8   12:isub            
	//    9   13:iconst_1        
	//   10   14:invokevirtual   #712 <Method void a(int, boolean)>
			return true;
	//   11   17:iconst_1        
	//   12   18:ireturn         
		} else
		{
			return false;
	//   13   19:iconst_0        
	//   14   20:ireturn         
		}
	}

	public boolean c(int i1)
	{
		boolean flag1;
		Object obj;
label0:
		{
			View view1;
label1:
			{
				boolean flag;
				Object obj1;
label2:
				{
					view1 = findFocus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #531 <Method View findFocus()>
	//    2    4:astore          7
					flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          4
					obj1 = null;
	//    5    9:aconst_null     
	//    6   10:astore          6
					if(view1 == this)
	//*   7   12:aload           7
	//*   8   14:aload_0         
	//*   9   15:if_acmpne       25
					{
						obj = ((Object) (obj1));
	//   10   18:aload           6
	//   11   20:astore          5
						break label0;
	//   12   22:goto            199
					}
					if(view1 == null)
						break label1;
	//   13   25:aload           7
	//   14   27:ifnull          195
					obj = ((Object) (view1.getParent()));
	//   15   30:aload           7
	//   16   32:invokevirtual   #183 <Method ViewParent View.getParent()>
	//   17   35:astore          5
					do
					{
						if(!(obj instanceof ViewGroup))
							break;
	//   18   37:aload           5
	//   19   39:instanceof      #4   <Class ViewGroup>
	//   20   42:ifeq            68
						if(obj == this)
	//*  21   45:aload           5
	//*  22   47:aload_0         
	//*  23   48:if_acmpne       56
						{
							flag = true;
	//   24   51:iconst_1        
	//   25   52:istore_2        
							break label2;
	//   26   53:goto            70
						}
						obj = ((Object) (((ViewParent) (obj)).getParent()));
	//   27   56:aload           5
	//   28   58:invokeinterface #713 <Method ViewParent ViewParent.getParent()>
	//   29   63:astore          5
					} while(true);
	//   30   65:goto            37
					flag = false;
	//   31   68:iconst_0        
	//   32   69:istore_2        
				}
				if(!flag)
	//*  33   70:iload_2         
	//*  34   71:ifne            195
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   35   74:new             #556 <Class StringBuilder>
	//   36   77:dup             
	//   37   78:invokespecial   #557 <Method void StringBuilder()>
	//   38   81:astore          8
					stringbuilder.append(((Object) (view1)).getClass().getSimpleName());
	//   39   83:aload           8
	//   40   85:aload           7
	//   41   87:invokevirtual   #383 <Method Class Object.getClass()>
	//   42   90:invokevirtual   #716 <Method String Class.getSimpleName()>
	//   43   93:invokevirtual   #563 <Method StringBuilder StringBuilder.append(String)>
	//   44   96:pop             
					for(obj = ((Object) (view1.getParent())); obj instanceof ViewGroup; obj = ((Object) (((ViewParent) (obj)).getParent())))
	//*  45   97:aload           7
	//*  46   99:invokevirtual   #183 <Method ViewParent View.getParent()>
	//*  47  102:astore          5
	//*  48  104:aload           5
	//*  49  106:instanceof      #4   <Class ViewGroup>
	//*  50  109:ifeq            147
					{
						stringbuilder.append(" => ");
	//   51  112:aload           8
	//   52  114:ldc2            #718 <String " => ">
	//   53  117:invokevirtual   #563 <Method StringBuilder StringBuilder.append(String)>
	//   54  120:pop             
						stringbuilder.append(obj.getClass().getSimpleName());
	//   55  121:aload           8
	//   56  123:aload           5
	//   57  125:invokevirtual   #383 <Method Class Object.getClass()>
	//   58  128:invokevirtual   #716 <Method String Class.getSimpleName()>
	//   59  131:invokevirtual   #563 <Method StringBuilder StringBuilder.append(String)>
	//   60  134:pop             
					}

	//   61  135:aload           5
	//   62  137:invokeinterface #713 <Method ViewParent ViewParent.getParent()>
	//   63  142:astore          5
	//*  64  144:goto            104
					obj = ((Object) (new StringBuilder()));
	//   65  147:new             #556 <Class StringBuilder>
	//   66  150:dup             
	//   67  151:invokespecial   #557 <Method void StringBuilder()>
	//   68  154:astore          5
					((StringBuilder) (obj)).append("arrowScroll tried to find focus based on non-child current focused view ");
	//   69  156:aload           5
	//   70  158:ldc2            #720 <String "arrowScroll tried to find focus based on non-child current focused view ">
	//   71  161:invokevirtual   #563 <Method StringBuilder StringBuilder.append(String)>
	//   72  164:pop             
					((StringBuilder) (obj)).append(stringbuilder.toString());
	//   73  165:aload           5
	//   74  167:aload           8
	//   75  169:invokevirtual   #581 <Method String StringBuilder.toString()>
	//   76  172:invokevirtual   #563 <Method StringBuilder StringBuilder.append(String)>
	//   77  175:pop             
					Log.e("ViewPager", ((StringBuilder) (obj)).toString());
	//   78  176:ldc2            #722 <String "ViewPager">
	//   79  179:aload           5
	//   80  181:invokevirtual   #581 <Method String StringBuilder.toString()>
	//   81  184:invokestatic    #727 <Method int Log.e(String, String)>
	//   82  187:pop             
					obj = ((Object) (obj1));
	//   83  188:aload           6
	//   84  190:astore          5
					break label0;
	//   85  192:goto            199
				}
			}
			obj = ((Object) (view1));
	//   86  195:aload           7
	//   87  197:astore          5
		}
		View view = FocusFinder.getInstance().findNextFocus(((ViewGroup) (this)), ((View) (obj)), i1);
	//   88  199:invokestatic    #733 <Method FocusFinder FocusFinder.getInstance()>
	//   89  202:aload_0         
	//   90  203:aload           5
	//   91  205:iload_1         
	//   92  206:invokevirtual   #737 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   93  209:astore          6
		if(view != null && view != obj)
	//*  94  211:aload           6
	//*  95  213:ifnull          349
	//*  96  216:aload           6
	//*  97  218:aload           5
	//*  98  220:if_acmpeq       349
		{
			if(i1 == 17)
	//*  99  223:iload_1         
	//* 100  224:bipush          17
	//* 101  226:icmpne          286
			{
				int j1 = a(i, view).left;
	//  102  229:aload_0         
	//  103  230:aload_0         
	//  104  231:getfield        #739 <Field Rect i>
	//  105  234:aload           6
	//  106  236:invokespecial   #741 <Method Rect a(Rect, View)>
	//  107  239:getfield        #161 <Field int Rect.left>
	//  108  242:istore_2        
				int l1 = a(i, ((View) (obj))).left;
	//  109  243:aload_0         
	//  110  244:aload_0         
	//  111  245:getfield        #739 <Field Rect i>
	//  112  248:aload           5
	//  113  250:invokespecial   #741 <Method Rect a(Rect, View)>
	//  114  253:getfield        #161 <Field int Rect.left>
	//  115  256:istore_3        
				if(obj != null && j1 >= l1)
	//* 116  257:aload           5
	//* 117  259:ifnull          276
	//* 118  262:iload_2         
	//* 119  263:iload_3         
	//* 120  264:icmplt          276
					flag1 = c();
	//  121  267:aload_0         
	//  122  268:invokevirtual   #648 <Method boolean c()>
	//  123  271:istore          4
				else
	//* 124  273:goto            389
					flag1 = view.requestFocus();
	//  125  276:aload           6
	//  126  278:invokevirtual   #743 <Method boolean View.requestFocus()>
	//  127  281:istore          4
			} else
	//* 128  283:goto            389
			if(i1 == 66)
	//* 129  286:iload_1         
	//* 130  287:bipush          66
	//* 131  289:icmpne          389
			{
				int k1 = a(i, view).left;
	//  132  292:aload_0         
	//  133  293:aload_0         
	//  134  294:getfield        #739 <Field Rect i>
	//  135  297:aload           6
	//  136  299:invokespecial   #741 <Method Rect a(Rect, View)>
	//  137  302:getfield        #161 <Field int Rect.left>
	//  138  305:istore_2        
				int i2 = a(i, ((View) (obj))).left;
	//  139  306:aload_0         
	//  140  307:aload_0         
	//  141  308:getfield        #739 <Field Rect i>
	//  142  311:aload           5
	//  143  313:invokespecial   #741 <Method Rect a(Rect, View)>
	//  144  316:getfield        #161 <Field int Rect.left>
	//  145  319:istore_3        
				if(obj != null && k1 <= i2)
	//* 146  320:aload           5
	//* 147  322:ifnull          339
	//* 148  325:iload_2         
	//* 149  326:iload_3         
	//* 150  327:icmpgt          339
					flag1 = d();
	//  151  330:aload_0         
	//  152  331:invokevirtual   #644 <Method boolean d()>
	//  153  334:istore          4
				else
	//* 154  336:goto            389
					flag1 = view.requestFocus();
	//  155  339:aload           6
	//  156  341:invokevirtual   #743 <Method boolean View.requestFocus()>
	//  157  344:istore          4
			}
		} else
	//* 158  346:goto            389
		if(i1 != 17 && i1 != 1)
	//* 159  349:iload_1         
	//* 160  350:bipush          17
	//* 161  352:icmpeq          383
	//* 162  355:iload_1         
	//* 163  356:iconst_1        
	//* 164  357:icmpne          363
	//* 165  360:goto            383
		{
			if(i1 == 66 || i1 == 2)
	//* 166  363:iload_1         
	//* 167  364:bipush          66
	//* 168  366:icmpeq          374
	//* 169  369:iload_1         
	//* 170  370:iconst_2        
	//* 171  371:icmpne          389
				flag1 = d();
	//  172  374:aload_0         
	//  173  375:invokevirtual   #644 <Method boolean d()>
	//  174  378:istore          4
		} else
	//* 175  380:goto            389
		{
			flag1 = c();
	//  176  383:aload_0         
	//  177  384:invokevirtual   #648 <Method boolean c()>
	//  178  387:istore          4
		}
		if(flag1)
	//* 179  389:iload           4
	//* 180  391:ifeq            402
			playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i1));
	//  181  394:aload_0         
	//  182  395:iload_1         
	//  183  396:invokestatic    #748 <Method int SoundEffectConstants.getContantForFocusDirection(int)>
	//  184  399:invokevirtual   #751 <Method void playSoundEffect(int)>
		return flag1;
	//  185  402:iload           4
	//  186  404:ireturn         
	}

	public boolean canScrollHorizontally(int i1)
	{
		z z1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field z b>
	//    2    4:astore          6
		boolean flag2 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		boolean flag = false;
	//    5    9:iconst_0        
	//    6   10:istore          4
		if(z1 == null)
	//*   7   12:aload           6
	//*   8   14:ifnonnull       19
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		int j1 = getClientWidth();
	//   11   19:aload_0         
	//   12   20:invokespecial   #205 <Method int getClientWidth()>
	//   13   23:istore_2        
		int k1 = getScrollX();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #218 <Method int getScrollX()>
	//   16   28:istore_3        
		if(i1 < 0)
	//*  17   29:iload_1         
	//*  18   30:ifge            51
		{
			if(k1 > (int)((float)j1 * t))
	//*  19   33:iload_3         
	//*  20   34:iload_2         
	//*  21   35:i2f             
	//*  22   36:aload_0         
	//*  23   37:getfield        #241 <Field float t>
	//*  24   40:fmul            
	//*  25   41:f2i             
	//*  26   42:icmple          48
				flag = true;
	//   27   45:iconst_1        
	//   28   46:istore          4
			return flag;
	//   29   48:iload           4
	//   30   50:ireturn         
		}
		if(i1 > 0)
	//*  31   51:iload_1         
	//*  32   52:ifle            77
		{
			boolean flag1 = flag2;
	//   33   55:iload           5
	//   34   57:istore          4
			if(k1 < (int)((float)j1 * u))
	//*  35   59:iload_3         
	//*  36   60:iload_2         
	//*  37   61:i2f             
	//*  38   62:aload_0         
	//*  39   63:getfield        #232 <Field float u>
	//*  40   66:fmul            
	//*  41   67:f2i             
	//*  42   68:icmpge          74
				flag1 = true;
	//   43   71:iconst_1        
	//   44   72:istore          4
			return flag1;
	//   45   74:iload           4
	//   46   76:ireturn         
		} else
		{
			return false;
	//   47   77:iconst_0        
	//   48   78:ireturn         
		}
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof am) && super.checkLayoutParams(layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #412 <Class am>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #752 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void computeScroll()
	{
		n = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #600 <Field boolean n>
		if(!m.isFinished() && m.computeScrollOffset())
	//*   3    5:aload_0         
	//*   4    6:getfield        #194 <Field Scroller m>
	//*   5    9:invokevirtual   #199 <Method boolean Scroller.isFinished()>
	//*   6   12:ifne            97
	//*   7   15:aload_0         
	//*   8   16:getfield        #194 <Field Scroller m>
	//*   9   19:invokevirtual   #756 <Method boolean Scroller.computeScrollOffset()>
	//*  10   22:ifeq            97
		{
			int i1 = getScrollX();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #218 <Method int getScrollX()>
	//   13   29:istore_1        
			int j1 = getScrollY();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #221 <Method int getScrollY()>
	//   16   34:istore_2        
			int k1 = m.getCurrX();
	//   17   35:aload_0         
	//   18   36:getfield        #194 <Field Scroller m>
	//   19   39:invokevirtual   #303 <Method int Scroller.getCurrX()>
	//   20   42:istore_3        
			int l1 = m.getCurrY();
	//   21   43:aload_0         
	//   22   44:getfield        #194 <Field Scroller m>
	//   23   47:invokevirtual   #306 <Method int Scroller.getCurrY()>
	//   24   50:istore          4
			if(i1 != k1 || j1 != l1)
	//*  25   52:iload_1         
	//*  26   53:iload_3         
	//*  27   54:icmpne          63
	//*  28   57:iload_2         
	//*  29   58:iload           4
	//*  30   60:icmpeq          92
			{
				scrollTo(k1, l1);
	//   31   63:aload_0         
	//   32   64:iload_3         
	//   33   65:iload           4
	//   34   67:invokevirtual   #225 <Method void scrollTo(int, int)>
				if(!d(k1))
	//*  35   70:aload_0         
	//*  36   71:iload_3         
	//*  37   72:invokespecial   #251 <Method boolean d(int)>
	//*  38   75:ifne            92
				{
					m.abortAnimation();
	//   39   78:aload_0         
	//   40   79:getfield        #194 <Field Scroller m>
	//   41   82:invokevirtual   #300 <Method void Scroller.abortAnimation()>
					scrollTo(0, l1);
	//   42   85:aload_0         
	//   43   86:iconst_0        
	//   44   87:iload           4
	//   45   89:invokevirtual   #225 <Method void scrollTo(int, int)>
				}
			}
			android.support.v4.view.ac.d(((View) (this)));
	//   46   92:aload_0         
	//   47   93:invokestatic    #623 <Method void ac.d(View)>
			return;
	//   48   96:return          
		} else
		{
			a(true);
	//   49   97:aload_0         
	//   50   98:iconst_1        
	//   51   99:invokespecial   #238 <Method void a(boolean)>
			return;
	//   52  102:return          
		}
	}

	boolean d()
	{
		z z1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field z b>
	//    2    4:astore_1        
		if(z1 != null && c < z1.a() - 1)
	//*   3    5:aload_1         
	//*   4    6:ifnull          35
	//*   5    9:aload_0         
	//*   6   10:getfield        #120 <Field int c>
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #258 <Method int z.a()>
	//*   9   17:iconst_1        
	//*  10   18:isub            
	//*  11   19:icmpge          35
		{
			a(c + 1, true);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #120 <Field int c>
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:iconst_1        
	//   18   30:invokevirtual   #712 <Method void a(int, boolean)>
			return true;
	//   19   33:iconst_1        
	//   20   34:ireturn         
		} else
		{
			return false;
	//   21   35:iconst_0        
	//   22   36:ireturn         
		}
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		return super.dispatchKeyEvent(keyevent) || a(keyevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #759 <Method boolean ViewGroup.dispatchKeyEvent(KeyEvent)>
	//    3    5:ifne            21
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #761 <Method boolean a(KeyEvent)>
	//    7   13:ifeq            19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		if(accessibilityevent.getEventType() == 4096)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #768 <Method int AccessibilityEvent.getEventType()>
	//*   2    4:sipush          4096
	//*   3    7:icmpne          16
			return super.dispatchPopulateAccessibilityEvent(accessibilityevent);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokespecial   #770 <Method boolean ViewGroup.dispatchPopulateAccessibilityEvent(AccessibilityEvent)>
	//    7   15:ireturn         
		int j1 = getChildCount();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #346 <Method int getChildCount()>
	//   10   20:istore_3        
		for(int i1 = 0; i1 < j1; i1++)
	//*  11   21:iconst_0        
	//*  12   22:istore_2        
	//*  13   23:iload_2         
	//*  14   24:iload_3         
	//*  15   25:icmpge          86
		{
			View view = getChildAt(i1);
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #352 <Method View getChildAt(int)>
	//   19   33:astore          4
			if(view.getVisibility() != 0)
				continue;
	//   20   35:aload           4
	//   21   37:invokevirtual   #670 <Method int View.getVisibility()>
	//   22   40:ifne            79
			al al1 = a(view);
	//   23   43:aload_0         
	//   24   44:aload           4
	//   25   46:invokevirtual   #522 <Method al a(View)>
	//   26   49:astore          5
			if(al1 != null && al1.b == c && view.dispatchPopulateAccessibilityEvent(accessibilityevent))
	//*  27   51:aload           5
	//*  28   53:ifnull          79
	//*  29   56:aload           5
	//*  30   58:getfield        #138 <Field int al.b>
	//*  31   61:aload_0         
	//*  32   62:getfield        #120 <Field int c>
	//*  33   65:icmpne          79
	//*  34   68:aload           4
	//*  35   70:aload_1         
	//*  36   71:invokevirtual   #771 <Method boolean View.dispatchPopulateAccessibilityEvent(AccessibilityEvent)>
	//*  37   74:ifeq            79
				return true;
	//   38   77:iconst_1        
	//   39   78:ireturn         
		}

	//   40   79:iload_2         
	//   41   80:iconst_1        
	//   42   81:iadd            
	//   43   82:istore_2        
	//*  44   83:goto            23
		return false;
	//   45   86:iconst_0        
	//   46   87:ireturn         
	}

	public void draw(Canvas canvas)
	{
		int j1;
label0:
		{
			int i1;
label1:
			{
				super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #775 <Method void ViewGroup.draw(Canvas)>
				int k1 = getOverScrollMode();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #778 <Method int getOverScrollMode()>
	//    5    9:istore          4
				j1 = 0;
	//    6   11:iconst_0        
	//    7   12:istore_3        
				i1 = 0;
	//    8   13:iconst_0        
	//    9   14:istore_2        
				if(k1 == 0)
					break label1;
	//   10   15:iload           4
	//   11   17:ifeq            66
				if(k1 == 1)
	//*  12   20:iload           4
	//*  13   22:iconst_1        
	//*  14   23:icmpne          49
				{
					z z1 = b;
	//   15   26:aload_0         
	//   16   27:getfield        #254 <Field z b>
	//   17   30:astore          8
					if(z1 != null && z1.a() > 1)
	//*  18   32:aload           8
	//*  19   34:ifnull          49
	//*  20   37:aload           8
	//*  21   39:invokevirtual   #258 <Method int z.a()>
	//*  22   42:iconst_1        
	//*  23   43:icmple          49
						break label1;
	//   24   46:goto            66
				}
				R.finish();
	//   25   49:aload_0         
	//   26   50:getfield        #359 <Field EdgeEffect R>
	//   27   53:invokevirtual   #781 <Method void EdgeEffect.finish()>
				S.finish();
	//   28   56:aload_0         
	//   29   57:getfield        #370 <Field EdgeEffect S>
	//   30   60:invokevirtual   #781 <Method void EdgeEffect.finish()>
				break label0;
	//   31   63:goto            256
			}
			if(!R.isFinished())
	//*  32   66:aload_0         
	//*  33   67:getfield        #359 <Field EdgeEffect R>
	//*  34   70:invokevirtual   #443 <Method boolean EdgeEffect.isFinished()>
	//*  35   73:ifne            155
			{
				j1 = canvas.save();
	//   36   76:aload_1         
	//   37   77:invokevirtual   #786 <Method int Canvas.save()>
	//   38   80:istore_3        
				i1 = getHeight() - getPaddingTop() - getPaddingBottom();
	//   39   81:aload_0         
	//   40   82:invokevirtual   #789 <Method int getHeight()>
	//   41   85:aload_0         
	//   42   86:invokevirtual   #792 <Method int getPaddingTop()>
	//   43   89:isub            
	//   44   90:aload_0         
	//   45   91:invokevirtual   #795 <Method int getPaddingBottom()>
	//   46   94:isub            
	//   47   95:istore_2        
				int l1 = getWidth();
	//   48   96:aload_0         
	//   49   97:invokevirtual   #328 <Method int getWidth()>
	//   50  100:istore          4
				canvas.rotate(270F);
	//   51  102:aload_1         
	//   52  103:ldc2            #796 <Float 270F>
	//   53  106:invokevirtual   #799 <Method void Canvas.rotate(float)>
				canvas.translate(-i1 + getPaddingTop(), t * (float)l1);
	//   54  109:aload_1         
	//   55  110:iload_2         
	//   56  111:ineg            
	//   57  112:aload_0         
	//   58  113:invokevirtual   #792 <Method int getPaddingTop()>
	//   59  116:iadd            
	//   60  117:i2f             
	//   61  118:aload_0         
	//   62  119:getfield        #241 <Field float t>
	//   63  122:iload           4
	//   64  124:i2f             
	//   65  125:fmul            
	//   66  126:invokevirtual   #803 <Method void Canvas.translate(float, float)>
				R.setSize(i1, l1);
	//   67  129:aload_0         
	//   68  130:getfield        #359 <Field EdgeEffect R>
	//   69  133:iload_2         
	//   70  134:iload           4
	//   71  136:invokevirtual   #806 <Method void EdgeEffect.setSize(int, int)>
				i1 = ((int) (false | R.draw(canvas)));
	//   72  139:iconst_0        
	//   73  140:aload_0         
	//   74  141:getfield        #359 <Field EdgeEffect R>
	//   75  144:aload_1         
	//   76  145:invokevirtual   #809 <Method boolean EdgeEffect.draw(Canvas)>
	//   77  148:ior             
	//   78  149:istore_2        
				canvas.restoreToCount(j1);
	//   79  150:aload_1         
	//   80  151:iload_3         
	//   81  152:invokevirtual   #812 <Method void Canvas.restoreToCount(int)>
			}
			j1 = i1;
	//   82  155:iload_2         
	//   83  156:istore_3        
			if(!S.isFinished())
	//*  84  157:aload_0         
	//*  85  158:getfield        #370 <Field EdgeEffect S>
	//*  86  161:invokevirtual   #443 <Method boolean EdgeEffect.isFinished()>
	//*  87  164:ifne            256
			{
				int i2 = canvas.save();
	//   88  167:aload_1         
	//   89  168:invokevirtual   #786 <Method int Canvas.save()>
	//   90  171:istore          4
				j1 = getWidth();
	//   91  173:aload_0         
	//   92  174:invokevirtual   #328 <Method int getWidth()>
	//   93  177:istore_3        
				int j2 = getHeight();
	//   94  178:aload_0         
	//   95  179:invokevirtual   #789 <Method int getHeight()>
	//   96  182:istore          5
				int k2 = getPaddingTop();
	//   97  184:aload_0         
	//   98  185:invokevirtual   #792 <Method int getPaddingTop()>
	//   99  188:istore          6
				int l2 = getPaddingBottom();
	//  100  190:aload_0         
	//  101  191:invokevirtual   #795 <Method int getPaddingBottom()>
	//  102  194:istore          7
				canvas.rotate(90F);
	//  103  196:aload_1         
	//  104  197:ldc2            #813 <Float 90F>
	//  105  200:invokevirtual   #799 <Method void Canvas.rotate(float)>
				canvas.translate(-getPaddingTop(), -(u + 1.0F) * (float)j1);
	//  106  203:aload_1         
	//  107  204:aload_0         
	//  108  205:invokevirtual   #792 <Method int getPaddingTop()>
	//  109  208:ineg            
	//  110  209:i2f             
	//  111  210:aload_0         
	//  112  211:getfield        #232 <Field float u>
	//  113  214:fconst_1        
	//  114  215:fadd            
	//  115  216:fneg            
	//  116  217:iload_3         
	//  117  218:i2f             
	//  118  219:fmul            
	//  119  220:invokevirtual   #803 <Method void Canvas.translate(float, float)>
				S.setSize(j2 - k2 - l2, j1);
	//  120  223:aload_0         
	//  121  224:getfield        #370 <Field EdgeEffect S>
	//  122  227:iload           5
	//  123  229:iload           6
	//  124  231:isub            
	//  125  232:iload           7
	//  126  234:isub            
	//  127  235:iload_3         
	//  128  236:invokevirtual   #806 <Method void EdgeEffect.setSize(int, int)>
				j1 = i1 | S.draw(canvas);
	//  129  239:iload_2         
	//  130  240:aload_0         
	//  131  241:getfield        #370 <Field EdgeEffect S>
	//  132  244:aload_1         
	//  133  245:invokevirtual   #809 <Method boolean EdgeEffect.draw(Canvas)>
	//  134  248:ior             
	//  135  249:istore_3        
				canvas.restoreToCount(i2);
	//  136  250:aload_1         
	//  137  251:iload           4
	//  138  253:invokevirtual   #812 <Method void Canvas.restoreToCount(int)>
			}
		}
		if(j1 != 0)
	//* 139  256:iload_3         
	//* 140  257:ifeq            264
			android.support.v4.view.ac.d(((View) (this)));
	//  141  260:aload_0         
	//  142  261:invokestatic    #623 <Method void ac.d(View)>
	//  143  264:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #816 <Method void ViewGroup.drawableStateChanged()>
		Drawable drawable = q;
	//    2    4:aload_0         
	//    3    5:getfield        #818 <Field Drawable q>
	//    4    8:astore_1        
		if(drawable != null && drawable.isStateful())
	//*   5    9:aload_1         
	//*   6   10:ifnull          29
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #823 <Method boolean Drawable.isStateful()>
	//*   9   17:ifeq            29
			drawable.setState(getDrawableState());
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #827 <Method int[] getDrawableState()>
	//   13   25:invokevirtual   #831 <Method boolean Drawable.setState(int[])>
	//   14   28:pop             
	//   15   29:return          
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new am()));
	//    0    0:new             #412 <Class am>
	//    1    3:dup             
	//    2    4:invokespecial   #833 <Method void am()>
	//    3    7:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new am(getContext(), attributeset)));
	//    0    0:new             #412 <Class am>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #838 <Method android.content.Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #841 <Method void am(android.content.Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return generateDefaultLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #843 <Method android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public z getAdapter()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field z b>
	//    2    4:areturn         
	}

	protected int getChildDrawingOrder(int i1, int j1)
	{
		int k1 = j1;
	//    0    0:iload_2         
	//    1    1:istore_3        
		if(ag == 2)
	//*   2    2:aload_0         
	//*   3    3:getfield        #421 <Field int ag>
	//*   4    6:iconst_2        
	//*   5    7:icmpne          16
			k1 = i1 - 1 - j1;
	//    6   10:iload_1         
	//    7   11:iconst_1        
	//    8   12:isub            
	//    9   13:iload_2         
	//   10   14:isub            
	//   11   15:istore_3        
		return ((am)((View)ah.get(k1)).getLayoutParams()).f;
	//   12   16:aload_0         
	//   13   17:getfield        #423 <Field ArrayList ah>
	//   14   20:iload_3         
	//   15   21:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   16   24:checkcast       #155 <Class View>
	//   17   27:invokevirtual   #410 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   30:checkcast       #412 <Class am>
	//   19   33:getfield        #520 <Field int am.f>
	//   20   36:ireturn         
	}

	public int getCurrentItem()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field int c>
	//    2    4:ireturn         
	}

	public int getOffscreenPageLimit()
	{
		return A;
	//    0    0:aload_0         
	//    1    1:getfield        #482 <Field int A>
	//    2    4:ireturn         
	}

	public int getPageMargin()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field int p>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #851 <Method void ViewGroup.onAttachedToWindow()>
		T = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #393 <Field boolean T>
	//    5    9:return          
	}

	protected void onDetachedFromWindow()
	{
		removeCallbacks(aj);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #312 <Field Runnable aj>
	//    3    5:invokevirtual   #856 <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		Scroller scroller = m;
	//    5    9:aload_0         
	//    6   10:getfield        #194 <Field Scroller m>
	//    7   13:astore_1        
		if(scroller != null && !scroller.isFinished())
	//*   8   14:aload_1         
	//*   9   15:ifnull          32
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #199 <Method boolean Scroller.isFinished()>
	//*  12   22:ifne            32
			m.abortAnimation();
	//   13   25:aload_0         
	//   14   26:getfield        #194 <Field Scroller m>
	//   15   29:invokevirtual   #300 <Method void Scroller.abortAnimation()>
		super.onDetachedFromWindow();
	//   16   32:aload_0         
	//   17   33:invokespecial   #858 <Method void ViewGroup.onDetachedFromWindow()>
	//   18   36:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #861 <Method void ViewGroup.onDraw(Canvas)>
		if(p > 0 && q != null && g.size() > 0 && b != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #260 <Field int p>
	//*   5    9:ifle            333
	//*   6   12:aload_0         
	//*   7   13:getfield        #818 <Field Drawable q>
	//*   8   16:ifnull          333
	//*   9   19:aload_0         
	//*  10   20:getfield        #124 <Field ArrayList g>
	//*  11   23:invokevirtual   #130 <Method int ArrayList.size()>
	//*  12   26:ifle            333
	//*  13   29:aload_0         
	//*  14   30:getfield        #254 <Field z b>
	//*  15   33:ifnull          333
		{
			int k1 = getScrollX();
	//   16   36:aload_0         
	//   17   37:invokevirtual   #218 <Method int getScrollX()>
	//   18   40:istore          9
			int l1 = getWidth();
	//   19   42:aload_0         
	//   20   43:invokevirtual   #328 <Method int getWidth()>
	//   21   46:istore          10
			float f1 = p;
	//   22   48:aload_0         
	//   23   49:getfield        #260 <Field int p>
	//   24   52:i2f             
	//   25   53:fstore_2        
			float f5 = l1;
	//   26   54:iload           10
	//   27   56:i2f             
	//   28   57:fstore          6
			float f2 = f1 / f5;
	//   29   59:fload_2         
	//   30   60:fload           6
	//   31   62:fdiv            
	//   32   63:fstore_3        
			Object obj = ((Object) (g));
	//   33   64:aload_0         
	//   34   65:getfield        #124 <Field ArrayList g>
	//   35   68:astore          13
			int j1 = 0;
	//   36   70:iconst_0        
	//   37   71:istore          8
			obj = ((Object) ((al)((ArrayList) (obj)).get(0)));
	//   38   73:aload           13
	//   39   75:iconst_0        
	//   40   76:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   41   79:checkcast       #136 <Class al>
	//   42   82:astore          13
			f1 = ((al) (obj)).e;
	//   43   84:aload           13
	//   44   86:getfield        #230 <Field float al.e>
	//   45   89:fstore_2        
			int i2 = g.size();
	//   46   90:aload_0         
	//   47   91:getfield        #124 <Field ArrayList g>
	//   48   94:invokevirtual   #130 <Method int ArrayList.size()>
	//   49   97:istore          11
			int i1 = ((al) (obj)).b;
	//   50   99:aload           13
	//   51  101:getfield        #138 <Field int al.b>
	//   52  104:istore          7
			for(int j2 = ((al)g.get(i2 - 1)).b; i1 < j2; i1++)
	//*  53  106:aload_0         
	//*  54  107:getfield        #124 <Field ArrayList g>
	//*  55  110:iload           11
	//*  56  112:iconst_1        
	//*  57  113:isub            
	//*  58  114:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//*  59  117:checkcast       #136 <Class al>
	//*  60  120:getfield        #138 <Field int al.b>
	//*  61  123:istore          12
	//*  62  125:iload           7
	//*  63  127:iload           12
	//*  64  129:icmpge          333
			{
				for(; i1 > ((al) (obj)).b && j1 < i2; obj = ((Object) ((al)((ArrayList) (obj)).get(j1))))
	//*  65  132:iload           7
	//*  66  134:aload           13
	//*  67  136:getfield        #138 <Field int al.b>
	//*  68  139:icmple          176
	//*  69  142:iload           8
	//*  70  144:iload           11
	//*  71  146:icmpge          176
				{
					obj = ((Object) (g));
	//   72  149:aload_0         
	//   73  150:getfield        #124 <Field ArrayList g>
	//   74  153:astore          13
					j1++;
	//   75  155:iload           8
	//   76  157:iconst_1        
	//   77  158:iadd            
	//   78  159:istore          8
				}

	//   79  161:aload           13
	//   80  163:iload           8
	//   81  165:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   82  168:checkcast       #136 <Class al>
	//   83  171:astore          13
	//*  84  173:goto            132
				float f3;
				if(i1 == ((al) (obj)).b)
	//*  85  176:iload           7
	//*  86  178:aload           13
	//*  87  180:getfield        #138 <Field int al.b>
	//*  88  183:icmpne          219
				{
					f3 = (((al) (obj)).e + ((al) (obj)).d) * f5;
	//   89  186:aload           13
	//   90  188:getfield        #230 <Field float al.e>
	//   91  191:aload           13
	//   92  193:getfield        #262 <Field float al.d>
	//   93  196:fadd            
	//   94  197:fload           6
	//   95  199:fmul            
	//   96  200:fstore          4
					f1 = ((al) (obj)).e + ((al) (obj)).d + f2;
	//   97  202:aload           13
	//   98  204:getfield        #230 <Field float al.e>
	//   99  207:aload           13
	//  100  209:getfield        #262 <Field float al.d>
	//  101  212:fadd            
	//  102  213:fload_3         
	//  103  214:fadd            
	//  104  215:fstore_2        
				} else
	//* 105  216:goto            254
				{
					float f4 = b.a(i1);
	//  106  219:aload_0         
	//  107  220:getfield        #254 <Field z b>
	//  108  223:iload           7
	//  109  225:invokevirtual   #265 <Method float z.a(int)>
	//  110  228:fstore          5
					f3 = f1 + (f4 + f2);
	//  111  230:fload_2         
	//  112  231:fload           5
	//  113  233:fload_3         
	//  114  234:fadd            
	//  115  235:fadd            
	//  116  236:fstore          4
					f4 = (f1 + f4) * f5;
	//  117  238:fload_2         
	//  118  239:fload           5
	//  119  241:fadd            
	//  120  242:fload           6
	//  121  244:fmul            
	//  122  245:fstore          5
					f1 = f3;
	//  123  247:fload           4
	//  124  249:fstore_2        
					f3 = f4;
	//  125  250:fload           5
	//  126  252:fstore          4
				}
				if((float)p + f3 > (float)k1)
	//* 127  254:aload_0         
	//* 128  255:getfield        #260 <Field int p>
	//* 129  258:i2f             
	//* 130  259:fload           4
	//* 131  261:fadd            
	//* 132  262:iload           9
	//* 133  264:i2f             
	//* 134  265:fcmpl           
	//* 135  266:ifle            311
				{
					q.setBounds(Math.round(f3), r, Math.round((float)p + f3), s);
	//  136  269:aload_0         
	//  137  270:getfield        #818 <Field Drawable q>
	//  138  273:fload           4
	//  139  275:invokestatic    #615 <Method int Math.round(float)>
	//  140  278:aload_0         
	//  141  279:getfield        #863 <Field int r>
	//  142  282:aload_0         
	//  143  283:getfield        #260 <Field int p>
	//  144  286:i2f             
	//  145  287:fload           4
	//  146  289:fadd            
	//  147  290:invokestatic    #615 <Method int Math.round(float)>
	//  148  293:aload_0         
	//  149  294:getfield        #865 <Field int s>
	//  150  297:invokevirtual   #868 <Method void Drawable.setBounds(int, int, int, int)>
					q.draw(canvas);
	//  151  300:aload_0         
	//  152  301:getfield        #818 <Field Drawable q>
	//  153  304:aload_1         
	//  154  305:invokevirtual   #869 <Method void Drawable.draw(Canvas)>
				}
	//* 155  308:goto            311
				if(f3 > (float)(k1 + l1))
	//* 156  311:fload           4
	//* 157  313:iload           9
	//* 158  315:iload           10
	//* 159  317:iadd            
	//* 160  318:i2f             
	//* 161  319:fcmpl           
	//* 162  320:ifle            324
					return;
	//  163  323:return          
			}

	//  164  324:iload           7
	//  165  326:iconst_1        
	//  166  327:iadd            
	//  167  328:istore          7
		}
	//* 168  330:goto            125
	//  169  333:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i1 = motionevent.getAction() & 0xff;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #872 <Method int MotionEvent.getAction()>
	//    2    4:sipush          255
	//    3    7:iand            
	//    4    8:istore          7
		if(i1 != 3 && i1 != 1)
	//*   5   10:iload           7
	//*   6   12:iconst_3        
	//*   7   13:icmpeq          479
	//*   8   16:iload           7
	//*   9   18:iconst_1        
	//*  10   19:icmpne          25
	//*  11   22:goto            479
		{
			if(i1 != 0)
	//*  12   25:iload           7
	//*  13   27:ifeq            48
			{
				if(B)
	//*  14   30:aload_0         
	//*  15   31:getfield        #450 <Field boolean B>
	//*  16   34:ifeq            39
					return true;
	//   17   37:iconst_1        
	//   18   38:ireturn         
				if(C)
	//*  19   39:aload_0         
	//*  20   40:getfield        #452 <Field boolean C>
	//*  21   43:ifeq            48
					return false;
	//   22   46:iconst_0        
	//   23   47:ireturn         
			}
			if(i1 != 0)
	//*  24   48:iload           7
	//*  25   50:ifeq            318
			{
				if(i1 != 2)
	//*  26   53:iload           7
	//*  27   55:iconst_2        
	//*  28   56:icmpeq          77
				{
					if(i1 == 6)
	//*  29   59:iload           7
	//*  30   61:bipush          6
	//*  31   63:icmpeq          69
	//*  32   66:goto            452
						a(motionevent);
	//   33   69:aload_0         
	//   34   70:aload_1         
	//   35   71:invokespecial   #874 <Method void a(MotionEvent)>
				} else
	//*  36   74:goto            452
				{
					int j1 = K;
	//   37   77:aload_0         
	//   38   78:getfield        #280 <Field int K>
	//   39   81:istore          7
					if(j1 != -1)
	//*  40   83:iload           7
	//*  41   85:iconst_m1       
	//*  42   86:icmpne          92
	//*  43   89:goto            452
					{
						j1 = motionevent.findPointerIndex(j1);
	//   44   92:aload_1         
	//   45   93:iload           7
	//   46   95:invokevirtual   #877 <Method int MotionEvent.findPointerIndex(int)>
	//   47   98:istore          7
						float f3 = motionevent.getX(j1);
	//   48  100:aload_1         
	//   49  101:iload           7
	//   50  103:invokevirtual   #283 <Method float MotionEvent.getX(int)>
	//   51  106:fstore_3        
						float f1 = f3 - G;
	//   52  107:fload_3         
	//   53  108:aload_0         
	//   54  109:getfield        #285 <Field float G>
	//   55  112:fsub            
	//   56  113:fstore_2        
						float f5 = Math.abs(f1);
	//   57  114:fload_2         
	//   58  115:invokestatic    #362 <Method float Math.abs(float)>
	//   59  118:fstore          5
						float f4 = motionevent.getY(j1);
	//   60  120:aload_1         
	//   61  121:iload           7
	//   62  123:invokevirtual   #880 <Method float MotionEvent.getY(int)>
	//   63  126:fstore          4
						float f6 = Math.abs(f4 - J);
	//   64  128:fload           4
	//   65  130:aload_0         
	//   66  131:getfield        #882 <Field float J>
	//   67  134:fsub            
	//   68  135:invokestatic    #362 <Method float Math.abs(float)>
	//   69  138:fstore          6
						if(f1 != 0.0F && !a(G, f1) && a(((View) (this)), false, (int)f1, (int)f3, (int)f4))
	//*  70  140:fload_2         
	//*  71  141:fconst_0        
	//*  72  142:fcmpl           
	//*  73  143:ifeq            192
	//*  74  146:aload_0         
	//*  75  147:aload_0         
	//*  76  148:getfield        #285 <Field float G>
	//*  77  151:fload_2         
	//*  78  152:invokespecial   #884 <Method boolean a(float, float)>
	//*  79  155:ifne            192
	//*  80  158:aload_0         
	//*  81  159:aload_0         
	//*  82  160:iconst_0        
	//*  83  161:fload_2         
	//*  84  162:f2i             
	//*  85  163:fload_3         
	//*  86  164:f2i             
	//*  87  165:fload           4
	//*  88  167:f2i             
	//*  89  168:invokevirtual   #658 <Method boolean a(View, boolean, int, int, int)>
	//*  90  171:ifeq            192
						{
							G = f3;
	//   91  174:aload_0         
	//   92  175:fload_3         
	//   93  176:putfield        #285 <Field float G>
							H = f4;
	//   94  179:aload_0         
	//   95  180:fload           4
	//   96  182:putfield        #886 <Field float H>
							C = true;
	//   97  185:aload_0         
	//   98  186:iconst_1        
	//   99  187:putfield        #452 <Field boolean C>
							return false;
	//  100  190:iconst_0        
	//  101  191:ireturn         
						}
						if(f5 > (float)F && f5 * 0.5F > f6)
	//* 102  192:fload           5
	//* 103  194:aload_0         
	//* 104  195:getfield        #888 <Field int F>
	//* 105  198:i2f             
	//* 106  199:fcmpl           
	//* 107  200:ifle            280
	//* 108  203:fload           5
	//* 109  205:ldc2            #458 <Float 0.5F>
	//* 110  208:fmul            
	//* 111  209:fload           6
	//* 112  211:fcmpl           
	//* 113  212:ifle            280
						{
							B = true;
	//  114  215:aload_0         
	//  115  216:iconst_1        
	//  116  217:putfield        #450 <Field boolean B>
							c(true);
	//  117  220:aload_0         
	//  118  221:iconst_1        
	//  119  222:invokespecial   #890 <Method void c(boolean)>
							setScrollState(1);
	//  120  225:aload_0         
	//  121  226:iconst_1        
	//  122  227:invokevirtual   #608 <Method void setScrollState(int)>
							if(f1 > 0.0F)
	//* 123  230:fload_2         
	//* 124  231:fconst_0        
	//* 125  232:fcmpl           
	//* 126  233:ifle            250
								f1 = I + (float)F;
	//  127  236:aload_0         
	//  128  237:getfield        #892 <Field float I>
	//  129  240:aload_0         
	//  130  241:getfield        #888 <Field int F>
	//  131  244:i2f             
	//  132  245:fadd            
	//  133  246:fstore_2        
							else
	//* 134  247:goto            261
								f1 = I - (float)F;
	//  135  250:aload_0         
	//  136  251:getfield        #892 <Field float I>
	//  137  254:aload_0         
	//  138  255:getfield        #888 <Field int F>
	//  139  258:i2f             
	//  140  259:fsub            
	//  141  260:fstore_2        
							G = f1;
	//  142  261:aload_0         
	//  143  262:fload_2         
	//  144  263:putfield        #285 <Field float G>
							H = f4;
	//  145  266:aload_0         
	//  146  267:fload           4
	//  147  269:putfield        #886 <Field float H>
							setScrollingCacheEnabled(true);
	//  148  272:aload_0         
	//  149  273:iconst_1        
	//  150  274:invokespecial   #297 <Method void setScrollingCacheEnabled(boolean)>
						} else
	//* 151  277:goto            296
						if(f6 > (float)F)
	//* 152  280:fload           6
	//* 153  282:aload_0         
	//* 154  283:getfield        #888 <Field int F>
	//* 155  286:i2f             
	//* 156  287:fcmpl           
	//* 157  288:ifle            296
							C = true;
	//  158  291:aload_0         
	//  159  292:iconst_1        
	//  160  293:putfield        #452 <Field boolean C>
						if(B && b(f3))
	//* 161  296:aload_0         
	//* 162  297:getfield        #450 <Field boolean B>
	//* 163  300:ifeq            452
	//* 164  303:aload_0         
	//* 165  304:fload_3         
	//* 166  305:invokespecial   #894 <Method boolean b(float)>
	//* 167  308:ifeq            452
							android.support.v4.view.ac.d(((View) (this)));
	//  168  311:aload_0         
	//  169  312:invokestatic    #623 <Method void ac.d(View)>
					}
				}
			} else
	//* 170  315:goto            452
			{
				float f2 = motionevent.getX();
	//  171  318:aload_1         
	//  172  319:invokevirtual   #897 <Method float MotionEvent.getX()>
	//  173  322:fstore_2        
				I = f2;
	//  174  323:aload_0         
	//  175  324:fload_2         
	//  176  325:putfield        #892 <Field float I>
				G = f2;
	//  177  328:aload_0         
	//  178  329:fload_2         
	//  179  330:putfield        #285 <Field float G>
				f2 = motionevent.getY();
	//  180  333:aload_1         
	//  181  334:invokevirtual   #899 <Method float MotionEvent.getY()>
	//  182  337:fstore_2        
				J = f2;
	//  183  338:aload_0         
	//  184  339:fload_2         
	//  185  340:putfield        #882 <Field float J>
				H = f2;
	//  186  343:aload_0         
	//  187  344:fload_2         
	//  188  345:putfield        #886 <Field float H>
				K = motionevent.getPointerId(0);
	//  189  348:aload_0         
	//  190  349:aload_1         
	//  191  350:iconst_0        
	//  192  351:invokevirtual   #278 <Method int MotionEvent.getPointerId(int)>
	//  193  354:putfield        #280 <Field int K>
				C = false;
	//  194  357:aload_0         
	//  195  358:iconst_0        
	//  196  359:putfield        #452 <Field boolean C>
				n = true;
	//  197  362:aload_0         
	//  198  363:iconst_1        
	//  199  364:putfield        #600 <Field boolean n>
				m.computeScrollOffset();
	//  200  367:aload_0         
	//  201  368:getfield        #194 <Field Scroller m>
	//  202  371:invokevirtual   #756 <Method boolean Scroller.computeScrollOffset()>
	//  203  374:pop             
				if(ak == 2 && Math.abs(m.getFinalX() - m.getCurrX()) > P)
	//* 204  375:aload_0         
	//* 205  376:getfield        #294 <Field int ak>
	//* 206  379:iconst_2        
	//* 207  380:icmpne          442
	//* 208  383:aload_0         
	//* 209  384:getfield        #194 <Field Scroller m>
	//* 210  387:invokevirtual   #902 <Method int Scroller.getFinalX()>
	//* 211  390:aload_0         
	//* 212  391:getfield        #194 <Field Scroller m>
	//* 213  394:invokevirtual   #303 <Method int Scroller.getCurrX()>
	//* 214  397:isub            
	//* 215  398:invokestatic    #114 <Method int Math.abs(int)>
	//* 216  401:aload_0         
	//* 217  402:getfield        #904 <Field int P>
	//* 218  405:icmple          442
				{
					m.abortAnimation();
	//  219  408:aload_0         
	//  220  409:getfield        #194 <Field Scroller m>
	//  221  412:invokevirtual   #300 <Method void Scroller.abortAnimation()>
					z = false;
	//  222  415:aload_0         
	//  223  416:iconst_0        
	//  224  417:putfield        #308 <Field boolean z>
					b();
	//  225  420:aload_0         
	//  226  421:invokevirtual   #605 <Method void b()>
					B = true;
	//  227  424:aload_0         
	//  228  425:iconst_1        
	//  229  426:putfield        #450 <Field boolean B>
					c(true);
	//  230  429:aload_0         
	//  231  430:iconst_1        
	//  232  431:invokespecial   #890 <Method void c(boolean)>
					setScrollState(1);
	//  233  434:aload_0         
	//  234  435:iconst_1        
	//  235  436:invokevirtual   #608 <Method void setScrollState(int)>
				} else
	//* 236  439:goto            452
				{
					a(false);
	//  237  442:aload_0         
	//  238  443:iconst_0        
	//  239  444:invokespecial   #238 <Method void a(boolean)>
					B = false;
	//  240  447:aload_0         
	//  241  448:iconst_0        
	//  242  449:putfield        #450 <Field boolean B>
				}
			}
			if(L == null)
	//* 243  452:aload_0         
	//* 244  453:getfield        #287 <Field VelocityTracker L>
	//* 245  456:ifnonnull       466
				L = VelocityTracker.obtain();
	//  246  459:aload_0         
	//  247  460:invokestatic    #908 <Method VelocityTracker VelocityTracker.obtain()>
	//  248  463:putfield        #287 <Field VelocityTracker L>
			L.addMovement(motionevent);
	//  249  466:aload_0         
	//  250  467:getfield        #287 <Field VelocityTracker L>
	//  251  470:aload_1         
	//  252  471:invokevirtual   #911 <Method void VelocityTracker.addMovement(MotionEvent)>
			return B;
	//  253  474:aload_0         
	//  254  475:getfield        #450 <Field boolean B>
	//  255  478:ireturn         
		} else
		{
			g();
	//  256  479:aload_0         
	//  257  480:invokespecial   #913 <Method boolean g()>
	//  258  483:pop             
			return false;
	//  259  484:iconst_0        
	//  260  485:ireturn         
		}
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		int i4 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #346 <Method int getChildCount()>
	//    2    4:istore          14
		int j4 = k1 - i1;
	//    3    6:iload           4
	//    4    8:iload_2         
	//    5    9:isub            
	//    6   10:istore          15
		int k4 = l1 - j1;
	//    7   12:iload           5
	//    8   14:iload_3         
	//    9   15:isub            
	//   10   16:istore          16
		j1 = getPaddingLeft();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #212 <Method int getPaddingLeft()>
	//   13   22:istore_3        
		i1 = getPaddingTop();
	//   14   23:aload_0         
	//   15   24:invokevirtual   #792 <Method int getPaddingTop()>
	//   16   27:istore_2        
		int k2 = getPaddingRight();
	//   17   28:aload_0         
	//   18   29:invokevirtual   #215 <Method int getPaddingRight()>
	//   19   32:istore          8
		l1 = getPaddingBottom();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #795 <Method int getPaddingBottom()>
	//   22   38:istore          5
		int l4 = getScrollX();
	//   23   40:aload_0         
	//   24   41:invokevirtual   #218 <Method int getScrollX()>
	//   25   44:istore          17
		int l2 = 0;
	//   26   46:iconst_0        
	//   27   47:istore          9
		for(int i3 = 0; i3 < i4;)
	//*  28   49:iconst_0        
	//*  29   50:istore          10
	//*  30   52:iload           10
	//*  31   54:iload           14
	//*  32   56:icmpge          402
		{
			View view = getChildAt(i3);
	//   33   59:aload_0         
	//   34   60:iload           10
	//   35   62:invokevirtual   #352 <Method View getChildAt(int)>
	//   36   65:astore          18
			int i2 = j1;
	//   37   67:iload_3         
	//   38   68:istore          7
			int l3 = k2;
	//   39   70:iload           8
	//   40   72:istore          13
			int k3 = i1;
	//   41   74:iload_2         
	//   42   75:istore          12
			int j3 = l1;
	//   43   77:iload           5
	//   44   79:istore          11
			k1 = l2;
	//   45   81:iload           9
	//   46   83:istore          4
			if(view.getVisibility() != 8)
	//*  47   85:aload           18
	//*  48   87:invokevirtual   #670 <Method int View.getVisibility()>
	//*  49   90:bipush          8
	//*  50   92:icmpeq          375
			{
				am am1 = (am)view.getLayoutParams();
	//   51   95:aload           18
	//   52   97:invokevirtual   #410 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   53  100:checkcast       #412 <Class am>
	//   54  103:astore          19
				i2 = j1;
	//   55  105:iload_3         
	//   56  106:istore          7
				l3 = k2;
	//   57  108:iload           8
	//   58  110:istore          13
				k3 = i1;
	//   59  112:iload_2         
	//   60  113:istore          12
				j3 = l1;
	//   61  115:iload           5
	//   62  117:istore          11
				k1 = l2;
	//   63  119:iload           9
	//   64  121:istore          4
				if(am1.a)
	//*  65  123:aload           19
	//*  66  125:getfield        #414 <Field boolean am.a>
	//*  67  128:ifeq            375
				{
					k1 = am1.b & 7;
	//   68  131:aload           19
	//   69  133:getfield        #584 <Field int am.b>
	//   70  136:bipush          7
	//   71  138:iand            
	//   72  139:istore          4
					j3 = am1.b & 0x70;
	//   73  141:aload           19
	//   74  143:getfield        #584 <Field int am.b>
	//   75  146:bipush          112
	//   76  148:iand            
	//   77  149:istore          11
					if(k1 != 1)
	//*  78  151:iload           4
	//*  79  153:iconst_1        
	//*  80  154:icmpeq          226
					{
						if(k1 != 3)
	//*  81  157:iload           4
	//*  82  159:iconst_3        
	//*  83  160:icmpeq          207
						{
							if(k1 != 5)
	//*  84  163:iload           4
	//*  85  165:iconst_5        
	//*  86  166:icmpeq          178
							{
								k1 = j1;
	//   87  169:iload_3         
	//   88  170:istore          4
								i2 = j1;
	//   89  172:iload_3         
	//   90  173:istore          7
							} else
	//*  91  175:goto            245
							{
								k1 = j4 - k2 - view.getMeasuredWidth();
	//   92  178:iload           15
	//   93  180:iload           8
	//   94  182:isub            
	//   95  183:aload           18
	//   96  185:invokevirtual   #585 <Method int View.getMeasuredWidth()>
	//   97  188:isub            
	//   98  189:istore          4
								k2 += view.getMeasuredWidth();
	//   99  191:iload           8
	//  100  193:aload           18
	//  101  195:invokevirtual   #585 <Method int View.getMeasuredWidth()>
	//  102  198:iadd            
	//  103  199:istore          8
								i2 = j1;
	//  104  201:iload_3         
	//  105  202:istore          7
							}
						} else
	//* 106  204:goto            245
						{
							i2 = view.getMeasuredWidth();
	//  107  207:aload           18
	//  108  209:invokevirtual   #585 <Method int View.getMeasuredWidth()>
	//  109  212:istore          7
							k1 = j1;
	//  110  214:iload_3         
	//  111  215:istore          4
							i2 += j1;
	//  112  217:iload           7
	//  113  219:iload_3         
	//  114  220:iadd            
	//  115  221:istore          7
						}
					} else
	//* 116  223:goto            245
					{
						k1 = Math.max((j4 - view.getMeasuredWidth()) / 2, j1);
	//  117  226:iload           15
	//  118  228:aload           18
	//  119  230:invokevirtual   #585 <Method int View.getMeasuredWidth()>
	//  120  233:isub            
	//  121  234:iconst_2        
	//  122  235:idiv            
	//  123  236:iload_3         
	//  124  237:invokestatic    #145 <Method int Math.max(int, int)>
	//  125  240:istore          4
						i2 = j1;
	//  126  242:iload_3         
	//  127  243:istore          7
					}
					if(j3 != 16)
	//* 128  245:iload           11
	//* 129  247:bipush          16
	//* 130  249:icmpeq          313
					{
						if(j3 != 48)
	//* 131  252:iload           11
	//* 132  254:bipush          48
	//* 133  256:icmpeq          296
						{
							if(j3 != 80)
	//* 134  259:iload           11
	//* 135  261:bipush          80
	//* 136  263:icmpeq          271
							{
								j1 = i1;
	//  137  266:iload_2         
	//  138  267:istore_3        
							} else
	//* 139  268:goto            328
							{
								j1 = k4 - l1 - view.getMeasuredHeight();
	//  140  271:iload           16
	//  141  273:iload           5
	//  142  275:isub            
	//  143  276:aload           18
	//  144  278:invokevirtual   #918 <Method int View.getMeasuredHeight()>
	//  145  281:isub            
	//  146  282:istore_3        
								l1 += view.getMeasuredHeight();
	//  147  283:iload           5
	//  148  285:aload           18
	//  149  287:invokevirtual   #918 <Method int View.getMeasuredHeight()>
	//  150  290:iadd            
	//  151  291:istore          5
							}
						} else
	//* 152  293:goto            328
						{
							j3 = view.getMeasuredHeight();
	//  153  296:aload           18
	//  154  298:invokevirtual   #918 <Method int View.getMeasuredHeight()>
	//  155  301:istore          11
							j1 = i1;
	//  156  303:iload_2         
	//  157  304:istore_3        
							i1 = j3 + i1;
	//  158  305:iload           11
	//  159  307:iload_2         
	//  160  308:iadd            
	//  161  309:istore_2        
						}
					} else
	//* 162  310:goto            328
					{
						j1 = Math.max((k4 - view.getMeasuredHeight()) / 2, i1);
	//  163  313:iload           16
	//  164  315:aload           18
	//  165  317:invokevirtual   #918 <Method int View.getMeasuredHeight()>
	//  166  320:isub            
	//  167  321:iconst_2        
	//  168  322:idiv            
	//  169  323:iload_2         
	//  170  324:invokestatic    #145 <Method int Math.max(int, int)>
	//  171  327:istore_3        
					}
					k1 += l4;
	//  172  328:iload           4
	//  173  330:iload           17
	//  174  332:iadd            
	//  175  333:istore          4
					view.layout(k1, j1, view.getMeasuredWidth() + k1, j1 + view.getMeasuredHeight());
	//  176  335:aload           18
	//  177  337:iload           4
	//  178  339:iload_3         
	//  179  340:aload           18
	//  180  342:invokevirtual   #585 <Method int View.getMeasuredWidth()>
	//  181  345:iload           4
	//  182  347:iadd            
	//  183  348:iload_3         
	//  184  349:aload           18
	//  185  351:invokevirtual   #918 <Method int View.getMeasuredHeight()>
	//  186  354:iadd            
	//  187  355:invokevirtual   #921 <Method void View.layout(int, int, int, int)>
					k1 = l2 + 1;
	//  188  358:iload           9
	//  189  360:iconst_1        
	//  190  361:iadd            
	//  191  362:istore          4
					j3 = l1;
	//  192  364:iload           5
	//  193  366:istore          11
					k3 = i1;
	//  194  368:iload_2         
	//  195  369:istore          12
					l3 = k2;
	//  196  371:iload           8
	//  197  373:istore          13
				}
			}
			i3++;
	//  198  375:iload           10
	//  199  377:iconst_1        
	//  200  378:iadd            
	//  201  379:istore          10
			j1 = i2;
	//  202  381:iload           7
	//  203  383:istore_3        
			k2 = l3;
	//  204  384:iload           13
	//  205  386:istore          8
			i1 = k3;
	//  206  388:iload           12
	//  207  390:istore_2        
			l1 = j3;
	//  208  391:iload           11
	//  209  393:istore          5
			l2 = k1;
	//  210  395:iload           4
	//  211  397:istore          9
		}

	//* 212  399:goto            52
		for(k1 = 0; k1 < i4; k1++)
	//* 213  402:iconst_0        
	//* 214  403:istore          4
	//* 215  405:iload           4
	//* 216  407:iload           14
	//* 217  409:icmpge          563
		{
			View view1 = getChildAt(k1);
	//  218  412:aload_0         
	//  219  413:iload           4
	//  220  415:invokevirtual   #352 <Method View getChildAt(int)>
	//  221  418:astore          18
			if(view1.getVisibility() == 8)
				continue;
	//  222  420:aload           18
	//  223  422:invokevirtual   #670 <Method int View.getVisibility()>
	//  224  425:bipush          8
	//  225  427:icmpeq          554
			am am2 = (am)view1.getLayoutParams();
	//  226  430:aload           18
	//  227  432:invokevirtual   #410 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  228  435:checkcast       #412 <Class am>
	//  229  438:astore          19
			if(am2.a)
				continue;
	//  230  440:aload           19
	//  231  442:getfield        #414 <Field boolean am.a>
	//  232  445:ifne            554
			al al1 = a(view1);
	//  233  448:aload_0         
	//  234  449:aload           18
	//  235  451:invokevirtual   #522 <Method al a(View)>
	//  236  454:astore          20
			if(al1 == null)
				continue;
	//  237  456:aload           20
	//  238  458:ifnull          554
			float f1 = j4 - j1 - k2;
	//  239  461:iload           15
	//  240  463:iload_3         
	//  241  464:isub            
	//  242  465:iload           8
	//  243  467:isub            
	//  244  468:i2f             
	//  245  469:fstore          6
			int j2 = (int)(al1.e * f1) + j1;
	//  246  471:aload           20
	//  247  473:getfield        #230 <Field float al.e>
	//  248  476:fload           6
	//  249  478:fmul            
	//  250  479:f2i             
	//  251  480:iload_3         
	//  252  481:iadd            
	//  253  482:istore          7
			if(am2.d)
	//* 254  484:aload           19
	//* 255  486:getfield        #704 <Field boolean am.d>
	//* 256  489:ifeq            531
			{
				am2.d = false;
	//  257  492:aload           19
	//  258  494:iconst_0        
	//  259  495:putfield        #704 <Field boolean am.d>
				view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(f1 * am2.c), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k4 - i1 - l1, 0x40000000));
	//  260  498:aload           18
	//  261  500:fload           6
	//  262  502:aload           19
	//  263  504:getfield        #498 <Field float android.support.v4.view.am.c>
	//  264  507:fmul            
	//  265  508:f2i             
	//  266  509:ldc2            #922 <Int 0x40000000>
	//  267  512:invokestatic    #927 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  268  515:iload           16
	//  269  517:iload_2         
	//  270  518:isub            
	//  271  519:iload           5
	//  272  521:isub            
	//  273  522:ldc2            #922 <Int 0x40000000>
	//  274  525:invokestatic    #927 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  275  528:invokevirtual   #930 <Method void View.measure(int, int)>
			}
			view1.layout(j2, i1, view1.getMeasuredWidth() + j2, view1.getMeasuredHeight() + i1);
	//  276  531:aload           18
	//  277  533:iload           7
	//  278  535:iload_2         
	//  279  536:aload           18
	//  280  538:invokevirtual   #585 <Method int View.getMeasuredWidth()>
	//  281  541:iload           7
	//  282  543:iadd            
	//  283  544:aload           18
	//  284  546:invokevirtual   #918 <Method int View.getMeasuredHeight()>
	//  285  549:iload_2         
	//  286  550:iadd            
	//  287  551:invokevirtual   #921 <Method void View.layout(int, int, int, int)>
		}

	//  288  554:iload           4
	//  289  556:iconst_1        
	//  290  557:iadd            
	//  291  558:istore          4
	//* 292  560:goto            405
		r = i1;
	//  293  563:aload_0         
	//  294  564:iload_2         
	//  295  565:putfield        #863 <Field int r>
		s = k4 - l1;
	//  296  568:aload_0         
	//  297  569:iload           16
	//  298  571:iload           5
	//  299  573:isub            
	//  300  574:putfield        #865 <Field int s>
		W = l2;
	//  301  577:aload_0         
	//  302  578:iload           9
	//  303  580:putfield        #583 <Field int W>
		if(T)
	//* 304  583:aload_0         
	//* 305  584:getfield        #393 <Field boolean T>
	//* 306  587:ifeq            604
			a(c, false, 0, false);
	//  307  590:aload_0         
	//  308  591:aload_0         
	//  309  592:getfield        #120 <Field int c>
	//  310  595:iconst_0        
	//  311  596:iconst_0        
	//  312  597:iconst_0        
	//  313  598:invokespecial   #630 <Method void a(int, boolean, int, boolean)>
	//* 314  601:goto            604
		T = false;
	//  315  604:aload_0         
	//  316  605:iconst_0        
	//  317  606:putfield        #393 <Field boolean T>
	//  318  609:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		setMeasuredDimension(getDefaultSize(0, i1), getDefaultSize(0, j1));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iload_1         
	//    3    3:invokestatic    #934 <Method int getDefaultSize(int, int)>
	//    4    6:iconst_0        
	//    5    7:iload_2         
	//    6    8:invokestatic    #934 <Method int getDefaultSize(int, int)>
	//    7   11:invokevirtual   #937 <Method void setMeasuredDimension(int, int)>
		i1 = getMeasuredWidth();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #446 <Method int getMeasuredWidth()>
	//   10   18:istore_1        
		E = Math.min(i1 / 10, D);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:bipush          10
	//   14   23:idiv            
	//   15   24:aload_0         
	//   16   25:getfield        #939 <Field int D>
	//   17   28:invokestatic    #142 <Method int Math.min(int, int)>
	//   18   31:putfield        #325 <Field int E>
		int k1 = getPaddingLeft();
	//   19   34:aload_0         
	//   20   35:invokevirtual   #212 <Method int getPaddingLeft()>
	//   21   38:istore_3        
		int j2 = getPaddingRight();
	//   22   39:aload_0         
	//   23   40:invokevirtual   #215 <Method int getPaddingRight()>
	//   24   43:istore          4
		j1 = getMeasuredHeight();
	//   25   45:aload_0         
	//   26   46:invokevirtual   #940 <Method int getMeasuredHeight()>
	//   27   49:istore_2        
		int l2 = getPaddingTop();
	//   28   50:aload_0         
	//   29   51:invokevirtual   #792 <Method int getPaddingTop()>
	//   30   54:istore          5
		int j3 = getPaddingBottom();
	//   31   56:aload_0         
	//   32   57:invokevirtual   #795 <Method int getPaddingBottom()>
	//   33   60:istore          6
		int i4 = getChildCount();
	//   34   62:aload_0         
	//   35   63:invokevirtual   #346 <Method int getChildCount()>
	//   36   66:istore          11
		j1 = j1 - l2 - j3;
	//   37   68:iload_2         
	//   38   69:iload           5
	//   39   71:isub            
	//   40   72:iload           6
	//   41   74:isub            
	//   42   75:istore_2        
		i1 = i1 - k1 - j2;
	//   43   76:iload_1         
	//   44   77:iload_3         
	//   45   78:isub            
	//   46   79:iload           4
	//   47   81:isub            
	//   48   82:istore_1        
		j3 = 0;
	//   49   83:iconst_0        
	//   50   84:istore          6
		do
		{
			int i3 = 1;
	//   51   86:iconst_1        
	//   52   87:istore          5
			int l3 = 0x40000000;
	//   53   89:ldc2            #922 <Int 0x40000000>
	//   54   92:istore          10
			if(j3 >= i4)
				break;
	//   55   94:iload           6
	//   56   96:iload           11
	//   57   98:icmpge          426
			View view = getChildAt(j3);
	//   58  101:aload_0         
	//   59  102:iload           6
	//   60  104:invokevirtual   #352 <Method View getChildAt(int)>
	//   61  107:astore          12
			int l1 = i1;
	//   62  109:iload_1         
	//   63  110:istore_3        
			int k2 = j1;
	//   64  111:iload_2         
	//   65  112:istore          4
			if(view.getVisibility() != 8)
	//*  66  114:aload           12
	//*  67  116:invokevirtual   #670 <Method int View.getVisibility()>
	//*  68  119:bipush          8
	//*  69  121:icmpeq          412
			{
				am am1 = (am)view.getLayoutParams();
	//   70  124:aload           12
	//   71  126:invokevirtual   #410 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   72  129:checkcast       #412 <Class am>
	//   73  132:astore          13
				l1 = i1;
	//   74  134:iload_1         
	//   75  135:istore_3        
				k2 = j1;
	//   76  136:iload_2         
	//   77  137:istore          4
				if(am1 != null)
	//*  78  139:aload           13
	//*  79  141:ifnull          412
				{
					l1 = i1;
	//   80  144:iload_1         
	//   81  145:istore_3        
					k2 = j1;
	//   82  146:iload_2         
	//   83  147:istore          4
					if(am1.a)
	//*  84  149:aload           13
	//*  85  151:getfield        #414 <Field boolean am.a>
	//*  86  154:ifeq            412
					{
						l1 = am1.b & 7;
	//   87  157:aload           13
	//   88  159:getfield        #584 <Field int am.b>
	//   89  162:bipush          7
	//   90  164:iand            
	//   91  165:istore_3        
						k2 = am1.b & 0x70;
	//   92  166:aload           13
	//   93  168:getfield        #584 <Field int am.b>
	//   94  171:bipush          112
	//   95  173:iand            
	//   96  174:istore          4
						boolean flag1;
						if(k2 != 48 && k2 != 80)
	//*  97  176:iload           4
	//*  98  178:bipush          48
	//*  99  180:icmpeq          199
	//* 100  183:iload           4
	//* 101  185:bipush          80
	//* 102  187:icmpne          193
	//* 103  190:goto            199
							flag1 = false;
	//  104  193:iconst_0        
	//  105  194:istore          8
						else
	//* 106  196:goto            202
							flag1 = true;
	//  107  199:iconst_1        
	//  108  200:istore          8
						boolean flag = ((boolean) (i3));
	//  109  202:iload           5
	//  110  204:istore          7
						if(l1 != 3)
	//* 111  206:iload_3         
	//* 112  207:iconst_3        
	//* 113  208:icmpeq          226
							if(l1 == 5)
	//* 114  211:iload_3         
	//* 115  212:iconst_5        
	//* 116  213:icmpne          223
								flag = ((boolean) (i3));
	//  117  216:iload           5
	//  118  218:istore          7
							else
	//* 119  220:goto            226
								flag = false;
	//  120  223:iconst_0        
	//  121  224:istore          7
						k2 = 0x80000000;
	//  122  226:ldc2            #941 <Int 0x80000000>
	//  123  229:istore          4
						if(flag1)
	//* 124  231:iload           8
	//* 125  233:ifeq            248
						{
							k2 = 0x40000000;
	//  126  236:ldc2            #922 <Int 0x40000000>
	//  127  239:istore          4
							l1 = 0x80000000;
	//  128  241:ldc2            #941 <Int 0x80000000>
	//  129  244:istore_3        
						} else
	//* 130  245:goto            264
						if(flag)
	//* 131  248:iload           7
	//* 132  250:ifeq            260
							l1 = 0x40000000;
	//  133  253:ldc2            #922 <Int 0x40000000>
	//  134  256:istore_3        
						else
	//* 135  257:goto            264
							l1 = 0x80000000;
	//  136  260:ldc2            #941 <Int 0x80000000>
	//  137  263:istore_3        
						if(am1.width != -2)
	//* 138  264:aload           13
	//* 139  266:getfield        #944 <Field int am.width>
	//* 140  269:bipush          -2
	//* 141  271:icmpeq          309
						{
							if(am1.width != -1)
	//* 142  274:aload           13
	//* 143  276:getfield        #944 <Field int am.width>
	//* 144  279:iconst_m1       
	//* 145  280:icmpeq          298
							{
								i3 = am1.width;
	//  146  283:aload           13
	//  147  285:getfield        #944 <Field int am.width>
	//  148  288:istore          5
								k2 = 0x40000000;
	//  149  290:ldc2            #922 <Int 0x40000000>
	//  150  293:istore          4
							} else
	//* 151  295:goto            312
							{
								i3 = i1;
	//  152  298:iload_1         
	//  153  299:istore          5
								k2 = 0x40000000;
	//  154  301:ldc2            #922 <Int 0x40000000>
	//  155  304:istore          4
							}
						} else
	//* 156  306:goto            312
						{
							i3 = i1;
	//  157  309:iload_1         
	//  158  310:istore          5
						}
						if(am1.height != -2)
	//* 159  312:aload           13
	//* 160  314:getfield        #947 <Field int am.height>
	//* 161  317:bipush          -2
	//* 162  319:icmpeq          345
						{
							if(am1.height != -1)
	//* 163  322:aload           13
	//* 164  324:getfield        #947 <Field int am.height>
	//* 165  327:iconst_m1       
	//* 166  328:icmpeq          340
								l1 = am1.height;
	//  167  331:aload           13
	//  168  333:getfield        #947 <Field int am.height>
	//  169  336:istore_3        
							else
	//* 170  337:goto            354
								l1 = j1;
	//  171  340:iload_2         
	//  172  341:istore_3        
						} else
	//* 173  342:goto            354
						{
							int k3 = j1;
	//  174  345:iload_2         
	//  175  346:istore          9
							l3 = l1;
	//  176  348:iload_3         
	//  177  349:istore          10
							l1 = k3;
	//  178  351:iload           9
	//  179  353:istore_3        
						}
						view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i3, k2), android.view.View.MeasureSpec.makeMeasureSpec(l1, l3));
	//  180  354:aload           12
	//  181  356:iload           5
	//  182  358:iload           4
	//  183  360:invokestatic    #927 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  184  363:iload_3         
	//  185  364:iload           10
	//  186  366:invokestatic    #927 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  187  369:invokevirtual   #930 <Method void View.measure(int, int)>
						if(flag1)
	//* 188  372:iload           8
	//* 189  374:ifeq            391
						{
							k2 = j1 - view.getMeasuredHeight();
	//  190  377:iload_2         
	//  191  378:aload           12
	//  192  380:invokevirtual   #918 <Method int View.getMeasuredHeight()>
	//  193  383:isub            
	//  194  384:istore          4
							l1 = i1;
	//  195  386:iload_1         
	//  196  387:istore_3        
						} else
	//* 197  388:goto            412
						{
							l1 = i1;
	//  198  391:iload_1         
	//  199  392:istore_3        
							k2 = j1;
	//  200  393:iload_2         
	//  201  394:istore          4
							if(flag)
	//* 202  396:iload           7
	//* 203  398:ifeq            412
							{
								l1 = i1 - view.getMeasuredWidth();
	//  204  401:iload_1         
	//  205  402:aload           12
	//  206  404:invokevirtual   #585 <Method int View.getMeasuredWidth()>
	//  207  407:isub            
	//  208  408:istore_3        
								k2 = j1;
	//  209  409:iload_2         
	//  210  410:istore          4
							}
						}
					}
				}
			}
			j3++;
	//  211  412:iload           6
	//  212  414:iconst_1        
	//  213  415:iadd            
	//  214  416:istore          6
			i1 = l1;
	//  215  418:iload_3         
	//  216  419:istore_1        
			j1 = k2;
	//  217  420:iload           4
	//  218  422:istore_2        
		} while(true);
	//  219  423:goto            86
		v = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
	//  220  426:aload_0         
	//  221  427:iload_1         
	//  222  428:ldc2            #922 <Int 0x40000000>
	//  223  431:invokestatic    #927 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  224  434:putfield        #949 <Field int v>
		w = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
	//  225  437:aload_0         
	//  226  438:iload_2         
	//  227  439:ldc2            #922 <Int 0x40000000>
	//  228  442:invokestatic    #927 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  229  445:putfield        #951 <Field int w>
		x = true;
	//  230  448:aload_0         
	//  231  449:iconst_1        
	//  232  450:putfield        #700 <Field boolean x>
		b();
	//  233  453:aload_0         
	//  234  454:invokevirtual   #605 <Method void b()>
		j1 = 0;
	//  235  457:iconst_0        
	//  236  458:istore_2        
		x = false;
	//  237  459:aload_0         
	//  238  460:iconst_0        
	//  239  461:putfield        #700 <Field boolean x>
		for(int i2 = getChildCount(); j1 < i2; j1++)
	//* 240  464:aload_0         
	//* 241  465:invokevirtual   #346 <Method int getChildCount()>
	//* 242  468:istore_3        
	//* 243  469:iload_2         
	//* 244  470:iload_3         
	//* 245  471:icmpge          545
		{
			View view1 = getChildAt(j1);
	//  246  474:aload_0         
	//  247  475:iload_2         
	//  248  476:invokevirtual   #352 <Method View getChildAt(int)>
	//  249  479:astore          12
			if(view1.getVisibility() == 8)
				continue;
	//  250  481:aload           12
	//  251  483:invokevirtual   #670 <Method int View.getVisibility()>
	//  252  486:bipush          8
	//  253  488:icmpeq          538
			am am2 = (am)view1.getLayoutParams();
	//  254  491:aload           12
	//  255  493:invokevirtual   #410 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  256  496:checkcast       #412 <Class am>
	//  257  499:astore          13
			if(am2 == null || !am2.a)
	//* 258  501:aload           13
	//* 259  503:ifnull          514
	//* 260  506:aload           13
	//* 261  508:getfield        #414 <Field boolean am.a>
	//* 262  511:ifne            538
				view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)((float)i1 * am2.c), 0x40000000), w);
	//  263  514:aload           12
	//  264  516:iload_1         
	//  265  517:i2f             
	//  266  518:aload           13
	//  267  520:getfield        #498 <Field float android.support.v4.view.am.c>
	//  268  523:fmul            
	//  269  524:f2i             
	//  270  525:ldc2            #922 <Int 0x40000000>
	//  271  528:invokestatic    #927 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  272  531:aload_0         
	//  273  532:getfield        #951 <Field int w>
	//  274  535:invokevirtual   #930 <Method void View.measure(int, int)>
		}

	//  275  538:iload_2         
	//  276  539:iconst_1        
	//  277  540:iadd            
	//  278  541:istore_2        
	//* 279  542:goto            469
	//  280  545:return          
	}

	protected boolean onRequestFocusInDescendants(int i1, Rect rect)
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #346 <Method int getChildCount()>
	//    2    4:istore_3        
		int k1 = -1;
	//    3    5:iconst_m1       
	//    4    6:istore          5
		byte byte0;
		if((i1 & 2) != 0)
	//*   5    8:iload_1         
	//*   6    9:iconst_2        
	//*   7   10:iand            
	//*   8   11:ifeq            25
		{
			k1 = j1;
	//    9   14:iload_3         
	//   10   15:istore          5
			j1 = 0;
	//   11   17:iconst_0        
	//   12   18:istore_3        
			byte0 = 1;
	//   13   19:iconst_1        
	//   14   20:istore          4
		} else
	//*  15   22:goto            32
		{
			j1--;
	//   16   25:iload_3         
	//   17   26:iconst_1        
	//   18   27:isub            
	//   19   28:istore_3        
			byte0 = -1;
	//   20   29:iconst_m1       
	//   21   30:istore          4
		}
		for(; j1 != k1; j1 += ((int) (byte0)))
	//*  22   32:iload_3         
	//*  23   33:iload           5
	//*  24   35:icmpeq          98
		{
			View view = getChildAt(j1);
	//   25   38:aload_0         
	//   26   39:iload_3         
	//   27   40:invokevirtual   #352 <Method View getChildAt(int)>
	//   28   43:astore          6
			if(view.getVisibility() != 0)
				continue;
	//   29   45:aload           6
	//   30   47:invokevirtual   #670 <Method int View.getVisibility()>
	//   31   50:ifne            90
			al al1 = a(view);
	//   32   53:aload_0         
	//   33   54:aload           6
	//   34   56:invokevirtual   #522 <Method al a(View)>
	//   35   59:astore          7
			if(al1 != null && al1.b == c && view.requestFocus(i1, rect))
	//*  36   61:aload           7
	//*  37   63:ifnull          90
	//*  38   66:aload           7
	//*  39   68:getfield        #138 <Field int al.b>
	//*  40   71:aload_0         
	//*  41   72:getfield        #120 <Field int c>
	//*  42   75:icmpne          90
	//*  43   78:aload           6
	//*  44   80:iload_1         
	//*  45   81:aload_2         
	//*  46   82:invokevirtual   #955 <Method boolean View.requestFocus(int, Rect)>
	//*  47   85:ifeq            90
				return true;
	//   48   88:iconst_1        
	//   49   89:ireturn         
		}

	//   50   90:iload_3         
	//   51   91:iload           4
	//   52   93:iadd            
	//   53   94:istore_3        
	//*  54   95:goto            32
		return false;
	//   55   98:iconst_0        
	//   56   99:ireturn         
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #959 <Class ViewPager$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #961 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #959 <Class ViewPager$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #965 <Method Parcelable ViewPager$SavedState.getSuperState()>
	//   13   23:invokespecial   #961 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		z z1 = b;
	//   14   26:aload_0         
	//   15   27:getfield        #254 <Field z b>
	//   16   30:astore_2        
		if(z1 != null)
	//*  17   31:aload_2         
	//*  18   32:ifnull          58
		{
			z1.a(((SavedState) (parcelable)).b, ((SavedState) (parcelable)).c);
	//   19   35:aload_2         
	//   20   36:aload_1         
	//   21   37:getfield        #967 <Field Parcelable ViewPager$SavedState.b>
	//   22   40:aload_1         
	//   23   41:getfield        #969 <Field ClassLoader android.support.v4.view.ViewPager$SavedState.c>
	//   24   44:invokevirtual   #972 <Method void z.a(Parcelable, ClassLoader)>
			a(((SavedState) (parcelable)).a, false, true);
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:getfield        #974 <Field int ViewPager$SavedState.a>
	//   28   52:iconst_0        
	//   29   53:iconst_1        
	//   30   54:invokevirtual   #501 <Method void a(int, boolean, boolean)>
			return;
	//   31   57:return          
		} else
		{
			j = ((SavedState) (parcelable)).a;
	//   32   58:aload_0         
	//   33   59:aload_1         
	//   34   60:getfield        #974 <Field int ViewPager$SavedState.a>
	//   35   63:putfield        #976 <Field int j>
			k = ((SavedState) (parcelable)).b;
	//   36   66:aload_0         
	//   37   67:aload_1         
	//   38   68:getfield        #967 <Field Parcelable ViewPager$SavedState.b>
	//   39   71:putfield        #978 <Field Parcelable k>
			l = ((SavedState) (parcelable)).c;
	//   40   74:aload_0         
	//   41   75:aload_1         
	//   42   76:getfield        #969 <Field ClassLoader android.support.v4.view.ViewPager$SavedState.c>
	//   43   79:putfield        #980 <Field ClassLoader l>
			return;
	//   44   82:return          
		}
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #959 <Class ViewPager$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #983 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #985 <Method void ViewPager$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.a = c;
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #120 <Field int c>
	//    9   17:putfield        #974 <Field int ViewPager$SavedState.a>
		z z1 = b;
	//   10   20:aload_0         
	//   11   21:getfield        #254 <Field z b>
	//   12   24:astore_2        
		if(z1 != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          37
			savedstate.b = z1.b();
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:invokevirtual   #987 <Method Parcelable z.b()>
	//   18   34:putfield        #967 <Field Parcelable ViewPager$SavedState.b>
		return ((Parcelable) (savedstate));
	//   19   37:aload_1         
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
	//    5    6:invokespecial   #990 <Method void ViewGroup.onSizeChanged(int, int, int, int)>
		if(i1 != k1)
	//*   6    9:iload_1         
	//*   7   10:iload_3         
	//*   8   11:icmpeq          27
		{
			j1 = p;
	//    9   14:aload_0         
	//   10   15:getfield        #260 <Field int p>
	//   11   18:istore_2        
			a(i1, k1, j1, j1);
	//   12   19:aload_0         
	//   13   20:iload_1         
	//   14   21:iload_3         
	//   15   22:iload_2         
	//   16   23:iload_2         
	//   17   24:invokespecial   #992 <Method void a(int, int, int, int)>
		}
	//   18   27:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(Q)
	//*   0    0:aload_0         
	//*   1    1:getfield        #995 <Field boolean Q>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		int i1 = motionevent.getAction();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #872 <Method int MotionEvent.getAction()>
	//    7   13:istore          6
		boolean flag = false;
	//    8   15:iconst_0        
	//    9   16:istore          9
		if(i1 == 0 && motionevent.getEdgeFlags() != 0)
	//*  10   18:iload           6
	//*  11   20:ifne            32
	//*  12   23:aload_1         
	//*  13   24:invokevirtual   #998 <Method int MotionEvent.getEdgeFlags()>
	//*  14   27:ifeq            32
			return false;
	//   15   30:iconst_0        
	//   16   31:ireturn         
		z z1 = b;
	//   17   32:aload_0         
	//   18   33:getfield        #254 <Field z b>
	//   19   36:astore          10
		if(z1 != null)
	//*  20   38:aload           10
	//*  21   40:ifnull          615
		{
			if(z1.a() == 0)
	//*  22   43:aload           10
	//*  23   45:invokevirtual   #258 <Method int z.a()>
	//*  24   48:ifne            53
				return false;
	//   25   51:iconst_0        
	//   26   52:ireturn         
			if(L == null)
	//*  27   53:aload_0         
	//*  28   54:getfield        #287 <Field VelocityTracker L>
	//*  29   57:ifnonnull       67
				L = VelocityTracker.obtain();
	//   30   60:aload_0         
	//   31   61:invokestatic    #908 <Method VelocityTracker VelocityTracker.obtain()>
	//   32   64:putfield        #287 <Field VelocityTracker L>
			L.addMovement(motionevent);
	//   33   67:aload_0         
	//   34   68:getfield        #287 <Field VelocityTracker L>
	//   35   71:aload_1         
	//   36   72:invokevirtual   #911 <Method void VelocityTracker.addMovement(MotionEvent)>
			switch(motionevent.getAction() & 0xff)
	//*  37   75:aload_1         
	//*  38   76:invokevirtual   #872 <Method int MotionEvent.getAction()>
	//*  39   79:sipush          255
	//*  40   82:iand            
			{
			case 4: // '\004'
			default:
				break;

	//*  41   83:tableswitch     0 6: default 124
	//	               0 549
	//	               1 409
	//	               2 207
	//	               3 180
	//	               4 124
	//	               5 151
	//	               6 127
	//*  42  124:goto            604
			case 6: // '\006'
				a(motionevent);
	//   43  127:aload_0         
	//   44  128:aload_1         
	//   45  129:invokespecial   #874 <Method void a(MotionEvent)>
				G = motionevent.getX(motionevent.findPointerIndex(K));
	//   46  132:aload_0         
	//   47  133:aload_1         
	//   48  134:aload_1         
	//   49  135:aload_0         
	//   50  136:getfield        #280 <Field int K>
	//   51  139:invokevirtual   #877 <Method int MotionEvent.findPointerIndex(int)>
	//   52  142:invokevirtual   #283 <Method float MotionEvent.getX(int)>
	//   53  145:putfield        #285 <Field float G>
				break;
	//   54  148:goto            604

			case 5: // '\005'
				int j1 = motionevent.getActionIndex();
	//   55  151:aload_1         
	//   56  152:invokevirtual   #275 <Method int MotionEvent.getActionIndex()>
	//   57  155:istore          6
				G = motionevent.getX(j1);
	//   58  157:aload_0         
	//   59  158:aload_1         
	//   60  159:iload           6
	//   61  161:invokevirtual   #283 <Method float MotionEvent.getX(int)>
	//   62  164:putfield        #285 <Field float G>
				K = motionevent.getPointerId(j1);
	//   63  167:aload_0         
	//   64  168:aload_1         
	//   65  169:iload           6
	//   66  171:invokevirtual   #278 <Method int MotionEvent.getPointerId(int)>
	//   67  174:putfield        #280 <Field int K>
				break;
	//   68  177:goto            604

			case 3: // '\003'
				if(B)
	//*  69  180:aload_0         
	//*  70  181:getfield        #450 <Field boolean B>
	//*  71  184:ifeq            604
				{
					a(c, true, 0, false);
	//   72  187:aload_0         
	//   73  188:aload_0         
	//   74  189:getfield        #120 <Field int c>
	//   75  192:iconst_1        
	//   76  193:iconst_0        
	//   77  194:iconst_0        
	//   78  195:invokespecial   #630 <Method void a(int, boolean, int, boolean)>
					flag = g();
	//   79  198:aload_0         
	//   80  199:invokespecial   #913 <Method boolean g()>
	//   81  202:istore          9
				}
				break;
	//   82  204:goto            604

			case 2: // '\002'
				if(!B)
	//*  83  207:aload_0         
	//*  84  208:getfield        #450 <Field boolean B>
	//*  85  211:ifne            379
				{
					int k1 = motionevent.findPointerIndex(K);
	//   86  214:aload_1         
	//   87  215:aload_0         
	//   88  216:getfield        #280 <Field int K>
	//   89  219:invokevirtual   #877 <Method int MotionEvent.findPointerIndex(int)>
	//   90  222:istore          6
					if(k1 == -1)
	//*  91  224:iload           6
	//*  92  226:iconst_m1       
	//*  93  227:icmpne          239
					{
						flag = g();
	//   94  230:aload_0         
	//   95  231:invokespecial   #913 <Method boolean g()>
	//   96  234:istore          9
						break;
	//   97  236:goto            604
					}
					float f1 = motionevent.getX(k1);
	//   98  239:aload_1         
	//   99  240:iload           6
	//  100  242:invokevirtual   #283 <Method float MotionEvent.getX(int)>
	//  101  245:fstore_2        
					float f6 = Math.abs(f1 - G);
	//  102  246:fload_2         
	//  103  247:aload_0         
	//  104  248:getfield        #285 <Field float G>
	//  105  251:fsub            
	//  106  252:invokestatic    #362 <Method float Math.abs(float)>
	//  107  255:fstore          4
					float f4 = motionevent.getY(k1);
	//  108  257:aload_1         
	//  109  258:iload           6
	//  110  260:invokevirtual   #880 <Method float MotionEvent.getY(int)>
	//  111  263:fstore_3        
					float f8 = Math.abs(f4 - H);
	//  112  264:fload_3         
	//  113  265:aload_0         
	//  114  266:getfield        #886 <Field float H>
	//  115  269:fsub            
	//  116  270:invokestatic    #362 <Method float Math.abs(float)>
	//  117  273:fstore          5
					if(f6 > (float)F && f6 > f8)
	//* 118  275:fload           4
	//* 119  277:aload_0         
	//* 120  278:getfield        #888 <Field int F>
	//* 121  281:i2f             
	//* 122  282:fcmpl           
	//* 123  283:ifle            379
	//* 124  286:fload           4
	//* 125  288:fload           5
	//* 126  290:fcmpl           
	//* 127  291:ifle            379
					{
						B = true;
	//  128  294:aload_0         
	//  129  295:iconst_1        
	//  130  296:putfield        #450 <Field boolean B>
						c(true);
	//  131  299:aload_0         
	//  132  300:iconst_1        
	//  133  301:invokespecial   #890 <Method void c(boolean)>
						float f7 = I;
	//  134  304:aload_0         
	//  135  305:getfield        #892 <Field float I>
	//  136  308:fstore          4
						if(f1 - f7 > 0.0F)
	//* 137  310:fload_2         
	//* 138  311:fload           4
	//* 139  313:fsub            
	//* 140  314:fconst_0        
	//* 141  315:fcmpl           
	//* 142  316:ifle            331
							f1 = f7 + (float)F;
	//  143  319:fload           4
	//  144  321:aload_0         
	//  145  322:getfield        #888 <Field int F>
	//  146  325:i2f             
	//  147  326:fadd            
	//  148  327:fstore_2        
						else
	//* 149  328:goto            340
							f1 = f7 - (float)F;
	//  150  331:fload           4
	//  151  333:aload_0         
	//  152  334:getfield        #888 <Field int F>
	//  153  337:i2f             
	//  154  338:fsub            
	//  155  339:fstore_2        
						G = f1;
	//  156  340:aload_0         
	//  157  341:fload_2         
	//  158  342:putfield        #285 <Field float G>
						H = f4;
	//  159  345:aload_0         
	//  160  346:fload_3         
	//  161  347:putfield        #886 <Field float H>
						setScrollState(1);
	//  162  350:aload_0         
	//  163  351:iconst_1        
	//  164  352:invokevirtual   #608 <Method void setScrollState(int)>
						setScrollingCacheEnabled(true);
	//  165  355:aload_0         
	//  166  356:iconst_1        
	//  167  357:invokespecial   #297 <Method void setScrollingCacheEnabled(boolean)>
						ViewParent viewparent = getParent();
	//  168  360:aload_0         
	//  169  361:invokevirtual   #371 <Method ViewParent getParent()>
	//  170  364:astore          10
						if(viewparent != null)
	//* 171  366:aload           10
	//* 172  368:ifnull          379
							viewparent.requestDisallowInterceptTouchEvent(true);
	//  173  371:aload           10
	//  174  373:iconst_1        
	//  175  374:invokeinterface #376 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
					}
				}
				if(B)
	//* 176  379:aload_0         
	//* 177  380:getfield        #450 <Field boolean B>
	//* 178  383:ifeq            604
					flag = false | b(motionevent.getX(motionevent.findPointerIndex(K)));
	//  179  386:iconst_0        
	//  180  387:aload_0         
	//  181  388:aload_1         
	//  182  389:aload_1         
	//  183  390:aload_0         
	//  184  391:getfield        #280 <Field int K>
	//  185  394:invokevirtual   #877 <Method int MotionEvent.findPointerIndex(int)>
	//  186  397:invokevirtual   #283 <Method float MotionEvent.getX(int)>
	//  187  400:invokespecial   #894 <Method boolean b(float)>
	//  188  403:ior             
	//  189  404:istore          9
				break;

	//* 190  406:goto            604
			case 1: // '\001'
				if(B)
	//* 191  409:aload_0         
	//* 192  410:getfield        #450 <Field boolean B>
	//* 193  413:ifeq            604
				{
					Object obj = ((Object) (L));
	//  194  416:aload_0         
	//  195  417:getfield        #287 <Field VelocityTracker L>
	//  196  420:astore          10
					((VelocityTracker) (obj)).computeCurrentVelocity(1000, N);
	//  197  422:aload           10
	//  198  424:sipush          1000
	//  199  427:aload_0         
	//  200  428:getfield        #1000 <Field int N>
	//  201  431:i2f             
	//  202  432:invokevirtual   #1004 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
					int l1 = (int)((VelocityTracker) (obj)).getXVelocity(K);
	//  203  435:aload           10
	//  204  437:aload_0         
	//  205  438:getfield        #280 <Field int K>
	//  206  441:invokevirtual   #1007 <Method float VelocityTracker.getXVelocity(int)>
	//  207  444:f2i             
	//  208  445:istore          6
					z = true;
	//  209  447:aload_0         
	//  210  448:iconst_1        
	//  211  449:putfield        #308 <Field boolean z>
					int i2 = getClientWidth();
	//  212  452:aload_0         
	//  213  453:invokespecial   #205 <Method int getClientWidth()>
	//  214  456:istore          7
					int j2 = getScrollX();
	//  215  458:aload_0         
	//  216  459:invokevirtual   #218 <Method int getScrollX()>
	//  217  462:istore          8
					obj = ((Object) (h()));
	//  218  464:aload_0         
	//  219  465:invokespecial   #406 <Method al h()>
	//  220  468:astore          10
					float f5 = p;
	//  221  470:aload_0         
	//  222  471:getfield        #260 <Field int p>
	//  223  474:i2f             
	//  224  475:fstore_3        
					float f2 = i2;
	//  225  476:iload           7
	//  226  478:i2f             
	//  227  479:fstore_2        
					f5 /= f2;
	//  228  480:fload_3         
	//  229  481:fload_2         
	//  230  482:fdiv            
	//  231  483:fstore_3        
					a(a(((al) (obj)).b, ((float)j2 / f2 - ((al) (obj)).e) / (((al) (obj)).d + f5), l1, (int)(motionevent.getX(motionevent.findPointerIndex(K)) - I)), true, true, l1);
	//  232  484:aload_0         
	//  233  485:aload_0         
	//  234  486:aload           10
	//  235  488:getfield        #138 <Field int al.b>
	//  236  491:iload           8
	//  237  493:i2f             
	//  238  494:fload_2         
	//  239  495:fdiv            
	//  240  496:aload           10
	//  241  498:getfield        #230 <Field float al.e>
	//  242  501:fsub            
	//  243  502:aload           10
	//  244  504:getfield        #262 <Field float al.d>
	//  245  507:fload_3         
	//  246  508:fadd            
	//  247  509:fdiv            
	//  248  510:iload           6
	//  249  512:aload_1         
	//  250  513:aload_1         
	//  251  514:aload_0         
	//  252  515:getfield        #280 <Field int K>
	//  253  518:invokevirtual   #877 <Method int MotionEvent.findPointerIndex(int)>
	//  254  521:invokevirtual   #283 <Method float MotionEvent.getX(int)>
	//  255  524:aload_0         
	//  256  525:getfield        #892 <Field float I>
	//  257  528:fsub            
	//  258  529:f2i             
	//  259  530:invokespecial   #1009 <Method int a(int, float, int, int)>
	//  260  533:iconst_1        
	//  261  534:iconst_1        
	//  262  535:iload           6
	//  263  537:invokevirtual   #627 <Method void a(int, boolean, boolean, int)>
					flag = g();
	//  264  540:aload_0         
	//  265  541:invokespecial   #913 <Method boolean g()>
	//  266  544:istore          9
				}
				break;

	//* 267  546:goto            604
			case 0: // '\0'
				m.abortAnimation();
	//  268  549:aload_0         
	//  269  550:getfield        #194 <Field Scroller m>
	//  270  553:invokevirtual   #300 <Method void Scroller.abortAnimation()>
				z = false;
	//  271  556:aload_0         
	//  272  557:iconst_0        
	//  273  558:putfield        #308 <Field boolean z>
				b();
	//  274  561:aload_0         
	//  275  562:invokevirtual   #605 <Method void b()>
				float f3 = motionevent.getX();
	//  276  565:aload_1         
	//  277  566:invokevirtual   #897 <Method float MotionEvent.getX()>
	//  278  569:fstore_2        
				I = f3;
	//  279  570:aload_0         
	//  280  571:fload_2         
	//  281  572:putfield        #892 <Field float I>
				G = f3;
	//  282  575:aload_0         
	//  283  576:fload_2         
	//  284  577:putfield        #285 <Field float G>
				f3 = motionevent.getY();
	//  285  580:aload_1         
	//  286  581:invokevirtual   #899 <Method float MotionEvent.getY()>
	//  287  584:fstore_2        
				J = f3;
	//  288  585:aload_0         
	//  289  586:fload_2         
	//  290  587:putfield        #882 <Field float J>
				H = f3;
	//  291  590:aload_0         
	//  292  591:fload_2         
	//  293  592:putfield        #886 <Field float H>
				K = motionevent.getPointerId(0);
	//  294  595:aload_0         
	//  295  596:aload_1         
	//  296  597:iconst_0        
	//  297  598:invokevirtual   #278 <Method int MotionEvent.getPointerId(int)>
	//  298  601:putfield        #280 <Field int K>
				break;
			}
			if(flag)
	//* 299  604:iload           9
	//* 300  606:ifeq            613
				android.support.v4.view.ac.d(((View) (this)));
	//  301  609:aload_0         
	//  302  610:invokestatic    #623 <Method void ac.d(View)>
			return true;
	//  303  613:iconst_1        
	//  304  614:ireturn         
		} else
		{
			return false;
	//  305  615:iconst_0        
	//  306  616:ireturn         
		}
	}

	public void removeView(View view)
	{
		if(x)
	//*   0    0:aload_0         
	//*   1    1:getfield        #700 <Field boolean x>
	//*   2    4:ifeq            13
		{
			removeViewInLayout(view);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #1013 <Method void removeViewInLayout(View)>
			return;
	//    6   12:return          
		} else
		{
			super.removeView(view);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #1015 <Method void ViewGroup.removeView(View)>
			return;
	//   10   18:return          
		}
	}

	public void setAdapter(z z1)
	{
		Object obj = ((Object) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field z b>
	//    2    4:astore          6
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(obj != null)
	//*   5    8:aload           6
	//*   6   10:ifnull          108
		{
			((z) (obj)).a(((android.database.DataSetObserver) (null)));
	//    7   13:aload           6
	//    8   15:aconst_null     
	//    9   16:invokevirtual   #1020 <Method void z.a(android.database.DataSetObserver)>
			b.a(((ViewGroup) (this)));
	//   10   19:aload_0         
	//   11   20:getfield        #254 <Field z b>
	//   12   23:aload_0         
	//   13   24:invokevirtual   #491 <Method void z.a(ViewGroup)>
			for(int i1 = 0; i1 < g.size(); i1++)
	//*  14   27:iconst_0        
	//*  15   28:istore_2        
	//*  16   29:iload_2         
	//*  17   30:aload_0         
	//*  18   31:getfield        #124 <Field ArrayList g>
	//*  19   34:invokevirtual   #130 <Method int ArrayList.size()>
	//*  20   37:icmpge          78
			{
				obj = ((Object) ((al)g.get(i1)));
	//   21   40:aload_0         
	//   22   41:getfield        #124 <Field ArrayList g>
	//   23   44:iload_2         
	//   24   45:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   25   48:checkcast       #136 <Class al>
	//   26   51:astore          6
				b.a(((ViewGroup) (this)), ((al) (obj)).b, ((al) (obj)).a);
	//   27   53:aload_0         
	//   28   54:getfield        #254 <Field z b>
	//   29   57:aload_0         
	//   30   58:aload           6
	//   31   60:getfield        #138 <Field int al.b>
	//   32   63:aload           6
	//   33   65:getfield        #471 <Field Object al.a>
	//   34   68:invokevirtual   #494 <Method void z.a(ViewGroup, int, Object)>
			}

	//   35   71:iload_2         
	//   36   72:iconst_1        
	//   37   73:iadd            
	//   38   74:istore_2        
	//*  39   75:goto            29
			b.b(((ViewGroup) (this)));
	//   40   78:aload_0         
	//   41   79:getfield        #254 <Field z b>
	//   42   82:aload_0         
	//   43   83:invokevirtual   #496 <Method void z.b(ViewGroup)>
			g.clear();
	//   44   86:aload_0         
	//   45   87:getfield        #124 <Field ArrayList g>
	//   46   90:invokevirtual   #425 <Method void ArrayList.clear()>
			e();
	//   47   93:aload_0         
	//   48   94:invokespecial   #1022 <Method void e()>
			c = 0;
	//   49   97:aload_0         
	//   50   98:iconst_0        
	//   51   99:putfield        #120 <Field int c>
			scrollTo(0, 0);
	//   52  102:aload_0         
	//   53  103:iconst_0        
	//   54  104:iconst_0        
	//   55  105:invokevirtual   #225 <Method void scrollTo(int, int)>
		}
		obj = ((Object) (b));
	//   56  108:aload_0         
	//   57  109:getfield        #254 <Field z b>
	//   58  112:astore          6
		b = z1;
	//   59  114:aload_0         
	//   60  115:aload_1         
	//   61  116:putfield        #254 <Field z b>
		d = 0;
	//   62  119:aload_0         
	//   63  120:iconst_0        
	//   64  121:putfield        #480 <Field int d>
		if(b != null)
	//*  65  124:aload_0         
	//*  66  125:getfield        #254 <Field z b>
	//*  67  128:ifnull          254
		{
			if(o == null)
	//*  68  131:aload_0         
	//*  69  132:getfield        #1024 <Field aq o>
	//*  70  135:ifnonnull       150
				o = new aq(this);
	//   71  138:aload_0         
	//   72  139:new             #1026 <Class aq>
	//   73  142:dup             
	//   74  143:aload_0         
	//   75  144:invokespecial   #1029 <Method void aq(ViewPager)>
	//   76  147:putfield        #1024 <Field aq o>
			b.a(((android.database.DataSetObserver) (o)));
	//   77  150:aload_0         
	//   78  151:getfield        #254 <Field z b>
	//   79  154:aload_0         
	//   80  155:getfield        #1024 <Field aq o>
	//   81  158:invokevirtual   #1020 <Method void z.a(android.database.DataSetObserver)>
			z = false;
	//   82  161:aload_0         
	//   83  162:iconst_0        
	//   84  163:putfield        #308 <Field boolean z>
			boolean flag1 = T;
	//   85  166:aload_0         
	//   86  167:getfield        #393 <Field boolean T>
	//   87  170:istore          5
			T = true;
	//   88  172:aload_0         
	//   89  173:iconst_1        
	//   90  174:putfield        #393 <Field boolean T>
			d = b.a();
	//   91  177:aload_0         
	//   92  178:aload_0         
	//   93  179:getfield        #254 <Field z b>
	//   94  182:invokevirtual   #258 <Method int z.a()>
	//   95  185:putfield        #480 <Field int d>
			if(j >= 0)
	//*  96  188:aload_0         
	//*  97  189:getfield        #976 <Field int j>
	//*  98  192:iflt            238
			{
				b.a(k, l);
	//   99  195:aload_0         
	//  100  196:getfield        #254 <Field z b>
	//  101  199:aload_0         
	//  102  200:getfield        #978 <Field Parcelable k>
	//  103  203:aload_0         
	//  104  204:getfield        #980 <Field ClassLoader l>
	//  105  207:invokevirtual   #972 <Method void z.a(Parcelable, ClassLoader)>
				a(j, false, true);
	//  106  210:aload_0         
	//  107  211:aload_0         
	//  108  212:getfield        #976 <Field int j>
	//  109  215:iconst_0        
	//  110  216:iconst_1        
	//  111  217:invokevirtual   #501 <Method void a(int, boolean, boolean)>
				j = -1;
	//  112  220:aload_0         
	//  113  221:iconst_m1       
	//  114  222:putfield        #976 <Field int j>
				k = null;
	//  115  225:aload_0         
	//  116  226:aconst_null     
	//  117  227:putfield        #978 <Field Parcelable k>
				l = null;
	//  118  230:aload_0         
	//  119  231:aconst_null     
	//  120  232:putfield        #980 <Field ClassLoader l>
			} else
	//* 121  235:goto            254
			if(!flag1)
	//* 122  238:iload           5
	//* 123  240:ifne            250
				b();
	//  124  243:aload_0         
	//  125  244:invokevirtual   #605 <Method void b()>
			else
	//* 126  247:goto            254
				requestLayout();
	//  127  250:aload_0         
	//  128  251:invokevirtual   #504 <Method void requestLayout()>
		}
		List list = ad;
	//  129  254:aload_0         
	//  130  255:getfield        #1031 <Field List ad>
	//  131  258:astore          7
		if(list != null && !list.isEmpty())
	//* 132  260:aload           7
	//* 133  262:ifnull          323
	//* 134  265:aload           7
	//* 135  267:invokeinterface #1032 <Method boolean List.isEmpty()>
	//* 136  272:ifne            323
		{
			int k1 = ad.size();
	//  137  275:aload_0         
	//  138  276:getfield        #1031 <Field List ad>
	//  139  279:invokeinterface #340 <Method int List.size()>
	//  140  284:istore          4
			for(int j1 = ((int) (flag)); j1 < k1; j1++)
	//* 141  286:iload_3         
	//* 142  287:istore_2        
	//* 143  288:iload_2         
	//* 144  289:iload           4
	//* 145  291:icmpge          323
				((an)ad.get(j1)).a(this, ((z) (obj)), z1);
	//  146  294:aload_0         
	//  147  295:getfield        #1031 <Field List ad>
	//  148  298:iload_2         
	//  149  299:invokeinterface #341 <Method Object List.get(int)>
	//  150  304:checkcast       #1034 <Class an>
	//  151  307:aload_0         
	//  152  308:aload           6
	//  153  310:aload_1         
	//  154  311:invokeinterface #1037 <Method void an.a(ViewPager, z, z)>

	//  155  316:iload_2         
	//  156  317:iconst_1        
	//  157  318:iadd            
	//  158  319:istore_2        
		}
	//* 159  320:goto            288
	//  160  323:return          
	}

	public void setCurrentItem(int i1)
	{
		z = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #308 <Field boolean z>
		a(i1, T ^ true, false);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #393 <Field boolean T>
	//    7   11:iconst_1        
	//    8   12:ixor            
	//    9   13:iconst_0        
	//   10   14:invokevirtual   #501 <Method void a(int, boolean, boolean)>
	//   11   17:return          
	}

	public void setOffscreenPageLimit(int i1)
	{
		int j1 = i1;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i1 < 1)
	//*   2    2:iload_1         
	//*   3    3:iconst_1        
	//*   4    4:icmpge          56
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    7:new             #556 <Class StringBuilder>
	//    6   10:dup             
	//    7   11:invokespecial   #557 <Method void StringBuilder()>
	//    8   14:astore_3        
			stringbuilder.append("Requested offscreen page limit ");
	//    9   15:aload_3         
	//   10   16:ldc2            #1041 <String "Requested offscreen page limit ">
	//   11   19:invokevirtual   #563 <Method StringBuilder StringBuilder.append(String)>
	//   12   22:pop             
			stringbuilder.append(i1);
	//   13   23:aload_3         
	//   14   24:iload_1         
	//   15   25:invokevirtual   #566 <Method StringBuilder StringBuilder.append(int)>
	//   16   28:pop             
			stringbuilder.append(" too small; defaulting to ");
	//   17   29:aload_3         
	//   18   30:ldc2            #1043 <String " too small; defaulting to ">
	//   19   33:invokevirtual   #563 <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
			stringbuilder.append(1);
	//   21   37:aload_3         
	//   22   38:iconst_1        
	//   23   39:invokevirtual   #566 <Method StringBuilder StringBuilder.append(int)>
	//   24   42:pop             
			Log.w("ViewPager", stringbuilder.toString());
	//   25   43:ldc2            #722 <String "ViewPager">
	//   26   46:aload_3         
	//   27   47:invokevirtual   #581 <Method String StringBuilder.toString()>
	//   28   50:invokestatic    #1045 <Method int Log.w(String, String)>
	//   29   53:pop             
			j1 = 1;
	//   30   54:iconst_1        
	//   31   55:istore_2        
		}
		if(j1 != A)
	//*  32   56:iload_2         
	//*  33   57:aload_0         
	//*  34   58:getfield        #482 <Field int A>
	//*  35   61:icmpeq          73
		{
			A = j1;
	//   36   64:aload_0         
	//   37   65:iload_2         
	//   38   66:putfield        #482 <Field int A>
			b();
	//   39   69:aload_0         
	//   40   70:invokevirtual   #605 <Method void b()>
		}
	//   41   73:return          
	}

	public void setOnPageChangeListener(ao ao1)
	{
		ab = ao1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #331 <Field ao ab>
	//    3    5:return          
	}

	public void setPageMargin(int i1)
	{
		int j1 = p;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field int p>
	//    2    4:istore_2        
		p = i1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #260 <Field int p>
		int k1 = getWidth();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #328 <Method int getWidth()>
	//    8   14:istore_3        
		a(k1, k1, i1, j1);
	//    9   15:aload_0         
	//   10   16:iload_3         
	//   11   17:iload_3         
	//   12   18:iload_1         
	//   13   19:iload_2         
	//   14   20:invokespecial   #992 <Method void a(int, int, int, int)>
		requestLayout();
	//   15   23:aload_0         
	//   16   24:invokevirtual   #504 <Method void requestLayout()>
	//   17   27:return          
	}

	public void setPageMarginDrawable(int i1)
	{
		setPageMarginDrawable(android.support.v4.a.c.a(getContext(), i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #838 <Method android.content.Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #1056 <Method Drawable c.a(android.content.Context, int)>
	//    5    9:invokevirtual   #1059 <Method void setPageMarginDrawable(Drawable)>
	//    6   12:return          
	}

	public void setPageMarginDrawable(Drawable drawable)
	{
		q = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #818 <Field Drawable q>
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			refreshDrawableState();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #1062 <Method void refreshDrawableState()>
		boolean flag;
		if(drawable == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       22
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:goto            24
			flag = false;
	//   12   22:iconst_0        
	//   13   23:istore_2        
		setWillNotDraw(flag);
	//   14   24:aload_0         
	//   15   25:iload_2         
	//   16   26:invokevirtual   #1065 <Method void setWillNotDraw(boolean)>
		invalidate();
	//   17   29:aload_0         
	//   18   30:invokevirtual   #1068 <Method void invalidate()>
	//   19   33:return          
	}

	void setScrollState(int i1)
	{
		if(ak == i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #294 <Field int ak>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		ak = i1;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #294 <Field int ak>
		if(ae != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #593 <Field ap ae>
	//*  10   18:ifnull          37
		{
			boolean flag;
			if(i1 != 0)
	//*  11   21:iload_1         
	//*  12   22:ifeq            30
				flag = true;
	//   13   25:iconst_1        
	//   14   26:istore_2        
			else
	//*  15   27:goto            32
				flag = false;
	//   16   30:iconst_0        
	//   17   31:istore_2        
			b(flag);
	//   18   32:aload_0         
	//   19   33:iload_2         
	//   20   34:invokespecial   #1070 <Method void b(boolean)>
		}
		f(i1);
	//   21   37:aload_0         
	//   22   38:iload_1         
	//   23   39:invokespecial   #1072 <Method void f(int)>
	//   24   42:return          
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == q;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1076 <Method boolean ViewGroup.verifyDrawable(Drawable)>
	//    3    5:ifne            21
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #818 <Field Drawable q>
	//    7   13:if_acmpne       19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	static final int a[] = {
		0x10100b3
	};
	private static final as ai = new as();
	private static final Comparator e = new ai();
	private static final Interpolator f = new aj();
	private int A;
	private boolean B;
	private boolean C;
	private int D;
	private int E;
	private int F;
	private float G;
	private float H;
	private float I;
	private float J;
	private int K;
	private VelocityTracker L;
	private int M;
	private int N;
	private int O;
	private int P;
	private boolean Q;
	private EdgeEffect R;
	private EdgeEffect S;
	private boolean T;
	private boolean U;
	private boolean V;
	private int W;
	private List aa;
	private ao ab;
	private ao ac;
	private List ad;
	private ap ae;
	private int af;
	private int ag;
	private ArrayList ah;
	private final Runnable aj;
	private int ak;
	z b;
	int c;
	private int d;
	private final ArrayList g;
	private final al h;
	private final Rect i;
	private int j;
	private Parcelable k;
	private ClassLoader l;
	private Scroller m;
	private boolean n;
	private aq o;
	private int p;
	private Drawable q;
	private int r;
	private int s;
	private float t;
	private float u;
	private int v;
	private int w;
	private boolean x;
	private boolean y;
	private boolean z;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #87  <Int 0x10100b3>
	//    5    7:iastore         
	//    6    8:putstatic       #89  <Field int[] a>
	//    7   11:new             #91  <Class ai>
	//    8   14:dup             
	//    9   15:invokespecial   #94  <Method void ai()>
	//   10   18:putstatic       #96  <Field Comparator e>
	//   11   21:new             #98  <Class aj>
	//   12   24:dup             
	//   13   25:invokespecial   #99  <Method void aj()>
	//   14   28:putstatic       #101 <Field Interpolator f>
	//   15   31:new             #103 <Class as>
	//   16   34:dup             
	//   17   35:invokespecial   #104 <Method void as()>
	//   18   38:putstatic       #106 <Field as ai>
	//*  19   41:return          
	}

	private class SavedState extends AbsSavedState
	{

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #60  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #61  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("FragmentPager.SavedState{");
		//    4    8:aload_1         
		//    5    9:ldc1            #63  <String "FragmentPager.SavedState{">
		//    6   11:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:invokestatic    #73  <Method int System.identityHashCode(Object)>
		//   11   20:invokestatic    #79  <Method String Integer.toHexString(int)>
		//   12   23:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(" position=");
		//   14   27:aload_1         
		//   15   28:ldc1            #81  <String " position=">
		//   16   30:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
			stringbuilder.append(a);
		//   18   34:aload_1         
		//   19   35:aload_0         
		//   20   36:getfield        #45  <Field int a>
		//   21   39:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
		//   22   42:pop             
			stringbuilder.append("}");
		//   23   43:aload_1         
		//   24   44:ldc1            #86  <String "}">
		//   25   46:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//   26   49:pop             
			return stringbuilder.toString();
		//   27   50:aload_1         
		//   28   51:invokevirtual   #88  <Method String StringBuilder.toString()>
		//   29   54:areturn         
		}

		public void writeToParcel(Parcel parcel, int i1)
		{
			super.writeToParcel(parcel, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #92  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(a);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #45  <Field int a>
		//    7   11:invokevirtual   #96  <Method void Parcel.writeInt(int)>
			parcel.writeParcelable(b, i1);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #51  <Field Parcelable b>
		//   11   19:iload_2         
		//   12   20:invokevirtual   #100 <Method void Parcel.writeParcelable(Parcelable, int)>
		//   13   23:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new ar();
		int a;
		Parcelable b;
		ClassLoader c;

		static 
		{
		//    0    0:new             #16  <Class ar>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void ar()>
		//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #25  <Method void AbsSavedState(Parcel, ClassLoader)>
			ClassLoader classloader1 = classloader;
		//    4    6:aload_2         
		//    5    7:astore_3        
			if(classloader == null)
		//*   6    8:aload_2         
		//*   7    9:ifnonnull       20
				classloader1 = ((Object)this).getClass().getClassLoader();
		//    8   12:aload_0         
		//    9   13:invokevirtual   #31  <Method Class Object.getClass()>
		//   10   16:invokevirtual   #37  <Method ClassLoader Class.getClassLoader()>
		//   11   19:astore_3        
			a = parcel.readInt();
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:invokevirtual   #43  <Method int Parcel.readInt()>
		//   15   25:putfield        #45  <Field int a>
			b = parcel.readParcelable(classloader1);
		//   16   28:aload_0         
		//   17   29:aload_1         
		//   18   30:aload_3         
		//   19   31:invokevirtual   #49  <Method Parcelable Parcel.readParcelable(ClassLoader)>
		//   20   34:putfield        #51  <Field Parcelable b>
			c = classloader1;
		//   21   37:aload_0         
		//   22   38:aload_3         
		//   23   39:putfield        #53  <Field ClassLoader c>
		//   24   42:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #56  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

}
