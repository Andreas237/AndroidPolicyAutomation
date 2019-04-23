// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.graphics.drawable.DrawableWrapper;

public class ShadowDrawableWrapper extends DrawableWrapper
{

	public ShadowDrawableWrapper(Context context, Drawable drawable, float f, float f1, float f2)
	{
		super(drawable);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #57  <Method void DrawableWrapper(Drawable)>
		dirty = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #59  <Field boolean dirty>
		addPaddingForCorners = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #61  <Field boolean addPaddingForCorners>
		printedShadowClipWarning = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #63  <Field boolean printedShadowClipWarning>
		shadowStartColor = ContextCompat.getColor(context, android.support.design.R.color.design_fab_shadow_start_color);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:getstatic       #68  <Field int android.support.design.R$color.design_fab_shadow_start_color>
	//   15   25:invokestatic    #74  <Method int ContextCompat.getColor(Context, int)>
	//   16   28:putfield        #76  <Field int shadowStartColor>
		shadowMiddleColor = ContextCompat.getColor(context, android.support.design.R.color.design_fab_shadow_mid_color);
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:getstatic       #79  <Field int android.support.design.R$color.design_fab_shadow_mid_color>
	//   20   36:invokestatic    #74  <Method int ContextCompat.getColor(Context, int)>
	//   21   39:putfield        #81  <Field int shadowMiddleColor>
		shadowEndColor = ContextCompat.getColor(context, android.support.design.R.color.design_fab_shadow_end_color);
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getstatic       #84  <Field int android.support.design.R$color.design_fab_shadow_end_color>
	//   25   47:invokestatic    #74  <Method int ContextCompat.getColor(Context, int)>
	//   26   50:putfield        #86  <Field int shadowEndColor>
	//   27   53:aload_0         
	//   28   54:new             #88  <Class Paint>
	//   29   57:dup             
	//   30   58:iconst_5        
	//   31   59:invokespecial   #91  <Method void Paint(int)>
	//   32   62:putfield        #93  <Field Paint cornerShadowPaint>
		cornerShadowPaint.setStyle(android.graphics.Paint.Style.FILL);
	//   33   65:aload_0         
	//   34   66:getfield        #93  <Field Paint cornerShadowPaint>
	//   35   69:getstatic       #99  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   36   72:invokevirtual   #103 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		cornerRadius = Math.round(f);
	//   37   75:aload_0         
	//   38   76:fload_3         
	//   39   77:invokestatic    #107 <Method int Math.round(float)>
	//   40   80:i2f             
	//   41   81:putfield        #109 <Field float cornerRadius>
	//   42   84:aload_0         
	//   43   85:new             #111 <Class RectF>
	//   44   88:dup             
	//   45   89:invokespecial   #113 <Method void RectF()>
	//   46   92:putfield        #115 <Field RectF contentBounds>
		edgeShadowPaint = new Paint(cornerShadowPaint);
	//   47   95:aload_0         
	//   48   96:new             #88  <Class Paint>
	//   49   99:dup             
	//   50  100:aload_0         
	//   51  101:getfield        #93  <Field Paint cornerShadowPaint>
	//   52  104:invokespecial   #118 <Method void Paint(Paint)>
	//   53  107:putfield        #120 <Field Paint edgeShadowPaint>
		edgeShadowPaint.setAntiAlias(false);
	//   54  110:aload_0         
	//   55  111:getfield        #120 <Field Paint edgeShadowPaint>
	//   56  114:iconst_0        
	//   57  115:invokevirtual   #124 <Method void Paint.setAntiAlias(boolean)>
		setShadowSize(f1, f2);
	//   58  118:aload_0         
	//   59  119:fload           4
	//   60  121:fload           5
	//   61  123:invokevirtual   #128 <Method void setShadowSize(float, float)>
	//   62  126:return          
	}

	private void buildComponents(Rect rect)
	{
		float f = rawMaxShadowSize * 1.5F;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field float rawMaxShadowSize>
	//    2    4:ldc1            #13  <Float 1.5F>
	//    3    6:fmul            
	//    4    7:fstore_2        
		contentBounds.set((float)rect.left + rawMaxShadowSize, (float)rect.top + f, (float)rect.right - rawMaxShadowSize, (float)rect.bottom - f);
	//    5    8:aload_0         
	//    6    9:getfield        #115 <Field RectF contentBounds>
	//    7   12:aload_1         
	//    8   13:getfield        #137 <Field int Rect.left>
	//    9   16:i2f             
	//   10   17:aload_0         
	//   11   18:getfield        #132 <Field float rawMaxShadowSize>
	//   12   21:fadd            
	//   13   22:aload_1         
	//   14   23:getfield        #140 <Field int Rect.top>
	//   15   26:i2f             
	//   16   27:fload_2         
	//   17   28:fadd            
	//   18   29:aload_1         
	//   19   30:getfield        #143 <Field int Rect.right>
	//   20   33:i2f             
	//   21   34:aload_0         
	//   22   35:getfield        #132 <Field float rawMaxShadowSize>
	//   23   38:fsub            
	//   24   39:aload_1         
	//   25   40:getfield        #146 <Field int Rect.bottom>
	//   26   43:i2f             
	//   27   44:fload_2         
	//   28   45:fsub            
	//   29   46:invokevirtual   #150 <Method void RectF.set(float, float, float, float)>
		getWrappedDrawable().setBounds((int)contentBounds.left, (int)contentBounds.top, (int)contentBounds.right, (int)contentBounds.bottom);
	//   30   49:aload_0         
	//   31   50:invokevirtual   #154 <Method Drawable getWrappedDrawable()>
	//   32   53:aload_0         
	//   33   54:getfield        #115 <Field RectF contentBounds>
	//   34   57:getfield        #156 <Field float RectF.left>
	//   35   60:f2i             
	//   36   61:aload_0         
	//   37   62:getfield        #115 <Field RectF contentBounds>
	//   38   65:getfield        #158 <Field float RectF.top>
	//   39   68:f2i             
	//   40   69:aload_0         
	//   41   70:getfield        #115 <Field RectF contentBounds>
	//   42   73:getfield        #160 <Field float RectF.right>
	//   43   76:f2i             
	//   44   77:aload_0         
	//   45   78:getfield        #115 <Field RectF contentBounds>
	//   46   81:getfield        #162 <Field float RectF.bottom>
	//   47   84:f2i             
	//   48   85:invokevirtual   #168 <Method void Drawable.setBounds(int, int, int, int)>
		buildShadowCorners();
	//   49   88:aload_0         
	//   50   89:invokespecial   #171 <Method void buildShadowCorners()>
	//   51   92:return          
	}

	private void buildShadowCorners()
	{
		float f = cornerRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field float cornerRadius>
	//    2    4:fstore_1        
		Object obj = ((Object) (new RectF(-f, -f, f, f)));
	//    3    5:new             #111 <Class RectF>
	//    4    8:dup             
	//    5    9:fload_1         
	//    6   10:fneg            
	//    7   11:fload_1         
	//    8   12:fneg            
	//    9   13:fload_1         
	//   10   14:fload_1         
	//   11   15:invokespecial   #173 <Method void RectF(float, float, float, float)>
	//   12   18:astore          7
		RectF rectf = new RectF(((RectF) (obj)));
	//   13   20:new             #111 <Class RectF>
	//   14   23:dup             
	//   15   24:aload           7
	//   16   26:invokespecial   #176 <Method void RectF(RectF)>
	//   17   29:astore          8
		f = shadowSize;
	//   18   31:aload_0         
	//   19   32:getfield        #178 <Field float shadowSize>
	//   20   35:fstore_1        
		rectf.inset(-f, -f);
	//   21   36:aload           8
	//   22   38:fload_1         
	//   23   39:fneg            
	//   24   40:fload_1         
	//   25   41:fneg            
	//   26   42:invokevirtual   #181 <Method void RectF.inset(float, float)>
		Object obj1 = ((Object) (cornerShadowPath));
	//   27   45:aload_0         
	//   28   46:getfield        #183 <Field Path cornerShadowPath>
	//   29   49:astore          9
		if(obj1 == null)
	//*  30   51:aload           9
	//*  31   53:ifnonnull       70
			cornerShadowPath = new Path();
	//   32   56:aload_0         
	//   33   57:new             #185 <Class Path>
	//   34   60:dup             
	//   35   61:invokespecial   #186 <Method void Path()>
	//   36   64:putfield        #183 <Field Path cornerShadowPath>
		else
	//*  37   67:goto            75
			((Path) (obj1)).reset();
	//   38   70:aload           9
	//   39   72:invokevirtual   #189 <Method void Path.reset()>
		cornerShadowPath.setFillType(android.graphics.Path.FillType.EVEN_ODD);
	//   40   75:aload_0         
	//   41   76:getfield        #183 <Field Path cornerShadowPath>
	//   42   79:getstatic       #195 <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
	//   43   82:invokevirtual   #199 <Method void Path.setFillType(android.graphics.Path$FillType)>
		cornerShadowPath.moveTo(-cornerRadius, 0.0F);
	//   44   85:aload_0         
	//   45   86:getfield        #183 <Field Path cornerShadowPath>
	//   46   89:aload_0         
	//   47   90:getfield        #109 <Field float cornerRadius>
	//   48   93:fneg            
	//   49   94:fconst_0        
	//   50   95:invokevirtual   #202 <Method void Path.moveTo(float, float)>
		cornerShadowPath.rLineTo(-shadowSize, 0.0F);
	//   51   98:aload_0         
	//   52   99:getfield        #183 <Field Path cornerShadowPath>
	//   53  102:aload_0         
	//   54  103:getfield        #178 <Field float shadowSize>
	//   55  106:fneg            
	//   56  107:fconst_0        
	//   57  108:invokevirtual   #205 <Method void Path.rLineTo(float, float)>
		cornerShadowPath.arcTo(rectf, 180F, 90F, false);
	//   58  111:aload_0         
	//   59  112:getfield        #183 <Field Path cornerShadowPath>
	//   60  115:aload           8
	//   61  117:ldc1            #206 <Float 180F>
	//   62  119:ldc1            #207 <Float 90F>
	//   63  121:iconst_0        
	//   64  122:invokevirtual   #211 <Method void Path.arcTo(RectF, float, float, boolean)>
		cornerShadowPath.arcTo(((RectF) (obj)), 270F, -90F, false);
	//   65  125:aload_0         
	//   66  126:getfield        #183 <Field Path cornerShadowPath>
	//   67  129:aload           7
	//   68  131:ldc1            #212 <Float 270F>
	//   69  133:ldc1            #213 <Float -90F>
	//   70  135:iconst_0        
	//   71  136:invokevirtual   #211 <Method void Path.arcTo(RectF, float, float, boolean)>
		cornerShadowPath.close();
	//   72  139:aload_0         
	//   73  140:getfield        #183 <Field Path cornerShadowPath>
	//   74  143:invokevirtual   #216 <Method void Path.close()>
		f = -rectf.top;
	//   75  146:aload           8
	//   76  148:getfield        #158 <Field float RectF.top>
	//   77  151:fneg            
	//   78  152:fstore_1        
		if(f > 0.0F)
	//*  79  153:fload_1         
	//*  80  154:fconst_0        
	//*  81  155:fcmpl           
	//*  82  156:ifle            262
		{
			float f1 = cornerRadius / f;
	//   83  159:aload_0         
	//   84  160:getfield        #109 <Field float cornerRadius>
	//   85  163:fload_1         
	//   86  164:fdiv            
	//   87  165:fstore_2        
			float f3 = (1.0F - f1) / 2.0F;
	//   88  166:fconst_1        
	//   89  167:fload_2         
	//   90  168:fsub            
	//   91  169:fconst_2        
	//   92  170:fdiv            
	//   93  171:fstore_3        
			obj1 = ((Object) (cornerShadowPaint));
	//   94  172:aload_0         
	//   95  173:getfield        #93  <Field Paint cornerShadowPaint>
	//   96  176:astore          9
			int i = shadowStartColor;
	//   97  178:aload_0         
	//   98  179:getfield        #76  <Field int shadowStartColor>
	//   99  182:istore          4
			int k = shadowMiddleColor;
	//  100  184:aload_0         
	//  101  185:getfield        #81  <Field int shadowMiddleColor>
	//  102  188:istore          5
			int i1 = shadowEndColor;
	//  103  190:aload_0         
	//  104  191:getfield        #86  <Field int shadowEndColor>
	//  105  194:istore          6
			android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
	//  106  196:getstatic       #222 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//  107  199:astore          10
			((Paint) (obj1)).setShader(((android.graphics.Shader) (new RadialGradient(0.0F, 0.0F, f, new int[] {
				0, i, k, i1
			}, new float[] {
				0.0F, f1, f3 + f1, 1.0F
			}, tilemode))));
	//  108  201:aload           9
	//  109  203:new             #224 <Class RadialGradient>
	//  110  206:dup             
	//  111  207:fconst_0        
	//  112  208:fconst_0        
	//  113  209:fload_1         
	//  114  210:iconst_4        
	//  115  211:newarray        int[]
	//  116  213:dup             
	//  117  214:iconst_0        
	//  118  215:iconst_0        
	//  119  216:iastore         
	//  120  217:dup             
	//  121  218:iconst_1        
	//  122  219:iload           4
	//  123  221:iastore         
	//  124  222:dup             
	//  125  223:iconst_2        
	//  126  224:iload           5
	//  127  226:iastore         
	//  128  227:dup             
	//  129  228:iconst_3        
	//  130  229:iload           6
	//  131  231:iastore         
	//  132  232:iconst_4        
	//  133  233:newarray        float[]
	//  134  235:dup             
	//  135  236:iconst_0        
	//  136  237:fconst_0        
	//  137  238:fastore         
	//  138  239:dup             
	//  139  240:iconst_1        
	//  140  241:fload_2         
	//  141  242:fastore         
	//  142  243:dup             
	//  143  244:iconst_2        
	//  144  245:fload_3         
	//  145  246:fload_2         
	//  146  247:fadd            
	//  147  248:fastore         
	//  148  249:dup             
	//  149  250:iconst_3        
	//  150  251:fconst_1        
	//  151  252:fastore         
	//  152  253:aload           10
	//  153  255:invokespecial   #227 <Method void RadialGradient(float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  154  258:invokevirtual   #231 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//  155  261:pop             
		}
		obj1 = ((Object) (edgeShadowPaint));
	//  156  262:aload_0         
	//  157  263:getfield        #120 <Field Paint edgeShadowPaint>
	//  158  266:astore          9
		f = ((RectF) (obj)).top;
	//  159  268:aload           7
	//  160  270:getfield        #158 <Field float RectF.top>
	//  161  273:fstore_1        
		float f2 = rectf.top;
	//  162  274:aload           8
	//  163  276:getfield        #158 <Field float RectF.top>
	//  164  279:fstore_2        
		int j = shadowStartColor;
	//  165  280:aload_0         
	//  166  281:getfield        #76  <Field int shadowStartColor>
	//  167  284:istore          4
		int l = shadowMiddleColor;
	//  168  286:aload_0         
	//  169  287:getfield        #81  <Field int shadowMiddleColor>
	//  170  290:istore          5
		int j1 = shadowEndColor;
	//  171  292:aload_0         
	//  172  293:getfield        #86  <Field int shadowEndColor>
	//  173  296:istore          6
		obj = ((Object) (android.graphics.Shader.TileMode.CLAMP));
	//  174  298:getstatic       #222 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//  175  301:astore          7
		((Paint) (obj1)).setShader(((android.graphics.Shader) (new LinearGradient(0.0F, f, 0.0F, f2, new int[] {
			j, l, j1
		}, new float[] {
			0.0F, 0.5F, 1.0F
		}, ((android.graphics.Shader.TileMode) (obj))))));
	//  176  303:aload           9
	//  177  305:new             #233 <Class LinearGradient>
	//  178  308:dup             
	//  179  309:fconst_0        
	//  180  310:fload_1         
	//  181  311:fconst_0        
	//  182  312:fload_2         
	//  183  313:iconst_3        
	//  184  314:newarray        int[]
	//  185  316:dup             
	//  186  317:iconst_0        
	//  187  318:iload           4
	//  188  320:iastore         
	//  189  321:dup             
	//  190  322:iconst_1        
	//  191  323:iload           5
	//  192  325:iastore         
	//  193  326:dup             
	//  194  327:iconst_2        
	//  195  328:iload           6
	//  196  330:iastore         
	//  197  331:iconst_3        
	//  198  332:newarray        float[]
	//  199  334:dup             
	//  200  335:iconst_0        
	//  201  336:fconst_0        
	//  202  337:fastore         
	//  203  338:dup             
	//  204  339:iconst_1        
	//  205  340:ldc1            #11  <Float 0.5F>
	//  206  342:fastore         
	//  207  343:dup             
	//  208  344:iconst_2        
	//  209  345:fconst_1        
	//  210  346:fastore         
	//  211  347:aload           7
	//  212  349:invokespecial   #236 <Method void LinearGradient(float, float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  213  352:invokevirtual   #231 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//  214  355:pop             
		edgeShadowPaint.setAntiAlias(false);
	//  215  356:aload_0         
	//  216  357:getfield        #120 <Field Paint edgeShadowPaint>
	//  217  360:iconst_0        
	//  218  361:invokevirtual   #124 <Method void Paint.setAntiAlias(boolean)>
	//  219  364:return          
	}

	public static float calculateHorizontalPadding(float f, float f1, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            17
			return (float)((double)f + (1.0D - COS_45) * (double)f1);
	//    2    4:fload_0         
	//    3    5:f2d             
	//    4    6:dconst_1        
	//    5    7:getstatic       #51  <Field double COS_45>
	//    6   10:dsub            
	//    7   11:fload_1         
	//    8   12:f2d             
	//    9   13:dmul            
	//   10   14:dadd            
	//   11   15:d2f             
	//   12   16:freturn         
		else
			return f;
	//   13   17:fload_0         
	//   14   18:freturn         
	}

	public static float calculateVerticalPadding(float f, float f1, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            20
			return (float)((double)(f * 1.5F) + (1.0D - COS_45) * (double)f1);
	//    2    4:fload_0         
	//    3    5:ldc1            #13  <Float 1.5F>
	//    4    7:fmul            
	//    5    8:f2d             
	//    6    9:dconst_1        
	//    7   10:getstatic       #51  <Field double COS_45>
	//    8   13:dsub            
	//    9   14:fload_1         
	//   10   15:f2d             
	//   11   16:dmul            
	//   12   17:dadd            
	//   13   18:d2f             
	//   14   19:freturn         
		else
			return f * 1.5F;
	//   15   20:fload_0         
	//   16   21:ldc1            #13  <Float 1.5F>
	//   17   23:fmul            
	//   18   24:freturn         
	}

	private void drawShadow(Canvas canvas)
	{
		int j = canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #247 <Method int Canvas.save()>
	//    2    4:istore          10
		canvas.rotate(rotation, contentBounds.centerX(), contentBounds.centerY());
	//    3    6:aload_1         
	//    4    7:aload_0         
	//    5    8:getfield        #249 <Field float rotation>
	//    6   11:aload_0         
	//    7   12:getfield        #115 <Field RectF contentBounds>
	//    8   15:invokevirtual   #253 <Method float RectF.centerX()>
	//    9   18:aload_0         
	//   10   19:getfield        #115 <Field RectF contentBounds>
	//   11   22:invokevirtual   #256 <Method float RectF.centerY()>
	//   12   25:invokevirtual   #260 <Method void Canvas.rotate(float, float, float)>
		float f2 = cornerRadius;
	//   13   28:aload_0         
	//   14   29:getfield        #109 <Field float cornerRadius>
	//   15   32:fstore          4
		float f3 = -f2 - shadowSize;
	//   16   34:fload           4
	//   17   36:fneg            
	//   18   37:aload_0         
	//   19   38:getfield        #178 <Field float shadowSize>
	//   20   41:fsub            
	//   21   42:fstore          5
		float f = contentBounds.width();
	//   22   44:aload_0         
	//   23   45:getfield        #115 <Field RectF contentBounds>
	//   24   48:invokevirtual   #263 <Method float RectF.width()>
	//   25   51:fstore_2        
		float f4 = f2 * 2.0F;
	//   26   52:fload           4
	//   27   54:fconst_2        
	//   28   55:fmul            
	//   29   56:fstore          6
		boolean flag;
		if(f - f4 > 0.0F)
	//*  30   58:fload_2         
	//*  31   59:fload           6
	//*  32   61:fsub            
	//*  33   62:fconst_0        
	//*  34   63:fcmpl           
	//*  35   64:ifle            73
			flag = true;
	//   36   67:iconst_1        
	//   37   68:istore          8
		else
	//*  38   70:goto            76
			flag = false;
	//   39   73:iconst_0        
	//   40   74:istore          8
		boolean flag1;
		if(contentBounds.height() - f4 > 0.0F)
	//*  41   76:aload_0         
	//*  42   77:getfield        #115 <Field RectF contentBounds>
	//*  43   80:invokevirtual   #266 <Method float RectF.height()>
	//*  44   83:fload           6
	//*  45   85:fsub            
	//*  46   86:fconst_0        
	//*  47   87:fcmpl           
	//*  48   88:ifle            97
			flag1 = true;
	//   49   91:iconst_1        
	//   50   92:istore          9
		else
	//*  51   94:goto            100
			flag1 = false;
	//   52   97:iconst_0        
	//   53   98:istore          9
		f = rawShadowSize;
	//   54  100:aload_0         
	//   55  101:getfield        #268 <Field float rawShadowSize>
	//   56  104:fstore_2        
		float f5 = f2 / ((f - 0.5F * f) + f2);
	//   57  105:fload           4
	//   58  107:fload_2         
	//   59  108:ldc1            #11  <Float 0.5F>
	//   60  110:fload_2         
	//   61  111:fmul            
	//   62  112:fsub            
	//   63  113:fload           4
	//   64  115:fadd            
	//   65  116:fdiv            
	//   66  117:fstore          7
		float f1 = f2 / ((f - 0.25F * f) + f2);
	//   67  119:fload           4
	//   68  121:fload_2         
	//   69  122:ldc1            #15  <Float 0.25F>
	//   70  124:fload_2         
	//   71  125:fmul            
	//   72  126:fsub            
	//   73  127:fload           4
	//   74  129:fadd            
	//   75  130:fdiv            
	//   76  131:fstore_3        
		f = f2 / ((f - f * 1.0F) + f2);
	//   77  132:fload           4
	//   78  134:fload_2         
	//   79  135:fload_2         
	//   80  136:fconst_1        
	//   81  137:fmul            
	//   82  138:fsub            
	//   83  139:fload           4
	//   84  141:fadd            
	//   85  142:fdiv            
	//   86  143:fstore_2        
		int k = canvas.save();
	//   87  144:aload_1         
	//   88  145:invokevirtual   #247 <Method int Canvas.save()>
	//   89  148:istore          11
		canvas.translate(contentBounds.left + f2, contentBounds.top + f2);
	//   90  150:aload_1         
	//   91  151:aload_0         
	//   92  152:getfield        #115 <Field RectF contentBounds>
	//   93  155:getfield        #156 <Field float RectF.left>
	//   94  158:fload           4
	//   95  160:fadd            
	//   96  161:aload_0         
	//   97  162:getfield        #115 <Field RectF contentBounds>
	//   98  165:getfield        #158 <Field float RectF.top>
	//   99  168:fload           4
	//  100  170:fadd            
	//  101  171:invokevirtual   #271 <Method void Canvas.translate(float, float)>
		canvas.scale(f5, f1);
	//  102  174:aload_1         
	//  103  175:fload           7
	//  104  177:fload_3         
	//  105  178:invokevirtual   #274 <Method void Canvas.scale(float, float)>
		canvas.drawPath(cornerShadowPath, cornerShadowPaint);
	//  106  181:aload_1         
	//  107  182:aload_0         
	//  108  183:getfield        #183 <Field Path cornerShadowPath>
	//  109  186:aload_0         
	//  110  187:getfield        #93  <Field Paint cornerShadowPaint>
	//  111  190:invokevirtual   #278 <Method void Canvas.drawPath(Path, Paint)>
		if(flag)
	//* 112  193:iload           8
	//* 113  195:ifeq            236
		{
			canvas.scale(1.0F / f5, 1.0F);
	//  114  198:aload_1         
	//  115  199:fconst_1        
	//  116  200:fload           7
	//  117  202:fdiv            
	//  118  203:fconst_1        
	//  119  204:invokevirtual   #274 <Method void Canvas.scale(float, float)>
			canvas.drawRect(0.0F, f3, contentBounds.width() - f4, -cornerRadius, edgeShadowPaint);
	//  120  207:aload_1         
	//  121  208:fconst_0        
	//  122  209:fload           5
	//  123  211:aload_0         
	//  124  212:getfield        #115 <Field RectF contentBounds>
	//  125  215:invokevirtual   #263 <Method float RectF.width()>
	//  126  218:fload           6
	//  127  220:fsub            
	//  128  221:aload_0         
	//  129  222:getfield        #109 <Field float cornerRadius>
	//  130  225:fneg            
	//  131  226:aload_0         
	//  132  227:getfield        #120 <Field Paint edgeShadowPaint>
	//  133  230:invokevirtual   #282 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
	//* 134  233:goto            236
		canvas.restoreToCount(k);
	//  135  236:aload_1         
	//  136  237:iload           11
	//  137  239:invokevirtual   #285 <Method void Canvas.restoreToCount(int)>
		k = canvas.save();
	//  138  242:aload_1         
	//  139  243:invokevirtual   #247 <Method int Canvas.save()>
	//  140  246:istore          11
		canvas.translate(contentBounds.right - f2, contentBounds.bottom - f2);
	//  141  248:aload_1         
	//  142  249:aload_0         
	//  143  250:getfield        #115 <Field RectF contentBounds>
	//  144  253:getfield        #160 <Field float RectF.right>
	//  145  256:fload           4
	//  146  258:fsub            
	//  147  259:aload_0         
	//  148  260:getfield        #115 <Field RectF contentBounds>
	//  149  263:getfield        #162 <Field float RectF.bottom>
	//  150  266:fload           4
	//  151  268:fsub            
	//  152  269:invokevirtual   #271 <Method void Canvas.translate(float, float)>
		canvas.scale(f5, f);
	//  153  272:aload_1         
	//  154  273:fload           7
	//  155  275:fload_2         
	//  156  276:invokevirtual   #274 <Method void Canvas.scale(float, float)>
		canvas.rotate(180F);
	//  157  279:aload_1         
	//  158  280:ldc1            #206 <Float 180F>
	//  159  282:invokevirtual   #288 <Method void Canvas.rotate(float)>
		canvas.drawPath(cornerShadowPath, cornerShadowPaint);
	//  160  285:aload_1         
	//  161  286:aload_0         
	//  162  287:getfield        #183 <Field Path cornerShadowPath>
	//  163  290:aload_0         
	//  164  291:getfield        #93  <Field Paint cornerShadowPaint>
	//  165  294:invokevirtual   #278 <Method void Canvas.drawPath(Path, Paint)>
		if(flag)
	//* 166  297:iload           8
	//* 167  299:ifeq            345
		{
			canvas.scale(1.0F / f5, 1.0F);
	//  168  302:aload_1         
	//  169  303:fconst_1        
	//  170  304:fload           7
	//  171  306:fdiv            
	//  172  307:fconst_1        
	//  173  308:invokevirtual   #274 <Method void Canvas.scale(float, float)>
			canvas.drawRect(0.0F, f3, contentBounds.width() - f4, -cornerRadius + shadowSize, edgeShadowPaint);
	//  174  311:aload_1         
	//  175  312:fconst_0        
	//  176  313:fload           5
	//  177  315:aload_0         
	//  178  316:getfield        #115 <Field RectF contentBounds>
	//  179  319:invokevirtual   #263 <Method float RectF.width()>
	//  180  322:fload           6
	//  181  324:fsub            
	//  182  325:aload_0         
	//  183  326:getfield        #109 <Field float cornerRadius>
	//  184  329:fneg            
	//  185  330:aload_0         
	//  186  331:getfield        #178 <Field float shadowSize>
	//  187  334:fadd            
	//  188  335:aload_0         
	//  189  336:getfield        #120 <Field Paint edgeShadowPaint>
	//  190  339:invokevirtual   #282 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
	//* 191  342:goto            345
		canvas.restoreToCount(k);
	//  192  345:aload_1         
	//  193  346:iload           11
	//  194  348:invokevirtual   #285 <Method void Canvas.restoreToCount(int)>
		int i = canvas.save();
	//  195  351:aload_1         
	//  196  352:invokevirtual   #247 <Method int Canvas.save()>
	//  197  355:istore          8
		canvas.translate(contentBounds.left + f2, contentBounds.bottom - f2);
	//  198  357:aload_1         
	//  199  358:aload_0         
	//  200  359:getfield        #115 <Field RectF contentBounds>
	//  201  362:getfield        #156 <Field float RectF.left>
	//  202  365:fload           4
	//  203  367:fadd            
	//  204  368:aload_0         
	//  205  369:getfield        #115 <Field RectF contentBounds>
	//  206  372:getfield        #162 <Field float RectF.bottom>
	//  207  375:fload           4
	//  208  377:fsub            
	//  209  378:invokevirtual   #271 <Method void Canvas.translate(float, float)>
		canvas.scale(f5, f);
	//  210  381:aload_1         
	//  211  382:fload           7
	//  212  384:fload_2         
	//  213  385:invokevirtual   #274 <Method void Canvas.scale(float, float)>
		canvas.rotate(270F);
	//  214  388:aload_1         
	//  215  389:ldc1            #212 <Float 270F>
	//  216  391:invokevirtual   #288 <Method void Canvas.rotate(float)>
		canvas.drawPath(cornerShadowPath, cornerShadowPaint);
	//  217  394:aload_1         
	//  218  395:aload_0         
	//  219  396:getfield        #183 <Field Path cornerShadowPath>
	//  220  399:aload_0         
	//  221  400:getfield        #93  <Field Paint cornerShadowPaint>
	//  222  403:invokevirtual   #278 <Method void Canvas.drawPath(Path, Paint)>
		if(flag1)
	//* 223  406:iload           9
	//* 224  408:ifeq            445
		{
			canvas.scale(1.0F / f, 1.0F);
	//  225  411:aload_1         
	//  226  412:fconst_1        
	//  227  413:fload_2         
	//  228  414:fdiv            
	//  229  415:fconst_1        
	//  230  416:invokevirtual   #274 <Method void Canvas.scale(float, float)>
			canvas.drawRect(0.0F, f3, contentBounds.height() - f4, -cornerRadius, edgeShadowPaint);
	//  231  419:aload_1         
	//  232  420:fconst_0        
	//  233  421:fload           5
	//  234  423:aload_0         
	//  235  424:getfield        #115 <Field RectF contentBounds>
	//  236  427:invokevirtual   #266 <Method float RectF.height()>
	//  237  430:fload           6
	//  238  432:fsub            
	//  239  433:aload_0         
	//  240  434:getfield        #109 <Field float cornerRadius>
	//  241  437:fneg            
	//  242  438:aload_0         
	//  243  439:getfield        #120 <Field Paint edgeShadowPaint>
	//  244  442:invokevirtual   #282 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
		canvas.restoreToCount(i);
	//  245  445:aload_1         
	//  246  446:iload           8
	//  247  448:invokevirtual   #285 <Method void Canvas.restoreToCount(int)>
		i = canvas.save();
	//  248  451:aload_1         
	//  249  452:invokevirtual   #247 <Method int Canvas.save()>
	//  250  455:istore          8
		canvas.translate(contentBounds.right - f2, contentBounds.top + f2);
	//  251  457:aload_1         
	//  252  458:aload_0         
	//  253  459:getfield        #115 <Field RectF contentBounds>
	//  254  462:getfield        #160 <Field float RectF.right>
	//  255  465:fload           4
	//  256  467:fsub            
	//  257  468:aload_0         
	//  258  469:getfield        #115 <Field RectF contentBounds>
	//  259  472:getfield        #158 <Field float RectF.top>
	//  260  475:fload           4
	//  261  477:fadd            
	//  262  478:invokevirtual   #271 <Method void Canvas.translate(float, float)>
		canvas.scale(f5, f1);
	//  263  481:aload_1         
	//  264  482:fload           7
	//  265  484:fload_3         
	//  266  485:invokevirtual   #274 <Method void Canvas.scale(float, float)>
		canvas.rotate(90F);
	//  267  488:aload_1         
	//  268  489:ldc1            #207 <Float 90F>
	//  269  491:invokevirtual   #288 <Method void Canvas.rotate(float)>
		canvas.drawPath(cornerShadowPath, cornerShadowPaint);
	//  270  494:aload_1         
	//  271  495:aload_0         
	//  272  496:getfield        #183 <Field Path cornerShadowPath>
	//  273  499:aload_0         
	//  274  500:getfield        #93  <Field Paint cornerShadowPaint>
	//  275  503:invokevirtual   #278 <Method void Canvas.drawPath(Path, Paint)>
		if(flag1)
	//* 276  506:iload           9
	//* 277  508:ifeq            545
		{
			canvas.scale(1.0F / f1, 1.0F);
	//  278  511:aload_1         
	//  279  512:fconst_1        
	//  280  513:fload_3         
	//  281  514:fdiv            
	//  282  515:fconst_1        
	//  283  516:invokevirtual   #274 <Method void Canvas.scale(float, float)>
			canvas.drawRect(0.0F, f3, contentBounds.height() - f4, -cornerRadius, edgeShadowPaint);
	//  284  519:aload_1         
	//  285  520:fconst_0        
	//  286  521:fload           5
	//  287  523:aload_0         
	//  288  524:getfield        #115 <Field RectF contentBounds>
	//  289  527:invokevirtual   #266 <Method float RectF.height()>
	//  290  530:fload           6
	//  291  532:fsub            
	//  292  533:aload_0         
	//  293  534:getfield        #109 <Field float cornerRadius>
	//  294  537:fneg            
	//  295  538:aload_0         
	//  296  539:getfield        #120 <Field Paint edgeShadowPaint>
	//  297  542:invokevirtual   #282 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
		canvas.restoreToCount(i);
	//  298  545:aload_1         
	//  299  546:iload           8
	//  300  548:invokevirtual   #285 <Method void Canvas.restoreToCount(int)>
		canvas.restoreToCount(j);
	//  301  551:aload_1         
	//  302  552:iload           10
	//  303  554:invokevirtual   #285 <Method void Canvas.restoreToCount(int)>
	//  304  557:return          
	}

	private static int toEven(float f)
	{
		int j = Math.round(f);
	//    0    0:fload_0         
	//    1    1:invokestatic    #107 <Method int Math.round(float)>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j % 2 == 1)
	//*   5    7:iload_2         
	//*   6    8:iconst_2        
	//*   7    9:irem            
	//*   8   10:iconst_1        
	//*   9   11:icmpne          18
			i = j - 1;
	//   10   14:iload_2         
	//   11   15:iconst_1        
	//   12   16:isub            
	//   13   17:istore_1        
		return i;
	//   14   18:iload_1         
	//   15   19:ireturn         
	}

	public void draw(Canvas canvas)
	{
		if(dirty)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean dirty>
	//*   2    4:ifeq            20
		{
			buildComponents(getBounds());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #294 <Method Rect getBounds()>
	//    6   12:invokespecial   #296 <Method void buildComponents(Rect)>
			dirty = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #59  <Field boolean dirty>
		}
		drawShadow(canvas);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokespecial   #298 <Method void drawShadow(Canvas)>
		super.draw(canvas);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #300 <Method void DrawableWrapper.draw(Canvas)>
	//   16   30:return          
	}

	public float getCornerRadius()
	{
		return cornerRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field float cornerRadius>
	//    2    4:freturn         
	}

	public float getMaxShadowSize()
	{
		return rawMaxShadowSize;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field float rawMaxShadowSize>
	//    2    4:freturn         
	}

	public float getMinHeight()
	{
		float f = rawMaxShadowSize;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field float rawMaxShadowSize>
	//    2    4:fstore_1        
		return Math.max(f, cornerRadius + (f * 1.5F) / 2.0F) * 2.0F + rawMaxShadowSize * 1.5F * 2.0F;
	//    3    5:fload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #109 <Field float cornerRadius>
	//    6   10:fload_1         
	//    7   11:ldc1            #13  <Float 1.5F>
	//    8   13:fmul            
	//    9   14:fconst_2        
	//   10   15:fdiv            
	//   11   16:fadd            
	//   12   17:invokestatic    #307 <Method float Math.max(float, float)>
	//   13   20:fconst_2        
	//   14   21:fmul            
	//   15   22:aload_0         
	//   16   23:getfield        #132 <Field float rawMaxShadowSize>
	//   17   26:ldc1            #13  <Float 1.5F>
	//   18   28:fmul            
	//   19   29:fconst_2        
	//   20   30:fmul            
	//   21   31:fadd            
	//   22   32:freturn         
	}

	public float getMinWidth()
	{
		float f = rawMaxShadowSize;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field float rawMaxShadowSize>
	//    2    4:fstore_1        
		return Math.max(f, cornerRadius + f / 2.0F) * 2.0F + rawMaxShadowSize * 2.0F;
	//    3    5:fload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #109 <Field float cornerRadius>
	//    6   10:fload_1         
	//    7   11:fconst_2        
	//    8   12:fdiv            
	//    9   13:fadd            
	//   10   14:invokestatic    #307 <Method float Math.max(float, float)>
	//   11   17:fconst_2        
	//   12   18:fmul            
	//   13   19:aload_0         
	//   14   20:getfield        #132 <Field float rawMaxShadowSize>
	//   15   23:fconst_2        
	//   16   24:fmul            
	//   17   25:fadd            
	//   18   26:freturn         
	}

	public int getOpacity()
	{
		return -3;
	//    0    0:bipush          -3
	//    1    2:ireturn         
	}

	public boolean getPadding(Rect rect)
	{
		int i = (int)Math.ceil(calculateVerticalPadding(rawMaxShadowSize, cornerRadius, addPaddingForCorners));
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field float rawMaxShadowSize>
	//    2    4:aload_0         
	//    3    5:getfield        #109 <Field float cornerRadius>
	//    4    8:aload_0         
	//    5    9:getfield        #61  <Field boolean addPaddingForCorners>
	//    6   12:invokestatic    #313 <Method float calculateVerticalPadding(float, float, boolean)>
	//    7   15:f2d             
	//    8   16:invokestatic    #316 <Method double Math.ceil(double)>
	//    9   19:d2i             
	//   10   20:istore_2        
		int j = (int)Math.ceil(calculateHorizontalPadding(rawMaxShadowSize, cornerRadius, addPaddingForCorners));
	//   11   21:aload_0         
	//   12   22:getfield        #132 <Field float rawMaxShadowSize>
	//   13   25:aload_0         
	//   14   26:getfield        #109 <Field float cornerRadius>
	//   15   29:aload_0         
	//   16   30:getfield        #61  <Field boolean addPaddingForCorners>
	//   17   33:invokestatic    #318 <Method float calculateHorizontalPadding(float, float, boolean)>
	//   18   36:f2d             
	//   19   37:invokestatic    #316 <Method double Math.ceil(double)>
	//   20   40:d2i             
	//   21   41:istore_3        
		rect.set(j, i, j, i);
	//   22   42:aload_1         
	//   23   43:iload_3         
	//   24   44:iload_2         
	//   25   45:iload_3         
	//   26   46:iload_2         
	//   27   47:invokevirtual   #320 <Method void Rect.set(int, int, int, int)>
		return true;
	//   28   50:iconst_1        
	//   29   51:ireturn         
	}

	public float getShadowSize()
	{
		return rawShadowSize;
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field float rawShadowSize>
	//    2    4:freturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		dirty = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #59  <Field boolean dirty>
	//    3    5:return          
	}

	public void setAddPaddingForCorners(boolean flag)
	{
		addPaddingForCorners = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #61  <Field boolean addPaddingForCorners>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #326 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setAlpha(int i)
	{
		super.setAlpha(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #329 <Method void DrawableWrapper.setAlpha(int)>
		cornerShadowPaint.setAlpha(i);
	//    3    5:aload_0         
	//    4    6:getfield        #93  <Field Paint cornerShadowPaint>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #330 <Method void Paint.setAlpha(int)>
		edgeShadowPaint.setAlpha(i);
	//    7   13:aload_0         
	//    8   14:getfield        #120 <Field Paint edgeShadowPaint>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #330 <Method void Paint.setAlpha(int)>
	//   11   21:return          
	}

	public void setCornerRadius(float f)
	{
		f = Math.round(f);
	//    0    0:fload_1         
	//    1    1:invokestatic    #107 <Method int Math.round(float)>
	//    2    4:i2f             
	//    3    5:fstore_1        
		if(cornerRadius == f)
	//*   4    6:aload_0         
	//*   5    7:getfield        #109 <Field float cornerRadius>
	//*   6   10:fload_1         
	//*   7   11:fcmpl           
	//*   8   12:ifne            16
		{
			return;
	//    9   15:return          
		} else
		{
			cornerRadius = f;
	//   10   16:aload_0         
	//   11   17:fload_1         
	//   12   18:putfield        #109 <Field float cornerRadius>
			dirty = true;
	//   13   21:aload_0         
	//   14   22:iconst_1        
	//   15   23:putfield        #59  <Field boolean dirty>
			invalidateSelf();
	//   16   26:aload_0         
	//   17   27:invokevirtual   #326 <Method void invalidateSelf()>
			return;
	//   18   30:return          
		}
	}

	public void setMaxShadowSize(float f)
	{
		setShadowSize(rawShadowSize, f);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #268 <Field float rawShadowSize>
	//    3    5:fload_1         
	//    4    6:invokevirtual   #128 <Method void setShadowSize(float, float)>
	//    5    9:return          
	}

	public final void setRotation(float f)
	{
		if(rotation != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #249 <Field float rotation>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			rotation = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #249 <Field float rotation>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #326 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	public void setShadowSize(float f)
	{
		setShadowSize(f, rawMaxShadowSize);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #132 <Field float rawMaxShadowSize>
	//    4    6:invokevirtual   #128 <Method void setShadowSize(float, float)>
	//    5    9:return          
	}

	public void setShadowSize(float f, float f1)
	{
		if(f >= 0.0F && f1 >= 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:iflt            102
	//*   4    6:fload_2         
	//*   5    7:fconst_0        
	//*   6    8:fcmpg           
	//*   7    9:iflt            102
		{
			float f2 = toEven(f);
	//    8   12:fload_1         
	//    9   13:invokestatic    #335 <Method int toEven(float)>
	//   10   16:i2f             
	//   11   17:fstore_3        
			f1 = toEven(f1);
	//   12   18:fload_2         
	//   13   19:invokestatic    #335 <Method int toEven(float)>
	//   14   22:i2f             
	//   15   23:fstore_2        
			f = f2;
	//   16   24:fload_3         
	//   17   25:fstore_1        
			if(f2 > f1)
	//*  18   26:fload_3         
	//*  19   27:fload_2         
	//*  20   28:fcmpl           
	//*  21   29:ifle            46
			{
				if(!printedShadowClipWarning)
	//*  22   32:aload_0         
	//*  23   33:getfield        #63  <Field boolean printedShadowClipWarning>
	//*  24   36:ifne            44
					printedShadowClipWarning = true;
	//   25   39:aload_0         
	//   26   40:iconst_1        
	//   27   41:putfield        #63  <Field boolean printedShadowClipWarning>
				f = f1;
	//   28   44:fload_2         
	//   29   45:fstore_1        
			}
			if(rawShadowSize == f && rawMaxShadowSize == f1)
	//*  30   46:aload_0         
	//*  31   47:getfield        #268 <Field float rawShadowSize>
	//*  32   50:fload_1         
	//*  33   51:fcmpl           
	//*  34   52:ifne            65
	//*  35   55:aload_0         
	//*  36   56:getfield        #132 <Field float rawMaxShadowSize>
	//*  37   59:fload_2         
	//*  38   60:fcmpl           
	//*  39   61:ifne            65
			{
				return;
	//   40   64:return          
			} else
			{
				rawShadowSize = f;
	//   41   65:aload_0         
	//   42   66:fload_1         
	//   43   67:putfield        #268 <Field float rawShadowSize>
				rawMaxShadowSize = f1;
	//   44   70:aload_0         
	//   45   71:fload_2         
	//   46   72:putfield        #132 <Field float rawMaxShadowSize>
				shadowSize = Math.round(f * 1.5F);
	//   47   75:aload_0         
	//   48   76:fload_1         
	//   49   77:ldc1            #13  <Float 1.5F>
	//   50   79:fmul            
	//   51   80:invokestatic    #107 <Method int Math.round(float)>
	//   52   83:i2f             
	//   53   84:putfield        #178 <Field float shadowSize>
				maxShadowSize = f1;
	//   54   87:aload_0         
	//   55   88:fload_2         
	//   56   89:putfield        #337 <Field float maxShadowSize>
				dirty = true;
	//   57   92:aload_0         
	//   58   93:iconst_1        
	//   59   94:putfield        #59  <Field boolean dirty>
				invalidateSelf();
	//   60   97:aload_0         
	//   61   98:invokevirtual   #326 <Method void invalidateSelf()>
				return;
	//   62  101:return          
			}
		} else
		{
			throw new IllegalArgumentException("invalid shadow size");
	//   63  102:new             #339 <Class IllegalArgumentException>
	//   64  105:dup             
	//   65  106:ldc2            #341 <String "invalid shadow size">
	//   66  109:invokespecial   #344 <Method void IllegalArgumentException(String)>
	//   67  112:athrow          
		}
	}

	static final double COS_45 = Math.cos(Math.toRadians(45D));
	static final float SHADOW_BOTTOM_SCALE = 1F;
	static final float SHADOW_HORIZ_SCALE = 0.5F;
	static final float SHADOW_MULTIPLIER = 1.5F;
	static final float SHADOW_TOP_SCALE = 0.25F;
	private boolean addPaddingForCorners;
	final RectF contentBounds = new RectF();
	float cornerRadius;
	final Paint cornerShadowPaint = new Paint(5);
	Path cornerShadowPath;
	private boolean dirty;
	final Paint edgeShadowPaint;
	float maxShadowSize;
	private boolean printedShadowClipWarning;
	float rawMaxShadowSize;
	float rawShadowSize;
	private float rotation;
	private final int shadowEndColor;
	private final int shadowMiddleColor;
	float shadowSize;
	private final int shadowStartColor;

	static 
	{
	//    0    0:ldc2w           #39  <Double 45D>
	//    1    3:invokestatic    #46  <Method double Math.toRadians(double)>
	//    2    6:invokestatic    #49  <Method double Math.cos(double)>
	//    3    9:putstatic       #51  <Field double COS_45>
	//*   4   12:return          
	}
}
