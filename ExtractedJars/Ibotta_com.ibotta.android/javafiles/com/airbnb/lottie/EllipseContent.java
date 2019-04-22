// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			PathContent, CircleShape, AnimatablePointValue, AnimatableValue, 
//			BaseLayer, BaseKeyframeAnimation, LottieDrawable, Utils, 
//			Content, TrimPathContent

class EllipseContent
	implements BaseKeyframeAnimation.AnimationListener, PathContent
{

	EllipseContent(LottieDrawable lottiedrawable, BaseLayer baselayer, CircleShape circleshape)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #30  <Class Path>
	//    4    8:dup             
	//    5    9:invokespecial   #31  <Method void Path()>
	//    6   12:putfield        #33  <Field Path path>
		name = circleshape.getName();
	//    7   15:aload_0         
	//    8   16:aload_3         
	//    9   17:invokevirtual   #39  <Method String CircleShape.getName()>
	//   10   20:putfield        #41  <Field String name>
		lottieDrawable = lottiedrawable;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #43  <Field LottieDrawable lottieDrawable>
		sizeAnimation = ((BaseKeyframeAnimation) (circleshape.getSize().createAnimation()));
	//   14   28:aload_0         
	//   15   29:aload_3         
	//   16   30:invokevirtual   #47  <Method AnimatablePointValue CircleShape.getSize()>
	//   17   33:invokevirtual   #53  <Method KeyframeAnimation AnimatablePointValue.createAnimation()>
	//   18   36:putfield        #55  <Field BaseKeyframeAnimation sizeAnimation>
		positionAnimation = circleshape.getPosition().createAnimation();
	//   19   39:aload_0         
	//   20   40:aload_3         
	//   21   41:invokevirtual   #59  <Method AnimatableValue CircleShape.getPosition()>
	//   22   44:invokeinterface #64  <Method BaseKeyframeAnimation AnimatableValue.createAnimation()>
	//   23   49:putfield        #66  <Field BaseKeyframeAnimation positionAnimation>
		baselayer.addAnimation(sizeAnimation);
	//   24   52:aload_2         
	//   25   53:aload_0         
	//   26   54:getfield        #55  <Field BaseKeyframeAnimation sizeAnimation>
	//   27   57:invokevirtual   #72  <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		baselayer.addAnimation(positionAnimation);
	//   28   60:aload_2         
	//   29   61:aload_0         
	//   30   62:getfield        #66  <Field BaseKeyframeAnimation positionAnimation>
	//   31   65:invokevirtual   #72  <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		sizeAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   32   68:aload_0         
	//   33   69:getfield        #55  <Field BaseKeyframeAnimation sizeAnimation>
	//   34   72:aload_0         
	//   35   73:invokevirtual   #78  <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		positionAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   36   76:aload_0         
	//   37   77:getfield        #66  <Field BaseKeyframeAnimation positionAnimation>
	//   38   80:aload_0         
	//   39   81:invokevirtual   #78  <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
	//   40   84:return          
	}

	private void invalidate()
	{
		isPathValid = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #82  <Field boolean isPathValid>
		lottieDrawable.invalidateSelf();
	//    3    5:aload_0         
	//    4    6:getfield        #43  <Field LottieDrawable lottieDrawable>
	//    5    9:invokevirtual   #87  <Method void LottieDrawable.invalidateSelf()>
	//    6   12:return          
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String name>
	//    2    4:areturn         
	}

	public Path getPath()
	{
		if(isPathValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field boolean isPathValid>
	//*   2    4:ifeq            12
		{
			return path;
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field Path path>
	//    5   11:areturn         
		} else
		{
			path.reset();
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field Path path>
	//    8   16:invokevirtual   #92  <Method void Path.reset()>
			Object obj = ((Object) ((PointF)sizeAnimation.getValue()));
	//    9   19:aload_0         
	//   10   20:getfield        #55  <Field BaseKeyframeAnimation sizeAnimation>
	//   11   23:invokevirtual   #96  <Method Object BaseKeyframeAnimation.getValue()>
	//   12   26:checkcast       #98  <Class PointF>
	//   13   29:astore          8
			float f3 = ((PointF) (obj)).x / 2.0F;
	//   14   31:aload           8
	//   15   33:getfield        #102 <Field float PointF.x>
	//   16   36:fconst_2        
	//   17   37:fdiv            
	//   18   38:fstore          4
			float f = ((PointF) (obj)).y / 2.0F;
	//   19   40:aload           8
	//   20   42:getfield        #105 <Field float PointF.y>
	//   21   45:fconst_2        
	//   22   46:fdiv            
	//   23   47:fstore_1        
			float f5 = f3 * 0.55228F;
	//   24   48:fload           4
	//   25   50:ldc1            #106 <Float 0.55228F>
	//   26   52:fmul            
	//   27   53:fstore          6
			float f4 = 0.55228F * f;
	//   28   55:ldc1            #106 <Float 0.55228F>
	//   29   57:fload_1         
	//   30   58:fmul            
	//   31   59:fstore          5
			path.reset();
	//   32   61:aload_0         
	//   33   62:getfield        #33  <Field Path path>
	//   34   65:invokevirtual   #92  <Method void Path.reset()>
			obj = ((Object) (path));
	//   35   68:aload_0         
	//   36   69:getfield        #33  <Field Path path>
	//   37   72:astore          8
			float f1 = -f;
	//   38   74:fload_1         
	//   39   75:fneg            
	//   40   76:fstore_2        
			((Path) (obj)).moveTo(0.0F, f1);
	//   41   77:aload           8
	//   42   79:fconst_0        
	//   43   80:fload_2         
	//   44   81:invokevirtual   #110 <Method void Path.moveTo(float, float)>
			obj = ((Object) (path));
	//   45   84:aload_0         
	//   46   85:getfield        #33  <Field Path path>
	//   47   88:astore          8
			float f6 = f5 + 0.0F;
	//   48   90:fload           6
	//   49   92:fconst_0        
	//   50   93:fadd            
	//   51   94:fstore          7
			float f2 = 0.0F - f4;
	//   52   96:fconst_0        
	//   53   97:fload           5
	//   54   99:fsub            
	//   55  100:fstore_3        
			((Path) (obj)).cubicTo(f6, f1, f3, f2, f3, 0.0F);
	//   56  101:aload           8
	//   57  103:fload           7
	//   58  105:fload_2         
	//   59  106:fload           4
	//   60  108:fload_3         
	//   61  109:fload           4
	//   62  111:fconst_0        
	//   63  112:invokevirtual   #114 <Method void Path.cubicTo(float, float, float, float, float, float)>
			obj = ((Object) (path));
	//   64  115:aload_0         
	//   65  116:getfield        #33  <Field Path path>
	//   66  119:astore          8
			f4 += 0.0F;
	//   67  121:fload           5
	//   68  123:fconst_0        
	//   69  124:fadd            
	//   70  125:fstore          5
			((Path) (obj)).cubicTo(f3, f4, f6, f, 0.0F, f);
	//   71  127:aload           8
	//   72  129:fload           4
	//   73  131:fload           5
	//   74  133:fload           7
	//   75  135:fload_1         
	//   76  136:fconst_0        
	//   77  137:fload_1         
	//   78  138:invokevirtual   #114 <Method void Path.cubicTo(float, float, float, float, float, float)>
			obj = ((Object) (path));
	//   79  141:aload_0         
	//   80  142:getfield        #33  <Field Path path>
	//   81  145:astore          8
			f5 = 0.0F - f5;
	//   82  147:fconst_0        
	//   83  148:fload           6
	//   84  150:fsub            
	//   85  151:fstore          6
			f3 = -f3;
	//   86  153:fload           4
	//   87  155:fneg            
	//   88  156:fstore          4
			((Path) (obj)).cubicTo(f5, f, f3, f4, f3, 0.0F);
	//   89  158:aload           8
	//   90  160:fload           6
	//   91  162:fload_1         
	//   92  163:fload           4
	//   93  165:fload           5
	//   94  167:fload           4
	//   95  169:fconst_0        
	//   96  170:invokevirtual   #114 <Method void Path.cubicTo(float, float, float, float, float, float)>
			path.cubicTo(f3, f2, f5, f1, 0.0F, f1);
	//   97  173:aload_0         
	//   98  174:getfield        #33  <Field Path path>
	//   99  177:fload           4
	//  100  179:fload_3         
	//  101  180:fload           6
	//  102  182:fload_2         
	//  103  183:fconst_0        
	//  104  184:fload_2         
	//  105  185:invokevirtual   #114 <Method void Path.cubicTo(float, float, float, float, float, float)>
			obj = ((Object) ((PointF)positionAnimation.getValue()));
	//  106  188:aload_0         
	//  107  189:getfield        #66  <Field BaseKeyframeAnimation positionAnimation>
	//  108  192:invokevirtual   #96  <Method Object BaseKeyframeAnimation.getValue()>
	//  109  195:checkcast       #98  <Class PointF>
	//  110  198:astore          8
			path.offset(((PointF) (obj)).x, ((PointF) (obj)).y);
	//  111  200:aload_0         
	//  112  201:getfield        #33  <Field Path path>
	//  113  204:aload           8
	//  114  206:getfield        #102 <Field float PointF.x>
	//  115  209:aload           8
	//  116  211:getfield        #105 <Field float PointF.y>
	//  117  214:invokevirtual   #117 <Method void Path.offset(float, float)>
			path.close();
	//  118  217:aload_0         
	//  119  218:getfield        #33  <Field Path path>
	//  120  221:invokevirtual   #120 <Method void Path.close()>
			Utils.applyTrimPathIfNeeded(path, trimPath);
	//  121  224:aload_0         
	//  122  225:getfield        #33  <Field Path path>
	//  123  228:aload_0         
	//  124  229:getfield        #122 <Field TrimPathContent trimPath>
	//  125  232:invokestatic    #128 <Method void Utils.applyTrimPathIfNeeded(Path, TrimPathContent)>
			isPathValid = true;
	//  126  235:aload_0         
	//  127  236:iconst_1        
	//  128  237:putfield        #82  <Field boolean isPathValid>
			return path;
	//  129  240:aload_0         
	//  130  241:getfield        #33  <Field Path path>
	//  131  244:areturn         
		}
	}

	public void onValueChanged()
	{
		invalidate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #131 <Method void invalidate()>
	//    2    4:return          
	}

	public void setContents(List list, List list1)
	{
		for(int i = 0; i < list.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_1         
	//*   4    4:invokeinterface #139 <Method int List.size()>
	//*   5    9:icmpge          65
		{
			list1 = ((List) ((Content)list.get(i)));
	//    6   12:aload_1         
	//    7   13:iload_3         
	//    8   14:invokeinterface #143 <Method Object List.get(int)>
	//    9   19:checkcast       #145 <Class Content>
	//   10   22:astore_2        
			if(!(list1 instanceof TrimPathContent))
				continue;
	//   11   23:aload_2         
	//   12   24:instanceof      #147 <Class TrimPathContent>
	//   13   27:ifeq            58
			list1 = ((List) ((TrimPathContent)list1));
	//   14   30:aload_2         
	//   15   31:checkcast       #147 <Class TrimPathContent>
	//   16   34:astore_2        
			if(((TrimPathContent) (list1)).getType() == ShapeTrimPath.Type.Simultaneously)
	//*  17   35:aload_2         
	//*  18   36:invokevirtual   #151 <Method ShapeTrimPath$Type TrimPathContent.getType()>
	//*  19   39:getstatic       #157 <Field ShapeTrimPath$Type ShapeTrimPath$Type.Simultaneously>
	//*  20   42:if_acmpne       58
			{
				trimPath = ((TrimPathContent) (list1));
	//   21   45:aload_0         
	//   22   46:aload_2         
	//   23   47:putfield        #122 <Field TrimPathContent trimPath>
				trimPath.addListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   24   50:aload_0         
	//   25   51:getfield        #122 <Field TrimPathContent trimPath>
	//   26   54:aload_0         
	//   27   55:invokevirtual   #160 <Method void TrimPathContent.addListener(BaseKeyframeAnimation$AnimationListener)>
			}
		}

	//   28   58:iload_3         
	//   29   59:iconst_1        
	//   30   60:iadd            
	//   31   61:istore_3        
	//*  32   62:goto            2
	//   33   65:return          
	}

	private boolean isPathValid;
	private final LottieDrawable lottieDrawable;
	private final String name;
	private final Path path = new Path();
	private final BaseKeyframeAnimation positionAnimation;
	private final BaseKeyframeAnimation sizeAnimation;
	private TrimPathContent trimPath;
}
