// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.*;
import java.io.UnsupportedEncodingException;
import java.util.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq, zzcy, zzgn, zzdi, 
//			zzgj, zzcz

final class zzcx extends zzbq
{

	public zzcx()
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

	private static String zza(String s, int i, Set set)
	{
		switch(zzcy.zzbdb[i - 1])
	//*   0    0:getstatic       #65  <Field int[] zzcy.zzbdb>
	//*   1    3:iload_1         
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:iaload          
		{
	//*   5    7:tableswitch     1 2: default 28
	//	               1 115
	//	               2 30
		default:
			return s;
	//    6   28:aload_0         
	//    7   29:areturn         

		case 2: // '\002'
			s = s.replace("\\", "\\\\");
	//    8   30:aload_0         
	//    9   31:ldc1            #67  <String "\\">
	//   10   33:ldc1            #69  <String "\\\\">
	//   11   35:invokevirtual   #73  <Method String String.replace(CharSequence, CharSequence)>
	//   12   38:astore_0        
			for(Iterator iterator = set.iterator(); iterator.hasNext();)
	//*  13   39:aload_2         
	//*  14   40:invokeinterface #79  <Method Iterator Set.iterator()>
	//*  15   45:astore_3        
	//*  16   46:aload_3         
	//*  17   47:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//*  18   52:ifeq            113
			{
				String s1 = ((Character)iterator.next()).toString();
	//   19   55:aload_3         
	//   20   56:invokeinterface #89  <Method Object Iterator.next()>
	//   21   61:checkcast       #91  <Class Character>
	//   22   64:invokevirtual   #92  <Method String Character.toString()>
	//   23   67:astore          4
				set = ((Set) (String.valueOf(((Object) (s1)))));
	//   24   69:aload           4
	//   25   71:invokestatic    #96  <Method String String.valueOf(Object)>
	//   26   74:astore_2        
				if(((String) (set)).length() != 0)
	//*  27   75:aload_2         
	//*  28   76:invokevirtual   #100 <Method int String.length()>
	//*  29   79:ifeq            92
					set = ((Set) ("\\".concat(((String) (set)))));
	//   30   82:ldc1            #67  <String "\\">
	//   31   84:aload_2         
	//   32   85:invokevirtual   #104 <Method String String.concat(String)>
	//   33   88:astore_2        
				else
	//*  34   89:goto            102
					set = ((Set) (new String("\\")));
	//   35   92:new             #52  <Class String>
	//   36   95:dup             
	//   37   96:ldc1            #67  <String "\\">
	//   38   98:invokespecial   #107 <Method void String(String)>
	//   39  101:astore_2        
				s = s.replace(((CharSequence) (s1)), ((CharSequence) (set)));
	//   40  102:aload_0         
	//   41  103:aload           4
	//   42  105:aload_2         
	//   43  106:invokevirtual   #73  <Method String String.replace(CharSequence, CharSequence)>
	//   44  109:astore_0        
			}

	//*  45  110:goto            46
			return s;
	//   46  113:aload_0         
	//   47  114:areturn         

		case 1: // '\001'
			break;
		}
		try
		{
			set = ((Set) (zzgn.zzei(s)));
	//   48  115:aload_0         
	//   49  116:invokestatic    #112 <Method String zzgn.zzei(String)>
	//   50  119:astore_2        
		}
	//*  51  120:aload_2         
	//*  52  121:areturn         
		// Misplaced declaration of an exception variable
		catch(Set set)
	//*  53  122:astore_2        
		{
			com.google.android.gms.tagmanager.zzdi.zza("Joiner: unsupported encoding", ((Throwable) (set)));
	//   54  123:ldc1            #114 <String "Joiner: unsupported encoding">
	//   55  125:aload_2         
	//   56  126:invokestatic    #119 <Method void com.google.android.gms.tagmanager.zzdi.zza(String, Throwable)>
			return s;
	//   57  129:aload_0         
	//   58  130:areturn         
		}
		return ((String) (set));
	}

	private static void zza(StringBuilder stringbuilder, String s, int i, Set set)
	{
		stringbuilder.append(zza(s, i, set));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #124 <Method String zza(String, int, Set)>
	//    5    7:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//    6   10:pop             
	//    7   11:return          
	}

	private static void zza(Set set, String s)
	{
		for(int i = 0; i < s.length(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:invokevirtual   #100 <Method int String.length()>
	//*   5    7:icmpge          32
			set.add(((Object) (Character.valueOf(s.charAt(i)))));
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iload_2         
	//    9   13:invokevirtual   #136 <Method char String.charAt(int)>
	//   10   16:invokestatic    #139 <Method Character Character.valueOf(char)>
	//   11   19:invokeinterface #143 <Method boolean Set.add(Object)>
	//   12   24:pop             

	//   13   25:iload_2         
	//   14   26:iconst_1        
	//   15   27:iadd            
	//   16   28:istore_2        
	//*  17   29:goto            2
	//   18   32:return          
	}

	public final zzp zzc(Map map)
	{
		zzp zzp1 = (zzp)map.get(((Object) (zzbcf)));
	//    0    0:aload_1         
	//    1    1:getstatic       #33  <Field String zzbcf>
	//    2    4:invokeinterface #152 <Method Object Map.get(Object)>
	//    3    9:checkcast       #154 <Class zzp>
	//    4   12:astore          9
		if(zzp1 == null)
	//*   5   14:aload           9
	//*   6   16:ifnonnull       23
			return zzgj.zzqq();
	//    7   19:invokestatic    #160 <Method zzp zzgj.zzqq()>
	//    8   22:areturn         
		Object obj = ((Object) ((zzp)map.get(((Object) (zzbcy)))));
	//    9   23:aload_1         
	//   10   24:getstatic       #38  <Field String zzbcy>
	//   11   27:invokeinterface #152 <Method Object Map.get(Object)>
	//   12   32:checkcast       #154 <Class zzp>
	//   13   35:astore          6
		if(obj != null)
	//*  14   37:aload           6
	//*  15   39:ifnull          52
			obj = ((Object) (zzgj.zzc(((zzp) (obj)))));
	//   16   42:aload           6
	//   17   44:invokestatic    #163 <Method String zzgj.zzc(zzp)>
	//   18   47:astore          6
		else
	//*  19   49:goto            56
			obj = "";
	//   20   52:ldc1            #165 <String "">
	//   21   54:astore          6
		Object obj1 = ((Object) ((zzp)map.get(((Object) (zzbcz)))));
	//   22   56:aload_1         
	//   23   57:getstatic       #43  <Field String zzbcz>
	//   24   60:invokeinterface #152 <Method Object Map.get(Object)>
	//   25   65:checkcast       #154 <Class zzp>
	//   26   68:astore          7
		if(obj1 != null)
	//*  27   70:aload           7
	//*  28   72:ifnull          85
			obj1 = ((Object) (zzgj.zzc(((zzp) (obj1)))));
	//   29   75:aload           7
	//   30   77:invokestatic    #163 <Method String zzgj.zzc(zzp)>
	//   31   80:astore          7
		else
	//*  32   82:goto            89
			obj1 = "=";
	//   33   85:ldc1            #167 <String "=">
	//   34   87:astore          7
		int i = zzcz.zzbdc;
	//   35   89:getstatic       #173 <Field int zzcz.zzbdc>
	//   36   92:istore_2        
		zzp zzp3 = (zzp)map.get(((Object) (zzbda)));
	//   37   93:aload_1         
	//   38   94:getstatic       #48  <Field String zzbda>
	//   39   97:invokeinterface #152 <Method Object Map.get(Object)>
	//   40  102:checkcast       #154 <Class zzp>
	//   41  105:astore          10
		StringBuilder stringbuilder = null;
	//   42  107:aconst_null     
	//   43  108:astore          8
		map = ((Map) (stringbuilder));
	//   44  110:aload           8
	//   45  112:astore_1        
		if(zzp3 != null)
	//*  46  113:aload           10
	//*  47  115:ifnull          231
		{
			map = ((Map) (zzgj.zzc(zzp3)));
	//   48  118:aload           10
	//   49  120:invokestatic    #163 <Method String zzgj.zzc(zzp)>
	//   50  123:astore_1        
			if("url".equals(((Object) (map))))
	//*  51  124:ldc1            #175 <String "url">
	//*  52  126:aload_1         
	//*  53  127:invokevirtual   #178 <Method boolean String.equals(Object)>
	//*  54  130:ifeq            143
			{
				i = zzcz.zzbdd;
	//   55  133:getstatic       #181 <Field int zzcz.zzbdd>
	//   56  136:istore_2        
				map = ((Map) (stringbuilder));
	//   57  137:aload           8
	//   58  139:astore_1        
			} else
	//*  59  140:goto            231
			if("backslash".equals(((Object) (map))))
	//*  60  143:ldc1            #183 <String "backslash">
	//*  61  145:aload_1         
	//*  62  146:invokevirtual   #178 <Method boolean String.equals(Object)>
	//*  63  149:ifeq            191
			{
				i = zzcz.zzbde;
	//   64  152:getstatic       #186 <Field int zzcz.zzbde>
	//   65  155:istore_2        
				map = ((Map) (new HashSet()));
	//   66  156:new             #188 <Class HashSet>
	//   67  159:dup             
	//   68  160:invokespecial   #190 <Method void HashSet()>
	//   69  163:astore_1        
				zza(((Set) (map)), ((String) (obj)));
	//   70  164:aload_1         
	//   71  165:aload           6
	//   72  167:invokestatic    #192 <Method void zza(Set, String)>
				zza(((Set) (map)), ((String) (obj1)));
	//   73  170:aload_1         
	//   74  171:aload           7
	//   75  173:invokestatic    #192 <Method void zza(Set, String)>
				((Set) (map)).remove(((Object) (Character.valueOf('\\'))));
	//   76  176:aload_1         
	//   77  177:bipush          92
	//   78  179:invokestatic    #139 <Method Character Character.valueOf(char)>
	//   79  182:invokeinterface #195 <Method boolean Set.remove(Object)>
	//   80  187:pop             
			} else
	//*  81  188:goto            231
			{
				map = ((Map) (String.valueOf(((Object) (map)))));
	//   82  191:aload_1         
	//   83  192:invokestatic    #96  <Method String String.valueOf(Object)>
	//   84  195:astore_1        
				if(((String) (map)).length() != 0)
	//*  85  196:aload_1         
	//*  86  197:invokevirtual   #100 <Method int String.length()>
	//*  87  200:ifeq            213
					map = ((Map) ("Joiner: unsupported escape type: ".concat(((String) (map)))));
	//   88  203:ldc1            #197 <String "Joiner: unsupported escape type: ">
	//   89  205:aload_1         
	//   90  206:invokevirtual   #104 <Method String String.concat(String)>
	//   91  209:astore_1        
				else
	//*  92  210:goto            223
					map = ((Map) (new String("Joiner: unsupported escape type: ")));
	//   93  213:new             #52  <Class String>
	//   94  216:dup             
	//   95  217:ldc1            #197 <String "Joiner: unsupported escape type: ">
	//   96  219:invokespecial   #107 <Method void String(String)>
	//   97  222:astore_1        
				zzdi.e(((String) (map)));
	//   98  223:aload_1         
	//   99  224:invokestatic    #200 <Method void zzdi.e(String)>
				return zzgj.zzqq();
	//  100  227:invokestatic    #160 <Method zzp zzgj.zzqq()>
	//  101  230:areturn         
			}
		}
		stringbuilder = new StringBuilder();
	//  102  231:new             #126 <Class StringBuilder>
	//  103  234:dup             
	//  104  235:invokespecial   #201 <Method void StringBuilder()>
	//  105  238:astore          8
		int l = zzp1.type;
	//  106  240:aload           9
	//  107  242:getfield        #204 <Field int zzp.type>
	//  108  245:istore          4
		int j = 0;
	//  109  247:iconst_0        
	//  110  248:istore_3        
label0:
		switch(l)
	//* 111  249:iload           4
		{
	//* 112  251:tableswitch     2 3: default 272
	//	               2 366
	//	               3 287
		default:
			zza(stringbuilder, zzgj.zzc(zzp1), i, ((Set) (map)));
	//  113  272:aload           8
	//  114  274:aload           9
	//  115  276:invokestatic    #163 <Method String zzgj.zzc(zzp)>
	//  116  279:iload_2         
	//  117  280:aload_1         
	//  118  281:invokestatic    #206 <Method void zza(StringBuilder, String, int, Set)>
			break;
	//  119  284:goto            430

		case 3: // '\003'
			do
			{
				if(j >= zzp1.zzqk.length)
					break label0;
	//  120  287:iload_3         
	//  121  288:aload           9
	//  122  290:getfield        #210 <Field zzp[] zzp.zzqk>
	//  123  293:arraylength     
	//  124  294:icmpge          430
				if(j > 0)
	//* 125  297:iload_3         
	//* 126  298:ifle            309
					stringbuilder.append(((String) (obj)));
	//  127  301:aload           8
	//  128  303:aload           6
	//  129  305:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//  130  308:pop             
				String s = zzgj.zzc(zzp1.zzqk[j]);
	//  131  309:aload           9
	//  132  311:getfield        #210 <Field zzp[] zzp.zzqk>
	//  133  314:iload_3         
	//  134  315:aaload          
	//  135  316:invokestatic    #163 <Method String zzgj.zzc(zzp)>
	//  136  319:astore          10
				String s1 = zzgj.zzc(zzp1.zzql[j]);
	//  137  321:aload           9
	//  138  323:getfield        #213 <Field zzp[] zzp.zzql>
	//  139  326:iload_3         
	//  140  327:aaload          
	//  141  328:invokestatic    #163 <Method String zzgj.zzc(zzp)>
	//  142  331:astore          11
				zza(stringbuilder, s, i, ((Set) (map)));
	//  143  333:aload           8
	//  144  335:aload           10
	//  145  337:iload_2         
	//  146  338:aload_1         
	//  147  339:invokestatic    #206 <Method void zza(StringBuilder, String, int, Set)>
				stringbuilder.append(((String) (obj1)));
	//  148  342:aload           8
	//  149  344:aload           7
	//  150  346:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//  151  349:pop             
				zza(stringbuilder, s1, i, ((Set) (map)));
	//  152  350:aload           8
	//  153  352:aload           11
	//  154  354:iload_2         
	//  155  355:aload_1         
	//  156  356:invokestatic    #206 <Method void zza(StringBuilder, String, int, Set)>
				j++;
	//  157  359:iload_3         
	//  158  360:iconst_1        
	//  159  361:iadd            
	//  160  362:istore_3        
			} while(true);
	//  161  363:goto            287

		case 2: // '\002'
			zzp azzp[] = zzp1.zzqj;
	//  162  366:aload           9
	//  163  368:getfield        #216 <Field zzp[] zzp.zzqj>
	//  164  371:astore          7
			int i1 = azzp.length;
	//  165  373:aload           7
	//  166  375:arraylength     
	//  167  376:istore          5
			int k = 0;
	//  168  378:iconst_0        
	//  169  379:istore_3        
			boolean flag = true;
	//  170  380:iconst_1        
	//  171  381:istore          4
			do
			{
				if(k >= i1)
					break label0;
	//  172  383:iload_3         
	//  173  384:iload           5
	//  174  386:icmpge          430
				zzp zzp2 = azzp[k];
	//  175  389:aload           7
	//  176  391:iload_3         
	//  177  392:aaload          
	//  178  393:astore          9
				if(!flag)
	//* 179  395:iload           4
	//* 180  397:ifne            408
					stringbuilder.append(((String) (obj)));
	//  181  400:aload           8
	//  182  402:aload           6
	//  183  404:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//  184  407:pop             
				zza(stringbuilder, zzgj.zzc(zzp2), i, ((Set) (map)));
	//  185  408:aload           8
	//  186  410:aload           9
	//  187  412:invokestatic    #163 <Method String zzgj.zzc(zzp)>
	//  188  415:iload_2         
	//  189  416:aload_1         
	//  190  417:invokestatic    #206 <Method void zza(StringBuilder, String, int, Set)>
				k++;
	//  191  420:iload_3         
	//  192  421:iconst_1        
	//  193  422:iadd            
	//  194  423:istore_3        
				flag = false;
	//  195  424:iconst_0        
	//  196  425:istore          4
			} while(true);
	//  197  427:goto            383
		}
		return zzgj.zzj(((Object) (stringbuilder.toString())));
	//  198  430:aload           8
	//  199  432:invokevirtual   #217 <Method String StringBuilder.toString()>
	//  200  435:invokestatic    #221 <Method zzp zzgj.zzj(Object)>
	//  201  438:areturn         
	}

	public final boolean zznk()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final String ID;
	private static final String zzbcf;
	private static final String zzbcy;
	private static final String zzbcz;
	private static final String zzbda;

	static 
	{
		ID = zza.zzan.toString();
	//    0    0:getstatic       #18  <Field zza zza.zzan>
	//    1    3:invokevirtual   #22  <Method String zza.toString()>
	//    2    6:putstatic       #24  <Field String ID>
		zzbcf = zzb.zzef.toString();
	//    3    9:getstatic       #30  <Field zzb zzb.zzef>
	//    4   12:invokevirtual   #31  <Method String zzb.toString()>
	//    5   15:putstatic       #33  <Field String zzbcf>
		zzbcy = zzb.zzip.toString();
	//    6   18:getstatic       #36  <Field zzb zzb.zzip>
	//    7   21:invokevirtual   #31  <Method String zzb.toString()>
	//    8   24:putstatic       #38  <Field String zzbcy>
		zzbcz = zzb.zzit.toString();
	//    9   27:getstatic       #41  <Field zzb zzb.zzit>
	//   10   30:invokevirtual   #31  <Method String zzb.toString()>
	//   11   33:putstatic       #43  <Field String zzbcz>
		zzbda = zzb.zzhj.toString();
	//   12   36:getstatic       #46  <Field zzb zzb.zzhj>
	//   13   39:invokevirtual   #31  <Method String zzb.toString()>
	//   14   42:putstatic       #48  <Field String zzbda>
	//*  15   45:return          
	}
}
