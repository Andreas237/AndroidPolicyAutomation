// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.GSResponse;
import com.gigya.socialize.GSResponseListener;

// Referenced classes of package com.gigya.socialize.android:
//			GSAPI

class GSAPI$1
	implements GSResponseListener
{

	public void onGSResponse(String s, GSResponse gsresponse, Object obj)
	{
		if(val$userInfoListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field GSResponseListener val$userInfoListener>
	//*   2    4:ifnull          19
			val$userInfoListener.onGSResponse(s, gsresponse, obj);
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field GSResponseListener val$userInfoListener>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokeinterface #37  <Method void GSResponseListener.onGSResponse(String, GSResponse, Object)>
		if(gsresponse.getErrorCode() == 0 && val$sessionChanged)
	//*   9   19:aload_2         
	//*  10   20:invokevirtual   #43  <Method int GSResponse.getErrorCode()>
	//*  11   23:ifne            64
	//*  12   26:aload_0         
	//*  13   27:getfield        #27  <Field boolean val$sessionChanged>
	//*  14   30:ifeq            64
			invokeSocializeListeners("login", new Object[] {
				val$loginProvider, gsresponse.getData(), obj
			});
	//   15   33:aload_0         
	//   16   34:getfield        #23  <Field GSAPI this$0>
	//   17   37:ldc1            #45  <String "login">
	//   18   39:iconst_3        
	//   19   40:anewarray       Object[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:aload_0         
	//   23   46:getfield        #29  <Field String val$loginProvider>
	//   24   49:aastore         
	//   25   50:dup             
	//   26   51:iconst_1        
	//   27   52:aload_2         
	//   28   53:invokevirtual   #49  <Method com.gigya.socialize.GSObject GSResponse.getData()>
	//   29   56:aastore         
	//   30   57:dup             
	//   31   58:iconst_2        
	//   32   59:aload_3         
	//   33   60:aastore         
	//   34   61:invokevirtual   #53  <Method void GSAPI.invokeSocializeListeners(String, Object[])>
	//   35   64:return          
	}

	final GSAPI this$0;
	final String val$loginProvider;
	final boolean val$sessionChanged;
	final GSResponseListener val$userInfoListener;

	GSAPI$1()
	{
		this$0 = final_gsapi;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field GSAPI this$0>
		val$userInfoListener = gsresponselistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field GSResponseListener val$userInfoListener>
		val$sessionChanged = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #27  <Field boolean val$sessionChanged>
		val$loginProvider = String.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field String val$loginProvider>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
