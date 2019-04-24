// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Environment;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;
import java.io.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzhx, zzii, zznk, zzkb, 
//			zzni, zzbfi, zzhz, zzakb, 
//			zzib, zzie, zzig, zzht, 
//			zzajm

public final class zzhs
{

	private zzhs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzake = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field boolean zzake>
		zzakc = new zzhx();
	//    5    9:aload_0         
	//    6   10:new             #22  <Class zzhx>
	//    7   13:dup             
	//    8   14:invokespecial   #23  <Method void zzhx()>
	//    9   17:putfield        #25  <Field zzhx zzakc>
		zzakd = new zzii();
	//   10   20:aload_0         
	//   11   21:new             #27  <Class zzii>
	//   12   24:dup             
	//   13   25:invokespecial   #28  <Method void zzii()>
	//   14   28:putfield        #30  <Field zzii zzakd>
		zzhn();
	//   15   31:aload_0         
	//   16   32:invokespecial   #33  <Method void zzhn()>
	//   17   35:return          
	}

	public zzhs(zzhx zzhx1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzakc = zzhx1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field zzhx zzakc>
		zzhx1 = ((zzhx) (zznk.zzbeo));
	//    5    9:getstatic       #41  <Field zzna zznk.zzbeo>
	//    6   12:astore_1        
		zzake = ((Boolean)zzkb.zzik().zzd(((zzna) (zzhx1)))).booleanValue();
	//    7   13:aload_0         
	//    8   14:invokestatic    #47  <Method zzni zzkb.zzik()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #53  <Method Object zzni.zzd(zzna)>
	//   11   21:checkcast       #55  <Class Boolean>
	//   12   24:invokevirtual   #59  <Method boolean Boolean.booleanValue()>
	//   13   27:putfield        #20  <Field boolean zzake>
		zzakd = new zzii();
	//   14   30:aload_0         
	//   15   31:new             #27  <Class zzii>
	//   16   34:dup             
	//   17   35:invokespecial   #28  <Method void zzii()>
	//   18   38:putfield        #30  <Field zzii zzakd>
		zzhn();
	//   19   41:aload_0         
	//   20   42:invokespecial   #33  <Method void zzhn()>
	//   21   45:return          
	}

	private final void zzb(zzhu.zza.zzb zzb1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzakd.zzanl = zzho();
	//    2    2:aload_0         
	//    3    3:getfield        #30  <Field zzii zzakd>
	//    4    6:invokestatic    #65  <Method long[] zzho()>
	//    5    9:putfield        #69  <Field long[] zzii.zzanl>
		zzakc.zzd(zzbfi.zzb(((zzbfi) (zzakd)))).zzs(zzb1.zzhq()).zzbd();
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field zzhx zzakc>
	//    8   16:aload_0         
	//    9   17:getfield        #30  <Field zzii zzakd>
	//   10   20:invokestatic    #74  <Method byte[] zzbfi.zzb(zzbfi)>
	//   11   23:invokevirtual   #77  <Method zzhz zzhx.zzd(byte[])>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #83  <Method int zzhu$zza$zzb.zzhq()>
	//   14   30:invokevirtual   #89  <Method zzhz zzhz.zzs(int)>
	//   15   33:invokevirtual   #92  <Method void zzhz.zzbd()>
		zzb1 = ((zzhu.zza.zzb) (String.valueOf(((Object) (Integer.toString(zzb1.zzhq(), 10))))));
	//   16   36:aload_1         
	//   17   37:invokevirtual   #83  <Method int zzhu$zza$zzb.zzhq()>
	//   18   40:bipush          10
	//   19   42:invokestatic    #98  <Method String Integer.toString(int, int)>
	//   20   45:invokestatic    #104 <Method String String.valueOf(Object)>
	//   21   48:astore_1        
		if(((String) (zzb1)).length() != 0)
	//*  22   49:aload_1         
	//*  23   50:invokevirtual   #107 <Method int String.length()>
	//*  24   53:ifeq            66
		{
			zzb1 = ((zzhu.zza.zzb) ("Logging Event with event code : ".concat(((String) (zzb1)))));
	//   25   56:ldc1            #109 <String "Logging Event with event code : ">
	//   26   58:aload_1         
	//   27   59:invokevirtual   #113 <Method String String.concat(String)>
	//   28   62:astore_1        
			break MISSING_BLOCK_LABEL_76;
	//   29   63:goto            76
		}
		zzb1 = ((zzhu.zza.zzb) (new String("Logging Event with event code : ")));
	//   30   66:new             #100 <Class String>
	//   31   69:dup             
	//   32   70:ldc1            #109 <String "Logging Event with event code : ">
	//   33   72:invokespecial   #116 <Method void String(String)>
	//   34   75:astore_1        
		zzakb.v(((String) (zzb1)));
	//   35   76:aload_1         
	//   36   77:invokestatic    #121 <Method void zzakb.v(String)>
		this;
	//   37   80:aload_0         
		JVM INSTR monitorexit ;
	//   38   81:monitorexit     
		return;
	//   39   82:return          
		zzb1;
	//   40   83:astore_1        
	//*  41   84:aload_0         
		throw zzb1;
	//   42   85:monitorexit     
	//   43   86:aload_1         
	//   44   87:athrow          
	}

	private final void zzc(zzhu.zza.zzb zzb1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj = ((Object) (Environment.getExternalStorageDirectory()));
	//    2    2:invokestatic    #132 <Method File Environment.getExternalStorageDirectory()>
	//    3    5:astore_2        
		if(obj != null)
			break MISSING_BLOCK_LABEL_13;
	//    4    6:aload_2         
	//    5    7:ifnonnull       13
		this;
	//    6   10:aload_0         
		JVM INSTR monitorexit ;
	//    7   11:monitorexit     
		return;
	//    8   12:return          
		obj = ((Object) (new File(((File) (obj)), "clearcut_events.txt")));
	//    9   13:new             #134 <Class File>
	//   10   16:dup             
	//   11   17:aload_2         
	//   12   18:ldc1            #136 <String "clearcut_events.txt">
	//   13   20:invokespecial   #139 <Method void File(File, String)>
	//   14   23:astore_2        
		obj = ((Object) (new FileOutputStream(((File) (obj)), true)));
	//   15   24:new             #141 <Class FileOutputStream>
	//   16   27:dup             
	//   17   28:aload_2         
	//   18   29:iconst_1        
	//   19   30:invokespecial   #144 <Method void FileOutputStream(File, boolean)>
	//   20   33:astore_2        
		((FileOutputStream) (obj)).write(zzd(zzb1).getBytes());
	//   21   34:aload_2         
	//   22   35:aload_0         
	//   23   36:aload_1         
	//   24   37:invokespecial   #147 <Method String zzd(zzhu$zza$zzb)>
	//   25   40:invokevirtual   #151 <Method byte[] String.getBytes()>
	//   26   43:invokevirtual   #155 <Method void FileOutputStream.write(byte[])>
		((FileOutputStream) (obj)).write(10);
	//   27   46:aload_2         
	//   28   47:bipush          10
	//   29   49:invokevirtual   #158 <Method void FileOutputStream.write(int)>
		((FileOutputStream) (obj)).close();
	//   30   52:aload_2         
	//   31   53:invokevirtual   #161 <Method void FileOutputStream.close()>
		this;
	//   32   56:aload_0         
		JVM INSTR monitorexit ;
	//   33   57:monitorexit     
		return;
	//   34   58:return          
_L6:
		zzakb.v("Could not close Clearcut output stream.");
	//   35   59:ldc1            #163 <String "Could not close Clearcut output stream.">
	//   36   61:invokestatic    #121 <Method void zzakb.v(String)>
		this;
	//   37   64:aload_0         
		JVM INSTR monitorexit ;
	//   38   65:monitorexit     
		return;
	//   39   66:return          
		zzb1;
	//   40   67:astore_1        
		  goto _L1
	//*  41   68:goto            91
_L5:
		zzakb.v("Could not write Clearcut to file.");
	//   42   71:ldc1            #165 <String "Could not write Clearcut to file.">
	//   43   73:invokestatic    #121 <Method void zzakb.v(String)>
		((FileOutputStream) (obj)).close();
	//   44   76:aload_2         
	//   45   77:invokevirtual   #161 <Method void FileOutputStream.close()>
		this;
	//   46   80:aload_0         
		JVM INSTR monitorexit ;
	//   47   81:monitorexit     
		return;
	//   48   82:return          
_L7:
		zzakb.v("Could not close Clearcut output stream.");
	//   49   83:ldc1            #163 <String "Could not close Clearcut output stream.">
	//   50   85:invokestatic    #121 <Method void zzakb.v(String)>
		this;
	//   51   88:aload_0         
		JVM INSTR monitorexit ;
	//   52   89:monitorexit     
		return;
	//   53   90:return          
_L1:
		((FileOutputStream) (obj)).close();
	//   54   91:aload_2         
	//   55   92:invokevirtual   #161 <Method void FileOutputStream.close()>
		  goto _L2
	//*  56   95:goto            103
_L8:
		zzakb.v("Could not close Clearcut output stream.");
	//   57   98:ldc1            #163 <String "Could not close Clearcut output stream.">
	//   58  100:invokestatic    #121 <Method void zzakb.v(String)>
_L2:
		throw zzb1;
	//   59  103:aload_1         
	//   60  104:athrow          
_L4:
		zzakb.v("Could not find file for Clearcut");
	//   61  105:ldc1            #167 <String "Could not find file for Clearcut">
	//   62  107:invokestatic    #121 <Method void zzakb.v(String)>
		this;
	//   63  110:aload_0         
		JVM INSTR monitorexit ;
	//   64  111:monitorexit     
		return;
	//   65  112:return          
		zzb1;
	//   66  113:astore_1        
	//*  67  114:aload_0         
		throw zzb1;
	//   68  115:monitorexit     
	//   69  116:aload_1         
	//   70  117:athrow          
		zzb1;
	//   71  118:astore_1        
		if(true) goto _L4; else goto _L3
	//   72  119:goto            105
_L3:
		zzb1;
	//   73  122:astore_1        
		  goto _L5
	//*  74  123:goto            71
		zzb1;
	//   75  126:astore_1        
		  goto _L6
	//*  76  127:goto            59
		zzb1;
	//   77  130:astore_1        
		  goto _L7
	//*  78  131:goto            83
		IOException ioexception;
		ioexception;
	//   79  134:astore_2        
		  goto _L8
	//*  80  135:goto            98
	}

	private final String zzd(zzhu.zza.zzb zzb1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzb1 = ((zzhu.zza.zzb) (String.format("id=%s,timestamp=%s,event=%s", new Object[] {
			zzakd.zzanh, Long.valueOf(zzbv.zzer().elapsedRealtime()), Integer.valueOf(zzb1.zzhq())
		})));
	//    2    2:ldc1            #169 <String "id=%s,timestamp=%s,event=%s">
	//    3    4:iconst_3        
	//    4    5:anewarray       Object[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:aload_0         
	//    8   11:getfield        #30  <Field zzii zzakd>
	//    9   14:getfield        #173 <Field String zzii.zzanh>
	//   10   17:aastore         
	//   11   18:dup             
	//   12   19:iconst_1        
	//   13   20:invokestatic    #179 <Method Clock zzbv.zzer()>
	//   14   23:invokeinterface #185 <Method long Clock.elapsedRealtime()>
	//   15   28:invokestatic    #190 <Method Long Long.valueOf(long)>
	//   16   31:aastore         
	//   17   32:dup             
	//   18   33:iconst_2        
	//   19   34:aload_1         
	//   20   35:invokevirtual   #83  <Method int zzhu$zza$zzb.zzhq()>
	//   21   38:invokestatic    #193 <Method Integer Integer.valueOf(int)>
	//   22   41:aastore         
	//   23   42:invokestatic    #197 <Method String String.format(String, Object[])>
	//   24   45:astore_1        
		this;
	//   25   46:aload_0         
		JVM INSTR monitorexit ;
	//   26   47:monitorexit     
		return ((String) (zzb1));
	//   27   48:aload_1         
	//   28   49:areturn         
		zzb1;
	//   29   50:astore_1        
	//*  30   51:aload_0         
		throw zzb1;
	//   31   52:monitorexit     
	//   32   53:aload_1         
	//   33   54:athrow          
	}

	public static zzhs zzhm()
	{
		return new zzhs();
	//    0    0:new             #2   <Class zzhs>
	//    1    3:dup             
	//    2    4:invokespecial   #200 <Method void zzhs()>
	//    3    7:areturn         
	}

	private final void zzhn()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzakd.zzanp = new zzib();
	//    2    2:aload_0         
	//    3    3:getfield        #30  <Field zzii zzakd>
	//    4    6:new             #202 <Class zzib>
	//    5    9:dup             
	//    6   10:invokespecial   #203 <Method void zzib()>
	//    7   13:putfield        #207 <Field zzib zzii.zzanp>
		zzakd.zzanp.zzalw = new zzie();
	//    8   16:aload_0         
	//    9   17:getfield        #30  <Field zzii zzakd>
	//   10   20:getfield        #207 <Field zzib zzii.zzanp>
	//   11   23:new             #209 <Class zzie>
	//   12   26:dup             
	//   13   27:invokespecial   #210 <Method void zzie()>
	//   14   30:putfield        #214 <Field zzie zzib.zzalw>
		zzakd.zzanm = new zzig();
	//   15   33:aload_0         
	//   16   34:getfield        #30  <Field zzii zzakd>
	//   17   37:new             #216 <Class zzig>
	//   18   40:dup             
	//   19   41:invokespecial   #217 <Method void zzig()>
	//   20   44:putfield        #221 <Field zzig zzii.zzanm>
		this;
	//   21   47:aload_0         
		JVM INSTR monitorexit ;
	//   22   48:monitorexit     
		return;
	//   23   49:return          
		Exception exception;
		exception;
	//   24   50:astore_1        
	//*  25   51:aload_0         
		throw exception;
	//   26   52:monitorexit     
	//   27   53:aload_1         
	//   28   54:athrow          
	}

	private static long[] zzho()
	{
		NumberFormatException numberformatexception;
		Object obj = ((Object) (zznk.zzjc()));
	//    0    0:invokestatic    #227 <Method List zznk.zzjc()>
	//    1    3:astore          5
		ArrayList arraylist = new ArrayList();
	//    2    5:new             #229 <Class ArrayList>
	//    3    8:dup             
	//    4    9:invokespecial   #230 <Method void ArrayList()>
	//    5   12:astore          4
		obj = ((Object) (((List) (obj)).iterator()));
	//    6   14:aload           5
	//    7   16:invokeinterface #236 <Method Iterator List.iterator()>
	//    8   21:astore          5
		int k;
		do
		{
			boolean flag = ((Iterator) (obj)).hasNext();
	//    9   23:aload           5
	//   10   25:invokeinterface #241 <Method boolean Iterator.hasNext()>
	//   11   30:istore_3        
			k = 0;
	//   12   31:iconst_0        
	//   13   32:istore_1        
			int i = 0;
	//   14   33:iconst_0        
	//   15   34:istore_0        
			if(!flag)
				break;
	//   16   35:iload_3         
	//   17   36:ifeq            100
			String as[] = ((String)((Iterator) (obj)).next()).split(",");
	//   18   39:aload           5
	//   19   41:invokeinterface #245 <Method Object Iterator.next()>
	//   20   46:checkcast       #100 <Class String>
	//   21   49:ldc1            #247 <String ",">
	//   22   51:invokevirtual   #251 <Method String[] String.split(String)>
	//   23   54:astore          6
			k = as.length;
	//   24   56:aload           6
	//   25   58:arraylength     
	//   26   59:istore_1        
			while(i < k) 
	//*  27   60:iload_0         
	//*  28   61:iload_1         
	//*  29   62:icmpge          23
			{
				String s = as[i];
	//   30   65:aload           6
	//   31   67:iload_0         
	//   32   68:aaload          
	//   33   69:astore          7
				try
				{
					((List) (arraylist)).add(((Object) (Long.valueOf(s))));
	//   34   71:aload           4
	//   35   73:aload           7
	//   36   75:invokestatic    #254 <Method Long Long.valueOf(String)>
	//   37   78:invokeinterface #258 <Method boolean List.add(Object)>
	//   38   83:pop             
				}
	//*  39   84:goto            93
	//*  40   87:ldc2            #260 <String "Experiment ID is not a number">
	//*  41   90:invokestatic    #121 <Method void zzakb.v(String)>
	//*  42   93:iload_0         
	//*  43   94:iconst_1        
	//*  44   95:iadd            
	//*  45   96:istore_0        
	//*  46   97:goto            60
	//*  47  100:aload           4
	//*  48  102:invokeinterface #263 <Method int List.size()>
	//*  49  107:newarray        long[]
	//*  50  109:astore          5
	//*  51  111:aload           4
	//*  52  113:checkcast       #229 <Class ArrayList>
	//*  53  116:astore          4
	//*  54  118:aload           4
	//*  55  120:invokevirtual   #264 <Method int ArrayList.size()>
	//*  56  123:istore_2        
	//*  57  124:iconst_0        
	//*  58  125:istore_0        
	//*  59  126:iload_1         
	//*  60  127:iload_2         
	//*  61  128:icmpge          162
	//*  62  131:aload           4
	//*  63  133:iload_1         
	//*  64  134:invokevirtual   #268 <Method Object ArrayList.get(int)>
	//*  65  137:astore          6
	//*  66  139:iload_1         
	//*  67  140:iconst_1        
	//*  68  141:iadd            
	//*  69  142:istore_1        
	//*  70  143:aload           5
	//*  71  145:iload_0         
	//*  72  146:aload           6
	//*  73  148:checkcast       #187 <Class Long>
	//*  74  151:invokevirtual   #271 <Method long Long.longValue()>
	//*  75  154:lastore         
	//*  76  155:iload_0         
	//*  77  156:iconst_1        
	//*  78  157:iadd            
	//*  79  158:istore_0        
	//*  80  159:goto            126
	//*  81  162:aload           5
	//*  82  164:areturn         
				// Misplaced declaration of an exception variable
				catch(NumberFormatException numberformatexception)
				{
					zzakb.v("Experiment ID is not a number");
				}
				i++;
			}
		} while(true);
		long al[] = new long[((List) (arraylist)).size()];
		arraylist = (ArrayList)arraylist;
		int l = arraylist.size();
		for(int j = 0; k < l; j++)
		{
			Object obj1 = arraylist.get(k);
			k++;
			al[j] = ((Long)obj1).longValue();
		}

		return al;
	//*  83  165:astore          7
	//*  84  167:goto            87
	}

	public final void zza(zzht zzht1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = zzake;
	//    2    2:aload_0         
	//    3    3:getfield        #20  <Field boolean zzake>
	//    4    6:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_35;
	//    5    7:iload_2         
	//    6    8:ifeq            35
		zzht1.zza(zzakd);
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #30  <Field zzii zzakd>
	//   10   16:invokeinterface #280 <Method void zzht.zza(zzii)>
		this;
	//   11   21:aload_0         
		JVM INSTR monitorexit ;
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		zzht1;
	//   14   24:astore_1        
		zzbv.zzeo().zza(((Throwable) (zzht1)), "AdMobClearcutLogger.modify");
	//   15   25:invokestatic    #284 <Method zzajm zzbv.zzeo()>
	//   16   28:aload_1         
	//   17   29:ldc2            #286 <String "AdMobClearcutLogger.modify">
	//   18   32:invokevirtual   #291 <Method void zzajm.zza(Throwable, String)>
		this;
	//   19   35:aload_0         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		return;
	//   21   37:return          
		zzht1;
	//   22   38:astore_1        
	//*  23   39:aload_0         
		throw zzht1;
	//   24   40:monitorexit     
	//   25   41:aload_1         
	//   26   42:athrow          
	}

	public final void zza(zzhu.zza.zzb zzb1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = zzake;
	//    2    2:aload_0         
	//    3    3:getfield        #20  <Field boolean zzake>
	//    4    6:istore_2        
		if(flag)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:iload_2         
	//    6    8:ifne            14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		zzna zzna = zznk.zzbep;
	//   10   14:getstatic       #294 <Field zzna zznk.zzbep>
	//   11   17:astore_3        
		if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
			break MISSING_BLOCK_LABEL_42;
	//   12   18:invokestatic    #47  <Method zzni zzkb.zzik()>
	//   13   21:aload_3         
	//   14   22:invokevirtual   #53  <Method Object zzni.zzd(zzna)>
	//   15   25:checkcast       #55  <Class Boolean>
	//   16   28:invokevirtual   #59  <Method boolean Boolean.booleanValue()>
	//   17   31:ifeq            42
		zzc(zzb1);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokespecial   #296 <Method void zzc(zzhu$zza$zzb)>
		this;
	//   21   39:aload_0         
		JVM INSTR monitorexit ;
	//   22   40:monitorexit     
		return;
	//   23   41:return          
		zzb(zzb1);
	//   24   42:aload_0         
	//   25   43:aload_1         
	//   26   44:invokespecial   #298 <Method void zzb(zzhu$zza$zzb)>
		this;
	//   27   47:aload_0         
		JVM INSTR monitorexit ;
	//   28   48:monitorexit     
		return;
	//   29   49:return          
		zzb1;
	//   30   50:astore_1        
	//*  31   51:aload_0         
		throw zzb1;
	//   32   52:monitorexit     
	//   33   53:aload_1         
	//   34   54:athrow          
	}

	private final zzhx zzakc;
	private final zzii zzakd;
	private final boolean zzake;
}
