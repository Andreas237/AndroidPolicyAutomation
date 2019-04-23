// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;

import java.lang.reflect.Array;

public class TileList$Tile
{

	boolean containsPosition(int i)
	{
		int j = mStartPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int mStartPosition>
	//    2    4:istore_2        
		return j <= i && i < j + mItemCount;
	//    3    5:iload_2         
	//    4    6:iload_1         
	//    5    7:icmpgt          22
	//    6   10:iload_1         
	//    7   11:iload_2         
	//    8   12:aload_0         
	//    9   13:getfield        #32  <Field int mItemCount>
	//   10   16:iadd            
	//   11   17:icmpge          22
	//   12   20:iconst_1        
	//   13   21:ireturn         
	//   14   22:iconst_0        
	//   15   23:ireturn         
	}

	Object getByPosition(int i)
	{
		return mItems[i - mStartPosition];
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object[] mItems>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field int mStartPosition>
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
	//    1    1:invokespecial   #16  <Method void Object()>
		mItems = (Object[])Array.newInstance(class1, i);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokestatic    #22  <Method Object Array.newInstance(Class, int)>
	//    6   10:checkcast       #23  <Class Object[]>
	//    7   13:putfield        #25  <Field Object[] mItems>
	//    8   16:return          
	}
}
