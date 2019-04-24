// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.view.View;

// Referenced classes of package android.databinding:
//			ViewDataBinding

class ViewDataBinding$6
	implements Runnable
{

	public void run()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ViewDataBinding.access$202(ViewDataBinding.this, false);
	//    2    2:aload_0         
	//    3    3:getfield        #14  <Field ViewDataBinding this$0>
	//    4    6:iconst_0        
	//    5    7:invokestatic    #23  <Method boolean ViewDataBinding.access$202(ViewDataBinding, boolean)>
	//    6   10:pop             
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		ViewDataBinding.access$300();
	//    9   13:invokestatic    #26  <Method void ViewDataBinding.access$300()>
		Exception exception;
		if(android.os.Build.VERSION.SDK_INT >= 19 && !ViewDataBinding.access$400(ViewDataBinding.this).isAttachedToWindow())
	//*  10   16:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   19:bipush          19
	//*  12   21:icmplt          69
	//*  13   24:aload_0         
	//*  14   25:getfield        #14  <Field ViewDataBinding this$0>
	//*  15   28:invokestatic    #36  <Method View ViewDataBinding.access$400(ViewDataBinding)>
	//*  16   31:invokevirtual   #42  <Method boolean View.isAttachedToWindow()>
	//*  17   34:ifne            69
		{
			ViewDataBinding.access$400(ViewDataBinding.this).removeOnAttachStateChangeListener(ViewDataBinding.access$500());
	//   18   37:aload_0         
	//   19   38:getfield        #14  <Field ViewDataBinding this$0>
	//   20   41:invokestatic    #36  <Method View ViewDataBinding.access$400(ViewDataBinding)>
	//   21   44:invokestatic    #46  <Method android.view.View$OnAttachStateChangeListener ViewDataBinding.access$500()>
	//   22   47:invokevirtual   #50  <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
			ViewDataBinding.access$400(ViewDataBinding.this).addOnAttachStateChangeListener(ViewDataBinding.access$500());
	//   23   50:aload_0         
	//   24   51:getfield        #14  <Field ViewDataBinding this$0>
	//   25   54:invokestatic    #36  <Method View ViewDataBinding.access$400(ViewDataBinding)>
	//   26   57:invokestatic    #46  <Method android.view.View$OnAttachStateChangeListener ViewDataBinding.access$500()>
	//   27   60:invokevirtual   #53  <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
			return;
	//   28   63:return          
		} else
	//*  29   64:astore_1        
	//*  30   65:aload_0         
	//*  31   66:monitorexit     
	//*  32   67:aload_1         
	//*  33   68:athrow          
		{
			executePendingBindings();
	//   34   69:aload_0         
	//   35   70:getfield        #14  <Field ViewDataBinding this$0>
	//   36   73:invokevirtual   #56  <Method void ViewDataBinding.executePendingBindings()>
			return;
	//   37   76:return          
		}
		exception;
		this;
		JVM INSTR monitorexit ;
		throw exception;
	}

	final ViewDataBinding this$0;

	ViewDataBinding$6()
	{
		this$0 = ViewDataBinding.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ViewDataBinding this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
