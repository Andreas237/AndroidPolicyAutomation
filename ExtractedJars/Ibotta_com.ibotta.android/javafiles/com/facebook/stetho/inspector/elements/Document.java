// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import android.os.SystemClock;
import com.facebook.stetho.common.*;
import com.facebook.stetho.inspector.helper.ObjectIdMapper;
import com.facebook.stetho.inspector.helper.ThreadBoundProxy;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			DocumentProvider, ShadowDocument, NodeDescriptor, ElementInfo, 
//			DocumentProviderFactory, DocumentView, StyleAccumulator, AttributeAccumulator, 
//			DocumentProviderListener

public final class Document extends ThreadBoundProxy
{
	public static final class AttributeListAccumulator extends ArrayList
		implements AttributeAccumulator
	{

		public void store(String s, String s1)
		{
			add(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #21  <Method boolean add(Object)>
		//    3    5:pop             
			add(((Object) (s1)));
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #21  <Method boolean add(Object)>
		//    7   11:pop             
		//    8   12:return          
		}

		public AttributeListAccumulator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void ArrayList()>
		//    2    4:return          
		}
	}

	private final class ChildEventingList extends ArrayList
	{

		public void acquire(Object obj, DocumentView documentview)
		{
			mParentElement = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field Object mParentElement>
			int i;
			if(mParentElement == null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #25  <Field Object mParentElement>
		//*   5    9:ifnonnull       17
				i = -1;
		//    6   12:iconst_m1       
		//    7   13:istore_3        
			else
		//*   8   14:goto            35
				i = mObjectIdMapper.getIdForObject(mParentElement).intValue();
		//    9   17:aload_0         
		//   10   18:getfield        #20  <Field Document this$0>
		//   11   21:invokestatic    #37  <Method ObjectIdMapper Document.access$500(Document)>
		//   12   24:aload_0         
		//   13   25:getfield        #25  <Field Object mParentElement>
		//   14   28:invokevirtual   #43  <Method Integer ObjectIdMapper.getIdForObject(Object)>
		//   15   31:invokevirtual   #49  <Method int Integer.intValue()>
		//   16   34:istore_3        
			mParentNodeId = i;
		//   17   35:aload_0         
		//   18   36:iload_3         
		//   19   37:putfield        #27  <Field int mParentNodeId>
			mDocumentView = documentview;
		//   20   40:aload_0         
		//   21   41:aload_2         
		//   22   42:putfield        #51  <Field DocumentView mDocumentView>
		//   23   45:return          
		}

		public void addWithEvent(int i, Object obj, Accumulator accumulator)
		{
			Object obj1;
			if(i == 0)
		//*   0    0:iload_1         
		//*   1    1:ifne            10
				obj1 = null;
		//    2    4:aconst_null     
		//    3    5:astore          5
			else
		//*   4    7:goto            19
				obj1 = get(i - 1);
		//    5   10:aload_0         
		//    6   11:iload_1         
		//    7   12:iconst_1        
		//    8   13:isub            
		//    9   14:invokevirtual   #57  <Method Object get(int)>
		//   10   17:astore          5
			int j;
			if(obj1 == null)
		//*  11   19:aload           5
		//*  12   21:ifnonnull       30
				j = -1;
		//   13   24:iconst_m1       
		//   14   25:istore          4
			else
		//*  15   27:goto            47
				j = mObjectIdMapper.getIdForObject(obj1).intValue();
		//   16   30:aload_0         
		//   17   31:getfield        #20  <Field Document this$0>
		//   18   34:invokestatic    #37  <Method ObjectIdMapper Document.access$500(Document)>
		//   19   37:aload           5
		//   20   39:invokevirtual   #43  <Method Integer ObjectIdMapper.getIdForObject(Object)>
		//   21   42:invokevirtual   #49  <Method int Integer.intValue()>
		//   22   45:istore          4
			add(i, obj);
		//   23   47:aload_0         
		//   24   48:iload_1         
		//   25   49:aload_2         
		//   26   50:invokevirtual   #61  <Method void add(int, Object)>
			mUpdateListeners.onChildNodeInserted(mDocumentView, obj, mParentNodeId, j, accumulator);
		//   27   53:aload_0         
		//   28   54:getfield        #20  <Field Document this$0>
		//   29   57:invokestatic    #65  <Method Document$UpdateListenerCollection Document.access$700(Document)>
		//   30   60:aload_0         
		//   31   61:getfield        #51  <Field DocumentView mDocumentView>
		//   32   64:aload_2         
		//   33   65:aload_0         
		//   34   66:getfield        #27  <Field int mParentNodeId>
		//   35   69:iload           4
		//   36   71:aload_3         
		//   37   72:invokevirtual   #71  <Method void Document$UpdateListenerCollection.onChildNodeInserted(DocumentView, Object, int, int, Accumulator)>
		//   38   75:return          
		}

		public void release()
		{
			clear();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #77  <Method void clear()>
			mParentElement = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #25  <Field Object mParentElement>
			mParentNodeId = -1;
		//    5    9:aload_0         
		//    6   10:iconst_m1       
		//    7   11:putfield        #27  <Field int mParentNodeId>
			mDocumentView = null;
		//    8   14:aload_0         
		//    9   15:aconst_null     
		//   10   16:putfield        #51  <Field DocumentView mDocumentView>
		//   11   19:return          
		}

		public void removeWithEvent(int i)
		{
			Object obj = remove(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #82  <Method Object remove(int)>
		//    3    5:astore_2        
			i = mObjectIdMapper.getIdForObject(obj).intValue();
		//    4    6:aload_0         
		//    5    7:getfield        #20  <Field Document this$0>
		//    6   10:invokestatic    #37  <Method ObjectIdMapper Document.access$500(Document)>
		//    7   13:aload_2         
		//    8   14:invokevirtual   #43  <Method Integer ObjectIdMapper.getIdForObject(Object)>
		//    9   17:invokevirtual   #49  <Method int Integer.intValue()>
		//   10   20:istore_1        
			mUpdateListeners.onChildNodeRemoved(mParentNodeId, i);
		//   11   21:aload_0         
		//   12   22:getfield        #20  <Field Document this$0>
		//   13   25:invokestatic    #65  <Method Document$UpdateListenerCollection Document.access$700(Document)>
		//   14   28:aload_0         
		//   15   29:getfield        #27  <Field int mParentNodeId>
		//   16   32:iload_1         
		//   17   33:invokevirtual   #86  <Method void Document$UpdateListenerCollection.onChildNodeRemoved(int, int)>
		//   18   36:return          
		}

		private DocumentView mDocumentView;
		private Object mParentElement;
		private int mParentNodeId;
		final Document this$0;

		private ChildEventingList()
		{
			this$0 = Document.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field Document this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void ArrayList()>
			mParentElement = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #25  <Field Object mParentElement>
			mParentNodeId = -1;
		//    8   14:aload_0         
		//    9   15:iconst_m1       
		//   10   16:putfield        #27  <Field int mParentNodeId>
		//   11   19:return          
		}

	}

	private final class DocumentObjectIdMapper extends ObjectIdMapper
	{

		protected void onMapped(Object obj, int i)
		{
			verifyThreadAccess();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field Document this$0>
		//    2    4:invokevirtual   #25  <Method void Document.verifyThreadAccess()>
			mDocumentProvider.getNodeDescriptor(obj).hook(obj);
		//    3    7:aload_0         
		//    4    8:getfield        #13  <Field Document this$0>
		//    5   11:invokestatic    #29  <Method DocumentProvider Document.access$200(Document)>
		//    6   14:aload_1         
		//    7   15:invokeinterface #35  <Method NodeDescriptor DocumentProvider.getNodeDescriptor(Object)>
		//    8   20:aload_1         
		//    9   21:invokeinterface #41  <Method void NodeDescriptor.hook(Object)>
		//   10   26:return          
		}

		protected void onUnmapped(Object obj, int i)
		{
			verifyThreadAccess();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field Document this$0>
		//    2    4:invokevirtual   #25  <Method void Document.verifyThreadAccess()>
			mDocumentProvider.getNodeDescriptor(obj).unhook(obj);
		//    3    7:aload_0         
		//    4    8:getfield        #13  <Field Document this$0>
		//    5   11:invokestatic    #29  <Method DocumentProvider Document.access$200(Document)>
		//    6   14:aload_1         
		//    7   15:invokeinterface #35  <Method NodeDescriptor DocumentProvider.getNodeDescriptor(Object)>
		//    8   20:aload_1         
		//    9   21:invokeinterface #45  <Method void NodeDescriptor.unhook(Object)>
		//   10   26:return          
		}

		final Document this$0;

		private DocumentObjectIdMapper()
		{
			this$0 = Document.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field Document this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void ObjectIdMapper()>
		//    5    9:return          
		}

	}

	private final class ProviderListener
		implements DocumentProviderListener
	{

		public void onAttributeModified(Object obj, String s, String s1)
		{
			verifyThreadAccess();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field Document this$0>
		//    2    4:invokevirtual   #27  <Method void Document.verifyThreadAccess()>
			mUpdateListeners.onAttributeModified(obj, s, s1);
		//    3    7:aload_0         
		//    4    8:getfield        #15  <Field Document this$0>
		//    5   11:invokestatic    #31  <Method Document$UpdateListenerCollection Document.access$700(Document)>
		//    6   14:aload_1         
		//    7   15:aload_2         
		//    8   16:aload_3         
		//    9   17:invokevirtual   #35  <Method void Document$UpdateListenerCollection.onAttributeModified(Object, String, String)>
		//   10   20:return          
		}

		public void onAttributeRemoved(Object obj, String s)
		{
			verifyThreadAccess();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field Document this$0>
		//    2    4:invokevirtual   #27  <Method void Document.verifyThreadAccess()>
			mUpdateListeners.onAttributeRemoved(obj, s);
		//    3    7:aload_0         
		//    4    8:getfield        #15  <Field Document this$0>
		//    5   11:invokestatic    #31  <Method Document$UpdateListenerCollection Document.access$700(Document)>
		//    6   14:aload_1         
		//    7   15:aload_2         
		//    8   16:invokevirtual   #39  <Method void Document$UpdateListenerCollection.onAttributeRemoved(Object, String)>
		//    9   19:return          
		}

		public void onInspectRequested(Object obj)
		{
			verifyThreadAccess();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field Document this$0>
		//    2    4:invokevirtual   #27  <Method void Document.verifyThreadAccess()>
			mUpdateListeners.onInspectRequested(obj);
		//    3    7:aload_0         
		//    4    8:getfield        #15  <Field Document this$0>
		//    5   11:invokestatic    #31  <Method Document$UpdateListenerCollection Document.access$700(Document)>
		//    6   14:aload_1         
		//    7   15:invokevirtual   #43  <Method void Document$UpdateListenerCollection.onInspectRequested(Object)>
		//    8   18:return          
		}

		public void onPossiblyChanged()
		{
			updateTree();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field Document this$0>
		//    2    4:invokestatic    #47  <Method void Document.access$1200(Document)>
		//    3    7:return          
		}

		final Document this$0;

		private ProviderListener()
		{
			this$0 = Document.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field Document this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}

	public static interface UpdateListener
	{

		public abstract void onAttributeModified(Object obj, String s, String s1);

		public abstract void onAttributeRemoved(Object obj, String s);

		public abstract void onChildNodeInserted(DocumentView documentview, Object obj, int i, int j, Accumulator accumulator);

		public abstract void onChildNodeRemoved(int i, int j);

		public abstract void onInspectRequested(Object obj);
	}

	private class UpdateListenerCollection
		implements UpdateListener
	{

		private UpdateListener[] getListenersSnapshot()
		{
_L2:
			UpdateListener aupdatelistener[] = mListenersSnapshot;
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
			UpdateListener aupdatelistener1[];
			if(mListenersSnapshot != null)
				break MISSING_BLOCK_LABEL_57;
		//    9   13:aload_0         
		//   10   14:getfield        #33  <Field Document$UpdateListener[] mListenersSnapshot>
		//   11   17:ifnonnull       57
			mListenersSnapshot = (UpdateListener[])mListeners.toArray(((Object []) (new UpdateListener[mListeners.size()])));
		//   12   20:aload_0         
		//   13   21:aload_0         
		//   14   22:getfield        #28  <Field List mListeners>
		//   15   25:aload_0         
		//   16   26:getfield        #28  <Field List mListeners>
		//   17   29:invokeinterface #39  <Method int List.size()>
		//   18   34:anewarray       UpdateListener[]
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

		public void add(UpdateListener updatelistener)
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
			UpdateListener aupdatelistener[] = getListenersSnapshot();
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
			UpdateListener aupdatelistener[] = getListenersSnapshot();
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
			UpdateListener aupdatelistener[] = getListenersSnapshot();
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
			UpdateListener aupdatelistener[] = getListenersSnapshot();
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
			UpdateListener aupdatelistener[] = getListenersSnapshot();
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

		public void remove(UpdateListener updatelistener)
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
		private volatile UpdateListener mListenersSnapshot[];
		final Document this$0;

		public UpdateListenerCollection()
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


	public Document(DocumentProviderFactory documentproviderfactory)
	{
		super(((com.facebook.stetho.common.ThreadBound) (documentproviderfactory)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #64  <Method void ThreadBoundProxy(com.facebook.stetho.common.ThreadBound)>
		mFactory = documentproviderfactory;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #66  <Field DocumentProviderFactory mFactory>
	//    6   10:aload_0         
	//    7   11:new             #24  <Class Document$DocumentObjectIdMapper>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:invokespecial   #69  <Method void Document$DocumentObjectIdMapper(Document, Document$1)>
	//   12   20:putfield        #71  <Field ObjectIdMapper mObjectIdMapper>
		mReferenceCounter = 0;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #73  <Field int mReferenceCounter>
		mUpdateListeners = new UpdateListenerCollection();
	//   16   28:aload_0         
	//   17   29:new             #33  <Class Document$UpdateListenerCollection>
	//   18   32:dup             
	//   19   33:aload_0         
	//   20   34:invokespecial   #76  <Method void Document$UpdateListenerCollection(Document)>
	//   21   37:putfield        #78  <Field Document$UpdateListenerCollection mUpdateListeners>
	//   22   40:aload_0         
	//   23   41:new             #80  <Class ArrayDeque>
	//   24   44:dup             
	//   25   45:invokespecial   #83  <Method void ArrayDeque()>
	//   26   48:putfield        #85  <Field Queue mCachedUpdateQueue>
	//   27   51:return          
	}

	private AttributeListAccumulator acquireCachedAttributeAccumulator()
	{
		AttributeListAccumulator attributelistaccumulator1 = mCachedAttributeAccumulator;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field Document$AttributeListAccumulator mCachedAttributeAccumulator>
	//    2    4:astore_2        
		AttributeListAccumulator attributelistaccumulator = attributelistaccumulator1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(attributelistaccumulator1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       19
			attributelistaccumulator = new AttributeListAccumulator();
	//    7   11:new             #18  <Class Document$AttributeListAccumulator>
	//    8   14:dup             
	//    9   15:invokespecial   #134 <Method void Document$AttributeListAccumulator()>
	//   10   18:astore_1        
		mCachedChildrenAccumulator = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #136 <Field ArrayListAccumulator mCachedChildrenAccumulator>
		return attributelistaccumulator;
	//   14   24:aload_1         
	//   15   25:areturn         
	}

	private ChildEventingList acquireChildEventingList(Object obj, DocumentView documentview)
	{
		ChildEventingList childeventinglist1 = mCachedChildEventingList;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field Document$ChildEventingList mCachedChildEventingList>
	//    2    4:astore          4
		ChildEventingList childeventinglist = childeventinglist1;
	//    3    6:aload           4
	//    4    8:astore_3        
		if(childeventinglist1 == null)
	//*   5    9:aload           4
	//*   6   11:ifnonnull       24
			childeventinglist = new ChildEventingList();
	//    7   14:new             #21  <Class Document$ChildEventingList>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:aconst_null     
	//   11   20:invokespecial   #139 <Method void Document$ChildEventingList(Document, Document$1)>
	//   12   23:astore_3        
		mCachedChildEventingList = null;
	//   13   24:aload_0         
	//   14   25:aconst_null     
	//   15   26:putfield        #138 <Field Document$ChildEventingList mCachedChildEventingList>
		childeventinglist.acquire(obj, documentview);
	//   16   29:aload_3         
	//   17   30:aload_1         
	//   18   31:aload_2         
	//   19   32:invokevirtual   #143 <Method void Document$ChildEventingList.acquire(Object, DocumentView)>
		return childeventinglist;
	//   20   35:aload_3         
	//   21   36:areturn         
	}

	private ArrayListAccumulator acquireChildrenAccumulator()
	{
		ArrayListAccumulator arraylistaccumulator1 = mCachedChildrenAccumulator;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field ArrayListAccumulator mCachedChildrenAccumulator>
	//    2    4:astore_2        
		ArrayListAccumulator arraylistaccumulator = arraylistaccumulator1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(arraylistaccumulator1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       19
			arraylistaccumulator = new ArrayListAccumulator();
	//    7   11:new             #147 <Class ArrayListAccumulator>
	//    8   14:dup             
	//    9   15:invokespecial   #148 <Method void ArrayListAccumulator()>
	//   10   18:astore_1        
		mCachedChildrenAccumulator = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #136 <Field ArrayListAccumulator mCachedChildrenAccumulator>
		return arraylistaccumulator;
	//   14   24:aload_1         
	//   15   25:areturn         
	}

	private void applyDocumentUpdate(final ShadowDocument.Update docUpdate)
	{
		docUpdate.getGarbageElements(new Accumulator() {

			public void store(Object obj)
			{
				if(mObjectIdMapper.containsObject(obj))
			//*   0    0:aload_0         
			//*   1    1:getfield        #20  <Field Document this$0>
			//*   2    4:invokestatic    #32  <Method ObjectIdMapper Document.access$500(Document)>
			//*   3    7:aload_1         
			//*   4    8:invokevirtual   #38  <Method boolean ObjectIdMapper.containsObject(Object)>
			//*   5   11:ifeq            100
				{
					if(docUpdate.getElementInfo(obj).parentElement == null)
			//*   6   14:aload_0         
			//*   7   15:getfield        #22  <Field ShadowDocument$Update val$docUpdate>
			//*   8   18:aload_1         
			//*   9   19:invokevirtual   #44  <Method ElementInfo ShadowDocument$Update.getElementInfo(Object)>
			//*  10   22:getfield        #50  <Field Object ElementInfo.parentElement>
			//*  11   25:ifnonnull       87
					{
						ElementInfo elementinfo = mShadowDocument.getElementInfo(obj);
			//   12   28:aload_0         
			//   13   29:getfield        #20  <Field Document this$0>
			//   14   32:invokestatic    #54  <Method ShadowDocument Document.access$100(Document)>
			//   15   35:aload_1         
			//   16   36:invokevirtual   #57  <Method ElementInfo ShadowDocument.getElementInfo(Object)>
			//   17   39:astore          4
						int i = mObjectIdMapper.getIdForObject(elementinfo.parentElement).intValue();
			//   18   41:aload_0         
			//   19   42:getfield        #20  <Field Document this$0>
			//   20   45:invokestatic    #32  <Method ObjectIdMapper Document.access$500(Document)>
			//   21   48:aload           4
			//   22   50:getfield        #50  <Field Object ElementInfo.parentElement>
			//   23   53:invokevirtual   #61  <Method Integer ObjectIdMapper.getIdForObject(Object)>
			//   24   56:invokevirtual   #67  <Method int Integer.intValue()>
			//   25   59:istore_2        
						int j = mObjectIdMapper.getIdForObject(obj).intValue();
			//   26   60:aload_0         
			//   27   61:getfield        #20  <Field Document this$0>
			//   28   64:invokestatic    #32  <Method ObjectIdMapper Document.access$500(Document)>
			//   29   67:aload_1         
			//   30   68:invokevirtual   #61  <Method Integer ObjectIdMapper.getIdForObject(Object)>
			//   31   71:invokevirtual   #67  <Method int Integer.intValue()>
			//   32   74:istore_3        
						mUpdateListeners.onChildNodeRemoved(i, j);
			//   33   75:aload_0         
			//   34   76:getfield        #20  <Field Document this$0>
			//   35   79:invokestatic    #71  <Method Document$UpdateListenerCollection Document.access$700(Document)>
			//   36   82:iload_2         
			//   37   83:iload_3         
			//   38   84:invokevirtual   #77  <Method void Document$UpdateListenerCollection.onChildNodeRemoved(int, int)>
					}
					mObjectIdMapper.removeObject(obj);
			//   39   87:aload_0         
			//   40   88:getfield        #20  <Field Document this$0>
			//   41   91:invokestatic    #32  <Method ObjectIdMapper Document.access$500(Document)>
			//   42   94:aload_1         
			//   43   95:invokevirtual   #80  <Method Integer ObjectIdMapper.removeObject(Object)>
			//   44   98:pop             
					return;
			//   45   99:return          
				} else
				{
					throw new IllegalStateException();
			//   46  100:new             #82  <Class IllegalStateException>
			//   47  103:dup             
			//   48  104:invokespecial   #83  <Method void IllegalStateException()>
			//   49  107:athrow          
				}
			}

			final Document this$0;
			final ShadowDocument.Update val$docUpdate;

			
			{
				this$0 = Document.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Document this$0>
				docUpdate = update;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field ShadowDocument$Update val$docUpdate>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_1         
	//    1    1:new             #10  <Class Document$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #155 <Method void Document$3(Document, ShadowDocument$Update)>
	//    6   10:invokevirtual   #161 <Method void ShadowDocument$Update.getGarbageElements(Accumulator)>
		docUpdate.getChangedElements(new Accumulator() {

			public void store(Object obj)
			{
				if(!mObjectIdMapper.containsObject(obj))
			//*   0    0:aload_0         
			//*   1    1:getfield        #20  <Field Document this$0>
			//*   2    4:invokestatic    #32  <Method ObjectIdMapper Document.access$500(Document)>
			//*   3    7:aload_1         
			//*   4    8:invokevirtual   #38  <Method boolean ObjectIdMapper.containsObject(Object)>
			//*   5   11:ifne            15
					return;
			//    6   14:return          
				ElementInfo elementinfo = mShadowDocument.getElementInfo(obj);
			//    7   15:aload_0         
			//    8   16:getfield        #20  <Field Document this$0>
			//    9   19:invokestatic    #42  <Method ShadowDocument Document.access$100(Document)>
			//   10   22:aload_1         
			//   11   23:invokevirtual   #48  <Method ElementInfo ShadowDocument.getElementInfo(Object)>
			//   12   26:astore          4
				if(elementinfo == null)
			//*  13   28:aload           4
			//*  14   30:ifnonnull       34
					return;
			//   15   33:return          
				if(docUpdate.getElementInfo(obj).parentElement != elementinfo.parentElement)
			//*  16   34:aload_0         
			//*  17   35:getfield        #22  <Field ShadowDocument$Update val$docUpdate>
			//*  18   38:aload_1         
			//*  19   39:invokevirtual   #51  <Method ElementInfo ShadowDocument$Update.getElementInfo(Object)>
			//*  20   42:getfield        #57  <Field Object ElementInfo.parentElement>
			//*  21   45:aload           4
			//*  22   47:getfield        #57  <Field Object ElementInfo.parentElement>
			//*  23   50:if_acmpeq       99
				{
					int i = mObjectIdMapper.getIdForObject(elementinfo.parentElement).intValue();
			//   24   53:aload_0         
			//   25   54:getfield        #20  <Field Document this$0>
			//   26   57:invokestatic    #32  <Method ObjectIdMapper Document.access$500(Document)>
			//   27   60:aload           4
			//   28   62:getfield        #57  <Field Object ElementInfo.parentElement>
			//   29   65:invokevirtual   #61  <Method Integer ObjectIdMapper.getIdForObject(Object)>
			//   30   68:invokevirtual   #67  <Method int Integer.intValue()>
			//   31   71:istore_2        
					int j = mObjectIdMapper.getIdForObject(obj).intValue();
			//   32   72:aload_0         
			//   33   73:getfield        #20  <Field Document this$0>
			//   34   76:invokestatic    #32  <Method ObjectIdMapper Document.access$500(Document)>
			//   35   79:aload_1         
			//   36   80:invokevirtual   #61  <Method Integer ObjectIdMapper.getIdForObject(Object)>
			//   37   83:invokevirtual   #67  <Method int Integer.intValue()>
			//   38   86:istore_3        
					mUpdateListeners.onChildNodeRemoved(i, j);
			//   39   87:aload_0         
			//   40   88:getfield        #20  <Field Document this$0>
			//   41   91:invokestatic    #71  <Method Document$UpdateListenerCollection Document.access$700(Document)>
			//   42   94:iload_2         
			//   43   95:iload_3         
			//   44   96:invokevirtual   #77  <Method void Document$UpdateListenerCollection.onChildNodeRemoved(int, int)>
				}
			//   45   99:return          
			}

			final Document this$0;
			final ShadowDocument.Update val$docUpdate;

			
			{
				this$0 = Document.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Document this$0>
				docUpdate = update;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field ShadowDocument$Update val$docUpdate>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    7   13:aload_1         
	//    8   14:new             #12  <Class Document$4>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokespecial   #162 <Method void Document$4(Document, ShadowDocument$Update)>
	//   13   23:invokevirtual   #165 <Method void ShadowDocument$Update.getChangedElements(Accumulator)>
		docUpdate.getChangedElements(new Accumulator() {

			public void store(Object obj)
			{
				if(!mObjectIdMapper.containsObject(obj))
			//*   0    0:aload_0         
			//*   1    1:getfield        #28  <Field Document this$0>
			//*   2    4:invokestatic    #52  <Method ObjectIdMapper Document.access$500(Document)>
			//*   3    7:aload_1         
			//*   4    8:invokevirtual   #58  <Method boolean ObjectIdMapper.containsObject(Object)>
			//*   5   11:ifne            15
					return;
			//    6   14:return          
				if(listenerInsertedElements.contains(obj))
			//*   7   15:aload_0         
			//*   8   16:getfield        #38  <Field HashSet listenerInsertedElements>
			//*   9   19:aload_1         
			//*  10   20:invokevirtual   #61  <Method boolean HashSet.contains(Object)>
			//*  11   23:ifeq            27
					return;
			//   12   26:return          
				Object obj1 = ((Object) (mShadowDocument.getElementInfo(obj)));
			//   13   27:aload_0         
			//   14   28:getfield        #28  <Field Document this$0>
			//   15   31:invokestatic    #65  <Method ShadowDocument Document.access$100(Document)>
			//   16   34:aload_1         
			//   17   35:invokevirtual   #71  <Method ElementInfo ShadowDocument.getElementInfo(Object)>
			//   18   38:astore          4
				Object obj2 = ((Object) (docUpdate.getElementInfo(obj)));
			//   19   40:aload_0         
			//   20   41:getfield        #30  <Field ShadowDocument$Update val$docUpdate>
			//   21   44:aload_1         
			//   22   45:invokevirtual   #74  <Method ElementInfo ShadowDocument$Update.getElementInfo(Object)>
			//   23   48:astore          5
				if(obj1 != null)
			//*  24   50:aload           4
			//*  25   52:ifnull          65
					obj1 = ((Object) (((ElementInfo) (obj1)).children));
			//   26   55:aload           4
			//   27   57:getfield        #80  <Field List ElementInfo.children>
			//   28   60:astore          4
				else
			//*  29   62:goto            70
					obj1 = ((Object) (Collections.emptyList()));
			//   30   65:invokestatic    #86  <Method List Collections.emptyList()>
			//   31   68:astore          4
				obj2 = ((Object) (((ElementInfo) (obj2)).children));
			//   32   70:aload           5
			//   33   72:getfield        #80  <Field List ElementInfo.children>
			//   34   75:astore          5
				ChildEventingList childeventinglist = acquireChildEventingList(obj, ((DocumentView) (docUpdate)));
			//   35   77:aload_0         
			//   36   78:getfield        #28  <Field Document this$0>
			//   37   81:aload_1         
			//   38   82:aload_0         
			//   39   83:getfield        #30  <Field ShadowDocument$Update val$docUpdate>
			//   40   86:invokestatic    #90  <Method Document$ChildEventingList Document.access$900(Document, Object, DocumentView)>
			//   41   89:astore          6
				int i = 0;
			//   42   91:iconst_0        
			//   43   92:istore_2        
				for(int j = ((List) (obj1)).size(); i < j; i++)
			//*  44   93:aload           4
			//*  45   95:invokeinterface #96  <Method int List.size()>
			//*  46  100:istore_3        
			//*  47  101:iload_2         
			//*  48  102:iload_3         
			//*  49  103:icmpge          174
				{
					Object obj3 = ((List) (obj1)).get(i);
			//   50  106:aload           4
			//   51  108:iload_2         
			//   52  109:invokeinterface #100 <Method Object List.get(int)>
			//   53  114:astore          7
					if(!mObjectIdMapper.containsObject(obj3))
						continue;
			//   54  116:aload_0         
			//   55  117:getfield        #28  <Field Document this$0>
			//   56  120:invokestatic    #52  <Method ObjectIdMapper Document.access$500(Document)>
			//   57  123:aload           7
			//   58  125:invokevirtual   #58  <Method boolean ObjectIdMapper.containsObject(Object)>
			//   59  128:ifeq            167
					ElementInfo elementinfo = docUpdate.getElementInfo(obj3);
			//   60  131:aload_0         
			//   61  132:getfield        #30  <Field ShadowDocument$Update val$docUpdate>
			//   62  135:aload           7
			//   63  137:invokevirtual   #74  <Method ElementInfo ShadowDocument$Update.getElementInfo(Object)>
			//   64  140:astore          8
					if(elementinfo == null || elementinfo.parentElement == obj)
			//*  65  142:aload           8
			//*  66  144:ifnull          159
			//*  67  147:aload           8
			//*  68  149:getfield        #104 <Field Object ElementInfo.parentElement>
			//*  69  152:aload_1         
			//*  70  153:if_acmpeq       159
			//*  71  156:goto            167
						childeventinglist.add(obj3);
			//   72  159:aload           6
			//   73  161:aload           7
			//   74  163:invokevirtual   #109 <Method boolean Document$ChildEventingList.add(Object)>
			//   75  166:pop             
				}

			//   76  167:iload_2         
			//   77  168:iconst_1        
			//   78  169:iadd            
			//   79  170:istore_2        
			//*  80  171:goto            101
				Document.updateListenerChildren(childeventinglist, ((List) (obj2)), insertedElements);
			//   81  174:aload           6
			//   82  176:aload           5
			//   83  178:aload_0         
			//   84  179:getfield        #43  <Field Accumulator insertedElements>
			//   85  182:invokestatic    #113 <Method void Document.access$1000(Document$ChildEventingList, List, Accumulator)>
				releaseChildEventingList(childeventinglist);
			//   86  185:aload_0         
			//   87  186:getfield        #28  <Field Document this$0>
			//   88  189:aload           6
			//   89  191:invokestatic    #117 <Method void Document.access$1100(Document, Document$ChildEventingList)>
			//   90  194:return          
			}

			private Accumulator insertedElements;
			private final HashSet listenerInsertedElements = new HashSet();
			final Document this$0;
			final ShadowDocument.Update val$docUpdate;


/*
			static HashSet access$800(_cls5 _pcls5)
			{
				return _pcls5.listenerInsertedElements;
			//    0    0:aload_0         
			//    1    1:getfield        #38  <Field HashSet listenerInsertedElements>
			//    2    4:areturn         
			}

*/

			
			{
				this$0 = Document.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #28  <Field Document this$0>
				docUpdate = update;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #30  <Field ShadowDocument$Update val$docUpdate>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #33  <Method void Object()>
			//    8   14:aload_0         
			//    9   15:new             #35  <Class HashSet>
			//   10   18:dup             
			//   11   19:invokespecial   #36  <Method void HashSet()>
			//   12   22:putfield        #38  <Field HashSet listenerInsertedElements>
				insertedElements = new _cls1();
			//   13   25:aload_0         
			//   14   26:new             #14  <Class Document$5$1>
			//   15   29:dup             
			//   16   30:aload_0         
			//   17   31:invokespecial   #41  <Method void Document$5$1(Document$5)>
			//   18   34:putfield        #43  <Field Accumulator insertedElements>
			//   19   37:return          
			}
		}
);
	//   14   26:aload_1         
	//   15   27:new             #14  <Class Document$5>
	//   16   30:dup             
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:invokespecial   #166 <Method void Document$5(Document, ShadowDocument$Update)>
	//   20   36:invokevirtual   #165 <Method void ShadowDocument$Update.getChangedElements(Accumulator)>
		docUpdate.commit();
	//   21   39:aload_1         
	//   22   40:invokevirtual   #169 <Method void ShadowDocument$Update.commit()>
	//   23   43:return          
	}

	private void cleanUp()
	{
		mDocumentProvider.postAndWait(new Runnable() {

			public void run()
			{
				mDocumentProvider.setListener(((DocumentProviderListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field Document this$0>
			//    2    4:invokestatic    #25  <Method DocumentProvider Document.access$200(Document)>
			//    3    7:aconst_null     
			//    4    8:invokeinterface #31  <Method void DocumentProvider.setListener(DocumentProviderListener)>
				mShadowDocument = null;
			//    5   13:aload_0         
			//    6   14:getfield        #17  <Field Document this$0>
			//    7   17:aconst_null     
			//    8   18:invokestatic    #35  <Method ShadowDocument Document.access$102(Document, ShadowDocument)>
			//    9   21:pop             
				mObjectIdMapper.clear();
			//   10   22:aload_0         
			//   11   23:getfield        #17  <Field Document this$0>
			//   12   26:invokestatic    #39  <Method ObjectIdMapper Document.access$500(Document)>
			//   13   29:invokevirtual   #44  <Method void ObjectIdMapper.clear()>
				mDocumentProvider.dispose();
			//   14   32:aload_0         
			//   15   33:getfield        #17  <Field Document this$0>
			//   16   36:invokestatic    #25  <Method DocumentProvider Document.access$200(Document)>
			//   17   39:invokeinterface #47  <Method void DocumentProvider.dispose()>
				mDocumentProvider = null;
			//   18   44:aload_0         
			//   19   45:getfield        #17  <Field Document this$0>
			//   20   48:aconst_null     
			//   21   49:invokestatic    #51  <Method DocumentProvider Document.access$202(Document, DocumentProvider)>
			//   22   52:pop             
			//   23   53:return          
			}

			final Document this$0;

			
			{
				this$0 = Document.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Document this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field DocumentProvider mDocumentProvider>
	//    2    4:new             #8   <Class Document$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #171 <Method void Document$2(Document)>
	//    6   12:invokeinterface #177 <Method void DocumentProvider.postAndWait(Runnable)>
		mUpdateListeners.clear();
	//    7   17:aload_0         
	//    8   18:getfield        #78  <Field Document$UpdateListenerCollection mUpdateListeners>
	//    9   21:invokevirtual   #180 <Method void Document$UpdateListenerCollection.clear()>
	//   10   24:return          
	}

	private ShadowDocument.Update createShadowDocumentUpdate()
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method void verifyThreadAccess()>
		if(mDocumentProvider.getRootElement() == mShadowDocument.getRootElement())
	//*   2    4:aload_0         
	//*   3    5:getfield        #111 <Field DocumentProvider mDocumentProvider>
	//*   4    8:invokeinterface #187 <Method Object DocumentProvider.getRootElement()>
	//*   5   13:aload_0         
	//*   6   14:getfield        #90  <Field ShadowDocument mShadowDocument>
	//*   7   17:invokevirtual   #190 <Method Object ShadowDocument.getRootElement()>
	//*   8   20:if_acmpne       230
		{
			ArrayListAccumulator arraylistaccumulator = acquireChildrenAccumulator();
	//    9   23:aload_0         
	//   10   24:invokespecial   #192 <Method ArrayListAccumulator acquireChildrenAccumulator()>
	//   11   27:astore_3        
			ShadowDocument.UpdateBuilder updatebuilder = mShadowDocument.beginUpdate();
	//   12   28:aload_0         
	//   13   29:getfield        #90  <Field ShadowDocument mShadowDocument>
	//   14   32:invokevirtual   #196 <Method ShadowDocument$UpdateBuilder ShadowDocument.beginUpdate()>
	//   15   35:astore          4
			mCachedUpdateQueue.add(mDocumentProvider.getRootElement());
	//   16   37:aload_0         
	//   17   38:getfield        #85  <Field Queue mCachedUpdateQueue>
	//   18   41:aload_0         
	//   19   42:getfield        #111 <Field DocumentProvider mDocumentProvider>
	//   20   45:invokeinterface #187 <Method Object DocumentProvider.getRootElement()>
	//   21   50:invokeinterface #202 <Method boolean Queue.add(Object)>
	//   22   55:pop             
			for(; !mCachedUpdateQueue.isEmpty(); arraylistaccumulator.clear())
	//*  23   56:aload_0         
	//*  24   57:getfield        #85  <Field Queue mCachedUpdateQueue>
	//*  25   60:invokeinterface #206 <Method boolean Queue.isEmpty()>
	//*  26   65:ifne            219
			{
				Object obj = mCachedUpdateQueue.remove();
	//   27   68:aload_0         
	//   28   69:getfield        #85  <Field Queue mCachedUpdateQueue>
	//   29   72:invokeinterface #209 <Method Object Queue.remove()>
	//   30   77:astore          5
				NodeDescriptor nodedescriptor = mDocumentProvider.getNodeDescriptor(obj);
	//   31   79:aload_0         
	//   32   80:getfield        #111 <Field DocumentProvider mDocumentProvider>
	//   33   83:aload           5
	//   34   85:invokeinterface #213 <Method NodeDescriptor DocumentProvider.getNodeDescriptor(Object)>
	//   35   90:astore          6
				mObjectIdMapper.putObject(obj);
	//   36   92:aload_0         
	//   37   93:getfield        #71  <Field ObjectIdMapper mObjectIdMapper>
	//   38   96:aload           5
	//   39   98:invokevirtual   #219 <Method int ObjectIdMapper.putObject(Object)>
	//   40  101:pop             
				nodedescriptor.getChildren(obj, ((Accumulator) (arraylistaccumulator)));
	//   41  102:aload           6
	//   42  104:aload           5
	//   43  106:aload_3         
	//   44  107:invokeinterface #225 <Method void NodeDescriptor.getChildren(Object, Accumulator)>
				int j = arraylistaccumulator.size();
	//   45  112:aload_3         
	//   46  113:invokevirtual   #229 <Method int ArrayListAccumulator.size()>
	//   47  116:istore_2        
				for(int i = 0; i < j; i++)
	//*  48  117:iconst_0        
	//*  49  118:istore_1        
	//*  50  119:iload_1         
	//*  51  120:iload_2         
	//*  52  121:icmpge          204
				{
					Object obj1 = arraylistaccumulator.get(i);
	//   53  124:aload_3         
	//   54  125:iload_1         
	//   55  126:invokevirtual   #233 <Method Object ArrayListAccumulator.get(int)>
	//   56  129:astore          7
					if(obj1 != null)
	//*  57  131:aload           7
	//*  58  133:ifnull          151
					{
						mCachedUpdateQueue.add(obj1);
	//   59  136:aload_0         
	//   60  137:getfield        #85  <Field Queue mCachedUpdateQueue>
	//   61  140:aload           7
	//   62  142:invokeinterface #202 <Method boolean Queue.add(Object)>
	//   63  147:pop             
					} else
	//*  64  148:goto            197
					{
						LogUtil.e("%s.getChildren() emitted a null child at position %s for element %s", new Object[] {
							((Object) (nodedescriptor)).getClass().getName(), Integer.toString(i), obj
						});
	//   65  151:ldc1            #235 <String "%s.getChildren() emitted a null child at position %s for element %s">
	//   66  153:iconst_3        
	//   67  154:anewarray       Object[]
	//   68  157:dup             
	//   69  158:iconst_0        
	//   70  159:aload           6
	//   71  161:invokevirtual   #241 <Method Class Object.getClass()>
	//   72  164:invokevirtual   #247 <Method String Class.getName()>
	//   73  167:aastore         
	//   74  168:dup             
	//   75  169:iconst_1        
	//   76  170:iload_1         
	//   77  171:invokestatic    #253 <Method String Integer.toString(int)>
	//   78  174:aastore         
	//   79  175:dup             
	//   80  176:iconst_2        
	//   81  177:aload           5
	//   82  179:aastore         
	//   83  180:invokestatic    #259 <Method void LogUtil.e(String, Object[])>
						arraylistaccumulator.remove(i);
	//   84  183:aload_3         
	//   85  184:iload_1         
	//   86  185:invokevirtual   #261 <Method Object ArrayListAccumulator.remove(int)>
	//   87  188:pop             
						i--;
	//   88  189:iload_1         
	//   89  190:iconst_1        
	//   90  191:isub            
	//   91  192:istore_1        
						j--;
	//   92  193:iload_2         
	//   93  194:iconst_1        
	//   94  195:isub            
	//   95  196:istore_2        
					}
				}

	//   96  197:iload_1         
	//   97  198:iconst_1        
	//   98  199:iadd            
	//   99  200:istore_1        
	//* 100  201:goto            119
				updatebuilder.setElementChildren(obj, ((List) (arraylistaccumulator)));
	//  101  204:aload           4
	//  102  206:aload           5
	//  103  208:aload_3         
	//  104  209:invokevirtual   #267 <Method void ShadowDocument$UpdateBuilder.setElementChildren(Object, List)>
			}

	//  105  212:aload_3         
	//  106  213:invokevirtual   #268 <Method void ArrayListAccumulator.clear()>
	//* 107  216:goto            56
			releaseChildrenAccumulator(arraylistaccumulator);
	//  108  219:aload_0         
	//  109  220:aload_3         
	//  110  221:invokespecial   #272 <Method void releaseChildrenAccumulator(ArrayListAccumulator)>
			return updatebuilder.build();
	//  111  224:aload           4
	//  112  226:invokevirtual   #275 <Method ShadowDocument$Update ShadowDocument$UpdateBuilder.build()>
	//  113  229:areturn         
		} else
		{
			throw new IllegalStateException();
	//  114  230:new             #277 <Class IllegalStateException>
	//  115  233:dup             
	//  116  234:invokespecial   #278 <Method void IllegalStateException()>
	//  117  237:athrow          
		}
	}

	private boolean doesElementMatch(Object obj, Pattern pattern)
	{
		AttributeListAccumulator attributelistaccumulator = acquireCachedAttributeAccumulator();
	//    0    0:aload_0         
	//    1    1:invokespecial   #282 <Method Document$AttributeListAccumulator acquireCachedAttributeAccumulator()>
	//    2    4:astore          5
		NodeDescriptor nodedescriptor = mDocumentProvider.getNodeDescriptor(obj);
	//    3    6:aload_0         
	//    4    7:getfield        #111 <Field DocumentProvider mDocumentProvider>
	//    5   10:aload_1         
	//    6   11:invokeinterface #213 <Method NodeDescriptor DocumentProvider.getNodeDescriptor(Object)>
	//    7   16:astore          6
		nodedescriptor.getAttributes(obj, ((AttributeAccumulator) (attributelistaccumulator)));
	//    8   18:aload           6
	//    9   20:aload_1         
	//   10   21:aload           5
	//   11   23:invokeinterface #286 <Method void NodeDescriptor.getAttributes(Object, AttributeAccumulator)>
		int j = attributelistaccumulator.size();
	//   12   28:aload           5
	//   13   30:invokevirtual   #287 <Method int Document$AttributeListAccumulator.size()>
	//   14   33:istore          4
		for(int i = 0; i < j; i++)
	//*  15   35:iconst_0        
	//*  16   36:istore_3        
	//*  17   37:iload_3         
	//*  18   38:iload           4
	//*  19   40:icmpge          77
			if(pattern.matcher((CharSequence)attributelistaccumulator.get(i)).find())
	//*  20   43:aload_2         
	//*  21   44:aload           5
	//*  22   46:iload_3         
	//*  23   47:invokevirtual   #288 <Method Object Document$AttributeListAccumulator.get(int)>
	//*  24   50:checkcast       #290 <Class CharSequence>
	//*  25   53:invokevirtual   #296 <Method Matcher Pattern.matcher(CharSequence)>
	//*  26   56:invokevirtual   #301 <Method boolean Matcher.find()>
	//*  27   59:ifeq            70
			{
				releaseCachedAttributeAccumulator(attributelistaccumulator);
	//   28   62:aload_0         
	//   29   63:aload           5
	//   30   65:invokespecial   #305 <Method void releaseCachedAttributeAccumulator(Document$AttributeListAccumulator)>
				return true;
	//   31   68:iconst_1        
	//   32   69:ireturn         
			}

	//   33   70:iload_3         
	//   34   71:iconst_1        
	//   35   72:iadd            
	//   36   73:istore_3        
	//*  37   74:goto            37
		releaseCachedAttributeAccumulator(attributelistaccumulator);
	//   38   77:aload_0         
	//   39   78:aload           5
	//   40   80:invokespecial   #305 <Method void releaseCachedAttributeAccumulator(Document$AttributeListAccumulator)>
		return pattern.matcher(((CharSequence) (nodedescriptor.getNodeName(obj)))).find();
	//   41   83:aload_2         
	//   42   84:aload           6
	//   43   86:aload_1         
	//   44   87:invokeinterface #309 <Method String NodeDescriptor.getNodeName(Object)>
	//   45   92:invokevirtual   #296 <Method Matcher Pattern.matcher(CharSequence)>
	//   46   95:invokevirtual   #301 <Method boolean Matcher.find()>
	//   47   98:ireturn         
	}

	private void findMatches(Object obj, Pattern pattern, Accumulator accumulator)
	{
		obj = ((Object) (mShadowDocument.getElementInfo(obj)));
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field ShadowDocument mShadowDocument>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #315 <Method ElementInfo ShadowDocument.getElementInfo(Object)>
	//    4    8:astore_1        
		int j = ((ElementInfo) (obj)).children.size();
	//    5    9:aload_1         
	//    6   10:getfield        #321 <Field List ElementInfo.children>
	//    7   13:invokeinterface #324 <Method int List.size()>
	//    8   18:istore          5
		for(int i = 0; i < j; i++)
	//*   9   20:iconst_0        
	//*  10   21:istore          4
	//*  11   23:iload           4
	//*  12   25:iload           5
	//*  13   27:icmpge          85
		{
			Object obj1 = ((ElementInfo) (obj)).children.get(i);
	//   14   30:aload_1         
	//   15   31:getfield        #321 <Field List ElementInfo.children>
	//   16   34:iload           4
	//   17   36:invokeinterface #325 <Method Object List.get(int)>
	//   18   41:astore          6
			if(doesElementMatch(obj1, pattern))
	//*  19   43:aload_0         
	//*  20   44:aload           6
	//*  21   46:aload_2         
	//*  22   47:invokespecial   #327 <Method boolean doesElementMatch(Object, Pattern)>
	//*  23   50:ifeq            68
				accumulator.store(((Object) (mObjectIdMapper.getIdForObject(obj1))));
	//   24   53:aload_3         
	//   25   54:aload_0         
	//   26   55:getfield        #71  <Field ObjectIdMapper mObjectIdMapper>
	//   27   58:aload           6
	//   28   60:invokevirtual   #331 <Method Integer ObjectIdMapper.getIdForObject(Object)>
	//   29   63:invokeinterface #337 <Method void Accumulator.store(Object)>
			findMatches(obj1, pattern, accumulator);
	//   30   68:aload_0         
	//   31   69:aload           6
	//   32   71:aload_2         
	//   33   72:aload_3         
	//   34   73:invokespecial   #339 <Method void findMatches(Object, Pattern, Accumulator)>
		}

	//   35   76:iload           4
	//   36   78:iconst_1        
	//   37   79:iadd            
	//   38   80:istore          4
	//*  39   82:goto            23
	//   40   85:return          
	}

	private void init()
	{
		mDocumentProvider = mFactory.create();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #66  <Field DocumentProviderFactory mFactory>
	//    3    5:invokeinterface #347 <Method DocumentProvider DocumentProviderFactory.create()>
	//    4   10:putfield        #111 <Field DocumentProvider mDocumentProvider>
		mDocumentProvider.postAndWait(new Runnable() {

			public void run()
			{
				Document document = Document.this;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field Document this$0>
			//    2    4:astore_1        
				document.mShadowDocument = new ShadowDocument(document.mDocumentProvider.getRootElement());
			//    3    5:aload_1         
			//    4    6:new             #23  <Class ShadowDocument>
			//    5    9:dup             
			//    6   10:aload_1         
			//    7   11:invokestatic    #27  <Method DocumentProvider Document.access$200(Document)>
			//    8   14:invokeinterface #33  <Method Object DocumentProvider.getRootElement()>
			//    9   19:invokespecial   #36  <Method void ShadowDocument(Object)>
			//   10   22:invokestatic    #40  <Method ShadowDocument Document.access$102(Document, ShadowDocument)>
			//   11   25:pop             
				createShadowDocumentUpdate().commit();
			//   12   26:aload_0         
			//   13   27:getfield        #17  <Field Document this$0>
			//   14   30:invokestatic    #44  <Method ShadowDocument$Update Document.access$300(Document)>
			//   15   33:invokevirtual   #49  <Method void ShadowDocument$Update.commit()>
				mDocumentProvider.setListener(((DocumentProviderListener) (new ProviderListener())));
			//   16   36:aload_0         
			//   17   37:getfield        #17  <Field Document this$0>
			//   18   40:invokestatic    #27  <Method DocumentProvider Document.access$200(Document)>
			//   19   43:new             #51  <Class Document$ProviderListener>
			//   20   46:dup             
			//   21   47:aload_0         
			//   22   48:getfield        #17  <Field Document this$0>
			//   23   51:aconst_null     
			//   24   52:invokespecial   #54  <Method void Document$ProviderListener(Document, Document$1)>
			//   25   55:invokeinterface #58  <Method void DocumentProvider.setListener(DocumentProviderListener)>
			//   26   60:return          
			}

			final Document this$0;

			
			{
				this$0 = Document.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Document this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    5   13:aload_0         
	//    6   14:getfield        #111 <Field DocumentProvider mDocumentProvider>
	//    7   17:new             #6   <Class Document$1>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:invokespecial   #348 <Method void Document$1(Document)>
	//   11   25:invokeinterface #177 <Method void DocumentProvider.postAndWait(Runnable)>
	//   12   30:return          
	}

	private void releaseCachedAttributeAccumulator(AttributeListAccumulator attributelistaccumulator)
	{
		attributelistaccumulator.clear();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #349 <Method void Document$AttributeListAccumulator.clear()>
		if(mCachedAttributeAccumulator == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #133 <Field Document$AttributeListAccumulator mCachedAttributeAccumulator>
	//*   4    8:ifnonnull       16
			mCachedAttributeAccumulator = attributelistaccumulator;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #133 <Field Document$AttributeListAccumulator mCachedAttributeAccumulator>
	//    8   16:return          
	}

	private void releaseChildEventingList(ChildEventingList childeventinglist)
	{
		childeventinglist.release();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #352 <Method void Document$ChildEventingList.release()>
		if(mCachedChildEventingList == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #138 <Field Document$ChildEventingList mCachedChildEventingList>
	//*   4    8:ifnonnull       16
			mCachedChildEventingList = childeventinglist;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #138 <Field Document$ChildEventingList mCachedChildEventingList>
	//    8   16:return          
	}

	private void releaseChildrenAccumulator(ArrayListAccumulator arraylistaccumulator)
	{
		arraylistaccumulator.clear();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #268 <Method void ArrayListAccumulator.clear()>
		if(mCachedChildrenAccumulator == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #136 <Field ArrayListAccumulator mCachedChildrenAccumulator>
	//*   4    8:ifnonnull       16
			mCachedChildrenAccumulator = arraylistaccumulator;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #136 <Field ArrayListAccumulator mCachedChildrenAccumulator>
	//    8   16:return          
	}

	private static void updateListenerChildren(ChildEventingList childeventinglist, List list, Accumulator accumulator)
	{
		for(int i = 0; i <= childeventinglist.size();)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #354 <Method int Document$ChildEventingList.size()>
	//*   5    7:icmpgt          147
			if(i == childeventinglist.size())
	//*   6   10:iload_3         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #354 <Method int Document$ChildEventingList.size()>
	//*   9   15:icmpne          49
			{
				if(i == list.size())
	//*  10   18:iload_3         
	//*  11   19:aload_1         
	//*  12   20:invokeinterface #324 <Method int List.size()>
	//*  13   25:icmpne          29
					return;
	//   14   28:return          
				childeventinglist.addWithEvent(i, list.get(i), accumulator);
	//   15   29:aload_0         
	//   16   30:iload_3         
	//   17   31:aload_1         
	//   18   32:iload_3         
	//   19   33:invokeinterface #325 <Method Object List.get(int)>
	//   20   38:aload_2         
	//   21   39:invokevirtual   #358 <Method void Document$ChildEventingList.addWithEvent(int, Object, Accumulator)>
				i++;
	//   22   42:iload_3         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_3        
			} else
	//*  26   46:goto            2
			if(i == list.size())
	//*  27   49:iload_3         
	//*  28   50:aload_1         
	//*  29   51:invokeinterface #324 <Method int List.size()>
	//*  30   56:icmpne          67
			{
				childeventinglist.removeWithEvent(i);
	//   31   59:aload_0         
	//   32   60:iload_3         
	//   33   61:invokevirtual   #362 <Method void Document$ChildEventingList.removeWithEvent(int)>
			} else
	//*  34   64:goto            2
			{
				Object obj = childeventinglist.get(i);
	//   35   67:aload_0         
	//   36   68:iload_3         
	//   37   69:invokevirtual   #363 <Method Object Document$ChildEventingList.get(int)>
	//   38   72:astore          5
				Object obj1 = list.get(i);
	//   39   74:aload_1         
	//   40   75:iload_3         
	//   41   76:invokeinterface #325 <Method Object List.get(int)>
	//   42   81:astore          6
				if(obj == obj1)
	//*  43   83:aload           5
	//*  44   85:aload           6
	//*  45   87:if_acmpne       97
				{
					i++;
	//   46   90:iload_3         
	//   47   91:iconst_1        
	//   48   92:iadd            
	//   49   93:istore_3        
				} else
	//*  50   94:goto            2
				{
					int j = childeventinglist.indexOf(obj1);
	//   51   97:aload_0         
	//   52   98:aload           6
	//   53  100:invokevirtual   #366 <Method int Document$ChildEventingList.indexOf(Object)>
	//   54  103:istore          4
					if(j == -1)
	//*  55  105:iload           4
	//*  56  107:iconst_m1       
	//*  57  108:icmpne          126
					{
						childeventinglist.addWithEvent(i, obj1, accumulator);
	//   58  111:aload_0         
	//   59  112:iload_3         
	//   60  113:aload           6
	//   61  115:aload_2         
	//   62  116:invokevirtual   #358 <Method void Document$ChildEventingList.addWithEvent(int, Object, Accumulator)>
						i++;
	//   63  119:iload_3         
	//   64  120:iconst_1        
	//   65  121:iadd            
	//   66  122:istore_3        
					} else
	//*  67  123:goto            2
					{
						childeventinglist.removeWithEvent(j);
	//   68  126:aload_0         
	//   69  127:iload           4
	//   70  129:invokevirtual   #362 <Method void Document$ChildEventingList.removeWithEvent(int)>
						childeventinglist.addWithEvent(i, obj1, accumulator);
	//   71  132:aload_0         
	//   72  133:iload_3         
	//   73  134:aload           6
	//   74  136:aload_2         
	//   75  137:invokevirtual   #358 <Method void Document$ChildEventingList.addWithEvent(int, Object, Accumulator)>
						i++;
	//   76  140:iload_3         
	//   77  141:iconst_1        
	//   78  142:iadd            
	//   79  143:istore_3        
					}
				}
			}

	//*  80  144:goto            2
	//   81  147:return          
	}

	private void updateTree()
	{
		long l = SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #373 <Method long SystemClock.elapsedRealtime()>
	//    1    3:lstore_1        
		Object obj = ((Object) (createShadowDocumentUpdate()));
	//    2    4:aload_0         
	//    3    5:invokespecial   #119 <Method ShadowDocument$Update createShadowDocumentUpdate()>
	//    4    8:astore          4
		boolean flag = ((ShadowDocument.Update) (obj)).isEmpty();
	//    5   10:aload           4
	//    6   12:invokevirtual   #374 <Method boolean ShadowDocument$Update.isEmpty()>
	//    7   15:istore_3        
		if(flag)
	//*   8   16:iload_3         
	//*   9   17:ifeq            28
			((ShadowDocument.Update) (obj)).abandon();
	//   10   20:aload           4
	//   11   22:invokevirtual   #377 <Method void ShadowDocument$Update.abandon()>
		else
	//*  12   25:goto            34
			applyDocumentUpdate(((ShadowDocument.Update) (obj)));
	//   13   28:aload_0         
	//   14   29:aload           4
	//   15   31:invokespecial   #379 <Method void applyDocumentUpdate(ShadowDocument$Update)>
		String s = Long.toString(SystemClock.elapsedRealtime() - l);
	//   16   34:invokestatic    #373 <Method long SystemClock.elapsedRealtime()>
	//   17   37:lload_1         
	//   18   38:lsub            
	//   19   39:invokestatic    #384 <Method String Long.toString(long)>
	//   20   42:astore          5
		if(flag)
	//*  21   44:iload_3         
	//*  22   45:ifeq            56
			obj = " (no changes)";
	//   23   48:ldc2            #386 <String " (no changes)">
	//   24   51:astore          4
		else
	//*  25   53:goto            61
			obj = "";
	//   26   56:ldc2            #388 <String "">
	//   27   59:astore          4
		LogUtil.d("Document.updateTree() completed in %s ms%s", new Object[] {
			s, obj
		});
	//   28   61:ldc2            #390 <String "Document.updateTree() completed in %s ms%s">
	//   29   64:iconst_2        
	//   30   65:anewarray       Object[]
	//   31   68:dup             
	//   32   69:iconst_0        
	//   33   70:aload           5
	//   34   72:aastore         
	//   35   73:dup             
	//   36   74:iconst_1        
	//   37   75:aload           4
	//   38   77:aastore         
	//   39   78:invokestatic    #393 <Method void LogUtil.d(String, Object[])>
	//   40   81:return          
	}

	public void addRef()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		i = mReferenceCounter;
	//    2    2:aload_0         
	//    3    3:getfield        #73  <Field int mReferenceCounter>
	//    4    6:istore_1        
		mReferenceCounter = i + 1;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:iconst_1        
	//    8   10:iadd            
	//    9   11:putfield        #73  <Field int mReferenceCounter>
		if(i != 0)
			break MISSING_BLOCK_LABEL_22;
	//   10   14:iload_1         
	//   11   15:ifne            22
		init();
	//   12   18:aload_0         
	//   13   19:invokespecial   #396 <Method void init()>
		this;
	//   14   22:aload_0         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		return;
	//   16   24:return          
		Exception exception;
		exception;
	//   17   25:astore_2        
	//*  18   26:aload_0         
		throw exception;
	//   19   27:monitorexit     
	//   20   28:aload_2         
	//   21   29:athrow          
	}

	public void addUpdateListener(UpdateListener updatelistener)
	{
		mUpdateListeners.add(updatelistener);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field Document$UpdateListenerCollection mUpdateListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #400 <Method void Document$UpdateListenerCollection.add(Document$UpdateListener)>
	//    4    8:return          
	}

	public void findMatchingElements(String s, Accumulator accumulator)
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method void verifyThreadAccess()>
		s = ((String) (Pattern.compile(Pattern.quote(s), 2)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #406 <Method String Pattern.quote(String)>
	//    4    8:iconst_2        
	//    5    9:invokestatic    #410 <Method Pattern Pattern.compile(String, int)>
	//    6   12:astore_1        
		findMatches(mDocumentProvider.getRootElement(), ((Pattern) (s)), accumulator);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #111 <Field DocumentProvider mDocumentProvider>
	//   10   18:invokeinterface #187 <Method Object DocumentProvider.getRootElement()>
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokespecial   #339 <Method void findMatches(Object, Pattern, Accumulator)>
	//   14   28:return          
	}

	public DocumentView getDocumentView()
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method void verifyThreadAccess()>
		return ((DocumentView) (mShadowDocument));
	//    2    4:aload_0         
	//    3    5:getfield        #90  <Field ShadowDocument mShadowDocument>
	//    4    8:areturn         
	}

	public Object getElementForNodeId(int i)
	{
		return mObjectIdMapper.getObjectForId(i);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ObjectIdMapper mObjectIdMapper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #418 <Method Object ObjectIdMapper.getObjectForId(int)>
	//    4    8:areturn         
	}

	public void getElementStyles(Object obj, StyleAccumulator styleaccumulator)
	{
		getNodeDescriptor(obj).getStyles(obj, styleaccumulator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #422 <Method NodeDescriptor getNodeDescriptor(Object)>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokeinterface #425 <Method void NodeDescriptor.getStyles(Object, StyleAccumulator)>
	//    6   12:return          
	}

	public NodeDescriptor getNodeDescriptor(Object obj)
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method void verifyThreadAccess()>
		return mDocumentProvider.getNodeDescriptor(obj);
	//    2    4:aload_0         
	//    3    5:getfield        #111 <Field DocumentProvider mDocumentProvider>
	//    4    8:aload_1         
	//    5    9:invokeinterface #213 <Method NodeDescriptor DocumentProvider.getNodeDescriptor(Object)>
	//    6   14:areturn         
	}

	public Integer getNodeIdForElement(Object obj)
	{
		return mObjectIdMapper.getIdForObject(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ObjectIdMapper mObjectIdMapper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #331 <Method Integer ObjectIdMapper.getIdForObject(Object)>
	//    4    8:areturn         
	}

	public Object getRootElement()
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method void verifyThreadAccess()>
		Object obj = mDocumentProvider.getRootElement();
	//    2    4:aload_0         
	//    3    5:getfield        #111 <Field DocumentProvider mDocumentProvider>
	//    4    8:invokeinterface #187 <Method Object DocumentProvider.getRootElement()>
	//    5   13:astore_1        
		if(obj != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          39
		{
			if(obj == mShadowDocument.getRootElement())
	//*   8   18:aload_1         
	//*   9   19:aload_0         
	//*  10   20:getfield        #90  <Field ShadowDocument mShadowDocument>
	//*  11   23:invokevirtual   #190 <Method Object ShadowDocument.getRootElement()>
	//*  12   26:if_acmpne       31
				return obj;
	//   13   29:aload_1         
	//   14   30:areturn         
			else
				throw new IllegalStateException();
	//   15   31:new             #277 <Class IllegalStateException>
	//   16   34:dup             
	//   17   35:invokespecial   #278 <Method void IllegalStateException()>
	//   18   38:athrow          
		} else
		{
			throw new IllegalStateException();
	//   19   39:new             #277 <Class IllegalStateException>
	//   20   42:dup             
	//   21   43:invokespecial   #278 <Method void IllegalStateException()>
	//   22   46:athrow          
		}
	}

	public void hideHighlight()
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method void verifyThreadAccess()>
		mDocumentProvider.hideHighlight();
	//    2    4:aload_0         
	//    3    5:getfield        #111 <Field DocumentProvider mDocumentProvider>
	//    4    8:invokeinterface #429 <Method void DocumentProvider.hideHighlight()>
	//    5   13:return          
	}

	public void highlightElement(Object obj, int i)
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method void verifyThreadAccess()>
		mDocumentProvider.highlightElement(obj, i);
	//    2    4:aload_0         
	//    3    5:getfield        #111 <Field DocumentProvider mDocumentProvider>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokeinterface #433 <Method void DocumentProvider.highlightElement(Object, int)>
	//    7   15:return          
	}

	public void release()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		if(mReferenceCounter <= 0)
			break MISSING_BLOCK_LABEL_29;
	//    2    2:aload_0         
	//    3    3:getfield        #73  <Field int mReferenceCounter>
	//    4    6:ifle            29
		i = mReferenceCounter - 1;
	//    5    9:aload_0         
	//    6   10:getfield        #73  <Field int mReferenceCounter>
	//    7   13:iconst_1        
	//    8   14:isub            
	//    9   15:istore_1        
		mReferenceCounter = i;
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:putfield        #73  <Field int mReferenceCounter>
		if(i != 0)
			break MISSING_BLOCK_LABEL_29;
	//   13   21:iload_1         
	//   14   22:ifne            29
		cleanUp();
	//   15   25:aload_0         
	//   16   26:invokespecial   #435 <Method void cleanUp()>
		this;
	//   17   29:aload_0         
		JVM INSTR monitorexit ;
	//   18   30:monitorexit     
		return;
	//   19   31:return          
		Exception exception;
		exception;
	//   20   32:astore_2        
	//*  21   33:aload_0         
		throw exception;
	//   22   34:monitorexit     
	//   23   35:aload_2         
	//   24   36:athrow          
	}

	public void removeUpdateListener(UpdateListener updatelistener)
	{
		mUpdateListeners.remove(updatelistener);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field Document$UpdateListenerCollection mUpdateListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #438 <Method void Document$UpdateListenerCollection.remove(Document$UpdateListener)>
	//    4    8:return          
	}

	public void setAttributesAsText(Object obj, String s)
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method void verifyThreadAccess()>
		mDocumentProvider.setAttributesAsText(obj, s);
	//    2    4:aload_0         
	//    3    5:getfield        #111 <Field DocumentProvider mDocumentProvider>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #442 <Method void DocumentProvider.setAttributesAsText(Object, String)>
	//    7   15:return          
	}

	public void setInspectModeEnabled(boolean flag)
	{
		verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method void verifyThreadAccess()>
		mDocumentProvider.setInspectModeEnabled(flag);
	//    2    4:aload_0         
	//    3    5:getfield        #111 <Field DocumentProvider mDocumentProvider>
	//    4    8:iload_1         
	//    5    9:invokeinterface #446 <Method void DocumentProvider.setInspectModeEnabled(boolean)>
	//    6   14:return          
	}

	private AttributeListAccumulator mCachedAttributeAccumulator;
	private ChildEventingList mCachedChildEventingList;
	private ArrayListAccumulator mCachedChildrenAccumulator;
	private final Queue mCachedUpdateQueue = new ArrayDeque();
	private DocumentProvider mDocumentProvider;
	private final DocumentProviderFactory mFactory;
	private final ObjectIdMapper mObjectIdMapper = new DocumentObjectIdMapper();
	private int mReferenceCounter;
	private ShadowDocument mShadowDocument;
	private UpdateListenerCollection mUpdateListeners;


/*
	static ShadowDocument access$100(Document document)
	{
		return document.mShadowDocument;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field ShadowDocument mShadowDocument>
	//    2    4:areturn         
	}

*/


/*
	static void access$1000(ChildEventingList childeventinglist, List list, Accumulator accumulator)
	{
		updateListenerChildren(childeventinglist, list, accumulator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #95  <Method void updateListenerChildren(Document$ChildEventingList, List, Accumulator)>
		return;
	//    4    6:return          
	}

*/


/*
	static ShadowDocument access$102(Document document, ShadowDocument shadowdocument)
	{
		document.mShadowDocument = shadowdocument;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #90  <Field ShadowDocument mShadowDocument>
		return shadowdocument;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static void access$1100(Document document, ChildEventingList childeventinglist)
	{
		document.releaseChildEventingList(childeventinglist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #103 <Method void releaseChildEventingList(Document$ChildEventingList)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$1200(Document document)
	{
		document.updateTree();
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method void updateTree()>
		return;
	//    2    4:return          
	}

*/


/*
	static DocumentProvider access$200(Document document)
	{
		return document.mDocumentProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field DocumentProvider mDocumentProvider>
	//    2    4:areturn         
	}

*/


/*
	static DocumentProvider access$202(Document document, DocumentProvider documentprovider)
	{
		document.mDocumentProvider = documentprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #111 <Field DocumentProvider mDocumentProvider>
		return documentprovider;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static ShadowDocument.Update access$300(Document document)
	{
		return document.createShadowDocumentUpdate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #119 <Method ShadowDocument$Update createShadowDocumentUpdate()>
	//    2    4:areturn         
	}

*/


/*
	static ObjectIdMapper access$500(Document document)
	{
		return document.mObjectIdMapper;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ObjectIdMapper mObjectIdMapper>
	//    2    4:areturn         
	}

*/


/*
	static UpdateListenerCollection access$700(Document document)
	{
		return document.mUpdateListeners;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field Document$UpdateListenerCollection mUpdateListeners>
	//    2    4:areturn         
	}

*/


/*
	static ChildEventingList access$900(Document document, Object obj, DocumentView documentview)
	{
		return document.acquireChildEventingList(obj, documentview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #129 <Method Document$ChildEventingList acquireChildEventingList(Object, DocumentView)>
	//    4    6:areturn         
	}

*/

	// Unreferenced inner class com/facebook/stetho/inspector/elements/Document$5$1

/* anonymous class */
	class _cls1
		implements Accumulator
	{

		public void store(Object obj)
		{
			if(docUpdate.isElementChanged(obj))
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field Document$5 this$1>
		//*   2    4:getfield        #25  <Field ShadowDocument$Update Document$5.val$docUpdate>
		//*   3    7:aload_1         
		//*   4    8:invokevirtual   #31  <Method boolean ShadowDocument$Update.isElementChanged(Object)>
		//*   5   11:ifeq            26
				listenerInsertedElements.add(obj);
		//    6   14:aload_0         
		//    7   15:getfield        #15  <Field Document$5 this$1>
		//    8   18:invokestatic    #35  <Method HashSet Document$5.access$800(Document$5)>
		//    9   21:aload_1         
		//   10   22:invokevirtual   #40  <Method boolean HashSet.add(Object)>
		//   11   25:pop             
		//   12   26:return          
		}

		final _cls5 this$1;

			
			{
				this$1 = _cls5.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field Document$5 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
	}

}
