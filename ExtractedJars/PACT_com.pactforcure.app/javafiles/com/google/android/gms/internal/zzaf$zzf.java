// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbun, zzaf, zzbuw, zzbum, 
//			zzbul, zzbut

public static final class zzaf$zzf extends zzbun
{

	public void zza(zzbum zzbum1)
		throws IOException
	{
		if(zzcz != null && zzcz.length > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field byte[][] zzcz>
	//*   2    4:ifnull          50
	//*   3    7:aload_0         
	//*   4    8:getfield        #26  <Field byte[][] zzcz>
	//*   5   11:arraylength     
	//*   6   12:ifle            50
		{
			for(int i = 0; i < zzcz.length; i++)
	//*   7   15:iconst_0        
	//*   8   16:istore_2        
	//*   9   17:iload_2         
	//*  10   18:aload_0         
	//*  11   19:getfield        #26  <Field byte[][] zzcz>
	//*  12   22:arraylength     
	//*  13   23:icmpge          50
			{
				byte abyte0[] = zzcz[i];
	//   14   26:aload_0         
	//   15   27:getfield        #26  <Field byte[][] zzcz>
	//   16   30:iload_2         
	//   17   31:aaload          
	//   18   32:astore_3        
				if(abyte0 != null)
	//*  19   33:aload_3         
	//*  20   34:ifnull          43
					zzbum1.zzb(1, abyte0);
	//   21   37:aload_1         
	//   22   38:iconst_1        
	//   23   39:aload_3         
	//   24   40:invokevirtual   #47  <Method void zzbum.zzb(int, byte[])>
			}

	//   25   43:iload_2         
	//   26   44:iconst_1        
	//   27   45:iadd            
	//   28   46:istore_2        
		}
	//*  29   47:goto            17
		if(zzcu != null)
	//*  30   50:aload_0         
	//*  31   51:getfield        #28  <Field byte[] zzcu>
	//*  32   54:ifnull          66
			zzbum1.zzb(2, zzcu);
	//   33   57:aload_1         
	//   34   58:iconst_2        
	//   35   59:aload_0         
	//   36   60:getfield        #28  <Field byte[] zzcu>
	//   37   63:invokevirtual   #47  <Method void zzbum.zzb(int, byte[])>
		if(zzcA != null)
	//*  38   66:aload_0         
	//*  39   67:getfield        #30  <Field Integer zzcA>
	//*  40   70:ifnull          85
			zzbum1.zzF(3, zzcA.intValue());
	//   41   73:aload_1         
	//   42   74:iconst_3        
	//   43   75:aload_0         
	//   44   76:getfield        #30  <Field Integer zzcA>
	//   45   79:invokevirtual   #53  <Method int Integer.intValue()>
	//   46   82:invokevirtual   #57  <Method void zzbum.zzF(int, int)>
		if(zzcB != null)
	//*  47   85:aload_0         
	//*  48   86:getfield        #32  <Field Integer zzcB>
	//*  49   89:ifnull          104
			zzbum1.zzF(4, zzcB.intValue());
	//   50   92:aload_1         
	//   51   93:iconst_4        
	//   52   94:aload_0         
	//   53   95:getfield        #32  <Field Integer zzcB>
	//   54   98:invokevirtual   #53  <Method int Integer.intValue()>
	//   55  101:invokevirtual   #57  <Method void zzbum.zzF(int, int)>
		super.zza(zzbum1);
	//   56  104:aload_0         
	//   57  105:aload_1         
	//   58  106:invokespecial   #59  <Method void zzbun.zza(zzbum)>
	//   59  109:return          
	}

	public zzbut zzb(zzbul zzbul1)
		throws IOException
	{
		return ((zzbut) (zzm(zzbul1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #65  <Method zzaf$zzf zzm(zzbul)>
	//    3    5:areturn         
	}

	public zzaf$zzf zzm(zzbul zzbul1)
		throws IOException
	{
_L7:
		int i = zzbul1.zzacu();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #70  <Method int zzbul.zzacu()>
	//    2    4:istore_2        
		i;
	//    3    5:iload_2         
		JVM INSTR lookupswitch 5: default 56
	//	               0: 65
	//	               10: 67
	//	               18: 166
	//	               24: 177
	//	               32: 218;
	//    4    6:lookupswitch    5: default 56
	//	               0: 65
	//	               10: 67
	//	               18: 166
	//	               24: 177
	//	               32: 218
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
		if(super.zza(zzbul1, i)) goto _L7; else goto _L2
	//    5   56:aload_0         
	//    6   57:aload_1         
	//    7   58:iload_2         
	//    8   59:invokespecial   #73  <Method boolean zzbun.zza(zzbul, int)>
	//    9   62:ifne            0
_L2:
		return this;
	//   10   65:aload_0         
	//   11   66:areturn         
_L3:
		int i1 = zzbuw.zzc(zzbul1, 10);
	//   12   67:aload_1         
	//   13   68:bipush          10
	//   14   70:invokestatic    #77  <Method int zzbuw.zzc(zzbul, int)>
	//   15   73:istore_3        
		int j;
		byte abyte0[][];
		if(zzcz == null)
	//*  16   74:aload_0         
	//*  17   75:getfield        #26  <Field byte[][] zzcz>
	//*  18   78:ifnonnull       140
			j = 0;
	//   19   81:iconst_0        
	//   20   82:istore_2        
		else
	//*  21   83:iload_3         
	//*  22   84:iload_2         
	//*  23   85:iadd            
	//*  24   86:anewarray       byte[][]
	//*  25   89:astore          4
	//*  26   91:iload_2         
	//*  27   92:istore_3        
	//*  28   93:iload_2         
	//*  29   94:ifeq            111
	//*  30   97:aload_0         
	//*  31   98:getfield        #26  <Field byte[][] zzcz>
	//*  32  101:iconst_0        
	//*  33  102:aload           4
	//*  34  104:iconst_0        
	//*  35  105:iload_2         
	//*  36  106:invokestatic    #84  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  37  109:iload_2         
	//*  38  110:istore_3        
	//*  39  111:iload_3         
	//*  40  112:aload           4
	//*  41  114:arraylength     
	//*  42  115:iconst_1        
	//*  43  116:isub            
	//*  44  117:icmpge          149
	//*  45  120:aload           4
	//*  46  122:iload_3         
	//*  47  123:aload_1         
	//*  48  124:invokevirtual   #88  <Method byte[] zzbul.readBytes()>
	//*  49  127:aastore         
	//*  50  128:aload_1         
	//*  51  129:invokevirtual   #70  <Method int zzbul.zzacu()>
	//*  52  132:pop             
	//*  53  133:iload_3         
	//*  54  134:iconst_1        
	//*  55  135:iadd            
	//*  56  136:istore_3        
	//*  57  137:goto            111
			j = zzcz.length;
	//   58  140:aload_0         
	//   59  141:getfield        #26  <Field byte[][] zzcz>
	//   60  144:arraylength     
	//   61  145:istore_2        
		abyte0 = new byte[i1 + j][];
		i1 = j;
		if(j != 0)
		{
			System.arraycopy(((Object) (zzcz)), 0, ((Object) (abyte0)), 0, j);
			i1 = j;
		}
		for(; i1 < abyte0.length - 1; i1++)
		{
			abyte0[i1] = zzbul1.readBytes();
			zzbul1.zzacu();
		}

	//*  62  146:goto            83
		abyte0[i1] = zzbul1.readBytes();
	//   63  149:aload           4
	//   64  151:iload_3         
	//   65  152:aload_1         
	//   66  153:invokevirtual   #88  <Method byte[] zzbul.readBytes()>
	//   67  156:aastore         
		zzcz = abyte0;
	//   68  157:aload_0         
	//   69  158:aload           4
	//   70  160:putfield        #26  <Field byte[][] zzcz>
		  goto _L7
	//*  71  163:goto            0
_L4:
		zzcu = zzbul1.readBytes();
	//   72  166:aload_0         
	//   73  167:aload_1         
	//   74  168:invokevirtual   #88  <Method byte[] zzbul.readBytes()>
	//   75  171:putfield        #28  <Field byte[] zzcu>
		  goto _L7
	//*  76  174:goto            0
_L5:
		int k = zzbul1.zzacy();
	//   77  177:aload_1         
	//   78  178:invokevirtual   #91  <Method int zzbul.zzacy()>
	//   79  181:istore_2        
		switch(k)
	//*  80  182:iload_2         
		{
	//*  81  183:tableswitch     0 1: default 204
	//	               0 207
	//	               1 207
	//*  82  204:goto            0
		case 0: // '\0'
		case 1: // '\001'
			zzcA = Integer.valueOf(k);
	//   83  207:aload_0         
	//   84  208:iload_2         
	//   85  209:invokestatic    #95  <Method Integer Integer.valueOf(int)>
	//   86  212:putfield        #30  <Field Integer zzcA>
			break;
		}
		continue; /* Loop/switch isn't completed */
	//   87  215:goto            0
_L6:
		int l = zzbul1.zzacy();
	//   88  218:aload_1         
	//   89  219:invokevirtual   #91  <Method int zzbul.zzacy()>
	//   90  222:istore_2        
		switch(l)
	//*  91  223:iload_2         
		{
	//*  92  224:tableswitch     0 1: default 248
	//	               0 251
	//	               1 251
	//*  93  248:goto            0
		case 0: // '\0'
		case 1: // '\001'
			zzcB = Integer.valueOf(l);
	//   94  251:aload_0         
	//   95  252:iload_2         
	//   96  253:invokestatic    #95  <Method Integer Integer.valueOf(int)>
	//   97  256:putfield        #32  <Field Integer zzcB>
			break;
		}
		if(true) goto _L7; else goto _L8
_L8:
	//*  98  259:goto            0
	}

	protected int zzv()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		int j1 = super.zzv();
	//    2    2:aload_0         
	//    3    3:invokespecial   #98  <Method int zzbun.zzv()>
	//    4    6:istore          6
		int j;
		if(zzcz != null && zzcz.length > 0)
	//*   5    8:aload_0         
	//*   6    9:getfield        #26  <Field byte[][] zzcz>
	//*   7   12:ifnull          159
	//*   8   15:aload_0         
	//*   9   16:getfield        #26  <Field byte[][] zzcz>
	//*  10   19:arraylength     
	//*  11   20:ifle            159
		{
			j = 0;
	//   12   23:iconst_0        
	//   13   24:istore_2        
			int k;
			int l;
			for(k = 0; i < zzcz.length; k = l)
	//*  14   25:iconst_0        
	//*  15   26:istore_3        
	//*  16   27:iload_1         
	//*  17   28:aload_0         
	//*  18   29:getfield        #26  <Field byte[][] zzcz>
	//*  19   32:arraylength     
	//*  20   33:icmpge          82
			{
				byte abyte0[] = zzcz[i];
	//   21   36:aload_0         
	//   22   37:getfield        #26  <Field byte[][] zzcz>
	//   23   40:iload_1         
	//   24   41:aaload          
	//   25   42:astore          7
				int i1 = j;
	//   26   44:iload_2         
	//   27   45:istore          5
				l = k;
	//   28   47:iload_3         
	//   29   48:istore          4
				if(abyte0 != null)
	//*  30   50:aload           7
	//*  31   52:ifnull          69
				{
					l = k + 1;
	//   32   55:iload_3         
	//   33   56:iconst_1        
	//   34   57:iadd            
	//   35   58:istore          4
					i1 = j + zzbum.zzag(abyte0);
	//   36   60:iload_2         
	//   37   61:aload           7
	//   38   63:invokestatic    #102 <Method int zzbum.zzag(byte[])>
	//   39   66:iadd            
	//   40   67:istore          5
				}
				i++;
	//   41   69:iload_1         
	//   42   70:iconst_1        
	//   43   71:iadd            
	//   44   72:istore_1        
				j = i1;
	//   45   73:iload           5
	//   46   75:istore_2        
			}

	//   47   76:iload           4
	//   48   78:istore_3        
	//*  49   79:goto            27
			j = j1 + j + k * 1;
	//   50   82:iload           6
	//   51   84:iload_2         
	//   52   85:iadd            
	//   53   86:iload_3         
	//   54   87:iconst_1        
	//   55   88:imul            
	//   56   89:iadd            
	//   57   90:istore_2        
		} else
	//*  58   91:iload_2         
	//*  59   92:istore_1        
	//*  60   93:aload_0         
	//*  61   94:getfield        #28  <Field byte[] zzcu>
	//*  62   97:ifnull          111
	//*  63  100:iload_2         
	//*  64  101:iconst_2        
	//*  65  102:aload_0         
	//*  66  103:getfield        #28  <Field byte[] zzcu>
	//*  67  106:invokestatic    #105 <Method int zzbum.zzc(int, byte[])>
	//*  68  109:iadd            
	//*  69  110:istore_1        
	//*  70  111:iload_1         
	//*  71  112:istore_2        
	//*  72  113:aload_0         
	//*  73  114:getfield        #30  <Field Integer zzcA>
	//*  74  117:ifnull          134
	//*  75  120:iload_1         
	//*  76  121:iconst_3        
	//*  77  122:aload_0         
	//*  78  123:getfield        #30  <Field Integer zzcA>
	//*  79  126:invokevirtual   #53  <Method int Integer.intValue()>
	//*  80  129:invokestatic    #109 <Method int zzbum.zzH(int, int)>
	//*  81  132:iadd            
	//*  82  133:istore_2        
	//*  83  134:iload_2         
	//*  84  135:istore_1        
	//*  85  136:aload_0         
	//*  86  137:getfield        #32  <Field Integer zzcB>
	//*  87  140:ifnull          157
	//*  88  143:iload_2         
	//*  89  144:iconst_4        
	//*  90  145:aload_0         
	//*  91  146:getfield        #32  <Field Integer zzcB>
	//*  92  149:invokevirtual   #53  <Method int Integer.intValue()>
	//*  93  152:invokestatic    #109 <Method int zzbum.zzH(int, int)>
	//*  94  155:iadd            
	//*  95  156:istore_1        
	//*  96  157:iload_1         
	//*  97  158:ireturn         
		{
			j = j1;
	//   98  159:iload           6
	//   99  161:istore_2        
		}
		i = j;
		if(zzcu != null)
			i = j + zzbum.zzc(2, zzcu);
		j = i;
		if(zzcA != null)
			j = i + zzbum.zzH(3, zzcA.intValue());
		i = j;
		if(zzcB != null)
			i = j + zzbum.zzH(4, zzcB.intValue());
		return i;
	//* 100  162:goto            91
	}

	public Integer zzcA;
	public Integer zzcB;
	public byte zzcu[];
	public byte zzcz[][];

	public zzaf$zzf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void zzbun()>
		zzcz = zzbuw.zzcso;
	//    2    4:aload_0         
	//    3    5:getstatic       #24  <Field byte[][] zzbuw.zzcso>
	//    4    8:putfield        #26  <Field byte[][] zzcz>
		zzcu = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #28  <Field byte[] zzcu>
		zzcA = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #30  <Field Integer zzcA>
		zzcB = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #32  <Field Integer zzcB>
		zzcsg = -1;
	//   14   26:aload_0         
	//   15   27:iconst_m1       
	//   16   28:putfield        #36  <Field int zzcsg>
	//   17   31:return          
	}
}
