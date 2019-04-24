// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


// Referenced classes of package android.databinding:
//			ListChangeRegistry, ObservableList

static final class ListChangeRegistry$1 extends fierCallback
{

	public void onNotifyCallback(ChangedCallback changedcallback, ObservableList observablelist, int i, stChanges stchanges)
	{
		switch(i)
	//*   0    0:iload_3         
		{
	//*   1    1:tableswitch     1 4: default 32
	//	               1 38
	//	               2 54
	//	               3 70
	//	               4 91
		default:
			changedcallback.onChanged(observablelist);
	//    2   32:aload_1         
	//    3   33:aload_2         
	//    4   34:invokevirtual   #20  <Method void ObservableList$OnListChangedCallback.onChanged(ObservableList)>
			return;
	//    5   37:return          

		case 1: // '\001'
			changedcallback.onItemRangeChanged(observablelist, stchanges.start, stchanges.count);
	//    6   38:aload_1         
	//    7   39:aload_2         
	//    8   40:aload           4
	//    9   42:getfield        #26  <Field int ListChangeRegistry$ListChanges.start>
	//   10   45:aload           4
	//   11   47:getfield        #29  <Field int ListChangeRegistry$ListChanges.count>
	//   12   50:invokevirtual   #33  <Method void ObservableList$OnListChangedCallback.onItemRangeChanged(ObservableList, int, int)>
			return;
	//   13   53:return          

		case 2: // '\002'
			changedcallback.onItemRangeInserted(observablelist, stchanges.start, stchanges.count);
	//   14   54:aload_1         
	//   15   55:aload_2         
	//   16   56:aload           4
	//   17   58:getfield        #26  <Field int ListChangeRegistry$ListChanges.start>
	//   18   61:aload           4
	//   19   63:getfield        #29  <Field int ListChangeRegistry$ListChanges.count>
	//   20   66:invokevirtual   #36  <Method void ObservableList$OnListChangedCallback.onItemRangeInserted(ObservableList, int, int)>
			return;
	//   21   69:return          

		case 3: // '\003'
			changedcallback.onItemRangeMoved(observablelist, stchanges.start, stchanges.to, stchanges.count);
	//   22   70:aload_1         
	//   23   71:aload_2         
	//   24   72:aload           4
	//   25   74:getfield        #26  <Field int ListChangeRegistry$ListChanges.start>
	//   26   77:aload           4
	//   27   79:getfield        #39  <Field int ListChangeRegistry$ListChanges.to>
	//   28   82:aload           4
	//   29   84:getfield        #29  <Field int ListChangeRegistry$ListChanges.count>
	//   30   87:invokevirtual   #43  <Method void ObservableList$OnListChangedCallback.onItemRangeMoved(ObservableList, int, int, int)>
			return;
	//   31   90:return          

		case 4: // '\004'
			changedcallback.onItemRangeRemoved(observablelist, stchanges.start, stchanges.count);
	//   32   91:aload_1         
	//   33   92:aload_2         
	//   34   93:aload           4
	//   35   95:getfield        #26  <Field int ListChangeRegistry$ListChanges.start>
	//   36   98:aload           4
	//   37  100:getfield        #29  <Field int ListChangeRegistry$ListChanges.count>
	//   38  103:invokevirtual   #46  <Method void ObservableList$OnListChangedCallback.onItemRangeRemoved(ObservableList, int, int)>
			break;
		}
	//   39  106:return          
	}

	public volatile void onNotifyCallback(Object obj, Object obj1, int i, Object obj2)
	{
		onNotifyCallback((ChangedCallback)obj, (ObservableList)obj1, i, (stChanges)obj2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class ObservableList$OnListChangedCallback>
	//    3    5:aload_2         
	//    4    6:checkcast       #49  <Class ObservableList>
	//    5    9:iload_3         
	//    6   10:aload           4
	//    7   12:checkcast       #22  <Class ListChangeRegistry$ListChanges>
	//    8   15:invokevirtual   #51  <Method void onNotifyCallback(ObservableList$OnListChangedCallback, ObservableList, int, ListChangeRegistry$ListChanges)>
	//    9   18:return          
	}

	ListChangeRegistry$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void CallbackRegistry$NotifierCallback()>
	//    2    4:return          
	}
}
