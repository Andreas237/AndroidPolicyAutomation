// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzfu, zzgb, zzfy, zzfw, 
//			zzfs, zzfz

public final class zzgz extends zzfu
	implements Cloneable
{

	public zzgz()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void zzfu()>
		zzbjb = zzgb.zzse;
	//    2    4:aload_0         
	//    3    5:getstatic       #24  <Field byte[] zzgb.zzse>
	//    4    8:putfield        #26  <Field byte[] zzbjb>
		zzbjc = "";
	//    5   11:aload_0         
	//    6   12:ldc1            #28  <String "">
	//    7   14:putfield        #30  <Field String zzbjc>
		zzbjd = zzgb.zzsd;
	//    8   17:aload_0         
	//    9   18:getstatic       #33  <Field byte[][] zzgb.zzsd>
	//   10   21:putfield        #35  <Field byte[][] zzbjd>
		zzbje = false;
	//   11   24:aload_0         
	//   12   25:iconst_0        
	//   13   26:putfield        #37  <Field boolean zzbje>
		zzrj = null;
	//   14   29:aload_0         
	//   15   30:aconst_null     
	//   16   31:putfield        #41  <Field zzfw zzrj>
		zzrs = -1;
	//   17   34:aload_0         
	//   18   35:iconst_m1       
	//   19   36:putfield        #45  <Field int zzrs>
	//   20   39:return          
	}

	private final zzgz zzgc()
	{
		zzgz zzgz1;
		byte abyte0[][];
		try
		{
			zzgz1 = (zzgz)super.zzeo();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method zzfu zzfu.zzeo()>
	//    2    4:checkcast       #2   <Class zzgz>
	//    3    7:astore_1        
		}
	//*   4    8:aload_0         
	//*   5    9:getfield        #35  <Field byte[][] zzbjd>
	//*   6   12:astore_2        
	//*   7   13:aload_2         
	//*   8   14:ifnull          33
	//*   9   17:aload_2         
	//*  10   18:arraylength     
	//*  11   19:ifle            33
	//*  12   22:aload_1         
	//*  13   23:aload_2         
	//*  14   24:invokevirtual   #59  <Method Object _5B__5B_B.clone()>
	//*  15   27:checkcast       #55  <Class byte[][]>
	//*  16   30:putfield        #35  <Field byte[][] zzbjd>
	//*  17   33:aload_1         
	//*  18   34:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*  19   35:astore_1        
		{
			throw new AssertionError(((Object) (clonenotsupportedexception)));
	//   20   36:new             #61  <Class AssertionError>
	//   21   39:dup             
	//   22   40:aload_1         
	//   23   41:invokespecial   #64  <Method void AssertionError(Object)>
	//   24   44:athrow          
		}
		abyte0 = zzbjd;
		if(abyte0 != null && abyte0.length > 0)
			zzgz1.zzbjd = (byte[][])((byte [][]) (abyte0)).clone();
		return zzgz1;
	}

	public final Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (zzgc()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method zzgz zzgc()>
	//    2    4:areturn         
	}

	public final boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzgz))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzgz>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzgz)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzgz>
	//   12   20:astore_1        
		if(!Arrays.equals(zzbjb, ((zzgz) (obj)).zzbjb))
	//*  13   21:aload_0         
	//*  14   22:getfield        #26  <Field byte[] zzbjb>
	//*  15   25:aload_1         
	//*  16   26:getfield        #26  <Field byte[] zzbjb>
	//*  17   29:invokestatic    #74  <Method boolean Arrays.equals(byte[], byte[])>
	//*  18   32:ifne            37
			return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
		String s = zzbjc;
	//   21   37:aload_0         
	//   22   38:getfield        #30  <Field String zzbjc>
	//   23   41:astore_2        
		if(s == null)
	//*  24   42:aload_2         
	//*  25   43:ifnonnull       55
		{
			if(((zzgz) (obj)).zzbjc != null)
	//*  26   46:aload_1         
	//*  27   47:getfield        #30  <Field String zzbjc>
	//*  28   50:ifnull          68
				return false;
	//   29   53:iconst_0        
	//   30   54:ireturn         
		} else
		if(!s.equals(((Object) (((zzgz) (obj)).zzbjc))))
	//*  31   55:aload_2         
	//*  32   56:aload_1         
	//*  33   57:getfield        #30  <Field String zzbjc>
	//*  34   60:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*  35   63:ifne            68
			return false;
	//   36   66:iconst_0        
	//   37   67:ireturn         
		if(!zzfy.zza(zzbjd, ((zzgz) (obj)).zzbjd))
	//*  38   68:aload_0         
	//*  39   69:getfield        #35  <Field byte[][] zzbjd>
	//*  40   72:aload_1         
	//*  41   73:getfield        #35  <Field byte[][] zzbjd>
	//*  42   76:invokestatic    #84  <Method boolean zzfy.zza(byte[][], byte[][])>
	//*  43   79:ifne            84
			return false;
	//   44   82:iconst_0        
	//   45   83:ireturn         
		if(zzrj != null && !zzrj.isEmpty())
	//*  46   84:aload_0         
	//*  47   85:getfield        #41  <Field zzfw zzrj>
	//*  48   88:ifnull          116
	//*  49   91:aload_0         
	//*  50   92:getfield        #41  <Field zzfw zzrj>
	//*  51   95:invokevirtual   #90  <Method boolean zzfw.isEmpty()>
	//*  52   98:ifeq            104
	//*  53  101:goto            116
			return zzrj.equals(((Object) (((zzgz) (obj)).zzrj)));
	//   54  104:aload_0         
	//   55  105:getfield        #41  <Field zzfw zzrj>
	//   56  108:aload_1         
	//   57  109:getfield        #41  <Field zzfw zzrj>
	//   58  112:invokevirtual   #91  <Method boolean zzfw.equals(Object)>
	//   59  115:ireturn         
		if(((zzgz) (obj)).zzrj != null)
	//*  60  116:aload_1         
	//*  61  117:getfield        #41  <Field zzfw zzrj>
	//*  62  120:ifnull          137
			return ((zzgz) (obj)).zzrj.isEmpty();
	//   63  123:aload_1         
	//   64  124:getfield        #41  <Field zzfw zzrj>
	//   65  127:invokevirtual   #90  <Method boolean zzfw.isEmpty()>
	//   66  130:ifeq            135
	//   67  133:iconst_1        
	//   68  134:ireturn         
	//   69  135:iconst_0        
	//   70  136:ireturn         
		else
			return true;
	//   71  137:iconst_1        
	//   72  138:ireturn         
	}

	public final int hashCode()
	{
		int k = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #105 <Method String Class.getName()>
	//    3    7:invokevirtual   #107 <Method int String.hashCode()>
	//    4   10:istore          4
		int l = Arrays.hashCode(zzbjb);
	//    5   12:aload_0         
	//    6   13:getfield        #26  <Field byte[] zzbjb>
	//    7   16:invokestatic    #110 <Method int Arrays.hashCode(byte[])>
	//    8   19:istore          5
		String s = zzbjc;
	//    9   21:aload_0         
	//   10   22:getfield        #30  <Field String zzbjc>
	//   11   25:astore          7
		boolean flag = false;
	//   12   27:iconst_0        
	//   13   28:istore_3        
		int i;
		if(s == null)
	//*  14   29:aload           7
	//*  15   31:ifnonnull       39
			i = 0;
	//   16   34:iconst_0        
	//   17   35:istore_1        
		else
	//*  18   36:goto            45
			i = s.hashCode();
	//   19   39:aload           7
	//   20   41:invokevirtual   #107 <Method int String.hashCode()>
	//   21   44:istore_1        
		int i1 = zzfy.zza(zzbjd);
	//   22   45:aload_0         
	//   23   46:getfield        #35  <Field byte[][] zzbjd>
	//   24   49:invokestatic    #113 <Method int zzfy.zza(byte[][])>
	//   25   52:istore          6
		int j = ((int) (flag));
	//   26   54:iload_3         
	//   27   55:istore_2        
		if(zzrj != null)
	//*  28   56:aload_0         
	//*  29   57:getfield        #41  <Field zzfw zzrj>
	//*  30   60:ifnull          86
			if(zzrj.isEmpty())
	//*  31   63:aload_0         
	//*  32   64:getfield        #41  <Field zzfw zzrj>
	//*  33   67:invokevirtual   #90  <Method boolean zzfw.isEmpty()>
	//*  34   70:ifeq            78
				j = ((int) (flag));
	//   35   73:iload_3         
	//   36   74:istore_2        
			else
	//*  37   75:goto            86
				j = zzrj.hashCode();
	//   38   78:aload_0         
	//   39   79:getfield        #41  <Field zzfw zzrj>
	//   40   82:invokevirtual   #114 <Method int zzfw.hashCode()>
	//   41   85:istore_2        
		return (((((k + 527) * 31 + l) * 31 + i) * 31 + i1) * 31 + 1237) * 31 + j;
	//   42   86:iload           4
	//   43   88:sipush          527
	//   44   91:iadd            
	//   45   92:bipush          31
	//   46   94:imul            
	//   47   95:iload           5
	//   48   97:iadd            
	//   49   98:bipush          31
	//   50  100:imul            
	//   51  101:iload_1         
	//   52  102:iadd            
	//   53  103:bipush          31
	//   54  105:imul            
	//   55  106:iload           6
	//   56  108:iadd            
	//   57  109:bipush          31
	//   58  111:imul            
	//   59  112:sipush          1237
	//   60  115:iadd            
	//   61  116:bipush          31
	//   62  118:imul            
	//   63  119:iload_2         
	//   64  120:iadd            
	//   65  121:ireturn         
	}

	public final void zza(zzfs zzfs1)
		throws IOException
	{
		if(!Arrays.equals(zzbjb, zzgb.zzse))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field byte[] zzbjb>
	//*   2    4:getstatic       #24  <Field byte[] zzgb.zzse>
	//*   3    7:invokestatic    #74  <Method boolean Arrays.equals(byte[], byte[])>
	//*   4   10:ifne            22
			zzfs1.zza(1, zzbjb);
	//    5   13:aload_1         
	//    6   14:iconst_1        
	//    7   15:aload_0         
	//    8   16:getfield        #26  <Field byte[] zzbjb>
	//    9   19:invokevirtual   #122 <Method void zzfs.zza(int, byte[])>
		byte abyte0[][] = zzbjd;
	//   10   22:aload_0         
	//   11   23:getfield        #35  <Field byte[][] zzbjd>
	//   12   26:astore_3        
		if(abyte0 != null && abyte0.length > 0)
	//*  13   27:aload_3         
	//*  14   28:ifnull          70
	//*  15   31:aload_3         
	//*  16   32:arraylength     
	//*  17   33:ifle            70
		{
			int i = 0;
	//   18   36:iconst_0        
	//   19   37:istore_2        
			do
			{
				Object obj = ((Object) (zzbjd));
	//   20   38:aload_0         
	//   21   39:getfield        #35  <Field byte[][] zzbjd>
	//   22   42:astore_3        
				if(i >= obj.length)
					break;
	//   23   43:iload_2         
	//   24   44:aload_3         
	//   25   45:arraylength     
	//   26   46:icmpge          70
				obj = ((Object) (obj[i]));
	//   27   49:aload_3         
	//   28   50:iload_2         
	//   29   51:aaload          
	//   30   52:astore_3        
				if(obj != null)
	//*  31   53:aload_3         
	//*  32   54:ifnull          63
					zzfs1.zza(2, ((byte []) (obj)));
	//   33   57:aload_1         
	//   34   58:iconst_2        
	//   35   59:aload_3         
	//   36   60:invokevirtual   #122 <Method void zzfs.zza(int, byte[])>
				i++;
	//   37   63:iload_2         
	//   38   64:iconst_1        
	//   39   65:iadd            
	//   40   66:istore_2        
			} while(true);
	//   41   67:goto            38
		}
		String s = zzbjc;
	//   42   70:aload_0         
	//   43   71:getfield        #30  <Field String zzbjc>
	//   44   74:astore_3        
		if(s != null && !s.equals(""))
	//*  45   75:aload_3         
	//*  46   76:ifnull          97
	//*  47   79:aload_3         
	//*  48   80:ldc1            #28  <String "">
	//*  49   82:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*  50   85:ifne            97
			zzfs1.zza(4, zzbjc);
	//   51   88:aload_1         
	//   52   89:iconst_4        
	//   53   90:aload_0         
	//   54   91:getfield        #30  <Field String zzbjc>
	//   55   94:invokevirtual   #125 <Method void zzfs.zza(int, String)>
		super.zza(zzfs1);
	//   56   97:aload_0         
	//   57   98:aload_1         
	//   58   99:invokespecial   #127 <Method void zzfu.zza(zzfs)>
	//   59  102:return          
	}

	protected final int zzen()
	{
		int j = super.zzen();
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method int zzfu.zzen()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(!Arrays.equals(zzbjb, zzgb.zzse))
	//*   5    7:aload_0         
	//*   6    8:getfield        #26  <Field byte[] zzbjb>
	//*   7   11:getstatic       #24  <Field byte[] zzgb.zzse>
	//*   8   14:invokestatic    #74  <Method boolean Arrays.equals(byte[], byte[])>
	//*   9   17:ifne            31
			i = j + zzfs.zzb(1, zzbjb);
	//   10   20:iload_2         
	//   11   21:iconst_1        
	//   12   22:aload_0         
	//   13   23:getfield        #26  <Field byte[] zzbjb>
	//   14   26:invokestatic    #134 <Method int zzfs.zzb(int, byte[])>
	//   15   29:iadd            
	//   16   30:istore_1        
		byte abyte0[][] = zzbjd;
	//   17   31:aload_0         
	//   18   32:getfield        #35  <Field byte[][] zzbjd>
	//   19   35:astore          7
		j = i;
	//   20   37:iload_1         
	//   21   38:istore_2        
		if(abyte0 != null)
	//*  22   39:aload           7
	//*  23   41:ifnull          128
		{
			j = i;
	//   24   44:iload_1         
	//   25   45:istore_2        
			if(abyte0.length > 0)
	//*  26   46:aload           7
	//*  27   48:arraylength     
	//*  28   49:ifle            128
			{
				j = 0;
	//   29   52:iconst_0        
	//   30   53:istore_2        
				int k = 0;
	//   31   54:iconst_0        
	//   32   55:istore_3        
				int l = k;
	//   33   56:iload_3         
	//   34   57:istore          4
				do
				{
					Object obj = ((Object) (zzbjd));
	//   35   59:aload_0         
	//   36   60:getfield        #35  <Field byte[][] zzbjd>
	//   37   63:astore          7
					if(j >= obj.length)
						break;
	//   38   65:iload_2         
	//   39   66:aload           7
	//   40   68:arraylength     
	//   41   69:icmpge          119
					obj = ((Object) (obj[j]));
	//   42   72:aload           7
	//   43   74:iload_2         
	//   44   75:aaload          
	//   45   76:astore          7
					int j1 = k;
	//   46   78:iload_3         
	//   47   79:istore          6
					int i1 = l;
	//   48   81:iload           4
	//   49   83:istore          5
					if(obj != null)
	//*  50   85:aload           7
	//*  51   87:ifnull          105
					{
						i1 = l + 1;
	//   52   90:iload           4
	//   53   92:iconst_1        
	//   54   93:iadd            
	//   55   94:istore          5
						j1 = k + zzfs.zzh(((byte []) (obj)));
	//   56   96:iload_3         
	//   57   97:aload           7
	//   58   99:invokestatic    #137 <Method int zzfs.zzh(byte[])>
	//   59  102:iadd            
	//   60  103:istore          6
					}
					j++;
	//   61  105:iload_2         
	//   62  106:iconst_1        
	//   63  107:iadd            
	//   64  108:istore_2        
					k = j1;
	//   65  109:iload           6
	//   66  111:istore_3        
					l = i1;
	//   67  112:iload           5
	//   68  114:istore          4
				} while(true);
	//   69  116:goto            59
				j = i + k + l * 1;
	//   70  119:iload_1         
	//   71  120:iload_3         
	//   72  121:iadd            
	//   73  122:iload           4
	//   74  124:iconst_1        
	//   75  125:imul            
	//   76  126:iadd            
	//   77  127:istore_2        
			}
		}
		String s = zzbjc;
	//   78  128:aload_0         
	//   79  129:getfield        #30  <Field String zzbjc>
	//   80  132:astore          7
		i = j;
	//   81  134:iload_2         
	//   82  135:istore_1        
		if(s != null)
	//*  83  136:aload           7
	//*  84  138:ifnull          164
		{
			i = j;
	//   85  141:iload_2         
	//   86  142:istore_1        
			if(!s.equals(""))
	//*  87  143:aload           7
	//*  88  145:ldc1            #28  <String "">
	//*  89  147:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*  90  150:ifne            164
				i = j + zzfs.zzb(4, zzbjc);
	//   91  153:iload_2         
	//   92  154:iconst_4        
	//   93  155:aload_0         
	//   94  156:getfield        #30  <Field String zzbjc>
	//   95  159:invokestatic    #140 <Method int zzfs.zzb(int, String)>
	//   96  162:iadd            
	//   97  163:istore_1        
		}
		return i;
	//   98  164:iload_1         
	//   99  165:ireturn         
	}

	public final zzfu zzeo()
		throws CloneNotSupportedException
	{
		return ((zzfu) ((zzgz)((zzfz)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #143 <Method Object zzfz.clone()>
	//    2    4:checkcast       #2   <Class zzgz>
	//    3    7:areturn         
	}

	public final zzfz zzep()
		throws CloneNotSupportedException
	{
		return ((zzfz) ((zzgz)((zzfz)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #143 <Method Object zzfz.clone()>
	//    2    4:checkcast       #2   <Class zzgz>
	//    3    7:areturn         
	}

	private byte zzbjb[];
	private String zzbjc;
	private byte zzbjd[][];
	private boolean zzbje;
}
