// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzto, zzuq, zztb, zztp, 
//			zzti, zztg, zztm, zztk, 
//			zztf, zztd

public abstract class zzte
	implements Serializable, Iterable
{

	zzte()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Object()>
		zzbsi = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #60  <Field int zzbsi>
	//    5    9:return          
	}

	private static int zza(byte byte0)
	{
		return byte0 & 0xff;
	//    0    0:iload_0         
	//    1    1:sipush          255
	//    2    4:iand            
	//    3    5:ireturn         
	}

	static zztm zzao(int i)
	{
		return new zztm(i, ((zztf) (null)));
	//    0    0:new             #66  <Class zztm>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #69  <Method void zztm(int, zztf)>
	//    5    9:areturn         
	}

	static int zzb(byte byte0)
	{
		return zza(byte0);
	//    0    0:iload_0         
	//    1    1:invokestatic    #72  <Method int zza(byte)>
	//    2    4:ireturn         
	}

	static int zzb(int i, int j, int k)
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
			if(i >= 0)
	//*  14   16:iload_0         
	//*  15   17:iflt            133
			{
				if(j < i)
	//*  16   20:iload_1         
	//*  17   21:iload_0         
	//*  18   22:icmpge          79
				{
					StringBuilder stringbuilder = new StringBuilder(66);
	//   19   25:new             #75  <Class StringBuilder>
	//   20   28:dup             
	//   21   29:bipush          66
	//   22   31:invokespecial   #78  <Method void StringBuilder(int)>
	//   23   34:astore          4
					stringbuilder.append("Beginning index larger than ending index: ");
	//   24   36:aload           4
	//   25   38:ldc1            #80  <String "Beginning index larger than ending index: ">
	//   26   40:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   27   43:pop             
					stringbuilder.append(i);
	//   28   44:aload           4
	//   29   46:iload_0         
	//   30   47:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   31   50:pop             
					stringbuilder.append(", ");
	//   32   51:aload           4
	//   33   53:ldc1            #89  <String ", ">
	//   34   55:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   35   58:pop             
					stringbuilder.append(j);
	//   36   59:aload           4
	//   37   61:iload_1         
	//   38   62:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   39   65:pop             
					throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   40   66:new             #91  <Class IndexOutOfBoundsException>
	//   41   69:dup             
	//   42   70:aload           4
	//   43   72:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   44   75:invokespecial   #98  <Method void IndexOutOfBoundsException(String)>
	//   45   78:athrow          
				} else
				{
					StringBuilder stringbuilder1 = new StringBuilder(37);
	//   46   79:new             #75  <Class StringBuilder>
	//   47   82:dup             
	//   48   83:bipush          37
	//   49   85:invokespecial   #78  <Method void StringBuilder(int)>
	//   50   88:astore          4
					stringbuilder1.append("End index: ");
	//   51   90:aload           4
	//   52   92:ldc1            #100 <String "End index: ">
	//   53   94:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   54   97:pop             
					stringbuilder1.append(j);
	//   55   98:aload           4
	//   56  100:iload_1         
	//   57  101:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   58  104:pop             
					stringbuilder1.append(" >= ");
	//   59  105:aload           4
	//   60  107:ldc1            #102 <String " >= ">
	//   61  109:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   62  112:pop             
					stringbuilder1.append(k);
	//   63  113:aload           4
	//   64  115:iload_2         
	//   65  116:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   66  119:pop             
					throw new IndexOutOfBoundsException(stringbuilder1.toString());
	//   67  120:new             #91  <Class IndexOutOfBoundsException>
	//   68  123:dup             
	//   69  124:aload           4
	//   70  126:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   71  129:invokespecial   #98  <Method void IndexOutOfBoundsException(String)>
	//   72  132:athrow          
				}
			} else
			{
				StringBuilder stringbuilder2 = new StringBuilder(32);
	//   73  133:new             #75  <Class StringBuilder>
	//   74  136:dup             
	//   75  137:bipush          32
	//   76  139:invokespecial   #78  <Method void StringBuilder(int)>
	//   77  142:astore          4
				stringbuilder2.append("Beginning index: ");
	//   78  144:aload           4
	//   79  146:ldc1            #104 <String "Beginning index: ">
	//   80  148:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   81  151:pop             
				stringbuilder2.append(i);
	//   82  152:aload           4
	//   83  154:iload_0         
	//   84  155:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   85  158:pop             
				stringbuilder2.append(" < 0");
	//   86  159:aload           4
	//   87  161:ldc1            #106 <String " < 0">
	//   88  163:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   89  166:pop             
				throw new IndexOutOfBoundsException(stringbuilder2.toString());
	//   90  167:new             #91  <Class IndexOutOfBoundsException>
	//   91  170:dup             
	//   92  171:aload           4
	//   93  173:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   94  176:invokespecial   #98  <Method void IndexOutOfBoundsException(String)>
	//   95  179:athrow          
			}
		} else
		{
			return l;
	//   96  180:iload_3         
	//   97  181:ireturn         
		}
	}

	public static zzte zzb(byte abyte0[], int i, int j)
	{
		zzb(i, i + j, abyte0.length);
	//    0    0:iload_1         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iadd            
	//    4    4:aload_0         
	//    5    5:arraylength     
	//    6    6:invokestatic    #109 <Method int zzb(int, int, int)>
	//    7    9:pop             
		return ((zzte) (new zzto(zzbtr.zzc(abyte0, i, j))));
	//    8   10:new             #22  <Class zzto>
	//    9   13:dup             
	//   10   14:getstatic       #50  <Field zztk zzbtr>
	//   11   17:aload_0         
	//   12   18:iload_1         
	//   13   19:iload_2         
	//   14   20:invokeinterface #115 <Method byte[] zztk.zzc(byte[], int, int)>
	//   15   25:invokespecial   #32  <Method void zzto(byte[])>
	//   16   28:areturn         
	}

	public static zzte zzga(String s)
	{
		return ((zzte) (new zzto(s.getBytes(zzuq.UTF_8))));
	//    0    0:new             #22  <Class zzto>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #121 <Field Charset zzuq.UTF_8>
	//    4    8:invokevirtual   #127 <Method byte[] String.getBytes(Charset)>
	//    5   11:invokespecial   #32  <Method void zzto(byte[])>
	//    6   14:areturn         
	}

	static zzte zzi(byte abyte0[])
	{
		return ((zzte) (new zzto(abyte0)));
	//    0    0:new             #22  <Class zzto>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #32  <Method void zzto(byte[])>
	//    4    8:areturn         
	}

	public abstract boolean equals(Object obj);

	public final int hashCode()
	{
		int j = zzbsi;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int zzbsi>
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
	//    8   12:invokevirtual   #136 <Method int size()>
	//    9   15:istore_1        
			int k = zza(i, 0, i);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:iconst_0        
	//   13   19:iload_1         
	//   14   20:invokevirtual   #138 <Method int zza(int, int, int)>
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
			zzbsi = i;
	//   22   32:aload_0         
	//   23   33:iload_1         
	//   24   34:putfield        #60  <Field int zzbsi>
		}
		return i;
	//   25   37:iload_1         
	//   26   38:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new zztf(this)));
	//    0    0:new             #142 <Class zztf>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #145 <Method void zztf(zzte)>
	//    4    8:areturn         
	}

	public abstract int size();

	public final String toString()
	{
		return String.format("<ByteString@%s size=%d>", new Object[] {
			Integer.toHexString(System.identityHashCode(((Object) (this)))), Integer.valueOf(size())
		});
	//    0    0:ldc1            #147 <String "<ByteString@%s size=%d>">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:invokestatic    #153 <Method int System.identityHashCode(Object)>
	//    7   12:invokestatic    #159 <Method String Integer.toHexString(int)>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:invokevirtual   #136 <Method int size()>
	//   13   22:invokestatic    #163 <Method Integer Integer.valueOf(int)>
	//   14   25:aastore         
	//   15   26:invokestatic    #167 <Method String String.format(String, Object[])>
	//   16   29:areturn         
	}

	protected abstract int zza(int i, int j, int k);

	protected abstract String zza(Charset charset);

	abstract void zza(zztd zztd)
		throws IOException;

	public abstract byte zzam(int i);

	abstract byte zzan(int i);

	public abstract zzte zzb(int i, int j);

	public final String zzud()
	{
		Charset charset = zzuq.UTF_8;
	//    0    0:getstatic       #121 <Field Charset zzuq.UTF_8>
	//    1    3:astore_1        
		if(size() == 0)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #136 <Method int size()>
	//*   4    8:ifne            14
			return "";
	//    5   11:ldc1            #178 <String "">
	//    6   13:areturn         
		else
			return zza(charset);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #180 <Method String zza(Charset)>
	//   10   19:areturn         
	}

	public abstract boolean zzue();

	protected final int zzuf()
	{
		return zzbsi;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int zzbsi>
	//    2    4:ireturn         
	}

	public static final zzte zzbtq;
	private static final zztk zzbtr;
	private static final Comparator zzbts = new zztg();
	private int zzbsi;

	static 
	{
		zzbtq = ((zzte) (new zzto(zzuq.zzbza)));
	//    0    0:new             #22  <Class zzto>
	//    1    3:dup             
	//    2    4:getstatic       #28  <Field byte[] zzuq.zzbza>
	//    3    7:invokespecial   #32  <Method void zzto(byte[])>
	//    4   10:putstatic       #34  <Field zzte zzbtq>
		Object obj;
		if(zztb.zzub())
	//*   5   13:invokestatic    #40  <Method boolean zztb.zzub()>
	//*   6   16:ifeq            31
			obj = ((Object) (new zztp(((zztf) (null)))));
	//    7   19:new             #42  <Class zztp>
	//    8   22:dup             
	//    9   23:aconst_null     
	//   10   24:invokespecial   #45  <Method void zztp(zztf)>
	//   11   27:astore_0        
		else
	//*  12   28:goto            40
			obj = ((Object) (new zzti(((zztf) (null)))));
	//   13   31:new             #47  <Class zzti>
	//   14   34:dup             
	//   15   35:aconst_null     
	//   16   36:invokespecial   #48  <Method void zzti(zztf)>
	//   17   39:astore_0        
		zzbtr = ((zztk) (obj));
	//   18   40:aload_0         
	//   19   41:putstatic       #50  <Field zztk zzbtr>
	//   20   44:new             #52  <Class zztg>
	//   21   47:dup             
	//   22   48:invokespecial   #54  <Method void zztg()>
	//   23   51:putstatic       #56  <Field Comparator zzbts>
	//*  24   54:return          
	}
}
