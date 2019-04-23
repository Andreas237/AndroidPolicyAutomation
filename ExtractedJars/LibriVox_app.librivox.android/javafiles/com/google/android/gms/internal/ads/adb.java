// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.aw;
import java.nio.*;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ada, acy, wx, p, 
//			bwk, m, e, wi

public final class adb extends Thread
	implements android.graphics.SurfaceTexture.OnFrameAvailableListener, ada
{

	public adb(Context context)
	{
		super("SphericalVideoProcessor");
	//    0    0:aload_0         
	//    1    1:ldc1            #63  <String "SphericalVideoProcessor">
	//    2    3:invokespecial   #66  <Method void Thread(String)>
		t = ByteBuffer.allocateDirect(a.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
	//    3    6:aload_0         
	//    4    7:getstatic       #58  <Field float[] a>
	//    5   10:arraylength     
	//    6   11:iconst_2        
	//    7   12:ishl            
	//    8   13:invokestatic    #72  <Method ByteBuffer ByteBuffer.allocateDirect(int)>
	//    9   16:invokestatic    #78  <Method ByteOrder ByteOrder.nativeOrder()>
	//   10   19:invokevirtual   #82  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   11   22:invokevirtual   #86  <Method FloatBuffer ByteBuffer.asFloatBuffer()>
	//   12   25:putfield        #88  <Field FloatBuffer t>
		t.put(a).position(0);
	//   13   28:aload_0         
	//   14   29:getfield        #88  <Field FloatBuffer t>
	//   15   32:getstatic       #58  <Field float[] a>
	//   16   35:invokevirtual   #94  <Method FloatBuffer FloatBuffer.put(float[])>
	//   17   38:iconst_0        
	//   18   39:invokevirtual   #98  <Method java.nio.Buffer FloatBuffer.position(int)>
	//   19   42:pop             
	//   20   43:aload_0         
	//   21   44:bipush          9
	//   22   46:newarray        float[]
	//   23   48:putfield        #100 <Field float[] c>
	//   24   51:aload_0         
	//   25   52:bipush          9
	//   26   54:newarray        float[]
	//   27   56:putfield        #102 <Field float[] d>
	//   28   59:aload_0         
	//   29   60:bipush          9
	//   30   62:newarray        float[]
	//   31   64:putfield        #104 <Field float[] e>
	//   32   67:aload_0         
	//   33   68:bipush          9
	//   34   70:newarray        float[]
	//   35   72:putfield        #106 <Field float[] f>
	//   36   75:aload_0         
	//   37   76:bipush          9
	//   38   78:newarray        float[]
	//   39   80:putfield        #108 <Field float[] g>
	//   40   83:aload_0         
	//   41   84:bipush          9
	//   42   86:newarray        float[]
	//   43   88:putfield        #110 <Field float[] h>
	//   44   91:aload_0         
	//   45   92:bipush          9
	//   46   94:newarray        float[]
	//   47   96:putfield        #112 <Field float[] i>
		j = (0.0F / 0.0F);
	//   48   99:aload_0         
	//   49  100:ldc1            #113 <Float (0.0F / 0.0F)>
	//   50  102:putfield        #115 <Field float j>
		b = new acy(context);
	//   51  105:aload_0         
	//   52  106:new             #117 <Class acy>
	//   53  109:dup             
	//   54  110:aload_1         
	//   55  111:invokespecial   #119 <Method void acy(Context)>
	//   56  114:putfield        #121 <Field acy b>
		b.a(((ada) (this)));
	//   57  117:aload_0         
	//   58  118:getfield        #121 <Field acy b>
	//   59  121:aload_0         
	//   60  122:invokevirtual   #124 <Method void acy.a(ada)>
	//   61  125:aload_0         
	//   62  126:new             #126 <Class CountDownLatch>
	//   63  129:dup             
	//   64  130:iconst_1        
	//   65  131:invokespecial   #129 <Method void CountDownLatch(int)>
	//   66  134:putfield        #131 <Field CountDownLatch u>
	//   67  137:aload_0         
	//   68  138:new             #133 <Class Object>
	//   69  141:dup             
	//   70  142:invokespecial   #135 <Method void Object()>
	//   71  145:putfield        #137 <Field Object v>
	//   72  148:return          
	}

	private static int a(int i1, String s1)
	{
		int k1 = GLES20.glCreateShader(i1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #144 <Method int GLES20.glCreateShader(int)>
	//    2    4:istore_3        
		a("createShader");
	//    3    5:ldc1            #146 <String "createShader">
	//    4    7:invokestatic    #148 <Method void a(String)>
		int j1 = k1;
	//    5   10:iload_3         
	//    6   11:istore_2        
		if(k1 != 0)
	//*   7   12:iload_3         
	//*   8   13:ifeq            121
		{
			GLES20.glShaderSource(k1, s1);
	//    9   16:iload_3         
	//   10   17:aload_1         
	//   11   18:invokestatic    #152 <Method void GLES20.glShaderSource(int, String)>
			a("shaderSource");
	//   12   21:ldc1            #154 <String "shaderSource">
	//   13   23:invokestatic    #148 <Method void a(String)>
			GLES20.glCompileShader(k1);
	//   14   26:iload_3         
	//   15   27:invokestatic    #157 <Method void GLES20.glCompileShader(int)>
			a("compileShader");
	//   16   30:ldc1            #159 <String "compileShader">
	//   17   32:invokestatic    #148 <Method void a(String)>
			s1 = ((String) (new int[1]));
	//   18   35:iconst_1        
	//   19   36:newarray        int[]
	//   20   38:astore_1        
			GLES20.glGetShaderiv(k1, 35713, ((int []) (s1)), 0);
	//   21   39:iload_3         
	//   22   40:ldc1            #160 <Int 35713>
	//   23   42:aload_1         
	//   24   43:iconst_0        
	//   25   44:invokestatic    #164 <Method void GLES20.glGetShaderiv(int, int, int[], int)>
			a("getShaderiv");
	//   26   47:ldc1            #166 <String "getShaderiv">
	//   27   49:invokestatic    #148 <Method void a(String)>
			j1 = k1;
	//   28   52:iload_3         
	//   29   53:istore_2        
			if(s1[0] == 0)
	//*  30   54:aload_1         
	//*  31   55:iconst_0        
	//*  32   56:iaload          
	//*  33   57:ifne            121
			{
				s1 = ((String) (new StringBuilder(37)));
	//   34   60:new             #168 <Class StringBuilder>
	//   35   63:dup             
	//   36   64:bipush          37
	//   37   66:invokespecial   #169 <Method void StringBuilder(int)>
	//   38   69:astore_1        
				((StringBuilder) (s1)).append("Could not compile shader ");
	//   39   70:aload_1         
	//   40   71:ldc1            #171 <String "Could not compile shader ">
	//   41   73:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   42   76:pop             
				((StringBuilder) (s1)).append(i1);
	//   43   77:aload_1         
	//   44   78:iload_0         
	//   45   79:invokevirtual   #178 <Method StringBuilder StringBuilder.append(int)>
	//   46   82:pop             
				((StringBuilder) (s1)).append(":");
	//   47   83:aload_1         
	//   48   84:ldc1            #180 <String ":">
	//   49   86:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   50   89:pop             
				Log.e("SphericalVideoRenderer", ((StringBuilder) (s1)).toString());
	//   51   90:ldc1            #182 <String "SphericalVideoRenderer">
	//   52   92:aload_1         
	//   53   93:invokevirtual   #186 <Method String StringBuilder.toString()>
	//   54   96:invokestatic    #191 <Method int Log.e(String, String)>
	//   55   99:pop             
				Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(k1));
	//   56  100:ldc1            #182 <String "SphericalVideoRenderer">
	//   57  102:iload_3         
	//   58  103:invokestatic    #195 <Method String GLES20.glGetShaderInfoLog(int)>
	//   59  106:invokestatic    #191 <Method int Log.e(String, String)>
	//   60  109:pop             
				GLES20.glDeleteShader(k1);
	//   61  110:iload_3         
	//   62  111:invokestatic    #198 <Method void GLES20.glDeleteShader(int)>
				a("deleteShader");
	//   63  114:ldc1            #200 <String "deleteShader">
	//   64  116:invokestatic    #148 <Method void a(String)>
				j1 = 0;
	//   65  119:iconst_0        
	//   66  120:istore_2        
			}
		}
		return j1;
	//   67  121:iload_2         
	//   68  122:ireturn         
	}

	private static void a(String s1)
	{
		int i1 = GLES20.glGetError();
	//    0    0:invokestatic    #204 <Method int GLES20.glGetError()>
	//    1    3:istore_1        
		if(i1 != 0)
	//*   2    4:iload_1         
	//*   3    5:ifeq            55
		{
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 21);
	//    4    8:new             #168 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokestatic    #210 <Method String String.valueOf(Object)>
	//    8   16:invokevirtual   #213 <Method int String.length()>
	//    9   19:bipush          21
	//   10   21:iadd            
	//   11   22:invokespecial   #169 <Method void StringBuilder(int)>
	//   12   25:astore_2        
			stringbuilder.append(s1);
	//   13   26:aload_2         
	//   14   27:aload_0         
	//   15   28:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			stringbuilder.append(": glError ");
	//   17   32:aload_2         
	//   18   33:ldc1            #215 <String ": glError ">
	//   19   35:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			stringbuilder.append(i1);
	//   21   39:aload_2         
	//   22   40:iload_1         
	//   23   41:invokevirtual   #178 <Method StringBuilder StringBuilder.append(int)>
	//   24   44:pop             
			Log.e("SphericalVideoRenderer", stringbuilder.toString());
	//   25   45:ldc1            #182 <String "SphericalVideoRenderer">
	//   26   47:aload_2         
	//   27   48:invokevirtual   #186 <Method String StringBuilder.toString()>
	//   28   51:invokestatic    #191 <Method int Log.e(String, String)>
	//   29   54:pop             
		}
	//   30   55:return          
	}

	private static void a(float af[], float f1)
	{
		af[0] = 1.0F;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:fconst_1        
	//    3    3:fastore         
		af[1] = 0.0F;
	//    4    4:aload_0         
	//    5    5:iconst_1        
	//    6    6:fconst_0        
	//    7    7:fastore         
		af[2] = 0.0F;
	//    8    8:aload_0         
	//    9    9:iconst_2        
	//   10   10:fconst_0        
	//   11   11:fastore         
		af[3] = 0.0F;
	//   12   12:aload_0         
	//   13   13:iconst_3        
	//   14   14:fconst_0        
	//   15   15:fastore         
		double d1 = f1;
	//   16   16:fload_1         
	//   17   17:f2d             
	//   18   18:dstore_2        
		af[4] = (float)Math.cos(d1);
	//   19   19:aload_0         
	//   20   20:iconst_4        
	//   21   21:dload_2         
	//   22   22:invokestatic    #222 <Method double Math.cos(double)>
	//   23   25:d2f             
	//   24   26:fastore         
		af[5] = (float)(-Math.sin(d1));
	//   25   27:aload_0         
	//   26   28:iconst_5        
	//   27   29:dload_2         
	//   28   30:invokestatic    #225 <Method double Math.sin(double)>
	//   29   33:dneg            
	//   30   34:d2f             
	//   31   35:fastore         
		af[6] = 0.0F;
	//   32   36:aload_0         
	//   33   37:bipush          6
	//   34   39:fconst_0        
	//   35   40:fastore         
		af[7] = (float)Math.sin(d1);
	//   36   41:aload_0         
	//   37   42:bipush          7
	//   38   44:dload_2         
	//   39   45:invokestatic    #225 <Method double Math.sin(double)>
	//   40   48:d2f             
	//   41   49:fastore         
		af[8] = (float)Math.cos(d1);
	//   42   50:aload_0         
	//   43   51:bipush          8
	//   44   53:dload_2         
	//   45   54:invokestatic    #222 <Method double Math.cos(double)>
	//   46   57:d2f             
	//   47   58:fastore         
	//   48   59:return          
	}

	private static void a(float af[], float af1[], float af2[])
	{
		af[0] = af1[0] * af2[0] + af1[1] * af2[3] + af1[2] * af2[6];
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:iconst_0        
	//    4    4:faload          
	//    5    5:aload_2         
	//    6    6:iconst_0        
	//    7    7:faload          
	//    8    8:fmul            
	//    9    9:aload_1         
	//   10   10:iconst_1        
	//   11   11:faload          
	//   12   12:aload_2         
	//   13   13:iconst_3        
	//   14   14:faload          
	//   15   15:fmul            
	//   16   16:fadd            
	//   17   17:aload_1         
	//   18   18:iconst_2        
	//   19   19:faload          
	//   20   20:aload_2         
	//   21   21:bipush          6
	//   22   23:faload          
	//   23   24:fmul            
	//   24   25:fadd            
	//   25   26:fastore         
		af[1] = af1[0] * af2[1] + af1[1] * af2[4] + af1[2] * af2[7];
	//   26   27:aload_0         
	//   27   28:iconst_1        
	//   28   29:aload_1         
	//   29   30:iconst_0        
	//   30   31:faload          
	//   31   32:aload_2         
	//   32   33:iconst_1        
	//   33   34:faload          
	//   34   35:fmul            
	//   35   36:aload_1         
	//   36   37:iconst_1        
	//   37   38:faload          
	//   38   39:aload_2         
	//   39   40:iconst_4        
	//   40   41:faload          
	//   41   42:fmul            
	//   42   43:fadd            
	//   43   44:aload_1         
	//   44   45:iconst_2        
	//   45   46:faload          
	//   46   47:aload_2         
	//   47   48:bipush          7
	//   48   50:faload          
	//   49   51:fmul            
	//   50   52:fadd            
	//   51   53:fastore         
		af[2] = af1[0] * af2[2] + af1[1] * af2[5] + af1[2] * af2[8];
	//   52   54:aload_0         
	//   53   55:iconst_2        
	//   54   56:aload_1         
	//   55   57:iconst_0        
	//   56   58:faload          
	//   57   59:aload_2         
	//   58   60:iconst_2        
	//   59   61:faload          
	//   60   62:fmul            
	//   61   63:aload_1         
	//   62   64:iconst_1        
	//   63   65:faload          
	//   64   66:aload_2         
	//   65   67:iconst_5        
	//   66   68:faload          
	//   67   69:fmul            
	//   68   70:fadd            
	//   69   71:aload_1         
	//   70   72:iconst_2        
	//   71   73:faload          
	//   72   74:aload_2         
	//   73   75:bipush          8
	//   74   77:faload          
	//   75   78:fmul            
	//   76   79:fadd            
	//   77   80:fastore         
		af[3] = af1[3] * af2[0] + af1[4] * af2[3] + af1[5] * af2[6];
	//   78   81:aload_0         
	//   79   82:iconst_3        
	//   80   83:aload_1         
	//   81   84:iconst_3        
	//   82   85:faload          
	//   83   86:aload_2         
	//   84   87:iconst_0        
	//   85   88:faload          
	//   86   89:fmul            
	//   87   90:aload_1         
	//   88   91:iconst_4        
	//   89   92:faload          
	//   90   93:aload_2         
	//   91   94:iconst_3        
	//   92   95:faload          
	//   93   96:fmul            
	//   94   97:fadd            
	//   95   98:aload_1         
	//   96   99:iconst_5        
	//   97  100:faload          
	//   98  101:aload_2         
	//   99  102:bipush          6
	//  100  104:faload          
	//  101  105:fmul            
	//  102  106:fadd            
	//  103  107:fastore         
		af[4] = af1[3] * af2[1] + af1[4] * af2[4] + af1[5] * af2[7];
	//  104  108:aload_0         
	//  105  109:iconst_4        
	//  106  110:aload_1         
	//  107  111:iconst_3        
	//  108  112:faload          
	//  109  113:aload_2         
	//  110  114:iconst_1        
	//  111  115:faload          
	//  112  116:fmul            
	//  113  117:aload_1         
	//  114  118:iconst_4        
	//  115  119:faload          
	//  116  120:aload_2         
	//  117  121:iconst_4        
	//  118  122:faload          
	//  119  123:fmul            
	//  120  124:fadd            
	//  121  125:aload_1         
	//  122  126:iconst_5        
	//  123  127:faload          
	//  124  128:aload_2         
	//  125  129:bipush          7
	//  126  131:faload          
	//  127  132:fmul            
	//  128  133:fadd            
	//  129  134:fastore         
		af[5] = af1[3] * af2[2] + af1[4] * af2[5] + af1[5] * af2[8];
	//  130  135:aload_0         
	//  131  136:iconst_5        
	//  132  137:aload_1         
	//  133  138:iconst_3        
	//  134  139:faload          
	//  135  140:aload_2         
	//  136  141:iconst_2        
	//  137  142:faload          
	//  138  143:fmul            
	//  139  144:aload_1         
	//  140  145:iconst_4        
	//  141  146:faload          
	//  142  147:aload_2         
	//  143  148:iconst_5        
	//  144  149:faload          
	//  145  150:fmul            
	//  146  151:fadd            
	//  147  152:aload_1         
	//  148  153:iconst_5        
	//  149  154:faload          
	//  150  155:aload_2         
	//  151  156:bipush          8
	//  152  158:faload          
	//  153  159:fmul            
	//  154  160:fadd            
	//  155  161:fastore         
		af[6] = af1[6] * af2[0] + af1[7] * af2[3] + af1[8] * af2[6];
	//  156  162:aload_0         
	//  157  163:bipush          6
	//  158  165:aload_1         
	//  159  166:bipush          6
	//  160  168:faload          
	//  161  169:aload_2         
	//  162  170:iconst_0        
	//  163  171:faload          
	//  164  172:fmul            
	//  165  173:aload_1         
	//  166  174:bipush          7
	//  167  176:faload          
	//  168  177:aload_2         
	//  169  178:iconst_3        
	//  170  179:faload          
	//  171  180:fmul            
	//  172  181:fadd            
	//  173  182:aload_1         
	//  174  183:bipush          8
	//  175  185:faload          
	//  176  186:aload_2         
	//  177  187:bipush          6
	//  178  189:faload          
	//  179  190:fmul            
	//  180  191:fadd            
	//  181  192:fastore         
		af[7] = af1[6] * af2[1] + af1[7] * af2[4] + af1[8] * af2[7];
	//  182  193:aload_0         
	//  183  194:bipush          7
	//  184  196:aload_1         
	//  185  197:bipush          6
	//  186  199:faload          
	//  187  200:aload_2         
	//  188  201:iconst_1        
	//  189  202:faload          
	//  190  203:fmul            
	//  191  204:aload_1         
	//  192  205:bipush          7
	//  193  207:faload          
	//  194  208:aload_2         
	//  195  209:iconst_4        
	//  196  210:faload          
	//  197  211:fmul            
	//  198  212:fadd            
	//  199  213:aload_1         
	//  200  214:bipush          8
	//  201  216:faload          
	//  202  217:aload_2         
	//  203  218:bipush          7
	//  204  220:faload          
	//  205  221:fmul            
	//  206  222:fadd            
	//  207  223:fastore         
		af[8] = af1[6] * af2[2] + af1[7] * af2[5] + af1[8] * af2[8];
	//  208  224:aload_0         
	//  209  225:bipush          8
	//  210  227:aload_1         
	//  211  228:bipush          6
	//  212  230:faload          
	//  213  231:aload_2         
	//  214  232:iconst_2        
	//  215  233:faload          
	//  216  234:fmul            
	//  217  235:aload_1         
	//  218  236:bipush          7
	//  219  238:faload          
	//  220  239:aload_2         
	//  221  240:iconst_5        
	//  222  241:faload          
	//  223  242:fmul            
	//  224  243:fadd            
	//  225  244:aload_1         
	//  226  245:bipush          8
	//  227  247:faload          
	//  228  248:aload_2         
	//  229  249:bipush          8
	//  230  251:faload          
	//  231  252:fmul            
	//  232  253:fadd            
	//  233  254:fastore         
	//  234  255:return          
	}

	private static void b(float af[], float f1)
	{
		double d1 = f1;
	//    0    0:fload_1         
	//    1    1:f2d             
	//    2    2:dstore_2        
		af[0] = (float)Math.cos(d1);
	//    3    3:aload_0         
	//    4    4:iconst_0        
	//    5    5:dload_2         
	//    6    6:invokestatic    #222 <Method double Math.cos(double)>
	//    7    9:d2f             
	//    8   10:fastore         
		af[1] = (float)(-Math.sin(d1));
	//    9   11:aload_0         
	//   10   12:iconst_1        
	//   11   13:dload_2         
	//   12   14:invokestatic    #225 <Method double Math.sin(double)>
	//   13   17:dneg            
	//   14   18:d2f             
	//   15   19:fastore         
		af[2] = 0.0F;
	//   16   20:aload_0         
	//   17   21:iconst_2        
	//   18   22:fconst_0        
	//   19   23:fastore         
		af[3] = (float)Math.sin(d1);
	//   20   24:aload_0         
	//   21   25:iconst_3        
	//   22   26:dload_2         
	//   23   27:invokestatic    #225 <Method double Math.sin(double)>
	//   24   30:d2f             
	//   25   31:fastore         
		af[4] = (float)Math.cos(d1);
	//   26   32:aload_0         
	//   27   33:iconst_4        
	//   28   34:dload_2         
	//   29   35:invokestatic    #222 <Method double Math.cos(double)>
	//   30   38:d2f             
	//   31   39:fastore         
		af[5] = 0.0F;
	//   32   40:aload_0         
	//   33   41:iconst_5        
	//   34   42:fconst_0        
	//   35   43:fastore         
		af[6] = 0.0F;
	//   36   44:aload_0         
	//   37   45:bipush          6
	//   38   47:fconst_0        
	//   39   48:fastore         
		af[7] = 0.0F;
	//   40   49:aload_0         
	//   41   50:bipush          7
	//   42   52:fconst_0        
	//   43   53:fastore         
		af[8] = 1.0F;
	//   44   54:aload_0         
	//   45   55:bipush          8
	//   46   57:fconst_1        
	//   47   58:fastore         
	//   48   59:return          
	}

	private final boolean d()
	{
		Object obj = ((Object) (z));
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field EGLSurface z>
	//    2    4:astore_3        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		boolean flag = flag1;
	//    5    7:iload_2         
	//    6    8:istore_1        
		if(obj != null)
	//*   7    9:aload_3         
	//*   8   10:ifnull          72
		{
			flag = flag1;
	//    9   13:iload_2         
	//   10   14:istore_1        
			if(obj != EGL10.EGL_NO_SURFACE)
	//*  11   15:aload_3         
	//*  12   16:getstatic       #234 <Field EGLSurface EGL10.EGL_NO_SURFACE>
	//*  13   19:if_acmpeq       72
			{
				flag = w.eglMakeCurrent(x, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
	//   14   22:aload_0         
	//   15   23:getfield        #236 <Field EGL10 w>
	//   16   26:aload_0         
	//   17   27:getfield        #238 <Field EGLDisplay x>
	//   18   30:getstatic       #234 <Field EGLSurface EGL10.EGL_NO_SURFACE>
	//   19   33:getstatic       #234 <Field EGLSurface EGL10.EGL_NO_SURFACE>
	//   20   36:getstatic       #241 <Field EGLContext EGL10.EGL_NO_CONTEXT>
	//   21   39:invokeinterface #245 <Method boolean EGL10.eglMakeCurrent(EGLDisplay, EGLSurface, EGLSurface, EGLContext)>
	//   22   44:istore_1        
				flag = w.eglDestroySurface(x, z) | (flag | false);
	//   23   45:aload_0         
	//   24   46:getfield        #236 <Field EGL10 w>
	//   25   49:aload_0         
	//   26   50:getfield        #238 <Field EGLDisplay x>
	//   27   53:aload_0         
	//   28   54:getfield        #229 <Field EGLSurface z>
	//   29   57:invokeinterface #249 <Method boolean EGL10.eglDestroySurface(EGLDisplay, EGLSurface)>
	//   30   62:iload_1         
	//   31   63:iconst_0        
	//   32   64:ior             
	//   33   65:ior             
	//   34   66:istore_1        
				z = null;
	//   35   67:aload_0         
	//   36   68:aconst_null     
	//   37   69:putfield        #229 <Field EGLSurface z>
			}
		}
		obj = ((Object) (y));
	//   38   72:aload_0         
	//   39   73:getfield        #251 <Field EGLContext y>
	//   40   76:astore_3        
		flag1 = flag;
	//   41   77:iload_1         
	//   42   78:istore_2        
		if(obj != null)
	//*  43   79:aload_3         
	//*  44   80:ifnull          105
		{
			flag1 = flag | w.eglDestroyContext(x, ((EGLContext) (obj)));
	//   45   83:iload_1         
	//   46   84:aload_0         
	//   47   85:getfield        #236 <Field EGL10 w>
	//   48   88:aload_0         
	//   49   89:getfield        #238 <Field EGLDisplay x>
	//   50   92:aload_3         
	//   51   93:invokeinterface #255 <Method boolean EGL10.eglDestroyContext(EGLDisplay, EGLContext)>
	//   52   98:ior             
	//   53   99:istore_2        
			y = null;
	//   54  100:aload_0         
	//   55  101:aconst_null     
	//   56  102:putfield        #251 <Field EGLContext y>
		}
		obj = ((Object) (x));
	//   57  105:aload_0         
	//   58  106:getfield        #238 <Field EGLDisplay x>
	//   59  109:astore_3        
		flag = flag1;
	//   60  110:iload_2         
	//   61  111:istore_1        
		if(obj != null)
	//*  62  112:aload_3         
	//*  63  113:ifnull          134
		{
			flag = flag1 | w.eglTerminate(((EGLDisplay) (obj)));
	//   64  116:iload_2         
	//   65  117:aload_0         
	//   66  118:getfield        #236 <Field EGL10 w>
	//   67  121:aload_3         
	//   68  122:invokeinterface #259 <Method boolean EGL10.eglTerminate(EGLDisplay)>
	//   69  127:ior             
	//   70  128:istore_1        
			x = null;
	//   71  129:aload_0         
	//   72  130:aconst_null     
	//   73  131:putfield        #238 <Field EGLDisplay x>
		}
		return flag;
	//   74  134:iload_1         
	//   75  135:ireturn         
	}

	public final void a()
	{
		synchronized(v)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field Object v>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			v.notifyAll();
	//    5    7:aload_0         
	//    6    8:getfield        #137 <Field Object v>
	//    7   11:invokevirtual   #262 <Method void Object.notifyAll()>
		}
	//    8   14:aload_1         
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		exception;
	//   11   17:astore_2        
		obj;
	//   12   18:aload_1         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		throw exception;
	//   14   20:aload_2         
	//   15   21:athrow          
	}

	public final void a(float f1, float f2)
	{
		int i1 = n;
	//    0    0:aload_0         
	//    1    1:getfield        #265 <Field int n>
	//    2    4:istore_3        
		int j1 = m;
	//    3    5:aload_0         
	//    4    6:getfield        #267 <Field int m>
	//    5    9:istore          4
		if(i1 > j1)
	//*   6   11:iload_3         
	//*   7   12:iload           4
	//*   8   14:icmple          38
		{
			f1 = (f1 * 1.745329F) / (float)i1;
	//    9   17:fload_1         
	//   10   18:ldc2            #268 <Float 1.745329F>
	//   11   21:fmul            
	//   12   22:iload_3         
	//   13   23:i2f             
	//   14   24:fdiv            
	//   15   25:fstore_1        
			f2 = (f2 * 1.745329F) / (float)i1;
	//   16   26:fload_2         
	//   17   27:ldc2            #268 <Float 1.745329F>
	//   18   30:fmul            
	//   19   31:iload_3         
	//   20   32:i2f             
	//   21   33:fdiv            
	//   22   34:fstore_2        
		} else
	//*  23   35:goto            58
		{
			f1 = (f1 * 1.745329F) / (float)j1;
	//   24   38:fload_1         
	//   25   39:ldc2            #268 <Float 1.745329F>
	//   26   42:fmul            
	//   27   43:iload           4
	//   28   45:i2f             
	//   29   46:fdiv            
	//   30   47:fstore_1        
			f2 = (f2 * 1.745329F) / (float)j1;
	//   31   48:fload_2         
	//   32   49:ldc2            #268 <Float 1.745329F>
	//   33   52:fmul            
	//   34   53:iload           4
	//   35   55:i2f             
	//   36   56:fdiv            
	//   37   57:fstore_2        
		}
		k = k - f1;
	//   38   58:aload_0         
	//   39   59:aload_0         
	//   40   60:getfield        #270 <Field float k>
	//   41   63:fload_1         
	//   42   64:fsub            
	//   43   65:putfield        #270 <Field float k>
		l = l - f2;
	//   44   68:aload_0         
	//   45   69:aload_0         
	//   46   70:getfield        #272 <Field float l>
	//   47   73:fload_2         
	//   48   74:fsub            
	//   49   75:putfield        #272 <Field float l>
		if(l < -1.570796F)
	//*  50   78:aload_0         
	//*  51   79:getfield        #272 <Field float l>
	//*  52   82:ldc2            #273 <Float -1.570796F>
	//*  53   85:fcmpg           
	//*  54   86:ifge            96
			l = -1.570796F;
	//   55   89:aload_0         
	//   56   90:ldc2            #273 <Float -1.570796F>
	//   57   93:putfield        #272 <Field float l>
		if(l > 1.570796F)
	//*  58   96:aload_0         
	//*  59   97:getfield        #272 <Field float l>
	//*  60  100:ldc2            #274 <Float 1.570796F>
	//*  61  103:fcmpl           
	//*  62  104:ifle            114
			l = 1.570796F;
	//   63  107:aload_0         
	//   64  108:ldc2            #274 <Float 1.570796F>
	//   65  111:putfield        #272 <Field float l>
	//   66  114:return          
	}

	public final void a(int i1, int j1)
	{
		synchronized(v)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field Object v>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			n = i1;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #265 <Field int n>
			m = j1;
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:putfield        #267 <Field int m>
			A = true;
	//   11   17:aload_0         
	//   12   18:iconst_1        
	//   13   19:putfield        #277 <Field boolean A>
			v.notifyAll();
	//   14   22:aload_0         
	//   15   23:getfield        #137 <Field Object v>
	//   16   26:invokevirtual   #262 <Method void Object.notifyAll()>
		}
	//   17   29:aload_3         
	//   18   30:monitorexit     
		return;
	//   19   31:return          
		exception;
	//   20   32:astore          4
		obj;
	//   21   34:aload_3         
		JVM INSTR monitorexit ;
	//   22   35:monitorexit     
		throw exception;
	//   23   36:aload           4
	//   24   38:athrow          
	}

	public final void a(SurfaceTexture surfacetexture, int i1, int j1)
	{
		n = i1;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #265 <Field int n>
		m = j1;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:putfield        #267 <Field int m>
		p = surfacetexture;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #280 <Field SurfaceTexture p>
	//    9   15:return          
	}

	public final void b()
	{
		synchronized(v)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field Object v>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			B = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #282 <Field boolean B>
			p = null;
	//    8   12:aload_0         
	//    9   13:aconst_null     
	//   10   14:putfield        #280 <Field SurfaceTexture p>
			v.notifyAll();
	//   11   17:aload_0         
	//   12   18:getfield        #137 <Field Object v>
	//   13   21:invokevirtual   #262 <Method void Object.notifyAll()>
		}
	//   14   24:aload_1         
	//   15   25:monitorexit     
		return;
	//   16   26:return          
		exception;
	//   17   27:astore_2        
		obj;
	//   18   28:aload_1         
		JVM INSTR monitorexit ;
	//   19   29:monitorexit     
		throw exception;
	//   20   30:aload_2         
	//   21   31:athrow          
	}

	public final SurfaceTexture c()
	{
		if(p == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #280 <Field SurfaceTexture p>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		try
		{
			u.await();
	//    5    9:aload_0         
	//    6   10:getfield        #131 <Field CountDownLatch u>
	//    7   13:invokevirtual   #288 <Method void CountDownLatch.await()>
		}
	//*   8   16:aload_0         
	//*   9   17:getfield        #290 <Field SurfaceTexture o>
	//*  10   20:areturn         
		catch(InterruptedException interruptedexception) { }
	//   11   21:astore_1        
		return o;
	//*  12   22:goto            16
	}

	public final void onFrameAvailable(SurfaceTexture surfacetexture)
	{
		s = s + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #294 <Field int s>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #294 <Field int s>
		synchronized(v)
	//*   6   10:aload_0         
	//*   7   11:getfield        #137 <Field Object v>
	//*   8   14:astore_1        
	//*   9   15:aload_1         
	//*  10   16:monitorenter    
		{
			v.notifyAll();
	//   11   17:aload_0         
	//   12   18:getfield        #137 <Field Object v>
	//   13   21:invokevirtual   #262 <Method void Object.notifyAll()>
		}
	//   14   24:aload_1         
	//   15   25:monitorexit     
		return;
	//   16   26:return          
		exception;
	//   17   27:astore_2        
		surfacetexture;
	//   18   28:aload_1         
		JVM INSTR monitorexit ;
	//   19   29:monitorexit     
		throw exception;
	//   20   30:aload_2         
	//   21   31:athrow          
	}

	public final void run()
	{
		int i1;
		boolean flag;
		int i2;
		if(p == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #280 <Field SurfaceTexture p>
	//*   2    4:ifnonnull       21
		{
			wx.c("SphericalVideoProcessor started with no output texture.");
	//    3    7:ldc2            #301 <String "SphericalVideoProcessor started with no output texture.">
	//    4   10:invokestatic    #305 <Method void wx.c(String)>
			u.countDown();
	//    5   13:aload_0         
	//    6   14:getfield        #131 <Field CountDownLatch u>
	//    7   17:invokevirtual   #308 <Method void CountDownLatch.countDown()>
			return;
	//    8   20:return          
		}
		w = (EGL10)EGLContext.getEGL();
	//    9   21:aload_0         
	//   10   22:invokestatic    #314 <Method javax.microedition.khronos.egl.EGL EGLContext.getEGL()>
	//   11   25:checkcast       #231 <Class EGL10>
	//   12   28:putfield        #236 <Field EGL10 w>
		x = w.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
	//   13   31:aload_0         
	//   14   32:aload_0         
	//   15   33:getfield        #236 <Field EGL10 w>
	//   16   36:getstatic       #317 <Field Object EGL10.EGL_DEFAULT_DISPLAY>
	//   17   39:invokeinterface #321 <Method EGLDisplay EGL10.eglGetDisplay(Object)>
	//   18   44:putfield        #238 <Field EGLDisplay x>
		if(x == EGL10.EGL_NO_DISPLAY)
	//*  19   47:aload_0         
	//*  20   48:getfield        #238 <Field EGLDisplay x>
	//*  21   51:getstatic       #324 <Field EGLDisplay EGL10.EGL_NO_DISPLAY>
	//*  22   54:if_acmpne       62
		{
			i1 = 0;
	//   23   57:iconst_0        
	//   24   58:istore_1        
		} else
	//*  25   59:goto            384
		{
			int ai[] = new int[2];
	//   26   62:iconst_2        
	//   27   63:newarray        int[]
	//   28   65:astore          6
			if(!w.eglInitialize(x, ai))
	//*  29   67:aload_0         
	//*  30   68:getfield        #236 <Field EGL10 w>
	//*  31   71:aload_0         
	//*  32   72:getfield        #238 <Field EGLDisplay x>
	//*  33   75:aload           6
	//*  34   77:invokeinterface #328 <Method boolean EGL10.eglInitialize(EGLDisplay, int[])>
	//*  35   82:ifne            90
			{
				i1 = 0;
	//   36   85:iconst_0        
	//   37   86:istore_1        
			} else
	//*  38   87:goto            384
			{
				int ai1[] = new int[1];
	//   39   90:iconst_1        
	//   40   91:newarray        int[]
	//   41   93:astore          6
				EGLConfig aeglconfig[] = new EGLConfig[1];
	//   42   95:iconst_1        
	//   43   96:anewarray       EGLConfig[]
	//   44   99:astore          7
				Object obj;
				if(w.eglChooseConfig(x, new int[] {
	12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 
	12344
}, aeglconfig, 1, ai1) && ai1[0] > 0)
	//*  45  101:aload_0         
	//*  46  102:getfield        #236 <Field EGL10 w>
	//*  47  105:aload_0         
	//*  48  106:getfield        #238 <Field EGLDisplay x>
	//*  49  109:bipush          11
	//*  50  111:newarray        int[]
	//*  51  113:dup             
	//*  52  114:iconst_0        
	//*  53  115:sipush          12352
	//*  54  118:iastore         
	//*  55  119:dup             
	//*  56  120:iconst_1        
	//*  57  121:iconst_4        
	//*  58  122:iastore         
	//*  59  123:dup             
	//*  60  124:iconst_2        
	//*  61  125:sipush          12324
	//*  62  128:iastore         
	//*  63  129:dup             
	//*  64  130:iconst_3        
	//*  65  131:bipush          8
	//*  66  133:iastore         
	//*  67  134:dup             
	//*  68  135:iconst_4        
	//*  69  136:sipush          12323
	//*  70  139:iastore         
	//*  71  140:dup             
	//*  72  141:iconst_5        
	//*  73  142:bipush          8
	//*  74  144:iastore         
	//*  75  145:dup             
	//*  76  146:bipush          6
	//*  77  148:sipush          12322
	//*  78  151:iastore         
	//*  79  152:dup             
	//*  80  153:bipush          7
	//*  81  155:bipush          8
	//*  82  157:iastore         
	//*  83  158:dup             
	//*  84  159:bipush          8
	//*  85  161:sipush          12325
	//*  86  164:iastore         
	//*  87  165:dup             
	//*  88  166:bipush          9
	//*  89  168:bipush          16
	//*  90  170:iastore         
	//*  91  171:dup             
	//*  92  172:bipush          10
	//*  93  174:sipush          12344
	//*  94  177:iastore         
	//*  95  178:aload           7
	//*  96  180:iconst_1        
	//*  97  181:aload           6
	//*  98  183:invokeinterface #334 <Method boolean EGL10.eglChooseConfig(EGLDisplay, int[], EGLConfig[], int, int[])>
	//*  99  188:ifeq            207
	//* 100  191:aload           6
	//* 101  193:iconst_0        
	//* 102  194:iaload          
	//* 103  195:ifle            207
					obj = ((Object) (aeglconfig[0]));
	//  104  198:aload           7
	//  105  200:iconst_0        
	//  106  201:aaload          
	//  107  202:astore          6
				else
	//* 108  204:goto            210
					obj = null;
	//  109  207:aconst_null     
	//  110  208:astore          6
				if(obj == null)
	//* 111  210:aload           6
	//* 112  212:ifnonnull       220
				{
					i1 = 0;
	//  113  215:iconst_0        
	//  114  216:istore_1        
				} else
	//* 115  217:goto            384
				{
					y = w.eglCreateContext(x, ((EGLConfig) (obj)), EGL10.EGL_NO_CONTEXT, new int[] {
						12440, 2, 12344
					});
	//  116  220:aload_0         
	//  117  221:aload_0         
	//  118  222:getfield        #236 <Field EGL10 w>
	//  119  225:aload_0         
	//  120  226:getfield        #238 <Field EGLDisplay x>
	//  121  229:aload           6
	//  122  231:getstatic       #241 <Field EGLContext EGL10.EGL_NO_CONTEXT>
	//  123  234:iconst_3        
	//  124  235:newarray        int[]
	//  125  237:dup             
	//  126  238:iconst_0        
	//  127  239:sipush          12440
	//  128  242:iastore         
	//  129  243:dup             
	//  130  244:iconst_1        
	//  131  245:iconst_2        
	//  132  246:iastore         
	//  133  247:dup             
	//  134  248:iconst_2        
	//  135  249:sipush          12344
	//  136  252:iastore         
	//  137  253:invokeinterface #338 <Method EGLContext EGL10.eglCreateContext(EGLDisplay, EGLConfig, EGLContext, int[])>
	//  138  258:putfield        #251 <Field EGLContext y>
					EGLContext eglcontext = y;
	//  139  261:aload_0         
	//  140  262:getfield        #251 <Field EGLContext y>
	//  141  265:astore          7
					if(eglcontext != null && eglcontext != EGL10.EGL_NO_CONTEXT)
	//* 142  267:aload           7
	//* 143  269:ifnull          382
	//* 144  272:aload           7
	//* 145  274:getstatic       #241 <Field EGLContext EGL10.EGL_NO_CONTEXT>
	//* 146  277:if_acmpne       283
	//* 147  280:goto            382
					{
						z = w.eglCreateWindowSurface(x, ((EGLConfig) (obj)), ((Object) (p)), ((int []) (null)));
	//  148  283:aload_0         
	//  149  284:aload_0         
	//  150  285:getfield        #236 <Field EGL10 w>
	//  151  288:aload_0         
	//  152  289:getfield        #238 <Field EGLDisplay x>
	//  153  292:aload           6
	//  154  294:aload_0         
	//  155  295:getfield        #280 <Field SurfaceTexture p>
	//  156  298:aconst_null     
	//  157  299:invokeinterface #342 <Method EGLSurface EGL10.eglCreateWindowSurface(EGLDisplay, EGLConfig, Object, int[])>
	//  158  304:putfield        #229 <Field EGLSurface z>
						obj = ((Object) (z));
	//  159  307:aload_0         
	//  160  308:getfield        #229 <Field EGLSurface z>
	//  161  311:astore          6
						if(obj != null && obj != EGL10.EGL_NO_SURFACE)
	//* 162  313:aload           6
	//* 163  315:ifnull          377
	//* 164  318:aload           6
	//* 165  320:getstatic       #234 <Field EGLSurface EGL10.EGL_NO_SURFACE>
	//* 166  323:if_acmpne       329
	//* 167  326:goto            377
						{
							EGL10 egl10 = w;
	//  168  329:aload_0         
	//  169  330:getfield        #236 <Field EGL10 w>
	//  170  333:astore          6
							EGLDisplay egldisplay = x;
	//  171  335:aload_0         
	//  172  336:getfield        #238 <Field EGLDisplay x>
	//  173  339:astore          7
							EGLSurface eglsurface = z;
	//  174  341:aload_0         
	//  175  342:getfield        #229 <Field EGLSurface z>
	//  176  345:astore          8
							if(!egl10.eglMakeCurrent(egldisplay, eglsurface, eglsurface, y))
	//* 177  347:aload           6
	//* 178  349:aload           7
	//* 179  351:aload           8
	//* 180  353:aload           8
	//* 181  355:aload_0         
	//* 182  356:getfield        #251 <Field EGLContext y>
	//* 183  359:invokeinterface #245 <Method boolean EGL10.eglMakeCurrent(EGLDisplay, EGLSurface, EGLSurface, EGLContext)>
	//* 184  364:ifne            372
								i1 = 0;
	//  185  367:iconst_0        
	//  186  368:istore_1        
							else
	//* 187  369:goto            384
								i1 = 1;
	//  188  372:iconst_1        
	//  189  373:istore_1        
						} else
	//* 190  374:goto            384
						{
							i1 = 0;
	//  191  377:iconst_0        
	//  192  378:istore_1        
						}
					} else
	//* 193  379:goto            384
					{
						i1 = 0;
	//  194  382:iconst_0        
	//  195  383:istore_1        
					}
				}
			}
		}
		Object obj1 = ((Object) (p.aS));
	//  196  384:getstatic       #348 <Field e p.aS>
	//  197  387:astore          6
		if(!((String)bwk.e().a(((e) (obj1)))).equals(((e) (obj1)).b()))
	//* 198  389:invokestatic    #353 <Method m bwk.e()>
	//* 199  392:aload           6
	//* 200  394:invokevirtual   #358 <Method Object m.a(e)>
	//* 201  397:checkcast       #206 <Class String>
	//* 202  400:aload           6
	//* 203  402:invokevirtual   #363 <Method Object e.b()>
	//* 204  405:invokevirtual   #367 <Method boolean String.equals(Object)>
	//* 205  408:ifne            427
			obj1 = ((Object) ((String)bwk.e().a(((e) (obj1)))));
	//  206  411:invokestatic    #353 <Method m bwk.e()>
	//  207  414:aload           6
	//  208  416:invokevirtual   #358 <Method Object m.a(e)>
	//  209  419:checkcast       #206 <Class String>
	//  210  422:astore          6
		else
	//* 211  424:goto            432
			obj1 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}";
	//  212  427:ldc2            #369 <String "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}">
	//  213  430:astore          6
		int j2 = a(35633, ((String) (obj1)));
	//  214  432:ldc2            #370 <Int 35633>
	//  215  435:aload           6
	//  216  437:invokestatic    #372 <Method int a(int, String)>
	//  217  440:istore          4
		int j1;
		if(j2 == 0)
	//* 218  442:iload           4
	//* 219  444:ifne            452
		{
			j1 = 0;
	//  220  447:iconst_0        
	//  221  448:istore_2        
		} else
	//* 222  449:goto            645
		{
			Object obj2 = ((Object) (p.aT));
	//  223  452:getstatic       #375 <Field e p.aT>
	//  224  455:astore          6
			if(!((String)bwk.e().a(((e) (obj2)))).equals(((e) (obj2)).b()))
	//* 225  457:invokestatic    #353 <Method m bwk.e()>
	//* 226  460:aload           6
	//* 227  462:invokevirtual   #358 <Method Object m.a(e)>
	//* 228  465:checkcast       #206 <Class String>
	//* 229  468:aload           6
	//* 230  470:invokevirtual   #363 <Method Object e.b()>
	//* 231  473:invokevirtual   #367 <Method boolean String.equals(Object)>
	//* 232  476:ifne            495
				obj2 = ((Object) ((String)bwk.e().a(((e) (obj2)))));
	//  233  479:invokestatic    #353 <Method m bwk.e()>
	//  234  482:aload           6
	//  235  484:invokevirtual   #358 <Method Object m.a(e)>
	//  236  487:checkcast       #206 <Class String>
	//  237  490:astore          6
			else
	//* 238  492:goto            500
				obj2 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}";
	//  239  495:ldc2            #377 <String "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}">
	//  240  498:astore          6
			int k2 = a(35632, ((String) (obj2)));
	//  241  500:ldc2            #378 <Int 35632>
	//  242  503:aload           6
	//  243  505:invokestatic    #372 <Method int a(int, String)>
	//  244  508:istore          5
			if(k2 == 0)
	//* 245  510:iload           5
	//* 246  512:ifne            520
			{
				j1 = 0;
	//  247  515:iconst_0        
	//  248  516:istore_2        
			} else
	//* 249  517:goto            645
			{
				int l1 = GLES20.glCreateProgram();
	//  250  520:invokestatic    #381 <Method int GLES20.glCreateProgram()>
	//  251  523:istore_3        
				a("createProgram");
	//  252  524:ldc2            #383 <String "createProgram">
	//  253  527:invokestatic    #148 <Method void a(String)>
				j1 = l1;
	//  254  530:iload_3         
	//  255  531:istore_2        
				if(l1 != 0)
	//* 256  532:iload_3         
	//* 257  533:ifeq            645
				{
					GLES20.glAttachShader(l1, j2);
	//  258  536:iload_3         
	//  259  537:iload           4
	//  260  539:invokestatic    #386 <Method void GLES20.glAttachShader(int, int)>
					a("attachShader");
	//  261  542:ldc2            #388 <String "attachShader">
	//  262  545:invokestatic    #148 <Method void a(String)>
					GLES20.glAttachShader(l1, k2);
	//  263  548:iload_3         
	//  264  549:iload           5
	//  265  551:invokestatic    #386 <Method void GLES20.glAttachShader(int, int)>
					a("attachShader");
	//  266  554:ldc2            #388 <String "attachShader">
	//  267  557:invokestatic    #148 <Method void a(String)>
					GLES20.glLinkProgram(l1);
	//  268  560:iload_3         
	//  269  561:invokestatic    #391 <Method void GLES20.glLinkProgram(int)>
					a("linkProgram");
	//  270  564:ldc2            #393 <String "linkProgram">
	//  271  567:invokestatic    #148 <Method void a(String)>
					int ai2[] = new int[1];
	//  272  570:iconst_1        
	//  273  571:newarray        int[]
	//  274  573:astore          6
					GLES20.glGetProgramiv(l1, 35714, ai2, 0);
	//  275  575:iload_3         
	//  276  576:ldc2            #394 <Int 35714>
	//  277  579:aload           6
	//  278  581:iconst_0        
	//  279  582:invokestatic    #397 <Method void GLES20.glGetProgramiv(int, int, int[], int)>
					a("getProgramiv");
	//  280  585:ldc2            #399 <String "getProgramiv">
	//  281  588:invokestatic    #148 <Method void a(String)>
					if(ai2[0] != 1)
	//* 282  591:aload           6
	//* 283  593:iconst_0        
	//* 284  594:iaload          
	//* 285  595:iconst_1        
	//* 286  596:icmpeq          633
					{
						Log.e("SphericalVideoRenderer", "Could not link program: ");
	//  287  599:ldc1            #182 <String "SphericalVideoRenderer">
	//  288  601:ldc2            #401 <String "Could not link program: ">
	//  289  604:invokestatic    #191 <Method int Log.e(String, String)>
	//  290  607:pop             
						Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(l1));
	//  291  608:ldc1            #182 <String "SphericalVideoRenderer">
	//  292  610:iload_3         
	//  293  611:invokestatic    #404 <Method String GLES20.glGetProgramInfoLog(int)>
	//  294  614:invokestatic    #191 <Method int Log.e(String, String)>
	//  295  617:pop             
						GLES20.glDeleteProgram(l1);
	//  296  618:iload_3         
	//  297  619:invokestatic    #407 <Method void GLES20.glDeleteProgram(int)>
						a("deleteProgram");
	//  298  622:ldc2            #409 <String "deleteProgram">
	//  299  625:invokestatic    #148 <Method void a(String)>
						j1 = 0;
	//  300  628:iconst_0        
	//  301  629:istore_2        
					} else
	//* 302  630:goto            645
					{
						GLES20.glValidateProgram(l1);
	//  303  633:iload_3         
	//  304  634:invokestatic    #412 <Method void GLES20.glValidateProgram(int)>
						a("validateProgram");
	//  305  637:ldc2            #414 <String "validateProgram">
	//  306  640:invokestatic    #148 <Method void a(String)>
						j1 = l1;
	//  307  643:iload_3         
	//  308  644:istore_2        
					}
				}
			}
		}
		q = j1;
	//  309  645:aload_0         
	//  310  646:iload_2         
	//  311  647:putfield        #416 <Field int q>
		GLES20.glUseProgram(q);
	//  312  650:aload_0         
	//  313  651:getfield        #416 <Field int q>
	//  314  654:invokestatic    #419 <Method void GLES20.glUseProgram(int)>
		a("useProgram");
	//  315  657:ldc2            #421 <String "useProgram">
	//  316  660:invokestatic    #148 <Method void a(String)>
		j1 = GLES20.glGetAttribLocation(q, "aPosition");
	//  317  663:aload_0         
	//  318  664:getfield        #416 <Field int q>
	//  319  667:ldc2            #423 <String "aPosition">
	//  320  670:invokestatic    #426 <Method int GLES20.glGetAttribLocation(int, String)>
	//  321  673:istore_2        
		GLES20.glVertexAttribPointer(j1, 3, 5126, false, 12, ((java.nio.Buffer) (t)));
	//  322  674:iload_2         
	//  323  675:iconst_3        
	//  324  676:sipush          5126
	//  325  679:iconst_0        
	//  326  680:bipush          12
	//  327  682:aload_0         
	//  328  683:getfield        #88  <Field FloatBuffer t>
	//  329  686:invokestatic    #430 <Method void GLES20.glVertexAttribPointer(int, int, int, boolean, int, java.nio.Buffer)>
		a("vertexAttribPointer");
	//  330  689:ldc2            #432 <String "vertexAttribPointer">
	//  331  692:invokestatic    #148 <Method void a(String)>
		GLES20.glEnableVertexAttribArray(j1);
	//  332  695:iload_2         
	//  333  696:invokestatic    #435 <Method void GLES20.glEnableVertexAttribArray(int)>
		a("enableVertexAttribArray");
	//  334  699:ldc2            #437 <String "enableVertexAttribArray">
	//  335  702:invokestatic    #148 <Method void a(String)>
		int ai3[] = new int[1];
	//  336  705:iconst_1        
	//  337  706:newarray        int[]
	//  338  708:astore          6
		GLES20.glGenTextures(1, ai3, 0);
	//  339  710:iconst_1        
	//  340  711:aload           6
	//  341  713:iconst_0        
	//  342  714:invokestatic    #441 <Method void GLES20.glGenTextures(int, int[], int)>
		a("genTextures");
	//  343  717:ldc2            #443 <String "genTextures">
	//  344  720:invokestatic    #148 <Method void a(String)>
		i2 = ai3[0];
	//  345  723:aload           6
	//  346  725:iconst_0        
	//  347  726:iaload          
	//  348  727:istore_3        
		GLES20.glBindTexture(36197, i2);
	//  349  728:ldc2            #444 <Int 36197>
	//  350  731:iload_3         
	//  351  732:invokestatic    #447 <Method void GLES20.glBindTexture(int, int)>
		a("bindTextures");
	//  352  735:ldc2            #449 <String "bindTextures">
	//  353  738:invokestatic    #148 <Method void a(String)>
		GLES20.glTexParameteri(36197, 10240, 9729);
	//  354  741:ldc2            #444 <Int 36197>
	//  355  744:sipush          10240
	//  356  747:sipush          9729
	//  357  750:invokestatic    #453 <Method void GLES20.glTexParameteri(int, int, int)>
		a("texParameteri");
	//  358  753:ldc2            #455 <String "texParameteri">
	//  359  756:invokestatic    #148 <Method void a(String)>
		GLES20.glTexParameteri(36197, 10241, 9729);
	//  360  759:ldc2            #444 <Int 36197>
	//  361  762:sipush          10241
	//  362  765:sipush          9729
	//  363  768:invokestatic    #453 <Method void GLES20.glTexParameteri(int, int, int)>
		a("texParameteri");
	//  364  771:ldc2            #455 <String "texParameteri">
	//  365  774:invokestatic    #148 <Method void a(String)>
		GLES20.glTexParameteri(36197, 10242, 33071);
	//  366  777:ldc2            #444 <Int 36197>
	//  367  780:sipush          10242
	//  368  783:ldc2            #456 <Int 33071>
	//  369  786:invokestatic    #453 <Method void GLES20.glTexParameteri(int, int, int)>
		a("texParameteri");
	//  370  789:ldc2            #455 <String "texParameteri">
	//  371  792:invokestatic    #148 <Method void a(String)>
		GLES20.glTexParameteri(36197, 10243, 33071);
	//  372  795:ldc2            #444 <Int 36197>
	//  373  798:sipush          10243
	//  374  801:ldc2            #456 <Int 33071>
	//  375  804:invokestatic    #453 <Method void GLES20.glTexParameteri(int, int, int)>
		a("texParameteri");
	//  376  807:ldc2            #455 <String "texParameteri">
	//  377  810:invokestatic    #148 <Method void a(String)>
		r = GLES20.glGetUniformLocation(q, "uVMat");
	//  378  813:aload_0         
	//  379  814:aload_0         
	//  380  815:getfield        #416 <Field int q>
	//  381  818:ldc2            #458 <String "uVMat">
	//  382  821:invokestatic    #461 <Method int GLES20.glGetUniformLocation(int, String)>
	//  383  824:putfield        #463 <Field int r>
		GLES20.glUniformMatrix3fv(r, 1, false, new float[] {
			1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F
		}, 0);
	//  384  827:aload_0         
	//  385  828:getfield        #463 <Field int r>
	//  386  831:iconst_1        
	//  387  832:iconst_0        
	//  388  833:bipush          9
	//  389  835:newarray        float[]
	//  390  837:dup             
	//  391  838:iconst_0        
	//  392  839:fconst_1        
	//  393  840:fastore         
	//  394  841:dup             
	//  395  842:iconst_1        
	//  396  843:fconst_0        
	//  397  844:fastore         
	//  398  845:dup             
	//  399  846:iconst_2        
	//  400  847:fconst_0        
	//  401  848:fastore         
	//  402  849:dup             
	//  403  850:iconst_3        
	//  404  851:fconst_0        
	//  405  852:fastore         
	//  406  853:dup             
	//  407  854:iconst_4        
	//  408  855:fconst_1        
	//  409  856:fastore         
	//  410  857:dup             
	//  411  858:iconst_5        
	//  412  859:fconst_0        
	//  413  860:fastore         
	//  414  861:dup             
	//  415  862:bipush          6
	//  416  864:fconst_0        
	//  417  865:fastore         
	//  418  866:dup             
	//  419  867:bipush          7
	//  420  869:fconst_0        
	//  421  870:fastore         
	//  422  871:dup             
	//  423  872:bipush          8
	//  424  874:fconst_1        
	//  425  875:fastore         
	//  426  876:iconst_0        
	//  427  877:invokestatic    #467 <Method void GLES20.glUniformMatrix3fv(int, int, boolean, float[], int)>
		if(q != 0)
	//* 428  880:aload_0         
	//* 429  881:getfield        #416 <Field int q>
	//* 430  884:ifeq            892
			flag = true;
	//  431  887:iconst_1        
	//  432  888:istore_2        
		else
	//* 433  889:goto            894
			flag = false;
	//  434  892:iconst_0        
	//  435  893:istore_2        
		if(i1 && flag) goto _L2; else goto _L1
	//  436  894:iload_1         
	//  437  895:ifeq            1619
	//  438  898:iload_2         
	//  439  899:ifne            905
	//* 440  902:goto            1619
_L2:
		o = new SurfaceTexture(i2);
	//  441  905:aload_0         
	//  442  906:new             #469 <Class SurfaceTexture>
	//  443  909:dup             
	//  444  910:iload_3         
	//  445  911:invokespecial   #470 <Method void SurfaceTexture(int)>
	//  446  914:putfield        #290 <Field SurfaceTexture o>
		o.setOnFrameAvailableListener(((android.graphics.SurfaceTexture.OnFrameAvailableListener) (this)));
	//  447  917:aload_0         
	//  448  918:getfield        #290 <Field SurfaceTexture o>
	//  449  921:aload_0         
	//  450  922:invokevirtual   #474 <Method void SurfaceTexture.setOnFrameAvailableListener(android.graphics.SurfaceTexture$OnFrameAvailableListener)>
		u.countDown();
	//  451  925:aload_0         
	//  452  926:getfield        #131 <Field CountDownLatch u>
	//  453  929:invokevirtual   #308 <Method void CountDownLatch.countDown()>
		b.a();
	//  454  932:aload_0         
	//  455  933:getfield        #121 <Field acy b>
	//  456  936:invokevirtual   #476 <Method void acy.a()>
		A = true;
	//  457  939:aload_0         
	//  458  940:iconst_1        
	//  459  941:putfield        #277 <Field boolean A>
_L9:
		if(B) goto _L4; else goto _L3
	//  460  944:aload_0         
	//  461  945:getfield        #282 <Field boolean B>
	//  462  948:ifne            1481
_L3:
		for(; s > 0; s = s - 1)
	//* 463  951:aload_0         
	//* 464  952:getfield        #294 <Field int s>
	//* 465  955:ifle            978
			o.updateTexImage();
	//  466  958:aload_0         
	//  467  959:getfield        #290 <Field SurfaceTexture o>
	//  468  962:invokevirtual   #479 <Method void SurfaceTexture.updateTexImage()>

	//  469  965:aload_0         
	//  470  966:aload_0         
	//  471  967:getfield        #294 <Field int s>
	//  472  970:iconst_1        
	//  473  971:isub            
	//  474  972:putfield        #294 <Field int s>
	//* 475  975:goto            951
		float af[];
		float af1[];
		if(!b.a(c))
			break MISSING_BLOCK_LABEL_1177;
	//  476  978:aload_0         
	//  477  979:getfield        #121 <Field acy b>
	//  478  982:aload_0         
	//  479  983:getfield        #100 <Field float[] c>
	//  480  986:invokevirtual   #482 <Method boolean acy.a(float[])>
	//  481  989:ifeq            1177
		if(!Float.isNaN(j))
			break MISSING_BLOCK_LABEL_1158;
	//  482  992:aload_0         
	//  483  993:getfield        #115 <Field float j>
	//  484  996:invokestatic    #488 <Method boolean Float.isNaN(float)>
	//  485  999:ifeq            1158
		af = c;
	//  486 1002:aload_0         
	//  487 1003:getfield        #100 <Field float[] c>
	//  488 1006:astore          6
		af1 = new float[3];
	//  489 1008:iconst_3        
	//  490 1009:newarray        float[]
	//  491 1011:astore          7
		af1[0] = 0.0F;
	//  492 1013:aload           7
	//  493 1015:iconst_0        
	//  494 1016:fconst_0        
	//  495 1017:fastore         
		af1[1] = 1.0F;
	//  496 1018:aload           7
	//  497 1020:iconst_1        
	//  498 1021:fconst_1        
	//  499 1022:fastore         
		af1[2] = 0.0F;
	//  500 1023:aload           7
	//  501 1025:iconst_2        
	//  502 1026:fconst_0        
	//  503 1027:fastore         
		float af2[] = new float[3];
	//  504 1028:iconst_3        
	//  505 1029:newarray        float[]
	//  506 1031:astore          8
		af2[0] = af[0] * af1[0] + af[1] * af1[1] + af[2] * af1[2];
	//  507 1033:aload           8
	//  508 1035:iconst_0        
	//  509 1036:aload           6
	//  510 1038:iconst_0        
	//  511 1039:faload          
	//  512 1040:aload           7
	//  513 1042:iconst_0        
	//  514 1043:faload          
	//  515 1044:fmul            
	//  516 1045:aload           6
	//  517 1047:iconst_1        
	//  518 1048:faload          
	//  519 1049:aload           7
	//  520 1051:iconst_1        
	//  521 1052:faload          
	//  522 1053:fmul            
	//  523 1054:fadd            
	//  524 1055:aload           6
	//  525 1057:iconst_2        
	//  526 1058:faload          
	//  527 1059:aload           7
	//  528 1061:iconst_2        
	//  529 1062:faload          
	//  530 1063:fmul            
	//  531 1064:fadd            
	//  532 1065:fastore         
		af2[1] = af[3] * af1[0] + af[4] * af1[1] + af[5] * af1[2];
	//  533 1066:aload           8
	//  534 1068:iconst_1        
	//  535 1069:aload           6
	//  536 1071:iconst_3        
	//  537 1072:faload          
	//  538 1073:aload           7
	//  539 1075:iconst_0        
	//  540 1076:faload          
	//  541 1077:fmul            
	//  542 1078:aload           6
	//  543 1080:iconst_4        
	//  544 1081:faload          
	//  545 1082:aload           7
	//  546 1084:iconst_1        
	//  547 1085:faload          
	//  548 1086:fmul            
	//  549 1087:fadd            
	//  550 1088:aload           6
	//  551 1090:iconst_5        
	//  552 1091:faload          
	//  553 1092:aload           7
	//  554 1094:iconst_2        
	//  555 1095:faload          
	//  556 1096:fmul            
	//  557 1097:fadd            
	//  558 1098:fastore         
		af2[2] = af[6] * af1[0] + af[7] * af1[1] + af[8] * af1[2];
	//  559 1099:aload           8
	//  560 1101:iconst_2        
	//  561 1102:aload           6
	//  562 1104:bipush          6
	//  563 1106:faload          
	//  564 1107:aload           7
	//  565 1109:iconst_0        
	//  566 1110:faload          
	//  567 1111:fmul            
	//  568 1112:aload           6
	//  569 1114:bipush          7
	//  570 1116:faload          
	//  571 1117:aload           7
	//  572 1119:iconst_1        
	//  573 1120:faload          
	//  574 1121:fmul            
	//  575 1122:fadd            
	//  576 1123:aload           6
	//  577 1125:bipush          8
	//  578 1127:faload          
	//  579 1128:aload           7
	//  580 1130:iconst_2        
	//  581 1131:faload          
	//  582 1132:fmul            
	//  583 1133:fadd            
	//  584 1134:fastore         
		j = -((float)Math.atan2(af2[1], af2[0]) - 1.570796F);
	//  585 1135:aload_0         
	//  586 1136:aload           8
	//  587 1138:iconst_1        
	//  588 1139:faload          
	//  589 1140:f2d             
	//  590 1141:aload           8
	//  591 1143:iconst_0        
	//  592 1144:faload          
	//  593 1145:f2d             
	//  594 1146:invokestatic    #492 <Method double Math.atan2(double, double)>
	//  595 1149:d2f             
	//  596 1150:ldc2            #274 <Float 1.570796F>
	//  597 1153:fsub            
	//  598 1154:fneg            
	//  599 1155:putfield        #115 <Field float j>
		b(h, j + k);
	//  600 1158:aload_0         
	//  601 1159:getfield        #110 <Field float[] h>
	//  602 1162:aload_0         
	//  603 1163:getfield        #115 <Field float j>
	//  604 1166:aload_0         
	//  605 1167:getfield        #270 <Field float k>
	//  606 1170:fadd            
	//  607 1171:invokestatic    #494 <Method void b(float[], float)>
		break MISSING_BLOCK_LABEL_1198;
	//  608 1174:goto            1198
		a(c, -1.570796F);
	//  609 1177:aload_0         
	//  610 1178:getfield        #100 <Field float[] c>
	//  611 1181:ldc2            #273 <Float -1.570796F>
	//  612 1184:invokestatic    #496 <Method void a(float[], float)>
		b(h, k);
	//  613 1187:aload_0         
	//  614 1188:getfield        #110 <Field float[] h>
	//  615 1191:aload_0         
	//  616 1192:getfield        #270 <Field float k>
	//  617 1195:invokestatic    #494 <Method void b(float[], float)>
		int k1;
		a(d, 1.570796F);
	//  618 1198:aload_0         
	//  619 1199:getfield        #102 <Field float[] d>
	//  620 1202:ldc2            #274 <Float 1.570796F>
	//  621 1205:invokestatic    #496 <Method void a(float[], float)>
		a(e, h, d);
	//  622 1208:aload_0         
	//  623 1209:getfield        #104 <Field float[] e>
	//  624 1212:aload_0         
	//  625 1213:getfield        #110 <Field float[] h>
	//  626 1216:aload_0         
	//  627 1217:getfield        #102 <Field float[] d>
	//  628 1220:invokestatic    #498 <Method void a(float[], float[], float[])>
		a(f, c, e);
	//  629 1223:aload_0         
	//  630 1224:getfield        #106 <Field float[] f>
	//  631 1227:aload_0         
	//  632 1228:getfield        #100 <Field float[] c>
	//  633 1231:aload_0         
	//  634 1232:getfield        #104 <Field float[] e>
	//  635 1235:invokestatic    #498 <Method void a(float[], float[], float[])>
		a(g, l);
	//  636 1238:aload_0         
	//  637 1239:getfield        #108 <Field float[] g>
	//  638 1242:aload_0         
	//  639 1243:getfield        #272 <Field float l>
	//  640 1246:invokestatic    #496 <Method void a(float[], float)>
		a(i, g, f);
	//  641 1249:aload_0         
	//  642 1250:getfield        #112 <Field float[] i>
	//  643 1253:aload_0         
	//  644 1254:getfield        #108 <Field float[] g>
	//  645 1257:aload_0         
	//  646 1258:getfield        #106 <Field float[] f>
	//  647 1261:invokestatic    #498 <Method void a(float[], float[], float[])>
		GLES20.glUniformMatrix3fv(r, 1, false, i, 0);
	//  648 1264:aload_0         
	//  649 1265:getfield        #463 <Field int r>
	//  650 1268:iconst_1        
	//  651 1269:iconst_0        
	//  652 1270:aload_0         
	//  653 1271:getfield        #112 <Field float[] i>
	//  654 1274:iconst_0        
	//  655 1275:invokestatic    #467 <Method void GLES20.glUniformMatrix3fv(int, int, boolean, float[], int)>
		GLES20.glDrawArrays(5, 0, 4);
	//  656 1278:iconst_5        
	//  657 1279:iconst_0        
	//  658 1280:iconst_4        
	//  659 1281:invokestatic    #501 <Method void GLES20.glDrawArrays(int, int, int)>
		a("drawArrays");
	//  660 1284:ldc2            #503 <String "drawArrays">
	//  661 1287:invokestatic    #148 <Method void a(String)>
		GLES20.glFinish();
	//  662 1290:invokestatic    #506 <Method void GLES20.glFinish()>
		w.eglSwapBuffers(x, z);
	//  663 1293:aload_0         
	//  664 1294:getfield        #236 <Field EGL10 w>
	//  665 1297:aload_0         
	//  666 1298:getfield        #238 <Field EGLDisplay x>
	//  667 1301:aload_0         
	//  668 1302:getfield        #229 <Field EGLSurface z>
	//  669 1305:invokeinterface #509 <Method boolean EGL10.eglSwapBuffers(EGLDisplay, EGLSurface)>
	//  670 1310:pop             
		if(!A)
			break MISSING_BLOCK_LABEL_1430;
	//  671 1311:aload_0         
	//  672 1312:getfield        #277 <Field boolean A>
	//  673 1315:ifeq            1430
		GLES20.glViewport(0, 0, n, m);
	//  674 1318:iconst_0        
	//  675 1319:iconst_0        
	//  676 1320:aload_0         
	//  677 1321:getfield        #265 <Field int n>
	//  678 1324:aload_0         
	//  679 1325:getfield        #267 <Field int m>
	//  680 1328:invokestatic    #513 <Method void GLES20.glViewport(int, int, int, int)>
		a("viewport");
	//  681 1331:ldc2            #515 <String "viewport">
	//  682 1334:invokestatic    #148 <Method void a(String)>
		i1 = GLES20.glGetUniformLocation(q, "uFOVx");
	//  683 1337:aload_0         
	//  684 1338:getfield        #416 <Field int q>
	//  685 1341:ldc2            #517 <String "uFOVx">
	//  686 1344:invokestatic    #461 <Method int GLES20.glGetUniformLocation(int, String)>
	//  687 1347:istore_1        
		k1 = GLES20.glGetUniformLocation(q, "uFOVy");
	//  688 1348:aload_0         
	//  689 1349:getfield        #416 <Field int q>
	//  690 1352:ldc2            #519 <String "uFOVy">
	//  691 1355:invokestatic    #461 <Method int GLES20.glGetUniformLocation(int, String)>
	//  692 1358:istore_2        
		if(n > m)
	//* 693 1359:aload_0         
	//* 694 1360:getfield        #265 <Field int n>
	//* 695 1363:aload_0         
	//* 696 1364:getfield        #267 <Field int m>
	//* 697 1367:icmple          1399
		{
			GLES20.glUniform1f(i1, 0.8726646F);
	//  698 1370:iload_1         
	//  699 1371:ldc2            #520 <Float 0.8726646F>
	//  700 1374:invokestatic    #524 <Method void GLES20.glUniform1f(int, float)>
			GLES20.glUniform1f(k1, ((float)m * 0.8726646F) / (float)n);
	//  701 1377:iload_2         
	//  702 1378:aload_0         
	//  703 1379:getfield        #267 <Field int m>
	//  704 1382:i2f             
	//  705 1383:ldc2            #520 <Float 0.8726646F>
	//  706 1386:fmul            
	//  707 1387:aload_0         
	//  708 1388:getfield        #265 <Field int n>
	//  709 1391:i2f             
	//  710 1392:fdiv            
	//  711 1393:invokestatic    #524 <Method void GLES20.glUniform1f(int, float)>
			break MISSING_BLOCK_LABEL_1425;
	//  712 1396:goto            1425
		}
		GLES20.glUniform1f(i1, ((float)n * 0.8726646F) / (float)m);
	//  713 1399:iload_1         
	//  714 1400:aload_0         
	//  715 1401:getfield        #265 <Field int n>
	//  716 1404:i2f             
	//  717 1405:ldc2            #520 <Float 0.8726646F>
	//  718 1408:fmul            
	//  719 1409:aload_0         
	//  720 1410:getfield        #267 <Field int m>
	//  721 1413:i2f             
	//  722 1414:fdiv            
	//  723 1415:invokestatic    #524 <Method void GLES20.glUniform1f(int, float)>
		GLES20.glUniform1f(k1, 0.8726646F);
	//  724 1418:iload_2         
	//  725 1419:ldc2            #520 <Float 0.8726646F>
	//  726 1422:invokestatic    #524 <Method void GLES20.glUniform1f(int, float)>
		A = false;
	//  727 1425:aload_0         
	//  728 1426:iconst_0        
	//  729 1427:putfield        #277 <Field boolean A>
		synchronized(v)
	//* 730 1430:aload_0         
	//* 731 1431:getfield        #137 <Field Object v>
	//* 732 1434:astore          6
	//* 733 1436:aload           6
	//* 734 1438:monitorenter    
		{
			if(!B && !A && s == 0)
	//* 735 1439:aload_0         
	//* 736 1440:getfield        #282 <Field boolean B>
	//* 737 1443:ifne            1467
	//* 738 1446:aload_0         
	//* 739 1447:getfield        #277 <Field boolean A>
	//* 740 1450:ifne            1467
	//* 741 1453:aload_0         
	//* 742 1454:getfield        #294 <Field int s>
	//* 743 1457:ifne            1467
				v.wait();
	//  744 1460:aload_0         
	//  745 1461:getfield        #137 <Field Object v>
	//  746 1464:invokevirtual   #527 <Method void Object.wait()>
		}
	//  747 1467:aload           6
	//  748 1469:monitorexit     
		continue; /* Loop/switch isn't completed */
	//  749 1470:goto            944
		exception;
	//  750 1473:astore          7
		obj3;
	//  751 1475:aload           6
		JVM INSTR monitorexit ;
	//  752 1477:monitorexit     
		throw exception;
	//  753 1478:aload           7
	//  754 1480:athrow          
_L4:
		b.b();
	//  755 1481:aload_0         
	//  756 1482:getfield        #121 <Field acy b>
	//  757 1485:invokevirtual   #529 <Method void acy.b()>
		o.setOnFrameAvailableListener(((android.graphics.SurfaceTexture.OnFrameAvailableListener) (null)));
	//  758 1488:aload_0         
	//  759 1489:getfield        #290 <Field SurfaceTexture o>
	//  760 1492:aconst_null     
	//  761 1493:invokevirtual   #474 <Method void SurfaceTexture.setOnFrameAvailableListener(android.graphics.SurfaceTexture$OnFrameAvailableListener)>
		o = null;
	//  762 1496:aload_0         
	//  763 1497:aconst_null     
	//  764 1498:putfield        #290 <Field SurfaceTexture o>
		d();
	//  765 1501:aload_0         
	//  766 1502:invokespecial   #531 <Method boolean d()>
	//  767 1505:pop             
		return;
	//  768 1506:return          
		Object obj4;
		obj4;
	//  769 1507:astore          6
		  goto _L5
	//* 770 1509:goto            1591
		obj4;
	//  771 1512:astore          6
		wx.b("SphericalVideoProcessor died.", ((Throwable) (obj4)));
	//  772 1514:ldc2            #533 <String "SphericalVideoProcessor died.">
	//  773 1517:aload           6
	//  774 1519:invokestatic    #536 <Method void wx.b(String, Throwable)>
		aw.i().a(((Throwable) (obj4)), "SphericalVideoProcessor.run.2");
	//  775 1522:invokestatic    #541 <Method wi aw.i()>
	//  776 1525:aload           6
	//  777 1527:ldc2            #543 <String "SphericalVideoProcessor.run.2">
	//  778 1530:invokevirtual   #548 <Method void wi.a(Throwable, String)>
		b.b();
	//  779 1533:aload_0         
	//  780 1534:getfield        #121 <Field acy b>
	//  781 1537:invokevirtual   #529 <Method void acy.b()>
		o.setOnFrameAvailableListener(((android.graphics.SurfaceTexture.OnFrameAvailableListener) (null)));
	//  782 1540:aload_0         
	//  783 1541:getfield        #290 <Field SurfaceTexture o>
	//  784 1544:aconst_null     
	//  785 1545:invokevirtual   #474 <Method void SurfaceTexture.setOnFrameAvailableListener(android.graphics.SurfaceTexture$OnFrameAvailableListener)>
		o = null;
	//  786 1548:aload_0         
	//  787 1549:aconst_null     
	//  788 1550:putfield        #290 <Field SurfaceTexture o>
		d();
	//  789 1553:aload_0         
	//  790 1554:invokespecial   #531 <Method boolean d()>
	//  791 1557:pop             
		return;
	//  792 1558:return          
_L7:
		wx.e("SphericalVideoProcessor halted unexpectedly.");
	//  793 1559:ldc2            #550 <String "SphericalVideoProcessor halted unexpectedly.">
	//  794 1562:invokestatic    #552 <Method void wx.e(String)>
		b.b();
	//  795 1565:aload_0         
	//  796 1566:getfield        #121 <Field acy b>
	//  797 1569:invokevirtual   #529 <Method void acy.b()>
		o.setOnFrameAvailableListener(((android.graphics.SurfaceTexture.OnFrameAvailableListener) (null)));
	//  798 1572:aload_0         
	//  799 1573:getfield        #290 <Field SurfaceTexture o>
	//  800 1576:aconst_null     
	//  801 1577:invokevirtual   #474 <Method void SurfaceTexture.setOnFrameAvailableListener(android.graphics.SurfaceTexture$OnFrameAvailableListener)>
		o = null;
	//  802 1580:aload_0         
	//  803 1581:aconst_null     
	//  804 1582:putfield        #290 <Field SurfaceTexture o>
		d();
	//  805 1585:aload_0         
	//  806 1586:invokespecial   #531 <Method boolean d()>
	//  807 1589:pop             
		return;
	//  808 1590:return          
_L5:
		b.b();
	//  809 1591:aload_0         
	//  810 1592:getfield        #121 <Field acy b>
	//  811 1595:invokevirtual   #529 <Method void acy.b()>
		o.setOnFrameAvailableListener(((android.graphics.SurfaceTexture.OnFrameAvailableListener) (null)));
	//  812 1598:aload_0         
	//  813 1599:getfield        #290 <Field SurfaceTexture o>
	//  814 1602:aconst_null     
	//  815 1603:invokevirtual   #474 <Method void SurfaceTexture.setOnFrameAvailableListener(android.graphics.SurfaceTexture$OnFrameAvailableListener)>
		o = null;
	//  816 1606:aload_0         
	//  817 1607:aconst_null     
	//  818 1608:putfield        #290 <Field SurfaceTexture o>
		d();
	//  819 1611:aload_0         
	//  820 1612:invokespecial   #531 <Method boolean d()>
	//  821 1615:pop             
		throw obj4;
	//  822 1616:aload           6
	//  823 1618:athrow          
_L1:
		String s1 = String.valueOf(((Object) (GLUtils.getEGLErrorString(w.eglGetError()))));
	//  824 1619:aload_0         
	//  825 1620:getfield        #236 <Field EGL10 w>
	//  826 1623:invokeinterface #555 <Method int EGL10.eglGetError()>
	//  827 1628:invokestatic    #560 <Method String GLUtils.getEGLErrorString(int)>
	//  828 1631:invokestatic    #210 <Method String String.valueOf(Object)>
	//  829 1634:astore          6
		if(s1.length() != 0)
	//* 830 1636:aload           6
	//* 831 1638:invokevirtual   #213 <Method int String.length()>
	//* 832 1641:ifeq            1657
			s1 = "EGL initialization failed: ".concat(s1);
	//  833 1644:ldc2            #562 <String "EGL initialization failed: ">
	//  834 1647:aload           6
	//  835 1649:invokevirtual   #566 <Method String String.concat(String)>
	//  836 1652:astore          6
		else
	//* 837 1654:goto            1669
			s1 = new String("EGL initialization failed: ");
	//  838 1657:new             #206 <Class String>
	//  839 1660:dup             
	//  840 1661:ldc2            #562 <String "EGL initialization failed: ">
	//  841 1664:invokespecial   #567 <Method void String(String)>
	//  842 1667:astore          6
		wx.c(s1);
	//  843 1669:aload           6
	//  844 1671:invokestatic    #305 <Method void wx.c(String)>
		aw.i().a(new Throwable(s1), "SphericalVideoProcessor.run.1");
	//  845 1674:invokestatic    #541 <Method wi aw.i()>
	//  846 1677:new             #299 <Class Throwable>
	//  847 1680:dup             
	//  848 1681:aload           6
	//  849 1683:invokespecial   #568 <Method void Throwable(String)>
	//  850 1686:ldc2            #570 <String "SphericalVideoProcessor.run.1">
	//  851 1689:invokevirtual   #548 <Method void wi.a(Throwable, String)>
		d();
	//  852 1692:aload_0         
	//  853 1693:invokespecial   #531 <Method boolean d()>
	//  854 1696:pop             
		u.countDown();
	//  855 1697:aload_0         
	//  856 1698:getfield        #131 <Field CountDownLatch u>
	//  857 1701:invokevirtual   #308 <Method void CountDownLatch.countDown()>
		return;
	//  858 1704:return          
		s1;
	//  859 1705:astore          6
		if(true) goto _L7; else goto _L6
	//  860 1707:goto            1559
_L6:
		s1;
	//  861 1710:astore          6
		if(true) goto _L9; else goto _L8
	//  862 1712:goto            944
_L8:
	}

	private static final float a[] = {
		-1F, -1F, -1F, 1.0F, -1F, -1F, -1F, 1.0F, -1F, 1.0F, 
		1.0F, -1F
	};
	private volatile boolean A;
	private volatile boolean B;
	private final acy b;
	private final float c[] = new float[9];
	private final float d[] = new float[9];
	private final float e[] = new float[9];
	private final float f[] = new float[9];
	private final float g[] = new float[9];
	private final float h[] = new float[9];
	private final float i[] = new float[9];
	private float j;
	private float k;
	private float l;
	private int m;
	private int n;
	private SurfaceTexture o;
	private SurfaceTexture p;
	private int q;
	private int r;
	private int s;
	private FloatBuffer t;
	private final CountDownLatch u = new CountDownLatch(1);
	private final Object v = new Object();
	private EGL10 w;
	private EGLDisplay x;
	private EGLContext y;
	private EGLSurface z;

	static 
	{
	//    0    0:bipush          12
	//    1    2:newarray        float[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #56  <Float -1F>
	//    5    8:fastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #56  <Float -1F>
	//    9   13:fastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #56  <Float -1F>
	//   13   18:fastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:fconst_1        
	//   17   22:fastore         
	//   18   23:dup             
	//   19   24:iconst_4        
	//   20   25:ldc1            #56  <Float -1F>
	//   21   27:fastore         
	//   22   28:dup             
	//   23   29:iconst_5        
	//   24   30:ldc1            #56  <Float -1F>
	//   25   32:fastore         
	//   26   33:dup             
	//   27   34:bipush          6
	//   28   36:ldc1            #56  <Float -1F>
	//   29   38:fastore         
	//   30   39:dup             
	//   31   40:bipush          7
	//   32   42:fconst_1        
	//   33   43:fastore         
	//   34   44:dup             
	//   35   45:bipush          8
	//   36   47:ldc1            #56  <Float -1F>
	//   37   49:fastore         
	//   38   50:dup             
	//   39   51:bipush          9
	//   40   53:fconst_1        
	//   41   54:fastore         
	//   42   55:dup             
	//   43   56:bipush          10
	//   44   58:fconst_1        
	//   45   59:fastore         
	//   46   60:dup             
	//   47   61:bipush          11
	//   48   63:ldc1            #56  <Float -1F>
	//   49   65:fastore         
	//   50   66:putstatic       #58  <Field float[] a>
	//*  51   69:return          
	}
}
