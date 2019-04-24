// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			kk

public final class jc extends Thread
{

	public final void run()
	{
_L3:
		if(!kk.d(b)) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field kk b>
	//    2    4:invokestatic    #18  <Method boolean kk.d(kk)>
	//    3    7:ifeq            45
_L1:
		kk.e(b, kk.i(b), 1, System.currentTimeMillis());
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field kk b>
	//    6   14:aload_0         
	//    7   15:getfield        #12  <Field kk b>
	//    8   18:invokestatic    #22  <Method android.location.Location kk.i(kk)>
	//    9   21:iconst_1        
	//   10   22:invokestatic    #28  <Method long System.currentTimeMillis()>
	//   11   25:invokestatic    #32  <Method void kk.e(kk, android.location.Location, int, long)>
		Exception exception;
		try
		{
			Thread.sleep(kk.k(b));
	//   12   28:aload_0         
	//   13   29:getfield        #12  <Field kk b>
	//   14   32:invokestatic    #36  <Method int kk.k(kk)>
	//   15   35:i2l             
	//   16   36:invokestatic    #40  <Method void Thread.sleep(long)>
		}
	//*  17   39:goto            0
	//*  18   42:goto            0
	//*  19   45:return          
	//*  20   46:astore_1        
	//*  21   47:return          
		catch(Exception exception1) { }
	//   22   48:astore_1        
		if(true) goto _L3; else goto _L2
	//   23   49:goto            42
_L2:
		return;
		exception;
	}

	private kk b;
}
