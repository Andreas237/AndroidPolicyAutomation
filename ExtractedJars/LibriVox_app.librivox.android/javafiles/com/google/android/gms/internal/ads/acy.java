// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.*;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wx, acz, ada

final class acy
	implements SensorEventListener
{

	acy(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		a = (SensorManager)context.getSystemService("sensor");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #31  <String "sensor">
	//    5    8:invokevirtual   #37  <Method Object Context.getSystemService(String)>
	//    6   11:checkcast       #39  <Class SensorManager>
	//    7   14:putfield        #41  <Field SensorManager a>
		c = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:ldc1            #43  <String "window">
	//   11   21:invokevirtual   #37  <Method Object Context.getSystemService(String)>
	//   12   24:checkcast       #45  <Class WindowManager>
	//   13   27:invokeinterface #49  <Method Display WindowManager.getDefaultDisplay()>
	//   14   32:putfield        #51  <Field Display c>
	//   15   35:aload_0         
	//   16   36:bipush          9
	//   17   38:newarray        float[]
	//   18   40:putfield        #53  <Field float[] d>
	//   19   43:aload_0         
	//   20   44:bipush          9
	//   21   46:newarray        float[]
	//   22   48:putfield        #55  <Field float[] e>
	//   23   51:aload_0         
	//   24   52:new             #4   <Class Object>
	//   25   55:dup             
	//   26   56:invokespecial   #29  <Method void Object()>
	//   27   59:putfield        #57  <Field Object b>
	//   28   62:return          
	}

	private final void a(int i, int j)
	{
		float af[] = e;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field float[] e>
	//    2    4:astore          4
		float f1 = af[i];
	//    3    6:aload           4
	//    4    8:iload_1         
	//    5    9:faload          
	//    6   10:fstore_3        
		af[i] = af[j];
	//    7   11:aload           4
	//    8   13:iload_1         
	//    9   14:aload           4
	//   10   16:iload_2         
	//   11   17:faload          
	//   12   18:fastore         
		af[j] = f1;
	//   13   19:aload           4
	//   14   21:iload_2         
	//   15   22:fload_3         
	//   16   23:fastore         
	//   17   24:return          
	}

	final void a()
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field Handler g>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		Sensor sensor = a.getDefaultSensor(11);
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field SensorManager a>
	//    6   12:bipush          11
	//    7   14:invokevirtual   #65  <Method Sensor SensorManager.getDefaultSensor(int)>
	//    8   17:astore_1        
		if(sensor == null)
	//*   9   18:aload_1         
	//*  10   19:ifnonnull       28
		{
			wx.c("No Sensor of TYPE_ROTATION_VECTOR");
	//   11   22:ldc1            #67  <String "No Sensor of TYPE_ROTATION_VECTOR">
	//   12   24:invokestatic    #72  <Method void wx.c(String)>
			return;
	//   13   27:return          
		}
		HandlerThread handlerthread = new HandlerThread("OrientationMonitor");
	//   14   28:new             #74  <Class HandlerThread>
	//   15   31:dup             
	//   16   32:ldc1            #76  <String "OrientationMonitor">
	//   17   34:invokespecial   #78  <Method void HandlerThread(String)>
	//   18   37:astore_2        
		handlerthread.start();
	//   19   38:aload_2         
	//   20   39:invokevirtual   #81  <Method void HandlerThread.start()>
		g = new Handler(handlerthread.getLooper());
	//   21   42:aload_0         
	//   22   43:new             #83  <Class Handler>
	//   23   46:dup             
	//   24   47:aload_2         
	//   25   48:invokevirtual   #87  <Method android.os.Looper HandlerThread.getLooper()>
	//   26   51:invokespecial   #90  <Method void Handler(android.os.Looper)>
	//   27   54:putfield        #61  <Field Handler g>
		if(!a.registerListener(((SensorEventListener) (this)), sensor, 0, g))
	//*  28   57:aload_0         
	//*  29   58:getfield        #41  <Field SensorManager a>
	//*  30   61:aload_0         
	//*  31   62:aload_1         
	//*  32   63:iconst_0        
	//*  33   64:aload_0         
	//*  34   65:getfield        #61  <Field Handler g>
	//*  35   68:invokevirtual   #94  <Method boolean SensorManager.registerListener(SensorEventListener, Sensor, int, Handler)>
	//*  36   71:ifne            83
		{
			wx.c("SensorManager.registerListener failed.");
	//   37   74:ldc1            #96  <String "SensorManager.registerListener failed.">
	//   38   76:invokestatic    #72  <Method void wx.c(String)>
			b();
	//   39   79:aload_0         
	//   40   80:invokevirtual   #98  <Method void b()>
		}
	//   41   83:return          
	}

	final void a(ada ada1)
	{
		h = ada1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #101 <Field ada h>
	//    3    5:return          
	}

	final boolean a(float af[])
	{
label0:
		{
			synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(f != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #104 <Field float[] f>
	//    7   11:ifnonnull       18
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		}
		System.arraycopy(((Object) (f)), 0, ((Object) (af)), 0, f.length);
	//   12   18:aload_0         
	//   13   19:getfield        #104 <Field float[] f>
	//   14   22:iconst_0        
	//   15   23:aload_1         
	//   16   24:iconst_0        
	//   17   25:aload_0         
	//   18   26:getfield        #104 <Field float[] f>
	//   19   29:arraylength     
	//   20   30:invokestatic    #110 <Method void System.arraycopy(Object, int, Object, int, int)>
		obj;
	//   21   33:aload_2         
		JVM INSTR monitorexit ;
	//   22   34:monitorexit     
		return true;
	//   23   35:iconst_1        
	//   24   36:ireturn         
		af;
	//   25   37:astore_1        
		obj;
	//   26   38:aload_2         
		JVM INSTR monitorexit ;
	//   27   39:monitorexit     
		throw af;
	//   28   40:aload_1         
	//   29   41:athrow          
	}

	final void b()
	{
		if(g == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field Handler g>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			a.unregisterListener(((SensorEventListener) (this)));
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field SensorManager a>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #114 <Method void SensorManager.unregisterListener(SensorEventListener)>
			g.post(((Runnable) (new acz(this))));
	//    8   16:aload_0         
	//    9   17:getfield        #61  <Field Handler g>
	//   10   20:new             #116 <Class acz>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #119 <Method void acz(acy)>
	//   14   28:invokevirtual   #123 <Method boolean Handler.post(Runnable)>
	//   15   31:pop             
			g = null;
	//   16   32:aload_0         
	//   17   33:aconst_null     
	//   18   34:putfield        #61  <Field Handler g>
			return;
	//   19   37:return          
		}
	}

	public final void onAccuracyChanged(Sensor sensor, int i)
	{
	//    0    0:return          
	}

	public final void onSensorChanged(SensorEvent sensorevent)
	{
		float af[] = sensorevent.values;
	//    0    0:aload_1         
	//    1    1:getfield        #132 <Field float[] SensorEvent.values>
	//    2    4:astore_2        
		if(af[0] != 0.0F || af[1] != 0.0F || af[2] != 0.0F)
	//*   3    5:aload_2         
	//*   4    6:iconst_0        
	//*   5    7:faload          
	//*   6    8:fconst_0        
	//*   7    9:fcmpl           
	//*   8   10:ifne            29
	//*   9   13:aload_2         
	//*  10   14:iconst_1        
	//*  11   15:faload          
	//*  12   16:fconst_0        
	//*  13   17:fcmpl           
	//*  14   18:ifne            29
	//*  15   21:aload_2         
	//*  16   22:iconst_2        
	//*  17   23:faload          
	//*  18   24:fconst_0        
	//*  19   25:fcmpl           
	//*  20   26:ifeq            229
		{
			synchronized(b)
	//*  21   29:aload_0         
	//*  22   30:getfield        #57  <Field Object b>
	//*  23   33:astore_1        
	//*  24   34:aload_1         
	//*  25   35:monitorenter    
			{
				if(f == null)
	//*  26   36:aload_0         
	//*  27   37:getfield        #104 <Field float[] f>
	//*  28   40:ifnonnull       51
					f = new float[9];
	//   29   43:aload_0         
	//   30   44:bipush          9
	//   31   46:newarray        float[]
	//   32   48:putfield        #104 <Field float[] f>
			}
	//   33   51:aload_1         
	//   34   52:monitorexit     
			SensorManager.getRotationMatrixFromVector(d, af);
	//   35   53:aload_0         
	//   36   54:getfield        #53  <Field float[] d>
	//   37   57:aload_2         
	//   38   58:invokestatic    #136 <Method void SensorManager.getRotationMatrixFromVector(float[], float[])>
			switch(c.getRotation())
	//*  39   61:aload_0         
	//*  40   62:getfield        #51  <Field Display c>
	//*  41   65:invokevirtual   #142 <Method int Display.getRotation()>
			{
	//*  42   68:tableswitch     1 3: default 96
	//	               1 154
	//	               2 133
	//	               3 114
			default:
				System.arraycopy(((Object) (d)), 0, ((Object) (e)), 0, 9);
	//   43   96:aload_0         
	//   44   97:getfield        #53  <Field float[] d>
	//   45  100:iconst_0        
	//   46  101:aload_0         
	//   47  102:getfield        #55  <Field float[] e>
	//   48  105:iconst_0        
	//   49  106:bipush          9
	//   50  108:invokestatic    #110 <Method void System.arraycopy(Object, int, Object, int, int)>
				break;

	//*  51  111:goto            170
			case 3: // '\003'
				SensorManager.remapCoordinateSystem(d, 130, 1, e);
	//   52  114:aload_0         
	//   53  115:getfield        #53  <Field float[] d>
	//   54  118:sipush          130
	//   55  121:iconst_1        
	//   56  122:aload_0         
	//   57  123:getfield        #55  <Field float[] e>
	//   58  126:invokestatic    #146 <Method boolean SensorManager.remapCoordinateSystem(float[], int, int, float[])>
	//   59  129:pop             
				break;

	//*  60  130:goto            170
			case 2: // '\002'
				SensorManager.remapCoordinateSystem(d, 129, 130, e);
	//   61  133:aload_0         
	//   62  134:getfield        #53  <Field float[] d>
	//   63  137:sipush          129
	//   64  140:sipush          130
	//   65  143:aload_0         
	//   66  144:getfield        #55  <Field float[] e>
	//   67  147:invokestatic    #146 <Method boolean SensorManager.remapCoordinateSystem(float[], int, int, float[])>
	//   68  150:pop             
				break;

	//*  69  151:goto            170
			case 1: // '\001'
				SensorManager.remapCoordinateSystem(d, 2, 129, e);
	//   70  154:aload_0         
	//   71  155:getfield        #53  <Field float[] d>
	//   72  158:iconst_2        
	//   73  159:sipush          129
	//   74  162:aload_0         
	//   75  163:getfield        #55  <Field float[] e>
	//   76  166:invokestatic    #146 <Method boolean SensorManager.remapCoordinateSystem(float[], int, int, float[])>
	//   77  169:pop             
				break;
			}
			a(1, 3);
	//   78  170:aload_0         
	//   79  171:iconst_1        
	//   80  172:iconst_3        
	//   81  173:invokespecial   #148 <Method void a(int, int)>
			a(2, 6);
	//   82  176:aload_0         
	//   83  177:iconst_2        
	//   84  178:bipush          6
	//   85  180:invokespecial   #148 <Method void a(int, int)>
			a(5, 7);
	//   86  183:aload_0         
	//   87  184:iconst_5        
	//   88  185:bipush          7
	//   89  187:invokespecial   #148 <Method void a(int, int)>
			synchronized(b)
	//*  90  190:aload_0         
	//*  91  191:getfield        #57  <Field Object b>
	//*  92  194:astore_1        
	//*  93  195:aload_1         
	//*  94  196:monitorenter    
			{
				System.arraycopy(((Object) (e)), 0, ((Object) (f)), 0, 9);
	//   95  197:aload_0         
	//   96  198:getfield        #55  <Field float[] e>
	//   97  201:iconst_0        
	//   98  202:aload_0         
	//   99  203:getfield        #104 <Field float[] f>
	//  100  206:iconst_0        
	//  101  207:bipush          9
	//  102  209:invokestatic    #110 <Method void System.arraycopy(Object, int, Object, int, int)>
			}
	//  103  212:aload_1         
	//  104  213:monitorexit     
			sensorevent = ((SensorEvent) (h));
	//  105  214:aload_0         
	//  106  215:getfield        #101 <Field ada h>
	//  107  218:astore_1        
			if(sensorevent != null)
	//* 108  219:aload_1         
	//* 109  220:ifnull          229
				((ada) (sensorevent)).a();
	//  110  223:aload_1         
	//  111  224:invokeinterface #152 <Method void ada.a()>
		}
		return;
	//  112  229:return          
		exception;
	//  113  230:astore_2        
		sensorevent;
	//  114  231:aload_1         
		JVM INSTR monitorexit ;
	//  115  232:monitorexit     
		throw exception;
	//  116  233:aload_2         
	//  117  234:athrow          
		exception1;
	//  118  235:astore_2        
		sensorevent;
	//  119  236:aload_1         
		JVM INSTR monitorexit ;
	//  120  237:monitorexit     
		throw exception1;
	//  121  238:aload_2         
	//  122  239:athrow          
	}

	private final SensorManager a;
	private final Object b = new Object();
	private final Display c;
	private final float d[] = new float[9];
	private final float e[] = new float[9];
	private float f[];
	private Handler g;
	private ada h;
}
