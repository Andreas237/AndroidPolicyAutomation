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
	//*   1    1:ifnull          10
	//*   2    4:aload_0         
	//*   3    5:aload_1         
	//*   4    6:invokespecial   #11  <Method void RuntimeException(String)>
	//*   5    9:return          
			s = "The operation has been canceled.";
	//    6   10:ldc1            #13  <String "The operation has been canceled.">
	//    7   12:astore_1        
		super(s);
	//*   8   13:goto            4
	}
}
