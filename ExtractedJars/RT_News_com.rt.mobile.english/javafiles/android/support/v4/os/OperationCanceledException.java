// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;


public class OperationCanceledException extends RuntimeException
{

	public OperationCanceledException()
	{
		this(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #9   <Method void OperationCanceledException(String)>
	//    3    5:return          
	}

	public OperationCanceledException(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          7
	//*   2    4:goto            10
			s = "The operation has been canceled.";
	//    3    7:ldc1            #12  <String "The operation has been canceled.">
	//    4    9:astore_1        
		super(s);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokespecial   #13  <Method void RuntimeException(String)>
	//    8   15:return          
	}
}
