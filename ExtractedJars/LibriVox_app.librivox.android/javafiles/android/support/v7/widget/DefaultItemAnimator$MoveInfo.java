// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


class DefaultItemAnimator$MoveInfo
{

	public int fromX;
	public int fromY;
	public RecyclerView.ViewHolder holder;
	public int toX;
	public int toY;

	DefaultItemAnimator$MoveInfo(RecyclerView.ViewHolder viewholder, int i, int j, int k, int l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		holder = viewholder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field RecyclerView$ViewHolder holder>
		fromX = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field int fromX>
		fromY = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #22  <Field int fromY>
		toX = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #24  <Field int toX>
		toY = l;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #26  <Field int toY>
	//   17   31:return          
	}
}
