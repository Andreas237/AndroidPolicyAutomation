// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzvt, zzvv

final class zzwj
	implements zzvt
{

	zzwj(zzvv zzvv, String s, Object aobj[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzcau = zzvv;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field zzvv zzcau>
		info = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field String info>
		zzcar = aobj;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field Object[] zzcar>
		int i = ((int) (s.charAt(0)));
	//   11   19:aload_2         
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #31  <Method char String.charAt(int)>
	//   14   24:istore          4
		if(i < 55296)
	//*  15   26:iload           4
	//*  16   28:ldc1            #32  <Int 55296>
	//*  17   30:icmpge          40
		{
			flags = i;
	//   18   33:aload_0         
	//   19   34:iload           4
	//   20   36:putfield        #34  <Field int flags>
			return;
	//   21   39:return          
		}
		int k = i & 0x1fff;
	//   22   40:iload           4
	//   23   42:sipush          8191
	//   24   45:iand            
	//   25   46:istore          6
		int j = 13;
	//   26   48:bipush          13
	//   27   50:istore          5
		i = 1;
	//   28   52:iconst_1        
	//   29   53:istore          4
		do
		{
			char c = s.charAt(i);
	//   30   55:aload_2         
	//   31   56:iload           4
	//   32   58:invokevirtual   #31  <Method char String.charAt(int)>
	//   33   61:istore          7
			if(c >= '\uD800')
	//*  34   63:iload           7
	//*  35   65:ldc1            #32  <Int 55296>
	//*  36   67:icmplt          100
			{
				k |= (c & 0x1fff) << j;
	//   37   70:iload           6
	//   38   72:iload           7
	//   39   74:sipush          8191
	//   40   77:iand            
	//   41   78:iload           5
	//   42   80:ishl            
	//   43   81:ior             
	//   44   82:istore          6
				j += 13;
	//   45   84:iload           5
	//   46   86:bipush          13
	//   47   88:iadd            
	//   48   89:istore          5
				i++;
	//   49   91:iload           4
	//   50   93:iconst_1        
	//   51   94:iadd            
	//   52   95:istore          4
			} else
	//*  53   97:goto            55
			{
				flags = k | c << j;
	//   54  100:aload_0         
	//   55  101:iload           6
	//   56  103:iload           7
	//   57  105:iload           5
	//   58  107:ishl            
	//   59  108:ior             
	//   60  109:putfield        #34  <Field int flags>
				return;
	//   61  112:return          
			}
		} while(true);
	}

	public final int zzxm()
	{
		if((flags & 1) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field int flags>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpne          14
			return zzuo.zze.zzbys;
	//    6   10:getstatic       #42  <Field int zzuo$zze.zzbys>
	//    7   13:ireturn         
		else
			return zzuo.zze.zzbyt;
	//    8   14:getstatic       #45  <Field int zzuo$zze.zzbyt>
	//    9   17:ireturn         
	}

	public final boolean zzxn()
	{
		return (flags & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int flags>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public final zzvv zzxo()
	{
		return zzcau;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzvv zzcau>
	//    2    4:areturn         
	}

	final String zzxv()
	{
		return info;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String info>
	//    2    4:areturn         
	}

	final Object[] zzxw()
	{
		return zzcar;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object[] zzcar>
	//    2    4:areturn         
	}

	private final int flags;
	private final String info;
	private final Object zzcar[];
	private final zzvv zzcau;
}
