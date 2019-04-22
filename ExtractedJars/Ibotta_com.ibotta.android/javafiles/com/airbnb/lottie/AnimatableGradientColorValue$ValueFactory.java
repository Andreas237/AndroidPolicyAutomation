// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.Color;
import org.json.JSONArray;

// Referenced classes of package com.airbnb.lottie:
//			AnimatableGradientColorValue, GradientColor

private static class AnimatableGradientColorValue$ValueFactory
	implements AnimatableValue.Factory
{

	public GradientColor valueFromObject(Object obj, float f)
	{
		obj = ((Object) ((JSONArray)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #27  <Class JSONArray>
	//    2    4:astore_1        
		int i = ((JSONArray) (obj)).length() / 4;
	//    3    5:aload_1         
	//    4    6:invokevirtual   #31  <Method int JSONArray.length()>
	//    5    9:iconst_4        
	//    6   10:idiv            
	//    7   11:istore          5
		float af[] = new float[i];
	//    8   13:iload           5
	//    9   15:newarray        float[]
	//   10   17:astore          9
		int ai[] = new int[i];
	//   11   19:iload           5
	//   12   21:newarray        int[]
	//   13   23:astore          10
		GradientColor gradientcolor = new GradientColor(af, ai);
	//   14   25:new             #33  <Class GradientColor>
	//   15   28:dup             
	//   16   29:aload           9
	//   17   31:aload           10
	//   18   33:invokespecial   #36  <Method void GradientColor(float[], int[])>
	//   19   36:astore          11
		i = 0;
	//   20   38:iconst_0        
	//   21   39:istore          5
		int k = 0;
	//   22   41:iconst_0        
	//   23   42:istore          7
		int j = 0;
	//   24   44:iconst_0        
	//   25   45:istore          6
		for(; i < ((JSONArray) (obj)).length(); i++)
	//*  26   47:iload           5
	//*  27   49:aload_1         
	//*  28   50:invokevirtual   #31  <Method int JSONArray.length()>
	//*  29   53:icmpge          169
		{
			int l = i / 4;
	//   30   56:iload           5
	//   31   58:iconst_4        
	//   32   59:idiv            
	//   33   60:istore          8
			double d = ((JSONArray) (obj)).optDouble(i);
	//   34   62:aload_1         
	//   35   63:iload           5
	//   36   65:invokevirtual   #40  <Method double JSONArray.optDouble(int)>
	//   37   68:dstore_3        
			switch(i % 4)
	//*  38   69:iload           5
	//*  39   71:iconst_4        
	//*  40   72:irem            
			{
	//*  41   73:tableswitch     0 3: default 104
	//	               0 153
	//	               1 142
	//	               2 131
	//	               3 107
	//*  42  104:goto            160
			case 3: // '\003'
				ai[l] = Color.argb(255, k, j, (int)(d * 255D));
	//   43  107:aload           10
	//   44  109:iload           8
	//   45  111:sipush          255
	//   46  114:iload           7
	//   47  116:iload           6
	//   48  118:dload_3         
	//   49  119:ldc2w           #41  <Double 255D>
	//   50  122:dmul            
	//   51  123:d2i             
	//   52  124:invokestatic    #48  <Method int Color.argb(int, int, int, int)>
	//   53  127:iastore         
				break;

	//*  54  128:goto            160
			case 2: // '\002'
				j = (int)(d * 255D);
	//   55  131:dload_3         
	//   56  132:ldc2w           #41  <Double 255D>
	//   57  135:dmul            
	//   58  136:d2i             
	//   59  137:istore          6
				break;

	//*  60  139:goto            160
			case 1: // '\001'
				k = (int)(d * 255D);
	//   61  142:dload_3         
	//   62  143:ldc2w           #41  <Double 255D>
	//   63  146:dmul            
	//   64  147:d2i             
	//   65  148:istore          7
				break;

	//*  66  150:goto            160
			case 0: // '\0'
				af[l] = (float)d;
	//   67  153:aload           9
	//   68  155:iload           8
	//   69  157:dload_3         
	//   70  158:d2f             
	//   71  159:fastore         
				break;
			}
		}

	//   72  160:iload           5
	//   73  162:iconst_1        
	//   74  163:iadd            
	//   75  164:istore          5
	//*  76  166:goto            47
		return gradientcolor;
	//   77  169:aload           11
	//   78  171:areturn         
	}

	public volatile Object valueFromObject(Object obj, float f)
	{
		return ((Object) (valueFromObject(obj, f)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #51  <Method GradientColor valueFromObject(Object, float)>
	//    4    6:areturn         
	}

	private static final AnimatableGradientColorValue$ValueFactory INSTANCE = new AnimatableGradientColorValue$ValueFactory();

	static 
	{
	//    0    0:new             #2   <Class AnimatableGradientColorValue$ValueFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void AnimatableGradientColorValue$ValueFactory()>
	//    3    7:putstatic       #19  <Field AnimatableGradientColorValue$ValueFactory INSTANCE>
	//*   4   10:return          
	}


/*
	static AnimatableGradientColorValue$ValueFactory access$000()
	{
		return INSTANCE;
	//    0    0:getstatic       #19  <Field AnimatableGradientColorValue$ValueFactory INSTANCE>
	//    1    3:areturn         
	}

*/

	private AnimatableGradientColorValue$ValueFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}
}
