// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;


// Referenced classes of package com.google.android.exoplayer.upstream:
//			Allocation

public interface Allocator
{

	public abstract Allocation allocate();

	public abstract void blockWhileTotalBytesAllocatedExceeds(int i)
		throws InterruptedException;

	public abstract int getIndividualAllocationLength();

	public abstract int getTotalBytesAllocated();

	public abstract void release(Allocation allocation);

	public abstract void release(Allocation aallocation[]);

	public abstract void trim(int i);
}
