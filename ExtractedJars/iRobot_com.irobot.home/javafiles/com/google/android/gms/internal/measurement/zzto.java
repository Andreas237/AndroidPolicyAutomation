// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zztn, zzte, zzuq, zztd, 
//			zztj, zzxl

class zzto extends zztn
{

	zzto(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zztn()>
		if(abyte0 == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       16
		{
			throw new NullPointerException();
	//    4    8:new             #13  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #14  <Method void NullPointerException()>
	//    7   15:athrow          
		} else
		{
			zzbtz = abyte0;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #16  <Field byte[] zzbtz>
			return;
	//   11   21:return          
		}
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
		if(!(obj instanceof zzte))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #21  <Class zzte>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		if(((zzte)this).size() != ((zzte)obj).size())
	//*  10   16:aload_0         
	//*  11   17:invokevirtual   #25  <Method int zzte.size()>
	//*  12   20:aload_1         
	//*  13   21:checkcast       #21  <Class zzte>
	//*  14   24:invokevirtual   #25  <Method int zzte.size()>
	//*  15   27:icmpeq          32
			return false;
	//   16   30:iconst_0        
	//   17   31:ireturn         
		if(((zzte)this).size() == 0)
	//*  18   32:aload_0         
	//*  19   33:invokevirtual   #25  <Method int zzte.size()>
	//*  20   36:ifne            41
			return true;
	//   21   39:iconst_1        
	//   22   40:ireturn         
		if(obj instanceof zzto)
	//*  23   41:aload_1         
	//*  24   42:instanceof      #2   <Class zzto>
	//*  25   45:ifeq            89
		{
			obj = ((Object) ((zzto)obj));
	//   26   48:aload_1         
	//   27   49:checkcast       #2   <Class zzto>
	//   28   52:astore_1        
			int i = ((zzte)this).zzuf();
	//   29   53:aload_0         
	//   30   54:invokevirtual   #28  <Method int zzte.zzuf()>
	//   31   57:istore_2        
			int j = ((zzte) (obj)).zzuf();
	//   32   58:aload_1         
	//   33   59:invokevirtual   #28  <Method int zzte.zzuf()>
	//   34   62:istore_3        
			if(i != 0 && j != 0 && i != j)
	//*  35   63:iload_2         
	//*  36   64:ifeq            78
	//*  37   67:iload_3         
	//*  38   68:ifeq            78
	//*  39   71:iload_2         
	//*  40   72:iload_3         
	//*  41   73:icmpeq          78
				return false;
	//   42   76:iconst_0        
	//   43   77:ireturn         
			else
				return ((zztn)this).zza(((zzte) (obj)), 0, ((zzte)this).size());
	//   44   78:aload_0         
	//   45   79:aload_1         
	//   46   80:iconst_0        
	//   47   81:aload_0         
	//   48   82:invokevirtual   #25  <Method int zzte.size()>
	//   49   85:invokevirtual   #32  <Method boolean zztn.zza(zzte, int, int)>
	//   50   88:ireturn         
		} else
		{
			return obj.equals(((Object) (this)));
	//   51   89:aload_1         
	//   52   90:aload_0         
	//   53   91:invokevirtual   #36  <Method boolean Object.equals(Object)>
	//   54   94:ireturn         
		}
	}

	public int size()
	{
		return zzbtz.length;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field byte[] zzbtz>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	protected final int zza(int i, int j, int k)
	{
		return zzuq.zza(i, zzbtz, zzug(), k);
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #16  <Field byte[] zzbtz>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #40  <Method int zzug()>
	//    5    9:iload_3         
	//    6   10:invokestatic    #45  <Method int zzuq.zza(int, byte[], int, int)>
	//    7   13:ireturn         
	}

	protected final String zza(Charset charset)
	{
		return new String(zzbtz, zzug(), ((zzte)this).size(), charset);
	//    0    0:new             #48  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field byte[] zzbtz>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #40  <Method int zzug()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #25  <Method int zzte.size()>
	//    8   16:aload_1         
	//    9   17:invokespecial   #51  <Method void String(byte[], int, int, Charset)>
	//   10   20:areturn         
	}

	final void zza(zztd zztd1)
	{
		zztd1.zza(zzbtz, zzug(), ((zzte)this).size());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #16  <Field byte[] zzbtz>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #40  <Method int zzug()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #25  <Method int zzte.size()>
	//    7   13:invokevirtual   #57  <Method void zztd.zza(byte[], int, int)>
	//    8   16:return          
	}

	final boolean zza(zzte zzte1, int i, int j)
	{
		if(j > zzte1.size())
	//*   0    0:iload_3         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #25  <Method int zzte.size()>
	//*   3    5:icmple          54
		{
			i = ((zzte)this).size();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #25  <Method int zzte.size()>
	//    6   12:istore_2        
			zzte1 = ((zzte) (new StringBuilder(40)));
	//    7   13:new             #59  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:bipush          40
	//   10   19:invokespecial   #62  <Method void StringBuilder(int)>
	//   11   22:astore_1        
			((StringBuilder) (zzte1)).append("Length too large: ");
	//   12   23:aload_1         
	//   13   24:ldc1            #64  <String "Length too large: ">
	//   14   26:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
			((StringBuilder) (zzte1)).append(j);
	//   16   30:aload_1         
	//   17   31:iload_3         
	//   18   32:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   19   35:pop             
			((StringBuilder) (zzte1)).append(i);
	//   20   36:aload_1         
	//   21   37:iload_2         
	//   22   38:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   23   41:pop             
			throw new IllegalArgumentException(((StringBuilder) (zzte1)).toString());
	//   24   42:new             #73  <Class IllegalArgumentException>
	//   25   45:dup             
	//   26   46:aload_1         
	//   27   47:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   28   50:invokespecial   #80  <Method void IllegalArgumentException(String)>
	//   29   53:athrow          
		}
		if(j > zzte1.size())
	//*  30   54:iload_3         
	//*  31   55:aload_1         
	//*  32   56:invokevirtual   #25  <Method int zzte.size()>
	//*  33   59:icmple          115
		{
			i = zzte1.size();
	//   34   62:aload_1         
	//   35   63:invokevirtual   #25  <Method int zzte.size()>
	//   36   66:istore_2        
			zzte1 = ((zzte) (new StringBuilder(59)));
	//   37   67:new             #59  <Class StringBuilder>
	//   38   70:dup             
	//   39   71:bipush          59
	//   40   73:invokespecial   #62  <Method void StringBuilder(int)>
	//   41   76:astore_1        
			((StringBuilder) (zzte1)).append("Ran off end of other: 0, ");
	//   42   77:aload_1         
	//   43   78:ldc1            #82  <String "Ran off end of other: 0, ">
	//   44   80:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   45   83:pop             
			((StringBuilder) (zzte1)).append(j);
	//   46   84:aload_1         
	//   47   85:iload_3         
	//   48   86:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   49   89:pop             
			((StringBuilder) (zzte1)).append(", ");
	//   50   90:aload_1         
	//   51   91:ldc1            #84  <String ", ">
	//   52   93:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   53   96:pop             
			((StringBuilder) (zzte1)).append(i);
	//   54   97:aload_1         
	//   55   98:iload_2         
	//   56   99:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   57  102:pop             
			throw new IllegalArgumentException(((StringBuilder) (zzte1)).toString());
	//   58  103:new             #73  <Class IllegalArgumentException>
	//   59  106:dup             
	//   60  107:aload_1         
	//   61  108:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   62  111:invokespecial   #80  <Method void IllegalArgumentException(String)>
	//   63  114:athrow          
		}
		if(zzte1 instanceof zzto)
	//*  64  115:aload_1         
	//*  65  116:instanceof      #2   <Class zzto>
	//*  66  119:ifeq            194
		{
			zzte1 = ((zzte) ((zzto)zzte1));
	//   67  122:aload_1         
	//   68  123:checkcast       #2   <Class zzto>
	//   69  126:astore_1        
			byte abyte0[] = zzbtz;
	//   70  127:aload_0         
	//   71  128:getfield        #16  <Field byte[] zzbtz>
	//   72  131:astore          6
			byte abyte1[] = ((zzto) (zzte1)).zzbtz;
	//   73  133:aload_1         
	//   74  134:getfield        #16  <Field byte[] zzbtz>
	//   75  137:astore          7
			int l = zzug();
	//   76  139:aload_0         
	//   77  140:invokevirtual   #40  <Method int zzug()>
	//   78  143:istore          5
			int k = zzug();
	//   79  145:aload_0         
	//   80  146:invokevirtual   #40  <Method int zzug()>
	//   81  149:istore          4
			for(i = ((zzto) (zzte1)).zzug(); k < l + j; i++)
	//*  82  151:aload_1         
	//*  83  152:invokevirtual   #40  <Method int zzug()>
	//*  84  155:istore_2        
	//*  85  156:iload           4
	//*  86  158:iload           5
	//*  87  160:iload_3         
	//*  88  161:iadd            
	//*  89  162:icmpge          192
			{
				if(abyte0[k] != abyte1[i])
	//*  90  165:aload           6
	//*  91  167:iload           4
	//*  92  169:baload          
	//*  93  170:aload           7
	//*  94  172:iload_2         
	//*  95  173:baload          
	//*  96  174:icmpeq          179
					return false;
	//   97  177:iconst_0        
	//   98  178:ireturn         
				k++;
	//   99  179:iload           4
	//  100  181:iconst_1        
	//  101  182:iadd            
	//  102  183:istore          4
			}

	//  103  185:iload_2         
	//  104  186:iconst_1        
	//  105  187:iadd            
	//  106  188:istore_2        
	//* 107  189:goto            156
			return true;
	//  108  192:iconst_1        
	//  109  193:ireturn         
		} else
		{
			return zzte1.zzb(0, j).equals(((Object) (((zzte)this).zzb(0, j))));
	//  110  194:aload_1         
	//  111  195:iconst_0        
	//  112  196:iload_3         
	//  113  197:invokevirtual   #88  <Method zzte zzte.zzb(int, int)>
	//  114  200:aload_0         
	//  115  201:iconst_0        
	//  116  202:iload_3         
	//  117  203:invokevirtual   #88  <Method zzte zzte.zzb(int, int)>
	//  118  206:invokevirtual   #89  <Method boolean zzte.equals(Object)>
	//  119  209:ireturn         
		}
	}

	public byte zzam(int i)
	{
		return zzbtz[i];
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field byte[] zzbtz>
	//    2    4:iload_1         
	//    3    5:baload          
	//    4    6:ireturn         
	}

	byte zzan(int i)
	{
		return zzbtz[i];
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field byte[] zzbtz>
	//    2    4:iload_1         
	//    3    5:baload          
	//    4    6:ireturn         
	}

	public final zzte zzb(int i, int j)
	{
		i = zzb(0, j, ((zzte)this).size());
	//    0    0:iconst_0        
	//    1    1:iload_2         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #25  <Method int zzte.size()>
	//    4    6:invokestatic    #94  <Method int zzb(int, int, int)>
	//    5    9:istore_1        
		if(i == 0)
	//*   6   10:iload_1         
	//*   7   11:ifne            18
			return zzte.zzbts;
	//    8   14:getstatic       #98  <Field zzte zzte.zzbts>
	//    9   17:areturn         
		else
			return ((zzte) (new zztj(zzbtz, zzug(), i)));
	//   10   18:new             #100 <Class zztj>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #16  <Field byte[] zzbtz>
	//   14   26:aload_0         
	//   15   27:invokevirtual   #40  <Method int zzug()>
	//   16   30:iload_1         
	//   17   31:invokespecial   #102 <Method void zztj(byte[], int, int)>
	//   18   34:areturn         
	}

	public final boolean zzue()
	{
		int i = zzug();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method int zzug()>
	//    2    4:istore_1        
		return zzxl.zzf(zzbtz, i, ((zzte)this).size() + i);
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field byte[] zzbtz>
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #25  <Method int zzte.size()>
	//    8   14:iload_1         
	//    9   15:iadd            
	//   10   16:invokestatic    #110 <Method boolean zzxl.zzf(byte[], int, int)>
	//   11   19:ireturn         
	}

	protected int zzug()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected final byte zzbtz[];
}
