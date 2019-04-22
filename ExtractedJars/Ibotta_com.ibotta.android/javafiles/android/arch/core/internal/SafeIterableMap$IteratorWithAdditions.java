// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.core.internal;

import java.util.Iterator;

// Referenced classes of package android.arch.core.internal:
//			SafeIterableMap

private class SafeIterableMap$IteratorWithAdditions
	implements SafeIterableMap.SupportRemove, Iterator
{

	public boolean hasNext()
	{
		if(mBeforeStart)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean mBeforeStart>
	//*   2    4:ifeq            21
			return SafeIterableMap.access$100(SafeIterableMap.this) != null;
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field SafeIterableMap this$0>
	//    5   11:invokestatic    #38  <Method SafeIterableMap$Entry SafeIterableMap.access$100(SafeIterableMap)>
	//    6   14:ifnull          19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
		SafeIterableMap.Entry entry = mCurrent;
	//   11   21:aload_0         
	//   12   22:getfield        #40  <Field SafeIterableMap$Entry mCurrent>
	//   13   25:astore_1        
		return entry != null && entry.mNext != null;
	//   14   26:aload_1         
	//   15   27:ifnull          39
	//   16   30:aload_1         
	//   17   31:getfield        #45  <Field SafeIterableMap$Entry SafeIterableMap$Entry.mNext>
	//   18   34:ifnull          39
	//   19   37:iconst_1        
	//   20   38:ireturn         
	//   21   39:iconst_0        
	//   22   40:ireturn         
	}

	public volatile Object next()
	{
		return ((Object) (next()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method java.util.Map$Entry next()>
	//    2    4:areturn         
	}

	public java.util.Map.Entry next()
	{
		if(mBeforeStart)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean mBeforeStart>
	//*   2    4:ifeq            26
		{
			mBeforeStart = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #28  <Field boolean mBeforeStart>
			mCurrent = SafeIterableMap.access$100(SafeIterableMap.this);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #23  <Field SafeIterableMap this$0>
	//    9   17:invokestatic    #38  <Method SafeIterableMap$Entry SafeIterableMap.access$100(SafeIterableMap)>
	//   10   20:putfield        #40  <Field SafeIterableMap$Entry mCurrent>
		} else
	//*  11   23:goto            50
		{
			SafeIterableMap.Entry entry = mCurrent;
	//   12   26:aload_0         
	//   13   27:getfield        #40  <Field SafeIterableMap$Entry mCurrent>
	//   14   30:astore_1        
			if(entry != null)
	//*  15   31:aload_1         
	//*  16   32:ifnull          43
				entry = entry.mNext;
	//   17   35:aload_1         
	//   18   36:getfield        #45  <Field SafeIterableMap$Entry SafeIterableMap$Entry.mNext>
	//   19   39:astore_1        
			else
	//*  20   40:goto            45
				entry = null;
	//   21   43:aconst_null     
	//   22   44:astore_1        
			mCurrent = entry;
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:putfield        #40  <Field SafeIterableMap$Entry mCurrent>
		}
		return ((java.util.Map.Entry) (mCurrent));
	//   26   50:aload_0         
	//   27   51:getfield        #40  <Field SafeIterableMap$Entry mCurrent>
	//   28   54:areturn         
	}

	public void supportRemove(SafeIterableMap.Entry entry)
	{
		SafeIterableMap.Entry entry1 = mCurrent;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field SafeIterableMap$Entry mCurrent>
	//    2    4:astore_3        
		if(entry == entry1)
	//*   3    5:aload_1         
	//*   4    6:aload_3         
	//*   5    7:if_acmpne       37
		{
			mCurrent = entry1.mPrevious;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:getfield        #58  <Field SafeIterableMap$Entry SafeIterableMap$Entry.mPrevious>
	//    9   15:putfield        #40  <Field SafeIterableMap$Entry mCurrent>
			boolean flag;
			if(mCurrent == null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #40  <Field SafeIterableMap$Entry mCurrent>
	//*  12   22:ifnonnull       30
				flag = true;
	//   13   25:iconst_1        
	//   14   26:istore_2        
			else
	//*  15   27:goto            32
				flag = false;
	//   16   30:iconst_0        
	//   17   31:istore_2        
			mBeforeStart = flag;
	//   18   32:aload_0         
	//   19   33:iload_2         
	//   20   34:putfield        #28  <Field boolean mBeforeStart>
		}
	//   21   37:return          
	}

	private boolean mBeforeStart;
	private SafeIterableMap.Entry mCurrent;
	final SafeIterableMap this$0;

	private SafeIterableMap$IteratorWithAdditions()
	{
		this$0 = SafeIterableMap.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field SafeIterableMap this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #26  <Method void Object()>
		mBeforeStart = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #28  <Field boolean mBeforeStart>
	//    8   14:return          
	}

	SafeIterableMap$IteratorWithAdditions(SafeIterableMap._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method void SafeIterableMap$IteratorWithAdditions(SafeIterableMap)>
	//    3    5:return          
	}
}
