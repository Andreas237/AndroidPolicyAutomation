// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzxb, zzakb, zzxa

final class zzxc
	implements Runnable
{

	zzxc(zzxb zzxb1, zzxa zzxa1)
	{
		zzbtt = zzxb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzxb zzbtt>
		zzbts = zzxa1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field zzxa zzbts>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
label0:
		{
			synchronized(zzxb.zza(zzbtt))
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field zzxb zzbtt>
	//*   2    4:invokestatic    #27  <Method Object zzxb.zza(zzxb)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
			{
				if(zzxb.zzb(zzbtt) == -2)
					break label0;
	//    6   10:aload_0         
	//    7   11:getfield        #14  <Field zzxb zzbtt>
	//    8   14:invokestatic    #31  <Method int zzxb.zzb(zzxb)>
	//    9   17:bipush          -2
	//   10   19:icmpeq          25
			}
	//   11   22:aload_1         
	//   12   23:monitorexit     
			return;
	//   13   24:return          
		}
		zzxb.zza(zzbtt, zzxb.zzc(zzbtt));
	//   14   25:aload_0         
	//   15   26:getfield        #14  <Field zzxb zzbtt>
	//   16   29:aload_0         
	//   17   30:getfield        #14  <Field zzxb zzbtt>
	//   18   33:invokestatic    #35  <Method zzxq zzxb.zzc(zzxb)>
	//   19   36:invokestatic    #38  <Method zzxq zzxb.zza(zzxb, zzxq)>
	//   20   39:pop             
		if(zzxb.zzd(zzbtt) != null)
			break MISSING_BLOCK_LABEL_61;
	//   21   40:aload_0         
	//   22   41:getfield        #14  <Field zzxb zzbtt>
	//   23   44:invokestatic    #41  <Method zzxq zzxb.zzd(zzxb)>
	//   24   47:ifnonnull       61
		zzbtt.zzx(4);
	//   25   50:aload_0         
	//   26   51:getfield        #14  <Field zzxb zzbtt>
	//   27   54:iconst_4        
	//   28   55:invokevirtual   #45  <Method void zzxb.zzx(int)>
		obj;
	//   29   58:aload_1         
		JVM INSTR monitorexit ;
	//   30   59:monitorexit     
		return;
	//   31   60:return          
		if(!zzxb.zze(zzbtt) || zzxb.zza(zzbtt, 1))
			break MISSING_BLOCK_LABEL_146;
	//   32   61:aload_0         
	//   33   62:getfield        #14  <Field zzxb zzbtt>
	//   34   65:invokestatic    #49  <Method boolean zzxb.zze(zzxb)>
	//   35   68:ifeq            146
	//   36   71:aload_0         
	//   37   72:getfield        #14  <Field zzxb zzbtt>
	//   38   75:iconst_1        
	//   39   76:invokestatic    #52  <Method boolean zzxb.zza(zzxb, int)>
	//   40   79:ifne            146
		String s = zzxb.zzf(zzbtt);
	//   41   82:aload_0         
	//   42   83:getfield        #14  <Field zzxb zzbtt>
	//   43   86:invokestatic    #56  <Method String zzxb.zzf(zzxb)>
	//   44   89:astore_2        
		StringBuilder stringbuilder = new StringBuilder(56 + String.valueOf(((Object) (s))).length());
	//   45   90:new             #58  <Class StringBuilder>
	//   46   93:dup             
	//   47   94:bipush          56
	//   48   96:aload_2         
	//   49   97:invokestatic    #64  <Method String String.valueOf(Object)>
	//   50  100:invokevirtual   #68  <Method int String.length()>
	//   51  103:iadd            
	//   52  104:invokespecial   #70  <Method void StringBuilder(int)>
	//   53  107:astore_3        
		stringbuilder.append("Ignoring adapter ");
	//   54  108:aload_3         
	//   55  109:ldc1            #72  <String "Ignoring adapter ">
	//   56  111:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   57  114:pop             
		stringbuilder.append(s);
	//   58  115:aload_3         
	//   59  116:aload_2         
	//   60  117:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   61  120:pop             
		stringbuilder.append(" as delayed impression is not supported");
	//   62  121:aload_3         
	//   63  122:ldc1            #78  <String " as delayed impression is not supported">
	//   64  124:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   65  127:pop             
		zzakb.zzdk(stringbuilder.toString());
	//   66  128:aload_3         
	//   67  129:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   68  132:invokestatic    #88  <Method void zzakb.zzdk(String)>
		zzbtt.zzx(2);
	//   69  135:aload_0         
	//   70  136:getfield        #14  <Field zzxb zzbtt>
	//   71  139:iconst_2        
	//   72  140:invokevirtual   #45  <Method void zzxb.zzx(int)>
		obj;
	//   73  143:aload_1         
		JVM INSTR monitorexit ;
	//   74  144:monitorexit     
		return;
	//   75  145:return          
		zzbts.zza(((zzxf) (zzbtt)));
	//   76  146:aload_0         
	//   77  147:getfield        #16  <Field zzxa zzbts>
	//   78  150:aload_0         
	//   79  151:getfield        #14  <Field zzxb zzbtt>
	//   80  154:invokevirtual   #93  <Method void zzxa.zza(zzxf)>
		zzxb.zza(zzbtt, zzbts);
	//   81  157:aload_0         
	//   82  158:getfield        #14  <Field zzxb zzbtt>
	//   83  161:aload_0         
	//   84  162:getfield        #16  <Field zzxa zzbts>
	//   85  165:invokestatic    #95  <Method void zzxb.zza(zzxb, zzxa)>
		obj;
	//   86  168:aload_1         
		JVM INSTR monitorexit ;
	//   87  169:monitorexit     
		return;
	//   88  170:return          
		exception;
	//   89  171:astore_2        
		obj;
	//   90  172:aload_1         
		JVM INSTR monitorexit ;
	//   91  173:monitorexit     
		throw exception;
	//   92  174:aload_2         
	//   93  175:athrow          
	}

	private final zzxa zzbts;
	private final zzxb zzbtt;
}
