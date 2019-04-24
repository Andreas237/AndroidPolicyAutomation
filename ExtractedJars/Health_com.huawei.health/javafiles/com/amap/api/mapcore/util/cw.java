// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.os.RemoteException;
import android.util.Log;
import com.amap.api.maps.model.*;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.*;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.amap.api.mapcore.util:
//			da, hm, s, ab, 
//			fd, q

public class cw
	implements da
{

	private cw(s s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		k = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #52  <Field boolean k>
		l = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #54  <Field float l>
		m = 1.0F;
	//    8   14:aload_0         
	//    9   15:fconst_1        
	//   10   16:putfield        #56  <Field float m>
		n = 0.5F;
	//   11   19:aload_0         
	//   12   20:ldc1            #57  <Float 0.5F>
	//   13   22:putfield        #59  <Field float n>
		o = 0.5F;
	//   14   25:aload_0         
	//   15   26:ldc1            #57  <Float 0.5F>
	//   16   28:putfield        #61  <Field float o>
		q = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #63  <Field FloatBuffer q>
		t = false;
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:putfield        #65  <Field boolean t>
		u = false;
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:putfield        #67  <Field boolean u>
		v = ((List) (new ArrayList()));
	//   26   46:aload_0         
	//   27   47:new             #69  <Class ArrayList>
	//   28   50:dup             
	//   29   51:invokespecial   #70  <Method void ArrayList()>
	//   30   54:putfield        #72  <Field List v>
		a = null;
	//   31   57:aload_0         
	//   32   58:aconst_null     
	//   33   59:putfield        #74  <Field float[] a>
		c = s1;
	//   34   62:aload_0         
	//   35   63:aload_1         
	//   36   64:putfield        #76  <Field s c>
		try
		{
			p = getId();
	//   37   67:aload_0         
	//   38   68:aload_0         
	//   39   69:invokevirtual   #80  <Method String getId()>
	//   40   72:putfield        #82  <Field String p>
			return;
	//   41   75:return          
		}
		// Misplaced declaration of an exception variable
		catch(s s1)
	//*  42   76:astore_1        
		{
			hm.c(((Throwable) (s1)), "GroundOverlayDelegateImp", "create");
	//   43   77:aload_1         
	//   44   78:ldc1            #84  <String "GroundOverlayDelegateImp">
	//   45   80:ldc1            #86  <String "create">
	//   46   82:invokestatic    #91  <Method void hm.c(Throwable, String, String)>
		}
		((RemoteException) (s1)).printStackTrace();
	//   47   85:aload_1         
	//   48   86:invokevirtual   #94  <Method void RemoteException.printStackTrace()>
	//   49   89:return          
	}

	public cw(s s1, q q1)
	{
		this(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #98  <Method void cw(s)>
		w = q1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #100 <Field q w>
	//    6   10:return          
	}

	private int a(boolean flag, BitmapDescriptor bitmapdescriptor)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		ab ab1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		if(flag)
	//*   4    6:iload_1         
	//*   5    7:ifeq            37
		{
			ab ab2 = c.a(bitmapdescriptor);
	//    6   10:aload_0         
	//    7   11:getfield        #76  <Field s c>
	//    8   14:aload_2         
	//    9   15:invokeinterface #106 <Method ab s.a(BitmapDescriptor)>
	//   10   20:astore          6
			ab1 = ab2;
	//   11   22:aload           6
	//   12   24:astore          5
			if(ab2 != null)
	//*  13   26:aload           6
	//*  14   28:ifnull          37
				return ab2.f();
	//   15   31:aload           6
	//   16   33:invokevirtual   #111 <Method int ab.f()>
	//   17   36:ireturn         
		}
		ab ab3 = ab1;
	//   18   37:aload           5
	//   19   39:astore          6
		if(ab1 == null)
	//*  20   41:aload           5
	//*  21   43:ifnonnull       57
			ab3 = new ab(bitmapdescriptor, 0);
	//   22   46:new             #108 <Class ab>
	//   23   49:dup             
	//   24   50:aload_2         
	//   25   51:iconst_0        
	//   26   52:invokespecial   #114 <Method void ab(BitmapDescriptor, int)>
	//   27   55:astore          6
		int i1 = ((int) (flag1));
	//   28   57:iload           4
	//   29   59:istore_3        
		if(true)
	//*  30   60:iconst_0        
	//*  31   61:ifne            131
		{
			bitmapdescriptor = ((BitmapDescriptor) (bitmapdescriptor.getBitmap()));
	//   32   64:aload_2         
	//   33   65:invokevirtual   #120 <Method Bitmap BitmapDescriptor.getBitmap()>
	//   34   68:astore_2        
			i1 = ((int) (flag1));
	//   35   69:iload           4
	//   36   71:istore_3        
			if(bitmapdescriptor != null)
	//*  37   72:aload_2         
	//*  38   73:ifnull          131
			{
				i1 = ((int) (flag1));
	//   39   76:iload           4
	//   40   78:istore_3        
				if(!((Bitmap) (bitmapdescriptor)).isRecycled())
	//*  41   79:aload_2         
	//*  42   80:invokevirtual   #126 <Method boolean Bitmap.isRecycled()>
	//*  43   83:ifne            131
				{
					i1 = h();
	//   44   86:aload_0         
	//   45   87:invokespecial   #128 <Method int h()>
	//   46   90:istore_3        
					ab3.a(i1);
	//   47   91:aload           6
	//   48   93:iload_3         
	//   49   94:invokevirtual   #131 <Method void ab.a(int)>
					if(flag)
	//*  50   97:iload_1         
	//*  51   98:ifeq            112
						c.a(ab3);
	//   52  101:aload_0         
	//   53  102:getfield        #76  <Field s c>
	//   54  105:aload           6
	//   55  107:invokeinterface #134 <Method void s.a(ab)>
					v.add(((Object) (ab3)));
	//   56  112:aload_0         
	//   57  113:getfield        #72  <Field List v>
	//   58  116:aload           6
	//   59  118:invokeinterface #140 <Method boolean List.add(Object)>
	//   60  123:pop             
					fd.b(i1, ((Bitmap) (bitmapdescriptor)), true);
	//   61  124:iload_3         
	//   62  125:aload_2         
	//   63  126:iconst_1        
	//   64  127:invokestatic    #145 <Method int fd.b(int, Bitmap, boolean)>
	//   65  130:pop             
				}
			}
		}
		return i1;
	//   66  131:iload_3         
	//   67  132:ireturn         
	}

	private void a(int i1, FloatBuffer floatbuffer, FloatBuffer floatbuffer1)
	{
		if(floatbuffer == null || floatbuffer1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          8
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       9
			return;
	//    4    8:return          
		if(b == null || b.c())
	//*   5    9:aload_0         
	//*   6   10:getfield        #148 <Field ds$c b>
	//*   7   13:ifnull          26
	//*   8   16:aload_0         
	//*   9   17:getfield        #148 <Field ds$c b>
	//*  10   20:invokevirtual   #152 <Method boolean ds$c.c()>
	//*  11   23:ifeq            30
			i();
	//   12   26:aload_0         
	//   13   27:invokespecial   #154 <Method void i()>
		b.a();
	//   14   30:aload_0         
	//   15   31:getfield        #148 <Field ds$c b>
	//   16   34:invokevirtual   #156 <Method void ds$c.a()>
		GLES20.glEnable(3042);
	//   17   37:sipush          3042
	//   18   40:invokestatic    #161 <Method void GLES20.glEnable(int)>
		GLES20.glBlendFunc(1, 771);
	//   19   43:iconst_1        
	//   20   44:sipush          771
	//   21   47:invokestatic    #165 <Method void GLES20.glBlendFunc(int, int)>
		GLES20.glBlendColor(m * 1.0F, m * 1.0F, m * 1.0F, m);
	//   22   50:aload_0         
	//   23   51:getfield        #56  <Field float m>
	//   24   54:fconst_1        
	//   25   55:fmul            
	//   26   56:aload_0         
	//   27   57:getfield        #56  <Field float m>
	//   28   60:fconst_1        
	//   29   61:fmul            
	//   30   62:aload_0         
	//   31   63:getfield        #56  <Field float m>
	//   32   66:fconst_1        
	//   33   67:fmul            
	//   34   68:aload_0         
	//   35   69:getfield        #56  <Field float m>
	//   36   72:invokestatic    #169 <Method void GLES20.glBlendColor(float, float, float, float)>
		GLES20.glActiveTexture(33984);
	//   37   75:ldc1            #170 <Int 33984>
	//   38   77:invokestatic    #173 <Method void GLES20.glActiveTexture(int)>
		GLES20.glBindTexture(3553, i1);
	//   39   80:sipush          3553
	//   40   83:iload_1         
	//   41   84:invokestatic    #176 <Method void GLES20.glBindTexture(int, int)>
		GLES20.glEnableVertexAttribArray(b.b);
	//   42   87:aload_0         
	//   43   88:getfield        #148 <Field ds$c b>
	//   44   91:getfield        #178 <Field int ds$c.b>
	//   45   94:invokestatic    #181 <Method void GLES20.glEnableVertexAttribArray(int)>
		GLES20.glVertexAttribPointer(b.b, 4, 5126, false, 16, ((java.nio.Buffer) (floatbuffer)));
	//   46   97:aload_0         
	//   47   98:getfield        #148 <Field ds$c b>
	//   48  101:getfield        #178 <Field int ds$c.b>
	//   49  104:iconst_4        
	//   50  105:sipush          5126
	//   51  108:iconst_0        
	//   52  109:bipush          16
	//   53  111:aload_2         
	//   54  112:invokestatic    #185 <Method void GLES20.glVertexAttribPointer(int, int, int, boolean, int, java.nio.Buffer)>
		GLES20.glEnableVertexAttribArray(b.c);
	//   55  115:aload_0         
	//   56  116:getfield        #148 <Field ds$c b>
	//   57  119:getfield        #187 <Field int ds$c.c>
	//   58  122:invokestatic    #181 <Method void GLES20.glEnableVertexAttribArray(int)>
		GLES20.glVertexAttribPointer(b.c, 2, 5126, false, 8, ((java.nio.Buffer) (floatbuffer1)));
	//   59  125:aload_0         
	//   60  126:getfield        #148 <Field ds$c b>
	//   61  129:getfield        #187 <Field int ds$c.c>
	//   62  132:iconst_2        
	//   63  133:sipush          5126
	//   64  136:iconst_0        
	//   65  137:bipush          8
	//   66  139:aload_3         
	//   67  140:invokestatic    #185 <Method void GLES20.glVertexAttribPointer(int, int, int, boolean, int, java.nio.Buffer)>
		GLES20.glUniform4f(b.g, c.getMapConfig().getSX() / 10000, c.getMapConfig().getSY() / 10000, c.getMapConfig().getSX() % 10000, c.getMapConfig().getSY() % 10000);
	//   68  143:aload_0         
	//   69  144:getfield        #148 <Field ds$c b>
	//   70  147:getfield        #189 <Field int ds$c.g>
	//   71  150:aload_0         
	//   72  151:getfield        #76  <Field s c>
	//   73  154:invokeinterface #193 <Method MapConfig s.getMapConfig()>
	//   74  159:invokevirtual   #198 <Method int MapConfig.getSX()>
	//   75  162:sipush          10000
	//   76  165:idiv            
	//   77  166:i2f             
	//   78  167:aload_0         
	//   79  168:getfield        #76  <Field s c>
	//   80  171:invokeinterface #193 <Method MapConfig s.getMapConfig()>
	//   81  176:invokevirtual   #201 <Method int MapConfig.getSY()>
	//   82  179:sipush          10000
	//   83  182:idiv            
	//   84  183:i2f             
	//   85  184:aload_0         
	//   86  185:getfield        #76  <Field s c>
	//   87  188:invokeinterface #193 <Method MapConfig s.getMapConfig()>
	//   88  193:invokevirtual   #198 <Method int MapConfig.getSX()>
	//   89  196:sipush          10000
	//   90  199:irem            
	//   91  200:i2f             
	//   92  201:aload_0         
	//   93  202:getfield        #76  <Field s c>
	//   94  205:invokeinterface #193 <Method MapConfig s.getMapConfig()>
	//   95  210:invokevirtual   #201 <Method int MapConfig.getSY()>
	//   96  213:sipush          10000
	//   97  216:irem            
	//   98  217:i2f             
	//   99  218:invokestatic    #205 <Method void GLES20.glUniform4f(int, float, float, float, float)>
		GLES20.glUniform4f(b.h, m * 1.0F, m * 1.0F, m * 1.0F, m);
	//  100  221:aload_0         
	//  101  222:getfield        #148 <Field ds$c b>
	//  102  225:getfield        #207 <Field int ds$c.h>
	//  103  228:aload_0         
	//  104  229:getfield        #56  <Field float m>
	//  105  232:fconst_1        
	//  106  233:fmul            
	//  107  234:aload_0         
	//  108  235:getfield        #56  <Field float m>
	//  109  238:fconst_1        
	//  110  239:fmul            
	//  111  240:aload_0         
	//  112  241:getfield        #56  <Field float m>
	//  113  244:fconst_1        
	//  114  245:fmul            
	//  115  246:aload_0         
	//  116  247:getfield        #56  <Field float m>
	//  117  250:invokestatic    #205 <Method void GLES20.glUniform4f(int, float, float, float, float)>
		GLES20.glUniformMatrix4fv(b.a, 1, false, c.x(), 0);
	//  118  253:aload_0         
	//  119  254:getfield        #148 <Field ds$c b>
	//  120  257:getfield        #209 <Field int ds$c.a>
	//  121  260:iconst_1        
	//  122  261:iconst_0        
	//  123  262:aload_0         
	//  124  263:getfield        #76  <Field s c>
	//  125  266:invokeinterface #213 <Method float[] s.x()>
	//  126  271:iconst_0        
	//  127  272:invokestatic    #217 <Method void GLES20.glUniformMatrix4fv(int, int, boolean, float[], int)>
		GLES20.glDrawArrays(6, 0, 4);
	//  128  275:bipush          6
	//  129  277:iconst_0        
	//  130  278:iconst_4        
	//  131  279:invokestatic    #221 <Method void GLES20.glDrawArrays(int, int, int)>
		GLES20.glBindTexture(3553, 0);
	//  132  282:sipush          3553
	//  133  285:iconst_0        
	//  134  286:invokestatic    #176 <Method void GLES20.glBindTexture(int, int)>
		GLES20.glDisableVertexAttribArray(b.b);
	//  135  289:aload_0         
	//  136  290:getfield        #148 <Field ds$c b>
	//  137  293:getfield        #178 <Field int ds$c.b>
	//  138  296:invokestatic    #224 <Method void GLES20.glDisableVertexAttribArray(int)>
		GLES20.glDisableVertexAttribArray(b.c);
	//  139  299:aload_0         
	//  140  300:getfield        #148 <Field ds$c b>
	//  141  303:getfield        #187 <Field int ds$c.c>
	//  142  306:invokestatic    #224 <Method void GLES20.glDisableVertexAttribArray(int)>
		GLES20.glDisable(3042);
	//  143  309:sipush          3042
	//  144  312:invokestatic    #227 <Method void GLES20.glDisable(int)>
		GLES20.glUseProgram(0);
	//  145  315:iconst_0        
	//  146  316:invokestatic    #230 <Method void GLES20.glUseProgram(int)>
	//  147  319:return          
	}

	private void a(DPoint dpoint, double d1, double d2, double d3, 
			double d4, IPoint ipoint)
	{
		d1 -= (double)n * d3;
	//    0    0:dload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #59  <Field float n>
	//    3    5:f2d             
	//    4    6:dload           6
	//    5    8:dmul            
	//    6    9:dsub            
	//    7   10:dstore_2        
		d2 = (double)(1.0F - o) * d4 - d2;
	//    8   11:fconst_1        
	//    9   12:aload_0         
	//   10   13:getfield        #61  <Field float o>
	//   11   16:fsub            
	//   12   17:f2d             
	//   13   18:dload           8
	//   14   20:dmul            
	//   15   21:dload           4
	//   16   23:dsub            
	//   17   24:dstore          4
		d3 = (double)(-i) * 0.017453292519943289D;
	//   18   26:aload_0         
	//   19   27:getfield        #233 <Field float i>
	//   20   30:fneg            
	//   21   31:f2d             
	//   22   32:ldc2w           #234 <Double 0.017453292519943289D>
	//   23   35:dmul            
	//   24   36:dstore          6
		ipoint.x = (int)(dpoint.x + (Math.cos(d3) * d1 + Math.sin(d3) * d2));
	//   25   38:aload           10
	//   26   40:aload_1         
	//   27   41:getfield        #240 <Field double DPoint.x>
	//   28   44:dload           6
	//   29   46:invokestatic    #246 <Method double Math.cos(double)>
	//   30   49:dload_2         
	//   31   50:dmul            
	//   32   51:dload           6
	//   33   53:invokestatic    #249 <Method double Math.sin(double)>
	//   34   56:dload           4
	//   35   58:dmul            
	//   36   59:dadd            
	//   37   60:dadd            
	//   38   61:d2i             
	//   39   62:putfield        #253 <Field int IPoint.x>
		ipoint.y = (int)(dpoint.y + (Math.cos(d3) * d2 - Math.sin(d3) * d1));
	//   40   65:aload           10
	//   41   67:aload_1         
	//   42   68:getfield        #256 <Field double DPoint.y>
	//   43   71:dload           6
	//   44   73:invokestatic    #246 <Method double Math.cos(double)>
	//   45   76:dload           4
	//   46   78:dmul            
	//   47   79:dload           6
	//   48   81:invokestatic    #249 <Method double Math.sin(double)>
	//   49   84:dload_2         
	//   50   85:dmul            
	//   51   86:dsub            
	//   52   87:dadd            
	//   53   88:d2i             
	//   54   89:putfield        #258 <Field int IPoint.y>
	//   55   92:return          
	}

	private void d()
	{
		if(e == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #262 <Field LatLng e>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		double d1 = (double)f / (Math.cos(e.latitude * 0.017453292519943289D) * 6371000.79D * 0.017453292519943289D);
	//    4    8:aload_0         
	//    5    9:getfield        #264 <Field float f>
	//    6   12:f2d             
	//    7   13:aload_0         
	//    8   14:getfield        #262 <Field LatLng e>
	//    9   17:getfield        #269 <Field double LatLng.latitude>
	//   10   20:ldc2w           #234 <Double 0.017453292519943289D>
	//   11   23:dmul            
	//   12   24:invokestatic    #246 <Method double Math.cos(double)>
	//   13   27:ldc2w           #270 <Double 6371000.79D>
	//   14   30:dmul            
	//   15   31:ldc2w           #234 <Double 0.017453292519943289D>
	//   16   34:dmul            
	//   17   35:ddiv            
	//   18   36:dstore_1        
		double d2 = (double)g / 111194.94043265979D;
	//   19   37:aload_0         
	//   20   38:getfield        #273 <Field float g>
	//   21   41:f2d             
	//   22   42:ldc2w           #274 <Double 111194.94043265979D>
	//   23   45:ddiv            
	//   24   46:dstore_3        
		try
		{
			h = new LatLngBounds(new LatLng(e.latitude - (double)(1.0F - o) * d2, e.longitude - (double)n * d1), new LatLng(e.latitude + (double)o * d2, e.longitude + (double)(1.0F - n) * d1));
	//   25   47:aload_0         
	//   26   48:new             #277 <Class LatLngBounds>
	//   27   51:dup             
	//   28   52:new             #266 <Class LatLng>
	//   29   55:dup             
	//   30   56:aload_0         
	//   31   57:getfield        #262 <Field LatLng e>
	//   32   60:getfield        #269 <Field double LatLng.latitude>
	//   33   63:fconst_1        
	//   34   64:aload_0         
	//   35   65:getfield        #61  <Field float o>
	//   36   68:fsub            
	//   37   69:f2d             
	//   38   70:dload_3         
	//   39   71:dmul            
	//   40   72:dsub            
	//   41   73:aload_0         
	//   42   74:getfield        #262 <Field LatLng e>
	//   43   77:getfield        #280 <Field double LatLng.longitude>
	//   44   80:aload_0         
	//   45   81:getfield        #59  <Field float n>
	//   46   84:f2d             
	//   47   85:dload_1         
	//   48   86:dmul            
	//   49   87:dsub            
	//   50   88:invokespecial   #283 <Method void LatLng(double, double)>
	//   51   91:new             #266 <Class LatLng>
	//   52   94:dup             
	//   53   95:aload_0         
	//   54   96:getfield        #262 <Field LatLng e>
	//   55   99:getfield        #269 <Field double LatLng.latitude>
	//   56  102:aload_0         
	//   57  103:getfield        #61  <Field float o>
	//   58  106:f2d             
	//   59  107:dload_3         
	//   60  108:dmul            
	//   61  109:dadd            
	//   62  110:aload_0         
	//   63  111:getfield        #262 <Field LatLng e>
	//   64  114:getfield        #280 <Field double LatLng.longitude>
	//   65  117:fconst_1        
	//   66  118:aload_0         
	//   67  119:getfield        #59  <Field float n>
	//   68  122:fsub            
	//   69  123:f2d             
	//   70  124:dload_1         
	//   71  125:dmul            
	//   72  126:dadd            
	//   73  127:invokespecial   #283 <Method void LatLng(double, double)>
	//   74  130:invokespecial   #286 <Method void LatLngBounds(LatLng, LatLng)>
	//   75  133:putfield        #288 <Field LatLngBounds h>
		}
	//*  76  136:goto            146
		catch(Throwable throwable)
	//*  77  139:astore          5
		{
			throwable.printStackTrace();
	//   78  141:aload           5
	//   79  143:invokevirtual   #289 <Method void Throwable.printStackTrace()>
		}
		f();
	//   80  146:aload_0         
	//   81  147:invokespecial   #291 <Method void f()>
	//   82  150:return          
	}

	private void e()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(h != null)
			break MISSING_BLOCK_LABEL_12;
	//    2    2:aload_0         
	//    3    3:getfield        #288 <Field LatLngBounds h>
	//    4    6:ifnonnull       12
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		LatLng latlng = h.southwest;
	//    8   12:aload_0         
	//    9   13:getfield        #288 <Field LatLngBounds h>
	//   10   16:getfield        #294 <Field LatLng LatLngBounds.southwest>
	//   11   19:astore_1        
		LatLng latlng1 = h.northeast;
	//   12   20:aload_0         
	//   13   21:getfield        #288 <Field LatLngBounds h>
	//   14   24:getfield        #297 <Field LatLng LatLngBounds.northeast>
	//   15   27:astore_2        
		e = new LatLng(latlng.latitude + (double)(1.0F - o) * (latlng1.latitude - latlng.latitude), latlng.longitude + (double)n * (latlng1.longitude - latlng.longitude));
	//   16   28:aload_0         
	//   17   29:new             #266 <Class LatLng>
	//   18   32:dup             
	//   19   33:aload_1         
	//   20   34:getfield        #269 <Field double LatLng.latitude>
	//   21   37:fconst_1        
	//   22   38:aload_0         
	//   23   39:getfield        #61  <Field float o>
	//   24   42:fsub            
	//   25   43:f2d             
	//   26   44:aload_2         
	//   27   45:getfield        #269 <Field double LatLng.latitude>
	//   28   48:aload_1         
	//   29   49:getfield        #269 <Field double LatLng.latitude>
	//   30   52:dsub            
	//   31   53:dmul            
	//   32   54:dadd            
	//   33   55:aload_1         
	//   34   56:getfield        #280 <Field double LatLng.longitude>
	//   35   59:aload_0         
	//   36   60:getfield        #59  <Field float n>
	//   37   63:f2d             
	//   38   64:aload_2         
	//   39   65:getfield        #280 <Field double LatLng.longitude>
	//   40   68:aload_1         
	//   41   69:getfield        #280 <Field double LatLng.longitude>
	//   42   72:dsub            
	//   43   73:dmul            
	//   44   74:dadd            
	//   45   75:invokespecial   #283 <Method void LatLng(double, double)>
	//   46   78:putfield        #262 <Field LatLng e>
		f = (float)(Math.cos(e.latitude * 0.017453292519943289D) * 6371000.79D * (latlng1.longitude - latlng.longitude) * 0.017453292519943289D);
	//   47   81:aload_0         
	//   48   82:aload_0         
	//   49   83:getfield        #262 <Field LatLng e>
	//   50   86:getfield        #269 <Field double LatLng.latitude>
	//   51   89:ldc2w           #234 <Double 0.017453292519943289D>
	//   52   92:dmul            
	//   53   93:invokestatic    #246 <Method double Math.cos(double)>
	//   54   96:ldc2w           #270 <Double 6371000.79D>
	//   55   99:dmul            
	//   56  100:aload_2         
	//   57  101:getfield        #280 <Field double LatLng.longitude>
	//   58  104:aload_1         
	//   59  105:getfield        #280 <Field double LatLng.longitude>
	//   60  108:dsub            
	//   61  109:dmul            
	//   62  110:ldc2w           #234 <Double 0.017453292519943289D>
	//   63  113:dmul            
	//   64  114:d2f             
	//   65  115:putfield        #264 <Field float f>
		g = (float)((latlng1.latitude - latlng.latitude) * 6371000.79D * 0.017453292519943289D);
	//   66  118:aload_0         
	//   67  119:aload_2         
	//   68  120:getfield        #269 <Field double LatLng.latitude>
	//   69  123:aload_1         
	//   70  124:getfield        #269 <Field double LatLng.latitude>
	//   71  127:dsub            
	//   72  128:ldc2w           #270 <Double 6371000.79D>
	//   73  131:dmul            
	//   74  132:ldc2w           #234 <Double 0.017453292519943289D>
	//   75  135:dmul            
	//   76  136:d2f             
	//   77  137:putfield        #273 <Field float g>
		f();
	//   78  140:aload_0         
	//   79  141:invokespecial   #291 <Method void f()>
		this;
	//   80  144:aload_0         
		JVM INSTR monitorexit ;
	//   81  145:monitorexit     
		return;
	//   82  146:return          
		Exception exception;
		exception;
	//   83  147:astore_1        
	//*  84  148:aload_0         
		throw exception;
	//   85  149:monitorexit     
	//   86  150:aload_1         
	//   87  151:athrow          
	}

	private void f()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(h != null)
			break MISSING_BLOCK_LABEL_12;
	//    2    2:aload_0         
	//    3    3:getfield        #288 <Field LatLngBounds h>
	//    4    6:ifnonnull       12
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		IPoint ipoint;
		IPoint ipoint1;
		IPoint ipoint2;
		IPoint ipoint3;
		a = new float[16];
	//    8   12:aload_0         
	//    9   13:bipush          16
	//   10   15:newarray        float[]
	//   11   17:putfield        #74  <Field float[] a>
		ipoint = IPoint.obtain();
	//   12   20:invokestatic    #301 <Method IPoint IPoint.obtain()>
	//   13   23:astore          5
		ipoint1 = IPoint.obtain();
	//   14   25:invokestatic    #301 <Method IPoint IPoint.obtain()>
	//   15   28:astore          6
		ipoint2 = IPoint.obtain();
	//   16   30:invokestatic    #301 <Method IPoint IPoint.obtain()>
	//   17   33:astore          7
		ipoint3 = IPoint.obtain();
	//   18   35:invokestatic    #301 <Method IPoint IPoint.obtain()>
	//   19   38:astore          8
		GLMapState.lonlat2Geo(h.southwest.longitude, h.southwest.latitude, ipoint);
	//   20   40:aload_0         
	//   21   41:getfield        #288 <Field LatLngBounds h>
	//   22   44:getfield        #294 <Field LatLng LatLngBounds.southwest>
	//   23   47:getfield        #280 <Field double LatLng.longitude>
	//   24   50:aload_0         
	//   25   51:getfield        #288 <Field LatLngBounds h>
	//   26   54:getfield        #294 <Field LatLng LatLngBounds.southwest>
	//   27   57:getfield        #269 <Field double LatLng.latitude>
	//   28   60:aload           5
	//   29   62:invokestatic    #307 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
		GLMapState.lonlat2Geo(h.northeast.longitude, h.southwest.latitude, ipoint1);
	//   30   65:aload_0         
	//   31   66:getfield        #288 <Field LatLngBounds h>
	//   32   69:getfield        #297 <Field LatLng LatLngBounds.northeast>
	//   33   72:getfield        #280 <Field double LatLng.longitude>
	//   34   75:aload_0         
	//   35   76:getfield        #288 <Field LatLngBounds h>
	//   36   79:getfield        #294 <Field LatLng LatLngBounds.southwest>
	//   37   82:getfield        #269 <Field double LatLng.latitude>
	//   38   85:aload           6
	//   39   87:invokestatic    #307 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
		GLMapState.lonlat2Geo(h.northeast.longitude, h.northeast.latitude, ipoint2);
	//   40   90:aload_0         
	//   41   91:getfield        #288 <Field LatLngBounds h>
	//   42   94:getfield        #297 <Field LatLng LatLngBounds.northeast>
	//   43   97:getfield        #280 <Field double LatLng.longitude>
	//   44  100:aload_0         
	//   45  101:getfield        #288 <Field LatLngBounds h>
	//   46  104:getfield        #297 <Field LatLng LatLngBounds.northeast>
	//   47  107:getfield        #269 <Field double LatLng.latitude>
	//   48  110:aload           7
	//   49  112:invokestatic    #307 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
		GLMapState.lonlat2Geo(h.southwest.longitude, h.northeast.latitude, ipoint3);
	//   50  115:aload_0         
	//   51  116:getfield        #288 <Field LatLngBounds h>
	//   52  119:getfield        #294 <Field LatLng LatLngBounds.southwest>
	//   53  122:getfield        #280 <Field double LatLng.longitude>
	//   54  125:aload_0         
	//   55  126:getfield        #288 <Field LatLngBounds h>
	//   56  129:getfield        #297 <Field LatLng LatLngBounds.northeast>
	//   57  132:getfield        #269 <Field double LatLng.latitude>
	//   58  135:aload           8
	//   59  137:invokestatic    #307 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
		if(i != 0.0F)
	//*  60  140:aload_0         
	//*  61  141:getfield        #233 <Field float i>
	//*  62  144:fconst_0        
	//*  63  145:fcmpl           
	//*  64  146:ifeq            273
		{
			double d1 = ipoint1.x - ipoint.x;
	//   65  149:aload           6
	//   66  151:getfield        #253 <Field int IPoint.x>
	//   67  154:aload           5
	//   68  156:getfield        #253 <Field int IPoint.x>
	//   69  159:isub            
	//   70  160:i2d             
	//   71  161:dstore_1        
			double d2 = ipoint1.y - ipoint2.y;
	//   72  162:aload           6
	//   73  164:getfield        #258 <Field int IPoint.y>
	//   74  167:aload           7
	//   75  169:getfield        #258 <Field int IPoint.y>
	//   76  172:isub            
	//   77  173:i2d             
	//   78  174:dstore_3        
			DPoint dpoint = DPoint.obtain();
	//   79  175:invokestatic    #310 <Method DPoint DPoint.obtain()>
	//   80  178:astore          9
			dpoint.x = (double)ipoint.x + (double)n * d1;
	//   81  180:aload           9
	//   82  182:aload           5
	//   83  184:getfield        #253 <Field int IPoint.x>
	//   84  187:i2d             
	//   85  188:aload_0         
	//   86  189:getfield        #59  <Field float n>
	//   87  192:f2d             
	//   88  193:dload_1         
	//   89  194:dmul            
	//   90  195:dadd            
	//   91  196:putfield        #240 <Field double DPoint.x>
			dpoint.y = (double)ipoint.y - (double)(1.0F - o) * d2;
	//   92  199:aload           9
	//   93  201:aload           5
	//   94  203:getfield        #258 <Field int IPoint.y>
	//   95  206:i2d             
	//   96  207:fconst_1        
	//   97  208:aload_0         
	//   98  209:getfield        #61  <Field float o>
	//   99  212:fsub            
	//  100  213:f2d             
	//  101  214:dload_3         
	//  102  215:dmul            
	//  103  216:dsub            
	//  104  217:putfield        #256 <Field double DPoint.y>
			a(dpoint, 0.0D, 0.0D, d1, d2, ipoint);
	//  105  220:aload_0         
	//  106  221:aload           9
	//  107  223:dconst_0        
	//  108  224:dconst_0        
	//  109  225:dload_1         
	//  110  226:dload_3         
	//  111  227:aload           5
	//  112  229:invokespecial   #312 <Method void a(DPoint, double, double, double, double, IPoint)>
			a(dpoint, d1, 0.0D, d1, d2, ipoint1);
	//  113  232:aload_0         
	//  114  233:aload           9
	//  115  235:dload_1         
	//  116  236:dconst_0        
	//  117  237:dload_1         
	//  118  238:dload_3         
	//  119  239:aload           6
	//  120  241:invokespecial   #312 <Method void a(DPoint, double, double, double, double, IPoint)>
			a(dpoint, d1, d2, d1, d2, ipoint2);
	//  121  244:aload_0         
	//  122  245:aload           9
	//  123  247:dload_1         
	//  124  248:dload_3         
	//  125  249:dload_1         
	//  126  250:dload_3         
	//  127  251:aload           7
	//  128  253:invokespecial   #312 <Method void a(DPoint, double, double, double, double, IPoint)>
			a(dpoint, 0.0D, d2, d1, d2, ipoint3);
	//  129  256:aload_0         
	//  130  257:aload           9
	//  131  259:dconst_0        
	//  132  260:dload_3         
	//  133  261:dload_1         
	//  134  262:dload_3         
	//  135  263:aload           8
	//  136  265:invokespecial   #312 <Method void a(DPoint, double, double, double, double, IPoint)>
			dpoint.recycle();
	//  137  268:aload           9
	//  138  270:invokevirtual   #315 <Method void DPoint.recycle()>
		}
		a[0] = ipoint.x / 10000;
	//  139  273:aload_0         
	//  140  274:getfield        #74  <Field float[] a>
	//  141  277:iconst_0        
	//  142  278:aload           5
	//  143  280:getfield        #253 <Field int IPoint.x>
	//  144  283:sipush          10000
	//  145  286:idiv            
	//  146  287:i2f             
	//  147  288:fastore         
		a[1] = ipoint.y / 10000;
	//  148  289:aload_0         
	//  149  290:getfield        #74  <Field float[] a>
	//  150  293:iconst_1        
	//  151  294:aload           5
	//  152  296:getfield        #258 <Field int IPoint.y>
	//  153  299:sipush          10000
	//  154  302:idiv            
	//  155  303:i2f             
	//  156  304:fastore         
		a[2] = ipoint.x % 10000;
	//  157  305:aload_0         
	//  158  306:getfield        #74  <Field float[] a>
	//  159  309:iconst_2        
	//  160  310:aload           5
	//  161  312:getfield        #253 <Field int IPoint.x>
	//  162  315:sipush          10000
	//  163  318:irem            
	//  164  319:i2f             
	//  165  320:fastore         
		a[3] = ipoint.y % 10000;
	//  166  321:aload_0         
	//  167  322:getfield        #74  <Field float[] a>
	//  168  325:iconst_3        
	//  169  326:aload           5
	//  170  328:getfield        #258 <Field int IPoint.y>
	//  171  331:sipush          10000
	//  172  334:irem            
	//  173  335:i2f             
	//  174  336:fastore         
		a[4] = ipoint1.x / 10000;
	//  175  337:aload_0         
	//  176  338:getfield        #74  <Field float[] a>
	//  177  341:iconst_4        
	//  178  342:aload           6
	//  179  344:getfield        #253 <Field int IPoint.x>
	//  180  347:sipush          10000
	//  181  350:idiv            
	//  182  351:i2f             
	//  183  352:fastore         
		a[5] = ipoint1.y / 10000;
	//  184  353:aload_0         
	//  185  354:getfield        #74  <Field float[] a>
	//  186  357:iconst_5        
	//  187  358:aload           6
	//  188  360:getfield        #258 <Field int IPoint.y>
	//  189  363:sipush          10000
	//  190  366:idiv            
	//  191  367:i2f             
	//  192  368:fastore         
		a[6] = ipoint1.x % 10000;
	//  193  369:aload_0         
	//  194  370:getfield        #74  <Field float[] a>
	//  195  373:bipush          6
	//  196  375:aload           6
	//  197  377:getfield        #253 <Field int IPoint.x>
	//  198  380:sipush          10000
	//  199  383:irem            
	//  200  384:i2f             
	//  201  385:fastore         
		a[7] = ipoint1.y % 10000;
	//  202  386:aload_0         
	//  203  387:getfield        #74  <Field float[] a>
	//  204  390:bipush          7
	//  205  392:aload           6
	//  206  394:getfield        #258 <Field int IPoint.y>
	//  207  397:sipush          10000
	//  208  400:irem            
	//  209  401:i2f             
	//  210  402:fastore         
		a[8] = ipoint2.x / 10000;
	//  211  403:aload_0         
	//  212  404:getfield        #74  <Field float[] a>
	//  213  407:bipush          8
	//  214  409:aload           7
	//  215  411:getfield        #253 <Field int IPoint.x>
	//  216  414:sipush          10000
	//  217  417:idiv            
	//  218  418:i2f             
	//  219  419:fastore         
		a[9] = ipoint2.y / 10000;
	//  220  420:aload_0         
	//  221  421:getfield        #74  <Field float[] a>
	//  222  424:bipush          9
	//  223  426:aload           7
	//  224  428:getfield        #258 <Field int IPoint.y>
	//  225  431:sipush          10000
	//  226  434:idiv            
	//  227  435:i2f             
	//  228  436:fastore         
		a[10] = ipoint2.x % 10000;
	//  229  437:aload_0         
	//  230  438:getfield        #74  <Field float[] a>
	//  231  441:bipush          10
	//  232  443:aload           7
	//  233  445:getfield        #253 <Field int IPoint.x>
	//  234  448:sipush          10000
	//  235  451:irem            
	//  236  452:i2f             
	//  237  453:fastore         
		a[11] = ipoint2.y % 10000;
	//  238  454:aload_0         
	//  239  455:getfield        #74  <Field float[] a>
	//  240  458:bipush          11
	//  241  460:aload           7
	//  242  462:getfield        #258 <Field int IPoint.y>
	//  243  465:sipush          10000
	//  244  468:irem            
	//  245  469:i2f             
	//  246  470:fastore         
		a[12] = ipoint3.x / 10000;
	//  247  471:aload_0         
	//  248  472:getfield        #74  <Field float[] a>
	//  249  475:bipush          12
	//  250  477:aload           8
	//  251  479:getfield        #253 <Field int IPoint.x>
	//  252  482:sipush          10000
	//  253  485:idiv            
	//  254  486:i2f             
	//  255  487:fastore         
		a[13] = ipoint3.y / 10000;
	//  256  488:aload_0         
	//  257  489:getfield        #74  <Field float[] a>
	//  258  492:bipush          13
	//  259  494:aload           8
	//  260  496:getfield        #258 <Field int IPoint.y>
	//  261  499:sipush          10000
	//  262  502:idiv            
	//  263  503:i2f             
	//  264  504:fastore         
		a[14] = ipoint3.x % 10000;
	//  265  505:aload_0         
	//  266  506:getfield        #74  <Field float[] a>
	//  267  509:bipush          14
	//  268  511:aload           8
	//  269  513:getfield        #253 <Field int IPoint.x>
	//  270  516:sipush          10000
	//  271  519:irem            
	//  272  520:i2f             
	//  273  521:fastore         
		a[15] = ipoint3.y % 10000;
	//  274  522:aload_0         
	//  275  523:getfield        #74  <Field float[] a>
	//  276  526:bipush          15
	//  277  528:aload           8
	//  278  530:getfield        #258 <Field int IPoint.y>
	//  279  533:sipush          10000
	//  280  536:irem            
	//  281  537:i2f             
	//  282  538:fastore         
		if(q == null)
	//* 283  539:aload_0         
	//* 284  540:getfield        #63  <Field FloatBuffer q>
	//* 285  543:ifnonnull       560
		{
			q = fd.a(a);
	//  286  546:aload_0         
	//  287  547:aload_0         
	//  288  548:getfield        #74  <Field float[] a>
	//  289  551:invokestatic    #318 <Method FloatBuffer fd.a(float[])>
	//  290  554:putfield        #63  <Field FloatBuffer q>
			break MISSING_BLOCK_LABEL_575;
	//  291  557:goto            575
		}
		q = fd.a(a, q);
	//  292  560:aload_0         
	//  293  561:aload_0         
	//  294  562:getfield        #74  <Field float[] a>
	//  295  565:aload_0         
	//  296  566:getfield        #63  <Field FloatBuffer q>
	//  297  569:invokestatic    #321 <Method FloatBuffer fd.a(float[], FloatBuffer)>
	//  298  572:putfield        #63  <Field FloatBuffer q>
		ipoint3.recycle();
	//  299  575:aload           8
	//  300  577:invokevirtual   #322 <Method void IPoint.recycle()>
		ipoint.recycle();
	//  301  580:aload           5
	//  302  582:invokevirtual   #322 <Method void IPoint.recycle()>
		ipoint1.recycle();
	//  303  585:aload           6
	//  304  587:invokevirtual   #322 <Method void IPoint.recycle()>
		ipoint2.recycle();
	//  305  590:aload           7
	//  306  592:invokevirtual   #322 <Method void IPoint.recycle()>
		this;
	//  307  595:aload_0         
		JVM INSTR monitorexit ;
	//  308  596:monitorexit     
		return;
	//  309  597:return          
		Exception exception;
		exception;
	//  310  598:astore          5
	//* 311  600:aload_0         
		throw exception;
	//  312  601:monitorexit     
	//  313  602:aload           5
	//  314  604:athrow          
	}

	private void g()
	{
		if(d == null && (d == null || d.getBitmap() == null))
	//*   0    0:aload_0         
	//*   1    1:getfield        #324 <Field BitmapDescriptor d>
	//*   2    4:ifnonnull       25
	//*   3    7:aload_0         
	//*   4    8:getfield        #324 <Field BitmapDescriptor d>
	//*   5   11:ifnull          24
	//*   6   14:aload_0         
	//*   7   15:getfield        #324 <Field BitmapDescriptor d>
	//*   8   18:invokevirtual   #120 <Method Bitmap BitmapDescriptor.getBitmap()>
	//*   9   21:ifnonnull       25
		{
			return;
	//   10   24:return          
		} else
		{
			int i1 = d.getWidth();
	//   11   25:aload_0         
	//   12   26:getfield        #324 <Field BitmapDescriptor d>
	//   13   29:invokevirtual   #327 <Method int BitmapDescriptor.getWidth()>
	//   14   32:istore_3        
			int j1 = d.getHeight();
	//   15   33:aload_0         
	//   16   34:getfield        #324 <Field BitmapDescriptor d>
	//   17   37:invokevirtual   #330 <Method int BitmapDescriptor.getHeight()>
	//   18   40:istore          4
			int k1 = d.getBitmap().getHeight();
	//   19   42:aload_0         
	//   20   43:getfield        #324 <Field BitmapDescriptor d>
	//   21   46:invokevirtual   #120 <Method Bitmap BitmapDescriptor.getBitmap()>
	//   22   49:invokevirtual   #331 <Method int Bitmap.getHeight()>
	//   23   52:istore          5
			int l1 = d.getBitmap().getWidth();
	//   24   54:aload_0         
	//   25   55:getfield        #324 <Field BitmapDescriptor d>
	//   26   58:invokevirtual   #120 <Method Bitmap BitmapDescriptor.getBitmap()>
	//   27   61:invokevirtual   #332 <Method int Bitmap.getWidth()>
	//   28   64:istore          6
			float f1 = (float)i1 / (float)l1;
	//   29   66:iload_3         
	//   30   67:i2f             
	//   31   68:iload           6
	//   32   70:i2f             
	//   33   71:fdiv            
	//   34   72:fstore_1        
			float f2 = (float)j1 / (float)k1;
	//   35   73:iload           4
	//   36   75:i2f             
	//   37   76:iload           5
	//   38   78:i2f             
	//   39   79:fdiv            
	//   40   80:fstore_2        
			r = fd.a(new float[] {
				0.0F, f2, f1, f2, f1, 0.0F, 0.0F, 0.0F
			});
	//   41   81:aload_0         
	//   42   82:bipush          8
	//   43   84:newarray        float[]
	//   44   86:dup             
	//   45   87:iconst_0        
	//   46   88:fconst_0        
	//   47   89:fastore         
	//   48   90:dup             
	//   49   91:iconst_1        
	//   50   92:fload_2         
	//   51   93:fastore         
	//   52   94:dup             
	//   53   95:iconst_2        
	//   54   96:fload_1         
	//   55   97:fastore         
	//   56   98:dup             
	//   57   99:iconst_3        
	//   58  100:fload_2         
	//   59  101:fastore         
	//   60  102:dup             
	//   61  103:iconst_4        
	//   62  104:fload_1         
	//   63  105:fastore         
	//   64  106:dup             
	//   65  107:iconst_5        
	//   66  108:fconst_0        
	//   67  109:fastore         
	//   68  110:dup             
	//   69  111:bipush          6
	//   70  113:fconst_0        
	//   71  114:fastore         
	//   72  115:dup             
	//   73  116:bipush          7
	//   74  118:fconst_0        
	//   75  119:fastore         
	//   76  120:invokestatic    #318 <Method FloatBuffer fd.a(float[])>
	//   77  123:putfield        #334 <Field FloatBuffer r>
			return;
	//   78  126:return          
		}
	}

	private int h()
	{
		int ai[] = new int[1];
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:astore_1        
		int[] _tmp = ai;
	//    3    4:aload_1         
	//    4    5:dup             
	//    5    6:iconst_0        
	//    6    7:iconst_0        
	//    7    8:iastore         
	//    8    9:pop             
		ai[0] = 0;
		GLES20.glGenTextures(1, ai, 0);
	//    9   10:iconst_1        
	//   10   11:aload_1         
	//   11   12:iconst_0        
	//   12   13:invokestatic    #338 <Method void GLES20.glGenTextures(int, int[], int)>
		return ai[0];
	//   13   16:aload_1         
	//   14   17:iconst_0        
	//   15   18:iaload          
	//   16   19:ireturn         
	}

	private void i()
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field s c>
	//*   2    4:ifnull          24
			b = (ds.c)c.t(2);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #76  <Field s c>
	//    6   12:iconst_2        
	//    7   13:invokeinterface #341 <Method dr s.t(int)>
	//    8   18:checkcast       #150 <Class ds$c>
	//    9   21:putfield        #148 <Field ds$c b>
	//   10   24:return          
	}

	public void a(float f1, float f2)
		throws RemoteException
	{
		n = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #59  <Field float n>
		o = f2;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #61  <Field float o>
		c.setRunLowFrame(false);
	//    6   10:aload_0         
	//    7   11:getfield        #76  <Field s c>
	//    8   14:iconst_0        
	//    9   15:invokeinterface #346 <Method void s.setRunLowFrame(boolean)>
	//   10   20:return          
	}

	public void a(MapConfig mapconfig)
		throws RemoteException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!k || e == null && h == null)
			break MISSING_BLOCK_LABEL_32;
	//    2    2:aload_0         
	//    3    3:getfield        #52  <Field boolean k>
	//    4    6:ifeq            32
	//    5    9:aload_0         
	//    6   10:getfield        #262 <Field LatLng e>
	//    7   13:ifnonnull       23
	//    8   16:aload_0         
	//    9   17:getfield        #288 <Field LatLngBounds h>
	//   10   20:ifnull          32
		mapconfig = ((MapConfig) (d));
	//   11   23:aload_0         
	//   12   24:getfield        #324 <Field BitmapDescriptor d>
	//   13   27:astore_1        
		if(mapconfig != null)
			break MISSING_BLOCK_LABEL_37;
	//   14   28:aload_1         
	//   15   29:ifnonnull       37
		boolean flag;
		flag = true;
	//   16   32:iconst_1        
	//   17   33:istore_2        
		break MISSING_BLOCK_LABEL_39;
	//   18   34:goto            39
		flag = false;
	//   19   37:iconst_0        
	//   20   38:istore_2        
		if(flag)
	//*  21   39:iload_2         
	//*  22   40:ifeq            46
	//*  23   43:aload_0         
			return;
	//   24   44:monitorexit     
	//   25   45:return          
		break MISSING_BLOCK_LABEL_56;
	//*  26   46:aload_0         
	//*  27   47:monitorexit     
	//*  28   48:goto            56
		mapconfig;
	//   29   51:astore_1        
	//*  30   52:aload_0         
		throw mapconfig;
	//   31   53:monitorexit     
	//   32   54:aload_1         
	//   33   55:athrow          
		b();
	//   34   56:aload_0         
	//   35   57:invokevirtual   #350 <Method boolean b()>
	//   36   60:pop             
		if(!t)
	//*  37   61:aload_0         
	//*  38   62:getfield        #65  <Field boolean t>
	//*  39   65:ifne            101
		{
			boolean flag1;
			if(android.os.Build.VERSION.SDK_INT >= 12)
	//*  40   68:getstatic       #355 <Field int android.os.Build$VERSION.SDK_INT>
	//*  41   71:bipush          12
	//*  42   73:icmplt          81
				flag1 = true;
	//   43   76:iconst_1        
	//   44   77:istore_3        
			else
	//*  45   78:goto            83
				flag1 = false;
	//   46   81:iconst_0        
	//   47   82:istore_3        
			s = a(flag1, d);
	//   48   83:aload_0         
	//   49   84:aload_0         
	//   50   85:iload_3         
	//   51   86:aload_0         
	//   52   87:getfield        #324 <Field BitmapDescriptor d>
	//   53   90:invokespecial   #357 <Method int a(boolean, BitmapDescriptor)>
	//   54   93:putfield        #359 <Field int s>
			t = true;
	//   55   96:aload_0         
	//   56   97:iconst_1        
	//   57   98:putfield        #65  <Field boolean t>
		}
		if(f == 0.0F && g == 0.0F)
	//*  58  101:aload_0         
	//*  59  102:getfield        #264 <Field float f>
	//*  60  105:fconst_0        
	//*  61  106:fcmpl           
	//*  62  107:ifne            120
	//*  63  110:aload_0         
	//*  64  111:getfield        #273 <Field float g>
	//*  65  114:fconst_0        
	//*  66  115:fcmpl           
	//*  67  116:ifne            120
			return;
	//   68  119:return          
		this;
	//   69  120:aload_0         
		JVM INSTR monitorenter ;
	//   70  121:monitorenter    
		a(s, q, r);
	//   71  122:aload_0         
	//   72  123:aload_0         
	//   73  124:getfield        #359 <Field int s>
	//   74  127:aload_0         
	//   75  128:getfield        #63  <Field FloatBuffer q>
	//   76  131:aload_0         
	//   77  132:getfield        #334 <Field FloatBuffer r>
	//   78  135:invokespecial   #361 <Method void a(int, FloatBuffer, FloatBuffer)>
		this;
	//   79  138:aload_0         
		JVM INSTR monitorexit ;
	//   80  139:monitorexit     
		  goto _L1
	//*  81  140:goto            148
		mapconfig;
	//   82  143:astore_1        
	//*  83  144:aload_0         
		throw mapconfig;
	//   84  145:monitorexit     
	//   85  146:aload_1         
	//   86  147:athrow          
_L1:
		u = true;
	//   87  148:aload_0         
	//   88  149:iconst_1        
	//   89  150:putfield        #67  <Field boolean u>
		return;
	//   90  153:return          
	}

	public boolean a()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean b()
		throws RemoteException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		float af[] = a;
	//    2    2:aload_0         
	//    3    3:getfield        #74  <Field float[] a>
	//    4    6:astore_1        
		if(af == null)
			break MISSING_BLOCK_LABEL_15;
	//    5    7:aload_1         
	//    6    8:ifnull          15
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return false;
	//    9   13:iconst_0        
	//   10   14:ireturn         
		this;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		  goto _L1
	//*  13   17:goto            25
		Exception exception;
		exception;
	//   14   20:astore_1        
	//*  15   21:aload_0         
		throw exception;
	//   16   22:monitorexit     
	//   17   23:aload_1         
	//   18   24:athrow          
_L1:
		u = false;
	//   19   25:aload_0         
	//   20   26:iconst_0        
	//   21   27:putfield        #67  <Field boolean u>
		if(e == null)
	//*  22   30:aload_0         
	//*  23   31:getfield        #262 <Field LatLng e>
	//*  24   34:ifnonnull       44
			e();
	//   25   37:aload_0         
	//   26   38:invokespecial   #363 <Method void e()>
		else
	//*  27   41:goto            62
		if(h == null)
	//*  28   44:aload_0         
	//*  29   45:getfield        #288 <Field LatLngBounds h>
	//*  30   48:ifnonnull       58
			d();
	//   31   51:aload_0         
	//   32   52:invokespecial   #365 <Method void d()>
		else
	//*  33   55:goto            62
			f();
	//   34   58:aload_0         
	//   35   59:invokespecial   #291 <Method void f()>
		return true;
	//   36   62:iconst_1        
	//   37   63:ireturn         
	}

	public boolean c()
	{
		return u;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field boolean u>
	//    2    4:ireturn         
	}

	public void destroy()
	{
		remove();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #369 <Method void remove()>
		if(v == null || v.size() <= 0) goto _L2; else goto _L1
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field List v>
	//    4    8:ifnull          109
	//    5   11:aload_0         
	//    6   12:getfield        #72  <Field List v>
	//    7   15:invokeinterface #372 <Method int List.size()>
	//    8   20:ifle            109
_L1:
		int i1 = 0;
	//    9   23:iconst_0        
	//   10   24:istore_1        
_L10:
		Object obj;
		if(i1 < v.size())
	//*  11   25:iload_1         
	//*  12   26:aload_0         
	//*  13   27:getfield        #72  <Field List v>
	//*  14   30:invokeinterface #372 <Method int List.size()>
	//*  15   35:icmpge          100
		{
			obj = ((Object) ((ab)v.get(i1)));
	//   16   38:aload_0         
	//   17   39:getfield        #72  <Field List v>
	//   18   42:iload_1         
	//   19   43:invokeinterface #376 <Method Object List.get(int)>
	//   20   48:checkcast       #108 <Class ab>
	//   21   51:astore_2        
			break MISSING_BLOCK_LABEL_52;
		}
	//*  22   52:aload_2         
	//*  23   53:ifnull          215
	//*  24   56:aload_0         
	//*  25   57:getfield        #100 <Field q w>
	//*  26   60:ifnull          77
	//*  27   63:aload_0         
	//*  28   64:getfield        #100 <Field q w>
	//*  29   67:aload_2         
	//*  30   68:invokevirtual   #111 <Method int ab.f()>
	//*  31   71:invokestatic    #382 <Method Integer Integer.valueOf(int)>
	//*  32   74:invokevirtual   #387 <Method void q.a(Integer)>
	//*  33   77:aload_0         
	//*  34   78:getfield        #76  <Field s c>
	//*  35   81:ifnull          215
	//*  36   84:aload_0         
	//*  37   85:getfield        #76  <Field s c>
	//*  38   88:aload_2         
	//*  39   89:invokevirtual   #389 <Method String ab.j()>
	//*  40   92:invokeinterface #392 <Method void s.c(String)>
	//*  41   97:goto            215
		v.clear();
	//   42  100:aload_0         
	//   43  101:getfield        #72  <Field List v>
	//   44  104:invokeinterface #395 <Method void List.clear()>
_L2:
		if(d == null) goto _L4; else goto _L3
	//   45  109:aload_0         
	//   46  110:getfield        #324 <Field BitmapDescriptor d>
	//   47  113:ifnull          137
_L3:
		obj = ((Object) (d.getBitmap()));
	//   48  116:aload_0         
	//   49  117:getfield        #324 <Field BitmapDescriptor d>
	//   50  120:invokevirtual   #120 <Method Bitmap BitmapDescriptor.getBitmap()>
	//   51  123:astore_2        
		if(obj == null) goto _L4; else goto _L5
	//   52  124:aload_2         
	//   53  125:ifnull          137
_L5:
		((Bitmap) (obj)).recycle();
	//   54  128:aload_2         
	//   55  129:invokevirtual   #396 <Method void Bitmap.recycle()>
		d = null;
	//   56  132:aload_0         
	//   57  133:aconst_null     
	//   58  134:putfield        #324 <Field BitmapDescriptor d>
_L4:
		if(r == null) goto _L7; else goto _L6
	//   59  137:aload_0         
	//   60  138:getfield        #334 <Field FloatBuffer r>
	//   61  141:ifnull          157
_L6:
		r.clear();
	//   62  144:aload_0         
	//   63  145:getfield        #334 <Field FloatBuffer r>
	//   64  148:invokevirtual   #401 <Method java.nio.Buffer FloatBuffer.clear()>
	//   65  151:pop             
		r = null;
	//   66  152:aload_0         
	//   67  153:aconst_null     
	//   68  154:putfield        #334 <Field FloatBuffer r>
_L7:
		this;
	//   69  157:aload_0         
		JVM INSTR monitorenter ;
	//   70  158:monitorenter    
		if(q != null)
	//*  71  159:aload_0         
	//*  72  160:getfield        #63  <Field FloatBuffer q>
	//*  73  163:ifnull          179
		{
			q.clear();
	//   74  166:aload_0         
	//   75  167:getfield        #63  <Field FloatBuffer q>
	//   76  170:invokevirtual   #401 <Method java.nio.Buffer FloatBuffer.clear()>
	//   77  173:pop             
			q = null;
	//   78  174:aload_0         
	//   79  175:aconst_null     
	//   80  176:putfield        #63  <Field FloatBuffer q>
		}
		h = null;
	//   81  179:aload_0         
	//   82  180:aconst_null     
	//   83  181:putfield        #288 <Field LatLngBounds h>
		this;
	//   84  184:aload_0         
		JVM INSTR monitorexit ;
	//   85  185:monitorexit     
		  goto _L8
	//*  86  186:goto            194
		exception;
	//   87  189:astore_2        
	//*  88  190:aload_0         
		throw exception;
	//   89  191:monitorexit     
	//   90  192:aload_2         
	//   91  193:athrow          
_L8:
		e = null;
	//   92  194:aload_0         
	//   93  195:aconst_null     
	//   94  196:putfield        #262 <Field LatLng e>
		return;
	//   95  199:return          
		Exception exception;
		if(obj != null)
			try
			{
				if(w != null)
					w.a(Integer.valueOf(((ab) (obj)).f()));
				if(c != null)
					c.c(((ab) (obj)).j());
			}
			catch(Throwable throwable)
	//*  96  200:astore_2        
			{
				hm.c(throwable, "GroundOverlayDelegateImp", "destroy");
	//   97  201:aload_2         
	//   98  202:ldc1            #84  <String "GroundOverlayDelegateImp">
	//   99  204:ldc2            #402 <String "destroy">
	//  100  207:invokestatic    #91  <Method void hm.c(Throwable, String, String)>
				throwable.printStackTrace();
	//  101  210:aload_2         
	//  102  211:invokevirtual   #289 <Method void Throwable.printStackTrace()>
				return;
	//  103  214:return          
			}
		i1++;
	//  104  215:iload_1         
	//  105  216:iconst_1        
	//  106  217:iadd            
	//  107  218:istore_1        
		if(true) goto _L10; else goto _L9
	//  108  219:goto            25
_L9:
	}

	public boolean equalsRemote(IOverlay ioverlay)
		throws RemoteException
	{
		return ((Object)this).equals(((Object) (ioverlay))) || ioverlay.getId().equals(((Object) (getId())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #407 <Method boolean Object.equals(Object)>
	//    3    5:ifne            24
	//    4    8:aload_1         
	//    5    9:invokeinterface #410 <Method String IOverlay.getId()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #80  <Method String getId()>
	//    8   18:invokevirtual   #413 <Method boolean String.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public float getBearing()
		throws RemoteException
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field float i>
	//    2    4:freturn         
	}

	public LatLngBounds getBounds()
		throws RemoteException
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #288 <Field LatLngBounds h>
	//    2    4:areturn         
	}

	public float getHeight()
		throws RemoteException
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #273 <Field float g>
	//    2    4:freturn         
	}

	public String getId()
		throws RemoteException
	{
		if(p == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field String p>
	//*   2    4:ifnonnull       23
			p = c.d("GroundOverlay");
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #76  <Field s c>
	//    6   12:ldc2            #419 <String "GroundOverlay">
	//    7   15:invokeinterface #422 <Method String s.d(String)>
	//    8   20:putfield        #82  <Field String p>
		return p;
	//    9   23:aload_0         
	//   10   24:getfield        #82  <Field String p>
	//   11   27:areturn         
	}

	public LatLng getPosition()
		throws RemoteException
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field LatLng e>
	//    2    4:areturn         
	}

	public float getTransparency()
		throws RemoteException
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field float l>
	//    2    4:freturn         
	}

	public float getWidth()
		throws RemoteException
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field float f>
	//    2    4:freturn         
	}

	public float getZIndex()
		throws RemoteException
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #428 <Field float j>
	//    2    4:freturn         
	}

	public int hashCodeRemote()
		throws RemoteException
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #432 <Method int Object.hashCode()>
	//    2    4:ireturn         
	}

	public boolean isAboveMaskLayer()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isVisible()
		throws RemoteException
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean k>
	//    2    4:ireturn         
	}

	public void remove()
		throws RemoteException
	{
		c.a(getId());
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field s c>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #80  <Method String getId()>
	//    4    8:invokeinterface #437 <Method boolean s.a(String)>
	//    5   13:pop             
		c.setRunLowFrame(false);
	//    6   14:aload_0         
	//    7   15:getfield        #76  <Field s c>
	//    8   18:iconst_0        
	//    9   19:invokeinterface #346 <Method void s.setRunLowFrame(boolean)>
	//   10   24:return          
	}

	public void setAboveMaskLayer(boolean flag)
	{
	//    0    0:return          
	}

	public void setBearing(float f1)
		throws RemoteException
	{
		f1 = (f1 % 360F + 360F) % 360F;
	//    0    0:fload_1         
	//    1    1:ldc2            #441 <Float 360F>
	//    2    4:frem            
	//    3    5:ldc2            #441 <Float 360F>
	//    4    8:fadd            
	//    5    9:ldc2            #441 <Float 360F>
	//    6   12:frem            
	//    7   13:fstore_1        
		if((double)Math.abs(i - f1) > 9.9999999999999995E-08D)
	//*   8   14:aload_0         
	//*   9   15:getfield        #233 <Field float i>
	//*  10   18:fload_1         
	//*  11   19:fsub            
	//*  12   20:invokestatic    #445 <Method float Math.abs(float)>
	//*  13   23:f2d             
	//*  14   24:ldc2w           #446 <Double 9.9999999999999995E-08D>
	//*  15   27:dcmpl           
	//*  16   28:ifle            40
		{
			i = f1;
	//   17   31:aload_0         
	//   18   32:fload_1         
	//   19   33:putfield        #233 <Field float i>
			f();
	//   20   36:aload_0         
	//   21   37:invokespecial   #291 <Method void f()>
		}
		c.setRunLowFrame(false);
	//   22   40:aload_0         
	//   23   41:getfield        #76  <Field s c>
	//   24   44:iconst_0        
	//   25   45:invokeinterface #346 <Method void s.setRunLowFrame(boolean)>
	//   26   50:return          
	}

	public void setDimensions(float f1)
		throws RemoteException
	{
		if(f1 <= 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:ifgt            15
			Log.w("GroundOverlayDelegateImp", "Width must be non-negative");
	//    4    6:ldc1            #84  <String "GroundOverlayDelegateImp">
	//    5    8:ldc2            #450 <String "Width must be non-negative">
	//    6   11:invokestatic    #455 <Method int Log.w(String, String)>
	//    7   14:pop             
		if(t && f != f1)
	//*   8   15:aload_0         
	//*   9   16:getfield        #65  <Field boolean t>
	//*  10   19:ifeq            48
	//*  11   22:aload_0         
	//*  12   23:getfield        #264 <Field float f>
	//*  13   26:fload_1         
	//*  14   27:fcmpl           
	//*  15   28:ifeq            48
		{
			f = f1;
	//   16   31:aload_0         
	//   17   32:fload_1         
	//   18   33:putfield        #264 <Field float f>
			g = f1;
	//   19   36:aload_0         
	//   20   37:fload_1         
	//   21   38:putfield        #273 <Field float g>
			d();
	//   22   41:aload_0         
	//   23   42:invokespecial   #365 <Method void d()>
		} else
	//*  24   45:goto            58
		{
			f = f1;
	//   25   48:aload_0         
	//   26   49:fload_1         
	//   27   50:putfield        #264 <Field float f>
			g = f1;
	//   28   53:aload_0         
	//   29   54:fload_1         
	//   30   55:putfield        #273 <Field float g>
		}
		c.setRunLowFrame(false);
	//   31   58:aload_0         
	//   32   59:getfield        #76  <Field s c>
	//   33   62:iconst_0        
	//   34   63:invokeinterface #346 <Method void s.setRunLowFrame(boolean)>
	//   35   68:return          
	}

	public void setDimensions(float f1, float f2)
		throws RemoteException
	{
		if(f1 <= 0.0F || f2 <= 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:ifle            12
	//*   4    6:fload_2         
	//*   5    7:fconst_0        
	//*   6    8:fcmpg           
	//*   7    9:ifgt            21
			Log.w("GroundOverlayDelegateImp", "Width and Height must be non-negative");
	//    8   12:ldc1            #84  <String "GroundOverlayDelegateImp">
	//    9   14:ldc2            #457 <String "Width and Height must be non-negative">
	//   10   17:invokestatic    #455 <Method int Log.w(String, String)>
	//   11   20:pop             
		if(t && f != f1 && g != f2)
	//*  12   21:aload_0         
	//*  13   22:getfield        #65  <Field boolean t>
	//*  14   25:ifeq            63
	//*  15   28:aload_0         
	//*  16   29:getfield        #264 <Field float f>
	//*  17   32:fload_1         
	//*  18   33:fcmpl           
	//*  19   34:ifeq            63
	//*  20   37:aload_0         
	//*  21   38:getfield        #273 <Field float g>
	//*  22   41:fload_2         
	//*  23   42:fcmpl           
	//*  24   43:ifeq            63
		{
			f = f1;
	//   25   46:aload_0         
	//   26   47:fload_1         
	//   27   48:putfield        #264 <Field float f>
			g = f2;
	//   28   51:aload_0         
	//   29   52:fload_2         
	//   30   53:putfield        #273 <Field float g>
			d();
	//   31   56:aload_0         
	//   32   57:invokespecial   #365 <Method void d()>
		} else
	//*  33   60:goto            73
		{
			f = f1;
	//   34   63:aload_0         
	//   35   64:fload_1         
	//   36   65:putfield        #264 <Field float f>
			g = f2;
	//   37   68:aload_0         
	//   38   69:fload_2         
	//   39   70:putfield        #273 <Field float g>
		}
		c.setRunLowFrame(false);
	//   40   73:aload_0         
	//   41   74:getfield        #76  <Field s c>
	//   42   77:iconst_0        
	//   43   78:invokeinterface #346 <Method void s.setRunLowFrame(boolean)>
	//   44   83:return          
	}

	public void setImage(BitmapDescriptor bitmapdescriptor)
		throws RemoteException
	{
		if(bitmapdescriptor == null || bitmapdescriptor.getBitmap() == null || bitmapdescriptor.getBitmap().isRecycled())
	//*   0    0:aload_1         
	//*   1    1:ifnull          21
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #120 <Method Bitmap BitmapDescriptor.getBitmap()>
	//*   4    8:ifnull          21
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #120 <Method Bitmap BitmapDescriptor.getBitmap()>
	//*   7   15:invokevirtual   #126 <Method boolean Bitmap.isRecycled()>
	//*   8   18:ifeq            22
			return;
	//    9   21:return          
		d = bitmapdescriptor;
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:putfield        #324 <Field BitmapDescriptor d>
		g();
	//   13   27:aload_0         
	//   14   28:invokespecial   #461 <Method void g()>
		if(t)
	//*  15   31:aload_0         
	//*  16   32:getfield        #65  <Field boolean t>
	//*  17   35:ifeq            43
			t = false;
	//   18   38:aload_0         
	//   19   39:iconst_0        
	//   20   40:putfield        #65  <Field boolean t>
		c.setRunLowFrame(false);
	//   21   43:aload_0         
	//   22   44:getfield        #76  <Field s c>
	//   23   47:iconst_0        
	//   24   48:invokeinterface #346 <Method void s.setRunLowFrame(boolean)>
	//   25   53:return          
	}

	public void setPosition(LatLng latlng)
		throws RemoteException
	{
		e = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #262 <Field LatLng e>
		d();
	//    3    5:aload_0         
	//    4    6:invokespecial   #365 <Method void d()>
		c.setRunLowFrame(false);
	//    5    9:aload_0         
	//    6   10:getfield        #76  <Field s c>
	//    7   13:iconst_0        
	//    8   14:invokeinterface #346 <Method void s.setRunLowFrame(boolean)>
	//    9   19:return          
	}

	public void setPositionFromBounds(LatLngBounds latlngbounds)
		throws RemoteException
	{
		if(latlngbounds == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			h = latlngbounds;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #288 <Field LatLngBounds h>
			e();
	//    6   10:aload_0         
	//    7   11:invokespecial   #363 <Method void e()>
			c.setRunLowFrame(false);
	//    8   14:aload_0         
	//    9   15:getfield        #76  <Field s c>
	//   10   18:iconst_0        
	//   11   19:invokeinterface #346 <Method void s.setRunLowFrame(boolean)>
			return;
	//   12   24:return          
		}
	}

	public void setTransparency(float f1)
		throws RemoteException
	{
		l = (float)Math.min(1.0D, Math.max(0.0D, f1));
	//    0    0:aload_0         
	//    1    1:dconst_1        
	//    2    2:dconst_0        
	//    3    3:fload_1         
	//    4    4:f2d             
	//    5    5:invokestatic    #470 <Method double Math.max(double, double)>
	//    6    8:invokestatic    #473 <Method double Math.min(double, double)>
	//    7   11:d2f             
	//    8   12:putfield        #54  <Field float l>
		m = 1.0F - f1;
	//    9   15:aload_0         
	//   10   16:fconst_1        
	//   11   17:fload_1         
	//   12   18:fsub            
	//   13   19:putfield        #56  <Field float m>
		c.setRunLowFrame(false);
	//   14   22:aload_0         
	//   15   23:getfield        #76  <Field s c>
	//   16   26:iconst_0        
	//   17   27:invokeinterface #346 <Method void s.setRunLowFrame(boolean)>
	//   18   32:return          
	}

	public void setVisible(boolean flag)
		throws RemoteException
	{
		k = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field boolean k>
		c.setRunLowFrame(false);
	//    3    5:aload_0         
	//    4    6:getfield        #76  <Field s c>
	//    5    9:iconst_0        
	//    6   10:invokeinterface #346 <Method void s.setRunLowFrame(boolean)>
	//    7   15:return          
	}

	public void setZIndex(float f1)
		throws RemoteException
	{
		j = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #428 <Field float j>
		c.f();
	//    3    5:aload_0         
	//    4    6:getfield        #76  <Field s c>
	//    5    9:invokeinterface #476 <Method void s.f()>
		c.setRunLowFrame(false);
	//    6   14:aload_0         
	//    7   15:getfield        #76  <Field s c>
	//    8   18:iconst_0        
	//    9   19:invokeinterface #346 <Method void s.setRunLowFrame(boolean)>
	//   10   24:return          
	}

	float a[];
	ds.c b;
	private s c;
	private BitmapDescriptor d;
	private LatLng e;
	private float f;
	private float g;
	private LatLngBounds h;
	private float i;
	private float j;
	private boolean k;
	private float l;
	private float m;
	private float n;
	private float o;
	private String p;
	private FloatBuffer q;
	private FloatBuffer r;
	private int s;
	private boolean t;
	private boolean u;
	private List v;
	private q w;
}
