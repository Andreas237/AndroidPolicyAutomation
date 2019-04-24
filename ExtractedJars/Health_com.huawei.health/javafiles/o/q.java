// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.animation.*;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.*;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.view.View;

// Referenced classes of package o:
//			u, ah, z, y, 
//			l, o

public class q extends u
{
	static class e extends GradientDrawable
	{

		public boolean isStateful()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		e()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void GradientDrawable()>
		//    2    4:return          
		}
	}


	public q(ah ah1, z z1)
	{
		super(ah1, z1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void u(ah, z)>
	//    4    6:return          
	}

	public float a()
	{
		return l.getElevation();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ah l>
	//    2    4:invokevirtual   #28  <Method float ah.getElevation()>
	//    3    7:freturn         
	}

	void a(int i)
	{
		if(e instanceof RippleDrawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field Drawable e>
	//*   2    4:instanceof      #34  <Class RippleDrawable>
	//*   3    7:ifeq            25
		{
			((RippleDrawable)e).setColor(ColorStateList.valueOf(i));
	//    4   10:aload_0         
	//    5   11:getfield        #32  <Field Drawable e>
	//    6   14:checkcast       #34  <Class RippleDrawable>
	//    7   17:iload_1         
	//    8   18:invokestatic    #40  <Method ColorStateList ColorStateList.valueOf(int)>
	//    9   21:invokevirtual   #44  <Method void RippleDrawable.setColor(ColorStateList)>
			return;
	//   10   24:return          
		} else
		{
			super.a(i);
	//   11   25:aload_0         
	//   12   26:iload_1         
	//   13   27:invokespecial   #46  <Method void u.a(int)>
			return;
	//   14   30:return          
		}
	}

	void a(Rect rect)
	{
		if(n.e())
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field z n>
	//*   2    4:invokeinterface #56  <Method boolean z.e()>
	//*   3    9:ifeq            71
		{
			float f = n.d();
	//    4   12:aload_0         
	//    5   13:getfield        #51  <Field z n>
	//    6   16:invokeinterface #59  <Method float z.d()>
	//    7   21:fstore_2        
			float f1 = a() + this.i;
	//    8   22:aload_0         
	//    9   23:invokevirtual   #61  <Method float a()>
	//   10   26:aload_0         
	//   11   27:getfield        #65  <Field float i>
	//   12   30:fadd            
	//   13   31:fstore_3        
			int i = (int)Math.ceil(y.c(f1, f, false));
	//   14   32:fload_3         
	//   15   33:fload_2         
	//   16   34:iconst_0        
	//   17   35:invokestatic    #71  <Method float y.c(float, float, boolean)>
	//   18   38:f2d             
	//   19   39:invokestatic    #77  <Method double Math.ceil(double)>
	//   20   42:d2i             
	//   21   43:istore          4
			int j = (int)Math.ceil(y.d(f1, f, false));
	//   22   45:fload_3         
	//   23   46:fload_2         
	//   24   47:iconst_0        
	//   25   48:invokestatic    #79  <Method float y.d(float, float, boolean)>
	//   26   51:f2d             
	//   27   52:invokestatic    #77  <Method double Math.ceil(double)>
	//   28   55:d2i             
	//   29   56:istore          5
			rect.set(i, j, i, j);
	//   30   58:aload_1         
	//   31   59:iload           4
	//   32   61:iload           5
	//   33   63:iload           4
	//   34   65:iload           5
	//   35   67:invokevirtual   #85  <Method void Rect.set(int, int, int, int)>
			return;
	//   36   70:return          
		} else
		{
			rect.set(0, 0, 0, 0);
	//   37   71:aload_1         
	//   38   72:iconst_0        
	//   39   73:iconst_0        
	//   40   74:iconst_0        
	//   41   75:iconst_0        
	//   42   76:invokevirtual   #85  <Method void Rect.set(int, int, int, int)>
			return;
	//   43   79:return          
		}
	}

	void c()
	{
		b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method void b()>
	//    2    4:return          
	}

	void c(ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode, int i, int j)
	{
		c = DrawableCompat.wrap(((Drawable) (p())));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #94  <Method GradientDrawable p()>
	//    3    5:invokestatic    #100 <Method Drawable DrawableCompat.wrap(Drawable)>
	//    4    8:putfield        #102 <Field Drawable c>
		DrawableCompat.setTintList(c, colorstatelist);
	//    5   11:aload_0         
	//    6   12:getfield        #102 <Field Drawable c>
	//    7   15:aload_1         
	//    8   16:invokestatic    #106 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
		if(mode != null)
	//*   9   19:aload_2         
	//*  10   20:ifnull          31
			DrawableCompat.setTintMode(c, mode);
	//   11   23:aload_0         
	//   12   24:getfield        #102 <Field Drawable c>
	//   13   27:aload_2         
	//   14   28:invokestatic    #110 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
		if(j > 0)
	//*  15   31:iload           4
	//*  16   33:ifle            76
		{
			f = a(j, colorstatelist);
	//   17   36:aload_0         
	//   18   37:aload_0         
	//   19   38:iload           4
	//   20   40:aload_1         
	//   21   41:invokevirtual   #113 <Method o a(int, ColorStateList)>
	//   22   44:putfield        #117 <Field o f>
			colorstatelist = ((ColorStateList) (new LayerDrawable(new Drawable[] {
				f, c
			})));
	//   23   47:new             #119 <Class LayerDrawable>
	//   24   50:dup             
	//   25   51:iconst_2        
	//   26   52:anewarray       Drawable[]
	//   27   55:dup             
	//   28   56:iconst_0        
	//   29   57:aload_0         
	//   30   58:getfield        #117 <Field o f>
	//   31   61:aastore         
	//   32   62:dup             
	//   33   63:iconst_1        
	//   34   64:aload_0         
	//   35   65:getfield        #102 <Field Drawable c>
	//   36   68:aastore         
	//   37   69:invokespecial   #124 <Method void LayerDrawable(Drawable[])>
	//   38   72:astore_1        
		} else
	//*  39   73:goto            86
		{
			f = null;
	//   40   76:aload_0         
	//   41   77:aconst_null     
	//   42   78:putfield        #117 <Field o f>
			colorstatelist = ((ColorStateList) (c));
	//   43   81:aload_0         
	//   44   82:getfield        #102 <Field Drawable c>
	//   45   85:astore_1        
		}
		e = ((Drawable) (new RippleDrawable(ColorStateList.valueOf(i), ((Drawable) (colorstatelist)), ((Drawable) (null)))));
	//   46   86:aload_0         
	//   47   87:new             #34  <Class RippleDrawable>
	//   48   90:dup             
	//   49   91:iload_3         
	//   50   92:invokestatic    #40  <Method ColorStateList ColorStateList.valueOf(int)>
	//   51   95:aload_1         
	//   52   96:aconst_null     
	//   53   97:invokespecial   #127 <Method void RippleDrawable(ColorStateList, Drawable, Drawable)>
	//   54  100:putfield        #32  <Field Drawable e>
		h = e;
	//   55  103:aload_0         
	//   56  104:aload_0         
	//   57  105:getfield        #32  <Field Drawable e>
	//   58  108:putfield        #130 <Field Drawable h>
		n.c(e);
	//   59  111:aload_0         
	//   60  112:getfield        #51  <Field z n>
	//   61  115:aload_0         
	//   62  116:getfield        #32  <Field Drawable e>
	//   63  119:invokeinterface #133 <Method void z.c(Drawable)>
	//   64  124:return          
	}

	void d(Rect rect)
	{
		if(n.e())
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field z n>
	//*   2    4:invokeinterface #56  <Method boolean z.e()>
	//*   3    9:ifeq            57
		{
			s = new InsetDrawable(e, rect.left, rect.top, rect.right, rect.bottom);
	//    4   12:aload_0         
	//    5   13:new             #135 <Class InsetDrawable>
	//    6   16:dup             
	//    7   17:aload_0         
	//    8   18:getfield        #32  <Field Drawable e>
	//    9   21:aload_1         
	//   10   22:getfield        #139 <Field int Rect.left>
	//   11   25:aload_1         
	//   12   26:getfield        #142 <Field int Rect.top>
	//   13   29:aload_1         
	//   14   30:getfield        #145 <Field int Rect.right>
	//   15   33:aload_1         
	//   16   34:getfield        #148 <Field int Rect.bottom>
	//   17   37:invokespecial   #151 <Method void InsetDrawable(Drawable, int, int, int, int)>
	//   18   40:putfield        #153 <Field InsetDrawable s>
			n.c(((Drawable) (s)));
	//   19   43:aload_0         
	//   20   44:getfield        #51  <Field z n>
	//   21   47:aload_0         
	//   22   48:getfield        #153 <Field InsetDrawable s>
	//   23   51:invokeinterface #133 <Method void z.c(Drawable)>
			return;
	//   24   56:return          
		} else
		{
			n.c(e);
	//   25   57:aload_0         
	//   26   58:getfield        #51  <Field z n>
	//   27   61:aload_0         
	//   28   62:getfield        #32  <Field Drawable e>
	//   29   65:invokeinterface #133 <Method void z.c(Drawable)>
			return;
	//   30   70:return          
		}
	}

	void d(int ai[])
	{
	//    0    0:return          
	}

	void e()
	{
	//    0    0:return          
	}

	void e(float f, float f1)
	{
		if(android.os.Build.VERSION.SDK_INT == 21)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpne          87
		{
			if(l.isEnabled())
	//*   3    8:aload_0         
	//*   4    9:getfield        #23  <Field ah l>
	//*   5   12:invokevirtual   #163 <Method boolean ah.isEnabled()>
	//*   6   15:ifeq            68
			{
				l.setElevation(f);
	//    7   18:aload_0         
	//    8   19:getfield        #23  <Field ah l>
	//    9   22:fload_1         
	//   10   23:invokevirtual   #167 <Method void ah.setElevation(float)>
				if(l.isFocused() || l.isPressed())
	//*  11   26:aload_0         
	//*  12   27:getfield        #23  <Field ah l>
	//*  13   30:invokevirtual   #170 <Method boolean ah.isFocused()>
	//*  14   33:ifne            46
	//*  15   36:aload_0         
	//*  16   37:getfield        #23  <Field ah l>
	//*  17   40:invokevirtual   #173 <Method boolean ah.isPressed()>
	//*  18   43:ifeq            57
					l.setTranslationZ(f1);
	//   19   46:aload_0         
	//   20   47:getfield        #23  <Field ah l>
	//   21   50:fload_2         
	//   22   51:invokevirtual   #176 <Method void ah.setTranslationZ(float)>
				else
	//*  23   54:goto            451
					l.setTranslationZ(0.0F);
	//   24   57:aload_0         
	//   25   58:getfield        #23  <Field ah l>
	//   26   61:fconst_0        
	//   27   62:invokevirtual   #176 <Method void ah.setTranslationZ(float)>
			} else
	//*  28   65:goto            451
			{
				l.setElevation(0.0F);
	//   29   68:aload_0         
	//   30   69:getfield        #23  <Field ah l>
	//   31   72:fconst_0        
	//   32   73:invokevirtual   #167 <Method void ah.setElevation(float)>
				l.setTranslationZ(0.0F);
	//   33   76:aload_0         
	//   34   77:getfield        #23  <Field ah l>
	//   35   80:fconst_0        
	//   36   81:invokevirtual   #176 <Method void ah.setTranslationZ(float)>
			}
		} else
	//*  37   84:goto            451
		{
			StateListAnimator statelistanimator = new StateListAnimator();
	//   38   87:new             #178 <Class StateListAnimator>
	//   39   90:dup             
	//   40   91:invokespecial   #180 <Method void StateListAnimator()>
	//   41   94:astore_3        
			AnimatorSet animatorset = new AnimatorSet();
	//   42   95:new             #182 <Class AnimatorSet>
	//   43   98:dup             
	//   44   99:invokespecial   #183 <Method void AnimatorSet()>
	//   45  102:astore          4
			animatorset.play(((Animator) (ObjectAnimator.ofFloat(((Object) (l)), "elevation", new float[] {
				f
			}).setDuration(0L)))).with(((Animator) (ObjectAnimator.ofFloat(((Object) (l)), View.TRANSLATION_Z, new float[] {
				f1
			}).setDuration(100L))));
	//   46  104:aload           4
	//   47  106:aload_0         
	//   48  107:getfield        #23  <Field ah l>
	//   49  110:ldc1            #185 <String "elevation">
	//   50  112:iconst_1        
	//   51  113:newarray        float[]
	//   52  115:dup             
	//   53  116:iconst_0        
	//   54  117:fload_1         
	//   55  118:fastore         
	//   56  119:invokestatic    #191 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   57  122:lconst_0        
	//   58  123:invokevirtual   #195 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   59  126:invokevirtual   #199 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(Animator)>
	//   60  129:aload_0         
	//   61  130:getfield        #23  <Field ah l>
	//   62  133:getstatic       #205 <Field android.util.Property View.TRANSLATION_Z>
	//   63  136:iconst_1        
	//   64  137:newarray        float[]
	//   65  139:dup             
	//   66  140:iconst_0        
	//   67  141:fload_2         
	//   68  142:fastore         
	//   69  143:invokestatic    #208 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//   70  146:ldc2w           #209 <Long 100L>
	//   71  149:invokevirtual   #195 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   72  152:invokevirtual   #215 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
	//   73  155:pop             
			animatorset.setInterpolator(((android.animation.TimeInterpolator) (d)));
	//   74  156:aload           4
	//   75  158:getstatic       #218 <Field android.view.animation.Interpolator d>
	//   76  161:invokevirtual   #222 <Method void AnimatorSet.setInterpolator(android.animation.TimeInterpolator)>
			statelistanimator.addState(g, ((Animator) (animatorset)));
	//   77  164:aload_3         
	//   78  165:getstatic       #226 <Field int[] g>
	//   79  168:aload           4
	//   80  170:invokevirtual   #230 <Method void StateListAnimator.addState(int[], Animator)>
			animatorset = new AnimatorSet();
	//   81  173:new             #182 <Class AnimatorSet>
	//   82  176:dup             
	//   83  177:invokespecial   #183 <Method void AnimatorSet()>
	//   84  180:astore          4
			animatorset.play(((Animator) (ObjectAnimator.ofFloat(((Object) (l)), "elevation", new float[] {
				f
			}).setDuration(0L)))).with(((Animator) (ObjectAnimator.ofFloat(((Object) (l)), View.TRANSLATION_Z, new float[] {
				f1
			}).setDuration(100L))));
	//   85  182:aload           4
	//   86  184:aload_0         
	//   87  185:getfield        #23  <Field ah l>
	//   88  188:ldc1            #185 <String "elevation">
	//   89  190:iconst_1        
	//   90  191:newarray        float[]
	//   91  193:dup             
	//   92  194:iconst_0        
	//   93  195:fload_1         
	//   94  196:fastore         
	//   95  197:invokestatic    #191 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   96  200:lconst_0        
	//   97  201:invokevirtual   #195 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   98  204:invokevirtual   #199 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(Animator)>
	//   99  207:aload_0         
	//  100  208:getfield        #23  <Field ah l>
	//  101  211:getstatic       #205 <Field android.util.Property View.TRANSLATION_Z>
	//  102  214:iconst_1        
	//  103  215:newarray        float[]
	//  104  217:dup             
	//  105  218:iconst_0        
	//  106  219:fload_2         
	//  107  220:fastore         
	//  108  221:invokestatic    #208 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//  109  224:ldc2w           #209 <Long 100L>
	//  110  227:invokevirtual   #195 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  111  230:invokevirtual   #215 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
	//  112  233:pop             
			animatorset.setInterpolator(((android.animation.TimeInterpolator) (d)));
	//  113  234:aload           4
	//  114  236:getstatic       #218 <Field android.view.animation.Interpolator d>
	//  115  239:invokevirtual   #222 <Method void AnimatorSet.setInterpolator(android.animation.TimeInterpolator)>
			statelistanimator.addState(m, ((Animator) (animatorset)));
	//  116  242:aload_3         
	//  117  243:getstatic       #233 <Field int[] m>
	//  118  246:aload           4
	//  119  248:invokevirtual   #230 <Method void StateListAnimator.addState(int[], Animator)>
			animatorset = new AnimatorSet();
	//  120  251:new             #182 <Class AnimatorSet>
	//  121  254:dup             
	//  122  255:invokespecial   #183 <Method void AnimatorSet()>
	//  123  258:astore          4
			animatorset.playSequentially(new Animator[] {
				ObjectAnimator.ofFloat(((Object) (l)), "elevation", new float[] {
					f
				}).setDuration(0L), ObjectAnimator.ofFloat(((Object) (l)), View.TRANSLATION_Z, new float[] {
					l.getTranslationZ()
				}).setDuration(100L), ObjectAnimator.ofFloat(((Object) (l)), View.TRANSLATION_Z, new float[] {
					0.0F
				}).setDuration(100L)
			});
	//  124  260:aload           4
	//  125  262:iconst_3        
	//  126  263:anewarray       Animator[]
	//  127  266:dup             
	//  128  267:iconst_0        
	//  129  268:aload_0         
	//  130  269:getfield        #23  <Field ah l>
	//  131  272:ldc1            #185 <String "elevation">
	//  132  274:iconst_1        
	//  133  275:newarray        float[]
	//  134  277:dup             
	//  135  278:iconst_0        
	//  136  279:fload_1         
	//  137  280:fastore         
	//  138  281:invokestatic    #191 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  139  284:lconst_0        
	//  140  285:invokevirtual   #195 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  141  288:aastore         
	//  142  289:dup             
	//  143  290:iconst_1        
	//  144  291:aload_0         
	//  145  292:getfield        #23  <Field ah l>
	//  146  295:getstatic       #205 <Field android.util.Property View.TRANSLATION_Z>
	//  147  298:iconst_1        
	//  148  299:newarray        float[]
	//  149  301:dup             
	//  150  302:iconst_0        
	//  151  303:aload_0         
	//  152  304:getfield        #23  <Field ah l>
	//  153  307:invokevirtual   #238 <Method float ah.getTranslationZ()>
	//  154  310:fastore         
	//  155  311:invokestatic    #208 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//  156  314:ldc2w           #209 <Long 100L>
	//  157  317:invokevirtual   #195 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  158  320:aastore         
	//  159  321:dup             
	//  160  322:iconst_2        
	//  161  323:aload_0         
	//  162  324:getfield        #23  <Field ah l>
	//  163  327:getstatic       #205 <Field android.util.Property View.TRANSLATION_Z>
	//  164  330:iconst_1        
	//  165  331:newarray        float[]
	//  166  333:dup             
	//  167  334:iconst_0        
	//  168  335:fconst_0        
	//  169  336:fastore         
	//  170  337:invokestatic    #208 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//  171  340:ldc2w           #209 <Long 100L>
	//  172  343:invokevirtual   #195 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  173  346:aastore         
	//  174  347:invokevirtual   #242 <Method void AnimatorSet.playSequentially(Animator[])>
			animatorset.setInterpolator(((android.animation.TimeInterpolator) (d)));
	//  175  350:aload           4
	//  176  352:getstatic       #218 <Field android.view.animation.Interpolator d>
	//  177  355:invokevirtual   #222 <Method void AnimatorSet.setInterpolator(android.animation.TimeInterpolator)>
			statelistanimator.addState(p, ((Animator) (animatorset)));
	//  178  358:aload_3         
	//  179  359:getstatic       #244 <Field int[] p>
	//  180  362:aload           4
	//  181  364:invokevirtual   #230 <Method void StateListAnimator.addState(int[], Animator)>
			animatorset = new AnimatorSet();
	//  182  367:new             #182 <Class AnimatorSet>
	//  183  370:dup             
	//  184  371:invokespecial   #183 <Method void AnimatorSet()>
	//  185  374:astore          4
			animatorset.play(((Animator) (ObjectAnimator.ofFloat(((Object) (l)), "elevation", new float[] {
				0.0F
			}).setDuration(0L)))).with(((Animator) (ObjectAnimator.ofFloat(((Object) (l)), View.TRANSLATION_Z, new float[] {
				0.0F
			}).setDuration(0L))));
	//  186  376:aload           4
	//  187  378:aload_0         
	//  188  379:getfield        #23  <Field ah l>
	//  189  382:ldc1            #185 <String "elevation">
	//  190  384:iconst_1        
	//  191  385:newarray        float[]
	//  192  387:dup             
	//  193  388:iconst_0        
	//  194  389:fconst_0        
	//  195  390:fastore         
	//  196  391:invokestatic    #191 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  197  394:lconst_0        
	//  198  395:invokevirtual   #195 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  199  398:invokevirtual   #199 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(Animator)>
	//  200  401:aload_0         
	//  201  402:getfield        #23  <Field ah l>
	//  202  405:getstatic       #205 <Field android.util.Property View.TRANSLATION_Z>
	//  203  408:iconst_1        
	//  204  409:newarray        float[]
	//  205  411:dup             
	//  206  412:iconst_0        
	//  207  413:fconst_0        
	//  208  414:fastore         
	//  209  415:invokestatic    #208 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//  210  418:lconst_0        
	//  211  419:invokevirtual   #195 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  212  422:invokevirtual   #215 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
	//  213  425:pop             
			animatorset.setInterpolator(((android.animation.TimeInterpolator) (d)));
	//  214  426:aload           4
	//  215  428:getstatic       #218 <Field android.view.animation.Interpolator d>
	//  216  431:invokevirtual   #222 <Method void AnimatorSet.setInterpolator(android.animation.TimeInterpolator)>
			statelistanimator.addState(o, ((Animator) (animatorset)));
	//  217  434:aload_3         
	//  218  435:getstatic       #247 <Field int[] o>
	//  219  438:aload           4
	//  220  440:invokevirtual   #230 <Method void StateListAnimator.addState(int[], Animator)>
			l.setStateListAnimator(statelistanimator);
	//  221  443:aload_0         
	//  222  444:getfield        #23  <Field ah l>
	//  223  447:aload_3         
	//  224  448:invokevirtual   #251 <Method void ah.setStateListAnimator(StateListAnimator)>
		}
		if(n.e())
	//* 225  451:aload_0         
	//* 226  452:getfield        #51  <Field z n>
	//* 227  455:invokeinterface #56  <Method boolean z.e()>
	//* 228  460:ifeq            467
			b();
	//  229  463:aload_0         
	//  230  464:invokevirtual   #89  <Method void b()>
	//  231  467:return          
	}

	boolean h()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	o k()
	{
		return ((o) (new l()));
	//    0    0:new             #255 <Class l>
	//    1    3:dup             
	//    2    4:invokespecial   #256 <Method void l()>
	//    3    7:areturn         
	}

	GradientDrawable l()
	{
		return ((GradientDrawable) (new e()));
	//    0    0:new             #6   <Class q$e>
	//    1    3:dup             
	//    2    4:invokespecial   #257 <Method void q$e()>
	//    3    7:areturn         
	}

	private InsetDrawable s;
}
