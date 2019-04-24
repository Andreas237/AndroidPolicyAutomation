// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


// Referenced classes of package com.facebook:
//			FacebookException

public class FacebookDialogException extends FacebookException
{

	public FacebookDialogException(String s, int i, String s1)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void FacebookException(String)>
		errorCode = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #19  <Field int errorCode>
		failingUrl = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #21  <Field String failingUrl>
	//    9   15:return          
	}

	public int getErrorCode()
	{
		return errorCode;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int errorCode>
	//    2    4:ireturn         
	}

	public String getFailingUrl()
	{
		return failingUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String failingUrl>
	//    2    4:areturn         
	}

	public final String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #29  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("{FacebookDialogException: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #34  <String "{FacebookDialogException: ">
	//    6   11:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("errorCode: ");
	//    8   15:aload_1         
	//    9   16:ldc1            #40  <String "errorCode: ">
	//   10   18:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(getErrorCode());
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #42  <Method int getErrorCode()>
	//   15   27:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
	//   16   30:pop             
		stringbuilder.append(", message: ");
	//   17   31:aload_1         
	//   18   32:ldc1            #47  <String ", message: ">
	//   19   34:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(getMessage());
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:invokevirtual   #50  <Method String getMessage()>
	//   24   43:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(", url: ");
	//   26   47:aload_1         
	//   27   48:ldc1            #52  <String ", url: ">
	//   28   50:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
		stringbuilder.append(getFailingUrl());
	//   30   54:aload_1         
	//   31   55:aload_0         
	//   32   56:invokevirtual   #54  <Method String getFailingUrl()>
	//   33   59:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append("}");
	//   35   63:aload_1         
	//   36   64:ldc1            #56  <String "}">
	//   37   66:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   38   69:pop             
		return stringbuilder.toString();
	//   39   70:aload_1         
	//   40   71:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   41   74:areturn         
	}

	static final long serialVersionUID = 1L;
	private int errorCode;
	private String failingUrl;
}
