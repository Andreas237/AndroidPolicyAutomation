// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util.extensions;

import com.google.android.exoplayer.SampleHolder;

// Referenced classes of package com.google.android.exoplayer.util.extensions:
//			Buffer

public class InputBuffer extends Buffer
{

	public InputBuffer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Buffer()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class SampleHolder>
	//    4    8:dup             
	//    5    9:iconst_2        
	//    6   10:invokespecial   #15  <Method void SampleHolder(int)>
	//    7   13:putfield        #17  <Field SampleHolder sampleHolder>
	//    8   16:return          
	}

	public void reset()
	{
		super.reset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Buffer.reset()>
		sampleHolder.clearData();
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field SampleHolder sampleHolder>
	//    4    8:invokevirtual   #24  <Method void SampleHolder.clearData()>
	//    5   11:return          
	}

	public final SampleHolder sampleHolder = new SampleHolder(2);
}
