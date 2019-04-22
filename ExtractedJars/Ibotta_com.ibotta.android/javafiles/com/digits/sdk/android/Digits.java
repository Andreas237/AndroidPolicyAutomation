// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import com.twitter.sdk.android.core.PersistedSessionManager;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.internal.MigrationHelper;
import com.twitter.sdk.android.core.internal.SessionMonitor;
import com.twitter.sdk.android.core.internal.scribe.DefaultScribeClient;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.digits.sdk.android:
//			NoOpScribeService, ContactsClient, DigitsClient, ActivityClassManagerFactory, 
//			DigitsScribeServiceImp, DigitsSessionVerifier, ActivityClassManager, DigitsScribeService

public class Digits extends Kit
{

	public Digits()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Kit()>
		scribeService = ((DigitsScribeService) (new NoOpScribeService()));
	//    2    4:aload_0         
	//    3    5:new             #32  <Class NoOpScribeService>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void NoOpScribeService()>
	//    6   12:putfield        #35  <Field DigitsScribeService scribeService>
	//    7   15:return          
	}

	private void createContactsClient()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(contactsClient == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #39  <Field ContactsClient contactsClient>
	//*   4    6:ifnonnull       20
			contactsClient = new ContactsClient();
	//    5    9:aload_0         
	//    6   10:new             #41  <Class ContactsClient>
	//    7   13:dup             
	//    8   14:invokespecial   #42  <Method void ContactsClient()>
	//    9   17:putfield        #39  <Field ContactsClient contactsClient>
		this;
	//   10   20:aload_0         
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return;
	//   12   22:return          
		Exception exception;
		exception;
	//   13   23:astore_1        
	//*  14   24:aload_0         
		throw exception;
	//   15   25:monitorexit     
	//   16   26:aload_1         
	//   17   27:athrow          
	}

	private void createDigitsClient()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(digitsClient == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #45  <Field DigitsClient digitsClient>
	//*   4    6:ifnonnull       20
			digitsClient = new DigitsClient();
	//    5    9:aload_0         
	//    6   10:new             #47  <Class DigitsClient>
	//    7   13:dup             
	//    8   14:invokespecial   #48  <Method void DigitsClient()>
	//    9   17:putfield        #45  <Field DigitsClient digitsClient>
		this;
	//   10   20:aload_0         
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return;
	//   12   22:return          
		Exception exception;
		exception;
	//   13   23:astore_1        
	//*  14   24:aload_0         
		throw exception;
	//   15   25:monitorexit     
	//   16   26:aload_1         
	//   17   27:athrow          
	}

	public static Digits getInstance()
	{
		return (Digits)Fabric.getKit(com/digits/sdk/android/Digits);
	//    0    0:ldc1            #2   <Class Digits>
	//    1    2:invokestatic    #56  <Method Kit Fabric.getKit(Class)>
	//    2    5:checkcast       #2   <Class Digits>
	//    3    8:areturn         
	}

	public static SessionManager getSessionManager()
	{
		return getInstance().sessionManager;
	//    0    0:invokestatic    #60  <Method Digits getInstance()>
	//    1    3:getfield        #62  <Field SessionManager sessionManager>
	//    2    6:areturn         
	}

	private DefaultScribeClient setUpScribing()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #68  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void ArrayList()>
	//    3    7:astore_1        
		((List) (arraylist)).add(((Object) (sessionManager)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #62  <Field SessionManager sessionManager>
	//    7   13:invokeinterface #75  <Method boolean List.add(Object)>
	//    8   18:pop             
		return new DefaultScribeClient(((Kit) (this)), "Digits", ((List) (arraylist)), getIdManager());
	//    9   19:new             #77  <Class DefaultScribeClient>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:ldc1            #79  <String "Digits">
	//   13   26:aload_1         
	//   14   27:aload_0         
	//   15   28:invokevirtual   #83  <Method io.fabric.sdk.android.services.common.IdManager getIdManager()>
	//   16   31:invokespecial   #86  <Method void DefaultScribeClient(Kit, String, List, io.fabric.sdk.android.services.common.IdManager)>
	//   17   34:areturn         
	}

	protected void createActivityClassManager()
	{
		activityClassManager = (new ActivityClassManagerFactory()).createActivityClassManager(getContext(), themeResId);
	//    0    0:aload_0         
	//    1    1:new             #89  <Class ActivityClassManagerFactory>
	//    2    4:dup             
	//    3    5:invokespecial   #90  <Method void ActivityClassManagerFactory()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #94  <Method android.content.Context getContext()>
	//    6   12:aload_0         
	//    7   13:getfield        #96  <Field int themeResId>
	//    8   16:invokevirtual   #99  <Method ActivityClassManager ActivityClassManagerFactory.createActivityClassManager(android.content.Context, int)>
	//    9   19:putfield        #101 <Field ActivityClassManager activityClassManager>
	//   10   22:return          
	}

	protected volatile Object doInBackground()
	{
		return ((Object) (doInBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #106 <Method Void doInBackground()>
	//    2    4:areturn         
	}

	protected Void doInBackground()
	{
		sessionManager.getActiveSession();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field SessionManager sessionManager>
	//    2    4:invokeinterface #112 <Method com.twitter.sdk.android.core.Session SessionManager.getActiveSession()>
	//    3    9:pop             
		createDigitsClient();
	//    4   10:aload_0         
	//    5   11:invokespecial   #114 <Method void createDigitsClient()>
		createContactsClient();
	//    6   14:aload_0         
	//    7   15:invokespecial   #116 <Method void createContactsClient()>
		scribeService = ((DigitsScribeService) (new DigitsScribeServiceImp(setUpScribing())));
	//    8   18:aload_0         
	//    9   19:new             #118 <Class DigitsScribeServiceImp>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #120 <Method DefaultScribeClient setUpScribing()>
	//   13   27:invokespecial   #123 <Method void DigitsScribeServiceImp(DefaultScribeClient)>
	//   14   30:putfield        #35  <Field DigitsScribeService scribeService>
		userSessionMonitor = new SessionMonitor(getSessionManager(), getExecutorService(), ((com.twitter.sdk.android.core.internal.SessionVerifier) (digitsSessionVerifier)));
	//   15   33:aload_0         
	//   16   34:new             #125 <Class SessionMonitor>
	//   17   37:dup             
	//   18   38:invokestatic    #127 <Method SessionManager getSessionManager()>
	//   19   41:aload_0         
	//   20   42:invokevirtual   #131 <Method ExecutorService getExecutorService()>
	//   21   45:aload_0         
	//   22   46:getfield        #133 <Field DigitsSessionVerifier digitsSessionVerifier>
	//   23   49:invokespecial   #136 <Method void SessionMonitor(SessionManager, ExecutorService, com.twitter.sdk.android.core.internal.SessionVerifier)>
	//   24   52:putfield        #138 <Field SessionMonitor userSessionMonitor>
		userSessionMonitor.triggerVerificationIfNecessary();
	//   25   55:aload_0         
	//   26   56:getfield        #138 <Field SessionMonitor userSessionMonitor>
	//   27   59:invokevirtual   #141 <Method void SessionMonitor.triggerVerificationIfNecessary()>
		userSessionMonitor.monitorActivityLifecycle(getFabric().getActivityLifecycleManager());
	//   28   62:aload_0         
	//   29   63:getfield        #138 <Field SessionMonitor userSessionMonitor>
	//   30   66:aload_0         
	//   31   67:invokevirtual   #145 <Method Fabric getFabric()>
	//   32   70:invokevirtual   #149 <Method io.fabric.sdk.android.ActivityLifecycleManager Fabric.getActivityLifecycleManager()>
	//   33   73:invokevirtual   #153 <Method void SessionMonitor.monitorActivityLifecycle(io.fabric.sdk.android.ActivityLifecycleManager)>
		return null;
	//   34   76:aconst_null     
	//   35   77:areturn         
	}

	protected ActivityClassManager getActivityClassManager()
	{
		if(activityClassManager == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field ActivityClassManager activityClassManager>
	//*   2    4:ifnonnull       11
			createActivityClassManager();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #157 <Method void createActivityClassManager()>
		return activityClassManager;
	//    5   11:aload_0         
	//    6   12:getfield        #101 <Field ActivityClassManager activityClassManager>
	//    7   15:areturn         
	}

	public ContactsClient getContactsClient()
	{
		if(contactsClient == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field ContactsClient contactsClient>
	//*   2    4:ifnonnull       11
			createContactsClient();
	//    3    7:aload_0         
	//    4    8:invokespecial   #116 <Method void createContactsClient()>
		return contactsClient;
	//    5   11:aload_0         
	//    6   12:getfield        #39  <Field ContactsClient contactsClient>
	//    7   15:areturn         
	}

	DigitsClient getDigitsClient()
	{
		if(digitsClient == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field DigitsClient digitsClient>
	//*   2    4:ifnonnull       11
			createDigitsClient();
	//    3    7:aload_0         
	//    4    8:invokespecial   #114 <Method void createDigitsClient()>
		return digitsClient;
	//    5   11:aload_0         
	//    6   12:getfield        #45  <Field DigitsClient digitsClient>
	//    7   15:areturn         
	}

	protected ExecutorService getExecutorService()
	{
		return getFabric().getExecutorService();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method Fabric getFabric()>
	//    2    4:invokevirtual   #162 <Method ExecutorService Fabric.getExecutorService()>
	//    3    7:areturn         
	}

	public String getIdentifier()
	{
		return "com.digits.sdk.android:digits";
	//    0    0:ldc1            #166 <String "com.digits.sdk.android:digits">
	//    1    2:areturn         
	}

	int getTheme()
	{
		int i = themeResId;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field int themeResId>
	//    2    4:istore_1        
		if(i != 0)
	//*   3    5:iload_1         
	//*   4    6:ifeq            11
			return i;
	//    5    9:iload_1         
	//    6   10:ireturn         
		else
			return R.style.Digits_default;
	//    7   11:getstatic       #175 <Field int R$style.Digits_default>
	//    8   14:ireturn         
	}

	public String getVersion()
	{
		return "1.8.0.78";
	//    0    0:ldc1            #179 <String "1.8.0.78">
	//    1    2:areturn         
	}

	protected boolean onPreExecute()
	{
		MigrationHelper migrationhelper = new MigrationHelper();
	//    0    0:new             #183 <Class MigrationHelper>
	//    1    3:dup             
	//    2    4:invokespecial   #184 <Method void MigrationHelper()>
	//    3    7:astore_1        
		android.content.Context context = getContext();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #94  <Method android.content.Context getContext()>
	//    6   12:astore_2        
		String s = getIdentifier();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #186 <Method String getIdentifier()>
	//    9   17:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   10   18:new             #188 <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #189 <Method void StringBuilder()>
	//   13   25:astore          4
		stringbuilder.append(getIdentifier());
	//   14   27:aload           4
	//   15   29:aload_0         
	//   16   30:invokevirtual   #186 <Method String getIdentifier()>
	//   17   33:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		stringbuilder.append(":");
	//   19   37:aload           4
	//   20   39:ldc1            #195 <String ":">
	//   21   41:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
		stringbuilder.append("session_store");
	//   23   45:aload           4
	//   24   47:ldc1            #197 <String "session_store">
	//   25   49:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
		stringbuilder.append(".xml");
	//   27   53:aload           4
	//   28   55:ldc1            #199 <String ".xml">
	//   29   57:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   30   60:pop             
		migrationhelper.migrateSessionStore(context, s, stringbuilder.toString());
	//   31   61:aload_1         
	//   32   62:aload_2         
	//   33   63:aload_3         
	//   34   64:aload           4
	//   35   66:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   36   69:invokevirtual   #206 <Method void MigrationHelper.migrateSessionStore(android.content.Context, String, String)>
		sessionManager = ((SessionManager) (new PersistedSessionManager(((io.fabric.sdk.android.services.persistence.PreferenceStore) (new PreferenceStoreImpl(getContext(), "session_store"))), ((io.fabric.sdk.android.services.persistence.SerializationStrategy) (new DigitsSession.Serializer())), "active_session", "session")));
	//   37   72:aload_0         
	//   38   73:new             #208 <Class PersistedSessionManager>
	//   39   76:dup             
	//   40   77:new             #210 <Class PreferenceStoreImpl>
	//   41   80:dup             
	//   42   81:aload_0         
	//   43   82:invokevirtual   #94  <Method android.content.Context getContext()>
	//   44   85:ldc1            #197 <String "session_store">
	//   45   87:invokespecial   #213 <Method void PreferenceStoreImpl(android.content.Context, String)>
	//   46   90:new             #215 <Class DigitsSession$Serializer>
	//   47   93:dup             
	//   48   94:invokespecial   #216 <Method void DigitsSession$Serializer()>
	//   49   97:ldc1            #218 <String "active_session">
	//   50   99:ldc1            #220 <String "session">
	//   51  101:invokespecial   #223 <Method void PersistedSessionManager(io.fabric.sdk.android.services.persistence.PreferenceStore, io.fabric.sdk.android.services.persistence.SerializationStrategy, String, String)>
	//   52  104:putfield        #62  <Field SessionManager sessionManager>
		digitsSessionVerifier = new DigitsSessionVerifier();
	//   53  107:aload_0         
	//   54  108:new             #225 <Class DigitsSessionVerifier>
	//   55  111:dup             
	//   56  112:invokespecial   #226 <Method void DigitsSessionVerifier()>
	//   57  115:putfield        #133 <Field DigitsSessionVerifier digitsSessionVerifier>
		return super.onPreExecute();
	//   58  118:aload_0         
	//   59  119:invokespecial   #228 <Method boolean Kit.onPreExecute()>
	//   60  122:ireturn         
	}

	private ActivityClassManager activityClassManager;
	private volatile ContactsClient contactsClient;
	private volatile DigitsClient digitsClient;
	private DigitsSessionVerifier digitsSessionVerifier;
	private DigitsScribeService scribeService;
	private SessionManager sessionManager;
	private int themeResId;
	private SessionMonitor userSessionMonitor;
}
