// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;

// Referenced classes of package com.digits.sdk.android:
//			Digits

class ContactsPreferenceManager
{

	ContactsPreferenceManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class PreferenceStoreImpl>
	//    4    8:dup             
	//    5    9:ldc1            #14  <Class Digits>
	//    6   11:invokestatic    #20  <Method io.fabric.sdk.android.Kit Fabric.getKit(Class)>
	//    7   14:invokespecial   #23  <Method void PreferenceStoreImpl(io.fabric.sdk.android.Kit)>
	//    8   17:putfield        #25  <Field PreferenceStore prefStore>
	//    9   20:return          
	}

	protected void setContactImportPermissionGranted()
	{
		PreferenceStore preferencestore = prefStore;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field PreferenceStore prefStore>
	//    2    4:astore_1        
		preferencestore.save(preferencestore.edit().putBoolean("CONTACTS_IMPORT_PERMISSION", true));
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokeinterface #36  <Method android.content.SharedPreferences$Editor PreferenceStore.edit()>
	//    6   12:ldc1            #38  <String "CONTACTS_IMPORT_PERMISSION">
	//    7   14:iconst_1        
	//    8   15:invokeinterface #44  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    9   20:invokeinterface #48  <Method boolean PreferenceStore.save(android.content.SharedPreferences$Editor)>
	//   10   25:pop             
	//   11   26:return          
	}

	protected void setContactsReadTimestamp(long l)
	{
		PreferenceStore preferencestore = prefStore;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field PreferenceStore prefStore>
	//    2    4:astore_3        
		preferencestore.save(preferencestore.edit().putLong("CONTACTS_READ_TIMESTAMP", l));
	//    3    5:aload_3         
	//    4    6:aload_3         
	//    5    7:invokeinterface #36  <Method android.content.SharedPreferences$Editor PreferenceStore.edit()>
	//    6   12:ldc1            #53  <String "CONTACTS_READ_TIMESTAMP">
	//    7   14:lload_1         
	//    8   15:invokeinterface #57  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//    9   20:invokeinterface #48  <Method boolean PreferenceStore.save(android.content.SharedPreferences$Editor)>
	//   10   25:pop             
	//   11   26:return          
	}

	protected void setContactsUploaded(int i)
	{
		PreferenceStore preferencestore = prefStore;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field PreferenceStore prefStore>
	//    2    4:astore_2        
		preferencestore.save(preferencestore.edit().putInt("CONTACTS_CONTACTS_UPLOADED", i));
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:invokeinterface #36  <Method android.content.SharedPreferences$Editor PreferenceStore.edit()>
	//    6   12:ldc1            #61  <String "CONTACTS_CONTACTS_UPLOADED">
	//    7   14:iload_1         
	//    8   15:invokeinterface #65  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//    9   20:invokeinterface #48  <Method boolean PreferenceStore.save(android.content.SharedPreferences$Editor)>
	//   10   25:pop             
	//   11   26:return          
	}

	private final PreferenceStore prefStore = new PreferenceStoreImpl(Fabric.getKit(com/digits/sdk/android/Digits));
}
