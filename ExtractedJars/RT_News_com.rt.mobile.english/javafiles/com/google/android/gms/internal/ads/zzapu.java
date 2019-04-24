// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.zzbv;
import java.nio.*;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzapt, zzapr, zzakb, zznk, 
//			zzkb, zzni, zzna, zzajm

public final class zzapu extends Thread
	implements android.graphics.SurfaceTexture.OnFrameAvailableListener, zzapt
{

	public zzapu(Context context)
	{
		super("SphericalVideoProcessor");
	//    0    0:aload_0         
	//    1    1:ldc1            #63  <String "SphericalVideoProcessor">
	//    2    3:invokespecial   #66  <Method void Thread(String)>
		zzczl = ByteBuffer.allocateDirect(zzcyv.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
	//    3    6:aload_0         
	//    4    7:getstatic       #58  <Field float[] zzcyv>
	//    5   10:arraylength     
	//    6   11:iconst_2        
	//    7   12:ishl            
	//    8   13:invokestatic    #72  <Method ByteBuffer ByteBuffer.allocateDirect(int)>
	//    9   16:invokestatic    #78  <Method ByteOrder ByteOrder.nativeOrder()>
	//   10   19:invokevirtual   #82  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   11   22:invokevirtual   #86  <Method FloatBuffer ByteBuffer.asFloatBuffer()>
	//   12   25:putfield        #88  <Field FloatBuffer zzczl>
		zzczl.put(zzcyv).position(0);
	//   13   28:aload_0         
	//   14   29:getfield        #88  <Field FloatBuffer zzczl>
	//   15   32:getstatic       #58  <Field float[] zzcyv>
	//   16   35:invokevirtual   #94  <Method FloatBuffer FloatBuffer.put(float[])>
	//   17   38:iconst_0        
	//   18   39:invokevirtual   #98  <Method java.nio.Buffer FloatBuffer.position(int)>
	//   19   42:pop             
	//   20   43:aload_0         
	//   21   44:bipush          9
	//   22   46:newarray        float[]
	//   23   48:putfield        #100 <Field float[] zzcys>
	//   24   51:aload_0         
	//   25   52:bipush          9
	//   26   54:newarray        float[]
	//   27   56:putfield        #102 <Field float[] zzcyx>
	//   28   59:aload_0         
	//   29   60:bipush          9
	//   30   62:newarray        float[]
	//   31   64:putfield        #104 <Field float[] zzcyy>
	//   32   67:aload_0         
	//   33   68:bipush          9
	//   34   70:newarray        float[]
	//   35   72:putfield        #106 <Field float[] zzcyz>
	//   36   75:aload_0         
	//   37   76:bipush          9
	//   38   78:newarray        float[]
	//   39   80:putfield        #108 <Field float[] zzcza>
	//   40   83:aload_0         
	//   41   84:bipush          9
	//   42   86:newarray        float[]
	//   43   88:putfield        #110 <Field float[] zzczb>
	//   44   91:aload_0         
	//   45   92:bipush          9
	//   46   94:newarray        float[]
	//   47   96:putfield        #112 <Field float[] zzczc>
		zzczd = (0.0F / 0.0F);
	//   48   99:aload_0         
	//   49  100:ldc1            #113 <Float (0.0F / 0.0F)>
	//   50  102:putfield        #115 <Field float zzczd>
		zzcyw = new zzapr(context);
	//   51  105:aload_0         
	//   52  106:new             #117 <Class zzapr>
	//   53  109:dup             
	//   54  110:aload_1         
	//   55  111:invokespecial   #119 <Method void zzapr(Context)>
	//   56  114:putfield        #121 <Field zzapr zzcyw>
		zzcyw.zza(((zzapt) (this)));
	//   57  117:aload_0         
	//   58  118:getfield        #121 <Field zzapr zzcyw>
	//   59  121:aload_0         
	//   60  122:invokevirtual   #125 <Method void zzapr.zza(zzapt)>
	//   61  125:aload_0         
	//   62  126:new             #127 <Class CountDownLatch>
	//   63  129:dup             
	//   64  130:iconst_1        
	//   65  131:invokespecial   #130 <Method void CountDownLatch(int)>
	//   66  134:putfield        #132 <Field CountDownLatch zzczm>
	//   67  137:aload_0         
	//   68  138:new             #134 <Class Object>
	//   69  141:dup             
	//   70  142:invokespecial   #136 <Method void Object()>
	//   71  145:putfield        #138 <Field Object zzczn>
	//   72  148:return          
	}

	private static void zza(float af[], float f)
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
		double d = f;
	//   16   16:fload_1         
	//   17   17:f2d             
	//   18   18:dstore_2        
		af[4] = (float)Math.cos(d);
	//   19   19:aload_0         
	//   20   20:iconst_4        
	//   21   21:dload_2         
	//   22   22:invokestatic    #145 <Method double Math.cos(double)>
	//   23   25:d2f             
	//   24   26:fastore         
		af[5] = (float)(-Math.sin(d));
	//   25   27:aload_0         
	//   26   28:iconst_5        
	//   27   29:dload_2         
	//   28   30:invokestatic    #148 <Method double Math.sin(double)>
	//   29   33:dneg            
	//   30   34:d2f             
	//   31   35:fastore         
		af[6] = 0.0F;
	//   32   36:aload_0         
	//   33   37:bipush          6
	//   34   39:fconst_0        
	//   35   40:fastore         
		af[7] = (float)Math.sin(d);
	//   36   41:aload_0         
	//   37   42:bipush          7
	//   38   44:dload_2         
	//   39   45:invokestatic    #148 <Method double Math.sin(double)>
	//   40   48:d2f             
	//   41   49:fastore         
		af[8] = (float)Math.cos(d);
	//   42   50:aload_0         
	//   43   51:bipush          8
	//   44   53:dload_2         
	//   45   54:invokestatic    #145 <Method double Math.cos(double)>
	//   46   57:d2f             
	//   47   58:fastore         
	//   48   59:return          
	}

	private static void zza(float af[], float af1[], float af2[])
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

	private static void zzb(float af[], float f)
	{
		double d = f;
	//    0    0:fload_1         
	//    1    1:f2d             
	//    2    2:dstore_2        
		af[0] = (float)Math.cos(d);
	//    3    3:aload_0         
	//    4    4:iconst_0        
	//    5    5:dload_2         
	//    6    6:invokestatic    #145 <Method double Math.cos(double)>
	//    7    9:d2f             
	//    8   10:fastore         
		af[1] = (float)(-Math.sin(d));
	//    9   11:aload_0         
	//   10   12:iconst_1        
	//   11   13:dload_2         
	//   12   14:invokestatic    #148 <Method double Math.sin(double)>
	//   13   17:dneg            
	//   14   18:d2f             
	//   15   19:fastore         
		af[2] = 0.0F;
	//   16   20:aload_0         
	//   17   21:iconst_2        
	//   18   22:fconst_0        
	//   19   23:fastore         
		af[3] = (float)Math.sin(d);
	//   20   24:aload_0         
	//   21   25:iconst_3        
	//   22   26:dload_2         
	//   23   27:invokestatic    #148 <Method double Math.sin(double)>
	//   24   30:d2f             
	//   25   31:fastore         
		af[4] = (float)Math.cos(d);
	//   26   32:aload_0         
	//   27   33:iconst_4        
	//   28   34:dload_2         
	//   29   35:invokestatic    #145 <Method double Math.cos(double)>
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

	private static int zzd(int i, String s)
	{
		int k = GLES20.glCreateShader(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #158 <Method int GLES20.glCreateShader(int)>
	//    2    4:istore_3        
		zzdo("createShader");
	//    3    5:ldc1            #160 <String "createShader">
	//    4    7:invokestatic    #163 <Method void zzdo(String)>
		int j = k;
	//    5   10:iload_3         
	//    6   11:istore_2        
		if(k != 0)
	//*   7   12:iload_3         
	//*   8   13:ifeq            121
		{
			GLES20.glShaderSource(k, s);
	//    9   16:iload_3         
	//   10   17:aload_1         
	//   11   18:invokestatic    #167 <Method void GLES20.glShaderSource(int, String)>
			zzdo("shaderSource");
	//   12   21:ldc1            #169 <String "shaderSource">
	//   13   23:invokestatic    #163 <Method void zzdo(String)>
			GLES20.glCompileShader(k);
	//   14   26:iload_3         
	//   15   27:invokestatic    #172 <Method void GLES20.glCompileShader(int)>
			zzdo("compileShader");
	//   16   30:ldc1            #174 <String "compileShader">
	//   17   32:invokestatic    #163 <Method void zzdo(String)>
			s = ((String) (new int[1]));
	//   18   35:iconst_1        
	//   19   36:newarray        int[]
	//   20   38:astore_1        
			GLES20.glGetShaderiv(k, 35713, ((int []) (s)), 0);
	//   21   39:iload_3         
	//   22   40:ldc1            #175 <Int 35713>
	//   23   42:aload_1         
	//   24   43:iconst_0        
	//   25   44:invokestatic    #179 <Method void GLES20.glGetShaderiv(int, int, int[], int)>
			zzdo("getShaderiv");
	//   26   47:ldc1            #181 <String "getShaderiv">
	//   27   49:invokestatic    #163 <Method void zzdo(String)>
			j = k;
	//   28   52:iload_3         
	//   29   53:istore_2        
			if(s[0] == 0)
	//*  30   54:aload_1         
	//*  31   55:iconst_0        
	//*  32   56:iaload          
	//*  33   57:ifne            121
			{
				s = ((String) (new StringBuilder(37)));
	//   34   60:new             #183 <Class StringBuilder>
	//   35   63:dup             
	//   36   64:bipush          37
	//   37   66:invokespecial   #184 <Method void StringBuilder(int)>
	//   38   69:astore_1        
				((StringBuilder) (s)).append("Could not compile shader ");
	//   39   70:aload_1         
	//   40   71:ldc1            #186 <String "Could not compile shader ">
	//   41   73:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   42   76:pop             
				((StringBuilder) (s)).append(i);
	//   43   77:aload_1         
	//   44   78:iload_0         
	//   45   79:invokevirtual   #193 <Method StringBuilder StringBuilder.append(int)>
	//   46   82:pop             
				((StringBuilder) (s)).append(":");
	//   47   83:aload_1         
	//   48   84:ldc1            #195 <String ":">
	//   49   86:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   50   89:pop             
				Log.e("SphericalVideoRenderer", ((StringBuilder) (s)).toString());
	//   51   90:ldc1            #197 <String "SphericalVideoRenderer">
	//   52   92:aload_1         
	//   53   93:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   54   96:invokestatic    #207 <Method int Log.e(String, String)>
	//   55   99:pop             
				Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(k));
	//   56  100:ldc1            #197 <String "SphericalVideoRenderer">
	//   57  102:iload_3         
	//   58  103:invokestatic    #211 <Method String GLES20.glGetShaderInfoLog(int)>
	//   59  106:invokestatic    #207 <Method int Log.e(String, String)>
	//   60  109:pop             
				GLES20.glDeleteShader(k);
	//   61  110:iload_3         
	//   62  111:invokestatic    #214 <Method void GLES20.glDeleteShader(int)>
				zzdo("deleteShader");
	//   63  114:ldc1            #216 <String "deleteShader">
	//   64  116:invokestatic    #163 <Method void zzdo(String)>
				j = 0;
	//   65  119:iconst_0        
	//   66  120:istore_2        
			}
		}
		return j;
	//   67  121:iload_2         
	//   68  122:ireturn         
	}

	private static void zzdo(String s)
	{
		int i = GLES20.glGetError();
	//    0    0:invokestatic    #220 <Method int GLES20.glGetError()>
	//    1    3:istore_1        
		if(i != 0)
	//*   2    4:iload_1         
	//*   3    5:ifeq            55
		{
			StringBuilder stringbuilder = new StringBuilder(21 + String.valueOf(((Object) (s))).length());
	//    4    8:new             #183 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:bipush          21
	//    7   14:aload_0         
	//    8   15:invokestatic    #226 <Method String String.valueOf(Object)>
	//    9   18:invokevirtual   #229 <Method int String.length()>
	//   10   21:iadd            
	//   11   22:invokespecial   #184 <Method void StringBuilder(int)>
	//   12   25:astore_2        
			stringbuilder.append(s);
	//   13   26:aload_2         
	//   14   27:aload_0         
	//   15   28:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			stringbuilder.append(": glError ");
	//   17   32:aload_2         
	//   18   33:ldc1            #231 <String ": glError ">
	//   19   35:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			stringbuilder.append(i);
	//   21   39:aload_2         
	//   22   40:iload_1         
	//   23   41:invokevirtual   #193 <Method StringBuilder StringBuilder.append(int)>
	//   24   44:pop             
			Log.e("SphericalVideoRenderer", stringbuilder.toString());
	//   25   45:ldc1            #197 <String "SphericalVideoRenderer">
	//   26   47:aload_2         
	//   27   48:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   28   51:invokestatic    #207 <Method int Log.e(String, String)>
	//   29   54:pop             
		}
	//   30   55:return          
	}

	private final boolean zztk()
	{
		EGLSurface eglsurface = zzczr;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field EGLSurface zzczr>
	//    2    4:astore_3        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		boolean flag = flag1;
	//    5    7:iload_2         
	//    6    8:istore_1        
		if(eglsurface != null)
	//*   7    9:aload_3         
	//*   8   10:ifnull          75
		{
			flag = flag1;
	//    9   13:iload_2         
	//   10   14:istore_1        
			if(zzczr != EGL10.EGL_NO_SURFACE)
	//*  11   15:aload_0         
	//*  12   16:getfield        #236 <Field EGLSurface zzczr>
	//*  13   19:getstatic       #241 <Field EGLSurface EGL10.EGL_NO_SURFACE>
	//*  14   22:if_acmpeq       75
			{
				flag = zzczo.eglMakeCurrent(zzczp, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
	//   15   25:aload_0         
	//   16   26:getfield        #243 <Field EGL10 zzczo>
	//   17   29:aload_0         
	//   18   30:getfield        #245 <Field EGLDisplay zzczp>
	//   19   33:getstatic       #241 <Field EGLSurface EGL10.EGL_NO_SURFACE>
	//   20   36:getstatic       #241 <Field EGLSurface EGL10.EGL_NO_SURFACE>
	//   21   39:getstatic       #248 <Field EGLContext EGL10.EGL_NO_CONTEXT>
	//   22   42:invokeinterface #252 <Method boolean EGL10.eglMakeCurrent(EGLDisplay, EGLSurface, EGLSurface, EGLContext)>
	//   23   47:istore_1        
				flag = zzczo.eglDestroySurface(zzczp, zzczr) | (flag | false);
	//   24   48:aload_0         
	//   25   49:getfield        #243 <Field EGL10 zzczo>
	//   26   52:aload_0         
	//   27   53:getfield        #245 <Field EGLDisplay zzczp>
	//   28   56:aload_0         
	//   29   57:getfield        #236 <Field EGLSurface zzczr>
	//   30   60:invokeinterface #256 <Method boolean EGL10.eglDestroySurface(EGLDisplay, EGLSurface)>
	//   31   65:iload_1         
	//   32   66:iconst_0        
	//   33   67:ior             
	//   34   68:ior             
	//   35   69:istore_1        
				zzczr = null;
	//   36   70:aload_0         
	//   37   71:aconst_null     
	//   38   72:putfield        #236 <Field EGLSurface zzczr>
			}
		}
		flag1 = flag;
	//   39   75:iload_1         
	//   40   76:istore_2        
		if(zzczq != null)
	//*  41   77:aload_0         
	//*  42   78:getfield        #258 <Field EGLContext zzczq>
	//*  43   81:ifnull          109
		{
			flag1 = flag | zzczo.eglDestroyContext(zzczp, zzczq);
	//   44   84:iload_1         
	//   45   85:aload_0         
	//   46   86:getfield        #243 <Field EGL10 zzczo>
	//   47   89:aload_0         
	//   48   90:getfield        #245 <Field EGLDisplay zzczp>
	//   49   93:aload_0         
	//   50   94:getfield        #258 <Field EGLContext zzczq>
	//   51   97:invokeinterface #262 <Method boolean EGL10.eglDestroyContext(EGLDisplay, EGLContext)>
	//   52  102:ior             
	//   53  103:istore_2        
			zzczq = null;
	//   54  104:aload_0         
	//   55  105:aconst_null     
	//   56  106:putfield        #258 <Field EGLContext zzczq>
		}
		flag = flag1;
	//   57  109:iload_2         
	//   58  110:istore_1        
		if(zzczp != null)
	//*  59  111:aload_0         
	//*  60  112:getfield        #245 <Field EGLDisplay zzczp>
	//*  61  115:ifnull          139
		{
			flag = flag1 | zzczo.eglTerminate(zzczp);
	//   62  118:iload_2         
	//   63  119:aload_0         
	//   64  120:getfield        #243 <Field EGL10 zzczo>
	//   65  123:aload_0         
	//   66  124:getfield        #245 <Field EGLDisplay zzczp>
	//   67  127:invokeinterface #266 <Method boolean EGL10.eglTerminate(EGLDisplay)>
	//   68  132:ior             
	//   69  133:istore_1        
			zzczp = null;
	//   70  134:aload_0         
	//   71  135:aconst_null     
	//   72  136:putfield        #245 <Field EGLDisplay zzczp>
		}
		return flag;
	//   73  139:iload_1         
	//   74  140:ireturn         
	}

	public final void onFrameAvailable(SurfaceTexture surfacetexture)
	{
		zzczk = zzczk + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #271 <Field int zzczk>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #271 <Field int zzczk>
		synchronized(zzczn)
	//*   6   10:aload_0         
	//*   7   11:getfield        #138 <Field Object zzczn>
	//*   8   14:astore_1        
	//*   9   15:aload_1         
	//*  10   16:monitorenter    
		{
			zzczn.notifyAll();
	//   11   17:aload_0         
	//   12   18:getfield        #138 <Field Object zzczn>
	//   13   21:invokevirtual   #274 <Method void Object.notifyAll()>
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
		if(zzczh == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #283 <Field SurfaceTexture zzczh>
	//*   2    4:ifnonnull       21
		{
			zzakb.e("SphericalVideoProcessor started with no output texture.");
	//    3    7:ldc2            #285 <String "SphericalVideoProcessor started with no output texture.">
	//    4   10:invokestatic    #289 <Method void zzakb.e(String)>
			zzczm.countDown();
	//    5   13:aload_0         
	//    6   14:getfield        #132 <Field CountDownLatch zzczm>
	//    7   17:invokevirtual   #292 <Method void CountDownLatch.countDown()>
			return;
	//    8   20:return          
		}
		zzczo = (EGL10)EGLContext.getEGL();
	//    9   21:aload_0         
	//   10   22:invokestatic    #298 <Method javax.microedition.khronos.egl.EGL EGLContext.getEGL()>
	//   11   25:checkcast       #238 <Class EGL10>
	//   12   28:putfield        #243 <Field EGL10 zzczo>
		zzczp = zzczo.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
	//   13   31:aload_0         
	//   14   32:aload_0         
	//   15   33:getfield        #243 <Field EGL10 zzczo>
	//   16   36:getstatic       #301 <Field Object EGL10.EGL_DEFAULT_DISPLAY>
	//   17   39:invokeinterface #305 <Method EGLDisplay EGL10.eglGetDisplay(Object)>
	//   18   44:putfield        #245 <Field EGLDisplay zzczp>
		if(zzczp != EGL10.EGL_NO_DISPLAY) goto _L2; else goto _L1
	//   19   47:aload_0         
	//   20   48:getfield        #245 <Field EGLDisplay zzczp>
	//   21   51:getstatic       #308 <Field EGLDisplay EGL10.EGL_NO_DISPLAY>
	//   22   54:if_acmpne       62
_L1:
		int i;
		float af[];
		i = 0;
	//   23   57:iconst_0        
	//   24   58:istore_1        
		break; /* Loop/switch isn't completed */
	//   25   59:goto            354
	//*  26   62:iconst_2        
	//*  27   63:newarray        int[]
	//*  28   65:astore          6
_L2:
		if(!zzczo.eglInitialize(zzczp, ((int []) (af = ((float []) (new int[2]))))))
	//*  29   67:aload_0         
	//*  30   68:getfield        #243 <Field EGL10 zzczo>
	//*  31   71:aload_0         
	//*  32   72:getfield        #245 <Field EGLDisplay zzczp>
	//*  33   75:aload           6
	//*  34   77:invokeinterface #312 <Method boolean EGL10.eglInitialize(EGLDisplay, int[])>
	//*  35   82:ifne            88
			continue; /* Loop/switch isn't completed */
	//   36   85:goto            57
		af = ((float []) (new int[1]));
	//   37   88:iconst_1        
	//   38   89:newarray        int[]
	//   39   91:astore          6
		EGLConfig aeglconfig[] = new EGLConfig[1];
	//   40   93:iconst_1        
	//   41   94:anewarray       EGLConfig[]
	//   42   97:astore          7
		EGLConfig eglconfig;
		if(zzczo.eglChooseConfig(zzczp, new int[] {
	12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 
	12344
}, aeglconfig, 1, ((int []) (af))) && af[0] > 0)
	//*  43   99:aload_0         
	//*  44  100:getfield        #243 <Field EGL10 zzczo>
	//*  45  103:aload_0         
	//*  46  104:getfield        #245 <Field EGLDisplay zzczp>
	//*  47  107:bipush          11
	//*  48  109:newarray        int[]
	//*  49  111:dup             
	//*  50  112:iconst_0        
	//*  51  113:sipush          12352
	//*  52  116:iastore         
	//*  53  117:dup             
	//*  54  118:iconst_1        
	//*  55  119:iconst_4        
	//*  56  120:iastore         
	//*  57  121:dup             
	//*  58  122:iconst_2        
	//*  59  123:sipush          12324
	//*  60  126:iastore         
	//*  61  127:dup             
	//*  62  128:iconst_3        
	//*  63  129:bipush          8
	//*  64  131:iastore         
	//*  65  132:dup             
	//*  66  133:iconst_4        
	//*  67  134:sipush          12323
	//*  68  137:iastore         
	//*  69  138:dup             
	//*  70  139:iconst_5        
	//*  71  140:bipush          8
	//*  72  142:iastore         
	//*  73  143:dup             
	//*  74  144:bipush          6
	//*  75  146:sipush          12322
	//*  76  149:iastore         
	//*  77  150:dup             
	//*  78  151:bipush          7
	//*  79  153:bipush          8
	//*  80  155:iastore         
	//*  81  156:dup             
	//*  82  157:bipush          8
	//*  83  159:sipush          12325
	//*  84  162:iastore         
	//*  85  163:dup             
	//*  86  164:bipush          9
	//*  87  166:bipush          16
	//*  88  168:iastore         
	//*  89  169:dup             
	//*  90  170:bipush          10
	//*  91  172:sipush          12344
	//*  92  175:iastore         
	//*  93  176:aload           7
	//*  94  178:iconst_1        
	//*  95  179:aload           6
	//*  96  181:invokeinterface #318 <Method boolean EGL10.eglChooseConfig(EGLDisplay, int[], EGLConfig[], int, int[])>
	//*  97  186:ifeq            205
	//*  98  189:aload           6
	//*  99  191:iconst_0        
	//* 100  192:iaload          
	//* 101  193:ifle            205
			eglconfig = aeglconfig[0];
	//  102  196:aload           7
	//  103  198:iconst_0        
	//  104  199:aaload          
	//  105  200:astore          6
		else
	//* 106  202:goto            208
			eglconfig = null;
	//  107  205:aconst_null     
	//  108  206:astore          6
		if(eglconfig == null)
	//* 109  208:aload           6
	//* 110  210:ifnonnull       216
			continue; /* Loop/switch isn't completed */
	//  111  213:goto            57
		zzczq = zzczo.eglCreateContext(zzczp, eglconfig, EGL10.EGL_NO_CONTEXT, new int[] {
			12440, 2, 12344
		});
	//  112  216:aload_0         
	//  113  217:aload_0         
	//  114  218:getfield        #243 <Field EGL10 zzczo>
	//  115  221:aload_0         
	//  116  222:getfield        #245 <Field EGLDisplay zzczp>
	//  117  225:aload           6
	//  118  227:getstatic       #248 <Field EGLContext EGL10.EGL_NO_CONTEXT>
	//  119  230:iconst_3        
	//  120  231:newarray        int[]
	//  121  233:dup             
	//  122  234:iconst_0        
	//  123  235:sipush          12440
	//  124  238:iastore         
	//  125  239:dup             
	//  126  240:iconst_1        
	//  127  241:iconst_2        
	//  128  242:iastore         
	//  129  243:dup             
	//  130  244:iconst_2        
	//  131  245:sipush          12344
	//  132  248:iastore         
	//  133  249:invokeinterface #322 <Method EGLContext EGL10.eglCreateContext(EGLDisplay, EGLConfig, EGLContext, int[])>
	//  134  254:putfield        #258 <Field EGLContext zzczq>
		if(zzczq == null || zzczq == EGL10.EGL_NO_CONTEXT)
	//* 135  257:aload_0         
	//* 136  258:getfield        #258 <Field EGLContext zzczq>
	//* 137  261:ifnull          57
	//* 138  264:aload_0         
	//* 139  265:getfield        #258 <Field EGLContext zzczq>
	//* 140  268:getstatic       #248 <Field EGLContext EGL10.EGL_NO_CONTEXT>
	//* 141  271:if_acmpne       277
			continue; /* Loop/switch isn't completed */
	//  142  274:goto            57
		zzczr = zzczo.eglCreateWindowSurface(zzczp, eglconfig, ((Object) (zzczh)), ((int []) (null)));
	//  143  277:aload_0         
	//  144  278:aload_0         
	//  145  279:getfield        #243 <Field EGL10 zzczo>
	//  146  282:aload_0         
	//  147  283:getfield        #245 <Field EGLDisplay zzczp>
	//  148  286:aload           6
	//  149  288:aload_0         
	//  150  289:getfield        #283 <Field SurfaceTexture zzczh>
	//  151  292:aconst_null     
	//  152  293:invokeinterface #326 <Method EGLSurface EGL10.eglCreateWindowSurface(EGLDisplay, EGLConfig, Object, int[])>
	//  153  298:putfield        #236 <Field EGLSurface zzczr>
		if(zzczr == null || zzczr == EGL10.EGL_NO_SURFACE || !zzczo.eglMakeCurrent(zzczp, zzczr, zzczr, zzczq))
	//* 154  301:aload_0         
	//* 155  302:getfield        #236 <Field EGLSurface zzczr>
	//* 156  305:ifnull          57
	//* 157  308:aload_0         
	//* 158  309:getfield        #236 <Field EGLSurface zzczr>
	//* 159  312:getstatic       #241 <Field EGLSurface EGL10.EGL_NO_SURFACE>
	//* 160  315:if_acmpne       321
	//* 161  318:goto            57
	//* 162  321:aload_0         
	//* 163  322:getfield        #243 <Field EGL10 zzczo>
	//* 164  325:aload_0         
	//* 165  326:getfield        #245 <Field EGLDisplay zzczp>
	//* 166  329:aload_0         
	//* 167  330:getfield        #236 <Field EGLSurface zzczr>
	//* 168  333:aload_0         
	//* 169  334:getfield        #236 <Field EGLSurface zzczr>
	//* 170  337:aload_0         
	//* 171  338:getfield        #258 <Field EGLContext zzczq>
	//* 172  341:invokeinterface #252 <Method boolean EGL10.eglMakeCurrent(EGLDisplay, EGLSurface, EGLSurface, EGLContext)>
	//* 173  346:ifne            352
			continue; /* Loop/switch isn't completed */
	//  174  349:goto            57
		i = 1;
	//  175  352:iconst_1        
	//  176  353:istore_1        
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		int l;
		Object obj = ((Object) (zznk.zzazp));
	//  177  354:getstatic       #332 <Field zzna zznk.zzazp>
	//  178  357:astore          6
		if(!((String)zzkb.zzik().zzd(((zzna) (obj)))).equals(((zzna) (obj)).zzja()))
	//* 179  359:invokestatic    #338 <Method zzni zzkb.zzik()>
	//* 180  362:aload           6
	//* 181  364:invokevirtual   #343 <Method Object zzni.zzd(zzna)>
	//* 182  367:checkcast       #222 <Class String>
	//* 183  370:aload           6
	//* 184  372:invokevirtual   #349 <Method Object zzna.zzja()>
	//* 185  375:invokevirtual   #353 <Method boolean String.equals(Object)>
	//* 186  378:ifne            397
			obj = ((Object) ((String)zzkb.zzik().zzd(((zzna) (obj)))));
	//  187  381:invokestatic    #338 <Method zzni zzkb.zzik()>
	//  188  384:aload           6
	//  189  386:invokevirtual   #343 <Method Object zzni.zzd(zzna)>
	//  190  389:checkcast       #222 <Class String>
	//  191  392:astore          6
		else
	//* 192  394:goto            402
			obj = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}";
	//  193  397:ldc2            #355 <String "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}">
	//  194  400:astore          6
		l = zzd(35633, ((String) (obj)));
	//  195  402:ldc2            #356 <Int 35633>
	//  196  405:aload           6
	//  197  407:invokestatic    #358 <Method int zzd(int, String)>
	//  198  410:istore          4
		if(l != 0) goto _L5; else goto _L4
	//  199  412:iload           4
	//  200  414:ifne            422
_L4:
		int j;
		j = 0;
	//  201  417:iconst_0        
	//  202  418:istore_2        
		break MISSING_BLOCK_LABEL_611;
	//  203  419:goto            611
_L5:
		int k;
		Object obj1 = ((Object) (zznk.zzazq));
	//  204  422:getstatic       #361 <Field zzna zznk.zzazq>
	//  205  425:astore          6
		if(!((String)zzkb.zzik().zzd(((zzna) (obj1)))).equals(((zzna) (obj1)).zzja()))
	//* 206  427:invokestatic    #338 <Method zzni zzkb.zzik()>
	//* 207  430:aload           6
	//* 208  432:invokevirtual   #343 <Method Object zzni.zzd(zzna)>
	//* 209  435:checkcast       #222 <Class String>
	//* 210  438:aload           6
	//* 211  440:invokevirtual   #349 <Method Object zzna.zzja()>
	//* 212  443:invokevirtual   #353 <Method boolean String.equals(Object)>
	//* 213  446:ifne            465
			obj1 = ((Object) ((String)zzkb.zzik().zzd(((zzna) (obj1)))));
	//  214  449:invokestatic    #338 <Method zzni zzkb.zzik()>
	//  215  452:aload           6
	//  216  454:invokevirtual   #343 <Method Object zzni.zzd(zzna)>
	//  217  457:checkcast       #222 <Class String>
	//  218  460:astore          6
		else
	//* 219  462:goto            470
			obj1 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}";
	//  220  465:ldc2            #363 <String "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}">
	//  221  468:astore          6
		int i1 = zzd(35632, ((String) (obj1)));
	//  222  470:ldc2            #364 <Int 35632>
	//  223  473:aload           6
	//  224  475:invokestatic    #358 <Method int zzd(int, String)>
	//  225  478:istore          5
		if(i1 == 0)
	//* 226  480:iload           5
	//* 227  482:ifne            488
			continue; /* Loop/switch isn't completed */
	//  228  485:goto            417
		k = GLES20.glCreateProgram();
	//  229  488:invokestatic    #367 <Method int GLES20.glCreateProgram()>
	//  230  491:istore_3        
		zzdo("createProgram");
	//  231  492:ldc2            #369 <String "createProgram">
	//  232  495:invokestatic    #163 <Method void zzdo(String)>
		j = k;
	//  233  498:iload_3         
	//  234  499:istore_2        
		if(k == 0)
			break MISSING_BLOCK_LABEL_611;
	//  235  500:iload_3         
	//  236  501:ifeq            611
		GLES20.glAttachShader(k, l);
	//  237  504:iload_3         
	//  238  505:iload           4
	//  239  507:invokestatic    #373 <Method void GLES20.glAttachShader(int, int)>
		zzdo("attachShader");
	//  240  510:ldc2            #375 <String "attachShader">
	//  241  513:invokestatic    #163 <Method void zzdo(String)>
		GLES20.glAttachShader(k, i1);
	//  242  516:iload_3         
	//  243  517:iload           5
	//  244  519:invokestatic    #373 <Method void GLES20.glAttachShader(int, int)>
		zzdo("attachShader");
	//  245  522:ldc2            #375 <String "attachShader">
	//  246  525:invokestatic    #163 <Method void zzdo(String)>
		GLES20.glLinkProgram(k);
	//  247  528:iload_3         
	//  248  529:invokestatic    #378 <Method void GLES20.glLinkProgram(int)>
		zzdo("linkProgram");
	//  249  532:ldc2            #380 <String "linkProgram">
	//  250  535:invokestatic    #163 <Method void zzdo(String)>
		obj1 = ((Object) (new int[1]));
	//  251  538:iconst_1        
	//  252  539:newarray        int[]
	//  253  541:astore          6
		GLES20.glGetProgramiv(k, 35714, ((int []) (obj1)), 0);
	//  254  543:iload_3         
	//  255  544:ldc2            #381 <Int 35714>
	//  256  547:aload           6
	//  257  549:iconst_0        
	//  258  550:invokestatic    #384 <Method void GLES20.glGetProgramiv(int, int, int[], int)>
		zzdo("getProgramiv");
	//  259  553:ldc2            #386 <String "getProgramiv">
	//  260  556:invokestatic    #163 <Method void zzdo(String)>
		if(obj1[0] == 1)
			break; /* Loop/switch isn't completed */
	//  261  559:aload           6
	//  262  561:iconst_0        
	//  263  562:iaload          
	//  264  563:iconst_1        
	//  265  564:icmpeq          599
		Log.e("SphericalVideoRenderer", "Could not link program: ");
	//  266  567:ldc1            #197 <String "SphericalVideoRenderer">
	//  267  569:ldc2            #388 <String "Could not link program: ">
	//  268  572:invokestatic    #207 <Method int Log.e(String, String)>
	//  269  575:pop             
		Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(k));
	//  270  576:ldc1            #197 <String "SphericalVideoRenderer">
	//  271  578:iload_3         
	//  272  579:invokestatic    #391 <Method String GLES20.glGetProgramInfoLog(int)>
	//  273  582:invokestatic    #207 <Method int Log.e(String, String)>
	//  274  585:pop             
		GLES20.glDeleteProgram(k);
	//  275  586:iload_3         
	//  276  587:invokestatic    #394 <Method void GLES20.glDeleteProgram(int)>
		zzdo("deleteProgram");
	//  277  590:ldc2            #396 <String "deleteProgram">
	//  278  593:invokestatic    #163 <Method void zzdo(String)>
		if(true) goto _L4; else goto _L6
	//  279  596:goto            417
_L6:
		GLES20.glValidateProgram(k);
	//  280  599:iload_3         
	//  281  600:invokestatic    #399 <Method void GLES20.glValidateProgram(int)>
		zzdo("validateProgram");
	//  282  603:ldc2            #401 <String "validateProgram">
	//  283  606:invokestatic    #163 <Method void zzdo(String)>
		j = k;
	//  284  609:iload_3         
	//  285  610:istore_2        
		boolean flag;
		zzczi = j;
	//  286  611:aload_0         
	//  287  612:iload_2         
	//  288  613:putfield        #403 <Field int zzczi>
		GLES20.glUseProgram(zzczi);
	//  289  616:aload_0         
	//  290  617:getfield        #403 <Field int zzczi>
	//  291  620:invokestatic    #406 <Method void GLES20.glUseProgram(int)>
		zzdo("useProgram");
	//  292  623:ldc2            #408 <String "useProgram">
	//  293  626:invokestatic    #163 <Method void zzdo(String)>
		j = GLES20.glGetAttribLocation(zzczi, "aPosition");
	//  294  629:aload_0         
	//  295  630:getfield        #403 <Field int zzczi>
	//  296  633:ldc2            #410 <String "aPosition">
	//  297  636:invokestatic    #413 <Method int GLES20.glGetAttribLocation(int, String)>
	//  298  639:istore_2        
		GLES20.glVertexAttribPointer(j, 3, 5126, false, 12, ((java.nio.Buffer) (zzczl)));
	//  299  640:iload_2         
	//  300  641:iconst_3        
	//  301  642:sipush          5126
	//  302  645:iconst_0        
	//  303  646:bipush          12
	//  304  648:aload_0         
	//  305  649:getfield        #88  <Field FloatBuffer zzczl>
	//  306  652:invokestatic    #417 <Method void GLES20.glVertexAttribPointer(int, int, int, boolean, int, java.nio.Buffer)>
		zzdo("vertexAttribPointer");
	//  307  655:ldc2            #419 <String "vertexAttribPointer">
	//  308  658:invokestatic    #163 <Method void zzdo(String)>
		GLES20.glEnableVertexAttribArray(j);
	//  309  661:iload_2         
	//  310  662:invokestatic    #422 <Method void GLES20.glEnableVertexAttribArray(int)>
		zzdo("enableVertexAttribArray");
	//  311  665:ldc2            #424 <String "enableVertexAttribArray">
	//  312  668:invokestatic    #163 <Method void zzdo(String)>
		obj1 = ((Object) (new int[1]));
	//  313  671:iconst_1        
	//  314  672:newarray        int[]
	//  315  674:astore          6
		GLES20.glGenTextures(1, ((int []) (obj1)), 0);
	//  316  676:iconst_1        
	//  317  677:aload           6
	//  318  679:iconst_0        
	//  319  680:invokestatic    #428 <Method void GLES20.glGenTextures(int, int[], int)>
		zzdo("genTextures");
	//  320  683:ldc2            #430 <String "genTextures">
	//  321  686:invokestatic    #163 <Method void zzdo(String)>
		k = obj1[0];
	//  322  689:aload           6
	//  323  691:iconst_0        
	//  324  692:iaload          
	//  325  693:istore_3        
		GLES20.glBindTexture(36197, k);
	//  326  694:ldc2            #431 <Int 36197>
	//  327  697:iload_3         
	//  328  698:invokestatic    #434 <Method void GLES20.glBindTexture(int, int)>
		zzdo("bindTextures");
	//  329  701:ldc2            #436 <String "bindTextures">
	//  330  704:invokestatic    #163 <Method void zzdo(String)>
		GLES20.glTexParameteri(36197, 10240, 9729);
	//  331  707:ldc2            #431 <Int 36197>
	//  332  710:sipush          10240
	//  333  713:sipush          9729
	//  334  716:invokestatic    #440 <Method void GLES20.glTexParameteri(int, int, int)>
		zzdo("texParameteri");
	//  335  719:ldc2            #442 <String "texParameteri">
	//  336  722:invokestatic    #163 <Method void zzdo(String)>
		GLES20.glTexParameteri(36197, 10241, 9729);
	//  337  725:ldc2            #431 <Int 36197>
	//  338  728:sipush          10241
	//  339  731:sipush          9729
	//  340  734:invokestatic    #440 <Method void GLES20.glTexParameteri(int, int, int)>
		zzdo("texParameteri");
	//  341  737:ldc2            #442 <String "texParameteri">
	//  342  740:invokestatic    #163 <Method void zzdo(String)>
		GLES20.glTexParameteri(36197, 10242, 33071);
	//  343  743:ldc2            #431 <Int 36197>
	//  344  746:sipush          10242
	//  345  749:ldc2            #443 <Int 33071>
	//  346  752:invokestatic    #440 <Method void GLES20.glTexParameteri(int, int, int)>
		zzdo("texParameteri");
	//  347  755:ldc2            #442 <String "texParameteri">
	//  348  758:invokestatic    #163 <Method void zzdo(String)>
		GLES20.glTexParameteri(36197, 10243, 33071);
	//  349  761:ldc2            #431 <Int 36197>
	//  350  764:sipush          10243
	//  351  767:ldc2            #443 <Int 33071>
	//  352  770:invokestatic    #440 <Method void GLES20.glTexParameteri(int, int, int)>
		zzdo("texParameteri");
	//  353  773:ldc2            #442 <String "texParameteri">
	//  354  776:invokestatic    #163 <Method void zzdo(String)>
		zzczj = GLES20.glGetUniformLocation(zzczi, "uVMat");
	//  355  779:aload_0         
	//  356  780:aload_0         
	//  357  781:getfield        #403 <Field int zzczi>
	//  358  784:ldc2            #445 <String "uVMat">
	//  359  787:invokestatic    #448 <Method int GLES20.glGetUniformLocation(int, String)>
	//  360  790:putfield        #450 <Field int zzczj>
		GLES20.glUniformMatrix3fv(zzczj, 1, false, new float[] {
			1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F
		}, 0);
	//  361  793:aload_0         
	//  362  794:getfield        #450 <Field int zzczj>
	//  363  797:iconst_1        
	//  364  798:iconst_0        
	//  365  799:bipush          9
	//  366  801:newarray        float[]
	//  367  803:dup             
	//  368  804:iconst_0        
	//  369  805:fconst_1        
	//  370  806:fastore         
	//  371  807:dup             
	//  372  808:iconst_1        
	//  373  809:fconst_0        
	//  374  810:fastore         
	//  375  811:dup             
	//  376  812:iconst_2        
	//  377  813:fconst_0        
	//  378  814:fastore         
	//  379  815:dup             
	//  380  816:iconst_3        
	//  381  817:fconst_0        
	//  382  818:fastore         
	//  383  819:dup             
	//  384  820:iconst_4        
	//  385  821:fconst_1        
	//  386  822:fastore         
	//  387  823:dup             
	//  388  824:iconst_5        
	//  389  825:fconst_0        
	//  390  826:fastore         
	//  391  827:dup             
	//  392  828:bipush          6
	//  393  830:fconst_0        
	//  394  831:fastore         
	//  395  832:dup             
	//  396  833:bipush          7
	//  397  835:fconst_0        
	//  398  836:fastore         
	//  399  837:dup             
	//  400  838:bipush          8
	//  401  840:fconst_1        
	//  402  841:fastore         
	//  403  842:iconst_0        
	//  404  843:invokestatic    #454 <Method void GLES20.glUniformMatrix3fv(int, int, boolean, float[], int)>
		if(zzczi != 0)
	//* 405  846:aload_0         
	//* 406  847:getfield        #403 <Field int zzczi>
	//* 407  850:ifeq            858
			flag = true;
	//  408  853:iconst_1        
	//  409  854:istore_2        
		else
	//* 410  855:goto            860
			flag = false;
	//  411  858:iconst_0        
	//  412  859:istore_2        
		if(i && flag) goto _L8; else goto _L7
	//  413  860:iload_1         
	//  414  861:ifeq            1585
	//  415  864:iload_2         
	//  416  865:ifne            871
	//* 417  868:goto            1585
_L8:
		zzczg = new SurfaceTexture(k);
	//  418  871:aload_0         
	//  419  872:new             #456 <Class SurfaceTexture>
	//  420  875:dup             
	//  421  876:iload_3         
	//  422  877:invokespecial   #457 <Method void SurfaceTexture(int)>
	//  423  880:putfield        #459 <Field SurfaceTexture zzczg>
		zzczg.setOnFrameAvailableListener(((android.graphics.SurfaceTexture.OnFrameAvailableListener) (this)));
	//  424  883:aload_0         
	//  425  884:getfield        #459 <Field SurfaceTexture zzczg>
	//  426  887:aload_0         
	//  427  888:invokevirtual   #463 <Method void SurfaceTexture.setOnFrameAvailableListener(android.graphics.SurfaceTexture$OnFrameAvailableListener)>
		zzczm.countDown();
	//  428  891:aload_0         
	//  429  892:getfield        #132 <Field CountDownLatch zzczm>
	//  430  895:invokevirtual   #292 <Method void CountDownLatch.countDown()>
		zzcyw.start();
	//  431  898:aload_0         
	//  432  899:getfield        #121 <Field zzapr zzcyw>
	//  433  902:invokevirtual   #466 <Method void zzapr.start()>
		zzczs = true;
	//  434  905:aload_0         
	//  435  906:iconst_1        
	//  436  907:putfield        #468 <Field boolean zzczs>
_L15:
		if(zzczt) goto _L10; else goto _L9
	//  437  910:aload_0         
	//  438  911:getfield        #470 <Field boolean zzczt>
	//  439  914:ifne            1447
_L9:
		for(; zzczk > 0; zzczk = zzczk - 1)
	//* 440  917:aload_0         
	//* 441  918:getfield        #271 <Field int zzczk>
	//* 442  921:ifle            944
			zzczg.updateTexImage();
	//  443  924:aload_0         
	//  444  925:getfield        #459 <Field SurfaceTexture zzczg>
	//  445  928:invokevirtual   #473 <Method void SurfaceTexture.updateTexImage()>

	//  446  931:aload_0         
	//  447  932:aload_0         
	//  448  933:getfield        #271 <Field int zzczk>
	//  449  936:iconst_1        
	//  450  937:isub            
	//  451  938:putfield        #271 <Field int zzczk>
	//* 452  941:goto            917
		float af1[];
		float af2[];
		if(!zzcyw.zza(zzcys))
			break MISSING_BLOCK_LABEL_1143;
	//  453  944:aload_0         
	//  454  945:getfield        #121 <Field zzapr zzcyw>
	//  455  948:aload_0         
	//  456  949:getfield        #100 <Field float[] zzcys>
	//  457  952:invokevirtual   #476 <Method boolean zzapr.zza(float[])>
	//  458  955:ifeq            1143
		if(!Float.isNaN(zzczd))
			break MISSING_BLOCK_LABEL_1124;
	//  459  958:aload_0         
	//  460  959:getfield        #115 <Field float zzczd>
	//  461  962:invokestatic    #482 <Method boolean Float.isNaN(float)>
	//  462  965:ifeq            1124
		obj1 = ((Object) (zzcys));
	//  463  968:aload_0         
	//  464  969:getfield        #100 <Field float[] zzcys>
	//  465  972:astore          6
		af1 = new float[3];
	//  466  974:iconst_3        
	//  467  975:newarray        float[]
	//  468  977:astore          7
		af1;
	//  469  979:aload           7
	//  470  981:dup             
	//  471  982:iconst_0        
	//  472  983:fconst_0        
	//  473  984:fastore         
	//  474  985:dup             
	//  475  986:iconst_1        
	//  476  987:fconst_1        
	//  477  988:fastore         
	//  478  989:dup             
	//  479  990:iconst_2        
	//  480  991:fconst_0        
	//  481  992:fastore         
	//  482  993:pop             
		af1[0] = 0.0F;
		af1[1] = 1.0F;
		af1[2] = 0.0F;
		af2 = new float[3];
	//  483  994:iconst_3        
	//  484  995:newarray        float[]
	//  485  997:astore          8
		af2[0] = obj1[0] * af1[0] + obj1[1] * af1[1] + obj1[2] * af1[2];
	//  486  999:aload           8
	//  487 1001:iconst_0        
	//  488 1002:aload           6
	//  489 1004:iconst_0        
	//  490 1005:faload          
	//  491 1006:aload           7
	//  492 1008:iconst_0        
	//  493 1009:faload          
	//  494 1010:fmul            
	//  495 1011:aload           6
	//  496 1013:iconst_1        
	//  497 1014:faload          
	//  498 1015:aload           7
	//  499 1017:iconst_1        
	//  500 1018:faload          
	//  501 1019:fmul            
	//  502 1020:fadd            
	//  503 1021:aload           6
	//  504 1023:iconst_2        
	//  505 1024:faload          
	//  506 1025:aload           7
	//  507 1027:iconst_2        
	//  508 1028:faload          
	//  509 1029:fmul            
	//  510 1030:fadd            
	//  511 1031:fastore         
		af2[1] = obj1[3] * af1[0] + obj1[4] * af1[1] + obj1[5] * af1[2];
	//  512 1032:aload           8
	//  513 1034:iconst_1        
	//  514 1035:aload           6
	//  515 1037:iconst_3        
	//  516 1038:faload          
	//  517 1039:aload           7
	//  518 1041:iconst_0        
	//  519 1042:faload          
	//  520 1043:fmul            
	//  521 1044:aload           6
	//  522 1046:iconst_4        
	//  523 1047:faload          
	//  524 1048:aload           7
	//  525 1050:iconst_1        
	//  526 1051:faload          
	//  527 1052:fmul            
	//  528 1053:fadd            
	//  529 1054:aload           6
	//  530 1056:iconst_5        
	//  531 1057:faload          
	//  532 1058:aload           7
	//  533 1060:iconst_2        
	//  534 1061:faload          
	//  535 1062:fmul            
	//  536 1063:fadd            
	//  537 1064:fastore         
		af2[2] = obj1[6] * af1[0] + obj1[7] * af1[1] + obj1[8] * af1[2];
	//  538 1065:aload           8
	//  539 1067:iconst_2        
	//  540 1068:aload           6
	//  541 1070:bipush          6
	//  542 1072:faload          
	//  543 1073:aload           7
	//  544 1075:iconst_0        
	//  545 1076:faload          
	//  546 1077:fmul            
	//  547 1078:aload           6
	//  548 1080:bipush          7
	//  549 1082:faload          
	//  550 1083:aload           7
	//  551 1085:iconst_1        
	//  552 1086:faload          
	//  553 1087:fmul            
	//  554 1088:fadd            
	//  555 1089:aload           6
	//  556 1091:bipush          8
	//  557 1093:faload          
	//  558 1094:aload           7
	//  559 1096:iconst_2        
	//  560 1097:faload          
	//  561 1098:fmul            
	//  562 1099:fadd            
	//  563 1100:fastore         
		zzczd = -((float)Math.atan2(af2[1], af2[0]) - 1.570796F);
	//  564 1101:aload_0         
	//  565 1102:aload           8
	//  566 1104:iconst_1        
	//  567 1105:faload          
	//  568 1106:f2d             
	//  569 1107:aload           8
	//  570 1109:iconst_0        
	//  571 1110:faload          
	//  572 1111:f2d             
	//  573 1112:invokestatic    #486 <Method double Math.atan2(double, double)>
	//  574 1115:d2f             
	//  575 1116:ldc2            #487 <Float 1.570796F>
	//  576 1119:fsub            
	//  577 1120:fneg            
	//  578 1121:putfield        #115 <Field float zzczd>
		zzb(zzczb, zzczd + zzcze);
	//  579 1124:aload_0         
	//  580 1125:getfield        #110 <Field float[] zzczb>
	//  581 1128:aload_0         
	//  582 1129:getfield        #115 <Field float zzczd>
	//  583 1132:aload_0         
	//  584 1133:getfield        #489 <Field float zzcze>
	//  585 1136:fadd            
	//  586 1137:invokestatic    #491 <Method void zzb(float[], float)>
		break MISSING_BLOCK_LABEL_1164;
	//  587 1140:goto            1164
		zza(zzcys, -1.570796F);
	//  588 1143:aload_0         
	//  589 1144:getfield        #100 <Field float[] zzcys>
	//  590 1147:ldc2            #492 <Float -1.570796F>
	//  591 1150:invokestatic    #494 <Method void zza(float[], float)>
		zzb(zzczb, zzcze);
	//  592 1153:aload_0         
	//  593 1154:getfield        #110 <Field float[] zzczb>
	//  594 1157:aload_0         
	//  595 1158:getfield        #489 <Field float zzcze>
	//  596 1161:invokestatic    #491 <Method void zzb(float[], float)>
		zza(zzcyx, 1.570796F);
	//  597 1164:aload_0         
	//  598 1165:getfield        #102 <Field float[] zzcyx>
	//  599 1168:ldc2            #487 <Float 1.570796F>
	//  600 1171:invokestatic    #494 <Method void zza(float[], float)>
		zza(zzcyy, zzczb, zzcyx);
	//  601 1174:aload_0         
	//  602 1175:getfield        #104 <Field float[] zzcyy>
	//  603 1178:aload_0         
	//  604 1179:getfield        #110 <Field float[] zzczb>
	//  605 1182:aload_0         
	//  606 1183:getfield        #102 <Field float[] zzcyx>
	//  607 1186:invokestatic    #496 <Method void zza(float[], float[], float[])>
		zza(zzcyz, zzcys, zzcyy);
	//  608 1189:aload_0         
	//  609 1190:getfield        #106 <Field float[] zzcyz>
	//  610 1193:aload_0         
	//  611 1194:getfield        #100 <Field float[] zzcys>
	//  612 1197:aload_0         
	//  613 1198:getfield        #104 <Field float[] zzcyy>
	//  614 1201:invokestatic    #496 <Method void zza(float[], float[], float[])>
		zza(zzcza, zzczf);
	//  615 1204:aload_0         
	//  616 1205:getfield        #108 <Field float[] zzcza>
	//  617 1208:aload_0         
	//  618 1209:getfield        #498 <Field float zzczf>
	//  619 1212:invokestatic    #494 <Method void zza(float[], float)>
		zza(zzczc, zzcza, zzcyz);
	//  620 1215:aload_0         
	//  621 1216:getfield        #112 <Field float[] zzczc>
	//  622 1219:aload_0         
	//  623 1220:getfield        #108 <Field float[] zzcza>
	//  624 1223:aload_0         
	//  625 1224:getfield        #106 <Field float[] zzcyz>
	//  626 1227:invokestatic    #496 <Method void zza(float[], float[], float[])>
		GLES20.glUniformMatrix3fv(zzczj, 1, false, zzczc, 0);
	//  627 1230:aload_0         
	//  628 1231:getfield        #450 <Field int zzczj>
	//  629 1234:iconst_1        
	//  630 1235:iconst_0        
	//  631 1236:aload_0         
	//  632 1237:getfield        #112 <Field float[] zzczc>
	//  633 1240:iconst_0        
	//  634 1241:invokestatic    #454 <Method void GLES20.glUniformMatrix3fv(int, int, boolean, float[], int)>
		GLES20.glDrawArrays(5, 0, 4);
	//  635 1244:iconst_5        
	//  636 1245:iconst_0        
	//  637 1246:iconst_4        
	//  638 1247:invokestatic    #501 <Method void GLES20.glDrawArrays(int, int, int)>
		zzdo("drawArrays");
	//  639 1250:ldc2            #503 <String "drawArrays">
	//  640 1253:invokestatic    #163 <Method void zzdo(String)>
		GLES20.glFinish();
	//  641 1256:invokestatic    #506 <Method void GLES20.glFinish()>
		zzczo.eglSwapBuffers(zzczp, zzczr);
	//  642 1259:aload_0         
	//  643 1260:getfield        #243 <Field EGL10 zzczo>
	//  644 1263:aload_0         
	//  645 1264:getfield        #245 <Field EGLDisplay zzczp>
	//  646 1267:aload_0         
	//  647 1268:getfield        #236 <Field EGLSurface zzczr>
	//  648 1271:invokeinterface #509 <Method boolean EGL10.eglSwapBuffers(EGLDisplay, EGLSurface)>
	//  649 1276:pop             
		if(!zzczs)
			break MISSING_BLOCK_LABEL_1396;
	//  650 1277:aload_0         
	//  651 1278:getfield        #468 <Field boolean zzczs>
	//  652 1281:ifeq            1396
		GLES20.glViewport(0, 0, zzuq, zzur);
	//  653 1284:iconst_0        
	//  654 1285:iconst_0        
	//  655 1286:aload_0         
	//  656 1287:getfield        #511 <Field int zzuq>
	//  657 1290:aload_0         
	//  658 1291:getfield        #513 <Field int zzur>
	//  659 1294:invokestatic    #517 <Method void GLES20.glViewport(int, int, int, int)>
		zzdo("viewport");
	//  660 1297:ldc2            #519 <String "viewport">
	//  661 1300:invokestatic    #163 <Method void zzdo(String)>
		i = GLES20.glGetUniformLocation(zzczi, "uFOVx");
	//  662 1303:aload_0         
	//  663 1304:getfield        #403 <Field int zzczi>
	//  664 1307:ldc2            #521 <String "uFOVx">
	//  665 1310:invokestatic    #448 <Method int GLES20.glGetUniformLocation(int, String)>
	//  666 1313:istore_1        
		flag = ((boolean) (GLES20.glGetUniformLocation(zzczi, "uFOVy")));
	//  667 1314:aload_0         
	//  668 1315:getfield        #403 <Field int zzczi>
	//  669 1318:ldc2            #523 <String "uFOVy">
	//  670 1321:invokestatic    #448 <Method int GLES20.glGetUniformLocation(int, String)>
	//  671 1324:istore_2        
		if(zzuq > zzur)
	//* 672 1325:aload_0         
	//* 673 1326:getfield        #511 <Field int zzuq>
	//* 674 1329:aload_0         
	//* 675 1330:getfield        #513 <Field int zzur>
	//* 676 1333:icmple          1365
		{
			GLES20.glUniform1f(i, 0.8726646F);
	//  677 1336:iload_1         
	//  678 1337:ldc2            #524 <Float 0.8726646F>
	//  679 1340:invokestatic    #528 <Method void GLES20.glUniform1f(int, float)>
			GLES20.glUniform1f(((int) (flag)), (0.8726646F * (float)zzur) / (float)zzuq);
	//  680 1343:iload_2         
	//  681 1344:ldc2            #524 <Float 0.8726646F>
	//  682 1347:aload_0         
	//  683 1348:getfield        #513 <Field int zzur>
	//  684 1351:i2f             
	//  685 1352:fmul            
	//  686 1353:aload_0         
	//  687 1354:getfield        #511 <Field int zzuq>
	//  688 1357:i2f             
	//  689 1358:fdiv            
	//  690 1359:invokestatic    #528 <Method void GLES20.glUniform1f(int, float)>
			break MISSING_BLOCK_LABEL_1391;
	//  691 1362:goto            1391
		}
		GLES20.glUniform1f(i, ((float)zzuq * 0.8726646F) / (float)zzur);
	//  692 1365:iload_1         
	//  693 1366:aload_0         
	//  694 1367:getfield        #511 <Field int zzuq>
	//  695 1370:i2f             
	//  696 1371:ldc2            #524 <Float 0.8726646F>
	//  697 1374:fmul            
	//  698 1375:aload_0         
	//  699 1376:getfield        #513 <Field int zzur>
	//  700 1379:i2f             
	//  701 1380:fdiv            
	//  702 1381:invokestatic    #528 <Method void GLES20.glUniform1f(int, float)>
		GLES20.glUniform1f(((int) (flag)), 0.8726646F);
	//  703 1384:iload_2         
	//  704 1385:ldc2            #524 <Float 0.8726646F>
	//  705 1388:invokestatic    #528 <Method void GLES20.glUniform1f(int, float)>
		zzczs = false;
	//  706 1391:aload_0         
	//  707 1392:iconst_0        
	//  708 1393:putfield        #468 <Field boolean zzczs>
		synchronized(zzczn)
	//* 709 1396:aload_0         
	//* 710 1397:getfield        #138 <Field Object zzczn>
	//* 711 1400:astore          6
	//* 712 1402:aload           6
	//* 713 1404:monitorenter    
		{
			if(!zzczt && !zzczs && zzczk == 0)
	//* 714 1405:aload_0         
	//* 715 1406:getfield        #470 <Field boolean zzczt>
	//* 716 1409:ifne            1433
	//* 717 1412:aload_0         
	//* 718 1413:getfield        #468 <Field boolean zzczs>
	//* 719 1416:ifne            1433
	//* 720 1419:aload_0         
	//* 721 1420:getfield        #271 <Field int zzczk>
	//* 722 1423:ifne            1433
				zzczn.wait();
	//  723 1426:aload_0         
	//  724 1427:getfield        #138 <Field Object zzczn>
	//  725 1430:invokevirtual   #531 <Method void Object.wait()>
		}
	//  726 1433:aload           6
	//  727 1435:monitorexit     
		continue; /* Loop/switch isn't completed */
	//  728 1436:goto            910
		exception;
	//  729 1439:astore          7
		obj2;
	//  730 1441:aload           6
		JVM INSTR monitorexit ;
	//  731 1443:monitorexit     
		throw exception;
	//  732 1444:aload           7
	//  733 1446:athrow          
_L10:
		zzcyw.stop();
	//  734 1447:aload_0         
	//  735 1448:getfield        #121 <Field zzapr zzcyw>
	//  736 1451:invokevirtual   #534 <Method void zzapr.stop()>
		zzczg.setOnFrameAvailableListener(((android.graphics.SurfaceTexture.OnFrameAvailableListener) (null)));
	//  737 1454:aload_0         
	//  738 1455:getfield        #459 <Field SurfaceTexture zzczg>
	//  739 1458:aconst_null     
	//  740 1459:invokevirtual   #463 <Method void SurfaceTexture.setOnFrameAvailableListener(android.graphics.SurfaceTexture$OnFrameAvailableListener)>
		zzczg = null;
	//  741 1462:aload_0         
	//  742 1463:aconst_null     
	//  743 1464:putfield        #459 <Field SurfaceTexture zzczg>
		zztk();
	//  744 1467:aload_0         
	//  745 1468:invokespecial   #536 <Method boolean zztk()>
	//  746 1471:pop             
		return;
	//  747 1472:return          
		Object obj3;
		obj3;
	//  748 1473:astore          6
		  goto _L11
	//* 749 1475:goto            1557
		obj3;
	//  750 1478:astore          6
		zzakb.zzb("SphericalVideoProcessor died.", ((Throwable) (obj3)));
	//  751 1480:ldc2            #538 <String "SphericalVideoProcessor died.">
	//  752 1483:aload           6
	//  753 1485:invokestatic    #541 <Method void zzakb.zzb(String, Throwable)>
		zzbv.zzeo().zza(((Throwable) (obj3)), "SphericalVideoProcessor.run.2");
	//  754 1488:invokestatic    #547 <Method zzajm zzbv.zzeo()>
	//  755 1491:aload           6
	//  756 1493:ldc2            #549 <String "SphericalVideoProcessor.run.2">
	//  757 1496:invokevirtual   #554 <Method void zzajm.zza(Throwable, String)>
		zzcyw.stop();
	//  758 1499:aload_0         
	//  759 1500:getfield        #121 <Field zzapr zzcyw>
	//  760 1503:invokevirtual   #534 <Method void zzapr.stop()>
		zzczg.setOnFrameAvailableListener(((android.graphics.SurfaceTexture.OnFrameAvailableListener) (null)));
	//  761 1506:aload_0         
	//  762 1507:getfield        #459 <Field SurfaceTexture zzczg>
	//  763 1510:aconst_null     
	//  764 1511:invokevirtual   #463 <Method void SurfaceTexture.setOnFrameAvailableListener(android.graphics.SurfaceTexture$OnFrameAvailableListener)>
		zzczg = null;
	//  765 1514:aload_0         
	//  766 1515:aconst_null     
	//  767 1516:putfield        #459 <Field SurfaceTexture zzczg>
		zztk();
	//  768 1519:aload_0         
	//  769 1520:invokespecial   #536 <Method boolean zztk()>
	//  770 1523:pop             
		return;
	//  771 1524:return          
_L13:
		zzakb.zzdk("SphericalVideoProcessor halted unexpectedly.");
	//  772 1525:ldc2            #556 <String "SphericalVideoProcessor halted unexpectedly.">
	//  773 1528:invokestatic    #559 <Method void zzakb.zzdk(String)>
		zzcyw.stop();
	//  774 1531:aload_0         
	//  775 1532:getfield        #121 <Field zzapr zzcyw>
	//  776 1535:invokevirtual   #534 <Method void zzapr.stop()>
		zzczg.setOnFrameAvailableListener(((android.graphics.SurfaceTexture.OnFrameAvailableListener) (null)));
	//  777 1538:aload_0         
	//  778 1539:getfield        #459 <Field SurfaceTexture zzczg>
	//  779 1542:aconst_null     
	//  780 1543:invokevirtual   #463 <Method void SurfaceTexture.setOnFrameAvailableListener(android.graphics.SurfaceTexture$OnFrameAvailableListener)>
		zzczg = null;
	//  781 1546:aload_0         
	//  782 1547:aconst_null     
	//  783 1548:putfield        #459 <Field SurfaceTexture zzczg>
		zztk();
	//  784 1551:aload_0         
	//  785 1552:invokespecial   #536 <Method boolean zztk()>
	//  786 1555:pop             
		return;
	//  787 1556:return          
_L11:
		zzcyw.stop();
	//  788 1557:aload_0         
	//  789 1558:getfield        #121 <Field zzapr zzcyw>
	//  790 1561:invokevirtual   #534 <Method void zzapr.stop()>
		zzczg.setOnFrameAvailableListener(((android.graphics.SurfaceTexture.OnFrameAvailableListener) (null)));
	//  791 1564:aload_0         
	//  792 1565:getfield        #459 <Field SurfaceTexture zzczg>
	//  793 1568:aconst_null     
	//  794 1569:invokevirtual   #463 <Method void SurfaceTexture.setOnFrameAvailableListener(android.graphics.SurfaceTexture$OnFrameAvailableListener)>
		zzczg = null;
	//  795 1572:aload_0         
	//  796 1573:aconst_null     
	//  797 1574:putfield        #459 <Field SurfaceTexture zzczg>
		zztk();
	//  798 1577:aload_0         
	//  799 1578:invokespecial   #536 <Method boolean zztk()>
	//  800 1581:pop             
		throw obj3;
	//  801 1582:aload           6
	//  802 1584:athrow          
_L7:
		String s = String.valueOf(((Object) (GLUtils.getEGLErrorString(zzczo.eglGetError()))));
	//  803 1585:aload_0         
	//  804 1586:getfield        #243 <Field EGL10 zzczo>
	//  805 1589:invokeinterface #562 <Method int EGL10.eglGetError()>
	//  806 1594:invokestatic    #567 <Method String GLUtils.getEGLErrorString(int)>
	//  807 1597:invokestatic    #226 <Method String String.valueOf(Object)>
	//  808 1600:astore          6
		if(s.length() != 0)
	//* 809 1602:aload           6
	//* 810 1604:invokevirtual   #229 <Method int String.length()>
	//* 811 1607:ifeq            1623
			s = "EGL initialization failed: ".concat(s);
	//  812 1610:ldc2            #569 <String "EGL initialization failed: ">
	//  813 1613:aload           6
	//  814 1615:invokevirtual   #573 <Method String String.concat(String)>
	//  815 1618:astore          6
		else
	//* 816 1620:goto            1635
			s = new String("EGL initialization failed: ");
	//  817 1623:new             #222 <Class String>
	//  818 1626:dup             
	//  819 1627:ldc2            #569 <String "EGL initialization failed: ">
	//  820 1630:invokespecial   #574 <Method void String(String)>
	//  821 1633:astore          6
		zzakb.e(s);
	//  822 1635:aload           6
	//  823 1637:invokestatic    #289 <Method void zzakb.e(String)>
		zzbv.zzeo().zza(new Throwable(s), "SphericalVideoProcessor.run.1");
	//  824 1640:invokestatic    #547 <Method zzajm zzbv.zzeo()>
	//  825 1643:new             #279 <Class Throwable>
	//  826 1646:dup             
	//  827 1647:aload           6
	//  828 1649:invokespecial   #575 <Method void Throwable(String)>
	//  829 1652:ldc2            #577 <String "SphericalVideoProcessor.run.1">
	//  830 1655:invokevirtual   #554 <Method void zzajm.zza(Throwable, String)>
		zztk();
	//  831 1658:aload_0         
	//  832 1659:invokespecial   #536 <Method boolean zztk()>
	//  833 1662:pop             
		zzczm.countDown();
	//  834 1663:aload_0         
	//  835 1664:getfield        #132 <Field CountDownLatch zzczm>
	//  836 1667:invokevirtual   #292 <Method void CountDownLatch.countDown()>
		return;
	//  837 1670:return          
		s;
	//  838 1671:astore          6
		if(true) goto _L13; else goto _L12
	//  839 1673:goto            1525
_L12:
		s;
	//  840 1676:astore          6
		if(true) goto _L15; else goto _L14
	//  841 1678:goto            910
_L14:
	}

	public final void zza(SurfaceTexture surfacetexture, int i, int j)
	{
		zzuq = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #511 <Field int zzuq>
		zzur = j;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:putfield        #513 <Field int zzur>
		zzczh = surfacetexture;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #283 <Field SurfaceTexture zzczh>
	//    9   15:return          
	}

	public final void zzb(float f, float f1)
	{
		int i;
		if(zzuq > zzur)
	//*   0    0:aload_0         
	//*   1    1:getfield        #511 <Field int zzuq>
	//*   2    4:aload_0         
	//*   3    5:getfield        #513 <Field int zzur>
	//*   4    8:icmple          42
		{
			f = (f * 1.745329F) / (float)zzuq;
	//    5   11:fload_1         
	//    6   12:ldc2            #580 <Float 1.745329F>
	//    7   15:fmul            
	//    8   16:aload_0         
	//    9   17:getfield        #511 <Field int zzuq>
	//   10   20:i2f             
	//   11   21:fdiv            
	//   12   22:fstore_1        
			f1 = 1.745329F * f1;
	//   13   23:ldc2            #580 <Float 1.745329F>
	//   14   26:fload_2         
	//   15   27:fmul            
	//   16   28:fstore_2        
			i = zzuq;
	//   17   29:aload_0         
	//   18   30:getfield        #511 <Field int zzuq>
	//   19   33:istore_3        
		} else
	//*  20   34:fload_2         
	//*  21   35:iload_3         
	//*  22   36:i2f             
	//*  23   37:fdiv            
	//*  24   38:fstore_2        
	//*  25   39:goto            68
		{
			f = (f * 1.745329F) / (float)zzur;
	//   26   42:fload_1         
	//   27   43:ldc2            #580 <Float 1.745329F>
	//   28   46:fmul            
	//   29   47:aload_0         
	//   30   48:getfield        #513 <Field int zzur>
	//   31   51:i2f             
	//   32   52:fdiv            
	//   33   53:fstore_1        
			f1 = 1.745329F * f1;
	//   34   54:ldc2            #580 <Float 1.745329F>
	//   35   57:fload_2         
	//   36   58:fmul            
	//   37   59:fstore_2        
			i = zzur;
	//   38   60:aload_0         
	//   39   61:getfield        #513 <Field int zzur>
	//   40   64:istore_3        
		}
		f1 /= i;
	//*  41   65:goto            34
		zzcze = zzcze - f;
	//   42   68:aload_0         
	//   43   69:aload_0         
	//   44   70:getfield        #489 <Field float zzcze>
	//   45   73:fload_1         
	//   46   74:fsub            
	//   47   75:putfield        #489 <Field float zzcze>
		zzczf = zzczf - f1;
	//   48   78:aload_0         
	//   49   79:aload_0         
	//   50   80:getfield        #498 <Field float zzczf>
	//   51   83:fload_2         
	//   52   84:fsub            
	//   53   85:putfield        #498 <Field float zzczf>
		if(zzczf < -1.570796F)
	//*  54   88:aload_0         
	//*  55   89:getfield        #498 <Field float zzczf>
	//*  56   92:ldc2            #492 <Float -1.570796F>
	//*  57   95:fcmpg           
	//*  58   96:ifge            106
			zzczf = -1.570796F;
	//   59   99:aload_0         
	//   60  100:ldc2            #492 <Float -1.570796F>
	//   61  103:putfield        #498 <Field float zzczf>
		if(zzczf > 1.570796F)
	//*  62  106:aload_0         
	//*  63  107:getfield        #498 <Field float zzczf>
	//*  64  110:ldc2            #487 <Float 1.570796F>
	//*  65  113:fcmpl           
	//*  66  114:ifle            124
			zzczf = 1.570796F;
	//   67  117:aload_0         
	//   68  118:ldc2            #487 <Float 1.570796F>
	//   69  121:putfield        #498 <Field float zzczf>
	//   70  124:return          
	}

	public final void zzh(int i, int j)
	{
		synchronized(zzczn)
	//*   0    0:aload_0         
	//*   1    1:getfield        #138 <Field Object zzczn>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			zzuq = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #511 <Field int zzuq>
			zzur = j;
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:putfield        #513 <Field int zzur>
			zzczs = true;
	//   11   17:aload_0         
	//   12   18:iconst_1        
	//   13   19:putfield        #468 <Field boolean zzczs>
			zzczn.notifyAll();
	//   14   22:aload_0         
	//   15   23:getfield        #138 <Field Object zzczn>
	//   16   26:invokevirtual   #274 <Method void Object.notifyAll()>
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

	public final void zznn()
	{
		synchronized(zzczn)
	//*   0    0:aload_0         
	//*   1    1:getfield        #138 <Field Object zzczn>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzczn.notifyAll();
	//    5    7:aload_0         
	//    6    8:getfield        #138 <Field Object zzczn>
	//    7   11:invokevirtual   #274 <Method void Object.notifyAll()>
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

	public final void zzti()
	{
		synchronized(zzczn)
	//*   0    0:aload_0         
	//*   1    1:getfield        #138 <Field Object zzczn>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzczt = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #470 <Field boolean zzczt>
			zzczh = null;
	//    8   12:aload_0         
	//    9   13:aconst_null     
	//   10   14:putfield        #283 <Field SurfaceTexture zzczh>
			zzczn.notifyAll();
	//   11   17:aload_0         
	//   12   18:getfield        #138 <Field Object zzczn>
	//   13   21:invokevirtual   #274 <Method void Object.notifyAll()>
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

	public final SurfaceTexture zztj()
	{
		if(zzczh == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #283 <Field SurfaceTexture zzczh>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		try
		{
			zzczm.await();
	//    5    9:aload_0         
	//    6   10:getfield        #132 <Field CountDownLatch zzczm>
	//    7   13:invokevirtual   #588 <Method void CountDownLatch.await()>
		}
	//*   8   16:aload_0         
	//*   9   17:getfield        #459 <Field SurfaceTexture zzczg>
	//*  10   20:areturn         
		catch(InterruptedException interruptedexception) { }
	//   11   21:astore_1        
		return zzczg;
	//*  12   22:goto            16
	}

	private static final float zzcyv[] = {
		-1F, -1F, -1F, 1.0F, -1F, -1F, -1F, 1.0F, -1F, 1.0F, 
		1.0F, -1F
	};
	private final float zzcys[] = new float[9];
	private final zzapr zzcyw;
	private final float zzcyx[] = new float[9];
	private final float zzcyy[] = new float[9];
	private final float zzcyz[] = new float[9];
	private final float zzcza[] = new float[9];
	private final float zzczb[] = new float[9];
	private final float zzczc[] = new float[9];
	private float zzczd;
	private float zzcze;
	private float zzczf;
	private SurfaceTexture zzczg;
	private SurfaceTexture zzczh;
	private int zzczi;
	private int zzczj;
	private int zzczk;
	private FloatBuffer zzczl;
	private final CountDownLatch zzczm = new CountDownLatch(1);
	private final Object zzczn = new Object();
	private EGL10 zzczo;
	private EGLDisplay zzczp;
	private EGLContext zzczq;
	private EGLSurface zzczr;
	private volatile boolean zzczs;
	private volatile boolean zzczt;
	private int zzuq;
	private int zzur;

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
	//   50   66:putstatic       #58  <Field float[] zzcyv>
	//*  51   69:return          
	}
}
