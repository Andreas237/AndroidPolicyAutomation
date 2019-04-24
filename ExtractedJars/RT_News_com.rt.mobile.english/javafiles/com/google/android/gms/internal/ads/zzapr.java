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
//			zzapt, zzakb, zzaps

final class zzapr
	implements SensorEventListener
{

	zzapr(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		zzcyn = (SensorManager)context.getSystemService("sensor");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #31  <String "sensor">
	//    5    8:invokevirtual   #37  <Method Object Context.getSystemService(String)>
	//    6   11:checkcast       #39  <Class SensorManager>
	//    7   14:putfield        #41  <Field SensorManager zzcyn>
		zzcyp = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:ldc1            #43  <String "window">
	//   11   21:invokevirtual   #37  <Method Object Context.getSystemService(String)>
	//   12   24:checkcast       #45  <Class WindowManager>
	//   13   27:invokeinterface #49  <Method Display WindowManager.getDefaultDisplay()>
	//   14   32:putfield        #51  <Field Display zzcyp>
	//   15   35:aload_0         
	//   16   36:bipush          9
	//   17   38:newarray        float[]
	//   18   40:putfield        #53  <Field float[] zzcyq>
	//   19   43:aload_0         
	//   20   44:bipush          9
	//   21   46:newarray        float[]
	//   22   48:putfield        #55  <Field float[] zzcyr>
	//   23   51:aload_0         
	//   24   52:new             #4   <Class Object>
	//   25   55:dup             
	//   26   56:invokespecial   #29  <Method void Object()>
	//   27   59:putfield        #57  <Field Object zzcyo>
	//   28   62:return          
	}

	private final void zzg(int i, int j)
	{
		float f = zzcyr[i];
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field float[] zzcyr>
	//    2    4:iload_1         
	//    3    5:faload          
	//    4    6:fstore_3        
		zzcyr[i] = zzcyr[j];
	//    5    7:aload_0         
	//    6    8:getfield        #55  <Field float[] zzcyr>
	//    7   11:iload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #55  <Field float[] zzcyr>
	//   10   16:iload_2         
	//   11   17:faload          
	//   12   18:fastore         
		zzcyr[j] = f;
	//   13   19:aload_0         
	//   14   20:getfield        #55  <Field float[] zzcyr>
	//   15   23:iload_2         
	//   16   24:fload_3         
	//   17   25:fastore         
	//   18   26:return          
	}

	public final void onAccuracyChanged(Sensor sensor, int i)
	{
	//    0    0:return          
	}

	public final void onSensorChanged(SensorEvent sensorevent)
	{
		float af[] = sensorevent.values;
	//    0    0:aload_1         
	//    1    1:getfield        #69  <Field float[] SensorEvent.values>
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
	//*  20   26:ifeq            230
		{
			synchronized(zzcyo)
	//*  21   29:aload_0         
	//*  22   30:getfield        #57  <Field Object zzcyo>
	//*  23   33:astore_1        
	//*  24   34:aload_1         
	//*  25   35:monitorenter    
			{
				if(zzcys == null)
	//*  26   36:aload_0         
	//*  27   37:getfield        #71  <Field float[] zzcys>
	//*  28   40:ifnonnull       51
					zzcys = new float[9];
	//   29   43:aload_0         
	//   30   44:bipush          9
	//   31   46:newarray        float[]
	//   32   48:putfield        #71  <Field float[] zzcys>
			}
	//   33   51:aload_1         
	//   34   52:monitorexit     
			SensorManager.getRotationMatrixFromVector(zzcyq, af);
	//   35   53:aload_0         
	//   36   54:getfield        #53  <Field float[] zzcyq>
	//   37   57:aload_2         
	//   38   58:invokestatic    #75  <Method void SensorManager.getRotationMatrixFromVector(float[], float[])>
			switch(zzcyp.getRotation())
	//*  39   61:aload_0         
	//*  40   62:getfield        #51  <Field Display zzcyp>
	//*  41   65:invokevirtual   #81  <Method int Display.getRotation()>
			{
	//*  42   68:tableswitch     1 3: default 96
	//	               1 154
	//	               2 133
	//	               3 114
			default:
				System.arraycopy(((Object) (zzcyq)), 0, ((Object) (zzcyr)), 0, 9);
	//   43   96:aload_0         
	//   44   97:getfield        #53  <Field float[] zzcyq>
	//   45  100:iconst_0        
	//   46  101:aload_0         
	//   47  102:getfield        #55  <Field float[] zzcyr>
	//   48  105:iconst_0        
	//   49  106:bipush          9
	//   50  108:invokestatic    #87  <Method void System.arraycopy(Object, int, Object, int, int)>
				break;

	//*  51  111:goto            170
			case 3: // '\003'
				SensorManager.remapCoordinateSystem(zzcyq, 130, 1, zzcyr);
	//   52  114:aload_0         
	//   53  115:getfield        #53  <Field float[] zzcyq>
	//   54  118:sipush          130
	//   55  121:iconst_1        
	//   56  122:aload_0         
	//   57  123:getfield        #55  <Field float[] zzcyr>
	//   58  126:invokestatic    #91  <Method boolean SensorManager.remapCoordinateSystem(float[], int, int, float[])>
	//   59  129:pop             
				break;

	//*  60  130:goto            170
			case 2: // '\002'
				SensorManager.remapCoordinateSystem(zzcyq, 129, 130, zzcyr);
	//   61  133:aload_0         
	//   62  134:getfield        #53  <Field float[] zzcyq>
	//   63  137:sipush          129
	//   64  140:sipush          130
	//   65  143:aload_0         
	//   66  144:getfield        #55  <Field float[] zzcyr>
	//   67  147:invokestatic    #91  <Method boolean SensorManager.remapCoordinateSystem(float[], int, int, float[])>
	//   68  150:pop             
				break;

	//*  69  151:goto            170
			case 1: // '\001'
				SensorManager.remapCoordinateSystem(zzcyq, 2, 129, zzcyr);
	//   70  154:aload_0         
	//   71  155:getfield        #53  <Field float[] zzcyq>
	//   72  158:iconst_2        
	//   73  159:sipush          129
	//   74  162:aload_0         
	//   75  163:getfield        #55  <Field float[] zzcyr>
	//   76  166:invokestatic    #91  <Method boolean SensorManager.remapCoordinateSystem(float[], int, int, float[])>
	//   77  169:pop             
				break;
			}
			zzg(1, 3);
	//   78  170:aload_0         
	//   79  171:iconst_1        
	//   80  172:iconst_3        
	//   81  173:invokespecial   #93  <Method void zzg(int, int)>
			zzg(2, 6);
	//   82  176:aload_0         
	//   83  177:iconst_2        
	//   84  178:bipush          6
	//   85  180:invokespecial   #93  <Method void zzg(int, int)>
			zzg(5, 7);
	//   86  183:aload_0         
	//   87  184:iconst_5        
	//   88  185:bipush          7
	//   89  187:invokespecial   #93  <Method void zzg(int, int)>
			synchronized(zzcyo)
	//*  90  190:aload_0         
	//*  91  191:getfield        #57  <Field Object zzcyo>
	//*  92  194:astore_1        
	//*  93  195:aload_1         
	//*  94  196:monitorenter    
			{
				System.arraycopy(((Object) (zzcyr)), 0, ((Object) (zzcys)), 0, 9);
	//   95  197:aload_0         
	//   96  198:getfield        #55  <Field float[] zzcyr>
	//   97  201:iconst_0        
	//   98  202:aload_0         
	//   99  203:getfield        #71  <Field float[] zzcys>
	//  100  206:iconst_0        
	//  101  207:bipush          9
	//  102  209:invokestatic    #87  <Method void System.arraycopy(Object, int, Object, int, int)>
			}
	//  103  212:aload_1         
	//  104  213:monitorexit     
			if(zzcyu != null)
	//* 105  214:aload_0         
	//* 106  215:getfield        #95  <Field zzapt zzcyu>
	//* 107  218:ifnull          230
				zzcyu.zznn();
	//  108  221:aload_0         
	//  109  222:getfield        #95  <Field zzapt zzcyu>
	//  110  225:invokeinterface #100 <Method void zzapt.zznn()>
		}
		return;
	//  111  230:return          
		exception;
	//  112  231:astore_2        
		sensorevent;
	//  113  232:aload_1         
		JVM INSTR monitorexit ;
	//  114  233:monitorexit     
		throw exception;
	//  115  234:aload_2         
	//  116  235:athrow          
		exception1;
	//  117  236:astore_2        
		sensorevent;
	//  118  237:aload_1         
		JVM INSTR monitorexit ;
	//  119  238:monitorexit     
		throw exception1;
	//  120  239:aload_2         
	//  121  240:athrow          
	}

	final void start()
	{
		if(zzcyt != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field Handler zzcyt>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		Sensor sensor = zzcyn.getDefaultSensor(11);
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field SensorManager zzcyn>
	//    6   12:bipush          11
	//    7   14:invokevirtual   #107 <Method Sensor SensorManager.getDefaultSensor(int)>
	//    8   17:astore_1        
		if(sensor == null)
	//*   9   18:aload_1         
	//*  10   19:ifnonnull       28
		{
			zzakb.e("No Sensor of TYPE_ROTATION_VECTOR");
	//   11   22:ldc1            #109 <String "No Sensor of TYPE_ROTATION_VECTOR">
	//   12   24:invokestatic    #115 <Method void zzakb.e(String)>
			return;
	//   13   27:return          
		}
		HandlerThread handlerthread = new HandlerThread("OrientationMonitor");
	//   14   28:new             #117 <Class HandlerThread>
	//   15   31:dup             
	//   16   32:ldc1            #119 <String "OrientationMonitor">
	//   17   34:invokespecial   #121 <Method void HandlerThread(String)>
	//   18   37:astore_2        
		handlerthread.start();
	//   19   38:aload_2         
	//   20   39:invokevirtual   #123 <Method void HandlerThread.start()>
		zzcyt = new Handler(handlerthread.getLooper());
	//   21   42:aload_0         
	//   22   43:new             #125 <Class Handler>
	//   23   46:dup             
	//   24   47:aload_2         
	//   25   48:invokevirtual   #129 <Method android.os.Looper HandlerThread.getLooper()>
	//   26   51:invokespecial   #132 <Method void Handler(android.os.Looper)>
	//   27   54:putfield        #103 <Field Handler zzcyt>
		if(!zzcyn.registerListener(((SensorEventListener) (this)), sensor, 0, zzcyt))
	//*  28   57:aload_0         
	//*  29   58:getfield        #41  <Field SensorManager zzcyn>
	//*  30   61:aload_0         
	//*  31   62:aload_1         
	//*  32   63:iconst_0        
	//*  33   64:aload_0         
	//*  34   65:getfield        #103 <Field Handler zzcyt>
	//*  35   68:invokevirtual   #136 <Method boolean SensorManager.registerListener(SensorEventListener, Sensor, int, Handler)>
	//*  36   71:ifne            83
		{
			zzakb.e("SensorManager.registerListener failed.");
	//   37   74:ldc1            #138 <String "SensorManager.registerListener failed.">
	//   38   76:invokestatic    #115 <Method void zzakb.e(String)>
			stop();
	//   39   79:aload_0         
	//   40   80:invokevirtual   #141 <Method void stop()>
		}
	//   41   83:return          
	}

	final void stop()
	{
		if(zzcyt == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field Handler zzcyt>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			zzcyn.unregisterListener(((SensorEventListener) (this)));
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field SensorManager zzcyn>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #145 <Method void SensorManager.unregisterListener(SensorEventListener)>
			zzcyt.post(((Runnable) (new zzaps(this))));
	//    8   16:aload_0         
	//    9   17:getfield        #103 <Field Handler zzcyt>
	//   10   20:new             #147 <Class zzaps>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #150 <Method void zzaps(zzapr)>
	//   14   28:invokevirtual   #154 <Method boolean Handler.post(Runnable)>
	//   15   31:pop             
			zzcyt = null;
	//   16   32:aload_0         
	//   17   33:aconst_null     
	//   18   34:putfield        #103 <Field Handler zzcyt>
			return;
	//   19   37:return          
		}
	}

	final void zza(zzapt zzapt1)
	{
		zzcyu = zzapt1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field zzapt zzcyu>
	//    3    5:return          
	}

	final boolean zza(float af[])
	{
label0:
		{
			synchronized(zzcyo)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field Object zzcyo>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzcys != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #71  <Field float[] zzcys>
	//    7   11:ifnonnull       18
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		}
		System.arraycopy(((Object) (zzcys)), 0, ((Object) (af)), 0, zzcys.length);
	//   12   18:aload_0         
	//   13   19:getfield        #71  <Field float[] zzcys>
	//   14   22:iconst_0        
	//   15   23:aload_1         
	//   16   24:iconst_0        
	//   17   25:aload_0         
	//   18   26:getfield        #71  <Field float[] zzcys>
	//   19   29:arraylength     
	//   20   30:invokestatic    #87  <Method void System.arraycopy(Object, int, Object, int, int)>
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

	private final SensorManager zzcyn;
	private final Object zzcyo = new Object();
	private final Display zzcyp;
	private final float zzcyq[] = new float[9];
	private final float zzcyr[] = new float[9];
	private float zzcys[];
	private Handler zzcyt;
	private zzapt zzcyu;
}
