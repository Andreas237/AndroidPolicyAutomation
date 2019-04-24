// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


// Referenced classes of package android.databinding:
//			ViewDataBinding, OnRebindCallback

static final class ViewDataBinding$4 extends otifierCallback
{

	public void onNotifyCallback(OnRebindCallback onrebindcallback, ViewDataBinding viewdatabinding, int i, Void void1)
	{
		i;
	//    0    0:iload_3         
		JVM INSTR tableswitch 1 3: default 28
	//	               1 29
	//	               2 44
	//	               3 50;
	//    1    1:tableswitch     1 3: default 28
	//	               1 29
	//	               2 44
	//	               3 50
		   goto _L1 _L2 _L3 _L4
_L1:
		return;
	//    2   28:return          
_L2:
		if(!onrebindcallback.onPreBind(viewdatabinding))
	//*   3   29:aload_1         
	//*   4   30:aload_2         
	//*   5   31:invokevirtual   #20  <Method boolean OnRebindCallback.onPreBind(ViewDataBinding)>
	//*   6   34:ifne            28
		{
			ViewDataBinding.access$002(viewdatabinding, true);
	//    7   37:aload_2         
	//    8   38:iconst_1        
	//    9   39:invokestatic    #24  <Method boolean ViewDataBinding.access$002(ViewDataBinding, boolean)>
	//   10   42:pop             
			return;
	//   11   43:return          
		}
		  goto _L1
_L3:
		onrebindcallback.onCanceled(viewdatabinding);
	//   12   44:aload_1         
	//   13   45:aload_2         
	//   14   46:invokevirtual   #28  <Method void OnRebindCallback.onCanceled(ViewDataBinding)>
		return;
	//   15   49:return          
_L4:
		onrebindcallback.onBound(viewdatabinding);
	//   16   50:aload_1         
	//   17   51:aload_2         
	//   18   52:invokevirtual   #31  <Method void OnRebindCallback.onBound(ViewDataBinding)>
		return;
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

	ViewDataBinding$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void CallbackRegistry$NotifierCallback()>
	//    2    4:return          
	}
}
