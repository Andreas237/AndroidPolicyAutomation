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
//			ax, bj

public final class pr
	implements pe
{

	public pr(boolean flag, boolean flag1, boolean flag2)
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
		Object obj = ((Object) (ov1.a(jsonobject, "images", false, a, b)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:ldc1            #26  <String "images">
	//    3    4:iconst_0        
	//    4    5:aload_0         
	//    5    6:getfield        #18  <Field boolean a>
	//    6    9:aload_0         
	//    7   10:getfield        #20  <Field boolean b>
	//    8   13:invokevirtual   #31  <Method List ov.a(JSONObject, String, boolean, boolean, boolean)>
	//    9   16:astore_3        
		Object obj2 = ((Object) (ov1.a(jsonobject, "secondary_image", false, a)));
	//   10   17:aload_1         
	//   11   18:aload_2         
	//   12   19:ldc1            #33  <String "secondary_image">
	//   13   21:iconst_0        
	//   14   22:aload_0         
	//   15   23:getfield        #18  <Field boolean a>
	//   16   26:invokevirtual   #36  <Method abe ov.a(JSONObject, String, boolean, boolean)>
	//   17   29:astore          8
		Object obj1 = ((Object) (ov1.a(jsonobject)));
	//   18   31:aload_1         
	//   19   32:aload_2         
	//   20   33:invokevirtual   #39  <Method abe ov.a(JSONObject)>
	//   21   36:astore          7
		ov1 = ((ov) (ov1.a(jsonobject, "video")));
	//   22   38:aload_1         
	//   23   39:aload_2         
	//   24   40:ldc1            #41  <String "video">
	//   25   42:invokevirtual   #44  <Method abe ov.a(JSONObject, String)>
	//   26   45:astore_1        
		ArrayList arraylist = new ArrayList();
	//   27   46:new             #46  <Class ArrayList>
	//   28   49:dup             
	//   29   50:invokespecial   #47  <Method void ArrayList()>
	//   30   53:astore          5
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((List) (arraylist)).add(((Object) ((au)((abe)((Iterator) (obj)).next()).get()))));
	//   31   55:aload_3         
	//   32   56:invokeinterface #53  <Method Iterator List.iterator()>
	//   33   61:astore_3        
	//   34   62:aload_3         
	//   35   63:invokeinterface #59  <Method boolean Iterator.hasNext()>
	//   36   68:ifeq            99
	//   37   71:aload           5
	//   38   73:aload_3         
	//   39   74:invokeinterface #63  <Method Object Iterator.next()>
	//   40   79:checkcast       #65  <Class abe>
	//   41   82:invokeinterface #68  <Method Object abe.get()>
	//   42   87:checkcast       #70  <Class au>
	//   43   90:invokeinterface #74  <Method boolean List.add(Object)>
	//   44   95:pop             
	//*  45   96:goto            62
		afn afn1 = ov.a(((abe) (ov1)));
	//   46   99:aload_1         
	//   47  100:invokestatic    #77  <Method afn ov.a(abe)>
	//   48  103:astore          6
		String s = jsonobject.getString("headline");
	//   49  105:aload_2         
	//   50  106:ldc1            #79  <String "headline">
	//   51  108:invokevirtual   #85  <Method String JSONObject.getString(String)>
	//   52  111:astore          4
		if(c)
	//*  53  113:aload_0         
	//*  54  114:getfield        #22  <Field boolean c>
	//*  55  117:ifeq            206
		{
			ov1 = ((ov) (aw.i().g()));
	//   56  120:invokestatic    #91  <Method wi aw.i()>
	//   57  123:invokevirtual   #97  <Method Resources wi.g()>
	//   58  126:astore_1        
			if(ov1 != null)
	//*  59  127:aload_1         
	//*  60  128:ifnull          142
				obj = ((Object) (((Resources) (ov1)).getString(b.s7)));
	//   61  131:aload_1         
	//   62  132:getstatic       #103 <Field int b.s7>
	//   63  135:invokevirtual   #108 <Method String Resources.getString(int)>
	//   64  138:astore_3        
			else
	//*  65  139:goto            145
				obj = "Test Ad";
	//   66  142:ldc1            #110 <String "Test Ad">
	//   67  144:astore_3        
			ov1 = ((ov) (obj));
	//   68  145:aload_3         
	//   69  146:astore_1        
			if(s != null)
	//*  70  147:aload           4
	//*  71  149:ifnull          209
			{
				ov1 = ((ov) (new StringBuilder(String.valueOf(obj).length() + 3 + String.valueOf(((Object) (s))).length())));
	//   72  152:new             #112 <Class StringBuilder>
	//   73  155:dup             
	//   74  156:aload_3         
	//   75  157:invokestatic    #118 <Method String String.valueOf(Object)>
	//   76  160:invokevirtual   #122 <Method int String.length()>
	//   77  163:iconst_3        
	//   78  164:iadd            
	//   79  165:aload           4
	//   80  167:invokestatic    #118 <Method String String.valueOf(Object)>
	//   81  170:invokevirtual   #122 <Method int String.length()>
	//   82  173:iadd            
	//   83  174:invokespecial   #125 <Method void StringBuilder(int)>
	//   84  177:astore_1        
				((StringBuilder) (ov1)).append(((String) (obj)));
	//   85  178:aload_1         
	//   86  179:aload_3         
	//   87  180:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   88  183:pop             
				((StringBuilder) (ov1)).append(" : ");
	//   89  184:aload_1         
	//   90  185:ldc1            #131 <String " : ">
	//   91  187:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   92  190:pop             
				((StringBuilder) (ov1)).append(s);
	//   93  191:aload_1         
	//   94  192:aload           4
	//   95  194:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   96  197:pop             
				ov1 = ((ov) (((StringBuilder) (ov1)).toString()));
	//   97  198:aload_1         
	//   98  199:invokevirtual   #135 <Method String StringBuilder.toString()>
	//   99  202:astore_1        
			}
		} else
	//* 100  203:goto            209
		{
			ov1 = ((ov) (s));
	//  101  206:aload           4
	//  102  208:astore_1        
		}
		s = jsonobject.getString("body");
	//  103  209:aload_2         
	//  104  210:ldc1            #137 <String "body">
	//  105  212:invokevirtual   #85  <Method String JSONObject.getString(String)>
	//  106  215:astore          4
		obj2 = ((Object) ((cf)((Future) (obj2)).get()));
	//  107  217:aload           8
	//  108  219:invokeinterface #140 <Method Object Future.get()>
	//  109  224:checkcast       #142 <Class cf>
	//  110  227:astore          8
		String s1 = jsonobject.getString("call_to_action");
	//  111  229:aload_2         
	//  112  230:ldc1            #144 <String "call_to_action">
	//  113  232:invokevirtual   #85  <Method String JSONObject.getString(String)>
	//  114  235:astore          9
		String s2 = jsonobject.getString("advertiser");
	//  115  237:aload_2         
	//  116  238:ldc1            #146 <String "advertiser">
	//  117  240:invokevirtual   #85  <Method String JSONObject.getString(String)>
	//  118  243:astore          10
		obj1 = ((Object) ((ap)((Future) (obj1)).get()));
	//  119  245:aload           7
	//  120  247:invokeinterface #140 <Method Object Future.get()>
	//  121  252:checkcast       #148 <Class ap>
	//  122  255:astore          7
		Bundle bundle = new Bundle();
	//  123  257:new             #150 <Class Bundle>
	//  124  260:dup             
	//  125  261:invokespecial   #151 <Method void Bundle()>
	//  126  264:astore          11
		if(afn1 != null)
	//* 127  266:aload           6
	//* 128  268:ifnull          282
			jsonobject = ((JSONObject) (afn1.b()));
	//  129  271:aload           6
	//  130  273:invokeinterface #156 <Method agd com.google.android.gms.internal.ads.afn.b()>
	//  131  278:astore_2        
		else
	//* 132  279:goto            284
			jsonobject = null;
	//  133  282:aconst_null     
	//  134  283:astore_2        
		if(afn1 != null)
	//* 135  284:aload           6
	//* 136  286:ifnull          300
			obj = ((Object) (afn1.getView()));
	//  137  289:aload           6
	//  138  291:invokeinterface #160 <Method android.view.View afn.getView()>
	//  139  296:astore_3        
		else
	//* 140  297:goto            302
			obj = null;
	//  141  300:aconst_null     
	//  142  301:astore_3        
		return ((bj) (new ax(((String) (ov1)), ((List) (arraylist)), s, ((cf) (obj2)), s1, s2, ((ap) (obj1)), bundle, ((byg) (jsonobject)), ((android.view.View) (obj)), ((com.google.android.gms.c.a) (null)), ((String) (null)))));
	//  143  302:new             #162 <Class ax>
	//  144  305:dup             
	//  145  306:aload_1         
	//  146  307:aload           5
	//  147  309:aload           4
	//  148  311:aload           8
	//  149  313:aload           9
	//  150  315:aload           10
	//  151  317:aload           7
	//  152  319:aload           11
	//  153  321:aload_2         
	//  154  322:aload_3         
	//  155  323:aconst_null     
	//  156  324:aconst_null     
	//  157  325:invokespecial   #165 <Method void ax(String, List, String, cf, String, String, ap, Bundle, byg, android.view.View, com.google.android.gms.c.a, String)>
	//  158  328:areturn         
	}

	private final boolean a;
	private final boolean b;
	private final boolean c;
}
