// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.Map;

// Referenced classes of package android.support.transition:
//			Visibility, e, ah, aj

public class Explode extends Visibility
{

	public Explode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Visibility()>
		i = new int[2];
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:putfield        #27  <Field int[] i>
		a(((af) (new e())));
	//    6   11:aload_0         
	//    7   12:new             #29  <Class e>
	//    8   15:dup             
	//    9   16:invokespecial   #30  <Method void e()>
	//   10   19:invokevirtual   #34  <Method void a(af)>
	//   11   22:return          
	}

	public Explode(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #37  <Method void Visibility(Context, AttributeSet)>
		i = new int[2];
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:newarray        int[]
	//    7   10:putfield        #27  <Field int[] i>
		a(((af) (new e())));
	//    8   13:aload_0         
	//    9   14:new             #29  <Class e>
	//   10   17:dup             
	//   11   18:invokespecial   #30  <Method void e()>
	//   12   21:invokevirtual   #34  <Method void a(af)>
	//   13   24:return          
	}

	private static float a(float f, float f1)
	{
		return (float)Math.sqrt(f * f + f1 * f1);
	//    0    0:fload_0         
	//    1    1:fload_0         
	//    2    2:fmul            
	//    3    3:fload_1         
	//    4    4:fload_1         
	//    5    5:fmul            
	//    6    6:fadd            
	//    7    7:f2d             
	//    8    8:invokestatic    #44  <Method double Math.sqrt(double)>
	//    9   11:d2f             
	//   10   12:freturn         
	}

	private static float a(View view, int j, int k)
	{
		j = Math.max(j, view.getWidth() - j);
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #51  <Method int View.getWidth()>
	//    3    5:iload_1         
	//    4    6:isub            
	//    5    7:invokestatic    #55  <Method int Math.max(int, int)>
	//    6   10:istore_1        
		k = Math.max(k, view.getHeight() - k);
	//    7   11:iload_2         
	//    8   12:aload_0         
	//    9   13:invokevirtual   #58  <Method int View.getHeight()>
	//   10   16:iload_2         
	//   11   17:isub            
	//   12   18:invokestatic    #55  <Method int Math.max(int, int)>
	//   13   21:istore_2        
		return a(j, k);
	//   14   22:iload_1         
	//   15   23:i2f             
	//   16   24:iload_2         
	//   17   25:i2f             
	//   18   26:invokestatic    #60  <Method float a(float, float)>
	//   19   29:freturn         
	}

	private void a(View view, Rect rect, int ai[])
	{
		view.getLocationOnScreen(i);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field int[] i>
	//    3    5:invokevirtual   #65  <Method void View.getLocationOnScreen(int[])>
		int l = i[0];
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field int[] i>
	//    6   12:iconst_0        
	//    7   13:iaload          
	//    8   14:istore          10
		int i1 = i[1];
	//    9   16:aload_0         
	//   10   17:getfield        #27  <Field int[] i>
	//   11   20:iconst_1        
	//   12   21:iaload          
	//   13   22:istore          11
		Rect rect1 = i();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #68  <Method Rect i()>
	//   16   28:astore          14
		int j;
		int k;
		if(rect1 == null)
	//*  17   30:aload           14
	//*  18   32:ifnonnull       76
		{
			j = view.getWidth() / 2 + l + Math.round(view.getTranslationX());
	//   19   35:aload_1         
	//   20   36:invokevirtual   #51  <Method int View.getWidth()>
	//   21   39:iconst_2        
	//   22   40:idiv            
	//   23   41:iload           10
	//   24   43:iadd            
	//   25   44:aload_1         
	//   26   45:invokevirtual   #72  <Method float View.getTranslationX()>
	//   27   48:invokestatic    #76  <Method int Math.round(float)>
	//   28   51:iadd            
	//   29   52:istore          8
			k = view.getHeight() / 2 + i1 + Math.round(view.getTranslationY());
	//   30   54:aload_1         
	//   31   55:invokevirtual   #58  <Method int View.getHeight()>
	//   32   58:iconst_2        
	//   33   59:idiv            
	//   34   60:iload           11
	//   35   62:iadd            
	//   36   63:aload_1         
	//   37   64:invokevirtual   #79  <Method float View.getTranslationY()>
	//   38   67:invokestatic    #76  <Method int Math.round(float)>
	//   39   70:iadd            
	//   40   71:istore          9
		} else
	//*  41   73:goto            90
		{
			j = rect1.centerX();
	//   42   76:aload           14
	//   43   78:invokevirtual   #84  <Method int Rect.centerX()>
	//   44   81:istore          8
			k = rect1.centerY();
	//   45   83:aload           14
	//   46   85:invokevirtual   #87  <Method int Rect.centerY()>
	//   47   88:istore          9
		}
		int j1 = rect.centerX();
	//   48   90:aload_2         
	//   49   91:invokevirtual   #84  <Method int Rect.centerX()>
	//   50   94:istore          12
		int k1 = rect.centerY();
	//   51   96:aload_2         
	//   52   97:invokevirtual   #87  <Method int Rect.centerY()>
	//   53  100:istore          13
		float f2 = j1 - j;
	//   54  102:iload           12
	//   55  104:iload           8
	//   56  106:isub            
	//   57  107:i2f             
	//   58  108:fstore          6
		float f3 = k1 - k;
	//   59  110:iload           13
	//   60  112:iload           9
	//   61  114:isub            
	//   62  115:i2f             
	//   63  116:fstore          7
		float f1 = f2;
	//   64  118:fload           6
	//   65  120:fstore          5
		float f = f3;
	//   66  122:fload           7
	//   67  124:fstore          4
		if(f2 == 0.0F)
	//*  68  126:fload           6
	//*  69  128:fconst_0        
	//*  70  129:fcmpl           
	//*  71  130:ifne            172
		{
			f1 = f2;
	//   72  133:fload           6
	//   73  135:fstore          5
			f = f3;
	//   74  137:fload           7
	//   75  139:fstore          4
			if(f3 == 0.0F)
	//*  76  141:fload           7
	//*  77  143:fconst_0        
	//*  78  144:fcmpl           
	//*  79  145:ifne            172
			{
				f1 = (float)(Math.random() * 2D) - 1.0F;
	//   80  148:invokestatic    #91  <Method double Math.random()>
	//   81  151:ldc2w           #92  <Double 2D>
	//   82  154:dmul            
	//   83  155:d2f             
	//   84  156:fconst_1        
	//   85  157:fsub            
	//   86  158:fstore          5
				f = (float)(Math.random() * 2D) - 1.0F;
	//   87  160:invokestatic    #91  <Method double Math.random()>
	//   88  163:ldc2w           #92  <Double 2D>
	//   89  166:dmul            
	//   90  167:d2f             
	//   91  168:fconst_1        
	//   92  169:fsub            
	//   93  170:fstore          4
			}
		}
		f2 = a(f1, f);
	//   94  172:fload           5
	//   95  174:fload           4
	//   96  176:invokestatic    #60  <Method float a(float, float)>
	//   97  179:fstore          6
		f1 /= f2;
	//   98  181:fload           5
	//   99  183:fload           6
	//  100  185:fdiv            
	//  101  186:fstore          5
		f /= f2;
	//  102  188:fload           4
	//  103  190:fload           6
	//  104  192:fdiv            
	//  105  193:fstore          4
		f2 = a(view, j - l, k - i1);
	//  106  195:aload_1         
	//  107  196:iload           8
	//  108  198:iload           10
	//  109  200:isub            
	//  110  201:iload           9
	//  111  203:iload           11
	//  112  205:isub            
	//  113  206:invokestatic    #95  <Method float a(View, int, int)>
	//  114  209:fstore          6
		ai[0] = Math.round(f1 * f2);
	//  115  211:aload_3         
	//  116  212:iconst_0        
	//  117  213:fload           5
	//  118  215:fload           6
	//  119  217:fmul            
	//  120  218:invokestatic    #76  <Method int Math.round(float)>
	//  121  221:iastore         
		ai[1] = Math.round(f2 * f);
	//  122  222:aload_3         
	//  123  223:iconst_1        
	//  124  224:fload           6
	//  125  226:fload           4
	//  126  228:fmul            
	//  127  229:invokestatic    #76  <Method int Math.round(float)>
	//  128  232:iastore         
	//  129  233:return          
	}

	private void d(ah ah1)
	{
		View view = ah1.b;
	//    0    0:aload_1         
	//    1    1:getfield        #103 <Field View ah.b>
	//    2    4:astore          6
		view.getLocationOnScreen(i);
	//    3    6:aload           6
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field int[] i>
	//    6   12:invokevirtual   #65  <Method void View.getLocationOnScreen(int[])>
		int j = i[0];
	//    7   15:aload_0         
	//    8   16:getfield        #27  <Field int[] i>
	//    9   19:iconst_0        
	//   10   20:iaload          
	//   11   21:istore_2        
		int k = i[1];
	//   12   22:aload_0         
	//   13   23:getfield        #27  <Field int[] i>
	//   14   26:iconst_1        
	//   15   27:iaload          
	//   16   28:istore_3        
		int l = view.getWidth();
	//   17   29:aload           6
	//   18   31:invokevirtual   #51  <Method int View.getWidth()>
	//   19   34:istore          4
		int i1 = view.getHeight();
	//   20   36:aload           6
	//   21   38:invokevirtual   #58  <Method int View.getHeight()>
	//   22   41:istore          5
		ah1.a.put("android:explode:screenBounds", ((Object) (new Rect(j, k, l + j, i1 + k))));
	//   23   43:aload_1         
	//   24   44:getfield        #106 <Field Map ah.a>
	//   25   47:ldc1            #108 <String "android:explode:screenBounds">
	//   26   49:new             #81  <Class Rect>
	//   27   52:dup             
	//   28   53:iload_2         
	//   29   54:iload_3         
	//   30   55:iload           4
	//   31   57:iload_2         
	//   32   58:iadd            
	//   33   59:iload           5
	//   34   61:iload_3         
	//   35   62:iadd            
	//   36   63:invokespecial   #111 <Method void Rect(int, int, int, int)>
	//   37   66:invokeinterface #117 <Method Object Map.put(Object, Object)>
	//   38   71:pop             
	//   39   72:return          
	}

	public Animator a(ViewGroup viewgroup, View view, ah ah1, ah ah2)
	{
		if(ah2 == null)
	//*   0    0:aload           4
	//*   1    2:ifnonnull       7
		{
			return null;
	//    2    5:aconst_null     
	//    3    6:areturn         
		} else
		{
			ah1 = ((ah) ((Rect)ah2.a.get("android:explode:screenBounds")));
	//    4    7:aload           4
	//    5    9:getfield        #106 <Field Map ah.a>
	//    6   12:ldc1            #108 <String "android:explode:screenBounds">
	//    7   14:invokeinterface #122 <Method Object Map.get(Object)>
	//    8   19:checkcast       #81  <Class Rect>
	//    9   22:astore_3        
			float f = view.getTranslationX();
	//   10   23:aload_2         
	//   11   24:invokevirtual   #72  <Method float View.getTranslationX()>
	//   12   27:fstore          5
			float f1 = view.getTranslationY();
	//   13   29:aload_2         
	//   14   30:invokevirtual   #79  <Method float View.getTranslationY()>
	//   15   33:fstore          6
			a(((View) (viewgroup)), ((Rect) (ah1)), i);
	//   16   35:aload_0         
	//   17   36:aload_1         
	//   18   37:aload_3         
	//   19   38:aload_0         
	//   20   39:getfield        #27  <Field int[] i>
	//   21   42:invokespecial   #124 <Method void a(View, Rect, int[])>
			float f2 = i[0];
	//   22   45:aload_0         
	//   23   46:getfield        #27  <Field int[] i>
	//   24   49:iconst_0        
	//   25   50:iaload          
	//   26   51:i2f             
	//   27   52:fstore          7
			float f3 = i[1];
	//   28   54:aload_0         
	//   29   55:getfield        #27  <Field int[] i>
	//   30   58:iconst_1        
	//   31   59:iaload          
	//   32   60:i2f             
	//   33   61:fstore          8
			return aj.a(view, ah2, ((Rect) (ah1)).left, ((Rect) (ah1)).top, f + f2, f1 + f3, f, f1, g);
	//   34   63:aload_2         
	//   35   64:aload           4
	//   36   66:aload_3         
	//   37   67:getfield        #128 <Field int Rect.left>
	//   38   70:aload_3         
	//   39   71:getfield        #131 <Field int Rect.top>
	//   40   74:fload           5
	//   41   76:fload           7
	//   42   78:fadd            
	//   43   79:fload           6
	//   44   81:fload           8
	//   45   83:fadd            
	//   46   84:fload           5
	//   47   86:fload           6
	//   48   88:getstatic       #18  <Field TimeInterpolator g>
	//   49   91:invokestatic    #136 <Method Animator aj.a(View, ah, int, int, float, float, float, float, TimeInterpolator)>
	//   50   94:areturn         
		}
	}

	public void a(ah ah1)
	{
		super.a(ah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #138 <Method void Visibility.a(ah)>
		d(ah1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #140 <Method void d(ah)>
	//    6   10:return          
	}

	public Animator b(ViewGroup viewgroup, View view, ah ah1, ah ah2)
	{
		if(ah1 == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		ah2 = ((ah) ((Rect)ah1.a.get("android:explode:screenBounds")));
	//    4    6:aload_3         
	//    5    7:getfield        #106 <Field Map ah.a>
	//    6   10:ldc1            #108 <String "android:explode:screenBounds">
	//    7   12:invokeinterface #122 <Method Object Map.get(Object)>
	//    8   17:checkcast       #81  <Class Rect>
	//    9   20:astore          4
		int j = ((Rect) (ah2)).left;
	//   10   22:aload           4
	//   11   24:getfield        #128 <Field int Rect.left>
	//   12   27:istore          9
		int k = ((Rect) (ah2)).top;
	//   13   29:aload           4
	//   14   31:getfield        #131 <Field int Rect.top>
	//   15   34:istore          10
		float f2 = view.getTranslationX();
	//   16   36:aload_2         
	//   17   37:invokevirtual   #72  <Method float View.getTranslationX()>
	//   18   40:fstore          7
		float f3 = view.getTranslationY();
	//   19   42:aload_2         
	//   20   43:invokevirtual   #79  <Method float View.getTranslationY()>
	//   21   46:fstore          8
		int ai[] = (int[])ah1.b.getTag(y.a.transition_position);
	//   22   48:aload_3         
	//   23   49:getfield        #103 <Field View ah.b>
	//   24   52:getstatic       #145 <Field int y$a.transition_position>
	//   25   55:invokevirtual   #149 <Method Object View.getTag(int)>
	//   26   58:checkcast       #150 <Class int[]>
	//   27   61:astore          11
		float f;
		float f1;
		if(ai != null)
	//*  28   63:aload           11
	//*  29   65:ifnull          116
		{
			f = (float)(ai[0] - ((Rect) (ah2)).left) + f2;
	//   30   68:aload           11
	//   31   70:iconst_0        
	//   32   71:iaload          
	//   33   72:aload           4
	//   34   74:getfield        #128 <Field int Rect.left>
	//   35   77:isub            
	//   36   78:i2f             
	//   37   79:fload           7
	//   38   81:fadd            
	//   39   82:fstore          5
			f1 = (float)(ai[1] - ((Rect) (ah2)).top) + f3;
	//   40   84:aload           11
	//   41   86:iconst_1        
	//   42   87:iaload          
	//   43   88:aload           4
	//   44   90:getfield        #131 <Field int Rect.top>
	//   45   93:isub            
	//   46   94:i2f             
	//   47   95:fload           8
	//   48   97:fadd            
	//   49   98:fstore          6
			((Rect) (ah2)).offsetTo(ai[0], ai[1]);
	//   50  100:aload           4
	//   51  102:aload           11
	//   52  104:iconst_0        
	//   53  105:iaload          
	//   54  106:aload           11
	//   55  108:iconst_1        
	//   56  109:iaload          
	//   57  110:invokevirtual   #154 <Method void Rect.offsetTo(int, int)>
		} else
	//*  58  113:goto            124
		{
			f = f2;
	//   59  116:fload           7
	//   60  118:fstore          5
			f1 = f3;
	//   61  120:fload           8
	//   62  122:fstore          6
		}
		a(((View) (viewgroup)), ((Rect) (ah2)), i);
	//   63  124:aload_0         
	//   64  125:aload_1         
	//   65  126:aload           4
	//   66  128:aload_0         
	//   67  129:getfield        #27  <Field int[] i>
	//   68  132:invokespecial   #124 <Method void a(View, Rect, int[])>
		return aj.a(view, ah1, j, k, f2, f3, f + (float)i[0], f1 + (float)i[1], h);
	//   69  135:aload_2         
	//   70  136:aload_3         
	//   71  137:iload           9
	//   72  139:iload           10
	//   73  141:fload           7
	//   74  143:fload           8
	//   75  145:fload           5
	//   76  147:aload_0         
	//   77  148:getfield        #27  <Field int[] i>
	//   78  151:iconst_0        
	//   79  152:iaload          
	//   80  153:i2f             
	//   81  154:fadd            
	//   82  155:fload           6
	//   83  157:aload_0         
	//   84  158:getfield        #27  <Field int[] i>
	//   85  161:iconst_1        
	//   86  162:iaload          
	//   87  163:i2f             
	//   88  164:fadd            
	//   89  165:getstatic       #23  <Field TimeInterpolator h>
	//   90  168:invokestatic    #136 <Method Animator aj.a(View, ah, int, int, float, float, float, float, TimeInterpolator)>
	//   91  171:areturn         
	}

	public void b(ah ah1)
	{
		super.b(ah1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #156 <Method void Visibility.b(ah)>
		d(ah1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #140 <Method void d(ah)>
	//    6   10:return          
	}

	private static final TimeInterpolator g = new DecelerateInterpolator();
	private static final TimeInterpolator h = new AccelerateInterpolator();
	private int i[];

	static 
	{
	//    0    0:new             #13  <Class DecelerateInterpolator>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void DecelerateInterpolator()>
	//    3    7:putstatic       #18  <Field TimeInterpolator g>
	//    4   10:new             #20  <Class AccelerateInterpolator>
	//    5   13:dup             
	//    6   14:invokespecial   #21  <Method void AccelerateInterpolator()>
	//    7   17:putstatic       #23  <Field TimeInterpolator h>
	//*   8   20:return          
	}
}
