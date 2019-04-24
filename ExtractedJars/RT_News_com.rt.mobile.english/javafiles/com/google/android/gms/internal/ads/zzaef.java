// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaeh, zzaeg, zzano, zzang, 
//			zzjn, zzpl, zzlu, zzjj

public final class zzaef extends AbstractSafeParcelable
{

	zzaef(int i, Bundle bundle, zzjj zzjj, zzjn zzjn, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, 
			String s1, String s2, String s3, zzang zzang, Bundle bundle1, int j, List list, 
			Bundle bundle2, boolean flag, int k, int l, float f, String s4, long l1, String s5, List list1, String s6, zzpl zzpl, List list2, long l2, String s7, float f1, boolean flag1, int i1, int j1, boolean flag2, 
			boolean flag3, String s8, String s9, boolean flag4, int k1, Bundle bundle3, String s10, 
			zzlu zzlu, boolean flag5, Bundle bundle4, String s11, String s12, String s13, boolean flag6, 
			List list3, String s14, List list4, int i2, boolean flag7, boolean flag8, boolean flag9, 
			ArrayList arraylist)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #157 <Method void AbstractSafeParcelable()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #159 <Field int versionCode>
		zzccu = bundle;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #161 <Field Bundle zzccu>
		zzccv = zzjj;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #163 <Field zzjj zzccv>
		zzacv = zzjn;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #165 <Field zzjn zzacv>
		zzacp = s;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #167 <Field String zzacp>
		applicationInfo = applicationinfo;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #169 <Field ApplicationInfo applicationInfo>
		zzccw = packageinfo;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #171 <Field PackageInfo zzccw>
		zzccx = s1;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #173 <Field String zzccx>
		zzccy = s2;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #175 <Field String zzccy>
		zzccz = s3;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #177 <Field String zzccz>
		zzacr = zzang;
	//   32   61:aload_0         
	//   33   62:aload           11
	//   34   64:putfield        #179 <Field zzang zzacr>
		zzcda = bundle1;
	//   35   67:aload_0         
	//   36   68:aload           12
	//   37   70:putfield        #181 <Field Bundle zzcda>
		zzcdb = j;
	//   38   73:aload_0         
	//   39   74:iload           13
	//   40   76:putfield        #183 <Field int zzcdb>
		zzads = list;
	//   41   79:aload_0         
	//   42   80:aload           14
	//   43   82:putfield        #185 <Field List zzads>
		if(list2 == null)
	//*  44   85:aload           27
	//*  45   87:ifnonnull       97
			bundle = ((Bundle) (Collections.emptyList()));
	//   46   90:invokestatic    #191 <Method List Collections.emptyList()>
	//   47   93:astore_2        
		else
	//*  48   94:goto            103
			bundle = ((Bundle) (Collections.unmodifiableList(list2)));
	//   49   97:aload           27
	//   50   99:invokestatic    #195 <Method List Collections.unmodifiableList(List)>
	//   51  102:astore_2        
		zzcdk = ((List) (bundle));
	//   52  103:aload_0         
	//   53  104:aload_2         
	//   54  105:putfield        #197 <Field List zzcdk>
		zzcdc = bundle2;
	//   55  108:aload_0         
	//   56  109:aload           15
	//   57  111:putfield        #199 <Field Bundle zzcdc>
		zzcdd = flag;
	//   58  114:aload_0         
	//   59  115:iload           16
	//   60  117:putfield        #201 <Field boolean zzcdd>
		zzcde = k;
	//   61  120:aload_0         
	//   62  121:iload           17
	//   63  123:putfield        #203 <Field int zzcde>
		zzcdf = l;
	//   64  126:aload_0         
	//   65  127:iload           18
	//   66  129:putfield        #205 <Field int zzcdf>
		zzagu = f;
	//   67  132:aload_0         
	//   68  133:fload           19
	//   69  135:putfield        #207 <Field float zzagu>
		zzcdg = s4;
	//   70  138:aload_0         
	//   71  139:aload           20
	//   72  141:putfield        #209 <Field String zzcdg>
		zzcdh = l1;
	//   73  144:aload_0         
	//   74  145:lload           21
	//   75  147:putfield        #211 <Field long zzcdh>
		zzcdi = s5;
	//   76  150:aload_0         
	//   77  151:aload           23
	//   78  153:putfield        #213 <Field String zzcdi>
		if(list1 == null)
	//*  79  156:aload           24
	//*  80  158:ifnonnull       168
			bundle = ((Bundle) (Collections.emptyList()));
	//   81  161:invokestatic    #191 <Method List Collections.emptyList()>
	//   82  164:astore_2        
		else
	//*  83  165:goto            174
			bundle = ((Bundle) (Collections.unmodifiableList(list1)));
	//   84  168:aload           24
	//   85  170:invokestatic    #195 <Method List Collections.unmodifiableList(List)>
	//   86  173:astore_2        
		zzcdj = ((List) (bundle));
	//   87  174:aload_0         
	//   88  175:aload_2         
	//   89  176:putfield        #215 <Field List zzcdj>
		zzaco = s6;
	//   90  179:aload_0         
	//   91  180:aload           25
	//   92  182:putfield        #217 <Field String zzaco>
		zzadj = zzpl;
	//   93  185:aload_0         
	//   94  186:aload           26
	//   95  188:putfield        #219 <Field zzpl zzadj>
		zzcdl = l2;
	//   96  191:aload_0         
	//   97  192:lload           28
	//   98  194:putfield        #221 <Field long zzcdl>
		zzcdm = s7;
	//   99  197:aload_0         
	//  100  198:aload           30
	//  101  200:putfield        #223 <Field String zzcdm>
		zzcdn = f1;
	//  102  203:aload_0         
	//  103  204:fload           31
	//  104  206:putfield        #225 <Field float zzcdn>
		zzcdt = flag1;
	//  105  209:aload_0         
	//  106  210:iload           32
	//  107  212:putfield        #227 <Field boolean zzcdt>
		zzcdo = i1;
	//  108  215:aload_0         
	//  109  216:iload           33
	//  110  218:putfield        #229 <Field int zzcdo>
		zzcdp = j1;
	//  111  221:aload_0         
	//  112  222:iload           34
	//  113  224:putfield        #231 <Field int zzcdp>
		zzcdq = flag2;
	//  114  227:aload_0         
	//  115  228:iload           35
	//  116  230:putfield        #233 <Field boolean zzcdq>
		zzcdr = flag3;
	//  117  233:aload_0         
	//  118  234:iload           36
	//  119  236:putfield        #235 <Field boolean zzcdr>
		zzcds = s8;
	//  120  239:aload_0         
	//  121  240:aload           37
	//  122  242:putfield        #237 <Field String zzcds>
		zzcdu = s9;
	//  123  245:aload_0         
	//  124  246:aload           38
	//  125  248:putfield        #239 <Field String zzcdu>
		zzbss = flag4;
	//  126  251:aload_0         
	//  127  252:iload           39
	//  128  254:putfield        #241 <Field boolean zzbss>
		zzcdv = k1;
	//  129  257:aload_0         
	//  130  258:iload           40
	//  131  260:putfield        #243 <Field int zzcdv>
		zzcdw = bundle3;
	//  132  263:aload_0         
	//  133  264:aload           41
	//  134  266:putfield        #245 <Field Bundle zzcdw>
		zzcdx = s10;
	//  135  269:aload_0         
	//  136  270:aload           42
	//  137  272:putfield        #247 <Field String zzcdx>
		zzadl = zzlu;
	//  138  275:aload_0         
	//  139  276:aload           43
	//  140  278:putfield        #249 <Field zzlu zzadl>
		zzcdy = flag5;
	//  141  281:aload_0         
	//  142  282:iload           44
	//  143  284:putfield        #251 <Field boolean zzcdy>
		zzcdz = bundle4;
	//  144  287:aload_0         
	//  145  288:aload           45
	//  146  290:putfield        #253 <Field Bundle zzcdz>
		zzcea = s11;
	//  147  293:aload_0         
	//  148  294:aload           46
	//  149  296:putfield        #255 <Field String zzcea>
		zzceb = s12;
	//  150  299:aload_0         
	//  151  300:aload           47
	//  152  302:putfield        #257 <Field String zzceb>
		zzcec = s13;
	//  153  305:aload_0         
	//  154  306:aload           48
	//  155  308:putfield        #259 <Field String zzcec>
		zzced = flag6;
	//  156  311:aload_0         
	//  157  312:iload           49
	//  158  314:putfield        #261 <Field boolean zzced>
		zzadn = list3;
	//  159  317:aload_0         
	//  160  318:aload           50
	//  161  320:putfield        #263 <Field List zzadn>
		zzcee = s14;
	//  162  323:aload_0         
	//  163  324:aload           51
	//  164  326:putfield        #265 <Field String zzcee>
		zzcef = list4;
	//  165  329:aload_0         
	//  166  330:aload           52
	//  167  332:putfield        #267 <Field List zzcef>
		zzceg = i2;
	//  168  335:aload_0         
	//  169  336:iload           53
	//  170  338:putfield        #269 <Field int zzceg>
		zzceh = flag7;
	//  171  341:aload_0         
	//  172  342:iload           54
	//  173  344:putfield        #271 <Field boolean zzceh>
		zzcei = flag8;
	//  174  347:aload_0         
	//  175  348:iload           55
	//  176  350:putfield        #273 <Field boolean zzcei>
		zzcej = flag9;
	//  177  353:aload_0         
	//  178  354:iload           56
	//  179  356:putfield        #275 <Field boolean zzcej>
		zzcek = arraylist;
	//  180  359:aload_0         
	//  181  360:aload           57
	//  182  362:putfield        #277 <Field ArrayList zzcek>
	//  183  365:return          
	}

	private zzaef(Bundle bundle, zzjj zzjj, zzjn zzjn, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
			String s2, String s3, zzang zzang, Bundle bundle1, int i, List list, List list1, 
			Bundle bundle2, boolean flag, int j, int k, float f, String s4, long l, String s5, List list2, String s6, zzpl zzpl, long l1, 
			String s7, float f1, boolean flag1, int i1, int j1, boolean flag2, boolean flag3, 
			String s8, String s9, boolean flag4, int k1, Bundle bundle3, String s10, zzlu zzlu, 
			boolean flag5, Bundle bundle4, String s11, String s12, String s13, boolean flag6, List list3, 
			String s14, List list4, int i2, boolean flag7, boolean flag8, boolean flag9, ArrayList arraylist)
	{
		this(24, bundle, zzjj, zzjn, s, applicationinfo, packageinfo, s1, s2, s3, zzang, bundle1, i, list, bundle2, flag, j, k, f, s4, l, s5, list2, s6, zzpl, list1, l1, s7, f1, flag1, i1, j1, flag2, flag3, s8, s9, flag4, k1, bundle3, s10, zzlu, flag5, bundle4, s11, s12, s13, flag6, list3, s14, list4, i2, flag7, flag8, flag9, arraylist);
	//    0    0:aload_0         
	//    1    1:bipush          24
	//    2    3:aload_1         
	//    3    4:aload_2         
	//    4    5:aload_3         
	//    5    6:aload           4
	//    6    8:aload           5
	//    7   10:aload           6
	//    8   12:aload           7
	//    9   14:aload           8
	//   10   16:aload           9
	//   11   18:aload           10
	//   12   20:aload           11
	//   13   22:iload           12
	//   14   24:aload           13
	//   15   26:aload           15
	//   16   28:iload           16
	//   17   30:iload           17
	//   18   32:iload           18
	//   19   34:fload           19
	//   20   36:aload           20
	//   21   38:lload           21
	//   22   40:aload           23
	//   23   42:aload           24
	//   24   44:aload           25
	//   25   46:aload           26
	//   26   48:aload           14
	//   27   50:lload           27
	//   28   52:aload           29
	//   29   54:fload           30
	//   30   56:iload           31
	//   31   58:iload           32
	//   32   60:iload           33
	//   33   62:iload           34
	//   34   64:iload           35
	//   35   66:aload           36
	//   36   68:aload           37
	//   37   70:iload           38
	//   38   72:iload           39
	//   39   74:aload           40
	//   40   76:aload           41
	//   41   78:aload           42
	//   42   80:iload           43
	//   43   82:aload           44
	//   44   84:aload           45
	//   45   86:aload           46
	//   46   88:aload           47
	//   47   90:iload           48
	//   48   92:aload           49
	//   49   94:aload           50
	//   50   96:aload           51
	//   51   98:iload           52
	//   52  100:iload           53
	//   53  102:iload           54
	//   54  104:iload           55
	//   55  106:aload           56
	//   56  108:invokespecial   #284 <Method void zzaef(int, Bundle, zzjj, zzjn, String, ApplicationInfo, PackageInfo, String, String, String, zzang, Bundle, int, List, Bundle, boolean, int, int, float, String, long, String, List, String, zzpl, List, long, String, float, boolean, int, int, boolean, boolean, String, String, boolean, int, Bundle, String, zzlu, boolean, Bundle, String, String, String, boolean, List, String, List, int, boolean, boolean, boolean, ArrayList)>
	//   57  111:return          
	}

	public zzaef(zzaeg zzaeg1, long l, String s, String s1, String s2)
	{
		this(zzaeg1.zzccu, zzaeg1.zzccv, zzaeg1.zzacv, zzaeg1.zzacp, zzaeg1.applicationInfo, zzaeg1.zzccw, (String)zzano.zza(zzaeg1.zzcem, ""), zzaeg1.zzccy, zzaeg1.zzccz, zzaeg1.zzacr, zzaeg1.zzcda, zzaeg1.zzcdb, zzaeg1.zzads, zzaeg1.zzcdk, zzaeg1.zzcdc, zzaeg1.zzcdd, zzaeg1.zzcde, zzaeg1.zzcdf, zzaeg1.zzagu, zzaeg1.zzcdg, zzaeg1.zzcdh, zzaeg1.zzcdi, zzaeg1.zzcdj, zzaeg1.zzaco, zzaeg1.zzadj, l, zzaeg1.zzcdm, zzaeg1.zzcdn, zzaeg1.zzcdt, zzaeg1.zzcdo, zzaeg1.zzcdp, zzaeg1.zzcdq, zzaeg1.zzcdr, (String)zzano.zza(zzaeg1.zzcel, "", 1L, TimeUnit.SECONDS), zzaeg1.zzcdu, zzaeg1.zzbss, zzaeg1.zzcdv, zzaeg1.zzcdw, zzaeg1.zzcdx, zzaeg1.zzadl, zzaeg1.zzcdy, zzaeg1.zzcdz, s, s1, s2, zzaeg1.zzced, zzaeg1.zzadn, zzaeg1.zzcee, zzaeg1.zzcef, zzaeg1.zzceg, zzaeg1.zzceh, zzaeg1.zzcei, zzaeg1.zzcej, zzaeg1.zzcek);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #289 <Field Bundle zzaeg.zzccu>
	//    3    5:aload_1         
	//    4    6:getfield        #290 <Field zzjj zzaeg.zzccv>
	//    5    9:aload_1         
	//    6   10:getfield        #291 <Field zzjn zzaeg.zzacv>
	//    7   13:aload_1         
	//    8   14:getfield        #292 <Field String zzaeg.zzacp>
	//    9   17:aload_1         
	//   10   18:getfield        #293 <Field ApplicationInfo zzaeg.applicationInfo>
	//   11   21:aload_1         
	//   12   22:getfield        #294 <Field PackageInfo zzaeg.zzccw>
	//   13   25:aload_1         
	//   14   26:getfield        #298 <Field java.util.concurrent.Future zzaeg.zzcem>
	//   15   29:ldc2            #300 <String "">
	//   16   32:invokestatic    #306 <Method Object zzano.zza(java.util.concurrent.Future, Object)>
	//   17   35:checkcast       #308 <Class String>
	//   18   38:aload_1         
	//   19   39:getfield        #309 <Field String zzaeg.zzccy>
	//   20   42:aload_1         
	//   21   43:getfield        #310 <Field String zzaeg.zzccz>
	//   22   46:aload_1         
	//   23   47:getfield        #311 <Field zzang zzaeg.zzacr>
	//   24   50:aload_1         
	//   25   51:getfield        #312 <Field Bundle zzaeg.zzcda>
	//   26   54:aload_1         
	//   27   55:getfield        #313 <Field int zzaeg.zzcdb>
	//   28   58:aload_1         
	//   29   59:getfield        #314 <Field List zzaeg.zzads>
	//   30   62:aload_1         
	//   31   63:getfield        #315 <Field List zzaeg.zzcdk>
	//   32   66:aload_1         
	//   33   67:getfield        #316 <Field Bundle zzaeg.zzcdc>
	//   34   70:aload_1         
	//   35   71:getfield        #317 <Field boolean zzaeg.zzcdd>
	//   36   74:aload_1         
	//   37   75:getfield        #318 <Field int zzaeg.zzcde>
	//   38   78:aload_1         
	//   39   79:getfield        #319 <Field int zzaeg.zzcdf>
	//   40   82:aload_1         
	//   41   83:getfield        #320 <Field float zzaeg.zzagu>
	//   42   86:aload_1         
	//   43   87:getfield        #321 <Field String zzaeg.zzcdg>
	//   44   90:aload_1         
	//   45   91:getfield        #322 <Field long zzaeg.zzcdh>
	//   46   94:aload_1         
	//   47   95:getfield        #323 <Field String zzaeg.zzcdi>
	//   48   98:aload_1         
	//   49   99:getfield        #324 <Field List zzaeg.zzcdj>
	//   50  102:aload_1         
	//   51  103:getfield        #325 <Field String zzaeg.zzaco>
	//   52  106:aload_1         
	//   53  107:getfield        #326 <Field zzpl zzaeg.zzadj>
	//   54  110:lload_2         
	//   55  111:aload_1         
	//   56  112:getfield        #327 <Field String zzaeg.zzcdm>
	//   57  115:aload_1         
	//   58  116:getfield        #328 <Field float zzaeg.zzcdn>
	//   59  119:aload_1         
	//   60  120:getfield        #329 <Field boolean zzaeg.zzcdt>
	//   61  123:aload_1         
	//   62  124:getfield        #330 <Field int zzaeg.zzcdo>
	//   63  127:aload_1         
	//   64  128:getfield        #331 <Field int zzaeg.zzcdp>
	//   65  131:aload_1         
	//   66  132:getfield        #332 <Field boolean zzaeg.zzcdq>
	//   67  135:aload_1         
	//   68  136:getfield        #333 <Field boolean zzaeg.zzcdr>
	//   69  139:aload_1         
	//   70  140:getfield        #336 <Field java.util.concurrent.Future zzaeg.zzcel>
	//   71  143:ldc2            #300 <String "">
	//   72  146:lconst_1        
	//   73  147:getstatic       #342 <Field TimeUnit TimeUnit.SECONDS>
	//   74  150:invokestatic    #345 <Method Object zzano.zza(java.util.concurrent.Future, Object, long, TimeUnit)>
	//   75  153:checkcast       #308 <Class String>
	//   76  156:aload_1         
	//   77  157:getfield        #346 <Field String zzaeg.zzcdu>
	//   78  160:aload_1         
	//   79  161:getfield        #347 <Field boolean zzaeg.zzbss>
	//   80  164:aload_1         
	//   81  165:getfield        #348 <Field int zzaeg.zzcdv>
	//   82  168:aload_1         
	//   83  169:getfield        #349 <Field Bundle zzaeg.zzcdw>
	//   84  172:aload_1         
	//   85  173:getfield        #350 <Field String zzaeg.zzcdx>
	//   86  176:aload_1         
	//   87  177:getfield        #351 <Field zzlu zzaeg.zzadl>
	//   88  180:aload_1         
	//   89  181:getfield        #352 <Field boolean zzaeg.zzcdy>
	//   90  184:aload_1         
	//   91  185:getfield        #353 <Field Bundle zzaeg.zzcdz>
	//   92  188:aload           4
	//   93  190:aload           5
	//   94  192:aload           6
	//   95  194:aload_1         
	//   96  195:getfield        #354 <Field boolean zzaeg.zzced>
	//   97  198:aload_1         
	//   98  199:getfield        #355 <Field List zzaeg.zzadn>
	//   99  202:aload_1         
	//  100  203:getfield        #356 <Field String zzaeg.zzcee>
	//  101  206:aload_1         
	//  102  207:getfield        #357 <Field List zzaeg.zzcef>
	//  103  210:aload_1         
	//  104  211:getfield        #358 <Field int zzaeg.zzceg>
	//  105  214:aload_1         
	//  106  215:getfield        #359 <Field boolean zzaeg.zzceh>
	//  107  218:aload_1         
	//  108  219:getfield        #360 <Field boolean zzaeg.zzcei>
	//  109  222:aload_1         
	//  110  223:getfield        #361 <Field boolean zzaeg.zzcej>
	//  111  226:aload_1         
	//  112  227:getfield        #362 <Field ArrayList zzaeg.zzcek>
	//  113  230:invokespecial   #364 <Method void zzaef(Bundle, zzjj, zzjn, String, ApplicationInfo, PackageInfo, String, String, String, zzang, Bundle, int, List, List, Bundle, boolean, int, int, float, String, long, String, List, String, zzpl, long, String, float, boolean, int, int, boolean, boolean, String, String, boolean, int, Bundle, String, zzlu, boolean, Bundle, String, String, String, boolean, List, String, List, int, boolean, boolean, boolean, ArrayList)>
	//  114  233:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #372 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, versionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #159 <Field int versionCode>
	//    7   11:invokestatic    #376 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBundle(parcel, 2, zzccu, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #161 <Field Bundle zzccu>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #380 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (zzccv)), i, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #163 <Field zzjj zzccv>
	//   18   30:iload_2         
	//   19   31:iconst_0        
	//   20   32:invokestatic    #384 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 4, ((android.os.Parcelable) (zzacv)), i, false);
	//   21   35:aload_1         
	//   22   36:iconst_4        
	//   23   37:aload_0         
	//   24   38:getfield        #165 <Field zzjn zzacv>
	//   25   41:iload_2         
	//   26   42:iconst_0        
	//   27   43:invokestatic    #384 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeString(parcel, 5, zzacp, false);
	//   28   46:aload_1         
	//   29   47:iconst_5        
	//   30   48:aload_0         
	//   31   49:getfield        #167 <Field String zzacp>
	//   32   52:iconst_0        
	//   33   53:invokestatic    #388 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 6, ((android.os.Parcelable) (applicationInfo)), i, false);
	//   34   56:aload_1         
	//   35   57:bipush          6
	//   36   59:aload_0         
	//   37   60:getfield        #169 <Field ApplicationInfo applicationInfo>
	//   38   63:iload_2         
	//   39   64:iconst_0        
	//   40   65:invokestatic    #384 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 7, ((android.os.Parcelable) (zzccw)), i, false);
	//   41   68:aload_1         
	//   42   69:bipush          7
	//   43   71:aload_0         
	//   44   72:getfield        #171 <Field PackageInfo zzccw>
	//   45   75:iload_2         
	//   46   76:iconst_0        
	//   47   77:invokestatic    #384 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeString(parcel, 8, zzccx, false);
	//   48   80:aload_1         
	//   49   81:bipush          8
	//   50   83:aload_0         
	//   51   84:getfield        #173 <Field String zzccx>
	//   52   87:iconst_0        
	//   53   88:invokestatic    #388 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 9, zzccy, false);
	//   54   91:aload_1         
	//   55   92:bipush          9
	//   56   94:aload_0         
	//   57   95:getfield        #175 <Field String zzccy>
	//   58   98:iconst_0        
	//   59   99:invokestatic    #388 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 10, zzccz, false);
	//   60  102:aload_1         
	//   61  103:bipush          10
	//   62  105:aload_0         
	//   63  106:getfield        #177 <Field String zzccz>
	//   64  109:iconst_0        
	//   65  110:invokestatic    #388 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 11, ((android.os.Parcelable) (zzacr)), i, false);
	//   66  113:aload_1         
	//   67  114:bipush          11
	//   68  116:aload_0         
	//   69  117:getfield        #179 <Field zzang zzacr>
	//   70  120:iload_2         
	//   71  121:iconst_0        
	//   72  122:invokestatic    #384 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeBundle(parcel, 12, zzcda, false);
	//   73  125:aload_1         
	//   74  126:bipush          12
	//   75  128:aload_0         
	//   76  129:getfield        #181 <Field Bundle zzcda>
	//   77  132:iconst_0        
	//   78  133:invokestatic    #380 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.writeInt(parcel, 13, zzcdb);
	//   79  136:aload_1         
	//   80  137:bipush          13
	//   81  139:aload_0         
	//   82  140:getfield        #183 <Field int zzcdb>
	//   83  143:invokestatic    #376 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeStringList(parcel, 14, zzads, false);
	//   84  146:aload_1         
	//   85  147:bipush          14
	//   86  149:aload_0         
	//   87  150:getfield        #185 <Field List zzads>
	//   88  153:iconst_0        
	//   89  154:invokestatic    #392 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeBundle(parcel, 15, zzcdc, false);
	//   90  157:aload_1         
	//   91  158:bipush          15
	//   92  160:aload_0         
	//   93  161:getfield        #199 <Field Bundle zzcdc>
	//   94  164:iconst_0        
	//   95  165:invokestatic    #380 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 16, zzcdd);
	//   96  168:aload_1         
	//   97  169:bipush          16
	//   98  171:aload_0         
	//   99  172:getfield        #201 <Field boolean zzcdd>
	//  100  175:invokestatic    #396 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeInt(parcel, 18, zzcde);
	//  101  178:aload_1         
	//  102  179:bipush          18
	//  103  181:aload_0         
	//  104  182:getfield        #203 <Field int zzcde>
	//  105  185:invokestatic    #376 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 19, zzcdf);
	//  106  188:aload_1         
	//  107  189:bipush          19
	//  108  191:aload_0         
	//  109  192:getfield        #205 <Field int zzcdf>
	//  110  195:invokestatic    #376 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeFloat(parcel, 20, zzagu);
	//  111  198:aload_1         
	//  112  199:bipush          20
	//  113  201:aload_0         
	//  114  202:getfield        #207 <Field float zzagu>
	//  115  205:invokestatic    #400 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeString(parcel, 21, zzcdg, false);
	//  116  208:aload_1         
	//  117  209:bipush          21
	//  118  211:aload_0         
	//  119  212:getfield        #209 <Field String zzcdg>
	//  120  215:iconst_0        
	//  121  216:invokestatic    #388 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeLong(parcel, 25, zzcdh);
	//  122  219:aload_1         
	//  123  220:bipush          25
	//  124  222:aload_0         
	//  125  223:getfield        #211 <Field long zzcdh>
	//  126  226:invokestatic    #404 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeString(parcel, 26, zzcdi, false);
	//  127  229:aload_1         
	//  128  230:bipush          26
	//  129  232:aload_0         
	//  130  233:getfield        #213 <Field String zzcdi>
	//  131  236:iconst_0        
	//  132  237:invokestatic    #388 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeStringList(parcel, 27, zzcdj, false);
	//  133  240:aload_1         
	//  134  241:bipush          27
	//  135  243:aload_0         
	//  136  244:getfield        #215 <Field List zzcdj>
	//  137  247:iconst_0        
	//  138  248:invokestatic    #392 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeString(parcel, 28, zzaco, false);
	//  139  251:aload_1         
	//  140  252:bipush          28
	//  141  254:aload_0         
	//  142  255:getfield        #217 <Field String zzaco>
	//  143  258:iconst_0        
	//  144  259:invokestatic    #388 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 29, ((android.os.Parcelable) (zzadj)), i, false);
	//  145  262:aload_1         
	//  146  263:bipush          29
	//  147  265:aload_0         
	//  148  266:getfield        #219 <Field zzpl zzadj>
	//  149  269:iload_2         
	//  150  270:iconst_0        
	//  151  271:invokestatic    #384 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeStringList(parcel, 30, zzcdk, false);
	//  152  274:aload_1         
	//  153  275:bipush          30
	//  154  277:aload_0         
	//  155  278:getfield        #197 <Field List zzcdk>
	//  156  281:iconst_0        
	//  157  282:invokestatic    #392 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeLong(parcel, 31, zzcdl);
	//  158  285:aload_1         
	//  159  286:bipush          31
	//  160  288:aload_0         
	//  161  289:getfield        #221 <Field long zzcdl>
	//  162  292:invokestatic    #404 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeString(parcel, 33, zzcdm, false);
	//  163  295:aload_1         
	//  164  296:bipush          33
	//  165  298:aload_0         
	//  166  299:getfield        #223 <Field String zzcdm>
	//  167  302:iconst_0        
	//  168  303:invokestatic    #388 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeFloat(parcel, 34, zzcdn);
	//  169  306:aload_1         
	//  170  307:bipush          34
	//  171  309:aload_0         
	//  172  310:getfield        #225 <Field float zzcdn>
	//  173  313:invokestatic    #400 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeInt(parcel, 35, zzcdo);
	//  174  316:aload_1         
	//  175  317:bipush          35
	//  176  319:aload_0         
	//  177  320:getfield        #229 <Field int zzcdo>
	//  178  323:invokestatic    #376 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 36, zzcdp);
	//  179  326:aload_1         
	//  180  327:bipush          36
	//  181  329:aload_0         
	//  182  330:getfield        #231 <Field int zzcdp>
	//  183  333:invokestatic    #376 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBoolean(parcel, 37, zzcdq);
	//  184  336:aload_1         
	//  185  337:bipush          37
	//  186  339:aload_0         
	//  187  340:getfield        #233 <Field boolean zzcdq>
	//  188  343:invokestatic    #396 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 38, zzcdr);
	//  189  346:aload_1         
	//  190  347:bipush          38
	//  191  349:aload_0         
	//  192  350:getfield        #235 <Field boolean zzcdr>
	//  193  353:invokestatic    #396 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeString(parcel, 39, zzcds, false);
	//  194  356:aload_1         
	//  195  357:bipush          39
	//  196  359:aload_0         
	//  197  360:getfield        #237 <Field String zzcds>
	//  198  363:iconst_0        
	//  199  364:invokestatic    #388 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 40, zzcdt);
	//  200  367:aload_1         
	//  201  368:bipush          40
	//  202  370:aload_0         
	//  203  371:getfield        #227 <Field boolean zzcdt>
	//  204  374:invokestatic    #396 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeString(parcel, 41, zzcdu, false);
	//  205  377:aload_1         
	//  206  378:bipush          41
	//  207  380:aload_0         
	//  208  381:getfield        #239 <Field String zzcdu>
	//  209  384:iconst_0        
	//  210  385:invokestatic    #388 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 42, zzbss);
	//  211  388:aload_1         
	//  212  389:bipush          42
	//  213  391:aload_0         
	//  214  392:getfield        #241 <Field boolean zzbss>
	//  215  395:invokestatic    #396 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeInt(parcel, 43, zzcdv);
	//  216  398:aload_1         
	//  217  399:bipush          43
	//  218  401:aload_0         
	//  219  402:getfield        #243 <Field int zzcdv>
	//  220  405:invokestatic    #376 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBundle(parcel, 44, zzcdw, false);
	//  221  408:aload_1         
	//  222  409:bipush          44
	//  223  411:aload_0         
	//  224  412:getfield        #245 <Field Bundle zzcdw>
	//  225  415:iconst_0        
	//  226  416:invokestatic    #380 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.writeString(parcel, 45, zzcdx, false);
	//  227  419:aload_1         
	//  228  420:bipush          45
	//  229  422:aload_0         
	//  230  423:getfield        #247 <Field String zzcdx>
	//  231  426:iconst_0        
	//  232  427:invokestatic    #388 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 46, ((android.os.Parcelable) (zzadl)), i, false);
	//  233  430:aload_1         
	//  234  431:bipush          46
	//  235  433:aload_0         
	//  236  434:getfield        #249 <Field zzlu zzadl>
	//  237  437:iload_2         
	//  238  438:iconst_0        
	//  239  439:invokestatic    #384 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 47, zzcdy);
	//  240  442:aload_1         
	//  241  443:bipush          47
	//  242  445:aload_0         
	//  243  446:getfield        #251 <Field boolean zzcdy>
	//  244  449:invokestatic    #396 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBundle(parcel, 48, zzcdz, false);
	//  245  452:aload_1         
	//  246  453:bipush          48
	//  247  455:aload_0         
	//  248  456:getfield        #253 <Field Bundle zzcdz>
	//  249  459:iconst_0        
	//  250  460:invokestatic    #380 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.writeString(parcel, 49, zzcea, false);
	//  251  463:aload_1         
	//  252  464:bipush          49
	//  253  466:aload_0         
	//  254  467:getfield        #255 <Field String zzcea>
	//  255  470:iconst_0        
	//  256  471:invokestatic    #388 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 50, zzceb, false);
	//  257  474:aload_1         
	//  258  475:bipush          50
	//  259  477:aload_0         
	//  260  478:getfield        #257 <Field String zzceb>
	//  261  481:iconst_0        
	//  262  482:invokestatic    #388 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 51, zzcec, false);
	//  263  485:aload_1         
	//  264  486:bipush          51
	//  265  488:aload_0         
	//  266  489:getfield        #259 <Field String zzcec>
	//  267  492:iconst_0        
	//  268  493:invokestatic    #388 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 52, zzced);
	//  269  496:aload_1         
	//  270  497:bipush          52
	//  271  499:aload_0         
	//  272  500:getfield        #261 <Field boolean zzced>
	//  273  503:invokestatic    #396 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeIntegerList(parcel, 53, zzadn, false);
	//  274  506:aload_1         
	//  275  507:bipush          53
	//  276  509:aload_0         
	//  277  510:getfield        #263 <Field List zzadn>
	//  278  513:iconst_0        
	//  279  514:invokestatic    #407 <Method void SafeParcelWriter.writeIntegerList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeString(parcel, 54, zzcee, false);
	//  280  517:aload_1         
	//  281  518:bipush          54
	//  282  520:aload_0         
	//  283  521:getfield        #265 <Field String zzcee>
	//  284  524:iconst_0        
	//  285  525:invokestatic    #388 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeStringList(parcel, 55, zzcef, false);
	//  286  528:aload_1         
	//  287  529:bipush          55
	//  288  531:aload_0         
	//  289  532:getfield        #267 <Field List zzcef>
	//  290  535:iconst_0        
	//  291  536:invokestatic    #392 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeInt(parcel, 56, zzceg);
	//  292  539:aload_1         
	//  293  540:bipush          56
	//  294  542:aload_0         
	//  295  543:getfield        #269 <Field int zzceg>
	//  296  546:invokestatic    #376 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBoolean(parcel, 57, zzceh);
	//  297  549:aload_1         
	//  298  550:bipush          57
	//  299  552:aload_0         
	//  300  553:getfield        #271 <Field boolean zzceh>
	//  301  556:invokestatic    #396 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 58, zzcei);
	//  302  559:aload_1         
	//  303  560:bipush          58
	//  304  562:aload_0         
	//  305  563:getfield        #273 <Field boolean zzcei>
	//  306  566:invokestatic    #396 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 59, zzcej);
	//  307  569:aload_1         
	//  308  570:bipush          59
	//  309  572:aload_0         
	//  310  573:getfield        #275 <Field boolean zzcej>
	//  311  576:invokestatic    #396 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeStringList(parcel, 60, ((List) (zzcek)), false);
	//  312  579:aload_1         
	//  313  580:bipush          60
	//  314  582:aload_0         
	//  315  583:getfield        #277 <Field ArrayList zzcek>
	//  316  586:iconst_0        
	//  317  587:invokestatic    #392 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//  318  590:aload_1         
	//  319  591:iload_3         
	//  320  592:invokestatic    #410 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//  321  595:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzaeh();
	public final ApplicationInfo applicationInfo;
	public final int versionCode;
	public final String zzaco;
	public final String zzacp;
	public final zzang zzacr;
	public final zzjn zzacv;
	public final zzpl zzadj;
	public final zzlu zzadl;
	public final List zzadn;
	public final List zzads;
	public final float zzagu;
	public final boolean zzbss;
	public final Bundle zzccu;
	public final zzjj zzccv;
	public final PackageInfo zzccw;
	public final String zzccx;
	public final String zzccy;
	public final String zzccz;
	public final Bundle zzcda;
	public final int zzcdb;
	public final Bundle zzcdc;
	public final boolean zzcdd;
	public final int zzcde;
	public final int zzcdf;
	public final String zzcdg;
	public final long zzcdh;
	public final String zzcdi;
	public final List zzcdj;
	public final List zzcdk;
	public final long zzcdl;
	public final String zzcdm;
	public final float zzcdn;
	public final int zzcdo;
	public final int zzcdp;
	public final boolean zzcdq;
	public final boolean zzcdr;
	public final String zzcds;
	public final boolean zzcdt;
	public final String zzcdu;
	public final int zzcdv;
	public final Bundle zzcdw;
	public final String zzcdx;
	public final boolean zzcdy;
	public final Bundle zzcdz;
	public final String zzcea;
	public final String zzceb;
	public final String zzcec;
	public final boolean zzced;
	public final String zzcee;
	public final List zzcef;
	public final int zzceg;
	public final boolean zzceh;
	public final boolean zzcei;
	public final boolean zzcej;
	public final ArrayList zzcek;

	static 
	{
	//    0    0:new             #147 <Class zzaeh>
	//    1    3:dup             
	//    2    4:invokespecial   #150 <Method void zzaeh()>
	//    3    7:putstatic       #152 <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
