// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.domstorage;

import android.content.SharedPreferences;
import com.facebook.stetho.common.LogUtil;
import java.util.Map;

// Referenced classes of package com.facebook.stetho.inspector.domstorage:
//			DOMStoragePeerManager, SharedPreferencesHelper

private class DOMStoragePeerManager$DevToolsSharedPreferencesListener
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

	public DOMStoragePeerManager$DevToolsSharedPreferencesListener(SharedPreferences sharedpreferences, String s)
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
		mCopy = DOMStoragePeerManager.access$100(sharedpreferences.getAll());
	//   22   40:aload_0         
	//   23   41:aload_2         
	//   24   42:invokeinterface #46  <Method Map SharedPreferences.getAll()>
	//   25   47:invokestatic    #50  <Method Map DOMStoragePeerManager.access$100(Map)>
	//   26   50:putfield        #52  <Field Map mCopy>
	//   27   53:return          
	}
}
