// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzayn, zzbbu, zzaxn, zzawg, 
//			zzauo, zzawe, zzavq, zzavo, 
//			zzavu, zzaxe, zzbah, zzbbo, 
//			zzatz, zzavs, zzaxc

final class zzavj
	implements zzayn
{

	zzavj(zzaxn zzaxn1)
		throws GeneralSecurityException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzdic = zzaxn1.zzyw();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #30  <Method String zzaxn.zzyw()>
	//    5    9:putfield        #32  <Field String zzdic>
		if(zzdic.equals("type.googleapis.com/google.crypto.tink.AesGcmKey"))
	//*   6   12:aload_0         
	//*   7   13:getfield        #32  <Field String zzdic>
	//*   8   16:ldc1            #34  <String "type.googleapis.com/google.crypto.tink.AesGcmKey">
	//*   9   18:invokevirtual   #40  <Method boolean String.equals(Object)>
	//*  10   21:ifeq            64
			try
			{
				zzawg zzawg1 = zzawg.zzt(zzaxn1.zzyx());
	//   11   24:aload_1         
	//   12   25:invokevirtual   #44  <Method zzbah zzaxn.zzyx()>
	//   13   28:invokestatic    #50  <Method zzawg zzawg.zzt(zzbah)>
	//   14   31:astore_3        
				zzdie = (zzawe)zzauo.zzb(zzaxn1);
	//   15   32:aload_0         
	//   16   33:aload_1         
	//   17   34:invokestatic    #56  <Method zzbcu zzauo.zzb(zzaxn)>
	//   18   37:checkcast       #58  <Class zzawe>
	//   19   40:putfield        #60  <Field zzawe zzdie>
				zzdid = zzawg1.getKeySize();
	//   20   43:aload_0         
	//   21   44:aload_3         
	//   22   45:invokevirtual   #64  <Method int zzawg.getKeySize()>
	//   23   48:putfield        #66  <Field int zzdid>
				return;
	//   24   51:return          
			}
			// Misplaced declaration of an exception variable
			catch(zzaxn zzaxn1)
	//*  25   52:astore_1        
			{
				throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", ((Throwable) (zzaxn1)));
	//   26   53:new             #19  <Class GeneralSecurityException>
	//   27   56:dup             
	//   28   57:ldc1            #68  <String "invalid KeyFormat protobuf, expected AesGcmKeyFormat">
	//   29   59:aload_1         
	//   30   60:invokespecial   #71  <Method void GeneralSecurityException(String, Throwable)>
	//   31   63:athrow          
			}
		if(zzdic.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"))
	//*  32   64:aload_0         
	//*  33   65:getfield        #32  <Field String zzdic>
	//*  34   68:ldc1            #73  <String "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey">
	//*  35   70:invokevirtual   #40  <Method boolean String.equals(Object)>
	//*  36   73:ifeq            137
			try
			{
				zzavq zzavq1 = zzavq.zzj(zzaxn1.zzyx());
	//   37   76:aload_1         
	//   38   77:invokevirtual   #44  <Method zzbah zzaxn.zzyx()>
	//   39   80:invokestatic    #79  <Method zzavq zzavq.zzj(zzbah)>
	//   40   83:astore_3        
				zzdif = (zzavo)zzauo.zzb(zzaxn1);
	//   41   84:aload_0         
	//   42   85:aload_1         
	//   43   86:invokestatic    #56  <Method zzbcu zzauo.zzb(zzaxn)>
	//   44   89:checkcast       #81  <Class zzavo>
	//   45   92:putfield        #83  <Field zzavo zzdif>
				zzdig = zzavq1.zzwr().getKeySize();
	//   46   95:aload_0         
	//   47   96:aload_3         
	//   48   97:invokevirtual   #87  <Method zzavu zzavq.zzwr()>
	//   49  100:invokevirtual   #90  <Method int zzavu.getKeySize()>
	//   50  103:putfield        #92  <Field int zzdig>
				int i = zzavq1.zzws().getKeySize();
	//   51  106:aload_3         
	//   52  107:invokevirtual   #96  <Method zzaxe zzavq.zzws()>
	//   53  110:invokevirtual   #99  <Method int zzaxe.getKeySize()>
	//   54  113:istore_2        
				zzdid = zzdig + i;
	//   55  114:aload_0         
	//   56  115:aload_0         
	//   57  116:getfield        #92  <Field int zzdig>
	//   58  119:iload_2         
	//   59  120:iadd            
	//   60  121:putfield        #66  <Field int zzdid>
				return;
	//   61  124:return          
			}
			// Misplaced declaration of an exception variable
			catch(zzaxn zzaxn1)
	//*  62  125:astore_1        
			{
				throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", ((Throwable) (zzaxn1)));
	//   63  126:new             #19  <Class GeneralSecurityException>
	//   64  129:dup             
	//   65  130:ldc1            #68  <String "invalid KeyFormat protobuf, expected AesGcmKeyFormat">
	//   66  132:aload_1         
	//   67  133:invokespecial   #71  <Method void GeneralSecurityException(String, Throwable)>
	//   68  136:athrow          
			}
		zzaxn1 = ((zzaxn) (String.valueOf(((Object) (zzdic)))));
	//   69  137:aload_0         
	//   70  138:getfield        #32  <Field String zzdic>
	//   71  141:invokestatic    #103 <Method String String.valueOf(Object)>
	//   72  144:astore_1        
		if(((String) (zzaxn1)).length() != 0)
	//*  73  145:aload_1         
	//*  74  146:invokevirtual   #106 <Method int String.length()>
	//*  75  149:ifeq            162
			zzaxn1 = ((zzaxn) ("unsupported AEAD DEM key type: ".concat(((String) (zzaxn1)))));
	//   76  152:ldc1            #108 <String "unsupported AEAD DEM key type: ">
	//   77  154:aload_1         
	//   78  155:invokevirtual   #112 <Method String String.concat(String)>
	//   79  158:astore_1        
		else
	//*  80  159:goto            172
			zzaxn1 = ((zzaxn) (new String("unsupported AEAD DEM key type: ")));
	//   81  162:new             #36  <Class String>
	//   82  165:dup             
	//   83  166:ldc1            #108 <String "unsupported AEAD DEM key type: ">
	//   84  168:invokespecial   #115 <Method void String(String)>
	//   85  171:astore_1        
		throw new GeneralSecurityException(((String) (zzaxn1)));
	//   86  172:new             #19  <Class GeneralSecurityException>
	//   87  175:dup             
	//   88  176:aload_1         
	//   89  177:invokespecial   #116 <Method void GeneralSecurityException(String)>
	//   90  180:athrow          
	}

	public final zzatz zzi(byte abyte0[])
		throws GeneralSecurityException
	{
		if(abyte0.length != zzdid)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:aload_0         
	//*   3    3:getfield        #66  <Field int zzdid>
	//*   4    6:icmpeq          19
			throw new GeneralSecurityException("Symmetric key has incorrect length");
	//    5    9:new             #19  <Class GeneralSecurityException>
	//    6   12:dup             
	//    7   13:ldc1            #122 <String "Symmetric key has incorrect length">
	//    8   15:invokespecial   #116 <Method void GeneralSecurityException(String)>
	//    9   18:athrow          
		if(zzdic.equals("type.googleapis.com/google.crypto.tink.AesGcmKey"))
	//*  10   19:aload_0         
	//*  11   20:getfield        #32  <Field String zzdic>
	//*  12   23:ldc1            #34  <String "type.googleapis.com/google.crypto.tink.AesGcmKey">
	//*  13   25:invokevirtual   #40  <Method boolean String.equals(Object)>
	//*  14   28:ifeq            78
			abyte0 = ((byte []) ((zzawe)(zzbbo)((zzbbo.zza) (((zzawe.zza)((zzbbo.zza) (zzawe.zzxk())).zza(((zzbbo) (zzdie)))).zzs(zzbah.zzc(abyte0, 0, zzdid)))).zzadi()));
	//   15   31:invokestatic    #126 <Method zzawe$zza zzawe.zzxk()>
	//   16   34:aload_0         
	//   17   35:getfield        #60  <Field zzawe zzdie>
	//   18   38:invokevirtual   #132 <Method zzbbo$zza zzbbo$zza.zza(zzbbo)>
	//   19   41:checkcast       #134 <Class zzawe$zza>
	//   20   44:aload_1         
	//   21   45:iconst_0        
	//   22   46:aload_0         
	//   23   47:getfield        #66  <Field int zzdid>
	//   24   50:invokestatic    #140 <Method zzbah zzbah.zzc(byte[], int, int)>
	//   25   53:invokevirtual   #144 <Method zzawe$zza zzawe$zza.zzs(zzbah)>
	//   26   56:invokevirtual   #148 <Method zzbbo zzbbo$zza.zzadi()>
	//   27   59:checkcast       #150 <Class zzbbo>
	//   28   62:checkcast       #58  <Class zzawe>
	//   29   65:astore_1        
		else
	//*  30   66:aload_0         
	//*  31   67:getfield        #32  <Field String zzdic>
	//*  32   70:aload_1         
	//*  33   71:invokestatic    #153 <Method Object zzauo.zzb(String, zzbcu)>
	//*  34   74:checkcast       #155 <Class zzatz>
	//*  35   77:areturn         
		if(zzdic.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"))
	//*  36   78:aload_0         
	//*  37   79:getfield        #32  <Field String zzdic>
	//*  38   82:ldc1            #73  <String "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey">
	//*  39   84:invokevirtual   #40  <Method boolean String.equals(Object)>
	//*  40   87:ifeq            213
		{
			byte abyte1[] = Arrays.copyOfRange(abyte0, 0, zzdig);
	//   41   90:aload_1         
	//   42   91:iconst_0        
	//   43   92:aload_0         
	//   44   93:getfield        #92  <Field int zzdig>
	//   45   96:invokestatic    #161 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   46   99:astore_2        
			abyte0 = Arrays.copyOfRange(abyte0, zzdig, zzdid);
	//   47  100:aload_1         
	//   48  101:aload_0         
	//   49  102:getfield        #92  <Field int zzdig>
	//   50  105:aload_0         
	//   51  106:getfield        #66  <Field int zzdid>
	//   52  109:invokestatic    #161 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   53  112:astore_1        
			zzavs zzavs1 = (zzavs)(zzbbo)((zzbbo.zza) (((zzavs.zza)((zzbbo.zza) (zzavs.zzww())).zza(((zzbbo) (zzdif.zzwn())))).zzm(zzbah.zzo(abyte1)))).zzadi();
	//   54  113:invokestatic    #167 <Method zzavs$zza zzavs.zzww()>
	//   55  116:aload_0         
	//   56  117:getfield        #83  <Field zzavo zzdif>
	//   57  120:invokevirtual   #171 <Method zzavs zzavo.zzwn()>
	//   58  123:invokevirtual   #132 <Method zzbbo$zza zzbbo$zza.zza(zzbbo)>
	//   59  126:checkcast       #173 <Class zzavs$zza>
	//   60  129:aload_2         
	//   61  130:invokestatic    #177 <Method zzbah zzbah.zzo(byte[])>
	//   62  133:invokevirtual   #181 <Method zzavs$zza zzavs$zza.zzm(zzbah)>
	//   63  136:invokevirtual   #148 <Method zzbbo zzbbo$zza.zzadi()>
	//   64  139:checkcast       #150 <Class zzbbo>
	//   65  142:checkcast       #163 <Class zzavs>
	//   66  145:astore_2        
			abyte0 = ((byte []) ((zzaxc)(zzbbo)((zzbbo.zza) (((zzaxc.zza)((zzbbo.zza) (zzaxc.zzyn())).zza(((zzbbo) (zzdif.zzwo())))).zzaf(zzbah.zzo(abyte0)))).zzadi()));
	//   67  146:invokestatic    #187 <Method zzaxc$zza zzaxc.zzyn()>
	//   68  149:aload_0         
	//   69  150:getfield        #83  <Field zzavo zzdif>
	//   70  153:invokevirtual   #191 <Method zzaxc zzavo.zzwo()>
	//   71  156:invokevirtual   #132 <Method zzbbo$zza zzbbo$zza.zza(zzbbo)>
	//   72  159:checkcast       #193 <Class zzaxc$zza>
	//   73  162:aload_1         
	//   74  163:invokestatic    #177 <Method zzbah zzbah.zzo(byte[])>
	//   75  166:invokevirtual   #197 <Method zzaxc$zza zzaxc$zza.zzaf(zzbah)>
	//   76  169:invokevirtual   #148 <Method zzbbo zzbbo$zza.zzadi()>
	//   77  172:checkcast       #150 <Class zzbbo>
	//   78  175:checkcast       #183 <Class zzaxc>
	//   79  178:astore_1        
			abyte0 = ((byte []) ((zzavo)(zzbbo)((zzbbo.zza) (zzavo.zzwp().zzal(zzdif.getVersion()).zzb(zzavs1).zzb(((zzaxc) (abyte0))))).zzadi()));
	//   80  179:invokestatic    #201 <Method zzavo$zza zzavo.zzwp()>
	//   81  182:aload_0         
	//   82  183:getfield        #83  <Field zzavo zzdif>
	//   83  186:invokevirtual   #204 <Method int zzavo.getVersion()>
	//   84  189:invokevirtual   #210 <Method zzavo$zza zzavo$zza.zzal(int)>
	//   85  192:aload_2         
	//   86  193:invokevirtual   #213 <Method zzavo$zza zzavo$zza.zzb(zzavs)>
	//   87  196:aload_1         
	//   88  197:invokevirtual   #216 <Method zzavo$zza zzavo$zza.zzb(zzaxc)>
	//   89  200:invokevirtual   #148 <Method zzbbo zzbbo$zza.zzadi()>
	//   90  203:checkcast       #150 <Class zzbbo>
	//   91  206:checkcast       #81  <Class zzavo>
	//   92  209:astore_1        
		} else
	//*  93  210:goto            66
		{
			throw new GeneralSecurityException("unknown DEM key type");
	//   94  213:new             #19  <Class GeneralSecurityException>
	//   95  216:dup             
	//   96  217:ldc1            #218 <String "unknown DEM key type">
	//   97  219:invokespecial   #116 <Method void GeneralSecurityException(String)>
	//   98  222:athrow          
		}
		return (zzatz)zzauo.zzb(zzdic, ((zzbcu) (abyte0)));
	}

	public final int zzwm()
	{
		return zzdid;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field int zzdid>
	//    2    4:ireturn         
	}

	private final String zzdic;
	private final int zzdid;
	private zzawe zzdie;
	private zzavo zzdif;
	private int zzdig;
}
