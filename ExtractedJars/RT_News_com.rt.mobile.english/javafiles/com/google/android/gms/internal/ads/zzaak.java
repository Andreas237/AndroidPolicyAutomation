// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaal, zzkb, zzamu, zzaqw, 
//			zzakk, zzasi, zzaah, zzaaj, 
//			zzmw, zzakb, zzang, zzasc

public final class zzaak extends zzaal
	implements zzv
{

	public zzaak(zzaqw zzaqw1, Context context, zzmw zzmw1)
	{
		super(zzaqw1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #33  <Method void zzaal(zzaqw)>
		zzbwy = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #35  <Field int zzbwy>
		zzbwz = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #37  <Field int zzbwz>
		zzbxb = -1;
	//    9   15:aload_0         
	//   10   16:iconst_m1       
	//   11   17:putfield        #39  <Field int zzbxb>
		zzbxc = -1;
	//   12   20:aload_0         
	//   13   21:iconst_m1       
	//   14   22:putfield        #41  <Field int zzbxc>
		zzbxd = -1;
	//   15   25:aload_0         
	//   16   26:iconst_m1       
	//   17   27:putfield        #43  <Field int zzbxd>
		zzbxe = -1;
	//   18   30:aload_0         
	//   19   31:iconst_m1       
	//   20   32:putfield        #45  <Field int zzbxe>
		zzbnd = zzaqw1;
	//   21   35:aload_0         
	//   22   36:aload_1         
	//   23   37:putfield        #47  <Field zzaqw zzbnd>
		mContext = context;
	//   24   40:aload_0         
	//   25   41:aload_2         
	//   26   42:putfield        #49  <Field Context mContext>
		zzbww = zzmw1;
	//   27   45:aload_0         
	//   28   46:aload_3         
	//   29   47:putfield        #51  <Field zzmw zzbww>
		zzaeu = (WindowManager)context.getSystemService("window");
	//   30   50:aload_0         
	//   31   51:aload_2         
	//   32   52:ldc1            #53  <String "window">
	//   33   54:invokevirtual   #59  <Method Object Context.getSystemService(String)>
	//   34   57:checkcast       #61  <Class WindowManager>
	//   35   60:putfield        #63  <Field WindowManager zzaeu>
	//   36   63:return          
	}

	public final void zza(Object obj, Map map)
	{
		zzagj = new DisplayMetrics();
	//    0    0:aload_0         
	//    1    1:new             #68  <Class DisplayMetrics>
	//    2    4:dup             
	//    3    5:invokespecial   #71  <Method void DisplayMetrics()>
	//    4    8:putfield        #73  <Field DisplayMetrics zzagj>
		obj = ((Object) (zzaeu.getDefaultDisplay()));
	//    5   11:aload_0         
	//    6   12:getfield        #63  <Field WindowManager zzaeu>
	//    7   15:invokeinterface #77  <Method Display WindowManager.getDefaultDisplay()>
	//    8   20:astore_1        
		((Display) (obj)).getMetrics(zzagj);
	//    9   21:aload_1         
	//   10   22:aload_0         
	//   11   23:getfield        #73  <Field DisplayMetrics zzagj>
	//   12   26:invokevirtual   #83  <Method void Display.getMetrics(DisplayMetrics)>
		zzbwx = zzagj.density;
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getfield        #73  <Field DisplayMetrics zzagj>
	//   16   34:getfield        #86  <Field float DisplayMetrics.density>
	//   17   37:putfield        #88  <Field float zzbwx>
		zzbxa = ((Display) (obj)).getRotation();
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:invokevirtual   #92  <Method int Display.getRotation()>
	//   21   45:putfield        #94  <Field int zzbxa>
		zzkb.zzif();
	//   22   48:invokestatic    #100 <Method zzamu zzkb.zzif()>
	//   23   51:pop             
		zzbwy = zzamu.zzb(zzagj, zzagj.widthPixels);
	//   24   52:aload_0         
	//   25   53:aload_0         
	//   26   54:getfield        #73  <Field DisplayMetrics zzagj>
	//   27   57:aload_0         
	//   28   58:getfield        #73  <Field DisplayMetrics zzagj>
	//   29   61:getfield        #103 <Field int DisplayMetrics.widthPixels>
	//   30   64:invokestatic    #109 <Method int zzamu.zzb(DisplayMetrics, int)>
	//   31   67:putfield        #35  <Field int zzbwy>
		zzkb.zzif();
	//   32   70:invokestatic    #100 <Method zzamu zzkb.zzif()>
	//   33   73:pop             
		zzbwz = zzamu.zzb(zzagj, zzagj.heightPixels);
	//   34   74:aload_0         
	//   35   75:aload_0         
	//   36   76:getfield        #73  <Field DisplayMetrics zzagj>
	//   37   79:aload_0         
	//   38   80:getfield        #73  <Field DisplayMetrics zzagj>
	//   39   83:getfield        #112 <Field int DisplayMetrics.heightPixels>
	//   40   86:invokestatic    #109 <Method int zzamu.zzb(DisplayMetrics, int)>
	//   41   89:putfield        #37  <Field int zzbwz>
		obj = ((Object) (zzbnd.zzto()));
	//   42   92:aload_0         
	//   43   93:getfield        #47  <Field zzaqw zzbnd>
	//   44   96:invokeinterface #118 <Method Activity zzaqw.zzto()>
	//   45  101:astore_1        
		int i;
		if(obj != null && ((Activity) (obj)).getWindow() != null)
	//*  46  102:aload_1         
	//*  47  103:ifnull          161
	//*  48  106:aload_1         
	//*  49  107:invokevirtual   #124 <Method android.view.Window Activity.getWindow()>
	//*  50  110:ifnonnull       116
	//*  51  113:goto            161
		{
			zzbv.zzek();
	//   52  116:invokestatic    #130 <Method zzakk zzbv.zzek()>
	//   53  119:pop             
			obj = ((Object) (zzakk.zzf(((Activity) (obj)))));
	//   54  120:aload_1         
	//   55  121:invokestatic    #136 <Method int[] zzakk.zzf(Activity)>
	//   56  124:astore_1        
			zzkb.zzif();
	//   57  125:invokestatic    #100 <Method zzamu zzkb.zzif()>
	//   58  128:pop             
			zzbxb = zzamu.zzb(zzagj, obj[0]);
	//   59  129:aload_0         
	//   60  130:aload_0         
	//   61  131:getfield        #73  <Field DisplayMetrics zzagj>
	//   62  134:aload_1         
	//   63  135:iconst_0        
	//   64  136:iaload          
	//   65  137:invokestatic    #109 <Method int zzamu.zzb(DisplayMetrics, int)>
	//   66  140:putfield        #39  <Field int zzbxb>
			zzkb.zzif();
	//   67  143:invokestatic    #100 <Method zzamu zzkb.zzif()>
	//   68  146:pop             
			i = zzamu.zzb(zzagj, obj[1]);
	//   69  147:aload_0         
	//   70  148:getfield        #73  <Field DisplayMetrics zzagj>
	//   71  151:aload_1         
	//   72  152:iconst_1        
	//   73  153:iaload          
	//   74  154:invokestatic    #109 <Method int zzamu.zzb(DisplayMetrics, int)>
	//   75  157:istore_3        
		} else
	//*  76  158:goto            174
		{
			zzbxb = zzbwy;
	//   77  161:aload_0         
	//   78  162:aload_0         
	//   79  163:getfield        #35  <Field int zzbwy>
	//   80  166:putfield        #39  <Field int zzbxb>
			i = zzbwz;
	//   81  169:aload_0         
	//   82  170:getfield        #37  <Field int zzbwz>
	//   83  173:istore_3        
		}
		zzbxc = i;
	//   84  174:aload_0         
	//   85  175:iload_3         
	//   86  176:putfield        #41  <Field int zzbxc>
		if(zzbnd.zzud().zzvs())
	//*  87  179:aload_0         
	//*  88  180:getfield        #47  <Field zzaqw zzbnd>
	//*  89  183:invokeinterface #140 <Method zzasi zzaqw.zzud()>
	//*  90  188:invokevirtual   #146 <Method boolean zzasi.zzvs()>
	//*  91  191:ifeq            213
		{
			zzbxd = zzbwy;
	//   92  194:aload_0         
	//   93  195:aload_0         
	//   94  196:getfield        #35  <Field int zzbwy>
	//   95  199:putfield        #43  <Field int zzbxd>
			zzbxe = zzbwz;
	//   96  202:aload_0         
	//   97  203:aload_0         
	//   98  204:getfield        #37  <Field int zzbwz>
	//   99  207:putfield        #45  <Field int zzbxe>
		} else
	//* 100  210:goto            224
		{
			zzbnd.measure(0, 0);
	//  101  213:aload_0         
	//  102  214:getfield        #47  <Field zzaqw zzbnd>
	//  103  217:iconst_0        
	//  104  218:iconst_0        
	//  105  219:invokeinterface #150 <Method void zzaqw.measure(int, int)>
		}
		((zzaal)this).zza(zzbwy, zzbwz, zzbxb, zzbxc, zzbwx, zzbxa);
	//  106  224:aload_0         
	//  107  225:aload_0         
	//  108  226:getfield        #35  <Field int zzbwy>
	//  109  229:aload_0         
	//  110  230:getfield        #37  <Field int zzbwz>
	//  111  233:aload_0         
	//  112  234:getfield        #39  <Field int zzbxb>
	//  113  237:aload_0         
	//  114  238:getfield        #41  <Field int zzbxc>
	//  115  241:aload_0         
	//  116  242:getfield        #88  <Field float zzbwx>
	//  117  245:aload_0         
	//  118  246:getfield        #94  <Field int zzbxa>
	//  119  249:invokevirtual   #153 <Method void zzaal.zza(int, int, int, int, float, int)>
		obj = ((Object) (new zzaah((new zzaaj()).zzo(zzbww.zziw()).zzn(zzbww.zzix()).zzp(zzbww.zziz()).zzq(zzbww.zziy()).zzr(true), ((zzaai) (null)))));
	//  120  252:new             #155 <Class zzaah>
	//  121  255:dup             
	//  122  256:new             #157 <Class zzaaj>
	//  123  259:dup             
	//  124  260:invokespecial   #158 <Method void zzaaj()>
	//  125  263:aload_0         
	//  126  264:getfield        #51  <Field zzmw zzbww>
	//  127  267:invokevirtual   #163 <Method boolean zzmw.zziw()>
	//  128  270:invokevirtual   #167 <Method zzaaj zzaaj.zzo(boolean)>
	//  129  273:aload_0         
	//  130  274:getfield        #51  <Field zzmw zzbww>
	//  131  277:invokevirtual   #170 <Method boolean zzmw.zzix()>
	//  132  280:invokevirtual   #173 <Method zzaaj zzaaj.zzn(boolean)>
	//  133  283:aload_0         
	//  134  284:getfield        #51  <Field zzmw zzbww>
	//  135  287:invokevirtual   #176 <Method boolean zzmw.zziz()>
	//  136  290:invokevirtual   #179 <Method zzaaj zzaaj.zzp(boolean)>
	//  137  293:aload_0         
	//  138  294:getfield        #51  <Field zzmw zzbww>
	//  139  297:invokevirtual   #182 <Method boolean zzmw.zziy()>
	//  140  300:invokevirtual   #185 <Method zzaaj zzaaj.zzq(boolean)>
	//  141  303:iconst_1        
	//  142  304:invokevirtual   #188 <Method zzaaj zzaaj.zzr(boolean)>
	//  143  307:aconst_null     
	//  144  308:invokespecial   #191 <Method void zzaah(zzaaj, zzaai)>
	//  145  311:astore_1        
		zzbnd.zza("onDeviceFeaturesReceived", ((zzaah) (obj)).zzng());
	//  146  312:aload_0         
	//  147  313:getfield        #47  <Field zzaqw zzbnd>
	//  148  316:ldc1            #193 <String "onDeviceFeaturesReceived">
	//  149  318:aload_1         
	//  150  319:invokevirtual   #197 <Method org.json.JSONObject zzaah.zzng()>
	//  151  322:invokeinterface #200 <Method void zzaqw.zza(String, org.json.JSONObject)>
		obj = ((Object) (new int[2]));
	//  152  327:iconst_2        
	//  153  328:newarray        int[]
	//  154  330:astore_1        
		zzbnd.getLocationOnScreen(((int []) (obj)));
	//  155  331:aload_0         
	//  156  332:getfield        #47  <Field zzaqw zzbnd>
	//  157  335:aload_1         
	//  158  336:invokeinterface #204 <Method void zzaqw.getLocationOnScreen(int[])>
		zzkb.zzif();
	//  159  341:invokestatic    #100 <Method zzamu zzkb.zzif()>
	//  160  344:pop             
		i = zzamu.zzb(mContext, obj[0]);
	//  161  345:aload_0         
	//  162  346:getfield        #49  <Field Context mContext>
	//  163  349:aload_1         
	//  164  350:iconst_0        
	//  165  351:iaload          
	//  166  352:invokestatic    #207 <Method int zzamu.zzb(Context, int)>
	//  167  355:istore_3        
		zzkb.zzif();
	//  168  356:invokestatic    #100 <Method zzamu zzkb.zzif()>
	//  169  359:pop             
		zzc(i, zzamu.zzb(mContext, obj[1]));
	//  170  360:aload_0         
	//  171  361:iload_3         
	//  172  362:aload_0         
	//  173  363:getfield        #49  <Field Context mContext>
	//  174  366:aload_1         
	//  175  367:iconst_1        
	//  176  368:iaload          
	//  177  369:invokestatic    #207 <Method int zzamu.zzb(Context, int)>
	//  178  372:invokevirtual   #210 <Method void zzc(int, int)>
		if(zzakb.isLoggable(2))
	//* 179  375:iconst_2        
	//* 180  376:invokestatic    #216 <Method boolean zzakb.isLoggable(int)>
	//* 181  379:ifeq            387
			zzakb.zzdj("Dispatching Ready Event.");
	//  182  382:ldc1            #218 <String "Dispatching Ready Event.">
	//  183  384:invokestatic    #222 <Method void zzakb.zzdj(String)>
		((zzaal)this).zzbx(zzbnd.zztq().zzcw);
	//  184  387:aload_0         
	//  185  388:aload_0         
	//  186  389:getfield        #47  <Field zzaqw zzbnd>
	//  187  392:invokeinterface #226 <Method zzang zzaqw.zztq()>
	//  188  397:getfield        #232 <Field String zzang.zzcw>
	//  189  400:invokevirtual   #235 <Method void zzaal.zzbx(String)>
	//  190  403:return          
	}

	public final void zzc(int i, int j)
	{
		boolean flag = mContext instanceof Activity;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Context mContext>
	//    2    4:instanceof      #120 <Class Activity>
	//    3    7:istore          4
		int k = 0;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		if(flag)
	//*   6   11:iload           4
	//*   7   13:ifeq            32
			k = zzbv.zzek().zzh((Activity)mContext)[0];
	//    8   16:invokestatic    #130 <Method zzakk zzbv.zzek()>
	//    9   19:aload_0         
	//   10   20:getfield        #49  <Field Context mContext>
	//   11   23:checkcast       #120 <Class Activity>
	//   12   26:invokevirtual   #238 <Method int[] zzakk.zzh(Activity)>
	//   13   29:iconst_0        
	//   14   30:iaload          
	//   15   31:istore_3        
		if(zzbnd.zzud() == null || !zzbnd.zzud().zzvs())
	//*  16   32:aload_0         
	//*  17   33:getfield        #47  <Field zzaqw zzbnd>
	//*  18   36:invokeinterface #140 <Method zzasi zzaqw.zzud()>
	//*  19   41:ifnull          59
	//*  20   44:aload_0         
	//*  21   45:getfield        #47  <Field zzaqw zzbnd>
	//*  22   48:invokeinterface #140 <Method zzasi zzaqw.zzud()>
	//*  23   53:invokevirtual   #146 <Method boolean zzasi.zzvs()>
	//*  24   56:ifne            107
		{
			zzkb.zzif();
	//   25   59:invokestatic    #100 <Method zzamu zzkb.zzif()>
	//   26   62:pop             
			zzbxd = zzamu.zzb(mContext, zzbnd.getWidth());
	//   27   63:aload_0         
	//   28   64:aload_0         
	//   29   65:getfield        #49  <Field Context mContext>
	//   30   68:aload_0         
	//   31   69:getfield        #47  <Field zzaqw zzbnd>
	//   32   72:invokeinterface #241 <Method int zzaqw.getWidth()>
	//   33   77:invokestatic    #207 <Method int zzamu.zzb(Context, int)>
	//   34   80:putfield        #43  <Field int zzbxd>
			zzkb.zzif();
	//   35   83:invokestatic    #100 <Method zzamu zzkb.zzif()>
	//   36   86:pop             
			zzbxe = zzamu.zzb(mContext, zzbnd.getHeight());
	//   37   87:aload_0         
	//   38   88:aload_0         
	//   39   89:getfield        #49  <Field Context mContext>
	//   40   92:aload_0         
	//   41   93:getfield        #47  <Field zzaqw zzbnd>
	//   42   96:invokeinterface #244 <Method int zzaqw.getHeight()>
	//   43  101:invokestatic    #207 <Method int zzamu.zzb(Context, int)>
	//   44  104:putfield        #45  <Field int zzbxe>
		}
		((zzaal)this).zzc(i, j - k, zzbxd, zzbxe);
	//   45  107:aload_0         
	//   46  108:iload_1         
	//   47  109:iload_2         
	//   48  110:iload_3         
	//   49  111:isub            
	//   50  112:aload_0         
	//   51  113:getfield        #43  <Field int zzbxd>
	//   52  116:aload_0         
	//   53  117:getfield        #45  <Field int zzbxe>
	//   54  120:invokevirtual   #247 <Method void zzaal.zzc(int, int, int, int)>
		zzbnd.zzuf().zzb(i, j);
	//   55  123:aload_0         
	//   56  124:getfield        #47  <Field zzaqw zzbnd>
	//   57  127:invokeinterface #251 <Method zzasc zzaqw.zzuf()>
	//   58  132:iload_1         
	//   59  133:iload_2         
	//   60  134:invokeinterface #255 <Method void zzasc.zzb(int, int)>
	//   61  139:return          
	}

	private final Context mContext;
	private final WindowManager zzaeu;
	private DisplayMetrics zzagj;
	private final zzaqw zzbnd;
	private final zzmw zzbww;
	private float zzbwx;
	private int zzbwy;
	private int zzbwz;
	private int zzbxa;
	private int zzbxb;
	private int zzbxc;
	private int zzbxd;
	private int zzbxe;
}
