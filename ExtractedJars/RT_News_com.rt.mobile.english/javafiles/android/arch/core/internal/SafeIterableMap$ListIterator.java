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
		if(mNext != mExpectedEnd && mExpectedEnd != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field SafeIterableMap$Entry mNext>
	//*   2    4:aload_0         
	//*   3    5:getfield        #23  <Field SafeIterableMap$Entry mExpectedEnd>
	//*   4    8:if_acmpeq       30
	//*   5   11:aload_0         
	//*   6   12:getfield        #23  <Field SafeIterableMap$Entry mExpectedEnd>
	//*   7   15:ifnonnull       21
	//*   8   18:goto            30
			return forward(mNext);
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #25  <Field SafeIterableMap$Entry mNext>
	//   12   26:invokevirtual   #34  <Method SafeIterableMap$Entry forward(SafeIterableMap$Entry)>
	//   13   29:areturn         
		else
			return null;
	//   14   30:aconst_null     
	//   15   31:areturn         
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
		if(mExpectedEnd == entry)
	//*  14   26:aload_0         
	//*  15   27:getfield        #23  <Field SafeIterableMap$Entry mExpectedEnd>
	//*  16   30:aload_1         
	//*  17   31:if_acmpne       46
			mExpectedEnd = backward(mExpectedEnd);
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:getfield        #23  <Field SafeIterableMap$Entry mExpectedEnd>
	//   22   40:invokevirtual   #51  <Method SafeIterableMap$Entry backward(SafeIterableMap$Entry)>
	//   23   43:putfield        #23  <Field SafeIterableMap$Entry mExpectedEnd>
		if(mNext == entry)
	//*  24   46:aload_0         
	//*  25   47:getfield        #25  <Field SafeIterableMap$Entry mNext>
	//*  26   50:aload_1         
	//*  27   51:if_acmpne       62
			mNext = nextNode();
	//   28   54:aload_0         
	//   29   55:aload_0         
	//   30   56:invokespecial   #45  <Method SafeIterableMap$Entry nextNode()>
	//   31   59:putfield        #25  <Field SafeIterableMap$Entry mNext>
	//   32   62:return          
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
