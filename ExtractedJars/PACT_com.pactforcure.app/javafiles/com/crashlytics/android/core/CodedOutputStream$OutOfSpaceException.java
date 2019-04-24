// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//			CodedOutputStream

static class CodedOutputStream$OutOfSpaceException extends IOException
{

	private static final long serialVersionUID = 0x52ce6e25L;

	CodedOutputStream$OutOfSpaceException()
	{
		super("CodedOutputStream was writing to a flat byte array and ran out of space.");
	//    0    0:aload_0         
	//    1    1:ldc1            #15  <String "CodedOutputStream was writing to a flat byte array and ran out of space.">
	//    2    3:invokespecial   #18  <Method void IOException(String)>
	//    3    6:return          
	}
}
