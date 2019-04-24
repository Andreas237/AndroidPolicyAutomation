// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


// Referenced classes of package android.databinding:
//			ViewDataBinding

protected static class ViewDataBinding$IncludedLayouts
{

	public void setIncludes(int i, String as[], int ai[], int ai1[])
	{
		layouts[i] = as;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String[][] layouts>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aastore         
		indexes[i] = ai;
	//    5    7:aload_0         
	//    6    8:getfield        #25  <Field int[][] indexes>
	//    7   11:iload_1         
	//    8   12:aload_3         
	//    9   13:aastore         
		layoutIds[i] = ai1;
	//   10   14:aload_0         
	//   11   15:getfield        #27  <Field int[][] layoutIds>
	//   12   18:iload_1         
	//   13   19:aload           4
	//   14   21:aastore         
	//   15   22:return          
	}

	public final int indexes[][];
	public final int layoutIds[][];
	public final String layouts[][];

	public ViewDataBinding$IncludedLayouts(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		layouts = new String[i][];
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:anewarray       String[][]
	//    5    9:putfield        #21  <Field String[][] layouts>
		indexes = new int[i][];
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:anewarray       int[][]
	//    9   17:putfield        #25  <Field int[][] indexes>
		layoutIds = new int[i][];
	//   10   20:aload_0         
	//   11   21:iload_1         
	//   12   22:anewarray       int[][]
	//   13   25:putfield        #27  <Field int[][] layoutIds>
	//   14   28:return          
	}
}
