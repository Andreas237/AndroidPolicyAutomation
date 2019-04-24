// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.util.Base64;
import com.google.android.gms.internal.measurement.*;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq, zzgj, zzo, zzdi

final class zzbk extends zzbq
{

	public zzbk()
	{
		super(ID, new String[] {
			zzbcf
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #24  <Field String ID>
	//    2    4:iconst_1        
	//    3    5:anewarray       String[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #33  <Field String zzbcf>
	//    7   13:aastore         
	//    8   14:invokespecial   #55  <Method void zzbq(String, String[])>
	//    9   17:return          
	}

	public final zzp zzc(Map map)
	{
		Object obj = ((Object) ((zzp)map.get(((Object) (zzbcf)))));
	//    0    0:aload_1         
	//    1    1:getstatic       #33  <Field String zzbcf>
	//    2    4:invokeinterface #65  <Method Object Map.get(Object)>
	//    3    9:checkcast       #67  <Class zzp>
	//    4   12:astore          4
		if(obj != null && obj != zzgj.zzqq()) goto _L2; else goto _L1
	//    5   14:aload           4
	//    6   16:ifnull          367
	//    7   19:aload           4
	//    8   21:invokestatic    #73  <Method zzp zzgj.zzqq()>
	//    9   24:if_acmpne       30
	//*  10   27:goto            367
_L2:
		byte byte0;
		String s;
		String s1;
		s1 = zzgj.zzc(((zzp) (obj)));
	//   11   30:aload           4
	//   12   32:invokestatic    #76  <Method String zzgj.zzc(zzp)>
	//   13   35:astore          6
		obj = ((Object) ((zzp)map.get(((Object) (zzbch)))));
	//   14   37:aload_1         
	//   15   38:getstatic       #43  <Field String zzbch>
	//   16   41:invokeinterface #65  <Method Object Map.get(Object)>
	//   17   46:checkcast       #67  <Class zzp>
	//   18   49:astore          4
		if(obj == null)
	//*  19   51:aload           4
	//*  20   53:ifnonnull       63
			s = "text";
	//   21   56:ldc1            #78  <String "text">
	//   22   58:astore          5
		else
	//*  23   60:goto            70
			s = zzgj.zzc(((zzp) (obj)));
	//   24   63:aload           4
	//   25   65:invokestatic    #76  <Method String zzgj.zzc(zzp)>
	//   26   68:astore          5
		obj = ((Object) ((zzp)map.get(((Object) (zzbci)))));
	//   27   70:aload_1         
	//   28   71:getstatic       #48  <Field String zzbci>
	//   29   74:invokeinterface #65  <Method Object Map.get(Object)>
	//   30   79:checkcast       #67  <Class zzp>
	//   31   82:astore          4
		if(obj == null)
	//*  32   84:aload           4
	//*  33   86:ifnonnull       96
			obj = "base16";
	//   34   89:ldc1            #80  <String "base16">
	//   35   91:astore          4
		else
	//*  36   93:goto            103
			obj = ((Object) (zzgj.zzc(((zzp) (obj)))));
	//   37   96:aload           4
	//   38   98:invokestatic    #76  <Method String zzgj.zzc(zzp)>
	//   39  101:astore          4
		byte byte1 = 2;
	//   40  103:iconst_2        
	//   41  104:istore_3        
		map = ((Map) ((zzp)map.get(((Object) (zzbcg)))));
	//   42  105:aload_1         
	//   43  106:getstatic       #38  <Field String zzbcg>
	//   44  109:invokeinterface #65  <Method Object Map.get(Object)>
	//   45  114:checkcast       #67  <Class zzp>
	//   46  117:astore_1        
		byte0 = byte1;
	//   47  118:iload_3         
	//   48  119:istore_2        
		if(map != null)
	//*  49  120:aload_1         
	//*  50  121:ifnull          138
		{
			byte0 = byte1;
	//   51  124:iload_3         
	//   52  125:istore_2        
			if(zzgj.zzg(((zzp) (map))).booleanValue())
	//*  53  126:aload_1         
	//*  54  127:invokestatic    #84  <Method Boolean zzgj.zzg(zzp)>
	//*  55  130:invokevirtual   #90  <Method boolean Boolean.booleanValue()>
	//*  56  133:ifeq            138
				byte0 = 3;
	//   57  136:iconst_3        
	//   58  137:istore_2        
		}
		if(!"text".equals(((Object) (s)))) goto _L4; else goto _L3
	//   59  138:ldc1            #78  <String "text">
	//   60  140:aload           5
	//   61  142:invokevirtual   #94  <Method boolean String.equals(Object)>
	//   62  145:ifeq            157
_L3:
		map = ((Map) (s1.getBytes()));
	//   63  148:aload           6
	//   64  150:invokevirtual   #98  <Method byte[] String.getBytes()>
	//   65  153:astore_1        
		  goto _L5
	//*  66  154:goto            216
_L4:
		if(!"base16".equals(((Object) (s)))) goto _L7; else goto _L6
	//   67  157:ldc1            #80  <String "base16">
	//   68  159:aload           5
	//   69  161:invokevirtual   #94  <Method boolean String.equals(Object)>
	//   70  164:ifeq            176
_L6:
		map = ((Map) (zzo.decode(s1)));
	//   71  167:aload           6
	//   72  169:invokestatic    #104 <Method byte[] zzo.decode(String)>
	//   73  172:astore_1        
		  goto _L5
	//*  74  173:goto            216
_L7:
		if(!"base64".equals(((Object) (s)))) goto _L9; else goto _L8
	//   75  176:ldc1            #106 <String "base64">
	//   76  178:aload           5
	//   77  180:invokevirtual   #94  <Method boolean String.equals(Object)>
	//   78  183:ifeq            196
_L8:
		map = ((Map) (Base64.decode(s1, ((int) (byte0)))));
	//   79  186:aload           6
	//   80  188:iload_2         
	//   81  189:invokestatic    #111 <Method byte[] Base64.decode(String, int)>
	//   82  192:astore_1        
		  goto _L5
	//*  83  193:goto            216
_L9:
		if(!"base64url".equals(((Object) (s)))) goto _L11; else goto _L10
	//   84  196:ldc1            #113 <String "base64url">
	//   85  198:aload           5
	//   86  200:invokevirtual   #94  <Method boolean String.equals(Object)>
	//   87  203:ifeq            318
_L10:
		map = ((Map) (Base64.decode(s1, byte0 | 8)));
	//   88  206:aload           6
	//   89  208:iload_2         
	//   90  209:bipush          8
	//   91  211:ior             
	//   92  212:invokestatic    #111 <Method byte[] Base64.decode(String, int)>
	//   93  215:astore_1        
_L5:
label0:
		{
			if("base16".equals(obj))
	//*  94  216:ldc1            #80  <String "base16">
	//*  95  218:aload           4
	//*  96  220:invokevirtual   #94  <Method boolean String.equals(Object)>
	//*  97  223:ifeq            234
				map = ((Map) (zzo.encode(((byte []) (map)))));
	//   98  226:aload_1         
	//   99  227:invokestatic    #117 <Method String zzo.encode(byte[])>
	//  100  230:astore_1        
			else
	//* 101  231:goto            272
			if("base64".equals(obj))
	//* 102  234:ldc1            #106 <String "base64">
	//* 103  236:aload           4
	//* 104  238:invokevirtual   #94  <Method boolean String.equals(Object)>
	//* 105  241:ifeq            253
			{
				map = ((Map) (Base64.encodeToString(((byte []) (map)), ((int) (byte0)))));
	//  106  244:aload_1         
	//  107  245:iload_2         
	//  108  246:invokestatic    #121 <Method String Base64.encodeToString(byte[], int)>
	//  109  249:astore_1        
			} else
	//* 110  250:goto            272
			{
				if(!"base64url".equals(obj))
					break label0;
	//  111  253:ldc1            #113 <String "base64url">
	//  112  255:aload           4
	//  113  257:invokevirtual   #94  <Method boolean String.equals(Object)>
	//  114  260:ifeq            277
				map = ((Map) (Base64.encodeToString(((byte []) (map)), byte0 | 8)));
	//  115  263:aload_1         
	//  116  264:iload_2         
	//  117  265:bipush          8
	//  118  267:ior             
	//  119  268:invokestatic    #121 <Method String Base64.encodeToString(byte[], int)>
	//  120  271:astore_1        
			}
			return zzgj.zzj(((Object) (map)));
	//  121  272:aload_1         
	//  122  273:invokestatic    #125 <Method zzp zzgj.zzj(Object)>
	//  123  276:areturn         
		}
		map = ((Map) (String.valueOf(obj)));
	//  124  277:aload           4
	//  125  279:invokestatic    #129 <Method String String.valueOf(Object)>
	//  126  282:astore_1        
		if(((String) (map)).length() != 0)
	//* 127  283:aload_1         
	//* 128  284:invokevirtual   #133 <Method int String.length()>
	//* 129  287:ifeq            300
			map = ((Map) ("Encode: unknown output format: ".concat(((String) (map)))));
	//  130  290:ldc1            #135 <String "Encode: unknown output format: ">
	//  131  292:aload_1         
	//  132  293:invokevirtual   #139 <Method String String.concat(String)>
	//  133  296:astore_1        
		else
	//* 134  297:goto            310
			map = ((Map) (new String("Encode: unknown output format: ")));
	//  135  300:new             #52  <Class String>
	//  136  303:dup             
	//  137  304:ldc1            #135 <String "Encode: unknown output format: ">
	//  138  306:invokespecial   #142 <Method void String(String)>
	//  139  309:astore_1        
_L12:
		zzdi.e(((String) (map)));
	//  140  310:aload_1         
	//  141  311:invokestatic    #147 <Method void zzdi.e(String)>
		return zzgj.zzqq();
	//  142  314:invokestatic    #73  <Method zzp zzgj.zzqq()>
	//  143  317:areturn         
_L11:
		map = ((Map) (String.valueOf(((Object) (s)))));
	//  144  318:aload           5
	//  145  320:invokestatic    #129 <Method String String.valueOf(Object)>
	//  146  323:astore_1        
		if(((String) (map)).length() != 0)
	//* 147  324:aload_1         
	//* 148  325:invokevirtual   #133 <Method int String.length()>
	//* 149  328:ifeq            341
		{
			map = ((Map) ("Encode: unknown input format: ".concat(((String) (map)))));
	//  150  331:ldc1            #149 <String "Encode: unknown input format: ">
	//  151  333:aload_1         
	//  152  334:invokevirtual   #139 <Method String String.concat(String)>
	//  153  337:astore_1        
			break MISSING_BLOCK_LABEL_351;
	//  154  338:goto            351
		}
		map = ((Map) (new String("Encode: unknown input format: ")));
	//  155  341:new             #52  <Class String>
	//  156  344:dup             
	//  157  345:ldc1            #149 <String "Encode: unknown input format: ">
	//  158  347:invokespecial   #142 <Method void String(String)>
	//  159  350:astore_1        
		zzdi.e(((String) (map)));
	//  160  351:aload_1         
	//  161  352:invokestatic    #147 <Method void zzdi.e(String)>
		map = ((Map) (zzgj.zzqq()));
	//  162  355:invokestatic    #73  <Method zzp zzgj.zzqq()>
	//  163  358:astore_1        
		return ((zzp) (map));
	//  164  359:aload_1         
	//  165  360:areturn         
_L13:
		map = "Encode: invalid input:";
	//  166  361:ldc1            #151 <String "Encode: invalid input:">
	//  167  363:astore_1        
		if(true) goto _L12; else goto _L1
	//  168  364:goto            310
_L1:
		return zzgj.zzqq();
	//  169  367:invokestatic    #73  <Method zzp zzgj.zzqq()>
	//  170  370:areturn         
		map;
	//  171  371:astore_1        
		  goto _L13
	//* 172  372:goto            361
	}

	public final boolean zznk()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final String ID;
	private static final String zzbcf;
	private static final String zzbcg;
	private static final String zzbch;
	private static final String zzbci;

	static 
	{
		ID = zza.zzaj.toString();
	//    0    0:getstatic       #18  <Field zza zza.zzaj>
	//    1    3:invokevirtual   #22  <Method String zza.toString()>
	//    2    6:putstatic       #24  <Field String ID>
		zzbcf = zzb.zzef.toString();
	//    3    9:getstatic       #30  <Field zzb zzb.zzef>
	//    4   12:invokevirtual   #31  <Method String zzb.toString()>
	//    5   15:putstatic       #33  <Field String zzbcf>
		zzbcg = zzb.zzjr.toString();
	//    6   18:getstatic       #36  <Field zzb zzb.zzjr>
	//    7   21:invokevirtual   #31  <Method String zzb.toString()>
	//    8   24:putstatic       #38  <Field String zzbcg>
		zzbch = zzb.zzik.toString();
	//    9   27:getstatic       #41  <Field zzb zzb.zzik>
	//   10   30:invokevirtual   #31  <Method String zzb.toString()>
	//   11   33:putstatic       #43  <Field String zzbch>
		zzbci = zzb.zzkb.toString();
	//   12   36:getstatic       #46  <Field zzb zzb.zzkb>
	//   13   39:invokevirtual   #31  <Method String zzb.toString()>
	//   14   42:putstatic       #48  <Field String zzbci>
	//*  15   45:return          
	}
}
