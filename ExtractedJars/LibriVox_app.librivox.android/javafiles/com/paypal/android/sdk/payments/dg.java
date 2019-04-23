// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.*;
import java.util.Map;

// Referenced classes of package com.paypal.android.sdk.payments:
//			dh, bl, PayPalService

final class dg extends dh
{

	public dg(PayPalService paypalservice)
	{
		super(new bl(paypalservice));
	//    0    0:aload_0         
	//    1    1:new             #8   <Class bl>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #10  <Method void bl(PayPalService)>
	//    5    9:invokespecial   #13  <Method void dh(bl)>
	//    6   12:return          
	}

	protected final String a()
	{
		return "msdk";
	//    0    0:ldc1            #18  <String "msdk">
	//    1    2:areturn         
	}

	protected final void a(String s, Map map)
	{
		if(!b().a().a.b())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #23  <Method bl b()>
	//*   2    4:invokevirtual   #26  <Method ck com.paypal.android.sdk.payments.bl.a()>
	//*   3    7:getfield        #31  <Field ey ck.a>
	//*   4   10:invokevirtual   #36  <Method boolean ey.b()>
	//*   5   13:ifne            33
			b().a().a = new ey();
	//    6   16:aload_0         
	//    7   17:invokevirtual   #23  <Method bl b()>
	//    8   20:invokevirtual   #26  <Method ck com.paypal.android.sdk.payments.bl.a()>
	//    9   23:new             #33  <Class ey>
	//   10   26:dup             
	//   11   27:invokespecial   #39  <Method void ey()>
	//   12   30:putfield        #31  <Field ey ck.a>
		map.put("v49", ((Object) (s)));
	//   13   33:aload_2         
	//   14   34:ldc1            #41  <String "v49">
	//   15   36:aload_1         
	//   16   37:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   17   42:pop             
		map.put("v51", ((Object) (b().c().d().d())));
	//   18   43:aload_2         
	//   19   44:ldc1            #49  <String "v51">
	//   20   46:aload_0         
	//   21   47:invokevirtual   #23  <Method bl b()>
	//   22   50:invokevirtual   #53  <Method av bl.c()>
	//   23   53:invokevirtual   #59  <Method a av.d()>
	//   24   56:invokevirtual   #63  <Method String a.d()>
	//   25   59:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   26   64:pop             
		StringBuilder stringbuilder = new StringBuilder();
	//   27   65:new             #65  <Class StringBuilder>
	//   28   68:dup             
	//   29   69:invokespecial   #66  <Method void StringBuilder()>
	//   30   72:astore_3        
		stringbuilder.append(ec.a);
	//   31   73:aload_3         
	//   32   74:getstatic       #71  <Field String ec.a>
	//   33   77:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   34   80:pop             
		stringbuilder.append(" ");
	//   35   81:aload_3         
	//   36   82:ldc1            #77  <String " ">
	//   37   84:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   38   87:pop             
		stringbuilder.append(ec.c);
	//   39   88:aload_3         
	//   40   89:getstatic       #79  <Field String ec.c>
	//   41   92:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   42   95:pop             
		map.put("v52", ((Object) (stringbuilder.toString())));
	//   43   96:aload_2         
	//   44   97:ldc1            #81  <String "v52">
	//   45   99:aload_3         
	//   46  100:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   47  103:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   48  108:pop             
		map.put("v53", ((Object) (ec.d)));
	//   49  109:aload_2         
	//   50  110:ldc1            #86  <String "v53">
	//   51  112:getstatic       #88  <Field String ec.d>
	//   52  115:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   53  120:pop             
		map.put("clid", ((Object) (b().b())));
	//   54  121:aload_2         
	//   55  122:ldc1            #90  <String "clid">
	//   56  124:aload_0         
	//   57  125:invokevirtual   #23  <Method bl b()>
	//   58  128:invokevirtual   #92  <Method String bl.b()>
	//   59  131:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   60  136:pop             
		stringbuilder = new StringBuilder();
	//   61  137:new             #65  <Class StringBuilder>
	//   62  140:dup             
	//   63  141:invokespecial   #66  <Method void StringBuilder()>
	//   64  144:astore_3        
		stringbuilder.append(b().c().d().c());
	//   65  145:aload_3         
	//   66  146:aload_0         
	//   67  147:invokevirtual   #23  <Method bl b()>
	//   68  150:invokevirtual   #53  <Method av bl.c()>
	//   69  153:invokevirtual   #59  <Method a av.d()>
	//   70  156:invokevirtual   #94  <Method String a.c()>
	//   71  159:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   72  162:pop             
		stringbuilder.append("|");
	//   73  163:aload_3         
	//   74  164:ldc1            #96  <String "|">
	//   75  166:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   76  169:pop             
		stringbuilder.append(s);
	//   77  170:aload_3         
	//   78  171:aload_1         
	//   79  172:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   80  175:pop             
		stringbuilder.append("|");
	//   81  176:aload_3         
	//   82  177:ldc1            #96  <String "|">
	//   83  179:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   84  182:pop             
		stringbuilder.append(b().f());
	//   85  183:aload_3         
	//   86  184:aload_0         
	//   87  185:invokevirtual   #23  <Method bl b()>
	//   88  188:invokevirtual   #99  <Method String bl.f()>
	//   89  191:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   90  194:pop             
		map.put("apid", ((Object) (stringbuilder.toString())));
	//   91  195:aload_2         
	//   92  196:ldc1            #101 <String "apid">
	//   93  198:aload_3         
	//   94  199:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   95  202:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   96  207:pop             
		s = ((String) (new ay(b().a().a.c(), map)));
	//   97  208:new             #103 <Class ay>
	//   98  211:dup             
	//   99  212:aload_0         
	//  100  213:invokevirtual   #23  <Method bl b()>
	//  101  216:invokevirtual   #26  <Method ck com.paypal.android.sdk.payments.bl.a()>
	//  102  219:getfield        #31  <Field ey ck.a>
	//  103  222:invokevirtual   #104 <Method String ey.c()>
	//  104  225:aload_2         
	//  105  226:invokespecial   #106 <Method void ay(String, Map)>
	//  106  229:astore_1        
		b().a(((ay) (s)));
	//  107  230:aload_0         
	//  108  231:invokevirtual   #23  <Method bl b()>
	//  109  234:aload_1         
	//  110  235:invokevirtual   #109 <Method void com.paypal.android.sdk.payments.bl.a(ay)>
	//  111  238:return          
	}

	protected final void a(Map map, ed ed1, String s, String s1)
	{
		map.put("g", ((Object) (b().e())));
	//    0    0:aload_1         
	//    1    1:ldc1            #112 <String "g">
	//    2    3:aload_0         
	//    3    4:invokevirtual   #23  <Method bl b()>
	//    4    7:invokevirtual   #115 <Method String bl.e()>
	//    5   10:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//    6   15:pop             
		StringBuilder stringbuilder = new StringBuilder();
	//    7   16:new             #65  <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #66  <Method void StringBuilder()>
	//   10   23:astore          5
		stringbuilder.append(ec.a);
	//   11   25:aload           5
	//   12   27:getstatic       #71  <Field String ec.a>
	//   13   30:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   14   33:pop             
		stringbuilder.append(":");
	//   15   34:aload           5
	//   16   36:ldc1            #117 <String ":">
	//   17   38:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
		stringbuilder.append(b().d());
	//   19   42:aload           5
	//   20   44:aload_0         
	//   21   45:invokevirtual   #23  <Method bl b()>
	//   22   48:invokevirtual   #118 <Method String bl.d()>
	//   23   51:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   24   54:pop             
		stringbuilder.append(":");
	//   25   55:aload           5
	//   26   57:ldc1            #117 <String ":">
	//   27   59:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   28   62:pop             
		map.put("vers", ((Object) (stringbuilder.toString())));
	//   29   63:aload_1         
	//   30   64:ldc1            #120 <String "vers">
	//   31   66:aload           5
	//   32   68:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   33   71:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   34   76:pop             
		map.put("srce", "msdk");
	//   35   77:aload_1         
	//   36   78:ldc1            #122 <String "srce">
	//   37   80:ldc1            #18  <String "msdk">
	//   38   82:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   39   87:pop             
		map.put("sv", "mobile");
	//   40   88:aload_1         
	//   41   89:ldc1            #124 <String "sv">
	//   42   91:ldc1            #126 <String "mobile">
	//   43   93:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   44   98:pop             
		map.put("bchn", "msdk");
	//   45   99:aload_1         
	//   46  100:ldc1            #128 <String "bchn">
	//   47  102:ldc1            #18  <String "msdk">
	//   48  104:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   49  109:pop             
		map.put("adte", "FALSE");
	//   50  110:aload_1         
	//   51  111:ldc1            #130 <String "adte">
	//   52  113:ldc1            #132 <String "FALSE">
	//   53  115:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   54  120:pop             
		map.put("bzsr", "mobile");
	//   55  121:aload_1         
	//   56  122:ldc1            #134 <String "bzsr">
	//   57  124:ldc1            #126 <String "mobile">
	//   58  126:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   59  131:pop             
		if(cd.b(((CharSequence) (s))))
	//*  60  132:aload_3         
	//*  61  133:invokestatic    #139 <Method boolean cd.b(CharSequence)>
	//*  62  136:ifeq            149
			map.put("calc", ((Object) (s)));
	//   63  139:aload_1         
	//   64  140:ldc1            #141 <String "calc">
	//   65  142:aload_3         
	//   66  143:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   67  148:pop             
		if(cd.b(((CharSequence) (s1))))
	//*  68  149:aload           4
	//*  69  151:invokestatic    #139 <Method boolean cd.b(CharSequence)>
	//*  70  154:ifeq            168
			map.put("prid", ((Object) (s1)));
	//   71  157:aload_1         
	//   72  158:ldc1            #143 <String "prid">
	//   73  160:aload           4
	//   74  162:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   75  167:pop             
		if(ed1.b())
	//*  76  168:aload_2         
	//*  77  169:invokevirtual   #146 <Method boolean ed.b()>
	//*  78  172:ifeq            181
			ed1 = "cl";
	//   79  175:ldc1            #148 <String "cl">
	//   80  177:astore_2        
		else
	//*  81  178:goto            184
			ed1 = "im";
	//   82  181:ldc1            #150 <String "im">
	//   83  183:astore_2        
		map.put("e", ((Object) (ed1)));
	//   84  184:aload_1         
	//   85  185:ldc1            #151 <String "e">
	//   86  187:aload_2         
	//   87  188:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   88  193:pop             
	//   89  194:return          
	}
}
