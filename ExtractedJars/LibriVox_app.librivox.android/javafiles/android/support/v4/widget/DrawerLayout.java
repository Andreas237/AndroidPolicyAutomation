// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.*;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.a.c;
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.ac;
import android.support.v4.view.l;
import android.util.AttributeSet;
import android.view.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//			n, al, m, p, 
//			l

public class DrawerLayout extends ViewGroup
{

	private boolean a(float f1, float f2, View view)
	{
		if(L == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field Rect L>
	//*   2    4:ifnonnull       18
			L = new Rect();
	//    3    7:aload_0         
	//    4    8:new             #79  <Class Rect>
	//    5   11:dup             
	//    6   12:invokespecial   #82  <Method void Rect()>
	//    7   15:putfield        #77  <Field Rect L>
		view.getHitRect(L);
	//    8   18:aload_3         
	//    9   19:aload_0         
	//   10   20:getfield        #77  <Field Rect L>
	//   11   23:invokevirtual   #88  <Method void View.getHitRect(Rect)>
		return L.contains((int)f1, (int)f2);
	//   12   26:aload_0         
	//   13   27:getfield        #77  <Field Rect L>
	//   14   30:fload_1         
	//   15   31:f2i             
	//   16   32:fload_2         
	//   17   33:f2i             
	//   18   34:invokevirtual   #92  <Method boolean Rect.contains(int, int)>
	//   19   37:ireturn         
	}

	private boolean a(Drawable drawable, int i1)
	{
		if(drawable != null && android.support.v4.graphics.drawable.a.b(drawable))
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #98  <Method boolean a.b(Drawable)>
	//*   4    8:ifne            14
	//*   5   11:goto            22
		{
			android.support.v4.graphics.drawable.a.b(drawable, i1);
	//    6   14:aload_1         
	//    7   15:iload_2         
	//    8   16:invokestatic    #100 <Method boolean a.b(Drawable, int)>
	//    9   19:pop             
			return true;
	//   10   20:iconst_1        
	//   11   21:ireturn         
		} else
		{
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		}
	}

	private boolean a(MotionEvent motionevent, View view)
	{
		if(!view.getMatrix().isIdentity())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #105 <Method Matrix View.getMatrix()>
	//*   2    4:invokevirtual   #111 <Method boolean Matrix.isIdentity()>
	//*   3    7:ifne            31
		{
			motionevent = b(motionevent, view);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokespecial   #114 <Method MotionEvent b(MotionEvent, View)>
	//    8   16:astore_1        
			boolean flag = view.dispatchGenericMotionEvent(motionevent);
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #118 <Method boolean View.dispatchGenericMotionEvent(MotionEvent)>
	//   12   22:istore          5
			motionevent.recycle();
	//   13   24:aload_1         
	//   14   25:invokevirtual   #123 <Method void MotionEvent.recycle()>
			return flag;
	//   15   28:iload           5
	//   16   30:ireturn         
		} else
		{
			float f1 = getScrollX() - view.getLeft();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #127 <Method int getScrollX()>
	//   19   35:aload_2         
	//   20   36:invokevirtual   #130 <Method int View.getLeft()>
	//   21   39:isub            
	//   22   40:i2f             
	//   23   41:fstore_3        
			float f2 = getScrollY() - view.getTop();
	//   24   42:aload_0         
	//   25   43:invokevirtual   #133 <Method int getScrollY()>
	//   26   46:aload_2         
	//   27   47:invokevirtual   #136 <Method int View.getTop()>
	//   28   50:isub            
	//   29   51:i2f             
	//   30   52:fstore          4
			motionevent.offsetLocation(f1, f2);
	//   31   54:aload_1         
	//   32   55:fload_3         
	//   33   56:fload           4
	//   34   58:invokevirtual   #140 <Method void MotionEvent.offsetLocation(float, float)>
			boolean flag1 = view.dispatchGenericMotionEvent(motionevent);
	//   35   61:aload_2         
	//   36   62:aload_1         
	//   37   63:invokevirtual   #118 <Method boolean View.dispatchGenericMotionEvent(MotionEvent)>
	//   38   66:istore          5
			motionevent.offsetLocation(-f1, -f2);
	//   39   68:aload_1         
	//   40   69:fload_3         
	//   41   70:fneg            
	//   42   71:fload           4
	//   43   73:fneg            
	//   44   74:invokevirtual   #140 <Method void MotionEvent.offsetLocation(float, float)>
			return flag1;
	//   45   77:iload           5
	//   46   79:ireturn         
		}
	}

	private MotionEvent b(MotionEvent motionevent, View view)
	{
		float f1 = getScrollX() - view.getLeft();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #127 <Method int getScrollX()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #130 <Method int View.getLeft()>
	//    4    8:isub            
	//    5    9:i2f             
	//    6   10:fstore_3        
		float f2 = getScrollY() - view.getTop();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #133 <Method int getScrollY()>
	//    9   15:aload_2         
	//   10   16:invokevirtual   #136 <Method int View.getTop()>
	//   11   19:isub            
	//   12   20:i2f             
	//   13   21:fstore          4
		motionevent = MotionEvent.obtain(motionevent);
	//   14   23:aload_1         
	//   15   24:invokestatic    #144 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//   16   27:astore_1        
		motionevent.offsetLocation(f1, f2);
	//   17   28:aload_1         
	//   18   29:fload_3         
	//   19   30:fload           4
	//   20   32:invokevirtual   #140 <Method void MotionEvent.offsetLocation(float, float)>
		view = ((View) (view.getMatrix()));
	//   21   35:aload_2         
	//   22   36:invokevirtual   #105 <Method Matrix View.getMatrix()>
	//   23   39:astore_2        
		if(!((Matrix) (view)).isIdentity())
	//*  24   40:aload_2         
	//*  25   41:invokevirtual   #111 <Method boolean Matrix.isIdentity()>
	//*  26   44:ifne            82
		{
			if(M == null)
	//*  27   47:aload_0         
	//*  28   48:getfield        #146 <Field Matrix M>
	//*  29   51:ifnonnull       65
				M = new Matrix();
	//   30   54:aload_0         
	//   31   55:new             #107 <Class Matrix>
	//   32   58:dup             
	//   33   59:invokespecial   #147 <Method void Matrix()>
	//   34   62:putfield        #146 <Field Matrix M>
			((Matrix) (view)).invert(M);
	//   35   65:aload_2         
	//   36   66:aload_0         
	//   37   67:getfield        #146 <Field Matrix M>
	//   38   70:invokevirtual   #151 <Method boolean Matrix.invert(Matrix)>
	//   39   73:pop             
			motionevent.transform(M);
	//   40   74:aload_1         
	//   41   75:aload_0         
	//   42   76:getfield        #146 <Field Matrix M>
	//   43   79:invokevirtual   #155 <Method void MotionEvent.transform(Matrix)>
		}
		return motionevent;
	//   44   82:aload_1         
	//   45   83:areturn         
	}

	static String c(int i1)
	{
		if((i1 & 3) == 3)
	//*   0    0:iload_0         
	//*   1    1:iconst_3        
	//*   2    2:iand            
	//*   3    3:iconst_3        
	//*   4    4:icmpne          10
			return "LEFT";
	//    5    7:ldc1            #158 <String "LEFT">
	//    6    9:areturn         
		if((i1 & 5) == 5)
	//*   7   10:iload_0         
	//*   8   11:iconst_5        
	//*   9   12:iand            
	//*  10   13:iconst_5        
	//*  11   14:icmpne          20
			return "RIGHT";
	//   12   17:ldc1            #160 <String "RIGHT">
	//   13   19:areturn         
		else
			return Integer.toHexString(i1);
	//   14   20:iload_0         
	//   15   21:invokestatic    #165 <Method String Integer.toHexString(int)>
	//   16   24:areturn         
	}

	private void c(View view, boolean flag)
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method int getChildCount()>
	//    2    4:istore          4
		for(int i1 = 0; i1 < j1; i1++)
	//*   3    6:iconst_0        
	//*   4    7:istore_3        
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          66
		{
			View view1 = getChildAt(i1);
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #173 <Method View getChildAt(int)>
	//   11   19:astore          5
			if(!flag && !g(view1) || flag && view1 == view)
	//*  12   21:iload_2         
	//*  13   22:ifne            34
	//*  14   25:aload_0         
	//*  15   26:aload           5
	//*  16   28:invokevirtual   #176 <Method boolean g(View)>
	//*  17   31:ifeq            44
	//*  18   34:iload_2         
	//*  19   35:ifeq            53
	//*  20   38:aload           5
	//*  21   40:aload_1         
	//*  22   41:if_acmpne       53
				ac.b(view1, 1);
	//   23   44:aload           5
	//   24   46:iconst_1        
	//   25   47:invokestatic    #181 <Method void ac.b(View, int)>
			else
	//*  26   50:goto            59
				ac.b(view1, 4);
	//   27   53:aload           5
	//   28   55:iconst_4        
	//   29   56:invokestatic    #181 <Method void ac.b(View, int)>
		}

	//   30   59:iload_3         
	//   31   60:iconst_1        
	//   32   61:iadd            
	//   33   62:istore_3        
	//*  34   63:goto            8
	//   35   66:return          
	}

	private void d()
	{
		if(d)
	//*   0    0:getstatic       #73  <Field boolean d>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			C = e();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #184 <Method Drawable e()>
	//    6   12:putfield        #186 <Field Drawable C>
			D = f();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokespecial   #188 <Method Drawable f()>
	//   10   20:putfield        #190 <Field Drawable D>
			return;
	//   11   23:return          
		}
	}

	private Drawable e()
	{
		int i1 = ac.f(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #193 <Method int ac.f(View)>
	//    2    4:istore_1        
		if(i1 == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            30
		{
			Drawable drawable = G;
	//    5    9:aload_0         
	//    6   10:getfield        #195 <Field Drawable G>
	//    7   13:astore_2        
			if(drawable != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          51
			{
				a(drawable, i1);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:iload_1         
	//   13   21:invokespecial   #197 <Method boolean a(Drawable, int)>
	//   14   24:pop             
				return G;
	//   15   25:aload_0         
	//   16   26:getfield        #195 <Field Drawable G>
	//   17   29:areturn         
			}
		} else
		{
			Drawable drawable1 = H;
	//   18   30:aload_0         
	//   19   31:getfield        #199 <Field Drawable H>
	//   20   34:astore_2        
			if(drawable1 != null)
	//*  21   35:aload_2         
	//*  22   36:ifnull          51
			{
				a(drawable1, i1);
	//   23   39:aload_0         
	//   24   40:aload_2         
	//   25   41:iload_1         
	//   26   42:invokespecial   #197 <Method boolean a(Drawable, int)>
	//   27   45:pop             
				return H;
	//   28   46:aload_0         
	//   29   47:getfield        #199 <Field Drawable H>
	//   30   50:areturn         
			}
		}
		return I;
	//   31   51:aload_0         
	//   32   52:getfield        #201 <Field Drawable I>
	//   33   55:areturn         
	}

	private Drawable f()
	{
		int i1 = ac.f(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #193 <Method int ac.f(View)>
	//    2    4:istore_1        
		if(i1 == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            30
		{
			Drawable drawable = H;
	//    5    9:aload_0         
	//    6   10:getfield        #199 <Field Drawable H>
	//    7   13:astore_2        
			if(drawable != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          51
			{
				a(drawable, i1);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:iload_1         
	//   13   21:invokespecial   #197 <Method boolean a(Drawable, int)>
	//   14   24:pop             
				return H;
	//   15   25:aload_0         
	//   16   26:getfield        #199 <Field Drawable H>
	//   17   29:areturn         
			}
		} else
		{
			Drawable drawable1 = G;
	//   18   30:aload_0         
	//   19   31:getfield        #195 <Field Drawable G>
	//   20   34:astore_2        
			if(drawable1 != null)
	//*  21   35:aload_2         
	//*  22   36:ifnull          51
			{
				a(drawable1, i1);
	//   23   39:aload_0         
	//   24   40:aload_2         
	//   25   41:iload_1         
	//   26   42:invokespecial   #197 <Method boolean a(Drawable, int)>
	//   27   45:pop             
				return G;
	//   28   46:aload_0         
	//   29   47:getfield        #195 <Field Drawable G>
	//   30   50:areturn         
			}
		}
		return J;
	//   31   51:aload_0         
	//   32   52:getfield        #203 <Field Drawable J>
	//   33   55:areturn         
	}

	private boolean g()
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          38
			if(((n)getChildAt(i1).getLayoutParams()).c)
	//*   8   12:aload_0         
	//*   9   13:iload_1         
	//*  10   14:invokevirtual   #173 <Method View getChildAt(int)>
	//*  11   17:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  12   20:checkcast       #209 <Class n>
	//*  13   23:getfield        #211 <Field boolean android.support.v4.widget.n.c>
	//*  14   26:ifeq            31
				return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         

	//   17   31:iload_1         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_1        
	//*  21   35:goto            7
		return false;
	//   22   38:iconst_0        
	//   23   39:ireturn         
	}

	private boolean h()
	{
		return c() != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #214 <Method View c()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	static boolean l(View view)
	{
		return ac.e(view) != 4 && ac.e(view) != 2;
	//    0    0:aload_0         
	//    1    1:invokestatic    #216 <Method int ac.e(View)>
	//    2    4:iconst_4        
	//    3    5:icmpeq          18
	//    4    8:aload_0         
	//    5    9:invokestatic    #216 <Method int ac.e(View)>
	//    6   12:iconst_2        
	//    7   13:icmpeq          18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private static boolean m(View view)
	{
		view = ((View) (view.getBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #219 <Method Drawable View.getBackground()>
	//    2    4:astore_0        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(view != null)
	//*   5    7:aload_0         
	//*   6    8:ifnull          23
		{
			if(((Drawable) (view)).getOpacity() == -1)
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #224 <Method int Drawable.getOpacity()>
	//*   9   15:iconst_m1       
	//*  10   16:icmpne          21
				flag = true;
	//   11   19:iconst_1        
	//   12   20:istore_1        
			return flag;
	//   13   21:iload_1         
	//   14   22:ireturn         
		} else
		{
			return false;
	//   15   23:iconst_0        
	//   16   24:ireturn         
		}
	}

	public int a(int i1)
	{
		int j1 = ac.f(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #193 <Method int ac.f(View)>
	//    2    4:istore_2        
		if(i1 != 3)
	//*   3    5:iload_1         
	//*   4    6:iconst_3        
	//*   5    7:icmpeq          138
		{
			if(i1 != 5)
	//*   6   10:iload_1         
	//*   7   11:iconst_5        
	//*   8   12:icmpeq          102
			{
				if(i1 != 0x800003)
	//*   9   15:iload_1         
	//*  10   16:ldc1            #226 <Int 0x800003>
	//*  11   18:icmpeq          66
				{
					if(i1 == 0x800005)
	//*  12   21:iload_1         
	//*  13   22:ldc1            #227 <Int 0x800005>
	//*  14   24:icmpeq          30
	//*  15   27:goto            174
					{
						i1 = u;
	//   16   30:aload_0         
	//   17   31:getfield        #229 <Field int u>
	//   18   34:istore_1        
						if(i1 != 3)
	//*  19   35:iload_1         
	//*  20   36:iconst_3        
	//*  21   37:icmpeq          42
							return i1;
	//   22   40:iload_1         
	//   23   41:ireturn         
						if(j1 == 0)
	//*  24   42:iload_2         
	//*  25   43:ifne            54
							i1 = s;
	//   26   46:aload_0         
	//   27   47:getfield        #231 <Field int s>
	//   28   50:istore_1        
						else
	//*  29   51:goto            59
							i1 = r;
	//   30   54:aload_0         
	//   31   55:getfield        #233 <Field int r>
	//   32   58:istore_1        
						if(i1 != 3)
	//*  33   59:iload_1         
	//*  34   60:iconst_3        
	//*  35   61:icmpeq          174
							return i1;
	//   36   64:iload_1         
	//   37   65:ireturn         
					}
				} else
				{
					i1 = t;
	//   38   66:aload_0         
	//   39   67:getfield        #235 <Field int t>
	//   40   70:istore_1        
					if(i1 != 3)
	//*  41   71:iload_1         
	//*  42   72:iconst_3        
	//*  43   73:icmpeq          78
						return i1;
	//   44   76:iload_1         
	//   45   77:ireturn         
					if(j1 == 0)
	//*  46   78:iload_2         
	//*  47   79:ifne            90
						i1 = r;
	//   48   82:aload_0         
	//   49   83:getfield        #233 <Field int r>
	//   50   86:istore_1        
					else
	//*  51   87:goto            95
						i1 = s;
	//   52   90:aload_0         
	//   53   91:getfield        #231 <Field int s>
	//   54   94:istore_1        
					if(i1 != 3)
	//*  55   95:iload_1         
	//*  56   96:iconst_3        
	//*  57   97:icmpeq          174
						return i1;
	//   58  100:iload_1         
	//   59  101:ireturn         
				}
			} else
			{
				i1 = s;
	//   60  102:aload_0         
	//   61  103:getfield        #231 <Field int s>
	//   62  106:istore_1        
				if(i1 != 3)
	//*  63  107:iload_1         
	//*  64  108:iconst_3        
	//*  65  109:icmpeq          114
					return i1;
	//   66  112:iload_1         
	//   67  113:ireturn         
				if(j1 == 0)
	//*  68  114:iload_2         
	//*  69  115:ifne            126
					i1 = u;
	//   70  118:aload_0         
	//   71  119:getfield        #229 <Field int u>
	//   72  122:istore_1        
				else
	//*  73  123:goto            131
					i1 = t;
	//   74  126:aload_0         
	//   75  127:getfield        #235 <Field int t>
	//   76  130:istore_1        
				if(i1 != 3)
	//*  77  131:iload_1         
	//*  78  132:iconst_3        
	//*  79  133:icmpeq          174
					return i1;
	//   80  136:iload_1         
	//   81  137:ireturn         
			}
		} else
		{
			i1 = r;
	//   82  138:aload_0         
	//   83  139:getfield        #233 <Field int r>
	//   84  142:istore_1        
			if(i1 != 3)
	//*  85  143:iload_1         
	//*  86  144:iconst_3        
	//*  87  145:icmpeq          150
				return i1;
	//   88  148:iload_1         
	//   89  149:ireturn         
			if(j1 == 0)
	//*  90  150:iload_2         
	//*  91  151:ifne            162
				i1 = t;
	//   92  154:aload_0         
	//   93  155:getfield        #235 <Field int t>
	//   94  158:istore_1        
			else
	//*  95  159:goto            167
				i1 = u;
	//   96  162:aload_0         
	//   97  163:getfield        #229 <Field int u>
	//   98  166:istore_1        
			if(i1 != 3)
	//*  99  167:iload_1         
	//* 100  168:iconst_3        
	//* 101  169:icmpeq          174
				return i1;
	//  102  172:iload_1         
	//  103  173:ireturn         
		}
		return 0;
	//  104  174:iconst_0        
	//  105  175:ireturn         
	}

	public int a(View view)
	{
		if(g(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #176 <Method boolean g(View)>
	//*   3    5:ifeq            23
		{
			return a(((n)view.getLayoutParams()).a);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    7   13:checkcast       #209 <Class n>
	//    8   16:getfield        #237 <Field int android.support.v4.widget.n.a>
	//    9   19:invokevirtual   #239 <Method int a(int)>
	//   10   22:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   23:new             #241 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #242 <Method void StringBuilder()>
	//   14   30:astore_2        
			stringbuilder.append("View ");
	//   15   31:aload_2         
	//   16   32:ldc1            #244 <String "View ">
	//   17   34:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
			stringbuilder.append(((Object) (view)));
	//   19   38:aload_2         
	//   20   39:aload_1         
	//   21   40:invokevirtual   #251 <Method StringBuilder StringBuilder.append(Object)>
	//   22   43:pop             
			stringbuilder.append(" is not a drawer");
	//   23   44:aload_2         
	//   24   45:ldc1            #253 <String " is not a drawer">
	//   25   47:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   26   50:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   27   51:new             #255 <Class IllegalArgumentException>
	//   28   54:dup             
	//   29   55:aload_2         
	//   30   56:invokevirtual   #259 <Method String StringBuilder.toString()>
	//   31   59:invokespecial   #262 <Method void IllegalArgumentException(String)>
	//   32   62:athrow          
		}
	}

	View a()
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          43
		{
			View view = getChildAt(i1);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #173 <Method View getChildAt(int)>
	//   11   17:astore_3        
			if((((n)view.getLayoutParams()).d & 1) == 1)
	//*  12   18:aload_3         
	//*  13   19:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  14   22:checkcast       #209 <Class n>
	//*  15   25:getfield        #264 <Field int n.d>
	//*  16   28:iconst_1        
	//*  17   29:iand            
	//*  18   30:iconst_1        
	//*  19   31:icmpne          36
				return view;
	//   20   34:aload_3         
	//   21   35:areturn         
		}

	//   22   36:iload_1         
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:istore_1        
	//*  26   40:goto            7
		return null;
	//   27   43:aconst_null     
	//   28   44:areturn         
	}

	public void a(int i1, int j1)
	{
		int k1 = android.support.v4.view.l.a(j1, ac.f(((View) (this))));
	//    0    0:iload_2         
	//    1    1:aload_0         
	//    2    2:invokestatic    #193 <Method int ac.f(View)>
	//    3    5:invokestatic    #270 <Method int l.a(int, int)>
	//    4    8:istore_3        
		if(j1 != 3)
	//*   5    9:iload_2         
	//*   6   10:iconst_3        
	//*   7   11:icmpeq          58
		{
			if(j1 != 5)
	//*   8   14:iload_2         
	//*   9   15:iconst_5        
	//*  10   16:icmpeq          50
			{
				if(j1 != 0x800003)
	//*  11   19:iload_2         
	//*  12   20:ldc1            #226 <Int 0x800003>
	//*  13   22:icmpeq          42
				{
					if(j1 == 0x800005)
	//*  14   25:iload_2         
	//*  15   26:ldc1            #227 <Int 0x800005>
	//*  16   28:icmpeq          34
	//*  17   31:goto            63
						u = i1;
	//   18   34:aload_0         
	//   19   35:iload_1         
	//   20   36:putfield        #229 <Field int u>
				} else
	//*  21   39:goto            63
				{
					t = i1;
	//   22   42:aload_0         
	//   23   43:iload_1         
	//   24   44:putfield        #235 <Field int t>
				}
			} else
	//*  25   47:goto            63
			{
				s = i1;
	//   26   50:aload_0         
	//   27   51:iload_1         
	//   28   52:putfield        #231 <Field int s>
			}
		} else
	//*  29   55:goto            63
		{
			r = i1;
	//   30   58:aload_0         
	//   31   59:iload_1         
	//   32   60:putfield        #233 <Field int r>
		}
		if(i1 != 0)
	//*  33   63:iload_1         
	//*  34   64:ifeq            92
		{
			al al1;
			if(k1 == 3)
	//*  35   67:iload_3         
	//*  36   68:iconst_3        
	//*  37   69:icmpne          81
				al1 = k;
	//   38   72:aload_0         
	//   39   73:getfield        #272 <Field al k>
	//   40   76:astore          4
			else
	//*  41   78:goto            87
				al1 = l;
	//   42   81:aload_0         
	//   43   82:getfield        #274 <Field al l>
	//   44   85:astore          4
			al1.e();
	//   45   87:aload           4
	//   46   89:invokevirtual   #278 <Method void al.e()>
		}
		switch(i1)
	//*  47   92:iload_1         
		{
	//*  48   93:tableswitch     1 2: default 116
	//	               1 136
	//	               2 117
		default:
			return;
	//   49  116:return          

		case 2: // '\002'
			View view = b(k1);
	//   50  117:aload_0         
	//   51  118:iload_3         
	//   52  119:invokevirtual   #280 <Method View b(int)>
	//   53  122:astore          4
			if(view != null)
	//*  54  124:aload           4
	//*  55  126:ifnull          154
			{
				h(view);
	//   56  129:aload_0         
	//   57  130:aload           4
	//   58  132:invokevirtual   #283 <Method void h(View)>
				return;
	//   59  135:return          
			}
			break;

		case 1: // '\001'
			View view1 = b(k1);
	//   60  136:aload_0         
	//   61  137:iload_3         
	//   62  138:invokevirtual   #280 <Method View b(int)>
	//   63  141:astore          4
			if(view1 != null)
	//*  64  143:aload           4
	//*  65  145:ifnull          154
				i(view1);
	//   66  148:aload_0         
	//   67  149:aload           4
	//   68  151:invokevirtual   #285 <Method void i(View)>
			break;
		}
	//   69  154:return          
	}

	void a(int i1, int j1, View view)
	{
		int k1 = k.a();
	//    0    0:aload_0         
	//    1    1:getfield        #272 <Field al k>
	//    2    4:invokevirtual   #288 <Method int android.support.v4.widget.al.a()>
	//    3    7:istore          5
		int l1 = l.a();
	//    4    9:aload_0         
	//    5   10:getfield        #274 <Field al l>
	//    6   13:invokevirtual   #288 <Method int android.support.v4.widget.al.a()>
	//    7   16:istore          6
		byte byte0 = 2;
	//    8   18:iconst_2        
	//    9   19:istore          4
		if(k1 != 1 && l1 != 1)
	//*  10   21:iload           5
	//*  11   23:iconst_1        
	//*  12   24:icmpeq          62
	//*  13   27:iload           6
	//*  14   29:iconst_1        
	//*  15   30:icmpne          36
	//*  16   33:goto            62
		{
			i1 = ((int) (byte0));
	//   17   36:iload           4
	//   18   38:istore_1        
			if(k1 != 2)
	//*  19   39:iload           5
	//*  20   41:iconst_2        
	//*  21   42:icmpeq          64
				if(l1 == 2)
	//*  22   45:iload           6
	//*  23   47:iconst_2        
	//*  24   48:icmpne          57
					i1 = ((int) (byte0));
	//   25   51:iload           4
	//   26   53:istore_1        
				else
	//*  27   54:goto            64
					i1 = 0;
	//   28   57:iconst_0        
	//   29   58:istore_1        
		} else
	//*  30   59:goto            64
		{
			i1 = 1;
	//   31   62:iconst_1        
	//   32   63:istore_1        
		}
		if(view != null && j1 == 0)
	//*  33   64:aload_3         
	//*  34   65:ifnull          114
	//*  35   68:iload_2         
	//*  36   69:ifne            114
		{
			n n1 = (n)view.getLayoutParams();
	//   37   72:aload_3         
	//   38   73:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   39   76:checkcast       #209 <Class n>
	//   40   79:astore          7
			if(n1.b == 0.0F)
	//*  41   81:aload           7
	//*  42   83:getfield        #290 <Field float n.b>
	//*  43   86:fconst_0        
	//*  44   87:fcmpl           
	//*  45   88:ifne            99
				b(view);
	//   46   91:aload_0         
	//   47   92:aload_3         
	//   48   93:invokevirtual   #292 <Method void b(View)>
			else
	//*  49   96:goto            114
			if(n1.b == 1.0F)
	//*  50   99:aload           7
	//*  51  101:getfield        #290 <Field float n.b>
	//*  52  104:fconst_1        
	//*  53  105:fcmpl           
	//*  54  106:ifne            114
				c(view);
	//   55  109:aload_0         
	//   56  110:aload_3         
	//   57  111:invokevirtual   #294 <Method void c(View)>
		}
		if(i1 != o)
	//*  58  114:iload_1         
	//*  59  115:aload_0         
	//*  60  116:getfield        #296 <Field int o>
	//*  61  119:icmpeq          175
		{
			o = i1;
	//   62  122:aload_0         
	//   63  123:iload_1         
	//   64  124:putfield        #296 <Field int o>
			view = ((View) (y));
	//   65  127:aload_0         
	//   66  128:getfield        #298 <Field List y>
	//   67  131:astore_3        
			if(view != null)
	//*  68  132:aload_3         
	//*  69  133:ifnull          175
				for(j1 = ((List) (view)).size() - 1; j1 >= 0; j1--)
	//*  70  136:aload_3         
	//*  71  137:invokeinterface #303 <Method int List.size()>
	//*  72  142:iconst_1        
	//*  73  143:isub            
	//*  74  144:istore_2        
	//*  75  145:iload_2         
	//*  76  146:iflt            175
					((m)y.get(j1)).onDrawerStateChanged(i1);
	//   77  149:aload_0         
	//   78  150:getfield        #298 <Field List y>
	//   79  153:iload_2         
	//   80  154:invokeinterface #307 <Method Object List.get(int)>
	//   81  159:checkcast       #309 <Class m>
	//   82  162:iload_1         
	//   83  163:invokeinterface #313 <Method void m.onDrawerStateChanged(int)>

	//   84  168:iload_2         
	//   85  169:iconst_1        
	//   86  170:isub            
	//   87  171:istore_2        
		}
	//*  88  172:goto            145
	//   89  175:return          
	}

	public void a(int i1, boolean flag)
	{
		View view = b(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #280 <Method View b(int)>
	//    3    5:astore_3        
		if(view != null)
	//*   4    6:aload_3         
	//*   5    7:ifnull          17
		{
			a(view, flag);
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:iload_2         
	//    9   13:invokevirtual   #316 <Method void a(View, boolean)>
			return;
	//   10   16:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   17:new             #241 <Class StringBuilder>
	//   12   20:dup             
	//   13   21:invokespecial   #242 <Method void StringBuilder()>
	//   14   24:astore_3        
			stringbuilder.append("No drawer view found with gravity ");
	//   15   25:aload_3         
	//   16   26:ldc2            #318 <String "No drawer view found with gravity ">
	//   17   29:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
			stringbuilder.append(c(i1));
	//   19   33:aload_3         
	//   20   34:iload_1         
	//   21   35:invokestatic    #320 <Method String c(int)>
	//   22   38:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   23   41:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   24   42:new             #255 <Class IllegalArgumentException>
	//   25   45:dup             
	//   26   46:aload_3         
	//   27   47:invokevirtual   #259 <Method String StringBuilder.toString()>
	//   28   50:invokespecial   #262 <Method void IllegalArgumentException(String)>
	//   29   53:athrow          
		}
	}

	public void a(m m1)
	{
		if(m1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(y == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #298 <Field List y>
	//*   5    9:ifnonnull       23
			y = ((List) (new ArrayList()));
	//    6   12:aload_0         
	//    7   13:new             #323 <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #324 <Method void ArrayList()>
	//   10   20:putfield        #298 <Field List y>
		y.add(((Object) (m1)));
	//   11   23:aload_0         
	//   12   24:getfield        #298 <Field List y>
	//   13   27:aload_1         
	//   14   28:invokeinterface #328 <Method boolean List.add(Object)>
	//   15   33:pop             
	//   16   34:return          
	}

	void a(View view, float f1)
	{
		List list = y;
	//    0    0:aload_0         
	//    1    1:getfield        #298 <Field List y>
	//    2    4:astore          4
		if(list != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          52
		{
			for(int i1 = list.size() - 1; i1 >= 0; i1--)
	//*   5   11:aload           4
	//*   6   13:invokeinterface #303 <Method int List.size()>
	//*   7   18:iconst_1        
	//*   8   19:isub            
	//*   9   20:istore_3        
	//*  10   21:iload_3         
	//*  11   22:iflt            52
				((m)y.get(i1)).onDrawerSlide(view, f1);
	//   12   25:aload_0         
	//   13   26:getfield        #298 <Field List y>
	//   14   29:iload_3         
	//   15   30:invokeinterface #307 <Method Object List.get(int)>
	//   16   35:checkcast       #309 <Class m>
	//   17   38:aload_1         
	//   18   39:fload_2         
	//   19   40:invokeinterface #332 <Method void m.onDrawerSlide(View, float)>

	//   20   45:iload_3         
	//   21   46:iconst_1        
	//   22   47:isub            
	//   23   48:istore_3        
		}
	//*  24   49:goto            21
	//   25   52:return          
	}

	public void a(View view, boolean flag)
	{
		if(g(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #176 <Method boolean g(View)>
	//*   3    5:ifeq            133
		{
			n n1 = (n)view.getLayoutParams();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   12:checkcast       #209 <Class n>
	//    7   15:astore_3        
			if(q)
	//*   8   16:aload_0         
	//*   9   17:getfield        #334 <Field boolean q>
	//*  10   20:ifeq            42
			{
				n1.b = 1.0F;
	//   11   23:aload_3         
	//   12   24:fconst_1        
	//   13   25:putfield        #290 <Field float n.b>
				n1.d = 1;
	//   14   28:aload_3         
	//   15   29:iconst_1        
	//   16   30:putfield        #264 <Field int n.d>
				c(view, true);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:iconst_1        
	//   20   36:invokespecial   #336 <Method void c(View, boolean)>
			} else
	//*  21   39:goto            128
			if(flag)
	//*  22   42:iload_2         
	//*  23   43:ifeq            107
			{
				n1.d = n1.d | 2;
	//   24   46:aload_3         
	//   25   47:aload_3         
	//   26   48:getfield        #264 <Field int n.d>
	//   27   51:iconst_2        
	//   28   52:ior             
	//   29   53:putfield        #264 <Field int n.d>
				if(a(view, 3))
	//*  30   56:aload_0         
	//*  31   57:aload_1         
	//*  32   58:iconst_3        
	//*  33   59:invokevirtual   #339 <Method boolean a(View, int)>
	//*  34   62:ifeq            82
					k.a(view, 0, view.getTop());
	//   35   65:aload_0         
	//   36   66:getfield        #272 <Field al k>
	//   37   69:aload_1         
	//   38   70:iconst_0        
	//   39   71:aload_1         
	//   40   72:invokevirtual   #136 <Method int View.getTop()>
	//   41   75:invokevirtual   #342 <Method boolean android.support.v4.widget.al.a(View, int, int)>
	//   42   78:pop             
				else
	//*  43   79:goto            128
					l.a(view, getWidth() - view.getWidth(), view.getTop());
	//   44   82:aload_0         
	//   45   83:getfield        #274 <Field al l>
	//   46   86:aload_1         
	//   47   87:aload_0         
	//   48   88:invokevirtual   #345 <Method int getWidth()>
	//   49   91:aload_1         
	//   50   92:invokevirtual   #346 <Method int View.getWidth()>
	//   51   95:isub            
	//   52   96:aload_1         
	//   53   97:invokevirtual   #136 <Method int View.getTop()>
	//   54  100:invokevirtual   #342 <Method boolean android.support.v4.widget.al.a(View, int, int)>
	//   55  103:pop             
			} else
	//*  56  104:goto            128
			{
				c(view, 1.0F);
	//   57  107:aload_0         
	//   58  108:aload_1         
	//   59  109:fconst_1        
	//   60  110:invokevirtual   #348 <Method void c(View, float)>
				a(n1.a, 0, view);
	//   61  113:aload_0         
	//   62  114:aload_3         
	//   63  115:getfield        #237 <Field int android.support.v4.widget.n.a>
	//   64  118:iconst_0        
	//   65  119:aload_1         
	//   66  120:invokevirtual   #350 <Method void a(int, int, View)>
				view.setVisibility(0);
	//   67  123:aload_1         
	//   68  124:iconst_0        
	//   69  125:invokevirtual   #353 <Method void View.setVisibility(int)>
			}
			invalidate();
	//   70  128:aload_0         
	//   71  129:invokevirtual   #356 <Method void invalidate()>
			return;
	//   72  132:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   73  133:new             #241 <Class StringBuilder>
	//   74  136:dup             
	//   75  137:invokespecial   #242 <Method void StringBuilder()>
	//   76  140:astore_3        
			stringbuilder.append("View ");
	//   77  141:aload_3         
	//   78  142:ldc1            #244 <String "View ">
	//   79  144:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   80  147:pop             
			stringbuilder.append(((Object) (view)));
	//   81  148:aload_3         
	//   82  149:aload_1         
	//   83  150:invokevirtual   #251 <Method StringBuilder StringBuilder.append(Object)>
	//   84  153:pop             
			stringbuilder.append(" is not a sliding drawer");
	//   85  154:aload_3         
	//   86  155:ldc2            #358 <String " is not a sliding drawer">
	//   87  158:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   88  161:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   89  162:new             #255 <Class IllegalArgumentException>
	//   90  165:dup             
	//   91  166:aload_3         
	//   92  167:invokevirtual   #259 <Method String StringBuilder.toString()>
	//   93  170:invokespecial   #262 <Method void IllegalArgumentException(String)>
	//   94  173:athrow          
		}
	}

	void a(boolean flag)
	{
		int l1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method int getChildCount()>
	//    2    4:istore          5
		int j1 = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int i1;
		int k1;
		for(i1 = 0; j1 < l1; i1 = k1)
	//*   5    8:iconst_0        
	//*   6    9:istore_2        
	//*   7   10:iload_3         
	//*   8   11:iload           5
	//*   9   13:icmpge          143
		{
			View view = getChildAt(j1);
	//   10   16:aload_0         
	//   11   17:iload_3         
	//   12   18:invokevirtual   #173 <Method View getChildAt(int)>
	//   13   21:astore          6
			n n1 = (n)view.getLayoutParams();
	//   14   23:aload           6
	//   15   25:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   16   28:checkcast       #209 <Class n>
	//   17   31:astore          7
			k1 = i1;
	//   18   33:iload_2         
	//   19   34:istore          4
			if(g(view))
	//*  20   36:aload_0         
	//*  21   37:aload           6
	//*  22   39:invokevirtual   #176 <Method boolean g(View)>
	//*  23   42:ifeq            133
				if(flag && !n1.c)
	//*  24   45:iload_1         
	//*  25   46:ifeq            63
	//*  26   49:aload           7
	//*  27   51:getfield        #211 <Field boolean android.support.v4.widget.n.c>
	//*  28   54:ifne            63
				{
					k1 = i1;
	//   29   57:iload_2         
	//   30   58:istore          4
				} else
	//*  31   60:goto            133
				{
					k1 = view.getWidth();
	//   32   63:aload           6
	//   33   65:invokevirtual   #346 <Method int View.getWidth()>
	//   34   68:istore          4
					if(a(view, 3))
	//*  35   70:aload_0         
	//*  36   71:aload           6
	//*  37   73:iconst_3        
	//*  38   74:invokevirtual   #339 <Method boolean a(View, int)>
	//*  39   77:ifeq            103
						i1 |= ((int) (k.a(view, -k1, view.getTop())));
	//   40   80:iload_2         
	//   41   81:aload_0         
	//   42   82:getfield        #272 <Field al k>
	//   43   85:aload           6
	//   44   87:iload           4
	//   45   89:ineg            
	//   46   90:aload           6
	//   47   92:invokevirtual   #136 <Method int View.getTop()>
	//   48   95:invokevirtual   #342 <Method boolean android.support.v4.widget.al.a(View, int, int)>
	//   49   98:ior             
	//   50   99:istore_2        
					else
	//*  51  100:goto            124
						i1 |= ((int) (l.a(view, getWidth(), view.getTop())));
	//   52  103:iload_2         
	//   53  104:aload_0         
	//   54  105:getfield        #274 <Field al l>
	//   55  108:aload           6
	//   56  110:aload_0         
	//   57  111:invokevirtual   #345 <Method int getWidth()>
	//   58  114:aload           6
	//   59  116:invokevirtual   #136 <Method int View.getTop()>
	//   60  119:invokevirtual   #342 <Method boolean android.support.v4.widget.al.a(View, int, int)>
	//   61  122:ior             
	//   62  123:istore_2        
					n1.c = false;
	//   63  124:aload           7
	//   64  126:iconst_0        
	//   65  127:putfield        #211 <Field boolean android.support.v4.widget.n.c>
					k1 = i1;
	//   66  130:iload_2         
	//   67  131:istore          4
				}
			j1++;
	//   68  133:iload_3         
	//   69  134:iconst_1        
	//   70  135:iadd            
	//   71  136:istore_3        
		}

	//   72  137:iload           4
	//   73  139:istore_2        
	//*  74  140:goto            10
		m.a();
	//   75  143:aload_0         
	//   76  144:getfield        #361 <Field p m>
	//   77  147:invokevirtual   #365 <Method void android.support.v4.widget.p.a()>
		n.a();
	//   78  150:aload_0         
	//   79  151:getfield        #367 <Field p n>
	//   80  154:invokevirtual   #365 <Method void android.support.v4.widget.p.a()>
		if(i1 != 0)
	//*  81  157:iload_2         
	//*  82  158:ifeq            165
			invalidate();
	//   83  161:aload_0         
	//   84  162:invokevirtual   #356 <Method void invalidate()>
	//   85  165:return          
	}

	boolean a(View view, int i1)
	{
		return (e(view) & i1) == i1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #368 <Method int e(View)>
	//    3    5:iload_2         
	//    4    6:iand            
	//    5    7:iload_2         
	//    6    8:icmpne          13
	//    7   11:iconst_1        
	//    8   12:ireturn         
	//    9   13:iconst_0        
	//   10   14:ireturn         
	}

	public void addFocusables(ArrayList arraylist, int i1, int j1)
	{
		if(getDescendantFocusability() == 0x60000)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #373 <Method int getDescendantFocusability()>
	//*   2    4:ldc2            #374 <Int 0x60000>
	//*   3    7:icmpne          11
			return;
	//    4   10:return          
		int j2 = getChildCount();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #169 <Method int getChildCount()>
	//    7   15:istore          7
		boolean flag1 = false;
	//    8   17:iconst_0        
	//    9   18:istore          6
		int k1 = 0;
	//   10   20:iconst_0        
	//   11   21:istore          4
		boolean flag = false;
	//   12   23:iconst_0        
	//   13   24:istore          5
		for(; k1 < j2; k1++)
	//*  14   26:iload           4
	//*  15   28:iload           7
	//*  16   30:icmpge          92
		{
			View view = getChildAt(k1);
	//   17   33:aload_0         
	//   18   34:iload           4
	//   19   36:invokevirtual   #173 <Method View getChildAt(int)>
	//   20   39:astore          8
			if(g(view))
	//*  21   41:aload_0         
	//*  22   42:aload           8
	//*  23   44:invokevirtual   #176 <Method boolean g(View)>
	//*  24   47:ifeq            73
			{
				if(j(view))
	//*  25   50:aload_0         
	//*  26   51:aload           8
	//*  27   53:invokevirtual   #376 <Method boolean j(View)>
	//*  28   56:ifeq            83
				{
					view.addFocusables(arraylist, i1, j1);
	//   29   59:aload           8
	//   30   61:aload_1         
	//   31   62:iload_2         
	//   32   63:iload_3         
	//   33   64:invokevirtual   #378 <Method void View.addFocusables(ArrayList, int, int)>
					flag = true;
	//   34   67:iconst_1        
	//   35   68:istore          5
				}
			} else
	//*  36   70:goto            83
			{
				K.add(((Object) (view)));
	//   37   73:aload_0         
	//   38   74:getfield        #380 <Field ArrayList K>
	//   39   77:aload           8
	//   40   79:invokevirtual   #381 <Method boolean ArrayList.add(Object)>
	//   41   82:pop             
			}
		}

	//   42   83:iload           4
	//   43   85:iconst_1        
	//   44   86:iadd            
	//   45   87:istore          4
	//*  46   89:goto            26
		if(!flag)
	//*  47   92:iload           5
	//*  48   94:ifne            156
		{
			int i2 = K.size();
	//   49   97:aload_0         
	//   50   98:getfield        #380 <Field ArrayList K>
	//   51  101:invokevirtual   #382 <Method int ArrayList.size()>
	//   52  104:istore          5
			for(int l1 = ((int) (flag1)); l1 < i2; l1++)
	//*  53  106:iload           6
	//*  54  108:istore          4
	//*  55  110:iload           4
	//*  56  112:iload           5
	//*  57  114:icmpge          156
			{
				View view1 = (View)K.get(l1);
	//   58  117:aload_0         
	//   59  118:getfield        #380 <Field ArrayList K>
	//   60  121:iload           4
	//   61  123:invokevirtual   #383 <Method Object ArrayList.get(int)>
	//   62  126:checkcast       #84  <Class View>
	//   63  129:astore          8
				if(view1.getVisibility() == 0)
	//*  64  131:aload           8
	//*  65  133:invokevirtual   #386 <Method int View.getVisibility()>
	//*  66  136:ifne            147
					view1.addFocusables(arraylist, i1, j1);
	//   67  139:aload           8
	//   68  141:aload_1         
	//   69  142:iload_2         
	//   70  143:iload_3         
	//   71  144:invokevirtual   #378 <Method void View.addFocusables(ArrayList, int, int)>
			}

	//   72  147:iload           4
	//   73  149:iconst_1        
	//   74  150:iadd            
	//   75  151:istore          4
		}
	//*  76  153:goto            110
		K.clear();
	//   77  156:aload_0         
	//   78  157:getfield        #380 <Field ArrayList K>
	//   79  160:invokevirtual   #389 <Method void ArrayList.clear()>
	//   80  163:return          
	}

	public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.addView(view, i1, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #393 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
		if(a() == null && !g(view))
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #395 <Method View a()>
	//*   7   11:ifnonnull       33
	//*   8   14:aload_0         
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #176 <Method boolean g(View)>
	//*  11   19:ifeq            25
	//*  12   22:goto            33
			ac.b(view, 1);
	//   13   25:aload_1         
	//   14   26:iconst_1        
	//   15   27:invokestatic    #181 <Method void ac.b(View, int)>
		else
	//*  16   30:goto            38
			ac.b(view, 4);
	//   17   33:aload_1         
	//   18   34:iconst_4        
	//   19   35:invokestatic    #181 <Method void ac.b(View, int)>
		if(!b)
	//*  20   38:getstatic       #71  <Field boolean b>
	//*  21   41:ifne            52
			ac.a(view, ((android.support.v4.view.b) (e)));
	//   22   44:aload_1         
	//   23   45:aload_0         
	//   24   46:getfield        #397 <Field android.support.v4.widget.l e>
	//   25   49:invokestatic    #400 <Method void ac.a(View, android.support.v4.view.b)>
	//   26   52:return          
	}

	View b(int i1)
	{
		int j1 = android.support.v4.view.l.a(i1, ac.f(((View) (this))));
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #193 <Method int ac.f(View)>
	//    3    5:invokestatic    #270 <Method int l.a(int, int)>
	//    4    8:istore_2        
		int k1 = getChildCount();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #169 <Method int getChildCount()>
	//    7   13:istore_3        
		for(i1 = 0; i1 < k1; i1++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_3         
	//*  12   18:icmpge          54
		{
			View view = getChildAt(i1);
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:invokevirtual   #173 <Method View getChildAt(int)>
	//   16   26:astore          4
			if((e(view) & 7) == (j1 & 7))
	//*  17   28:aload_0         
	//*  18   29:aload           4
	//*  19   31:invokevirtual   #368 <Method int e(View)>
	//*  20   34:bipush          7
	//*  21   36:iand            
	//*  22   37:iload_2         
	//*  23   38:bipush          7
	//*  24   40:iand            
	//*  25   41:icmpne          47
				return view;
	//   26   44:aload           4
	//   27   46:areturn         
		}

	//   28   47:iload_1         
	//   29   48:iconst_1        
	//   30   49:iadd            
	//   31   50:istore_1        
	//*  32   51:goto            16
		return null;
	//   33   54:aconst_null     
	//   34   55:areturn         
	}

	public void b()
	{
		a(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #402 <Method void a(boolean)>
	//    3    5:return          
	}

	public void b(int i1, boolean flag)
	{
		View view = b(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #280 <Method View b(int)>
	//    3    5:astore_3        
		if(view != null)
	//*   4    6:aload_3         
	//*   5    7:ifnull          17
		{
			b(view, flag);
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:iload_2         
	//    9   13:invokevirtual   #404 <Method void b(View, boolean)>
			return;
	//   10   16:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   17:new             #241 <Class StringBuilder>
	//   12   20:dup             
	//   13   21:invokespecial   #242 <Method void StringBuilder()>
	//   14   24:astore_3        
			stringbuilder.append("No drawer view found with gravity ");
	//   15   25:aload_3         
	//   16   26:ldc2            #318 <String "No drawer view found with gravity ">
	//   17   29:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
			stringbuilder.append(c(i1));
	//   19   33:aload_3         
	//   20   34:iload_1         
	//   21   35:invokestatic    #320 <Method String c(int)>
	//   22   38:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   23   41:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   24   42:new             #255 <Class IllegalArgumentException>
	//   25   45:dup             
	//   26   46:aload_3         
	//   27   47:invokevirtual   #259 <Method String StringBuilder.toString()>
	//   28   50:invokespecial   #262 <Method void IllegalArgumentException(String)>
	//   29   53:athrow          
		}
	}

	public void b(m m1)
	{
		if(m1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		List list = y;
	//    3    5:aload_0         
	//    4    6:getfield        #298 <Field List y>
	//    5    9:astore_2        
		if(list == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       15
		{
			return;
	//    8   14:return          
		} else
		{
			list.remove(((Object) (m1)));
	//    9   15:aload_2         
	//   10   16:aload_1         
	//   11   17:invokeinterface #407 <Method boolean List.remove(Object)>
	//   12   22:pop             
			return;
	//   13   23:return          
		}
	}

	void b(View view)
	{
		Object obj = ((Object) ((n)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #209 <Class n>
	//    3    7:astore_3        
		if((((n) (obj)).d & 1) == 1)
	//*   4    8:aload_3         
	//*   5    9:getfield        #264 <Field int n.d>
	//*   6   12:iconst_1        
	//*   7   13:iand            
	//*   8   14:iconst_1        
	//*   9   15:icmpne          99
		{
			obj.d = 0;
	//   10   18:aload_3         
	//   11   19:iconst_0        
	//   12   20:putfield        #264 <Field int n.d>
			obj = ((Object) (y));
	//   13   23:aload_0         
	//   14   24:getfield        #298 <Field List y>
	//   15   27:astore_3        
			if(obj != null)
	//*  16   28:aload_3         
	//*  17   29:ifnull          71
			{
				for(int i1 = ((List) (obj)).size() - 1; i1 >= 0; i1--)
	//*  18   32:aload_3         
	//*  19   33:invokeinterface #303 <Method int List.size()>
	//*  20   38:iconst_1        
	//*  21   39:isub            
	//*  22   40:istore_2        
	//*  23   41:iload_2         
	//*  24   42:iflt            71
					((m)y.get(i1)).onDrawerClosed(view);
	//   25   45:aload_0         
	//   26   46:getfield        #298 <Field List y>
	//   27   49:iload_2         
	//   28   50:invokeinterface #307 <Method Object List.get(int)>
	//   29   55:checkcast       #309 <Class m>
	//   30   58:aload_1         
	//   31   59:invokeinterface #410 <Method void m.onDrawerClosed(View)>

	//   32   64:iload_2         
	//   33   65:iconst_1        
	//   34   66:isub            
	//   35   67:istore_2        
			}
	//*  36   68:goto            41
			c(view, false);
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:iconst_0        
	//   40   74:invokespecial   #336 <Method void c(View, boolean)>
			if(hasWindowFocus())
	//*  41   77:aload_0         
	//*  42   78:invokevirtual   #413 <Method boolean hasWindowFocus()>
	//*  43   81:ifeq            99
			{
				view = getRootView();
	//   44   84:aload_0         
	//   45   85:invokevirtual   #416 <Method View getRootView()>
	//   46   88:astore_1        
				if(view != null)
	//*  47   89:aload_1         
	//*  48   90:ifnull          99
					view.sendAccessibilityEvent(32);
	//   49   93:aload_1         
	//   50   94:bipush          32
	//   51   96:invokevirtual   #419 <Method void View.sendAccessibilityEvent(int)>
			}
		}
	//   52   99:return          
	}

	void b(View view, float f1)
	{
		n n1 = (n)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #209 <Class n>
	//    3    7:astore_3        
		if(f1 == n1.b)
	//*   4    8:fload_2         
	//*   5    9:aload_3         
	//*   6   10:getfield        #290 <Field float n.b>
	//*   7   13:fcmpl           
	//*   8   14:ifne            18
		{
			return;
	//    9   17:return          
		} else
		{
			n1.b = f1;
	//   10   18:aload_3         
	//   11   19:fload_2         
	//   12   20:putfield        #290 <Field float n.b>
			a(view, f1);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:fload_2         
	//   16   26:invokevirtual   #421 <Method void a(View, float)>
			return;
	//   17   29:return          
		}
	}

	public void b(View view, boolean flag)
	{
		if(g(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #176 <Method boolean g(View)>
	//*   3    5:ifeq            126
		{
			n n1 = (n)view.getLayoutParams();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   12:checkcast       #209 <Class n>
	//    7   15:astore_3        
			if(q)
	//*   8   16:aload_0         
	//*   9   17:getfield        #334 <Field boolean q>
	//*  10   20:ifeq            36
			{
				n1.b = 0.0F;
	//   11   23:aload_3         
	//   12   24:fconst_0        
	//   13   25:putfield        #290 <Field float n.b>
				n1.d = 0;
	//   14   28:aload_3         
	//   15   29:iconst_0        
	//   16   30:putfield        #264 <Field int n.d>
			} else
	//*  17   33:goto            121
			if(flag)
	//*  18   36:iload_2         
	//*  19   37:ifeq            100
			{
				n1.d = n1.d | 4;
	//   20   40:aload_3         
	//   21   41:aload_3         
	//   22   42:getfield        #264 <Field int n.d>
	//   23   45:iconst_4        
	//   24   46:ior             
	//   25   47:putfield        #264 <Field int n.d>
				if(a(view, 3))
	//*  26   50:aload_0         
	//*  27   51:aload_1         
	//*  28   52:iconst_3        
	//*  29   53:invokevirtual   #339 <Method boolean a(View, int)>
	//*  30   56:ifeq            80
					k.a(view, -view.getWidth(), view.getTop());
	//   31   59:aload_0         
	//   32   60:getfield        #272 <Field al k>
	//   33   63:aload_1         
	//   34   64:aload_1         
	//   35   65:invokevirtual   #346 <Method int View.getWidth()>
	//   36   68:ineg            
	//   37   69:aload_1         
	//   38   70:invokevirtual   #136 <Method int View.getTop()>
	//   39   73:invokevirtual   #342 <Method boolean android.support.v4.widget.al.a(View, int, int)>
	//   40   76:pop             
				else
	//*  41   77:goto            121
					l.a(view, getWidth(), view.getTop());
	//   42   80:aload_0         
	//   43   81:getfield        #274 <Field al l>
	//   44   84:aload_1         
	//   45   85:aload_0         
	//   46   86:invokevirtual   #345 <Method int getWidth()>
	//   47   89:aload_1         
	//   48   90:invokevirtual   #136 <Method int View.getTop()>
	//   49   93:invokevirtual   #342 <Method boolean android.support.v4.widget.al.a(View, int, int)>
	//   50   96:pop             
			} else
	//*  51   97:goto            121
			{
				c(view, 0.0F);
	//   52  100:aload_0         
	//   53  101:aload_1         
	//   54  102:fconst_0        
	//   55  103:invokevirtual   #348 <Method void c(View, float)>
				a(n1.a, 0, view);
	//   56  106:aload_0         
	//   57  107:aload_3         
	//   58  108:getfield        #237 <Field int android.support.v4.widget.n.a>
	//   59  111:iconst_0        
	//   60  112:aload_1         
	//   61  113:invokevirtual   #350 <Method void a(int, int, View)>
				view.setVisibility(4);
	//   62  116:aload_1         
	//   63  117:iconst_4        
	//   64  118:invokevirtual   #353 <Method void View.setVisibility(int)>
			}
			invalidate();
	//   65  121:aload_0         
	//   66  122:invokevirtual   #356 <Method void invalidate()>
			return;
	//   67  125:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   68  126:new             #241 <Class StringBuilder>
	//   69  129:dup             
	//   70  130:invokespecial   #242 <Method void StringBuilder()>
	//   71  133:astore_3        
			stringbuilder.append("View ");
	//   72  134:aload_3         
	//   73  135:ldc1            #244 <String "View ">
	//   74  137:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   75  140:pop             
			stringbuilder.append(((Object) (view)));
	//   76  141:aload_3         
	//   77  142:aload_1         
	//   78  143:invokevirtual   #251 <Method StringBuilder StringBuilder.append(Object)>
	//   79  146:pop             
			stringbuilder.append(" is not a sliding drawer");
	//   80  147:aload_3         
	//   81  148:ldc2            #358 <String " is not a sliding drawer">
	//   82  151:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   83  154:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   84  155:new             #255 <Class IllegalArgumentException>
	//   85  158:dup             
	//   86  159:aload_3         
	//   87  160:invokevirtual   #259 <Method String StringBuilder.toString()>
	//   88  163:invokespecial   #262 <Method void IllegalArgumentException(String)>
	//   89  166:athrow          
		}
	}

	View c()
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          43
		{
			View view = getChildAt(i1);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #173 <Method View getChildAt(int)>
	//   11   17:astore_3        
			if(g(view) && k(view))
	//*  12   18:aload_0         
	//*  13   19:aload_3         
	//*  14   20:invokevirtual   #176 <Method boolean g(View)>
	//*  15   23:ifeq            36
	//*  16   26:aload_0         
	//*  17   27:aload_3         
	//*  18   28:invokevirtual   #423 <Method boolean k(View)>
	//*  19   31:ifeq            36
				return view;
	//   20   34:aload_3         
	//   21   35:areturn         
		}

	//   22   36:iload_1         
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:istore_1        
	//*  26   40:goto            7
		return null;
	//   27   43:aconst_null     
	//   28   44:areturn         
	}

	void c(View view)
	{
		Object obj = ((Object) ((n)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #209 <Class n>
	//    3    7:astore_3        
		if((((n) (obj)).d & 1) == 0)
	//*   4    8:aload_3         
	//*   5    9:getfield        #264 <Field int n.d>
	//*   6   12:iconst_1        
	//*   7   13:iand            
	//*   8   14:ifne            89
		{
			obj.d = 1;
	//    9   17:aload_3         
	//   10   18:iconst_1        
	//   11   19:putfield        #264 <Field int n.d>
			obj = ((Object) (y));
	//   12   22:aload_0         
	//   13   23:getfield        #298 <Field List y>
	//   14   26:astore_3        
			if(obj != null)
	//*  15   27:aload_3         
	//*  16   28:ifnull          70
			{
				for(int i1 = ((List) (obj)).size() - 1; i1 >= 0; i1--)
	//*  17   31:aload_3         
	//*  18   32:invokeinterface #303 <Method int List.size()>
	//*  19   37:iconst_1        
	//*  20   38:isub            
	//*  21   39:istore_2        
	//*  22   40:iload_2         
	//*  23   41:iflt            70
					((m)y.get(i1)).onDrawerOpened(view);
	//   24   44:aload_0         
	//   25   45:getfield        #298 <Field List y>
	//   26   48:iload_2         
	//   27   49:invokeinterface #307 <Method Object List.get(int)>
	//   28   54:checkcast       #309 <Class m>
	//   29   57:aload_1         
	//   30   58:invokeinterface #426 <Method void m.onDrawerOpened(View)>

	//   31   63:iload_2         
	//   32   64:iconst_1        
	//   33   65:isub            
	//   34   66:istore_2        
			}
	//*  35   67:goto            40
			c(view, true);
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:iconst_1        
	//   39   73:invokespecial   #336 <Method void c(View, boolean)>
			if(hasWindowFocus())
	//*  40   76:aload_0         
	//*  41   77:invokevirtual   #413 <Method boolean hasWindowFocus()>
	//*  42   80:ifeq            89
				sendAccessibilityEvent(32);
	//   43   83:aload_0         
	//   44   84:bipush          32
	//   45   86:invokevirtual   #427 <Method void sendAccessibilityEvent(int)>
		}
	//   46   89:return          
	}

	void c(View view, float f1)
	{
		float f2 = d(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #430 <Method float d(View)>
	//    3    5:fstore_3        
		float f3 = view.getWidth();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #346 <Method int View.getWidth()>
	//    6   10:i2f             
	//    7   11:fstore          4
		int i1 = (int)(f2 * f3);
	//    8   13:fload_3         
	//    9   14:fload           4
	//   10   16:fmul            
	//   11   17:f2i             
	//   12   18:istore          5
		i1 = (int)(f3 * f1) - i1;
	//   13   20:fload           4
	//   14   22:fload_2         
	//   15   23:fmul            
	//   16   24:f2i             
	//   17   25:iload           5
	//   18   27:isub            
	//   19   28:istore          5
		if(!a(view, 3))
	//*  20   30:aload_0         
	//*  21   31:aload_1         
	//*  22   32:iconst_3        
	//*  23   33:invokevirtual   #339 <Method boolean a(View, int)>
	//*  24   36:ifeq            42
	//*  25   39:goto            47
			i1 = -i1;
	//   26   42:iload           5
	//   27   44:ineg            
	//   28   45:istore          5
		view.offsetLeftAndRight(i1);
	//   29   47:aload_1         
	//   30   48:iload           5
	//   31   50:invokevirtual   #433 <Method void View.offsetLeftAndRight(int)>
		b(view, f1);
	//   32   53:aload_0         
	//   33   54:aload_1         
	//   34   55:fload_2         
	//   35   56:invokevirtual   #435 <Method void b(View, float)>
	//   36   59:return          
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof n) && super.checkLayoutParams(layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #209 <Class n>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #439 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void computeScroll()
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method int getChildCount()>
	//    2    4:istore_3        
		float f1 = 0.0F;
	//    3    5:fconst_0        
	//    4    6:fstore_1        
		for(int i1 = 0; i1 < j1; i1++)
	//*   5    7:iconst_0        
	//*   6    8:istore_2        
	//*   7    9:iload_2         
	//*   8   10:iload_3         
	//*   9   11:icmpge          40
			f1 = Math.max(f1, ((n)getChildAt(i1).getLayoutParams()).b);
	//   10   14:fload_1         
	//   11   15:aload_0         
	//   12   16:iload_2         
	//   13   17:invokevirtual   #173 <Method View getChildAt(int)>
	//   14   20:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   15   23:checkcast       #209 <Class n>
	//   16   26:getfield        #290 <Field float n.b>
	//   17   29:invokestatic    #446 <Method float Math.max(float, float)>
	//   18   32:fstore_1        

	//   19   33:iload_2         
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:istore_2        
	//*  23   37:goto            9
		i = f1;
	//   24   40:aload_0         
	//   25   41:fload_1         
	//   26   42:putfield        #448 <Field float i>
		boolean flag = k.a(true);
	//   27   45:aload_0         
	//   28   46:getfield        #272 <Field al k>
	//   29   49:iconst_1        
	//   30   50:invokevirtual   #451 <Method boolean android.support.v4.widget.al.a(boolean)>
	//   31   53:istore          4
		boolean flag1 = l.a(true);
	//   32   55:aload_0         
	//   33   56:getfield        #274 <Field al l>
	//   34   59:iconst_1        
	//   35   60:invokevirtual   #451 <Method boolean android.support.v4.widget.al.a(boolean)>
	//   36   63:istore          5
		if(flag || flag1)
	//*  37   65:iload           4
	//*  38   67:ifne            75
	//*  39   70:iload           5
	//*  40   72:ifeq            79
			ac.d(((View) (this)));
	//   41   75:aload_0         
	//   42   76:invokestatic    #453 <Method void ac.d(View)>
	//   43   79:return          
	}

	float d(View view)
	{
		return ((n)view.getLayoutParams()).b;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #209 <Class n>
	//    3    7:getfield        #290 <Field float n.b>
	//    4   10:freturn         
	}

	public void d(int i1)
	{
		a(i1, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #455 <Method void a(int, boolean)>
	//    4    6:return          
	}

	public boolean dispatchGenericMotionEvent(MotionEvent motionevent)
	{
		if((motionevent.getSource() & 2) != 0 && motionevent.getAction() != 10 && i > 0.0F)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #458 <Method int MotionEvent.getSource()>
	//*   2    4:iconst_2        
	//*   3    5:iand            
	//*   4    6:ifeq            116
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #461 <Method int MotionEvent.getAction()>
	//*   7   13:bipush          10
	//*   8   15:icmpeq          116
	//*   9   18:aload_0         
	//*  10   19:getfield        #448 <Field float i>
	//*  11   22:fconst_0        
	//*  12   23:fcmpg           
	//*  13   24:ifgt            30
	//*  14   27:goto            116
		{
			int i1 = getChildCount();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #169 <Method int getChildCount()>
	//   17   34:istore          4
			if(i1 != 0)
	//*  18   36:iload           4
	//*  19   38:ifeq            114
			{
				float f1 = motionevent.getX();
	//   20   41:aload_1         
	//   21   42:invokevirtual   #465 <Method float MotionEvent.getX()>
	//   22   45:fstore_2        
				float f2 = motionevent.getY();
	//   23   46:aload_1         
	//   24   47:invokevirtual   #468 <Method float MotionEvent.getY()>
	//   25   50:fstore_3        
				for(i1--; i1 >= 0; i1--)
	//*  26   51:iload           4
	//*  27   53:iconst_1        
	//*  28   54:isub            
	//*  29   55:istore          4
	//*  30   57:iload           4
	//*  31   59:iflt            114
				{
					View view = getChildAt(i1);
	//   32   62:aload_0         
	//   33   63:iload           4
	//   34   65:invokevirtual   #173 <Method View getChildAt(int)>
	//   35   68:astore          5
					if(a(f1, f2, view) && !f(view) && a(motionevent, view))
	//*  36   70:aload_0         
	//*  37   71:fload_2         
	//*  38   72:fload_3         
	//*  39   73:aload           5
	//*  40   75:invokespecial   #470 <Method boolean a(float, float, View)>
	//*  41   78:ifeq            105
	//*  42   81:aload_0         
	//*  43   82:aload           5
	//*  44   84:invokevirtual   #472 <Method boolean f(View)>
	//*  45   87:ifeq            93
	//*  46   90:goto            105
	//*  47   93:aload_0         
	//*  48   94:aload_1         
	//*  49   95:aload           5
	//*  50   97:invokespecial   #474 <Method boolean a(MotionEvent, View)>
	//*  51  100:ifeq            105
						return true;
	//   52  103:iconst_1        
	//   53  104:ireturn         
				}

	//   54  105:iload           4
	//   55  107:iconst_1        
	//   56  108:isub            
	//   57  109:istore          4
			}
	//*  58  111:goto            57
			return false;
	//   59  114:iconst_0        
	//   60  115:ireturn         
		} else
		{
			return super.dispatchGenericMotionEvent(motionevent);
	//   61  116:aload_0         
	//   62  117:aload_1         
	//   63  118:invokespecial   #475 <Method boolean ViewGroup.dispatchGenericMotionEvent(MotionEvent)>
	//   64  121:ireturn         
		}
	}

	protected boolean drawChild(Canvas canvas, View view, long l1)
	{
		int k5 = getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #480 <Method int getHeight()>
	//    2    4:istore          13
		boolean flag = f(view);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:invokevirtual   #472 <Method boolean f(View)>
	//    6   11:istore          15
		int i1 = getWidth();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #345 <Method int getWidth()>
	//    9   17:istore          6
		int j5 = canvas.save();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #485 <Method int Canvas.save()>
	//   12   23:istore          12
		int i2 = 0;
	//   13   25:iconst_0        
	//   14   26:istore          7
		if(flag)
	//*  15   28:iload           15
	//*  16   30:ifeq            251
		{
			int l5 = getChildCount();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #169 <Method int getChildCount()>
	//   19   37:istore          14
			int l2 = 0;
	//   20   39:iconst_0        
	//   21   40:istore          8
			i2 = 0;
	//   22   42:iconst_0        
	//   23   43:istore          7
			while(l2 < l5) 
	//*  24   45:iload           8
	//*  25   47:iload           14
	//*  26   49:icmpge          234
			{
				View view1 = getChildAt(l2);
	//   27   52:aload_0         
	//   28   53:iload           8
	//   29   55:invokevirtual   #173 <Method View getChildAt(int)>
	//   30   58:astore          17
				int l3 = i2;
	//   31   60:iload           7
	//   32   62:istore          9
				int k4 = i1;
	//   33   64:iload           6
	//   34   66:istore          10
				if(view1 != view)
	//*  35   68:aload           17
	//*  36   70:aload_2         
	//*  37   71:if_acmpeq       217
				{
					l3 = i2;
	//   38   74:iload           7
	//   39   76:istore          9
					k4 = i1;
	//   40   78:iload           6
	//   41   80:istore          10
					if(view1.getVisibility() == 0)
	//*  42   82:aload           17
	//*  43   84:invokevirtual   #386 <Method int View.getVisibility()>
	//*  44   87:ifne            217
					{
						l3 = i2;
	//   45   90:iload           7
	//   46   92:istore          9
						k4 = i1;
	//   47   94:iload           6
	//   48   96:istore          10
						if(m(view1))
	//*  49   98:aload           17
	//*  50  100:invokestatic    #487 <Method boolean m(View)>
	//*  51  103:ifeq            217
						{
							l3 = i2;
	//   52  106:iload           7
	//   53  108:istore          9
							k4 = i1;
	//   54  110:iload           6
	//   55  112:istore          10
							if(g(view1))
	//*  56  114:aload_0         
	//*  57  115:aload           17
	//*  58  117:invokevirtual   #176 <Method boolean g(View)>
	//*  59  120:ifeq            217
								if(view1.getHeight() < k5)
	//*  60  123:aload           17
	//*  61  125:invokevirtual   #488 <Method int View.getHeight()>
	//*  62  128:iload           13
	//*  63  130:icmpge          144
								{
									l3 = i2;
	//   64  133:iload           7
	//   65  135:istore          9
									k4 = i1;
	//   66  137:iload           6
	//   67  139:istore          10
								} else
	//*  68  141:goto            217
								if(a(view1, 3))
	//*  69  144:aload_0         
	//*  70  145:aload           17
	//*  71  147:iconst_3        
	//*  72  148:invokevirtual   #339 <Method boolean a(View, int)>
	//*  73  151:ifeq            187
								{
									int l4 = view1.getRight();
	//   74  154:aload           17
	//   75  156:invokevirtual   #491 <Method int View.getRight()>
	//   76  159:istore          11
									l3 = i2;
	//   77  161:iload           7
	//   78  163:istore          9
									k4 = i1;
	//   79  165:iload           6
	//   80  167:istore          10
									if(l4 > i2)
	//*  81  169:iload           11
	//*  82  171:iload           7
	//*  83  173:icmple          217
									{
										l3 = l4;
	//   84  176:iload           11
	//   85  178:istore          9
										k4 = i1;
	//   86  180:iload           6
	//   87  182:istore          10
									}
								} else
	//*  88  184:goto            217
								{
									int i5 = view1.getLeft();
	//   89  187:aload           17
	//   90  189:invokevirtual   #130 <Method int View.getLeft()>
	//   91  192:istore          11
									l3 = i2;
	//   92  194:iload           7
	//   93  196:istore          9
									k4 = i1;
	//   94  198:iload           6
	//   95  200:istore          10
									if(i5 < i1)
	//*  96  202:iload           11
	//*  97  204:iload           6
	//*  98  206:icmpge          217
									{
										k4 = i5;
	//   99  209:iload           11
	//  100  211:istore          10
										l3 = i2;
	//  101  213:iload           7
	//  102  215:istore          9
									}
								}
						}
					}
				}
				l2++;
	//  103  217:iload           8
	//  104  219:iconst_1        
	//  105  220:iadd            
	//  106  221:istore          8
				i2 = l3;
	//  107  223:iload           9
	//  108  225:istore          7
				i1 = k4;
	//  109  227:iload           10
	//  110  229:istore          6
			}
	//* 111  231:goto            45
			canvas.clipRect(i2, 0, i1, getHeight());
	//  112  234:aload_1         
	//  113  235:iload           7
	//  114  237:iconst_0        
	//  115  238:iload           6
	//  116  240:aload_0         
	//  117  241:invokevirtual   #480 <Method int getHeight()>
	//  118  244:invokevirtual   #495 <Method boolean Canvas.clipRect(int, int, int, int)>
	//  119  247:pop             
		}
	//* 120  248:goto            251
		boolean flag1 = super.drawChild(canvas, view, l1);
	//  121  251:aload_0         
	//  122  252:aload_1         
	//  123  253:aload_2         
	//  124  254:lload_3         
	//  125  255:invokespecial   #497 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//  126  258:istore          16
		canvas.restoreToCount(j5);
	//  127  260:aload_1         
	//  128  261:iload           12
	//  129  263:invokevirtual   #500 <Method void Canvas.restoreToCount(int)>
		float f1 = i;
	//  130  266:aload_0         
	//  131  267:getfield        #448 <Field float i>
	//  132  270:fstore          5
		if(f1 > 0.0F && flag)
	//* 133  272:fload           5
	//* 134  274:fconst_0        
	//* 135  275:fcmpl           
	//* 136  276:ifle            348
	//* 137  279:iload           15
	//* 138  281:ifeq            348
		{
			int i3 = h;
	//  139  284:aload_0         
	//  140  285:getfield        #502 <Field int h>
	//  141  288:istore          8
			int i4 = (int)((float)((0xff000000 & i3) >>> 24) * f1);
	//  142  290:ldc2            #503 <Int 0xff000000>
	//  143  293:iload           8
	//  144  295:iand            
	//  145  296:bipush          24
	//  146  298:iushr           
	//  147  299:i2f             
	//  148  300:fload           5
	//  149  302:fmul            
	//  150  303:f2i             
	//  151  304:istore          9
			j.setColor(i3 & 0xffffff | i4 << 24);
	//  152  306:aload_0         
	//  153  307:getfield        #505 <Field Paint j>
	//  154  310:iload           8
	//  155  312:ldc2            #506 <Int 0xffffff>
	//  156  315:iand            
	//  157  316:iload           9
	//  158  318:bipush          24
	//  159  320:ishl            
	//  160  321:ior             
	//  161  322:invokevirtual   #511 <Method void Paint.setColor(int)>
			canvas.drawRect(i2, 0.0F, i1, getHeight(), j);
	//  162  325:aload_1         
	//  163  326:iload           7
	//  164  328:i2f             
	//  165  329:fconst_0        
	//  166  330:iload           6
	//  167  332:i2f             
	//  168  333:aload_0         
	//  169  334:invokevirtual   #480 <Method int getHeight()>
	//  170  337:i2f             
	//  171  338:aload_0         
	//  172  339:getfield        #505 <Field Paint j>
	//  173  342:invokevirtual   #515 <Method void Canvas.drawRect(float, float, float, float, Paint)>
			return flag1;
	//  174  345:iload           16
	//  175  347:ireturn         
		}
		if(C != null && a(view, 3))
	//* 176  348:aload_0         
	//* 177  349:getfield        #186 <Field Drawable C>
	//* 178  352:ifnull          452
	//* 179  355:aload_0         
	//* 180  356:aload_2         
	//* 181  357:iconst_3        
	//* 182  358:invokevirtual   #339 <Method boolean a(View, int)>
	//* 183  361:ifeq            452
		{
			int j1 = C.getIntrinsicWidth();
	//  184  364:aload_0         
	//  185  365:getfield        #186 <Field Drawable C>
	//  186  368:invokevirtual   #518 <Method int Drawable.getIntrinsicWidth()>
	//  187  371:istore          6
			int j2 = view.getRight();
	//  188  373:aload_2         
	//  189  374:invokevirtual   #491 <Method int View.getRight()>
	//  190  377:istore          7
			int j3 = k.b();
	//  191  379:aload_0         
	//  192  380:getfield        #272 <Field al k>
	//  193  383:invokevirtual   #520 <Method int al.b()>
	//  194  386:istore          8
			float f2 = Math.max(0.0F, Math.min((float)j2 / (float)j3, 1.0F));
	//  195  388:fconst_0        
	//  196  389:iload           7
	//  197  391:i2f             
	//  198  392:iload           8
	//  199  394:i2f             
	//  200  395:fdiv            
	//  201  396:fconst_1        
	//  202  397:invokestatic    #523 <Method float Math.min(float, float)>
	//  203  400:invokestatic    #446 <Method float Math.max(float, float)>
	//  204  403:fstore          5
			C.setBounds(j2, view.getTop(), j1 + j2, view.getBottom());
	//  205  405:aload_0         
	//  206  406:getfield        #186 <Field Drawable C>
	//  207  409:iload           7
	//  208  411:aload_2         
	//  209  412:invokevirtual   #136 <Method int View.getTop()>
	//  210  415:iload           6
	//  211  417:iload           7
	//  212  419:iadd            
	//  213  420:aload_2         
	//  214  421:invokevirtual   #526 <Method int View.getBottom()>
	//  215  424:invokevirtual   #530 <Method void Drawable.setBounds(int, int, int, int)>
			C.setAlpha((int)(f2 * 255F));
	//  216  427:aload_0         
	//  217  428:getfield        #186 <Field Drawable C>
	//  218  431:fload           5
	//  219  433:ldc2            #531 <Float 255F>
	//  220  436:fmul            
	//  221  437:f2i             
	//  222  438:invokevirtual   #534 <Method void Drawable.setAlpha(int)>
			C.draw(canvas);
	//  223  441:aload_0         
	//  224  442:getfield        #186 <Field Drawable C>
	//  225  445:aload_1         
	//  226  446:invokevirtual   #538 <Method void Drawable.draw(Canvas)>
			return flag1;
	//  227  449:iload           16
	//  228  451:ireturn         
		}
		if(D != null && a(view, 5))
	//* 229  452:aload_0         
	//* 230  453:getfield        #190 <Field Drawable D>
	//* 231  456:ifnull          562
	//* 232  459:aload_0         
	//* 233  460:aload_2         
	//* 234  461:iconst_5        
	//* 235  462:invokevirtual   #339 <Method boolean a(View, int)>
	//* 236  465:ifeq            562
		{
			int k1 = D.getIntrinsicWidth();
	//  237  468:aload_0         
	//  238  469:getfield        #190 <Field Drawable D>
	//  239  472:invokevirtual   #518 <Method int Drawable.getIntrinsicWidth()>
	//  240  475:istore          6
			int k2 = view.getLeft();
	//  241  477:aload_2         
	//  242  478:invokevirtual   #130 <Method int View.getLeft()>
	//  243  481:istore          7
			int k3 = getWidth();
	//  244  483:aload_0         
	//  245  484:invokevirtual   #345 <Method int getWidth()>
	//  246  487:istore          8
			int j4 = l.b();
	//  247  489:aload_0         
	//  248  490:getfield        #274 <Field al l>
	//  249  493:invokevirtual   #520 <Method int al.b()>
	//  250  496:istore          9
			float f3 = Math.max(0.0F, Math.min((float)(k3 - k2) / (float)j4, 1.0F));
	//  251  498:fconst_0        
	//  252  499:iload           8
	//  253  501:iload           7
	//  254  503:isub            
	//  255  504:i2f             
	//  256  505:iload           9
	//  257  507:i2f             
	//  258  508:fdiv            
	//  259  509:fconst_1        
	//  260  510:invokestatic    #523 <Method float Math.min(float, float)>
	//  261  513:invokestatic    #446 <Method float Math.max(float, float)>
	//  262  516:fstore          5
			D.setBounds(k2 - k1, view.getTop(), k2, view.getBottom());
	//  263  518:aload_0         
	//  264  519:getfield        #190 <Field Drawable D>
	//  265  522:iload           7
	//  266  524:iload           6
	//  267  526:isub            
	//  268  527:aload_2         
	//  269  528:invokevirtual   #136 <Method int View.getTop()>
	//  270  531:iload           7
	//  271  533:aload_2         
	//  272  534:invokevirtual   #526 <Method int View.getBottom()>
	//  273  537:invokevirtual   #530 <Method void Drawable.setBounds(int, int, int, int)>
			D.setAlpha((int)(f3 * 255F));
	//  274  540:aload_0         
	//  275  541:getfield        #190 <Field Drawable D>
	//  276  544:fload           5
	//  277  546:ldc2            #531 <Float 255F>
	//  278  549:fmul            
	//  279  550:f2i             
	//  280  551:invokevirtual   #534 <Method void Drawable.setAlpha(int)>
			D.draw(canvas);
	//  281  554:aload_0         
	//  282  555:getfield        #190 <Field Drawable D>
	//  283  558:aload_1         
	//  284  559:invokevirtual   #538 <Method void Drawable.draw(Canvas)>
		}
		return flag1;
	//  285  562:iload           16
	//  286  564:ireturn         
	}

	int e(View view)
	{
		return android.support.v4.view.l.a(((n)view.getLayoutParams()).a, ac.f(((View) (this))));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #209 <Class n>
	//    3    7:getfield        #237 <Field int android.support.v4.widget.n.a>
	//    4   10:aload_0         
	//    5   11:invokestatic    #193 <Method int ac.f(View)>
	//    6   14:invokestatic    #270 <Method int l.a(int, int)>
	//    7   17:ireturn         
	}

	public void e(int i1)
	{
		b(i1, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #540 <Method void b(int, boolean)>
	//    4    6:return          
	}

	public boolean f(int i1)
	{
		View view = b(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #280 <Method View b(int)>
	//    3    5:astore_2        
		if(view != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          16
			return j(view);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #376 <Method boolean j(View)>
	//    9   15:ireturn         
		else
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	boolean f(View view)
	{
		return ((n)view.getLayoutParams()).a == 0;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #209 <Class n>
	//    3    7:getfield        #237 <Field int android.support.v4.widget.n.a>
	//    4   10:ifne            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean g(int i1)
	{
		View view = b(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #280 <Method View b(int)>
	//    3    5:astore_2        
		if(view != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          16
			return k(view);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #423 <Method boolean k(View)>
	//    9   15:ireturn         
		else
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	boolean g(View view)
	{
		int i1 = android.support.v4.view.l.a(((n)view.getLayoutParams()).a, ac.f(view));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #209 <Class n>
	//    3    7:getfield        #237 <Field int android.support.v4.widget.n.a>
	//    4   10:aload_1         
	//    5   11:invokestatic    #193 <Method int ac.f(View)>
	//    6   14:invokestatic    #270 <Method int l.a(int, int)>
	//    7   17:istore_2        
		if((i1 & 3) != 0)
	//*   8   18:iload_2         
	//*   9   19:iconst_3        
	//*  10   20:iand            
	//*  11   21:ifeq            26
			return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		return (i1 & 5) != 0;
	//   14   26:iload_2         
	//   15   27:iconst_5        
	//   16   28:iand            
	//   17   29:ifeq            34
	//   18   32:iconst_1        
	//   19   33:ireturn         
	//   20   34:iconst_0        
	//   21   35:ireturn         
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new n(-1, -1)));
	//    0    0:new             #209 <Class n>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:iconst_m1       
	//    4    6:invokespecial   #544 <Method void n(int, int)>
	//    5    9:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new n(getContext(), attributeset)));
	//    0    0:new             #209 <Class n>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #550 <Method android.content.Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #553 <Method void n(android.content.Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof n)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #209 <Class n>
	//*   2    4:ifeq            19
			return ((android.view.ViewGroup.LayoutParams) (new n((n)layoutparams)));
	//    3    7:new             #209 <Class n>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #209 <Class n>
	//    7   15:invokespecial   #557 <Method void n(n)>
	//    8   18:areturn         
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #559 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  11   23:ifeq            38
			return ((android.view.ViewGroup.LayoutParams) (new n((android.view.ViewGroup.MarginLayoutParams)layoutparams)));
	//   12   26:new             #209 <Class n>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:checkcast       #559 <Class android.view.ViewGroup$MarginLayoutParams>
	//   16   34:invokespecial   #562 <Method void n(android.view.ViewGroup$MarginLayoutParams)>
	//   17   37:areturn         
		else
			return ((android.view.ViewGroup.LayoutParams) (new n(layoutparams)));
	//   18   38:new             #209 <Class n>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:invokespecial   #565 <Method void n(android.view.ViewGroup$LayoutParams)>
	//   22   46:areturn         
	}

	public float getDrawerElevation()
	{
		if(d)
	//*   0    0:getstatic       #73  <Field boolean d>
	//*   1    3:ifeq            11
			return f;
	//    2    6:aload_0         
	//    3    7:getfield        #568 <Field float f>
	//    4   10:freturn         
		else
			return 0.0F;
	//    5   11:fconst_0        
	//    6   12:freturn         
	}

	public Drawable getStatusBarBackgroundDrawable()
	{
		return B;
	//    0    0:aload_0         
	//    1    1:getfield        #571 <Field Drawable B>
	//    2    4:areturn         
	}

	public void h(View view)
	{
		a(view, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #316 <Method void a(View, boolean)>
	//    4    6:return          
	}

	public void i(View view)
	{
		b(view, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #404 <Method void b(View, boolean)>
	//    4    6:return          
	}

	public boolean j(View view)
	{
		if(g(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #176 <Method boolean g(View)>
	//*   3    5:ifeq            28
		{
			return (((n)view.getLayoutParams()).d & 1) == 1;
	//    4    8:aload_1         
	//    5    9:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   12:checkcast       #209 <Class n>
	//    7   15:getfield        #264 <Field int n.d>
	//    8   18:iconst_1        
	//    9   19:iand            
	//   10   20:iconst_1        
	//   11   21:icmpne          26
	//   12   24:iconst_1        
	//   13   25:ireturn         
	//   14   26:iconst_0        
	//   15   27:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   16   28:new             #241 <Class StringBuilder>
	//   17   31:dup             
	//   18   32:invokespecial   #242 <Method void StringBuilder()>
	//   19   35:astore_2        
			stringbuilder.append("View ");
	//   20   36:aload_2         
	//   21   37:ldc1            #244 <String "View ">
	//   22   39:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   23   42:pop             
			stringbuilder.append(((Object) (view)));
	//   24   43:aload_2         
	//   25   44:aload_1         
	//   26   45:invokevirtual   #251 <Method StringBuilder StringBuilder.append(Object)>
	//   27   48:pop             
			stringbuilder.append(" is not a drawer");
	//   28   49:aload_2         
	//   29   50:ldc1            #253 <String " is not a drawer">
	//   30   52:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   31   55:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   32   56:new             #255 <Class IllegalArgumentException>
	//   33   59:dup             
	//   34   60:aload_2         
	//   35   61:invokevirtual   #259 <Method String StringBuilder.toString()>
	//   36   64:invokespecial   #262 <Method void IllegalArgumentException(String)>
	//   37   67:athrow          
		}
	}

	public boolean k(View view)
	{
		if(g(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #176 <Method boolean g(View)>
	//*   3    5:ifeq            27
		{
			return ((n)view.getLayoutParams()).b > 0.0F;
	//    4    8:aload_1         
	//    5    9:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   12:checkcast       #209 <Class n>
	//    7   15:getfield        #290 <Field float n.b>
	//    8   18:fconst_0        
	//    9   19:fcmpl           
	//   10   20:ifle            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   15   27:new             #241 <Class StringBuilder>
	//   16   30:dup             
	//   17   31:invokespecial   #242 <Method void StringBuilder()>
	//   18   34:astore_2        
			stringbuilder.append("View ");
	//   19   35:aload_2         
	//   20   36:ldc1            #244 <String "View ">
	//   21   38:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
			stringbuilder.append(((Object) (view)));
	//   23   42:aload_2         
	//   24   43:aload_1         
	//   25   44:invokevirtual   #251 <Method StringBuilder StringBuilder.append(Object)>
	//   26   47:pop             
			stringbuilder.append(" is not a drawer");
	//   27   48:aload_2         
	//   28   49:ldc1            #253 <String " is not a drawer">
	//   29   51:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   30   54:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   31   55:new             #255 <Class IllegalArgumentException>
	//   32   58:dup             
	//   33   59:aload_2         
	//   34   60:invokevirtual   #259 <Method String StringBuilder.toString()>
	//   35   63:invokespecial   #262 <Method void IllegalArgumentException(String)>
	//   36   66:athrow          
		}
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #574 <Method void ViewGroup.onAttachedToWindow()>
		q = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #334 <Field boolean q>
	//    5    9:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #577 <Method void ViewGroup.onDetachedFromWindow()>
		q = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #334 <Field boolean q>
	//    5    9:return          
	}

	public void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #580 <Method void ViewGroup.onDraw(Canvas)>
		if(F && B != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #582 <Field boolean F>
	//*   5    9:ifeq            80
	//*   6   12:aload_0         
	//*   7   13:getfield        #571 <Field Drawable B>
	//*   8   16:ifnull          80
		{
			int i1;
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   9   19:getstatic       #69  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   22:bipush          21
	//*  11   24:icmplt          52
			{
				Object obj = E;
	//   12   27:aload_0         
	//   13   28:getfield        #584 <Field Object E>
	//   14   31:astore_3        
				if(obj != null)
	//*  15   32:aload_3         
	//*  16   33:ifnull          47
					i1 = ((WindowInsets)obj).getSystemWindowInsetTop();
	//   17   36:aload_3         
	//   18   37:checkcast       #586 <Class WindowInsets>
	//   19   40:invokevirtual   #589 <Method int WindowInsets.getSystemWindowInsetTop()>
	//   20   43:istore_2        
				else
	//*  21   44:goto            54
					i1 = 0;
	//   22   47:iconst_0        
	//   23   48:istore_2        
			} else
	//*  24   49:goto            54
			{
				i1 = 0;
	//   25   52:iconst_0        
	//   26   53:istore_2        
			}
			if(i1 > 0)
	//*  27   54:iload_2         
	//*  28   55:ifle            80
			{
				B.setBounds(0, 0, getWidth(), i1);
	//   29   58:aload_0         
	//   30   59:getfield        #571 <Field Drawable B>
	//   31   62:iconst_0        
	//   32   63:iconst_0        
	//   33   64:aload_0         
	//   34   65:invokevirtual   #345 <Method int getWidth()>
	//   35   68:iload_2         
	//   36   69:invokevirtual   #530 <Method void Drawable.setBounds(int, int, int, int)>
				B.draw(canvas);
	//   37   72:aload_0         
	//   38   73:getfield        #571 <Field Drawable B>
	//   39   76:aload_1         
	//   40   77:invokevirtual   #538 <Method void Drawable.draw(Canvas)>
			}
		}
	//   41   80:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i1;
		boolean flag2;
		boolean flag3;
		boolean flag4;
		i1 = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #593 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          4
		flag3 = k.a(motionevent);
	//    3    6:aload_0         
	//    4    7:getfield        #272 <Field al k>
	//    5   10:aload_1         
	//    6   11:invokevirtual   #595 <Method boolean android.support.v4.widget.al.a(MotionEvent)>
	//    7   14:istore          7
		flag4 = l.a(motionevent);
	//    8   16:aload_0         
	//    9   17:getfield        #274 <Field al l>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #595 <Method boolean android.support.v4.widget.al.a(MotionEvent)>
	//   12   24:istore          8
		flag2 = true;
	//   13   26:iconst_1        
	//   14   27:istore          6
		i1;
	//   15   29:iload           4
		JVM INSTR tableswitch 0 3: default 60
	//	               0 109
	//	               1 91
	//	               2 63
	//	               3 91;
	//   16   31:tableswitch     0 3: default 60
	//	               0 109
	//	               1 91
	//	               2 63
	//	               3 91
		   goto _L1 _L2 _L3 _L4 _L3
_L1:
		break; /* Loop/switch isn't completed */
	//   17   60:goto            184
_L4:
		if(k.d(3))
	//*  18   63:aload_0         
	//*  19   64:getfield        #272 <Field al k>
	//*  20   67:iconst_3        
	//*  21   68:invokevirtual   #597 <Method boolean al.d(int)>
	//*  22   71:ifeq            184
		{
			m.a();
	//   23   74:aload_0         
	//   24   75:getfield        #361 <Field p m>
	//   25   78:invokevirtual   #365 <Method void android.support.v4.widget.p.a()>
			n.a();
	//   26   81:aload_0         
	//   27   82:getfield        #367 <Field p n>
	//   28   85:invokevirtual   #365 <Method void android.support.v4.widget.p.a()>
		}
		break; /* Loop/switch isn't completed */
	//   29   88:goto            184
_L3:
		a(true);
	//   30   91:aload_0         
	//   31   92:iconst_1        
	//   32   93:invokevirtual   #402 <Method void a(boolean)>
		v = false;
	//   33   96:aload_0         
	//   34   97:iconst_0        
	//   35   98:putfield        #599 <Field boolean v>
		w = false;
	//   36  101:aload_0         
	//   37  102:iconst_0        
	//   38  103:putfield        #601 <Field boolean w>
		break; /* Loop/switch isn't completed */
	//   39  106:goto            184
_L2:
		float f1;
		float f2;
		f1 = motionevent.getX();
	//   40  109:aload_1         
	//   41  110:invokevirtual   #465 <Method float MotionEvent.getX()>
	//   42  113:fstore_2        
		f2 = motionevent.getY();
	//   43  114:aload_1         
	//   44  115:invokevirtual   #468 <Method float MotionEvent.getY()>
	//   45  118:fstore_3        
		z = f1;
	//   46  119:aload_0         
	//   47  120:fload_2         
	//   48  121:putfield        #603 <Field float z>
		A = f2;
	//   49  124:aload_0         
	//   50  125:fload_3         
	//   51  126:putfield        #605 <Field float A>
		if(i <= 0.0F) goto _L6; else goto _L5
	//   52  129:aload_0         
	//   53  130:getfield        #448 <Field float i>
	//   54  133:fconst_0        
	//   55  134:fcmpl           
	//   56  135:ifle            168
_L5:
		motionevent = ((MotionEvent) (k.d((int)f1, (int)f2)));
	//   57  138:aload_0         
	//   58  139:getfield        #272 <Field al k>
	//   59  142:fload_2         
	//   60  143:f2i             
	//   61  144:fload_3         
	//   62  145:f2i             
	//   63  146:invokevirtual   #608 <Method View al.d(int, int)>
	//   64  149:astore_1        
		if(motionevent == null || !f(((View) (motionevent)))) goto _L6; else goto _L7
	//   65  150:aload_1         
	//   66  151:ifnull          168
	//   67  154:aload_0         
	//   68  155:aload_1         
	//   69  156:invokevirtual   #472 <Method boolean f(View)>
	//   70  159:ifeq            168
_L7:
		boolean flag = true;
	//   71  162:iconst_1        
	//   72  163:istore          4
		  goto _L8
	//*  73  165:goto            171
_L6:
		flag = false;
	//   74  168:iconst_0        
	//   75  169:istore          4
_L8:
		v = false;
	//   76  171:aload_0         
	//   77  172:iconst_0        
	//   78  173:putfield        #599 <Field boolean v>
		w = false;
	//   79  176:aload_0         
	//   80  177:iconst_0        
	//   81  178:putfield        #601 <Field boolean w>
		break MISSING_BLOCK_LABEL_187;
	//   82  181:goto            187
		flag = false;
	//   83  184:iconst_0        
	//   84  185:istore          4
		boolean flag1 = flag2;
	//   85  187:iload           6
	//   86  189:istore          5
		if(!(flag3 | flag4))
	//*  87  191:iload           7
	//*  88  193:iload           8
	//*  89  195:ior             
	//*  90  196:ifne            231
		{
			flag1 = flag2;
	//   91  199:iload           6
	//   92  201:istore          5
			if(!flag)
	//*  93  203:iload           4
	//*  94  205:ifne            231
			{
				flag1 = flag2;
	//   95  208:iload           6
	//   96  210:istore          5
				if(!g())
	//*  97  212:aload_0         
	//*  98  213:invokespecial   #610 <Method boolean g()>
	//*  99  216:ifne            231
				{
					if(w)
	//* 100  219:aload_0         
	//* 101  220:getfield        #601 <Field boolean w>
	//* 102  223:ifeq            228
						return true;
	//  103  226:iconst_1        
	//  104  227:ireturn         
					flag1 = false;
	//  105  228:iconst_0        
	//  106  229:istore          5
				}
			}
		}
		return flag1;
	//  107  231:iload           5
	//  108  233:ireturn         
	}

	public boolean onKeyDown(int i1, KeyEvent keyevent)
	{
		if(i1 == 4 && h())
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          18
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #614 <Method boolean h()>
	//*   5    9:ifeq            18
		{
			keyevent.startTracking();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #619 <Method void KeyEvent.startTracking()>
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		} else
		{
			return super.onKeyDown(i1, keyevent);
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:aload_2         
	//   13   21:invokespecial   #621 <Method boolean ViewGroup.onKeyDown(int, KeyEvent)>
	//   14   24:ireturn         
		}
	}

	public boolean onKeyUp(int i1, KeyEvent keyevent)
	{
		if(i1 == 4)
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          34
		{
			keyevent = ((KeyEvent) (c()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #214 <Method View c()>
	//    5    9:astore_2        
			if(keyevent != null && a(((View) (keyevent))) == 0)
	//*   6   10:aload_2         
	//*   7   11:ifnull          26
	//*   8   14:aload_0         
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #624 <Method int a(View)>
	//*  11   19:ifne            26
				b();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #626 <Method void b()>
			return keyevent != null;
	//   14   26:aload_2         
	//   15   27:ifnull          32
	//   16   30:iconst_1        
	//   17   31:ireturn         
	//   18   32:iconst_0        
	//   19   33:ireturn         
		} else
		{
			return super.onKeyUp(i1, keyevent);
	//   20   34:aload_0         
	//   21   35:iload_1         
	//   22   36:aload_2         
	//   23   37:invokespecial   #628 <Method boolean ViewGroup.onKeyUp(int, KeyEvent)>
	//   24   40:ireturn         
		}
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		p = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #632 <Field boolean p>
		int k2 = k1 - i1;
	//    3    5:iload           4
	//    4    7:iload_2         
	//    5    8:isub            
	//    6    9:istore          10
		int l2 = getChildCount();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #169 <Method int getChildCount()>
	//    9   15:istore          11
		for(k1 = 0; k1 < l2; k1++)
	//*  10   17:iconst_0        
	//*  11   18:istore          4
	//*  12   20:iload           4
	//*  13   22:iload           11
	//*  14   24:icmpge          442
		{
			View view = getChildAt(k1);
	//   15   27:aload_0         
	//   16   28:iload           4
	//   17   30:invokevirtual   #173 <Method View getChildAt(int)>
	//   18   33:astore          15
			if(view.getVisibility() == 8)
	//*  19   35:aload           15
	//*  20   37:invokevirtual   #386 <Method int View.getVisibility()>
	//*  21   40:bipush          8
	//*  22   42:icmpne          48
				continue;
	//   23   45:goto            433
			n n1 = (n)view.getLayoutParams();
	//   24   48:aload           15
	//   25   50:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   53:checkcast       #209 <Class n>
	//   27   56:astore          16
			if(f(view))
	//*  28   58:aload_0         
	//*  29   59:aload           15
	//*  30   61:invokevirtual   #472 <Method boolean f(View)>
	//*  31   64:ifeq            107
			{
				view.layout(n1.leftMargin, n1.topMargin, n1.leftMargin + view.getMeasuredWidth(), n1.topMargin + view.getMeasuredHeight());
	//   32   67:aload           15
	//   33   69:aload           16
	//   34   71:getfield        #635 <Field int n.leftMargin>
	//   35   74:aload           16
	//   36   76:getfield        #638 <Field int n.topMargin>
	//   37   79:aload           16
	//   38   81:getfield        #635 <Field int n.leftMargin>
	//   39   84:aload           15
	//   40   86:invokevirtual   #641 <Method int View.getMeasuredWidth()>
	//   41   89:iadd            
	//   42   90:aload           16
	//   43   92:getfield        #638 <Field int n.topMargin>
	//   44   95:aload           15
	//   45   97:invokevirtual   #644 <Method int View.getMeasuredHeight()>
	//   46  100:iadd            
	//   47  101:invokevirtual   #647 <Method void View.layout(int, int, int, int)>
				continue;
	//   48  104:goto            433
			}
			int i3 = view.getMeasuredWidth();
	//   49  107:aload           15
	//   50  109:invokevirtual   #641 <Method int View.getMeasuredWidth()>
	//   51  112:istore          12
			int j3 = view.getMeasuredHeight();
	//   52  114:aload           15
	//   53  116:invokevirtual   #644 <Method int View.getMeasuredHeight()>
	//   54  119:istore          13
			float f1;
			int i2;
			if(a(view, 3))
	//*  55  121:aload_0         
	//*  56  122:aload           15
	//*  57  124:iconst_3        
	//*  58  125:invokevirtual   #339 <Method boolean a(View, int)>
	//*  59  128:ifeq            167
			{
				i1 = -i3;
	//   60  131:iload           12
	//   61  133:ineg            
	//   62  134:istore_2        
				f1 = i3;
	//   63  135:iload           12
	//   64  137:i2f             
	//   65  138:fstore          6
				i2 = i1 + (int)(n1.b * f1);
	//   66  140:iload_2         
	//   67  141:aload           16
	//   68  143:getfield        #290 <Field float n.b>
	//   69  146:fload           6
	//   70  148:fmul            
	//   71  149:f2i             
	//   72  150:iadd            
	//   73  151:istore          7
				f1 = (float)(i3 + i2) / f1;
	//   74  153:iload           12
	//   75  155:iload           7
	//   76  157:iadd            
	//   77  158:i2f             
	//   78  159:fload           6
	//   79  161:fdiv            
	//   80  162:fstore          6
			} else
	//*  81  164:goto            197
			{
				f1 = i3;
	//   82  167:iload           12
	//   83  169:i2f             
	//   84  170:fstore          6
				i2 = k2 - (int)(n1.b * f1);
	//   85  172:iload           10
	//   86  174:aload           16
	//   87  176:getfield        #290 <Field float n.b>
	//   88  179:fload           6
	//   89  181:fmul            
	//   90  182:f2i             
	//   91  183:isub            
	//   92  184:istore          7
				f1 = (float)(k2 - i2) / f1;
	//   93  186:iload           10
	//   94  188:iload           7
	//   95  190:isub            
	//   96  191:i2f             
	//   97  192:fload           6
	//   98  194:fdiv            
	//   99  195:fstore          6
			}
			boolean flag1;
			if(f1 != n1.b)
	//* 100  197:fload           6
	//* 101  199:aload           16
	//* 102  201:getfield        #290 <Field float n.b>
	//* 103  204:fcmpl           
	//* 104  205:ifeq            214
				flag1 = true;
	//  105  208:iconst_1        
	//  106  209:istore          8
			else
	//* 107  211:goto            217
				flag1 = false;
	//  108  214:iconst_0        
	//  109  215:istore          8
			i1 = n1.a & 0x70;
	//  110  217:aload           16
	//  111  219:getfield        #237 <Field int android.support.v4.widget.n.a>
	//  112  222:bipush          112
	//  113  224:iand            
	//  114  225:istore_2        
			if(i1 != 16)
	//* 115  226:iload_2         
	//* 116  227:bipush          16
	//* 117  229:icmpeq          306
			{
				if(i1 != 80)
	//* 118  232:iload_2         
	//* 119  233:bipush          80
	//* 120  235:icmpeq          266
				{
					view.layout(i2, n1.topMargin, i3 + i2, n1.topMargin + j3);
	//  121  238:aload           15
	//  122  240:iload           7
	//  123  242:aload           16
	//  124  244:getfield        #638 <Field int n.topMargin>
	//  125  247:iload           12
	//  126  249:iload           7
	//  127  251:iadd            
	//  128  252:aload           16
	//  129  254:getfield        #638 <Field int n.topMargin>
	//  130  257:iload           13
	//  131  259:iadd            
	//  132  260:invokevirtual   #647 <Method void View.layout(int, int, int, int)>
				} else
	//* 133  263:goto            388
				{
					i1 = l1 - j1;
	//  134  266:iload           5
	//  135  268:iload_3         
	//  136  269:isub            
	//  137  270:istore_2        
					view.layout(i2, i1 - n1.bottomMargin - view.getMeasuredHeight(), i3 + i2, i1 - n1.bottomMargin);
	//  138  271:aload           15
	//  139  273:iload           7
	//  140  275:iload_2         
	//  141  276:aload           16
	//  142  278:getfield        #650 <Field int n.bottomMargin>
	//  143  281:isub            
	//  144  282:aload           15
	//  145  284:invokevirtual   #644 <Method int View.getMeasuredHeight()>
	//  146  287:isub            
	//  147  288:iload           12
	//  148  290:iload           7
	//  149  292:iadd            
	//  150  293:iload_2         
	//  151  294:aload           16
	//  152  296:getfield        #650 <Field int n.bottomMargin>
	//  153  299:isub            
	//  154  300:invokevirtual   #647 <Method void View.layout(int, int, int, int)>
				}
			} else
	//* 155  303:goto            388
			{
				int k3 = l1 - j1;
	//  156  306:iload           5
	//  157  308:iload_3         
	//  158  309:isub            
	//  159  310:istore          14
				int j2 = (k3 - j3) / 2;
	//  160  312:iload           14
	//  161  314:iload           13
	//  162  316:isub            
	//  163  317:iconst_2        
	//  164  318:idiv            
	//  165  319:istore          9
				if(j2 < n1.topMargin)
	//* 166  321:iload           9
	//* 167  323:aload           16
	//* 168  325:getfield        #638 <Field int n.topMargin>
	//* 169  328:icmpge          340
				{
					i1 = n1.topMargin;
	//  170  331:aload           16
	//  171  333:getfield        #638 <Field int n.topMargin>
	//  172  336:istore_2        
				} else
	//* 173  337:goto            371
				{
					i1 = j2;
	//  174  340:iload           9
	//  175  342:istore_2        
					if(j2 + j3 > k3 - n1.bottomMargin)
	//* 176  343:iload           9
	//* 177  345:iload           13
	//* 178  347:iadd            
	//* 179  348:iload           14
	//* 180  350:aload           16
	//* 181  352:getfield        #650 <Field int n.bottomMargin>
	//* 182  355:isub            
	//* 183  356:icmple          371
						i1 = k3 - n1.bottomMargin - j3;
	//  184  359:iload           14
	//  185  361:aload           16
	//  186  363:getfield        #650 <Field int n.bottomMargin>
	//  187  366:isub            
	//  188  367:iload           13
	//  189  369:isub            
	//  190  370:istore_2        
				}
				view.layout(i2, i1, i3 + i2, j3 + i1);
	//  191  371:aload           15
	//  192  373:iload           7
	//  193  375:iload_2         
	//  194  376:iload           12
	//  195  378:iload           7
	//  196  380:iadd            
	//  197  381:iload           13
	//  198  383:iload_2         
	//  199  384:iadd            
	//  200  385:invokevirtual   #647 <Method void View.layout(int, int, int, int)>
			}
			if(flag1)
	//* 201  388:iload           8
	//* 202  390:ifeq            401
				b(view, f1);
	//  203  393:aload_0         
	//  204  394:aload           15
	//  205  396:fload           6
	//  206  398:invokevirtual   #435 <Method void b(View, float)>
			if(n1.b > 0.0F)
	//* 207  401:aload           16
	//* 208  403:getfield        #290 <Field float n.b>
	//* 209  406:fconst_0        
	//* 210  407:fcmpl           
	//* 211  408:ifle            416
				i1 = 0;
	//  212  411:iconst_0        
	//  213  412:istore_2        
			else
	//* 214  413:goto            418
				i1 = 4;
	//  215  416:iconst_4        
	//  216  417:istore_2        
			if(view.getVisibility() != i1)
	//* 217  418:aload           15
	//* 218  420:invokevirtual   #386 <Method int View.getVisibility()>
	//* 219  423:iload_2         
	//* 220  424:icmpeq          433
				view.setVisibility(i1);
	//  221  427:aload           15
	//  222  429:iload_2         
	//  223  430:invokevirtual   #353 <Method void View.setVisibility(int)>
		}

	//  224  433:iload           4
	//  225  435:iconst_1        
	//  226  436:iadd            
	//  227  437:istore          4
	//* 228  439:goto            20
		p = false;
	//  229  442:aload_0         
	//  230  443:iconst_0        
	//  231  444:putfield        #632 <Field boolean p>
		q = false;
	//  232  447:aload_0         
	//  233  448:iconst_0        
	//  234  449:putfield        #334 <Field boolean q>
	//  235  452:return          
	}

	protected void onMeasure(int i1, int j1)
	{
label0:
		{
			int i2;
			int j2;
label1:
			{
				int l2 = android.view.View.MeasureSpec.getMode(i1);
	//    0    0:iload_1         
	//    1    1:invokestatic    #659 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          10
				int k2 = android.view.View.MeasureSpec.getMode(j1);
	//    3    6:iload_2         
	//    4    7:invokestatic    #659 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    5   10:istore          9
				int k1 = android.view.View.MeasureSpec.getSize(i1);
	//    6   12:iload_1         
	//    7   13:invokestatic    #662 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    8   16:istore          5
				int l1 = android.view.View.MeasureSpec.getSize(j1);
	//    9   18:iload_2         
	//   10   19:invokestatic    #662 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   11   22:istore          6
				if(l2 == 0x40000000)
	//*  12   24:iload           10
	//*  13   26:ldc2            #663 <Int 0x40000000>
	//*  14   29:icmpne          48
				{
					i2 = k1;
	//   15   32:iload           5
	//   16   34:istore          7
					j2 = l1;
	//   17   36:iload           6
	//   18   38:istore          8
					if(k2 == 0x40000000)
						break label1;
	//   19   40:iload           9
	//   20   42:ldc2            #663 <Int 0x40000000>
	//   21   45:icmpeq          117
				}
				if(!isInEditMode())
					break label0;
	//   22   48:aload_0         
	//   23   49:invokevirtual   #666 <Method boolean isInEditMode()>
	//   24   52:ifeq            820
				if(l2 != 0x80000000 && l2 == 0)
	//*  25   55:iload           10
	//*  26   57:ldc2            #667 <Int 0x80000000>
	//*  27   60:icmpne          66
	//*  28   63:goto            76
	//*  29   66:iload           10
	//*  30   68:ifne            76
					k1 = 300;
	//   31   71:sipush          300
	//   32   74:istore          5
				if(k2 == 0x80000000)
	//*  33   76:iload           9
	//*  34   78:ldc2            #667 <Int 0x80000000>
	//*  35   81:icmpne          95
				{
					i2 = k1;
	//   36   84:iload           5
	//   37   86:istore          7
					j2 = l1;
	//   38   88:iload           6
	//   39   90:istore          8
				} else
	//*  40   92:goto            117
				{
					i2 = k1;
	//   41   95:iload           5
	//   42   97:istore          7
					j2 = l1;
	//   43   99:iload           6
	//   44  101:istore          8
					if(k2 == 0)
	//*  45  103:iload           9
	//*  46  105:ifne            117
					{
						j2 = 300;
	//   47  108:sipush          300
	//   48  111:istore          8
						i2 = k1;
	//   49  113:iload           5
	//   50  115:istore          7
					}
				}
			}
label2:
			{
				setMeasuredDimension(i2, j2);
	//   51  117:aload_0         
	//   52  118:iload           7
	//   53  120:iload           8
	//   54  122:invokevirtual   #670 <Method void setMeasuredDimension(int, int)>
				boolean flag2;
				if(E != null && ac.q(((View) (this))))
	//*  55  125:aload_0         
	//*  56  126:getfield        #584 <Field Object E>
	//*  57  129:ifnull          145
	//*  58  132:aload_0         
	//*  59  133:invokestatic    #672 <Method boolean ac.q(View)>
	//*  60  136:ifeq            145
					flag2 = true;
	//   61  139:iconst_1        
	//   62  140:istore          9
				else
	//*  63  142:goto            148
					flag2 = false;
	//   64  145:iconst_0        
	//   65  146:istore          9
				int k3 = ac.f(((View) (this)));
	//   66  148:aload_0         
	//   67  149:invokestatic    #193 <Method int ac.f(View)>
	//   68  152:istore          12
				int l3 = getChildCount();
	//   69  154:aload_0         
	//   70  155:invokevirtual   #169 <Method int getChildCount()>
	//   71  158:istore          13
				int i3 = 0;
	//   72  160:iconst_0        
	//   73  161:istore          10
				boolean flag1 = false;
	//   74  163:iconst_0        
	//   75  164:istore          6
				boolean flag = false;
	//   76  166:iconst_0        
	//   77  167:istore          5
				View view;
				do
				{
					if(i3 >= l3)
						break label2;
	//   78  169:iload           10
	//   79  171:iload           13
	//   80  173:icmpge          819
					view = getChildAt(i3);
	//   81  176:aload_0         
	//   82  177:iload           10
	//   83  179:invokevirtual   #173 <Method View getChildAt(int)>
	//   84  182:astore          17
					if(view.getVisibility() != 8)
	//*  85  184:aload           17
	//*  86  186:invokevirtual   #386 <Method int View.getVisibility()>
	//*  87  189:bipush          8
	//*  88  191:icmpne          197
	//*  89  194:goto            501
					{
						n n1 = (n)view.getLayoutParams();
	//   90  197:aload           17
	//   91  199:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   92  202:checkcast       #209 <Class n>
	//   93  205:astore          18
						if(flag2)
	//*  94  207:iload           9
	//*  95  209:ifeq            447
						{
							int j3 = android.support.v4.view.l.a(n1.a, k3);
	//   96  212:aload           18
	//   97  214:getfield        #237 <Field int android.support.v4.widget.n.a>
	//   98  217:iload           12
	//   99  219:invokestatic    #270 <Method int l.a(int, int)>
	//  100  222:istore          11
							if(ac.q(view))
	//* 101  224:aload           17
	//* 102  226:invokestatic    #672 <Method boolean ac.q(View)>
	//* 103  229:ifeq            325
							{
								if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 104  232:getstatic       #69  <Field int android.os.Build$VERSION.SDK_INT>
	//* 105  235:bipush          21
	//* 106  237:icmplt          447
								{
									WindowInsets windowinsets2 = (WindowInsets)E;
	//  107  240:aload_0         
	//  108  241:getfield        #584 <Field Object E>
	//  109  244:checkcast       #586 <Class WindowInsets>
	//  110  247:astore          16
									WindowInsets windowinsets;
									if(j3 == 3)
	//* 111  249:iload           11
	//* 112  251:iconst_3        
	//* 113  252:icmpne          281
									{
										windowinsets = windowinsets2.replaceSystemWindowInsets(windowinsets2.getSystemWindowInsetLeft(), windowinsets2.getSystemWindowInsetTop(), 0, windowinsets2.getSystemWindowInsetBottom());
	//  114  255:aload           16
	//  115  257:aload           16
	//  116  259:invokevirtual   #675 <Method int WindowInsets.getSystemWindowInsetLeft()>
	//  117  262:aload           16
	//  118  264:invokevirtual   #589 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  119  267:iconst_0        
	//  120  268:aload           16
	//  121  270:invokevirtual   #678 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  122  273:invokevirtual   #682 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  123  276:astore          15
									} else
	//* 124  278:goto            314
									{
										windowinsets = windowinsets2;
	//  125  281:aload           16
	//  126  283:astore          15
										if(j3 == 5)
	//* 127  285:iload           11
	//* 128  287:iconst_5        
	//* 129  288:icmpne          314
											windowinsets = windowinsets2.replaceSystemWindowInsets(0, windowinsets2.getSystemWindowInsetTop(), windowinsets2.getSystemWindowInsetRight(), windowinsets2.getSystemWindowInsetBottom());
	//  130  291:aload           16
	//  131  293:iconst_0        
	//  132  294:aload           16
	//  133  296:invokevirtual   #589 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  134  299:aload           16
	//  135  301:invokevirtual   #685 <Method int WindowInsets.getSystemWindowInsetRight()>
	//  136  304:aload           16
	//  137  306:invokevirtual   #678 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  138  309:invokevirtual   #682 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  139  312:astore          15
									}
									view.dispatchApplyWindowInsets(windowinsets);
	//  140  314:aload           17
	//  141  316:aload           15
	//  142  318:invokevirtual   #689 <Method WindowInsets View.dispatchApplyWindowInsets(WindowInsets)>
	//  143  321:pop             
								}
							} else
	//* 144  322:goto            447
							if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 145  325:getstatic       #69  <Field int android.os.Build$VERSION.SDK_INT>
	//* 146  328:bipush          21
	//* 147  330:icmplt          447
							{
								WindowInsets windowinsets3 = (WindowInsets)E;
	//  148  333:aload_0         
	//  149  334:getfield        #584 <Field Object E>
	//  150  337:checkcast       #586 <Class WindowInsets>
	//  151  340:astore          16
								WindowInsets windowinsets1;
								if(j3 == 3)
	//* 152  342:iload           11
	//* 153  344:iconst_3        
	//* 154  345:icmpne          374
								{
									windowinsets1 = windowinsets3.replaceSystemWindowInsets(windowinsets3.getSystemWindowInsetLeft(), windowinsets3.getSystemWindowInsetTop(), 0, windowinsets3.getSystemWindowInsetBottom());
	//  155  348:aload           16
	//  156  350:aload           16
	//  157  352:invokevirtual   #675 <Method int WindowInsets.getSystemWindowInsetLeft()>
	//  158  355:aload           16
	//  159  357:invokevirtual   #589 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  160  360:iconst_0        
	//  161  361:aload           16
	//  162  363:invokevirtual   #678 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  163  366:invokevirtual   #682 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  164  369:astore          15
								} else
	//* 165  371:goto            407
								{
									windowinsets1 = windowinsets3;
	//  166  374:aload           16
	//  167  376:astore          15
									if(j3 == 5)
	//* 168  378:iload           11
	//* 169  380:iconst_5        
	//* 170  381:icmpne          407
										windowinsets1 = windowinsets3.replaceSystemWindowInsets(0, windowinsets3.getSystemWindowInsetTop(), windowinsets3.getSystemWindowInsetRight(), windowinsets3.getSystemWindowInsetBottom());
	//  171  384:aload           16
	//  172  386:iconst_0        
	//  173  387:aload           16
	//  174  389:invokevirtual   #589 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  175  392:aload           16
	//  176  394:invokevirtual   #685 <Method int WindowInsets.getSystemWindowInsetRight()>
	//  177  397:aload           16
	//  178  399:invokevirtual   #678 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  179  402:invokevirtual   #682 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  180  405:astore          15
								}
								n1.leftMargin = windowinsets1.getSystemWindowInsetLeft();
	//  181  407:aload           18
	//  182  409:aload           15
	//  183  411:invokevirtual   #675 <Method int WindowInsets.getSystemWindowInsetLeft()>
	//  184  414:putfield        #635 <Field int n.leftMargin>
								n1.topMargin = windowinsets1.getSystemWindowInsetTop();
	//  185  417:aload           18
	//  186  419:aload           15
	//  187  421:invokevirtual   #589 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  188  424:putfield        #638 <Field int n.topMargin>
								n1.rightMargin = windowinsets1.getSystemWindowInsetRight();
	//  189  427:aload           18
	//  190  429:aload           15
	//  191  431:invokevirtual   #685 <Method int WindowInsets.getSystemWindowInsetRight()>
	//  192  434:putfield        #692 <Field int n.rightMargin>
								n1.bottomMargin = windowinsets1.getSystemWindowInsetBottom();
	//  193  437:aload           18
	//  194  439:aload           15
	//  195  441:invokevirtual   #678 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  196  444:putfield        #650 <Field int n.bottomMargin>
							}
						}
						if(f(view))
	//* 197  447:aload_0         
	//* 198  448:aload           17
	//* 199  450:invokevirtual   #472 <Method boolean f(View)>
	//* 200  453:ifeq            504
						{
							view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2 - n1.leftMargin - n1.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j2 - n1.topMargin - n1.bottomMargin, 0x40000000));
	//  201  456:aload           17
	//  202  458:iload           7
	//  203  460:aload           18
	//  204  462:getfield        #635 <Field int n.leftMargin>
	//  205  465:isub            
	//  206  466:aload           18
	//  207  468:getfield        #692 <Field int n.rightMargin>
	//  208  471:isub            
	//  209  472:ldc2            #663 <Int 0x40000000>
	//  210  475:invokestatic    #695 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  211  478:iload           8
	//  212  480:aload           18
	//  213  482:getfield        #638 <Field int n.topMargin>
	//  214  485:isub            
	//  215  486:aload           18
	//  216  488:getfield        #650 <Field int n.bottomMargin>
	//  217  491:isub            
	//  218  492:ldc2            #663 <Int 0x40000000>
	//  219  495:invokestatic    #695 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  220  498:invokevirtual   #698 <Method void View.measure(int, int)>
						} else
	//* 221  501:goto            736
						{
							if(!g(view))
								break;
	//  222  504:aload_0         
	//  223  505:aload           17
	//  224  507:invokevirtual   #176 <Method boolean g(View)>
	//  225  510:ifeq            745
							if(d)
	//* 226  513:getstatic       #73  <Field boolean d>
	//* 227  516:ifeq            545
							{
								float f1 = ac.m(view);
	//  228  519:aload           17
	//  229  521:invokestatic    #700 <Method float ac.m(View)>
	//  230  524:fstore_3        
								float f2 = f;
	//  231  525:aload_0         
	//  232  526:getfield        #568 <Field float f>
	//  233  529:fstore          4
								if(f1 != f2)
	//* 234  531:fload_3         
	//* 235  532:fload           4
	//* 236  534:fcmpl           
	//* 237  535:ifeq            545
									ac.a(view, f2);
	//  238  538:aload           17
	//  239  540:fload           4
	//  240  542:invokestatic    #701 <Method void ac.a(View, float)>
							}
							int i4 = e(view) & 7;
	//  241  545:aload_0         
	//  242  546:aload           17
	//  243  548:invokevirtual   #368 <Method int e(View)>
	//  244  551:bipush          7
	//  245  553:iand            
	//  246  554:istore          14
							boolean flag3;
							if(i4 == 3)
	//* 247  556:iload           14
	//* 248  558:iconst_3        
	//* 249  559:icmpne          568
								flag3 = true;
	//  250  562:iconst_1        
	//  251  563:istore          11
							else
	//* 252  565:goto            571
								flag3 = false;
	//  253  568:iconst_0        
	//  254  569:istore          11
							if(flag3 && flag1 || !flag3 && flag)
	//* 255  571:iload           11
	//* 256  573:ifeq            581
	//* 257  576:iload           6
	//* 258  578:ifne            594
	//* 259  581:iload           11
	//* 260  583:ifne            672
	//* 261  586:iload           5
	//* 262  588:ifne            594
	//* 263  591:goto            672
							{
								StringBuilder stringbuilder = new StringBuilder();
	//  264  594:new             #241 <Class StringBuilder>
	//  265  597:dup             
	//  266  598:invokespecial   #242 <Method void StringBuilder()>
	//  267  601:astore          15
								stringbuilder.append("Child drawer has absolute gravity ");
	//  268  603:aload           15
	//  269  605:ldc2            #703 <String "Child drawer has absolute gravity ">
	//  270  608:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  271  611:pop             
								stringbuilder.append(c(i4));
	//  272  612:aload           15
	//  273  614:iload           14
	//  274  616:invokestatic    #320 <Method String c(int)>
	//  275  619:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  276  622:pop             
								stringbuilder.append(" but this ");
	//  277  623:aload           15
	//  278  625:ldc2            #705 <String " but this ">
	//  279  628:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  280  631:pop             
								stringbuilder.append("DrawerLayout");
	//  281  632:aload           15
	//  282  634:ldc2            #707 <String "DrawerLayout">
	//  283  637:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  284  640:pop             
								stringbuilder.append(" already has a ");
	//  285  641:aload           15
	//  286  643:ldc2            #709 <String " already has a ">
	//  287  646:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  288  649:pop             
								stringbuilder.append("drawer view along that edge");
	//  289  650:aload           15
	//  290  652:ldc2            #711 <String "drawer view along that edge">
	//  291  655:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  292  658:pop             
								throw new IllegalStateException(stringbuilder.toString());
	//  293  659:new             #713 <Class IllegalStateException>
	//  294  662:dup             
	//  295  663:aload           15
	//  296  665:invokevirtual   #259 <Method String StringBuilder.toString()>
	//  297  668:invokespecial   #714 <Method void IllegalStateException(String)>
	//  298  671:athrow          
							}
							if(flag3)
	//* 299  672:iload           11
	//* 300  674:ifeq            683
								flag1 = true;
	//  301  677:iconst_1        
	//  302  678:istore          6
							else
	//* 303  680:goto            686
								flag = true;
	//  304  683:iconst_1        
	//  305  684:istore          5
							view.measure(getChildMeasureSpec(i1, g + n1.leftMargin + n1.rightMargin, n1.width), getChildMeasureSpec(j1, n1.topMargin + n1.bottomMargin, n1.height));
	//  306  686:aload           17
	//  307  688:iload_1         
	//  308  689:aload_0         
	//  309  690:getfield        #716 <Field int g>
	//  310  693:aload           18
	//  311  695:getfield        #635 <Field int n.leftMargin>
	//  312  698:iadd            
	//  313  699:aload           18
	//  314  701:getfield        #692 <Field int n.rightMargin>
	//  315  704:iadd            
	//  316  705:aload           18
	//  317  707:getfield        #719 <Field int n.width>
	//  318  710:invokestatic    #723 <Method int getChildMeasureSpec(int, int, int)>
	//  319  713:iload_2         
	//  320  714:aload           18
	//  321  716:getfield        #638 <Field int n.topMargin>
	//  322  719:aload           18
	//  323  721:getfield        #650 <Field int n.bottomMargin>
	//  324  724:iadd            
	//  325  725:aload           18
	//  326  727:getfield        #726 <Field int n.height>
	//  327  730:invokestatic    #723 <Method int getChildMeasureSpec(int, int, int)>
	//  328  733:invokevirtual   #698 <Method void View.measure(int, int)>
						}
					}
					i3++;
	//  329  736:iload           10
	//  330  738:iconst_1        
	//  331  739:iadd            
	//  332  740:istore          10
				} while(true);
	//  333  742:goto            169
				StringBuilder stringbuilder1 = new StringBuilder();
	//  334  745:new             #241 <Class StringBuilder>
	//  335  748:dup             
	//  336  749:invokespecial   #242 <Method void StringBuilder()>
	//  337  752:astore          15
				stringbuilder1.append("Child ");
	//  338  754:aload           15
	//  339  756:ldc2            #728 <String "Child ">
	//  340  759:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  341  762:pop             
				stringbuilder1.append(((Object) (view)));
	//  342  763:aload           15
	//  343  765:aload           17
	//  344  767:invokevirtual   #251 <Method StringBuilder StringBuilder.append(Object)>
	//  345  770:pop             
				stringbuilder1.append(" at index ");
	//  346  771:aload           15
	//  347  773:ldc2            #730 <String " at index ">
	//  348  776:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  349  779:pop             
				stringbuilder1.append(i3);
	//  350  780:aload           15
	//  351  782:iload           10
	//  352  784:invokevirtual   #733 <Method StringBuilder StringBuilder.append(int)>
	//  353  787:pop             
				stringbuilder1.append(" does not have a valid layout_gravity - must be Gravity.LEFT, ");
	//  354  788:aload           15
	//  355  790:ldc2            #735 <String " does not have a valid layout_gravity - must be Gravity.LEFT, ">
	//  356  793:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  357  796:pop             
				stringbuilder1.append("Gravity.RIGHT or Gravity.NO_GRAVITY");
	//  358  797:aload           15
	//  359  799:ldc2            #737 <String "Gravity.RIGHT or Gravity.NO_GRAVITY">
	//  360  802:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  361  805:pop             
				throw new IllegalStateException(stringbuilder1.toString());
	//  362  806:new             #713 <Class IllegalStateException>
	//  363  809:dup             
	//  364  810:aload           15
	//  365  812:invokevirtual   #259 <Method String StringBuilder.toString()>
	//  366  815:invokespecial   #714 <Method void IllegalStateException(String)>
	//  367  818:athrow          
			}
			return;
	//  368  819:return          
		}
		throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
	//  369  820:new             #255 <Class IllegalArgumentException>
	//  370  823:dup             
	//  371  824:ldc2            #739 <String "DrawerLayout must be measured with MeasureSpec.EXACTLY.">
	//  372  827:invokespecial   #262 <Method void IllegalArgumentException(String)>
	//  373  830:athrow          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #744 <Class DrawerLayout$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #746 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #744 <Class DrawerLayout$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #750 <Method Parcelable DrawerLayout$SavedState.getSuperState()>
	//   13   23:invokespecial   #746 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		if(((SavedState) (parcelable)).a != 0)
	//*  14   26:aload_1         
	//*  15   27:getfield        #751 <Field int android.support.v4.widget.DrawerLayout$SavedState.a>
	//*  16   30:ifeq            51
		{
			View view = b(((SavedState) (parcelable)).a);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:getfield        #751 <Field int android.support.v4.widget.DrawerLayout$SavedState.a>
	//   20   38:invokevirtual   #280 <Method View b(int)>
	//   21   41:astore_2        
			if(view != null)
	//*  22   42:aload_2         
	//*  23   43:ifnull          51
				h(view);
	//   24   46:aload_0         
	//   25   47:aload_2         
	//   26   48:invokevirtual   #283 <Method void h(View)>
		}
		if(((SavedState) (parcelable)).b != 3)
	//*  27   51:aload_1         
	//*  28   52:getfield        #753 <Field int DrawerLayout$SavedState.b>
	//*  29   55:iconst_3        
	//*  30   56:icmpeq          68
			a(((SavedState) (parcelable)).b, 3);
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:getfield        #753 <Field int DrawerLayout$SavedState.b>
	//   34   64:iconst_3        
	//   35   65:invokevirtual   #755 <Method void a(int, int)>
		if(((SavedState) (parcelable)).c != 3)
	//*  36   68:aload_1         
	//*  37   69:getfield        #757 <Field int android.support.v4.widget.DrawerLayout$SavedState.c>
	//*  38   72:iconst_3        
	//*  39   73:icmpeq          85
			a(((SavedState) (parcelable)).c, 5);
	//   40   76:aload_0         
	//   41   77:aload_1         
	//   42   78:getfield        #757 <Field int android.support.v4.widget.DrawerLayout$SavedState.c>
	//   43   81:iconst_5        
	//   44   82:invokevirtual   #755 <Method void a(int, int)>
		if(((SavedState) (parcelable)).d != 3)
	//*  45   85:aload_1         
	//*  46   86:getfield        #758 <Field int DrawerLayout$SavedState.d>
	//*  47   89:iconst_3        
	//*  48   90:icmpeq          103
			a(((SavedState) (parcelable)).d, 0x800003);
	//   49   93:aload_0         
	//   50   94:aload_1         
	//   51   95:getfield        #758 <Field int DrawerLayout$SavedState.d>
	//   52   98:ldc1            #226 <Int 0x800003>
	//   53  100:invokevirtual   #755 <Method void a(int, int)>
		if(((SavedState) (parcelable)).e != 3)
	//*  54  103:aload_1         
	//*  55  104:getfield        #760 <Field int DrawerLayout$SavedState.e>
	//*  56  107:iconst_3        
	//*  57  108:icmpeq          121
			a(((SavedState) (parcelable)).e, 0x800005);
	//   58  111:aload_0         
	//   59  112:aload_1         
	//   60  113:getfield        #760 <Field int DrawerLayout$SavedState.e>
	//   61  116:ldc1            #227 <Int 0x800005>
	//   62  118:invokevirtual   #755 <Method void a(int, int)>
	//   63  121:return          
	}

	public void onRtlPropertiesChanged(int i1)
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #763 <Method void d()>
	//    2    4:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate;
label0:
		{
			savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #744 <Class DrawerLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #766 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #768 <Method void DrawerLayout$SavedState(Parcelable)>
	//    5   11:astore          5
			int k1 = getChildCount();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #169 <Method int getChildCount()>
	//    8   17:istore          4
			int i1 = 0;
	//    9   19:iconst_0        
	//   10   20:istore_1        
			n n1;
			do
			{
				if(i1 >= k1)
					break label0;
	//   11   21:iload_1         
	//   12   22:iload           4
	//   13   24:icmpge          102
				n1 = (n)getChildAt(i1).getLayoutParams();
	//   14   27:aload_0         
	//   15   28:iload_1         
	//   16   29:invokevirtual   #173 <Method View getChildAt(int)>
	//   17   32:invokevirtual   #207 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   35:checkcast       #209 <Class n>
	//   19   38:astore          6
				int j1 = n1.d;
	//   20   40:aload           6
	//   21   42:getfield        #264 <Field int n.d>
	//   22   45:istore_2        
				boolean flag1 = true;
	//   23   46:iconst_1        
	//   24   47:istore_3        
				boolean flag;
				if(j1 == 1)
	//*  25   48:iload_2         
	//*  26   49:iconst_1        
	//*  27   50:icmpne          58
					flag = true;
	//   28   53:iconst_1        
	//   29   54:istore_2        
				else
	//*  30   55:goto            60
					flag = false;
	//   31   58:iconst_0        
	//   32   59:istore_2        
				if(n1.d != 2)
	//*  33   60:aload           6
	//*  34   62:getfield        #264 <Field int n.d>
	//*  35   65:iconst_2        
	//*  36   66:icmpne          72
	//*  37   69:goto            74
					flag1 = false;
	//   38   72:iconst_0        
	//   39   73:istore_3        
				if(flag || flag1)
	//*  40   74:iload_2         
	//*  41   75:ifne            92
	//*  42   78:iload_3         
	//*  43   79:ifeq            85
					break;
	//   44   82:goto            92
				i1++;
	//   45   85:iload_1         
	//   46   86:iconst_1        
	//   47   87:iadd            
	//   48   88:istore_1        
			} while(true);
	//   49   89:goto            21
			savedstate.a = n1.a;
	//   50   92:aload           5
	//   51   94:aload           6
	//   52   96:getfield        #237 <Field int android.support.v4.widget.n.a>
	//   53   99:putfield        #751 <Field int android.support.v4.widget.DrawerLayout$SavedState.a>
		}
		savedstate.b = r;
	//   54  102:aload           5
	//   55  104:aload_0         
	//   56  105:getfield        #233 <Field int r>
	//   57  108:putfield        #753 <Field int DrawerLayout$SavedState.b>
		savedstate.c = s;
	//   58  111:aload           5
	//   59  113:aload_0         
	//   60  114:getfield        #231 <Field int s>
	//   61  117:putfield        #757 <Field int android.support.v4.widget.DrawerLayout$SavedState.c>
		savedstate.d = t;
	//   62  120:aload           5
	//   63  122:aload_0         
	//   64  123:getfield        #235 <Field int t>
	//   65  126:putfield        #758 <Field int DrawerLayout$SavedState.d>
		savedstate.e = u;
	//   66  129:aload           5
	//   67  131:aload_0         
	//   68  132:getfield        #229 <Field int u>
	//   69  135:putfield        #760 <Field int DrawerLayout$SavedState.e>
		return ((Parcelable) (savedstate));
	//   70  138:aload           5
	//   71  140:areturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i1;
		k.b(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #272 <Field al k>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #772 <Method void al.b(MotionEvent)>
		l.b(motionevent);
	//    4    8:aload_0         
	//    5    9:getfield        #274 <Field al l>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #772 <Method void al.b(MotionEvent)>
		i1 = motionevent.getAction() & 0xff;
	//    8   16:aload_1         
	//    9   17:invokevirtual   #461 <Method int MotionEvent.getAction()>
	//   10   20:sipush          255
	//   11   23:iand            
	//   12   24:istore          4
		if(i1 == 3) goto _L2; else goto _L1
	//   13   26:iload           4
	//   14   28:iconst_3        
	//   15   29:icmpeq          210
_L1:
		i1;
	//   16   32:iload           4
		JVM INSTR tableswitch 0 1: default 56
	//	               0 178
	//	               1 58;
	//   17   34:tableswitch     0 1: default 56
	//	               0 178
	//	               1 58
		   goto _L3 _L4 _L5
_L3:
		return true;
	//   18   56:iconst_1        
	//   19   57:ireturn         
_L5:
		float f1;
		float f3;
		f3 = motionevent.getX();
	//   20   58:aload_1         
	//   21   59:invokevirtual   #465 <Method float MotionEvent.getX()>
	//   22   62:fstore_3        
		f1 = motionevent.getY();
	//   23   63:aload_1         
	//   24   64:invokevirtual   #468 <Method float MotionEvent.getY()>
	//   25   67:fstore_2        
		motionevent = ((MotionEvent) (k.d((int)f3, (int)f1)));
	//   26   68:aload_0         
	//   27   69:getfield        #272 <Field al k>
	//   28   72:fload_3         
	//   29   73:f2i             
	//   30   74:fload_2         
	//   31   75:f2i             
	//   32   76:invokevirtual   #608 <Method View al.d(int, int)>
	//   33   79:astore_1        
		if(motionevent == null || !f(((View) (motionevent)))) goto _L7; else goto _L6
	//   34   80:aload_1         
	//   35   81:ifnull          162
	//   36   84:aload_0         
	//   37   85:aload_1         
	//   38   86:invokevirtual   #472 <Method boolean f(View)>
	//   39   89:ifeq            162
_L6:
		f3 -= z;
	//   40   92:fload_3         
	//   41   93:aload_0         
	//   42   94:getfield        #603 <Field float z>
	//   43   97:fsub            
	//   44   98:fstore_3        
		f1 -= A;
	//   45   99:fload_2         
	//   46  100:aload_0         
	//   47  101:getfield        #605 <Field float A>
	//   48  104:fsub            
	//   49  105:fstore_2        
		i1 = k.d();
	//   50  106:aload_0         
	//   51  107:getfield        #272 <Field al k>
	//   52  110:invokevirtual   #774 <Method int al.d()>
	//   53  113:istore          4
		if(f3 * f3 + f1 * f1 >= (float)(i1 * i1)) goto _L7; else goto _L8
	//   54  115:fload_3         
	//   55  116:fload_3         
	//   56  117:fmul            
	//   57  118:fload_2         
	//   58  119:fload_2         
	//   59  120:fmul            
	//   60  121:fadd            
	//   61  122:iload           4
	//   62  124:iload           4
	//   63  126:imul            
	//   64  127:i2f             
	//   65  128:fcmpg           
	//   66  129:ifge            162
_L8:
		motionevent = ((MotionEvent) (a()));
	//   67  132:aload_0         
	//   68  133:invokevirtual   #395 <Method View a()>
	//   69  136:astore_1        
		if(motionevent == null) goto _L7; else goto _L9
	//   70  137:aload_1         
	//   71  138:ifnull          162
_L9:
		boolean flag;
		if(a(((View) (motionevent))) == 2)
	//*  72  141:aload_0         
	//*  73  142:aload_1         
	//*  74  143:invokevirtual   #624 <Method int a(View)>
	//*  75  146:iconst_2        
	//*  76  147:icmpne          156
			flag = true;
	//   77  150:iconst_1        
	//   78  151:istore          5
		else
	//*  79  153:goto            165
			flag = false;
	//   80  156:iconst_0        
	//   81  157:istore          5
		  goto _L10
	//*  82  159:goto            165
_L7:
		flag = true;
	//   83  162:iconst_1        
	//   84  163:istore          5
_L10:
		a(flag);
	//   85  165:aload_0         
	//   86  166:iload           5
	//   87  168:invokevirtual   #402 <Method void a(boolean)>
		v = false;
	//   88  171:aload_0         
	//   89  172:iconst_0        
	//   90  173:putfield        #599 <Field boolean v>
		return true;
	//   91  176:iconst_1        
	//   92  177:ireturn         
_L4:
		float f2 = motionevent.getX();
	//   93  178:aload_1         
	//   94  179:invokevirtual   #465 <Method float MotionEvent.getX()>
	//   95  182:fstore_2        
		float f4 = motionevent.getY();
	//   96  183:aload_1         
	//   97  184:invokevirtual   #468 <Method float MotionEvent.getY()>
	//   98  187:fstore_3        
		z = f2;
	//   99  188:aload_0         
	//  100  189:fload_2         
	//  101  190:putfield        #603 <Field float z>
		A = f4;
	//  102  193:aload_0         
	//  103  194:fload_3         
	//  104  195:putfield        #605 <Field float A>
		v = false;
	//  105  198:aload_0         
	//  106  199:iconst_0        
	//  107  200:putfield        #599 <Field boolean v>
		w = false;
	//  108  203:aload_0         
	//  109  204:iconst_0        
	//  110  205:putfield        #601 <Field boolean w>
		return true;
	//  111  208:iconst_1        
	//  112  209:ireturn         
_L2:
		a(true);
	//  113  210:aload_0         
	//  114  211:iconst_1        
	//  115  212:invokevirtual   #402 <Method void a(boolean)>
		v = false;
	//  116  215:aload_0         
	//  117  216:iconst_0        
	//  118  217:putfield        #599 <Field boolean v>
		w = false;
	//  119  220:aload_0         
	//  120  221:iconst_0        
	//  121  222:putfield        #601 <Field boolean w>
		return true;
	//  122  225:iconst_1        
	//  123  226:ireturn         
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		super.requestDisallowInterceptTouchEvent(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #777 <Method void ViewGroup.requestDisallowInterceptTouchEvent(boolean)>
		v = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #599 <Field boolean v>
		if(flag)
	//*   6   10:iload_1         
	//*   7   11:ifeq            19
			a(true);
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:invokevirtual   #402 <Method void a(boolean)>
	//   11   19:return          
	}

	public void requestLayout()
	{
		if(!p)
	//*   0    0:aload_0         
	//*   1    1:getfield        #632 <Field boolean p>
	//*   2    4:ifne            11
			super.requestLayout();
	//    3    7:aload_0         
	//    4    8:invokespecial   #780 <Method void ViewGroup.requestLayout()>
	//    5   11:return          
	}

	public void setDrawerElevation(float f1)
	{
		f = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #568 <Field float f>
		for(int i1 = 0; i1 < getChildCount(); i1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #169 <Method int getChildCount()>
	//*   8   12:icmpge          44
		{
			View view = getChildAt(i1);
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:invokevirtual   #173 <Method View getChildAt(int)>
	//   12   20:astore_3        
			if(g(view))
	//*  13   21:aload_0         
	//*  14   22:aload_3         
	//*  15   23:invokevirtual   #176 <Method boolean g(View)>
	//*  16   26:ifeq            37
				ac.a(view, f);
	//   17   29:aload_3         
	//   18   30:aload_0         
	//   19   31:getfield        #568 <Field float f>
	//   20   34:invokestatic    #701 <Method void ac.a(View, float)>
		}

	//   21   37:iload_2         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:istore_2        
	//*  25   41:goto            7
	//   26   44:return          
	}

	public void setDrawerListener(m m1)
	{
		m m2 = x;
	//    0    0:aload_0         
	//    1    1:getfield        #786 <Field m x>
	//    2    4:astore_2        
		if(m2 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			b(m2);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #788 <Method void b(m)>
		if(m1 != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          23
			a(m1);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #790 <Method void a(m)>
		x = m1;
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:putfield        #786 <Field m x>
	//   16   28:return          
	}

	public void setDrawerLockMode(int i1)
	{
		a(i1, 3);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #755 <Method void a(int, int)>
		a(i1, 5);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:iconst_5        
	//    7    9:invokevirtual   #755 <Method void a(int, int)>
	//    8   12:return          
	}

	public void setScrimColor(int i1)
	{
		h = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #502 <Field int h>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #356 <Method void invalidate()>
	//    5    9:return          
	}

	public void setStatusBarBackground(int i1)
	{
		Drawable drawable;
		if(i1 != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			drawable = android.support.v4.a.c.a(getContext(), i1);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #550 <Method android.content.Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #799 <Method Drawable c.a(android.content.Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		B = drawable;
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #571 <Field Drawable B>
		invalidate();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #356 <Method void invalidate()>
	//   15   27:return          
	}

	public void setStatusBarBackground(Drawable drawable)
	{
		B = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #571 <Field Drawable B>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #356 <Method void invalidate()>
	//    5    9:return          
	}

	public void setStatusBarBackgroundColor(int i1)
	{
		B = ((Drawable) (new ColorDrawable(i1)));
	//    0    0:aload_0         
	//    1    1:new             #803 <Class ColorDrawable>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #805 <Method void ColorDrawable(int)>
	//    5    9:putfield        #571 <Field Drawable B>
		invalidate();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #356 <Method void invalidate()>
	//    8   16:return          
	}

	static final int a[] = {
		0x10100b3
	};
	static final boolean b;
	private static final int c[] = {
		0x1010434
	};
	private static final boolean d;
	private float A;
	private Drawable B;
	private Drawable C;
	private Drawable D;
	private Object E;
	private boolean F;
	private Drawable G;
	private Drawable H;
	private Drawable I;
	private Drawable J;
	private final ArrayList K;
	private Rect L;
	private Matrix M;
	private final android.support.v4.widget.l e;
	private float f;
	private int g;
	private int h;
	private float i;
	private Paint j;
	private final al k;
	private final al l;
	private final p m;
	private final p n;
	private int o;
	private boolean p;
	private boolean q;
	private int r;
	private int s;
	private int t;
	private int u;
	private boolean v;
	private boolean w;
	private m x;
	private List y;
	private float z;

	static 
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
	//    2    2:iconst_1        
	//    3    3:newarray        int[]
	//    4    5:dup             
	//    5    6:iconst_0        
	//    6    7:ldc1            #59  <Int 0x1010434>
	//    7    9:iastore         
	//    8   10:putstatic       #61  <Field int[] c>
	//    9   13:iconst_1        
	//   10   14:newarray        int[]
	//   11   16:dup             
	//   12   17:iconst_0        
	//   13   18:ldc1            #62  <Int 0x10100b3>
	//   14   20:iastore         
	//   15   21:putstatic       #64  <Field int[] a>
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  16   24:getstatic       #69  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   27:bipush          19
	//*  18   29:icmplt          37
			flag = true;
	//   19   32:iconst_1        
	//   20   33:istore_0        
		else
	//*  21   34:goto            39
			flag = false;
	//   22   37:iconst_0        
	//   23   38:istore_0        
		b = flag;
	//   24   39:iload_0         
	//   25   40:putstatic       #71  <Field boolean b>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  26   43:getstatic       #69  <Field int android.os.Build$VERSION.SDK_INT>
	//*  27   46:bipush          21
	//*  28   48:icmplt          56
			flag = flag1;
	//   29   51:iload_1         
	//   30   52:istore_0        
		else
	//*  31   53:goto            58
			flag = false;
	//   32   56:iconst_0        
	//   33   57:istore_0        
		d = flag;
	//   34   58:iload_0         
	//   35   59:putstatic       #73  <Field boolean d>
	//*  36   62:return          
	}

	private class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i1)
		{
			super.writeToParcel(parcel, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #48  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(a);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #27  <Field int a>
		//    7   11:invokevirtual   #52  <Method void Parcel.writeInt(int)>
			parcel.writeInt(b);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #35  <Field int b>
		//   11   19:invokevirtual   #52  <Method void Parcel.writeInt(int)>
			parcel.writeInt(c);
		//   12   22:aload_1         
		//   13   23:aload_0         
		//   14   24:getfield        #37  <Field int c>
		//   15   27:invokevirtual   #52  <Method void Parcel.writeInt(int)>
			parcel.writeInt(d);
		//   16   30:aload_1         
		//   17   31:aload_0         
		//   18   32:getfield        #39  <Field int d>
		//   19   35:invokevirtual   #52  <Method void Parcel.writeInt(int)>
			parcel.writeInt(e);
		//   20   38:aload_1         
		//   21   39:aload_0         
		//   22   40:getfield        #41  <Field int e>
		//   23   43:invokevirtual   #52  <Method void Parcel.writeInt(int)>
		//   24   46:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new o();
		int a;
		int b;
		int c;
		int d;
		int e;

		static 
		{
		//    0    0:new             #16  <Class o>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void o()>
		//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #25  <Method void AbsSavedState(Parcel, ClassLoader)>
			a = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #27  <Field int a>
			a = parcel.readInt();
		//    7   11:aload_0         
		//    8   12:aload_1         
		//    9   13:invokevirtual   #33  <Method int Parcel.readInt()>
		//   10   16:putfield        #27  <Field int a>
			b = parcel.readInt();
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:invokevirtual   #33  <Method int Parcel.readInt()>
		//   14   24:putfield        #35  <Field int b>
			c = parcel.readInt();
		//   15   27:aload_0         
		//   16   28:aload_1         
		//   17   29:invokevirtual   #33  <Method int Parcel.readInt()>
		//   18   32:putfield        #37  <Field int c>
			d = parcel.readInt();
		//   19   35:aload_0         
		//   20   36:aload_1         
		//   21   37:invokevirtual   #33  <Method int Parcel.readInt()>
		//   22   40:putfield        #39  <Field int d>
			e = parcel.readInt();
		//   23   43:aload_0         
		//   24   44:aload_1         
		//   25   45:invokevirtual   #33  <Method int Parcel.readInt()>
		//   26   48:putfield        #41  <Field int e>
		//   27   51:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #44  <Method void AbsSavedState(Parcelable)>
			a = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #27  <Field int a>
		//    6   10:return          
		}
	}

}
