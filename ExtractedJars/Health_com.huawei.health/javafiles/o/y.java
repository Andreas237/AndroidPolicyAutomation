// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.graphics.drawable.DrawableWrapper;

class y extends DrawableWrapper
{

	public y(Context context, Drawable drawable, float f1, float f2, float f3)
	{
		super(drawable);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #49  <Method void DrawableWrapper(Drawable)>
		p = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #51  <Field boolean p>
		l = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #53  <Field boolean l>
		s = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #55  <Field boolean s>
		o = ContextCompat.getColor(context, android.support.design.R.color.design_fab_shadow_start_color);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:getstatic       #60  <Field int android.support.design.R$color.design_fab_shadow_start_color>
	//   15   25:invokestatic    #66  <Method int ContextCompat.getColor(Context, int)>
	//   16   28:putfield        #68  <Field int o>
		n = ContextCompat.getColor(context, android.support.design.R.color.design_fab_shadow_mid_color);
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:getstatic       #71  <Field int android.support.design.R$color.design_fab_shadow_mid_color>
	//   20   36:invokestatic    #66  <Method int ContextCompat.getColor(Context, int)>
	//   21   39:putfield        #73  <Field int n>
		m = ContextCompat.getColor(context, android.support.design.R.color.design_fab_shadow_end_color);
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getstatic       #76  <Field int android.support.design.R$color.design_fab_shadow_end_color>
	//   25   47:invokestatic    #66  <Method int ContextCompat.getColor(Context, int)>
	//   26   50:putfield        #78  <Field int m>
	//   27   53:aload_0         
	//   28   54:new             #80  <Class Paint>
	//   29   57:dup             
	//   30   58:iconst_5        
	//   31   59:invokespecial   #83  <Method void Paint(int)>
	//   32   62:putfield        #85  <Field Paint d>
		d.setStyle(android.graphics.Paint.Style.FILL);
	//   33   65:aload_0         
	//   34   66:getfield        #85  <Field Paint d>
	//   35   69:getstatic       #91  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   36   72:invokevirtual   #95  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		a = Math.round(f1);
	//   37   75:aload_0         
	//   38   76:fload_3         
	//   39   77:invokestatic    #99  <Method int Math.round(float)>
	//   40   80:i2f             
	//   41   81:putfield        #101 <Field float a>
	//   42   84:aload_0         
	//   43   85:new             #103 <Class RectF>
	//   44   88:dup             
	//   45   89:invokespecial   #105 <Method void RectF()>
	//   46   92:putfield        #107 <Field RectF e>
		b = new Paint(d);
	//   47   95:aload_0         
	//   48   96:new             #80  <Class Paint>
	//   49   99:dup             
	//   50  100:aload_0         
	//   51  101:getfield        #85  <Field Paint d>
	//   52  104:invokespecial   #110 <Method void Paint(Paint)>
	//   53  107:putfield        #112 <Field Paint b>
		b.setAntiAlias(false);
	//   54  110:aload_0         
	//   55  111:getfield        #112 <Field Paint b>
	//   56  114:iconst_0        
	//   57  115:invokevirtual   #116 <Method void Paint.setAntiAlias(boolean)>
		e(f2, f3);
	//   58  118:aload_0         
	//   59  119:fload           4
	//   60  121:fload           5
	//   61  123:invokevirtual   #119 <Method void e(float, float)>
	//   62  126:return          
	}

	private void a(Rect rect)
	{
		float f1 = h * 1.5F;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field float h>
	//    2    4:ldc1            #123 <Float 1.5F>
	//    3    6:fmul            
	//    4    7:fstore_2        
		e.set((float)rect.left + h, (float)rect.top + f1, (float)rect.right - h, (float)rect.bottom - f1);
	//    5    8:aload_0         
	//    6    9:getfield        #107 <Field RectF e>
	//    7   12:aload_1         
	//    8   13:getfield        #128 <Field int Rect.left>
	//    9   16:i2f             
	//   10   17:aload_0         
	//   11   18:getfield        #122 <Field float h>
	//   12   21:fadd            
	//   13   22:aload_1         
	//   14   23:getfield        #131 <Field int Rect.top>
	//   15   26:i2f             
	//   16   27:fload_2         
	//   17   28:fadd            
	//   18   29:aload_1         
	//   19   30:getfield        #134 <Field int Rect.right>
	//   20   33:i2f             
	//   21   34:aload_0         
	//   22   35:getfield        #122 <Field float h>
	//   23   38:fsub            
	//   24   39:aload_1         
	//   25   40:getfield        #137 <Field int Rect.bottom>
	//   26   43:i2f             
	//   27   44:fload_2         
	//   28   45:fsub            
	//   29   46:invokevirtual   #141 <Method void RectF.set(float, float, float, float)>
		getWrappedDrawable().setBounds((int)e.left, (int)e.top, (int)e.right, (int)e.bottom);
	//   30   49:aload_0         
	//   31   50:invokevirtual   #145 <Method Drawable getWrappedDrawable()>
	//   32   53:aload_0         
	//   33   54:getfield        #107 <Field RectF e>
	//   34   57:getfield        #147 <Field float RectF.left>
	//   35   60:f2i             
	//   36   61:aload_0         
	//   37   62:getfield        #107 <Field RectF e>
	//   38   65:getfield        #149 <Field float RectF.top>
	//   39   68:f2i             
	//   40   69:aload_0         
	//   41   70:getfield        #107 <Field RectF e>
	//   42   73:getfield        #151 <Field float RectF.right>
	//   43   76:f2i             
	//   44   77:aload_0         
	//   45   78:getfield        #107 <Field RectF e>
	//   46   81:getfield        #153 <Field float RectF.bottom>
	//   47   84:f2i             
	//   48   85:invokevirtual   #159 <Method void Drawable.setBounds(int, int, int, int)>
		d();
	//   49   88:aload_0         
	//   50   89:invokespecial   #161 <Method void d()>
	//   51   92:return          
	}

	public static float c(float f1, float f2, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            17
			return (float)((double)f1 + (1.0D - c) * (double)f2);
	//    2    4:fload_0         
	//    3    5:f2d             
	//    4    6:dconst_1        
	//    5    7:getstatic       #43  <Field double c>
	//    6   10:dsub            
	//    7   11:fload_1         
	//    8   12:f2d             
	//    9   13:dmul            
	//   10   14:dadd            
	//   11   15:d2f             
	//   12   16:freturn         
		else
			return f1;
	//   13   17:fload_0         
	//   14   18:freturn         
	}

	private void c(Canvas canvas)
	{
		int i1 = canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #169 <Method int Canvas.save()>
	//    2    4:istore          12
		canvas.rotate(u, e.centerX(), e.centerY());
	//    3    6:aload_1         
	//    4    7:aload_0         
	//    5    8:getfield        #171 <Field float u>
	//    6   11:aload_0         
	//    7   12:getfield        #107 <Field RectF e>
	//    8   15:invokevirtual   #175 <Method float RectF.centerX()>
	//    9   18:aload_0         
	//   10   19:getfield        #107 <Field RectF e>
	//   11   22:invokevirtual   #178 <Method float RectF.centerY()>
	//   12   25:invokevirtual   #182 <Method void Canvas.rotate(float, float, float)>
		float f1 = -a - k;
	//   13   28:aload_0         
	//   14   29:getfield        #101 <Field float a>
	//   15   32:fneg            
	//   16   33:aload_0         
	//   17   34:getfield        #184 <Field float k>
	//   18   37:fsub            
	//   19   38:fstore_2        
		float f2 = a;
	//   20   39:aload_0         
	//   21   40:getfield        #101 <Field float a>
	//   22   43:fstore_3        
		boolean flag;
		if(e.width() - 2.0F * f2 > 0.0F)
	//*  23   44:aload_0         
	//*  24   45:getfield        #107 <Field RectF e>
	//*  25   48:invokevirtual   #187 <Method float RectF.width()>
	//*  26   51:fconst_2        
	//*  27   52:fload_3         
	//*  28   53:fmul            
	//*  29   54:fsub            
	//*  30   55:fconst_0        
	//*  31   56:fcmpl           
	//*  32   57:ifle            66
			flag = true;
	//   33   60:iconst_1        
	//   34   61:istore          10
		else
	//*  35   63:goto            69
			flag = false;
	//   36   66:iconst_0        
	//   37   67:istore          10
		boolean flag1;
		if(e.height() - 2.0F * f2 > 0.0F)
	//*  38   69:aload_0         
	//*  39   70:getfield        #107 <Field RectF e>
	//*  40   73:invokevirtual   #190 <Method float RectF.height()>
	//*  41   76:fconst_2        
	//*  42   77:fload_3         
	//*  43   78:fmul            
	//*  44   79:fsub            
	//*  45   80:fconst_0        
	//*  46   81:fcmpl           
	//*  47   82:ifle            91
			flag1 = true;
	//   48   85:iconst_1        
	//   49   86:istore          11
		else
	//*  50   88:goto            94
			flag1 = false;
	//   51   91:iconst_0        
	//   52   92:istore          11
		float f7 = i;
	//   53   94:aload_0         
	//   54   95:getfield        #192 <Field float i>
	//   55   98:fstore          7
		float f8 = i;
	//   56  100:aload_0         
	//   57  101:getfield        #192 <Field float i>
	//   58  104:fstore          8
		float f3 = i;
	//   59  106:aload_0         
	//   60  107:getfield        #192 <Field float i>
	//   61  110:fstore          4
		float f10 = i;
	//   62  112:aload_0         
	//   63  113:getfield        #192 <Field float i>
	//   64  116:fstore          9
		float f4 = i;
	//   65  118:aload_0         
	//   66  119:getfield        #192 <Field float i>
	//   67  122:fstore          5
		float f5 = i;
	//   68  124:aload_0         
	//   69  125:getfield        #192 <Field float i>
	//   70  128:fstore          6
		f3 = f2 / (f2 + (f3 - f10 * 0.5F));
	//   71  130:fload_3         
	//   72  131:fload_3         
	//   73  132:fload           4
	//   74  134:fload           9
	//   75  136:ldc1            #193 <Float 0.5F>
	//   76  138:fmul            
	//   77  139:fsub            
	//   78  140:fadd            
	//   79  141:fdiv            
	//   80  142:fstore          4
		f7 = f2 / (f2 + (f7 - f8 * 0.25F));
	//   81  144:fload_3         
	//   82  145:fload_3         
	//   83  146:fload           7
	//   84  148:fload           8
	//   85  150:ldc1            #194 <Float 0.25F>
	//   86  152:fmul            
	//   87  153:fsub            
	//   88  154:fadd            
	//   89  155:fdiv            
	//   90  156:fstore          7
		f4 = f2 / (f2 + (f4 - f5 * 1.0F));
	//   91  158:fload_3         
	//   92  159:fload_3         
	//   93  160:fload           5
	//   94  162:fload           6
	//   95  164:fconst_1        
	//   96  165:fmul            
	//   97  166:fsub            
	//   98  167:fadd            
	//   99  168:fdiv            
	//  100  169:fstore          5
		int j1 = canvas.save();
	//  101  171:aload_1         
	//  102  172:invokevirtual   #169 <Method int Canvas.save()>
	//  103  175:istore          13
		canvas.translate(e.left + f2, e.top + f2);
	//  104  177:aload_1         
	//  105  178:aload_0         
	//  106  179:getfield        #107 <Field RectF e>
	//  107  182:getfield        #147 <Field float RectF.left>
	//  108  185:fload_3         
	//  109  186:fadd            
	//  110  187:aload_0         
	//  111  188:getfield        #107 <Field RectF e>
	//  112  191:getfield        #149 <Field float RectF.top>
	//  113  194:fload_3         
	//  114  195:fadd            
	//  115  196:invokevirtual   #197 <Method void Canvas.translate(float, float)>
		canvas.scale(f3, f7);
	//  116  199:aload_1         
	//  117  200:fload           4
	//  118  202:fload           7
	//  119  204:invokevirtual   #200 <Method void Canvas.scale(float, float)>
		canvas.drawPath(f, d);
	//  120  207:aload_1         
	//  121  208:aload_0         
	//  122  209:getfield        #202 <Field Path f>
	//  123  212:aload_0         
	//  124  213:getfield        #85  <Field Paint d>
	//  125  216:invokevirtual   #206 <Method void Canvas.drawPath(Path, Paint)>
		if(flag)
	//* 126  219:iload           10
	//* 127  221:ifeq            259
		{
			canvas.scale(1.0F / f3, 1.0F);
	//  128  224:aload_1         
	//  129  225:fconst_1        
	//  130  226:fload           4
	//  131  228:fdiv            
	//  132  229:fconst_1        
	//  133  230:invokevirtual   #200 <Method void Canvas.scale(float, float)>
			canvas.drawRect(0.0F, f1, e.width() - 2.0F * f2, -a, b);
	//  134  233:aload_1         
	//  135  234:fconst_0        
	//  136  235:fload_2         
	//  137  236:aload_0         
	//  138  237:getfield        #107 <Field RectF e>
	//  139  240:invokevirtual   #187 <Method float RectF.width()>
	//  140  243:fconst_2        
	//  141  244:fload_3         
	//  142  245:fmul            
	//  143  246:fsub            
	//  144  247:aload_0         
	//  145  248:getfield        #101 <Field float a>
	//  146  251:fneg            
	//  147  252:aload_0         
	//  148  253:getfield        #112 <Field Paint b>
	//  149  256:invokevirtual   #210 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
		canvas.restoreToCount(j1);
	//  150  259:aload_1         
	//  151  260:iload           13
	//  152  262:invokevirtual   #213 <Method void Canvas.restoreToCount(int)>
		j1 = canvas.save();
	//  153  265:aload_1         
	//  154  266:invokevirtual   #169 <Method int Canvas.save()>
	//  155  269:istore          13
		canvas.translate(e.right - f2, e.bottom - f2);
	//  156  271:aload_1         
	//  157  272:aload_0         
	//  158  273:getfield        #107 <Field RectF e>
	//  159  276:getfield        #151 <Field float RectF.right>
	//  160  279:fload_3         
	//  161  280:fsub            
	//  162  281:aload_0         
	//  163  282:getfield        #107 <Field RectF e>
	//  164  285:getfield        #153 <Field float RectF.bottom>
	//  165  288:fload_3         
	//  166  289:fsub            
	//  167  290:invokevirtual   #197 <Method void Canvas.translate(float, float)>
		canvas.scale(f3, f4);
	//  168  293:aload_1         
	//  169  294:fload           4
	//  170  296:fload           5
	//  171  298:invokevirtual   #200 <Method void Canvas.scale(float, float)>
		canvas.rotate(180F);
	//  172  301:aload_1         
	//  173  302:ldc1            #214 <Float 180F>
	//  174  304:invokevirtual   #217 <Method void Canvas.rotate(float)>
		canvas.drawPath(f, d);
	//  175  307:aload_1         
	//  176  308:aload_0         
	//  177  309:getfield        #202 <Field Path f>
	//  178  312:aload_0         
	//  179  313:getfield        #85  <Field Paint d>
	//  180  316:invokevirtual   #206 <Method void Canvas.drawPath(Path, Paint)>
		if(flag)
	//* 181  319:iload           10
	//* 182  321:ifeq            372
		{
			canvas.scale(1.0F / f3, 1.0F);
	//  183  324:aload_1         
	//  184  325:fconst_1        
	//  185  326:fload           4
	//  186  328:fdiv            
	//  187  329:fconst_1        
	//  188  330:invokevirtual   #200 <Method void Canvas.scale(float, float)>
			float f6 = e.width();
	//  189  333:aload_0         
	//  190  334:getfield        #107 <Field RectF e>
	//  191  337:invokevirtual   #187 <Method float RectF.width()>
	//  192  340:fstore          6
			float f9 = -a;
	//  193  342:aload_0         
	//  194  343:getfield        #101 <Field float a>
	//  195  346:fneg            
	//  196  347:fstore          8
			canvas.drawRect(0.0F, f1, f6 - 2.0F * f2, k + f9, b);
	//  197  349:aload_1         
	//  198  350:fconst_0        
	//  199  351:fload_2         
	//  200  352:fload           6
	//  201  354:fconst_2        
	//  202  355:fload_3         
	//  203  356:fmul            
	//  204  357:fsub            
	//  205  358:aload_0         
	//  206  359:getfield        #184 <Field float k>
	//  207  362:fload           8
	//  208  364:fadd            
	//  209  365:aload_0         
	//  210  366:getfield        #112 <Field Paint b>
	//  211  369:invokevirtual   #210 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
		canvas.restoreToCount(j1);
	//  212  372:aload_1         
	//  213  373:iload           13
	//  214  375:invokevirtual   #213 <Method void Canvas.restoreToCount(int)>
		int j = canvas.save();
	//  215  378:aload_1         
	//  216  379:invokevirtual   #169 <Method int Canvas.save()>
	//  217  382:istore          10
		canvas.translate(e.left + f2, e.bottom - f2);
	//  218  384:aload_1         
	//  219  385:aload_0         
	//  220  386:getfield        #107 <Field RectF e>
	//  221  389:getfield        #147 <Field float RectF.left>
	//  222  392:fload_3         
	//  223  393:fadd            
	//  224  394:aload_0         
	//  225  395:getfield        #107 <Field RectF e>
	//  226  398:getfield        #153 <Field float RectF.bottom>
	//  227  401:fload_3         
	//  228  402:fsub            
	//  229  403:invokevirtual   #197 <Method void Canvas.translate(float, float)>
		canvas.scale(f3, f4);
	//  230  406:aload_1         
	//  231  407:fload           4
	//  232  409:fload           5
	//  233  411:invokevirtual   #200 <Method void Canvas.scale(float, float)>
		canvas.rotate(270F);
	//  234  414:aload_1         
	//  235  415:ldc1            #218 <Float 270F>
	//  236  417:invokevirtual   #217 <Method void Canvas.rotate(float)>
		canvas.drawPath(f, d);
	//  237  420:aload_1         
	//  238  421:aload_0         
	//  239  422:getfield        #202 <Field Path f>
	//  240  425:aload_0         
	//  241  426:getfield        #85  <Field Paint d>
	//  242  429:invokevirtual   #206 <Method void Canvas.drawPath(Path, Paint)>
		if(flag1)
	//* 243  432:iload           11
	//* 244  434:ifeq            472
		{
			canvas.scale(1.0F / f4, 1.0F);
	//  245  437:aload_1         
	//  246  438:fconst_1        
	//  247  439:fload           5
	//  248  441:fdiv            
	//  249  442:fconst_1        
	//  250  443:invokevirtual   #200 <Method void Canvas.scale(float, float)>
			canvas.drawRect(0.0F, f1, e.height() - 2.0F * f2, -a, b);
	//  251  446:aload_1         
	//  252  447:fconst_0        
	//  253  448:fload_2         
	//  254  449:aload_0         
	//  255  450:getfield        #107 <Field RectF e>
	//  256  453:invokevirtual   #190 <Method float RectF.height()>
	//  257  456:fconst_2        
	//  258  457:fload_3         
	//  259  458:fmul            
	//  260  459:fsub            
	//  261  460:aload_0         
	//  262  461:getfield        #101 <Field float a>
	//  263  464:fneg            
	//  264  465:aload_0         
	//  265  466:getfield        #112 <Field Paint b>
	//  266  469:invokevirtual   #210 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
		canvas.restoreToCount(j);
	//  267  472:aload_1         
	//  268  473:iload           10
	//  269  475:invokevirtual   #213 <Method void Canvas.restoreToCount(int)>
		j = canvas.save();
	//  270  478:aload_1         
	//  271  479:invokevirtual   #169 <Method int Canvas.save()>
	//  272  482:istore          10
		canvas.translate(e.right - f2, e.top + f2);
	//  273  484:aload_1         
	//  274  485:aload_0         
	//  275  486:getfield        #107 <Field RectF e>
	//  276  489:getfield        #151 <Field float RectF.right>
	//  277  492:fload_3         
	//  278  493:fsub            
	//  279  494:aload_0         
	//  280  495:getfield        #107 <Field RectF e>
	//  281  498:getfield        #149 <Field float RectF.top>
	//  282  501:fload_3         
	//  283  502:fadd            
	//  284  503:invokevirtual   #197 <Method void Canvas.translate(float, float)>
		canvas.scale(f3, f7);
	//  285  506:aload_1         
	//  286  507:fload           4
	//  287  509:fload           7
	//  288  511:invokevirtual   #200 <Method void Canvas.scale(float, float)>
		canvas.rotate(90F);
	//  289  514:aload_1         
	//  290  515:ldc1            #219 <Float 90F>
	//  291  517:invokevirtual   #217 <Method void Canvas.rotate(float)>
		canvas.drawPath(f, d);
	//  292  520:aload_1         
	//  293  521:aload_0         
	//  294  522:getfield        #202 <Field Path f>
	//  295  525:aload_0         
	//  296  526:getfield        #85  <Field Paint d>
	//  297  529:invokevirtual   #206 <Method void Canvas.drawPath(Path, Paint)>
		if(flag1)
	//* 298  532:iload           11
	//* 299  534:ifeq            572
		{
			canvas.scale(1.0F / f7, 1.0F);
	//  300  537:aload_1         
	//  301  538:fconst_1        
	//  302  539:fload           7
	//  303  541:fdiv            
	//  304  542:fconst_1        
	//  305  543:invokevirtual   #200 <Method void Canvas.scale(float, float)>
			canvas.drawRect(0.0F, f1, e.height() - 2.0F * f2, -a, b);
	//  306  546:aload_1         
	//  307  547:fconst_0        
	//  308  548:fload_2         
	//  309  549:aload_0         
	//  310  550:getfield        #107 <Field RectF e>
	//  311  553:invokevirtual   #190 <Method float RectF.height()>
	//  312  556:fconst_2        
	//  313  557:fload_3         
	//  314  558:fmul            
	//  315  559:fsub            
	//  316  560:aload_0         
	//  317  561:getfield        #101 <Field float a>
	//  318  564:fneg            
	//  319  565:aload_0         
	//  320  566:getfield        #112 <Field Paint b>
	//  321  569:invokevirtual   #210 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
		canvas.restoreToCount(j);
	//  322  572:aload_1         
	//  323  573:iload           10
	//  324  575:invokevirtual   #213 <Method void Canvas.restoreToCount(int)>
		canvas.restoreToCount(i1);
	//  325  578:aload_1         
	//  326  579:iload           12
	//  327  581:invokevirtual   #213 <Method void Canvas.restoreToCount(int)>
	//  328  584:return          
	}

	public static float d(float f1, float f2, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            20
			return (float)((double)(1.5F * f1) + (1.0D - c) * (double)f2);
	//    2    4:ldc1            #123 <Float 1.5F>
	//    3    6:fload_0         
	//    4    7:fmul            
	//    5    8:f2d             
	//    6    9:dconst_1        
	//    7   10:getstatic       #43  <Field double c>
	//    8   13:dsub            
	//    9   14:fload_1         
	//   10   15:f2d             
	//   11   16:dmul            
	//   12   17:dadd            
	//   13   18:d2f             
	//   14   19:freturn         
		else
			return 1.5F * f1;
	//   15   20:ldc1            #123 <Float 1.5F>
	//   16   22:fload_0         
	//   17   23:fmul            
	//   18   24:freturn         
	}

	private void d()
	{
		Object obj = ((Object) (new RectF(-a, -a, a, a)));
	//    0    0:new             #103 <Class RectF>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #101 <Field float a>
	//    4    8:fneg            
	//    5    9:aload_0         
	//    6   10:getfield        #101 <Field float a>
	//    7   13:fneg            
	//    8   14:aload_0         
	//    9   15:getfield        #101 <Field float a>
	//   10   18:aload_0         
	//   11   19:getfield        #101 <Field float a>
	//   12   22:invokespecial   #221 <Method void RectF(float, float, float, float)>
	//   13   25:astore          7
		RectF rectf = new RectF(((RectF) (obj)));
	//   14   27:new             #103 <Class RectF>
	//   15   30:dup             
	//   16   31:aload           7
	//   17   33:invokespecial   #224 <Method void RectF(RectF)>
	//   18   36:astore          8
		rectf.inset(-k, -k);
	//   19   38:aload           8
	//   20   40:aload_0         
	//   21   41:getfield        #184 <Field float k>
	//   22   44:fneg            
	//   23   45:aload_0         
	//   24   46:getfield        #184 <Field float k>
	//   25   49:fneg            
	//   26   50:invokevirtual   #227 <Method void RectF.inset(float, float)>
		if(f == null)
	//*  27   53:aload_0         
	//*  28   54:getfield        #202 <Field Path f>
	//*  29   57:ifnonnull       74
			f = new Path();
	//   30   60:aload_0         
	//   31   61:new             #229 <Class Path>
	//   32   64:dup             
	//   33   65:invokespecial   #230 <Method void Path()>
	//   34   68:putfield        #202 <Field Path f>
		else
	//*  35   71:goto            81
			f.reset();
	//   36   74:aload_0         
	//   37   75:getfield        #202 <Field Path f>
	//   38   78:invokevirtual   #233 <Method void Path.reset()>
		f.setFillType(android.graphics.Path.FillType.EVEN_ODD);
	//   39   81:aload_0         
	//   40   82:getfield        #202 <Field Path f>
	//   41   85:getstatic       #239 <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
	//   42   88:invokevirtual   #243 <Method void Path.setFillType(android.graphics.Path$FillType)>
		f.moveTo(-a, 0.0F);
	//   43   91:aload_0         
	//   44   92:getfield        #202 <Field Path f>
	//   45   95:aload_0         
	//   46   96:getfield        #101 <Field float a>
	//   47   99:fneg            
	//   48  100:fconst_0        
	//   49  101:invokevirtual   #246 <Method void Path.moveTo(float, float)>
		f.rLineTo(-k, 0.0F);
	//   50  104:aload_0         
	//   51  105:getfield        #202 <Field Path f>
	//   52  108:aload_0         
	//   53  109:getfield        #184 <Field float k>
	//   54  112:fneg            
	//   55  113:fconst_0        
	//   56  114:invokevirtual   #249 <Method void Path.rLineTo(float, float)>
		f.arcTo(rectf, 180F, 90F, false);
	//   57  117:aload_0         
	//   58  118:getfield        #202 <Field Path f>
	//   59  121:aload           8
	//   60  123:ldc1            #214 <Float 180F>
	//   61  125:ldc1            #219 <Float 90F>
	//   62  127:iconst_0        
	//   63  128:invokevirtual   #253 <Method void Path.arcTo(RectF, float, float, boolean)>
		f.arcTo(((RectF) (obj)), 270F, -90F, false);
	//   64  131:aload_0         
	//   65  132:getfield        #202 <Field Path f>
	//   66  135:aload           7
	//   67  137:ldc1            #218 <Float 270F>
	//   68  139:ldc1            #254 <Float -90F>
	//   69  141:iconst_0        
	//   70  142:invokevirtual   #253 <Method void Path.arcTo(RectF, float, float, boolean)>
		f.close();
	//   71  145:aload_0         
	//   72  146:getfield        #202 <Field Path f>
	//   73  149:invokevirtual   #257 <Method void Path.close()>
		float f1 = -rectf.top;
	//   74  152:aload           8
	//   75  154:getfield        #149 <Field float RectF.top>
	//   76  157:fneg            
	//   77  158:fstore_1        
		if(f1 > 0.0F)
	//*  78  159:fload_1         
	//*  79  160:fconst_0        
	//*  80  161:fcmpl           
	//*  81  162:ifle            268
		{
			float f2 = a / f1;
	//   82  165:aload_0         
	//   83  166:getfield        #101 <Field float a>
	//   84  169:fload_1         
	//   85  170:fdiv            
	//   86  171:fstore_2        
			float f4 = (1.0F - f2) / 2.0F;
	//   87  172:fconst_1        
	//   88  173:fload_2         
	//   89  174:fsub            
	//   90  175:fconst_2        
	//   91  176:fdiv            
	//   92  177:fstore_3        
			Paint paint = d;
	//   93  178:aload_0         
	//   94  179:getfield        #85  <Field Paint d>
	//   95  182:astore          9
			int j = o;
	//   96  184:aload_0         
	//   97  185:getfield        #68  <Field int o>
	//   98  188:istore          4
			int j1 = n;
	//   99  190:aload_0         
	//  100  191:getfield        #73  <Field int n>
	//  101  194:istore          5
			int l1 = m;
	//  102  196:aload_0         
	//  103  197:getfield        #78  <Field int m>
	//  104  200:istore          6
			android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
	//  105  202:getstatic       #263 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//  106  205:astore          10
			paint.setShader(((android.graphics.Shader) (new RadialGradient(0.0F, 0.0F, f1, new int[] {
				0, j, j1, l1
			}, new float[] {
				0.0F, f2, f2 + f4, 1.0F
			}, tilemode))));
	//  107  207:aload           9
	//  108  209:new             #265 <Class RadialGradient>
	//  109  212:dup             
	//  110  213:fconst_0        
	//  111  214:fconst_0        
	//  112  215:fload_1         
	//  113  216:iconst_4        
	//  114  217:newarray        int[]
	//  115  219:dup             
	//  116  220:iconst_0        
	//  117  221:iconst_0        
	//  118  222:iastore         
	//  119  223:dup             
	//  120  224:iconst_1        
	//  121  225:iload           4
	//  122  227:iastore         
	//  123  228:dup             
	//  124  229:iconst_2        
	//  125  230:iload           5
	//  126  232:iastore         
	//  127  233:dup             
	//  128  234:iconst_3        
	//  129  235:iload           6
	//  130  237:iastore         
	//  131  238:iconst_4        
	//  132  239:newarray        float[]
	//  133  241:dup             
	//  134  242:iconst_0        
	//  135  243:fconst_0        
	//  136  244:fastore         
	//  137  245:dup             
	//  138  246:iconst_1        
	//  139  247:fload_2         
	//  140  248:fastore         
	//  141  249:dup             
	//  142  250:iconst_2        
	//  143  251:fload_2         
	//  144  252:fload_3         
	//  145  253:fadd            
	//  146  254:fastore         
	//  147  255:dup             
	//  148  256:iconst_3        
	//  149  257:fconst_1        
	//  150  258:fastore         
	//  151  259:aload           10
	//  152  261:invokespecial   #268 <Method void RadialGradient(float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  153  264:invokevirtual   #272 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//  154  267:pop             
		}
		Paint paint1 = b;
	//  155  268:aload_0         
	//  156  269:getfield        #112 <Field Paint b>
	//  157  272:astore          9
		f1 = ((RectF) (obj)).top;
	//  158  274:aload           7
	//  159  276:getfield        #149 <Field float RectF.top>
	//  160  279:fstore_1        
		float f3 = rectf.top;
	//  161  280:aload           8
	//  162  282:getfield        #149 <Field float RectF.top>
	//  163  285:fstore_2        
		int i1 = o;
	//  164  286:aload_0         
	//  165  287:getfield        #68  <Field int o>
	//  166  290:istore          4
		int k1 = n;
	//  167  292:aload_0         
	//  168  293:getfield        #73  <Field int n>
	//  169  296:istore          5
		int i2 = m;
	//  170  298:aload_0         
	//  171  299:getfield        #78  <Field int m>
	//  172  302:istore          6
		obj = ((Object) (android.graphics.Shader.TileMode.CLAMP));
	//  173  304:getstatic       #263 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//  174  307:astore          7
		paint1.setShader(((android.graphics.Shader) (new LinearGradient(0.0F, f1, 0.0F, f3, new int[] {
			i1, k1, i2
		}, new float[] {
			0.0F, 0.5F, 1.0F
		}, ((android.graphics.Shader.TileMode) (obj))))));
	//  175  309:aload           9
	//  176  311:new             #274 <Class LinearGradient>
	//  177  314:dup             
	//  178  315:fconst_0        
	//  179  316:fload_1         
	//  180  317:fconst_0        
	//  181  318:fload_2         
	//  182  319:iconst_3        
	//  183  320:newarray        int[]
	//  184  322:dup             
	//  185  323:iconst_0        
	//  186  324:iload           4
	//  187  326:iastore         
	//  188  327:dup             
	//  189  328:iconst_1        
	//  190  329:iload           5
	//  191  331:iastore         
	//  192  332:dup             
	//  193  333:iconst_2        
	//  194  334:iload           6
	//  195  336:iastore         
	//  196  337:iconst_3        
	//  197  338:newarray        float[]
	//  198  340:dup             
	//  199  341:iconst_0        
	//  200  342:fconst_0        
	//  201  343:fastore         
	//  202  344:dup             
	//  203  345:iconst_1        
	//  204  346:ldc1            #193 <Float 0.5F>
	//  205  348:fastore         
	//  206  349:dup             
	//  207  350:iconst_2        
	//  208  351:fconst_1        
	//  209  352:fastore         
	//  210  353:aload           7
	//  211  355:invokespecial   #277 <Method void LinearGradient(float, float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  212  358:invokevirtual   #272 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//  213  361:pop             
		b.setAntiAlias(false);
	//  214  362:aload_0         
	//  215  363:getfield        #112 <Field Paint b>
	//  216  366:iconst_0        
	//  217  367:invokevirtual   #116 <Method void Paint.setAntiAlias(boolean)>
	//  218  370:return          
	}

	private static int e(float f1)
	{
		int j = Math.round(f1);
	//    0    0:fload_0         
	//    1    1:invokestatic    #99  <Method int Math.round(float)>
	//    2    4:istore_1        
		if(j % 2 == 1)
	//*   3    5:iload_1         
	//*   4    6:iconst_2        
	//*   5    7:irem            
	//*   6    8:iconst_1        
	//*   7    9:icmpne          16
			return j - 1;
	//    8   12:iload_1         
	//    9   13:iconst_1        
	//   10   14:isub            
	//   11   15:ireturn         
		else
			return j;
	//   12   16:iload_1         
	//   13   17:ireturn         
	}

	public float c()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field float i>
	//    2    4:freturn         
	}

	final void c(float f1)
	{
		if(u != f1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #171 <Field float u>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			u = f1;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #171 <Field float u>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #280 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	public void d(float f1)
	{
		e(f1, h);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #122 <Field float h>
	//    4    6:invokevirtual   #119 <Method void e(float, float)>
	//    5    9:return          
	}

	public void d(boolean flag)
	{
		l = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field boolean l>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #280 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void draw(Canvas canvas)
	{
		if(p)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field boolean p>
	//*   2    4:ifeq            20
		{
			a(getBounds());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #285 <Method Rect getBounds()>
	//    6   12:invokespecial   #287 <Method void a(Rect)>
			p = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #51  <Field boolean p>
		}
		c(canvas);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokespecial   #289 <Method void c(Canvas)>
		super.draw(canvas);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #291 <Method void DrawableWrapper.draw(Canvas)>
	//   16   30:return          
	}

	void e(float f1, float f2)
	{
		if(f1 < 0.0F || f2 < 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:iflt            12
	//*   4    6:fload_2         
	//*   5    7:fconst_0        
	//*   6    8:fcmpg           
	//*   7    9:ifge            23
			throw new IllegalArgumentException("invalid shadow size");
	//    8   12:new             #293 <Class IllegalArgumentException>
	//    9   15:dup             
	//   10   16:ldc2            #295 <String "invalid shadow size">
	//   11   19:invokespecial   #298 <Method void IllegalArgumentException(String)>
	//   12   22:athrow          
		float f3 = e(f1);
	//   13   23:fload_1         
	//   14   24:invokestatic    #300 <Method int e(float)>
	//   15   27:i2f             
	//   16   28:fstore_3        
		float f4 = e(f2);
	//   17   29:fload_2         
	//   18   30:invokestatic    #300 <Method int e(float)>
	//   19   33:i2f             
	//   20   34:fstore          4
		f1 = f3;
	//   21   36:fload_3         
	//   22   37:fstore_1        
		if(f3 > f4)
	//*  23   38:fload_3         
	//*  24   39:fload           4
	//*  25   41:fcmpl           
	//*  26   42:ifle            64
		{
			f2 = f4;
	//   27   45:fload           4
	//   28   47:fstore_2        
			f1 = f2;
	//   29   48:fload_2         
	//   30   49:fstore_1        
			if(!s)
	//*  31   50:aload_0         
	//*  32   51:getfield        #55  <Field boolean s>
	//*  33   54:ifne            64
			{
				s = true;
	//   34   57:aload_0         
	//   35   58:iconst_1        
	//   36   59:putfield        #55  <Field boolean s>
				f1 = f2;
	//   37   62:fload_2         
	//   38   63:fstore_1        
			}
		}
		if(i == f1 && h == f4)
	//*  39   64:aload_0         
	//*  40   65:getfield        #192 <Field float i>
	//*  41   68:fload_1         
	//*  42   69:fcmpl           
	//*  43   70:ifne            84
	//*  44   73:aload_0         
	//*  45   74:getfield        #122 <Field float h>
	//*  46   77:fload           4
	//*  47   79:fcmpl           
	//*  48   80:ifne            84
		{
			return;
	//   49   83:return          
		} else
		{
			i = f1;
	//   50   84:aload_0         
	//   51   85:fload_1         
	//   52   86:putfield        #192 <Field float i>
			h = f4;
	//   53   89:aload_0         
	//   54   90:fload           4
	//   55   92:putfield        #122 <Field float h>
			k = Math.round(1.5F * f1);
	//   56   95:aload_0         
	//   57   96:ldc1            #123 <Float 1.5F>
	//   58   98:fload_1         
	//   59   99:fmul            
	//   60  100:invokestatic    #99  <Method int Math.round(float)>
	//   61  103:i2f             
	//   62  104:putfield        #184 <Field float k>
			g = f4;
	//   63  107:aload_0         
	//   64  108:fload           4
	//   65  110:putfield        #302 <Field float g>
			p = true;
	//   66  113:aload_0         
	//   67  114:iconst_1        
	//   68  115:putfield        #51  <Field boolean p>
			invalidateSelf();
	//   69  118:aload_0         
	//   70  119:invokevirtual   #280 <Method void invalidateSelf()>
			return;
	//   71  122:return          
		}
	}

	public int getOpacity()
	{
		return -3;
	//    0    0:bipush          -3
	//    1    2:ireturn         
	}

	public boolean getPadding(Rect rect)
	{
		int j = (int)Math.ceil(d(h, a, l));
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field float h>
	//    2    4:aload_0         
	//    3    5:getfield        #101 <Field float a>
	//    4    8:aload_0         
	//    5    9:getfield        #53  <Field boolean l>
	//    6   12:invokestatic    #307 <Method float d(float, float, boolean)>
	//    7   15:f2d             
	//    8   16:invokestatic    #310 <Method double Math.ceil(double)>
	//    9   19:d2i             
	//   10   20:istore_2        
		int i1 = (int)Math.ceil(c(h, a, l));
	//   11   21:aload_0         
	//   12   22:getfield        #122 <Field float h>
	//   13   25:aload_0         
	//   14   26:getfield        #101 <Field float a>
	//   15   29:aload_0         
	//   16   30:getfield        #53  <Field boolean l>
	//   17   33:invokestatic    #312 <Method float c(float, float, boolean)>
	//   18   36:f2d             
	//   19   37:invokestatic    #310 <Method double Math.ceil(double)>
	//   20   40:d2i             
	//   21   41:istore_3        
		rect.set(i1, j, i1, j);
	//   22   42:aload_1         
	//   23   43:iload_3         
	//   24   44:iload_2         
	//   25   45:iload_3         
	//   26   46:iload_2         
	//   27   47:invokevirtual   #314 <Method void Rect.set(int, int, int, int)>
		return true;
	//   28   50:iconst_1        
	//   29   51:ireturn         
	}

	public void onBoundsChange(Rect rect)
	{
		p = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #51  <Field boolean p>
	//    3    5:return          
	}

	public void setAlpha(int j)
	{
		super.setAlpha(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #318 <Method void DrawableWrapper.setAlpha(int)>
		d.setAlpha(j);
	//    3    5:aload_0         
	//    4    6:getfield        #85  <Field Paint d>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #319 <Method void Paint.setAlpha(int)>
		b.setAlpha(j);
	//    7   13:aload_0         
	//    8   14:getfield        #112 <Field Paint b>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #319 <Method void Paint.setAlpha(int)>
	//   11   21:return          
	}

	static final double c = Math.cos(Math.toRadians(45D));
	float a;
	final Paint b;
	final Paint d = new Paint(5);
	final RectF e = new RectF();
	Path f;
	float g;
	float h;
	float i;
	float k;
	private boolean l;
	private final int m;
	private final int n;
	private final int o;
	private boolean p;
	private boolean s;
	private float u;

	static 
	{
	//    0    0:ldc2w           #31  <Double 45D>
	//    1    3:invokestatic    #38  <Method double Math.toRadians(double)>
	//    2    6:invokestatic    #41  <Method double Math.cos(double)>
	//    3    9:putstatic       #43  <Field double c>
	//*   4   12:return          
	}
}
