// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;

import com.bumptech.glide.util.Preconditions;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.data:
//			DataRewinder

public class DataRewinderRegistry
{
	static class DefaultRewinder
		implements DataRewinder
	{

		public void cleanup()
		{
		//    0    0:return          
		}

		public Object rewindAndGet()
		{
			return data;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Object data>
		//    2    4:areturn         
		}

		private final Object data;

		public DefaultRewinder(Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			data = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field Object data>
		//    5    9:return          
		}
	}


	public DataRewinderRegistry()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void HashMap()>
	//    6   12:putfield        #29  <Field Map rewinders>
	//    7   15:return          
	}

	public DataRewinder build(Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		DataRewinder.Factory factory1;
		Preconditions.checkNotNull(obj);
	//    2    2:aload_1         
	//    3    3:invokestatic    #37  <Method Object Preconditions.checkNotNull(Object)>
	//    4    6:pop             
		factory1 = (DataRewinder.Factory)rewinders.get(((Object) (obj.getClass())));
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field Map rewinders>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #41  <Method Class Object.getClass()>
	//    9   15:invokeinterface #46  <Method Object Map.get(Object)>
	//   10   20:checkcast       #48  <Class DataRewinder$Factory>
	//   11   23:astore_3        
		DataRewinder.Factory factory = factory1;
	//   12   24:aload_3         
	//   13   25:astore_2        
		if(factory1 != null) goto _L2; else goto _L1
	//   14   26:aload_3         
	//   15   27:ifnonnull       88
_L1:
		Iterator iterator = rewinders.values().iterator();
	//   16   30:aload_0         
	//   17   31:getfield        #29  <Field Map rewinders>
	//   18   34:invokeinterface #52  <Method Collection Map.values()>
	//   19   39:invokeinterface #58  <Method Iterator Collection.iterator()>
	//   20   44:astore          4
_L3:
		factory = factory1;
	//   21   46:aload_3         
	//   22   47:astore_2        
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   23   48:aload           4
	//   24   50:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//   25   55:ifeq            88
		factory = (DataRewinder.Factory)iterator.next();
	//   26   58:aload           4
	//   27   60:invokeinterface #68  <Method Object Iterator.next()>
	//   28   65:checkcast       #48  <Class DataRewinder$Factory>
	//   29   68:astore_2        
		if(!factory.getDataClass().isAssignableFrom(obj.getClass())) goto _L3; else goto _L2
	//   30   69:aload_2         
	//   31   70:invokeinterface #71  <Method Class DataRewinder$Factory.getDataClass()>
	//   32   75:aload_1         
	//   33   76:invokevirtual   #41  <Method Class Object.getClass()>
	//   34   79:invokevirtual   #77  <Method boolean Class.isAssignableFrom(Class)>
	//   35   82:ifeq            115
	//*  36   85:goto            88
_L2:
		factory1 = factory;
	//   37   88:aload_2         
	//   38   89:astore_3        
		if(factory != null)
			break MISSING_BLOCK_LABEL_98;
	//   39   90:aload_2         
	//   40   91:ifnonnull       98
		factory1 = DEFAULT_FACTORY;
	//   41   94:getstatic       #22  <Field DataRewinder$Factory DEFAULT_FACTORY>
	//   42   97:astore_3        
		obj = ((Object) (factory1.build(obj)));
	//   43   98:aload_3         
	//   44   99:aload_1         
	//   45  100:invokeinterface #79  <Method DataRewinder DataRewinder$Factory.build(Object)>
	//   46  105:astore_1        
		this;
	//   47  106:aload_0         
		JVM INSTR monitorexit ;
	//   48  107:monitorexit     
		return ((DataRewinder) (obj));
	//   49  108:aload_1         
	//   50  109:areturn         
		obj;
	//   51  110:astore_1        
	//*  52  111:aload_0         
		throw obj;
	//   53  112:monitorexit     
	//   54  113:aload_1         
	//   55  114:athrow          
	//*  56  115:goto            46
	}

	public void register(DataRewinder.Factory factory)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		rewinders.put(((Object) (factory.getDataClass())), ((Object) (factory)));
	//    2    2:aload_0         
	//    3    3:getfield        #29  <Field Map rewinders>
	//    4    6:aload_1         
	//    5    7:invokeinterface #71  <Method Class DataRewinder$Factory.getDataClass()>
	//    6   12:aload_1         
	//    7   13:invokeinterface #87  <Method Object Map.put(Object, Object)>
	//    8   18:pop             
		this;
	//    9   19:aload_0         
		JVM INSTR monitorexit ;
	//   10   20:monitorexit     
		return;
	//   11   21:return          
		factory;
	//   12   22:astore_1        
	//*  13   23:aload_0         
		throw factory;
	//   14   24:monitorexit     
	//   15   25:aload_1         
	//   16   26:athrow          
	}

	private static final DataRewinder.Factory DEFAULT_FACTORY = new DataRewinder.Factory() {

		public DataRewinder build(Object obj)
		{
			return ((DataRewinder) (new DefaultRewinder(obj)));
		//    0    0:new             #18  <Class DataRewinderRegistry$DefaultRewinder>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #21  <Method void DataRewinderRegistry$DefaultRewinder(Object)>
		//    4    8:areturn         
		}

		public Class getDataClass()
		{
			throw new UnsupportedOperationException("Not implemented");
		//    0    0:new             #27  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #29  <String "Not implemented">
		//    3    6:invokespecial   #32  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

	}
;
	private final Map rewinders = new HashMap();

	static 
	{
	//    0    0:new             #6   <Class DataRewinderRegistry$1>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void DataRewinderRegistry$1()>
	//    3    7:putstatic       #22  <Field DataRewinder$Factory DEFAULT_FACTORY>
	//*   4   10:return          
	}
}
