// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxn, zzag, zzbxw, zzbxm, 
//			zzbxl, zzbxt

public static final class zzag$zzf extends zzbxn
{

	public void zza(zzbxm zzbxm1)
		throws IOException
	{
		if(zzcA != null && zzcA.length > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field byte[][] zzcA>
	//*   2    4:ifnull          50
	//*   3    7:aload_0         
	//*   4    8:getfield        #26  <Field byte[][] zzcA>
	//*   5   11:arraylength     
	//*   6   12:ifle            50
		{
			for(int i = 0; i < zzcA.length; i++)
	//*   7   15:iconst_0        
	//*   8   16:istore_2        
	//*   9   17:iload_2         
	//*  10   18:aload_0         
	//*  11   19:getfield        #26  <Field byte[][] zzcA>
	//*  12   22:arraylength     
	//*  13   23:icmpge          50
			{
				byte abyte0[] = zzcA[i];
	//   14   26:aload_0         
	//   15   27:getfield        #26  <Field byte[][] zzcA>
	//   16   30:iload_2         
	//   17   31:aaload          
	//   18   32:astore_3        
				if(abyte0 != null)
	//*  19   33:aload_3         
	//*  20   34:ifnull          43
					zzbxm1.zzb(1, abyte0);
	//   21   37:aload_1         
	//   22   38:iconst_1        
	//   23   39:aload_3         
	//   24   40:invokevirtual   #47  <Method void zzbxm.zzb(int, byte[])>
			}

	//   25   43:iload_2         
	//   26   44:iconst_1        
	//   27   45:iadd            
	//   28   46:istore_2        
		}
	//*  29   47:goto            17
		if(zzcv != null)
	//*  30   50:aload_0         
	//*  31   51:getfield        #28  <Field byte[] zzcv>
	//*  32   54:ifnull          66
			zzbxm1.zzb(2, zzcv);
	//   33   57:aload_1         
	//   34   58:iconst_2        
	//   35   59:aload_0         
	//   36   60:getfield        #28  <Field byte[] zzcv>
	//   37   63:invokevirtual   #47  <Method void zzbxm.zzb(int, byte[])>
		if(zzcB != null)
	//*  38   66:aload_0         
	//*  39   67:getfield        #30  <Field Integer zzcB>
	//*  40   70:ifnull          85
			zzbxm1.zzJ(3, zzcB.intValue());
	//   41   73:aload_1         
	//   42   74:iconst_3        
	//   43   75:aload_0         
	//   44   76:getfield        #30  <Field Integer zzcB>
	//   45   79:invokevirtual   #53  <Method int Integer.intValue()>
	//   46   82:invokevirtual   #57  <Method void zzbxm.zzJ(int, int)>
		if(zzcC != null)
	//*  47   85:aload_0         
	//*  48   86:getfield        #32  <Field Integer zzcC>
	//*  49   89:ifnull          104
			zzbxm1.zzJ(4, zzcC.intValue());
	//   50   92:aload_1         
	//   51   93:iconst_4        
	//   52   94:aload_0         
	//   53   95:getfield        #32  <Field Integer zzcC>
	//   54   98:invokevirtual   #53  <Method int Integer.intValue()>
	//   55  101:invokevirtual   #57  <Method void zzbxm.zzJ(int, int)>
		super.zza(zzbxm1);
	//   56  104:aload_0         
	//   57  105:aload_1         
	//   58  106:invokespecial   #59  <Method void zzbxn.zza(zzbxm)>
	//   59  109:return          
	}

	public zzbxt zzb(zzbxl zzbxl1)
		throws IOException
	{
		return ((zzbxt) (zzm(zzbxl1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #65  <Method zzag$zzf zzm(zzbxl)>
	//    3    5:areturn         
	}

	public zzag$zzf zzm(zzbxl zzbxl1)
		throws IOException
	{
_L8:
		int i = zzbxl1.zzaeo();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #70  <Method int zzbxl.zzaeo()>
	//    2    4:istore_2        
		i;
	//    3    5:iload_2         
		JVM INSTR lookupswitch 5: default 56
	//	               0: 59
	//	               10: 72
	//	               18: 171
	//	               24: 182
	//	               32: 230;
	//    4    6:lookupswitch    5: default 56
	//	               0: 59
	//	               10: 72
	//	               18: 171
	//	               24: 182
	//	               32: 230
		   goto _L1 _L2 _L3 _L4 _L5 _L6
	//*   5   56:goto            61
_L2:
		return this;
	//    6   59:aload_0         
	//    7   60:areturn         
_L1:
		if(super.zza(zzbxl1, i)) goto _L8; else goto _L7
	//    8   61:aload_0         
	//    9   62:aload_1         
	//   10   63:iload_2         
	//   11   64:invokespecial   #73  <Method boolean zzbxn.zza(zzbxl, int)>
	//   12   67:ifne            275
_L7:
		return this;
	//   13   70:aload_0         
	//   14   71:areturn         
_L3:
		int i1 = zzbxw.zzb(zzbxl1, 10);
	//   15   72:aload_1         
	//   16   73:bipush          10
	//   17   75:invokestatic    #76  <Method int zzbxw.zzb(zzbxl, int)>
	//   18   78:istore_3        
		int j;
		if(zzcA == null)
	//*  19   79:aload_0         
	//*  20   80:getfield        #26  <Field byte[][] zzcA>
	//*  21   83:ifnonnull       91
			j = 0;
	//   22   86:iconst_0        
	//   23   87:istore_2        
		else
	//*  24   88:goto            97
			j = zzcA.length;
	//   25   91:aload_0         
	//   26   92:getfield        #26  <Field byte[][] zzcA>
	//   27   95:arraylength     
	//   28   96:istore_2        
		byte abyte0[][] = new byte[j + i1][];
	//   29   97:iload_2         
	//   30   98:iload_3         
	//   31   99:iadd            
	//   32  100:anewarray       byte[][]
	//   33  103:astore          4
		i1 = j;
	//   34  105:iload_2         
	//   35  106:istore_3        
		if(j != 0)
	//*  36  107:iload_2         
	//*  37  108:ifeq            125
		{
			System.arraycopy(((Object) (zzcA)), 0, ((Object) (abyte0)), 0, j);
	//   38  111:aload_0         
	//   39  112:getfield        #26  <Field byte[][] zzcA>
	//   40  115:iconst_0        
	//   41  116:aload           4
	//   42  118:iconst_0        
	//   43  119:iload_2         
	//   44  120:invokestatic    #83  <Method void System.arraycopy(Object, int, Object, int, int)>
			i1 = j;
	//   45  123:iload_2         
	//   46  124:istore_3        
		}
		for(; i1 < abyte0.length - 1; i1++)
	//*  47  125:iload_3         
	//*  48  126:aload           4
	//*  49  128:arraylength     
	//*  50  129:iconst_1        
	//*  51  130:isub            
	//*  52  131:icmpge          154
		{
			abyte0[i1] = zzbxl1.readBytes();
	//   53  134:aload           4
	//   54  136:iload_3         
	//   55  137:aload_1         
	//   56  138:invokevirtual   #87  <Method byte[] zzbxl.readBytes()>
	//   57  141:aastore         
			zzbxl1.zzaeo();
	//   58  142:aload_1         
	//   59  143:invokevirtual   #70  <Method int zzbxl.zzaeo()>
	//   60  146:pop             
		}

	//   61  147:iload_3         
	//   62  148:iconst_1        
	//   63  149:iadd            
	//   64  150:istore_3        
	//*  65  151:goto            125
		abyte0[i1] = zzbxl1.readBytes();
	//   66  154:aload           4
	//   67  156:iload_3         
	//   68  157:aload_1         
	//   69  158:invokevirtual   #87  <Method byte[] zzbxl.readBytes()>
	//   70  161:aastore         
		zzcA = abyte0;
	//   71  162:aload_0         
	//   72  163:aload           4
	//   73  165:putfield        #26  <Field byte[][] zzcA>
		  goto _L8
	//*  74  168:goto            275
_L4:
		zzcv = zzbxl1.readBytes();
	//   75  171:aload_0         
	//   76  172:aload_1         
	//   77  173:invokevirtual   #87  <Method byte[] zzbxl.readBytes()>
	//   78  176:putfield        #28  <Field byte[] zzcv>
		  goto _L8
	//*  79  179:goto            275
_L5:
		int k = zzbxl1.zzaes();
	//   80  182:aload_1         
	//   81  183:invokevirtual   #90  <Method int zzbxl.zzaes()>
	//   82  186:istore_2        
		switch(k)
	//*  83  187:iload_2         
		{
	//*  84  188:lookupswitch    2: default 216
	//	               0: 219
	//	               1: 219
	//*  85  216:goto            227
		case 0: // '\0'
		case 1: // '\001'
			zzcB = Integer.valueOf(k);
	//   86  219:aload_0         
	//   87  220:iload_2         
	//   88  221:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   89  224:putfield        #30  <Field Integer zzcB>
			break;
		}
		continue; /* Loop/switch isn't completed */
	//   90  227:goto            275
_L6:
		int l = zzbxl1.zzaes();
	//   91  230:aload_1         
	//   92  231:invokevirtual   #90  <Method int zzbxl.zzaes()>
	//   93  234:istore_2        
		switch(l)
	//*  94  235:iload_2         
		{
	//*  95  236:lookupswitch    2: default 264
	//	               0: 267
	//	               1: 267
	//*  96  264:goto            275
		case 0: // '\0'
		case 1: // '\001'
			zzcC = Integer.valueOf(l);
	//   97  267:aload_0         
	//   98  268:iload_2         
	//   99  269:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//  100  272:putfield        #32  <Field Integer zzcC>
			break;
		}
		if(true) goto _L8; else goto _L9
_L9:
	//* 101  275:goto            0
	}

	protected int zzu()
	{
		int k1 = super.zzu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #97  <Method int zzbxn.zzu()>
	//    2    4:istore          6
		int i = k1;
	//    3    6:iload           6
	//    4    8:istore_1        
		if(zzcA != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #26  <Field byte[][] zzcA>
	//*   7   13:ifnull          99
		{
			i = k1;
	//    8   16:iload           6
	//    9   18:istore_1        
			if(zzcA.length > 0)
	//*  10   19:aload_0         
	//*  11   20:getfield        #26  <Field byte[][] zzcA>
	//*  12   23:arraylength     
	//*  13   24:ifle            99
			{
				int i1 = 0;
	//   14   27:iconst_0        
	//   15   28:istore          4
				int j = 0;
	//   16   30:iconst_0        
	//   17   31:istore_2        
				for(i = 0; i < zzcA.length;)
	//*  18   32:iconst_0        
	//*  19   33:istore_1        
	//*  20   34:iload_1         
	//*  21   35:aload_0         
	//*  22   36:getfield        #26  <Field byte[][] zzcA>
	//*  23   39:arraylength     
	//*  24   40:icmpge          89
				{
					byte abyte0[] = zzcA[i];
	//   25   43:aload_0         
	//   26   44:getfield        #26  <Field byte[][] zzcA>
	//   27   47:iload_1         
	//   28   48:aaload          
	//   29   49:astore          7
					int j1 = i1;
	//   30   51:iload           4
	//   31   53:istore          5
					int l = j;
	//   32   55:iload_2         
	//   33   56:istore_3        
					if(abyte0 != null)
	//*  34   57:aload           7
	//*  35   59:ifnull          76
					{
						j1 = i1 + 1;
	//   36   62:iload           4
	//   37   64:iconst_1        
	//   38   65:iadd            
	//   39   66:istore          5
						l = j + zzbxm.zzai(abyte0);
	//   40   68:iload_2         
	//   41   69:aload           7
	//   42   71:invokestatic    #101 <Method int zzbxm.zzai(byte[])>
	//   43   74:iadd            
	//   44   75:istore_3        
					}
					i++;
	//   45   76:iload_1         
	//   46   77:iconst_1        
	//   47   78:iadd            
	//   48   79:istore_1        
					i1 = j1;
	//   49   80:iload           5
	//   50   82:istore          4
					j = l;
	//   51   84:iload_3         
	//   52   85:istore_2        
				}

	//*  53   86:goto            34
				i = k1 + j + i1 * 1;
	//   54   89:iload           6
	//   55   91:iload_2         
	//   56   92:iadd            
	//   57   93:iload           4
	//   58   95:iconst_1        
	//   59   96:imul            
	//   60   97:iadd            
	//   61   98:istore_1        
			}
		}
		int k = i;
	//   62   99:iload_1         
	//   63  100:istore_2        
		if(zzcv != null)
	//*  64  101:aload_0         
	//*  65  102:getfield        #28  <Field byte[] zzcv>
	//*  66  105:ifnull          119
			k = i + zzbxm.zzc(2, zzcv);
	//   67  108:iload_1         
	//   68  109:iconst_2        
	//   69  110:aload_0         
	//   70  111:getfield        #28  <Field byte[] zzcv>
	//   71  114:invokestatic    #105 <Method int zzbxm.zzc(int, byte[])>
	//   72  117:iadd            
	//   73  118:istore_2        
		i = k;
	//   74  119:iload_2         
	//   75  120:istore_1        
		if(zzcB != null)
	//*  76  121:aload_0         
	//*  77  122:getfield        #30  <Field Integer zzcB>
	//*  78  125:ifnull          142
			i = k + zzbxm.zzL(3, zzcB.intValue());
	//   79  128:iload_2         
	//   80  129:iconst_3        
	//   81  130:aload_0         
	//   82  131:getfield        #30  <Field Integer zzcB>
	//   83  134:invokevirtual   #53  <Method int Integer.intValue()>
	//   84  137:invokestatic    #109 <Method int zzbxm.zzL(int, int)>
	//   85  140:iadd            
	//   86  141:istore_1        
		k = i;
	//   87  142:iload_1         
	//   88  143:istore_2        
		if(zzcC != null)
	//*  89  144:aload_0         
	//*  90  145:getfield        #32  <Field Integer zzcC>
	//*  91  148:ifnull          165
			k = i + zzbxm.zzL(4, zzcC.intValue());
	//   92  151:iload_1         
	//   93  152:iconst_4        
	//   94  153:aload_0         
	//   95  154:getfield        #32  <Field Integer zzcC>
	//   96  157:invokevirtual   #53  <Method int Integer.intValue()>
	//   97  160:invokestatic    #109 <Method int zzbxm.zzL(int, int)>
	//   98  163:iadd            
	//   99  164:istore_2        
		return k;
	//  100  165:iload_2         
	//  101  166:ireturn         
	}

	public byte zzcA[][];
	public Integer zzcB;
	public Integer zzcC;
	public byte zzcv[];

	public zzag$zzf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void zzbxn()>
		zzcA = zzbxw.zzcvc;
	//    2    4:aload_0         
	//    3    5:getstatic       #24  <Field byte[][] zzbxw.zzcvc>
	//    4    8:putfield        #26  <Field byte[][] zzcA>
		zzcv = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #28  <Field byte[] zzcv>
		zzcB = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #30  <Field Integer zzcB>
		zzcC = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #32  <Field Integer zzcC>
		zzcuR = -1;
	//   14   26:aload_0         
	//   15   27:iconst_m1       
	//   16   28:putfield        #36  <Field int zzcuR>
	//   17   31:return          
	}
}
