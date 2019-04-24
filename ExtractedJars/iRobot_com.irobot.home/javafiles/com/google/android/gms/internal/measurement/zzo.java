// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyc, zzn, zzyg, zzl, 
//			zzye, zzxz, zzyl, zzya, 
//			zzyi

public final class zzo extends zzyc
{

	public zzo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzyc()>
		zzqf = zzn.zzj();
	//    2    4:aload_0         
	//    3    5:invokestatic    #21  <Method zzn[] zzn.zzj()>
	//    4    8:putfield        #23  <Field zzn[] zzqf>
		zzqg = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #25  <Field zzl zzqg>
		zzqh = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #27  <String "">
	//   10   19:putfield        #29  <Field String zzqh>
		zzcev = null;
	//   11   22:aload_0         
	//   12   23:aconst_null     
	//   13   24:putfield        #33  <Field zzye zzcev>
		zzcff = -1;
	//   14   27:aload_0         
	//   15   28:iconst_m1       
	//   16   29:putfield        #37  <Field int zzcff>
	//   17   32:return          
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
		if(!(obj instanceof zzo))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzo>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzo)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzo>
	//   12   20:astore_1        
		if(!zzyg.equals(((Object []) (zzqf)), ((Object []) (((zzo) (obj)).zzqf))))
	//*  13   21:aload_0         
	//*  14   22:getfield        #23  <Field zzn[] zzqf>
	//*  15   25:aload_1         
	//*  16   26:getfield        #23  <Field zzn[] zzqf>
	//*  17   29:invokestatic    #45  <Method boolean zzyg.equals(Object[], Object[])>
	//*  18   32:ifne            37
			return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
		if(zzqg == null)
	//*  21   37:aload_0         
	//*  22   38:getfield        #25  <Field zzl zzqg>
	//*  23   41:ifnonnull       53
		{
			if(((zzo) (obj)).zzqg != null)
	//*  24   44:aload_1         
	//*  25   45:getfield        #25  <Field zzl zzqg>
	//*  26   48:ifnull          69
				return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
		} else
		if(!zzqg.equals(((Object) (((zzo) (obj)).zzqg))))
	//*  29   53:aload_0         
	//*  30   54:getfield        #25  <Field zzl zzqg>
	//*  31   57:aload_1         
	//*  32   58:getfield        #25  <Field zzl zzqg>
	//*  33   61:invokevirtual   #49  <Method boolean zzl.equals(Object)>
	//*  34   64:ifne            69
			return false;
	//   35   67:iconst_0        
	//   36   68:ireturn         
		if(zzqh == null)
	//*  37   69:aload_0         
	//*  38   70:getfield        #29  <Field String zzqh>
	//*  39   73:ifnonnull       85
		{
			if(((zzo) (obj)).zzqh != null)
	//*  40   76:aload_1         
	//*  41   77:getfield        #29  <Field String zzqh>
	//*  42   80:ifnull          101
				return false;
	//   43   83:iconst_0        
	//   44   84:ireturn         
		} else
		if(!zzqh.equals(((Object) (((zzo) (obj)).zzqh))))
	//*  45   85:aload_0         
	//*  46   86:getfield        #29  <Field String zzqh>
	//*  47   89:aload_1         
	//*  48   90:getfield        #29  <Field String zzqh>
	//*  49   93:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  50   96:ifne            101
			return false;
	//   51   99:iconst_0        
	//   52  100:ireturn         
		if(zzcev != null && !zzcev.isEmpty())
	//*  53  101:aload_0         
	//*  54  102:getfield        #33  <Field zzye zzcev>
	//*  55  105:ifnull          133
	//*  56  108:aload_0         
	//*  57  109:getfield        #33  <Field zzye zzcev>
	//*  58  112:invokevirtual   #58  <Method boolean zzye.isEmpty()>
	//*  59  115:ifeq            121
	//*  60  118:goto            133
			return zzcev.equals(((Object) (((zzo) (obj)).zzcev)));
	//   61  121:aload_0         
	//   62  122:getfield        #33  <Field zzye zzcev>
	//   63  125:aload_1         
	//   64  126:getfield        #33  <Field zzye zzcev>
	//   65  129:invokevirtual   #59  <Method boolean zzye.equals(Object)>
	//   66  132:ireturn         
		if(((zzo) (obj)).zzcev != null)
	//*  67  133:aload_1         
	//*  68  134:getfield        #33  <Field zzye zzcev>
	//*  69  137:ifnull          154
			return ((zzo) (obj)).zzcev.isEmpty();
	//   70  140:aload_1         
	//   71  141:getfield        #33  <Field zzye zzcev>
	//   72  144:invokevirtual   #58  <Method boolean zzye.isEmpty()>
	//   73  147:ifeq            152
	//   74  150:iconst_1        
	//   75  151:ireturn         
	//   76  152:iconst_0        
	//   77  153:ireturn         
		else
			return true;
	//   78  154:iconst_1        
	//   79  155:ireturn         
	}

	public final int hashCode()
	{
		int l = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #73  <Method String Class.getName()>
	//    3    7:invokevirtual   #75  <Method int String.hashCode()>
	//    4   10:istore          5
		int i1 = zzyg.hashCode(((Object []) (zzqf)));
	//    5   12:aload_0         
	//    6   13:getfield        #23  <Field zzn[] zzqf>
	//    7   16:invokestatic    #78  <Method int zzyg.hashCode(Object[])>
	//    8   19:istore          6
		zzl zzl1 = zzqg;
	//    9   21:aload_0         
	//   10   22:getfield        #25  <Field zzl zzqg>
	//   11   25:astore          7
		boolean flag = false;
	//   12   27:iconst_0        
	//   13   28:istore          4
		int i;
		if(zzl1 == null)
	//*  14   30:aload           7
	//*  15   32:ifnonnull       40
			i = 0;
	//   16   35:iconst_0        
	//   17   36:istore_1        
		else
	//*  18   37:goto            46
			i = zzl1.hashCode();
	//   19   40:aload           7
	//   20   42:invokevirtual   #79  <Method int zzl.hashCode()>
	//   21   45:istore_1        
		int j;
		if(zzqh == null)
	//*  22   46:aload_0         
	//*  23   47:getfield        #29  <Field String zzqh>
	//*  24   50:ifnonnull       58
			j = 0;
	//   25   53:iconst_0        
	//   26   54:istore_2        
		else
	//*  27   55:goto            66
			j = zzqh.hashCode();
	//   28   58:aload_0         
	//   29   59:getfield        #29  <Field String zzqh>
	//   30   62:invokevirtual   #75  <Method int String.hashCode()>
	//   31   65:istore_2        
		int k = ((int) (flag));
	//   32   66:iload           4
	//   33   68:istore_3        
		if(zzcev != null)
	//*  34   69:aload_0         
	//*  35   70:getfield        #33  <Field zzye zzcev>
	//*  36   73:ifnull          100
			if(zzcev.isEmpty())
	//*  37   76:aload_0         
	//*  38   77:getfield        #33  <Field zzye zzcev>
	//*  39   80:invokevirtual   #58  <Method boolean zzye.isEmpty()>
	//*  40   83:ifeq            92
				k = ((int) (flag));
	//   41   86:iload           4
	//   42   88:istore_3        
			else
	//*  43   89:goto            100
				k = zzcev.hashCode();
	//   44   92:aload_0         
	//   45   93:getfield        #33  <Field zzye zzcev>
	//   46   96:invokevirtual   #80  <Method int zzye.hashCode()>
	//   47   99:istore_3        
		return ((((l + 527) * 31 + i1) * 31 + i) * 31 + j) * 31 + k;
	//   48  100:iload           5
	//   49  102:sipush          527
	//   50  105:iadd            
	//   51  106:bipush          31
	//   52  108:imul            
	//   53  109:iload           6
	//   54  111:iadd            
	//   55  112:bipush          31
	//   56  114:imul            
	//   57  115:iload_1         
	//   58  116:iadd            
	//   59  117:bipush          31
	//   60  119:imul            
	//   61  120:iload_2         
	//   62  121:iadd            
	//   63  122:bipush          31
	//   64  124:imul            
	//   65  125:iload_3         
	//   66  126:iadd            
	//   67  127:ireturn         
	}

	public final zzyi zza(zzxz zzxz1)
	{
		do
		{
			int i = zzxz1.zzuj();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #87  <Method int zzxz.zzuj()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            199
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          78
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          49
				{
					if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          38
					{
						if(!super.zza(zzxz1, i))
	//*  14   27:aload_0         
	//*  15   28:aload_1         
	//*  16   29:iload_2         
	//*  17   30:invokespecial   #90  <Method boolean zzyc.zza(zzxz, int)>
	//*  18   33:ifne            0
							return ((zzyi) (this));
	//   19   36:aload_0         
	//   20   37:areturn         
					} else
					{
						zzqh = zzxz1.readString();
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #93  <Method String zzxz.readString()>
	//   24   43:putfield        #29  <Field String zzqh>
					}
				} else
	//*  25   46:goto            0
				{
					if(zzqg == null)
	//*  26   49:aload_0         
	//*  27   50:getfield        #25  <Field zzl zzqg>
	//*  28   53:ifnonnull       67
						zzqg = new zzl();
	//   29   56:aload_0         
	//   30   57:new             #47  <Class zzl>
	//   31   60:dup             
	//   32   61:invokespecial   #94  <Method void zzl()>
	//   33   64:putfield        #25  <Field zzl zzqg>
					zzxz1.zza(((zzyi) (zzqg)));
	//   34   67:aload_1         
	//   35   68:aload_0         
	//   36   69:getfield        #25  <Field zzl zzqg>
	//   37   72:invokevirtual   #97  <Method void zzxz.zza(zzyi)>
				}
			} else
	//*  38   75:goto            0
			{
				int k = zzyl.zzb(zzxz1, 10);
	//   39   78:aload_1         
	//   40   79:bipush          10
	//   41   81:invokestatic    #103 <Method int zzyl.zzb(zzxz, int)>
	//   42   84:istore_3        
				int j;
				if(zzqf == null)
	//*  43   85:aload_0         
	//*  44   86:getfield        #23  <Field zzn[] zzqf>
	//*  45   89:ifnonnull       97
					j = 0;
	//   46   92:iconst_0        
	//   47   93:istore_2        
				else
	//*  48   94:goto            103
					j = zzqf.length;
	//   49   97:aload_0         
	//   50   98:getfield        #23  <Field zzn[] zzqf>
	//   51  101:arraylength     
	//   52  102:istore_2        
				zzn azzn[] = new zzn[k + j];
	//   53  103:iload_3         
	//   54  104:iload_2         
	//   55  105:iadd            
	//   56  106:anewarray       zzn[]
	//   57  109:astore          4
				k = j;
	//   58  111:iload_2         
	//   59  112:istore_3        
				if(j != 0)
	//*  60  113:iload_2         
	//*  61  114:ifeq            131
				{
					System.arraycopy(((Object) (zzqf)), 0, ((Object) (azzn)), 0, j);
	//   62  117:aload_0         
	//   63  118:getfield        #23  <Field zzn[] zzqf>
	//   64  121:iconst_0        
	//   65  122:aload           4
	//   66  124:iconst_0        
	//   67  125:iload_2         
	//   68  126:invokestatic    #109 <Method void System.arraycopy(Object, int, Object, int, int)>
					k = j;
	//   69  129:iload_2         
	//   70  130:istore_3        
				}
				for(; k < azzn.length - 1; k++)
	//*  71  131:iload_3         
	//*  72  132:aload           4
	//*  73  134:arraylength     
	//*  74  135:iconst_1        
	//*  75  136:isub            
	//*  76  137:icmpge          171
				{
					azzn[k] = new zzn();
	//   77  140:aload           4
	//   78  142:iload_3         
	//   79  143:new             #17  <Class zzn>
	//   80  146:dup             
	//   81  147:invokespecial   #110 <Method void zzn()>
	//   82  150:aastore         
					zzxz1.zza(((zzyi) (azzn[k])));
	//   83  151:aload_1         
	//   84  152:aload           4
	//   85  154:iload_3         
	//   86  155:aaload          
	//   87  156:invokevirtual   #97  <Method void zzxz.zza(zzyi)>
					zzxz1.zzuj();
	//   88  159:aload_1         
	//   89  160:invokevirtual   #87  <Method int zzxz.zzuj()>
	//   90  163:pop             
				}

	//   91  164:iload_3         
	//   92  165:iconst_1        
	//   93  166:iadd            
	//   94  167:istore_3        
	//*  95  168:goto            131
				azzn[k] = new zzn();
	//   96  171:aload           4
	//   97  173:iload_3         
	//   98  174:new             #17  <Class zzn>
	//   99  177:dup             
	//  100  178:invokespecial   #110 <Method void zzn()>
	//  101  181:aastore         
				zzxz1.zza(((zzyi) (azzn[k])));
	//  102  182:aload_1         
	//  103  183:aload           4
	//  104  185:iload_3         
	//  105  186:aaload          
	//  106  187:invokevirtual   #97  <Method void zzxz.zza(zzyi)>
				zzqf = azzn;
	//  107  190:aload_0         
	//  108  191:aload           4
	//  109  193:putfield        #23  <Field zzn[] zzqf>
			}
		} while(true);
	//  110  196:goto            0
		return ((zzyi) (this));
	//  111  199:aload_0         
	//  112  200:areturn         
	}

	public final void zza(zzya zzya1)
	{
		if(zzqf != null && zzqf.length > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field zzn[] zzqf>
	//*   2    4:ifnull          50
	//*   3    7:aload_0         
	//*   4    8:getfield        #23  <Field zzn[] zzqf>
	//*   5   11:arraylength     
	//*   6   12:ifle            50
		{
			for(int i = 0; i < zzqf.length; i++)
	//*   7   15:iconst_0        
	//*   8   16:istore_2        
	//*   9   17:iload_2         
	//*  10   18:aload_0         
	//*  11   19:getfield        #23  <Field zzn[] zzqf>
	//*  12   22:arraylength     
	//*  13   23:icmpge          50
			{
				zzn zzn1 = zzqf[i];
	//   14   26:aload_0         
	//   15   27:getfield        #23  <Field zzn[] zzqf>
	//   16   30:iload_2         
	//   17   31:aaload          
	//   18   32:astore_3        
				if(zzn1 != null)
	//*  19   33:aload_3         
	//*  20   34:ifnull          43
					zzya1.zza(1, ((zzyi) (zzn1)));
	//   21   37:aload_1         
	//   22   38:iconst_1        
	//   23   39:aload_3         
	//   24   40:invokevirtual   #116 <Method void zzya.zza(int, zzyi)>
			}

	//   25   43:iload_2         
	//   26   44:iconst_1        
	//   27   45:iadd            
	//   28   46:istore_2        
		}
	//*  29   47:goto            17
		if(zzqg != null)
	//*  30   50:aload_0         
	//*  31   51:getfield        #25  <Field zzl zzqg>
	//*  32   54:ifnull          66
			zzya1.zza(2, ((zzyi) (zzqg)));
	//   33   57:aload_1         
	//   34   58:iconst_2        
	//   35   59:aload_0         
	//   36   60:getfield        #25  <Field zzl zzqg>
	//   37   63:invokevirtual   #116 <Method void zzya.zza(int, zzyi)>
		if(zzqh != null && !zzqh.equals(""))
	//*  38   66:aload_0         
	//*  39   67:getfield        #29  <Field String zzqh>
	//*  40   70:ifnull          94
	//*  41   73:aload_0         
	//*  42   74:getfield        #29  <Field String zzqh>
	//*  43   77:ldc1            #27  <String "">
	//*  44   79:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  45   82:ifne            94
			zzya1.zzb(3, zzqh);
	//   46   85:aload_1         
	//   47   86:iconst_3        
	//   48   87:aload_0         
	//   49   88:getfield        #29  <Field String zzqh>
	//   50   91:invokevirtual   #119 <Method void zzya.zzb(int, String)>
		super.zza(zzya1);
	//   51   94:aload_0         
	//   52   95:aload_1         
	//   53   96:invokespecial   #121 <Method void zzyc.zza(zzya)>
	//   54   99:return          
	}

	protected final int zzf()
	{
		int i = super.zzf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method int zzyc.zzf()>
	//    2    4:istore_1        
		int j = i;
	//    3    5:iload_1         
	//    4    6:istore_2        
		if(zzqf != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #23  <Field zzn[] zzqf>
	//*   7   11:ifnull          70
		{
			j = i;
	//    8   14:iload_1         
	//    9   15:istore_2        
			if(zzqf.length > 0)
	//*  10   16:aload_0         
	//*  11   17:getfield        #23  <Field zzn[] zzqf>
	//*  12   20:arraylength     
	//*  13   21:ifle            70
			{
				int k = 0;
	//   14   24:iconst_0        
	//   15   25:istore_3        
				do
				{
					j = i;
	//   16   26:iload_1         
	//   17   27:istore_2        
					if(k >= zzqf.length)
						break;
	//   18   28:iload_3         
	//   19   29:aload_0         
	//   20   30:getfield        #23  <Field zzn[] zzqf>
	//   21   33:arraylength     
	//   22   34:icmpge          70
					zzn zzn1 = zzqf[k];
	//   23   37:aload_0         
	//   24   38:getfield        #23  <Field zzn[] zzqf>
	//   25   41:iload_3         
	//   26   42:aaload          
	//   27   43:astore          4
					j = i;
	//   28   45:iload_1         
	//   29   46:istore_2        
					if(zzn1 != null)
	//*  30   47:aload           4
	//*  31   49:ifnull          61
						j = i + zzya.zzb(1, ((zzyi) (zzn1)));
	//   32   52:iload_1         
	//   33   53:iconst_1        
	//   34   54:aload           4
	//   35   56:invokestatic    #127 <Method int zzya.zzb(int, zzyi)>
	//   36   59:iadd            
	//   37   60:istore_2        
					k++;
	//   38   61:iload_3         
	//   39   62:iconst_1        
	//   40   63:iadd            
	//   41   64:istore_3        
					i = j;
	//   42   65:iload_2         
	//   43   66:istore_1        
				} while(true);
	//   44   67:goto            26
			}
		}
		i = j;
	//   45   70:iload_2         
	//   46   71:istore_1        
		if(zzqg != null)
	//*  47   72:aload_0         
	//*  48   73:getfield        #25  <Field zzl zzqg>
	//*  49   76:ifnull          90
			i = j + zzya.zzb(2, ((zzyi) (zzqg)));
	//   50   79:iload_2         
	//   51   80:iconst_2        
	//   52   81:aload_0         
	//   53   82:getfield        #25  <Field zzl zzqg>
	//   54   85:invokestatic    #127 <Method int zzya.zzb(int, zzyi)>
	//   55   88:iadd            
	//   56   89:istore_1        
		j = i;
	//   57   90:iload_1         
	//   58   91:istore_2        
		if(zzqh != null)
	//*  59   92:aload_0         
	//*  60   93:getfield        #29  <Field String zzqh>
	//*  61   96:ifnull          124
		{
			j = i;
	//   62   99:iload_1         
	//   63  100:istore_2        
			if(!zzqh.equals(""))
	//*  64  101:aload_0         
	//*  65  102:getfield        #29  <Field String zzqh>
	//*  66  105:ldc1            #27  <String "">
	//*  67  107:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  68  110:ifne            124
				j = i + zzya.zzc(3, zzqh);
	//   69  113:iload_1         
	//   70  114:iconst_3        
	//   71  115:aload_0         
	//   72  116:getfield        #29  <Field String zzqh>
	//   73  119:invokestatic    #131 <Method int zzya.zzc(int, String)>
	//   74  122:iadd            
	//   75  123:istore_2        
		}
		return j;
	//   76  124:iload_2         
	//   77  125:ireturn         
	}

	public zzn zzqf[];
	public zzl zzqg;
	public String zzqh;
}
