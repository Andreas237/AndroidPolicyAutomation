// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzuw, zzvv

public class zzuv extends IOException
{

	public zzuv(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void IOException(String)>
		zzbzd = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #12  <Field zzvv zzbzd>
	//    6   10:return          
	}

	static zzuv zzwq()
	{
		return new zzuv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
	//    0    0:new             #2   <Class zzuv>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.">
	//    3    6:invokespecial   #18  <Method void zzuv(String)>
	//    4    9:areturn         
	}

	static zzuv zzwr()
	{
		return new zzuv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
	//    0    0:new             #2   <Class zzuv>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "CodedInputStream encountered an embedded string or message which claimed to have negative size.">
	//    3    6:invokespecial   #18  <Method void zzuv(String)>
	//    4    9:areturn         
	}

	static zzuv zzws()
	{
		return new zzuv("CodedInputStream encountered a malformed varint.");
	//    0    0:new             #2   <Class zzuv>
	//    1    3:dup             
	//    2    4:ldc1            #24  <String "CodedInputStream encountered a malformed varint.">
	//    3    6:invokespecial   #18  <Method void zzuv(String)>
	//    4    9:areturn         
	}

	static zzuv zzwt()
	{
		return new zzuv("Protocol message end-group tag did not match expected tag.");
	//    0    0:new             #2   <Class zzuv>
	//    1    3:dup             
	//    2    4:ldc1            #27  <String "Protocol message end-group tag did not match expected tag.">
	//    3    6:invokespecial   #18  <Method void zzuv(String)>
	//    4    9:areturn         
	}

	static zzuw zzwu()
	{
		return new zzuw("Protocol message tag had invalid wire type.");
	//    0    0:new             #31  <Class zzuw>
	//    1    3:dup             
	//    2    4:ldc1            #33  <String "Protocol message tag had invalid wire type.">
	//    3    6:invokespecial   #34  <Method void zzuw(String)>
	//    4    9:areturn         
	}

	static zzuv zzwv()
	{
		return new zzuv("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
	//    0    0:new             #2   <Class zzuv>
	//    1    3:dup             
	//    2    4:ldc1            #37  <String "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.">
	//    3    6:invokespecial   #18  <Method void zzuv(String)>
	//    4    9:areturn         
	}

	static zzuv zzww()
	{
		return new zzuv("Failed to parse the message.");
	//    0    0:new             #2   <Class zzuv>
	//    1    3:dup             
	//    2    4:ldc1            #40  <String "Failed to parse the message.">
	//    3    6:invokespecial   #18  <Method void zzuv(String)>
	//    4    9:areturn         
	}

	static zzuv zzwx()
	{
		return new zzuv("Protocol message had invalid UTF-8.");
	//    0    0:new             #2   <Class zzuv>
	//    1    3:dup             
	//    2    4:ldc1            #43  <String "Protocol message had invalid UTF-8.">
	//    3    6:invokespecial   #18  <Method void zzuv(String)>
	//    4    9:areturn         
	}

	public final zzuv zzg(zzvv zzvv)
	{
		zzbzd = zzvv;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzvv zzbzd>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private zzvv zzbzd;
}
