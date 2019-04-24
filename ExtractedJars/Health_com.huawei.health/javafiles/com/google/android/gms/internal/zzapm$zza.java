// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.fitness.result.DataReadResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzapm

static class zzapm$zza extends zzaom$zza
{

	public void zza(DataReadResult datareadresult)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(Log.isLoggable("Fitness", 2))
	//*   2    2:ldc1            #34  <String "Fitness">
	//*   3    4:iconst_2        
	//*   4    5:invokestatic    #40  <Method boolean Log.isLoggable(String, int)>
	//*   5    8:ifeq            43
		{
			int i = zzaUV;
	//    6   11:aload_0         
	//    7   12:getfield        #21  <Field int zzaUV>
	//    8   15:istore_2        
			Log.v("Fitness", (new StringBuilder(33)).append("Received batch result ").append(i).toString());
	//    9   16:ldc1            #34  <String "Fitness">
	//   10   18:new             #42  <Class StringBuilder>
	//   11   21:dup             
	//   12   22:bipush          33
	//   13   24:invokespecial   #45  <Method void StringBuilder(int)>
	//   14   27:ldc1            #47  <String "Received batch result ">
	//   15   29:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:iload_2         
	//   17   33:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   18   36:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   19   39:invokestatic    #62  <Method int Log.v(String, String)>
	//   20   42:pop             
		}
		if(zzaUW == null)
	//*  21   43:aload_0         
	//*  22   44:getfield        #23  <Field DataReadResult zzaUW>
	//*  23   47:ifnonnull       58
		{
			zzaUW = datareadresult;
	//   24   50:aload_0         
	//   25   51:aload_1         
	//   26   52:putfield        #23  <Field DataReadResult zzaUW>
			break MISSING_BLOCK_LABEL_66;
	//   27   55:goto            66
		}
		zzaUW.zzb(datareadresult);
	//   28   58:aload_0         
	//   29   59:getfield        #23  <Field DataReadResult zzaUW>
	//   30   62:aload_1         
	//   31   63:invokevirtual   #67  <Method void DataReadResult.zzb(DataReadResult)>
		zzaUV = zzaUV + 1;
	//   32   66:aload_0         
	//   33   67:aload_0         
	//   34   68:getfield        #21  <Field int zzaUV>
	//   35   71:iconst_1        
	//   36   72:iadd            
	//   37   73:putfield        #21  <Field int zzaUV>
		if(zzaUV == zzaUW.zzDq())
	//*  38   76:aload_0         
	//*  39   77:getfield        #21  <Field int zzaUV>
	//*  40   80:aload_0         
	//*  41   81:getfield        #23  <Field DataReadResult zzaUW>
	//*  42   84:invokevirtual   #71  <Method int DataReadResult.zzDq()>
	//*  43   87:icmpne          103
			zzaGN.setResult(((Object) (zzaUW)));
	//   44   90:aload_0         
	//   45   91:getfield        #25  <Field zzaad$zzb zzaGN>
	//   46   94:aload_0         
	//   47   95:getfield        #23  <Field DataReadResult zzaUW>
	//   48   98:invokeinterface #77  <Method void zzaad$zzb.setResult(Object)>
		this;
	//   49  103:aload_0         
		JVM INSTR monitorexit ;
	//   50  104:monitorexit     
		return;
	//   51  105:return          
		datareadresult;
	//   52  106:astore_1        
	//*  53  107:aload_0         
		throw datareadresult;
	//   54  108:monitorexit     
	//   55  109:aload_1         
	//   56  110:athrow          
	}

	private final zzaad$zzb zzaGN;
	private int zzaUV;
	private DataReadResult zzaUW;

	private zzapm$zza(zzaad$zzb zzaad$zzb1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void zzaom$zza()>
		zzaUV = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field int zzaUV>
		zzaUW = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #23  <Field DataReadResult zzaUW>
		zzaGN = zzaad$zzb1;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #25  <Field zzaad$zzb zzaGN>
	//   11   19:return          
	}

	zzapm$zza(zzaad$zzb zzaad$zzb1, zzapm._cls1 _pcls1)
	{
		this(zzaad$zzb1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void zzapm$zza(zzaad$zzb)>
	//    3    5:return          
	}
}
