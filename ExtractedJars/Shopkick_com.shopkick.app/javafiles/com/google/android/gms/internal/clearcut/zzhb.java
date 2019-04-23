// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzfu, zzfy, zzfw, zzfs, 
//			zzfz

public final class zzhb extends zzfu
	implements Cloneable
{

	public zzhb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void zzfu()>
		zzbke = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #18  <String "">
	//    4    7:putfield        #20  <Field String zzbke>
		value = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #18  <String "">
	//    7   13:putfield        #22  <Field String value>
		zzrj = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #26  <Field zzfw zzrj>
		zzrs = -1;
	//   11   21:aload_0         
	//   12   22:iconst_m1       
	//   13   23:putfield        #30  <Field int zzrs>
	//   14   26:return          
	}

	public static zzhb[] zzge()
	{
		if(zzbkd == null)
	//*   0    0:getstatic       #35  <Field zzhb[] zzbkd>
	//*   1    3:ifnonnull       35
			synchronized(zzfy.zzrr)
	//*   2    6:getstatic       #41  <Field Object zzfy.zzrr>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzbkd == null)
	//*   6   12:getstatic       #35  <Field zzhb[] zzbkd>
	//*   7   15:ifnonnull       25
					zzbkd = new zzhb[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzhb[]
	//   10   22:putstatic       #35  <Field zzhb[] zzbkd>
			}
	//   11   25:aload_0         
	//   12   26:monitorexit     
		break MISSING_BLOCK_LABEL_35;
	//   13   27:goto            35
		exception;
	//   14   30:astore_1        
		obj;
	//   15   31:aload_0         
		JVM INSTR monitorexit ;
	//   16   32:monitorexit     
		throw exception;
	//   17   33:aload_1         
	//   18   34:athrow          
		return zzbkd;
	//   19   35:getstatic       #35  <Field zzhb[] zzbkd>
	//   20   38:areturn         
	}

	private final zzhb zzgf()
	{
		zzhb zzhb1;
		try
		{
			zzhb1 = (zzhb)super.zzeo();
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method zzfu zzfu.zzeo()>
	//    2    4:checkcast       #2   <Class zzhb>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*   6   10:astore_1        
		{
			throw new AssertionError(((Object) (clonenotsupportedexception)));
	//    7   11:new             #51  <Class AssertionError>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokespecial   #54  <Method void AssertionError(Object)>
	//   11   19:athrow          
		}
		return zzhb1;
	}

	public final Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (zzgf()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method zzhb zzgf()>
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
		if(!(obj instanceof zzhb))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzhb>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzhb)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzhb>
	//   12   20:astore_1        
		String s = zzbke;
	//   13   21:aload_0         
	//   14   22:getfield        #20  <Field String zzbke>
	//   15   25:astore_2        
		if(s == null)
	//*  16   26:aload_2         
	//*  17   27:ifnonnull       39
		{
			if(((zzhb) (obj)).zzbke != null)
	//*  18   30:aload_1         
	//*  19   31:getfield        #20  <Field String zzbke>
	//*  20   34:ifnull          52
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		} else
		if(!s.equals(((Object) (((zzhb) (obj)).zzbke))))
	//*  23   39:aload_2         
	//*  24   40:aload_1         
	//*  25   41:getfield        #20  <Field String zzbke>
	//*  26   44:invokevirtual   #65  <Method boolean String.equals(Object)>
	//*  27   47:ifne            52
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
		s = value;
	//   30   52:aload_0         
	//   31   53:getfield        #22  <Field String value>
	//   32   56:astore_2        
		if(s == null)
	//*  33   57:aload_2         
	//*  34   58:ifnonnull       70
		{
			if(((zzhb) (obj)).value != null)
	//*  35   61:aload_1         
	//*  36   62:getfield        #22  <Field String value>
	//*  37   65:ifnull          83
				return false;
	//   38   68:iconst_0        
	//   39   69:ireturn         
		} else
		if(!s.equals(((Object) (((zzhb) (obj)).value))))
	//*  40   70:aload_2         
	//*  41   71:aload_1         
	//*  42   72:getfield        #22  <Field String value>
	//*  43   75:invokevirtual   #65  <Method boolean String.equals(Object)>
	//*  44   78:ifne            83
			return false;
	//   45   81:iconst_0        
	//   46   82:ireturn         
		if(zzrj != null && !zzrj.isEmpty())
	//*  47   83:aload_0         
	//*  48   84:getfield        #26  <Field zzfw zzrj>
	//*  49   87:ifnull          115
	//*  50   90:aload_0         
	//*  51   91:getfield        #26  <Field zzfw zzrj>
	//*  52   94:invokevirtual   #71  <Method boolean zzfw.isEmpty()>
	//*  53   97:ifeq            103
	//*  54  100:goto            115
			return zzrj.equals(((Object) (((zzhb) (obj)).zzrj)));
	//   55  103:aload_0         
	//   56  104:getfield        #26  <Field zzfw zzrj>
	//   57  107:aload_1         
	//   58  108:getfield        #26  <Field zzfw zzrj>
	//   59  111:invokevirtual   #72  <Method boolean zzfw.equals(Object)>
	//   60  114:ireturn         
		if(((zzhb) (obj)).zzrj != null)
	//*  61  115:aload_1         
	//*  62  116:getfield        #26  <Field zzfw zzrj>
	//*  63  119:ifnull          136
			return ((zzhb) (obj)).zzrj.isEmpty();
	//   64  122:aload_1         
	//   65  123:getfield        #26  <Field zzfw zzrj>
	//   66  126:invokevirtual   #71  <Method boolean zzfw.isEmpty()>
	//   67  129:ifeq            134
	//   68  132:iconst_1        
	//   69  133:ireturn         
	//   70  134:iconst_0        
	//   71  135:ireturn         
		else
			return true;
	//   72  136:iconst_1        
	//   73  137:ireturn         
	}

	public final int hashCode()
	{
		int l = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #86  <Method String Class.getName()>
	//    3    7:invokevirtual   #88  <Method int String.hashCode()>
	//    4   10:istore          5
		String s = zzbke;
	//    5   12:aload_0         
	//    6   13:getfield        #20  <Field String zzbke>
	//    7   16:astore          6
		boolean flag = false;
	//    8   18:iconst_0        
	//    9   19:istore          4
		int i;
		if(s == null)
	//*  10   21:aload           6
	//*  11   23:ifnonnull       31
			i = 0;
	//   12   26:iconst_0        
	//   13   27:istore_1        
		else
	//*  14   28:goto            37
			i = s.hashCode();
	//   15   31:aload           6
	//   16   33:invokevirtual   #88  <Method int String.hashCode()>
	//   17   36:istore_1        
		s = value;
	//   18   37:aload_0         
	//   19   38:getfield        #22  <Field String value>
	//   20   41:astore          6
		int j;
		if(s == null)
	//*  21   43:aload           6
	//*  22   45:ifnonnull       53
			j = 0;
	//   23   48:iconst_0        
	//   24   49:istore_2        
		else
	//*  25   50:goto            59
			j = s.hashCode();
	//   26   53:aload           6
	//   27   55:invokevirtual   #88  <Method int String.hashCode()>
	//   28   58:istore_2        
		int k = ((int) (flag));
	//   29   59:iload           4
	//   30   61:istore_3        
		if(zzrj != null)
	//*  31   62:aload_0         
	//*  32   63:getfield        #26  <Field zzfw zzrj>
	//*  33   66:ifnull          93
			if(zzrj.isEmpty())
	//*  34   69:aload_0         
	//*  35   70:getfield        #26  <Field zzfw zzrj>
	//*  36   73:invokevirtual   #71  <Method boolean zzfw.isEmpty()>
	//*  37   76:ifeq            85
				k = ((int) (flag));
	//   38   79:iload           4
	//   39   81:istore_3        
			else
	//*  40   82:goto            93
				k = zzrj.hashCode();
	//   41   85:aload_0         
	//   42   86:getfield        #26  <Field zzfw zzrj>
	//   43   89:invokevirtual   #89  <Method int zzfw.hashCode()>
	//   44   92:istore_3        
		return (((l + 527) * 31 + i) * 31 + j) * 31 + k;
	//   45   93:iload           5
	//   46   95:sipush          527
	//   47   98:iadd            
	//   48   99:bipush          31
	//   49  101:imul            
	//   50  102:iload_1         
	//   51  103:iadd            
	//   52  104:bipush          31
	//   53  106:imul            
	//   54  107:iload_2         
	//   55  108:iadd            
	//   56  109:bipush          31
	//   57  111:imul            
	//   58  112:iload_3         
	//   59  113:iadd            
	//   60  114:ireturn         
	}

	public final void zza(zzfs zzfs1)
		throws IOException
	{
		String s = zzbke;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String zzbke>
	//    2    4:astore_2        
		if(s != null && !s.equals(""))
	//*   3    5:aload_2         
	//*   4    6:ifnull          27
	//*   5    9:aload_2         
	//*   6   10:ldc1            #18  <String "">
	//*   7   12:invokevirtual   #65  <Method boolean String.equals(Object)>
	//*   8   15:ifne            27
			zzfs1.zza(1, zzbke);
	//    9   18:aload_1         
	//   10   19:iconst_1        
	//   11   20:aload_0         
	//   12   21:getfield        #20  <Field String zzbke>
	//   13   24:invokevirtual   #98  <Method void zzfs.zza(int, String)>
		s = value;
	//   14   27:aload_0         
	//   15   28:getfield        #22  <Field String value>
	//   16   31:astore_2        
		if(s != null && !s.equals(""))
	//*  17   32:aload_2         
	//*  18   33:ifnull          54
	//*  19   36:aload_2         
	//*  20   37:ldc1            #18  <String "">
	//*  21   39:invokevirtual   #65  <Method boolean String.equals(Object)>
	//*  22   42:ifne            54
			zzfs1.zza(2, value);
	//   23   45:aload_1         
	//   24   46:iconst_2        
	//   25   47:aload_0         
	//   26   48:getfield        #22  <Field String value>
	//   27   51:invokevirtual   #98  <Method void zzfs.zza(int, String)>
		super.zza(zzfs1);
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:invokespecial   #100 <Method void zzfu.zza(zzfs)>
	//   31   59:return          
	}

	protected final int zzen()
	{
		int j = super.zzen();
	//    0    0:aload_0         
	//    1    1:invokespecial   #103 <Method int zzfu.zzen()>
	//    2    4:istore_2        
		String s = zzbke;
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field String zzbke>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(s != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          38
		{
			i = j;
	//   10   16:iload_2         
	//   11   17:istore_1        
			if(!s.equals(""))
	//*  12   18:aload_3         
	//*  13   19:ldc1            #18  <String "">
	//*  14   21:invokevirtual   #65  <Method boolean String.equals(Object)>
	//*  15   24:ifne            38
				i = j + zzfs.zzb(1, zzbke);
	//   16   27:iload_2         
	//   17   28:iconst_1        
	//   18   29:aload_0         
	//   19   30:getfield        #20  <Field String zzbke>
	//   20   33:invokestatic    #107 <Method int zzfs.zzb(int, String)>
	//   21   36:iadd            
	//   22   37:istore_1        
		}
		s = value;
	//   23   38:aload_0         
	//   24   39:getfield        #22  <Field String value>
	//   25   42:astore_3        
		j = i;
	//   26   43:iload_1         
	//   27   44:istore_2        
		if(s != null)
	//*  28   45:aload_3         
	//*  29   46:ifnull          71
		{
			j = i;
	//   30   49:iload_1         
	//   31   50:istore_2        
			if(!s.equals(""))
	//*  32   51:aload_3         
	//*  33   52:ldc1            #18  <String "">
	//*  34   54:invokevirtual   #65  <Method boolean String.equals(Object)>
	//*  35   57:ifne            71
				j = i + zzfs.zzb(2, value);
	//   36   60:iload_1         
	//   37   61:iconst_2        
	//   38   62:aload_0         
	//   39   63:getfield        #22  <Field String value>
	//   40   66:invokestatic    #107 <Method int zzfs.zzb(int, String)>
	//   41   69:iadd            
	//   42   70:istore_2        
		}
		return j;
	//   43   71:iload_2         
	//   44   72:ireturn         
	}

	public final zzfu zzeo()
		throws CloneNotSupportedException
	{
		return ((zzfu) ((zzhb)((zzfz)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #111 <Method Object zzfz.clone()>
	//    2    4:checkcast       #2   <Class zzhb>
	//    3    7:areturn         
	}

	public final zzfz zzep()
		throws CloneNotSupportedException
	{
		return ((zzfz) ((zzhb)((zzfz)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #111 <Method Object zzfz.clone()>
	//    2    4:checkcast       #2   <Class zzhb>
	//    3    7:areturn         
	}

	private static volatile zzhb zzbkd[];
	private String value;
	private String zzbke;
}
