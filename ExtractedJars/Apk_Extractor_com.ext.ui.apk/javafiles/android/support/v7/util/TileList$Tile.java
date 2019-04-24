// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;

import java.lang.reflect.Array;

// Referenced classes of package android.support.v7.util:
//			TileList

public static class TileList$Tile
{

	boolean containsPosition(int i)
	{
		return mStartPosition <= i && i < mStartPosition + mItemCount;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int mStartPosition>
	//    2    4:iload_1         
	//    3    5:icmpgt          23
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #38  <Field int mStartPosition>
	//    7   13:aload_0         
	//    8   14:getfield        #40  <Field int mItemCount>
	//    9   17:iadd            
	//   10   18:icmpge          23
	//   11   21:iconst_1        
	//   12   22:ireturn         
	//   13   23:iconst_0        
	//   14   24:ireturn         
	}

	Object getByPosition(int i)
	{
		return mItems[i - mStartPosition];
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Object[] mItems>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field int mStartPosition>
	//    5    9:isub            
	//    6   10:aaload          
	//    7   11:areturn         
	}

	public int mItemCount;
	public final Object mItems[];
	TileList$Tile mNext;
	public int mStartPosition;

	public TileList$Tile(Class class1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mItems = (Object[])(Object[])Array.newInstance(class1, i);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokestatic    #28  <Method Object Array.newInstance(Class, int)>
	//    6   10:checkcast       #29  <Class Object[]>
	//    7   13:checkcast       #29  <Class Object[]>
	//    8   16:putfield        #31  <Field Object[] mItems>
	//    9   19:return          
	}
}
