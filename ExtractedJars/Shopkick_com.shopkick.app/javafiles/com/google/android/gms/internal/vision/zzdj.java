// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjn, zzjk, zzeb, zzjl, 
//			zzjt

public final class zzdj extends zzjn
{

	public zzdj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void zzjn()>
		value = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #16  <Field String value>
		zzadp = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #20  <Field int zzadp>
	//    8   14:return          
	}

	private final zzdj zzc(zzjk zzjk1)
		throws IOException
	{
_L2:
		int i;
		int j;
		i = zzjk1.zzdq();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method int zzjk.zzdq()>
	//    2    4:istore_2        
		if(i == 0)
			break; /* Loop/switch isn't completed */
	//    3    5:iload_2         
	//    4    6:ifeq            176
		if(i == 8)
			break MISSING_BLOCK_LABEL_139;
	//    5    9:iload_2         
	//    6   10:bipush          8
	//    7   12:icmpeq          139
		if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
	//*  10   18:icmpeq          49
		{
			if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          38
			{
				if(!super.zza(zzjk1, i))
	//*  14   27:aload_0         
	//*  15   28:aload_1         
	//*  16   29:iload_2         
	//*  17   30:invokespecial   #37  <Method boolean zzjn.zza(zzjk, int)>
	//*  18   33:ifne            0
					return this;
	//   19   36:aload_0         
	//   20   37:areturn         
			} else
			{
				value = zzjk1.readString();
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #41  <Method String zzjk.readString()>
	//   24   43:putfield        #16  <Field String value>
			}
			continue; /* Loop/switch isn't completed */
	//   25   46:goto            0
		}
		j = zzjk1.getPosition();
	//   26   49:aload_1         
	//   27   50:invokevirtual   #44  <Method int zzjk.getPosition()>
	//   28   53:istore_3        
		int l = zzjk1.zzdt();
	//   29   54:aload_1         
	//   30   55:invokevirtual   #47  <Method int zzjk.zzdt()>
	//   31   58:istore          4
		if(l <= 0 || l > 12)
			break MISSING_BLOCK_LABEL_84;
	//   32   60:iload           4
	//   33   62:ifle            84
	//   34   65:iload           4
	//   35   67:bipush          12
	//   36   69:icmpgt          84
		zzog = Integer.valueOf(l);
	//   37   72:aload_0         
	//   38   73:iload           4
	//   39   75:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//   40   78:putfield        #55  <Field Integer zzog>
		continue; /* Loop/switch isn't completed */
	//   41   81:goto            0
		try
		{
			StringBuilder stringbuilder = new StringBuilder(50);
	//   42   84:new             #57  <Class StringBuilder>
	//   43   87:dup             
	//   44   88:bipush          50
	//   45   90:invokespecial   #60  <Method void StringBuilder(int)>
	//   46   93:astore          5
			stringbuilder.append(l);
	//   47   95:aload           5
	//   48   97:iload           4
	//   49   99:invokevirtual   #64  <Method StringBuilder StringBuilder.append(int)>
	//   50  102:pop             
			stringbuilder.append(" is not a valid enum BarcodeValueFormat");
	//   51  103:aload           5
	//   52  105:ldc1            #66  <String " is not a valid enum BarcodeValueFormat">
	//   53  107:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   54  110:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   55  111:new             #27  <Class IllegalArgumentException>
	//   56  114:dup             
	//   57  115:aload           5
	//   58  117:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   59  120:invokespecial   #75  <Method void IllegalArgumentException(String)>
	//   60  123:athrow          
		}
	//*  61  124:aload_1         
	//*  62  125:iload_3         
	//*  63  126:invokevirtual   #78  <Method void zzjk.zzbt(int)>
	//*  64  129:aload_0         
	//*  65  130:aload_1         
	//*  66  131:iload_2         
	//*  67  132:invokevirtual   #37  <Method boolean zzjn.zza(zzjk, int)>
	//*  68  135:pop             
	//*  69  136:goto            0
	//*  70  139:aload_1         
	//*  71  140:invokevirtual   #44  <Method int zzjk.getPosition()>
	//*  72  143:istore_3        
	//*  73  144:aload_0         
	//*  74  145:aload_1         
	//*  75  146:invokevirtual   #47  <Method int zzjk.zzdt()>
	//*  76  149:invokestatic    #84  <Method int zzeb.zzx(int)>
	//*  77  152:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//*  78  155:putfield        #86  <Field Integer zzof>
	//*  79  158:goto            0
	//*  80  161:aload_1         
	//*  81  162:iload_3         
	//*  82  163:invokevirtual   #78  <Method void zzjk.zzbt(int)>
	//*  83  166:aload_0         
	//*  84  167:aload_1         
	//*  85  168:iload_2         
	//*  86  169:invokevirtual   #37  <Method boolean zzjn.zza(zzjk, int)>
	//*  87  172:pop             
	//*  88  173:goto            0
	//*  89  176:aload_0         
	//*  90  177:areturn         
		// Misplaced declaration of an exception variable
		catch(IllegalArgumentException illegalargumentexception)
		{
			zzjk1.zzbt(j);
		}
		((zzjn)this).zza(zzjk1, i);
		continue; /* Loop/switch isn't completed */
		int k = zzjk1.getPosition();
		try
		{
			zzof = Integer.valueOf(zzeb.zzx(zzjk1.zzdt()));
		}
	//*  91  178:astore          5
	//*  92  180:goto            124
		// Misplaced declaration of an exception variable
		catch(IllegalArgumentException illegalargumentexception)
		{
			zzjk1.zzbt(k);
			((zzjn)this).zza(zzjk1, i);
		}
		if(true) goto _L2; else goto _L1
_L1:
		IllegalArgumentException illegalargumentexception;
		return this;
	//*  93  183:astore          5
	//*  94  185:goto            161
	}

	public final zzjt zza(zzjk zzjk1)
		throws IOException
	{
		return ((zzjt) (zzc(zzjk1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #90  <Method zzdj zzc(zzjk)>
	//    3    5:areturn         
	}

	public final void zza(zzjl zzjl1)
		throws IOException
	{
		Object obj = ((Object) (zzof));
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field Integer zzof>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
			zzjl1.zze(1, ((Integer) (obj)).intValue());
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #94  <Method int Integer.intValue()>
	//    9   15:invokevirtual   #100 <Method void zzjl.zze(int, int)>
		obj = ((Object) (zzog));
	//   10   18:aload_0         
	//   11   19:getfield        #55  <Field Integer zzog>
	//   12   22:astore_2        
		if(obj != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          36
			zzjl1.zze(2, ((Integer) (obj)).intValue());
	//   15   27:aload_1         
	//   16   28:iconst_2        
	//   17   29:aload_2         
	//   18   30:invokevirtual   #94  <Method int Integer.intValue()>
	//   19   33:invokevirtual   #100 <Method void zzjl.zze(int, int)>
		obj = ((Object) (value));
	//   20   36:aload_0         
	//   21   37:getfield        #16  <Field String value>
	//   22   40:astore_2        
		if(obj != null)
	//*  23   41:aload_2         
	//*  24   42:ifnull          51
			zzjl1.zza(3, ((String) (obj)));
	//   25   45:aload_1         
	//   26   46:iconst_3        
	//   27   47:aload_2         
	//   28   48:invokevirtual   #103 <Method void zzjl.zza(int, String)>
		super.zza(zzjl1);
	//   29   51:aload_0         
	//   30   52:aload_1         
	//   31   53:invokespecial   #105 <Method void zzjn.zza(zzjl)>
	//   32   56:return          
	}

	protected final int zzt()
	{
		int j = super.zzt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #108 <Method int zzjn.zzt()>
	//    2    4:istore_2        
		Object obj = ((Object) (zzof));
	//    3    5:aload_0         
	//    4    6:getfield        #86  <Field Integer zzof>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          27
			i = j + zzjl.zzi(1, ((Integer) (obj)).intValue());
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokevirtual   #94  <Method int Integer.intValue()>
	//   14   22:invokestatic    #112 <Method int zzjl.zzi(int, int)>
	//   15   25:iadd            
	//   16   26:istore_1        
		obj = ((Object) (zzog));
	//   17   27:aload_0         
	//   18   28:getfield        #55  <Field Integer zzog>
	//   19   31:astore_3        
		j = i;
	//   20   32:iload_1         
	//   21   33:istore_2        
		if(obj != null)
	//*  22   34:aload_3         
	//*  23   35:ifnull          49
			j = i + zzjl.zzi(2, ((Integer) (obj)).intValue());
	//   24   38:iload_1         
	//   25   39:iconst_2        
	//   26   40:aload_3         
	//   27   41:invokevirtual   #94  <Method int Integer.intValue()>
	//   28   44:invokestatic    #112 <Method int zzjl.zzi(int, int)>
	//   29   47:iadd            
	//   30   48:istore_2        
		obj = ((Object) (value));
	//   31   49:aload_0         
	//   32   50:getfield        #16  <Field String value>
	//   33   53:astore_3        
		i = j;
	//   34   54:iload_2         
	//   35   55:istore_1        
		if(obj != null)
	//*  36   56:aload_3         
	//*  37   57:ifnull          68
			i = j + zzjl.zzb(3, ((String) (obj)));
	//   38   60:iload_2         
	//   39   61:iconst_3        
	//   40   62:aload_3         
	//   41   63:invokestatic    #116 <Method int zzjl.zzb(int, String)>
	//   42   66:iadd            
	//   43   67:istore_1        
		return i;
	//   44   68:iload_1         
	//   45   69:ireturn         
	}

	private String value;
	private Integer zzof;
	private Integer zzog;
}
