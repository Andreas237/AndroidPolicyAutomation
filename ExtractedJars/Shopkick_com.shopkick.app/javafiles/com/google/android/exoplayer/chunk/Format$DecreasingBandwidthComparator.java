// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;

import java.util.Comparator;

// Referenced classes of package com.google.android.exoplayer.chunk:
//			Format

public static final class Format$DecreasingBandwidthComparator
	implements Comparator
{

	public int compare(Format format, Format format1)
	{
		return format1.bitrate - format.bitrate;
	//    0    0:aload_2         
	//    1    1:getfield        #21  <Field int Format.bitrate>
	//    2    4:aload_1         
	//    3    5:getfield        #21  <Field int Format.bitrate>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((Format)obj, (Format)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class Format>
	//    3    5:aload_2         
	//    4    6:checkcast       #9   <Class Format>
	//    5    9:invokevirtual   #24  <Method int compare(Format, Format)>
	//    6   12:ireturn         
	}

	public Format$DecreasingBandwidthComparator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
