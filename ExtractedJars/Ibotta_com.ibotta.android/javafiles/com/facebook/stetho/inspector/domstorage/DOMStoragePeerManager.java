// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.domstorage;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.inspector.helper.*;
import java.util.*;

// Referenced classes of package com.facebook.stetho.inspector.domstorage:
//			SharedPreferencesHelper

public class DOMStoragePeerManager extends ChromePeerManager
{
	private class DevToolsSharedPreferencesListener
		implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
	{

		public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
		{
			sharedpreferences = ((SharedPreferences) (sharedpreferences.getAll()));
		//    0    0:aload_1         
		//    1    1:invokeinterface #46  <Method Map SharedPreferences.getAll()>
		//    2    6:astore_1        
			boolean flag = mCopy.containsKey(((Object) (s)));
		//    3    7:aload_0         
		//    4    8:getfield        #52  <Field Map mCopy>
		//    5   11:aload_2         
		//    6   12:invokeinterface #61  <Method boolean Map.containsKey(Object)>
		//    7   17:istore_3        
			boolean flag1 = ((Map) (sharedpreferences)).containsKey(((Object) (s)));
		//    8   18:aload_1         
		//    9   19:aload_2         
		//   10   20:invokeinterface #61  <Method boolean Map.containsKey(Object)>
		//   11   25:istore          4
			if(flag1)
		//*  12   27:iload           4
		//*  13   29:ifeq            43
				sharedpreferences = ((SharedPreferences) (((Map) (sharedpreferences)).get(((Object) (s)))));
		//   14   32:aload_1         
		//   15   33:aload_2         
		//   16   34:invokeinterface #65  <Method Object Map.get(Object)>
		//   17   39:astore_1        
			else
		//*  18   40:goto            45
				sharedpreferences = null;
		//   19   43:aconst_null     
		//   20   44:astore_1        
			if(flag && flag1)
		//*  21   45:iload_3         
		//*  22   46:ifeq            96
		//*  23   49:iload           4
		//*  24   51:ifeq            96
			{
				signalItemUpdated(mStorageId, s, SharedPreferencesHelper.valueToString(mCopy.get(((Object) (s)))), SharedPreferencesHelper.valueToString(((Object) (sharedpreferences))));
		//   25   54:aload_0         
		//   26   55:getfield        #22  <Field DOMStoragePeerManager this$0>
		//   27   58:aload_0         
		//   28   59:getfield        #32  <Field com.facebook.stetho.inspector.protocol.module.DOMStorage$StorageId mStorageId>
		//   29   62:aload_2         
		//   30   63:aload_0         
		//   31   64:getfield        #52  <Field Map mCopy>
		//   32   67:aload_2         
		//   33   68:invokeinterface #65  <Method Object Map.get(Object)>
		//   34   73:invokestatic    #71  <Method String SharedPreferencesHelper.valueToString(Object)>
		//   35   76:aload_1         
		//   36   77:invokestatic    #71  <Method String SharedPreferencesHelper.valueToString(Object)>
		//   37   80:invokevirtual   #75  <Method void DOMStoragePeerManager.signalItemUpdated(com.facebook.stetho.inspector.protocol.module.DOMStorage$StorageId, String, String, String)>
				mCopy.put(((Object) (s)), ((Object) (sharedpreferences)));
		//   38   83:aload_0         
		//   39   84:getfield        #52  <Field Map mCopy>
		//   40   87:aload_2         
		//   41   88:aload_1         
		//   42   89:invokeinterface #79  <Method Object Map.put(Object, Object)>
		//   43   94:pop             
				return;
		//   44   95:return          
			}
			if(flag)
		//*  45   96:iload_3         
		//*  46   97:ifeq            124
			{
				signalItemRemoved(mStorageId, s);
		//   47  100:aload_0         
		//   48  101:getfield        #22  <Field DOMStoragePeerManager this$0>
		//   49  104:aload_0         
		//   50  105:getfield        #32  <Field com.facebook.stetho.inspector.protocol.module.DOMStorage$StorageId mStorageId>
		//   51  108:aload_2         
		//   52  109:invokevirtual   #83  <Method void DOMStoragePeerManager.signalItemRemoved(com.facebook.stetho.inspector.protocol.module.DOMStorage$StorageId, String)>
				mCopy.remove(((Object) (s)));
		//   53  112:aload_0         
		//   54  113:getfield        #52  <Field Map mCopy>
		//   55  116:aload_2         
		//   56  117:invokeinterface #86  <Method Object Map.remove(Object)>
		//   57  122:pop             
				return;
		//   58  123:return          
			}
			if(flag1)
		//*  59  124:iload           4
		//*  60  126:ifeq            158
			{
				signalItemAdded(mStorageId, s, SharedPreferencesHelper.valueToString(((Object) (sharedpreferences))));
		//   61  129:aload_0         
		//   62  130:getfield        #22  <Field DOMStoragePeerManager this$0>
		//   63  133:aload_0         
		//   64  134:getfield        #32  <Field com.facebook.stetho.inspector.protocol.module.DOMStorage$StorageId mStorageId>
		//   65  137:aload_2         
		//   66  138:aload_1         
		//   67  139:invokestatic    #71  <Method String SharedPreferencesHelper.valueToString(Object)>
		//   68  142:invokevirtual   #90  <Method void DOMStoragePeerManager.signalItemAdded(com.facebook.stetho.inspector.protocol.module.DOMStorage$StorageId, String, String)>
				mCopy.put(((Object) (s)), ((Object) (sharedpreferences)));
		//   69  145:aload_0         
		//   70  146:getfield        #52  <Field Map mCopy>
		//   71  149:aload_2         
		//   72  150:aload_1         
		//   73  151:invokeinterface #79  <Method Object Map.put(Object, Object)>
		//   74  156:pop             
				return;
		//   75  157:return          
			} else
			{
				LogUtil.i("Detected rapid put/remove of %s", new Object[] {
					s
				});
		//   76  158:ldc1            #92  <String "Detected rapid put/remove of %s">
		//   77  160:iconst_1        
		//   78  161:anewarray       Object[]
		//   79  164:dup             
		//   80  165:iconst_0        
		//   81  166:aload_2         
		//   82  167:aastore         
		//   83  168:invokestatic    #98  <Method void LogUtil.i(String, Object[])>
				return;
		//   84  171:return          
			}
		}

		public void unregister()
		{
			mPrefs.unregisterOnSharedPreferenceChangeListener(((android.content.SharedPreferences.OnSharedPreferenceChangeListener) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field SharedPreferences mPrefs>
		//    2    4:aload_0         
		//    3    5:invokeinterface #103 <Method void SharedPreferences.unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences$OnSharedPreferenceChangeListener)>
		//    4   10:return          
		}

		private final Map mCopy;
		private final SharedPreferences mPrefs;
		private final com.facebook.stetho.inspector.protocol.module.DOMStorage.StorageId mStorageId = new com.facebook.stetho.inspector.protocol.module.DOMStorage.StorageId();
		final DOMStoragePeerManager this$0;

		public DevToolsSharedPreferencesListener(SharedPreferences sharedpreferences, String s)
		{
			this$0 = DOMStoragePeerManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field DOMStoragePeerManager this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #25  <Method void Object()>
			mPrefs = sharedpreferences;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #27  <Field SharedPreferences mPrefs>
		//    8   14:aload_0         
		//    9   15:new             #29  <Class com.facebook.stetho.inspector.protocol.module.DOMStorage$StorageId>
		//   10   18:dup             
		//   11   19:invokespecial   #30  <Method void com.facebook.stetho.inspector.protocol.module.DOMStorage$StorageId()>
		//   12   22:putfield        #32  <Field com.facebook.stetho.inspector.protocol.module.DOMStorage$StorageId mStorageId>
			domstoragepeermanager = ((DOMStoragePeerManager) (mStorageId));
		//   13   25:aload_0         
		//   14   26:getfield        #32  <Field com.facebook.stetho.inspector.protocol.module.DOMStorage$StorageId mStorageId>
		//   15   29:astore_1        
			securityOrigin = s;
		//   16   30:aload_1         
		//   17   31:aload_3         
		//   18   32:putfield        #36  <Field String com.facebook.stetho.inspector.protocol.module.DOMStorage$StorageId.securityOrigin>
			isLocalStorage = true;
		//   19   35:aload_1         
		//   20   36:iconst_1        
		//   21   37:putfield        #40  <Field boolean com.facebook.stetho.inspector.protocol.module.DOMStorage$StorageId.isLocalStorage>
			mCopy = DOMStoragePeerManager.prefsCopy(sharedpreferences.getAll());
		//   22   40:aload_0         
		//   23   41:aload_2         
		//   24   42:invokeinterface #46  <Method Map SharedPreferences.getAll()>
		//   25   47:invokestatic    #50  <Method Map DOMStoragePeerManager.access$100(Map)>
		//   26   50:putfield        #52  <Field Map mCopy>
		//   27   53:return          
		}
	}


	public DOMStoragePeerManager(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void ChromePeerManager()>
	//    2    4:aload_0         
	//    3    5:new             #6   <Class DOMStoragePeerManager$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #21  <Method void DOMStoragePeerManager$1(DOMStoragePeerManager)>
	//    7   13:putfield        #23  <Field PeerRegistrationListener mPeerListener>
		mContext = context;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #25  <Field Context mContext>
		setListener(mPeerListener);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #23  <Field PeerRegistrationListener mPeerListener>
	//   14   26:invokevirtual   #29  <Method void setListener(PeerRegistrationListener)>
	//   15   29:return          
	}

	private static Map prefsCopy(Map map)
	{
		HashMap hashmap = new HashMap(map.size());
	//    0    0:new             #39  <Class HashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #45  <Method int Map.size()>
	//    4   10:invokespecial   #48  <Method void HashMap(int)>
	//    5   13:astore_1        
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext();)
	//*   6   14:aload_0         
	//*   7   15:invokeinterface #52  <Method Set Map.entrySet()>
	//*   8   20:invokeinterface #58  <Method Iterator Set.iterator()>
	//*   9   25:astore_0        
	//*  10   26:aload_0         
	//*  11   27:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//*  12   32:ifeq            95
		{
			Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (map)).next()));
	//   13   35:aload_0         
	//   14   36:invokeinterface #68  <Method Object Iterator.next()>
	//   15   41:checkcast       #70  <Class java.util.Map$Entry>
	//   16   44:astore_3        
			String s = (String)((java.util.Map.Entry) (obj)).getKey();
	//   17   45:aload_3         
	//   18   46:invokeinterface #73  <Method Object java.util.Map$Entry.getKey()>
	//   19   51:checkcast       #75  <Class String>
	//   20   54:astore_2        
			obj = ((java.util.Map.Entry) (obj)).getValue();
	//   21   55:aload_3         
	//   22   56:invokeinterface #78  <Method Object java.util.Map$Entry.getValue()>
	//   23   61:astore_3        
			if(obj instanceof Set)
	//*  24   62:aload_3         
	//*  25   63:instanceof      #54  <Class Set>
	//*  26   66:ifeq            85
				hashmap.put(((Object) (s)), ((Object) (shallowCopy((Set)obj))));
	//   27   69:aload_1         
	//   28   70:aload_2         
	//   29   71:aload_3         
	//   30   72:checkcast       #54  <Class Set>
	//   31   75:invokestatic    #82  <Method Set shallowCopy(Set)>
	//   32   78:invokevirtual   #86  <Method Object HashMap.put(Object, Object)>
	//   33   81:pop             
			else
	//*  34   82:goto            26
				hashmap.put(((Object) (s)), obj);
	//   35   85:aload_1         
	//   36   86:aload_2         
	//   37   87:aload_3         
	//   38   88:invokevirtual   #86  <Method Object HashMap.put(Object, Object)>
	//   39   91:pop             
		}

	//*  40   92:goto            26
		return ((Map) (hashmap));
	//   41   95:aload_1         
	//   42   96:areturn         
	}

	private static Set shallowCopy(Set set)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #90  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void HashSet()>
	//    3    7:astore_1        
		for(set = ((Set) (set.iterator())); ((Iterator) (set)).hasNext(); hashset.add(((Iterator) (set)).next()));
	//    4    8:aload_0         
	//    5    9:invokeinterface #58  <Method Iterator Set.iterator()>
	//    6   14:astore_0        
	//    7   15:aload_0         
	//    8   16:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            38
	//   10   24:aload_1         
	//   11   25:aload_0         
	//   12   26:invokeinterface #68  <Method Object Iterator.next()>
	//   13   31:invokevirtual   #95  <Method boolean HashSet.add(Object)>
	//   14   34:pop             
	//*  15   35:goto            15
		return ((Set) (hashset));
	//   16   38:aload_1         
	//   17   39:areturn         
	}

	public void signalItemAdded(com.facebook.stetho.inspector.protocol.module.DOMStorage.StorageId storageid, String s, String s1)
	{
		com.facebook.stetho.inspector.protocol.module.DOMStorage.DomStorageItemAddedParams domstorageitemaddedparams = new com.facebook.stetho.inspector.protocol.module.DOMStorage.DomStorageItemAddedParams();
	//    0    0:new             #100 <Class com.facebook.stetho.inspector.protocol.module.DOMStorage$DomStorageItemAddedParams>
	//    1    3:dup             
	//    2    4:invokespecial   #101 <Method void com.facebook.stetho.inspector.protocol.module.DOMStorage$DomStorageItemAddedParams()>
	//    3    7:astore          4
		domstorageitemaddedparams.storageId = storageid;
	//    4    9:aload           4
	//    5   11:aload_1         
	//    6   12:putfield        #105 <Field com.facebook.stetho.inspector.protocol.module.DOMStorage$StorageId com.facebook.stetho.inspector.protocol.module.DOMStorage$DomStorageItemAddedParams.storageId>
		domstorageitemaddedparams.key = s;
	//    7   15:aload           4
	//    8   17:aload_2         
	//    9   18:putfield        #109 <Field String com.facebook.stetho.inspector.protocol.module.DOMStorage$DomStorageItemAddedParams.key>
		domstorageitemaddedparams.newValue = s1;
	//   10   21:aload           4
	//   11   23:aload_3         
	//   12   24:putfield        #112 <Field String com.facebook.stetho.inspector.protocol.module.DOMStorage$DomStorageItemAddedParams.newValue>
		sendNotificationToPeers("DOMStorage.domStorageItemAdded", ((Object) (domstorageitemaddedparams)));
	//   13   27:aload_0         
	//   14   28:ldc1            #114 <String "DOMStorage.domStorageItemAdded">
	//   15   30:aload           4
	//   16   32:invokevirtual   #118 <Method void sendNotificationToPeers(String, Object)>
	//   17   35:return          
	}

	public void signalItemRemoved(com.facebook.stetho.inspector.protocol.module.DOMStorage.StorageId storageid, String s)
	{
		com.facebook.stetho.inspector.protocol.module.DOMStorage.DomStorageItemRemovedParams domstorageitemremovedparams = new com.facebook.stetho.inspector.protocol.module.DOMStorage.DomStorageItemRemovedParams();
	//    0    0:new             #122 <Class com.facebook.stetho.inspector.protocol.module.DOMStorage$DomStorageItemRemovedParams>
	//    1    3:dup             
	//    2    4:invokespecial   #123 <Method void com.facebook.stetho.inspector.protocol.module.DOMStorage$DomStorageItemRemovedParams()>
	//    3    7:astore_3        
		domstorageitemremovedparams.storageId = storageid;
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:putfield        #124 <Field com.facebook.stetho.inspector.protocol.module.DOMStorage$StorageId com.facebook.stetho.inspector.protocol.module.DOMStorage$DomStorageItemRemovedParams.storageId>
		domstorageitemremovedparams.key = s;
	//    7   13:aload_3         
	//    8   14:aload_2         
	//    9   15:putfield        #125 <Field String com.facebook.stetho.inspector.protocol.module.DOMStorage$DomStorageItemRemovedParams.key>
		sendNotificationToPeers("DOMStorage.domStorageItemRemoved", ((Object) (domstorageitemremovedparams)));
	//   10   18:aload_0         
	//   11   19:ldc1            #127 <String "DOMStorage.domStorageItemRemoved">
	//   12   21:aload_3         
	//   13   22:invokevirtual   #118 <Method void sendNotificationToPeers(String, Object)>
	//   14   25:return          
	}

	public void signalItemUpdated(com.facebook.stetho.inspector.protocol.module.DOMStorage.StorageId storageid, String s, String s1, String s2)
	{
		com.facebook.stetho.inspector.protocol.module.DOMStorage.DomStorageItemUpdatedParams domstorageitemupdatedparams = new com.facebook.stetho.inspector.protocol.module.DOMStorage.DomStorageItemUpdatedParams();
	//    0    0:new             #131 <Class com.facebook.stetho.inspector.protocol.module.DOMStorage$DomStorageItemUpdatedParams>
	//    1    3:dup             
	//    2    4:invokespecial   #132 <Method void com.facebook.stetho.inspector.protocol.module.DOMStorage$DomStorageItemUpdatedParams()>
	//    3    7:astore          5
		domstorageitemupdatedparams.storageId = storageid;
	//    4    9:aload           5
	//    5   11:aload_1         
	//    6   12:putfield        #133 <Field com.facebook.stetho.inspector.protocol.module.DOMStorage$StorageId com.facebook.stetho.inspector.protocol.module.DOMStorage$DomStorageItemUpdatedParams.storageId>
		domstorageitemupdatedparams.key = s;
	//    7   15:aload           5
	//    8   17:aload_2         
	//    9   18:putfield        #134 <Field String com.facebook.stetho.inspector.protocol.module.DOMStorage$DomStorageItemUpdatedParams.key>
		domstorageitemupdatedparams.oldValue = s1;
	//   10   21:aload           5
	//   11   23:aload_3         
	//   12   24:putfield        #137 <Field String com.facebook.stetho.inspector.protocol.module.DOMStorage$DomStorageItemUpdatedParams.oldValue>
		domstorageitemupdatedparams.newValue = s2;
	//   13   27:aload           5
	//   14   29:aload           4
	//   15   31:putfield        #138 <Field String com.facebook.stetho.inspector.protocol.module.DOMStorage$DomStorageItemUpdatedParams.newValue>
		sendNotificationToPeers("DOMStorage.domStorageItemUpdated", ((Object) (domstorageitemupdatedparams)));
	//   16   34:aload_0         
	//   17   35:ldc1            #140 <String "DOMStorage.domStorageItemUpdated">
	//   18   37:aload           5
	//   19   39:invokevirtual   #118 <Method void sendNotificationToPeers(String, Object)>
	//   20   42:return          
	}

	private final Context mContext;
	private final PeerRegistrationListener mPeerListener = new PeersRegisteredListener() {

		protected void onFirstPeerRegistered()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			Object obj;
			for(Iterator iterator = SharedPreferencesHelper.getSharedPreferenceTags(mContext).iterator(); iterator.hasNext(); mPrefsListeners.add(obj))
		//*   2    2:aload_0         
		//*   3    3:getfield        #15  <Field DOMStoragePeerManager this$0>
		//*   4    6:invokestatic    #29  <Method Context DOMStoragePeerManager.access$000(DOMStoragePeerManager)>
		//*   5    9:invokestatic    #35  <Method List SharedPreferencesHelper.getSharedPreferenceTags(Context)>
		//*   6   12:invokeinterface #41  <Method Iterator List.iterator()>
		//*   7   17:astore_1        
		//*   8   18:aload_1         
		//*   9   19:invokeinterface #47  <Method boolean Iterator.hasNext()>
		//*  10   24:ifeq            85
			{
				obj = ((Object) ((String)iterator.next()));
		//   11   27:aload_1         
		//   12   28:invokeinterface #51  <Method Object Iterator.next()>
		//   13   33:checkcast       #53  <Class String>
		//   14   36:astore_3        
				SharedPreferences sharedpreferences = mContext.getSharedPreferences(((String) (obj)), 0);
		//   15   37:aload_0         
		//   16   38:getfield        #15  <Field DOMStoragePeerManager this$0>
		//   17   41:invokestatic    #29  <Method Context DOMStoragePeerManager.access$000(DOMStoragePeerManager)>
		//   18   44:aload_3         
		//   19   45:iconst_0        
		//   20   46:invokevirtual   #59  <Method SharedPreferences Context.getSharedPreferences(String, int)>
		//   21   49:astore_2        
				obj = ((Object) (new DevToolsSharedPreferencesListener(sharedpreferences, ((String) (obj)))));
		//   22   50:new             #61  <Class DOMStoragePeerManager$DevToolsSharedPreferencesListener>
		//   23   53:dup             
		//   24   54:aload_0         
		//   25   55:getfield        #15  <Field DOMStoragePeerManager this$0>
		//   26   58:aload_2         
		//   27   59:aload_3         
		//   28   60:invokespecial   #64  <Method void DOMStoragePeerManager$DevToolsSharedPreferencesListener(DOMStoragePeerManager, SharedPreferences, String)>
		//   29   63:astore_3        
				sharedpreferences.registerOnSharedPreferenceChangeListener(((android.content.SharedPreferences.OnSharedPreferenceChangeListener) (obj)));
		//   30   64:aload_2         
		//   31   65:aload_3         
		//   32   66:invokeinterface #70  <Method void SharedPreferences.registerOnSharedPreferenceChangeListener(android.content.SharedPreferences$OnSharedPreferenceChangeListener)>
			}

		//   33   71:aload_0         
		//   34   72:getfield        #23  <Field List mPrefsListeners>
		//   35   75:aload_3         
		//   36   76:invokeinterface #74  <Method boolean List.add(Object)>
		//   37   81:pop             
		//*  38   82:goto            18
			this;
		//   39   85:aload_0         
			JVM INSTR monitorexit ;
		//   40   86:monitorexit     
			return;
		//   41   87:return          
			Exception exception;
			exception;
		//   42   88:astore_1        
		//*  43   89:aload_0         
			throw exception;
		//   44   90:monitorexit     
		//   45   91:aload_1         
		//   46   92:athrow          
		}

		protected void onLastPeerUnregistered()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			for(Iterator iterator = mPrefsListeners.iterator(); iterator.hasNext(); ((DevToolsSharedPreferencesListener)iterator.next()).unregister());
		//    2    2:aload_0         
		//    3    3:getfield        #23  <Field List mPrefsListeners>
		//    4    6:invokeinterface #41  <Method Iterator List.iterator()>
		//    5   11:astore_1        
		//    6   12:aload_1         
		//    7   13:invokeinterface #47  <Method boolean Iterator.hasNext()>
		//    8   18:ifeq            36
		//    9   21:aload_1         
		//   10   22:invokeinterface #51  <Method Object Iterator.next()>
		//   11   27:checkcast       #61  <Class DOMStoragePeerManager$DevToolsSharedPreferencesListener>
		//   12   30:invokevirtual   #78  <Method void DOMStoragePeerManager$DevToolsSharedPreferencesListener.unregister()>
		//*  13   33:goto            12
			mPrefsListeners.clear();
		//   14   36:aload_0         
		//   15   37:getfield        #23  <Field List mPrefsListeners>
		//   16   40:invokeinterface #81  <Method void List.clear()>
			this;
		//   17   45:aload_0         
			JVM INSTR monitorexit ;
		//   18   46:monitorexit     
			return;
		//   19   47:return          
			Exception exception;
			exception;
		//   20   48:astore_1        
		//*  21   49:aload_0         
			throw exception;
		//   22   50:monitorexit     
		//   23   51:aload_1         
		//   24   52:athrow          
		}

		private final List mPrefsListeners = new ArrayList();
		final DOMStoragePeerManager this$0;

			
			{
				this$0 = DOMStoragePeerManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field DOMStoragePeerManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void PeersRegisteredListener()>
			//    5    9:aload_0         
			//    6   10:new             #20  <Class ArrayList>
			//    7   13:dup             
			//    8   14:invokespecial   #21  <Method void ArrayList()>
			//    9   17:putfield        #23  <Field List mPrefsListeners>
			//   10   20:return          
			}
	}
;


/*
	static Context access$000(DOMStoragePeerManager domstoragepeermanager)
	{
		return domstoragepeermanager.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Context mContext>
	//    2    4:areturn         
	}

*/


/*
	static Map access$100(Map map)
	{
		return prefsCopy(map);
	//    0    0:aload_0         
	//    1    1:invokestatic    #37  <Method Map prefsCopy(Map)>
	//    2    4:areturn         
	}

*/
}
