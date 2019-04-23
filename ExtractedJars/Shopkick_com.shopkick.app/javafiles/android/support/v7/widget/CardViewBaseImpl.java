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
	//    0    0:new             #24  <Class RoundRectDrawableWithShadow>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #30  <Method android.content.res.Resources Context.getResources()>
	//    4    8:aload_2         
	//    5    9:fload_3         
	//    6   10:fload           4
	//    7   12:fload           5
	//    8   14:invokespecial   #33  <Method void RoundRectDrawableWithShadow(android.content.res.Resources, ColorStateList, float, float, float)>
	//    9   17:areturn         
	}

	private RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate cardviewdelegate)
	{
		return (RoundRectDrawableWithShadow)cardviewdelegate.getCardBackground();
	//    0    0:aload_1         
	//    1    1:invokeinterface #41  <Method android.graphics.drawable.Drawable CardViewDelegate.getCardBackground()>
	//    2    6:checkcast       #24  <Class RoundRectDrawableWithShadow>
	//    3    9:areturn         
	}

	public ColorStateList getBackgroundColor(CardViewDelegate cardviewdelegate)
	{
		return getShadowBackground(cardviewdelegate).getColor();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:invokevirtual   #49  <Method ColorStateList RoundRectDrawableWithShadow.getColor()>
	//    4    8:areturn         
	}

	public float getElevation(CardViewDelegate cardviewdelegate)
	{
		return getShadowBackground(cardviewdelegate).getShadowSize();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:invokevirtual   #55  <Method float RoundRectDrawableWithShadow.getShadowSize()>
	//    4    8:freturn         
	}

	public float getMaxElevation(CardViewDelegate cardviewdelegate)
	{
		return getShadowBackground(cardviewdelegate).getMaxShadowSize();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:invokevirtual   #59  <Method float RoundRectDrawableWithShadow.getMaxShadowSize()>
	//    4    8:freturn         
	}

	public float getMinHeight(CardViewDelegate cardviewdelegate)
	{
		return getShadowBackground(cardviewdelegate).getMinHeight();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:invokevirtual   #62  <Method float RoundRectDrawableWithShadow.getMinHeight()>
	//    4    8:freturn         
	}

	public float getMinWidth(CardViewDelegate cardviewdelegate)
	{
		return getShadowBackground(cardviewdelegate).getMinWidth();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:invokevirtual   #65  <Method float RoundRectDrawableWithShadow.getMinWidth()>
	//    4    8:freturn         
	}

	public float getRadius(CardViewDelegate cardviewdelegate)
	{
		return getShadowBackground(cardviewdelegate).getCornerRadius();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:invokevirtual   #69  <Method float RoundRectDrawableWithShadow.getCornerRadius()>
	//    4    8:freturn         
	}

	public void initStatic()
	{
		RoundRectDrawableWithShadow.sRoundRectHelper = new RoundRectDrawableWithShadow.RoundRectHelper() {

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
					RectF rectf1 = mCornerRect;
			//   22   34:aload_0         
			//   23   35:getfield        #17  <Field CardViewBaseImpl this$0>
			//   24   38:getfield        #36  <Field RectF CardViewBaseImpl.mCornerRect>
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
					canvas.drawArc(mCornerRect, 180F, 90F, true, paint);
			//   48   85:aload_1         
			//   49   86:aload_0         
			//   50   87:getfield        #17  <Field CardViewBaseImpl this$0>
			//   51   90:getfield        #36  <Field RectF CardViewBaseImpl.mCornerRect>
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
					canvas.drawArc(mCornerRect, 180F, 90F, true, paint);
			//   64  116:aload_1         
			//   65  117:aload_0         
			//   66  118:getfield        #17  <Field CardViewBaseImpl this$0>
			//   67  121:getfield        #36  <Field RectF CardViewBaseImpl.mCornerRect>
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
					canvas.drawArc(mCornerRect, 180F, 90F, true, paint);
			//   84  152:aload_1         
			//   85  153:aload_0         
			//   86  154:getfield        #17  <Field CardViewBaseImpl this$0>
			//   87  157:getfield        #36  <Field RectF CardViewBaseImpl.mCornerRect>
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
					canvas.drawArc(mCornerRect, 180F, 90F, true, paint);
			//  100  183:aload_1         
			//  101  184:aload_0         
			//  102  185:getfield        #17  <Field CardViewBaseImpl this$0>
			//  103  188:getfield        #36  <Field RectF CardViewBaseImpl.mCornerRect>
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
	//    3    5:invokespecial   #73  <Method void CardViewBaseImpl$1(CardViewBaseImpl)>
	//    4    8:putstatic       #77  <Field RoundRectDrawableWithShadow$RoundRectHelper RoundRectDrawableWithShadow.sRoundRectHelper>
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
	//    6    9:invokespecial   #81  <Method RoundRectDrawableWithShadow createBackground(Context, ColorStateList, float, float, float)>
	//    7   12:astore_2        
		((RoundRectDrawableWithShadow) (context)).setAddPaddingForCorners(cardviewdelegate.getPreventCornerOverlap());
	//    8   13:aload_2         
	//    9   14:aload_1         
	//   10   15:invokeinterface #85  <Method boolean CardViewDelegate.getPreventCornerOverlap()>
	//   11   20:invokevirtual   #89  <Method void RoundRectDrawableWithShadow.setAddPaddingForCorners(boolean)>
		cardviewdelegate.setCardBackground(((android.graphics.drawable.Drawable) (context)));
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:invokeinterface #93  <Method void CardViewDelegate.setCardBackground(android.graphics.drawable.Drawable)>
		updatePadding(cardviewdelegate);
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:invokevirtual   #97  <Method void updatePadding(CardViewDelegate)>
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
	//    2    2:invokespecial   #45  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:aload_1         
	//    4    6:invokeinterface #85  <Method boolean CardViewDelegate.getPreventCornerOverlap()>
	//    5   11:invokevirtual   #89  <Method void RoundRectDrawableWithShadow.setAddPaddingForCorners(boolean)>
		updatePadding(cardviewdelegate);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokevirtual   #97  <Method void updatePadding(CardViewDelegate)>
	//    9   19:return          
	}

	public void setBackgroundColor(CardViewDelegate cardviewdelegate, ColorStateList colorstatelist)
	{
		getShadowBackground(cardviewdelegate).setColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #106 <Method void RoundRectDrawableWithShadow.setColor(ColorStateList)>
	//    5    9:return          
	}

	public void setElevation(CardViewDelegate cardviewdelegate, float f)
	{
		getShadowBackground(cardviewdelegate).setShadowSize(f);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:fload_2         
	//    4    6:invokevirtual   #113 <Method void RoundRectDrawableWithShadow.setShadowSize(float)>
	//    5    9:return          
	}

	public void setMaxElevation(CardViewDelegate cardviewdelegate, float f)
	{
		getShadowBackground(cardviewdelegate).setMaxShadowSize(f);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:fload_2         
	//    4    6:invokevirtual   #117 <Method void RoundRectDrawableWithShadow.setMaxShadowSize(float)>
		updatePadding(cardviewdelegate);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #97  <Method void updatePadding(CardViewDelegate)>
	//    8   14:return          
	}

	public void setRadius(CardViewDelegate cardviewdelegate, float f)
	{
		getShadowBackground(cardviewdelegate).setCornerRadius(f);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    3    5:fload_2         
	//    4    6:invokevirtual   #121 <Method void RoundRectDrawableWithShadow.setCornerRadius(float)>
		updatePadding(cardviewdelegate);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #97  <Method void updatePadding(CardViewDelegate)>
	//    8   14:return          
	}

	public void updatePadding(CardViewDelegate cardviewdelegate)
	{
		Rect rect = new Rect();
	//    0    0:new             #123 <Class Rect>
	//    1    3:dup             
	//    2    4:invokespecial   #124 <Method void Rect()>
	//    3    7:astore_2        
		getShadowBackground(cardviewdelegate).getMaxShadowAndCornerPadding(rect);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #45  <Method RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate)>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #128 <Method void RoundRectDrawableWithShadow.getMaxShadowAndCornerPadding(Rect)>
		cardviewdelegate.setMinWidthHeightInternal((int)Math.ceil(getMinWidth(cardviewdelegate)), (int)Math.ceil(getMinHeight(cardviewdelegate)));
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #130 <Method float getMinWidth(CardViewDelegate)>
	//   13   23:f2d             
	//   14   24:invokestatic    #136 <Method double Math.ceil(double)>
	//   15   27:d2i             
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #138 <Method float getMinHeight(CardViewDelegate)>
	//   19   33:f2d             
	//   20   34:invokestatic    #136 <Method double Math.ceil(double)>
	//   21   37:d2i             
	//   22   38:invokeinterface #142 <Method void CardViewDelegate.setMinWidthHeightInternal(int, int)>
		cardviewdelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
	//   23   43:aload_1         
	//   24   44:aload_2         
	//   25   45:getfield        #146 <Field int Rect.left>
	//   26   48:aload_2         
	//   27   49:getfield        #149 <Field int Rect.top>
	//   28   52:aload_2         
	//   29   53:getfield        #152 <Field int Rect.right>
	//   30   56:aload_2         
	//   31   57:getfield        #155 <Field int Rect.bottom>
	//   32   60:invokeinterface #159 <Method void CardViewDelegate.setShadowPadding(int, int, int, int)>
	//   33   65:return          
	}

	final RectF mCornerRect = new RectF();
}
