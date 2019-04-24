// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.GSResponse;
import com.gigya.socialize.GSResponseListener;

// Referenced classes of package com.gigya.socialize.android:
//			GSAPI

class GSAPI$2
	implements GSResponseListener
{

	public void onGSResponse(String s, GSResponse gsresponse, Object obj)
	{
		if(gsresponse.getErrorCode() == 0 && val$sessionChanged)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #33  <Method int GSResponse.getErrorCode()>
	//*   2    4:ifne            38
	//*   3    7:aload_0         
	//*   4    8:getfield        #21  <Field boolean val$sessionChanged>
	//*   5   11:ifeq            38
			invokeAccountsListeners("login", new Object[] {
				gsresponse.getData(), obj
			});
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field GSAPI this$0>
	//    8   18:ldc1            #35  <String "login">
	//    9   20:iconst_2        
	//   10   21:anewarray       Object[]
	//   11   24:dup             
	//   12   25:iconst_0        
	//   13   26:aload_2         
	//   14   27:invokevirtual   #39  <Method com.gigya.socialize.GSObject GSResponse.getData()>
	//   15   30:aastore         
	//   16   31:dup             
	//   17   32:iconst_1        
	//   18   33:aload_3         
	//   19   34:aastore         
	//   20   35:invokevirtual   #43  <Method void GSAPI.invokeAccountsListeners(String, Object[])>
	//   21   38:return          
	}

	final GSAPI this$0;
	final boolean val$sessionChanged;

	GSAPI$2()
	{
		this$0 = final_gsapi;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GSAPI this$0>
		val$sessionChanged = Z.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean val$sessionChanged>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
