// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


// Referenced classes of package android.databinding:
//			ViewDataBinding, OnRebindCallback

static final class ViewDataBinding$5 extends otifierCallback
{

	public void onNotifyCallback(OnRebindCallback onrebindcallback, ViewDataBinding viewdatabinding, int i, Void void1)
	{
		switch(i)
	//*   0    0:iload_3         
		{
	//*   1    1:tableswitch     1 3: default 28
	//	               1 41
	//	               2 35
	//	               3 29
		default:
			return;
	//    2   28:return          

		case 3: // '\003'
			onrebindcallback.onBound(viewdatabinding);
	//    3   29:aload_1         
	//    4   30:aload_2         
	//    5   31:invokevirtual   #20  <Method void OnRebindCallback.onBound(ViewDataBinding)>
			return;
	//    6   34:return          

		case 2: // '\002'
			onrebindcallback.onCanceled(viewdatabinding);
	//    7   35:aload_1         
	//    8   36:aload_2         
	//    9   37:invokevirtual   #23  <Method void OnRebindCallback.onCanceled(ViewDataBinding)>
			return;
	//   10   40:return          

		case 1: // '\001'
			break;
		}
		if(!onrebindcallback.onPreBind(viewdatabinding))
	//*  11   41:aload_1         
	//*  12   42:aload_2         
	//*  13   43:invokevirtual   #27  <Method boolean OnRebindCallback.onPreBind(ViewDataBinding)>
	//*  14   46:ifne            55
			ViewDataBinding.access$002(viewdatabinding, true);
	//   15   49:aload_2         
	//   16   50:iconst_1        
	//   17   51:invokestatic    #31  <Method boolean ViewDataBinding.access$002(ViewDataBinding, boolean)>
	//   18   54:pop             
	//   19   55:return          
	}

	public volatile void onNotifyCallback(Object obj, Object obj1, int i, Object obj2)
	{
		onNotifyCallback((OnRebindCallback)obj, (ViewDataBinding)obj1, i, (Void)obj2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class OnRebindCallback>
	//    3    5:aload_2         
	//    4    6:checkcast       #7   <Class ViewDataBinding>
	//    5    9:iload_3         
	//    6   10:aload           4
	//    7   12:checkcast       #34  <Class Void>
	//    8   15:invokevirtual   #36  <Method void onNotifyCallback(OnRebindCallback, ViewDataBinding, int, Void)>
	//    9   18:return          
	}

	ViewDataBinding$5()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void CallbackRegistry$NotifierCallback()>
	//    2    4:return          
	}
}
