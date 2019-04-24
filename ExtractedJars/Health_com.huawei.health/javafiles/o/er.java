// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.util.Map;

// Referenced classes of package o:
//			es, id, ei

public final class er
{

	public static es e(id id1)
	{
		es es1 = new es();
	//    0    0:new             #8   <Class es>
	//    1    3:dup             
	//    2    4:invokespecial   #12  <Method void es()>
	//    3    7:astore_1        
		if(id1 == null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		es1.d = id1.c;
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #18  <Field boolean id.c>
	//   11   19:putfield        #21  <Field boolean es.d>
		es1.a = id1.d;
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #24  <Field String id.d>
	//   15   27:putfield        #27  <Field String es.a>
		id1 = ((id) (id1.e));
	//   16   30:aload_0         
	//   17   31:getfield        #30  <Field Map id.e>
	//   18   34:astore_0        
		if(id1 != null)
	//*  19   35:aload_0         
	//*  20   36:ifnull          224
		{
			es1.e = (String)((Map) (id1)).get("apdid");
	//   21   39:aload_1         
	//   22   40:aload_0         
	//   23   41:ldc1            #32  <String "apdid">
	//   24   43:invokeinterface #38  <Method Object Map.get(Object)>
	//   25   48:checkcast       #40  <Class String>
	//   26   51:putfield        #42  <Field String es.e>
			es1.c = (String)((Map) (id1)).get("apdidToken");
	//   27   54:aload_1         
	//   28   55:aload_0         
	//   29   56:ldc1            #44  <String "apdidToken">
	//   30   58:invokeinterface #38  <Method Object Map.get(Object)>
	//   31   63:checkcast       #40  <Class String>
	//   32   66:putfield        #46  <Field String es.c>
			es1.h = (String)((Map) (id1)).get("dynamicKey");
	//   33   69:aload_1         
	//   34   70:aload_0         
	//   35   71:ldc1            #48  <String "dynamicKey">
	//   36   73:invokeinterface #38  <Method Object Map.get(Object)>
	//   37   78:checkcast       #40  <Class String>
	//   38   81:putfield        #51  <Field String es.h>
			es1.g = (String)((Map) (id1)).get("timeInterval");
	//   39   84:aload_1         
	//   40   85:aload_0         
	//   41   86:ldc1            #53  <String "timeInterval">
	//   42   88:invokeinterface #38  <Method Object Map.get(Object)>
	//   43   93:checkcast       #40  <Class String>
	//   44   96:putfield        #56  <Field String es.g>
			es1.k = (String)((Map) (id1)).get("webrtcUrl");
	//   45   99:aload_1         
	//   46  100:aload_0         
	//   47  101:ldc1            #58  <String "webrtcUrl">
	//   48  103:invokeinterface #38  <Method Object Map.get(Object)>
	//   49  108:checkcast       #40  <Class String>
	//   50  111:putfield        #61  <Field String es.k>
			es1.i = "";
	//   51  114:aload_1         
	//   52  115:ldc1            #63  <String "">
	//   53  117:putfield        #66  <Field String es.i>
			String s = (String)((Map) (id1)).get("drmSwitch");
	//   54  120:aload_0         
	//   55  121:ldc1            #68  <String "drmSwitch">
	//   56  123:invokeinterface #38  <Method Object Map.get(Object)>
	//   57  128:checkcast       #40  <Class String>
	//   58  131:astore_2        
			if(ei.a(s))
	//*  59  132:aload_2         
	//*  60  133:invokestatic    #73  <Method boolean ei.a(String)>
	//*  61  136:ifeq            198
			{
				if(s.length() > 0)
	//*  62  139:aload_2         
	//*  63  140:invokevirtual   #77  <Method int String.length()>
	//*  64  143:ifle            168
					es1.b = (new StringBuilder()).append(s.charAt(0)).toString();
	//   65  146:aload_1         
	//   66  147:new             #79  <Class StringBuilder>
	//   67  150:dup             
	//   68  151:invokespecial   #80  <Method void StringBuilder()>
	//   69  154:aload_2         
	//   70  155:iconst_0        
	//   71  156:invokevirtual   #84  <Method char String.charAt(int)>
	//   72  159:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   73  162:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   74  165:putfield        #95  <Field String es.b>
				if(s.length() >= 3)
	//*  75  168:aload_2         
	//*  76  169:invokevirtual   #77  <Method int String.length()>
	//*  77  172:iconst_3        
	//*  78  173:icmplt          198
					es1.f = (new StringBuilder()).append(s.charAt(2)).toString();
	//   79  176:aload_1         
	//   80  177:new             #79  <Class StringBuilder>
	//   81  180:dup             
	//   82  181:invokespecial   #80  <Method void StringBuilder()>
	//   83  184:aload_2         
	//   84  185:iconst_2        
	//   85  186:invokevirtual   #84  <Method char String.charAt(int)>
	//   86  189:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   87  192:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   88  195:putfield        #98  <Field String es.f>
			}
			if(((Map) (id1)).containsKey("apse_degrade"))
	//*  89  198:aload_0         
	//*  90  199:ldc1            #100 <String "apse_degrade">
	//*  91  201:invokeinterface #104 <Method boolean Map.containsKey(Object)>
	//*  92  206:ifeq            224
				es1.n = (String)((Map) (id1)).get("apse_degrade");
	//   93  209:aload_1         
	//   94  210:aload_0         
	//   95  211:ldc1            #100 <String "apse_degrade">
	//   96  213:invokeinterface #38  <Method Object Map.get(Object)>
	//   97  218:checkcast       #40  <Class String>
	//   98  221:putfield        #107 <Field String es.n>
		}
		return es1;
	//   99  224:aload_1         
	//  100  225:areturn         
	}
}
