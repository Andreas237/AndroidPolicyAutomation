// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.Color;
import org.json.JSONArray;

class ColorFactory
	implements AnimatableValue.Factory
{

	ColorFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public Integer valueFromObject(Object obj, float f)
	{
		obj = ((Object) ((JSONArray)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #22  <Class JSONArray>
	//    2    4:astore_1        
		if(((JSONArray) (obj)).length() == 4)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #26  <Method int JSONArray.length()>
	//*   5    9:iconst_4        
	//*   6   10:icmpne          113
		{
			int i = 0;
	//    7   13:iconst_0        
	//    8   14:istore          7
			boolean flag = true;
	//    9   16:iconst_1        
	//   10   17:istore          8
			for(; i < ((JSONArray) (obj)).length(); i++)
	//*  11   19:iload           7
	//*  12   21:aload_1         
	//*  13   22:invokevirtual   #26  <Method int JSONArray.length()>
	//*  14   25:icmpge          51
				if(((JSONArray) (obj)).optDouble(i) > 1.0D)
	//*  15   28:aload_1         
	//*  16   29:iload           7
	//*  17   31:invokevirtual   #30  <Method double JSONArray.optDouble(int)>
	//*  18   34:dconst_1        
	//*  19   35:dcmpl           
	//*  20   36:ifle            42
					flag = false;
	//   21   39:iconst_0        
	//   22   40:istore          8

	//   23   42:iload           7
	//   24   44:iconst_1        
	//   25   45:iadd            
	//   26   46:istore          7
	//*  27   48:goto            19
			if(flag)
	//*  28   51:iload           8
	//*  29   53:ifeq            62
				f = 255F;
	//   30   56:ldc1            #31  <Float 255F>
	//   31   58:fstore_2        
			else
	//*  32   59:goto            64
				f = 1.0F;
	//   33   62:fconst_1        
	//   34   63:fstore_2        
			double d = ((JSONArray) (obj)).optDouble(3);
	//   35   64:aload_1         
	//   36   65:iconst_3        
	//   37   66:invokevirtual   #30  <Method double JSONArray.optDouble(int)>
	//   38   69:dstore_3        
			double d1 = f;
	//   39   70:fload_2         
	//   40   71:f2d             
	//   41   72:dstore          5
			return Integer.valueOf(Color.argb((int)(d * d1), (int)(((JSONArray) (obj)).optDouble(0) * d1), (int)(((JSONArray) (obj)).optDouble(1) * d1), (int)(((JSONArray) (obj)).optDouble(2) * d1)));
	//   42   74:dload_3         
	//   43   75:dload           5
	//   44   77:dmul            
	//   45   78:d2i             
	//   46   79:aload_1         
	//   47   80:iconst_0        
	//   48   81:invokevirtual   #30  <Method double JSONArray.optDouble(int)>
	//   49   84:dload           5
	//   50   86:dmul            
	//   51   87:d2i             
	//   52   88:aload_1         
	//   53   89:iconst_1        
	//   54   90:invokevirtual   #30  <Method double JSONArray.optDouble(int)>
	//   55   93:dload           5
	//   56   95:dmul            
	//   57   96:d2i             
	//   58   97:aload_1         
	//   59   98:iconst_2        
	//   60   99:invokevirtual   #30  <Method double JSONArray.optDouble(int)>
	//   61  102:dload           5
	//   62  104:dmul            
	//   63  105:d2i             
	//   64  106:invokestatic    #37  <Method int Color.argb(int, int, int, int)>
	//   65  109:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   66  112:areturn         
		} else
		{
			return Integer.valueOf(0xff000000);
	//   67  113:ldc1            #44  <Int 0xff000000>
	//   68  115:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   69  118:areturn         
		}
	}

	public volatile Object valueFromObject(Object obj, float f)
	{
		return ((Object) (valueFromObject(obj, f)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #47  <Method Integer valueFromObject(Object, float)>
	//    4    6:areturn         
	}

	static final ColorFactory INSTANCE = new ColorFactory();

	static 
	{
	//    0    0:new             #2   <Class ColorFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void ColorFactory()>
	//    3    7:putstatic       #16  <Field ColorFactory INSTANCE>
	//*   4   10:return          
	}
}
