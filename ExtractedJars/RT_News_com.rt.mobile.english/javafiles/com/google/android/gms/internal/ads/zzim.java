// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbez, zzbfa, zzbfi

public final class zzim extends zzbfc
{

	public zzim()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzbfc()>
		zzamf = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #14  <Field Integer zzamf>
		zzanx = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #16  <Field Integer zzanx>
		zzebk = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #20  <Field zzbfe zzebk>
		zzebt = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #24  <Field int zzebt>
	//   14   24:return          
	}

	private final zzim zzo(zzbez zzbez1)
		throws IOException
	{
_L5:
		int k = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #37  <Method int zzbez.zzabk()>
	//    2    4:istore          4
		if(k == 0) goto _L2; else goto _L1
	//    3    6:iload           4
	//    4    8:ifeq            228
_L1:
		if(k == 8) goto _L4; else goto _L3
	//    5   11:iload           4
	//    6   13:bipush          8
	//    7   15:icmpeq          126
_L3:
label0:
		{
			if(k == 16)
				break label0;
	//    8   18:iload           4
	//    9   20:bipush          16
	//   10   22:icmpeq          37
			if(!super.zza(zzbez1, k))
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:iload           4
	//*  14   29:invokespecial   #41  <Method boolean zzbfc.zza(zzbez, int)>
	//*  15   32:ifne            0
				return this;
	//   16   35:aload_0         
	//   17   36:areturn         
		}
		  goto _L5
		int i;
		int j;
		j = zzbez1.getPosition();
	//   18   37:aload_1         
	//   19   38:invokevirtual   #44  <Method int zzbez.getPosition()>
	//   20   41:istore_3        
		i = j;
	//   21   42:iload_3         
	//   22   43:istore_2        
		int l = zzbez1.zzacc();
	//   23   44:aload_1         
	//   24   45:invokevirtual   #47  <Method int zzbez.zzacc()>
	//   25   48:istore          5
		  goto _L6
	//*  26   50:iload           5
	//*  27   52:iflt            235
	//*  28   55:iload           5
	//*  29   57:iconst_2        
	//*  30   58:icmpgt          235
	//*  31   61:goto            64
_L7:
		i = j;
	//   32   64:iload_3         
	//   33   65:istore_2        
		zzanx = Integer.valueOf(l);
	//   34   66:aload_0         
	//   35   67:iload           5
	//   36   69:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//   37   72:putfield        #16  <Field Integer zzanx>
		  goto _L5
	//*  38   75:goto            0
_L8:
		i = j;
	//   39   78:iload_3         
	//   40   79:istore_2        
		StringBuilder stringbuilder = new StringBuilder(51);
	//   41   80:new             #55  <Class StringBuilder>
	//   42   83:dup             
	//   43   84:bipush          51
	//   44   86:invokespecial   #58  <Method void StringBuilder(int)>
	//   45   89:astore          6
		i = j;
	//   46   91:iload_3         
	//   47   92:istore_2        
		stringbuilder.append(l);
	//   48   93:aload           6
	//   49   95:iload           5
	//   50   97:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
	//   51  100:pop             
		i = j;
	//   52  101:iload_3         
	//   53  102:istore_2        
		stringbuilder.append(" is not a valid enum CellularNetworkType");
	//   54  103:aload           6
	//   55  105:ldc1            #64  <String " is not a valid enum CellularNetworkType">
	//   56  107:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   57  110:pop             
		break MISSING_BLOCK_LABEL_111;
	//*  58  111:iload_3         
	//*  59  112:istore_2        
	//*  60  113:new             #31  <Class IllegalArgumentException>
	//*  61  116:dup             
	//*  62  117:aload           6
	//*  63  119:invokevirtual   #71  <Method String StringBuilder.toString()>
	//*  64  122:invokespecial   #74  <Method void IllegalArgumentException(String)>
	//*  65  125:athrow          
_L4:
		j = zzbez1.getPosition();
	//   66  126:aload_1         
	//   67  127:invokevirtual   #44  <Method int zzbez.getPosition()>
	//   68  130:istore_3        
		i = j;
	//   69  131:iload_3         
	//   70  132:istore_2        
		l = zzbez1.zzacc();
	//   71  133:aload_1         
	//   72  134:invokevirtual   #47  <Method int zzbez.zzacc()>
	//   73  137:istore          5
		if(l < 0 || l > 2)
			break MISSING_BLOCK_LABEL_164;
	//   74  139:iload           5
	//   75  141:iflt            164
	//   76  144:iload           5
	//   77  146:iconst_2        
	//   78  147:icmpgt          164
		i = j;
	//   79  150:iload_3         
	//   80  151:istore_2        
		zzamf = Integer.valueOf(l);
	//   81  152:aload_0         
	//   82  153:iload           5
	//   83  155:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//   84  158:putfield        #14  <Field Integer zzamf>
		  goto _L5
	//*  85  161:goto            0
		i = j;
	//   86  164:iload_3         
	//   87  165:istore_2        
		stringbuilder = new StringBuilder(43);
	//   88  166:new             #55  <Class StringBuilder>
	//   89  169:dup             
	//   90  170:bipush          43
	//   91  172:invokespecial   #58  <Method void StringBuilder(int)>
	//   92  175:astore          6
		i = j;
	//   93  177:iload_3         
	//   94  178:istore_2        
		stringbuilder.append(l);
	//   95  179:aload           6
	//   96  181:iload           5
	//   97  183:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
	//   98  186:pop             
		i = j;
	//   99  187:iload_3         
	//  100  188:istore_2        
		stringbuilder.append(" is not a valid enum NetworkType");
	//  101  189:aload           6
	//  102  191:ldc1            #76  <String " is not a valid enum NetworkType">
	//  103  193:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//  104  196:pop             
		i = j;
	//  105  197:iload_3         
	//  106  198:istore_2        
		throw new IllegalArgumentException(stringbuilder.toString());
	//  107  199:new             #31  <Class IllegalArgumentException>
	//  108  202:dup             
	//  109  203:aload           6
	//  110  205:invokevirtual   #71  <Method String StringBuilder.toString()>
	//  111  208:invokespecial   #74  <Method void IllegalArgumentException(String)>
	//  112  211:athrow          
		i = j;
		try
		{
			throw new IllegalArgumentException(stringbuilder.toString());
		}
	//* 113  212:aload_1         
	//* 114  213:iload_2         
	//* 115  214:invokevirtual   #79  <Method void zzbez.zzdc(int)>
	//* 116  217:aload_0         
	//* 117  218:aload_1         
	//* 118  219:iload           4
	//* 119  221:invokevirtual   #41  <Method boolean zzbfc.zza(zzbez, int)>
	//* 120  224:pop             
	//* 121  225:goto            0
	//* 122  228:aload_0         
	//* 123  229:areturn         
		// Misplaced declaration of an exception variable
		catch(IllegalArgumentException illegalargumentexception)
		{
			zzbez1.zzdc(i);
		}
		((zzbfc)this).zza(zzbez1, k);
		  goto _L5
_L2:
		return this;
_L6:
		IllegalArgumentException illegalargumentexception;
		if((l < 0 || l > 2) && (l < 4 || l > 4)) goto _L8; else goto _L7
	//  124  230:astore          6
	//  125  232:goto            212
	//  126  235:iload           5
	//  127  237:iconst_4        
	//  128  238:icmplt          78
	//  129  241:iload           5
	//  130  243:iconst_4        
	//  131  244:icmpgt          78
	//* 132  247:goto            64
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		return ((zzbfi) (zzo(zzbez1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #83  <Method zzim zzo(zzbez)>
	//    3    5:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzamf != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field Integer zzamf>
	//*   2    4:ifnull          19
			zzbfa1.zzm(1, zzamf.intValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #14  <Field Integer zzamf>
	//    7   13:invokevirtual   #87  <Method int Integer.intValue()>
	//    8   16:invokevirtual   #93  <Method void zzbfa.zzm(int, int)>
		if(zzanx != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #16  <Field Integer zzanx>
	//*  11   23:ifnull          38
			zzbfa1.zzm(2, zzanx.intValue());
	//   12   26:aload_1         
	//   13   27:iconst_2        
	//   14   28:aload_0         
	//   15   29:getfield        #16  <Field Integer zzanx>
	//   16   32:invokevirtual   #87  <Method int Integer.intValue()>
	//   17   35:invokevirtual   #93  <Method void zzbfa.zzm(int, int)>
		super.zza(zzbfa1);
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:invokespecial   #95  <Method void zzbfc.zza(zzbfa)>
	//   21   43:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzamf != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #14  <Field Integer zzamf>
	//*   7   11:ifnull          28
			i = j + zzbfa.zzq(1, zzamf.intValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #14  <Field Integer zzamf>
	//   12   20:invokevirtual   #87  <Method int Integer.intValue()>
	//   13   23:invokestatic    #102 <Method int zzbfa.zzq(int, int)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(zzanx != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #16  <Field Integer zzanx>
	//*  20   34:ifnull          51
			j = i + zzbfa.zzq(2, zzanx.intValue());
	//   21   37:iload_1         
	//   22   38:iconst_2        
	//   23   39:aload_0         
	//   24   40:getfield        #16  <Field Integer zzanx>
	//   25   43:invokevirtual   #87  <Method int Integer.intValue()>
	//   26   46:invokestatic    #102 <Method int zzbfa.zzq(int, int)>
	//   27   49:iadd            
	//   28   50:istore_2        
		return j;
	//   29   51:iload_2         
	//   30   52:ireturn         
	}

	private Integer zzamf;
	private Integer zzanx;
}
