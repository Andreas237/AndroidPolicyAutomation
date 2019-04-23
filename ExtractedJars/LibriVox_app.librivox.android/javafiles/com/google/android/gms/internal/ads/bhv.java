// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bhu

public final class bhv extends Exception
{

	private bhv(Throwable throwable)
	{
		super("Failed to query underlying media codecs", throwable);
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "Failed to query underlying media codecs">
	//    2    3:aload_1         
	//    3    4:invokespecial   #11  <Method void Exception(String, Throwable)>
	//    4    7:return          
	}

	bhv(Throwable throwable, bhu bhu)
	{
		this(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void bhv(Throwable)>
	//    3    5:return          
	}
}
