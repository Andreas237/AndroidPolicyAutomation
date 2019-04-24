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
//			zzpw, zzoj, zzaqw, zzoq, 
//			zzpb

public final class zzaco
	implements zzacd
{

	public zzaco(boolean flag, boolean flag1, boolean flag2)
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
		Object obj1;
		Object obj2;
label0:
		{
			obj = ((Object) (zzabv1.zza(jsonobject, "images", false, zzcbk, zzcbl)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:ldc1            #34  <String "images">
	//    3    4:iconst_0        
	//    4    5:aload_0         
	//    5    6:getfield        #19  <Field boolean zzcbk>
	//    6    9:aload_0         
	//    7   10:getfield        #21  <Field boolean zzcbl>
	//    8   13:invokevirtual   #39  <Method List zzabv.zza(JSONObject, String, boolean, boolean, boolean)>
	//    9   16:astore_3        
			obj2 = ((Object) (zzabv1.zza(jsonobject, "secondary_image", false, zzcbk)));
	//   10   17:aload_1         
	//   11   18:aload_2         
	//   12   19:ldc1            #41  <String "secondary_image">
	//   13   21:iconst_0        
	//   14   22:aload_0         
	//   15   23:getfield        #19  <Field boolean zzcbk>
	//   16   26:invokevirtual   #44  <Method zzanz zzabv.zza(JSONObject, String, boolean, boolean)>
	//   17   29:astore          8
			obj1 = ((Object) (zzabv1.zzg(jsonobject)));
	//   18   31:aload_1         
	//   19   32:aload_2         
	//   20   33:invokevirtual   #48  <Method zzanz zzabv.zzg(JSONObject)>
	//   21   36:astore          7
			zzabv1 = ((zzabv) (zzabv1.zzc(jsonobject, "video")));
	//   22   38:aload_1         
	//   23   39:aload_2         
	//   24   40:ldc1            #50  <String "video">
	//   25   42:invokevirtual   #54  <Method zzanz zzabv.zzc(JSONObject, String)>
	//   26   45:astore_1        
			arraylist = new ArrayList();
	//   27   46:new             #56  <Class ArrayList>
	//   28   49:dup             
	//   29   50:invokespecial   #57  <Method void ArrayList()>
	//   30   53:astore          5
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((List) (arraylist)).add(((Object) ((zzon)((zzanz)((Iterator) (obj)).next()).get()))));
	//   31   55:aload_3         
	//   32   56:invokeinterface #63  <Method Iterator List.iterator()>
	//   33   61:astore_3        
	//   34   62:aload_3         
	//   35   63:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//   36   68:ifeq            99
	//   37   71:aload           5
	//   38   73:aload_3         
	//   39   74:invokeinterface #73  <Method Object Iterator.next()>
	//   40   79:checkcast       #75  <Class zzanz>
	//   41   82:invokeinterface #78  <Method Object zzanz.get()>
	//   42   87:checkcast       #80  <Class zzon>
	//   43   90:invokeinterface #84  <Method boolean List.add(Object)>
	//   44   95:pop             
	//*  45   96:goto            62
			zzaqw1 = zzabv.zzc(((zzanz) (zzabv1)));
	//   46   99:aload_1         
	//   47  100:invokestatic    #87  <Method zzaqw zzabv.zzc(zzanz)>
	//   48  103:astore          6
			String s = jsonobject.getString("headline");
	//   49  105:aload_2         
	//   50  106:ldc1            #89  <String "headline">
	//   51  108:invokevirtual   #95  <Method String JSONObject.getString(String)>
	//   52  111:astore          4
			zzabv1 = ((zzabv) (s));
	//   53  113:aload           4
	//   54  115:astore_1        
			if(zzbto)
	//*  55  116:aload_0         
	//*  56  117:getfield        #23  <Field boolean zzbto>
	//*  57  120:ifeq            229
			{
				obj = ((Object) (zznk.zzbfr));
	//   58  123:getstatic       #101 <Field zzna zznk.zzbfr>
	//   59  126:astore_3        
				zzabv1 = ((zzabv) (s));
	//   60  127:aload           4
	//   61  129:astore_1        
				if(((Boolean)zzkb.zzik().zzd(((zzna) (obj)))).booleanValue())
	//*  62  130:invokestatic    #107 <Method zzni zzkb.zzik()>
	//*  63  133:aload_3         
	//*  64  134:invokevirtual   #113 <Method Object zzni.zzd(zzna)>
	//*  65  137:checkcast       #115 <Class Boolean>
	//*  66  140:invokevirtual   #118 <Method boolean Boolean.booleanValue()>
	//*  67  143:ifeq            229
				{
					zzabv1 = ((zzabv) (zzbv.zzeo().getResources()));
	//   68  146:invokestatic    #124 <Method zzajm zzbv.zzeo()>
	//   69  149:invokevirtual   #130 <Method Resources zzajm.getResources()>
	//   70  152:astore_1        
					if(zzabv1 != null)
	//*  71  153:aload_1         
	//*  72  154:ifnull          168
						zzabv1 = ((zzabv) (((Resources) (zzabv1)).getString(com.google.android.gms.ads.impl.R.string.s7)));
	//   73  157:aload_1         
	//   74  158:getstatic       #136 <Field int com.google.android.gms.ads.impl.R$string.s7>
	//   75  161:invokevirtual   #141 <Method String Resources.getString(int)>
	//   76  164:astore_1        
					else
	//*  77  165:goto            171
						zzabv1 = "Test Ad";
	//   78  168:ldc1            #143 <String "Test Ad">
	//   79  170:astore_1        
					obj = ((Object) (zzabv1));
	//   80  171:aload_1         
	//   81  172:astore_3        
					if(s == null)
						break label0;
	//   82  173:aload           4
	//   83  175:ifnull          231
					obj = ((Object) (new StringBuilder(3 + String.valueOf(((Object) (zzabv1))).length() + String.valueOf(((Object) (s))).length())));
	//   84  178:new             #145 <Class StringBuilder>
	//   85  181:dup             
	//   86  182:iconst_3        
	//   87  183:aload_1         
	//   88  184:invokestatic    #151 <Method String String.valueOf(Object)>
	//   89  187:invokevirtual   #155 <Method int String.length()>
	//   90  190:iadd            
	//   91  191:aload           4
	//   92  193:invokestatic    #151 <Method String String.valueOf(Object)>
	//   93  196:invokevirtual   #155 <Method int String.length()>
	//   94  199:iadd            
	//   95  200:invokespecial   #158 <Method void StringBuilder(int)>
	//   96  203:astore_3        
					((StringBuilder) (obj)).append(((String) (zzabv1)));
	//   97  204:aload_3         
	//   98  205:aload_1         
	//   99  206:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//  100  209:pop             
					((StringBuilder) (obj)).append(" : ");
	//  101  210:aload_3         
	//  102  211:ldc1            #164 <String " : ">
	//  103  213:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//  104  216:pop             
					((StringBuilder) (obj)).append(s);
	//  105  217:aload_3         
	//  106  218:aload           4
	//  107  220:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//  108  223:pop             
					zzabv1 = ((zzabv) (((StringBuilder) (obj)).toString()));
	//  109  224:aload_3         
	//  110  225:invokevirtual   #168 <Method String StringBuilder.toString()>
	//  111  228:astore_1        
				}
			}
			obj = ((Object) (zzabv1));
	//  112  229:aload_1         
	//  113  230:astore_3        
		}
		String s1 = jsonobject.getString("body");
	//  114  231:aload_2         
	//  115  232:ldc1            #170 <String "body">
	//  116  234:invokevirtual   #95  <Method String JSONObject.getString(String)>
	//  117  237:astore          4
		obj2 = ((Object) ((zzpw)((Future) (obj2)).get()));
	//  118  239:aload           8
	//  119  241:invokeinterface #173 <Method Object Future.get()>
	//  120  246:checkcast       #175 <Class zzpw>
	//  121  249:astore          8
		String s2 = jsonobject.getString("call_to_action");
	//  122  251:aload_2         
	//  123  252:ldc1            #177 <String "call_to_action">
	//  124  254:invokevirtual   #95  <Method String JSONObject.getString(String)>
	//  125  257:astore          9
		String s3 = jsonobject.getString("advertiser");
	//  126  259:aload_2         
	//  127  260:ldc1            #179 <String "advertiser">
	//  128  262:invokevirtual   #95  <Method String JSONObject.getString(String)>
	//  129  265:astore          10
		obj1 = ((Object) ((zzoj)((Future) (obj1)).get()));
	//  130  267:aload           7
	//  131  269:invokeinterface #173 <Method Object Future.get()>
	//  132  274:checkcast       #181 <Class zzoj>
	//  133  277:astore          7
		Bundle bundle = new Bundle();
	//  134  279:new             #183 <Class Bundle>
	//  135  282:dup             
	//  136  283:invokespecial   #184 <Method void Bundle()>
	//  137  286:astore          11
		if(zzaqw1 != null)
	//* 138  288:aload           6
	//* 139  290:ifnull          304
			zzabv1 = ((zzabv) (zzaqw1.zztm()));
	//  140  293:aload           6
	//  141  295:invokeinterface #190 <Method zzarl zzaqw.zztm()>
	//  142  300:astore_1        
		else
	//* 143  301:goto            306
			zzabv1 = null;
	//  144  304:aconst_null     
	//  145  305:astore_1        
		if(zzaqw1 != null)
	//* 146  306:aload           6
	//* 147  308:ifnull          322
			jsonobject = ((JSONObject) (zzaqw1.getView()));
	//  148  311:aload           6
	//  149  313:invokeinterface #194 <Method android.view.View zzaqw.getView()>
	//  150  318:astore_2        
		else
	//* 151  319:goto            324
			jsonobject = null;
	//  152  322:aconst_null     
	//  153  323:astore_2        
		return ((zzpb) (new zzoq(((String) (obj)), ((List) (arraylist)), s1, ((zzpw) (obj2)), s2, s3, ((zzoj) (obj1)), bundle, ((zzlo) (zzabv1)), ((android.view.View) (jsonobject)), ((com.google.android.gms.dynamic.IObjectWrapper) (null)), ((String) (null)))));
	//  154  324:new             #196 <Class zzoq>
	//  155  327:dup             
	//  156  328:aload_3         
	//  157  329:aload           5
	//  158  331:aload           4
	//  159  333:aload           8
	//  160  335:aload           9
	//  161  337:aload           10
	//  162  339:aload           7
	//  163  341:aload           11
	//  164  343:aload_1         
	//  165  344:aload_2         
	//  166  345:aconst_null     
	//  167  346:aconst_null     
	//  168  347:invokespecial   #199 <Method void zzoq(String, List, String, zzpw, String, String, zzoj, Bundle, zzlo, android.view.View, com.google.android.gms.dynamic.IObjectWrapper, String)>
	//  169  350:areturn         
	}

	private final boolean zzbto;
	private final boolean zzcbk;
	private final boolean zzcbl;
}
