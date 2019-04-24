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
		if(sPool == null)
	//*   4    8:getstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
	//*   5   11:ifnonnull       26
		{
			messagethreadutil$syncqueueitem = new MessageThreadUtil$SyncQueueItem();
	//    6   14:new             #2   <Class MessageThreadUtil$SyncQueueItem>
	//    7   17:dup             
	//    8   18:invokespecial   #42  <Method void MessageThreadUtil$SyncQueueItem()>
	//    9   21:astore          7
			break MISSING_BLOCK_LABEL_46;
	//   10   23:goto            46
		}
		messagethreadutil$syncqueueitem = sPool;
	//   11   26:getstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
	//   12   29:astore          7
		sPool = sPool.next;
	//   13   31:getstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
	//   14   34:getfield        #32  <Field MessageThreadUtil$SyncQueueItem next>
	//   15   37:putstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
		messagethreadutil$syncqueueitem.next = null;
	//   16   40:aload           7
	//   17   42:aconst_null     
	//   18   43:putfield        #32  <Field MessageThreadUtil$SyncQueueItem next>
		messagethreadutil$syncqueueitem.what = i;
	//   19   46:aload           7
	//   20   48:iload_0         
	//   21   49:putfield        #44  <Field int what>
		messagethreadutil$syncqueueitem.arg1 = j;
	//   22   52:aload           7
	//   23   54:iload_1         
	//   24   55:putfield        #46  <Field int arg1>
		messagethreadutil$syncqueueitem.arg2 = k;
	//   25   58:aload           7
	//   26   60:iload_2         
	//   27   61:putfield        #48  <Field int arg2>
		messagethreadutil$syncqueueitem.arg3 = l;
	//   28   64:aload           7
	//   29   66:iload_3         
	//   30   67:putfield        #50  <Field int arg3>
		messagethreadutil$syncqueueitem.arg4 = i1;
	//   31   70:aload           7
	//   32   72:iload           4
	//   33   74:putfield        #52  <Field int arg4>
		messagethreadutil$syncqueueitem.arg5 = j1;
	//   34   77:aload           7
	//   35   79:iload           5
	//   36   81:putfield        #54  <Field int arg5>
		messagethreadutil$syncqueueitem.data = obj;
	//   37   84:aload           7
	//   38   86:aload           6
	//   39   88:putfield        #56  <Field Object data>
		obj1;
	//   40   91:aload           8
		JVM INSTR monitorexit ;
	//   41   93:monitorexit     
		return messagethreadutil$syncqueueitem;
	//   42   94:aload           7
	//   43   96:areturn         
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
