// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.message;

import com.autonavi.ae.gmap.GLMapState;

// Referenced classes of package com.autonavi.amap.mapcore.message:
//			AbstractGestureMapMessage

public class HoverGestureMapMessage extends AbstractGestureMapMessage
{

	public HoverGestureMapMessage(int i, float f)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #22  <Method void AbstractGestureMapMessage(int)>
		angleDelta = 0.0F;
	//    3    5:aload_0         
	//    4    6:fconst_0        
	//    5    7:putfield        #24  <Field float angleDelta>
		angleDelta = f;
	//    6   10:aload_0         
	//    7   11:fload_2         
	//    8   12:putfield        #24  <Field float angleDelta>
	//    9   15:return          
	}

	public static void destory()
	{
		M_POOL.destory();
	//    0    0:getstatic       #19  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:invokevirtual   #27  <Method void com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.destory()>
	//    2    6:return          
	}

	public static HoverGestureMapMessage obtain(int i, float f)
	{
		HoverGestureMapMessage hovergesturemapmessage = (HoverGestureMapMessage)M_POOL.acquire();
	//    0    0:getstatic       #19  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:invokevirtual   #33  <Method Object com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.acquire()>
	//    2    6:checkcast       #2   <Class HoverGestureMapMessage>
	//    3    9:astore_2        
		if(hovergesturemapmessage == null)
	//*   4   10:aload_2         
	//*   5   11:ifnonnull       27
			hovergesturemapmessage = new HoverGestureMapMessage(i, f);
	//    6   14:new             #2   <Class HoverGestureMapMessage>
	//    7   17:dup             
	//    8   18:iload_0         
	//    9   19:fload_1         
	//   10   20:invokespecial   #35  <Method void HoverGestureMapMessage(int, float)>
	//   11   23:astore_2        
		else
	//*  12   24:goto            31
			hovergesturemapmessage.reset();
	//   13   27:aload_2         
	//   14   28:invokevirtual   #38  <Method void reset()>
		hovergesturemapmessage.setParams(i, f);
	//   15   31:aload_2         
	//   16   32:iload_0         
	//   17   33:fload_1         
	//   18   34:invokespecial   #41  <Method void setParams(int, float)>
		return hovergesturemapmessage;
	//   19   37:aload_2         
	//   20   38:areturn         
	}

	private void setParams(int i, float f)
	{
		setState(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #44  <Method void setState(int)>
		angleDelta = f;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #24  <Field float angleDelta>
	//    6   10:return          
	}

	public int getType()
	{
		return 3;
	//    0    0:iconst_3        
	//    1    1:ireturn         
	}

	public void recycle()
	{
		M_POOL.release(((Object) (this)));
	//    0    0:getstatic       #19  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #51  <Method boolean com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.release(Object)>
	//    3    7:pop             
	//    4    8:return          
	}

	public void runCameraUpdate(GLMapState glmapstate)
	{
		float f1 = glmapstate.getCameraDegree() + angleDelta;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #59  <Method float GLMapState.getCameraDegree()>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field float angleDelta>
	//    4    8:fadd            
	//    5    9:fstore_3        
		float f;
		if(f1 < 0.0F)
	//*   6   10:fload_3         
	//*   7   11:fconst_0        
	//*   8   12:fcmpg           
	//*   9   13:ifge            21
			f = 0.0F;
	//   10   16:fconst_0        
	//   11   17:fstore_2        
		else
	//*  12   18:goto            69
		if(f1 > 80F)
	//*  13   21:fload_3         
	//*  14   22:ldc1            #60  <Float 80F>
	//*  15   24:fcmpl           
	//*  16   25:ifle            34
		{
			f = 80F;
	//   17   28:ldc1            #60  <Float 80F>
	//   18   30:fstore_2        
		} else
	//*  19   31:goto            69
		{
			f = f1;
	//   20   34:fload_3         
	//   21   35:fstore_2        
			if(glmapstate.getCameraDegree() > 40F)
	//*  22   36:aload_1         
	//*  23   37:invokevirtual   #59  <Method float GLMapState.getCameraDegree()>
	//*  24   40:ldc1            #61  <Float 40F>
	//*  25   42:fcmpl           
	//*  26   43:ifle            69
			{
				f = f1;
	//   27   46:fload_3         
	//   28   47:fstore_2        
				if(f1 > 40F)
	//*  29   48:fload_3         
	//*  30   49:ldc1            #61  <Float 40F>
	//*  31   51:fcmpl           
	//*  32   52:ifle            69
				{
					f = f1;
	//   33   55:fload_3         
	//   34   56:fstore_2        
					if(glmapstate.getCameraDegree() > f1)
	//*  35   57:aload_1         
	//*  36   58:invokevirtual   #59  <Method float GLMapState.getCameraDegree()>
	//*  37   61:fload_3         
	//*  38   62:fcmpl           
	//*  39   63:ifle            69
						f = 40F;
	//   40   66:ldc1            #61  <Float 40F>
	//   41   68:fstore_2        
				}
			}
		}
		glmapstate.setCameraDegree(f);
	//   42   69:aload_1         
	//   43   70:fload_2         
	//   44   71:invokevirtual   #65  <Method void GLMapState.setCameraDegree(float)>
		glmapstate.recalculate();
	//   45   74:aload_1         
	//   46   75:invokevirtual   #68  <Method void GLMapState.recalculate()>
	//   47   78:return          
	}

	private static final com.autonavi.ae.gmap.maploader.Pools.SynchronizedPool M_POOL = new com.autonavi.ae.gmap.maploader.Pools.SynchronizedPool(256);
	public float angleDelta;

	static 
	{
	//    0    0:new             #13  <Class com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool>
	//    1    3:dup             
	//    2    4:sipush          256
	//    3    7:invokespecial   #17  <Method void com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool(int)>
	//    4   10:putstatic       #19  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//*   5   13:return          
	}
}
