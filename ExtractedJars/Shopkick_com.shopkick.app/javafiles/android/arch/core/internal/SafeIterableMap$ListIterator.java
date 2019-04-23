// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.core.internal;

import java.util.Iterator;

// Referenced classes of package android.arch.core.internal:
//			SafeIterableMap

private static abstract class SafeIterableMap$ListIterator
	implements Iterator, 
{

	private SafeIterableMap.Entry nextNode()
	{
		SafeIterableMap.Entry entry = mNext;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field SafeIterableMap$Entry mNext>
	//    2    4:astore_1        
		SafeIterableMap.Entry entry1 = mExpectedEnd;
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field SafeIterableMap$Entry mExpectedEnd>
	//    5    9:astore_2        
		if(entry != entry1 && entry1 != null)
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:if_acmpeq       28
	//*   9   15:aload_2         
	//*  10   16:ifnonnull       22
	//*  11   19:goto            28
			return forward(entry);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #34  <Method SafeIterableMap$Entry forward(SafeIterableMap$Entry)>
	//   15   27:areturn         
		else
			return null;
	//   16   28:aconst_null     
	//   17   29:areturn         
	}

	abstract SafeIterableMap.Entry backward(SafeIterableMap.Entry entry);

	abstract SafeIterableMap.Entry forward(SafeIterableMap.Entry entry);

	public boolean hasNext()
	{
		return mNext != null;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field SafeIterableMap$Entry mNext>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public volatile Object next()
	{
		return ((Object) (next()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method java.util.Map$Entry next()>
	//    2    4:areturn         
	}

	public java.util.Map.Entry next()
	{
		SafeIterableMap.Entry entry = mNext;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field SafeIterableMap$Entry mNext>
	//    2    4:astore_1        
		mNext = nextNode();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokespecial   #45  <Method SafeIterableMap$Entry nextNode()>
	//    6   10:putfield        #25  <Field SafeIterableMap$Entry mNext>
		return ((java.util.Map.Entry) (entry));
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public void supportRemove(SafeIterableMap.Entry entry)
	{
		if(mExpectedEnd == entry && entry == mNext)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field SafeIterableMap$Entry mExpectedEnd>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       26
	//*   4    8:aload_1         
	//*   5    9:aload_0         
	//*   6   10:getfield        #25  <Field SafeIterableMap$Entry mNext>
	//*   7   13:if_acmpne       26
		{
			mNext = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #25  <Field SafeIterableMap$Entry mNext>
			mExpectedEnd = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #23  <Field SafeIterableMap$Entry mExpectedEnd>
		}
		SafeIterableMap.Entry entry1 = mExpectedEnd;
	//   14   26:aload_0         
	//   15   27:getfield        #23  <Field SafeIterableMap$Entry mExpectedEnd>
	//   16   30:astore_2        
		if(entry1 == entry)
	//*  17   31:aload_2         
	//*  18   32:aload_1         
	//*  19   33:if_acmpne       45
			mExpectedEnd = backward(entry1);
	//   20   36:aload_0         
	//   21   37:aload_0         
	//   22   38:aload_2         
	//   23   39:invokevirtual   #51  <Method SafeIterableMap$Entry backward(SafeIterableMap$Entry)>
	//   24   42:putfield        #23  <Field SafeIterableMap$Entry mExpectedEnd>
		if(mNext == entry)
	//*  25   45:aload_0         
	//*  26   46:getfield        #25  <Field SafeIterableMap$Entry mNext>
	//*  27   49:aload_1         
	//*  28   50:if_acmpne       61
			mNext = nextNode();
	//   29   53:aload_0         
	//   30   54:aload_0         
	//   31   55:invokespecial   #45  <Method SafeIterableMap$Entry nextNode()>
	//   32   58:putfield        #25  <Field SafeIterableMap$Entry mNext>
	//   33   61:return          
	}

	SafeIterableMap.Entry mExpectedEnd;
	SafeIterableMap.Entry mNext;

	SafeIterableMap$ListIterator(SafeIterableMap.Entry entry, SafeIterableMap.Entry entry1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mExpectedEnd = entry1;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #23  <Field SafeIterableMap$Entry mExpectedEnd>
		mNext = entry;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #25  <Field SafeIterableMap$Entry mNext>
	//    8   14:return          
	}
}
