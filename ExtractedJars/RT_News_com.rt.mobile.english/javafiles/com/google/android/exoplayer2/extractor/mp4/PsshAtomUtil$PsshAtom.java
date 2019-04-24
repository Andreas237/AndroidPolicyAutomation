// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import java.util.UUID;

// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			PsshAtomUtil

private static class PsshAtomUtil$PsshAtom
{

	private final byte schemeData[];
	private final UUID uuid;
	private final int version;


/*
	static UUID access$000(PsshAtomUtil$PsshAtom psshatomutil$psshatom)
	{
		return psshatomutil$psshatom.uuid;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field UUID uuid>
	//    2    4:areturn         
	}

*/


/*
	static int access$100(PsshAtomUtil$PsshAtom psshatomutil$psshatom)
	{
		return psshatomutil$psshatom.version;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int version>
	//    2    4:ireturn         
	}

*/


/*
	static byte[] access$200(PsshAtomUtil$PsshAtom psshatomutil$psshatom)
	{
		return psshatomutil$psshatom.schemeData;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field byte[] schemeData>
	//    2    4:areturn         
	}

*/

	public PsshAtomUtil$PsshAtom(UUID uuid1, int i, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		uuid = uuid1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field UUID uuid>
		version = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field int version>
		schemeData = abyte0;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field byte[] schemeData>
	//   11   19:return          
	}
}
