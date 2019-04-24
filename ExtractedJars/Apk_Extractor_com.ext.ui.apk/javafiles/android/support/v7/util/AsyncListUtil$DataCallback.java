// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;


// Referenced classes of package android.support.v7.util:
//			AsyncListUtil

public static abstract class AsyncListUtil$DataCallback
{

	public abstract void fillData(Object aobj[], int i, int j);

	public int getMaxCachedTiles()
	{
		return 10;
	//    0    0:bipush          10
	//    1    2:ireturn         
	}

	public void recycleData(Object aobj[], int i)
	{
	//    0    0:return          
	}

	public abstract int refreshData();

	public AsyncListUtil$DataCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
