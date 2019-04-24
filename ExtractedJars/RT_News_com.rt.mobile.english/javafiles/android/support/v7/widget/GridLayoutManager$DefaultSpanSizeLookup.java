// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			GridLayoutManager

public static final class GridLayoutManager$DefaultSpanSizeLookup extends GridLayoutManager.SpanSizeLookup
{

	public int getSpanIndex(int i, int j)
	{
		return i % j;
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:irem            
	//    3    3:ireturn         
	}

	public int getSpanSize(int i)
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public GridLayoutManager$DefaultSpanSizeLookup()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void GridLayoutManager$SpanSizeLookup()>
	//    2    4:return          
	}
}
