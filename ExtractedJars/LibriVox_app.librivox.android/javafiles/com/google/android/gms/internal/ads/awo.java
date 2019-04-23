// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class awo extends IOException
{

	public awo(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void IOException(String)>
	//    3    5:return          
	}

	public awo(String s, Exception exception)
	{
		super(s, ((Throwable) (exception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #13  <Method void IOException(String, Throwable)>
	//    4    6:return          
	}

	static awo a()
	{
		return new awo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
	//    0    0:new             #2   <Class awo>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.">
	//    3    6:invokespecial   #18  <Method void awo(String)>
	//    4    9:areturn         
	}

	static awo b()
	{
		return new awo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
	//    0    0:new             #2   <Class awo>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "CodedInputStream encountered an embedded string or message which claimed to have negative size.">
	//    3    6:invokespecial   #18  <Method void awo(String)>
	//    4    9:areturn         
	}

	static awo c()
	{
		return new awo("CodedInputStream encountered a malformed varint.");
	//    0    0:new             #2   <Class awo>
	//    1    3:dup             
	//    2    4:ldc1            #24  <String "CodedInputStream encountered a malformed varint.">
	//    3    6:invokespecial   #18  <Method void awo(String)>
	//    4    9:areturn         
	}
}
