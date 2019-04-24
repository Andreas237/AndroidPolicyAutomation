// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;


// Referenced classes of package com.google.android.gms.common.api:
//			Status

public class ApiException extends Exception
{

	public ApiException(Status status)
	{
		int i = status.getStatusCode();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #15  <Method int Status.getStatusCode()>
	//    2    4:istore_2        
		String s;
		if(status.getStatusMessage() != null)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #19  <Method String Status.getStatusMessage()>
	//*   5    9:ifnull          20
			s = status.getStatusMessage();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #19  <Method String Status.getStatusMessage()>
	//    8   16:astore_3        
		else
	//*   9   17:goto            23
			s = "";
	//   10   20:ldc1            #21  <String "">
	//   11   22:astore_3        
		StringBuilder stringbuilder = new StringBuilder(13 + String.valueOf(((Object) (s))).length());
	//   12   23:new             #23  <Class StringBuilder>
	//   13   26:dup             
	//   14   27:bipush          13
	//   15   29:aload_3         
	//   16   30:invokestatic    #29  <Method String String.valueOf(Object)>
	//   17   33:invokevirtual   #32  <Method int String.length()>
	//   18   36:iadd            
	//   19   37:invokespecial   #35  <Method void StringBuilder(int)>
	//   20   40:astore          4
		stringbuilder.append(i);
	//   21   42:aload           4
	//   22   44:iload_2         
	//   23   45:invokevirtual   #39  <Method StringBuilder StringBuilder.append(int)>
	//   24   48:pop             
		stringbuilder.append(": ");
	//   25   49:aload           4
	//   26   51:ldc1            #41  <String ": ">
	//   27   53:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
		stringbuilder.append(s);
	//   29   57:aload           4
	//   30   59:aload_3         
	//   31   60:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   32   63:pop             
		super(stringbuilder.toString());
	//   33   64:aload_0         
	//   34   65:aload           4
	//   35   67:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   36   70:invokespecial   #50  <Method void Exception(String)>
		mStatus = status;
	//   37   73:aload_0         
	//   38   74:aload_1         
	//   39   75:putfield        #52  <Field Status mStatus>
	//   40   78:return          
	}

	public int getStatusCode()
	{
		return mStatus.getStatusCode();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Status mStatus>
	//    2    4:invokevirtual   #15  <Method int Status.getStatusCode()>
	//    3    7:ireturn         
	}

	public String getStatusMessage()
	{
		return mStatus.getStatusMessage();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Status mStatus>
	//    2    4:invokevirtual   #19  <Method String Status.getStatusMessage()>
	//    3    7:areturn         
	}

	protected final Status mStatus;
}
