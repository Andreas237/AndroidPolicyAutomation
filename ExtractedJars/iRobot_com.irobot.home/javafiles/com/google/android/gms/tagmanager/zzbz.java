// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzsr;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzby, zzdi, zzca, zzcb

final class zzbz extends Thread
	implements zzby
{

	private zzbz(Context context)
	{
		super("GAThread");
	//    0    0:aload_0         
	//    1    1:ldc1            #22  <String "GAThread">
	//    2    3:invokespecial   #25  <Method void Thread(String)>
	//    3    6:aload_0         
	//    4    7:new             #27  <Class LinkedBlockingQueue>
	//    5   10:dup             
	//    6   11:invokespecial   #30  <Method void LinkedBlockingQueue()>
	//    7   14:putfield        #32  <Field LinkedBlockingQueue zzbco>
		zzbcp = false;
	//    8   17:aload_0         
	//    9   18:iconst_0        
	//   10   19:putfield        #34  <Field boolean zzbcp>
		closed = false;
	//   11   22:aload_0         
	//   12   23:iconst_0        
	//   13   24:putfield        #36  <Field boolean closed>
		Context context1 = context;
	//   14   27:aload_1         
	//   15   28:astore_2        
		if(context != null)
	//*  16   29:aload_1         
	//*  17   30:ifnull          38
			context1 = context.getApplicationContext();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #42  <Method Context Context.getApplicationContext()>
	//   20   37:astore_2        
		zzri = context1;
	//   21   38:aload_0         
	//   22   39:aload_2         
	//   23   40:putfield        #44  <Field Context zzri>
		start();
	//   24   43:aload_0         
	//   25   44:invokevirtual   #47  <Method void start()>
	//   26   47:return          
	}

	static zzcb zza(zzbz zzbz1)
	{
		return zzbz1.zzbcr;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field zzcb zzbcr>
	//    2    4:areturn         
	}

	static zzcb zza(zzbz zzbz1, zzcb zzcb)
	{
		zzbz1.zzbcr = zzcb;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field zzcb zzbcr>
		return zzcb;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Context zzb(zzbz zzbz1)
	{
		return zzbz1.zzri;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Context zzri>
	//    2    4:areturn         
	}

	static zzbz zzv(Context context)
	{
		if(zzbcq == null)
	//*   0    0:getstatic       #59  <Field zzbz zzbcq>
	//*   1    3:ifnonnull       17
			zzbcq = new zzbz(context);
	//    2    6:new             #2   <Class zzbz>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #61  <Method void zzbz(Context)>
	//    6   14:putstatic       #59  <Field zzbz zzbcq>
		return zzbcq;
	//    7   17:getstatic       #59  <Field zzbz zzbcq>
	//    8   20:areturn         
	}

	public final void run()
	{
_L2:
		boolean flag = closed;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean closed>
	//    2    4:istore_1        
		Object obj;
		Runnable runnable = (Runnable)zzbco.take();
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field LinkedBlockingQueue zzbco>
	//    5    9:invokevirtual   #70  <Method Object LinkedBlockingQueue.take()>
	//    6   12:checkcast       #72  <Class Runnable>
	//    7   15:astore_2        
		if(!zzbcp)
	//*   8   16:aload_0         
	//*   9   17:getfield        #34  <Field boolean zzbcp>
	//*  10   20:ifne            0
			runnable.run();
	//   11   23:aload_2         
	//   12   24:invokeinterface #74  <Method void Runnable.run()>
		continue; /* Loop/switch isn't completed */
	//   13   29:goto            0
	//*  14   32:astore_2        
	//*  15   33:goto            47
		obj;
	//   16   36:astore_2        
		try
		{
			zzdi.zzdm(((InterruptedException) (obj)).toString());
	//   17   37:aload_2         
	//   18   38:invokevirtual   #78  <Method String InterruptedException.toString()>
	//   19   41:invokestatic    #83  <Method void zzdi.zzdm(String)>
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  20   44:goto            0
		{
			ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//   21   47:new             #85  <Class ByteArrayOutputStream>
	//   22   50:dup             
	//   23   51:invokespecial   #86  <Method void ByteArrayOutputStream()>
	//   24   54:astore_3        
			PrintStream printstream = new PrintStream(((java.io.OutputStream) (bytearrayoutputstream)));
	//   25   55:new             #88  <Class PrintStream>
	//   26   58:dup             
	//   27   59:aload_3         
	//   28   60:invokespecial   #91  <Method void PrintStream(java.io.OutputStream)>
	//   29   63:astore          4
			zzsr.zza(((Throwable) (obj)), printstream);
	//   30   65:aload_2         
	//   31   66:aload           4
	//   32   68:invokestatic    #96  <Method void zzsr.zza(Throwable, PrintStream)>
			printstream.flush();
	//   33   71:aload           4
	//   34   73:invokevirtual   #99  <Method void PrintStream.flush()>
			String s = String.valueOf(((Object) (new String(bytearrayoutputstream.toByteArray()))));
	//   35   76:new             #101 <Class String>
	//   36   79:dup             
	//   37   80:aload_3         
	//   38   81:invokevirtual   #105 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   39   84:invokespecial   #108 <Method void String(byte[])>
	//   40   87:invokestatic    #112 <Method String String.valueOf(Object)>
	//   41   90:astore_2        
			if(s.length() != 0)
	//*  42   91:aload_2         
	//*  43   92:invokevirtual   #116 <Method int String.length()>
	//*  44   95:ifeq            108
				s = "Error on Google TagManager Thread: ".concat(s);
	//   45   98:ldc1            #118 <String "Error on Google TagManager Thread: ">
	//   46  100:aload_2         
	//   47  101:invokevirtual   #122 <Method String String.concat(String)>
	//   48  104:astore_2        
			else
	//*  49  105:goto            118
				s = new String("Error on Google TagManager Thread: ");
	//   50  108:new             #101 <Class String>
	//   51  111:dup             
	//   52  112:ldc1            #118 <String "Error on Google TagManager Thread: ">
	//   53  114:invokespecial   #123 <Method void String(String)>
	//   54  117:astore_2        
			zzdi.e(s);
	//   55  118:aload_2         
	//   56  119:invokestatic    #126 <Method void zzdi.e(String)>
			zzdi.e("Google TagManager is shutting down.");
	//   57  122:ldc1            #128 <String "Google TagManager is shutting down.">
	//   58  124:invokestatic    #126 <Method void zzdi.e(String)>
			zzbcp = true;
	//   59  127:aload_0         
	//   60  128:iconst_1        
	//   61  129:putfield        #34  <Field boolean zzbcp>
		}
		if(true) goto _L2; else goto _L1
	//   62  132:goto            0
_L1:
	}

	public final void zzdt(String s)
	{
		zzh(((Runnable) (new zzca(this, ((zzby) (this)), System.currentTimeMillis(), s))));
	//    0    0:aload_0         
	//    1    1:new             #131 <Class zzca>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokestatic    #137 <Method long System.currentTimeMillis()>
	//    6   10:aload_1         
	//    7   11:invokespecial   #140 <Method void zzca(zzbz, zzby, long, String)>
	//    8   14:invokevirtual   #144 <Method void zzh(Runnable)>
	//    9   17:return          
	}

	public final void zzh(Runnable runnable)
	{
		zzbco.add(((Object) (runnable)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field LinkedBlockingQueue zzbco>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #148 <Method boolean LinkedBlockingQueue.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	private static zzbz zzbcq;
	private volatile boolean closed;
	private final LinkedBlockingQueue zzbco = new LinkedBlockingQueue();
	private volatile boolean zzbcp;
	private volatile zzcb zzbcr;
	private final Context zzri;
}
