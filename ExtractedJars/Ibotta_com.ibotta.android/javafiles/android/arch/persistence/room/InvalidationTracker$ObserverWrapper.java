// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import android.support.v4.util.ArraySet;
import java.util.Collections;
import java.util.Set;

// Referenced classes of package android.arch.persistence.room:
//			InvalidationTracker

static class InvalidationTracker$ObserverWrapper
{

	void checkForInvalidation(long al[])
	{
		int j = mTableIds.length;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int[] mTableIds>
	//    2    4:arraylength     
	//    3    5:istore_3        
		Object obj = null;
	//    4    6:aconst_null     
	//    5    7:astore          6
		for(int i = 0; i < j;)
	//*   6    9:iconst_0        
	//*   7   10:istore_2        
	//*   8   11:iload_2         
	//*   9   12:iload_3         
	//*  10   13:icmpge          110
		{
			long l = al[mTableIds[i]];
	//   11   16:aload_1         
	//   12   17:aload_0         
	//   13   18:getfield        #27  <Field int[] mTableIds>
	//   14   21:iload_2         
	//   15   22:iaload          
	//   16   23:laload          
	//   17   24:lstore          4
			long al1[] = mVersions;
	//   18   26:aload_0         
	//   19   27:getfield        #31  <Field long[] mVersions>
	//   20   30:astore          8
			Object obj1 = obj;
	//   21   32:aload           6
	//   22   34:astore          7
			if(al1[i] < l)
	//*  23   36:aload           8
	//*  24   38:iload_2         
	//*  25   39:laload          
	//*  26   40:lload           4
	//*  27   42:lcmp            
	//*  28   43:ifge            99
			{
				al1[i] = l;
	//   29   46:aload           8
	//   30   48:iload_2         
	//   31   49:lload           4
	//   32   51:lastore         
				if(j == 1)
	//*  33   52:iload_3         
	//*  34   53:iconst_1        
	//*  35   54:icmpne          66
				{
					obj1 = ((Object) (mSingleTableSet));
	//   36   57:aload_0         
	//   37   58:getfield        #46  <Field Set mSingleTableSet>
	//   38   61:astore          7
				} else
	//*  39   63:goto            99
				{
					obj1 = obj;
	//   40   66:aload           6
	//   41   68:astore          7
					if(obj == null)
	//*  42   70:aload           6
	//*  43   72:ifnonnull       85
						obj1 = ((Object) (new ArraySet(j)));
	//   44   75:new             #33  <Class ArraySet>
	//   45   78:dup             
	//   46   79:iload_3         
	//   47   80:invokespecial   #52  <Method void ArraySet(int)>
	//   48   83:astore          7
					((Set) (obj1)).add(((Object) (mTableNames[i])));
	//   49   85:aload           7
	//   50   87:aload_0         
	//   51   88:getfield        #29  <Field String[] mTableNames>
	//   52   91:iload_2         
	//   53   92:aaload          
	//   54   93:invokeinterface #55  <Method boolean Set.add(Object)>
	//   55   98:pop             
				}
			}
			i++;
	//   56   99:iload_2         
	//   57  100:iconst_1        
	//   58  101:iadd            
	//   59  102:istore_2        
			obj = obj1;
	//   60  103:aload           7
	//   61  105:astore          6
		}

	//*  62  107:goto            11
		if(obj != null)
	//*  63  110:aload           6
	//*  64  112:ifnull          124
			mObserver.onInvalidated(((Set) (obj)));
	//   65  115:aload_0         
	//   66  116:getfield        #25  <Field InvalidationTracker$Observer mObserver>
	//   67  119:aload           6
	//   68  121:invokevirtual   #61  <Method void InvalidationTracker$Observer.onInvalidated(Set)>
	//   69  124:return          
	}

	final InvalidationTracker.Observer mObserver;
	private final Set mSingleTableSet;
	final int mTableIds[];
	private final String mTableNames[];
	private final long mVersions[];

	InvalidationTracker$ObserverWrapper(InvalidationTracker.Observer observer, int ai[], String as[], long al[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		mObserver = observer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field InvalidationTracker$Observer mObserver>
		mTableIds = ai;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field int[] mTableIds>
		mTableNames = as;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field String[] mTableNames>
		mVersions = al;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #31  <Field long[] mVersions>
		if(ai.length == 1)
	//*  14   25:aload_2         
	//*  15   26:arraylength     
	//*  16   27:iconst_1        
	//*  17   28:icmpne          59
		{
			observer = ((InvalidationTracker.Observer) (new ArraySet()));
	//   18   31:new             #33  <Class ArraySet>
	//   19   34:dup             
	//   20   35:invokespecial   #34  <Method void ArraySet()>
	//   21   38:astore_1        
			((ArraySet) (observer)).add(((Object) (mTableNames[0])));
	//   22   39:aload_1         
	//   23   40:aload_0         
	//   24   41:getfield        #29  <Field String[] mTableNames>
	//   25   44:iconst_0        
	//   26   45:aaload          
	//   27   46:invokevirtual   #38  <Method boolean ArraySet.add(Object)>
	//   28   49:pop             
			mSingleTableSet = Collections.unmodifiableSet(((Set) (observer)));
	//   29   50:aload_0         
	//   30   51:aload_1         
	//   31   52:invokestatic    #44  <Method Set Collections.unmodifiableSet(Set)>
	//   32   55:putfield        #46  <Field Set mSingleTableSet>
			return;
	//   33   58:return          
		} else
		{
			mSingleTableSet = null;
	//   34   59:aload_0         
	//   35   60:aconst_null     
	//   36   61:putfield        #46  <Field Set mSingleTableSet>
			return;
	//   37   64:return          
		}
	}
}
