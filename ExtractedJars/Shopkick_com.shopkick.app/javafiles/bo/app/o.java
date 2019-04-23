// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.Appboy;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.AppboyLogger;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package bo.app:
//			q, bm, co, cb, 
//			dl, dj, ch, bu, 
//			bt, dt, cu, cm, 
//			cn, ca

public final class o
	implements q
{

	public o(dj dj1, bm bm1, AppboyConfigurationProvider appboyconfigurationprovider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		e = dj1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field dj e>
		d = bm1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #41  <Field bm d>
	//    8   14:aload_0         
	//    9   15:new             #43  <Class LinkedBlockingQueue>
	//   10   18:dup             
	//   11   19:sipush          1000
	//   12   22:invokespecial   #46  <Method void LinkedBlockingQueue(int)>
	//   13   25:putfield        #48  <Field LinkedBlockingQueue f>
		g = appboyconfigurationprovider;
	//   14   28:aload_0         
	//   15   29:aload_3         
	//   16   30:putfield        #50  <Field AppboyConfigurationProvider g>
	//   17   33:aload_0         
	//   18   34:new             #52  <Class ConcurrentHashMap>
	//   19   37:dup             
	//   20   38:invokespecial   #53  <Method void ConcurrentHashMap()>
	//   21   41:putfield        #55  <Field ConcurrentHashMap a>
	//   22   44:aload_0         
	//   23   45:new             #52  <Class ConcurrentHashMap>
	//   24   48:dup             
	//   25   49:invokespecial   #53  <Method void ConcurrentHashMap()>
	//   26   52:putfield        #57  <Field ConcurrentHashMap b>
	//   27   55:return          
	}

	private void c(co co1)
	{
		if(d.c() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field bm d>
	//*   2    4:invokeinterface #64  <Method String bm.c()>
	//*   3    9:ifnull          27
			co1.a(d.c());
	//    4   12:aload_1         
	//    5   13:aload_0         
	//    6   14:getfield        #41  <Field bm d>
	//    7   17:invokeinterface #64  <Method String bm.c()>
	//    8   22:invokeinterface #69  <Method void co.a(String)>
		if(g.getAppboyApiKey() != null)
	//*   9   27:aload_0         
	//*  10   28:getfield        #50  <Field AppboyConfigurationProvider g>
	//*  11   31:invokevirtual   #75  <Method cb AppboyConfigurationProvider.getAppboyApiKey()>
	//*  12   34:ifnull          53
			co1.b(g.getAppboyApiKey().toString());
	//   13   37:aload_1         
	//   14   38:aload_0         
	//   15   39:getfield        #50  <Field AppboyConfigurationProvider g>
	//   16   42:invokevirtual   #75  <Method cb AppboyConfigurationProvider.getAppboyApiKey()>
	//   17   45:invokevirtual   #80  <Method String cb.toString()>
	//   18   48:invokeinterface #82  <Method void co.b(String)>
		co1.c("2.5.1");
	//   19   53:aload_1         
	//   20   54:ldc1            #84  <String "2.5.1">
	//   21   56:invokeinterface #86  <Method void co.c(String)>
		co1.a(dl.a());
	//   22   61:aload_1         
	//   23   62:invokestatic    #91  <Method long dl.a()>
	//   24   65:invokeinterface #94  <Method void co.a(long)>
	//   25   70:return          
	}

	private void d(co co1)
	{
		co1.d(d.e());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field bm d>
	//    3    5:invokeinterface #97  <Method String bm.e()>
	//    4   10:invokeinterface #99  <Method void co.d(String)>
		co1.a(g.getSdkFlavor());
	//    5   15:aload_1         
	//    6   16:aload_0         
	//    7   17:getfield        #50  <Field AppboyConfigurationProvider g>
	//    8   20:invokevirtual   #103 <Method com.appboy.enums.SdkFlavor AppboyConfigurationProvider.getSdkFlavor()>
	//    9   23:invokeinterface #106 <Method void co.a(com.appboy.enums.SdkFlavor)>
		co1.a(d.b());
	//   10   28:aload_1         
	//   11   29:aload_0         
	//   12   30:getfield        #41  <Field bm d>
	//   13   33:invokeinterface #109 <Method ce bm.b()>
	//   14   38:invokeinterface #112 <Method void co.a(ce)>
		co1.a((ch)e.b());
	//   15   43:aload_1         
	//   16   44:aload_0         
	//   17   45:getfield        #39  <Field dj e>
	//   18   48:invokevirtual   #117 <Method Object dj.b()>
	//   19   51:checkcast       #119 <Class ch>
	//   20   54:invokeinterface #122 <Method void co.a(ch)>
		co1.a(e());
	//   21   59:aload_1         
	//   22   60:aload_0         
	//   23   61:invokespecial   #125 <Method bt e()>
	//   24   64:invokeinterface #128 <Method void co.a(bt)>
	//   25   69:return          
	}

	private bt e()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist;
		Collection collection = a.values();
	//    2    2:aload_0         
	//    3    3:getfield        #55  <Field ConcurrentHashMap a>
	//    4    6:invokevirtual   #132 <Method Collection ConcurrentHashMap.values()>
	//    5    9:astore_1        
		arraylist = new ArrayList();
	//    6   10:new             #134 <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #135 <Method void ArrayList()>
	//    9   17:astore_2        
		String s;
		StringBuilder stringbuilder;
		for(Iterator iterator = collection.iterator(); iterator.hasNext(); AppboyLogger.d(s, stringbuilder.toString()))
	//*  10   18:aload_1         
	//*  11   19:invokeinterface #141 <Method Iterator Collection.iterator()>
	//*  12   24:astore_3        
	//*  13   25:aload_3         
	//*  14   26:invokeinterface #147 <Method boolean Iterator.hasNext()>
	//*  15   31:ifeq            133
		{
			bu bu1 = (bu)iterator.next();
	//   16   34:aload_3         
	//   17   35:invokeinterface #150 <Method Object Iterator.next()>
	//   18   40:checkcast       #152 <Class bu>
	//   19   43:astore          4
			((List) (arraylist)).add(((Object) (bu1)));
	//   20   45:aload_2         
	//   21   46:aload           4
	//   22   48:invokeinterface #158 <Method boolean List.add(Object)>
	//   23   53:pop             
			collection.remove(((Object) (bu1)));
	//   24   54:aload_1         
	//   25   55:aload           4
	//   26   57:invokeinterface #161 <Method boolean Collection.remove(Object)>
	//   27   62:pop             
			s = c;
	//   28   63:getstatic       #32  <Field String c>
	//   29   66:astore          5
			stringbuilder = new StringBuilder();
	//   30   68:new             #163 <Class StringBuilder>
	//   31   71:dup             
	//   32   72:invokespecial   #164 <Method void StringBuilder()>
	//   33   75:astore          6
			stringbuilder.append("Event dispatched: ");
	//   34   77:aload           6
	//   35   79:ldc1            #166 <String "Event dispatched: ">
	//   36   81:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   37   84:pop             
			stringbuilder.append(bu1.forJsonPut());
	//   38   85:aload           6
	//   39   87:aload           4
	//   40   89:invokeinterface #173 <Method Object bu.forJsonPut()>
	//   41   94:invokevirtual   #176 <Method StringBuilder StringBuilder.append(Object)>
	//   42   97:pop             
			stringbuilder.append(" with uid: ");
	//   43   98:aload           6
	//   44  100:ldc1            #178 <String " with uid: ">
	//   45  102:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   46  105:pop             
			stringbuilder.append(bu1.d());
	//   47  106:aload           6
	//   48  108:aload           4
	//   49  110:invokeinterface #180 <Method String bu.d()>
	//   50  115:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   51  118:pop             
		}

	//   52  119:aload           5
	//   53  121:aload           6
	//   54  123:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   55  126:invokestatic    #184 <Method int AppboyLogger.d(String, String)>
	//   56  129:pop             
	//*  57  130:goto            25
		bt bt1 = new bt(((java.util.Set) (new HashSet(((Collection) (arraylist))))));
	//   58  133:new             #186 <Class bt>
	//   59  136:dup             
	//   60  137:new             #188 <Class HashSet>
	//   61  140:dup             
	//   62  141:aload_2         
	//   63  142:invokespecial   #191 <Method void HashSet(Collection)>
	//   64  145:invokespecial   #194 <Method void bt(java.util.Set)>
	//   65  148:astore_1        
		this;
	//   66  149:aload_0         
		JVM INSTR monitorexit ;
	//   67  150:monitorexit     
		return bt1;
	//   68  151:aload_1         
	//   69  152:areturn         
		Exception exception;
		exception;
	//   70  153:astore_1        
	//*  71  154:aload_0         
		throw exception;
	//   72  155:monitorexit     
	//   73  156:aload_1         
	//   74  157:athrow          
	}

	public void a(bu bu1)
	{
		if(bu1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			AppboyLogger.w(c, "Tried to add null AppboyEvent to dispatch.");
	//    2    4:getstatic       #32  <Field String c>
	//    3    7:ldc1            #197 <String "Tried to add null AppboyEvent to dispatch.">
	//    4    9:invokestatic    #200 <Method int AppboyLogger.w(String, String)>
	//    5   12:pop             
			return;
	//    6   13:return          
		} else
		{
			a.putIfAbsent(((Object) (bu1.d())), ((Object) (bu1)));
	//    7   14:aload_0         
	//    8   15:getfield        #55  <Field ConcurrentHashMap a>
	//    9   18:aload_1         
	//   10   19:invokeinterface #180 <Method String bu.d()>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #204 <Method Object ConcurrentHashMap.putIfAbsent(Object, Object)>
	//   13   28:pop             
			return;
	//   14   29:return          
		}
	}

	public void a(ca ca)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = b.isEmpty();
	//    2    2:aload_0         
	//    3    3:getfield        #57  <Field ConcurrentHashMap b>
	//    4    6:invokevirtual   #208 <Method boolean ConcurrentHashMap.isEmpty()>
	//    5    9:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_17;
	//    6   10:iload_2         
	//    7   11:ifeq            17
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		AppboyLogger.d(c, "Flushing pending events to dispatcher map");
	//   11   17:getstatic       #32  <Field String c>
	//   12   20:ldc1            #210 <String "Flushing pending events to dispatcher map">
	//   13   22:invokestatic    #184 <Method int AppboyLogger.d(String, String)>
	//   14   25:pop             
		for(Iterator iterator = b.values().iterator(); iterator.hasNext(); ((bu)iterator.next()).a(ca));
	//   15   26:aload_0         
	//   16   27:getfield        #57  <Field ConcurrentHashMap b>
	//   17   30:invokevirtual   #132 <Method Collection ConcurrentHashMap.values()>
	//   18   33:invokeinterface #141 <Method Iterator Collection.iterator()>
	//   19   38:astore_3        
	//   20   39:aload_3         
	//   21   40:invokeinterface #147 <Method boolean Iterator.hasNext()>
	//   22   45:ifeq            66
	//   23   48:aload_3         
	//   24   49:invokeinterface #150 <Method Object Iterator.next()>
	//   25   54:checkcast       #152 <Class bu>
	//   26   57:aload_1         
	//   27   58:invokeinterface #212 <Method void bu.a(ca)>
	//*  28   63:goto            39
		a.putAll(((java.util.Map) (b)));
	//   29   66:aload_0         
	//   30   67:getfield        #55  <Field ConcurrentHashMap a>
	//   31   70:aload_0         
	//   32   71:getfield        #57  <Field ConcurrentHashMap b>
	//   33   74:invokevirtual   #216 <Method void ConcurrentHashMap.putAll(java.util.Map)>
		b.clear();
	//   34   77:aload_0         
	//   35   78:getfield        #57  <Field ConcurrentHashMap b>
	//   36   81:invokevirtual   #219 <Method void ConcurrentHashMap.clear()>
		this;
	//   37   84:aload_0         
		JVM INSTR monitorexit ;
	//   38   85:monitorexit     
		return;
	//   39   86:return          
		ca;
	//   40   87:astore_1        
	//*  41   88:aload_0         
		throw ca;
	//   42   89:monitorexit     
	//   43   90:aload_1         
	//   44   91:athrow          
	}

	public void a(co co1)
	{
		if(co1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          74
		{
			if(d())
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #221 <Method boolean d()>
	//*   4    8:ifeq            21
			{
				AppboyLogger.i(c, "Network requests are offline, not adding request to queue.");
	//    5   11:getstatic       #32  <Field String c>
	//    6   14:ldc1            #223 <String "Network requests are offline, not adding request to queue.">
	//    7   16:invokestatic    #226 <Method int AppboyLogger.i(String, String)>
	//    8   19:pop             
				return;
	//    9   20:return          
			} else
			{
				String s = c;
	//   10   21:getstatic       #32  <Field String c>
	//   11   24:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   12   25:new             #163 <Class StringBuilder>
	//   13   28:dup             
	//   14   29:invokespecial   #164 <Method void StringBuilder()>
	//   15   32:astore_3        
				stringbuilder.append("Adding request to dispatcher with parameters: ");
	//   16   33:aload_3         
	//   17   34:ldc1            #228 <String "Adding request to dispatcher with parameters: ">
	//   18   36:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
				stringbuilder.append(dt.a(co1.g()));
	//   20   40:aload_3         
	//   21   41:aload_1         
	//   22   42:invokeinterface #231 <Method org.json.JSONObject co.g()>
	//   23   47:invokestatic    #236 <Method String dt.a(org.json.JSONObject)>
	//   24   50:invokevirtual   #170 <Method StringBuilder StringBuilder.append(String)>
	//   25   53:pop             
				AppboyLogger.i(s, stringbuilder.toString(), false);
	//   26   54:aload_2         
	//   27   55:aload_3         
	//   28   56:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   29   59:iconst_0        
	//   30   60:invokestatic    #239 <Method int AppboyLogger.i(String, String, boolean)>
	//   31   63:pop             
				f.add(((Object) (co1)));
	//   32   64:aload_0         
	//   33   65:getfield        #48  <Field LinkedBlockingQueue f>
	//   34   68:aload_1         
	//   35   69:invokevirtual   #240 <Method boolean LinkedBlockingQueue.add(Object)>
	//   36   72:pop             
				return;
	//   37   73:return          
			}
		} else
		{
			throw new NullPointerException();
	//   38   74:new             #242 <Class NullPointerException>
	//   39   77:dup             
	//   40   78:invokespecial   #243 <Method void NullPointerException()>
	//   41   81:athrow          
		}
	}

	public boolean a()
	{
		return f.isEmpty() ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field LinkedBlockingQueue f>
	//    2    4:invokevirtual   #244 <Method boolean LinkedBlockingQueue.isEmpty()>
	//    3    7:iconst_1        
	//    4    8:ixor            
	//    5    9:ireturn         
	}

	public co b()
	{
		return b((co)f.take());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #48  <Field LinkedBlockingQueue f>
	//    3    5:invokevirtual   #248 <Method Object LinkedBlockingQueue.take()>
	//    4    8:checkcast       #66  <Class co>
	//    5   11:invokevirtual   #251 <Method co b(co)>
	//    6   14:areturn         
	}

	co b(co co1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(co1 == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
	//*   4    6:aload_0         
			return null;
	//    5    7:monitorexit     
	//    6    8:aconst_null     
	//    7    9:areturn         
		boolean flag;
		c(co1);
	//    8   10:aload_0         
	//    9   11:aload_1         
	//   10   12:invokespecial   #253 <Method void c(co)>
		flag = co1 instanceof cu;
	//   11   15:aload_1         
	//   12   16:instanceof      #255 <Class cu>
	//   13   19:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_28;
	//   14   20:iload_2         
	//   15   21:ifeq            28
		this;
	//   16   24:aload_0         
		JVM INSTR monitorexit ;
	//   17   25:monitorexit     
		return co1;
	//   18   26:aload_1         
	//   19   27:areturn         
		if((co1 instanceof cm) || (co1 instanceof cn))
	//*  20   28:aload_1         
	//*  21   29:instanceof      #257 <Class cm>
	//*  22   32:ifne            54
	//*  23   35:aload_1         
	//*  24   36:instanceof      #259 <Class cn>
	//*  25   39:ifeq            45
			break MISSING_BLOCK_LABEL_54;
	//   26   42:goto            54
		d(co1);
	//   27   45:aload_0         
	//   28   46:aload_1         
	//   29   47:invokespecial   #261 <Method void d(co)>
		this;
	//   30   50:aload_0         
		JVM INSTR monitorexit ;
	//   31   51:monitorexit     
		return co1;
	//   32   52:aload_1         
	//   33   53:areturn         
		this;
	//   34   54:aload_0         
		JVM INSTR monitorexit ;
	//   35   55:monitorexit     
		return co1;
	//   36   56:aload_1         
	//   37   57:areturn         
		co1;
	//   38   58:astore_1        
	//*  39   59:aload_0         
		throw co1;
	//   40   60:monitorexit     
	//   41   61:aload_1         
	//   42   62:athrow          
	}

	public void b(bu bu1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(bu1 != null)
			break MISSING_BLOCK_LABEL_19;
	//    2    2:aload_1         
	//    3    3:ifnonnull       19
		AppboyLogger.w(c, "Tried to add null AppboyEvent to pending dispatch.");
	//    4    6:getstatic       #32  <Field String c>
	//    5    9:ldc2            #264 <String "Tried to add null AppboyEvent to pending dispatch.">
	//    6   12:invokestatic    #200 <Method int AppboyLogger.w(String, String)>
	//    7   15:pop             
		this;
	//    8   16:aload_0         
		JVM INSTR monitorexit ;
	//    9   17:monitorexit     
		return;
	//   10   18:return          
		b.putIfAbsent(((Object) (bu1.d())), ((Object) (bu1)));
	//   11   19:aload_0         
	//   12   20:getfield        #57  <Field ConcurrentHashMap b>
	//   13   23:aload_1         
	//   14   24:invokeinterface #180 <Method String bu.d()>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #204 <Method Object ConcurrentHashMap.putIfAbsent(Object, Object)>
	//   17   33:pop             
		this;
	//   18   34:aload_0         
		JVM INSTR monitorexit ;
	//   19   35:monitorexit     
		return;
	//   20   36:return          
		bu1;
	//   21   37:astore_1        
	//*  22   38:aload_0         
		throw bu1;
	//   23   39:monitorexit     
	//   24   40:aload_1         
	//   25   41:athrow          
	}

	public co c()
	{
		co co1 = (co)f.poll();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field LinkedBlockingQueue f>
	//    2    4:invokevirtual   #267 <Method Object LinkedBlockingQueue.poll()>
	//    3    7:checkcast       #66  <Class co>
	//    4   10:astore_1        
		if(co1 != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          21
			b(co1);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #251 <Method co b(co)>
	//   10   20:pop             
		return co1;
	//   11   21:aload_1         
	//   12   22:areturn         
	}

	boolean d()
	{
		return Appboy.getOutboundNetworkRequestsOffline();
	//    0    0:invokestatic    #272 <Method boolean Appboy.getOutboundNetworkRequestsOffline()>
	//    1    3:ireturn         
	}

	private static final String c = AppboyLogger.getAppboyLogTag(bo/app/o);
	final ConcurrentHashMap a = new ConcurrentHashMap();
	final ConcurrentHashMap b = new ConcurrentHashMap();
	private final bm d;
	private final dj e;
	private final LinkedBlockingQueue f = new LinkedBlockingQueue(1000);
	private final AppboyConfigurationProvider g;

	static 
	{
	//    0    0:ldc1            #2   <Class o>
	//    1    2:invokestatic    #30  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #32  <Field String c>
	//*   3    8:return          
	}
}
