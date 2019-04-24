// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

// Referenced classes of package o:
//			hj, hu, gn

public final class gm
{

	public gm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		c = 3500;
	//    2    4:aload_0         
	//    3    5:sipush          3500
	//    4    8:putfield        #16  <Field int c>
		d = "http://h5.m.taobao.com/trade/paySuccess.html?bizOrderId=$OrderId$&";
	//    5   11:aload_0         
	//    6   12:ldc1            #18  <String "http://h5.m.taobao.com/trade/paySuccess.html?bizOrderId=$OrderId$&">
	//    7   14:putfield        #20  <Field String d>
	//    8   17:return          
	}

	public static gm e()
	{
		if(e == null)
	//*   0    0:getstatic       #26  <Field gm e>
	//*   1    3:ifnonnull       75
		{
			gm gm1 = new gm();
	//    2    6:new             #2   <Class gm>
	//    3    9:dup             
	//    4   10:invokespecial   #27  <Method void gm()>
	//    5   13:astore_0        
			e = gm1;
	//    6   14:aload_0         
	//    7   15:putstatic       #26  <Field gm e>
			Object obj = ((Object) (hu.a(hj.d().c, "alipay_cashier_dynamic_config", ((String) (null)))));
	//    8   18:invokestatic    #32  <Method hj hj.d()>
	//    9   21:getfield        #35  <Field Context hj.c>
	//   10   24:ldc1            #37  <String "alipay_cashier_dynamic_config">
	//   11   26:aconst_null     
	//   12   27:invokestatic    #43  <Method String hu.a(Context, String, String)>
	//   13   30:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*  14   31:aload_1         
	//*  15   32:invokestatic    #49  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   35:ifne            75
				try
				{
					obj = ((Object) (new JSONObject(((String) (obj)))));
	//   17   38:new             #51  <Class JSONObject>
	//   18   41:dup             
	//   19   42:aload_1         
	//   20   43:invokespecial   #54  <Method void JSONObject(String)>
	//   21   46:astore_1        
					gm1.c = ((JSONObject) (obj)).optInt("timeout", 3500);
	//   22   47:aload_0         
	//   23   48:aload_1         
	//   24   49:ldc1            #56  <String "timeout">
	//   25   51:sipush          3500
	//   26   54:invokevirtual   #60  <Method int JSONObject.optInt(String, int)>
	//   27   57:putfield        #16  <Field int c>
					gm1.d = ((JSONObject) (obj)).optString("tbreturl", "http://h5.m.taobao.com/trade/paySuccess.html?bizOrderId=$OrderId$&").trim();
	//   28   60:aload_0         
	//   29   61:aload_1         
	//   30   62:ldc1            #62  <String "tbreturl">
	//   31   64:ldc1            #18  <String "http://h5.m.taobao.com/trade/paySuccess.html?bizOrderId=$OrderId$&">
	//   32   66:invokevirtual   #66  <Method String JSONObject.optString(String, String)>
	//   33   69:invokevirtual   #72  <Method String String.trim()>
	//   34   72:putfield        #20  <Field String d>
				}
	//*  35   75:getstatic       #26  <Field gm e>
	//*  36   78:areturn         
				catch(Throwable throwable) { }
	//   37   79:astore_0        
		}
		return e;
	//*  38   80:goto            75
	}

	public final int c()
	{
		if(c < 1000 || c > 20000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field int c>
	//*   2    4:sipush          1000
	//*   3    7:icmplt          20
	//*   4   10:aload_0         
	//*   5   11:getfield        #16  <Field int c>
	//*   6   14:sipush          20000
	//*   7   17:icmple          24
		{
			return 3500;
	//    8   20:sipush          3500
	//    9   23:ireturn         
		} else
		{
			(new StringBuilder("DynamicConfig::getJumpTimeout >")).append(c);
	//   10   24:new             #75  <Class StringBuilder>
	//   11   27:dup             
	//   12   28:ldc1            #77  <String "DynamicConfig::getJumpTimeout >">
	//   13   30:invokespecial   #78  <Method void StringBuilder(String)>
	//   14   33:aload_0         
	//   15   34:getfield        #16  <Field int c>
	//   16   37:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   17   40:pop             
			return c;
	//   18   41:aload_0         
	//   19   42:getfield        #16  <Field int c>
	//   20   45:ireturn         
		}
	}

	public final void e(Context context)
	{
		(new Thread(((Runnable) (new gn(this, context))))).start();
	//    0    0:new             #85  <Class Thread>
	//    1    3:dup             
	//    2    4:new             #87  <Class gn>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #90  <Method void gn(gm, Context)>
	//    7   13:invokespecial   #93  <Method void Thread(Runnable)>
	//    8   16:invokevirtual   #96  <Method void Thread.start()>
	//    9   19:return          
	}

	private static gm e;
	int c;
	public String d;
}
