// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.*;
import com.autonavi.amap.mapcore.*;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.amap.api.mapcore.util:
//			ks, kt, lh, lk, 
//			ku, li

public class kr
	implements Inner_3dMap_locationManagerBase
{
	static final class a extends HandlerThread
	{

		protected final void onLooperPrepared()
		{
			try
			{
				a.h = new ku(a.a, a.d);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field kr a>
		//    2    4:new             #22  <Class ku>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:getfield        #15  <Field kr a>
		//    6   12:getfield        #25  <Field Context kr.a>
		//    7   15:aload_0         
		//    8   16:getfield        #15  <Field kr a>
		//    9   19:getfield        #29  <Field Handler kr.d>
		//   10   22:invokespecial   #32  <Method void ku(Context, Handler)>
		//   11   25:putfield        #36  <Field ku kr.h>
				super.onLooperPrepared();
		//   12   28:aload_0         
		//   13   29:invokespecial   #38  <Method void HandlerThread.onLooperPrepared()>
				return;
		//   14   32:return          
			}
			catch(Throwable throwable)
		//*  15   33:astore_1        
			{
				return;
		//   16   34:return          
			}
		}

		kr a;

		public a(String s, kr kr1)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #13  <Method void HandlerThread(String)>
			a = kr1;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #15  <Field kr a>
		//    6   10:return          
		}
	}


	public kr(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #35  <Field Context a>
		b = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #37  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #38  <Method void ArrayList()>
	//    9   17:putfield        #40  <Field ArrayList b>
		c = new Object();
	//   10   20:aload_0         
	//   11   21:new             #4   <Class Object>
	//   12   24:dup             
	//   13   25:invokespecial   #33  <Method void Object()>
	//   14   28:putfield        #42  <Field Object c>
		d = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #44  <Field Handler d>
		e = null;
	//   18   36:aload_0         
	//   19   37:aconst_null     
	//   20   38:putfield        #46  <Field kr$a e>
		f = null;
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:putfield        #48  <Field Handler f>
		g = new Inner_3dMap_locationOption();
	//   24   46:aload_0         
	//   25   47:new             #50  <Class Inner_3dMap_locationOption>
	//   26   50:dup             
	//   27   51:invokespecial   #51  <Method void Inner_3dMap_locationOption()>
	//   28   54:putfield        #53  <Field Inner_3dMap_locationOption g>
		h = null;
	//   29   57:aload_0         
	//   30   58:aconst_null     
	//   31   59:putfield        #55  <Field ku h>
		i = com.autonavi.amap.mapcore.Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Hight_Accuracy;
	//   32   62:aload_0         
	//   33   63:getstatic       #60  <Field com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode.Hight_Accuracy>
	//   34   66:putfield        #62  <Field com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode i>
		j = false;
	//   35   69:aload_0         
	//   36   70:iconst_0        
	//   37   71:putfield        #64  <Field boolean j>
		if(context == null)
	//*  38   74:aload_1         
	//*  39   75:ifnonnull       88
		{
			throw new IllegalArgumentException("Context\u53C2\u6570\u4E0D\u80FD\u4E3Anull");
	//   40   78:new             #66  <Class IllegalArgumentException>
	//   41   81:dup             
	//   42   82:ldc1            #68  <String "Context\u53C2\u6570\u4E0D\u80FD\u4E3Anull">
	//   43   84:invokespecial   #71  <Method void IllegalArgumentException(String)>
	//   44   87:athrow          
		} else
		{
			a = context.getApplicationContext();
	//   45   88:aload_0         
	//   46   89:aload_1         
	//   47   90:invokevirtual   #77  <Method Context Context.getApplicationContext()>
	//   48   93:putfield        #35  <Field Context a>
			e();
	//   49   96:aload_0         
	//   50   97:invokespecial   #79  <Method void e()>
			return;
	//   51  100:return          
		}
	}

	private Handler a(Looper looper)
	{
		Object obj = c;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Object c>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		f = ((Handler) (new ks(looper, this)));
	//    5    7:aload_0         
	//    6    8:new             #83  <Class ks>
	//    7   11:dup             
	//    8   12:aload_1         
	//    9   13:aload_0         
	//   10   14:invokespecial   #86  <Method void ks(Looper, kr)>
	//   11   17:putfield        #48  <Field Handler f>
		looper = ((Looper) (f));
	//   12   20:aload_0         
	//   13   21:getfield        #48  <Field Handler f>
	//   14   24:astore_1        
		obj;
	//   15   25:aload_2         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		return ((Handler) (looper));
	//   17   27:aload_1         
	//   18   28:areturn         
		looper;
	//   19   29:astore_1        
	//*  20   30:aload_2         
		throw looper;
	//   21   31:monitorexit     
	//   22   32:aload_1         
	//   23   33:athrow          
	}

	private void a(int k)
	{
		Object obj = c;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Object c>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(f != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #48  <Field Handler f>
	//*   7   11:ifnull          22
			f.removeMessages(k);
	//    8   14:aload_0         
	//    9   15:getfield        #48  <Field Handler f>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #92  <Method void Handler.removeMessages(int)>
		obj;
	//   12   22:aload_2         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		Exception exception;
		exception;
	//   15   25:astore_3        
	//*  16   26:aload_2         
		throw exception;
	//   17   27:monitorexit     
	//   18   28:aload_3         
	//   19   29:athrow          
	}

	private void a(int k, Object obj, long l)
	{
		Object obj1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Object c>
	//    2    4:astore          5
		obj1;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(f != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #48  <Field Handler f>
	//*   7   13:ifnull          44
		{
			Message message = Message.obtain();
	//    8   16:invokestatic    #99  <Method Message Message.obtain()>
	//    9   19:astore          6
			message.what = k;
	//   10   21:aload           6
	//   11   23:iload_1         
	//   12   24:putfield        #103 <Field int Message.what>
			message.obj = obj;
	//   13   27:aload           6
	//   14   29:aload_2         
	//   15   30:putfield        #106 <Field Object Message.obj>
			f.sendMessageDelayed(message, l);
	//   16   33:aload_0         
	//   17   34:getfield        #48  <Field Handler f>
	//   18   37:aload           6
	//   19   39:lload_3         
	//   20   40:invokevirtual   #110 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//   21   43:pop             
		}
		obj1;
	//   22   44:aload           5
		JVM INSTR monitorexit ;
	//   23   46:monitorexit     
		return;
	//   24   47:return          
		obj;
	//   25   48:astore_2        
	//*  26   49:aload           5
		throw obj;
	//   27   51:monitorexit     
	//   28   52:aload_2         
	//   29   53:athrow          
	}

	private void e()
	{
label0:
		{
			if(Looper.myLooper() == null)
	//*   0    0:invokestatic    #118 <Method Looper Looper.myLooper()>
	//*   1    3:ifnonnull       28
			{
				d = ((Handler) (new kt(a.getMainLooper(), this)));
	//    2    6:aload_0         
	//    3    7:new             #120 <Class kt>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #35  <Field Context a>
	//    7   15:invokevirtual   #123 <Method Looper Context.getMainLooper()>
	//    8   18:aload_0         
	//    9   19:invokespecial   #124 <Method void kt(Looper, kr)>
	//   10   22:putfield        #44  <Field Handler d>
				break label0;
	//   11   25:goto            52
			}
			try
			{
				d = ((Handler) (new kt(this)));
	//   12   28:aload_0         
	//   13   29:new             #120 <Class kt>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:invokespecial   #127 <Method void kt(kr)>
	//   17   37:putfield        #44  <Field Handler d>
			}
	//*  18   40:goto            52
			catch(Throwable throwable)
	//*  19   43:astore_1        
			{
				lh.a(throwable, "LocationClientManager", "initResultHandler");
	//   20   44:aload_1         
	//   21   45:ldc1            #129 <String "LocationClientManager">
	//   22   47:ldc1            #131 <String "initResultHandler">
	//   23   49:invokestatic    #136 <Method void lh.a(Throwable, String, String)>
			}
		}
		try
		{
			e = new a("locaitonClientActionThread", this);
	//   24   52:aload_0         
	//   25   53:new             #8   <Class kr$a>
	//   26   56:dup             
	//   27   57:ldc1            #138 <String "locaitonClientActionThread">
	//   28   59:aload_0         
	//   29   60:invokespecial   #141 <Method void kr$a(String, kr)>
	//   30   63:putfield        #46  <Field kr$a e>
			e.setPriority(5);
	//   31   66:aload_0         
	//   32   67:getfield        #46  <Field kr$a e>
	//   33   70:iconst_5        
	//   34   71:invokevirtual   #144 <Method void kr$a.setPriority(int)>
			e.start();
	//   35   74:aload_0         
	//   36   75:getfield        #46  <Field kr$a e>
	//   37   78:invokevirtual   #147 <Method void kr$a.start()>
			f = a(e.getLooper());
	//   38   81:aload_0         
	//   39   82:aload_0         
	//   40   83:aload_0         
	//   41   84:getfield        #46  <Field kr$a e>
	//   42   87:invokevirtual   #150 <Method Looper kr$a.getLooper()>
	//   43   90:invokespecial   #152 <Method Handler a(Looper)>
	//   44   93:putfield        #48  <Field Handler f>
			return;
	//   45   96:return          
		}
		catch(Throwable throwable1)
	//*  46   97:astore_1        
		{
			lh.a(throwable1, "LocationClientManager", "initActionThreadAndActionHandler");
	//   47   98:aload_1         
	//   48   99:ldc1            #129 <String "LocationClientManager">
	//   49  101:ldc1            #154 <String "initActionThreadAndActionHandler">
	//   50  103:invokestatic    #136 <Method void lh.a(Throwable, String, String)>
		}
	//   51  106:return          
	}

	private void f()
	{
		Object obj = c;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Object c>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(f != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #48  <Field Handler f>
	//*   7   11:ifnull          22
			f.removeCallbacksAndMessages(((Object) (null)));
	//    8   14:aload_0         
	//    9   15:getfield        #48  <Field Handler f>
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #158 <Method void Handler.removeCallbacksAndMessages(Object)>
		f = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #48  <Field Handler f>
		obj;
	//   15   27:aload_1         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		return;
	//   17   29:return          
		Exception exception;
		exception;
	//   18   30:astore_2        
	//*  19   31:aload_1         
		throw exception;
	//   20   32:monitorexit     
	//   21   33:aload_2         
	//   22   34:athrow          
	}

	final void a()
	{
		boolean flag = j;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean j>
	//    2    4:istore_1        
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            10
			return;
	//    5    9:return          
		try
		{
			j = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #64  <Field boolean j>
			a(1005, ((Object) (null)), 0L);
	//    9   15:aload_0         
	//   10   16:sipush          1005
	//   11   19:aconst_null     
	//   12   20:lconst_0        
	//   13   21:invokespecial   #160 <Method void a(int, Object, long)>
			return;
	//   14   24:return          
		}
		catch(Throwable throwable)
	//*  15   25:astore_2        
		{
			lh.a(throwable, "LocationClientManager", "doStartLocation");
	//   16   26:aload_2         
	//   17   27:ldc1            #129 <String "LocationClientManager">
	//   18   29:ldc1            #162 <String "doStartLocation">
	//   19   31:invokestatic    #136 <Method void lh.a(Throwable, String, String)>
		}
		return;
	//   20   34:return          
	}

	final void a(Inner_3dMap_location inner_3dmap_location)
	{
		Iterator iterator;
		if(!j)
			break MISSING_BLOCK_LABEL_98;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean j>
	//    2    4:ifeq            98
		if(!"gps".equalsIgnoreCase(inner_3dmap_location.getProvider()))
	//*   3    7:ldc1            #165 <String "gps">
	//*   4    9:aload_1         
	//*   5   10:invokevirtual   #171 <Method String Inner_3dMap_location.getProvider()>
	//*   6   13:invokevirtual   #177 <Method boolean String.equalsIgnoreCase(String)>
	//*   7   16:ifne            25
			inner_3dmap_location.setProvider("lbs");
	//    8   19:aload_1         
	//    9   20:ldc1            #179 <String "lbs">
	//   10   22:invokevirtual   #182 <Method void Inner_3dMap_location.setProvider(String)>
		inner_3dmap_location.setAltitude(lk.b(inner_3dmap_location.getAltitude()));
	//   11   25:aload_1         
	//   12   26:aload_1         
	//   13   27:invokevirtual   #186 <Method double Inner_3dMap_location.getAltitude()>
	//   14   30:invokestatic    #191 <Method double lk.b(double)>
	//   15   33:invokevirtual   #195 <Method void Inner_3dMap_location.setAltitude(double)>
		inner_3dmap_location.setBearing(lk.a(inner_3dmap_location.getBearing()));
	//   16   36:aload_1         
	//   17   37:aload_1         
	//   18   38:invokevirtual   #199 <Method float Inner_3dMap_location.getBearing()>
	//   19   41:invokestatic    #202 <Method float lk.a(float)>
	//   20   44:invokevirtual   #206 <Method void Inner_3dMap_location.setBearing(float)>
		inner_3dmap_location.setSpeed(lk.a(inner_3dmap_location.getSpeed()));
	//   21   47:aload_1         
	//   22   48:aload_1         
	//   23   49:invokevirtual   #209 <Method float Inner_3dMap_location.getSpeed()>
	//   24   52:invokestatic    #202 <Method float lk.a(float)>
	//   25   55:invokevirtual   #212 <Method void Inner_3dMap_location.setSpeed(float)>
		iterator = b.iterator();
	//   26   58:aload_0         
	//   27   59:getfield        #40  <Field ArrayList b>
	//   28   62:invokevirtual   #216 <Method Iterator ArrayList.iterator()>
	//   29   65:astore_2        
_L1:
		Inner_3dMap_locationListener inner_3dmap_locationlistener;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_98;
	//   30   66:aload_2         
	//   31   67:invokeinterface #222 <Method boolean Iterator.hasNext()>
	//   32   72:ifeq            98
		inner_3dmap_locationlistener = (Inner_3dMap_locationListener)iterator.next();
	//   33   75:aload_2         
	//   34   76:invokeinterface #226 <Method Object Iterator.next()>
	//   35   81:checkcast       #228 <Class Inner_3dMap_locationListener>
	//   36   84:astore_3        
		try
		{
			inner_3dmap_locationlistener.onLocationChanged(inner_3dmap_location);
	//   37   85:aload_3         
	//   38   86:aload_1         
	//   39   87:invokeinterface #231 <Method void Inner_3dMap_locationListener.onLocationChanged(Inner_3dMap_location)>
		}
	//*  40   92:goto            66
	//*  41   95:goto            66
	//*  42   98:aload_0         
	//*  43   99:getfield        #53  <Field Inner_3dMap_locationOption g>
	//*  44  102:invokevirtual   #234 <Method boolean Inner_3dMap_locationOption.isOnceLocation()>
	//*  45  105:ifeq            112
	//*  46  108:aload_0         
	//*  47  109:invokevirtual   #236 <Method void c()>
	//*  48  112:return          
	//*  49  113:astore_1        
	//*  50  114:aload_1         
	//*  51  115:ldc1            #238 <String "LocationClientManger">
	//*  52  117:ldc1            #240 <String "callBackLocation">
	//*  53  119:invokestatic    #136 <Method void lh.a(Throwable, String, String)>
	//*  54  122:return          
		catch(Throwable throwable) { }
	//   55  123:astore_3        
		  goto _L1
		try
		{
			if(g.isOnceLocation())
				c();
			return;
		}
		// Misplaced declaration of an exception variable
		catch(Inner_3dMap_location inner_3dmap_location)
		{
			lh.a(((Throwable) (inner_3dmap_location)), "LocationClientManger", "callBackLocation");
		}
		return;
	//*  56  124:goto            95
	}

	final void a(Inner_3dMap_locationListener inner_3dmap_locationlistener)
	{
		if(inner_3dmap_locationlistener != null)
			break MISSING_BLOCK_LABEL_14;
	//    0    0:aload_1         
	//    1    1:ifnonnull       14
		throw new IllegalArgumentException("listener\u53C2\u6570\u4E0D\u80FD\u4E3Anull");
	//    2    4:new             #66  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #243 <String "listener\u53C2\u6570\u4E0D\u80FD\u4E3Anull">
	//    5   10:invokespecial   #71  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(b == null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #40  <Field ArrayList b>
	//*   9   18:ifnonnull       32
			b = new ArrayList();
	//   10   21:aload_0         
	//   11   22:new             #37  <Class ArrayList>
	//   12   25:dup             
	//   13   26:invokespecial   #38  <Method void ArrayList()>
	//   14   29:putfield        #40  <Field ArrayList b>
		if(!b.contains(((Object) (inner_3dmap_locationlistener))))
	//*  15   32:aload_0         
	//*  16   33:getfield        #40  <Field ArrayList b>
	//*  17   36:aload_1         
	//*  18   37:invokevirtual   #247 <Method boolean ArrayList.contains(Object)>
	//*  19   40:ifne            52
			b.add(((Object) (inner_3dmap_locationlistener)));
	//   20   43:aload_0         
	//   21   44:getfield        #40  <Field ArrayList b>
	//   22   47:aload_1         
	//   23   48:invokevirtual   #250 <Method boolean ArrayList.add(Object)>
	//   24   51:pop             
		return;
	//   25   52:return          
		inner_3dmap_locationlistener;
	//   26   53:astore_1        
		lh.a(((Throwable) (inner_3dmap_locationlistener)), "LocationClientManager", "doSetLocationListener");
	//   27   54:aload_1         
	//   28   55:ldc1            #129 <String "LocationClientManager">
	//   29   57:ldc1            #252 <String "doSetLocationListener">
	//   30   59:invokestatic    #136 <Method void lh.a(Throwable, String, String)>
		return;
	//   31   62:return          
	}

	final void a(Inner_3dMap_locationOption inner_3dmap_locationoption)
	{
		g = inner_3dmap_locationoption;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #53  <Field Inner_3dMap_locationOption g>
		if(g == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #53  <Field Inner_3dMap_locationOption g>
	//*   5    9:ifnonnull       23
			g = new Inner_3dMap_locationOption();
	//    6   12:aload_0         
	//    7   13:new             #50  <Class Inner_3dMap_locationOption>
	//    8   16:dup             
	//    9   17:invokespecial   #51  <Method void Inner_3dMap_locationOption()>
	//   10   20:putfield        #53  <Field Inner_3dMap_locationOption g>
		if(h != null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #55  <Field ku h>
	//*  13   27:ifnull          41
			h.a(g);
	//   14   30:aload_0         
	//   15   31:getfield        #55  <Field ku h>
	//   16   34:aload_0         
	//   17   35:getfield        #53  <Field Inner_3dMap_locationOption g>
	//   18   38:invokevirtual   #257 <Method void ku.a(Inner_3dMap_locationOption)>
		if(j && !i.equals(((Object) (inner_3dmap_locationoption.getLocationMode()))))
	//*  19   41:aload_0         
	//*  20   42:getfield        #64  <Field boolean j>
	//*  21   45:ifeq            70
	//*  22   48:aload_0         
	//*  23   49:getfield        #62  <Field com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode i>
	//*  24   52:aload_1         
	//*  25   53:invokevirtual   #261 <Method com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode Inner_3dMap_locationOption.getLocationMode()>
	//*  26   56:invokevirtual   #264 <Method boolean com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode.equals(Object)>
	//*  27   59:ifne            70
		{
			c();
	//   28   62:aload_0         
	//   29   63:invokevirtual   #236 <Method void c()>
			a();
	//   30   66:aload_0         
	//   31   67:invokevirtual   #266 <Method void a()>
		}
		i = g.getLocationMode();
	//   32   70:aload_0         
	//   33   71:aload_0         
	//   34   72:getfield        #53  <Field Inner_3dMap_locationOption g>
	//   35   75:invokevirtual   #261 <Method com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode Inner_3dMap_locationOption.getLocationMode()>
	//   36   78:putfield        #62  <Field com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode i>
	//   37   81:return          
	}

	final void b()
	{
		if(h != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field ku h>
	//*   2    4:ifnull          14
			h.a();
	//    3    7:aload_0         
	//    4    8:getfield        #55  <Field ku h>
	//    5   11:invokevirtual   #267 <Method void ku.a()>
		if(!g.isOnceLocation())
	//*   6   14:aload_0         
	//*   7   15:getfield        #53  <Field Inner_3dMap_locationOption g>
	//*   8   18:invokevirtual   #234 <Method boolean Inner_3dMap_locationOption.isOnceLocation()>
	//*   9   21:ifne            173
		{
			long l;
			if(g.getInterval() < 1000L)
	//*  10   24:aload_0         
	//*  11   25:getfield        #53  <Field Inner_3dMap_locationOption g>
	//*  12   28:invokevirtual   #271 <Method long Inner_3dMap_locationOption.getInterval()>
	//*  13   31:ldc2w           #272 <Long 1000L>
	//*  14   34:lcmp            
	//*  15   35:ifge            45
				l = 1000L;
	//   16   38:ldc2w           #272 <Long 1000L>
	//   17   41:lstore_1        
			else
	//*  18   42:goto            53
				l = g.getInterval();
	//   19   45:aload_0         
	//   20   46:getfield        #53  <Field Inner_3dMap_locationOption g>
	//   21   49:invokevirtual   #271 <Method long Inner_3dMap_locationOption.getInterval()>
	//   22   52:lstore_1        
			a(1005, ((Object) (null)), l);
	//   23   53:aload_0         
	//   24   54:sipush          1005
	//   25   57:aconst_null     
	//   26   58:lload_1         
	//   27   59:invokespecial   #160 <Method void a(int, Object, long)>
			return;
	//   28   62:return          
		}
		break MISSING_BLOCK_LABEL_173;
		Object obj;
		obj;
	//   29   63:astore_3        
		lh.a(((Throwable) (obj)), "LocationClientManager", "doGetLocation");
	//   30   64:aload_3         
	//   31   65:ldc1            #129 <String "LocationClientManager">
	//   32   67:ldc2            #275 <String "doGetLocation">
	//   33   70:invokestatic    #136 <Method void lh.a(Throwable, String, String)>
		if(!g.isOnceLocation())
	//*  34   73:aload_0         
	//*  35   74:getfield        #53  <Field Inner_3dMap_locationOption g>
	//*  36   77:invokevirtual   #234 <Method boolean Inner_3dMap_locationOption.isOnceLocation()>
	//*  37   80:ifne            173
		{
			long l1;
			if(g.getInterval() < 1000L)
	//*  38   83:aload_0         
	//*  39   84:getfield        #53  <Field Inner_3dMap_locationOption g>
	//*  40   87:invokevirtual   #271 <Method long Inner_3dMap_locationOption.getInterval()>
	//*  41   90:ldc2w           #272 <Long 1000L>
	//*  42   93:lcmp            
	//*  43   94:ifge            104
				l1 = 1000L;
	//   44   97:ldc2w           #272 <Long 1000L>
	//   45  100:lstore_1        
			else
	//*  46  101:goto            112
				l1 = g.getInterval();
	//   47  104:aload_0         
	//   48  105:getfield        #53  <Field Inner_3dMap_locationOption g>
	//   49  108:invokevirtual   #271 <Method long Inner_3dMap_locationOption.getInterval()>
	//   50  111:lstore_1        
			a(1005, ((Object) (null)), l1);
	//   51  112:aload_0         
	//   52  113:sipush          1005
	//   53  116:aconst_null     
	//   54  117:lload_1         
	//   55  118:invokespecial   #160 <Method void a(int, Object, long)>
			return;
	//   56  121:return          
		}
		break MISSING_BLOCK_LABEL_173;
		obj;
	//   57  122:astore_3        
		if(!g.isOnceLocation())
	//*  58  123:aload_0         
	//*  59  124:getfield        #53  <Field Inner_3dMap_locationOption g>
	//*  60  127:invokevirtual   #234 <Method boolean Inner_3dMap_locationOption.isOnceLocation()>
	//*  61  130:ifne            171
		{
			long l2;
			if(g.getInterval() < 1000L)
	//*  62  133:aload_0         
	//*  63  134:getfield        #53  <Field Inner_3dMap_locationOption g>
	//*  64  137:invokevirtual   #271 <Method long Inner_3dMap_locationOption.getInterval()>
	//*  65  140:ldc2w           #272 <Long 1000L>
	//*  66  143:lcmp            
	//*  67  144:ifge            154
				l2 = 1000L;
	//   68  147:ldc2w           #272 <Long 1000L>
	//   69  150:lstore_1        
			else
	//*  70  151:goto            162
				l2 = g.getInterval();
	//   71  154:aload_0         
	//   72  155:getfield        #53  <Field Inner_3dMap_locationOption g>
	//   73  158:invokevirtual   #271 <Method long Inner_3dMap_locationOption.getInterval()>
	//   74  161:lstore_1        
			a(1005, ((Object) (null)), l2);
	//   75  162:aload_0         
	//   76  163:sipush          1005
	//   77  166:aconst_null     
	//   78  167:lload_1         
	//   79  168:invokespecial   #160 <Method void a(int, Object, long)>
		}
		throw obj;
	//   80  171:aload_3         
	//   81  172:athrow          
	//   82  173:return          
	}

	final void b(Inner_3dMap_locationListener inner_3dmap_locationlistener)
	{
		if(inner_3dmap_locationlistener == null)
			break MISSING_BLOCK_LABEL_34;
	//    0    0:aload_1         
	//    1    1:ifnull          34
		if(!b.isEmpty() && b.contains(((Object) (inner_3dmap_locationlistener))))
	//*   2    4:aload_0         
	//*   3    5:getfield        #40  <Field ArrayList b>
	//*   4    8:invokevirtual   #278 <Method boolean ArrayList.isEmpty()>
	//*   5   11:ifne            34
	//*   6   14:aload_0         
	//*   7   15:getfield        #40  <Field ArrayList b>
	//*   8   18:aload_1         
	//*   9   19:invokevirtual   #247 <Method boolean ArrayList.contains(Object)>
	//*  10   22:ifeq            34
			b.remove(((Object) (inner_3dmap_locationlistener)));
	//   11   25:aload_0         
	//   12   26:getfield        #40  <Field ArrayList b>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #281 <Method boolean ArrayList.remove(Object)>
	//   15   33:pop             
		if(b.isEmpty())
	//*  16   34:aload_0         
	//*  17   35:getfield        #40  <Field ArrayList b>
	//*  18   38:invokevirtual   #278 <Method boolean ArrayList.isEmpty()>
	//*  19   41:ifeq            48
			c();
	//   20   44:aload_0         
	//   21   45:invokevirtual   #236 <Method void c()>
		return;
	//   22   48:return          
		inner_3dmap_locationlistener;
	//   23   49:astore_1        
		lh.a(((Throwable) (inner_3dmap_locationlistener)), "LocationClientManager", "doUnregisterListener");
	//   24   50:aload_1         
	//   25   51:ldc1            #129 <String "LocationClientManager">
	//   26   53:ldc2            #283 <String "doUnregisterListener">
	//   27   56:invokestatic    #136 <Method void lh.a(Throwable, String, String)>
		return;
	//   28   59:return          
	}

	final void c()
	{
		try
		{
			j = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #64  <Field boolean j>
			a(1004);
	//    3    5:aload_0         
	//    4    6:sipush          1004
	//    5    9:invokespecial   #285 <Method void a(int)>
			a(1005);
	//    6   12:aload_0         
	//    7   13:sipush          1005
	//    8   16:invokespecial   #285 <Method void a(int)>
			if(h != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #55  <Field ku h>
	//*  11   23:ifnull          33
				h.c();
	//   12   26:aload_0         
	//   13   27:getfield        #55  <Field ku h>
	//   14   30:invokevirtual   #286 <Method void ku.c()>
			return;
	//   15   33:return          
		}
		catch(Throwable throwable)
	//*  16   34:astore_1        
		{
			lh.a(throwable, "LocationClientManager", "doStopLocation");
	//   17   35:aload_1         
	//   18   36:ldc1            #129 <String "LocationClientManager">
	//   19   38:ldc2            #288 <String "doStopLocation">
	//   20   41:invokestatic    #136 <Method void lh.a(Throwable, String, String)>
		}
	//   21   44:return          
	}

	final void d()
	{
		Throwable throwable;
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #236 <Method void c()>
		if(h != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field ku h>
	//*   4    8:ifnull          18
			h.d();
	//    5   11:aload_0         
	//    6   12:getfield        #55  <Field ku h>
	//    7   15:invokevirtual   #290 <Method void ku.d()>
		f();
	//    8   18:aload_0         
	//    9   19:invokespecial   #292 <Method void f()>
		if(e != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #46  <Field kr$a e>
	//*  12   26:ifnull          77
			if(android.os.Build.VERSION.SDK_INT >= 18)
	//*  13   29:getstatic       #297 <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   32:bipush          18
	//*  15   34:icmplt          69
				try
				{
					li.a(((Object) (e)), android/os/HandlerThread, "quitSafely", new Object[0]);
	//   16   37:aload_0         
	//   17   38:getfield        #46  <Field kr$a e>
	//   18   41:ldc2            #299 <Class HandlerThread>
	//   19   44:ldc2            #301 <String "quitSafely">
	//   20   47:iconst_0        
	//   21   48:anewarray       Object[]
	//   22   51:invokestatic    #306 <Method Object li.a(Object, Class, String, Object[])>
	//   23   54:pop             
				}
	//*  24   55:goto            77
	//*  25   58:aload_0         
	//*  26   59:getfield        #46  <Field kr$a e>
	//*  27   62:invokevirtual   #309 <Method boolean kr$a.quit()>
	//*  28   65:pop             
	//*  29   66:goto            77
	//*  30   69:aload_0         
	//*  31   70:getfield        #46  <Field kr$a e>
	//*  32   73:invokevirtual   #309 <Method boolean kr$a.quit()>
	//*  33   76:pop             
	//*  34   77:aload_0         
	//*  35   78:aconst_null     
	//*  36   79:putfield        #46  <Field kr$a e>
	//*  37   82:return          
				// Misplaced declaration of an exception variable
				catch(Throwable throwable)
				{
					e.quit();
				}
			else
				e.quit();
		e = null;
	//*  38   83:astore_1        
	//*  39   84:goto            58
	}

	public void destroy()
	{
		try
		{
			a(1007, ((Object) (null)), 0L);
	//    0    0:aload_0         
	//    1    1:sipush          1007
	//    2    4:aconst_null     
	//    3    5:lconst_0        
	//    4    6:invokespecial   #160 <Method void a(int, Object, long)>
			return;
	//    5    9:return          
		}
		catch(Throwable throwable)
	//*   6   10:astore_1        
		{
			lh.a(throwable, "LocationClientManager", "stopLocation");
	//    7   11:aload_1         
	//    8   12:ldc1            #129 <String "LocationClientManager">
	//    9   14:ldc2            #312 <String "stopLocation">
	//   10   17:invokestatic    #136 <Method void lh.a(Throwable, String, String)>
		}
	//   11   20:return          
	}

	public void setLocationListener(Inner_3dMap_locationListener inner_3dmap_locationlistener)
	{
		try
		{
			a(1002, ((Object) (inner_3dmap_locationlistener)), 0L);
	//    0    0:aload_0         
	//    1    1:sipush          1002
	//    2    4:aload_1         
	//    3    5:lconst_0        
	//    4    6:invokespecial   #160 <Method void a(int, Object, long)>
			return;
	//    5    9:return          
		}
		// Misplaced declaration of an exception variable
		catch(Inner_3dMap_locationListener inner_3dmap_locationlistener)
	//*   6   10:astore_1        
		{
			lh.a(((Throwable) (inner_3dmap_locationlistener)), "LocationClientManager", "setLocationListener");
	//    7   11:aload_1         
	//    8   12:ldc1            #129 <String "LocationClientManager">
	//    9   14:ldc2            #314 <String "setLocationListener">
	//   10   17:invokestatic    #136 <Method void lh.a(Throwable, String, String)>
		}
	//   11   20:return          
	}

	public void setLocationOption(Inner_3dMap_locationOption inner_3dmap_locationoption)
	{
		try
		{
			a(1001, ((Object) (inner_3dmap_locationoption)), 0L);
	//    0    0:aload_0         
	//    1    1:sipush          1001
	//    2    4:aload_1         
	//    3    5:lconst_0        
	//    4    6:invokespecial   #160 <Method void a(int, Object, long)>
			return;
	//    5    9:return          
		}
		// Misplaced declaration of an exception variable
		catch(Inner_3dMap_locationOption inner_3dmap_locationoption)
	//*   6   10:astore_1        
		{
			lh.a(((Throwable) (inner_3dmap_locationoption)), "LocationClientManager", "setLocationOption");
	//    7   11:aload_1         
	//    8   12:ldc1            #129 <String "LocationClientManager">
	//    9   14:ldc2            #316 <String "setLocationOption">
	//   10   17:invokestatic    #136 <Method void lh.a(Throwable, String, String)>
		}
	//   11   20:return          
	}

	public void startLocation()
	{
		try
		{
			a(1004, ((Object) (null)), 0L);
	//    0    0:aload_0         
	//    1    1:sipush          1004
	//    2    4:aconst_null     
	//    3    5:lconst_0        
	//    4    6:invokespecial   #160 <Method void a(int, Object, long)>
			return;
	//    5    9:return          
		}
		catch(Throwable throwable)
	//*   6   10:astore_1        
		{
			lh.a(throwable, "LocationClientManager", "startLocation");
	//    7   11:aload_1         
	//    8   12:ldc1            #129 <String "LocationClientManager">
	//    9   14:ldc2            #318 <String "startLocation">
	//   10   17:invokestatic    #136 <Method void lh.a(Throwable, String, String)>
		}
	//   11   20:return          
	}

	public void stopLocation()
	{
		try
		{
			a(1006, ((Object) (null)), 0L);
	//    0    0:aload_0         
	//    1    1:sipush          1006
	//    2    4:aconst_null     
	//    3    5:lconst_0        
	//    4    6:invokespecial   #160 <Method void a(int, Object, long)>
			return;
	//    5    9:return          
		}
		catch(Throwable throwable)
	//*   6   10:astore_1        
		{
			lh.a(throwable, "LocationClientManager", "stopLocation");
	//    7   11:aload_1         
	//    8   12:ldc1            #129 <String "LocationClientManager">
	//    9   14:ldc2            #312 <String "stopLocation">
	//   10   17:invokestatic    #136 <Method void lh.a(Throwable, String, String)>
		}
	//   11   20:return          
	}

	public void unRegisterLocationListener(Inner_3dMap_locationListener inner_3dmap_locationlistener)
	{
		try
		{
			a(1006, ((Object) (inner_3dmap_locationlistener)), 0L);
	//    0    0:aload_0         
	//    1    1:sipush          1006
	//    2    4:aload_1         
	//    3    5:lconst_0        
	//    4    6:invokespecial   #160 <Method void a(int, Object, long)>
			return;
	//    5    9:return          
		}
		// Misplaced declaration of an exception variable
		catch(Inner_3dMap_locationListener inner_3dmap_locationlistener)
	//*   6   10:astore_1        
		{
			lh.a(((Throwable) (inner_3dmap_locationlistener)), "LocationClientManager", "stopLocation");
	//    7   11:aload_1         
	//    8   12:ldc1            #129 <String "LocationClientManager">
	//    9   14:ldc2            #312 <String "stopLocation">
	//   10   17:invokestatic    #136 <Method void lh.a(Throwable, String, String)>
		}
	//   11   20:return          
	}

	Context a;
	ArrayList b;
	Object c;
	Handler d;
	a e;
	Handler f;
	Inner_3dMap_locationOption g;
	ku h;
	com.autonavi.amap.mapcore.Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode i;
	boolean j;
}
