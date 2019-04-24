// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.awsservices.b.b;

import com.amazonaws.auth.AWS4Signer;
import com.irobot.awsservices.c.c;
import java.util.Date;

// Referenced classes of package com.irobot.awsservices.b.b:
//			a

private static class a$a extends AWS4Signer
{

	public long a()
	{
		int i = com.irobot.awsservices.c.c.a().b();
	//    0    0:invokestatic    #21  <Method c c.a()>
	//    1    3:invokevirtual   #25  <Method int c.b()>
	//    2    6:istore_1        
		return (new Date()).getTime() - (long)(i * 1000);
	//    3    7:new             #27  <Class Date>
	//    4   10:dup             
	//    5   11:invokespecial   #28  <Method void Date()>
	//    6   14:invokevirtual   #31  <Method long Date.getTime()>
	//    7   17:iload_1         
	//    8   18:sipush          1000
	//    9   21:imul            
	//   10   22:i2l             
	//   11   23:lsub            
	//   12   24:lreturn         
	}

	public String c(long l)
	{
		return super.a(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #35  <Method String AWS4Signer.a(long)>
	//    3    5:areturn         
	}

	public String d(long l)
	{
		return b(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #38  <Method String b(long)>
	//    3    5:areturn         
	}

	public a$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AWS4Signer()>
	//    2    4:return          
	}

	public a$a(boolean flag)
	{
		super(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #15  <Method void AWS4Signer(boolean)>
	//    3    5:return          
	}
}
