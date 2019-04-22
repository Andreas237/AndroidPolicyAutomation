// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			DrawingContent, ShapeFill, AnimatableColorValue, KeyframeAnimation, 
//			BaseLayer, AnimatableIntegerValue, PathContent, LottieDrawable, 
//			Content

class FillContent
	implements BaseKeyframeAnimation.AnimationListener, DrawingContent
{

	FillContent(LottieDrawable lottiedrawable, BaseLayer baselayer, ShapeFill shapefill)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #30  <Class Path>
	//    4    8:dup             
	//    5    9:invokespecial   #31  <Method void Path()>
	//    6   12:putfield        #33  <Field Path path>
	//    7   15:aload_0         
	//    8   16:new             #35  <Class Paint>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:invokespecial   #38  <Method void Paint(int)>
	//   12   24:putfield        #40  <Field Paint paint>
	//   13   27:aload_0         
	//   14   28:new             #42  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #43  <Method void ArrayList()>
	//   17   35:putfield        #45  <Field List paths>
		name = shapefill.getName();
	//   18   38:aload_0         
	//   19   39:aload_3         
	//   20   40:invokevirtual   #51  <Method String ShapeFill.getName()>
	//   21   43:putfield        #53  <Field String name>
		lottieDrawable = lottiedrawable;
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:putfield        #55  <Field LottieDrawable lottieDrawable>
		if(shapefill.getColor() != null && shapefill.getOpacity() != null)
	//*  25   51:aload_3         
	//*  26   52:invokevirtual   #59  <Method AnimatableColorValue ShapeFill.getColor()>
	//*  27   55:ifnull          134
	//*  28   58:aload_3         
	//*  29   59:invokevirtual   #63  <Method AnimatableIntegerValue ShapeFill.getOpacity()>
	//*  30   62:ifnonnull       68
	//*  31   65:goto            134
		{
			path.setFillType(shapefill.getFillType());
	//   32   68:aload_0         
	//   33   69:getfield        #33  <Field Path path>
	//   34   72:aload_3         
	//   35   73:invokevirtual   #67  <Method android.graphics.Path$FillType ShapeFill.getFillType()>
	//   36   76:invokevirtual   #71  <Method void Path.setFillType(android.graphics.Path$FillType)>
			colorAnimation = shapefill.getColor().createAnimation();
	//   37   79:aload_0         
	//   38   80:aload_3         
	//   39   81:invokevirtual   #59  <Method AnimatableColorValue ShapeFill.getColor()>
	//   40   84:invokevirtual   #77  <Method KeyframeAnimation AnimatableColorValue.createAnimation()>
	//   41   87:putfield        #79  <Field KeyframeAnimation colorAnimation>
			colorAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   42   90:aload_0         
	//   43   91:getfield        #79  <Field KeyframeAnimation colorAnimation>
	//   44   94:aload_0         
	//   45   95:invokevirtual   #85  <Method void KeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
			baselayer.addAnimation(((BaseKeyframeAnimation) (colorAnimation)));
	//   46   98:aload_2         
	//   47   99:aload_0         
	//   48  100:getfield        #79  <Field KeyframeAnimation colorAnimation>
	//   49  103:invokevirtual   #91  <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
			opacityAnimation = shapefill.getOpacity().createAnimation();
	//   50  106:aload_0         
	//   51  107:aload_3         
	//   52  108:invokevirtual   #63  <Method AnimatableIntegerValue ShapeFill.getOpacity()>
	//   53  111:invokevirtual   #94  <Method KeyframeAnimation AnimatableIntegerValue.createAnimation()>
	//   54  114:putfield        #96  <Field KeyframeAnimation opacityAnimation>
			opacityAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   55  117:aload_0         
	//   56  118:getfield        #96  <Field KeyframeAnimation opacityAnimation>
	//   57  121:aload_0         
	//   58  122:invokevirtual   #85  <Method void KeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
			baselayer.addAnimation(((BaseKeyframeAnimation) (opacityAnimation)));
	//   59  125:aload_2         
	//   60  126:aload_0         
	//   61  127:getfield        #96  <Field KeyframeAnimation opacityAnimation>
	//   62  130:invokevirtual   #91  <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
			return;
	//   63  133:return          
		} else
		{
			colorAnimation = null;
	//   64  134:aload_0         
	//   65  135:aconst_null     
	//   66  136:putfield        #79  <Field KeyframeAnimation colorAnimation>
			opacityAnimation = null;
	//   67  139:aload_0         
	//   68  140:aconst_null     
	//   69  141:putfield        #96  <Field KeyframeAnimation opacityAnimation>
			return;
	//   70  144:return          
		}
	}

	public void addColorFilter(String s, String s1, ColorFilter colorfilter)
	{
		paint.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Paint paint>
	//    2    4:aload_3         
	//    3    5:invokevirtual   #104 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void draw(Canvas canvas, Matrix matrix, int i)
	{
		paint.setColor(((Integer)colorAnimation.getValue()).intValue());
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Paint paint>
	//    2    4:aload_0         
	//    3    5:getfield        #79  <Field KeyframeAnimation colorAnimation>
	//    4    8:invokevirtual   #111 <Method Object KeyframeAnimation.getValue()>
	//    5   11:checkcast       #113 <Class Integer>
	//    6   14:invokevirtual   #117 <Method int Integer.intValue()>
	//    7   17:invokevirtual   #120 <Method void Paint.setColor(int)>
		i = (int)(((((float)i / 255F) * (float)((Integer)opacityAnimation.getValue()).intValue()) / 100F) * 255F);
	//    8   20:iload_3         
	//    9   21:i2f             
	//   10   22:ldc1            #121 <Float 255F>
	//   11   24:fdiv            
	//   12   25:aload_0         
	//   13   26:getfield        #96  <Field KeyframeAnimation opacityAnimation>
	//   14   29:invokevirtual   #111 <Method Object KeyframeAnimation.getValue()>
	//   15   32:checkcast       #113 <Class Integer>
	//   16   35:invokevirtual   #117 <Method int Integer.intValue()>
	//   17   38:i2f             
	//   18   39:fmul            
	//   19   40:ldc1            #122 <Float 100F>
	//   20   42:fdiv            
	//   21   43:ldc1            #121 <Float 255F>
	//   22   45:fmul            
	//   23   46:f2i             
	//   24   47:istore_3        
		paint.setAlpha(i);
	//   25   48:aload_0         
	//   26   49:getfield        #40  <Field Paint paint>
	//   27   52:iload_3         
	//   28   53:invokevirtual   #125 <Method void Paint.setAlpha(int)>
		path.reset();
	//   29   56:aload_0         
	//   30   57:getfield        #33  <Field Path path>
	//   31   60:invokevirtual   #128 <Method void Path.reset()>
		for(i = 0; i < paths.size(); i++)
	//*  32   63:iconst_0        
	//*  33   64:istore_3        
	//*  34   65:iload_3         
	//*  35   66:aload_0         
	//*  36   67:getfield        #45  <Field List paths>
	//*  37   70:invokeinterface #133 <Method int List.size()>
	//*  38   75:icmpge          111
			path.addPath(((PathContent)paths.get(i)).getPath(), matrix);
	//   39   78:aload_0         
	//   40   79:getfield        #33  <Field Path path>
	//   41   82:aload_0         
	//   42   83:getfield        #45  <Field List paths>
	//   43   86:iload_3         
	//   44   87:invokeinterface #137 <Method Object List.get(int)>
	//   45   92:checkcast       #139 <Class PathContent>
	//   46   95:invokeinterface #143 <Method Path PathContent.getPath()>
	//   47  100:aload_2         
	//   48  101:invokevirtual   #147 <Method void Path.addPath(Path, Matrix)>

	//   49  104:iload_3         
	//   50  105:iconst_1        
	//   51  106:iadd            
	//   52  107:istore_3        
	//*  53  108:goto            65
		canvas.drawPath(path, paint);
	//   54  111:aload_1         
	//   55  112:aload_0         
	//   56  113:getfield        #33  <Field Path path>
	//   57  116:aload_0         
	//   58  117:getfield        #40  <Field Paint paint>
	//   59  120:invokevirtual   #153 <Method void Canvas.drawPath(Path, Paint)>
	//   60  123:return          
	}

	public void getBounds(RectF rectf, Matrix matrix)
	{
		path.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Path path>
	//    2    4:invokevirtual   #128 <Method void Path.reset()>
		for(int i = 0; i < paths.size(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_3        
	//*   5    9:iload_3         
	//*   6   10:aload_0         
	//*   7   11:getfield        #45  <Field List paths>
	//*   8   14:invokeinterface #133 <Method int List.size()>
	//*   9   19:icmpge          55
			path.addPath(((PathContent)paths.get(i)).getPath(), matrix);
	//   10   22:aload_0         
	//   11   23:getfield        #33  <Field Path path>
	//   12   26:aload_0         
	//   13   27:getfield        #45  <Field List paths>
	//   14   30:iload_3         
	//   15   31:invokeinterface #137 <Method Object List.get(int)>
	//   16   36:checkcast       #139 <Class PathContent>
	//   17   39:invokeinterface #143 <Method Path PathContent.getPath()>
	//   18   44:aload_2         
	//   19   45:invokevirtual   #147 <Method void Path.addPath(Path, Matrix)>

	//   20   48:iload_3         
	//   21   49:iconst_1        
	//   22   50:iadd            
	//   23   51:istore_3        
	//*  24   52:goto            9
		path.computeBounds(rectf, false);
	//   25   55:aload_0         
	//   26   56:getfield        #33  <Field Path path>
	//   27   59:aload_1         
	//   28   60:iconst_0        
	//   29   61:invokevirtual   #159 <Method void Path.computeBounds(RectF, boolean)>
		rectf.set(rectf.left - 1.0F, rectf.top - 1.0F, rectf.right + 1.0F, rectf.bottom + 1.0F);
	//   30   64:aload_1         
	//   31   65:aload_1         
	//   32   66:getfield        #165 <Field float RectF.left>
	//   33   69:fconst_1        
	//   34   70:fsub            
	//   35   71:aload_1         
	//   36   72:getfield        #168 <Field float RectF.top>
	//   37   75:fconst_1        
	//   38   76:fsub            
	//   39   77:aload_1         
	//   40   78:getfield        #171 <Field float RectF.right>
	//   41   81:fconst_1        
	//   42   82:fadd            
	//   43   83:aload_1         
	//   44   84:getfield        #174 <Field float RectF.bottom>
	//   45   87:fconst_1        
	//   46   88:fadd            
	//   47   89:invokevirtual   #178 <Method void RectF.set(float, float, float, float)>
	//   48   92:return          
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String name>
	//    2    4:areturn         
	}

	public void onValueChanged()
	{
		lottieDrawable.invalidateSelf();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field LottieDrawable lottieDrawable>
	//    2    4:invokevirtual   #184 <Method void LottieDrawable.invalidateSelf()>
	//    3    7:return          
	}

	public void setContents(List list, List list1)
	{
		for(int i = 0; i < list1.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_2         
	//*   4    4:invokeinterface #133 <Method int List.size()>
	//*   5    9:icmpge          51
		{
			list = ((List) ((Content)list1.get(i)));
	//    6   12:aload_2         
	//    7   13:iload_3         
	//    8   14:invokeinterface #137 <Method Object List.get(int)>
	//    9   19:checkcast       #188 <Class Content>
	//   10   22:astore_1        
			if(list instanceof PathContent)
	//*  11   23:aload_1         
	//*  12   24:instanceof      #139 <Class PathContent>
	//*  13   27:ifeq            44
				paths.add(((Object) ((PathContent)list)));
	//   14   30:aload_0         
	//   15   31:getfield        #45  <Field List paths>
	//   16   34:aload_1         
	//   17   35:checkcast       #139 <Class PathContent>
	//   18   38:invokeinterface #192 <Method boolean List.add(Object)>
	//   19   43:pop             
		}

	//   20   44:iload_3         
	//   21   45:iconst_1        
	//   22   46:iadd            
	//   23   47:istore_3        
	//*  24   48:goto            2
	//   25   51:return          
	}

	private final KeyframeAnimation colorAnimation;
	private final LottieDrawable lottieDrawable;
	private final String name;
	private final KeyframeAnimation opacityAnimation;
	private final Paint paint = new Paint(1);
	private final Path path = new Path();
	private final List paths = new ArrayList();
}
