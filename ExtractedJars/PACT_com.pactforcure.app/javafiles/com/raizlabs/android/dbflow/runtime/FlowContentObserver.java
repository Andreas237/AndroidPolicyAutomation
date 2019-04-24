// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.runtime;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.SqlUtils;
import com.raizlabs.android.dbflow.sql.language.Condition;
import com.raizlabs.android.dbflow.sql.language.SQLCondition;
import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

public class FlowContentObserver extends ContentObserver
{
	public static interface OnModelStateChangedListener
	{

		public abstract void onModelStateChanged(Class class1, com.raizlabs.android.dbflow.structure.BaseModel.Action action, SQLCondition asqlcondition[]);
	}

	public static interface OnTableChangedListener
	{

		public abstract void onTableChanged(Class class1, com.raizlabs.android.dbflow.structure.BaseModel.Action action);
	}


	public FlowContentObserver()
	{
		super(((Handler) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #43  <Method void ContentObserver(Handler)>
		modelChangeListeners = ((Set) (new CopyOnWriteArraySet()));
	//    3    5:aload_0         
	//    4    6:new             #45  <Class CopyOnWriteArraySet>
	//    5    9:dup             
	//    6   10:invokespecial   #47  <Method void CopyOnWriteArraySet()>
	//    7   13:putfield        #49  <Field Set modelChangeListeners>
		onTableChangedListeners = ((Set) (new CopyOnWriteArraySet()));
	//    8   16:aload_0         
	//    9   17:new             #45  <Class CopyOnWriteArraySet>
	//   10   20:dup             
	//   11   21:invokespecial   #47  <Method void CopyOnWriteArraySet()>
	//   12   24:putfield        #51  <Field Set onTableChangedListeners>
		registeredTables = ((Map) (new HashMap()));
	//   13   27:aload_0         
	//   14   28:new             #53  <Class HashMap>
	//   15   31:dup             
	//   16   32:invokespecial   #54  <Method void HashMap()>
	//   17   35:putfield        #56  <Field Map registeredTables>
		notificationUris = ((Set) (new HashSet()));
	//   18   38:aload_0         
	//   19   39:new             #58  <Class HashSet>
	//   20   42:dup             
	//   21   43:invokespecial   #59  <Method void HashSet()>
	//   22   46:putfield        #61  <Field Set notificationUris>
		tableUris = ((Set) (new HashSet()));
	//   23   49:aload_0         
	//   24   50:new             #58  <Class HashSet>
	//   25   53:dup             
	//   26   54:invokespecial   #59  <Method void HashSet()>
	//   27   57:putfield        #63  <Field Set tableUris>
		isInTransaction = false;
	//   28   60:aload_0         
	//   29   61:iconst_0        
	//   30   62:putfield        #65  <Field boolean isInTransaction>
		notifyAllUris = false;
	//   31   65:aload_0         
	//   32   66:iconst_0        
	//   33   67:putfield        #67  <Field boolean notifyAllUris>
	//   34   70:return          
	}

	public FlowContentObserver(Handler handler)
	{
		super(handler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #43  <Method void ContentObserver(Handler)>
		modelChangeListeners = ((Set) (new CopyOnWriteArraySet()));
	//    3    5:aload_0         
	//    4    6:new             #45  <Class CopyOnWriteArraySet>
	//    5    9:dup             
	//    6   10:invokespecial   #47  <Method void CopyOnWriteArraySet()>
	//    7   13:putfield        #49  <Field Set modelChangeListeners>
		onTableChangedListeners = ((Set) (new CopyOnWriteArraySet()));
	//    8   16:aload_0         
	//    9   17:new             #45  <Class CopyOnWriteArraySet>
	//   10   20:dup             
	//   11   21:invokespecial   #47  <Method void CopyOnWriteArraySet()>
	//   12   24:putfield        #51  <Field Set onTableChangedListeners>
		registeredTables = ((Map) (new HashMap()));
	//   13   27:aload_0         
	//   14   28:new             #53  <Class HashMap>
	//   15   31:dup             
	//   16   32:invokespecial   #54  <Method void HashMap()>
	//   17   35:putfield        #56  <Field Map registeredTables>
		notificationUris = ((Set) (new HashSet()));
	//   18   38:aload_0         
	//   19   39:new             #58  <Class HashSet>
	//   20   42:dup             
	//   21   43:invokespecial   #59  <Method void HashSet()>
	//   22   46:putfield        #61  <Field Set notificationUris>
		tableUris = ((Set) (new HashSet()));
	//   23   49:aload_0         
	//   24   50:new             #58  <Class HashSet>
	//   25   53:dup             
	//   26   54:invokespecial   #59  <Method void HashSet()>
	//   27   57:putfield        #63  <Field Set tableUris>
		isInTransaction = false;
	//   28   60:aload_0         
	//   29   61:iconst_0        
	//   30   62:putfield        #65  <Field boolean isInTransaction>
		notifyAllUris = false;
	//   31   65:aload_0         
	//   32   66:iconst_0        
	//   33   67:putfield        #67  <Field boolean notifyAllUris>
	//   34   70:return          
	}

	public static void clearRegisteredObserverCount()
	{
		REGISTERED_COUNT.set(0);
	//    0    0:getstatic       #37  <Field AtomicInteger REGISTERED_COUNT>
	//    1    3:iconst_0        
	//    2    4:invokevirtual   #71  <Method void AtomicInteger.set(int)>
	//    3    7:return          
	}

	private void onChange(boolean flag, Uri uri, boolean flag1)
	{
		Object obj = ((Object) (uri.getFragment()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #82  <Method String Uri.getFragment()>
	//    2    4:astore          5
		Object obj1 = ((Object) (uri.getAuthority()));
	//    3    6:aload_2         
	//    4    7:invokevirtual   #85  <Method String Uri.getAuthority()>
	//    5   10:astore          6
		Object obj2 = ((Object) (uri.getQueryParameterNames()));
	//    6   12:aload_2         
	//    7   13:invokevirtual   #89  <Method Set Uri.getQueryParameterNames()>
	//    8   16:astore          8
		SQLCondition asqlcondition[] = new SQLCondition[((Set) (obj2)).size()];
	//    9   18:aload           8
	//   10   20:invokeinterface #95  <Method int Set.size()>
	//   11   25:anewarray       SQLCondition[]
	//   12   28:astore          7
		if(!((Set) (obj2)).isEmpty())
	//*  13   30:aload           8
	//*  14   32:invokeinterface #101 <Method boolean Set.isEmpty()>
	//*  15   37:ifne            122
		{
			int i = 0;
	//   16   40:iconst_0        
	//   17   41:istore          4
			for(obj2 = ((Object) (((Set) (obj2)).iterator())); ((Iterator) (obj2)).hasNext();)
	//*  18   43:aload           8
	//*  19   45:invokeinterface #105 <Method Iterator Set.iterator()>
	//*  20   50:astore          8
	//*  21   52:aload           8
	//*  22   54:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//*  23   59:ifeq            122
			{
				String s = (String)((Iterator) (obj2)).next();
	//   24   62:aload           8
	//   25   64:invokeinterface #114 <Method Object Iterator.next()>
	//   26   69:checkcast       #116 <Class String>
	//   27   72:astore          9
				String s1 = Uri.decode(uri.getQueryParameter(s));
	//   28   74:aload_2         
	//   29   75:aload           9
	//   30   77:invokevirtual   #120 <Method String Uri.getQueryParameter(String)>
	//   31   80:invokestatic    #123 <Method String Uri.decode(String)>
	//   32   83:astore          10
				asqlcondition[i] = ((SQLCondition) (Condition.column((new com.raizlabs.android.dbflow.sql.language.NameAlias.Builder(Uri.decode(s))).build()).eq(((Object) (s1)))));
	//   33   85:aload           7
	//   34   87:iload           4
	//   35   89:new             #125 <Class com.raizlabs.android.dbflow.sql.language.NameAlias$Builder>
	//   36   92:dup             
	//   37   93:aload           9
	//   38   95:invokestatic    #123 <Method String Uri.decode(String)>
	//   39   98:invokespecial   #128 <Method void com.raizlabs.android.dbflow.sql.language.NameAlias$Builder(String)>
	//   40  101:invokevirtual   #132 <Method com.raizlabs.android.dbflow.sql.language.NameAlias com.raizlabs.android.dbflow.sql.language.NameAlias$Builder.build()>
	//   41  104:invokestatic    #138 <Method Condition Condition.column(com.raizlabs.android.dbflow.sql.language.NameAlias)>
	//   42  107:aload           10
	//   43  109:invokevirtual   #142 <Method Condition Condition.eq(Object)>
	//   44  112:aastore         
				i++;
	//   45  113:iload           4
	//   46  115:iconst_1        
	//   47  116:iadd            
	//   48  117:istore          4
			}

		}
	//*  49  119:goto            52
		obj1 = ((Object) ((Class)registeredTables.get(obj1)));
	//   50  122:aload_0         
	//   51  123:getfield        #56  <Field Map registeredTables>
	//   52  126:aload           6
	//   53  128:invokeinterface #148 <Method Object Map.get(Object)>
	//   54  133:checkcast       #150 <Class Class>
	//   55  136:astore          6
		obj = ((Object) (com.raizlabs.android.dbflow.structure.BaseModel.Action.valueOf(((String) (obj)))));
	//   56  138:aload           5
	//   57  140:invokestatic    #156 <Method com.raizlabs.android.dbflow.structure.BaseModel$Action com.raizlabs.android.dbflow.structure.BaseModel$Action.valueOf(String)>
	//   58  143:astore          5
		if(!isInTransaction)
	//*  59  145:aload_0         
	//*  60  146:getfield        #65  <Field boolean isInTransaction>
	//*  61  149:ifne            238
		{
			for(uri = ((Uri) (modelChangeListeners.iterator())); ((Iterator) (uri)).hasNext(); ((OnModelStateChangedListener)((Iterator) (uri)).next()).onModelStateChanged(((Class) (obj1)), ((com.raizlabs.android.dbflow.structure.BaseModel.Action) (obj)), asqlcondition));
	//   62  152:aload_0         
	//   63  153:getfield        #49  <Field Set modelChangeListeners>
	//   64  156:invokeinterface #105 <Method Iterator Set.iterator()>
	//   65  161:astore_2        
	//   66  162:aload_2         
	//   67  163:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//   68  168:ifeq            194
	//   69  171:aload_2         
	//   70  172:invokeinterface #114 <Method Object Iterator.next()>
	//   71  177:checkcast       #6   <Class FlowContentObserver$OnModelStateChangedListener>
	//   72  180:aload           6
	//   73  182:aload           5
	//   74  184:aload           7
	//   75  186:invokeinterface #160 <Method void FlowContentObserver$OnModelStateChangedListener.onModelStateChanged(Class, com.raizlabs.android.dbflow.structure.BaseModel$Action, SQLCondition[])>
	//*  76  191:goto            162
			if(!flag1)
	//*  77  194:iload_3         
	//*  78  195:ifne            307
				for(uri = ((Uri) (onTableChangedListeners.iterator())); ((Iterator) (uri)).hasNext(); ((OnTableChangedListener)((Iterator) (uri)).next()).onTableChanged(((Class) (obj1)), ((com.raizlabs.android.dbflow.structure.BaseModel.Action) (obj))));
	//   79  198:aload_0         
	//   80  199:getfield        #51  <Field Set onTableChangedListeners>
	//   81  202:invokeinterface #105 <Method Iterator Set.iterator()>
	//   82  207:astore_2        
	//   83  208:aload_2         
	//   84  209:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//   85  214:ifeq            307
	//   86  217:aload_2         
	//   87  218:invokeinterface #114 <Method Object Iterator.next()>
	//   88  223:checkcast       #9   <Class FlowContentObserver$OnTableChangedListener>
	//   89  226:aload           6
	//   90  228:aload           5
	//   91  230:invokeinterface #164 <Method void FlowContentObserver$OnTableChangedListener.onTableChanged(Class, com.raizlabs.android.dbflow.structure.BaseModel$Action)>
		} else
	//*  92  235:goto            208
		{
			if(!notifyAllUris)
	//*  93  238:aload_0         
	//*  94  239:getfield        #67  <Field boolean notifyAllUris>
	//*  95  242:ifne            258
			{
				obj = ((Object) (com.raizlabs.android.dbflow.structure.BaseModel.Action.CHANGE));
	//   96  245:getstatic       #168 <Field com.raizlabs.android.dbflow.structure.BaseModel$Action com.raizlabs.android.dbflow.structure.BaseModel$Action.CHANGE>
	//   97  248:astore          5
				uri = SqlUtils.getNotificationUri(((Class) (obj1)), ((com.raizlabs.android.dbflow.structure.BaseModel.Action) (obj)));
	//   98  250:aload           6
	//   99  252:aload           5
	//  100  254:invokestatic    #174 <Method Uri SqlUtils.getNotificationUri(Class, com.raizlabs.android.dbflow.structure.BaseModel$Action)>
	//  101  257:astore_2        
			}
			synchronized(notificationUris)
	//* 102  258:aload_0         
	//* 103  259:getfield        #61  <Field Set notificationUris>
	//* 104  262:astore          7
	//* 105  264:aload           7
	//* 106  266:monitorenter    
			{
				notificationUris.add(((Object) (uri)));
	//  107  267:aload_0         
	//  108  268:getfield        #61  <Field Set notificationUris>
	//  109  271:aload_2         
	//  110  272:invokeinterface #178 <Method boolean Set.add(Object)>
	//  111  277:pop             
			}
	//  112  278:aload           7
	//  113  280:monitorexit     
			synchronized(tableUris)
	//* 114  281:aload_0         
	//* 115  282:getfield        #63  <Field Set tableUris>
	//* 116  285:astore_2        
	//* 117  286:aload_2         
	//* 118  287:monitorenter    
			{
				tableUris.add(((Object) (SqlUtils.getNotificationUri(((Class) (obj1)), ((com.raizlabs.android.dbflow.structure.BaseModel.Action) (obj))))));
	//  119  288:aload_0         
	//  120  289:getfield        #63  <Field Set tableUris>
	//  121  292:aload           6
	//  122  294:aload           5
	//  123  296:invokestatic    #174 <Method Uri SqlUtils.getNotificationUri(Class, com.raizlabs.android.dbflow.structure.BaseModel$Action)>
	//  124  299:invokeinterface #178 <Method boolean Set.add(Object)>
	//  125  304:pop             
			}
	//  126  305:aload_2         
	//  127  306:monitorexit     
		}
		return;
	//  128  307:return          
		uri;
	//  129  308:astore_2        
		set;
	//  130  309:aload           7
		JVM INSTR monitorexit ;
	//  131  311:monitorexit     
		throw uri;
	//  132  312:aload_2         
	//  133  313:athrow          
		exception;
	//  134  314:astore          5
		uri;
	//  135  316:aload_2         
		JVM INSTR monitorexit ;
	//  136  317:monitorexit     
		throw exception;
	//  137  318:aload           5
	//  138  320:athrow          
	}

	public static void setShouldForceNotify(boolean flag)
	{
		forceNotify = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #39  <Field boolean forceNotify>
	//    2    4:return          
	}

	public static boolean shouldNotify()
	{
		return forceNotify || REGISTERED_COUNT.get() > 0;
	//    0    0:getstatic       #39  <Field boolean forceNotify>
	//    1    3:ifne            15
	//    2    6:getstatic       #37  <Field AtomicInteger REGISTERED_COUNT>
	//    3    9:invokevirtual   #184 <Method int AtomicInteger.get()>
	//    4   12:ifle            17
	//    5   15:iconst_1        
	//    6   16:ireturn         
	//    7   17:iconst_0        
	//    8   18:ireturn         
	}

	public void addModelChangeListener(OnModelStateChangedListener onmodelstatechangedlistener)
	{
		modelChangeListeners.add(((Object) (onmodelstatechangedlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Set modelChangeListeners>
	//    2    4:aload_1         
	//    3    5:invokeinterface #178 <Method boolean Set.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void addOnTableChangedListener(OnTableChangedListener ontablechangedlistener)
	{
		onTableChangedListeners.add(((Object) (ontablechangedlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Set onTableChangedListeners>
	//    2    4:aload_1         
	//    3    5:invokeinterface #178 <Method boolean Set.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void beginTransaction()
	{
		if(!isInTransaction)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field boolean isInTransaction>
	//*   2    4:ifne            12
			isInTransaction = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #65  <Field boolean isInTransaction>
	//    6   12:return          
	}

	public void endTransactionAndNotify()
	{
label0:
		{
			if(isInTransaction)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field boolean isInTransaction>
	//*   2    4:ifeq            25
			{
				isInTransaction = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #65  <Field boolean isInTransaction>
				if(android.os.Build.VERSION.SDK_INT >= 16)
					break label0;
	//    6   12:getstatic       #196 <Field int android.os.Build$VERSION.SDK_INT>
	//    7   15:bipush          16
	//    8   17:icmpge          26
				onChange(true);
	//    9   20:aload_0         
	//   10   21:iconst_1        
	//   11   22:invokevirtual   #198 <Method void onChange(boolean)>
			}
			return;
	//   12   25:return          
		}
		Set set = notificationUris;
	//   13   26:aload_0         
	//   14   27:getfield        #61  <Field Set notificationUris>
	//   15   30:astore_1        
		set;
	//   16   31:aload_1         
		JVM INSTR monitorenter ;
	//   17   32:monitorenter    
		for(Iterator iterator = notificationUris.iterator(); iterator.hasNext(); onChange(true, (Uri)iterator.next(), true));
	//   18   33:aload_0         
	//   19   34:getfield        #61  <Field Set notificationUris>
	//   20   37:invokeinterface #105 <Method Iterator Set.iterator()>
	//   21   42:astore_2        
	//   22   43:aload_2         
	//   23   44:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//   24   49:ifeq            75
	//   25   52:aload_0         
	//   26   53:iconst_1        
	//   27   54:aload_2         
	//   28   55:invokeinterface #114 <Method Object Iterator.next()>
	//   29   60:checkcast       #78  <Class Uri>
	//   30   63:iconst_1        
	//   31   64:invokespecial   #200 <Method void onChange(boolean, Uri, boolean)>
		break MISSING_BLOCK_LABEL_75;
	//   32   67:goto            43
		Exception exception;
		exception;
	//   33   70:astore_2        
		set;
	//   34   71:aload_1         
		JVM INSTR monitorexit ;
	//   35   72:monitorexit     
		throw exception;
	//   36   73:aload_2         
	//   37   74:athrow          
		notificationUris.clear();
	//   38   75:aload_0         
	//   39   76:getfield        #61  <Field Set notificationUris>
	//   40   79:invokeinterface #203 <Method void Set.clear()>
		set;
	//   41   84:aload_1         
		JVM INSTR monitorexit ;
	//   42   85:monitorexit     
		set = tableUris;
	//   43   86:aload_0         
	//   44   87:getfield        #63  <Field Set tableUris>
	//   45   90:astore_1        
		set;
	//   46   91:aload_1         
		JVM INSTR monitorenter ;
	//   47   92:monitorenter    
		for(Iterator iterator1 = tableUris.iterator(); iterator1.hasNext();)
	//*  48   93:aload_0         
	//*  49   94:getfield        #63  <Field Set tableUris>
	//*  50   97:invokeinterface #105 <Method Iterator Set.iterator()>
	//*  51  102:astore_2        
	//*  52  103:aload_2         
	//*  53  104:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//*  54  109:ifeq            189
		{
			Uri uri = (Uri)iterator1.next();
	//   55  112:aload_2         
	//   56  113:invokeinterface #114 <Method Object Iterator.next()>
	//   57  118:checkcast       #78  <Class Uri>
	//   58  121:astore_3        
			Iterator iterator2 = onTableChangedListeners.iterator();
	//   59  122:aload_0         
	//   60  123:getfield        #51  <Field Set onTableChangedListeners>
	//   61  126:invokeinterface #105 <Method Iterator Set.iterator()>
	//   62  131:astore          4
			while(iterator2.hasNext()) 
	//*  63  133:aload           4
	//*  64  135:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//*  65  140:ifeq            103
				((OnTableChangedListener)iterator2.next()).onTableChanged((Class)registeredTables.get(((Object) (uri.getAuthority()))), com.raizlabs.android.dbflow.structure.BaseModel.Action.valueOf(uri.getFragment()));
	//   66  143:aload           4
	//   67  145:invokeinterface #114 <Method Object Iterator.next()>
	//   68  150:checkcast       #9   <Class FlowContentObserver$OnTableChangedListener>
	//   69  153:aload_0         
	//   70  154:getfield        #56  <Field Map registeredTables>
	//   71  157:aload_3         
	//   72  158:invokevirtual   #85  <Method String Uri.getAuthority()>
	//   73  161:invokeinterface #148 <Method Object Map.get(Object)>
	//   74  166:checkcast       #150 <Class Class>
	//   75  169:aload_3         
	//   76  170:invokevirtual   #82  <Method String Uri.getFragment()>
	//   77  173:invokestatic    #156 <Method com.raizlabs.android.dbflow.structure.BaseModel$Action com.raizlabs.android.dbflow.structure.BaseModel$Action.valueOf(String)>
	//   78  176:invokeinterface #164 <Method void FlowContentObserver$OnTableChangedListener.onTableChanged(Class, com.raizlabs.android.dbflow.structure.BaseModel$Action)>
		}

		break MISSING_BLOCK_LABEL_189;
	//   79  181:goto            133
		iterator1;
	//   80  184:astore_2        
		set;
	//   81  185:aload_1         
		JVM INSTR monitorexit ;
	//   82  186:monitorexit     
		throw iterator1;
	//   83  187:aload_2         
	//   84  188:athrow          
		tableUris.clear();
	//   85  189:aload_0         
	//   86  190:getfield        #63  <Field Set tableUris>
	//   87  193:invokeinterface #203 <Method void Set.clear()>
		set;
	//   88  198:aload_1         
		JVM INSTR monitorexit ;
	//   89  199:monitorexit     
	//   90  200:return          
	}

	public void onChange(boolean flag)
	{
		for(Iterator iterator = modelChangeListeners.iterator(); iterator.hasNext(); ((OnModelStateChangedListener)iterator.next()).onModelStateChanged(((Class) (null)), com.raizlabs.android.dbflow.structure.BaseModel.Action.CHANGE, new SQLCondition[0]));
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Set modelChangeListeners>
	//    2    4:invokeinterface #105 <Method Iterator Set.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            44
	//    7   19:aload_2         
	//    8   20:invokeinterface #114 <Method Object Iterator.next()>
	//    9   25:checkcast       #6   <Class FlowContentObserver$OnModelStateChangedListener>
	//   10   28:aconst_null     
	//   11   29:getstatic       #168 <Field com.raizlabs.android.dbflow.structure.BaseModel$Action com.raizlabs.android.dbflow.structure.BaseModel$Action.CHANGE>
	//   12   32:iconst_0        
	//   13   33:anewarray       SQLCondition[]
	//   14   36:invokeinterface #160 <Method void FlowContentObserver$OnModelStateChangedListener.onModelStateChanged(Class, com.raizlabs.android.dbflow.structure.BaseModel$Action, SQLCondition[])>
	//*  15   41:goto            10
		for(Iterator iterator1 = onTableChangedListeners.iterator(); iterator1.hasNext(); ((OnTableChangedListener)iterator1.next()).onTableChanged(((Class) (null)), com.raizlabs.android.dbflow.structure.BaseModel.Action.CHANGE));
	//   16   44:aload_0         
	//   17   45:getfield        #51  <Field Set onTableChangedListeners>
	//   18   48:invokeinterface #105 <Method Iterator Set.iterator()>
	//   19   53:astore_2        
	//   20   54:aload_2         
	//   21   55:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//   22   60:ifeq            84
	//   23   63:aload_2         
	//   24   64:invokeinterface #114 <Method Object Iterator.next()>
	//   25   69:checkcast       #9   <Class FlowContentObserver$OnTableChangedListener>
	//   26   72:aconst_null     
	//   27   73:getstatic       #168 <Field com.raizlabs.android.dbflow.structure.BaseModel$Action com.raizlabs.android.dbflow.structure.BaseModel$Action.CHANGE>
	//   28   76:invokeinterface #164 <Method void FlowContentObserver$OnTableChangedListener.onTableChanged(Class, com.raizlabs.android.dbflow.structure.BaseModel$Action)>
	//*  29   81:goto            54
	//   30   84:return          
	}

	public void onChange(boolean flag, Uri uri)
	{
		onChange(flag, uri, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #200 <Method void onChange(boolean, Uri, boolean)>
	//    5    7:return          
	}

	public void registerForContentChanges(ContentResolver contentresolver, Class class1)
	{
		contentresolver.registerContentObserver(SqlUtils.getNotificationUri(class1, ((com.raizlabs.android.dbflow.structure.BaseModel.Action) (null))), true, ((ContentObserver) (this)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #174 <Method Uri SqlUtils.getNotificationUri(Class, com.raizlabs.android.dbflow.structure.BaseModel$Action)>
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #212 <Method void ContentResolver.registerContentObserver(Uri, boolean, ContentObserver)>
		REGISTERED_COUNT.incrementAndGet();
	//    7   11:getstatic       #37  <Field AtomicInteger REGISTERED_COUNT>
	//    8   14:invokevirtual   #215 <Method int AtomicInteger.incrementAndGet()>
	//    9   17:pop             
		if(!registeredTables.containsValue(((Object) (class1))))
	//*  10   18:aload_0         
	//*  11   19:getfield        #56  <Field Map registeredTables>
	//*  12   22:aload_2         
	//*  13   23:invokeinterface #218 <Method boolean Map.containsValue(Object)>
	//*  14   28:ifne            46
			registeredTables.put(((Object) (FlowManager.getTableName(class1))), ((Object) (class1)));
	//   15   31:aload_0         
	//   16   32:getfield        #56  <Field Map registeredTables>
	//   17   35:aload_2         
	//   18   36:invokestatic    #224 <Method String FlowManager.getTableName(Class)>
	//   19   39:aload_2         
	//   20   40:invokeinterface #228 <Method Object Map.put(Object, Object)>
	//   21   45:pop             
	//   22   46:return          
	}

	public void registerForContentChanges(Context context, Class class1)
	{
		registerForContentChanges(context.getContentResolver(), class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #237 <Method ContentResolver Context.getContentResolver()>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #239 <Method void registerForContentChanges(ContentResolver, Class)>
	//    5    9:return          
	}

	public void removeModelChangeListener(OnModelStateChangedListener onmodelstatechangedlistener)
	{
		modelChangeListeners.remove(((Object) (onmodelstatechangedlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Set modelChangeListeners>
	//    2    4:aload_1         
	//    3    5:invokeinterface #244 <Method boolean Set.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void removeTableChangedListener(OnTableChangedListener ontablechangedlistener)
	{
		onTableChangedListeners.remove(((Object) (ontablechangedlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Set onTableChangedListeners>
	//    2    4:aload_1         
	//    3    5:invokeinterface #244 <Method boolean Set.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void setNotifyAllUris(boolean flag)
	{
		notifyAllUris = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #67  <Field boolean notifyAllUris>
	//    3    5:return          
	}

	public void unregisterForContentChanges(Context context)
	{
		context.getContentResolver().unregisterContentObserver(((ContentObserver) (this)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #237 <Method ContentResolver Context.getContentResolver()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #252 <Method void ContentResolver.unregisterContentObserver(ContentObserver)>
		REGISTERED_COUNT.decrementAndGet();
	//    4    8:getstatic       #37  <Field AtomicInteger REGISTERED_COUNT>
	//    5   11:invokevirtual   #255 <Method int AtomicInteger.decrementAndGet()>
	//    6   14:pop             
		registeredTables.clear();
	//    7   15:aload_0         
	//    8   16:getfield        #56  <Field Map registeredTables>
	//    9   19:invokeinterface #256 <Method void Map.clear()>
	//   10   24:return          
	}

	private static final AtomicInteger REGISTERED_COUNT = new AtomicInteger(0);
	private static boolean forceNotify = false;
	protected boolean isInTransaction;
	private final Set modelChangeListeners;
	private final Set notificationUris;
	private boolean notifyAllUris;
	private final Set onTableChangedListeners;
	private final Map registeredTables;
	private final Set tableUris;

	static 
	{
	//    0    0:new             #31  <Class AtomicInteger>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #35  <Method void AtomicInteger(int)>
	//    4    8:putstatic       #37  <Field AtomicInteger REGISTERED_COUNT>
	//    5   11:iconst_0        
	//    6   12:putstatic       #39  <Field boolean forceNotify>
	//*   7   15:return          
	}
}
