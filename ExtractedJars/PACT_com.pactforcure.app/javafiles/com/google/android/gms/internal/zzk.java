// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.*;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//			zzd, zza, zzl, zzs, 
//			zzo, zzi, zzm, zzr

public abstract class zzk
	implements Comparable
{
	public static final class zza extends Enum
	{

		public static zza[] values()
		{
			return (zza[])((zza []) (zzV)).clone();
		//    0    0:getstatic       #39  <Field zzk$zza[] zzV>
		//    1    3:invokevirtual   #49  <Method Object _5B_Lcom.google.android.gms.internal.zzk$zza_3B_.clone()>
		//    2    6:checkcast       #45  <Class zzk$zza[]>
		//    3    9:areturn         
		}

		public static final zza zzR;
		public static final zza zzS;
		public static final zza zzT;
		public static final zza zzU;
		private static final zza zzV[];

		static 
		{
			zzR = new zza("LOW", 0);
		//    0    0:new             #2   <Class zzk$zza>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "LOW">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void zzk$zza(String, int)>
		//    5   10:putstatic       #25  <Field zzk$zza zzR>
			zzS = new zza("NORMAL", 1);
		//    6   13:new             #2   <Class zzk$zza>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "NORMAL">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void zzk$zza(String, int)>
		//   11   23:putstatic       #29  <Field zzk$zza zzS>
			zzT = new zza("HIGH", 2);
		//   12   26:new             #2   <Class zzk$zza>
		//   13   29:dup             
		//   14   30:ldc1            #31  <String "HIGH">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void zzk$zza(String, int)>
		//   17   36:putstatic       #33  <Field zzk$zza zzT>
			zzU = new zza("IMMEDIATE", 3);
		//   18   39:new             #2   <Class zzk$zza>
		//   19   42:dup             
		//   20   43:ldc1            #35  <String "IMMEDIATE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void zzk$zza(String, int)>
		//   23   49:putstatic       #37  <Field zzk$zza zzU>
			zzV = (new zza[] {
				zzR, zzS, zzT, zzU
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       zza[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #25  <Field zzk$zza zzR>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #29  <Field zzk$zza zzS>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #33  <Field zzk$zza zzT>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #37  <Field zzk$zza zzU>
		//   41   79:aastore         
		//   42   80:putstatic       #39  <Field zzk$zza[] zzV>
		//*  43   83:return          
		}

		private zza(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public zzk(int i, String s, zzm.zza zza1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		zzs.zza zza2;
		if(zzs.zza.zzai)
	//*   2    4:getstatic       #45  <Field boolean zzs$zza.zzai>
	//*   3    7:ifeq            86
			zza2 = new zzs.zza();
	//    4   10:new             #42  <Class zzs$zza>
	//    5   13:dup             
	//    6   14:invokespecial   #46  <Method void zzs$zza()>
	//    7   17:astore          4
		else
	//*   8   19:aload_0         
	//*   9   20:aload           4
	//*  10   22:putfield        #48  <Field zzs$zza zzB>
	//*  11   25:aload_0         
	//*  12   26:iconst_1        
	//*  13   27:putfield        #50  <Field boolean zzI>
	//*  14   30:aload_0         
	//*  15   31:iconst_0        
	//*  16   32:putfield        #52  <Field boolean zzJ>
	//*  17   35:aload_0         
	//*  18   36:iconst_0        
	//*  19   37:putfield        #54  <Field boolean zzK>
	//*  20   40:aload_0         
	//*  21   41:lconst_0        
	//*  22   42:putfield        #56  <Field long zzL>
	//*  23   45:aload_0         
	//*  24   46:aconst_null     
	//*  25   47:putfield        #58  <Field zzb$zza zzN>
	//*  26   50:aload_0         
	//*  27   51:iload_1         
	//*  28   52:putfield        #60  <Field int zzC>
	//*  29   55:aload_0         
	//*  30   56:aload_2         
	//*  31   57:putfield        #62  <Field String zzD>
	//*  32   60:aload_0         
	//*  33   61:aload_3         
	//*  34   62:putfield        #64  <Field zzm$zza zzF>
	//*  35   65:aload_0         
	//*  36   66:new             #66  <Class zzd>
	//*  37   69:dup             
	//*  38   70:invokespecial   #67  <Method void zzd()>
	//*  39   73:invokevirtual   #70  <Method zzk zza(zzo)>
	//*  40   76:pop             
	//*  41   77:aload_0         
	//*  42   78:aload_2         
	//*  43   79:invokestatic    #74  <Method int zzb(String)>
	//*  44   82:putfield        #76  <Field int zzE>
	//*  45   85:return          
			zza2 = null;
	//   46   86:aconst_null     
	//   47   87:astore          4
		zzB = zza2;
		zzI = true;
		zzJ = false;
		zzK = false;
		zzL = 0L;
		zzN = null;
		zzC = i;
		zzD = s;
		zzF = zza1;
		zza(((zzo) (new zzd())));
		zzE = zzb(s);
	//*  48   89:goto            19
	}

	private static int zzb(String s)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #83  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            30
		{
			s = ((String) (Uri.parse(s)));
	//    3    7:aload_0         
	//    4    8:invokestatic    #89  <Method Uri Uri.parse(String)>
	//    5   11:astore_0        
			if(s != null)
	//*   6   12:aload_0         
	//*   7   13:ifnull          30
			{
				s = ((Uri) (s)).getHost();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #93  <Method String Uri.getHost()>
	//   10   20:astore_0        
				if(s != null)
	//*  11   21:aload_0         
	//*  12   22:ifnull          30
					return s.hashCode();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #99  <Method int String.hashCode()>
	//   15   29:ireturn         
			}
		}
		return 0;
	//   16   30:iconst_0        
	//   17   31:ireturn         
	}

	static zzs.zza zzd(zzk zzk1)
	{
		return zzk1.zzB;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field zzs$zza zzB>
	//    2    4:areturn         
	}

	public int compareTo(Object obj)
	{
		return zzc((zzk)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class zzk>
	//    3    5:invokevirtual   #107 <Method int zzc(zzk)>
	//    4    8:ireturn         
	}

	public Map getHeaders()
		throws com.google.android.gms.internal.zza
	{
		return Collections.emptyMap();
	//    0    0:invokestatic    #116 <Method Map Collections.emptyMap()>
	//    1    3:areturn         
	}

	public int getMethod()
	{
		return zzC;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int zzC>
	//    2    4:ireturn         
	}

	public String getUrl()
	{
		return zzD;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String zzD>
	//    2    4:areturn         
	}

	public String toString()
	{
		String s = String.valueOf(((Object) (Integer.toHexString(zzf()))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #125 <Method int zzf()>
	//    2    4:invokestatic    #131 <Method String Integer.toHexString(int)>
	//    3    7:invokestatic    #135 <Method String String.valueOf(Object)>
	//    4   10:astore_1        
		String s1;
		String s2;
		String s3;
		if(s.length() != 0)
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #138 <Method int String.length()>
	//*   7   15:ifeq            141
			s = "0x".concat(s);
	//    8   18:ldc1            #140 <String "0x">
	//    9   20:aload_1         
	//   10   21:invokevirtual   #144 <Method String String.concat(String)>
	//   11   24:astore_1        
		else
	//*  12   25:aload_0         
	//*  13   26:invokevirtual   #146 <Method String getUrl()>
	//*  14   29:invokestatic    #135 <Method String String.valueOf(Object)>
	//*  15   32:astore_2        
	//*  16   33:aload_0         
	//*  17   34:invokevirtual   #150 <Method zzk$zza zzo()>
	//*  18   37:invokestatic    #135 <Method String String.valueOf(Object)>
	//*  19   40:astore_3        
	//*  20   41:aload_0         
	//*  21   42:getfield        #152 <Field Integer zzG>
	//*  22   45:invokestatic    #135 <Method String String.valueOf(Object)>
	//*  23   48:astore          4
	//*  24   50:new             #154 <Class StringBuilder>
	//*  25   53:dup             
	//*  26   54:ldc1            #156 <String "[ ] ">
	//*  27   56:invokestatic    #135 <Method String String.valueOf(Object)>
	//*  28   59:invokevirtual   #138 <Method int String.length()>
	//*  29   62:iconst_3        
	//*  30   63:iadd            
	//*  31   64:aload_2         
	//*  32   65:invokestatic    #135 <Method String String.valueOf(Object)>
	//*  33   68:invokevirtual   #138 <Method int String.length()>
	//*  34   71:iadd            
	//*  35   72:aload_1         
	//*  36   73:invokestatic    #135 <Method String String.valueOf(Object)>
	//*  37   76:invokevirtual   #138 <Method int String.length()>
	//*  38   79:iadd            
	//*  39   80:aload_3         
	//*  40   81:invokestatic    #135 <Method String String.valueOf(Object)>
	//*  41   84:invokevirtual   #138 <Method int String.length()>
	//*  42   87:iadd            
	//*  43   88:aload           4
	//*  44   90:invokestatic    #135 <Method String String.valueOf(Object)>
	//*  45   93:invokevirtual   #138 <Method int String.length()>
	//*  46   96:iadd            
	//*  47   97:invokespecial   #159 <Method void StringBuilder(int)>
	//*  48  100:ldc1            #156 <String "[ ] ">
	//*  49  102:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//*  50  105:aload_2         
	//*  51  106:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//*  52  109:ldc1            #165 <String " ">
	//*  53  111:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//*  54  114:aload_1         
	//*  55  115:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//*  56  118:ldc1            #165 <String " ">
	//*  57  120:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//*  58  123:aload_3         
	//*  59  124:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//*  60  127:ldc1            #165 <String " ">
	//*  61  129:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//*  62  132:aload           4
	//*  63  134:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//*  64  137:invokevirtual   #167 <Method String StringBuilder.toString()>
	//*  65  140:areturn         
			s = new String("0x");
	//   66  141:new             #95  <Class String>
	//   67  144:dup             
	//   68  145:ldc1            #140 <String "0x">
	//   69  147:invokespecial   #170 <Method void String(String)>
	//   70  150:astore_1        
		s1 = String.valueOf(((Object) (getUrl())));
		s2 = String.valueOf(((Object) (zzo())));
		s3 = String.valueOf(((Object) (zzG)));
		return (new StringBuilder(String.valueOf("[ ] ").length() + 3 + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s2))).length() + String.valueOf(((Object) (s3))).length())).append("[ ] ").append(s1).append(" ").append(s).append(" ").append(s2).append(" ").append(s3).toString();
	//*  71  151:goto            25
	}

	public final zzk zza(int i)
	{
		zzG = Integer.valueOf(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #174 <Method Integer Integer.valueOf(int)>
	//    3    5:putfield        #152 <Field Integer zzG>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public zzk zza(zzb.zza zza1)
	{
		zzN = zza1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field zzb$zza zzN>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public zzk zza(zzl zzl1)
	{
		zzH = zzl1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #180 <Field zzl zzH>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public zzk zza(zzo zzo1)
	{
		zzM = zzo1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #183 <Field zzo zzM>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	protected abstract zzm zza(zzi zzi1);

	protected abstract void zza(Object obj);

	protected zzr zzb(zzr zzr1)
	{
		return zzr1;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	public int zzc(zzk zzk1)
	{
		zza zza1 = zzo();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method zzk$zza zzo()>
	//    2    4:astore_2        
		zza zza2 = zzk1.zzo();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #150 <Method zzk$zza zzo()>
	//    5    9:astore_3        
		if(zza1 == zza2)
	//*   6   10:aload_2         
	//*   7   11:aload_3         
	//*   8   12:if_acmpne       31
			return zzG.intValue() - zzk1.zzG.intValue();
	//    9   15:aload_0         
	//   10   16:getfield        #152 <Field Integer zzG>
	//   11   19:invokevirtual   #190 <Method int Integer.intValue()>
	//   12   22:aload_1         
	//   13   23:getfield        #152 <Field Integer zzG>
	//   14   26:invokevirtual   #190 <Method int Integer.intValue()>
	//   15   29:isub            
	//   16   30:ireturn         
		else
			return zza2.ordinal() - zza1.ordinal();
	//   17   31:aload_3         
	//   18   32:invokevirtual   #193 <Method int zzk$zza.ordinal()>
	//   19   35:aload_2         
	//   20   36:invokevirtual   #193 <Method int zzk$zza.ordinal()>
	//   21   39:isub            
	//   22   40:ireturn         
	}

	public void zzc(zzr zzr1)
	{
		if(zzF != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field zzm$zza zzF>
	//*   2    4:ifnull          17
			zzF.zze(zzr1);
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field zzm$zza zzF>
	//    5   11:aload_1         
	//    6   12:invokeinterface #200 <Method void zzm$zza.zze(zzr)>
	//    7   17:return          
	}

	public void zzc(String s)
	{
		if(zzs.zza.zzai)
	//*   0    0:getstatic       #45  <Field boolean zzs$zza.zzai>
	//*   1    3:ifeq            21
			zzB.zza(s, Thread.currentThread().getId());
	//    2    6:aload_0         
	//    3    7:getfield        #48  <Field zzs$zza zzB>
	//    4   10:aload_1         
	//    5   11:invokestatic    #206 <Method Thread Thread.currentThread()>
	//    6   14:invokevirtual   #210 <Method long Thread.getId()>
	//    7   17:invokevirtual   #213 <Method void zzs$zza.zza(String, long)>
		else
	//*   8   20:return          
		if(zzL == 0L)
	//*   9   21:aload_0         
	//*  10   22:getfield        #56  <Field long zzL>
	//*  11   25:lconst_0        
	//*  12   26:lcmp            
	//*  13   27:ifne            20
		{
			zzL = SystemClock.elapsedRealtime();
	//   14   30:aload_0         
	//   15   31:invokestatic    #218 <Method long SystemClock.elapsedRealtime()>
	//   16   34:putfield        #56  <Field long zzL>
			return;
	//   17   37:return          
		}
	}

	void zzd(String s)
	{
		if(zzH != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #180 <Field zzl zzH>
	//*   2    4:ifnull          15
			zzH.zzf(this);
	//    3    7:aload_0         
	//    4    8:getfield        #180 <Field zzl zzH>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #223 <Method void zzl.zzf(zzk)>
		if(!zzs.zza.zzai) goto _L2; else goto _L1
	//    7   15:getstatic       #45  <Field boolean zzs$zza.zzai>
	//    8   18:ifeq            83
_L1:
		long l = Thread.currentThread().getId();
	//    9   21:invokestatic    #206 <Method Thread Thread.currentThread()>
	//   10   24:invokevirtual   #210 <Method long Thread.getId()>
	//   11   27:lstore_2        
		if(Looper.myLooper() == Looper.getMainLooper()) goto _L4; else goto _L3
	//   12   28:invokestatic    #229 <Method Looper Looper.myLooper()>
	//   13   31:invokestatic    #232 <Method Looper Looper.getMainLooper()>
	//   14   34:if_acmpeq       62
_L3:
		(new Handler(Looper.getMainLooper())).post(new Runnable(s, l) {

			public void run()
			{
				zzk.zzd(zzQ).zza(zzO, zzP);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field zzk zzQ>
			//    2    4:invokestatic    #33  <Method zzs$zza zzk.zzd(zzk)>
			//    3    7:aload_0         
			//    4    8:getfield        #23  <Field String zzO>
			//    5   11:aload_0         
			//    6   12:getfield        #25  <Field long zzP>
			//    7   15:invokevirtual   #39  <Method void zzs$zza.zza(String, long)>
				zzk.zzd(zzQ).zzd(((Object)this).toString());
			//    8   18:aload_0         
			//    9   19:getfield        #21  <Field zzk zzQ>
			//   10   22:invokestatic    #33  <Method zzs$zza zzk.zzd(zzk)>
			//   11   25:aload_0         
			//   12   26:invokevirtual   #43  <Method String Object.toString()>
			//   13   29:invokevirtual   #44  <Method void zzs$zza.zzd(String)>
			//   14   32:return          
			}

			final String zzO;
			final long zzP;
			final zzk zzQ;

			
			{
				zzQ = zzk.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field zzk zzQ>
				zzO = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String zzO>
				zzP = l;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #25  <Field long zzP>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   15   37:new             #234 <Class Handler>
	//   16   40:dup             
	//   17   41:invokestatic    #232 <Method Looper Looper.getMainLooper()>
	//   18   44:invokespecial   #237 <Method void Handler(Looper)>
	//   19   47:new             #9   <Class zzk$1>
	//   20   50:dup             
	//   21   51:aload_0         
	//   22   52:aload_1         
	//   23   53:lload_2         
	//   24   54:invokespecial   #240 <Method void zzk$1(zzk, String, long)>
	//   25   57:invokevirtual   #244 <Method boolean Handler.post(Runnable)>
	//   26   60:pop             
_L6:
		return;
	//   27   61:return          
_L4:
		zzB.zza(s, l);
	//   28   62:aload_0         
	//   29   63:getfield        #48  <Field zzs$zza zzB>
	//   30   66:aload_1         
	//   31   67:lload_2         
	//   32   68:invokevirtual   #213 <Method void zzs$zza.zza(String, long)>
		zzB.zzd(toString());
	//   33   71:aload_0         
	//   34   72:getfield        #48  <Field zzs$zza zzB>
	//   35   75:aload_0         
	//   36   76:invokevirtual   #245 <Method String toString()>
	//   37   79:invokevirtual   #247 <Method void zzs$zza.zzd(String)>
		return;
	//   38   82:return          
_L2:
		long l1 = SystemClock.elapsedRealtime() - zzL;
	//   39   83:invokestatic    #218 <Method long SystemClock.elapsedRealtime()>
	//   40   86:aload_0         
	//   41   87:getfield        #56  <Field long zzL>
	//   42   90:lsub            
	//   43   91:lstore_2        
		if(l1 >= 3000L)
	//*  44   92:lload_2         
	//*  45   93:ldc2w           #248 <Long 3000L>
	//*  46   96:lcmp            
	//*  47   97:iflt            61
		{
			com.google.android.gms.internal.zzs.zzb("%d ms: %s", new Object[] {
				Long.valueOf(l1), toString()
			});
	//   48  100:ldc1            #251 <String "%d ms: %s">
	//   49  102:iconst_2        
	//   50  103:anewarray       Object[]
	//   51  106:dup             
	//   52  107:iconst_0        
	//   53  108:lload_2         
	//   54  109:invokestatic    #256 <Method Long Long.valueOf(long)>
	//   55  112:aastore         
	//   56  113:dup             
	//   57  114:iconst_1        
	//   58  115:aload_0         
	//   59  116:invokevirtual   #245 <Method String toString()>
	//   60  119:aastore         
	//   61  120:invokestatic    #261 <Method void zzs.zzb(String, Object[])>
			return;
	//   62  123:return          
		}
		if(true) goto _L6; else goto _L5
_L5:
	}

	public int zzf()
	{
		return zzE;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field int zzE>
	//    2    4:ireturn         
	}

	public String zzg()
	{
		return getUrl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method String getUrl()>
	//    2    4:areturn         
	}

	public zzb.zza zzh()
	{
		return zzN;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field zzb$zza zzN>
	//    2    4:areturn         
	}

	public String zzi()
	{
		return zzl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #269 <Method String zzl()>
	//    2    4:areturn         
	}

	public byte[] zzj()
		throws com.google.android.gms.internal.zza
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected String zzk()
	{
		return "UTF-8";
	//    0    0:ldc2            #275 <String "UTF-8">
	//    1    3:areturn         
	}

	public String zzl()
	{
		String s = String.valueOf(((Object) (zzk())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #277 <Method String zzk()>
	//    2    4:invokestatic    #135 <Method String String.valueOf(Object)>
	//    3    7:astore_1        
		if(s.length() != 0)
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #138 <Method int String.length()>
	//*   6   12:ifeq            23
			return "application/x-www-form-urlencoded; charset=".concat(s);
	//    7   15:ldc2            #279 <String "application/x-www-form-urlencoded; charset=">
	//    8   18:aload_1         
	//    9   19:invokevirtual   #144 <Method String String.concat(String)>
	//   10   22:areturn         
		else
			return new String("application/x-www-form-urlencoded; charset=");
	//   11   23:new             #95  <Class String>
	//   12   26:dup             
	//   13   27:ldc2            #279 <String "application/x-www-form-urlencoded; charset=">
	//   14   30:invokespecial   #170 <Method void String(String)>
	//   15   33:areturn         
	}

	public byte[] zzm()
		throws com.google.android.gms.internal.zza
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final boolean zzn()
	{
		return zzI;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field boolean zzI>
	//    2    4:ireturn         
	}

	public zza zzo()
	{
		return zza.zzS;
	//    0    0:getstatic       #286 <Field zzk$zza zzk$zza.zzS>
	//    1    3:areturn         
	}

	public final int zzp()
	{
		return zzM.zzc();
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field zzo zzM>
	//    2    4:invokeinterface #291 <Method int zzo.zzc()>
	//    3    9:ireturn         
	}

	public zzo zzq()
	{
		return zzM;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field zzo zzM>
	//    2    4:areturn         
	}

	public void zzr()
	{
		zzK = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #54  <Field boolean zzK>
	//    3    5:return          
	}

	public boolean zzs()
	{
		return zzK;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field boolean zzK>
	//    2    4:ireturn         
	}

	private final zzs.zza zzB;
	private final int zzC;
	private final String zzD;
	private final int zzE;
	private final zzm.zza zzF;
	private Integer zzG;
	private zzl zzH;
	private boolean zzI;
	private boolean zzJ;
	private boolean zzK;
	private long zzL;
	private zzo zzM;
	private zzb.zza zzN;
}
