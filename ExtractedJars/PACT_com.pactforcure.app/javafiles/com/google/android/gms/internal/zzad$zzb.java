// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbut, zzad, zzbum, zzbul, 
//			zzbuw

public static final class zzad$zzb extends zzbut
{

	public void zza(zzbum zzbum1)
		throws IOException
	{
		if(zzaL != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Integer zzaL>
	//*   2    4:ifnull          20
			zzbum1.zzF(27, zzaL.intValue());
	//    3    7:aload_1         
	//    4    8:bipush          27
	//    5   10:aload_0         
	//    6   11:getfield        #24  <Field Integer zzaL>
	//    7   14:invokevirtual   #30  <Method int Integer.intValue()>
	//    8   17:invokevirtual   #36  <Method void zzbum.zzF(int, int)>
		super.zza(zzbum1);
	//    9   20:aload_0         
	//   10   21:aload_1         
	//   11   22:invokespecial   #38  <Method void zzbut.zza(zzbum)>
	//   12   25:return          
	}

	public zzbut zzb(zzbul zzbul1)
		throws IOException
	{
		return ((zzbut) (zzc(zzbul1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #44  <Method zzad$zzb zzc(zzbul)>
	//    3    5:areturn         
	}

	public zzad$zzb zzc(zzbul zzbul1)
		throws IOException
	{
_L4:
		int i = zzbul1.zzacu();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #49  <Method int zzbul.zzacu()>
	//    2    4:istore_2        
		i;
	//    3    5:iload_2         
		JVM INSTR lookupswitch 2: default 32
	//	               0: 40
	//	               216: 42;
	//    4    6:lookupswitch    2: default 32
	//	               0: 40
	//	               216: 42
		   goto _L1 _L2 _L3
_L1:
		if(zzbuw.zzb(zzbul1, i)) goto _L4; else goto _L2
	//    5   32:aload_1         
	//    6   33:iload_2         
	//    7   34:invokestatic    #54  <Method boolean zzbuw.zzb(zzbul, int)>
	//    8   37:ifne            0
_L2:
		return this;
	//    9   40:aload_0         
	//   10   41:areturn         
_L3:
		int j = zzbul1.zzacy();
	//   11   42:aload_1         
	//   12   43:invokevirtual   #57  <Method int zzbul.zzacy()>
	//   13   46:istore_2        
		switch(j)
	//*  14   47:iload_2         
		{
	//*  15   48:tableswitch     0 4: default 84
	//	               0 87
	//	               1 87
	//	               2 87
	//	               3 87
	//	               4 87
	//*  16   84:goto            0
		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
			zzaL = Integer.valueOf(j);
	//   17   87:aload_0         
	//   18   88:iload_2         
	//   19   89:invokestatic    #61  <Method Integer Integer.valueOf(int)>
	//   20   92:putfield        #24  <Field Integer zzaL>
			break;
		}
		if(true) goto _L4; else goto _L5
_L5:
	//*  21   95:goto            0
	}

	protected int zzv()
	{
		int j = super.zzv();
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method int zzbut.zzv()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzaL != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #24  <Field Integer zzaL>
	//*   7   11:ifnull          29
			i = j + zzbum.zzH(27, zzaL.intValue());
	//    8   14:iload_2         
	//    9   15:bipush          27
	//   10   17:aload_0         
	//   11   18:getfield        #24  <Field Integer zzaL>
	//   12   21:invokevirtual   #30  <Method int Integer.intValue()>
	//   13   24:invokestatic    #68  <Method int zzbum.zzH(int, int)>
	//   14   27:iadd            
	//   15   28:istore_1        
		return i;
	//   16   29:iload_1         
	//   17   30:ireturn         
	}

	public zzad$zzb zzw()
	{
		zzcsg = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #72  <Field int zzcsg>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Integer zzaL;

	public zzad$zzb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void zzbut()>
		zzw();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #17  <Method zzad$zzb zzw()>
	//    4    8:pop             
	//    5    9:return          
	}
}
