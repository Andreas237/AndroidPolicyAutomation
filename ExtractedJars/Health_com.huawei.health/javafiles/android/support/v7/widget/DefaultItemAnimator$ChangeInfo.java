// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			DefaultItemAnimator

static class DefaultItemAnimator$ChangeInfo
{

	public String toString()
	{
		return (new StringBuilder()).append("ChangeInfo{oldHolder=").append(((Object) (oldHolder))).append(", newHolder=").append(((Object) (newHolder))).append(", fromX=").append(fromX).append(", fromY=").append(fromY).append(", toX=").append(toX).append(", toY=").append(toY).append('}').toString();
	//    0    0:new             #40  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void StringBuilder()>
	//    3    7:ldc1            #43  <String "ChangeInfo{oldHolder=">
	//    4    9:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #22  <Field RecyclerView$ViewHolder oldHolder>
	//    7   16:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #52  <String ", newHolder=">
	//    9   21:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #24  <Field RecyclerView$ViewHolder newHolder>
	//   12   28:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:ldc1            #54  <String ", fromX=">
	//   14   33:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #30  <Field int fromX>
	//   17   40:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   18   43:ldc1            #59  <String ", fromY=">
	//   19   45:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #32  <Field int fromY>
	//   22   52:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   23   55:ldc1            #61  <String ", toX=">
	//   24   57:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   25   60:aload_0         
	//   26   61:getfield        #34  <Field int toX>
	//   27   64:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   28   67:ldc1            #63  <String ", toY=">
	//   29   69:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   30   72:aload_0         
	//   31   73:getfield        #36  <Field int toY>
	//   32   76:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   33   79:bipush          125
	//   34   81:invokevirtual   #66  <Method StringBuilder StringBuilder.append(char)>
	//   35   84:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   36   87:areturn         
	}

	public int fromX;
	public int fromY;
	public RecyclerView.ViewHolder newHolder;
	public RecyclerView.ViewHolder oldHolder;
	public int toX;
	public int toY;

	private DefaultItemAnimator$ChangeInfo(RecyclerView.ViewHolder viewholder, RecyclerView.ViewHolder viewholder1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		oldHolder = viewholder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field RecyclerView$ViewHolder oldHolder>
		newHolder = viewholder1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field RecyclerView$ViewHolder newHolder>
	//    8   14:return          
	}

	DefaultItemAnimator$ChangeInfo(RecyclerView.ViewHolder viewholder, RecyclerView.ViewHolder viewholder1, int i, int j, int k, int l)
	{
		this(viewholder, viewholder1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void DefaultItemAnimator$ChangeInfo(RecyclerView$ViewHolder, RecyclerView$ViewHolder)>
		fromX = i;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #30  <Field int fromX>
		fromY = j;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #32  <Field int fromY>
		toX = k;
	//   10   17:aload_0         
	//   11   18:iload           5
	//   12   20:putfield        #34  <Field int toX>
		toY = l;
	//   13   23:aload_0         
	//   14   24:iload           6
	//   15   26:putfield        #36  <Field int toY>
	//   16   29:return          
	}
}
