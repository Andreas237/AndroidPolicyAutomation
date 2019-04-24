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
		float f1 = f * 2.0F;
	//    0    0:fload_3         
	//    1    1:fconst_2        
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
	//*  17   25:iflt            270
		{
			float f4 = f + 0.5F;
	//   18   28:fload_3         
	//   19   29:ldc1            #32  <Float 0.5F>
	//   20   31:fadd            
	//   21   32:fstore          8
			CardViewBaseImpl.access$000(CardViewBaseImpl.this).set(-f4, -f4, f4, f4);
	//   22   34:aload_0         
	//   23   35:getfield        #17  <Field CardViewBaseImpl this$0>
	//   24   38:invokestatic    #36  <Method RectF CardViewBaseImpl.access$000(CardViewBaseImpl)>
	//   25   41:fload           8
	//   26   43:fneg            
	//   27   44:fload           8
	//   28   46:fneg            
	//   29   47:fload           8
	//   30   49:fload           8
	//   31   51:invokevirtual   #40  <Method void RectF.set(float, float, float, float)>
			int i = canvas.save();
	//   32   54:aload_1         
	//   33   55:invokevirtual   #46  <Method int Canvas.save()>
	//   34   58:istore          9
			canvas.translate(rectf.left + f4, rectf.top + f4);
	//   35   60:aload_1         
	//   36   61:aload_2         
	//   37   62:getfield        #50  <Field float RectF.left>
	//   38   65:fload           8
	//   39   67:fadd            
	//   40   68:aload_2         
	//   41   69:getfield        #53  <Field float RectF.top>
	//   42   72:fload           8
	//   43   74:fadd            
	//   44   75:invokevirtual   #57  <Method void Canvas.translate(float, float)>
			canvas.drawArc(CardViewBaseImpl.access$000(CardViewBaseImpl.this), 180F, 90F, true, paint);
	//   45   78:aload_1         
	//   46   79:aload_0         
	//   47   80:getfield        #17  <Field CardViewBaseImpl this$0>
	//   48   83:invokestatic    #36  <Method RectF CardViewBaseImpl.access$000(CardViewBaseImpl)>
	//   49   86:ldc1            #58  <Float 180F>
	//   50   88:ldc1            #59  <Float 90F>
	//   51   90:iconst_1        
	//   52   91:aload           4
	//   53   93:invokevirtual   #63  <Method void Canvas.drawArc(RectF, float, float, boolean, Paint)>
			canvas.translate(f2, 0.0F);
	//   54   96:aload_1         
	//   55   97:fload           6
	//   56   99:fconst_0        
	//   57  100:invokevirtual   #57  <Method void Canvas.translate(float, float)>
			canvas.rotate(90F);
	//   58  103:aload_1         
	//   59  104:ldc1            #59  <Float 90F>
	//   60  106:invokevirtual   #67  <Method void Canvas.rotate(float)>
			canvas.drawArc(CardViewBaseImpl.access$000(CardViewBaseImpl.this), 180F, 90F, true, paint);
	//   61  109:aload_1         
	//   62  110:aload_0         
	//   63  111:getfield        #17  <Field CardViewBaseImpl this$0>
	//   64  114:invokestatic    #36  <Method RectF CardViewBaseImpl.access$000(CardViewBaseImpl)>
	//   65  117:ldc1            #58  <Float 180F>
	//   66  119:ldc1            #59  <Float 90F>
	//   67  121:iconst_1        
	//   68  122:aload           4
	//   69  124:invokevirtual   #63  <Method void Canvas.drawArc(RectF, float, float, boolean, Paint)>
			canvas.translate(f3 - f1 - 1.0F, 0.0F);
	//   70  127:aload_1         
	//   71  128:fload           7
	//   72  130:fload           5
	//   73  132:fsub            
	//   74  133:fconst_1        
	//   75  134:fsub            
	//   76  135:fconst_0        
	//   77  136:invokevirtual   #57  <Method void Canvas.translate(float, float)>
			canvas.rotate(90F);
	//   78  139:aload_1         
	//   79  140:ldc1            #59  <Float 90F>
	//   80  142:invokevirtual   #67  <Method void Canvas.rotate(float)>
			canvas.drawArc(CardViewBaseImpl.access$000(CardViewBaseImpl.this), 180F, 90F, true, paint);
	//   81  145:aload_1         
	//   82  146:aload_0         
	//   83  147:getfield        #17  <Field CardViewBaseImpl this$0>
	//   84  150:invokestatic    #36  <Method RectF CardViewBaseImpl.access$000(CardViewBaseImpl)>
	//   85  153:ldc1            #58  <Float 180F>
	//   86  155:ldc1            #59  <Float 90F>
	//   87  157:iconst_1        
	//   88  158:aload           4
	//   89  160:invokevirtual   #63  <Method void Canvas.drawArc(RectF, float, float, boolean, Paint)>
			canvas.translate(f2, 0.0F);
	//   90  163:aload_1         
	//   91  164:fload           6
	//   92  166:fconst_0        
	//   93  167:invokevirtual   #57  <Method void Canvas.translate(float, float)>
			canvas.rotate(90F);
	//   94  170:aload_1         
	//   95  171:ldc1            #59  <Float 90F>
	//   96  173:invokevirtual   #67  <Method void Canvas.rotate(float)>
			canvas.drawArc(CardViewBaseImpl.access$000(CardViewBaseImpl.this), 180F, 90F, true, paint);
	//   97  176:aload_1         
	//   98  177:aload_0         
	//   99  178:getfield        #17  <Field CardViewBaseImpl this$0>
	//  100  181:invokestatic    #36  <Method RectF CardViewBaseImpl.access$000(CardViewBaseImpl)>
	//  101  184:ldc1            #58  <Float 180F>
	//  102  186:ldc1            #59  <Float 90F>
	//  103  188:iconst_1        
	//  104  189:aload           4
	//  105  191:invokevirtual   #63  <Method void Canvas.drawArc(RectF, float, float, boolean, Paint)>
			canvas.restoreToCount(i);
	//  106  194:aload_1         
	//  107  195:iload           9
	//  108  197:invokevirtual   #71  <Method void Canvas.restoreToCount(int)>
			canvas.drawRect((rectf.left + f4) - 1.0F, rectf.top, 1.0F + (rectf.right - f4), rectf.top + f4, paint);
	//  109  200:aload_1         
	//  110  201:aload_2         
	//  111  202:getfield        #50  <Field float RectF.left>
	//  112  205:fload           8
	//  113  207:fadd            
	//  114  208:fconst_1        
	//  115  209:fsub            
	//  116  210:aload_2         
	//  117  211:getfield        #53  <Field float RectF.top>
	//  118  214:fconst_1        
	//  119  215:aload_2         
	//  120  216:getfield        #74  <Field float RectF.right>
	//  121  219:fload           8
	//  122  221:fsub            
	//  123  222:fadd            
	//  124  223:aload_2         
	//  125  224:getfield        #53  <Field float RectF.top>
	//  126  227:fload           8
	//  127  229:fadd            
	//  128  230:aload           4
	//  129  232:invokevirtual   #78  <Method void Canvas.drawRect(float, float, float, float, Paint)>
			canvas.drawRect((rectf.left + f4) - 1.0F, rectf.bottom - f4, 1.0F + (rectf.right - f4), rectf.bottom, paint);
	//  130  235:aload_1         
	//  131  236:aload_2         
	//  132  237:getfield        #50  <Field float RectF.left>
	//  133  240:fload           8
	//  134  242:fadd            
	//  135  243:fconst_1        
	//  136  244:fsub            
	//  137  245:aload_2         
	//  138  246:getfield        #81  <Field float RectF.bottom>
	//  139  249:fload           8
	//  140  251:fsub            
	//  141  252:fconst_1        
	//  142  253:aload_2         
	//  143  254:getfield        #74  <Field float RectF.right>
	//  144  257:fload           8
	//  145  259:fsub            
	//  146  260:fadd            
	//  147  261:aload_2         
	//  148  262:getfield        #81  <Field float RectF.bottom>
	//  149  265:aload           4
	//  150  267:invokevirtual   #78  <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
		canvas.drawRect(rectf.left, rectf.top + f, rectf.right, rectf.bottom - f, paint);
	//  151  270:aload_1         
	//  152  271:aload_2         
	//  153  272:getfield        #50  <Field float RectF.left>
	//  154  275:aload_2         
	//  155  276:getfield        #53  <Field float RectF.top>
	//  156  279:fload_3         
	//  157  280:fadd            
	//  158  281:aload_2         
	//  159  282:getfield        #74  <Field float RectF.right>
	//  160  285:aload_2         
	//  161  286:getfield        #81  <Field float RectF.bottom>
	//  162  289:fload_3         
	//  163  290:fsub            
	//  164  291:aload           4
	//  165  293:invokevirtual   #78  <Method void Canvas.drawRect(float, float, float, float, Paint)>
	//  166  296:return          
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
