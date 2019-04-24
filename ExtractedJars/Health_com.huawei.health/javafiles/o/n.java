// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.*;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v4.text.TextDirectionHeuristicsCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.TintTypedArray;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;

// Referenced classes of package o:
//			p, w

public final class n
{

	public n(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method void Object()>
		i = 16;
	//    2    4:aload_0         
	//    3    5:bipush          16
	//    4    7:putfield        #91  <Field int i>
		f = 16;
	//    5   10:aload_0         
	//    6   11:bipush          16
	//    7   13:putfield        #93  <Field int f>
		p = 15F;
	//    8   16:aload_0         
	//    9   17:ldc1            #94  <Float 15F>
	//   10   19:putfield        #96  <Field float p>
		o = 15F;
	//   11   22:aload_0         
	//   12   23:ldc1            #94  <Float 15F>
	//   13   25:putfield        #98  <Field float o>
		e = view;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #100 <Field View e>
	//   17   33:aload_0         
	//   18   34:new             #102 <Class TextPaint>
	//   19   37:dup             
	//   20   38:sipush          129
	//   21   41:invokespecial   #104 <Method void TextPaint(int)>
	//   22   44:putfield        #106 <Field TextPaint M>
	//   23   47:aload_0         
	//   24   48:new             #108 <Class Rect>
	//   25   51:dup             
	//   26   52:invokespecial   #109 <Method void Rect()>
	//   27   55:putfield        #111 <Field Rect g>
	//   28   58:aload_0         
	//   29   59:new             #108 <Class Rect>
	//   30   62:dup             
	//   31   63:invokespecial   #109 <Method void Rect()>
	//   32   66:putfield        #113 <Field Rect k>
	//   33   69:aload_0         
	//   34   70:new             #115 <Class RectF>
	//   35   73:dup             
	//   36   74:invokespecial   #116 <Method void RectF()>
	//   37   77:putfield        #118 <Field RectF h>
	//   38   80:return          
	}

	private static boolean b(float f1, float f2)
	{
		return Math.abs(f1 - f2) < 0.001F;
	//    0    0:fload_0         
	//    1    1:fload_1         
	//    2    2:fsub            
	//    3    3:invokestatic    #125 <Method float Math.abs(float)>
	//    4    6:ldc1            #126 <Float 0.001F>
	//    5    8:fcmpg           
	//    6    9:ifge            14
	//    7   12:iconst_1        
	//    8   13:ireturn         
	//    9   14:iconst_0        
	//   10   15:ireturn         
	}

	private void c(float f1)
	{
		e(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #129 <Method void e(float)>
		s = e(u, t, f1, K);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #131 <Field float u>
	//    6   10:aload_0         
	//    7   11:getfield        #133 <Field float t>
	//    8   14:fload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #135 <Field Interpolator K>
	//   11   19:invokestatic    #138 <Method float e(float, float, float, Interpolator)>
	//   12   22:putfield        #140 <Field float s>
		q = e(l, r, f1, K);
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #142 <Field float l>
	//   16   30:aload_0         
	//   17   31:getfield        #144 <Field float r>
	//   18   34:fload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #135 <Field Interpolator K>
	//   21   39:invokestatic    #138 <Method float e(float, float, float, Interpolator)>
	//   22   42:putfield        #146 <Field float q>
		d(e(p, o, f1, N));
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #96  <Field float p>
	//   26   50:aload_0         
	//   27   51:getfield        #98  <Field float o>
	//   28   54:fload_1         
	//   29   55:aload_0         
	//   30   56:getfield        #148 <Field Interpolator N>
	//   31   59:invokestatic    #138 <Method float e(float, float, float, Interpolator)>
	//   32   62:invokespecial   #150 <Method void d(float)>
		if(m != n)
	//*  33   65:aload_0         
	//*  34   66:getfield        #152 <Field ColorStateList m>
	//*  35   69:aload_0         
	//*  36   70:getfield        #154 <Field ColorStateList n>
	//*  37   73:if_acmpeq       98
			M.setColor(e(n(), p(), f1));
	//   38   76:aload_0         
	//   39   77:getfield        #106 <Field TextPaint M>
	//   40   80:aload_0         
	//   41   81:invokespecial   #157 <Method int n()>
	//   42   84:aload_0         
	//   43   85:invokespecial   #159 <Method int p()>
	//   44   88:fload_1         
	//   45   89:invokestatic    #162 <Method int e(int, int, float)>
	//   46   92:invokevirtual   #163 <Method void TextPaint.setColor(int)>
		else
	//*  47   95:goto            109
			M.setColor(p());
	//   48   98:aload_0         
	//   49   99:getfield        #106 <Field TextPaint M>
	//   50  102:aload_0         
	//   51  103:invokespecial   #159 <Method int p()>
	//   52  106:invokevirtual   #163 <Method void TextPaint.setColor(int)>
		M.setShadowLayer(e(P, L, f1, ((Interpolator) (null))), e(Q, J, f1, ((Interpolator) (null))), e(O, R, f1, ((Interpolator) (null))), e(X, S, f1));
	//   53  109:aload_0         
	//   54  110:getfield        #106 <Field TextPaint M>
	//   55  113:aload_0         
	//   56  114:getfield        #165 <Field float P>
	//   57  117:aload_0         
	//   58  118:getfield        #167 <Field float L>
	//   59  121:fload_1         
	//   60  122:aconst_null     
	//   61  123:invokestatic    #138 <Method float e(float, float, float, Interpolator)>
	//   62  126:aload_0         
	//   63  127:getfield        #169 <Field float Q>
	//   64  130:aload_0         
	//   65  131:getfield        #171 <Field float J>
	//   66  134:fload_1         
	//   67  135:aconst_null     
	//   68  136:invokestatic    #138 <Method float e(float, float, float, Interpolator)>
	//   69  139:aload_0         
	//   70  140:getfield        #173 <Field float O>
	//   71  143:aload_0         
	//   72  144:getfield        #175 <Field float R>
	//   73  147:fload_1         
	//   74  148:aconst_null     
	//   75  149:invokestatic    #138 <Method float e(float, float, float, Interpolator)>
	//   76  152:aload_0         
	//   77  153:getfield        #177 <Field int X>
	//   78  156:aload_0         
	//   79  157:getfield        #179 <Field int S>
	//   80  160:fload_1         
	//   81  161:invokestatic    #162 <Method int e(int, int, float)>
	//   82  164:invokevirtual   #183 <Method void TextPaint.setShadowLayer(float, float, float, int)>
		ViewCompat.postInvalidateOnAnimation(e);
	//   83  167:aload_0         
	//   84  168:getfield        #100 <Field View e>
	//   85  171:invokestatic    #188 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//   86  174:return          
	}

	private static boolean c(Rect rect, int i1, int j1, int k1, int l1)
	{
		return rect.left == i1 && rect.top == j1 && rect.right == k1 && rect.bottom == l1;
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field int Rect.left>
	//    2    4:iload_1         
	//    3    5:icmpne          35
	//    4    8:aload_0         
	//    5    9:getfield        #195 <Field int Rect.top>
	//    6   12:iload_2         
	//    7   13:icmpne          35
	//    8   16:aload_0         
	//    9   17:getfield        #198 <Field int Rect.right>
	//   10   20:iload_3         
	//   11   21:icmpne          35
	//   12   24:aload_0         
	//   13   25:getfield        #201 <Field int Rect.bottom>
	//   14   28:iload           4
	//   15   30:icmpne          35
	//   16   33:iconst_1        
	//   17   34:ireturn         
	//   18   35:iconst_0        
	//   19   36:ireturn         
	}

	private Typeface d(int i1)
	{
		TypedArray typedarray = e.getContext().obtainStyledAttributes(i1, new int[] {
			0x10103ac
		});
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field View e>
	//    2    4:invokevirtual   #208 <Method Context View.getContext()>
	//    3    7:iload_1         
	//    4    8:iconst_1        
	//    5    9:newarray        int[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:ldc1            #209 <Int 0x10103ac>
	//    9   15:iastore         
	//   10   16:invokevirtual   #215 <Method TypedArray Context.obtainStyledAttributes(int, int[])>
	//   11   19:astore_2        
		Object obj = ((Object) (typedarray.getString(0)));
	//   12   20:aload_2         
	//   13   21:iconst_0        
	//   14   22:invokevirtual   #221 <Method String TypedArray.getString(int)>
	//   15   25:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_42;
	//   16   26:aload_3         
	//   17   27:ifnull          42
		obj = ((Object) (Typeface.create(((String) (obj)), 0)));
	//   18   30:aload_3         
	//   19   31:iconst_0        
	//   20   32:invokestatic    #227 <Method Typeface Typeface.create(String, int)>
	//   21   35:astore_3        
		typedarray.recycle();
	//   22   36:aload_2         
	//   23   37:invokevirtual   #230 <Method void TypedArray.recycle()>
		return ((Typeface) (obj));
	//   24   40:aload_3         
	//   25   41:areturn         
		typedarray.recycle();
	//   26   42:aload_2         
	//   27   43:invokevirtual   #230 <Method void TypedArray.recycle()>
		break MISSING_BLOCK_LABEL_56;
	//   28   46:goto            56
		Exception exception;
		exception;
	//   29   49:astore_3        
		typedarray.recycle();
	//   30   50:aload_2         
	//   31   51:invokevirtual   #230 <Method void TypedArray.recycle()>
		throw exception;
	//   32   54:aload_3         
	//   33   55:athrow          
		return null;
	//   34   56:aconst_null     
	//   35   57:areturn         
	}

	private void d(float f1)
	{
		k(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #232 <Method void k(float)>
		boolean flag;
		if(c && H != 1.0F)
	//*   3    5:getstatic       #71  <Field boolean c>
	//*   4    8:ifeq            25
	//*   5   11:aload_0         
	//*   6   12:getfield        #234 <Field float H>
	//*   7   15:fconst_1        
	//*   8   16:fcmpl           
	//*   9   17:ifeq            25
			flag = true;
	//   10   20:iconst_1        
	//   11   21:istore_2        
		else
	//*  12   22:goto            27
			flag = false;
	//   13   25:iconst_0        
	//   14   26:istore_2        
		C = flag;
	//   15   27:aload_0         
	//   16   28:iload_2         
	//   17   29:putfield        #236 <Field boolean C>
		if(C)
	//*  18   32:aload_0         
	//*  19   33:getfield        #236 <Field boolean C>
	//*  20   36:ifeq            43
			t();
	//   21   39:aload_0         
	//   22   40:invokespecial   #238 <Method void t()>
		ViewCompat.postInvalidateOnAnimation(e);
	//   23   43:aload_0         
	//   24   44:getfield        #100 <Field View e>
	//   25   47:invokestatic    #188 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//   26   50:return          
	}

	private boolean d(CharSequence charsequence)
	{
		boolean flag;
		if(ViewCompat.getLayoutDirection(e) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field View e>
	//*   2    4:invokestatic    #243 <Method int ViewCompat.getLayoutDirection(View)>
	//*   3    7:iconst_1        
	//*   4    8:icmpne          16
			flag = true;
	//    5   11:iconst_1        
	//    6   12:istore_2        
		else
	//*   7   13:goto            18
			flag = false;
	//    8   16:iconst_0        
	//    9   17:istore_2        
		TextDirectionHeuristicCompat textdirectionheuristiccompat;
		if(flag)
	//*  10   18:iload_2         
	//*  11   19:ifeq            29
			textdirectionheuristiccompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL;
	//   12   22:getstatic       #249 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL>
	//   13   25:astore_3        
		else
	//*  14   26:goto            33
			textdirectionheuristiccompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
	//   15   29:getstatic       #252 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR>
	//   16   32:astore_3        
		return textdirectionheuristiccompat.isRtl(charsequence, 0, charsequence.length());
	//   17   33:aload_3         
	//   18   34:aload_1         
	//   19   35:iconst_0        
	//   20   36:aload_1         
	//   21   37:invokeinterface #257 <Method int CharSequence.length()>
	//   22   42:invokeinterface #263 <Method boolean TextDirectionHeuristicCompat.isRtl(CharSequence, int, int)>
	//   23   47:ireturn         
	}

	private static float e(float f1, float f2, float f3, Interpolator interpolator)
	{
		float f4 = f3;
	//    0    0:fload_2         
	//    1    1:fstore          4
		if(interpolator != null)
	//*   2    3:aload_3         
	//*   3    4:ifnull          16
			f4 = interpolator.getInterpolation(f3);
	//    4    7:aload_3         
	//    5    8:fload_2         
	//    6    9:invokeinterface #268 <Method float Interpolator.getInterpolation(float)>
	//    7   14:fstore          4
		return o.p.c(f1, f2, f4);
	//    8   16:fload_0         
	//    9   17:fload_1         
	//   10   18:fload           4
	//   11   20:invokestatic    #273 <Method float p.c(float, float, float)>
	//   12   23:freturn         
	}

	private static int e(int i1, int j1, float f1)
	{
		float f2 = 1.0F - f1;
	//    0    0:fconst_1        
	//    1    1:fload_2         
	//    2    2:fsub            
	//    3    3:fstore_3        
		float f3 = Color.alpha(i1);
	//    4    4:iload_0         
	//    5    5:invokestatic    #279 <Method int Color.alpha(int)>
	//    6    8:i2f             
	//    7    9:fstore          4
		float f4 = Color.alpha(j1);
	//    8   11:iload_1         
	//    9   12:invokestatic    #279 <Method int Color.alpha(int)>
	//   10   15:i2f             
	//   11   16:fstore          5
		float f5 = Color.red(i1);
	//   12   18:iload_0         
	//   13   19:invokestatic    #282 <Method int Color.red(int)>
	//   14   22:i2f             
	//   15   23:fstore          6
		float f6 = Color.red(j1);
	//   16   25:iload_1         
	//   17   26:invokestatic    #282 <Method int Color.red(int)>
	//   18   29:i2f             
	//   19   30:fstore          7
		float f7 = Color.green(i1);
	//   20   32:iload_0         
	//   21   33:invokestatic    #285 <Method int Color.green(int)>
	//   22   36:i2f             
	//   23   37:fstore          8
		float f8 = Color.green(j1);
	//   24   39:iload_1         
	//   25   40:invokestatic    #285 <Method int Color.green(int)>
	//   26   43:i2f             
	//   27   44:fstore          9
		float f9 = Color.blue(i1);
	//   28   46:iload_0         
	//   29   47:invokestatic    #288 <Method int Color.blue(int)>
	//   30   50:i2f             
	//   31   51:fstore          10
		float f10 = Color.blue(j1);
	//   32   53:iload_1         
	//   33   54:invokestatic    #288 <Method int Color.blue(int)>
	//   34   57:i2f             
	//   35   58:fstore          11
		return Color.argb((int)(f3 * f2 + f4 * f1), (int)(f5 * f2 + f6 * f1), (int)(f7 * f2 + f8 * f1), (int)(f9 * f2 + f10 * f1));
	//   36   60:fload           4
	//   37   62:fload_3         
	//   38   63:fmul            
	//   39   64:fload           5
	//   40   66:fload_2         
	//   41   67:fmul            
	//   42   68:fadd            
	//   43   69:f2i             
	//   44   70:fload           6
	//   45   72:fload_3         
	//   46   73:fmul            
	//   47   74:fload           7
	//   48   76:fload_2         
	//   49   77:fmul            
	//   50   78:fadd            
	//   51   79:f2i             
	//   52   80:fload           8
	//   53   82:fload_3         
	//   54   83:fmul            
	//   55   84:fload           9
	//   56   86:fload_2         
	//   57   87:fmul            
	//   58   88:fadd            
	//   59   89:f2i             
	//   60   90:fload           10
	//   61   92:fload_3         
	//   62   93:fmul            
	//   63   94:fload           11
	//   64   96:fload_2         
	//   65   97:fmul            
	//   66   98:fadd            
	//   67   99:f2i             
	//   68  100:invokestatic    #292 <Method int Color.argb(int, int, int, int)>
	//   69  103:ireturn         
	}

	private void e(float f1)
	{
		h.left = e(k.left, g.left, f1, K);
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field RectF h>
	//    2    4:aload_0         
	//    3    5:getfield        #113 <Field Rect k>
	//    4    8:getfield        #192 <Field int Rect.left>
	//    5   11:i2f             
	//    6   12:aload_0         
	//    7   13:getfield        #111 <Field Rect g>
	//    8   16:getfield        #192 <Field int Rect.left>
	//    9   19:i2f             
	//   10   20:fload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #135 <Field Interpolator K>
	//   13   25:invokestatic    #138 <Method float e(float, float, float, Interpolator)>
	//   14   28:putfield        #294 <Field float RectF.left>
		h.top = e(l, r, f1, K);
	//   15   31:aload_0         
	//   16   32:getfield        #118 <Field RectF h>
	//   17   35:aload_0         
	//   18   36:getfield        #142 <Field float l>
	//   19   39:aload_0         
	//   20   40:getfield        #144 <Field float r>
	//   21   43:fload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #135 <Field Interpolator K>
	//   24   48:invokestatic    #138 <Method float e(float, float, float, Interpolator)>
	//   25   51:putfield        #296 <Field float RectF.top>
		h.right = e(k.right, g.right, f1, K);
	//   26   54:aload_0         
	//   27   55:getfield        #118 <Field RectF h>
	//   28   58:aload_0         
	//   29   59:getfield        #113 <Field Rect k>
	//   30   62:getfield        #198 <Field int Rect.right>
	//   31   65:i2f             
	//   32   66:aload_0         
	//   33   67:getfield        #111 <Field Rect g>
	//   34   70:getfield        #198 <Field int Rect.right>
	//   35   73:i2f             
	//   36   74:fload_1         
	//   37   75:aload_0         
	//   38   76:getfield        #135 <Field Interpolator K>
	//   39   79:invokestatic    #138 <Method float e(float, float, float, Interpolator)>
	//   40   82:putfield        #298 <Field float RectF.right>
		h.bottom = e(k.bottom, g.bottom, f1, K);
	//   41   85:aload_0         
	//   42   86:getfield        #118 <Field RectF h>
	//   43   89:aload_0         
	//   44   90:getfield        #113 <Field Rect k>
	//   45   93:getfield        #201 <Field int Rect.bottom>
	//   46   96:i2f             
	//   47   97:aload_0         
	//   48   98:getfield        #111 <Field Rect g>
	//   49  101:getfield        #201 <Field int Rect.bottom>
	//   50  104:i2f             
	//   51  105:fload_1         
	//   52  106:aload_0         
	//   53  107:getfield        #135 <Field Interpolator K>
	//   54  110:invokestatic    #138 <Method float e(float, float, float, Interpolator)>
	//   55  113:putfield        #300 <Field float RectF.bottom>
	//   56  116:return          
	}

	private void k(float f1)
	{
		if(y == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #302 <Field CharSequence y>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		float f3 = g.width();
	//    4    8:aload_0         
	//    5    9:getfield        #111 <Field Rect g>
	//    6   12:invokevirtual   #305 <Method int Rect.width()>
	//    7   15:i2f             
	//    8   16:fstore_3        
		float f4 = k.width();
	//    9   17:aload_0         
	//   10   18:getfield        #113 <Field Rect k>
	//   11   21:invokevirtual   #305 <Method int Rect.width()>
	//   12   24:i2f             
	//   13   25:fstore          4
		boolean flag1 = false;
	//   14   27:iconst_0        
	//   15   28:istore          6
		boolean flag = false;
	//   16   30:iconst_0        
	//   17   31:istore          5
		float f2;
		if(b(f1, o))
	//*  18   33:fload_1         
	//*  19   34:aload_0         
	//*  20   35:getfield        #98  <Field float o>
	//*  21   38:invokestatic    #307 <Method boolean b(float, float)>
	//*  22   41:ifeq            81
		{
			f2 = o;
	//   23   44:aload_0         
	//   24   45:getfield        #98  <Field float o>
	//   25   48:fstore_2        
			H = 1.0F;
	//   26   49:aload_0         
	//   27   50:fconst_1        
	//   28   51:putfield        #234 <Field float H>
			if(z != v)
	//*  29   54:aload_0         
	//*  30   55:getfield        #309 <Field Typeface z>
	//*  31   58:aload_0         
	//*  32   59:getfield        #311 <Field Typeface v>
	//*  33   62:if_acmpeq       76
			{
				z = v;
	//   34   65:aload_0         
	//   35   66:aload_0         
	//   36   67:getfield        #311 <Field Typeface v>
	//   37   70:putfield        #309 <Field Typeface z>
				flag = true;
	//   38   73:iconst_1        
	//   39   74:istore          5
			}
			f1 = f3;
	//   40   76:fload_3         
	//   41   77:fstore_1        
		} else
	//*  42   78:goto            175
		{
			f2 = p;
	//   43   81:aload_0         
	//   44   82:getfield        #96  <Field float p>
	//   45   85:fstore_2        
			flag = flag1;
	//   46   86:iload           6
	//   47   88:istore          5
			if(z != w)
	//*  48   90:aload_0         
	//*  49   91:getfield        #309 <Field Typeface z>
	//*  50   94:aload_0         
	//*  51   95:getfield        #313 <Field Typeface w>
	//*  52   98:if_acmpeq       112
			{
				z = w;
	//   53  101:aload_0         
	//   54  102:aload_0         
	//   55  103:getfield        #313 <Field Typeface w>
	//   56  106:putfield        #309 <Field Typeface z>
				flag = true;
	//   57  109:iconst_1        
	//   58  110:istore          5
			}
			if(b(f1, p))
	//*  59  112:fload_1         
	//*  60  113:aload_0         
	//*  61  114:getfield        #96  <Field float p>
	//*  62  117:invokestatic    #307 <Method boolean b(float, float)>
	//*  63  120:ifeq            131
				H = 1.0F;
	//   64  123:aload_0         
	//   65  124:fconst_1        
	//   66  125:putfield        #234 <Field float H>
			else
	//*  67  128:goto            141
				H = f1 / p;
	//   68  131:aload_0         
	//   69  132:fload_1         
	//   70  133:aload_0         
	//   71  134:getfield        #96  <Field float p>
	//   72  137:fdiv            
	//   73  138:putfield        #234 <Field float H>
			f1 = o / p;
	//   74  141:aload_0         
	//   75  142:getfield        #98  <Field float o>
	//   76  145:aload_0         
	//   77  146:getfield        #96  <Field float p>
	//   78  149:fdiv            
	//   79  150:fstore_1        
			if(f4 * f1 > f3)
	//*  80  151:fload           4
	//*  81  153:fload_1         
	//*  82  154:fmul            
	//*  83  155:fload_3         
	//*  84  156:fcmpl           
	//*  85  157:ifle            172
				f1 = Math.min(f3 / f1, f4);
	//   86  160:fload_3         
	//   87  161:fload_1         
	//   88  162:fdiv            
	//   89  163:fload           4
	//   90  165:invokestatic    #317 <Method float Math.min(float, float)>
	//   91  168:fstore_1        
			else
	//*  92  169:goto            175
				f1 = f4;
	//   93  172:fload           4
	//   94  174:fstore_1        
		}
		flag1 = flag;
	//   95  175:iload           5
	//   96  177:istore          6
		if(f1 > 0.0F)
	//*  97  179:fload_1         
	//*  98  180:fconst_0        
	//*  99  181:fcmpl           
	//* 100  182:ifle            229
		{
			if(F != f2 || I || flag)
	//* 101  185:aload_0         
	//* 102  186:getfield        #319 <Field float F>
	//* 103  189:fload_2         
	//* 104  190:fcmpl           
	//* 105  191:ifne            206
	//* 106  194:aload_0         
	//* 107  195:getfield        #321 <Field boolean I>
	//* 108  198:ifne            206
	//* 109  201:iload           5
	//* 110  203:ifeq            212
				flag = true;
	//  111  206:iconst_1        
	//  112  207:istore          5
			else
	//* 113  209:goto            215
				flag = false;
	//  114  212:iconst_0        
	//  115  213:istore          5
			F = f2;
	//  116  215:aload_0         
	//  117  216:fload_2         
	//  118  217:putfield        #319 <Field float F>
			I = false;
	//  119  220:aload_0         
	//  120  221:iconst_0        
	//  121  222:putfield        #321 <Field boolean I>
			flag1 = flag;
	//  122  225:iload           5
	//  123  227:istore          6
		}
		if(x == null || flag1)
	//* 124  229:aload_0         
	//* 125  230:getfield        #323 <Field CharSequence x>
	//* 126  233:ifnull          241
	//* 127  236:iload           6
	//* 128  238:ifeq            342
		{
			M.setTextSize(F);
	//  129  241:aload_0         
	//  130  242:getfield        #106 <Field TextPaint M>
	//  131  245:aload_0         
	//  132  246:getfield        #319 <Field float F>
	//  133  249:invokevirtual   #326 <Method void TextPaint.setTextSize(float)>
			M.setTypeface(z);
	//  134  252:aload_0         
	//  135  253:getfield        #106 <Field TextPaint M>
	//  136  256:aload_0         
	//  137  257:getfield        #309 <Field Typeface z>
	//  138  260:invokevirtual   #330 <Method Typeface TextPaint.setTypeface(Typeface)>
	//  139  263:pop             
			Object obj = ((Object) (M));
	//  140  264:aload_0         
	//  141  265:getfield        #106 <Field TextPaint M>
	//  142  268:astore          8
			boolean flag2;
			if(H != 1.0F)
	//* 143  270:aload_0         
	//* 144  271:getfield        #234 <Field float H>
	//* 145  274:fconst_1        
	//* 146  275:fcmpl           
	//* 147  276:ifeq            285
				flag2 = true;
	//  148  279:iconst_1        
	//  149  280:istore          7
			else
	//* 150  282:goto            288
				flag2 = false;
	//  151  285:iconst_0        
	//  152  286:istore          7
			((TextPaint) (obj)).setLinearText(flag2);
	//  153  288:aload           8
	//  154  290:iload           7
	//  155  292:invokevirtual   #333 <Method void TextPaint.setLinearText(boolean)>
			obj = ((Object) (TextUtils.ellipsize(y, M, f1, android.text.TextUtils.TruncateAt.END)));
	//  156  295:aload_0         
	//  157  296:getfield        #302 <Field CharSequence y>
	//  158  299:aload_0         
	//  159  300:getfield        #106 <Field TextPaint M>
	//  160  303:fload_1         
	//  161  304:getstatic       #339 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//  162  307:invokestatic    #345 <Method CharSequence TextUtils.ellipsize(CharSequence, TextPaint, float, android.text.TextUtils$TruncateAt)>
	//  163  310:astore          8
			if(!TextUtils.equals(((CharSequence) (obj)), x))
	//* 164  312:aload           8
	//* 165  314:aload_0         
	//* 166  315:getfield        #323 <Field CharSequence x>
	//* 167  318:invokestatic    #349 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//* 168  321:ifne            342
			{
				x = ((CharSequence) (obj));
	//  169  324:aload_0         
	//  170  325:aload           8
	//  171  327:putfield        #323 <Field CharSequence x>
				A = d(x);
	//  172  330:aload_0         
	//  173  331:aload_0         
	//  174  332:aload_0         
	//  175  333:getfield        #323 <Field CharSequence x>
	//  176  336:invokespecial   #351 <Method boolean d(CharSequence)>
	//  177  339:putfield        #353 <Field boolean A>
			}
		}
	//  178  342:return          
	}

	private void l()
	{
		c(d);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #355 <Field float d>
	//    3    5:invokespecial   #357 <Method void c(float)>
	//    4    8:return          
	}

	private void m()
	{
		float f2 = F;
	//    0    0:aload_0         
	//    1    1:getfield        #319 <Field float F>
	//    2    4:fstore_2        
		k(o);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #98  <Field float o>
	//    6   10:invokespecial   #232 <Method void k(float)>
		float f1;
		if(x != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #323 <Field CharSequence x>
	//*   9   17:ifnull          45
			f1 = M.measureText(x, 0, x.length());
	//   10   20:aload_0         
	//   11   21:getfield        #106 <Field TextPaint M>
	//   12   24:aload_0         
	//   13   25:getfield        #323 <Field CharSequence x>
	//   14   28:iconst_0        
	//   15   29:aload_0         
	//   16   30:getfield        #323 <Field CharSequence x>
	//   17   33:invokeinterface #257 <Method int CharSequence.length()>
	//   18   38:invokevirtual   #361 <Method float TextPaint.measureText(CharSequence, int, int)>
	//   19   41:fstore_1        
		else
	//*  20   42:goto            47
			f1 = 0.0F;
	//   21   45:fconst_0        
	//   22   46:fstore_1        
		int j1 = f;
	//   23   47:aload_0         
	//   24   48:getfield        #93  <Field int f>
	//   25   51:istore          6
		int i1;
		if(A)
	//*  26   53:aload_0         
	//*  27   54:getfield        #353 <Field boolean A>
	//*  28   57:ifeq            66
			i1 = 1;
	//   29   60:iconst_1        
	//   30   61:istore          5
		else
	//*  31   63:goto            69
			i1 = 0;
	//   32   66:iconst_0        
	//   33   67:istore          5
		i1 = GravityCompat.getAbsoluteGravity(j1, i1);
	//   34   69:iload           6
	//   35   71:iload           5
	//   36   73:invokestatic    #367 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   37   76:istore          5
		switch(i1 & 0x70)
	//*  38   78:iload           5
	//*  39   80:bipush          112
	//*  40   82:iand            
		{
	//*  41   83:lookupswitch    3: default 116
	//	               16: 157
	//	               48: 134
	//	               80: 119
	//*  42  116:goto            157
		case 80: // 'P'
			r = g.bottom;
	//   43  119:aload_0         
	//   44  120:aload_0         
	//   45  121:getfield        #111 <Field Rect g>
	//   46  124:getfield        #201 <Field int Rect.bottom>
	//   47  127:i2f             
	//   48  128:putfield        #144 <Field float r>
			break;

	//*  49  131:goto            201
		case 48: // '0'
			r = (float)g.top - M.ascent();
	//   50  134:aload_0         
	//   51  135:aload_0         
	//   52  136:getfield        #111 <Field Rect g>
	//   53  139:getfield        #195 <Field int Rect.top>
	//   54  142:i2f             
	//   55  143:aload_0         
	//   56  144:getfield        #106 <Field TextPaint M>
	//   57  147:invokevirtual   #371 <Method float TextPaint.ascent()>
	//   58  150:fsub            
	//   59  151:putfield        #144 <Field float r>
			break;

	//*  60  154:goto            201
		case 16: // '\020'
		default:
			float f3 = (M.descent() - M.ascent()) / 2.0F;
	//   61  157:aload_0         
	//   62  158:getfield        #106 <Field TextPaint M>
	//   63  161:invokevirtual   #374 <Method float TextPaint.descent()>
	//   64  164:aload_0         
	//   65  165:getfield        #106 <Field TextPaint M>
	//   66  168:invokevirtual   #371 <Method float TextPaint.ascent()>
	//   67  171:fsub            
	//   68  172:fconst_2        
	//   69  173:fdiv            
	//   70  174:fstore_3        
			float f5 = M.descent();
	//   71  175:aload_0         
	//   72  176:getfield        #106 <Field TextPaint M>
	//   73  179:invokevirtual   #374 <Method float TextPaint.descent()>
	//   74  182:fstore          4
			r = (float)g.centerY() + (f3 - f5);
	//   75  184:aload_0         
	//   76  185:aload_0         
	//   77  186:getfield        #111 <Field Rect g>
	//   78  189:invokevirtual   #377 <Method int Rect.centerY()>
	//   79  192:i2f             
	//   80  193:fload_3         
	//   81  194:fload           4
	//   82  196:fsub            
	//   83  197:fadd            
	//   84  198:putfield        #144 <Field float r>
			break;
		}
		switch(0x800007 & i1)
	//*  85  201:ldc2            #378 <Int 0x800007>
	//*  86  204:iload           5
	//*  87  206:iand            
		{
	//*  88  207:tableswitch     1 5: default 240
	//	               1 243
	//	               2 279
	//	               3 279
	//	               4 279
	//	               5 262
	//*  89  240:goto            279
		case 1: // '\001'
			t = (float)g.centerX() - f1 / 2.0F;
	//   90  243:aload_0         
	//   91  244:aload_0         
	//   92  245:getfield        #111 <Field Rect g>
	//   93  248:invokevirtual   #381 <Method int Rect.centerX()>
	//   94  251:i2f             
	//   95  252:fload_1         
	//   96  253:fconst_2        
	//   97  254:fdiv            
	//   98  255:fsub            
	//   99  256:putfield        #133 <Field float t>
			break;

	//* 100  259:goto            291
		case 5: // '\005'
			t = (float)g.right - f1;
	//  101  262:aload_0         
	//  102  263:aload_0         
	//  103  264:getfield        #111 <Field Rect g>
	//  104  267:getfield        #198 <Field int Rect.right>
	//  105  270:i2f             
	//  106  271:fload_1         
	//  107  272:fsub            
	//  108  273:putfield        #133 <Field float t>
			break;

	//* 109  276:goto            291
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		default:
			t = g.left;
	//  110  279:aload_0         
	//  111  280:aload_0         
	//  112  281:getfield        #111 <Field Rect g>
	//  113  284:getfield        #192 <Field int Rect.left>
	//  114  287:i2f             
	//  115  288:putfield        #133 <Field float t>
			break;
		}
		k(p);
	//  116  291:aload_0         
	//  117  292:aload_0         
	//  118  293:getfield        #96  <Field float p>
	//  119  296:invokespecial   #232 <Method void k(float)>
		if(x != null)
	//* 120  299:aload_0         
	//* 121  300:getfield        #323 <Field CharSequence x>
	//* 122  303:ifnull          331
			f1 = M.measureText(x, 0, x.length());
	//  123  306:aload_0         
	//  124  307:getfield        #106 <Field TextPaint M>
	//  125  310:aload_0         
	//  126  311:getfield        #323 <Field CharSequence x>
	//  127  314:iconst_0        
	//  128  315:aload_0         
	//  129  316:getfield        #323 <Field CharSequence x>
	//  130  319:invokeinterface #257 <Method int CharSequence.length()>
	//  131  324:invokevirtual   #361 <Method float TextPaint.measureText(CharSequence, int, int)>
	//  132  327:fstore_1        
		else
	//* 133  328:goto            333
			f1 = 0.0F;
	//  134  331:fconst_0        
	//  135  332:fstore_1        
		j1 = i;
	//  136  333:aload_0         
	//  137  334:getfield        #91  <Field int i>
	//  138  337:istore          6
		if(A)
	//* 139  339:aload_0         
	//* 140  340:getfield        #353 <Field boolean A>
	//* 141  343:ifeq            352
			i1 = 1;
	//  142  346:iconst_1        
	//  143  347:istore          5
		else
	//* 144  349:goto            355
			i1 = 0;
	//  145  352:iconst_0        
	//  146  353:istore          5
		i1 = GravityCompat.getAbsoluteGravity(j1, i1);
	//  147  355:iload           6
	//  148  357:iload           5
	//  149  359:invokestatic    #367 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//  150  362:istore          5
		switch(i1 & 0x70)
	//* 151  364:iload           5
	//* 152  366:bipush          112
	//* 153  368:iand            
		{
	//* 154  369:lookupswitch    3: default 404
	//	               16: 445
	//	               48: 422
	//	               80: 407
	//* 155  404:goto            445
		case 80: // 'P'
			l = k.bottom;
	//  156  407:aload_0         
	//  157  408:aload_0         
	//  158  409:getfield        #113 <Field Rect k>
	//  159  412:getfield        #201 <Field int Rect.bottom>
	//  160  415:i2f             
	//  161  416:putfield        #142 <Field float l>
			break;

	//* 162  419:goto            489
		case 48: // '0'
			l = (float)k.top - M.ascent();
	//  163  422:aload_0         
	//  164  423:aload_0         
	//  165  424:getfield        #113 <Field Rect k>
	//  166  427:getfield        #195 <Field int Rect.top>
	//  167  430:i2f             
	//  168  431:aload_0         
	//  169  432:getfield        #106 <Field TextPaint M>
	//  170  435:invokevirtual   #371 <Method float TextPaint.ascent()>
	//  171  438:fsub            
	//  172  439:putfield        #142 <Field float l>
			break;

	//* 173  442:goto            489
		case 16: // '\020'
		default:
			float f4 = (M.descent() - M.ascent()) / 2.0F;
	//  174  445:aload_0         
	//  175  446:getfield        #106 <Field TextPaint M>
	//  176  449:invokevirtual   #374 <Method float TextPaint.descent()>
	//  177  452:aload_0         
	//  178  453:getfield        #106 <Field TextPaint M>
	//  179  456:invokevirtual   #371 <Method float TextPaint.ascent()>
	//  180  459:fsub            
	//  181  460:fconst_2        
	//  182  461:fdiv            
	//  183  462:fstore_3        
			float f6 = M.descent();
	//  184  463:aload_0         
	//  185  464:getfield        #106 <Field TextPaint M>
	//  186  467:invokevirtual   #374 <Method float TextPaint.descent()>
	//  187  470:fstore          4
			l = (float)k.centerY() + (f4 - f6);
	//  188  472:aload_0         
	//  189  473:aload_0         
	//  190  474:getfield        #113 <Field Rect k>
	//  191  477:invokevirtual   #377 <Method int Rect.centerY()>
	//  192  480:i2f             
	//  193  481:fload_3         
	//  194  482:fload           4
	//  195  484:fsub            
	//  196  485:fadd            
	//  197  486:putfield        #142 <Field float l>
			break;
		}
		switch(0x800007 & i1)
	//* 198  489:ldc2            #378 <Int 0x800007>
	//* 199  492:iload           5
	//* 200  494:iand            
		{
	//* 201  495:tableswitch     1 5: default 528
	//	               1 531
	//	               2 567
	//	               3 567
	//	               4 567
	//	               5 550
	//* 202  528:goto            567
		case 1: // '\001'
			u = (float)k.centerX() - f1 / 2.0F;
	//  203  531:aload_0         
	//  204  532:aload_0         
	//  205  533:getfield        #113 <Field Rect k>
	//  206  536:invokevirtual   #381 <Method int Rect.centerX()>
	//  207  539:i2f             
	//  208  540:fload_1         
	//  209  541:fconst_2        
	//  210  542:fdiv            
	//  211  543:fsub            
	//  212  544:putfield        #131 <Field float u>
			break;

	//* 213  547:goto            579
		case 5: // '\005'
			u = (float)k.right - f1;
	//  214  550:aload_0         
	//  215  551:aload_0         
	//  216  552:getfield        #113 <Field Rect k>
	//  217  555:getfield        #198 <Field int Rect.right>
	//  218  558:i2f             
	//  219  559:fload_1         
	//  220  560:fsub            
	//  221  561:putfield        #131 <Field float u>
			break;

	//* 222  564:goto            579
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		default:
			u = k.left;
	//  223  567:aload_0         
	//  224  568:aload_0         
	//  225  569:getfield        #113 <Field Rect k>
	//  226  572:getfield        #192 <Field int Rect.left>
	//  227  575:i2f             
	//  228  576:putfield        #131 <Field float u>
			break;
		}
		s();
	//  229  579:aload_0         
	//  230  580:invokespecial   #383 <Method void s()>
		d(f2);
	//  231  583:aload_0         
	//  232  584:fload_2         
	//  233  585:invokespecial   #150 <Method void d(float)>
	//  234  588:return          
	}

	private int n()
	{
		if(G != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #386 <Field int[] G>
	//*   2    4:ifnull          20
			return n.getColorForState(G, 0);
	//    3    7:aload_0         
	//    4    8:getfield        #154 <Field ColorStateList n>
	//    5   11:aload_0         
	//    6   12:getfield        #386 <Field int[] G>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #392 <Method int ColorStateList.getColorForState(int[], int)>
	//    9   19:ireturn         
		else
			return n.getDefaultColor();
	//   10   20:aload_0         
	//   11   21:getfield        #154 <Field ColorStateList n>
	//   12   24:invokevirtual   #395 <Method int ColorStateList.getDefaultColor()>
	//   13   27:ireturn         
	}

	private int p()
	{
		if(G != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #386 <Field int[] G>
	//*   2    4:ifnull          20
			return m.getColorForState(G, 0);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field ColorStateList m>
	//    5   11:aload_0         
	//    6   12:getfield        #386 <Field int[] G>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #392 <Method int ColorStateList.getColorForState(int[], int)>
	//    9   19:ireturn         
		else
			return m.getDefaultColor();
	//   10   20:aload_0         
	//   11   21:getfield        #152 <Field ColorStateList m>
	//   12   24:invokevirtual   #395 <Method int ColorStateList.getDefaultColor()>
	//   13   27:ireturn         
	}

	private void s()
	{
		if(j != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #398 <Field Bitmap j>
	//*   2    4:ifnull          19
		{
			j.recycle();
	//    3    7:aload_0         
	//    4    8:getfield        #398 <Field Bitmap j>
	//    5   11:invokevirtual   #401 <Method void Bitmap.recycle()>
			j = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #398 <Field Bitmap j>
		}
	//    9   19:return          
	}

	private void t()
	{
		if(j != null || k.isEmpty() || TextUtils.isEmpty(x))
	//*   0    0:aload_0         
	//*   1    1:getfield        #398 <Field Bitmap j>
	//*   2    4:ifnonnull       27
	//*   3    7:aload_0         
	//*   4    8:getfield        #113 <Field Rect k>
	//*   5   11:invokevirtual   #405 <Method boolean Rect.isEmpty()>
	//*   6   14:ifne            27
	//*   7   17:aload_0         
	//*   8   18:getfield        #323 <Field CharSequence x>
	//*   9   21:invokestatic    #407 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   24:ifeq            28
			return;
	//   11   27:return          
		c(0.0F);
	//   12   28:aload_0         
	//   13   29:fconst_0        
	//   14   30:invokespecial   #357 <Method void c(float)>
		D = M.ascent();
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #106 <Field TextPaint M>
	//   18   38:invokevirtual   #371 <Method float TextPaint.ascent()>
	//   19   41:putfield        #409 <Field float D>
		E = M.descent();
	//   20   44:aload_0         
	//   21   45:aload_0         
	//   22   46:getfield        #106 <Field TextPaint M>
	//   23   49:invokevirtual   #374 <Method float TextPaint.descent()>
	//   24   52:putfield        #411 <Field float E>
		int i1 = Math.round(M.measureText(x, 0, x.length()));
	//   25   55:aload_0         
	//   26   56:getfield        #106 <Field TextPaint M>
	//   27   59:aload_0         
	//   28   60:getfield        #323 <Field CharSequence x>
	//   29   63:iconst_0        
	//   30   64:aload_0         
	//   31   65:getfield        #323 <Field CharSequence x>
	//   32   68:invokeinterface #257 <Method int CharSequence.length()>
	//   33   73:invokevirtual   #361 <Method float TextPaint.measureText(CharSequence, int, int)>
	//   34   76:invokestatic    #415 <Method int Math.round(float)>
	//   35   79:istore_1        
		int j1 = Math.round(E - D);
	//   36   80:aload_0         
	//   37   81:getfield        #411 <Field float E>
	//   38   84:aload_0         
	//   39   85:getfield        #409 <Field float D>
	//   40   88:fsub            
	//   41   89:invokestatic    #415 <Method int Math.round(float)>
	//   42   92:istore_2        
		if(i1 <= 0 || j1 <= 0)
	//*  43   93:iload_1         
	//*  44   94:ifle            101
	//*  45   97:iload_2         
	//*  46   98:ifgt            102
			return;
	//   47  101:return          
		j = Bitmap.createBitmap(i1, j1, android.graphics.Bitmap.Config.ARGB_8888);
	//   48  102:aload_0         
	//   49  103:iload_1         
	//   50  104:iload_2         
	//   51  105:getstatic       #421 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   52  108:invokestatic    #425 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   53  111:putfield        #398 <Field Bitmap j>
		(new Canvas(j)).drawText(x, 0, x.length(), 0.0F, (float)j1 - M.descent(), ((Paint) (M)));
	//   54  114:new             #427 <Class Canvas>
	//   55  117:dup             
	//   56  118:aload_0         
	//   57  119:getfield        #398 <Field Bitmap j>
	//   58  122:invokespecial   #430 <Method void Canvas(Bitmap)>
	//   59  125:aload_0         
	//   60  126:getfield        #323 <Field CharSequence x>
	//   61  129:iconst_0        
	//   62  130:aload_0         
	//   63  131:getfield        #323 <Field CharSequence x>
	//   64  134:invokeinterface #257 <Method int CharSequence.length()>
	//   65  139:fconst_0        
	//   66  140:iload_2         
	//   67  141:i2f             
	//   68  142:aload_0         
	//   69  143:getfield        #106 <Field TextPaint M>
	//   70  146:invokevirtual   #374 <Method float TextPaint.descent()>
	//   71  149:fsub            
	//   72  150:aload_0         
	//   73  151:getfield        #106 <Field TextPaint M>
	//   74  154:invokevirtual   #434 <Method void Canvas.drawText(CharSequence, int, int, float, float, Paint)>
		if(B == null)
	//*  75  157:aload_0         
	//*  76  158:getfield        #436 <Field Paint B>
	//*  77  161:ifnonnull       176
			B = new Paint(3);
	//   78  164:aload_0         
	//   79  165:new             #75  <Class Paint>
	//   80  168:dup             
	//   81  169:iconst_3        
	//   82  170:invokespecial   #437 <Method void Paint(int)>
	//   83  173:putfield        #436 <Field Paint B>
	//   84  176:return          
	}

	public int a()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field int f>
	//    2    4:ireturn         
	}

	public void a(float f1)
	{
		f1 = o.w.e(f1, 0.0F, 1.0F);
	//    0    0:fload_1         
	//    1    1:fconst_0        
	//    2    2:fconst_1        
	//    3    3:invokestatic    #441 <Method float w.e(float, float, float)>
	//    4    6:fstore_1        
		if(f1 != d)
	//*   5    7:fload_1         
	//*   6    8:aload_0         
	//*   7    9:getfield        #355 <Field float d>
	//*   8   12:fcmpl           
	//*   9   13:ifeq            25
		{
			d = f1;
	//   10   16:aload_0         
	//   11   17:fload_1         
	//   12   18:putfield        #355 <Field float d>
			l();
	//   13   21:aload_0         
	//   14   22:invokespecial   #443 <Method void l()>
		}
	//   15   25:return          
	}

	public void a(int i1)
	{
		TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(e.getContext(), i1, android.support.v7.appcompat.R.styleable.TextAppearance);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field View e>
	//    2    4:invokevirtual   #208 <Method Context View.getContext()>
	//    3    7:iload_1         
	//    4    8:getstatic       #448 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//    5   11:invokestatic    #453 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//    6   14:astore_2        
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//*   7   15:aload_2         
	//*   8   16:getstatic       #456 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//*   9   19:invokevirtual   #460 <Method boolean TintTypedArray.hasValue(int)>
	//*  10   22:ifeq            36
			n = tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//   11   25:aload_0         
	//   12   26:aload_2         
	//   13   27:getstatic       #456 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//   14   30:invokevirtual   #464 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   15   33:putfield        #154 <Field ColorStateList n>
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize))
	//*  16   36:aload_2         
	//*  17   37:getstatic       #467 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//*  18   40:invokevirtual   #460 <Method boolean TintTypedArray.hasValue(int)>
	//*  19   43:ifeq            63
			p = tinttypedarray.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, (int)p);
	//   20   46:aload_0         
	//   21   47:aload_2         
	//   22   48:getstatic       #467 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//   23   51:aload_0         
	//   24   52:getfield        #96  <Field float p>
	//   25   55:f2i             
	//   26   56:invokevirtual   #470 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//   27   59:i2f             
	//   28   60:putfield        #96  <Field float p>
		X = tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowColor, 0);
	//   29   63:aload_0         
	//   30   64:aload_2         
	//   31   65:getstatic       #473 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowColor>
	//   32   68:iconst_0        
	//   33   69:invokevirtual   #476 <Method int TintTypedArray.getInt(int, int)>
	//   34   72:putfield        #177 <Field int X>
		Q = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowDx, 0.0F);
	//   35   75:aload_0         
	//   36   76:aload_2         
	//   37   77:getstatic       #479 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowDx>
	//   38   80:fconst_0        
	//   39   81:invokevirtual   #483 <Method float TintTypedArray.getFloat(int, float)>
	//   40   84:putfield        #169 <Field float Q>
		O = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowDy, 0.0F);
	//   41   87:aload_0         
	//   42   88:aload_2         
	//   43   89:getstatic       #486 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowDy>
	//   44   92:fconst_0        
	//   45   93:invokevirtual   #483 <Method float TintTypedArray.getFloat(int, float)>
	//   46   96:putfield        #173 <Field float O>
		P = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowRadius, 0.0F);
	//   47   99:aload_0         
	//   48  100:aload_2         
	//   49  101:getstatic       #489 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowRadius>
	//   50  104:fconst_0        
	//   51  105:invokevirtual   #483 <Method float TintTypedArray.getFloat(int, float)>
	//   52  108:putfield        #165 <Field float P>
		tinttypedarray.recycle();
	//   53  111:aload_2         
	//   54  112:invokevirtual   #490 <Method void TintTypedArray.recycle()>
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  55  115:getstatic       #69  <Field int android.os.Build$VERSION.SDK_INT>
	//*  56  118:bipush          16
	//*  57  120:icmplt          132
			w = d(i1);
	//   58  123:aload_0         
	//   59  124:aload_0         
	//   60  125:iload_1         
	//   61  126:invokespecial   #492 <Method Typeface d(int)>
	//   62  129:putfield        #313 <Field Typeface w>
		h();
	//   63  132:aload_0         
	//   64  133:invokevirtual   #494 <Method void h()>
	//   65  136:return          
	}

	public void a(Typeface typeface)
	{
		w = typeface;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #313 <Field Typeface w>
		v = typeface;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #311 <Field Typeface v>
		h();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #494 <Method void h()>
	//    8   14:return          
	}

	public void a(CharSequence charsequence)
	{
		if(charsequence == null || !((Object) (charsequence)).equals(((Object) (y))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
	//*   2    4:aload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #302 <Field CharSequence y>
	//*   5    9:invokevirtual   #499 <Method boolean Object.equals(Object)>
	//*   6   12:ifne            33
		{
			y = charsequence;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #302 <Field CharSequence y>
			x = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #323 <Field CharSequence x>
			s();
	//   13   25:aload_0         
	//   14   26:invokespecial   #383 <Method void s()>
			h();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #494 <Method void h()>
		}
	//   17   33:return          
	}

	public final boolean a(int ai[])
	{
		G = ai;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #386 <Field int[] G>
		if(f())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #502 <Method boolean f()>
	//*   5    9:ifeq            18
		{
			h();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #494 <Method void h()>
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		} else
		{
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		}
	}

	void b()
	{
		boolean flag;
		if(g.width() > 0 && g.height() > 0 && k.width() > 0 && k.height() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field Rect g>
	//*   2    4:invokevirtual   #305 <Method int Rect.width()>
	//*   3    7:ifle            45
	//*   4   10:aload_0         
	//*   5   11:getfield        #111 <Field Rect g>
	//*   6   14:invokevirtual   #505 <Method int Rect.height()>
	//*   7   17:ifle            45
	//*   8   20:aload_0         
	//*   9   21:getfield        #113 <Field Rect k>
	//*  10   24:invokevirtual   #305 <Method int Rect.width()>
	//*  11   27:ifle            45
	//*  12   30:aload_0         
	//*  13   31:getfield        #113 <Field Rect k>
	//*  14   34:invokevirtual   #505 <Method int Rect.height()>
	//*  15   37:ifle            45
			flag = true;
	//   16   40:iconst_1        
	//   17   41:istore_1        
		else
	//*  18   42:goto            47
			flag = false;
	//   19   45:iconst_0        
	//   20   46:istore_1        
		b = flag;
	//   21   47:aload_0         
	//   22   48:iload_1         
	//   23   49:putfield        #507 <Field boolean b>
	//   24   52:return          
	}

	public void b(float f1)
	{
		if(p != f1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field float p>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			p = f1;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #96  <Field float p>
			h();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #494 <Method void h()>
		}
	//   10   18:return          
	}

	public void b(int i1)
	{
		if(f != i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field int f>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			f = i1;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #93  <Field int f>
			h();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #494 <Method void h()>
		}
	//    9   17:return          
	}

	public void b(int i1, int j1, int k1, int l1)
	{
		if(!c(g, i1, j1, k1, l1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field Rect g>
	//*   2    4:iload_1         
	//*   3    5:iload_2         
	//*   4    6:iload_3         
	//*   5    7:iload           4
	//*   6    9:invokestatic    #510 <Method boolean c(Rect, int, int, int, int)>
	//*   7   12:ifne            36
		{
			g.set(i1, j1, k1, l1);
	//    8   15:aload_0         
	//    9   16:getfield        #111 <Field Rect g>
	//   10   19:iload_1         
	//   11   20:iload_2         
	//   12   21:iload_3         
	//   13   22:iload           4
	//   14   24:invokevirtual   #513 <Method void Rect.set(int, int, int, int)>
			I = true;
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:putfield        #321 <Field boolean I>
			b();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #515 <Method void b()>
		}
	//   20   36:return          
	}

	public void b(ColorStateList colorstatelist)
	{
		if(n != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #154 <Field ColorStateList n>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			n = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #154 <Field ColorStateList n>
			h();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #494 <Method void h()>
		}
	//    9   17:return          
	}

	public void b(Interpolator interpolator)
	{
		N = interpolator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #148 <Field Interpolator N>
		h();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #494 <Method void h()>
	//    5    9:return          
	}

	public Typeface c()
	{
		if(v != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #311 <Field Typeface v>
	//*   2    4:ifnull          12
			return v;
	//    3    7:aload_0         
	//    4    8:getfield        #311 <Field Typeface v>
	//    5   11:areturn         
		else
			return Typeface.DEFAULT;
	//    6   12:getstatic       #521 <Field Typeface Typeface.DEFAULT>
	//    7   15:areturn         
	}

	public void c(int i1)
	{
		TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(e.getContext(), i1, android.support.v7.appcompat.R.styleable.TextAppearance);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field View e>
	//    2    4:invokevirtual   #208 <Method Context View.getContext()>
	//    3    7:iload_1         
	//    4    8:getstatic       #448 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//    5   11:invokestatic    #453 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//    6   14:astore_2        
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//*   7   15:aload_2         
	//*   8   16:getstatic       #456 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//*   9   19:invokevirtual   #460 <Method boolean TintTypedArray.hasValue(int)>
	//*  10   22:ifeq            36
			m = tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//   11   25:aload_0         
	//   12   26:aload_2         
	//   13   27:getstatic       #456 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//   14   30:invokevirtual   #464 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   15   33:putfield        #152 <Field ColorStateList m>
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize))
	//*  16   36:aload_2         
	//*  17   37:getstatic       #467 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//*  18   40:invokevirtual   #460 <Method boolean TintTypedArray.hasValue(int)>
	//*  19   43:ifeq            63
			o = tinttypedarray.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, (int)o);
	//   20   46:aload_0         
	//   21   47:aload_2         
	//   22   48:getstatic       #467 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//   23   51:aload_0         
	//   24   52:getfield        #98  <Field float o>
	//   25   55:f2i             
	//   26   56:invokevirtual   #470 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//   27   59:i2f             
	//   28   60:putfield        #98  <Field float o>
		S = tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowColor, 0);
	//   29   63:aload_0         
	//   30   64:aload_2         
	//   31   65:getstatic       #473 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowColor>
	//   32   68:iconst_0        
	//   33   69:invokevirtual   #476 <Method int TintTypedArray.getInt(int, int)>
	//   34   72:putfield        #179 <Field int S>
		J = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowDx, 0.0F);
	//   35   75:aload_0         
	//   36   76:aload_2         
	//   37   77:getstatic       #479 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowDx>
	//   38   80:fconst_0        
	//   39   81:invokevirtual   #483 <Method float TintTypedArray.getFloat(int, float)>
	//   40   84:putfield        #171 <Field float J>
		R = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowDy, 0.0F);
	//   41   87:aload_0         
	//   42   88:aload_2         
	//   43   89:getstatic       #486 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowDy>
	//   44   92:fconst_0        
	//   45   93:invokevirtual   #483 <Method float TintTypedArray.getFloat(int, float)>
	//   46   96:putfield        #175 <Field float R>
		L = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowRadius, 0.0F);
	//   47   99:aload_0         
	//   48  100:aload_2         
	//   49  101:getstatic       #489 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowRadius>
	//   50  104:fconst_0        
	//   51  105:invokevirtual   #483 <Method float TintTypedArray.getFloat(int, float)>
	//   52  108:putfield        #167 <Field float L>
		tinttypedarray.recycle();
	//   53  111:aload_2         
	//   54  112:invokevirtual   #490 <Method void TintTypedArray.recycle()>
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  55  115:getstatic       #69  <Field int android.os.Build$VERSION.SDK_INT>
	//*  56  118:bipush          16
	//*  57  120:icmplt          132
			v = d(i1);
	//   58  123:aload_0         
	//   59  124:aload_0         
	//   60  125:iload_1         
	//   61  126:invokespecial   #492 <Method Typeface d(int)>
	//   62  129:putfield        #311 <Field Typeface v>
		h();
	//   63  132:aload_0         
	//   64  133:invokevirtual   #494 <Method void h()>
	//   65  136:return          
	}

	public void c(ColorStateList colorstatelist)
	{
		if(m != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field ColorStateList m>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			m = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #152 <Field ColorStateList m>
			h();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #494 <Method void h()>
		}
	//    9   17:return          
	}

	public int d()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field int i>
	//    2    4:ireturn         
	}

	public void d(int i1, int j1, int k1, int l1)
	{
		if(!c(k, i1, j1, k1, l1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field Rect k>
	//*   2    4:iload_1         
	//*   3    5:iload_2         
	//*   4    6:iload_3         
	//*   5    7:iload           4
	//*   6    9:invokestatic    #510 <Method boolean c(Rect, int, int, int, int)>
	//*   7   12:ifne            36
		{
			k.set(i1, j1, k1, l1);
	//    8   15:aload_0         
	//    9   16:getfield        #113 <Field Rect k>
	//   10   19:iload_1         
	//   11   20:iload_2         
	//   12   21:iload_3         
	//   13   22:iload           4
	//   14   24:invokevirtual   #513 <Method void Rect.set(int, int, int, int)>
			I = true;
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:putfield        #321 <Field boolean I>
			b();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #515 <Method void b()>
		}
	//   20   36:return          
	}

	public void d(Canvas canvas)
	{
		int i1 = canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #525 <Method int Canvas.save()>
	//    2    4:istore          7
		if(x != null && b)
	//*   3    6:aload_0         
	//*   4    7:getfield        #323 <Field CharSequence x>
	//*   5   10:ifnull          194
	//*   6   13:aload_0         
	//*   7   14:getfield        #507 <Field boolean b>
	//*   8   17:ifeq            194
		{
			float f6 = s;
	//    9   20:aload_0         
	//   10   21:getfield        #140 <Field float s>
	//   11   24:fstore          5
			float f5 = q;
	//   12   26:aload_0         
	//   13   27:getfield        #146 <Field float q>
	//   14   30:fstore          4
			boolean flag;
			if(C && j != null)
	//*  15   32:aload_0         
	//*  16   33:getfield        #236 <Field boolean C>
	//*  17   36:ifeq            52
	//*  18   39:aload_0         
	//*  19   40:getfield        #398 <Field Bitmap j>
	//*  20   43:ifnull          52
				flag = true;
	//   21   46:iconst_1        
	//   22   47:istore          6
			else
	//*  23   49:goto            55
				flag = false;
	//   24   52:iconst_0        
	//   25   53:istore          6
			float f1;
			if(flag)
	//*  26   55:iload           6
	//*  27   57:ifeq            83
			{
				f1 = D * H;
	//   28   60:aload_0         
	//   29   61:getfield        #409 <Field float D>
	//   30   64:aload_0         
	//   31   65:getfield        #234 <Field float H>
	//   32   68:fmul            
	//   33   69:fstore_2        
				float f2 = E;
	//   34   70:aload_0         
	//   35   71:getfield        #411 <Field float E>
	//   36   74:fstore_3        
				f2 = H;
	//   37   75:aload_0         
	//   38   76:getfield        #234 <Field float H>
	//   39   79:fstore_3        
			} else
	//*  40   80:goto            109
			{
				f1 = M.ascent() * H;
	//   41   83:aload_0         
	//   42   84:getfield        #106 <Field TextPaint M>
	//   43   87:invokevirtual   #371 <Method float TextPaint.ascent()>
	//   44   90:aload_0         
	//   45   91:getfield        #234 <Field float H>
	//   46   94:fmul            
	//   47   95:fstore_2        
				M.descent();
	//   48   96:aload_0         
	//   49   97:getfield        #106 <Field TextPaint M>
	//   50  100:invokevirtual   #374 <Method float TextPaint.descent()>
	//   51  103:pop             
				float f3 = H;
	//   52  104:aload_0         
	//   53  105:getfield        #234 <Field float H>
	//   54  108:fstore_3        
			}
			float f4 = f5;
	//   55  109:fload           4
	//   56  111:fstore_3        
			if(flag)
	//*  57  112:iload           6
	//*  58  114:ifeq            122
				f4 = f5 + f1;
	//   59  117:fload           4
	//   60  119:fload_2         
	//   61  120:fadd            
	//   62  121:fstore_3        
			if(H != 1.0F)
	//*  63  122:aload_0         
	//*  64  123:getfield        #234 <Field float H>
	//*  65  126:fconst_1        
	//*  66  127:fcmpl           
	//*  67  128:ifeq            146
				canvas.scale(H, H, f6, f4);
	//   68  131:aload_1         
	//   69  132:aload_0         
	//   70  133:getfield        #234 <Field float H>
	//   71  136:aload_0         
	//   72  137:getfield        #234 <Field float H>
	//   73  140:fload           5
	//   74  142:fload_3         
	//   75  143:invokevirtual   #529 <Method void Canvas.scale(float, float, float, float)>
			if(flag)
	//*  76  146:iload           6
	//*  77  148:ifeq            169
				canvas.drawBitmap(j, f6, f4, B);
	//   78  151:aload_1         
	//   79  152:aload_0         
	//   80  153:getfield        #398 <Field Bitmap j>
	//   81  156:fload           5
	//   82  158:fload_3         
	//   83  159:aload_0         
	//   84  160:getfield        #436 <Field Paint B>
	//   85  163:invokevirtual   #533 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
			else
	//*  86  166:goto            194
				canvas.drawText(x, 0, x.length(), f6, f4, ((Paint) (M)));
	//   87  169:aload_1         
	//   88  170:aload_0         
	//   89  171:getfield        #323 <Field CharSequence x>
	//   90  174:iconst_0        
	//   91  175:aload_0         
	//   92  176:getfield        #323 <Field CharSequence x>
	//   93  179:invokeinterface #257 <Method int CharSequence.length()>
	//   94  184:fload           5
	//   95  186:fload_3         
	//   96  187:aload_0         
	//   97  188:getfield        #106 <Field TextPaint M>
	//   98  191:invokevirtual   #434 <Method void Canvas.drawText(CharSequence, int, int, float, float, Paint)>
		}
		canvas.restoreToCount(i1);
	//   99  194:aload_1         
	//  100  195:iload           7
	//  101  197:invokevirtual   #536 <Method void Canvas.restoreToCount(int)>
	//  102  200:return          
	}

	public void d(Typeface typeface)
	{
		if(v != typeface)
	//*   0    0:aload_0         
	//*   1    1:getfield        #311 <Field Typeface v>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			v = typeface;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #311 <Field Typeface v>
			h();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #494 <Method void h()>
		}
	//    9   17:return          
	}

	public void d(Interpolator interpolator)
	{
		K = interpolator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #135 <Field Interpolator K>
		h();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #494 <Method void h()>
	//    5    9:return          
	}

	public Typeface e()
	{
		if(w != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field Typeface w>
	//*   2    4:ifnull          12
			return w;
	//    3    7:aload_0         
	//    4    8:getfield        #313 <Field Typeface w>
	//    5   11:areturn         
		else
			return Typeface.DEFAULT;
	//    6   12:getstatic       #521 <Field Typeface Typeface.DEFAULT>
	//    7   15:areturn         
	}

	public void e(int i1)
	{
		if(i != i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field int i>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			i = i1;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #91  <Field int i>
			h();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #494 <Method void h()>
		}
	//    9   17:return          
	}

	public void e(Typeface typeface)
	{
		if(w != typeface)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field Typeface w>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			w = typeface;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #313 <Field Typeface w>
			h();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #494 <Method void h()>
		}
	//    9   17:return          
	}

	final boolean f()
	{
		return m != null && m.isStateful() || n != null && n.isStateful();
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field ColorStateList m>
	//    2    4:ifnull          17
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field ColorStateList m>
	//    5   11:invokevirtual   #539 <Method boolean ColorStateList.isStateful()>
	//    6   14:ifne            34
	//    7   17:aload_0         
	//    8   18:getfield        #154 <Field ColorStateList n>
	//    9   21:ifnull          36
	//   10   24:aload_0         
	//   11   25:getfield        #154 <Field ColorStateList n>
	//   12   28:invokevirtual   #539 <Method boolean ColorStateList.isStateful()>
	//   13   31:ifeq            36
	//   14   34:iconst_1        
	//   15   35:ireturn         
	//   16   36:iconst_0        
	//   17   37:ireturn         
	}

	public float g()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #355 <Field float d>
	//    2    4:freturn         
	}

	public void h()
	{
		if(e.getHeight() > 0 && e.getWidth() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field View e>
	//*   2    4:invokevirtual   #542 <Method int View.getHeight()>
	//*   3    7:ifle            28
	//*   4   10:aload_0         
	//*   5   11:getfield        #100 <Field View e>
	//*   6   14:invokevirtual   #545 <Method int View.getWidth()>
	//*   7   17:ifle            28
		{
			m();
	//    8   20:aload_0         
	//    9   21:invokespecial   #547 <Method void m()>
			l();
	//   10   24:aload_0         
	//   11   25:invokespecial   #443 <Method void l()>
		}
	//   12   28:return          
	}

	public float i()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field float o>
	//    2    4:freturn         
	}

	public CharSequence k()
	{
		return y;
	//    0    0:aload_0         
	//    1    1:getfield        #302 <Field CharSequence y>
	//    2    4:areturn         
	}

	public ColorStateList o()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field ColorStateList m>
	//    2    4:areturn         
	}

	private static final Paint a;
	private static final boolean c;
	private boolean A;
	private Paint B;
	private boolean C;
	private float D;
	private float E;
	private float F;
	private int G[];
	private float H;
	private boolean I;
	private float J;
	private Interpolator K;
	private float L;
	private final TextPaint M = new TextPaint(129);
	private Interpolator N;
	private float O;
	private float P;
	private float Q;
	private float R;
	private int S;
	private int X;
	private boolean b;
	private float d;
	private final View e;
	private int f;
	private final Rect g = new Rect();
	private final RectF h = new RectF();
	private int i;
	private Bitmap j;
	private final Rect k = new Rect();
	private float l;
	private ColorStateList m;
	private ColorStateList n;
	private float o;
	private float p;
	private float q;
	private float r;
	private float s;
	private float t;
	private float u;
	private Typeface v;
	private Typeface w;
	private CharSequence x;
	private CharSequence y;
	private Typeface z;

	static 
	{
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT < 18)
	//*   0    0:getstatic       #69  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmpge          13
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:goto            15
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore_0        
		c = flag;
	//    8   15:iload_0         
	//    9   16:putstatic       #71  <Field boolean c>
		a = null;
	//   10   19:aconst_null     
	//   11   20:putstatic       #73  <Field Paint a>
		if(a != null)
	//*  12   23:getstatic       #73  <Field Paint a>
	//*  13   26:ifnull          44
		{
			a.setAntiAlias(true);
	//   14   29:getstatic       #73  <Field Paint a>
	//   15   32:iconst_1        
	//   16   33:invokevirtual   #79  <Method void Paint.setAntiAlias(boolean)>
			a.setColor(-65281);
	//   17   36:getstatic       #73  <Field Paint a>
	//   18   39:ldc1            #80  <Int -65281>
	//   19   41:invokevirtual   #84  <Method void Paint.setColor(int)>
		}
	//*  20   44:return          
	}
}
