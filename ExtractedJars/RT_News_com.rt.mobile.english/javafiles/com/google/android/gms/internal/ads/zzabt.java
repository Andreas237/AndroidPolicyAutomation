// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzbc;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzajx, zzabv, zzalt, zzaji, 
//			zzaki, zzajh, zzakb, zzaef, 
//			zzaej, zzakk, zzabu, zzabm, 
//			zzci, zznx

public final class zzabt extends zzajx
{

	public zzabt(Context context, zzbc zzbc, zzaji zzaji1, zzci zzci, zzabm zzabm, zznx zznx)
	{
		this(zzaji1, zzabm, new zzabv(context, zzbc, new zzalt(context), zzci, zzaji1, zznx));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload           5
	//    3    4:new             #22  <Class zzabv>
	//    4    7:dup             
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:new             #24  <Class zzalt>
	//    8   13:dup             
	//    9   14:aload_1         
	//   10   15:invokespecial   #27  <Method void zzalt(Context)>
	//   11   18:aload           4
	//   12   20:aload_3         
	//   13   21:aload           6
	//   14   23:invokespecial   #30  <Method void zzabv(Context, zzbc, zzalt, zzci, zzaji, zznx)>
	//   15   26:invokespecial   #33  <Method void zzabt(zzaji, zzabm, zzabv)>
	//   16   29:return          
	}

	private zzabt(zzaji zzaji1, zzabm zzabm, zzabv zzabv1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void zzajx()>
		mLock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #39  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #40  <Method void Object()>
	//    6   12:putfield        #42  <Field Object mLock>
		zzbze = zzaji1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #44  <Field zzaji zzbze>
		zzbzf = zzaji1.zzcos;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #49  <Field zzaej zzaji.zzcos>
	//   13   25:putfield        #51  <Field zzaej zzbzf>
		zzbzd = zzabm;
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:putfield        #53  <Field zzabm zzbzd>
		zzbzu = zzabv1;
	//   17   33:aload_0         
	//   18   34:aload_3         
	//   19   35:putfield        #55  <Field zzabv zzbzu>
	//   20   38:return          
	}

	static zzabm zza(zzabt zzabt1)
	{
		return zzabt1.zzbzd;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzabm zzbzd>
	//    2    4:areturn         
	}

	public final void onStop()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(zzbzv != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #60  <Field Future zzbzv>
	//*   7   11:ifnull          25
				zzbzv.cancel(true);
	//    8   14:aload_0         
	//    9   15:getfield        #60  <Field Future zzbzv>
	//   10   18:iconst_1        
	//   11   19:invokeinterface #66  <Method boolean Future.cancel(boolean)>
	//   12   24:pop             
		}
	//   13   25:aload_1         
	//   14   26:monitorexit     
		return;
	//   15   27:return          
		exception;
	//   16   28:astore_2        
		obj;
	//   17   29:aload_1         
		JVM INSTR monitorexit ;
	//   18   30:monitorexit     
		throw exception;
	//   19   31:aload_2         
	//   20   32:athrow          
	}

	public final void zzdn()
	{
		byte byte0;
		Object obj;
		byte0 = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		obj = null;
	//    2    2:aconst_null     
	//    3    3:astore_2        
		synchronized(mLock)
	//*   4    4:aload_0         
	//*   5    5:getfield        #42  <Field Object mLock>
	//*   6    8:astore_3        
	//*   7    9:aload_3         
	//*   8   10:monitorenter    
		{
			zzbzv = ((Future) (zzaki.zza(((java.util.concurrent.Callable) (zzbzu)))));
	//    9   11:aload_0         
	//   10   12:aload_0         
	//   11   13:getfield        #55  <Field zzabv zzbzu>
	//   12   16:invokestatic    #80  <Method zzanz zzaki.zza(java.util.concurrent.Callable)>
	//   13   19:putfield        #60  <Field Future zzbzv>
		}
	//   14   22:aload_3         
	//   15   23:monitorexit     
		obj1 = ((Object) ((zzajh)zzbzv.get(60000L, TimeUnit.MILLISECONDS)));
	//   16   24:aload_0         
	//   17   25:getfield        #60  <Field Future zzbzv>
	//   18   28:ldc2w           #81  <Long 60000L>
	//   19   31:getstatic       #88  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   20   34:invokeinterface #92  <Method Object Future.get(long, TimeUnit)>
	//   21   39:checkcast       #94  <Class zzajh>
	//   22   42:astore_3        
		byte0 = -2;
	//   23   43:bipush          -2
	//   24   45:istore_1        
		obj = obj1;
	//   25   46:aload_3         
	//   26   47:astore_2        
		break MISSING_BLOCK_LABEL_76;
	//   27   48:goto            76
		exception;
	//   28   51:astore          4
		obj1;
	//   29   53:aload_3         
		JVM INSTR monitorexit ;
	//   30   54:monitorexit     
		TimeoutException timeoutexception;
		try
		{
			throw exception;
	//   31   55:aload           4
	//   32   57:athrow          
		}
	//*  33   58:ldc1            #96  <String "Timed out waiting for native ad.">
	//*  34   60:invokestatic    #102 <Method void zzakb.zzdk(String)>
	//*  35   63:iconst_2        
	//*  36   64:istore_1        
	//*  37   65:aload_0         
	//*  38   66:getfield        #60  <Field Future zzbzv>
	//*  39   69:iconst_1        
	//*  40   70:invokeinterface #66  <Method boolean Future.cancel(boolean)>
	//*  41   75:pop             
	//*  42   76:aload_2         
	//*  43   77:ifnull          83
	//*  44   80:goto            267
	//*  45   83:new             #94  <Class zzajh>
	//*  46   86:dup             
	//*  47   87:aload_0         
	//*  48   88:getfield        #44  <Field zzaji zzbze>
	//*  49   91:getfield        #106 <Field zzaef zzaji.zzcgs>
	//*  50   94:getfield        #112 <Field zzjj zzaef.zzccv>
	//*  51   97:aconst_null     
	//*  52   98:aconst_null     
	//*  53   99:iload_1         
	//*  54  100:aconst_null     
	//*  55  101:aconst_null     
	//*  56  102:aload_0         
	//*  57  103:getfield        #51  <Field zzaej zzbzf>
	//*  58  106:getfield        #118 <Field int zzaej.orientation>
	//*  59  109:aload_0         
	//*  60  110:getfield        #51  <Field zzaej zzbzf>
	//*  61  113:getfield        #122 <Field long zzaej.zzbsu>
	//*  62  116:aload_0         
	//*  63  117:getfield        #44  <Field zzaji zzbze>
	//*  64  120:getfield        #106 <Field zzaef zzaji.zzcgs>
	//*  65  123:getfield        #126 <Field String zzaef.zzccy>
	//*  66  126:iconst_0        
	//*  67  127:aconst_null     
	//*  68  128:aconst_null     
	//*  69  129:aconst_null     
	//*  70  130:aconst_null     
	//*  71  131:aconst_null     
	//*  72  132:aload_0         
	//*  73  133:getfield        #51  <Field zzaej zzbzf>
	//*  74  136:getfield        #129 <Field long zzaej.zzcer>
	//*  75  139:aload_0         
	//*  76  140:getfield        #44  <Field zzaji zzbze>
	//*  77  143:getfield        #133 <Field zzjn zzaji.zzacv>
	//*  78  146:aload_0         
	//*  79  147:getfield        #51  <Field zzaej zzbzf>
	//*  80  150:getfield        #136 <Field long zzaej.zzcep>
	//*  81  153:aload_0         
	//*  82  154:getfield        #44  <Field zzaji zzbze>
	//*  83  157:getfield        #139 <Field long zzaji.zzcoh>
	//*  84  160:aload_0         
	//*  85  161:getfield        #51  <Field zzaej zzbzf>
	//*  86  164:getfield        #142 <Field long zzaej.zzceu>
	//*  87  167:aload_0         
	//*  88  168:getfield        #51  <Field zzaej zzbzf>
	//*  89  171:getfield        #145 <Field String zzaej.zzcev>
	//*  90  174:aload_0         
	//*  91  175:getfield        #44  <Field zzaji zzbze>
	//*  92  178:getfield        #149 <Field org.json.JSONObject zzaji.zzcob>
	//*  93  181:aconst_null     
	//*  94  182:aconst_null     
	//*  95  183:aconst_null     
	//*  96  184:aconst_null     
	//*  97  185:aload_0         
	//*  98  186:getfield        #44  <Field zzaji zzbze>
	//*  99  189:getfield        #49  <Field zzaej zzaji.zzcos>
	//* 100  192:getfield        #153 <Field boolean zzaej.zzcfh>
	//* 101  195:aload_0         
	//* 102  196:getfield        #44  <Field zzaji zzbze>
	//* 103  199:getfield        #49  <Field zzaej zzaji.zzcos>
	//* 104  202:getfield        #157 <Field zzael zzaej.zzcfi>
	//* 105  205:aconst_null     
	//* 106  206:aconst_null     
	//* 107  207:aload_0         
	//* 108  208:getfield        #51  <Field zzaej zzbzf>
	//* 109  211:getfield        #160 <Field String zzaej.zzcfl>
	//* 110  214:aload_0         
	//* 111  215:getfield        #44  <Field zzaji zzbze>
	//* 112  218:getfield        #164 <Field zzhs zzaji.zzcoq>
	//* 113  221:aload_0         
	//* 114  222:getfield        #44  <Field zzaji zzbze>
	//* 115  225:getfield        #49  <Field zzaej zzaji.zzcos>
	//* 116  228:getfield        #167 <Field boolean zzaej.zzzl>
	//* 117  231:iconst_0        
	//* 118  232:aload_0         
	//* 119  233:getfield        #44  <Field zzaji zzbze>
	//* 120  236:getfield        #49  <Field zzaej zzaji.zzcos>
	//* 121  239:getfield        #170 <Field boolean zzaej.zzcfp>
	//* 122  242:aconst_null     
	//* 123  243:aload_0         
	//* 124  244:getfield        #44  <Field zzaji zzbze>
	//* 125  247:getfield        #49  <Field zzaej zzaji.zzcos>
	//* 126  250:getfield        #173 <Field boolean zzaej.zzzm>
	//* 127  253:aload_0         
	//* 128  254:getfield        #44  <Field zzaji zzbze>
	//* 129  257:getfield        #49  <Field zzaej zzaji.zzcos>
	//* 130  260:getfield        #176 <Field String zzaej.zzcfq>
	//* 131  263:invokespecial   #179 <Method void zzajh(zzjj, zzaqw, java.util.List, int, java.util.List, java.util.List, int, long, String, boolean, zzwx, zzxq, String, zzwy, zzxa, long, zzjn, long, long, long, String, org.json.JSONObject, zzpb, zzaig, java.util.List, java.util.List, boolean, zzael, String, java.util.List, String, zzhs, boolean, boolean, boolean, java.util.List, boolean, String)>
	//* 132  266:astore_2        
	//* 133  267:getstatic       #185 <Field Handler zzakk.zzcrm>
	//* 134  270:new             #187 <Class zzabu>
	//* 135  273:dup             
	//* 136  274:aload_0         
	//* 137  275:aload_2         
	//* 138  276:invokespecial   #190 <Method void zzabu(zzabt, zzajh)>
	//* 139  279:invokevirtual   #196 <Method boolean Handler.post(Runnable)>
	//* 140  282:pop             
	//* 141  283:return          
		// Misplaced declaration of an exception variable
		catch(TimeoutException timeoutexception)
		{
			zzakb.zzdk("Timed out waiting for native ad.");
			byte0 = 2;
			zzbzv.cancel(true);
		}
	//* 142  284:astore_3        
	//* 143  285:goto            58
		catch(Object obj2) { }
	//  144  288:astore_3        
		if(obj == null)
			obj = ((Object) (new zzajh(zzbze.zzcgs.zzccv, ((zzaqw) (null)), ((java.util.List) (null)), ((int) (byte0)), ((java.util.List) (null)), ((java.util.List) (null)), zzbzf.orientation, zzbzf.zzbsu, zzbze.zzcgs.zzccy, false, ((zzwx) (null)), ((zzxq) (null)), ((String) (null)), ((zzwy) (null)), ((zzxa) (null)), zzbzf.zzcer, zzbze.zzacv, zzbzf.zzcep, zzbze.zzcoh, zzbzf.zzceu, zzbzf.zzcev, zzbze.zzcob, ((zzpb) (null)), ((zzaig) (null)), ((java.util.List) (null)), ((java.util.List) (null)), zzbze.zzcos.zzcfh, zzbze.zzcos.zzcfi, ((String) (null)), ((java.util.List) (null)), zzbzf.zzcfl, zzbze.zzcoq, zzbze.zzcos.zzzl, false, zzbze.zzcos.zzcfp, ((java.util.List) (null)), zzbze.zzcos.zzzm, zzbze.zzcos.zzcfq)));
		zzakk.zzcrm.post(((Runnable) (new zzabu(this, ((zzajh) (obj))))));
		return;
	//* 145  289:goto            76
	}

	private final Object mLock;
	private final zzabm zzbzd;
	private final zzaji zzbze;
	private final zzaej zzbzf;
	private final zzabv zzbzu;
	private Future zzbzv;
}
