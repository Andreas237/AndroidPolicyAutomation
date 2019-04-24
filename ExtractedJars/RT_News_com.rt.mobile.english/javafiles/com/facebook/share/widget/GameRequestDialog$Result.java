// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.share.widget:
//			GameRequestDialog

public static final class GameRequestDialog$Result
{

	public String getRequestId()
	{
		return requestId;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String requestId>
	//    2    4:areturn         
	}

	public List getRequestRecipients()
	{
		return to;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field List to>
	//    2    4:areturn         
	}

	String requestId;
	List to;

	private GameRequestDialog$Result(Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		requestId = bundle.getString("request");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #19  <String "request">
	//    5    8:invokevirtual   #25  <Method String Bundle.getString(String)>
	//    6   11:putfield        #27  <Field String requestId>
		for(to = ((List) (new ArrayList())); bundle.containsKey(String.format("to[%d]", new Object[] {
	Integer.valueOf(to.size())
})); to.add(((Object) (bundle.getString(String.format("to[%d]", new Object[] {
	Integer.valueOf(to.size())
}))))));
	//    7   14:aload_0         
	//    8   15:new             #29  <Class ArrayList>
	//    9   18:dup             
	//   10   19:invokespecial   #30  <Method void ArrayList()>
	//   11   22:putfield        #32  <Field List to>
	//   12   25:aload_1         
	//   13   26:ldc1            #34  <String "to[%d]">
	//   14   28:iconst_1        
	//   15   29:anewarray       Object[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:aload_0         
	//   19   35:getfield        #32  <Field List to>
	//   20   38:invokeinterface #40  <Method int List.size()>
	//   21   43:invokestatic    #46  <Method Integer Integer.valueOf(int)>
	//   22   46:aastore         
	//   23   47:invokestatic    #52  <Method String String.format(String, Object[])>
	//   24   50:invokevirtual   #56  <Method boolean Bundle.containsKey(String)>
	//   25   53:ifeq            97
	//   26   56:aload_0         
	//   27   57:getfield        #32  <Field List to>
	//   28   60:aload_1         
	//   29   61:ldc1            #34  <String "to[%d]">
	//   30   63:iconst_1        
	//   31   64:anewarray       Object[]
	//   32   67:dup             
	//   33   68:iconst_0        
	//   34   69:aload_0         
	//   35   70:getfield        #32  <Field List to>
	//   36   73:invokeinterface #40  <Method int List.size()>
	//   37   78:invokestatic    #46  <Method Integer Integer.valueOf(int)>
	//   38   81:aastore         
	//   39   82:invokestatic    #52  <Method String String.format(String, Object[])>
	//   40   85:invokevirtual   #25  <Method String Bundle.getString(String)>
	//   41   88:invokeinterface #60  <Method boolean List.add(Object)>
	//   42   93:pop             
	//*  43   94:goto            25
	//   44   97:return          
	}

	GameRequestDialog$Result(Bundle bundle, GameRequestDialog._cls1 _pcls1)
	{
		this(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #64  <Method void GameRequestDialog$Result(Bundle)>
	//    3    5:return          
	}
}
