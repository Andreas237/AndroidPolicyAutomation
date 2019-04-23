// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.charset.Charset;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzbh, zzbb, zzci, zzbe, 
//			zzba, zzff

class zzbi extends zzbh
{

	zzbi(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzbh()>
		zzfp = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field byte[] zzfp>
	//    5    9:return          
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
		if(!(obj instanceof zzbb))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #18  <Class zzbb>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		if(((zzbb)this).size() != ((zzbb)obj).size())
	//*  10   16:aload_0         
	//*  11   17:invokevirtual   #22  <Method int zzbb.size()>
	//*  12   20:aload_1         
	//*  13   21:checkcast       #18  <Class zzbb>
	//*  14   24:invokevirtual   #22  <Method int zzbb.size()>
	//*  15   27:icmpeq          32
			return false;
	//   16   30:iconst_0        
	//   17   31:ireturn         
		if(((zzbb)this).size() == 0)
	//*  18   32:aload_0         
	//*  19   33:invokevirtual   #22  <Method int zzbb.size()>
	//*  20   36:ifne            41
			return true;
	//   21   39:iconst_1        
	//   22   40:ireturn         
		if(obj instanceof zzbi)
	//*  23   41:aload_1         
	//*  24   42:instanceof      #2   <Class zzbi>
	//*  25   45:ifeq            89
		{
			obj = ((Object) ((zzbi)obj));
	//   26   48:aload_1         
	//   27   49:checkcast       #2   <Class zzbi>
	//   28   52:astore_1        
			int i = ((zzbb)this).zzab();
	//   29   53:aload_0         
	//   30   54:invokevirtual   #25  <Method int zzbb.zzab()>
	//   31   57:istore_2        
			int j = ((zzbb) (obj)).zzab();
	//   32   58:aload_1         
	//   33   59:invokevirtual   #25  <Method int zzbb.zzab()>
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
				return ((zzbh)this).zza(((zzbb) (obj)), 0, ((zzbb)this).size());
	//   44   78:aload_0         
	//   45   79:aload_1         
	//   46   80:iconst_0        
	//   47   81:aload_0         
	//   48   82:invokevirtual   #22  <Method int zzbb.size()>
	//   49   85:invokevirtual   #29  <Method boolean zzbh.zza(zzbb, int, int)>
	//   50   88:ireturn         
		} else
		{
			return obj.equals(((Object) (this)));
	//   51   89:aload_1         
	//   52   90:aload_0         
	//   53   91:invokevirtual   #33  <Method boolean Object.equals(Object)>
	//   54   94:ireturn         
		}
	}

	public int size()
	{
		return zzfp.length;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field byte[] zzfp>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	protected final int zza(int i, int j, int k)
	{
		return zzci.zza(i, zzfp, zzac(), k);
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field byte[] zzfp>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #37  <Method int zzac()>
	//    5    9:iload_3         
	//    6   10:invokestatic    #42  <Method int zzci.zza(int, byte[], int, int)>
	//    7   13:ireturn         
	}

	public final zzbb zza(int i, int j)
	{
		i = zzb(0, j, ((zzbb)this).size());
	//    0    0:iconst_0        
	//    1    1:iload_2         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method int zzbb.size()>
	//    4    6:invokestatic    #46  <Method int zzb(int, int, int)>
	//    5    9:istore_1        
		if(i == 0)
	//*   6   10:iload_1         
	//*   7   11:ifne            18
			return zzbb.zzfi;
	//    8   14:getstatic       #50  <Field zzbb zzbb.zzfi>
	//    9   17:areturn         
		else
			return ((zzbb) (new zzbe(zzfp, zzac(), i)));
	//   10   18:new             #52  <Class zzbe>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #13  <Field byte[] zzfp>
	//   14   26:aload_0         
	//   15   27:invokevirtual   #37  <Method int zzac()>
	//   16   30:iload_1         
	//   17   31:invokespecial   #55  <Method void zzbe(byte[], int, int)>
	//   18   34:areturn         
	}

	protected final String zza(Charset charset)
	{
		return new String(zzfp, zzac(), ((zzbb)this).size(), charset);
	//    0    0:new             #58  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field byte[] zzfp>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #37  <Method int zzac()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #22  <Method int zzbb.size()>
	//    8   16:aload_1         
	//    9   17:invokespecial   #61  <Method void String(byte[], int, int, Charset)>
	//   10   20:areturn         
	}

	final void zza(zzba zzba1)
		throws IOException
	{
		zzba1.zza(zzfp, zzac(), ((zzbb)this).size());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field byte[] zzfp>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #37  <Method int zzac()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #22  <Method int zzbb.size()>
	//    7   13:invokevirtual   #68  <Method void zzba.zza(byte[], int, int)>
	//    8   16:return          
	}

	final boolean zza(zzbb zzbb1, int i, int j)
	{
		if(j <= zzbb1.size())
	//*   0    0:iload_3         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #22  <Method int zzbb.size()>
	//*   3    5:icmpgt          164
		{
			if(j <= zzbb1.size())
	//*   4    8:iload_3         
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #22  <Method int zzbb.size()>
	//*   7   13:icmpgt          111
			{
				if(zzbb1 instanceof zzbi)
	//*   8   16:aload_1         
	//*   9   17:instanceof      #2   <Class zzbi>
	//*  10   20:ifeq            95
				{
					zzbb1 = ((zzbb) ((zzbi)zzbb1));
	//   11   23:aload_1         
	//   12   24:checkcast       #2   <Class zzbi>
	//   13   27:astore_1        
					byte abyte0[] = zzfp;
	//   14   28:aload_0         
	//   15   29:getfield        #13  <Field byte[] zzfp>
	//   16   32:astore          6
					byte abyte1[] = ((zzbi) (zzbb1)).zzfp;
	//   17   34:aload_1         
	//   18   35:getfield        #13  <Field byte[] zzfp>
	//   19   38:astore          7
					int l = zzac();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #37  <Method int zzac()>
	//   22   44:istore          5
					int k = zzac();
	//   23   46:aload_0         
	//   24   47:invokevirtual   #37  <Method int zzac()>
	//   25   50:istore          4
					for(i = ((zzbi) (zzbb1)).zzac(); k < l + j; i++)
	//*  26   52:aload_1         
	//*  27   53:invokevirtual   #37  <Method int zzac()>
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
					return zzbb1.zza(0, j).equals(((Object) (((zzbb)this).zza(0, j))));
	//   54   95:aload_1         
	//   55   96:iconst_0        
	//   56   97:iload_3         
	//   57   98:invokevirtual   #71  <Method zzbb zzbb.zza(int, int)>
	//   58  101:aload_0         
	//   59  102:iconst_0        
	//   60  103:iload_3         
	//   61  104:invokevirtual   #71  <Method zzbb zzbb.zza(int, int)>
	//   62  107:invokevirtual   #72  <Method boolean zzbb.equals(Object)>
	//   63  110:ireturn         
				}
			} else
			{
				i = zzbb1.size();
	//   64  111:aload_1         
	//   65  112:invokevirtual   #22  <Method int zzbb.size()>
	//   66  115:istore_2        
				zzbb1 = ((zzbb) (new StringBuilder(59)));
	//   67  116:new             #74  <Class StringBuilder>
	//   68  119:dup             
	//   69  120:bipush          59
	//   70  122:invokespecial   #77  <Method void StringBuilder(int)>
	//   71  125:astore_1        
				((StringBuilder) (zzbb1)).append("Ran off end of other: 0, ");
	//   72  126:aload_1         
	//   73  127:ldc1            #79  <String "Ran off end of other: 0, ">
	//   74  129:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   75  132:pop             
				((StringBuilder) (zzbb1)).append(j);
	//   76  133:aload_1         
	//   77  134:iload_3         
	//   78  135:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   79  138:pop             
				((StringBuilder) (zzbb1)).append(", ");
	//   80  139:aload_1         
	//   81  140:ldc1            #88  <String ", ">
	//   82  142:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   83  145:pop             
				((StringBuilder) (zzbb1)).append(i);
	//   84  146:aload_1         
	//   85  147:iload_2         
	//   86  148:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   87  151:pop             
				throw new IllegalArgumentException(((StringBuilder) (zzbb1)).toString());
	//   88  152:new             #90  <Class IllegalArgumentException>
	//   89  155:dup             
	//   90  156:aload_1         
	//   91  157:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   92  160:invokespecial   #97  <Method void IllegalArgumentException(String)>
	//   93  163:athrow          
			}
		} else
		{
			i = ((zzbb)this).size();
	//   94  164:aload_0         
	//   95  165:invokevirtual   #22  <Method int zzbb.size()>
	//   96  168:istore_2        
			zzbb1 = ((zzbb) (new StringBuilder(40)));
	//   97  169:new             #74  <Class StringBuilder>
	//   98  172:dup             
	//   99  173:bipush          40
	//  100  175:invokespecial   #77  <Method void StringBuilder(int)>
	//  101  178:astore_1        
			((StringBuilder) (zzbb1)).append("Length too large: ");
	//  102  179:aload_1         
	//  103  180:ldc1            #99  <String "Length too large: ">
	//  104  182:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//  105  185:pop             
			((StringBuilder) (zzbb1)).append(j);
	//  106  186:aload_1         
	//  107  187:iload_3         
	//  108  188:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//  109  191:pop             
			((StringBuilder) (zzbb1)).append(i);
	//  110  192:aload_1         
	//  111  193:iload_2         
	//  112  194:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//  113  197:pop             
			throw new IllegalArgumentException(((StringBuilder) (zzbb1)).toString());
	//  114  198:new             #90  <Class IllegalArgumentException>
	//  115  201:dup             
	//  116  202:aload_1         
	//  117  203:invokevirtual   #94  <Method String StringBuilder.toString()>
	//  118  206:invokespecial   #97  <Method void IllegalArgumentException(String)>
	//  119  209:athrow          
		}
	}

	public final boolean zzaa()
	{
		int i = zzac();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method int zzac()>
	//    2    4:istore_1        
		return zzff.zze(zzfp, i, ((zzbb)this).size() + i);
	//    3    5:aload_0         
	//    4    6:getfield        #13  <Field byte[] zzfp>
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #22  <Method int zzbb.size()>
	//    8   14:iload_1         
	//    9   15:iadd            
	//   10   16:invokestatic    #107 <Method boolean zzff.zze(byte[], int, int)>
	//   11   19:ireturn         
	}

	protected int zzac()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public byte zzj(int i)
	{
		return zzfp[i];
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field byte[] zzfp>
	//    2    4:iload_1         
	//    3    5:baload          
	//    4    6:ireturn         
	}

	protected final byte zzfp[];
}
