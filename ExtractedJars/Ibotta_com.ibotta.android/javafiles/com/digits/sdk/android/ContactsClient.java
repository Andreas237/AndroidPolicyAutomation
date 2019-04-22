// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import com.newrelic.agent.android.instrumentation.retrofit.RetrofitInstrumentation;
import com.twitter.sdk.android.core.*;
import retrofit.RestAdapter;

// Referenced classes of package com.digits.sdk.android:
//			ContactsPreferenceManager, ActivityClassManagerFactory, DigitsApi, Digits, 
//			Vcards, UploadResponse, ContactsCallback

public class ContactsClient
{
	static interface ContactsService
	{

		public abstract void deleteAll(ContactsCallback contactscallback);

		public abstract UploadResponse upload(Vcards vcards);

		public abstract void usersAndUploadedBy(String s, Integer integer, ContactsCallback contactscallback);
	}


	ContactsClient()
	{
		this(TwitterCore.getInstance(), new ContactsPreferenceManager(), new ActivityClassManagerFactory(), ((ContactsService) (null)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #24  <Method TwitterCore TwitterCore.getInstance()>
	//    2    4:new             #26  <Class ContactsPreferenceManager>
	//    3    7:dup             
	//    4    8:invokespecial   #28  <Method void ContactsPreferenceManager()>
	//    5   11:new             #30  <Class ActivityClassManagerFactory>
	//    6   14:dup             
	//    7   15:invokespecial   #31  <Method void ActivityClassManagerFactory()>
	//    8   18:aconst_null     
	//    9   19:invokespecial   #34  <Method void ContactsClient(TwitterCore, ContactsPreferenceManager, ActivityClassManagerFactory, ContactsClient$ContactsService)>
	//   10   22:return          
	}

	ContactsClient(TwitterCore twittercore, ContactsPreferenceManager contactspreferencemanager, ActivityClassManagerFactory activityclassmanagerfactory, ContactsService contactsservice)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		if(twittercore != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          58
		{
			if(contactspreferencemanager != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          48
			{
				if(activityclassmanagerfactory != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          38
				{
					twitterCore = twittercore;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #38  <Field TwitterCore twitterCore>
					prefManager = contactspreferencemanager;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #40  <Field ContactsPreferenceManager prefManager>
					activityClassManagerFactory = activityclassmanagerfactory;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #42  <Field ActivityClassManagerFactory activityClassManagerFactory>
					contactsService = contactsservice;
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:putfield        #44  <Field ContactsClient$ContactsService contactsService>
					return;
	//   20   37:return          
				} else
				{
					throw new IllegalArgumentException("activityClassManagerFactory must not be null");
	//   21   38:new             #46  <Class IllegalArgumentException>
	//   22   41:dup             
	//   23   42:ldc1            #48  <String "activityClassManagerFactory must not be null">
	//   24   44:invokespecial   #51  <Method void IllegalArgumentException(String)>
	//   25   47:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("preference manager must not be null");
	//   26   48:new             #46  <Class IllegalArgumentException>
	//   27   51:dup             
	//   28   52:ldc1            #53  <String "preference manager must not be null">
	//   29   54:invokespecial   #51  <Method void IllegalArgumentException(String)>
	//   30   57:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("twitter must not be null");
	//   31   58:new             #46  <Class IllegalArgumentException>
	//   32   61:dup             
	//   33   62:ldc1            #55  <String "twitter must not be null">
	//   34   64:invokespecial   #51  <Method void IllegalArgumentException(String)>
	//   35   67:athrow          
		}
	}

	private ContactsService getContactsService()
	{
		Object obj = ((Object) (contactsService));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ContactsClient$ContactsService contactsService>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return ((ContactsService) (obj));
	//    5    9:aload_1         
	//    6   10:areturn         
		obj = ((Object) ((new retrofit.RestAdapter.Builder()).setEndpoint((new DigitsApi()).getBaseHostUrl())));
	//    7   11:new             #59  <Class retrofit.RestAdapter$Builder>
	//    8   14:dup             
	//    9   15:invokespecial   #60  <Method void retrofit.RestAdapter$Builder()>
	//   10   18:new             #62  <Class DigitsApi>
	//   11   21:dup             
	//   12   22:invokespecial   #63  <Method void DigitsApi()>
	//   13   25:invokevirtual   #67  <Method String DigitsApi.getBaseHostUrl()>
	//   14   28:invokevirtual   #71  <Method retrofit.RestAdapter$Builder retrofit.RestAdapter$Builder.setEndpoint(String)>
	//   15   31:astore_1        
		AuthenticatedClient authenticatedclient = new AuthenticatedClient(twitterCore.getAuthConfig(), Digits.getSessionManager().getActiveSession(), twitterCore.getSSLSocketFactory());
	//   16   32:new             #73  <Class AuthenticatedClient>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:getfield        #38  <Field TwitterCore twitterCore>
	//   20   40:invokevirtual   #77  <Method com.twitter.sdk.android.core.TwitterAuthConfig TwitterCore.getAuthConfig()>
	//   21   43:invokestatic    #83  <Method SessionManager Digits.getSessionManager()>
	//   22   46:invokeinterface #89  <Method com.twitter.sdk.android.core.Session SessionManager.getActiveSession()>
	//   23   51:aload_0         
	//   24   52:getfield        #38  <Field TwitterCore twitterCore>
	//   25   55:invokevirtual   #93  <Method javax.net.ssl.SSLSocketFactory TwitterCore.getSSLSocketFactory()>
	//   26   58:invokespecial   #96  <Method void AuthenticatedClient(com.twitter.sdk.android.core.TwitterAuthConfig, com.twitter.sdk.android.core.Session, javax.net.ssl.SSLSocketFactory)>
	//   27   61:astore_2        
		if(!(obj instanceof retrofit.RestAdapter.Builder))
	//*  28   62:aload_1         
	//*  29   63:instanceof      #59  <Class retrofit.RestAdapter$Builder>
	//*  30   66:ifne            78
			obj = ((Object) (((retrofit.RestAdapter.Builder) (obj)).setClient(((retrofit.client.Client) (authenticatedclient)))));
	//   31   69:aload_1         
	//   32   70:aload_2         
	//   33   71:invokevirtual   #100 <Method retrofit.RestAdapter$Builder retrofit.RestAdapter$Builder.setClient(retrofit.client.Client)>
	//   34   74:astore_1        
		else
	//*  35   75:goto            87
			obj = ((Object) (RetrofitInstrumentation.setClient((retrofit.RestAdapter.Builder)obj, ((retrofit.client.Client) (authenticatedclient)))));
	//   36   78:aload_1         
	//   37   79:checkcast       #59  <Class retrofit.RestAdapter$Builder>
	//   38   82:aload_2         
	//   39   83:invokestatic    #105 <Method retrofit.RestAdapter$Builder RetrofitInstrumentation.setClient(retrofit.RestAdapter$Builder, retrofit.client.Client)>
	//   40   86:astore_1        
		contactsService = (ContactsService)((retrofit.RestAdapter.Builder) (obj)).build().create(com/digits/sdk/android/ContactsClient$ContactsService);
	//   41   87:aload_0         
	//   42   88:aload_1         
	//   43   89:invokevirtual   #109 <Method RestAdapter retrofit.RestAdapter$Builder.build()>
	//   44   92:ldc1            #6   <Class ContactsClient$ContactsService>
	//   45   94:invokevirtual   #115 <Method Object RestAdapter.create(Class)>
	//   46   97:checkcast       #6   <Class ContactsClient$ContactsService>
	//   47  100:putfield        #44  <Field ContactsClient$ContactsService contactsService>
		return contactsService;
	//   48  103:aload_0         
	//   49  104:getfield        #44  <Field ContactsClient$ContactsService contactsService>
	//   50  107:areturn         
	}

	UploadResponse uploadContacts(Vcards vcards)
	{
		return getContactsService().upload(vcards);
	//    0    0:aload_0         
	//    1    1:invokespecial   #119 <Method ContactsClient$ContactsService getContactsService()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #122 <Method UploadResponse ContactsClient$ContactsService.upload(Vcards)>
	//    4   10:areturn         
	}

	private ActivityClassManagerFactory activityClassManagerFactory;
	private ContactsService contactsService;
	private final ContactsPreferenceManager prefManager;
	private final TwitterCore twitterCore;
}
