// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.opengl.Matrix;
import android.os.RemoteException;
import com.amap.api.maps.model.*;
import com.autonavi.amap.mapcore.*;
import com.autonavi.amap.mapcore.interfaces.IMultiPointOverlay;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			az, ay, bb, er, 
//			bc, hm

public class ba
	implements IMultiPointOverlay
{

	public ba(MultiPointOverlayOptions multipointoverlayoptions, bb bb1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void Object()>
		a = BitmapDescriptorFactory.defaultMarker();
	//    2    4:aload_0         
	//    3    5:invokestatic    #72  <Method BitmapDescriptor BitmapDescriptorFactory.defaultMarker()>
	//    4    8:putfield        #74  <Field BitmapDescriptor a>
		b = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #76  <Field BitmapDescriptor b>
		c = 0.0F;
	//    8   16:aload_0         
	//    9   17:fconst_0        
	//   10   18:putfield        #78  <Field float c>
		d = 0.0F;
	//   11   21:aload_0         
	//   12   22:fconst_0        
	//   13   23:putfield        #80  <Field float d>
		e = 0.0F;
	//   14   26:aload_0         
	//   15   27:fconst_0        
	//   16   28:putfield        #82  <Field float e>
		f = 0.5F;
	//   17   31:aload_0         
	//   18   32:ldc1            #83  <Float 0.5F>
	//   19   34:putfield        #85  <Field float f>
		g = 0.5F;
	//   20   37:aload_0         
	//   21   38:ldc1            #83  <Float 0.5F>
	//   22   40:putfield        #87  <Field float g>
		i = null;
	//   23   43:aload_0         
	//   24   44:aconst_null     
	//   25   45:putfield        #89  <Field bc i>
		j = null;
	//   26   48:aload_0         
	//   27   49:aconst_null     
	//   28   50:putfield        #91  <Field az j>
		k = new az(0, 1, 0, 1);
	//   29   53:aload_0         
	//   30   54:new             #93  <Class az>
	//   31   57:dup             
	//   32   58:iconst_0        
	//   33   59:iconst_1        
	//   34   60:iconst_0        
	//   35   61:iconst_1        
	//   36   62:invokespecial   #96  <Method void az(int, int, int, int)>
	//   37   65:putfield        #98  <Field az k>
		l = ((List) (new ArrayList()));
	//   38   68:aload_0         
	//   39   69:new             #100 <Class ArrayList>
	//   40   72:dup             
	//   41   73:invokespecial   #101 <Method void ArrayList()>
	//   42   76:putfield        #103 <Field List l>
	//   43   79:aload_0         
	//   44   80:bipush          24
	//   45   82:newarray        float[]
	//   46   84:dup             
	//   47   85:iconst_0        
	//   48   86:ldc1            #104 <Float -0.5F>
	//   49   88:fastore         
	//   50   89:dup             
	//   51   90:iconst_1        
	//   52   91:ldc1            #104 <Float -0.5F>
	//   53   93:fastore         
	//   54   94:dup             
	//   55   95:iconst_2        
	//   56   96:fconst_0        
	//   57   97:fastore         
	//   58   98:dup             
	//   59   99:iconst_3        
	//   60  100:fconst_0        
	//   61  101:fastore         
	//   62  102:dup             
	//   63  103:iconst_4        
	//   64  104:fconst_0        
	//   65  105:fastore         
	//   66  106:dup             
	//   67  107:iconst_5        
	//   68  108:fconst_0        
	//   69  109:fastore         
	//   70  110:dup             
	//   71  111:bipush          6
	//   72  113:ldc1            #104 <Float -0.5F>
	//   73  115:fastore         
	//   74  116:dup             
	//   75  117:bipush          7
	//   76  119:ldc1            #83  <Float 0.5F>
	//   77  121:fastore         
	//   78  122:dup             
	//   79  123:bipush          8
	//   80  125:fconst_0        
	//   81  126:fastore         
	//   82  127:dup             
	//   83  128:bipush          9
	//   84  130:fconst_0        
	//   85  131:fastore         
	//   86  132:dup             
	//   87  133:bipush          10
	//   88  135:fconst_0        
	//   89  136:fastore         
	//   90  137:dup             
	//   91  138:bipush          11
	//   92  140:fconst_1        
	//   93  141:fastore         
	//   94  142:dup             
	//   95  143:bipush          12
	//   96  145:ldc1            #83  <Float 0.5F>
	//   97  147:fastore         
	//   98  148:dup             
	//   99  149:bipush          13
	//  100  151:ldc1            #83  <Float 0.5F>
	//  101  153:fastore         
	//  102  154:dup             
	//  103  155:bipush          14
	//  104  157:fconst_0        
	//  105  158:fastore         
	//  106  159:dup             
	//  107  160:bipush          15
	//  108  162:fconst_0        
	//  109  163:fastore         
	//  110  164:dup             
	//  111  165:bipush          16
	//  112  167:fconst_1        
	//  113  168:fastore         
	//  114  169:dup             
	//  115  170:bipush          17
	//  116  172:fconst_1        
	//  117  173:fastore         
	//  118  174:dup             
	//  119  175:bipush          18
	//  120  177:ldc1            #83  <Float 0.5F>
	//  121  179:fastore         
	//  122  180:dup             
	//  123  181:bipush          19
	//  124  183:ldc1            #104 <Float -0.5F>
	//  125  185:fastore         
	//  126  186:dup             
	//  127  187:bipush          20
	//  128  189:fconst_0        
	//  129  190:fastore         
	//  130  191:dup             
	//  131  192:bipush          21
	//  132  194:fconst_0        
	//  133  195:fastore         
	//  134  196:dup             
	//  135  197:bipush          22
	//  136  199:fconst_1        
	//  137  200:fastore         
	//  138  201:dup             
	//  139  202:bipush          23
	//  140  204:fconst_0        
	//  141  205:fastore         
	//  142  206:putfield        #106 <Field float[] C>
		D = true;
	//  143  209:aload_0         
	//  144  210:iconst_1        
	//  145  211:putfield        #108 <Field boolean D>
		o = ((List) (new ArrayList()));
	//  146  214:aload_0         
	//  147  215:new             #100 <Class ArrayList>
	//  148  218:dup             
	//  149  219:invokespecial   #101 <Method void ArrayList()>
	//  150  222:putfield        #110 <Field List o>
		F = null;
	//  151  225:aload_0         
	//  152  226:aconst_null     
	//  153  227:putfield        #112 <Field ExecutorService F>
		G = ((List) (new ArrayList()));
	//  154  230:aload_0         
	//  155  231:new             #100 <Class ArrayList>
	//  156  234:dup             
	//  157  235:invokespecial   #101 <Method void ArrayList()>
	//  158  238:putfield        #114 <Field List G>
		H = new float[ay.a * 3];
	//  159  241:aload_0         
	//  160  242:getstatic       #118 <Field int ay.a>
	//  161  245:iconst_3        
	//  162  246:imul            
	//  163  247:newarray        float[]
	//  164  249:putfield        #120 <Field float[] H>
		p = new float[16];
	//  165  252:aload_0         
	//  166  253:bipush          16
	//  167  255:newarray        float[]
	//  168  257:putfield        #122 <Field float[] p>
		q = new float[4];
	//  169  260:aload_0         
	//  170  261:iconst_4        
	//  171  262:newarray        float[]
	//  172  264:putfield        #124 <Field float[] q>
		r = new float[4];
	//  173  267:aload_0         
	//  174  268:iconst_4        
	//  175  269:newarray        float[]
	//  176  271:putfield        #126 <Field float[] r>
		s = new Rect();
	//  177  274:aload_0         
	//  178  275:new             #128 <Class Rect>
	//  179  278:dup             
	//  180  279:invokespecial   #129 <Method void Rect()>
	//  181  282:putfield        #131 <Field Rect s>
		t = null;
	//  182  285:aload_0         
	//  183  286:aconst_null     
	//  184  287:putfield        #133 <Field az t>
		u = null;
	//  185  290:aload_0         
	//  186  291:aconst_null     
	//  187  292:putfield        #135 <Field az u>
		v = 0;
	//  188  295:aload_0         
	//  189  296:iconst_0        
	//  190  297:putfield        #137 <Field int v>
		w = 0;
	//  191  300:aload_0         
	//  192  301:iconst_0        
	//  193  302:putfield        #139 <Field int w>
		x = new float[12];
	//  194  305:aload_0         
	//  195  306:bipush          12
	//  196  308:newarray        float[]
	//  197  310:putfield        #141 <Field float[] x>
		y = "precision highp float;\nattribute vec3 aVertex;//\u9876\u70B9\u6570\u7EC4,\u4E09\u7EF4\u5750\u6807\nuniform mat4 aMVPMatrix;//mvp\u77E9\u9635\nvoid main(){\n  gl_Position = aMVPMatrix * vec4(aVertex, 1.0);\n}";
	//  198  313:aload_0         
	//  199  314:ldc1            #143 <String "precision highp float;\nattribute vec3 aVertex;//\u9876\u70B9\u6570\u7EC4,\u4E09\u7EF4\u5750\u6807\nuniform mat4 aMVPMatrix;//mvp\u77E9\u9635\nvoid main(){\n  gl_Position = aMVPMatrix * vec4(aVertex, 1.0);\n}">
	//  200  316:putfield        #145 <Field String y>
		z = "//\u6709\u989C\u8272 \u6CA1\u6709\u7EB9\u7406\nprecision highp float;\nvoid main(){\n  gl_FragColor = vec4(0,0,1,1.0);\n}";
	//  201  319:aload_0         
	//  202  320:ldc1            #147 <String "//\u6709\u989C\u8272 \u6CA1\u6709\u7EB9\u7406\nprecision highp float;\nvoid main(){\n  gl_FragColor = vec4(0,0,1,1.0);\n}">
	//  203  322:putfield        #149 <Field String z>
		A = -1;
	//  204  325:aload_0         
	//  205  326:iconst_m1       
	//  206  327:putfield        #151 <Field int A>
		n = bb1;
	//  207  330:aload_0         
	//  208  331:aload_2         
	//  209  332:putfield        #153 <Field bb n>
		a(multipointoverlayoptions);
	//  210  335:aload_0         
	//  211  336:aload_1         
	//  212  337:invokespecial   #156 <Method void a(MultiPointOverlayOptions)>
		multipointoverlayoptions = ((MultiPointOverlayOptions) (new ay(a(), this)));
	//  213  340:new             #116 <Class ay>
	//  214  343:dup             
	//  215  344:aload_0         
	//  216  345:invokespecial   #159 <Method float[] a()>
	//  217  348:aload_0         
	//  218  349:invokespecial   #162 <Method void ay(float[], ba)>
	//  219  352:astore_1        
		((ay) (multipointoverlayoptions)).a(bb1.a());
	//  220  353:aload_1         
	//  221  354:aload_2         
	//  222  355:invokevirtual   #167 <Method ds bb.a()>
	//  223  358:invokevirtual   #170 <Method void ay.a(ds)>
		((ay) (multipointoverlayoptions)).a(b);
	//  224  361:aload_1         
	//  225  362:aload_0         
	//  226  363:getfield        #76  <Field BitmapDescriptor b>
	//  227  366:invokevirtual   #173 <Method void ay.a(BitmapDescriptor)>
		o.add(((Object) (multipointoverlayoptions)));
	//  228  369:aload_0         
	//  229  370:getfield        #110 <Field List o>
	//  230  373:aload_1         
	//  231  374:invokeinterface #179 <Method boolean List.add(Object)>
	//  232  379:pop             
	//  233  380:return          
	}

	private static String a(String s1)
	{
		E++;
	//    0    0:getstatic       #61  <Field int E>
	//    1    3:iconst_1        
	//    2    4:iadd            
	//    3    5:putstatic       #61  <Field int E>
		return (new StringBuilder()).append(s1).append(E).toString();
	//    4    8:new             #182 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #183 <Method void StringBuilder()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:getstatic       #61  <Field int E>
	//   10   22:invokevirtual   #190 <Method StringBuilder StringBuilder.append(int)>
	//   11   25:invokevirtual   #194 <Method String StringBuilder.toString()>
	//   12   28:areturn         
	}

	static List a(ba ba1)
	{
		return ba1.G;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field List G>
	//    2    4:areturn         
	}

	private void a(float f1, float f2, float f3, float f4)
	{
		if(k == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field az k>
	//*   2    4:ifnonnull       22
			k = new az(0, 1, 0, 1);
	//    3    7:aload_0         
	//    4    8:new             #93  <Class az>
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:iconst_1        
	//    8   14:iconst_0        
	//    9   15:iconst_1        
	//   10   16:invokespecial   #96  <Method void az(int, int, int, int)>
	//   11   19:putfield        #98  <Field az k>
		s.set(0, 0, 0, 0);
	//   12   22:aload_0         
	//   13   23:getfield        #131 <Field Rect s>
	//   14   26:iconst_0        
	//   15   27:iconst_0        
	//   16   28:iconst_0        
	//   17   29:iconst_0        
	//   18   30:invokevirtual   #199 <Method void Rect.set(int, int, int, int)>
		IPoint ipoint = new IPoint();
	//   19   33:new             #201 <Class IPoint>
	//   20   36:dup             
	//   21   37:invokespecial   #202 <Method void IPoint()>
	//   22   40:astore          6
		f4 = f;
	//   23   42:aload_0         
	//   24   43:getfield        #85  <Field float f>
	//   25   46:fstore          4
		float f5 = g;
	//   26   48:aload_0         
	//   27   49:getfield        #87  <Field float g>
	//   28   52:fstore          5
		Matrix.setIdentityM(p, 0);
	//   29   54:aload_0         
	//   30   55:getfield        #122 <Field float[] p>
	//   31   58:iconst_0        
	//   32   59:invokestatic    #208 <Method void Matrix.setIdentityM(float[], int)>
		Matrix.rotateM(p, 0, -f3, 0.0F, 0.0F, 1.0F);
	//   33   62:aload_0         
	//   34   63:getfield        #122 <Field float[] p>
	//   35   66:iconst_0        
	//   36   67:fload_3         
	//   37   68:fneg            
	//   38   69:fconst_0        
	//   39   70:fconst_0        
	//   40   71:fconst_1        
	//   41   72:invokestatic    #212 <Method void Matrix.rotateM(float[], int, float, float, float, float)>
		r[0] = 0.0F;
	//   42   75:aload_0         
	//   43   76:getfield        #126 <Field float[] r>
	//   44   79:iconst_0        
	//   45   80:fconst_0        
	//   46   81:fastore         
		r[1] = 0.0F;
	//   47   82:aload_0         
	//   48   83:getfield        #126 <Field float[] r>
	//   49   86:iconst_1        
	//   50   87:fconst_0        
	//   51   88:fastore         
		r[2] = 0.0F;
	//   52   89:aload_0         
	//   53   90:getfield        #126 <Field float[] r>
	//   54   93:iconst_2        
	//   55   94:fconst_0        
	//   56   95:fastore         
		r[3] = 0.0F;
	//   57   96:aload_0         
	//   58   97:getfield        #126 <Field float[] r>
	//   59  100:iconst_3        
	//   60  101:fconst_0        
	//   61  102:fastore         
		q[0] = -f1 * f4;
	//   62  103:aload_0         
	//   63  104:getfield        #124 <Field float[] q>
	//   64  107:iconst_0        
	//   65  108:fload_1         
	//   66  109:fneg            
	//   67  110:fload           4
	//   68  112:fmul            
	//   69  113:fastore         
		q[1] = f2 * f5;
	//   70  114:aload_0         
	//   71  115:getfield        #124 <Field float[] q>
	//   72  118:iconst_1        
	//   73  119:fload_2         
	//   74  120:fload           5
	//   75  122:fmul            
	//   76  123:fastore         
		q[2] = 0.0F;
	//   77  124:aload_0         
	//   78  125:getfield        #124 <Field float[] q>
	//   79  128:iconst_2        
	//   80  129:fconst_0        
	//   81  130:fastore         
		q[3] = 1.0F;
	//   82  131:aload_0         
	//   83  132:getfield        #124 <Field float[] q>
	//   84  135:iconst_3        
	//   85  136:fconst_1        
	//   86  137:fastore         
		Matrix.multiplyMV(r, 0, p, 0, q, 0);
	//   87  138:aload_0         
	//   88  139:getfield        #126 <Field float[] r>
	//   89  142:iconst_0        
	//   90  143:aload_0         
	//   91  144:getfield        #122 <Field float[] p>
	//   92  147:iconst_0        
	//   93  148:aload_0         
	//   94  149:getfield        #124 <Field float[] q>
	//   95  152:iconst_0        
	//   96  153:invokestatic    #216 <Method void Matrix.multiplyMV(float[], int, float[], int, float[], int)>
		s.set((int)((float)ipoint.x + r[0]), (int)((float)ipoint.y - r[1]), (int)((float)ipoint.x + r[0]), (int)((float)ipoint.y - r[1]));
	//   97  156:aload_0         
	//   98  157:getfield        #131 <Field Rect s>
	//   99  160:aload           6
	//  100  162:getfield        #218 <Field int IPoint.x>
	//  101  165:i2f             
	//  102  166:aload_0         
	//  103  167:getfield        #126 <Field float[] r>
	//  104  170:iconst_0        
	//  105  171:faload          
	//  106  172:fadd            
	//  107  173:f2i             
	//  108  174:aload           6
	//  109  176:getfield        #220 <Field int IPoint.y>
	//  110  179:i2f             
	//  111  180:aload_0         
	//  112  181:getfield        #126 <Field float[] r>
	//  113  184:iconst_1        
	//  114  185:faload          
	//  115  186:fsub            
	//  116  187:f2i             
	//  117  188:aload           6
	//  118  190:getfield        #218 <Field int IPoint.x>
	//  119  193:i2f             
	//  120  194:aload_0         
	//  121  195:getfield        #126 <Field float[] r>
	//  122  198:iconst_0        
	//  123  199:faload          
	//  124  200:fadd            
	//  125  201:f2i             
	//  126  202:aload           6
	//  127  204:getfield        #220 <Field int IPoint.y>
	//  128  207:i2f             
	//  129  208:aload_0         
	//  130  209:getfield        #126 <Field float[] r>
	//  131  212:iconst_1        
	//  132  213:faload          
	//  133  214:fsub            
	//  134  215:f2i             
	//  135  216:invokevirtual   #199 <Method void Rect.set(int, int, int, int)>
		q[0] = (1.0F - f4) * f1;
	//  136  219:aload_0         
	//  137  220:getfield        #124 <Field float[] q>
	//  138  223:iconst_0        
	//  139  224:fconst_1        
	//  140  225:fload           4
	//  141  227:fsub            
	//  142  228:fload_1         
	//  143  229:fmul            
	//  144  230:fastore         
		q[1] = f2 * f5;
	//  145  231:aload_0         
	//  146  232:getfield        #124 <Field float[] q>
	//  147  235:iconst_1        
	//  148  236:fload_2         
	//  149  237:fload           5
	//  150  239:fmul            
	//  151  240:fastore         
		q[2] = 0.0F;
	//  152  241:aload_0         
	//  153  242:getfield        #124 <Field float[] q>
	//  154  245:iconst_2        
	//  155  246:fconst_0        
	//  156  247:fastore         
		q[3] = 1.0F;
	//  157  248:aload_0         
	//  158  249:getfield        #124 <Field float[] q>
	//  159  252:iconst_3        
	//  160  253:fconst_1        
	//  161  254:fastore         
		Matrix.multiplyMV(r, 0, p, 0, q, 0);
	//  162  255:aload_0         
	//  163  256:getfield        #126 <Field float[] r>
	//  164  259:iconst_0        
	//  165  260:aload_0         
	//  166  261:getfield        #122 <Field float[] p>
	//  167  264:iconst_0        
	//  168  265:aload_0         
	//  169  266:getfield        #124 <Field float[] q>
	//  170  269:iconst_0        
	//  171  270:invokestatic    #216 <Method void Matrix.multiplyMV(float[], int, float[], int, float[], int)>
		s.union((int)((float)ipoint.x + r[0]), (int)((float)ipoint.y - r[1]));
	//  172  273:aload_0         
	//  173  274:getfield        #131 <Field Rect s>
	//  174  277:aload           6
	//  175  279:getfield        #218 <Field int IPoint.x>
	//  176  282:i2f             
	//  177  283:aload_0         
	//  178  284:getfield        #126 <Field float[] r>
	//  179  287:iconst_0        
	//  180  288:faload          
	//  181  289:fadd            
	//  182  290:f2i             
	//  183  291:aload           6
	//  184  293:getfield        #220 <Field int IPoint.y>
	//  185  296:i2f             
	//  186  297:aload_0         
	//  187  298:getfield        #126 <Field float[] r>
	//  188  301:iconst_1        
	//  189  302:faload          
	//  190  303:fsub            
	//  191  304:f2i             
	//  192  305:invokevirtual   #224 <Method void Rect.union(int, int)>
		q[0] = (1.0F - f4) * f1;
	//  193  308:aload_0         
	//  194  309:getfield        #124 <Field float[] q>
	//  195  312:iconst_0        
	//  196  313:fconst_1        
	//  197  314:fload           4
	//  198  316:fsub            
	//  199  317:fload_1         
	//  200  318:fmul            
	//  201  319:fastore         
		q[1] = -f2 * (1.0F - f5);
	//  202  320:aload_0         
	//  203  321:getfield        #124 <Field float[] q>
	//  204  324:iconst_1        
	//  205  325:fload_2         
	//  206  326:fneg            
	//  207  327:fconst_1        
	//  208  328:fload           5
	//  209  330:fsub            
	//  210  331:fmul            
	//  211  332:fastore         
		q[2] = 0.0F;
	//  212  333:aload_0         
	//  213  334:getfield        #124 <Field float[] q>
	//  214  337:iconst_2        
	//  215  338:fconst_0        
	//  216  339:fastore         
		q[3] = 1.0F;
	//  217  340:aload_0         
	//  218  341:getfield        #124 <Field float[] q>
	//  219  344:iconst_3        
	//  220  345:fconst_1        
	//  221  346:fastore         
		Matrix.multiplyMV(r, 0, p, 0, q, 0);
	//  222  347:aload_0         
	//  223  348:getfield        #126 <Field float[] r>
	//  224  351:iconst_0        
	//  225  352:aload_0         
	//  226  353:getfield        #122 <Field float[] p>
	//  227  356:iconst_0        
	//  228  357:aload_0         
	//  229  358:getfield        #124 <Field float[] q>
	//  230  361:iconst_0        
	//  231  362:invokestatic    #216 <Method void Matrix.multiplyMV(float[], int, float[], int, float[], int)>
		s.union((int)((float)ipoint.x + r[0]), (int)((float)ipoint.y - r[1]));
	//  232  365:aload_0         
	//  233  366:getfield        #131 <Field Rect s>
	//  234  369:aload           6
	//  235  371:getfield        #218 <Field int IPoint.x>
	//  236  374:i2f             
	//  237  375:aload_0         
	//  238  376:getfield        #126 <Field float[] r>
	//  239  379:iconst_0        
	//  240  380:faload          
	//  241  381:fadd            
	//  242  382:f2i             
	//  243  383:aload           6
	//  244  385:getfield        #220 <Field int IPoint.y>
	//  245  388:i2f             
	//  246  389:aload_0         
	//  247  390:getfield        #126 <Field float[] r>
	//  248  393:iconst_1        
	//  249  394:faload          
	//  250  395:fsub            
	//  251  396:f2i             
	//  252  397:invokevirtual   #224 <Method void Rect.union(int, int)>
		q[0] = -f1 * f4;
	//  253  400:aload_0         
	//  254  401:getfield        #124 <Field float[] q>
	//  255  404:iconst_0        
	//  256  405:fload_1         
	//  257  406:fneg            
	//  258  407:fload           4
	//  259  409:fmul            
	//  260  410:fastore         
		q[1] = -f2 * (1.0F - f5);
	//  261  411:aload_0         
	//  262  412:getfield        #124 <Field float[] q>
	//  263  415:iconst_1        
	//  264  416:fload_2         
	//  265  417:fneg            
	//  266  418:fconst_1        
	//  267  419:fload           5
	//  268  421:fsub            
	//  269  422:fmul            
	//  270  423:fastore         
		q[2] = 0.0F;
	//  271  424:aload_0         
	//  272  425:getfield        #124 <Field float[] q>
	//  273  428:iconst_2        
	//  274  429:fconst_0        
	//  275  430:fastore         
		q[3] = 1.0F;
	//  276  431:aload_0         
	//  277  432:getfield        #124 <Field float[] q>
	//  278  435:iconst_3        
	//  279  436:fconst_1        
	//  280  437:fastore         
		Matrix.multiplyMV(r, 0, p, 0, q, 0);
	//  281  438:aload_0         
	//  282  439:getfield        #126 <Field float[] r>
	//  283  442:iconst_0        
	//  284  443:aload_0         
	//  285  444:getfield        #122 <Field float[] p>
	//  286  447:iconst_0        
	//  287  448:aload_0         
	//  288  449:getfield        #124 <Field float[] q>
	//  289  452:iconst_0        
	//  290  453:invokestatic    #216 <Method void Matrix.multiplyMV(float[], int, float[], int, float[], int)>
		s.union((int)((float)ipoint.x + r[0]), (int)((float)ipoint.y - r[1]));
	//  291  456:aload_0         
	//  292  457:getfield        #131 <Field Rect s>
	//  293  460:aload           6
	//  294  462:getfield        #218 <Field int IPoint.x>
	//  295  465:i2f             
	//  296  466:aload_0         
	//  297  467:getfield        #126 <Field float[] r>
	//  298  470:iconst_0        
	//  299  471:faload          
	//  300  472:fadd            
	//  301  473:f2i             
	//  302  474:aload           6
	//  303  476:getfield        #220 <Field int IPoint.y>
	//  304  479:i2f             
	//  305  480:aload_0         
	//  306  481:getfield        #126 <Field float[] r>
	//  307  484:iconst_1        
	//  308  485:faload          
	//  309  486:fsub            
	//  310  487:f2i             
	//  311  488:invokevirtual   #224 <Method void Rect.union(int, int)>
		k.a(s.left, s.right, s.top, s.bottom);
	//  312  491:aload_0         
	//  313  492:getfield        #98  <Field az k>
	//  314  495:aload_0         
	//  315  496:getfield        #131 <Field Rect s>
	//  316  499:getfield        #227 <Field int Rect.left>
	//  317  502:aload_0         
	//  318  503:getfield        #131 <Field Rect s>
	//  319  506:getfield        #230 <Field int Rect.right>
	//  320  509:aload_0         
	//  321  510:getfield        #131 <Field Rect s>
	//  322  513:getfield        #233 <Field int Rect.top>
	//  323  516:aload_0         
	//  324  517:getfield        #131 <Field Rect s>
	//  325  520:getfield        #236 <Field int Rect.bottom>
	//  326  523:invokevirtual   #238 <Method void az.a(int, int, int, int)>
	//  327  526:return          
	}

	private void a(MultiPointOverlayOptions multipointoverlayoptions)
	{
		if(multipointoverlayoptions != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          69
		{
			if(multipointoverlayoptions.getIcon() != null && multipointoverlayoptions.getIcon().getBitmap() != null && !multipointoverlayoptions.getIcon().getBitmap().isRecycled())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #243 <Method BitmapDescriptor MultiPointOverlayOptions.getIcon()>
	//*   4    8:ifnull          45
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #243 <Method BitmapDescriptor MultiPointOverlayOptions.getIcon()>
	//*   7   15:invokevirtual   #249 <Method Bitmap BitmapDescriptor.getBitmap()>
	//*   8   18:ifnull          45
	//*   9   21:aload_1         
	//*  10   22:invokevirtual   #243 <Method BitmapDescriptor MultiPointOverlayOptions.getIcon()>
	//*  11   25:invokevirtual   #249 <Method Bitmap BitmapDescriptor.getBitmap()>
	//*  12   28:invokevirtual   #255 <Method boolean Bitmap.isRecycled()>
	//*  13   31:ifne            45
				b = multipointoverlayoptions.getIcon();
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:invokevirtual   #243 <Method BitmapDescriptor MultiPointOverlayOptions.getIcon()>
	//   17   39:putfield        #76  <Field BitmapDescriptor b>
			else
	//*  18   42:goto            53
				b = a;
	//   19   45:aload_0         
	//   20   46:aload_0         
	//   21   47:getfield        #74  <Field BitmapDescriptor a>
	//   22   50:putfield        #76  <Field BitmapDescriptor b>
			f = multipointoverlayoptions.getAnchorU();
	//   23   53:aload_0         
	//   24   54:aload_1         
	//   25   55:invokevirtual   #259 <Method float MultiPointOverlayOptions.getAnchorU()>
	//   26   58:putfield        #85  <Field float f>
			g = multipointoverlayoptions.getAnchorV();
	//   27   61:aload_0         
	//   28   62:aload_1         
	//   29   63:invokevirtual   #262 <Method float MultiPointOverlayOptions.getAnchorV()>
	//   30   66:putfield        #87  <Field float g>
		}
	//   31   69:return          
	}

	private void a(MapConfig mapconfig)
	{
		if(mapconfig != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          70
		{
			mapconfig = ((MapConfig) (mapconfig.getGeoRectangle().getRect()));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #269 <Method Rectangle MapConfig.getGeoRectangle()>
	//    4    8:invokevirtual   #275 <Method Rect Rectangle.getRect()>
	//    5   11:astore_1        
			if(j == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #91  <Field az j>
	//*   8   16:ifnonnull       47
			{
				j = new az(((Rect) (mapconfig)).left, ((Rect) (mapconfig)).right, ((Rect) (mapconfig)).top, ((Rect) (mapconfig)).bottom);
	//    9   19:aload_0         
	//   10   20:new             #93  <Class az>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:getfield        #227 <Field int Rect.left>
	//   14   28:aload_1         
	//   15   29:getfield        #230 <Field int Rect.right>
	//   16   32:aload_1         
	//   17   33:getfield        #233 <Field int Rect.top>
	//   18   36:aload_1         
	//   19   37:getfield        #236 <Field int Rect.bottom>
	//   20   40:invokespecial   #96  <Method void az(int, int, int, int)>
	//   21   43:putfield        #91  <Field az j>
				return;
	//   22   46:return          
			}
			j.a(((Rect) (mapconfig)).left, ((Rect) (mapconfig)).right, ((Rect) (mapconfig)).top, ((Rect) (mapconfig)).bottom);
	//   23   47:aload_0         
	//   24   48:getfield        #91  <Field az j>
	//   25   51:aload_1         
	//   26   52:getfield        #227 <Field int Rect.left>
	//   27   55:aload_1         
	//   28   56:getfield        #230 <Field int Rect.right>
	//   29   59:aload_1         
	//   30   60:getfield        #233 <Field int Rect.top>
	//   31   63:aload_1         
	//   32   64:getfield        #236 <Field int Rect.bottom>
	//   33   67:invokevirtual   #238 <Method void az.a(int, int, int, int)>
		}
	//   34   70:return          
	}

	private float[] a()
	{
		if(C == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field float[] C>
	//*   2    4:ifnonnull       9
		{
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		} else
		{
			float af[] = (float[])((float []) (C)).clone();
	//    5    9:aload_0         
	//    6   10:getfield        #106 <Field float[] C>
	//    7   13:invokevirtual   #280 <Method Object _5B_F.clone()>
	//    8   16:checkcast       #276 <Class float[]>
	//    9   19:astore_3        
			float f1 = f - 0.5F;
	//   10   20:aload_0         
	//   11   21:getfield        #85  <Field float f>
	//   12   24:ldc1            #83  <Float 0.5F>
	//   13   26:fsub            
	//   14   27:fstore_1        
			float f2 = g - 0.5F;
	//   15   28:aload_0         
	//   16   29:getfield        #87  <Field float g>
	//   17   32:ldc1            #83  <Float 0.5F>
	//   18   34:fsub            
	//   19   35:fstore_2        
			af[0] = af[0] + f1;
	//   20   36:aload_3         
	//   21   37:iconst_0        
	//   22   38:aload_3         
	//   23   39:iconst_0        
	//   24   40:faload          
	//   25   41:fload_1         
	//   26   42:fadd            
	//   27   43:fastore         
			af[1] = af[1] - f2;
	//   28   44:aload_3         
	//   29   45:iconst_1        
	//   30   46:aload_3         
	//   31   47:iconst_1        
	//   32   48:faload          
	//   33   49:fload_2         
	//   34   50:fsub            
	//   35   51:fastore         
			af[6] = af[6] + f1;
	//   36   52:aload_3         
	//   37   53:bipush          6
	//   38   55:aload_3         
	//   39   56:bipush          6
	//   40   58:faload          
	//   41   59:fload_1         
	//   42   60:fadd            
	//   43   61:fastore         
			af[7] = af[7] - f2;
	//   44   62:aload_3         
	//   45   63:bipush          7
	//   46   65:aload_3         
	//   47   66:bipush          7
	//   48   68:faload          
	//   49   69:fload_2         
	//   50   70:fsub            
	//   51   71:fastore         
			af[12] = af[12] + f1;
	//   52   72:aload_3         
	//   53   73:bipush          12
	//   54   75:aload_3         
	//   55   76:bipush          12
	//   56   78:faload          
	//   57   79:fload_1         
	//   58   80:fadd            
	//   59   81:fastore         
			af[13] = af[13] - f2;
	//   60   82:aload_3         
	//   61   83:bipush          13
	//   62   85:aload_3         
	//   63   86:bipush          13
	//   64   88:faload          
	//   65   89:fload_2         
	//   66   90:fsub            
	//   67   91:fastore         
			af[18] = af[18] + f1;
	//   68   92:aload_3         
	//   69   93:bipush          18
	//   70   95:aload_3         
	//   71   96:bipush          18
	//   72   98:faload          
	//   73   99:fload_1         
	//   74  100:fadd            
	//   75  101:fastore         
			af[19] = af[19] - f2;
	//   76  102:aload_3         
	//   77  103:bipush          19
	//   78  105:aload_3         
	//   79  106:bipush          19
	//   80  108:faload          
	//   81  109:fload_2         
	//   82  110:fsub            
	//   83  111:fastore         
			return af;
	//   84  112:aload_3         
	//   85  113:areturn         
		}
	}

	private az b()
	{
		if(h == null || h.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #283 <Field List h>
	//*   2    4:ifnull          19
	//*   3    7:aload_0         
	//*   4    8:getfield        #283 <Field List h>
	//*   5   11:invokeinterface #287 <Method int List.size()>
	//*   6   16:ifne            21
			return null;
	//    7   19:aconst_null     
	//    8   20:areturn         
		Iterator iterator = h.iterator();
	//    9   21:aload_0         
	//   10   22:getfield        #283 <Field List h>
	//   11   25:invokeinterface #291 <Method Iterator List.iterator()>
	//   12   30:astore          10
		MultiPointItem multipointitem = (MultiPointItem)iterator.next();
	//   13   32:aload           10
	//   14   34:invokeinterface #296 <Method Object Iterator.next()>
	//   15   39:checkcast       #298 <Class MultiPointItem>
	//   16   42:astore          11
		int k2 = multipointitem.getIPoint().x;
	//   17   44:aload           11
	//   18   46:invokevirtual   #302 <Method IPoint MultiPointItem.getIPoint()>
	//   19   49:getfield        #218 <Field int IPoint.x>
	//   20   52:istore          7
		int i2 = multipointitem.getIPoint().x;
	//   21   54:aload           11
	//   22   56:invokevirtual   #302 <Method IPoint MultiPointItem.getIPoint()>
	//   23   59:getfield        #218 <Field int IPoint.x>
	//   24   62:istore          5
		int j1 = multipointitem.getIPoint().y;
	//   25   64:aload           11
	//   26   66:invokevirtual   #302 <Method IPoint MultiPointItem.getIPoint()>
	//   27   69:getfield        #220 <Field int IPoint.y>
	//   28   72:istore_2        
		int i1;
		int i3;
		for(i1 = multipointitem.getIPoint().y; iterator.hasNext(); i1 = i3)
	//*  29   73:aload           11
	//*  30   75:invokevirtual   #302 <Method IPoint MultiPointItem.getIPoint()>
	//*  31   78:getfield        #220 <Field int IPoint.y>
	//*  32   81:istore_1        
	//*  33   82:aload           10
	//*  34   84:invokeinterface #305 <Method boolean Iterator.hasNext()>
	//*  35   89:ifeq            192
		{
			MultiPointItem multipointitem1 = (MultiPointItem)iterator.next();
	//   36   92:aload           10
	//   37   94:invokeinterface #296 <Method Object Iterator.next()>
	//   38   99:checkcast       #298 <Class MultiPointItem>
	//   39  102:astore          11
			int l2 = multipointitem1.getIPoint().x;
	//   40  104:aload           11
	//   41  106:invokevirtual   #302 <Method IPoint MultiPointItem.getIPoint()>
	//   42  109:getfield        #218 <Field int IPoint.x>
	//   43  112:istore          8
			int k1 = multipointitem1.getIPoint().y;
	//   44  114:aload           11
	//   45  116:invokevirtual   #302 <Method IPoint MultiPointItem.getIPoint()>
	//   46  119:getfield        #220 <Field int IPoint.y>
	//   47  122:istore_3        
			int l1 = k2;
	//   48  123:iload           7
	//   49  125:istore          4
			if(l2 < k2)
	//*  50  127:iload           8
	//*  51  129:iload           7
	//*  52  131:icmpge          138
				l1 = l2;
	//   53  134:iload           8
	//   54  136:istore          4
			int j2 = i2;
	//   55  138:iload           5
	//   56  140:istore          6
			if(l2 > i2)
	//*  57  142:iload           8
	//*  58  144:iload           5
	//*  59  146:icmple          153
				j2 = l2;
	//   60  149:iload           8
	//   61  151:istore          6
			l2 = j1;
	//   62  153:iload_2         
	//   63  154:istore          8
			if(k1 < j1)
	//*  64  156:iload_3         
	//*  65  157:iload_2         
	//*  66  158:icmpge          164
				l2 = k1;
	//   67  161:iload_3         
	//   68  162:istore          8
			i3 = i1;
	//   69  164:iload_1         
	//   70  165:istore          9
			if(k1 > i1)
	//*  71  167:iload_3         
	//*  72  168:iload_1         
	//*  73  169:icmple          175
				i3 = k1;
	//   74  172:iload_3         
	//   75  173:istore          9
			k2 = l1;
	//   76  175:iload           4
	//   77  177:istore          7
			i2 = j2;
	//   78  179:iload           6
	//   79  181:istore          5
			j1 = l2;
	//   80  183:iload           8
	//   81  185:istore_2        
		}

	//   82  186:iload           9
	//   83  188:istore_1        
	//*  84  189:goto            82
		return new az(k2, i2, j1, i1);
	//   85  192:new             #93  <Class az>
	//   86  195:dup             
	//   87  196:iload           7
	//   88  198:iload           5
	//   89  200:iload_2         
	//   90  201:iload_1         
	//   91  202:invokespecial   #96  <Method void az(int, int, int, int)>
	//   92  205:areturn         
	}

	private void c()
	{
		if(F == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field ExecutorService F>
	//*   2    4:ifnonnull       50
		{
			LinkedBlockingQueue linkedblockingqueue = new LinkedBlockingQueue();
	//    3    7:new             #307 <Class LinkedBlockingQueue>
	//    4   10:dup             
	//    5   11:invokespecial   #308 <Method void LinkedBlockingQueue()>
	//    6   14:astore_1        
			F = ((ExecutorService) (new ThreadPoolExecutor(1, 2, 1L, TimeUnit.SECONDS, ((java.util.concurrent.BlockingQueue) (linkedblockingqueue)), ((java.util.concurrent.ThreadFactory) (new er("MultiPointOverlay"))), ((java.util.concurrent.RejectedExecutionHandler) (new java.util.concurrent.ThreadPoolExecutor.AbortPolicy())))));
	//    7   15:aload_0         
	//    8   16:new             #310 <Class ThreadPoolExecutor>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:iconst_2        
	//   12   22:lconst_1        
	//   13   23:getstatic       #316 <Field TimeUnit TimeUnit.SECONDS>
	//   14   26:aload_1         
	//   15   27:new             #318 <Class er>
	//   16   30:dup             
	//   17   31:ldc2            #320 <String "MultiPointOverlay">
	//   18   34:invokespecial   #323 <Method void er(String)>
	//   19   37:new             #325 <Class java.util.concurrent.ThreadPoolExecutor$AbortPolicy>
	//   20   40:dup             
	//   21   41:invokespecial   #326 <Method void java.util.concurrent.ThreadPoolExecutor$AbortPolicy()>
	//   22   44:invokespecial   #329 <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, java.util.concurrent.ThreadFactory, java.util.concurrent.RejectedExecutionHandler)>
	//   23   47:putfield        #112 <Field ExecutorService F>
		}
		Iterator iterator = o.iterator();
	//   24   50:aload_0         
	//   25   51:getfield        #110 <Field List o>
	//   26   54:invokeinterface #291 <Method Iterator List.iterator()>
	//   27   59:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//   28   60:aload_1         
	//   29   61:invokeinterface #305 <Method boolean Iterator.hasNext()>
	//   30   66:ifeq            163
			ay ay1 = (ay)iterator.next();
	//   31   69:aload_1         
	//   32   70:invokeinterface #296 <Method Object Iterator.next()>
	//   33   75:checkcast       #116 <Class ay>
	//   34   78:astore_2        
			if(ay1 != null && !ay1.b())
	//*  35   79:aload_2         
	//*  36   80:ifnull          160
	//*  37   83:aload_2         
	//*  38   84:invokevirtual   #331 <Method boolean ay.b()>
	//*  39   87:ifne            160
			{
				String s1 = (new StringBuilder()).append(((Object) (ay1)).hashCode()).append("").toString();
	//   40   90:new             #182 <Class StringBuilder>
	//   41   93:dup             
	//   42   94:invokespecial   #183 <Method void StringBuilder()>
	//   43   97:aload_2         
	//   44   98:invokevirtual   #334 <Method int Object.hashCode()>
	//   45  101:invokevirtual   #190 <Method StringBuilder StringBuilder.append(int)>
	//   46  104:ldc2            #336 <String "">
	//   47  107:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   48  110:invokevirtual   #194 <Method String StringBuilder.toString()>
	//   49  113:astore_3        
				if(!G.contains(((Object) (s1))))
	//*  50  114:aload_0         
	//*  51  115:getfield        #114 <Field List G>
	//*  52  118:aload_3         
	//*  53  119:invokeinterface #339 <Method boolean List.contains(Object)>
	//*  54  124:ifeq            130
	//*  55  127:goto            60
				{
					G.add(((Object) (s1)));
	//   56  130:aload_0         
	//   57  131:getfield        #114 <Field List G>
	//   58  134:aload_3         
	//   59  135:invokeinterface #179 <Method boolean List.add(Object)>
	//   60  140:pop             
					F.execute(new Runnable(ay1, s1) {

						public void run()
						{
							if(a.b())
						//*   0    0:aload_0         
						//*   1    1:getfield        #22  <Field ay a>
						//*   2    4:invokevirtual   #33  <Method boolean ay.b()>
						//*   3    7:ifeq            11
							{
								return;
						//    4   10:return          
							} else
							{
								a.a();
						//    5   11:aload_0         
						//    6   12:getfield        #22  <Field ay a>
						//    7   15:invokevirtual   #35  <Method void ay.a()>
								ba.a(c).remove(((Object) (b)));
						//    8   18:aload_0         
						//    9   19:getfield        #20  <Field ba c>
						//   10   22:invokestatic    #38  <Method List ba.a(ba)>
						//   11   25:aload_0         
						//   12   26:getfield        #24  <Field String b>
						//   13   29:invokeinterface #44  <Method boolean List.remove(Object)>
						//   14   34:pop             
								return;
						//   15   35:return          
							}
						}

						final ay a;
						final String b;
						final ba c;

			
			{
				c = ba.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ba c>
				a = ay1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field ay a>
				b = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field String b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Object()>
			//   11   19:return          
			}
					}
);
	//   61  141:aload_0         
	//   62  142:getfield        #112 <Field ExecutorService F>
	//   63  145:new             #8   <Class ba$1>
	//   64  148:dup             
	//   65  149:aload_0         
	//   66  150:aload_2         
	//   67  151:aload_3         
	//   68  152:invokespecial   #342 <Method void ba$1(ba, ay, String)>
	//   69  155:invokeinterface #348 <Method void ExecutorService.execute(Runnable)>
				}
			}
		} while(true);
	//   70  160:goto            60
	//   71  163:return          
	}

	private void d()
	{
		if(n != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field bb n>
	//*   2    4:ifnull          14
			n.d();
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field bb n>
	//    5   11:invokevirtual   #350 <Method void bb.d()>
	//    6   14:return          
	}

	public void addItem(MultiPointItem multipointitem)
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #353 <Method void d()>
	//    2    4:return          
	}

	public void addItems(List list)
	{
		int i1;
label0:
		{
			if(list != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			{
				int j1;
				IPoint ipoint;
				try
				{
					i1 = list.size();
	//    2    4:aload_1         
	//    3    5:invokeinterface #287 <Method int List.size()>
	//    4   10:istore_2        
				}
	//*   5   11:iload_2         
	//*   6   12:ifne            16
	//*   7   15:return          
	//*   8   16:aload_0         
	//*   9   17:monitorenter    
	//*  10   18:aload_0         
	//*  11   19:getfield        #283 <Field List h>
	//*  12   22:ifnonnull       36
	//*  13   25:aload_0         
	//*  14   26:new             #100 <Class ArrayList>
	//*  15   29:dup             
	//*  16   30:invokespecial   #101 <Method void ArrayList()>
	//*  17   33:putfield        #283 <Field List h>
	//*  18   36:aload_0         
	//*  19   37:getfield        #283 <Field List h>
	//*  20   40:invokeinterface #360 <Method void List.clear()>
	//*  21   45:aload_0         
	//*  22   46:getfield        #283 <Field List h>
	//*  23   49:aload_1         
	//*  24   50:invokeinterface #364 <Method boolean List.addAll(java.util.Collection)>
	//*  25   55:pop             
	//*  26   56:aload_0         
	//*  27   57:getfield        #283 <Field List h>
	//*  28   60:invokeinterface #287 <Method int List.size()>
	//*  29   65:istore_3        
	//*  30   66:iconst_0        
	//*  31   67:istore_2        
	//*  32   68:iload_2         
	//*  33   69:iload_3         
	//*  34   70:icmpge          154
	//*  35   73:aload_0         
	//*  36   74:getfield        #283 <Field List h>
	//*  37   77:astore_1        
	//*  38   78:aload_1         
	//*  39   79:ifnonnull       85
	//*  40   82:aload_0         
	//*  41   83:monitorexit     
	//*  42   84:return          
	//*  43   85:aload_0         
	//*  44   86:getfield        #283 <Field List h>
	//*  45   89:iload_2         
	//*  46   90:invokeinterface #368 <Method Object List.get(int)>
	//*  47   95:checkcast       #298 <Class MultiPointItem>
	//*  48   98:astore_1        
	//*  49   99:aload_1         
	//*  50  100:ifnull          280
	//*  51  103:aload_1         
	//*  52  104:invokevirtual   #372 <Method LatLng MultiPointItem.getLatLng()>
	//*  53  107:ifnull          280
	//*  54  110:aload_1         
	//*  55  111:invokevirtual   #302 <Method IPoint MultiPointItem.getIPoint()>
	//*  56  114:ifnonnull       280
	//*  57  117:new             #201 <Class IPoint>
	//*  58  120:dup             
	//*  59  121:invokespecial   #202 <Method void IPoint()>
	//*  60  124:astore          4
	//*  61  126:aload_1         
	//*  62  127:invokevirtual   #372 <Method LatLng MultiPointItem.getLatLng()>
	//*  63  130:getfield        #377 <Field double LatLng.longitude>
	//*  64  133:aload_1         
	//*  65  134:invokevirtual   #372 <Method LatLng MultiPointItem.getLatLng()>
	//*  66  137:getfield        #380 <Field double LatLng.latitude>
	//*  67  140:aload           4
	//*  68  142:invokestatic    #386 <Method void MapProjection.lonlat2Geo(double, double, IPoint)>
	//*  69  145:aload_1         
	//*  70  146:aload           4
	//*  71  148:invokevirtual   #390 <Method void MultiPointItem.setIPoint(IPoint)>
	//*  72  151:goto            280
	//*  73  154:aload_0         
	//*  74  155:getfield        #89  <Field bc i>
	//*  75  158:ifnonnull       182
	//*  76  161:aload_0         
	//*  77  162:invokespecial   #392 <Method az b()>
	//*  78  165:astore_1        
	//*  79  166:aload_1         
	//*  80  167:ifnull          182
	//*  81  170:aload_0         
	//*  82  171:new             #394 <Class bc>
	//*  83  174:dup             
	//*  84  175:aload_1         
	//*  85  176:invokespecial   #397 <Method void bc(az)>
	//*  86  179:putfield        #89  <Field bc i>
	//*  87  182:aload_0         
	//*  88  183:getfield        #283 <Field List h>
	//*  89  186:ifnull          253
	//*  90  189:aload_0         
	//*  91  190:getfield        #283 <Field List h>
	//*  92  193:invokeinterface #287 <Method int List.size()>
	//*  93  198:istore_3        
	//*  94  199:iconst_0        
	//*  95  200:istore_2        
	//*  96  201:iload_2         
	//*  97  202:iload_3         
	//*  98  203:icmpge          253
	//*  99  206:aload_0         
	//* 100  207:getfield        #283 <Field List h>
	//* 101  210:iload_2         
	//* 102  211:invokeinterface #368 <Method Object List.get(int)>
	//* 103  216:checkcast       #298 <Class MultiPointItem>
	//* 104  219:astore_1        
	//* 105  220:aload_1         
	//* 106  221:ifnull          246
	//* 107  224:aload_1         
	//* 108  225:invokevirtual   #302 <Method IPoint MultiPointItem.getIPoint()>
	//* 109  228:ifnull          246
	//* 110  231:aload_0         
	//* 111  232:getfield        #89  <Field bc i>
	//* 112  235:ifnull          246
	//* 113  238:aload_0         
	//* 114  239:getfield        #89  <Field bc i>
	//* 115  242:aload_1         
	//* 116  243:invokevirtual   #399 <Method void bc.a(MultiPointItem)>
	//* 117  246:iload_2         
	//* 118  247:iconst_1        
	//* 119  248:iadd            
	//* 120  249:istore_2        
	//* 121  250:goto            201
	//* 122  253:aload_0         
	//* 123  254:monitorexit     
	//* 124  255:goto            263
	//* 125  258:astore_1        
	//* 126  259:aload_0         
	//* 127  260:monitorexit     
	//* 128  261:aload_1         
	//* 129  262:athrow          
	//* 130  263:aload_0         
	//* 131  264:invokespecial   #353 <Method void d()>
	//* 132  267:return          
				// Misplaced declaration of an exception variable
				catch(List list)
	//* 133  268:astore_1        
				{
					hm.c(((Throwable) (list)), "MultiPointOverlayDelegate", "addItems");
	//  134  269:aload_1         
	//  135  270:ldc2            #401 <String "MultiPointOverlayDelegate">
	//  136  273:ldc2            #402 <String "addItems">
	//  137  276:invokestatic    #407 <Method void hm.c(Throwable, String, String)>
					return;
	//  138  279:return          
				}
				if(i1 != 0)
					break label0;
			}
			return;
		}
		this;
		JVM INSTR monitorenter ;
		if(h == null)
			h = ((List) (new ArrayList()));
		h.clear();
		h.addAll(((java.util.Collection) (list)));
		j1 = h.size();
		i1 = 0;
_L5:
		if(i1 >= j1)
			break MISSING_BLOCK_LABEL_154;
		list = h;
		if(list != null)
			break MISSING_BLOCK_LABEL_85;
		this;
		JVM INSTR monitorexit ;
		return;
		list = ((List) ((MultiPointItem)h.get(i1)));
		if(list == null)
			break MISSING_BLOCK_LABEL_280;
		if(((MultiPointItem) (list)).getLatLng() != null && ((MultiPointItem) (list)).getIPoint() == null)
		{
			ipoint = new IPoint();
			MapProjection.lonlat2Geo(((MultiPointItem) (list)).getLatLng().longitude, ((MultiPointItem) (list)).getLatLng().latitude, ipoint);
			((MultiPointItem) (list)).setIPoint(ipoint);
		}
		break MISSING_BLOCK_LABEL_280;
		if(i != null)
			break MISSING_BLOCK_LABEL_182;
		list = ((List) (b()));
		if(list == null)
			break MISSING_BLOCK_LABEL_182;
		i = new bc(((az) (list)));
		if(h == null)
			break MISSING_BLOCK_LABEL_253;
		j1 = h.size();
		i1 = 0;
_L3:
		if(i1 >= j1) goto _L2; else goto _L1
_L1:
		list = ((List) ((MultiPointItem)h.get(i1)));
		if(list == null)
			continue; /* Loop/switch isn't completed */
		if(((MultiPointItem) (list)).getIPoint() != null && i != null)
			i.a(((MultiPointItem) (list)));
		i1++;
		  goto _L3
		list;
		throw list;
_L2:
		d();
		return;
		i1++;
	//  139  280:iload_2         
	//  140  281:iconst_1        
	//  141  282:iadd            
	//  142  283:istore_2        
		if(true) goto _L5; else goto _L4
	//  143  284:goto            68
_L4:
	}

	public void destroy(boolean flag)
	{
		remove(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #414 <Method void remove(boolean)>
		if(b != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #76  <Field BitmapDescriptor b>
	//*   5    9:ifnull          19
			b.recycle();
	//    6   12:aload_0         
	//    7   13:getfield        #76  <Field BitmapDescriptor b>
	//    8   16:invokevirtual   #417 <Method void BitmapDescriptor.recycle()>
	//    9   19:return          
	}

	public void draw(MapConfig mapconfig, float af[], float af1[])
	{
		boolean flag = D;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field boolean D>
	//    2    4:istore          14
		if(!flag)
	//*   3    6:iload           14
	//*   4    8:ifne            12
			return;
	//    5   11:return          
		int i1;
		c();
	//    6   12:aload_0         
	//    7   13:invokespecial   #421 <Method void c()>
		i1 = o.size();
	//    8   16:aload_0         
	//    9   17:getfield        #110 <Field List o>
	//   10   20:invokeinterface #287 <Method int List.size()>
	//   11   25:istore          8
		if(i1 < 1)
	//*  12   27:iload           8
	//*  13   29:iconst_1        
	//*  14   30:icmpge          34
			return;
	//   15   33:return          
		Object obj = ((Object) (i));
	//   16   34:aload_0         
	//   17   35:getfield        #89  <Field bc i>
	//   18   38:astore          15
		if(obj == null)
	//*  19   40:aload           15
	//*  20   42:ifnonnull       46
			return;
	//   21   45:return          
		if(mapconfig == null)
	//*  22   46:aload_1         
	//*  23   47:ifnonnull       51
			return;
	//   24   50:return          
		float f1;
		float f2;
		f1 = mapconfig.getSR();
	//   25   51:aload_1         
	//   26   52:invokevirtual   #424 <Method float MapConfig.getSR()>
	//   27   55:fstore          6
		f2 = mapconfig.getSC();
	//   28   57:aload_1         
	//   29   58:invokevirtual   #427 <Method float MapConfig.getSC()>
	//   30   61:fstore          7
		if(mapconfig.getChangeRatio() == 1.0D && l.size() != 0)
			break MISSING_BLOCK_LABEL_210;
	//   31   63:aload_1         
	//   32   64:invokevirtual   #431 <Method double MapConfig.getChangeRatio()>
	//   33   67:dconst_1        
	//   34   68:dcmpl           
	//   35   69:ifne            84
	//   36   72:aload_0         
	//   37   73:getfield        #103 <Field List l>
	//   38   76:invokeinterface #287 <Method int List.size()>
	//   39   81:ifne            210
		obj = ((Object) (l));
	//   40   84:aload_0         
	//   41   85:getfield        #103 <Field List l>
	//   42   88:astore          15
		obj;
	//   43   90:aload           15
		JVM INSTR monitorenter ;
	//   44   92:monitorenter    
		a(mapconfig);
	//   45   93:aload_0         
	//   46   94:aload_1         
	//   47   95:invokespecial   #433 <Method void a(MapConfig)>
		l.clear();
	//   48   98:aload_0         
	//   49   99:getfield        #103 <Field List l>
	//   50  102:invokeinterface #360 <Method void List.clear()>
		c = mapconfig.getMapPerPixelUnitLength();
	//   51  107:aload_0         
	//   52  108:aload_1         
	//   53  109:invokevirtual   #436 <Method float MapConfig.getMapPerPixelUnitLength()>
	//   54  112:putfield        #78  <Field float c>
		d = c * (float)b.getWidth();
	//   55  115:aload_0         
	//   56  116:aload_0         
	//   57  117:getfield        #78  <Field float c>
	//   58  120:aload_0         
	//   59  121:getfield        #76  <Field BitmapDescriptor b>
	//   60  124:invokevirtual   #439 <Method int BitmapDescriptor.getWidth()>
	//   61  127:i2f             
	//   62  128:fmul            
	//   63  129:putfield        #80  <Field float d>
		e = c * (float)b.getHeight();
	//   64  132:aload_0         
	//   65  133:aload_0         
	//   66  134:getfield        #78  <Field float c>
	//   67  137:aload_0         
	//   68  138:getfield        #76  <Field BitmapDescriptor b>
	//   69  141:invokevirtual   #442 <Method int BitmapDescriptor.getHeight()>
	//   70  144:i2f             
	//   71  145:fmul            
	//   72  146:putfield        #82  <Field float e>
		double d1 = d * e * 16F;
	//   73  149:aload_0         
	//   74  150:getfield        #80  <Field float d>
	//   75  153:aload_0         
	//   76  154:getfield        #82  <Field float e>
	//   77  157:fmul            
	//   78  158:ldc2            #443 <Float 16F>
	//   79  161:fmul            
	//   80  162:f2d             
	//   81  163:dstore          4
		a(d, e, f1, f2);
	//   82  165:aload_0         
	//   83  166:aload_0         
	//   84  167:getfield        #80  <Field float d>
	//   85  170:aload_0         
	//   86  171:getfield        #82  <Field float e>
	//   87  174:fload           6
	//   88  176:fload           7
	//   89  178:invokespecial   #445 <Method void a(float, float, float, float)>
		i.a(j, ((java.util.Collection) (l)), d1);
	//   90  181:aload_0         
	//   91  182:getfield        #89  <Field bc i>
	//   92  185:aload_0         
	//   93  186:getfield        #91  <Field az j>
	//   94  189:aload_0         
	//   95  190:getfield        #103 <Field List l>
	//   96  193:dload           4
	//   97  195:invokevirtual   #448 <Method void bc.a(az, java.util.Collection, double)>
		obj;
	//   98  198:aload           15
		JVM INSTR monitorexit ;
	//   99  200:monitorexit     
		break MISSING_BLOCK_LABEL_210;
	//  100  201:goto            210
		mapconfig;
	//  101  204:astore_1        
	//* 102  205:aload           15
		int j1;
		int k1;
		int l1;
		int i2;
		int j2;
		int k2;
		ay ay1;
		Iterator iterator;
		IPoint ipoint;
		try
	//* 103  207:monitorexit     
		{
			throw mapconfig;
	//  104  208:aload_1         
	//  105  209:athrow          
		}
	//* 106  210:iconst_0        
	//* 107  211:istore          9
	//* 108  213:aload_0         
	//* 109  214:getfield        #450 <Field IPoint m>
	//* 110  217:ifnonnull       231
	//* 111  220:aload_0         
	//* 112  221:new             #201 <Class IPoint>
	//* 113  224:dup             
	//* 114  225:invokespecial   #202 <Method void IPoint()>
	//* 115  228:putfield        #450 <Field IPoint m>
	//* 116  231:aload_0         
	//* 117  232:getfield        #450 <Field IPoint m>
	//* 118  235:ifnull          264
	//* 119  238:aload_1         
	//* 120  239:ifnull          264
	//* 121  242:aload_0         
	//* 122  243:getfield        #450 <Field IPoint m>
	//* 123  246:aload_1         
	//* 124  247:invokevirtual   #453 <Method int MapConfig.getSX()>
	//* 125  250:putfield        #218 <Field int IPoint.x>
	//* 126  253:aload_0         
	//* 127  254:getfield        #450 <Field IPoint m>
	//* 128  257:aload_1         
	//* 129  258:invokevirtual   #456 <Method int MapConfig.getSY()>
	//* 130  261:putfield        #220 <Field int IPoint.y>
	//* 131  264:aload_0         
	//* 132  265:getfield        #110 <Field List o>
	//* 133  268:iconst_0        
	//* 134  269:invokeinterface #368 <Method Object List.get(int)>
	//* 135  274:checkcast       #116 <Class ay>
	//* 136  277:astore          15
	//* 137  279:aload_0         
	//* 138  280:getfield        #103 <Field List l>
	//* 139  283:astore_1        
	//* 140  284:aload_1         
	//* 141  285:monitorenter    
	//* 142  286:aload_0         
	//* 143  287:getfield        #103 <Field List l>
	//* 144  290:invokeinterface #291 <Method Iterator List.iterator()>
	//* 145  295:astore          16
	//* 146  297:aload           16
	//* 147  299:invokeinterface #305 <Method boolean Iterator.hasNext()>
	//* 148  304:ifeq            482
	//* 149  307:aload           16
	//* 150  309:invokeinterface #296 <Method Object Iterator.next()>
	//* 151  314:checkcast       #298 <Class MultiPointItem>
	//* 152  317:invokevirtual   #302 <Method IPoint MultiPointItem.getIPoint()>
	//* 153  320:astore          17
	//* 154  322:aload           17
	//* 155  324:ifnonnull       330
	//* 156  327:goto            297
	//* 157  330:aload           17
	//* 158  332:getfield        #218 <Field int IPoint.x>
	//* 159  335:istore          10
	//* 160  337:aload_0         
	//* 161  338:getfield        #450 <Field IPoint m>
	//* 162  341:getfield        #218 <Field int IPoint.x>
	//* 163  344:istore          11
	//* 164  346:aload           17
	//* 165  348:getfield        #220 <Field int IPoint.y>
	//* 166  351:istore          12
	//* 167  353:aload_0         
	//* 168  354:getfield        #450 <Field IPoint m>
	//* 169  357:getfield        #220 <Field int IPoint.y>
	//* 170  360:istore          13
	//* 171  362:iload           9
	//* 172  364:istore          8
	//* 173  366:aload           15
	//* 174  368:ifnull          475
	//* 175  371:iload           9
	//* 176  373:istore          8
	//* 177  375:aload           15
	//* 178  377:invokevirtual   #331 <Method boolean ay.b()>
	//* 179  380:ifeq            475
	//* 180  383:aload_0         
	//* 181  384:getfield        #120 <Field float[] H>
	//* 182  387:iload           9
	//* 183  389:iconst_3        
	//* 184  390:imul            
	//* 185  391:iconst_0        
	//* 186  392:iadd            
	//* 187  393:iload           10
	//* 188  395:iload           11
	//* 189  397:isub            
	//* 190  398:i2f             
	//* 191  399:fastore         
	//* 192  400:aload_0         
	//* 193  401:getfield        #120 <Field float[] H>
	//* 194  404:iload           9
	//* 195  406:iconst_3        
	//* 196  407:imul            
	//* 197  408:iconst_1        
	//* 198  409:iadd            
	//* 199  410:iload           12
	//* 200  412:iload           13
	//* 201  414:isub            
	//* 202  415:i2f             
	//* 203  416:fastore         
	//* 204  417:aload_0         
	//* 205  418:getfield        #120 <Field float[] H>
	//* 206  421:iload           9
	//* 207  423:iconst_3        
	//* 208  424:imul            
	//* 209  425:iconst_2        
	//* 210  426:iadd            
	//* 211  427:fconst_0        
	//* 212  428:fastore         
	//* 213  429:iload           9
	//* 214  431:iconst_1        
	//* 215  432:iadd            
	//* 216  433:istore          9
	//* 217  435:iload           9
	//* 218  437:istore          8
	//* 219  439:iload           9
	//* 220  441:getstatic       #118 <Field int ay.a>
	//* 221  444:icmplt          475
	//* 222  447:aload           15
	//* 223  449:aload_2         
	//* 224  450:aload_3         
	//* 225  451:aload_0         
	//* 226  452:getfield        #120 <Field float[] H>
	//* 227  455:aload_0         
	//* 228  456:getfield        #80  <Field float d>
	//* 229  459:aload_0         
	//* 230  460:getfield        #82  <Field float e>
	//* 231  463:fload           6
	//* 232  465:fload           7
	//* 233  467:iload           9
	//* 234  469:invokevirtual   #459 <Method void ay.a(float[], float[], float[], float, float, float, float, int)>
	//* 235  472:iconst_0        
	//* 236  473:istore          8
	//* 237  475:iload           8
	//* 238  477:istore          9
	//* 239  479:goto            297
	//* 240  482:aload_1         
	//* 241  483:monitorexit     
	//* 242  484:goto            492
	//* 243  487:astore_2        
	//* 244  488:aload_1         
	//* 245  489:monitorexit     
	//* 246  490:aload_2         
	//* 247  491:athrow          
	//* 248  492:iload           9
	//* 249  494:ifle            522
	//* 250  497:aload           15
	//* 251  499:aload_2         
	//* 252  500:aload_3         
	//* 253  501:aload_0         
	//* 254  502:getfield        #120 <Field float[] H>
	//* 255  505:aload_0         
	//* 256  506:getfield        #80  <Field float d>
	//* 257  509:aload_0         
	//* 258  510:getfield        #82  <Field float e>
	//* 259  513:fload           6
	//* 260  515:fload           7
	//* 261  517:iload           9
	//* 262  519:invokevirtual   #459 <Method void ay.a(float[], float[], float[], float, float, float, float, int)>
	//* 263  522:return          
		// Misplaced declaration of an exception variable
		catch(MapConfig mapconfig)
	//* 264  523:astore_1        
		{
			hm.c(((Throwable) (mapconfig)), "MultiPointOverlayDelegate", "draw");
	//  265  524:aload_1         
	//  266  525:ldc2            #401 <String "MultiPointOverlayDelegate">
	//  267  528:ldc2            #460 <String "draw">
	//  268  531:invokestatic    #407 <Method void hm.c(Throwable, String, String)>
		}
		break MISSING_BLOCK_LABEL_534;
		k1 = 0;
		if(m == null)
			m = new IPoint();
		if(m == null || mapconfig == null)
			break MISSING_BLOCK_LABEL_264;
		m.x = mapconfig.getSX();
		m.y = mapconfig.getSY();
		ay1 = (ay)o.get(0);
		mapconfig = ((MapConfig) (l));
		mapconfig;
		JVM INSTR monitorenter ;
		iterator = l.iterator();
_L2:
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_482;
			ipoint = ((MultiPointItem)iterator.next()).getIPoint();
		} while(ipoint == null);
		l1 = ipoint.x;
		i2 = m.x;
		j2 = ipoint.y;
		k2 = m.y;
		j1 = k1;
		if(ay1 == null)
			break MISSING_BLOCK_LABEL_475;
		j1 = k1;
		if(!ay1.b())
			break MISSING_BLOCK_LABEL_475;
		H[k1 * 3 + 0] = l1 - i2;
		H[k1 * 3 + 1] = j2 - k2;
		H[k1 * 3 + 2] = 0.0F;
		k1++;
		j1 = k1;
		if(k1 < ay.a)
			break MISSING_BLOCK_LABEL_475;
		ay1.a(af, af1, H, d, e, f1, f2, k1);
		j1 = 0;
		k1 = j1;
		if(true) goto _L2; else goto _L1
_L1:
		break MISSING_BLOCK_LABEL_492;
		af;
		throw af;
		if(k1 <= 0)
			break MISSING_BLOCK_LABEL_522;
		ay1.a(af, af1, H, d, e, f1, f2, k1);
		return;
	//  269  534:return          
	}

	public String getId()
		throws RemoteException
	{
		if(B == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #465 <Field String B>
	//*   2    4:ifnonnull       17
			B = a("MultiPointOverlay");
	//    3    7:aload_0         
	//    4    8:ldc2            #320 <String "MultiPointOverlay">
	//    5   11:invokestatic    #467 <Method String a(String)>
	//    6   14:putfield        #465 <Field String B>
		return B;
	//    7   17:aload_0         
	//    8   18:getfield        #465 <Field String B>
	//    9   21:areturn         
	}

	public MultiPointItem onClick(IPoint ipoint)
	{
		if(!D || i == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field boolean D>
	//*   2    4:ifeq            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #89  <Field bc i>
	//*   5   11:ifnonnull       16
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		if(t == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #133 <Field az t>
	//*  10   20:ifnonnull       38
			t = new az(0, 1, 0, 1);
	//   11   23:aload_0         
	//   12   24:new             #93  <Class az>
	//   13   27:dup             
	//   14   28:iconst_0        
	//   15   29:iconst_1        
	//   16   30:iconst_0        
	//   17   31:iconst_1        
	//   18   32:invokespecial   #96  <Method void az(int, int, int, int)>
	//   19   35:putfield        #133 <Field az t>
		int i1 = (int)(c * 8F);
	//   20   38:aload_0         
	//   21   39:getfield        #78  <Field float c>
	//   22   42:ldc2            #471 <Float 8F>
	//   23   45:fmul            
	//   24   46:f2i             
	//   25   47:istore_2        
		t.a(ipoint.x - i1, ipoint.x + i1, ipoint.y - i1, ipoint.y + i1);
	//   26   48:aload_0         
	//   27   49:getfield        #133 <Field az t>
	//   28   52:aload_1         
	//   29   53:getfield        #218 <Field int IPoint.x>
	//   30   56:iload_2         
	//   31   57:isub            
	//   32   58:aload_1         
	//   33   59:getfield        #218 <Field int IPoint.x>
	//   34   62:iload_2         
	//   35   63:iadd            
	//   36   64:aload_1         
	//   37   65:getfield        #220 <Field int IPoint.y>
	//   38   68:iload_2         
	//   39   69:isub            
	//   40   70:aload_1         
	//   41   71:getfield        #220 <Field int IPoint.y>
	//   42   74:iload_2         
	//   43   75:iadd            
	//   44   76:invokevirtual   #238 <Method void az.a(int, int, int, int)>
		ipoint = ((IPoint) (l));
	//   45   79:aload_0         
	//   46   80:getfield        #103 <Field List l>
	//   47   83:astore_1        
		ipoint;
	//   48   84:aload_1         
		JVM INSTR monitorenter ;
	//   49   85:monitorenter    
		int j1 = l.size() - 1;
	//   50   86:aload_0         
	//   51   87:getfield        #103 <Field List l>
	//   52   90:invokeinterface #287 <Method int List.size()>
	//   53   95:iconst_1        
	//   54   96:isub            
	//   55   97:istore_2        
_L3:
		if(j1 < 0) goto _L2; else goto _L1
	//   56   98:iload_2         
	//   57   99:iflt            256
_L1:
		MultiPointItem multipointitem;
		IPoint ipoint1;
		multipointitem = (MultiPointItem)l.get(j1);
	//   58  102:aload_0         
	//   59  103:getfield        #103 <Field List l>
	//   60  106:iload_2         
	//   61  107:invokeinterface #368 <Method Object List.get(int)>
	//   62  112:checkcast       #298 <Class MultiPointItem>
	//   63  115:astore          4
		ipoint1 = multipointitem.getIPoint();
	//   64  117:aload           4
	//   65  119:invokevirtual   #302 <Method IPoint MultiPointItem.getIPoint()>
	//   66  122:astore          5
		if(ipoint1 == null)
	//*  67  124:aload           5
	//*  68  126:ifnonnull       132
			continue; /* Loop/switch isn't completed */
	//   69  129:goto            249
		az az1 = k;
	//   70  132:aload_0         
	//   71  133:getfield        #98  <Field az k>
	//   72  136:astore          6
		if(az1 != null)
			break MISSING_BLOCK_LABEL_147;
	//   73  138:aload           6
	//   74  140:ifnonnull       147
		ipoint;
	//   75  143:aload_1         
		JVM INSTR monitorexit ;
	//   76  144:monitorexit     
		return null;
	//   77  145:aconst_null     
	//   78  146:areturn         
		boolean flag;
		if(u == null)
	//*  79  147:aload_0         
	//*  80  148:getfield        #135 <Field az u>
	//*  81  151:ifnonnull       169
			u = new az(0, 1, 0, 1);
	//   82  154:aload_0         
	//   83  155:new             #93  <Class az>
	//   84  158:dup             
	//   85  159:iconst_0        
	//   86  160:iconst_1        
	//   87  161:iconst_0        
	//   88  162:iconst_1        
	//   89  163:invokespecial   #96  <Method void az(int, int, int, int)>
	//   90  166:putfield        #135 <Field az u>
		u.a(ipoint1.x + k.a, ipoint1.x + k.c, ipoint1.y + k.b, ipoint1.y + k.d);
	//   91  169:aload_0         
	//   92  170:getfield        #135 <Field az u>
	//   93  173:aload           5
	//   94  175:getfield        #218 <Field int IPoint.x>
	//   95  178:aload_0         
	//   96  179:getfield        #98  <Field az k>
	//   97  182:getfield        #472 <Field int az.a>
	//   98  185:iadd            
	//   99  186:aload           5
	//  100  188:getfield        #218 <Field int IPoint.x>
	//  101  191:aload_0         
	//  102  192:getfield        #98  <Field az k>
	//  103  195:getfield        #474 <Field int az.c>
	//  104  198:iadd            
	//  105  199:aload           5
	//  106  201:getfield        #220 <Field int IPoint.y>
	//  107  204:aload_0         
	//  108  205:getfield        #98  <Field az k>
	//  109  208:getfield        #476 <Field int az.b>
	//  110  211:iadd            
	//  111  212:aload           5
	//  112  214:getfield        #220 <Field int IPoint.y>
	//  113  217:aload_0         
	//  114  218:getfield        #98  <Field az k>
	//  115  221:getfield        #478 <Field int az.d>
	//  116  224:iadd            
	//  117  225:invokevirtual   #238 <Method void az.a(int, int, int, int)>
		flag = u.a(t);
	//  118  228:aload_0         
	//  119  229:getfield        #135 <Field az u>
	//  120  232:aload_0         
	//  121  233:getfield        #133 <Field az t>
	//  122  236:invokevirtual   #481 <Method boolean az.a(az)>
	//  123  239:istore_3        
		if(!flag)
			continue; /* Loop/switch isn't completed */
	//  124  240:iload_3         
	//  125  241:ifeq            249
		ipoint;
	//  126  244:aload_1         
		JVM INSTR monitorexit ;
	//  127  245:monitorexit     
		return multipointitem;
	//  128  246:aload           4
	//  129  248:areturn         
	//  130  249:iload_2         
	//  131  250:iconst_1        
	//  132  251:isub            
	//  133  252:istore_2        
		  goto _L3
	//* 134  253:goto            98
_L2:
		ipoint;
	//  135  256:aload_1         
		JVM INSTR monitorexit ;
	//  136  257:monitorexit     
		  goto _L4
	//* 137  258:goto            268
		Exception exception;
		exception;
	//  138  261:astore          4
	//* 139  263:aload_1         
		throw exception;
	//  140  264:monitorexit     
	//  141  265:aload           4
	//  142  267:athrow          
_L4:
		return null;
	//  143  268:aconst_null     
	//  144  269:areturn         
	}

	public void remove(boolean flag)
	{
		D = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #108 <Field boolean D>
		v = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #137 <Field int v>
		w = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #139 <Field int w>
		if(a != null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #74  <Field BitmapDescriptor a>
	//*  11   19:ifnull          29
			a.recycle();
	//   12   22:aload_0         
	//   13   23:getfield        #74  <Field BitmapDescriptor a>
	//   14   26:invokevirtual   #417 <Method void BitmapDescriptor.recycle()>
		this;
	//   15   29:aload_0         
		JVM INSTR monitorenter ;
	//   16   30:monitorenter    
		if(h != null)
	//*  17   31:aload_0         
	//*  18   32:getfield        #283 <Field List h>
	//*  19   35:ifnull          52
		{
			h.clear();
	//   20   38:aload_0         
	//   21   39:getfield        #283 <Field List h>
	//   22   42:invokeinterface #360 <Method void List.clear()>
			h = null;
	//   23   47:aload_0         
	//   24   48:aconst_null     
	//   25   49:putfield        #283 <Field List h>
		}
		this;
	//   26   52:aload_0         
		JVM INSTR monitorexit ;
	//   27   53:monitorexit     
		  goto _L1
	//*  28   54:goto            62
		Exception exception;
		exception;
	//   29   57:astore_2        
	//*  30   58:aload_0         
		throw exception;
	//   31   59:monitorexit     
	//   32   60:aload_2         
	//   33   61:athrow          
_L1:
		if(i != null)
	//*  34   62:aload_0         
	//*  35   63:getfield        #89  <Field bc i>
	//*  36   66:ifnull          81
		{
			i.a();
	//   37   69:aload_0         
	//   38   70:getfield        #89  <Field bc i>
	//   39   73:invokevirtual   #483 <Method void bc.a()>
			i = null;
	//   40   76:aload_0         
	//   41   77:aconst_null     
	//   42   78:putfield        #89  <Field bc i>
		}
		if(l != null)
	//*  43   81:aload_0         
	//*  44   82:getfield        #103 <Field List l>
	//*  45   85:ifnull          97
			l.clear();
	//   46   88:aload_0         
	//   47   89:getfield        #103 <Field List l>
	//   48   92:invokeinterface #360 <Method void List.clear()>
		if(F != null)
	//*  49   97:aload_0         
	//*  50   98:getfield        #112 <Field ExecutorService F>
	//*  51  101:ifnull          119
		{
			F.shutdownNow();
	//   52  104:aload_0         
	//   53  105:getfield        #112 <Field ExecutorService F>
	//   54  108:invokeinterface #487 <Method List ExecutorService.shutdownNow()>
	//   55  113:pop             
			F = null;
	//   56  114:aload_0         
	//   57  115:aconst_null     
	//   58  116:putfield        #112 <Field ExecutorService F>
		}
		if(G != null)
	//*  59  119:aload_0         
	//*  60  120:getfield        #114 <Field List G>
	//*  61  123:ifnull          135
			G.clear();
	//   62  126:aload_0         
	//   63  127:getfield        #114 <Field List G>
	//   64  130:invokeinterface #360 <Method void List.clear()>
		if(o != null)
	//*  65  135:aload_0         
	//*  66  136:getfield        #110 <Field List o>
	//*  67  139:ifnull          191
		{
			Iterator iterator = o.iterator();
	//   68  142:aload_0         
	//   69  143:getfield        #110 <Field List o>
	//   70  146:invokeinterface #291 <Method Iterator List.iterator()>
	//   71  151:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//   72  152:aload_2         
	//   73  153:invokeinterface #305 <Method boolean Iterator.hasNext()>
	//   74  158:ifeq            182
				ay ay1 = (ay)iterator.next();
	//   75  161:aload_2         
	//   76  162:invokeinterface #296 <Method Object Iterator.next()>
	//   77  167:checkcast       #116 <Class ay>
	//   78  170:astore_3        
				if(ay1 != null)
	//*  79  171:aload_3         
	//*  80  172:ifnull          179
					ay1.c();
	//   81  175:aload_3         
	//   82  176:invokevirtual   #488 <Method void ay.c()>
			} while(true);
	//   83  179:goto            152
			o.clear();
	//   84  182:aload_0         
	//   85  183:getfield        #110 <Field List o>
	//   86  186:invokeinterface #360 <Method void List.clear()>
		}
		if(flag && n != null)
	//*  87  191:iload_1         
	//*  88  192:ifeq            217
	//*  89  195:aload_0         
	//*  90  196:getfield        #153 <Field bb n>
	//*  91  199:ifnull          217
		{
			n.a(this);
	//   92  202:aload_0         
	//   93  203:getfield        #153 <Field bb n>
	//   94  206:aload_0         
	//   95  207:invokevirtual   #491 <Method void bb.a(ba)>
			n.d();
	//   96  210:aload_0         
	//   97  211:getfield        #153 <Field bb n>
	//   98  214:invokevirtual   #350 <Method void bb.d()>
		}
		n = null;
	//   99  217:aload_0         
	//  100  218:aconst_null     
	//  101  219:putfield        #153 <Field bb n>
		C = null;
	//  102  222:aload_0         
	//  103  223:aconst_null     
	//  104  224:putfield        #106 <Field float[] C>
		return;
	//  105  227:return          
	}

	public void setAnchor(float f1, float f2)
	{
		f = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #85  <Field float f>
		g = f2;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #87  <Field float g>
		d();
	//    6   10:aload_0         
	//    7   11:invokespecial   #353 <Method void d()>
	//    8   14:return          
	}

	public void setVisible(boolean flag)
	{
		if(D != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field boolean D>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          12
			d();
	//    4    8:aload_0         
	//    5    9:invokespecial   #353 <Method void d()>
		D = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #108 <Field boolean D>
	//    9   17:return          
	}

	private static int E = 0;
	int A;
	private String B;
	private float C[] = {
		-0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 
		0.0F, 1.0F, 0.5F, 0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F, -0.5F, 
		0.0F, 0.0F, 1.0F, 0.0F
	};
	private boolean D;
	private ExecutorService F;
	private List G;
	private float H[];
	BitmapDescriptor a;
	BitmapDescriptor b;
	float c;
	float d;
	float e;
	float f;
	float g;
	List h;
	bc i;
	az j;
	az k;
	List l;
	IPoint m;
	bb n;
	List o;
	float p[];
	float q[];
	float r[];
	Rect s;
	az t;
	az u;
	int v;
	int w;
	float x[];
	String y;
	String z;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:putstatic       #61  <Field int E>
	//*   2    4:return          
	}
}
