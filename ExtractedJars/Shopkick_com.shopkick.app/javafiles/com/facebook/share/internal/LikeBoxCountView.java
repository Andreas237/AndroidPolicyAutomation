// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.widget.FrameLayout;
import android.widget.TextView;

public class LikeBoxCountView extends FrameLayout
{
	public static final class LikeBoxCountViewCaretPosition extends Enum
	{

		public static LikeBoxCountViewCaretPosition valueOf(String s)
		{
			return (LikeBoxCountViewCaretPosition)Enum.valueOf(com/facebook/share/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition, s);
		//    0    0:ldc1            #2   <Class LikeBoxCountView$LikeBoxCountViewCaretPosition>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LikeBoxCountView$LikeBoxCountViewCaretPosition>
		//    4    9:areturn         
		}

		public static LikeBoxCountViewCaretPosition[] values()
		{
			return (LikeBoxCountViewCaretPosition[])((LikeBoxCountViewCaretPosition []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition_3B_.clone()>
		//    2    6:checkcast       #46  <Class LikeBoxCountView$LikeBoxCountViewCaretPosition[]>
		//    3    9:areturn         
		}

		private static final LikeBoxCountViewCaretPosition $VALUES[];
		public static final LikeBoxCountViewCaretPosition BOTTOM;
		public static final LikeBoxCountViewCaretPosition LEFT;
		public static final LikeBoxCountViewCaretPosition RIGHT;
		public static final LikeBoxCountViewCaretPosition TOP;

		static 
		{
			LEFT = new LikeBoxCountViewCaretPosition("LEFT", 0);
		//    0    0:new             #2   <Class LikeBoxCountView$LikeBoxCountViewCaretPosition>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "LEFT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void LikeBoxCountView$LikeBoxCountViewCaretPosition(String, int)>
		//    5   10:putstatic       #24  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition LEFT>
			TOP = new LikeBoxCountViewCaretPosition("TOP", 1);
		//    6   13:new             #2   <Class LikeBoxCountView$LikeBoxCountViewCaretPosition>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "TOP">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void LikeBoxCountView$LikeBoxCountViewCaretPosition(String, int)>
		//   11   23:putstatic       #27  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition TOP>
			RIGHT = new LikeBoxCountViewCaretPosition("RIGHT", 2);
		//   12   26:new             #2   <Class LikeBoxCountView$LikeBoxCountViewCaretPosition>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "RIGHT">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void LikeBoxCountView$LikeBoxCountViewCaretPosition(String, int)>
		//   17   36:putstatic       #30  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition RIGHT>
			BOTTOM = new LikeBoxCountViewCaretPosition("BOTTOM", 3);
		//   18   39:new             #2   <Class LikeBoxCountView$LikeBoxCountViewCaretPosition>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "BOTTOM">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void LikeBoxCountView$LikeBoxCountViewCaretPosition(String, int)>
		//   23   49:putstatic       #33  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition BOTTOM>
			$VALUES = (new LikeBoxCountViewCaretPosition[] {
				LEFT, TOP, RIGHT, BOTTOM
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       LikeBoxCountViewCaretPosition[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition LEFT>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition TOP>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition RIGHT>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition BOTTOM>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition[] $VALUES>
		//*  43   83:return          
		}

		private LikeBoxCountViewCaretPosition(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public LikeBoxCountView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void FrameLayout(Context)>
		caretPosition = LikeBoxCountViewCaretPosition.LEFT;
	//    3    5:aload_0         
	//    4    6:getstatic       #30  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition LikeBoxCountView$LikeBoxCountViewCaretPosition.LEFT>
	//    5    9:putfield        #32  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition caretPosition>
		initialize(context);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #35  <Method void initialize(Context)>
	//    9   17:return          
	}

	private void drawBorder(Canvas canvas, float f, float f1, float f2, float f3)
	{
		Path path = new Path();
	//    0    0:new             #41  <Class Path>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void Path()>
	//    3    7:astore          10
		float f5 = borderRadius * 2.0F;
	//    4    9:aload_0         
	//    5   10:getfield        #46  <Field float borderRadius>
	//    6   13:fconst_2        
	//    7   14:fmul            
	//    8   15:fstore          7
		float f4 = f + f5;
	//    9   17:fload_2         
	//   10   18:fload           7
	//   11   20:fadd            
	//   12   21:fstore          6
		float f8 = f1 + f5;
	//   13   23:fload_3         
	//   14   24:fload           7
	//   15   26:fadd            
	//   16   27:fstore          9
		path.addArc(new RectF(f, f1, f4, f8), -180F, 90F);
	//   17   29:aload           10
	//   18   31:new             #48  <Class RectF>
	//   19   34:dup             
	//   20   35:fload_2         
	//   21   36:fload_3         
	//   22   37:fload           6
	//   23   39:fload           9
	//   24   41:invokespecial   #51  <Method void RectF(float, float, float, float)>
	//   25   44:ldc1            #52  <Float -180F>
	//   26   46:ldc1            #53  <Float 90F>
	//   27   48:invokevirtual   #57  <Method void Path.addArc(RectF, float, float)>
		if(caretPosition == LikeBoxCountViewCaretPosition.TOP)
	//*  28   51:aload_0         
	//*  29   52:getfield        #32  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition caretPosition>
	//*  30   55:getstatic       #60  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition LikeBoxCountView$LikeBoxCountViewCaretPosition.TOP>
	//*  31   58:if_acmpne       118
		{
			float f6 = f2 - f;
	//   32   61:fload           4
	//   33   63:fload_2         
	//   34   64:fsub            
	//   35   65:fstore          8
			path.lineTo((f6 - caretWidth) / 2.0F + f, f1);
	//   36   67:aload           10
	//   37   69:fload           8
	//   38   71:aload_0         
	//   39   72:getfield        #62  <Field float caretWidth>
	//   40   75:fsub            
	//   41   76:fconst_2        
	//   42   77:fdiv            
	//   43   78:fload_2         
	//   44   79:fadd            
	//   45   80:fload_3         
	//   46   81:invokevirtual   #66  <Method void Path.lineTo(float, float)>
			path.lineTo(f6 / 2.0F + f, f1 - caretHeight);
	//   47   84:aload           10
	//   48   86:fload           8
	//   49   88:fconst_2        
	//   50   89:fdiv            
	//   51   90:fload_2         
	//   52   91:fadd            
	//   53   92:fload_3         
	//   54   93:aload_0         
	//   55   94:getfield        #68  <Field float caretHeight>
	//   56   97:fsub            
	//   57   98:invokevirtual   #66  <Method void Path.lineTo(float, float)>
			path.lineTo((f6 + caretWidth) / 2.0F + f, f1);
	//   58  101:aload           10
	//   59  103:fload           8
	//   60  105:aload_0         
	//   61  106:getfield        #62  <Field float caretWidth>
	//   62  109:fadd            
	//   63  110:fconst_2        
	//   64  111:fdiv            
	//   65  112:fload_2         
	//   66  113:fadd            
	//   67  114:fload_3         
	//   68  115:invokevirtual   #66  <Method void Path.lineTo(float, float)>
		}
		path.lineTo(f2 - borderRadius, f1);
	//   69  118:aload           10
	//   70  120:fload           4
	//   71  122:aload_0         
	//   72  123:getfield        #46  <Field float borderRadius>
	//   73  126:fsub            
	//   74  127:fload_3         
	//   75  128:invokevirtual   #66  <Method void Path.lineTo(float, float)>
		float f7 = f2 - f5;
	//   76  131:fload           4
	//   77  133:fload           7
	//   78  135:fsub            
	//   79  136:fstore          8
		path.addArc(new RectF(f7, f1, f2, f8), -90F, 90F);
	//   80  138:aload           10
	//   81  140:new             #48  <Class RectF>
	//   82  143:dup             
	//   83  144:fload           8
	//   84  146:fload_3         
	//   85  147:fload           4
	//   86  149:fload           9
	//   87  151:invokespecial   #51  <Method void RectF(float, float, float, float)>
	//   88  154:ldc1            #69  <Float -90F>
	//   89  156:ldc1            #53  <Float 90F>
	//   90  158:invokevirtual   #57  <Method void Path.addArc(RectF, float, float)>
		if(caretPosition == LikeBoxCountViewCaretPosition.RIGHT)
	//*  91  161:aload_0         
	//*  92  162:getfield        #32  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition caretPosition>
	//*  93  165:getstatic       #72  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition LikeBoxCountView$LikeBoxCountViewCaretPosition.RIGHT>
	//*  94  168:if_acmpne       231
		{
			float f9 = f3 - f1;
	//   95  171:fload           5
	//   96  173:fload_3         
	//   97  174:fsub            
	//   98  175:fstore          9
			path.lineTo(f2, (f9 - caretWidth) / 2.0F + f1);
	//   99  177:aload           10
	//  100  179:fload           4
	//  101  181:fload           9
	//  102  183:aload_0         
	//  103  184:getfield        #62  <Field float caretWidth>
	//  104  187:fsub            
	//  105  188:fconst_2        
	//  106  189:fdiv            
	//  107  190:fload_3         
	//  108  191:fadd            
	//  109  192:invokevirtual   #66  <Method void Path.lineTo(float, float)>
			path.lineTo(caretHeight + f2, f9 / 2.0F + f1);
	//  110  195:aload           10
	//  111  197:aload_0         
	//  112  198:getfield        #68  <Field float caretHeight>
	//  113  201:fload           4
	//  114  203:fadd            
	//  115  204:fload           9
	//  116  206:fconst_2        
	//  117  207:fdiv            
	//  118  208:fload_3         
	//  119  209:fadd            
	//  120  210:invokevirtual   #66  <Method void Path.lineTo(float, float)>
			path.lineTo(f2, (f9 + caretWidth) / 2.0F + f1);
	//  121  213:aload           10
	//  122  215:fload           4
	//  123  217:fload           9
	//  124  219:aload_0         
	//  125  220:getfield        #62  <Field float caretWidth>
	//  126  223:fadd            
	//  127  224:fconst_2        
	//  128  225:fdiv            
	//  129  226:fload_3         
	//  130  227:fadd            
	//  131  228:invokevirtual   #66  <Method void Path.lineTo(float, float)>
		}
		path.lineTo(f2, f3 - borderRadius);
	//  132  231:aload           10
	//  133  233:fload           4
	//  134  235:fload           5
	//  135  237:aload_0         
	//  136  238:getfield        #46  <Field float borderRadius>
	//  137  241:fsub            
	//  138  242:invokevirtual   #66  <Method void Path.lineTo(float, float)>
		f5 = f3 - f5;
	//  139  245:fload           5
	//  140  247:fload           7
	//  141  249:fsub            
	//  142  250:fstore          7
		path.addArc(new RectF(f7, f5, f2, f3), 0.0F, 90F);
	//  143  252:aload           10
	//  144  254:new             #48  <Class RectF>
	//  145  257:dup             
	//  146  258:fload           8
	//  147  260:fload           7
	//  148  262:fload           4
	//  149  264:fload           5
	//  150  266:invokespecial   #51  <Method void RectF(float, float, float, float)>
	//  151  269:fconst_0        
	//  152  270:ldc1            #53  <Float 90F>
	//  153  272:invokevirtual   #57  <Method void Path.addArc(RectF, float, float)>
		if(caretPosition == LikeBoxCountViewCaretPosition.BOTTOM)
	//* 154  275:aload_0         
	//* 155  276:getfield        #32  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition caretPosition>
	//* 156  279:getstatic       #75  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition LikeBoxCountView$LikeBoxCountViewCaretPosition.BOTTOM>
	//* 157  282:if_acmpne       345
		{
			f2 -= f;
	//  158  285:fload           4
	//  159  287:fload_2         
	//  160  288:fsub            
	//  161  289:fstore          4
			path.lineTo((caretWidth + f2) / 2.0F + f, f3);
	//  162  291:aload           10
	//  163  293:aload_0         
	//  164  294:getfield        #62  <Field float caretWidth>
	//  165  297:fload           4
	//  166  299:fadd            
	//  167  300:fconst_2        
	//  168  301:fdiv            
	//  169  302:fload_2         
	//  170  303:fadd            
	//  171  304:fload           5
	//  172  306:invokevirtual   #66  <Method void Path.lineTo(float, float)>
			path.lineTo(f2 / 2.0F + f, caretHeight + f3);
	//  173  309:aload           10
	//  174  311:fload           4
	//  175  313:fconst_2        
	//  176  314:fdiv            
	//  177  315:fload_2         
	//  178  316:fadd            
	//  179  317:aload_0         
	//  180  318:getfield        #68  <Field float caretHeight>
	//  181  321:fload           5
	//  182  323:fadd            
	//  183  324:invokevirtual   #66  <Method void Path.lineTo(float, float)>
			path.lineTo((f2 - caretWidth) / 2.0F + f, f3);
	//  184  327:aload           10
	//  185  329:fload           4
	//  186  331:aload_0         
	//  187  332:getfield        #62  <Field float caretWidth>
	//  188  335:fsub            
	//  189  336:fconst_2        
	//  190  337:fdiv            
	//  191  338:fload_2         
	//  192  339:fadd            
	//  193  340:fload           5
	//  194  342:invokevirtual   #66  <Method void Path.lineTo(float, float)>
		}
		path.lineTo(borderRadius + f, f3);
	//  195  345:aload           10
	//  196  347:aload_0         
	//  197  348:getfield        #46  <Field float borderRadius>
	//  198  351:fload_2         
	//  199  352:fadd            
	//  200  353:fload           5
	//  201  355:invokevirtual   #66  <Method void Path.lineTo(float, float)>
		path.addArc(new RectF(f, f5, f4, f3), 90F, 90F);
	//  202  358:aload           10
	//  203  360:new             #48  <Class RectF>
	//  204  363:dup             
	//  205  364:fload_2         
	//  206  365:fload           7
	//  207  367:fload           6
	//  208  369:fload           5
	//  209  371:invokespecial   #51  <Method void RectF(float, float, float, float)>
	//  210  374:ldc1            #53  <Float 90F>
	//  211  376:ldc1            #53  <Float 90F>
	//  212  378:invokevirtual   #57  <Method void Path.addArc(RectF, float, float)>
		if(caretPosition == LikeBoxCountViewCaretPosition.LEFT)
	//* 213  381:aload_0         
	//* 214  382:getfield        #32  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition caretPosition>
	//* 215  385:getstatic       #30  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition LikeBoxCountView$LikeBoxCountViewCaretPosition.LEFT>
	//* 216  388:if_acmpne       448
		{
			f2 = f3 - f1;
	//  217  391:fload           5
	//  218  393:fload_3         
	//  219  394:fsub            
	//  220  395:fstore          4
			path.lineTo(f, (caretWidth + f2) / 2.0F + f1);
	//  221  397:aload           10
	//  222  399:fload_2         
	//  223  400:aload_0         
	//  224  401:getfield        #62  <Field float caretWidth>
	//  225  404:fload           4
	//  226  406:fadd            
	//  227  407:fconst_2        
	//  228  408:fdiv            
	//  229  409:fload_3         
	//  230  410:fadd            
	//  231  411:invokevirtual   #66  <Method void Path.lineTo(float, float)>
			path.lineTo(f - caretHeight, f2 / 2.0F + f1);
	//  232  414:aload           10
	//  233  416:fload_2         
	//  234  417:aload_0         
	//  235  418:getfield        #68  <Field float caretHeight>
	//  236  421:fsub            
	//  237  422:fload           4
	//  238  424:fconst_2        
	//  239  425:fdiv            
	//  240  426:fload_3         
	//  241  427:fadd            
	//  242  428:invokevirtual   #66  <Method void Path.lineTo(float, float)>
			path.lineTo(f, (f2 - caretWidth) / 2.0F + f1);
	//  243  431:aload           10
	//  244  433:fload_2         
	//  245  434:fload           4
	//  246  436:aload_0         
	//  247  437:getfield        #62  <Field float caretWidth>
	//  248  440:fsub            
	//  249  441:fconst_2        
	//  250  442:fdiv            
	//  251  443:fload_3         
	//  252  444:fadd            
	//  253  445:invokevirtual   #66  <Method void Path.lineTo(float, float)>
		}
		path.lineTo(f, f1 + borderRadius);
	//  254  448:aload           10
	//  255  450:fload_2         
	//  256  451:fload_3         
	//  257  452:aload_0         
	//  258  453:getfield        #46  <Field float borderRadius>
	//  259  456:fadd            
	//  260  457:invokevirtual   #66  <Method void Path.lineTo(float, float)>
		canvas.drawPath(path, borderPaint);
	//  261  460:aload_1         
	//  262  461:aload           10
	//  263  463:aload_0         
	//  264  464:getfield        #77  <Field Paint borderPaint>
	//  265  467:invokevirtual   #83  <Method void Canvas.drawPath(Path, Paint)>
	//  266  470:return          
	}

	private void initialize(Context context)
	{
		setWillNotDraw(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #87  <Method void setWillNotDraw(boolean)>
		caretHeight = getResources().getDimension(com.facebook.common.R.dimen.com_facebook_likeboxcountview_caret_height);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #91  <Method Resources getResources()>
	//    6   10:getstatic       #96  <Field int com.facebook.common.R$dimen.com_facebook_likeboxcountview_caret_height>
	//    7   13:invokevirtual   #102 <Method float Resources.getDimension(int)>
	//    8   16:putfield        #68  <Field float caretHeight>
		caretWidth = getResources().getDimension(com.facebook.common.R.dimen.com_facebook_likeboxcountview_caret_width);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #91  <Method Resources getResources()>
	//   12   24:getstatic       #105 <Field int com.facebook.common.R$dimen.com_facebook_likeboxcountview_caret_width>
	//   13   27:invokevirtual   #102 <Method float Resources.getDimension(int)>
	//   14   30:putfield        #62  <Field float caretWidth>
		borderRadius = getResources().getDimension(com.facebook.common.R.dimen.com_facebook_likeboxcountview_border_radius);
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:invokevirtual   #91  <Method Resources getResources()>
	//   18   38:getstatic       #108 <Field int com.facebook.common.R$dimen.com_facebook_likeboxcountview_border_radius>
	//   19   41:invokevirtual   #102 <Method float Resources.getDimension(int)>
	//   20   44:putfield        #46  <Field float borderRadius>
		borderPaint = new Paint();
	//   21   47:aload_0         
	//   22   48:new             #110 <Class Paint>
	//   23   51:dup             
	//   24   52:invokespecial   #111 <Method void Paint()>
	//   25   55:putfield        #77  <Field Paint borderPaint>
		borderPaint.setColor(getResources().getColor(com.facebook.common.R.color.com_facebook_likeboxcountview_border_color));
	//   26   58:aload_0         
	//   27   59:getfield        #77  <Field Paint borderPaint>
	//   28   62:aload_0         
	//   29   63:invokevirtual   #91  <Method Resources getResources()>
	//   30   66:getstatic       #116 <Field int com.facebook.common.R$color.com_facebook_likeboxcountview_border_color>
	//   31   69:invokevirtual   #120 <Method int Resources.getColor(int)>
	//   32   72:invokevirtual   #124 <Method void Paint.setColor(int)>
		borderPaint.setStrokeWidth(getResources().getDimension(com.facebook.common.R.dimen.com_facebook_likeboxcountview_border_width));
	//   33   75:aload_0         
	//   34   76:getfield        #77  <Field Paint borderPaint>
	//   35   79:aload_0         
	//   36   80:invokevirtual   #91  <Method Resources getResources()>
	//   37   83:getstatic       #127 <Field int com.facebook.common.R$dimen.com_facebook_likeboxcountview_border_width>
	//   38   86:invokevirtual   #102 <Method float Resources.getDimension(int)>
	//   39   89:invokevirtual   #131 <Method void Paint.setStrokeWidth(float)>
		borderPaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   40   92:aload_0         
	//   41   93:getfield        #77  <Field Paint borderPaint>
	//   42   96:getstatic       #137 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   43   99:invokevirtual   #141 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		initializeLikeCountLabel(context);
	//   44  102:aload_0         
	//   45  103:aload_1         
	//   46  104:invokespecial   #144 <Method void initializeLikeCountLabel(Context)>
		addView(((android.view.View) (likeCountLabel)));
	//   47  107:aload_0         
	//   48  108:aload_0         
	//   49  109:getfield        #146 <Field TextView likeCountLabel>
	//   50  112:invokevirtual   #150 <Method void addView(android.view.View)>
		setCaretPosition(caretPosition);
	//   51  115:aload_0         
	//   52  116:aload_0         
	//   53  117:getfield        #32  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition caretPosition>
	//   54  120:invokevirtual   #154 <Method void setCaretPosition(LikeBoxCountView$LikeBoxCountViewCaretPosition)>
	//   55  123:return          
	}

	private void initializeLikeCountLabel(Context context)
	{
		likeCountLabel = new TextView(context);
	//    0    0:aload_0         
	//    1    1:new             #156 <Class TextView>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #157 <Method void TextView(Context)>
	//    5    9:putfield        #146 <Field TextView likeCountLabel>
		context = ((Context) (new android.widget.FrameLayout.LayoutParams(-1, -1)));
	//    6   12:new             #159 <Class android.widget.FrameLayout$LayoutParams>
	//    7   15:dup             
	//    8   16:iconst_m1       
	//    9   17:iconst_m1       
	//   10   18:invokespecial   #162 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   11   21:astore_1        
		likeCountLabel.setLayoutParams(((android.view.ViewGroup.LayoutParams) (context)));
	//   12   22:aload_0         
	//   13   23:getfield        #146 <Field TextView likeCountLabel>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #166 <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		likeCountLabel.setGravity(17);
	//   16   30:aload_0         
	//   17   31:getfield        #146 <Field TextView likeCountLabel>
	//   18   34:bipush          17
	//   19   36:invokevirtual   #169 <Method void TextView.setGravity(int)>
		likeCountLabel.setTextSize(0, getResources().getDimension(com.facebook.common.R.dimen.com_facebook_likeboxcountview_text_size));
	//   20   39:aload_0         
	//   21   40:getfield        #146 <Field TextView likeCountLabel>
	//   22   43:iconst_0        
	//   23   44:aload_0         
	//   24   45:invokevirtual   #91  <Method Resources getResources()>
	//   25   48:getstatic       #172 <Field int com.facebook.common.R$dimen.com_facebook_likeboxcountview_text_size>
	//   26   51:invokevirtual   #102 <Method float Resources.getDimension(int)>
	//   27   54:invokevirtual   #176 <Method void TextView.setTextSize(int, float)>
		likeCountLabel.setTextColor(getResources().getColor(com.facebook.common.R.color.com_facebook_likeboxcountview_text_color));
	//   28   57:aload_0         
	//   29   58:getfield        #146 <Field TextView likeCountLabel>
	//   30   61:aload_0         
	//   31   62:invokevirtual   #91  <Method Resources getResources()>
	//   32   65:getstatic       #179 <Field int com.facebook.common.R$color.com_facebook_likeboxcountview_text_color>
	//   33   68:invokevirtual   #120 <Method int Resources.getColor(int)>
	//   34   71:invokevirtual   #182 <Method void TextView.setTextColor(int)>
		textPadding = getResources().getDimensionPixelSize(com.facebook.common.R.dimen.com_facebook_likeboxcountview_text_padding);
	//   35   74:aload_0         
	//   36   75:aload_0         
	//   37   76:invokevirtual   #91  <Method Resources getResources()>
	//   38   79:getstatic       #185 <Field int com.facebook.common.R$dimen.com_facebook_likeboxcountview_text_padding>
	//   39   82:invokevirtual   #188 <Method int Resources.getDimensionPixelSize(int)>
	//   40   85:putfield        #190 <Field int textPadding>
		additionalTextPadding = getResources().getDimensionPixelSize(com.facebook.common.R.dimen.com_facebook_likeboxcountview_caret_height);
	//   41   88:aload_0         
	//   42   89:aload_0         
	//   43   90:invokevirtual   #91  <Method Resources getResources()>
	//   44   93:getstatic       #96  <Field int com.facebook.common.R$dimen.com_facebook_likeboxcountview_caret_height>
	//   45   96:invokevirtual   #188 <Method int Resources.getDimensionPixelSize(int)>
	//   46   99:putfield        #192 <Field int additionalTextPadding>
	//   47  102:return          
	}

	private void setAdditionalTextPadding(int i, int j, int k, int l)
	{
		TextView textview = likeCountLabel;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field TextView likeCountLabel>
	//    2    4:astore          6
		int i1 = textPadding;
	//    3    6:aload_0         
	//    4    7:getfield        #190 <Field int textPadding>
	//    5   10:istore          5
		textview.setPadding(i + i1, j + i1, k + i1, i1 + l);
	//    6   12:aload           6
	//    7   14:iload_1         
	//    8   15:iload           5
	//    9   17:iadd            
	//   10   18:iload_2         
	//   11   19:iload           5
	//   12   21:iadd            
	//   13   22:iload_3         
	//   14   23:iload           5
	//   15   25:iadd            
	//   16   26:iload           5
	//   17   28:iload           4
	//   18   30:iadd            
	//   19   31:invokevirtual   #197 <Method void TextView.setPadding(int, int, int, int)>
	//   20   34:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #201 <Method void FrameLayout.onDraw(Canvas)>
		int i = getPaddingTop();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #205 <Method int getPaddingTop()>
	//    5    9:istore_2        
		int j = getPaddingLeft();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #208 <Method int getPaddingLeft()>
	//    8   14:istore_3        
		int k = getWidth() - getPaddingRight();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #211 <Method int getWidth()>
	//   11   19:aload_0         
	//   12   20:invokevirtual   #214 <Method int getPaddingRight()>
	//   13   23:isub            
	//   14   24:istore          4
		int l = getHeight() - getPaddingBottom();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #217 <Method int getHeight()>
	//   17   30:aload_0         
	//   18   31:invokevirtual   #220 <Method int getPaddingBottom()>
	//   19   34:isub            
	//   20   35:istore          5
		static class _cls1
		{

			static final int $SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition[];

			static 
			{
				$SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition = new int[LikeBoxCountViewCaretPosition.values().length];
			//    0    0:invokestatic    #18  <Method LikeBoxCountView$LikeBoxCountViewCaretPosition[] LikeBoxCountView$LikeBoxCountViewCaretPosition.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition>
				try
				{
					$SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition[LikeBoxCountViewCaretPosition.LEFT.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition>
			//    5   12:getstatic       #24  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition LikeBoxCountView$LikeBoxCountViewCaretPosition.LEFT>
			//    6   15:invokevirtual   #28  <Method int LikeBoxCountView$LikeBoxCountViewCaretPosition.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition>
			//*  10   23:getstatic       #31  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition LikeBoxCountView$LikeBoxCountViewCaretPosition.TOP>
			//*  11   26:invokevirtual   #28  <Method int LikeBoxCountView$LikeBoxCountViewCaretPosition.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition>
			//*  15   34:getstatic       #34  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition LikeBoxCountView$LikeBoxCountViewCaretPosition.RIGHT>
			//*  16   37:invokevirtual   #28  <Method int LikeBoxCountView$LikeBoxCountViewCaretPosition.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition>
			//*  20   45:getstatic       #37  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition LikeBoxCountView$LikeBoxCountViewCaretPosition.BOTTOM>
			//*  21   48:invokevirtual   #28  <Method int LikeBoxCountView$LikeBoxCountViewCaretPosition.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   25   54:astore_0        
				try
				{
					$SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition[LikeBoxCountViewCaretPosition.TOP.ordinal()] = 2;
				}
			//*  26   55:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   27   58:astore_0        
				try
				{
					$SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition[LikeBoxCountViewCaretPosition.RIGHT.ordinal()] = 3;
				}
			//*  28   59:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   29   62:astore_0        
				try
				{
					$SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition[LikeBoxCountViewCaretPosition.BOTTOM.ordinal()] = 4;
				}
			//*  30   63:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   66:astore_0        
			//*  32   67:return          
			}
		}

		switch(_cls1..SwitchMap.com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition[caretPosition.ordinal()])
	//*  21   37:getstatic       #224 <Field int[] LikeBoxCountView$1.$SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition>
	//*  22   40:aload_0         
	//*  23   41:getfield        #32  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition caretPosition>
	//*  24   44:invokevirtual   #227 <Method int LikeBoxCountView$LikeBoxCountViewCaretPosition.ordinal()>
	//*  25   47:iaload          
		{
	//*  26   48:tableswitch     1 4: default 80
	//	               1 123
	//	               2 111
	//	               3 97
	//	               4 83
	//*  27   80:goto            132
		case 4: // '\004'
			l = (int)((float)l - caretHeight);
	//   28   83:iload           5
	//   29   85:i2f             
	//   30   86:aload_0         
	//   31   87:getfield        #68  <Field float caretHeight>
	//   32   90:fsub            
	//   33   91:f2i             
	//   34   92:istore          5
			break;

	//*  35   94:goto            132
		case 3: // '\003'
			k = (int)((float)k - caretHeight);
	//   36   97:iload           4
	//   37   99:i2f             
	//   38  100:aload_0         
	//   39  101:getfield        #68  <Field float caretHeight>
	//   40  104:fsub            
	//   41  105:f2i             
	//   42  106:istore          4
			break;

	//*  43  108:goto            132
		case 2: // '\002'
			i = (int)((float)i + caretHeight);
	//   44  111:iload_2         
	//   45  112:i2f             
	//   46  113:aload_0         
	//   47  114:getfield        #68  <Field float caretHeight>
	//   48  117:fadd            
	//   49  118:f2i             
	//   50  119:istore_2        
			break;

	//*  51  120:goto            132
		case 1: // '\001'
			j = (int)((float)j + caretHeight);
	//   52  123:iload_3         
	//   53  124:i2f             
	//   54  125:aload_0         
	//   55  126:getfield        #68  <Field float caretHeight>
	//   56  129:fadd            
	//   57  130:f2i             
	//   58  131:istore_3        
			break;
		}
		drawBorder(canvas, j, i, k, l);
	//   59  132:aload_0         
	//   60  133:aload_1         
	//   61  134:iload_3         
	//   62  135:i2f             
	//   63  136:iload_2         
	//   64  137:i2f             
	//   65  138:iload           4
	//   66  140:i2f             
	//   67  141:iload           5
	//   68  143:i2f             
	//   69  144:invokespecial   #229 <Method void drawBorder(Canvas, float, float, float, float)>
	//   70  147:return          
	}

	public void setCaretPosition(LikeBoxCountViewCaretPosition likeboxcountviewcaretposition)
	{
		caretPosition = likeboxcountviewcaretposition;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition caretPosition>
		switch(_cls1..SwitchMap.com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition[likeboxcountviewcaretposition.ordinal()])
	//*   3    5:getstatic       #224 <Field int[] LikeBoxCountView$1.$SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #227 <Method int LikeBoxCountView$LikeBoxCountViewCaretPosition.ordinal()>
	//*   6   12:iaload          
		{
	//*   7   13:tableswitch     1 4: default 44
	//	               1 81
	//	               2 69
	//	               3 57
	//	               4 45
		default:
			return;
	//    8   44:return          

		case 4: // '\004'
			setAdditionalTextPadding(0, 0, 0, additionalTextPadding);
	//    9   45:aload_0         
	//   10   46:iconst_0        
	//   11   47:iconst_0        
	//   12   48:iconst_0        
	//   13   49:aload_0         
	//   14   50:getfield        #192 <Field int additionalTextPadding>
	//   15   53:invokespecial   #231 <Method void setAdditionalTextPadding(int, int, int, int)>
			return;
	//   16   56:return          

		case 3: // '\003'
			setAdditionalTextPadding(0, 0, additionalTextPadding, 0);
	//   17   57:aload_0         
	//   18   58:iconst_0        
	//   19   59:iconst_0        
	//   20   60:aload_0         
	//   21   61:getfield        #192 <Field int additionalTextPadding>
	//   22   64:iconst_0        
	//   23   65:invokespecial   #231 <Method void setAdditionalTextPadding(int, int, int, int)>
			return;
	//   24   68:return          

		case 2: // '\002'
			setAdditionalTextPadding(0, additionalTextPadding, 0, 0);
	//   25   69:aload_0         
	//   26   70:iconst_0        
	//   27   71:aload_0         
	//   28   72:getfield        #192 <Field int additionalTextPadding>
	//   29   75:iconst_0        
	//   30   76:iconst_0        
	//   31   77:invokespecial   #231 <Method void setAdditionalTextPadding(int, int, int, int)>
			return;
	//   32   80:return          

		case 1: // '\001'
			setAdditionalTextPadding(additionalTextPadding, 0, 0, 0);
	//   33   81:aload_0         
	//   34   82:aload_0         
	//   35   83:getfield        #192 <Field int additionalTextPadding>
	//   36   86:iconst_0        
	//   37   87:iconst_0        
	//   38   88:iconst_0        
	//   39   89:invokespecial   #231 <Method void setAdditionalTextPadding(int, int, int, int)>
			return;
	//   40   92:return          
		}
	}

	public void setText(String s)
	{
		likeCountLabel.setText(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field TextView likeCountLabel>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #236 <Method void TextView.setText(CharSequence)>
	//    4    8:return          
	}

	private int additionalTextPadding;
	private Paint borderPaint;
	private float borderRadius;
	private float caretHeight;
	private LikeBoxCountViewCaretPosition caretPosition;
	private float caretWidth;
	private TextView likeCountLabel;
	private int textPadding;
}
