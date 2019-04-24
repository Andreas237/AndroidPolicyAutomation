// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.support.v4.util.SparseArrayCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;

// Referenced classes of package android.support.v4.widget:
//			ExploreByTouchHelper

static final class ExploreByTouchHelper$2
	implements nAdapter
{

	public AccessibilityNodeInfoCompat get(SparseArrayCompat sparsearraycompat, int i)
	{
		return (AccessibilityNodeInfoCompat)sparsearraycompat.valueAt(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #22  <Method Object SparseArrayCompat.valueAt(int)>
	//    3    5:checkcast       #24  <Class AccessibilityNodeInfoCompat>
	//    4    8:areturn         
	}

	public volatile Object get(Object obj, int i)
	{
		return ((Object) (get((SparseArrayCompat)obj, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class SparseArrayCompat>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #29  <Method AccessibilityNodeInfoCompat get(SparseArrayCompat, int)>
	//    5    9:areturn         
	}

	public int size(SparseArrayCompat sparsearraycompat)
	{
		return sparsearraycompat.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #34  <Method int SparseArrayCompat.size()>
	//    2    4:ireturn         
	}

	public volatile int size(Object obj)
	{
		return size((SparseArrayCompat)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class SparseArrayCompat>
	//    3    5:invokevirtual   #38  <Method int size(SparseArrayCompat)>
	//    4    8:ireturn         
	}

	ExploreByTouchHelper$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
