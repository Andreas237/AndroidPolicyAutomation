// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector;


// Referenced classes of package com.facebook.stetho.inspector:
//			MessageHandlingException

public class MismatchedResponseException extends MessageHandlingException
{

	public MismatchedResponseException(long l)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #10  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("Response for request id ");
	//    4    8:aload_3         
	//    5    9:ldc1            #15  <String "Response for request id ">
	//    6   11:invokevirtual   #19  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(l);
	//    8   15:aload_3         
	//    9   16:lload_1         
	//   10   17:invokevirtual   #22  <Method StringBuilder StringBuilder.append(long)>
	//   11   20:pop             
		stringbuilder.append(", but no such request is pending");
	//   12   21:aload_3         
	//   13   22:ldc1            #24  <String ", but no such request is pending">
	//   14   24:invokevirtual   #19  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		super(stringbuilder.toString());
	//   16   28:aload_0         
	//   17   29:aload_3         
	//   18   30:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   19   33:invokespecial   #31  <Method void MessageHandlingException(String)>
		mRequestId = l;
	//   20   36:aload_0         
	//   21   37:lload_1         
	//   22   38:putfield        #33  <Field long mRequestId>
	//   23   41:return          
	}

	public long getRequestId()
	{
		return mRequestId;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field long mRequestId>
	//    2    4:lreturn         
	}

	public long mRequestId;
}
