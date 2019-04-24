// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzacd, zzabv, zzanz, zzon, 
//			zznk, zzkb, zzni, zzajm, 
//			zzpw, zzoj, zzaqw, zzoo, 
//			zzpb

public final class zzacn
	implements zzacd
{

	public zzacn(boolean flag, boolean flag1, boolean flag2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzcbk = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #19  <Field boolean zzcbk>
		zzcbl = flag1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field boolean zzcbl>
		zzbto = flag2;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field boolean zzbto>
	//   11   19:return          
	}

	public final zzpb zza(zzabv zzabv1, JSONObject jsonobject)
		throws JSONException, InterruptedException, ExecutionException
	{
		Object obj;
		ArrayList arraylist;
		zzaqw zzaqw1;
		Object obj2;
		Object obj3;
label0:
		{
			Object obj1 = ((Object) (zzabv1.zza(jsonobject, "images", false, zzcbk, zzcbl)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:ldc1            #34  <String "images">
	//    3    4:iconst_0        
	//    4    5:aload_0         
	//    5    6:getfield        #19  <Field boolean zzcbk>
	//    6    9:aload_0         
	//    7   10:getfield        #21  <Field boolean zzcbl>
	//    8   13:invokevirtual   #39  <Method List zzabv.zza(JSONObject, String, boolean, boolean, boolean)>
	//    9   16:astore          6
			obj3 = ((Object) (zzabv1.zza(jsonobject, "app_icon", true, zzcbk)));
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:ldc1            #41  <String "app_icon">
	//   13   22:iconst_1        
	//   14   23:aload_0         
	//   15   24:getfield        #19  <Field boolean zzcbk>
	//   16   27:invokevirtual   #44  <Method zzanz zzabv.zza(JSONObject, String, boolean, boolean)>
	//   17   30:astore          10
			obj = ((Object) (zzabv1.zzc(jsonobject, "video")));
	//   18   32:aload_1         
	//   19   33:aload_2         
	//   20   34:ldc1            #46  <String "video">
	//   21   36:invokevirtual   #50  <Method zzanz zzabv.zzc(JSONObject, String)>
	//   22   39:astore          5
			obj2 = ((Object) (zzabv1.zzg(jsonobject)));
	//   23   41:aload_1         
	//   24   42:aload_2         
	//   25   43:invokevirtual   #54  <Method zzanz zzabv.zzg(JSONObject)>
	//   26   46:astore          9
			arraylist = new ArrayList();
	//   27   48:new             #56  <Class ArrayList>
	//   28   51:dup             
	//   29   52:invokespecial   #57  <Method void ArrayList()>
	//   30   55:astore          7
			for(zzabv1 = ((zzabv) (((List) (obj1)).iterator())); ((Iterator) (zzabv1)).hasNext(); ((List) (arraylist)).add(((Object) ((zzon)((zzanz)((Iterator) (zzabv1)).next()).get()))));
	//   31   57:aload           6
	//   32   59:invokeinterface #63  <Method Iterator List.iterator()>
	//   33   64:astore_1        
	//   34   65:aload_1         
	//   35   66:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//   36   71:ifeq            102
	//   37   74:aload           7
	//   38   76:aload_1         
	//   39   77:invokeinterface #73  <Method Object Iterator.next()>
	//   40   82:checkcast       #75  <Class zzanz>
	//   41   85:invokeinterface #78  <Method Object zzanz.get()>
	//   42   90:checkcast       #80  <Class zzon>
	//   43   93:invokeinterface #84  <Method boolean List.add(Object)>
	//   44   98:pop             
	//*  45   99:goto            65
			zzaqw1 = zzabv.zzc(((zzanz) (obj)));
	//   46  102:aload           5
	//   47  104:invokestatic    #87  <Method zzaqw zzabv.zzc(zzanz)>
	//   48  107:astore          8
			obj1 = ((Object) (jsonobject.getString("headline")));
	//   49  109:aload_2         
	//   50  110:ldc1            #89  <String "headline">
	//   51  112:invokevirtual   #95  <Method String JSONObject.getString(String)>
	//   52  115:astore          6
			zzabv1 = ((zzabv) (obj1));
	//   53  117:aload           6
	//   54  119:astore_1        
			if(zzbto)
	//*  55  120:aload_0         
	//*  56  121:getfield        #23  <Field boolean zzbto>
	//*  57  124:ifeq            241
			{
				obj = ((Object) (zznk.zzbfr));
	//   58  127:getstatic       #101 <Field zzna zznk.zzbfr>
	//   59  130:astore          5
				zzabv1 = ((zzabv) (obj1));
	//   60  132:aload           6
	//   61  134:astore_1        
				if(((Boolean)zzkb.zzik().zzd(((zzna) (obj)))).booleanValue())
	//*  62  135:invokestatic    #107 <Method zzni zzkb.zzik()>
	//*  63  138:aload           5
	//*  64  140:invokevirtual   #113 <Method Object zzni.zzd(zzna)>
	//*  65  143:checkcast       #115 <Class Boolean>
	//*  66  146:invokevirtual   #118 <Method boolean Boolean.booleanValue()>
	//*  67  149:ifeq            241
				{
					zzabv1 = ((zzabv) (zzbv.zzeo().getResources()));
	//   68  152:invokestatic    #124 <Method zzajm zzbv.zzeo()>
	//   69  155:invokevirtual   #130 <Method Resources zzajm.getResources()>
	//   70  158:astore_1        
					if(zzabv1 != null)
	//*  71  159:aload_1         
	//*  72  160:ifnull          174
						zzabv1 = ((zzabv) (((Resources) (zzabv1)).getString(com.google.android.gms.ads.impl.R.string.s7)));
	//   73  163:aload_1         
	//   74  164:getstatic       #136 <Field int com.google.android.gms.ads.impl.R$string.s7>
	//   75  167:invokevirtual   #141 <Method String Resources.getString(int)>
	//   76  170:astore_1        
					else
	//*  77  171:goto            177
						zzabv1 = "Test Ad";
	//   78  174:ldc1            #143 <String "Test Ad">
	//   79  176:astore_1        
					obj = ((Object) (zzabv1));
	//   80  177:aload_1         
	//   81  178:astore          5
					if(obj1 == null)
						break label0;
	//   82  180:aload           6
	//   83  182:ifnull          244
					obj = ((Object) (new StringBuilder(3 + String.valueOf(((Object) (zzabv1))).length() + String.valueOf(obj1).length())));
	//   84  185:new             #145 <Class StringBuilder>
	//   85  188:dup             
	//   86  189:iconst_3        
	//   87  190:aload_1         
	//   88  191:invokestatic    #151 <Method String String.valueOf(Object)>
	//   89  194:invokevirtual   #155 <Method int String.length()>
	//   90  197:iadd            
	//   91  198:aload           6
	//   92  200:invokestatic    #151 <Method String String.valueOf(Object)>
	//   93  203:invokevirtual   #155 <Method int String.length()>
	//   94  206:iadd            
	//   95  207:invokespecial   #158 <Method void StringBuilder(int)>
	//   96  210:astore          5
					((StringBuilder) (obj)).append(((String) (zzabv1)));
	//   97  212:aload           5
	//   98  214:aload_1         
	//   99  215:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//  100  218:pop             
					((StringBuilder) (obj)).append(" : ");
	//  101  219:aload           5
	//  102  221:ldc1            #164 <String " : ">
	//  103  223:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//  104  226:pop             
					((StringBuilder) (obj)).append(((String) (obj1)));
	//  105  227:aload           5
	//  106  229:aload           6
	//  107  231:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//  108  234:pop             
					zzabv1 = ((zzabv) (((StringBuilder) (obj)).toString()));
	//  109  235:aload           5
	//  110  237:invokevirtual   #168 <Method String StringBuilder.toString()>
	//  111  240:astore_1        
				}
			}
			obj = ((Object) (zzabv1));
	//  112  241:aload_1         
	//  113  242:astore          5
		}
		String s = jsonobject.getString("body");
	//  114  244:aload_2         
	//  115  245:ldc1            #170 <String "body">
	//  116  247:invokevirtual   #95  <Method String JSONObject.getString(String)>
	//  117  250:astore          6
		obj3 = ((Object) ((zzpw)((Future) (obj3)).get()));
	//  118  252:aload           10
	//  119  254:invokeinterface #173 <Method Object Future.get()>
	//  120  259:checkcast       #175 <Class zzpw>
	//  121  262:astore          10
		String s1 = jsonobject.getString("call_to_action");
	//  122  264:aload_2         
	//  123  265:ldc1            #177 <String "call_to_action">
	//  124  267:invokevirtual   #95  <Method String JSONObject.getString(String)>
	//  125  270:astore          11
		double d = jsonobject.optDouble("rating", -1D);
	//  126  272:aload_2         
	//  127  273:ldc1            #179 <String "rating">
	//  128  275:ldc2w           #180 <Double -1D>
	//  129  278:invokevirtual   #185 <Method double JSONObject.optDouble(String, double)>
	//  130  281:dstore_3        
		String s2 = jsonobject.optString("store");
	//  131  282:aload_2         
	//  132  283:ldc1            #187 <String "store">
	//  133  285:invokevirtual   #190 <Method String JSONObject.optString(String)>
	//  134  288:astore          12
		String s3 = jsonobject.optString("price");
	//  135  290:aload_2         
	//  136  291:ldc1            #192 <String "price">
	//  137  293:invokevirtual   #190 <Method String JSONObject.optString(String)>
	//  138  296:astore          13
		obj2 = ((Object) ((zzoj)((Future) (obj2)).get()));
	//  139  298:aload           9
	//  140  300:invokeinterface #173 <Method Object Future.get()>
	//  141  305:checkcast       #194 <Class zzoj>
	//  142  308:astore          9
		Bundle bundle = new Bundle();
	//  143  310:new             #196 <Class Bundle>
	//  144  313:dup             
	//  145  314:invokespecial   #197 <Method void Bundle()>
	//  146  317:astore          14
		if(zzaqw1 != null)
	//* 147  319:aload           8
	//* 148  321:ifnull          335
			zzabv1 = ((zzabv) (zzaqw1.zztm()));
	//  149  324:aload           8
	//  150  326:invokeinterface #203 <Method zzarl zzaqw.zztm()>
	//  151  331:astore_1        
		else
	//* 152  332:goto            337
			zzabv1 = null;
	//  153  335:aconst_null     
	//  154  336:astore_1        
		if(zzaqw1 != null)
	//* 155  337:aload           8
	//* 156  339:ifnull          353
			jsonobject = ((JSONObject) (zzaqw1.getView()));
	//  157  342:aload           8
	//  158  344:invokeinterface #207 <Method android.view.View zzaqw.getView()>
	//  159  349:astore_2        
		else
	//* 160  350:goto            355
			jsonobject = null;
	//  161  353:aconst_null     
	//  162  354:astore_2        
		return ((zzpb) (new zzoo(((String) (obj)), ((List) (arraylist)), s, ((zzpw) (obj3)), s1, d, s2, s3, ((zzoj) (obj2)), bundle, ((zzlo) (zzabv1)), ((android.view.View) (jsonobject)), ((com.google.android.gms.dynamic.IObjectWrapper) (null)), ((String) (null)))));
	//  163  355:new             #209 <Class zzoo>
	//  164  358:dup             
	//  165  359:aload           5
	//  166  361:aload           7
	//  167  363:aload           6
	//  168  365:aload           10
	//  169  367:aload           11
	//  170  369:dload_3         
	//  171  370:aload           12
	//  172  372:aload           13
	//  173  374:aload           9
	//  174  376:aload           14
	//  175  378:aload_1         
	//  176  379:aload_2         
	//  177  380:aconst_null     
	//  178  381:aconst_null     
	//  179  382:invokespecial   #212 <Method void zzoo(String, List, String, zzpw, String, double, String, String, zzoj, Bundle, zzlo, android.view.View, com.google.android.gms.dynamic.IObjectWrapper, String)>
	//  180  385:areturn         
	}

	private final boolean zzbto;
	private final boolean zzcbk;
	private final boolean zzcbl;
}
