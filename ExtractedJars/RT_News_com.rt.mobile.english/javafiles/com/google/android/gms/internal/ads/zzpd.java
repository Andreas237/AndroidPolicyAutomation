// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.*;
import android.view.*;
import android.widget.*;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzoz, zzok, zzakb, zzpb, 
//			zzakq, zznk, zzkb, zzni, 
//			zzpa, zzci, zzce, zzacm, 
//			zzanm, zzakk, zzamu, zzoj, 
//			zzom, zzpc, zzpx, zzpw, 
//			zzajm, zzakd, zzane, zzarg, 
//			zzjn, zzasi, zzhs, zzarc, 
//			zzaqw, zzpf, zzaiy, zzaix, 
//			zzang, zzox, zzro

public class zzpd
	implements zzoz
{

	public zzpd(Context context, zzpa zzpa1, zzacm zzacm1, zzci zzci1, JSONObject jsonobject, zzpb zzpb1, zzang zzang, 
			String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #43  <Method void Object()>
	//    6   12:putfield        #45  <Field Object mLock>
		zzbjf = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #47  <Field WeakReference zzbjf>
		mContext = context;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #49  <Field Context mContext>
		zzbiw = zzpa1;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #51  <Field zzpa zzbiw>
		zzaad = zzacm1;
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:putfield        #53  <Field zzacm zzaad>
		zzbjc = zzci1;
	//   19   35:aload_0         
	//   20   36:aload           4
	//   21   38:putfield        #55  <Field zzci zzbjc>
		zzbja = jsonobject;
	//   22   41:aload_0         
	//   23   42:aload           5
	//   24   44:putfield        #57  <Field JSONObject zzbja>
		zzbjb = zzpb1;
	//   25   47:aload_0         
	//   26   48:aload           6
	//   27   50:putfield        #59  <Field zzpb zzbjb>
		zzyf = zzang;
	//   28   53:aload_0         
	//   29   54:aload           7
	//   30   56:putfield        #61  <Field zzang zzyf>
		zzaae = s;
	//   31   59:aload_0         
	//   32   60:aload           8
	//   33   62:putfield        #63  <Field String zzaae>
		zzbiz = new zzok(zzaad);
	//   34   65:aload_0         
	//   35   66:new             #65  <Class zzok>
	//   36   69:dup             
	//   37   70:aload_0         
	//   38   71:getfield        #53  <Field zzacm zzaad>
	//   39   74:invokespecial   #68  <Method void zzok(zzacm)>
	//   40   77:putfield        #70  <Field zzok zzbiz>
	//   41   80:return          
	}

	private final JSONObject zza(Map map, View view)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #78  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void JSONObject()>
	//    3    7:astore_3        
		if(map == null) goto _L2; else goto _L1
	//    4    8:aload_1         
	//    5    9:ifnull          394
_L1:
		if(view == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       18
			return jsonobject;
	//    8   16:aload_3         
	//    9   17:areturn         
		int ai[] = zzn(view);
	//   10   18:aload_2         
	//   11   19:invokestatic    #83  <Method int[] zzn(View)>
	//   12   22:astore          4
		map;
	//   13   24:aload_1         
		JVM INSTR monitorenter ;
	//   14   25:monitorenter    
		Iterator iterator = map.entrySet().iterator();
	//   15   26:aload_1         
	//   16   27:invokeinterface #89  <Method Set Map.entrySet()>
	//   17   32:invokeinterface #95  <Method Iterator Set.iterator()>
	//   18   37:astore          5
_L6:
		if(!iterator.hasNext()) goto _L4; else goto _L3
	//   19   39:aload           5
	//   20   41:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//   21   46:ifeq            385
_L3:
		java.util.Map.Entry entry;
		View view1;
		entry = (java.util.Map.Entry)iterator.next();
	//   22   49:aload           5
	//   23   51:invokeinterface #105 <Method Object Iterator.next()>
	//   24   56:checkcast       #107 <Class java.util.Map$Entry>
	//   25   59:astore          6
		view1 = (View)((WeakReference)entry.getValue()).get();
	//   26   61:aload           6
	//   27   63:invokeinterface #110 <Method Object java.util.Map$Entry.getValue()>
	//   28   68:checkcast       #112 <Class WeakReference>
	//   29   71:invokevirtual   #115 <Method Object WeakReference.get()>
	//   30   74:checkcast       #117 <Class View>
	//   31   77:astore          8
		if(view1 == null) goto _L6; else goto _L5
	//   32   79:aload           8
	//   33   81:ifnull          39
_L5:
		JSONObject jsonobject1;
		int ai1[];
		ai1 = zzn(view1);
	//   34   84:aload           8
	//   35   86:invokestatic    #83  <Method int[] zzn(View)>
	//   36   89:astore          9
		jsonobject1 = new JSONObject();
	//   37   91:new             #78  <Class JSONObject>
	//   38   94:dup             
	//   39   95:invokespecial   #79  <Method void JSONObject()>
	//   40   98:astore          7
		view = ((View) (new JSONObject()));
	//   41  100:new             #78  <Class JSONObject>
	//   42  103:dup             
	//   43  104:invokespecial   #79  <Method void JSONObject()>
	//   44  107:astore_2        
		((JSONObject) (view)).put("width", zzv(view1.getMeasuredWidth()));
	//   45  108:aload_2         
	//   46  109:ldc1            #119 <String "width">
	//   47  111:aload_0         
	//   48  112:aload           8
	//   49  114:invokevirtual   #123 <Method int View.getMeasuredWidth()>
	//   50  117:invokespecial   #127 <Method int zzv(int)>
	//   51  120:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//   52  123:pop             
		((JSONObject) (view)).put("height", zzv(view1.getMeasuredHeight()));
	//   53  124:aload_2         
	//   54  125:ldc1            #133 <String "height">
	//   55  127:aload_0         
	//   56  128:aload           8
	//   57  130:invokevirtual   #136 <Method int View.getMeasuredHeight()>
	//   58  133:invokespecial   #127 <Method int zzv(int)>
	//   59  136:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//   60  139:pop             
		((JSONObject) (view)).put("x", zzv(ai1[0] - ai[0]));
	//   61  140:aload_2         
	//   62  141:ldc1            #138 <String "x">
	//   63  143:aload_0         
	//   64  144:aload           9
	//   65  146:iconst_0        
	//   66  147:iaload          
	//   67  148:aload           4
	//   68  150:iconst_0        
	//   69  151:iaload          
	//   70  152:isub            
	//   71  153:invokespecial   #127 <Method int zzv(int)>
	//   72  156:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//   73  159:pop             
		((JSONObject) (view)).put("y", zzv(ai1[1] - ai[1]));
	//   74  160:aload_2         
	//   75  161:ldc1            #140 <String "y">
	//   76  163:aload_0         
	//   77  164:aload           9
	//   78  166:iconst_1        
	//   79  167:iaload          
	//   80  168:aload           4
	//   81  170:iconst_1        
	//   82  171:iaload          
	//   83  172:isub            
	//   84  173:invokespecial   #127 <Method int zzv(int)>
	//   85  176:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//   86  179:pop             
		((JSONObject) (view)).put("relative_to", "ad_view");
	//   87  180:aload_2         
	//   88  181:ldc1            #142 <String "relative_to">
	//   89  183:ldc1            #144 <String "ad_view">
	//   90  185:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//   91  188:pop             
		jsonobject1.put("frame", ((Object) (view)));
	//   92  189:aload           7
	//   93  191:ldc1            #149 <String "frame">
	//   94  193:aload_2         
	//   95  194:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//   96  197:pop             
		view = ((View) (new Rect()));
	//   97  198:new             #151 <Class Rect>
	//   98  201:dup             
	//   99  202:invokespecial   #152 <Method void Rect()>
	//  100  205:astore_2        
		if(view1.getLocalVisibleRect(((Rect) (view))))
	//* 101  206:aload           8
	//* 102  208:aload_2         
	//* 103  209:invokevirtual   #156 <Method boolean View.getLocalVisibleRect(Rect)>
	//* 104  212:ifeq            224
		{
			view = ((View) (zzb(((Rect) (view)))));
	//  105  215:aload_0         
	//  106  216:aload_2         
	//  107  217:invokespecial   #160 <Method JSONObject zzb(Rect)>
	//  108  220:astore_2        
			break MISSING_BLOCK_LABEL_297;
	//  109  221:goto            297
		}
		view = ((View) (new JSONObject()));
	//  110  224:new             #78  <Class JSONObject>
	//  111  227:dup             
	//  112  228:invokespecial   #79  <Method void JSONObject()>
	//  113  231:astore_2        
		((JSONObject) (view)).put("width", 0);
	//  114  232:aload_2         
	//  115  233:ldc1            #119 <String "width">
	//  116  235:iconst_0        
	//  117  236:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//  118  239:pop             
		((JSONObject) (view)).put("height", 0);
	//  119  240:aload_2         
	//  120  241:ldc1            #133 <String "height">
	//  121  243:iconst_0        
	//  122  244:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//  123  247:pop             
		((JSONObject) (view)).put("x", zzv(ai1[0] - ai[0]));
	//  124  248:aload_2         
	//  125  249:ldc1            #138 <String "x">
	//  126  251:aload_0         
	//  127  252:aload           9
	//  128  254:iconst_0        
	//  129  255:iaload          
	//  130  256:aload           4
	//  131  258:iconst_0        
	//  132  259:iaload          
	//  133  260:isub            
	//  134  261:invokespecial   #127 <Method int zzv(int)>
	//  135  264:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//  136  267:pop             
		((JSONObject) (view)).put("y", zzv(ai1[1] - ai[1]));
	//  137  268:aload_2         
	//  138  269:ldc1            #140 <String "y">
	//  139  271:aload_0         
	//  140  272:aload           9
	//  141  274:iconst_1        
	//  142  275:iaload          
	//  143  276:aload           4
	//  144  278:iconst_1        
	//  145  279:iaload          
	//  146  280:isub            
	//  147  281:invokespecial   #127 <Method int zzv(int)>
	//  148  284:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//  149  287:pop             
		((JSONObject) (view)).put("relative_to", "ad_view");
	//  150  288:aload_2         
	//  151  289:ldc1            #142 <String "relative_to">
	//  152  291:ldc1            #144 <String "ad_view">
	//  153  293:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//  154  296:pop             
		jsonobject1.put("visible_bounds", ((Object) (view)));
	//  155  297:aload           7
	//  156  299:ldc1            #162 <String "visible_bounds">
	//  157  301:aload_2         
	//  158  302:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//  159  305:pop             
		if(view1 instanceof TextView)
	//* 160  306:aload           8
	//* 161  308:instanceof      #164 <Class TextView>
	//* 162  311:ifeq            357
		{
			view = ((View) ((TextView)view1));
	//  163  314:aload           8
	//  164  316:checkcast       #164 <Class TextView>
	//  165  319:astore_2        
			jsonobject1.put("text_color", ((TextView) (view)).getCurrentTextColor());
	//  166  320:aload           7
	//  167  322:ldc1            #166 <String "text_color">
	//  168  324:aload_2         
	//  169  325:invokevirtual   #169 <Method int TextView.getCurrentTextColor()>
	//  170  328:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//  171  331:pop             
			jsonobject1.put("font_size", ((TextView) (view)).getTextSize());
	//  172  332:aload           7
	//  173  334:ldc1            #171 <String "font_size">
	//  174  336:aload_2         
	//  175  337:invokevirtual   #175 <Method float TextView.getTextSize()>
	//  176  340:f2d             
	//  177  341:invokevirtual   #178 <Method JSONObject JSONObject.put(String, double)>
	//  178  344:pop             
			jsonobject1.put("text", ((Object) (((TextView) (view)).getText())));
	//  179  345:aload           7
	//  180  347:ldc1            #180 <String "text">
	//  181  349:aload_2         
	//  182  350:invokevirtual   #184 <Method CharSequence TextView.getText()>
	//  183  353:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//  184  356:pop             
		}
		jsonobject.put((String)entry.getKey(), ((Object) (jsonobject1)));
	//  185  357:aload_3         
	//  186  358:aload           6
	//  187  360:invokeinterface #187 <Method Object java.util.Map$Entry.getKey()>
	//  188  365:checkcast       #189 <Class String>
	//  189  368:aload           7
	//  190  370:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//  191  373:pop             
		  goto _L6
	//* 192  374:goto            39
_L7:
		zzakb.zzdk("Unable to get asset views information");
	//  193  377:ldc1            #191 <String "Unable to get asset views information">
	//  194  379:invokestatic    #197 <Method void zzakb.zzdk(String)>
		  goto _L6
	//* 195  382:goto            39
_L4:
		map;
	//  196  385:aload_1         
		JVM INSTR monitorexit ;
	//  197  386:monitorexit     
		return jsonobject;
	//  198  387:aload_3         
	//  199  388:areturn         
		view;
	//  200  389:astore_2        
		map;
	//  201  390:aload_1         
		JVM INSTR monitorexit ;
	//  202  391:monitorexit     
		throw view;
	//  203  392:aload_2         
	//  204  393:athrow          
_L2:
		return jsonobject;
	//  205  394:aload_3         
	//  206  395:areturn         
		view;
	//  207  396:astore_2        
		  goto _L7
	//* 208  397:goto            377
	}

	private final void zza(View view, JSONObject jsonobject, JSONObject jsonobject1, JSONObject jsonobject2, JSONObject jsonobject3, String s, JSONObject jsonobject4, 
			JSONObject jsonobject5)
	{
		boolean flag;
		Preconditions.checkMainThread("Invalid call from a non-UI thread.");
	//    0    0:ldc1            #204 <String "Invalid call from a non-UI thread.">
	//    1    2:invokestatic    #209 <Method void Preconditions.checkMainThread(String)>
		boolean flag1;
		JSONObject jsonobject6;
		try
		{
			jsonobject6 = new JSONObject();
	//    2    5:new             #78  <Class JSONObject>
	//    3    8:dup             
	//    4    9:invokespecial   #79  <Method void JSONObject()>
	//    5   12:astore          11
			jsonobject6.put("ad", ((Object) (zzbja)));
	//    6   14:aload           11
	//    7   16:ldc1            #211 <String "ad">
	//    8   18:aload_0         
	//    9   19:getfield        #57  <Field JSONObject zzbja>
	//   10   22:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//   11   25:pop             
		}
	//*  12   26:aload_3         
	//*  13   27:ifnull          39
	//*  14   30:aload           11
	//*  15   32:ldc1            #213 <String "asset_view_signal">
	//*  16   34:aload_3         
	//*  17   35:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//*  18   38:pop             
	//*  19   39:aload_2         
	//*  20   40:ifnull          52
	//*  21   43:aload           11
	//*  22   45:ldc1            #215 <String "ad_view_signal">
	//*  23   47:aload_2         
	//*  24   48:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//*  25   51:pop             
	//*  26   52:aload           7
	//*  27   54:ifnull          67
	//*  28   57:aload           11
	//*  29   59:ldc1            #217 <String "click_signal">
	//*  30   61:aload           7
	//*  31   63:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//*  32   66:pop             
	//*  33   67:aload           4
	//*  34   69:ifnull          82
	//*  35   72:aload           11
	//*  36   74:ldc1            #219 <String "scroll_view_signal">
	//*  37   76:aload           4
	//*  38   78:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//*  39   81:pop             
	//*  40   82:aload           5
	//*  41   84:ifnull          97
	//*  42   87:aload           11
	//*  43   89:ldc1            #221 <String "lock_screen_signal">
	//*  44   91:aload           5
	//*  45   93:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//*  46   96:pop             
	//*  47   97:new             #78  <Class JSONObject>
	//*  48  100:dup             
	//*  49  101:invokespecial   #79  <Method void JSONObject()>
	//*  50  104:astore          4
	//*  51  106:aload           4
	//*  52  108:ldc1            #223 <String "asset_id">
	//*  53  110:aload           6
	//*  54  112:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//*  55  115:pop             
	//*  56  116:aload           4
	//*  57  118:ldc1            #225 <String "template">
	//*  58  120:aload_0         
	//*  59  121:getfield        #59  <Field zzpb zzbjb>
	//*  60  124:invokeinterface #231 <Method String zzpb.zzkb()>
	//*  61  129:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//*  62  132:pop             
	//*  63  133:invokestatic    #237 <Method zzakq zzbv.zzem()>
	//*  64  136:pop             
	//*  65  137:aload           4
	//*  66  139:ldc1            #239 <String "is_privileged_process">
	//*  67  141:invokestatic    #244 <Method boolean zzakq.zzrp()>
	//*  68  144:invokevirtual   #247 <Method JSONObject JSONObject.put(String, boolean)>
	//*  69  147:pop             
	//*  70  148:getstatic       #253 <Field zzna zznk.zzbcf>
	//*  71  151:astore_2        
	//*  72  152:invokestatic    #259 <Method zzni zzkb.zzik()>
	//*  73  155:aload_2         
	//*  74  156:invokevirtual   #265 <Method Object zzni.zzd(zzna)>
	//*  75  159:checkcast       #267 <Class Boolean>
	//*  76  162:invokevirtual   #270 <Method boolean Boolean.booleanValue()>
	//*  77  165:istore          9
	//*  78  167:iconst_1        
	//*  79  168:istore          10
	//*  80  170:iload           9
	//*  81  172:ifeq            209
	//*  82  175:aload_0         
	//*  83  176:getfield        #70  <Field zzok zzbiz>
	//*  84  179:invokevirtual   #274 <Method zzro zzok.zzjw()>
	//*  85  182:ifnull          209
	//*  86  185:aload_0         
	//*  87  186:getfield        #57  <Field JSONObject zzbja>
	//*  88  189:ldc2            #276 <String "custom_one_point_five_click_enabled">
	//*  89  192:iconst_0        
	//*  90  193:invokevirtual   #280 <Method boolean JSONObject.optBoolean(String, boolean)>
	//*  91  196:ifeq            209
	//*  92  199:aload           4
	//*  93  201:ldc2            #282 <String "custom_one_point_five_click_eligible">
	//*  94  204:iconst_1        
	//*  95  205:invokevirtual   #247 <Method JSONObject JSONObject.put(String, boolean)>
	//*  96  208:pop             
	//*  97  209:aload           4
	//*  98  211:ldc2            #284 <String "timestamp">
	//*  99  214:invokestatic    #288 <Method Clock zzbv.zzer()>
	//* 100  217:invokeinterface #294 <Method long Clock.currentTimeMillis()>
	//* 101  222:invokevirtual   #297 <Method JSONObject JSONObject.put(String, long)>
	//* 102  225:pop             
	//* 103  226:aload_0         
	//* 104  227:getfield        #51  <Field zzpa zzbiw>
	//* 105  230:aload_0         
	//* 106  231:getfield        #59  <Field zzpb zzbjb>
	//* 107  234:invokeinterface #300 <Method String zzpb.getCustomTemplateId()>
	//* 108  239:invokeinterface #306 <Method zzrc zzpa.zzr(String)>
	//* 109  244:ifnull          441
	//* 110  247:iconst_1        
	//* 111  248:istore          9
	//* 112  250:goto            253
	//* 113  253:aload           4
	//* 114  255:ldc2            #308 <String "has_custom_click_handler">
	//* 115  258:iload           9
	//* 116  260:invokevirtual   #247 <Method JSONObject JSONObject.put(String, boolean)>
	//* 117  263:pop             
	//* 118  264:aload_0         
	//* 119  265:getfield        #51  <Field zzpa zzbiw>
	//* 120  268:aload_0         
	//* 121  269:getfield        #59  <Field zzpb zzbjb>
	//* 122  272:invokeinterface #300 <Method String zzpb.getCustomTemplateId()>
	//* 123  277:invokeinterface #306 <Method zzrc zzpa.zzr(String)>
	//* 124  282:ifnull          447
	//* 125  285:iload           10
	//* 126  287:istore          9
	//* 127  289:goto            292
	//* 128  292:aload           11
	//* 129  294:ldc2            #308 <String "has_custom_click_handler">
	//* 130  297:iload           9
	//* 131  299:invokevirtual   #247 <Method JSONObject JSONObject.put(String, boolean)>
	//* 132  302:pop             
	//* 133  303:aload_0         
	//* 134  304:getfield        #57  <Field JSONObject zzbja>
	//* 135  307:ldc2            #310 <String "tracking_urls_and_actions">
	//* 136  310:invokevirtual   #314 <Method JSONObject JSONObject.optJSONObject(String)>
	//* 137  313:astore_3        
	//* 138  314:aload_3         
	//* 139  315:astore_2        
	//* 140  316:aload_3         
	//* 141  317:ifnonnull       328
	//* 142  320:new             #78  <Class JSONObject>
	//* 143  323:dup             
	//* 144  324:invokespecial   #79  <Method void JSONObject()>
	//* 145  327:astore_2        
	//* 146  328:aload_2         
	//* 147  329:ldc2            #316 <String "click_string">
	//* 148  332:invokevirtual   #320 <Method String JSONObject.optString(String)>
	//* 149  335:astore_2        
	//* 150  336:aload           4
	//* 151  338:ldc2            #322 <String "click_signals">
	//* 152  341:aload_0         
	//* 153  342:getfield        #55  <Field zzci zzbjc>
	//* 154  345:invokevirtual   #328 <Method zzce zzci.zzaa()>
	//* 155  348:aload_0         
	//* 156  349:getfield        #49  <Field Context mContext>
	//* 157  352:aload_2         
	//* 158  353:aload_1         
	//* 159  354:invokeinterface #333 <Method String zzce.zza(Context, String, View)>
	//* 160  359:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//* 161  362:pop             
	//* 162  363:goto            374
	//* 163  366:astore_1        
	//* 164  367:ldc2            #335 <String "Exception obtaining click signals">
	//* 165  370:aload_1         
	//* 166  371:invokestatic    #338 <Method void zzakb.zzb(String, Throwable)>
	//* 167  374:aload           11
	//* 168  376:ldc2            #340 <String "click">
	//* 169  379:aload           4
	//* 170  381:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//* 171  384:pop             
	//* 172  385:aload           8
	//* 173  387:ifnull          401
	//* 174  390:aload           11
	//* 175  392:ldc2            #342 <String "provided_signals">
	//* 176  395:aload           8
	//* 177  397:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//* 178  400:pop             
	//* 179  401:aload           11
	//* 180  403:ldc2            #344 <String "ads_id">
	//* 181  406:aload_0         
	//* 182  407:getfield        #63  <Field String zzaae>
	//* 183  410:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//* 184  413:pop             
	//* 185  414:aload_0         
	//* 186  415:getfield        #53  <Field zzacm zzaad>
	//* 187  418:aload           11
	//* 188  420:invokeinterface #350 <Method zzanz zzacm.zzi(JSONObject)>
	//* 189  425:ldc2            #352 <String "NativeAdEngineImpl.performClick">
	//* 190  428:invokestatic    #357 <Method void zzanm.zza(zzanz, String)>
	//* 191  431:return          
		// Misplaced declaration of an exception variable
		catch(View view)
	//* 192  432:astore_1        
		{
			zzakb.zzb("Unable to create click JSON.", ((Throwable) (view)));
	//  193  433:ldc2            #359 <String "Unable to create click JSON.">
	//  194  436:aload_1         
	//  195  437:invokestatic    #338 <Method void zzakb.zzb(String, Throwable)>
			return;
	//  196  440:return          
		}
		if(jsonobject1 == null)
			break MISSING_BLOCK_LABEL_39;
		jsonobject6.put("asset_view_signal", ((Object) (jsonobject1)));
		if(jsonobject == null)
			break MISSING_BLOCK_LABEL_52;
		jsonobject6.put("ad_view_signal", ((Object) (jsonobject)));
		if(jsonobject4 == null)
			break MISSING_BLOCK_LABEL_67;
		jsonobject6.put("click_signal", ((Object) (jsonobject4)));
		if(jsonobject2 == null)
			break MISSING_BLOCK_LABEL_82;
		jsonobject6.put("scroll_view_signal", ((Object) (jsonobject2)));
		if(jsonobject3 == null)
			break MISSING_BLOCK_LABEL_97;
		jsonobject6.put("lock_screen_signal", ((Object) (jsonobject3)));
		jsonobject2 = new JSONObject();
		jsonobject2.put("asset_id", ((Object) (s)));
		jsonobject2.put("template", ((Object) (zzbjb.zzkb())));
		zzbv.zzem();
		jsonobject2.put("is_privileged_process", zzakq.zzrp());
		jsonobject = ((JSONObject) (zznk.zzbcf));
		flag = ((Boolean)zzkb.zzik().zzd(((zzna) (jsonobject)))).booleanValue();
		flag1 = true;
		if(!flag)
			break MISSING_BLOCK_LABEL_209;
		if(zzbiz.zzjw() != null && zzbja.optBoolean("custom_one_point_five_click_enabled", false))
			jsonobject2.put("custom_one_point_five_click_eligible", true);
		jsonobject2.put("timestamp", zzbv.zzer().currentTimeMillis());
		if(zzbiw.zzr(zzbjb.getCustomTemplateId()) != null)
			flag = true;
		else
			flag = false;
	//  197  441:iconst_0        
	//  198  442:istore          9
		jsonobject2.put("has_custom_click_handler", flag);
		if(zzbiw.zzr(zzbjb.getCustomTemplateId()) != null)
			flag = flag1;
		else
	//* 199  444:goto            253
			flag = false;
	//  200  447:iconst_0        
	//  201  448:istore          9
		jsonobject6.put("has_custom_click_handler", flag);
		jsonobject1 = zzbja.optJSONObject("tracking_urls_and_actions");
		jsonobject = jsonobject1;
		if(jsonobject1 != null)
			break MISSING_BLOCK_LABEL_328;
		jsonobject = new JSONObject();
		jsonobject = ((JSONObject) (jsonobject.optString("click_string")));
		jsonobject2.put("click_signals", ((Object) (zzbjc.zzaa().zza(mContext, ((String) (jsonobject)), view))));
		break MISSING_BLOCK_LABEL_374;
		view;
		zzakb.zzb("Exception obtaining click signals", ((Throwable) (view)));
		jsonobject6.put("click", ((Object) (jsonobject2)));
		if(jsonobject5 == null)
			break MISSING_BLOCK_LABEL_401;
		jsonobject6.put("provided_signals", ((Object) (jsonobject5)));
		jsonobject6.put("ads_id", ((Object) (zzaae)));
		zzanm.zza(zzaad.zzi(jsonobject6), "NativeAdEngineImpl.performClick");
		return;
	//* 202  450:goto            292
	}

	private final boolean zza(JSONObject jsonobject, JSONObject jsonobject1, JSONObject jsonobject2, JSONObject jsonobject3, JSONObject jsonobject4)
	{
		Preconditions.checkMainThread("Invalid call from a non-UI thread.");
	//    0    0:ldc1            #204 <String "Invalid call from a non-UI thread.">
	//    1    2:invokestatic    #209 <Method void Preconditions.checkMainThread(String)>
		if(zzbjd)
	//*   2    5:aload_0         
	//*   3    6:getfield        #362 <Field boolean zzbjd>
	//*   4    9:ifeq            14
			return true;
	//    5   12:iconst_1        
	//    6   13:ireturn         
		zzbjd = true;
	//    7   14:aload_0         
	//    8   15:iconst_1        
	//    9   16:putfield        #362 <Field boolean zzbjd>
		JSONObject jsonobject5;
		try
		{
			jsonobject5 = new JSONObject();
	//   10   19:new             #78  <Class JSONObject>
	//   11   22:dup             
	//   12   23:invokespecial   #79  <Method void JSONObject()>
	//   13   26:astore          6
			jsonobject5.put("ad", ((Object) (zzbja)));
	//   14   28:aload           6
	//   15   30:ldc1            #211 <String "ad">
	//   16   32:aload_0         
	//   17   33:getfield        #57  <Field JSONObject zzbja>
	//   18   36:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//   19   39:pop             
			jsonobject5.put("ads_id", ((Object) (zzaae)));
	//   20   40:aload           6
	//   21   42:ldc2            #344 <String "ads_id">
	//   22   45:aload_0         
	//   23   46:getfield        #63  <Field String zzaae>
	//   24   49:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//   25   52:pop             
		}
	//*  26   53:aload_2         
	//*  27   54:ifnull          66
	//*  28   57:aload           6
	//*  29   59:ldc1            #213 <String "asset_view_signal">
	//*  30   61:aload_2         
	//*  31   62:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//*  32   65:pop             
	//*  33   66:aload_1         
	//*  34   67:ifnull          79
	//*  35   70:aload           6
	//*  36   72:ldc1            #215 <String "ad_view_signal">
	//*  37   74:aload_1         
	//*  38   75:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//*  39   78:pop             
	//*  40   79:aload_3         
	//*  41   80:ifnull          92
	//*  42   83:aload           6
	//*  43   85:ldc1            #219 <String "scroll_view_signal">
	//*  44   87:aload_3         
	//*  45   88:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//*  46   91:pop             
	//*  47   92:aload           4
	//*  48   94:ifnull          107
	//*  49   97:aload           6
	//*  50   99:ldc1            #221 <String "lock_screen_signal">
	//*  51  101:aload           4
	//*  52  103:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//*  53  106:pop             
	//*  54  107:aload           5
	//*  55  109:ifnull          123
	//*  56  112:aload           6
	//*  57  114:ldc2            #342 <String "provided_signals">
	//*  58  117:aload           5
	//*  59  119:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//*  60  122:pop             
	//*  61  123:aload_0         
	//*  62  124:getfield        #53  <Field zzacm zzaad>
	//*  63  127:aload           6
	//*  64  129:invokeinterface #365 <Method zzanz zzacm.zzj(JSONObject)>
	//*  65  134:ldc2            #367 <String "NativeAdEngineImpl.recordImpression">
	//*  66  137:invokestatic    #357 <Method void zzanm.zza(zzanz, String)>
	//*  67  140:aload_0         
	//*  68  141:getfield        #51  <Field zzpa zzbiw>
	//*  69  144:aload_0         
	//*  70  145:invokeinterface #370 <Method void zzpa.zza(zzoz)>
	//*  71  150:aload_0         
	//*  72  151:getfield        #51  <Field zzpa zzbiw>
	//*  73  154:invokeinterface #373 <Method void com.google.android.gms.internal.ads.zzpa.zzbv()>
	//*  74  159:aload_0         
	//*  75  160:invokevirtual   #376 <Method void zzcr()>
	//*  76  163:iconst_1        
	//*  77  164:ireturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  78  165:astore_1        
		{
			zzakb.zzb("Unable to create impression JSON.", ((Throwable) (jsonobject)));
	//   79  166:ldc2            #378 <String "Unable to create impression JSON.">
	//   80  169:aload_1         
	//   81  170:invokestatic    #338 <Method void zzakb.zzb(String, Throwable)>
			return false;
	//   82  173:iconst_0        
	//   83  174:ireturn         
		}
		if(jsonobject1 == null)
			break MISSING_BLOCK_LABEL_66;
		jsonobject5.put("asset_view_signal", ((Object) (jsonobject1)));
		if(jsonobject == null)
			break MISSING_BLOCK_LABEL_79;
		jsonobject5.put("ad_view_signal", ((Object) (jsonobject)));
		if(jsonobject2 == null)
			break MISSING_BLOCK_LABEL_92;
		jsonobject5.put("scroll_view_signal", ((Object) (jsonobject2)));
		if(jsonobject3 == null)
			break MISSING_BLOCK_LABEL_107;
		jsonobject5.put("lock_screen_signal", ((Object) (jsonobject3)));
		if(jsonobject4 == null)
			break MISSING_BLOCK_LABEL_123;
		jsonobject5.put("provided_signals", ((Object) (jsonobject4)));
		zzanm.zza(zzaad.zzj(jsonobject5), "NativeAdEngineImpl.recordImpression");
		zzbiw.zza(((zzoz) (this)));
		zzbiw.zzbv();
		zzcr();
		return true;
	}

	private final boolean zzaq(String s)
	{
		JSONObject jsonobject;
		if(zzbja == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field JSONObject zzbja>
	//*   2    4:ifnonnull       12
			jsonobject = null;
	//    3    7:aconst_null     
	//    4    8:astore_2        
		else
	//*   5    9:goto            23
			jsonobject = zzbja.optJSONObject("allow_pub_event_reporting");
	//    6   12:aload_0         
	//    7   13:getfield        #57  <Field JSONObject zzbja>
	//    8   16:ldc2            #382 <String "allow_pub_event_reporting">
	//    9   19:invokevirtual   #314 <Method JSONObject JSONObject.optJSONObject(String)>
	//   10   22:astore_2        
		if(jsonobject == null)
	//*  11   23:aload_2         
	//*  12   24:ifnonnull       29
			return false;
	//   13   27:iconst_0        
	//   14   28:ireturn         
		else
			return jsonobject.optBoolean(s, false);
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #280 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   19   35:ireturn         
	}

	private final JSONObject zzb(Rect rect)
		throws JSONException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #78  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("width", zzv(rect.right - rect.left));
	//    4    8:aload_2         
	//    5    9:ldc1            #119 <String "width">
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:getfield        #386 <Field int Rect.right>
	//    9   16:aload_1         
	//   10   17:getfield        #389 <Field int Rect.left>
	//   11   20:isub            
	//   12   21:invokespecial   #127 <Method int zzv(int)>
	//   13   24:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//   14   27:pop             
		jsonobject.put("height", zzv(rect.bottom - rect.top));
	//   15   28:aload_2         
	//   16   29:ldc1            #133 <String "height">
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:getfield        #392 <Field int Rect.bottom>
	//   20   36:aload_1         
	//   21   37:getfield        #395 <Field int Rect.top>
	//   22   40:isub            
	//   23   41:invokespecial   #127 <Method int zzv(int)>
	//   24   44:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//   25   47:pop             
		jsonobject.put("x", zzv(rect.left));
	//   26   48:aload_2         
	//   27   49:ldc1            #138 <String "x">
	//   28   51:aload_0         
	//   29   52:aload_1         
	//   30   53:getfield        #389 <Field int Rect.left>
	//   31   56:invokespecial   #127 <Method int zzv(int)>
	//   32   59:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//   33   62:pop             
		jsonobject.put("y", zzv(rect.top));
	//   34   63:aload_2         
	//   35   64:ldc1            #140 <String "y">
	//   36   66:aload_0         
	//   37   67:aload_1         
	//   38   68:getfield        #395 <Field int Rect.top>
	//   39   71:invokespecial   #127 <Method int zzv(int)>
	//   40   74:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//   41   77:pop             
		jsonobject.put("relative_to", "self");
	//   42   78:aload_2         
	//   43   79:ldc1            #142 <String "relative_to">
	//   44   81:ldc2            #397 <String "self">
	//   45   84:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//   46   87:pop             
		return jsonobject;
	//   47   88:aload_2         
	//   48   89:areturn         
	}

	private static boolean zzm(View view)
	{
		return view.isShown() && view.getGlobalVisibleRect(new Rect(), ((android.graphics.Point) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #403 <Method boolean View.isShown()>
	//    2    4:ifeq            24
	//    3    7:aload_0         
	//    4    8:new             #151 <Class Rect>
	//    5   11:dup             
	//    6   12:invokespecial   #152 <Method void Rect()>
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #407 <Method boolean View.getGlobalVisibleRect(Rect, android.graphics.Point)>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	private static int[] zzn(View view)
	{
		int ai[] = new int[2];
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:astore_1        
		view.getLocationOnScreen(ai);
	//    3    4:aload_0         
	//    4    5:aload_1         
	//    5    6:invokevirtual   #411 <Method void View.getLocationOnScreen(int[])>
		return ai;
	//    6    9:aload_1         
	//    7   10:areturn         
	}

	private final JSONObject zzo(View view)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #78  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void JSONObject()>
	//    3    7:astore_2        
		if(view == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       14
			return jsonobject;
	//    6   12:aload_2         
	//    7   13:areturn         
		int ai[];
		try
		{
			ai = zzn(view);
	//    8   14:aload_1         
	//    9   15:invokestatic    #83  <Method int[] zzn(View)>
	//   10   18:astore_3        
			Object obj = ((Object) (new JSONObject()));
	//   11   19:new             #78  <Class JSONObject>
	//   12   22:dup             
	//   13   23:invokespecial   #79  <Method void JSONObject()>
	//   14   26:astore          4
			((JSONObject) (obj)).put("width", zzv(view.getMeasuredWidth()));
	//   15   28:aload           4
	//   16   30:ldc1            #119 <String "width">
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:invokevirtual   #123 <Method int View.getMeasuredWidth()>
	//   20   37:invokespecial   #127 <Method int zzv(int)>
	//   21   40:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//   22   43:pop             
			((JSONObject) (obj)).put("height", zzv(view.getMeasuredHeight()));
	//   23   44:aload           4
	//   24   46:ldc1            #133 <String "height">
	//   25   48:aload_0         
	//   26   49:aload_1         
	//   27   50:invokevirtual   #136 <Method int View.getMeasuredHeight()>
	//   28   53:invokespecial   #127 <Method int zzv(int)>
	//   29   56:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//   30   59:pop             
			((JSONObject) (obj)).put("x", zzv(ai[0]));
	//   31   60:aload           4
	//   32   62:ldc1            #138 <String "x">
	//   33   64:aload_0         
	//   34   65:aload_3         
	//   35   66:iconst_0        
	//   36   67:iaload          
	//   37   68:invokespecial   #127 <Method int zzv(int)>
	//   38   71:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//   39   74:pop             
			((JSONObject) (obj)).put("y", zzv(ai[1]));
	//   40   75:aload           4
	//   41   77:ldc1            #140 <String "y">
	//   42   79:aload_0         
	//   43   80:aload_3         
	//   44   81:iconst_1        
	//   45   82:iaload          
	//   46   83:invokespecial   #127 <Method int zzv(int)>
	//   47   86:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//   48   89:pop             
			((JSONObject) (obj)).put("relative_to", "window");
	//   49   90:aload           4
	//   50   92:ldc1            #142 <String "relative_to">
	//   51   94:ldc2            #416 <String "window">
	//   52   97:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//   53  100:pop             
			jsonobject.put("frame", obj);
	//   54  101:aload_2         
	//   55  102:ldc1            #149 <String "frame">
	//   56  104:aload           4
	//   57  106:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//   58  109:pop             
			obj = ((Object) (new Rect()));
	//   59  110:new             #151 <Class Rect>
	//   60  113:dup             
	//   61  114:invokespecial   #152 <Method void Rect()>
	//   62  117:astore          4
			if(view.getGlobalVisibleRect(((Rect) (obj))))
	//*  63  119:aload_1         
	//*  64  120:aload           4
	//*  65  122:invokevirtual   #418 <Method boolean View.getGlobalVisibleRect(Rect)>
	//*  66  125:ifeq            138
			{
				view = ((View) (zzb(((Rect) (obj)))));
	//   67  128:aload_0         
	//   68  129:aload           4
	//   69  131:invokespecial   #160 <Method JSONObject zzb(Rect)>
	//   70  134:astore_1        
				break MISSING_BLOCK_LABEL_200;
	//   71  135:goto            200
			}
		}
	//*  72  138:new             #78  <Class JSONObject>
	//*  73  141:dup             
	//*  74  142:invokespecial   #79  <Method void JSONObject()>
	//*  75  145:astore_1        
	//*  76  146:aload_1         
	//*  77  147:ldc1            #119 <String "width">
	//*  78  149:iconst_0        
	//*  79  150:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//*  80  153:pop             
	//*  81  154:aload_1         
	//*  82  155:ldc1            #133 <String "height">
	//*  83  157:iconst_0        
	//*  84  158:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//*  85  161:pop             
	//*  86  162:aload_1         
	//*  87  163:ldc1            #138 <String "x">
	//*  88  165:aload_0         
	//*  89  166:aload_3         
	//*  90  167:iconst_0        
	//*  91  168:iaload          
	//*  92  169:invokespecial   #127 <Method int zzv(int)>
	//*  93  172:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//*  94  175:pop             
	//*  95  176:aload_1         
	//*  96  177:ldc1            #140 <String "y">
	//*  97  179:aload_0         
	//*  98  180:aload_3         
	//*  99  181:iconst_1        
	//* 100  182:iaload          
	//* 101  183:invokespecial   #127 <Method int zzv(int)>
	//* 102  186:invokevirtual   #131 <Method JSONObject JSONObject.put(String, int)>
	//* 103  189:pop             
	//* 104  190:aload_1         
	//* 105  191:ldc1            #142 <String "relative_to">
	//* 106  193:ldc2            #416 <String "window">
	//* 107  196:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//* 108  199:pop             
	//* 109  200:aload_2         
	//* 110  201:ldc1            #162 <String "visible_bounds">
	//* 111  203:aload_1         
	//* 112  204:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//* 113  207:pop             
	//* 114  208:aload_2         
	//* 115  209:areturn         
	//* 116  210:ldc2            #420 <String "Unable to get native ad view bounding box">
	//* 117  213:invokestatic    #197 <Method void zzakb.zzdk(String)>
	//* 118  216:aload_2         
	//* 119  217:areturn         
		// Misplaced declaration of an exception variable
		catch(View view)
		{
			zzakb.zzdk("Unable to get native ad view bounding box");
			return jsonobject;
		}
		view = ((View) (new JSONObject()));
		((JSONObject) (view)).put("width", 0);
		((JSONObject) (view)).put("height", 0);
		((JSONObject) (view)).put("x", zzv(ai[0]));
		((JSONObject) (view)).put("y", zzv(ai[1]));
		((JSONObject) (view)).put("relative_to", "window");
		jsonobject.put("visible_bounds", ((Object) (view)));
		return jsonobject;
	//* 120  218:astore_1        
	//* 121  219:goto            210
	}

	private static JSONObject zzp(View view)
	{
		JSONObject jsonobject;
		jsonobject = new JSONObject();
	//    0    0:new             #78  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void JSONObject()>
	//    3    7:astore_2        
		if(view == null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       14
			return jsonobject;
	//    6   12:aload_2         
	//    7   13:areturn         
		zzbv.zzek();
	//    8   14:invokestatic    #425 <Method zzakk zzbv.zzek()>
	//    9   17:pop             
		boolean flag;
		if(zzakk.zzx(view) != -1)
	//*  10   18:aload_0         
	//*  11   19:invokestatic    #431 <Method int zzakk.zzx(View)>
	//*  12   22:iconst_m1       
	//*  13   23:icmpeq          45
			flag = true;
	//   14   26:iconst_1        
	//   15   27:istore_1        
		else
	//*  16   28:goto            31
	//*  17   31:aload_2         
	//*  18   32:ldc2            #433 <String "contained_in_scroll_view">
	//*  19   35:iload_1         
	//*  20   36:invokevirtual   #247 <Method JSONObject JSONObject.put(String, boolean)>
	//*  21   39:pop             
	//*  22   40:aload_2         
	//*  23   41:areturn         
	//*  24   42:astore_0        
	//*  25   43:aload_2         
	//*  26   44:areturn         
			flag = false;
	//   27   45:iconst_0        
	//   28   46:istore_1        
		try
		{
			jsonobject.put("contained_in_scroll_view", flag);
		}
		// Misplaced declaration of an exception variable
		catch(View view)
		{
			return jsonobject;
		}
		return jsonobject;
	//*  29   47:goto            31
	}

	private final JSONObject zzq(View view)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #78  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void JSONObject()>
	//    3    7:astore_2        
		if(view == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       14
			return jsonobject;
	//    6   12:aload_2         
	//    7   13:areturn         
		try
		{
			zzbv.zzek();
	//    8   14:invokestatic    #425 <Method zzakk zzbv.zzek()>
	//    9   17:pop             
			jsonobject.put("can_show_on_lock_screen", zzakk.zzw(view));
	//   10   18:aload_2         
	//   11   19:ldc2            #436 <String "can_show_on_lock_screen">
	//   12   22:aload_1         
	//   13   23:invokestatic    #439 <Method boolean zzakk.zzw(View)>
	//   14   26:invokevirtual   #247 <Method JSONObject JSONObject.put(String, boolean)>
	//   15   29:pop             
			zzbv.zzek();
	//   16   30:invokestatic    #425 <Method zzakk zzbv.zzek()>
	//   17   33:pop             
			jsonobject.put("is_keyguard_locked", zzakk.zzau(mContext));
	//   18   34:aload_2         
	//   19   35:ldc2            #441 <String "is_keyguard_locked">
	//   20   38:aload_0         
	//   21   39:getfield        #49  <Field Context mContext>
	//   22   42:invokestatic    #445 <Method boolean zzakk.zzau(Context)>
	//   23   45:invokevirtual   #247 <Method JSONObject JSONObject.put(String, boolean)>
	//   24   48:pop             
		}
	//*  25   49:aload_2         
	//*  26   50:areturn         
	//*  27   51:ldc2            #447 <String "Unable to get lock screen information">
	//*  28   54:invokestatic    #197 <Method void zzakb.zzdk(String)>
	//*  29   57:aload_2         
	//*  30   58:areturn         
		// Misplaced declaration of an exception variable
		catch(View view)
		{
			zzakb.zzdk("Unable to get lock screen information");
			return jsonobject;
		}
		return jsonobject;
	//*  31   59:astore_1        
	//*  32   60:goto            51
	}

	private final int zzv(int i)
	{
		zzkb.zzif();
	//    0    0:invokestatic    #451 <Method zzamu zzkb.zzif()>
	//    1    3:pop             
		return zzamu.zzb(mContext, i);
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field Context mContext>
	//    4    8:iload_1         
	//    5    9:invokestatic    #456 <Method int zzamu.zzb(Context, int)>
	//    6   12:ireturn         
	}

	public void cancelUnconfirmedClick()
	{
		zzna zzna = zznk.zzbcf;
	//    0    0:getstatic       #253 <Field zzna zznk.zzbcf>
	//    1    3:astore_1        
		if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   2    4:invokestatic    #259 <Method zzni zzkb.zzik()>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #265 <Method Object zzni.zzd(zzna)>
	//*   5   11:checkcast       #267 <Class Boolean>
	//*   6   14:invokevirtual   #270 <Method boolean Boolean.booleanValue()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		if(!zzbja.optBoolean("custom_one_point_five_click_enabled", false))
	//*   9   21:aload_0         
	//*  10   22:getfield        #57  <Field JSONObject zzbja>
	//*  11   25:ldc2            #276 <String "custom_one_point_five_click_enabled">
	//*  12   28:iconst_0        
	//*  13   29:invokevirtual   #280 <Method boolean JSONObject.optBoolean(String, boolean)>
	//*  14   32:ifne            42
		{
			zzakb.zzdk("Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
	//   15   35:ldc2            #459 <String "Your account need to be whitelisted to use this feature.\nContact your account manager for more information.">
	//   16   38:invokestatic    #197 <Method void zzakb.zzdk(String)>
			return;
	//   17   41:return          
		} else
		{
			zzbiz.cancelUnconfirmedClick();
	//   18   42:aload_0         
	//   19   43:getfield        #70  <Field zzok zzbiz>
	//   20   46:invokevirtual   #461 <Method void zzok.cancelUnconfirmedClick()>
			return;
	//   21   49:return          
		}
	}

	public final Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Context mContext>
	//    2    4:areturn         
	}

	public final void performClick(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
		{
			zzakb.zzck("Click data is null. No click is reported.");
	//    2    4:ldc2            #467 <String "Click data is null. No click is reported.">
	//    3    7:invokestatic    #470 <Method void zzakb.zzck(String)>
			return;
	//    4   10:return          
		}
		if(!zzaq("click_reporting"))
	//*   5   11:aload_0         
	//*   6   12:ldc2            #472 <String "click_reporting">
	//*   7   15:invokespecial   #474 <Method boolean zzaq(String)>
	//*   8   18:ifne            28
		{
			zzakb.e("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
	//    9   21:ldc2            #476 <String "The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.">
	//   10   24:invokestatic    #479 <Method void zzakb.e(String)>
			return;
	//   11   27:return          
		} else
		{
			zza(((View) (null)), ((JSONObject) (null)), ((JSONObject) (null)), ((JSONObject) (null)), ((JSONObject) (null)), bundle.getBundle("click_signal").getString("asset_id"), ((JSONObject) (null)), zzbv.zzek().zza(bundle, ((JSONObject) (null))));
	//   12   28:aload_0         
	//   13   29:aconst_null     
	//   14   30:aconst_null     
	//   15   31:aconst_null     
	//   16   32:aconst_null     
	//   17   33:aconst_null     
	//   18   34:aload_1         
	//   19   35:ldc1            #217 <String "click_signal">
	//   20   37:invokevirtual   #485 <Method Bundle Bundle.getBundle(String)>
	//   21   40:ldc1            #223 <String "asset_id">
	//   22   42:invokevirtual   #488 <Method String Bundle.getString(String)>
	//   23   45:aconst_null     
	//   24   46:invokestatic    #425 <Method zzakk zzbv.zzek()>
	//   25   49:aload_1         
	//   26   50:aconst_null     
	//   27   51:invokevirtual   #491 <Method JSONObject zzakk.zza(Bundle, JSONObject)>
	//   28   54:invokespecial   #493 <Method void zza(View, JSONObject, JSONObject, JSONObject, JSONObject, String, JSONObject, JSONObject)>
			return;
	//   29   57:return          
		}
	}

	public final boolean recordImpression(Bundle bundle)
	{
		if(!zzaq("impression_reporting"))
	//*   0    0:aload_0         
	//*   1    1:ldc2            #497 <String "impression_reporting">
	//*   2    4:invokespecial   #474 <Method boolean zzaq(String)>
	//*   3    7:ifne            18
		{
			zzakb.e("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
	//    4   10:ldc2            #499 <String "The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.">
	//    5   13:invokestatic    #479 <Method void zzakb.e(String)>
			return false;
	//    6   16:iconst_0        
	//    7   17:ireturn         
		} else
		{
			return zza(((JSONObject) (null)), ((JSONObject) (null)), ((JSONObject) (null)), ((JSONObject) (null)), zzbv.zzek().zza(bundle, ((JSONObject) (null))));
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:aconst_null     
	//   11   21:aconst_null     
	//   12   22:aconst_null     
	//   13   23:invokestatic    #425 <Method zzakk zzbv.zzek()>
	//   14   26:aload_1         
	//   15   27:aconst_null     
	//   16   28:invokevirtual   #491 <Method JSONObject zzakk.zza(Bundle, JSONObject)>
	//   17   31:invokespecial   #501 <Method boolean zza(JSONObject, JSONObject, JSONObject, JSONObject, JSONObject)>
	//   18   34:ireturn         
		}
	}

	public final void reportTouchEvent(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
		{
			zzakb.zzck("Touch event data is null. No touch event is reported.");
	//    2    4:ldc2            #504 <String "Touch event data is null. No touch event is reported.">
	//    3    7:invokestatic    #470 <Method void zzakb.zzck(String)>
			return;
	//    4   10:return          
		}
		if(!zzaq("touch_reporting"))
	//*   5   11:aload_0         
	//*   6   12:ldc2            #506 <String "touch_reporting">
	//*   7   15:invokespecial   #474 <Method boolean zzaq(String)>
	//*   8   18:ifne            28
		{
			zzakb.e("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
	//    9   21:ldc2            #508 <String "The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.">
	//   10   24:invokestatic    #479 <Method void zzakb.e(String)>
			return;
	//   11   27:return          
		} else
		{
			int i = (int)bundle.getFloat("x");
	//   12   28:aload_1         
	//   13   29:ldc1            #138 <String "x">
	//   14   31:invokevirtual   #512 <Method float Bundle.getFloat(String)>
	//   15   34:f2i             
	//   16   35:istore_2        
			int j = (int)bundle.getFloat("y");
	//   17   36:aload_1         
	//   18   37:ldc1            #140 <String "y">
	//   19   39:invokevirtual   #512 <Method float Bundle.getFloat(String)>
	//   20   42:f2i             
	//   21   43:istore_3        
			int k = bundle.getInt("duration_ms");
	//   22   44:aload_1         
	//   23   45:ldc2            #514 <String "duration_ms">
	//   24   48:invokevirtual   #518 <Method int Bundle.getInt(String)>
	//   25   51:istore          4
			zzbjc.zzaa().zza(i, j, k);
	//   26   53:aload_0         
	//   27   54:getfield        #55  <Field zzci zzbjc>
	//   28   57:invokevirtual   #328 <Method zzce zzci.zzaa()>
	//   29   60:iload_2         
	//   30   61:iload_3         
	//   31   62:iload           4
	//   32   64:invokeinterface #521 <Method void zzce.zza(int, int, int)>
			return;
	//   33   69:return          
		}
	}

	public void setClickConfirmingView(View view)
	{
		Object obj = ((Object) (zznk.zzbcf));
	//    0    0:getstatic       #253 <Field zzna zznk.zzbcf>
	//    1    3:astore_2        
		if(!((Boolean)zzkb.zzik().zzd(((zzna) (obj)))).booleanValue())
	//*   2    4:invokestatic    #259 <Method zzni zzkb.zzik()>
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #265 <Method Object zzni.zzd(zzna)>
	//*   5   11:checkcast       #267 <Class Boolean>
	//*   6   14:invokevirtual   #270 <Method boolean Boolean.booleanValue()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		if(!zzbja.optBoolean("custom_one_point_five_click_enabled", false))
	//*   9   21:aload_0         
	//*  10   22:getfield        #57  <Field JSONObject zzbja>
	//*  11   25:ldc2            #276 <String "custom_one_point_five_click_enabled">
	//*  12   28:iconst_0        
	//*  13   29:invokevirtual   #280 <Method boolean JSONObject.optBoolean(String, boolean)>
	//*  14   32:ifne            42
		{
			zzakb.zzdk("Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
	//   15   35:ldc2            #459 <String "Your account need to be whitelisted to use this feature.\nContact your account manager for more information.">
	//   16   38:invokestatic    #197 <Method void zzakb.zzdk(String)>
			return;
	//   17   41:return          
		}
		obj = ((Object) (zzbiz));
	//   18   42:aload_0         
	//   19   43:getfield        #70  <Field zzok zzbiz>
	//   20   46:astore_2        
		if(view != null)
	//*  21   47:aload_1         
	//*  22   48:ifnull          73
		{
			view.setOnClickListener(((android.view.View.OnClickListener) (obj)));
	//   23   51:aload_1         
	//   24   52:aload_2         
	//   25   53:invokevirtual   #527 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
			view.setClickable(true);
	//   26   56:aload_1         
	//   27   57:iconst_1        
	//   28   58:invokevirtual   #531 <Method void View.setClickable(boolean)>
			obj.zzbhq = new WeakReference(((Object) (view)));
	//   29   61:aload_2         
	//   30   62:new             #112 <Class WeakReference>
	//   31   65:dup             
	//   32   66:aload_1         
	//   33   67:invokespecial   #534 <Method void WeakReference(Object)>
	//   34   70:putfield        #537 <Field WeakReference zzok.zzbhq>
		}
	//   35   73:return          
	}

	public View zza(android.view.View.OnClickListener onclicklistener, boolean flag)
	{
		int i;
		Object obj;
		android.widget.RelativeLayout.LayoutParams layoutparams;
		obj = ((Object) (zzbjb.zzkc()));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field zzpb zzbjb>
	//    2    4:invokeinterface #542 <Method zzoj zzpb.zzkc()>
	//    3    9:astore          4
		if(obj == null)
	//*   4   11:aload           4
	//*   5   13:ifnonnull       18
			return null;
	//    6   16:aconst_null     
	//    7   17:areturn         
		layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
	//    8   18:new             #544 <Class android.widget.RelativeLayout$LayoutParams>
	//    9   21:dup             
	//   10   22:bipush          -2
	//   11   24:bipush          -2
	//   12   26:invokespecial   #547 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   13   29:astore          5
		if(flag)
			break MISSING_BLOCK_LABEL_119;
	//   14   31:iload_2         
	//   15   32:ifne            119
		i = ((zzoj) (obj)).zzju();
	//   16   35:aload           4
	//   17   37:invokevirtual   #552 <Method int zzoj.zzju()>
	//   18   40:istore_3        
		if(i == 0) goto _L2; else goto _L1
	//   19   41:iload_3         
	//   20   42:ifeq            105
_L1:
		i;
	//   21   45:iload_3         
		JVM INSTR tableswitch 2 3: default 68
	//	               2 95
	//	               3 85;
	//   22   46:tableswitch     2 3: default 68
	//	               2 95
	//	               3 85
		   goto _L3 _L4 _L5
_L3:
		layoutparams.addRule(10);
	//   23   68:aload           5
	//   24   70:bipush          10
	//   25   72:invokevirtual   #556 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
_L7:
		layoutparams.addRule(11);
	//   26   75:aload           5
	//   27   77:bipush          11
	//   28   79:invokevirtual   #556 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		break MISSING_BLOCK_LABEL_119;
	//   29   82:goto            119
_L5:
		layoutparams.addRule(12);
	//   30   85:aload           5
	//   31   87:bipush          12
	//   32   89:invokevirtual   #556 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		break; /* Loop/switch isn't completed */
	//   33   92:goto            112
_L4:
		layoutparams.addRule(12);
	//   34   95:aload           5
	//   35   97:bipush          12
	//   36   99:invokevirtual   #556 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		if(true) goto _L7; else goto _L6
	//   37  102:goto            75
_L2:
		layoutparams.addRule(10);
	//   38  105:aload           5
	//   39  107:bipush          10
	//   40  109:invokevirtual   #556 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
_L6:
		layoutparams.addRule(9);
	//   41  112:aload           5
	//   42  114:bipush          9
	//   43  116:invokevirtual   #556 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		obj = ((Object) (new zzom(mContext, ((zzoj) (obj)), layoutparams)));
	//   44  119:new             #558 <Class zzom>
	//   45  122:dup             
	//   46  123:aload_0         
	//   47  124:getfield        #49  <Field Context mContext>
	//   48  127:aload           4
	//   49  129:aload           5
	//   50  131:invokespecial   #561 <Method void zzom(Context, zzoj, android.widget.RelativeLayout$LayoutParams)>
	//   51  134:astore          4
		((zzom) (obj)).setOnClickListener(onclicklistener);
	//   52  136:aload           4
	//   53  138:aload_1         
	//   54  139:invokevirtual   #562 <Method void zzom.setOnClickListener(android.view.View$OnClickListener)>
		onclicklistener = ((android.view.View.OnClickListener) (zznk.zzbbz));
	//   55  142:getstatic       #565 <Field zzna zznk.zzbbz>
	//   56  145:astore_1        
		((zzom) (obj)).setContentDescription((CharSequence)zzkb.zzik().zzd(((zzna) (onclicklistener))));
	//   57  146:aload           4
	//   58  148:invokestatic    #259 <Method zzni zzkb.zzik()>
	//   59  151:aload_1         
	//   60  152:invokevirtual   #265 <Method Object zzni.zzd(zzna)>
	//   61  155:checkcast       #567 <Class CharSequence>
	//   62  158:invokevirtual   #571 <Method void zzom.setContentDescription(CharSequence)>
		return ((View) (obj));
	//   63  161:aload           4
	//   64  163:areturn         
	}

	public final void zza(View view, zzox zzox)
	{
		android.widget.FrameLayout.LayoutParams layoutparams;
		if(zzb(view, zzox))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:aload_2         
	//*   3    3:invokevirtual   #577 <Method boolean zzb(View, zzox)>
	//*   4    6:ifeq            10
			return;
	//    5    9:return          
		layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
	//    6   10:new             #579 <Class android.widget.FrameLayout$LayoutParams>
	//    7   13:dup             
	//    8   14:iconst_m1       
	//    9   15:iconst_m1       
	//   10   16:invokespecial   #580 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   11   19:astore_3        
		((FrameLayout)view).removeAllViews();
	//   12   20:aload_1         
	//   13   21:checkcast       #582 <Class FrameLayout>
	//   14   24:invokevirtual   #585 <Method void FrameLayout.removeAllViews()>
		if(!(zzbjb instanceof zzpc))
	//*  15   27:aload_0         
	//*  16   28:getfield        #59  <Field zzpb zzbjb>
	//*  17   31:instanceof      #587 <Class zzpc>
	//*  18   34:ifne            38
			return;
	//   19   37:return          
		zzox = ((zzox) ((zzpc)zzbjb));
	//   20   38:aload_0         
	//   21   39:getfield        #59  <Field zzpb zzbjb>
	//   22   42:checkcast       #587 <Class zzpc>
	//   23   45:astore_2        
		if(((zzpc) (zzox)).getImages() == null || ((zzpc) (zzox)).getImages().size() <= 0) goto _L2; else goto _L1
	//   24   46:aload_2         
	//   25   47:invokeinterface #591 <Method List zzpc.getImages()>
	//   26   52:ifnull          169
	//   27   55:aload_2         
	//   28   56:invokeinterface #591 <Method List zzpc.getImages()>
	//   29   61:invokeinterface #596 <Method int List.size()>
	//   30   66:ifle            169
_L1:
		zzox = ((zzox) (((zzpc) (zzox)).getImages().get(0)));
	//   31   69:aload_2         
	//   32   70:invokeinterface #591 <Method List zzpc.getImages()>
	//   33   75:iconst_0        
	//   34   76:invokeinterface #599 <Method Object List.get(int)>
	//   35   81:astore_2        
		if(zzox instanceof IBinder)
	//*  36   82:aload_2         
	//*  37   83:instanceof      #601 <Class IBinder>
	//*  38   86:ifeq            100
			zzox = ((zzox) (zzpx.zzh((IBinder)zzox)));
	//   39   89:aload_2         
	//   40   90:checkcast       #601 <Class IBinder>
	//   41   93:invokestatic    #607 <Method zzpw zzpx.zzh(IBinder)>
	//   42   96:astore_2        
		else
	//*  43   97:goto            102
			zzox = null;
	//   44  100:aconst_null     
	//   45  101:astore_2        
		if(zzox == null) goto _L2; else goto _L3
	//   46  102:aload_2         
	//   47  103:ifnull          169
_L3:
		zzox = ((zzox) (((zzpw) (zzox)).zzjy()));
	//   48  106:aload_2         
	//   49  107:invokeinterface #613 <Method com.google.android.gms.dynamic.IObjectWrapper zzpw.zzjy()>
	//   50  112:astore_2        
		if(zzox == null)
			break MISSING_BLOCK_LABEL_162;
	//   51  113:aload_2         
	//   52  114:ifnull          162
		zzox = ((zzox) ((Drawable)ObjectWrapper.unwrap(((com.google.android.gms.dynamic.IObjectWrapper) (zzox)))));
	//   53  117:aload_2         
	//   54  118:invokestatic    #619 <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//   55  121:checkcast       #621 <Class Drawable>
	//   56  124:astore_2        
		ImageView imageview = new ImageView(mContext);
	//   57  125:new             #623 <Class ImageView>
	//   58  128:dup             
	//   59  129:aload_0         
	//   60  130:getfield        #49  <Field Context mContext>
	//   61  133:invokespecial   #626 <Method void ImageView(Context)>
	//   62  136:astore          4
		imageview.setImageDrawable(((Drawable) (zzox)));
	//   63  138:aload           4
	//   64  140:aload_2         
	//   65  141:invokevirtual   #630 <Method void ImageView.setImageDrawable(Drawable)>
		imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
	//   66  144:aload           4
	//   67  146:getstatic       #636 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_INSIDE>
	//   68  149:invokevirtual   #640 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
		((FrameLayout)view).addView(((View) (imageview)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   69  152:aload_1         
	//   70  153:checkcast       #582 <Class FrameLayout>
	//   71  156:aload           4
	//   72  158:aload_3         
	//   73  159:invokevirtual   #644 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		return;
	//   74  162:return          
_L5:
		zzakb.zzdk("Could not get drawable from image");
	//   75  163:ldc2            #646 <String "Could not get drawable from image">
	//   76  166:invokestatic    #197 <Method void zzakb.zzdk(String)>
_L2:
		return;
	//   77  169:return          
		view;
	//   78  170:astore_1        
		if(true) goto _L5; else goto _L4
_L4:
	//*  79  171:goto            163
	}

	public final void zza(View view, String s, Bundle bundle, Map map, View view1)
	{
		JSONObject jsonobject;
		JSONObject jsonobject1;
		JSONObject jsonobject2;
		JSONObject jsonobject3;
		jsonobject = zza(map, view1);
	//    0    0:aload_0         
	//    1    1:aload           4
	//    2    3:aload           5
	//    3    5:invokespecial   #649 <Method JSONObject zza(Map, View)>
	//    4    8:astore          6
		jsonobject1 = zzo(view1);
	//    5   10:aload_0         
	//    6   11:aload           5
	//    7   13:invokespecial   #651 <Method JSONObject zzo(View)>
	//    8   16:astore          7
		jsonobject2 = zzp(view1);
	//    9   18:aload           5
	//   10   20:invokestatic    #653 <Method JSONObject zzp(View)>
	//   11   23:astore          8
		jsonobject3 = zzq(view1);
	//   12   25:aload_0         
	//   13   26:aload           5
	//   14   28:invokespecial   #655 <Method JSONObject zzq(View)>
	//   15   31:astore          9
		map = null;
	//   16   33:aconst_null     
	//   17   34:astore          4
		view1 = ((View) (zzbv.zzek().zza(bundle, ((JSONObject) (null)))));
	//   18   36:invokestatic    #425 <Method zzakk zzbv.zzek()>
	//   19   39:aload_3         
	//   20   40:aconst_null     
	//   21   41:invokevirtual   #491 <Method JSONObject zzakk.zza(Bundle, JSONObject)>
	//   22   44:astore          5
		bundle = ((Bundle) (new JSONObject()));
	//   23   46:new             #78  <Class JSONObject>
	//   24   49:dup             
	//   25   50:invokespecial   #79  <Method void JSONObject()>
	//   26   53:astore_3        
		try
		{
			((JSONObject) (bundle)).put("click_point", ((Object) (view1)));
	//   27   54:aload_3         
	//   28   55:ldc2            #657 <String "click_point">
	//   29   58:aload           5
	//   30   60:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//   31   63:pop             
			((JSONObject) (bundle)).put("asset_id", ((Object) (s)));
	//   32   64:aload_3         
	//   33   65:ldc1            #223 <String "asset_id">
	//   34   67:aload_2         
	//   35   68:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//   36   71:pop             
			break MISSING_BLOCK_LABEL_97;
	//   37   72:goto            97
		}
		// Misplaced declaration of an exception variable
		catch(Map map) { }
	//   38   75:astore          4
		break MISSING_BLOCK_LABEL_89;
	//   39   77:goto            89
		view1;
	//   40   80:astore          5
		bundle = ((Bundle) (map));
	//   41   82:aload           4
	//   42   84:astore_3        
		map = ((Map) (view1));
	//   43   85:aload           5
	//   44   87:astore          4
		zzakb.zzb("Error occurred while grabbing click signals.", ((Throwable) (map)));
	//   45   89:ldc2            #659 <String "Error occurred while grabbing click signals.">
	//   46   92:aload           4
	//   47   94:invokestatic    #338 <Method void zzakb.zzb(String, Throwable)>
		zza(view, jsonobject1, jsonobject, jsonobject2, jsonobject3, s, ((JSONObject) (bundle)), ((JSONObject) (null)));
	//   48   97:aload_0         
	//   49   98:aload_1         
	//   50   99:aload           7
	//   51  101:aload           6
	//   52  103:aload           8
	//   53  105:aload           9
	//   54  107:aload_2         
	//   55  108:aload_3         
	//   56  109:aconst_null     
	//   57  110:invokespecial   #493 <Method void zza(View, JSONObject, JSONObject, JSONObject, JSONObject, String, JSONObject, JSONObject)>
		return;
	//   58  113:return          
	}

	public void zza(View view, Map map)
	{
		zza(zzo(view), zza(map, view), zzp(view), zzq(view), ((JSONObject) (null)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokespecial   #651 <Method JSONObject zzo(View)>
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:aload_1         
	//    7    9:invokespecial   #649 <Method JSONObject zza(Map, View)>
	//    8   12:aload_1         
	//    9   13:invokestatic    #653 <Method JSONObject zzp(View)>
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:invokespecial   #655 <Method JSONObject zzq(View)>
	//   13   21:aconst_null     
	//   14   22:invokespecial   #501 <Method boolean zza(JSONObject, JSONObject, JSONObject, JSONObject, JSONObject)>
	//   15   25:pop             
	//   16   26:return          
	}

	public void zza(View view, Map map, Bundle bundle, View view1)
	{
		Preconditions.checkMainThread("Invalid call from a non-UI thread.");
	//    0    0:ldc1            #204 <String "Invalid call from a non-UI thread.">
	//    1    2:invokestatic    #209 <Method void Preconditions.checkMainThread(String)>
		if(map == null)
			break MISSING_BLOCK_LABEL_101;
	//    2    5:aload_2         
	//    3    6:ifnull          101
		map;
	//    4    9:aload_2         
		JVM INSTR monitorenter ;
	//    5   10:monitorenter    
		Iterator iterator = map.entrySet().iterator();
	//    6   11:aload_2         
	//    7   12:invokeinterface #89  <Method Set Map.entrySet()>
	//    8   17:invokeinterface #95  <Method Iterator Set.iterator()>
	//    9   22:astore          5
		java.util.Map.Entry entry;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_91;
	//   10   24:aload           5
	//   11   26:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//   12   31:ifeq            91
			entry = (java.util.Map.Entry)iterator.next();
	//   13   34:aload           5
	//   14   36:invokeinterface #105 <Method Object Iterator.next()>
	//   15   41:checkcast       #107 <Class java.util.Map$Entry>
	//   16   44:astore          6
		} while(!((Object) (view)).equals(((Object) ((View)((WeakReference)entry.getValue()).get()))));
	//   17   46:aload_1         
	//   18   47:aload           6
	//   19   49:invokeinterface #110 <Method Object java.util.Map$Entry.getValue()>
	//   20   54:checkcast       #112 <Class WeakReference>
	//   21   57:invokevirtual   #115 <Method Object WeakReference.get()>
	//   22   60:checkcast       #117 <Class View>
	//   23   63:invokevirtual   #667 <Method boolean Object.equals(Object)>
	//   24   66:ifeq            24
		zza(view, (String)entry.getKey(), bundle, map, view1);
	//   25   69:aload_0         
	//   26   70:aload_1         
	//   27   71:aload           6
	//   28   73:invokeinterface #187 <Method Object java.util.Map$Entry.getKey()>
	//   29   78:checkcast       #189 <Class String>
	//   30   81:aload_3         
	//   31   82:aload_2         
	//   32   83:aload           4
	//   33   85:invokevirtual   #669 <Method void zza(View, String, Bundle, Map, View)>
		map;
	//   34   88:aload_2         
		JVM INSTR monitorexit ;
	//   35   89:monitorexit     
		return;
	//   36   90:return          
		map;
	//   37   91:aload_2         
		JVM INSTR monitorexit ;
	//   38   92:monitorexit     
		break MISSING_BLOCK_LABEL_101;
	//   39   93:goto            101
		view;
	//   40   96:astore_1        
		map;
	//   41   97:aload_2         
		JVM INSTR monitorexit ;
	//   42   98:monitorexit     
		throw view;
	//   43   99:aload_1         
	//   44  100:athrow          
		if(!"6".equals(((Object) (zzbjb.zzkb())))) goto _L2; else goto _L1
	//   45  101:ldc2            #671 <String "6">
	//   46  104:aload_0         
	//   47  105:getfield        #59  <Field zzpb zzbjb>
	//   48  108:invokeinterface #231 <Method String zzpb.zzkb()>
	//   49  113:invokevirtual   #672 <Method boolean String.equals(Object)>
	//   50  116:ifeq            136
_L1:
		String s = "3099";
	//   51  119:ldc2            #674 <String "3099">
	//   52  122:astore          5
_L4:
		zza(view, s, bundle, map, view1);
	//   53  124:aload_0         
	//   54  125:aload_1         
	//   55  126:aload           5
	//   56  128:aload_3         
	//   57  129:aload_2         
	//   58  130:aload           4
	//   59  132:invokevirtual   #669 <Method void zza(View, String, Bundle, Map, View)>
		return;
	//   60  135:return          
_L2:
		if(!"2".equals(((Object) (zzbjb.zzkb()))))
			break; /* Loop/switch isn't completed */
	//   61  136:ldc2            #676 <String "2">
	//   62  139:aload_0         
	//   63  140:getfield        #59  <Field zzpb zzbjb>
	//   64  143:invokeinterface #231 <Method String zzpb.zzkb()>
	//   65  148:invokevirtual   #672 <Method boolean String.equals(Object)>
	//   66  151:ifeq            162
		s = "2099";
	//   67  154:ldc2            #678 <String "2099">
	//   68  157:astore          5
		if(true) goto _L4; else goto _L3
	//   69  159:goto            124
_L3:
		if("1".equals(((Object) (zzbjb.zzkb()))))
	//*  70  162:ldc2            #680 <String "1">
	//*  71  165:aload_0         
	//*  72  166:getfield        #59  <Field zzpb zzbjb>
	//*  73  169:invokeinterface #231 <Method String zzpb.zzkb()>
	//*  74  174:invokevirtual   #672 <Method boolean String.equals(Object)>
	//*  75  177:ifeq            192
			zza(view, "1099", bundle, map, view1);
	//   76  180:aload_0         
	//   77  181:aload_1         
	//   78  182:ldc2            #682 <String "1099">
	//   79  185:aload_3         
	//   80  186:aload_2         
	//   81  187:aload           4
	//   82  189:invokevirtual   #669 <Method void zza(View, String, Bundle, Map, View)>
		return;
	//   83  192:return          
	}

	public void zza(View view, Map map, Map map1, android.view.View.OnTouchListener ontouchlistener, android.view.View.OnClickListener onclicklistener)
	{
		zzna zzna = zznk.zzbbw;
	//    0    0:getstatic       #687 <Field zzna zznk.zzbbw>
	//    1    3:astore          6
		if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   2    5:invokestatic    #259 <Method zzni zzkb.zzik()>
	//*   3    8:aload           6
	//*   4   10:invokevirtual   #265 <Method Object zzni.zzd(zzna)>
	//*   5   13:checkcast       #267 <Class Boolean>
	//*   6   16:invokevirtual   #270 <Method boolean Boolean.booleanValue()>
	//*   7   19:ifne            23
			return;
	//    8   22:return          
		view.setOnTouchListener(ontouchlistener);
	//    9   23:aload_1         
	//   10   24:aload           4
	//   11   26:invokevirtual   #691 <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
		view.setClickable(true);
	//   12   29:aload_1         
	//   13   30:iconst_1        
	//   14   31:invokevirtual   #531 <Method void View.setClickable(boolean)>
		view.setOnClickListener(onclicklistener);
	//   15   34:aload_1         
	//   16   35:aload           5
	//   17   37:invokevirtual   #527 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(map == null)
			break MISSING_BLOCK_LABEL_130;
	//   18   40:aload_2         
	//   19   41:ifnull          130
		map;
	//   20   44:aload_2         
		JVM INSTR monitorenter ;
	//   21   45:monitorenter    
		view = ((View) (map.entrySet().iterator()));
	//   22   46:aload_2         
	//   23   47:invokeinterface #89  <Method Set Map.entrySet()>
	//   24   52:invokeinterface #95  <Method Iterator Set.iterator()>
	//   25   57:astore_1        
_L1:
		View view1;
		do
		{
			if(!((Iterator) (view)).hasNext())
				break MISSING_BLOCK_LABEL_120;
	//   26   58:aload_1         
	//   27   59:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//   28   64:ifeq            120
			view1 = (View)((WeakReference)((java.util.Map.Entry)((Iterator) (view)).next()).getValue()).get();
	//   29   67:aload_1         
	//   30   68:invokeinterface #105 <Method Object Iterator.next()>
	//   31   73:checkcast       #107 <Class java.util.Map$Entry>
	//   32   76:invokeinterface #110 <Method Object java.util.Map$Entry.getValue()>
	//   33   81:checkcast       #112 <Class WeakReference>
	//   34   84:invokevirtual   #115 <Method Object WeakReference.get()>
	//   35   87:checkcast       #117 <Class View>
	//   36   90:astore          6
		} while(view1 == null);
	//   37   92:aload           6
	//   38   94:ifnull          58
		view1.setOnTouchListener(ontouchlistener);
	//   39   97:aload           6
	//   40   99:aload           4
	//   41  101:invokevirtual   #691 <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
		view1.setClickable(true);
	//   42  104:aload           6
	//   43  106:iconst_1        
	//   44  107:invokevirtual   #531 <Method void View.setClickable(boolean)>
		view1.setOnClickListener(onclicklistener);
	//   45  110:aload           6
	//   46  112:aload           5
	//   47  114:invokevirtual   #527 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		  goto _L1
	//*  48  117:goto            58
		map;
	//   49  120:aload_2         
		JVM INSTR monitorexit ;
	//   50  121:monitorexit     
		break MISSING_BLOCK_LABEL_130;
	//   51  122:goto            130
		view;
	//   52  125:astore_1        
		map;
	//   53  126:aload_2         
		JVM INSTR monitorexit ;
	//   54  127:monitorexit     
		throw view;
	//   55  128:aload_1         
	//   56  129:athrow          
		if(map1 == null)
			break MISSING_BLOCK_LABEL_202;
	//   57  130:aload_3         
	//   58  131:ifnull          202
		map1;
	//   59  134:aload_3         
		JVM INSTR monitorenter ;
	//   60  135:monitorenter    
		view = ((View) (map1.entrySet().iterator()));
	//   61  136:aload_3         
	//   62  137:invokeinterface #89  <Method Set Map.entrySet()>
	//   63  142:invokeinterface #95  <Method Iterator Set.iterator()>
	//   64  147:astore_1        
_L2:
		do
		{
			if(!((Iterator) (view)).hasNext())
				break MISSING_BLOCK_LABEL_194;
	//   65  148:aload_1         
	//   66  149:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//   67  154:ifeq            194
			map = ((Map) ((View)((WeakReference)((java.util.Map.Entry)((Iterator) (view)).next()).getValue()).get()));
	//   68  157:aload_1         
	//   69  158:invokeinterface #105 <Method Object Iterator.next()>
	//   70  163:checkcast       #107 <Class java.util.Map$Entry>
	//   71  166:invokeinterface #110 <Method Object java.util.Map$Entry.getValue()>
	//   72  171:checkcast       #112 <Class WeakReference>
	//   73  174:invokevirtual   #115 <Method Object WeakReference.get()>
	//   74  177:checkcast       #117 <Class View>
	//   75  180:astore_2        
		} while(map == null);
	//   76  181:aload_2         
	//   77  182:ifnull          148
		((View) (map)).setOnTouchListener(ontouchlistener);
	//   78  185:aload_2         
	//   79  186:aload           4
	//   80  188:invokevirtual   #691 <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
		  goto _L2
	//*  81  191:goto            148
		map1;
	//   82  194:aload_3         
		JVM INSTR monitorexit ;
	//   83  195:monitorexit     
		return;
	//   84  196:return          
		view;
	//   85  197:astore_1        
		map1;
	//   86  198:aload_3         
		JVM INSTR monitorexit ;
	//   87  199:monitorexit     
		throw view;
	//   88  200:aload_1         
	//   89  201:athrow          
	//   90  202:return          
	}

	public void zza(zzro zzro)
	{
		zzna zzna = zznk.zzbcf;
	//    0    0:getstatic       #253 <Field zzna zznk.zzbcf>
	//    1    3:astore_2        
		if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   2    4:invokestatic    #259 <Method zzni zzkb.zzik()>
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #265 <Method Object zzni.zzd(zzna)>
	//*   5   11:checkcast       #267 <Class Boolean>
	//*   6   14:invokevirtual   #270 <Method boolean Boolean.booleanValue()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		if(!zzbja.optBoolean("custom_one_point_five_click_enabled", false))
	//*   9   21:aload_0         
	//*  10   22:getfield        #57  <Field JSONObject zzbja>
	//*  11   25:ldc2            #276 <String "custom_one_point_five_click_enabled">
	//*  12   28:iconst_0        
	//*  13   29:invokevirtual   #280 <Method boolean JSONObject.optBoolean(String, boolean)>
	//*  14   32:ifne            42
		{
			zzakb.zzdk("Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
	//   15   35:ldc2            #459 <String "Your account need to be whitelisted to use this feature.\nContact your account manager for more information.">
	//   16   38:invokestatic    #197 <Method void zzakb.zzdk(String)>
			return;
	//   17   41:return          
		} else
		{
			zzbiz.zza(zzro);
	//   18   42:aload_0         
	//   19   43:getfield        #70  <Field zzok zzbiz>
	//   20   46:aload_1         
	//   21   47:invokevirtual   #695 <Method void zzok.zza(zzro)>
			return;
	//   22   50:return          
		}
	}

	public void zzb(View view, Map map)
	{
		zzna zzna = zznk.zzbbv;
	//    0    0:getstatic       #698 <Field zzna zznk.zzbbv>
	//    1    3:astore_3        
		if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   2    4:invokestatic    #259 <Method zzni zzkb.zzik()>
	//*   3    7:aload_3         
	//*   4    8:invokevirtual   #265 <Method Object zzni.zzd(zzna)>
	//*   5   11:checkcast       #267 <Class Boolean>
	//*   6   14:invokevirtual   #270 <Method boolean Boolean.booleanValue()>
	//*   7   17:ifeq            21
			return;
	//    8   20:return          
		view.setOnTouchListener(((android.view.View.OnTouchListener) (null)));
	//    9   21:aload_1         
	//   10   22:aconst_null     
	//   11   23:invokevirtual   #691 <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
		view.setClickable(false);
	//   12   26:aload_1         
	//   13   27:iconst_0        
	//   14   28:invokevirtual   #531 <Method void View.setClickable(boolean)>
		view.setOnClickListener(((android.view.View.OnClickListener) (null)));
	//   15   31:aload_1         
	//   16   32:aconst_null     
	//   17   33:invokevirtual   #527 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		if(map == null)
	//*  18   36:aload_2         
	//*  19   37:ifnonnull       41
			return;
	//   20   40:return          
		map;
	//   21   41:aload_2         
		JVM INSTR monitorenter ;
	//   22   42:monitorenter    
		view = ((View) (map.entrySet().iterator()));
	//   23   43:aload_2         
	//   24   44:invokeinterface #89  <Method Set Map.entrySet()>
	//   25   49:invokeinterface #95  <Method Iterator Set.iterator()>
	//   26   54:astore_1        
_L1:
		View view1;
		do
		{
			if(!((Iterator) (view)).hasNext())
				break MISSING_BLOCK_LABEL_110;
	//   27   55:aload_1         
	//   28   56:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//   29   61:ifeq            110
			view1 = (View)((WeakReference)((java.util.Map.Entry)((Iterator) (view)).next()).getValue()).get();
	//   30   64:aload_1         
	//   31   65:invokeinterface #105 <Method Object Iterator.next()>
	//   32   70:checkcast       #107 <Class java.util.Map$Entry>
	//   33   73:invokeinterface #110 <Method Object java.util.Map$Entry.getValue()>
	//   34   78:checkcast       #112 <Class WeakReference>
	//   35   81:invokevirtual   #115 <Method Object WeakReference.get()>
	//   36   84:checkcast       #117 <Class View>
	//   37   87:astore_3        
		} while(view1 == null);
	//   38   88:aload_3         
	//   39   89:ifnull          55
		view1.setOnTouchListener(((android.view.View.OnTouchListener) (null)));
	//   40   92:aload_3         
	//   41   93:aconst_null     
	//   42   94:invokevirtual   #691 <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
		view1.setClickable(false);
	//   43   97:aload_3         
	//   44   98:iconst_0        
	//   45   99:invokevirtual   #531 <Method void View.setClickable(boolean)>
		view1.setOnClickListener(((android.view.View.OnClickListener) (null)));
	//   46  102:aload_3         
	//   47  103:aconst_null     
	//   48  104:invokevirtual   #527 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		  goto _L1
	//*  49  107:goto            55
		map;
	//   50  110:aload_2         
		JVM INSTR monitorexit ;
	//   51  111:monitorexit     
		return;
	//   52  112:return          
		view;
	//   53  113:astore_1        
		map;
	//   54  114:aload_2         
		JVM INSTR monitorexit ;
	//   55  115:monitorexit     
		throw view;
	//   56  116:aload_1         
	//   57  117:athrow          
	}

	public final boolean zzb(View view, zzox zzox)
	{
		android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2, 17);
	//    0    0:new             #579 <Class android.widget.FrameLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:bipush          -2
	//    4    8:bipush          17
	//    5   10:invokespecial   #700 <Method void android.widget.FrameLayout$LayoutParams(int, int, int)>
	//    6   13:astore_3        
		View view1 = zzbjb.zzkd();
	//    7   14:aload_0         
	//    8   15:getfield        #59  <Field zzpb zzbjb>
	//    9   18:invokeinterface #704 <Method View zzpb.zzkd()>
	//   10   23:astore          4
		if(view1 != null)
	//*  11   25:aload           4
	//*  12   27:ifnull          83
		{
			android.view.ViewParent viewparent = view1.getParent();
	//   13   30:aload           4
	//   14   32:invokevirtual   #708 <Method android.view.ViewParent View.getParent()>
	//   15   35:astore          5
			if(viewparent instanceof ViewGroup)
	//*  16   37:aload           5
	//*  17   39:instanceof      #710 <Class ViewGroup>
	//*  18   42:ifeq            55
				((ViewGroup)viewparent).removeView(view1);
	//   19   45:aload           5
	//   20   47:checkcast       #710 <Class ViewGroup>
	//   21   50:aload           4
	//   22   52:invokevirtual   #713 <Method void ViewGroup.removeView(View)>
			view = ((View) ((FrameLayout)view));
	//   23   55:aload_1         
	//   24   56:checkcast       #582 <Class FrameLayout>
	//   25   59:astore_1        
			((FrameLayout) (view)).removeAllViews();
	//   26   60:aload_1         
	//   27   61:invokevirtual   #585 <Method void FrameLayout.removeAllViews()>
			((FrameLayout) (view)).addView(view1, ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   28   64:aload_1         
	//   29   65:aload           4
	//   30   67:aload_3         
	//   31   68:invokevirtual   #644 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			zzbiw.zza(zzox);
	//   32   71:aload_0         
	//   33   72:getfield        #51  <Field zzpa zzbiw>
	//   34   75:aload_2         
	//   35   76:invokeinterface #716 <Method void zzpa.zza(zzox)>
			return true;
	//   36   81:iconst_1        
	//   37   82:ireturn         
		} else
		{
			return false;
	//   38   83:iconst_0        
	//   39   84:ireturn         
		}
	}

	public final void zzc(View view, Map map)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
			{
				if(!zzbjd)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #362 <Field boolean zzbjd>
	//    7   11:ifeq            17
			}
	//    8   14:aload_3         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		if(!zzm(view))
			break MISSING_BLOCK_LABEL_33;
	//   11   17:aload_1         
	//   12   18:invokestatic    #719 <Method boolean zzm(View)>
	//   13   21:ifeq            33
		zza(view, map);
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:aload_2         
	//   17   27:invokevirtual   #721 <Method void zza(View, Map)>
		obj;
	//   18   30:aload_3         
		JVM INSTR monitorexit ;
	//   19   31:monitorexit     
		return;
	//   20   32:return          
		Object obj1 = ((Object) (zznk.zzbce));
	//   21   33:getstatic       #724 <Field zzna zznk.zzbce>
	//   22   36:astore          4
		if(!((Boolean)zzkb.zzik().zzd(((zzna) (obj1)))).booleanValue() || map == null)
			break MISSING_BLOCK_LABEL_144;
	//   23   38:invokestatic    #259 <Method zzni zzkb.zzik()>
	//   24   41:aload           4
	//   25   43:invokevirtual   #265 <Method Object zzni.zzd(zzna)>
	//   26   46:checkcast       #267 <Class Boolean>
	//   27   49:invokevirtual   #270 <Method boolean Boolean.booleanValue()>
	//   28   52:ifeq            144
	//   29   55:aload_2         
	//   30   56:ifnull          144
		map;
	//   31   59:aload_2         
		JVM INSTR monitorenter ;
	//   32   60:monitorenter    
		obj1 = ((Object) (map.entrySet().iterator()));
	//   33   61:aload_2         
	//   34   62:invokeinterface #89  <Method Set Map.entrySet()>
	//   35   67:invokeinterface #95  <Method Iterator Set.iterator()>
	//   36   72:astore          4
_L2:
		View view1;
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break MISSING_BLOCK_LABEL_134;
	//   37   74:aload           4
	//   38   76:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//   39   81:ifeq            134
			view1 = (View)((WeakReference)((java.util.Map.Entry)((Iterator) (obj1)).next()).getValue()).get();
	//   40   84:aload           4
	//   41   86:invokeinterface #105 <Method Object Iterator.next()>
	//   42   91:checkcast       #107 <Class java.util.Map$Entry>
	//   43   94:invokeinterface #110 <Method Object java.util.Map$Entry.getValue()>
	//   44   99:checkcast       #112 <Class WeakReference>
	//   45  102:invokevirtual   #115 <Method Object WeakReference.get()>
	//   46  105:checkcast       #117 <Class View>
	//   47  108:astore          5
		} while(view1 == null);
	//   48  110:aload           5
	//   49  112:ifnull          74
		if(!zzm(view1)) goto _L2; else goto _L1
	//   50  115:aload           5
	//   51  117:invokestatic    #719 <Method boolean zzm(View)>
	//   52  120:ifeq            74
_L1:
		zza(view, map);
	//   53  123:aload_0         
	//   54  124:aload_1         
	//   55  125:aload_2         
	//   56  126:invokevirtual   #721 <Method void zza(View, Map)>
		map;
	//   57  129:aload_2         
		JVM INSTR monitorexit ;
	//   58  130:monitorexit     
		obj;
	//   59  131:aload_3         
		JVM INSTR monitorexit ;
	//   60  132:monitorexit     
		return;
	//   61  133:return          
		map;
	//   62  134:aload_2         
		JVM INSTR monitorexit ;
	//   63  135:monitorexit     
		break MISSING_BLOCK_LABEL_144;
	//   64  136:goto            144
		view;
	//   65  139:astore_1        
		map;
	//   66  140:aload_2         
		JVM INSTR monitorexit ;
	//   67  141:monitorexit     
		throw view;
	//   68  142:aload_1         
	//   69  143:athrow          
		obj;
	//   70  144:aload_3         
		JVM INSTR monitorexit ;
	//   71  145:monitorexit     
		return;
	//   72  146:return          
		view;
	//   73  147:astore_1        
		obj;
	//   74  148:aload_3         
		JVM INSTR monitorexit ;
	//   75  149:monitorexit     
		throw view;
	//   76  150:aload_1         
	//   77  151:athrow          
	}

	public void zzcr()
	{
		zzbiw.zzcr();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field zzpa zzbiw>
	//    2    4:invokeinterface #725 <Method void zzpa.zzcr()>
	//    3    9:return          
	}

	public void zzcs()
	{
		zzbiw.zzcs();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field zzpa zzbiw>
	//    2    4:invokeinterface #728 <Method void zzpa.zzcs()>
	//    3    9:return          
	}

	public final void zzd(MotionEvent motionevent)
	{
		zzbjc.zza(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field zzci zzbjc>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #731 <Method void zzci.zza(MotionEvent)>
	//    4    8:return          
	}

	public final void zzf(Map map)
	{
		if(zzbjb.zzkd() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field zzpb zzbjb>
	//*   2    4:invokeinterface #704 <Method View zzpb.zzkd()>
	//*   3    9:ifnull          121
		{
			if("2".equals(((Object) (zzbjb.zzkb()))))
	//*   4   12:ldc2            #676 <String "2">
	//*   5   15:aload_0         
	//*   6   16:getfield        #59  <Field zzpb zzbjb>
	//*   7   19:invokeinterface #231 <Method String zzpb.zzkb()>
	//*   8   24:invokevirtual   #672 <Method boolean String.equals(Object)>
	//*   9   27:ifeq            67
			{
				zzbv.zzeo().zzqh().zza(zzbiw.getAdUnitId(), zzbjb.zzkb(), map.containsKey("2011"));
	//   10   30:invokestatic    #737 <Method zzajm zzbv.zzeo()>
	//   11   33:invokevirtual   #743 <Method zzakd zzajm.zzqh()>
	//   12   36:aload_0         
	//   13   37:getfield        #51  <Field zzpa zzbiw>
	//   14   40:invokeinterface #746 <Method String zzpa.getAdUnitId()>
	//   15   45:aload_0         
	//   16   46:getfield        #59  <Field zzpb zzbjb>
	//   17   49:invokeinterface #231 <Method String zzpb.zzkb()>
	//   18   54:aload_1         
	//   19   55:ldc2            #748 <String "2011">
	//   20   58:invokeinterface #751 <Method boolean Map.containsKey(Object)>
	//   21   63:invokevirtual   #756 <Method void zzakd.zza(String, String, boolean)>
				return;
	//   22   66:return          
			}
			if("1".equals(((Object) (zzbjb.zzkb()))))
	//*  23   67:ldc2            #680 <String "1">
	//*  24   70:aload_0         
	//*  25   71:getfield        #59  <Field zzpb zzbjb>
	//*  26   74:invokeinterface #231 <Method String zzpb.zzkb()>
	//*  27   79:invokevirtual   #672 <Method boolean String.equals(Object)>
	//*  28   82:ifeq            121
				zzbv.zzeo().zzqh().zza(zzbiw.getAdUnitId(), zzbjb.zzkb(), map.containsKey("1009"));
	//   29   85:invokestatic    #737 <Method zzajm zzbv.zzeo()>
	//   30   88:invokevirtual   #743 <Method zzakd zzajm.zzqh()>
	//   31   91:aload_0         
	//   32   92:getfield        #51  <Field zzpa zzbiw>
	//   33   95:invokeinterface #746 <Method String zzpa.getAdUnitId()>
	//   34  100:aload_0         
	//   35  101:getfield        #59  <Field zzpb zzbjb>
	//   36  104:invokeinterface #231 <Method String zzpb.zzkb()>
	//   37  109:aload_1         
	//   38  110:ldc2            #758 <String "1009">
	//   39  113:invokeinterface #751 <Method boolean Map.containsKey(Object)>
	//   40  118:invokevirtual   #756 <Method void zzakd.zza(String, String, boolean)>
		}
	//   41  121:return          
	}

	public final void zzi(View view)
	{
		zzbiw.zzi(view);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field zzpa zzbiw>
	//    2    4:aload_1         
	//    3    5:invokeinterface #761 <Method void zzpa.zzi(View)>
	//    4   10:return          
	}

	public final void zzj(View view)
	{
		zzna zzna = zznk.zzbat;
	//    0    0:getstatic       #764 <Field zzna zznk.zzbat>
	//    1    3:astore_2        
		if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   2    4:invokestatic    #259 <Method zzni zzkb.zzik()>
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #265 <Method Object zzni.zzd(zzna)>
	//*   5   11:checkcast       #267 <Class Boolean>
	//*   6   14:invokevirtual   #270 <Method boolean Boolean.booleanValue()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		if(zzbjc != null)
	//*   9   21:aload_0         
	//*  10   22:getfield        #55  <Field zzci zzbjc>
	//*  11   25:ifnull          47
		{
			zzce zzce1 = zzbjc.zzaa();
	//   12   28:aload_0         
	//   13   29:getfield        #55  <Field zzci zzbjc>
	//   14   32:invokevirtual   #328 <Method zzce zzci.zzaa()>
	//   15   35:astore_2        
			if(zzce1 != null)
	//*  16   36:aload_2         
	//*  17   37:ifnull          47
				zzce1.zzb(view);
	//   18   40:aload_2         
	//   19   41:aload_1         
	//   20   42:invokeinterface #766 <Method void zzce.zzb(View)>
		}
	//   21   47:return          
	}

	public boolean zzkj()
	{
		zzoj zzoj1 = zzbjb.zzkc();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field zzpb zzbjb>
	//    2    4:invokeinterface #542 <Method zzoj zzpb.zzkc()>
	//    3    9:astore_1        
		return zzoj1 != null && zzoj1.zzjv();
	//    4   10:aload_1         
	//    5   11:ifnull          23
	//    6   14:aload_1         
	//    7   15:invokevirtual   #770 <Method boolean zzoj.zzjv()>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public boolean zzkk()
	{
		return zzbja != null && zzbja.optBoolean("allow_pub_owned_ad_view", false);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field JSONObject zzbja>
	//    2    4:ifnull          23
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field JSONObject zzbja>
	//    5   11:ldc2            #773 <String "allow_pub_owned_ad_view">
	//    6   14:iconst_0        
	//    7   15:invokevirtual   #280 <Method boolean JSONObject.optBoolean(String, boolean)>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public void zzkl()
	{
		Preconditions.checkMainThread("Invalid call from a non-UI thread.");
	//    0    0:ldc1            #204 <String "Invalid call from a non-UI thread.">
	//    1    2:invokestatic    #209 <Method void Preconditions.checkMainThread(String)>
		if(zzbje)
	//*   2    5:aload_0         
	//*   3    6:getfield        #776 <Field boolean zzbje>
	//*   4    9:ifeq            13
			return;
	//    5   12:return          
		zzbje = true;
	//    6   13:aload_0         
	//    7   14:iconst_1        
	//    8   15:putfield        #776 <Field boolean zzbje>
		try
		{
			JSONObject jsonobject = new JSONObject();
	//    9   18:new             #78  <Class JSONObject>
	//   10   21:dup             
	//   11   22:invokespecial   #79  <Method void JSONObject()>
	//   12   25:astore_1        
			jsonobject.put("ad", ((Object) (zzbja)));
	//   13   26:aload_1         
	//   14   27:ldc1            #211 <String "ad">
	//   15   29:aload_0         
	//   16   30:getfield        #57  <Field JSONObject zzbja>
	//   17   33:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//   18   36:pop             
			jsonobject.put("ads_id", ((Object) (zzaae)));
	//   19   37:aload_1         
	//   20   38:ldc2            #344 <String "ads_id">
	//   21   41:aload_0         
	//   22   42:getfield        #63  <Field String zzaae>
	//   23   45:invokevirtual   #147 <Method JSONObject JSONObject.put(String, Object)>
	//   24   48:pop             
			zzanm.zza(zzaad.zzk(jsonobject), "NativeAdEngineImpl.recordDownloadedImpression");
	//   25   49:aload_0         
	//   26   50:getfield        #53  <Field zzacm zzaad>
	//   27   53:aload_1         
	//   28   54:invokeinterface #779 <Method zzanz zzacm.zzk(JSONObject)>
	//   29   59:ldc2            #781 <String "NativeAdEngineImpl.recordDownloadedImpression">
	//   30   62:invokestatic    #357 <Method void zzanm.zza(zzanz, String)>
			return;
	//   31   65:return          
		}
		catch(JSONException jsonexception)
	//*  32   66:astore_1        
		{
			zzane.zzb("", ((Throwable) (jsonexception)));
	//   33   67:ldc2            #783 <String "">
	//   34   70:aload_1         
	//   35   71:invokestatic    #786 <Method void zzane.zzb(String, Throwable)>
		}
	//   36   74:return          
	}

	public zzaqw zzko()
		throws zzarg
	{
		if(zzbja != null && zzbja.optJSONObject("overlay") != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field JSONObject zzbja>
	//*   2    4:ifnull          107
	//*   3    7:aload_0         
	//*   4    8:getfield        #57  <Field JSONObject zzbja>
	//*   5   11:ldc2            #792 <String "overlay">
	//*   6   14:invokevirtual   #314 <Method JSONObject JSONObject.optJSONObject(String)>
	//*   7   17:ifnonnull       23
	//*   8   20:goto            107
		{
			zzbv.zzel();
	//    9   23:invokestatic    #796 <Method zzarc zzbv.zzel()>
	//   10   26:pop             
			Object obj = ((Object) (mContext));
	//   11   27:aload_0         
	//   12   28:getfield        #49  <Field Context mContext>
	//   13   31:astore_1        
			zzjn zzjn1 = zzjn.zzf(mContext);
	//   14   32:aload_0         
	//   15   33:getfield        #49  <Field Context mContext>
	//   16   36:invokestatic    #801 <Method zzjn zzjn.zzf(Context)>
	//   17   39:astore_2        
			zzci zzci1 = zzbjc;
	//   18   40:aload_0         
	//   19   41:getfield        #55  <Field zzci zzbjc>
	//   20   44:astore_3        
			zzang zzang = zzyf;
	//   21   45:aload_0         
	//   22   46:getfield        #61  <Field zzang zzyf>
	//   23   49:astore          4
			obj = ((Object) (zzarc.zza(((Context) (obj)), zzasi.zzb(zzjn1), zzjn1.zzarb, false, false, zzci1, zzang, ((zznx) (null)), ((com.google.android.gms.ads.internal.zzbo) (null)), ((com.google.android.gms.ads.internal.zzw) (null)), zzhs.zzhm())));
	//   24   51:aload_1         
	//   25   52:aload_2         
	//   26   53:invokestatic    #806 <Method zzasi zzasi.zzb(zzjn)>
	//   27   56:aload_2         
	//   28   57:getfield        #809 <Field String zzjn.zzarb>
	//   29   60:iconst_0        
	//   30   61:iconst_0        
	//   31   62:aload_3         
	//   32   63:aload           4
	//   33   65:aconst_null     
	//   34   66:aconst_null     
	//   35   67:aconst_null     
	//   36   68:invokestatic    #815 <Method zzhs zzhs.zzhm()>
	//   37   71:invokestatic    #820 <Method zzaqw zzarc.zza(Context, zzasi, String, boolean, boolean, zzci, zzang, zznx, com.google.android.gms.ads.internal.zzbo, com.google.android.gms.ads.internal.zzw, zzhs)>
	//   38   74:astore_1        
			if(obj != null)
	//*  39   75:aload_1         
	//*  40   76:ifnull          105
			{
				((zzaqw) (obj)).getView().setVisibility(8);
	//   41   79:aload_1         
	//   42   80:invokeinterface #825 <Method View zzaqw.getView()>
	//   43   85:bipush          8
	//   44   87:invokevirtual   #828 <Method void View.setVisibility(int)>
				(new zzpf(((zzaqw) (obj)))).zza(zzaad);
	//   45   90:new             #830 <Class zzpf>
	//   46   93:dup             
	//   47   94:aload_1         
	//   48   95:invokespecial   #833 <Method void zzpf(zzaqw)>
	//   49   98:aload_0         
	//   50   99:getfield        #53  <Field zzacm zzaad>
	//   51  102:invokevirtual   #835 <Method void zzpf.zza(zzacm)>
			}
			return ((zzaqw) (obj));
	//   52  105:aload_1         
	//   53  106:areturn         
		} else
		{
			return null;
	//   54  107:aconst_null     
	//   55  108:areturn         
		}
	}

	public void zzkp()
	{
		zzaad.zzmc();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzacm zzaad>
	//    2    4:invokeinterface #839 <Method void zzacm.zzmc()>
	//    3    9:return          
	}

	public void zzkq()
	{
		zzbiw.zzct();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field zzpa zzbiw>
	//    2    4:invokeinterface #843 <Method void zzpa.zzct()>
	//    3    9:return          
	}

	public final View zzkr()
	{
		if(zzbjf != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field WeakReference zzbjf>
	//*   2    4:ifnull          18
			return (View)zzbjf.get();
	//    3    7:aload_0         
	//    4    8:getfield        #47  <Field WeakReference zzbjf>
	//    5   11:invokevirtual   #115 <Method Object WeakReference.get()>
	//    6   14:checkcast       #117 <Class View>
	//    7   17:areturn         
		else
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
	}

	public final zzaix zzks()
	{
		if(zzbv.zzfh().zzu(mContext))
	//*   0    0:invokestatic    #850 <Method zzaiy zzbv.zzfh()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #49  <Field Context mContext>
	//*   3    7:invokevirtual   #855 <Method boolean zzaiy.zzu(Context)>
	//*   4   10:ifeq            49
		{
			if(zzyv == null)
	//*   5   13:aload_0         
	//*   6   14:getfield        #857 <Field zzaix zzyv>
	//*   7   17:ifnonnull       44
				zzyv = new zzaix(mContext, zzbiw.getAdUnitId());
	//    8   20:aload_0         
	//    9   21:new             #859 <Class zzaix>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:getfield        #49  <Field Context mContext>
	//   13   29:aload_0         
	//   14   30:getfield        #51  <Field zzpa zzbiw>
	//   15   33:invokeinterface #746 <Method String zzpa.getAdUnitId()>
	//   16   38:invokespecial   #862 <Method void zzaix(Context, String)>
	//   17   41:putfield        #857 <Field zzaix zzyv>
			return zzyv;
	//   18   44:aload_0         
	//   19   45:getfield        #857 <Field zzaix zzyv>
	//   20   48:areturn         
		} else
		{
			return null;
	//   21   49:aconst_null     
	//   22   50:areturn         
		}
	}

	public final void zzl(View view)
	{
		zzbjf = new WeakReference(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:new             #112 <Class WeakReference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #534 <Method void WeakReference(Object)>
	//    5    9:putfield        #47  <Field WeakReference zzbjf>
	//    6   12:return          
	}

	private final Context mContext;
	private final Object mLock = new Object();
	private final zzacm zzaad;
	private String zzaae;
	private final zzpa zzbiw;
	private final zzok zzbiz;
	private final JSONObject zzbja;
	private final zzpb zzbjb;
	private final zzci zzbjc;
	boolean zzbjd;
	boolean zzbje;
	private WeakReference zzbjf;
	private final zzang zzyf;
	private zzaix zzyv;
}
