// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcp, zzdo

public class zzco extends IOException
{

	public zzco(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void IOException(String)>
		zzkw = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #12  <Field zzdo zzkw>
	//    6   10:return          
	}

	static zzco zzbl()
	{
		return new zzco("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
	//    0    0:new             #2   <Class zzco>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.">
	//    3    6:invokespecial   #18  <Method void zzco(String)>
	//    4    9:areturn         
	}

	static zzco zzbm()
	{
		return new zzco("Protocol message contained an invalid tag (zero).");
	//    0    0:new             #2   <Class zzco>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "Protocol message contained an invalid tag (zero).">
	//    3    6:invokespecial   #18  <Method void zzco(String)>
	//    4    9:areturn         
	}

	static zzcp zzbn()
	{
		return new zzcp("Protocol message tag had invalid wire type.");
	//    0    0:new             #25  <Class zzcp>
	//    1    3:dup             
	//    2    4:ldc1            #27  <String "Protocol message tag had invalid wire type.">
	//    3    6:invokespecial   #28  <Method void zzcp(String)>
	//    4    9:areturn         
	}

	static zzco zzbo()
	{
		return new zzco("Failed to parse the message.");
	//    0    0:new             #2   <Class zzco>
	//    1    3:dup             
	//    2    4:ldc1            #31  <String "Failed to parse the message.">
	//    3    6:invokespecial   #18  <Method void zzco(String)>
	//    4    9:areturn         
	}

	static zzco zzbp()
	{
		return new zzco("Protocol message had invalid UTF-8.");
	//    0    0:new             #2   <Class zzco>
	//    1    3:dup             
	//    2    4:ldc1            #34  <String "Protocol message had invalid UTF-8.">
	//    3    6:invokespecial   #18  <Method void zzco(String)>
	//    4    9:areturn         
	}

	public final zzco zzg(zzdo zzdo)
	{
		zzkw = zzdo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzdo zzkw>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private zzdo zzkw;
}
