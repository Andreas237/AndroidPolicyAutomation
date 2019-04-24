// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.internal.Utility;
import java.io.*;
import java.util.*;

// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

static class AppEventsLogger$PersistedEvents
{

	public static void persistEvents(Context context1, Pair pair, te te)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #29  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void HashMap()>
	//    3    7:astore_3        
		((Map) (hashmap)).put(((Object) (pair)), ((Object) (te)));
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//    8   16:pop             
		persistEvents(context1, ((Map) (hashmap)));
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:invokestatic    #45  <Method void persistEvents(Context, Map)>
	//   12   22:return          
	}

	public static void persistEvents(Context context1, Map map)
	{
		Object obj = staticLock;
	//    0    0:getstatic       #25  <Field Object staticLock>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		context1 = ((Context) (readAndClearStore(context1)));
	//    4    6:aload_0         
	//    5    7:invokestatic    #49  <Method AppEventsLogger$PersistedEvents readAndClearStore(Context)>
	//    6   10:astore_0        
		map = ((Map) (map.entrySet().iterator()));
	//    7   11:aload_1         
	//    8   12:invokeinterface #53  <Method Set Map.entrySet()>
	//    9   17:invokeinterface #59  <Method Iterator Set.iterator()>
	//   10   22:astore_1        
_L1:
		java.util.Map.Entry entry;
		List list;
		do
		{
			if(!((Iterator) (map)).hasNext())
				break MISSING_BLOCK_LABEL_87;
	//   11   23:aload_1         
	//   12   24:invokeinterface #65  <Method boolean Iterator.hasNext()>
	//   13   29:ifeq            87
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   14   32:aload_1         
	//   15   33:invokeinterface #69  <Method Object Iterator.next()>
	//   16   38:checkcast       #71  <Class java.util.Map$Entry>
	//   17   41:astore_3        
			list = ((te)entry.getValue()).getEventsToPersist();
	//   18   42:aload_3         
	//   19   43:invokeinterface #74  <Method Object java.util.Map$Entry.getValue()>
	//   20   48:checkcast       #76  <Class AppEventsLogger$SessionEventsState>
	//   21   51:invokevirtual   #80  <Method List AppEventsLogger$SessionEventsState.getEventsToPersist()>
	//   22   54:astore          4
		} while(list.size() == 0);
	//   23   56:aload           4
	//   24   58:invokeinterface #86  <Method int List.size()>
	//   25   63:ifne            69
	//*  26   66:goto            23
		((AppEventsLogger$PersistedEvents) (context1)).addEvents((Pair)entry.getKey(), list);
	//   27   69:aload_0         
	//   28   70:aload_3         
	//   29   71:invokeinterface #89  <Method Object java.util.Map$Entry.getKey()>
	//   30   76:checkcast       #91  <Class AppEventsLogger$AccessTokenAppIdPair>
	//   31   79:aload           4
	//   32   81:invokevirtual   #95  <Method void addEvents(AppEventsLogger$AccessTokenAppIdPair, List)>
		  goto _L1
	//*  33   84:goto            23
		((AppEventsLogger$PersistedEvents) (context1)).write();
	//   34   87:aload_0         
	//   35   88:invokespecial   #98  <Method void write()>
		obj;
	//   36   91:aload_2         
		JVM INSTR monitorexit ;
	//   37   92:monitorexit     
		return;
	//   38   93:return          
		context1;
	//   39   94:astore_0        
		obj;
	//   40   95:aload_2         
		JVM INSTR monitorexit ;
	//   41   96:monitorexit     
		throw context1;
	//   42   97:aload_0         
	//   43   98:athrow          
	}

	public static AppEventsLogger$PersistedEvents readAndClearStore(Context context1)
	{
		synchronized(staticLock)
	//*   0    0:getstatic       #25  <Field Object staticLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			context1 = ((Context) (new AppEventsLogger$PersistedEvents(context1)));
	//    4    6:new             #2   <Class AppEventsLogger$PersistedEvents>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #102 <Method void AppEventsLogger$PersistedEvents(Context)>
	//    8   14:astore_0        
			((AppEventsLogger$PersistedEvents) (context1)).readAndClearStore();
	//    9   15:aload_0         
	//   10   16:invokespecial   #104 <Method void readAndClearStore()>
		}
	//   11   19:aload_1         
	//   12   20:monitorexit     
		return ((AppEventsLogger$PersistedEvents) (context1));
	//   13   21:aload_0         
	//   14   22:areturn         
		context1;
	//   15   23:astore_0        
		obj;
	//   16   24:aload_1         
		JVM INSTR monitorexit ;
	//   17   25:monitorexit     
		throw context1;
	//   18   26:aload_0         
	//   19   27:athrow          
	}

	private void readAndClearStore()
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		Object obj = ((Object) (new ObjectInputStream(((java.io.InputStream) (new BufferedInputStream(((java.io.InputStream) (context.openFileInput("AppEventsLogger.persistedevents")))))))));
	//    2    2:new             #110 <Class ObjectInputStream>
	//    3    5:dup             
	//    4    6:new             #112 <Class BufferedInputStream>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:getfield        #34  <Field Context context>
	//    8   14:ldc1            #11  <String "AppEventsLogger.persistedevents">
	//    9   16:invokevirtual   #118 <Method java.io.FileInputStream Context.openFileInput(String)>
	//   10   19:invokespecial   #121 <Method void BufferedInputStream(java.io.InputStream)>
	//   11   22:invokespecial   #122 <Method void ObjectInputStream(java.io.InputStream)>
	//   12   25:astore_1        
		obj1 = obj;
	//   13   26:aload_1         
	//   14   27:astore_2        
		HashMap hashmap = (HashMap)((ObjectInputStream) (obj)).readObject();
	//   15   28:aload_1         
	//   16   29:invokevirtual   #125 <Method Object ObjectInputStream.readObject()>
	//   17   32:checkcast       #29  <Class HashMap>
	//   18   35:astore_3        
		obj1 = obj;
	//   19   36:aload_1         
	//   20   37:astore_2        
		context.getFileStreamPath("AppEventsLogger.persistedevents").delete();
	//   21   38:aload_0         
	//   22   39:getfield        #34  <Field Context context>
	//   23   42:ldc1            #11  <String "AppEventsLogger.persistedevents">
	//   24   44:invokevirtual   #129 <Method File Context.getFileStreamPath(String)>
	//   25   47:invokevirtual   #134 <Method boolean File.delete()>
	//   26   50:pop             
		obj1 = obj;
	//   27   51:aload_1         
	//   28   52:astore_2        
		persistedEvents = hashmap;
	//   29   53:aload_0         
	//   30   54:aload_3         
	//   31   55:putfield        #32  <Field HashMap persistedEvents>
		break MISSING_BLOCK_LABEL_130;
	//   32   58:goto            130
		Exception exception;
		exception;
	//   33   61:astore_3        
		break MISSING_BLOCK_LABEL_77;
	//   34   62:goto            77
	//*  35   65:goto            142
		obj;
	//   36   68:astore_1        
		obj1 = null;
	//   37   69:aconst_null     
	//   38   70:astore_2        
		break MISSING_BLOCK_LABEL_136;
	//   39   71:goto            136
		exception;
	//   40   74:astore_3        
		obj = null;
	//   41   75:aconst_null     
	//   42   76:astore_1        
		obj1 = obj;
	//   43   77:aload_1         
	//   44   78:astore_2        
		String s = AppEventsLogger.access$1300();
	//   45   79:invokestatic    #138 <Method String AppEventsLogger.access$1300()>
	//   46   82:astore          4
		obj1 = obj;
	//   47   84:aload_1         
	//   48   85:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   49   86:new             #140 <Class StringBuilder>
	//   50   89:dup             
	//   51   90:invokespecial   #141 <Method void StringBuilder()>
	//   52   93:astore          5
		obj1 = obj;
	//   53   95:aload_1         
	//   54   96:astore_2        
		stringbuilder.append("Got unexpected exception: ");
	//   55   97:aload           5
	//   56   99:ldc1            #143 <String "Got unexpected exception: ">
	//   57  101:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   58  104:pop             
		obj1 = obj;
	//   59  105:aload_1         
	//   60  106:astore_2        
		stringbuilder.append(exception.toString());
	//   61  107:aload           5
	//   62  109:aload_3         
	//   63  110:invokevirtual   #150 <Method String Exception.toString()>
	//   64  113:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   65  116:pop             
		obj1 = obj;
	//   66  117:aload_1         
	//   67  118:astore_2        
		Log.d(s, stringbuilder.toString());
	//   68  119:aload           4
	//   69  121:aload           5
	//   70  123:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   71  126:invokestatic    #157 <Method int Log.d(String, String)>
	//   72  129:pop             
		Utility.closeQuietly(((java.io.Closeable) (obj)));
	//   73  130:aload_1         
	//   74  131:invokestatic    #163 <Method void Utility.closeQuietly(java.io.Closeable)>
		return;
	//   75  134:return          
		obj;
	//   76  135:astore_1        
		Utility.closeQuietly(((java.io.Closeable) (obj1)));
	//   77  136:aload_2         
	//   78  137:invokestatic    #163 <Method void Utility.closeQuietly(java.io.Closeable)>
		throw obj;
	//   79  140:aload_1         
	//   80  141:athrow          
_L2:
		Utility.closeQuietly(((java.io.Closeable) (obj)));
	//   81  142:aload_1         
	//   82  143:invokestatic    #163 <Method void Utility.closeQuietly(java.io.Closeable)>
		return;
	//   83  146:return          
		FileNotFoundException filenotfoundexception;
		filenotfoundexception;
	//   84  147:astore_1        
		filenotfoundexception = ((FileNotFoundException) (obj1));
	//   85  148:aload_2         
	//   86  149:astore_1        
		continue; /* Loop/switch isn't completed */
	//   87  150:goto            142
		FileNotFoundException filenotfoundexception1;
		filenotfoundexception1;
	//   88  153:astore_2        
		if(true) goto _L2; else goto _L1
_L1:
	//*  89  154:goto            65
	}

	private void write()
	{
		Object obj;
		String s;
		s = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		obj = null;
	//    2    3:aconst_null     
	//    3    4:astore_1        
		Object obj1 = ((Object) (new ObjectOutputStream(((java.io.OutputStream) (new BufferedOutputStream(((java.io.OutputStream) (context.openFileOutput("AppEventsLogger.persistedevents", 0)))))))));
	//    4    5:new             #165 <Class ObjectOutputStream>
	//    5    8:dup             
	//    6    9:new             #167 <Class BufferedOutputStream>
	//    7   12:dup             
	//    8   13:aload_0         
	//    9   14:getfield        #34  <Field Context context>
	//   10   17:ldc1            #11  <String "AppEventsLogger.persistedevents">
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #171 <Method java.io.FileOutputStream Context.openFileOutput(String, int)>
	//   13   23:invokespecial   #174 <Method void BufferedOutputStream(java.io.OutputStream)>
	//   14   26:invokespecial   #175 <Method void ObjectOutputStream(java.io.OutputStream)>
	//   15   29:astore_2        
		((ObjectOutputStream) (obj1)).writeObject(((Object) (persistedEvents)));
	//   16   30:aload_2         
	//   17   31:aload_0         
	//   18   32:getfield        #32  <Field HashMap persistedEvents>
	//   19   35:invokevirtual   #179 <Method void ObjectOutputStream.writeObject(Object)>
		Utility.closeQuietly(((java.io.Closeable) (obj1)));
	//   20   38:aload_2         
	//   21   39:invokestatic    #163 <Method void Utility.closeQuietly(java.io.Closeable)>
		return;
	//   22   42:return          
		obj;
	//   23   43:astore_1        
		break MISSING_BLOCK_LABEL_121;
	//   24   44:goto            121
		Object obj2;
		obj2;
	//   25   47:astore_3        
		break MISSING_BLOCK_LABEL_63;
	//   26   48:goto            63
		obj2;
	//   27   51:astore_3        
		obj1 = obj;
	//   28   52:aload_1         
	//   29   53:astore_2        
		obj = obj2;
	//   30   54:aload_3         
	//   31   55:astore_1        
		break MISSING_BLOCK_LABEL_121;
	//   32   56:goto            121
		obj2;
	//   33   59:astore_3        
		obj1 = ((Object) (s));
	//   34   60:aload           4
	//   35   62:astore_2        
		obj = obj1;
	//   36   63:aload_2         
	//   37   64:astore_1        
		s = AppEventsLogger.access$1300();
	//   38   65:invokestatic    #138 <Method String AppEventsLogger.access$1300()>
	//   39   68:astore          4
		obj = obj1;
	//   40   70:aload_2         
	//   41   71:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   42   72:new             #140 <Class StringBuilder>
	//   43   75:dup             
	//   44   76:invokespecial   #141 <Method void StringBuilder()>
	//   45   79:astore          5
		obj = obj1;
	//   46   81:aload_2         
	//   47   82:astore_1        
		stringbuilder.append("Got unexpected exception: ");
	//   48   83:aload           5
	//   49   85:ldc1            #143 <String "Got unexpected exception: ">
	//   50   87:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   51   90:pop             
		obj = obj1;
	//   52   91:aload_2         
	//   53   92:astore_1        
		stringbuilder.append(((Exception) (obj2)).toString());
	//   54   93:aload           5
	//   55   95:aload_3         
	//   56   96:invokevirtual   #150 <Method String Exception.toString()>
	//   57   99:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   58  102:pop             
		obj = obj1;
	//   59  103:aload_2         
	//   60  104:astore_1        
		Log.d(s, stringbuilder.toString());
	//   61  105:aload           4
	//   62  107:aload           5
	//   63  109:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   64  112:invokestatic    #157 <Method int Log.d(String, String)>
	//   65  115:pop             
		Utility.closeQuietly(((java.io.Closeable) (obj1)));
	//   66  116:aload_2         
	//   67  117:invokestatic    #163 <Method void Utility.closeQuietly(java.io.Closeable)>
		return;
	//   68  120:return          
		Utility.closeQuietly(((java.io.Closeable) (obj1)));
	//   69  121:aload_2         
	//   70  122:invokestatic    #163 <Method void Utility.closeQuietly(java.io.Closeable)>
		throw obj;
	//   71  125:aload_1         
	//   72  126:athrow          
	}

	public void addEvents(Pair pair, List list)
	{
		if(!persistedEvents.containsKey(((Object) (pair))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field HashMap persistedEvents>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #183 <Method boolean HashMap.containsKey(Object)>
	//*   4    8:ifne            27
			persistedEvents.put(((Object) (pair)), ((Object) (new ArrayList())));
	//    5   11:aload_0         
	//    6   12:getfield        #32  <Field HashMap persistedEvents>
	//    7   15:aload_1         
	//    8   16:new             #185 <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #186 <Method void ArrayList()>
	//   11   23:invokevirtual   #187 <Method Object HashMap.put(Object, Object)>
	//   12   26:pop             
		((List)persistedEvents.get(((Object) (pair)))).addAll(((java.util.Collection) (list)));
	//   13   27:aload_0         
	//   14   28:getfield        #32  <Field HashMap persistedEvents>
	//   15   31:aload_1         
	//   16   32:invokevirtual   #191 <Method Object HashMap.get(Object)>
	//   17   35:checkcast       #82  <Class List>
	//   18   38:aload_2         
	//   19   39:invokeinterface #195 <Method boolean List.addAll(java.util.Collection)>
	//   20   44:pop             
	//   21   45:return          
	}

	public List getEvents(Pair pair)
	{
		return (List)persistedEvents.get(((Object) (pair)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field HashMap persistedEvents>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #191 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #82  <Class List>
	//    5   11:areturn         
	}

	public Set keySet()
	{
		return persistedEvents.keySet();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field HashMap persistedEvents>
	//    2    4:invokevirtual   #202 <Method Set HashMap.keySet()>
	//    3    7:areturn         
	}

	static final String PERSISTED_EVENTS_FILENAME = "AppEventsLogger.persistedevents";
	private static Object staticLock = new Object();
	private Context context;
	private HashMap persistedEvents;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void Object()>
	//    3    7:putstatic       #25  <Field Object staticLock>
	//*   4   10:return          
	}

	private AppEventsLogger$PersistedEvents(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		persistedEvents = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #29  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void HashMap()>
	//    6   12:putfield        #32  <Field HashMap persistedEvents>
		context = context1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #34  <Field Context context>
	//   10   20:return          
	}
}
