// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.core.internal;

import java.util.*;

public class SafeIterableMap
	implements Iterable
{
	static class AscendingIterator extends ListIterator
	{

		SafeIterableMap.Entry backward(SafeIterableMap.Entry entry)
		{
			return entry.mPrevious;
		//    0    0:aload_1         
		//    1    1:getfield        #23  <Field SafeIterableMap$Entry SafeIterableMap$Entry.mPrevious>
		//    2    4:areturn         
		}

		SafeIterableMap.Entry forward(SafeIterableMap.Entry entry)
		{
			return entry.mNext;
		//    0    0:aload_1         
		//    1    1:getfield        #28  <Field SafeIterableMap$Entry SafeIterableMap$Entry.mNext>
		//    2    4:areturn         
		}

		AscendingIterator(SafeIterableMap.Entry entry, SafeIterableMap.Entry entry1)
		{
			super(entry, entry1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #12  <Method void SafeIterableMap$ListIterator(SafeIterableMap$Entry, SafeIterableMap$Entry)>
		//    4    6:return          
		}
	}

	private static class DescendingIterator extends ListIterator
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

		DescendingIterator(SafeIterableMap.Entry entry, SafeIterableMap.Entry entry1)
		{
			super(entry, entry1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #12  <Method void SafeIterableMap$ListIterator(SafeIterableMap$Entry, SafeIterableMap$Entry)>
		//    4    6:return          
		}
	}

	static class Entry
		implements java.util.Map.Entry
	{

		public boolean equals(Object obj)
		{
			if(obj == this)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(!(obj instanceof Entry))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class SafeIterableMap$Entry>
		//*   7   11:ifne            16
				return false;
		//    8   14:iconst_0        
		//    9   15:ireturn         
			obj = ((Object) ((Entry)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class SafeIterableMap$Entry>
		//   12   20:astore_1        
			return mKey.equals(((Entry) (obj)).mKey) && mValue.equals(((Entry) (obj)).mValue);
		//   13   21:aload_0         
		//   14   22:getfield        #27  <Field Object mKey>
		//   15   25:aload_1         
		//   16   26:getfield        #27  <Field Object mKey>
		//   17   29:invokevirtual   #37  <Method boolean Object.equals(Object)>
		//   18   32:ifeq            51
		//   19   35:aload_0         
		//   20   36:getfield        #29  <Field Object mValue>
		//   21   39:aload_1         
		//   22   40:getfield        #29  <Field Object mValue>
		//   23   43:invokevirtual   #37  <Method boolean Object.equals(Object)>
		//   24   46:ifeq            51
		//   25   49:iconst_1        
		//   26   50:ireturn         
		//   27   51:iconst_0        
		//   28   52:ireturn         
		}

		public Object getKey()
		{
			return mKey;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field Object mKey>
		//    2    4:areturn         
		}

		public Object getValue()
		{
			return mValue;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field Object mValue>
		//    2    4:areturn         
		}

		public Object setValue(Object obj)
		{
			throw new UnsupportedOperationException("An entry modification is not supported");
		//    0    0:new             #47  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #49  <String "An entry modification is not supported">
		//    3    6:invokespecial   #52  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #57  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #58  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append(mKey);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #27  <Field Object mKey>
		//    7   13:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
		//    8   16:pop             
			stringbuilder.append("=");
		//    9   17:aload_1         
		//   10   18:ldc1            #64  <String "=">
		//   11   20:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
			stringbuilder.append(mValue);
		//   13   24:aload_1         
		//   14   25:aload_0         
		//   15   26:getfield        #29  <Field Object mValue>
		//   16   29:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
		//   17   32:pop             
			return stringbuilder.toString();
		//   18   33:aload_1         
		//   19   34:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   20   37:areturn         
		}

		final Object mKey;
		Entry mNext;
		Entry mPrevious;
		final Object mValue;

		Entry(Object obj, Object obj1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			mKey = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #27  <Field Object mKey>
			mValue = obj1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #29  <Field Object mValue>
		//    8   14:return          
		}
	}

	private class IteratorWithAdditions
		implements Iterator, SupportRemove
	{

		public boolean hasNext()
		{
			if(mBeforeStart)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field boolean mBeforeStart>
		//*   2    4:ifeq            21
				return mStart != null;
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
				mCurrent = mStart;
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

		private IteratorWithAdditions()
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

	}

	private static abstract class ListIterator
		implements Iterator, SupportRemove
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

		ListIterator(SafeIterableMap.Entry entry, SafeIterableMap.Entry entry1)
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

	static interface SupportRemove
	{

		public abstract void supportRemove(SafeIterableMap.Entry entry);
	}


	public SafeIterableMap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		mIterators = new WeakHashMap();
	//    2    4:aload_0         
	//    3    5:new             #46  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #47  <Method void WeakHashMap()>
	//    6   12:putfield        #49  <Field WeakHashMap mIterators>
		mSize = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #51  <Field int mSize>
	//   10   20:return          
	}

	public Iterator descendingIterator()
	{
		DescendingIterator descendingiterator = new DescendingIterator(mEnd, mStart);
	//    0    0:new             #14  <Class SafeIterableMap$DescendingIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #60  <Field SafeIterableMap$Entry mEnd>
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field SafeIterableMap$Entry mStart>
	//    6   12:invokespecial   #63  <Method void SafeIterableMap$DescendingIterator(SafeIterableMap$Entry, SafeIterableMap$Entry)>
	//    7   15:astore_1        
		mIterators.put(((Object) (descendingiterator)), ((Object) (Boolean.valueOf(false))));
	//    8   16:aload_0         
	//    9   17:getfield        #49  <Field WeakHashMap mIterators>
	//   10   20:aload_1         
	//   11   21:iconst_0        
	//   12   22:invokestatic    #69  <Method Boolean Boolean.valueOf(boolean)>
	//   13   25:invokevirtual   #73  <Method Object WeakHashMap.put(Object, Object)>
	//   14   28:pop             
		return ((Iterator) (descendingiterator));
	//   15   29:aload_1         
	//   16   30:areturn         
	}

	public java.util.Map.Entry eldest()
	{
		return ((java.util.Map.Entry) (mStart));
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field SafeIterableMap$Entry mStart>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof SafeIterableMap))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class SafeIterableMap>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		Object obj1 = ((Object) ((SafeIterableMap)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class SafeIterableMap>
	//   12   20:astore_2        
		if(size() != ((SafeIterableMap) (obj1)).size())
	//*  13   21:aload_0         
	//*  14   22:invokevirtual   #84  <Method int size()>
	//*  15   25:aload_2         
	//*  16   26:invokevirtual   #84  <Method int size()>
	//*  17   29:icmpeq          34
			return false;
	//   18   32:iconst_0        
	//   19   33:ireturn         
		obj = ((Object) (iterator()));
	//   20   34:aload_0         
	//   21   35:invokevirtual   #87  <Method Iterator iterator()>
	//   22   38:astore_1        
		for(obj1 = ((Object) (((SafeIterableMap) (obj1)).iterator())); ((Iterator) (obj)).hasNext() && ((Iterator) (obj1)).hasNext();)
	//*  23   39:aload_2         
	//*  24   40:invokevirtual   #87  <Method Iterator iterator()>
	//*  25   43:astore_2        
	//*  26   44:aload_1         
	//*  27   45:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//*  28   50:ifeq            106
	//*  29   53:aload_2         
	//*  30   54:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//*  31   59:ifeq            106
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   32   62:aload_1         
	//   33   63:invokeinterface #97  <Method Object Iterator.next()>
	//   34   68:checkcast       #99  <Class java.util.Map$Entry>
	//   35   71:astore_3        
			Object obj2 = ((Iterator) (obj1)).next();
	//   36   72:aload_2         
	//   37   73:invokeinterface #97  <Method Object Iterator.next()>
	//   38   78:astore          4
			if(entry == null && obj2 != null || entry != null && !entry.equals(obj2))
	//*  39   80:aload_3         
	//*  40   81:ifnonnull       89
	//*  41   84:aload           4
	//*  42   86:ifnonnull       104
	//*  43   89:aload_3         
	//*  44   90:ifnull          44
	//*  45   93:aload_3         
	//*  46   94:aload           4
	//*  47   96:invokeinterface #101 <Method boolean java.util.Map$Entry.equals(Object)>
	//*  48  101:ifne            44
				return false;
	//   49  104:iconst_0        
	//   50  105:ireturn         
		}

		return !((Iterator) (obj)).hasNext() && !((Iterator) (obj1)).hasNext();
	//   51  106:aload_1         
	//   52  107:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//   53  112:ifne            126
	//   54  115:aload_2         
	//   55  116:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//   56  121:ifne            126
	//   57  124:iconst_1        
	//   58  125:ireturn         
	//   59  126:iconst_0        
	//   60  127:ireturn         
	}

	protected Entry get(Object obj)
	{
		Entry entry;
		for(entry = mStart; entry != null; entry = entry.mNext)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field SafeIterableMap$Entry mStart>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:ifnull          30
			if(entry.mKey.equals(obj))
	//*   5    9:aload_2         
	//*   6   10:getfield        #107 <Field Object SafeIterableMap$Entry.mKey>
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #108 <Method boolean Object.equals(Object)>
	//*   9   17:ifeq            22
				return entry;
	//   10   20:aload_2         
	//   11   21:areturn         

	//   12   22:aload_2         
	//   13   23:getfield        #111 <Field SafeIterableMap$Entry SafeIterableMap$Entry.mNext>
	//   14   26:astore_2        
	//*  15   27:goto            5
		return entry;
	//   16   30:aload_2         
	//   17   31:areturn         
	}

	public Iterator iterator()
	{
		AscendingIterator ascendingiterator = new AscendingIterator(mStart, mEnd);
	//    0    0:new             #11  <Class SafeIterableMap$AscendingIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field SafeIterableMap$Entry mStart>
	//    4    8:aload_0         
	//    5    9:getfield        #60  <Field SafeIterableMap$Entry mEnd>
	//    6   12:invokespecial   #114 <Method void SafeIterableMap$AscendingIterator(SafeIterableMap$Entry, SafeIterableMap$Entry)>
	//    7   15:astore_1        
		mIterators.put(((Object) (ascendingiterator)), ((Object) (Boolean.valueOf(false))));
	//    8   16:aload_0         
	//    9   17:getfield        #49  <Field WeakHashMap mIterators>
	//   10   20:aload_1         
	//   11   21:iconst_0        
	//   12   22:invokestatic    #69  <Method Boolean Boolean.valueOf(boolean)>
	//   13   25:invokevirtual   #73  <Method Object WeakHashMap.put(Object, Object)>
	//   14   28:pop             
		return ((Iterator) (ascendingiterator));
	//   15   29:aload_1         
	//   16   30:areturn         
	}

	public IteratorWithAdditions iteratorWithAdditions()
	{
		IteratorWithAdditions iteratorwithadditions = new IteratorWithAdditions();
	//    0    0:new             #20  <Class SafeIterableMap$IteratorWithAdditions>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #120 <Method void SafeIterableMap$IteratorWithAdditions(SafeIterableMap, SafeIterableMap$1)>
	//    5    9:astore_1        
		mIterators.put(((Object) (iteratorwithadditions)), ((Object) (Boolean.valueOf(false))));
	//    6   10:aload_0         
	//    7   11:getfield        #49  <Field WeakHashMap mIterators>
	//    8   14:aload_1         
	//    9   15:iconst_0        
	//   10   16:invokestatic    #69  <Method Boolean Boolean.valueOf(boolean)>
	//   11   19:invokevirtual   #73  <Method Object WeakHashMap.put(Object, Object)>
	//   12   22:pop             
		return iteratorwithadditions;
	//   13   23:aload_1         
	//   14   24:areturn         
	}

	public java.util.Map.Entry newest()
	{
		return ((java.util.Map.Entry) (mEnd));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field SafeIterableMap$Entry mEnd>
	//    2    4:areturn         
	}

	protected Entry put(Object obj, Object obj1)
	{
		obj = ((Object) (new Entry(obj, obj1)));
	//    0    0:new             #17  <Class SafeIterableMap$Entry>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #126 <Method void SafeIterableMap$Entry(Object, Object)>
	//    5    9:astore_1        
		mSize = mSize + 1;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #51  <Field int mSize>
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:putfield        #51  <Field int mSize>
		obj1 = ((Object) (mEnd));
	//   12   20:aload_0         
	//   13   21:getfield        #60  <Field SafeIterableMap$Entry mEnd>
	//   14   24:astore_2        
		if(obj1 == null)
	//*  15   25:aload_2         
	//*  16   26:ifnonnull       44
		{
			mStart = ((Entry) (obj));
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:putfield        #56  <Field SafeIterableMap$Entry mStart>
			mEnd = mStart;
	//   20   34:aload_0         
	//   21   35:aload_0         
	//   22   36:getfield        #56  <Field SafeIterableMap$Entry mStart>
	//   23   39:putfield        #60  <Field SafeIterableMap$Entry mEnd>
			return ((Entry) (obj));
	//   24   42:aload_1         
	//   25   43:areturn         
		} else
		{
			obj1.mNext = ((Entry) (obj));
	//   26   44:aload_2         
	//   27   45:aload_1         
	//   28   46:putfield        #111 <Field SafeIterableMap$Entry SafeIterableMap$Entry.mNext>
			obj.mPrevious = ((Entry) (obj1));
	//   29   49:aload_1         
	//   30   50:aload_2         
	//   31   51:putfield        #129 <Field SafeIterableMap$Entry SafeIterableMap$Entry.mPrevious>
			mEnd = ((Entry) (obj));
	//   32   54:aload_0         
	//   33   55:aload_1         
	//   34   56:putfield        #60  <Field SafeIterableMap$Entry mEnd>
			return ((Entry) (obj));
	//   35   59:aload_1         
	//   36   60:areturn         
		}
	}

	public Object putIfAbsent(Object obj, Object obj1)
	{
		Entry entry = get(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #134 <Method SafeIterableMap$Entry get(Object)>
	//    3    5:astore_3        
		if(entry != null)
	//*   4    6:aload_3         
	//*   5    7:ifnull          15
		{
			return entry.mValue;
	//    6   10:aload_3         
	//    7   11:getfield        #137 <Field Object SafeIterableMap$Entry.mValue>
	//    8   14:areturn         
		} else
		{
			put(obj, obj1);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #139 <Method SafeIterableMap$Entry put(Object, Object)>
	//   13   21:pop             
			return ((Object) (null));
	//   14   22:aconst_null     
	//   15   23:areturn         
		}
	}

	public Object remove(Object obj)
	{
		obj = ((Object) (get(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #134 <Method SafeIterableMap$Entry get(Object)>
	//    3    5:astore_1        
		if(obj == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
			return ((Object) (null));
	//    6   10:aconst_null     
	//    7   11:areturn         
		mSize = mSize - 1;
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:getfield        #51  <Field int mSize>
	//   11   17:iconst_1        
	//   12   18:isub            
	//   13   19:putfield        #51  <Field int mSize>
		if(!mIterators.isEmpty())
	//*  14   22:aload_0         
	//*  15   23:getfield        #49  <Field WeakHashMap mIterators>
	//*  16   26:invokevirtual   #145 <Method boolean WeakHashMap.isEmpty()>
	//*  17   29:ifne            72
		{
			for(Iterator iterator1 = mIterators.keySet().iterator(); iterator1.hasNext(); ((SupportRemove)iterator1.next()).supportRemove(((Entry) (obj))));
	//   18   32:aload_0         
	//   19   33:getfield        #49  <Field WeakHashMap mIterators>
	//   20   36:invokevirtual   #149 <Method Set WeakHashMap.keySet()>
	//   21   39:invokeinterface #152 <Method Iterator Set.iterator()>
	//   22   44:astore_2        
	//   23   45:aload_2         
	//   24   46:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//   25   51:ifeq            72
	//   26   54:aload_2         
	//   27   55:invokeinterface #97  <Method Object Iterator.next()>
	//   28   60:checkcast       #26  <Class SafeIterableMap$SupportRemove>
	//   29   63:aload_1         
	//   30   64:invokeinterface #156 <Method void SafeIterableMap$SupportRemove.supportRemove(SafeIterableMap$Entry)>
		}
	//*  31   69:goto            45
		if(((Entry) (obj)).mPrevious != null)
	//*  32   72:aload_1         
	//*  33   73:getfield        #129 <Field SafeIterableMap$Entry SafeIterableMap$Entry.mPrevious>
	//*  34   76:ifnull          93
			((Entry) (obj)).mPrevious.mNext = ((Entry) (obj)).mNext;
	//   35   79:aload_1         
	//   36   80:getfield        #129 <Field SafeIterableMap$Entry SafeIterableMap$Entry.mPrevious>
	//   37   83:aload_1         
	//   38   84:getfield        #111 <Field SafeIterableMap$Entry SafeIterableMap$Entry.mNext>
	//   39   87:putfield        #111 <Field SafeIterableMap$Entry SafeIterableMap$Entry.mNext>
		else
	//*  40   90:goto            101
			mStart = ((Entry) (obj)).mNext;
	//   41   93:aload_0         
	//   42   94:aload_1         
	//   43   95:getfield        #111 <Field SafeIterableMap$Entry SafeIterableMap$Entry.mNext>
	//   44   98:putfield        #56  <Field SafeIterableMap$Entry mStart>
		if(((Entry) (obj)).mNext != null)
	//*  45  101:aload_1         
	//*  46  102:getfield        #111 <Field SafeIterableMap$Entry SafeIterableMap$Entry.mNext>
	//*  47  105:ifnull          122
			((Entry) (obj)).mNext.mPrevious = ((Entry) (obj)).mPrevious;
	//   48  108:aload_1         
	//   49  109:getfield        #111 <Field SafeIterableMap$Entry SafeIterableMap$Entry.mNext>
	//   50  112:aload_1         
	//   51  113:getfield        #129 <Field SafeIterableMap$Entry SafeIterableMap$Entry.mPrevious>
	//   52  116:putfield        #129 <Field SafeIterableMap$Entry SafeIterableMap$Entry.mPrevious>
		else
	//*  53  119:goto            130
			mEnd = ((Entry) (obj)).mPrevious;
	//   54  122:aload_0         
	//   55  123:aload_1         
	//   56  124:getfield        #129 <Field SafeIterableMap$Entry SafeIterableMap$Entry.mPrevious>
	//   57  127:putfield        #60  <Field SafeIterableMap$Entry mEnd>
		obj.mNext = null;
	//   58  130:aload_1         
	//   59  131:aconst_null     
	//   60  132:putfield        #111 <Field SafeIterableMap$Entry SafeIterableMap$Entry.mNext>
		obj.mPrevious = null;
	//   61  135:aload_1         
	//   62  136:aconst_null     
	//   63  137:putfield        #129 <Field SafeIterableMap$Entry SafeIterableMap$Entry.mPrevious>
		return ((Entry) (obj)).mValue;
	//   64  140:aload_1         
	//   65  141:getfield        #137 <Field Object SafeIterableMap$Entry.mValue>
	//   66  144:areturn         
	}

	public int size()
	{
		return mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int mSize>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #161 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #162 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[");
	//    4    8:aload_1         
	//    5    9:ldc1            #164 <String "[">
	//    6   11:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		Iterator iterator1 = iterator();
	//    8   15:aload_0         
	//    9   16:invokevirtual   #87  <Method Iterator iterator()>
	//   10   19:astore_2        
		do
		{
			if(!iterator1.hasNext())
				break;
	//   11   20:aload_2         
	//   12   21:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//   13   26:ifeq            65
			stringbuilder.append(((Object) ((java.util.Map.Entry)iterator1.next())).toString());
	//   14   29:aload_1         
	//   15   30:aload_2         
	//   16   31:invokeinterface #97  <Method Object Iterator.next()>
	//   17   36:checkcast       #99  <Class java.util.Map$Entry>
	//   18   39:invokevirtual   #170 <Method String Object.toString()>
	//   19   42:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//   20   45:pop             
			if(iterator1.hasNext())
	//*  21   46:aload_2         
	//*  22   47:invokeinterface #93  <Method boolean Iterator.hasNext()>
	//*  23   52:ifeq            20
				stringbuilder.append(", ");
	//   24   55:aload_1         
	//   25   56:ldc1            #172 <String ", ">
	//   26   58:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//   27   61:pop             
		} while(true);
	//   28   62:goto            20
		stringbuilder.append("]");
	//   29   65:aload_1         
	//   30   66:ldc1            #174 <String "]">
	//   31   68:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//   32   71:pop             
		return stringbuilder.toString();
	//   33   72:aload_1         
	//   34   73:invokevirtual   #175 <Method String StringBuilder.toString()>
	//   35   76:areturn         
	}

	private Entry mEnd;
	private WeakHashMap mIterators;
	private int mSize;
	private Entry mStart;


/*
	static Entry access$100(SafeIterableMap safeiterablemap)
	{
		return safeiterablemap.mStart;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field SafeIterableMap$Entry mStart>
	//    2    4:areturn         
	}

*/
}
