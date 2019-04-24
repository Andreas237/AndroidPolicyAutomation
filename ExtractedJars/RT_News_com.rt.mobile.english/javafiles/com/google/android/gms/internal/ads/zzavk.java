// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaug, zzaxg, zzavl, zzaxa, 
//			zzbbu, zzaxc, zzazq, zzbah, 
//			zzazj, zzauk, zzaxe, zzazl, 
//			zzbbo, zzaxi, zzazy, zzbcu

final class zzavk
	implements zzaug
{

	zzavk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	private static void zza(zzaxg zzaxg1)
		throws GeneralSecurityException
	{
		if(zzaxg1.zzyt() < 10)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #22  <Method int zzaxg.zzyt()>
	//*   2    4:bipush          10
	//*   3    6:icmpge          19
			throw new GeneralSecurityException("tag size too small");
	//    4    9:new             #16  <Class GeneralSecurityException>
	//    5   12:dup             
	//    6   13:ldc1            #24  <String "tag size too small">
	//    7   15:invokespecial   #27  <Method void GeneralSecurityException(String)>
	//    8   18:athrow          
		switch(zzavl.zzdhz[zzaxg1.zzys().ordinal()])
	//*   9   19:getstatic       #33  <Field int[] zzavl.zzdhz>
	//*  10   22:aload_0         
	//*  11   23:invokevirtual   #37  <Method zzaxa zzaxg.zzys()>
	//*  12   26:invokevirtual   #42  <Method int zzaxa.ordinal()>
	//*  13   29:iaload          
		{
	//*  14   30:tableswitch     1 3: default 56
	//	               1 104
	//	               2 85
	//	               3 66
		default:
			throw new GeneralSecurityException("unknown hash type");
	//   15   56:new             #16  <Class GeneralSecurityException>
	//   16   59:dup             
	//   17   60:ldc1            #44  <String "unknown hash type">
	//   18   62:invokespecial   #27  <Method void GeneralSecurityException(String)>
	//   19   65:athrow          

		case 3: // '\003'
			if(zzaxg1.zzyt() > 64)
	//*  20   66:aload_0         
	//*  21   67:invokevirtual   #22  <Method int zzaxg.zzyt()>
	//*  22   70:bipush          64
	//*  23   72:icmple          123
				throw new GeneralSecurityException("tag size too big");
	//   24   75:new             #16  <Class GeneralSecurityException>
	//   25   78:dup             
	//   26   79:ldc1            #46  <String "tag size too big">
	//   27   81:invokespecial   #27  <Method void GeneralSecurityException(String)>
	//   28   84:athrow          
			break;

		case 2: // '\002'
			if(zzaxg1.zzyt() > 32)
	//*  29   85:aload_0         
	//*  30   86:invokevirtual   #22  <Method int zzaxg.zzyt()>
	//*  31   89:bipush          32
	//*  32   91:icmple          123
				throw new GeneralSecurityException("tag size too big");
	//   33   94:new             #16  <Class GeneralSecurityException>
	//   34   97:dup             
	//   35   98:ldc1            #46  <String "tag size too big">
	//   36  100:invokespecial   #27  <Method void GeneralSecurityException(String)>
	//   37  103:athrow          
			break;

		case 1: // '\001'
			if(zzaxg1.zzyt() > 20)
	//*  38  104:aload_0         
	//*  39  105:invokevirtual   #22  <Method int zzaxg.zzyt()>
	//*  40  108:bipush          20
	//*  41  110:icmple          123
				throw new GeneralSecurityException("tag size too big");
	//   42  113:new             #16  <Class GeneralSecurityException>
	//   43  116:dup             
	//   44  117:ldc1            #46  <String "tag size too big">
	//   45  119:invokespecial   #27  <Method void GeneralSecurityException(String)>
	//   46  122:athrow          
			break;
		}
	//   47  123:return          
	}

	private final zzauk zzh(zzbah zzbah1)
		throws GeneralSecurityException
	{
		int i;
		zzaxa zzaxa1;
		SecretKeySpec secretkeyspec;
		zzbah1 = ((zzbah) (zzaxc.zzae(zzbah1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #57  <Method zzaxc zzaxc.zzae(zzbah)>
	//    2    4:astore_1        
		if(!(zzbah1 instanceof zzaxc))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #53  <Class zzaxc>
	//*   5    9:ifne            22
			throw new GeneralSecurityException("expected HmacKey proto");
	//    6   12:new             #16  <Class GeneralSecurityException>
	//    7   15:dup             
	//    8   16:ldc1            #59  <String "expected HmacKey proto">
	//    9   18:invokespecial   #27  <Method void GeneralSecurityException(String)>
	//   10   21:athrow          
		zzbah1 = ((zzbah) ((zzaxc)zzbah1));
	//   11   22:aload_1         
	//   12   23:checkcast       #53  <Class zzaxc>
	//   13   26:astore_1        
		zzazq.zzj(((zzaxc) (zzbah1)).getVersion(), 0);
	//   14   27:aload_1         
	//   15   28:invokevirtual   #62  <Method int zzaxc.getVersion()>
	//   16   31:iconst_0        
	//   17   32:invokestatic    #68  <Method void zzazq.zzj(int, int)>
		if(((zzaxc) (zzbah1)).zzwv().size() < 16)
	//*  18   35:aload_1         
	//*  19   36:invokevirtual   #72  <Method zzbah zzaxc.zzwv()>
	//*  20   39:invokevirtual   #77  <Method int zzbah.size()>
	//*  21   42:bipush          16
	//*  22   44:icmpge          57
			throw new GeneralSecurityException("key too short");
	//   23   47:new             #16  <Class GeneralSecurityException>
	//   24   50:dup             
	//   25   51:ldc1            #79  <String "key too short">
	//   26   53:invokespecial   #27  <Method void GeneralSecurityException(String)>
	//   27   56:athrow          
		zza(((zzaxc) (zzbah1)).zzym());
	//   28   57:aload_1         
	//   29   58:invokevirtual   #83  <Method zzaxg zzaxc.zzym()>
	//   30   61:invokestatic    #85  <Method void zza(zzaxg)>
		zzaxa1 = ((zzaxc) (zzbah1)).zzym().zzys();
	//   31   64:aload_1         
	//   32   65:invokevirtual   #83  <Method zzaxg zzaxc.zzym()>
	//   33   68:invokevirtual   #37  <Method zzaxa zzaxg.zzys()>
	//   34   71:astore_3        
		secretkeyspec = new SecretKeySpec(((zzaxc) (zzbah1)).zzwv().toByteArray(), "HMAC");
	//   35   72:new             #87  <Class SecretKeySpec>
	//   36   75:dup             
	//   37   76:aload_1         
	//   38   77:invokevirtual   #72  <Method zzbah zzaxc.zzwv()>
	//   39   80:invokevirtual   #91  <Method byte[] zzbah.toByteArray()>
	//   40   83:ldc1            #93  <String "HMAC">
	//   41   85:invokespecial   #96  <Method void SecretKeySpec(byte[], String)>
	//   42   88:astore          4
		i = ((zzaxc) (zzbah1)).zzym().zzyt();
	//   43   90:aload_1         
	//   44   91:invokevirtual   #83  <Method zzaxg zzaxc.zzym()>
	//   45   94:invokevirtual   #22  <Method int zzaxg.zzyt()>
	//   46   97:istore_2        
		zzavl.zzdhz[zzaxa1.ordinal()];
	//   47   98:getstatic       #33  <Field int[] zzavl.zzdhz>
	//   48  101:aload_3         
	//   49  102:invokevirtual   #42  <Method int zzaxa.ordinal()>
	//   50  105:iaload          
		JVM INSTR tableswitch 1 3: default 207
	//	               1 167
	//	               2 151
	//	               3 135;
	//   51  106:tableswitch     1 3: default 207
	//	               1 167
	//	               2 151
	//	               3 135
		   goto _L1 _L2 _L3 _L4
_L1:
		break MISSING_BLOCK_LABEL_185;
	//   52  132:goto            185
_L4:
		try
		{
			zzbah1 = ((zzbah) (new zzazj("HMACSHA512", ((java.security.Key) (secretkeyspec)), i)));
	//   53  135:new             #98  <Class zzazj>
	//   54  138:dup             
	//   55  139:ldc1            #100 <String "HMACSHA512">
	//   56  141:aload           4
	//   57  143:iload_2         
	//   58  144:invokespecial   #103 <Method void zzazj(String, java.security.Key, int)>
	//   59  147:astore_1        
		}
	//*  60  148:goto            180
	//*  61  151:new             #98  <Class zzazj>
	//*  62  154:dup             
	//*  63  155:ldc1            #105 <String "HMACSHA256">
	//*  64  157:aload           4
	//*  65  159:iload_2         
	//*  66  160:invokespecial   #103 <Method void zzazj(String, java.security.Key, int)>
	//*  67  163:astore_1        
	//*  68  164:goto            180
	//*  69  167:new             #98  <Class zzazj>
	//*  70  170:dup             
	//*  71  171:ldc1            #107 <String "HMACSHA1">
	//*  72  173:aload           4
	//*  73  175:iload_2         
	//*  74  176:invokespecial   #103 <Method void zzazj(String, java.security.Key, int)>
	//*  75  179:astore_1        
	//*  76  180:aload_1         
	//*  77  181:checkcast       #109 <Class zzauk>
	//*  78  184:areturn         
	//*  79  185:new             #16  <Class GeneralSecurityException>
	//*  80  188:dup             
	//*  81  189:ldc1            #111 <String "unknown hash">
	//*  82  191:invokespecial   #27  <Method void GeneralSecurityException(String)>
	//*  83  194:athrow          
		// Misplaced declaration of an exception variable
		catch(zzbah zzbah1)
	//*  84  195:astore_1        
		{
			throw new GeneralSecurityException("expected serialized HmacKey proto", ((Throwable) (zzbah1)));
	//   85  196:new             #16  <Class GeneralSecurityException>
	//   86  199:dup             
	//   87  200:ldc1            #113 <String "expected serialized HmacKey proto">
	//   88  202:aload_1         
	//   89  203:invokespecial   #116 <Method void GeneralSecurityException(String, Throwable)>
	//   90  206:athrow          
		}
		break; /* Loop/switch isn't completed */
	//   91  207:goto            132
_L3:
		zzbah1 = ((zzbah) (new zzazj("HMACSHA256", ((java.security.Key) (secretkeyspec)), i)));
		break; /* Loop/switch isn't completed */
_L2:
		zzbah1 = ((zzbah) (new zzazj("HMACSHA1", ((java.security.Key) (secretkeyspec)), i)));
		return (zzauk)zzbah1;
		throw new GeneralSecurityException("unknown hash");
	}

	public final int getVersion()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final Object zza(zzbah zzbah1)
		throws GeneralSecurityException
	{
		return ((Object) (zzh(zzbah1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #119 <Method zzauk zzh(zzbah)>
	//    3    5:areturn         
	}

	public final Object zza(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		if(!(zzbcu instanceof zzaxc))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #53  <Class zzaxc>
	//*   2    4:ifne            17
			throw new GeneralSecurityException("expected HmacKey proto");
	//    3    7:new             #16  <Class GeneralSecurityException>
	//    4   10:dup             
	//    5   11:ldc1            #59  <String "expected HmacKey proto">
	//    6   13:invokespecial   #27  <Method void GeneralSecurityException(String)>
	//    7   16:athrow          
		zzbcu = ((zzbcu) ((zzaxc)zzbcu));
	//    8   17:aload_1         
	//    9   18:checkcast       #53  <Class zzaxc>
	//   10   21:astore_1        
		zzazq.zzj(((zzaxc) (zzbcu)).getVersion(), 0);
	//   11   22:aload_1         
	//   12   23:invokevirtual   #62  <Method int zzaxc.getVersion()>
	//   13   26:iconst_0        
	//   14   27:invokestatic    #68  <Method void zzazq.zzj(int, int)>
		if(((zzaxc) (zzbcu)).zzwv().size() < 16)
	//*  15   30:aload_1         
	//*  16   31:invokevirtual   #72  <Method zzbah zzaxc.zzwv()>
	//*  17   34:invokevirtual   #77  <Method int zzbah.size()>
	//*  18   37:bipush          16
	//*  19   39:icmpge          52
			throw new GeneralSecurityException("key too short");
	//   20   42:new             #16  <Class GeneralSecurityException>
	//   21   45:dup             
	//   22   46:ldc1            #79  <String "key too short">
	//   23   48:invokespecial   #27  <Method void GeneralSecurityException(String)>
	//   24   51:athrow          
		zza(((zzaxc) (zzbcu)).zzym());
	//   25   52:aload_1         
	//   26   53:invokevirtual   #83  <Method zzaxg zzaxc.zzym()>
	//   27   56:invokestatic    #85  <Method void zza(zzaxg)>
		zzaxa zzaxa1 = ((zzaxc) (zzbcu)).zzym().zzys();
	//   28   59:aload_1         
	//   29   60:invokevirtual   #83  <Method zzaxg zzaxc.zzym()>
	//   30   63:invokevirtual   #37  <Method zzaxa zzaxg.zzys()>
	//   31   66:astore_3        
		SecretKeySpec secretkeyspec = new SecretKeySpec(((zzaxc) (zzbcu)).zzwv().toByteArray(), "HMAC");
	//   32   67:new             #87  <Class SecretKeySpec>
	//   33   70:dup             
	//   34   71:aload_1         
	//   35   72:invokevirtual   #72  <Method zzbah zzaxc.zzwv()>
	//   36   75:invokevirtual   #91  <Method byte[] zzbah.toByteArray()>
	//   37   78:ldc1            #93  <String "HMAC">
	//   38   80:invokespecial   #96  <Method void SecretKeySpec(byte[], String)>
	//   39   83:astore          4
		int i = ((zzaxc) (zzbcu)).zzym().zzyt();
	//   40   85:aload_1         
	//   41   86:invokevirtual   #83  <Method zzaxg zzaxc.zzym()>
	//   42   89:invokevirtual   #22  <Method int zzaxg.zzyt()>
	//   43   92:istore_2        
		switch(zzavl.zzdhz[zzaxa1.ordinal()])
	//*  44   93:getstatic       #33  <Field int[] zzavl.zzdhz>
	//*  45   96:aload_3         
	//*  46   97:invokevirtual   #42  <Method int zzaxa.ordinal()>
	//*  47  100:iaload          
		{
	//*  48  101:tableswitch     1 3: default 128
	//	               1 164
	//	               2 151
	//	               3 138
		default:
			throw new GeneralSecurityException("unknown hash");
	//   49  128:new             #16  <Class GeneralSecurityException>
	//   50  131:dup             
	//   51  132:ldc1            #111 <String "unknown hash">
	//   52  134:invokespecial   #27  <Method void GeneralSecurityException(String)>
	//   53  137:athrow          

		case 3: // '\003'
			return ((Object) (new zzazj("HMACSHA512", ((java.security.Key) (secretkeyspec)), i)));
	//   54  138:new             #98  <Class zzazj>
	//   55  141:dup             
	//   56  142:ldc1            #100 <String "HMACSHA512">
	//   57  144:aload           4
	//   58  146:iload_2         
	//   59  147:invokespecial   #103 <Method void zzazj(String, java.security.Key, int)>
	//   60  150:areturn         

		case 2: // '\002'
			return ((Object) (new zzazj("HMACSHA256", ((java.security.Key) (secretkeyspec)), i)));
	//   61  151:new             #98  <Class zzazj>
	//   62  154:dup             
	//   63  155:ldc1            #105 <String "HMACSHA256">
	//   64  157:aload           4
	//   65  159:iload_2         
	//   66  160:invokespecial   #103 <Method void zzazj(String, java.security.Key, int)>
	//   67  163:areturn         

		case 1: // '\001'
			return ((Object) (new zzazj("HMACSHA1", ((java.security.Key) (secretkeyspec)), i)));
	//   68  164:new             #98  <Class zzazj>
	//   69  167:dup             
	//   70  168:ldc1            #107 <String "HMACSHA1">
	//   71  170:aload           4
	//   72  172:iload_2         
	//   73  173:invokespecial   #103 <Method void zzazj(String, java.security.Key, int)>
	//   74  176:areturn         
		}
	}

	public final zzbcu zzb(zzbah zzbah1)
		throws GeneralSecurityException
	{
		try
		{
			zzbah1 = ((zzbah) (zzb(((zzbcu) (zzaxe.zzag(zzbah1))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #128 <Method zzaxe zzaxe.zzag(zzbah)>
	//    3    5:invokevirtual   #131 <Method zzbcu zzb(zzbcu)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbah zzbah1)
	//*   7   11:astore_1        
		{
			throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", ((Throwable) (zzbah1)));
	//    8   12:new             #16  <Class GeneralSecurityException>
	//    9   15:dup             
	//   10   16:ldc1            #133 <String "expected serialized HmacKeyFormat proto">
	//   11   18:aload_1         
	//   12   19:invokespecial   #116 <Method void GeneralSecurityException(String, Throwable)>
	//   13   22:athrow          
		}
		return ((zzbcu) (zzbah1));
	}

	public final zzbcu zzb(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		if(!(zzbcu instanceof zzaxe))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #124 <Class zzaxe>
	//*   2    4:ifne            17
			throw new GeneralSecurityException("expected HmacKeyFormat proto");
	//    3    7:new             #16  <Class GeneralSecurityException>
	//    4   10:dup             
	//    5   11:ldc1            #135 <String "expected HmacKeyFormat proto">
	//    6   13:invokespecial   #27  <Method void GeneralSecurityException(String)>
	//    7   16:athrow          
		zzbcu = ((zzbcu) ((zzaxe)zzbcu));
	//    8   17:aload_1         
	//    9   18:checkcast       #124 <Class zzaxe>
	//   10   21:astore_1        
		if(((zzaxe) (zzbcu)).getKeySize() < 16)
	//*  11   22:aload_1         
	//*  12   23:invokevirtual   #138 <Method int zzaxe.getKeySize()>
	//*  13   26:bipush          16
	//*  14   28:icmpge          41
		{
			throw new GeneralSecurityException("key too short");
	//   15   31:new             #16  <Class GeneralSecurityException>
	//   16   34:dup             
	//   17   35:ldc1            #79  <String "key too short">
	//   18   37:invokespecial   #27  <Method void GeneralSecurityException(String)>
	//   19   40:athrow          
		} else
		{
			zza(((zzaxe) (zzbcu)).zzym());
	//   20   41:aload_1         
	//   21   42:invokevirtual   #139 <Method zzaxg zzaxe.zzym()>
	//   22   45:invokestatic    #85  <Method void zza(zzaxg)>
			return ((zzbcu) ((zzbbo)((zzbbo.zza) (zzaxc.zzyn().zzav(0).zzc(((zzaxe) (zzbcu)).zzym()).zzaf(zzbah.zzo(zzazl.zzbh(((zzaxe) (zzbcu)).getKeySize()))))).zzadi()));
	//   23   48:invokestatic    #143 <Method zzaxc$zza zzaxc.zzyn()>
	//   24   51:iconst_0        
	//   25   52:invokevirtual   #149 <Method zzaxc$zza zzaxc$zza.zzav(int)>
	//   26   55:aload_1         
	//   27   56:invokevirtual   #139 <Method zzaxg zzaxe.zzym()>
	//   28   59:invokevirtual   #153 <Method zzaxc$zza zzaxc$zza.zzc(zzaxg)>
	//   29   62:aload_1         
	//   30   63:invokevirtual   #138 <Method int zzaxe.getKeySize()>
	//   31   66:invokestatic    #159 <Method byte[] zzazl.zzbh(int)>
	//   32   69:invokestatic    #163 <Method zzbah zzbah.zzo(byte[])>
	//   33   72:invokevirtual   #167 <Method zzaxc$zza zzaxc$zza.zzaf(zzbah)>
	//   34   75:invokevirtual   #173 <Method zzbbo zzbbo$zza.zzadi()>
	//   35   78:checkcast       #175 <Class zzbbo>
	//   36   81:areturn         
		}
	}

	public final zzaxi zzc(zzbah zzbah1)
		throws GeneralSecurityException
	{
		zzbah1 = ((zzbah) ((zzaxc)zzb(zzbah1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #178 <Method zzbcu zzb(zzbah)>
	//    3    5:checkcast       #53  <Class zzaxc>
	//    4    8:astore_1        
		return (zzaxi)(zzbbo)((zzbbo.zza) (zzaxi.zzyz().zzeb("type.googleapis.com/google.crypto.tink.HmacKey").zzai(((zzazy) (zzbah1)).zzaav()).zzb(zzaxi.zzb.zzdkx))).zzadi();
	//    5    9:invokestatic    #184 <Method zzaxi$zza zzaxi.zzyz()>
	//    6   12:ldc1            #186 <String "type.googleapis.com/google.crypto.tink.HmacKey">
	//    7   14:invokevirtual   #192 <Method zzaxi$zza zzaxi$zza.zzeb(String)>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #197 <Method zzbah zzazy.zzaav()>
	//   10   21:invokevirtual   #201 <Method zzaxi$zza zzaxi$zza.zzai(zzbah)>
	//   11   24:getstatic       #207 <Field zzaxi$zzb zzaxi$zzb.zzdkx>
	//   12   27:invokevirtual   #210 <Method zzaxi$zza zzaxi$zza.zzb(zzaxi$zzb)>
	//   13   30:invokevirtual   #173 <Method zzbbo zzbbo$zza.zzadi()>
	//   14   33:checkcast       #175 <Class zzbbo>
	//   15   36:checkcast       #180 <Class zzaxi>
	//   16   39:areturn         
	}
}
