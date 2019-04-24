// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.opengl.*;
import android.os.RemoteException;
import android.view.animation.AnimationUtils;
import com.amap.api.maps.model.*;
import com.amap.api.maps.model.animation.Animation;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.*;
import com.autonavi.amap.mapcore.animation.*;
import com.autonavi.amap.mapcore.interfaces.IglModel;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.amap.api.mapcore.util:
//			k, p, s, n, 
//			hm

public class cv extends k
	implements IglModel
{

	public cv(n n1, GL3DModelOptions gl3dmodeloptions, s s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void k()>
		e = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #63  <Field boolean e>
		g = new float[16];
	//    5    9:aload_0         
	//    6   10:bipush          16
	//    7   12:newarray        float[]
	//    8   14:putfield        #65  <Field float[] g>
		o = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #67  <Field boolean o>
		p = true;
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:putfield        #69  <Field boolean p>
		u = 18F;
	//   15   27:aload_0         
	//   16   28:ldc1            #70  <Float 18F>
	//   17   30:putfield        #72  <Field float u>
		v = -1F;
	//   18   33:aload_0         
	//   19   34:ldc1            #73  <Float -1F>
	//   20   36:putfield        #75  <Field float v>
		w = 0.0F;
	//   21   39:aload_0         
	//   22   40:fconst_0        
	//   23   41:putfield        #77  <Field float w>
		x = false;
	//   24   44:aload_0         
	//   25   45:iconst_0        
	//   26   46:putfield        #79  <Field boolean x>
		A = false;
	//   27   49:aload_0         
	//   28   50:iconst_0        
	//   29   51:putfield        #81  <Field boolean A>
		B = false;
	//   30   54:aload_0         
	//   31   55:iconst_0        
	//   32   56:putfield        #83  <Field boolean B>
		C = FPoint.obtain();
	//   33   59:aload_0         
	//   34   60:invokestatic    #89  <Method FPoint FPoint.obtain()>
	//   35   63:putfield        #91  <Field FPoint C>
		a = new float[16];
	//   36   66:aload_0         
	//   37   67:bipush          16
	//   38   69:newarray        float[]
	//   39   71:putfield        #93  <Field float[] a>
		b = new float[16];
	//   40   74:aload_0         
	//   41   75:bipush          16
	//   42   77:newarray        float[]
	//   43   79:putfield        #95  <Field float[] b>
		c = new Rect(0, 0, 0, 0);
	//   44   82:aload_0         
	//   45   83:new             #97  <Class Rect>
	//   46   86:dup             
	//   47   87:iconst_0        
	//   48   88:iconst_0        
	//   49   89:iconst_0        
	//   50   90:iconst_0        
	//   51   91:invokespecial   #100 <Method void Rect(int, int, int, int)>
	//   52   94:putfield        #102 <Field Rect c>
		D = 0;
	//   53   97:aload_0         
	//   54   98:iconst_0        
	//   55   99:putfield        #104 <Field int D>
		E = 0;
	//   56  102:aload_0         
	//   57  103:iconst_0        
	//   58  104:putfield        #106 <Field int E>
		F = 0.5F;
	//   59  107:aload_0         
	//   60  108:ldc1            #107 <Float 0.5F>
	//   61  110:putfield        #109 <Field float F>
		G = 0.5F;
	//   62  113:aload_0         
	//   63  114:ldc1            #107 <Float 0.5F>
	//   64  116:putfield        #111 <Field float G>
		d = 1.0F;
	//   65  119:aload_0         
	//   66  120:fconst_1        
	//   67  121:putfield        #113 <Field float d>
		J = -1F;
	//   68  124:aload_0         
	//   69  125:ldc1            #73  <Float -1F>
	//   70  127:putfield        #115 <Field float J>
		if(gl3dmodeloptions == null || s1 == null)
	//*  71  130:aload_2         
	//*  72  131:ifnull          138
	//*  73  134:aload_3         
	//*  74  135:ifnonnull       139
			return;
	//   75  138:return          
		y = n1;
	//   76  139:aload_0         
	//   77  140:aload_1         
	//   78  141:putfield        #117 <Field n y>
		j = s1;
	//   79  144:aload_0         
	//   80  145:aload_3         
	//   81  146:putfield        #119 <Field s j>
		i = gl3dmodeloptions.getBitmapDescriptor();
	//   82  149:aload_0         
	//   83  150:aload_2         
	//   84  151:invokevirtual   #125 <Method BitmapDescriptor GL3DModelOptions.getBitmapDescriptor()>
	//   85  154:putfield        #127 <Field BitmapDescriptor i>
		n1 = ((n) (gl3dmodeloptions.getTextrue()));
	//   86  157:aload_2         
	//   87  158:invokevirtual   #131 <Method List GL3DModelOptions.getTextrue()>
	//   88  161:astore_1        
		s1 = ((s) (gl3dmodeloptions.getVertext()));
	//   89  162:aload_2         
	//   90  163:invokevirtual   #134 <Method List GL3DModelOptions.getVertext()>
	//   91  166:astore_3        
		m = gl3dmodeloptions.getLatLng();
	//   92  167:aload_0         
	//   93  168:aload_2         
	//   94  169:invokevirtual   #138 <Method LatLng GL3DModelOptions.getLatLng()>
	//   95  172:putfield        #140 <Field LatLng m>
		s = gl3dmodeloptions.getAngle();
	//   96  175:aload_0         
	//   97  176:aload_2         
	//   98  177:invokevirtual   #144 <Method float GL3DModelOptions.getAngle()>
	//   99  180:putfield        #146 <Field float s>
		setModelFixedLength(gl3dmodeloptions.getModelFixedLength());
	//  100  183:aload_0         
	//  101  184:aload_2         
	//  102  185:invokevirtual   #150 <Method int GL3DModelOptions.getModelFixedLength()>
	//  103  188:invokevirtual   #154 <Method void setModelFixedLength(int)>
		if(m != null)
	//* 104  191:aload_0         
	//* 105  192:getfield        #140 <Field LatLng m>
	//* 106  195:ifnull          236
		{
			gl3dmodeloptions = ((GL3DModelOptions) (IPoint.obtain()));
	//  107  198:invokestatic    #159 <Method IPoint IPoint.obtain()>
	//  108  201:astore_2        
			GLMapState.lonlat2Geo(m.longitude, m.latitude, ((IPoint) (gl3dmodeloptions)));
	//  109  202:aload_0         
	//  110  203:getfield        #140 <Field LatLng m>
	//  111  206:getfield        #164 <Field double LatLng.longitude>
	//  112  209:aload_0         
	//  113  210:getfield        #140 <Field LatLng m>
	//  114  213:getfield        #167 <Field double LatLng.latitude>
	//  115  216:aload_2         
	//  116  217:invokestatic    #173 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
			k = ((IPoint) (gl3dmodeloptions)).x;
	//  117  220:aload_0         
	//  118  221:aload_2         
	//  119  222:getfield        #175 <Field int IPoint.x>
	//  120  225:putfield        #177 <Field int k>
			l = ((IPoint) (gl3dmodeloptions)).y;
	//  121  228:aload_0         
	//  122  229:aload_2         
	//  123  230:getfield        #179 <Field int IPoint.y>
	//  124  233:putfield        #181 <Field int l>
		}
		if(n1 != null && ((List) (n1)).size() > 0 && s1 != null)
	//* 125  236:aload_1         
	//* 126  237:ifnull          319
	//* 127  240:aload_1         
	//* 128  241:invokeinterface #186 <Method int List.size()>
	//* 129  246:ifle            319
	//* 130  249:aload_3         
	//* 131  250:ifnull          319
		{
			boolean flag;
			if(((List) (s1)).size() > 0)
	//* 132  253:aload_3         
	//* 133  254:invokeinterface #186 <Method int List.size()>
	//* 134  259:ifle            268
				flag = true;
	//  135  262:iconst_1        
	//  136  263:istore          4
			else
	//* 137  265:goto            271
				flag = false;
	//  138  268:iconst_0        
	//  139  269:istore          4
			boolean flag1;
			if(i != null)
	//* 140  271:aload_0         
	//* 141  272:getfield        #127 <Field BitmapDescriptor i>
	//* 142  275:ifnull          284
				flag1 = true;
	//  143  278:iconst_1        
	//  144  279:istore          5
			else
	//* 145  281:goto            287
				flag1 = false;
	//  146  284:iconst_0        
	//  147  285:istore          5
			if(flag & flag1)
	//* 148  287:iload           4
	//* 149  289:iload           5
	//* 150  291:iand            
	//* 151  292:ifeq            319
			{
				h = new p(((List) (s1)), ((List) (n1)));
	//  152  295:aload_0         
	//  153  296:new             #188 <Class p>
	//  154  299:dup             
	//  155  300:aload_3         
	//  156  301:aload_1         
	//  157  302:invokespecial   #191 <Method void p(List, List)>
	//  158  305:putfield        #193 <Field p h>
				h.a(s);
	//  159  308:aload_0         
	//  160  309:getfield        #193 <Field p h>
	//  161  312:aload_0         
	//  162  313:getfield        #146 <Field float s>
	//  163  316:invokevirtual   #196 <Method void p.a(float)>
			}
		}
		a = new float[16];
	//  164  319:aload_0         
	//  165  320:bipush          16
	//  166  322:newarray        float[]
	//  167  324:putfield        #93  <Field float[] a>
		b = new float[4];
	//  168  327:aload_0         
	//  169  328:iconst_4        
	//  170  329:newarray        float[]
	//  171  331:putfield        #95  <Field float[] b>
	//  172  334:return          
	}

	private int a(Bitmap bitmap)
	{
		if(bitmap != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			q = bitmap;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #200 <Field Bitmap q>
		bitmap = ((Bitmap) (new int[1]));
	//    5    9:iconst_1        
	//    6   10:newarray        int[]
	//    7   12:astore_1        
		GLES20.glGenTextures(1, ((int []) (bitmap)), 0);
	//    8   13:iconst_1        
	//    9   14:aload_1         
	//   10   15:iconst_0        
	//   11   16:invokestatic    #206 <Method void GLES20.glGenTextures(int, int[], int)>
		GLES20.glBindTexture(3553, bitmap[0]);
	//   12   19:sipush          3553
	//   13   22:aload_1         
	//   14   23:iconst_0        
	//   15   24:iaload          
	//   16   25:invokestatic    #210 <Method void GLES20.glBindTexture(int, int)>
		GLES20.glTexParameterf(3553, 10241, 9728F);
	//   17   28:sipush          3553
	//   18   31:sipush          10241
	//   19   34:ldc1            #211 <Float 9728F>
	//   20   36:invokestatic    #215 <Method void GLES20.glTexParameterf(int, int, float)>
		GLES20.glTexParameterf(3553, 10240, 9729F);
	//   21   39:sipush          3553
	//   22   42:sipush          10240
	//   23   45:ldc1            #216 <Float 9729F>
	//   24   47:invokestatic    #215 <Method void GLES20.glTexParameterf(int, int, float)>
		GLES20.glTexParameterf(3553, 10242, 33071F);
	//   25   50:sipush          3553
	//   26   53:sipush          10242
	//   27   56:ldc1            #217 <Float 33071F>
	//   28   58:invokestatic    #215 <Method void GLES20.glTexParameterf(int, int, float)>
		GLES20.glTexParameterf(3553, 10243, 33071F);
	//   29   61:sipush          3553
	//   30   64:sipush          10243
	//   31   67:ldc1            #217 <Float 33071F>
	//   32   69:invokestatic    #215 <Method void GLES20.glTexParameterf(int, int, float)>
		GLUtils.texImage2D(3553, 0, q, 0);
	//   33   72:sipush          3553
	//   34   75:iconst_0        
	//   35   76:aload_0         
	//   36   77:getfield        #200 <Field Bitmap q>
	//   37   80:iconst_0        
	//   38   81:invokestatic    #223 <Method void GLUtils.texImage2D(int, int, Bitmap, int)>
		return bitmap[0];
	//   39   84:aload_1         
	//   40   85:iconst_0        
	//   41   86:iaload          
	//   42   87:ireturn         
	}

	private void a(GLAnimation glanimation)
	{
		if(glanimation instanceof GLTranslateAnimation)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #226 <Class GLTranslateAnimation>
	//*   2    4:ifeq            81
		{
			((GLTranslateAnimation)glanimation).mFromXDelta = k;
	//    3    7:aload_1         
	//    4    8:checkcast       #226 <Class GLTranslateAnimation>
	//    5   11:aload_0         
	//    6   12:getfield        #177 <Field int k>
	//    7   15:i2d             
	//    8   16:putfield        #229 <Field double GLTranslateAnimation.mFromXDelta>
			((GLTranslateAnimation)glanimation).mFromYDelta = l;
	//    9   19:aload_1         
	//   10   20:checkcast       #226 <Class GLTranslateAnimation>
	//   11   23:aload_0         
	//   12   24:getfield        #181 <Field int l>
	//   13   27:i2d             
	//   14   28:putfield        #232 <Field double GLTranslateAnimation.mFromYDelta>
			IPoint ipoint = IPoint.obtain();
	//   15   31:invokestatic    #159 <Method IPoint IPoint.obtain()>
	//   16   34:astore_2        
			GLMapState.lonlat2Geo(((GLTranslateAnimation)glanimation).mToXDelta, ((GLTranslateAnimation)glanimation).mToYDelta, ipoint);
	//   17   35:aload_1         
	//   18   36:checkcast       #226 <Class GLTranslateAnimation>
	//   19   39:getfield        #235 <Field double GLTranslateAnimation.mToXDelta>
	//   20   42:aload_1         
	//   21   43:checkcast       #226 <Class GLTranslateAnimation>
	//   22   46:getfield        #238 <Field double GLTranslateAnimation.mToYDelta>
	//   23   49:aload_2         
	//   24   50:invokestatic    #173 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
			((GLTranslateAnimation)glanimation).mToXDelta = ipoint.x;
	//   25   53:aload_1         
	//   26   54:checkcast       #226 <Class GLTranslateAnimation>
	//   27   57:aload_2         
	//   28   58:getfield        #175 <Field int IPoint.x>
	//   29   61:i2d             
	//   30   62:putfield        #235 <Field double GLTranslateAnimation.mToXDelta>
			((GLTranslateAnimation)glanimation).mToYDelta = ipoint.y;
	//   31   65:aload_1         
	//   32   66:checkcast       #226 <Class GLTranslateAnimation>
	//   33   69:aload_2         
	//   34   70:getfield        #179 <Field int IPoint.y>
	//   35   73:i2d             
	//   36   74:putfield        #238 <Field double GLTranslateAnimation.mToYDelta>
			ipoint.recycle();
	//   37   77:aload_2         
	//   38   78:invokevirtual   #241 <Method void IPoint.recycle()>
		}
	//   39   81:return          
	}

	private float m()
	{
		float f1 = j.getMapConfig().getMapPerPixelUnitLength();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field s j>
	//    2    4:invokeinterface #247 <Method MapConfig s.getMapConfig()>
	//    3    9:invokevirtual   #252 <Method float MapConfig.getMapPerPixelUnitLength()>
	//    4   12:fstore_1        
		if(j.getMapConfig().getSZ() >= u)
	//*   5   13:aload_0         
	//*   6   14:getfield        #119 <Field s j>
	//*   7   17:invokeinterface #247 <Method MapConfig s.getMapConfig()>
	//*   8   22:invokevirtual   #255 <Method float MapConfig.getSZ()>
	//*   9   25:aload_0         
	//*  10   26:getfield        #72  <Field float u>
	//*  11   29:fcmpl           
	//*  12   30:iflt            41
			J = f1;
	//   13   33:aload_0         
	//   14   34:fload_1         
	//   15   35:putfield        #115 <Field float J>
		else
	//*  16   38:goto            48
			return f1 / v;
	//   17   41:fload_1         
	//   18   42:aload_0         
	//   19   43:getfield        #75  <Field float v>
	//   20   46:fdiv            
	//   21   47:freturn         
		return f1 / J;
	//   22   48:fload_1         
	//   23   49:aload_0         
	//   24   50:getfield        #115 <Field float J>
	//   25   53:fdiv            
	//   26   54:freturn         
	}

	private float n()
	{
		float f1 = w;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field float w>
	//    2    4:fstore_1        
		return (j.getMapConfig().getMapPerPixelUnitLength() * f1) / h.a();
	//    3    5:aload_0         
	//    4    6:getfield        #119 <Field s j>
	//    5    9:invokeinterface #247 <Method MapConfig s.getMapConfig()>
	//    6   14:invokevirtual   #252 <Method float MapConfig.getMapPerPixelUnitLength()>
	//    7   17:fload_1         
	//    8   18:fmul            
	//    9   19:aload_0         
	//   10   20:getfield        #193 <Field p h>
	//   11   23:invokevirtual   #257 <Method float p.a()>
	//   12   26:fdiv            
	//   13   27:freturn         
	}

	private void o()
	{
		if(!o && n != null && !n.hasEnded())
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field boolean o>
	//*   2    4:ifne            98
	//*   3    7:aload_0         
	//*   4    8:getfield        #259 <Field GLAnimation n>
	//*   5   11:ifnull          98
	//*   6   14:aload_0         
	//*   7   15:getfield        #259 <Field GLAnimation n>
	//*   8   18:invokevirtual   #265 <Method boolean GLAnimation.hasEnded()>
	//*   9   21:ifne            98
		{
			GLTransformation gltransformation = new GLTransformation();
	//   10   24:new             #267 <Class GLTransformation>
	//   11   27:dup             
	//   12   28:invokespecial   #268 <Method void GLTransformation()>
	//   13   31:astore          5
			n.getTransformation(AnimationUtils.currentAnimationTimeMillis(), gltransformation);
	//   14   33:aload_0         
	//   15   34:getfield        #259 <Field GLAnimation n>
	//   16   37:invokestatic    #274 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//   17   40:aload           5
	//   18   42:invokevirtual   #278 <Method boolean GLAnimation.getTransformation(long, GLTransformation)>
	//   19   45:pop             
			if(gltransformation != null && !Double.isNaN(gltransformation.x) && !Double.isNaN(gltransformation.y))
	//*  20   46:aload           5
	//*  21   48:ifnull          97
	//*  22   51:aload           5
	//*  23   53:getfield        #280 <Field double GLTransformation.x>
	//*  24   56:invokestatic    #286 <Method boolean Double.isNaN(double)>
	//*  25   59:ifne            97
	//*  26   62:aload           5
	//*  27   64:getfield        #288 <Field double GLTransformation.y>
	//*  28   67:invokestatic    #286 <Method boolean Double.isNaN(double)>
	//*  29   70:ifne            97
			{
				double d1 = gltransformation.x;
	//   30   73:aload           5
	//   31   75:getfield        #280 <Field double GLTransformation.x>
	//   32   78:dstore_1        
				double d2 = gltransformation.y;
	//   33   79:aload           5
	//   34   81:getfield        #288 <Field double GLTransformation.y>
	//   35   84:dstore_3        
				k = (int)d1;
	//   36   85:aload_0         
	//   37   86:dload_1         
	//   38   87:d2i             
	//   39   88:putfield        #177 <Field int k>
				l = (int)d2;
	//   40   91:aload_0         
	//   41   92:dload_3         
	//   42   93:d2i             
	//   43   94:putfield        #181 <Field int l>
			}
			return;
	//   44   97:return          
		} else
		{
			o = true;
	//   45   98:aload_0         
	//   46   99:iconst_1        
	//   47  100:putfield        #67  <Field boolean o>
			return;
	//   48  103:return          
		}
	}

	public FPoint a()
	{
		return C;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field FPoint C>
	//    2    4:areturn         
	}

	public void a(String s1)
	{
		f = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #291 <Field String f>
	//    3    5:return          
	}

	public void a(boolean flag)
	{
		A = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #81  <Field boolean A>
		B = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #83  <Field boolean B>
	//    6   10:return          
	}

	public LatLng b()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int c()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int d()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void destroy()
	{
		if(q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #200 <Field Bitmap q>
	//*   2    4:ifnull          14
			q.recycle();
	//    3    7:aload_0         
	//    4    8:getfield        #200 <Field Bitmap q>
	//    5   11:invokevirtual   #296 <Method void Bitmap.recycle()>
		y.a(z);
	//    6   14:aload_0         
	//    7   15:getfield        #117 <Field n y>
	//    8   18:aload_0         
	//    9   19:getfield        #298 <Field int z>
	//   10   22:invokevirtual   #302 <Method void n.a(int)>
		h.c();
	//   11   25:aload_0         
	//   12   26:getfield        #193 <Field p h>
	//   13   29:invokevirtual   #304 <Method void p.c()>
	//   14   32:return          
	}

	public int e()
	{
		return D;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int D>
	//    2    4:ireturn         
	}

	public int f()
	{
		return E;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field int E>
	//    2    4:ireturn         
	}

	public boolean g()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getId()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #291 <Field String f>
	//    2    4:areturn         
	}

	public Object getObject()
	{
		return t;
	//    0    0:aload_0         
	//    1    1:getfield        #310 <Field Object t>
	//    2    4:areturn         
	}

	public LatLng getPosition()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field LatLng m>
	//    2    4:areturn         
	}

	public float getRotateAngle()
	{
		return 0.0F;
	//    0    0:fconst_0        
	//    1    1:freturn         
	}

	public String getSnippet()
	{
		return H;
	//    0    0:aload_0         
	//    1    1:getfield        #315 <Field String H>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return I;
	//    0    0:aload_0         
	//    1    1:getfield        #318 <Field String I>
	//    2    4:areturn         
	}

	public boolean h()
	{
		return j.getMapConfig().getGeoRectangle().contains(k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field s j>
	//    2    4:invokeinterface #247 <Method MapConfig s.getMapConfig()>
	//    3    9:invokevirtual   #322 <Method Rectangle MapConfig.getGeoRectangle()>
	//    4   12:aload_0         
	//    5   13:getfield        #177 <Field int k>
	//    6   16:aload_0         
	//    7   17:getfield        #181 <Field int l>
	//    8   20:invokevirtual   #328 <Method boolean Rectangle.contains(int, int)>
	//    9   23:ifeq            28
	//   10   26:iconst_1        
	//   11   27:ireturn         
	//   12   28:iconst_0        
	//   13   29:ireturn         
	}

	public Rect i()
	{
		Object obj;
		try
		{
			GLMapState glmapstate = j.c();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field s j>
	//    2    4:invokeinterface #334 <Method GLMapState s.c()>
	//    3    9:astore          4
			int i1 = k();
	//    4   11:aload_0         
	//    5   12:invokevirtual   #336 <Method int k()>
	//    6   15:istore_1        
			int j1 = l();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #338 <Method int l()>
	//    9   20:istore_2        
			obj = ((Object) (FPoint.obtain()));
	//   10   21:invokestatic    #89  <Method FPoint FPoint.obtain()>
	//   11   24:astore_3        
			glmapstate.p20ToScreenPoint(k, l, ((FPoint) (obj)));
	//   12   25:aload           4
	//   13   27:aload_0         
	//   14   28:getfield        #177 <Field int k>
	//   15   31:aload_0         
	//   16   32:getfield        #181 <Field int l>
	//   17   35:aload_3         
	//   18   36:invokevirtual   #342 <Method void GLMapState.p20ToScreenPoint(int, int, FPoint)>
			Matrix.setIdentityM(a, 0);
	//   19   39:aload_0         
	//   20   40:getfield        #93  <Field float[] a>
	//   21   43:iconst_0        
	//   22   44:invokestatic    #348 <Method void Matrix.setIdentityM(float[], int)>
			Matrix.rotateM(a, 0, -s, 0.0F, 0.0F, 1.0F);
	//   23   47:aload_0         
	//   24   48:getfield        #93  <Field float[] a>
	//   25   51:iconst_0        
	//   26   52:aload_0         
	//   27   53:getfield        #146 <Field float s>
	//   28   56:fneg            
	//   29   57:fconst_0        
	//   30   58:fconst_0        
	//   31   59:fconst_1        
	//   32   60:invokestatic    #352 <Method void Matrix.rotateM(float[], int, float, float, float, float)>
			Matrix.rotateM(a, 0, j.getMapConfig().getSC(), 1.0F, 0.0F, 0.0F);
	//   33   63:aload_0         
	//   34   64:getfield        #93  <Field float[] a>
	//   35   67:iconst_0        
	//   36   68:aload_0         
	//   37   69:getfield        #119 <Field s j>
	//   38   72:invokeinterface #247 <Method MapConfig s.getMapConfig()>
	//   39   77:invokevirtual   #355 <Method float MapConfig.getSC()>
	//   40   80:fconst_1        
	//   41   81:fconst_0        
	//   42   82:fconst_0        
	//   43   83:invokestatic    #352 <Method void Matrix.rotateM(float[], int, float, float, float, float)>
			Matrix.rotateM(a, 0, j.getMapConfig().getSR(), 0.0F, 0.0F, 1.0F);
	//   44   86:aload_0         
	//   45   87:getfield        #93  <Field float[] a>
	//   46   90:iconst_0        
	//   47   91:aload_0         
	//   48   92:getfield        #119 <Field s j>
	//   49   95:invokeinterface #247 <Method MapConfig s.getMapConfig()>
	//   50  100:invokevirtual   #358 <Method float MapConfig.getSR()>
	//   51  103:fconst_0        
	//   52  104:fconst_0        
	//   53  105:fconst_1        
	//   54  106:invokestatic    #352 <Method void Matrix.rotateM(float[], int, float, float, float, float)>
			float af[] = new float[4];
	//   55  109:iconst_4        
	//   56  110:newarray        float[]
	//   57  112:astore          4
			b[0] = (float)(-i1) * F;
	//   58  114:aload_0         
	//   59  115:getfield        #95  <Field float[] b>
	//   60  118:iconst_0        
	//   61  119:iload_1         
	//   62  120:ineg            
	//   63  121:i2f             
	//   64  122:aload_0         
	//   65  123:getfield        #109 <Field float F>
	//   66  126:fmul            
	//   67  127:fastore         
			b[1] = (float)j1 * G;
	//   68  128:aload_0         
	//   69  129:getfield        #95  <Field float[] b>
	//   70  132:iconst_1        
	//   71  133:iload_2         
	//   72  134:i2f             
	//   73  135:aload_0         
	//   74  136:getfield        #111 <Field float G>
	//   75  139:fmul            
	//   76  140:fastore         
			b[2] = 0.0F;
	//   77  141:aload_0         
	//   78  142:getfield        #95  <Field float[] b>
	//   79  145:iconst_2        
	//   80  146:fconst_0        
	//   81  147:fastore         
			b[3] = 1.0F;
	//   82  148:aload_0         
	//   83  149:getfield        #95  <Field float[] b>
	//   84  152:iconst_3        
	//   85  153:fconst_1        
	//   86  154:fastore         
			Matrix.multiplyMV(af, 0, a, 0, b, 0);
	//   87  155:aload           4
	//   88  157:iconst_0        
	//   89  158:aload_0         
	//   90  159:getfield        #93  <Field float[] a>
	//   91  162:iconst_0        
	//   92  163:aload_0         
	//   93  164:getfield        #95  <Field float[] b>
	//   94  167:iconst_0        
	//   95  168:invokestatic    #362 <Method void Matrix.multiplyMV(float[], int, float[], int, float[], int)>
			c.set((int)(((FPoint) (obj)).x + af[0]), (int)(((FPoint) (obj)).y - af[1]), (int)(((FPoint) (obj)).x + af[0]), (int)(((FPoint) (obj)).y - af[1]));
	//   96  171:aload_0         
	//   97  172:getfield        #102 <Field Rect c>
	//   98  175:aload_3         
	//   99  176:getfield        #364 <Field float FPoint.x>
	//  100  179:aload           4
	//  101  181:iconst_0        
	//  102  182:faload          
	//  103  183:fadd            
	//  104  184:f2i             
	//  105  185:aload_3         
	//  106  186:getfield        #366 <Field float FPoint.y>
	//  107  189:aload           4
	//  108  191:iconst_1        
	//  109  192:faload          
	//  110  193:fsub            
	//  111  194:f2i             
	//  112  195:aload_3         
	//  113  196:getfield        #364 <Field float FPoint.x>
	//  114  199:aload           4
	//  115  201:iconst_0        
	//  116  202:faload          
	//  117  203:fadd            
	//  118  204:f2i             
	//  119  205:aload_3         
	//  120  206:getfield        #366 <Field float FPoint.y>
	//  121  209:aload           4
	//  122  211:iconst_1        
	//  123  212:faload          
	//  124  213:fsub            
	//  125  214:f2i             
	//  126  215:invokevirtual   #369 <Method void Rect.set(int, int, int, int)>
			b[0] = (float)i1 * (1.0F - F);
	//  127  218:aload_0         
	//  128  219:getfield        #95  <Field float[] b>
	//  129  222:iconst_0        
	//  130  223:iload_1         
	//  131  224:i2f             
	//  132  225:fconst_1        
	//  133  226:aload_0         
	//  134  227:getfield        #109 <Field float F>
	//  135  230:fsub            
	//  136  231:fmul            
	//  137  232:fastore         
			b[1] = (float)j1 * G;
	//  138  233:aload_0         
	//  139  234:getfield        #95  <Field float[] b>
	//  140  237:iconst_1        
	//  141  238:iload_2         
	//  142  239:i2f             
	//  143  240:aload_0         
	//  144  241:getfield        #111 <Field float G>
	//  145  244:fmul            
	//  146  245:fastore         
			b[2] = 0.0F;
	//  147  246:aload_0         
	//  148  247:getfield        #95  <Field float[] b>
	//  149  250:iconst_2        
	//  150  251:fconst_0        
	//  151  252:fastore         
			b[3] = 1.0F;
	//  152  253:aload_0         
	//  153  254:getfield        #95  <Field float[] b>
	//  154  257:iconst_3        
	//  155  258:fconst_1        
	//  156  259:fastore         
			Matrix.multiplyMV(af, 0, a, 0, b, 0);
	//  157  260:aload           4
	//  158  262:iconst_0        
	//  159  263:aload_0         
	//  160  264:getfield        #93  <Field float[] a>
	//  161  267:iconst_0        
	//  162  268:aload_0         
	//  163  269:getfield        #95  <Field float[] b>
	//  164  272:iconst_0        
	//  165  273:invokestatic    #362 <Method void Matrix.multiplyMV(float[], int, float[], int, float[], int)>
			c.union((int)(((FPoint) (obj)).x + af[0]), (int)(((FPoint) (obj)).y - af[1]));
	//  166  276:aload_0         
	//  167  277:getfield        #102 <Field Rect c>
	//  168  280:aload_3         
	//  169  281:getfield        #364 <Field float FPoint.x>
	//  170  284:aload           4
	//  171  286:iconst_0        
	//  172  287:faload          
	//  173  288:fadd            
	//  174  289:f2i             
	//  175  290:aload_3         
	//  176  291:getfield        #366 <Field float FPoint.y>
	//  177  294:aload           4
	//  178  296:iconst_1        
	//  179  297:faload          
	//  180  298:fsub            
	//  181  299:f2i             
	//  182  300:invokevirtual   #372 <Method void Rect.union(int, int)>
			b[0] = (float)i1 * (1.0F - F);
	//  183  303:aload_0         
	//  184  304:getfield        #95  <Field float[] b>
	//  185  307:iconst_0        
	//  186  308:iload_1         
	//  187  309:i2f             
	//  188  310:fconst_1        
	//  189  311:aload_0         
	//  190  312:getfield        #109 <Field float F>
	//  191  315:fsub            
	//  192  316:fmul            
	//  193  317:fastore         
			b[1] = (float)(-j1) * (1.0F - G);
	//  194  318:aload_0         
	//  195  319:getfield        #95  <Field float[] b>
	//  196  322:iconst_1        
	//  197  323:iload_2         
	//  198  324:ineg            
	//  199  325:i2f             
	//  200  326:fconst_1        
	//  201  327:aload_0         
	//  202  328:getfield        #111 <Field float G>
	//  203  331:fsub            
	//  204  332:fmul            
	//  205  333:fastore         
			b[2] = 0.0F;
	//  206  334:aload_0         
	//  207  335:getfield        #95  <Field float[] b>
	//  208  338:iconst_2        
	//  209  339:fconst_0        
	//  210  340:fastore         
			b[3] = 1.0F;
	//  211  341:aload_0         
	//  212  342:getfield        #95  <Field float[] b>
	//  213  345:iconst_3        
	//  214  346:fconst_1        
	//  215  347:fastore         
			Matrix.multiplyMV(af, 0, a, 0, b, 0);
	//  216  348:aload           4
	//  217  350:iconst_0        
	//  218  351:aload_0         
	//  219  352:getfield        #93  <Field float[] a>
	//  220  355:iconst_0        
	//  221  356:aload_0         
	//  222  357:getfield        #95  <Field float[] b>
	//  223  360:iconst_0        
	//  224  361:invokestatic    #362 <Method void Matrix.multiplyMV(float[], int, float[], int, float[], int)>
			c.union((int)(((FPoint) (obj)).x + af[0]), (int)(((FPoint) (obj)).y - af[1]));
	//  225  364:aload_0         
	//  226  365:getfield        #102 <Field Rect c>
	//  227  368:aload_3         
	//  228  369:getfield        #364 <Field float FPoint.x>
	//  229  372:aload           4
	//  230  374:iconst_0        
	//  231  375:faload          
	//  232  376:fadd            
	//  233  377:f2i             
	//  234  378:aload_3         
	//  235  379:getfield        #366 <Field float FPoint.y>
	//  236  382:aload           4
	//  237  384:iconst_1        
	//  238  385:faload          
	//  239  386:fsub            
	//  240  387:f2i             
	//  241  388:invokevirtual   #372 <Method void Rect.union(int, int)>
			b[0] = (float)(-i1) * F;
	//  242  391:aload_0         
	//  243  392:getfield        #95  <Field float[] b>
	//  244  395:iconst_0        
	//  245  396:iload_1         
	//  246  397:ineg            
	//  247  398:i2f             
	//  248  399:aload_0         
	//  249  400:getfield        #109 <Field float F>
	//  250  403:fmul            
	//  251  404:fastore         
			b[1] = (float)(-j1) * (1.0F - G);
	//  252  405:aload_0         
	//  253  406:getfield        #95  <Field float[] b>
	//  254  409:iconst_1        
	//  255  410:iload_2         
	//  256  411:ineg            
	//  257  412:i2f             
	//  258  413:fconst_1        
	//  259  414:aload_0         
	//  260  415:getfield        #111 <Field float G>
	//  261  418:fsub            
	//  262  419:fmul            
	//  263  420:fastore         
			b[2] = 0.0F;
	//  264  421:aload_0         
	//  265  422:getfield        #95  <Field float[] b>
	//  266  425:iconst_2        
	//  267  426:fconst_0        
	//  268  427:fastore         
			b[3] = 1.0F;
	//  269  428:aload_0         
	//  270  429:getfield        #95  <Field float[] b>
	//  271  432:iconst_3        
	//  272  433:fconst_1        
	//  273  434:fastore         
			Matrix.multiplyMV(af, 0, a, 0, b, 0);
	//  274  435:aload           4
	//  275  437:iconst_0        
	//  276  438:aload_0         
	//  277  439:getfield        #93  <Field float[] a>
	//  278  442:iconst_0        
	//  279  443:aload_0         
	//  280  444:getfield        #95  <Field float[] b>
	//  281  447:iconst_0        
	//  282  448:invokestatic    #362 <Method void Matrix.multiplyMV(float[], int, float[], int, float[], int)>
			c.union((int)(((FPoint) (obj)).x + af[0]), (int)(((FPoint) (obj)).y - af[1]));
	//  283  451:aload_0         
	//  284  452:getfield        #102 <Field Rect c>
	//  285  455:aload_3         
	//  286  456:getfield        #364 <Field float FPoint.x>
	//  287  459:aload           4
	//  288  461:iconst_0        
	//  289  462:faload          
	//  290  463:fadd            
	//  291  464:f2i             
	//  292  465:aload_3         
	//  293  466:getfield        #366 <Field float FPoint.y>
	//  294  469:aload           4
	//  295  471:iconst_1        
	//  296  472:faload          
	//  297  473:fsub            
	//  298  474:f2i             
	//  299  475:invokevirtual   #372 <Method void Rect.union(int, int)>
			D = c.centerX() - (int)((FPoint) (obj)).x;
	//  300  478:aload_0         
	//  301  479:aload_0         
	//  302  480:getfield        #102 <Field Rect c>
	//  303  483:invokevirtual   #375 <Method int Rect.centerX()>
	//  304  486:aload_3         
	//  305  487:getfield        #364 <Field float FPoint.x>
	//  306  490:f2i             
	//  307  491:isub            
	//  308  492:putfield        #104 <Field int D>
			E = c.top - (int)((FPoint) (obj)).y;
	//  309  495:aload_0         
	//  310  496:aload_0         
	//  311  497:getfield        #102 <Field Rect c>
	//  312  500:getfield        #378 <Field int Rect.top>
	//  313  503:aload_3         
	//  314  504:getfield        #366 <Field float FPoint.y>
	//  315  507:f2i             
	//  316  508:isub            
	//  317  509:putfield        #106 <Field int E>
			((FPoint) (obj)).recycle();
	//  318  512:aload_3         
	//  319  513:invokevirtual   #379 <Method void FPoint.recycle()>
			obj = ((Object) (c));
	//  320  516:aload_0         
	//  321  517:getfield        #102 <Field Rect c>
	//  322  520:astore_3        
		}
	//* 323  521:aload_3         
	//* 324  522:areturn         
		catch(Throwable throwable)
	//* 325  523:astore_3        
		{
			hm.c(throwable, "MarkerDelegateImp", "getRect");
	//  326  524:aload_3         
	//  327  525:ldc2            #381 <String "MarkerDelegateImp">
	//  328  528:ldc2            #383 <String "getRect">
	//  329  531:invokestatic    #388 <Method void hm.c(Throwable, String, String)>
			throwable.printStackTrace();
	//  330  534:aload_3         
	//  331  535:invokevirtual   #391 <Method void Throwable.printStackTrace()>
			return new Rect(0, 0, 0, 0);
	//  332  538:new             #97  <Class Rect>
	//  333  541:dup             
	//  334  542:iconst_0        
	//  335  543:iconst_0        
	//  336  544:iconst_0        
	//  337  545:iconst_0        
	//  338  546:invokespecial   #100 <Method void Rect(int, int, int, int)>
	//  339  549:areturn         
		}
		return ((Rect) (obj));
	}

	public boolean isInfoWindowEnable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isVisible()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field boolean p>
	//    2    4:ireturn         
	}

	public void j()
	{
		try
		{
			if(h == null)
				break MISSING_BLOCK_LABEL_286;
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field p h>
	//    2    4:ifnull          286
			if(r == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #397 <Field ds$b r>
	//*   5   11:ifnonnull       31
				r = (ds.b)j.t(5);
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #119 <Field s j>
	//    9   19:iconst_5        
	//   10   20:invokeinterface #400 <Method dr s.t(int)>
	//   11   25:checkcast       #402 <Class ds$b>
	//   12   28:putfield        #397 <Field ds$b r>
			if(v == -1F)
	//*  13   31:aload_0         
	//*  14   32:getfield        #75  <Field float v>
	//*  15   35:ldc1            #73  <Float -1F>
	//*  16   37:fcmpl           
	//*  17   38:ifne            59
				v = j.u((int)u);
	//   18   41:aload_0         
	//   19   42:aload_0         
	//   20   43:getfield        #119 <Field s j>
	//   21   46:aload_0         
	//   22   47:getfield        #72  <Field float u>
	//   23   50:f2i             
	//   24   51:invokeinterface #405 <Method float s.u(int)>
	//   25   56:putfield        #75  <Field float v>
			if(e)
	//*  26   59:aload_0         
	//*  27   60:getfield        #63  <Field boolean e>
	//*  28   63:ifeq            97
			{
				z = a(i.getBitmap());
	//   29   66:aload_0         
	//   30   67:aload_0         
	//   31   68:aload_0         
	//   32   69:getfield        #127 <Field BitmapDescriptor i>
	//   33   72:invokevirtual   #411 <Method Bitmap BitmapDescriptor.getBitmap()>
	//   34   75:invokespecial   #413 <Method int a(Bitmap)>
	//   35   78:putfield        #298 <Field int z>
				h.a(z);
	//   36   81:aload_0         
	//   37   82:getfield        #193 <Field p h>
	//   38   85:aload_0         
	//   39   86:getfield        #298 <Field int z>
	//   40   89:invokevirtual   #414 <Method void p.a(int)>
				e = false;
	//   41   92:aload_0         
	//   42   93:iconst_0        
	//   43   94:putfield        #63  <Field boolean e>
			}
			o();
	//   44   97:aload_0         
	//   45   98:invokespecial   #416 <Method void o()>
			int i1 = k - j.getMapConfig().getSX();
	//   46  101:aload_0         
	//   47  102:getfield        #177 <Field int k>
	//   48  105:aload_0         
	//   49  106:getfield        #119 <Field s j>
	//   50  109:invokeinterface #247 <Method MapConfig s.getMapConfig()>
	//   51  114:invokevirtual   #419 <Method int MapConfig.getSX()>
	//   52  117:isub            
	//   53  118:istore_1        
			C.x = i1;
	//   54  119:aload_0         
	//   55  120:getfield        #91  <Field FPoint C>
	//   56  123:iload_1         
	//   57  124:i2f             
	//   58  125:putfield        #364 <Field float FPoint.x>
			int j1 = l - j.getMapConfig().getSY();
	//   59  128:aload_0         
	//   60  129:getfield        #181 <Field int l>
	//   61  132:aload_0         
	//   62  133:getfield        #119 <Field s j>
	//   63  136:invokeinterface #247 <Method MapConfig s.getMapConfig()>
	//   64  141:invokevirtual   #422 <Method int MapConfig.getSY()>
	//   65  144:isub            
	//   66  145:istore_2        
			C.y = j1;
	//   67  146:aload_0         
	//   68  147:getfield        #91  <Field FPoint C>
	//   69  150:iload_2         
	//   70  151:i2f             
	//   71  152:putfield        #366 <Field float FPoint.y>
			Matrix.setIdentityM(g, 0);
	//   72  155:aload_0         
	//   73  156:getfield        #65  <Field float[] g>
	//   74  159:iconst_0        
	//   75  160:invokestatic    #348 <Method void Matrix.setIdentityM(float[], int)>
			Matrix.multiplyMM(g, 0, j.getProjectionMatrix(), 0, j.getViewMatrix(), 0);
	//   76  163:aload_0         
	//   77  164:getfield        #65  <Field float[] g>
	//   78  167:iconst_0        
	//   79  168:aload_0         
	//   80  169:getfield        #119 <Field s j>
	//   81  172:invokeinterface #426 <Method float[] s.getProjectionMatrix()>
	//   82  177:iconst_0        
	//   83  178:aload_0         
	//   84  179:getfield        #119 <Field s j>
	//   85  182:invokeinterface #429 <Method float[] s.getViewMatrix()>
	//   86  187:iconst_0        
	//   87  188:invokestatic    #432 <Method void Matrix.multiplyMM(float[], int, float[], int, float[], int)>
			Matrix.translateM(g, 0, i1, j1, 0.0F);
	//   88  191:aload_0         
	//   89  192:getfield        #65  <Field float[] g>
	//   90  195:iconst_0        
	//   91  196:iload_1         
	//   92  197:i2f             
	//   93  198:iload_2         
	//   94  199:i2f             
	//   95  200:fconst_0        
	//   96  201:invokestatic    #436 <Method void Matrix.translateM(float[], int, float, float, float)>
			if(x)
	//*  97  204:aload_0         
	//*  98  205:getfield        #79  <Field boolean x>
	//*  99  208:ifeq            222
			{
				d = n();
	//  100  211:aload_0         
	//  101  212:aload_0         
	//  102  213:invokespecial   #438 <Method float n()>
	//  103  216:putfield        #113 <Field float d>
				break MISSING_BLOCK_LABEL_230;
	//  104  219:goto            230
			}
		}
	//* 105  222:aload_0         
	//* 106  223:aload_0         
	//* 107  224:invokespecial   #440 <Method float m()>
	//* 108  227:putfield        #113 <Field float d>
	//* 109  230:aload_0         
	//* 110  231:getfield        #65  <Field float[] g>
	//* 111  234:iconst_0        
	//* 112  235:aload_0         
	//* 113  236:getfield        #113 <Field float d>
	//* 114  239:aload_0         
	//* 115  240:getfield        #113 <Field float d>
	//* 116  243:aload_0         
	//* 117  244:getfield        #113 <Field float d>
	//* 118  247:invokestatic    #443 <Method void Matrix.scaleM(float[], int, float, float, float)>
	//* 119  250:aload_0         
	//* 120  251:getfield        #193 <Field p h>
	//* 121  254:aload_0         
	//* 122  255:getfield        #397 <Field ds$b r>
	//* 123  258:aload_0         
	//* 124  259:getfield        #65  <Field float[] g>
	//* 125  262:invokevirtual   #446 <Method void p.a(ds$b, float[])>
	//* 126  265:aload_0         
	//* 127  266:getfield        #83  <Field boolean B>
	//* 128  269:ifeq            286
	//* 129  272:aload_0         
	//* 130  273:getfield        #119 <Field s j>
	//* 131  276:invokeinterface #448 <Method void s.j()>
	//* 132  281:aload_0         
	//* 133  282:iconst_0        
	//* 134  283:putfield        #83  <Field boolean B>
	//* 135  286:return          
		catch(Exception exception)
	//* 136  287:astore_3        
		{
			exception.printStackTrace();
	//  137  288:aload_3         
	//  138  289:invokevirtual   #449 <Method void Exception.printStackTrace()>
			return;
	//  139  292:return          
		}
		d = m();
		Matrix.scaleM(g, 0, d, d, d);
		h.a(r, g);
		if(B)
		{
			j.j();
			B = false;
		}
	}

	public int k()
	{
		float f1 = j.getMapConfig().getMapPerPixelUnitLength();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field s j>
	//    2    4:invokeinterface #247 <Method MapConfig s.getMapConfig()>
	//    3    9:invokevirtual   #252 <Method float MapConfig.getMapPerPixelUnitLength()>
	//    4   12:fstore_1        
		return (int)((h.b() * d) / f1);
	//    5   13:aload_0         
	//    6   14:getfield        #193 <Field p h>
	//    7   17:invokevirtual   #451 <Method float p.b()>
	//    8   20:aload_0         
	//    9   21:getfield        #113 <Field float d>
	//   10   24:fmul            
	//   11   25:fload_1         
	//   12   26:fdiv            
	//   13   27:f2i             
	//   14   28:ireturn         
	}

	public int l()
	{
		float f1 = j.getMapConfig().getMapPerPixelUnitLength();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field s j>
	//    2    4:invokeinterface #247 <Method MapConfig s.getMapConfig()>
	//    3    9:invokevirtual   #252 <Method float MapConfig.getMapPerPixelUnitLength()>
	//    4   12:fstore_1        
		return (int)((h.a() * d) / f1);
	//    5   13:aload_0         
	//    6   14:getfield        #193 <Field p h>
	//    7   17:invokevirtual   #257 <Method float p.a()>
	//    8   20:aload_0         
	//    9   21:getfield        #113 <Field float d>
	//   10   24:fmul            
	//   11   25:fload_1         
	//   12   26:fdiv            
	//   13   27:f2i             
	//   14   28:ireturn         
	}

	public boolean remove()
	{
		if(j != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #119 <Field s j>
	//*   2    4:ifnull          21
			j.b(f);
	//    3    7:aload_0         
	//    4    8:getfield        #119 <Field s j>
	//    5   11:aload_0         
	//    6   12:getfield        #291 <Field String f>
	//    7   15:invokeinterface #455 <Method boolean s.b(String)>
	//    8   20:pop             
		return true;
	//    9   21:iconst_1        
	//   10   22:ireturn         
	}

	public void setAnimation(Animation animation)
	{
		if(animation == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			n = animation.glAnimation;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #462 <Field GLAnimation Animation.glAnimation>
	//    6   10:putfield        #259 <Field GLAnimation n>
			return;
	//    7   13:return          
		}
	}

	public void setGeoPoint(IPoint ipoint)
	{
		if(ipoint != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          60
		{
			k = ipoint.x;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #175 <Field int IPoint.x>
	//    5    9:putfield        #177 <Field int k>
			l = ipoint.y;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #179 <Field int IPoint.y>
	//    9   17:putfield        #181 <Field int l>
			ipoint = ((IPoint) (DPoint.obtain()));
	//   10   20:invokestatic    #469 <Method DPoint DPoint.obtain()>
	//   11   23:astore_1        
			GLMapState.geo2LonLat(k, l, ((DPoint) (ipoint)));
	//   12   24:aload_0         
	//   13   25:getfield        #177 <Field int k>
	//   14   28:aload_0         
	//   15   29:getfield        #181 <Field int l>
	//   16   32:aload_1         
	//   17   33:invokestatic    #473 <Method void GLMapState.geo2LonLat(int, int, DPoint)>
			m = new LatLng(((DPoint) (ipoint)).y, ((DPoint) (ipoint)).x, false);
	//   18   36:aload_0         
	//   19   37:new             #161 <Class LatLng>
	//   20   40:dup             
	//   21   41:aload_1         
	//   22   42:getfield        #474 <Field double DPoint.y>
	//   23   45:aload_1         
	//   24   46:getfield        #475 <Field double DPoint.x>
	//   25   49:iconst_0        
	//   26   50:invokespecial   #478 <Method void LatLng(double, double, boolean)>
	//   27   53:putfield        #140 <Field LatLng m>
			((DPoint) (ipoint)).recycle();
	//   28   56:aload_1         
	//   29   57:invokevirtual   #479 <Method void DPoint.recycle()>
		}
		j.requestRender();
	//   30   60:aload_0         
	//   31   61:getfield        #119 <Field s j>
	//   32   64:invokeinterface #482 <Method void s.requestRender()>
	//   33   69:return          
	}

	public void setModelFixedLength(int i1)
	{
		if(i1 > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            16
		{
			w = i1;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:i2f             
	//    5    7:putfield        #77  <Field float w>
			x = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #79  <Field boolean x>
			return;
	//    9   15:return          
		} else
		{
			w = 0.0F;
	//   10   16:aload_0         
	//   11   17:fconst_0        
	//   12   18:putfield        #77  <Field float w>
			x = false;
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:putfield        #79  <Field boolean x>
			return;
	//   16   26:return          
		}
	}

	public void setObject(Object obj)
	{
		t = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #310 <Field Object t>
	//    3    5:return          
	}

	public void setPosition(LatLng latlng)
	{
		if(latlng != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          45
		{
			m = latlng;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #140 <Field LatLng m>
			IPoint ipoint = IPoint.obtain();
	//    5    9:invokestatic    #159 <Method IPoint IPoint.obtain()>
	//    6   12:astore_2        
			GLMapState.lonlat2Geo(latlng.longitude, latlng.latitude, ipoint);
	//    7   13:aload_1         
	//    8   14:getfield        #164 <Field double LatLng.longitude>
	//    9   17:aload_1         
	//   10   18:getfield        #167 <Field double LatLng.latitude>
	//   11   21:aload_2         
	//   12   22:invokestatic    #173 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
			k = ipoint.x;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:getfield        #175 <Field int IPoint.x>
	//   16   30:putfield        #177 <Field int k>
			l = ipoint.y;
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:getfield        #179 <Field int IPoint.y>
	//   20   38:putfield        #181 <Field int l>
			ipoint.recycle();
	//   21   41:aload_2         
	//   22   42:invokevirtual   #241 <Method void IPoint.recycle()>
		}
		B = true;
	//   23   45:aload_0         
	//   24   46:iconst_1        
	//   25   47:putfield        #83  <Field boolean B>
		j.requestRender();
	//   26   50:aload_0         
	//   27   51:getfield        #119 <Field s j>
	//   28   54:invokeinterface #482 <Method void s.requestRender()>
	//   29   59:return          
	}

	public void setRotateAngle(float f1)
	{
		s = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #146 <Field float s>
		if(h != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #193 <Field p h>
	//*   5    9:ifnull          38
		{
			f1 = j.getMapConfig().getSR();
	//    6   12:aload_0         
	//    7   13:getfield        #119 <Field s j>
	//    8   16:invokeinterface #247 <Method MapConfig s.getMapConfig()>
	//    9   21:invokevirtual   #358 <Method float MapConfig.getSR()>
	//   10   24:fstore_1        
			h.a(s - f1);
	//   11   25:aload_0         
	//   12   26:getfield        #193 <Field p h>
	//   13   29:aload_0         
	//   14   30:getfield        #146 <Field float s>
	//   15   33:fload_1         
	//   16   34:fsub            
	//   17   35:invokevirtual   #196 <Method void p.a(float)>
		}
		B = true;
	//   18   38:aload_0         
	//   19   39:iconst_1        
	//   20   40:putfield        #83  <Field boolean B>
	//   21   43:return          
	}

	public void setSnippet(String s1)
	{
		H = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #315 <Field String H>
	//    3    5:return          
	}

	public void setTitle(String s1)
	{
		I = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #318 <Field String I>
	//    3    5:return          
	}

	public void setVisible(boolean flag)
	{
		p = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field boolean p>
	//    3    5:return          
	}

	public void setZoomLimit(float f1)
	{
		u = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #72  <Field float u>
		v = j.u((int)u);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #119 <Field s j>
	//    6   10:aload_0         
	//    7   11:getfield        #72  <Field float u>
	//    8   14:f2i             
	//    9   15:invokeinterface #405 <Method float s.u(int)>
	//   10   20:putfield        #75  <Field float v>
	//   11   23:return          
	}

	public void showInfoWindow()
	{
		try
		{
			j.a(((k) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field s j>
	//    2    4:aload_0         
	//    3    5:invokeinterface #497 <Method void s.a(k)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_1        
		{
			remoteexception.printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #498 <Method void RemoteException.printStackTrace()>
		}
	//    8   16:return          
	}

	public boolean startAnimation()
	{
		if(n != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #259 <Field GLAnimation n>
	//*   2    4:ifnull          93
		{
			if(n instanceof GLAnimationSet)
	//*   3    7:aload_0         
	//*   4    8:getfield        #259 <Field GLAnimation n>
	//*   5   11:instanceof      #501 <Class GLAnimationSet>
	//*   6   14:ifeq            73
			{
				GLAnimationSet glanimationset = (GLAnimationSet)n;
	//    7   17:aload_0         
	//    8   18:getfield        #259 <Field GLAnimation n>
	//    9   21:checkcast       #501 <Class GLAnimationSet>
	//   10   24:astore_1        
				GLAnimation glanimation;
				for(Iterator iterator = glanimationset.getAnimations().iterator(); iterator.hasNext(); glanimation.setDuration(glanimationset.getDuration()))
	//*  11   25:aload_1         
	//*  12   26:invokevirtual   #504 <Method List GLAnimationSet.getAnimations()>
	//*  13   29:invokeinterface #508 <Method Iterator List.iterator()>
	//*  14   34:astore_2        
	//*  15   35:aload_2         
	//*  16   36:invokeinterface #513 <Method boolean Iterator.hasNext()>
	//*  17   41:ifeq            70
				{
					glanimation = (GLAnimation)iterator.next();
	//   18   44:aload_2         
	//   19   45:invokeinterface #516 <Method Object Iterator.next()>
	//   20   50:checkcast       #261 <Class GLAnimation>
	//   21   53:astore_3        
					a(glanimation);
	//   22   54:aload_0         
	//   23   55:aload_3         
	//   24   56:invokespecial   #518 <Method void a(GLAnimation)>
				}

	//   25   59:aload_3         
	//   26   60:aload_1         
	//   27   61:invokevirtual   #521 <Method long GLAnimationSet.getDuration()>
	//   28   64:invokevirtual   #525 <Method void GLAnimation.setDuration(long)>
			} else
	//*  29   67:goto            35
	//*  30   70:goto            81
			{
				a(n);
	//   31   73:aload_0         
	//   32   74:aload_0         
	//   33   75:getfield        #259 <Field GLAnimation n>
	//   34   78:invokespecial   #518 <Method void a(GLAnimation)>
			}
			o = false;
	//   35   81:aload_0         
	//   36   82:iconst_0        
	//   37   83:putfield        #67  <Field boolean o>
			n.start();
	//   38   86:aload_0         
	//   39   87:getfield        #259 <Field GLAnimation n>
	//   40   90:invokevirtual   #528 <Method void GLAnimation.start()>
		}
		return false;
	//   41   93:iconst_0        
	//   42   94:ireturn         
	}

	private boolean A;
	private boolean B;
	private FPoint C;
	private int D;
	private int E;
	private float F;
	private float G;
	private String H;
	private String I;
	private float J;
	float a[];
	float b[];
	Rect c;
	float d;
	private boolean e;
	private String f;
	private float g[];
	private p h;
	private BitmapDescriptor i;
	private s j;
	private int k;
	private int l;
	private LatLng m;
	private GLAnimation n;
	private boolean o;
	private boolean p;
	private Bitmap q;
	private ds.b r;
	private float s;
	private Object t;
	private float u;
	private float v;
	private float w;
	private boolean x;
	private n y;
	private int z;
}
