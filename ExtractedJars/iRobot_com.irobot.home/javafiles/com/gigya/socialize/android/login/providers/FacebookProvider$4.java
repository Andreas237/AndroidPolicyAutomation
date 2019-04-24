// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import com.gigya.socialize.GSResponse;
import com.gigya.socialize.GSResponseListener;
import com.gigya.socialize.android.GSPermissionResultHandler;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			FacebookProvider

class FacebookProvider$4
	implements GSResponseListener
{

	public void onGSResponse(String s, GSResponse gsresponse, Object obj)
	{
		if(FacebookProvider.access$100(FacebookProvider.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field FacebookProvider this$0>
	//*   2    4:invokestatic    #27  <Method GSPermissionResultHandler FacebookProvider.access$100(FacebookProvider)>
	//*   3    7:ifnull          137
		{
			obj = ((Object) (Boolean.valueOf(true)));
	//    4   10:iconst_1        
	//    5   11:invokestatic    #33  <Method Boolean Boolean.valueOf(boolean)>
	//    6   14:astore_3        
			if(gsresponse.getErrorCode() == 0)
	//*   7   15:aload_2         
	//*   8   16:invokevirtual   #39  <Method int GSResponse.getErrorCode()>
	//*   9   19:ifne            112
			{
				gsresponse = ((GSResponse) (new ArrayList()));
	//   10   22:new             #41  <Class ArrayList>
	//   11   25:dup             
	//   12   26:invokespecial   #42  <Method void ArrayList()>
	//   13   29:astore_2        
				s = ((String) (obj));
	//   14   30:aload_3         
	//   15   31:astore_1        
				if(FacebookProvider.access$700(FacebookProvider.this) != null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #17  <Field FacebookProvider this$0>
	//*  18   36:invokestatic    #46  <Method List FacebookProvider.access$700(FacebookProvider)>
	//*  19   39:ifnull          93
				{
					List list = FacebookProvider.access$800(FacebookProvider.this, FacebookProvider.access$700(FacebookProvider.this));
	//   20   42:aload_0         
	//   21   43:getfield        #17  <Field FacebookProvider this$0>
	//   22   46:aload_0         
	//   23   47:getfield        #17  <Field FacebookProvider this$0>
	//   24   50:invokestatic    #46  <Method List FacebookProvider.access$700(FacebookProvider)>
	//   25   53:invokestatic    #50  <Method List FacebookProvider.access$800(FacebookProvider, List)>
	//   26   56:astore          4
					s = ((String) (obj));
	//   27   58:aload_3         
	//   28   59:astore_1        
					gsresponse = ((GSResponse) (list));
	//   29   60:aload           4
	//   30   62:astore_2        
					if(FacebookProvider.access$700(FacebookProvider.this).size() == list.size())
	//*  31   63:aload_0         
	//*  32   64:getfield        #17  <Field FacebookProvider this$0>
	//*  33   67:invokestatic    #46  <Method List FacebookProvider.access$700(FacebookProvider)>
	//*  34   70:invokeinterface #55  <Method int List.size()>
	//*  35   75:aload           4
	//*  36   77:invokeinterface #55  <Method int List.size()>
	//*  37   82:icmpne          93
					{
						s = ((String) (Boolean.valueOf(false)));
	//   38   85:iconst_0        
	//   39   86:invokestatic    #33  <Method Boolean Boolean.valueOf(boolean)>
	//   40   89:astore_1        
						gsresponse = ((GSResponse) (list));
	//   41   90:aload           4
	//   42   92:astore_2        
					}
				}
				FacebookProvider.access$100(FacebookProvider.this).onResult(((Boolean) (s)).booleanValue(), ((Exception) (null)), ((List) (gsresponse)));
	//   43   93:aload_0         
	//   44   94:getfield        #17  <Field FacebookProvider this$0>
	//   45   97:invokestatic    #27  <Method GSPermissionResultHandler FacebookProvider.access$100(FacebookProvider)>
	//   46  100:aload_1         
	//   47  101:invokevirtual   #59  <Method boolean Boolean.booleanValue()>
	//   48  104:aconst_null     
	//   49  105:aload_2         
	//   50  106:invokeinterface #65  <Method void GSPermissionResultHandler.onResult(boolean, Exception, List)>
				return;
	//   51  111:return          
			}
			FacebookProvider.access$100(FacebookProvider.this).onResult(false, new Exception(gsresponse.getErrorMessage()), ((List) (null)));
	//   52  112:aload_0         
	//   53  113:getfield        #17  <Field FacebookProvider this$0>
	//   54  116:invokestatic    #27  <Method GSPermissionResultHandler FacebookProvider.access$100(FacebookProvider)>
	//   55  119:iconst_0        
	//   56  120:new             #67  <Class Exception>
	//   57  123:dup             
	//   58  124:aload_2         
	//   59  125:invokevirtual   #71  <Method String GSResponse.getErrorMessage()>
	//   60  128:invokespecial   #74  <Method void Exception(String)>
	//   61  131:aconst_null     
	//   62  132:invokeinterface #65  <Method void GSPermissionResultHandler.onResult(boolean, Exception, List)>
		}
	//   63  137:return          
	}

	final FacebookProvider this$0;

	FacebookProvider$4()
	{
		this$0 = FacebookProvider.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field FacebookProvider this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
