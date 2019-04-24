// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.maploader;


public class ProcessingTile
{

	public ProcessingTile(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mCreateTime = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #27  <Field long mCreateTime>
		setParams(s);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #30  <Method void setParams(String)>
	//    8   14:return          
	}

	public static ProcessingTile obtain(String s)
	{
		ProcessingTile processingtile = (ProcessingTile)M_POOL.acquire();
	//    0    0:getstatic       #21  <Field Pools$SynchronizedPool M_POOL>
	//    1    3:invokevirtual   #36  <Method Object Pools$SynchronizedPool.acquire()>
	//    2    6:checkcast       #2   <Class ProcessingTile>
	//    3    9:astore_1        
		if(processingtile != null)
	//*   4   10:aload_1         
	//*   5   11:ifnull          21
		{
			processingtile.setParams(s);
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:invokespecial   #30  <Method void setParams(String)>
			return processingtile;
	//    9   19:aload_1         
	//   10   20:areturn         
		} else
		{
			return new ProcessingTile(s);
	//   11   21:new             #2   <Class ProcessingTile>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokespecial   #38  <Method void ProcessingTile(String)>
	//   15   29:areturn         
		}
	}

	private void setParams(String s)
	{
		mKeyName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field String mKeyName>
		mCreateTime = System.currentTimeMillis() / 1000L;
	//    3    5:aload_0         
	//    4    6:invokestatic    #46  <Method long System.currentTimeMillis()>
	//    5    9:ldc2w           #47  <Long 1000L>
	//    6   12:ldiv            
	//    7   13:putfield        #27  <Field long mCreateTime>
	//    8   16:return          
	}

	public void recycle()
	{
		mKeyName = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #40  <Field String mKeyName>
		mCreateTime = 0L;
	//    3    5:aload_0         
	//    4    6:lconst_0        
	//    5    7:putfield        #27  <Field long mCreateTime>
		M_POOL.release(((Object) (this)));
	//    6   10:getstatic       #21  <Field Pools$SynchronizedPool M_POOL>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #53  <Method boolean Pools$SynchronizedPool.release(Object)>
	//    9   17:pop             
	//   10   18:return          
	}

	private static final Pools.SynchronizedPool M_POOL = new Pools.SynchronizedPool(30);
	public long mCreateTime;
	public String mKeyName;

	static 
	{
	//    0    0:new             #15  <Class Pools$SynchronizedPool>
	//    1    3:dup             
	//    2    4:bipush          30
	//    3    6:invokespecial   #19  <Method void Pools$SynchronizedPool(int)>
	//    4    9:putstatic       #21  <Field Pools$SynchronizedPool M_POOL>
	//*   5   12:return          
	}
}
