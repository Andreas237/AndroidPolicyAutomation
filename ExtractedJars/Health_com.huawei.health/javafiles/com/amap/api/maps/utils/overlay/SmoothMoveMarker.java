// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.utils.overlay;

import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.*;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapProjection;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class SmoothMoveMarker
{
	public static interface MoveListener
	{

		public abstract void move(double d);
	}

	static final class a extends Enum
	{

		public static a valueOf(String s)
		{
			return (a)Enum.valueOf(com/amap/api/maps/utils/overlay/SmoothMoveMarker$a, s);
		//    0    0:ldc1            #2   <Class SmoothMoveMarker$a>
		//    1    2:aload_0         
		//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class SmoothMoveMarker$a>
		//    4    9:areturn         
		}

		public static a[] values()
		{
			return (a[])((a []) (f)).clone();
		//    0    0:getstatic       #43  <Field SmoothMoveMarker$a[] f>
		//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.amap.api.maps.utils.overlay.SmoothMoveMarker$a_3B_.clone()>
		//    2    6:checkcast       #54  <Class SmoothMoveMarker$a[]>
		//    3    9:areturn         
		}

		public static final a a;
		public static final a b;
		public static final a c;
		public static final a d;
		public static final a e;
		private static final a f[];

		static 
		{
			a = new a("ACTION_UNKNOWN", 0);
		//    0    0:new             #2   <Class SmoothMoveMarker$a>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "ACTION_UNKNOWN">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void SmoothMoveMarker$a(String, int)>
		//    5   10:putstatic       #25  <Field SmoothMoveMarker$a a>
			b = new a("ACTION_START", 1);
		//    6   13:new             #2   <Class SmoothMoveMarker$a>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "ACTION_START">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void SmoothMoveMarker$a(String, int)>
		//   11   23:putstatic       #29  <Field SmoothMoveMarker$a b>
			c = new a("ACTION_RUNNING", 2);
		//   12   26:new             #2   <Class SmoothMoveMarker$a>
		//   13   29:dup             
		//   14   30:ldc1            #31  <String "ACTION_RUNNING">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void SmoothMoveMarker$a(String, int)>
		//   17   36:putstatic       #33  <Field SmoothMoveMarker$a c>
			d = new a("ACTION_PAUSE", 3);
		//   18   39:new             #2   <Class SmoothMoveMarker$a>
		//   19   42:dup             
		//   20   43:ldc1            #35  <String "ACTION_PAUSE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void SmoothMoveMarker$a(String, int)>
		//   23   49:putstatic       #37  <Field SmoothMoveMarker$a d>
			e = new a("ACTION_STOP", 4);
		//   24   52:new             #2   <Class SmoothMoveMarker$a>
		//   25   55:dup             
		//   26   56:ldc1            #39  <String "ACTION_STOP">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void SmoothMoveMarker$a(String, int)>
		//   29   62:putstatic       #41  <Field SmoothMoveMarker$a e>
			f = (new a[] {
				a, b, c, d, e
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       a[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field SmoothMoveMarker$a a>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #29  <Field SmoothMoveMarker$a b>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #33  <Field SmoothMoveMarker$a c>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #37  <Field SmoothMoveMarker$a d>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #41  <Field SmoothMoveMarker$a e>
		//   51   98:aastore         
		//   52   99:putstatic       #43  <Field SmoothMoveMarker$a[] f>
		//*  53  102:return          
		}

		private a(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #45  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	static class b
		implements ThreadFactory
	{

		public Thread newThread(Runnable runnable)
		{
			return new Thread(runnable, "MoveSmoothThread");
		//    0    0:new             #20  <Class Thread>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:ldc1            #22  <String "MoveSmoothThread">
		//    4    7:invokespecial   #25  <Method void Thread(Runnable, String)>
		//    5   10:areturn         
		}

		private b()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	class c
		implements Runnable
	{

		public void run()
		{
			a.mAnimationBeginTime = System.currentTimeMillis();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field SmoothMoveMarker a>
		//    2    4:invokestatic    #31  <Method long System.currentTimeMillis()>
		//    3    7:invokestatic    #35  <Method long SmoothMoveMarker.access$202(SmoothMoveMarker, long)>
		//    4   10:pop2            
			a.moveStatus = a.b;
		//    5   11:aload_0         
		//    6   12:getfield        #15  <Field SmoothMoveMarker a>
		//    7   15:getstatic       #41  <Field SmoothMoveMarker$a SmoothMoveMarker$a.b>
		//    8   18:invokestatic    #45  <Method SmoothMoveMarker$a SmoothMoveMarker.access$302(SmoothMoveMarker, SmoothMoveMarker$a)>
		//    9   21:pop             
			a.exitFlag.set(false);
		//   10   22:aload_0         
		//   11   23:getfield        #15  <Field SmoothMoveMarker a>
		//   12   26:getfield        #49  <Field AtomicBoolean SmoothMoveMarker.exitFlag>
		//   13   29:iconst_0        
		//   14   30:invokevirtual   #55  <Method void AtomicBoolean.set(boolean)>
_L4:
			if(a.exitFlag.get() || a.index > a.points.size() - 1) goto _L2; else goto _L1
		//   15   33:aload_0         
		//   16   34:getfield        #15  <Field SmoothMoveMarker a>
		//   17   37:getfield        #49  <Field AtomicBoolean SmoothMoveMarker.exitFlag>
		//   18   40:invokevirtual   #59  <Method boolean AtomicBoolean.get()>
		//   19   43:ifne            188
		//   20   46:aload_0         
		//   21   47:getfield        #15  <Field SmoothMoveMarker a>
		//   22   50:invokestatic    #63  <Method int SmoothMoveMarker.access$400(SmoothMoveMarker)>
		//   23   53:aload_0         
		//   24   54:getfield        #15  <Field SmoothMoveMarker a>
		//   25   57:invokestatic    #67  <Method LinkedList SmoothMoveMarker.access$500(SmoothMoveMarker)>
		//   26   60:invokevirtual   #73  <Method int LinkedList.size()>
		//   27   63:iconst_1        
		//   28   64:isub            
		//   29   65:icmpgt          188
_L1:
			Object obj = a.mLock;
		//   30   68:aload_0         
		//   31   69:getfield        #15  <Field SmoothMoveMarker a>
		//   32   72:invokestatic    #77  <Method Object SmoothMoveMarker.access$600(SmoothMoveMarker)>
		//   33   75:astore          6
			obj;
		//   34   77:aload           6
			JVM INSTR monitorenter ;
		//   35   79:monitorenter    
			boolean flag = a.exitFlag.get();
		//   36   80:aload_0         
		//   37   81:getfield        #15  <Field SmoothMoveMarker a>
		//   38   84:getfield        #49  <Field AtomicBoolean SmoothMoveMarker.exitFlag>
		//   39   87:invokevirtual   #59  <Method boolean AtomicBoolean.get()>
		//   40   90:istore_1        
			if(!flag)
				break MISSING_BLOCK_LABEL_99;
		//   41   91:iload_1         
		//   42   92:ifeq            99
			obj;
		//   43   95:aload           6
			JVM INSTR monitorexit ;
		//   44   97:monitorexit     
			return;
		//   45   98:return          
			if(a.moveStatus != a.d)
		//*  46   99:aload_0         
		//*  47  100:getfield        #15  <Field SmoothMoveMarker a>
		//*  48  103:invokestatic    #81  <Method SmoothMoveMarker$a SmoothMoveMarker.access$300(SmoothMoveMarker)>
		//*  49  106:getstatic       #84  <Field SmoothMoveMarker$a SmoothMoveMarker$a.d>
		//*  50  109:if_acmpeq       161
			{
				long l = System.currentTimeMillis();
		//   51  112:invokestatic    #31  <Method long System.currentTimeMillis()>
		//   52  115:lstore_2        
				long l1 = a.mAnimationBeginTime;
		//   53  116:aload_0         
		//   54  117:getfield        #15  <Field SmoothMoveMarker a>
		//   55  120:invokestatic    #88  <Method long SmoothMoveMarker.access$200(SmoothMoveMarker)>
		//   56  123:lstore          4
				IPoint ipoint = a.getCurPosition(l - l1);
		//   57  125:aload_0         
		//   58  126:getfield        #15  <Field SmoothMoveMarker a>
		//   59  129:lload_2         
		//   60  130:lload           4
		//   61  132:lsub            
		//   62  133:invokestatic    #92  <Method IPoint SmoothMoveMarker.access$700(SmoothMoveMarker, long)>
		//   63  136:astore          7
				a.marker.setGeoPoint(ipoint);
		//   64  138:aload_0         
		//   65  139:getfield        #15  <Field SmoothMoveMarker a>
		//   66  142:invokestatic    #96  <Method Marker SmoothMoveMarker.access$800(SmoothMoveMarker)>
		//   67  145:aload           7
		//   68  147:invokevirtual   #102 <Method void Marker.setGeoPoint(IPoint)>
				a.moveStatus = a.c;
		//   69  150:aload_0         
		//   70  151:getfield        #15  <Field SmoothMoveMarker a>
		//   71  154:getstatic       #104 <Field SmoothMoveMarker$a SmoothMoveMarker$a.c>
		//   72  157:invokestatic    #45  <Method SmoothMoveMarker$a SmoothMoveMarker.access$302(SmoothMoveMarker, SmoothMoveMarker$a)>
		//   73  160:pop             
			}
			obj;
		//   74  161:aload           6
			JVM INSTR monitorexit ;
		//   75  163:monitorexit     
			  goto _L3
		//*  76  164:goto            175
			Exception exception;
			exception;
		//   77  167:astore          7
		//*  78  169:aload           6
			throw exception;
		//   79  171:monitorexit     
		//   80  172:aload           7
		//   81  174:athrow          
_L3:
			Thread.sleep(a.mStepDuration);
		//   82  175:aload_0         
		//   83  176:getfield        #15  <Field SmoothMoveMarker a>
		//   84  179:invokestatic    #107 <Method long SmoothMoveMarker.access$900(SmoothMoveMarker)>
		//   85  182:invokestatic    #113 <Method void Thread.sleep(long)>
			  goto _L4
		//*  86  185:goto            33
_L2:
			try
			{
				a.moveStatus = a.e;
		//   87  188:aload_0         
		//   88  189:getfield        #15  <Field SmoothMoveMarker a>
		//   89  192:getstatic       #116 <Field SmoothMoveMarker$a SmoothMoveMarker$a.e>
		//   90  195:invokestatic    #45  <Method SmoothMoveMarker$a SmoothMoveMarker.access$302(SmoothMoveMarker, SmoothMoveMarker$a)>
		//   91  198:pop             
				return;
		//   92  199:return          
			}
			catch(Throwable throwable)
		//*  93  200:astore          6
			{
				throwable.printStackTrace();
		//   94  202:aload           6
		//   95  204:invokevirtual   #119 <Method void Throwable.printStackTrace()>
			}
			return;
		//   96  207:return          
		}

		final SmoothMoveMarker a;

		private c()
		{
			a = SmoothMoveMarker.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field SmoothMoveMarker a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}


	public SmoothMoveMarker(AMap amap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void Object()>
		duration = 10000L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #60  <Long 10000L>
	//    4    8:putfield        #63  <Field long duration>
		mStepDuration = 20L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #64  <Long 20L>
	//    7   15:putfield        #67  <Field long mStepDuration>
		points = new LinkedList();
	//    8   18:aload_0         
	//    9   19:new             #69  <Class LinkedList>
	//   10   22:dup             
	//   11   23:invokespecial   #70  <Method void LinkedList()>
	//   12   26:putfield        #72  <Field LinkedList points>
		eachDistance = new LinkedList();
	//   13   29:aload_0         
	//   14   30:new             #69  <Class LinkedList>
	//   15   33:dup             
	//   16   34:invokespecial   #70  <Method void LinkedList()>
	//   17   37:putfield        #74  <Field LinkedList eachDistance>
		totalDistance = 0.0D;
	//   18   40:aload_0         
	//   19   41:dconst_0        
	//   20   42:putfield        #76  <Field double totalDistance>
		remainDistance = 0.0D;
	//   21   45:aload_0         
	//   22   46:dconst_0        
	//   23   47:putfield        #78  <Field double remainDistance>
		mLock = new Object();
	//   24   50:aload_0         
	//   25   51:new             #4   <Class Object>
	//   26   54:dup             
	//   27   55:invokespecial   #59  <Method void Object()>
	//   28   58:putfield        #80  <Field Object mLock>
		marker = null;
	//   29   61:aload_0         
	//   30   62:aconst_null     
	//   31   63:putfield        #82  <Field Marker marker>
		index = 0;
	//   32   66:aload_0         
	//   33   67:iconst_0        
	//   34   68:putfield        #84  <Field int index>
		useDefaultDescriptor = false;
	//   35   71:aload_0         
	//   36   72:iconst_0        
	//   37   73:putfield        #86  <Field boolean useDefaultDescriptor>
		exitFlag = new AtomicBoolean(false);
	//   38   76:aload_0         
	//   39   77:new             #88  <Class AtomicBoolean>
	//   40   80:dup             
	//   41   81:iconst_0        
	//   42   82:invokespecial   #91  <Method void AtomicBoolean(boolean)>
	//   43   85:putfield        #93  <Field AtomicBoolean exitFlag>
		moveStatus = a.a;
	//   44   88:aload_0         
	//   45   89:getstatic       #95  <Field SmoothMoveMarker$a SmoothMoveMarker$a.a>
	//   46   92:putfield        #97  <Field SmoothMoveMarker$a moveStatus>
		mAnimationBeginTime = System.currentTimeMillis();
	//   47   95:aload_0         
	//   48   96:invokestatic    #103 <Method long System.currentTimeMillis()>
	//   49   99:putfield        #105 <Field long mAnimationBeginTime>
		mAMap = amap;
	//   50  102:aload_0         
	//   51  103:aload_1         
	//   52  104:putfield        #107 <Field AMap mAMap>
		mThreadPools = ((ExecutorService) (new ThreadPoolExecutor(1, 2, 5L, TimeUnit.SECONDS, ((java.util.concurrent.BlockingQueue) (new SynchronousQueue())), ((ThreadFactory) (new b())))));
	//   53  107:aload_0         
	//   54  108:new             #109 <Class ThreadPoolExecutor>
	//   55  111:dup             
	//   56  112:iconst_1        
	//   57  113:iconst_2        
	//   58  114:ldc2w           #110 <Long 5L>
	//   59  117:getstatic       #117 <Field TimeUnit TimeUnit.SECONDS>
	//   60  120:new             #119 <Class SynchronousQueue>
	//   61  123:dup             
	//   62  124:invokespecial   #120 <Method void SynchronousQueue()>
	//   63  127:new             #14  <Class SmoothMoveMarker$b>
	//   64  130:dup             
	//   65  131:aconst_null     
	//   66  132:invokespecial   #123 <Method void SmoothMoveMarker$b(SmoothMoveMarker$1)>
	//   67  135:invokespecial   #126 <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, ThreadFactory)>
	//   68  138:putfield        #128 <Field ExecutorService mThreadPools>
	//   69  141:return          
	}

	private void checkMarkerIcon()
	{
		if(useDefaultDescriptor)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field boolean useDefaultDescriptor>
	//*   2    4:ifeq            36
		{
			if(descriptor == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #155 <Field BitmapDescriptor descriptor>
	//*   5   11:ifnonnull       20
			{
				useDefaultDescriptor = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #86  <Field boolean useDefaultDescriptor>
				return;
	//    9   19:return          
			}
			marker.setIcon(descriptor);
	//   10   20:aload_0         
	//   11   21:getfield        #82  <Field Marker marker>
	//   12   24:aload_0         
	//   13   25:getfield        #155 <Field BitmapDescriptor descriptor>
	//   14   28:invokevirtual   #161 <Method void Marker.setIcon(BitmapDescriptor)>
			useDefaultDescriptor = false;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #86  <Field boolean useDefaultDescriptor>
		}
	//   18   36:return          
	}

	private IPoint getCurPosition(long l)
	{
		if(l > duration)
	//*   0    0:lload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #63  <Field long duration>
	//*   3    5:lcmp            
	//*   4    6:ifle            120
		{
			exitFlag.set(true);
	//    5    9:aload_0         
	//    6   10:getfield        #93  <Field AtomicBoolean exitFlag>
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #164 <Method void AtomicBoolean.set(boolean)>
			IPoint ipoint = new IPoint();
	//    9   17:new             #166 <Class IPoint>
	//   10   20:dup             
	//   11   21:invokespecial   #167 <Method void IPoint()>
	//   12   24:astore          14
			index = points.size() - 1;
	//   13   26:aload_0         
	//   14   27:aload_0         
	//   15   28:getfield        #72  <Field LinkedList points>
	//   16   31:invokevirtual   #171 <Method int LinkedList.size()>
	//   17   34:iconst_1        
	//   18   35:isub            
	//   19   36:putfield        #84  <Field int index>
			LatLng latlng = (LatLng)points.get(index);
	//   20   39:aload_0         
	//   21   40:getfield        #72  <Field LinkedList points>
	//   22   43:aload_0         
	//   23   44:getfield        #84  <Field int index>
	//   24   47:invokevirtual   #175 <Method Object LinkedList.get(int)>
	//   25   50:checkcast       #177 <Class LatLng>
	//   26   53:astore          15
			index = index - 1;
	//   27   55:aload_0         
	//   28   56:aload_0         
	//   29   57:getfield        #84  <Field int index>
	//   30   60:iconst_1        
	//   31   61:isub            
	//   32   62:putfield        #84  <Field int index>
			index = Math.max(index, 0);
	//   33   65:aload_0         
	//   34   66:aload_0         
	//   35   67:getfield        #84  <Field int index>
	//   36   70:iconst_0        
	//   37   71:invokestatic    #183 <Method int Math.max(int, int)>
	//   38   74:putfield        #84  <Field int index>
			remainDistance = 0.0D;
	//   39   77:aload_0         
	//   40   78:dconst_0        
	//   41   79:putfield        #78  <Field double remainDistance>
			MapProjection.lonlat2Geo(latlng.longitude, latlng.latitude, ipoint);
	//   42   82:aload           15
	//   43   84:getfield        #186 <Field double LatLng.longitude>
	//   44   87:aload           15
	//   45   89:getfield        #189 <Field double LatLng.latitude>
	//   46   92:aload           14
	//   47   94:invokestatic    #195 <Method void MapProjection.lonlat2Geo(double, double, IPoint)>
			if(moveListener != null)
	//*  48   97:aload_0         
	//*  49   98:getfield        #197 <Field SmoothMoveMarker$MoveListener moveListener>
	//*  50  101:ifnull          117
				moveListener.move(remainDistance);
	//   51  104:aload_0         
	//   52  105:getfield        #197 <Field SmoothMoveMarker$MoveListener moveListener>
	//   53  108:aload_0         
	//   54  109:getfield        #78  <Field double remainDistance>
	//   55  112:invokeinterface #201 <Method void SmoothMoveMarker$MoveListener.move(double)>
			return ipoint;
	//   56  117:aload           14
	//   57  119:areturn         
		}
		double d1 = ((double)l * totalDistance) / (double)duration;
	//   58  120:lload_1         
	//   59  121:l2d             
	//   60  122:aload_0         
	//   61  123:getfield        #76  <Field double totalDistance>
	//   62  126:dmul            
	//   63  127:aload_0         
	//   64  128:getfield        #63  <Field long duration>
	//   65  131:l2d             
	//   66  132:ddiv            
	//   67  133:dstore          5
		remainDistance = totalDistance - d1;
	//   68  135:aload_0         
	//   69  136:aload_0         
	//   70  137:getfield        #76  <Field double totalDistance>
	//   71  140:dload           5
	//   72  142:dsub            
	//   73  143:putfield        #78  <Field double remainDistance>
		int k = 0;
	//   74  146:iconst_0        
	//   75  147:istore          12
		double d = 1.0D;
	//   76  149:dconst_1        
	//   77  150:dstore_3        
		int i = 0;
	//   78  151:iconst_0        
	//   79  152:istore          10
		double d2;
		int j;
		do
		{
			j = k;
	//   80  154:iload           12
	//   81  156:istore          11
			d2 = d;
	//   82  158:dload_3         
	//   83  159:dstore          7
			if(i >= eachDistance.size())
				break;
	//   84  161:iload           10
	//   85  163:aload_0         
	//   86  164:getfield        #74  <Field LinkedList eachDistance>
	//   87  167:invokevirtual   #171 <Method int LinkedList.size()>
	//   88  170:icmpge          240
			d2 = ((Double)eachDistance.get(i)).doubleValue();
	//   89  173:aload_0         
	//   90  174:getfield        #74  <Field LinkedList eachDistance>
	//   91  177:iload           10
	//   92  179:invokevirtual   #175 <Method Object LinkedList.get(int)>
	//   93  182:checkcast       #203 <Class Double>
	//   94  185:invokevirtual   #207 <Method double Double.doubleValue()>
	//   95  188:dstore          7
			if(d1 > d2)
	//*  96  190:dload           5
	//*  97  192:dload           7
	//*  98  194:dcmpl           
	//*  99  195:ifle            208
			{
				d1 -= d2;
	//  100  198:dload           5
	//  101  200:dload           7
	//  102  202:dsub            
	//  103  203:dstore          5
			} else
	//* 104  205:goto            231
			{
				if(d2 > 0.0D)
	//* 105  208:dload           7
	//* 106  210:dconst_0        
	//* 107  211:dcmpl           
	//* 108  212:ifle            221
					d = d1 / d2;
	//  109  215:dload           5
	//  110  217:dload           7
	//  111  219:ddiv            
	//  112  220:dstore_3        
				j = i;
	//  113  221:iload           10
	//  114  223:istore          11
				d2 = d;
	//  115  225:dload_3         
	//  116  226:dstore          7
				break;
	//  117  228:goto            240
			}
			i++;
	//  118  231:iload           10
	//  119  233:iconst_1        
	//  120  234:iadd            
	//  121  235:istore          10
		} while(true);
	//  122  237:goto            154
		if(j != index && moveListener != null)
	//* 123  240:iload           11
	//* 124  242:aload_0         
	//* 125  243:getfield        #84  <Field int index>
	//* 126  246:icmpeq          269
	//* 127  249:aload_0         
	//* 128  250:getfield        #197 <Field SmoothMoveMarker$MoveListener moveListener>
	//* 129  253:ifnull          269
			moveListener.move(remainDistance);
	//  130  256:aload_0         
	//  131  257:getfield        #197 <Field SmoothMoveMarker$MoveListener moveListener>
	//  132  260:aload_0         
	//  133  261:getfield        #78  <Field double remainDistance>
	//  134  264:invokeinterface #201 <Method void SmoothMoveMarker$MoveListener.move(double)>
		index = j;
	//  135  269:aload_0         
	//  136  270:iload           11
	//  137  272:putfield        #84  <Field int index>
		LatLng latlng1 = (LatLng)points.get(j);
	//  138  275:aload_0         
	//  139  276:getfield        #72  <Field LinkedList points>
	//  140  279:iload           11
	//  141  281:invokevirtual   #175 <Method Object LinkedList.get(int)>
	//  142  284:checkcast       #177 <Class LatLng>
	//  143  287:astore          15
		LatLng latlng2 = (LatLng)points.get(j + 1);
	//  144  289:aload_0         
	//  145  290:getfield        #72  <Field LinkedList points>
	//  146  293:iload           11
	//  147  295:iconst_1        
	//  148  296:iadd            
	//  149  297:invokevirtual   #175 <Method Object LinkedList.get(int)>
	//  150  300:checkcast       #177 <Class LatLng>
	//  151  303:astore          16
		IPoint ipoint1 = new IPoint();
	//  152  305:new             #166 <Class IPoint>
	//  153  308:dup             
	//  154  309:invokespecial   #167 <Method void IPoint()>
	//  155  312:astore          14
		MapProjection.lonlat2Geo(latlng1.longitude, latlng1.latitude, ipoint1);
	//  156  314:aload           15
	//  157  316:getfield        #186 <Field double LatLng.longitude>
	//  158  319:aload           15
	//  159  321:getfield        #189 <Field double LatLng.latitude>
	//  160  324:aload           14
	//  161  326:invokestatic    #195 <Method void MapProjection.lonlat2Geo(double, double, IPoint)>
		IPoint ipoint2 = new IPoint();
	//  162  329:new             #166 <Class IPoint>
	//  163  332:dup             
	//  164  333:invokespecial   #167 <Method void IPoint()>
	//  165  336:astore          17
		MapProjection.lonlat2Geo(latlng2.longitude, latlng2.latitude, ipoint2);
	//  166  338:aload           16
	//  167  340:getfield        #186 <Field double LatLng.longitude>
	//  168  343:aload           16
	//  169  345:getfield        #189 <Field double LatLng.latitude>
	//  170  348:aload           17
	//  171  350:invokestatic    #195 <Method void MapProjection.lonlat2Geo(double, double, IPoint)>
		i = ipoint2.x;
	//  172  353:aload           17
	//  173  355:getfield        #210 <Field int IPoint.x>
	//  174  358:istore          10
		j = ipoint1.x;
	//  175  360:aload           14
	//  176  362:getfield        #210 <Field int IPoint.x>
	//  177  365:istore          11
		k = ipoint2.y;
	//  178  367:aload           17
	//  179  369:getfield        #213 <Field int IPoint.y>
	//  180  372:istore          12
		int i1 = ipoint1.y;
	//  181  374:aload           14
	//  182  376:getfield        #213 <Field int IPoint.y>
	//  183  379:istore          13
		if(AMapUtils.calculateLineDistance(latlng1, latlng2) > 5F)
	//* 184  381:aload           15
	//* 185  383:aload           16
	//* 186  385:invokestatic    #219 <Method float AMapUtils.calculateLineDistance(LatLng, LatLng)>
	//* 187  388:ldc1            #21  <Float 5F>
	//* 188  390:fcmpl           
	//* 189  391:ifle            443
		{
			float f = getRotate(ipoint1, ipoint2);
	//  190  394:aload_0         
	//  191  395:aload           14
	//  192  397:aload           17
	//  193  399:invokespecial   #223 <Method float getRotate(IPoint, IPoint)>
	//  194  402:fstore          9
			if(mAMap != null)
	//* 195  404:aload_0         
	//* 196  405:getfield        #107 <Field AMap mAMap>
	//* 197  408:ifnull          443
			{
				CameraPosition cameraposition = mAMap.getCameraPosition();
	//  198  411:aload_0         
	//  199  412:getfield        #107 <Field AMap mAMap>
	//  200  415:invokevirtual   #229 <Method CameraPosition AMap.getCameraPosition()>
	//  201  418:astore          15
				if(cameraposition != null)
	//* 202  420:aload           15
	//* 203  422:ifnull          443
					marker.setRotateAngle((360F - f) + cameraposition.bearing);
	//  204  425:aload_0         
	//  205  426:getfield        #82  <Field Marker marker>
	//  206  429:ldc1            #230 <Float 360F>
	//  207  431:fload           9
	//  208  433:fsub            
	//  209  434:aload           15
	//  210  436:getfield        #235 <Field float CameraPosition.bearing>
	//  211  439:fadd            
	//  212  440:invokevirtual   #239 <Method void Marker.setRotateAngle(float)>
			}
		}
		return new IPoint((int)((double)ipoint1.x + (double)(i - j) * d2), (int)((double)ipoint1.y + (double)(k - i1) * d2));
	//  213  443:new             #166 <Class IPoint>
	//  214  446:dup             
	//  215  447:aload           14
	//  216  449:getfield        #210 <Field int IPoint.x>
	//  217  452:i2d             
	//  218  453:iload           10
	//  219  455:iload           11
	//  220  457:isub            
	//  221  458:i2d             
	//  222  459:dload           7
	//  223  461:dmul            
	//  224  462:dadd            
	//  225  463:d2i             
	//  226  464:aload           14
	//  227  466:getfield        #213 <Field int IPoint.y>
	//  228  469:i2d             
	//  229  470:iload           12
	//  230  472:iload           13
	//  231  474:isub            
	//  232  475:i2d             
	//  233  476:dload           7
	//  234  478:dmul            
	//  235  479:dadd            
	//  236  480:d2i             
	//  237  481:invokespecial   #242 <Method void IPoint(int, int)>
	//  238  484:areturn         
	}

	private float getRotate(IPoint ipoint, IPoint ipoint1)
	{
		if(ipoint == null || ipoint1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          8
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       10
		{
			return 0.0F;
	//    4    8:fconst_0        
	//    5    9:freturn         
		} else
		{
			double d = ipoint1.y;
	//    6   10:aload_2         
	//    7   11:getfield        #213 <Field int IPoint.y>
	//    8   14:i2d             
	//    9   15:dstore_3        
			double d1 = ipoint.y;
	//   10   16:aload_1         
	//   11   17:getfield        #213 <Field int IPoint.y>
	//   12   20:i2d             
	//   13   21:dstore          5
			double d2 = ipoint.x;
	//   14   23:aload_1         
	//   15   24:getfield        #210 <Field int IPoint.x>
	//   16   27:i2d             
	//   17   28:dstore          7
			return (float)((Math.atan2((double)ipoint1.x - d2, d1 - d) / 3.1415926535897931D) * 180D);
	//   18   30:aload_2         
	//   19   31:getfield        #210 <Field int IPoint.x>
	//   20   34:i2d             
	//   21   35:dload           7
	//   22   37:dsub            
	//   23   38:dload           5
	//   24   40:dload_3         
	//   25   41:dsub            
	//   26   42:invokestatic    #246 <Method double Math.atan2(double, double)>
	//   27   45:ldc2w           #247 <Double 3.1415926535897931D>
	//   28   48:ddiv            
	//   29   49:ldc2w           #249 <Double 180D>
	//   30   52:dmul            
	//   31   53:d2f             
	//   32   54:freturn         
		}
	}

	private void reset()
	{
		try
		{
			if(moveStatus == a.c || moveStatus == a.d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field SmoothMoveMarker$a moveStatus>
	//*   2    4:getstatic       #255 <Field SmoothMoveMarker$a SmoothMoveMarker$a.c>
	//*   3    7:if_acmpeq       20
	//*   4   10:aload_0         
	//*   5   11:getfield        #97  <Field SmoothMoveMarker$a moveStatus>
	//*   6   14:getstatic       #258 <Field SmoothMoveMarker$a SmoothMoveMarker$a.d>
	//*   7   17:if_acmpne       71
			{
				exitFlag.set(true);
	//    8   20:aload_0         
	//    9   21:getfield        #93  <Field AtomicBoolean exitFlag>
	//   10   24:iconst_1        
	//   11   25:invokevirtual   #164 <Method void AtomicBoolean.set(boolean)>
				mThreadPools.awaitTermination(mStepDuration + 20L, TimeUnit.MILLISECONDS);
	//   12   28:aload_0         
	//   13   29:getfield        #128 <Field ExecutorService mThreadPools>
	//   14   32:aload_0         
	//   15   33:getfield        #67  <Field long mStepDuration>
	//   16   36:ldc2w           #64  <Long 20L>
	//   17   39:ladd            
	//   18   40:getstatic       #261 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   19   43:invokeinterface #267 <Method boolean ExecutorService.awaitTermination(long, TimeUnit)>
	//   20   48:pop             
				if(marker != null)
	//*  21   49:aload_0         
	//*  22   50:getfield        #82  <Field Marker marker>
	//*  23   53:ifnull          64
					marker.setAnimation(((com.amap.api.maps.model.animation.Animation) (null)));
	//   24   56:aload_0         
	//   25   57:getfield        #82  <Field Marker marker>
	//   26   60:aconst_null     
	//   27   61:invokevirtual   #271 <Method void Marker.setAnimation(com.amap.api.maps.model.animation.Animation)>
				moveStatus = a.a;
	//   28   64:aload_0         
	//   29   65:getstatic       #95  <Field SmoothMoveMarker$a SmoothMoveMarker$a.a>
	//   30   68:putfield        #97  <Field SmoothMoveMarker$a moveStatus>
			}
			return;
	//   31   71:return          
		}
		catch(InterruptedException interruptedexception)
	//*  32   72:astore_1        
		{
			interruptedexception.printStackTrace();
	//   33   73:aload_1         
	//   34   74:invokevirtual   #274 <Method void InterruptedException.printStackTrace()>
		}
	//   35   77:return          
	}

	public void destroy()
	{
		reset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #279 <Method void reset()>
		mThreadPools.shutdownNow();
	//    2    4:aload_0         
	//    3    5:getfield        #128 <Field ExecutorService mThreadPools>
	//    4    8:invokeinterface #283 <Method List ExecutorService.shutdownNow()>
	//    5   13:pop             
		if(descriptor != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #155 <Field BitmapDescriptor descriptor>
	//*   8   18:ifnull          28
			descriptor.recycle();
	//    9   21:aload_0         
	//   10   22:getfield        #155 <Field BitmapDescriptor descriptor>
	//   11   25:invokevirtual   #288 <Method void BitmapDescriptor.recycle()>
		if(marker != null)
	//*  12   28:aload_0         
	//*  13   29:getfield        #82  <Field Marker marker>
	//*  14   32:ifnull          47
		{
			marker.destroy();
	//   15   35:aload_0         
	//   16   36:getfield        #82  <Field Marker marker>
	//   17   39:invokevirtual   #290 <Method void Marker.destroy()>
			marker = null;
	//   18   42:aload_0         
	//   19   43:aconst_null     
	//   20   44:putfield        #82  <Field Marker marker>
		}
		Object obj = mLock;
	//   21   47:aload_0         
	//   22   48:getfield        #80  <Field Object mLock>
	//   23   51:astore_1        
		obj;
	//   24   52:aload_1         
		JVM INSTR monitorenter ;
	//   25   53:monitorenter    
		points.clear();
	//   26   54:aload_0         
	//   27   55:getfield        #72  <Field LinkedList points>
	//   28   58:invokevirtual   #293 <Method void LinkedList.clear()>
		eachDistance.clear();
	//   29   61:aload_0         
	//   30   62:getfield        #74  <Field LinkedList eachDistance>
	//   31   65:invokevirtual   #293 <Method void LinkedList.clear()>
		obj;
	//   32   68:aload_1         
		JVM INSTR monitorexit ;
	//   33   69:monitorexit     
		  goto _L1
	//*  34   70:goto            78
		Exception exception;
		exception;
	//   35   73:astore_2        
	//*  36   74:aload_1         
		throw exception;
	//   37   75:monitorexit     
	//   38   76:aload_2         
	//   39   77:athrow          
_L1:
		return;
	//   40   78:return          
		Throwable throwable;
		throwable;
	//   41   79:astore_1        
		throwable.printStackTrace();
	//   42   80:aload_1         
	//   43   81:invokevirtual   #294 <Method void Throwable.printStackTrace()>
		return;
	//   44   84:return          
	}

	public int getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int index>
	//    2    4:ireturn         
	}

	public Marker getMarker()
	{
		return marker;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Marker marker>
	//    2    4:areturn         
	}

	public LatLng getPosition()
	{
		if(marker == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field Marker marker>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return marker.getPosition();
	//    5    9:aload_0         
	//    6   10:getfield        #82  <Field Marker marker>
	//    7   13:invokevirtual   #301 <Method LatLng Marker.getPosition()>
	//    8   16:areturn         
	}

	public void removeMarker()
	{
		if(marker != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field Marker marker>
	//*   2    4:ifnull          19
		{
			marker.remove();
	//    3    7:aload_0         
	//    4    8:getfield        #82  <Field Marker marker>
	//    5   11:invokevirtual   #305 <Method void Marker.remove()>
			marker = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #82  <Field Marker marker>
		}
		points.clear();
	//    9   19:aload_0         
	//   10   20:getfield        #72  <Field LinkedList points>
	//   11   23:invokevirtual   #293 <Method void LinkedList.clear()>
		eachDistance.clear();
	//   12   26:aload_0         
	//   13   27:getfield        #74  <Field LinkedList eachDistance>
	//   14   30:invokevirtual   #293 <Method void LinkedList.clear()>
	//   15   33:return          
	}

	public void resetIndex()
	{
		index = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #84  <Field int index>
	//    3    5:return          
	}

	public void setDescriptor(BitmapDescriptor bitmapdescriptor)
	{
		if(descriptor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #155 <Field BitmapDescriptor descriptor>
	//*   2    4:ifnull          14
			descriptor.recycle();
	//    3    7:aload_0         
	//    4    8:getfield        #155 <Field BitmapDescriptor descriptor>
	//    5   11:invokevirtual   #288 <Method void BitmapDescriptor.recycle()>
		descriptor = bitmapdescriptor;
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:putfield        #155 <Field BitmapDescriptor descriptor>
		if(marker != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #82  <Field Marker marker>
	//*  11   23:ifnull          34
			marker.setIcon(bitmapdescriptor);
	//   12   26:aload_0         
	//   13   27:getfield        #82  <Field Marker marker>
	//   14   30:aload_1         
	//   15   31:invokevirtual   #161 <Method void Marker.setIcon(BitmapDescriptor)>
	//   16   34:return          
	}

	public void setMoveListener(MoveListener movelistener)
	{
		moveListener = movelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #197 <Field SmoothMoveMarker$MoveListener moveListener>
	//    3    5:return          
	}

	public void setPoints(List list)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Object mLock>
	//    2    4:astore          5
		obj;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(list == null)
			break MISSING_BLOCK_LABEL_27;
	//    5    9:aload_1         
	//    6   10:ifnull          27
		int i = list.size();
	//    7   13:aload_1         
	//    8   14:invokeinterface #314 <Method int List.size()>
	//    9   19:istore          4
		if(i >= 2)
			break MISSING_BLOCK_LABEL_31;
	//   10   21:iload           4
	//   11   23:iconst_2        
	//   12   24:icmpge          31
		obj;
	//   13   27:aload           5
		JVM INSTR monitorexit ;
	//   14   29:monitorexit     
		return;
	//   15   30:return          
		stopMove();
	//   16   31:aload_0         
	//   17   32:invokevirtual   #317 <Method void stopMove()>
		points.clear();
	//   18   35:aload_0         
	//   19   36:getfield        #72  <Field LinkedList points>
	//   20   39:invokevirtual   #293 <Method void LinkedList.clear()>
		list = ((List) (list.iterator()));
	//   21   42:aload_1         
	//   22   43:invokeinterface #321 <Method Iterator List.iterator()>
	//   23   48:astore_1        
_L1:
		LatLng latlng;
		do
		{
			if(!((Iterator) (list)).hasNext())
				break MISSING_BLOCK_LABEL_87;
	//   24   49:aload_1         
	//   25   50:invokeinterface #327 <Method boolean Iterator.hasNext()>
	//   26   55:ifeq            87
			latlng = (LatLng)((Iterator) (list)).next();
	//   27   58:aload_1         
	//   28   59:invokeinterface #331 <Method Object Iterator.next()>
	//   29   64:checkcast       #177 <Class LatLng>
	//   30   67:astore          6
		} while(latlng == null);
	//   31   69:aload           6
	//   32   71:ifnull          302
		points.add(((Object) (latlng)));
	//   33   74:aload_0         
	//   34   75:getfield        #72  <Field LinkedList points>
	//   35   78:aload           6
	//   36   80:invokevirtual   #335 <Method boolean LinkedList.add(Object)>
	//   37   83:pop             
		  goto _L1
	//*  38   84:goto            302
		eachDistance.clear();
	//   39   87:aload_0         
	//   40   88:getfield        #74  <Field LinkedList eachDistance>
	//   41   91:invokevirtual   #293 <Method void LinkedList.clear()>
		totalDistance = 0.0D;
	//   42   94:aload_0         
	//   43   95:dconst_0        
	//   44   96:putfield        #76  <Field double totalDistance>
		i = 0;
	//   45   99:iconst_0        
	//   46  100:istore          4
_L3:
		if(i >= points.size() - 1)
			break; /* Loop/switch isn't completed */
	//   47  102:iload           4
	//   48  104:aload_0         
	//   49  105:getfield        #72  <Field LinkedList points>
	//   50  108:invokevirtual   #171 <Method int LinkedList.size()>
	//   51  111:iconst_1        
	//   52  112:isub            
	//   53  113:icmpge          178
		double d = AMapUtils.calculateLineDistance((LatLng)points.get(i), (LatLng)points.get(i + 1));
	//   54  116:aload_0         
	//   55  117:getfield        #72  <Field LinkedList points>
	//   56  120:iload           4
	//   57  122:invokevirtual   #175 <Method Object LinkedList.get(int)>
	//   58  125:checkcast       #177 <Class LatLng>
	//   59  128:aload_0         
	//   60  129:getfield        #72  <Field LinkedList points>
	//   61  132:iload           4
	//   62  134:iconst_1        
	//   63  135:iadd            
	//   64  136:invokevirtual   #175 <Method Object LinkedList.get(int)>
	//   65  139:checkcast       #177 <Class LatLng>
	//   66  142:invokestatic    #219 <Method float AMapUtils.calculateLineDistance(LatLng, LatLng)>
	//   67  145:f2d             
	//   68  146:dstore_2        
		eachDistance.add(((Object) (Double.valueOf(d))));
	//   69  147:aload_0         
	//   70  148:getfield        #74  <Field LinkedList eachDistance>
	//   71  151:dload_2         
	//   72  152:invokestatic    #339 <Method Double Double.valueOf(double)>
	//   73  155:invokevirtual   #335 <Method boolean LinkedList.add(Object)>
	//   74  158:pop             
		totalDistance = totalDistance + d;
	//   75  159:aload_0         
	//   76  160:aload_0         
	//   77  161:getfield        #76  <Field double totalDistance>
	//   78  164:dload_2         
	//   79  165:dadd            
	//   80  166:putfield        #76  <Field double totalDistance>
		i++;
	//   81  169:iload           4
	//   82  171:iconst_1        
	//   83  172:iadd            
	//   84  173:istore          4
		if(true) goto _L3; else goto _L2
	//   85  175:goto            102
_L2:
		remainDistance = totalDistance;
	//   86  178:aload_0         
	//   87  179:aload_0         
	//   88  180:getfield        #76  <Field double totalDistance>
	//   89  183:putfield        #78  <Field double remainDistance>
		list = ((List) ((LatLng)points.get(0)));
	//   90  186:aload_0         
	//   91  187:getfield        #72  <Field LinkedList points>
	//   92  190:iconst_0        
	//   93  191:invokevirtual   #175 <Method Object LinkedList.get(int)>
	//   94  194:checkcast       #177 <Class LatLng>
	//   95  197:astore_1        
		if(marker != null)
	//*  96  198:aload_0         
	//*  97  199:getfield        #82  <Field Marker marker>
	//*  98  202:ifnull          220
		{
			marker.setPosition(((LatLng) (list)));
	//   99  205:aload_0         
	//  100  206:getfield        #82  <Field Marker marker>
	//  101  209:aload_1         
	//  102  210:invokevirtual   #343 <Method void Marker.setPosition(LatLng)>
			checkMarkerIcon();
	//  103  213:aload_0         
	//  104  214:invokespecial   #345 <Method void checkMarkerIcon()>
			break MISSING_BLOCK_LABEL_280;
	//  105  217:goto            280
		}
		if(descriptor == null)
	//* 106  220:aload_0         
	//* 107  221:getfield        #155 <Field BitmapDescriptor descriptor>
	//* 108  224:ifnonnull       232
			useDefaultDescriptor = true;
	//  109  227:aload_0         
	//  110  228:iconst_1        
	//  111  229:putfield        #86  <Field boolean useDefaultDescriptor>
		marker = mAMap.addMarker((new MarkerOptions()).belowMaskLayer(true).position(((LatLng) (list))).icon(descriptor).title("").anchor(0.5F, 0.5F));
	//  112  232:aload_0         
	//  113  233:aload_0         
	//  114  234:getfield        #107 <Field AMap mAMap>
	//  115  237:new             #347 <Class MarkerOptions>
	//  116  240:dup             
	//  117  241:invokespecial   #348 <Method void MarkerOptions()>
	//  118  244:iconst_1        
	//  119  245:invokevirtual   #352 <Method MarkerOptions MarkerOptions.belowMaskLayer(boolean)>
	//  120  248:aload_1         
	//  121  249:invokevirtual   #356 <Method MarkerOptions MarkerOptions.position(LatLng)>
	//  122  252:aload_0         
	//  123  253:getfield        #155 <Field BitmapDescriptor descriptor>
	//  124  256:invokevirtual   #360 <Method MarkerOptions MarkerOptions.icon(BitmapDescriptor)>
	//  125  259:ldc2            #362 <String "">
	//  126  262:invokevirtual   #366 <Method MarkerOptions MarkerOptions.title(String)>
	//  127  265:ldc2            #367 <Float 0.5F>
	//  128  268:ldc2            #367 <Float 0.5F>
	//  129  271:invokevirtual   #371 <Method MarkerOptions MarkerOptions.anchor(float, float)>
	//  130  274:invokevirtual   #375 <Method Marker AMap.addMarker(MarkerOptions)>
	//  131  277:putfield        #82  <Field Marker marker>
		reset();
	//  132  280:aload_0         
	//  133  281:invokespecial   #279 <Method void reset()>
		break MISSING_BLOCK_LABEL_292;
	//  134  284:goto            292
		list;
	//  135  287:astore_1        
		((Throwable) (list)).printStackTrace();
	//  136  288:aload_1         
	//  137  289:invokevirtual   #294 <Method void Throwable.printStackTrace()>
		obj;
	//  138  292:aload           5
		JVM INSTR monitorexit ;
	//  139  294:monitorexit     
		return;
	//  140  295:return          
		list;
	//  141  296:astore_1        
	//* 142  297:aload           5
		throw list;
	//  143  299:monitorexit     
	//  144  300:aload_1         
	//  145  301:athrow          
	//* 146  302:goto            49
	}

	public void setPosition(LatLng latlng)
	{
		if(marker != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field Marker marker>
	//*   2    4:ifnull          20
		{
			marker.setPosition(latlng);
	//    3    7:aload_0         
	//    4    8:getfield        #82  <Field Marker marker>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #343 <Method void Marker.setPosition(LatLng)>
			checkMarkerIcon();
	//    7   15:aload_0         
	//    8   16:invokespecial   #345 <Method void checkMarkerIcon()>
			return;
	//    9   19:return          
		}
		if(descriptor == null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #155 <Field BitmapDescriptor descriptor>
	//*  12   24:ifnonnull       32
			useDefaultDescriptor = true;
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:putfield        #86  <Field boolean useDefaultDescriptor>
		marker = mAMap.addMarker((new MarkerOptions()).belowMaskLayer(true).position(latlng).icon(descriptor).title("").anchor(0.5F, 0.5F));
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #107 <Field AMap mAMap>
	//   19   37:new             #347 <Class MarkerOptions>
	//   20   40:dup             
	//   21   41:invokespecial   #348 <Method void MarkerOptions()>
	//   22   44:iconst_1        
	//   23   45:invokevirtual   #352 <Method MarkerOptions MarkerOptions.belowMaskLayer(boolean)>
	//   24   48:aload_1         
	//   25   49:invokevirtual   #356 <Method MarkerOptions MarkerOptions.position(LatLng)>
	//   26   52:aload_0         
	//   27   53:getfield        #155 <Field BitmapDescriptor descriptor>
	//   28   56:invokevirtual   #360 <Method MarkerOptions MarkerOptions.icon(BitmapDescriptor)>
	//   29   59:ldc2            #362 <String "">
	//   30   62:invokevirtual   #366 <Method MarkerOptions MarkerOptions.title(String)>
	//   31   65:ldc2            #367 <Float 0.5F>
	//   32   68:ldc2            #367 <Float 0.5F>
	//   33   71:invokevirtual   #371 <Method MarkerOptions MarkerOptions.anchor(float, float)>
	//   34   74:invokevirtual   #375 <Method Marker AMap.addMarker(MarkerOptions)>
	//   35   77:putfield        #82  <Field Marker marker>
	//   36   80:return          
	}

	public void setRotate(float f)
	{
		if(marker != null && mAMap != null && mAMap != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field Marker marker>
	//*   2    4:ifnull          49
	//*   3    7:aload_0         
	//*   4    8:getfield        #107 <Field AMap mAMap>
	//*   5   11:ifnull          49
	//*   6   14:aload_0         
	//*   7   15:getfield        #107 <Field AMap mAMap>
	//*   8   18:ifnull          49
		{
			CameraPosition cameraposition = mAMap.getCameraPosition();
	//    9   21:aload_0         
	//   10   22:getfield        #107 <Field AMap mAMap>
	//   11   25:invokevirtual   #229 <Method CameraPosition AMap.getCameraPosition()>
	//   12   28:astore_2        
			if(cameraposition != null)
	//*  13   29:aload_2         
	//*  14   30:ifnull          49
				marker.setRotateAngle((360F - f) + cameraposition.bearing);
	//   15   33:aload_0         
	//   16   34:getfield        #82  <Field Marker marker>
	//   17   37:ldc1            #230 <Float 360F>
	//   18   39:fload_1         
	//   19   40:fsub            
	//   20   41:aload_2         
	//   21   42:getfield        #235 <Field float CameraPosition.bearing>
	//   22   45:fadd            
	//   23   46:invokevirtual   #239 <Method void Marker.setRotateAngle(float)>
		}
	//   24   49:return          
	}

	public void setTotalDuration(int i)
	{
		duration = i * 1000;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:sipush          1000
	//    3    5:imul            
	//    4    6:i2l             
	//    5    7:putfield        #63  <Field long duration>
	//    6   10:return          
	}

	public void setVisible(boolean flag)
	{
		if(marker != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field Marker marker>
	//*   2    4:ifnull          15
			marker.setVisible(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #82  <Field Marker marker>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #383 <Method void Marker.setVisible(boolean)>
	//    7   15:return          
	}

	public void startSmoothMove()
	{
		if(moveStatus == a.d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field SmoothMoveMarker$a moveStatus>
	//*   2    4:getstatic       #258 <Field SmoothMoveMarker$a SmoothMoveMarker$a.d>
	//*   3    7:if_acmpne       39
		{
			moveStatus = a.c;
	//    4   10:aload_0         
	//    5   11:getstatic       #255 <Field SmoothMoveMarker$a SmoothMoveMarker$a.c>
	//    6   14:putfield        #97  <Field SmoothMoveMarker$a moveStatus>
			long l = System.currentTimeMillis();
	//    7   17:invokestatic    #103 <Method long System.currentTimeMillis()>
	//    8   20:lstore_1        
			long l1 = pauseMillis;
	//    9   21:aload_0         
	//   10   22:getfield        #386 <Field long pauseMillis>
	//   11   25:lstore_3        
			mAnimationBeginTime = mAnimationBeginTime + (l - l1);
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #105 <Field long mAnimationBeginTime>
	//   15   31:lload_1         
	//   16   32:lload_3         
	//   17   33:lsub            
	//   18   34:ladd            
	//   19   35:putfield        #105 <Field long mAnimationBeginTime>
			return;
	//   20   38:return          
		}
		if(moveStatus == a.a || moveStatus == a.e)
	//*  21   39:aload_0         
	//*  22   40:getfield        #97  <Field SmoothMoveMarker$a moveStatus>
	//*  23   43:getstatic       #95  <Field SmoothMoveMarker$a SmoothMoveMarker$a.a>
	//*  24   46:if_acmpeq       59
	//*  25   49:aload_0         
	//*  26   50:getfield        #97  <Field SmoothMoveMarker$a moveStatus>
	//*  27   53:getstatic       #389 <Field SmoothMoveMarker$a SmoothMoveMarker$a.e>
	//*  28   56:if_acmpne       102
		{
			if(points.size() < 1)
	//*  29   59:aload_0         
	//*  30   60:getfield        #72  <Field LinkedList points>
	//*  31   63:invokevirtual   #171 <Method int LinkedList.size()>
	//*  32   66:iconst_1        
	//*  33   67:icmpge          71
				return;
	//   34   70:return          
			index = 0;
	//   35   71:aload_0         
	//   36   72:iconst_0        
	//   37   73:putfield        #84  <Field int index>
			try
			{
				mThreadPools.execute(((Runnable) (new c())));
	//   38   76:aload_0         
	//   39   77:getfield        #128 <Field ExecutorService mThreadPools>
	//   40   80:new             #17  <Class SmoothMoveMarker$c>
	//   41   83:dup             
	//   42   84:aload_0         
	//   43   85:aconst_null     
	//   44   86:invokespecial   #392 <Method void SmoothMoveMarker$c(SmoothMoveMarker, SmoothMoveMarker$1)>
	//   45   89:invokeinterface #396 <Method void ExecutorService.execute(Runnable)>
				return;
	//   46   94:return          
			}
			catch(Throwable throwable)
	//*  47   95:astore          5
			{
				throwable.printStackTrace();
	//   48   97:aload           5
	//   49   99:invokevirtual   #294 <Method void Throwable.printStackTrace()>
			}
		}
	//   50  102:return          
	}

	public void stopMove()
	{
		if(moveStatus == a.c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field SmoothMoveMarker$a moveStatus>
	//*   2    4:getstatic       #255 <Field SmoothMoveMarker$a SmoothMoveMarker$a.c>
	//*   3    7:if_acmpne       24
		{
			moveStatus = a.d;
	//    4   10:aload_0         
	//    5   11:getstatic       #258 <Field SmoothMoveMarker$a SmoothMoveMarker$a.d>
	//    6   14:putfield        #97  <Field SmoothMoveMarker$a moveStatus>
			pauseMillis = System.currentTimeMillis();
	//    7   17:aload_0         
	//    8   18:invokestatic    #103 <Method long System.currentTimeMillis()>
	//    9   21:putfield        #386 <Field long pauseMillis>
		}
	//   10   24:return          
	}

	public static final float MIN_OFFSET_DISTANCE = 5F;
	private BitmapDescriptor descriptor;
	private long duration;
	private LinkedList eachDistance;
	AtomicBoolean exitFlag;
	private int index;
	private AMap mAMap;
	private long mAnimationBeginTime;
	private Object mLock;
	private long mStepDuration;
	private ExecutorService mThreadPools;
	private Marker marker;
	private MoveListener moveListener;
	private a moveStatus;
	private long pauseMillis;
	private LinkedList points;
	private double remainDistance;
	private double totalDistance;
	private boolean useDefaultDescriptor;


/*
	static long access$200(SmoothMoveMarker smoothmovemarker)
	{
		return smoothmovemarker.mAnimationBeginTime;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field long mAnimationBeginTime>
	//    2    4:lreturn         
	}

*/


/*
	static long access$202(SmoothMoveMarker smoothmovemarker, long l)
	{
		smoothmovemarker.mAnimationBeginTime = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #105 <Field long mAnimationBeginTime>
		return l;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

*/


/*
	static a access$300(SmoothMoveMarker smoothmovemarker)
	{
		return smoothmovemarker.moveStatus;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field SmoothMoveMarker$a moveStatus>
	//    2    4:areturn         
	}

*/


/*
	static a access$302(SmoothMoveMarker smoothmovemarker, a a)
	{
		smoothmovemarker.moveStatus = a;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #97  <Field SmoothMoveMarker$a moveStatus>
		return a;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$400(SmoothMoveMarker smoothmovemarker)
	{
		return smoothmovemarker.index;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int index>
	//    2    4:ireturn         
	}

*/


/*
	static LinkedList access$500(SmoothMoveMarker smoothmovemarker)
	{
		return smoothmovemarker.points;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field LinkedList points>
	//    2    4:areturn         
	}

*/


/*
	static Object access$600(SmoothMoveMarker smoothmovemarker)
	{
		return smoothmovemarker.mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Object mLock>
	//    2    4:areturn         
	}

*/


/*
	static IPoint access$700(SmoothMoveMarker smoothmovemarker, long l)
	{
		return smoothmovemarker.getCurPosition(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #149 <Method IPoint getCurPosition(long)>
	//    3    5:areturn         
	}

*/


/*
	static Marker access$800(SmoothMoveMarker smoothmovemarker)
	{
		return smoothmovemarker.marker;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Marker marker>
	//    2    4:areturn         
	}

*/


/*
	static long access$900(SmoothMoveMarker smoothmovemarker)
	{
		return smoothmovemarker.mStepDuration;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field long mStepDuration>
	//    2    4:lreturn         
	}

*/
}
