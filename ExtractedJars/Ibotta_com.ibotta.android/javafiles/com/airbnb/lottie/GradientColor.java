// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


// Referenced classes of package com.airbnb.lottie:
//			MiscUtils, GammaEvaluator

class GradientColor
{

	GradientColor(float af[], int ai[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		positions = af;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field float[] positions>
		colors = ai;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field int[] colors>
	//    8   14:return          
	}

	int[] getColors()
	{
		return colors;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int[] colors>
	//    2    4:areturn         
	}

	float[] getPositions()
	{
		return positions;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field float[] positions>
	//    2    4:areturn         
	}

	int getSize()
	{
		return colors.length;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int[] colors>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	void lerp(GradientColor gradientcolor, GradientColor gradientcolor1, float f)
	{
		if(gradientcolor.colors.length == gradientcolor1.colors.length)
	//*   0    0:aload_1         
	//*   1    1:getfield        #17  <Field int[] colors>
	//*   2    4:arraylength     
	//*   3    5:aload_2         
	//*   4    6:getfield        #17  <Field int[] colors>
	//*   5    9:arraylength     
	//*   6   10:icmpne          86
		{
			for(int i = 0; i < gradientcolor.colors.length; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore          4
	//*   9   16:iload           4
	//*  10   18:aload_1         
	//*  11   19:getfield        #17  <Field int[] colors>
	//*  12   22:arraylength     
	//*  13   23:icmpge          85
			{
				positions[i] = MiscUtils.lerp(gradientcolor.positions[i], gradientcolor1.positions[i], f);
	//   14   26:aload_0         
	//   15   27:getfield        #15  <Field float[] positions>
	//   16   30:iload           4
	//   17   32:aload_1         
	//   18   33:getfield        #15  <Field float[] positions>
	//   19   36:iload           4
	//   20   38:faload          
	//   21   39:aload_2         
	//   22   40:getfield        #15  <Field float[] positions>
	//   23   43:iload           4
	//   24   45:faload          
	//   25   46:fload_3         
	//   26   47:invokestatic    #31  <Method float MiscUtils.lerp(float, float, float)>
	//   27   50:fastore         
				colors[i] = GammaEvaluator.evaluate(f, gradientcolor.colors[i], gradientcolor1.colors[i]);
	//   28   51:aload_0         
	//   29   52:getfield        #17  <Field int[] colors>
	//   30   55:iload           4
	//   31   57:fload_3         
	//   32   58:aload_1         
	//   33   59:getfield        #17  <Field int[] colors>
	//   34   62:iload           4
	//   35   64:iaload          
	//   36   65:aload_2         
	//   37   66:getfield        #17  <Field int[] colors>
	//   38   69:iload           4
	//   39   71:iaload          
	//   40   72:invokestatic    #37  <Method int GammaEvaluator.evaluate(float, int, int)>
	//   41   75:iastore         
			}

	//   42   76:iload           4
	//   43   78:iconst_1        
	//   44   79:iadd            
	//   45   80:istore          4
	//*  46   82:goto            16
			return;
	//   47   85:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   48   86:new             #39  <Class StringBuilder>
	//   49   89:dup             
	//   50   90:invokespecial   #40  <Method void StringBuilder()>
	//   51   93:astore          5
			stringbuilder.append("Cannot interpolate between gradients. Lengths vary (");
	//   52   95:aload           5
	//   53   97:ldc1            #42  <String "Cannot interpolate between gradients. Lengths vary (">
	//   54   99:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   55  102:pop             
			stringbuilder.append(gradientcolor.colors.length);
	//   56  103:aload           5
	//   57  105:aload_1         
	//   58  106:getfield        #17  <Field int[] colors>
	//   59  109:arraylength     
	//   60  110:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   61  113:pop             
			stringbuilder.append(" vs ");
	//   62  114:aload           5
	//   63  116:ldc1            #51  <String " vs ">
	//   64  118:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   65  121:pop             
			stringbuilder.append(gradientcolor1.colors.length);
	//   66  122:aload           5
	//   67  124:aload_2         
	//   68  125:getfield        #17  <Field int[] colors>
	//   69  128:arraylength     
	//   70  129:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   71  132:pop             
			stringbuilder.append(")");
	//   72  133:aload           5
	//   73  135:ldc1            #53  <String ")">
	//   74  137:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   75  140:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   76  141:new             #55  <Class IllegalArgumentException>
	//   77  144:dup             
	//   78  145:aload           5
	//   79  147:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   80  150:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//   81  153:athrow          
		}
	}

	private final int colors[];
	private final float positions[];
}
