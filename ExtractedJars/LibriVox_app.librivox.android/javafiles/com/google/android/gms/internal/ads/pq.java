// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.b.b;
import com.google.android.gms.ads.internal.aw;
import java.util.*;
import java.util.concurrent.Future;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			pe, ov, abe, au, 
//			wi, cf, ap, afn, 
//			av, bj

public final class pq
	implements pe
{

	public pq(boolean flag, boolean flag1, boolean flag2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field boolean a>
		b = flag1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field boolean b>
		c = flag2;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #22  <Field boolean c>
	//   11   19:return          
	}

	public final bj a(ov ov1, JSONObject jsonobject)
	{
		Object obj1 = ((Object) (ov1.a(jsonobject, "images", false, a, b)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:ldc1            #26  <String "images">
	//    3    4:iconst_0        
	//    4    5:aload_0         
	//    5    6:getfield        #18  <Field boolean a>
	//    6    9:aload_0         
	//    7   10:getfield        #20  <Field boolean b>
	//    8   13:invokevirtual   #31  <Method List ov.a(JSONObject, String, boolean, boolean, boolean)>
	//    9   16:astore          6
		Object obj3 = ((Object) (ov1.a(jsonobject, "app_icon", true, a)));
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:ldc1            #33  <String "app_icon">
	//   13   22:iconst_1        
	//   14   23:aload_0         
	//   15   24:getfield        #18  <Field boolean a>
	//   16   27:invokevirtual   #36  <Method abe ov.a(JSONObject, String, boolean, boolean)>
	//   17   30:astore          10
		Object obj = ((Object) (ov1.a(jsonobject, "video")));
	//   18   32:aload_1         
	//   19   33:aload_2         
	//   20   34:ldc1            #38  <String "video">
	//   21   36:invokevirtual   #41  <Method abe ov.a(JSONObject, String)>
	//   22   39:astore          5
		Object obj2 = ((Object) (ov1.a(jsonobject)));
	//   23   41:aload_1         
	//   24   42:aload_2         
	//   25   43:invokevirtual   #44  <Method abe ov.a(JSONObject)>
	//   26   46:astore          9
		ArrayList arraylist = new ArrayList();
	//   27   48:new             #46  <Class ArrayList>
	//   28   51:dup             
	//   29   52:invokespecial   #47  <Method void ArrayList()>
	//   30   55:astore          7
		for(ov1 = ((ov) (((List) (obj1)).iterator())); ((Iterator) (ov1)).hasNext(); ((List) (arraylist)).add(((Object) ((au)((abe)((Iterator) (ov1)).next()).get()))));
	//   31   57:aload           6
	//   32   59:invokeinterface #53  <Method Iterator List.iterator()>
	//   33   64:astore_1        
	//   34   65:aload_1         
	//   35   66:invokeinterface #59  <Method boolean Iterator.hasNext()>
	//   36   71:ifeq            102
	//   37   74:aload           7
	//   38   76:aload_1         
	//   39   77:invokeinterface #63  <Method Object Iterator.next()>
	//   40   82:checkcast       #65  <Class abe>
	//   41   85:invokeinterface #68  <Method Object abe.get()>
	//   42   90:checkcast       #70  <Class au>
	//   43   93:invokeinterface #74  <Method boolean List.add(Object)>
	//   44   98:pop             
	//*  45   99:goto            65
		afn afn1 = ov.a(((abe) (obj)));
	//   46  102:aload           5
	//   47  104:invokestatic    #77  <Method afn ov.a(abe)>
	//   48  107:astore          8
		obj1 = ((Object) (jsonobject.getString("headline")));
	//   49  109:aload_2         
	//   50  110:ldc1            #79  <String "headline">
	//   51  112:invokevirtual   #85  <Method String JSONObject.getString(String)>
	//   52  115:astore          6
		if(c)
	//*  53  117:aload_0         
	//*  54  118:getfield        #22  <Field boolean c>
	//*  55  121:ifeq            215
		{
			ov1 = ((ov) (aw.i().g()));
	//   56  124:invokestatic    #91  <Method wi aw.i()>
	//   57  127:invokevirtual   #97  <Method Resources wi.g()>
	//   58  130:astore_1        
			if(ov1 != null)
	//*  59  131:aload_1         
	//*  60  132:ifnull          147
				obj = ((Object) (((Resources) (ov1)).getString(b.s7)));
	//   61  135:aload_1         
	//   62  136:getstatic       #103 <Field int b.s7>
	//   63  139:invokevirtual   #108 <Method String Resources.getString(int)>
	//   64  142:astore          5
			else
	//*  65  144:goto            151
				obj = "Test Ad";
	//   66  147:ldc1            #110 <String "Test Ad">
	//   67  149:astore          5
			ov1 = ((ov) (obj));
	//   68  151:aload           5
	//   69  153:astore_1        
			if(obj1 != null)
	//*  70  154:aload           6
	//*  71  156:ifnull          218
			{
				ov1 = ((ov) (new StringBuilder(String.valueOf(obj).length() + 3 + String.valueOf(obj1).length())));
	//   72  159:new             #112 <Class StringBuilder>
	//   73  162:dup             
	//   74  163:aload           5
	//   75  165:invokestatic    #118 <Method String String.valueOf(Object)>
	//   76  168:invokevirtual   #122 <Method int String.length()>
	//   77  171:iconst_3        
	//   78  172:iadd            
	//   79  173:aload           6
	//   80  175:invokestatic    #118 <Method String String.valueOf(Object)>
	//   81  178:invokevirtual   #122 <Method int String.length()>
	//   82  181:iadd            
	//   83  182:invokespecial   #125 <Method void StringBuilder(int)>
	//   84  185:astore_1        
				((StringBuilder) (ov1)).append(((String) (obj)));
	//   85  186:aload_1         
	//   86  187:aload           5
	//   87  189:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   88  192:pop             
				((StringBuilder) (ov1)).append(" : ");
	//   89  193:aload_1         
	//   90  194:ldc1            #131 <String " : ">
	//   91  196:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   92  199:pop             
				((StringBuilder) (ov1)).append(((String) (obj1)));
	//   93  200:aload_1         
	//   94  201:aload           6
	//   95  203:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   96  206:pop             
				ov1 = ((ov) (((StringBuilder) (ov1)).toString()));
	//   97  207:aload_1         
	//   98  208:invokevirtual   #135 <Method String StringBuilder.toString()>
	//   99  211:astore_1        
			}
		} else
	//* 100  212:goto            218
		{
			ov1 = ((ov) (obj1));
	//  101  215:aload           6
	//  102  217:astore_1        
		}
		obj1 = ((Object) (jsonobject.getString("body")));
	//  103  218:aload_2         
	//  104  219:ldc1            #137 <String "body">
	//  105  221:invokevirtual   #85  <Method String JSONObject.getString(String)>
	//  106  224:astore          6
		obj3 = ((Object) ((cf)((Future) (obj3)).get()));
	//  107  226:aload           10
	//  108  228:invokeinterface #140 <Method Object Future.get()>
	//  109  233:checkcast       #142 <Class cf>
	//  110  236:astore          10
		String s = jsonobject.getString("call_to_action");
	//  111  238:aload_2         
	//  112  239:ldc1            #144 <String "call_to_action">
	//  113  241:invokevirtual   #85  <Method String JSONObject.getString(String)>
	//  114  244:astore          11
		double d = jsonobject.optDouble("rating", -1D);
	//  115  246:aload_2         
	//  116  247:ldc1            #146 <String "rating">
	//  117  249:ldc2w           #147 <Double -1D>
	//  118  252:invokevirtual   #152 <Method double JSONObject.optDouble(String, double)>
	//  119  255:dstore_3        
		String s1 = jsonobject.optString("store");
	//  120  256:aload_2         
	//  121  257:ldc1            #154 <String "store">
	//  122  259:invokevirtual   #157 <Method String JSONObject.optString(String)>
	//  123  262:astore          12
		String s2 = jsonobject.optString("price");
	//  124  264:aload_2         
	//  125  265:ldc1            #159 <String "price">
	//  126  267:invokevirtual   #157 <Method String JSONObject.optString(String)>
	//  127  270:astore          13
		obj2 = ((Object) ((ap)((Future) (obj2)).get()));
	//  128  272:aload           9
	//  129  274:invokeinterface #140 <Method Object Future.get()>
	//  130  279:checkcast       #161 <Class ap>
	//  131  282:astore          9
		Bundle bundle = new Bundle();
	//  132  284:new             #163 <Class Bundle>
	//  133  287:dup             
	//  134  288:invokespecial   #164 <Method void Bundle()>
	//  135  291:astore          14
		if(afn1 != null)
	//* 136  293:aload           8
	//* 137  295:ifnull          309
			jsonobject = ((JSONObject) (afn1.b()));
	//  138  298:aload           8
	//  139  300:invokeinterface #169 <Method agd com.google.android.gms.internal.ads.afn.b()>
	//  140  305:astore_2        
		else
	//* 141  306:goto            311
			jsonobject = null;
	//  142  309:aconst_null     
	//  143  310:astore_2        
		if(afn1 != null)
	//* 144  311:aload           8
	//* 145  313:ifnull          328
			obj = ((Object) (afn1.getView()));
	//  146  316:aload           8
	//  147  318:invokeinterface #173 <Method android.view.View afn.getView()>
	//  148  323:astore          5
		else
	//* 149  325:goto            331
			obj = null;
	//  150  328:aconst_null     
	//  151  329:astore          5
		return ((bj) (new av(((String) (ov1)), ((List) (arraylist)), ((String) (obj1)), ((cf) (obj3)), s, d, s1, s2, ((ap) (obj2)), bundle, ((byg) (jsonobject)), ((android.view.View) (obj)), ((com.google.android.gms.c.a) (null)), ((String) (null)))));
	//  152  331:new             #175 <Class av>
	//  153  334:dup             
	//  154  335:aload_1         
	//  155  336:aload           7
	//  156  338:aload           6
	//  157  340:aload           10
	//  158  342:aload           11
	//  159  344:dload_3         
	//  160  345:aload           12
	//  161  347:aload           13
	//  162  349:aload           9
	//  163  351:aload           14
	//  164  353:aload_2         
	//  165  354:aload           5
	//  166  356:aconst_null     
	//  167  357:aconst_null     
	//  168  358:invokespecial   #178 <Method void av(String, List, String, cf, String, double, String, String, ap, Bundle, byg, android.view.View, com.google.android.gms.c.a, String)>
	//  169  361:areturn         
	}

	private final boolean a;
	private final boolean b;
	private final boolean c;
}
