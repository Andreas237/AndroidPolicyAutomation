// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.stetho.inspector.console.CLog;
import com.facebook.stetho.inspector.domstorage.DOMStoragePeerManager;
import com.facebook.stetho.inspector.domstorage.SharedPreferencesHelper;
import com.facebook.stetho.inspector.jsonrpc.*;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.json.ObjectMapper;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

public class DOMStorage
	implements ChromeDevtoolsDomain
{
	private static class DOMStorageAssignmentException extends Exception
	{

		public DOMStorageAssignmentException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void Exception(String)>
		//    3    5:return          
		}
	}

	public static class DomStorageItemAddedParams
	{

		public String key;
		public String newValue;
		public StorageId storageId;

		public DomStorageItemAddedParams()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class DomStorageItemRemovedParams
	{

		public String key;
		public StorageId storageId;

		public DomStorageItemRemovedParams()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class DomStorageItemUpdatedParams
	{

		public String key;
		public String newValue;
		public String oldValue;
		public StorageId storageId;

		public DomStorageItemUpdatedParams()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class DomStorageItemsClearedParams
	{

		public StorageId storageId;

		public DomStorageItemsClearedParams()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class GetDOMStorageItemsResult
		implements JsonRpcResult
	{

		public List entries;

		private GetDOMStorageItemsResult()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}

	}

	public static class StorageId
	{

		public boolean isLocalStorage;
		public String securityOrigin;

		public StorageId()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}
	}


	public DOMStorage(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #42  <Class ObjectMapper>
	//    4    8:dup             
	//    5    9:invokespecial   #43  <Method void ObjectMapper()>
	//    6   12:putfield        #45  <Field ObjectMapper mObjectMapper>
		mContext = context;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #47  <Field Context mContext>
		mDOMStoragePeerManager = new DOMStoragePeerManager(context);
	//   10   20:aload_0         
	//   11   21:new             #49  <Class DOMStoragePeerManager>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #51  <Method void DOMStoragePeerManager(Context)>
	//   15   29:putfield        #53  <Field DOMStoragePeerManager mDOMStoragePeerManager>
	//   16   32:return          
	}

	private static void assignByType(android.content.SharedPreferences.Editor editor, String s, Object obj)
		throws IllegalArgumentException
	{
		if(obj instanceof Integer)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #60  <Class Integer>
	//*   2    4:ifeq            23
		{
			editor.putInt(s, ((Integer)obj).intValue());
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:checkcast       #60  <Class Integer>
	//    7   13:invokevirtual   #64  <Method int Integer.intValue()>
	//    8   16:invokeinterface #70  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//    9   21:pop             
			return;
	//   10   22:return          
		}
		if(obj instanceof Long)
	//*  11   23:aload_2         
	//*  12   24:instanceof      #72  <Class Long>
	//*  13   27:ifeq            46
		{
			editor.putLong(s, ((Long)obj).longValue());
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:checkcast       #72  <Class Long>
	//   18   36:invokevirtual   #76  <Method long Long.longValue()>
	//   19   39:invokeinterface #80  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   20   44:pop             
			return;
	//   21   45:return          
		}
		if(obj instanceof Float)
	//*  22   46:aload_2         
	//*  23   47:instanceof      #82  <Class Float>
	//*  24   50:ifeq            69
		{
			editor.putFloat(s, ((Float)obj).floatValue());
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:aload_2         
	//   28   56:checkcast       #82  <Class Float>
	//   29   59:invokevirtual   #86  <Method float Float.floatValue()>
	//   30   62:invokeinterface #90  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putFloat(String, float)>
	//   31   67:pop             
			return;
	//   32   68:return          
		}
		if(obj instanceof Boolean)
	//*  33   69:aload_2         
	//*  34   70:instanceof      #92  <Class Boolean>
	//*  35   73:ifeq            92
		{
			editor.putBoolean(s, ((Boolean)obj).booleanValue());
	//   36   76:aload_0         
	//   37   77:aload_1         
	//   38   78:aload_2         
	//   39   79:checkcast       #92  <Class Boolean>
	//   40   82:invokevirtual   #96  <Method boolean Boolean.booleanValue()>
	//   41   85:invokeinterface #100 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   42   90:pop             
			return;
	//   43   91:return          
		}
		if(obj instanceof String)
	//*  44   92:aload_2         
	//*  45   93:instanceof      #102 <Class String>
	//*  46   96:ifeq            112
		{
			editor.putString(s, (String)obj);
	//   47   99:aload_0         
	//   48  100:aload_1         
	//   49  101:aload_2         
	//   50  102:checkcast       #102 <Class String>
	//   51  105:invokeinterface #106 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   52  110:pop             
			return;
	//   53  111:return          
		}
		if(obj instanceof Set)
	//*  54  112:aload_2         
	//*  55  113:instanceof      #108 <Class Set>
	//*  56  116:ifeq            129
		{
			putStringSet(editor, s, (Set)obj);
	//   57  119:aload_0         
	//   58  120:aload_1         
	//   59  121:aload_2         
	//   60  122:checkcast       #108 <Class Set>
	//   61  125:invokestatic    #112 <Method void putStringSet(android.content.SharedPreferences$Editor, String, Set)>
			return;
	//   62  128:return          
		} else
		{
			editor = ((android.content.SharedPreferences.Editor) (new StringBuilder()));
	//   63  129:new             #114 <Class StringBuilder>
	//   64  132:dup             
	//   65  133:invokespecial   #115 <Method void StringBuilder()>
	//   66  136:astore_0        
			((StringBuilder) (editor)).append("Unsupported type=");
	//   67  137:aload_0         
	//   68  138:ldc1            #117 <String "Unsupported type=">
	//   69  140:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   70  143:pop             
			((StringBuilder) (editor)).append(obj.getClass().getName());
	//   71  144:aload_0         
	//   72  145:aload_2         
	//   73  146:invokevirtual   #125 <Method Class Object.getClass()>
	//   74  149:invokevirtual   #131 <Method String Class.getName()>
	//   75  152:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   76  155:pop             
			throw new IllegalArgumentException(((StringBuilder) (editor)).toString());
	//   77  156:new             #58  <Class IllegalArgumentException>
	//   78  159:dup             
	//   79  160:aload_0         
	//   80  161:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   81  164:invokespecial   #137 <Method void IllegalArgumentException(String)>
	//   82  167:athrow          
		}
	}

	private static void putStringSet(android.content.SharedPreferences.Editor editor, String s, Set set)
	{
		editor.putStringSet(s, set);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokeinterface #144 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putStringSet(String, Set)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void disable(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		mDOMStoragePeerManager.removePeer(jsonrpcpeer);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field DOMStoragePeerManager mDOMStoragePeerManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #154 <Method void DOMStoragePeerManager.removePeer(JsonRpcPeer)>
	//    4    8:return          
	}

	public void enable(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		mDOMStoragePeerManager.addPeer(jsonrpcpeer);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field DOMStoragePeerManager mDOMStoragePeerManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #160 <Method boolean DOMStoragePeerManager.addPeer(JsonRpcPeer)>
	//    4    8:pop             
	//    5    9:return          
	}

	public JsonRpcResult getDOMStorageItems(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
		throws JSONException
	{
		jsonobject = ((JSONObject) ((StorageId)mObjectMapper.convertValue(((Object) (jsonobject.getJSONObject("storageId"))), com/facebook/stetho/inspector/protocol/module/DOMStorage$StorageId)));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #166 <String "storageId">
	//    4    7:invokevirtual   #172 <Method JSONObject JSONObject.getJSONObject(String)>
	//    5   10:ldc1            #28  <Class DOMStorage$StorageId>
	//    6   12:invokevirtual   #176 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    7   15:checkcast       #28  <Class DOMStorage$StorageId>
	//    8   18:astore_2        
		jsonrpcpeer = ((JsonRpcPeer) (new ArrayList()));
	//    9   19:new             #178 <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #179 <Method void ArrayList()>
	//   12   26:astore_1        
		String s = ((StorageId) (jsonobject)).securityOrigin;
	//   13   27:aload_2         
	//   14   28:getfield        #183 <Field String DOMStorage$StorageId.securityOrigin>
	//   15   31:astore_3        
		if(((StorageId) (jsonobject)).isLocalStorage)
	//*  16   32:aload_2         
	//*  17   33:getfield        #187 <Field boolean DOMStorage$StorageId.isLocalStorage>
	//*  18   36:ifeq            130
		{
			ArrayList arraylist;
			for(jsonobject = ((JSONObject) (mContext.getSharedPreferences(s, 0).getAll().entrySet().iterator())); ((Iterator) (jsonobject)).hasNext(); ((ArrayList) (jsonrpcpeer)).add(((Object) (arraylist))))
	//*  19   39:aload_0         
	//*  20   40:getfield        #47  <Field Context mContext>
	//*  21   43:aload_3         
	//*  22   44:iconst_0        
	//*  23   45:invokevirtual   #193 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//*  24   48:invokeinterface #199 <Method Map SharedPreferences.getAll()>
	//*  25   53:invokeinterface #205 <Method Set Map.entrySet()>
	//*  26   58:invokeinterface #209 <Method Iterator Set.iterator()>
	//*  27   63:astore_2        
	//*  28   64:aload_2         
	//*  29   65:invokeinterface #214 <Method boolean Iterator.hasNext()>
	//*  30   70:ifeq            130
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (jsonobject)).next();
	//   31   73:aload_2         
	//   32   74:invokeinterface #218 <Method Object Iterator.next()>
	//   33   79:checkcast       #220 <Class java.util.Map$Entry>
	//   34   82:astore_3        
				arraylist = new ArrayList(2);
	//   35   83:new             #178 <Class ArrayList>
	//   36   86:dup             
	//   37   87:iconst_2        
	//   38   88:invokespecial   #223 <Method void ArrayList(int)>
	//   39   91:astore          4
				arraylist.add(entry.getKey());
	//   40   93:aload           4
	//   41   95:aload_3         
	//   42   96:invokeinterface #226 <Method Object java.util.Map$Entry.getKey()>
	//   43  101:invokevirtual   #230 <Method boolean ArrayList.add(Object)>
	//   44  104:pop             
				arraylist.add(((Object) (SharedPreferencesHelper.valueToString(entry.getValue()))));
	//   45  105:aload           4
	//   46  107:aload_3         
	//   47  108:invokeinterface #233 <Method Object java.util.Map$Entry.getValue()>
	//   48  113:invokestatic    #239 <Method String SharedPreferencesHelper.valueToString(Object)>
	//   49  116:invokevirtual   #230 <Method boolean ArrayList.add(Object)>
	//   50  119:pop             
			}

	//   51  120:aload_1         
	//   52  121:aload           4
	//   53  123:invokevirtual   #230 <Method boolean ArrayList.add(Object)>
	//   54  126:pop             
		}
	//*  55  127:goto            64
		jsonobject = ((JSONObject) (new GetDOMStorageItemsResult()));
	//   56  130:new             #25  <Class DOMStorage$GetDOMStorageItemsResult>
	//   57  133:dup             
	//   58  134:aconst_null     
	//   59  135:invokespecial   #242 <Method void DOMStorage$GetDOMStorageItemsResult(DOMStorage$1)>
	//   60  138:astore_2        
		jsonobject.entries = ((List) (jsonrpcpeer));
	//   61  139:aload_2         
	//   62  140:aload_1         
	//   63  141:putfield        #246 <Field List DOMStorage$GetDOMStorageItemsResult.entries>
		return ((JsonRpcResult) (jsonobject));
	//   64  144:aload_2         
	//   65  145:areturn         
	}

	public void removeDOMStorageItem(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
		throws JSONException
	{
		jsonrpcpeer = ((JsonRpcPeer) ((StorageId)mObjectMapper.convertValue(((Object) (jsonobject.getJSONObject("storageId"))), com/facebook/stetho/inspector/protocol/module/DOMStorage$StorageId)));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #166 <String "storageId">
	//    4    7:invokevirtual   #172 <Method JSONObject JSONObject.getJSONObject(String)>
	//    5   10:ldc1            #28  <Class DOMStorage$StorageId>
	//    6   12:invokevirtual   #176 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    7   15:checkcast       #28  <Class DOMStorage$StorageId>
	//    8   18:astore_1        
		jsonobject = ((JSONObject) (jsonobject.getString("key")));
	//    9   19:aload_2         
	//   10   20:ldc1            #249 <String "key">
	//   11   22:invokevirtual   #253 <Method String JSONObject.getString(String)>
	//   12   25:astore_2        
		if(((StorageId) (jsonrpcpeer)).isLocalStorage)
	//*  13   26:aload_1         
	//*  14   27:getfield        #187 <Field boolean DOMStorage$StorageId.isLocalStorage>
	//*  15   30:ifeq            61
			mContext.getSharedPreferences(((StorageId) (jsonrpcpeer)).securityOrigin, 0).edit().remove(((String) (jsonobject))).apply();
	//   16   33:aload_0         
	//   17   34:getfield        #47  <Field Context mContext>
	//   18   37:aload_1         
	//   19   38:getfield        #183 <Field String DOMStorage$StorageId.securityOrigin>
	//   20   41:iconst_0        
	//   21   42:invokevirtual   #193 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   22   45:invokeinterface #257 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   23   50:aload_2         
	//   24   51:invokeinterface #261 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   25   56:invokeinterface #264 <Method void android.content.SharedPreferences$Editor.apply()>
	//   26   61:return          
	}

	public void setDOMStorageItem(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
		throws JSONException, JsonRpcException
	{
		String s;
		SharedPreferences sharedpreferences;
		Object obj;
		jsonrpcpeer = ((JsonRpcPeer) ((StorageId)mObjectMapper.convertValue(((Object) (jsonobject.getJSONObject("storageId"))), com/facebook/stetho/inspector/protocol/module/DOMStorage$StorageId)));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #166 <String "storageId">
	//    4    7:invokevirtual   #172 <Method JSONObject JSONObject.getJSONObject(String)>
	//    5   10:ldc1            #28  <Class DOMStorage$StorageId>
	//    6   12:invokevirtual   #176 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    7   15:checkcast       #28  <Class DOMStorage$StorageId>
	//    8   18:astore_1        
		s = jsonobject.getString("key");
	//    9   19:aload_2         
	//   10   20:ldc1            #249 <String "key">
	//   11   22:invokevirtual   #253 <Method String JSONObject.getString(String)>
	//   12   25:astore_3        
		jsonobject = ((JSONObject) (jsonobject.getString("value")));
	//   13   26:aload_2         
	//   14   27:ldc2            #268 <String "value">
	//   15   30:invokevirtual   #253 <Method String JSONObject.getString(String)>
	//   16   33:astore_2        
		if(!((StorageId) (jsonrpcpeer)).isLocalStorage)
			break MISSING_BLOCK_LABEL_245;
	//   17   34:aload_1         
	//   18   35:getfield        #187 <Field boolean DOMStorage$StorageId.isLocalStorage>
	//   19   38:ifeq            245
		sharedpreferences = mContext.getSharedPreferences(((StorageId) (jsonrpcpeer)).securityOrigin, 0);
	//   20   41:aload_0         
	//   21   42:getfield        #47  <Field Context mContext>
	//   22   45:aload_1         
	//   23   46:getfield        #183 <Field String DOMStorage$StorageId.securityOrigin>
	//   24   49:iconst_0        
	//   25   50:invokevirtual   #193 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   26   53:astore          4
		obj = sharedpreferences.getAll().get(((Object) (s)));
	//   27   55:aload           4
	//   28   57:invokeinterface #199 <Method Map SharedPreferences.getAll()>
	//   29   62:aload_3         
	//   30   63:invokeinterface #272 <Method Object Map.get(Object)>
	//   31   68:astore          5
		if(obj != null)
			break MISSING_BLOCK_LABEL_122;
	//   32   70:aload           5
	//   33   72:ifnonnull       122
		StringBuilder stringbuilder = new StringBuilder();
	//   34   75:new             #114 <Class StringBuilder>
	//   35   78:dup             
	//   36   79:invokespecial   #115 <Method void StringBuilder()>
	//   37   82:astore          6
		stringbuilder.append("Unsupported: cannot add new key ");
	//   38   84:aload           6
	//   39   86:ldc2            #274 <String "Unsupported: cannot add new key ">
	//   40   89:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   41   92:pop             
		stringbuilder.append(s);
	//   42   93:aload           6
	//   43   95:aload_3         
	//   44   96:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   45   99:pop             
		stringbuilder.append(" due to lack of type inference");
	//   46  100:aload           6
	//   47  102:ldc2            #276 <String " due to lack of type inference">
	//   48  105:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   49  108:pop             
		throw new DOMStorageAssignmentException(stringbuilder.toString());
	//   50  109:new             #10  <Class DOMStorage$DOMStorageAssignmentException>
	//   51  112:dup             
	//   52  113:aload           6
	//   53  115:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   54  118:invokespecial   #277 <Method void DOMStorage$DOMStorageAssignmentException(String)>
	//   55  121:athrow          
		android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
	//   56  122:aload           4
	//   57  124:invokeinterface #257 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   58  129:astore          6
		Object obj1;
		try
		{
			assignByType(editor, s, SharedPreferencesHelper.valueFromString(((String) (jsonobject)), obj));
	//   59  131:aload           6
	//   60  133:aload_3         
	//   61  134:aload_2         
	//   62  135:aload           5
	//   63  137:invokestatic    #281 <Method Object SharedPreferencesHelper.valueFromString(String, Object)>
	//   64  140:invokestatic    #283 <Method void assignByType(android.content.SharedPreferences$Editor, String, Object)>
			editor.apply();
	//   65  143:aload           6
	//   66  145:invokeinterface #264 <Method void android.content.SharedPreferences$Editor.apply()>
			return;
	//   67  150:return          
		}
	//*  68  151:new             #10  <Class DOMStorage$DOMStorageAssignmentException>
	//*  69  154:dup             
	//*  70  155:getstatic       #289 <Field Locale Locale.US>
	//*  71  158:ldc2            #291 <String "Type mismatch setting %s to %s (expected %s)">
	//*  72  161:iconst_3        
	//*  73  162:anewarray       Object[]
	//*  74  165:dup             
	//*  75  166:iconst_0        
	//*  76  167:aload_3         
	//*  77  168:aastore         
	//*  78  169:dup             
	//*  79  170:iconst_1        
	//*  80  171:aload_2         
	//*  81  172:aastore         
	//*  82  173:dup             
	//*  83  174:iconst_2        
	//*  84  175:aload           5
	//*  85  177:invokevirtual   #125 <Method Class Object.getClass()>
	//*  86  180:invokevirtual   #294 <Method String Class.getSimpleName()>
	//*  87  183:aastore         
	//*  88  184:invokestatic    #298 <Method String String.format(Locale, String, Object[])>
	//*  89  187:invokespecial   #277 <Method void DOMStorage$DOMStorageAssignmentException(String)>
	//*  90  190:athrow          
	//*  91  191:aload_0         
	//*  92  192:getfield        #53  <Field DOMStoragePeerManager mDOMStoragePeerManager>
	//*  93  195:getstatic       #304 <Field Console$MessageLevel Console$MessageLevel.ERROR>
	//*  94  198:getstatic       #310 <Field Console$MessageSource Console$MessageSource.STORAGE>
	//*  95  201:aload           6
	//*  96  203:invokevirtual   #313 <Method String DOMStorage$DOMStorageAssignmentException.getMessage()>
	//*  97  206:invokestatic    #319 <Method void CLog.writeToConsole(com.facebook.stetho.inspector.helper.ChromePeerManager, Console$MessageLevel, Console$MessageSource, String)>
	//*  98  209:aload           4
	//*  99  211:aload_3         
	//* 100  212:invokeinterface #323 <Method boolean SharedPreferences.contains(String)>
	//* 101  217:ifeq            236
	//* 102  220:aload_0         
	//* 103  221:getfield        #53  <Field DOMStoragePeerManager mDOMStoragePeerManager>
	//* 104  224:aload_1         
	//* 105  225:aload_3         
	//* 106  226:aload_2         
	//* 107  227:aload           5
	//* 108  229:invokestatic    #239 <Method String SharedPreferencesHelper.valueToString(Object)>
	//* 109  232:invokevirtual   #327 <Method void DOMStoragePeerManager.signalItemUpdated(DOMStorage$StorageId, String, String, String)>
	//* 110  235:return          
	//* 111  236:aload_0         
	//* 112  237:getfield        #53  <Field DOMStoragePeerManager mDOMStoragePeerManager>
	//* 113  240:aload_1         
	//* 114  241:aload_3         
	//* 115  242:invokevirtual   #331 <Method void DOMStoragePeerManager.signalItemRemoved(DOMStorage$StorageId, String)>
	//* 116  245:return          
		// Misplaced declaration of an exception variable
		catch(Object obj1) { }
	//  117  246:astore          6
		try
		{
			throw new DOMStorageAssignmentException(String.format(Locale.US, "Type mismatch setting %s to %s (expected %s)", new Object[] {
				s, jsonobject, obj.getClass().getSimpleName()
			}));
		}
	//* 118  248:goto            151
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			CLog.writeToConsole(((com.facebook.stetho.inspector.helper.ChromePeerManager) (mDOMStoragePeerManager)), Console.MessageLevel.ERROR, Console.MessageSource.STORAGE, ((DOMStorageAssignmentException) (obj1)).getMessage());
		}
		if(sharedpreferences.contains(s))
		{
			mDOMStoragePeerManager.signalItemUpdated(((StorageId) (jsonrpcpeer)), s, ((String) (jsonobject)), SharedPreferencesHelper.valueToString(obj));
			return;
		}
		mDOMStoragePeerManager.signalItemRemoved(((StorageId) (jsonrpcpeer)), s);
	//* 119  251:astore          6
	//* 120  253:goto            191
	}

	private final Context mContext;
	private final DOMStoragePeerManager mDOMStoragePeerManager;
	private final ObjectMapper mObjectMapper = new ObjectMapper();
}
