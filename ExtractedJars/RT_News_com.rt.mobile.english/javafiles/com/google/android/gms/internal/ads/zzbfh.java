// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzbfh extends IOException
{

	public zzbfh(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void IOException(String)>
	//    3    5:return          
	}

	static zzbfh zzagq()
	{
		return new zzbfh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
	//    0    0:new             #2   <Class zzbfh>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.">
	//    3    6:invokespecial   #14  <Method void zzbfh(String)>
	//    4    9:areturn         
	}

	static zzbfh zzagr()
	{
		return new zzbfh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
	//    0    0:new             #2   <Class zzbfh>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "CodedInputStream encountered an embedded string or message which claimed to have negative size.">
	//    3    6:invokespecial   #14  <Method void zzbfh(String)>
	//    4    9:areturn         
	}

	static zzbfh zzags()
	{
		return new zzbfh("CodedInputStream encountered a malformed varint.");
	//    0    0:new             #2   <Class zzbfh>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "CodedInputStream encountered a malformed varint.">
	//    3    6:invokespecial   #14  <Method void zzbfh(String)>
	//    4    9:areturn         
	}
}
