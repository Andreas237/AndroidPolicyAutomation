// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq, zzgj, zzo, zzdi

final class zzbv extends zzbq
{

	public zzbv()
	{
		super(ID, new String[] {
			zzbcf
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #23  <Field String ID>
	//    2    4:iconst_1        
	//    3    5:anewarray       String[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #32  <Field String zzbcf>
	//    7   13:aastore         
	//    8   14:invokespecial   #49  <Method void zzbq(String, String[])>
	//    9   17:return          
	}

	public final zzp zzc(Map map)
	{
		Object obj = ((Object) ((zzp)map.get(((Object) (zzbcf)))));
	//    0    0:aload_1         
	//    1    1:getstatic       #32  <Field String zzbcf>
	//    2    4:invokeinterface #59  <Method Object Map.get(Object)>
	//    3    9:checkcast       #61  <Class zzp>
	//    4   12:astore_2        
		if(obj != null && obj != zzgj.zzqq()) goto _L2; else goto _L1
	//    5   13:aload_2         
	//    6   14:ifnull          217
	//    7   17:aload_2         
	//    8   18:invokestatic    #67  <Method zzp zzgj.zzqq()>
	//    9   21:if_acmpne       27
	//*  10   24:goto            217
_L2:
		String s;
		s = zzgj.zzc(((zzp) (obj)));
	//   11   27:aload_2         
	//   12   28:invokestatic    #70  <Method String zzgj.zzc(zzp)>
	//   13   31:astore_3        
		obj = ((Object) ((zzp)map.get(((Object) (zzbck)))));
	//   14   32:aload_1         
	//   15   33:getstatic       #37  <Field String zzbck>
	//   16   36:invokeinterface #59  <Method Object Map.get(Object)>
	//   17   41:checkcast       #61  <Class zzp>
	//   18   44:astore_2        
		if(obj == null)
	//*  19   45:aload_2         
	//*  20   46:ifnonnull       55
			obj = "MD5";
	//   21   49:ldc1            #72  <String "MD5">
	//   22   51:astore_2        
		else
	//*  23   52:goto            60
			obj = ((Object) (zzgj.zzc(((zzp) (obj)))));
	//   24   55:aload_2         
	//   25   56:invokestatic    #70  <Method String zzgj.zzc(zzp)>
	//   26   59:astore_2        
		map = ((Map) ((zzp)map.get(((Object) (zzbch)))));
	//   27   60:aload_1         
	//   28   61:getstatic       #42  <Field String zzbch>
	//   29   64:invokeinterface #59  <Method Object Map.get(Object)>
	//   30   69:checkcast       #61  <Class zzp>
	//   31   72:astore_1        
		if(map == null)
	//*  32   73:aload_1         
	//*  33   74:ifnonnull       83
			map = "text";
	//   34   77:ldc1            #74  <String "text">
	//   35   79:astore_1        
		else
	//*  36   80:goto            88
			map = ((Map) (zzgj.zzc(((zzp) (map)))));
	//   37   83:aload_1         
	//   38   84:invokestatic    #70  <Method String zzgj.zzc(zzp)>
	//   39   87:astore_1        
		if(!"text".equals(((Object) (map)))) goto _L4; else goto _L3
	//   40   88:ldc1            #74  <String "text">
	//   41   90:aload_1         
	//   42   91:invokevirtual   #78  <Method boolean String.equals(Object)>
	//   43   94:ifeq            105
_L3:
		map = ((Map) (s.getBytes()));
	//   44   97:aload_3         
	//   45   98:invokevirtual   #82  <Method byte[] String.getBytes()>
	//   46  101:astore_1        
		  goto _L5
	//*  47  102:goto            119
_L4:
		if(!"base16".equals(((Object) (map)))) goto _L7; else goto _L6
	//   48  105:ldc1            #84  <String "base16">
	//   49  107:aload_1         
	//   50  108:invokevirtual   #78  <Method boolean String.equals(Object)>
	//   51  111:ifeq            182
_L6:
		map = ((Map) (zzo.decode(s)));
	//   52  114:aload_3         
	//   53  115:invokestatic    #90  <Method byte[] zzo.decode(String)>
	//   54  118:astore_1        
_L5:
		MessageDigest messagedigest = MessageDigest.getInstance(((String) (obj)));
	//   55  119:aload_2         
	//   56  120:invokestatic    #96  <Method MessageDigest MessageDigest.getInstance(String)>
	//   57  123:astore_3        
		messagedigest.update(((byte []) (map)));
	//   58  124:aload_3         
	//   59  125:aload_1         
	//   60  126:invokevirtual   #100 <Method void MessageDigest.update(byte[])>
		map = ((Map) (zzgj.zzj(((Object) (zzo.encode(messagedigest.digest()))))));
	//   61  129:aload_3         
	//   62  130:invokevirtual   #103 <Method byte[] MessageDigest.digest()>
	//   63  133:invokestatic    #107 <Method String zzo.encode(byte[])>
	//   64  136:invokestatic    #111 <Method zzp zzgj.zzj(Object)>
	//   65  139:astore_1        
		return ((zzp) (map));
	//   66  140:aload_1         
	//   67  141:areturn         
_L10:
		map = ((Map) (String.valueOf(obj)));
	//   68  142:aload_2         
	//   69  143:invokestatic    #115 <Method String String.valueOf(Object)>
	//   70  146:astore_1        
		if(((String) (map)).length() != 0)
	//*  71  147:aload_1         
	//*  72  148:invokevirtual   #119 <Method int String.length()>
	//*  73  151:ifeq            164
			map = ((Map) ("Hash: unknown algorithm: ".concat(((String) (map)))));
	//   74  154:ldc1            #121 <String "Hash: unknown algorithm: ">
	//   75  156:aload_1         
	//   76  157:invokevirtual   #125 <Method String String.concat(String)>
	//   77  160:astore_1        
		else
	//*  78  161:goto            174
			map = ((Map) (new String("Hash: unknown algorithm: ")));
	//   79  164:new             #46  <Class String>
	//   80  167:dup             
	//   81  168:ldc1            #121 <String "Hash: unknown algorithm: ">
	//   82  170:invokespecial   #128 <Method void String(String)>
	//   83  173:astore_1        
_L8:
		zzdi.e(((String) (map)));
	//   84  174:aload_1         
	//   85  175:invokestatic    #133 <Method void zzdi.e(String)>
		return zzgj.zzqq();
	//   86  178:invokestatic    #67  <Method zzp zzgj.zzqq()>
	//   87  181:areturn         
_L7:
		map = ((Map) (String.valueOf(((Object) (map)))));
	//   88  182:aload_1         
	//   89  183:invokestatic    #115 <Method String String.valueOf(Object)>
	//   90  186:astore_1        
		if(((String) (map)).length() != 0)
	//*  91  187:aload_1         
	//*  92  188:invokevirtual   #119 <Method int String.length()>
	//*  93  191:ifeq            204
			map = ((Map) ("Hash: unknown input format: ".concat(((String) (map)))));
	//   94  194:ldc1            #135 <String "Hash: unknown input format: ">
	//   95  196:aload_1         
	//   96  197:invokevirtual   #125 <Method String String.concat(String)>
	//   97  200:astore_1        
		else
	//*  98  201:goto            174
			map = ((Map) (new String("Hash: unknown input format: ")));
	//   99  204:new             #46  <Class String>
	//  100  207:dup             
	//  101  208:ldc1            #135 <String "Hash: unknown input format: ">
	//  102  210:invokespecial   #128 <Method void String(String)>
	//  103  213:astore_1        
		if(true) goto _L8; else goto _L1
	//  104  214:goto            174
_L1:
		return zzgj.zzqq();
	//  105  217:invokestatic    #67  <Method zzp zzgj.zzqq()>
	//  106  220:areturn         
		map;
	//  107  221:astore_1        
		if(true) goto _L10; else goto _L9
_L9:
	//* 108  222:goto            142
	}

	public final boolean zznk()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final String ID;
	private static final String zzbcf;
	private static final String zzbch;
	private static final String zzbck;

	static 
	{
		ID = zza.zzal.toString();
	//    0    0:getstatic       #17  <Field zza zza.zzal>
	//    1    3:invokevirtual   #21  <Method String zza.toString()>
	//    2    6:putstatic       #23  <Field String ID>
		zzbcf = zzb.zzef.toString();
	//    3    9:getstatic       #29  <Field zzb zzb.zzef>
	//    4   12:invokevirtual   #30  <Method String zzb.toString()>
	//    5   15:putstatic       #32  <Field String zzbcf>
		zzbck = zzb.zzdv.toString();
	//    6   18:getstatic       #35  <Field zzb zzb.zzdv>
	//    7   21:invokevirtual   #30  <Method String zzb.toString()>
	//    8   24:putstatic       #37  <Field String zzbck>
		zzbch = zzb.zzik.toString();
	//    9   27:getstatic       #40  <Field zzb zzb.zzik>
	//   10   30:invokevirtual   #30  <Method String zzb.toString()>
	//   11   33:putstatic       #42  <Field String zzbch>
	//*  12   36:return          
	}
}
