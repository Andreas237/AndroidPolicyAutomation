// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			Document, DocumentView

private class Document$UpdateListenerCollection
	implements Document.UpdateListener
{

	private Document.UpdateListener[] getListenersSnapshot()
	{
_L2:
		Document.UpdateListener aupdatelistener[] = mListenersSnapshot;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Document$UpdateListener[] mListenersSnapshot>
	//    2    4:astore_1        
		if(aupdatelistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return aupdatelistener;
	//    5    9:aload_1         
	//    6   10:areturn         
		this;
	//    7   11:aload_0         
		JVM INSTR monitorenter ;
	//    8   12:monitorenter    
		Document.UpdateListener aupdatelistener1[];
		if(mListenersSnapshot != null)
			break MISSING_BLOCK_LABEL_57;
	//    9   13:aload_0         
	//   10   14:getfield        #33  <Field Document$UpdateListener[] mListenersSnapshot>
	//   11   17:ifnonnull       57
		mListenersSnapshot = (Document.UpdateListener[])mListeners.toArray(((Object []) (new Document.UpdateListener[mListeners.size()])));
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:getfield        #28  <Field List mListeners>
	//   15   25:aload_0         
	//   16   26:getfield        #28  <Field List mListeners>
	//   17   29:invokeinterface #39  <Method int List.size()>
	//   18   34:anewarray       Document.UpdateListener[]
	//   19   37:invokeinterface #43  <Method Object[] List.toArray(Object[])>
	//   20   42:checkcast       #44  <Class Document$UpdateListener[]>
	//   21   45:putfield        #33  <Field Document$UpdateListener[] mListenersSnapshot>
		aupdatelistener1 = mListenersSnapshot;
	//   22   48:aload_0         
	//   23   49:getfield        #33  <Field Document$UpdateListener[] mListenersSnapshot>
	//   24   52:astore_1        
		this;
	//   25   53:aload_0         
		JVM INSTR monitorexit ;
	//   26   54:monitorexit     
		return aupdatelistener1;
	//   27   55:aload_1         
	//   28   56:areturn         
		this;
	//   29   57:aload_0         
		JVM INSTR monitorexit ;
	//   30   58:monitorexit     
		if(true) goto _L2; else goto _L1
	//   31   59:goto            0
_L1:
		Exception exception;
		exception;
	//   32   62:astore_1        
		this;
	//   33   63:aload_0         
		JVM INSTR monitorexit ;
	//   34   64:monitorexit     
		throw exception;
	//   35   65:aload_1         
	//   36   66:athrow          
	}

	public void add(Document.UpdateListener updatelistener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mListeners.add(((Object) (updatelistener)));
	//    2    2:aload_0         
	//    3    3:getfield        #28  <Field List mListeners>
	//    4    6:aload_1         
	//    5    7:invokeinterface #49  <Method boolean List.add(Object)>
	//    6   12:pop             
		mListenersSnapshot = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #33  <Field Document$UpdateListener[] mListenersSnapshot>
		this;
	//   10   18:aload_0         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		updatelistener;
	//   13   21:astore_1        
	//*  14   22:aload_0         
		throw updatelistener;
	//   15   23:monitorexit     
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public void clear()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mListeners.clear();
	//    2    2:aload_0         
	//    3    3:getfield        #28  <Field List mListeners>
	//    4    6:invokeinterface #52  <Method void List.clear()>
		mListenersSnapshot = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #33  <Field Document$UpdateListener[] mListenersSnapshot>
		this;
	//    8   16:aload_0         
		JVM INSTR monitorexit ;
	//    9   17:monitorexit     
		return;
	//   10   18:return          
		Exception exception;
		exception;
	//   11   19:astore_1        
	//*  12   20:aload_0         
		throw exception;
	//   13   21:monitorexit     
	//   14   22:aload_1         
	//   15   23:athrow          
	}

	public void onAttributeModified(Object obj, String s, String s1)
	{
		Document.UpdateListener aupdatelistener[] = getListenersSnapshot();
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method Document$UpdateListener[] getListenersSnapshot()>
	//    2    4:astore          6
		int j = aupdatelistener.length;
	//    3    6:aload           6
	//    4    8:arraylength     
	//    5    9:istore          5
		for(int i = 0; i < j; i++)
	//*   6   11:iconst_0        
	//*   7   12:istore          4
	//*   8   14:iload           4
	//*   9   16:iload           5
	//*  10   18:icmpge          43
			aupdatelistener[i].onAttributeModified(obj, s, s1);
	//   11   21:aload           6
	//   12   23:iload           4
	//   13   25:aaload          
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:aload_3         
	//   17   29:invokeinterface #58  <Method void Document$UpdateListener.onAttributeModified(Object, String, String)>

	//   18   34:iload           4
	//   19   36:iconst_1        
	//   20   37:iadd            
	//   21   38:istore          4
	//*  22   40:goto            14
	//   23   43:return          
	}

	public void onAttributeRemoved(Object obj, String s)
	{
		Document.UpdateListener aupdatelistener[] = getListenersSnapshot();
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method Document$UpdateListener[] getListenersSnapshot()>
	//    2    4:astore          5
		int j = aupdatelistener.length;
	//    3    6:aload           5
	//    4    8:arraylength     
	//    5    9:istore          4
		for(int i = 0; i < j; i++)
	//*   6   11:iconst_0        
	//*   7   12:istore_3        
	//*   8   13:iload_3         
	//*   9   14:iload           4
	//*  10   16:icmpge          37
			aupdatelistener[i].onAttributeRemoved(obj, s);
	//   11   19:aload           5
	//   12   21:iload_3         
	//   13   22:aaload          
	//   14   23:aload_1         
	//   15   24:aload_2         
	//   16   25:invokeinterface #62  <Method void Document$UpdateListener.onAttributeRemoved(Object, String)>

	//   17   30:iload_3         
	//   18   31:iconst_1        
	//   19   32:iadd            
	//   20   33:istore_3        
	//*  21   34:goto            13
	//   22   37:return          
	}

	public void onChildNodeInserted(DocumentView documentview, Object obj, int i, int j, Accumulator accumulator)
	{
		Document.UpdateListener aupdatelistener[] = getListenersSnapshot();
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method Document$UpdateListener[] getListenersSnapshot()>
	//    2    4:astore          8
		int l = aupdatelistener.length;
	//    3    6:aload           8
	//    4    8:arraylength     
	//    5    9:istore          7
		for(int k = 0; k < l; k++)
	//*   6   11:iconst_0        
	//*   7   12:istore          6
	//*   8   14:iload           6
	//*   9   16:iload           7
	//*  10   18:icmpge          47
			aupdatelistener[k].onChildNodeInserted(documentview, obj, i, j, accumulator);
	//   11   21:aload           8
	//   12   23:iload           6
	//   13   25:aaload          
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:iload_3         
	//   17   29:iload           4
	//   18   31:aload           5
	//   19   33:invokeinterface #66  <Method void Document$UpdateListener.onChildNodeInserted(DocumentView, Object, int, int, Accumulator)>

	//   20   38:iload           6
	//   21   40:iconst_1        
	//   22   41:iadd            
	//   23   42:istore          6
	//*  24   44:goto            14
	//   25   47:return          
	}

	public void onChildNodeRemoved(int i, int j)
	{
		Document.UpdateListener aupdatelistener[] = getListenersSnapshot();
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method Document$UpdateListener[] getListenersSnapshot()>
	//    2    4:astore          5
		int l = aupdatelistener.length;
	//    3    6:aload           5
	//    4    8:arraylength     
	//    5    9:istore          4
		for(int k = 0; k < l; k++)
	//*   6   11:iconst_0        
	//*   7   12:istore_3        
	//*   8   13:iload_3         
	//*   9   14:iload           4
	//*  10   16:icmpge          37
			aupdatelistener[k].onChildNodeRemoved(i, j);
	//   11   19:aload           5
	//   12   21:iload_3         
	//   13   22:aaload          
	//   14   23:iload_1         
	//   15   24:iload_2         
	//   16   25:invokeinterface #72  <Method void Document$UpdateListener.onChildNodeRemoved(int, int)>

	//   17   30:iload_3         
	//   18   31:iconst_1        
	//   19   32:iadd            
	//   20   33:istore_3        
	//*  21   34:goto            13
	//   22   37:return          
	}

	public void onInspectRequested(Object obj)
	{
		Document.UpdateListener aupdatelistener[] = getListenersSnapshot();
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method Document$UpdateListener[] getListenersSnapshot()>
	//    2    4:astore          4
		int j = aupdatelistener.length;
	//    3    6:aload           4
	//    4    8:arraylength     
	//    5    9:istore_3        
		for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          34
			aupdatelistener[i].onInspectRequested(obj);
	//   11   17:aload           4
	//   12   19:iload_2         
	//   13   20:aaload          
	//   14   21:aload_1         
	//   15   22:invokeinterface #76  <Method void Document$UpdateListener.onInspectRequested(Object)>

	//   16   27:iload_2         
	//   17   28:iconst_1        
	//   18   29:iadd            
	//   19   30:istore_2        
	//*  20   31:goto            12
	//   21   34:return          
	}

	public void remove(Document.UpdateListener updatelistener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mListeners.remove(((Object) (updatelistener)));
	//    2    2:aload_0         
	//    3    3:getfield        #28  <Field List mListeners>
	//    4    6:aload_1         
	//    5    7:invokeinterface #79  <Method boolean List.remove(Object)>
	//    6   12:pop             
		mListenersSnapshot = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #33  <Field Document$UpdateListener[] mListenersSnapshot>
		this;
	//   10   18:aload_0         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		updatelistener;
	//   13   21:astore_1        
	//*  14   22:aload_0         
		throw updatelistener;
	//   15   23:monitorexit     
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	private final List mListeners = new ArrayList();
	private volatile Document.UpdateListener mListenersSnapshot[];
	final Document this$0;

	public Document$UpdateListenerCollection()
	{
		this$0 = Document.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Document this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:aload_0         
	//    6   10:new             #25  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #26  <Method void ArrayList()>
	//    9   17:putfield        #28  <Field List mListeners>
	//   10   20:return          
	}
}
