// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzapw, zznk, zzkb, zzni, 
//			zzarl, zzakb, zzajm

public final class zzaqd
	implements zzv
{

	public zzaqd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public final void zza(Object obj, Map map)
	{
		zzapw zzapw1;
		zzapw1 = (zzapw)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzapw>
	//    2    4:astore          9
		obj = ((Object) (zznk.zzbae));
	//    3    6:getstatic       #27  <Field zzna zznk.zzbae>
	//    4    9:astore_1        
		if(!((Boolean)zzkb.zzik().zzd(((zzna) (obj)))).booleanValue()) goto _L2; else goto _L1
	//    5   10:invokestatic    #33  <Method zzni zzkb.zzik()>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #39  <Method Object zzni.zzd(zzna)>
	//    8   17:checkcast       #41  <Class Boolean>
	//    9   20:invokevirtual   #45  <Method boolean Boolean.booleanValue()>
	//   10   23:ifeq            306
_L1:
		zzarl zzarl1 = zzapw1.zztm();
	//   11   26:aload           9
	//   12   28:invokeinterface #49  <Method zzarl zzapw.zztm()>
	//   13   33:astore          8
		obj = ((Object) (zzarl1));
	//   14   35:aload           8
	//   15   37:astore_1        
		if(zzarl1 != null)
			break MISSING_BLOCK_LABEL_104;
	//   16   38:aload           8
	//   17   40:ifnonnull       104
		obj = ((Object) (new zzarl(zzapw1, Float.parseFloat((String)map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")))));
	//   18   43:new             #51  <Class zzarl>
	//   19   46:dup             
	//   20   47:aload           9
	//   21   49:aload_2         
	//   22   50:ldc1            #53  <String "duration">
	//   23   52:invokeinterface #59  <Method Object Map.get(Object)>
	//   24   57:checkcast       #61  <Class String>
	//   25   60:invokestatic    #67  <Method float Float.parseFloat(String)>
	//   26   63:ldc1            #69  <String "1">
	//   27   65:aload_2         
	//   28   66:ldc1            #71  <String "customControlsAllowed">
	//   29   68:invokeinterface #59  <Method Object Map.get(Object)>
	//   30   73:invokevirtual   #75  <Method boolean String.equals(Object)>
	//   31   76:ldc1            #69  <String "1">
	//   32   78:aload_2         
	//   33   79:ldc1            #77  <String "clickToExpandAllowed">
	//   34   81:invokeinterface #59  <Method Object Map.get(Object)>
	//   35   86:invokevirtual   #75  <Method boolean String.equals(Object)>
	//   36   89:invokespecial   #80  <Method void zzarl(zzapw, float, boolean, boolean)>
	//   37   92:astore_1        
		zzapw1.zza(((zzarl) (obj)));
	//   38   93:aload           9
	//   39   95:aload_1         
	//   40   96:invokeinterface #83  <Method void zzapw.zza(zzarl)>
	//*  41  101:goto            104
		float f1;
		int j;
		boolean flag;
		flag = "1".equals(map.get("muted"));
	//   42  104:ldc1            #69  <String "1">
	//   43  106:aload_2         
	//   44  107:ldc1            #85  <String "muted">
	//   45  109:invokeinterface #59  <Method Object Map.get(Object)>
	//   46  114:invokevirtual   #75  <Method boolean String.equals(Object)>
	//   47  117:istore          7
		f1 = Float.parseFloat((String)map.get("currentTime"));
	//   48  119:aload_2         
	//   49  120:ldc1            #87  <String "currentTime">
	//   50  122:invokeinterface #59  <Method Object Map.get(Object)>
	//   51  127:checkcast       #61  <Class String>
	//   52  130:invokestatic    #67  <Method float Float.parseFloat(String)>
	//   53  133:fstore          4
		j = Integer.parseInt((String)map.get("playbackState"));
	//   54  135:aload_2         
	//   55  136:ldc1            #89  <String "playbackState">
	//   56  138:invokeinterface #59  <Method Object Map.get(Object)>
	//   57  143:checkcast       #61  <Class String>
	//   58  146:invokestatic    #95  <Method int Integer.parseInt(String)>
	//   59  149:istore          6
		if(j < 0) goto _L4; else goto _L3
	//   60  151:iload           6
	//   61  153:iflt            311
_L3:
		int i = j;
	//   62  156:iload           6
	//   63  158:istore          5
		if(3 >= j) goto _L5; else goto _L4
	//   64  160:iconst_3        
	//   65  161:iload           6
	//   66  163:icmpge          169
	//*  67  166:goto            311
_L5:
		map = ((Map) ((String)map.get("aspectRatio")));
	//   68  169:aload_2         
	//   69  170:ldc1            #97  <String "aspectRatio">
	//   70  172:invokeinterface #59  <Method Object Map.get(Object)>
	//   71  177:checkcast       #61  <Class String>
	//   72  180:astore_2        
		float f;
		if(TextUtils.isEmpty(((CharSequence) (map))))
	//*  73  181:aload_2         
	//*  74  182:invokestatic    #103 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  75  185:ifeq            193
		{
			f = 0.0F;
	//   76  188:fconst_0        
	//   77  189:fstore_3        
			break MISSING_BLOCK_LABEL_198;
	//   78  190:goto            198
		}
		f = Float.parseFloat(((String) (map)));
	//   79  193:aload_2         
	//   80  194:invokestatic    #67  <Method float Float.parseFloat(String)>
	//   81  197:fstore_3        
		if(zzakb.isLoggable(3))
	//*  82  198:iconst_3        
	//*  83  199:invokestatic    #109 <Method boolean zzakb.isLoggable(int)>
	//*  84  202:ifeq            279
		{
			StringBuilder stringbuilder = new StringBuilder(79 + String.valueOf(((Object) (map))).length());
	//   85  205:new             #111 <Class StringBuilder>
	//   86  208:dup             
	//   87  209:bipush          79
	//   88  211:aload_2         
	//   89  212:invokestatic    #115 <Method String String.valueOf(Object)>
	//   90  215:invokevirtual   #119 <Method int String.length()>
	//   91  218:iadd            
	//   92  219:invokespecial   #122 <Method void StringBuilder(int)>
	//   93  222:astore          8
			stringbuilder.append("Video Meta GMSG: isMuted : ");
	//   94  224:aload           8
	//   95  226:ldc1            #124 <String "Video Meta GMSG: isMuted : ">
	//   96  228:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   97  231:pop             
			stringbuilder.append(flag);
	//   98  232:aload           8
	//   99  234:iload           7
	//  100  236:invokevirtual   #131 <Method StringBuilder StringBuilder.append(boolean)>
	//  101  239:pop             
			stringbuilder.append(" , playbackState : ");
	//  102  240:aload           8
	//  103  242:ldc1            #133 <String " , playbackState : ">
	//  104  244:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//  105  247:pop             
			stringbuilder.append(i);
	//  106  248:aload           8
	//  107  250:iload           5
	//  108  252:invokevirtual   #136 <Method StringBuilder StringBuilder.append(int)>
	//  109  255:pop             
			stringbuilder.append(" , aspectRatio : ");
	//  110  256:aload           8
	//  111  258:ldc1            #138 <String " , aspectRatio : ">
	//  112  260:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//  113  263:pop             
			stringbuilder.append(((String) (map)));
	//  114  264:aload           8
	//  115  266:aload_2         
	//  116  267:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//  117  270:pop             
			zzakb.zzck(stringbuilder.toString());
	//  118  271:aload           8
	//  119  273:invokevirtual   #142 <Method String StringBuilder.toString()>
	//  120  276:invokestatic    #146 <Method void zzakb.zzck(String)>
		}
		((zzarl) (obj)).zza(f1, i, flag, f);
	//  121  279:aload_1         
	//  122  280:fload           4
	//  123  282:iload           5
	//  124  284:iload           7
	//  125  286:fload_3         
	//  126  287:invokevirtual   #149 <Method void zzarl.zza(float, int, boolean, float)>
		return;
	//  127  290:return          
_L6:
		zzakb.zzb("Unable to parse videoMeta message.", ((Throwable) (obj)));
	//  128  291:ldc1            #151 <String "Unable to parse videoMeta message.">
	//  129  293:aload_1         
	//  130  294:invokestatic    #155 <Method void zzakb.zzb(String, Throwable)>
		zzbv.zzeo().zza(((Throwable) (obj)), "VideoMetaGmsgHandler.onGmsg");
	//  131  297:invokestatic    #161 <Method zzajm zzbv.zzeo()>
	//  132  300:aload_1         
	//  133  301:ldc1            #163 <String "VideoMetaGmsgHandler.onGmsg">
	//  134  303:invokevirtual   #168 <Method void zzajm.zza(Throwable, String)>
_L2:
		return;
	//  135  306:return          
		obj;
	//  136  307:astore_1        
		if(true) goto _L6; else goto _L4
	//  137  308:goto            291
_L4:
		i = 0;
	//  138  311:iconst_0        
	//  139  312:istore          5
		if(true) goto _L5; else goto _L7
	//  140  314:goto            169
_L7:
	}
}
