// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseError;
import com.firebase.client.collection.ImmutableSortedMap;
import com.firebase.client.core.operation.AckUserWrite;
import com.firebase.client.core.operation.ListenComplete;
import com.firebase.client.core.operation.Merge;
import com.firebase.client.core.operation.Operation;
import com.firebase.client.core.operation.OperationSource;
import com.firebase.client.core.operation.Overwrite;
import com.firebase.client.core.persistence.PersistenceManager;
import com.firebase.client.core.utilities.ImmutableTree;
import com.firebase.client.core.view.CacheNode;
import com.firebase.client.core.view.Change;
import com.firebase.client.core.view.DataEvent;
import com.firebase.client.core.view.QuerySpec;
import com.firebase.client.core.view.View;
import com.firebase.client.snapshot.*;
import com.firebase.client.utilities.*;
import java.util.*;
import java.util.concurrent.Callable;

// Referenced classes of package com.firebase.client.core:
//			WriteTree, Context, SyncPoint, Path, 
//			WriteTreeRef, Tag, RangeMerge, EventRegistration, 
//			CompoundWrite, CompoundHash, UserWriteRecord, ServerValues

public class SyncTree
{
	public static interface CompletionListener
	{

		public abstract List onListenComplete(FirebaseError firebaseerror);
	}

	private static class KeepSyncedEventRegistration extends EventRegistration
	{

		public EventRegistration clone(QuerySpec queryspec)
		{
			return ((EventRegistration) (new KeepSyncedEventRegistration(queryspec)));
		//    0    0:new             #2   <Class SyncTree$KeepSyncedEventRegistration>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #23  <Method void SyncTree$KeepSyncedEventRegistration(QuerySpec)>
		//    4    8:areturn         
		}

		public DataEvent createEvent(Change change, QuerySpec queryspec)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public boolean equals(Object obj)
		{
			return (obj instanceof KeepSyncedEventRegistration) && ((KeepSyncedEventRegistration)obj).spec.equals(((Object) (spec)));
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class SyncTree$KeepSyncedEventRegistration>
		//    2    4:ifeq            26
		//    3    7:aload_1         
		//    4    8:checkcast       #2   <Class SyncTree$KeepSyncedEventRegistration>
		//    5   11:getfield        #17  <Field QuerySpec spec>
		//    6   14:aload_0         
		//    7   15:getfield        #17  <Field QuerySpec spec>
		//    8   18:invokevirtual   #31  <Method boolean QuerySpec.equals(Object)>
		//    9   21:ifeq            26
		//   10   24:iconst_1        
		//   11   25:ireturn         
		//   12   26:iconst_0        
		//   13   27:ireturn         
		}

		public void fireCancelEvent(FirebaseError firebaseerror)
		{
		//    0    0:return          
		}

		public void fireEvent(DataEvent dataevent)
		{
		//    0    0:return          
		}

		public QuerySpec getQuerySpec()
		{
			return spec;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field QuerySpec spec>
		//    2    4:areturn         
		}

		public int hashCode()
		{
			return spec.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field QuerySpec spec>
		//    2    4:invokevirtual   #42  <Method int QuerySpec.hashCode()>
		//    3    7:ireturn         
		}

		public boolean isSameListener(EventRegistration eventregistration)
		{
			return eventregistration instanceof KeepSyncedEventRegistration;
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class SyncTree$KeepSyncedEventRegistration>
		//    2    4:ireturn         
		}

		public boolean respondsTo(com.firebase.client.core.view.Event.EventType eventtype)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		private QuerySpec spec;

		public KeepSyncedEventRegistration(QuerySpec queryspec)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void EventRegistration()>
			spec = queryspec;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field QuerySpec spec>
		//    5    9:return          
		}
	}

	private class ListenContainer
		implements CompletionListener, SyncTreeHash
	{

		public CompoundHash getCompoundHash()
		{
			return CompoundHash.fromNode(view.getServerCache());
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field View view>
		//    2    4:invokevirtual   #47  <Method Node View.getServerCache()>
		//    3    7:invokestatic    #53  <Method CompoundHash CompoundHash.fromNode(Node)>
		//    4   10:areturn         
		}

		public String getSimpleHash()
		{
			return view.getServerCache().getHash();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field View view>
		//    2    4:invokevirtual   #47  <Method Node View.getServerCache()>
		//    3    7:invokeinterface #60  <Method String Node.getHash()>
		//    4   12:areturn         
		}

		public List onListenComplete(FirebaseError firebaseerror)
		{
			if(firebaseerror == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       42
			{
				firebaseerror = ((FirebaseError) (view.getQuery()));
		//    2    4:aload_0         
		//    3    5:getfield        #26  <Field View view>
		//    4    8:invokevirtual   #32  <Method QuerySpec View.getQuery()>
		//    5   11:astore_1        
				Tag tag1 = tag;
		//    6   12:aload_0         
		//    7   13:getfield        #38  <Field Tag tag>
		//    8   16:astore_2        
				if(tag1 != null)
		//*   9   17:aload_2         
		//*  10   18:ifnull          30
					return applyTaggedListenComplete(tag1);
		//   11   21:aload_0         
		//   12   22:getfield        #21  <Field SyncTree this$0>
		//   13   25:aload_2         
		//   14   26:invokevirtual   #66  <Method List SyncTree.applyTaggedListenComplete(Tag)>
		//   15   29:areturn         
				else
					return applyListenComplete(((QuerySpec) (firebaseerror)).getPath());
		//   16   30:aload_0         
		//   17   31:getfield        #21  <Field SyncTree this$0>
		//   18   34:aload_1         
		//   19   35:invokevirtual   #72  <Method Path QuerySpec.getPath()>
		//   20   38:invokevirtual   #76  <Method List SyncTree.applyListenComplete(Path)>
		//   21   41:areturn         
			} else
			{
				LogWrapper logwrapper = logger;
		//   22   42:aload_0         
		//   23   43:getfield        #21  <Field SyncTree this$0>
		//   24   46:invokestatic    #80  <Method LogWrapper SyncTree.access$100(SyncTree)>
		//   25   49:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
		//   26   50:new             #82  <Class StringBuilder>
		//   27   53:dup             
		//   28   54:invokespecial   #83  <Method void StringBuilder()>
		//   29   57:astore_3        
				stringbuilder.append("Listen at ");
		//   30   58:aload_3         
		//   31   59:ldc1            #85  <String "Listen at ">
		//   32   61:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
		//   33   64:pop             
				stringbuilder.append(((Object) (view.getQuery().getPath())));
		//   34   65:aload_3         
		//   35   66:aload_0         
		//   36   67:getfield        #26  <Field View view>
		//   37   70:invokevirtual   #32  <Method QuerySpec View.getQuery()>
		//   38   73:invokevirtual   #72  <Method Path QuerySpec.getPath()>
		//   39   76:invokevirtual   #92  <Method StringBuilder StringBuilder.append(Object)>
		//   40   79:pop             
				stringbuilder.append(" failed: ");
		//   41   80:aload_3         
		//   42   81:ldc1            #94  <String " failed: ">
		//   43   83:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
		//   44   86:pop             
				stringbuilder.append(firebaseerror.toString());
		//   45   87:aload_3         
		//   46   88:aload_1         
		//   47   89:invokevirtual   #99  <Method String FirebaseError.toString()>
		//   48   92:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
		//   49   95:pop             
				logwrapper.warn(stringbuilder.toString());
		//   50   96:aload_2         
		//   51   97:aload_3         
		//   52   98:invokevirtual   #100 <Method String StringBuilder.toString()>
		//   53  101:invokevirtual   #106 <Method void LogWrapper.warn(String)>
				return removeAllEventRegistrations(view.getQuery(), firebaseerror);
		//   54  104:aload_0         
		//   55  105:getfield        #21  <Field SyncTree this$0>
		//   56  108:aload_0         
		//   57  109:getfield        #26  <Field View view>
		//   58  112:invokevirtual   #32  <Method QuerySpec View.getQuery()>
		//   59  115:aload_1         
		//   60  116:invokevirtual   #110 <Method List SyncTree.removeAllEventRegistrations(QuerySpec, FirebaseError)>
		//   61  119:areturn         
			}
		}

		public boolean shouldIncludeCompoundHash()
		{
			return NodeSizeEstimator.estimateSerializedNodeSize(view.getServerCache()) > 1024L;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field View view>
		//    2    4:invokevirtual   #47  <Method Node View.getServerCache()>
		//    3    7:invokestatic    #120 <Method long NodeSizeEstimator.estimateSerializedNodeSize(Node)>
		//    4   10:ldc2w           #121 <Long 1024L>
		//    5   13:lcmp            
		//    6   14:ifle            19
		//    7   17:iconst_1        
		//    8   18:ireturn         
		//    9   19:iconst_0        
		//   10   20:ireturn         
		}

		private final Tag tag;
		final SyncTree this$0;
		private final View view;


/*
		static Tag access$1400(ListenContainer listencontainer)
		{
			return listencontainer.tag;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field Tag tag>
		//    2    4:areturn         
		}

*/

		public ListenContainer(View view1)
		{
			this$0 = SyncTree.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field SyncTree this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
			view = view1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field View view>
			tag = tagForQuery(view1.getQuery());
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:aload_2         
		//   11   17:invokevirtual   #32  <Method QuerySpec View.getQuery()>
		//   12   20:invokestatic    #36  <Method Tag SyncTree.access$000(SyncTree, QuerySpec)>
		//   13   23:putfield        #38  <Field Tag tag>
		//   14   26:return          
		}
	}

	public static interface ListenProvider
	{

		public abstract void startListening(QuerySpec queryspec, Tag tag, SyncTreeHash synctreehash, CompletionListener completionlistener);

		public abstract void stopListening(QuerySpec queryspec, Tag tag);
	}

	public static interface SyncTreeHash
	{

		public abstract CompoundHash getCompoundHash();

		public abstract String getSimpleHash();

		public abstract boolean shouldIncludeCompoundHash();
	}


	public SyncTree(Context context, PersistenceManager persistencemanager, ListenProvider listenprovider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void Object()>
		nextQueryTag = 1L;
	//    2    4:aload_0         
	//    3    5:lconst_1        
	//    4    6:putfield        #83  <Field long nextQueryTag>
		syncPointTree = ImmutableTree.emptyInstance();
	//    5    9:aload_0         
	//    6   10:invokestatic    #89  <Method ImmutableTree ImmutableTree.emptyInstance()>
	//    7   13:putfield        #91  <Field ImmutableTree syncPointTree>
	//    8   16:aload_0         
	//    9   17:new             #93  <Class WriteTree>
	//   10   20:dup             
	//   11   21:invokespecial   #94  <Method void WriteTree()>
	//   12   24:putfield        #96  <Field WriteTree pendingWriteTree>
	//   13   27:aload_0         
	//   14   28:new             #98  <Class HashMap>
	//   15   31:dup             
	//   16   32:invokespecial   #99  <Method void HashMap()>
	//   17   35:putfield        #101 <Field Map tagToQueryMap>
	//   18   38:aload_0         
	//   19   39:new             #98  <Class HashMap>
	//   20   42:dup             
	//   21   43:invokespecial   #99  <Method void HashMap()>
	//   22   46:putfield        #103 <Field Map queryToTagMap>
	//   23   49:aload_0         
	//   24   50:new             #105 <Class HashSet>
	//   25   53:dup             
	//   26   54:invokespecial   #106 <Method void HashSet()>
	//   27   57:putfield        #108 <Field Set keepSyncedQueries>
		listenProvider = listenprovider;
	//   28   60:aload_0         
	//   29   61:aload_3         
	//   30   62:putfield        #110 <Field SyncTree$ListenProvider listenProvider>
		persistenceManager = persistencemanager;
	//   31   65:aload_0         
	//   32   66:aload_2         
	//   33   67:putfield        #112 <Field PersistenceManager persistenceManager>
		logger = context.getLogger("SyncTree");
	//   34   70:aload_0         
	//   35   71:aload_1         
	//   36   72:ldc1            #114 <String "SyncTree">
	//   37   74:invokevirtual   #120 <Method LogWrapper Context.getLogger(String)>
	//   38   77:putfield        #122 <Field LogWrapper logger>
	//   39   80:return          
	}

	private List applyOperationDescendantsHelper(final Operation operation, ImmutableTree immutabletree, final Node events, final WriteTreeRef writesCache)
	{
		SyncPoint syncpoint = (SyncPoint)immutabletree.getValue();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #201 <Method Object ImmutableTree.getValue()>
	//    2    4:checkcast       #203 <Class SyncPoint>
	//    3    7:astore          6
		final Node resolvedServerCache = events;
	//    4    9:aload_3         
	//    5   10:astore          5
		if(events == null)
	//*   6   12:aload_3         
	//*   7   13:ifnonnull       34
		{
			resolvedServerCache = events;
	//    8   16:aload_3         
	//    9   17:astore          5
			if(syncpoint != null)
	//*  10   19:aload           6
	//*  11   21:ifnull          34
				resolvedServerCache = syncpoint.getCompleteServerCache(Path.getEmptyPath());
	//   12   24:aload           6
	//   13   26:invokestatic    #209 <Method Path Path.getEmptyPath()>
	//   14   29:invokevirtual   #213 <Method Node SyncPoint.getCompleteServerCache(Path)>
	//   15   32:astore          5
		}
		events = ((Node) (new ArrayList()));
	//   16   34:new             #215 <Class ArrayList>
	//   17   37:dup             
	//   18   38:invokespecial   #216 <Method void ArrayList()>
	//   19   41:astore_3        
		immutabletree.getChildren().inOrderTraversal(((com.firebase.client.collection.LLRBNode.NodeVisitor) (new com.firebase.client.collection.LLRBNode.NodeVisitor() {

			public void visitEntry(ChildKey childkey, ImmutableTree immutabletree1)
			{
				Node node = resolvedServerCache;
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field Node val$resolvedServerCache>
			//    2    4:astore_3        
				if(node != null)
			//*   3    5:aload_3         
			//*   4    6:ifnull          20
					node = node.getImmediateChild(childkey);
			//    5    9:aload_3         
			//    6   10:aload_1         
			//    7   11:invokeinterface #44  <Method Node Node.getImmediateChild(ChildKey)>
			//    8   16:astore_3        
				else
			//*   9   17:goto            22
					node = null;
			//   10   20:aconst_null     
			//   11   21:astore_3        
				WriteTreeRef writetreeref = writesCache.child(childkey);
			//   12   22:aload_0         
			//   13   23:getfield        #28  <Field WriteTreeRef val$writesCache>
			//   14   26:aload_1         
			//   15   27:invokevirtual   #50  <Method WriteTreeRef WriteTreeRef.child(ChildKey)>
			//   16   30:astore          4
				childkey = ((ChildKey) (operation.operationForChild(childkey)));
			//   17   32:aload_0         
			//   18   33:getfield        #30  <Field Operation val$operation>
			//   19   36:aload_1         
			//   20   37:invokevirtual   #56  <Method Operation Operation.operationForChild(ChildKey)>
			//   21   40:astore_1        
				if(childkey != null)
			//*  22   41:aload_1         
			//*  23   42:ifnull          67
					events.addAll(((java.util.Collection) (applyOperationDescendantsHelper(((Operation) (childkey)), immutabletree1, node, writetreeref))));
			//   24   45:aload_0         
			//   25   46:getfield        #32  <Field List val$events>
			//   26   49:aload_0         
			//   27   50:getfield        #24  <Field SyncTree this$0>
			//   28   53:aload_1         
			//   29   54:aload_2         
			//   30   55:aload_3         
			//   31   56:aload           4
			//   32   58:invokestatic    #60  <Method List SyncTree.access$1700(SyncTree, Operation, ImmutableTree, Node, WriteTreeRef)>
			//   33   61:invokeinterface #66  <Method boolean List.addAll(java.util.Collection)>
			//   34   66:pop             
			//   35   67:return          
			}

			public volatile void visitEntry(Object obj, Object obj1)
			{
				visitEntry((ChildKey)obj, (ImmutableTree)obj1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #71  <Class ChildKey>
			//    3    5:aload_2         
			//    4    6:checkcast       #73  <Class ImmutableTree>
			//    5    9:invokevirtual   #75  <Method void visitEntry(ChildKey, ImmutableTree)>
			//    6   12:return          
			}

			final SyncTree this$0;
			final List val$events;
			final Operation val$operation;
			final Node val$resolvedServerCache;
			final WriteTreeRef val$writesCache;

			
			{
				this$0 = SyncTree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field SyncTree this$0>
				resolvedServerCache = node;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field Node val$resolvedServerCache>
				writesCache = writetreeref;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field WriteTreeRef val$writesCache>
				operation = operation1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field Operation val$operation>
				events = list;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #32  <Field List val$events>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #35  <Method void com.firebase.client.collection.LLRBNode$NodeVisitor()>
			//   17   31:return          
			}
		}
)));
	//   20   42:aload_2         
	//   21   43:invokevirtual   #220 <Method ImmutableSortedMap ImmutableTree.getChildren()>
	//   22   46:new             #16  <Class SyncTree$14>
	//   23   49:dup             
	//   24   50:aload_0         
	//   25   51:aload           5
	//   26   53:aload           4
	//   27   55:aload_1         
	//   28   56:aload_3         
	//   29   57:invokespecial   #223 <Method void SyncTree$14(SyncTree, Node, WriteTreeRef, Operation, List)>
	//   30   60:invokevirtual   #229 <Method void ImmutableSortedMap.inOrderTraversal(com.firebase.client.collection.LLRBNode$NodeVisitor)>
		if(syncpoint != null)
	//*  31   63:aload           6
	//*  32   65:ifnull          85
			((List) (events)).addAll(((java.util.Collection) (syncpoint.applyOperation(operation, writesCache, resolvedServerCache))));
	//   33   68:aload_3         
	//   34   69:aload           6
	//   35   71:aload_1         
	//   36   72:aload           4
	//   37   74:aload           5
	//   38   76:invokevirtual   #233 <Method List SyncPoint.applyOperation(Operation, WriteTreeRef, Node)>
	//   39   79:invokeinterface #239 <Method boolean List.addAll(java.util.Collection)>
	//   40   84:pop             
		return ((List) (events));
	//   41   85:aload_3         
	//   42   86:areturn         
	}

	private List applyOperationHelper(Operation operation, ImmutableTree immutabletree, Node node, WriteTreeRef writetreeref)
	{
		if(operation.getPath().isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #247 <Method Path Operation.getPath()>
	//*   2    4:invokevirtual   #251 <Method boolean Path.isEmpty()>
	//*   3    7:ifeq            20
			return applyOperationDescendantsHelper(operation, immutabletree, node, writetreeref);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:aload           4
	//    9   16:invokespecial   #164 <Method List applyOperationDescendantsHelper(Operation, ImmutableTree, Node, WriteTreeRef)>
	//   10   19:areturn         
		SyncPoint syncpoint = (SyncPoint)immutabletree.getValue();
	//   11   20:aload_2         
	//   12   21:invokevirtual   #201 <Method Object ImmutableTree.getValue()>
	//   13   24:checkcast       #203 <Class SyncPoint>
	//   14   27:astore          6
		Node node1 = node;
	//   15   29:aload_3         
	//   16   30:astore          5
		if(node == null)
	//*  17   32:aload_3         
	//*  18   33:ifnonnull       54
		{
			node1 = node;
	//   19   36:aload_3         
	//   20   37:astore          5
			if(syncpoint != null)
	//*  21   39:aload           6
	//*  22   41:ifnull          54
				node1 = syncpoint.getCompleteServerCache(Path.getEmptyPath());
	//   23   44:aload           6
	//   24   46:invokestatic    #209 <Method Path Path.getEmptyPath()>
	//   25   49:invokevirtual   #213 <Method Node SyncPoint.getCompleteServerCache(Path)>
	//   26   52:astore          5
		}
		node = ((Node) (new ArrayList()));
	//   27   54:new             #215 <Class ArrayList>
	//   28   57:dup             
	//   29   58:invokespecial   #216 <Method void ArrayList()>
	//   30   61:astore_3        
		ChildKey childkey = operation.getPath().getFront();
	//   31   62:aload_1         
	//   32   63:invokevirtual   #247 <Method Path Operation.getPath()>
	//   33   66:invokevirtual   #255 <Method ChildKey Path.getFront()>
	//   34   69:astore          7
		Operation operation1 = operation.operationForChild(childkey);
	//   35   71:aload_1         
	//   36   72:aload           7
	//   37   74:invokevirtual   #259 <Method Operation Operation.operationForChild(ChildKey)>
	//   38   77:astore          8
		ImmutableTree immutabletree1 = (ImmutableTree)immutabletree.getChildren().get(((Object) (childkey)));
	//   39   79:aload_2         
	//   40   80:invokevirtual   #220 <Method ImmutableSortedMap ImmutableTree.getChildren()>
	//   41   83:aload           7
	//   42   85:invokevirtual   #263 <Method Object ImmutableSortedMap.get(Object)>
	//   43   88:checkcast       #85  <Class ImmutableTree>
	//   44   91:astore          9
		if(immutabletree1 != null && operation1 != null)
	//*  45   93:aload           9
	//*  46   95:ifnull          146
	//*  47   98:aload           8
	//*  48  100:ifnull          146
		{
			if(node1 != null)
	//*  49  103:aload           5
	//*  50  105:ifnull          121
				immutabletree = ((ImmutableTree) (node1.getImmediateChild(childkey)));
	//   51  108:aload           5
	//   52  110:aload           7
	//   53  112:invokeinterface #269 <Method Node Node.getImmediateChild(ChildKey)>
	//   54  117:astore_2        
			else
	//*  55  118:goto            123
				immutabletree = null;
	//   56  121:aconst_null     
	//   57  122:astore_2        
			((List) (node)).addAll(((java.util.Collection) (applyOperationHelper(operation1, immutabletree1, ((Node) (immutabletree)), writetreeref.child(childkey)))));
	//   58  123:aload_3         
	//   59  124:aload_0         
	//   60  125:aload           8
	//   61  127:aload           9
	//   62  129:aload_2         
	//   63  130:aload           4
	//   64  132:aload           7
	//   65  134:invokevirtual   #275 <Method WriteTreeRef WriteTreeRef.child(ChildKey)>
	//   66  137:invokespecial   #277 <Method List applyOperationHelper(Operation, ImmutableTree, Node, WriteTreeRef)>
	//   67  140:invokeinterface #239 <Method boolean List.addAll(java.util.Collection)>
	//   68  145:pop             
		}
		if(syncpoint != null)
	//*  69  146:aload           6
	//*  70  148:ifnull          168
			((List) (node)).addAll(((java.util.Collection) (syncpoint.applyOperation(operation, writetreeref, node1))));
	//   71  151:aload_3         
	//   72  152:aload           6
	//   73  154:aload_1         
	//   74  155:aload           4
	//   75  157:aload           5
	//   76  159:invokevirtual   #233 <Method List SyncPoint.applyOperation(Operation, WriteTreeRef, Node)>
	//   77  162:invokeinterface #239 <Method boolean List.addAll(java.util.Collection)>
	//   78  167:pop             
		return ((List) (node));
	//   79  168:aload_3         
	//   80  169:areturn         
	}

	private List applyOperationToSyncPoints(Operation operation)
	{
		return applyOperationHelper(operation, syncPointTree, ((Node) (null)), pendingWriteTree.childWrites(Path.getEmptyPath()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #91  <Field ImmutableTree syncPointTree>
	//    4    6:aconst_null     
	//    5    7:aload_0         
	//    6    8:getfield        #96  <Field WriteTree pendingWriteTree>
	//    7   11:invokestatic    #209 <Method Path Path.getEmptyPath()>
	//    8   14:invokevirtual   #281 <Method WriteTreeRef WriteTree.childWrites(Path)>
	//    9   17:invokespecial   #277 <Method List applyOperationHelper(Operation, ImmutableTree, Node, WriteTreeRef)>
	//   10   20:areturn         
	}

	private List applyTaggedOperation(QuerySpec queryspec, Operation operation)
	{
		queryspec = ((QuerySpec) (queryspec.getPath()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #285 <Method Path QuerySpec.getPath()>
	//    2    4:astore_1        
		return ((SyncPoint)syncPointTree.get(((Path) (queryspec)))).applyOperation(operation, pendingWriteTree.childWrites(((Path) (queryspec))), ((Node) (null)));
	//    3    5:aload_0         
	//    4    6:getfield        #91  <Field ImmutableTree syncPointTree>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #288 <Method Object ImmutableTree.get(Path)>
	//    7   13:checkcast       #203 <Class SyncPoint>
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:getfield        #96  <Field WriteTree pendingWriteTree>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #281 <Method WriteTreeRef WriteTree.childWrites(Path)>
	//   13   25:aconst_null     
	//   14   26:invokevirtual   #233 <Method List SyncPoint.applyOperation(Operation, WriteTreeRef, Node)>
	//   15   29:areturn         
	}

	private List collectDistinctViewsForSubTree(ImmutableTree immutabletree)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #215 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #216 <Method void ArrayList()>
	//    3    7:astore_2        
		collectDistinctViewsForSubTree(immutabletree, ((List) (arraylist)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #292 <Method void collectDistinctViewsForSubTree(ImmutableTree, List)>
		return ((List) (arraylist));
	//    8   14:aload_2         
	//    9   15:areturn         
	}

	private void collectDistinctViewsForSubTree(ImmutableTree immutabletree, List list)
	{
		SyncPoint syncpoint = (SyncPoint)immutabletree.getValue();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #201 <Method Object ImmutableTree.getValue()>
	//    2    4:checkcast       #203 <Class SyncPoint>
	//    3    7:astore_3        
		if(syncpoint != null && syncpoint.hasCompleteView())
	//*   4    8:aload_3         
	//*   5    9:ifnull          31
	//*   6   12:aload_3         
	//*   7   13:invokevirtual   #296 <Method boolean SyncPoint.hasCompleteView()>
	//*   8   16:ifeq            31
		{
			list.add(((Object) (syncpoint.getCompleteView())));
	//    9   19:aload_2         
	//   10   20:aload_3         
	//   11   21:invokevirtual   #300 <Method View SyncPoint.getCompleteView()>
	//   12   24:invokeinterface #304 <Method boolean List.add(Object)>
	//   13   29:pop             
			return;
	//   14   30:return          
		}
		if(syncpoint != null)
	//*  15   31:aload_3         
	//*  16   32:ifnull          46
			list.addAll(((java.util.Collection) (syncpoint.getQueryViews())));
	//   17   35:aload_2         
	//   18   36:aload_3         
	//   19   37:invokevirtual   #308 <Method List SyncPoint.getQueryViews()>
	//   20   40:invokeinterface #239 <Method boolean List.addAll(java.util.Collection)>
	//   21   45:pop             
		for(immutabletree = ((ImmutableTree) (immutabletree.getChildren().iterator())); ((Iterator) (immutabletree)).hasNext(); collectDistinctViewsForSubTree((ImmutableTree)((java.util.Map.Entry)((Iterator) (immutabletree)).next()).getValue(), list));
	//   22   46:aload_1         
	//   23   47:invokevirtual   #220 <Method ImmutableSortedMap ImmutableTree.getChildren()>
	//   24   50:invokevirtual   #312 <Method Iterator ImmutableSortedMap.iterator()>
	//   25   53:astore_1        
	//   26   54:aload_1         
	//   27   55:invokeinterface #317 <Method boolean Iterator.hasNext()>
	//   28   60:ifeq            88
	//   29   63:aload_0         
	//   30   64:aload_1         
	//   31   65:invokeinterface #320 <Method Object Iterator.next()>
	//   32   70:checkcast       #322 <Class java.util.Map$Entry>
	//   33   73:invokeinterface #323 <Method Object java.util.Map$Entry.getValue()>
	//   34   78:checkcast       #85  <Class ImmutableTree>
	//   35   81:aload_2         
	//   36   82:invokespecial   #292 <Method void collectDistinctViewsForSubTree(ImmutableTree, List)>
	//*  37   85:goto            54
	//   38   88:return          
	}

	private Tag getNextQueryTag()
	{
		long l = nextQueryTag;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field long nextQueryTag>
	//    2    4:lstore_1        
		nextQueryTag = 1L + l;
	//    3    5:aload_0         
	//    4    6:lconst_1        
	//    5    7:lload_1         
	//    6    8:ladd            
	//    7    9:putfield        #83  <Field long nextQueryTag>
		return new Tag(l);
	//    8   12:new             #326 <Class Tag>
	//    9   15:dup             
	//   10   16:lload_1         
	//   11   17:invokespecial   #329 <Method void Tag(long)>
	//   12   20:areturn         
	}

	private QuerySpec queryForListening(QuerySpec queryspec)
	{
		if(queryspec.loadsAllData() && !queryspec.isDefault())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #332 <Method boolean QuerySpec.loadsAllData()>
	//*   2    4:ifeq            22
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #335 <Method boolean QuerySpec.isDefault()>
	//*   5   11:ifne            22
			return QuerySpec.defaultQueryAtPath(queryspec.getPath());
	//    6   14:aload_1         
	//    7   15:invokevirtual   #285 <Method Path QuerySpec.getPath()>
	//    8   18:invokestatic    #339 <Method QuerySpec QuerySpec.defaultQueryAtPath(Path)>
	//    9   21:areturn         
		else
			return queryspec;
	//   10   22:aload_1         
	//   11   23:areturn         
	}

	private QuerySpec queryForTag(Tag tag)
	{
		return (QuerySpec)tagToQueryMap.get(((Object) (tag)));
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Map tagToQueryMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #342 <Method Object Map.get(Object)>
	//    4   10:checkcast       #284 <Class QuerySpec>
	//    5   13:areturn         
	}

	private List removeEventRegistration(final QuerySpec query, final EventRegistration eventRegistration, final FirebaseError cancelError)
	{
		return (List)persistenceManager.runInTransaction(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #45  <Method List call()>
			//    2    4:areturn         
			}

			public List call()
			{
				Object obj;
label0:
				{
					Path path = query.getPath();
			//    0    0:aload_0         
			//    1    1:getfield        #32  <Field QuerySpec val$query>
			//    2    4:invokevirtual   #52  <Method Path QuerySpec.getPath()>
			//    3    7:astore          9
					SyncPoint syncpoint = (SyncPoint)syncPointTree.get(path);
			//    4    9:aload_0         
			//    5   10:getfield        #30  <Field SyncTree this$0>
			//    6   13:invokestatic    #56  <Method ImmutableTree SyncTree.access$700(SyncTree)>
			//    7   16:aload           9
			//    8   18:invokevirtual   #62  <Method Object ImmutableTree.get(Path)>
			//    9   21:checkcast       #64  <Class SyncPoint>
			//   10   24:astore          7
					Object obj1 = ((Object) (new ArrayList()));
			//   11   26:new             #66  <Class ArrayList>
			//   12   29:dup             
			//   13   30:invokespecial   #67  <Method void ArrayList()>
			//   14   33:astore          6
					obj = obj1;
			//   15   35:aload           6
			//   16   37:astore          5
					if(syncpoint == null)
						break label0;
			//   17   39:aload           7
			//   18   41:ifnull          606
					if(!query.isDefault())
			//*  19   44:aload_0         
			//*  20   45:getfield        #32  <Field QuerySpec val$query>
			//*  21   48:invokevirtual   #71  <Method boolean QuerySpec.isDefault()>
			//*  22   51:ifne            70
					{
						obj = obj1;
			//   23   54:aload           6
			//   24   56:astore          5
						if(!syncpoint.viewExistsForQuery(query))
							break label0;
			//   25   58:aload           7
			//   26   60:aload_0         
			//   27   61:getfield        #32  <Field QuerySpec val$query>
			//   28   64:invokevirtual   #75  <Method boolean SyncPoint.viewExistsForQuery(QuerySpec)>
			//   29   67:ifeq            606
					}
					obj = ((Object) (syncpoint.removeEventRegistration(query, eventRegistration, cancelError)));
			//   30   70:aload           7
			//   31   72:aload_0         
			//   32   73:getfield        #32  <Field QuerySpec val$query>
			//   33   76:aload_0         
			//   34   77:getfield        #34  <Field EventRegistration val$eventRegistration>
			//   35   80:aload_0         
			//   36   81:getfield        #36  <Field FirebaseError val$cancelError>
			//   37   84:invokevirtual   #78  <Method Pair SyncPoint.removeEventRegistration(QuerySpec, EventRegistration, FirebaseError)>
			//   38   87:astore          5
					if(syncpoint.isEmpty())
			//*  39   89:aload           7
			//*  40   91:invokevirtual   #81  <Method boolean SyncPoint.isEmpty()>
			//*  41   94:ifeq            119
					{
						obj1 = ((Object) (SyncTree.this));
			//   42   97:aload_0         
			//   43   98:getfield        #30  <Field SyncTree this$0>
			//   44  101:astore          6
						obj1.syncPointTree = ((SyncTree) (obj1)).syncPointTree.remove(path);
			//   45  103:aload           6
			//   46  105:aload           6
			//   47  107:invokestatic    #56  <Method ImmutableTree SyncTree.access$700(SyncTree)>
			//   48  110:aload           9
			//   49  112:invokevirtual   #85  <Method ImmutableTree ImmutableTree.remove(Path)>
			//   50  115:invokestatic    #89  <Method ImmutableTree SyncTree.access$702(SyncTree, ImmutableTree)>
			//   51  118:pop             
					}
					List list = (List)((Pair) (obj)).getFirst();
			//   52  119:aload           5
			//   53  121:invokevirtual   #94  <Method Object Pair.getFirst()>
			//   54  124:checkcast       #96  <Class List>
			//   55  127:astore          8
					obj1 = ((Object) ((List)((Pair) (obj)).getSecond()));
			//   56  129:aload           5
			//   57  131:invokevirtual   #99  <Method Object Pair.getSecond()>
			//   58  134:checkcast       #96  <Class List>
			//   59  137:astore          6
					obj = ((Object) (list.iterator()));
			//   60  139:aload           8
			//   61  141:invokeinterface #103 <Method Iterator List.iterator()>
			//   62  146:astore          5
					boolean flag1 = false;
			//   63  148:iconst_0        
			//   64  149:istore_2        
					while(((Iterator) (obj)).hasNext()) 
			//*  65  150:aload           5
			//*  66  152:invokeinterface #108 <Method boolean Iterator.hasNext()>
			//*  67  157:ifeq            213
					{
						QuerySpec queryspec = (QuerySpec)((Iterator) (obj)).next();
			//   68  160:aload           5
			//   69  162:invokeinterface #111 <Method Object Iterator.next()>
			//   70  167:checkcast       #48  <Class QuerySpec>
			//   71  170:astore          7
						persistenceManager.setQueryInactive(query);
			//   72  172:aload_0         
			//   73  173:getfield        #30  <Field SyncTree this$0>
			//   74  176:invokestatic    #115 <Method PersistenceManager SyncTree.access$200(SyncTree)>
			//   75  179:aload_0         
			//   76  180:getfield        #32  <Field QuerySpec val$query>
			//   77  183:invokeinterface #121 <Method void PersistenceManager.setQueryInactive(QuerySpec)>
						if(!flag1 && !queryspec.loadsAllData())
			//*  78  188:iload_2         
			//*  79  189:ifne            208
			//*  80  192:aload           7
			//*  81  194:invokevirtual   #124 <Method boolean QuerySpec.loadsAllData()>
			//*  82  197:ifeq            203
			//*  83  200:goto            208
							flag1 = false;
			//   84  203:iconst_0        
			//   85  204:istore_2        
						else
			//*  86  205:goto            150
							flag1 = true;
			//   87  208:iconst_1        
			//   88  209:istore_2        
					}
			//*  89  210:goto            150
					obj = ((Object) (syncPointTree));
			//   90  213:aload_0         
			//   91  214:getfield        #30  <Field SyncTree this$0>
			//   92  217:invokestatic    #56  <Method ImmutableTree SyncTree.access$700(SyncTree)>
			//   93  220:astore          5
					boolean flag2;
					if(((ImmutableTree) (obj)).getValue() != null && ((SyncPoint)((ImmutableTree) (obj)).getValue()).hasCompleteView())
			//*  94  222:aload           5
			//*  95  224:invokevirtual   #127 <Method Object ImmutableTree.getValue()>
			//*  96  227:ifnull          249
			//*  97  230:aload           5
			//*  98  232:invokevirtual   #127 <Method Object ImmutableTree.getValue()>
			//*  99  235:checkcast       #64  <Class SyncPoint>
			//* 100  238:invokevirtual   #130 <Method boolean SyncPoint.hasCompleteView()>
			//* 101  241:ifeq            249
						flag2 = true;
			//  102  244:iconst_1        
			//  103  245:istore_3        
					else
			//* 104  246:goto            251
						flag2 = false;
			//  105  249:iconst_0        
			//  106  250:istore_3        
					Iterator iterator = path.iterator();
			//  107  251:aload           9
			//  108  253:invokevirtual   #133 <Method Iterator Path.iterator()>
			//  109  256:astore          10
					boolean flag3;
					do
					{
						flag3 = flag2;
			//  110  258:iload_3         
			//  111  259:istore          4
						if(!iterator.hasNext())
							break;
			//  112  261:aload           10
			//  113  263:invokeinterface #108 <Method boolean Iterator.hasNext()>
			//  114  268:ifeq            348
						ImmutableTree immutabletree = ((ImmutableTree) (obj)).getChild((ChildKey)iterator.next());
			//  115  271:aload           5
			//  116  273:aload           10
			//  117  275:invokeinterface #111 <Method Object Iterator.next()>
			//  118  280:checkcast       #135 <Class ChildKey>
			//  119  283:invokevirtual   #139 <Method ImmutableTree ImmutableTree.getChild(ChildKey)>
			//  120  286:astore          7
						boolean flag;
						if(!flag2 && (immutabletree.getValue() == null || !((SyncPoint)immutabletree.getValue()).hasCompleteView()))
			//* 121  288:iload_3         
			//* 122  289:ifne            322
			//* 123  292:aload           7
			//* 124  294:invokevirtual   #127 <Method Object ImmutableTree.getValue()>
			//* 125  297:ifnull          317
			//* 126  300:aload           7
			//* 127  302:invokevirtual   #127 <Method Object ImmutableTree.getValue()>
			//* 128  305:checkcast       #64  <Class SyncPoint>
			//* 129  308:invokevirtual   #130 <Method boolean SyncPoint.hasCompleteView()>
			//* 130  311:ifeq            317
			//* 131  314:goto            322
							flag = false;
			//  132  317:iconst_0        
			//  133  318:istore_1        
						else
			//* 134  319:goto            324
							flag = true;
			//  135  322:iconst_1        
			//  136  323:istore_1        
						flag3 = flag;
			//  137  324:iload_1         
			//  138  325:istore          4
						if(flag)
							break;
			//  139  327:iload_1         
			//  140  328:ifne            348
						obj = ((Object) (immutabletree));
			//  141  331:aload           7
			//  142  333:astore          5
						flag2 = flag;
			//  143  335:iload_1         
			//  144  336:istore_3        
						if(!immutabletree.isEmpty())
							continue;
			//  145  337:aload           7
			//  146  339:invokevirtual   #140 <Method boolean ImmutableTree.isEmpty()>
			//  147  342:ifeq            258
						flag3 = flag;
			//  148  345:iload_1         
			//  149  346:istore          4
						break;
					} while(true);
					if(flag1 && !flag3)
			//* 150  348:iload_2         
			//* 151  349:ifeq            472
			//* 152  352:iload           4
			//* 153  354:ifne            472
					{
						obj = ((Object) (syncPointTree.subtree(path)));
			//  154  357:aload_0         
			//  155  358:getfield        #30  <Field SyncTree this$0>
			//  156  361:invokestatic    #56  <Method ImmutableTree SyncTree.access$700(SyncTree)>
			//  157  364:aload           9
			//  158  366:invokevirtual   #143 <Method ImmutableTree ImmutableTree.subtree(Path)>
			//  159  369:astore          5
						if(!((ImmutableTree) (obj)).isEmpty())
			//* 160  371:aload           5
			//* 161  373:invokevirtual   #140 <Method boolean ImmutableTree.isEmpty()>
			//* 162  376:ifne            472
						{
							ListenContainer listencontainer;
							Object obj2;
							for(obj = ((Object) (collectDistinctViewsForSubTree(((ImmutableTree) (obj))).iterator())); ((Iterator) (obj)).hasNext(); listenProvider.startListening(queryForListening(((QuerySpec) (obj2))), listencontainer.tag, ((SyncTreeHash) (listencontainer)), ((CompletionListener) (listencontainer))))
			//* 163  379:aload_0         
			//* 164  380:getfield        #30  <Field SyncTree this$0>
			//* 165  383:aload           5
			//* 166  385:invokestatic    #147 <Method List SyncTree.access$1200(SyncTree, ImmutableTree)>
			//* 167  388:invokeinterface #103 <Method Iterator List.iterator()>
			//* 168  393:astore          5
			//* 169  395:aload           5
			//* 170  397:invokeinterface #108 <Method boolean Iterator.hasNext()>
			//* 171  402:ifeq            472
							{
								obj2 = ((Object) ((View)((Iterator) (obj)).next()));
			//  172  405:aload           5
			//  173  407:invokeinterface #111 <Method Object Iterator.next()>
			//  174  412:checkcast       #149 <Class View>
			//  175  415:astore          9
								listencontainer = new ListenContainer(((View) (obj2)));
			//  176  417:new             #151 <Class SyncTree$ListenContainer>
			//  177  420:dup             
			//  178  421:aload_0         
			//  179  422:getfield        #30  <Field SyncTree this$0>
			//  180  425:aload           9
			//  181  427:invokespecial   #154 <Method void SyncTree$ListenContainer(SyncTree, View)>
			//  182  430:astore          7
								obj2 = ((Object) (((View) (obj2)).getQuery()));
			//  183  432:aload           9
			//  184  434:invokevirtual   #158 <Method QuerySpec View.getQuery()>
			//  185  437:astore          9
							}

			//  186  439:aload_0         
			//  187  440:getfield        #30  <Field SyncTree this$0>
			//  188  443:invokestatic    #162 <Method SyncTree$ListenProvider SyncTree.access$1500(SyncTree)>
			//  189  446:aload_0         
			//  190  447:getfield        #30  <Field SyncTree this$0>
			//  191  450:aload           9
			//  192  452:invokestatic    #166 <Method QuerySpec SyncTree.access$1300(SyncTree, QuerySpec)>
			//  193  455:aload           7
			//  194  457:invokestatic    #170 <Method Tag SyncTree$ListenContainer.access$1400(SyncTree$ListenContainer)>
			//  195  460:aload           7
			//  196  462:aload           7
			//  197  464:invokeinterface #176 <Method void SyncTree$ListenProvider.startListening(QuerySpec, Tag, SyncTree$SyncTreeHash, SyncTree$CompletionListener)>
						}
					}
			//* 198  469:goto            395
					if(!flag3 && !list.isEmpty() && cancelError == null)
			//* 199  472:iload           4
			//* 200  474:ifne            593
			//* 201  477:aload           8
			//* 202  479:invokeinterface #177 <Method boolean List.isEmpty()>
			//* 203  484:ifne            593
			//* 204  487:aload_0         
			//* 205  488:getfield        #36  <Field FirebaseError val$cancelError>
			//* 206  491:ifnonnull       593
						if(flag1)
			//* 207  494:iload_2         
			//* 208  495:ifeq            525
						{
							listenProvider.stopListening(queryForListening(query), ((Tag) (null)));
			//  209  498:aload_0         
			//  210  499:getfield        #30  <Field SyncTree this$0>
			//  211  502:invokestatic    #162 <Method SyncTree$ListenProvider SyncTree.access$1500(SyncTree)>
			//  212  505:aload_0         
			//  213  506:getfield        #30  <Field SyncTree this$0>
			//  214  509:aload_0         
			//  215  510:getfield        #32  <Field QuerySpec val$query>
			//  216  513:invokestatic    #166 <Method QuerySpec SyncTree.access$1300(SyncTree, QuerySpec)>
			//  217  516:aconst_null     
			//  218  517:invokeinterface #181 <Method void SyncTree$ListenProvider.stopListening(QuerySpec, Tag)>
						} else
			//* 219  522:goto            593
						{
							QuerySpec queryspec1;
							Tag tag;
							for(obj = ((Object) (list.iterator())); ((Iterator) (obj)).hasNext(); listenProvider.stopListening(queryForListening(queryspec1), tag))
			//* 220  525:aload           8
			//* 221  527:invokeinterface #103 <Method Iterator List.iterator()>
			//* 222  532:astore          5
			//* 223  534:aload           5
			//* 224  536:invokeinterface #108 <Method boolean Iterator.hasNext()>
			//* 225  541:ifeq            593
							{
								queryspec1 = (QuerySpec)((Iterator) (obj)).next();
			//  226  544:aload           5
			//  227  546:invokeinterface #111 <Method Object Iterator.next()>
			//  228  551:checkcast       #48  <Class QuerySpec>
			//  229  554:astore          7
								tag = tagForQuery(queryspec1);
			//  230  556:aload_0         
			//  231  557:getfield        #30  <Field SyncTree this$0>
			//  232  560:aload           7
			//  233  562:invokestatic    #185 <Method Tag SyncTree.access$000(SyncTree, QuerySpec)>
			//  234  565:astore          9
							}

			//  235  567:aload_0         
			//  236  568:getfield        #30  <Field SyncTree this$0>
			//  237  571:invokestatic    #162 <Method SyncTree$ListenProvider SyncTree.access$1500(SyncTree)>
			//  238  574:aload_0         
			//  239  575:getfield        #30  <Field SyncTree this$0>
			//  240  578:aload           7
			//  241  580:invokestatic    #166 <Method QuerySpec SyncTree.access$1300(SyncTree, QuerySpec)>
			//  242  583:aload           9
			//  243  585:invokeinterface #181 <Method void SyncTree$ListenProvider.stopListening(QuerySpec, Tag)>
						}
			//* 244  590:goto            534
					removeTags(list);
			//  245  593:aload_0         
			//  246  594:getfield        #30  <Field SyncTree this$0>
			//  247  597:aload           8
			//  248  599:invokestatic    #189 <Method void SyncTree.access$1600(SyncTree, List)>
					obj = obj1;
			//  249  602:aload           6
			//  250  604:astore          5
				}
				return ((List) (obj));
			//  251  606:aload           5
			//  252  608:areturn         
			}

			static final boolean $assertionsDisabled = false;
			final SyncTree this$0;
			final FirebaseError val$cancelError;
			final EventRegistration val$eventRegistration;
			final QuerySpec val$query;

			static 
			{
			//    0    0:return          
			}

			
			{
				this$0 = SyncTree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #30  <Field SyncTree this$0>
				query = queryspec;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #32  <Field QuerySpec val$query>
				eventRegistration = eventregistration;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #34  <Field EventRegistration val$eventRegistration>
				cancelError = firebaseerror;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #36  <Field FirebaseError val$cancelError>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #38  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field PersistenceManager persistenceManager>
	//    2    4:new             #12  <Class SyncTree$12>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #349 <Method void SyncTree$12(SyncTree, QuerySpec, EventRegistration, FirebaseError)>
	//    9   15:invokeinterface #355 <Method Object PersistenceManager.runInTransaction(Callable)>
	//   10   20:checkcast       #235 <Class List>
	//   11   23:areturn         
	}

	private void removeTags(List list)
	{
		list = ((List) (list.iterator()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #358 <Method Iterator List.iterator()>
	//    2    6:astore_1        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//    3    7:aload_1         
	//    4    8:invokeinterface #317 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            64
			QuerySpec queryspec = (QuerySpec)((Iterator) (list)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #320 <Method Object Iterator.next()>
	//    8   22:checkcast       #284 <Class QuerySpec>
	//    9   25:astore_2        
			if(!queryspec.loadsAllData())
	//*  10   26:aload_2         
	//*  11   27:invokevirtual   #332 <Method boolean QuerySpec.loadsAllData()>
	//*  12   30:ifne            7
			{
				Tag tag = tagForQuery(queryspec);
	//   13   33:aload_0         
	//   14   34:aload_2         
	//   15   35:invokespecial   #128 <Method Tag tagForQuery(QuerySpec)>
	//   16   38:astore_3        
				queryToTagMap.remove(((Object) (queryspec)));
	//   17   39:aload_0         
	//   18   40:getfield        #103 <Field Map queryToTagMap>
	//   19   43:aload_2         
	//   20   44:invokeinterface #361 <Method Object Map.remove(Object)>
	//   21   49:pop             
				tagToQueryMap.remove(((Object) (tag)));
	//   22   50:aload_0         
	//   23   51:getfield        #101 <Field Map tagToQueryMap>
	//   24   54:aload_3         
	//   25   55:invokeinterface #361 <Method Object Map.remove(Object)>
	//   26   60:pop             
			}
		} while(true);
	//   27   61:goto            7
	//   28   64:return          
	}

	private void setupListener(QuerySpec queryspec, View view)
	{
		Path path = queryspec.getPath();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #285 <Method Path QuerySpec.getPath()>
	//    2    4:astore          4
		Tag tag = tagForQuery(queryspec);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #128 <Method Tag tagForQuery(QuerySpec)>
	//    6   11:astore_3        
		view = ((View) (new ListenContainer(view)));
	//    7   12:new             #40  <Class SyncTree$ListenContainer>
	//    8   15:dup             
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:invokespecial   #365 <Method void SyncTree$ListenContainer(SyncTree, View)>
	//   12   21:astore_2        
		listenProvider.startListening(queryForListening(queryspec), tag, ((SyncTreeHash) (view)), ((CompletionListener) (view)));
	//   13   22:aload_0         
	//   14   23:getfield        #110 <Field SyncTree$ListenProvider listenProvider>
	//   15   26:aload_0         
	//   16   27:aload_1         
	//   17   28:invokespecial   #150 <Method QuerySpec queryForListening(QuerySpec)>
	//   18   31:aload_3         
	//   19   32:aload_2         
	//   20   33:aload_2         
	//   21   34:invokeinterface #369 <Method void SyncTree$ListenProvider.startListening(QuerySpec, Tag, SyncTree$SyncTreeHash, SyncTree$CompletionListener)>
		queryspec = ((QuerySpec) (syncPointTree.subtree(path)));
	//   22   39:aload_0         
	//   23   40:getfield        #91  <Field ImmutableTree syncPointTree>
	//   24   43:aload           4
	//   25   45:invokevirtual   #373 <Method ImmutableTree ImmutableTree.subtree(Path)>
	//   26   48:astore_1        
		if(tag != null)
	//*  27   49:aload_3         
	//*  28   50:ifnull          54
		{
			return;
	//   29   53:return          
		} else
		{
			((ImmutableTree) (queryspec)).foreach(new com.firebase.client.core.utilities.ImmutableTree.TreeVisitor() {

				public volatile Object onNodeValue(Path path1, Object obj, Object obj1)
				{
					return ((Object) (onNodeValue(path1, (SyncPoint)obj, (Void)obj1)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:aload_2         
				//    3    3:checkcast       #26  <Class SyncPoint>
				//    4    6:aload_3         
				//    5    7:checkcast       #28  <Class Void>
				//    6   10:invokevirtual   #31  <Method Void onNodeValue(Path, SyncPoint, Void)>
				//    7   13:areturn         
				}

				public Void onNodeValue(Path path1, SyncPoint syncpoint, Void void1)
				{
					if(!path1.isEmpty() && syncpoint.hasCompleteView())
				//*   0    0:aload_1         
				//*   1    1:invokevirtual   #37  <Method boolean Path.isEmpty()>
				//*   2    4:ifne            53
				//*   3    7:aload_2         
				//*   4    8:invokevirtual   #40  <Method boolean SyncPoint.hasCompleteView()>
				//*   5   11:ifeq            53
					{
						path1 = ((Path) (syncpoint.getCompleteView().getQuery()));
				//    6   14:aload_2         
				//    7   15:invokevirtual   #44  <Method View SyncPoint.getCompleteView()>
				//    8   18:invokevirtual   #50  <Method QuerySpec View.getQuery()>
				//    9   21:astore_1        
						listenProvider.stopListening(queryForListening(((QuerySpec) (path1))), tagForQuery(((QuerySpec) (path1))));
				//   10   22:aload_0         
				//   11   23:getfield        #18  <Field SyncTree this$0>
				//   12   26:invokestatic    #54  <Method SyncTree$ListenProvider SyncTree.access$1500(SyncTree)>
				//   13   29:aload_0         
				//   14   30:getfield        #18  <Field SyncTree this$0>
				//   15   33:aload_1         
				//   16   34:invokestatic    #58  <Method QuerySpec SyncTree.access$1300(SyncTree, QuerySpec)>
				//   17   37:aload_0         
				//   18   38:getfield        #18  <Field SyncTree this$0>
				//   19   41:aload_1         
				//   20   42:invokestatic    #62  <Method Tag SyncTree.access$000(SyncTree, QuerySpec)>
				//   21   45:invokeinterface #68  <Method void SyncTree$ListenProvider.stopListening(QuerySpec, Tag)>
					} else
				//*  22   50:goto            116
					{
						for(path1 = ((Path) (syncpoint.getQueryViews().iterator())); ((Iterator) (path1)).hasNext(); listenProvider.stopListening(queryForListening(((QuerySpec) (syncpoint))), tagForQuery(((QuerySpec) (syncpoint)))))
				//*  23   53:aload_2         
				//*  24   54:invokevirtual   #72  <Method List SyncPoint.getQueryViews()>
				//*  25   57:invokeinterface #78  <Method Iterator List.iterator()>
				//*  26   62:astore_1        
				//*  27   63:aload_1         
				//*  28   64:invokeinterface #83  <Method boolean Iterator.hasNext()>
				//*  29   69:ifeq            116
							syncpoint = ((SyncPoint) (((View)((Iterator) (path1)).next()).getQuery()));
				//   30   72:aload_1         
				//   31   73:invokeinterface #87  <Method Object Iterator.next()>
				//   32   78:checkcast       #46  <Class View>
				//   33   81:invokevirtual   #50  <Method QuerySpec View.getQuery()>
				//   34   84:astore_2        

				//   35   85:aload_0         
				//   36   86:getfield        #18  <Field SyncTree this$0>
				//   37   89:invokestatic    #54  <Method SyncTree$ListenProvider SyncTree.access$1500(SyncTree)>
				//   38   92:aload_0         
				//   39   93:getfield        #18  <Field SyncTree this$0>
				//   40   96:aload_2         
				//   41   97:invokestatic    #58  <Method QuerySpec SyncTree.access$1300(SyncTree, QuerySpec)>
				//   42  100:aload_0         
				//   43  101:getfield        #18  <Field SyncTree this$0>
				//   44  104:aload_2         
				//   45  105:invokestatic    #62  <Method Tag SyncTree.access$000(SyncTree, QuerySpec)>
				//   46  108:invokeinterface #68  <Method void SyncTree$ListenProvider.stopListening(QuerySpec, Tag)>
					}
				//*  47  113:goto            63
					return null;
				//   48  116:aconst_null     
				//   49  117:areturn         
				}

				final SyncTree this$0;

			
			{
				this$0 = SyncTree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field SyncTree this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   30   54:aload_1         
	//   31   55:new             #14  <Class SyncTree$13>
	//   32   58:dup             
	//   33   59:aload_0         
	//   34   60:invokespecial   #376 <Method void SyncTree$13(SyncTree)>
	//   35   63:invokevirtual   #380 <Method void ImmutableTree.foreach(com.firebase.client.core.utilities.ImmutableTree$TreeVisitor)>
			return;
	//   36   66:return          
		}
	}

	private Tag tagForQuery(QuerySpec queryspec)
	{
		return (Tag)queryToTagMap.get(((Object) (queryspec)));
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Map queryToTagMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #342 <Method Object Map.get(Object)>
	//    4   10:checkcast       #326 <Class Tag>
	//    5   13:areturn         
	}

	public List ackUserWrite(final long writeId, final boolean revert, final boolean persist, final Clock serverClock)
	{
		return (List)persistenceManager.runInTransaction(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #44  <Method List call()>
			//    2    4:areturn         
			}

			public List call()
			{
				if(persist)
			//*   0    0:aload_0         
			//*   1    1:getfield        #27  <Field boolean val$persist>
			//*   2    4:ifeq            23
					persistenceManager.removeUserWrite(writeId);
			//    3    7:aload_0         
			//    4    8:getfield        #25  <Field SyncTree this$0>
			//    5   11:invokestatic    #49  <Method PersistenceManager SyncTree.access$200(SyncTree)>
			//    6   14:aload_0         
			//    7   15:getfield        #29  <Field long val$writeId>
			//    8   18:invokeinterface #55  <Method void PersistenceManager.removeUserWrite(long)>
				UserWriteRecord userwriterecord = pendingWriteTree.getWrite(writeId);
			//    9   23:aload_0         
			//   10   24:getfield        #25  <Field SyncTree this$0>
			//   11   27:invokestatic    #59  <Method WriteTree SyncTree.access$300(SyncTree)>
			//   12   30:aload_0         
			//   13   31:getfield        #29  <Field long val$writeId>
			//   14   34:invokevirtual   #65  <Method UserWriteRecord WriteTree.getWrite(long)>
			//   15   37:astore          4
				boolean flag = pendingWriteTree.removeWrite(writeId);
			//   16   39:aload_0         
			//   17   40:getfield        #25  <Field SyncTree this$0>
			//   18   43:invokestatic    #59  <Method WriteTree SyncTree.access$300(SyncTree)>
			//   19   46:aload_0         
			//   20   47:getfield        #29  <Field long val$writeId>
			//   21   50:invokevirtual   #69  <Method boolean WriteTree.removeWrite(long)>
			//   22   53:istore_1        
				if(userwriterecord.isVisible() && !revert)
			//*  23   54:aload           4
			//*  24   56:invokevirtual   #75  <Method boolean UserWriteRecord.isVisible()>
			//*  25   59:ifeq            144
			//*  26   62:aload_0         
			//*  27   63:getfield        #31  <Field boolean val$revert>
			//*  28   66:ifne            144
				{
					Object obj = ((Object) (ServerValues.generateServerValues(serverClock)));
			//   29   69:aload_0         
			//   30   70:getfield        #33  <Field Clock val$serverClock>
			//   31   73:invokestatic    #81  <Method Map ServerValues.generateServerValues(Clock)>
			//   32   76:astore_2        
					if(userwriterecord.isOverwrite())
			//*  33   77:aload           4
			//*  34   79:invokevirtual   #84  <Method boolean UserWriteRecord.isOverwrite()>
			//*  35   82:ifeq            116
					{
						obj = ((Object) (ServerValues.resolveDeferredValueSnapshot(userwriterecord.getOverwrite(), ((Map) (obj)))));
			//   36   85:aload           4
			//   37   87:invokevirtual   #88  <Method Node UserWriteRecord.getOverwrite()>
			//   38   90:aload_2         
			//   39   91:invokestatic    #92  <Method Node ServerValues.resolveDeferredValueSnapshot(Node, Map)>
			//   40   94:astore_2        
						persistenceManager.applyUserWriteToServerCache(userwriterecord.getPath(), ((Node) (obj)));
			//   41   95:aload_0         
			//   42   96:getfield        #25  <Field SyncTree this$0>
			//   43   99:invokestatic    #49  <Method PersistenceManager SyncTree.access$200(SyncTree)>
			//   44  102:aload           4
			//   45  104:invokevirtual   #96  <Method Path UserWriteRecord.getPath()>
			//   46  107:aload_2         
			//   47  108:invokeinterface #100 <Method void PersistenceManager.applyUserWriteToServerCache(Path, Node)>
					} else
			//*  48  113:goto            144
					{
						obj = ((Object) (ServerValues.resolveDeferredValueMerge(userwriterecord.getMerge(), ((Map) (obj)))));
			//   49  116:aload           4
			//   50  118:invokevirtual   #104 <Method CompoundWrite UserWriteRecord.getMerge()>
			//   51  121:aload_2         
			//   52  122:invokestatic    #108 <Method CompoundWrite ServerValues.resolveDeferredValueMerge(CompoundWrite, Map)>
			//   53  125:astore_2        
						persistenceManager.applyUserWriteToServerCache(userwriterecord.getPath(), ((CompoundWrite) (obj)));
			//   54  126:aload_0         
			//   55  127:getfield        #25  <Field SyncTree this$0>
			//   56  130:invokestatic    #49  <Method PersistenceManager SyncTree.access$200(SyncTree)>
			//   57  133:aload           4
			//   58  135:invokevirtual   #96  <Method Path UserWriteRecord.getPath()>
			//   59  138:aload_2         
			//   60  139:invokeinterface #111 <Method void PersistenceManager.applyUserWriteToServerCache(Path, CompoundWrite)>
					}
				}
				if(!flag)
			//*  61  144:iload_1         
			//*  62  145:ifne            152
					return Collections.emptyList();
			//   63  148:invokestatic    #116 <Method List Collections.emptyList()>
			//   64  151:areturn         
				ImmutableTree immutabletree = ImmutableTree.emptyInstance();
			//   65  152:invokestatic    #122 <Method ImmutableTree ImmutableTree.emptyInstance()>
			//   66  155:astore_2        
				ImmutableTree immutabletree1;
				if(userwriterecord.isOverwrite())
			//*  67  156:aload           4
			//*  68  158:invokevirtual   #84  <Method boolean UserWriteRecord.isOverwrite()>
			//*  69  161:ifeq            179
				{
					immutabletree1 = immutabletree.set(Path.getEmptyPath(), ((Object) (Boolean.valueOf(true))));
			//   70  164:aload_2         
			//   71  165:invokestatic    #127 <Method Path Path.getEmptyPath()>
			//   72  168:iconst_1        
			//   73  169:invokestatic    #133 <Method Boolean Boolean.valueOf(boolean)>
			//   74  172:invokevirtual   #137 <Method ImmutableTree ImmutableTree.set(Path, Object)>
			//   75  175:astore_3        
				} else
			//*  76  176:goto            231
				{
					Iterator iterator = userwriterecord.getMerge().iterator();
			//   77  179:aload           4
			//   78  181:invokevirtual   #104 <Method CompoundWrite UserWriteRecord.getMerge()>
			//   79  184:invokevirtual   #143 <Method Iterator CompoundWrite.iterator()>
			//   80  187:astore          5
					do
					{
						immutabletree1 = immutabletree;
			//   81  189:aload_2         
			//   82  190:astore_3        
						if(!iterator.hasNext())
							break;
			//   83  191:aload           5
			//   84  193:invokeinterface #148 <Method boolean Iterator.hasNext()>
			//   85  198:ifeq            231
						immutabletree = immutabletree.set((Path)((java.util.Map.Entry)iterator.next()).getKey(), ((Object) (Boolean.valueOf(true))));
			//   86  201:aload_2         
			//   87  202:aload           5
			//   88  204:invokeinterface #151 <Method Object Iterator.next()>
			//   89  209:checkcast       #153 <Class java.util.Map$Entry>
			//   90  212:invokeinterface #156 <Method Object java.util.Map$Entry.getKey()>
			//   91  217:checkcast       #124 <Class Path>
			//   92  220:iconst_1        
			//   93  221:invokestatic    #133 <Method Boolean Boolean.valueOf(boolean)>
			//   94  224:invokevirtual   #137 <Method ImmutableTree ImmutableTree.set(Path, Object)>
			//   95  227:astore_2        
					} while(true);
			//   96  228:goto            189
				}
				return applyOperationToSyncPoints(((Operation) (new AckUserWrite(userwriterecord.getPath(), immutabletree1, revert))));
			//   97  231:aload_0         
			//   98  232:getfield        #25  <Field SyncTree this$0>
			//   99  235:new             #158 <Class AckUserWrite>
			//  100  238:dup             
			//  101  239:aload           4
			//  102  241:invokevirtual   #96  <Method Path UserWriteRecord.getPath()>
			//  103  244:aload_3         
			//  104  245:aload_0         
			//  105  246:getfield        #31  <Field boolean val$revert>
			//  106  249:invokespecial   #161 <Method void AckUserWrite(Path, ImmutableTree, boolean)>
			//  107  252:invokestatic    #165 <Method List SyncTree.access$400(SyncTree, Operation)>
			//  108  255:areturn         
			}

			final SyncTree this$0;
			final boolean val$persist;
			final boolean val$revert;
			final Clock val$serverClock;
			final long val$writeId;

			
			{
				this$0 = SyncTree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field SyncTree this$0>
				persist = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #27  <Field boolean val$persist>
				writeId = l;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #29  <Field long val$writeId>
				revert = flag1;
			//    9   15:aload_0         
			//   10   16:iload           5
			//   11   18:putfield        #31  <Field boolean val$revert>
				serverClock = clock;
			//   12   21:aload_0         
			//   13   22:aload           6
			//   14   24:putfield        #33  <Field Clock val$serverClock>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #36  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field PersistenceManager persistenceManager>
	//    2    4:new             #20  <Class SyncTree$3>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:iload           4
	//    6   11:lload_1         
	//    7   12:iload_3         
	//    8   13:aload           5
	//    9   15:invokespecial   #385 <Method void SyncTree$3(SyncTree, boolean, long, boolean, Clock)>
	//   10   18:invokeinterface #355 <Method Object PersistenceManager.runInTransaction(Callable)>
	//   11   23:checkcast       #235 <Class List>
	//   12   26:areturn         
	}

	public List addEventRegistration(final EventRegistration eventRegistration)
	{
		return (List)persistenceManager.runInTransaction(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #37  <Method List call()>
			//    2    4:areturn         
			}

			public List call()
			{
				QuerySpec queryspec = eventRegistration.getQuerySpec();
			//    0    0:aload_0         
			//    1    1:getfield        #28  <Field EventRegistration val$eventRegistration>
			//    2    4:invokevirtual   #44  <Method QuerySpec EventRegistration.getQuerySpec()>
			//    3    7:astore          10
				Path path = queryspec.getPath();
			//    4    9:aload           10
			//    5   11:invokevirtual   #50  <Method Path QuerySpec.getPath()>
			//    6   14:astore          9
				Object obj2 = ((Object) (syncPointTree));
			//    7   16:aload_0         
			//    8   17:getfield        #26  <Field SyncTree this$0>
			//    9   20:invokestatic    #54  <Method ImmutableTree SyncTree.access$700(SyncTree)>
			//   10   23:astore          7
				Object obj1 = ((Object) (path));
			//   11   25:aload           9
			//   12   27:astore          6
				Object obj = null;
			//   13   29:aconst_null     
			//   14   30:astore          5
				boolean flag = false;
			//   15   32:iconst_0        
			//   16   33:istore_1        
				do
				{
					boolean flag3 = ((ImmutableTree) (obj2)).isEmpty();
			//   17   34:aload           7
			//   18   36:invokevirtual   #60  <Method boolean ImmutableTree.isEmpty()>
			//   19   39:istore          4
					boolean flag2 = true;
			//   20   41:iconst_1        
			//   21   42:istore_3        
					if(flag3)
						break;
			//   22   43:iload           4
			//   23   45:ifne            161
					SyncPoint syncpoint = (SyncPoint)((ImmutableTree) (obj2)).getValue();
			//   24   48:aload           7
			//   25   50:invokevirtual   #63  <Method Object ImmutableTree.getValue()>
			//   26   53:checkcast       #65  <Class SyncPoint>
			//   27   56:astore          11
					boolean flag1 = flag;
			//   28   58:iload_1         
			//   29   59:istore_2        
					Object obj3 = obj;
			//   30   60:aload           5
			//   31   62:astore          8
					if(syncpoint != null)
			//*  32   64:aload           11
			//*  33   66:ifnull          111
					{
						if(obj == null)
			//*  34   69:aload           5
			//*  35   71:ifnull          77
			//*  36   74:goto            86
							obj = ((Object) (syncpoint.getCompleteServerCache(((Path) (obj1)))));
			//   37   77:aload           11
			//   38   79:aload           6
			//   39   81:invokevirtual   #69  <Method Node SyncPoint.getCompleteServerCache(Path)>
			//   40   84:astore          5
						flag1 = flag2;
			//   41   86:iload_3         
			//   42   87:istore_2        
						if(!flag)
			//*  43   88:iload_1         
			//*  44   89:ifne            107
							if(syncpoint.hasCompleteView())
			//*  45   92:aload           11
			//*  46   94:invokevirtual   #72  <Method boolean SyncPoint.hasCompleteView()>
			//*  47   97:ifeq            105
								flag1 = flag2;
			//   48  100:iload_3         
			//   49  101:istore_2        
							else
			//*  50  102:goto            107
								flag1 = false;
			//   51  105:iconst_0        
			//   52  106:istore_2        
						obj3 = obj;
			//   53  107:aload           5
			//   54  109:astore          8
					}
					if(((Path) (obj1)).isEmpty())
			//*  55  111:aload           6
			//*  56  113:invokevirtual   #75  <Method boolean Path.isEmpty()>
			//*  57  116:ifeq            129
						obj = ((Object) (ChildKey.fromString("")));
			//   58  119:ldc1            #77  <String "">
			//   59  121:invokestatic    #83  <Method ChildKey ChildKey.fromString(String)>
			//   60  124:astore          5
					else
			//*  61  126:goto            136
						obj = ((Object) (((Path) (obj1)).getFront()));
			//   62  129:aload           6
			//   63  131:invokevirtual   #87  <Method ChildKey Path.getFront()>
			//   64  134:astore          5
					obj2 = ((Object) (((ImmutableTree) (obj2)).getChild(((ChildKey) (obj)))));
			//   65  136:aload           7
			//   66  138:aload           5
			//   67  140:invokevirtual   #91  <Method ImmutableTree ImmutableTree.getChild(ChildKey)>
			//   68  143:astore          7
					obj1 = ((Object) (((Path) (obj1)).popFront()));
			//   69  145:aload           6
			//   70  147:invokevirtual   #94  <Method Path Path.popFront()>
			//   71  150:astore          6
					flag = flag1;
			//   72  152:iload_2         
			//   73  153:istore_1        
					obj = obj3;
			//   74  154:aload           8
			//   75  156:astore          5
				} while(true);
			//   76  158:goto            34
				obj1 = ((Object) ((SyncPoint)syncPointTree.get(path)));
			//   77  161:aload_0         
			//   78  162:getfield        #26  <Field SyncTree this$0>
			//   79  165:invokestatic    #54  <Method ImmutableTree SyncTree.access$700(SyncTree)>
			//   80  168:aload           9
			//   81  170:invokevirtual   #98  <Method Object ImmutableTree.get(Path)>
			//   82  173:checkcast       #65  <Class SyncPoint>
			//   83  176:astore          6
				if(obj1 == null)
			//*  84  178:aload           6
			//*  85  180:ifnonnull       226
				{
					obj1 = ((Object) (new SyncPoint(persistenceManager)));
			//   86  183:new             #65  <Class SyncPoint>
			//   87  186:dup             
			//   88  187:aload_0         
			//   89  188:getfield        #26  <Field SyncTree this$0>
			//   90  191:invokestatic    #102 <Method PersistenceManager SyncTree.access$200(SyncTree)>
			//   91  194:invokespecial   #105 <Method void SyncPoint(PersistenceManager)>
			//   92  197:astore          6
					obj2 = ((Object) (SyncTree.this));
			//   93  199:aload_0         
			//   94  200:getfield        #26  <Field SyncTree this$0>
			//   95  203:astore          7
					obj2.syncPointTree = ((SyncTree) (obj2)).syncPointTree.set(path, obj1);
			//   96  205:aload           7
			//   97  207:aload           7
			//   98  209:invokestatic    #54  <Method ImmutableTree SyncTree.access$700(SyncTree)>
			//   99  212:aload           9
			//  100  214:aload           6
			//  101  216:invokevirtual   #109 <Method ImmutableTree ImmutableTree.set(Path, Object)>
			//  102  219:invokestatic    #113 <Method ImmutableTree SyncTree.access$702(SyncTree, ImmutableTree)>
			//  103  222:pop             
				} else
			//* 104  223:goto            266
				{
					if(!flag && !((SyncPoint) (obj1)).hasCompleteView())
			//* 105  226:iload_1         
			//* 106  227:ifne            246
			//* 107  230:aload           6
			//* 108  232:invokevirtual   #72  <Method boolean SyncPoint.hasCompleteView()>
			//* 109  235:ifeq            241
			//* 110  238:goto            246
						flag = false;
			//  111  241:iconst_0        
			//  112  242:istore_1        
					else
			//* 113  243:goto            248
						flag = true;
			//  114  246:iconst_1        
			//  115  247:istore_1        
					if(obj == null)
			//* 116  248:aload           5
			//* 117  250:ifnull          256
			//* 118  253:goto            266
						obj = ((Object) (((SyncPoint) (obj1)).getCompleteServerCache(Path.getEmptyPath())));
			//  119  256:aload           6
			//  120  258:invokestatic    #116 <Method Path Path.getEmptyPath()>
			//  121  261:invokevirtual   #69  <Method Node SyncPoint.getCompleteServerCache(Path)>
			//  122  264:astore          5
				}
				persistenceManager.setQueryActive(queryspec);
			//  123  266:aload_0         
			//  124  267:getfield        #26  <Field SyncTree this$0>
			//  125  270:invokestatic    #102 <Method PersistenceManager SyncTree.access$200(SyncTree)>
			//  126  273:aload           10
			//  127  275:invokeinterface #122 <Method void PersistenceManager.setQueryActive(QuerySpec)>
				if(obj != null)
			//* 128  280:aload           5
			//* 129  282:ifnull          309
				{
					obj = ((Object) (new CacheNode(IndexedNode.from(((Node) (obj)), queryspec.getIndex()), true, false)));
			//  130  285:new             #124 <Class CacheNode>
			//  131  288:dup             
			//  132  289:aload           5
			//  133  291:aload           10
			//  134  293:invokevirtual   #128 <Method com.firebase.client.snapshot.Index QuerySpec.getIndex()>
			//  135  296:invokestatic    #134 <Method IndexedNode IndexedNode.from(Node, com.firebase.client.snapshot.Index)>
			//  136  299:iconst_1        
			//  137  300:iconst_0        
			//  138  301:invokespecial   #137 <Method void CacheNode(IndexedNode, boolean, boolean)>
			//  139  304:astore          5
				} else
			//* 140  306:goto            541
				{
					obj2 = ((Object) (persistenceManager.serverCache(queryspec)));
			//  141  309:aload_0         
			//  142  310:getfield        #26  <Field SyncTree this$0>
			//  143  313:invokestatic    #102 <Method PersistenceManager SyncTree.access$200(SyncTree)>
			//  144  316:aload           10
			//  145  318:invokeinterface #141 <Method CacheNode PersistenceManager.serverCache(QuerySpec)>
			//  146  323:astore          7
					if(((CacheNode) (obj2)).isFullyInitialized())
			//* 147  325:aload           7
			//* 148  327:invokevirtual   #144 <Method boolean CacheNode.isFullyInitialized()>
			//* 149  330:ifeq            340
					{
						obj = obj2;
			//  150  333:aload           7
			//  151  335:astore          5
					} else
			//* 152  337:goto            541
					{
						obj = ((Object) (EmptyNode.Empty()));
			//  153  340:invokestatic    #150 <Method EmptyNode EmptyNode.Empty()>
			//  154  343:astore          5
						Iterator iterator = syncPointTree.subtree(path).getChildren().iterator();
			//  155  345:aload_0         
			//  156  346:getfield        #26  <Field SyncTree this$0>
			//  157  349:invokestatic    #54  <Method ImmutableTree SyncTree.access$700(SyncTree)>
			//  158  352:aload           9
			//  159  354:invokevirtual   #154 <Method ImmutableTree ImmutableTree.subtree(Path)>
			//  160  357:invokevirtual   #158 <Method ImmutableSortedMap ImmutableTree.getChildren()>
			//  161  360:invokevirtual   #164 <Method Iterator ImmutableSortedMap.iterator()>
			//  162  363:astore          8
						do
						{
							if(!iterator.hasNext())
								break;
			//  163  365:aload           8
			//  164  367:invokeinterface #169 <Method boolean Iterator.hasNext()>
			//  165  372:ifeq            449
							java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
			//  166  375:aload           8
			//  167  377:invokeinterface #172 <Method Object Iterator.next()>
			//  168  382:checkcast       #174 <Class java.util.Map$Entry>
			//  169  385:astore          11
							Object obj4 = ((Object) ((SyncPoint)((ImmutableTree)entry.getValue()).getValue()));
			//  170  387:aload           11
			//  171  389:invokeinterface #175 <Method Object java.util.Map$Entry.getValue()>
			//  172  394:checkcast       #56  <Class ImmutableTree>
			//  173  397:invokevirtual   #63  <Method Object ImmutableTree.getValue()>
			//  174  400:checkcast       #65  <Class SyncPoint>
			//  175  403:astore          12
							if(obj4 != null)
			//* 176  405:aload           12
			//* 177  407:ifnull          365
							{
								obj4 = ((Object) (((SyncPoint) (obj4)).getCompleteServerCache(Path.getEmptyPath())));
			//  178  410:aload           12
			//  179  412:invokestatic    #116 <Method Path Path.getEmptyPath()>
			//  180  415:invokevirtual   #69  <Method Node SyncPoint.getCompleteServerCache(Path)>
			//  181  418:astore          12
								if(obj4 != null)
			//* 182  420:aload           12
			//* 183  422:ifnull          365
									obj = ((Object) (((Node) (obj)).updateImmediateChild((ChildKey)entry.getKey(), ((Node) (obj4)))));
			//  184  425:aload           5
			//  185  427:aload           11
			//  186  429:invokeinterface #178 <Method Object java.util.Map$Entry.getKey()>
			//  187  434:checkcast       #79  <Class ChildKey>
			//  188  437:aload           12
			//  189  439:invokeinterface #184 <Method Node Node.updateImmediateChild(ChildKey, Node)>
			//  190  444:astore          5
							}
						} while(true);
			//  191  446:goto            365
						obj2 = ((Object) (((CacheNode) (obj2)).getNode().iterator()));
			//  192  449:aload           7
			//  193  451:invokevirtual   #188 <Method Node CacheNode.getNode()>
			//  194  454:invokeinterface #189 <Method Iterator Node.iterator()>
			//  195  459:astore          7
						do
						{
							if(!((Iterator) (obj2)).hasNext())
								break;
			//  196  461:aload           7
			//  197  463:invokeinterface #169 <Method boolean Iterator.hasNext()>
			//  198  468:ifeq            520
							NamedNode namednode = (NamedNode)((Iterator) (obj2)).next();
			//  199  471:aload           7
			//  200  473:invokeinterface #172 <Method Object Iterator.next()>
			//  201  478:checkcast       #191 <Class NamedNode>
			//  202  481:astore          8
							if(!((Node) (obj)).hasChild(namednode.getName()))
			//* 203  483:aload           5
			//* 204  485:aload           8
			//* 205  487:invokevirtual   #194 <Method ChildKey NamedNode.getName()>
			//* 206  490:invokeinterface #198 <Method boolean Node.hasChild(ChildKey)>
			//* 207  495:ifne            461
								obj = ((Object) (((Node) (obj)).updateImmediateChild(namednode.getName(), namednode.getNode())));
			//  208  498:aload           5
			//  209  500:aload           8
			//  210  502:invokevirtual   #194 <Method ChildKey NamedNode.getName()>
			//  211  505:aload           8
			//  212  507:invokevirtual   #199 <Method Node NamedNode.getNode()>
			//  213  510:invokeinterface #184 <Method Node Node.updateImmediateChild(ChildKey, Node)>
			//  214  515:astore          5
						} while(true);
			//  215  517:goto            461
						obj = ((Object) (new CacheNode(IndexedNode.from(((Node) (obj)), queryspec.getIndex()), false, false)));
			//  216  520:new             #124 <Class CacheNode>
			//  217  523:dup             
			//  218  524:aload           5
			//  219  526:aload           10
			//  220  528:invokevirtual   #128 <Method com.firebase.client.snapshot.Index QuerySpec.getIndex()>
			//  221  531:invokestatic    #134 <Method IndexedNode IndexedNode.from(Node, com.firebase.client.snapshot.Index)>
			//  222  534:iconst_0        
			//  223  535:iconst_0        
			//  224  536:invokespecial   #137 <Method void CacheNode(IndexedNode, boolean, boolean)>
			//  225  539:astore          5
					}
				}
				boolean flag4 = ((SyncPoint) (obj1)).viewExistsForQuery(queryspec);
			//  226  541:aload           6
			//  227  543:aload           10
			//  228  545:invokevirtual   #203 <Method boolean SyncPoint.viewExistsForQuery(QuerySpec)>
			//  229  548:istore          4
				if(!flag4 && !queryspec.loadsAllData())
			//* 230  550:iload           4
			//* 231  552:ifne            606
			//* 232  555:aload           10
			//* 233  557:invokevirtual   #206 <Method boolean QuerySpec.loadsAllData()>
			//* 234  560:ifne            606
				{
					obj2 = ((Object) (getNextQueryTag()));
			//  235  563:aload_0         
			//  236  564:getfield        #26  <Field SyncTree this$0>
			//  237  567:invokestatic    #210 <Method Tag SyncTree.access$900(SyncTree)>
			//  238  570:astore          7
					queryToTagMap.put(((Object) (queryspec)), obj2);
			//  239  572:aload_0         
			//  240  573:getfield        #26  <Field SyncTree this$0>
			//  241  576:invokestatic    #214 <Method Map SyncTree.access$800(SyncTree)>
			//  242  579:aload           10
			//  243  581:aload           7
			//  244  583:invokeinterface #220 <Method Object Map.put(Object, Object)>
			//  245  588:pop             
					tagToQueryMap.put(obj2, ((Object) (queryspec)));
			//  246  589:aload_0         
			//  247  590:getfield        #26  <Field SyncTree this$0>
			//  248  593:invokestatic    #223 <Method Map SyncTree.access$1000(SyncTree)>
			//  249  596:aload           7
			//  250  598:aload           10
			//  251  600:invokeinterface #220 <Method Object Map.put(Object, Object)>
			//  252  605:pop             
				}
				obj2 = ((Object) (pendingWriteTree.childWrites(path)));
			//  253  606:aload_0         
			//  254  607:getfield        #26  <Field SyncTree this$0>
			//  255  610:invokestatic    #227 <Method WriteTree SyncTree.access$300(SyncTree)>
			//  256  613:aload           9
			//  257  615:invokevirtual   #233 <Method WriteTreeRef WriteTree.childWrites(Path)>
			//  258  618:astore          7
				obj = ((Object) (((SyncPoint) (obj1)).addEventRegistration(eventRegistration, ((WriteTreeRef) (obj2)), ((CacheNode) (obj)))));
			//  259  620:aload           6
			//  260  622:aload_0         
			//  261  623:getfield        #28  <Field EventRegistration val$eventRegistration>
			//  262  626:aload           7
			//  263  628:aload           5
			//  264  630:invokevirtual   #236 <Method List SyncPoint.addEventRegistration(EventRegistration, WriteTreeRef, CacheNode)>
			//  265  633:astore          5
				if(!flag4 && !flag)
			//* 266  635:iload           4
			//* 267  637:ifne            664
			//* 268  640:iload_1         
			//* 269  641:ifne            664
				{
					obj1 = ((Object) (((SyncPoint) (obj1)).viewForQuery(queryspec)));
			//  270  644:aload           6
			//  271  646:aload           10
			//  272  648:invokevirtual   #240 <Method View SyncPoint.viewForQuery(QuerySpec)>
			//  273  651:astore          6
					setupListener(queryspec, ((View) (obj1)));
			//  274  653:aload_0         
			//  275  654:getfield        #26  <Field SyncTree this$0>
			//  276  657:aload           10
			//  277  659:aload           6
			//  278  661:invokestatic    #244 <Method void SyncTree.access$1100(SyncTree, QuerySpec, View)>
				}
				return ((List) (obj));
			//  279  664:aload           5
			//  280  666:areturn         
			}

			static final boolean $assertionsDisabled = false;
			final SyncTree this$0;
			final EventRegistration val$eventRegistration;

			static 
			{
			//    0    0:return          
			}

			
			{
				this$0 = SyncTree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field SyncTree this$0>
				eventRegistration = eventregistration;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field EventRegistration val$eventRegistration>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #30  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field PersistenceManager persistenceManager>
	//    2    4:new             #10  <Class SyncTree$11>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #391 <Method void SyncTree$11(SyncTree, EventRegistration)>
	//    7   13:invokeinterface #355 <Method Object PersistenceManager.runInTransaction(Callable)>
	//    8   18:checkcast       #235 <Class List>
	//    9   21:areturn         
	}

	public List applyListenComplete(final Path path)
	{
		return (List)persistenceManager.runInTransaction(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #33  <Method List call()>
			//    2    4:areturn         
			}

			public List call()
			{
				persistenceManager.setQueryComplete(QuerySpec.defaultQueryAtPath(path));
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field SyncTree this$0>
			//    2    4:invokestatic    #38  <Method PersistenceManager SyncTree.access$200(SyncTree)>
			//    3    7:aload_0         
			//    4    8:getfield        #22  <Field Path val$path>
			//    5   11:invokestatic    #44  <Method QuerySpec QuerySpec.defaultQueryAtPath(Path)>
			//    6   14:invokeinterface #50  <Method void PersistenceManager.setQueryComplete(QuerySpec)>
				return applyOperationToSyncPoints(((Operation) (new ListenComplete(OperationSource.SERVER, path))));
			//    7   19:aload_0         
			//    8   20:getfield        #20  <Field SyncTree this$0>
			//    9   23:new             #52  <Class ListenComplete>
			//   10   26:dup             
			//   11   27:getstatic       #58  <Field OperationSource OperationSource.SERVER>
			//   12   30:aload_0         
			//   13   31:getfield        #22  <Field Path val$path>
			//   14   34:invokespecial   #61  <Method void ListenComplete(OperationSource, Path)>
			//   15   37:invokestatic    #65  <Method List SyncTree.access$400(SyncTree, Operation)>
			//   16   40:areturn         
			}

			final SyncTree this$0;
			final Path val$path;

			
			{
				this$0 = SyncTree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field SyncTree this$0>
				path = path1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Path val$path>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field PersistenceManager persistenceManager>
	//    2    4:new             #28  <Class SyncTree$7>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #397 <Method void SyncTree$7(SyncTree, Path)>
	//    7   13:invokeinterface #355 <Method Object PersistenceManager.runInTransaction(Callable)>
	//    8   18:checkcast       #235 <Class List>
	//    9   21:areturn         
	}

	public List applyServerMerge(final Path path, final Map changedChildren)
	{
		return (List)persistenceManager.runInTransaction(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #37  <Method List call()>
			//    2    4:areturn         
			}

			public List call()
			{
				CompoundWrite compoundwrite = CompoundWrite.fromPathMerge(changedChildren);
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field Map val$changedChildren>
			//    2    4:invokestatic    #44  <Method CompoundWrite CompoundWrite.fromPathMerge(Map)>
			//    3    7:astore_1        
				persistenceManager.updateServerCache(path, compoundwrite);
			//    4    8:aload_0         
			//    5    9:getfield        #22  <Field SyncTree this$0>
			//    6   12:invokestatic    #48  <Method PersistenceManager SyncTree.access$200(SyncTree)>
			//    7   15:aload_0         
			//    8   16:getfield        #26  <Field Path val$path>
			//    9   19:aload_1         
			//   10   20:invokeinterface #54  <Method void PersistenceManager.updateServerCache(Path, CompoundWrite)>
				return applyOperationToSyncPoints(((Operation) (new Merge(OperationSource.SERVER, path, compoundwrite))));
			//   11   25:aload_0         
			//   12   26:getfield        #22  <Field SyncTree this$0>
			//   13   29:new             #56  <Class Merge>
			//   14   32:dup             
			//   15   33:getstatic       #62  <Field OperationSource OperationSource.SERVER>
			//   16   36:aload_0         
			//   17   37:getfield        #26  <Field Path val$path>
			//   18   40:aload_1         
			//   19   41:invokespecial   #65  <Method void Merge(OperationSource, Path, CompoundWrite)>
			//   20   44:invokestatic    #69  <Method List SyncTree.access$400(SyncTree, Operation)>
			//   21   47:areturn         
			}

			final SyncTree this$0;
			final Map val$changedChildren;
			final Path val$path;

			
			{
				this$0 = SyncTree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field SyncTree this$0>
				changedChildren = map;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Map val$changedChildren>
				path = path1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field Path val$path>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field PersistenceManager persistenceManager>
	//    2    4:new             #26  <Class SyncTree$6>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokespecial   #403 <Method void SyncTree$6(SyncTree, Map, Path)>
	//    8   14:invokeinterface #355 <Method Object PersistenceManager.runInTransaction(Callable)>
	//    9   19:checkcast       #235 <Class List>
	//   10   22:areturn         
	}

	public List applyServerOverwrite(final Path path, final Node newData)
	{
		return (List)persistenceManager.runInTransaction(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #37  <Method List call()>
			//    2    4:areturn         
			}

			public List call()
			{
				persistenceManager.updateServerCache(QuerySpec.defaultQueryAtPath(path), newData);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field SyncTree this$0>
			//    2    4:invokestatic    #42  <Method PersistenceManager SyncTree.access$200(SyncTree)>
			//    3    7:aload_0         
			//    4    8:getfield        #24  <Field Path val$path>
			//    5   11:invokestatic    #48  <Method QuerySpec QuerySpec.defaultQueryAtPath(Path)>
			//    6   14:aload_0         
			//    7   15:getfield        #26  <Field Node val$newData>
			//    8   18:invokeinterface #54  <Method void PersistenceManager.updateServerCache(QuerySpec, Node)>
				return applyOperationToSyncPoints(((Operation) (new Overwrite(OperationSource.SERVER, path, newData))));
			//    9   23:aload_0         
			//   10   24:getfield        #22  <Field SyncTree this$0>
			//   11   27:new             #56  <Class Overwrite>
			//   12   30:dup             
			//   13   31:getstatic       #62  <Field OperationSource OperationSource.SERVER>
			//   14   34:aload_0         
			//   15   35:getfield        #24  <Field Path val$path>
			//   16   38:aload_0         
			//   17   39:getfield        #26  <Field Node val$newData>
			//   18   42:invokespecial   #65  <Method void Overwrite(OperationSource, Path, Node)>
			//   19   45:invokestatic    #69  <Method List SyncTree.access$400(SyncTree, Operation)>
			//   20   48:areturn         
			}

			final SyncTree this$0;
			final Node val$newData;
			final Path val$path;

			
			{
				this$0 = SyncTree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field SyncTree this$0>
				path = path1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Path val$path>
				newData = node;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field Node val$newData>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field PersistenceManager persistenceManager>
	//    2    4:new             #24  <Class SyncTree$5>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #409 <Method void SyncTree$5(SyncTree, Path, Node)>
	//    8   14:invokeinterface #355 <Method Object PersistenceManager.runInTransaction(Callable)>
	//    9   19:checkcast       #235 <Class List>
	//   10   22:areturn         
	}

	public List applyServerRangeMerges(Path path, List list)
	{
		Object obj = ((Object) ((SyncPoint)syncPointTree.get(path)));
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ImmutableTree syncPointTree>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #288 <Method Object ImmutableTree.get(Path)>
	//    4    8:checkcast       #203 <Class SyncPoint>
	//    5   11:astore_3        
		if(obj == null)
	//*   6   12:aload_3         
	//*   7   13:ifnonnull       20
			return Collections.emptyList();
	//    8   16:invokestatic    #417 <Method List Collections.emptyList()>
	//    9   19:areturn         
		obj = ((Object) (((SyncPoint) (obj)).getCompleteView()));
	//   10   20:aload_3         
	//   11   21:invokevirtual   #300 <Method View SyncPoint.getCompleteView()>
	//   12   24:astore_3        
		if(obj != null)
	//*  13   25:aload_3         
	//*  14   26:ifnull          79
		{
			obj = ((Object) (((View) (obj)).getServerCache()));
	//   15   29:aload_3         
	//   16   30:invokevirtual   #423 <Method Node View.getServerCache()>
	//   17   33:astore_3        
			Iterator iterator = list.iterator();
	//   18   34:aload_2         
	//   19   35:invokeinterface #358 <Method Iterator List.iterator()>
	//   20   40:astore          4
			for(list = ((List) (obj)); iterator.hasNext(); list = ((List) (((RangeMerge)iterator.next()).applyTo(((Node) (list))))));
	//   21   42:aload_3         
	//   22   43:astore_2        
	//   23   44:aload           4
	//   24   46:invokeinterface #317 <Method boolean Iterator.hasNext()>
	//   25   51:ifeq            72
	//   26   54:aload           4
	//   27   56:invokeinterface #320 <Method Object Iterator.next()>
	//   28   61:checkcast       #425 <Class RangeMerge>
	//   29   64:aload_2         
	//   30   65:invokevirtual   #429 <Method Node RangeMerge.applyTo(Node)>
	//   31   68:astore_2        
	//*  32   69:goto            44
			return applyServerOverwrite(path, ((Node) (list)));
	//   33   72:aload_0         
	//   34   73:aload_1         
	//   35   74:aload_2         
	//   36   75:invokevirtual   #431 <Method List applyServerOverwrite(Path, Node)>
	//   37   78:areturn         
		} else
		{
			return Collections.emptyList();
	//   38   79:invokestatic    #417 <Method List Collections.emptyList()>
	//   39   82:areturn         
		}
	}

	public List applyTaggedListenComplete(final Tag tag)
	{
		return (List)persistenceManager.runInTransaction(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #33  <Method List call()>
			//    2    4:areturn         
			}

			public List call()
			{
				QuerySpec queryspec = queryForTag(tag);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field SyncTree this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field Tag val$tag>
			//    4    8:invokestatic    #38  <Method QuerySpec SyncTree.access$500(SyncTree, Tag)>
			//    5   11:astore_1        
				if(queryspec != null)
			//*   6   12:aload_1         
			//*   7   13:ifnull          57
				{
					persistenceManager.setQueryComplete(queryspec);
			//    8   16:aload_0         
			//    9   17:getfield        #20  <Field SyncTree this$0>
			//   10   20:invokestatic    #42  <Method PersistenceManager SyncTree.access$200(SyncTree)>
			//   11   23:aload_1         
			//   12   24:invokeinterface #48  <Method void PersistenceManager.setQueryComplete(QuerySpec)>
					ListenComplete listencomplete = new ListenComplete(OperationSource.forServerTaggedQuery(queryspec.getParams()), Path.getEmptyPath());
			//   13   29:new             #50  <Class ListenComplete>
			//   14   32:dup             
			//   15   33:aload_1         
			//   16   34:invokevirtual   #56  <Method com.firebase.client.core.view.QueryParams QuerySpec.getParams()>
			//   17   37:invokestatic    #62  <Method OperationSource OperationSource.forServerTaggedQuery(com.firebase.client.core.view.QueryParams)>
			//   18   40:invokestatic    #68  <Method Path Path.getEmptyPath()>
			//   19   43:invokespecial   #71  <Method void ListenComplete(OperationSource, Path)>
			//   20   46:astore_2        
					return applyTaggedOperation(queryspec, ((Operation) (listencomplete)));
			//   21   47:aload_0         
			//   22   48:getfield        #20  <Field SyncTree this$0>
			//   23   51:aload_1         
			//   24   52:aload_2         
			//   25   53:invokestatic    #75  <Method List SyncTree.access$600(SyncTree, QuerySpec, Operation)>
			//   26   56:areturn         
				} else
				{
					return Collections.emptyList();
			//   27   57:invokestatic    #80  <Method List Collections.emptyList()>
			//   28   60:areturn         
				}
			}

			final SyncTree this$0;
			final Tag val$tag;

			
			{
				this$0 = SyncTree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field SyncTree this$0>
				tag = tag1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Tag val$tag>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field PersistenceManager persistenceManager>
	//    2    4:new             #30  <Class SyncTree$8>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #437 <Method void SyncTree$8(SyncTree, Tag)>
	//    7   13:invokeinterface #355 <Method Object PersistenceManager.runInTransaction(Callable)>
	//    8   18:checkcast       #235 <Class List>
	//    9   21:areturn         
	}

	public List applyTaggedQueryMerge(final Path path, final Map changedChildren, final Tag tag)
	{
		return (List)persistenceManager.runInTransaction(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #41  <Method List call()>
			//    2    4:areturn         
			}

			public List call()
			{
				QuerySpec queryspec = queryForTag(tag);
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field SyncTree this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #26  <Field Tag val$tag>
			//    4    8:invokestatic    #46  <Method QuerySpec SyncTree.access$500(SyncTree, Tag)>
			//    5   11:astore_1        
				if(queryspec != null)
			//*   6   12:aload_1         
			//*   7   13:ifnull          80
				{
					Object obj = ((Object) (Path.getRelative(queryspec.getPath(), path)));
			//    8   16:aload_1         
			//    9   17:invokevirtual   #52  <Method Path QuerySpec.getPath()>
			//   10   20:aload_0         
			//   11   21:getfield        #28  <Field Path val$path>
			//   12   24:invokestatic    #58  <Method Path Path.getRelative(Path, Path)>
			//   13   27:astore_2        
					CompoundWrite compoundwrite = CompoundWrite.fromPathMerge(changedChildren);
			//   14   28:aload_0         
			//   15   29:getfield        #30  <Field Map val$changedChildren>
			//   16   32:invokestatic    #64  <Method CompoundWrite CompoundWrite.fromPathMerge(Map)>
			//   17   35:astore_3        
					persistenceManager.updateServerCache(path, compoundwrite);
			//   18   36:aload_0         
			//   19   37:getfield        #24  <Field SyncTree this$0>
			//   20   40:invokestatic    #68  <Method PersistenceManager SyncTree.access$200(SyncTree)>
			//   21   43:aload_0         
			//   22   44:getfield        #28  <Field Path val$path>
			//   23   47:aload_3         
			//   24   48:invokeinterface #74  <Method void PersistenceManager.updateServerCache(Path, CompoundWrite)>
					obj = ((Object) (new Merge(OperationSource.forServerTaggedQuery(queryspec.getParams()), ((Path) (obj)), compoundwrite)));
			//   25   53:new             #76  <Class Merge>
			//   26   56:dup             
			//   27   57:aload_1         
			//   28   58:invokevirtual   #80  <Method com.firebase.client.core.view.QueryParams QuerySpec.getParams()>
			//   29   61:invokestatic    #86  <Method OperationSource OperationSource.forServerTaggedQuery(com.firebase.client.core.view.QueryParams)>
			//   30   64:aload_2         
			//   31   65:aload_3         
			//   32   66:invokespecial   #89  <Method void Merge(OperationSource, Path, CompoundWrite)>
			//   33   69:astore_2        
					return applyTaggedOperation(queryspec, ((Operation) (obj)));
			//   34   70:aload_0         
			//   35   71:getfield        #24  <Field SyncTree this$0>
			//   36   74:aload_1         
			//   37   75:aload_2         
			//   38   76:invokestatic    #93  <Method List SyncTree.access$600(SyncTree, QuerySpec, Operation)>
			//   39   79:areturn         
				} else
				{
					return Collections.emptyList();
			//   40   80:invokestatic    #98  <Method List Collections.emptyList()>
			//   41   83:areturn         
				}
			}

			final SyncTree this$0;
			final Map val$changedChildren;
			final Path val$path;
			final Tag val$tag;

			
			{
				this$0 = SyncTree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field SyncTree this$0>
				tag = tag1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field Tag val$tag>
				path = path1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field Path val$path>
				changedChildren = map;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field Map val$changedChildren>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #33  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field PersistenceManager persistenceManager>
	//    2    4:new             #8   <Class SyncTree$10>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #443 <Method void SyncTree$10(SyncTree, Tag, Path, Map)>
	//    9   15:invokeinterface #355 <Method Object PersistenceManager.runInTransaction(Callable)>
	//   10   20:checkcast       #235 <Class List>
	//   11   23:areturn         
	}

	public List applyTaggedQueryOverwrite(final Path path, final Node snap, final Tag tag)
	{
		return (List)persistenceManager.runInTransaction(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #41  <Method List call()>
			//    2    4:areturn         
			}

			public List call()
			{
				QuerySpec queryspec = queryForTag(tag);
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field SyncTree this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #26  <Field Tag val$tag>
			//    4    8:invokestatic    #46  <Method QuerySpec SyncTree.access$500(SyncTree, Tag)>
			//    5   11:astore_2        
				if(queryspec != null)
			//*   6   12:aload_2         
			//*   7   13:ifnull          95
				{
					Path path1 = Path.getRelative(queryspec.getPath(), path);
			//    8   16:aload_2         
			//    9   17:invokevirtual   #52  <Method Path QuerySpec.getPath()>
			//   10   20:aload_0         
			//   11   21:getfield        #28  <Field Path val$path>
			//   12   24:invokestatic    #58  <Method Path Path.getRelative(Path, Path)>
			//   13   27:astore_3        
					Object obj;
					if(path1.isEmpty())
			//*  14   28:aload_3         
			//*  15   29:invokevirtual   #62  <Method boolean Path.isEmpty()>
			//*  16   32:ifeq            40
						obj = ((Object) (queryspec));
			//   17   35:aload_2         
			//   18   36:astore_1        
					else
			//*  19   37:goto            48
						obj = ((Object) (QuerySpec.defaultQueryAtPath(path)));
			//   20   40:aload_0         
			//   21   41:getfield        #28  <Field Path val$path>
			//   22   44:invokestatic    #66  <Method QuerySpec QuerySpec.defaultQueryAtPath(Path)>
			//   23   47:astore_1        
					persistenceManager.updateServerCache(((QuerySpec) (obj)), snap);
			//   24   48:aload_0         
			//   25   49:getfield        #24  <Field SyncTree this$0>
			//   26   52:invokestatic    #70  <Method PersistenceManager SyncTree.access$200(SyncTree)>
			//   27   55:aload_1         
			//   28   56:aload_0         
			//   29   57:getfield        #30  <Field Node val$snap>
			//   30   60:invokeinterface #76  <Method void PersistenceManager.updateServerCache(QuerySpec, Node)>
					obj = ((Object) (new Overwrite(OperationSource.forServerTaggedQuery(queryspec.getParams()), path1, snap)));
			//   31   65:new             #78  <Class Overwrite>
			//   32   68:dup             
			//   33   69:aload_2         
			//   34   70:invokevirtual   #82  <Method com.firebase.client.core.view.QueryParams QuerySpec.getParams()>
			//   35   73:invokestatic    #88  <Method OperationSource OperationSource.forServerTaggedQuery(com.firebase.client.core.view.QueryParams)>
			//   36   76:aload_3         
			//   37   77:aload_0         
			//   38   78:getfield        #30  <Field Node val$snap>
			//   39   81:invokespecial   #91  <Method void Overwrite(OperationSource, Path, Node)>
			//   40   84:astore_1        
					return applyTaggedOperation(queryspec, ((Operation) (obj)));
			//   41   85:aload_0         
			//   42   86:getfield        #24  <Field SyncTree this$0>
			//   43   89:aload_2         
			//   44   90:aload_1         
			//   45   91:invokestatic    #95  <Method List SyncTree.access$600(SyncTree, QuerySpec, Operation)>
			//   46   94:areturn         
				} else
				{
					return Collections.emptyList();
			//   47   95:invokestatic    #100 <Method List Collections.emptyList()>
			//   48   98:areturn         
				}
			}

			final SyncTree this$0;
			final Path val$path;
			final Node val$snap;
			final Tag val$tag;

			
			{
				this$0 = SyncTree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field SyncTree this$0>
				tag = tag1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field Tag val$tag>
				path = path1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field Path val$path>
				snap = node;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field Node val$snap>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #33  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field PersistenceManager persistenceManager>
	//    2    4:new             #32  <Class SyncTree$9>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #449 <Method void SyncTree$9(SyncTree, Tag, Path, Node)>
	//    9   15:invokeinterface #355 <Method Object PersistenceManager.runInTransaction(Callable)>
	//   10   20:checkcast       #235 <Class List>
	//   11   23:areturn         
	}

	public List applyTaggedRangeMerges(Path path, List list, Tag tag)
	{
		Object obj = ((Object) (queryForTag(tag)));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokespecial   #180 <Method QuerySpec queryForTag(Tag)>
	//    3    5:astore          4
		if(obj != null)
	//*   4    7:aload           4
	//*   5    9:ifnull          84
		{
			obj = ((Object) (((SyncPoint)syncPointTree.get(((QuerySpec) (obj)).getPath())).viewForQuery(((QuerySpec) (obj))).getServerCache()));
	//    6   12:aload_0         
	//    7   13:getfield        #91  <Field ImmutableTree syncPointTree>
	//    8   16:aload           4
	//    9   18:invokevirtual   #285 <Method Path QuerySpec.getPath()>
	//   10   21:invokevirtual   #288 <Method Object ImmutableTree.get(Path)>
	//   11   24:checkcast       #203 <Class SyncPoint>
	//   12   27:aload           4
	//   13   29:invokevirtual   #456 <Method View SyncPoint.viewForQuery(QuerySpec)>
	//   14   32:invokevirtual   #423 <Method Node View.getServerCache()>
	//   15   35:astore          4
			Iterator iterator = list.iterator();
	//   16   37:aload_2         
	//   17   38:invokeinterface #358 <Method Iterator List.iterator()>
	//   18   43:astore          5
			for(list = ((List) (obj)); iterator.hasNext(); list = ((List) (((RangeMerge)iterator.next()).applyTo(((Node) (list))))));
	//   19   45:aload           4
	//   20   47:astore_2        
	//   21   48:aload           5
	//   22   50:invokeinterface #317 <Method boolean Iterator.hasNext()>
	//   23   55:ifeq            76
	//   24   58:aload           5
	//   25   60:invokeinterface #320 <Method Object Iterator.next()>
	//   26   65:checkcast       #425 <Class RangeMerge>
	//   27   68:aload_2         
	//   28   69:invokevirtual   #429 <Method Node RangeMerge.applyTo(Node)>
	//   29   72:astore_2        
	//*  30   73:goto            48
			return applyTaggedQueryOverwrite(path, ((Node) (list)), tag);
	//   31   76:aload_0         
	//   32   77:aload_1         
	//   33   78:aload_2         
	//   34   79:aload_3         
	//   35   80:invokevirtual   #458 <Method List applyTaggedQueryOverwrite(Path, Node, Tag)>
	//   36   83:areturn         
		} else
		{
			return Collections.emptyList();
	//   37   84:invokestatic    #417 <Method List Collections.emptyList()>
	//   38   87:areturn         
		}
	}

	public List applyUserMerge(final Path path, final CompoundWrite unresolvedChildren, final CompoundWrite children, final long writeId, final boolean persist)
	{
		return (List)persistenceManager.runInTransaction(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #48  <Method List call()>
			//    2    4:areturn         
			}

			public List call()
				throws Exception
			{
				if(persist)
			//*   0    0:aload_0         
			//*   1    1:getfield        #29  <Field boolean val$persist>
			//*   2    4:ifeq            31
					persistenceManager.saveUserMerge(path, unresolvedChildren, writeId);
			//    3    7:aload_0         
			//    4    8:getfield        #27  <Field SyncTree this$0>
			//    5   11:invokestatic    #53  <Method PersistenceManager SyncTree.access$200(SyncTree)>
			//    6   14:aload_0         
			//    7   15:getfield        #31  <Field Path val$path>
			//    8   18:aload_0         
			//    9   19:getfield        #33  <Field CompoundWrite val$unresolvedChildren>
			//   10   22:aload_0         
			//   11   23:getfield        #35  <Field long val$writeId>
			//   12   26:invokeinterface #59  <Method void PersistenceManager.saveUserMerge(Path, CompoundWrite, long)>
				pendingWriteTree.addMerge(path, children, Long.valueOf(writeId));
			//   13   31:aload_0         
			//   14   32:getfield        #27  <Field SyncTree this$0>
			//   15   35:invokestatic    #63  <Method WriteTree SyncTree.access$300(SyncTree)>
			//   16   38:aload_0         
			//   17   39:getfield        #31  <Field Path val$path>
			//   18   42:aload_0         
			//   19   43:getfield        #37  <Field CompoundWrite val$children>
			//   20   46:aload_0         
			//   21   47:getfield        #35  <Field long val$writeId>
			//   22   50:invokestatic    #69  <Method Long Long.valueOf(long)>
			//   23   53:invokevirtual   #75  <Method void WriteTree.addMerge(Path, CompoundWrite, Long)>
				return applyOperationToSyncPoints(((Operation) (new Merge(OperationSource.USER, path, children))));
			//   24   56:aload_0         
			//   25   57:getfield        #27  <Field SyncTree this$0>
			//   26   60:new             #77  <Class Merge>
			//   27   63:dup             
			//   28   64:getstatic       #83  <Field OperationSource OperationSource.USER>
			//   29   67:aload_0         
			//   30   68:getfield        #31  <Field Path val$path>
			//   31   71:aload_0         
			//   32   72:getfield        #37  <Field CompoundWrite val$children>
			//   33   75:invokespecial   #86  <Method void Merge(OperationSource, Path, CompoundWrite)>
			//   34   78:invokestatic    #90  <Method List SyncTree.access$400(SyncTree, Operation)>
			//   35   81:areturn         
			}

			final SyncTree this$0;
			final CompoundWrite val$children;
			final Path val$path;
			final boolean val$persist;
			final CompoundWrite val$unresolvedChildren;
			final long val$writeId;

			
			{
				this$0 = SyncTree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field SyncTree this$0>
				persist = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #29  <Field boolean val$persist>
				path = path1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #31  <Field Path val$path>
				unresolvedChildren = compoundwrite;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #33  <Field CompoundWrite val$unresolvedChildren>
				writeId = l;
			//   12   21:aload_0         
			//   13   22:lload           5
			//   14   24:putfield        #35  <Field long val$writeId>
				children = compoundwrite1;
			//   15   27:aload_0         
			//   16   28:aload           7
			//   17   30:putfield        #37  <Field CompoundWrite val$children>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #40  <Method void Object()>
			//   20   37:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field PersistenceManager persistenceManager>
	//    2    4:new             #18  <Class SyncTree$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:iload           6
	//    6   11:aload_1         
	//    7   12:aload_2         
	//    8   13:lload           4
	//    9   15:aload_3         
	//   10   16:invokespecial   #464 <Method void SyncTree$2(SyncTree, boolean, Path, CompoundWrite, long, CompoundWrite)>
	//   11   19:invokeinterface #355 <Method Object PersistenceManager.runInTransaction(Callable)>
	//   12   24:checkcast       #235 <Class List>
	//   13   27:areturn         
	}

	public List applyUserOverwrite(final Path path, final Node newDataUnresolved, final Node newData, final long writeId, final boolean visible, final boolean persist)
	{
		boolean flag;
		if(!visible && persist)
	//*   0    0:iload           6
	//*   1    2:ifne            19
	//*   2    5:iload           7
	//*   3    7:ifne            13
	//*   4   10:goto            19
			flag = false;
	//    5   13:iconst_0        
	//    6   14:istore          8
		else
	//*   7   16:goto            22
			flag = true;
	//    8   19:iconst_1        
	//    9   20:istore          8
		Utilities.hardAssert(flag, "We shouldn't be persisting non-visible writes.");
	//   10   22:iload           8
	//   11   24:ldc2            #469 <String "We shouldn't be persisting non-visible writes.">
	//   12   27:invokestatic    #475 <Method void Utilities.hardAssert(boolean, String)>
		return (List)persistenceManager.runInTransaction(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #51  <Method List call()>
			//    2    4:areturn         
			}

			public List call()
			{
				if(persist)
			//*   0    0:aload_0         
			//*   1    1:getfield        #30  <Field boolean val$persist>
			//*   2    4:ifeq            31
					persistenceManager.saveUserOverwrite(path, newDataUnresolved, writeId);
			//    3    7:aload_0         
			//    4    8:getfield        #28  <Field SyncTree this$0>
			//    5   11:invokestatic    #56  <Method PersistenceManager SyncTree.access$200(SyncTree)>
			//    6   14:aload_0         
			//    7   15:getfield        #32  <Field Path val$path>
			//    8   18:aload_0         
			//    9   19:getfield        #34  <Field Node val$newDataUnresolved>
			//   10   22:aload_0         
			//   11   23:getfield        #36  <Field long val$writeId>
			//   12   26:invokeinterface #62  <Method void PersistenceManager.saveUserOverwrite(Path, Node, long)>
				pendingWriteTree.addOverwrite(path, newData, Long.valueOf(writeId), visible);
			//   13   31:aload_0         
			//   14   32:getfield        #28  <Field SyncTree this$0>
			//   15   35:invokestatic    #66  <Method WriteTree SyncTree.access$300(SyncTree)>
			//   16   38:aload_0         
			//   17   39:getfield        #32  <Field Path val$path>
			//   18   42:aload_0         
			//   19   43:getfield        #38  <Field Node val$newData>
			//   20   46:aload_0         
			//   21   47:getfield        #36  <Field long val$writeId>
			//   22   50:invokestatic    #72  <Method Long Long.valueOf(long)>
			//   23   53:aload_0         
			//   24   54:getfield        #40  <Field boolean val$visible>
			//   25   57:invokevirtual   #78  <Method void WriteTree.addOverwrite(Path, Node, Long, boolean)>
				if(!visible)
			//*  26   60:aload_0         
			//*  27   61:getfield        #40  <Field boolean val$visible>
			//*  28   64:ifne            71
					return Collections.emptyList();
			//   29   67:invokestatic    #83  <Method List Collections.emptyList()>
			//   30   70:areturn         
				else
					return applyOperationToSyncPoints(((Operation) (new Overwrite(OperationSource.USER, path, newData))));
			//   31   71:aload_0         
			//   32   72:getfield        #28  <Field SyncTree this$0>
			//   33   75:new             #85  <Class Overwrite>
			//   34   78:dup             
			//   35   79:getstatic       #91  <Field OperationSource OperationSource.USER>
			//   36   82:aload_0         
			//   37   83:getfield        #32  <Field Path val$path>
			//   38   86:aload_0         
			//   39   87:getfield        #38  <Field Node val$newData>
			//   40   90:invokespecial   #94  <Method void Overwrite(OperationSource, Path, Node)>
			//   41   93:invokestatic    #98  <Method List SyncTree.access$400(SyncTree, Operation)>
			//   42   96:areturn         
			}

			final SyncTree this$0;
			final Node val$newData;
			final Node val$newDataUnresolved;
			final Path val$path;
			final boolean val$persist;
			final boolean val$visible;
			final long val$writeId;

			
			{
				this$0 = SyncTree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #28  <Field SyncTree this$0>
				persist = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #30  <Field boolean val$persist>
				path = path1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #32  <Field Path val$path>
				newDataUnresolved = node;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #34  <Field Node val$newDataUnresolved>
				writeId = l;
			//   12   21:aload_0         
			//   13   22:lload           5
			//   14   24:putfield        #36  <Field long val$writeId>
				newData = node1;
			//   15   27:aload_0         
			//   16   28:aload           7
			//   17   30:putfield        #38  <Field Node val$newData>
				visible = flag1;
			//   18   33:aload_0         
			//   19   34:iload           8
			//   20   36:putfield        #40  <Field boolean val$visible>
				super();
			//   21   39:aload_0         
			//   22   40:invokespecial   #43  <Method void Object()>
			//   23   43:return          
			}
		}
);
	//   13   30:aload_0         
	//   14   31:getfield        #112 <Field PersistenceManager persistenceManager>
	//   15   34:new             #6   <Class SyncTree$1>
	//   16   37:dup             
	//   17   38:aload_0         
	//   18   39:iload           7
	//   19   41:aload_1         
	//   20   42:aload_2         
	//   21   43:lload           4
	//   22   45:aload_3         
	//   23   46:iload           6
	//   24   48:invokespecial   #478 <Method void SyncTree$1(SyncTree, boolean, Path, Node, long, Node, boolean)>
	//   25   51:invokeinterface #355 <Method Object PersistenceManager.runInTransaction(Callable)>
	//   26   56:checkcast       #235 <Class List>
	//   27   59:areturn         
	}

	public Node calcCompleteEventCache(Path path, List list)
	{
		ImmutableTree immutabletree = syncPointTree;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ImmutableTree syncPointTree>
	//    2    4:astore_3        
		Object obj = ((Object) ((SyncPoint)immutabletree.getValue()));
	//    3    5:aload_3         
	//    4    6:invokevirtual   #201 <Method Object ImmutableTree.getValue()>
	//    5    9:checkcast       #203 <Class SyncPoint>
	//    6   12:astore          4
		Path path1 = Path.getEmptyPath();
	//    7   14:invokestatic    #209 <Method Path Path.getEmptyPath()>
	//    8   17:astore          6
		obj = null;
	//    9   19:aconst_null     
	//   10   20:astore          4
		Path path2 = path;
	//   11   22:aload_1         
	//   12   23:astore          7
		Object obj1;
		do
		{
			obj1 = ((Object) (path2.getFront()));
	//   13   25:aload           7
	//   14   27:invokevirtual   #255 <Method ChildKey Path.getFront()>
	//   15   30:astore          5
			path2 = path2.popFront();
	//   16   32:aload           7
	//   17   34:invokevirtual   #484 <Method Path Path.popFront()>
	//   18   37:astore          7
			path1 = path1.child(((ChildKey) (obj1)));
	//   19   39:aload           6
	//   20   41:aload           5
	//   21   43:invokevirtual   #487 <Method Path Path.child(ChildKey)>
	//   22   46:astore          6
			Path path3 = Path.getRelative(path1, path);
	//   23   48:aload           6
	//   24   50:aload_1         
	//   25   51:invokestatic    #491 <Method Path Path.getRelative(Path, Path)>
	//   26   54:astore          8
			if(obj1 != null)
	//*  27   56:aload           5
	//*  28   58:ifnull          71
				immutabletree = immutabletree.getChild(((ChildKey) (obj1)));
	//   29   61:aload_3         
	//   30   62:aload           5
	//   31   64:invokevirtual   #495 <Method ImmutableTree ImmutableTree.getChild(ChildKey)>
	//   32   67:astore_3        
			else
	//*  33   68:goto            75
				immutabletree = ImmutableTree.emptyInstance();
	//   34   71:invokestatic    #89  <Method ImmutableTree ImmutableTree.emptyInstance()>
	//   35   74:astore_3        
			SyncPoint syncpoint = (SyncPoint)immutabletree.getValue();
	//   36   75:aload_3         
	//   37   76:invokevirtual   #201 <Method Object ImmutableTree.getValue()>
	//   38   79:checkcast       #203 <Class SyncPoint>
	//   39   82:astore          9
			obj1 = obj;
	//   40   84:aload           4
	//   41   86:astore          5
			if(syncpoint != null)
	//*  42   88:aload           9
	//*  43   90:ifnull          102
				obj1 = ((Object) (syncpoint.getCompleteServerCache(path3)));
	//   44   93:aload           9
	//   45   95:aload           8
	//   46   97:invokevirtual   #213 <Method Node SyncPoint.getCompleteServerCache(Path)>
	//   47  100:astore          5
			if(path2.isEmpty())
				break;
	//   48  102:aload           7
	//   49  104:invokevirtual   #251 <Method boolean Path.isEmpty()>
	//   50  107:ifne            119
			obj = obj1;
	//   51  110:aload           5
	//   52  112:astore          4
		} while(obj1 == null);
	//   53  114:aload           5
	//   54  116:ifnull          25
		return pendingWriteTree.calcCompleteEventCache(path, ((Node) (obj1)), list, true);
	//   55  119:aload_0         
	//   56  120:getfield        #96  <Field WriteTree pendingWriteTree>
	//   57  123:aload_1         
	//   58  124:aload           5
	//   59  126:aload_2         
	//   60  127:iconst_1        
	//   61  128:invokevirtual   #498 <Method Node WriteTree.calcCompleteEventCache(Path, Node, List, boolean)>
	//   62  131:areturn         
	}

	ImmutableTree getSyncPointTree()
	{
		return syncPointTree;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ImmutableTree syncPointTree>
	//    2    4:areturn         
	}

	public boolean isEmpty()
	{
		return syncPointTree.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ImmutableTree syncPointTree>
	//    2    4:invokevirtual   #502 <Method boolean ImmutableTree.isEmpty()>
	//    3    7:ireturn         
	}

	public void keepSynced(QuerySpec queryspec, boolean flag)
	{
		if(flag && !keepSyncedQueries.contains(((Object) (queryspec))))
	//*   0    0:iload_2         
	//*   1    1:ifeq            42
	//*   2    4:aload_0         
	//*   3    5:getfield        #108 <Field Set keepSyncedQueries>
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #509 <Method boolean Set.contains(Object)>
	//*   6   14:ifne            42
		{
			addEventRegistration(((EventRegistration) (new KeepSyncedEventRegistration(queryspec))));
	//    7   17:aload_0         
	//    8   18:new             #37  <Class SyncTree$KeepSyncedEventRegistration>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:invokespecial   #512 <Method void SyncTree$KeepSyncedEventRegistration(QuerySpec)>
	//   12   26:invokevirtual   #514 <Method List addEventRegistration(EventRegistration)>
	//   13   29:pop             
			keepSyncedQueries.add(((Object) (queryspec)));
	//   14   30:aload_0         
	//   15   31:getfield        #108 <Field Set keepSyncedQueries>
	//   16   34:aload_1         
	//   17   35:invokeinterface #515 <Method boolean Set.add(Object)>
	//   18   40:pop             
			return;
	//   19   41:return          
		}
		if(!flag && keepSyncedQueries.contains(((Object) (queryspec))))
	//*  20   42:iload_2         
	//*  21   43:ifne            83
	//*  22   46:aload_0         
	//*  23   47:getfield        #108 <Field Set keepSyncedQueries>
	//*  24   50:aload_1         
	//*  25   51:invokeinterface #509 <Method boolean Set.contains(Object)>
	//*  26   56:ifeq            83
		{
			removeEventRegistration(((EventRegistration) (new KeepSyncedEventRegistration(queryspec))));
	//   27   59:aload_0         
	//   28   60:new             #37  <Class SyncTree$KeepSyncedEventRegistration>
	//   29   63:dup             
	//   30   64:aload_1         
	//   31   65:invokespecial   #512 <Method void SyncTree$KeepSyncedEventRegistration(QuerySpec)>
	//   32   68:invokevirtual   #517 <Method List removeEventRegistration(EventRegistration)>
	//   33   71:pop             
			keepSyncedQueries.remove(((Object) (queryspec)));
	//   34   72:aload_0         
	//   35   73:getfield        #108 <Field Set keepSyncedQueries>
	//   36   76:aload_1         
	//   37   77:invokeinterface #519 <Method boolean Set.remove(Object)>
	//   38   82:pop             
		}
	//   39   83:return          
	}

	public List removeAllEventRegistrations(QuerySpec queryspec, FirebaseError firebaseerror)
	{
		return removeEventRegistration(queryspec, ((EventRegistration) (null)), firebaseerror);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokespecial   #523 <Method List removeEventRegistration(QuerySpec, EventRegistration, FirebaseError)>
	//    5    7:areturn         
	}

	public List removeAllWrites()
	{
		return (List)persistenceManager.runInTransaction(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #28  <Method List call()>
			//    2    4:areturn         
			}

			public List call()
				throws Exception
			{
				persistenceManager.removeAllUserWrites();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field SyncTree this$0>
			//    2    4:invokestatic    #33  <Method PersistenceManager SyncTree.access$200(SyncTree)>
			//    3    7:invokeinterface #38  <Method void PersistenceManager.removeAllUserWrites()>
				if(pendingWriteTree.purgeAllWrites().isEmpty())
			//*   4   12:aload_0         
			//*   5   13:getfield        #18  <Field SyncTree this$0>
			//*   6   16:invokestatic    #42  <Method WriteTree SyncTree.access$300(SyncTree)>
			//*   7   19:invokevirtual   #47  <Method List WriteTree.purgeAllWrites()>
			//*   8   22:invokeinterface #53  <Method boolean List.isEmpty()>
			//*   9   27:ifeq            34
				{
					return Collections.emptyList();
			//   10   30:invokestatic    #58  <Method List Collections.emptyList()>
			//   11   33:areturn         
				} else
				{
					ImmutableTree immutabletree = new ImmutableTree(((Object) (Boolean.valueOf(true))));
			//   12   34:new             #60  <Class ImmutableTree>
			//   13   37:dup             
			//   14   38:iconst_1        
			//   15   39:invokestatic    #66  <Method Boolean Boolean.valueOf(boolean)>
			//   16   42:invokespecial   #69  <Method void ImmutableTree(Object)>
			//   17   45:astore_1        
					return applyOperationToSyncPoints(((Operation) (new AckUserWrite(Path.getEmptyPath(), immutabletree, true))));
			//   18   46:aload_0         
			//   19   47:getfield        #18  <Field SyncTree this$0>
			//   20   50:new             #71  <Class AckUserWrite>
			//   21   53:dup             
			//   22   54:invokestatic    #77  <Method Path Path.getEmptyPath()>
			//   23   57:aload_1         
			//   24   58:iconst_1        
			//   25   59:invokespecial   #80  <Method void AckUserWrite(Path, ImmutableTree, boolean)>
			//   26   62:invokestatic    #84  <Method List SyncTree.access$400(SyncTree, Operation)>
			//   27   65:areturn         
				}
			}

			final SyncTree this$0;

			
			{
				this$0 = SyncTree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field SyncTree this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field PersistenceManager persistenceManager>
	//    2    4:new             #22  <Class SyncTree$4>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #526 <Method void SyncTree$4(SyncTree)>
	//    6   12:invokeinterface #355 <Method Object PersistenceManager.runInTransaction(Callable)>
	//    7   17:checkcast       #235 <Class List>
	//    8   20:areturn         
	}

	public List removeEventRegistration(EventRegistration eventregistration)
	{
		return removeEventRegistration(eventregistration.getQuerySpec(), eventregistration, ((FirebaseError) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #533 <Method QuerySpec EventRegistration.getQuerySpec()>
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #523 <Method List removeEventRegistration(QuerySpec, EventRegistration, FirebaseError)>
	//    6   10:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private static final long SIZE_THRESHOLD_FOR_COMPOUND_HASH = 1024L;
	private final Set keepSyncedQueries = new HashSet();
	private final ListenProvider listenProvider;
	private final LogWrapper logger;
	private long nextQueryTag;
	private final WriteTree pendingWriteTree = new WriteTree();
	private final PersistenceManager persistenceManager;
	private final Map queryToTagMap = new HashMap();
	private ImmutableTree syncPointTree;
	private final Map tagToQueryMap = new HashMap();

	static 
	{
	//    0    0:return          
	}


/*
	static Tag access$000(SyncTree synctree, QuerySpec queryspec)
	{
		return synctree.tagForQuery(queryspec);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #128 <Method Tag tagForQuery(QuerySpec)>
	//    3    5:areturn         
	}

*/


/*
	static LogWrapper access$100(SyncTree synctree)
	{
		return synctree.logger;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field LogWrapper logger>
	//    2    4:areturn         
	}

*/


/*
	static Map access$1000(SyncTree synctree)
	{
		return synctree.tagToQueryMap;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Map tagToQueryMap>
	//    2    4:areturn         
	}

*/


/*
	static void access$1100(SyncTree synctree, QuerySpec queryspec, View view)
	{
		synctree.setupListener(queryspec, view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #138 <Method void setupListener(QuerySpec, View)>
		return;
	//    4    6:return          
	}

*/


/*
	static List access$1200(SyncTree synctree, ImmutableTree immutabletree)
	{
		return synctree.collectDistinctViewsForSubTree(immutabletree);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #144 <Method List collectDistinctViewsForSubTree(ImmutableTree)>
	//    3    5:areturn         
	}

*/


/*
	static QuerySpec access$1300(SyncTree synctree, QuerySpec queryspec)
	{
		return synctree.queryForListening(queryspec);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #150 <Method QuerySpec queryForListening(QuerySpec)>
	//    3    5:areturn         
	}

*/


/*
	static ListenProvider access$1500(SyncTree synctree)
	{
		return synctree.listenProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field SyncTree$ListenProvider listenProvider>
	//    2    4:areturn         
	}

*/


/*
	static void access$1600(SyncTree synctree, List list)
	{
		synctree.removeTags(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #158 <Method void removeTags(List)>
		return;
	//    3    5:return          
	}

*/


/*
	static List access$1700(SyncTree synctree, Operation operation, ImmutableTree immutabletree, Node node, WriteTreeRef writetreeref)
	{
		return synctree.applyOperationDescendantsHelper(operation, immutabletree, node, writetreeref);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #164 <Method List applyOperationDescendantsHelper(Operation, ImmutableTree, Node, WriteTreeRef)>
	//    6    9:areturn         
	}

*/


/*
	static PersistenceManager access$200(SyncTree synctree)
	{
		return synctree.persistenceManager;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field PersistenceManager persistenceManager>
	//    2    4:areturn         
	}

*/


/*
	static WriteTree access$300(SyncTree synctree)
	{
		return synctree.pendingWriteTree;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field WriteTree pendingWriteTree>
	//    2    4:areturn         
	}

*/


/*
	static List access$400(SyncTree synctree, Operation operation)
	{
		return synctree.applyOperationToSyncPoints(operation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #174 <Method List applyOperationToSyncPoints(Operation)>
	//    3    5:areturn         
	}

*/


/*
	static QuerySpec access$500(SyncTree synctree, Tag tag)
	{
		return synctree.queryForTag(tag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #180 <Method QuerySpec queryForTag(Tag)>
	//    3    5:areturn         
	}

*/


/*
	static List access$600(SyncTree synctree, QuerySpec queryspec, Operation operation)
	{
		return synctree.applyTaggedOperation(queryspec, operation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #186 <Method List applyTaggedOperation(QuerySpec, Operation)>
	//    4    6:areturn         
	}

*/


/*
	static ImmutableTree access$700(SyncTree synctree)
	{
		return synctree.syncPointTree;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ImmutableTree syncPointTree>
	//    2    4:areturn         
	}

*/


/*
	static ImmutableTree access$702(SyncTree synctree, ImmutableTree immutabletree)
	{
		synctree.syncPointTree = immutabletree;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #91  <Field ImmutableTree syncPointTree>
		return immutabletree;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Map access$800(SyncTree synctree)
	{
		return synctree.queryToTagMap;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Map queryToTagMap>
	//    2    4:areturn         
	}

*/


/*
	static Tag access$900(SyncTree synctree)
	{
		return synctree.getNextQueryTag();
	//    0    0:aload_0         
	//    1    1:invokespecial   #197 <Method Tag getNextQueryTag()>
	//    2    4:areturn         
	}

*/
}
