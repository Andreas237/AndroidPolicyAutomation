// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzang, zzjn, zzpl, zzlu, 
//			zzjj

public final class zzaeg
{

	public zzaeg(Bundle bundle, zzjj zzjj, zzjn zzjn, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
			String s2, zzang zzang, Bundle bundle1, List list, List list1, Bundle bundle2, boolean flag, 
			int i, int j, float f, String s3, long l, String s4, 
			List list2, String s5, zzpl zzpl, String s6, float f1, boolean flag1, int k, 
			int i1, boolean flag2, boolean flag3, Future future, String s7, boolean flag4, int j1, 
			Bundle bundle3, String s8, zzlu zzlu, boolean flag5, Bundle bundle4, boolean flag6, Future future1, 
			List list3, String s9, List list4, int k1, boolean flag7, boolean flag8, boolean flag9, 
			ArrayList arraylist)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void Object()>
		zzccu = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #83  <Field Bundle zzccu>
		zzccv = zzjj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #85  <Field zzjj zzccv>
		zzacv = zzjn;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #87  <Field zzjn zzacv>
		zzacp = s;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #89  <Field String zzacp>
		applicationInfo = applicationinfo;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #91  <Field ApplicationInfo applicationInfo>
		zzccw = packageinfo;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #93  <Field PackageInfo zzccw>
		zzccy = s1;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #95  <Field String zzccy>
		zzccz = s2;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #97  <Field String zzccz>
		zzacr = zzang;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #99  <Field zzang zzacr>
		zzcda = bundle1;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #101 <Field Bundle zzcda>
		zzcdd = flag;
	//   32   61:aload_0         
	//   33   62:iload           14
	//   34   64:putfield        #103 <Field boolean zzcdd>
		zzcde = i;
	//   35   67:aload_0         
	//   36   68:iload           15
	//   37   70:putfield        #105 <Field int zzcde>
		zzcdf = j;
	//   38   73:aload_0         
	//   39   74:iload           16
	//   40   76:putfield        #107 <Field int zzcdf>
		zzagu = f;
	//   41   79:aload_0         
	//   42   80:fload           17
	//   43   82:putfield        #109 <Field float zzagu>
		if(list != null && list.size() > 0)
	//*  44   85:aload           11
	//*  45   87:ifnull          114
	//*  46   90:aload           11
	//*  47   92:invokeinterface #115 <Method int List.size()>
	//*  48   97:ifle            114
		{
			zzcdb = 3;
	//   49  100:aload_0         
	//   50  101:iconst_3        
	//   51  102:putfield        #117 <Field int zzcdb>
			zzads = list;
	//   52  105:aload_0         
	//   53  106:aload           11
	//   54  108:putfield        #119 <Field List zzads>
		} else
	//*  55  111:goto            127
		{
			zzcdb = 0;
	//   56  114:aload_0         
	//   57  115:iconst_0        
	//   58  116:putfield        #117 <Field int zzcdb>
			list1 = null;
	//   59  119:aconst_null     
	//   60  120:astore          12
			zzads = null;
	//   61  122:aload_0         
	//   62  123:aconst_null     
	//   63  124:putfield        #119 <Field List zzads>
		}
		zzcdk = list1;
	//   64  127:aload_0         
	//   65  128:aload           12
	//   66  130:putfield        #121 <Field List zzcdk>
		zzcdc = bundle2;
	//   67  133:aload_0         
	//   68  134:aload           13
	//   69  136:putfield        #123 <Field Bundle zzcdc>
		zzcdg = s3;
	//   70  139:aload_0         
	//   71  140:aload           18
	//   72  142:putfield        #125 <Field String zzcdg>
		zzcdh = l;
	//   73  145:aload_0         
	//   74  146:lload           19
	//   75  148:putfield        #127 <Field long zzcdh>
		zzcdi = s4;
	//   76  151:aload_0         
	//   77  152:aload           21
	//   78  154:putfield        #129 <Field String zzcdi>
		zzcdj = list2;
	//   79  157:aload_0         
	//   80  158:aload           22
	//   81  160:putfield        #131 <Field List zzcdj>
		zzaco = s5;
	//   82  163:aload_0         
	//   83  164:aload           23
	//   84  166:putfield        #133 <Field String zzaco>
		zzadj = zzpl;
	//   85  169:aload_0         
	//   86  170:aload           24
	//   87  172:putfield        #135 <Field zzpl zzadj>
		zzcdm = s6;
	//   88  175:aload_0         
	//   89  176:aload           25
	//   90  178:putfield        #137 <Field String zzcdm>
		zzcdn = f1;
	//   91  181:aload_0         
	//   92  182:fload           26
	//   93  184:putfield        #139 <Field float zzcdn>
		zzcdt = flag1;
	//   94  187:aload_0         
	//   95  188:iload           27
	//   96  190:putfield        #141 <Field boolean zzcdt>
		zzcdo = k;
	//   97  193:aload_0         
	//   98  194:iload           28
	//   99  196:putfield        #143 <Field int zzcdo>
		zzcdp = i1;
	//  100  199:aload_0         
	//  101  200:iload           29
	//  102  202:putfield        #145 <Field int zzcdp>
		zzcdq = flag2;
	//  103  205:aload_0         
	//  104  206:iload           30
	//  105  208:putfield        #147 <Field boolean zzcdq>
		zzcdr = flag3;
	//  106  211:aload_0         
	//  107  212:iload           31
	//  108  214:putfield        #149 <Field boolean zzcdr>
		zzcel = future;
	//  109  217:aload_0         
	//  110  218:aload           32
	//  111  220:putfield        #151 <Field Future zzcel>
		zzcdu = s7;
	//  112  223:aload_0         
	//  113  224:aload           33
	//  114  226:putfield        #153 <Field String zzcdu>
		zzbss = flag4;
	//  115  229:aload_0         
	//  116  230:iload           34
	//  117  232:putfield        #155 <Field boolean zzbss>
		zzcdv = j1;
	//  118  235:aload_0         
	//  119  236:iload           35
	//  120  238:putfield        #157 <Field int zzcdv>
		zzcdw = bundle3;
	//  121  241:aload_0         
	//  122  242:aload           36
	//  123  244:putfield        #159 <Field Bundle zzcdw>
		zzcdx = s8;
	//  124  247:aload_0         
	//  125  248:aload           37
	//  126  250:putfield        #161 <Field String zzcdx>
		zzadl = zzlu;
	//  127  253:aload_0         
	//  128  254:aload           38
	//  129  256:putfield        #163 <Field zzlu zzadl>
		zzcdy = flag5;
	//  130  259:aload_0         
	//  131  260:iload           39
	//  132  262:putfield        #165 <Field boolean zzcdy>
		zzcdz = bundle4;
	//  133  265:aload_0         
	//  134  266:aload           40
	//  135  268:putfield        #167 <Field Bundle zzcdz>
		zzced = flag6;
	//  136  271:aload_0         
	//  137  272:iload           41
	//  138  274:putfield        #169 <Field boolean zzced>
		zzcem = future1;
	//  139  277:aload_0         
	//  140  278:aload           42
	//  141  280:putfield        #171 <Field Future zzcem>
		zzadn = list3;
	//  142  283:aload_0         
	//  143  284:aload           43
	//  144  286:putfield        #173 <Field List zzadn>
		zzcee = s9;
	//  145  289:aload_0         
	//  146  290:aload           44
	//  147  292:putfield        #175 <Field String zzcee>
		zzcef = list4;
	//  148  295:aload_0         
	//  149  296:aload           45
	//  150  298:putfield        #177 <Field List zzcef>
		zzceg = k1;
	//  151  301:aload_0         
	//  152  302:iload           46
	//  153  304:putfield        #179 <Field int zzceg>
		zzceh = flag7;
	//  154  307:aload_0         
	//  155  308:iload           47
	//  156  310:putfield        #181 <Field boolean zzceh>
		zzcei = flag8;
	//  157  313:aload_0         
	//  158  314:iload           48
	//  159  316:putfield        #183 <Field boolean zzcei>
		zzcej = flag9;
	//  160  319:aload_0         
	//  161  320:iload           49
	//  162  322:putfield        #185 <Field boolean zzcej>
		zzcek = arraylist;
	//  163  325:aload_0         
	//  164  326:aload           50
	//  165  328:putfield        #187 <Field ArrayList zzcek>
	//  166  331:return          
	}

	public final ApplicationInfo applicationInfo;
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
	public final String zzcdm;
	public final float zzcdn;
	public final int zzcdo;
	public final int zzcdp;
	public final boolean zzcdq;
	public final boolean zzcdr;
	public final boolean zzcdt;
	public final String zzcdu;
	public final int zzcdv;
	public final Bundle zzcdw;
	public final String zzcdx;
	public final boolean zzcdy;
	public final Bundle zzcdz;
	public final boolean zzced;
	public final String zzcee;
	public final List zzcef;
	public final int zzceg;
	public final boolean zzceh;
	public final boolean zzcei;
	public final boolean zzcej;
	public final ArrayList zzcek;
	public final Future zzcel;
	public final Future zzcem;
}
