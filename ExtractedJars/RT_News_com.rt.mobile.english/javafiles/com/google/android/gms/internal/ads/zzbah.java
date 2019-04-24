// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbao, zzbbq, zzbac, zzbap, 
//			zzbaj, zzbam, zzbal, zzbai, 
//			zzbag, zzbaq

public abstract class zzbah
	implements Serializable, Iterable
{

	zzbah()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		zzdpa = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #52  <Field int zzdpa>
	//    5    9:return          
	}

	static zzbam zzbo(int i)
	{
		return new zzbam(i, ((zzbai) (null)));
	//    0    0:new             #56  <Class zzbam>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #59  <Method void zzbam(int, zzbai)>
	//    5    9:areturn         
	}

	public static zzbah zzc(byte abyte0[], int i, int j)
	{
		return ((zzbah) (new zzbao(zzdpr.zzd(abyte0, i, j))));
	//    0    0:new             #19  <Class zzbao>
	//    1    3:dup             
	//    2    4:getstatic       #47  <Field zzbal zzdpr>
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokeinterface #67  <Method byte[] zzbal.zzd(byte[], int, int)>
	//    7   15:invokespecial   #29  <Method void zzbao(byte[])>
	//    8   18:areturn         
	}

	static int zzd(int i, int j, int k)
	{
		int l = j - i;
	//    0    0:iload_1         
	//    1    1:iload_0         
	//    2    2:isub            
	//    3    3:istore_3        
		if((i | j | l | k - j) < 0)
	//*   4    4:iload_0         
	//*   5    5:iload_1         
	//*   6    6:ior             
	//*   7    7:iload_3         
	//*   8    8:ior             
	//*   9    9:iload_2         
	//*  10   10:iload_1         
	//*  11   11:isub            
	//*  12   12:ior             
	//*  13   13:ifge            180
		{
			if(i < 0)
	//*  14   16:iload_0         
	//*  15   17:ifge            67
			{
				StringBuilder stringbuilder = new StringBuilder(32);
	//   16   20:new             #70  <Class StringBuilder>
	//   17   23:dup             
	//   18   24:bipush          32
	//   19   26:invokespecial   #73  <Method void StringBuilder(int)>
	//   20   29:astore          4
				stringbuilder.append("Beginning index: ");
	//   21   31:aload           4
	//   22   33:ldc1            #75  <String "Beginning index: ">
	//   23   35:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   24   38:pop             
				stringbuilder.append(i);
	//   25   39:aload           4
	//   26   41:iload_0         
	//   27   42:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   28   45:pop             
				stringbuilder.append(" < 0");
	//   29   46:aload           4
	//   30   48:ldc1            #84  <String " < 0">
	//   31   50:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   32   53:pop             
				throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   33   54:new             #86  <Class IndexOutOfBoundsException>
	//   34   57:dup             
	//   35   58:aload           4
	//   36   60:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   37   63:invokespecial   #93  <Method void IndexOutOfBoundsException(String)>
	//   38   66:athrow          
			}
			if(j < i)
	//*  39   67:iload_1         
	//*  40   68:iload_0         
	//*  41   69:icmpge          126
			{
				StringBuilder stringbuilder1 = new StringBuilder(66);
	//   42   72:new             #70  <Class StringBuilder>
	//   43   75:dup             
	//   44   76:bipush          66
	//   45   78:invokespecial   #73  <Method void StringBuilder(int)>
	//   46   81:astore          4
				stringbuilder1.append("Beginning index larger than ending index: ");
	//   47   83:aload           4
	//   48   85:ldc1            #95  <String "Beginning index larger than ending index: ">
	//   49   87:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   50   90:pop             
				stringbuilder1.append(i);
	//   51   91:aload           4
	//   52   93:iload_0         
	//   53   94:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   54   97:pop             
				stringbuilder1.append(", ");
	//   55   98:aload           4
	//   56  100:ldc1            #97  <String ", ">
	//   57  102:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   58  105:pop             
				stringbuilder1.append(j);
	//   59  106:aload           4
	//   60  108:iload_1         
	//   61  109:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   62  112:pop             
				throw new IndexOutOfBoundsException(stringbuilder1.toString());
	//   63  113:new             #86  <Class IndexOutOfBoundsException>
	//   64  116:dup             
	//   65  117:aload           4
	//   66  119:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   67  122:invokespecial   #93  <Method void IndexOutOfBoundsException(String)>
	//   68  125:athrow          
			} else
			{
				StringBuilder stringbuilder2 = new StringBuilder(37);
	//   69  126:new             #70  <Class StringBuilder>
	//   70  129:dup             
	//   71  130:bipush          37
	//   72  132:invokespecial   #73  <Method void StringBuilder(int)>
	//   73  135:astore          4
				stringbuilder2.append("End index: ");
	//   74  137:aload           4
	//   75  139:ldc1            #99  <String "End index: ">
	//   76  141:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   77  144:pop             
				stringbuilder2.append(j);
	//   78  145:aload           4
	//   79  147:iload_1         
	//   80  148:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   81  151:pop             
				stringbuilder2.append(" >= ");
	//   82  152:aload           4
	//   83  154:ldc1            #101 <String " >= ">
	//   84  156:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   85  159:pop             
				stringbuilder2.append(k);
	//   86  160:aload           4
	//   87  162:iload_2         
	//   88  163:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   89  166:pop             
				throw new IndexOutOfBoundsException(stringbuilder2.toString());
	//   90  167:new             #86  <Class IndexOutOfBoundsException>
	//   91  170:dup             
	//   92  171:aload           4
	//   93  173:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   94  176:invokespecial   #93  <Method void IndexOutOfBoundsException(String)>
	//   95  179:athrow          
			}
		} else
		{
			return l;
	//   96  180:iload_3         
	//   97  181:ireturn         
		}
	}

	public static zzbah zzem(String s)
	{
		return ((zzbah) (new zzbao(s.getBytes(zzbbq.UTF_8))));
	//    0    0:new             #19  <Class zzbao>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #107 <Field Charset zzbbq.UTF_8>
	//    4    8:invokevirtual   #113 <Method byte[] String.getBytes(Charset)>
	//    5   11:invokespecial   #29  <Method void zzbao(byte[])>
	//    6   14:areturn         
	}

	public static zzbah zzo(byte abyte0[])
	{
		return zzc(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:invokestatic    #117 <Method zzbah zzc(byte[], int, int)>
	//    5    7:areturn         
	}

	static zzbah zzp(byte abyte0[])
	{
		return ((zzbah) (new zzbao(abyte0)));
	//    0    0:new             #19  <Class zzbao>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #29  <Method void zzbao(byte[])>
	//    4    8:areturn         
	}

	public abstract boolean equals(Object obj);

	public final int hashCode()
	{
		int j = zzdpa;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int zzdpa>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            37
		{
			i = size();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #125 <Method int size()>
	//    9   15:istore_1        
			int k = zzc(i, 0, i);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:iconst_0        
	//   13   19:iload_1         
	//   14   20:invokevirtual   #127 <Method int zzc(int, int, int)>
	//   15   23:istore_2        
			i = k;
	//   16   24:iload_2         
	//   17   25:istore_1        
			if(k == 0)
	//*  18   26:iload_2         
	//*  19   27:ifne            32
				i = 1;
	//   20   30:iconst_1        
	//   21   31:istore_1        
			zzdpa = i;
	//   22   32:aload_0         
	//   23   33:iload_1         
	//   24   34:putfield        #52  <Field int zzdpa>
		}
		return i;
	//   25   37:iload_1         
	//   26   38:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new zzbai(this)));
	//    0    0:new             #131 <Class zzbai>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #134 <Method void zzbai(zzbah)>
	//    4    8:areturn         
	}

	public abstract int size();

	public final byte[] toByteArray()
	{
		int i = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #125 <Method int size()>
	//    2    4:istore_1        
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            13
		{
			return zzbbq.zzduq;
	//    5    9:getstatic       #25  <Field byte[] zzbbq.zzduq>
	//    6   12:areturn         
		} else
		{
			byte abyte0[] = new byte[i];
	//    7   13:iload_1         
	//    8   14:newarray        byte[]
	//    9   16:astore_2        
			zza(abyte0, 0, 0, i);
	//   10   17:aload_0         
	//   11   18:aload_2         
	//   12   19:iconst_0        
	//   13   20:iconst_0        
	//   14   21:iload_1         
	//   15   22:invokevirtual   #140 <Method void zza(byte[], int, int, int)>
			return abyte0;
	//   16   25:aload_2         
	//   17   26:areturn         
		}
	}

	public final String toString()
	{
		return String.format("<ByteString@%s size=%d>", new Object[] {
			Integer.toHexString(System.identityHashCode(((Object) (this)))), Integer.valueOf(size())
		});
	//    0    0:ldc1            #142 <String "<ByteString@%s size=%d>">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:invokestatic    #148 <Method int System.identityHashCode(Object)>
	//    7   12:invokestatic    #154 <Method String Integer.toHexString(int)>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:invokevirtual   #125 <Method int size()>
	//   13   22:invokestatic    #158 <Method Integer Integer.valueOf(int)>
	//   14   25:aastore         
	//   15   26:invokestatic    #162 <Method String String.format(String, Object[])>
	//   16   29:areturn         
	}

	protected abstract String zza(Charset charset);

	abstract void zza(zzbag zzbag)
		throws IOException;

	protected abstract void zza(byte abyte0[], int i, int j, int k);

	public final String zzabd()
	{
		Charset charset = zzbbq.UTF_8;
	//    0    0:getstatic       #107 <Field Charset zzbbq.UTF_8>
	//    1    3:astore_1        
		if(size() == 0)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #125 <Method int size()>
	//*   4    8:ifne            14
			return "";
	//    5   11:ldc1            #169 <String "">
	//    6   13:areturn         
		else
			return zza(charset);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #171 <Method String zza(Charset)>
	//   10   19:areturn         
	}

	public abstract boolean zzabe();

	public abstract zzbaq zzabf();

	protected final int zzabg()
	{
		return zzdpa;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int zzdpa>
	//    2    4:ireturn         
	}

	public abstract byte zzbn(int i);

	protected abstract int zzc(int i, int j, int k);

	public abstract zzbah zzk(int i, int j);

	public static final zzbah zzdpq;
	private static final zzbal zzdpr;
	private int zzdpa;

	static 
	{
		zzdpq = ((zzbah) (new zzbao(zzbbq.zzduq)));
	//    0    0:new             #19  <Class zzbao>
	//    1    3:dup             
	//    2    4:getstatic       #25  <Field byte[] zzbbq.zzduq>
	//    3    7:invokespecial   #29  <Method void zzbao(byte[])>
	//    4   10:putstatic       #31  <Field zzbah zzdpq>
		Object obj;
		if(zzbac.zzabb())
	//*   5   13:invokestatic    #37  <Method boolean zzbac.zzabb()>
	//*   6   16:ifeq            31
			obj = ((Object) (new zzbap(((zzbai) (null)))));
	//    7   19:new             #39  <Class zzbap>
	//    8   22:dup             
	//    9   23:aconst_null     
	//   10   24:invokespecial   #42  <Method void zzbap(zzbai)>
	//   11   27:astore_0        
		else
	//*  12   28:goto            40
			obj = ((Object) (new zzbaj(((zzbai) (null)))));
	//   13   31:new             #44  <Class zzbaj>
	//   14   34:dup             
	//   15   35:aconst_null     
	//   16   36:invokespecial   #45  <Method void zzbaj(zzbai)>
	//   17   39:astore_0        
		zzdpr = ((zzbal) (obj));
	//   18   40:aload_0         
	//   19   41:putstatic       #47  <Field zzbal zzdpr>
	//*  20   44:return          
	}
}
