// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzalc, zzasd, zzaji, zzaqw, 
//			zzakq, zzakk, zzakb, zzabg, 
//			zznk, zzkb, zzni, zzaej, 
//			zzajh, zzaef, zzabm

public abstract class zzabf
	implements zzalc, zzasd
{

	protected zzabf(Context context, zzaji zzaji1, zzaqw zzaqw1, zzabm zzabm1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #31  <Method void Object()>
	//    6   12:putfield        #33  <Field Object zzbzh>
		zzbzi = new AtomicBoolean(true);
	//    7   15:aload_0         
	//    8   16:new             #35  <Class AtomicBoolean>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:invokespecial   #38  <Method void AtomicBoolean(boolean)>
	//   12   24:putfield        #40  <Field AtomicBoolean zzbzi>
		mContext = context;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #42  <Field Context mContext>
		zzbze = zzaji1;
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:putfield        #44  <Field zzaji zzbze>
		zzbzf = zzbze.zzcos;
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #44  <Field zzaji zzbze>
	//   22   42:getfield        #49  <Field zzaej zzaji.zzcos>
	//   23   45:putfield        #51  <Field zzaej zzbzf>
		zzbnd = zzaqw1;
	//   24   48:aload_0         
	//   25   49:aload_3         
	//   26   50:putfield        #53  <Field zzaqw zzbnd>
		zzbzd = zzabm1;
	//   27   53:aload_0         
	//   28   54:aload           4
	//   29   56:putfield        #55  <Field zzabm zzbzd>
	//   30   59:return          
	}

	static AtomicBoolean zza(zzabf zzabf1)
	{
		return zzabf1.zzbzi;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AtomicBoolean zzbzi>
	//    2    4:areturn         
	}

	public void cancel()
	{
		if(!zzbzi.getAndSet(false))
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field AtomicBoolean zzbzi>
	//*   2    4:iconst_0        
	//*   3    5:invokevirtual   #63  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            12
		{
			return;
	//    5   11:return          
		} else
		{
			zzbnd.stopLoading();
	//    6   12:aload_0         
	//    7   13:getfield        #53  <Field zzaqw zzbnd>
	//    8   16:invokeinterface #68  <Method void zzaqw.stopLoading()>
			zzbv.zzem();
	//    9   21:invokestatic    #74  <Method zzakq zzbv.zzem()>
	//   10   24:pop             
			zzakq.zzi(zzbnd);
	//   11   25:aload_0         
	//   12   26:getfield        #53  <Field zzaqw zzbnd>
	//   13   29:invokestatic    #80  <Method boolean zzakq.zzi(zzaqw)>
	//   14   32:pop             
			zzz(-1);
	//   15   33:aload_0         
	//   16   34:iconst_m1       
	//   17   35:invokevirtual   #84  <Method void zzz(int)>
			zzakk.zzcrm.removeCallbacks(zzbzg);
	//   18   38:getstatic       #90  <Field Handler zzakk.zzcrm>
	//   19   41:aload_0         
	//   20   42:getfield        #92  <Field Runnable zzbzg>
	//   21   45:invokevirtual   #98  <Method void Handler.removeCallbacks(Runnable)>
			return;
	//   22   48:return          
		}
	}

	public final void zze(boolean flag)
	{
		zzakb.zzck("WebView finished loading.");
	//    0    0:ldc1            #101 <String "WebView finished loading.">
	//    1    2:invokestatic    #107 <Method void zzakb.zzck(String)>
		AtomicBoolean atomicboolean = zzbzi;
	//    2    5:aload_0         
	//    3    6:getfield        #40  <Field AtomicBoolean zzbzi>
	//    4    9:astore_3        
		byte byte0 = 0;
	//    5   10:iconst_0        
	//    6   11:istore_2        
		if(!atomicboolean.getAndSet(false))
	//*   7   12:aload_3         
	//*   8   13:iconst_0        
	//*   9   14:invokevirtual   #63  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*  10   17:ifne            21
			return;
	//   11   20:return          
		if(flag)
	//*  12   21:iload_1         
	//*  13   22:ifeq            28
			byte0 = -2;
	//   14   25:bipush          -2
	//   15   27:istore_2        
		zzz(((int) (byte0)));
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #84  <Method void zzz(int)>
		zzakk.zzcrm.removeCallbacks(zzbzg);
	//   19   33:getstatic       #90  <Field Handler zzakk.zzcrm>
	//   20   36:aload_0         
	//   21   37:getfield        #92  <Field Runnable zzbzg>
	//   22   40:invokevirtual   #98  <Method void Handler.removeCallbacks(Runnable)>
	//   23   43:return          
	}

	protected abstract void zzns();

	public final Object zznt()
	{
		Preconditions.checkMainThread("Webview render task needs to be called on UI thread.");
	//    0    0:ldc1            #112 <String "Webview render task needs to be called on UI thread.">
	//    1    2:invokestatic    #117 <Method void Preconditions.checkMainThread(String)>
		zzbzg = ((Runnable) (new zzabg(this)));
	//    2    5:aload_0         
	//    3    6:new             #119 <Class zzabg>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:invokespecial   #122 <Method void zzabg(zzabf)>
	//    7   14:putfield        #92  <Field Runnable zzbzg>
		Handler handler = zzakk.zzcrm;
	//    8   17:getstatic       #90  <Field Handler zzakk.zzcrm>
	//    9   20:astore_1        
		Runnable runnable = zzbzg;
	//   10   21:aload_0         
	//   11   22:getfield        #92  <Field Runnable zzbzg>
	//   12   25:astore_2        
		zzna zzna = zznk.zzbao;
	//   13   26:getstatic       #128 <Field zzna zznk.zzbao>
	//   14   29:astore_3        
		handler.postDelayed(runnable, ((Long)zzkb.zzik().zzd(zzna)).longValue());
	//   15   30:aload_1         
	//   16   31:aload_2         
	//   17   32:invokestatic    #134 <Method zzni zzkb.zzik()>
	//   18   35:aload_3         
	//   19   36:invokevirtual   #140 <Method Object zzni.zzd(zzna)>
	//   20   39:checkcast       #142 <Class Long>
	//   21   42:invokevirtual   #146 <Method long Long.longValue()>
	//   22   45:invokevirtual   #150 <Method boolean Handler.postDelayed(Runnable, long)>
	//   23   48:pop             
		zzns();
	//   24   49:aload_0         
	//   25   50:invokevirtual   #152 <Method void zzns()>
		return ((Object) (null));
	//   26   53:aconst_null     
	//   27   54:areturn         
	}

	protected void zzz(int i)
	{
		if(i != -2)
	//*   0    0:iload_1         
	//*   1    1:bipush          -2
	//*   2    3:icmpeq          25
			zzbzf = new zzaej(i, zzbzf.zzbsu);
	//    3    6:aload_0         
	//    4    7:new             #154 <Class zzaej>
	//    5   10:dup             
	//    6   11:iload_1         
	//    7   12:aload_0         
	//    8   13:getfield        #51  <Field zzaej zzbzf>
	//    9   16:getfield        #158 <Field long zzaej.zzbsu>
	//   10   19:invokespecial   #161 <Method void zzaej(int, long)>
	//   11   22:putfield        #51  <Field zzaej zzbzf>
		zzbnd.zztz();
	//   12   25:aload_0         
	//   13   26:getfield        #53  <Field zzaqw zzbnd>
	//   14   29:invokeinterface #164 <Method void zzaqw.zztz()>
		zzabm zzabm1 = zzbzd;
	//   15   34:aload_0         
	//   16   35:getfield        #55  <Field zzabm zzbzd>
	//   17   38:astore_2        
		zzaef zzaef1 = zzbze.zzcgs;
	//   18   39:aload_0         
	//   19   40:getfield        #44  <Field zzaji zzbze>
	//   20   43:getfield        #168 <Field zzaef zzaji.zzcgs>
	//   21   46:astore_3        
		zzabm1.zzb(new zzajh(zzaef1.zzccv, zzbnd, zzbzf.zzbsn, i, zzbzf.zzbso, zzbzf.zzces, zzbzf.orientation, zzbzf.zzbsu, zzaef1.zzccy, zzbzf.zzceq, ((zzwx) (null)), ((zzxq) (null)), ((String) (null)), ((zzwy) (null)), ((zzxa) (null)), zzbzf.zzcer, zzbze.zzacv, zzbzf.zzcep, zzbze.zzcoh, zzbzf.zzceu, zzbzf.zzcev, zzbze.zzcob, ((zzpb) (null)), zzbzf.zzcfe, zzbzf.zzcff, zzbzf.zzcfg, zzbzf.zzcfh, zzbzf.zzcfi, ((String) (null)), zzbzf.zzbsr, zzbzf.zzcfl, zzbze.zzcoq, zzbze.zzcos.zzzl, zzbze.zzcor, zzbze.zzcos.zzcfp, zzbzf.zzbsp, zzbze.zzcos.zzzm, zzbze.zzcos.zzcfq));
	//   22   47:aload_2         
	//   23   48:new             #170 <Class zzajh>
	//   24   51:dup             
	//   25   52:aload_3         
	//   26   53:getfield        #176 <Field zzjj zzaef.zzccv>
	//   27   56:aload_0         
	//   28   57:getfield        #53  <Field zzaqw zzbnd>
	//   29   60:aload_0         
	//   30   61:getfield        #51  <Field zzaej zzbzf>
	//   31   64:getfield        #180 <Field java.util.List zzaej.zzbsn>
	//   32   67:iload_1         
	//   33   68:aload_0         
	//   34   69:getfield        #51  <Field zzaej zzbzf>
	//   35   72:getfield        #183 <Field java.util.List zzaej.zzbso>
	//   36   75:aload_0         
	//   37   76:getfield        #51  <Field zzaej zzbzf>
	//   38   79:getfield        #186 <Field java.util.List zzaej.zzces>
	//   39   82:aload_0         
	//   40   83:getfield        #51  <Field zzaej zzbzf>
	//   41   86:getfield        #190 <Field int zzaej.orientation>
	//   42   89:aload_0         
	//   43   90:getfield        #51  <Field zzaej zzbzf>
	//   44   93:getfield        #158 <Field long zzaej.zzbsu>
	//   45   96:aload_3         
	//   46   97:getfield        #194 <Field String zzaef.zzccy>
	//   47  100:aload_0         
	//   48  101:getfield        #51  <Field zzaej zzbzf>
	//   49  104:getfield        #198 <Field boolean zzaej.zzceq>
	//   50  107:aconst_null     
	//   51  108:aconst_null     
	//   52  109:aconst_null     
	//   53  110:aconst_null     
	//   54  111:aconst_null     
	//   55  112:aload_0         
	//   56  113:getfield        #51  <Field zzaej zzbzf>
	//   57  116:getfield        #201 <Field long zzaej.zzcer>
	//   58  119:aload_0         
	//   59  120:getfield        #44  <Field zzaji zzbze>
	//   60  123:getfield        #205 <Field zzjn zzaji.zzacv>
	//   61  126:aload_0         
	//   62  127:getfield        #51  <Field zzaej zzbzf>
	//   63  130:getfield        #208 <Field long zzaej.zzcep>
	//   64  133:aload_0         
	//   65  134:getfield        #44  <Field zzaji zzbze>
	//   66  137:getfield        #211 <Field long zzaji.zzcoh>
	//   67  140:aload_0         
	//   68  141:getfield        #51  <Field zzaej zzbzf>
	//   69  144:getfield        #214 <Field long zzaej.zzceu>
	//   70  147:aload_0         
	//   71  148:getfield        #51  <Field zzaej zzbzf>
	//   72  151:getfield        #217 <Field String zzaej.zzcev>
	//   73  154:aload_0         
	//   74  155:getfield        #44  <Field zzaji zzbze>
	//   75  158:getfield        #221 <Field org.json.JSONObject zzaji.zzcob>
	//   76  161:aconst_null     
	//   77  162:aload_0         
	//   78  163:getfield        #51  <Field zzaej zzbzf>
	//   79  166:getfield        #225 <Field zzaig zzaej.zzcfe>
	//   80  169:aload_0         
	//   81  170:getfield        #51  <Field zzaej zzbzf>
	//   82  173:getfield        #228 <Field java.util.List zzaej.zzcff>
	//   83  176:aload_0         
	//   84  177:getfield        #51  <Field zzaej zzbzf>
	//   85  180:getfield        #231 <Field java.util.List zzaej.zzcfg>
	//   86  183:aload_0         
	//   87  184:getfield        #51  <Field zzaej zzbzf>
	//   88  187:getfield        #234 <Field boolean zzaej.zzcfh>
	//   89  190:aload_0         
	//   90  191:getfield        #51  <Field zzaej zzbzf>
	//   91  194:getfield        #238 <Field zzael zzaej.zzcfi>
	//   92  197:aconst_null     
	//   93  198:aload_0         
	//   94  199:getfield        #51  <Field zzaej zzbzf>
	//   95  202:getfield        #241 <Field java.util.List zzaej.zzbsr>
	//   96  205:aload_0         
	//   97  206:getfield        #51  <Field zzaej zzbzf>
	//   98  209:getfield        #244 <Field String zzaej.zzcfl>
	//   99  212:aload_0         
	//  100  213:getfield        #44  <Field zzaji zzbze>
	//  101  216:getfield        #248 <Field zzhs zzaji.zzcoq>
	//  102  219:aload_0         
	//  103  220:getfield        #44  <Field zzaji zzbze>
	//  104  223:getfield        #49  <Field zzaej zzaji.zzcos>
	//  105  226:getfield        #251 <Field boolean zzaej.zzzl>
	//  106  229:aload_0         
	//  107  230:getfield        #44  <Field zzaji zzbze>
	//  108  233:getfield        #254 <Field boolean zzaji.zzcor>
	//  109  236:aload_0         
	//  110  237:getfield        #44  <Field zzaji zzbze>
	//  111  240:getfield        #49  <Field zzaej zzaji.zzcos>
	//  112  243:getfield        #257 <Field boolean zzaej.zzcfp>
	//  113  246:aload_0         
	//  114  247:getfield        #51  <Field zzaej zzbzf>
	//  115  250:getfield        #260 <Field java.util.List zzaej.zzbsp>
	//  116  253:aload_0         
	//  117  254:getfield        #44  <Field zzaji zzbze>
	//  118  257:getfield        #49  <Field zzaej zzaji.zzcos>
	//  119  260:getfield        #263 <Field boolean zzaej.zzzm>
	//  120  263:aload_0         
	//  121  264:getfield        #44  <Field zzaji zzbze>
	//  122  267:getfield        #49  <Field zzaej zzaji.zzcos>
	//  123  270:getfield        #266 <Field String zzaej.zzcfq>
	//  124  273:invokespecial   #269 <Method void zzajh(zzjj, zzaqw, java.util.List, int, java.util.List, java.util.List, int, long, String, boolean, zzwx, zzxq, String, zzwy, zzxa, long, zzjn, long, long, long, String, org.json.JSONObject, zzpb, zzaig, java.util.List, java.util.List, boolean, zzael, String, java.util.List, String, zzhs, boolean, boolean, boolean, java.util.List, boolean, String)>
	//  125  276:invokeinterface #275 <Method void zzabm.zzb(zzajh)>
	//  126  281:return          
	}

	protected final Context mContext;
	protected final zzaqw zzbnd;
	private final zzabm zzbzd;
	private final zzaji zzbze;
	protected zzaej zzbzf;
	private Runnable zzbzg;
	private final Object zzbzh = new Object();
	private AtomicBoolean zzbzi;
}
