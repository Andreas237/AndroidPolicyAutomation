// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzamu, zzjr, zzjh, zzjg, 
//			zzme, zzrv, zzahi, zzaao, 
//			zzrw, zzng, zznh, zzni

public final class zzkb
{

	protected zzkb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #34  <Class zzamu>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void zzamu()>
	//    6   12:putfield        #37  <Field zzamu zzasa>
	//    7   15:aload_0         
	//    8   16:new             #39  <Class zzjr>
	//    9   19:dup             
	//   10   20:new             #41  <Class zzjh>
	//   11   23:dup             
	//   12   24:invokespecial   #42  <Method void zzjh()>
	//   13   27:new             #44  <Class zzjg>
	//   14   30:dup             
	//   15   31:invokespecial   #45  <Method void zzjg()>
	//   16   34:new             #47  <Class zzme>
	//   17   37:dup             
	//   18   38:invokespecial   #48  <Method void zzme()>
	//   19   41:new             #50  <Class zzrv>
	//   20   44:dup             
	//   21   45:invokespecial   #51  <Method void zzrv()>
	//   22   48:new             #53  <Class zzahi>
	//   23   51:dup             
	//   24   52:invokespecial   #54  <Method void zzahi()>
	//   25   55:new             #56  <Class zzaao>
	//   26   58:dup             
	//   27   59:invokespecial   #57  <Method void zzaao()>
	//   28   62:new             #59  <Class zzrw>
	//   29   65:dup             
	//   30   66:invokespecial   #60  <Method void zzrw()>
	//   31   69:invokespecial   #63  <Method void zzjr(zzjh, zzjg, zzme, zzrv, zzahi, zzaao, zzrw)>
	//   32   72:putfield        #65  <Field zzjr zzasb>
	//   33   75:aload_0         
	//   34   76:invokestatic    #69  <Method String zzamu.zzsi()>
	//   35   79:putfield        #71  <Field String zzasc>
	//   36   82:aload_0         
	//   37   83:new             #73  <Class zzng>
	//   38   86:dup             
	//   39   87:invokespecial   #74  <Method void zzng()>
	//   40   90:putfield        #76  <Field zzng zzasd>
	//   41   93:aload_0         
	//   42   94:new             #78  <Class zznh>
	//   43   97:dup             
	//   44   98:invokespecial   #79  <Method void zznh()>
	//   45  101:putfield        #81  <Field zznh zzase>
	//   46  104:aload_0         
	//   47  105:new             #83  <Class zzni>
	//   48  108:dup             
	//   49  109:invokespecial   #84  <Method void zzni()>
	//   50  112:putfield        #86  <Field zzni zzasf>
	//   51  115:return          
	}

	private static zzkb zzie()
	{
		zzkb zzkb1;
		synchronized(sLock)
	//*   0    0:getstatic       #28  <Field Object sLock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			zzkb1 = zzarz;
	//    4    6:getstatic       #31  <Field zzkb zzarz>
	//    5    9:astore_1        
		}
	//    6   10:aload_0         
	//    7   11:monitorexit     
		return zzkb1;
	//    8   12:aload_1         
	//    9   13:areturn         
		exception;
	//   10   14:astore_1        
		obj;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		throw exception;
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public static zzamu zzif()
	{
		return zzie().zzasa;
	//    0    0:invokestatic    #92  <Method zzkb zzie()>
	//    1    3:getfield        #37  <Field zzamu zzasa>
	//    2    6:areturn         
	}

	public static zzjr zzig()
	{
		return zzie().zzasb;
	//    0    0:invokestatic    #92  <Method zzkb zzie()>
	//    1    3:getfield        #65  <Field zzjr zzasb>
	//    2    6:areturn         
	}

	public static String zzih()
	{
		return zzie().zzasc;
	//    0    0:invokestatic    #92  <Method zzkb zzie()>
	//    1    3:getfield        #71  <Field String zzasc>
	//    2    6:areturn         
	}

	public static zznh zzii()
	{
		return zzie().zzase;
	//    0    0:invokestatic    #92  <Method zzkb zzie()>
	//    1    3:getfield        #81  <Field zznh zzase>
	//    2    6:areturn         
	}

	public static zzng zzij()
	{
		return zzie().zzasd;
	//    0    0:invokestatic    #92  <Method zzkb zzie()>
	//    1    3:getfield        #76  <Field zzng zzasd>
	//    2    6:areturn         
	}

	public static zzni zzik()
	{
		return zzie().zzasf;
	//    0    0:invokestatic    #92  <Method zzkb zzie()>
	//    1    3:getfield        #86  <Field zzni zzasf>
	//    2    6:areturn         
	}

	private static final Object sLock;
	private static zzkb zzarz;
	private final zzamu zzasa = new zzamu();
	private final zzjr zzasb = new zzjr(new zzjh(), new zzjg(), new zzme(), new zzrv(), new zzahi(), new zzaao(), new zzrw());
	private final String zzasc = zzamu.zzsi();
	private final zzng zzasd = new zzng();
	private final zznh zzase = new zznh();
	private final zzni zzasf = new zzni();

	static 
	{
		sLock = new Object();
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void Object()>
	//    3    7:putstatic       #28  <Field Object sLock>
		zzkb zzkb1 = new zzkb();
	//    4   10:new             #2   <Class zzkb>
	//    5   13:dup             
	//    6   14:invokespecial   #29  <Method void zzkb()>
	//    7   17:astore_1        
		synchronized(sLock)
	//*   8   18:getstatic       #28  <Field Object sLock>
	//*   9   21:astore_0        
	//*  10   22:aload_0         
	//*  11   23:monitorenter    
		{
			zzarz = zzkb1;
	//   12   24:aload_1         
	//   13   25:putstatic       #31  <Field zzkb zzarz>
		}
	//   14   28:aload_0         
	//   15   29:monitorexit     
		return;
	//   16   30:return          
		exception;
	//   17   31:astore_1        
		obj;
	//   18   32:aload_0         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		throw exception;
	//   20   34:aload_1         
	//   21   35:athrow          
	}
}
