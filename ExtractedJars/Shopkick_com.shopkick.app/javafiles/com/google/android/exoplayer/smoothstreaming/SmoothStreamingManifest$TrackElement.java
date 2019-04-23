// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.smoothstreaming;

import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.chunk.FormatWrapper;

// Referenced classes of package com.google.android.exoplayer.smoothstreaming:
//			SmoothStreamingManifest

public static class SmoothStreamingManifest$TrackElement
	implements FormatWrapper
{

	public Format getFormat()
	{
		return format;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Format format>
	//    2    4:areturn         
	}

	public final byte csd[][];
	public final Format format;

	public SmoothStreamingManifest$TrackElement(int i, int j, String s, byte abyte0[][], int k, int l, int i1, 
			int j1, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		csd = abyte0;
	//    2    4:aload_0         
	//    3    5:aload           4
	//    4    7:putfield        #20  <Field byte[][] csd>
		format = new Format(String.valueOf(i), s, k, l, -1F, j1, i1, j, s1);
	//    5   10:aload_0         
	//    6   11:new             #22  <Class Format>
	//    7   14:dup             
	//    8   15:iload_1         
	//    9   16:invokestatic    #28  <Method String String.valueOf(int)>
	//   10   19:aload_3         
	//   11   20:iload           5
	//   12   22:iload           6
	//   13   24:ldc1            #29  <Float -1F>
	//   14   26:iload           8
	//   15   28:iload           7
	//   16   30:iload_2         
	//   17   31:aload           9
	//   18   33:invokespecial   #32  <Method void Format(String, String, int, int, float, int, int, int, String)>
	//   19   36:putfield        #34  <Field Format format>
	//   20   39:return          
	}
}
