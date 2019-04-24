// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import java.io.IOException;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.exoplayer2.source:
//			ClippingMediaSource

public static final class ClippingMediaSource$IllegalClippingException extends IOException
{
	public static interface Reason
		extends Annotation
	{
	}


	private static String getReasonDescription(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 37
	//	               1 34
	//	               2 31
		default:
			return "unknown";
	//    2   28:ldc1            #47  <String "unknown">
	//    3   30:areturn         

		case 2: // '\002'
			return "start exceeds end";
	//    4   31:ldc1            #49  <String "start exceeds end">
	//    5   33:areturn         

		case 1: // '\001'
			return "not seekable to start";
	//    6   34:ldc1            #51  <String "not seekable to start">
	//    7   36:areturn         

		case 0: // '\0'
			return "invalid period count";
	//    8   37:ldc1            #53  <String "invalid period count">
	//    9   39:areturn         
		}
	}

	public static final int REASON_INVALID_PERIOD_COUNT = 0;
	public static final int REASON_NOT_SEEKABLE_TO_START = 1;
	public static final int REASON_START_EXCEEDS_END = 2;
	public final int reason;

	public ClippingMediaSource$IllegalClippingException(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #22  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Illegal clipping: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #27  <String "Illegal clipping: ">
	//    6   11:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getReasonDescription(i));
	//    8   15:aload_2         
	//    9   16:iload_1         
	//   10   17:invokestatic    #35  <Method String getReasonDescription(int)>
	//   11   20:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		super(stringbuilder.toString());
	//   13   24:aload_0         
	//   14   25:aload_2         
	//   15   26:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   16   29:invokespecial   #42  <Method void IOException(String)>
		reason = i;
	//   17   32:aload_0         
	//   18   33:iload_1         
	//   19   34:putfield        #44  <Field int reason>
	//   20   37:return          
	}
}
