// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;

public abstract class dk
{

	public dk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void Object()>
	//    6   12:putfield        #27  <Field Object b>
		c = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #29  <Field boolean c>
	//   10   20:return          
	}

	abstract Object a();

	abstract void a(Object obj, boolean flag);

	public Object b()
	{
label0:
		{
			synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Object b>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(!c)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field boolean c>
	//    7   11:ifeq            28
				AppboyLogger.d(a, "Received call to export dirty object, but the cache was already locked.", false);
	//    8   14:getstatic       #21  <Field String a>
	//    9   17:ldc1            #35  <String "Received call to export dirty object, but the cache was already locked.">
	//   10   19:iconst_0        
	//   11   20:invokestatic    #39  <Method int AppboyLogger.d(String, String, boolean)>
	//   12   23:pop             
			}
	//   13   24:aload_1         
	//   14   25:monitorexit     
			return ((Object) (null));
	//   15   26:aconst_null     
	//   16   27:areturn         
		}
		Object obj1;
		c = true;
	//   17   28:aload_0         
	//   18   29:iconst_1        
	//   19   30:putfield        #29  <Field boolean c>
		obj1 = a();
	//   20   33:aload_0         
	//   21   34:invokevirtual   #41  <Method Object a()>
	//   22   37:astore_2        
		obj;
	//   23   38:aload_1         
		JVM INSTR monitorexit ;
	//   24   39:monitorexit     
		return obj1;
	//   25   40:aload_2         
	//   26   41:areturn         
		exception;
	//   27   42:astore_2        
		obj;
	//   28   43:aload_1         
		JVM INSTR monitorexit ;
	//   29   44:monitorexit     
		throw exception;
	//   30   45:aload_2         
	//   31   46:athrow          
	}

	public boolean b(Object obj, boolean flag)
	{
label0:
		{
			synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Object b>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
			{
				if(c)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field boolean c>
	//    7   11:ifne            81
				String s = a;
	//    8   14:getstatic       #21  <Field String a>
	//    9   17:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   10   19:new             #46  <Class StringBuilder>
	//   11   22:dup             
	//   12   23:invokespecial   #47  <Method void StringBuilder()>
	//   13   26:astore          5
				stringbuilder.append("Tried to confirm outboundObject [");
	//   14   28:aload           5
	//   15   30:ldc1            #49  <String "Tried to confirm outboundObject [">
	//   16   32:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
				stringbuilder.append(obj);
	//   18   36:aload           5
	//   19   38:aload_1         
	//   20   39:invokevirtual   #56  <Method StringBuilder StringBuilder.append(Object)>
	//   21   42:pop             
				stringbuilder.append("] with success [");
	//   22   43:aload           5
	//   23   45:ldc1            #58  <String "] with success [">
	//   24   47:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
				stringbuilder.append(flag);
	//   26   51:aload           5
	//   27   53:iload_2         
	//   28   54:invokevirtual   #61  <Method StringBuilder StringBuilder.append(boolean)>
	//   29   57:pop             
				stringbuilder.append("], but the cache wasn't locked, so not doing anything.");
	//   30   58:aload           5
	//   31   60:ldc1            #63  <String "], but the cache wasn't locked, so not doing anything.">
	//   32   62:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   33   65:pop             
				AppboyLogger.w(s, stringbuilder.toString());
	//   34   66:aload           4
	//   35   68:aload           5
	//   36   70:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   37   73:invokestatic    #71  <Method int AppboyLogger.w(String, String)>
	//   38   76:pop             
			}
	//   39   77:aload_3         
	//   40   78:monitorexit     
			return false;
	//   41   79:iconst_0        
	//   42   80:ireturn         
		}
		a(obj, flag);
	//   43   81:aload_0         
	//   44   82:aload_1         
	//   45   83:iload_2         
	//   46   84:invokevirtual   #73  <Method void a(Object, boolean)>
		c = false;
	//   47   87:aload_0         
	//   48   88:iconst_0        
	//   49   89:putfield        #29  <Field boolean c>
		this;
	//   50   92:aload_0         
		JVM INSTR monitorenter ;
	//   51   93:monitorenter    
		AppboyLogger.i(a, "Notifying confirmAndUnlock listeners", false);
	//   52   94:getstatic       #21  <Field String a>
	//   53   97:ldc1            #75  <String "Notifying confirmAndUnlock listeners">
	//   54   99:iconst_0        
	//   55  100:invokestatic    #78  <Method int AppboyLogger.i(String, String, boolean)>
	//   56  103:pop             
		((Object)this).notifyAll();
	//   57  104:aload_0         
	//   58  105:invokevirtual   #81  <Method void Object.notifyAll()>
		this;
	//   59  108:aload_0         
		JVM INSTR monitorexit ;
	//   60  109:monitorexit     
		obj1;
	//   61  110:aload_3         
		JVM INSTR monitorexit ;
	//   62  111:monitorexit     
		return true;
	//   63  112:iconst_1        
	//   64  113:ireturn         
		obj;
	//   65  114:astore_1        
		this;
	//   66  115:aload_0         
		JVM INSTR monitorexit ;
	//   67  116:monitorexit     
		throw obj;
	//   68  117:aload_1         
	//   69  118:athrow          
		obj;
	//   70  119:astore_1        
		obj1;
	//   71  120:aload_3         
		JVM INSTR monitorexit ;
	//   72  121:monitorexit     
		throw obj;
	//   73  122:aload_1         
	//   74  123:athrow          
	}

	public boolean c()
	{
		boolean flag;
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = c;
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field boolean c>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return flag;
	//   10   14:iload_1         
	//   11   15:ireturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/dk);
	private final Object b = new Object();
	private boolean c;

	static 
	{
	//    0    0:ldc1            #2   <Class dk>
	//    1    2:invokestatic    #19  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #21  <Field String a>
	//*   3    8:return          
	}
}
