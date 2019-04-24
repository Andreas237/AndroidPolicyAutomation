// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.upstream.Allocation;

// Referenced classes of package com.google.android.exoplayer2.source:
//			SampleQueue

private static final class SampleQueue$AllocationNode
{

	public SampleQueue$AllocationNode clear()
	{
		allocation = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #31  <Field Allocation allocation>
		SampleQueue$AllocationNode samplequeue$allocationnode = next;
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field SampleQueue$AllocationNode next>
	//    5    9:astore_1        
		next = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #33  <Field SampleQueue$AllocationNode next>
		return samplequeue$allocationnode;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public void initialize(Allocation allocation1, SampleQueue$AllocationNode samplequeue$allocationnode)
	{
		allocation = allocation1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field Allocation allocation>
		next = samplequeue$allocationnode;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #33  <Field SampleQueue$AllocationNode next>
		wasInitialized = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #37  <Field boolean wasInitialized>
	//    9   15:return          
	}

	public int translateOffset(long l)
	{
		return (int)(l - startPosition) + allocation.offset;
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field long startPosition>
	//    3    5:lsub            
	//    4    6:l2i             
	//    5    7:aload_0         
	//    6    8:getfield        #31  <Field Allocation allocation>
	//    7   11:getfield        #45  <Field int Allocation.offset>
	//    8   14:iadd            
	//    9   15:ireturn         
	}

	public Allocation allocation;
	public final long endPosition;
	public SampleQueue$AllocationNode next;
	public final long startPosition;
	public boolean wasInitialized;

	public SampleQueue$AllocationNode(long l, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		startPosition = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #24  <Field long startPosition>
		endPosition = l + (long)i;
	//    5    9:aload_0         
	//    6   10:lload_1         
	//    7   11:iload_3         
	//    8   12:i2l             
	//    9   13:ladd            
	//   10   14:putfield        #26  <Field long endPosition>
	//   11   17:return          
	}
}
