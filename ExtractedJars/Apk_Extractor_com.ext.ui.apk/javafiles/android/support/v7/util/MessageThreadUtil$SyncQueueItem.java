// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;


// Referenced classes of package android.support.v7.util:
//			MessageThreadUtil

static class MessageThreadUtil$SyncQueueItem
{

	static MessageThreadUtil$SyncQueueItem obtainMessage(int i, int j, int k)
	{
		return obtainMessage(i, j, k, 0, 0, 0, ((Object) (null)));
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:iconst_0        
	//    6    6:aconst_null     
	//    7    7:invokestatic    #39  <Method MessageThreadUtil$SyncQueueItem obtainMessage(int, int, int, int, int, int, Object)>
	//    8   10:areturn         
	}

	static MessageThreadUtil$SyncQueueItem obtainMessage(int i, int j, int k, int l, int i1, int j1, Object obj)
	{
		Object obj1 = sPoolLock;
	//    0    0:getstatic       #27  <Field Object sPoolLock>
	//    1    3:astore          8
		obj1;
	//    2    5:aload           8
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		MessageThreadUtil$SyncQueueItem messagethreadutil$syncqueueitem;
		if(sPool != null)
			break MISSING_BLOCK_LABEL_74;
	//    4    8:getstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
	//    5   11:ifnonnull       74
		messagethreadutil$syncqueueitem = new MessageThreadUtil$SyncQueueItem();
	//    6   14:new             #2   <Class MessageThreadUtil$SyncQueueItem>
	//    7   17:dup             
	//    8   18:invokespecial   #42  <Method void MessageThreadUtil$SyncQueueItem()>
	//    9   21:astore          7
_L1:
		messagethreadutil$syncqueueitem.what = i;
	//   10   23:aload           7
	//   11   25:iload_0         
	//   12   26:putfield        #44  <Field int what>
		messagethreadutil$syncqueueitem.arg1 = j;
	//   13   29:aload           7
	//   14   31:iload_1         
	//   15   32:putfield        #46  <Field int arg1>
		messagethreadutil$syncqueueitem.arg2 = k;
	//   16   35:aload           7
	//   17   37:iload_2         
	//   18   38:putfield        #48  <Field int arg2>
		messagethreadutil$syncqueueitem.arg3 = l;
	//   19   41:aload           7
	//   20   43:iload_3         
	//   21   44:putfield        #50  <Field int arg3>
		messagethreadutil$syncqueueitem.arg4 = i1;
	//   22   47:aload           7
	//   23   49:iload           4
	//   24   51:putfield        #52  <Field int arg4>
		messagethreadutil$syncqueueitem.arg5 = j1;
	//   25   54:aload           7
	//   26   56:iload           5
	//   27   58:putfield        #54  <Field int arg5>
		messagethreadutil$syncqueueitem.data = obj;
	//   28   61:aload           7
	//   29   63:aload           6
	//   30   65:putfield        #56  <Field Object data>
	//*  31   68:aload           8
		return messagethreadutil$syncqueueitem;
	//   32   70:monitorexit     
	//   33   71:aload           7
	//   34   73:areturn         
		messagethreadutil$syncqueueitem = sPool;
	//   35   74:getstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
	//   36   77:astore          7
		sPool = sPool.next;
	//   37   79:getstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
	//   38   82:getfield        #32  <Field MessageThreadUtil$SyncQueueItem next>
	//   39   85:putstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
		messagethreadutil$syncqueueitem.next = null;
	//   40   88:aload           7
	//   41   90:aconst_null     
	//   42   91:putfield        #32  <Field MessageThreadUtil$SyncQueueItem next>
		  goto _L1
	//*  43   94:goto            23
		obj;
	//   44   97:astore          6
		obj1;
	//   45   99:aload           8
		JVM INSTR monitorexit ;
	//   46  101:monitorexit     
		throw obj;
	//   47  102:aload           6
	//   48  104:athrow          
	}

	static MessageThreadUtil$SyncQueueItem obtainMessage(int i, int j, Object obj)
	{
		return obtainMessage(i, j, 0, 0, 0, 0, obj);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:iconst_0        
	//    6    6:aload_2         
	//    7    7:invokestatic    #39  <Method MessageThreadUtil$SyncQueueItem obtainMessage(int, int, int, int, int, int, Object)>
	//    8   10:areturn         
	}

	void recycle()
	{
		next = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #32  <Field MessageThreadUtil$SyncQueueItem next>
		arg5 = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #54  <Field int arg5>
		arg4 = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #52  <Field int arg4>
		arg3 = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #50  <Field int arg3>
		arg2 = 0;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #48  <Field int arg2>
		arg1 = 0;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #46  <Field int arg1>
		what = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #44  <Field int what>
		data = null;
	//   21   35:aload_0         
	//   22   36:aconst_null     
	//   23   37:putfield        #56  <Field Object data>
		synchronized(sPoolLock)
	//*  24   40:getstatic       #27  <Field Object sPoolLock>
	//*  25   43:astore_1        
	//*  26   44:aload_1         
	//*  27   45:monitorenter    
		{
			if(sPool != null)
	//*  28   46:getstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
	//*  29   49:ifnull          59
				next = sPool;
	//   30   52:aload_0         
	//   31   53:getstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
	//   32   56:putfield        #32  <Field MessageThreadUtil$SyncQueueItem next>
			sPool = this;
	//   33   59:aload_0         
	//   34   60:putstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
		}
	//   35   63:aload_1         
	//   36   64:monitorexit     
		return;
	//   37   65:return          
		exception;
	//   38   66:astore_2        
		obj;
	//   39   67:aload_1         
		JVM INSTR monitorexit ;
	//   40   68:monitorexit     
		throw exception;
	//   41   69:aload_2         
	//   42   70:athrow          
	}

	private static MessageThreadUtil$SyncQueueItem sPool;
	private static final Object sPoolLock = new Object();
	public int arg1;
	public int arg2;
	public int arg3;
	public int arg4;
	public int arg5;
	public Object data;
	private MessageThreadUtil$SyncQueueItem next;
	public int what;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void Object()>
	//    3    7:putstatic       #27  <Field Object sPoolLock>
	//*   4   10:return          
	}


/*
	static MessageThreadUtil$SyncQueueItem access$000(MessageThreadUtil$SyncQueueItem messagethreadutil$syncqueueitem)
	{
		return messagethreadutil$syncqueueitem.next;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field MessageThreadUtil$SyncQueueItem next>
	//    2    4:areturn         
	}

*/


/*
	static MessageThreadUtil$SyncQueueItem access$002(MessageThreadUtil$SyncQueueItem messagethreadutil$syncqueueitem, MessageThreadUtil$SyncQueueItem messagethreadutil$syncqueueitem1)
	{
		messagethreadutil$syncqueueitem.next = messagethreadutil$syncqueueitem1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field MessageThreadUtil$SyncQueueItem next>
		return messagethreadutil$syncqueueitem1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/

	MessageThreadUtil$SyncQueueItem()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}
}
