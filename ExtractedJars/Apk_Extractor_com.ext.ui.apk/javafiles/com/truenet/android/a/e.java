// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.ae;

// Referenced classes of package com.truenet.android.a:
//			h, d

public final class e
{

	public e(Context context)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		ae.b(((Object) (context)), "context");
	//    2    2:aload_1         
	//    3    3:ldc1            #20  <String "context">
	//    4    5:invokestatic    #25  <Method void ae.b(Object, String)>
		super();
	//    5    8:aload_0         
	//    6    9:invokespecial   #28  <Method void Object()>
		f = context;
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:putfield        #30  <Field Context f>
		boolean flag;
		if(h.a(f, "android.permission.ACCESS_NETWORK_STATE"))
	//*  10   17:aload_0         
	//*  11   18:getfield        #30  <Field Context f>
	//*  12   21:ldc1            #32  <String "android.permission.ACCESS_NETWORK_STATE">
	//*  13   23:invokestatic    #37  <Method boolean h.a(Context, String)>
	//*  14   26:ifeq            156
			context = ((Context) (com.truenet.android.a.d.a(f).getActiveNetworkInfo()));
	//   15   29:aload_0         
	//   16   30:getfield        #30  <Field Context f>
	//   17   33:invokestatic    #42  <Method ConnectivityManager d.a(Context)>
	//   18   36:invokevirtual   #48  <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//   19   39:astore_1        
		else
	//*  20   40:aload_0         
	//*  21   41:aload_1         
	//*  22   42:putfield        #50  <Field NetworkInfo a>
	//*  23   45:aload_0         
	//*  24   46:getfield        #50  <Field NetworkInfo a>
	//*  25   49:astore_1        
	//*  26   50:aload_1         
	//*  27   51:ifnull          161
	//*  28   54:aload_1         
	//*  29   55:invokevirtual   #56  <Method boolean NetworkInfo.isConnected()>
	//*  30   58:istore_2        
	//*  31   59:aload_0         
	//*  32   60:iload_2         
	//*  33   61:putfield        #58  <Field boolean b>
	//*  34   64:aload_0         
	//*  35   65:getfield        #50  <Field NetworkInfo a>
	//*  36   68:astore_1        
	//*  37   69:aload_1         
	//*  38   70:ifnull          171
	//*  39   73:aload_0         
	//*  40   74:getfield        #58  <Field boolean b>
	//*  41   77:ifeq            166
	//*  42   80:aload_1         
	//*  43   81:invokevirtual   #62  <Method int NetworkInfo.getType()>
	//*  44   84:iconst_1        
	//*  45   85:icmpne          166
	//*  46   88:iconst_1        
	//*  47   89:istore_2        
	//*  48   90:aload_0         
	//*  49   91:iload_2         
	//*  50   92:putfield        #64  <Field boolean c>
	//*  51   95:aload_0         
	//*  52   96:getfield        #50  <Field NetworkInfo a>
	//*  53   99:astore_1        
	//*  54  100:aload_1         
	//*  55  101:ifnull          181
	//*  56  104:aload_0         
	//*  57  105:getfield        #58  <Field boolean b>
	//*  58  108:ifeq            176
	//*  59  111:aload_1         
	//*  60  112:invokevirtual   #62  <Method int NetworkInfo.getType()>
	//*  61  115:ifne            176
	//*  62  118:iload_3         
	//*  63  119:istore_2        
	//*  64  120:aload_0         
	//*  65  121:iload_2         
	//*  66  122:putfield        #66  <Field boolean d>
	//*  67  125:aload_0         
	//*  68  126:getfield        #66  <Field boolean d>
	//*  69  129:ifeq            192
	//*  70  132:aload_0         
	//*  71  133:getfield        #50  <Field NetworkInfo a>
	//*  72  136:astore_1        
	//*  73  137:aload_1         
	//*  74  138:ifnull          186
	//*  75  141:aload_1         
	//*  76  142:invokevirtual   #70  <Method String NetworkInfo.getSubtypeName()>
	//*  77  145:astore_1        
	//*  78  146:aload_1         
	//*  79  147:ifnull          186
	//*  80  150:aload_0         
	//*  81  151:aload_1         
	//*  82  152:putfield        #72  <Field String e>
	//*  83  155:return          
			context = null;
	//   84  156:aconst_null     
	//   85  157:astore_1        
		a = ((NetworkInfo) (context));
		context = ((Context) (a));
		if(context != null)
			flag = ((NetworkInfo) (context)).isConnected();
		else
	//*  86  158:goto            40
			flag = false;
	//   87  161:iconst_0        
	//   88  162:istore_2        
		b = flag;
		context = ((Context) (a));
		if(context != null)
		{
			if(b && ((NetworkInfo) (context)).getType() == 1)
				flag = true;
			else
	//*  89  163:goto            59
				flag = false;
	//   90  166:iconst_0        
	//   91  167:istore_2        
		} else
	//*  92  168:goto            90
		{
			flag = false;
	//   93  171:iconst_0        
	//   94  172:istore_2        
		}
		c = flag;
		context = ((Context) (a));
		if(context != null)
		{
			if(b && ((NetworkInfo) (context)).getType() == 0)
				flag = flag1;
			else
	//*  95  173:goto            90
				flag = false;
	//   96  176:iconst_0        
	//   97  177:istore_2        
		} else
	//*  98  178:goto            120
		{
			flag = false;
	//   99  181:iconst_0        
	//  100  182:istore_2        
		}
		d = flag;
		if(!d) goto _L2; else goto _L1
_L1:
		context = ((Context) (a));
		if(context == null) goto _L4; else goto _L3
_L3:
		context = ((Context) (((NetworkInfo) (context)).getSubtypeName()));
		if(context == null) goto _L4; else goto _L5
_L5:
		e = ((String) (context));
		return;
	//* 101  183:goto            120
_L4:
		context = "";
	//  102  186:ldc1            #74  <String "">
	//  103  188:astore_1        
		continue; /* Loop/switch isn't completed */
	//  104  189:goto            150
_L2:
		if(c)
	//* 105  192:aload_0         
	//* 106  193:getfield        #64  <Field boolean c>
	//* 107  196:ifeq            228
		{
			context = ((Context) (a));
	//  108  199:aload_0         
	//  109  200:getfield        #50  <Field NetworkInfo a>
	//  110  203:astore_1        
			if(context != null)
	//* 111  204:aload_1         
	//* 112  205:ifnull          222
			{
				String s = ((NetworkInfo) (context)).getTypeName();
	//  113  208:aload_1         
	//  114  209:invokevirtual   #77  <Method String NetworkInfo.getTypeName()>
	//  115  212:astore          4
				context = ((Context) (s));
	//  116  214:aload           4
	//  117  216:astore_1        
				if(s != null)
					continue; /* Loop/switch isn't completed */
	//  118  217:aload           4
	//  119  219:ifnonnull       150
			}
			context = "";
	//  120  222:ldc1            #74  <String "">
	//  121  224:astore_1        
		} else
	//* 122  225:goto            150
		{
			context = "";
	//  123  228:ldc1            #74  <String "">
	//  124  230:astore_1        
		}
		if(true) goto _L5; else goto _L6
	//  125  231:goto            150
_L6:
	}

	public final String a()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field String e>
	//    2    4:areturn         
	}

	private final NetworkInfo a;
	private final boolean b;
	private final boolean c;
	private final boolean d;
	private final String e;
	private final Context f;
}
