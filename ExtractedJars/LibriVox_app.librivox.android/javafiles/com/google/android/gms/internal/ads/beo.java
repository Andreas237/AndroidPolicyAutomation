// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class beo extends Exception
{

	public beo(int i)
	{
		StringBuilder stringbuilder = new StringBuilder(36);
	//    0    0:new             #10  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          36
	//    3    6:invokespecial   #12  <Method void StringBuilder(int)>
	//    4    9:astore_2        
		stringbuilder.append("AudioTrack write failed: ");
	//    5   10:aload_2         
	//    6   11:ldc1            #14  <String "AudioTrack write failed: ">
	//    7   13:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(i);
	//    9   17:aload_2         
	//   10   18:iload_1         
	//   11   19:invokevirtual   #21  <Method StringBuilder StringBuilder.append(int)>
	//   12   22:pop             
		super(stringbuilder.toString());
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:invokevirtual   #25  <Method String StringBuilder.toString()>
	//   16   28:invokespecial   #28  <Method void Exception(String)>
		a = i;
	//   17   31:aload_0         
	//   18   32:iload_1         
	//   19   33:putfield        #30  <Field int a>
	//   20   36:return          
	}

	private final int a;
}
