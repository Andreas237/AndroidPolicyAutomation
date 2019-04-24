// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.*;
import java.util.Map;
import java.util.regex.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq, zzgj

final class zzek extends zzbq
{

	public zzek()
	{
		super(ID, new String[] {
			zzbem, zzben
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #24  <Field String ID>
	//    2    4:iconst_2        
	//    3    5:anewarray       String[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #33  <Field String zzbem>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:getstatic       #38  <Field String zzben>
	//   11   19:aastore         
	//   12   20:invokespecial   #55  <Method void zzbq(String, String[])>
	//   13   23:return          
	}

	public final zzp zzc(Map map)
	{
		Object obj = ((Object) ((zzp)map.get(((Object) (zzbem)))));
	//    0    0:aload_1         
	//    1    1:getstatic       #33  <Field String zzbem>
	//    2    4:invokeinterface #65  <Method Object Map.get(Object)>
	//    3    9:checkcast       #67  <Class zzp>
	//    4   12:astore          6
		zzp zzp1 = (zzp)map.get(((Object) (zzben)));
	//    5   14:aload_1         
	//    6   15:getstatic       #38  <Field String zzben>
	//    7   18:invokeinterface #65  <Method Object Map.get(Object)>
	//    8   23:checkcast       #67  <Class zzp>
	//    9   26:astore          5
		if(obj == null || obj == zzgj.zzqq() || zzp1 == null || zzp1 == zzgj.zzqq())
	//*  10   28:aload           6
	//*  11   30:ifnull          214
	//*  12   33:aload           6
	//*  13   35:invokestatic    #73  <Method zzp zzgj.zzqq()>
	//*  14   38:if_acmpeq       214
	//*  15   41:aload           5
	//*  16   43:ifnull          214
	//*  17   46:aload           5
	//*  18   48:invokestatic    #73  <Method zzp zzgj.zzqq()>
	//*  19   51:if_acmpne       57
			break MISSING_BLOCK_LABEL_214;
	//   20   54:goto            214
		byte byte0 = 64;
	//   21   57:bipush          64
	//   22   59:istore_2        
		if(zzgj.zzg((zzp)map.get(((Object) (zzbeo)))).booleanValue())
	//*  23   60:aload_1         
	//*  24   61:getstatic       #43  <Field String zzbeo>
	//*  25   64:invokeinterface #65  <Method Object Map.get(Object)>
	//*  26   69:checkcast       #67  <Class zzp>
	//*  27   72:invokestatic    #77  <Method Boolean zzgj.zzg(zzp)>
	//*  28   75:invokevirtual   #83  <Method boolean Boolean.booleanValue()>
	//*  29   78:ifeq            84
			byte0 = 66;
	//   30   81:bipush          66
	//   31   83:istore_2        
		int i = 1;
	//   32   84:iconst_1        
	//   33   85:istore_3        
		map = ((Map) ((zzp)map.get(((Object) (zzbep)))));
	//   34   86:aload_1         
	//   35   87:getstatic       #48  <Field String zzbep>
	//   36   90:invokeinterface #65  <Method Object Map.get(Object)>
	//   37   95:checkcast       #67  <Class zzp>
	//   38   98:astore_1        
		if(map != null)
	//*  39   99:aload_1         
	//*  40  100:ifnull          137
		{
			map = ((Map) (zzgj.zze(((zzp) (map)))));
	//   41  103:aload_1         
	//   42  104:invokestatic    #87  <Method Long zzgj.zze(zzp)>
	//   43  107:astore_1        
			if(map == zzgj.zzql())
	//*  44  108:aload_1         
	//*  45  109:invokestatic    #91  <Method Long zzgj.zzql()>
	//*  46  112:if_acmpne       119
				return zzgj.zzqq();
	//   47  115:invokestatic    #73  <Method zzp zzgj.zzqq()>
	//   48  118:areturn         
			int j = ((Long) (map)).intValue();
	//   49  119:aload_1         
	//   50  120:invokevirtual   #97  <Method int Long.intValue()>
	//   51  123:istore          4
			i = j;
	//   52  125:iload           4
	//   53  127:istore_3        
			if(j < 0)
	//*  54  128:iload           4
	//*  55  130:ifge            137
				return zzgj.zzqq();
	//   56  133:invokestatic    #73  <Method zzp zzgj.zzqq()>
	//   57  136:areturn         
		}
		try
		{
			map = ((Map) (zzgj.zzc(((zzp) (obj)))));
	//   58  137:aload           6
	//   59  139:invokestatic    #100 <Method String zzgj.zzc(zzp)>
	//   60  142:astore_1        
			obj = ((Object) (zzgj.zzc(zzp1)));
	//   61  143:aload           5
	//   62  145:invokestatic    #100 <Method String zzgj.zzc(zzp)>
	//   63  148:astore          6
		}
	//*  64  150:aconst_null     
	//*  65  151:astore          5
	//*  66  153:aload           6
	//*  67  155:iload_2         
	//*  68  156:invokestatic    #106 <Method Pattern Pattern.compile(String, int)>
	//*  69  159:aload_1         
	//*  70  160:invokevirtual   #110 <Method Matcher Pattern.matcher(CharSequence)>
	//*  71  163:astore          6
	//*  72  165:aload           5
	//*  73  167:astore_1        
	//*  74  168:aload           6
	//*  75  170:invokevirtual   #115 <Method boolean Matcher.find()>
	//*  76  173:ifeq            195
	//*  77  176:aload           5
	//*  78  178:astore_1        
	//*  79  179:aload           6
	//*  80  181:invokevirtual   #118 <Method int Matcher.groupCount()>
	//*  81  184:iload_3         
	//*  82  185:icmplt          195
	//*  83  188:aload           6
	//*  84  190:iload_3         
	//*  85  191:invokevirtual   #122 <Method String Matcher.group(int)>
	//*  86  194:astore_1        
	//*  87  195:aload_1         
	//*  88  196:ifnonnull       203
	//*  89  199:invokestatic    #73  <Method zzp zzgj.zzqq()>
	//*  90  202:areturn         
	//*  91  203:aload_1         
	//*  92  204:invokestatic    #126 <Method zzp zzgj.zzj(Object)>
	//*  93  207:astore_1        
	//*  94  208:aload_1         
	//*  95  209:areturn         
	//*  96  210:invokestatic    #73  <Method zzp zzgj.zzqq()>
	//*  97  213:areturn         
	//*  98  214:invokestatic    #73  <Method zzp zzgj.zzqq()>
	//*  99  217:areturn         
		// Misplaced declaration of an exception variable
		catch(Map map)
		{
			return zzgj.zzqq();
		}
		zzp1 = null;
		obj = ((Object) (Pattern.compile(((String) (obj)), ((int) (byte0))).matcher(((CharSequence) (map)))));
		map = ((Map) (zzp1));
		if(!((Matcher) (obj)).find())
			break MISSING_BLOCK_LABEL_195;
		map = ((Map) (zzp1));
		if(((Matcher) (obj)).groupCount() >= i)
			map = ((Map) (((Matcher) (obj)).group(i)));
		if(map != null)
			break MISSING_BLOCK_LABEL_203;
		return zzgj.zzqq();
		map = ((Map) (zzgj.zzj(((Object) (map)))));
		return ((zzp) (map));
		return zzgj.zzqq();
	//* 100  218:astore_1        
	//* 101  219:goto            210
	}

	public final boolean zznk()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final String ID;
	private static final String zzbem;
	private static final String zzben;
	private static final String zzbeo;
	private static final String zzbep;

	static 
	{
		ID = zza.zzap.toString();
	//    0    0:getstatic       #18  <Field zza zza.zzap>
	//    1    3:invokevirtual   #22  <Method String zza.toString()>
	//    2    6:putstatic       #24  <Field String ID>
		zzbem = zzb.zzef.toString();
	//    3    9:getstatic       #30  <Field zzb zzb.zzef>
	//    4   12:invokevirtual   #31  <Method String zzb.toString()>
	//    5   15:putstatic       #33  <Field String zzbem>
		zzben = zzb.zzeg.toString();
	//    6   18:getstatic       #36  <Field zzb zzb.zzeg>
	//    7   21:invokevirtual   #31  <Method String zzb.toString()>
	//    8   24:putstatic       #38  <Field String zzben>
		zzbeo = zzb.zzii.toString();
	//    9   27:getstatic       #41  <Field zzb zzb.zzii>
	//   10   30:invokevirtual   #31  <Method String zzb.toString()>
	//   11   33:putstatic       #43  <Field String zzbeo>
		zzbep = zzb.zzib.toString();
	//   12   36:getstatic       #46  <Field zzb zzb.zzib>
	//   13   39:invokevirtual   #31  <Method String zzb.toString()>
	//   14   42:putstatic       #48  <Field String zzbep>
	//*  15   45:return          
	}
}
