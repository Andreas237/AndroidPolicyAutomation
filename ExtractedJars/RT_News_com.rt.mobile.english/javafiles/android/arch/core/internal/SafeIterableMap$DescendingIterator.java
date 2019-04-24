// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.core.internal;


// Referenced classes of package android.arch.core.internal:
//			SafeIterableMap

private static class SafeIterableMap$DescendingIterator extends SafeIterableMap.ListIterator
{

	SafeIterableMap.Entry backward(SafeIterableMap.Entry entry)
	{
		return entry.mNext;
	//    0    0:aload_1         
	//    1    1:getfield        #23  <Field SafeIterableMap$Entry SafeIterableMap$Entry.mNext>
	//    2    4:areturn         
	}

	SafeIterableMap.Entry forward(SafeIterableMap.Entry entry)
	{
		return entry.mPrevious;
	//    0    0:aload_1         
	//    1    1:getfield        #28  <Field SafeIterableMap$Entry SafeIterableMap$Entry.mPrevious>
	//    2    4:areturn         
	}

	SafeIterableMap$DescendingIterator(SafeIterableMap.Entry entry, SafeIterableMap.Entry entry1)
	{
		super(entry, entry1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void SafeIterableMap$ListIterator(SafeIterableMap$Entry, SafeIterableMap$Entry)>
	//    4    6:return          
	}
}
