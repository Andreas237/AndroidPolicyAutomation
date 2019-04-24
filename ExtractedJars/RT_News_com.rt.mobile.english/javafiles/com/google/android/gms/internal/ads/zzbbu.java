// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbv, zzbcu

public class zzbbu extends IOException
{

	public zzbbu(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void IOException(String)>
		zzdut = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #12  <Field zzbcu zzdut>
	//    6   10:return          
	}

	static zzbbu zzadl()
	{
		return new zzbbu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
	//    0    0:new             #2   <Class zzbbu>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.">
	//    3    6:invokespecial   #18  <Method void zzbbu(String)>
	//    4    9:areturn         
	}

	static zzbbu zzadm()
	{
		return new zzbbu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
	//    0    0:new             #2   <Class zzbbu>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "CodedInputStream encountered an embedded string or message which claimed to have negative size.">
	//    3    6:invokespecial   #18  <Method void zzbbu(String)>
	//    4    9:areturn         
	}

	static zzbbu zzadn()
	{
		return new zzbbu("CodedInputStream encountered a malformed varint.");
	//    0    0:new             #2   <Class zzbbu>
	//    1    3:dup             
	//    2    4:ldc1            #24  <String "CodedInputStream encountered a malformed varint.">
	//    3    6:invokespecial   #18  <Method void zzbbu(String)>
	//    4    9:areturn         
	}

	static zzbbu zzado()
	{
		return new zzbbu("Protocol message contained an invalid tag (zero).");
	//    0    0:new             #2   <Class zzbbu>
	//    1    3:dup             
	//    2    4:ldc1            #27  <String "Protocol message contained an invalid tag (zero).">
	//    3    6:invokespecial   #18  <Method void zzbbu(String)>
	//    4    9:areturn         
	}

	static zzbbu zzadp()
	{
		return new zzbbu("Protocol message end-group tag did not match expected tag.");
	//    0    0:new             #2   <Class zzbbu>
	//    1    3:dup             
	//    2    4:ldc1            #30  <String "Protocol message end-group tag did not match expected tag.">
	//    3    6:invokespecial   #18  <Method void zzbbu(String)>
	//    4    9:areturn         
	}

	static zzbbv zzadq()
	{
		return new zzbbv("Protocol message tag had invalid wire type.");
	//    0    0:new             #34  <Class zzbbv>
	//    1    3:dup             
	//    2    4:ldc1            #36  <String "Protocol message tag had invalid wire type.">
	//    3    6:invokespecial   #37  <Method void zzbbv(String)>
	//    4    9:areturn         
	}

	static zzbbu zzadr()
	{
		return new zzbbu("Failed to parse the message.");
	//    0    0:new             #2   <Class zzbbu>
	//    1    3:dup             
	//    2    4:ldc1            #40  <String "Failed to parse the message.">
	//    3    6:invokespecial   #18  <Method void zzbbu(String)>
	//    4    9:areturn         
	}

	static zzbbu zzads()
	{
		return new zzbbu("Protocol message had invalid UTF-8.");
	//    0    0:new             #2   <Class zzbbu>
	//    1    3:dup             
	//    2    4:ldc1            #43  <String "Protocol message had invalid UTF-8.">
	//    3    6:invokespecial   #18  <Method void zzbbu(String)>
	//    4    9:areturn         
	}

	public final zzbbu zzj(zzbcu zzbcu)
	{
		zzdut = zzbcu;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzbcu zzdut>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private zzbcu zzdut;
}
