// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.Map;

// Referenced classes of package com.amap.api.mapcore.util:
//			gt, je, jd, hm

static final class gt$1
	implements Runnable
{

	public void run()
	{
		Map map = (Map)a.getMethod("getGetParams", new Class[0]).invoke(((Object) (a)), new Object[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Class a>
	//    2    4:ldc1            #29  <String "getGetParams">
	//    3    6:iconst_0        
	//    4    7:anewarray       Class[]
	//    5   10:invokevirtual   #35  <Method Method Class.getMethod(String, Class[])>
	//    6   13:aload_0         
	//    7   14:getfield        #18  <Field Class a>
	//    8   17:iconst_0        
	//    9   18:anewarray       Object[]
	//   10   21:invokevirtual   #41  <Method Object Method.invoke(Object, Object[])>
	//   11   24:checkcast       #43  <Class Map>
	//   12   27:astore_2        
		if(map == null)
	//*  13   28:aload_2         
	//*  14   29:ifnonnull       33
			return;
	//   15   32:return          
		boolean flag;
		String s;
		s = (String)a.getMethod("getPostParam", new Class[] {
			java/lang/String, java/lang/String, java/lang/String, java/lang/String
		}).invoke(((Object) (a)), new Object[] {
			gt.h(b), gt.t(b), gt.l(b), gt.u(b)
		});
	//   16   33:aload_0         
	//   17   34:getfield        #18  <Field Class a>
	//   18   37:ldc1            #45  <String "getPostParam">
	//   19   39:iconst_4        
	//   20   40:anewarray       Class[]
	//   21   43:dup             
	//   22   44:iconst_0        
	//   23   45:ldc1            #47  <Class String>
	//   24   47:aastore         
	//   25   48:dup             
	//   26   49:iconst_1        
	//   27   50:ldc1            #47  <Class String>
	//   28   52:aastore         
	//   29   53:dup             
	//   30   54:iconst_2        
	//   31   55:ldc1            #47  <Class String>
	//   32   57:aastore         
	//   33   58:dup             
	//   34   59:iconst_3        
	//   35   60:ldc1            #47  <Class String>
	//   36   62:aastore         
	//   37   63:invokevirtual   #35  <Method Method Class.getMethod(String, Class[])>
	//   38   66:aload_0         
	//   39   67:getfield        #18  <Field Class a>
	//   40   70:iconst_4        
	//   41   71:anewarray       Object[]
	//   42   74:dup             
	//   43   75:iconst_0        
	//   44   76:aload_0         
	//   45   77:getfield        #20  <Field Context b>
	//   46   80:invokestatic    #50  <Method String gt.h(Context)>
	//   47   83:aastore         
	//   48   84:dup             
	//   49   85:iconst_1        
	//   50   86:aload_0         
	//   51   87:getfield        #20  <Field Context b>
	//   52   90:invokestatic    #53  <Method String gt.t(Context)>
	//   53   93:aastore         
	//   54   94:dup             
	//   55   95:iconst_2        
	//   56   96:aload_0         
	//   57   97:getfield        #20  <Field Context b>
	//   58  100:invokestatic    #56  <Method String gt.l(Context)>
	//   59  103:aastore         
	//   60  104:dup             
	//   61  105:iconst_3        
	//   62  106:aload_0         
	//   63  107:getfield        #20  <Field Context b>
	//   64  110:invokestatic    #59  <Method String gt.u(Context)>
	//   65  113:aastore         
	//   66  114:invokevirtual   #41  <Method Object Method.invoke(Object, Object[])>
	//   67  117:checkcast       #47  <Class String>
	//   68  120:astore_3        
		flag = TextUtils.isEmpty(((CharSequence) (s)));
	//   69  121:aload_3         
	//   70  122:invokestatic    #65  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   71  125:istore_1        
		if(flag)
	//*  72  126:iload_1         
	//*  73  127:ifeq            131
			return;
	//   74  130:return          
		try
		{
			byte abyte0[] = je.a().a(((jj) (new jd(s.getBytes(), map))));
	//   75  131:invokestatic    #70  <Method je je.a()>
	//   76  134:new             #72  <Class jd>
	//   77  137:dup             
	//   78  138:aload_3         
	//   79  139:invokevirtual   #76  <Method byte[] String.getBytes()>
	//   80  142:aload_2         
	//   81  143:invokespecial   #79  <Method void jd(byte[], Map)>
	//   82  146:invokevirtual   #82  <Method byte[] je.a(jj)>
	//   83  149:astore_2        
			a.getMethod("parseResult", new Class[] {
				android/content/Context, java/lang/String
			}).invoke(((Object) (a)), new Object[] {
				b, new String(abyte0)
			});
	//   84  150:aload_0         
	//   85  151:getfield        #18  <Field Class a>
	//   86  154:ldc1            #84  <String "parseResult">
	//   87  156:iconst_2        
	//   88  157:anewarray       Class[]
	//   89  160:dup             
	//   90  161:iconst_0        
	//   91  162:ldc1            #86  <Class Context>
	//   92  164:aastore         
	//   93  165:dup             
	//   94  166:iconst_1        
	//   95  167:ldc1            #47  <Class String>
	//   96  169:aastore         
	//   97  170:invokevirtual   #35  <Method Method Class.getMethod(String, Class[])>
	//   98  173:aload_0         
	//   99  174:getfield        #18  <Field Class a>
	//  100  177:iconst_2        
	//  101  178:anewarray       Object[]
	//  102  181:dup             
	//  103  182:iconst_0        
	//  104  183:aload_0         
	//  105  184:getfield        #20  <Field Context b>
	//  106  187:aastore         
	//  107  188:dup             
	//  108  189:iconst_1        
	//  109  190:new             #47  <Class String>
	//  110  193:dup             
	//  111  194:aload_2         
	//  112  195:invokespecial   #89  <Method void String(byte[])>
	//  113  198:aastore         
	//  114  199:invokevirtual   #41  <Method Object Method.invoke(Object, Object[])>
	//  115  202:pop             
			return;
	//  116  203:return          
		}
		catch(Throwable throwable)
	//* 117  204:astore_2        
		{
			hm.c(throwable, "dI", "aiun");
	//  118  205:aload_2         
	//  119  206:ldc1            #91  <String "dI">
	//  120  208:ldc1            #93  <String "aiun">
	//  121  210:invokestatic    #99  <Method void hm.c(Throwable, String, String)>
		}
		return;
	//  122  213:return          
	}

	final Class a;
	final Context b;

	gt$1(Class class1, Context context)
	{
		a = class1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Class a>
		b = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field Context b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
