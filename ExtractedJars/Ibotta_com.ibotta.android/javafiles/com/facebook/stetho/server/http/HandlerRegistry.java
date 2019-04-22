// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server.http;

import java.util.ArrayList;

// Referenced classes of package com.facebook.stetho.server.http:
//			PathMatcher, HttpHandler

public class HandlerRegistry
{

	public HandlerRegistry()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #15  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void ArrayList()>
	//    6   12:putfield        #18  <Field ArrayList mPathMatchers>
	//    7   15:aload_0         
	//    8   16:new             #15  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #16  <Method void ArrayList()>
	//   11   23:putfield        #20  <Field ArrayList mHttpHandlers>
	//   12   26:return          
	}

	public HttpHandler lookup(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		int j = mPathMatchers.size();
	//    4    4:aload_0         
	//    5    5:getfield        #18  <Field ArrayList mPathMatchers>
	//    6    8:invokevirtual   #28  <Method int ArrayList.size()>
	//    7   11:istore_3        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//    8   12:iload_2         
	//    9   13:iload_3         
	//   10   14:icmpge          60
		if(!((PathMatcher)mPathMatchers.get(i)).match(s))
			break MISSING_BLOCK_LABEL_53;
	//   11   17:aload_0         
	//   12   18:getfield        #18  <Field ArrayList mPathMatchers>
	//   13   21:iload_2         
	//   14   22:invokevirtual   #32  <Method Object ArrayList.get(int)>
	//   15   25:checkcast       #34  <Class PathMatcher>
	//   16   28:aload_1         
	//   17   29:invokeinterface #38  <Method boolean PathMatcher.match(String)>
	//   18   34:ifeq            53
		s = ((String) ((HttpHandler)mHttpHandlers.get(i)));
	//   19   37:aload_0         
	//   20   38:getfield        #20  <Field ArrayList mHttpHandlers>
	//   21   41:iload_2         
	//   22   42:invokevirtual   #32  <Method Object ArrayList.get(int)>
	//   23   45:checkcast       #40  <Class HttpHandler>
	//   24   48:astore_1        
		this;
	//   25   49:aload_0         
		JVM INSTR monitorexit ;
	//   26   50:monitorexit     
		return ((HttpHandler) (s));
	//   27   51:aload_1         
	//   28   52:areturn         
		i++;
	//   29   53:iload_2         
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore_2        
		if(true) goto _L2; else goto _L1
	//   33   57:goto            12
	//*  34   60:aload_0         
_L1:
		return null;
	//   35   61:monitorexit     
	//   36   62:aconst_null     
	//   37   63:areturn         
		s;
	//   38   64:astore_1        
	//*  39   65:aload_0         
		throw s;
	//   40   66:monitorexit     
	//   41   67:aload_1         
	//   42   68:athrow          
	}

	public void register(PathMatcher pathmatcher, HttpHandler httphandler)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mPathMatchers.add(((Object) (pathmatcher)));
	//    2    2:aload_0         
	//    3    3:getfield        #18  <Field ArrayList mPathMatchers>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #47  <Method boolean ArrayList.add(Object)>
	//    6   10:pop             
		mHttpHandlers.add(((Object) (httphandler)));
	//    7   11:aload_0         
	//    8   12:getfield        #20  <Field ArrayList mHttpHandlers>
	//    9   15:aload_2         
	//   10   16:invokevirtual   #47  <Method boolean ArrayList.add(Object)>
	//   11   19:pop             
		this;
	//   12   20:aload_0         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		return;
	//   14   22:return          
		pathmatcher;
	//   15   23:astore_1        
	//*  16   24:aload_0         
		throw pathmatcher;
	//   17   25:monitorexit     
	//   18   26:aload_1         
	//   19   27:athrow          
	}

	public boolean unregister(PathMatcher pathmatcher, HttpHandler httphandler)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = mPathMatchers.indexOf(((Object) (pathmatcher)));
	//    2    2:aload_0         
	//    3    3:getfield        #18  <Field ArrayList mPathMatchers>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #53  <Method int ArrayList.indexOf(Object)>
	//    6   10:istore_3        
		if(i < 0)
			break MISSING_BLOCK_LABEL_49;
	//    7   11:iload_3         
	//    8   12:iflt            49
		if(httphandler != mHttpHandlers.get(i))
			break MISSING_BLOCK_LABEL_49;
	//    9   15:aload_2         
	//   10   16:aload_0         
	//   11   17:getfield        #20  <Field ArrayList mHttpHandlers>
	//   12   20:iload_3         
	//   13   21:invokevirtual   #32  <Method Object ArrayList.get(int)>
	//   14   24:if_acmpne       49
		mPathMatchers.remove(i);
	//   15   27:aload_0         
	//   16   28:getfield        #18  <Field ArrayList mPathMatchers>
	//   17   31:iload_3         
	//   18   32:invokevirtual   #56  <Method Object ArrayList.remove(int)>
	//   19   35:pop             
		mHttpHandlers.remove(i);
	//   20   36:aload_0         
	//   21   37:getfield        #20  <Field ArrayList mHttpHandlers>
	//   22   40:iload_3         
	//   23   41:invokevirtual   #56  <Method Object ArrayList.remove(int)>
	//   24   44:pop             
	//*  25   45:aload_0         
	//*  26   46:monitorexit     
		return true;
	//   27   47:iconst_1        
	//   28   48:ireturn         
		this;
	//   29   49:aload_0         
		JVM INSTR monitorexit ;
	//   30   50:monitorexit     
		return false;
	//   31   51:iconst_0        
	//   32   52:ireturn         
		pathmatcher;
	//   33   53:astore_1        
	//*  34   54:aload_0         
		throw pathmatcher;
	//   35   55:monitorexit     
	//   36   56:aload_1         
	//   37   57:athrow          
	}

	private final ArrayList mHttpHandlers = new ArrayList();
	private final ArrayList mPathMatchers = new ArrayList();
}
