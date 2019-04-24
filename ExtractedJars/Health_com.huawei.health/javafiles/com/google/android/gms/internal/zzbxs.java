// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

public class zzbxs extends IOException
{

	public zzbxs(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void IOException(String)>
	//    3    5:return          
	}

	static zzbxs zzaeL()
	{
		return new zzbxs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
	//    0    0:new             #2   <Class zzbxs>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.">
	//    3    6:invokespecial   #14  <Method void zzbxs(String)>
	//    4    9:areturn         
	}

	static zzbxs zzaeM()
	{
		return new zzbxs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
	//    0    0:new             #2   <Class zzbxs>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "CodedInputStream encountered an embedded string or message which claimed to have negative size.">
	//    3    6:invokespecial   #14  <Method void zzbxs(String)>
	//    4    9:areturn         
	}

	static zzbxs zzaeN()
	{
		return new zzbxs("CodedInputStream encountered a malformed varint.");
	//    0    0:new             #2   <Class zzbxs>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "CodedInputStream encountered a malformed varint.">
	//    3    6:invokespecial   #14  <Method void zzbxs(String)>
	//    4    9:areturn         
	}

	static zzbxs zzaeO()
	{
		return new zzbxs("Protocol message contained an invalid tag (zero).");
	//    0    0:new             #2   <Class zzbxs>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "Protocol message contained an invalid tag (zero).">
	//    3    6:invokespecial   #14  <Method void zzbxs(String)>
	//    4    9:areturn         
	}

	static zzbxs zzaeP()
	{
		return new zzbxs("Protocol message end-group tag did not match expected tag.");
	//    0    0:new             #2   <Class zzbxs>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "Protocol message end-group tag did not match expected tag.">
	//    3    6:invokespecial   #14  <Method void zzbxs(String)>
	//    4    9:areturn         
	}

	static zzbxs zzaeQ()
	{
		return new zzbxs("Protocol message tag had invalid wire type.");
	//    0    0:new             #2   <Class zzbxs>
	//    1    3:dup             
	//    2    4:ldc1            #29  <String "Protocol message tag had invalid wire type.">
	//    3    6:invokespecial   #14  <Method void zzbxs(String)>
	//    4    9:areturn         
	}

	static zzbxs zzaeR()
	{
		return new zzbxs("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
	//    0    0:new             #2   <Class zzbxs>
	//    1    3:dup             
	//    2    4:ldc1            #32  <String "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.">
	//    3    6:invokespecial   #14  <Method void zzbxs(String)>
	//    4    9:areturn         
	}
}
