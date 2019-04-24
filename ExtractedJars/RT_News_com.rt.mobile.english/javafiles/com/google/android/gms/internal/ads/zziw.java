// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbez, zzbfa, zzbfi

public final class zziw extends zzbfc
{

	public zziw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzbfc()>
		zzapp = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #13  <Field Integer zzapp>
		zzebk = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #17  <Field zzbfe zzebk>
		zzebt = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #21  <Field int zzebt>
	//   11   19:return          
	}

	private final zziw zzt(zzbez zzbez1)
		throws IOException
	{
_L2:
		int i;
		int j;
		i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #34  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
		if(i == 0)
			break; /* Loop/switch isn't completed */
	//    3    5:iload_2         
	//    4    6:ifeq            115
		if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          26
		{
			if(!super.zza(zzbez1, i))
	//*   8   15:aload_0         
	//*   9   16:aload_1         
	//*  10   17:iload_2         
	//*  11   18:invokespecial   #38  <Method boolean zzbfc.zza(zzbez, int)>
	//*  12   21:ifne            0
				return this;
	//   13   24:aload_0         
	//   14   25:areturn         
			continue; /* Loop/switch isn't completed */
		}
		j = zzbez1.getPosition();
	//   15   26:aload_1         
	//   16   27:invokevirtual   #41  <Method int zzbez.getPosition()>
	//   17   30:istore_3        
		int k = zzbez1.zzacc();
	//   18   31:aload_1         
	//   19   32:invokevirtual   #44  <Method int zzbez.zzacc()>
	//   20   35:istore          4
		if(k < 0 || k > 3)
			break MISSING_BLOCK_LABEL_60;
	//   21   37:iload           4
	//   22   39:iflt            60
	//   23   42:iload           4
	//   24   44:iconst_3        
	//   25   45:icmpgt          60
		zzapp = Integer.valueOf(k);
	//   26   48:aload_0         
	//   27   49:iload           4
	//   28   51:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   29   54:putfield        #13  <Field Integer zzapp>
		continue; /* Loop/switch isn't completed */
	//   30   57:goto            0
		try
		{
			StringBuilder stringbuilder = new StringBuilder(46);
	//   31   60:new             #52  <Class StringBuilder>
	//   32   63:dup             
	//   33   64:bipush          46
	//   34   66:invokespecial   #55  <Method void StringBuilder(int)>
	//   35   69:astore          5
			stringbuilder.append(k);
	//   36   71:aload           5
	//   37   73:iload           4
	//   38   75:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   39   78:pop             
			stringbuilder.append(" is not a valid enum VideoErrorCode");
	//   40   79:aload           5
	//   41   81:ldc1            #61  <String " is not a valid enum VideoErrorCode">
	//   42   83:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   43   86:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   44   87:new             #28  <Class IllegalArgumentException>
	//   45   90:dup             
	//   46   91:aload           5
	//   47   93:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   48   96:invokespecial   #71  <Method void IllegalArgumentException(String)>
	//   49   99:athrow          
		}
	//*  50  100:aload_1         
	//*  51  101:iload_3         
	//*  52  102:invokevirtual   #74  <Method void zzbez.zzdc(int)>
	//*  53  105:aload_0         
	//*  54  106:aload_1         
	//*  55  107:iload_2         
	//*  56  108:invokevirtual   #38  <Method boolean zzbfc.zza(zzbez, int)>
	//*  57  111:pop             
	//*  58  112:goto            0
	//*  59  115:aload_0         
	//*  60  116:areturn         
		// Misplaced declaration of an exception variable
		catch(IllegalArgumentException illegalargumentexception)
		{
			zzbez1.zzdc(j);
		}
		((zzbfc)this).zza(zzbez1, i);
		if(true) goto _L2; else goto _L1
_L1:
		IllegalArgumentException illegalargumentexception;
		return this;
	//*  61  117:astore          5
	//*  62  119:goto            100
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		return ((zzbfi) (zzt(zzbez1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #78  <Method zziw zzt(zzbez)>
	//    3    5:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzapp != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field Integer zzapp>
	//*   2    4:ifnull          19
			zzbfa1.zzm(1, zzapp.intValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #13  <Field Integer zzapp>
	//    7   13:invokevirtual   #82  <Method int Integer.intValue()>
	//    8   16:invokevirtual   #88  <Method void zzbfa.zzm(int, int)>
		super.zza(zzbfa1);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokespecial   #90  <Method void zzbfc.zza(zzbfa)>
	//   12   24:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzapp != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #13  <Field Integer zzapp>
	//*   7   11:ifnull          28
			i = j + zzbfa.zzq(1, zzapp.intValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #13  <Field Integer zzapp>
	//   12   20:invokevirtual   #82  <Method int Integer.intValue()>
	//   13   23:invokestatic    #97  <Method int zzbfa.zzq(int, int)>
	//   14   26:iadd            
	//   15   27:istore_1        
		return i;
	//   16   28:iload_1         
	//   17   29:ireturn         
	}

	private Integer zzapp;
}
