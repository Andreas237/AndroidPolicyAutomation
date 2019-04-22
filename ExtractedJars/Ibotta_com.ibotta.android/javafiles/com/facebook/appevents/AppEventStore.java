// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.Utility;
import java.io.*;
import java.util.*;

// Referenced classes of package com.facebook.appevents:
//			PersistedEvents, SessionEventsState, AppEventCollection, AccessTokenAppIdPair

class AppEventStore
{
	private static class MovedClassObjectInputStream extends ObjectInputStream
	{

		protected ObjectStreamClass readClassDescriptor()
			throws IOException, ClassNotFoundException
		{
			ObjectStreamClass objectstreamclass1 = super.readClassDescriptor();
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method ObjectStreamClass ObjectInputStream.readClassDescriptor()>
		//    2    4:astore_2        
			if(objectstreamclass1.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1"))
		//*   3    5:aload_2         
		//*   4    6:invokevirtual   #27  <Method String ObjectStreamClass.getName()>
		//*   5    9:ldc1            #29  <String "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1">
		//*   6   11:invokevirtual   #35  <Method boolean String.equals(Object)>
		//*   7   14:ifeq            23
				return ObjectStreamClass.lookup(com/facebook/appevents/AccessTokenAppIdPair$SerializationProxyV1);
		//    8   17:ldc1            #37  <Class AccessTokenAppIdPair$SerializationProxyV1>
		//    9   19:invokestatic    #41  <Method ObjectStreamClass ObjectStreamClass.lookup(Class)>
		//   10   22:areturn         
			ObjectStreamClass objectstreamclass = objectstreamclass1;
		//   11   23:aload_2         
		//   12   24:astore_1        
			if(objectstreamclass1.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1"))
		//*  13   25:aload_2         
		//*  14   26:invokevirtual   #27  <Method String ObjectStreamClass.getName()>
		//*  15   29:ldc1            #43  <String "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1">
		//*  16   31:invokevirtual   #35  <Method boolean String.equals(Object)>
		//*  17   34:ifeq            43
				objectstreamclass = ObjectStreamClass.lookup(com/facebook/appevents/AppEvent$SerializationProxyV1);
		//   18   37:ldc1            #45  <Class AppEvent$SerializationProxyV1>
		//   19   39:invokestatic    #41  <Method ObjectStreamClass ObjectStreamClass.lookup(Class)>
		//   20   42:astore_1        
			return objectstreamclass;
		//   21   43:aload_1         
		//   22   44:areturn         
		}

		public MovedClassObjectInputStream(InputStream inputstream)
			throws IOException
		{
			super(inputstream);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #13  <Method void ObjectInputStream(InputStream)>
		//    3    5:return          
		}
	}


	AppEventStore()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static void persistEvents(AccessTokenAppIdPair accesstokenappidpair, SessionEventsState sessioneventsstate)
	{
		com/facebook/appevents/AppEventStore;
	//    0    0:ldc1            #2   <Class AppEventStore>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		PersistedEvents persistedevents;
		AppEventUtility.assertIsNotMainThread();
	//    2    3:invokestatic    #24  <Method void AppEventUtility.assertIsNotMainThread()>
		persistedevents = readAndClearStore();
	//    3    6:invokestatic    #28  <Method PersistedEvents readAndClearStore()>
	//    4    9:astore_2        
		if(persistedevents.containsKey(accesstokenappidpair))
	//*   5   10:aload_2         
	//*   6   11:aload_0         
	//*   7   12:invokevirtual   #34  <Method boolean PersistedEvents.containsKey(AccessTokenAppIdPair)>
	//*   8   15:ifeq            36
		{
			persistedevents.get(accesstokenappidpair).addAll(((java.util.Collection) (sessioneventsstate.getEventsToPersist())));
	//    9   18:aload_2         
	//   10   19:aload_0         
	//   11   20:invokevirtual   #38  <Method List PersistedEvents.get(AccessTokenAppIdPair)>
	//   12   23:aload_1         
	//   13   24:invokevirtual   #44  <Method List SessionEventsState.getEventsToPersist()>
	//   14   27:invokeinterface #50  <Method boolean List.addAll(java.util.Collection)>
	//   15   32:pop             
			break MISSING_BLOCK_LABEL_45;
	//   16   33:goto            45
		}
		persistedevents.addEvents(accesstokenappidpair, sessioneventsstate.getEventsToPersist());
	//   17   36:aload_2         
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:invokevirtual   #44  <Method List SessionEventsState.getEventsToPersist()>
	//   21   42:invokevirtual   #54  <Method void PersistedEvents.addEvents(AccessTokenAppIdPair, List)>
		saveEventsToDisk(persistedevents);
	//   22   45:aload_2         
	//   23   46:invokestatic    #58  <Method void saveEventsToDisk(PersistedEvents)>
		com/facebook/appevents/AppEventStore;
	//   24   49:ldc1            #2   <Class AppEventStore>
		JVM INSTR monitorexit ;
	//   25   51:monitorexit     
		return;
	//   26   52:return          
		accesstokenappidpair;
	//   27   53:astore_0        
	//*  28   54:ldc1            #2   <Class AppEventStore>
		throw accesstokenappidpair;
	//   29   56:monitorexit     
	//   30   57:aload_0         
	//   31   58:athrow          
	}

	public static void persistEvents(AppEventCollection appeventcollection)
	{
		com/facebook/appevents/AppEventStore;
	//    0    0:ldc1            #2   <Class AppEventStore>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		PersistedEvents persistedevents;
		AppEventUtility.assertIsNotMainThread();
	//    2    3:invokestatic    #24  <Method void AppEventUtility.assertIsNotMainThread()>
		persistedevents = readAndClearStore();
	//    3    6:invokestatic    #28  <Method PersistedEvents readAndClearStore()>
	//    4    9:astore_1        
		AccessTokenAppIdPair accesstokenappidpair;
		for(Iterator iterator = appeventcollection.keySet().iterator(); iterator.hasNext(); persistedevents.addEvents(accesstokenappidpair, appeventcollection.get(accesstokenappidpair).getEventsToPersist()))
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #65  <Method Set AppEventCollection.keySet()>
	//*   7   14:invokeinterface #71  <Method Iterator Set.iterator()>
	//*   8   19:astore_2        
	//*   9   20:aload_2         
	//*  10   21:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//*  11   26:ifeq            55
			accesstokenappidpair = (AccessTokenAppIdPair)iterator.next();
	//   12   29:aload_2         
	//   13   30:invokeinterface #81  <Method Object Iterator.next()>
	//   14   35:checkcast       #83  <Class AccessTokenAppIdPair>
	//   15   38:astore_3        

	//   16   39:aload_1         
	//   17   40:aload_3         
	//   18   41:aload_0         
	//   19   42:aload_3         
	//   20   43:invokevirtual   #86  <Method SessionEventsState AppEventCollection.get(AccessTokenAppIdPair)>
	//   21   46:invokevirtual   #44  <Method List SessionEventsState.getEventsToPersist()>
	//   22   49:invokevirtual   #54  <Method void PersistedEvents.addEvents(AccessTokenAppIdPair, List)>
	//*  23   52:goto            20
		saveEventsToDisk(persistedevents);
	//   24   55:aload_1         
	//   25   56:invokestatic    #58  <Method void saveEventsToDisk(PersistedEvents)>
		com/facebook/appevents/AppEventStore;
	//   26   59:ldc1            #2   <Class AppEventStore>
		JVM INSTR monitorexit ;
	//   27   61:monitorexit     
		return;
	//   28   62:return          
		appeventcollection;
	//   29   63:astore_0        
	//*  30   64:ldc1            #2   <Class AppEventStore>
		throw appeventcollection;
	//   31   66:monitorexit     
	//   32   67:aload_0         
	//   33   68:athrow          
	}

	public static PersistedEvents readAndClearStore()
	{
		com/facebook/appevents/AppEventStore;
	//    0    0:ldc1            #2   <Class AppEventStore>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Context context;
		AppEventUtility.assertIsNotMainThread();
	//    2    3:invokestatic    #24  <Method void AppEventUtility.assertIsNotMainThread()>
		context = FacebookSdk.getApplicationContext();
	//    3    6:invokestatic    #96  <Method Context FacebookSdk.getApplicationContext()>
	//    4    9:astore          4
		Object obj2;
		Object obj4;
		obj4 = null;
	//    5   11:aconst_null     
	//    6   12:astore_3        
		obj2 = null;
	//    7   13:aconst_null     
	//    8   14:astore_1        
		Object obj = ((Object) (new MovedClassObjectInputStream(((InputStream) (new BufferedInputStream(((InputStream) (context.openFileInput("AppEventsLogger.persistedevents")))))))));
	//    9   15:new             #6   <Class AppEventStore$MovedClassObjectInputStream>
	//   10   18:dup             
	//   11   19:new             #98  <Class BufferedInputStream>
	//   12   22:dup             
	//   13   23:aload           4
	//   14   25:ldc1            #100 <String "AppEventsLogger.persistedevents">
	//   15   27:invokevirtual   #106 <Method java.io.FileInputStream Context.openFileInput(String)>
	//   16   30:invokespecial   #109 <Method void BufferedInputStream(InputStream)>
	//   17   33:invokespecial   #110 <Method void AppEventStore$MovedClassObjectInputStream(InputStream)>
	//   18   36:astore_0        
		obj2 = obj;
	//   19   37:aload_0         
	//   20   38:astore_1        
		PersistedEvents persistedevents = (PersistedEvents)((MovedClassObjectInputStream) (obj)).readObject();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #113 <Method Object AppEventStore$MovedClassObjectInputStream.readObject()>
	//   23   43:checkcast       #30  <Class PersistedEvents>
	//   24   46:astore_2        
		Utility.closeQuietly(((java.io.Closeable) (obj)));
	//   25   47:aload_0         
	//   26   48:invokestatic    #119 <Method void Utility.closeQuietly(java.io.Closeable)>
		try
		{
			context.getFileStreamPath("AppEventsLogger.persistedevents").delete();
	//   27   51:aload           4
	//   28   53:ldc1            #100 <String "AppEventsLogger.persistedevents">
	//   29   55:invokevirtual   #123 <Method File Context.getFileStreamPath(String)>
	//   30   58:invokevirtual   #128 <Method boolean File.delete()>
	//   31   61:pop             
			break MISSING_BLOCK_LABEL_76;
	//   32   62:goto            76
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   33   65:astore_0        
		Log.w(TAG, "Got unexpected exception when removing events file: ", ((Throwable) (obj)));
	//   34   66:getstatic       #130 <Field String TAG>
	//   35   69:ldc1            #132 <String "Got unexpected exception when removing events file: ">
	//   36   71:aload_0         
	//   37   72:invokestatic    #138 <Method int Log.w(String, String, Throwable)>
	//   38   75:pop             
		obj = ((Object) (persistedevents));
	//   39   76:aload_2         
	//   40   77:astore_0        
		  goto _L1
	//*  41   78:goto            203
		Object obj3;
		obj3;
	//   42   81:astore_2        
		  goto _L2
	//*  43   82:goto            94
		obj3;
	//   44   85:astore_2        
		obj = obj2;
	//   45   86:aload_1         
	//   46   87:astore_0        
		  goto _L3
	//*  47   88:goto            144
		obj3;
	//   48   91:astore_2        
		obj = null;
	//   49   92:aconst_null     
	//   50   93:astore_0        
_L2:
		obj2 = obj;
	//   51   94:aload_0         
	//   52   95:astore_1        
		Log.w(TAG, "Got unexpected exception while reading events: ", ((Throwable) (obj3)));
	//   53   96:getstatic       #130 <Field String TAG>
	//   54   99:ldc1            #140 <String "Got unexpected exception while reading events: ">
	//   55  101:aload_2         
	//   56  102:invokestatic    #138 <Method int Log.w(String, String, Throwable)>
	//   57  105:pop             
		Utility.closeQuietly(((java.io.Closeable) (obj)));
	//   58  106:aload_0         
	//   59  107:invokestatic    #119 <Method void Utility.closeQuietly(java.io.Closeable)>
		context.getFileStreamPath("AppEventsLogger.persistedevents").delete();
	//   60  110:aload           4
	//   61  112:ldc1            #100 <String "AppEventsLogger.persistedevents">
	//   62  114:invokevirtual   #123 <Method File Context.getFileStreamPath(String)>
	//   63  117:invokevirtual   #128 <Method boolean File.delete()>
	//   64  120:pop             
		obj = ((Object) (obj4));
	//   65  121:aload_3         
	//   66  122:astore_0        
		  goto _L1
	//*  67  123:goto            203
		obj;
	//   68  126:astore_0        
		obj2 = ((Object) (TAG));
	//   69  127:getstatic       #130 <Field String TAG>
	//   70  130:astore_1        
_L4:
		Log.w(((String) (obj2)), "Got unexpected exception when removing events file: ", ((Throwable) (obj)));
	//   71  131:aload_1         
	//   72  132:ldc1            #132 <String "Got unexpected exception when removing events file: ">
	//   73  134:aload_0         
	//   74  135:invokestatic    #138 <Method int Log.w(String, String, Throwable)>
	//   75  138:pop             
		obj = ((Object) (obj4));
	//   76  139:aload_3         
	//   77  140:astore_0        
		  goto _L1
	//*  78  141:goto            203
_L3:
		Utility.closeQuietly(((java.io.Closeable) (obj)));
	//   79  144:aload_0         
	//   80  145:invokestatic    #119 <Method void Utility.closeQuietly(java.io.Closeable)>
		try
		{
			context.getFileStreamPath("AppEventsLogger.persistedevents").delete();
	//   81  148:aload           4
	//   82  150:ldc1            #100 <String "AppEventsLogger.persistedevents">
	//   83  152:invokevirtual   #123 <Method File Context.getFileStreamPath(String)>
	//   84  155:invokevirtual   #128 <Method boolean File.delete()>
	//   85  158:pop             
			break MISSING_BLOCK_LABEL_173;
	//   86  159:goto            173
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   87  162:astore_0        
		Log.w(TAG, "Got unexpected exception when removing events file: ", ((Throwable) (obj)));
	//   88  163:getstatic       #130 <Field String TAG>
	//   89  166:ldc1            #132 <String "Got unexpected exception when removing events file: ">
	//   90  168:aload_0         
	//   91  169:invokestatic    #138 <Method int Log.w(String, String, Throwable)>
	//   92  172:pop             
		throw obj3;
	//   93  173:aload_2         
	//   94  174:athrow          
_L5:
		Utility.closeQuietly(((java.io.Closeable) (obj)));
	//   95  175:aload_0         
	//   96  176:invokestatic    #119 <Method void Utility.closeQuietly(java.io.Closeable)>
		context.getFileStreamPath("AppEventsLogger.persistedevents").delete();
	//   97  179:aload           4
	//   98  181:ldc1            #100 <String "AppEventsLogger.persistedevents">
	//   99  183:invokevirtual   #123 <Method File Context.getFileStreamPath(String)>
	//  100  186:invokevirtual   #128 <Method boolean File.delete()>
	//  101  189:pop             
		obj = ((Object) (obj4));
	//  102  190:aload_3         
	//  103  191:astore_0        
		  goto _L1
	//* 104  192:goto            203
		obj;
	//  105  195:astore_0        
		obj2 = ((Object) (TAG));
	//  106  196:getstatic       #130 <Field String TAG>
	//  107  199:astore_1        
		  goto _L4
	//* 108  200:goto            131
_L1:
		obj2 = obj;
	//  109  203:aload_0         
	//  110  204:astore_1        
		if(obj != null)
			break MISSING_BLOCK_LABEL_217;
	//  111  205:aload_0         
	//  112  206:ifnonnull       217
		obj2 = ((Object) (new PersistedEvents()));
	//  113  209:new             #30  <Class PersistedEvents>
	//  114  212:dup             
	//  115  213:invokespecial   #141 <Method void PersistedEvents()>
	//  116  216:astore_1        
		com/facebook/appevents/AppEventStore;
	//  117  217:ldc1            #2   <Class AppEventStore>
		JVM INSTR monitorexit ;
	//  118  219:monitorexit     
		return ((PersistedEvents) (obj2));
	//  119  220:aload_1         
	//  120  221:areturn         
		Object obj1;
		obj1;
	//  121  222:astore_0        
	//* 122  223:ldc1            #2   <Class AppEventStore>
		throw obj1;
	//  123  225:monitorexit     
	//  124  226:aload_0         
	//  125  227:athrow          
		obj1;
	//  126  228:astore_0        
		break MISSING_BLOCK_LABEL_242;
	//  127  229:goto            242
		obj2;
	//  128  232:astore_1        
		  goto _L5
	//* 129  233:goto            175
		obj3;
	//  130  236:astore_2        
		obj1 = obj2;
	//  131  237:aload_1         
	//  132  238:astore_0        
		  goto _L3
	//* 133  239:goto            144
		obj1 = null;
	//  134  242:aconst_null     
	//  135  243:astore_0        
		  goto _L5
	//* 136  244:goto            175
	}

	private static void saveEventsToDisk(PersistedEvents persistedevents)
	{
		Object obj;
		Object obj2;
		Context context;
		context = FacebookSdk.getApplicationContext();
	//    0    0:invokestatic    #96  <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:astore          4
		obj2 = null;
	//    2    5:aconst_null     
	//    3    6:astore_3        
		obj = null;
	//    4    7:aconst_null     
	//    5    8:astore_1        
		ObjectOutputStream objectoutputstream = new ObjectOutputStream(((java.io.OutputStream) (new BufferedOutputStream(((java.io.OutputStream) (context.openFileOutput("AppEventsLogger.persistedevents", 0)))))));
	//    6    9:new             #143 <Class ObjectOutputStream>
	//    7   12:dup             
	//    8   13:new             #145 <Class BufferedOutputStream>
	//    9   16:dup             
	//   10   17:aload           4
	//   11   19:ldc1            #100 <String "AppEventsLogger.persistedevents">
	//   12   21:iconst_0        
	//   13   22:invokevirtual   #149 <Method java.io.FileOutputStream Context.openFileOutput(String, int)>
	//   14   25:invokespecial   #152 <Method void BufferedOutputStream(java.io.OutputStream)>
	//   15   28:invokespecial   #153 <Method void ObjectOutputStream(java.io.OutputStream)>
	//   16   31:astore_2        
		Object obj1;
		try
		{
			objectoutputstream.writeObject(((Object) (persistedevents)));
	//   17   32:aload_2         
	//   18   33:aload_0         
	//   19   34:invokevirtual   #157 <Method void ObjectOutputStream.writeObject(Object)>
		}
	//*  20   37:aload_2         
	//*  21   38:invokestatic    #119 <Method void Utility.closeQuietly(java.io.Closeable)>
	//*  22   41:return          
	//*  23   42:astore_0        
	//*  24   43:aload_2         
	//*  25   44:astore_1        
	//*  26   45:goto            93
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  27   48:astore_1        
		{
			persistedevents = ((PersistedEvents) (objectoutputstream));
	//   28   49:aload_2         
	//   29   50:astore_0        
			obj1 = obj;
	//   30   51:aload_1         
	//   31   52:astore_2        
			break MISSING_BLOCK_LABEL_63;
	//   32   53:goto            63
		}
		Utility.closeQuietly(((java.io.Closeable) (objectoutputstream)));
		return;
		persistedevents;
		obj = ((Object) (objectoutputstream));
		break MISSING_BLOCK_LABEL_93;
		persistedevents;
	//   33   56:astore_0        
		break MISSING_BLOCK_LABEL_93;
	//   34   57:goto            93
		obj1;
	//   35   60:astore_2        
		persistedevents = ((PersistedEvents) (obj2));
	//   36   61:aload_3         
	//   37   62:astore_0        
		obj = ((Object) (persistedevents));
	//   38   63:aload_0         
	//   39   64:astore_1        
		Log.w(TAG, "Got unexpected exception while persisting events: ", ((Throwable) (obj1)));
	//   40   65:getstatic       #130 <Field String TAG>
	//   41   68:ldc1            #159 <String "Got unexpected exception while persisting events: ">
	//   42   70:aload_2         
	//   43   71:invokestatic    #138 <Method int Log.w(String, String, Throwable)>
	//   44   74:pop             
		obj = ((Object) (persistedevents));
	//   45   75:aload_0         
	//   46   76:astore_1        
		try
		{
			context.getFileStreamPath("AppEventsLogger.persistedevents").delete();
	//   47   77:aload           4
	//   48   79:ldc1            #100 <String "AppEventsLogger.persistedevents">
	//   49   81:invokevirtual   #123 <Method File Context.getFileStreamPath(String)>
	//   50   84:invokevirtual   #128 <Method boolean File.delete()>
	//   51   87:pop             
		}
	//*  52   88:aload_0         
	//*  53   89:invokestatic    #119 <Method void Utility.closeQuietly(java.io.Closeable)>
	//*  54   92:return          
	//*  55   93:aload_1         
	//*  56   94:invokestatic    #119 <Method void Utility.closeQuietly(java.io.Closeable)>
	//*  57   97:aload_0         
	//*  58   98:athrow          
		catch(Exception exception) { }
	//   59   99:astore_1        
		Utility.closeQuietly(((java.io.Closeable) (persistedevents)));
		return;
		Utility.closeQuietly(((java.io.Closeable) (obj)));
		throw persistedevents;
	//*  60  100:goto            88
	}

	private static final String TAG = "com.facebook.appevents.AppEventStore";

	static 
	{
	//    0    0:return          
	}
}
