// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


class DefaultItemAnimator$ChangeInfo
{

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #37  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ChangeInfo{oldHolder=");
	//    4    8:aload_1         
	//    5    9:ldc1            #40  <String "ChangeInfo{oldHolder=">
	//    6   11:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (oldHolder)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #19  <Field RecyclerView$ViewHolder oldHolder>
	//   11   20:invokevirtual   #47  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", newHolder=");
	//   13   24:aload_1         
	//   14   25:ldc1            #49  <String ", newHolder=">
	//   15   27:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (newHolder)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #21  <Field RecyclerView$ViewHolder newHolder>
	//   20   36:invokevirtual   #47  <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append(", fromX=");
	//   22   40:aload_1         
	//   23   41:ldc1            #51  <String ", fromX=">
	//   24   43:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(fromX);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #27  <Field int fromX>
	//   29   52:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   30   55:pop             
		stringbuilder.append(", fromY=");
	//   31   56:aload_1         
	//   32   57:ldc1            #56  <String ", fromY=">
	//   33   59:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(fromY);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #29  <Field int fromY>
	//   38   68:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   39   71:pop             
		stringbuilder.append(", toX=");
	//   40   72:aload_1         
	//   41   73:ldc1            #58  <String ", toX=">
	//   42   75:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(toX);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #31  <Field int toX>
	//   47   84:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   48   87:pop             
		stringbuilder.append(", toY=");
	//   49   88:aload_1         
	//   50   89:ldc1            #60  <String ", toY=">
	//   51   91:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(toY);
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #33  <Field int toY>
	//   56  100:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   57  103:pop             
		stringbuilder.append('}');
	//   58  104:aload_1         
	//   59  105:bipush          125
	//   60  107:invokevirtual   #63  <Method StringBuilder StringBuilder.append(char)>
	//   61  110:pop             
		return stringbuilder.toString();
	//   62  111:aload_1         
	//   63  112:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   64  115:areturn         
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
	//    1    1:invokespecial   #17  <Method void Object()>
		oldHolder = viewholder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field RecyclerView$ViewHolder oldHolder>
		newHolder = viewholder1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field RecyclerView$ViewHolder newHolder>
	//    8   14:return          
	}

	DefaultItemAnimator$ChangeInfo(RecyclerView.ViewHolder viewholder, RecyclerView.ViewHolder viewholder1, int i, int j, int k, int l)
	{
		this(viewholder, viewholder1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void DefaultItemAnimator$ChangeInfo(RecyclerView$ViewHolder, RecyclerView$ViewHolder)>
		fromX = i;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #27  <Field int fromX>
		fromY = j;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #29  <Field int fromY>
		toX = k;
	//   10   17:aload_0         
	//   11   18:iload           5
	//   12   20:putfield        #31  <Field int toX>
		toY = l;
	//   13   23:aload_0         
	//   14   24:iload           6
	//   15   26:putfield        #33  <Field int toY>
	//   16   29:return          
	}
}
