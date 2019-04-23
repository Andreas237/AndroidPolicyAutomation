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
		List list;
		for(to = ((List) (new ArrayList())); bundle.containsKey(String.format("to[%d]", new Object[] {
	Integer.valueOf(to.size())
})); list.add(((Object) (bundle.getString(String.format("to[%d]", new Object[] {
	Integer.valueOf(list.size())
}))))))
	//*   7   14:aload_0         
	//*   8   15:new             #29  <Class ArrayList>
	//*   9   18:dup             
	//*  10   19:invokespecial   #30  <Method void ArrayList()>
	//*  11   22:putfield        #32  <Field List to>
	//*  12   25:aload_1         
	//*  13   26:ldc1            #34  <String "to[%d]">
	//*  14   28:iconst_1        
	//*  15   29:anewarray       Object[]
	//*  16   32:dup             
	//*  17   33:iconst_0        
	//*  18   34:aload_0         
	//*  19   35:getfield        #32  <Field List to>
	//*  20   38:invokeinterface #40  <Method int List.size()>
	//*  21   43:invokestatic    #46  <Method Integer Integer.valueOf(int)>
	//*  22   46:aastore         
	//*  23   47:invokestatic    #52  <Method String String.format(String, Object[])>
	//*  24   50:invokevirtual   #56  <Method boolean Bundle.containsKey(String)>
	//*  25   53:ifeq            96
			list = to;
	//   26   56:aload_0         
	//   27   57:getfield        #32  <Field List to>
	//   28   60:astore_2        

	//   29   61:aload_2         
	//   30   62:aload_1         
	//   31   63:ldc1            #34  <String "to[%d]">
	//   32   65:iconst_1        
	//   33   66:anewarray       Object[]
	//   34   69:dup             
	//   35   70:iconst_0        
	//   36   71:aload_2         
	//   37   72:invokeinterface #40  <Method int List.size()>
	//   38   77:invokestatic    #46  <Method Integer Integer.valueOf(int)>
	//   39   80:aastore         
	//   40   81:invokestatic    #52  <Method String String.format(String, Object[])>
	//   41   84:invokevirtual   #25  <Method String Bundle.getString(String)>
	//   42   87:invokeinterface #60  <Method boolean List.add(Object)>
	//   43   92:pop             
	//*  44   93:goto            25
	//   45   96:return          
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
