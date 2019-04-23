// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package android.arch.lifecycle:
//			ComputableLiveData, LiveData

class ComputableLiveData$2
	implements Runnable
{

	public void run()
	{
_L4:
		boolean flag;
		Object obj;
		if(!ComputableLiveData.access$100(ComputableLiveData.this).compareAndSet(false, true))
			break MISSING_BLOCK_LABEL_90;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ComputableLiveData this$0>
	//    2    4:invokestatic    #24  <Method AtomicBoolean ComputableLiveData.access$100(ComputableLiveData)>
	//    3    7:iconst_0        
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #30  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//    6   12:ifeq            90
		obj = null;
	//    7   15:aconst_null     
	//    8   16:astore_2        
		flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_1        
_L2:
		if(!ComputableLiveData.access$200(ComputableLiveData.this).compareAndSet(true, false))
			break; /* Loop/switch isn't completed */
	//   11   19:aload_0         
	//   12   20:getfield        #14  <Field ComputableLiveData this$0>
	//   13   23:invokestatic    #33  <Method AtomicBoolean ComputableLiveData.access$200(ComputableLiveData)>
	//   14   26:iconst_1        
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #30  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//   17   31:ifeq            47
		obj = compute();
	//   18   34:aload_0         
	//   19   35:getfield        #14  <Field ComputableLiveData this$0>
	//   20   38:invokevirtual   #37  <Method Object ComputableLiveData.compute()>
	//   21   41:astore_2        
		flag = true;
	//   22   42:iconst_1        
	//   23   43:istore_1        
		if(true) goto _L2; else goto _L1
	//   24   44:goto            19
_L1:
		if(!flag)
			break MISSING_BLOCK_LABEL_62;
	//   25   47:iload_1         
	//   26   48:ifeq            62
		ComputableLiveData.access$300(ComputableLiveData.this).postValue(obj);
	//   27   51:aload_0         
	//   28   52:getfield        #14  <Field ComputableLiveData this$0>
	//   29   55:invokestatic    #41  <Method LiveData ComputableLiveData.access$300(ComputableLiveData)>
	//   30   58:aload_2         
	//   31   59:invokevirtual   #47  <Method void LiveData.postValue(Object)>
		ComputableLiveData.access$100(ComputableLiveData.this).set(false);
	//   32   62:aload_0         
	//   33   63:getfield        #14  <Field ComputableLiveData this$0>
	//   34   66:invokestatic    #24  <Method AtomicBoolean ComputableLiveData.access$100(ComputableLiveData)>
	//   35   69:iconst_0        
	//   36   70:invokevirtual   #51  <Method void AtomicBoolean.set(boolean)>
		continue; /* Loop/switch isn't completed */
	//   37   73:goto            92
		Exception exception;
		exception;
	//   38   76:astore_2        
		ComputableLiveData.access$100(ComputableLiveData.this).set(false);
	//   39   77:aload_0         
	//   40   78:getfield        #14  <Field ComputableLiveData this$0>
	//   41   81:invokestatic    #24  <Method AtomicBoolean ComputableLiveData.access$100(ComputableLiveData)>
	//   42   84:iconst_0        
	//   43   85:invokevirtual   #51  <Method void AtomicBoolean.set(boolean)>
		throw exception;
	//   44   88:aload_2         
	//   45   89:athrow          
		flag = false;
	//   46   90:iconst_0        
	//   47   91:istore_1        
		if(flag && ComputableLiveData.access$200(ComputableLiveData.this).get()) goto _L4; else goto _L3
	//   48   92:iload_1         
	//   49   93:ifeq            109
	//   50   96:aload_0         
	//   51   97:getfield        #14  <Field ComputableLiveData this$0>
	//   52  100:invokestatic    #33  <Method AtomicBoolean ComputableLiveData.access$200(ComputableLiveData)>
	//   53  103:invokevirtual   #55  <Method boolean AtomicBoolean.get()>
	//   54  106:ifne            0
_L3:
	//   55  109:return          
	}

	final ComputableLiveData this$0;

	ComputableLiveData$2()
	{
		this$0 = ComputableLiveData.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ComputableLiveData this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
