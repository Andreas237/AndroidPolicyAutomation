// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.digits.sdk.android:
//			ContactsUploadService, ContactsClient, Vcards

class ContactsUploadService$1
	implements Runnable
{

	public void run()
	{
		ContactsUploadService.access$000(ContactsUploadService.this).uploadContacts(val$vCards);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ContactsUploadService this$0>
	//    2    4:invokestatic    #34  <Method ContactsClient ContactsUploadService.access$000(ContactsUploadService)>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field Vcards val$vCards>
	//    5   11:invokevirtual   #40  <Method UploadResponse ContactsClient.uploadContacts(Vcards)>
	//    6   14:pop             
		val$successCount.addAndGet(val$vCards.vcards.size());
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

	ContactsUploadService$1()
	{
		this$0 = final_contactsuploadservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ContactsUploadService this$0>
		val$vCards = vcards;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Vcards val$vCards>
		val$successCount = AtomicInteger.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field AtomicInteger val$successCount>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
