// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.message;

import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.IPoint;

// Referenced classes of package com.autonavi.amap.mapcore.message:
//			AbstractGestureMapMessage

public class MoveGestureMapMessage extends AbstractGestureMapMessage
{

	public MoveGestureMapMessage(int i, float f, float f1)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #27  <Method void AbstractGestureMapMessage(int)>
		touchDeltaX = 0.0F;
	//    3    5:aload_0         
	//    4    6:fconst_0        
	//    5    7:putfield        #29  <Field float touchDeltaX>
		touchDeltaY = 0.0F;
	//    6   10:aload_0         
	//    7   11:fconst_0        
	//    8   12:putfield        #31  <Field float touchDeltaY>
		touchDeltaX = f;
	//    9   15:aload_0         
	//   10   16:fload_2         
	//   11   17:putfield        #29  <Field float touchDeltaX>
		touchDeltaY = f1;
	//   12   20:aload_0         
	//   13   21:fload_3         
	//   14   22:putfield        #31  <Field float touchDeltaY>
		newCount++;
	//   15   25:getstatic       #16  <Field int newCount>
	//   16   28:iconst_1        
	//   17   29:iadd            
	//   18   30:putstatic       #16  <Field int newCount>
	//   19   33:return          
	}

	public static void destory()
	{
		M_POOL.destory();
	//    0    0:getstatic       #24  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:invokevirtual   #34  <Method void com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.destory()>
	//    2    6:return          
	}

	public static MoveGestureMapMessage obtain(int i, float f, float f1)
	{
		com/autonavi/amap/mapcore/message/MoveGestureMapMessage;
	//    0    0:ldc1            #2   <Class MoveGestureMapMessage>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		MoveGestureMapMessage movegesturemapmessage = (MoveGestureMapMessage)M_POOL.acquire();
	//    2    3:getstatic       #24  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    3    6:invokevirtual   #40  <Method Object com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.acquire()>
	//    4    9:checkcast       #2   <Class MoveGestureMapMessage>
	//    5   12:astore_3        
		if(movegesturemapmessage != null)
			break MISSING_BLOCK_LABEL_31;
	//    6   13:aload_3         
	//    7   14:ifnonnull       31
		movegesturemapmessage = new MoveGestureMapMessage(i, f, f1);
	//    8   17:new             #2   <Class MoveGestureMapMessage>
	//    9   20:dup             
	//   10   21:iload_0         
	//   11   22:fload_1         
	//   12   23:fload_2         
	//   13   24:invokespecial   #42  <Method void MoveGestureMapMessage(int, float, float)>
	//   14   27:astore_3        
		break MISSING_BLOCK_LABEL_42;
	//   15   28:goto            42
		movegesturemapmessage.reset();
	//   16   31:aload_3         
	//   17   32:invokevirtual   #45  <Method void reset()>
		movegesturemapmessage.setParams(i, f, f1);
	//   18   35:aload_3         
	//   19   36:iload_0         
	//   20   37:fload_1         
	//   21   38:fload_2         
	//   22   39:invokespecial   #48  <Method void setParams(int, float, float)>
		com/autonavi/amap/mapcore/message/MoveGestureMapMessage;
	//   23   42:ldc1            #2   <Class MoveGestureMapMessage>
		JVM INSTR monitorexit ;
	//   24   44:monitorexit     
		return movegesturemapmessage;
	//   25   45:aload_3         
	//   26   46:areturn         
		Exception exception;
		exception;
	//   27   47:astore_3        
	//*  28   48:ldc1            #2   <Class MoveGestureMapMessage>
		throw exception;
	//   29   50:monitorexit     
	//   30   51:aload_3         
	//   31   52:athrow          
	}

	private void setParams(int i, float f, float f1)
	{
		setState(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #51  <Method void setState(int)>
		touchDeltaX = f;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #29  <Field float touchDeltaX>
		touchDeltaY = f1;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #31  <Field float touchDeltaY>
	//    9   15:return          
	}

	public int getType()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void recycle()
	{
		M_POOL.release(((Object) (this)));
	//    0    0:getstatic       #24  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #58  <Method boolean com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool.release(Object)>
	//    3    7:pop             
	//    4    8:return          
	}

	public void runCameraUpdate(GLMapState glmapstate)
	{
		int j = (int)touchDeltaX;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field float touchDeltaX>
	//    2    4:f2i             
	//    3    5:istore          5
		int i = (int)touchDeltaY;
	//    4    7:aload_0         
	//    5    8:getfield        #31  <Field float touchDeltaY>
	//    6   11:f2i             
	//    7   12:istore          4
		float f = width >> 1;
	//    8   14:aload_0         
	//    9   15:getfield        #63  <Field int width>
	//   10   18:iconst_1        
	//   11   19:ishr            
	//   12   20:i2f             
	//   13   21:fstore_2        
		float f1 = height >> 1;
	//   14   22:aload_0         
	//   15   23:getfield        #66  <Field int height>
	//   16   26:iconst_1        
	//   17   27:ishr            
	//   18   28:i2f             
	//   19   29:fstore_3        
		if(isUseAnchor)
	//*  20   30:aload_0         
	//*  21   31:getfield        #70  <Field boolean isUseAnchor>
	//*  22   34:ifeq            49
		{
			f = anchorX;
	//   23   37:aload_0         
	//   24   38:getfield        #73  <Field int anchorX>
	//   25   41:i2f             
	//   26   42:fstore_2        
			f1 = anchorY;
	//   27   43:aload_0         
	//   28   44:getfield        #76  <Field int anchorY>
	//   29   47:i2f             
	//   30   48:fstore_3        
		}
		j = (int)(f - (float)j);
	//   31   49:fload_2         
	//   32   50:iload           5
	//   33   52:i2f             
	//   34   53:fsub            
	//   35   54:f2i             
	//   36   55:istore          5
		i = (int)(f1 - (float)i);
	//   37   57:fload_3         
	//   38   58:iload           4
	//   39   60:i2f             
	//   40   61:fsub            
	//   41   62:f2i             
	//   42   63:istore          4
		IPoint ipoint = IPoint.obtain();
	//   43   65:invokestatic    #81  <Method IPoint IPoint.obtain()>
	//   44   68:astore          6
		win2geo(glmapstate, j, i, ipoint);
	//   45   70:aload_0         
	//   46   71:aload_1         
	//   47   72:iload           5
	//   48   74:iload           4
	//   49   76:aload           6
	//   50   78:invokevirtual   #85  <Method void win2geo(GLMapState, int, int, IPoint)>
		glmapstate.setMapGeoCenter(ipoint.x, ipoint.y);
	//   51   81:aload_1         
	//   52   82:aload           6
	//   53   84:getfield        #88  <Field int IPoint.x>
	//   54   87:aload           6
	//   55   89:getfield        #91  <Field int IPoint.y>
	//   56   92:invokevirtual   #97  <Method void GLMapState.setMapGeoCenter(int, int)>
		glmapstate.recalculate();
	//   57   95:aload_1         
	//   58   96:invokevirtual   #100 <Method void GLMapState.recalculate()>
		ipoint.recycle();
	//   59   99:aload           6
	//   60  101:invokevirtual   #102 <Method void IPoint.recycle()>
	//   61  104:return          
	}

	private static final com.autonavi.ae.gmap.maploader.Pools.SynchronizedPool M_POOL = new com.autonavi.ae.gmap.maploader.Pools.SynchronizedPool(1024);
	static int newCount = 0;
	public float touchDeltaX;
	public float touchDeltaY;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:putstatic       #16  <Field int newCount>
	//    2    4:new             #18  <Class com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool>
	//    3    7:dup             
	//    4    8:sipush          1024
	//    5   11:invokespecial   #22  <Method void com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool(int)>
	//    6   14:putstatic       #24  <Field com.autonavi.ae.gmap.maploader.Pools$SynchronizedPool M_POOL>
	//*   7   17:return          
	}
}
