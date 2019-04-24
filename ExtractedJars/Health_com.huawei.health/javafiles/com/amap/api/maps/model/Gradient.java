// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.graphics.Color;
import android.util.Log;
import com.amap.api.maps.AMapException;
import java.util.HashMap;

public class Gradient
{
	static class a
	{

		static float a(a a1)
		{
			return a1.c;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field float c>
		//    2    4:freturn         
		}

		static int b(a a1)
		{
			return a1.a;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field int a>
		//    2    4:ireturn         
		}

		static int c(a a1)
		{
			return a1.b;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field int b>
		//    2    4:ireturn         
		}

		private final int a;
		private final int b;
		private final float c;

		private a(int i, int j, float f)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			a = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #18  <Field int a>
			b = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #20  <Field int b>
			c = f;
		//    8   14:aload_0         
		//    9   15:fload_3         
		//   10   16:putfield        #22  <Field float c>
		//   11   19:return          
		}

	}


	public Gradient(int ai[], float af[])
	{
		this(ai, af, 1000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:sipush          1000
	//    4    6:invokespecial   #21  <Method void Gradient(int[], float[], int)>
	//    5    9:return          
	}

	private Gradient(int ai[], float af[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		d = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #29  <Field boolean d>
		if(ai != null && af != null)
			break MISSING_BLOCK_LABEL_27;
	//    5    9:aload_1         
	//    6   10:ifnull          17
	//    7   13:aload_2         
	//    8   14:ifnonnull       27
		throw new AMapException("colors and startPoints should not be null");
	//    9   17:new             #24  <Class AMapException>
	//   10   20:dup             
	//   11   21:ldc1            #31  <String "colors and startPoints should not be null">
	//   12   23:invokespecial   #34  <Method void AMapException(String)>
	//   13   26:athrow          
		if(ai.length != af.length)
	//*  14   27:aload_1         
	//*  15   28:arraylength     
	//*  16   29:aload_2         
	//*  17   30:arraylength     
	//*  18   31:icmpeq          44
			throw new AMapException("colors and startPoints should be same length");
	//   19   34:new             #24  <Class AMapException>
	//   20   37:dup             
	//   21   38:ldc1            #36  <String "colors and startPoints should be same length">
	//   22   40:invokespecial   #34  <Method void AMapException(String)>
	//   23   43:athrow          
		if(ai.length == 0)
	//*  24   44:aload_1         
	//*  25   45:arraylength     
	//*  26   46:ifne            162
			throw new AMapException("No colors have been defined");
	//   27   49:new             #24  <Class AMapException>
	//   28   52:dup             
	//   29   53:ldc1            #38  <String "No colors have been defined">
	//   30   55:invokespecial   #34  <Method void AMapException(String)>
	//   31   58:athrow          
		  goto _L1
_L4:
		int j;
		if(j >= af.length) goto _L3; else goto _L2
	//   32   59:iload           4
	//   33   61:aload_2         
	//   34   62:arraylength     
	//   35   63:icmpge          90
_L2:
		if(af[j] > af[j - 1])
			break MISSING_BLOCK_LABEL_168;
	//   36   66:aload_2         
	//   37   67:iload           4
	//   38   69:faload          
	//   39   70:aload_2         
	//   40   71:iload           4
	//   41   73:iconst_1        
	//   42   74:isub            
	//   43   75:faload          
	//   44   76:fcmpg           
	//   45   77:ifgt            168
		throw new AMapException("startPoints should be in increasing order");
	//   46   80:new             #24  <Class AMapException>
	//   47   83:dup             
	//   48   84:ldc1            #40  <String "startPoints should be in increasing order">
	//   49   86:invokespecial   #34  <Method void AMapException(String)>
	//   50   89:athrow          
_L3:
		a = i;
	//   51   90:aload_0         
	//   52   91:iload_3         
	//   53   92:putfield        #42  <Field int a>
		b = new int[ai.length];
	//   54   95:aload_0         
	//   55   96:aload_1         
	//   56   97:arraylength     
	//   57   98:newarray        int[]
	//   58  100:putfield        #44  <Field int[] b>
		c = new float[af.length];
	//   59  103:aload_0         
	//   60  104:aload_2         
	//   61  105:arraylength     
	//   62  106:newarray        float[]
	//   63  108:putfield        #46  <Field float[] c>
		System.arraycopy(((Object) (ai)), 0, ((Object) (b)), 0, ai.length);
	//   64  111:aload_1         
	//   65  112:iconst_0        
	//   66  113:aload_0         
	//   67  114:getfield        #44  <Field int[] b>
	//   68  117:iconst_0        
	//   69  118:aload_1         
	//   70  119:arraylength     
	//   71  120:invokestatic    #52  <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (af)), 0, ((Object) (c)), 0, af.length);
	//   72  123:aload_2         
	//   73  124:iconst_0        
	//   74  125:aload_0         
	//   75  126:getfield        #46  <Field float[] c>
	//   76  129:iconst_0        
	//   77  130:aload_2         
	//   78  131:arraylength     
	//   79  132:invokestatic    #52  <Method void System.arraycopy(Object, int, Object, int, int)>
		d = true;
	//   80  135:aload_0         
	//   81  136:iconst_1        
	//   82  137:putfield        #29  <Field boolean d>
		return;
	//   83  140:return          
		ai;
	//   84  141:astore_1        
		d = false;
	//   85  142:aload_0         
	//   86  143:iconst_0        
	//   87  144:putfield        #29  <Field boolean d>
		Log.e("amap", ((AMapException) (ai)).getErrorMessage());
	//   88  147:ldc1            #54  <String "amap">
	//   89  149:aload_1         
	//   90  150:invokevirtual   #58  <Method String AMapException.getErrorMessage()>
	//   91  153:invokestatic    #64  <Method int Log.e(String, String)>
	//   92  156:pop             
		((AMapException) (ai)).printStackTrace();
	//   93  157:aload_1         
	//   94  158:invokevirtual   #67  <Method void AMapException.printStackTrace()>
		return;
	//   95  161:return          
_L1:
		j = 1;
	//   96  162:iconst_1        
	//   97  163:istore          4
		  goto _L4
	//*  98  165:goto            59
		j++;
	//   99  168:iload           4
	//  100  170:iconst_1        
	//  101  171:iadd            
	//  102  172:istore          4
		  goto _L4
	//* 103  174:goto            59
	}

	static int a(int i, int j, float f)
	{
		int k = (int)((float)(Color.alpha(j) - Color.alpha(i)) * f + (float)Color.alpha(i));
	//    0    0:iload_1         
	//    1    1:invokestatic    #74  <Method int Color.alpha(int)>
	//    2    4:iload_0         
	//    3    5:invokestatic    #74  <Method int Color.alpha(int)>
	//    4    8:isub            
	//    5    9:i2f             
	//    6   10:fload_2         
	//    7   11:fmul            
	//    8   12:iload_0         
	//    9   13:invokestatic    #74  <Method int Color.alpha(int)>
	//   10   16:i2f             
	//   11   17:fadd            
	//   12   18:f2i             
	//   13   19:istore_3        
		float af[] = new float[3];
	//   14   20:iconst_3        
	//   15   21:newarray        float[]
	//   16   23:astore          4
		Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), af);
	//   17   25:iload_0         
	//   18   26:invokestatic    #77  <Method int Color.red(int)>
	//   19   29:iload_0         
	//   20   30:invokestatic    #80  <Method int Color.green(int)>
	//   21   33:iload_0         
	//   22   34:invokestatic    #83  <Method int Color.blue(int)>
	//   23   37:aload           4
	//   24   39:invokestatic    #87  <Method void Color.RGBToHSV(int, int, int, float[])>
		float af1[] = new float[3];
	//   25   42:iconst_3        
	//   26   43:newarray        float[]
	//   27   45:astore          5
		Color.RGBToHSV(Color.red(j), Color.green(j), Color.blue(j), af1);
	//   28   47:iload_1         
	//   29   48:invokestatic    #77  <Method int Color.red(int)>
	//   30   51:iload_1         
	//   31   52:invokestatic    #80  <Method int Color.green(int)>
	//   32   55:iload_1         
	//   33   56:invokestatic    #83  <Method int Color.blue(int)>
	//   34   59:aload           5
	//   35   61:invokestatic    #87  <Method void Color.RGBToHSV(int, int, int, float[])>
		if(af[0] - af1[0] > 180F)
	//*  36   64:aload           4
	//*  37   66:iconst_0        
	//*  38   67:faload          
	//*  39   68:aload           5
	//*  40   70:iconst_0        
	//*  41   71:faload          
	//*  42   72:fsub            
	//*  43   73:ldc1            #88  <Float 180F>
	//*  44   75:fcmpl           
	//*  45   76:ifle            93
			af1[0] = af1[0] + 360F;
	//   46   79:aload           5
	//   47   81:iconst_0        
	//   48   82:aload           5
	//   49   84:iconst_0        
	//   50   85:faload          
	//   51   86:ldc1            #89  <Float 360F>
	//   52   88:fadd            
	//   53   89:fastore         
		else
	//*  54   90:goto            119
		if(af1[0] - af[0] > 180F)
	//*  55   93:aload           5
	//*  56   95:iconst_0        
	//*  57   96:faload          
	//*  58   97:aload           4
	//*  59   99:iconst_0        
	//*  60  100:faload          
	//*  61  101:fsub            
	//*  62  102:ldc1            #88  <Float 180F>
	//*  63  104:fcmpl           
	//*  64  105:ifle            119
			af[0] = af[0] + 360F;
	//   65  108:aload           4
	//   66  110:iconst_0        
	//   67  111:aload           4
	//   68  113:iconst_0        
	//   69  114:faload          
	//   70  115:ldc1            #89  <Float 360F>
	//   71  117:fadd            
	//   72  118:fastore         
		float af2[] = new float[3];
	//   73  119:iconst_3        
	//   74  120:newarray        float[]
	//   75  122:astore          6
		for(i = 0; i < 3; i++)
	//*  76  124:iconst_0        
	//*  77  125:istore_0        
	//*  78  126:iload_0         
	//*  79  127:iconst_3        
	//*  80  128:icmpge          158
			af2[i] = (af1[i] - af[i]) * f + af[i];
	//   81  131:aload           6
	//   82  133:iload_0         
	//   83  134:aload           5
	//   84  136:iload_0         
	//   85  137:faload          
	//   86  138:aload           4
	//   87  140:iload_0         
	//   88  141:faload          
	//   89  142:fsub            
	//   90  143:fload_2         
	//   91  144:fmul            
	//   92  145:aload           4
	//   93  147:iload_0         
	//   94  148:faload          
	//   95  149:fadd            
	//   96  150:fastore         

	//   97  151:iload_0         
	//   98  152:iconst_1        
	//   99  153:iadd            
	//  100  154:istore_0        
	//* 101  155:goto            126
		return Color.HSVToColor(k, af2);
	//  102  158:iload_3         
	//  103  159:aload           6
	//  104  161:invokestatic    #93  <Method int Color.HSVToColor(int, float[])>
	//  105  164:ireturn         
	}

	private HashMap a()
	{
		HashMap hashmap = new HashMap(32);
	//    0    0:new             #96  <Class HashMap>
	//    1    3:dup             
	//    2    4:bipush          32
	//    3    6:invokespecial   #99  <Method void HashMap(int)>
	//    4    9:astore_2        
		if(c[0] != 0.0F)
	//*   5   10:aload_0         
	//*   6   11:getfield        #46  <Field float[] c>
	//*   7   14:iconst_0        
	//*   8   15:faload          
	//*   9   16:fconst_0        
	//*  10   17:fcmpl           
	//*  11   18:ifeq            87
			hashmap.put(((Object) (Integer.valueOf(0))), ((Object) (new a(Color.argb(0, Color.red(b[0]), Color.green(b[0]), Color.blue(b[0])), b[0], (float)a * c[0]))));
	//   12   21:aload_2         
	//   13   22:iconst_0        
	//   14   23:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   15   26:new             #8   <Class Gradient$a>
	//   16   29:dup             
	//   17   30:iconst_0        
	//   18   31:aload_0         
	//   19   32:getfield        #44  <Field int[] b>
	//   20   35:iconst_0        
	//   21   36:iaload          
	//   22   37:invokestatic    #77  <Method int Color.red(int)>
	//   23   40:aload_0         
	//   24   41:getfield        #44  <Field int[] b>
	//   25   44:iconst_0        
	//   26   45:iaload          
	//   27   46:invokestatic    #80  <Method int Color.green(int)>
	//   28   49:aload_0         
	//   29   50:getfield        #44  <Field int[] b>
	//   30   53:iconst_0        
	//   31   54:iaload          
	//   32   55:invokestatic    #83  <Method int Color.blue(int)>
	//   33   58:invokestatic    #109 <Method int Color.argb(int, int, int, int)>
	//   34   61:aload_0         
	//   35   62:getfield        #44  <Field int[] b>
	//   36   65:iconst_0        
	//   37   66:iaload          
	//   38   67:aload_0         
	//   39   68:getfield        #42  <Field int a>
	//   40   71:i2f             
	//   41   72:aload_0         
	//   42   73:getfield        #46  <Field float[] c>
	//   43   76:iconst_0        
	//   44   77:faload          
	//   45   78:fmul            
	//   46   79:aconst_null     
	//   47   80:invokespecial   #112 <Method void Gradient$a(int, int, float, Gradient$1)>
	//   48   83:invokevirtual   #116 <Method Object HashMap.put(Object, Object)>
	//   49   86:pop             
		for(int i = 1; i < b.length; i++)
	//*  50   87:iconst_1        
	//*  51   88:istore_1        
	//*  52   89:iload_1         
	//*  53   90:aload_0         
	//*  54   91:getfield        #44  <Field int[] b>
	//*  55   94:arraylength     
	//*  56   95:icmpge          171
			hashmap.put(((Object) (Integer.valueOf((int)((float)a * c[i - 1])))), ((Object) (new a(b[i - 1], b[i], (float)a * (c[i] - c[i - 1])))));
	//   57   98:aload_2         
	//   58   99:aload_0         
	//   59  100:getfield        #42  <Field int a>
	//   60  103:i2f             
	//   61  104:aload_0         
	//   62  105:getfield        #46  <Field float[] c>
	//   63  108:iload_1         
	//   64  109:iconst_1        
	//   65  110:isub            
	//   66  111:faload          
	//   67  112:fmul            
	//   68  113:f2i             
	//   69  114:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   70  117:new             #8   <Class Gradient$a>
	//   71  120:dup             
	//   72  121:aload_0         
	//   73  122:getfield        #44  <Field int[] b>
	//   74  125:iload_1         
	//   75  126:iconst_1        
	//   76  127:isub            
	//   77  128:iaload          
	//   78  129:aload_0         
	//   79  130:getfield        #44  <Field int[] b>
	//   80  133:iload_1         
	//   81  134:iaload          
	//   82  135:aload_0         
	//   83  136:getfield        #42  <Field int a>
	//   84  139:i2f             
	//   85  140:aload_0         
	//   86  141:getfield        #46  <Field float[] c>
	//   87  144:iload_1         
	//   88  145:faload          
	//   89  146:aload_0         
	//   90  147:getfield        #46  <Field float[] c>
	//   91  150:iload_1         
	//   92  151:iconst_1        
	//   93  152:isub            
	//   94  153:faload          
	//   95  154:fsub            
	//   96  155:fmul            
	//   97  156:aconst_null     
	//   98  157:invokespecial   #112 <Method void Gradient$a(int, int, float, Gradient$1)>
	//   99  160:invokevirtual   #116 <Method Object HashMap.put(Object, Object)>
	//  100  163:pop             

	//  101  164:iload_1         
	//  102  165:iconst_1        
	//  103  166:iadd            
	//  104  167:istore_1        
	//* 105  168:goto            89
		if(c[c.length - 1] != 1.0F)
	//* 106  171:aload_0         
	//* 107  172:getfield        #46  <Field float[] c>
	//* 108  175:aload_0         
	//* 109  176:getfield        #46  <Field float[] c>
	//* 110  179:arraylength     
	//* 111  180:iconst_1        
	//* 112  181:isub            
	//* 113  182:faload          
	//* 114  183:fconst_1        
	//* 115  184:fcmpl           
	//* 116  185:ifeq            251
		{
			int j = c.length - 1;
	//  117  188:aload_0         
	//  118  189:getfield        #46  <Field float[] c>
	//  119  192:arraylength     
	//  120  193:iconst_1        
	//  121  194:isub            
	//  122  195:istore_1        
			hashmap.put(((Object) (Integer.valueOf((int)((float)a * c[j])))), ((Object) (new a(b[j], b[j], (float)a * (1.0F - c[j])))));
	//  123  196:aload_2         
	//  124  197:aload_0         
	//  125  198:getfield        #42  <Field int a>
	//  126  201:i2f             
	//  127  202:aload_0         
	//  128  203:getfield        #46  <Field float[] c>
	//  129  206:iload_1         
	//  130  207:faload          
	//  131  208:fmul            
	//  132  209:f2i             
	//  133  210:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//  134  213:new             #8   <Class Gradient$a>
	//  135  216:dup             
	//  136  217:aload_0         
	//  137  218:getfield        #44  <Field int[] b>
	//  138  221:iload_1         
	//  139  222:iaload          
	//  140  223:aload_0         
	//  141  224:getfield        #44  <Field int[] b>
	//  142  227:iload_1         
	//  143  228:iaload          
	//  144  229:aload_0         
	//  145  230:getfield        #42  <Field int a>
	//  146  233:i2f             
	//  147  234:fconst_1        
	//  148  235:aload_0         
	//  149  236:getfield        #46  <Field float[] c>
	//  150  239:iload_1         
	//  151  240:faload          
	//  152  241:fsub            
	//  153  242:fmul            
	//  154  243:aconst_null     
	//  155  244:invokespecial   #112 <Method void Gradient$a(int, int, float, Gradient$1)>
	//  156  247:invokevirtual   #116 <Method Object HashMap.put(Object, Object)>
	//  157  250:pop             
		}
		return hashmap;
	//  158  251:aload_2         
	//  159  252:areturn         
	}

	protected int[] generateColorMap(double d1)
	{
		HashMap hashmap = a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #122 <Method HashMap a()>
	//    2    4:astore          7
		int ai[] = new int[a];
	//    3    6:aload_0         
	//    4    7:getfield        #42  <Field int a>
	//    5   10:newarray        int[]
	//    6   12:astore          8
		a a1 = (a)hashmap.get(((Object) (Integer.valueOf(0))));
	//    7   14:aload           7
	//    8   16:iconst_0        
	//    9   17:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   10   20:invokevirtual   #126 <Method Object HashMap.get(Object)>
	//   11   23:checkcast       #8   <Class Gradient$a>
	//   12   26:astore          6
		int k = 0;
	//   13   28:iconst_0        
	//   14   29:istore          5
		for(int i = 0; i < a; i++)
	//*  15   31:iconst_0        
	//*  16   32:istore          4
	//*  17   34:iload           4
	//*  18   36:aload_0         
	//*  19   37:getfield        #42  <Field int a>
	//*  20   40:icmpge          116
		{
			if(hashmap.containsKey(((Object) (Integer.valueOf(i)))))
	//*  21   43:aload           7
	//*  22   45:iload           4
	//*  23   47:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//*  24   50:invokevirtual   #130 <Method boolean HashMap.containsKey(Object)>
	//*  25   53:ifeq            75
			{
				a1 = (a)hashmap.get(((Object) (Integer.valueOf(i))));
	//   26   56:aload           7
	//   27   58:iload           4
	//   28   60:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   29   63:invokevirtual   #126 <Method Object HashMap.get(Object)>
	//   30   66:checkcast       #8   <Class Gradient$a>
	//   31   69:astore          6
				k = i;
	//   32   71:iload           4
	//   33   73:istore          5
			}
			float f = (float)(i - k) / a.a(a1);
	//   34   75:iload           4
	//   35   77:iload           5
	//   36   79:isub            
	//   37   80:i2f             
	//   38   81:aload           6
	//   39   83:invokestatic    #133 <Method float Gradient$a.a(Gradient$a)>
	//   40   86:fdiv            
	//   41   87:fstore_3        
			ai[i] = a(a.b(a1), a.c(a1), f);
	//   42   88:aload           8
	//   43   90:iload           4
	//   44   92:aload           6
	//   45   94:invokestatic    #136 <Method int Gradient$a.b(Gradient$a)>
	//   46   97:aload           6
	//   47   99:invokestatic    #138 <Method int Gradient$a.c(Gradient$a)>
	//   48  102:fload_3         
	//   49  103:invokestatic    #140 <Method int a(int, int, float)>
	//   50  106:iastore         
		}

	//   51  107:iload           4
	//   52  109:iconst_1        
	//   53  110:iadd            
	//   54  111:istore          4
	//*  55  113:goto            34
		if(d1 != 1.0D)
	//*  56  116:dload_1         
	//*  57  117:dconst_1        
	//*  58  118:dcmpl           
	//*  59  119:ifeq            182
		{
			for(int j = 0; j < a; j++)
	//*  60  122:iconst_0        
	//*  61  123:istore          4
	//*  62  125:iload           4
	//*  63  127:aload_0         
	//*  64  128:getfield        #42  <Field int a>
	//*  65  131:icmpge          182
			{
				int l = ai[j];
	//   66  134:aload           8
	//   67  136:iload           4
	//   68  138:iaload          
	//   69  139:istore          5
				ai[j] = Color.argb((int)((double)Color.alpha(l) * d1), Color.red(l), Color.green(l), Color.blue(l));
	//   70  141:aload           8
	//   71  143:iload           4
	//   72  145:iload           5
	//   73  147:invokestatic    #74  <Method int Color.alpha(int)>
	//   74  150:i2d             
	//   75  151:dload_1         
	//   76  152:dmul            
	//   77  153:d2i             
	//   78  154:iload           5
	//   79  156:invokestatic    #77  <Method int Color.red(int)>
	//   80  159:iload           5
	//   81  161:invokestatic    #80  <Method int Color.green(int)>
	//   82  164:iload           5
	//   83  166:invokestatic    #83  <Method int Color.blue(int)>
	//   84  169:invokestatic    #109 <Method int Color.argb(int, int, int, int)>
	//   85  172:iastore         
			}

	//   86  173:iload           4
	//   87  175:iconst_1        
	//   88  176:iadd            
	//   89  177:istore          4
		}
	//*  90  179:goto            125
		return ai;
	//   91  182:aload           8
	//   92  184:areturn         
	}

	protected boolean isAvailable()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field boolean d>
	//    2    4:ireturn         
	}

	private int a;
	private int b[];
	private float c[];
	private boolean d;
}
