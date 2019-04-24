// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.*;

// Referenced classes of package android.support.v7.widget:
//			CardViewBaseImpl

class CardViewBaseImpl$1
	implements thShadow.RoundRectHelper
{

	public void drawRoundRect(Canvas canvas, RectF rectf, float f, Paint paint)
	{
		float f1 = 2.0F * f;
	//    0    0:fconst_2        
	//    1    1:fload_3         
	//    2    2:fmul            
	//    3    3:fstore          5
		float f2 = rectf.width() - f1 - 1.0F;
	//    4    5:aload_2         
	//    5    6:invokevirtual   #28  <Method float RectF.width()>
	//    6    9:fload           5
	//    7   11:fsub            
	//    8   12:fconst_1        
	//    9   13:fsub            
	//   10   14:fstore          6
		float f3 = rectf.height();
	//   11   16:aload_2         
	//   12   17:invokevirtual   #31  <Method float RectF.height()>
	//   13   20:fstore          7
		if(f >= 1.0F)
	//*  14   22:fload_3         
	//*  15   23:fconst_1        
	//*  16   24:fcmpl           
	//*  17   25:iflt            277
		{
			float f4 = f + 0.5F;
	//   18   28:fload_3         
	//   19   29:ldc1            #32  <Float 0.5F>
	//   20   31:fadd            
	//   21   32:fstore          8
			RectF rectf1 = CardViewBaseImpl.access$000(CardViewBaseImpl.this);
	//   22   34:aload_0         
	//   23   35:getfield        #17  <Field CardViewBaseImpl this$0>
	//   24   38:invokestatic    #36  <Method RectF CardViewBaseImpl.access$000(CardViewBaseImpl)>
	//   25   41:astore          11
			float f5 = -f4;
	//   26   43:fload           8
	//   27   45:fneg            
	//   28   46:fstore          9
			rectf1.set(f5, f5, f4, f4);
	//   29   48:aload           11
	//   30   50:fload           9
	//   31   52:fload           9
	//   32   54:fload           8
	//   33   56:fload           8
	//   34   58:invokevirtual   #40  <Method void RectF.set(float, float, float, float)>
			int i = canvas.save();
	//   35   61:aload_1         
	//   36   62:invokevirtual   #46  <Method int Canvas.save()>
	//   37   65:istore          10
			canvas.translate(rectf.left + f4, rectf.top + f4);
	//   38   67:aload_1         
	//   39   68:aload_2         
	//   40   69:getfield        #50  <Field float RectF.left>
	//   41   72:fload           8
	//   42   74:fadd            
	//   43   75:aload_2         
	//   44   76:getfield        #53  <Field float RectF.top>
	//   45   79:fload           8
	//   46   81:fadd            
	//   47   82:invokevirtual   #57  <Method void Canvas.translate(float, float)>
			canvas.drawArc(CardViewBaseImpl.access$000(CardViewBaseImpl.this), 180F, 90F, true, paint);
	//   48   85:aload_1         
	//   49   86:aload_0         
	//   50   87:getfield        #17  <Field CardViewBaseImpl this$0>
	//   51   90:invokestatic    #36  <Method RectF CardViewBaseImpl.access$000(CardViewBaseImpl)>
	//   52   93:ldc1            #58  <Float 180F>
	//   53   95:ldc1            #59  <Float 90F>
	//   54   97:iconst_1        
	//   55   98:aload           4
	//   56  100:invokevirtual   #63  <Method void Canvas.drawArc(RectF, float, float, boolean, Paint)>
			canvas.translate(f2, 0.0F);
	//   57  103:aload_1         
	//   58  104:fload           6
	//   59  106:fconst_0        
	//   60  107:invokevirtual   #57  <Method void Canvas.translate(float, float)>
			canvas.rotate(90F);
	//   61  110:aload_1         
	//   62  111:ldc1            #59  <Float 90F>
	//   63  113:invokevirtual   #67  <Method void Canvas.rotate(float)>
			canvas.drawArc(CardViewBaseImpl.access$000(CardViewBaseImpl.this), 180F, 90F, true, paint);
	//   64  116:aload_1         
	//   65  117:aload_0         
	//   66  118:getfield        #17  <Field CardViewBaseImpl this$0>
	//   67  121:invokestatic    #36  <Method RectF CardViewBaseImpl.access$000(CardViewBaseImpl)>
	//   68  124:ldc1            #58  <Float 180F>
	//   69  126:ldc1            #59  <Float 90F>
	//   70  128:iconst_1        
	//   71  129:aload           4
	//   72  131:invokevirtual   #63  <Method void Canvas.drawArc(RectF, float, float, boolean, Paint)>
			canvas.translate(f3 - f1 - 1.0F, 0.0F);
	//   73  134:aload_1         
	//   74  135:fload           7
	//   75  137:fload           5
	//   76  139:fsub            
	//   77  140:fconst_1        
	//   78  141:fsub            
	//   79  142:fconst_0        
	//   80  143:invokevirtual   #57  <Method void Canvas.translate(float, float)>
			canvas.rotate(90F);
	//   81  146:aload_1         
	//   82  147:ldc1            #59  <Float 90F>
	//   83  149:invokevirtual   #67  <Method void Canvas.rotate(float)>
			canvas.drawArc(CardViewBaseImpl.access$000(CardViewBaseImpl.this), 180F, 90F, true, paint);
	//   84  152:aload_1         
	//   85  153:aload_0         
	//   86  154:getfield        #17  <Field CardViewBaseImpl this$0>
	//   87  157:invokestatic    #36  <Method RectF CardViewBaseImpl.access$000(CardViewBaseImpl)>
	//   88  160:ldc1            #58  <Float 180F>
	//   89  162:ldc1            #59  <Float 90F>
	//   90  164:iconst_1        
	//   91  165:aload           4
	//   92  167:invokevirtual   #63  <Method void Canvas.drawArc(RectF, float, float, boolean, Paint)>
			canvas.translate(f2, 0.0F);
	//   93  170:aload_1         
	//   94  171:fload           6
	//   95  173:fconst_0        
	//   96  174:invokevirtual   #57  <Method void Canvas.translate(float, float)>
			canvas.rotate(90F);
	//   97  177:aload_1         
	//   98  178:ldc1            #59  <Float 90F>
	//   99  180:invokevirtual   #67  <Method void Canvas.rotate(float)>
			canvas.drawArc(CardViewBaseImpl.access$000(CardViewBaseImpl.this), 180F, 90F, true, paint);
	//  100  183:aload_1         
	//  101  184:aload_0         
	//  102  185:getfield        #17  <Field CardViewBaseImpl this$0>
	//  103  188:invokestatic    #36  <Method RectF CardViewBaseImpl.access$000(CardViewBaseImpl)>
	//  104  191:ldc1            #58  <Float 180F>
	//  105  193:ldc1            #59  <Float 90F>
	//  106  195:iconst_1        
	//  107  196:aload           4
	//  108  198:invokevirtual   #63  <Method void Canvas.drawArc(RectF, float, float, boolean, Paint)>
			canvas.restoreToCount(i);
	//  109  201:aload_1         
	//  110  202:iload           10
	//  111  204:invokevirtual   #71  <Method void Canvas.restoreToCount(int)>
			canvas.drawRect((rectf.left + f4) - 1.0F, rectf.top, (rectf.right - f4) + 1.0F, rectf.top + f4, paint);
	//  112  207:aload_1         
	//  113  208:aload_2         
	//  114  209:getfield        #50  <Field float RectF.left>
	//  115  212:fload           8
	//  116  214:fadd            
	//  117  215:fconst_1        
	//  118  216:fsub            
	//  119  217:aload_2         
	//  120  218:getfield        #53  <Field float RectF.top>
	//  121  221:aload_2         
	//  122  222:getfield        #74  <Field float RectF.right>
	//  123  225:fload           8
	//  124  227:fsub            
	//  125  228:fconst_1        
	//  126  229:fadd            
	//  127  230:aload_2         
	//  128  231:getfield        #53  <Field float RectF.top>
	//  129  234:fload           8
	//  130  236:fadd            
	//  131  237:aload           4
	//  132  239:invokevirtual   #78  <Method void Canvas.drawRect(float, float, float, float, Paint)>
			canvas.drawRect((rectf.left + f4) - 1.0F, rectf.bottom - f4, (rectf.right - f4) + 1.0F, rectf.bottom, paint);
	//  133  242:aload_1         
	//  134  243:aload_2         
	//  135  244:getfield        #50  <Field float RectF.left>
	//  136  247:fload           8
	//  137  249:fadd            
	//  138  250:fconst_1        
	//  139  251:fsub            
	//  140  252:aload_2         
	//  141  253:getfield        #81  <Field float RectF.bottom>
	//  142  256:fload           8
	//  143  258:fsub            
	//  144  259:aload_2         
	//  145  260:getfield        #74  <Field float RectF.right>
	//  146  263:fload           8
	//  147  265:fsub            
	//  148  266:fconst_1        
	//  149  267:fadd            
	//  150  268:aload_2         
	//  151  269:getfield        #81  <Field float RectF.bottom>
	//  152  272:aload           4
	//  153  274:invokevirtual   #78  <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
		canvas.drawRect(rectf.left, rectf.top + f, rectf.right, rectf.bottom - f, paint);
	//  154  277:aload_1         
	//  155  278:aload_2         
	//  156  279:getfield        #50  <Field float RectF.left>
	//  157  282:aload_2         
	//  158  283:getfield        #53  <Field float RectF.top>
	//  159  286:fload_3         
	//  160  287:fadd            
	//  161  288:aload_2         
	//  162  289:getfield        #74  <Field float RectF.right>
	//  163  292:aload_2         
	//  164  293:getfield        #81  <Field float RectF.bottom>
	//  165  296:fload_3         
	//  166  297:fsub            
	//  167  298:aload           4
	//  168  300:invokevirtual   #78  <Method void Canvas.drawRect(float, float, float, float, Paint)>
	//  169  303:return          
	}

	final CardViewBaseImpl this$0;

	CardViewBaseImpl$1()
	{
		this$0 = CardViewBaseImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CardViewBaseImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
