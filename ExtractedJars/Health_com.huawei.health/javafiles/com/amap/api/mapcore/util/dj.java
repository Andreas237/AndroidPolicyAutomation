// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.*;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.RemoteException;
import android.util.Log;
import android.view.animation.AnimationUtils;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.model.*;
import com.amap.api.maps.model.animation.Animation;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.*;
import com.autonavi.amap.mapcore.animation.*;
import com.autonavi.amap.mapcore.interfaces.*;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.amap.api.mapcore.util:
//			k, db, y, s, 
//			ab, fd, hm, kl, 
//			eo

public class dj extends k
	implements db, IAnimation, IMarkerAction
{

	public dj(MarkerOptions markeroptions, y y1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #103 <Method void k()>
		h = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #105 <Field boolean h>
		i = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #107 <Field boolean i>
		j = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #109 <Field boolean j>
		k = 0.0F;
	//   11   19:aload_0         
	//   12   20:fconst_0        
	//   13   21:putfield        #111 <Field float k>
		l = 0.0F;
	//   14   24:aload_0         
	//   15   25:fconst_0        
	//   16   26:putfield        #113 <Field float l>
		m = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #115 <Field boolean m>
		n = 0;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #117 <Field int n>
		o = 0;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #119 <Field int o>
		p = 0;
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:putfield        #121 <Field int p>
		q = 0;
	//   29   49:aload_0         
	//   30   50:iconst_0        
	//   31   51:putfield        #123 <Field int q>
		t = FPoint.obtain();
	//   32   54:aload_0         
	//   33   55:invokestatic    #129 <Method FPoint FPoint.obtain()>
	//   34   58:putfield        #131 <Field FPoint t>
	//   35   61:aload_0         
	//   36   62:bipush          36
	//   37   64:newarray        float[]
	//   38   66:dup             
	//   39   67:iconst_0        
	//   40   68:ldc1            #132 <Float -1F>
	//   41   70:fastore         
	//   42   71:dup             
	//   43   72:iconst_1        
	//   44   73:ldc1            #132 <Float -1F>
	//   45   75:fastore         
	//   46   76:dup             
	//   47   77:iconst_2        
	//   48   78:fconst_0        
	//   49   79:fastore         
	//   50   80:dup             
	//   51   81:iconst_3        
	//   52   82:fconst_0        
	//   53   83:fastore         
	//   54   84:dup             
	//   55   85:iconst_4        
	//   56   86:fconst_0        
	//   57   87:fastore         
	//   58   88:dup             
	//   59   89:iconst_5        
	//   60   90:fconst_1        
	//   61   91:fastore         
	//   62   92:dup             
	//   63   93:bipush          6
	//   64   95:fconst_0        
	//   65   96:fastore         
	//   66   97:dup             
	//   67   98:bipush          7
	//   68  100:fconst_0        
	//   69  101:fastore         
	//   70  102:dup             
	//   71  103:bipush          8
	//   72  105:fconst_1        
	//   73  106:fastore         
	//   74  107:dup             
	//   75  108:bipush          9
	//   76  110:ldc1            #132 <Float -1F>
	//   77  112:fastore         
	//   78  113:dup             
	//   79  114:bipush          10
	//   80  116:fconst_1        
	//   81  117:fastore         
	//   82  118:dup             
	//   83  119:bipush          11
	//   84  121:fconst_0        
	//   85  122:fastore         
	//   86  123:dup             
	//   87  124:bipush          12
	//   88  126:fconst_0        
	//   89  127:fastore         
	//   90  128:dup             
	//   91  129:bipush          13
	//   92  131:fconst_1        
	//   93  132:fastore         
	//   94  133:dup             
	//   95  134:bipush          14
	//   96  136:fconst_1        
	//   97  137:fastore         
	//   98  138:dup             
	//   99  139:bipush          15
	//  100  141:fconst_0        
	//  101  142:fastore         
	//  102  143:dup             
	//  103  144:bipush          16
	//  104  146:fconst_0        
	//  105  147:fastore         
	//  106  148:dup             
	//  107  149:bipush          17
	//  108  151:fconst_1        
	//  109  152:fastore         
	//  110  153:dup             
	//  111  154:bipush          18
	//  112  156:fconst_1        
	//  113  157:fastore         
	//  114  158:dup             
	//  115  159:bipush          19
	//  116  161:fconst_1        
	//  117  162:fastore         
	//  118  163:dup             
	//  119  164:bipush          20
	//  120  166:fconst_0        
	//  121  167:fastore         
	//  122  168:dup             
	//  123  169:bipush          21
	//  124  171:fconst_0        
	//  125  172:fastore         
	//  126  173:dup             
	//  127  174:bipush          22
	//  128  176:fconst_1        
	//  129  177:fastore         
	//  130  178:dup             
	//  131  179:bipush          23
	//  132  181:fconst_0        
	//  133  182:fastore         
	//  134  183:dup             
	//  135  184:bipush          24
	//  136  186:fconst_0        
	//  137  187:fastore         
	//  138  188:dup             
	//  139  189:bipush          25
	//  140  191:fconst_0        
	//  141  192:fastore         
	//  142  193:dup             
	//  143  194:bipush          26
	//  144  196:fconst_1        
	//  145  197:fastore         
	//  146  198:dup             
	//  147  199:bipush          27
	//  148  201:fconst_1        
	//  149  202:fastore         
	//  150  203:dup             
	//  151  204:bipush          28
	//  152  206:ldc1            #132 <Float -1F>
	//  153  208:fastore         
	//  154  209:dup             
	//  155  210:bipush          29
	//  156  212:fconst_0        
	//  157  213:fastore         
	//  158  214:dup             
	//  159  215:bipush          30
	//  160  217:fconst_0        
	//  161  218:fastore         
	//  162  219:dup             
	//  163  220:bipush          31
	//  164  222:fconst_0        
	//  165  223:fastore         
	//  166  224:dup             
	//  167  225:bipush          32
	//  168  227:fconst_0        
	//  169  228:fastore         
	//  170  229:dup             
	//  171  230:bipush          33
	//  172  232:fconst_0        
	//  173  233:fastore         
	//  174  234:dup             
	//  175  235:bipush          34
	//  176  237:fconst_0        
	//  177  238:fastore         
	//  178  239:dup             
	//  179  240:bipush          35
	//  180  242:fconst_1        
	//  181  243:fastore         
	//  182  244:putfield        #134 <Field float[] u>
		v = 0.0F;
	//  183  247:aload_0         
	//  184  248:fconst_0        
	//  185  249:putfield        #136 <Field float v>
		w = 1.0F;
	//  186  252:aload_0         
	//  187  253:fconst_1        
	//  188  254:putfield        #138 <Field float w>
		x = 1.0F;
	//  189  257:aload_0         
	//  190  258:fconst_1        
	//  191  259:putfield        #140 <Field float x>
		y = 1.0F;
	//  192  262:aload_0         
	//  193  263:fconst_1        
	//  194  264:putfield        #142 <Field float y>
		A = false;
	//  195  267:aload_0         
	//  196  268:iconst_0        
	//  197  269:putfield        #144 <Field boolean A>
		B = true;
	//  198  272:aload_0         
	//  199  273:iconst_1        
	//  200  274:putfield        #146 <Field boolean B>
		C = 5;
	//  201  277:aload_0         
	//  202  278:iconst_5        
	//  203  279:putfield        #148 <Field int C>
		D = true;
	//  204  282:aload_0         
	//  205  283:iconst_1        
	//  206  284:putfield        #150 <Field boolean D>
		E = true;
	//  207  287:aload_0         
	//  208  288:iconst_1        
	//  209  289:putfield        #152 <Field boolean E>
		F = false;
	//  210  292:aload_0         
	//  211  293:iconst_0        
	//  212  294:putfield        #154 <Field boolean F>
		G = false;
	//  213  297:aload_0         
	//  214  298:iconst_0        
	//  215  299:putfield        #156 <Field boolean G>
		H = false;
	//  216  302:aload_0         
	//  217  303:iconst_0        
	//  218  304:putfield        #158 <Field boolean H>
		I = true;
	//  219  307:aload_0         
	//  220  308:iconst_1        
	//  221  309:putfield        #160 <Field boolean I>
		J = FPoint.obtain();
	//  222  312:aload_0         
	//  223  313:invokestatic    #129 <Method FPoint FPoint.obtain()>
	//  224  316:putfield        #162 <Field FPoint J>
		K = new Point();
	//  225  319:aload_0         
	//  226  320:new             #164 <Class Point>
	//  227  323:dup             
	//  228  324:invokespecial   #165 <Method void Point()>
	//  229  327:putfield        #167 <Field Point K>
		N = 0;
	//  230  330:aload_0         
	//  231  331:iconst_0        
	//  232  332:putfield        #169 <Field int N>
		O = 0;
	//  233  335:aload_0         
	//  234  336:iconst_0        
	//  235  337:putfield        #171 <Field int O>
		Q = null;
	//  236  340:aload_0         
	//  237  341:aconst_null     
	//  238  342:putfield        #173 <Field ab[] Q>
		c = new Rect(0, 0, 0, 0);
	//  239  345:aload_0         
	//  240  346:new             #175 <Class Rect>
	//  241  349:dup             
	//  242  350:iconst_0        
	//  243  351:iconst_0        
	//  244  352:iconst_0        
	//  245  353:iconst_0        
	//  246  354:invokespecial   #178 <Method void Rect(int, int, int, int)>
	//  247  357:putfield        #180 <Field Rect c>
		R = false;
	//  248  360:aload_0         
	//  249  361:iconst_0        
	//  250  362:putfield        #182 <Field boolean R>
		X = 0.5F;
	//  251  365:aload_0         
	//  252  366:ldc1            #183 <Float 0.5F>
	//  253  368:putfield        #185 <Field float X>
		Y = 1.0F;
	//  254  371:aload_0         
	//  255  372:fconst_1        
	//  256  373:putfield        #187 <Field float Y>
		Z = false;
	//  257  376:aload_0         
	//  258  377:iconst_0        
	//  259  378:putfield        #189 <Field boolean Z>
		aa = true;
	//  260  381:aload_0         
	//  261  382:iconst_1        
	//  262  383:putfield        #191 <Field boolean aa>
		ad = false;
	//  263  386:aload_0         
	//  264  387:iconst_0        
	//  265  388:putfield        #193 <Field boolean ad>
		ae = ((List) (new CopyOnWriteArrayList()));
	//  266  391:aload_0         
	//  267  392:new             #195 <Class CopyOnWriteArrayList>
	//  268  395:dup             
	//  269  396:invokespecial   #196 <Method void CopyOnWriteArrayList()>
	//  270  399:putfield        #198 <Field List ae>
		af = false;
	//  271  402:aload_0         
	//  272  403:iconst_0        
	//  273  404:putfield        #200 <Field boolean af>
		ag = false;
	//  274  407:aload_0         
	//  275  408:iconst_0        
	//  276  409:putfield        #202 <Field boolean ag>
		ah = true;
	//  277  412:aload_0         
	//  278  413:iconst_1        
	//  279  414:putfield        #204 <Field boolean ah>
		ai = 0;
	//  280  417:aload_0         
	//  281  418:iconst_0        
	//  282  419:putfield        #206 <Field int ai>
		aj = 20;
	//  283  422:aload_0         
	//  284  423:bipush          20
	//  285  425:putfield        #208 <Field int aj>
		ak = false;
	//  286  428:aload_0         
	//  287  429:iconst_0        
	//  288  430:putfield        #210 <Field boolean ak>
		an = 0L;
	//  289  433:aload_0         
	//  290  434:lconst_0        
	//  291  435:putfield        #212 <Field long an>
		f = new Object();
	//  292  438:aload_0         
	//  293  439:new             #214 <Class Object>
	//  294  442:dup             
	//  295  443:invokespecial   #215 <Method void Object()>
	//  296  446:putfield        #217 <Field Object f>
		ao = 3.402823E+38F;
	//  297  449:aload_0         
	//  298  450:ldc1            #218 <Float 3.402823E+38F>
	//  299  452:putfield        #220 <Field float ao>
		ap = 1.401298E-45F;
	//  300  455:aload_0         
	//  301  456:ldc1            #221 <Float 1.401298E-45F>
	//  302  458:putfield        #223 <Field float ap>
		aq = 1.401298E-45F;
	//  303  461:aload_0         
	//  304  462:ldc1            #221 <Float 1.401298E-45F>
	//  305  464:putfield        #225 <Field float aq>
		ar = 3.402823E+38F;
	//  306  467:aload_0         
	//  307  468:ldc1            #218 <Float 3.402823E+38F>
	//  308  470:putfield        #227 <Field float ar>
		ab = y1;
	//  309  473:aload_0         
	//  310  474:aload_2         
	//  311  475:putfield        #229 <Field y ab>
		setMarkerOptions(markeroptions);
	//  312  478:aload_0         
	//  313  479:aload_1         
	//  314  480:invokevirtual   #233 <Method void setMarkerOptions(MarkerOptions)>
	//  315  483:return          
	}

	private static String a(String s1)
	{
		g++;
	//    0    0:getstatic       #98  <Field int g>
	//    1    3:iconst_1        
	//    2    4:iadd            
	//    3    5:putstatic       #98  <Field int g>
		return (new StringBuilder()).append(s1).append(g).toString();
	//    4    8:new             #236 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #237 <Method void StringBuilder()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #241 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:getstatic       #98  <Field int g>
	//   10   22:invokevirtual   #244 <Method StringBuilder StringBuilder.append(int)>
	//   11   25:invokevirtual   #248 <Method String StringBuilder.toString()>
	//   12   28:areturn         
	}

	private void a(int i1, int j1)
	{
		r = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #251 <Field int r>
		s = j1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #253 <Field int s>
		DPoint dpoint = DPoint.obtain();
	//    6   10:invokestatic    #258 <Method DPoint DPoint.obtain()>
	//    7   13:astore_3        
		GLMapState.geo2LonLat(r, s, dpoint);
	//    8   14:aload_0         
	//    9   15:getfield        #251 <Field int r>
	//   10   18:aload_0         
	//   11   19:getfield        #253 <Field int s>
	//   12   22:aload_3         
	//   13   23:invokestatic    #264 <Method void GLMapState.geo2LonLat(int, int, DPoint)>
		T = new LatLng(dpoint.y, dpoint.x, false);
	//   14   26:aload_0         
	//   15   27:new             #266 <Class LatLng>
	//   16   30:dup             
	//   17   31:aload_3         
	//   18   32:getfield        #268 <Field double DPoint.y>
	//   19   35:aload_3         
	//   20   36:getfield        #270 <Field double DPoint.x>
	//   21   39:iconst_0        
	//   22   40:invokespecial   #273 <Method void LatLng(double, double, boolean)>
	//   23   43:putfield        #275 <Field LatLng T>
		if(ab != null && ab.d() != null)
	//*  24   46:aload_0         
	//*  25   47:getfield        #229 <Field y ab>
	//*  26   50:ifnull          119
	//*  27   53:aload_0         
	//*  28   54:getfield        #229 <Field y ab>
	//*  29   57:invokevirtual   #280 <Method s y.d()>
	//*  30   60:ifnull          119
		{
			t.x = r - ab.d().getMapConfig().getSX();
	//   31   63:aload_0         
	//   32   64:getfield        #131 <Field FPoint t>
	//   33   67:aload_0         
	//   34   68:getfield        #251 <Field int r>
	//   35   71:aload_0         
	//   36   72:getfield        #229 <Field y ab>
	//   37   75:invokevirtual   #280 <Method s y.d()>
	//   38   78:invokeinterface #286 <Method MapConfig s.getMapConfig()>
	//   39   83:invokevirtual   #292 <Method int MapConfig.getSX()>
	//   40   86:isub            
	//   41   87:i2f             
	//   42   88:putfield        #293 <Field float FPoint.x>
			t.y = s - ab.d().getMapConfig().getSY();
	//   43   91:aload_0         
	//   44   92:getfield        #131 <Field FPoint t>
	//   45   95:aload_0         
	//   46   96:getfield        #253 <Field int s>
	//   47   99:aload_0         
	//   48  100:getfield        #229 <Field y ab>
	//   49  103:invokevirtual   #280 <Method s y.d()>
	//   50  106:invokeinterface #286 <Method MapConfig s.getMapConfig()>
	//   51  111:invokevirtual   #296 <Method int MapConfig.getSY()>
	//   52  114:isub            
	//   53  115:i2f             
	//   54  116:putfield        #297 <Field float FPoint.y>
		}
		dpoint.recycle();
	//   55  119:aload_3         
	//   56  120:invokevirtual   #300 <Method void DPoint.recycle()>
		r();
	//   57  123:aload_0         
	//   58  124:invokespecial   #302 <Method void r()>
	//   59  127:return          
	}

	private void a(s s1, float f1, int i1, int j1)
		throws RemoteException
	{
		i1 = (int)(w * (float)i1);
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field float w>
	//    2    4:iload_3         
	//    3    5:i2f             
	//    4    6:fmul            
	//    5    7:f2i             
	//    6    8:istore_3        
		j1 = (int)(x * (float)j1);
	//    7    9:aload_0         
	//    8   10:getfield        #140 <Field float x>
	//    9   13:iload           4
	//   10   15:i2f             
	//   11   16:fmul            
	//   12   17:f2i             
	//   13   18:istore          4
		float f5 = (float)i1 * f1;
	//   14   20:iload_3         
	//   15   21:i2f             
	//   16   22:fload_2         
	//   17   23:fmul            
	//   18   24:fstore          8
		float f6 = (float)j1 * f1;
	//   19   26:iload           4
	//   20   28:i2f             
	//   21   29:fload_2         
	//   22   30:fmul            
	//   23   31:fstore          9
		float f7 = t.x;
	//   24   33:aload_0         
	//   25   34:getfield        #131 <Field FPoint t>
	//   26   37:getfield        #293 <Field float FPoint.x>
	//   27   40:fstore          10
		float f8 = t.y;
	//   28   42:aload_0         
	//   29   43:getfield        #131 <Field FPoint t>
	//   30   46:getfield        #297 <Field float FPoint.y>
	//   31   49:fstore          11
		float f3 = s1.getMapConfig().getSC();
	//   32   51:aload_1         
	//   33   52:invokeinterface #286 <Method MapConfig s.getMapConfig()>
	//   34   57:invokevirtual   #309 <Method float MapConfig.getSC()>
	//   35   60:fstore          6
		f1 = k;
	//   36   62:aload_0         
	//   37   63:getfield        #111 <Field float k>
	//   38   66:fstore_2        
		float f2 = f1;
	//   39   67:fload_2         
	//   40   68:fstore          5
		if(m)
	//*  41   70:aload_0         
	//*  42   71:getfield        #115 <Field boolean m>
	//*  43   74:ifeq            93
		{
			f2 = f1 - s1.getMapConfig().getSR();
	//   44   77:fload_2         
	//   45   78:aload_1         
	//   46   79:invokeinterface #286 <Method MapConfig s.getMapConfig()>
	//   47   84:invokevirtual   #312 <Method float MapConfig.getSR()>
	//   48   87:fsub            
	//   49   88:fstore          5
			f3 = 0.0F;
	//   50   90:fconst_0        
	//   51   91:fstore          6
		}
		float f4 = y;
	//   52   93:aload_0         
	//   53   94:getfield        #142 <Field float y>
	//   54   97:fstore          7
		f1 = f4;
	//   55   99:fload           7
	//   56  101:fstore_2        
		if(f4 < 0.0F)
	//*  57  102:fload           7
	//*  58  104:fconst_0        
	//*  59  105:fcmpg           
	//*  60  106:ifge            111
			f1 = 0.0F;
	//   61  109:fconst_0        
	//   62  110:fstore_2        
		f4 = f1;
	//   63  111:fload_2         
	//   64  112:fstore          7
		if(f1 > 1.0F)
	//*  65  114:fload_2         
	//*  66  115:fconst_1        
	//*  67  116:fcmpl           
	//*  68  117:ifle            123
			f4 = 1.0F;
	//   69  120:fconst_1        
	//   70  121:fstore          7
		u[0] = f7 - X * f5;
	//   71  123:aload_0         
	//   72  124:getfield        #134 <Field float[] u>
	//   73  127:iconst_0        
	//   74  128:fload           10
	//   75  130:aload_0         
	//   76  131:getfield        #185 <Field float X>
	//   77  134:fload           8
	//   78  136:fmul            
	//   79  137:fsub            
	//   80  138:fastore         
		u[1] = (1.0F - Y) * f6 + f8;
	//   81  139:aload_0         
	//   82  140:getfield        #134 <Field float[] u>
	//   83  143:iconst_1        
	//   84  144:fconst_1        
	//   85  145:aload_0         
	//   86  146:getfield        #187 <Field float Y>
	//   87  149:fsub            
	//   88  150:fload           9
	//   89  152:fmul            
	//   90  153:fload           11
	//   91  155:fadd            
	//   92  156:fastore         
		u[2] = f7;
	//   93  157:aload_0         
	//   94  158:getfield        #134 <Field float[] u>
	//   95  161:iconst_2        
	//   96  162:fload           10
	//   97  164:fastore         
		u[3] = f8;
	//   98  165:aload_0         
	//   99  166:getfield        #134 <Field float[] u>
	//  100  169:iconst_3        
	//  101  170:fload           11
	//  102  172:fastore         
		u[6] = f2;
	//  103  173:aload_0         
	//  104  174:getfield        #134 <Field float[] u>
	//  105  177:bipush          6
	//  106  179:fload           5
	//  107  181:fastore         
		u[7] = f3;
	//  108  182:aload_0         
	//  109  183:getfield        #134 <Field float[] u>
	//  110  186:bipush          7
	//  111  188:fload           6
	//  112  190:fastore         
		u[8] = f4;
	//  113  191:aload_0         
	//  114  192:getfield        #134 <Field float[] u>
	//  115  195:bipush          8
	//  116  197:fload           7
	//  117  199:fastore         
		u[9] = (1.0F - X) * f5 + f7;
	//  118  200:aload_0         
	//  119  201:getfield        #134 <Field float[] u>
	//  120  204:bipush          9
	//  121  206:fconst_1        
	//  122  207:aload_0         
	//  123  208:getfield        #185 <Field float X>
	//  124  211:fsub            
	//  125  212:fload           8
	//  126  214:fmul            
	//  127  215:fload           10
	//  128  217:fadd            
	//  129  218:fastore         
		u[10] = (1.0F - Y) * f6 + f8;
	//  130  219:aload_0         
	//  131  220:getfield        #134 <Field float[] u>
	//  132  223:bipush          10
	//  133  225:fconst_1        
	//  134  226:aload_0         
	//  135  227:getfield        #187 <Field float Y>
	//  136  230:fsub            
	//  137  231:fload           9
	//  138  233:fmul            
	//  139  234:fload           11
	//  140  236:fadd            
	//  141  237:fastore         
		u[11] = f7;
	//  142  238:aload_0         
	//  143  239:getfield        #134 <Field float[] u>
	//  144  242:bipush          11
	//  145  244:fload           10
	//  146  246:fastore         
		u[12] = f8;
	//  147  247:aload_0         
	//  148  248:getfield        #134 <Field float[] u>
	//  149  251:bipush          12
	//  150  253:fload           11
	//  151  255:fastore         
		u[15] = f2;
	//  152  256:aload_0         
	//  153  257:getfield        #134 <Field float[] u>
	//  154  260:bipush          15
	//  155  262:fload           5
	//  156  264:fastore         
		u[16] = f3;
	//  157  265:aload_0         
	//  158  266:getfield        #134 <Field float[] u>
	//  159  269:bipush          16
	//  160  271:fload           6
	//  161  273:fastore         
		u[17] = f4;
	//  162  274:aload_0         
	//  163  275:getfield        #134 <Field float[] u>
	//  164  278:bipush          17
	//  165  280:fload           7
	//  166  282:fastore         
		u[18] = (1.0F - X) * f5 + f7;
	//  167  283:aload_0         
	//  168  284:getfield        #134 <Field float[] u>
	//  169  287:bipush          18
	//  170  289:fconst_1        
	//  171  290:aload_0         
	//  172  291:getfield        #185 <Field float X>
	//  173  294:fsub            
	//  174  295:fload           8
	//  175  297:fmul            
	//  176  298:fload           10
	//  177  300:fadd            
	//  178  301:fastore         
		u[19] = f8 - Y * f6;
	//  179  302:aload_0         
	//  180  303:getfield        #134 <Field float[] u>
	//  181  306:bipush          19
	//  182  308:fload           11
	//  183  310:aload_0         
	//  184  311:getfield        #187 <Field float Y>
	//  185  314:fload           9
	//  186  316:fmul            
	//  187  317:fsub            
	//  188  318:fastore         
		u[20] = f7;
	//  189  319:aload_0         
	//  190  320:getfield        #134 <Field float[] u>
	//  191  323:bipush          20
	//  192  325:fload           10
	//  193  327:fastore         
		u[21] = f8;
	//  194  328:aload_0         
	//  195  329:getfield        #134 <Field float[] u>
	//  196  332:bipush          21
	//  197  334:fload           11
	//  198  336:fastore         
		u[24] = f2;
	//  199  337:aload_0         
	//  200  338:getfield        #134 <Field float[] u>
	//  201  341:bipush          24
	//  202  343:fload           5
	//  203  345:fastore         
		u[25] = f3;
	//  204  346:aload_0         
	//  205  347:getfield        #134 <Field float[] u>
	//  206  350:bipush          25
	//  207  352:fload           6
	//  208  354:fastore         
		u[26] = f4;
	//  209  355:aload_0         
	//  210  356:getfield        #134 <Field float[] u>
	//  211  359:bipush          26
	//  212  361:fload           7
	//  213  363:fastore         
		u[27] = f7 - X * f5;
	//  214  364:aload_0         
	//  215  365:getfield        #134 <Field float[] u>
	//  216  368:bipush          27
	//  217  370:fload           10
	//  218  372:aload_0         
	//  219  373:getfield        #185 <Field float X>
	//  220  376:fload           8
	//  221  378:fmul            
	//  222  379:fsub            
	//  223  380:fastore         
		u[28] = f8 - Y * f6;
	//  224  381:aload_0         
	//  225  382:getfield        #134 <Field float[] u>
	//  226  385:bipush          28
	//  227  387:fload           11
	//  228  389:aload_0         
	//  229  390:getfield        #187 <Field float Y>
	//  230  393:fload           9
	//  231  395:fmul            
	//  232  396:fsub            
	//  233  397:fastore         
		u[29] = f7;
	//  234  398:aload_0         
	//  235  399:getfield        #134 <Field float[] u>
	//  236  402:bipush          29
	//  237  404:fload           10
	//  238  406:fastore         
		u[30] = f8;
	//  239  407:aload_0         
	//  240  408:getfield        #134 <Field float[] u>
	//  241  411:bipush          30
	//  242  413:fload           11
	//  243  415:fastore         
		u[33] = f2;
	//  244  416:aload_0         
	//  245  417:getfield        #134 <Field float[] u>
	//  246  420:bipush          33
	//  247  422:fload           5
	//  248  424:fastore         
		u[34] = f3;
	//  249  425:aload_0         
	//  250  426:getfield        #134 <Field float[] u>
	//  251  429:bipush          34
	//  252  431:fload           6
	//  253  433:fastore         
		u[35] = f4;
	//  254  434:aload_0         
	//  255  435:getfield        #134 <Field float[] u>
	//  256  438:bipush          35
	//  257  440:fload           7
	//  258  442:fastore         
		if(ae != null && ae.size() > 0)
	//* 259  443:aload_0         
	//* 260  444:getfield        #198 <Field List ae>
	//* 261  447:ifnull          547
	//* 262  450:aload_0         
	//* 263  451:getfield        #198 <Field List ae>
	//* 264  454:invokeinterface #317 <Method int List.size()>
	//* 265  459:ifle            547
		{
			ai = ai + 1;
	//  266  462:aload_0         
	//  267  463:aload_0         
	//  268  464:getfield        #206 <Field int ai>
	//  269  467:iconst_1        
	//  270  468:iadd            
	//  271  469:putfield        #206 <Field int ai>
			i1 = aj;
	//  272  472:aload_0         
	//  273  473:getfield        #208 <Field int aj>
	//  274  476:istore_3        
			j1 = ae.size();
	//  275  477:aload_0         
	//  276  478:getfield        #198 <Field List ae>
	//  277  481:invokeinterface #317 <Method int List.size()>
	//  278  486:istore          4
			if(ai >= i1 * j1)
	//* 279  488:aload_0         
	//* 280  489:getfield        #206 <Field int ai>
	//* 281  492:iload_3         
	//* 282  493:iload           4
	//* 283  495:imul            
	//* 284  496:icmplt          504
				ai = 0;
	//  285  499:aload_0         
	//  286  500:iconst_0        
	//  287  501:putfield        #206 <Field int ai>
			if(aj == 0)
	//* 288  504:aload_0         
	//* 289  505:getfield        #208 <Field int aj>
	//* 290  508:ifne            516
				aj = 1;
	//  291  511:aload_0         
	//  292  512:iconst_1        
	//  293  513:putfield        #208 <Field int aj>
			i1 = ai / aj;
	//  294  516:aload_0         
	//  295  517:getfield        #206 <Field int ai>
	//  296  520:aload_0         
	//  297  521:getfield        #208 <Field int aj>
	//  298  524:idiv            
	//  299  525:istore_3        
			P = Q[i1];
	//  300  526:aload_0         
	//  301  527:aload_0         
	//  302  528:getfield        #173 <Field ab[] Q>
	//  303  531:iload_3         
	//  304  532:aaload          
	//  305  533:putfield        #319 <Field ab P>
			if(!ah)
	//* 306  536:aload_0         
	//* 307  537:getfield        #204 <Field boolean ah>
	//* 308  540:ifne            547
				r();
	//  309  543:aload_0         
	//  310  544:invokespecial   #302 <Method void r()>
		}
	//  311  547:return          
	}

	private void a(GLAnimation glanimation)
	{
		if(glanimation instanceof GLTranslateAnimation)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #323 <Class GLTranslateAnimation>
	//*   2    4:ifeq            200
		{
			if(ak)
	//*   3    7:aload_0         
	//*   4    8:getfield        #210 <Field boolean ak>
	//*   5   11:ifeq            35
			{
				T = getPosition();
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:invokevirtual   #327 <Method LatLng getPosition()>
	//    9   19:putfield        #275 <Field LatLng T>
				setPosition(T);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #275 <Field LatLng T>
	//   13   27:invokevirtual   #331 <Method void setPosition(LatLng)>
				ak = true;
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:putfield        #210 <Field boolean ak>
			}
			if(ak)
	//*  17   35:aload_0         
	//*  18   36:getfield        #210 <Field boolean ak>
	//*  19   39:ifeq            126
			{
				((GLTranslateAnimation)glanimation).mFromXDelta = al;
	//   20   42:aload_1         
	//   21   43:checkcast       #323 <Class GLTranslateAnimation>
	//   22   46:aload_0         
	//   23   47:getfield        #333 <Field int al>
	//   24   50:i2d             
	//   25   51:putfield        #336 <Field double GLTranslateAnimation.mFromXDelta>
				((GLTranslateAnimation)glanimation).mFromYDelta = am;
	//   26   54:aload_1         
	//   27   55:checkcast       #323 <Class GLTranslateAnimation>
	//   28   58:aload_0         
	//   29   59:getfield        #338 <Field int am>
	//   30   62:i2d             
	//   31   63:putfield        #341 <Field double GLTranslateAnimation.mFromYDelta>
				IPoint ipoint = IPoint.obtain();
	//   32   66:invokestatic    #346 <Method IPoint IPoint.obtain()>
	//   33   69:astore_2        
				ab.d().b(((GLTranslateAnimation)glanimation).mToYDelta, ((GLTranslateAnimation)glanimation).mToXDelta, ipoint);
	//   34   70:aload_0         
	//   35   71:getfield        #229 <Field y ab>
	//   36   74:invokevirtual   #280 <Method s y.d()>
	//   37   77:aload_1         
	//   38   78:checkcast       #323 <Class GLTranslateAnimation>
	//   39   81:getfield        #349 <Field double GLTranslateAnimation.mToYDelta>
	//   40   84:aload_1         
	//   41   85:checkcast       #323 <Class GLTranslateAnimation>
	//   42   88:getfield        #352 <Field double GLTranslateAnimation.mToXDelta>
	//   43   91:aload_2         
	//   44   92:invokeinterface #355 <Method void s.b(double, double, IPoint)>
				((GLTranslateAnimation)glanimation).mToXDelta = ipoint.x;
	//   45   97:aload_1         
	//   46   98:checkcast       #323 <Class GLTranslateAnimation>
	//   47  101:aload_2         
	//   48  102:getfield        #357 <Field int IPoint.x>
	//   49  105:i2d             
	//   50  106:putfield        #352 <Field double GLTranslateAnimation.mToXDelta>
				((GLTranslateAnimation)glanimation).mToYDelta = ipoint.y;
	//   51  109:aload_1         
	//   52  110:checkcast       #323 <Class GLTranslateAnimation>
	//   53  113:aload_2         
	//   54  114:getfield        #359 <Field int IPoint.y>
	//   55  117:i2d             
	//   56  118:putfield        #349 <Field double GLTranslateAnimation.mToYDelta>
				ipoint.recycle();
	//   57  121:aload_2         
	//   58  122:invokevirtual   #360 <Method void IPoint.recycle()>
				return;
	//   59  125:return          
			}
			((GLTranslateAnimation)glanimation).mFromXDelta = r;
	//   60  126:aload_1         
	//   61  127:checkcast       #323 <Class GLTranslateAnimation>
	//   62  130:aload_0         
	//   63  131:getfield        #251 <Field int r>
	//   64  134:i2d             
	//   65  135:putfield        #336 <Field double GLTranslateAnimation.mFromXDelta>
			((GLTranslateAnimation)glanimation).mFromYDelta = s;
	//   66  138:aload_1         
	//   67  139:checkcast       #323 <Class GLTranslateAnimation>
	//   68  142:aload_0         
	//   69  143:getfield        #253 <Field int s>
	//   70  146:i2d             
	//   71  147:putfield        #341 <Field double GLTranslateAnimation.mFromYDelta>
			IPoint ipoint1 = IPoint.obtain();
	//   72  150:invokestatic    #346 <Method IPoint IPoint.obtain()>
	//   73  153:astore_2        
			GLMapState.lonlat2Geo(((GLTranslateAnimation)glanimation).mToXDelta, ((GLTranslateAnimation)glanimation).mToYDelta, ipoint1);
	//   74  154:aload_1         
	//   75  155:checkcast       #323 <Class GLTranslateAnimation>
	//   76  158:getfield        #352 <Field double GLTranslateAnimation.mToXDelta>
	//   77  161:aload_1         
	//   78  162:checkcast       #323 <Class GLTranslateAnimation>
	//   79  165:getfield        #349 <Field double GLTranslateAnimation.mToYDelta>
	//   80  168:aload_2         
	//   81  169:invokestatic    #363 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
			((GLTranslateAnimation)glanimation).mToXDelta = ipoint1.x;
	//   82  172:aload_1         
	//   83  173:checkcast       #323 <Class GLTranslateAnimation>
	//   84  176:aload_2         
	//   85  177:getfield        #357 <Field int IPoint.x>
	//   86  180:i2d             
	//   87  181:putfield        #352 <Field double GLTranslateAnimation.mToXDelta>
			((GLTranslateAnimation)glanimation).mToYDelta = ipoint1.y;
	//   88  184:aload_1         
	//   89  185:checkcast       #323 <Class GLTranslateAnimation>
	//   90  188:aload_2         
	//   91  189:getfield        #359 <Field int IPoint.y>
	//   92  192:i2d             
	//   93  193:putfield        #349 <Field double GLTranslateAnimation.mToYDelta>
			ipoint1.recycle();
	//   94  196:aload_2         
	//   95  197:invokevirtual   #360 <Method void IPoint.recycle()>
		}
	//   96  200:return          
	}

	private void a(float af1[], int i1)
	{
		if(Q != null && Q.length > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #173 <Field ab[] Q>
	//*   2    4:ifnull          30
	//*   3    7:aload_0         
	//*   4    8:getfield        #173 <Field ab[] Q>
	//*   5   11:arraylength     
	//*   6   12:ifle            30
			System.arraycopy(((Object) (u)), 0, ((Object) (af1)), i1, u.length);
	//    7   15:aload_0         
	//    8   16:getfield        #134 <Field float[] u>
	//    9   19:iconst_0        
	//   10   20:aload_1         
	//   11   21:iload_2         
	//   12   22:aload_0         
	//   13   23:getfield        #134 <Field float[] u>
	//   14   26:arraylength     
	//   15   27:invokestatic    #370 <Method void System.arraycopy(Object, int, Object, int, int)>
	//   16   30:return          
	}

	private void a(FPoint afpoint[])
	{
		if(afpoint == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		v();
	//    3    5:aload_0         
	//    4    6:invokespecial   #373 <Method void v()>
		if(L > 0.0F && M > 0.0F && afpoint.length == 4)
	//*   5    9:aload_0         
	//*   6   10:getfield        #375 <Field float L>
	//*   7   13:fconst_0        
	//*   8   14:fcmpl           
	//*   9   15:ifle            368
	//*  10   18:aload_0         
	//*  11   19:getfield        #377 <Field float M>
	//*  12   22:fconst_0        
	//*  13   23:fcmpl           
	//*  14   24:ifle            368
	//*  15   27:aload_1         
	//*  16   28:arraylength     
	//*  17   29:iconst_4        
	//*  18   30:icmpne          368
		{
			ao = Math.min(afpoint[0].x, afpoint[1].x);
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:iconst_0        
	//   22   36:aaload          
	//   23   37:getfield        #293 <Field float FPoint.x>
	//   24   40:aload_1         
	//   25   41:iconst_1        
	//   26   42:aaload          
	//   27   43:getfield        #293 <Field float FPoint.x>
	//   28   46:invokestatic    #383 <Method float Math.min(float, float)>
	//   29   49:putfield        #220 <Field float ao>
			ao = Math.min(ao, afpoint[2].x);
	//   30   52:aload_0         
	//   31   53:aload_0         
	//   32   54:getfield        #220 <Field float ao>
	//   33   57:aload_1         
	//   34   58:iconst_2        
	//   35   59:aaload          
	//   36   60:getfield        #293 <Field float FPoint.x>
	//   37   63:invokestatic    #383 <Method float Math.min(float, float)>
	//   38   66:putfield        #220 <Field float ao>
			ao = Math.min(ao, afpoint[3].x);
	//   39   69:aload_0         
	//   40   70:aload_0         
	//   41   71:getfield        #220 <Field float ao>
	//   42   74:aload_1         
	//   43   75:iconst_3        
	//   44   76:aaload          
	//   45   77:getfield        #293 <Field float FPoint.x>
	//   46   80:invokestatic    #383 <Method float Math.min(float, float)>
	//   47   83:putfield        #220 <Field float ao>
			ap = Math.max(afpoint[0].x, afpoint[1].x);
	//   48   86:aload_0         
	//   49   87:aload_1         
	//   50   88:iconst_0        
	//   51   89:aaload          
	//   52   90:getfield        #293 <Field float FPoint.x>
	//   53   93:aload_1         
	//   54   94:iconst_1        
	//   55   95:aaload          
	//   56   96:getfield        #293 <Field float FPoint.x>
	//   57   99:invokestatic    #386 <Method float Math.max(float, float)>
	//   58  102:putfield        #223 <Field float ap>
			ap = Math.max(ap, afpoint[2].x);
	//   59  105:aload_0         
	//   60  106:aload_0         
	//   61  107:getfield        #223 <Field float ap>
	//   62  110:aload_1         
	//   63  111:iconst_2        
	//   64  112:aaload          
	//   65  113:getfield        #293 <Field float FPoint.x>
	//   66  116:invokestatic    #386 <Method float Math.max(float, float)>
	//   67  119:putfield        #223 <Field float ap>
			ap = Math.max(ap, afpoint[3].x);
	//   68  122:aload_0         
	//   69  123:aload_0         
	//   70  124:getfield        #223 <Field float ap>
	//   71  127:aload_1         
	//   72  128:iconst_3        
	//   73  129:aaload          
	//   74  130:getfield        #293 <Field float FPoint.x>
	//   75  133:invokestatic    #386 <Method float Math.max(float, float)>
	//   76  136:putfield        #223 <Field float ap>
			ar = Math.min(afpoint[0].y, afpoint[1].y);
	//   77  139:aload_0         
	//   78  140:aload_1         
	//   79  141:iconst_0        
	//   80  142:aaload          
	//   81  143:getfield        #297 <Field float FPoint.y>
	//   82  146:aload_1         
	//   83  147:iconst_1        
	//   84  148:aaload          
	//   85  149:getfield        #297 <Field float FPoint.y>
	//   86  152:invokestatic    #383 <Method float Math.min(float, float)>
	//   87  155:putfield        #227 <Field float ar>
			ar = Math.min(ar, afpoint[2].y);
	//   88  158:aload_0         
	//   89  159:aload_0         
	//   90  160:getfield        #227 <Field float ar>
	//   91  163:aload_1         
	//   92  164:iconst_2        
	//   93  165:aaload          
	//   94  166:getfield        #297 <Field float FPoint.y>
	//   95  169:invokestatic    #383 <Method float Math.min(float, float)>
	//   96  172:putfield        #227 <Field float ar>
			ar = Math.min(ar, afpoint[3].y);
	//   97  175:aload_0         
	//   98  176:aload_0         
	//   99  177:getfield        #227 <Field float ar>
	//  100  180:aload_1         
	//  101  181:iconst_3        
	//  102  182:aaload          
	//  103  183:getfield        #297 <Field float FPoint.y>
	//  104  186:invokestatic    #383 <Method float Math.min(float, float)>
	//  105  189:putfield        #227 <Field float ar>
			aq = Math.max(afpoint[0].y, afpoint[1].y);
	//  106  192:aload_0         
	//  107  193:aload_1         
	//  108  194:iconst_0        
	//  109  195:aaload          
	//  110  196:getfield        #297 <Field float FPoint.y>
	//  111  199:aload_1         
	//  112  200:iconst_1        
	//  113  201:aaload          
	//  114  202:getfield        #297 <Field float FPoint.y>
	//  115  205:invokestatic    #386 <Method float Math.max(float, float)>
	//  116  208:putfield        #225 <Field float aq>
			aq = Math.max(aq, afpoint[2].y);
	//  117  211:aload_0         
	//  118  212:aload_0         
	//  119  213:getfield        #225 <Field float aq>
	//  120  216:aload_1         
	//  121  217:iconst_2        
	//  122  218:aaload          
	//  123  219:getfield        #297 <Field float FPoint.y>
	//  124  222:invokestatic    #386 <Method float Math.max(float, float)>
	//  125  225:putfield        #225 <Field float aq>
			aq = Math.max(aq, afpoint[3].y);
	//  126  228:aload_0         
	//  127  229:aload_0         
	//  128  230:getfield        #225 <Field float aq>
	//  129  233:aload_1         
	//  130  234:iconst_3        
	//  131  235:aaload          
	//  132  236:getfield        #297 <Field float FPoint.y>
	//  133  239:invokestatic    #386 <Method float Math.max(float, float)>
	//  134  242:putfield        #225 <Field float aq>
			if(t.x < (ao + ap) / 2.0F)
	//* 135  245:aload_0         
	//* 136  246:getfield        #131 <Field FPoint t>
	//* 137  249:getfield        #293 <Field float FPoint.x>
	//* 138  252:aload_0         
	//* 139  253:getfield        #220 <Field float ao>
	//* 140  256:aload_0         
	//* 141  257:getfield        #223 <Field float ap>
	//* 142  260:fadd            
	//* 143  261:fconst_2        
	//* 144  262:fdiv            
	//* 145  263:fcmpg           
	//* 146  264:ifge            291
				J.x = t.x + L / 2.0F;
	//  147  267:aload_0         
	//  148  268:getfield        #162 <Field FPoint J>
	//  149  271:aload_0         
	//  150  272:getfield        #131 <Field FPoint t>
	//  151  275:getfield        #293 <Field float FPoint.x>
	//  152  278:aload_0         
	//  153  279:getfield        #375 <Field float L>
	//  154  282:fconst_2        
	//  155  283:fdiv            
	//  156  284:fadd            
	//  157  285:putfield        #293 <Field float FPoint.x>
			else
	//* 158  288:goto            312
				J.x = t.x - L / 2.0F;
	//  159  291:aload_0         
	//  160  292:getfield        #162 <Field FPoint J>
	//  161  295:aload_0         
	//  162  296:getfield        #131 <Field FPoint t>
	//  163  299:getfield        #293 <Field float FPoint.x>
	//  164  302:aload_0         
	//  165  303:getfield        #375 <Field float L>
	//  166  306:fconst_2        
	//  167  307:fdiv            
	//  168  308:fsub            
	//  169  309:putfield        #293 <Field float FPoint.x>
			if(t.y < (ar + aq) / 2.0F)
	//* 170  312:aload_0         
	//* 171  313:getfield        #131 <Field FPoint t>
	//* 172  316:getfield        #297 <Field float FPoint.y>
	//* 173  319:aload_0         
	//* 174  320:getfield        #227 <Field float ar>
	//* 175  323:aload_0         
	//* 176  324:getfield        #225 <Field float aq>
	//* 177  327:fadd            
	//* 178  328:fconst_2        
	//* 179  329:fdiv            
	//* 180  330:fcmpg           
	//* 181  331:ifge            349
			{
				J.y = t.y;
	//  182  334:aload_0         
	//  183  335:getfield        #162 <Field FPoint J>
	//  184  338:aload_0         
	//  185  339:getfield        #131 <Field FPoint t>
	//  186  342:getfield        #297 <Field float FPoint.y>
	//  187  345:putfield        #297 <Field float FPoint.y>
				return;
	//  188  348:return          
			}
			J.y = t.y - M;
	//  189  349:aload_0         
	//  190  350:getfield        #162 <Field FPoint J>
	//  191  353:aload_0         
	//  192  354:getfield        #131 <Field FPoint t>
	//  193  357:getfield        #297 <Field float FPoint.y>
	//  194  360:aload_0         
	//  195  361:getfield        #377 <Field float M>
	//  196  364:fsub            
	//  197  365:putfield        #297 <Field float FPoint.y>
		}
	//  198  368:return          
	}

	private void r()
	{
		if(ab.d() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #229 <Field y ab>
	//*   2    4:invokevirtual   #280 <Method s y.d()>
	//*   3    7:ifnull          23
			ab.d().setRunLowFrame(false);
	//    4   10:aload_0         
	//    5   11:getfield        #229 <Field y ab>
	//    6   14:invokevirtual   #280 <Method s y.d()>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #390 <Method void s.setRunLowFrame(boolean)>
	//    9   23:return          
	}

	private void s()
	{
		try
		{
			u[4] = P.b();
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field float[] u>
	//    2    4:iconst_4        
	//    3    5:aload_0         
	//    4    6:getfield        #319 <Field ab P>
	//    5    9:invokevirtual   #396 <Method float ab.b()>
	//    6   12:fastore         
			u[5] = P.d();
	//    7   13:aload_0         
	//    8   14:getfield        #134 <Field float[] u>
	//    9   17:iconst_5        
	//   10   18:aload_0         
	//   11   19:getfield        #319 <Field ab P>
	//   12   22:invokevirtual   #398 <Method float ab.d()>
	//   13   25:fastore         
			u[13] = P.c();
	//   14   26:aload_0         
	//   15   27:getfield        #134 <Field float[] u>
	//   16   30:bipush          13
	//   17   32:aload_0         
	//   18   33:getfield        #319 <Field ab P>
	//   19   36:invokevirtual   #400 <Method float ab.c()>
	//   20   39:fastore         
			u[14] = P.d();
	//   21   40:aload_0         
	//   22   41:getfield        #134 <Field float[] u>
	//   23   44:bipush          14
	//   24   46:aload_0         
	//   25   47:getfield        #319 <Field ab P>
	//   26   50:invokevirtual   #398 <Method float ab.d()>
	//   27   53:fastore         
			u[22] = P.c();
	//   28   54:aload_0         
	//   29   55:getfield        #134 <Field float[] u>
	//   30   58:bipush          22
	//   31   60:aload_0         
	//   32   61:getfield        #319 <Field ab P>
	//   33   64:invokevirtual   #400 <Method float ab.c()>
	//   34   67:fastore         
			u[23] = P.a();
	//   35   68:aload_0         
	//   36   69:getfield        #134 <Field float[] u>
	//   37   72:bipush          23
	//   38   74:aload_0         
	//   39   75:getfield        #319 <Field ab P>
	//   40   78:invokevirtual   #402 <Method float ab.a()>
	//   41   81:fastore         
			u[31] = P.b();
	//   42   82:aload_0         
	//   43   83:getfield        #134 <Field float[] u>
	//   44   86:bipush          31
	//   45   88:aload_0         
	//   46   89:getfield        #319 <Field ab P>
	//   47   92:invokevirtual   #396 <Method float ab.b()>
	//   48   95:fastore         
			u[32] = P.a();
	//   49   96:aload_0         
	//   50   97:getfield        #134 <Field float[] u>
	//   51  100:bipush          32
	//   52  102:aload_0         
	//   53  103:getfield        #319 <Field ab P>
	//   54  106:invokevirtual   #402 <Method float ab.a()>
	//   55  109:fastore         
			return;
	//   56  110:return          
		}
		catch(Throwable throwable)
	//*  57  111:astore_1        
		{
			throwable.printStackTrace();
	//   58  112:aload_1         
	//   59  113:invokevirtual   #405 <Method void Throwable.printStackTrace()>
		}
	//   60  116:return          
	}

	private void t()
	{
		if(I || d == null || d.hasEnded())
			break MISSING_BLOCK_LABEL_272;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field boolean I>
	//    2    4:ifne            272
	//    3    7:aload_0         
	//    4    8:getfield        #407 <Field GLAnimation d>
	//    5   11:ifnull          272
	//    6   14:aload_0         
	//    7   15:getfield        #407 <Field GLAnimation d>
	//    8   18:invokevirtual   #413 <Method boolean GLAnimation.hasEnded()>
	//    9   21:ifne            272
		r();
	//   10   24:aload_0         
	//   11   25:invokespecial   #302 <Method void r()>
		Object obj = f;
	//   12   28:aload_0         
	//   13   29:getfield        #217 <Field Object f>
	//   14   32:astore          5
		obj;
	//   15   34:aload           5
		JVM INSTR monitorenter ;
	//   16   36:monitorenter    
		GLTransformation gltransformation;
		gltransformation = new GLTransformation();
	//   17   37:new             #415 <Class GLTransformation>
	//   18   40:dup             
	//   19   41:invokespecial   #416 <Method void GLTransformation()>
	//   20   44:astore          6
		d.getTransformation(AnimationUtils.currentAnimationTimeMillis(), gltransformation);
	//   21   46:aload_0         
	//   22   47:getfield        #407 <Field GLAnimation d>
	//   23   50:invokestatic    #422 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//   24   53:aload           6
	//   25   55:invokevirtual   #426 <Method boolean GLAnimation.getTransformation(long, GLTransformation)>
	//   26   58:pop             
		if(gltransformation == null)
			break MISSING_BLOCK_LABEL_247;
	//   27   59:aload           6
	//   28   61:ifnull          247
		double d1;
		double d2;
		if(!Double.isNaN(gltransformation.scaleX) && !Double.isNaN(gltransformation.scaleY))
	//*  29   64:aload           6
	//*  30   66:getfield        #429 <Field double GLTransformation.scaleX>
	//*  31   69:invokestatic    #435 <Method boolean Double.isNaN(double)>
	//*  32   72:ifne            106
	//*  33   75:aload           6
	//*  34   77:getfield        #438 <Field double GLTransformation.scaleY>
	//*  35   80:invokestatic    #435 <Method boolean Double.isNaN(double)>
	//*  36   83:ifne            106
		{
			w = (float)gltransformation.scaleX;
	//   37   86:aload_0         
	//   38   87:aload           6
	//   39   89:getfield        #429 <Field double GLTransformation.scaleX>
	//   40   92:d2f             
	//   41   93:putfield        #138 <Field float w>
			x = (float)gltransformation.scaleY;
	//   42   96:aload_0         
	//   43   97:aload           6
	//   44   99:getfield        #438 <Field double GLTransformation.scaleY>
	//   45  102:d2f             
	//   46  103:putfield        #140 <Field float x>
		}
		if(!Double.isNaN(gltransformation.rotate))
	//*  47  106:aload           6
	//*  48  108:getfield        #441 <Field double GLTransformation.rotate>
	//*  49  111:invokestatic    #435 <Method boolean Double.isNaN(double)>
	//*  50  114:ifne            127
			setRotateAngle((float)gltransformation.rotate);
	//   51  117:aload_0         
	//   52  118:aload           6
	//   53  120:getfield        #441 <Field double GLTransformation.rotate>
	//   54  123:d2f             
	//   55  124:invokevirtual   #445 <Method void setRotateAngle(float)>
		if(Double.isNaN(gltransformation.x) || Double.isNaN(gltransformation.y))
			break MISSING_BLOCK_LABEL_226;
	//   56  127:aload           6
	//   57  129:getfield        #446 <Field double GLTransformation.x>
	//   58  132:invokestatic    #435 <Method boolean Double.isNaN(double)>
	//   59  135:ifne            226
	//   60  138:aload           6
	//   61  140:getfield        #447 <Field double GLTransformation.y>
	//   62  143:invokestatic    #435 <Method boolean Double.isNaN(double)>
	//   63  146:ifne            226
		d1 = gltransformation.x;
	//   64  149:aload           6
	//   65  151:getfield        #446 <Field double GLTransformation.x>
	//   66  154:dstore_1        
		d2 = gltransformation.y;
	//   67  155:aload           6
	//   68  157:getfield        #447 <Field double GLTransformation.y>
	//   69  160:dstore_3        
		if(ak)
	//*  70  161:aload_0         
	//*  71  162:getfield        #210 <Field boolean ak>
	//*  72  165:ifeq            218
		{
			IPoint ipoint = IPoint.obtain();
	//   73  168:invokestatic    #346 <Method IPoint IPoint.obtain()>
	//   74  171:astore          7
			ab.d().a((int)d1, (int)d2, ipoint);
	//   75  173:aload_0         
	//   76  174:getfield        #229 <Field y ab>
	//   77  177:invokevirtual   #280 <Method s y.d()>
	//   78  180:dload_1         
	//   79  181:d2i             
	//   80  182:dload_3         
	//   81  183:d2i             
	//   82  184:aload           7
	//   83  186:invokeinterface #450 <Method void s.a(int, int, IPoint)>
			a(ipoint.x, ipoint.y);
	//   84  191:aload_0         
	//   85  192:aload           7
	//   86  194:getfield        #357 <Field int IPoint.x>
	//   87  197:aload           7
	//   88  199:getfield        #359 <Field int IPoint.y>
	//   89  202:invokespecial   #452 <Method void a(int, int)>
			ipoint.recycle();
	//   90  205:aload           7
	//   91  207:invokevirtual   #360 <Method void IPoint.recycle()>
			ak = true;
	//   92  210:aload_0         
	//   93  211:iconst_1        
	//   94  212:putfield        #210 <Field boolean ak>
			break MISSING_BLOCK_LABEL_226;
	//   95  215:goto            226
		}
		a((int)d1, (int)d2);
	//   96  218:aload_0         
	//   97  219:dload_1         
	//   98  220:d2i             
	//   99  221:dload_3         
	//  100  222:d2i             
	//  101  223:invokespecial   #452 <Method void a(int, int)>
		if(!Double.isNaN(gltransformation.alpha))
	//* 102  226:aload           6
	//* 103  228:getfield        #455 <Field double GLTransformation.alpha>
	//* 104  231:invokestatic    #435 <Method boolean Double.isNaN(double)>
	//* 105  234:ifne            247
			y = (float)gltransformation.alpha;
	//  106  237:aload_0         
	//  107  238:aload           6
	//  108  240:getfield        #455 <Field double GLTransformation.alpha>
	//  109  243:d2f             
	//  110  244:putfield        #142 <Field float y>
		obj;
	//  111  247:aload           5
		JVM INSTR monitorexit ;
	//  112  249:monitorexit     
		  goto _L1
	//* 113  250:goto            261
		Exception exception;
		exception;
	//  114  253:astore          6
	//* 115  255:aload           5
		throw exception;
	//  116  257:monitorexit     
	//  117  258:aload           6
	//  118  260:athrow          
_L1:
		j = true;
	//  119  261:aload_0         
	//  120  262:iconst_1        
	//  121  263:putfield        #109 <Field boolean j>
		ah = false;
	//  122  266:aload_0         
	//  123  267:iconst_0        
	//  124  268:putfield        #204 <Field boolean ah>
		return;
	//  125  271:return          
		w = 1.0F;
	//  126  272:aload_0         
	//  127  273:fconst_1        
	//  128  274:putfield        #138 <Field float w>
		x = 1.0F;
	//  129  277:aload_0         
	//  130  278:fconst_1        
	//  131  279:putfield        #140 <Field float x>
		I = true;
	//  132  282:aload_0         
	//  133  283:iconst_1        
	//  134  284:putfield        #160 <Field boolean I>
		return;
	//  135  287:return          
	}

	private int u()
	{
		int ai1[] = new int[1];
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:astore_1        
		int[] _tmp = ai1;
	//    3    4:aload_1         
	//    4    5:dup             
	//    5    6:iconst_0        
	//    6    7:iconst_0        
	//    7    8:iastore         
	//    8    9:pop             
		ai1[0] = 0;
		GLES20.glGenTextures(1, ai1, 0);
	//    9   10:iconst_1        
	//   10   11:aload_1         
	//   11   12:iconst_0        
	//   12   13:invokestatic    #461 <Method void GLES20.glGenTextures(int, int[], int)>
		return ai1[0];
	//   13   16:aload_1         
	//   14   17:iconst_0        
	//   15   18:iaload          
	//   16   19:ireturn         
	}

	private void v()
	{
		if(ab.d() != null && ab.d().getMapConfig() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #229 <Field y ab>
	//*   2    4:invokevirtual   #280 <Method s y.d()>
	//*   3    7:ifnull          75
	//*   4   10:aload_0         
	//*   5   11:getfield        #229 <Field y ab>
	//*   6   14:invokevirtual   #280 <Method s y.d()>
	//*   7   17:invokeinterface #286 <Method MapConfig s.getMapConfig()>
	//*   8   22:ifnull          75
		{
			L = ab.d().getMapConfig().getMapPerPixelUnitLength() * (float)n();
	//    9   25:aload_0         
	//   10   26:aload_0         
	//   11   27:getfield        #229 <Field y ab>
	//   12   30:invokevirtual   #280 <Method s y.d()>
	//   13   33:invokeinterface #286 <Method MapConfig s.getMapConfig()>
	//   14   38:invokevirtual   #464 <Method float MapConfig.getMapPerPixelUnitLength()>
	//   15   41:aload_0         
	//   16   42:invokevirtual   #466 <Method int n()>
	//   17   45:i2f             
	//   18   46:fmul            
	//   19   47:putfield        #375 <Field float L>
			M = ab.d().getMapConfig().getMapPerPixelUnitLength() * (float)o();
	//   20   50:aload_0         
	//   21   51:aload_0         
	//   22   52:getfield        #229 <Field y ab>
	//   23   55:invokevirtual   #280 <Method s y.d()>
	//   24   58:invokeinterface #286 <Method MapConfig s.getMapConfig()>
	//   25   63:invokevirtual   #464 <Method float MapConfig.getMapPerPixelUnitLength()>
	//   26   66:aload_0         
	//   27   67:invokevirtual   #468 <Method int o()>
	//   28   70:i2f             
	//   29   71:fmul            
	//   30   72:putfield        #377 <Field float M>
		}
	//   31   75:return          
	}

	public FPoint a()
	{
		return t;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field FPoint t>
	//    2    4:areturn         
	}

	public void a(s s1)
	{
		if(ag)
			break MISSING_BLOCK_LABEL_421;
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field boolean ag>
	//    2    4:ifne            421
		this;
	//    3    7:aload_0         
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(ae == null)
			break MISSING_BLOCK_LABEL_408;
	//    5    9:aload_0         
	//    6   10:getfield        #198 <Field List ae>
	//    7   13:ifnull          391
		Q = new ab[ae.size()];
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #198 <Field List ae>
	//   11   21:invokeinterface #317 <Method int List.size()>
	//   12   26:anewarray       ab[]
	//   13   29:putfield        #173 <Field ab[] Q>
		int i1 = 0;
	//   14   32:iconst_0        
	//   15   33:istore_3        
		boolean flag;
		int j1;
		boolean flag1;
		Object obj;
		ab ab1;
		Iterator iterator;
		BitmapDescriptor bitmapdescriptor;
		if(android.os.Build.VERSION.SDK_INT >= 12)
	//*  16   34:getstatic       #474 <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   37:bipush          12
	//*  18   39:icmplt          422
			flag = true;
	//   19   42:iconst_1        
	//   20   43:istore_2        
		else
	//*  21   44:goto            47
	//*  22   47:aload_0         
	//*  23   48:getfield        #198 <Field List ae>
	//*  24   51:invokeinterface #478 <Method Iterator List.iterator()>
	//*  25   56:astore          8
	//*  26   58:aload           8
	//*  27   60:invokeinterface #483 <Method boolean Iterator.hasNext()>
	//*  28   65:ifeq            355
	//*  29   68:aload           8
	//*  30   70:invokeinterface #487 <Method Object Iterator.next()>
	//*  31   75:checkcast       #489 <Class BitmapDescriptor>
	//*  32   78:astore          9
	//*  33   80:aconst_null     
	//*  34   81:astore          6
	//*  35   83:iconst_0        
	//*  36   84:istore          5
	//*  37   86:iload           5
	//*  38   88:istore          4
	//*  39   90:iload_2         
	//*  40   91:ifeq            128
	//*  41   94:aload_1         
	//*  42   95:aload           9
	//*  43   97:invokeinterface #492 <Method ab s.a(BitmapDescriptor)>
	//*  44  102:astore          7
	//*  45  104:iload           5
	//*  46  106:istore          4
	//*  47  108:aload           7
	//*  48  110:astore          6
	//*  49  112:aload           7
	//*  50  114:ifnull          128
	//*  51  117:aload           7
	//*  52  119:invokevirtual   #494 <Method int ab.f()>
	//*  53  122:istore          4
	//*  54  124:aload           7
	//*  55  126:astore          6
	//*  56  128:aload           6
	//*  57  130:astore          7
	//*  58  132:aload           6
	//*  59  134:ifnonnull       150
	//*  60  137:new             #394 <Class ab>
	//*  61  140:dup             
	//*  62  141:aload           9
	//*  63  143:iload           4
	//*  64  145:invokespecial   #497 <Method void ab(BitmapDescriptor, int)>
	//*  65  148:astore          7
	//*  66  150:iload           4
	//*  67  152:ifne            335
	//*  68  155:aload           9
	//*  69  157:invokevirtual   #501 <Method Bitmap BitmapDescriptor.getBitmap()>
	//*  70  160:astore          6
	//*  71  162:aload           6
	//*  72  164:ifnull          335
	//*  73  167:aload           6
	//*  74  169:invokevirtual   #506 <Method boolean Bitmap.isRecycled()>
	//*  75  172:ifne            335
	//*  76  175:aload_0         
	//*  77  176:aload           6
	//*  78  178:invokevirtual   #509 <Method int Bitmap.getWidth()>
	//*  79  181:putfield        #169 <Field int N>
	//*  80  184:aload_0         
	//*  81  185:aload           6
	//*  82  187:invokevirtual   #512 <Method int Bitmap.getHeight()>
	//*  83  190:putfield        #171 <Field int O>
	//*  84  193:aload_0         
	//*  85  194:getfield        #229 <Field y ab>
	//*  86  197:invokevirtual   #280 <Method s y.d()>
	//*  87  200:invokeinterface #514 <Method int s.e()>
	//*  88  205:istore          4
	//*  89  207:iload           4
	//*  90  209:ifne            249
	//*  91  212:aload_0         
	//*  92  213:invokespecial   #516 <Method int u()>
	//*  93  216:istore          4
	//*  94  218:aload           7
	//*  95  220:iload           4
	//*  96  222:invokevirtual   #519 <Method void ab.a(int)>
	//*  97  225:iload_2         
	//*  98  226:ifeq            237
	//*  99  229:aload_1         
	//* 100  230:aload           7
	//* 101  232:invokeinterface #522 <Method void s.a(ab)>
	//* 102  237:iload           4
	//* 103  239:aload           6
	//* 104  241:iconst_0        
	//* 105  242:invokestatic    #527 <Method int fd.b(int, Bitmap, boolean)>
	//* 106  245:pop             
	//* 107  246:goto            335
	//* 108  249:aload_0         
	//* 109  250:getfield        #229 <Field y ab>
	//* 110  253:aload           6
	//* 111  255:aload           7
	//* 112  257:invokevirtual   #530 <Method boolean y.a(Bitmap, ab)>
	//* 113  260:ifeq            301
	//* 114  263:iload           4
	//* 115  265:aload           6
	//* 116  267:aload           7
	//* 117  269:invokevirtual   #396 <Method float ab.b()>
	//* 118  272:ldc2            #531 <Float 512F>
	//* 119  275:fmul            
	//* 120  276:f2i             
	//* 121  277:aload           7
	//* 122  279:invokevirtual   #402 <Method float ab.a()>
	//* 123  282:ldc2            #532 <Float 1024F>
	//* 124  285:fmul            
	//* 125  286:f2i             
	//* 126  287:invokestatic    #535 <Method int fd.a(int, Bitmap, int, int)>
	//* 127  290:pop             
	//* 128  291:aload           7
	//* 129  293:iload           4
	//* 130  295:invokevirtual   #519 <Method void ab.a(int)>
	//* 131  298:goto            323
	//* 132  301:aload_0         
	//* 133  302:invokespecial   #516 <Method int u()>
	//* 134  305:istore          4
	//* 135  307:iload           4
	//* 136  309:aload           6
	//* 137  311:iconst_0        
	//* 138  312:invokestatic    #527 <Method int fd.b(int, Bitmap, boolean)>
	//* 139  315:pop             
	//* 140  316:aload           7
	//* 141  318:iload           4
	//* 142  320:invokevirtual   #519 <Method void ab.a(int)>
	//* 143  323:iload_2         
	//* 144  324:ifeq            335
	//* 145  327:aload_1         
	//* 146  328:aload           7
	//* 147  330:invokeinterface #522 <Method void s.a(ab)>
	//* 148  335:aload           7
	//* 149  337:invokevirtual   #537 <Method void ab.g()>
	//* 150  340:aload_0         
	//* 151  341:getfield        #173 <Field ab[] Q>
	//* 152  344:iload_3         
	//* 153  345:aload           7
	//* 154  347:aastore         
	//* 155  348:iload_3         
	//* 156  349:iconst_1        
	//* 157  350:iadd            
	//* 158  351:istore_3        
	//* 159  352:goto            58
	//* 160  355:aload_0         
	//* 161  356:getfield        #198 <Field List ae>
	//* 162  359:invokeinterface #317 <Method int List.size()>
	//* 163  364:iconst_1        
	//* 164  365:icmpne          376
	//* 165  368:aload_0         
	//* 166  369:iconst_1        
	//* 167  370:putfield        #204 <Field boolean ah>
	//* 168  373:goto            381
	//* 169  376:aload_0         
	//* 170  377:iconst_0        
	//* 171  378:putfield        #204 <Field boolean ah>
	//* 172  381:aload_0         
	//* 173  382:iconst_0        
	//* 174  383:putfield        #154 <Field boolean F>
	//* 175  386:aload_0         
	//* 176  387:iconst_1        
	//* 177  388:putfield        #202 <Field boolean ag>
	//* 178  391:goto            408
	//* 179  394:astore_1        
	//* 180  395:aload_1         
	//* 181  396:ldc2            #539 <String "MarkerDelegateImp">
	//* 182  399:ldc2            #541 <String "loadtexture">
	//* 183  402:invokestatic    #546 <Method void hm.c(Throwable, String, String)>
	//* 184  405:aload_0         
	//* 185  406:monitorexit     
	//* 186  407:return          
	//* 187  408:aload_0         
	//* 188  409:invokevirtual   #548 <Method boolean p()>
	//* 189  412:pop             
	//* 190  413:aload_0         
	//* 191  414:monitorexit     
	//* 192  415:return          
	//* 193  416:astore_1        
	//* 194  417:aload_0         
	//* 195  418:monitorexit     
	//* 196  419:aload_1         
	//* 197  420:athrow          
	//* 198  421:return          
			flag = false;
	//  199  422:iconst_0        
	//  200  423:istore_2        
		iterator = ae.iterator();
_L1:
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_355;
		bitmapdescriptor = (BitmapDescriptor)iterator.next();
		obj = null;
		flag1 = false;
		j1 = ((int) (flag1));
		if(!flag)
			break MISSING_BLOCK_LABEL_128;
		ab1 = s1.a(bitmapdescriptor);
		j1 = ((int) (flag1));
		obj = ((Object) (ab1));
		if(ab1 == null)
			break MISSING_BLOCK_LABEL_128;
		j1 = ab1.f();
		obj = ((Object) (ab1));
		ab1 = ((ab) (obj));
		if(obj != null)
			break MISSING_BLOCK_LABEL_150;
		ab1 = new ab(bitmapdescriptor, j1);
		if(j1 != 0)
			break MISSING_BLOCK_LABEL_335;
		obj = ((Object) (bitmapdescriptor.getBitmap()));
		if(obj == null)
			break MISSING_BLOCK_LABEL_335;
		if(((Bitmap) (obj)).isRecycled())
			break MISSING_BLOCK_LABEL_335;
		N = ((Bitmap) (obj)).getWidth();
		O = ((Bitmap) (obj)).getHeight();
		j1 = ab.d().e();
		if(j1 != 0)
			break MISSING_BLOCK_LABEL_249;
		j1 = u();
		ab1.a(j1);
		if(!flag)
			break MISSING_BLOCK_LABEL_237;
		s1.a(ab1);
		fd.b(j1, ((Bitmap) (obj)), false);
		break MISSING_BLOCK_LABEL_335;
		if(ab.a(((Bitmap) (obj)), ab1))
		{
			fd.a(j1, ((Bitmap) (obj)), (int)(ab1.b() * 512F), (int)(ab1.a() * 1024F));
			ab1.a(j1);
			break MISSING_BLOCK_LABEL_323;
		}
		int k1 = u();
		fd.b(k1, ((Bitmap) (obj)), false);
		ab1.a(k1);
		if(!flag)
			break MISSING_BLOCK_LABEL_335;
		s1.a(ab1);
		ab1.g();
		Q[i1] = ab1;
		i1++;
		  goto _L1
		if(ae.size() == 1)
		{
			ah = true;
			break MISSING_BLOCK_LABEL_381;
		}
		ah = false;
		F = false;
		ag = true;
		break MISSING_BLOCK_LABEL_408;
		s1;
		hm.c(((Throwable) (s1)), "MarkerDelegateImp", "loadtexture");
		this;
		JVM INSTR monitorexit ;
		return;
		p();
		this;
		JVM INSTR monitorexit ;
		return;
		s1;
		throw s1;
	//* 201  424:goto            47
	}

	public void a(s s1, float af1[], int i1, float f1)
	{
		boolean flag;
		if(R || T == null && !ak || ae == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field boolean R>
	//*   2    4:ifne            28
	//*   3    7:aload_0         
	//*   4    8:getfield        #275 <Field LatLng T>
	//*   5   11:ifnonnull       21
	//*   6   14:aload_0         
	//*   7   15:getfield        #210 <Field boolean ak>
	//*   8   18:ifeq            28
	//*   9   21:aload_0         
	//*  10   22:getfield        #198 <Field List ae>
	//*  11   25:ifnonnull       34
			flag = true;
	//   12   28:iconst_1        
	//   13   29:istore          5
		else
	//*  14   31:goto            37
			flag = false;
	//   15   34:iconst_0        
	//   16   35:istore          5
		if(flag)
	//*  17   37:iload           5
	//*  18   39:ifeq            43
			return;
	//   19   42:return          
		try
		{
			if(!h)
	//*  20   43:aload_0         
	//*  21   44:getfield        #105 <Field boolean h>
	//*  22   47:ifne            62
			{
				an = System.currentTimeMillis();
	//   23   50:aload_0         
	//   24   51:invokestatic    #552 <Method long System.currentTimeMillis()>
	//   25   54:putfield        #212 <Field long an>
				h = true;
	//   26   57:aload_0         
	//   27   58:iconst_1        
	//   28   59:putfield        #105 <Field boolean h>
			}
			if(ak && E)
	//*  29   62:aload_0         
	//*  30   63:getfield        #210 <Field boolean ak>
	//*  31   66:ifeq            120
	//*  32   69:aload_0         
	//*  33   70:getfield        #152 <Field boolean E>
	//*  34   73:ifeq            120
			{
				IPoint ipoint = IPoint.obtain();
	//   35   76:invokestatic    #346 <Method IPoint IPoint.obtain()>
	//   36   79:astore          7
				s1.a(al, am, ipoint);
	//   37   81:aload_1         
	//   38   82:aload_0         
	//   39   83:getfield        #333 <Field int al>
	//   40   86:aload_0         
	//   41   87:getfield        #338 <Field int am>
	//   42   90:aload           7
	//   43   92:invokeinterface #450 <Method void s.a(int, int, IPoint)>
				r = ipoint.x;
	//   44   97:aload_0         
	//   45   98:aload           7
	//   46  100:getfield        #357 <Field int IPoint.x>
	//   47  103:putfield        #251 <Field int r>
				s = ipoint.y;
	//   48  106:aload_0         
	//   49  107:aload           7
	//   50  109:getfield        #359 <Field int IPoint.y>
	//   51  112:putfield        #253 <Field int s>
				ipoint.recycle();
	//   52  115:aload           7
	//   53  117:invokevirtual   #360 <Method void IPoint.recycle()>
			}
			t.x = r - s1.getMapConfig().getSX();
	//   54  120:aload_0         
	//   55  121:getfield        #131 <Field FPoint t>
	//   56  124:aload_0         
	//   57  125:getfield        #251 <Field int r>
	//   58  128:aload_1         
	//   59  129:invokeinterface #286 <Method MapConfig s.getMapConfig()>
	//   60  134:invokevirtual   #292 <Method int MapConfig.getSX()>
	//   61  137:isub            
	//   62  138:i2f             
	//   63  139:putfield        #293 <Field float FPoint.x>
			t.y = s - s1.getMapConfig().getSY();
	//   64  142:aload_0         
	//   65  143:getfield        #131 <Field FPoint t>
	//   66  146:aload_0         
	//   67  147:getfield        #253 <Field int s>
	//   68  150:aload_1         
	//   69  151:invokeinterface #286 <Method MapConfig s.getMapConfig()>
	//   70  156:invokevirtual   #296 <Method int MapConfig.getSY()>
	//   71  159:isub            
	//   72  160:i2f             
	//   73  161:putfield        #297 <Field float FPoint.y>
			int j1 = n();
	//   74  164:aload_0         
	//   75  165:invokevirtual   #466 <Method int n()>
	//   76  168:istore          5
			int k1 = o();
	//   77  170:aload_0         
	//   78  171:invokevirtual   #468 <Method int o()>
	//   79  174:istore          6
			t();
	//   80  176:aload_0         
	//   81  177:invokespecial   #554 <Method void t()>
			a(s1, f1, j1, k1);
	//   82  180:aload_0         
	//   83  181:aload_1         
	//   84  182:fload           4
	//   85  184:iload           5
	//   86  186:iload           6
	//   87  188:invokespecial   #556 <Method void a(s, float, int, int)>
			if(!F || !ah)
	//*  88  191:aload_0         
	//*  89  192:getfield        #154 <Field boolean F>
	//*  90  195:ifeq            205
	//*  91  198:aload_0         
	//*  92  199:getfield        #204 <Field boolean ah>
	//*  93  202:ifne            214
			{
				s();
	//   94  205:aload_0         
	//   95  206:invokespecial   #558 <Method void s()>
				F = true;
	//   96  209:aload_0         
	//   97  210:iconst_1        
	//   98  211:putfield        #154 <Field boolean F>
			}
			a(af1, i1);
	//   99  214:aload_0         
	//  100  215:aload_2         
	//  101  216:iload_3         
	//  102  217:invokespecial   #560 <Method void a(float[], int)>
			if(j && isInfoWindowShown())
	//* 103  220:aload_0         
	//* 104  221:getfield        #109 <Field boolean j>
	//* 105  224:ifeq            266
	//* 106  227:aload_0         
	//* 107  228:invokevirtual   #563 <Method boolean isInfoWindowShown()>
	//* 108  231:ifeq            266
			{
				ab.d().j();
	//  109  234:aload_0         
	//  110  235:getfield        #229 <Field y ab>
	//  111  238:invokevirtual   #280 <Method s y.d()>
	//  112  241:invokeinterface #565 <Method void s.j()>
				if(System.currentTimeMillis() - an > 1000L)
	//* 113  246:invokestatic    #552 <Method long System.currentTimeMillis()>
	//* 114  249:aload_0         
	//* 115  250:getfield        #212 <Field long an>
	//* 116  253:lsub            
	//* 117  254:ldc2w           #566 <Long 1000L>
	//* 118  257:lcmp            
	//* 119  258:ifle            266
					j = false;
	//  120  261:aload_0         
	//  121  262:iconst_0        
	//  122  263:putfield        #109 <Field boolean j>
			}
			return;
	//  123  266:return          
		}
		// Misplaced declaration of an exception variable
		catch(s s1)
	//* 124  267:astore_1        
		{
			hm.c(((Throwable) (s1)), "MarkerDelegateImp", "drawMarker");
	//  125  268:aload_1         
	//  126  269:ldc2            #539 <String "MarkerDelegateImp">
	//  127  272:ldc2            #569 <String "drawMarker">
	//  128  275:invokestatic    #546 <Method void hm.c(Throwable, String, String)>
		}
	//  129  278:return          
	}

	public void a(ArrayList arraylist)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		m();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #572 <Method void m()>
		if(arraylist == null)
			break MISSING_BLOCK_LABEL_52;
	//    4    6:aload_1         
	//    5    7:ifnull          52
		arraylist = ((ArrayList) (arraylist.iterator()));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #575 <Method Iterator ArrayList.iterator()>
	//    8   14:astore_1        
_L2:
		BitmapDescriptor bitmapdescriptor;
		do
		{
			if(!((Iterator) (arraylist)).hasNext())
				break MISSING_BLOCK_LABEL_52;
	//    9   15:aload_1         
	//   10   16:invokeinterface #483 <Method boolean Iterator.hasNext()>
	//   11   21:ifeq            52
			bitmapdescriptor = (BitmapDescriptor)((Iterator) (arraylist)).next();
	//   12   24:aload_1         
	//   13   25:invokeinterface #487 <Method Object Iterator.next()>
	//   14   30:checkcast       #489 <Class BitmapDescriptor>
	//   15   33:astore_2        
		} while(bitmapdescriptor == null);
	//   16   34:aload_2         
	//   17   35:ifnull          168
		ae.add(((Object) (bitmapdescriptor)));
	//   18   38:aload_0         
	//   19   39:getfield        #198 <Field List ae>
	//   20   42:aload_2         
	//   21   43:invokeinterface #579 <Method boolean List.add(Object)>
	//   22   48:pop             
		if(true) goto _L2; else goto _L1
	//   23   49:goto            168
_L1:
		if(ae.size() > 0)
	//*  24   52:aload_0         
	//*  25   53:getfield        #198 <Field List ae>
	//*  26   56:invokeinterface #317 <Method int List.size()>
	//*  27   61:ifle            107
		{
			N = ((BitmapDescriptor)ae.get(0)).getWidth();
	//   28   64:aload_0         
	//   29   65:aload_0         
	//   30   66:getfield        #198 <Field List ae>
	//   31   69:iconst_0        
	//   32   70:invokeinterface #583 <Method Object List.get(int)>
	//   33   75:checkcast       #489 <Class BitmapDescriptor>
	//   34   78:invokevirtual   #584 <Method int BitmapDescriptor.getWidth()>
	//   35   81:putfield        #169 <Field int N>
			O = ((BitmapDescriptor)ae.get(0)).getHeight();
	//   36   84:aload_0         
	//   37   85:aload_0         
	//   38   86:getfield        #198 <Field List ae>
	//   39   89:iconst_0        
	//   40   90:invokeinterface #583 <Method Object List.get(int)>
	//   41   95:checkcast       #489 <Class BitmapDescriptor>
	//   42   98:invokevirtual   #585 <Method int BitmapDescriptor.getHeight()>
	//   43  101:putfield        #171 <Field int O>
			break MISSING_BLOCK_LABEL_160;
	//   44  104:goto            160
		}
		ae.add(((Object) (BitmapDescriptorFactory.defaultMarker())));
	//   45  107:aload_0         
	//   46  108:getfield        #198 <Field List ae>
	//   47  111:invokestatic    #591 <Method BitmapDescriptor BitmapDescriptorFactory.defaultMarker()>
	//   48  114:invokeinterface #579 <Method boolean List.add(Object)>
	//   49  119:pop             
		N = ((BitmapDescriptor)ae.get(0)).getWidth();
	//   50  120:aload_0         
	//   51  121:aload_0         
	//   52  122:getfield        #198 <Field List ae>
	//   53  125:iconst_0        
	//   54  126:invokeinterface #583 <Method Object List.get(int)>
	//   55  131:checkcast       #489 <Class BitmapDescriptor>
	//   56  134:invokevirtual   #584 <Method int BitmapDescriptor.getWidth()>
	//   57  137:putfield        #169 <Field int N>
		O = ((BitmapDescriptor)ae.get(0)).getHeight();
	//   58  140:aload_0         
	//   59  141:aload_0         
	//   60  142:getfield        #198 <Field List ae>
	//   61  145:iconst_0        
	//   62  146:invokeinterface #583 <Method Object List.get(int)>
	//   63  151:checkcast       #489 <Class BitmapDescriptor>
	//   64  154:invokevirtual   #585 <Method int BitmapDescriptor.getHeight()>
	//   65  157:putfield        #171 <Field int O>
		this;
	//   66  160:aload_0         
		JVM INSTR monitorexit ;
	//   67  161:monitorexit     
		return;
	//   68  162:return          
		arraylist;
	//   69  163:astore_1        
	//*  70  164:aload_0         
		throw arraylist;
	//   71  165:monitorexit     
	//   72  166:aload_1         
	//   73  167:athrow          
	//*  74  168:goto            15
	}

	public void a(boolean flag)
	{
		i = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #107 <Field boolean i>
		j = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #109 <Field boolean j>
	//    6   10:return          
	}

	public LatLng b()
	{
		LatLng latlng1;
		if(!ak)
			break MISSING_BLOCK_LABEL_54;
	//    0    0:aload_0         
	//    1    1:getfield        #210 <Field boolean ak>
	//    2    4:ifeq            54
		DPoint dpoint = DPoint.obtain();
	//    3    7:invokestatic    #258 <Method DPoint DPoint.obtain()>
	//    4   10:astore_1        
		ab.d().b(al, am, dpoint);
	//    5   11:aload_0         
	//    6   12:getfield        #229 <Field y ab>
	//    7   15:invokevirtual   #280 <Method s y.d()>
	//    8   18:aload_0         
	//    9   19:getfield        #333 <Field int al>
	//   10   22:aload_0         
	//   11   23:getfield        #338 <Field int am>
	//   12   26:aload_1         
	//   13   27:invokeinterface #595 <Method void s.b(int, int, DPoint)>
		latlng1 = new LatLng(dpoint.y, dpoint.y);
	//   14   32:new             #266 <Class LatLng>
	//   15   35:dup             
	//   16   36:aload_1         
	//   17   37:getfield        #268 <Field double DPoint.y>
	//   18   40:aload_1         
	//   19   41:getfield        #268 <Field double DPoint.y>
	//   20   44:invokespecial   #598 <Method void LatLng(double, double)>
	//   21   47:astore_2        
		dpoint.recycle();
	//   22   48:aload_1         
	//   23   49:invokevirtual   #300 <Method void DPoint.recycle()>
		return latlng1;
	//   24   52:aload_2         
	//   25   53:areturn         
		LatLng latlng;
		try
		{
			if(af)
	//*  26   54:aload_0         
	//*  27   55:getfield        #200 <Field boolean af>
	//*  28   58:ifeq            66
				return U;
	//   29   61:aload_0         
	//   30   62:getfield        #600 <Field LatLng U>
	//   31   65:areturn         
			latlng = T;
	//   32   66:aload_0         
	//   33   67:getfield        #275 <Field LatLng T>
	//   34   70:astore_1        
		}
	//*  35   71:aload_1         
	//*  36   72:areturn         
		catch(Throwable throwable)
	//*  37   73:astore_1        
		{
			hm.c(throwable, "MarkerDelegateImp", "getRealPosition");
	//   38   74:aload_1         
	//   39   75:ldc2            #539 <String "MarkerDelegateImp">
	//   40   78:ldc2            #602 <String "getRealPosition">
	//   41   81:invokestatic    #546 <Method void hm.c(Throwable, String, String)>
			return null;
	//   42   84:aconst_null     
	//   43   85:areturn         
		}
		return latlng;
	}

	public void b(boolean flag)
	{
		H = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #158 <Field boolean H>
	//    3    5:return          
	}

	public int c()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int n>
	//    2    4:ireturn         
	}

	public int d()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field int o>
	//    2    4:ireturn         
	}

	public void destroy(boolean flag)
	{
		int i1;
		ab ab1;
		try
		{
			R = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #182 <Field boolean R>
		}
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #606 <Method boolean remove()>
	//*   7   13:pop             
	//*   8   14:aload_0         
	//*   9   15:getfield        #229 <Field y ab>
	//*  10   18:ifnull          169
	//*  11   21:iconst_0        
	//*  12   22:istore_2        
	//*  13   23:aload_0         
	//*  14   24:getfield        #173 <Field ab[] Q>
	//*  15   27:ifnull          169
	//*  16   30:iload_2         
	//*  17   31:aload_0         
	//*  18   32:getfield        #173 <Field ab[] Q>
	//*  19   35:arraylength     
	//*  20   36:icmpge          169
	//*  21   39:aload_0         
	//*  22   40:getfield        #173 <Field ab[] Q>
	//*  23   43:iload_2         
	//*  24   44:aaload          
	//*  25   45:astore_3        
	//*  26   46:aload_3         
	//*  27   47:ifnull          162
	//*  28   50:aload_0         
	//*  29   51:getfield        #229 <Field y ab>
	//*  30   54:aload_3         
	//*  31   55:invokevirtual   #607 <Method void y.a(ab)>
	//*  32   58:aload_0         
	//*  33   59:getfield        #229 <Field y ab>
	//*  34   62:invokevirtual   #280 <Method s y.d()>
	//*  35   65:aload_3         
	//*  36   66:invokevirtual   #609 <Method String ab.j()>
	//*  37   69:invokeinterface #612 <Method void s.c(String)>
	//*  38   74:goto            162
	//*  39   77:aload_0         
	//*  40   78:getfield        #198 <Field List ae>
	//*  41   81:ifnull          120
	//*  42   84:iload_2         
	//*  43   85:aload_0         
	//*  44   86:getfield        #198 <Field List ae>
	//*  45   89:invokeinterface #317 <Method int List.size()>
	//*  46   94:icmpge          120
	//*  47   97:aload_0         
	//*  48   98:getfield        #198 <Field List ae>
	//*  49  101:iload_2         
	//*  50  102:invokeinterface #583 <Method Object List.get(int)>
	//*  51  107:checkcast       #489 <Class BitmapDescriptor>
	//*  52  110:invokevirtual   #613 <Method void BitmapDescriptor.recycle()>
	//*  53  113:iload_2         
	//*  54  114:iconst_1        
	//*  55  115:iadd            
	//*  56  116:istore_2        
	//*  57  117:goto            77
	//*  58  120:aload_0         
	//*  59  121:aconst_null     
	//*  60  122:putfield        #275 <Field LatLng T>
	//*  61  125:aload_0         
	//*  62  126:aconst_null     
	//*  63  127:putfield        #615 <Field Object ac>
	//*  64  130:aload_0         
	//*  65  131:aconst_null     
	//*  66  132:putfield        #173 <Field ab[] Q>
	//*  67  135:return          
		catch(Throwable throwable)
	//*  68  136:astore_3        
		{
			hm.c(throwable, "MarkerDelegateImp", "destroy");
	//   69  137:aload_3         
	//   70  138:ldc2            #539 <String "MarkerDelegateImp">
	//   71  141:ldc2            #616 <String "destroy">
	//   72  144:invokestatic    #546 <Method void hm.c(Throwable, String, String)>
			throwable.printStackTrace();
	//   73  147:aload_3         
	//   74  148:invokevirtual   #405 <Method void Throwable.printStackTrace()>
			Log.d("destroy erro", "MarkerDelegateImp destroy");
	//   75  151:ldc2            #618 <String "destroy erro">
	//   76  154:ldc2            #620 <String "MarkerDelegateImp destroy">
	//   77  157:invokestatic    #625 <Method int Log.d(String, String)>
	//   78  160:pop             
			return;
	//   79  161:return          
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_14;
		remove();
		if(ab == null)
			break MISSING_BLOCK_LABEL_169;
		i1 = 0;
_L3:
		if(Q == null || i1 >= Q.length)
			break MISSING_BLOCK_LABEL_169;
		ab1 = Q[i1];
		if(ab1 == null)
			break MISSING_BLOCK_LABEL_162;
		ab.a(ab1);
		ab.d().c(ab1.j());
		break MISSING_BLOCK_LABEL_162;
_L1:
		for(; ae == null || i1 >= ae.size(); i1 = 0)
			break MISSING_BLOCK_LABEL_120;

	//   80  162:iload_2         
	//   81  163:iconst_1        
	//   82  164:iadd            
	//   83  165:istore_2        
	//   84  166:goto            23
	//   85  169:iconst_0        
	//   86  170:istore_2        
		((BitmapDescriptor)ae.get(i1)).recycle();
		i1++;
		  goto _L1
		T = null;
		ac = null;
		Q = null;
		return;
		i1++;
		if(true) goto _L3; else goto _L2
_L2:
	//*  87  171:goto            77
	}

	public int e()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field int p>
	//    2    4:ireturn         
	}

	public boolean equalsRemote(IOverlayImage ioverlayimage)
		throws RemoteException
	{
		return ((Object)this).equals(((Object) (ioverlayimage))) || ioverlayimage.getId().equals(((Object) (getId())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #630 <Method boolean Object.equals(Object)>
	//    3    5:ifne            24
	//    4    8:aload_1         
	//    5    9:invokeinterface #635 <Method String IOverlayImage.getId()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #636 <Method String getId()>
	//    8   18:invokevirtual   #639 <Method boolean String.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public int f()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field int q>
	//    2    4:ireturn         
	}

	public boolean g()
	{
		return ak;
	//    0    0:aload_0         
	//    1    1:getfield        #210 <Field boolean ak>
	//    2    4:ireturn         
	}

	public float getAlpha()
	{
		return y;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field float y>
	//    2    4:freturn         
	}

	public float getAnchorU()
	{
		return X;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field float X>
	//    2    4:freturn         
	}

	public float getAnchorV()
	{
		return Y;
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field float Y>
	//    2    4:freturn         
	}

	public int getDisplayLevel()
	{
		return C;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field int C>
	//    2    4:ireturn         
	}

	public IPoint getGeoPoint()
	{
		IPoint ipoint = IPoint.obtain();
	//    0    0:invokestatic    #346 <Method IPoint IPoint.obtain()>
	//    1    3:astore_1        
		if(ak)
	//*   2    4:aload_0         
	//*   3    5:getfield        #210 <Field boolean ak>
	//*   4    8:ifeq            34
		{
			ab.d().a(al, am, ipoint);
	//    5   11:aload_0         
	//    6   12:getfield        #229 <Field y ab>
	//    7   15:invokevirtual   #280 <Method s y.d()>
	//    8   18:aload_0         
	//    9   19:getfield        #333 <Field int al>
	//   10   22:aload_0         
	//   11   23:getfield        #338 <Field int am>
	//   12   26:aload_1         
	//   13   27:invokeinterface #450 <Method void s.a(int, int, IPoint)>
			return ipoint;
	//   14   32:aload_1         
	//   15   33:areturn         
		} else
		{
			ipoint.set(r, s);
	//   16   34:aload_1         
	//   17   35:aload_0         
	//   18   36:getfield        #251 <Field int r>
	//   19   39:aload_0         
	//   20   40:getfield        #253 <Field int s>
	//   21   43:invokevirtual   #647 <Method void IPoint.set(int, int)>
			return ipoint;
	//   22   46:aload_1         
	//   23   47:areturn         
		}
	}

	public IMarkerAction getIMarkerAction()
	{
		return ((IMarkerAction) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public ArrayList getIcons()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist;
		if(ae == null || ae.size() <= 0)
			break MISSING_BLOCK_LABEL_69;
	//    2    2:aload_0         
	//    3    3:getfield        #198 <Field List ae>
	//    4    6:ifnull          69
	//    5    9:aload_0         
	//    6   10:getfield        #198 <Field List ae>
	//    7   13:invokeinterface #317 <Method int List.size()>
	//    8   18:ifle            69
		arraylist = new ArrayList();
	//    9   21:new             #574 <Class ArrayList>
	//   10   24:dup             
	//   11   25:invokespecial   #652 <Method void ArrayList()>
	//   12   28:astore_1        
		for(Iterator iterator = ae.iterator(); iterator.hasNext(); arraylist.add(((Object) ((BitmapDescriptor)iterator.next()))));
	//   13   29:aload_0         
	//   14   30:getfield        #198 <Field List ae>
	//   15   33:invokeinterface #478 <Method Iterator List.iterator()>
	//   16   38:astore_2        
	//   17   39:aload_2         
	//   18   40:invokeinterface #483 <Method boolean Iterator.hasNext()>
	//   19   45:ifeq            65
	//   20   48:aload_1         
	//   21   49:aload_2         
	//   22   50:invokeinterface #487 <Method Object Iterator.next()>
	//   23   55:checkcast       #489 <Class BitmapDescriptor>
	//   24   58:invokevirtual   #653 <Method boolean ArrayList.add(Object)>
	//   25   61:pop             
	//*  26   62:goto            39
	//*  27   65:aload_0         
	//*  28   66:monitorexit     
		return arraylist;
	//   29   67:aload_1         
	//   30   68:areturn         
		this;
	//   31   69:aload_0         
		JVM INSTR monitorexit ;
	//   32   70:monitorexit     
		return null;
	//   33   71:aconst_null     
	//   34   72:areturn         
		Exception exception;
		exception;
	//   35   73:astore_1        
	//*  36   74:aload_0         
		throw exception;
	//   37   75:monitorexit     
	//   38   76:aload_1         
	//   39   77:athrow          
	}

	public String getId()
	{
		if(S == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #656 <Field String S>
	//*   2    4:ifnonnull       17
			S = a("Marker");
	//    3    7:aload_0         
	//    4    8:ldc2            #658 <String "Marker">
	//    5   11:invokestatic    #660 <Method String a(String)>
	//    6   14:putfield        #656 <Field String S>
		return S;
	//    7   17:aload_0         
	//    8   18:getfield        #656 <Field String S>
	//    9   21:areturn         
	}

	public Object getObject()
	{
		return ac;
	//    0    0:aload_0         
	//    1    1:getfield        #615 <Field Object ac>
	//    2    4:areturn         
	}

	public MarkerOptions getOptions()
	{
		return z;
	//    0    0:aload_0         
	//    1    1:getfield        #665 <Field MarkerOptions z>
	//    2    4:areturn         
	}

	public int getPeriod()
	{
		return aj;
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field int aj>
	//    2    4:ireturn         
	}

	public LatLng getPosition()
	{
		if(ak && t != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #210 <Field boolean ak>
	//*   2    4:ifeq            92
	//*   3    7:aload_0         
	//*   4    8:getfield        #131 <Field FPoint t>
	//*   5   11:ifnull          92
		{
			DPoint dpoint = DPoint.obtain();
	//    6   14:invokestatic    #258 <Method DPoint DPoint.obtain()>
	//    7   17:astore_1        
			IPoint ipoint = IPoint.obtain();
	//    8   18:invokestatic    #346 <Method IPoint IPoint.obtain()>
	//    9   21:astore_2        
			p();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #548 <Method boolean p()>
	//   12   26:pop             
			ab.d().a(t.x, t.y, ipoint);
	//   13   27:aload_0         
	//   14   28:getfield        #229 <Field y ab>
	//   15   31:invokevirtual   #280 <Method s y.d()>
	//   16   34:aload_0         
	//   17   35:getfield        #131 <Field FPoint t>
	//   18   38:getfield        #293 <Field float FPoint.x>
	//   19   41:aload_0         
	//   20   42:getfield        #131 <Field FPoint t>
	//   21   45:getfield        #297 <Field float FPoint.y>
	//   22   48:aload_2         
	//   23   49:invokeinterface #669 <Method void s.a(float, float, IPoint)>
			GLMapState.geo2LonLat(ipoint.x, ipoint.y, dpoint);
	//   24   54:aload_2         
	//   25   55:getfield        #357 <Field int IPoint.x>
	//   26   58:aload_2         
	//   27   59:getfield        #359 <Field int IPoint.y>
	//   28   62:aload_1         
	//   29   63:invokestatic    #264 <Method void GLMapState.geo2LonLat(int, int, DPoint)>
			LatLng latlng = new LatLng(dpoint.y, dpoint.x);
	//   30   66:new             #266 <Class LatLng>
	//   31   69:dup             
	//   32   70:aload_1         
	//   33   71:getfield        #268 <Field double DPoint.y>
	//   34   74:aload_1         
	//   35   75:getfield        #270 <Field double DPoint.x>
	//   36   78:invokespecial   #598 <Method void LatLng(double, double)>
	//   37   81:astore_3        
			ipoint.recycle();
	//   38   82:aload_2         
	//   39   83:invokevirtual   #360 <Method void IPoint.recycle()>
			dpoint.recycle();
	//   40   86:aload_1         
	//   41   87:invokevirtual   #300 <Method void DPoint.recycle()>
			return latlng;
	//   42   90:aload_3         
	//   43   91:areturn         
		} else
		{
			return T;
	//   44   92:aload_0         
	//   45   93:getfield        #275 <Field LatLng T>
	//   46   96:areturn         
		}
	}

	public float getRotateAngle()
	{
		r();
	//    0    0:aload_0         
	//    1    1:invokespecial   #302 <Method void r()>
		return l;
	//    2    4:aload_0         
	//    3    5:getfield        #113 <Field float l>
	//    4    8:freturn         
	}

	public String getSnippet()
	{
		return W;
	//    0    0:aload_0         
	//    1    1:getfield        #673 <Field String W>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return V;
	//    0    0:aload_0         
	//    1    1:getfield        #676 <Field String V>
	//    2    4:areturn         
	}

	public float getZIndex()
	{
		return v;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field float v>
	//    2    4:freturn         
	}

	public boolean h()
	{
		if(ak)
	//*   0    0:aload_0         
	//*   1    1:getfield        #210 <Field boolean ak>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(t != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #131 <Field FPoint t>
	//*   7   13:ifnull          144
		{
			if(!I)
	//*   8   16:aload_0         
	//*   9   17:getfield        #160 <Field boolean I>
	//*  10   20:ifne            25
				return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
			K.x = r;
	//   13   25:aload_0         
	//   14   26:getfield        #167 <Field Point K>
	//   15   29:aload_0         
	//   16   30:getfield        #251 <Field int r>
	//   17   33:putfield        #678 <Field int Point.x>
			K.y = s;
	//   18   36:aload_0         
	//   19   37:getfield        #167 <Field Point K>
	//   20   40:aload_0         
	//   21   41:getfield        #253 <Field int s>
	//   22   44:putfield        #679 <Field int Point.y>
			if(ab.d().getMapConfig().getGeoRectangle().contains(r, s))
	//*  23   47:aload_0         
	//*  24   48:getfield        #229 <Field y ab>
	//*  25   51:invokevirtual   #280 <Method s y.d()>
	//*  26   54:invokeinterface #286 <Method MapConfig s.getMapConfig()>
	//*  27   59:invokevirtual   #683 <Method Rectangle MapConfig.getGeoRectangle()>
	//*  28   62:aload_0         
	//*  29   63:getfield        #251 <Field int r>
	//*  30   66:aload_0         
	//*  31   67:getfield        #253 <Field int s>
	//*  32   70:invokevirtual   #689 <Method boolean Rectangle.contains(int, int)>
	//*  33   73:ifeq            78
				return true;
	//   34   76:iconst_1        
	//   35   77:ireturn         
			v();
	//   36   78:aload_0         
	//   37   79:invokespecial   #373 <Method void v()>
			J.x = t.x;
	//   38   82:aload_0         
	//   39   83:getfield        #162 <Field FPoint J>
	//   40   86:aload_0         
	//   41   87:getfield        #131 <Field FPoint t>
	//   42   90:getfield        #293 <Field float FPoint.x>
	//   43   93:putfield        #293 <Field float FPoint.x>
			J.y = t.y;
	//   44   96:aload_0         
	//   45   97:getfield        #162 <Field FPoint J>
	//   46  100:aload_0         
	//   47  101:getfield        #131 <Field FPoint t>
	//   48  104:getfield        #297 <Field float FPoint.y>
	//   49  107:putfield        #297 <Field float FPoint.y>
			FPoint afpoint[] = ab.d().getMapConfig().getMapRect();
	//   50  110:aload_0         
	//   51  111:getfield        #229 <Field y ab>
	//   52  114:invokevirtual   #280 <Method s y.d()>
	//   53  117:invokeinterface #286 <Method MapConfig s.getMapConfig()>
	//   54  122:invokevirtual   #693 <Method FPoint[] MapConfig.getMapRect()>
	//   55  125:astore_1        
			a(afpoint);
	//   56  126:aload_0         
	//   57  127:aload_1         
	//   58  128:invokespecial   #695 <Method void a(FPoint[])>
			if(fd.a(J, afpoint))
	//*  59  131:aload_0         
	//*  60  132:getfield        #162 <Field FPoint J>
	//*  61  135:aload_1         
	//*  62  136:invokestatic    #698 <Method boolean fd.a(FPoint, FPoint[])>
	//*  63  139:ifeq            144
				return true;
	//   64  142:iconst_1        
	//   65  143:ireturn         
		}
		return false;
	//   66  144:iconst_0        
	//   67  145:ireturn         
	}

	public int hashCodeRemote()
	{
		return ((Object)this).hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #702 <Method int Object.hashCode()>
	//    2    4:ireturn         
	}

	public void hideInfoWindow()
	{
		if(isInfoWindowShown())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #563 <Method boolean isInfoWindowShown()>
	//*   2    4:ifeq            24
		{
			ab.b(((de) (this)));
	//    3    7:aload_0         
	//    4    8:getfield        #229 <Field y ab>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #706 <Method void y.b(de)>
			r();
	//    7   15:aload_0         
	//    8   16:invokespecial   #302 <Method void r()>
			i = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #107 <Field boolean i>
		}
		j = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #109 <Field boolean j>
	//   15   29:return          
	}

	public Rect i()
	{
		if(u == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field float[] u>
	//*   2    4:ifnonnull       23
		{
			c.set(0, 0, 0, 0);
	//    3    7:aload_0         
	//    4    8:getfield        #180 <Field Rect c>
	//    5   11:iconst_0        
	//    6   12:iconst_0        
	//    7   13:iconst_0        
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #709 <Method void Rect.set(int, int, int, int)>
			return c;
	//   10   18:aload_0         
	//   11   19:getfield        #180 <Field Rect c>
	//   12   22:areturn         
		}
		int i1;
		int j1;
		Object obj;
		GLMapState glmapstate;
		float af1[];
		try
		{
			glmapstate = ab.d().c();
	//   13   23:aload_0         
	//   14   24:getfield        #229 <Field y ab>
	//   15   27:invokevirtual   #280 <Method s y.d()>
	//   16   30:invokeinterface #712 <Method GLMapState s.c()>
	//   17   35:astore          4
		}
	//*  18   37:aload           4
	//*  19   39:ifnonnull       56
	//*  20   42:new             #175 <Class Rect>
	//*  21   45:dup             
	//*  22   46:iconst_0        
	//*  23   47:iconst_0        
	//*  24   48:iconst_0        
	//*  25   49:iconst_0        
	//*  26   50:invokespecial   #178 <Method void Rect(int, int, int, int)>
	//*  27   53:astore_3        
	//*  28   54:aload_3         
	//*  29   55:areturn         
	//*  30   56:aload_0         
	//*  31   57:invokevirtual   #466 <Method int n()>
	//*  32   60:istore_1        
	//*  33   61:aload_0         
	//*  34   62:invokevirtual   #468 <Method int o()>
	//*  35   65:istore_2        
	//*  36   66:invokestatic    #129 <Method FPoint FPoint.obtain()>
	//*  37   69:astore_3        
	//*  38   70:aload_0         
	//*  39   71:getfield        #210 <Field boolean ak>
	//*  40   74:ifeq            98
	//*  41   77:aload_3         
	//*  42   78:aload_0         
	//*  43   79:getfield        #333 <Field int al>
	//*  44   82:i2f             
	//*  45   83:putfield        #293 <Field float FPoint.x>
	//*  46   86:aload_3         
	//*  47   87:aload_0         
	//*  48   88:getfield        #338 <Field int am>
	//*  49   91:i2f             
	//*  50   92:putfield        #297 <Field float FPoint.y>
	//*  51   95:goto            112
	//*  52   98:aload           4
	//*  53  100:aload_0         
	//*  54  101:getfield        #251 <Field int r>
	//*  55  104:aload_0         
	//*  56  105:getfield        #253 <Field int s>
	//*  57  108:aload_3         
	//*  58  109:invokevirtual   #716 <Method void GLMapState.p20ToScreenPoint(int, int, FPoint)>
	//*  59  112:aload_0         
	//*  60  113:getfield        #718 <Field float[] a>
	//*  61  116:iconst_0        
	//*  62  117:invokestatic    #723 <Method void Matrix.setIdentityM(float[], int)>
	//*  63  120:aload_0         
	//*  64  121:getfield        #718 <Field float[] a>
	//*  65  124:iconst_0        
	//*  66  125:aload_0         
	//*  67  126:getfield        #111 <Field float k>
	//*  68  129:fneg            
	//*  69  130:fconst_0        
	//*  70  131:fconst_0        
	//*  71  132:fconst_1        
	//*  72  133:invokestatic    #727 <Method void Matrix.rotateM(float[], int, float, float, float, float)>
	//*  73  136:aload_0         
	//*  74  137:getfield        #115 <Field boolean m>
	//*  75  140:ifeq            195
	//*  76  143:aload_0         
	//*  77  144:getfield        #718 <Field float[] a>
	//*  78  147:iconst_0        
	//*  79  148:aload_0         
	//*  80  149:getfield        #229 <Field y ab>
	//*  81  152:invokevirtual   #280 <Method s y.d()>
	//*  82  155:invokeinterface #286 <Method MapConfig s.getMapConfig()>
	//*  83  160:invokevirtual   #309 <Method float MapConfig.getSC()>
	//*  84  163:fconst_1        
	//*  85  164:fconst_0        
	//*  86  165:fconst_0        
	//*  87  166:invokestatic    #727 <Method void Matrix.rotateM(float[], int, float, float, float, float)>
	//*  88  169:aload_0         
	//*  89  170:getfield        #718 <Field float[] a>
	//*  90  173:iconst_0        
	//*  91  174:aload_0         
	//*  92  175:getfield        #229 <Field y ab>
	//*  93  178:invokevirtual   #280 <Method s y.d()>
	//*  94  181:invokeinterface #286 <Method MapConfig s.getMapConfig()>
	//*  95  186:invokevirtual   #312 <Method float MapConfig.getSR()>
	//*  96  189:fconst_0        
	//*  97  190:fconst_0        
	//*  98  191:fconst_1        
	//*  99  192:invokestatic    #727 <Method void Matrix.rotateM(float[], int, float, float, float, float)>
	//* 100  195:iconst_4        
	//* 101  196:newarray        float[]
	//* 102  198:astore          4
	//* 103  200:aload_0         
	//* 104  201:getfield        #729 <Field float[] b>
	//* 105  204:iconst_0        
	//* 106  205:iload_1         
	//* 107  206:ineg            
	//* 108  207:i2f             
	//* 109  208:aload_0         
	//* 110  209:getfield        #185 <Field float X>
	//* 111  212:fmul            
	//* 112  213:fastore         
	//* 113  214:aload_0         
	//* 114  215:getfield        #729 <Field float[] b>
	//* 115  218:iconst_1        
	//* 116  219:iload_2         
	//* 117  220:i2f             
	//* 118  221:aload_0         
	//* 119  222:getfield        #187 <Field float Y>
	//* 120  225:fmul            
	//* 121  226:fastore         
	//* 122  227:aload_0         
	//* 123  228:getfield        #729 <Field float[] b>
	//* 124  231:iconst_2        
	//* 125  232:fconst_0        
	//* 126  233:fastore         
	//* 127  234:aload_0         
	//* 128  235:getfield        #729 <Field float[] b>
	//* 129  238:iconst_3        
	//* 130  239:fconst_1        
	//* 131  240:fastore         
	//* 132  241:aload           4
	//* 133  243:iconst_0        
	//* 134  244:aload_0         
	//* 135  245:getfield        #718 <Field float[] a>
	//* 136  248:iconst_0        
	//* 137  249:aload_0         
	//* 138  250:getfield        #729 <Field float[] b>
	//* 139  253:iconst_0        
	//* 140  254:invokestatic    #733 <Method void Matrix.multiplyMV(float[], int, float[], int, float[], int)>
	//* 141  257:aload_0         
	//* 142  258:getfield        #180 <Field Rect c>
	//* 143  261:aload_3         
	//* 144  262:getfield        #293 <Field float FPoint.x>
	//* 145  265:aload           4
	//* 146  267:iconst_0        
	//* 147  268:faload          
	//* 148  269:fadd            
	//* 149  270:f2i             
	//* 150  271:aload_3         
	//* 151  272:getfield        #297 <Field float FPoint.y>
	//* 152  275:aload           4
	//* 153  277:iconst_1        
	//* 154  278:faload          
	//* 155  279:fsub            
	//* 156  280:f2i             
	//* 157  281:aload_3         
	//* 158  282:getfield        #293 <Field float FPoint.x>
	//* 159  285:aload           4
	//* 160  287:iconst_0        
	//* 161  288:faload          
	//* 162  289:fadd            
	//* 163  290:f2i             
	//* 164  291:aload_3         
	//* 165  292:getfield        #297 <Field float FPoint.y>
	//* 166  295:aload           4
	//* 167  297:iconst_1        
	//* 168  298:faload          
	//* 169  299:fsub            
	//* 170  300:f2i             
	//* 171  301:invokevirtual   #709 <Method void Rect.set(int, int, int, int)>
	//* 172  304:aload_0         
	//* 173  305:getfield        #729 <Field float[] b>
	//* 174  308:iconst_0        
	//* 175  309:iload_1         
	//* 176  310:i2f             
	//* 177  311:fconst_1        
	//* 178  312:aload_0         
	//* 179  313:getfield        #185 <Field float X>
	//* 180  316:fsub            
	//* 181  317:fmul            
	//* 182  318:fastore         
	//* 183  319:aload_0         
	//* 184  320:getfield        #729 <Field float[] b>
	//* 185  323:iconst_1        
	//* 186  324:iload_2         
	//* 187  325:i2f             
	//* 188  326:aload_0         
	//* 189  327:getfield        #187 <Field float Y>
	//* 190  330:fmul            
	//* 191  331:fastore         
	//* 192  332:aload_0         
	//* 193  333:getfield        #729 <Field float[] b>
	//* 194  336:iconst_2        
	//* 195  337:fconst_0        
	//* 196  338:fastore         
	//* 197  339:aload_0         
	//* 198  340:getfield        #729 <Field float[] b>
	//* 199  343:iconst_3        
	//* 200  344:fconst_1        
	//* 201  345:fastore         
	//* 202  346:aload           4
	//* 203  348:iconst_0        
	//* 204  349:aload_0         
	//* 205  350:getfield        #718 <Field float[] a>
	//* 206  353:iconst_0        
	//* 207  354:aload_0         
	//* 208  355:getfield        #729 <Field float[] b>
	//* 209  358:iconst_0        
	//* 210  359:invokestatic    #733 <Method void Matrix.multiplyMV(float[], int, float[], int, float[], int)>
	//* 211  362:aload_0         
	//* 212  363:getfield        #180 <Field Rect c>
	//* 213  366:aload_3         
	//* 214  367:getfield        #293 <Field float FPoint.x>
	//* 215  370:aload           4
	//* 216  372:iconst_0        
	//* 217  373:faload          
	//* 218  374:fadd            
	//* 219  375:f2i             
	//* 220  376:aload_3         
	//* 221  377:getfield        #297 <Field float FPoint.y>
	//* 222  380:aload           4
	//* 223  382:iconst_1        
	//* 224  383:faload          
	//* 225  384:fsub            
	//* 226  385:f2i             
	//* 227  386:invokevirtual   #736 <Method void Rect.union(int, int)>
	//* 228  389:aload_0         
	//* 229  390:getfield        #729 <Field float[] b>
	//* 230  393:iconst_0        
	//* 231  394:iload_1         
	//* 232  395:i2f             
	//* 233  396:fconst_1        
	//* 234  397:aload_0         
	//* 235  398:getfield        #185 <Field float X>
	//* 236  401:fsub            
	//* 237  402:fmul            
	//* 238  403:fastore         
	//* 239  404:aload_0         
	//* 240  405:getfield        #729 <Field float[] b>
	//* 241  408:iconst_1        
	//* 242  409:iload_2         
	//* 243  410:ineg            
	//* 244  411:i2f             
	//* 245  412:fconst_1        
	//* 246  413:aload_0         
	//* 247  414:getfield        #187 <Field float Y>
	//* 248  417:fsub            
	//* 249  418:fmul            
	//* 250  419:fastore         
	//* 251  420:aload_0         
	//* 252  421:getfield        #729 <Field float[] b>
	//* 253  424:iconst_2        
	//* 254  425:fconst_0        
	//* 255  426:fastore         
	//* 256  427:aload_0         
	//* 257  428:getfield        #729 <Field float[] b>
	//* 258  431:iconst_3        
	//* 259  432:fconst_1        
	//* 260  433:fastore         
	//* 261  434:aload           4
	//* 262  436:iconst_0        
	//* 263  437:aload_0         
	//* 264  438:getfield        #718 <Field float[] a>
	//* 265  441:iconst_0        
	//* 266  442:aload_0         
	//* 267  443:getfield        #729 <Field float[] b>
	//* 268  446:iconst_0        
	//* 269  447:invokestatic    #733 <Method void Matrix.multiplyMV(float[], int, float[], int, float[], int)>
	//* 270  450:aload_0         
	//* 271  451:getfield        #180 <Field Rect c>
	//* 272  454:aload_3         
	//* 273  455:getfield        #293 <Field float FPoint.x>
	//* 274  458:aload           4
	//* 275  460:iconst_0        
	//* 276  461:faload          
	//* 277  462:fadd            
	//* 278  463:f2i             
	//* 279  464:aload_3         
	//* 280  465:getfield        #297 <Field float FPoint.y>
	//* 281  468:aload           4
	//* 282  470:iconst_1        
	//* 283  471:faload          
	//* 284  472:fsub            
	//* 285  473:f2i             
	//* 286  474:invokevirtual   #736 <Method void Rect.union(int, int)>
	//* 287  477:aload_0         
	//* 288  478:getfield        #729 <Field float[] b>
	//* 289  481:iconst_0        
	//* 290  482:iload_1         
	//* 291  483:ineg            
	//* 292  484:i2f             
	//* 293  485:aload_0         
	//* 294  486:getfield        #185 <Field float X>
	//* 295  489:fmul            
	//* 296  490:fastore         
	//* 297  491:aload_0         
	//* 298  492:getfield        #729 <Field float[] b>
	//* 299  495:iconst_1        
	//* 300  496:iload_2         
	//* 301  497:ineg            
	//* 302  498:i2f             
	//* 303  499:fconst_1        
	//* 304  500:aload_0         
	//* 305  501:getfield        #187 <Field float Y>
	//* 306  504:fsub            
	//* 307  505:fmul            
	//* 308  506:fastore         
	//* 309  507:aload_0         
	//* 310  508:getfield        #729 <Field float[] b>
	//* 311  511:iconst_2        
	//* 312  512:fconst_0        
	//* 313  513:fastore         
	//* 314  514:aload_0         
	//* 315  515:getfield        #729 <Field float[] b>
	//* 316  518:iconst_3        
	//* 317  519:fconst_1        
	//* 318  520:fastore         
	//* 319  521:aload           4
	//* 320  523:iconst_0        
	//* 321  524:aload_0         
	//* 322  525:getfield        #718 <Field float[] a>
	//* 323  528:iconst_0        
	//* 324  529:aload_0         
	//* 325  530:getfield        #729 <Field float[] b>
	//* 326  533:iconst_0        
	//* 327  534:invokestatic    #733 <Method void Matrix.multiplyMV(float[], int, float[], int, float[], int)>
	//* 328  537:aload_0         
	//* 329  538:getfield        #180 <Field Rect c>
	//* 330  541:aload_3         
	//* 331  542:getfield        #293 <Field float FPoint.x>
	//* 332  545:aload           4
	//* 333  547:iconst_0        
	//* 334  548:faload          
	//* 335  549:fadd            
	//* 336  550:f2i             
	//* 337  551:aload_3         
	//* 338  552:getfield        #297 <Field float FPoint.y>
	//* 339  555:aload           4
	//* 340  557:iconst_1        
	//* 341  558:faload          
	//* 342  559:fsub            
	//* 343  560:f2i             
	//* 344  561:invokevirtual   #736 <Method void Rect.union(int, int)>
	//* 345  564:aload_0         
	//* 346  565:aload_0         
	//* 347  566:getfield        #180 <Field Rect c>
	//* 348  569:invokevirtual   #739 <Method int Rect.centerX()>
	//* 349  572:i2f             
	//* 350  573:aload_3         
	//* 351  574:getfield        #293 <Field float FPoint.x>
	//* 352  577:fsub            
	//* 353  578:f2i             
	//* 354  579:putfield        #121 <Field int p>
	//* 355  582:aload_0         
	//* 356  583:aload_0         
	//* 357  584:getfield        #180 <Field Rect c>
	//* 358  587:getfield        #742 <Field int Rect.top>
	//* 359  590:i2f             
	//* 360  591:aload_3         
	//* 361  592:getfield        #297 <Field float FPoint.y>
	//* 362  595:fsub            
	//* 363  596:f2i             
	//* 364  597:putfield        #123 <Field int q>
	//* 365  600:aload_3         
	//* 366  601:invokevirtual   #743 <Method void FPoint.recycle()>
	//* 367  604:aload_0         
	//* 368  605:getfield        #180 <Field Rect c>
	//* 369  608:astore_3        
	//* 370  609:aload_3         
	//* 371  610:areturn         
		catch(Throwable throwable)
	//* 372  611:astore_3        
		{
			hm.c(throwable, "MarkerDelegateImp", "getRect");
	//  373  612:aload_3         
	//  374  613:ldc2            #539 <String "MarkerDelegateImp">
	//  375  616:ldc2            #745 <String "getRect">
	//  376  619:invokestatic    #546 <Method void hm.c(Throwable, String, String)>
			throwable.printStackTrace();
	//  377  622:aload_3         
	//  378  623:invokevirtual   #405 <Method void Throwable.printStackTrace()>
			return new Rect(0, 0, 0, 0);
	//  379  626:new             #175 <Class Rect>
	//  380  629:dup             
	//  381  630:iconst_0        
	//  382  631:iconst_0        
	//  383  632:iconst_0        
	//  384  633:iconst_0        
	//  385  634:invokespecial   #178 <Method void Rect(int, int, int, int)>
	//  386  637:areturn         
		}
		if(glmapstate != null)
			break MISSING_BLOCK_LABEL_56;
		obj = ((Object) (new Rect(0, 0, 0, 0)));
		return ((Rect) (obj));
		i1 = n();
		j1 = o();
		obj = ((Object) (FPoint.obtain()));
		if(ak)
		{
			obj.x = al;
			obj.y = am;
			break MISSING_BLOCK_LABEL_112;
		}
		glmapstate.p20ToScreenPoint(r, s, ((FPoint) (obj)));
		Matrix.setIdentityM(a, 0);
		Matrix.rotateM(a, 0, -k, 0.0F, 0.0F, 1.0F);
		if(m)
		{
			Matrix.rotateM(a, 0, ab.d().getMapConfig().getSC(), 1.0F, 0.0F, 0.0F);
			Matrix.rotateM(a, 0, ab.d().getMapConfig().getSR(), 0.0F, 0.0F, 1.0F);
		}
		af1 = new float[4];
		b[0] = (float)(-i1) * X;
		b[1] = (float)j1 * Y;
		b[2] = 0.0F;
		b[3] = 1.0F;
		Matrix.multiplyMV(af1, 0, a, 0, b, 0);
		c.set((int)(((FPoint) (obj)).x + af1[0]), (int)(((FPoint) (obj)).y - af1[1]), (int)(((FPoint) (obj)).x + af1[0]), (int)(((FPoint) (obj)).y - af1[1]));
		b[0] = (float)i1 * (1.0F - X);
		b[1] = (float)j1 * Y;
		b[2] = 0.0F;
		b[3] = 1.0F;
		Matrix.multiplyMV(af1, 0, a, 0, b, 0);
		c.union((int)(((FPoint) (obj)).x + af1[0]), (int)(((FPoint) (obj)).y - af1[1]));
		b[0] = (float)i1 * (1.0F - X);
		b[1] = (float)(-j1) * (1.0F - Y);
		b[2] = 0.0F;
		b[3] = 1.0F;
		Matrix.multiplyMV(af1, 0, a, 0, b, 0);
		c.union((int)(((FPoint) (obj)).x + af1[0]), (int)(((FPoint) (obj)).y - af1[1]));
		b[0] = (float)(-i1) * X;
		b[1] = (float)(-j1) * (1.0F - Y);
		b[2] = 0.0F;
		b[3] = 1.0F;
		Matrix.multiplyMV(af1, 0, a, 0, b, 0);
		c.union((int)(((FPoint) (obj)).x + af1[0]), (int)(((FPoint) (obj)).y - af1[1]));
		p = (int)((float)c.centerX() - ((FPoint) (obj)).x);
		q = (int)((float)c.top - ((FPoint) (obj)).y);
		((FPoint) (obj)).recycle();
		obj = ((Object) (c));
		return ((Rect) (obj));
	}

	public boolean isClickable()
	{
		return D;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field boolean D>
	//    2    4:ireturn         
	}

	public boolean isDraggable()
	{
		return Z;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field boolean Z>
	//    2    4:ireturn         
	}

	public boolean isFlat()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field boolean m>
	//    2    4:ireturn         
	}

	public boolean isInfoWindowAutoOverturn()
	{
		return A;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field boolean A>
	//    2    4:ireturn         
	}

	public boolean isInfoWindowEnable()
	{
		return B;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field boolean B>
	//    2    4:ireturn         
	}

	public boolean isInfoWindowShown()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field boolean i>
	//    2    4:ireturn         
	}

	public boolean isPerspective()
	{
		return ad;
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field boolean ad>
	//    2    4:ireturn         
	}

	public boolean isRemoved()
	{
		boolean flag;
		try
		{
			flag = ab.c(((de) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field y ab>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #755 <Method boolean y.c(de)>
	//    4    8:istore_1        
		}
	//*   5    9:iload_1         
	//*   6   10:ifne            15
	//*   7   13:iconst_1        
	//*   8   14:ireturn         
	//*   9   15:iconst_0        
	//*  10   16:ireturn         
		catch(Throwable throwable)
	//*  11   17:astore_2        
		{
			throwable.printStackTrace();
	//   12   18:aload_2         
	//   13   19:invokevirtual   #405 <Method void Throwable.printStackTrace()>
			return false;
	//   14   22:iconst_0        
	//   15   23:ireturn         
		}
		return !flag;
	}

	public boolean isVisible()
	{
		return aa;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field boolean aa>
	//    2    4:ireturn         
	}

	public boolean j()
	{
		return ah;
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field boolean ah>
	//    2    4:ireturn         
	}

	public int k()
	{
		int i1;
		if(ae == null)
			break MISSING_BLOCK_LABEL_21;
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field List ae>
	//    2    4:ifnull          21
		i1 = ae.size();
	//    3    7:aload_0         
	//    4    8:getfield        #198 <Field List ae>
	//    5   11:invokeinterface #317 <Method int List.size()>
	//    6   16:istore_1        
		if(i1 > 0)
			break MISSING_BLOCK_LABEL_23;
	//    7   17:iload_1         
	//    8   18:ifgt            23
		return 0;
	//    9   21:iconst_0        
	//   10   22:ireturn         
		int j1;
		try
		{
			j1 = P.f();
	//   11   23:aload_0         
	//   12   24:getfield        #319 <Field ab P>
	//   13   27:invokevirtual   #494 <Method int ab.f()>
	//   14   30:istore_1        
		}
	//*  15   31:iload_1         
	//*  16   32:ireturn         
		catch(Throwable throwable)
	//*  17   33:astore_2        
		{
			return 0;
	//   18   34:iconst_0        
	//   19   35:ireturn         
		}
		return j1;
	}

	public boolean l()
	{
		return H;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field boolean H>
	//    2    4:ireturn         
	}

	void m()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(ae != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #198 <Field List ae>
	//*   4    6:ifnull          18
			ae.clear();
	//    5    9:aload_0         
	//    6   10:getfield        #198 <Field List ae>
	//    7   13:invokeinterface #759 <Method void List.clear()>
		this;
	//    8   18:aload_0         
		JVM INSTR monitorexit ;
	//    9   19:monitorexit     
		return;
	//   10   20:return          
		Exception exception;
		exception;
	//   11   21:astore_1        
	//*  12   22:aload_0         
		throw exception;
	//   13   23:monitorexit     
	//   14   24:aload_1         
	//   15   25:athrow          
	}

	public int n()
	{
		int i1;
		try
		{
			i1 = N;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field int N>
	//    2    4:istore_1        
		}
	//*   3    5:iload_1         
	//*   4    6:ireturn         
		catch(Throwable throwable)
	//*   5    7:astore_2        
		{
			return 0;
	//    6    8:iconst_0        
	//    7    9:ireturn         
		}
		return i1;
	}

	public int o()
	{
		int i1;
		try
		{
			i1 = O;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field int O>
	//    2    4:istore_1        
		}
	//*   3    5:iload_1         
	//*   4    6:ireturn         
		catch(Throwable throwable)
	//*   5    7:astore_2        
		{
			return 0;
	//    6    8:iconst_0        
	//    7    9:ireturn         
		}
		return i1;
	}

	public boolean p()
	{
		GLMapState glmapstate;
		if(ab == null || ab.d() == null)
			break MISSING_BLOCK_LABEL_34;
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field y ab>
	//    2    4:ifnull          34
	//    3    7:aload_0         
	//    4    8:getfield        #229 <Field y ab>
	//    5   11:invokevirtual   #280 <Method s y.d()>
	//    6   14:ifnull          34
		glmapstate = ab.d().c();
	//    7   17:aload_0         
	//    8   18:getfield        #229 <Field y ab>
	//    9   21:invokevirtual   #280 <Method s y.d()>
	//   10   24:invokeinterface #712 <Method GLMapState s.c()>
	//   11   29:astore_1        
		if(glmapstate != null)
			break MISSING_BLOCK_LABEL_36;
	//   12   30:aload_1         
	//   13   31:ifnonnull       36
		return false;
	//   14   34:iconst_0        
	//   15   35:ireturn         
label0:
		{
			if(t == null)
	//*  16   36:aload_0         
	//*  17   37:getfield        #131 <Field FPoint t>
	//*  18   40:ifnonnull       50
				t = FPoint.obtain();
	//   19   43:aload_0         
	//   20   44:invokestatic    #129 <Method FPoint FPoint.obtain()>
	//   21   47:putfield        #131 <Field FPoint t>
			if(ak)
	//*  22   50:aload_0         
	//*  23   51:getfield        #210 <Field boolean ak>
	//*  24   54:ifeq            129
			{
				IPoint ipoint = IPoint.obtain();
	//   25   57:invokestatic    #346 <Method IPoint IPoint.obtain()>
	//   26   60:astore_1        
				ab.d().a(al, am, ipoint);
	//   27   61:aload_0         
	//   28   62:getfield        #229 <Field y ab>
	//   29   65:invokevirtual   #280 <Method s y.d()>
	//   30   68:aload_0         
	//   31   69:getfield        #333 <Field int al>
	//   32   72:aload_0         
	//   33   73:getfield        #338 <Field int am>
	//   34   76:aload_1         
	//   35   77:invokeinterface #450 <Method void s.a(int, int, IPoint)>
				r = ipoint.x;
	//   36   82:aload_0         
	//   37   83:aload_1         
	//   38   84:getfield        #357 <Field int IPoint.x>
	//   39   87:putfield        #251 <Field int r>
				s = ipoint.y;
	//   40   90:aload_0         
	//   41   91:aload_1         
	//   42   92:getfield        #359 <Field int IPoint.y>
	//   43   95:putfield        #253 <Field int s>
				ipoint.recycle();
	//   44   98:aload_1         
	//   45   99:invokevirtual   #360 <Method void IPoint.recycle()>
				ab.d().a(r, s, t);
	//   46  102:aload_0         
	//   47  103:getfield        #229 <Field y ab>
	//   48  106:invokevirtual   #280 <Method s y.d()>
	//   49  109:aload_0         
	//   50  110:getfield        #251 <Field int r>
	//   51  113:aload_0         
	//   52  114:getfield        #253 <Field int s>
	//   53  117:aload_0         
	//   54  118:getfield        #131 <Field FPoint t>
	//   55  121:invokeinterface #761 <Method void s.a(int, int, FPoint)>
				break label0;
	//   56  126:goto            153
			}
			try
			{
				ab.d().a(r, s, t);
	//   57  129:aload_0         
	//   58  130:getfield        #229 <Field y ab>
	//   59  133:invokevirtual   #280 <Method s y.d()>
	//   60  136:aload_0         
	//   61  137:getfield        #251 <Field int r>
	//   62  140:aload_0         
	//   63  141:getfield        #253 <Field int s>
	//   64  144:aload_0         
	//   65  145:getfield        #131 <Field FPoint t>
	//   66  148:invokeinterface #761 <Method void s.a(int, int, FPoint)>
			}
	//*  67  153:iconst_1        
	//*  68  154:ireturn         
			catch(Throwable throwable)
	//*  69  155:astore_1        
			{
				throwable.printStackTrace();
	//   70  156:aload_1         
	//   71  157:invokevirtual   #405 <Method void Throwable.printStackTrace()>
				return false;
	//   72  160:iconst_0        
	//   73  161:ireturn         
			}
		}
		return true;
	}

	public IAnimation q()
	{
		return ((IAnimation) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean remove()
	{
		r();
	//    0    0:aload_0         
	//    1    1:invokespecial   #302 <Method void r()>
		aa = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #191 <Field boolean aa>
		boolean flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_1        
		if(ab != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #229 <Field y ab>
	//*   9   15:ifnull          27
			flag = ab.a(((de) (this)));
	//   10   18:aload_0         
	//   11   19:getfield        #229 <Field y ab>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #764 <Method boolean y.a(de)>
	//   14   26:istore_1        
		return flag;
	//   15   27:iload_1         
	//   16   28:ireturn         
	}

	public void set2Top()
	{
		ab.a(((db) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field y ab>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #768 <Method void y.a(db)>
	//    4    8:return          
	}

	public void setAlpha(float f1)
	{
		y = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #142 <Field float y>
		z.alpha(f1);
	//    3    5:aload_0         
	//    4    6:getfield        #665 <Field MarkerOptions z>
	//    5    9:fload_1         
	//    6   10:invokevirtual   #774 <Method MarkerOptions MarkerOptions.alpha(float)>
	//    7   13:pop             
	//    8   14:return          
	}

	public void setAnchor(float f1, float f2)
	{
		if(X == f1 && Y == f2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #185 <Field float X>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifne            19
	//*   5    9:aload_0         
	//*   6   10:getfield        #187 <Field float Y>
	//*   7   13:fload_2         
	//*   8   14:fcmpl           
	//*   9   15:ifne            19
		{
			return;
	//   10   18:return          
		} else
		{
			z.anchor(f1, f2);
	//   11   19:aload_0         
	//   12   20:getfield        #665 <Field MarkerOptions z>
	//   13   23:fload_1         
	//   14   24:fload_2         
	//   15   25:invokevirtual   #780 <Method MarkerOptions MarkerOptions.anchor(float, float)>
	//   16   28:pop             
			X = f1;
	//   17   29:aload_0         
	//   18   30:fload_1         
	//   19   31:putfield        #185 <Field float X>
			Y = f2;
	//   20   34:aload_0         
	//   21   35:fload_2         
	//   22   36:putfield        #187 <Field float Y>
			j = true;
	//   23   39:aload_0         
	//   24   40:iconst_1        
	//   25   41:putfield        #109 <Field boolean j>
			r();
	//   26   44:aload_0         
	//   27   45:invokespecial   #302 <Method void r()>
			return;
	//   28   48:return          
		}
	}

	public void setAnimation(Animation animation)
	{
		IAnimation ianimation = q();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #784 <Method IAnimation q()>
	//    2    4:astore_2        
		if(ianimation != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          30
		{
			if(animation == null)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       18
				animation = null;
	//    7   13:aconst_null     
	//    8   14:astore_1        
			else
	//*   9   15:goto            23
				animation = ((Animation) (animation.glAnimation));
	//   10   18:aload_1         
	//   11   19:getfield        #789 <Field GLAnimation Animation.glAnimation>
	//   12   22:astore_1        
			ianimation.setAnimation(((GLAnimation) (animation)));
	//   13   23:aload_2         
	//   14   24:aload_1         
	//   15   25:invokeinterface #791 <Method void IAnimation.setAnimation(GLAnimation)>
		}
	//   16   30:return          
	}

	public void setAnimation(GLAnimation glanimation)
	{
		if(glanimation == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			e = glanimation;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #793 <Field GLAnimation e>
			return;
	//    6   10:return          
		}
	}

	public void setAnimationListener(com.amap.api.maps.model.animation.Animation.AnimationListener animationlistener)
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #793 <Field GLAnimation e>
	//*   2    4:ifnull          15
			e.setAnimationListener(animationlistener);
	//    3    7:aload_0         
	//    4    8:getfield        #793 <Field GLAnimation e>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #797 <Method void GLAnimation.setAnimationListener(com.amap.api.maps.model.animation.Animation$AnimationListener)>
	//    7   15:return          
	}

	public void setAutoOverturnInfoWindow(boolean flag)
	{
		A = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #144 <Field boolean A>
		z.autoOverturnInfoWindow(flag);
	//    3    5:aload_0         
	//    4    6:getfield        #665 <Field MarkerOptions z>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #802 <Method MarkerOptions MarkerOptions.autoOverturnInfoWindow(boolean)>
	//    7   13:pop             
	//    8   14:return          
	}

	public void setBelowMaskLayer(boolean flag)
	{
		G = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #156 <Field boolean G>
	//    3    5:return          
	}

	public void setClickable(boolean flag)
	{
		D = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #150 <Field boolean D>
	//    3    5:return          
	}

	public void setDisplayLevel(int i1)
	{
		C = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #148 <Field int C>
		z.displayLevel(i1);
	//    3    5:aload_0         
	//    4    6:getfield        #665 <Field MarkerOptions z>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #809 <Method MarkerOptions MarkerOptions.displayLevel(int)>
	//    7   13:pop             
	//    8   14:return          
	}

	public void setDraggable(boolean flag)
	{
		Z = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #189 <Field boolean Z>
		z.draggable(flag);
	//    3    5:aload_0         
	//    4    6:getfield        #665 <Field MarkerOptions z>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #813 <Method MarkerOptions MarkerOptions.draggable(boolean)>
	//    7   13:pop             
		r();
	//    8   14:aload_0         
	//    9   15:invokespecial   #302 <Method void r()>
	//   10   18:return          
	}

	public void setFixingPointEnable(boolean flag)
	{
		E = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #152 <Field boolean E>
		if(!flag)
	//*   3    5:iload_1         
	//*   4    6:ifne            46
		{
			boolean flag1 = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
			if(ak)
	//*   7   11:aload_0         
	//*   8   12:getfield        #210 <Field boolean ak>
	//*   9   15:ifeq            20
				flag1 = true;
	//   10   18:iconst_1        
	//   11   19:istore_2        
			T = getPosition();
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:invokevirtual   #327 <Method LatLng getPosition()>
	//   15   25:putfield        #275 <Field LatLng T>
			setPosition(T);
	//   16   28:aload_0         
	//   17   29:aload_0         
	//   18   30:getfield        #275 <Field LatLng T>
	//   19   33:invokevirtual   #331 <Method void setPosition(LatLng)>
			if(flag1)
	//*  20   36:iload_2         
	//*  21   37:ifeq            45
				ak = true;
	//   22   40:aload_0         
	//   23   41:iconst_1        
	//   24   42:putfield        #210 <Field boolean ak>
			return;
	//   25   45:return          
		}
		if(ak && T != null)
	//*  26   46:aload_0         
	//*  27   47:getfield        #210 <Field boolean ak>
	//*  28   50:ifeq            110
	//*  29   53:aload_0         
	//*  30   54:getfield        #275 <Field LatLng T>
	//*  31   57:ifnull          110
		{
			FPoint fpoint = FPoint.obtain();
	//   32   60:invokestatic    #129 <Method FPoint FPoint.obtain()>
	//   33   63:astore_3        
			ab.d().c().p20ToScreenPoint(r, s, fpoint);
	//   34   64:aload_0         
	//   35   65:getfield        #229 <Field y ab>
	//   36   68:invokevirtual   #280 <Method s y.d()>
	//   37   71:invokeinterface #712 <Method GLMapState s.c()>
	//   38   76:aload_0         
	//   39   77:getfield        #251 <Field int r>
	//   40   80:aload_0         
	//   41   81:getfield        #253 <Field int s>
	//   42   84:aload_3         
	//   43   85:invokevirtual   #716 <Method void GLMapState.p20ToScreenPoint(int, int, FPoint)>
			al = (int)fpoint.x;
	//   44   88:aload_0         
	//   45   89:aload_3         
	//   46   90:getfield        #293 <Field float FPoint.x>
	//   47   93:f2i             
	//   48   94:putfield        #333 <Field int al>
			am = (int)fpoint.y;
	//   49   97:aload_0         
	//   50   98:aload_3         
	//   51   99:getfield        #297 <Field float FPoint.y>
	//   52  102:f2i             
	//   53  103:putfield        #338 <Field int am>
			fpoint.recycle();
	//   54  106:aload_3         
	//   55  107:invokevirtual   #743 <Method void FPoint.recycle()>
		}
	//   56  110:return          
	}

	public void setFlat(boolean flag)
		throws RemoteException
	{
		m = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #115 <Field boolean m>
		r();
	//    3    5:aload_0         
	//    4    6:invokespecial   #302 <Method void r()>
		z.setFlat(flag);
	//    5    9:aload_0         
	//    6   10:getfield        #665 <Field MarkerOptions z>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #817 <Method MarkerOptions MarkerOptions.setFlat(boolean)>
	//    9   17:pop             
	//   10   18:return          
	}

	public void setGeoPoint(IPoint ipoint)
	{
		ak = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #210 <Field boolean ak>
		a(ipoint.x, ipoint.y);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #357 <Field int IPoint.x>
	//    6   10:aload_1         
	//    7   11:getfield        #359 <Field int IPoint.y>
	//    8   14:invokespecial   #452 <Method void a(int, int)>
	//    9   17:return          
	}

	public void setIcon(BitmapDescriptor bitmapdescriptor)
	{
label0:
		{
			if(bitmapdescriptor != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
			{
				List list;
				try
				{
					list = ae;
	//    2    4:aload_0         
	//    3    5:getfield        #198 <Field List ae>
	//    4    8:astore_2        
				}
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       14
	//*   7   13:return          
	//*   8   14:aload_0         
	//*   9   15:monitorenter    
	//*  10   16:aload_0         
	//*  11   17:getfield        #198 <Field List ae>
	//*  12   20:invokeinterface #759 <Method void List.clear()>
	//*  13   25:aload_0         
	//*  14   26:getfield        #198 <Field List ae>
	//*  15   29:aload_1         
	//*  16   30:invokeinterface #579 <Method boolean List.add(Object)>
	//*  17   35:pop             
	//*  18   36:aload_0         
	//*  19   37:iconst_0        
	//*  20   38:putfield        #154 <Field boolean F>
	//*  21   41:aload_0         
	//*  22   42:iconst_0        
	//*  23   43:putfield        #202 <Field boolean ag>
	//*  24   46:aload_0         
	//*  25   47:iconst_0        
	//*  26   48:putfield        #105 <Field boolean h>
	//*  27   51:aload_0         
	//*  28   52:invokespecial   #302 <Method void r()>
	//*  29   55:aload_0         
	//*  30   56:iconst_1        
	//*  31   57:putfield        #109 <Field boolean j>
	//*  32   60:aload_0         
	//*  33   61:aload_1         
	//*  34   62:invokevirtual   #584 <Method int BitmapDescriptor.getWidth()>
	//*  35   65:putfield        #169 <Field int N>
	//*  36   68:aload_0         
	//*  37   69:aload_1         
	//*  38   70:invokevirtual   #585 <Method int BitmapDescriptor.getHeight()>
	//*  39   73:putfield        #171 <Field int O>
	//*  40   76:aload_0         
	//*  41   77:monitorexit     
	//*  42   78:goto            86
	//*  43   81:astore_1        
	//*  44   82:aload_0         
	//*  45   83:monitorexit     
	//*  46   84:aload_1         
	//*  47   85:athrow          
	//*  48   86:return          
				// Misplaced declaration of an exception variable
				catch(BitmapDescriptor bitmapdescriptor)
	//*  49   87:astore_1        
				{
					hm.c(((Throwable) (bitmapdescriptor)), "MarkerDelegateImp", "setIcon");
	//   50   88:aload_1         
	//   51   89:ldc2            #539 <String "MarkerDelegateImp">
	//   52   92:ldc2            #822 <String "setIcon">
	//   53   95:invokestatic    #546 <Method void hm.c(Throwable, String, String)>
					((Throwable) (bitmapdescriptor)).printStackTrace();
	//   54   98:aload_1         
	//   55   99:invokevirtual   #405 <Method void Throwable.printStackTrace()>
					return;
	//   56  102:return          
				}
				if(list != null)
					break label0;
			}
			return;
		}
		this;
		JVM INSTR monitorenter ;
		ae.clear();
		ae.add(((Object) (bitmapdescriptor)));
		F = false;
		ag = false;
		h = false;
		r();
		j = true;
		N = bitmapdescriptor.getWidth();
		O = bitmapdescriptor.getHeight();
		this;
		JVM INSTR monitorexit ;
		  goto _L1
		bitmapdescriptor;
		throw bitmapdescriptor;
_L1:
	}

	public void setIcons(ArrayList arraylist)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(arraylist == null)
			break MISSING_BLOCK_LABEL_15;
	//    2    2:aload_1         
	//    3    3:ifnull          15
		List list = ae;
	//    4    6:aload_0         
	//    5    7:getfield        #198 <Field List ae>
	//    6   10:astore_2        
		if(list != null)
			break MISSING_BLOCK_LABEL_18;
	//    7   11:aload_2         
	//    8   12:ifnonnull       18
		this;
	//    9   15:aload_0         
		JVM INSTR monitorexit ;
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		try
		{
			a(arraylist);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:invokevirtual   #825 <Method void a(ArrayList)>
			ag = false;
	//   15   23:aload_0         
	//   16   24:iconst_0        
	//   17   25:putfield        #202 <Field boolean ag>
			h = false;
	//   18   28:aload_0         
	//   19   29:iconst_0        
	//   20   30:putfield        #105 <Field boolean h>
			F = false;
	//   21   33:aload_0         
	//   22   34:iconst_0        
	//   23   35:putfield        #154 <Field boolean F>
			r();
	//   24   38:aload_0         
	//   25   39:invokespecial   #302 <Method void r()>
			j = true;
	//   26   42:aload_0         
	//   27   43:iconst_1        
	//   28   44:putfield        #109 <Field boolean j>
			break MISSING_BLOCK_LABEL_65;
	//   29   47:goto            65
		}
		// Misplaced declaration of an exception variable
		catch(ArrayList arraylist) { }
	//   30   50:astore_1        
		hm.c(((Throwable) (arraylist)), "MarkerDelegateImp", "setIcons");
	//   31   51:aload_1         
	//   32   52:ldc2            #539 <String "MarkerDelegateImp">
	//   33   55:ldc2            #826 <String "setIcons">
	//   34   58:invokestatic    #546 <Method void hm.c(Throwable, String, String)>
		((Throwable) (arraylist)).printStackTrace();
	//   35   61:aload_1         
	//   36   62:invokevirtual   #405 <Method void Throwable.printStackTrace()>
		this;
	//   37   65:aload_0         
		JVM INSTR monitorexit ;
	//   38   66:monitorexit     
		return;
	//   39   67:return          
		arraylist;
	//   40   68:astore_1        
	//*  41   69:aload_0         
		throw arraylist;
	//   42   70:monitorexit     
	//   43   71:aload_1         
	//   44   72:athrow          
	}

	public void setInfoWindowEnable(boolean flag)
	{
		B = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #146 <Field boolean B>
		if(!flag)
	//*   3    5:iload_1         
	//*   4    6:ifne            13
			hideInfoWindow();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #829 <Method void hideInfoWindow()>
		z.infoWindowEnable(flag);
	//    7   13:aload_0         
	//    8   14:getfield        #665 <Field MarkerOptions z>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #832 <Method MarkerOptions MarkerOptions.infoWindowEnable(boolean)>
	//   11   21:pop             
	//   12   22:return          
	}

	public void setMarkerOptions(MarkerOptions markeroptions)
	{
		if(markeroptions == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		z = markeroptions;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #665 <Field MarkerOptions z>
		T = z.getPosition();
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #665 <Field MarkerOptions z>
	//    9   15:invokevirtual   #833 <Method LatLng MarkerOptions.getPosition()>
	//   10   18:putfield        #275 <Field LatLng T>
		markeroptions = ((MarkerOptions) (IPoint.obtain()));
	//   11   21:invokestatic    #346 <Method IPoint IPoint.obtain()>
	//   12   24:astore_1        
		af = z.isGps();
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #665 <Field MarkerOptions z>
	//   16   30:invokevirtual   #836 <Method boolean MarkerOptions.isGps()>
	//   17   33:putfield        #200 <Field boolean af>
		if(z.getPosition() != null)
	//*  18   36:aload_0         
	//*  19   37:getfield        #665 <Field MarkerOptions z>
	//*  20   40:invokevirtual   #833 <Method LatLng MarkerOptions.getPosition()>
	//*  21   43:ifnull          150
			if(af)
	//*  22   46:aload_0         
	//*  23   47:getfield        #200 <Field boolean af>
	//*  24   50:ifeq            132
				try
				{
					double ad1[] = kl.a(z.getPosition().longitude, z.getPosition().latitude);
	//   25   53:aload_0         
	//   26   54:getfield        #665 <Field MarkerOptions z>
	//   27   57:invokevirtual   #833 <Method LatLng MarkerOptions.getPosition()>
	//   28   60:getfield        #839 <Field double LatLng.longitude>
	//   29   63:aload_0         
	//   30   64:getfield        #665 <Field MarkerOptions z>
	//   31   67:invokevirtual   #833 <Method LatLng MarkerOptions.getPosition()>
	//   32   70:getfield        #842 <Field double LatLng.latitude>
	//   33   73:invokestatic    #847 <Method double[] kl.a(double, double)>
	//   34   76:astore_2        
					U = new LatLng(ad1[1], ad1[0]);
	//   35   77:aload_0         
	//   36   78:new             #266 <Class LatLng>
	//   37   81:dup             
	//   38   82:aload_2         
	//   39   83:iconst_1        
	//   40   84:daload          
	//   41   85:aload_2         
	//   42   86:iconst_0        
	//   43   87:daload          
	//   44   88:invokespecial   #598 <Method void LatLng(double, double)>
	//   45   91:putfield        #600 <Field LatLng U>
					GLMapState.lonlat2Geo(ad1[0], ad1[1], ((IPoint) (markeroptions)));
	//   46   94:aload_2         
	//   47   95:iconst_0        
	//   48   96:daload          
	//   49   97:aload_2         
	//   50   98:iconst_1        
	//   51   99:daload          
	//   52  100:aload_1         
	//   53  101:invokestatic    #363 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
				}
	//*  54  104:goto            150
				catch(Throwable throwable)
	//*  55  107:astore_2        
				{
					hm.c(throwable, "MarkerDelegateImp", "create");
	//   56  108:aload_2         
	//   57  109:ldc2            #539 <String "MarkerDelegateImp">
	//   58  112:ldc2            #849 <String "create">
	//   59  115:invokestatic    #546 <Method void hm.c(Throwable, String, String)>
					U = z.getPosition();
	//   60  118:aload_0         
	//   61  119:aload_0         
	//   62  120:getfield        #665 <Field MarkerOptions z>
	//   63  123:invokevirtual   #833 <Method LatLng MarkerOptions.getPosition()>
	//   64  126:putfield        #600 <Field LatLng U>
				}
			else
	//*  65  129:goto            150
				GLMapState.lonlat2Geo(T.longitude, T.latitude, ((IPoint) (markeroptions)));
	//   66  132:aload_0         
	//   67  133:getfield        #275 <Field LatLng T>
	//   68  136:getfield        #839 <Field double LatLng.longitude>
	//   69  139:aload_0         
	//   70  140:getfield        #275 <Field LatLng T>
	//   71  143:getfield        #842 <Field double LatLng.latitude>
	//   72  146:aload_1         
	//   73  147:invokestatic    #363 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
		r = ((IPoint) (markeroptions)).x;
	//   74  150:aload_0         
	//   75  151:aload_1         
	//   76  152:getfield        #357 <Field int IPoint.x>
	//   77  155:putfield        #251 <Field int r>
		s = ((IPoint) (markeroptions)).y;
	//   78  158:aload_0         
	//   79  159:aload_1         
	//   80  160:getfield        #359 <Field int IPoint.y>
	//   81  163:putfield        #253 <Field int s>
		X = z.getAnchorU();
	//   82  166:aload_0         
	//   83  167:aload_0         
	//   84  168:getfield        #665 <Field MarkerOptions z>
	//   85  171:invokevirtual   #851 <Method float MarkerOptions.getAnchorU()>
	//   86  174:putfield        #185 <Field float X>
		Y = z.getAnchorV();
	//   87  177:aload_0         
	//   88  178:aload_0         
	//   89  179:getfield        #665 <Field MarkerOptions z>
	//   90  182:invokevirtual   #853 <Method float MarkerOptions.getAnchorV()>
	//   91  185:putfield        #187 <Field float Y>
		n = z.getInfoWindowOffsetX();
	//   92  188:aload_0         
	//   93  189:aload_0         
	//   94  190:getfield        #665 <Field MarkerOptions z>
	//   95  193:invokevirtual   #856 <Method int MarkerOptions.getInfoWindowOffsetX()>
	//   96  196:putfield        #117 <Field int n>
		o = z.getInfoWindowOffsetY();
	//   97  199:aload_0         
	//   98  200:aload_0         
	//   99  201:getfield        #665 <Field MarkerOptions z>
	//  100  204:invokevirtual   #859 <Method int MarkerOptions.getInfoWindowOffsetY()>
	//  101  207:putfield        #119 <Field int o>
		aj = z.getPeriod();
	//  102  210:aload_0         
	//  103  211:aload_0         
	//  104  212:getfield        #665 <Field MarkerOptions z>
	//  105  215:invokevirtual   #861 <Method int MarkerOptions.getPeriod()>
	//  106  218:putfield        #208 <Field int aj>
		v = z.getZIndex();
	//  107  221:aload_0         
	//  108  222:aload_0         
	//  109  223:getfield        #665 <Field MarkerOptions z>
	//  110  226:invokevirtual   #863 <Method float MarkerOptions.getZIndex()>
	//  111  229:putfield        #136 <Field float v>
		G = z.isBelowMaskLayer();
	//  112  232:aload_0         
	//  113  233:aload_0         
	//  114  234:getfield        #665 <Field MarkerOptions z>
	//  115  237:invokevirtual   #866 <Method boolean MarkerOptions.isBelowMaskLayer()>
	//  116  240:putfield        #156 <Field boolean G>
		p();
	//  117  243:aload_0         
	//  118  244:invokevirtual   #548 <Method boolean p()>
	//  119  247:pop             
		a(z.getIcons());
	//  120  248:aload_0         
	//  121  249:aload_0         
	//  122  250:getfield        #665 <Field MarkerOptions z>
	//  123  253:invokevirtual   #868 <Method ArrayList MarkerOptions.getIcons()>
	//  124  256:invokevirtual   #825 <Method void a(ArrayList)>
		aa = z.isVisible();
	//  125  259:aload_0         
	//  126  260:aload_0         
	//  127  261:getfield        #665 <Field MarkerOptions z>
	//  128  264:invokevirtual   #870 <Method boolean MarkerOptions.isVisible()>
	//  129  267:putfield        #191 <Field boolean aa>
		W = z.getSnippet();
	//  130  270:aload_0         
	//  131  271:aload_0         
	//  132  272:getfield        #665 <Field MarkerOptions z>
	//  133  275:invokevirtual   #872 <Method String MarkerOptions.getSnippet()>
	//  134  278:putfield        #673 <Field String W>
		V = z.getTitle();
	//  135  281:aload_0         
	//  136  282:aload_0         
	//  137  283:getfield        #665 <Field MarkerOptions z>
	//  138  286:invokevirtual   #874 <Method String MarkerOptions.getTitle()>
	//  139  289:putfield        #676 <Field String V>
		Z = z.isDraggable();
	//  140  292:aload_0         
	//  141  293:aload_0         
	//  142  294:getfield        #665 <Field MarkerOptions z>
	//  143  297:invokevirtual   #876 <Method boolean MarkerOptions.isDraggable()>
	//  144  300:putfield        #189 <Field boolean Z>
		S = getId();
	//  145  303:aload_0         
	//  146  304:aload_0         
	//  147  305:invokevirtual   #636 <Method String getId()>
	//  148  308:putfield        #656 <Field String S>
		ad = z.isPerspective();
	//  149  311:aload_0         
	//  150  312:aload_0         
	//  151  313:getfield        #665 <Field MarkerOptions z>
	//  152  316:invokevirtual   #878 <Method boolean MarkerOptions.isPerspective()>
	//  153  319:putfield        #193 <Field boolean ad>
		m = z.isFlat();
	//  154  322:aload_0         
	//  155  323:aload_0         
	//  156  324:getfield        #665 <Field MarkerOptions z>
	//  157  327:invokevirtual   #880 <Method boolean MarkerOptions.isFlat()>
	//  158  330:putfield        #115 <Field boolean m>
		G = z.isBelowMaskLayer();
	//  159  333:aload_0         
	//  160  334:aload_0         
	//  161  335:getfield        #665 <Field MarkerOptions z>
	//  162  338:invokevirtual   #866 <Method boolean MarkerOptions.isBelowMaskLayer()>
	//  163  341:putfield        #156 <Field boolean G>
		y = z.getAlpha();
	//  164  344:aload_0         
	//  165  345:aload_0         
	//  166  346:getfield        #665 <Field MarkerOptions z>
	//  167  349:invokevirtual   #882 <Method float MarkerOptions.getAlpha()>
	//  168  352:putfield        #142 <Field float y>
		setRotateAngle(z.getRotateAngle());
	//  169  355:aload_0         
	//  170  356:aload_0         
	//  171  357:getfield        #665 <Field MarkerOptions z>
	//  172  360:invokevirtual   #884 <Method float MarkerOptions.getRotateAngle()>
	//  173  363:invokevirtual   #445 <Method void setRotateAngle(float)>
		C = z.getDisplayLevel();
	//  174  366:aload_0         
	//  175  367:aload_0         
	//  176  368:getfield        #665 <Field MarkerOptions z>
	//  177  371:invokevirtual   #886 <Method int MarkerOptions.getDisplayLevel()>
	//  178  374:putfield        #148 <Field int C>
		A = z.isInfoWindowAutoOverturn();
	//  179  377:aload_0         
	//  180  378:aload_0         
	//  181  379:getfield        #665 <Field MarkerOptions z>
	//  182  382:invokevirtual   #888 <Method boolean MarkerOptions.isInfoWindowAutoOverturn()>
	//  183  385:putfield        #144 <Field boolean A>
		B = z.isInfoWindowEnable();
	//  184  388:aload_0         
	//  185  389:aload_0         
	//  186  390:getfield        #665 <Field MarkerOptions z>
	//  187  393:invokevirtual   #890 <Method boolean MarkerOptions.isInfoWindowEnable()>
	//  188  396:putfield        #146 <Field boolean B>
		a = new float[16];
	//  189  399:aload_0         
	//  190  400:bipush          16
	//  191  402:newarray        float[]
	//  192  404:putfield        #718 <Field float[] a>
		b = new float[4];
	//  193  407:aload_0         
	//  194  408:iconst_4        
	//  195  409:newarray        float[]
	//  196  411:putfield        #729 <Field float[] b>
		((IPoint) (markeroptions)).recycle();
	//  197  414:aload_1         
	//  198  415:invokevirtual   #360 <Method void IPoint.recycle()>
		eo.a().a(T, V, W);
	//  199  418:invokestatic    #895 <Method eo eo.a()>
	//  200  421:aload_0         
	//  201  422:getfield        #275 <Field LatLng T>
	//  202  425:aload_0         
	//  203  426:getfield        #676 <Field String V>
	//  204  429:aload_0         
	//  205  430:getfield        #673 <Field String W>
	//  206  433:invokevirtual   #898 <Method void eo.a(LatLng, String, String)>
	//  207  436:return          
	}

	public void setObject(Object obj)
	{
		ac = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #615 <Field Object ac>
	//    3    5:return          
	}

	public void setPeriod(int i1)
	{
		if(i1 <= 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpgt          11
		{
			aj = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #208 <Field int aj>
			return;
	//    6   10:return          
		} else
		{
			aj = i1;
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:putfield        #208 <Field int aj>
			return;
	//   10   16:return          
		}
	}

	public void setPerspective(boolean flag)
	{
		ad = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #193 <Field boolean ad>
	//    3    5:return          
	}

	public void setPosition(LatLng latlng)
	{
		if(latlng == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       24
		{
			hm.c(((Throwable) (new AMapException("\u975E\u6CD5\u5750\u6807\u503C latlng is null"))), "setPosition", "Marker");
	//    2    4:new             #904 <Class AMapException>
	//    3    7:dup             
	//    4    8:ldc2            #906 <String "\u975E\u6CD5\u5750\u6807\u503C latlng is null">
	//    5   11:invokespecial   #908 <Method void AMapException(String)>
	//    6   14:ldc2            #909 <String "setPosition">
	//    7   17:ldc2            #658 <String "Marker">
	//    8   20:invokestatic    #546 <Method void hm.c(Throwable, String, String)>
			return;
	//    9   23:return          
		}
		T = latlng;
	//   10   24:aload_0         
	//   11   25:aload_1         
	//   12   26:putfield        #275 <Field LatLng T>
		IPoint ipoint = IPoint.obtain();
	//   13   29:invokestatic    #346 <Method IPoint IPoint.obtain()>
	//   14   32:astore_2        
		if(af)
	//*  15   33:aload_0         
	//*  16   34:getfield        #200 <Field boolean af>
	//*  17   37:ifeq            91
			try
			{
				double ad1[] = kl.a(latlng.longitude, latlng.latitude);
	//   18   40:aload_1         
	//   19   41:getfield        #839 <Field double LatLng.longitude>
	//   20   44:aload_1         
	//   21   45:getfield        #842 <Field double LatLng.latitude>
	//   22   48:invokestatic    #847 <Method double[] kl.a(double, double)>
	//   23   51:astore_3        
				U = new LatLng(ad1[1], ad1[0]);
	//   24   52:aload_0         
	//   25   53:new             #266 <Class LatLng>
	//   26   56:dup             
	//   27   57:aload_3         
	//   28   58:iconst_1        
	//   29   59:daload          
	//   30   60:aload_3         
	//   31   61:iconst_0        
	//   32   62:daload          
	//   33   63:invokespecial   #598 <Method void LatLng(double, double)>
	//   34   66:putfield        #600 <Field LatLng U>
				GLMapState.lonlat2Geo(ad1[0], ad1[1], ipoint);
	//   35   69:aload_3         
	//   36   70:iconst_0        
	//   37   71:daload          
	//   38   72:aload_3         
	//   39   73:iconst_1        
	//   40   74:daload          
	//   41   75:aload_2         
	//   42   76:invokestatic    #363 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
			}
	//*  43   79:goto            103
			catch(Throwable throwable)
	//*  44   82:astore_3        
			{
				U = latlng;
	//   45   83:aload_0         
	//   46   84:aload_1         
	//   47   85:putfield        #600 <Field LatLng U>
			}
		else
	//*  48   88:goto            103
			GLMapState.lonlat2Geo(latlng.longitude, latlng.latitude, ipoint);
	//   49   91:aload_1         
	//   50   92:getfield        #839 <Field double LatLng.longitude>
	//   51   95:aload_1         
	//   52   96:getfield        #842 <Field double LatLng.latitude>
	//   53   99:aload_2         
	//   54  100:invokestatic    #363 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
		r = ipoint.x;
	//   55  103:aload_0         
	//   56  104:aload_2         
	//   57  105:getfield        #357 <Field int IPoint.x>
	//   58  108:putfield        #251 <Field int r>
		s = ipoint.y;
	//   59  111:aload_0         
	//   60  112:aload_2         
	//   61  113:getfield        #359 <Field int IPoint.y>
	//   62  116:putfield        #253 <Field int s>
		ak = false;
	//   63  119:aload_0         
	//   64  120:iconst_0        
	//   65  121:putfield        #210 <Field boolean ak>
		p();
	//   66  124:aload_0         
	//   67  125:invokevirtual   #548 <Method boolean p()>
	//   68  128:pop             
		r();
	//   69  129:aload_0         
	//   70  130:invokespecial   #302 <Method void r()>
		j = true;
	//   71  133:aload_0         
	//   72  134:iconst_1        
	//   73  135:putfield        #109 <Field boolean j>
		ipoint.recycle();
	//   74  138:aload_2         
	//   75  139:invokevirtual   #360 <Method void IPoint.recycle()>
	//   76  142:return          
	}

	public void setPositionByPixels(int i1, int j1)
	{
		al = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #333 <Field int al>
		am = j1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #338 <Field int am>
		ak = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #210 <Field boolean ak>
		p();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #548 <Method boolean p()>
	//   11   19:pop             
		r();
	//   12   20:aload_0         
	//   13   21:invokespecial   #302 <Method void r()>
		j = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #109 <Field boolean j>
	//   17   29:return          
	}

	public void setPositionNotUpdate(LatLng latlng)
	{
		setPosition(latlng);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #331 <Method void setPosition(LatLng)>
	//    3    5:return          
	}

	public void setRotateAngle(float f1)
	{
		z.rotateAngle(f1);
	//    0    0:aload_0         
	//    1    1:getfield        #665 <Field MarkerOptions z>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #914 <Method MarkerOptions MarkerOptions.rotateAngle(float)>
	//    4    8:pop             
		l = f1;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #113 <Field float l>
		k = (-f1 % 360F + 360F) % 360F;
	//    8   14:aload_0         
	//    9   15:fload_1         
	//   10   16:fneg            
	//   11   17:ldc2            #915 <Float 360F>
	//   12   20:frem            
	//   13   21:ldc2            #915 <Float 360F>
	//   14   24:fadd            
	//   15   25:ldc2            #915 <Float 360F>
	//   16   28:frem            
	//   17   29:putfield        #111 <Field float k>
		j = true;
	//   18   32:aload_0         
	//   19   33:iconst_1        
	//   20   34:putfield        #109 <Field boolean j>
		r();
	//   21   37:aload_0         
	//   22   38:invokespecial   #302 <Method void r()>
	//   23   41:return          
	}

	public void setRotateAngleNotUpdate(float f1)
	{
	//    0    0:return          
	}

	public void setSnippet(String s1)
	{
		W = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #673 <Field String W>
		r();
	//    3    5:aload_0         
	//    4    6:invokespecial   #302 <Method void r()>
		z.snippet(s1);
	//    5    9:aload_0         
	//    6   10:getfield        #665 <Field MarkerOptions z>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #921 <Method MarkerOptions MarkerOptions.snippet(String)>
	//    9   17:pop             
	//   10   18:return          
	}

	public void setTitle(String s1)
	{
		V = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #676 <Field String V>
		r();
	//    3    5:aload_0         
	//    4    6:invokespecial   #302 <Method void r()>
		z.title(s1);
	//    5    9:aload_0         
	//    6   10:getfield        #665 <Field MarkerOptions z>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #925 <Method MarkerOptions MarkerOptions.title(String)>
	//    9   17:pop             
		eo.a().a(T, V, W);
	//   10   18:invokestatic    #895 <Method eo eo.a()>
	//   11   21:aload_0         
	//   12   22:getfield        #275 <Field LatLng T>
	//   13   25:aload_0         
	//   14   26:getfield        #676 <Field String V>
	//   15   29:aload_0         
	//   16   30:getfield        #673 <Field String W>
	//   17   33:invokevirtual   #898 <Method void eo.a(LatLng, String, String)>
	//   18   36:return          
	}

	public void setVisible(boolean flag)
	{
		if(aa == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #191 <Field boolean aa>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		z.visible(flag);
	//    5    9:aload_0         
	//    6   10:getfield        #665 <Field MarkerOptions z>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #929 <Method MarkerOptions MarkerOptions.visible(boolean)>
	//    9   17:pop             
		aa = flag;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:putfield        #191 <Field boolean aa>
		if(!flag)
	//*  13   23:iload_1         
	//*  14   24:ifne            47
		{
			H = false;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #158 <Field boolean H>
			if(isInfoWindowShown())
	//*  18   32:aload_0         
	//*  19   33:invokevirtual   #563 <Method boolean isInfoWindowShown()>
	//*  20   36:ifeq            47
				ab.b(((de) (this)));
	//   21   39:aload_0         
	//   22   40:getfield        #229 <Field y ab>
	//   23   43:aload_0         
	//   24   44:invokevirtual   #706 <Method void y.b(de)>
		}
		r();
	//   25   47:aload_0         
	//   26   48:invokespecial   #302 <Method void r()>
	//   27   51:return          
	}

	public void setZIndex(float f1)
	{
		v = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #136 <Field float v>
		z.zIndex(f1);
	//    3    5:aload_0         
	//    4    6:getfield        #665 <Field MarkerOptions z>
	//    5    9:fload_1         
	//    6   10:invokevirtual   #933 <Method MarkerOptions MarkerOptions.zIndex(float)>
	//    7   13:pop             
		if(H)
	//*   8   14:aload_0         
	//*   9   15:getfield        #158 <Field boolean H>
	//*  10   18:iconst_1        
	//*  11   19:icmpne          34
		{
			H = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #158 <Field boolean H>
			ab.a();
	//   15   27:aload_0         
	//   16   28:getfield        #229 <Field y ab>
	//   17   31:invokevirtual   #935 <Method void y.a()>
		}
		ab.g();
	//   18   34:aload_0         
	//   19   35:getfield        #229 <Field y ab>
	//   20   38:invokevirtual   #936 <Method void y.g()>
	//   21   41:return          
	}

	public void showInfoWindow()
	{
		if(!aa)
	//*   0    0:aload_0         
	//*   1    1:getfield        #191 <Field boolean aa>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(!isInfoWindowEnable())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #938 <Method boolean isInfoWindowEnable()>
	//*   6   12:ifne            16
		{
			return;
	//    7   15:return          
		} else
		{
			ab.a(((k) (this)));
	//    8   16:aload_0         
	//    9   17:getfield        #229 <Field y ab>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #941 <Method void y.a(k)>
			r();
	//   12   24:aload_0         
	//   13   25:invokespecial   #302 <Method void r()>
			return;
	//   14   28:return          
		}
	}

	public boolean startAnimation()
	{
		if(e == null)
			break MISSING_BLOCK_LABEL_122;
	//    0    0:aload_0         
	//    1    1:getfield        #793 <Field GLAnimation e>
	//    2    4:ifnull          122
		Object obj = f;
	//    3    7:aload_0         
	//    4    8:getfield        #217 <Field Object f>
	//    5   11:astore_1        
		obj;
	//    6   12:aload_1         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		if(e instanceof GLAnimationSet)
	//*   8   14:aload_0         
	//*   9   15:getfield        #793 <Field GLAnimation e>
	//*  10   18:instanceof      #944 <Class GLAnimationSet>
	//*  11   21:ifeq            80
		{
			GLAnimationSet glanimationset = (GLAnimationSet)e;
	//   12   24:aload_0         
	//   13   25:getfield        #793 <Field GLAnimation e>
	//   14   28:checkcast       #944 <Class GLAnimationSet>
	//   15   31:astore_2        
			GLAnimation glanimation;
			for(Iterator iterator = glanimationset.getAnimations().iterator(); iterator.hasNext(); glanimation.setDuration(glanimationset.getDuration()))
	//*  16   32:aload_2         
	//*  17   33:invokevirtual   #948 <Method List GLAnimationSet.getAnimations()>
	//*  18   36:invokeinterface #478 <Method Iterator List.iterator()>
	//*  19   41:astore_3        
	//*  20   42:aload_3         
	//*  21   43:invokeinterface #483 <Method boolean Iterator.hasNext()>
	//*  22   48:ifeq            124
			{
				glanimation = (GLAnimation)iterator.next();
	//   23   51:aload_3         
	//   24   52:invokeinterface #487 <Method Object Iterator.next()>
	//   25   57:checkcast       #409 <Class GLAnimation>
	//   26   60:astore          4
				a(glanimation);
	//   27   62:aload_0         
	//   28   63:aload           4
	//   29   65:invokespecial   #950 <Method void a(GLAnimation)>
			}

	//   30   68:aload           4
	//   31   70:aload_2         
	//   32   71:invokevirtual   #953 <Method long GLAnimationSet.getDuration()>
	//   33   74:invokevirtual   #957 <Method void GLAnimation.setDuration(long)>
			break MISSING_BLOCK_LABEL_88;
	//   34   77:goto            42
		}
		a(e);
	//   35   80:aload_0         
	//   36   81:aload_0         
	//   37   82:getfield        #793 <Field GLAnimation e>
	//   38   85:invokespecial   #950 <Method void a(GLAnimation)>
		I = false;
	//   39   88:aload_0         
	//   40   89:iconst_0        
	//   41   90:putfield        #160 <Field boolean I>
		d = e;
	//   42   93:aload_0         
	//   43   94:aload_0         
	//   44   95:getfield        #793 <Field GLAnimation e>
	//   45   98:putfield        #407 <Field GLAnimation d>
		d.start();
	//   46  101:aload_0         
	//   47  102:getfield        #407 <Field GLAnimation d>
	//   48  105:invokevirtual   #960 <Method void GLAnimation.start()>
		obj;
	//   49  108:aload_1         
		JVM INSTR monitorexit ;
	//   50  109:monitorexit     
		  goto _L1
	//*  51  110:goto            118
		Exception exception;
		exception;
	//   52  113:astore_2        
	//*  53  114:aload_1         
		throw exception;
	//   54  115:monitorexit     
	//   55  116:aload_2         
	//   56  117:athrow          
_L1:
		r();
	//   57  118:aload_0         
	//   58  119:invokespecial   #302 <Method void r()>
		return false;
	//   59  122:iconst_0        
	//   60  123:ireturn         
	//*  61  124:goto            88
	}

	private static int g = 0;
	private boolean A;
	private boolean B;
	private int C;
	private boolean D;
	private boolean E;
	private boolean F;
	private boolean G;
	private boolean H;
	private boolean I;
	private FPoint J;
	private Point K;
	private float L;
	private float M;
	private int N;
	private int O;
	private ab P;
	private ab Q[];
	private boolean R;
	private String S;
	private LatLng T;
	private LatLng U;
	private String V;
	private String W;
	private float X;
	private float Y;
	private boolean Z;
	float a[];
	private boolean aa;
	private y ab;
	private Object ac;
	private boolean ad;
	private List ae;
	private boolean af;
	private boolean ag;
	private boolean ah;
	private int ai;
	private int aj;
	private boolean ak;
	private int al;
	private int am;
	private long an;
	private float ao;
	private float ap;
	private float aq;
	private float ar;
	float b[];
	Rect c;
	GLAnimation d;
	GLAnimation e;
	Object f;
	private boolean h;
	private boolean i;
	private boolean j;
	private float k;
	private float l;
	private boolean m;
	private int n;
	private int o;
	private int p;
	private int q;
	private int r;
	private int s;
	private FPoint t;
	private float u[] = {
		-1F, -1F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1F, 
		1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 
		0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, -1F, 0.0F, 
		0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F
	};
	private float v;
	private float w;
	private float x;
	private float y;
	private MarkerOptions z;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:putstatic       #98  <Field int g>
	//*   2    4:return          
	}
}
