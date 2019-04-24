// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.*;

// Referenced classes of package android.support.v7.widget:
//			CardViewImpl, RoundRectDrawableWithShadow, CardViewDelegate

class CardViewBaseImpl
	implements CardViewImpl
{

	CardViewBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class RectF>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void RectF()>
	//    6   12:putfield        #19  <Field RectF mCornerRect>
	//    7   15:return          
	}

	private RoundRectDrawableWithShadow createBackground(Context context, ColorStateList colorstatelist, float f, float f1, float f2)
	{
		return new RoundRectDrawableWithShadow(context.getResources(), colorstatelist, f, f1, f2);
	//    0    0:new             #26  <Class RoundRectDrawableWithShadow>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method android.content.res.Resources Context.getResources()>
	//    4    8:aload_2         
	//    5    9:fload_3         
	//    6   10:fload           4
	//    7   12:fload           5
	//    8   14:invokespecial   #35  <Method void RoundRectDrawableWithShadow(android.content.res.Resources, ColorStateList, float, float, float)>
	//    9   17:areturn         
	}

	private RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate cardviewdelegate)
	{
		return (RoundRectDrawableWithShadow)cardviewdelegate.getCardBackground();
	//    0    0:aload_1         
	//    1    1:invokeinterface #43  <Method android.graphics.drawable.Drawable CardViewDelegate.getCardBackground()>
	//    2    6:checkcast       #26  <Class RoundRectDrawableWithShadow>
	//    3    9:areturn         
	}

	public ColorStateList getBackgroundColor(CardViewDelegate cardviewdelegate)
	{
		return getShadowBackground(cardviewdelegate).getColor();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:invokevirtual   #51  <Method ColorStateList RoundRectDrawableWithShadow.getColor()>
	//    4    8:areturn         
	}

	public float getElevation(CardViewDelegate cardviewdelegate)
	{
		return getShadowBackground(cardviewdelegate).getShadowSize();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:invokevirtual   #57  <Method float RoundRectDrawableWithShadow.getShadowSize()>
	//    4    8:freturn         
	}

	public float getMaxElevation(CardViewDelegate cardviewdelegate)
	{
		return getShadowBackground(cardviewdelegate).getMaxShadowSize();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:invokevirtual   #61  <Method float RoundRectDrawableWithShadow.getMaxShadowSize()>
	//    4    8:freturn         
	}

	public float getMinHeight(CardViewDelegate cardviewdelegate)
	{
		return getShadowBackground(cardviewdelegate).getMinHeight();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:invokevirtual   #64  <Method float RoundRectDrawableWithShadow.getMinHeight()>
	//    4    8:freturn         
	}

	public float getMinWidth(CardViewDelegate cardviewdelegate)
	{
		return getShadowBackground(cardviewdelegate).getMinWidth();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:invokevirtual   #67  <Method float RoundRectDrawableWithShadow.getMinWidth()>
	//    4    8:freturn         
	}

	public float getRadius(CardViewDelegate cardviewdelegate)
	{
		return getShadowBackground(cardviewdelegate).getCornerRadius();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:invokevirtual   #71  <Method float RoundRectDrawableWithShadow.getCornerRadius()>
	//    4    8:freturn         
	}

	public void initStatic()
	{
		RoundRectDrawableWithShadow.sRoundRectHelper = new RoundRectDrawableWithShadow.RoundRectHelper() {

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
					mCornerRect.set(-f4, -f4, f4, f4);
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
					canvas.drawArc(mCornerRect, 180F, 90F, true, paint);
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
					canvas.drawArc(mCornerRect, 180F, 90F, true, paint);
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
					canvas.drawArc(mCornerRect, 180F, 90F, true, paint);
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
					canvas.drawArc(mCornerRect, 180F, 90F, true, paint);
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
;
	//    0    0:new             #8   <Class CardViewBaseImpl$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #75  <Method void CardViewBaseImpl$1(CardViewBaseImpl)>
	//    4    8:putstatic       #79  <Field RoundRectDrawableWithShadow$RoundRectHelper RoundRectDrawableWithShadow.sRoundRectHelper>
	//    5   11:return          
	}

	public void initialize(CardViewDelegate cardviewdelegate, Context context, ColorStateList colorstatelist, float f, float f1, float f2)
	{
		context = ((Context) (createBackground(context, colorstatelist, f, f1, f2)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:fload           4
	//    4    5:fload           5
	//    5    7:fload           6
	//    6    9:invokespecial   #83  <Method RoundRectDrawableWithShadow createBackground(Context, ColorStateList, float, float, float)>
	//    7   12:astore_2        
		((RoundRectDrawableWithShadow) (context)).setAddPaddingForCorners(cardviewdelegate.getPreventCornerOverlap());
	//    8   13:aload_2         
	//    9   14:aload_1         
	//   10   15:invokeinterface #87  <Method boolean CardViewDelegate.getPreventCornerOverlap()>
	//   11   20:invokevirtual   #91  <Method void RoundRectDrawableWithShadow.setAddPaddingForCorners(boolean)>
		cardviewdelegate.setCardBackground(((android.graphics.drawable.Drawable) (context)));
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:invokeinterface #95  <Method void CardViewDelegate.setCardBackground(android.graphics.drawable.Drawable)>
		updatePadding(cardviewdelegate);
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:invokevirtual   #99  <Method void updatePadding(CardViewDelegate)>
	//   18   35:return          
	}

	public void onCompatPaddingChanged(CardViewDelegate cardviewdelegate)
	{
	//    0    0:return          
	}

	public void onPreventCornerOverlapChanged(CardViewDelegate cardviewdelegate)
	{
		getShadowBackground(cardviewdelegate).setAddPaddingForCorners(cardviewdelegate.getPreventCornerOverlap());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:aload_1         
	//    4    6:invokeinterface #87  <Method boolean CardViewDelegate.getPreventCornerOverlap()>
	//    5   11:invokevirtual   #91  <Method void RoundRectDrawableWithShadow.setAddPaddingForCorners(boolean)>
		updatePadding(cardviewdelegate);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokevirtual   #99  <Method void updatePadding(CardViewDelegate)>
	//    9   19:return          
	}

	public void setBackgroundColor(CardViewDelegate cardviewdelegate, ColorStateList colorstatelist)
	{
		getShadowBackground(cardviewdelegate).setColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #108 <Method void RoundRectDrawableWithShadow.setColor(ColorStateList)>
	//    5    9:return          
	}

	public void setElevation(CardViewDelegate cardviewdelegate, float f)
	{
		getShadowBackground(cardviewdelegate).setShadowSize(f);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:fload_2         
	//    4    6:invokevirtual   #115 <Method void RoundRectDrawableWithShadow.setShadowSize(float)>
	//    5    9:return          
	}

	public void setMaxElevation(CardViewDelegate cardviewdelegate, float f)
	{
		getShadowBackground(cardviewdelegate).setMaxShadowSize(f);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:fload_2         
	//    4    6:invokevirtual   #119 <Method void RoundRectDrawableWithShadow.setMaxShadowSize(float)>
		updatePadding(cardviewdelegate);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #99  <Method void updatePadding(CardViewDelegate)>
	//    8   14:return          
	}

	public void setRadius(CardViewDelegate cardviewdelegate, float f)
	{
		getShadowBackground(cardviewdelegate).setCornerRadius(f);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:fload_2         
	//    4    6:invokevirtual   #123 <Method void RoundRectDrawableWithShadow.setCornerRadius(float)>
		updatePadding(cardviewdelegate);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #99  <Method void updatePadding(CardViewDelegate)>
	//    8   14:return          
	}

	public void updatePadding(CardViewDelegate cardviewdelegate)
	{
		Rect rect = new Rect();
	//    0    0:new             #125 <Class Rect>
	//    1    3:dup             
	//    2    4:invokespecial   #126 <Method void Rect()>
	//    3    7:astore_2        
		getShadowBackground(cardviewdelegate).getMaxShadowAndCornerPadding(rect);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #47  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #130 <Method void RoundRectDrawableWithShadow.getMaxShadowAndCornerPadding(Rect)>
		cardviewdelegate.setMinWidthHeightInternal((int)Math.ceil(getMinWidth(cardviewdelegate)), (int)Math.ceil(getMinHeight(cardviewdelegate)));
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #132 <Method float getMinWidth(CardViewDelegate)>
	//   13   23:f2d             
	//   14   24:invokestatic    #138 <Method double Math.ceil(double)>
	//   15   27:d2i             
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #140 <Method float getMinHeight(CardViewDelegate)>
	//   19   33:f2d             
	//   20   34:invokestatic    #138 <Method double Math.ceil(double)>
	//   21   37:d2i             
	//   22   38:invokeinterface #144 <Method void CardViewDelegate.setMinWidthHeightInternal(int, int)>
		cardviewdelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
	//   23   43:aload_1         
	//   24   44:aload_2         
	//   25   45:getfield        #148 <Field int Rect.left>
	//   26   48:aload_2         
	//   27   49:getfield        #151 <Field int Rect.top>
	//   28   52:aload_2         
	//   29   53:getfield        #154 <Field int Rect.right>
	//   30   56:aload_2         
	//   31   57:getfield        #157 <Field int Rect.bottom>
	//   32   60:invokeinterface #161 <Method void CardViewDelegate.setShadowPadding(int, int, int, int)>
	//   33   65:return          
	}

	private final RectF mCornerRect = new RectF();


/*
	static RectF access$000(CardViewBaseImpl cardviewbaseimpl)
	{
		return cardviewbaseimpl.mCornerRect;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RectF mCornerRect>
	//    2    4:areturn         
	}

*/
}
