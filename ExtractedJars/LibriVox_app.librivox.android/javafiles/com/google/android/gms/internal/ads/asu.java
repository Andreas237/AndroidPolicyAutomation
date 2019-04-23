// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			asv, atv

public class asu extends IOException
{

	public asu(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void IOException(String)>
		a = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #12  <Field atv a>
	//    6   10:return          
	}

	static asu a()
	{
		return new asu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
	//    0    0:new             #2   <Class asu>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.">
	//    3    6:invokespecial   #17  <Method void asu(String)>
	//    4    9:areturn         
	}

	static asu b()
	{
		return new asu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
	//    0    0:new             #2   <Class asu>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "CodedInputStream encountered an embedded string or message which claimed to have negative size.">
	//    3    6:invokespecial   #17  <Method void asu(String)>
	//    4    9:areturn         
	}

	static asu c()
	{
		return new asu("CodedInputStream encountered a malformed varint.");
	//    0    0:new             #2   <Class asu>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "CodedInputStream encountered a malformed varint.">
	//    3    6:invokespecial   #17  <Method void asu(String)>
	//    4    9:areturn         
	}

	static asu d()
	{
		return new asu("Protocol message contained an invalid tag (zero).");
	//    0    0:new             #2   <Class asu>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "Protocol message contained an invalid tag (zero).">
	//    3    6:invokespecial   #17  <Method void asu(String)>
	//    4    9:areturn         
	}

	static asu e()
	{
		return new asu("Protocol message end-group tag did not match expected tag.");
	//    0    0:new             #2   <Class asu>
	//    1    3:dup             
	//    2    4:ldc1            #29  <String "Protocol message end-group tag did not match expected tag.">
	//    3    6:invokespecial   #17  <Method void asu(String)>
	//    4    9:areturn         
	}

	static asv f()
	{
		return new asv("Protocol message tag had invalid wire type.");
	//    0    0:new             #33  <Class asv>
	//    1    3:dup             
	//    2    4:ldc1            #35  <String "Protocol message tag had invalid wire type.">
	//    3    6:invokespecial   #36  <Method void asv(String)>
	//    4    9:areturn         
	}

	static asu g()
	{
		return new asu("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
	//    0    0:new             #2   <Class asu>
	//    1    3:dup             
	//    2    4:ldc1            #39  <String "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.">
	//    3    6:invokespecial   #17  <Method void asu(String)>
	//    4    9:areturn         
	}

	static asu h()
	{
		return new asu("Failed to parse the message.");
	//    0    0:new             #2   <Class asu>
	//    1    3:dup             
	//    2    4:ldc1            #42  <String "Failed to parse the message.">
	//    3    6:invokespecial   #17  <Method void asu(String)>
	//    4    9:areturn         
	}

	static asu i()
	{
		return new asu("Protocol message had invalid UTF-8.");
	//    0    0:new             #2   <Class asu>
	//    1    3:dup             
	//    2    4:ldc1            #45  <String "Protocol message had invalid UTF-8.">
	//    3    6:invokespecial   #17  <Method void asu(String)>
	//    4    9:areturn         
	}

	public final asu a(atv atv)
	{
		a = atv;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field atv a>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private atv a;
}
