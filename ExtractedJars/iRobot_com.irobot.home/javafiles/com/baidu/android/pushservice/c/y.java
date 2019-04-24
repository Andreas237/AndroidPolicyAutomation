// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.c;

import android.content.Context;
import com.baidu.android.pushservice.config.ModeConfig;
import com.baidu.android.pushservice.e.a;
import java.util.HashMap;
import org.androidannotations.api.a.c;

// Referenced classes of package com.baidu.android.pushservice.c:
//			d, b, l, y, 
//			x

public class y extends d
{
	private static final class a extends c
	{

		public x a()
		{
			y y1 = new y();
		//    0    0:new             #7   <Class y>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void y()>
		//    3    7:astore_1        
			y1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field android.os.Bundle a>
		//    7   13:invokevirtual   #22  <Method void y.setArguments(android.os.Bundle)>
			return ((x) (y1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void c()>
		//    2    4:return          
		}
	}


	public y(l l, Context context)
	{
		super(l, context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void d(l, Context)>
	//    4    6:return          
	}

	protected void a(HashMap hashmap)
	{
		int i;
		int j;
		super.a(hashmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void com.baidu.android.pushservice.c.d.a(HashMap)>
		hashmap.put("method", "unbind");
	//    3    5:aload_1         
	//    4    6:ldc1            #17  <String "method">
	//    5    8:ldc1            #19  <String "unbind">
	//    6   10:invokevirtual   #25  <Method Object HashMap.put(Object, Object)>
	//    7   13:pop             
		i = com.baidu.android.pushservice.c.a.a(com.baidu.android.pushservice.c.a.a);
	//    8   14:getstatic       #28  <Field y$a com.baidu.android.pushservice.c.y$a.a>
	//    9   17:invokestatic    #31  <Method int com.baidu.android.pushservice.c.y$a.a(y$a)>
	//   10   20:istore_2        
		j = ModeConfig.getInstance(a).getCurrentMode();
	//   11   21:aload_0         
	//   12   22:getfield        #34  <Field Context a>
	//   13   25:invokestatic    #40  <Method ModeConfig ModeConfig.getInstance(Context)>
	//   14   28:invokevirtual   #44  <Method int ModeConfig.getCurrentMode()>
	//   15   31:istore_3        
		if(!ModeConfig.isHuaweiProxyMode(a)) goto _L2; else goto _L1
	//   16   32:aload_0         
	//   17   33:getfield        #34  <Field Context a>
	//   18   36:invokestatic    #48  <Method boolean ModeConfig.isHuaweiProxyMode(Context)>
	//   19   39:ifeq            56
_L1:
		a a1 = com.baidu.android.pushservice.c.a.c;
	//   20   42:getstatic       #51  <Field y$a com.baidu.android.pushservice.c.y$a.c>
	//   21   45:astore          4
_L4:
		i = com.baidu.android.pushservice.c.a.a(a1);
	//   22   47:aload           4
	//   23   49:invokestatic    #31  <Method int com.baidu.android.pushservice.c.y$a.a(y$a)>
	//   24   52:istore_2        
		break; /* Loop/switch isn't completed */
	//   25   53:goto            103
_L2:
		if(ModeConfig.isXiaomiProxyMode(a))
	//*  26   56:aload_0         
	//*  27   57:getfield        #34  <Field Context a>
	//*  28   60:invokestatic    #54  <Method boolean ModeConfig.isXiaomiProxyMode(Context)>
	//*  29   63:ifeq            74
		{
			a1 = a.d;
	//   30   66:getstatic       #57  <Field y$a y$a.d>
	//   31   69:astore          4
			continue; /* Loop/switch isn't completed */
	//   32   71:goto            47
		}
		if(j != ModeConfig.MODE_C && j != ModeConfig.MODE_C_C && j != ModeConfig.MODE_C_H)
			break; /* Loop/switch isn't completed */
	//   33   74:iload_3         
	//   34   75:getstatic       #61  <Field int ModeConfig.MODE_C>
	//   35   78:icmpeq          95
	//   36   81:iload_3         
	//   37   82:getstatic       #64  <Field int ModeConfig.MODE_C_C>
	//   38   85:icmpeq          95
	//   39   88:iload_3         
	//   40   89:getstatic       #67  <Field int ModeConfig.MODE_C_H>
	//   41   92:icmpne          103
		a1 = a.b;
	//   42   95:getstatic       #70  <Field y$a y$a.b>
	//   43   98:astore          4
		if(true) goto _L4; else goto _L3
	//   44  100:goto            47
_L3:
		StringBuilder stringbuilder = new StringBuilder();
	//   45  103:new             #72  <Class StringBuilder>
	//   46  106:dup             
	//   47  107:invokespecial   #75  <Method void StringBuilder()>
	//   48  110:astore          4
		stringbuilder.append(i);
	//   49  112:aload           4
	//   50  114:iload_2         
	//   51  115:invokevirtual   #79  <Method StringBuilder StringBuilder.append(int)>
	//   52  118:pop             
		stringbuilder.append("");
	//   53  119:aload           4
	//   54  121:ldc1            #81  <String "">
	//   55  123:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   56  126:pop             
		hashmap.put("model", ((Object) (stringbuilder.toString())));
	//   57  127:aload_1         
	//   58  128:ldc1            #86  <String "model">
	//   59  130:aload           4
	//   60  132:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   61  135:invokevirtual   #25  <Method Object HashMap.put(Object, Object)>
	//   62  138:pop             
		stringbuilder = new StringBuilder();
	//   63  139:new             #72  <Class StringBuilder>
	//   64  142:dup             
	//   65  143:invokespecial   #75  <Method void StringBuilder()>
	//   66  146:astore          4
		stringbuilder.append("UNBIND param -- ");
	//   67  148:aload           4
	//   68  150:ldc1            #92  <String "UNBIND param -- ">
	//   69  152:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   70  155:pop             
		stringbuilder.append(com.baidu.android.pushservice.c.b.a(hashmap));
	//   71  156:aload           4
	//   72  158:aload_1         
	//   73  159:invokestatic    #97  <Method String com.baidu.android.pushservice.c.b.a(HashMap)>
	//   74  162:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   75  165:pop             
		com.baidu.android.pushservice.e.a.c("Unbind", stringbuilder.toString());
	//   76  166:ldc1            #99  <String "Unbind">
	//   77  168:aload           4
	//   78  170:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   79  173:invokestatic    #104 <Method void a.c(String, String)>
		return;
	//   80  176:return          
	}
}
