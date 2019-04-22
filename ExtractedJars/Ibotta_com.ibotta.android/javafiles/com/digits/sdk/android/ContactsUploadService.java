// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.IntentService;
import android.content.Intent;
import android.database.Cursor;
import io.fabric.sdk.android.services.concurrency.internal.*;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.digits.sdk.android:
//			Digits, ContactsHelper, ContactsPreferenceManager, Vcards, 
//			ContactsUploadResult, ContactsClient

public class ContactsUploadService extends IntentService
{

	public ContactsUploadService()
	{
		super("UPLOAD_WORKER");
	//    0    0:aload_0         
	//    1    1:ldc1            #18  <String "UPLOAD_WORKER">
	//    2    3:invokespecial   #21  <Method void IntentService(String)>
		init(Digits.getInstance().getContactsClient(), new ContactsHelper(((android.content.Context) (this))), new ContactsPreferenceManager(), new RetryThreadPoolExecutor(2, ((io.fabric.sdk.android.services.concurrency.internal.RetryPolicy) (new DefaultRetryPolicy(1))), ((io.fabric.sdk.android.services.concurrency.internal.Backoff) (new ExponentialBackoff(1000L)))));
	//    3    6:aload_0         
	//    4    7:invokestatic    #27  <Method Digits Digits.getInstance()>
	//    5   10:invokevirtual   #31  <Method ContactsClient Digits.getContactsClient()>
	//    6   13:new             #33  <Class ContactsHelper>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #36  <Method void ContactsHelper(android.content.Context)>
	//   10   21:new             #38  <Class ContactsPreferenceManager>
	//   11   24:dup             
	//   12   25:invokespecial   #40  <Method void ContactsPreferenceManager()>
	//   13   28:new             #42  <Class RetryThreadPoolExecutor>
	//   14   31:dup             
	//   15   32:iconst_2        
	//   16   33:new             #44  <Class DefaultRetryPolicy>
	//   17   36:dup             
	//   18   37:iconst_1        
	//   19   38:invokespecial   #47  <Method void DefaultRetryPolicy(int)>
	//   20   41:new             #49  <Class ExponentialBackoff>
	//   21   44:dup             
	//   22   45:ldc2w           #50  <Long 1000L>
	//   23   48:invokespecial   #54  <Method void ExponentialBackoff(long)>
	//   24   51:invokespecial   #57  <Method void RetryThreadPoolExecutor(int, io.fabric.sdk.android.services.concurrency.internal.RetryPolicy, io.fabric.sdk.android.services.concurrency.internal.Backoff)>
	//   25   54:invokespecial   #61  <Method void init(ContactsClient, ContactsHelper, ContactsPreferenceManager, RetryThreadPoolExecutor)>
	//   26   57:return          
	}

	private List getAllCards()
	{
		Cursor cursor;
		Collections.emptyList();
	//    0    0:invokestatic    #73  <Method List Collections.emptyList()>
	//    1    3:pop             
		cursor = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		Cursor cursor1 = helper.getContactsCursor();
	//    4    6:aload_0         
	//    5    7:getfield        #75  <Field ContactsHelper helper>
	//    6   10:invokevirtual   #79  <Method Cursor ContactsHelper.getContactsCursor()>
	//    7   13:astore_2        
		cursor = cursor1;
	//    8   14:aload_2         
	//    9   15:astore_1        
		List list = helper.createContactList(cursor1);
	//   10   16:aload_0         
	//   11   17:getfield        #75  <Field ContactsHelper helper>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #83  <Method List ContactsHelper.createContactList(Cursor)>
	//   14   24:astore_3        
		if(cursor1 != null)
	//*  15   25:aload_2         
	//*  16   26:ifnull          35
			cursor1.close();
	//   17   29:aload_2         
	//   18   30:invokeinterface #88  <Method void Cursor.close()>
		return list;
	//   19   35:aload_3         
	//   20   36:areturn         
		Exception exception;
		exception;
	//   21   37:astore_2        
		if(cursor != null)
	//*  22   38:aload_1         
	//*  23   39:ifnull          48
			cursor.close();
	//   24   42:aload_1         
	//   25   43:invokeinterface #88  <Method void Cursor.close()>
		throw exception;
	//   26   48:aload_2         
	//   27   49:athrow          
	}

	private void init(ContactsClient contactsclient, ContactsHelper contactshelper, ContactsPreferenceManager contactspreferencemanager, RetryThreadPoolExecutor retrythreadpoolexecutor)
	{
		contactsClient = contactsclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field ContactsClient contactsClient>
		helper = contactshelper;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #75  <Field ContactsHelper helper>
		prefManager = contactspreferencemanager;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #92  <Field ContactsPreferenceManager prefManager>
		executor = retrythreadpoolexecutor;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #94  <Field RetryThreadPoolExecutor executor>
		setIntentRedelivery(true);
	//   12   21:aload_0         
	//   13   22:iconst_1        
	//   14   23:invokevirtual   #98  <Method void setIntentRedelivery(boolean)>
	//   15   26:return          
	}

	int getNumberOfPages(int i)
	{
		return ((i + 100) - 1) / 100;
	//    0    0:iload_1         
	//    1    1:bipush          100
	//    2    3:iadd            
	//    3    4:iconst_1        
	//    4    5:isub            
	//    5    6:bipush          100
	//    6    8:idiv            
	//    7    9:ireturn         
	}

	protected void onHandleIntent(Intent intent)
	{
		prefManager.setContactImportPermissionGranted();
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field ContactsPreferenceManager prefManager>
	//    2    4:invokevirtual   #107 <Method void ContactsPreferenceManager.setContactImportPermissionGranted()>
		int j;
		int k;
		intent = ((Intent) (getAllCards()));
	//    3    7:aload_0         
	//    4    8:invokespecial   #109 <Method List getAllCards()>
	//    5   11:astore_1        
		j = ((List) (intent)).size();
	//    6   12:aload_1         
	//    7   13:invokeinterface #115 <Method int List.size()>
	//    8   18:istore_3        
		k = getNumberOfPages(j);
	//    9   19:aload_0         
	//   10   20:iload_3         
	//   11   21:invokevirtual   #117 <Method int getNumberOfPages(int)>
	//   12   24:istore          4
		int i = 0;
	//   13   26:iconst_0        
	//   14   27:istore_2        
		final AtomicInteger successCount = new AtomicInteger(0);
	//   15   28:new             #119 <Class AtomicInteger>
	//   16   31:dup             
	//   17   32:iconst_0        
	//   18   33:invokespecial   #120 <Method void AtomicInteger(int)>
	//   19   36:astore          6
_L2:
		int l;
		if(i >= k)
			break; /* Loop/switch isn't completed */
	//   20   38:iload_2         
	//   21   39:iload           4
	//   22   41:icmpge          103
		l = i * 100;
	//   23   44:iload_2         
	//   24   45:bipush          100
	//   25   47:imul            
	//   26   48:istore          5
		final Vcards vCards = new Vcards(((List) (intent)).subList(l, Math.min(j, l + 100)));
	//   27   50:new             #122 <Class Vcards>
	//   28   53:dup             
	//   29   54:aload_1         
	//   30   55:iload           5
	//   31   57:iload_3         
	//   32   58:iload           5
	//   33   60:bipush          100
	//   34   62:iadd            
	//   35   63:invokestatic    #128 <Method int Math.min(int, int)>
	//   36   66:invokeinterface #132 <Method List List.subList(int, int)>
	//   37   71:invokespecial   #135 <Method void Vcards(List)>
	//   38   74:astore          7
		executor.scheduleWithRetry(new Runnable() {

			public void run()
			{
				contactsClient.uploadContacts(vCards);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field ContactsUploadService this$0>
			//    2    4:invokestatic    #34  <Method ContactsClient ContactsUploadService.access$000(ContactsUploadService)>
			//    3    7:aload_0         
			//    4    8:getfield        #23  <Field Vcards val$vCards>
			//    5   11:invokevirtual   #40  <Method UploadResponse ContactsClient.uploadContacts(Vcards)>
			//    6   14:pop             
				successCount.addAndGet(vCards.vcards.size());
			//    7   15:aload_0         
			//    8   16:getfield        #25  <Field AtomicInteger val$successCount>
			//    9   19:aload_0         
			//   10   20:getfield        #23  <Field Vcards val$vCards>
			//   11   23:getfield        #46  <Field List Vcards.vcards>
			//   12   26:invokeinterface #52  <Method int List.size()>
			//   13   31:invokevirtual   #58  <Method int AtomicInteger.addAndGet(int)>
			//   14   34:pop             
			//   15   35:return          
			}

			final ContactsUploadService this$0;
			final AtomicInteger val$successCount;
			final Vcards val$vCards;

			
			{
				this$0 = ContactsUploadService.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ContactsUploadService this$0>
				vCards = vcards;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Vcards val$vCards>
				successCount = atomicinteger;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field AtomicInteger val$successCount>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   39   76:aload_0         
	//   40   77:getfield        #94  <Field RetryThreadPoolExecutor executor>
	//   41   80:new             #6   <Class ContactsUploadService$1>
	//   42   83:dup             
	//   43   84:aload_0         
	//   44   85:aload           7
	//   45   87:aload           6
	//   46   89:invokespecial   #138 <Method void ContactsUploadService$1(ContactsUploadService, Vcards, AtomicInteger)>
	//   47   92:invokevirtual   #142 <Method java.util.concurrent.Future RetryThreadPoolExecutor.scheduleWithRetry(Runnable)>
	//   48   95:pop             
		i++;
	//   49   96:iload_2         
	//   50   97:iconst_1        
	//   51   98:iadd            
	//   52   99:istore_2        
		if(true) goto _L2; else goto _L1
	//   53  100:goto            38
_L1:
		executor.shutdown();
	//   54  103:aload_0         
	//   55  104:getfield        #94  <Field RetryThreadPoolExecutor executor>
	//   56  107:invokevirtual   #145 <Method void RetryThreadPoolExecutor.shutdown()>
		if(!executor.awaitTermination(300L, TimeUnit.SECONDS))
	//*  57  110:aload_0         
	//*  58  111:getfield        #94  <Field RetryThreadPoolExecutor executor>
	//*  59  114:ldc2w           #146 <Long 300L>
	//*  60  117:getstatic       #153 <Field TimeUnit TimeUnit.SECONDS>
	//*  61  120:invokevirtual   #157 <Method boolean RetryThreadPoolExecutor.awaitTermination(long, TimeUnit)>
	//*  62  123:ifne            139
		{
			executor.shutdownNow();
	//   63  126:aload_0         
	//   64  127:getfield        #94  <Field RetryThreadPoolExecutor executor>
	//   65  130:invokevirtual   #160 <Method List RetryThreadPoolExecutor.shutdownNow()>
	//   66  133:pop             
			sendFailureBroadcast();
	//   67  134:aload_0         
	//   68  135:invokevirtual   #163 <Method void sendFailureBroadcast()>
			return;
	//   69  138:return          
		}
		if(successCount.get() == 0)
	//*  70  139:aload           6
	//*  71  141:invokevirtual   #166 <Method int AtomicInteger.get()>
	//*  72  144:ifne            152
		{
			sendFailureBroadcast();
	//   73  147:aload_0         
	//   74  148:invokevirtual   #163 <Method void sendFailureBroadcast()>
			return;
	//   75  151:return          
		}
		try
		{
			prefManager.setContactsReadTimestamp(System.currentTimeMillis());
	//   76  152:aload_0         
	//   77  153:getfield        #92  <Field ContactsPreferenceManager prefManager>
	//   78  156:invokestatic    #172 <Method long System.currentTimeMillis()>
	//   79  159:invokevirtual   #175 <Method void ContactsPreferenceManager.setContactsReadTimestamp(long)>
			prefManager.setContactsUploaded(successCount.get());
	//   80  162:aload_0         
	//   81  163:getfield        #92  <Field ContactsPreferenceManager prefManager>
	//   82  166:aload           6
	//   83  168:invokevirtual   #166 <Method int AtomicInteger.get()>
	//   84  171:invokevirtual   #178 <Method void ContactsPreferenceManager.setContactsUploaded(int)>
			sendSuccessBroadcast(new ContactsUploadResult(successCount.get(), j));
	//   85  174:aload_0         
	//   86  175:new             #180 <Class ContactsUploadResult>
	//   87  178:dup             
	//   88  179:aload           6
	//   89  181:invokevirtual   #166 <Method int AtomicInteger.get()>
	//   90  184:iload_3         
	//   91  185:invokespecial   #183 <Method void ContactsUploadResult(int, int)>
	//   92  188:invokevirtual   #187 <Method void sendSuccessBroadcast(ContactsUploadResult)>
			return;
	//   93  191:return          
		}
	//*  94  192:aload_0         
	//*  95  193:invokevirtual   #163 <Method void sendFailureBroadcast()>
	//*  96  196:return          
		// Misplaced declaration of an exception variable
		catch(Intent intent)
		{
			sendFailureBroadcast();
		}
		return;
	//*  97  197:astore_1        
	//*  98  198:goto            192
	}

	void sendFailureBroadcast()
	{
		sendBroadcast(new Intent("com.digits.sdk.android.UPLOAD_FAILED"));
	//    0    0:aload_0         
	//    1    1:new             #189 <Class Intent>
	//    2    4:dup             
	//    3    5:ldc1            #191 <String "com.digits.sdk.android.UPLOAD_FAILED">
	//    4    7:invokespecial   #192 <Method void Intent(String)>
	//    5   10:invokevirtual   #195 <Method void sendBroadcast(Intent)>
	//    6   13:return          
	}

	void sendSuccessBroadcast(ContactsUploadResult contactsuploadresult)
	{
		Intent intent = new Intent("com.digits.sdk.android.UPLOAD_COMPLETE");
	//    0    0:new             #189 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #197 <String "com.digits.sdk.android.UPLOAD_COMPLETE">
	//    3    6:invokespecial   #192 <Method void Intent(String)>
	//    4    9:astore_2        
		intent.putExtra("com.digits.sdk.android.UPLOAD_COMPLETE_EXTRA", ((android.os.Parcelable) (contactsuploadresult)));
	//    5   10:aload_2         
	//    6   11:ldc1            #199 <String "com.digits.sdk.android.UPLOAD_COMPLETE_EXTRA">
	//    7   13:aload_1         
	//    8   14:invokevirtual   #203 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//    9   17:pop             
		sendBroadcast(intent);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #195 <Method void sendBroadcast(Intent)>
	//   13   23:return          
	}

	private ContactsClient contactsClient;
	private RetryThreadPoolExecutor executor;
	private ContactsHelper helper;
	private ContactsPreferenceManager prefManager;


/*
	static ContactsClient access$000(ContactsUploadService contactsuploadservice)
	{
		return contactsuploadservice.contactsClient;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field ContactsClient contactsClient>
	//    2    4:areturn         
	}

*/
}
