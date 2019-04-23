// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
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
		if(abyte0 != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          14
		{
			zzbtx = abyte0;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #13  <Field byte[] zzbtx>
			return;
	//    7   13:return          
		} else
		{
			throw new NullPointerException();
	//    8   14:new             #15  <Class NullPointerException>
	//    9   17:dup             
	//   10   18:invokespecial   #16  <Method void NullPointerException()>
	//   11   21:athrow          
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
		return zzbtx.length;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field byte[] zzbtx>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	protected final int zza(int i, int j, int k)
	{
		return zzuq.zza(i, zzbtx, zzug(), k);
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field byte[] zzbtx>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #40  <Method int zzug()>
	//    5    9:iload_3         
	//    6   10:invokestatic    #45  <Method int zzuq.zza(int, byte[], int, int)>
	//    7   13:ireturn         
	}

	protected final String zza(Charset charset)
	{
		return new String(zzbtx, zzug(), ((zzte)this).size(), charset);
	//    0    0:new             #48  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field byte[] zzbtx>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #40  <Method int zzug()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #25  <Method int zzte.size()>
	//    8   16:aload_1         
	//    9   17:invokespecial   #51  <Method void String(byte[], int, int, Charset)>
	//   10   20:areturn         
	}

	final void zza(zztd zztd1)
		throws IOException
	{
		zztd1.zza(zzbtx, zzug(), ((zzte)this).size());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field byte[] zzbtx>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #40  <Method int zzug()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #25  <Method int zzte.size()>
	//    7   13:invokevirtual   #59  <Method void zztd.zza(byte[], int, int)>
	//    8   16:return          
	}

	final boolean zza(zzte zzte1, int i, int j)
	{
		if(j <= zzte1.size())
	//*   0    0:iload_3         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #25  <Method int zzte.size()>
	//*   3    5:icmpgt          164
		{
			if(j <= zzte1.size())
	//*   4    8:iload_3         
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #25  <Method int zzte.size()>
	//*   7   13:icmpgt          111
			{
				if(zzte1 instanceof zzto)
	//*   8   16:aload_1         
	//*   9   17:instanceof      #2   <Class zzto>
	//*  10   20:ifeq            95
				{
					zzte1 = ((zzte) ((zzto)zzte1));
	//   11   23:aload_1         
	//   12   24:checkcast       #2   <Class zzto>
	//   13   27:astore_1        
					byte abyte0[] = zzbtx;
	//   14   28:aload_0         
	//   15   29:getfield        #13  <Field byte[] zzbtx>
	//   16   32:astore          6
					byte abyte1[] = ((zzto) (zzte1)).zzbtx;
	//   17   34:aload_1         
	//   18   35:getfield        #13  <Field byte[] zzbtx>
	//   19   38:astore          7
					int l = zzug();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #40  <Method int zzug()>
	//   22   44:istore          5
					int k = zzug();
	//   23   46:aload_0         
	//   24   47:invokevirtual   #40  <Method int zzug()>
	//   25   50:istore          4
					for(i = ((zzto) (zzte1)).zzug(); k < l + j; i++)
	//*  26   52:aload_1         
	//*  27   53:invokevirtual   #40  <Method int zzug()>
	//*  28   56:istore_2        
	//*  29   57:iload           4
	//*  30   59:iload           5
	//*  31   61:iload_3         
	//*  32   62:iadd            
	//*  33   63:icmpge          93
					{
						if(abyte0[k] != abyte1[i])
	//*  34   66:aload           6
	//*  35   68:iload           4
	//*  36   70:baload          
	//*  37   71:aload           7
	//*  38   73:iload_2         
	//*  39   74:baload          
	//*  40   75:icmpeq          80
							return false;
	//   41   78:iconst_0        
	//   42   79:ireturn         
						k++;
	//   43   80:iload           4
	//   44   82:iconst_1        
	//   45   83:iadd            
	//   46   84:istore          4
					}

	//   47   86:iload_2         
	//   48   87:iconst_1        
	//   49   88:iadd            
	//   50   89:istore_2        
	//*  51   90:goto            57
					return true;
	//   52   93:iconst_1        
	//   53   94:ireturn         
				} else
				{
					return zzte1.zzb(0, j).equals(((Object) (((zzte)this).zzb(0, j))));
	//   54   95:aload_1         
	//   55   96:iconst_0        
	//   56   97:iload_3         
	//   57   98:invokevirtual   #64  <Method zzte zzte.zzb(int, int)>
	//   58  101:aload_0         
	//   59  102:iconst_0        
	//   60  103:iload_3         
	//   61  104:invokevirtual   #64  <Method zzte zzte.zzb(int, int)>
	//   62  107:invokevirtual   #65  <Method boolean zzte.equals(Object)>
	//   63  110:ireturn         
				}
			} else
			{
				i = zzte1.size();
	//   64  111:aload_1         
	//   65  112:invokevirtual   #25  <Method int zzte.size()>
	//   66  115:istore_2        
				zzte1 = ((zzte) (new StringBuilder(59)));
	//   67  116:new             #67  <Class StringBuilder>
	//   68  119:dup             
	//   69  120:bipush          59
	//   70  122:invokespecial   #70  <Method void StringBuilder(int)>
	//   71  125:astore_1        
				((StringBuilder) (zzte1)).append("Ran off end of other: 0, ");
	//   72  126:aload_1         
	//   73  127:ldc1            #72  <String "Ran off end of other: 0, ">
	//   74  129:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   75  132:pop             
				((StringBuilder) (zzte1)).append(j);
	//   76  133:aload_1         
	//   77  134:iload_3         
	//   78  135:invokevirtual   #79  <Method StringBuilder StringBuilder.append(int)>
	//   79  138:pop             
				((StringBuilder) (zzte1)).append(", ");
	//   80  139:aload_1         
	//   81  140:ldc1            #81  <String ", ">
	//   82  142:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   83  145:pop             
				((StringBuilder) (zzte1)).append(i);
	//   84  146:aload_1         
	//   85  147:iload_2         
	//   86  148:invokevirtual   #79  <Method StringBuilder StringBuilder.append(int)>
	//   87  151:pop             
				throw new IllegalArgumentException(((StringBuilder) (zzte1)).toString());
	//   88  152:new             #83  <Class IllegalArgumentException>
	//   89  155:dup             
	//   90  156:aload_1         
	//   91  157:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   92  160:invokespecial   #90  <Method void IllegalArgumentException(String)>
	//   93  163:athrow          
			}
		} else
		{
			i = ((zzte)this).size();
	//   94  164:aload_0         
	//   95  165:invokevirtual   #25  <Method int zzte.size()>
	//   96  168:istore_2        
			zzte1 = ((zzte) (new StringBuilder(40)));
	//   97  169:new             #67  <Class StringBuilder>
	//   98  172:dup             
	//   99  173:bipush          40
	//  100  175:invokespecial   #70  <Method void StringBuilder(int)>
	//  101  178:astore_1        
			((StringBuilder) (zzte1)).append("Length too large: ");
	//  102  179:aload_1         
	//  103  180:ldc1            #92  <String "Length too large: ">
	//  104  182:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//  105  185:pop             
			((StringBuilder) (zzte1)).append(j);
	//  106  186:aload_1         
	//  107  187:iload_3         
	//  108  188:invokevirtual   #79  <Method StringBuilder StringBuilder.append(int)>
	//  109  191:pop             
			((StringBuilder) (zzte1)).append(i);
	//  110  192:aload_1         
	//  111  193:iload_2         
	//  112  194:invokevirtual   #79  <Method StringBuilder StringBuilder.append(int)>
	//  113  197:pop             
			throw new IllegalArgumentException(((StringBuilder) (zzte1)).toString());
	//  114  198:new             #83  <Class IllegalArgumentException>
	//  115  201:dup             
	//  116  202:aload_1         
	//  117  203:invokevirtual   #87  <Method String StringBuilder.toString()>
	//  118  206:invokespecial   #90  <Method void IllegalArgumentException(String)>
	//  119  209:athrow          
		}
	}

	public byte zzam(int i)
	{
		return zzbtx[i];
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field byte[] zzbtx>
	//    2    4:iload_1         
	//    3    5:baload          
	//    4    6:ireturn         
	}

	byte zzan(int i)
	{
		return zzbtx[i];
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field byte[] zzbtx>
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
	//    4    6:invokestatic    #97  <Method int zzb(int, int, int)>
	//    5    9:istore_1        
		if(i == 0)
	//*   6   10:iload_1         
	//*   7   11:ifne            18
			return zzte.zzbtq;
	//    8   14:getstatic       #101 <Field zzte zzte.zzbtq>
	//    9   17:areturn         
		else
			return ((zzte) (new zztj(zzbtx, zzug(), i)));
	//   10   18:new             #103 <Class zztj>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #13  <Field byte[] zzbtx>
	//   14   26:aload_0         
	//   15   27:invokevirtual   #40  <Method int zzug()>
	//   16   30:iload_1         
	//   17   31:invokespecial   #105 <Method void zztj(byte[], int, int)>
	//   18   34:areturn         
	}

	public final boolean zzue()
	{
		int i = zzug();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method int zzug()>
	//    2    4:istore_1        
		return zzxl.zzf(zzbtx, i, ((zzte)this).size() + i);
	//    3    5:aload_0         
	//    4    6:getfield        #13  <Field byte[] zzbtx>
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #25  <Method int zzte.size()>
	//    8   14:iload_1         
	//    9   15:iadd            
	//   10   16:invokestatic    #113 <Method boolean zzxl.zzf(byte[], int, int)>
	//   11   19:ireturn         
	}

	protected int zzug()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected final byte zzbtx[];
}
