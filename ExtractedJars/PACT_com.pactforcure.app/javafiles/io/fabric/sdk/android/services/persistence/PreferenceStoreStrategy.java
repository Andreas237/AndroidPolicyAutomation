// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.persistence;

import android.content.SharedPreferences;

// Referenced classes of package io.fabric.sdk.android.services.persistence:
//			PersistenceStrategy, PreferenceStore, SerializationStrategy

public class PreferenceStoreStrategy
	implements PersistenceStrategy
{

	public PreferenceStoreStrategy(PreferenceStore preferencestore, SerializationStrategy serializationstrategy, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		store = preferencestore;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field PreferenceStore store>
		serializer = serializationstrategy;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field SerializationStrategy serializer>
		key = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field String key>
	//   11   19:return          
	}

	public void clear()
	{
		store.edit().remove(key).commit();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field PreferenceStore store>
	//    2    4:invokeinterface #35  <Method android.content.SharedPreferences$Editor PreferenceStore.edit()>
	//    3    9:aload_0         
	//    4   10:getfield        #25  <Field String key>
	//    5   13:invokeinterface #41  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//    6   18:invokeinterface #45  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//    7   23:pop             
	//    8   24:return          
	}

	public Object restore()
	{
		SharedPreferences sharedpreferences = store.get();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field PreferenceStore store>
	//    2    4:invokeinterface #51  <Method SharedPreferences PreferenceStore.get()>
	//    3    9:astore_1        
		return serializer.deserialize(sharedpreferences.getString(key, ((String) (null))));
	//    4   10:aload_0         
	//    5   11:getfield        #23  <Field SerializationStrategy serializer>
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:getfield        #25  <Field String key>
	//    9   19:aconst_null     
	//   10   20:invokeinterface #57  <Method String SharedPreferences.getString(String, String)>
	//   11   25:invokeinterface #63  <Method Object SerializationStrategy.deserialize(String)>
	//   12   30:areturn         
	}

	public void save(Object obj)
	{
		store.save(store.edit().putString(key, serializer.serialize(obj)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field PreferenceStore store>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field PreferenceStore store>
	//    4    8:invokeinterface #35  <Method android.content.SharedPreferences$Editor PreferenceStore.edit()>
	//    5   13:aload_0         
	//    6   14:getfield        #25  <Field String key>
	//    7   17:aload_0         
	//    8   18:getfield        #23  <Field SerializationStrategy serializer>
	//    9   21:aload_1         
	//   10   22:invokeinterface #73  <Method String SerializationStrategy.serialize(Object)>
	//   11   27:invokeinterface #77  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   12   32:invokeinterface #80  <Method boolean PreferenceStore.save(android.content.SharedPreferences$Editor)>
	//   13   37:pop             
	//   14   38:return          
	}

	private final String key;
	private final SerializationStrategy serializer;
	private final PreferenceStore store;
}
