// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaji, zzaef, zzaej, zzaqw, 
//			zzasc, zzwx, zzxq, zzxa, 
//			zzjj, zzaig, zzael, zzwy, 
//			zzjn, zzpb, zzhs

public final class zzajh
{

	public zzajh(zzaji zzaji1, zzaqw zzaqw1, zzwx zzwx, zzxq zzxq, String s, zzxa zzxa, zzpb zzpb, 
			String s1)
	{
		this(zzaji1.zzcgs.zzccv, ((zzaqw) (null)), zzaji1.zzcos.zzbsn, zzaji1.errorCode, zzaji1.zzcos.zzbso, zzaji1.zzcos.zzces, zzaji1.zzcos.orientation, zzaji1.zzcos.zzbsu, zzaji1.zzcgs.zzccy, zzaji1.zzcos.zzceq, ((zzwx) (null)), ((zzxq) (null)), ((String) (null)), zzaji1.zzcod, ((zzxa) (null)), zzaji1.zzcos.zzcer, zzaji1.zzacv, zzaji1.zzcos.zzcep, zzaji1.zzcoh, zzaji1.zzcoi, zzaji1.zzcos.zzcev, zzaji1.zzcob, ((zzpb) (null)), zzaji1.zzcos.zzcfe, zzaji1.zzcos.zzcff, zzaji1.zzcos.zzcff, zzaji1.zzcos.zzcfh, zzaji1.zzcos.zzcfi, ((String) (null)), zzaji1.zzcos.zzbsr, zzaji1.zzcos.zzcfl, zzaji1.zzcoq, zzaji1.zzcos.zzzl, zzaji1.zzcor, zzaji1.zzcos.zzcfp, zzaji1.zzcos.zzbsp, zzaji1.zzcos.zzzm, zzaji1.zzcos.zzcfq);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #78  <Field zzaef zzaji.zzcgs>
	//    3    5:getfield        #82  <Field zzjj zzaef.zzccv>
	//    4    8:aconst_null     
	//    5    9:aload_1         
	//    6   10:getfield        #86  <Field zzaej zzaji.zzcos>
	//    7   13:getfield        #90  <Field List zzaej.zzbsn>
	//    8   16:aload_1         
	//    9   17:getfield        #92  <Field int zzaji.errorCode>
	//   10   20:aload_1         
	//   11   21:getfield        #86  <Field zzaej zzaji.zzcos>
	//   12   24:getfield        #94  <Field List zzaej.zzbso>
	//   13   27:aload_1         
	//   14   28:getfield        #86  <Field zzaej zzaji.zzcos>
	//   15   31:getfield        #96  <Field List zzaej.zzces>
	//   16   34:aload_1         
	//   17   35:getfield        #86  <Field zzaej zzaji.zzcos>
	//   18   38:getfield        #98  <Field int zzaej.orientation>
	//   19   41:aload_1         
	//   20   42:getfield        #86  <Field zzaej zzaji.zzcos>
	//   21   45:getfield        #100 <Field long zzaej.zzbsu>
	//   22   48:aload_1         
	//   23   49:getfield        #78  <Field zzaef zzaji.zzcgs>
	//   24   52:getfield        #102 <Field String zzaef.zzccy>
	//   25   55:aload_1         
	//   26   56:getfield        #86  <Field zzaej zzaji.zzcos>
	//   27   59:getfield        #104 <Field boolean zzaej.zzceq>
	//   28   62:aconst_null     
	//   29   63:aconst_null     
	//   30   64:aconst_null     
	//   31   65:aload_1         
	//   32   66:getfield        #106 <Field zzwy zzaji.zzcod>
	//   33   69:aconst_null     
	//   34   70:aload_1         
	//   35   71:getfield        #86  <Field zzaej zzaji.zzcos>
	//   36   74:getfield        #108 <Field long zzaej.zzcer>
	//   37   77:aload_1         
	//   38   78:getfield        #111 <Field zzjn zzaji.zzacv>
	//   39   81:aload_1         
	//   40   82:getfield        #86  <Field zzaej zzaji.zzcos>
	//   41   85:getfield        #113 <Field long zzaej.zzcep>
	//   42   88:aload_1         
	//   43   89:getfield        #115 <Field long zzaji.zzcoh>
	//   44   92:aload_1         
	//   45   93:getfield        #117 <Field long zzaji.zzcoi>
	//   46   96:aload_1         
	//   47   97:getfield        #86  <Field zzaej zzaji.zzcos>
	//   48  100:getfield        #119 <Field String zzaej.zzcev>
	//   49  103:aload_1         
	//   50  104:getfield        #121 <Field JSONObject zzaji.zzcob>
	//   51  107:aconst_null     
	//   52  108:aload_1         
	//   53  109:getfield        #86  <Field zzaej zzaji.zzcos>
	//   54  112:getfield        #123 <Field zzaig zzaej.zzcfe>
	//   55  115:aload_1         
	//   56  116:getfield        #86  <Field zzaej zzaji.zzcos>
	//   57  119:getfield        #126 <Field List zzaej.zzcff>
	//   58  122:aload_1         
	//   59  123:getfield        #86  <Field zzaej zzaji.zzcos>
	//   60  126:getfield        #126 <Field List zzaej.zzcff>
	//   61  129:aload_1         
	//   62  130:getfield        #86  <Field zzaej zzaji.zzcos>
	//   63  133:getfield        #128 <Field boolean zzaej.zzcfh>
	//   64  136:aload_1         
	//   65  137:getfield        #86  <Field zzaej zzaji.zzcos>
	//   66  140:getfield        #130 <Field zzael zzaej.zzcfi>
	//   67  143:aconst_null     
	//   68  144:aload_1         
	//   69  145:getfield        #86  <Field zzaej zzaji.zzcos>
	//   70  148:getfield        #132 <Field List zzaej.zzbsr>
	//   71  151:aload_1         
	//   72  152:getfield        #86  <Field zzaej zzaji.zzcos>
	//   73  155:getfield        #134 <Field String zzaej.zzcfl>
	//   74  158:aload_1         
	//   75  159:getfield        #136 <Field zzhs zzaji.zzcoq>
	//   76  162:aload_1         
	//   77  163:getfield        #86  <Field zzaej zzaji.zzcos>
	//   78  166:getfield        #138 <Field boolean zzaej.zzzl>
	//   79  169:aload_1         
	//   80  170:getfield        #140 <Field boolean zzaji.zzcor>
	//   81  173:aload_1         
	//   82  174:getfield        #86  <Field zzaej zzaji.zzcos>
	//   83  177:getfield        #142 <Field boolean zzaej.zzcfp>
	//   84  180:aload_1         
	//   85  181:getfield        #86  <Field zzaej zzaji.zzcos>
	//   86  184:getfield        #144 <Field List zzaej.zzbsp>
	//   87  187:aload_1         
	//   88  188:getfield        #86  <Field zzaej zzaji.zzcos>
	//   89  191:getfield        #146 <Field boolean zzaej.zzzm>
	//   90  194:aload_1         
	//   91  195:getfield        #86  <Field zzaej zzaji.zzcos>
	//   92  198:getfield        #148 <Field String zzaej.zzcfq>
	//   93  201:invokespecial   #151 <Method void zzajh(zzjj, zzaqw, List, int, List, List, int, long, String, boolean, zzwx, zzxq, String, zzwy, zzxa, long, zzjn, long, long, long, String, JSONObject, zzpb, zzaig, List, List, boolean, zzael, String, List, String, zzhs, boolean, boolean, boolean, List, boolean, String)>
	//   94  204:return          
	}

	public zzajh(zzjj zzjj, zzaqw zzaqw1, List list, int i, List list1, List list2, int j, 
			long l, String s, boolean flag, zzwx zzwx, zzxq zzxq, String s1, 
			zzwy zzwy, zzxa zzxa, long l1, zzjn zzjn, long l2, 
			long l3, long l4, String s2, JSONObject jsonobject, zzpb zzpb, 
			zzaig zzaig, List list3, List list4, boolean flag1, zzael zzael, String s3, List list5, 
			String s4, zzhs zzhs, boolean flag2, boolean flag3, boolean flag4, List list6, boolean flag5, 
			String s5)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #156 <Method void Object()>
		zzcok = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #158 <Field boolean zzcok>
		zzcol = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #160 <Field boolean zzcol>
		zzcom = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #162 <Field boolean zzcom>
		zzcon = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #164 <Field boolean zzcon>
		zzcoo = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #166 <Field boolean zzcoo>
		zzcop = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #168 <Field boolean zzcop>
		zzccv = zzjj;
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:putfield        #169 <Field zzjj zzccv>
		zzbyo = zzaqw1;
	//   23   39:aload_0         
	//   24   40:aload_2         
	//   25   41:putfield        #171 <Field zzaqw zzbyo>
		zzbsn = zzn(list);
	//   26   44:aload_0         
	//   27   45:aload_3         
	//   28   46:invokestatic    #175 <Method List zzn(List)>
	//   29   49:putfield        #176 <Field List zzbsn>
		errorCode = i;
	//   30   52:aload_0         
	//   31   53:iload           4
	//   32   55:putfield        #177 <Field int errorCode>
		zzbso = zzn(list1);
	//   33   58:aload_0         
	//   34   59:aload           5
	//   35   61:invokestatic    #175 <Method List zzn(List)>
	//   36   64:putfield        #178 <Field List zzbso>
		zzces = zzn(list2);
	//   37   67:aload_0         
	//   38   68:aload           6
	//   39   70:invokestatic    #175 <Method List zzn(List)>
	//   40   73:putfield        #179 <Field List zzces>
		orientation = j;
	//   41   76:aload_0         
	//   42   77:iload           7
	//   43   79:putfield        #180 <Field int orientation>
		zzbsu = l;
	//   44   82:aload_0         
	//   45   83:lload           8
	//   46   85:putfield        #181 <Field long zzbsu>
		zzccy = s;
	//   47   88:aload_0         
	//   48   89:aload           10
	//   49   91:putfield        #182 <Field String zzccy>
		zzceq = flag;
	//   50   94:aload_0         
	//   51   95:iload           11
	//   52   97:putfield        #183 <Field boolean zzceq>
		zzbtw = zzwx;
	//   53  100:aload_0         
	//   54  101:aload           12
	//   55  103:putfield        #185 <Field zzwx zzbtw>
		zzbtx = zzxq;
	//   56  106:aload_0         
	//   57  107:aload           13
	//   58  109:putfield        #187 <Field zzxq zzbtx>
		zzbty = s1;
	//   59  112:aload_0         
	//   60  113:aload           14
	//   61  115:putfield        #189 <Field String zzbty>
		zzcod = zzwy;
	//   62  118:aload_0         
	//   63  119:aload           15
	//   64  121:putfield        #190 <Field zzwy zzcod>
		zzbtz = zzxa;
	//   65  124:aload_0         
	//   66  125:aload           16
	//   67  127:putfield        #192 <Field zzxa zzbtz>
		zzcer = l1;
	//   68  130:aload_0         
	//   69  131:lload           17
	//   70  133:putfield        #193 <Field long zzcer>
		zzcof = zzjn;
	//   71  136:aload_0         
	//   72  137:aload           19
	//   73  139:putfield        #195 <Field zzjn zzcof>
		zzcep = l2;
	//   74  142:aload_0         
	//   75  143:lload           20
	//   76  145:putfield        #196 <Field long zzcep>
		zzcoh = l3;
	//   77  148:aload_0         
	//   78  149:lload           22
	//   79  151:putfield        #197 <Field long zzcoh>
		zzcoi = l4;
	//   80  154:aload_0         
	//   81  155:lload           24
	//   82  157:putfield        #198 <Field long zzcoi>
		zzcev = s2;
	//   83  160:aload_0         
	//   84  161:aload           26
	//   85  163:putfield        #199 <Field String zzcev>
		zzcob = jsonobject;
	//   86  166:aload_0         
	//   87  167:aload           27
	//   88  169:putfield        #200 <Field JSONObject zzcob>
		zzcoj = zzpb;
	//   89  172:aload_0         
	//   90  173:aload           28
	//   91  175:putfield        #202 <Field zzpb zzcoj>
		zzcfe = zzaig;
	//   92  178:aload_0         
	//   93  179:aload           29
	//   94  181:putfield        #203 <Field zzaig zzcfe>
		zzcog = zzn(list3);
	//   95  184:aload_0         
	//   96  185:aload           30
	//   97  187:invokestatic    #175 <Method List zzn(List)>
	//   98  190:putfield        #205 <Field List zzcog>
		zzcfg = zzn(list4);
	//   99  193:aload_0         
	//  100  194:aload           31
	//  101  196:invokestatic    #175 <Method List zzn(List)>
	//  102  199:putfield        #207 <Field List zzcfg>
		zzcfh = flag1;
	//  103  202:aload_0         
	//  104  203:iload           32
	//  105  205:putfield        #208 <Field boolean zzcfh>
		zzcfi = zzael;
	//  106  208:aload_0         
	//  107  209:aload           33
	//  108  211:putfield        #209 <Field zzael zzcfi>
		zzcoe = s3;
	//  109  214:aload_0         
	//  110  215:aload           34
	//  111  217:putfield        #211 <Field String zzcoe>
		zzbsr = zzn(list5);
	//  112  220:aload_0         
	//  113  221:aload           35
	//  114  223:invokestatic    #175 <Method List zzn(List)>
	//  115  226:putfield        #212 <Field List zzbsr>
		zzcfl = s4;
	//  116  229:aload_0         
	//  117  230:aload           36
	//  118  232:putfield        #213 <Field String zzcfl>
		zzcoq = zzhs;
	//  119  235:aload_0         
	//  120  236:aload           37
	//  121  238:putfield        #214 <Field zzhs zzcoq>
		zzzl = flag2;
	//  122  241:aload_0         
	//  123  242:iload           38
	//  124  244:putfield        #215 <Field boolean zzzl>
		zzcor = flag3;
	//  125  247:aload_0         
	//  126  248:iload           39
	//  127  250:putfield        #216 <Field boolean zzcor>
		zzcfp = flag4;
	//  128  253:aload_0         
	//  129  254:iload           40
	//  130  256:putfield        #217 <Field boolean zzcfp>
		zzbsp = zzn(list6);
	//  131  259:aload_0         
	//  132  260:aload           41
	//  133  262:invokestatic    #175 <Method List zzn(List)>
	//  134  265:putfield        #218 <Field List zzbsp>
		zzzm = flag5;
	//  135  268:aload_0         
	//  136  269:iload           42
	//  137  271:putfield        #219 <Field boolean zzzm>
		zzcfq = s5;
	//  138  274:aload_0         
	//  139  275:aload           43
	//  140  277:putfield        #220 <Field String zzcfq>
	//  141  280:return          
	}

	private static List zzn(List list)
	{
		if(list == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return Collections.unmodifiableList(list);
	//    4    6:aload_0         
	//    5    7:invokestatic    #227 <Method List Collections.unmodifiableList(List)>
	//    6   10:areturn         
	}

	public final boolean zzfz()
	{
		if(zzbyo != null && zzbyo.zzuf() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #171 <Field zzaqw zzbyo>
	//*   2    4:ifnull          37
	//*   3    7:aload_0         
	//*   4    8:getfield        #171 <Field zzaqw zzbyo>
	//*   5   11:invokeinterface #237 <Method zzasc zzaqw.zzuf()>
	//*   6   16:ifnonnull       22
	//*   7   19:goto            37
			return zzbyo.zzuf().zzfz();
	//    8   22:aload_0         
	//    9   23:getfield        #171 <Field zzaqw zzbyo>
	//   10   26:invokeinterface #237 <Method zzasc zzaqw.zzuf()>
	//   11   31:invokeinterface #241 <Method boolean zzasc.zzfz()>
	//   12   36:ireturn         
		else
			return false;
	//   13   37:iconst_0        
	//   14   38:ireturn         
	}

	public final int errorCode;
	public final int orientation;
	public final List zzbsn;
	public final List zzbso;
	public final List zzbsp;
	public final List zzbsr;
	public final long zzbsu;
	public final zzwx zzbtw;
	public final zzxq zzbtx;
	public final String zzbty;
	public final zzxa zzbtz;
	public final zzaqw zzbyo;
	public final zzjj zzccv;
	public final String zzccy;
	private final long zzcep;
	public final boolean zzceq;
	private final long zzcer;
	public final List zzces;
	public final String zzcev;
	public final zzaig zzcfe;
	public final List zzcfg;
	public final boolean zzcfh;
	private final zzael zzcfi;
	public final String zzcfl;
	public final boolean zzcfp;
	private final String zzcfq;
	public final JSONObject zzcob;
	public boolean zzcoc;
	public final zzwy zzcod;
	public final String zzcoe;
	public final zzjn zzcof;
	public final List zzcog;
	public final long zzcoh;
	public final long zzcoi;
	public final zzpb zzcoj;
	public boolean zzcok;
	public boolean zzcol;
	public boolean zzcom;
	public boolean zzcon;
	public boolean zzcoo;
	public boolean zzcop;
	public final zzhs zzcoq;
	public final boolean zzcor;
	public final boolean zzzl;
	public final boolean zzzm;
}
