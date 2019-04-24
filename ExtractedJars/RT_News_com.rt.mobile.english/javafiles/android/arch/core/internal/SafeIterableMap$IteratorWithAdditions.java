// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.core.internal;

import java.util.Iterator;

// Referenced classes of package android.arch.core.internal:
//			SafeIterableMap

private class SafeIterableMap$IteratorWithAdditions
	implements Iterator, SafeIterableMap.SupportRemove
{

	public boolean hasNext()
	{
		boolean flag2 = mBeforeStart;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field boolean mBeforeStart>
	//    2    4:istore_3        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		boolean flag = false;
	//    5    7:iconst_0        
	//    6    8:istore_1        
		if(flag2)
	//*   7    9:iload_3         
	//*   8   10:ifeq            27
		{
			if(SafeIterableMap.access$100(SafeIterableMap.this) != null)
	//*   9   13:aload_0         
	//*  10   14:getfield        #23  <Field SafeIterableMap this$0>
	//*  11   17:invokestatic    #38  <Method SafeIterableMap$Entry SafeIterableMap.access$100(SafeIterableMap)>
	//*  12   20:ifnull          25
				flag = true;
	//   13   23:iconst_1        
	//   14   24:istore_1        
			return flag;
	//   15   25:iload_1         
	//   16   26:ireturn         
		}
		flag = flag1;
	//   17   27:iload_2         
	//   18   28:istore_1        
		if(mCurrent != null)
	//*  19   29:aload_0         
	//*  20   30:getfield        #40  <Field SafeIterableMap$Entry mCurrent>
	//*  21   33:ifnull          50
		{
			flag = flag1;
	//   22   36:iload_2         
	//   23   37:istore_1        
			if(mCurrent.mNext != null)
	//*  24   38:aload_0         
	//*  25   39:getfield        #40  <Field SafeIterableMap$Entry mCurrent>
	//*  26   42:getfield        #45  <Field SafeIterableMap$Entry SafeIterableMap$Entry.mNext>
	//*  27   45:ifnull          50
				flag = true;
	//   28   48:iconst_1        
	//   29   49:istore_1        
		}
		return flag;
	//   30   50:iload_1         
	//   31   51:ireturn         
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
	//*  11   23:goto            51
		{
			SafeIterableMap.Entry entry;
			if(mCurrent != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #40  <Field SafeIterableMap$Entry mCurrent>
	//*  14   30:ifnull          44
				entry = mCurrent.mNext;
	//   15   33:aload_0         
	//   16   34:getfield        #40  <Field SafeIterableMap$Entry mCurrent>
	//   17   37:getfield        #45  <Field SafeIterableMap$Entry SafeIterableMap$Entry.mNext>
	//   18   40:astore_1        
			else
	//*  19   41:goto            46
				entry = null;
	//   20   44:aconst_null     
	//   21   45:astore_1        
			mCurrent = entry;
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:putfield        #40  <Field SafeIterableMap$Entry mCurrent>
		}
		return ((java.util.Map.Entry) (mCurrent));
	//   25   51:aload_0         
	//   26   52:getfield        #40  <Field SafeIterableMap$Entry mCurrent>
	//   27   55:areturn         
	}

	public void supportRemove(SafeIterableMap.Entry entry)
	{
		if(entry == mCurrent)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #40  <Field SafeIterableMap$Entry mCurrent>
	//*   3    5:if_acmpne       38
		{
			mCurrent = mCurrent.mPrevious;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field SafeIterableMap$Entry mCurrent>
	//    7   13:getfield        #58  <Field SafeIterableMap$Entry SafeIterableMap$Entry.mPrevious>
	//    8   16:putfield        #40  <Field SafeIterableMap$Entry mCurrent>
			boolean flag;
			if(mCurrent == null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #40  <Field SafeIterableMap$Entry mCurrent>
	//*  11   23:ifnonnull       31
				flag = true;
	//   12   26:iconst_1        
	//   13   27:istore_2        
			else
	//*  14   28:goto            33
				flag = false;
	//   15   31:iconst_0        
	//   16   32:istore_2        
			mBeforeStart = flag;
	//   17   33:aload_0         
	//   18   34:iload_2         
	//   19   35:putfield        #28  <Field boolean mBeforeStart>
		}
	//   20   38:return          
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
